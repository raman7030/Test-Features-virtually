package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class ECParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: G */
    public ECPoint f81385G;
    public ECCurve curve;

    /* JADX INFO: renamed from: h */
    public BigInteger f81386h;

    /* JADX INFO: renamed from: n */
    public BigInteger f81387n;
    public byte[] seed;

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this.curve = eCCurve;
        this.f81385G = eCPoint.normalize();
        this.f81387n = bigInteger;
        this.f81386h = BigInteger.valueOf(1L);
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this.curve = eCCurve;
        this.f81385G = eCPoint.normalize();
        this.f81387n = bigInteger;
        this.f81386h = bigInteger2;
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f81385G = eCPoint.normalize();
        this.f81387n = bigInteger;
        this.f81386h = bigInteger2;
        this.seed = bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ECParameterSpec)) {
            return false;
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
        return getCurve().equals(eCParameterSpec.getCurve()) && getG().equals(eCParameterSpec.getG());
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f81385G;
    }

    public BigInteger getH() {
        return this.f81386h;
    }

    public BigInteger getN() {
        return this.f81387n;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }
}
