# Voice Box

Voice Box is a Minecraft mod that brings Text-to-Speech to your world.

# Usage
Step 1: Place the voice block, find the <X, Y, Z> coordinate of the block.  
  
Step 2: Use `/data` command to set text and voice code for the block

```
  /data merge block X Y Z {text:"TEXT HERE", voice: "VOICE_CODE"}

e.g.

 /data merge block -3 4 1 {text:"Hello, welcome to my house", voice: "GC30"}
```

Supported `VOICE_CODE` are listed in the lists low.

Step 3: To play voice, active the block with lever, button or other redstone power components.

# Voice Codes

## Google Translate TTS voices

| Code | Voice |
| --- | --- |
|GT1 | Afrikaans(af) |
|GT2 | Albanian(sq) |
|GT3 | Arabic(ar) |
|GT4 | Armenian(hy) |
|GT5 | Bengali(bn) |
|GT6 | Bosnian(bs) |
|GT7 | Catalan(ca) |
|GT8 | Chinese(zh-CN) |
|GT9 | Croatian(hr) |
|GT10 | Czech(cs) |
|GT11 | Danish(da) |
|GT12 | Dutch(nl) |
|GT13 | English(en) |
|GT14 | Esperanto(eo) |
|GT15 | Filipino(fil) |
|GT16 | Finnish(fi) |
|GT17 | French(fr) |
|GT18 | German(de) |
|GT19 | Greek(el) |
|GT20 | Hebrew(he) |
|GT21 | Hindi(hi) |
|GT22 | Hungarian(hu) |
|GT23 | Icelandic(is) |
|GT24 | Indonesian(id) |
|GT25 | Italian(it) |
|GT26 | Japanese(ja) |
|GT27 | Khmer(km) |
|GT28 | Korean(ko) |
|GT29 | Latin(la) |
|GT30 | Latvian(lv) |
|GT31 | Macedonian(mk) |
|GT32 | Malayalam(ml) |
|GT33 | Nepali(ne) |
|GT34 | Norwegian(no) |
|GT35 | Polish(pl) |
|GT36 | Portuguese(pt) |
|GT37 | Romanian(ro) |
|GT38 | Russian(ru) |
|GT39 | Serbian(sr) |
|GT40 | Sinhala(si) |
|GT41 | Slovak(sk) |
|GT42 | Spanish(es) |
|GT43 | Swahili(sw) |
|GT44 | Swedish(sv) |
|GT45 | Tagalog(tl) |
|GT46 | Tamil(ta) |
|GT47 | Telugu(te) |
|GT48 | Thai(th) |
|GT49 | Turkish(tr) |
|GT50 | Ukrainian(uk) |
|GT51 | Vietnamese(vi) |
|GT52 | Welsh(cy) |

Google Translate TTS is a free but unsupported service, no setup is required to use Google Translate voices.

## Google Cloud TTS voices

