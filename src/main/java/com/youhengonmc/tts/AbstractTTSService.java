package com.youhengonmc.tts;

import java.io.InputStream;
import java.util.Map;

import com.electronwill.nightconfig.core.file.FileConfig;

public abstract class AbstractTTSService {
  
  public static final String CONFIG_TTS_ENGINE = "tts";  
  public static final String CONFIG_VOICE = "voice";  
  
  abstract public InputStream getAudio(String text, Map<String, Object> voiceConfig, FileConfig modConfig)
      throws IllegalArgumentException;
}
