package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۖ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABJA */
/* JADX INFO: loaded from: classes2.dex */
public final class C4989 {

    /* JADX INFO: renamed from: ֫ */
    public float[] f11363;

    /* JADX INFO: renamed from: ۧ */
    public char f11364;

    /* JADX INFO: renamed from: ۧ */
    public final char m10567() {
        return this.f11364;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float[] m10566() {
        return this.f11363;
    }

    public C4989(char c, float[] fArr) {
        this.f11364 = c;
        this.f11363 = fArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m10565(C4989[] c4989Arr) {
        char c = ' ';
        for (C4989 c4989 : c4989Arr) {
            if ((c == 'z' || c == 'Z') && c4989.f11364 == 'm') {
                return true;
            }
            c = c4989.f11364;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m10561(C4989[] c4989Arr, C11695 c11695) {
        char c;
        boolean z;
        StringBuilder sb = new StringBuilder();
        for (C4989 c4989 : c4989Arr) {
            sb.append(c4989.f11364);
            int length = c4989.f11363.length;
            char c2 = c4989.f11364;
            if ((c2 == 'm' || c2 == 'M') && length > 2) {
                c = c2 == 'm' ? 'l' : 'L';
                z = true;
            } else {
                c = ' ';
                z = false;
            }
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append(i % 2 != 0 ? "," : " ");
                }
                if (z && i == 2) {
                    sb.append(c);
                }
                float f = c4989.f11363[i];
                if (Math.abs(f) > Float.MAX_VALUE) {
                    throw new IllegalArgumentException("Invalid number: " + f);
                }
                sb.append(c11695.m26862(f));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10563(C2976 c2976, C4989[] c4989Arr) {
        C4989 c4989;
        float f;
        float f2;
        float f3;
        int i;
        C4989 c49810;
        int i2;
        C4989[] c4989Arr2 = c4989Arr;
        C17057 c17057 = new C17057();
        C17057 c17058 = new C17057();
        int length = c4989Arr2.length;
        char c = ' ';
        int i3 = 0;
        while (i3 < length) {
            C4989 c49811 = c4989Arr2[i3];
            int length2 = c49811.f11363.length;
            int i4 = length2 * 2;
            float[] fArr = new float[i4];
            float f4 = c17057.f50443;
            float f5 = c17057.f50444;
            float f6 = c17058.f50443;
            float f7 = c17058.f50444;
            int i5 = i3;
            int iIntValue = ((Integer) C6330.f16410.get(Character.valueOf(c49811.f11364))).intValue();
            switch (c49811.f11364) {
                case 'A':
                    f7 = f7;
                    f6 = f6;
                    c17058 = c17058;
                    length = length;
                    c4989 = c49811;
                    float f8 = f4;
                    f7 = f5;
                    int i6 = 0;
                    while (i6 < (length2 - iIntValue) + 1) {
                        if (!m10564(c2976)) {
                            float[] fArr2 = c4989.f11363;
                            int i7 = i6 + 1;
                            int i8 = i6 + 2;
                            int i9 = i6 + 4;
                            C17788 c17788 = new C17788(c2976, f8, f7, fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i6 + 3], fArr2[i9], fArr2[i6 + 5], fArr2[i6 + 6]);
                            c4989.f11363[i6] = c17788.m40393();
                            c4989.f11363[i7] = c17788.m40394();
                            c4989.f11363[i8] = c17788.m40395();
                            if (c17788.m40392()) {
                                float[] fArr3 = c4989.f11363;
                                fArr3[i9] = 1.0f - fArr3[i9];
                            }
                        }
                        float[] fArr4 = c4989.f11363;
                        int i10 = i6 + 5;
                        float f9 = fArr4[i10];
                        float f10 = fArr4[i6 + 6];
                        c2976.m4949(fArr4, i10, fArr4, i10, 1);
                        i6 += iIntValue;
                        f8 = f9;
                        f7 = f10;
                    }
                    f6 = f8;
                    f2 = f7;
                    f3 = f6;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c17059 = c17058;
                    c17059.f50443 = f3;
                    c17059.f50444 = f2;
                    char c2 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c17059;
                    c = c2;
                    length = length;
                    break;
                case 'C':
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                case 'Q':
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                case 'T':
                    f7 = f7;
                    f6 = f6;
                    c4989 = c49811;
                    float[] fArr5 = c4989.f11363;
                    float f11 = fArr5[length2 - 2];
                    float f12 = fArr5[length2 - 1];
                    c2976.m4949(fArr5, 0, fArr5, 0, length2 / 2);
                    f6 = f11;
                    f7 = f12;
                    f2 = f7;
                    f3 = f6;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c170510 = c17058;
                    c170510.f50443 = f3;
                    c170510.f50444 = f2;
                    char c3 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c170510;
                    c = c3;
                    length = length;
                    break;
                case 'H':
                    c4989 = c49811;
                    c4989.f11364 = 'L';
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = i11 * 2;
                        float[] fArr6 = c4989.f11363;
                        fArr[i12] = fArr6[i11];
                        fArr[i12 + 1] = f5;
                        f4 = fArr6[i11];
                    }
                    f = f5;
                    c2976.m4949(fArr, 0, fArr, 0, length2);
                    c4989.f11363 = fArr;
                    f7 = f;
                    f6 = f4;
                    f2 = f7;
                    f3 = f6;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c170511 = c17058;
                    c170511.f50443 = f3;
                    c170511.f50444 = f2;
                    char c4 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c170511;
                    c = c4;
                    length = length;
                    break;
                case 'M':
                    c4989 = c49811;
                    float[] fArr7 = c4989.f11363;
                    float f13 = fArr7[0];
                    f7 = fArr7[1];
                    f6 = f13;
                    float[] fArr8 = c4989.f11363;
                    float f14 = fArr8[length2 - 2];
                    float f15 = fArr8[length2 - 1];
                    c2976.m4949(fArr8, 0, fArr8, 0, length2 / 2);
                    f6 = f14;
                    f7 = f15;
                    f2 = f7;
                    f3 = f6;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c170512 = c17058;
                    c170512.f50443 = f3;
                    c170512.f50444 = f2;
                    char c5 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c170512;
                    c = c5;
                    length = length;
                    break;
                case HRSS1373Polynomial.f81792K /* 86 */:
                    c4989 = c49811;
                    c4989.f11364 = 'L';
                    f = f5;
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = i13 * 2;
                        fArr[i14] = f4;
                        float[] fArr9 = c4989.f11363;
                        fArr[i14 + 1] = fArr9[i13];
                        f = fArr9[i13];
                    }
                    c2976.m4949(fArr, 0, fArr, 0, length2);
                    c4989.f11363 = fArr;
                    f7 = f;
                    f6 = f4;
                    f2 = f7;
                    f3 = f6;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c170513 = c17058;
                    c170513.f50443 = f3;
                    c170513.f50444 = f2;
                    char c6 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c170513;
                    c = c6;
                    length = length;
                    break;
                case 'Z':
                case 'z':
                    c17058 = c17058;
                    length = length;
                    c4989 = c49811;
                    f2 = f7;
                    f3 = f6;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c170514 = c17058;
                    c170514.f50443 = f3;
                    c170514.f50444 = f2;
                    char c7 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c170514;
                    c = c7;
                    length = length;
                    break;
                case 'a':
                    float f16 = f4;
                    C2976 c2977 = c2976;
                    int i15 = 0;
                    while (i15 < (length2 - iIntValue) + 1) {
                        float[] fArr10 = c49811.f11363;
                        int i16 = i15 + 5;
                        float f17 = f16 + fArr10[i16];
                        int i17 = i15 + 6;
                        float f18 = f5 + fArr10[i17];
                        if (m10564(c2977)) {
                            i = i15;
                            c49810 = c49811;
                        } else {
                            float[] fArr11 = c49811.f11363;
                            int i18 = i15 + 1;
                            int i19 = i15 + 2;
                            int i20 = i15 + 4;
                            c49810 = c49811;
                            i = i15;
                            C17788 c17789 = new C17788(c2976, f16, f5, fArr11[i15], fArr11[i18], fArr11[i19], fArr11[i15 + 3], fArr11[i20], f16 + fArr11[i16], f5 + fArr11[i17]);
                            m10562(c2976, c49810.f11363, i16, 2);
                            c49810.f11363[i] = c17789.m40393();
                            c49810.f11363[i18] = c17789.m40394();
                            c49810.f11363[i19] = c17789.m40395();
                            if (c17789.m40392()) {
                                float[] fArr12 = c49810.f11363;
                                fArr12[i20] = 1.0f - fArr12[i20];
                            }
                            c2977 = c2976;
                        }
                        i15 = i + iIntValue;
                        c49811 = c49810;
                        length2 = length2;
                        f16 = f17;
                        f5 = f18;
                        length = length;
                        c17058 = c17058;
                        f7 = f7;
                        f6 = f6;
                    }
                    f7 = f7;
                    f6 = f6;
                    c17058 = c17058;
                    length = length;
                    c4989 = c49811;
                    f6 = f16;
                    f7 = f5;
                    f2 = f7;
                    f3 = f6;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c170515 = c17058;
                    c170515.f50443 = f3;
                    c170515.f50444 = f2;
                    char c8 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c170515;
                    c = c8;
                    length = length;
                    break;
                case C0254q.f1216f /* 99 */:
                case 'l':
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case 's':
                case 't':
                    int i21 = 0;
                    while (i21 < (length2 - iIntValue) + 1) {
                        float[] fArr13 = c49811.f11363;
                        i21 += iIntValue;
                        f4 += fArr13[i21 - 2];
                        f5 += fArr13[i21 - 1];
                    }
                    if (!m10564(c2976)) {
                        m10562(c2976, c49811.f11363, 0, length2);
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c4989 = c49811;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c170516 = c17058;
                    c170516.f50443 = f3;
                    c170516.f50444 = f2;
                    char c9 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c170516;
                    c = c9;
                    length = length;
                    break;
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    for (int i22 = 0; i22 < length2; i22++) {
                        float f19 = c49811.f11363[i22];
                        f4 += f19;
                        int i23 = i22 * 2;
                        fArr[i23] = f19;
                        fArr[i23 + 1] = 0.0f;
                    }
                    if (!m10564(c2976)) {
                        c49811.f11364 = 'l';
                        m10562(c2976, fArr, 0, i4);
                        c49811.f11363 = fArr;
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c4989 = c49811;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c170517 = c17058;
                    c170517.f50443 = f3;
                    c170517.f50444 = f2;
                    char c10 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c170517;
                    c = c10;
                    length = length;
                    break;
                case 'm':
                    if (c == 'z' || c == 'Z') {
                        c49811.f11364 = 'M';
                        float[] fArr14 = c49811.f11363;
                        f3 = fArr14[0] + f6;
                        fArr14[0] = f3;
                        f2 = f7 + fArr14[1];
                        fArr14[1] = f2;
                        for (int i24 = iIntValue; i24 < length2; i24 += iIntValue) {
                            float[] fArr15 = c49811.f11363;
                            fArr15[i24] = fArr15[i24] + fArr15[i24 - iIntValue];
                            int i25 = i24 + 1;
                            fArr15[i25] = fArr15[i25] + fArr15[i25 - iIntValue];
                        }
                        float[] fArr16 = c49811.f11363;
                        float f20 = fArr16[length2 - 2];
                        float f21 = fArr16[length2 - 1];
                        c2976.m4949(fArr16, 0, fArr16, 0, length2 / 2);
                        f6 = f20;
                        f7 = f21;
                    } else {
                        float[] fArr17 = c49811.f11363;
                        float f22 = f4 + fArr17[0];
                        float f23 = f5 + fArr17[1];
                        if (c == ' ') {
                            i2 = 2;
                            c2976.m4949(fArr17, 0, fArr17, 0, 1);
                        } else {
                            i2 = 2;
                            if (!m10564(c2976)) {
                                m10562(c2976, c49811.f11363, 0, 2);
                            }
                        }
                        float f24 = f22;
                        float f25 = f23;
                        for (int i26 = 2; i26 < length2; i26 += iIntValue) {
                            float[] fArr18 = c49811.f11363;
                            f24 += fArr18[i26];
                            f25 += fArr18[i26 + 1];
                        }
                        if (!m10564(c2976)) {
                            m10562(c2976, c49811.f11363, i2, length2 - 2);
                        }
                        f5 = f25;
                        f6 = f22;
                        f7 = f23;
                        f4 = f24;
                        f3 = f6;
                        f6 = f4;
                        f2 = f7;
                        f7 = f5;
                    }
                    c4989 = c49811;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c170518 = c17058;
                    c170518.f50443 = f3;
                    c170518.f50444 = f2;
                    char c11 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c170518;
                    c = c11;
                    length = length;
                    break;
                case 'v':
                    for (int i27 = 0; i27 < length2; i27++) {
                        int i28 = i27 * 2;
                        fArr[i28] = 0.0f;
                        float[] fArr19 = c49811.f11363;
                        fArr[i28 + 1] = fArr19[i27];
                        f5 += fArr19[i27];
                    }
                    if (!m10564(c2976)) {
                        c49811.f11364 = 'l';
                        m10562(c2976, fArr, 0, i4);
                        c49811.f11363 = fArr;
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c4989 = c49811;
                    c17057.f50443 = f6;
                    c17057.f50444 = f7;
                    C17057 c170519 = c17058;
                    c170519.f50443 = f3;
                    c170519.f50444 = f2;
                    char c12 = c4989.f11364;
                    i3 = i5 + 1;
                    c4989Arr2 = c4989Arr;
                    c17058 = c170519;
                    c = c12;
                    length = length;
                    break;
                default:
                    throw new IllegalStateException("Unexpected type " + c49811.f11364);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m10564(C2976 c2976) {
        int iM4954 = c2976.m4954();
        return iM4954 == 0 || iM4954 == 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10562(C2976 c2976, float[] fArr, int i, int i2) {
        double[] dArr = new double[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            dArr[i3] = fArr[i3 + i];
        }
        c2976.m4948(dArr, dArr, i2 / 2);
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4 + i] = (float) dArr[i4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11364);
        float[] fArr = this.f11363;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            int i3 = i2 + 1;
            sb.append(i2 % 2 == 0 ? ' ' : ',');
            sb.append(C24550.m54146(f));
            i++;
            i2 = i3;
        }
        return sb.toString();
    }
}
