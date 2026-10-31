package l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10920 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[][] f32813;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[][] f32814;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int[] f32815;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int[] f32816;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f32817;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f32818;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f32819;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f32820;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f32821;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[][] f32822;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f32823;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f32824;

    public C10920(int[] iArr, int[] iArr2) {
        Class cls = Integer.TYPE;
        this.f32822 = (int[][]) Array.newInstance((Class<?>) cls, 4, 256);
        this.f32813 = (int[][]) Array.newInstance((Class<?>) cls, 4, 257);
        this.f32814 = (int[][]) Array.newInstance((Class<?>) cls, 4, 256);
        this.f32824 = new int[4];
        this.f32819 = new int[4];
        this.f32815 = new int[4];
        this.f32816 = new int[4];
        this.f32821 = new int[4];
        this.f32817 = new int[4];
        m27227(iArr, iArr2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27227(int[] iArr, int[] iArr2) {
        this.f32823 = iArr;
        this.f32820 = iArr2;
        this.f32818 = 0;
        this.f32824[0] = 0;
        this.f32819[0] = iArr.length;
        this.f32815[0] = 24;
        this.f32816[0] = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27228() {
        int i;
        int i2 = this.f32818;
        if (i2 >= 0) {
            int[] iArr = this.f32816;
            int i3 = iArr[i2];
            int[] iArr2 = this.f32821;
            int[][] iArr3 = this.f32822;
            int[] iArr4 = this.f32819;
            int[] iArr5 = this.f32824;
            if (i3 != 0) {
                int[] iArr6 = this.f32815;
                int[][] iArr7 = this.f32813;
                int[] iArr8 = this.f32817;
                if (i3 != 1) {
                    int[][] iArr9 = this.f32814;
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
                                int iM41991 = C17975.m41991(this.f32820[this.f32823[i9]], iArr6[i2]);
                                if (iM41991 == i6) {
                                    iArr9[i2][i6] = i9 + 1;
                                } else {
                                    int[] iArr11 = iArr9[i2];
                                    int i10 = iArr11[iM41991];
                                    iArr11[iM41991] = i10 + 1;
                                    int[] iArr12 = this.f32823;
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
                            this.f32818 = i2 - 1;
                        } else {
                            int i12 = i + 1;
                            iArr8[i2] = i12;
                            int[] iArr13 = iArr7[i2];
                            int i13 = iArr13[i];
                            int i14 = iArr13[i12];
                            if (i14 - i13 >= 2) {
                                int i15 = i2 + 1;
                                this.f32818 = i15;
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
                        int iM41992 = C17975.m41991(this.f32820[this.f32823[i16]], iArr6[i2]);
                        iArr14[iM41992] = iArr14[iM41992] + 1;
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
                    this.f32818 = i2 - 1;
                } else if (i19 <= 64) {
                    C17975.m41993(i18, i17, this.f32823, this.f32820);
                    this.f32818--;
                } else {
                    Arrays.fill(iArr3[i2], 0);
                    iArr2[i2] = iArr5[i2];
                    iArr[i2] = 1;
                }
            }
            if (this.f32818 >= 0) {
                return false;
            }
        }
        return true;
    }
}
