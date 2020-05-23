package com.youhengonmc.voiceblock.item;

import com.youhengonmc.voiceblock.VoiceBlockMod;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

  private static final String VOICE_BLOCK_ITEM_REGISTER_NAME = "voice_block";

  public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
      VoiceBlockMod.MOD_ID);
  
  public static final RegistryObject<Item> VOICE_BLOCK_ITEM = ITEMS.register(VOICE_BLOCK_ITEM_REGISTER_NAME,
      () -> new VoiceBlockItem());
}
