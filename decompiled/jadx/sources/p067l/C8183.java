package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8MT */
/* JADX INFO: loaded from: classes2.dex */
public final class C8183 {

    /* JADX INFO: renamed from: ֫ */
    public long f21600;

    /* JADX INFO: renamed from: ۜ */
    public final boolean[] f21601 = new boolean[15];

    /* JADX INFO: renamed from: ۧ */
    public long f21602;

    /* JADX INFO: renamed from: ܳ */
    public long f21603;

    /* JADX INFO: renamed from: ܽ */
    public long f21604;

    /* JADX INFO: renamed from: ܿ */
    public long f21605;

    /* JADX INFO: renamed from: ᩳ */
    public long f21606;

    /* JADX INFO: renamed from: ᩻ */
    public int f21607;

    /* JADX INFO: renamed from: ܿ */
    public final void m18964() {
        this.f21604 = 0L;
        this.f21605 = 0L;
        this.f21603 = 0L;
        this.f21607 = 0;
        Arrays.fill(this.f21601, false);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m18965() {
        return this.f21604 > 15 && this.f21607 == 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m18963() {
        long j = this.f21604;
        if (j == 0) {
            return false;
        }
        return this.f21601[(int) ((j - 1) % 15)];
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m18962() {
        return this.f21603;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m18960() {
        long j = this.f21605;
        if (j == 0) {
            return 0L;
        }
        return this.f21603 / j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18961(long j) {
        long j2 = this.f21604;
        if (j2 == 0) {
            this.f21602 = j;
        } else if (j2 == 1) {
            long j3 = j - this.f21602;
            this.f21600 = j3;
            this.f21603 = j3;
            this.f21605 = 1L;
        } else {
            long j4 = j - this.f21606;
            int i = (int) (j2 % 15);
            long jAbs = Math.abs(j4 - this.f21600);
            boolean[] zArr = this.f21601;
            if (jAbs <= 1000000) {
                this.f21605++;
                this.f21603 += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f21607--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f21607++;
            }
        }
        this.f21604++;
        this.f21606 = j;
    }
}
