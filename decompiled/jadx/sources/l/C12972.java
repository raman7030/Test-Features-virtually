package l;

/* JADX INFO: renamed from: l.۬۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12972 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18177 f38873;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f38874;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f38875;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f38876;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f38877;

    public C12972(C18177 c18177, int i, int i2, boolean z, long j) {
        this.f38873 = c18177;
        this.f38874 = c18177.m42385();
        this.f38876 = i;
        if (z) {
            long j2 = ((long) i2) + 1;
            int i3 = (int) j2;
            if (j2 != i3) {
                throw new ArithmeticException();
            }
            i = i3;
        }
        this.f38875 = i;
        this.f38877 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31539(C6807 c6807) {
        return c6807.f21109.m27399(this.f38873, this.f38874, this.f38877);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12972 m31538(C6807 c6807) {
        C18177 c18177M27414 = c6807.f21109.m27414();
        C11041 c11041 = c6807.f21109;
        int iM27418 = c11041.m27418();
        int iM27404 = c11041.m27404();
        boolean zM27406 = c11041.m27406();
        long jM27385 = c11041.m27385();
        if (iM27418 < 0 || iM27404 < iM27418) {
            return null;
        }
        if (zM27406 && iM27404 >= c18177M27414.length()) {
            return null;
        }
        if (zM27406 || (iM27418 == iM27404 && iM27418 <= c18177M27414.length())) {
            return new C12972(c18177M27414, iM27418, iM27404, zM27406, jM27385);
        }
        return null;
    }
}
