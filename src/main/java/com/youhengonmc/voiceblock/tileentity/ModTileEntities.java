package com.youhengonmc.voiceblock.tileentity;

import com.youhengonmc.voiceblock.VoiceBlockMod;
import com.youhengonmc.voiceblock.block.ModBlocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {
  
  private static final String VOICE_BLOCK_TILE_ENTITY_REGISTER_NAME = "voice_block";
  
  public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = new DeferredRegister<>(
      ForgeRegistries.TILE_ENTITIES, VoiceBlockMod.MOD_ID);

  public static final RegistryObject<TileEntityType<VoiceTileEntity>> VOICE_BLOCK_TILE_ENTITY = 
      TILE_ENTITIES.register(VOICE_BLOCK_TILE_ENTITY_REGISTER_NAME,
          () -> TileEntityType.Builder.create(VoiceTileEntity::new, ModBlocks.VOICE_BLOCK.get()).build(null));
}
