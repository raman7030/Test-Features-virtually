package l;

/* JADX INFO: renamed from: l.ᩴۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18571 implements InterfaceC2343 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f57623;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f57624;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC3754 f57625;

    public C18571(AbstractC3754 abstractC3754, int i) {
        this.f57625 = abstractC3754;
        this.f57623 = i;
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public final void mo6264(int i) {
        if (this.f57624 != i) {
            this.f57624 = i;
            AbstractC3754 abstractC3754 = this.f57625;
            int i2 = 0;
            for (C18571 c18571 : abstractC3754.f11845) {
                i2 += c18571.f57624 * c18571.f57623;
            }
            int i3 = i2 / 10000;
            if (abstractC3754.f11844 != i3) {
                abstractC3754.f11844 = i3;
                abstractC3754.f11843.mo6264(i3);
            }
        }
    }
}
