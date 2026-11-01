package p067l;

/* JADX INFO: renamed from: l.ۢۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11205 implements InterfaceC24615 {

    /* JADX INFO: renamed from: ֫ */
    public final int f31128;

    /* JADX INFO: renamed from: ۧ */
    public final long f31129;

    /* JADX INFO: renamed from: ܳ */
    public final long[] f31130;

    /* JADX INFO: renamed from: ܽ */
    public final long f31131;

    /* JADX INFO: renamed from: ܿ */
    public final long f31132;

    /* JADX INFO: renamed from: ᩳ */
    public final long f31133;

    /* JADX INFO: renamed from: ᩻ */
    public final int f31134;

    /* JADX INFO: renamed from: ֫ */
    public static C11205 m25872(C21934 c21934, long j) {
        long jM49465 = c21934.m49465();
        if (jM49465 == -9223372036854775807L) {
            return null;
        }
        C18777 c18777 = c21934.f68960;
        return new C11205(j, c18777.f56103, jM49465, c18777.f56100, c21934.f68956, c21934.f68958);
    }

    public C11205(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f31133 = j;
        this.f31134 = i;
        this.f31132 = j2;
        this.f31128 = i2;
        this.f31131 = j3;
        this.f31130 = jArr;
        this.f31129 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return this.f31130 != null;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        double d;
        double d2;
        double d3;
        boolean zMo8955 = mo8955();
        int i = this.f31134;
        long j2 = this.f31133;
        if (!zMo8955) {
            C10731 c10731 = new C10731(0L, j2 + ((long) i));
            return new C8719(c10731, c10731);
        }
        long jM12992 = C5792.m12992(j, 0L, this.f31132);
        double d4 = (jM12992 * 100.0d) / this.f31132;
        double d5 = 0.0d;
        if (d4 <= 0.0d) {
            d3 = 256.0d;
        } else if (d4 >= 100.0d) {
            d3 = 256.0d;
            d5 = 256.0d;
        } else {
            int i2 = (int) d4;
            long[] jArr = this.f31130;
            C23877.m52958(jArr);
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
        long j3 = this.f31131;
        C10731 c10732 = new C10731(jM12992, j2 + C5792.m12992(Math.round(d7 * j3), i, j3 - 1));
        return new C8719(c10732, c10732);
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ۧ */
    public final long mo19817(long j) {
        long j2 = j - this.f31133;
        if (!mo8955() || j2 <= this.f31134) {
            return 0L;
        }
        long[] jArr = this.f31130;
        C23877.m52958(jArr);
        double d = (j2 * 256.0d) / this.f31131;
        int iM13012 = C5792.m13012(jArr, (long) d, true);
        long j3 = this.f31132;
        long j4 = (((long) iM13012) * j3) / 100;
        long j5 = jArr[iM13012];
        int i = iM13012 + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iM13012 == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f31132;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ۧ */
    public final long mo19816() {
        return this.f31133 + ((long) this.f31134);
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ᩳ */
    public final long mo19818() {
        return this.f31129;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ᩻ */
    public final int mo19819() {
        return this.f31128;
    }
}
