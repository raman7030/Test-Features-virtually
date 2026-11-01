package p067l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۙ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6808 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ */
    public static final ThreadLocal f17682 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩶ */
    public int f17683;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f17684;

    /* JADX INFO: renamed from: ᩹ */
    public final ScheduledThreadPoolExecutor f17685;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f17683 != 0) {
            throw new IllegalStateException("Persistence sessions are still active");
        }
        this.f17684 = true;
        this.f17685.shutdown();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C21561 m15610() {
        int i;
        if (this.f17684 || (i = this.f17683) == 256) {
            throw new RejectedExecutionException("Persistence session limit reached or scheduler closed");
        }
        this.f17683 = i + 1;
        return new C21561(this);
    }

    public C6808() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactory() { // from class: l.᩹۬ᩳ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(new RunnableC9413(2, runnable), "editable-persist-" + atomicInteger.incrementAndGet());
                thread.setDaemon(true);
                return thread;
            }
        });
        this.f17685 = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15604(Runnable runnable) {
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = f17682;
        threadLocal.set(bool);
        try {
            runnable.run();
        } finally {
            threadLocal.remove();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m15609() {
        return Boolean.TRUE.equals(f17682.get());
    }
}
