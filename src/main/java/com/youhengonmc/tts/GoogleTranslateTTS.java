package com.youhengonmc.tts;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import org.apache.http.client.utils.URIBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.electronwill.nightconfig.core.file.FileConfig;

public class GoogleTranslateTTS extends AbstractTTSService {
  public static final String TTS_ENGINE_NAME = "GoogleTranslate";
  public static final String DEFAULT_VOICE = "en";

  private static final Logger LOGGER = LogManager.getLogger();
  private static final String GOOGLE_TRANSLATE_TTS = "http://translate.google.com/translate_tts?";
  
  @Override
  public InputStream getAudio(String text, Map<String, Object> voiceConfig, FileConfig modConfig)
      throws IllegalArgumentException {
    try {
      LOGGER.info("Get audit from Google Translate");
      
      String language = String.valueOf(voiceConfig.get("lang"));
      LOGGER.info("language=" + language);
      
      URIBuilder builder = new URIBuilder(GOOGLE_TRANSLATE_TTS);
      builder.addParameter("ie", "UTF-8");
      builder.addParameter("total", "1");
      builder.addParameter("idx", "0");
      builder.addParameter("client", "tw-ob");
      builder.addParameter("q", text);
      builder.addParameter("len", "" + text.length());
      builder.addParameter("tl", language);
      
      URL url = builder.build().toURL();
      
      URLConnection urlConn = url.openConnection();
      urlConn.addRequestProperty("User-Agent",
          "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
      InputStream audioSrc = urlConn.getInputStream();
      return new BufferedInputStream(audioSrc);    
    } catch (IOException | URISyntaxException ex) {
      throw new IllegalArgumentException(ex);
    }
  }
}
