package l;

/* JADX INFO: renamed from: l.ܰܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes3.dex */
public final class C13916 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f41472;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f41473;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f41474;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f41475;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f41476;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f41477;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f41478;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f41479;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f41480;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f41481;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f41482;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f41485;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f41486;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f41484 = new StringBuilder();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f41483 = -1;

    public C13916(int i, int i2, long j, long j2) {
        this.f41476 = j;
        this.f41477 = j2;
        this.f41482 = i;
        this.f41486 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33326(C13916 c13916, int i) {
        if (c13916.m33329(1, false)) {
            c13916.f41484.appendCodePoint(i);
        }
        c13916.m33328(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33327(C13916 c13916, String str) {
        if (c13916.m33329(str.length(), true)) {
            c13916.f41484.append(str);
        }
        c13916.m33328(true);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m33329(int i, boolean z) {
        int i2;
        if (!this.f41478 && !this.f41481) {
            long j = this.f41479;
            long j2 = this.f41476;
            long j3 = this.f41477;
            if (j > j2 || (j == j2 && this.f41472 > j3)) {
                this.f41481 = true;
            }
            boolean z2 = this.f41481;
            if (!z2 && j == j2) {
                long j4 = this.f41472;
                if (j4 == j3) {
                    this.f41478 = true;
                    this.f41485 = j;
                    this.f41475 = j4;
                } else if (!z2) {
                    this.f41481 = true;
                }
            } else if (!z2 && j == j2 && z) {
                this.f41481 = true;
            }
        }
        if (!this.f41478 || this.f41474) {
            return false;
        }
        long j5 = this.f41483;
        long j6 = this.f41479;
        boolean z3 = j5 != j6;
        if ((z3 && this.f41473 >= this.f41482) || (i2 = this.f41480) > this.f41486 - i) {
            this.f41474 = true;
            this.f41485 = j6;
            this.f41475 = this.f41472;
            return false;
        }
        this.f41480 = i2 + i;
        if (z3) {
            this.f41473++;
            this.f41483 = j6;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33328(boolean z) {
        boolean z2 = this.f41474;
        if (!z2) {
            if ((z ? this.f41479 : this.f41472) == 9007199254740991L) {
                this.f41481 = true;
                return;
            }
        }
        if (this.f41478 && !z2) {
            if (z) {
                this.f41485 = this.f41479 + 1;
                this.f41475 = 0L;
            } else {
                this.f41485 = this.f41479;
                this.f41475 = this.f41472 + 1;
            }
        }
        if (z2) {
            return;
        }
        if (z) {
            this.f41479++;
            this.f41472 = 0L;
        } else {
            this.f41472++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m33330(C13916 c13916) {
        return c13916.f41474;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11801 m33325(C13916 c13916) {
        if (!c13916.f41478 && !c13916.f41481) {
            long j = c13916.f41479;
            if (j == c13916.f41476) {
                long j2 = c13916.f41472;
                if (j2 != c13916.f41477) {
                    c13916.f41481 = true;
                } else {
                    c13916.f41478 = true;
                    c13916.f41485 = j;
                    c13916.f41475 = j2;
                }
            } else {
                c13916.f41481 = true;
            }
        }
        return new C11801(c13916.f41484.toString(), c13916.f41485, c13916.f41475, c13916.f41473, c13916.f41480, c13916.f41474, !c13916.f41481, c13916.f41479, c13916.f41472);
    }
}
