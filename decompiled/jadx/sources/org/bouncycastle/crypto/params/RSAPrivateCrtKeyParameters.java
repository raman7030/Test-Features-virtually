package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    /* JADX INFO: renamed from: dP */
    public BigInteger f81278dP;

    /* JADX INFO: renamed from: dQ */
    public BigInteger f81279dQ;

    /* JADX INFO: renamed from: e */
    public BigInteger f81280e;

    /* JADX INFO: renamed from: p */
    public BigInteger f81281p;

    /* JADX INFO: renamed from: q */
    public BigInteger f81282q;
    public BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8, false);
    }

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8, boolean z) {
        super(true, bigInteger, bigInteger3, z);
        this.f81280e = bigInteger2;
        this.f81281p = bigInteger4;
        this.f81282q = bigInteger5;
        this.f81278dP = bigInteger6;
        this.f81279dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.f81278dP;
    }

    public BigInteger getDQ() {
        return this.f81279dQ;
    }

    public BigInteger getP() {
        return this.f81281p;
    }

    public BigInteger getPublicExponent() {
        return this.f81280e;
    }

    public BigInteger getQ() {
        return this.f81282q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}
