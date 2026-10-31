package l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ܽ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AY8 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC16667 extends AbstractC19491 implements Runnable {
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final long f51170;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final RunnableC16667 f51171;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private final synchronized void m39180() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m44902();
            notifyAll();
        }
    }

    static {
        Long l2;
        RunnableC16667 runnableC16667 = new RunnableC16667();
        f51171 = runnableC16667;
        runnableC16667.m8093(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f51170 = timeUnit.toNanos(l2.longValue());
    }

    @Override // l.AbstractC0439
    /* JADX INFO: renamed from: ᩶ */
    public final Thread mo1995() {
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

    @Override // l.AbstractC19491
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo39181(Runnable runnable) {
        if (debugStatus != 4) {
            super.mo39181(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // l.AbstractC0439
    /* JADX INFO: renamed from: ֫ */
    public final void mo1994(long j, AbstractRunnableC3968 abstractRunnableC3968) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // l.AbstractC19491, l.AbstractC2557
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2537.m8047(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m39180();
                    if (m44900()) {
                        return;
                    }
                    mo1995();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM44899 = m44899();
                    if (jM44899 == C13132.FOREVER_NS) {
                        long jNanoTime = System.nanoTime();
                        if (j == C13132.FOREVER_NS) {
                            j = f51170 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m39180();
                            if (m44900()) {
                                return;
                            }
                            mo1995();
                            return;
                        }
                        if (jM44899 > j2) {
                            jM44899 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM44899 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m39180();
                            if (m44900()) {
                                return;
                            }
                            mo1995();
                            return;
                        }
                        LockSupport.parkNanos(this, jM44899);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m39180();
            if (!m44900()) {
                mo1995();
            }
            throw th;
        }
    }
}
