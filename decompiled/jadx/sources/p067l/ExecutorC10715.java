package p067l;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۡۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6VW */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC10715 implements Executor, AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public final ThreadPoolExecutor f29680;

    /* JADX INFO: renamed from: ᩹ */
    public final int f29681;

    public ExecutorC10715(int i) {
        int iMax = Math.max(1, Math.min(4, i));
        this.f29681 = iMax;
        final AtomicInteger atomicInteger = new AtomicInteger();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, iMax, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: l.ۢۡܿ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Syntax-Highlight-" + atomicInteger.incrementAndGet());
            }
        });
        this.f29680 = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f29680.execute(runnable);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f29680.shutdownNow();
    }
}
