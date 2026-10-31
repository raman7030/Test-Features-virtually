package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes3.dex */
public class C4760 extends C15384 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final long f15118;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C4760 f15119;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final long f15120;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C4760 f15121;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f15122;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f15123;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo13924() {
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f15118 = millis;
        f15120 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m13925() {
        C4760 c4760;
        if (this.f15122) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jMo20330 = mo20330();
        boolean zMo20333 = mo20333();
        if (jMo20330 != 0 || zMo20333) {
            this.f15122 = true;
            synchronized (C4760.class) {
                if (f15119 == null) {
                    f15119 = new C4760();
                    C20283 c20283 = new C20283("Okio Watchdog");
                    c20283.setDaemon(true);
                    c20283.start();
                }
                long jNanoTime = System.nanoTime();
                if (jMo20330 != 0 && zMo20333) {
                    this.f15123 = Math.min(jMo20330, mo20331() - jNanoTime) + jNanoTime;
                } else if (jMo20330 != 0) {
                    this.f15123 = jMo20330 + jNanoTime;
                } else {
                    if (!zMo20333) {
                        throw new AssertionError();
                    }
                    this.f15123 = mo20331();
                }
                long j = this.f15123 - jNanoTime;
                C4760 c4761 = f15119;
                while (true) {
                    c4760 = c4761.f15121;
                    if (c4760 == null || j < c4760.f15123 - jNanoTime) {
                        break;
                        break;
                    }
                    c4761 = c4760;
                }
                this.f15121 = c4760;
                c4761.f15121 = this;
                if (c4761 == f15119) {
                    C4760.class.notify();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m13923() {
        if (!this.f15122) {
            return false;
        }
        this.f15122 = false;
        synchronized (C4760.class) {
            C4760 c4760 = f15119;
            while (c4760 != null) {
                C4760 c4761 = c4760.f15121;
                if (c4761 == this) {
                    c4760.f15121 = this.f15121;
                    this.f15121 = null;
                    return false;
                }
                c4760 = c4761;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13922(boolean z) throws IOException {
        if (m13923() && z) {
            throw mo13921((IOException) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public IOException mo13921(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(b.n0);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C4760 m13920() throws InterruptedException {
        C4760 c4760 = f15119.f15121;
        if (c4760 == null) {
            long jNanoTime = System.nanoTime();
            C4760.class.wait(f15118);
            if (f15119.f15121 != null || System.nanoTime() - jNanoTime < f15120) {
                return null;
            }
            return f15119;
        }
        long jNanoTime2 = c4760.f15123 - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            C4760.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        f15119.f15121 = c4760.f15121;
        c4760.f15121 = null;
        return c4760;
    }
}
