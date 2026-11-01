package p067l;

/* JADX INFO: renamed from: l.᩺ܿ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1989 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f77113;

    public RunnableC1989(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110) {
        this.f77113 = layoutInflaterFactory2C1110;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f77113;
        layoutInflaterFactory2C1110.f19658.showAtLocation(layoutInflaterFactory2C1110.f19678, 55, 0, 0);
        C1612 c1612 = layoutInflaterFactory2C1110.f19672;
        if (c1612 != null) {
            c1612.m38758();
        }
        if (layoutInflaterFactory2C1110.m17378()) {
            layoutInflaterFactory2C1110.f19678.setAlpha(0.0f);
            C1612 c1612M43544 = C1717.m43544(layoutInflaterFactory2C1110.f19678);
            c1612M43544.m38759(1.0f);
            layoutInflaterFactory2C1110.f19672 = c1612M43544;
            c1612M43544.m38762(new C1429(this));
            return;
        }
        layoutInflaterFactory2C1110.f19678.setAlpha(1.0f);
        layoutInflaterFactory2C1110.f19678.setVisibility(0);
    }
}
