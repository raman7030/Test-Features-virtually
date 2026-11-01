package p067l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C21561 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f68000;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C6808 f68001;

    public C21561(C6808 c6808) {
        this.f68001 = c6808;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ScheduledFuture m48749(RunnableC22668 runnableC22668, long j) {
        ScheduledFuture<?> scheduledFutureSchedule;
        synchronized (this.f68001) {
            if (this.f68000 || this.f68001.f17684) {
                throw new RejectedExecutionException("Persistence scheduler slot is closed");
            }
            scheduledFutureSchedule = this.f68001.f17685.schedule(runnableC22668, j, TimeUnit.NANOSECONDS);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f68001) {
            if (this.f68000) {
                return;
            }
            this.f68000 = true;
            this.f68001.f17683--;
        }
    }
}
