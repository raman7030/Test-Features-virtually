package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۖ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABJA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2757 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float[] f8569;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char f8570;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m8520() {
        return this.f8570;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] m8519() {
        return this.f8569;
    }

    public C2757(char c, float[] fArr) {
        this.f8570 = c;
        this.f8569 = fArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8518(C2757[] c2757Arr) {
        char c = ' ';
        for (C2757 c2757 : c2757Arr) {
            if ((c == 'z' || c == 'Z') && c2757.f8570 == 'm') {
                return true;
            }
            c = c2757.f8570;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8514(C2757[] c2757Arr, C9813 c9813) {
        char c;
        boolean z;
        StringBuilder sb = new StringBuilder();
        for (C2757 c2757 : c2757Arr) {
            sb.append(c2757.f8570);
            int length = c2757.f8569.length;
            char c2 = c2757.f8570;
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
                float f = c2757.f8569[i];
                if (Math.abs(f) > Float.MAX_VALUE) {
                    throw new IllegalArgumentException("Invalid number: " + f);
                }
                sb.append(c9813.m24847(f));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8516(C0639 c0639, C2757[] c2757Arr) {
        C2757 c2757;
        float f;
        float f2;
        float f3;
        int i;
        C2757 c2758;
        int i2;
        C2757[] c2757Arr2 = c2757Arr;
        C15455 c15455 = new C15455();
        C15455 c15456 = new C15455();
        int length = c2757Arr2.length;
        char c = ' ';
        int i3 = 0;
        while (i3 < length) {
            C2757 c2759 = c2757Arr2[i3];
            int length2 = c2759.f8569.length;
            int i4 = length2 * 2;
            float[] fArr = new float[i4];
            float f4 = c15455.f47314;
            float f5 = c15455.f47315;
            float f6 = c15456.f47314;
            float f7 = c15456.f47315;
            int i5 = i3;
            int iIntValue = ((Integer) C4168.f13597.get(Character.valueOf(c2759.f8570))).intValue();
            switch (c2759.f8570) {
                case 'A':
                    f7 = f7;
                    f6 = f6;
                    c15456 = c15456;
                    length = length;
                    c2757 = c2759;
                    float f8 = f4;
                    f7 = f5;
                    int i6 = 0;
                    while (i6 < (length2 - iIntValue) + 1) {
                        if (!m8517(c0639)) {
                            float[] fArr2 = c2757.f8569;
                            int i7 = i6 + 1;
                            int i8 = i6 + 2;
                            int i9 = i6 + 4;
                            C16224 c16224 = new C16224(c0639, f8, f7, fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i6 + 3], fArr2[i9], fArr2[i6 + 5], fArr2[i6 + 6]);
                            c2757.f8569[i6] = c16224.m38181();
                            c2757.f8569[i7] = c16224.m38182();
                            c2757.f8569[i8] = c16224.m38183();
                            if (c16224.m38180()) {
                                float[] fArr3 = c2757.f8569;
                                fArr3[i9] = 1.0f - fArr3[i9];
                            }
                        }
                        float[] fArr4 = c2757.f8569;
                        int i10 = i6 + 5;
                        float f9 = fArr4[i10];
                        float f10 = fArr4[i6 + 6];
                        c0639.m2609(fArr4, i10, fArr4, i10, 1);
                        i6 += iIntValue;
                        f8 = f9;
                        f7 = f10;
                    }
                    f6 = f8;
                    f2 = f7;
                    f3 = f6;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c15457 = c15456;
                    c15457.f47314 = f3;
                    c15457.f47315 = f2;
                    char c2 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c15457;
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
                    c2757 = c2759;
                    float[] fArr5 = c2757.f8569;
                    float f11 = fArr5[length2 - 2];
                    float f12 = fArr5[length2 - 1];
                    c0639.m2609(fArr5, 0, fArr5, 0, length2 / 2);
                    f6 = f11;
                    f7 = f12;
                    f2 = f7;
                    f3 = f6;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c15458 = c15456;
                    c15458.f47314 = f3;
                    c15458.f47315 = f2;
                    char c3 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c15458;
                    c = c3;
                    length = length;
                    break;
                case 'H':
                    c2757 = c2759;
                    c2757.f8570 = 'L';
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = i11 * 2;
                        float[] fArr6 = c2757.f8569;
                        fArr[i12] = fArr6[i11];
                        fArr[i12 + 1] = f5;
                        f4 = fArr6[i11];
                    }
                    f = f5;
                    c0639.m2609(fArr, 0, fArr, 0, length2);
                    c2757.f8569 = fArr;
                    f7 = f;
                    f6 = f4;
                    f2 = f7;
                    f3 = f6;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c15459 = c15456;
                    c15459.f47314 = f3;
                    c15459.f47315 = f2;
                    char c4 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c15459;
                    c = c4;
                    length = length;
                    break;
                case 'M':
                    c2757 = c2759;
                    float[] fArr7 = c2757.f8569;
                    float f13 = fArr7[0];
                    f7 = fArr7[1];
                    f6 = f13;
                    float[] fArr8 = c2757.f8569;
                    float f14 = fArr8[length2 - 2];
                    float f15 = fArr8[length2 - 1];
                    c0639.m2609(fArr8, 0, fArr8, 0, length2 / 2);
                    f6 = f14;
                    f7 = f15;
                    f2 = f7;
                    f3 = f6;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c154510 = c15456;
                    c154510.f47314 = f3;
                    c154510.f47315 = f2;
                    char c5 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c154510;
                    c = c5;
                    length = length;
                    break;
                case HRSS1373Polynomial.K /* 86 */:
                    c2757 = c2759;
                    c2757.f8570 = 'L';
                    f = f5;
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = i13 * 2;
                        fArr[i14] = f4;
                        float[] fArr9 = c2757.f8569;
                        fArr[i14 + 1] = fArr9[i13];
                        f = fArr9[i13];
                    }
                    c0639.m2609(fArr, 0, fArr, 0, length2);
                    c2757.f8569 = fArr;
                    f7 = f;
                    f6 = f4;
                    f2 = f7;
                    f3 = f6;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c154511 = c15456;
                    c154511.f47314 = f3;
                    c154511.f47315 = f2;
                    char c6 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c154511;
                    c = c6;
                    length = length;
                    break;
                case 'Z':
                case 'z':
                    c15456 = c15456;
                    length = length;
                    c2757 = c2759;
                    f2 = f7;
                    f3 = f6;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c154512 = c15456;
                    c154512.f47314 = f3;
                    c154512.f47315 = f2;
                    char c7 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c154512;
                    c = c7;
                    length = length;
                    break;
                case 'a':
                    float f16 = f4;
                    C0639 c06310 = c0639;
                    int i15 = 0;
                    while (i15 < (length2 - iIntValue) + 1) {
                        float[] fArr10 = c2759.f8569;
                        int i16 = i15 + 5;
                        float f17 = f16 + fArr10[i16];
                        int i17 = i15 + 6;
                        float f18 = f5 + fArr10[i17];
                        if (m8517(c06310)) {
                            i = i15;
                            c2758 = c2759;
                        } else {
                            float[] fArr11 = c2759.f8569;
                            int i18 = i15 + 1;
                            int i19 = i15 + 2;
                            int i20 = i15 + 4;
                            c2758 = c2759;
                            i = i15;
                            C16224 c16225 = new C16224(c0639, f16, f5, fArr11[i15], fArr11[i18], fArr11[i19], fArr11[i15 + 3], fArr11[i20], f16 + fArr11[i16], f5 + fArr11[i17]);
                            m8515(c0639, c2758.f8569, i16, 2);
                            c2758.f8569[i] = c16225.m38181();
                            c2758.f8569[i18] = c16225.m38182();
                            c2758.f8569[i19] = c16225.m38183();
                            if (c16225.m38180()) {
                                float[] fArr12 = c2758.f8569;
                                fArr12[i20] = 1.0f - fArr12[i20];
                            }
                            c06310 = c0639;
                        }
                        i15 = i + iIntValue;
                        c2759 = c2758;
                        length2 = length2;
                        f16 = f17;
                        f5 = f18;
                        length = length;
                        c15456 = c15456;
                        f7 = f7;
                        f6 = f6;
                    }
                    f7 = f7;
                    f6 = f6;
                    c15456 = c15456;
                    length = length;
                    c2757 = c2759;
                    f6 = f16;
                    f7 = f5;
                    f2 = f7;
                    f3 = f6;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c154513 = c15456;
                    c154513.f47314 = f3;
                    c154513.f47315 = f2;
                    char c8 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c154513;
                    c = c8;
                    length = length;
                    break;
                case q.f /* 99 */:
                case 'l':
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case 's':
                case 't':
                    int i21 = 0;
                    while (i21 < (length2 - iIntValue) + 1) {
                        float[] fArr13 = c2759.f8569;
                        i21 += iIntValue;
                        f4 += fArr13[i21 - 2];
                        f5 += fArr13[i21 - 1];
                    }
                    if (!m8517(c0639)) {
                        m8515(c0639, c2759.f8569, 0, length2);
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c2757 = c2759;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c154514 = c15456;
                    c154514.f47314 = f3;
                    c154514.f47315 = f2;
                    char c9 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c154514;
                    c = c9;
                    length = length;
                    break;
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    for (int i22 = 0; i22 < length2; i22++) {
                        float f19 = c2759.f8569[i22];
                        f4 += f19;
                        int i23 = i22 * 2;
                        fArr[i23] = f19;
                        fArr[i23 + 1] = 0.0f;
                    }
                    if (!m8517(c0639)) {
                        c2759.f8570 = 'l';
                        m8515(c0639, fArr, 0, i4);
                        c2759.f8569 = fArr;
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c2757 = c2759;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c154515 = c15456;
                    c154515.f47314 = f3;
                    c154515.f47315 = f2;
                    char c10 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c154515;
                    c = c10;
                    length = length;
                    break;
                case 'm':
                    if (c == 'z' || c == 'Z') {
                        c2759.f8570 = 'M';
                        float[] fArr14 = c2759.f8569;
                        f3 = fArr14[0] + f6;
                        fArr14[0] = f3;
                        f2 = f7 + fArr14[1];
                        fArr14[1] = f2;
                        for (int i24 = iIntValue; i24 < length2; i24 += iIntValue) {
                            float[] fArr15 = c2759.f8569;
                            fArr15[i24] = fArr15[i24] + fArr15[i24 - iIntValue];
                            int i25 = i24 + 1;
                            fArr15[i25] = fArr15[i25] + fArr15[i25 - iIntValue];
                        }
                        float[] fArr16 = c2759.f8569;
                        float f20 = fArr16[length2 - 2];
                        float f21 = fArr16[length2 - 1];
                        c0639.m2609(fArr16, 0, fArr16, 0, length2 / 2);
                        f6 = f20;
                        f7 = f21;
                    } else {
                        float[] fArr17 = c2759.f8569;
                        float f22 = f4 + fArr17[0];
                        float f23 = f5 + fArr17[1];
                        if (c == ' ') {
                            i2 = 2;
                            c0639.m2609(fArr17, 0, fArr17, 0, 1);
                        } else {
                            i2 = 2;
                            if (!m8517(c0639)) {
                                m8515(c0639, c2759.f8569, 0, 2);
                            }
                        }
                        float f24 = f22;
                        float f25 = f23;
                        for (int i26 = 2; i26 < length2; i26 += iIntValue) {
                            float[] fArr18 = c2759.f8569;
                            f24 += fArr18[i26];
                            f25 += fArr18[i26 + 1];
                        }
                        if (!m8517(c0639)) {
                            m8515(c0639, c2759.f8569, i2, length2 - 2);
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
                    c2757 = c2759;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c154516 = c15456;
                    c154516.f47314 = f3;
                    c154516.f47315 = f2;
                    char c11 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c154516;
                    c = c11;
                    length = length;
                    break;
                case 'v':
                    for (int i27 = 0; i27 < length2; i27++) {
                        int i28 = i27 * 2;
                        fArr[i28] = 0.0f;
                        float[] fArr19 = c2759.f8569;
                        fArr[i28 + 1] = fArr19[i27];
                        f5 += fArr19[i27];
                    }
                    if (!m8517(c0639)) {
                        c2759.f8570 = 'l';
                        m8515(c0639, fArr, 0, i4);
                        c2759.f8569 = fArr;
                    }
                    f3 = f6;
                    f6 = f4;
                    f2 = f7;
                    f7 = f5;
                    c2757 = c2759;
                    c15455.f47314 = f6;
                    c15455.f47315 = f7;
                    C15455 c154517 = c15456;
                    c154517.f47314 = f3;
                    c154517.f47315 = f2;
                    char c12 = c2757.f8570;
                    i3 = i5 + 1;
                    c2757Arr2 = c2757Arr;
                    c15456 = c154517;
                    c = c12;
                    length = length;
                    break;
                default:
                    throw new IllegalStateException("Unexpected type " + c2759.f8570);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8517(C0639 c0639) {
        int iM2614 = c0639.m2614();
        return iM2614 == 0 || iM2614 == 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8515(C0639 c0639, float[] fArr, int i, int i2) {
        double[] dArr = new double[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            dArr[i3] = fArr[i3 + i];
        }
        c0639.m2608(dArr, dArr, i2 / 2);
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4 + i] = (float) dArr[i4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8570);
        float[] fArr = this.f8569;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            int i3 = i2 + 1;
            sb.append(i2 % 2 == 0 ? ' ' : ',');
            sb.append(C23340.m51749(f));
            i++;
            i2 = i3;
        }
        return sb.toString();
    }
}
