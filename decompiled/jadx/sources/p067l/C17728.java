package p067l;

import android.graphics.Path;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.logging.Level;
import java.util.logging.Logger;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ܺ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBJM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17728 {

    /* JADX INFO: renamed from: ֫ */
    public static final Logger f52948 = Logger.getLogger("VdNodeRender");

    /* JADX INFO: renamed from: ֫ */
    public static void m40286(C4989[] c4989Arr, Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        C4989[] c4989Arr2 = c4989Arr;
        float[] fArr = new float[6];
        int length = c4989Arr2.length;
        char cM10567 = ' ';
        int i2 = 0;
        while (i2 < length) {
            C4989 c4989 = c4989Arr2[i2];
            char cM10568 = c4989.m10567();
            float[] fArrM10566 = c4989.m10566();
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[2];
            float f10 = fArr[3];
            float f11 = fArr[4];
            float f12 = fArr[5];
            switch (cM10568) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case C0254q.f1216f /* 99 */:
                    i = 6;
                    break;
                case 'H':
                case HRSS1373Polynomial.f81792K /* 86 */:
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
                    f7 = f11;
                    f8 = f12;
                default:
                    i = 2;
                    break;
            }
            float f13 = f7;
            float f14 = f8;
            float f15 = f11;
            float f16 = f12;
            int i3 = 0;
            while (i3 < fArrM10566.length) {
                switch (cM10568) {
                    case 'A':
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        int i4 = i3 + 5;
                        int i5 = i3 + 6;
                        m40285(path, f13, f14, fArrM10566[i4], fArrM10566[i5], Math.abs(fArrM10566[i3]), Math.abs(fArrM10566[i3 + 1]), fArrM10566[i3 + 2], fArrM10566[i3 + 3] != 0.0f, fArrM10566[i3 + 4] != 0.0f);
                        f9 = fArrM10566[i4];
                        f13 = f9;
                        f10 = fArrM10566[i5];
                        f14 = f10;
                        break;
                    case 'C':
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        int i6 = i3 + 2;
                        int i7 = i3 + 3;
                        int i8 = i3 + 4;
                        int i9 = i3 + 5;
                        path.cubicTo(fArrM10566[i3], fArrM10566[i3 + 1], fArrM10566[i6], fArrM10566[i7], fArrM10566[i8], fArrM10566[i9]);
                        float f17 = fArrM10566[i8];
                        float f18 = fArrM10566[i9];
                        float f19 = fArrM10566[i6];
                        f10 = fArrM10566[i7];
                        f13 = f17;
                        f14 = f18;
                        f9 = f19;
                        break;
                    case 'H':
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        f = f14;
                        path.lineTo(fArrM10566[i3], f);
                        f13 = fArrM10566[i3];
                        f14 = f;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        f2 = fArrM10566[i3];
                        f3 = fArrM10566[i3 + 1];
                        path.lineTo(f2, f3);
                        f13 = f2;
                        f14 = f3;
                        break;
                    case 'M':
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        f2 = fArrM10566[i3];
                        f3 = fArrM10566[i3 + 1];
                        if (i3 > 0) {
                            path.lineTo(f2, f3);
                            f13 = f2;
                            f14 = f3;
                        } else {
                            path.moveTo(f2, f3);
                            f13 = f2;
                            f15 = f13;
                            f14 = f3;
                            f16 = f14;
                        }
                        break;
                    case 'Q':
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        int i10 = i3 + 1;
                        int i11 = i3 + 2;
                        int i12 = i3 + 3;
                        path.quadTo(fArrM10566[i3], fArrM10566[i10], fArrM10566[i11], fArrM10566[i12]);
                        f13 = fArrM10566[i11];
                        f14 = fArrM10566[i12];
                        f9 = fArrM10566[i3];
                        f10 = fArrM10566[i10];
                        break;
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        float f20 = f14;
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        float f21 = f13;
                        boolean z = cM10567 == 'c' || cM10567 == 's' || cM10567 == 'C' || cM10567 == 'S';
                        float f22 = z ? (f21 * 2.0f) - f9 : f21;
                        int i13 = i3 + 1;
                        int i14 = i3 + 2;
                        int i15 = i3 + 3;
                        path.cubicTo(f22, z ? (f20 * 2.0f) - f10 : f20, fArrM10566[i3], fArrM10566[i13], fArrM10566[i14], fArrM10566[i15]);
                        float f23 = fArrM10566[i3];
                        float f24 = fArrM10566[i13];
                        float f25 = fArrM10566[i14];
                        f = fArrM10566[i15];
                        f13 = f25;
                        f9 = f23;
                        f10 = f24;
                        f14 = f;
                        break;
                    case 'T':
                        float f26 = f14;
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        float f27 = f13;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        boolean z2 = cM10567 == 'q' || cM10567 == 't' || cM10567 == 'Q' || cM10567 == 'T';
                        float f28 = z2 ? (f27 * 2.0f) - f9 : f27;
                        float f29 = z2 ? (f26 * 2.0f) - f10 : f26;
                        int i16 = i3 + 1;
                        path.quadTo(f28, f29, fArrM10566[i3], fArrM10566[i16]);
                        f2 = fArrM10566[i3];
                        f3 = fArrM10566[i16];
                        f10 = f29;
                        f9 = f28;
                        f13 = f2;
                        f14 = f3;
                        break;
                    case HRSS1373Polynomial.f81792K /* 86 */:
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        path.lineTo(f13, fArrM10566[i3]);
                        f3 = fArrM10566[i3];
                        f14 = f3;
                        break;
                    case 'Z':
                    case 'z':
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        path.close();
                        f13 = f15;
                        f14 = f16;
                        break;
                    case 'a':
                        int i17 = i3 + 5;
                        int i18 = i3 + 6;
                        float f30 = f13;
                        length = length;
                        i2 = i2;
                        i3 = i3;
                        fArrM10566 = fArrM10566;
                        fArr = fArr;
                        m40285(path, f13, f14, fArrM10566[i17] + f13, fArrM10566[i18] + f14, Math.abs(fArrM10566[i3]), Math.abs(fArrM10566[i3 + 1]), fArrM10566[i3 + 2], fArrM10566[i3 + 3] != 0.0f, fArrM10566[i3 + 4] != 0.0f);
                        f13 = f30 + fArrM10566[i17];
                        f14 += fArrM10566[i18];
                        f10 = f14;
                        f9 = f13;
                        break;
                    case C0254q.f1216f /* 99 */:
                        int i19 = i3 + 2;
                        int i20 = i3 + 3;
                        int i21 = i3 + 4;
                        int i22 = i3 + 5;
                        path.cubicTo(fArrM10566[i3] + f13, fArrM10566[i3 + 1] + f14, fArrM10566[i19] + f13, fArrM10566[i20] + f14, fArrM10566[i21] + f13, fArrM10566[i22] + f14);
                        f4 = fArrM10566[i19] + f13;
                        f5 = fArrM10566[i20] + f14;
                        f13 += fArrM10566[i21];
                        f6 = fArrM10566[i22];
                        f14 += f6;
                        f9 = f4;
                        f10 = f5;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        break;
                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                        f13 += fArrM10566[i3];
                        path.lineTo(f13, f14);
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        break;
                    case 'l':
                        f13 += fArrM10566[i3];
                        f14 += fArrM10566[i3 + 1];
                        path.lineTo(f13, f14);
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        break;
                    case 'm':
                        f13 += fArrM10566[i3];
                        f14 += fArrM10566[i3 + 1];
                        if (i3 > 0) {
                            path.lineTo(f13, f14);
                        } else {
                            path.moveTo(f13, f14);
                            f16 = f14;
                            f15 = f13;
                        }
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        break;
                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                        int i23 = i3 + 1;
                        int i24 = i3 + 2;
                        int i25 = i3 + 3;
                        path.quadTo(fArrM10566[i3] + f13, fArrM10566[i23] + f14, fArrM10566[i24] + f13, fArrM10566[i25] + f14);
                        f4 = fArrM10566[i3] + f13;
                        f5 = fArrM10566[i23] + f14;
                        f13 += fArrM10566[i24];
                        f6 = fArrM10566[i25];
                        f14 += f6;
                        f9 = f4;
                        f10 = f5;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        break;
                    case 's':
                        boolean z3 = cM10567 == 'c' || cM10567 == 's' || cM10567 == 'C' || cM10567 == 'S';
                        int i26 = i3 + 1;
                        int i27 = i3 + 2;
                        int i28 = i3 + 3;
                        path.cubicTo(z3 ? (f13 * 2.0f) - f9 : f13, z3 ? (2.0f * f14) - f10 : f14, f13 + fArrM10566[i3], f14 + fArrM10566[i26], f13 + fArrM10566[i27], f14 + fArrM10566[i28]);
                        f4 = fArrM10566[i3] + f13;
                        f5 = fArrM10566[i26] + f14;
                        f13 += fArrM10566[i27];
                        f6 = fArrM10566[i28];
                        f14 += f6;
                        f9 = f4;
                        f10 = f5;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        break;
                    case 't':
                        boolean z4 = cM10567 == 'q' || cM10567 == 't' || cM10567 == 'Q' || cM10567 == 'T';
                        float f31 = z4 ? (f13 * 2.0f) - f9 : f13;
                        float f32 = z4 ? (2.0f * f14) - f10 : f14;
                        int i29 = i3 + 1;
                        path.quadTo(f31, f32, fArrM10566[i3] + f13, fArrM10566[i29] + f14);
                        f13 += fArrM10566[i3];
                        f14 += fArrM10566[i29];
                        f10 = f32;
                        f9 = f31;
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        break;
                    case 'v':
                        f14 += fArrM10566[i3];
                        path.lineTo(f13, f14);
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        break;
                    default:
                        length = length;
                        i2 = i2;
                        fArr = fArr;
                        break;
                }
                i3 += i;
                path = path;
                cM10567 = cM10568;
                length = length;
                fArrM10566 = fArrM10566;
                i2 = i2;
                fArr = fArr;
            }
            float[] fArr2 = fArr;
            fArr2[0] = f13;
            fArr2[1] = f14;
            fArr2[2] = f9;
            fArr2[3] = f10;
            fArr2[4] = f15;
            fArr2[5] = f16;
            cM10567 = c4989.m10567();
            i2++;
            c4989Arr2 = c4989Arr;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40285(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        Level level = Level.FINE;
        String str = MotionUtils.EASING_TYPE_FORMAT_START + d + "," + d2 + ")-(" + d3 + "," + d4 + ") {" + d5 + " " + d6 + C0249l.f1198d;
        Logger logger = f52948;
        logger.log(level, str);
        double d10 = (d7 * 3.141592653589793d) / 180.0d;
        double dCos = Math.cos(d10);
        double dSin = Math.sin(d10);
        double dM14667 = C6406.m14667(d2, dSin, d * dCos, d5);
        double dM14668 = C6406.m14667(d2, dCos, (-d) * dSin, d6);
        double dM14669 = C6406.m14667(d4, dSin, d3 * dCos, d5);
        double dM146610 = C6406.m14667(d4, dCos, (-d3) * dSin, d6);
        logger.log(level, "unit space (" + dM14667 + "," + dM14668 + ")-(" + dM14669 + "," + dM146610 + MotionUtils.EASING_TYPE_FORMAT_END);
        double d11 = dM14667 - dM14669;
        double d12 = dM14668 - dM146610;
        double d13 = (dM14667 + dM14669) / 2.0d;
        double d14 = (dM14668 + dM146610) / 2.0d;
        double d15 = (d12 * d12) + (d11 * d11);
        if (d15 == 0.0d) {
            logger.log(level, " Points are coincident");
            return;
        }
        double d16 = (1.0d / d15) - 0.25d;
        if (d16 < 0.0d) {
            logger.log(level, "Points are too far apart " + d15);
            double dSqrt = Math.sqrt(d15) / 1.99999d;
            m40285(path, d, d2, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double d17 = d5;
        double dSqrt2 = Math.sqrt(d16);
        double d18 = d11 * dSqrt2;
        double d19 = dSqrt2 * d12;
        if (z == z2) {
            d8 = d13 - d19;
            d9 = d14 + d18;
        } else {
            d8 = d13 + d19;
            d9 = d14 - d18;
        }
        double d20 = dM14668 - d9;
        double d21 = dM14667 - d8;
        double dAtan2 = Math.atan2(d20, d21);
        logger.log(level, "eta0 = Math.atan2(" + d20 + ", " + d21 + ") = " + Math.toDegrees(dAtan2));
        double d22 = dM146610 - d9;
        double d23 = dM14669 - d8;
        double dAtan3 = Math.atan2(d22, d23);
        logger.log(level, "eta1 = Math.atan2(" + d22 + ", " + d23 + ") = " + Math.toDegrees(dAtan3));
        double d24 = dAtan3 - dAtan2;
        if (z2 != (d24 >= 0.0d)) {
            d24 = d24 > 0.0d ? d24 - 6.283185307179586d : d24 + 6.283185307179586d;
        }
        double d25 = d8 * d17;
        double d26 = d9 * d6;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        logger.log(level, "cx = " + d27 + ", cy = " + d28 + ", a = " + d17 + ", b = " + d6 + ", x0 = " + d + ", y0 = " + d2 + ", thetaD = " + Math.toDegrees(d10) + ", eta0 = " + Math.toDegrees(dAtan2) + ", sweep = " + Math.toDegrees(d24));
        int iCeil = (int) Math.ceil(Math.abs((d24 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d10);
        double dSin2 = Math.sin(d10);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d17;
        double d30 = d29 * dCos2;
        double d31 = d6 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d6 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = d24 / ((double) iCeil);
        int i = 0;
        double d37 = dAtan2;
        double d38 = d32;
        double d39 = d35;
        double d40 = d2;
        while (i < iCeil) {
            double d41 = d37 + d36;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            double d42 = d27;
            double d43 = (((d17 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d44 = (d34 * dSin4) + (d17 * dSin2 * dCos4) + d28;
            double d45 = (d30 * dSin4) - (d31 * dCos4);
            double d46 = (dCos4 * d34) + (dSin4 * d33);
            double d47 = d41 - d37;
            double dTan = Math.tan(d47 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.cubicTo((float) ((d38 * dSqrt3) + d), (float) ((d39 * dSqrt3) + d40), (float) (d43 - (dSqrt3 * d45)), (float) (d44 - (dSqrt3 * d46)), (float) d43, (float) d44);
            i++;
            iCeil = iCeil;
            d34 = d34;
            d17 = d5;
            d33 = d33;
            d = d43;
            dCos2 = dCos2;
            d37 = d41;
            d39 = d46;
            d38 = d45;
            d27 = d42;
            d40 = d44;
            d28 = d28;
        }
    }
}
