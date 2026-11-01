package org.bouncycastle.math.p080ec;

/* JADX INFO: loaded from: classes2.dex */
public class ScaleXPointMap implements ECPointMap {
    public final ECFieldElement scale;

    public ScaleXPointMap(ECFieldElement eCFieldElement) {
        this.scale = eCFieldElement;
    }

    @Override // org.bouncycastle.math.p080ec.ECPointMap
    public ECPoint map(ECPoint eCPoint) {
        return eCPoint.scaleX(this.scale);
    }
}
