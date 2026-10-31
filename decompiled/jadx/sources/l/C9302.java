package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9302 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C9302 f28189 = new C9302(null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC6479 f28190;

    public C9302(AbstractC6479 abstractC6479) {
        this.f28190 = abstractC6479;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C9302 m23878() {
        return f28189;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9302 m23868(int i, C21834 c21834, boolean z) {
        if (i <= 0) {
            throw new IllegalArgumentException("Non-positive syntax run length");
        }
        C11003.requireNonNull(c21834, "style");
        return new C9302(new C23412(new int[]{i | (z ? Integer.MIN_VALUE : 0)}, new C21834[]{c21834}));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23880() {
        AbstractC6479 abstractC6479 = this.f28190;
        if (abstractC6479 == null) {
            return 0;
        }
        return abstractC6479.f20006;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m23885() {
        AbstractC6479 abstractC6479 = this.f28190;
        if (abstractC6479 == null) {
            return 0;
        }
        return abstractC6479.f20007;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23884(int i, int i2) {
        C11003.checkFromToIndex(i, i2, m23880());
        return i < i2 && m23873(this.f28190, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m23883(int i) {
        C11003.checkIndex(i, m23880());
        AbstractC6479 abstractC6479 = this.f28190;
        while (abstractC6479 instanceof C10713) {
            C10713 c10713 = (C10713) abstractC6479;
            AbstractC6479 abstractC64710 = c10713.f32295;
            int i2 = abstractC64710.f20006;
            if (i < i2) {
                abstractC6479 = abstractC64710;
            } else {
                i -= i2;
                abstractC6479 = c10713.f32294;
            }
        }
        C23412 c23412 = (C23412) abstractC6479;
        int i3 = 0;
        while (true) {
            int i4 = c23412.f75185[i3] & Integer.MAX_VALUE;
            if (i < i4) {
                return c23412.f75184[i3];
            }
            i -= i4;
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9302 m23886(int i, int i2) {
        C11003.checkFromToIndex(i, i2, m23880());
        C9302 c9302 = f28189;
        if (i == i2) {
            return c9302;
        }
        if (i == 0 && i2 == m23880()) {
            return this;
        }
        AbstractC6479 abstractC6479 = m23870(m23870(this.f28190, i2).f66287, i).f66288;
        return abstractC6479 == null ? c9302 : new C9302(abstractC6479);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9302 m23882(C9302 c9302) {
        C11003.requireNonNull(c9302, "suffix");
        AbstractC6479 abstractC6479 = c9302.f28190;
        if (abstractC6479 == null) {
            return this;
        }
        AbstractC6479 abstractC64710 = this.f28190;
        if (abstractC64710 == null) {
            return c9302;
        }
        long jM23880 = ((long) m23880()) + ((long) c9302.m23880());
        if (jM23880 != ((int) jM23880)) {
            throw new ArithmeticException();
        }
        AbstractC6479 abstractC6479M23876 = m23876(abstractC64710, abstractC6479);
        return abstractC6479M23876 == null ? f28189 : new C9302(abstractC6479M23876);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9302 m23881(int i, int i2, C9302 c9302) {
        AbstractC6479 abstractC6479 = c9302.f28190;
        C11003.checkFromToIndex(i, i2, m23880());
        long jM23880 = ((long) (m23880() - (i2 - i))) + ((long) c9302.m23880());
        if (jM23880 != ((int) jM23880)) {
            throw new ArithmeticException();
        }
        if (i == i2 && abstractC6479 == null) {
            return this;
        }
        if (i == 0 && i2 == m23880()) {
            return c9302;
        }
        C20591 c20591M23870 = m23870(this.f28190, i2);
        AbstractC6479 abstractC6479M23876 = m23876(m23876(m23870(c20591M23870.f66287, i).f66287, abstractC6479), c20591M23870.f66288);
        return abstractC6479M23876 == null ? f28189 : new C9302(abstractC6479M23876);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14239 m23887(C9302 c9302) {
        C11003.requireNonNull(c9302, "other");
        AbstractC6479 abstractC6479 = c9302.f28190;
        AbstractC6479 abstractC64710 = this.f28190;
        if (abstractC64710 == abstractC6479) {
            return null;
        }
        int iMin = Math.min(m23880(), c9302.m23880());
        int iM23866 = iMin != 0 ? m23866(abstractC64710, abstractC6479, iMin, false) : 0;
        if (m23880() != c9302.m23880()) {
            return new C14239(iM23866, Math.max(m23880(), c9302.m23880()));
        }
        if (iM23866 == iMin) {
            return null;
        }
        return new C14239(iM23866, iMin - m23866(abstractC64710, abstractC6479, iMin - iM23866, true));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23866(AbstractC6479 abstractC6479, AbstractC6479 abstractC64710, int i, boolean z) {
        C17062 c17062 = new C17062(abstractC6479, z);
        C17062 c17063 = new C17062(abstractC64710, z);
        int iMin = 0;
        while (iMin < i) {
            if (c17062.f52314 == c17063.f52314 && c17062.f52309 == c17063.f52309) {
                iMin += Math.min(i - iMin, c17062.f52314.f20006 - c17062.f52309);
                if (iMin == i) {
                    return iMin;
                }
                c17062.m40052();
                c17063.m40052();
            } else if ((c17062.f52314 instanceof C10713) && (!(c17063.f52314 instanceof C10713) || c17062.f52314.f20006 >= c17063.f52314.f20006)) {
                c17062.m40050();
            } else if (c17063.f52314 instanceof C10713) {
                c17063.m40050();
            } else {
                if (!((C23412) c17062.f52314).f75184[c17062.f52312].equals(((C23412) c17063.f52314).f75184[c17063.f52312])) {
                    break;
                }
                int iMin2 = Math.min(i - iMin, Math.min(c17062.f52311, c17063.f52311));
                iMin += iMin2;
                c17062.m40051(iMin2);
                c17063.m40051(iMin2);
            }
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9302 m23869(AbstractC6479 abstractC6479) {
        return abstractC6479 == null ? f28189 : new C9302(abstractC6479);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23873(AbstractC6479 abstractC6479, int i, int i2) {
        if (abstractC6479.f20004) {
            if (i != 0 || i2 != abstractC6479.f20006) {
                if (abstractC6479 instanceof C10713) {
                    C10713 c10713 = (C10713) abstractC6479;
                    AbstractC6479 abstractC64710 = c10713.f32295;
                    int i3 = abstractC64710.f20006;
                    if ((i >= i3 || !m23873(abstractC64710, i, Math.min(i2, i3))) && (i2 <= i3 || !m23873(c10713.f32294, Math.max(0, i - i3), i2 - i3))) {
                    }
                } else {
                    C23412 c23412 = (C23412) abstractC6479;
                    int i4 = 0;
                    for (int i5 = 0; i5 < c23412.f20007 && i4 < i2; i5++) {
                        i4 += c23412.f75185[i5] & Integer.MAX_VALUE;
                        if (i4 > i) {
                            C21834 c21834 = c23412.f75184[i5];
                            if ((c21834.m49209() >>> 24) == 6 || (c21834.m49211() >>> 24) == 6) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20591 m23870(AbstractC6479 abstractC6479, int i) {
        if (i == 0) {
            return new C20591(null, abstractC6479);
        }
        if (i == abstractC6479.f20006) {
            return new C20591(abstractC6479, null);
        }
        if (abstractC6479 instanceof C23412) {
            C23412 c23412 = (C23412) abstractC6479;
            return new C20591(m23872(c23412, 0, i), m23872(c23412, i, c23412.f20006));
        }
        C10713 c10713 = (C10713) abstractC6479;
        AbstractC6479 abstractC64710 = c10713.f32295;
        AbstractC6479 abstractC64711 = c10713.f32294;
        int i2 = abstractC64710.f20006;
        if (i == i2) {
            return new C20591(abstractC64710, abstractC64711);
        }
        if (i < i2) {
            C20591 c20591M23870 = m23870(abstractC64710, i);
            return new C20591(c20591M23870.f66287, m23879(c20591M23870.f66288, abstractC64711));
        }
        C20591 c20591M23871 = m23870(abstractC64711, i - i2);
        return new C20591(m23879(abstractC64710, c20591M23871.f66287), c20591M23871.f66288);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23412 m23872(C23412 c23412, int i, int i2) {
        int[] iArr;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = c23412.f75185;
            iArr = c23412.f75185;
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
        C21834[] c21834Arr = (C21834[]) Arrays.copyOfRange(c23412.f75184, i5, i8);
        int i9 = 0;
        while (i9 < iArrCopyOfRange.length) {
            int i10 = iArrCopyOfRange[i9];
            int i11 = (i10 & Integer.MAX_VALUE) + i4;
            iArrCopyOfRange[i9] = (i <= i4 ? Integer.MIN_VALUE & i10 : 0) | (Math.min(i2, i11) - Math.max(i, i4));
            i9++;
            i4 = i11;
        }
        return new C23412(iArrCopyOfRange, c21834Arr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC6479 m23876(AbstractC6479 abstractC6479, AbstractC6479 abstractC64710) {
        int i;
        if (abstractC6479 == null) {
            return abstractC64710;
        }
        if (abstractC64710 == null) {
            return abstractC6479;
        }
        C23412 c23412M23871 = m23871(abstractC6479, false);
        C23412 c23412M23872 = m23871(abstractC64710, true);
        int i2 = (c23412M23872.f75185[0] < 0 || !c23412M23871.f75184[c23412M23871.f20007 - 1].equals(c23412M23872.f75184[0])) ? 0 : 1;
        int i3 = c23412M23871.f20007;
        int i4 = c23412M23872.f20007;
        int i5 = (i3 + i4) - i2;
        if (i2 == 0 && i5 > 128 && i3 >= 64 && i4 >= 64) {
            return m23879(abstractC6479, abstractC64710);
        }
        C23412[] c23412Arr = new C23412[4];
        c23412Arr[0] = c23412M23871;
        c23412Arr[1] = c23412M23872;
        AbstractC6479 abstractC6479M23874 = m23874(abstractC6479, false);
        AbstractC6479 abstractC6479M23875 = m23874(abstractC64710, true);
        int i6 = 2;
        while (i5 < 64 && (abstractC6479M23874 != null || abstractC6479M23875 != null)) {
            if (abstractC6479M23874 != null) {
                C23412 c23412M23873 = m23871(abstractC6479M23874, false);
                System.arraycopy(c23412Arr, 0, c23412Arr, 1, i6);
                c23412Arr[0] = c23412M23873;
                abstractC6479M23874 = m23874(abstractC6479M23874, false);
                i = c23412M23873.f20007;
            } else {
                C23412 c23412M23874 = m23871(abstractC6479M23875, true);
                c23412Arr[i6] = c23412M23874;
                abstractC6479M23875 = m23874(abstractC6479M23875, true);
                i = c23412M23874.f20007;
            }
            i5 += i;
            i6++;
        }
        int i7 = i5 <= 128 ? i5 : i5 / 2;
        int[] iArr = new int[i7];
        C21834[] c21834Arr = new C21834[i7];
        C21834 c21834 = null;
        int[] iArr2 = i5 == i7 ? null : new int[i5 - i7];
        C21834[] c21834Arr2 = i5 == i7 ? null : new C21834[i5 - i7];
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            C23412 c23412 = c23412Arr[i9];
            int i10 = 0;
            while (i10 < c23412.f20007) {
                int i11 = c23412.f75185[i10];
                Object obj = c23412.f75184[i10];
                boolean z = i8 >= 0 && i11 >= 0 && c21834.equals(obj);
                if (!z) {
                    i8++;
                }
                int i12 = i8 < i7 ? i8 : i8 - i7;
                int[] iArr3 = i8 < i7 ? iArr : iArr2;
                C21834[] c21834Arr3 = i8 < i7 ? c21834Arr : c21834Arr2;
                if (z) {
                    int i13 = iArr3[i12];
                    iArr3[i12] = (i13 & Integer.MIN_VALUE) | ((i13 & Integer.MAX_VALUE) + (i11 & Integer.MAX_VALUE));
                } else {
                    iArr3[i12] = i11;
                    c21834Arr3[i12] = obj;
                }
                i10++;
                c21834 = obj;
            }
        }
        AbstractC6479 c23413 = new C23412(iArr, c21834Arr);
        if (iArr2 != null) {
            c23413 = new C10713(c23413, new C23412(iArr2, c21834Arr2));
        }
        return m23879(m23879(abstractC6479M23874, c23413), abstractC6479M23875);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23412 m23871(AbstractC6479 abstractC6479, boolean z) {
        while (abstractC6479 instanceof C10713) {
            C10713 c10713 = (C10713) abstractC6479;
            abstractC6479 = z ? c10713.f32295 : c10713.f32294;
        }
        return (C23412) abstractC6479;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC6479 m23874(AbstractC6479 abstractC6479, boolean z) {
        if (abstractC6479 instanceof C23412) {
            return null;
        }
        C10713 c10713 = (C10713) abstractC6479;
        if (z) {
            return m23879(m23874(c10713.f32295, true), c10713.f32294);
        }
        return m23879(c10713.f32295, m23874(c10713.f32294, false));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static AbstractC6479 m23879(AbstractC6479 abstractC6479, AbstractC6479 abstractC64710) {
        if (abstractC6479 == null) {
            return abstractC64710;
        }
        if (abstractC64710 == null) {
            return abstractC6479;
        }
        int i = abstractC6479.f20005;
        int i2 = abstractC64710.f20005;
        if (i > i2 + 1) {
            C10713 c10713 = (C10713) abstractC6479;
            return m23875(c10713.f32295, m23879(c10713.f32294, abstractC64710));
        }
        if (i2 > i + 1) {
            C10713 c10714 = (C10713) abstractC64710;
            return m23875(m23879(abstractC6479, c10714.f32295), c10714.f32294);
        }
        return new C10713(abstractC6479, abstractC64710);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C10713 m23875(AbstractC6479 abstractC6479, AbstractC6479 abstractC64710) {
        int i = abstractC6479.f20005;
        int i2 = abstractC64710.f20005;
        if (i > i2 + 1) {
            C10713 c10713 = (C10713) abstractC6479;
            AbstractC6479 abstractC64711 = c10713.f32295;
            int i3 = abstractC64711.f20005;
            AbstractC6479 abstractC64712 = c10713.f32294;
            if (i3 >= abstractC64712.f20005) {
                return new C10713(abstractC64711, new C10713(abstractC64712, abstractC64710));
            }
            C10713 c10714 = (C10713) abstractC64712;
            return new C10713(new C10713(abstractC64711, c10714.f32295), new C10713(c10714.f32294, abstractC64710));
        }
        if (i2 > i + 1) {
            C10713 c10715 = (C10713) abstractC64710;
            AbstractC6479 abstractC64713 = c10715.f32294;
            int i4 = abstractC64713.f20005;
            AbstractC6479 abstractC64714 = c10715.f32295;
            if (i4 >= abstractC64714.f20005) {
                return new C10713(new C10713(abstractC6479, abstractC64714), abstractC64713);
            }
            C10713 c10716 = (C10713) abstractC64714;
            return new C10713(new C10713(abstractC6479, c10716.f32295), new C10713(c10716.f32294, abstractC64713));
        }
        return new C10713(abstractC6479, abstractC64710);
    }
}
