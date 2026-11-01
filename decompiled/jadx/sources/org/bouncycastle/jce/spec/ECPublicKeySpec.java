package org.bouncycastle.jce.spec;

import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* JADX INFO: renamed from: q */
    public ECPoint f81389q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.f81389q = eCPoint.normalize();
        } else {
            this.f81389q = eCPoint;
        }
    }

    public ECPoint getQ() {
        return this.f81389q;
    }
}
