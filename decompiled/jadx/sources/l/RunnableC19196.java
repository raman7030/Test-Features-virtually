package l;

/* JADX INFO: renamed from: l.᩵ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19196 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f60449;

    public RunnableC19196(C13132 c13132) {
        this.f60449 = c13132;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13132 c13132 = this.f60449;
        if (!c13132.mFirstLayoutComplete || c13132.isLayoutRequested()) {
            return;
        }
        if (!c13132.mIsAttached) {
            c13132.requestLayout();
        } else if (c13132.mLayoutSuppressed) {
            c13132.mLayoutWasDefered = true;
        } else {
            c13132.consumePendingUpdateOperations();
        }
    }
}
