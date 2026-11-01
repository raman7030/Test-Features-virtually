package p067l;

/* JADX INFO: renamed from: l.ܰܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes3.dex */
public final class C15594 {

    /* JADX INFO: renamed from: ֫ */
    public long f44553;

    /* JADX INFO: renamed from: ۖ */
    public int f44554;

    /* JADX INFO: renamed from: ۘ */
    public boolean f44555;

    /* JADX INFO: renamed from: ۜ */
    public long f44556;

    /* JADX INFO: renamed from: ۡ */
    public final long f44557;

    /* JADX INFO: renamed from: ۢ */
    public final long f44558;

    /* JADX INFO: renamed from: ۧ */
    public boolean f44559;

    /* JADX INFO: renamed from: ܳ */
    public long f44560;

    /* JADX INFO: renamed from: ܺ */
    public int f44561;

    /* JADX INFO: renamed from: ܽ */
    public boolean f44562;

    /* JADX INFO: renamed from: ܿ */
    public final int f44563;

    /* JADX INFO: renamed from: ᩷ */
    public long f44566;

    /* JADX INFO: renamed from: ᩻ */
    public final int f44567;

    /* JADX INFO: renamed from: ᩴ */
    public final StringBuilder f44565 = new StringBuilder();

    /* JADX INFO: renamed from: ᩳ */
    public long f44564 = -1;

    public C15594(int i, int i2, long j, long j2) {
        this.f44557 = j;
        this.f44558 = j2;
        this.f44563 = i;
        this.f44567 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35445(C15594 c15594, int i) {
        if (c15594.m35448(1, false)) {
            c15594.f44565.appendCodePoint(i);
        }
        c15594.m35447(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35446(C15594 c15594, String str) {
        if (c15594.m35448(str.length(), true)) {
            c15594.f44565.append(str);
        }
        c15594.m35447(true);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX INFO: renamed from: ֫ */
    private boolean m35448(int i, boolean z) {
        int i2;
        if (!this.f44559 && !this.f44562) {
            long j = this.f44560;
            long j2 = this.f44557;
            long j3 = this.f44558;
            if (j > j2 || (j == j2 && this.f44553 > j3)) {
                this.f44562 = true;
            }
            boolean z2 = this.f44562;
            if (!z2 && j == j2) {
                long j4 = this.f44553;
                if (j4 == j3) {
                    this.f44559 = true;
                    this.f44566 = j;
                    this.f44556 = j4;
                } else if (!z2) {
                    this.f44562 = true;
                }
            } else if (!z2 && j == j2 && z) {
                this.f44562 = true;
            }
        }
        if (!this.f44559 || this.f44555) {
            return false;
        }
        long j5 = this.f44564;
        long j6 = this.f44560;
        boolean z3 = j5 != j6;
        if ((z3 && this.f44554 >= this.f44563) || (i2 = this.f44561) > this.f44567 - i) {
            this.f44555 = true;
            this.f44566 = j6;
            this.f44556 = this.f44553;
            return false;
        }
        this.f44561 = i2 + i;
        if (z3) {
            this.f44554++;
            this.f44564 = j6;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35447(boolean z) {
        boolean z2 = this.f44555;
        if (!z2) {
            if ((z ? this.f44560 : this.f44553) == 9007199254740991L) {
                this.f44562 = true;
                return;
            }
        }
        if (this.f44559 && !z2) {
            if (z) {
                this.f44566 = this.f44560 + 1;
                this.f44556 = 0L;
            } else {
                this.f44566 = this.f44560;
                this.f44556 = this.f44553 + 1;
            }
        }
        if (z2) {
            return;
        }
        if (z) {
            this.f44560++;
            this.f44553 = 0L;
        } else {
            this.f44553++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m35449(C15594 c15594) {
        return c15594.f44555;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX INFO: renamed from: ֫ */
    public static C13584 m35444(C15594 c15594) {
        if (!c15594.f44559 && !c15594.f44562) {
            long j = c15594.f44560;
            if (j == c15594.f44557) {
                long j2 = c15594.f44553;
                if (j2 != c15594.f44558) {
                    c15594.f44562 = true;
                } else {
                    c15594.f44559 = true;
                    c15594.f44566 = j;
                    c15594.f44556 = j2;
                }
            } else {
                c15594.f44562 = true;
            }
        }
        return new C13584(c15594.f44565.toString(), c15594.f44566, c15594.f44556, c15594.f44554, c15594.f44561, c15594.f44555, !c15594.f44562, c15594.f44560, c15594.f44553);
    }
}
