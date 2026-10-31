package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68KO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7815 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public short[] f24148;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f24149;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f24150;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f24151;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public short[] f24152;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f24153;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f24154;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f24155;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f24156;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f24157;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f24158;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f24159;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final float f24160;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f24161;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short[] f24162;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f24163;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short[] f24164;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f24165;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final float f24166;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f24167;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24168;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f24169;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f24170;

    public C7815(float f, int i, float f2, int i2, int i3) {
        this.f24159 = i;
        this.f24158 = i2;
        this.f24169 = f;
        this.f24166 = f2;
        this.f24160 = i / i3;
        this.f24156 = i / 400;
        int i4 = i / 65;
        this.f24154 = i4;
        int i5 = i4 * 2;
        this.f24167 = i5;
        this.f24162 = new short[i5];
        this.f24164 = new short[i5 * i2];
        this.f24152 = new short[i5 * i2];
        this.f24148 = new short[i5 * i2];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m20891() {
        return this.f24163 * this.f24158 * 2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20890(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f24158;
        int i2 = iRemaining / i;
        short[] sArrM20885 = m20885(this.f24164, this.f24163, i2);
        this.f24164 = sArrM20885;
        shortBuffer.get(sArrM20885, this.f24163 * i, ((i2 * i) * 2) / 2);
        this.f24163 += i2;
        m20886();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20888(ShortBuffer shortBuffer) {
        C22632.m50634(this.f24165 >= 0);
        int iRemaining = shortBuffer.remaining();
        int i = this.f24158;
        int iMin = Math.min(iRemaining / i, this.f24165);
        shortBuffer.put(this.f24152, 0, iMin * i);
        int i2 = this.f24165 - iMin;
        this.f24165 = i2;
        short[] sArr = this.f24152;
        System.arraycopy(sArr, iMin * i, sArr, 0, i2 * i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20892() {
        int i = this.f24163;
        float f = this.f24169;
        float f2 = this.f24166;
        double d = f / f2;
        double d2 = this.f24160 * f2;
        int i2 = this.f24168;
        int i3 = this.f24165 + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + this.f24150) + ((double) this.f24153)) / d2) + 0.5d));
        this.f24150 = 0.0d;
        short[] sArr = this.f24164;
        int i4 = this.f24167 * 2;
        this.f24164 = m20885(sArr, i, i4 + i);
        int i5 = 0;
        while (true) {
            int i6 = this.f24158;
            if (i5 >= i4 * i6) {
                break;
            }
            this.f24164[(i6 * i) + i5] = 0;
            i5++;
        }
        this.f24163 = i4 + this.f24163;
        m20886();
        if (this.f24165 > i3) {
            this.f24165 = Math.max(i3, 0);
        }
        this.f24163 = 0;
        this.f24168 = 0;
        this.f24153 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20887() {
        this.f24163 = 0;
        this.f24165 = 0;
        this.f24153 = 0;
        this.f24151 = 0;
        this.f24161 = 0;
        this.f24168 = 0;
        this.f24155 = 0;
        this.f24149 = 0;
        this.f24157 = 0;
        this.f24170 = 0;
        this.f24150 = 0.0d;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m20889() {
        C22632.m50634(this.f24165 >= 0);
        return this.f24165 * this.f24158 * 2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private short[] m20885(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f24158;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20883(short[] sArr, int i, int i2) {
        short[] sArrM20885 = m20885(this.f24152, this.f24165, i2);
        this.f24152 = sArrM20885;
        int i3 = this.f24158;
        System.arraycopy(sArr, i * i3, sArrM20885, this.f24165 * i3, i3 * i2);
        this.f24165 += i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20884(short[] sArr, int i, int i2) {
        int i3 = this.f24167 / i2;
        int i4 = this.f24158;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[C23202.m51496(i7, i5, i6, i9)];
            }
            this.f24162[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m20881(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f24158;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f24157 = i6 / i7;
        this.f24170 = i8 / i5;
        return i7;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20886() {
        int i;
        int i2;
        int iM20881;
        int i3;
        int iRound;
        int iRound2;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        int i8 = this.f24165;
        float f = this.f24169;
        float f2 = this.f24166;
        double d = f / f2;
        float f3 = this.f24160 * f2;
        int i9 = this.f24159;
        int i10 = 1;
        int i11 = this.f24158;
        int i12 = 0;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            int i13 = this.f24163;
            int i14 = this.f24167;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.f24168;
                    if (i16 > 0) {
                        int iMin = Math.min(i14, i16);
                        m20883(this.f24164, i15, iMin);
                        this.f24168 -= iMin;
                        i15 += iMin;
                        i2 = i8;
                        i = i9;
                    } else {
                        short[] sArr = this.f24164;
                        int i17 = i9 > 4000 ? i9 / OpenAuthTask.SYS_ERR : 1;
                        int i18 = this.f24154;
                        int i19 = this.f24156;
                        if (i11 == i10 && i17 == i10) {
                            iM20881 = m20881(sArr, i15, i19, i18);
                            i2 = i8;
                            i = i9;
                        } else {
                            m20884(sArr, i15, i17);
                            i = i9;
                            i2 = i8;
                            short[] sArr2 = this.f24162;
                            iM20881 = m20881(sArr2, i12, i19 / i17, i18 / i17);
                            if (i17 != 1) {
                                int i20 = iM20881 * i17;
                                int i21 = i17 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 >= i19) {
                                    i19 = i22;
                                }
                                if (i23 <= i18) {
                                    i18 = i23;
                                }
                                if (i11 == 1) {
                                    iM20881 = m20881(sArr, i15, i19, i18);
                                } else {
                                    m20884(sArr, i15, 1);
                                    iM20881 = m20881(sArr2, i12, i19, i18);
                                }
                            }
                        }
                        int i24 = this.f24157;
                        int i25 = this.f24170;
                        if (i24 == 0 || (i3 = this.f24155) == 0 || i25 > i24 * 3 || i24 * 2 <= this.f24149 * 3) {
                            i3 = iM20881;
                        }
                        this.f24149 = i24;
                        this.f24155 = iM20881;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f24164;
                            if (d >= 2.0d) {
                                double d2 = (((double) i3) / (d - 1.0d)) + this.f24150;
                                iRound2 = (int) Math.round(d2);
                                this.f24150 = d2 - ((double) iRound2);
                            } else {
                                double d3 = (((2.0d - d) * ((double) i3)) / (d - 1.0d)) + this.f24150;
                                int iRound3 = (int) Math.round(d3);
                                this.f24168 = iRound3;
                                this.f24150 = d3 - ((double) iRound3);
                                iRound2 = i3;
                            }
                            short[] sArrM20885 = m20885(this.f24152, this.f24165, iRound2);
                            this.f24152 = sArrM20885;
                            int i26 = i15;
                            m20882(iRound2, this.f24158, sArrM20885, this.f24165, sArr3, i26, sArr3, i15 + i3);
                            this.f24165 += iRound2;
                            i15 = i3 + iRound2 + i26;
                        } else {
                            int i27 = i15;
                            short[] sArr4 = this.f24164;
                            if (d < 0.5d) {
                                double d4 = ((((double) i3) * d) / (1.0d - d)) + this.f24150;
                                iRound = (int) Math.round(d4);
                                this.f24150 = d4 - ((double) iRound);
                            } else {
                                double d5 = ((((2.0d * d) - 1.0d) * ((double) i3)) / (1.0d - d)) + this.f24150;
                                int iRound4 = (int) Math.round(d5);
                                this.f24168 = iRound4;
                                this.f24150 = d5 - ((double) iRound4);
                                iRound = i3;
                            }
                            int i28 = i3 + iRound;
                            short[] sArrM20886 = m20885(this.f24152, this.f24165, i28);
                            this.f24152 = sArrM20886;
                            System.arraycopy(sArr4, i27 * i11, sArrM20886, this.f24165 * i11, i3 * i11);
                            m20882(iRound, this.f24158, this.f24152, this.f24165 + i3, sArr4, i27 + i3, sArr4, i27);
                            this.f24165 += i28;
                            i15 = i27 + iRound;
                        }
                    }
                    if (i15 + i14 > i13) {
                        break;
                    }
                    i10 = 1;
                    i12 = 0;
                    i9 = i;
                    i8 = i2;
                }
                int i29 = this.f24163 - i15;
                short[] sArr5 = this.f24164;
                System.arraycopy(sArr5, i15 * i11, sArr5, 0, i29 * i11);
                this.f24163 = i29;
            }
            if (f3 != 1.0f || this.f24165 == (i4 = i2)) {
            }
            int i30 = i;
            long j3 = (long) (i30 / f3);
            long j4 = i30;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i31 = this.f24165 - i4;
            short[] sArrM20887 = m20885(this.f24148, this.f24153, i31);
            this.f24148 = sArrM20887;
            System.arraycopy(this.f24152, i4 * i11, sArrM20887, this.f24153 * i11, i31 * i11);
            this.f24165 = i4;
            this.f24153 += i31;
            int i32 = 0;
            while (true) {
                i5 = this.f24153;
                i6 = i5 - 1;
                if (i32 >= i6) {
                    break;
                }
                while (true) {
                    i7 = this.f24151 + 1;
                    j = i7;
                    long j5 = j * j3;
                    j2 = this.f24161;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    this.f24152 = m20885(this.f24152, this.f24165, 1);
                    int i33 = 0;
                    while (i33 < i11) {
                        short[] sArr6 = this.f24152;
                        int i34 = (this.f24165 * i11) + i33;
                        short[] sArr7 = this.f24148;
                        int i35 = (i32 * i11) + i33;
                        short s = sArr7[i35];
                        short s2 = sArr7[i35 + i11];
                        long j6 = ((long) this.f24161) * j4;
                        int i36 = this.f24151;
                        int i37 = i33;
                        long j7 = ((long) (i36 + 1)) * j3;
                        long j8 = j7 - j6;
                        long j9 = j7 - (((long) i36) * j3);
                        sArr6[i34] = (short) ((((j9 - j8) * ((long) s2)) + (((long) s) * j8)) / j9);
                        i33 = i37 + 1;
                        j4 = j4;
                    }
                    this.f24161++;
                    this.f24165++;
                    j4 = j4;
                }
                long j10 = j4;
                this.f24151 = i7;
                if (j == j10) {
                    this.f24151 = 0;
                    C22632.m50634(j2 == j3);
                    this.f24161 = 0;
                }
                i32++;
                j4 = j10;
            }
            if (i6 == 0) {
                return;
            }
            short[] sArr8 = this.f24148;
            System.arraycopy(sArr8, i6 * i11, sArr8, 0, (i5 - i6) * i11);
            this.f24153 -= i6;
            return;
        }
        m20883(this.f24164, 0, this.f24163);
        this.f24163 = 0;
        i2 = i8;
        i = i9;
        if (f3 != 1.0f) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20882(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
