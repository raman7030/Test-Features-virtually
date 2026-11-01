package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17952 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f53626;

    /* JADX INFO: renamed from: ۧ */
    public final C21307[] f53627;

    /* JADX INFO: renamed from: ܳ */
    public final int f53628;

    /* JADX INFO: renamed from: ܽ */
    public final C24320 f53629;

    /* JADX INFO: renamed from: ܿ */
    public final C21307[] f53630;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f53631;

    /* JADX INFO: renamed from: ᩻ */
    public static final int[] f53625 = new int[0];

    /* JADX INFO: renamed from: ۜ */
    public static final C21307[] f53624 = new C21307[0];

    public /* synthetic */ C17952(C24320 c24320, int i, int[] iArr, C21307[] c21307Arr, int[] iArr2, C21307[] c21307Arr2, int i2) {
        this(c24320, i, iArr, c21307Arr, iArr2, c21307Arr2);
    }

    public C17952(C24320 c24320, int i, int[] iArr, C21307[] c21307Arr, int[] iArr2, C21307[] c21307Arr2) {
        C12826.requireNonNull(c24320, "program");
        this.f53629 = c24320;
        C12826.requireNonNull(iArr, "offsets");
        this.f53626 = iArr;
        C12826.requireNonNull(c21307Arr, "prefixes");
        this.f53627 = c21307Arr;
        this.f53631 = iArr2;
        this.f53630 = c21307Arr2;
        if (i < 0 || iArr.length > 1024 || c21307Arr.length != iArr.length || iArr2.length != iArr.length || c21307Arr2.length != iArr.length) {
            throw new IllegalArgumentException("Invalid syntax window restart index");
        }
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            if (i4 <= i3 || i4 >= i) {
                throw new IllegalArgumentException("Invalid syntax window restart offset");
            }
            i2++;
            i3 = i4;
        }
        this.f53628 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C17952 m40854(C24320 c24320, int i) {
        int[] iArr = f53625;
        C21307[] c21307Arr = f53624;
        return new C17952(c24320, i, iArr, c21307Arr, iArr, c21307Arr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24320 m40865() {
        return this.f53629;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m40866() {
        return this.f53628;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40861(C24320 c24320, int i) {
        C12826.requireNonNull(c24320, "expectedProgram");
        if (this.f53629 != c24320) {
            return -1;
        }
        C12826.checkFromToIndex(i, i, this.f53628);
        int[] iArr = this.f53626;
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            if (iArr[i3] <= i) {
                i2 = i3 + 1;
            } else {
                length = i3 - 1;
            }
        }
        if (length < 0) {
            return -1;
        }
        return iArr[length];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21307 m40864(int i) {
        C21307 c21307;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f53626;
            if (i2 >= iArr.length) {
                return null;
            }
            if (iArr[i2] >= i && (c21307 = this.f53627[i2]) != null) {
                return c21307;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17952 m40863(C16611 c16611) {
        int iM37663 = c16611.m37663();
        int iM37657 = this.f53628;
        if (iM37663 != iM37657) {
            throw new IllegalArgumentException("Restart index and edit lengths differ");
        }
        int[] iArr = this.f53626;
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        C21307[] c21307Arr = new C21307[iArr.length];
        C21307[] c21307Arr2 = new C21307[iArr.length];
        if (!c16611.m37662()) {
            iM37657 = c16611.m37657();
        }
        int i = 0;
        for (int i2 = 0; i2 < iArr.length && iArr[i2] < iM37657; i2++) {
            C21307 c21307 = this.f53627[i2];
            if (c21307 != null && c21307.m48212() == EnumC22648.COMPLETE && !c21307.m48207(c16611)) {
                try {
                    c21307Arr2[i] = c21307.m48210(c16611);
                    iArr3[i] = this.f53631[i2];
                    C21307 c21308 = this.f53630[i2];
                    if (c21308 != null) {
                        try {
                            c21307Arr[i] = c21308.m48210(c16611);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    int i3 = i + 1;
                    try {
                        iArr2[i] = iArr[i2];
                    } catch (IllegalArgumentException unused2) {
                    }
                    i = i3;
                } catch (IllegalArgumentException unused3) {
                }
            }
        }
        return new C17952(this.f53629, c16611.m37665(), Arrays.copyOf(iArr2, i), (C21307[]) Arrays.copyOf(c21307Arr2, i), Arrays.copyOf(iArr3, i), (C21307[]) Arrays.copyOf(c21307Arr, i));
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m40867(C16611 c16611) {
        if (c16611.m37662()) {
            return false;
        }
        int[] iArr = this.f53626;
        return iArr.length != 0 && iArr[iArr.length - 1] > c16611.m37666(c16611.m37660() - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40860(C16611 c16611, int i) {
        int iM37654;
        int iBinarySearch;
        if (c16611.m37662() || i <= c16611.m37658(c16611.m37660() - 1) || (iBinarySearch = Arrays.binarySearch(this.f53626, (iM37654 = c16611.m37654(i, EnumC3200.AFTER)))) < 0 || iM37654 <= c16611.m37666(c16611.m37660() - 1)) {
            return -1;
        }
        return iBinarySearch;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3871 m40862(C16611 c16611, int i, C17952 c17952, C21307 c21307, int i2, C21307 c21308) {
        C21307 c21309;
        int[] iArr;
        int i3;
        int[] iArr2 = this.f53626;
        int i4 = iArr2[i];
        C12589 c12589 = new C12589(this.f53629, c16611.m37665(), 0, c17952);
        C23318 c23318 = new C23318(c16611.m37665());
        c23318.m51937(c21307);
        c12589.m28998(c16611.m37659(i4, EnumC3200.AFTER), c21307, i2, c21308);
        int i5 = i4;
        for (int i6 = i + 1; i6 < iArr2.length && (c21309 = this.f53630[i6]) != null && (i3 = (iArr = this.f53631)[i6]) >= i4 && i3 <= i5; i6++) {
            try {
                C21307 c21307M48205 = c21309.m48205(c16611, i3);
                int i7 = iArr[i6];
                EnumC3200 enumC3200 = EnumC3200.AFTER;
                int iM37659 = c16611.m37659(i7, enumC3200);
                int iM376510 = c16611.m37659(iArr2[i6], enumC3200);
                c23318.m51937(c21307M48205);
                c12589.m28998(iM376510, c23318.m51939(), iM37659, c21307M48205);
                i5 = iArr2[i6];
            } catch (IllegalArgumentException unused) {
            }
        }
        return new C3871(c12589.m29002(), i4, i5);
    }
}
