package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C2723 {

    /* JADX INFO: renamed from: ֫ */
    public final int f4568;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f4569;

    public C2723(int[] iArr) {
        this.f4569 = iArr;
        this.f4568 = Arrays.hashCode(iArr);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2723) && Arrays.equals(this.f4569, ((C2723) obj).f4569);
    }

    public final int hashCode() {
        return this.f4568;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m4227(int i) {
        return Arrays.binarySearch(this.f4569, i) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003e  */
    /* JADX INFO: renamed from: ֫ */
    public final C2723 m4226(C2723 c2723) {
        int i;
        int[] iArr = this.f4569;
        int length = iArr.length;
        int[] iArr2 = c2723.f4569;
        int[] iArr3 = c2723.f4569;
        int length2 = length + iArr2.length;
        int[] iArrCopyOf = new int[length2];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= iArr.length && i3 >= iArr3.length) {
                break;
            }
            if (i3 >= iArr3.length || (i2 < iArr.length && iArr[i2] < iArr3[i3])) {
                i = iArr[i2];
                i2++;
            } else if (i2 < iArr.length) {
                int i5 = iArr3[i3];
                i = iArr[i2];
                if (i5 < i) {
                    i = iArr3[i3];
                    i3++;
                } else {
                    i2++;
                    i3++;
                }
            } else {
                i = iArr3[i3];
                i3++;
            }
            iArrCopyOf[i4] = i;
            i4++;
        }
        if (i4 != length2) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i4);
        }
        return new C2723(iArrCopyOf);
    }
}
