package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SPHINCSPlusPrivateKeyParameters extends SPHINCSPlusKeyParameters {

    /* JADX INFO: renamed from: pk */
    public final C2374PK f81786pk;

    /* JADX INFO: renamed from: sk */
    public final C2375SK f81787sk;

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, C2375SK c2375sk, C2374PK c2374pk) {
        super(true, sPHINCSPlusParameters);
        this.f81787sk = c2375sk;
        this.f81786pk = c2374pk;
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(true, sPHINCSPlusParameters);
        int n = sPHINCSPlusParameters.getN();
        int i = n * 4;
        if (bArr.length != i) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i2 = n * 2;
        this.f81787sk = new C2375SK(Arrays.copyOfRange(bArr, 0, n), Arrays.copyOfRange(bArr, n, i2));
        int i3 = n * 3;
        this.f81786pk = new C2374PK(Arrays.copyOfRange(bArr, i2, i3), Arrays.copyOfRange(bArr, i3, i));
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, sPHINCSPlusParameters);
        this.f81787sk = new C2375SK(bArr, bArr2);
        this.f81786pk = new C2374PK(bArr3, bArr4);
    }

    public byte[] getEncoded() {
        C2375SK c2375sk = this.f81787sk;
        byte[] bArr = c2375sk.seed;
        byte[] bArr2 = c2375sk.prf;
        C2374PK c2374pk = this.f81786pk;
        return Arrays.concatenate(new byte[][]{bArr, bArr2, c2374pk.seed, c2374pk.root});
    }

    public byte[] getEncodedPublicKey() {
        C2374PK c2374pk = this.f81786pk;
        return Arrays.concatenate(c2374pk.seed, c2374pk.root);
    }

    public byte[] getPrf() {
        return Arrays.clone(this.f81787sk.prf);
    }

    public byte[] getPublicKey() {
        C2374PK c2374pk = this.f81786pk;
        return Arrays.concatenate(c2374pk.seed, c2374pk.root);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.f81786pk.seed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f81786pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f81787sk.seed);
    }
}
