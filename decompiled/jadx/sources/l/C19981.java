package l;

/* JADX INFO: renamed from: l.᩶ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6MO */
/* JADX INFO: loaded from: classes4.dex */
public final class C19981 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f64694;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22097 f64695;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f64696;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f64697;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Runnable f64698;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22097 m46068(long j) {
        try {
            if (j < 0) {
                throw new IllegalArgumentException("Reservation must not be negative");
            }
            long j2 = this.f64694;
            long j3 = this.f64697;
            if (j <= j2 - j3) {
                long j4 = j3 + j;
                C22097 c22097 = this.f64695;
                if (c22097 == null || c22097.m49683(Math.max(j4, c22097.m49682()))) {
                    long j5 = this.f64697 + j;
                    this.f64697 = j5;
                    this.f64696 = Math.max(this.f64696, j5);
                    return new C22097(this, j);
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m46069(RunnableC19472 runnableC19472) {
        this.f64698 = runnableC19472;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized long m46070() {
        return this.f64697;
    }

    public C19981(long j, C22097 c22097) {
        if (j <= 0) {
            throw new IllegalArgumentException("Bitmap budget must be positive");
        }
        this.f64694 = j;
        this.f64695 = c22097;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m46065(C19981 c19981, long j) {
        C22097 c22097 = c19981.f64695;
        return c22097 == null || c22097.m49683(Math.max(j, c22097.m49682()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m46067() {
        return this.f64694;
    }
}
