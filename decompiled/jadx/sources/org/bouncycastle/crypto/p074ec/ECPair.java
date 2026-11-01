package org.bouncycastle.crypto.p074ec;

import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class ECPair {

    /* JADX INFO: renamed from: x */
    public final ECPoint f80947x;

    /* JADX INFO: renamed from: y */
    public final ECPoint f80948y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f80947x = eCPoint;
        this.f80948y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f80947x;
    }

    public ECPoint getY() {
        return this.f80948y;
    }

    public int hashCode() {
        return (this.f80948y.hashCode() * 37) + this.f80947x.hashCode();
    }
}
