# Authorized Android package decompilation

This repository contains a reproducible workflow for converting an authorized Android APK (or ZIP-wrapped APK) into readable, inspectable output.

## What it produces

- `decompiled/jadx/`: best-effort reconstructed Java source and JADX resources.
- `decompiled/apktool/`: decoded Android manifest/resources, assets, package structure, and Smali disassembly.
- `decompiled/README.md`: input checksum, tool versions, and limitations.

**Important:** Decompiled Java is reconstructed output, not the original source project. Obfuscated names, optimized control flow, missing debug metadata, and native code can prevent exact recovery. Native `.so` libraries remain binary.

## Run it

1. Open **Actions → Decompile authorized Android package → Run workflow**.
2. Supply an HTTPS direct-download URL for the APK/ZIP and its expected SHA-256.
3. If no URL is supplied, the workflow looks for `decompile-input/test.zip` already present in the repository.
4. After a successful run, the workflow commits the output under `decompiled/` on the selected branch.

The workflow verifies the supplied archive checksum and verifies the pinned JADX and Apktool release checksums before running either tool.

## Privacy and authorization

Only use this workflow for applications you own or are expressly authorized to analyze. If the repository is public, any committed input archive or decompiled output may be publicly visible. Do not put secrets, signing keys, credentials, private user data, or an archive you are not authorized to redistribute into a public repository.
