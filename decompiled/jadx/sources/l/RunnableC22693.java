package l;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.᩺ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22693 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f73323;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1567 f73324;

    public RunnableC22693(AbstractC1567 abstractC1567) {
        this.f73324 = abstractC1567;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50704() {
        this.f73323.cancel(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1567 abstractC1567 = this.f73324;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            if (abstractC1567.f5555 != null) {
                ClassLoader classLoader = (ClassLoader) abstractC1567.f5555.get();
                if (classLoader == null) {
                    m50704();
                } else {
                    Thread.currentThread().setContextClassLoader(classLoader);
                    abstractC1567.mo5376();
                    abstractC1567.mo5364();
                }
            } else {
                try {
                    abstractC1567.mo5376();
                } catch (Exception unused) {
                } catch (OutOfMemoryError e) {
                    e.printStackTrace(System.err);
                }
                try {
                    abstractC1567.mo5364();
                } catch (Exception unused2) {
                }
            }
            Thread.currentThread().setContextClassLoader(contextClassLoader);
        } catch (Throwable th) {
            Thread.currentThread().setContextClassLoader(contextClassLoader);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50705(ScheduledFuture scheduledFuture) {
        this.f73323 = scheduledFuture;
    }
}
