package p067l;

/* JADX INFO: renamed from: l.ۤ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70C */
/* JADX INFO: loaded from: classes3.dex */
public final class C12391 {

    /* JADX INFO: renamed from: ᩴ */
    public static final C14402 f34623;

    /* JADX INFO: renamed from: ֫ */
    public final int[] f34624;

    /* JADX INFO: renamed from: ۜ */
    public final C24320 f34625;

    /* JADX INFO: renamed from: ۡ */
    public final C14402 f34626;

    /* JADX INFO: renamed from: ۢ */
    public final int[] f34627;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f34628;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f34629;

    /* JADX INFO: renamed from: ܺ */
    public final int f34630;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f34631;

    /* JADX INFO: renamed from: ܿ */
    public final int f34632;

    /* JADX INFO: renamed from: ᩳ */
    public final C21307[] f34633;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f34634;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f34635;

    /* JADX INFO: renamed from: ۘ */
    public static final int[] f34622 = new int[0];

    /* JADX INFO: renamed from: ۖ */
    public static final C21307[] f34621 = new C21307[0];

    static {
        int[] iArr = new int[0];
        f34623 = new C14402(0, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, iArr, null, iArr, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public C12391(C24320 c24320, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, C21307[] c21307Arr, C14402 c14402, boolean z) {
        int i3;
        int i4;
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        int length = iArr.length;
        if (i2 < 0 || i2 > length || iArr2.length != length || iArr3.length != length || iArr4.length != length || c21307Arr.length != length) {
            throw new IllegalArgumentException("Checkpoint columns have different sizes");
        }
        C12826.requireNonNull(c24320, "program");
        this.f34625 = c24320;
        this.f34630 = i;
        this.f34632 = i2;
        this.f34635 = iArr;
        this.f34629 = iArr2;
        this.f34631 = iArr3;
        this.f34627 = iArr4;
        this.f34628 = iArr5;
        this.f34624 = iArr6;
        this.f34633 = c21307Arr;
        C12826.requireNonNull(c14402, "states");
        int i5 = c14402.f41185;
        this.f34626 = c14402;
        this.f34634 = z;
        if (i5 != 0 && c14402.m33019() != c24320.m53667()) {
            throw new IllegalArgumentException("Checkpoint end-proof sidecar differs from program");
        }
        if (i5 != 0 && c14402.m33018() != c24320.m53664()) {
            throw new IllegalArgumentException("Checkpoint embedded sidecar differs from program");
        }
        boolean z2 = (iArr5 == null && iArr6 == null) ? false : true;
        if ((z2 && (iArr5 == null || iArr6 == null || iArr5.length != length || iArr6.length != length)) || (i2 != 0 && c14402.m33018() != z2)) {
            throw new IllegalArgumentException("Checkpoint context columns differ from program");
        }
        if (c14402.m33019()) {
            for (int i6 = 0; i6 < i5; i6++) {
                C21307[] c21307Arr2 = c14402.f41192;
                C21307 c21307 = c21307Arr2 == null ? null : c21307Arr2[i6];
                if (c21307 != null && c21307.m48216() != i) {
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
            C21307 c21308 = c21307Arr[i7];
            if (c21308 == null) {
                throw new NullPointerException(C19768.m44906(i7, "dependencies[", "]"));
            }
            if (c21308.m48216() != i) {
                throw new IllegalArgumentException("Checkpoint dependency length differs");
            }
            C12826.checkIndex(iArr4[i7], i5);
            if (z2 && (iArr5[i7] < 1 || iArr6[i7] < 0)) {
                throw new IllegalArgumentException("Invalid syntax checkpoint context state");
            }
            i7++;
            i8 = i9;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12391 m28509(C24320 c24320, int i, boolean z) {
        int[] iArr = f34622;
        return new C12391(c24320, i, 0, iArr, iArr, iArr, iArr, null, null, f34621, f34623, z);
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m28529() {
        return this.f34630;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m28553() {
        return this.f34632;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m28564(int i) {
        return this.f34635[C12826.checkIndex(i, this.f34632)];
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m28546(int i) {
        return this.f34626.f41186[this.f34627[C12826.checkIndex(i, this.f34632)]];
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m28550() {
        return this.f34626.f41185;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m28563() {
        C14402 c14402 = this.f34626;
        return C14402.m33017(c14402.m33019(), c14402.m33018());
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28518() {
        return this.f34635.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28520(C16611 c16611, int i) {
        int[] iArr;
        C12826.requireNonNull(c16611, "changes");
        if (c16611.m37663() != this.f34630) {
            throw new IllegalArgumentException("Checkpoint index and change set lengths differ");
        }
        if (this.f34634 || c16611.m37662()) {
            return -1;
        }
        int iM37657 = c16611.m37657();
        int i2 = this.f34632 - 1;
        int i3 = 0;
        while (true) {
            iArr = this.f34635;
            if (i3 > i2) {
                break;
            }
            int i4 = (i3 + i2) >>> 1;
            if (iArr[i4] < iM37657) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        while (i2 >= 0 && iArr[i2] > i) {
            int iM28558 = m28558(i2);
            int[] iArr2 = this.f34626.f41176;
            int i5 = iArr2 == null ? 0 : iArr2[iM28558];
            if ((i5 & 8) == 0 || (i5 & 16) != 0) {
                C21307 c21307 = this.f34633[i2];
                if (this.f34629[i2] == i && c21307.m48212() == EnumC22648.COMPLETE && !c21307.m48207(c16611)) {
                    return i2;
                }
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28521(C24320 c24320, int i) {
        C12826.requireNonNull(c24320, "expectedProgram");
        if (this.f34625 != c24320) {
            return -1;
        }
        C12826.checkFromToIndex(i, i, this.f34630);
        int i2 = this.f34632 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f34635[i4] <= i) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        while (i2 >= 0) {
            int iM28558 = m28558(i2);
            int[] iArr = this.f34626.f41176;
            int i5 = iArr == null ? 0 : iArr[iM28558];
            if (((i5 & 8) == 0 || (i5 & 16) != 0) && this.f34633[i2].m48212() == EnumC22648.COMPLETE) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m28551(int i) {
        return this.f34629[C12826.checkIndex(i, this.f34632)];
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24320 m28548() {
        return this.f34625;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m28537() {
        return this.f34634;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m28544(int i) {
        int iM28558 = m28558(i);
        int[] iArr = this.f34626.f41176;
        return ((iArr == null ? 0 : iArr[iM28558]) & 8) != 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m28547(int i) {
        return this.f34631[C12826.checkIndex(i, this.f34632)];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C21307 m28554(int i) {
        return this.f34633[C12826.checkIndex(i, this.f34632)];
    }

    /* JADX INFO: renamed from: ᩶ */
    public final int m28558(int i) {
        return this.f34627[C12826.checkIndex(i, this.f34632)];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m28536(int i) {
        C12826.checkIndex(i, this.f34632);
        int[] iArr = this.f34628;
        if (iArr == null) {
            return 1;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28519(int i) {
        C12826.checkIndex(i, this.f34632);
        int[] iArr = this.f34624;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ܰ */
    public final int m28542(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41171[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ۬ */
    public final int m28541(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41177[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ۟ */
    public final int m28531(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41184[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ۤ */
    public final int m28535(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41196[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final int m28522(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41183[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ᩹ */
    public final int m28561(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41167[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final int m28549(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41175[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final int m28538(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41180[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ۫ */
    public final int m28540(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41187[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ۛ */
    public final int m28528(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41197[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int m28555(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41182[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final int m28552(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41198[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m28559(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41189[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ۨ */
    public final int m28539(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41194[C12826.checkIndex(i, c14402.f41185)];
    }

    /* JADX INFO: renamed from: ᩺ */
    public final int m28562(int i) {
        C14402 c14402 = this.f34626;
        return c14402.f41173[C12826.checkIndex(i, c14402.f41185)];
    }

    public final boolean equals(Object obj) {
        boolean zM28514;
        boolean zM28515;
        if (this != obj) {
            if (obj instanceof C12391) {
                C12391 c12391 = (C12391) obj;
                C21307[] c21307Arr = c12391.f34633;
                if (this.f34625 == c12391.f34625 && this.f34630 == c12391.f34630) {
                    int i = c12391.f34632;
                    int i2 = this.f34632;
                    if (i2 == i && this.f34634 == c12391.f34634 && m28514(i2, this.f34635, c12391.f34635) && m28514(i2, this.f34629, c12391.f34629) && m28514(i2, this.f34631, c12391.f34631) && m28514(i2, this.f34627, c12391.f34627)) {
                        int[] iArr = c12391.f34628;
                        int[] iArr2 = this.f34628;
                        if (iArr2 == null || iArr == null) {
                            zM28514 = iArr2 == iArr;
                        } else {
                            zM28514 = m28514(i2, iArr2, iArr);
                        }
                        if (zM28514) {
                            int[] iArr3 = c12391.f34624;
                            int[] iArr4 = this.f34624;
                            if (iArr4 == null || iArr3 == null) {
                                zM28515 = iArr4 == iArr3;
                            } else {
                                zM28515 = m28514(i2, iArr4, iArr3);
                            }
                            if (zM28515 && this.f34626.equals(c12391.f34626) && i2 <= c21307Arr.length) {
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if (m28515(this.f34633[i3], c21307Arr[i3])) {
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
        int iIdentityHashCode = ((((System.identityHashCode(this.f34625) * 31) + this.f34630) * 31) + (this.f34634 ? 1231 : 1237)) * 31;
        int i = this.f34632;
        int iM28512 = (((((((((iIdentityHashCode + i) * 31) + m28512(i, this.f34635)) * 31) + m28512(i, this.f34629)) * 31) + m28512(i, this.f34631)) * 31) + m28512(i, this.f34627)) * 31;
        int[] iArr = this.f34628;
        int iM28513 = (iM28512 + (iArr == null ? 0 : m28512(i, iArr))) * 31;
        int[] iArr2 = this.f34624;
        int iM28514 = ((iM28513 + (iArr2 == null ? 0 : m28512(i, iArr2))) * 31) + this.f34626.hashCode();
        for (int i2 = 0; i2 < i; i2++) {
            iM28514 = (iM28514 * 31) + m28513(this.f34633[i2]);
        }
        return iM28514;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m28514(int i, int[] iArr, int[] iArr2) {
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

    /* JADX INFO: renamed from: ۧ */
    public static int m28512(int i, int[] iArr) {
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m28515(C21307 c21307, C21307 c21308) {
        return c21307.m48216() == c21308.m48216() && c21307.m48211() == c21308.m48211() && c21307.m48213() == c21308.m48213() && c21307.m48209() == c21308.m48209() && c21307.m48204() == c21308.m48204() && c21307.m48214() == c21308.m48214() && c21307.m48212() == c21308.m48212();
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m28513(C21307 c21307) {
        return c21307.m48212().hashCode() + ((((c21307.m48204() + ((c21307.m48209() + ((c21307.m48213() + ((c21307.m48211() + (c21307.m48216() * 31)) * 31)) * 31)) * 31)) * 31) + (c21307.m48214() ? 1231 : 1237)) * 31);
    }

    /* JADX INFO: renamed from: ֡ */
    public final int m28516(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41178;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m28517(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41170;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m28523(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41199;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۗ */
    public final int m28524(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41168;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m28525(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41176;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۙ */
    public final int m28526(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41174;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۚ */
    public final int m28527(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41188;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m28530(int i) {
        C14402 c14402 = this.f34626;
        C12826.checkIndex(i, c14402.f41185);
        return ((((long) c14402.f41169[i]) & 4294967295L) << 32) | (4294967295L & ((long) c14402.f41181[i]));
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m28532(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41172;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m28533(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41190;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m28534(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41191;
        if (iArr == null) {
            return 0;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ܶ */
    public final C21307 m28545(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        C21307[] c21307Arr = c14402.f41192;
        if (c21307Arr == null) {
            return null;
        }
        return c21307Arr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m28556(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41195;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m28557(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41179;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ᩸ */
    public final int m28560(int i) {
        C14402 c14402 = this.f34626;
        int iCheckIndex = C12826.checkIndex(i, c14402.f41185);
        int[] iArr = c14402.f41193;
        if (iArr == null) {
            return -1;
        }
        return iArr[iCheckIndex];
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m28543() {
        C14402 c14402 = this.f34626;
        long length = ((long) c14402.f41171.length) * ((long) C14402.m33017(c14402.m33019(), c14402.m33018()));
        int i = (int) length;
        if (length == i) {
            return i;
        }
        throw new ArithmeticException();
    }
}
