package p067l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ܽ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AY8 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC18209 extends AbstractC20893 implements Runnable {
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* JADX INFO: renamed from: ۛ */
    public static final long f54355;

    /* JADX INFO: renamed from: ۤ */
    public static final RunnableC18209 f54356;

    /* JADX INFO: renamed from: ۤ */
    private final synchronized void m41415() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m47199();
            notifyAll();
        }
    }

    static {
        Long l2;
        RunnableC18209 runnableC18209 = new RunnableC18209();
        f54356 = runnableC18209;
        runnableC18209.m10125(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f54355 = timeUnit.toNanos(l2.longValue());
    }

    @Override // p067l.AbstractC2786
    /* JADX INFO: renamed from: ᩶ */
    public final Thread mo4371() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p067l.AbstractC20893
    /* JADX INFO: renamed from: ֫ */
    public final void mo41416(Runnable runnable) {
        if (debugStatus != 4) {
            super.mo41416(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p067l.AbstractC2786
    /* JADX INFO: renamed from: ֫ */
    public final void mo4370(long j, AbstractRunnableC6140 abstractRunnableC6140) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p067l.AbstractC20893, p067l.AbstractC4799
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4780.m10077(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m41415();
                    if (m47197()) {
                        return;
                    }
                    mo4371();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM47196 = m47196();
                    if (jM47196 == C14849.FOREVER_NS) {
                        long jNanoTime = System.nanoTime();
                        if (j == C14849.FOREVER_NS) {
                            j = f54355 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m41415();
                            if (m47197()) {
                                return;
                            }
                            mo4371();
                            return;
                        }
                        if (jM47196 > j2) {
                            jM47196 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM47196 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m41415();
                            if (m47197()) {
                                return;
                            }
                            mo4371();
                            return;
                        }
                        LockSupport.parkNanos(this, jM47196);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m41415();
            if (!m47197()) {
                mo4371();
            }
            throw th;
        }
    }
}
