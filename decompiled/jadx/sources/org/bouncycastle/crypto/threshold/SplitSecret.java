package org.bouncycastle.crypto.threshold;

/* JADX INFO: loaded from: classes.dex */
public interface SplitSecret {
    byte[] getSecret();

    SecretShare[] getSecretShares();
}
