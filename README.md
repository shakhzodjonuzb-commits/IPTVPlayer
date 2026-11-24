# IPTV Player — by Shakhzodjon Khudaybediyev

Ochiq manbali IPTV ilova: Android (Phone + TV) va Windows (EXE). Login/aktivatsiya yo‘q.
Aloqa: https://t.me/ilhomvich_sh

## Kanallar
| ID | Kanal | Logo |
|----|-------|------|
| 1004 | Sport TV | sport.png |
| 1010 | Futbol TV ⚽ | emoji |
| 1016 | ZoʻrTV | zor_tv.png |
| 1263 | Setanta Sports 1 | setanta.png |
| 1264 | Setanta Sports 2 | setanta.png |

URL: `https://stream2|stream8.cinerama.uz/<ID>/tracks-v1a1/mono.m3u8` (server ilovada tanlanadi).

## Logolar (ixtiyoriy — bo‘lmasa emoji/bosh harf chiqadi)
- Android: `zor_tv.png`, `setanta.png`, `sport.png` → `app/src/main/res/drawable-nodpi/`
- Windows: xuddi shu 3 fayl → `desktop/assets/logos/`

## GitHub Actions
Push qiling → **Actions** → `Build`. Artifactlar: `IPTV-Player-Android` (APK), `IPTV-Player-Windows` (portable .exe).

## Lokal build
- Android: `gradle assembleDebug` (JDK 17, Gradle 8.10+) yoki Android Studio.
- Windows: `cd desktop && npm install && npm start` / `npm run build`.
