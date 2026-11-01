package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class MLDSAPublicKeyParameters extends MLDSAKeyParameters {
    public final byte[] rho;

    /* JADX INFO: renamed from: t1 */
    public final byte[] f81674t1;

    public MLDSAPublicKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr) {
        super(false, mLDSAParameters);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 32, bArr.length);
        this.f81674t1 = bArrCopyOfRange;
        if (bArrCopyOfRange.length == 0) {
            throw new IllegalArgumentException("encoding too short");
        }
    }

    public MLDSAPublicKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2) {
        super(false, mLDSAParameters);
        if (bArr == null) {
            throw new NullPointerException("rho cannot be null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("t1 cannot be null");
        }
        this.rho = Arrays.clone(bArr);
        this.f81674t1 = Arrays.clone(bArr2);
    }

    public static byte[] getEncoded(byte[] bArr, byte[] bArr2) {
        return Arrays.concatenate(bArr, bArr2);
    }

    public byte[] getEncoded() {
        return getEncoded(this.rho, this.f81674t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f81674t1);
    }
}
