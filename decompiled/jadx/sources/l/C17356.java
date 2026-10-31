package l;

import android.graphics.Path;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ܿ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 7553 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17356 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] f53161;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char f53162;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m40688() {
        return this.f53162;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] m40687() {
        return this.f53161;
    }

    public C17356(char c, float[] fArr) {
        this.f53162 = c;
        this.f53161 = fArr;
    }

    public C17356(C17356 c17356) {
        this.f53162 = c17356.f53162;
        float[] fArr = c17356.f53161;
        this.f53161 = C14533.m34678(fArr.length, fArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40686(C17356 c17356, C17356 c17357, float f) {
        this.f53162 = c17356.f53162;
        int i = 0;
        while (true) {
            float[] fArr = c17356.f53161;
            if (i >= fArr.length) {
                return;
            }
            this.f53161[i] = (c17357.f53161[i] * f) + ((1.0f - f) * fArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40683(Path path, float[] fArr, char c, char c2, float[] fArr2) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        char c3 = c2;
        float f16 = fArr[0];
        float f17 = fArr[1];
        float f18 = fArr[2];
        float f19 = fArr[3];
        float f20 = fArr[4];
        float f21 = fArr[5];
        switch (c3) {
            case 'A':
            case 'a':
                i = 7;
                break;
            case 'C':
            case q.f /* 99 */:
                i = 6;
                break;
            case 'H':
            case HRSS1373Polynomial.K /* 86 */:
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
            case 'v':
                i = 1;
                break;
            case 'Q':
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
            case 's':
                i = 4;
                break;
            case 'Z':
            case 'z':
                path.close();
                path.moveTo(f20, f21);
                f16 = f20;
                f18 = f16;
                f17 = f21;
                f19 = f17;
            default:
                i = 2;
                break;
        }
        float f22 = f16;
        float f23 = f17;
        float f24 = f20;
        float f25 = f21;
        int i3 = 0;
        char c4 = c;
        while (i3 < fArr2.length) {
            if (c3 != 'A') {
                if (c3 == 'C') {
                    i2 = i3;
                    int i4 = i2 + 2;
                    int i5 = i2 + 3;
                    int i6 = i2 + 4;
                    int i7 = i2 + 5;
                    path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i4], fArr2[i5], fArr2[i6], fArr2[i7]);
                    f = fArr2[i6];
                    f2 = fArr2[i7];
                    f18 = fArr2[i4];
                    f19 = fArr2[i5];
                } else if (c3 != 'H') {
                    if (c3 == 'Q') {
                        i2 = i3;
                        int i8 = i2 + 1;
                        int i9 = i2 + 2;
                        int i10 = i2 + 3;
                        path.quadTo(fArr2[i2], fArr2[i8], fArr2[i9], fArr2[i10]);
                        f3 = fArr2[i2];
                        f4 = fArr2[i8];
                        f5 = fArr2[i9];
                        f23 = fArr2[i10];
                    } else if (c3 == 'V') {
                        i2 = i3;
                        i = i;
                        path.lineTo(f22, fArr2[i2]);
                        f23 = fArr2[i2];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 != 'h') {
                                if (c3 == 'q') {
                                    int i11 = i3 + 1;
                                    int i12 = i3 + 2;
                                    int i13 = i3 + 3;
                                    path.rQuadTo(fArr2[i3], fArr2[i11], fArr2[i12], fArr2[i13]);
                                    f7 = fArr2[i3] + f22;
                                    f8 = fArr2[i11] + f23;
                                    f22 += fArr2[i12];
                                    f9 = fArr2[i13];
                                } else if (c3 != 'v') {
                                    if (c3 != 'L') {
                                        if (c3 == 'M') {
                                            f10 = fArr2[i3];
                                            f11 = fArr2[i3 + 1];
                                            if (i3 > 0) {
                                                path.lineTo(f10, f11);
                                            } else {
                                                path.moveTo(f10, f11);
                                                f22 = f10;
                                                f25 = f11;
                                            }
                                        } else if (c3 == 'S') {
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f22 = (f22 * 2.0f) - f18;
                                                f23 = (f23 * 2.0f) - f19;
                                            }
                                            float f26 = f22;
                                            int i14 = i3 + 1;
                                            int i15 = i3 + 2;
                                            int i16 = i3 + 3;
                                            path.cubicTo(f26, f23, fArr2[i3], fArr2[i14], fArr2[i15], fArr2[i16]);
                                            f3 = fArr2[i3];
                                            f4 = fArr2[i14];
                                            f5 = fArr2[i15];
                                            f23 = fArr2[i16];
                                            i2 = i3;
                                        } else if (c3 == 'T') {
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f22 = (f22 * 2.0f) - f18;
                                                f23 = (f23 * 2.0f) - f19;
                                            }
                                            int i17 = i3 + 1;
                                            path.quadTo(f22, f23, fArr2[i3], fArr2[i17]);
                                            f = fArr2[i3];
                                            f2 = fArr2[i17];
                                            i2 = i3;
                                            f19 = f23;
                                            f18 = f22;
                                        } else if (c3 == 'l') {
                                            int i18 = i3 + 1;
                                            path.rLineTo(fArr2[i3], fArr2[i18]);
                                            f22 += fArr2[i3];
                                            f6 = fArr2[i18];
                                        } else if (c3 == 'm') {
                                            float f27 = fArr2[i3];
                                            f22 += f27;
                                            float f28 = fArr2[i3 + 1];
                                            f23 += f28;
                                            if (i3 > 0) {
                                                path.rLineTo(f27, f28);
                                            } else {
                                                path.rMoveTo(f27, f28);
                                                f25 = f23;
                                            }
                                        } else if (c3 == 's') {
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                float f29 = f22 - f18;
                                                f12 = f23 - f19;
                                                f13 = f29;
                                            } else {
                                                f13 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i19 = i3 + 1;
                                            int i20 = i3 + 2;
                                            int i21 = i3 + 3;
                                            path.rCubicTo(f13, f12, fArr2[i3], fArr2[i19], fArr2[i20], fArr2[i21]);
                                            f7 = fArr2[i3] + f22;
                                            f8 = fArr2[i19] + f23;
                                            f22 += fArr2[i20];
                                            f9 = fArr2[i21];
                                        } else if (c3 == 't') {
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f14 = f22 - f18;
                                                f15 = f23 - f19;
                                            } else {
                                                f15 = 0.0f;
                                                f14 = 0.0f;
                                            }
                                            int i22 = i3 + 1;
                                            path.rQuadTo(f14, f15, fArr2[i3], fArr2[i22]);
                                            f18 = f14 + f22;
                                            float f30 = f15 + f23;
                                            f22 += fArr2[i3];
                                            f23 += fArr2[i22];
                                            f19 = f30;
                                        }
                                        f24 = f22;
                                        f23 = f25;
                                    } else {
                                        int i23 = i3 + 1;
                                        path.lineTo(fArr2[i3], fArr2[i23]);
                                        f10 = fArr2[i3];
                                        f11 = fArr2[i23];
                                    }
                                    f22 = f10;
                                    f23 = f11;
                                } else {
                                    path.rLineTo(0.0f, fArr2[i3]);
                                    f6 = fArr2[i3];
                                }
                                f19 = f8;
                                f23 += f9;
                                f18 = f7;
                            } else {
                                path.rLineTo(fArr2[i3], 0.0f);
                                f22 += fArr2[i3];
                            }
                            i2 = i3;
                            i = i;
                        } else {
                            int i24 = i3 + 2;
                            int i25 = i3 + 3;
                            int i26 = i3 + 4;
                            int i27 = i3 + 5;
                            path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                            f18 = fArr2[i24] + f22;
                            f19 = fArr2[i25] + f23;
                            f22 += fArr2[i26];
                            f6 = fArr2[i27];
                        }
                        f23 += f6;
                        i2 = i3;
                        i = i;
                    } else {
                        int i28 = i3 + 5;
                        int i29 = i3 + 6;
                        i2 = i3;
                        i = i;
                        m40682(path, f22, f23, fArr2[i28] + f22, fArr2[i29] + f23, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f22 += fArr2[i28];
                        f23 += fArr2[i29];
                        f19 = f23;
                        f18 = f22;
                    }
                    f19 = f4;
                    f22 = f5;
                    f18 = f3;
                } else {
                    i2 = i3;
                    i = i;
                    path.lineTo(fArr2[i2], f23);
                    f22 = fArr2[i2];
                }
                f22 = f;
                f23 = f2;
            } else {
                i2 = i3;
                i = i;
                int i30 = i2 + 5;
                int i31 = i2 + 6;
                m40682(path, f22, f23, fArr2[i30], fArr2[i31], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                float f31 = fArr2[i30];
                f23 = fArr2[i31];
                f18 = f31;
                f22 = f18;
                f19 = f23;
            }
            i3 = i2 + i;
            c4 = c2;
            c3 = c4;
            i = i;
        }
        fArr[0] = f22;
        fArr[1] = f23;
        fArr[2] = f18;
        fArr[3] = f19;
        fArr[4] = f24;
        fArr[5] = f25;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40682(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = f5;
        double d6 = ((d4 * dSin) + (d3 * dCos)) / d5;
        double d7 = f6;
        double d8 = ((d4 * dCos) + (((double) (-f)) * dSin)) / d7;
        double d9 = f4;
        double d10 = d4;
        double d11 = d3;
        double dM12787 = C4248.m12787(d9, dSin, ((double) f3) * dCos, d5);
        double dM12788 = C4248.m12787(d9, dCos, ((double) (-f3)) * dSin, d7);
        double d12 = d6 - dM12787;
        double d13 = d8 - dM12788;
        double d14 = (d6 + dM12787) / 2.0d;
        double d15 = (d8 + dM12788) / 2.0d;
        double d16 = (d13 * d13) + (d12 * d12);
        if (d16 == 0.0d) {
            return;
        }
        double d17 = (1.0d / d16) - 0.25d;
        if (d17 < 0.0d) {
            float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
            m40682(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d17);
        double d18 = d12 * dSqrt;
        double d19 = dSqrt * d13;
        if (z == z2) {
            d = d14 - d19;
            d2 = d15 + d18;
        } else {
            d = d14 + d19;
            d2 = d15 - d18;
        }
        double dAtan2 = Math.atan2(d8 - d2, d6 - d);
        double dAtan3 = Math.atan2(dM12788 - d2, dM12787 - d) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d20 = d5;
        double d21 = d * d20;
        double d22 = d2 * d7;
        double d23 = (d21 * dCos) - (d22 * dSin);
        double d24 = (d22 * dCos) + (d21 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d25 = -d20;
        double d26 = d25 * dCos2;
        double d27 = d7 * dSin2;
        double d28 = (d26 * dSin3) - (d27 * dCos3);
        double d29 = d25 * dSin2;
        double d30 = d7 * dCos2;
        double d31 = dAtan3 / ((double) iCeil);
        int i = 0;
        double d32 = (dCos3 * d30) + (dSin3 * d29);
        double d33 = dAtan2;
        while (i < iCeil) {
            double d34 = d33 + d31;
            double dSin4 = Math.sin(d34);
            double dCos4 = Math.cos(d34);
            double d35 = (((d20 * dCos2) * dCos4) + d23) - (d27 * dSin4);
            double d36 = (d30 * dSin4) + (d20 * dSin2 * dCos4) + d24;
            double d37 = (d26 * dSin4) - (d27 * dCos4);
            double d38 = (dCos4 * d30) + (dSin4 * d29);
            double d39 = d34 - d33;
            double dTan = Math.tan(d39 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d39)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d28 * dSqrt2) + d11), (float) ((d32 * dSqrt2) + d10), (float) (d35 - (dSqrt2 * d37)), (float) (d36 - (dSqrt2 * d38)), (float) d35, (float) d36);
            i++;
            d30 = d30;
            d20 = d20;
            d11 = d35;
            d10 = d36;
            d29 = d29;
            d23 = d23;
            iCeil = iCeil;
            d33 = d34;
            d32 = d38;
            d28 = d37;
            d31 = d31;
            dSin2 = dSin2;
        }
    }
}
