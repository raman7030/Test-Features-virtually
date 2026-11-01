package p067l;

/* JADX INFO: renamed from: l.۬۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14697 {

    /* JADX INFO: renamed from: ֫ */
    public final C19644 f41917;

    /* JADX INFO: renamed from: ۧ */
    public final long f41918;

    /* JADX INFO: renamed from: ܽ */
    public final int f41919;

    /* JADX INFO: renamed from: ܿ */
    public final int f41920;

    /* JADX INFO: renamed from: ᩳ */
    public final long f41921;

    public C14697(C19644 c19644, int i, int i2, boolean z, long j) {
        this.f41917 = c19644;
        this.f41918 = c19644.m44646();
        this.f41920 = i;
        if (z) {
            long j2 = ((long) i2) + 1;
            int i3 = (int) j2;
            if (j2 != i3) {
                throw new ArithmeticException();
            }
            i = i3;
        }
        this.f41919 = i;
        this.f41921 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33624(C8838 c8838) {
        return c8838.f23986.m29461(this.f41917, this.f41918, this.f41921);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14697 m33623(C8838 c8838) {
        C19644 c19644M29476 = c8838.f23986.m29476();
        C12862 c12862 = c8838.f23986;
        int iM29480 = c12862.m29480();
        int iM29466 = c12862.m29466();
        boolean zM29468 = c12862.m29468();
        long jM29447 = c12862.m29447();
        if (iM29480 < 0 || iM29466 < iM29480) {
            return null;
        }
        if (zM29468 && iM29466 >= c19644M29476.length()) {
            return null;
        }
        if (zM29468 || (iM29480 == iM29466 && iM29480 <= c19644M29476.length())) {
            return new C14697(c19644M29476, iM29480, iM29466, zM29468, jM29447);
        }
        return null;
    }
}
