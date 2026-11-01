package p067l;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩻۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74X */
/* JADX INFO: loaded from: classes.dex */
public final class C24905 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final String f79535;

    /* JADX INFO: renamed from: ᩸ */
    public C17762 f79536;

    /* JADX INFO: renamed from: ᩹ */
    public volatile EnumC16187 f79537;

    public C24905(C17762 c17762, boolean z, String str) {
        EnumC16187 enumC16187;
        this.f79536 = c17762;
        this.f79535 = str;
        if (c17762 != null) {
            enumC16187 = EnumC16187.CACHE;
        } else {
            enumC16187 = z ? EnumC16187.PENDING : EnumC16187.BYPASS;
        }
        this.f79537 = enumC16187;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m54692() {
        boolean z;
        m54684();
        synchronized (this) {
            z = this.f79537 == EnumC16187.CACHE && this.f79536 != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C17762 m54691() {
        C17762 c17762;
        m54684();
        synchronized (this) {
            c17762 = this.f79537 == EnumC16187.CACHE ? this.f79536 : null;
        }
        return c17762;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17762 m54688() {
        m54684();
        while (true) {
            m54687();
            synchronized (this) {
                if (this.f79537 != EnumC16187.RELEASED) {
                    if (this.f79537 == EnumC16187.CACHE) {
                        return this.f79536;
                    }
                    if (this.f79537 == EnumC16187.BYPASS) {
                        return null;
                    }
                    if (this.f79537 == EnumC16187.PENDING) {
                        this.f79537 = EnumC16187.DECIDING;
                        try {
                            return m54686();
                        } catch (InterruptedIOException e) {
                            m54685();
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

    /* JADX INFO: renamed from: ۜ */
    private C17762 m54686() throws InterruptedIOException {
        EnumC8812 enumC8812;
        EnumC8812 enumC8813;
        C17762 c17762;
        m54687();
        long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
        long jNanoTime = System.nanoTime() + nanos;
        synchronized (C22224.f70280) {
            while (true) {
                if ((C22224.f70282 != EnumC8812.UNINITIALIZED && C22224.f70282 != EnumC8812.INITIALIZING) || this.f79537 != EnumC16187.DECIDING || nanos <= 0) {
                    break;
                }
                long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
                try {
                    C22224.f70280.wait(millis, (int) (nanos - TimeUnit.MILLISECONDS.toNanos(millis)));
                    nanos = jNanoTime - System.nanoTime();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while waiting for media cache initialization");
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                }
            }
            enumC8812 = C22224.f70282;
            EnumC8812 enumC8814 = C22224.f70282;
            enumC8813 = EnumC8812.READY;
            c17762 = enumC8814 == enumC8813 ? C22224.f70281 : null;
        }
        m54687();
        synchronized (this) {
            if (this.f79537 != EnumC16187.RELEASED) {
                m54687();
                EnumC16187 enumC16187 = this.f79537;
                EnumC16187 enumC16188 = EnumC16187.CACHE;
                if (enumC16187 == enumC16188) {
                    return this.f79536;
                }
                EnumC16187 enumC16189 = this.f79537;
                EnumC16187 enumC161810 = EnumC16187.BYPASS;
                if (enumC16189 == enumC161810) {
                    return null;
                }
                if (this.f79537 != EnumC16187.DECIDING) {
                    throw new InterruptedIOException("Media cache decision was canceled");
                }
                if (enumC8812 == enumC8813 && c17762 != null) {
                    this.f79536 = c17762;
                    this.f79537 = enumC16188;
                } else {
                    this.f79537 = enumC161810;
                }
                notifyAll();
                return this.f79536;
            }
            throw new InterruptedIOException("Media cache session was released");
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private void m54685() {
        synchronized (this) {
            if (this.f79537 == EnumC16187.DECIDING) {
                this.f79537 = EnumC16187.PENDING;
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private void m54684() {
        EnumC8812 enumC8812;
        EnumC8812 enumC8813;
        C17762 c17762;
        EnumC16187 enumC16187 = this.f79537;
        EnumC16187 enumC16188 = EnumC16187.PENDING;
        if (enumC16187 != enumC16188) {
            return;
        }
        synchronized (C22224.f70280) {
            enumC8812 = C22224.f70282;
            EnumC8812 enumC8814 = C22224.f70282;
            enumC8813 = EnumC8812.READY;
            c17762 = enumC8814 == enumC8813 ? C22224.f70281 : null;
        }
        if (enumC8812 == EnumC8812.UNINITIALIZED || enumC8812 == EnumC8812.INITIALIZING) {
            return;
        }
        synchronized (this) {
            if (this.f79537 != enumC16188) {
                return;
            }
            if (enumC8812 == enumC8813 && c17762 != null) {
                this.f79536 = c17762;
                this.f79537 = EnumC16187.CACHE;
            } else {
                this.f79537 = EnumC16187.BYPASS;
            }
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public static void m54687() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Interrupted while waiting for media cache initialization");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m54690() {
        synchronized (this) {
            if (this.f79537 != EnumC16187.RELEASED) {
                this.f79537 = EnumC16187.BYPASS;
            }
            notifyAll();
        }
        C22224.m50063();
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m54689() {
        return this.f79535;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f79537 = EnumC16187.RELEASED;
            notifyAll();
        }
        C22224.m50063();
    }
}
