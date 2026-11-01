package org.bouncycastle.crypto.modes.kgcm;

/* JADX INFO: loaded from: classes.dex */
public class BasicKGCMMultiplier_512 implements KGCMMultiplier {

    /* JADX INFO: renamed from: H */
    public final long[] f81212H = new long[8];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_512.copy(jArr, this.f81212H);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_512.multiply(jArr, this.f81212H, jArr);
    }
}
