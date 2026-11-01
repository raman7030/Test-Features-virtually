package p067l;

/* JADX INFO: renamed from: l.ᩳ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C19826 {

    /* JADX INFO: renamed from: ֫ */
    public final int f60281;

    /* JADX INFO: renamed from: ۧ */
    public final C19644 f60282;

    /* JADX INFO: renamed from: ܳ */
    public final int f60283;

    /* JADX INFO: renamed from: ܽ */
    public final int f60284;

    /* JADX INFO: renamed from: ܿ */
    public final int f60285;

    /* JADX INFO: renamed from: ᩳ */
    public final long f60286;

    public C19826(C19644 c19644, long j, int i, int i2, int i3) {
        this.f60282 = c19644;
        this.f60286 = j;
        this.f60283 = i;
        this.f60284 = i2;
        long j2 = (((long) i2) - ((long) i)) + 1;
        int i4 = (int) j2;
        if (j2 != i4) {
            throw new ArithmeticException();
        }
        this.f60285 = i4;
        this.f60281 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45074(C8838 c8838) {
        C12862 c12862 = c8838.f23986;
        C19644 c19644M29476 = c12862.m29476();
        C19644 c19644 = this.f60282;
        return c19644M29476 == c19644 && c19644.m44646() == this.f60286 && c12862.m29468() && c12862.m29480() == this.f60283 && c12862.m29466() == this.f60284;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C19826 m45073(C8838 c8838) {
        C12862 c12862 = c8838.f23986;
        if (!c12862.m29468()) {
            return null;
        }
        C19644 c19644M29476 = c12862.m29476();
        int iM29480 = c12862.m29480();
        int iM29466 = c12862.m29466();
        int iM29475 = c12862.m29475();
        if (iM29480 < 0 || iM29466 < iM29480 || iM29466 >= c19644M29476.length() || iM29475 <= 0) {
            return null;
        }
        return new C19826(c19644M29476, c19644M29476.m44646(), iM29480, iM29466, iM29475);
    }
}
