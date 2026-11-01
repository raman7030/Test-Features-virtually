package p067l;

/* JADX INFO: renamed from: l.᩶ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6MO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21358 {

    /* JADX INFO: renamed from: ֫ */
    public final long f67334;

    /* JADX INFO: renamed from: ۧ */
    public final C23369 f67335;

    /* JADX INFO: renamed from: ܽ */
    public long f67336;

    /* JADX INFO: renamed from: ܿ */
    public long f67337;

    /* JADX INFO: renamed from: ᩳ */
    public Runnable f67338;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C23369 m48382(long j) {
        try {
            if (j < 0) {
                throw new IllegalArgumentException("Reservation must not be negative");
            }
            long j2 = this.f67334;
            long j3 = this.f67337;
            if (j <= j2 - j3) {
                long j4 = j3 + j;
                C23369 c23369 = this.f67335;
                if (c23369 == null || c23369.m52021(Math.max(j4, c23369.m52020()))) {
                    long j5 = this.f67337 + j;
                    this.f67337 = j5;
                    this.f67336 = Math.max(this.f67336, j5);
                    return new C23369(this, j);
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m48383(RunnableC20875 runnableC20875) {
        this.f67338 = runnableC20875;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized long m48384() {
        return this.f67337;
    }

    public C21358(long j, C23369 c23369) {
        if (j <= 0) {
            throw new IllegalArgumentException("Bitmap budget must be positive");
        }
        this.f67334 = j;
        this.f67335 = c23369;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m48379(C21358 c21358, long j) {
        C23369 c23369 = c21358.f67335;
        return c23369 == null || c23369.m52021(Math.max(j, c23369.m52020()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m48381() {
        return this.f67334;
    }
}
