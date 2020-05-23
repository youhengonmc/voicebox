package com.youhengonmc.voiceblock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.youhengonmc.voiceblock.block.VoiceBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;

//TOOD - not working, save world hang, event fires twice
//Mod.EventBusSubscriber(modid = VoiceBlockMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEventHandler {
  
  private static final Logger LOGGER = LogManager.getLogger();

  @SubscribeEvent
  public static void onPlayerEvent(PlayerInteractEvent.RightClickBlock event) {
    try (World world = event.getWorld()) {
      BlockPos pos = event.getPos();
      if (pos == null) {
        return;
      }

      BlockState blockState = world.getBlockState(pos);
      if (blockState == null) {
        return;
      }

      Block block = blockState.getBlock();

      if (block != null && (block instanceof VoiceBlock)) {
        LOGGER.info("Right click on voice box");

        if (! world.isRemote) {
          ((VoiceBlock) block).playVoice(world, pos);
        }

        if (event.isCancelable()) {
          event.setCanceled(true);
        }
      }

    } catch (Exception ex) {
      LOGGER.error("Error", ex);
    }
  }
}
