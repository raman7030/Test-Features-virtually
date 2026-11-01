package org.bouncycastle.crypto.agreement.ecjpake;

import java.math.BigInteger;
import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class ECSchnorrZKP {

    /* JADX INFO: renamed from: V */
    public final ECPoint f80749V;

    /* JADX INFO: renamed from: r */
    public final BigInteger f80750r;

    public ECSchnorrZKP(ECPoint eCPoint, BigInteger bigInteger) {
        this.f80749V = eCPoint;
        this.f80750r = bigInteger;
    }

    public ECPoint getV() {
        return this.f80749V;
    }

    public BigInteger getr() {
        return this.f80750r;
    }
}
