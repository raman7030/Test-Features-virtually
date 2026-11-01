package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68KO */
/* JADX INFO: loaded from: classes3.dex */
public final class C9795 {

    /* JADX INFO: renamed from: ֡ */
    public short[] f27064;

    /* JADX INFO: renamed from: ֨ */
    public int f27065;

    /* JADX INFO: renamed from: ֫ */
    public double f27066;

    /* JADX INFO: renamed from: ۖ */
    public int f27067;

    /* JADX INFO: renamed from: ۘ */
    public short[] f27068;

    /* JADX INFO: renamed from: ۚ */
    public int f27069;

    /* JADX INFO: renamed from: ۜ */
    public final int f27070;

    /* JADX INFO: renamed from: ۠ */
    public int f27071;

    /* JADX INFO: renamed from: ۡ */
    public final int f27072;

    /* JADX INFO: renamed from: ۢ */
    public int f27073;

    /* JADX INFO: renamed from: ۧ */
    public final int f27074;

    /* JADX INFO: renamed from: ܳ */
    public final int f27075;

    /* JADX INFO: renamed from: ܶ */
    public final float f27076;

    /* JADX INFO: renamed from: ܺ */
    public int f27077;

    /* JADX INFO: renamed from: ܽ */
    public final short[] f27078;

    /* JADX INFO: renamed from: ܿ */
    public int f27079;

    /* JADX INFO: renamed from: ᩳ */
    public short[] f27080;

    /* JADX INFO: renamed from: ᩴ */
    public int f27081;

    /* JADX INFO: renamed from: ᩵ */
    public final float f27082;

    /* JADX INFO: renamed from: ᩷ */
    public final int f27083;

    /* JADX INFO: renamed from: ᩸ */
    public int f27084;

    /* JADX INFO: renamed from: ᩹ */
    public final float f27085;

    /* JADX INFO: renamed from: ᩻ */
    public int f27086;

