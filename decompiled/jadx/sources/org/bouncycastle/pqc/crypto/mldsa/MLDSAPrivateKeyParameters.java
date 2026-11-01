package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class MLDSAPrivateKeyParameters extends MLDSAKeyParameters {
    public static final int BOTH = 0;
    public static final int EXPANDED_KEY = 2;
    public static final int SEED_ONLY = 1;

    /* JADX INFO: renamed from: k */
    public final byte[] f81668k;
    public final int prefFormat;
    public final byte[] rho;

    /* JADX INFO: renamed from: s1 */
    public final byte[] f81669s1;

    /* JADX INFO: renamed from: s2 */
    public final byte[] f81670s2;
    public final byte[] seed;

    /* JADX INFO: renamed from: t0 */
    public final byte[] f81671t0;

    /* JADX INFO: renamed from: t1 */
    public final byte[] f81672t1;

    /* JADX INFO: renamed from: tr */
    public final byte[] f81673tr;

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr) {
        this(mLDSAParameters, bArr, null);
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, MLDSAPublicKeyParameters mLDSAPublicKeyParameters) {
        super(true, mLDSAParameters);
        MLDSAEngine engine = mLDSAParameters.getEngine(null);
        if (bArr.length == 32) {
            byte[][] bArrGenerateKeyPairInternal = engine.generateKeyPairInternal(bArr);
            this.rho = bArrGenerateKeyPairInternal[0];
            this.f81668k = bArrGenerateKeyPairInternal[1];
            this.f81673tr = bArrGenerateKeyPairInternal[2];
            this.f81669s1 = bArrGenerateKeyPairInternal[3];
            this.f81670s2 = bArrGenerateKeyPairInternal[4];
            this.f81671t0 = bArrGenerateKeyPairInternal[5];
            this.f81672t1 = bArrGenerateKeyPairInternal[6];
            this.seed = bArrGenerateKeyPairInternal[7];
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 32);
            this.rho = bArrCopyOfRange;
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 32, 64);
            this.f81668k = bArrCopyOfRange2;
            byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr, 64, 128);
            this.f81673tr = bArrCopyOfRange3;
            int dilithiumL = (engine.getDilithiumL() * engine.getDilithiumPolyEtaPackedBytes()) + 128;
            byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr, 128, dilithiumL);
            this.f81669s1 = bArrCopyOfRange4;
            int dilithiumK = (engine.getDilithiumK() * engine.getDilithiumPolyEtaPackedBytes()) + dilithiumL;
            byte[] bArrCopyOfRange5 = Arrays.copyOfRange(bArr, dilithiumL, dilithiumK);
            this.f81670s2 = bArrCopyOfRange5;
            byte[] bArrCopyOfRange6 = Arrays.copyOfRange(bArr, dilithiumK, (engine.getDilithiumK() * 416) + dilithiumK);
            this.f81671t0 = bArrCopyOfRange6;
            this.f81672t1 = engine.deriveT1(bArrCopyOfRange, bArrCopyOfRange2, bArrCopyOfRange3, bArrCopyOfRange4, bArrCopyOfRange5, bArrCopyOfRange6);
            this.seed = null;
        }
        if (mLDSAPublicKeyParameters != null && !Arrays.constantTimeAreEqual(this.f81672t1, mLDSAPublicKeyParameters.getT1())) {
            throw new IllegalArgumentException("passed in public key does not match private values");
        }
        this.prefFormat = this.seed != null ? 0 : 2;
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        this(mLDSAParameters, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, null);
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        super(true, mLDSAParameters);
        this.rho = Arrays.clone(bArr);
        this.f81668k = Arrays.clone(bArr2);
        this.f81673tr = Arrays.clone(bArr3);
        this.f81669s1 = Arrays.clone(bArr4);
        this.f81670s2 = Arrays.clone(bArr5);
        this.f81671t0 = Arrays.clone(bArr6);
        this.f81672t1 = Arrays.clone(bArr7);
        this.seed = Arrays.clone(bArr8);
        this.prefFormat = bArr8 != null ? 0 : 2;
    }

    public MLDSAPrivateKeyParameters(MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters, int i) {
        super(true, mLDSAPrivateKeyParameters.getParameters());
        this.rho = mLDSAPrivateKeyParameters.rho;
        this.f81668k = mLDSAPrivateKeyParameters.f81668k;
        this.f81673tr = mLDSAPrivateKeyParameters.f81673tr;
        this.f81669s1 = mLDSAPrivateKeyParameters.f81669s1;
        this.f81670s2 = mLDSAPrivateKeyParameters.f81670s2;
        this.f81671t0 = mLDSAPrivateKeyParameters.f81671t0;
        this.f81672t1 = mLDSAPrivateKeyParameters.f81672t1;
        this.seed = mLDSAPrivateKeyParameters.seed;
        this.prefFormat = i;
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.rho, this.f81668k, this.f81673tr, this.f81669s1, this.f81670s2, this.f81671t0});
    }

    public byte[] getK() {
        return Arrays.clone(this.f81668k);
    }

    public MLDSAPrivateKeyParameters getParametersWithFormat(int i) {
        if (this.prefFormat == i) {
            return this;
        }
        if (i == 0 || i == 1) {
            if (this.seed == null) {
                throw new IllegalStateException("no seed available");
            }
        } else if (i != 2) {
            throw new IllegalArgumentException("unknown format");
        }
        return new MLDSAPrivateKeyParameters(this, i);
    }

    public int getPreferredFormat() {
        return this.prefFormat;
    }

    @Deprecated
    public byte[] getPrivateKey() {
        return getEncoded();
    }

    public byte[] getPublicKey() {
        return MLDSAPublicKeyParameters.getEncoded(this.rho, this.f81672t1);
    }

    public MLDSAPublicKeyParameters getPublicKeyParameters() {
        if (this.f81672t1 == null) {
            return null;
        }
        return new MLDSAPublicKeyParameters(getParameters(), this.rho, this.f81672t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS1() {
        return Arrays.clone(this.f81669s1);
    }

    public byte[] getS2() {
        return Arrays.clone(this.f81670s2);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public byte[] getT0() {
        return Arrays.clone(this.f81671t0);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f81672t1);
    }

    public byte[] getTr() {
        return Arrays.clone(this.f81673tr);
    }
}
