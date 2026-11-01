package p067l;

import android.widget.EditText;
import com.alipay.sdk.p010m.p050t0.C0215b;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.֡۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2641 {

    /* JADX INFO: renamed from: ᩺ۨۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f81827 = {7317, 21150, 21206, 21194, 21195, 21201, 21148, 2215, 8696, 8624, 8620, 8621, 8631, 8698};

    /* JADX WARN: Code duplicated, block: B:25:0x00bc A[PHI: r4
      0x00bc: PHI (r4v4 android.widget.EditText) = (r4v3 android.widget.EditText), (r4v2 android.widget.EditText) binds: [B:24:0x00ba, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f2 A[PHI: r6 r9 r10 r11
      0x01f2: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:55:0x01f0, B:47:0x01b2, B:13:0x0064, B:10:0x005b, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:55:0x01f0, B:47:0x01b2, B:13:0x0064, B:10:0x005b, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:55:0x01f0, B:47:0x01b2, B:13:0x0064, B:10:0x005b, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:55:0x01f0, B:47:0x01b2, B:13:0x0064, B:10:0x005b, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0225 A[PHI: r2 r3 r13 r14 r15 r20
      0x0225: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:59:0x0223, B:36:0x0138, B:32:0x0117, B:28:0x00f7, B:20:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r3v4 boolean) = (r3v2 boolean), (r3v2 boolean), (r3v2 boolean), (r3v3 boolean), (r3v2 boolean) binds: [B:59:0x0223, B:36:0x0138, B:32:0x0117, B:28:0x00f7, B:20:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:59:0x0223, B:36:0x0138, B:32:0x0117, B:28:0x00f7, B:20:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:59:0x0223, B:36:0x0138, B:32:0x0117, B:28:0x00f7, B:20:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:59:0x0223, B:36:0x0138, B:32:0x0117, B:28:0x00f7, B:20:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:59:0x0223, B:36:0x0138, B:32:0x0117, B:28:0x00f7, B:20:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0253 A[PHI: r7 r8
      0x0253: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:63:0x0251, B:51:0x01d3, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:63:0x0251, B:51:0x01d3, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static final void m4031(TextInputLayout textInputLayout, String str) {
        int iM55979;
        int i;
        int i2;
        int i3 = C1003.f81929;
        int i4 = C1124.f82007;
        int iM559710 = C0946.m55979("ۚۗ") ^ i4;
        int i5 = ((iM559710 ^ i3) * (-8191)) ^ (-646822312);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM559710 ^ (-582468574);
        String strM56373 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1799446862;
        EditText editTextM55882 = null;
        boolean z = false;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-4429)) >> 31));
            switch (i13) {
                case -1961511103:
                case 1471247562:
                    RunnableC0871.m55661(textInputLayout, strM56373);
                    textInputLayout.setError(str);
                    z = true;
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = C0946.m55979("۬ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * 6257) ^ (-2127743667);
                        i2 = -468536309;
                    } else {
                        iM55979 = C0873.m55680("᩸ᩳ") ^ i3;
                        i = ((iM55979 ^ i4) * 15481) ^ (-2131954681);
                        i2 = -1244281407;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1922363397:
                case -1861876316:
                    EditText editTextM55656 = C0866.m55656(textInputLayout);
                    C0877.m55699(editTextM55656);
                    C0882.m55722(editTextM55656);
                    break;
                case -1813590071:
                case 1183580578:
                    i7 = s * s2;
                    i8 = s * s;
                    i9 = 28281124;
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("ۗۧ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16439)) ^ (-34877660);
                        i2 = -74844656;
                    } else {
                        iM55979 = (C0873.m55680("۟֫") ^ i3) * 41;
                        i = ((iM55979 ^ i4) * (-11171)) ^ (-1883498700);
                        i2 = 1924502204;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1750084782:
                case 51901937:
                    textInputLayout.setErrorEnabled(z);
                    editTextM55882 = C0930.m55882(textInputLayout);
                    C0877.m55699(editTextM55882);
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (C0946.m55979("֨ۗ") ^ i4) * (-123);
                        i = ((iM55979 ^ i3) * 30247) ^ (-1292979478);
                        i2 = -1636144290;
                    } else {
                        iM55979 = (C0946.m55979("ܺۡ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55979 ^ i3) * 27215) ^ 1323681303;
                        i2 = 379745711;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1741627642:
                case 1478063804:
                    C1929.m56553();
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("ۗۧ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16439)) ^ (-34877660);
                        i2 = -74844656;
                    } else {
                        iM55979 = C0946.m55979("ܿ᩻") ^ i3;
                        i = ((iM55979 ^ i4) * (-23325)) ^ (-1241130346);
                        i2 = -1828802819;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1644207338:
                case -1333326455:
                    C1017.m56187();
                    break;
                case -1556298209:
                case 98580384:
                    editTextM55882.selectAll();
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("۬ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * 6257) ^ (-2127743667);
                        i2 = -468536309;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܿ᩺")) * 53;
                        i = ((iM55979 ^ i3) * C0215b.f1001d) ^ 185177331;
                        i2 = -1856062825;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -978137909:
                case -517073287:
                    i10 = 8644;
                    iM55979 = (C0946.m55979("ۛܶ") ^ i4) * (-85);
                    i = ((iM55979 ^ i3) * (-31543)) ^ (-983030738);
                    i2 = -1022236813;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -842426134:
                case 1257099550:
                    i10 = 26668;
                    iM55979 = (C0946.m55979("ۛܶ") ^ i4) * (-85);
                    i = ((iM55979 ^ i3) * (-31543)) ^ (-983030738);
                    i2 = -1022236813;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -834231172:
                case 2141322358:
                    if (C0854.f81826 == 0) {
                        iM55979 = C0946.m55979("ۗۧ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16439)) ^ (-34877660);
                        i2 = -74844656;
                    } else {
                        iM55979 = (C0946.m55979("֨ۗ") ^ i4) * (-123);
                        i = ((iM55979 ^ i3) * 30247) ^ (-1292979478);
                        i2 = -1636144290;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -527058175:
                case -197742567:
                    sArr = f81827;
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = C0946.m55979("۬ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * 6257) ^ (-2127743667);
                        i2 = -468536309;
                    } else {
                        iM55979 = C0946.m55979("᩸۠") ^ i4;
                        i = ((iM55979 ^ i3) * (-1917)) ^ 278249988;
                        i2 = 400069409;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -483918891:
                case -8864297:
                    sArr2 = f81827;
                    i11 = 8;
                    i12 = 6;
                    if (C1024.f81946) {
                        iM55979 = C0946.m55979("۬ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * 6257) ^ (-2127743667);
                        i2 = -468536309;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۛۛ")) * (-81);
                        i = ((iM55979 ^ i4) * (-20751)) ^ (-841050630);
                        i2 = -345295353;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -227533792:
                case 1306431981:
                    s = sArr[c];
                    s2 = 10636;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("ۤ᩶") + i3) * 21;
                        i = ((iM55979 ^ i4) * 7925) ^ (-977790637);
                        i2 = 440489598;
                    } else {
                        iM55979 = C0873.m55680("ܳ᩸") ^ i4;
                        i = ((iM55979 ^ i3) * (-31533)) ^ 59045765;
                        i2 = -1413752752;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -138386472:
                case 472731499:
                    if (i7 - (i8 + i9) <= 0) {
                        iM55979 = C0946.m55979("֡ۘ") ^ i4;
                        i = ((iM55979 ^ i3) * 16181) ^ 1799472186;
                        i2 = 202998649;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ᩴۙ")) * (-87);
                        i = ((iM55979 ^ i4) * (-28499)) ^ 1381932104;
                        i2 = -2079170415;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -85161954:
                case 1075312543:
                    c = 7;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ۗۧ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16439)) ^ (-34877660);
                        i2 = -74844656;
                    } else {
                        iM55979 = C0873.m55680("ܿ۬") ^ i3;
                        i = ((iM55979 ^ i4) * 18083) ^ (-1055598693);
                        i2 = 1873227272;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -57981313:
                case 475446714:
                    strM56373 = C1124.m56373(sArr2, i11, i12, i10);
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0946.m55979("۬ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * 6257) ^ (-2127743667);
                        i2 = -468536309;
                    } else {
                        iM55979 = C0873.m55680("ۤܳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-16397)) ^ 325147739;
                        i2 = 1713523673;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 153445723:
                case 1452245422:
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("ۗۧ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16439)) ^ (-34877660);
                        i2 = -74844656;
                    } else {
                        iM55979 = (C0946.m55979("ۤ᩶") + i3) * 21;
                        i = ((iM55979 ^ i4) * 7925) ^ (-977790637);
                        i2 = 440489598;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 333701650:
                case 813680456:
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0946.m55979("ۤ᩶") + i3) * 21;
                        i = ((iM55979 ^ i4) * 7925) ^ (-977790637);
                        i2 = 440489598;
                    } else {
                        iM55979 = C0946.m55979("ۘۧ") ^ i3;
                        i = ((iM55979 ^ i4) * 13497) ^ (-598038872);
                        i2 = -1024706458;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0890.m55740();
                    C0930.m55885();
                    iM55979 = C0946.m55979("ܿ᩻") ^ i3;
                    i = ((iM55979 ^ i4) * (-23325)) ^ (-1241130346);
                    i2 = -1828802819;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m4029(TextInputLayout textInputLayout) {
        EditText editTextM55656 = null;
        int i = 1395285896;
        int i2 = C1003.f81929;
        int i3 = C1044.f81959;
        int iM55680 = C0873.m55680("᩹ۨ") ^ i3;
        int i4 = ((iM55680 ^ i2) * 13275) ^ 1902241938;
        int i5 = 701650145;
        while (true) {
            i = ((((i ^ i2) * 12535) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2102106412:
                case 2032930428:
                    if (C0866.m55645()) {
                        iM55680 = C0873.m55680("ܽۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11973) ^ (-1070762855);
                        i5 = 360166789;
                    } else {
                        iM55680 = C0873.m55680("ܿ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7851)) ^ (-381750406);
                        i5 = -1425864514;
                    }
                    break;
                case -2041137479:
                case -1062590984:
                    if (C0854.f81826 != 0) {
                        iM55680 = (C0873.m55680("ۖ᩺") + i2) * (-9);
                        i4 = ((iM55680 ^ i3) * 9567) ^ (-498895314);
                        i5 = 1538289510;
                    } else {
                        iM55680 = (C0946.m55979("ᩴۡ") ^ i3) * 47;
                        i4 = ((iM55680 ^ i2) * (-9189)) ^ 61245896;
                        i5 = -1645692278;
                    }
                    break;
                case -1988449331:
                case 698795376:
                    C0917.m55854();
                    break;
                case -1912831075:
                case 1462817473:
                    if (C0917.m55854()) {
                        iM55680 = C0873.m55680("۠᩹") ^ i2;
                        i4 = ((iM55680 ^ i3) * 13155) ^ (-193134694);
                        i5 = -489450999;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܺᩳ")) * 99;
                        i4 = ((iM55680 ^ i2) * 24173) ^ (-1364168632);
                        i5 = 1955625832;
                    }
                    break;
                case -1845236302:
                case 1657788136:
                    C1053.m56327();
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("ܿ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7851)) ^ (-381750406);
                        i5 = -1425864514;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۬ۖ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i2) * 13157) ^ 1743663065;
                        i5 = 810191545;
                    }
                    break;
                case -1782098895:
                case -754040392:
                    if (C1071.m56343() != 0) {
                        iM55680 = C0873.m55680("ܿ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7851)) ^ (-381750406);
                        i5 = -1425864514;
                    } else {
                        iM55680 = C0946.m55979("᩺ᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 21021) ^ 1060520852;
                        i5 = 1790876556;
                    }
                    break;
                case -1584759114:
                case -457908543:
                    editTextM55656 = C0866.m55656(textInputLayout);
                    if (C0882.m55710() != 0) {
                        iM55680 = (C0873.m55680("ۖ᩺") + i2) * (-9);
                        i4 = ((iM55680 ^ i3) * 9567) ^ (-498895314);
                        i5 = 1538289510;
                    } else {
                        iM55680 = C0873.m55680("ۢ᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18903) ^ 588437676;
                        i5 = -2081504751;
                    }
                    break;
                case -1583909472:
                case 1174937123:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("ܿ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7851)) ^ (-381750406);
                        i5 = -1425864514;
                    } else {
                        iM55680 = C0946.m55979("ܰ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-31129)) ^ 827565990;
                        i5 = -546620833;
                    }
                    break;
                case -834178347:
                case 1689390892:
                    C0873.m55678();
                    C0863.m55643();
                    iM55680 = C0873.m55680("ܿ᩺") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-7851)) ^ (-381750406);
                    i5 = -1425864514;
                    break;
                case -513866068:
                case 69249968:
                    C0873.m55678();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = (C0873.m55680("ۖ᩺") + i2) * (-9);
                        i4 = ((iM55680 ^ i3) * 9567) ^ (-498895314);
                        i5 = 1538289510;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܺᩳ")) * 99;
                        i4 = ((iM55680 ^ i2) * 24173) ^ (-1364168632);
                        i5 = 1955625832;
                    }
                    break;
                case -490922640:
                case 1155469883:
                    C0877.m55699(editTextM55656);
                    if (C0937.f81884) {
                        iM55680 = (C0873.m55680("ۧ۟") ^ i2) * 39;
                        i4 = ((iM55680 ^ i3) * (-32259)) ^ 465438164;
                        i5 = 504899254;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩷ۡ")) * 123;
                        i4 = ((iM55680 ^ i2) * (-10165)) ^ 118918938;
                        i5 = -2045461110;
                    }
                    break;
                case -488192658:
                case 67467096:
                    if (C1024.f81946) {
                        iM55680 = (C0873.m55680("ۖ᩺") + i2) * (-9);
                        i4 = ((iM55680 ^ i3) * 9567) ^ (-498895314);
                        i5 = 1538289510;
                    } else {
                        iM55680 = C0873.m55680("ۚܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25309)) ^ 530948248;
                        i5 = 1532333492;
                    }
                    break;
                case -285459986:
                case 1897824841:
                    if (C1025.m56230()) {
                        iM55680 = (i3 - C0946.m55979("᩷ۡ")) * 123;
                        i4 = ((iM55680 ^ i2) * (-10165)) ^ 118918938;
                        i5 = -2045461110;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۢۖ")) * (-93);
                        i4 = ((iM55680 ^ i2) * (-14223)) ^ 1835582351;
                        i5 = 870682967;
                    }
                    break;
                case 124030810:
                case 1587220582:
                    editTextM55656.addTextChangedListener(new C20748(textInputLayout));
                    break;
                case 1571467520:
                case 1634958591:
                    if (C0882.m55710() != 0) {
                        iM55680 = (i3 - C0873.m55680("ܺᩳ")) * 99;
                        i4 = ((iM55680 ^ i2) * 24173) ^ (-1364168632);
                        i5 = 1955625832;
                    } else {
                        iM55680 = C0873.m55680("ܿ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7851)) ^ (-381750406);
                        i5 = -1425864514;
                    }
                    break;
                default:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("ܿ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7851)) ^ (-381750406);
                        i5 = -1425864514;
                    } else {
                        iM55680 = C0946.m55979("ܽ᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-24999)) ^ 1115881113;
                        i5 = 1399267583;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final boolean m4032(TextInputLayout... textInputLayoutArr) {
        int length = 0;
        boolean z = false;
        int i = 0;
        TextInputLayout textInputLayout = null;
        EditText editTextM55656 = null;
        EditText editTextM55882 = null;
        int i2 = -239270989;
        int i3 = C1028.f81950;
        int i4 = ServiceConnectionC1013.f81940;
        int iM55979 = C0946.m55979("᩵᩻") ^ i4;
        int i5 = ((iM55979 ^ i3) * 9401) ^ 1233285294;
        int i6 = -211110015;
        while (true) {
            i2 = ((((i2 ^ i3) * 26827) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2137487561:
                case 191115157:
                    if (!C0861.f81831) {
                        iM55979 = C0946.m55979("᩹ۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-30513)) ^ (-868403158);
                        i6 = 979639505;
                    } else {
                        iM55979 = (C0946.m55979("ۤۡ") ^ i4) * 5;
                        i5 = ((iM55979 ^ i3) * 12047) ^ 1108158791;
                        i6 = 526389923;
                    }
                    break;
                case -2102080400:
                case -423952574:
                    C1024.m56209();
                    C0927.m55873();
                    return false;
                case -2095622980:
                case -1421432908:
                    textInputLayout = textInputLayoutArr[i];
                    if (textInputLayout.isErrorEnabled()) {
                        iM55979 = (C0946.m55979("᩸᩵") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55979 ^ i4) * (-8165)) ^ 517865791;
                        i6 = -1995880960;
                    } else {
                        iM55979 = C0873.m55680("᩹ᩴ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-19927)) ^ 815608635;
                        i6 = -1613225586;
                    }
                    break;
                case -1901527258:
                case 1920914435:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0946.m55979("ۤۡ") ^ i4) * 5;
                        i5 = ((iM55979 ^ i3) * 12047) ^ 1108158791;
                        i6 = 526389923;
                    } else {
                        iM55979 = (C0946.m55979("֫᩻") + i4) * C0254q.f1218h;
                        i5 = ((iM55979 ^ i3) * (-32421)) ^ 1510926338;
                        i6 = -121613656;
                    }
                    break;
                case -1774373644:
                case 1435353981:
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("᩹ۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-30513)) ^ (-868403158);
                        i6 = 979639505;
                    } else {
                        iM55979 = (i4 - C0946.m55979("۫᩵")) * 79;
                        i5 = ((iM55979 ^ i3) * (-20813)) ^ 1194020664;
                        i6 = -1074421562;
                    }
                    break;
                case -1613773412:
                case 349520937:
                    z = false;
                    i = 0;
                    iM55979 = C0873.m55680("ܰ᩷") ^ i3;
                    i5 = ((iM55979 ^ i4) * 8153) ^ (-2067892469);
                    i6 = 414231907;
                    break;
                case -1480444714:
                case 444526957:
                    editTextM55656.selectAll();
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0946.m55979("ܺܺ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-27755)) ^ (-1050725278);
                        i6 = 847264464;
                    } else {
                        iM55979 = C0873.m55680("ᩳ᩹") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-24387)) ^ 466653771;
                        i6 = -2097903215;
                    }
                    break;
                case -1369173541:
                case 1422714143:
                    if (C1053.m56327() >= 0) {
                        iM55979 = C0873.m55680("ۧ᩶") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-14967)) ^ (-852249496);
                        i6 = -409785718;
                    } else {
                        iM55979 = C0946.m55979("᩶ۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 32171) ^ 1151177394;
                        i6 = -1183249111;
                    }
                    break;
                case -1113498965:
                case 1845506695:
                    editTextM55882 = C0930.m55882(textInputLayout);
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("ۧ᩶") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-14967)) ^ (-852249496);
                        i6 = -409785718;
                    } else {
                        iM55979 = C0946.m55979("ܶܿ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 10465) ^ 55346499;
                        i6 = -2031951782;
                    }
                    break;
                case -1105324231:
                case 1182451053:
                    return z;
                case -1078730782:
                case 1956120121:
                    ServiceConnectionC1013.m56157();
                    C0912.m55833();
                    iM55979 = C0873.m55680("ۡܶ") ^ i3;
                    i5 = ((iM55979 ^ i4) * (-14261)) ^ 841195410;
                    i6 = -462595872;
                    break;
                case -772120007:
                case -498857191:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("᩺ۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-19829)) ^ 1002363676;
                        i6 = -1961569358;
                    } else {
                        iM55979 = (C0946.m55979("ۤۡ") ^ i4) * 5;
                        i5 = ((iM55979 ^ i3) * 12047) ^ 1108158791;
                        i6 = 526389923;
                    }
                    break;
                case -664937092:
                case 1779823587:
                    C0949.m56008(editTextM55882);
                    C0927.m55877(editTextM55882);
                    return true;
                case -305225481:
                case -240925908:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("ۡܶ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-14261)) ^ 841195410;
                        i6 = -462595872;
                    } else {
                        iM55979 = C0946.m55979("ۚ۫") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-9259)) ^ (-1089010127);
                        i6 = 346507191;
                    }
                    break;
                case -210242811:
                case 1555984310:
                    C1053.m56327();
                    if (!C0892.f81851) {
                        iM55979 = C0873.m55680("ۡܶ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-14261)) ^ 841195410;
                        i6 = -462595872;
                    } else {
                        iM55979 = C0946.m55979("ܺܺ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-27755)) ^ (-1050725278);
                        i6 = 847264464;
                    }
                    break;
                case 125540130:
                case 530451543:
                    length = textInputLayoutArr.length;
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ۧ᩶") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-14967)) ^ (-852249496);
                        i6 = -409785718;
                    } else {
                        iM55979 = C0946.m55979("֡᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-10333)) ^ (-1183425821);
                        i6 = 246625949;
                    }
                    break;
                case 279747838:
                case 399236667:
                    editTextM55656 = C0866.m55656(textInputLayout);
                    C0949.m56008(editTextM55656);
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("ۤۡ") ^ i4) * 5;
                        i5 = ((iM55979 ^ i3) * 12047) ^ 1108158791;
                        i6 = 526389923;
                    } else {
                        iM55979 = (C0946.m55979("ۚۗ") + i3) * 59;
                        i5 = ((iM55979 ^ i4) * 2381) ^ 1375088725;
                        i6 = -1372020037;
                    }
                    break;
                case 625511918:
                case 1415157109:
                    C0877.m55696();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0946.m55979("ۤۡ") ^ i4) * 5;
                        i5 = ((iM55979 ^ i3) * 12047) ^ 1108158791;
                        i6 = 526389923;
                    } else {
                        iM55979 = C0873.m55680("ۡܶ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-14261)) ^ 841195410;
                        i6 = -462595872;
                    }
                    break;
                case 1096462280:
                case 2120817857:
                    if (i < length) {
                        iM55979 = C0946.m55979("᩷ᩳ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-8821)) ^ (-1763578197);
                        i6 = -439528827;
                    } else {
                        iM55979 = (C0946.m55979("۫ܿ") + i4) * 9;
                        i5 = ((iM55979 ^ i3) * (-2315)) ^ (-969533887);
                        i6 = 314943785;
                    }
                    break;
                case 1303757704:
                case 1775469965:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55979 = C0873.m55680("ۧ᩶") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-14967)) ^ (-852249496);
                        i6 = -409785718;
                    } else {
                        iM55979 = C0946.m55979("ۘ۬") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-11993)) ^ 1922505315;
                        i6 = -927104470;
                    }
                    break;
                default:
                    i++;
                    iM55979 = C0873.m55680("ܰ᩷") ^ i3;
                    i5 = ((iM55979 ^ i4) * 8153) ^ (-2067892469);
                    i6 = 414231907;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e5 A[PHI: r2 r5 r8 r9
      0x01e5: PHI (r2v3 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v4 boolean) binds: [B:56:0x01e3, B:51:0x01b0, B:32:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:56:0x01e3, B:51:0x01b0, B:32:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:56:0x01e3, B:51:0x01b0, B:32:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:56:0x01e3, B:51:0x01b0, B:32:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0217 A[PHI: r18
      0x0217: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:60:0x0215, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0243 A[PHI: r3 r6 r7 r11 r12 r13
      0x0243: PHI (r3v4 android.widget.EditText) = 
      (r3v2 android.widget.EditText)
      (r3v2 android.widget.EditText)
      (r3v2 android.widget.EditText)
      (r3v3 android.widget.EditText)
      (r3v2 android.widget.EditText)
      (r3v2 android.widget.EditText)
      (r3v2 android.widget.EditText)
     binds: [B:64:0x0241, B:40:0x0139, B:36:0x0118, B:28:0x00d3, B:15:0x0065, B:12:0x005f, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r6v3 short) = (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v5 short) binds: [B:64:0x0241, B:40:0x0139, B:36:0x0118, B:28:0x00d3, B:15:0x0065, B:12:0x005f, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v5 int) binds: [B:64:0x0241, B:40:0x0139, B:36:0x0118, B:28:0x00d3, B:15:0x0065, B:12:0x005f, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:64:0x0241, B:40:0x0139, B:36:0x0118, B:28:0x00d3, B:15:0x0065, B:12:0x005f, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:64:0x0241, B:40:0x0139, B:36:0x0118, B:28:0x00d3, B:15:0x0065, B:12:0x005f, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:64:0x0241, B:40:0x0139, B:36:0x0118, B:28:0x00d3, B:15:0x0065, B:12:0x005f, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static final void m4030(TextInputLayout textInputLayout, int i) {
        int iM55979;
        int i2;
        int i3;
        int i4 = C0894.f81854;
        int i5 = C1071.f81975;
        int iM559710 = C0946.m55979("֫ܰ") ^ i5;
        int i6 = ((iM559710 ^ i4) * (-28395)) ^ 1359937239;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM559710 ^ 1534667775;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1450733030;
        EditText editTextM55882 = null;
        boolean z = false;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i4) * (-7449)) >> 31));
            switch (i13) {
                case -2126041931:
                case -1345019630:
                    RunnableC0871.m55661(textInputLayout, C0877.m55707(sArr2, i11, i12, i10));
                    if (C0946.f81894 != 0) {
                        iM55979 = C0873.m55680("᩹ܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 8995) ^ (-2088084035);
                        i3 = 1930572859;
                    } else {
                        iM55979 = (C0873.m55680("ܿᩴ") ^ i4) * 123;
                        i2 = ((iM55979 ^ i5) * (-7235)) ^ (-1924700861);
                        i3 = 1789450551;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -2036410126:
                case -1377594364:
                    EditText editTextM55883 = C0930.m55882(textInputLayout);
                    C0949.m56008(editTextM55883);
                    C0882.m55722(editTextM55883);
                    break;
                case -2015728667:
                case 1859361006:
                    C0927.m55873();
                    C0861.m55626();
                    break;
                case -1959642507:
                case 685837214:
                    i10 = 20165;
                    iM55979 = (C0946.m55979("ۛۙ") ^ i4) * (-75);
                    i2 = ((iM55979 ^ i5) * (-1151)) ^ 1147831358;
                    i3 = -1429842450;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1905069274:
                case -982390890:
                    c = 0;
                    if (C0947.f81895) {
                        iM55979 = (C0873.m55680("ᩴۘ") + i5) * 19;
                        i2 = ((iM55979 ^ i4) * (-15073)) ^ (-658532310);
                        i3 = 915623365;
                    } else {
                        iM55979 = C0946.m55979("֫᩵") ^ i5;
                        i2 = ((iM55979 ^ i4) * 7687) ^ (-2067355610);
                        i3 = -2083633891;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1819632477:
                case -1291661084:
                    textInputLayout.setError(ServiceConnectionC1013.m56156(i));
                    z = true;
                    if (C0927.f81875) {
                        iM55979 = (C0873.m55680("ᩴۘ") + i5) * 19;
                        i2 = ((iM55979 ^ i4) * (-15073)) ^ (-658532310);
                        i3 = 915623365;
                    } else {
                        iM55979 = C0946.m55979("ۜۛ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-8643)) ^ (-1690279835);
                        i3 = 365514725;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1477810548:
                case -26670410:
                    C0917.m55854();
                    iM55979 = C0873.m55680("ۤۗ") ^ i5;
                    i2 = ((iM55979 ^ i4) * (-1923)) ^ 754316921;
                    i3 = -1587451562;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1356408710:
                case -570421352:
                    C0892.m55749();
                    if (C1229.f82066 < 0) {
                        iM55979 = C0873.m55680("᩹ܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 8995) ^ (-2088084035);
                        i3 = 1930572859;
                    } else {
                        iM55979 = C0946.m55979("֫ۨ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 23241) ^ 261278897;
                        i3 = -1829323680;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1352078143:
                case 863128154:
                    textInputLayout.setErrorEnabled(z);
                    editTextM55882 = C0930.m55882(textInputLayout);
                    C0877.m55699(editTextM55882);
                    if (C0861.m55626()) {
                        iM55979 = C0873.m55680("᩹ܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 8995) ^ (-2088084035);
                        i3 = 1930572859;
                    } else {
                        iM55979 = C0946.m55979("ᩴܳ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-22751)) ^ (-1944562157);
                        i3 = -940732963;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -1269967811:
                case 722083160:
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("᩹ܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 8995) ^ (-2088084035);
                        i3 = 1930572859;
                    } else {
                        iM55979 = C0873.m55680("ۤۗ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-1923)) ^ 754316921;
                        i3 = -1587451562;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -880534330:
                case 760684537:
                    if ((s * s2) - i9 > 0) {
                        iM55979 = C0873.m55680("ۗ֫") ^ i5;
                        i2 = ((iM55979 ^ i4) * 21621) ^ (-553497942);
                        i3 = 240782570;
                    } else {
                        iM55979 = (C0946.m55979("᩸ۧ") ^ i4) * 89;
                        i2 = ((iM55979 ^ i5) * (-23723)) ^ 777467406;
                        i3 = 1792924425;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -750376754:
                case 1251390347:
                    editTextM55882.selectAll();
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("ۧ᩶") ^ i4;
                        i2 = ((iM55979 ^ i5) * 6711) ^ (-934914968);
                        i3 = 576597372;
                    } else {
                        iM55979 = (C0946.m55979("ܰۛ") + i4) * (-43);
                        i2 = ((iM55979 ^ i5) * 20261) ^ 1846220674;
                        i3 = -1171367082;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -692213015:
                case 962416024:
                    C0946.m55980();
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("ۤۗ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-1923)) ^ 754316921;
                        i3 = -1587451562;
                    } else {
                        iM55979 = C0873.m55680("ۧ᩶") ^ i4;
                        i2 = ((iM55979 ^ i5) * 6711) ^ (-934914968);
                        i3 = 576597372;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -650739809:
                case -105920184:
                    sArr = f81827;
                    if (C1024.m56209() >= 0) {
                        iM55979 = C0946.m55979("֫ۨ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 23241) ^ 261278897;
                        i3 = -1829323680;
                    } else {
                        iM55979 = C0873.m55680("ܳܺ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-27221)) ^ 1805007402;
                        i3 = -1463170175;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case -399443899:
                case 856506866:
                    i9 = i8 + 217680516;
                    s2 = 29508;
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (C0873.m55680("ᩴۘ") + i5) * 19;
                        i2 = ((iM55979 ^ i4) * (-15073)) ^ (-658532310);
                        i3 = 915623365;
                    } else {
                        iM55979 = C0873.m55680("ۚۗ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-27243)) ^ (-1852671717);
                        i3 = -314631877;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case 659599373:
                case 1016670608:
                    sArr2 = f81827;
                    i11 = 1;
                    i12 = 6;
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("᩹ܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 8995) ^ (-2088084035);
                        i3 = 1930572859;
                    } else {
                        iM55979 = (C0946.m55979("᩶۫") + i5) * (-81);
                        i2 = ((iM55979 ^ i4) * (-12971)) ^ 1776264797;
                        i3 = 1020257742;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case 1157974815:
                case 1627853343:
                    i10 = 21154;
                    iM55979 = (C0946.m55979("ۛۙ") ^ i4) * (-75);
                    i2 = ((iM55979 ^ i5) * (-1151)) ^ 1147831358;
                    i3 = -1429842450;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                case 1986575921:
                case 2109883354:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0873.m55680("᩹ܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 8995) ^ (-2088084035);
                        i3 = 1930572859;
                    } else {
                        iM55979 = (C0946.m55979("ᩳ֨") ^ i4) * 7;
                        i2 = ((iM55979 ^ i5) * (-20611)) ^ (-824973501);
                        i3 = 124310907;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
                default:
                    s = sArr[c];
                    i8 = s * s;
                    if (C0937.f81884) {
                        iM55979 = (i4 - C0946.m55979("ܰ۬")) * 55;
                        i2 = ((iM55979 ^ i5) * (-21383)) ^ 175856292;
                        i3 = 1469747161;
                    } else {
                        iM55979 = C0873.m55680("᩹ܽ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 8995) ^ (-2088084035);
                        i3 = 1930572859;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    break;
            }
            return;
        }
    }
}
