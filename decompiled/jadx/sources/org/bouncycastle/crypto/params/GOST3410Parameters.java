package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a */
    public BigInteger f81258a;

    /* JADX INFO: renamed from: p */
    public BigInteger f81259p;

    /* JADX INFO: renamed from: q */
    public BigInteger f81260q;
    public GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f81259p = bigInteger;
        this.f81260q = bigInteger2;
        this.f81258a = bigInteger3;
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f81258a = bigInteger3;
        this.f81259p = bigInteger;
        this.f81260q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f81259p) && gOST3410Parameters.getQ().equals(this.f81260q) && gOST3410Parameters.getA().equals(this.f81258a);
    }

    public BigInteger getA() {
        return this.f81258a;
    }

    public BigInteger getP() {
        return this.f81259p;
    }

    public BigInteger getQ() {
        return this.f81260q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f81259p.hashCode() ^ this.f81260q.hashCode()) ^ this.f81258a.hashCode();
    }
}
