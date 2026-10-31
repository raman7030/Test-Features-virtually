## Archive vs. source audit (2026-10-31)

### Scope
The uploaded `test.zip` is an Android application package for MT Manager (`bin.mt.plus`). The repository `src/` is a React/TypeScript web inspection utility. They are not equivalent implementations. A matching label in the web UI does not prove that the corresponding Android feature works.

### Verified archive facts
- Size: 37,521,106 bytes
- SHA-256: `8f83cef8ac63f76a81e1fee3ededb213f6ba43cc19761e38bc4e567c87edd47d`
- ZIP: 2,261 file entries; JSZip loads successfully
- DEX: five files; actual method-ID counts from DEX headers:
  - classes.dex: 16,805
  - classes2.dex: 18,349
  - classes3.dex: 18,648
  - classes4.dex: 18,616
  - classes5.dex: 10,034
- Native ABI directories: arm64-v8a (11 .so), armeabi-v7a (10 .so), x86 (10 .so), x86_64 (9 .so)
- Syntax definitions: 62
- Locale-related MTL files: 22
- AndroidManifest.xml and resources.arsc are present as binary package data. Their decoded metadata has not yet been independently verified.

### Source assessment
| Capability | Finding |
|---|---|
| Dual-pane manager | UI exists; server data is an in-memory mock, not Android storage |
| APK inspection | ZIP entry search/content preview exists; no full AXML/ARSC decoder |
| DEX editing/decompiling | Not implemented as a working full editor |
| Full text/hex editors | Partial browser-side utilities only |
| Native module inventory | Static file inventory; no native execution |
| APK signing | No signing operation; prior fake success simulation has been removed |
| Runtime tests | No Android emulator/device; prior fake launch simulation has been removed |
| Root/Shizuku integration | No connected device/root/Shizuku session |
| Remote manager | API stubs use hard-coded paired/authenticated responses and mock file records |
| VFS persistence | In-memory only; state is lost when server restarts |
| Localization/syntax | Asset browsing exists; full editing/validation not demonstrated |

### Repository corrections committed
- Replaced hard-coded APK summary values with archive-derived values and explicit unverified fields.
- Marked runtime, signing and root tests as not run instead of passing.
- Removed fake APK signing success output.
- Replaced simulated Android launch success with a not-connected status.
- Replaced bypass execution simulation with read-only native module inventory.
- Changed server health response to report a web service, not a rooted Android 14 emulator.
- Removed fabricated DEX version/class-count/method-utilization UI metrics.

### Remaining implementation work
1. Add binary AndroidManifest.xml decoder and permission/SDK/package extraction.
2. Add a DEX parser for header/table validation and accurate class/method inspection.
3. Add APK Signature Scheme verification using a genuine verifier (never infer validity from key files).
4. Replace mock VFS with explicit uploaded-workspace storage; add path containment, atomic writes and tests.
5. Implement secure, token-based pairing only for a real connected agent; remove hard-coded authentication success.
6. Add real ADB/emulator integration before claiming app launch, root, package-manager, logcat or terminal operations.
7. Implement complete editing/build workflows (AXML, ARSC, DEX, text, hex) with backups and integrity checks, subject to licensing and authorization.

### Build/verification limitation
A full local build was not run in this audit environment because the GitHub repository could be read/updated through the connected GitHub integration but the container could not clone the repository (DNS/network resolution unavailable). No Android runtime tests were run.