package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SLHDSAPrivateKeyParameters extends SLHDSAKeyParameters {

    /* JADX INFO: renamed from: pk */
    public final C2371PK f81744pk;

    /* JADX INFO: renamed from: sk */
    public final C2372SK f81745sk;

    public SLHDSAPrivateKeyParameters(SLHDSAParameters sLHDSAParameters, C2372SK c2372sk, C2371PK c2371pk) {
        super(true, sLHDSAParameters);
        this.f81745sk = c2372sk;
        this.f81744pk = c2371pk;
    }

    public SLHDSAPrivateKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr) {
        super(true, sLHDSAParameters);
        int n = sLHDSAParameters.getN();
        int i = n * 4;
        if (bArr.length != i) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i2 = n * 2;
        this.f81745sk = new C2372SK(Arrays.copyOfRange(bArr, 0, n), Arrays.copyOfRange(bArr, n, i2));
        int i3 = n * 3;
        this.f81744pk = new C2371PK(Arrays.copyOfRange(bArr, i2, i3), Arrays.copyOfRange(bArr, i3, i));
    }

    public SLHDSAPrivateKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, sLHDSAParameters);
        this.f81745sk = new C2372SK(bArr, bArr2);
        this.f81744pk = new C2371PK(bArr3, bArr4);
    }

    public byte[] getEncoded() {
        C2372SK c2372sk = this.f81745sk;
        byte[] bArr = c2372sk.seed;
        byte[] bArr2 = c2372sk.prf;
        C2371PK c2371pk = this.f81744pk;
        return Arrays.concatenate(new byte[][]{bArr, bArr2, c2371pk.seed, c2371pk.root});
    }

    public byte[] getEncodedPublicKey() {
        C2371PK c2371pk = this.f81744pk;
        return Arrays.concatenate(c2371pk.seed, c2371pk.root);
    }

    public byte[] getPrf() {
        return Arrays.clone(this.f81745sk.prf);
    }

    public byte[] getPublicKey() {
        C2371PK c2371pk = this.f81744pk;
        return Arrays.concatenate(c2371pk.seed, c2371pk.root);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.f81744pk.seed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f81744pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f81745sk.seed);
    }
}
