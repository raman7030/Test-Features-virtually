package p067l;

import com.alipay.sdk.p010m.p039o.C0180b;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܶᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4ET */
/* JADX INFO: loaded from: classes4.dex */
public class C16989 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C16989 f50239 = new C10285();

    /* JADX INFO: renamed from: ֫ */
    public long f50240;

    /* JADX INFO: renamed from: ۧ */
    public boolean f50241;

    /* JADX INFO: renamed from: ܽ */
    public long f50242;

    /* JADX INFO: renamed from: ۧ */
    public C16989 mo22306(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new IllegalArgumentException(C17588.m40051(j, "timeout < 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f50242 = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: ܳ */
    public long mo22307() {
        return this.f50242;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo22310() {
        return this.f50241;
    }

    /* JADX INFO: renamed from: ܽ */
    public long mo22308() {
        if (!this.f50241) {
            throw new IllegalStateException("No deadline");
        }
        return this.f50240;
    }

    /* JADX INFO: renamed from: ֫ */
    public C16989 mo22303(long j) {
        this.f50241 = true;
        this.f50240 = j;
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public C16989 mo22305() {
        this.f50242 = 0L;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public C16989 mo22302() {
        this.f50241 = false;
        return this;
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo22309() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f50241 && this.f50240 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38577(Object obj) throws InterruptedIOException {
        try {
            boolean zMo22310 = mo22310();
            long jMo22307 = mo22307();
            long jNanoTime = 0;
            if (!zMo22310 && jMo22307 == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zMo22310 && jMo22307 != 0) {
                jMo22307 = Math.min(jMo22307, mo22308() - jNanoTime2);
            } else if (zMo22310) {
                jMo22307 = mo22308() - jNanoTime2;
            }
            if (jMo22307 > 0) {
                long j = jMo22307 / 1000000;
                Long.signum(j);
                obj.wait(j, (int) (jMo22307 - (1000000 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jMo22307) {
                throw new InterruptedIOException(C0180b.f794n0);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
