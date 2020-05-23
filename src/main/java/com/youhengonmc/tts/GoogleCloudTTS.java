package com.youhengonmc.tts;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.URIBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.electronwill.nightconfig.core.file.FileConfig;
import com.google.gson.Gson;

class RequestInput {
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}

class RequestVoice {
  private String languageCode;
  private String ssmlGender;
  private String name;
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLanguageCode() {
    return languageCode;
  }
  
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }
  
  public String getSsmlGender() {
    return ssmlGender;
  }
  public void setSsmlGender(String ssmlGender) {
    this.ssmlGender = ssmlGender;
  }
  
  
}

class RequestAudioConfig {
  private String audioEncoding = "MP3";

  public String getAudioEncoding() {
    return audioEncoding;
  }

  public void setAudioEncoding(String audioEncoding) {
    this.audioEncoding = audioEncoding;
  }
}

class GoogleCloundRequest {
  private RequestInput input;
  private RequestVoice voice;
  private RequestAudioConfig audioConfig;
  
  public RequestInput getInput() {
    return input;
  }
  
  public void setInput(RequestInput input) {
    this.input = input;
  }
  
  public RequestVoice getVoice() {
    return voice;
  }
  
  public void setVoice(RequestVoice voice) {
    this.voice = voice;
  }
  
  public RequestAudioConfig getAudioConfig() {
    return audioConfig;
  }
  
  public void setAudioConfig(RequestAudioConfig audioConfig) {
    this.audioConfig = audioConfig;
  }
}

public class GoogleCloudTTS extends AbstractTTSService {
  
  public static final String TTS_ENGINE_NAME = "GoogleCloud";
  
  private static final Logger LOGGER = LogManager.getLogger();
  private static final String GOOGLE_CLOUD_TTS = "https://texttospeech.googleapis.com/v1/text:synthesize";
  private static final String CONF_GOOGLE_API_KEY = "GOOGLE_API_KEY";
  
  @SuppressWarnings("rawtypes")
  @Override
  public InputStream getAudio(String text, Map<String, Object> voiceConfig, FileConfig modConfig)
      throws IllegalArgumentException {
    
    LOGGER.info("Get audit from Google Cloud");
    
    try {
      if (modConfig == null) {
        throw new IllegalArgumentException("Cannot load mod configuration");
      }
      
      String googleApiKey = modConfig.get(CONF_GOOGLE_API_KEY);
      if (StringUtils.isBlank(googleApiKey)) {
        throw new IllegalArgumentException("Google API Key is reuqired");
      }
          
      String voiceName = String.valueOf(voiceConfig.get("voice"));
      String language = String.valueOf(voiceConfig.get("lang"));
      String gender = String.valueOf(voiceConfig.get("gender"));
      
      LOGGER.info("voiceName=" + voiceName);
      LOGGER.info("language=" + language);
      LOGGER.info("gender=" + gender);

      GoogleCloundRequest request = new GoogleCloundRequest();

      RequestInput input = new RequestInput();
      input.setText(text);
      
      RequestVoice requestVoice = new RequestVoice();
      requestVoice.setLanguageCode(language);
      requestVoice.setSsmlGender(gender);
      requestVoice.setName(voiceName);
      
      RequestAudioConfig audioConfig = new RequestAudioConfig();

      request.setInput(input);
      request.setVoice(requestVoice);
      request.setAudioConfig(audioConfig);
      
      Gson gson = new Gson();
      String requestJson = gson.toJson(request);
      LOGGER.info("requestJson=" + requestJson);
      
      byte[] requestBytes = requestJson.getBytes("utf-8");
    
    
      URIBuilder builder = new URIBuilder(GOOGLE_CLOUD_TTS);
      URL url = builder.build().toURL();
      
      HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
      urlConn.setDoOutput(true);
      
      urlConn.addRequestProperty("Content-Type", "application/json; charset=utf-8");
      urlConn.addRequestProperty("X-Goog-Api-Key", googleApiKey);
      urlConn.addRequestProperty("Content-Length", "" + requestBytes.length);
      urlConn.setRequestMethod("POST");
      
      OutputStream outputStream = urlConn.getOutputStream();
      outputStream.write(requestBytes, 0, requestBytes.length);           
    
      InputStream inputStream = urlConn.getInputStream();
      
      String responseBody = null;
      try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, "utf-8"))) {
        StringBuilder response = new StringBuilder();
        
        String responseLine = null;
        while ((responseLine = br.readLine()) != null) {
            response.append(responseLine.trim());
        }        
                   
        responseBody = response.toString();
      }
      LOGGER.info("responseBody=" + responseBody);
      
      Map map = gson.fromJson(responseBody, Map.class);
      String encodedVoice = (String) map.get("audioContent");

      byte[] decoded = Base64.decodeBase64(encodedVoice.getBytes());
      return new ByteArrayInputStream(decoded);
    } catch (IOException | URISyntaxException ex) {
      throw new IllegalArgumentException(ex);
    }
  }
}
