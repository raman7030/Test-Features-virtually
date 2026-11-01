package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C15208 {
    /* JADX INFO: renamed from: ۧ */
    public static long m34653(long j, long j2) {
        long j3 = j2 + j;
        return (j3 < 0 || j3 < j) ? C14849.FOREVER_NS : j3;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m34661(int i) {
        return (i + 63) >>> 6;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C13868 m34654(int i, boolean z) {
        if (i == 0) {
            return null;
        }
        return m34640(i, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13868 m34643(C13868 c13868, int i, int i2) {
        C10927.m25190(c13868 == null ? 0 : c13868.f39178, i, i2);
        if (i2 == 0) {
            return null;
        }
        return m34639(m34639(c13868, i).f37087, i2).f37086;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13868 m34644(C13868 c13868, int i, int i2, int i3) {
        int i4 = c13868 == null ? 0 : c13868.f39178;
        if (i < 0 || i2 < i || i2 > i4 || i3 < 0) {
            StringBuilder sbM49005 = C21720.m49005("start=", i, ", end=", ", replacementLength=", i2);
            sbM49005.append(i3);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        if (i2 - i == i3 && i3 != 0) {
            return m34647(c13868, new int[]{i}, 1, i3);
        }
        C13198 c13198M34639 = m34639(c13868, i);
        return m34663(m34663(c13198M34639.f37086, m34654(i3, true)), m34639(c13198M34639.f37087, i2 - i).f37087);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13868 m34647(C13868 c13868, int[] iArr, int i, int i2) {
        int i3 = c13868 == null ? 0 : c13868.f39178;
        if (i2 <= 0 || i < 0 || i > iArr.length) {
            throw new IllegalArgumentException("Invalid dirty batch");
        }
        int i4 = -1;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = iArr[i5];
            long j = ((long) i6) + ((long) i2);
            if (i6 < 0 || i6 < i4 || j > i3) {
                throw new IndexOutOfBoundsException(C20778.m46922(i6, "Invalid dirty match offset "));
            }
            i4 = (int) j;
        }
        return i == 0 ? c13868 : m34645(c13868, 0, iArr, 0, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34649(C13868 c13868, int i, boolean[] zArr, int i2) {
        C10927.m25190(c13868 == null ? 0 : c13868.f39178, i, i2);
        C10927.m25189(zArr.length, 0, i2);
        if (i2 == 0) {
            return;
        }
        m34650(c13868, i, zArr, 0, i2);
    }

    /* JADX INFO: renamed from: ܳ */
    public static long m34660(C13868 c13868) {
        if (c13868 == null) {
            return 0L;
        }
        return c13868.f39183;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m34637(long j) {
        if (j < 0 || j > 2147483647L) {
            return C14849.FOREVER_NS;
        }
        long j2 = (j + 65535) / 65536;
        if (j2 == 0) {
            return 0L;
        }
        return ((j2 * 2) - 1) * 48;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34650(C13868 c13868, int i, boolean[] zArr, int i2, int i3) {
        boolean zM31578 = c13868.m31578();
        C13868 c13869 = c13868.f39180;
        int i4 = 0;
        if (zM31578) {
            if (c13868.m31577()) {
                long[] jArr = c13868.f39177;
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
            Arrays.fill(zArr, i2, i3 + i2, c13868.f39182);
            return;
        }
        int i9 = c13869.f39178;
        if (i < i9) {
            int iMin2 = Math.min(i3, i9 - i);
            m34650(c13869, i, zArr, i2, iMin2);
            i2 += iMin2;
            i3 -= iMin2;
        } else {
            i4 = i - i9;
        }
        if (i3 > 0) {
            m34650(c13868.f39176, i4, zArr, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13868 m34645(C13868 c13868, int i, int[] iArr, int i2, int i3, int i4) {
        long j = i;
        int i5 = c13868.f39178;
        C13868 c13869 = c13868.f39180;
        long j2 = ((long) i5) + j;
        long j3 = i4;
        long j4 = 1;
        int iM34636 = m34636(i2, (j - j3) + 1, iArr, i3);
        int iM34637 = m34636(iM34636, j2, iArr, i3);
        if (iM34636 < iM34637 && (!c13868.m31579() || !c13868.f39182)) {
            if (!c13868.m31578()) {
                C13868 c13868M34645 = m34645(c13868.f39180, i, iArr, iM34636, iM34637, i4);
                C13868 c13868M34646 = m34645(c13868.f39176, c13869.f39178 + i, iArr, iM34636, iM34637, i4);
                if (c13868M34645 != c13869 || c13868M34646 != c13868.f39176) {
                    return m34663(c13868M34645, c13868M34646);
                }
            } else {
                int i6 = iM34636;
                int i7 = iM34637;
                if (c13868.m31577()) {
                    long[] jArr = (long[]) c13868.f39177.clone();
                    m34651(jArr, i, c13868.f39178, iArr, i6, i7, i4);
                    return m34662(c13868.f39178, jArr);
                }
                int iMax = Math.max(i, iArr[i6]);
                long jMin = Math.min(j2, ((long) iArr[i7 - 1]) + j3);
                long jMax = Math.max(j, (((long) iMax) / 65536) * 65536);
                long jMin2 = Math.min(j2, ((jMin + 65535) / 65536) * 65536);
                C13868 c13868M34654 = j < jMax ? m34654((int) (jMax - j), false) : null;
                while (jMax < jMin2) {
                    int iMin = (int) (Math.min(jMin2, ((jMax / 65536) + j4) * 65536) - jMax);
                    long[] jArr2 = new long[m34661(iMin)];
                    C13868 c138610 = c13868M34654;
                    int iM34638 = m34636(i6, (jMax - j3) + j4, iArr, i7);
                    long j5 = jMin2;
                    long j6 = ((long) iMin) + jMax;
                    m34651(jArr2, (int) jMax, iMin, iArr, iM34638, m34636(iM34638, j6, iArr, i7), i4);
                    c13868M34654 = m34663(c138610, m34662(iMin, jArr2));
                    i7 = i7;
                    i6 = i6;
                    jMin2 = j5;
                    jMax = j6;
                    j4 = 1;
                }
                C13868 c138611 = c13868M34654;
                long j7 = jMin2;
                return j7 < j2 ? m34663(c138611, m34654((int) (j2 - j7), false)) : c138611;
            }
        }
        return c13868;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34651(long[] jArr, int i, int i2, int[] iArr, int i3, int i4, int i5) {
        long j = ((long) i) + ((long) i2);
        while (i3 < i4) {
            int iMax = Math.max(i, iArr[i3]);
            int iMin = (int) Math.min(j, ((long) iArr[i3]) + ((long) i5));
            if (iMax < iMin) {
                m34657(iMax - i, iMin - i, jArr);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m34657(int i, int i2, long[] jArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static int m34636(int i, long j, int[] iArr, int i2) {
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

    /* JADX INFO: renamed from: ۧ */
    public static int m34652(int i) {
        if (i <= 0 || i > 65536) {
            throw new IllegalArgumentException("Invalid dirty bitmap length");
        }
        return m34661(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m34658(C13868 c13868) {
        m34664(c13868);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C14538 m34664(C13868 c13868) {
        if (c13868 == null) {
            return new C14538(0, 0, false, false, false, 0L, 0L);
        }
        C13868 c13869 = c13868.f39176;
        C13868 c138610 = c13868.f39180;
        int i = c13868.f39181;
        long j = c13868.f39183;
        long j2 = c13868.f39179;
        boolean z = c13868.f39175;
        int i2 = c13868.f39178;
        long[] jArr = c13868.f39177;
        if (!c13868.m31578()) {
            C14538 c14538M34664 = m34664(c138610);
            C14538 c14538M34665 = m34664(c13869);
            int iMax = Math.max(c14538M34664.f41478, c14538M34665.f41478) + 1;
            long j3 = ((long) c14538M34664.f41475) + ((long) c14538M34665.f41475);
            int i3 = (int) j3;
            if (j3 != i3) {
                throw new ArithmeticException();
            }
            boolean z2 = c14538M34664.f41473 || c14538M34665.f41473;
            long jM34653 = m34653(c14538M34664.f41474, c14538M34665.f41474);
            long jM34654 = m34653(48L, m34653(c14538M34664.f41479, c14538M34665.f41479));
            if (i != iMax || i2 != i3 || z != z2 || jArr != null || j2 != jM34653 || j != jM34654 || Math.abs(c14538M34664.f41478 - c14538M34665.f41478) > 1) {
                throw new IllegalStateException("Invalid dirty AVL branch");
            }
            C13868 c138611 = c138610;
            while (!c138611.m31578()) {
                c138611 = c138611.f39176;
            }
            C13868 c138612 = c13869;
            while (!c138612.m31578()) {
                c138612 = c138612.f39180;
            }
            if (c138611.m31579() && c138612.m31579() && c138611.f39182 == c138612.f39182) {
                throw new IllegalStateException("Adjacent dirty runs were not merged");
            }
            return new C14538(iMax, i3, z2, c14538M34664.f41476, c14538M34665.f41477, jM34653, jM34654);
        }
        if (i2 <= 0 || i != 1) {
            throw new IllegalStateException("Invalid dirty leaf");
        }
        if (!c13868.m31577()) {
            boolean z3 = c13868.f39182;
            if (z != z3) {
                throw new IllegalStateException("Invalid uniform dirty leaf");
            }
            if (j2 == 0 && j == 48) {
                return new C14538(1, c13868.f39178, z3, z3, z3, 0L, 48L);
            }
            throw new IllegalStateException("Invalid uniform dirty budget");
        }
        if (i2 > 65536 || jArr.length != m34661(i2) || c13868.f39182) {
            throw new IllegalStateException("Invalid bitmap dirty leaf");
        }
        int i4 = i2 & 63;
        if (i4 != 0 && (jArr[jArr.length - 1] >>> i4) != 0) {
            throw new IllegalStateException("Dirty bitmap has trailing bits");
        }
        boolean zM34659 = m34659(0, jArr);
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
        int i6 = c13868.f39178;
        return new C14538(1, i6, true, zM34659, m34659(i6 - 1, jArr), length, j6);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13198 m34639(C13868 c13868, int i) {
        if (c13868 == null) {
            if (i == 0) {
                return C13198.f37085;
            }
            throw new IndexOutOfBoundsException(C20778.m46922(i, "offset="));
        }
        C13868 c13869 = c13868.f39180;
        boolean z = c13868.f39182;
        C13868 c138610 = c13868.f39176;
        int i2 = c13868.f39178;
        int i3 = 0;
        C13868 c138611 = null;
        if (i == 0) {
            return new C13198(c138611, c13868, i3);
        }
        if (i == i2) {
            return new C13198(c13868, c138611, i3);
        }
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "offset="));
        }
        if (c13868.m31578()) {
            return !c13868.m31577() ? new C13198(m34640(i, z), m34640(i2 - i, z), i3) : new C13198(m34655(c13868, 0, i), m34655(c13868, i, i2 - i), i3);
        }
        int i4 = c13869.f39178;
        if (i < i4) {
            C13198 c13198M34639 = m34639(c13869, i);
            return new C13198(c13198M34639.f37086, m34663(c13198M34639.f37087, c138610), i3);
        }
        if (i == i4) {
            return new C13198(c13869, c138610, i3);
        }
        C13198 c13198M346310 = m34639(c138610, i - i4);
        return new C13198(m34663(c13869, c13198M346310.f37086), c13198M346310.f37087, i3);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C13868 m34667(C13868 c13868, C13868 c13869) {
        if (c13868 == null) {
            return c13869;
        }
        if (c13869 == null) {
            return c13868;
        }
        int i = c13868.f39181;
        int i2 = c13869.f39181;
        if (i > i2 + 1) {
            return m34642(m34656(c13868.f39180, m34667(c13868.f39176, c13869)));
        }
        if (i2 > i + 1) {
            return m34642(m34656(m34667(c13868, c13869.f39180), c13869.f39176));
        }
        return m34656(c13868, c13869);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13868 m34642(C13868 c13868) {
        C13868 c13869 = c13868.f39180;
        C13868 c138610 = c13868.f39176;
        int i = (c13869 == null ? 0 : c13869.f39181) - (c138610 == null ? 0 : c138610.f39181);
        if (i > 1) {
            C13868 c138611 = c13869.f39180;
            int i2 = c138611 == null ? 0 : c138611.f39181;
            C13868 c138612 = c13869.f39176;
            return i2 >= (c138612 != null ? c138612.f39181 : 0) ? m34656(c138611, m34656(c138612, c138610)) : m34656(m34656(c138611, c138612.f39180), m34656(c138612.f39176, c138610));
        }
        if (i >= -1) {
            return c13868;
        }
        C13868 c138613 = c138610.f39176;
        int i3 = c138613 == null ? 0 : c138613.f39181;
        C13868 c138614 = c138610.f39180;
        return i3 >= (c138614 != null ? c138614.f39181 : 0) ? m34656(m34656(c13869, c138614), c138613) : m34656(m34656(c13869, c138614.f39180), m34656(c138614.f39176, c138613));
    }

    /* JADX INFO: renamed from: ܿ */
    public static C11857 m34665(C13868 c13868) {
        if (c13868.m31578()) {
            return new C11857(null, c13868);
        }
        C11857 c11857M34665 = m34665(c13868.f39176);
        return new C11857(m34667(c13868.f39180, c11857M34665.f33061), c11857M34665.f33060);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C11857 m34666(C13868 c13868) {
        if (c13868.m31578()) {
            return new C11857(null, c13868);
        }
        C11857 c11857M34666 = m34666(c13868.f39180);
        return new C11857(m34667(c11857M34666.f33061, c13868.f39176), c11857M34666.f33060);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C13868 m34663(C13868 c13868, C13868 c13869) {
        if (c13868 == null) {
            return c13869;
        }
        if (c13869 == null) {
            return c13868;
        }
        C13868 c138610 = c13868;
        while (!c138610.m31578()) {
            c138610 = c138610.f39176;
        }
        C13868 c138611 = c13869;
        while (!c138611.m31578()) {
            c138611 = c138611.f39180;
        }
        if (!c138610.m31579() || !c138611.m31579() || c138610.f39182 != c138611.f39182) {
            return m34667(c13868, c13869);
        }
        C11857 c11857M34665 = m34665(c13868);
        C11857 c11857M34666 = m34666(c13869);
        long j = ((long) c11857M34665.f33060.f39178) + ((long) c11857M34666.f33060.f39178);
        if (j > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        return m34663(m34663(c11857M34665.f33061, m34640((int) j, c11857M34665.f33060.f39182)), c11857M34666.f33061);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C13868 m34655(C13868 c13868, int i, int i2) {
        long[] jArr = new long[m34661(i2)];
        for (int i3 = 0; i3 < i2; i3++) {
            if (m34659(i + i3, c13868.f39177)) {
                int i4 = i3 >>> 6;
                jArr[i4] = jArr[i4] | (1 << (i3 & 63));
            }
        }
        return m34662(i2, jArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C13868 m34662(int i, long[] jArr) {
        if (i <= 0 || i > 65536 || jArr.length != m34661(i)) {
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
            return m34640(i, false);
        }
        if (z2) {
            return m34640(i, true);
        }
        return new C13868(null, null, jArr, i, 1, false, true);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m34659(int i, long[] jArr) {
        return ((1 << (i & 63)) & jArr[i >>> 6]) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13868 m34640(int i, boolean z) {
        return new C13868(null, null, null, i, 1, z, z);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C13868 m34656(C13868 c13868, C13868 c13869) {
        long j = ((long) c13868.f39178) + ((long) c13869.f39178);
        int i = (int) j;
        if (j == i) {
            return new C13868(c13868, c13869, null, i, Math.max(c13868.f39181, c13869.f39181) + 1, false, c13868.f39175 || c13869.f39175);
        }
        throw new ArithmeticException();
    }
}
