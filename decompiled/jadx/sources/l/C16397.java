package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16397 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f50454;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19927[] f50455;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f50456;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23097 f50457;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19927[] f50458;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f50459;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f50453 = new int[0];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C19927[] f50452 = new C19927[0];

    public /* synthetic */ C16397(C23097 c23097, int i, int[] iArr, C19927[] c19927Arr, int[] iArr2, C19927[] c19927Arr2, int i2) {
        this(c23097, i, iArr, c19927Arr, iArr2, c19927Arr2);
    }

    public C16397(C23097 c23097, int i, int[] iArr, C19927[] c19927Arr, int[] iArr2, C19927[] c19927Arr2) {
        C11003.requireNonNull(c23097, "program");
        this.f50457 = c23097;
        C11003.requireNonNull(iArr, "offsets");
        this.f50454 = iArr;
        C11003.requireNonNull(c19927Arr, "prefixes");
        this.f50455 = c19927Arr;
        this.f50459 = iArr2;
        this.f50458 = c19927Arr2;
        if (i < 0 || iArr.length > 1024 || c19927Arr.length != iArr.length || iArr2.length != iArr.length || c19927Arr2.length != iArr.length) {
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
        this.f50456 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16397 m38638(C23097 c23097, int i) {
        int[] iArr = f50453;
        C19927[] c19927Arr = f50452;
        return new C16397(c23097, i, iArr, c19927Arr, iArr, c19927Arr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23097 m38649() {
        return this.f50457;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38650() {
        return this.f50456;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38645(C23097 c23097, int i) {
        C11003.requireNonNull(c23097, "expectedProgram");
        if (this.f50457 != c23097) {
            return -1;
        }
        C11003.checkFromToIndex(i, i, this.f50456);
        int[] iArr = this.f50454;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19927 m38648(int i) {
        C19927 c19927;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f50454;
            if (i2 >= iArr.length) {
                return null;
            }
            if (iArr[i2] >= i && (c19927 = this.f50455[i2]) != null) {
                return c19927;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16397 m38647(C14986 c14986) {
        int iM35507 = c14986.m35507();
        int iM35501 = this.f50456;
        if (iM35507 != iM35501) {
            throw new IllegalArgumentException("Restart index and edit lengths differ");
        }
        int[] iArr = this.f50454;
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        C19927[] c19927Arr = new C19927[iArr.length];
        C19927[] c19927Arr2 = new C19927[iArr.length];
        if (!c14986.m35506()) {
            iM35501 = c14986.m35501();
        }
        int i = 0;
        for (int i2 = 0; i2 < iArr.length && iArr[i2] < iM35501; i2++) {
            C19927 c19927 = this.f50455[i2];
            if (c19927 != null && c19927.m45899() == EnumC21338.COMPLETE && !c19927.m45894(c14986)) {
                try {
                    c19927Arr2[i] = c19927.m45897(c14986);
                    iArr3[i] = this.f50459[i2];
                    C19927 c19928 = this.f50458[i2];
                    if (c19928 != null) {
                        try {
                            c19927Arr[i] = c19928.m45897(c14986);
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
        return new C16397(this.f50457, c14986.m35509(), Arrays.copyOf(iArr2, i), (C19927[]) Arrays.copyOf(c19927Arr2, i), Arrays.copyOf(iArr3, i), (C19927[]) Arrays.copyOf(c19927Arr, i));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38651(C14986 c14986) {
        if (c14986.m35506()) {
            return false;
        }
        int[] iArr = this.f50454;
        return iArr.length != 0 && iArr[iArr.length - 1] > c14986.m35510(c14986.m35504() - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38644(C14986 c14986, int i) {
        int iM35498;
        int iBinarySearch;
        if (c14986.m35506() || i <= c14986.m35502(c14986.m35504() - 1) || (iBinarySearch = Arrays.binarySearch(this.f50454, (iM35498 = c14986.m35498(i, EnumC0875.AFTER)))) < 0 || iM35498 <= c14986.m35510(c14986.m35504() - 1)) {
            return -1;
        }
        return iBinarySearch;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1581 m38646(C14986 c14986, int i, C16397 c16397, C19927 c19927, int i2, C19927 c19928) {
        C19927 c19929;
        int[] iArr;
        int i3;
        int[] iArr2 = this.f50454;
        int i4 = iArr2[i];
        C10754 c10754 = new C10754(this.f50457, c14986.m35509(), 0, c16397);
        C22043 c22043 = new C22043(c14986.m35509());
        c22043.m49601(c19927);
        c10754.m26954(c14986.m35503(i4, EnumC0875.AFTER), c19927, i2, c19928);
        int i5 = i4;
        for (int i6 = i + 1; i6 < iArr2.length && (c19929 = this.f50458[i6]) != null && (i3 = (iArr = this.f50459)[i6]) >= i4 && i3 <= i5; i6++) {
            try {
                C19927 c19927M45892 = c19929.m45892(c14986, i3);
                int i7 = iArr[i6];
                EnumC0875 enumC0875 = EnumC0875.AFTER;
                int iM35503 = c14986.m35503(i7, enumC0875);
                int iM35504 = c14986.m35503(iArr2[i6], enumC0875);
                c22043.m49601(c19927M45892);
                c10754.m26954(iM35504, c22043.m49603(), iM35503, c19927M45892);
                i5 = iArr2[i6];
            } catch (IllegalArgumentException unused) {
            }
        }
        return new C1581(c10754.m26958(), i4, i5);
    }
}
