package l;

/* JADX INFO: renamed from: l.ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4885 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10530 f15433;

    public RunnableC4885(C10530 c10530) {
        this.f15433 = c10530;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10530 c10530 = this.f15433;
        c10530.m26438();
        c10530.f31576 = c10530.f31589.animate().translationY(0.0f).setListener(c10530.f31565);
    }
}
