package l;

/* JADX INFO: renamed from: l.᩷ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8LV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20587 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f66275;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f66276;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long[] f66277;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f66278;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17265 f66279;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f66280;

    public C20587(C17265 c17265, long j, long j2, long[] jArr, int i, int i2) {
        C17265 c17266 = new C17265();
        c17266.f52924 = c17265.f52924;
        c17266.f52923 = c17265.f52923;
        c17266.f52921 = c17265.f52921;
        c17266.f52922 = c17265.f52922;
        c17266.f52919 = c17265.f52919;
        c17266.f52918 = c17265.f52918;
        c17266.f52920 = c17265.f52920;
        this.f66279 = c17266;
        this.f66280 = j;
        this.f66275 = j2;
        this.f66277 = jArr;
        this.f66276 = i;
        this.f66278 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20587 m47138(C17265 c17265, C17714 c17714) {
        long[] jArr;
        int i;
        int i2;
        int iM41493 = c17714.m41493();
        int iM41492 = (iM41493 & 1) != 0 ? c17714.m41492() : -1;
        long jM41479 = (iM41493 & 2) != 0 ? c17714.m41479() : -1L;
        if ((iM41493 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = c17714.m41456();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iM41493 & 8) != 0) {
            c17714.m41478(4);
        }
        if (c17714.m41457() >= 24) {
            c17714.m41478(21);
            int iM41491 = c17714.m41491();
            i2 = iM41491 & 4095;
            i = (16773120 & iM41491) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new C20587(c17265, iM41492, jM41479, jArr, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m47139() {
        long j = this.f66280;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        C17265 c17265 = this.f66279;
        return C3603.m11013(c17265.f52922, (j * ((long) c17265.f52920)) - 1);
    }
}
