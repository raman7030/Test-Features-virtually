package p067l;

/* JADX INFO: renamed from: l.ܿۖ */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1688 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1303 f55426;

    public RunnableC1688(C1303 c1303) {
        this.f55426 = c1303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1462 c1462 = this.f55426.f31096;
        if (c1462 != null) {
            c1462.m32745(true);
            c1462.requestLayout();
        }
    }
}
