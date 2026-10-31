package org.bouncycastle.crypto.threshold;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class ShamirSplitSecret implements SplitSecret {
    public final Polynomial poly;
    public final ShamirSplitSecretShare[] secretShares;

    public ShamirSplitSecret(Polynomial polynomial, ShamirSplitSecretShare[] shamirSplitSecretShareArr) {
        this.secretShares = shamirSplitSecretShareArr;
        this.poly = polynomial;
    }

    public ShamirSplitSecret(ShamirSecretSplitter.Algorithm algorithm, ShamirSecretSplitter.Mode mode, ShamirSplitSecretShare[] shamirSplitSecretShareArr) {
        this.secretShares = shamirSplitSecretShareArr;
        this.poly = Polynomial.newInstance(algorithm, mode);
    }

    public ShamirSplitSecret divide(int i) {
        int i2 = 0;
        while (true) {
            ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
            if (i2 >= shamirSplitSecretShareArr.length) {
                return this;
            }
            byte[] encoded = shamirSplitSecretShareArr[i2].getEncoded();
            for (int i3 = 0; i3 < encoded.length; i3++) {
                encoded[i3] = this.poly.gfDiv(encoded[i3] & 255, i);
            }
            int i4 = i2 + 1;
            this.secretShares[i2] = new ShamirSplitSecretShare(encoded, i4);
            i2 = i4;
        }
    }

    @Override // org.bouncycastle.crypto.threshold.SplitSecret
    public byte[] getSecret() {
        ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
        int length = shamirSplitSecretShareArr.length;
        byte[] bArr = new byte[length];
        int i = length - 1;
        byte[] bArr2 = new byte[i];
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, length, shamirSplitSecretShareArr[0].getEncoded().length);
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = this.secretShares[i2].getEncoded();
            byte b = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (i3 != i2) {
                    Polynomial polynomial = this.poly;
                    ShamirSplitSecretShare[] shamirSplitSecretShareArr2 = this.secretShares;
                    int i4 = shamirSplitSecretShareArr2[i3].r;
                    bArr2[b] = polynomial.gfDiv(i4, shamirSplitSecretShareArr2[i2].r ^ i4);
                    b = (byte) (b + 1);
                }
            }
            byte bGfMul = 1;
            for (int i5 = 0; i5 != i; i5++) {
                bGfMul = this.poly.gfMul(bGfMul & 255, bArr2[i5] & 255);
            }
            bArr[i2] = bGfMul;
        }
        return this.poly.gfVecMul(bArr, bArr3);
    }

    @Override // org.bouncycastle.crypto.threshold.SplitSecret
    public ShamirSplitSecretShare[] getSecretShares() {
        return this.secretShares;
    }

    public ShamirSplitSecret multiple(int i) {
        int i2 = 0;
        while (true) {
            ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
            if (i2 >= shamirSplitSecretShareArr.length) {
                return this;
            }
            byte[] encoded = shamirSplitSecretShareArr[i2].getEncoded();
            for (int i3 = 0; i3 < encoded.length; i3++) {
                encoded[i3] = this.poly.gfMul(encoded[i3] & 255, i);
            }
            int i4 = i2 + 1;
            this.secretShares[i2] = new ShamirSplitSecretShare(encoded, i4);
            i2 = i4;
        }
    }
}
