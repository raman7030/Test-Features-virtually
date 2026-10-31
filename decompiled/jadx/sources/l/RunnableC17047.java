package l;

/* JADX INFO: renamed from: l.ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17047 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9287 f52244;

    public RunnableC17047(C9287 c9287) {
        this.f52244 = c9287;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12499 c12499 = this.f52244.f28147;
        if (c12499 != null) {
            c12499.m30670(true);
            c12499.requestLayout();
        }
    }
}
