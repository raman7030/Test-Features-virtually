package p067l;

/* JADX INFO: renamed from: l.ۨ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78NK */
/* JADX INFO: loaded from: classes3.dex */
public final class C13807 {

    /* JADX INFO: renamed from: ֫ */
    public final C14218 f39015;

    /* JADX INFO: renamed from: ܿ */
    public long f39022;

    /* JADX INFO: renamed from: ᩷ */
    public final C7101 f39024;

    /* JADX INFO: renamed from: ۢ */
    public final C21854 f39018 = new C21854();

    /* JADX INFO: renamed from: ۡ */
    public final C21886 f39017 = new C21886();

    /* JADX INFO: renamed from: ۜ */
    public final C21886 f39016 = new C21886();

    /* JADX INFO: renamed from: ᩻ */
    public final C5240 f39025 = new C5240();

    /* JADX INFO: renamed from: ܽ */
    public long f39021 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ */
    public C8454 f39020 = C8454.f22684;

    /* JADX INFO: renamed from: ᩳ */
    public long f39023 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ */
    public long f39019 = -9223372036854775807L;

    public C13807(C14218 c14218, C7101 c7101) {
        this.f39015 = c14218;
        this.f39024 = c7101;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31458() {
        this.f39025.m11308();
        this.f39021 = -9223372036854775807L;
        this.f39023 = -9223372036854775807L;
        this.f39019 = -9223372036854775807L;
        C21886 c21886 = this.f39016;
        if (c21886.m49352() > 0) {
            C23877.m52957(c21886.m49352() > 0);
            while (c21886.m49352() > 1) {
                c21886.m49350();
            }
            Object objM49350 = c21886.m49350();
            objM49350.getClass();
            this.f39022 = ((Long) objM49350).longValue();
        }
        C21886 c21887 = this.f39017;
        if (c21887.m49352() > 0) {
            C23877.m52957(c21887.m49352() > 0);
            while (c21887.m49352() > 1) {
                c21887.m49350();
            }
            Object objM49351 = c21887.m49350();
            objM49351.getClass();
            c21887.m49349(0L, (C8454) objM49351);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31462(long j, long j2) {
        long jM49298;
        while (true) {
            C5240 c5240 = this.f39025;
            if (c5240.m11311()) {
                return;
            }
            long jM11310 = c5240.m11310();
            Long l2 = (Long) this.f39016.m49351(jM11310);
            C7101 c7101 = this.f39024;
            if (l2 != null && l2.longValue() != this.f39022) {
                this.f39022 = l2.longValue();
                c7101.m16345(2);
            }
            long j3 = this.f39022;
            C7101 c7102 = this.f39024;
            C21854 c21854 = this.f39018;
            int iM16342 = c7102.m16342(jM11310, j, j2, j3, false, false, c21854);
            final C14218 c14218 = this.f39015;
            if (iM16342 == 0 || iM16342 == 1) {
                this.f39023 = jM11310;
                boolean z = iM16342 == 0;
                long jM11312 = c5240.m11312();
                C8454 c8454 = (C8454) this.f39017.m49351(jM11312);
                if (c8454 != null && !c8454.equals(C8454.f22684) && !c8454.equals(this.f39020)) {
                    this.f39020 = c8454;
                    c14218.m32693(c8454);
                }
                if (z) {
                    jM49298 = System.nanoTime();
                } else {
                    jM49298 = c21854.m49298();
                }
                c14218.m32692(jM49298, jM11312, c7101.m16352());
            } else if (iM16342 == 2 || iM16342 == 3) {
                this.f39023 = jM11310;
                c5240.m11312();
                C12207 c12207 = c14218.f40506;
                c12207.f34120.execute(new Runnable() { // from class: l.ۗܳۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c14218.f40506.f34118.mo27044();
                    }
                });
                ((InterfaceC16015) c12207.f34119.remove()).skip();
            } else {
                if (iM16342 != 4) {
                    if (iM16342 != 5) {
                        throw new IllegalStateException(String.valueOf(iM16342));
                    }
                    return;
                }
                this.f39023 = jM11310;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31459(int i, int i2) {
        long j = this.f39021;
        this.f39017.m49349(j == -9223372036854775807L ? 0L : j + 1, new C8454(i, i2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31460(int i, long j) {
        if (this.f39025.m11311()) {
            this.f39024.m16345(i);
            this.f39022 = j;
        } else {
            long j2 = this.f39021;
            this.f39016.m49349(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31461(long j) {
        this.f39025.m11309(j);
        this.f39021 = j;
        this.f39019 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m31464() {
        if (this.f39021 == -9223372036854775807L) {
            this.f39021 = Long.MIN_VALUE;
            this.f39023 = Long.MIN_VALUE;
        }
        this.f39019 = this.f39021;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m31463() {
        long j = this.f39019;
        return j != -9223372036854775807L && this.f39023 == j;
    }
}
