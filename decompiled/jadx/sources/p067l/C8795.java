package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C8795 {

    /* JADX INFO: renamed from: ֫ */
    public C23596[] f23875 = new C23596[16];

    /* JADX INFO: renamed from: ۧ */
    public int[] f23876 = new int[16];

    /* JADX INFO: renamed from: ֫ */
    public final int m20360(C14878 c14878) {
        ArrayList arrayList = c14878.f42416;
        int size = arrayList.size();
        int iHighestOneBit = size <= 8 ? 16 : Integer.highestOneBit(size - 1) << 2;
        if (iHighestOneBit > this.f23875.length) {
            this.f23875 = new C23596[iHighestOneBit];
            this.f23876 = new int[iHighestOneBit];
        }
        int i = iHighestOneBit - 1;
        for (int i2 = 0; i2 < size; i2++) {
            try {
                C23596 c23596 = (C23596) arrayList.get(i2);
                AbstractC24266 abstractC24266 = c23596.f75119;
                int i3 = c23596.f75116;
                int i4 = (abstractC24266.f76895 * 31) + c23596.f75117.f53786;
                int i5 = i4 ^ (i4 >>> 16);
                while (true) {
                    int i6 = i5 & i;
                    C23596[] c23596Arr = this.f23875;
                    C23596 c23597 = c23596Arr[i6];
                    if (c23597 == null) {
                        c23596Arr[i6] = c23596;
                        this.f23876[i6] = i3;
                        break;
                    }
                    if (c23597.f75119.f76895 == c23596.f75119.f76895 && c23597.f75117.equals(c23596.f75117)) {
                        int[] iArr = this.f23876;
                        iArr[i6] = Math.min(iArr[i6], i3);
                        break;
                    }
                    i5 = i6 + 1;
                }
            } catch (Throwable th) {
                Arrays.fill(this.f23875, 0, iHighestOneBit, (Object) null);
                throw th;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < iHighestOneBit; i8++) {
            C23596[] c23596Arr2 = this.f23875;
            if (c23596Arr2[i8] != null) {
                if (i7 == 0) {
                    i7 = this.f23876[i8];
                } else if (i7 != this.f23876[i8]) {
                    Arrays.fill(c23596Arr2, 0, iHighestOneBit, (Object) null);
                    return 0;
                }
            }
        }
        Arrays.fill(this.f23875, 0, iHighestOneBit, (Object) null);
        return i7;
    }
}
