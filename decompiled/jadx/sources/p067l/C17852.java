package p067l;

/* JADX INFO: renamed from: l.ܽ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17852 {

    /* JADX INFO: renamed from: ֡ */
    public final C10694 f53254;

    /* JADX INFO: renamed from: ֨ */
    public final int f53255;

    /* JADX INFO: renamed from: ֫ */
    public final long f53256;

    /* JADX INFO: renamed from: ۖ */
    public final int f53257;

    /* JADX INFO: renamed from: ۘ */
    public final int f53258;

    /* JADX INFO: renamed from: ۚ */
    public final Object f53259;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f53260;

    /* JADX INFO: renamed from: ۠ */
    public final int f53261;

    /* JADX INFO: renamed from: ۡ */
    public final int f53262;

    /* JADX INFO: renamed from: ۢ */
    public final int f53263;

    /* JADX INFO: renamed from: ۧ */
    public final long f53264;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f53265;

    /* JADX INFO: renamed from: ܶ */
    public final InterfaceC12628 f53266;

    /* JADX INFO: renamed from: ܺ */
    public final boolean f53267;

    /* JADX INFO: renamed from: ܽ */
    public final Object f53268;

    /* JADX INFO: renamed from: ܿ */
    public final int f53269;

    /* JADX INFO: renamed from: ᩳ */
    public final int f53270;

    /* JADX INFO: renamed from: ᩴ */
    public final boolean f53271;

    /* JADX INFO: renamed from: ᩵ */
    public final boolean f53272;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC12628 f53273;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f53274;

    /* JADX INFO: renamed from: ᩹ */
    public final int f53275;

    /* JADX INFO: renamed from: ᩻ */
    public final int f53276;

    public C17852(C10694 c10694, Object obj, Object obj2, boolean z, boolean z2, int i, int i2, int i3) {
        int iM42223;
        char c;
        boolean z3;
        boolean z4;
        this.f53254 = c10694;
        this.f53268 = obj;
        this.f53259 = obj2;
        this.f53265 = z;
        this.f53267 = z2;
        this.f53257 = i;
        this.f53275 = i2;
        this.f53258 = i3;
        boolean z5 = obj instanceof int[];
        int i4 = 2;
        boolean z6 = z5 && ((int[]) obj).length == 2;
        this.f53260 = z6;
        int iM42224 = -1;
        this.f53269 = z6 ? ((int[]) obj)[0] : -1;
        this.f53263 = z6 ? ((int[]) obj)[1] : -1;
        this.f53273 = obj instanceof InterfaceC12628 ? (InterfaceC12628) obj : null;
        this.f53266 = obj2 instanceof InterfaceC12628 ? (InterfaceC12628) obj2 : null;
        this.f53270 = m40527(obj);
        this.f53255 = m40527(obj2);
        if (z5) {
            int[] iArr = (int[]) obj;
            iM42223 = iArr.length == 1 ? iArr[0] : -1;
        } else {
            C7933 c7933 = C16057.f47257;
            iM42223 = C18543.m42223((InterfaceC12628) obj);
        }
        this.f53276 = iM42223;
        if (obj2 instanceof int[]) {
            int[] iArr2 = (int[]) obj2;
            if (iArr2.length == 1) {
                iM42224 = iArr2[0];
            }
        } else {
            C7933 c7934 = C16057.f47257;
            iM42224 = C18543.m42223((InterfaceC12628) obj2);
        }
        this.f53261 = iM42224;
        this.f53272 = c10694 != null && c10694.f29630 && !z && c10694.f29631 < 0 && iM42223 >= 0 && iM42223 < 128 && iM42224 >= 0 && iM42224 < 128 && iM42223 != iM42224;
        if (c10694 == null) {
            c = 0;
            i4 = 0;
        } else {
            EnumC3791 enumC3791 = c10694.f29634;
            boolean z7 = c10694.f29630;
            if (!z7 || z) {
                int i5 = c10694.f29631;
                if (i5 >= 0 || z) {
                    if (i5 >= 0 || !z || !z6 || z7 || enumC3791 != EnumC3791.POSSESSIVE || iM42224 < 0) {
                        i4 = (i5 >= 0 && c10694.f29628 && z6 && iM42224 >= 0 && (enumC3791 == EnumC3791.GREEDY || enumC3791 == EnumC3791.LAZY)) ? 3 : 4;
                    } else {
                        i4 = 6;
                    }
                } else if (iM42223 >= 0 && iM42224 >= 0) {
                    int i6 = C12489.f35013[enumC3791.ordinal()];
                    if (i6 == 1) {
                        i4 = (iM42223 != iM42224 || c10694.f29633 >= 1024) ? 5 : 9;
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
        this.f53262 = i4;
        long j = 0;
        long j2 = 0;
        for (int i7 = 0; i7 < 128; i7++) {
            if (m40530(i7, obj) || (i3 == 0 && m40530(i7, obj2))) {
                if (i7 < 64) {
                    j |= 1 << i7;
                } else {
                    j2 |= 1 << i7;
                }
            }
        }
        this.f53264 = j;
        this.f53256 = j2;
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
        this.f53271 = z3;
        for (int i9 = 56320; i9 <= 57343; i9++) {
            if (m40530(i9, obj2)) {
                z4 = false;
                this.f53274 = z4;
            }
        }
        z4 = true;
        this.f53274 = z4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40533(int i) {
        if (i < 128) {
            return ((i < 64 ? this.f53264 : this.f53256) & (1 << i)) != 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m40527(Object obj) {
        if (!(obj instanceof int[]) || ((int[]) obj).length == 1) {
            int i = -1;
            for (int i2 = 0; i2 < 128; i2++) {
                if (m40530(i2, obj)) {
                    if (i < 0) {
                        i = i2;
                    }
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40530(int i, Object obj) {
        if (obj instanceof int[]) {
            return ((int[]) obj)[0] == i;
        }
        return ((InterfaceC12628) obj).mo4821(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0126, code lost:
    
        if (m40529(r1, 23, r17) != false) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C17852 m40532(int[] iArr, Object[] objArr, int i) {
        int i2;
        int i3;
        Object objM40528;
        int i4;
        EnumC3791 enumC3791;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        if (iArr != null && objArr != null && m40531(i, iArr) && (((i2 = iArr[i]) == 25 || i2 == 4 || i2 == 5) && (objM40528 = m40528(iArr, objArr, (i3 = iArr[i + 1]))) != null && m40529(iArr[i3 + 1], 0, iArr))) {
            if (i2 != 25) {
                int i9 = iArr[i + 2];
                Object obj = (i9 < 0 || i9 >= objArr.length) ? null : objArr[i9];
                int i10 = iArr[i + 3];
                if ((obj instanceof InterfaceC12628) && i10 >= 0) {
                    boolean z2 = i2 == 5 ? 1 : 0;
                    return new C17852(null, obj, objM40528, false, z2, 0, !z2, i10);
                }
            } else {
                int i11 = iArr[i + 2];
                Object obj2 = (i11 < 0 || i11 >= objArr.length) ? null : objArr[i11];
                if (obj2 instanceof C10694) {
                    C10694 c10694 = (C10694) obj2;
                    int i12 = c10694.f29629;
                    boolean z3 = c10694.f29628;
                    int i13 = c10694.f29631;
                    int i14 = c10694.f29632;
                    if (i14 >= 0 && (i4 = c10694.f29633) >= i14 && (enumC3791 = c10694.f29634) != null && enumC3791 != EnumC3791.INDEPENDENT && (!c10694.f29630 || (i14 == 0 && i4 == 1))) {
                        int i15 = iArr[i + 3];
                        if (m40531(i15, iArr)) {
                            if (i13 >= 0 || !m40529(i15, 7, iArr)) {
                                i5 = -1;
                                z = false;
                            } else {
                                i5 = iArr[i15 + 2];
                                if (i5 >= 0) {
                                    i15 = iArr[i15 + 1];
                                    z = true;
                                }
                            }
                            Object objM40529 = m40528(iArr, objArr, i15);
                            if (objM40529 != null) {
                                int i16 = iArr[i15 + 1];
                                if (i13 >= 0) {
                                    if (!m40529(i16, 8, iArr) || iArr[i16 + 2] != i13 || iArr[i16 + 3] != i12 || (z3 && (i12 <= 0 || (i12 & 1) != 0))) {
                                        return null;
                                    }
                                    if (z3 || i12 == 0) {
                                        i8 = z3 ? i12 : 0;
                                    }
                                } else if (z) {
                                    if (!z3 && m40529(i16, 8, iArr) && iArr[i16 + 2] == i5 && (i7 = iArr[(i6 = i16 + 3)]) > 0 && (i7 & 1) == 0 && m40529(iArr[i16 + 1], 23, iArr)) {
                                        i8 = iArr[i6];
                                    }
                                } else if (!z3) {
                                }
                                return new C17852(c10694, objM40529, objM40528, z, false, i8, objM40529 instanceof int[] ? ((int[]) objM40529).length : 1, c10694.f29632);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m40528(int[] iArr, Object[] objArr, int i) {
        if (m40531(i, iArr)) {
            int i2 = iArr[i + 2];
            Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
            int i3 = iArr[i];
            if (i3 == 1) {
                if (obj instanceof InterfaceC12628) {
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40529(int i, int i2, int[] iArr) {
        return m40531(i, iArr) && iArr[i] == i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40531(int i, int[] iArr) {
        return i >= 0 && i % 8 == 0 && i <= iArr.length + (-8);
    }
}
