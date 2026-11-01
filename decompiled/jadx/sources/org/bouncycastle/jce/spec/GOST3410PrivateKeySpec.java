package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a */
    public BigInteger f81394a;

    /* JADX INFO: renamed from: p */
    public BigInteger f81395p;

    /* JADX INFO: renamed from: q */
    public BigInteger f81396q;

    /* JADX INFO: renamed from: x */
    public BigInteger f81397x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f81397x = bigInteger;
        this.f81395p = bigInteger2;
        this.f81396q = bigInteger3;
        this.f81394a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f81394a;
    }

    public BigInteger getP() {
        return this.f81395p;
    }

    public BigInteger getQ() {
        return this.f81396q;
    }

    public BigInteger getX() {
        return this.f81397x;
    }
}
