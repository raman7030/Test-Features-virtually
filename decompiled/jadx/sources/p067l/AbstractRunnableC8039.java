package p067l;

/* JADX INFO: renamed from: l.ۛۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S5K4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC8039 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final C4016 f21153;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo18633();

    public AbstractRunnableC8039(C4016 c4016) {
        this.f21153 = c4016;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f21153.f8766.m55486()) {
                return;
            }
            mo18633();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
