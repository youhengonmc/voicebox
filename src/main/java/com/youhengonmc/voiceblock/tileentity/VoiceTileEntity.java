package com.youhengonmc.voiceblock.tileentity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;

public class VoiceTileEntity extends TileEntity {
  
  private static final Logger LOGGER = LogManager.getLogger();
  
  private static final String DATA_TEXT = "text";
  private static final String DATA_VOICE = "voice";
 
  private String text = "";
  private String voice = "";
  
  public VoiceTileEntity() {
    super(ModTileEntities.VOICE_BLOCK_TILE_ENTITY.get());
  }
  
  public String getText() {
    return text;
  }

  public String getVoice() {
    return voice;
  }
  
  /**
   * Write data from the tile into a compound tag for saving to disk.
   */
  @Override
  public CompoundNBT write(CompoundNBT compound) {
    LOGGER.info("write data:" + compound);
    super.write(compound);
    
    compound.putString(DATA_TEXT, text);
    compound.putString(DATA_VOICE, voice);
    
    return compound;
  }

  /**
   * Read saved data from disk into the tile.
   */
  @Override
  public void read(CompoundNBT compound) {
    LOGGER.info("read data:" + compound);
    super.read(compound);
   
    this.text = compound.getString(DATA_TEXT);
    this.voice = compound.getString(DATA_VOICE);
  }
}
