package p067l;

/* JADX INFO: renamed from: l.᩶֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AOV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21209 implements InterfaceC4811 {
    @Override // p067l.InterfaceC4811
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // p067l.InterfaceC4811
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // p067l.InterfaceC4811
    public final void onPageSelected(int i) {
        if (C6456.f16688 != i) {
            C6456.f16688 = i;
            C4081.m8187("tfcgi", 5000L, new RunnableC23220());
        }
    }
}
