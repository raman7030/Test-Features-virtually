package p067l;

/* JADX INFO: renamed from: l.ۖۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4668 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC2655 f10493;

    public RunnableC4668(AbstractC2655 abstractC2655) {
        this.f10493 = abstractC2655;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f10493.f4444) {
            obj = this.f10493.f4438;
            this.f10493.f4438 = AbstractC2655.f4436;
        }
        this.f10493.mo4067(obj);
    }
}
