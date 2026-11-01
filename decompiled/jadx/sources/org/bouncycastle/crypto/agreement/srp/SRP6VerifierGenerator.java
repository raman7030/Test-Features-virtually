package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes.dex */
public class SRP6VerifierGenerator {

    /* JADX INFO: renamed from: N */
    public BigInteger f80787N;
    public Digest digest;

    /* JADX INFO: renamed from: g */
    public BigInteger f80788g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f80788g.modPow(SRP6Util.calculateX(this.digest, this.f80787N, bArr, bArr2, bArr3), this.f80787N);
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f80787N = bigInteger;
        this.f80788g = bigInteger2;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f80787N = sRP6GroupParameters.getN();
        this.f80788g = sRP6GroupParameters.getG();
        this.digest = digest;
    }
}
