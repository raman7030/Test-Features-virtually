package l;

/* JADX INFO: renamed from: l.ۜۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8H3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6475 implements InterfaceC23408 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f19992;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f19993;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long[] f19994;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f19995;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long[] f19996;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f19997;

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6475 m17867(long j, long j2, C17265 c17265, C17714 c17714) {
        long j3;
        long jMax;
        int iM41456;
        c17714.m41478(6);
        int iM41493 = c17714.m41493();
        long j4 = j2 + ((long) c17265.f52921);
        long j5 = ((long) iM41493) + j4;
        int iM41494 = c17714.m41493();
        if (iM41494 <= 0) {
            return null;
        }
        long jM11013 = C3603.m11013(c17265.f52922, (((long) iM41494) * ((long) c17265.f52920)) - 1);
        int iM41464 = c17714.m41464();
        int iM41465 = c17714.m41464();
        int iM41466 = c17714.m41464();
        c17714.m41478(2);
        long j6 = j2 + ((long) c17265.f52921);
        long[] jArr = new long[iM41464];
        long[] jArr2 = new long[iM41464];
        int i = 0;
        while (i < iM41464) {
            long j7 = j5;
            long j8 = jM11013;
            jArr[i] = (((long) i) * jM11013) / ((long) iM41464);
            jArr2[i] = j6;
            if (iM41466 == 1) {
                iM41456 = c17714.m41456();
            } else if (iM41466 == 2) {
                iM41456 = c17714.m41464();
            } else if (iM41466 == 3) {
                iM41456 = c17714.m41491();
            } else {
                if (iM41466 != 4) {
                    return null;
                }
                iM41456 = c17714.m41492();
            }
            j6 += ((long) iM41456) * ((long) iM41465);
            i++;
            j5 = j7;
            jM11013 = j8;
        }
        long j9 = j5;
        long j10 = jM11013;
        if (j == -1 || j == j9) {
            j3 = j9;
        } else {
            StringBuilder sbM31106 = C12803.m31106("VBRI data size mismatch: ", ", ", j);
            j3 = j9;
            sbM31106.append(j3);
            C19956.m46037(sbM31106.toString());
        }
        if (j3 != j6) {
            StringBuilder sbM31107 = C12803.m31106("VBRI bytes and ToC mismatch (using max): ", ", ", j3);
            sbM31107.append(j6);
            sbM31107.append("\nSeeking will be inaccurate.");
            C19956.m46037(sbM31107.toString());
            jMax = Math.max(j3, j6);
        } else {
            jMax = j3;
        }
        return new C6475(jArr, jArr2, j10, j4, jMax, c17265.f52918);
    }

    public C6475(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.f19994 = jArr;
        this.f19996 = jArr2;
        this.f19997 = j;
        this.f19995 = j2;
        this.f19993 = j3;
        this.f19992 = i;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        long[] jArr = this.f19994;
        int iM11036 = C3603.m11036(jArr, j, true);
        long j2 = jArr[iM11036];
        long[] jArr2 = this.f19996;
        C8799 c8799 = new C8799(j2, jArr2[iM11036]);
        if (j2 >= j || iM11036 == jArr.length - 1) {
            return new C6682(c8799, c8799);
        }
        int i = iM11036 + 1;
        return new C6682(c8799, new C8799(jArr[i], jArr2[i]));
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo17869(long j) {
        return this.f19994[C3603.m11036(this.f19996, j, true)];
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f19997;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo17868() {
        return this.f19995;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long mo17870() {
        return this.f19993;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo17871() {
        return this.f19992;
    }
}
