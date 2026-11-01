package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g */
    public BigInteger f81239g;

    /* JADX INFO: renamed from: p */
    public BigInteger f81240p;

    /* JADX INFO: renamed from: q */
    public BigInteger f81241q;
    public DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f81239g = bigInteger3;
        this.f81240p = bigInteger;
        this.f81241q = bigInteger2;
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f81239g = bigInteger3;
        this.f81240p = bigInteger;
        this.f81241q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f81240p) && dSAParameters.getQ().equals(this.f81241q) && dSAParameters.getG().equals(this.f81239g);
    }

    public BigInteger getG() {
        return this.f81239g;
    }

    public BigInteger getP() {
        return this.f81240p;
    }

    public BigInteger getQ() {
        return this.f81241q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }
}
