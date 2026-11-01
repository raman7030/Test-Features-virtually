package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes.dex */
public class GSKKDFParameters implements DerivationParameters {
    public final byte[] nonce;
    public final int startCounter;

    /* JADX INFO: renamed from: z */
    public final byte[] f80764z;

    public GSKKDFParameters(byte[] bArr, int i) {
        this(bArr, i, null);
    }

    public GSKKDFParameters(byte[] bArr, int i, byte[] bArr2) {
        this.f80764z = bArr;
        this.startCounter = i;
        this.nonce = bArr2;
    }

    public byte[] getNonce() {
        return this.nonce;
    }

    public int getStartCounter() {
        return this.startCounter;
    }

    public byte[] getZ() {
        return this.f80764z;
    }
}
