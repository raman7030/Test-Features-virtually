package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B6N7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16675 {

    /* JADX INFO: renamed from: ܽ */
    public C23596[] f49063 = new C23596[16];

    /* JADX INFO: renamed from: ۧ */
    public boolean[] f49062 = new boolean[16];

    /* JADX INFO: renamed from: ֫ */
    public C23596[] f49061 = new C23596[16];

    /* JADX INFO: renamed from: ֫ */
    public final boolean m37749(EnumC24723 enumC24723, C14878 c14878) {
        int i;
        C23596[] c23596Arr;
        C23596 c23596;
        ArrayList arrayList = c14878.f42416;
        if (EnumC24723.m54353(c14878)) {
            return true;
        }
        if (enumC24723 == EnumC24723.SLL && c14878.f42418) {
            return EnumC24723.m54354(enumC24723, c14878);
        }
        int size = arrayList.size();
        int iHighestOneBit = size <= 8 ? 16 : Integer.highestOneBit(size - 1) << 2;
        if (iHighestOneBit > this.f49063.length) {
            this.f49063 = new C23596[iHighestOneBit];
            this.f49062 = new boolean[iHighestOneBit];
        }
        int i2 = iHighestOneBit - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            try {
                C23596 c23597 = (C23596) arrayList.get(i4);
                int i5 = c23597.f75119.f76895;
                int i6 = (i5 >>> 16) ^ i5;
                while (true) {
                    i = i6 & i2;
                    c23596Arr = this.f49063;
                    c23596 = c23596Arr[i];
                    if (c23596 == null || c23596.f75119.f76895 == i5) {
                        break;
                    }
                    i6 = i + 1;
                }
                if (c23596 == null) {
                    c23596Arr[i] = c23597;
                    this.f49062[i] = false;
                    i3++;
                } else {
                    boolean[] zArr = this.f49062;
                    if (!zArr[i] && c23596.f75116 != c23597.f75116) {
                        zArr[i] = true;
                        i3--;
                    }
                }
            } catch (Throwable th) {
                Arrays.fill(this.f49063, 0, iHighestOneBit, (Object) null);
                C23596[] c23596Arr2 = this.f49061;
                Arrays.fill(c23596Arr2, 0, Math.min(iHighestOneBit, c23596Arr2.length), (Object) null);
                throw th;
            }
        }
        if (i3 != 0) {
            Arrays.fill(this.f49063, 0, iHighestOneBit, (Object) null);
            C23596[] c23596Arr3 = this.f49061;
            Arrays.fill(c23596Arr3, 0, Math.min(iHighestOneBit, c23596Arr3.length), (Object) null);
            return false;
        }
        if (iHighestOneBit > this.f49061.length) {
            this.f49061 = new C23596[iHighestOneBit];
        }
        for (int i7 = 0; i7 < size; i7++) {
            C23596 c23598 = (C23596) arrayList.get(i7);
            int i8 = (c23598.f75119.f76895 * 31) + c23598.f75117.f53786;
            int i9 = i8 ^ (i8 >>> 16);
            while (true) {
                int i10 = i9 & i2;
                C23596[] c23596Arr4 = this.f49061;
                C23596 c23599 = c23596Arr4[i10];
                if (c23599 == null) {
                    c23596Arr4[i10] = c23598;
                    break;
                }
                if (c23599.f75119.f76895 == c23598.f75119.f76895 && c23599.f75117.equals(c23598.f75117)) {
                    if (c23599.f75116 == c23598.f75116) {
                        break;
                    }
                    Arrays.fill(this.f49063, 0, iHighestOneBit, (Object) null);
                    C23596[] c23596Arr5 = this.f49061;
                    Arrays.fill(c23596Arr5, 0, Math.min(iHighestOneBit, c23596Arr5.length), (Object) null);
                    return true;
                }
                i9 = i10 + 1;
            }
        }
        Arrays.fill(this.f49063, 0, iHighestOneBit, (Object) null);
        C23596[] c23596Arr6 = this.f49061;
        Arrays.fill(c23596Arr6, 0, Math.min(iHighestOneBit, c23596Arr6.length), (Object) null);
        return false;
    }
}