| Code | Voice |
| --- | --- |
|GC1|  German (Germany), FEMALE, de-DE-Wavenet-F |
|GC2|  English (India), FEMALE, en-IN-Wavenet-D |
|GC3|  Hindi (India), FEMALE, hi-IN-Wavenet-D |
|GC4|  Indonesian (Indonesia), FEMALE, id-ID-Wavenet-D |
|GC5|  Arabic, FEMALE, ar-XA-Wavenet-A |
|GC6|  Arabic, MALE, ar-XA-Wavenet-B |
|GC7|  Arabic, MALE, ar-XA-Wavenet-C |
|GC8|  Mandarin Chinese, FEMALE, cmn-CN-Wavenet-A |
|GC9|  Mandarin Chinese, MALE, cmn-CN-Wavenet-B |
|GC10|  Mandarin Chinese, MALE, cmn-CN-Wavenet-C |
|GC11|  Mandarin Chinese, FEMALE, cmn-CN-Wavenet-D |
|GC12|  Mandarin Chinese, FEMALE, cmn-TW-Wavenet-A |
|GC13|  Mandarin Chinese, MALE, cmn-TW-Wavenet-B |
|GC14|  Mandarin Chinese, MALE, cmn-TW-Wavenet-C |
|GC15|  Czech (Czech Republic), FEMALE, cs-CZ-Wavenet-A |
|GC16|  Danish (Denmark), FEMALE, da-DK-Wavenet-A |
|GC17|  Danish (Denmark), MALE, da-DK-Wavenet-C |
|GC18|  Danish (Denmark), FEMALE, da-DK-Wavenet-D |
|GC19|  Danish (Denmark), FEMALE, da-DK-Wavenet-E |
|GC20|  German (Germany), FEMALE, de-DE-Wavenet-A |
|GC21|  German (Germany), MALE, de-DE-Wavenet-B |
|GC22|  German (Germany), FEMALE, de-DE-Wavenet-C |
|GC23|  German (Germany), MALE, de-DE-Wavenet-D |
|GC24|  German (Germany), MALE, de-DE-Wavenet-E |
|GC25|  Greek (Greece), FEMALE, el-GR-Wavenet-A |
|GC26|  English (Australia), FEMALE, en-AU-Wavenet-A |
|GC27|  English (Australia), MALE, en-AU-Wavenet-B |
|GC28|  English (Australia), FEMALE, en-AU-Wavenet-C |
|GC29|  English (Australia), MALE, en-AU-Wavenet-D |
|GC30|  English (UK), FEMALE, en-GB-Wavenet-A |
|GC31|  English (UK), MALE, en-GB-Wavenet-B |
|GC32|  English (UK), FEMALE, en-GB-Wavenet-C |
|GC33|  English (UK), MALE, en-GB-Wavenet-D |
|GC34|  English (India), FEMALE, en-IN-Wavenet-A |
|GC35|  English (India), MALE, en-IN-Wavenet-B |
|GC36|  English (India), MALE, en-IN-Wavenet-C |
|GC37|  English (US), MALE, en-US-Wavenet-A |
|GC38|  English (US), MALE, en-US-Wavenet-B |
|GC39|  English (US), FEMALE, en-US-Wavenet-C |
|GC40|  English (US), MALE, en-US-Wavenet-D |
|GC41|  English (US), FEMALE, en-US-Wavenet-E |
|GC42|  English (US), FEMALE, en-US-Wavenet-F |
|GC43|  Finnish (Finland), FEMALE, fi-FI-Wavenet-A |
|GC44|  Filipino (Philippines), FEMALE, fil-PH-Wavenet-A |
|GC45|  Filipino (Philippines), FEMALE, fil-PH-Wavenet-B |
|GC46|  Filipino (Philippines), MALE, fil-PH-Wavenet-C |
|GC47|  Filipino (Philippines), MALE, fil-PH-Wavenet-D |
|GC48|  French (Canada), FEMALE, fr-CA-Wavenet-A |
|GC49|  French (Canada), MALE, fr-CA-Wavenet-B |
|GC50|  French (Canada), FEMALE, fr-CA-Wavenet-C |
|GC51|  French (Canada), MALE, fr-CA-Wavenet-D |
|GC52|  French (France), FEMALE, fr-FR-Wavenet-A |
|GC53|  French (France), MALE, fr-FR-Wavenet-B |
|GC54|  French (France), FEMALE, fr-FR-Wavenet-C |
|GC55|  French (France), MALE, fr-FR-Wavenet-D |
|GC56|  French (France), FEMALE, fr-FR-Wavenet-E |
|GC57|  Hindi (India), FEMALE, hi-IN-Wavenet-A |
|GC58|  Hindi (India), MALE, hi-IN-Wavenet-B |
|GC59|  Hindi (India), MALE, hi-IN-Wavenet-C |
|GC60|  Hungarian (Hungary), FEMALE, hu-HU-Wavenet-A |
|GC61|  Indonesian (Indonesia), FEMALE, id-ID-Wavenet-A |
|GC62|  Indonesian (Indonesia), MALE, id-ID-Wavenet-B |
|GC63|  Indonesian (Indonesia), MALE, id-ID-Wavenet-C |
|GC64|  Italian (Italy), FEMALE, it-IT-Wavenet-A |
|GC65|  Italian (Italy), FEMALE, it-IT-Wavenet-B |
|GC66|  Italian (Italy), MALE, it-IT-Wavenet-C |
|GC67|  Italian (Italy), MALE, it-IT-Wavenet-D |
|GC68|  Japanese (Japan), FEMALE, ja-JP-Wavenet-A |
|GC69|  Japanese (Japan), FEMALE, ja-JP-Wavenet-B |
|GC70|  Japanese (Japan), MALE, ja-JP-Wavenet-C |
|GC71|  Japanese (Japan), MALE, ja-JP-Wavenet-D |
|GC72|  Korean (South Korea), FEMALE, ko-KR-Wavenet-B |
|GC73|  Korean (South Korea), MALE, ko-KR-Wavenet-C |
|GC74|  Korean (South Korea), MALE, ko-KR-Wavenet-D |
|GC75|  Korean (South Korea), FEMALE, ko-KR-Wavenet-A |
|GC76|  Norwegian (Norway), FEMALE, nb-no-Wavenet-E |
|GC77|  Norwegian (Norway), FEMALE, nb-NO-Wavenet-A |
|GC78|  Norwegian (Norway), MALE, nb-NO-Wavenet-B |
|GC79|  Norwegian (Norway), FEMALE, nb-NO-Wavenet-C |
|GC80|  Norwegian (Norway), MALE, nb-NO-Wavenet-D |
|GC81|  Dutch (Netherlands), MALE, nl-NL-Wavenet-B |
|GC82|  Dutch (Netherlands), MALE, nl-NL-Wavenet-C |
|GC83|  Dutch (Netherlands), FEMALE, nl-NL-Wavenet-D |
|GC84|  Dutch (Netherlands), FEMALE, nl-NL-Wavenet-E |
|GC85|  Dutch (Netherlands), FEMALE, nl-NL-Wavenet-A |
|GC86|  Polish (Poland), FEMALE, pl-PL-Wavenet-A |
|GC87|  Polish (Poland), MALE, pl-PL-Wavenet-B |
|GC88|  Polish (Poland), MALE, pl-PL-Wavenet-C |
|GC89|  Polish (Poland), FEMALE, pl-PL-Wavenet-D |
|GC90|  Polish (Poland), FEMALE, pl-PL-Wavenet-E |
|GC91|  Portuguese (Brazil), FEMALE, pt-BR-Wavenet-A |
|GC92|  Portuguese (Portugal), FEMALE, pt-PT-Wavenet-A |
|GC93|  Portuguese (Portugal), MALE, pt-PT-Wavenet-B |
|GC94|  Portuguese (Portugal), MALE, pt-PT-Wavenet-C |
|GC95|  Portuguese (Portugal), FEMALE, pt-PT-Wavenet-D |
|GC96|  Russian (Russia), FEMALE, ru-RU-Wavenet-E |
|GC97|  Russian (Russia), FEMALE, ru-RU-Wavenet-A |
|GC98|  Russian (Russia), MALE, ru-RU-Wavenet-B |
|GC99|  Russian (Russia), FEMALE, ru-RU-Wavenet-C |
|GC100|  Russian (Russia), MALE, ru-RU-Wavenet-D |
|GC101|  Slovak (Slovakia), FEMALE, sk-SK-Wavenet-A |
|GC102|  Swedish (Sweden), FEMALE, sv-SE-Wavenet-A |
|GC103|  Turkish (Turkey), FEMALE, tr-TR-Wavenet-A |
|GC104|  Turkish (Turkey), MALE, tr-TR-Wavenet-B |
|GC105|  Turkish (Turkey), FEMALE, tr-TR-Wavenet-C |
|GC106|  Turkish (Turkey), FEMALE, tr-TR-Wavenet-D |
|GC107|  Turkish (Turkey), MALE, tr-TR-Wavenet-E |
|GC108|  Ukrainian (Ukraine), FEMALE, uk-UA-Wavenet-A |
|GC109|  Vietnamese (Vietnam), FEMALE, vi-VN-Wavenet-A |
|GC110|  Vietnamese (Vietnam), MALE, vi-VN-Wavenet-B |
|GC111|  Vietnamese (Vietnam), FEMALE, vi-VN-Wavenet-C |
|GC112|  Vietnamese (Vietnam), MALE, vi-VN-Wavenet-D |
|GC113|  German (Germany), FEMALE, de-DE-Standard-F |
|GC114|  Spanish (Spain), FEMALE, es-ES-Standard-A |
|GC115|  Arabic, FEMALE, ar-XA-Standard-A |
|GC116|  Arabic, MALE, ar-XA-Standard-B |
|GC117|  Arabic, MALE, ar-XA-Standard-C |
|GC118|  Arabic, FEMALE, ar-XA-Standard-D |
|GC119|  French (France), FEMALE, fr-FR-Standard-E |
|GC120|  Italian (Italy), FEMALE, it-IT-Standard-A |
|GC121|  Russian (Russia), FEMALE, ru-RU-Standard-E |
|GC122|  Russian (Russia), FEMALE, ru-RU-Standard-A |
|GC123|  Russian (Russia), MALE, ru-RU-Standard-B |
|GC124|  Russian (Russia), FEMALE, ru-RU-Standard-C |
|GC125|  Russian (Russia), MALE, ru-RU-Standard-D |
|GC126|  Mandarin Chinese, FEMALE, cmn-CN-Standard-D |
|GC127|  Mandarin Chinese, FEMALE, cmn-CN-Standard-A |
|GC128|  Mandarin Chinese, MALE, cmn-CN-Standard-B |
|GC129|  Mandarin Chinese, MALE, cmn-CN-Standard-C |
|GC130|  Mandarin Chinese, FEMALE, cmn-TW-Standard-A |
|GC131|  Mandarin Chinese, MALE, cmn-TW-Standard-B |
|GC132|  Mandarin Chinese, MALE, cmn-TW-Standard-C |
|GC133|  Korean (South Korea), FEMALE, ko-KR-Standard-A |
|GC134|  Korean (South Korea), FEMALE, ko-KR-Standard-B |
|GC135|  Korean (South Korea), MALE, ko-KR-Standard-C |
|GC136|  Korean (South Korea), MALE, ko-KR-Standard-D |
|GC137|  Japanese (Japan), FEMALE, ja-JP-Standard-A |
|GC138|  Japanese (Japan), MALE, ja-JP-Standard-C |
|GC139|  Japanese (Japan), FEMALE, ja-JP-Standard-B |
|GC140|  Japanese (Japan), MALE, ja-JP-Standard-D |
|GC141|  Vietnamese (Vietnam), FEMALE, vi-VN-Standard-A |
|GC142|  Vietnamese (Vietnam), MALE, vi-VN-Standard-B |
|GC143|  Vietnamese (Vietnam), FEMALE, vi-VN-Standard-C |
|GC144|  Vietnamese (Vietnam), MALE, vi-VN-Standard-D |
|GC145|  Filipino (Philippines), FEMALE, fil-PH-Standard-A |
|GC146|  Filipino (Philippines), FEMALE, fil-PH-Standard-B |
|GC147|  Filipino (Philippines), MALE, fil-PH-Standard-C |
|GC148|  Filipino (Philippines), MALE, fil-PH-Standard-D |
|GC149|  Indonesian (Indonesia), FEMALE, id-ID-Standard-A |
|GC150|  Indonesian (Indonesia), MALE, id-ID-Standard-B |
|GC151|  Indonesian (Indonesia), MALE, id-ID-Standard-C |
|GC152|  Indonesian (Indonesia), FEMALE, id-ID-Standard-D |
|GC153|  Dutch (Netherlands), FEMALE, nl-NL-Standard-A |
|GC154|  Dutch (Netherlands), MALE, nl-NL-Standard-B |
|GC155|  Dutch (Netherlands), MALE, nl-NL-Standard-C |
|GC156|  Dutch (Netherlands), FEMALE, nl-NL-Standard-D |
|GC157|  Dutch (Netherlands), FEMALE, nl-NL-Standard-E |
|GC158|  Czech (Czech Republic), FEMALE, cs-CZ-Standard-A |
|GC159|  Greek (Greece), FEMALE, el-GR-Standard-A |
|GC160|  Portuguese (Brazil), FEMALE, pt-BR-Standard-A |
|GC161|  Hungarian (Hungary), FEMALE, hu-HU-Standard-A |
|GC162|  Polish (Poland), FEMALE, pl-PL-Standard-E |
|GC163|  Polish (Poland), FEMALE, pl-PL-Standard-A |
|GC164|  Polish (Poland), MALE, pl-PL-Standard-B |
|GC165|  Polish (Poland), MALE, pl-PL-Standard-C |
|GC166|  Polish (Poland), FEMALE, pl-PL-Standard-D |
|GC167|  Slovak (Slovakia), FEMALE, sk-SK-Standard-A |
|GC168|  Turkish (Turkey), FEMALE, tr-TR-Standard-A |
|GC169|  Turkish (Turkey), MALE, tr-TR-Standard-B |
|GC170|  Turkish (Turkey), FEMALE, tr-TR-Standard-C |
|GC171|  Turkish (Turkey), FEMALE, tr-TR-Standard-D |
|GC172|  Turkish (Turkey), MALE, tr-TR-Standard-E |
|GC173|  Ukrainian (Ukraine), FEMALE, uk-UA-Standard-A |
|GC174|  Bengali (India), FEMALE, bn-IN-Standard-A |
|GC175|  Bengali (India), MALE, bn-IN-Standard-B |
|GC176|  English (India), FEMALE, en-IN-Standard-D |
|GC177|  English (India), FEMALE, en-IN-Standard-A |
|GC178|  English (India), MALE, en-IN-Standard-B |
|GC179|  English (India), MALE, en-IN-Standard-C |
|GC180|  Gujarati (India), FEMALE, gu-IN-Standard-A |
|GC181|  Gujarati (India), MALE, gu-IN-Standard-B |
|GC182|  Hindi (India), FEMALE, hi-IN-Standard-D |
|GC183|  Hindi (India), FEMALE, hi-IN-Standard-A |
|GC184|  Hindi (India), MALE, hi-IN-Standard-B |
|GC185|  Hindi (India), MALE, hi-IN-Standard-C |
|GC186|  Kannada (India), FEMALE, kn-IN-Standard-A |
|GC187|  Kannada (India), MALE, kn-IN-Standard-B |
|GC188|  Malayalam (India), FEMALE, ml-IN-Standard-A |
|GC189|  Malayalam (India), MALE, ml-IN-Standard-B |
|GC190|  Tamil (India), FEMALE, ta-IN-Standard-A |
|GC191|  Tamil (India), MALE, ta-IN-Standard-B |
|GC192|  Telugu (India), FEMALE, te-IN-Standard-A |
|GC193|  Telugu (India), MALE, te-IN-Standard-B |
|GC194|  Thai (Thailand), FEMALE, th-TH-Standard-A |
|GC195|  Danish (Denmark), FEMALE, da-DK-Standard-A |
|GC196|  Danish (Denmark), MALE, da-DK-Standard-C |
|GC197|  Danish (Denmark), FEMALE, da-DK-Standard-D |
|GC198|  Danish (Denmark), FEMALE, da-DK-Standard-E |
|GC199|  Finnish (Finland), FEMALE, fi-FI-Standard-A |
|GC200|  Portuguese (Portugal), FEMALE, pt-PT-Standard-A |
|GC201|  Portuguese (Portugal), MALE, pt-PT-Standard-B |
|GC202|  Portuguese (Portugal), MALE, pt-PT-Standard-C |
|GC203|  Portuguese (Portugal), FEMALE, pt-PT-Standard-D |
|GC204|  Norwegian (Norway), FEMALE, nb-no-Standard-E |
|GC205|  Norwegian (Norway), FEMALE, nb-NO-Standard-A |
|GC206|  Norwegian (Norway), MALE, nb-NO-Standard-B |
|GC207|  Norwegian (Norway), FEMALE, nb-NO-Standard-C |
|GC208|  Norwegian (Norway), MALE, nb-NO-Standard-D |
|GC209|  Swedish (Sweden), FEMALE, sv-SE-Standard-A |
|GC210|  English (UK), FEMALE, en-GB-Standard-A |
|GC211|  English (UK), MALE, en-GB-Standard-B |
|GC212|  English (UK), FEMALE, en-GB-Standard-C |
|GC213|  English (UK), MALE, en-GB-Standard-D |
|GC214|  English (US), MALE, en-US-Standard-B |
|GC215|  English (US), FEMALE, en-US-Standard-C |
|GC216|  English (US), MALE, en-US-Standard-D |
|GC217|  English (US), FEMALE, en-US-Standard-E |
|GC218|  German (Germany), FEMALE, de-DE-Standard-A |
|GC219|  German (Germany), MALE, de-DE-Standard-B |
|GC220|  German (Germany), MALE, de-DE-Standard-E |
|GC221|  English (Australia), FEMALE, en-AU-Standard-A |
|GC222|  English (Australia), MALE, en-AU-Standard-B |
|GC223|  English (Australia), FEMALE, en-AU-Standard-C |
|GC224|  English (Australia), MALE, en-AU-Standard-D |
|GC225|  French (Canada), FEMALE, fr-CA-Standard-A |
|GC226|  French (Canada), MALE, fr-CA-Standard-B |
|GC227|  French (Canada), FEMALE, fr-CA-Standard-C |
|GC228|  French (Canada), MALE, fr-CA-Standard-D |
|GC229|  French (France), FEMALE, fr-FR-Standard-A |
|GC230|  French (France), MALE, fr-FR-Standard-B |
|GC231|  French (France), FEMALE, fr-FR-Standard-C |
|GC232|  French (France), MALE, fr-FR-Standard-D |
|GC233|  Italian (Italy), FEMALE, it-IT-Standard-B |
|GC234|  Italian (Italy), MALE, it-IT-Standard-C |
|GC235|  Italian (Italy), MALE, it-IT-Standard-D |

To use Google Cloud TTS voices, an API Key is required. 

Instructions for Google Cloud service sign up and Google Cloud Speech API key creation:

https://cloud.google.com/text-to-speech/docs/quickstart-protocol

https://cloud.google.com/docs/authentication/api-keys 

Once you have the API key, create a `voicebox.toml` file under Minecfaft `Launcher/config/` folder with content below

```
  GOOGLE_API_KEY = "YOUR_API_KEY_HERE"
```

Google offers a monthly free tier of up to one million characters for WaveNet voices or four million characters for Standard voices, pricing details for Google Cloud TTS can be found from https://cloud.google.com/text-to-speech/pricing.   

