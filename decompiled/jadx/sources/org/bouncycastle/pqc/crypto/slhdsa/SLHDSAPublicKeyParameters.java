package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SLHDSAPublicKeyParameters extends SLHDSAKeyParameters {
    public final PK pk;

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, PK pk) {
        super(false, sLHDSAParameters);
        this.pk = pk;
    }

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr) {
        super(false, sLHDSAParameters);
        int n = sLHDSAParameters.getN();
        int i = n * 2;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.pk = new PK(Arrays.copyOfRange(bArr, 0, n), Arrays.copyOfRange(bArr, n, i));
    }

    public byte[] getEncoded() {
        PK pk = this.pk;
        return Arrays.concatenate(pk.seed, pk.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.pk.seed);
    }
}
