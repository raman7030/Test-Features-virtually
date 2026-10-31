package l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17975 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f56065;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15068[] f56066;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f56067;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f56068;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f56069;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long[] f56070;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f56071;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final long[] f56061 = new long[0];

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final long[] f56063 = {0};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f56062 = {0};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f56064 = {-1};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m41991(int i, int i2) {
        return (i >>> i2) & 255;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m42002(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public C17975(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, C15068[] c15068Arr) {
        long[] jArr;
        int i3;
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        if (i2 <= 0 || i2 > iArr.length || i2 > iArr2.length || i2 > iArr3.length || i2 > c15068Arr.length) {
            throw new IllegalArgumentException("Invalid syntax context column size");
        }
        this.f56071 = i;
        this.f56069 = i2;
        this.f56067 = iArr;
        this.f56065 = iArr2;
        this.f56068 = iArr3;
        this.f56066 = c15068Arr;
        if (iArr[0] == 0 && iArr2[0] == i) {
            int i4 = -1;
            if (iArr3[0] == -1 && c15068Arr[0] != null) {
                int i5 = 1;
                while (true) {
                    int i6 = this.f56069;
                    if (i5 >= i6) {
                        if (i == 0) {
                            this.f56070 = f56061;
                            return;
                        }
                        if (i2 == 1) {
                            this.f56070 = f56063;
                            return;
                        }
                        int i7 = this.f56071;
                        int[] iArr4 = this.f56067;
                        int[] iArr5 = this.f56068;
                        int[] iArr6 = this.f56065;
                        int i8 = 1;
                        int i9 = 0;
                        int i10 = 0;
                        int iM41996 = 0;
                        loop1: while (true) {
                            if (i8 >= i6) {
                                while (true) {
                                    if (i9 < 0) {
                                        if (i10 != i7) {
                                            break;
                                        }
                                        i4 = iM41996;
                                        break;
                                    } else {
                                        int i11 = iArr6[i9];
                                        if (i11 < i10) {
                                            break;
                                        }
                                        if (i11 > i10) {
                                            iM41996 = m41996(iM41996);
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
                                        iM41996 = m41996(iM41996);
                                    }
                                    i10 = iArr6[i9];
                                    i9 = iArr5[i9];
                                }
                                int i13 = iArr4[i8];
                                if (i13 < i10) {
                                    break;
                                }
                                if (i13 > i10) {
                                    iM41996 = m41996(iM41996);
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
                                        jArr[i15] = m42002(i14, i16);
                                        i15++;
                                    }
                                    i14 = iArr6[i16];
                                    i16 = iArr5[i16];
                                }
                                if (iArr4[i17] > i14) {
                                    jArr[i15] = m42002(i14, i16);
                                    i15++;
                                }
                                i14 = iArr4[i17];
                                i16 = i17;
                            }
                            while (i16 >= 0) {
                                if (iArr6[i16] > i14) {
                                    jArr[i15] = m42002(i14, i16);
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
                            m41987(iArr7, iArr4);
                            m41987(iArr8, iArr6);
                            C14071 c14071 = new C14071(i6);
                            int iM41985 = m41985(iArr7, iArr8, c14071, (long[]) null);
                            jArr = new long[iM41985];
                            c14071.m33661();
                            if (m41985(iArr7, iArr8, c14071, jArr) != iM41985 || iM41985 == 0 || ((int) (jArr[0] >>> 32)) != 0) {
                                throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                            }
                        }
                        this.f56070 = jArr;
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
                throw new IllegalArgumentException(C19370.m44628(i5, "Invalid syntax context node: "));
            }
        }
        throw new IllegalArgumentException("Invalid syntax context root");
    }

    public C17975(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, C15068[] c15068Arr, long[] jArr) {
        this.f56071 = i;
        this.f56069 = i2;
        this.f56067 = iArr;
        this.f56065 = iArr2;
        this.f56068 = iArr3;
        this.f56066 = c15068Arr;
        this.f56070 = jArr;
    }

    public C17975(int i, C15068 c15068) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        this.f56071 = i;
        this.f56069 = 1;
        this.f56067 = f56062;
        this.f56065 = new int[]{i};
        this.f56068 = f56064;
        C11003.requireNonNull(c15068);
        this.f56066 = new C15068[]{c15068};
        if (i == 0) {
            this.f56070 = f56061;
        } else {
            this.f56070 = f56063;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17975 m41992(int i, C15068 c15068) {
        return new C17975(i, c15068);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42007(int i, C15068 c15068) {
        return this.f56071 == i && this.f56066[0] == c15068;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42004() {
        return this.f56069;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m42010() {
        return this.f56071;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42005(int i) {
        C11003.checkIndex(i, this.f56071);
        return m42016(m42008(i));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m42008(int i) {
        C11003.checkIndex(i, this.f56071);
        long[] jArr = this.f56070;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42006(int i, int i2) {
        int[] iArr;
        C11003.checkFromToIndex(i, i2, this.f56071);
        if (i == i2) {
            throw new IllegalArgumentException("Empty syntax context range");
        }
        int iM42008 = m42008(i);
        int iM42016 = m42016(iM42008);
        do {
            iM42008++;
            if (iM42008 >= this.f56070.length || m42009(iM42008) >= i2) {
                break;
            }
            int iM42017 = m42016(iM42008);
            int iM42011 = m42011(iM42016);
            int iM42012 = m42011(iM42017);
            while (true) {
                iArr = this.f56068;
                if (iM42011 <= iM42012) {
                    break;
                }
                iM42016 = iArr[iM42016];
                iM42011--;
            }
            while (iM42012 > iM42011) {
                iM42017 = iArr[iM42017];
                iM42012--;
            }
            while (iM42016 != iM42017) {
                iM42016 = iArr[iM42016];
                iM42017 = iArr[iM42017];
            }
        } while (iM42016 != 0);
        return iM42016;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m42009(int i) {
        long[] jArr = this.f56070;
        return (int) (jArr[C11003.checkIndex(i, jArr.length)] >>> 32);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m42016(int i) {
        long[] jArr = this.f56070;
        return (int) jArr[C11003.checkIndex(i, jArr.length)];
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m42017(int i) {
        long[] jArr = this.f56070;
        int iCheckIndex = C11003.checkIndex(i, jArr.length) + 1;
        return iCheckIndex < jArr.length ? (int) (jArr[iCheckIndex] >>> 32) : this.f56071;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m41996(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new OutOfMemoryError("Syntax context run count exceeded");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41985(int[] iArr, int[] iArr2, C14071 c14071, long[] jArr) {
        int i = 0;
        int i2 = 0;
        int iM41996 = 0;
        int i3 = -1;
        while (true) {
            int i4 = this.f56069;
            if (i >= i4 && i2 >= i4) {
                break;
            }
            int[] iArr3 = this.f56067;
            long j = C13132.FOREVER_NS;
            long j2 = i < i4 ? iArr3[iArr[i]] : Long.MAX_VALUE;
            int[] iArr4 = this.f56065;
            int iMin = (int) Math.min(j2, i2 < i4 ? iArr4[iArr2[i2]] : Long.MAX_VALUE);
            while (i2 < i4) {
                int i5 = iArr2[i2];
                if (iArr4[i5] != iMin) {
                    break;
                }
                i2++;
                c14071.m33664(i5);
            }
            while (i < i4) {
                int i6 = iArr[i];
                if (iArr3[i6] != iMin) {
                    break;
                }
                i++;
                c14071.m33662(i6);
            }
            if (i == i4 && i2 == i4) {
                break;
            }
            long j3 = i < i4 ? iArr3[iArr[i]] : Long.MAX_VALUE;
            if (i2 < i4) {
                j = iArr4[iArr2[i2]];
            }
            if (Math.min(j3, j) > iMin) {
                int iM33663 = c14071.m33663();
                if (iM33663 < 0) {
                    throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                }
                if (iM33663 != i3) {
                    if (jArr != null) {
                        jArr[iM41996] = m42002(iMin, iM33663);
                    }
                    iM41996 = m41996(iM41996);
                    i3 = iM33663;
                }
            }
        }
        return iM41996;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41987(int[] iArr, int[] iArr2) {
        Class cls = Integer.TYPE;
        m41988(iArr, iArr2, 0, iArr.length, 24, 0, (int[][]) Array.newInstance((Class<?>) cls, 4, 256), (int[][]) Array.newInstance((Class<?>) cls, 4, 257), (int[][]) Array.newInstance((Class<?>) cls, 4, 256));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41988(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int[][] iArr3, int[][] iArr4, int[][] iArr5) {
        int i5 = i2 - i;
        if (i5 < 2) {
            return;
        }
        if (i5 <= 64) {
            m41993(i, i2, iArr, iArr2);
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
                m41988(iArr, iArr2, i19, i21, i18, i4 + 1, iArr3, iArr4, iArr5);
            }
            i6 = i20;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m41993(int i, int i2, int[] iArr, int[] iArr2) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m42011(int i) {
        int iCheckIndex = C11003.checkIndex(i, this.f56069);
        int i2 = 0;
        while (true) {
            iCheckIndex = this.f56068[iCheckIndex];
            if (iCheckIndex == -1) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m42012(int i) {
        return this.f56067[C11003.checkIndex(i, this.f56069)];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m42013(int i) {
        return this.f56065[C11003.checkIndex(i, this.f56069)];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m42014(int i) {
        return this.f56068[C11003.checkIndex(i, this.f56069)];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15068 m42015(int i) {
        return this.f56066[C11003.checkIndex(i, this.f56069)];
    }
}
