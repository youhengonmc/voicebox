package com.youhengonmc.voiceblock.item;

import com.youhengonmc.voiceblock.block.ModBlocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class VoiceBlockItem extends BlockItem  {

  public VoiceBlockItem() {
    super(ModBlocks.VOICE_BLOCK.get(), new Item.Properties().group(ItemGroup.MISC));
  }
}
