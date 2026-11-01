package p067l;

/* JADX INFO: renamed from: l.᩵ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20612 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14849 f63679;

    public RunnableC20612(C14849 c14849) {
        this.f63679 = c14849;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14849 c14849 = this.f63679;
        if (!c14849.mFirstLayoutComplete || c14849.isLayoutRequested()) {
            return;
        }
        if (!c14849.mIsAttached) {
            c14849.requestLayout();
        } else if (c14849.mLayoutSuppressed) {
            c14849.mLayoutWasDefered = true;
        } else {
            c14849.consumePendingUpdateOperations();
        }
    }
}
