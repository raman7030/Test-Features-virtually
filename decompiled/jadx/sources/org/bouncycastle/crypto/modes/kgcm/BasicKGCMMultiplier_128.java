package org.bouncycastle.crypto.modes.kgcm;

/* JADX INFO: loaded from: classes.dex */
public class BasicKGCMMultiplier_128 implements KGCMMultiplier {

    /* JADX INFO: renamed from: H */
    public final long[] f81210H = new long[2];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_128.copy(jArr, this.f81210H);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_128.multiply(jArr, this.f81210H, jArr);
    }
}
