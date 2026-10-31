package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes.dex */
public interface AsymmetricCipherKeyPairGenerator {
    AsymmetricCipherKeyPair generateKeyPair();

    void init(KeyGenerationParameters keyGenerationParameters);
}
