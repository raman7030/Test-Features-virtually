package p067l;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.᩺ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23935 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public ScheduledFuture f76049;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC3857 f76050;

    public RunnableC23935(AbstractC3857 abstractC3857) {
        this.f76050 = abstractC3857;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53030() {
        this.f76049.cancel(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3857 abstractC3857 = this.f76050;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            if (abstractC3857.f8336 != null) {
                ClassLoader classLoader = (ClassLoader) abstractC3857.f8336.get();
                if (classLoader == null) {
                    m53030();
                } else {
                    Thread.currentThread().setContextClassLoader(classLoader);
                    abstractC3857.mo7605();
                    abstractC3857.mo7593();
                }
            } else {
                try {
                    abstractC3857.mo7605();
                } catch (Exception unused) {
                } catch (OutOfMemoryError e) {
                    e.printStackTrace(System.err);
                }
                try {
                    abstractC3857.mo7593();
                } catch (Exception unused2) {
                }
            }
        } finally {
            Thread.currentThread().setContextClassLoader(contextClassLoader);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53031(ScheduledFuture scheduledFuture) {
        this.f76049 = scheduledFuture;
    }
}
