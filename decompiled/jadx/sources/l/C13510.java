package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C13510 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m32551(long j, long j2) {
        long j3 = j2 + j;
        return (j3 < 0 || j3 < j) ? C13132.FOREVER_NS : j3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m32559(int i) {
        return (i + 63) >>> 6;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12100 m32552(int i, boolean z) {
        if (i == 0) {
            return null;
        }
        return m32538(i, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32541(C12100 c12100, int i, int i2) {
        C9005.m23246(c12100 == null ? 0 : c12100.f36167, i, i2);
        if (i2 == 0) {
            return null;
        }
        return m32537(m32537(c12100, i).f34089, i2).f34088;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32542(C12100 c12100, int i, int i2, int i3) {
        int i4 = c12100 == null ? 0 : c12100.f36167;
        if (i < 0 || i2 < i || i2 > i4 || i3 < 0) {
            StringBuilder sbM46682 = C20361.m46682("start=", i, ", end=", ", replacementLength=", i2);
            sbM46682.append(i3);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
        if (i2 - i == i3 && i3 != 0) {
            return m32545(c12100, new int[]{i}, 1, i3);
        }
        C11395 c11395M32537 = m32537(c12100, i);
        return m32561(m32561(c11395M32537.f34088, m32552(i3, true)), m32537(c11395M32537.f34089, i2 - i).f34089);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32545(C12100 c12100, int[] iArr, int i, int i2) {
        int i3 = c12100 == null ? 0 : c12100.f36167;
        if (i2 <= 0 || i < 0 || i > iArr.length) {
            throw new IllegalArgumentException("Invalid dirty batch");
        }
        int i4 = -1;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = iArr[i5];
            long j = ((long) i6) + ((long) i2);
            if (i6 < 0 || i6 < i4 || j > i3) {
                throw new IndexOutOfBoundsException(C19370.m44628(i6, "Invalid dirty match offset "));
            }
            i4 = (int) j;
        }
        return i == 0 ? c12100 : m32543(c12100, 0, iArr, 0, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32547(C12100 c12100, int i, boolean[] zArr, int i2) {
        C9005.m23246(c12100 == null ? 0 : c12100.f36167, i, i2);
        C9005.m23245(zArr.length, 0, i2);
        if (i2 == 0) {
            return;
        }
        m32548(c12100, i, zArr, 0, i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m32558(C12100 c12100) {
        if (c12100 == null) {
            return 0L;
        }
        return c12100.f36172;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m32535(long j) {
        if (j < 0 || j > 2147483647L) {
            return C13132.FOREVER_NS;
        }
        long j2 = (j + 65535) / 65536;
        if (j2 == 0) {
            return 0L;
        }
        return ((j2 * 2) - 1) * 48;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32548(C12100 c12100, int i, boolean[] zArr, int i2, int i3) {
        boolean zM29515 = c12100.m29515();
        C12100 c12101 = c12100.f36169;
        int i4 = 0;
        if (zM29515) {
            if (c12100.m29514()) {
                long[] jArr = c12100.f36166;
                int i5 = i3 + i;
                while (i < i5) {
                    int i6 = i & 63;
                    int iMin = Math.min(i5 - i, 64 - i6);
                    long j = jArr[i >>> 6] >>> i6;
                    int i7 = 0;
                    while (i7 < iMin) {
                        int i8 = i2 + 1;
                        zArr[i2] = ((1 << i7) & j) != 0;
                        i7++;
                        i2 = i8;
                    }
                    i += iMin;
                }
                return;
            }
            Arrays.fill(zArr, i2, i3 + i2, c12100.f36171);
            return;
        }
        int i9 = c12101.f36167;
        if (i < i9) {
            int iMin2 = Math.min(i3, i9 - i);
            m32548(c12101, i, zArr, i2, iMin2);
            i2 += iMin2;
            i3 -= iMin2;
        } else {
            i4 = i - i9;
        }
        if (i3 > 0) {
            m32548(c12100.f36165, i4, zArr, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32543(C12100 c12100, int i, int[] iArr, int i2, int i3, int i4) {
        long j = i;
        int i5 = c12100.f36167;
        C12100 c12101 = c12100.f36169;
        long j2 = ((long) i5) + j;
        long j3 = i4;
        long j4 = 1;
        int iM32534 = m32534(i2, (j - j3) + 1, iArr, i3);
        int iM32535 = m32534(iM32534, j2, iArr, i3);
        if (iM32534 < iM32535 && (!c12100.m29516() || !c12100.f36171)) {
            if (!c12100.m29515()) {
                C12100 c12100M32543 = m32543(c12100.f36169, i, iArr, iM32534, iM32535, i4);
                C12100 c12100M32544 = m32543(c12100.f36165, c12101.f36167 + i, iArr, iM32534, iM32535, i4);
                if (c12100M32543 != c12101 || c12100M32544 != c12100.f36165) {
                    return m32561(c12100M32543, c12100M32544);
                }
            } else {
                int i6 = iM32534;
                int i7 = iM32535;
                if (c12100.m29514()) {
                    long[] jArr = (long[]) c12100.f36166.clone();
                    m32549(jArr, i, c12100.f36167, iArr, i6, i7, i4);
                    return m32560(c12100.f36167, jArr);
                }
                int iMax = Math.max(i, iArr[i6]);
                long jMin = Math.min(j2, ((long) iArr[i7 - 1]) + j3);
                long jMax = Math.max(j, (((long) iMax) / 65536) * 65536);
                long jMin2 = Math.min(j2, ((jMin + 65535) / 65536) * 65536);
                C12100 c12100M32552 = j < jMax ? m32552((int) (jMax - j), false) : null;
                while (jMax < jMin2) {
                    int iMin = (int) (Math.min(jMin2, ((jMax / 65536) + j4) * 65536) - jMax);
                    long[] jArr2 = new long[m32559(iMin)];
                    C12100 c12102 = c12100M32552;
                    int iM32536 = m32534(i6, (jMax - j3) + j4, iArr, i7);
                    long j5 = jMin2;
                    long j6 = ((long) iMin) + jMax;
                    m32549(jArr2, (int) jMax, iMin, iArr, iM32536, m32534(iM32536, j6, iArr, i7), i4);
                    c12100M32552 = m32561(c12102, m32560(iMin, jArr2));
                    i7 = i7;
                    i6 = i6;
                    jMin2 = j5;
                    jMax = j6;
                    j4 = 1;
                }
                C12100 c12103 = c12100M32552;
                long j7 = jMin2;
                return j7 < j2 ? m32561(c12103, m32552((int) (j2 - j7), false)) : c12103;
            }
        }
        return c12100;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32549(long[] jArr, int i, int i2, int[] iArr, int i3, int i4, int i5) {
        long j = ((long) i) + ((long) i2);
        while (i3 < i4) {
            int iMax = Math.max(i, iArr[i3]);
            int iMin = (int) Math.min(j, ((long) iArr[i3]) + ((long) i5));
            if (iMax < iMin) {
                m32555(iMax - i, iMin - i, jArr);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32555(int i, int i2, long[] jArr) {
        int i3 = i >>> 6;
        int i4 = i2 - 1;
        int i5 = i4 >>> 6;
        long j = (-1) << (i & 63);
        long j2 = (-1) >>> (63 - (i4 & 63));
        if (i3 == i5) {
            jArr[i3] = (j2 & j) | jArr[i3];
        } else {
            jArr[i3] = j | jArr[i3];
            Arrays.fill(jArr, i3 + 1, i5, -1L);
            jArr[i5] = j2 | jArr[i5];
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32534(int i, long j, int[] iArr, int i2) {
        while (i < i2) {
            int i3 = (i + i2) >>> 1;
            if (iArr[i3] < j) {
                i = i3 + 1;
            } else {
                i2 = i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m32550(int i) {
        if (i <= 0 || i > 65536) {
            throw new IllegalArgumentException("Invalid dirty bitmap length");
        }
        return m32559(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32556(C12100 c12100) {
        m32562(c12100);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12805 m32562(C12100 c12100) {
        if (c12100 == null) {
            return new C12805(0, 0, false, false, false, 0L, 0L);
        }
        C12100 c12101 = c12100.f36165;
        C12100 c12102 = c12100.f36169;
        int i = c12100.f36170;
        long j = c12100.f36172;
        long j2 = c12100.f36168;
        boolean z = c12100.f36164;
        int i2 = c12100.f36167;
        long[] jArr = c12100.f36166;
        if (!c12100.m29515()) {
            C12805 c12805M32562 = m32562(c12102);
            C12805 c12805M32563 = m32562(c12101);
            int iMax = Math.max(c12805M32562.f38436, c12805M32563.f38436) + 1;
            long j3 = ((long) c12805M32562.f38433) + ((long) c12805M32563.f38433);
            int i3 = (int) j3;
            if (j3 != i3) {
                throw new ArithmeticException();
            }
            boolean z2 = c12805M32562.f38431 || c12805M32563.f38431;
            long jM32551 = m32551(c12805M32562.f38432, c12805M32563.f38432);
            long jM32552 = m32551(48L, m32551(c12805M32562.f38437, c12805M32563.f38437));
            if (i != iMax || i2 != i3 || z != z2 || jArr != null || j2 != jM32551 || j != jM32552 || Math.abs(c12805M32562.f38436 - c12805M32563.f38436) > 1) {
                throw new IllegalStateException("Invalid dirty AVL branch");
            }
            C12100 c12103 = c12102;
            while (!c12103.m29515()) {
                c12103 = c12103.f36165;
            }
            C12100 c12104 = c12101;
            while (!c12104.m29515()) {
                c12104 = c12104.f36169;
            }
            if (c12103.m29516() && c12104.m29516() && c12103.f36171 == c12104.f36171) {
                throw new IllegalStateException("Adjacent dirty runs were not merged");
            }
            return new C12805(iMax, i3, z2, c12805M32562.f38434, c12805M32563.f38435, jM32551, jM32552);
        }
        if (i2 <= 0 || i != 1) {
            throw new IllegalStateException("Invalid dirty leaf");
        }
        if (!c12100.m29514()) {
            boolean z3 = c12100.f36171;
            if (z != z3) {
                throw new IllegalStateException("Invalid uniform dirty leaf");
            }
            if (j2 == 0 && j == 48) {
                return new C12805(1, c12100.f36167, z3, z3, z3, 0L, 48L);
            }
            throw new IllegalStateException("Invalid uniform dirty budget");
        }
        if (i2 > 65536 || jArr.length != m32559(i2) || c12100.f36171) {
            throw new IllegalStateException("Invalid bitmap dirty leaf");
        }
        int i4 = i2 & 63;
        if (i4 != 0 && (jArr[jArr.length - 1] >>> i4) != 0) {
            throw new IllegalStateException("Dirty bitmap has trailing bits");
        }
        boolean zM32557 = m32557(0, jArr);
        int i5 = 0;
        boolean z4 = false;
        boolean z5 = true;
        while (i5 < jArr.length) {
            long j4 = (i5 != jArr.length - 1 || i4 == 0) ? -1L : (1 << i4) - 1;
            long j5 = jArr[i5];
            z4 |= j5 != 0;
            z5 &= j5 == j4;
            i5++;
        }
        if (!z4 || z5 || !z) {
            throw new IllegalStateException("Dirty bitmap was not canonicalized");
        }
        long length = 8 * ((long) jArr.length);
        long j6 = 48 + length;
        if (j2 != length || j != j6) {
            throw new IllegalStateException("Invalid bitmap dirty budget");
        }
        int i6 = c12100.f36167;
        return new C12805(1, i6, true, zM32557, m32557(i6 - 1, jArr), length, j6);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11395 m32537(C12100 c12100, int i) {
        if (c12100 == null) {
            if (i == 0) {
                return C11395.f34087;
            }
            throw new IndexOutOfBoundsException(C19370.m44628(i, "offset="));
        }
        C12100 c12101 = c12100.f36169;
        boolean z = c12100.f36171;
        C12100 c12102 = c12100.f36165;
        int i2 = c12100.f36167;
        int i3 = 0;
        C12100 c12103 = null;
        if (i == 0) {
            return new C11395(c12103, c12100, i3);
        }
        if (i == i2) {
            return new C11395(c12100, c12103, i3);
        }
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "offset="));
        }
        if (c12100.m29515()) {
            return !c12100.m29514() ? new C11395(m32538(i, z), m32538(i2 - i, z), i3) : new C11395(m32553(c12100, 0, i), m32553(c12100, i, i2 - i), i3);
        }
        int i4 = c12101.f36167;
        if (i < i4) {
            C11395 c11395M32537 = m32537(c12101, i);
            return new C11395(c11395M32537.f34088, m32561(c11395M32537.f34089, c12102), i3);
        }
        if (i == i4) {
            return new C11395(c12101, c12102, i3);
        }
        C11395 c11395M32538 = m32537(c12102, i - i4);
        return new C11395(m32561(c12101, c11395M32538.f34088), c11395M32538.f34089, i3);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C12100 m32565(C12100 c12100, C12100 c12101) {
        if (c12100 == null) {
            return c12101;
        }
        if (c12101 == null) {
            return c12100;
        }
        int i = c12100.f36170;
        int i2 = c12101.f36170;
        if (i > i2 + 1) {
            return m32540(m32554(c12100.f36169, m32565(c12100.f36165, c12101)));
        }
        if (i2 > i + 1) {
            return m32540(m32554(m32565(c12100, c12101.f36169), c12101.f36165));
        }
        return m32554(c12100, c12101);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32540(C12100 c12100) {
        C12100 c12101 = c12100.f36169;
        C12100 c12102 = c12100.f36165;
        int i = (c12101 == null ? 0 : c12101.f36170) - (c12102 == null ? 0 : c12102.f36170);
        if (i > 1) {
            C12100 c12103 = c12101.f36169;
            int i2 = c12103 == null ? 0 : c12103.f36170;
            C12100 c12104 = c12101.f36165;
            return i2 >= (c12104 != null ? c12104.f36170 : 0) ? m32554(c12103, m32554(c12104, c12102)) : m32554(m32554(c12103, c12104.f36169), m32554(c12104.f36165, c12102));
        }
        if (i >= -1) {
            return c12100;
        }
        C12100 c12105 = c12102.f36165;
        int i3 = c12105 == null ? 0 : c12105.f36170;
        C12100 c12106 = c12102.f36169;
        return i3 >= (c12106 != null ? c12106.f36170 : 0) ? m32554(m32554(c12101, c12106), c12105) : m32554(m32554(c12101, c12106.f36169), m32554(c12106.f36165, c12105));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C9984 m32563(C12100 c12100) {
        if (c12100.m29515()) {
            return new C9984(null, c12100);
        }
        C9984 c9984M32563 = m32563(c12100.f36165);
        return new C9984(m32565(c12100.f36169, c9984M32563.f30102), c9984M32563.f30101);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C9984 m32564(C12100 c12100) {
        if (c12100.m29515()) {
            return new C9984(null, c12100);
        }
        C9984 c9984M32564 = m32564(c12100.f36169);
        return new C9984(m32565(c9984M32564.f30102, c12100.f36165), c9984M32564.f30101);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12100 m32561(C12100 c12100, C12100 c12101) {
        if (c12100 == null) {
            return c12101;
        }
        if (c12101 == null) {
            return c12100;
        }
        C12100 c12102 = c12100;
        while (!c12102.m29515()) {
            c12102 = c12102.f36165;
        }
        C12100 c12103 = c12101;
        while (!c12103.m29515()) {
            c12103 = c12103.f36169;
        }
        if (!c12102.m29516() || !c12103.m29516() || c12102.f36171 != c12103.f36171) {
            return m32565(c12100, c12101);
        }
        C9984 c9984M32563 = m32563(c12100);
        C9984 c9984M32564 = m32564(c12101);
        long j = ((long) c9984M32563.f30101.f36167) + ((long) c9984M32564.f30101.f36167);
        if (j > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        return m32561(m32561(c9984M32563.f30102, m32538((int) j, c9984M32563.f30101.f36171)), c9984M32564.f30102);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12100 m32553(C12100 c12100, int i, int i2) {
        long[] jArr = new long[m32559(i2)];
        for (int i3 = 0; i3 < i2; i3++) {
            if (m32557(i + i3, c12100.f36166)) {
                int i4 = i3 >>> 6;
                jArr[i4] = jArr[i4] | (1 << (i3 & 63));
            }
        }
        return m32560(i2, jArr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12100 m32560(int i, long[] jArr) {
        if (i <= 0 || i > 65536 || jArr.length != m32559(i)) {
            throw new IllegalArgumentException("Invalid dirty bitmap");
        }
        int i2 = i & 63;
        if (i2 != 0) {
            int length = jArr.length - 1;
            jArr[length] = jArr[length] & ((1 << i2) - 1);
        }
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        while (i3 < jArr.length) {
            long j = (i3 != jArr.length - 1 || i2 == 0) ? -1L : (1 << i2) - 1;
            long j2 = jArr[i3];
            z |= j2 != 0;
            z2 &= j2 == j;
            i3++;
        }
        if (!z) {
            return m32538(i, false);
        }
        if (z2) {
            return m32538(i, true);
        }
        return new C12100(null, null, jArr, i, 1, false, true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m32557(int i, long[] jArr) {
        return ((1 << (i & 63)) & jArr[i >>> 6]) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32538(int i, boolean z) {
        return new C12100(null, null, null, i, 1, z, z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12100 m32554(C12100 c12100, C12100 c12101) {
        long j = ((long) c12100.f36167) + ((long) c12101.f36167);
        int i = (int) j;
        if (j == i) {
            return new C12100(c12100, c12101, null, i, Math.max(c12100.f36170, c12101.f36170) + 1, false, c12100.f36164 || c12101.f36164);
        }
        throw new ArithmeticException();
    }
}
