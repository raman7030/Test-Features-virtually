package l;

/* JADX INFO: renamed from: l.֡ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0144 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f1270;

    public RunnableC0144(C13132 c13132) {
        this.f1270 = c13132;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13132 c13132 = this.f1270;
        AbstractC22723 abstractC22723 = c13132.mItemAnimator;
        if (abstractC22723 != null) {
            abstractC22723.mo20593();
        }
        c13132.mPostedAnimatorRunner = false;
    }
}
