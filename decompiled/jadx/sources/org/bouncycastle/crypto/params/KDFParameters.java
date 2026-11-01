package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes.dex */
public class KDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: iv */
    public byte[] f81273iv;
    public byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f81273iv = bArr2;
    }

    public byte[] getIV() {
        return this.f81273iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
