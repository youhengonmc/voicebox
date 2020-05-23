package com.youhengonmc.voiceblock.block;

import com.youhengonmc.voiceblock.VoiceBlockMod;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
  
  private static final String VOICE_BLOCK_REGISTER_NAME = "voice_block";

  public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
      VoiceBlockMod.MOD_ID);

  public static final RegistryObject<Block> VOICE_BLOCK = BLOCKS.register(VOICE_BLOCK_REGISTER_NAME,
      () -> new VoiceBlock());  
  
}
