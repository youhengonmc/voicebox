package com.youhengonmc.voiceblock.block;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.electronwill.nightconfig.core.CommentedConfig;
import com.electronwill.nightconfig.core.file.FileConfig;
import com.electronwill.nightconfig.toml.TomlParser;
import com.youhengonmc.tts.AbstractTTSService;
import com.youhengonmc.tts.GoogleCloudTTS;
import com.youhengonmc.tts.GoogleTranslateTTS;
import com.youhengonmc.tts.VoicePlayer;
import com.youhengonmc.voiceblock.tileentity.ModTileEntities;
import com.youhengonmc.voiceblock.tileentity.VoiceTileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.loading.FMLPaths;

//@Mod.EventBusSubscriber(modid = VoiceBlockMod.MOD_ID)
public class VoiceBlock extends Block {
  
  private static final Logger LOGGER = LogManager.getLogger();
  
  private static final String TTS_CONF_FILE = "/tts.toml";
  private static final String MOD_CONFIG_FILE = "voicebox.toml";
  
  public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
  
  private CommentedConfig ttsConfiguration = null;
  
  public VoiceBlock() {
    super(Block.Properties.create(Material.ROCK));  
  }
  
  @Override
  public boolean hasTileEntity(final BlockState state) {
    return true;
  }
  
  @Override
  public TileEntity createTileEntity(final BlockState state, final IBlockReader world) {
    return ModTileEntities.VOICE_BLOCK_TILE_ENTITY.get().create();
  }  

  public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
    boolean flag = worldIn.isBlockPowered(pos);
    LOGGER.info("Voice Block neighborChanged, block powered =" + flag);

    boolean poweredState = (Boolean)state.get(POWERED).booleanValue();
    LOGGER.info("Voice Block neighborChanged, poweredState =" + poweredState);

    if (flag != poweredState) {
      if (flag) {
        playVoice(worldIn, pos);
      }
      worldIn.setBlockState(pos, (BlockState)state.with(POWERED, Boolean.valueOf(flag)), 3);
    } 
  }
  
  @Override
  protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
    builder.add(POWERED);
  }
  
  
//  @Override
//  public void onBlockClicked(BlockState state, World worldIn, BlockPos pos, PlayerEntity playerEntity) {
//    if (! worldIn.isRemote) {
//      System.out.println("Voice Block clicked ...");
//      playVoice(worldIn, pos);
//    }
//    
//  }
//  
//  public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
//    System.out.println("Voice Block activated ...");
//    return true;
//  }
  
//  @SubscribeEvent
//  public static void onPlayerEvent(PlayerInteractEvent.RightClickBlock event) {
//    try (World world = event.getWorld()) {
//      BlockPos pos = event.getPos();
//      if (pos == null) {
//        return;
//      }
//
//      BlockState blockState = world.getBlockState(pos);
//      if (blockState == null) {
//        return;
//      }
//
//      Block block = blockState.getBlock();
//      
//      if (block != null && (block instanceof VoiceBlock)) {
//        LOGGER.info("Right click on voice box");
//        
//        ((VoiceBlock)block).playVoice(world, pos);
//  
//        if (event.isCancelable()) {
//          event.setCanceled(true);
//        }
//      }
//      
//      
//    } catch(Exception ex) {
//      LOGGER.error("Error", ex);
//    }
//  }
  
  public void playVoice(World worldIn, BlockPos pos) {
    LOGGER.info("Voice Block play voice ...");
    
    LOGGER.info("Config dir:" + FMLPaths.CONFIGDIR.get().toAbsolutePath());
    File configFile = new File(FMLPaths.CONFIGDIR.get().toFile(), MOD_CONFIG_FILE);
    
    FileConfig modConfig = null;
    if (configFile.exists()) {
      modConfig = FileConfig.of(configFile);
      modConfig.load();
    }

    TileEntity tileEntity = worldIn.getTileEntity(pos);
    if (!(tileEntity instanceof VoiceTileEntity)) {
      return;
    }
      
    VoiceTileEntity voiceTileEntity = (VoiceTileEntity) tileEntity;
    String text = voiceTileEntity.getText();
    String voice = voiceTileEntity.getVoice();
    
    LOGGER.info("text =" + text);
    LOGGER.info("voice =" + voice);
    
    if (StringUtils.isBlank(text)) {
      return;
    }
    
    if (ttsConfiguration == null) {
      readTTSConfiguration();
    }
    
    Map<String, Object> configMap = getDefaultTTSConfiguration();
    
    if (! StringUtils.isBlank(voice)) {
      Object configuration = ttsConfiguration.get(voice.toUpperCase());
      
      if (configuration != null && (configuration instanceof CommentedConfig)) {
        CommentedConfig config = (CommentedConfig) configuration;
        configMap.putAll(config.valueMap());
        
      }
    }
    
    AbstractTTSService tts = getTTSService(configMap);
    
    InputStream inputStream = tts.getAudio(text, configMap, modConfig);
    VoicePlayer player = new VoicePlayer();
    player.playMP3(inputStream);
  }
  
  private Map<String, Object> getDefaultTTSConfiguration() {
    Map<String, Object> configMap = new HashMap<>();
    configMap.put(AbstractTTSService.CONFIG_TTS_ENGINE, GoogleTranslateTTS.TTS_ENGINE_NAME);
    configMap.put(AbstractTTSService.CONFIG_VOICE, GoogleTranslateTTS.DEFAULT_VOICE);
    
    return configMap;
  }
  
  private void readTTSConfiguration() {
    TomlParser parser = new TomlParser();
    
    InputStream input = this.getClass().getResourceAsStream(TTS_CONF_FILE);
    ttsConfiguration = parser.parse(input);
  }
  
  private AbstractTTSService getTTSService(Map<String, Object> configuration) {
    String ttsEngine = String.valueOf(configuration.get(AbstractTTSService.CONFIG_TTS_ENGINE));
    
    LOGGER.info("ttsEngine=" + ttsEngine);
    
    if (GoogleTranslateTTS.TTS_ENGINE_NAME.equals(ttsEngine)) {
      return new GoogleTranslateTTS();
    } else if (GoogleCloudTTS.TTS_ENGINE_NAME.equals(ttsEngine)) {
      return new GoogleCloudTTS();
    } else {
      return new GoogleTranslateTTS();
    }
  }
}
