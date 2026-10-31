package l;

/* JADX INFO: renamed from: l.ܽ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16292 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8760 f50087;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f50088;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f50089;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f50090;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f50091;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f50092;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f50093;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f50094;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f50095;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f50096;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f50097;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f50098;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f50099;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f50100;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f50101;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f50102;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f50103;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f50104;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f50105;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f50106;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f50107;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f50108;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f50109;

    public C16292(C8760 c8760, Object obj, Object obj2, boolean z, boolean z2, int i, int i2, int i3) {
        int iM39980;
        char c;
        boolean z3;
        boolean z4;
        this.f50087 = c8760;
        this.f50101 = obj;
        this.f50092 = obj2;
        this.f50098 = z;
        this.f50100 = z2;
        this.f50090 = i;
        this.f50108 = i2;
        this.f50091 = i3;
        boolean z5 = obj instanceof int[];
        int i4 = 2;
        boolean z6 = z5 && ((int[]) obj).length == 2;
        this.f50093 = z6;
        int iM39981 = -1;
        this.f50102 = z6 ? ((int[]) obj)[0] : -1;
        this.f50096 = z6 ? ((int[]) obj)[1] : -1;
        this.f50106 = obj instanceof InterfaceC10795 ? (InterfaceC10795) obj : null;
        this.f50099 = obj2 instanceof InterfaceC10795 ? (InterfaceC10795) obj2 : null;
        this.f50103 = m38312(obj);
        this.f50088 = m38312(obj2);
        if (z5) {
            int[] iArr = (int[]) obj;
            iM39980 = iArr.length == 1 ? iArr[0] : -1;
        } else {
            C5855 c5855 = C14403.f44164;
            iM39980 = C17019.m39980((InterfaceC10795) obj);
        }
        this.f50109 = iM39980;
        if (obj2 instanceof int[]) {
            int[] iArr2 = (int[]) obj2;
            if (iArr2.length == 1) {
                iM39981 = iArr2[0];
            }
        } else {
            C5855 c5856 = C14403.f44164;
            iM39981 = C17019.m39980((InterfaceC10795) obj2);
        }
        this.f50094 = iM39981;
        this.f50105 = c8760 != null && c8760.f26704 && !z && c8760.f26705 < 0 && iM39980 >= 0 && iM39980 < 128 && iM39981 >= 0 && iM39981 < 128 && iM39980 != iM39981;
        if (c8760 == null) {
            c = 0;
            i4 = 0;
        } else {
            EnumC1497 enumC1497 = c8760.f26708;
            boolean z7 = c8760.f26704;
            if (!z7 || z) {
                int i5 = c8760.f26705;
                if (i5 >= 0 || z) {
                    if (i5 >= 0 || !z || !z6 || z7 || enumC1497 != EnumC1497.POSSESSIVE || iM39981 < 0) {
                        i4 = (i5 >= 0 && c8760.f26702 && z6 && iM39981 >= 0 && (enumC1497 == EnumC1497.GREEDY || enumC1497 == EnumC1497.LAZY)) ? 3 : 4;
                    } else {
                        i4 = 6;
                    }
                } else if (iM39980 >= 0 && iM39981 >= 0) {
                    int i6 = C10649.f32042[enumC1497.ordinal()];
                    if (i6 == 1) {
                        i4 = (iM39980 != iM39981 || c8760.f26707 >= 1024) ? 5 : 9;
                    } else if (i6 == 2) {
                        i4 = 7;
                    } else {
                        if (i6 != 3) {
                            throw new IllegalArgumentException("Invalid exact literal quantifier type");
                        }
                        i4 = 8;
                    }
                }
                c = 0;
            } else {
                c = 0;
                i4 = 1;
            }
        }
        this.f50095 = i4;
        long j = 0;
        long j2 = 0;
        for (int i7 = 0; i7 < 128; i7++) {
            if (m38315(i7, obj) || (i3 == 0 && m38315(i7, obj2))) {
                if (i7 < 64) {
                    j |= 1 << i7;
                } else {
                    j2 |= 1 << i7;
                }
            }
        }
        this.f50097 = j;
        this.f50089 = j2;
        if (z5) {
            int[] iArr3 = (int[]) obj;
            z3 = i3 != 0 || iArr3.length <= 1;
            for (int i8 = 1; i8 < iArr3.length; i8++) {
                if (iArr3[i8] == iArr3[c]) {
                    z3 = false;
                }
            }
        } else {
            z3 = true;
        }
        this.f50104 = z3;
        for (int i9 = 56320; i9 <= 57343; i9++) {
            if (m38315(i9, obj2)) {
                z4 = false;
                this.f50107 = z4;
            }
        }
        z4 = true;
        this.f50107 = z4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38318(int i) {
        if (i < 128) {
            return ((i < 64 ? this.f50097 : this.f50089) & (1 << i)) != 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38312(Object obj) {
        if (!(obj instanceof int[]) || ((int[]) obj).length == 1) {
            int i = -1;
            for (int i2 = 0; i2 < 128; i2++) {
                if (m38315(i2, obj)) {
                    if (i < 0) {
                        i = i2;
                    }
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38315(int i, Object obj) {
        if (obj instanceof int[]) {
            return ((int[]) obj)[0] == i;
        }
        return ((InterfaceC10795) obj).mo2465(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0126, code lost:
    
        if (m38314(r1, 23, r17) != false) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C16292 m38317(int[] iArr, Object[] objArr, int i) {
        int i2;
        int i3;
        Object objM38313;
        int i4;
        EnumC1497 enumC1497;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        if (iArr != null && objArr != null && m38316(i, iArr) && (((i2 = iArr[i]) == 25 || i2 == 4 || i2 == 5) && (objM38313 = m38313(iArr, objArr, (i3 = iArr[i + 1]))) != null && m38314(iArr[i3 + 1], 0, iArr))) {
            if (i2 != 25) {
                int i9 = iArr[i + 2];
                Object obj = (i9 < 0 || i9 >= objArr.length) ? null : objArr[i9];
                int i10 = iArr[i + 3];
                if ((obj instanceof InterfaceC10795) && i10 >= 0) {
                    boolean z2 = i2 == 5 ? 1 : 0;
                    return new C16292(null, obj, objM38313, false, z2, 0, !z2, i10);
                }
            } else {
                int i11 = iArr[i + 2];
                Object obj2 = (i11 < 0 || i11 >= objArr.length) ? null : objArr[i11];
                if (obj2 instanceof C8760) {
                    C8760 c8760 = (C8760) obj2;
                    int i12 = c8760.f26703;
                    boolean z3 = c8760.f26702;
                    int i13 = c8760.f26705;
                    int i14 = c8760.f26706;
                    if (i14 >= 0 && (i4 = c8760.f26707) >= i14 && (enumC1497 = c8760.f26708) != null && enumC1497 != EnumC1497.INDEPENDENT && (!c8760.f26704 || (i14 == 0 && i4 == 1))) {
                        int i15 = iArr[i + 3];
                        if (m38316(i15, iArr)) {
                            if (i13 >= 0 || !m38314(i15, 7, iArr)) {
                                i5 = -1;
                                z = false;
                            } else {
                                i5 = iArr[i15 + 2];
                                if (i5 >= 0) {
                                    i15 = iArr[i15 + 1];
                                    z = true;
                                }
                            }
                            Object objM38314 = m38313(iArr, objArr, i15);
                            if (objM38314 != null) {
                                int i16 = iArr[i15 + 1];
                                if (i13 >= 0) {
                                    if (!m38314(i16, 8, iArr) || iArr[i16 + 2] != i13 || iArr[i16 + 3] != i12 || (z3 && (i12 <= 0 || (i12 & 1) != 0))) {
                                        return null;
                                    }
                                    if (z3 || i12 == 0) {
                                        i8 = z3 ? i12 : 0;
                                    }
                                } else if (z) {
                                    if (!z3 && m38314(i16, 8, iArr) && iArr[i16 + 2] == i5 && (i7 = iArr[(i6 = i16 + 3)]) > 0 && (i7 & 1) == 0 && m38314(iArr[i16 + 1], 23, iArr)) {
                                        i8 = iArr[i6];
                                    }
                                } else if (!z3) {
                                }
                                return new C16292(c8760, objM38314, objM38313, z, false, i8, objM38314 instanceof int[] ? ((int[]) objM38314).length : 1, c8760.f26706);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m38313(int[] iArr, Object[] objArr, int i) {
        if (m38316(i, iArr)) {
            int i2 = iArr[i + 2];
            Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
            int i3 = iArr[i];
            if (i3 == 1) {
                if (obj instanceof InterfaceC10795) {
                    return obj;
                }
            } else if (i3 == 3 && (obj instanceof int[])) {
                int[] iArr2 = (int[]) obj;
                if (iArr2.length != 0) {
                    for (int i4 : iArr2) {
                        if (i4 >= 0 && i4 <= 65535) {
                        }
                    }
                    return iArr2.clone();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38314(int i, int i2, int[] iArr) {
        return m38316(i, iArr) && iArr[i] == i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38316(int i, int[] iArr) {
        return i >= 0 && i % 8 == 0 && i <= iArr.length + (-8);
    }
}
