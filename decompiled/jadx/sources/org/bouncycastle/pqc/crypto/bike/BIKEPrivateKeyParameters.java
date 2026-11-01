package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class BIKEPrivateKeyParameters extends BIKEKeyParameters {

    /* JADX INFO: renamed from: h0 */
    public byte[] f81578h0;

    /* JADX INFO: renamed from: h1 */
    public byte[] f81579h1;
    public byte[] sigma;

    public BIKEPrivateKeyParameters(BIKEParameters bIKEParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(true, bIKEParameters);
        this.f81578h0 = Arrays.clone(bArr);
        this.f81579h1 = Arrays.clone(bArr2);
        this.sigma = Arrays.clone(bArr3);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f81578h0, this.f81579h1, this.sigma);
    }

    public byte[] getH0() {
        return this.f81578h0;
    }

    public byte[] getH1() {
        return this.f81579h1;
    }

    public byte[] getSigma() {
        return this.sigma;
    }
}
