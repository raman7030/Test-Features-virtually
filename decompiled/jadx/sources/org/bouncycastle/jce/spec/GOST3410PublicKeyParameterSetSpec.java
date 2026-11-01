package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* JADX INFO: renamed from: a */
    public BigInteger f81398a;

    /* JADX INFO: renamed from: p */
    public BigInteger f81399p;

    /* JADX INFO: renamed from: q */
    public BigInteger f81400q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f81399p = bigInteger;
        this.f81400q = bigInteger2;
        this.f81398a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f81398a.equals(gOST3410PublicKeyParameterSetSpec.f81398a) && this.f81399p.equals(gOST3410PublicKeyParameterSetSpec.f81399p) && this.f81400q.equals(gOST3410PublicKeyParameterSetSpec.f81400q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f81398a;
    }

    public BigInteger getP() {
        return this.f81399p;
    }

    public BigInteger getQ() {
        return this.f81400q;
    }

    public int hashCode() {
        return (this.f81398a.hashCode() ^ this.f81399p.hashCode()) ^ this.f81400q.hashCode();
    }
}
