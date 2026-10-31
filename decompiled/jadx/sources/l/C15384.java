package l;

import com.alipay.sdk.m.o.b;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܶᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4ET */
/* JADX INFO: loaded from: classes4.dex */
public class C15384 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C15384 f47109 = new C8330();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f47110;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f47111;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f47112;

    /* JADX INFO: renamed from: ۧ */
    public C15384 mo20329(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "timeout < 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f47112 = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: ܳ */
    public long mo20330() {
        return this.f47112;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo20333() {
        return this.f47111;
    }

    /* JADX INFO: renamed from: ܽ */
    public long mo20331() {
        if (!this.f47111) {
            throw new IllegalStateException("No deadline");
        }
        return this.f47110;
    }

    /* JADX INFO: renamed from: ֫ */
    public C15384 mo20326(long j) {
        this.f47111 = true;
        this.f47110 = j;
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public C15384 mo20328() {
        this.f47112 = 0L;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public C15384 mo20325() {
        this.f47111 = false;
        return this;
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo20332() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f47111 && this.f47110 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36419(Object obj) throws InterruptedIOException {
        try {
            boolean zMo20333 = mo20333();
            long jMo20330 = mo20330();
            long jNanoTime = 0;
            if (!zMo20333 && jMo20330 == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zMo20333 && jMo20330 != 0) {
                jMo20330 = Math.min(jMo20330, mo20331() - jNanoTime2);
            } else if (zMo20333) {
                jMo20330 = mo20331() - jNanoTime2;
            }
            if (jMo20330 > 0) {
                long j = jMo20330 / 1000000;
                Long.signum(j);
                obj.wait(j, (int) (jMo20330 - (1000000 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jMo20330) {
                throw new InterruptedIOException(b.n0);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
