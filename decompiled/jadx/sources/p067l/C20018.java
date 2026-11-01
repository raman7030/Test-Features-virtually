package p067l;

/* JADX INFO: renamed from: l.ᩴۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20018 implements InterfaceC4595 {

    /* JADX INFO: renamed from: ᩶ */
    public final int f60846;

    /* JADX INFO: renamed from: ᩸ */
    public int f60847;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC5936 f60848;

    public C20018(AbstractC5936 abstractC5936, int i) {
        this.f60848 = abstractC5936;
        this.f60846 = i;
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public final void mo8466(int i) {
        if (this.f60847 != i) {
            this.f60847 = i;
            AbstractC5936 abstractC5936 = this.f60848;
            int i2 = 0;
            for (C20018 c20018 : abstractC5936.f14651) {
                i2 += c20018.f60847 * c20018.f60846;
            }
            int i3 = i2 / 10000;
            if (abstractC5936.f14650 != i3) {
                abstractC5936.f14650 = i3;
                abstractC5936.f14649.mo8466(i3);
            }
        }
    }
}
