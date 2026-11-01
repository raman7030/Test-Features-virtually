package p067l;

/* JADX INFO: renamed from: l.᩹ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6MO */
/* JADX INFO: loaded from: classes.dex */
public final class C23369 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final C21358 f74477;

    /* JADX INFO: renamed from: ᩸ */
    public long f74478;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f74479;

    public C23369(C21358 c21358, long j) {
        this.f74477 = c21358;
        this.f74478 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m52021(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Allocation must not be negative");
        }
        synchronized (this.f74477) {
            if (!this.f74479 && j <= this.f74477.f67334 - (this.f74477.f67337 - this.f74478)) {
                C21358 c21358 = this.f74477;
                if (C21358.m48379(c21358, (c21358.f67337 - this.f74478) + j)) {
                    Runnable runnable = j < this.f74478 ? this.f74477.f67338 : null;
                    C21358 c21359 = this.f74477;
                    c21359.f67337 = (j - this.f74478) + c21359.f67337;
                    this.f74478 = j;
                    C21358 c213510 = this.f74477;
                    c213510.f67336 = Math.max(c213510.f67336, this.f74477.f67337);
                    if (runnable == null) {
                        return true;
                    }
                    runnable.run();
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m52020() {
        long j;
        synchronized (this.f74477) {
            j = this.f74478;
        }
        return j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f74477) {
            if (this.f74479) {
                return;
            }
            Runnable runnable = this.f74478 > 0 ? this.f74477.f67338 : null;
            this.f74477.f67337 -= this.f74478;
            this.f74478 = 0L;
            this.f74479 = true;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
