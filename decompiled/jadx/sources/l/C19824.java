package l;

/* JADX INFO: renamed from: l.᩶֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AOV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19824 implements InterfaceC2570 {
    @Override // l.InterfaceC2570
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // l.InterfaceC2570
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // l.InterfaceC2570
    public final void onPageSelected(int i) {
        if (C4301.f13873 != i) {
            C4301.f13873 = i;
            C1802.m5990("tfcgi", 5000L, new RunnableC21940());
        }
    }
}
