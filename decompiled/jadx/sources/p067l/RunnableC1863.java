package p067l;

/* JADX INFO: renamed from: l.᩷ۖ */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1863 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1303 f68937;

    public RunnableC1863(C1303 c1303) {
        this.f68937 = c1303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1303 c1303 = this.f68937;
        C1462 c1462 = c1303.f31096;
        if (c1462 == null || !c1462.isAttachedToWindow() || c1303.f31096.getCount() <= c1303.f31096.getChildCount() || c1303.f31096.getChildCount() > c1303.f31103) {
            return;
        }
        c1303.f31105.setInputMethodMode(2);
        c1303.show();
    }
}
