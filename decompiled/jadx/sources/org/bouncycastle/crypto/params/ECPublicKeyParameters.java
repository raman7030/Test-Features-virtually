package org.bouncycastle.crypto.params;

import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECPublicKeyParameters extends ECKeyParameters {

    /* JADX INFO: renamed from: q */
    public final ECPoint f81252q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f81252q = eCDomainParameters.validatePublicPoint(eCPoint);
    }

    public ECPoint getQ() {
        return this.f81252q;
    }
}
