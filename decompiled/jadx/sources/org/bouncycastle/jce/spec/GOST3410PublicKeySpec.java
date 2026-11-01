package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a */
    public BigInteger f81401a;

    /* JADX INFO: renamed from: p */
    public BigInteger f81402p;

    /* JADX INFO: renamed from: q */
    public BigInteger f81403q;

    /* JADX INFO: renamed from: y */
    public BigInteger f81404y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f81404y = bigInteger;
        this.f81402p = bigInteger2;
        this.f81403q = bigInteger3;
        this.f81401a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f81401a;
    }

    public BigInteger getP() {
        return this.f81402p;
    }

    public BigInteger getQ() {
        return this.f81403q;
    }

    public BigInteger getY() {
        return this.f81404y;
    }
}
