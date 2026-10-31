package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes.dex */
public class ElGamalParameters implements CipherParameters {
    public BigInteger g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f77972l;
    public BigInteger p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.g = bigInteger2;
        this.p = bigInteger;
        this.f77972l = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.p) && elGamalParameters.getG().equals(this.g) && elGamalParameters.getL() == this.f77972l;
    }

    public BigInteger getG() {
        return this.g;
    }

    public int getL() {
        return this.f77972l;
    }

    public BigInteger getP() {
        return this.p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f77972l;
    }
}
