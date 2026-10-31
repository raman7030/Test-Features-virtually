package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91MK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16967 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f52050;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f52051;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f52052;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f52053;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f52054;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f52055;

    public C16967(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        this.f52053 = iArr;
        this.f52055 = iArr2;
        this.f52054 = i;
        this.f52052 = i3;
        this.f52050 = i2;
        this.f52051 = i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[][] m39793() {
        int i;
        int i2;
        int i3 = this.f52050;
        int i4 = this.f52051;
        C10630 c10630 = new C10630(i3 + i4, 0);
        int[] iArr = new int[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.f52054 + i5;
            int[] iArr2 = this.f52053;
            int i7 = c10630.get(iArr2[i6]);
            if (i7 != -1) {
                if (i7 == 0) {
                    c10630.mo23658(iArr2[i6], i5 + 1);
                } else {
                    c10630.mo23658(iArr2[i6], -1);
                }
            }
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            int i10 = this.f52052 + i9;
            int[] iArr3 = this.f52055;
            int i11 = c10630.get(iArr3[i10]);
            if (i11 != 0 && i11 != -1) {
                int i12 = i11 - 1;
                if (iArr[i12] == 0) {
                    iArr[i12] = i9 + 1;
                    i8++;
                } else {
                    iArr[i12] = 0;
                    c10630.mo23658(iArr3[i10], -1);
                    i8--;
                }
            }
        }
        if (i8 == 0) {
            return null;
        }
        int[] iArr4 = new int[i8];
        int[] iArr5 = new int[i8];
        int[] iArr6 = new int[i3];
        int i13 = 0;
        for (int i14 = 0; i14 < i3; i14++) {
            int i15 = iArr[i14];
            if (i15 != 0 && ((i2 = (i = -Arrays.binarySearch(iArr4, 0, i13, i15)) - 1) == i13 || iArr[i14] < iArr4[i2])) {
                iArr4[i2] = iArr[i14];
                iArr5[i2] = i14;
                iArr6[i14] = i2 > 0 ? iArr5[i - 2] : -1;
                if (i2 == i13) {
                    i13++;
                }
            }
        }
        int[][] iArr7 = {new int[i13], new int[i13]};
        int i16 = i13 - 1;
        for (int i17 = iArr5[i16]; i17 != -1; i17 = iArr6[i17]) {
            iArr7[0][i16] = i17;
            iArr7[1][i16] = iArr[i17] - 1;
            i16--;
        }
        return iArr7;
    }
}
