package l;

/* JADX INFO: renamed from: l.ۛۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S5K4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC5967 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1734 f18300;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo16707();

    public AbstractRunnableC5967(C1734 c1734) {
        this.f18300 = c1734;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f18300.f5989.m52922()) {
                return;
            }
            mo16707();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
