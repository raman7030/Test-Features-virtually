package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SLHDSAPublicKeyParameters extends SLHDSAKeyParameters {

    /* JADX INFO: renamed from: pk */
    public final C2371PK f81746pk;

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, C2371PK c2371pk) {
        super(false, sLHDSAParameters);
        this.f81746pk = c2371pk;
    }

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr) {
        super(false, sLHDSAParameters);
        int n = sLHDSAParameters.getN();
        int i = n * 2;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f81746pk = new C2371PK(Arrays.copyOfRange(bArr, 0, n), Arrays.copyOfRange(bArr, n, i));
    }

    public byte[] getEncoded() {
        C2371PK c2371pk = this.f81746pk;
        return Arrays.concatenate(c2371pk.seed, c2371pk.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f81746pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f81746pk.seed);
    }
}
