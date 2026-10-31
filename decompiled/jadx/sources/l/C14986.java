package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J703 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14986 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f45687;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f45688;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f45689;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f45690;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f45691;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f45692;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f45693;

    public C14986(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z) {
        this.f45689 = i;
        this.f45690 = i2;
        this.f45693 = iArr;
        this.f45691 = iArr2;
        this.f45692 = iArr3;
        this.f45688 = iArr4;
        this.f45687 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14986 m35494(int i, C7931... c7931Arr) {
        int i2;
        C7931[] c7931Arr2 = c7931Arr;
        if (i < 0) {
            throw new IllegalArgumentException("Old length must not be negative");
        }
        C11003.requireNonNull(c7931Arr2, "edits");
        long j = i;
        int i3 = 0;
        int i4 = -1;
        boolean z = false;
        for (C7931 c7931 : c7931Arr2) {
            m35495(c7931, i);
            if (c7931.f24554 != c7931.f24553 || c7931.f24552 != 0) {
                if (c7931.f24554 < i4) {
                    throw new IllegalArgumentException("Edits must be ordered and non-overlapping");
                }
                if (c7931.f24554 != i4) {
                    i3++;
                }
                i4 = c7931.f24553;
                long j2 = (((long) c7931.f24552) - ((long) (c7931.f24553 - c7931.f24554))) + j;
                z = (c7931.f24553 == i) | z;
                j = j2;
            }
        }
        long j3 = 0;
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("New length exceeds the supported range");
        }
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int length = c7931Arr2.length;
        int i5 = 0;
        int i6 = -1;
        while (i5 < length) {
            C7931 c7932 = c7931Arr2[i5];
            if (c7932.f24554 == c7932.f24553 && c7932.f24552 == 0) {
                i2 = length;
            } else {
                long j4 = ((long) c7932.f24554) + j3;
                long j5 = ((long) c7932.f24552) + j4;
                if (i6 >= 0) {
                    i2 = length;
                    if (iArr2[i6] == c7932.f24554) {
                        iArr2[i6] = c7932.f24553;
                        iArr4[i6] = (int) j5;
                    }
                    j3 = (((long) c7932.f24552) - ((long) (c7932.f24553 - c7932.f24554))) + j3;
                } else {
                    i2 = length;
                }
                i6++;
                iArr[i6] = c7932.f24554;
                iArr2[i6] = c7932.f24553;
                iArr3[i6] = (int) j4;
                iArr4[i6] = (int) j5;
                j3 = (((long) c7932.f24552) - ((long) (c7932.f24553 - c7932.f24554))) + j3;
            }
            i5++;
            c7931Arr2 = c7931Arr;
            z = z;
            j = j;
            length = i2;
        }
        long j6 = j;
        boolean z2 = z;
        for (int i7 = 0; i7 < i3 && !z2; i7++) {
            z2 = iArr2[i7] - iArr[i7] != iArr4[i7] - iArr3[i7];
        }
        return new C14986(i, (int) j6, iArr, iArr2, iArr3, iArr4, z2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14986 m35499(C7931 c7931) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int iM35498;
        int iM35499;
        int i = this.f45690;
        m35495(c7931, i);
        if ((((long) i) + ((long) c7931.f24552)) - ((long) (c7931.f24553 - c7931.f24554)) > 2147483647L) {
            throw new IllegalArgumentException("New length exceeds the supported range");
        }
        if (c7931.f24554 == c7931.f24553 && c7931.f24552 == 0) {
            return m35496();
        }
        int i2 = 0;
        while (true) {
            iArr = this.f45693;
            int length = iArr.length;
            iArr2 = this.f45688;
            if (i2 >= length || iArr2[i2] >= c7931.f24554) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        while (true) {
            int length2 = iArr.length;
            iArr3 = this.f45692;
            if (i3 >= length2 || iArr3[i3] > c7931.f24553) {
                break;
            }
            i3++;
        }
        int iMin = c7931.f24554;
        int iMax = c7931.f24553;
        int[] iArr4 = this.f45691;
        if (i2 < i3) {
            iMin = Math.min(iMin, iArr3[i2]);
            int i4 = i3 - 1;
            iMax = Math.max(iMax, iArr2[i4]);
            iM35498 = Math.min(iArr[i2], m35498(iMin, EnumC0875.BEFORE));
            iM35499 = Math.max(iArr4[i4], m35498(iMax, EnumC0875.AFTER));
        } else {
            iM35498 = m35498(iMin, EnumC0875.BEFORE);
            iM35499 = m35498(iMax, EnumC0875.AFTER);
        }
        long j = ((((long) iMax) - ((long) iMin)) - ((long) (c7931.f24553 - c7931.f24554))) + ((long) c7931.f24552);
        int i5 = (int) j;
        if (j != i5) {
            throw new ArithmeticException();
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        for (int i6 = 0; i6 < i2; i6++) {
            arrayList.add(new C7931(iArr[i6], iArr4[i6], iArr2[i6] - iArr3[i6]));
        }
        arrayList.add(new C7931(iM35498, iM35499, i5));
        while (i3 < iArr.length) {
            arrayList.add(new C7931(iArr[i3], iArr4[i3], iArr2[i3] - iArr3[i3]));
            i3++;
        }
        return m35494(this.f45689, (C7931[]) arrayList.toArray(new C7931[0])).m35496();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m35507() {
        return this.f45689;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m35509() {
        return this.f45690;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C14986 m35496() {
        int[] iArr = this.f45693;
        if (iArr.length <= 64) {
            return this;
        }
        int length = iArr.length - 1;
        return m35494(this.f45689, new C7931(iArr[0], this.f45691[length], this.f45688[length] - this.f45692[0]));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m35504() {
        return this.f45693.length;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m35506() {
        return this.f45693.length == 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m35501() {
        int[] iArr = this.f45693;
        if (iArr.length == 0) {
            return -1;
        }
        return iArr[0];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m35508(int i) {
        return this.f45693[i];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m35510(int i) {
        return this.f45691[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35497(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f45691, i);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m35505(int i) {
        return this.f45692[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m35502(int i) {
        return this.f45688[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m35503(int i, EnumC0875 enumC0875) {
        return m35493(i, enumC0875, this.f45689, this.f45693, this.f45691, this.f45692, this.f45688);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35498(int i, EnumC0875 enumC0875) {
        return m35493(i, enumC0875, this.f45690, this.f45692, this.f45688, this.f45693, this.f45691);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35500() {
        return this.f45687;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35495(C7931 c7931, int i) {
        C11003.requireNonNull(c7931, "edit");
        if (c7931.f24554 < 0 || c7931.f24553 < c7931.f24554 || c7931.f24553 > i) {
            throw new IllegalArgumentException("Edit range is outside the old document");
        }
        if (c7931.f24552 < 0) {
            throw new IllegalArgumentException("Replacement length must not be negative");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35493(int i, EnumC0875 enumC0875, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        C11003.requireNonNull(enumC0875, "affinity");
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "Offset outside document: "));
        }
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch >= 0) {
            return (iArr[iBinarySearch] == iArr2[iBinarySearch] && enumC0875 == EnumC0875.AFTER) ? iArr4[iBinarySearch] : iArr3[iBinarySearch];
        }
        int i3 = (-iBinarySearch) - 2;
        if (i3 < 0) {
            return i;
        }
        int i4 = iArr2[i3];
        if (i < i4) {
            return -1;
        }
        return (i - i4) + iArr4[i3];
    }
}
