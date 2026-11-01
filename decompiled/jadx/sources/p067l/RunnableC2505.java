package p067l;

/* JADX INFO: renamed from: l.֡ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2505 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14849 f4045;

    public RunnableC2505(C14849 c14849) {
        this.f4045 = c14849;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14849 c14849 = this.f4045;
        AbstractC23964 abstractC23964 = c14849.mItemAnimator;
        if (abstractC23964 != null) {
            abstractC23964.mo22573();
        }
        c14849.mPostedAnimatorRunner = false;
    }
}
