package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8K8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4911 {

    /* JADX INFO: renamed from: ֫ */
    public final int f11172;

    /* JADX INFO: renamed from: ۧ */
    public final int[][][] f11173;

    /* JADX INFO: renamed from: ܳ */
    public final C8243 f11174;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f11175;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f11176;

    /* JADX INFO: renamed from: ᩳ */
    public final C8243[] f11177;

    public C4911(int[] iArr, C8243[] c8243Arr, int[] iArr2, int[][][] iArr3, C8243 c8243) {
        this.f11176 = iArr;
        this.f11177 = c8243Arr;
        this.f11173 = iArr3;
        this.f11175 = iArr2;
        this.f11174 = c8243;
        this.f11172 = iArr.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10416() {
        return this.f11172;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10417(int i) {
        return this.f11176[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final C8243 m10421(int i) {
        return this.f11177[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10419(int i, int i2, int i3) {
        return this.f11173[i][i2][i3] & 7;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10418(int i, int i2) {
        C8243[] c8243Arr = this.f11177;
        int i3 = c8243Arr[i].m19034(i2).f42921;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (m10419(i, i2, i6) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
        int iMin = 16;
        String str = null;
        boolean z = false;
        int i7 = 0;
        while (i4 < iArrCopyOf.length) {
            String str2 = c8243Arr[i].m19034(i2).m34395(iArrCopyOf[i4]).f28528;
            int i8 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z |= !C12826.equals(str, str2);
            }
            iMin = Math.min(iMin, this.f11173[i][i2][i4] & 24);
            i4++;
            i7 = i8;
        }
        return z ? Math.min(iMin, this.f11175[i]) : iMin;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C8243 m10420() {
        return this.f11174;
    }
}
