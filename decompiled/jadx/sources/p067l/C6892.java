package p067l;

import com.alipay.sdk.p010m.p039o.C0180b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes3.dex */
public class C6892 extends C16989 {

    /* JADX INFO: renamed from: ۜ */
    public static final long f17948;

    /* JADX INFO: renamed from: ۢ */
    public static C6892 f17949;

    /* JADX INFO: renamed from: ᩷ */
    public static final long f17950;

    /* JADX INFO: renamed from: ܳ */
    public C6892 f17951;

    /* JADX INFO: renamed from: ܿ */
    public boolean f17952;

    /* JADX INFO: renamed from: ᩻ */
    public long f17953;

    /* JADX INFO: renamed from: ᩷ */
    public void mo15804() {
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f17948 = millis;
        f17950 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m15805() {
        C6892 c6892;
        if (this.f17952) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jMo22307 = mo22307();
        boolean zMo22310 = mo22310();
        if (jMo22307 != 0 || zMo22310) {
            this.f17952 = true;
            synchronized (C6892.class) {
                if (f17949 == null) {
                    f17949 = new C6892();
                    C21645 c21645 = new C21645("Okio Watchdog");
                    c21645.setDaemon(true);
                    c21645.start();
                }
                long jNanoTime = System.nanoTime();
                if (jMo22307 != 0 && zMo22310) {
                    this.f17953 = Math.min(jMo22307, mo22308() - jNanoTime) + jNanoTime;
                } else if (jMo22307 != 0) {
                    this.f17953 = jMo22307 + jNanoTime;
                } else {
                    if (!zMo22310) {
                        throw new AssertionError();
                    }
                    this.f17953 = mo22308();
                }
                long j = this.f17953 - jNanoTime;
                C6892 c6893 = f17949;
                while (true) {
                    c6892 = c6893.f17951;
                    if (c6892 == null || j < c6892.f17953 - jNanoTime) {
                        break;
                        break;
                    }
                    c6893 = c6892;
                }
                this.f17951 = c6892;
                c6893.f17951 = this;
                if (c6893 == f17949) {
                    C6892.class.notify();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m15803() {
        if (!this.f17952) {
            return false;
        }
        this.f17952 = false;
        synchronized (C6892.class) {
            C6892 c6892 = f17949;
            while (c6892 != null) {
                C6892 c6893 = c6892.f17951;
                if (c6893 == this) {
                    c6892.f17951 = this.f17951;
                    this.f17951 = null;
                    return false;
                }
                c6892 = c6893;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15802(boolean z) throws IOException {
        if (m15803() && z) {
            throw mo15801((IOException) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public IOException mo15801(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(C0180b.f794n0);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: ۢ */
    public static C6892 m15800() throws InterruptedException {
        C6892 c6892 = f17949.f17951;
        if (c6892 == null) {
            long jNanoTime = System.nanoTime();
            C6892.class.wait(f17948);
            if (f17949.f17951 != null || System.nanoTime() - jNanoTime < f17950) {
                return null;
            }
            return f17949;
        }
        long jNanoTime2 = c6892.f17953 - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            C6892.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        f17949.f17951 = c6892.f17951;
        c6892.f17951 = null;
        return c6892;
    }
}
