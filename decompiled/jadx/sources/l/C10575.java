package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۤ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10575 implements InterfaceC12879 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float f31740;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f31745;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f31747;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f31738 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f31737 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f31739 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f31749 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f31748 = 0.97f;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f31742 = 1.03f;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f31735 = 1.0f;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f31746 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f31744 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f31741 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f31736 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f31743 = -9223372036854775807L;

    public C10575(float f, long j, long j2) {
        this.f31745 = j;
        this.f31747 = j2;
        this.f31740 = f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26570(C6236 c6236) {
        this.f31738 = C3603.m11014(c6236.f19103);
        this.f31739 = C3603.m11014(c6236.f19102);
        this.f31749 = C3603.m11014(c6236.f19100);
        float f = c6236.f19104;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.f31748 = f;
        float f2 = c6236.f19101;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        this.f31742 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f31738 = -9223372036854775807L;
        }
        m26566();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26569(long j) {
        this.f31737 = j;
        m26566();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26571() {
        long j = this.f31741;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f31747;
        this.f31741 = j2;
        long j3 = this.f31749;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f31741 = j3;
        }
        this.f31746 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m26567(long j, long j2) {
        if (this.f31738 == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.f31736;
        if (j4 == -9223372036854775807L) {
            this.f31736 = j3;
            this.f31743 = 0L;
        } else {
            float f = this.f31740;
            float f2 = 1.0f - f;
            long jMax = Math.max(j3, (long) ((j3 * f2) + (j4 * f)));
            this.f31736 = jMax;
            this.f31743 = (long) ((f2 * Math.abs(j3 - jMax)) + (f * this.f31743));
        }
        if (this.f31746 != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f31746 < 1000) {
            return this.f31735;
        }
        this.f31746 = SystemClock.elapsedRealtime();
        long j5 = (this.f31743 * 3) + this.f31736;
        if (this.f31741 > j5) {
            float fM11014 = C3603.m11014(1000L);
            long[] jArr = {j5, this.f31744, this.f31741 - (((long) ((this.f31735 - 1.0f) * fM11014)) + ((long) ((this.f31742 - 1.0f) * fM11014)))};
            long j6 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j6) {
                    j6 = j7;
                }
            }
            this.f31741 = j6;
        } else {
            long jM11016 = C3603.m11016(j - ((long) (Math.max(0.0f, this.f31735 - 1.0f) / 1.0E-7f)), this.f31741, j5);
            this.f31741 = jM11016;
            long j8 = this.f31749;
            if (j8 != -9223372036854775807L && jM11016 > j8) {
                this.f31741 = j8;
            }
        }
        long j9 = j - this.f31741;
        if (Math.abs(j9) < this.f31745) {
            this.f31735 = 1.0f;
        } else {
            this.f31735 = C3603.m10997((1.0E-7f * j9) + 1.0f, this.f31748, this.f31742);
        }
        return this.f31735;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m26568() {
        return this.f31741;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m26566() {
        long j;
        long j2 = this.f31738;
        if (j2 != -9223372036854775807L) {
            j = this.f31737;
            if (j == -9223372036854775807L) {
                long j3 = this.f31739;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f31749;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f31744 == j) {
            return;
        }
        this.f31744 = j;
        this.f31741 = j;
        this.f31736 = -9223372036854775807L;
        this.f31743 = -9223372036854775807L;
        this.f31746 = -9223372036854775807L;
    }
}
