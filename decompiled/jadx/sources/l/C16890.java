package l;

/* JADX INFO: renamed from: l.ܽ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16890 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f51849;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f51850;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f51851;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f51852;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f51853;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f51854;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f51855;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f51856;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m39717(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return C3603.m11016(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }

    public C16890(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f51856 = j;
        this.f51850 = j2;
        this.f51854 = j3;
        this.f51853 = j4;
        this.f51855 = j5;
        this.f51851 = j6;
        this.f51849 = j7;
        this.f51852 = m39717(j2, j3, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m39720(C16890 c16890) {
        return c16890.f51855;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m39718(C16890 c16890) {
        return c16890.f51851;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long m39723(C16890 c16890) {
        return c16890.f51850;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m39724(C16890 c16890) {
        return c16890.f51856;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m39721(C16890 c16890, long j, long j2) {
        c16890.f51854 = j;
        c16890.f51855 = j2;
        c16890.f51852 = m39717(c16890.f51850, j, c16890.f51853, j2, c16890.f51851, c16890.f51849);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39719(C16890 c16890, long j, long j2) {
        c16890.f51853 = j;
        c16890.f51851 = j2;
        c16890.f51852 = m39717(c16890.f51850, c16890.f51854, j, c16890.f51855, j2, c16890.f51849);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m39722(C16890 c16890) {
        return c16890.f51852;
    }
}
