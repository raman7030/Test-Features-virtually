package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class SRP6GroupParameters {

    /* JADX INFO: renamed from: N */
    public BigInteger f81292N;

    /* JADX INFO: renamed from: g */
    public BigInteger f81293g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f81292N = bigInteger;
        this.f81293g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f81293g;
    }

    public BigInteger getN() {
        return this.f81292N;
    }
}
