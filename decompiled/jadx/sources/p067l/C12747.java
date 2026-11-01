package p067l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12747 {

    /* JADX INFO: renamed from: ֫ */
    public final int[][] f35791;

    /* JADX INFO: renamed from: ۜ */
    public final int[][] f35792;

    /* JADX INFO: renamed from: ۡ */
    public final int[] f35793;

    /* JADX INFO: renamed from: ۢ */
    public final int[] f35794;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f35795;

    /* JADX INFO: renamed from: ܳ */
    public int f35796;

    /* JADX INFO: renamed from: ܺ */
    public final int[] f35797;

    /* JADX INFO: renamed from: ܽ */
    public int[] f35798;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f35799;

    /* JADX INFO: renamed from: ᩳ */
    public final int[][] f35800;

    /* JADX INFO: renamed from: ᩷ */
    public int[] f35801;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f35802;

    public C12747(int[] iArr, int[] iArr2) {
        Class cls = Integer.TYPE;
        this.f35800 = (int[][]) Array.newInstance((Class<?>) cls, 4, 256);
        this.f35791 = (int[][]) Array.newInstance((Class<?>) cls, 4, 257);
        this.f35792 = (int[][]) Array.newInstance((Class<?>) cls, 4, 256);
        this.f35802 = new int[4];
        this.f35797 = new int[4];
        this.f35793 = new int[4];
        this.f35794 = new int[4];
        this.f35799 = new int[4];
        this.f35795 = new int[4];
        m29272(iArr, iArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29272(int[] iArr, int[] iArr2) {
        this.f35801 = iArr;
        this.f35798 = iArr2;
        this.f35796 = 0;
        this.f35802[0] = 0;
        this.f35797[0] = iArr.length;
        this.f35793[0] = 24;
        this.f35794[0] = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29273() {
        int i;
        int i2 = this.f35796;
        if (i2 >= 0) {
            int[] iArr = this.f35794;
            int i3 = iArr[i2];
            int[] iArr2 = this.f35799;
            int[][] iArr3 = this.f35800;
            int[] iArr4 = this.f35797;
            int[] iArr5 = this.f35802;
            if (i3 != 0) {
                int[] iArr6 = this.f35793;
                int[][] iArr7 = this.f35791;
                int[] iArr8 = this.f35795;
                if (i3 != 1) {
                    int[][] iArr9 = this.f35792;
                    if (i3 == 2) {
                        int i4 = iArr8[i2];
                        if (i4 < 256) {
                            int[] iArr10 = iArr7[i2];
                            int i5 = i4 + 1;
                            iArr10[i5] = iArr10[i4] + iArr3[i2][i4];
                            iArr9[i2][i4] = iArr10[i4];
                            iArr8[i2] = i5;
                        } else {
                            iArr8[i2] = 0;
                            iArr[i2] = 3;
                        }
                    } else if (i3 == 3) {
                        int i6 = iArr8[i2];
                        if (i6 >= 256) {
                            iArr8[i2] = 0;
                            iArr[i2] = 4;
                        } else {
                            int i7 = i6 + 1;
                            int i8 = iArr7[i2][i7];
                            int i9 = iArr9[i2][i6];
                            if (i9 >= i8) {
                                iArr8[i2] = i7;
                            } else {
                                int iM44240 = C19452.m44240(this.f35798[this.f35801[i9]], iArr6[i2]);
                                if (iM44240 == i6) {
                                    iArr9[i2][i6] = i9 + 1;
                                } else {
                                    int[] iArr11 = iArr9[i2];
                                    int i10 = iArr11[iM44240];
                                    iArr11[iM44240] = i10 + 1;
                                    int[] iArr12 = this.f35801;
                                    int i11 = iArr12[i9];
                                    iArr12[i9] = iArr12[i10];
                                    iArr12[i10] = i11;
                                }
                            }
                        }
                    } else {
                        if (i3 != 4) {
                            throw new IllegalStateException("Invalid syntax context sort phase");
                        }
                        if (iArr6[i2] == 0 || (i = iArr8[i2]) >= 256) {
                            this.f35796 = i2 - 1;
                        } else {
                            int i12 = i + 1;
                            iArr8[i2] = i12;
                            int[] iArr13 = iArr7[i2];
                            int i13 = iArr13[i];
                            int i14 = iArr13[i12];
                            if (i14 - i13 >= 2) {
                                int i15 = i2 + 1;
                                this.f35796 = i15;
                                iArr5[i15] = i13;
                                iArr4[i15] = i14;
                                iArr6[i15] = iArr6[i2] - 8;
                                iArr[i15] = 0;
                            }
                        }
                    }
                } else {
                    int i16 = iArr2[i2];
                    if (i16 < iArr4[i2]) {
                        int[] iArr14 = iArr3[i2];
                        int iM44241 = C19452.m44240(this.f35798[this.f35801[i16]], iArr6[i2]);
                        iArr14[iM44241] = iArr14[iM44241] + 1;
                        iArr2[i2] = i16 + 1;
                    } else {
                        iArr7[i2][0] = iArr5[i2];
                        iArr8[i2] = 0;
                        iArr[i2] = 2;
                    }
                }
            } else {
                int i17 = iArr4[i2];
                int i18 = iArr5[i2];
                int i19 = i17 - i18;
                if (i19 < 2) {
                    this.f35796 = i2 - 1;
                } else if (i19 <= 64) {
                    C19452.m44242(i18, i17, this.f35801, this.f35798);
                    this.f35796--;
                } else {
                    Arrays.fill(iArr3[i2], 0);
                    iArr2[i2] = iArr5[i2];
                    iArr[i2] = 1;
                }
            }
            if (this.f35796 >= 0) {
                return false;
            }
        }
        return true;
    }
}
