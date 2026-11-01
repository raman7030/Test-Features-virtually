package p067l;

/* JADX INFO: renamed from: l.ۡ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11037 extends AbstractC18412 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C17741 f30571;

    public C11037(C17741 c17741) {
        this.f30571 = c17741;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25446() {
        AbstractC5002 abstractC5002 = this.f30571.f52994;
        int i = 256;
        int iM34897 = abstractC5002.f11424.m34897(abstractC5002.f11420) | 256;
        boolean zM5008 = abstractC5002.f56944.m5008();
        short[] sArr = this.f54980;
        if (zM5008) {
            do {
                abstractC5002.f11427.m38716(sArr, iM34897 >>> 8, (iM34897 >>> 7) & 1);
                iM34897 <<= 1;
            } while (iM34897 < 65536);
        } else {
            int iM34898 = abstractC5002.f11424.m34897(abstractC5002.f56940[0] + 1 + abstractC5002.f11420);
            do {
                iM34898 <<= 1;
                abstractC5002.f11427.m38716(sArr, (iM34898 & i) + i + (iM34897 >>> 8), (iM34897 >>> 7) & 1);
                iM34897 <<= 1;
                i &= ~(iM34898 ^ iM34897);
            } while (iM34897 < 65536);
        }
        abstractC5002.f56944.m5012();
    }
}
