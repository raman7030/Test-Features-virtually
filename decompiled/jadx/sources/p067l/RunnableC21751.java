package p067l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.᩶᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q759 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21751 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public Thread f68485;

    /* JADX INFO: renamed from: ۙ */
    public boolean f68486;

    /* JADX INFO: renamed from: ۛ */
    public final Executor f68487;

    /* JADX INFO: renamed from: ۟ */
    public boolean f68488;

    /* JADX INFO: renamed from: ۤ */
    public final C5318 f68489;

    /* JADX INFO: renamed from: ۧ֫ */
    public Thread f68490;

    /* JADX INFO: renamed from: ۨ */
    public Throwable f68491;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC22753 f68492;

    /* JADX INFO: renamed from: ۬ */
    public boolean f68493;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f68495;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f68496;

    /* JADX INFO: renamed from: ᩹ */
    public Throwable f68497;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f68498;

    /* JADX INFO: renamed from: ܰ */
    public final Object f68494 = new Object();

    /* JADX INFO: renamed from: ֫֫ */
    public long f68484 = -1;

    public RunnableC21751(InterfaceC22753 interfaceC22753, C5318 c5318, ThreadPoolExecutor threadPoolExecutor) {
        this.f68492 = interfaceC22753;
        this.f68489 = c5318;
        this.f68487 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m49033() {
        try {
            this.f68487.execute(this);
        } catch (RejectedExecutionException e) {
            m49029(new IOException("Preview open capacity is exhausted", e));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Throwable th;
        boolean z2;
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (this.f68494) {
            this.f68490 = threadCurrentThread;
            z = this.f68496;
        }
        long jMo4020 = -1;
        if (z) {
            th = null;
        } else {
            try {
                try {
                    jMo4020 = this.f68492.mo4020(this.f68489);
                    synchronized (this.f68494) {
                        this.f68488 = true;
                    }
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    synchronized (this.f68494) {
                        this.f68488 = true;
                    }
                }
            } catch (Throwable th3) {
                synchronized (this.f68494) {
                    if (this.f68490 == threadCurrentThread) {
                        this.f68490 = null;
                    }
                    Thread.interrupted();
                    throw th3;
                }
            }
        }
        if (th != null) {
            m49029(th);
            synchronized (this.f68494) {
                if (this.f68490 == threadCurrentThread) {
                    this.f68490 = null;
                }
            }
            Thread.interrupted();
            return;
        }
        synchronized (this.f68494) {
            this.f68491 = null;
            this.f68484 = jMo4020;
            this.f68493 = true;
            this.f68494.notifyAll();
            while (!this.f68496 && !this.f68498) {
                try {
                    this.f68494.wait();
                } catch (InterruptedException unused) {
                }
            }
            z2 = this.f68498;
        }
        if (!z2) {
            try {
                m49034();
            } catch (Throwable unused2) {
            }
        }
        synchronized (this.f68494) {
            if (this.f68490 == threadCurrentThread) {
                this.f68490 = null;
            }
        }
        Thread.interrupted();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m49029(Throwable th) {
        try {
            m49034();
        } catch (Throwable th2) {
            if (th2 != th) {
                th.addSuppressed(th2);
            }
        }
        synchronized (this.f68494) {
            this.f68491 = th;
            this.f68493 = true;
            this.f68494.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49031() {
        synchronized (this.f68494) {
            while (!this.f68493 && !this.f68496) {
                try {
                    this.f68494.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Preview read was canceled");
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                }
            }
            if (this.f68496) {
                throw new InterruptedIOException("Preview read was canceled");
            }
            Throwable th = this.f68491;
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th != null) {
                throw new IOException("Preview data source open failed", this.f68491);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m49036() {
        synchronized (this.f68494) {
            if (!this.f68496 && this.f68493 && this.f68491 == null && !this.f68498) {
                this.f68498 = true;
                this.f68494.notifyAll();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final long m49035() {
        long j;
        synchronized (this.f68494) {
            j = this.f68484;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49032() throws IOException {
        synchronized (this.f68494) {
            if (this.f68498) {
                return;
            }
            this.f68496 = true;
            boolean z = this.f68488;
            Thread thread = z ? null : this.f68490;
            this.f68494.notifyAll();
            if (thread != null) {
                thread.interrupt();
            }
            if (z) {
                m49034();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m49034() throws IOException {
        boolean z;
        synchronized (this.f68494) {
            boolean z2 = false;
            if (!this.f68486) {
                this.f68486 = true;
                this.f68485 = Thread.currentThread();
                z = false;
                z2 = true;
            } else {
                if (this.f68485 == Thread.currentThread()) {
                    return;
                }
                z = false;
                while (!this.f68495) {
                    try {
                        this.f68494.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            Throwable th = this.f68497;
            if (z2) {
                th = null;
                try {
                    this.f68492.close();
                    synchronized (this.f68494) {
                        this.f68497 = null;
                        this.f68495 = true;
                        this.f68485 = null;
                        this.f68494.notifyAll();
                    }
                } catch (Throwable th2) {
                    synchronized (this.f68494) {
                        this.f68497 = th2;
                        this.f68495 = true;
                        this.f68485 = null;
                        this.f68494.notifyAll();
                        th = th2;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            m49030(th);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m49030(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th != null) {
            throw new IOException("Preview data source close failed", th);
        }
    }
}
