package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: g */
    public BigInteger f81390g;

    /* JADX INFO: renamed from: p */
    public BigInteger f81391p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f81391p = bigInteger;
        this.f81390g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f81390g;
    }

    public BigInteger getP() {
        return this.f81391p;
    }
}
