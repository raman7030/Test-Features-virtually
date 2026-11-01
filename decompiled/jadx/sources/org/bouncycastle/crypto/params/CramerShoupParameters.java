package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes.dex */
public class CramerShoupParameters implements CipherParameters {

    /* JADX INFO: renamed from: H */
    public Digest f81216H;

    /* JADX INFO: renamed from: g1 */
    public BigInteger f81217g1;

    /* JADX INFO: renamed from: g2 */
    public BigInteger f81218g2;

    /* JADX INFO: renamed from: p */
    public BigInteger f81219p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f81219p = bigInteger;
        this.f81217g1 = bigInteger2;
        this.f81218g2 = bigInteger3;
        Digest digest2 = (Digest) ((Memoable) digest).copy();
        this.f81216H = digest2;
        digest2.reset();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f81219p) && cramerShoupParameters.getG1().equals(this.f81217g1) && cramerShoupParameters.getG2().equals(this.f81218g2);
    }

    public BigInteger getG1() {
        return this.f81217g1;
    }

    public BigInteger getG2() {
        return this.f81218g2;
    }

    public Digest getH() {
        return (Digest) ((Memoable) this.f81216H).copy();
    }

    public BigInteger getP() {
        return this.f81219p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
