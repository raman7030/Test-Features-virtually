package org.bouncycastle.crypto.threshold;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ShamirSplitSecretShare implements SecretShare {

    /* JADX INFO: renamed from: r */
    public final int f81326r;
    public final byte[] secretShare;

    public ShamirSplitSecretShare(byte[] bArr) {
        this.secretShare = Arrays.clone(bArr);
        this.f81326r = 1;
    }

    public ShamirSplitSecretShare(byte[] bArr, int i) {
        this.secretShare = Arrays.clone(bArr);
        this.f81326r = i;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Arrays.clone(this.secretShare);
    }
}
