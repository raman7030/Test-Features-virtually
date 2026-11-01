package p067l;

/* JADX INFO: renamed from: l.ܽܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18320 implements InterfaceC4811 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C25026 f54728;

    @Override // p067l.InterfaceC4811
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // p067l.InterfaceC4811
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C18320(C25026 c25026) {
        this.f54728 = c25026;
    }

    @Override // p067l.InterfaceC4811
    public final void onPageSelected(int i) {
        C25026 c25026 = this.f54728;
        if (i == 3) {
            c25026.f79889.m13352();
        }
        c25026.m54946();
    }
}
