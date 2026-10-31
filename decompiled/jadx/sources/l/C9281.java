package l;

/* JADX INFO: renamed from: l.ۢ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S708 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9281 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f28119 = new int[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f28120;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f28121;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f28122;

    public C9281(int i, int i2, int[] iArr) {
        this.f28120 = iArr;
        this.f28121 = i;
        this.f28122 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23808() {
        return this.f28121;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m23812() {
        return this.f28122;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m23815(int i) {
        C11003.checkIndex(i, this.f28121);
        return this.f28120[i << 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23809(int i) {
        C11003.checkIndex(i, this.f28121);
        return this.f28120[(i << 1) + 1];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m23814(int i) {
        int iM23813 = m23813(i);
        int i2 = this.f28121;
        int[] iArr = this.f28120;
        if (iM23813 < i2) {
            if (iArr[iM23813 << 1] <= i) {
                return iM23813 + 1;
            }
            return -1;
        }
        int i3 = this.f28122;
        if (i == i3 && i2 != 0 && iArr[((i2 - 1) << 1) + 1] == i3) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23810(int i, int i2) {
        C11003.checkFromToIndex(i, i2, this.f28122);
        int iM23814 = m23814(i);
        if (iM23814 == -1 || i == i2 || m23814(i2 - 1) == iM23814) {
            return iM23814;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:50:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0065 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23811(int i, int i2, int i3) {
        int i4;
        long j;
        int i5;
        long j2;
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Negative search edit length");
        }
        if (i < 0 || i > (i4 = this.f28122) || i2 > i4 - i) {
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
        for (int i9 = 0; i9 < this.f28121; i9++) {
            int i10 = i9 << 1;
            int[] iArr = this.f28120;
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
        this.f28121 = i8;
        this.f28122 = i6;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m23813(int i) {
        if (i >= 0 && i <= this.f28122) {
            int i2 = this.f28121;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = (i3 + i2) >>> 1;
                if (this.f28120[(i4 << 1) + 1] <= i) {
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
