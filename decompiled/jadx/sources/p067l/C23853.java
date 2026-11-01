package p067l;

/* JADX INFO: renamed from: l.᩹᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes.dex */
public final class C23853 implements InterfaceC4811 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7089 f75780;

    @Override // p067l.InterfaceC4811
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // p067l.InterfaceC4811
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C23853(C7089 c7089) {
        this.f75780 = c7089;
    }

    @Override // p067l.InterfaceC4811
    public final void onPageSelected(int i) {
        if (i == 3) {
            this.f75780.f18485.m13353();
        }
    }
}
