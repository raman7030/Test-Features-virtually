package p067l;

/* JADX INFO: renamed from: l.ۙ᩷ */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1084 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1364 f18268;

    public RunnableC1084(C1364 c1364) {
        this.f18268 = c1364;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1364 c1364 = this.f18268;
        c1364.m28471();
        c1364.f34540 = c1364.f34553.animate().translationY(0.0f).setListener(c1364.f34529);
    }
}
