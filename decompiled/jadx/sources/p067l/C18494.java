package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91MK */
/* JADX INFO: loaded from: classes4.dex */
public final class C18494 {

    /* JADX INFO: renamed from: ֫ */
    public final int f55230;

    /* JADX INFO: renamed from: ۧ */
    public final int f55231;

    /* JADX INFO: renamed from: ܳ */
    public final int f55232;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f55233;

    /* JADX INFO: renamed from: ܿ */
    public final int f55234;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f55235;

    public C18494(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        this.f55233 = iArr;
        this.f55235 = iArr2;
        this.f55234 = i;
        this.f55232 = i3;
        this.f55230 = i2;
        this.f55231 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[][] m42036() {
        int i;
        int i2;
        int i3 = this.f55230;
        int i4 = this.f55231;
        C12472 c12472 = new C12472(i3 + i4, 0);
        int[] iArr = new int[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.f55234 + i5;
            int[] iArr2 = this.f55233;
            int i7 = c12472.get(iArr2[i6]);
            if (i7 != -1) {
                if (i7 == 0) {
                    c12472.mo25657(iArr2[i6], i5 + 1);
                } else {
                    c12472.mo25657(iArr2[i6], -1);
                }
            }
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            int i10 = this.f55232 + i9;
            int[] iArr3 = this.f55235;
            int i11 = c12472.get(iArr3[i10]);
            if (i11 != 0 && i11 != -1) {
                int i12 = i11 - 1;
                if (iArr[i12] == 0) {
                    iArr[i12] = i9 + 1;
                    i8++;
                } else {
                    iArr[i12] = 0;
                    c12472.mo25657(iArr3[i10], -1);
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
