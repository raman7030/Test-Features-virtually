package l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۙ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4671 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f14853 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f14854;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f14855;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f14856;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f14854 != 0) {
            throw new IllegalStateException("Persistence sessions are still active");
        }
        this.f14855 = true;
        this.f14856.shutdown();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C20194 m13735() {
        int i;
        if (this.f14855 || (i = this.f14854) == 256) {
            throw new RejectedExecutionException("Persistence session limit reached or scheduler closed");
        }
        this.f14854 = i + 1;
        return new C20194(this);
    }

    public C4671() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactory() { // from class: l.᩹۬ᩳ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(new RunnableC7412(2, runnable), "editable-persist-" + atomicInteger.incrementAndGet());
                thread.setDaemon(true);
                return thread;
            }
        });
        this.f14856 = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13729(Runnable runnable) {
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = f14853;
        threadLocal.set(bool);
        try {
            runnable.run();
        } finally {
            threadLocal.remove();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m13734() {
        return Boolean.TRUE.equals(f14853.get());
    }
}
