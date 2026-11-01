package p067l;

/* JADX INFO: renamed from: l.᩸ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC22847 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f71945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f71946b;

    public RunnableC22847(Runnable runnable, Runnable runnable2) {
        this.f71945a = runnable;
        this.f71946b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f71945a.run();
            this.f71946b.run();
        } catch (Throwable th) {
            try {
                this.f71946b.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
