package l;

/* JADX INFO: renamed from: l.᩹ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6MO */
/* JADX INFO: loaded from: classes.dex */
public final class C22097 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19981 f71757;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f71758;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f71759;

    public C22097(C19981 c19981, long j) {
        this.f71757 = c19981;
        this.f71758 = j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m49683(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Allocation must not be negative");
        }
        synchronized (this.f71757) {
            if (!this.f71759 && j <= this.f71757.f64694 - (this.f71757.f64697 - this.f71758)) {
                C19981 c19981 = this.f71757;
                if (C19981.m46065(c19981, (c19981.f64697 - this.f71758) + j)) {
                    Runnable runnable = j < this.f71758 ? this.f71757.f64698 : null;
                    C19981 c19982 = this.f71757;
                    c19982.f64697 = (j - this.f71758) + c19982.f64697;
                    this.f71758 = j;
                    C19981 c19983 = this.f71757;
                    c19983.f64696 = Math.max(c19983.f64696, this.f71757.f64697);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m49682() {
        long j;
        synchronized (this.f71757) {
            j = this.f71758;
        }
        return j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f71757) {
            if (this.f71759) {
                return;
            }
            Runnable runnable = this.f71758 > 0 ? this.f71757.f64698 : null;
            this.f71757.f64697 -= this.f71758;
            this.f71758 = 0L;
            this.f71759 = true;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
