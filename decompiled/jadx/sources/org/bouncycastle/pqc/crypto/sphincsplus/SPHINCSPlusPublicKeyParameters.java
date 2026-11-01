package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SPHINCSPlusPublicKeyParameters extends SPHINCSPlusKeyParameters {

    /* JADX INFO: renamed from: pk */
    public final C2374PK f81788pk;

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, C2374PK c2374pk) {
        super(false, sPHINCSPlusParameters);
        this.f81788pk = c2374pk;
    }

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(false, sPHINCSPlusParameters);
        int n = sPHINCSPlusParameters.getN();
        int i = n * 2;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f81788pk = new C2374PK(Arrays.copyOfRange(bArr, 0, n), Arrays.copyOfRange(bArr, n, i));
    }

    public byte[] getEncoded() {
        C2374PK c2374pk = this.f81788pk;
        return Arrays.concatenate(c2374pk.seed, c2374pk.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f81788pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f81788pk.seed);
    }
}
