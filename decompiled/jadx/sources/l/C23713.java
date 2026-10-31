package l;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩻۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74X */
/* JADX INFO: loaded from: classes.dex */
public final class C23713 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f76785;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16197 f76786;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile EnumC14540 f76787;

    public C23713(C16197 c16197, boolean z, String str) {
        EnumC14540 enumC14540;
        this.f76786 = c16197;
        this.f76785 = str;
        if (c16197 != null) {
            enumC14540 = EnumC14540.CACHE;
        } else {
            enumC14540 = z ? EnumC14540.PENDING : EnumC14540.BYPASS;
        }
        this.f76787 = enumC14540;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m52289() {
        boolean z;
        m52281();
        synchronized (this) {
            z = this.f76787 == EnumC14540.CACHE && this.f76786 != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16197 m52288() {
        C16197 c16197;
        m52281();
        synchronized (this) {
            c16197 = this.f76787 == EnumC14540.CACHE ? this.f76786 : null;
        }
        return c16197;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16197 m52285() {
        m52281();
        while (true) {
            m52284();
            synchronized (this) {
                if (this.f76787 != EnumC14540.RELEASED) {
                    if (this.f76787 == EnumC14540.CACHE) {
                        return this.f76786;
                    }
                    if (this.f76787 == EnumC14540.BYPASS) {
                        return null;
                    }
                    if (this.f76787 == EnumC14540.PENDING) {
                        this.f76787 = EnumC14540.DECIDING;
                        try {
                            return m52283();
                        } catch (InterruptedIOException e) {
                            m52282();
                            throw e;
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while waiting for media cache initialization");
                        interruptedIOException.initCause(e2);
                        throw interruptedIOException;
                    }
                } else {
                    throw new InterruptedIOException("Media cache session was released");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C16197 m52283() throws InterruptedIOException {
        EnumC6780 enumC6780;
        EnumC6780 enumC6781;
        C16197 c16197;
        m52284();
        long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
        long jNanoTime = System.nanoTime() + nanos;
        synchronized (C20892.f67594) {
            while (true) {
                if ((C20892.f67596 != EnumC6780.UNINITIALIZED && C20892.f67596 != EnumC6780.INITIALIZING) || this.f76787 != EnumC14540.DECIDING || nanos <= 0) {
                    break;
                }
                long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
                try {
                    C20892.f67594.wait(millis, (int) (nanos - TimeUnit.MILLISECONDS.toNanos(millis)));
                    nanos = jNanoTime - System.nanoTime();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while waiting for media cache initialization");
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                }
            }
            enumC6780 = C20892.f67596;
            EnumC6780 enumC6782 = C20892.f67596;
            enumC6781 = EnumC6780.READY;
            c16197 = enumC6782 == enumC6781 ? C20892.f67595 : null;
        }
        m52284();
        synchronized (this) {
            if (this.f76787 != EnumC14540.RELEASED) {
                m52284();
                EnumC14540 enumC14540 = this.f76787;
                EnumC14540 enumC14541 = EnumC14540.CACHE;
                if (enumC14540 == enumC14541) {
                    return this.f76786;
                }
                EnumC14540 enumC14542 = this.f76787;
                EnumC14540 enumC14543 = EnumC14540.BYPASS;
                if (enumC14542 == enumC14543) {
                    return null;
                }
                if (this.f76787 != EnumC14540.DECIDING) {
                    throw new InterruptedIOException("Media cache decision was canceled");
                }
                if (enumC6780 == enumC6781 && c16197 != null) {
                    this.f76786 = c16197;
                    this.f76787 = enumC14541;
                } else {
                    this.f76787 = enumC14543;
                }
                notifyAll();
                return this.f76786;
            }
            throw new InterruptedIOException("Media cache session was released");
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m52282() {
        synchronized (this) {
            if (this.f76787 == EnumC14540.DECIDING) {
                this.f76787 = EnumC14540.PENDING;
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m52281() {
        EnumC6780 enumC6780;
        EnumC6780 enumC6781;
        C16197 c16197;
        EnumC14540 enumC14540 = this.f76787;
        EnumC14540 enumC14541 = EnumC14540.PENDING;
        if (enumC14540 != enumC14541) {
            return;
        }
        synchronized (C20892.f67594) {
            enumC6780 = C20892.f67596;
            EnumC6780 enumC6782 = C20892.f67596;
            enumC6781 = EnumC6780.READY;
            c16197 = enumC6782 == enumC6781 ? C20892.f67595 : null;
        }
        if (enumC6780 == EnumC6780.UNINITIALIZED || enumC6780 == EnumC6780.INITIALIZING) {
            return;
        }
        synchronized (this) {
            if (this.f76787 != enumC14541) {
                return;
            }
            if (enumC6780 == enumC6781 && c16197 != null) {
                this.f76786 = c16197;
                this.f76787 = EnumC14540.CACHE;
            } else {
                this.f76787 = EnumC14540.BYPASS;
            }
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m52284() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Interrupted while waiting for media cache initialization");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m52287() {
        synchronized (this) {
            if (this.f76787 != EnumC14540.RELEASED) {
                this.f76787 = EnumC14540.BYPASS;
            }
            notifyAll();
        }
        C20892.m47733();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m52286() {
        return this.f76785;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f76787 = EnumC14540.RELEASED;
            notifyAll();
        }
        C20892.m47733();
    }
}
