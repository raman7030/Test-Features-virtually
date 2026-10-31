package l;

/* JADX INFO: renamed from: l.ܽܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16784 implements InterfaceC2570 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23840 f51546;

    @Override // l.InterfaceC2570
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // l.InterfaceC2570
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C16784(C23840 c23840) {
        this.f51546 = c23840;
    }

    @Override // l.InterfaceC2570
    public final void onPageSelected(int i) {
        C23840 c23840 = this.f51546;
        if (i == 3) {
            c23840.f77139.m11416();
        }
        c23840.m52537();
    }
}
