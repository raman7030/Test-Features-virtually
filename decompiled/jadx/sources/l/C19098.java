package l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ᩴ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19098 extends AbstractRunnableC4281 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f60138;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile Thread f60139 = Thread.currentThread();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f60140;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f60141;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f60142;

    public C19098(long j, long j2, boolean z) {
        this.f60142 = z;
        this.f60141 = j;
        this.f60138 = j2;
    }

    @Override // l.AbstractRunnableC4281
    /* JADX INFO: renamed from: ֫ */
    public final FutureC3575 mo2888(int i) {
        Thread thread = this.f60139;
        if (thread != null) {
            this.f60139 = null;
            LockSupport.unpark(thread);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f A[RETURN] */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m43985() {
        if (Thread.interrupted()) {
            this.f60140 = true;
        }
        if (!this.f60140 || !this.f60142) {
            long j = this.f60138;
            if (j == 0) {
                if (this.f60139 == null) {
                    return false;
                }
            } else if (this.f60141 > 0) {
                long jNanoTime = j - System.nanoTime();
                this.f60141 = jNanoTime;
                if (jNanoTime > 0) {
                    if (this.f60139 == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // l.AbstractRunnableC4281
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo5012() {
        return this.f60139 != null;
    }
}
