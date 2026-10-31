package l;

/* JADX INFO: renamed from: l.᩹᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes.dex */
public final class C22605 implements InterfaceC2570 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4966 f73052;

    @Override // l.InterfaceC2570
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // l.InterfaceC2570
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C22605(C4966 c4966) {
        this.f73052 = c4966;
    }

    @Override // l.InterfaceC2570
    public final void onPageSelected(int i) {
        if (i == 3) {
            this.f73052.f15651.m11417();
        }
    }
}
