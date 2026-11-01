package p067l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ᩴ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20520 extends AbstractRunnableC6438 {

    /* JADX INFO: renamed from: ۛ */
    public final long f63372;

    /* JADX INFO: renamed from: ۟ */
    public volatile Thread f63373 = Thread.currentThread();

    /* JADX INFO: renamed from: ۨ */
    public boolean f63374;

    /* JADX INFO: renamed from: ܰ */
    public long f63375;

    /* JADX INFO: renamed from: ᩺ */
    public final boolean f63376;

    public C20520(long j, long j2, boolean z) {
        this.f63376 = z;
        this.f63375 = j;
        this.f63372 = j2;
    }

    @Override // p067l.AbstractRunnableC6438
    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 mo5217(int i) {
        Thread thread = this.f63373;
        if (thread != null) {
            this.f63373 = null;
            LockSupport.unpark(thread);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f A[RETURN] */
    /* JADX INFO: renamed from: ۜ */
    public final boolean m46279() {
        if (Thread.interrupted()) {
            this.f63374 = true;
        }
        if (!this.f63374 || !this.f63376) {
            long j = this.f63372;
            if (j == 0) {
                if (this.f63373 == null) {
                    return false;
                }
            } else if (this.f63375 > 0) {
                long jNanoTime = j - System.nanoTime();
                this.f63375 = jNanoTime;
                if (jNanoTime > 0) {
                    if (this.f63373 == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // p067l.AbstractRunnableC6438
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo7255() {
        return this.f63373 != null;
    }
}
