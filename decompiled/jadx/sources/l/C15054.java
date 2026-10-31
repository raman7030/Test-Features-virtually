package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B6N7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15054 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22336[] f45945 = new C22336[16];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean[] f45944 = new boolean[16];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22336[] f45943 = new C22336[16];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35591(EnumC23522 enumC23522, C13163 c13163) {
        int i;
        C22336[] c22336Arr;
        C22336 c22336;
        ArrayList arrayList = c13163.f39354;
        if (EnumC23522.m51951(c13163)) {
            return true;
        }
        if (enumC23522 == EnumC23522.SLL && c13163.f39356) {
            return EnumC23522.m51952(enumC23522, c13163);
        }
        int size = arrayList.size();
        int iHighestOneBit = size <= 8 ? 16 : Integer.highestOneBit(size - 1) << 2;
        if (iHighestOneBit > this.f45945.length) {
            this.f45945 = new C22336[iHighestOneBit];
            this.f45944 = new boolean[iHighestOneBit];
        }
        int i2 = iHighestOneBit - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            try {
                C22336 c22337 = (C22336) arrayList.get(i4);
                int i5 = c22337.f72393.f74153;
                int i6 = (i5 >>> 16) ^ i5;
                while (true) {
                    i = i6 & i2;
                    c22336Arr = this.f45945;
                    c22336 = c22336Arr[i];
                    if (c22336 == null || c22336.f72393.f74153 == i5) {
                        break;
                    }
                    i6 = i + 1;
                }
                if (c22336 == null) {
                    c22336Arr[i] = c22337;
                    this.f45944[i] = false;
                    i3++;
                } else {
                    boolean[] zArr = this.f45944;
                    if (!zArr[i] && c22336.f72390 != c22337.f72390) {
                        zArr[i] = true;
                        i3--;
                    }
                }
            } catch (Throwable th) {
                Arrays.fill(this.f45945, 0, iHighestOneBit, (Object) null);
                C22336[] c22336Arr2 = this.f45943;
                Arrays.fill(c22336Arr2, 0, Math.min(iHighestOneBit, c22336Arr2.length), (Object) null);
                throw th;
            }
        }
        if (i3 != 0) {
            Arrays.fill(this.f45945, 0, iHighestOneBit, (Object) null);
            C22336[] c22336Arr3 = this.f45943;
            Arrays.fill(c22336Arr3, 0, Math.min(iHighestOneBit, c22336Arr3.length), (Object) null);
            return false;
        }
        if (iHighestOneBit > this.f45943.length) {
            this.f45943 = new C22336[iHighestOneBit];
        }
        for (int i7 = 0; i7 < size; i7++) {
            C22336 c22338 = (C22336) arrayList.get(i7);
            int i8 = (c22338.f72393.f74153 * 31) + c22338.f72391.f50608;
            int i9 = i8 ^ (i8 >>> 16);
            while (true) {
                int i10 = i9 & i2;
                C22336[] c22336Arr4 = this.f45943;
                C22336 c22339 = c22336Arr4[i10];
                if (c22339 == null) {
                    c22336Arr4[i10] = c22338;
                    break;
                }
                if (c22339.f72393.f74153 == c22338.f72393.f74153 && c22339.f72391.equals(c22338.f72391)) {
                    if (c22339.f72390 == c22338.f72390) {
                        break;
                    }
                    Arrays.fill(this.f45945, 0, iHighestOneBit, (Object) null);
                    C22336[] c22336Arr5 = this.f45943;
                    Arrays.fill(c22336Arr5, 0, Math.min(iHighestOneBit, c22336Arr5.length), (Object) null);
                    return true;
                }
                i9 = i10 + 1;
            }
        }
        Arrays.fill(this.f45945, 0, iHighestOneBit, (Object) null);
        C22336[] c22336Arr6 = this.f45943;
        Arrays.fill(c22336Arr6, 0, Math.min(iHighestOneBit, c22336Arr6.length), (Object) null);
        return false;
    }
}
