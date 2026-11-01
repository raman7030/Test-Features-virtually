package org.bouncycastle.crypto.threshold;

import org.bouncycastle.crypto.digests.WhirlpoolDigest;

/* JADX INFO: loaded from: classes.dex */
public class PolynomialNative extends Polynomial {
    public final int IRREDUCIBLE;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.threshold.PolynomialNative$1 */
    public /* synthetic */ class C22091 {

        /* JADX INFO: renamed from: $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm */
        public static final /* synthetic */ int[] f81323xc314a858;

        static {
            int[] iArr = new int[ShamirSecretSplitter.Algorithm.values().length];
            f81323xc314a858 = iArr;
            try {
                iArr[ShamirSecretSplitter.Algorithm.AES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81323xc314a858[ShamirSecretSplitter.Algorithm.RSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolynomialNative(ShamirSecretSplitter.Algorithm algorithm) {
        int i;
        int i2 = C22091.f81323xc314a858[algorithm.ordinal()];
        if (i2 == 1) {
            i = 283;
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("The algorithm is not correct");
            }
            i = WhirlpoolDigest.REDUCTION_POLYNOMIAL;
        }
        this.IRREDUCIBLE = i;
    }

    @Override // org.bouncycastle.crypto.threshold.Polynomial
    public byte gfDiv(int i, int i2) {
        return gfMul(i, gfPow((byte) i2, (byte) -2) & 255);
    }

    @Override // org.bouncycastle.crypto.threshold.Polynomial
    public byte gfMul(int i, int i2) {
        int i3 = 0;
        while (i2 > 0) {
            if ((i2 & 1) != 0) {
                i3 ^= i;
            }
            i <<= 1;
            if ((i & 256) != 0) {
                i ^= this.IRREDUCIBLE;
            }
            i2 >>= 1;
        }
        while (i3 >= 256) {
            if ((i3 & 256) != 0) {
                i3 ^= this.IRREDUCIBLE;
            }
            i3 <<= 1;
        }
        return (byte) (i3 & 255);
    }
}
