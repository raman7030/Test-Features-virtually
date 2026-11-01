package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class FalconPrivateKeyParameters extends FalconKeyParameters {

    /* JADX INFO: renamed from: F */
    public final byte[] f81594F;

    /* JADX INFO: renamed from: f */
    public final byte[] f81595f;

    /* JADX INFO: renamed from: g */
    public final byte[] f81596g;

    /* JADX INFO: renamed from: pk */
    public final byte[] f81597pk;

    public FalconPrivateKeyParameters(FalconParameters falconParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, falconParameters);
        this.f81595f = Arrays.clone(bArr);
        this.f81596g = Arrays.clone(bArr2);
        this.f81594F = Arrays.clone(bArr3);
        this.f81597pk = Arrays.clone(bArr4);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f81595f, this.f81596g, this.f81594F);
    }

    public byte[] getG() {
        return Arrays.clone(this.f81596g);
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.f81597pk);
    }

    public byte[] getSpolyF() {
        return Arrays.clone(this.f81594F);
    }

    public byte[] getSpolyf() {
        return Arrays.clone(this.f81595f);
    }
}
