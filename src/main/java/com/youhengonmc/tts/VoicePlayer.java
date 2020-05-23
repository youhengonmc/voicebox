package com.youhengonmc.tts;

import java.io.InputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class VoicePlayer {
  
  private static final Logger LOGGER = LogManager.getLogger();
  
  public void playMP3(InputStream inputStream) {
    try {
      AdvancedPlayer player = new AdvancedPlayer(inputStream);
      player.play();
    } catch (JavaLayerException ex) {
      LOGGER.info("Play MP3 voice error", ex);
    }
  }
}
