package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g */
    public BigInteger f81253g;

    /* JADX INFO: renamed from: l */
    public int f81254l;

    /* JADX INFO: renamed from: p */
    public BigInteger f81255p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f81253g = bigInteger2;
        this.f81255p = bigInteger;
        this.f81254l = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f81255p) && elGamalParameters.getG().equals(this.f81253g) && elGamalParameters.getL() == this.f81254l;
    }

    public BigInteger getG() {
        return this.f81253g;
    }

    public int getL() {
        return this.f81254l;
    }

    public BigInteger getP() {
        return this.f81255p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f81254l;
    }
}
