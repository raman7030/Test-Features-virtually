package p067l;

/* JADX INFO: renamed from: l.ۢ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S708 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11189 {

    /* JADX INFO: renamed from: ᩳ */
    public static final int[] f31067 = new int[0];

    /* JADX INFO: renamed from: ֫ */
    public final int[] f31068;

    /* JADX INFO: renamed from: ۧ */
    public int f31069;

    /* JADX INFO: renamed from: ܽ */
    public int f31070;

    public C11189(int i, int i2, int[] iArr) {
        this.f31068 = iArr;
        this.f31069 = i;
        this.f31070 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25817() {
        return this.f31069;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m25821() {
        return this.f31070;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m25824(int i) {
        C12826.checkIndex(i, this.f31069);
        return this.f31068[i << 1];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25818(int i) {
        C12826.checkIndex(i, this.f31069);
        return this.f31068[(i << 1) + 1];
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m25823(int i) {
        int iM25822 = m25822(i);
        int i2 = this.f31069;
        int[] iArr = this.f31068;
        if (iM25822 < i2) {
            if (iArr[iM25822 << 1] <= i) {
                return iM25822 + 1;
            }
            return -1;
        }
        int i3 = this.f31070;
        if (i == i3 && i2 != 0 && iArr[((i2 - 1) << 1) + 1] == i3) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25819(int i, int i2) {
        C12826.checkFromToIndex(i, i2, this.f31070);
        int iM25823 = m25823(i);
        if (iM25823 == -1 || i == i2 || m25823(i2 - 1) == iM25823) {
            return iM25823;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:50:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0065 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m25820(int i, int i2, int i3) {
        int i4;
        long j;
        int i5;
        long j2;
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Negative search edit length");
        }
        if (i < 0 || i > (i4 = this.f31070) || i2 > i4 - i) {
            throw new IndexOutOfBoundsException("Search edit is outside the text");
        }
        long j3 = i3;
        long j4 = ((long) (i4 - i2)) + j3;
        int i6 = (int) j4;
        if (j4 != i6) {
            throw new ArithmeticException();
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        int i7 = i + i2;
        long j5 = j3 - ((long) i2);
        long j6 = (int) j5;
        if (j5 != j6) {
            throw new ArithmeticException();
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f31069; i9++) {
            int i10 = i9 << 1;
            int[] iArr = this.f31068;
            int i11 = iArr[i10];
            int i12 = iArr[i10 + 1];
            if (i2 == 0) {
                if (i11 >= i || i >= i12) {
                    if (i11 >= i7) {
                        j = ((long) i11) + j6;
                        i5 = (int) j;
                        if (j == i5) {
                            throw new ArithmeticException();
                        }
                        j2 = ((long) i12) + j6;
                        i12 = (int) j2;
                        if (j2 == i12) {
                            throw new ArithmeticException();
                        }
                        i11 = i5;
                    }
                    int i13 = i8 << 1;
                    iArr[i13] = i11;
                    iArr[i13 + 1] = i12;
                    i8++;
                }
            } else if (i11 >= i7 || i >= i12) {
                if (i11 >= i7) {
                    j = ((long) i11) + j6;
                    i5 = (int) j;
                    if (j == i5) {
                        throw new ArithmeticException();
                    }
                    j2 = ((long) i12) + j6;
                    i12 = (int) j2;
                    if (j2 == i12) {
                        throw new ArithmeticException();
                    }
                    i11 = i5;
                }
                int i14 = i8 << 1;
                iArr[i14] = i11;
                iArr[i14 + 1] = i12;
                i8++;
            }
        }
        this.f31069 = i8;
        this.f31070 = i6;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m25822(int i) {
        if (i >= 0 && i <= this.f31070) {
            int i2 = this.f31069;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = (i3 + i2) >>> 1;
                if (this.f31068[(i4 << 1) + 1] <= i) {
                    i3 = i4 + 1;
                } else {
                    i2 = i4;
                }
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("Search position is outside the text");
    }
}
