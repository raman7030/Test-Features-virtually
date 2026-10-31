package l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20194 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f65353;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4671 f65354;

    public C20194(C4671 c4671) {
        this.f65354 = c4671;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ScheduledFuture m46430(RunnableC21359 runnableC21359, long j) {
        ScheduledFuture<?> scheduledFutureSchedule;
        synchronized (this.f65354) {
            if (this.f65353 || this.f65354.f14855) {
                throw new RejectedExecutionException("Persistence scheduler slot is closed");
            }
            scheduledFutureSchedule = this.f65354.f14856.schedule(runnableC21359, j, TimeUnit.NANOSECONDS);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f65354) {
            if (this.f65353) {
                return;
            }
            this.f65353 = true;
            this.f65354.f14854--;
        }
    }
}
