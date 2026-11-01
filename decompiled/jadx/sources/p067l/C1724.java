package p067l;

import android.graphics.Color;

/* JADX INFO: renamed from: l.ᩳۗ */
/* JADX INFO: compiled from: HB1L */
/* JADX INFO: loaded from: classes4.dex */
public final class C1724 {

    /* JADX INFO: renamed from: ֫ */
    public final float f57556;

    /* JADX INFO: renamed from: ۧ */
    public final float f57557;

    /* JADX INFO: renamed from: ܳ */
    public final float f57558;

    /* JADX INFO: renamed from: ܽ */
    public final float f57559;

    /* JADX INFO: renamed from: ܿ */
    public final float f57560;

    /* JADX INFO: renamed from: ᩳ */
    public final float f57561;

    /* JADX INFO: renamed from: ۧ */
    public final float m43878() {
        return this.f57561;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m43876() {
        return this.f57559;
    }

    public C1724(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f57561 = f;
        this.f57559 = f2;
        this.f57560 = f3;
        this.f57558 = f4;
        this.f57556 = f5;
        this.f57557 = f6;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0131  */
    /* JADX WARN: Code duplicated, block: B:38:0x0134  */
    /* JADX INFO: renamed from: ۧ */
    public static int m43875(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        C1479 c1479 = C1479.f41588;
        float f8 = f2;
        if (f8 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return C1689.m42300(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f9 = f8;
        C1724 c1724 = null;
        float f10 = 0.0f;
        boolean z = true;
        while (Math.abs(f10 - f8) >= 0.4f) {
            float f11 = 100.0f;
            float f12 = 1000.0f;
            float f13 = 1000.0f;
            float f14 = 0.0f;
            float f15 = 100.0f;
            C1724 c1725 = null;
            while (true) {
                if (Math.abs(f14 - f15) <= 0.01f) {
                    f4 = fMin;
                    f5 = f9;
                    break;
                }
                float f16 = ((f15 - f14) / 2.0f) + f14;
                int iM43877 = m43873(f16, f9, fMin).m43877(C1479.f41588);
                float fM42299 = C1689.m42299(Color.red(iM43877));
                float fM422910 = C1689.m42299(Color.green(iM43877));
                float fM422911 = C1689.m42299(Color.blue(iM43877));
                float[] fArr = C1689.f55501[1];
                float f17 = ((fM422911 * fArr[2]) + ((fM422910 * fArr[1]) + (fM42299 * fArr[0]))) / f11;
                float fCbrt = f17 <= 0.008856452f ? f17 * 903.2963f : (((float) Math.cbrt(f17)) * 116.0f) - 16.0f;
                float fAbs = Math.abs(f3 - fCbrt);
                if (fAbs < 0.2f) {
                    C1724 c1724M43874 = m43874(iM43877);
                    f5 = f9;
                    C1724 c1724M43873 = m43873(c1724M43874.f57560, c1724M43874.f57559, fMin);
                    f4 = fMin;
                    float f18 = c1724M43874.f57558 - c1724M43873.f57558;
                    float f19 = c1724M43874.f57556 - c1724M43873.f57556;
                    float f20 = c1724M43874.f57557 - c1724M43873.f57557;
                    double dSqrt = Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18));
                    f6 = f14;
                    f7 = f15;
                    float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                    if (fPow <= 1.0f) {
                        f13 = fPow;
                        c1725 = c1724M43874;
                        f12 = fAbs;
                    }
                    if (f12 != 0.0f && f13 == 0.0f) {
                        break;
                    }
                    if (fCbrt < f3) {
                        f14 = f16;
                        f15 = f7;
                    } else {
                        f14 = f6;
                        f15 = f16;
                    }
                    f11 = 100.0f;
                    f9 = f5;
                    fMin = f4;
                } else {
                    f4 = fMin;
                    f5 = f9;
                    f6 = f14;
                    f7 = f15;
                }
                f12 = f12;
                f13 = f13;
                if (f12 != 0.0f) {
                }
                if (fCbrt < f3) {
                    f14 = f16;
                    f15 = f7;
                } else {
                    f14 = f6;
                    f15 = f16;
                }
                f11 = 100.0f;
                f9 = f5;
                fMin = f4;
            }
            if (!z) {
                if (c1725 == null) {
                    f8 = f5;
                } else {
                    c1724 = c1725;
                    f10 = f5;
                }
                f9 = ((f8 - f10) / 2.0f) + f10;
            } else {
                if (c1725 != null) {
                    return c1725.m43877(c1479);
                }
                f9 = ((f8 - f10) / 2.0f) + f10;
                z = false;
            }
            fMin = f4;
        }
        if (c1724 == null) {
            return C1689.m42300(f3);
        }
        return c1724.m43877(c1479);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1724 m43874(int i) {
        C1479 c1479 = C1479.f41588;
        float fM42299 = C1689.m42299(Color.red(i));
        float fM422910 = C1689.m42299(Color.green(i));
        float fM422911 = C1689.m42299(Color.blue(i));
        float[][] fArr = C1689.f55501;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM422911) + (fArr2[1] * fM422910) + (fArr2[0] * fM42299);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM422911) + (fArr3[1] * fM422910) + (fArr3[0] * fM42299);
        float[] fArr4 = fArr[2];
        float f3 = (fM422911 * fArr4[2]) + (fM422910 * fArr4[1]) + (fM42299 * fArr4[0]);
        float[][] fArr5 = C1689.f55503;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float f7 = c1479.m33307()[0] * f4;
        float f8 = c1479.m33307()[1] * f5;
        float f9 = c1479.m33307()[2] * f6;
        float fPow = (float) Math.pow(((double) (Math.abs(f7) * c1479.m33304())) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f8) * c1479.m33304())) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f9) * c1479.m33304())) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f7) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f8) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f9) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f10 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f11 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f12 = fSignum2 * 20.0f;
        float f13 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f12)) / 20.0f;
        float f14 = (((fSignum * 40.0f) + f12) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f11, f10)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f15 = fAtan2;
        float f16 = (3.1415927f * f15) / 180.0f;
        float fPow4 = ((float) Math.pow((f14 * c1479.m33303()) / c1479.m33299(), c1479.m33302() * c1479.m33301())) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c1479.m33305()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f15) < 20.14d ? 360.0f + f15 : f15)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c1479.m33308()) * c1479.m33300()) * ((float) Math.sqrt((f11 * f11) + (f10 * f10)))) / (f13 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float fM33306 = c1479.m33306() * fSqrt;
        Math.sqrt((fPow5 * c1479.m33302()) / (c1479.m33299() + 4.0f));
        float f17 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((fM33306 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f16;
        return new C1724(f15, fSqrt, fPow4, f17, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1724 m43873(float f, float f2, float f3) {
        C1479 c1479 = C1479.f41588;
        c1479.m33302();
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float fM33306 = c1479.m33306() * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * c1479.m33302()) / (c1479.m33299() + 4.0f));
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fM33306) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C1724(f3, f2, f, f4, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: ֫ */
    public final int m43877(C1479 c1479) {
        float fSqrt;
        float f = this.f57559;
        double d = f;
        float f2 = this.f57560;
        if (d != 0.0d) {
            double d2 = f2;
            if (d2 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) Math.sqrt(d2 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, c1479.m33305()), 0.73d), 1.1111111111111112d);
        double d3 = (this.f57561 * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fM33299 = c1479.m33299() * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) c1479.m33302())) / ((double) c1479.m33301())));
        float fM33308 = fCos * 3846.1538f * c1479.m33308() * c1479.m33300();
        float fM33303 = fM33299 / c1479.m33303();
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f3 = (((0.305f + fM33303) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (fM33308 * 23.0f)));
        float f4 = fCos2 * f3;
        float f5 = f3 * fSin;
        float f6 = fM33303 * 460.0f;
        float f7 = ((288.0f * f5) + ((451.0f * f4) + f6)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
        float fM33304 = (100.0f / c1479.m33304()) * Math.signum(f7) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float fM33305 = (100.0f / c1479.m33304()) * Math.signum(f8) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8)))), 2.380952380952381d));
        float fM33306 = (100.0f / c1479.m33304()) * Math.signum(f9) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9)))), 2.380952380952381d));
        float f10 = fM33304 / c1479.m33307()[0];
        float f11 = fM33305 / c1479.m33307()[1];
        float f12 = fM33306 / c1479.m33307()[2];
        float[][] fArr = C1689.f55500;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[2] * f12) + (fArr2[1] * f11) + (fArr2[0] * f10);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[2] * f12) + (fArr3[1] * f11) + (fArr3[0] * f10);
        float[] fArr4 = fArr[2];
        return C1199.m21212(f13, f14, (f12 * fArr4[2]) + (f11 * fArr4[1]) + (f10 * fArr4[0]));
    }
}
