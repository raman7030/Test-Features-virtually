package p067l;

/* JADX INFO: renamed from: l.۟ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6ZU */
/* JADX INFO: loaded from: classes2.dex */
public final class C9197 {

    /* JADX INFO: renamed from: ֫ */
    public final int f24894;

    /* JADX INFO: renamed from: ۧ */
    public final int f24895;

    /* JADX INFO: renamed from: ܽ */
    public final C11209 f24896;

    /* JADX INFO: renamed from: ܿ */
    public final C11209 f24897;

    /* JADX INFO: renamed from: ᩳ */
    public final C19452 f24898;

    public C9197(C11209 c11209, C11209 c112010, C19452 c19452, int i, int i2) {
        this.f24896 = c11209;
        if (i != -1 && i2 != -1) {
            C12826.checkFromToIndex(i, i2, c11209.m25889());
            if (c112010 == null || c112010.m25889() != i2 - i) {
                throw new IllegalArgumentException("Window style coverage differs");
            }
            if (c19452 != null && c19452.m44259() != c112010.m25889()) {
                throw new IllegalArgumentException("Window context coverage differs");
            }
        } else {
            if (i != -1 || i2 != -1) {
                throw new IllegalArgumentException("Incomplete unknown syntax coverage sentinel");
            }
            if (c112010 != null || c19452 != null) {
                throw new IllegalArgumentException("Unknown syntax coverage cannot retain window state");
            }
        }
        this.f24897 = c112010;
        this.f24898 = c19452;
        this.f24895 = i;
        this.f24894 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9197 m21185(int i, int i2, C11209 c11209, C19452 c19452, C23120 c23120) {
        C12826.requireNonNull(c11209, "windowStyles");
        C12826.requireNonNull(c23120, "defaultStyle");
        long jM25889 = ((long) i2) + ((long) c11209.m25889());
        int i3 = (int) jM25889;
        if (jM25889 != i3) {
            throw new ArithmeticException();
        }
        C12826.checkFromToIndex(i2, i3, i);
        return new C9197(m21186(i2, c23120).m25891(c11209).m25891(m21186(i - i3, c23120)), c11209, c19452, i2, i3);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C11209 m21194() {
        return this.f24896;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C11209 m21195() {
        return this.f24897;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C19452 m21196() {
        return this.f24898;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m21197() {
        return this.f24895 != -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m21192() {
        return this.f24895;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m21188() {
        return this.f24894;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9197 m21187(int i, C23120 c23120) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative provisional syntax length");
        }
        C12826.requireNonNull(c23120, "defaultStyle");
        return new C9197(m21186(i, c23120), null, null, -1, -1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m21191(int i, int i2) {
        C12826.checkFromToIndex(i, i2, this.f24896.m25889());
        return m21197() && this.f24895 <= i && i2 <= this.f24894;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m21193() {
        return m21197() && this.f24898 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15231 m21189(int i, int i2, int i3, int i4, int i5, C23120 c23120) {
        C12826.requireNonNull(c23120, "defaultStyle");
        C11209 c11209 = this.f24896;
        int iM25889 = c11209.m25889();
        if (i < 0 || i2 < 0 || i3 < 0 || ((long) i) + ((long) i2) > iM25889) {
            throw new IndexOutOfBoundsException("Invalid syntax projection edit range");
        }
        C12826.checkFromToIndex(i4, i5, iM25889);
        if (i2 == 0 && i3 == 0) {
            return new C15231(this, i4, i5);
        }
        long j = ((long) (iM25889 - i2)) + ((long) i3);
        int i6 = (int) j;
        if (j != i6) {
            throw new ArithmeticException();
        }
        C11209 c11209M25890 = c11209.m25890(i, i + i2, m21186(i3, (i <= 0 || i3 <= 0) ? c23120 : c11209.m25892(i - 1)));
        if (c11209M25890.m25889() != i6) {
            throw new AssertionError("Edited syntax projection length differs");
        }
        long jM21184 = m21184(iM25889, i, i2, i3, i4, i5);
        int i7 = (int) (jM21184 >>> 32);
        int i8 = (int) jM21184;
        if (c11209M25890.m25894() > (((long) i8) - ((long) i7)) + 2) {
            c11209M25890 = m21186(i6, c23120);
        }
        return new C15231(new C9197(c11209M25890, null, null, -1, -1), i7, i8);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23949 m21190(C9197 c9197) {
        int iMax;
        int iMin;
        int i = this.f24895;
        int i2 = this.f24894;
        if (c9197 != null) {
            int i3 = c9197.f24895;
            C11209 c11209 = c9197.f24896;
            int i4 = c9197.f24894;
            int iM25889 = c11209.m25889();
            C11209 c112010 = this.f24896;
            if (iM25889 != c112010.m25889()) {
                throw new IllegalArgumentException("Window projection text length differs");
            }
            if (!m21197() || !c9197.m21197()) {
                return C23949.m53049(i3, i4, i, i2);
            }
            if (i3 == i && i4 == i2) {
                C15901 c15901M25896 = c11209.m25896(c112010);
                C23949 c23949 = C23949.f76078;
                return (c15901M25896 != null && (iMax = Math.max(i, c15901M25896.m36020())) < (iMin = Math.min(i2, c15901M25896.m36019()))) ? C23949.m53049(-1, -1, iMax, iMin) : c23949;
            }
            return C23949.m53049(i3, i4, i, i2);
        }
        return C23949.m53049(-1, -1, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11209 m21186(int i, C23120 c23120) {
        if (i == 0) {
            return C11209.m25887();
        }
        return C11209.m25877(i, c23120, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m21184(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 >= 0 && i3 >= 0 && i4 >= 0) {
            long j = i2;
            long j2 = i3;
            long j3 = j + j2;
            if (j3 <= i) {
                C12826.checkFromToIndex(i5, i6, i);
                long j4 = i4;
                long j5 = ((long) (i - i3)) + j4;
                int i7 = (int) j5;
                long j6 = i7;
                if (j5 != j6) {
                    throw new ArithmeticException();
                }
                long j7 = j + j4;
                long j8 = j4 - j2;
                if (i5 <= i2) {
                    j = i5;
                } else {
                    long j9 = i5;
                    if (j9 >= j3) {
                        j = j9 + j8;
                    }
                }
                long jMin = Math.min(i6 - i5, i7);
                long j10 = j6 - jMin;
                long jMax = Math.max(0L, Math.min(j, j10));
                if (i2 <= i6 && j3 >= i5) {
                    if (j7 >= jMax) {
                        j7 = j7 > jMax + jMin ? j7 - jMin : jMax;
                    }
                    jMax = Math.max(0L, Math.min(j7, j10));
                }
                long j11 = (int) jMax;
                if (jMax != j11) {
                    throw new ArithmeticException();
                }
                long j12 = jMin + j11;
                long j13 = (int) j12;
                if (j12 == j13) {
                    return (j11 << 32) | (4294967295L & j13);
                }
                throw new ArithmeticException();
            }
        }
        throw new IndexOutOfBoundsException("Invalid syntax target edit range");
    }
}
