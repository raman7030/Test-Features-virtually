package l;

/* JADX INFO: renamed from: l.۟ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6ZU */
/* JADX INFO: loaded from: classes2.dex */
public final class C7185 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f22015;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f22016;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9302 f22017;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9302 f22018;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17975 f22019;

    public C7185(C9302 c9302, C9302 c9303, C17975 c17975, int i, int i2) {
        this.f22017 = c9302;
        if (i != -1 && i2 != -1) {
            C11003.checkFromToIndex(i, i2, c9302.m23880());
            if (c9303 == null || c9303.m23880() != i2 - i) {
                throw new IllegalArgumentException("Window style coverage differs");
            }
            if (c17975 != null && c17975.m42010() != c9303.m23880()) {
                throw new IllegalArgumentException("Window context coverage differs");
            }
        } else {
            if (i != -1 || i2 != -1) {
                throw new IllegalArgumentException("Incomplete unknown syntax coverage sentinel");
            }
            if (c9303 != null || c17975 != null) {
                throw new IllegalArgumentException("Unknown syntax coverage cannot retain window state");
            }
        }
        this.f22018 = c9303;
        this.f22019 = c17975;
        this.f22016 = i;
        this.f22015 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7185 m19238(int i, int i2, C9302 c9302, C17975 c17975, C21834 c21834) {
        C11003.requireNonNull(c9302, "windowStyles");
        C11003.requireNonNull(c21834, "defaultStyle");
        long jM23880 = ((long) i2) + ((long) c9302.m23880());
        int i3 = (int) jM23880;
        if (jM23880 != i3) {
            throw new ArithmeticException();
        }
        C11003.checkFromToIndex(i2, i3, i);
        return new C7185(m19239(i2, c21834).m23882(c9302).m23882(m19239(i - i3, c21834)), c9302, c17975, i2, i3);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9302 m19247() {
        return this.f22017;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9302 m19248() {
        return this.f22018;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17975 m19249() {
        return this.f22019;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m19250() {
        return this.f22016 != -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m19245() {
        return this.f22016;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m19241() {
        return this.f22015;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7185 m19240(int i, C21834 c21834) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative provisional syntax length");
        }
        C11003.requireNonNull(c21834, "defaultStyle");
        return new C7185(m19239(i, c21834), null, null, -1, -1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19244(int i, int i2) {
        C11003.checkFromToIndex(i, i2, this.f22017.m23880());
        return m19250() && this.f22016 <= i && i2 <= this.f22015;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m19246() {
        return m19250() && this.f22019 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13534 m19242(int i, int i2, int i3, int i4, int i5, C21834 c21834) {
        C11003.requireNonNull(c21834, "defaultStyle");
        C9302 c9302 = this.f22017;
        int iM23880 = c9302.m23880();
        if (i < 0 || i2 < 0 || i3 < 0 || ((long) i) + ((long) i2) > iM23880) {
            throw new IndexOutOfBoundsException("Invalid syntax projection edit range");
        }
        C11003.checkFromToIndex(i4, i5, iM23880);
        if (i2 == 0 && i3 == 0) {
            return new C13534(this, i4, i5);
        }
        long j = ((long) (iM23880 - i2)) + ((long) i3);
        int i6 = (int) j;
        if (j != i6) {
            throw new ArithmeticException();
        }
        C9302 c9302M23881 = c9302.m23881(i, i + i2, m19239(i3, (i <= 0 || i3 <= 0) ? c21834 : c9302.m23883(i - 1)));
        if (c9302M23881.m23880() != i6) {
            throw new AssertionError("Edited syntax projection length differs");
        }
        long jM19237 = m19237(iM23880, i, i2, i3, i4, i5);
        int i7 = (int) (jM19237 >>> 32);
        int i8 = (int) jM19237;
        if (c9302M23881.m23885() > (((long) i8) - ((long) i7)) + 2) {
            c9302M23881 = m19239(i6, c21834);
        }
        return new C13534(new C7185(c9302M23881, null, null, -1, -1), i7, i8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22707 m19243(C7185 c7185) {
        int iMax;
        int iMin;
        int i = this.f22016;
        int i2 = this.f22015;
        if (c7185 != null) {
            int i3 = c7185.f22016;
            C9302 c9302 = c7185.f22017;
            int i4 = c7185.f22015;
            int iM23880 = c9302.m23880();
            C9302 c9303 = this.f22017;
            if (iM23880 != c9303.m23880()) {
                throw new IllegalArgumentException("Window projection text length differs");
            }
            if (!m19250() || !c7185.m19250()) {
                return C22707.m50723(i3, i4, i, i2);
            }
            if (i3 == i && i4 == i2) {
                C14239 c14239M23887 = c9302.m23887(c9303);
                C22707 c22707 = C22707.f73353;
                return (c14239M23887 != null && (iMax = Math.max(i, c14239M23887.m33888())) < (iMin = Math.min(i2, c14239M23887.m33887()))) ? C22707.m50723(-1, -1, iMax, iMin) : c22707;
            }
            return C22707.m50723(i3, i4, i, i2);
        }
        return C22707.m50723(-1, -1, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9302 m19239(int i, C21834 c21834) {
        if (i == 0) {
            return C9302.m23878();
        }
        return C9302.m23868(i, c21834, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m19237(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 >= 0 && i3 >= 0 && i4 >= 0) {
            long j = i2;
            long j2 = i3;
            long j3 = j + j2;
            if (j3 <= i) {
                C11003.checkFromToIndex(i5, i6, i);
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
