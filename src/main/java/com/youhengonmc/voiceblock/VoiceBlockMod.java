package com.youhengonmc.voiceblock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.youhengonmc.voiceblock.block.ModBlocks;
import com.youhengonmc.voiceblock.item.ModItems;
import com.youhengonmc.voiceblock.tileentity.ModTileEntities;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VoiceBlockMod.MOD_ID)
public class VoiceBlockMod {
  public static final String MOD_ID = "voiceblock";
  
  private static final Logger LOGGER = LogManager.getLogger();

  public VoiceBlockMod() {
    LOGGER.info("constructor");
    
    final IEventBus modeventbus = FMLJavaModLoadingContext.get().getModEventBus();
    
    ModItems.ITEMS.register(modeventbus);
    ModBlocks.BLOCKS.register(modeventbus);
    ModTileEntities.TILE_ENTITIES.register(modeventbus);
  }  
}
