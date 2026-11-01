package p067l;

/* JADX INFO: renamed from: l.ܽ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C18421 {

    /* JADX INFO: renamed from: ֫ */
    public final long f55030;

    /* JADX INFO: renamed from: ۜ */
    public final long f55031;

    /* JADX INFO: renamed from: ۧ */
    public long f55032;

    /* JADX INFO: renamed from: ܳ */
    public long f55033;

    /* JADX INFO: renamed from: ܽ */
    public long f55034;

    /* JADX INFO: renamed from: ܿ */
    public long f55035;

    /* JADX INFO: renamed from: ᩳ */
    public long f55036;

    /* JADX INFO: renamed from: ᩻ */
    public final long f55037;

    /* JADX INFO: renamed from: ֫ */
    public static long m41958(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return C5792.m12992(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }

    public C18421(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f55037 = j;
        this.f55031 = j2;
        this.f55035 = j3;
        this.f55034 = j4;
        this.f55036 = j5;
        this.f55032 = j6;
        this.f55030 = j7;
        this.f55033 = m41958(j2, j3, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m41961(C18421 c18421) {
        return c18421.f55036;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m41959(C18421 c18421) {
        return c18421.f55032;
    }

    /* JADX INFO: renamed from: ܿ */
    public static long m41964(C18421 c18421) {
        return c18421.f55031;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static long m41965(C18421 c18421) {
        return c18421.f55037;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m41962(C18421 c18421, long j, long j2) {
        c18421.f55035 = j;
        c18421.f55036 = j2;
        c18421.f55033 = m41958(c18421.f55031, j, c18421.f55034, j2, c18421.f55032, c18421.f55030);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41960(C18421 c18421, long j, long j2) {
        c18421.f55034 = j;
        c18421.f55032 = j2;
        c18421.f55033 = m41958(c18421.f55031, c18421.f55035, j, c18421.f55036, j2, c18421.f55030);
    }

    /* JADX INFO: renamed from: ܽ */
    public static long m41963(C18421 c18421) {
        return c18421.f55033;
    }
}
