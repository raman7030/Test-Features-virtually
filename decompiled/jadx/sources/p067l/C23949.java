package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6ZU */
/* JADX INFO: loaded from: classes.dex */
public final class C23949 {

    /* JADX INFO: renamed from: ۧ */
    public static final C23949 f76078 = new C23949(new int[0]);

    /* JADX INFO: renamed from: ֫ */
    public final int[] f76079;

    public C23949(int[] iArr) {
        this.f76079 = iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23949 m53048(C23949 c23949, int i, int i2) {
        C12826.requireNonNull(c23949, "old");
        return c23949.m53046(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23949 m53052(C23949 c23949) {
        int i;
        int[] iArr;
        C12826.requireNonNull(c23949, "other");
        int[] iArr2 = c23949.f76079;
        int[] iArr3 = this.f76079;
        if (iArr3.length == 0) {
            return c23949;
        }
        if (iArr2.length == 0) {
            return this;
        }
        long length = ((long) iArr3.length) + ((long) iArr2.length);
        int i2 = (int) length;
        if (length != i2) {
            throw new ArithmeticException();
        }
        int[] iArr4 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        int iM53045 = 0;
        while (true) {
            if (i3 >= iArr3.length && i4 >= iArr2.length) {
                return m53047(iM53045, iArr4);
            }
            if (i4 >= iArr2.length || (i3 < iArr3.length && iArr3[i3] <= iArr2[i4])) {
                i = i3 + 2;
                iArr = iArr3;
            } else {
                iArr = iArr2;
                i = i3;
                i3 = i4;
                i4 += 2;
            }
            iM53045 = m53045(iM53045, iArr[i3], iArr[i3 + 1], iArr4);
            i3 = i;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23949 m53051(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i3 >= 0 && i4 >= 0) {
            long j = i3;
            long j2 = ((long) i2) + j;
            if (j2 <= i) {
                int[] iArr = this.f76079;
                if (iArr.length != 0 && iArr[iArr.length - 1] > i) {
                    throw new IndexOutOfBoundsException("Syntax dirty range exceeds old text");
                }
                if (iArr.length == 0 || (i3 == 0 && i4 == 0)) {
                    return this;
                }
                long j3 = ((long) i4) - j;
                long length = ((long) iArr.length) + ((long) 2);
                int i5 = (int) length;
                if (length != i5) {
                    throw new ArithmeticException();
                }
                int[] iArr2 = new int[i5];
                int iM53045 = 0;
                for (int i6 = 0; i6 < iArr.length; i6 += 2) {
                    int i7 = iArr[i6];
                    int i8 = iArr[i6 + 1];
                    if (i8 <= i2) {
                        iM53045 = m53045(iM53045, i7, i8, iArr2);
                    } else {
                        long j4 = i7;
                        if (j4 >= j2) {
                            long j5 = j4 + j3;
                            int i9 = (int) j5;
                            if (j5 != i9) {
                                throw new ArithmeticException();
                            }
                            long j6 = ((long) i8) + j3;
                            int i10 = (int) j6;
                            if (j6 != i10) {
                                throw new ArithmeticException();
                            }
                            iM53045 = m53045(iM53045, i9, i10, iArr2);
                        } else {
                            if (i7 < i2) {
                                iM53045 = m53045(iM53045, i7, Math.min(i8, i2), iArr2);
                            }
                            int i11 = (int) j2;
                            if (j2 != i11) {
                                throw new ArithmeticException();
                            }
                            int iMax = Math.max(i7, i11);
                            if (iMax < i8) {
                                long j7 = ((long) iMax) + j3;
                                int i12 = (int) j7;
                                if (j7 != i12) {
                                    throw new ArithmeticException();
                                }
                                long j8 = ((long) i8) + j3;
                                int i13 = (int) j8;
                                if (j8 != i13) {
                                    throw new ArithmeticException();
                                }
                                iM53045 = m53045(iM53045, i12, i13, iArr2);
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return iM53045 == 0 ? f76078 : m53047(iM53045, iArr2);
            }
        }
        throw new IndexOutOfBoundsException("Invalid syntax dirty-range edit");
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15901 m53054() {
        if (this.f76079.length == 0) {
            return null;
        }
        return m53050(0);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m53055() {
        return this.f76079.length / 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15901 m53050(int i) {
        C12826.checkIndex(i, m53055());
        int i2 = i * 2;
        int[] iArr = this.f76079;
        return new C15901(iArr[i2], iArr[i2 + 1]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m53053() {
        return this.f76079;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23949 m53049(int i, int i2, int i3, int i4) {
        C23949 c23949;
        if (i < 0 || i >= i2) {
            c23949 = f76078;
        } else {
            c23949 = new C23949(new int[]{i, i2});
        }
        return c23949.m53046(i3, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    private C23949 m53046(int i, int i2) {
        if (i < 0 || i >= i2) {
            return this;
        }
        int[] iArr = this.f76079;
        int[] iArr2 = new int[iArr.length + 2];
        boolean z = false;
        int iM53045 = 0;
        for (int i3 = 0; i3 < iArr.length; i3 += 2) {
            int i4 = iArr[i3];
            int i5 = iArr[i3 + 1];
            if (i5 < i) {
                iM53045 = m53045(iM53045, i4, i5, iArr2);
            } else if (i2 < i4) {
                if (!z) {
                    iM53045 = m53045(iM53045, i, i2, iArr2);
                    z = true;
                }
                iM53045 = m53045(iM53045, i4, i5, iArr2);
            } else {
                i = Math.min(i, i4);
                i2 = Math.max(i2, i5);
            }
        }
        if (!z) {
            iM53045 = m53045(iM53045, i, i2, iArr2);
        }
        return m53047(iM53045, iArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23949 m53047(int i, int[] iArr) {
        if (i == 0) {
            return f76078;
        }
        while (i > 64) {
            long j = ((long) iArr[2]) - ((long) iArr[1]);
            int i2 = 2;
            for (int i3 = 4; i3 < i; i3 += 2) {
                long j2 = ((long) iArr[i3]) - ((long) iArr[i3 - 1]);
                if (j2 < j) {
                    i2 = i3;
                    j = j2;
                }
            }
            iArr[i2 - 1] = iArr[i2 + 1];
            System.arraycopy(iArr, i2 + 2, iArr, i2, (i - i2) - 2);
            i -= 2;
        }
        if (i != iArr.length) {
            iArr = Arrays.copyOf(iArr, i);
        }
        return new C23949(iArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53045(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        if (i2 >= i3) {
            return i;
        }
        if (i >= 2 && i2 <= (i5 = iArr[(i4 = i - 1)])) {
            iArr[i4] = Math.max(i5, i3);
            return i;
        }
        iArr[i] = i2;
        iArr[i + 1] = i3;
        return i + 2;
    }
}
