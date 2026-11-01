package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J703 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16611 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f48800;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f48801;

    /* JADX INFO: renamed from: ܳ */
    public final int f48802;

    /* JADX INFO: renamed from: ܽ */
    public final int f48803;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f48804;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f48805;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f48806;

    public C16611(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean z) {
        this.f48802 = i;
        this.f48803 = i2;
        this.f48806 = iArr;
        this.f48804 = iArr2;
        this.f48805 = iArr3;
        this.f48801 = iArr4;
        this.f48800 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16611 m37650(int i, C9906... c9906Arr) {
        int i2;
        C9906[] c9906Arr2 = c9906Arr;
        if (i < 0) {
            throw new IllegalArgumentException("Old length must not be negative");
        }
        C12826.requireNonNull(c9906Arr2, "edits");
        long j = i;
        int i3 = 0;
        int i4 = -1;
        boolean z = false;
        for (C9906 c9906 : c9906Arr2) {
            m37651(c9906, i);
            if (c9906.f27468 != c9906.f27467 || c9906.f27466 != 0) {
                if (c9906.f27468 < i4) {
                    throw new IllegalArgumentException("Edits must be ordered and non-overlapping");
                }
                if (c9906.f27468 != i4) {
                    i3++;
                }
                i4 = c9906.f27467;
                long j2 = (((long) c9906.f27466) - ((long) (c9906.f27467 - c9906.f27468))) + j;
                z = (c9906.f27467 == i) | z;
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
        int length = c9906Arr2.length;
        int i5 = 0;
        int i6 = -1;
        while (i5 < length) {
            C9906 c9907 = c9906Arr2[i5];
            if (c9907.f27468 == c9907.f27467 && c9907.f27466 == 0) {
                i2 = length;
            } else {
                long j4 = ((long) c9907.f27468) + j3;
                long j5 = ((long) c9907.f27466) + j4;
                if (i6 >= 0) {
                    i2 = length;
                    if (iArr2[i6] == c9907.f27468) {
                        iArr2[i6] = c9907.f27467;
                        iArr4[i6] = (int) j5;
                    }
                    j3 = (((long) c9907.f27466) - ((long) (c9907.f27467 - c9907.f27468))) + j3;
                } else {
                    i2 = length;
                }
                i6++;
                iArr[i6] = c9907.f27468;
                iArr2[i6] = c9907.f27467;
                iArr3[i6] = (int) j4;
                iArr4[i6] = (int) j5;
                j3 = (((long) c9907.f27466) - ((long) (c9907.f27467 - c9907.f27468))) + j3;
            }
            i5++;
            c9906Arr2 = c9906Arr;
            z = z;
            j = j;
            length = i2;
        }
        long j6 = j;
        boolean z2 = z;
        for (int i7 = 0; i7 < i3 && !z2; i7++) {
            z2 = iArr2[i7] - iArr[i7] != iArr4[i7] - iArr3[i7];
        }
        return new C16611(i, (int) j6, iArr, iArr2, iArr3, iArr4, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16611 m37655(C9906 c9906) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int iM37654;
        int iM37655;
        int i = this.f48803;
        m37651(c9906, i);
        if ((((long) i) + ((long) c9906.f27466)) - ((long) (c9906.f27467 - c9906.f27468)) > 2147483647L) {
            throw new IllegalArgumentException("New length exceeds the supported range");
        }
        if (c9906.f27468 == c9906.f27467 && c9906.f27466 == 0) {
            return m37652();
        }
        int i2 = 0;
        while (true) {
            iArr = this.f48806;
            int length = iArr.length;
            iArr2 = this.f48801;
            if (i2 >= length || iArr2[i2] >= c9906.f27468) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        while (true) {
            int length2 = iArr.length;
            iArr3 = this.f48805;
            if (i3 >= length2 || iArr3[i3] > c9906.f27467) {
                break;
            }
            i3++;
        }
        int iMin = c9906.f27468;
        int iMax = c9906.f27467;
        int[] iArr4 = this.f48804;
        if (i2 < i3) {
            iMin = Math.min(iMin, iArr3[i2]);
            int i4 = i3 - 1;
            iMax = Math.max(iMax, iArr2[i4]);
            iM37654 = Math.min(iArr[i2], m37654(iMin, EnumC3200.BEFORE));
            iM37655 = Math.max(iArr4[i4], m37654(iMax, EnumC3200.AFTER));
        } else {
            iM37654 = m37654(iMin, EnumC3200.BEFORE);
            iM37655 = m37654(iMax, EnumC3200.AFTER);
        }
        long j = ((((long) iMax) - ((long) iMin)) - ((long) (c9906.f27467 - c9906.f27468))) + ((long) c9906.f27466);
        int i5 = (int) j;
        if (j != i5) {
            throw new ArithmeticException();
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        for (int i6 = 0; i6 < i2; i6++) {
            arrayList.add(new C9906(iArr[i6], iArr4[i6], iArr2[i6] - iArr3[i6]));
        }
        arrayList.add(new C9906(iM37654, iM37655, i5));
        while (i3 < iArr.length) {
            arrayList.add(new C9906(iArr[i3], iArr4[i3], iArr2[i3] - iArr3[i3]));
            i3++;
        }
        return m37650(this.f48802, (C9906[]) arrayList.toArray(new C9906[0])).m37652();
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m37663() {
        return this.f48802;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m37665() {
        return this.f48803;
    }

    /* JADX INFO: renamed from: ᩻ */
    private C16611 m37652() {
        int[] iArr = this.f48806;
        if (iArr.length <= 64) {
            return this;
        }
        int length = iArr.length - 1;
        return m37650(this.f48802, new C9906(iArr[0], this.f48804[length], this.f48801[length] - this.f48805[0]));
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m37660() {
        return this.f48806.length;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m37662() {
        return this.f48806.length == 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m37657() {
        int[] iArr = this.f48806;
        if (iArr.length == 0) {
            return -1;
        }
        return iArr[0];
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m37664(int i) {
        return this.f48806[i];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m37666(int i) {
        return this.f48804[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m37653(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f48804, i);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m37661(int i) {
        return this.f48805[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m37658(int i) {
        return this.f48801[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m37659(int i, EnumC3200 enumC3200) {
        return m37649(i, enumC3200, this.f48802, this.f48806, this.f48804, this.f48805, this.f48801);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m37654(int i, EnumC3200 enumC3200) {
        return m37649(i, enumC3200, this.f48803, this.f48805, this.f48801, this.f48806, this.f48804);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m37656() {
        return this.f48800;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37651(C9906 c9906, int i) {
        C12826.requireNonNull(c9906, "edit");
        if (c9906.f27468 < 0 || c9906.f27467 < c9906.f27468 || c9906.f27467 > i) {
            throw new IllegalArgumentException("Edit range is outside the old document");
        }
        if (c9906.f27466 < 0) {
            throw new IllegalArgumentException("Replacement length must not be negative");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m37649(int i, EnumC3200 enumC3200, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        C12826.requireNonNull(enumC3200, "affinity");
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "Offset outside document: "));
        }
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch >= 0) {
            return (iArr[iBinarySearch] == iArr2[iBinarySearch] && enumC3200 == EnumC3200.AFTER) ? iArr4[iBinarySearch] : iArr3[iBinarySearch];
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
