package l;

/* JADX INFO: renamed from: l.ۡ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9121 extends AbstractC16881 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16175 f27631;

    public C9121(C16175 c16175) {
        this.f27631 = c16175;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23495() {
        AbstractC2771 abstractC2771 = this.f27631.f49828;
        int i = 256;
        int iM32782 = abstractC2771.f8630.m32782(abstractC2771.f8626) | 256;
        boolean zM2668 = abstractC2771.f53750.m2668();
        short[] sArr = this.f51799;
        if (zM2668) {
            do {
                abstractC2771.f8633.m36557(sArr, iM32782 >>> 8, (iM32782 >>> 7) & 1);
                iM32782 <<= 1;
            } while (iM32782 < 65536);
        } else {
            int iM32783 = abstractC2771.f8630.m32782(abstractC2771.f53746[0] + 1 + abstractC2771.f8626);
            do {
                iM32783 <<= 1;
                abstractC2771.f8633.m36557(sArr, (iM32783 & i) + i + (iM32782 >>> 8), (iM32782 >>> 7) & 1);
                iM32782 <<= 1;
                i &= ~(iM32783 ^ iM32782);
            } while (iM32782 < 65536);
        }
        abstractC2771.f53750.m2672();
    }
}
