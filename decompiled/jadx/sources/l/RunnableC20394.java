package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.᩶᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q759 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20394 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Thread f65809;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65810;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Executor f65811;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f65812;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3104 f65813;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Thread f65814;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Throwable f65815;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f65816;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f65817;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65819;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f65820;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Throwable f65821;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f65822;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f65818 = new Object();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f65808 = -1;

    public RunnableC20394(InterfaceC21449 interfaceC21449, C3104 c3104, ThreadPoolExecutor threadPoolExecutor) {
        this.f65816 = interfaceC21449;
        this.f65813 = c3104;
        this.f65811 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m46710() {
        try {
            this.f65811.execute(this);
        } catch (RejectedExecutionException e) {
            m46706(new IOException("Preview open capacity is exhausted", e));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Throwable th;
        boolean z2;
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (this.f65818) {
            this.f65814 = threadCurrentThread;
            z = this.f65820;
        }
        long jMo1620 = -1;
        if (z) {
            th = null;
        } else {
            try {
                try {
                    jMo1620 = this.f65816.mo1620(this.f65813);
                    synchronized (this.f65818) {
                        this.f65812 = true;
                    }
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    synchronized (this.f65818) {
                        this.f65812 = true;
                    }
                }
            } catch (Throwable th3) {
                synchronized (this.f65818) {
                    if (this.f65814 == threadCurrentThread) {
                        this.f65814 = null;
                    }
                    Thread.interrupted();
                    throw th3;
                }
            }
        }
        if (th != null) {
            m46706(th);
            synchronized (this.f65818) {
                if (this.f65814 == threadCurrentThread) {
                    this.f65814 = null;
                }
            }
            Thread.interrupted();
            return;
        }
        synchronized (this.f65818) {
            this.f65815 = null;
            this.f65808 = jMo1620;
            this.f65817 = true;
            this.f65818.notifyAll();
            while (!this.f65820 && !this.f65822) {
                try {
                    this.f65818.wait();
                } catch (InterruptedException unused) {
                }
            }
            z2 = this.f65822;
        }
        if (!z2) {
            try {
                m46711();
            } catch (Throwable unused2) {
            }
        }
        synchronized (this.f65818) {
            if (this.f65814 == threadCurrentThread) {
                this.f65814 = null;
            }
        }
        Thread.interrupted();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m46706(Throwable th) {
        try {
            m46711();
        } catch (Throwable th2) {
            if (th2 != th) {
                th.addSuppressed(th2);
            }
        }
        synchronized (this.f65818) {
            this.f65815 = th;
            this.f65817 = true;
            this.f65818.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46708() {
        synchronized (this.f65818) {
            while (!this.f65817 && !this.f65820) {
                try {
                    this.f65818.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Preview read was canceled");
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                }
            }
            if (this.f65820) {
                throw new InterruptedIOException("Preview read was canceled");
            }
            Throwable th = this.f65815;
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
                throw new IOException("Preview data source open failed", this.f65815);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m46713() {
        synchronized (this.f65818) {
            if (!this.f65820 && this.f65817 && this.f65815 == null && !this.f65822) {
                this.f65822 = true;
                this.f65818.notifyAll();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m46712() {
        long j;
        synchronized (this.f65818) {
            j = this.f65808;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46709() throws IOException {
        synchronized (this.f65818) {
            if (this.f65822) {
                return;
            }
            this.f65820 = true;
            boolean z = this.f65812;
            Thread thread = z ? null : this.f65814;
            this.f65818.notifyAll();
            if (thread != null) {
                thread.interrupt();
            }
            if (z) {
                m46711();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46711() throws IOException {
        boolean z;
        synchronized (this.f65818) {
            boolean z2 = false;
            if (!this.f65810) {
                this.f65810 = true;
                this.f65809 = Thread.currentThread();
                z = false;
                z2 = true;
            } else {
                if (this.f65809 == Thread.currentThread()) {
                    return;
                }
                z = false;
                while (!this.f65819) {
                    try {
                        this.f65818.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            Throwable th = this.f65821;
            if (z2) {
                th = null;
                try {
                    this.f65816.close();
                    synchronized (this.f65818) {
                        this.f65821 = null;
                        this.f65819 = true;
                        this.f65809 = null;
                        this.f65818.notifyAll();
                    }
                } catch (Throwable th2) {
                    synchronized (this.f65818) {
                        this.f65821 = th2;
                        this.f65819 = true;
                        this.f65809 = null;
                        this.f65818.notifyAll();
                        th = th2;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            m46707(th);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m46707(Throwable th) throws IOException {
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
