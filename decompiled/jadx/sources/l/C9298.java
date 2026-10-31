package l;

/* JADX INFO: renamed from: l.ۢۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C9298 implements InterfaceC23408 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f28179;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f28180;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long[] f28181;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f28182;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f28183;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f28184;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f28185;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9298 m23863(C20587 c20587, long j) {
        long jM47139 = c20587.m47139();
        if (jM47139 == -9223372036854775807L) {
            return null;
        }
        C17265 c17265 = c20587.f66279;
        return new C9298(j, c17265.f52921, jM47139, c17265.f52918, c20587.f66275, c20587.f66277);
    }

    public C9298(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f28184 = j;
        this.f28185 = i;
        this.f28183 = j2;
        this.f28179 = i2;
        this.f28182 = j3;
        this.f28181 = jArr;
        this.f28180 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return this.f28181 != null;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        double d;
        double d2;
        double d3;
        boolean zMo6829 = mo6829();
        int i = this.f28185;
        long j2 = this.f28184;
        if (!zMo6829) {
            C8799 c8799 = new C8799(0L, j2 + ((long) i));
            return new C6682(c8799, c8799);
        }
        long jM11016 = C3603.m11016(j, 0L, this.f28183);
        double d4 = (jM11016 * 100.0d) / this.f28183;
        double d5 = 0.0d;
        if (d4 <= 0.0d) {
            d3 = 256.0d;
        } else if (d4 >= 100.0d) {
            d3 = 256.0d;
            d5 = 256.0d;
        } else {
            int i2 = (int) d4;
            long[] jArr = this.f28181;
            C22632.m50632(jArr);
            double d6 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = jArr[i2 + 1];
                d2 = 256.0d;
            }
            d5 = ((d - d6) * (d4 - ((double) i2))) + d6;
            d3 = d2;
        }
        double d7 = d5 / d3;
        long j3 = this.f28182;
        C8799 c87910 = new C8799(jM11016, j2 + C3603.m11016(Math.round(d7 * j3), i, j3 - 1));
        return new C6682(c87910, c87910);
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ۧ */
    public final long mo17869(long j) {
        long j2 = j - this.f28184;
        if (!mo6829() || j2 <= this.f28185) {
            return 0L;
        }
        long[] jArr = this.f28181;
        C22632.m50632(jArr);
        double d = (j2 * 256.0d) / this.f28182;
        int iM11036 = C3603.m11036(jArr, (long) d, true);
        long j3 = this.f28183;
        long j4 = (((long) iM11036) * j3) / 100;
        long j5 = jArr[iM11036];
        int i = iM11036 + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iM11036 == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f28183;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ۧ */
    public final long mo17868() {
        return this.f28184 + ((long) this.f28185);
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ᩳ */
    public final long mo17870() {
        return this.f28180;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ᩻ */
    public final int mo17871() {
        return this.f28179;
    }
}
