package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: pk */
    public CramerShoupPublicKeyParameters f81220pk;

    /* JADX INFO: renamed from: x1 */
    public BigInteger f81221x1;

    /* JADX INFO: renamed from: x2 */
    public BigInteger f81222x2;

    /* JADX INFO: renamed from: y1 */
    public BigInteger f81223y1;

    /* JADX INFO: renamed from: y2 */
    public BigInteger f81224y2;

    /* JADX INFO: renamed from: z */
    public BigInteger f81225z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f81221x1 = bigInteger;
        this.f81222x2 = bigInteger2;
        this.f81223y1 = bigInteger3;
        this.f81224y2 = bigInteger4;
        this.f81225z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f81221x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f81222x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f81223y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f81224y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f81225z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f81220pk;
    }

    public BigInteger getX1() {
        return this.f81221x1;
    }

    public BigInteger getX2() {
        return this.f81222x2;
    }

    public BigInteger getY1() {
        return this.f81223y1;
    }

    public BigInteger getY2() {
        return this.f81224y2;
    }

    public BigInteger getZ() {
        return this.f81225z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f81221x1.hashCode() ^ this.f81222x2.hashCode()) ^ this.f81223y1.hashCode()) ^ this.f81224y2.hashCode()) ^ this.f81225z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f81220pk = cramerShoupPublicKeyParameters;
    }
}
