package p067l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۤ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12419 implements InterfaceC14608 {

    /* JADX INFO: renamed from: ۢ */
    public final float f34706;

    /* JADX INFO: renamed from: ܿ */
    public final long f34711;

    /* JADX INFO: renamed from: ᩴ */
    public final long f34713;

    /* JADX INFO: renamed from: ۜ */
    public long f34704 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۘ */
    public long f34703 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۡ */
    public long f34705 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻ */
    public long f34715 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩷ */
    public float f34714 = 0.97f;

    /* JADX INFO: renamed from: ܳ */
    public float f34708 = 1.03f;

    /* JADX INFO: renamed from: ֫ */
    public float f34701 = 1.0f;

    /* JADX INFO: renamed from: ᩳ */
    public long f34712 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܽ */
    public long f34710 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ */
    public long f34707 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۖ */
    public long f34702 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܺ */
    public long f34709 = -9223372036854775807L;

    public C12419(float f, long j, long j2) {
        this.f34711 = j;
        this.f34713 = j2;
        this.f34706 = f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28604(C8295 c8295) {
        this.f34704 = C5792.m12990(c8295.f21968);
        this.f34705 = C5792.m12990(c8295.f21967);
        this.f34715 = C5792.m12990(c8295.f21965);
        float f = c8295.f21969;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.f34714 = f;
        float f2 = c8295.f21966;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        this.f34708 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f34704 = -9223372036854775807L;
        }
        m28600();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28603(long j) {
        this.f34703 = j;
        m28600();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28605() {
        long j = this.f34707;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f34713;
        this.f34707 = j2;
        long j3 = this.f34715;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f34707 = j3;
        }
        this.f34712 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m28601(long j, long j2) {
        if (this.f34704 == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.f34702;
        if (j4 == -9223372036854775807L) {
            this.f34702 = j3;
            this.f34709 = 0L;
        } else {
            float f = this.f34706;
            float f2 = 1.0f - f;
            long jMax = Math.max(j3, (long) ((j3 * f2) + (j4 * f)));
            this.f34702 = jMax;
            this.f34709 = (long) ((f2 * Math.abs(j3 - jMax)) + (f * this.f34709));
        }
        if (this.f34712 != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f34712 < 1000) {
            return this.f34701;
        }
        this.f34712 = SystemClock.elapsedRealtime();
        long j5 = (this.f34709 * 3) + this.f34702;
        if (this.f34707 > j5) {
            float fM12990 = C5792.m12990(1000L);
            long[] jArr = {j5, this.f34710, this.f34707 - (((long) ((this.f34701 - 1.0f) * fM12990)) + ((long) ((this.f34708 - 1.0f) * fM12990)))};
            long j6 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j6) {
                    j6 = j7;
                }
            }
            this.f34707 = j6;
        } else {
            long jM12992 = C5792.m12992(j - ((long) (Math.max(0.0f, this.f34701 - 1.0f) / 1.0E-7f)), this.f34707, j5);
            this.f34707 = jM12992;
            long j8 = this.f34715;
            if (j8 != -9223372036854775807L && jM12992 > j8) {
                this.f34707 = j8;
            }
        }
        long j9 = j - this.f34707;
        if (Math.abs(j9) < this.f34711) {
            this.f34701 = 1.0f;
        } else {
            this.f34701 = C5792.m12973((1.0E-7f * j9) + 1.0f, this.f34714, this.f34708);
        }
        return this.f34701;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m28602() {
        return this.f34707;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m28600() {
        long j;
        long j2 = this.f34704;
        if (j2 != -9223372036854775807L) {
            j = this.f34703;
            if (j == -9223372036854775807L) {
                long j3 = this.f34705;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f34715;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f34710 == j) {
            return;
        }
        this.f34710 = j;
        this.f34707 = j;
        this.f34702 = -9223372036854775807L;
        this.f34709 = -9223372036854775807L;
        this.f34712 = -9223372036854775807L;
    }
}