    public C9795(float f, int i, float f2, int i2, int i3) {
        this.f27075 = i;
        this.f27074 = i2;
        this.f27085 = f;
        this.f27082 = f2;
        this.f27076 = i / i3;
        this.f27072 = i / 400;
        int i4 = i / 65;
        this.f27070 = i4;
        int i5 = i4 * 2;
        this.f27083 = i5;
        this.f27078 = new short[i5];
        this.f27080 = new short[i5 * i2];
        this.f27068 = new short[i5 * i2];
        this.f27064 = new short[i5 * i2];
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m22856() {
        return this.f27079 * this.f27074 * 2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22855(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f27074;
        int i2 = iRemaining / i;
        short[] sArrM22850 = m22850(this.f27080, this.f27079, i2);
        this.f27080 = sArrM22850;
        shortBuffer.get(sArrM22850, this.f27079 * i, ((i2 * i) * 2) / 2);
        this.f27079 += i2;
        m22851();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22853(ShortBuffer shortBuffer) {
        C23877.m52960(this.f27081 >= 0);
        int iRemaining = shortBuffer.remaining();
        int i = this.f27074;
        int iMin = Math.min(iRemaining / i, this.f27081);
        shortBuffer.put(this.f27068, 0, iMin * i);
        int i2 = this.f27081 - iMin;
        this.f27081 = i2;
        short[] sArr = this.f27068;
        System.arraycopy(sArr, iMin * i, sArr, 0, i2 * i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m22857() {
        int i = this.f27079;
        float f = this.f27085;
        float f2 = this.f27082;
        double d = f / f2;
        double d2 = this.f27076 * f2;
        int i2 = this.f27084;
        int i3 = this.f27081 + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + this.f27066) + ((double) this.f27069)) / d2) + 0.5d));
        this.f27066 = 0.0d;
        short[] sArr = this.f27080;
        int i4 = this.f27083 * 2;
        this.f27080 = m22850(sArr, i, i4 + i);
        int i5 = 0;
        while (true) {
            int i6 = this.f27074;
            if (i5 >= i4 * i6) {
                break;
            }
            this.f27080[(i6 * i) + i5] = 0;
            i5++;
        }
        this.f27079 = i4 + this.f27079;
        m22851();
        if (this.f27081 > i3) {
            this.f27081 = Math.max(i3, 0);
        }
        this.f27079 = 0;
        this.f27084 = 0;
        this.f27069 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22852() {
        this.f27079 = 0;
        this.f27081 = 0;
        this.f27069 = 0;
        this.f27067 = 0;
        this.f27077 = 0;
        this.f27084 = 0;
        this.f27071 = 0;
        this.f27065 = 0;
        this.f27073 = 0;
        this.f27086 = 0;
        this.f27066 = 0.0d;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m22854() {
        C23877.m52960(this.f27081 >= 0);
        return this.f27081 * this.f27074 * 2;
    }

    /* JADX INFO: renamed from: ܽ */
    private short[] m22850(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f27074;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22848(short[] sArr, int i, int i2) {
        short[] sArrM22850 = m22850(this.f27068, this.f27081, i2);
        this.f27068 = sArrM22850;
        int i3 = this.f27074;
        System.arraycopy(sArr, i * i3, sArrM22850, this.f27081 * i3, i3 * i2);
        this.f27081 += i2;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m22849(short[] sArr, int i, int i2) {
        int i3 = this.f27083 / i2;
        int i4 = this.f27074;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[C24420.m53892(i7, i5, i6, i9)];
            }
            this.f27078[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m22846(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f27074;
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
        this.f27073 = i6 / i7;
        this.f27086 = i8 / i5;
        return i7;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m22851() {
        int i;
        int i2;
        int iM22846;
        int i3;
        int iRound;
        int iRound2;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        int i8 = this.f27081;
        float f = this.f27085;
        float f2 = this.f27082;
        double d = f / f2;
        float f3 = this.f27076 * f2;
        int i9 = this.f27075;
        int i10 = 1;
        int i11 = this.f27074;
        int i12 = 0;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            int i13 = this.f27079;
            int i14 = this.f27083;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.f27084;
                    if (i16 > 0) {
                        int iMin = Math.min(i14, i16);
                        m22848(this.f27080, i15, iMin);
                        this.f27084 -= iMin;
                        i15 += iMin;
                        i2 = i8;
                        i = i9;
                    } else {
                        short[] sArr = this.f27080;
                        int i17 = i9 > 4000 ? i9 / OpenAuthTask.SYS_ERR : 1;
                        int i18 = this.f27070;
                        int i19 = this.f27072;
                        if (i11 == i10 && i17 == i10) {
                            iM22846 = m22846(sArr, i15, i19, i18);
                            i2 = i8;
                            i = i9;
                        } else {
                            m22849(sArr, i15, i17);
                            i = i9;
                            i2 = i8;
                            short[] sArr2 = this.f27078;
                            iM22846 = m22846(sArr2, i12, i19 / i17, i18 / i17);
                            if (i17 != 1) {
                                int i20 = iM22846 * i17;
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
                                    iM22846 = m22846(sArr, i15, i19, i18);
                                } else {
                                    m22849(sArr, i15, 1);
                                    iM22846 = m22846(sArr2, i12, i19, i18);
                                }
                            }
                        }
                        int i24 = this.f27073;
                        int i25 = this.f27086;
                        if (i24 == 0 || (i3 = this.f27071) == 0 || i25 > i24 * 3 || i24 * 2 <= this.f27065 * 3) {
                            i3 = iM22846;
                        }
                        this.f27065 = i24;
                        this.f27071 = iM22846;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f27080;
                            if (d >= 2.0d) {
                                double d2 = (((double) i3) / (d - 1.0d)) + this.f27066;
                                iRound2 = (int) Math.round(d2);
                                this.f27066 = d2 - ((double) iRound2);
                            } else {
                                double d3 = (((2.0d - d) * ((double) i3)) / (d - 1.0d)) + this.f27066;
                                int iRound3 = (int) Math.round(d3);
                                this.f27084 = iRound3;
                                this.f27066 = d3 - ((double) iRound3);
                                iRound2 = i3;
                            }
                            short[] sArrM22850 = m22850(this.f27068, this.f27081, iRound2);
                            this.f27068 = sArrM22850;
                            int i26 = i15;
                            m22847(iRound2, this.f27074, sArrM22850, this.f27081, sArr3, i26, sArr3, i15 + i3);
                            this.f27081 += iRound2;
                            i15 = i3 + iRound2 + i26;
                        } else {
                            int i27 = i15;
                            short[] sArr4 = this.f27080;
                            if (d < 0.5d) {
                                double d4 = ((((double) i3) * d) / (1.0d - d)) + this.f27066;
                                iRound = (int) Math.round(d4);
                                this.f27066 = d4 - ((double) iRound);
                            } else {
                                double d5 = ((((2.0d * d) - 1.0d) * ((double) i3)) / (1.0d - d)) + this.f27066;
                                int iRound4 = (int) Math.round(d5);
                                this.f27084 = iRound4;
                                this.f27066 = d5 - ((double) iRound4);
                                iRound = i3;
                            }
                            int i28 = i3 + iRound;
                            short[] sArrM22851 = m22850(this.f27068, this.f27081, i28);
                            this.f27068 = sArrM22851;
                            System.arraycopy(sArr4, i27 * i11, sArrM22851, this.f27081 * i11, i3 * i11);
                            m22847(iRound, this.f27074, this.f27068, this.f27081 + i3, sArr4, i27 + i3, sArr4, i27);
                            this.f27081 += i28;
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
                int i29 = this.f27079 - i15;
                short[] sArr5 = this.f27080;
                System.arraycopy(sArr5, i15 * i11, sArr5, 0, i29 * i11);
                this.f27079 = i29;
            }
            if (f3 != 1.0f || this.f27081 == (i4 = i2)) {
            }
            int i30 = i;
            long j3 = (long) (i30 / f3);
            long j4 = i30;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i31 = this.f27081 - i4;
            short[] sArrM22852 = m22850(this.f27064, this.f27069, i31);
            this.f27064 = sArrM22852;
            System.arraycopy(this.f27068, i4 * i11, sArrM22852, this.f27069 * i11, i31 * i11);
            this.f27081 = i4;
            this.f27069 += i31;
            int i32 = 0;
            while (true) {
                i5 = this.f27069;
                i6 = i5 - 1;
                if (i32 >= i6) {
                    break;
                }
                while (true) {
                    i7 = this.f27067 + 1;
                    j = i7;
                    long j5 = j * j3;
                    j2 = this.f27077;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    this.f27068 = m22850(this.f27068, this.f27081, 1);
                    int i33 = 0;
                    while (i33 < i11) {
                        short[] sArr6 = this.f27068;
                        int i34 = (this.f27081 * i11) + i33;
                        short[] sArr7 = this.f27064;
                        int i35 = (i32 * i11) + i33;
                        short s = sArr7[i35];
                        short s2 = sArr7[i35 + i11];
                        long j6 = ((long) this.f27077) * j4;
                        int i36 = this.f27067;
                        int i37 = i33;
                        long j7 = ((long) (i36 + 1)) * j3;
                        long j8 = j7 - j6;
                        long j9 = j7 - (((long) i36) * j3);
                        sArr6[i34] = (short) ((((j9 - j8) * ((long) s2)) + (((long) s) * j8)) / j9);
                        i33 = i37 + 1;
                        j4 = j4;
                    }
                    this.f27077++;
                    this.f27081++;
                    j4 = j4;
                }
                long j10 = j4;
                this.f27067 = i7;
                if (j == j10) {
                    this.f27067 = 0;
                    C23877.m52960(j2 == j3);
                    this.f27077 = 0;
                }
                i32++;
                j4 = j10;
            }
            if (i6 == 0) {
                return;
            }
            short[] sArr8 = this.f27064;
            System.arraycopy(sArr8, i6 * i11, sArr8, 0, (i5 - i6) * i11);
            this.f27069 -= i6;
            return;
        }
        m22848(this.f27080, 0, this.f27079);
        this.f27079 = 0;
        i2 = i8;
        i = i9;
        if (f3 != 1.0f) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22847(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
