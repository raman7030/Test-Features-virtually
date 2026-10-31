package l;

/* JADX INFO: renamed from: l.ۤ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70C */
/* JADX INFO: loaded from: classes3.dex */
public final class C10545 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C12661 f31659;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f31660;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23097 f31661;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C12661 f31662;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int[] f31663;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f31664;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f31665;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f31666;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f31667;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f31668;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19927[] f31669;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f31670;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f31671;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int[] f31658 = new int[0];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C19927[] f31657 = new C19927[0];

    static {
        int[] iArr = new int[0];
        f31659 = new C12661(0, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, null, iArr, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public C10545(C23097 c23097, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, C19927[] c19927Arr, C12661 c12661, boolean z) {
        int i3;
        int i4;
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        int length = iArr.length;
        if (i2 < 0 || i2 > length || iArr2.length != length || iArr3.length != length || iArr4.length != length || c19927Arr.length != length) {
            throw new IllegalArgumentException("Checkpoint columns have different sizes");
        }
        C11003.requireNonNull(c23097, "program");
        this.f31661 = c23097;
        this.f31666 = i;
        this.f31668 = i2;
        this.f31671 = iArr;
        this.f31665 = iArr2;
        this.f31667 = iArr3;
        this.f31663 = iArr4;
        this.f31664 = iArr5;
        this.f31660 = iArr6;
        this.f31669 = c19927Arr;
        C11003.requireNonNull(c12661, "states");
        int i5 = c12661.f38158;
        this.f31662 = c12661;
        this.f31670 = z;
        if (i5 != 0 && c12661.m30941() != c23097.m51273()) {
            throw new IllegalArgumentException("Checkpoint end-proof sidecar differs from program");
        }
        if (i5 != 0 && c12661.m30940() != c23097.m51270()) {
            throw new IllegalArgumentException("Checkpoint embedded sidecar differs from program");
        }
        boolean z2 = (iArr5 == null && iArr6 == null) ? false : true;
        if ((z2 && (iArr5 == null || iArr6 == null || iArr5.length != length || iArr6.length != length)) || (i2 != 0 && c12661.m30940() != z2)) {
            throw new IllegalArgumentException("Checkpoint context columns differ from program");
        }
        if (c12661.m30941()) {
            for (int i6 = 0; i6 < i5; i6++) {
                C19927[] c19927Arr2 = c12661.f38165;
                C19927 c19927 = c19927Arr2 == null ? null : c19927Arr2[i6];
                if (c19927 != null && c19927.m45903() != i) {
                    throw new IllegalArgumentException("Checkpoint end proof length differs");
                }
            }
        }
        int i7 = 0;
        int i8 = -1;
        while (i7 < i2) {
            int i9 = iArr[i7];
            if (i9 <= i8 || i9 < 0 || i9 >= i || (i3 = iArr2[i7]) < 0 || i3 > i9 || (i4 = iArr3[i7]) < 0 || i4 > i9) {
                throw new IllegalArgumentException("Invalid syntax checkpoint entry");
            }
            C19927 c19928 = c19927Arr[i7];
            if (c19928 == null) {
                throw new NullPointerException(C18307.m42645(i7, "dependencies[", "]"));
            }
            if (c19928.m45903() != i) {
                throw new IllegalArgumentException("Checkpoint dependency length differs");
            }
            C11003.checkIndex(iArr4[i7], i5);
            if (z2 && (iArr5[i7] < 1 || iArr6[i7] < 0)) {
                throw new IllegalArgumentException("Invalid syntax checkpoint context state");
            }
            i7++;
            i8 = i9;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10545 m26476(C23097 c23097, int i, boolean z) {
        int[] iArr = f31658;
        return new C10545(c23097, i, 0, iArr, iArr, iArr, iArr, null, null, f31657, f31659, z);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m26496() {
        return this.f31666;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m26520() {
        return this.f31668;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m26531(int i) {
        return this.f31671[C11003.checkIndex(i, this.f31668)];
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m26513(int i) {
        return this.f31662.f38159[this.f31663[C11003.checkIndex(i, this.f31668)]];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m26517() {
        return this.f31662.f38158;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m26530() {
        C12661 c12661 = this.f31662;
        return C12661.m30939(c12661.m30941(), c12661.m30940());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26485() {
        return this.f31671.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26487(C14986 c14986, int i) {
        int[] iArr;
        C11003.requireNonNull(c14986, "changes");
        if (c14986.m35507() != this.f31666) {
            throw new IllegalArgumentException("Checkpoint index and change set lengths differ");
        }
        if (this.f31670 || c14986.m35506()) {
            return -1;
        }
        int iM35501 = c14986.m35501();
        int i2 = this.f31668 - 1;
        int i3 = 0;
        while (true) {
            iArr = this.f31671;
            if (i3 > i2) {
                break;
            }
            int i4 = (i3 + i2) >>> 1;
            if (iArr[i4] < iM35501) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        while (i2 >= 0 && iArr[i2] > i) {
            int iM26525 = m26525(i2);
            int[] iArr2 = this.f31662.f38149;
            int i5 = iArr2 == null ? 0 : iArr2[iM26525];
            if ((i5 & 8) == 0 || (i5 & 16) != 0) {
                C19927 c19927 = this.f31669[i2];
                if (this.f31665[i2] == i && c19927.m45899() == EnumC21338.COMPLETE && !c19927.m45894(c14986)) {
                    return i2;
                }
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26488(C23097 c23097, int i) {
        C11003.requireNonNull(c23097, "expectedProgram");
        if (this.f31661 != c23097) {
            return -1;
        }
        C11003.checkFromToIndex(i, i, this.f31666);
        int i2 = this.f31668 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f31671[i4] <= i) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        while (i2 >= 0) {
            int iM26525 = m26525(i2);
            int[] iArr = this.f31662.f38149;
            int i5 = iArr == null ? 0 : iArr[iM26525];
            if (((i5 & 8) == 0 || (i5 & 16) != 0) && this.f31669[i2].m45899() == EnumC21338.COMPLETE) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m26518(int i) {
        return this.f31665[C11003.checkIndex(i, this.f31668)];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23097 m26515() {
        return this.f31661;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m26504() {
        return this.f31670;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m26511(int i) {
        int iM26525 = m26525(i);
        int[] iArr = this.f31662.f38149;
        return ((iArr == null ? 0 : iArr[iM26525]) & 8) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m26514(int i) {
        return this.f31667[C11003.checkIndex(i, this.f31668)];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19927 m26521(int i) {
        return this.f31669[C11003.checkIndex(i, this.f31668)];
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m26525(int i) {
        return this.f31663[C11003.checkIndex(i, this.f31668)];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26503(int i) {
        C11003.checkIndex(i, this.f31668);
        int[] iArr = this.f31664;
        if (iArr == null) {
            return 1;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26486(int i) {
        C11003.checkIndex(i, this.f31668);
        int[] iArr = this.f31660;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m26509(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38144[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m26508(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38150[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m26498(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38157[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m26502(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38169[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int m26489(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38156[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m26528(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38140[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int m26516(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38148[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int m26505(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38153[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m26507(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38160[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m26495(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38170[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int m26522(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38155[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final int m26519(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38171[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26526(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38162[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m26506(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38167[C11003.checkIndex(i, c12661.f38158)];
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m26529(int i) {
        C12661 c12661 = this.f31662;
        return c12661.f38146[C11003.checkIndex(i, c12661.f38158)];
    }

    public final boolean equals(Object obj) {
        boolean zM26481;
        boolean zM26482;
        if (this != obj) {
            if (obj instanceof C10545) {
                C10545 c10545 = (C10545) obj;
                C19927[] c19927Arr = c10545.f31669;
                if (this.f31661 == c10545.f31661 && this.f31666 == c10545.f31666) {
                    int i = c10545.f31668;
                    int i2 = this.f31668;
                    if (i2 == i && this.f31670 == c10545.f31670 && m26481(i2, this.f31671, c10545.f31671) && m26481(i2, this.f31665, c10545.f31665) && m26481(i2, this.f31667, c10545.f31667) && m26481(i2, this.f31663, c10545.f31663)) {
                        int[] iArr = c10545.f31664;
                        int[] iArr2 = this.f31664;
                        if (iArr2 == null || iArr == null) {
                            zM26481 = iArr2 == iArr;
                        } else {
                            zM26481 = m26481(i2, iArr2, iArr);
                        }
                        if (zM26481) {
                            int[] iArr3 = c10545.f31660;
                            int[] iArr4 = this.f31660;
                            if (iArr4 == null || iArr3 == null) {
                                zM26482 = iArr4 == iArr3;
                            } else {
                                zM26482 = m26481(i2, iArr4, iArr3);
                            }
                            if (zM26482 && this.f31662.equals(c10545.f31662) && i2 <= c19927Arr.length) {
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if (m26482(this.f31669[i3], c19927Arr[i3])) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iIdentityHashCode = ((((System.identityHashCode(this.f31661) * 31) + this.f31666) * 31) + (this.f31670 ? 1231 : 1237)) * 31;
        int i = this.f31668;
        int iM26479 = (((((((((iIdentityHashCode + i) * 31) + m26479(i, this.f31671)) * 31) + m26479(i, this.f31665)) * 31) + m26479(i, this.f31667)) * 31) + m26479(i, this.f31663)) * 31;
        int[] iArr = this.f31664;
        int iM264710 = (iM26479 + (iArr == null ? 0 : m26479(i, iArr))) * 31;
        int[] iArr2 = this.f31660;
        int iM264711 = ((iM264710 + (iArr2 == null ? 0 : m26479(i, iArr2))) * 31) + this.f31662.hashCode();
        for (int i2 = 0; i2 < i; i2++) {
            iM264711 = (iM264711 * 31) + m26480(this.f31669[i2]);
        }
        return iM264711;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m26481(int i, int[] iArr, int[] iArr2) {
        if (i > iArr.length || i > iArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m26479(int i, int[] iArr) {
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m26482(C19927 c19927, C19927 c19928) {
        return c19927.m45903() == c19928.m45903() && c19927.m45898() == c19928.m45898() && c19927.m45900() == c19928.m45900() && c19927.m45896() == c19928.m45896() && c19927.m45891() == c19928.m45891() && c19927.m45901() == c19928.m45901() && c19927.m45899() == c19928.m45899();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m26480(C19927 c19927) {
        return c19927.m45899().hashCode() + ((((c19927.m45891() + ((c19927.m45896() + ((c19927.m45900() + ((c19927.m45898() + (c19927.m45903() * 31)) * 31)) * 31)) * 31)) * 31) + (c19927.m45901() ? 1231 : 1237)) * 31);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m26483(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38151;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m26484(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38143;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m26490(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38172;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m26491(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38141;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m26492(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38149;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26493(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38147;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m26494(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38161;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m26497(int i) {
        C12661 c12661 = this.f31662;
        C11003.checkIndex(i, c12661.f38158);
        return ((((long) c12661.f38142[i]) & 4294967295L) << 32) | (4294967295L & ((long) c12661.f38154[i]));
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m26499(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38145;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m26500(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38163;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m26501(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38164;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C19927 m26512(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        C19927[] c19927Arr = c12661.f38165;
        if (c19927Arr == null) {
            return null;
        }
        return c19927Arr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m26523(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38168;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m26524(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38152;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m26527(int i) {
        C12661 c12661 = this.f31662;
        int iCheckIndex = C11003.checkIndex(i, c12661.f38158);
        int[] iArr = c12661.f38166;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m26510() {
        C12661 c12661 = this.f31662;
        long length = ((long) c12661.f38144.length) * ((long) C12661.m30939(c12661.m30941(), c12661.m30940()));
        int i = (int) length;
        if (length == i) {
            return i;
        }
        throw new ArithmeticException();
    }
}
