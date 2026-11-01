package p067l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19452 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f59262;

    /* JADX INFO: renamed from: ۧ */
    public final C16689[] f59263;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f59264;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f59265;

    /* JADX INFO: renamed from: ܿ */
    public final int f59266;

    /* JADX INFO: renamed from: ᩳ */
    public final long[] f59267;

    /* JADX INFO: renamed from: ᩻ */
    public final int f59268;

    /* JADX INFO: renamed from: ۜ */
    public static final long[] f59258 = new long[0];

    /* JADX INFO: renamed from: ۢ */
    public static final long[] f59260 = {0};

    /* JADX INFO: renamed from: ۡ */
    public static final int[] f59259 = {0};

    /* JADX INFO: renamed from: ᩷ */
    public static final int[] f59261 = {-1};

    /* JADX INFO: renamed from: ۧ */
    public static int m44240(int i, int i2) {
        return (i >>> i2) & 255;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static long m44251(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public C19452(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, C16689[] c16689Arr) {
        long[] jArr;
        int i3;
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        if (i2 <= 0 || i2 > iArr.length || i2 > iArr2.length || i2 > iArr3.length || i2 > c16689Arr.length) {
            throw new IllegalArgumentException("Invalid syntax context column size");
        }
        this.f59268 = i;
        this.f59266 = i2;
        this.f59264 = iArr;
        this.f59262 = iArr2;
        this.f59265 = iArr3;
        this.f59263 = c16689Arr;
        if (iArr[0] == 0 && iArr2[0] == i) {
            int i4 = -1;
            if (iArr3[0] == -1 && c16689Arr[0] != null) {
                int i5 = 1;
                while (true) {
                    int i6 = this.f59266;
                    if (i5 >= i6) {
                        if (i == 0) {
                            this.f59267 = f59258;
                            return;
                        }
                        if (i2 == 1) {
                            this.f59267 = f59260;
                            return;
                        }
                        int i7 = this.f59268;
                        int[] iArr4 = this.f59264;
                        int[] iArr5 = this.f59265;
                        int[] iArr6 = this.f59262;
                        int i8 = 1;
                        int i9 = 0;
                        int i10 = 0;
                        int iM44245 = 0;
                        loop1: while (true) {
                            if (i8 >= i6) {
                                while (true) {
                                    if (i9 < 0) {
                                        if (i10 != i7) {
                                            break;
                                        }
                                        i4 = iM44245;
                                        break;
                                    } else {
                                        int i11 = iArr6[i9];
                                        if (i11 < i10) {
                                            break;
                                        }
                                        if (i11 > i10) {
                                            iM44245 = m44245(iM44245);
                                        }
                                        i10 = iArr6[i9];
                                        i9 = iArr5[i9];
                                    }
                                }
                            } else {
                                int i12 = iArr5[i8];
                                while (i9 != i12) {
                                    if (i9 == 0 || (i3 = iArr6[i9]) < i10) {
                                        break loop1;
                                    }
                                    if (i3 > i10) {
                                        iM44245 = m44245(iM44245);
                                    }
                                    i10 = iArr6[i9];
                                    i9 = iArr5[i9];
                                }
                                int i13 = iArr4[i8];
                                if (i13 < i10) {
                                    break;
                                }
                                if (i13 > i10) {
                                    iM44245 = m44245(iM44245);
                                }
                                i10 = iArr4[i8];
                                i9 = i8;
                                i8++;
                            }
                        }
                        if (i4 >= 0) {
                            jArr = new long[i4];
                            int i14 = 0;
                            int i15 = 0;
                            int i16 = 0;
                            for (int i17 = 1; i17 < i6; i17++) {
                                int i18 = iArr5[i17];
                                while (i16 != i18) {
                                    if (iArr6[i16] > i14) {
                                        jArr[i15] = m44251(i14, i16);
                                        i15++;
                                    }
                                    i14 = iArr6[i16];
                                    i16 = iArr5[i16];
                                }
                                if (iArr4[i17] > i14) {
                                    jArr[i15] = m44251(i14, i16);
                                    i15++;
                                }
                                i14 = iArr4[i17];
                                i16 = i17;
                            }
                            while (i16 >= 0) {
                                if (iArr6[i16] > i14) {
                                    jArr[i15] = m44251(i14, i16);
                                    i15++;
                                }
                                i14 = iArr6[i16];
                                i16 = iArr5[i16];
                            }
                            if (i15 != i4 || i14 != i7) {
                                throw new IllegalStateException("Ordered syntax context run count changed");
                            }
                        } else {
                            int[] iArr7 = new int[i6];
                            int[] iArr8 = new int[i6];
                            for (int i19 = 0; i19 < i6; i19++) {
                                iArr8[i19] = i19;
                                iArr7[i19] = i19;
                            }
                            m44236(iArr7, iArr4);
                            m44236(iArr8, iArr6);
                            C15742 c15742 = new C15742(i6);
                            int iM44234 = m44234(iArr7, iArr8, c15742, (long[]) null);
                            jArr = new long[iM44234];
                            c15742.m35786();
                            if (m44234(iArr7, iArr8, c15742, jArr) != iM44234 || iM44234 == 0 || ((int) (jArr[0] >>> 32)) != 0) {
                                throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                            }
                        }
                        this.f59267 = jArr;
                        return;
                    }
                    int i20 = iArr[i5];
                    int i21 = iArr2[i5];
                    int i22 = iArr3[i5];
                    if (i20 < 0 || i21 <= i20 || i21 > i || i22 < 0 || i22 >= i5 || i20 < iArr[i22] || i21 > iArr2[i22]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                throw new IllegalArgumentException(C20778.m46922(i5, "Invalid syntax context node: "));
            }
        }
        throw new IllegalArgumentException("Invalid syntax context root");
    }

    public C19452(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, C16689[] c16689Arr, long[] jArr) {
        this.f59268 = i;
        this.f59266 = i2;
        this.f59264 = iArr;
        this.f59262 = iArr2;
        this.f59265 = iArr3;
        this.f59263 = c16689Arr;
        this.f59267 = jArr;
    }

    public C19452(int i, C16689 c16689) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        this.f59268 = i;
        this.f59266 = 1;
        this.f59264 = f59259;
        this.f59262 = new int[]{i};
        this.f59265 = f59261;
        C12826.requireNonNull(c16689);
        this.f59263 = new C16689[]{c16689};
        if (i == 0) {
            this.f59267 = f59258;
        } else {
            this.f59267 = f59260;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C19452 m44241(int i, C16689 c16689) {
        return new C19452(i, c16689);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44256(int i, C16689 c16689) {
        return this.f59268 == i && this.f59263[0] == c16689;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44253() {
        return this.f59266;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m44259() {
        return this.f59268;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44254(int i) {
        C12826.checkIndex(i, this.f59268);
        return m44265(m44257(i));
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m44257(int i) {
        C12826.checkIndex(i, this.f59268);
        long[] jArr = this.f59267;
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            if (((int) (jArr[i3] >>> 32)) <= i) {
                i2 = i3 + 1;
            } else {
                length = i3 - 1;
            }
        }
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Syntax context tree does not cover the offset");
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44255(int i, int i2) {
        int[] iArr;
        C12826.checkFromToIndex(i, i2, this.f59268);
        if (i == i2) {
            throw new IllegalArgumentException("Empty syntax context range");
        }
        int iM44257 = m44257(i);
        int iM44265 = m44265(iM44257);
        do {
            iM44257++;
            if (iM44257 >= this.f59267.length || m44258(iM44257) >= i2) {
                break;
            }
            int iM44266 = m44265(iM44257);
            int iM44260 = m44260(iM44265);
            int iM44261 = m44260(iM44266);
            while (true) {
                iArr = this.f59265;
                if (iM44260 <= iM44261) {
                    break;
                }
                iM44265 = iArr[iM44265];
                iM44260--;
            }
            while (iM44261 > iM44260) {
                iM44266 = iArr[iM44266];
                iM44261--;
            }
            while (iM44265 != iM44266) {
                iM44265 = iArr[iM44265];
                iM44266 = iArr[iM44266];
            }
        } while (iM44265 != 0);
        return iM44265;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m44258(int i) {
        long[] jArr = this.f59267;
        return (int) (jArr[C12826.checkIndex(i, jArr.length)] >>> 32);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m44265(int i) {
        long[] jArr = this.f59267;
        return (int) jArr[C12826.checkIndex(i, jArr.length)];
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m44266(int i) {
        long[] jArr = this.f59267;
        int iCheckIndex = C12826.checkIndex(i, jArr.length) + 1;
        return iCheckIndex < jArr.length ? (int) (jArr[iCheckIndex] >>> 32) : this.f59268;
    }

    /* JADX INFO: renamed from: ܺ */
    public static int m44245(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new OutOfMemoryError("Syntax context run count exceeded");
    }

    /* JADX INFO: renamed from: ֫ */
    private int m44234(int[] iArr, int[] iArr2, C15742 c15742, long[] jArr) {
        int i = 0;
        int i2 = 0;
        int iM44245 = 0;
        int i3 = -1;
        while (true) {
            int i4 = this.f59266;
            if (i >= i4 && i2 >= i4) {
                break;
            }
            int[] iArr3 = this.f59264;
            long j = C14849.FOREVER_NS;
            long j2 = i < i4 ? iArr3[iArr[i]] : Long.MAX_VALUE;
            int[] iArr4 = this.f59262;
            int iMin = (int) Math.min(j2, i2 < i4 ? iArr4[iArr2[i2]] : Long.MAX_VALUE);
            while (i2 < i4) {
                int i5 = iArr2[i2];
                if (iArr4[i5] != iMin) {
                    break;
                }
                i2++;
                c15742.m35789(i5);
            }
            while (i < i4) {
                int i6 = iArr[i];
                if (iArr3[i6] != iMin) {
                    break;
                }
                i++;
                c15742.m35787(i6);
            }
            if (i == i4 && i2 == i4) {
                break;
            }
            long j3 = i < i4 ? iArr3[iArr[i]] : Long.MAX_VALUE;
            if (i2 < i4) {
                j = iArr4[iArr2[i2]];
            }
            if (Math.min(j3, j) > iMin) {
                int iM35788 = c15742.m35788();
                if (iM35788 < 0) {
                    throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                }
                if (iM35788 != i3) {
                    if (jArr != null) {
                        jArr[iM44245] = m44251(iMin, iM35788);
                    }
                    iM44245 = m44245(iM44245);
                    i3 = iM35788;
                }
            }
        }
        return iM44245;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44236(int[] iArr, int[] iArr2) {
        Class cls = Integer.TYPE;
        m44237(iArr, iArr2, 0, iArr.length, 24, 0, (int[][]) Array.newInstance((Class<?>) cls, 4, 256), (int[][]) Array.newInstance((Class<?>) cls, 4, 257), (int[][]) Array.newInstance((Class<?>) cls, 4, 256));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44237(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int[][] iArr3, int[][] iArr4, int[][] iArr5) {
        int i5 = i2 - i;
        if (i5 < 2) {
            return;
        }
        if (i5 <= 64) {
            m44242(i, i2, iArr, iArr2);
            return;
        }
        int[] iArr6 = iArr3[i4];
        int[] iArr7 = iArr4[i4];
        int[] iArr8 = iArr5[i4];
        int i6 = 0;
        Arrays.fill(iArr6, 0);
        for (int i7 = i; i7 < i2; i7++) {
            int i8 = (iArr2[iArr[i7]] >>> i3) & 255;
            iArr6[i8] = iArr6[i8] + 1;
        }
        iArr7[0] = i;
        int i9 = 0;
        while (i9 < 256) {
            int i10 = i9 + 1;
            iArr7[i10] = iArr7[i9] + iArr6[i9];
            iArr8[i9] = iArr7[i9];
            i9 = i10;
        }
        int i11 = 0;
        while (i11 < 256) {
            int i12 = i11 + 1;
            int i13 = iArr7[i12];
            while (true) {
                int i14 = iArr8[i11];
                if (i14 < i13) {
                    int i15 = (iArr2[iArr[i14]] >>> i3) & 255;
                    if (i15 == i11) {
                        iArr8[i11] = i14 + 1;
                    } else {
                        int i16 = iArr8[i15];
                        iArr8[i15] = i16 + 1;
                        int i17 = iArr[i14];
                        iArr[i14] = iArr[i16];
                        iArr[i16] = i17;
                    }
                }
            }
            i11 = i12;
        }
        if (i3 == 0) {
            return;
        }
        int i18 = i3 - 8;
        while (i6 < 256) {
            int i19 = iArr7[i6];
            int i20 = i6 + 1;
            int i21 = iArr7[i20];
            if (i21 - i19 > 1) {
                m44237(iArr, iArr2, i19, i21, i18, i4 + 1, iArr3, iArr4, iArr5);
            }
            i6 = i20;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m44242(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i4];
            int i6 = i3;
            while (i6 > i) {
                int i7 = iArr[i6 - 1];
                if (iArr2[i7] <= i5) {
                    break;
                }
                iArr[i6] = i7;
                i6--;
            }
            iArr[i6] = i4;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m44260(int i) {
        int iCheckIndex = C12826.checkIndex(i, this.f59266);
        int i2 = 0;
        while (true) {
            iCheckIndex = this.f59265[iCheckIndex];
            if (iCheckIndex == -1) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m44261(int i) {
        return this.f59264[C12826.checkIndex(i, this.f59266)];
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m44262(int i) {
        return this.f59262[C12826.checkIndex(i, this.f59266)];
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m44263(int i) {
        return this.f59265[C12826.checkIndex(i, this.f59266)];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C16689 m44264(int i) {
        return this.f59263[C12826.checkIndex(i, this.f59266)];
    }
}
