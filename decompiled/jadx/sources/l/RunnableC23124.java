package l;

/* JADX INFO: renamed from: l.᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23124 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f74367;

    public RunnableC23124(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402) {
        this.f74367 = layoutInflaterFactory2C5402;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f74367;
        layoutInflaterFactory2C5402.f16820.showAtLocation(layoutInflaterFactory2C5402.f16840, 55, 0, 0);
        C15530 c15530 = layoutInflaterFactory2C5402.f16834;
        if (c15530 != null) {
            c15530.m36598();
        }
        if (layoutInflaterFactory2C5402.m15467()) {
            layoutInflaterFactory2C5402.f16840.setAlpha(0.0f);
            C15530 c15530M41298 = C17648.m41298(layoutInflaterFactory2C5402.f16840);
            c15530M41298.m36599(1.0f);
            layoutInflaterFactory2C5402.f16834 = c15530M41298;
            c15530M41298.m36602(new C11836(this));
            return;
        }
        layoutInflaterFactory2C5402.f16840.setAlpha(1.0f);
        layoutInflaterFactory2C5402.f16840.setVisibility(0);
    }
}
