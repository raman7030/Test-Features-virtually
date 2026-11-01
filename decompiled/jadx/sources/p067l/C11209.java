package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11209 {

    /* JADX INFO: renamed from: ۧ */
    public static final C11209 f31138 = new C11209(null);

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8526 f31139;

    public C11209(AbstractC8526 abstractC8526) {
        this.f31139 = abstractC8526;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C11209 m25887() {
        return f31138;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11209 m25877(int i, C23120 c23120, boolean z) {
        if (i <= 0) {
            throw new IllegalArgumentException("Non-positive syntax run length");
        }
        C12826.requireNonNull(c23120, "style");
        return new C11209(new C24619(new int[]{i | (z ? Integer.MIN_VALUE : 0)}, new C23120[]{c23120}));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25889() {
        AbstractC8526 abstractC8526 = this.f31139;
        if (abstractC8526 == null) {
            return 0;
        }
        return abstractC8526.f22881;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m25894() {
        AbstractC8526 abstractC8526 = this.f31139;
        if (abstractC8526 == null) {
            return 0;
        }
        return abstractC8526.f22882;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25893(int i, int i2) {
        C12826.checkFromToIndex(i, i2, m25889());
        return i < i2 && m25882(this.f31139, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m25892(int i) {
        C12826.checkIndex(i, m25889());
        AbstractC8526 abstractC8526 = this.f31139;
        while (abstractC8526 instanceof C12550) {
            C12550 c12550 = (C12550) abstractC8526;
            AbstractC8526 abstractC8527 = c12550.f35270;
            int i2 = abstractC8527.f22881;
            if (i < i2) {
                abstractC8526 = abstractC8527;
            } else {
                i -= i2;
                abstractC8526 = c12550.f35269;
            }
        }
        C24619 c24619 = (C24619) abstractC8526;
        int i3 = 0;
        while (true) {
            int i4 = c24619.f77931[i3] & Integer.MAX_VALUE;
            if (i < i4) {
                return c24619.f77930[i3];
            }
            i -= i4;
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C11209 m25895(int i, int i2) {
        C12826.checkFromToIndex(i, i2, m25889());
        C11209 c11209 = f31138;
        if (i == i2) {
            return c11209;
        }
        if (i == 0 && i2 == m25889()) {
            return this;
        }
        AbstractC8526 abstractC8526 = m25879(m25879(this.f31139, i2).f68968, i).f68969;
        return abstractC8526 == null ? c11209 : new C11209(abstractC8526);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11209 m25891(C11209 c11209) {
        C12826.requireNonNull(c11209, "suffix");
        AbstractC8526 abstractC8526 = c11209.f31139;
        if (abstractC8526 == null) {
            return this;
        }
        AbstractC8526 abstractC8527 = this.f31139;
        if (abstractC8527 == null) {
            return c11209;
        }
        long jM25889 = ((long) m25889()) + ((long) c11209.m25889());
        if (jM25889 != ((int) jM25889)) {
            throw new ArithmeticException();
        }
        AbstractC8526 abstractC8526M25885 = m25885(abstractC8527, abstractC8526);
        return abstractC8526M25885 == null ? f31138 : new C11209(abstractC8526M25885);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11209 m25890(int i, int i2, C11209 c11209) {
        AbstractC8526 abstractC8526 = c11209.f31139;
        C12826.checkFromToIndex(i, i2, m25889());
        long jM25889 = ((long) (m25889() - (i2 - i))) + ((long) c11209.m25889());
        if (jM25889 != ((int) jM25889)) {
            throw new ArithmeticException();
        }
        if (i == i2 && abstractC8526 == null) {
            return this;
        }
        if (i == 0 && i2 == m25889()) {
            return c11209;
        }
        C21938 c21938M25879 = m25879(this.f31139, i2);
        AbstractC8526 abstractC8526M25885 = m25885(m25885(m25879(c21938M25879.f68968, i).f68968, abstractC8526), c21938M25879.f68969);
        return abstractC8526M25885 == null ? f31138 : new C11209(abstractC8526M25885);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15901 m25896(C11209 c11209) {
        C12826.requireNonNull(c11209, "other");
        AbstractC8526 abstractC8526 = c11209.f31139;
        AbstractC8526 abstractC8527 = this.f31139;
        if (abstractC8527 == abstractC8526) {
            return null;
        }
        int iMin = Math.min(m25889(), c11209.m25889());
        int iM25875 = iMin != 0 ? m25875(abstractC8527, abstractC8526, iMin, false) : 0;
        if (m25889() != c11209.m25889()) {
            return new C15901(iM25875, Math.max(m25889(), c11209.m25889()));
        }
        if (iM25875 == iMin) {
            return null;
        }
        return new C15901(iM25875, iMin - m25875(abstractC8527, abstractC8526, iMin - iM25875, true));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25875(AbstractC8526 abstractC8526, AbstractC8526 abstractC8527, int i, boolean z) {
        C18584 c18584 = new C18584(abstractC8526, z);
        C18584 c18585 = new C18584(abstractC8527, z);
        int iMin = 0;
        while (iMin < i) {
            if (c18584.f55496 == c18585.f55496 && c18584.f55491 == c18585.f55491) {
                iMin += Math.min(i - iMin, c18584.f55496.f22881 - c18584.f55491);
                if (iMin == i) {
                    return iMin;
                }
                c18584.m42297();
                c18585.m42297();
            } else if ((c18584.f55496 instanceof C12550) && (!(c18585.f55496 instanceof C12550) || c18584.f55496.f22881 >= c18585.f55496.f22881)) {
                c18584.m42295();
            } else if (c18585.f55496 instanceof C12550) {
                c18585.m42295();
            } else {
                if (!((C24619) c18584.f55496).f77930[c18584.f55494].equals(((C24619) c18585.f55496).f77930[c18585.f55494])) {
                    break;
                }
                int iMin2 = Math.min(i - iMin, Math.min(c18584.f55493, c18585.f55493));
                iMin += iMin2;
                c18584.m42296(iMin2);
                c18585.m42296(iMin2);
            }
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11209 m25878(AbstractC8526 abstractC8526) {
        return abstractC8526 == null ? f31138 : new C11209(abstractC8526);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25882(AbstractC8526 abstractC8526, int i, int i2) {
        if (abstractC8526.f22879) {
            if (i != 0 || i2 != abstractC8526.f22881) {
                if (abstractC8526 instanceof C12550) {
                    C12550 c12550 = (C12550) abstractC8526;
                    AbstractC8526 abstractC8527 = c12550.f35270;
                    int i3 = abstractC8527.f22881;
                    if ((i >= i3 || !m25882(abstractC8527, i, Math.min(i2, i3))) && (i2 <= i3 || !m25882(c12550.f35269, Math.max(0, i - i3), i2 - i3))) {
                    }
                } else {
                    C24619 c24619 = (C24619) abstractC8526;
                    int i4 = 0;
                    for (int i5 = 0; i5 < c24619.f22882 && i4 < i2; i5++) {
                        i4 += c24619.f77931[i5] & Integer.MAX_VALUE;
                        if (i4 > i) {
                            C23120 c23120 = c24619.f77930[i5];
                            if ((c23120.m51560() >>> 24) == 6 || (c23120.m51562() >>> 24) == 6) {
                                return true;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21938 m25879(AbstractC8526 abstractC8526, int i) {
        if (i == 0) {
            return new C21938(null, abstractC8526);
        }
        if (i == abstractC8526.f22881) {
            return new C21938(abstractC8526, null);
        }
        if (abstractC8526 instanceof C24619) {
            C24619 c24619 = (C24619) abstractC8526;
            return new C21938(m25881(c24619, 0, i), m25881(c24619, i, c24619.f22881));
        }
        C12550 c12550 = (C12550) abstractC8526;
        AbstractC8526 abstractC8527 = c12550.f35270;
        AbstractC8526 abstractC8528 = c12550.f35269;
        int i2 = abstractC8527.f22881;
        if (i == i2) {
            return new C21938(abstractC8527, abstractC8528);
        }
        if (i < i2) {
            C21938 c21938M25879 = m25879(abstractC8527, i);
            return new C21938(c21938M25879.f68968, m25888(c21938M25879.f68969, abstractC8528));
        }
        C21938 c21938M258710 = m25879(abstractC8528, i - i2);
        return new C21938(m25888(abstractC8527, c21938M258710.f68968), c21938M258710.f68969);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24619 m25881(C24619 c24619, int i, int i2) {
        int[] iArr;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = c24619.f77931;
            iArr = c24619.f77931;
            i3 = iArr2[i5];
            if ((i3 & Integer.MAX_VALUE) + i4 > i) {
                break;
            }
            i5++;
            i4 += i3 & Integer.MAX_VALUE;
        }
        int i6 = (i3 & Integer.MAX_VALUE) + i4;
        int i7 = i5;
        while (i6 < i2) {
            i7++;
            i6 += iArr[i7] & Integer.MAX_VALUE;
        }
        int i8 = i7 + 1;
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i5, i8);
        C23120[] c23120Arr = (C23120[]) Arrays.copyOfRange(c24619.f77930, i5, i8);
        int i9 = 0;
        while (i9 < iArrCopyOfRange.length) {
            int i10 = iArrCopyOfRange[i9];
            int i11 = (i10 & Integer.MAX_VALUE) + i4;
            iArrCopyOfRange[i9] = (i <= i4 ? Integer.MIN_VALUE & i10 : 0) | (Math.min(i2, i11) - Math.max(i, i4));
            i9++;
            i4 = i11;
        }
        return new C24619(iArrCopyOfRange, c23120Arr);
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC8526 m25885(AbstractC8526 abstractC8526, AbstractC8526 abstractC8527) {
        int i;
        if (abstractC8526 == null) {
            return abstractC8527;
        }
        if (abstractC8527 == null) {
            return abstractC8526;
        }
        C24619 c24619M25880 = m25880(abstractC8526, false);
        C24619 c24619M25881 = m25880(abstractC8527, true);
        int i2 = (c24619M25881.f77931[0] < 0 || !c24619M25880.f77930[c24619M25880.f22882 - 1].equals(c24619M25881.f77930[0])) ? 0 : 1;
        int i3 = c24619M25880.f22882;
        int i4 = c24619M25881.f22882;
        int i5 = (i3 + i4) - i2;
        if (i2 == 0 && i5 > 128 && i3 >= 64 && i4 >= 64) {
            return m25888(abstractC8526, abstractC8527);
        }
        C24619[] c24619Arr = new C24619[4];
        c24619Arr[0] = c24619M25880;
        c24619Arr[1] = c24619M25881;
        AbstractC8526 abstractC8526M25883 = m25883(abstractC8526, false);
        AbstractC8526 abstractC8526M25884 = m25883(abstractC8527, true);
        int i6 = 2;
        while (i5 < 64 && (abstractC8526M25883 != null || abstractC8526M25884 != null)) {
            if (abstractC8526M25883 != null) {
                C24619 c24619M25882 = m25880(abstractC8526M25883, false);
                System.arraycopy(c24619Arr, 0, c24619Arr, 1, i6);
                c24619Arr[0] = c24619M25882;
                abstractC8526M25883 = m25883(abstractC8526M25883, false);
                i = c24619M25882.f22882;
            } else {
                C24619 c24619M25883 = m25880(abstractC8526M25884, true);
                c24619Arr[i6] = c24619M25883;
                abstractC8526M25884 = m25883(abstractC8526M25884, true);
                i = c24619M25883.f22882;
            }
            i5 += i;
            i6++;
        }
        int i7 = i5 <= 128 ? i5 : i5 / 2;
        int[] iArr = new int[i7];
        C23120[] c23120Arr = new C23120[i7];
        C23120 c23120 = null;
        int[] iArr2 = i5 == i7 ? null : new int[i5 - i7];
        C23120[] c23120Arr2 = i5 == i7 ? null : new C23120[i5 - i7];
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            C24619 c24619 = c24619Arr[i9];
            int i10 = 0;
            while (i10 < c24619.f22882) {
                int i11 = c24619.f77931[i10];
                Object obj = c24619.f77930[i10];
                boolean z = i8 >= 0 && i11 >= 0 && c23120.equals(obj);
                if (!z) {
                    i8++;
                }
                int i12 = i8 < i7 ? i8 : i8 - i7;
                int[] iArr3 = i8 < i7 ? iArr : iArr2;
                C23120[] c23120Arr3 = i8 < i7 ? c23120Arr : c23120Arr2;
                if (z) {
                    int i13 = iArr3[i12];
                    iArr3[i12] = (i13 & Integer.MIN_VALUE) | ((i13 & Integer.MAX_VALUE) + (i11 & Integer.MAX_VALUE));
                } else {
                    iArr3[i12] = i11;
                    c23120Arr3[i12] = obj;
                }
                i10++;
                c23120 = obj;
            }
        }
        AbstractC8526 c246110 = new C24619(iArr, c23120Arr);
        if (iArr2 != null) {
            c246110 = new C12550(c246110, new C24619(iArr2, c23120Arr2));
        }
        return m25888(m25888(abstractC8526M25883, c246110), abstractC8526M25884);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24619 m25880(AbstractC8526 abstractC8526, boolean z) {
        while (abstractC8526 instanceof C12550) {
            C12550 c12550 = (C12550) abstractC8526;
            abstractC8526 = z ? c12550.f35270 : c12550.f35269;
        }
        return (C24619) abstractC8526;
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC8526 m25883(AbstractC8526 abstractC8526, boolean z) {
        if (abstractC8526 instanceof C24619) {
            return null;
        }
        C12550 c12550 = (C12550) abstractC8526;
        if (z) {
            return m25888(m25883(c12550.f35270, true), c12550.f35269);
        }
        return m25888(c12550.f35270, m25883(c12550.f35269, false));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static AbstractC8526 m25888(AbstractC8526 abstractC8526, AbstractC8526 abstractC8527) {
        if (abstractC8526 == null) {
            return abstractC8527;
        }
        if (abstractC8527 == null) {
            return abstractC8526;
        }
        int i = abstractC8526.f22880;
        int i2 = abstractC8527.f22880;
        if (i > i2 + 1) {
            C12550 c12550 = (C12550) abstractC8526;
            return m25884(c12550.f35270, m25888(c12550.f35269, abstractC8527));
        }
        if (i2 > i + 1) {
            C12550 c12551 = (C12550) abstractC8527;
            return m25884(m25888(abstractC8526, c12551.f35270), c12551.f35269);
        }
        return new C12550(abstractC8526, abstractC8527);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C12550 m25884(AbstractC8526 abstractC8526, AbstractC8526 abstractC8527) {
        int i = abstractC8526.f22880;
        int i2 = abstractC8527.f22880;
        if (i > i2 + 1) {
            C12550 c12550 = (C12550) abstractC8526;
            AbstractC8526 abstractC8528 = c12550.f35270;
            int i3 = abstractC8528.f22880;
            AbstractC8526 abstractC8529 = c12550.f35269;
            if (i3 >= abstractC8529.f22880) {
                return new C12550(abstractC8528, new C12550(abstractC8529, abstractC8527));
            }
            C12550 c12551 = (C12550) abstractC8529;
            return new C12550(new C12550(abstractC8528, c12551.f35270), new C12550(c12551.f35269, abstractC8527));
        }
        if (i2 > i + 1) {
            C12550 c12552 = (C12550) abstractC8527;
            AbstractC8526 abstractC85210 = c12552.f35269;
            int i4 = abstractC85210.f22880;
            AbstractC8526 abstractC85211 = c12552.f35270;
            if (i4 >= abstractC85211.f22880) {
                return new C12550(new C12550(abstractC8526, abstractC85211), abstractC85210);
            }
            C12550 c12553 = (C12550) abstractC85211;
            return new C12550(new C12550(abstractC8526, c12553.f35270), new C12550(c12553.f35269, abstractC85210));
        }
        return new C12550(abstractC8526, abstractC8527);
    }
}
