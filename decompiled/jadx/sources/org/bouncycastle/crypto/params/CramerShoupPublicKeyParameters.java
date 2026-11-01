package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c */
    public BigInteger f81226c;

    /* JADX INFO: renamed from: d */
    public BigInteger f81227d;

    /* JADX INFO: renamed from: h */
    public BigInteger f81228h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f81226c = bigInteger;
        this.f81227d = bigInteger2;
        this.f81228h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f81226c) && cramerShoupPublicKeyParameters.getD().equals(this.f81227d) && cramerShoupPublicKeyParameters.getH().equals(this.f81228h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f81226c;
    }

    public BigInteger getD() {
        return this.f81227d;
    }

    public BigInteger getH() {
        return this.f81228h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f81226c.hashCode() ^ this.f81227d.hashCode()) ^ this.f81228h.hashCode()) ^ super.hashCode();
    }
}
