package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.p.a;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܳ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7HQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14382 {

    /* JADX INFO: renamed from: ۗۤ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f43333 = {5155, 12562, 12668, 12669, 12660, 12657, 12661, 12657, 12652, 12669, 12650, 12631, 12650, 12657, 12671, 12657, 12662, 12665, 12660, 12592, 12593, 12578, 12562, 12620, 12650, 12665, 12662, 12651, 12660, 12665, 12652, 12669, 12668, 12592, 12620, 12650, 12665, 12662, 12651, 12660, 12665, 12652, 12657, 12663, 12662, 12600, 12670, 12665, 12657, 12660, 12669, 12668, 12578, 12600, 12598, 12598, 12598};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17205 f43334;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f43335;

    public C14382(TranslationEngine translationEngine) {
        TranslationEngine.Configuration configuration = null;
        int i = -1420020520;
        int i2 = C0422.f1886;
        int i3 = C0630.f2410;
        int iM2566 = C0630.m2566("ᩳܽ") ^ i3;
        int i4 = ((iM2566 ^ i2) * 1353) ^ (-1149831526);
        int i5 = -650242924;
        while (true) {
            i = ((((i ^ i2) * 8865) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2087862024:
                case -1631356553:
                    this.f43335 = translationEngine;
                    configuration = translationEngine.getConfiguration();
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((iM2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        iM2566 = (C0630.m2566("ܰۢ") ^ i2) * (-21);
                        i4 = ((iM2566 ^ i3) * 2501) ^ (-1550531222);
                        i5 = 919219343;
                    }
                    break;
                case -1999200371:
                case -1356911697:
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("֨ܿ") + i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 30863) ^ (-957019217);
                        i5 = -1676365776;
                    } else {
                        iM2566 = (C2105.m6981("ۜᩳ") ^ i3) * (-113);
                        i4 = ((iM2566 ^ i2) * 30225) ^ (-664108010);
                        i5 = 1029571029;
                    }
                    break;
                case -1872629430:
                case 2080434629:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((iM2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩺ܰ")) * (-103);
                        i4 = ((iM2566 ^ i3) * (-10981)) ^ 500736597;
                        i5 = 1920185630;
                    }
                    break;
                case -1795082745:
                case -1033797666:
                    if (C4159.m12565() >= 0) {
                        iM2566 = C0630.m2566("ۡۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1451)) ^ (-1316263353);
                        i5 = -444987562;
                    } else {
                        iM2566 = C0630.m2566("ܶ۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26767)) ^ 1619368134;
                        i5 = -1693210553;
                    }
                    break;
                case -1629209469:
                case 1663665764:
                    if (C4117.m12364() == 0) {
                        int i6 = configuration.maxTranslationTextLength;
                        if (RunnableC1937.f6483 < 0) {
                            this.f43334 = new C17205(this, i6, configuration.textLengthCalculator);
                            return;
                        }
                    }
                    iM2566 = C0630.m2566("ۡۨ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-1451)) ^ (-1316263353);
                    i5 = -444987562;
                    break;
                case -1077267401:
                case -302296688:
                    C0050.m940();
                    if (C4263.m12819() < 0) {
                        iM2566 = (C2105.m6981("ۜᩳ") ^ i3) * (-113);
                        i4 = ((iM2566 ^ i2) * 30225) ^ (-664108010);
                        i5 = 1029571029;
                    } else {
                        iM2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((iM2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    }
                    break;
                case -1046240920:
                case 2046351840:
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("᩵ۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-19975)) ^ (-585435769);
                        i5 = -892197629;
                    } else {
                        iM2566 = C2105.m6981("۬֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21421) ^ 853028996;
                        i5 = 1697853529;
                    }
                    break;
                case -988684822:
                case -785482014:
                    if (C7811.f24123 < 0) {
                        iM2566 = C2105.m6981("۬֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21421) ^ 853028996;
                        i5 = 1697853529;
                    } else {
                        iM2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((iM2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    }
                    break;
                case -39810569:
                case 1313196162:
                    C1773.m5908();
                    iM2566 = (C0630.m2566("ᩴۤ") ^ i2) * (-105);
                    i4 = ((iM2566 ^ i3) * 16509) ^ (-48076900);
                    i5 = -1665410258;
                    break;
                case -7206280:
                case 1415516933:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C2105.m6981("ۜᩳ") ^ i3) * (-113);
                        i4 = ((iM2566 ^ i2) * 30225) ^ (-664108010);
                        i5 = 1029571029;
                    } else {
                        iM2566 = (C2105.m6981("۬ۚ") ^ i3) * 11;
                        i4 = ((iM2566 ^ i2) * (-8755)) ^ 1102292230;
                        i5 = -1717136443;
                    }
                    break;
                case 807335624:
                case 1411262217:
                    RunnableC1108.m3790();
                    C22628.m50615();
                    throw new RuntimeException();
                case 843217919:
                case 2111352676:
                    AbstractC2021.m6574();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((iM2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۤ") ^ i2) * (-105);
                        i4 = ((iM2566 ^ i3) * 16509) ^ (-48076900);
                        i5 = -1665410258;
                    }
                    break;
                case 1559710814:
                case 2083828861:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((iM2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        iM2566 = C0630.m2566("ܰܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 13745) ^ (-186436353);
                        i5 = 1577928970;
                    }
                    break;
                default:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((iM2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ܿܺ")) * 39;
                        i4 = ((iM2566 ^ i3) * 2871) ^ (-1259251725);
                        i5 = -1466276690;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x061c A[PHI: r3 r6 r7 r8 r9 r14 r17 r18 r19 r20 r21 r25 r29 r32
      0x061c: PHI (r3v58 boolean) = (r3v47 boolean), (r3v48 boolean), (r3v59 boolean) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r6v46 java.lang.String) = (r6v35 java.lang.String), (r6v36 java.lang.String), (r17v2 java.lang.String) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v5 java.lang.String) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r8v36 java.lang.String) = (r8v25 java.lang.String), (r8v26 java.lang.String), (r8v37 java.lang.String) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r14v6 java.lang.String) = (r14v1 java.lang.String), (r14v1 java.lang.String), (r14v7 java.lang.String) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r17v14 int) = (r17v3 int), (r17v4 int), (r17v15 int) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r18v23 java.lang.StringBuilder) = (r18v12 java.lang.StringBuilder), (r18v13 java.lang.StringBuilder), (r18v24 java.lang.StringBuilder) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r19v5 short[]) = (r19v3 short[]), (r19v2 short[]), (r19v2 short[]) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r20v5 short) = (r20v2 short), (r20v3 short), (r20v2 short) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r21v5 int) = (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r25v4 bin.mt.plugin.api.translation.TranslationEngine) = 
      (r25v2 bin.mt.plugin.api.translation.TranslationEngine)
      (r25v2 bin.mt.plugin.api.translation.TranslationEngine)
      (r25v5 bin.mt.plugin.api.translation.TranslationEngine)
     binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r29v32 java.lang.String) = (r29v21 java.lang.String), (r29v22 java.lang.String), (r29v33 java.lang.String) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x061c: PHI (r32v24 short[]) = (r32v14 short[]), (r32v15 short[]), (r32v25 short[]) binds: [B:121:0x061a, B:117:0x05ee, B:47:0x01d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] m34353(String[] strArr, String str, String str2) {
        String str3;
        StringBuilder sb;
        int iM2566;
        int i;
        int i2;
        int i3;
        int iM6981;
        int i4;
        int i5;
        StringBuilder sb2;
        int iM6982;
        int i6;
        int i7;
        String str4;
        int iM6983;
        int i8;
        int i9;
        StringBuilder sb3;
        boolean z;
        int iM2567;
        int i10;
        int i11;
        int iM6984;
        int i12;
        int i13;
        int i14 = ViewOnClickListenerC1958.f6529;
        int i15 = C3683.f11629;
        int iM2568 = C0630.m2566("᩺᩹") ^ i15;
        int i16 = ((iM2568 ^ i14) * 26071) ^ 1093874113;
        StringBuilder sb4 = null;
        TranslationEngine translationEngine = null;
        String[] strArrSplit = null;
        PluginContext context = null;
        String strM9934 = null;
        StringBuilder sb5 = null;
        short[] sArr = null;
        int i17 = iM2568 ^ 290245880;
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        int i20 = 0;
        int i21 = 0;
        short s2 = 0;
        int i22 = 612616836;
        StringBuilder sb6 = null;
        boolean z2 = false;
        String strM34351 = null;
        String strM14172 = null;
        String strM1959 = null;
        String str5 = null;
        String strM947 = null;
        int i23 = 0;
        String str6 = null;
        short[] sArr2 = null;
        boolean z3 = false;
        while (true) {
            i22 = i17 ^ (i16 & (((i22 ^ i14) * 32207) >> 31));
            switch (i22) {
                case -2135303815:
                case 2036467907:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    z = z2;
                    str5 = str5;
                    strArrSplit = str6.split(str5, -1);
                    sb3 = sb6;
                    if (strArrSplit.length == strArr.length) {
                        iM2567 = (i14 - C2105.m6981("۬֫")) * (-47);
                        i10 = ((iM2567 ^ i15) * (-17529)) ^ 890339993;
                        i11 = -430881525;
                    } else {
                        iM2567 = (C0630.m2566("ܽᩳ") + i15) * 5;
                        i10 = ((iM2567 ^ i14) * 29755) ^ 1647709011;
                        i11 = -1790403187;
                    }
                    int i24 = iM2567 ^ i11;
                    z2 = z;
                    sb6 = sb3;
                    strM947 = strM947;
                    i17 = i24;
                    i16 = i10;
                    str5 = str5;
                    sArr2 = sArr2;
                    break;
                case -1973653698:
                case -1808218152:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    sb2 = sb6;
                    if (C0798.m3007(str6) <= 100) {
                        strM947 = str6;
                        int iM2569 = (C0630.m2566("᩺ܶ") + i15) * 71;
                        i17 = iM2569 ^ 12519117;
                        sb6 = sb2;
                        i16 = ((iM2569 ^ i14) * 6957) ^ 318610051;
                        sArr2 = sArr2;
                    } else {
                        iM6982 = (C2105.m6981("᩻۬") ^ i14) * (-73);
                        i6 = ((iM6982 ^ i15) * (-18491)) ^ 1748117964;
                        i7 = 1192910925;
                        int i25 = iM6982 ^ i7;
                        sb6 = sb2;
                        i16 = i6;
                        sArr2 = sArr2;
                        str4 = strM947;
                        i17 = i25;
                        strM947 = str4;
                    }
                    break;
                case -1966393632:
                case -66395201:
                    C2167.m7155();
                    if (!RunnableC1108.f4040) {
                        iM6984 = (i15 - C2105.m6981("ۘܽ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i12 = ((iM6984 ^ i14) * (-14835)) ^ (-1005930684);
                        i13 = 346490297;
                        i17 = iM6984 ^ i13;
                        i16 = i12;
                    } else {
                        strM947 = strM947;
                        sArr2 = sArr2;
                        strM34351 = strM34351;
                        str5 = str5;
                        z2 = z2;
                        i23 = i23;
                        int iM25610 = (i14 - C0630.m2566("֫ܿ")) * 25;
                        z2 = z2;
                        str5 = str5;
                        strM947 = strM947;
                        sArr2 = sArr2;
                        i17 = iM25610 ^ (-752684022);
                        i16 = ((iM25610 ^ i15) * (-10165)) ^ (-24145295);
                        i23 = i23;
                        strM34351 = strM34351;
                    }
                    break;
                case -1922007279:
                case 1975571481:
                    C3245.m9923(sb5, C0798.m3005(sArr2, 54, 3, i19));
                    strM947 = C0050.m947(sb5);
                    sArr2 = sArr2;
                    sb2 = sb6;
                    int iM25611 = (C0630.m2566("᩺ܶ") + i15) * 71;
                    i17 = iM25611 ^ 12519117;
                    sb6 = sb2;
                    i16 = ((iM25611 ^ i14) * 6957) ^ 318610051;
                    sArr2 = sArr2;
                    break;
                case -1909081316:
                case 872123146:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    str5 = str5;
                    sb6 = sb6;
                    z2 = z2;
                    i23 = i23;
                    int i26 = s + s2;
                    if ((i26 * i26) - i21 <= 0) {
                        iM6983 = (C0630.m2566("ܿ֡") + i14) * (-119);
                        i8 = ((iM6983 ^ i15) * (-22273)) ^ (-1222316168);
                        i9 = 98015208;
                    } else {
                        iM6983 = C2105.m6981("ۘ᩸") ^ i15;
                        i8 = ((iM6983 ^ i14) * 13677) ^ 1440815585;
                        i9 = 773305853;
                    }
                    int i27 = iM6983 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM947 = strM947;
                    i17 = i27;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    break;
                case -1695375125:
                case 1650767066:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6984 = (C2105.m6981("ܶۡ") ^ i15) * (-127);
                        i12 = ((iM6984 ^ i14) * 11879) ^ (-2105638015);
                        i13 = 1284251695;
                        i17 = iM6984 ^ i13;
                        i16 = i12;
                    } else {
                        strM947 = strM947;
                        sArr2 = sArr2;
                        int iM25612 = C0630.m2566("֫ܰ") ^ i14;
                        i = ((iM25612 ^ i15) * 32137) ^ 1452213994;
                        i3 = iM25612 ^ (-1159725487);
                        sArr2 = sArr2;
                        str4 = strM947;
                        i17 = i3;
                        i16 = i;
                        strM947 = str4;
                    }
                    break;
                case -1567827589:
                case 1592095362:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    strM9934 = C3245.m9934(f43333, 20, 3, i19);
                    sb2 = sb6;
                    C1420.m4905(sb2, strM9934);
                    C1420.m4905(sb2, strM1959);
                    if (C0714.f2697 < 0) {
                        iM6982 = (i15 - C2105.m6981("᩷ۜ")) * (-27);
                        i6 = ((iM6982 ^ i14) * 6463) ^ (-331587974);
                        i7 = -358410502;
                        int i28 = iM6982 ^ i7;
                        sb6 = sb2;
                        i16 = i6;
                        sArr2 = sArr2;
                        str4 = strM947;
                        i17 = i28;
                        strM947 = str4;
                    } else {
                        str5 = str5;
                        z2 = z2;
                        sb6 = sb2;
                        i23 = i23;
                        iM6983 = C0630.m2566("۬ܶ") ^ i15;
                        i8 = ((iM6983 ^ i14) * 10787) ^ 480570170;
                        i9 = -669470149;
                        int i29 = iM6983 ^ i9;
                        z2 = z2;
                        sb6 = sb6;
                        strM947 = strM947;
                        i17 = i29;
                        i16 = i8;
                        str5 = str5;
                        i23 = i23;
                        sArr2 = sArr2;
                        strM34351 = strM34351;
                    }
                    break;
                case -1444956818:
                case -643044757:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    str5 = str5;
                    sb6 = sb6;
                    z2 = z2;
                    i23 = i23;
                    s = sArr[0];
                    i20 = s * s;
                    if (C0964.f3626 != 0) {
                        iM6983 = C0630.m2566("۬ܶ") ^ i15;
                        i8 = ((iM6983 ^ i14) * 10787) ^ 480570170;
                        i9 = -669470149;
                    } else {
                        iM6983 = C0630.m2566("ۡ᩶") ^ i15;
                        i8 = ((iM6983 ^ i14) * 25793) ^ 1615148903;
                        i9 = 830822296;
                    }
                    int i210 = iM6983 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM947 = strM947;
                    i17 = i210;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    break;
                case -1396389757:
                case -107306086:
                    sb4.append((CharSequence) strArr[i23]);
                    i18 = 1;
                    iM6981 = (C0630.m2566("᩸ܿ") ^ i15) * 127;
                    i4 = ((iM6981 ^ i14) * 5841) ^ 1838380476;
                    i5 = 781491232;
                    int i30 = iM6981 ^ i5;
                    sb6 = sb6;
                    z2 = z2;
                    i16 = i4;
                    strM947 = strM947;
                    sArr2 = sArr2;
                    i17 = i30;
                    break;
                case -1371784948:
                case 1170687678:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    sb6 = sb6;
                    z2 = z2;
                    strM1959 = C0422.m1959(sb4);
                    TranslationEngine translationEngine2 = this.f43335;
                    String strTranslate = translationEngine2.translate(strM1959, str, str2);
                    String strQuote = Pattern.quote(strM14172);
                    if (C1504.m5179()) {
                        int iM25613 = C0630.m2566("ܺ᩹") ^ i14;
                        i16 = ((iM25613 ^ i15) * (-8601)) ^ 1020494041;
                        int i31 = iM25613 ^ 759256715;
                        str6 = strTranslate;
                        sArr2 = sArr2;
                        translationEngine = translationEngine2;
                        z2 = z2;
                        strM947 = strM947;
                        i17 = i31;
                        sb6 = sb6;
                        str5 = strQuote;
                    } else {
                        str6 = strTranslate;
                        str5 = strQuote;
                        translationEngine = translationEngine2;
                        i23 = i23;
                        iM6983 = C0630.m2566("۬ܶ") ^ i15;
                        i8 = ((iM6983 ^ i14) * 10787) ^ 480570170;
                        i9 = -669470149;
                        int i211 = iM6983 ^ i9;
                        z2 = z2;
                        sb6 = sb6;
                        strM947 = strM947;
                        i17 = i211;
                        i16 = i8;
                        str5 = str5;
                        i23 = i23;
                        sArr2 = sArr2;
                        strM34351 = strM34351;
                    }
                    break;
                case -1170443643:
                case -422300119:
                    i19 = 12568;
                    iM6983 = C2105.m6981("᩶᩸") ^ i14;
                    i8 = ((iM6983 ^ i15) * (-25093)) ^ (-382495871);
                    i9 = 351367285;
                    int i212 = iM6983 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM947 = strM947;
                    i17 = i212;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    break;
                case -1160881532:
                case -457938031:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    str3 = str5;
                    sb = sb6;
                    sb4 = new StringBuilder();
                    z2 = true;
                    if (strArr.length > 0) {
                        iM2566 = (C0630.m2566("ܿ᩷") ^ i15) * 119;
                        i = ((iM2566 ^ i14) * (-11495)) ^ (-1529630547);
                        i2 = 1397146745;
                    } else {
                        iM2566 = (C2105.m6981("᩹ۙ") ^ i14) * (-9);
                        i = ((iM2566 ^ i15) * 30927) ^ 2040671990;
                        i2 = -1528407139;
                    }
                    i3 = iM2566 ^ i2;
                    sb6 = sb;
                    str5 = str3;
                    sArr2 = sArr2;
                    str4 = strM947;
                    i17 = i3;
                    i16 = i;
                    strM947 = str4;
                    break;
                case -989693504:
                case -950470904:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    str5 = str5;
                    sb6 = sb6;
                    z2 = z2;
                    i23 = i23;
                    int i32 = i20 + 1527696;
                    i21 = i32 + i32;
                    s2 = 1236;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6983 = C2105.m6981("ۜۡ") ^ i15;
                        i8 = ((iM6983 ^ i14) * (-1091)) ^ (-601456331);
                        i9 = -948137630;
                        int i213 = iM6983 ^ i9;
                        z2 = z2;
                        sb6 = sb6;
                        strM947 = strM947;
                        i17 = i213;
                        i16 = i8;
                        str5 = str5;
                        i23 = i23;
                        sArr2 = sArr2;
                        strM34351 = strM34351;
                    } else {
                        sb6 = sb6;
                        int iM25614 = (i14 - C0630.m2566("֫ܿ")) * 25;
                        z2 = z2;
                        str5 = str5;
                        strM947 = strM947;
                        sArr2 = sArr2;
                        i17 = iM25614 ^ (-752684022);
                        i16 = ((iM25614 ^ i15) * (-10165)) ^ (-24145295);
                        i23 = i23;
                        strM34351 = strM34351;
                    }
                    break;
                case -886495778:
                case -285414269:
                    if (C2958.f9394 >= 0) {
                        iM6984 = (C2105.m6981("ܿ۠") + i14) * 17;
                        i12 = ((iM6984 ^ i15) * (-31035)) ^ 754576054;
                        i13 = 1785177223;
                        i17 = iM6984 ^ i13;
                        i16 = i12;
                    } else {
                        strM947 = strM947;
                        sArr2 = sArr2;
                        strM34351 = strM34351;
                        str5 = str5;
                        z2 = z2;
                        i23 = i23;
                        int iM25615 = (i14 - C0630.m2566("֫ܿ")) * 25;
                        z2 = z2;
                        str5 = str5;
                        strM947 = strM947;
                        sArr2 = sArr2;
                        i17 = iM25615 ^ (-752684022);
                        i16 = ((iM25615 ^ i15) * (-10165)) ^ (-24145295);
                        i23 = i23;
                        strM34351 = strM34351;
                    }
                    break;
                case -863203562:
                case 748662300:
                    C3663.m11168();
                    if (C4616.m13552() == 0) {
                        strM947 = strM947;
                        sArr2 = sArr2;
                        int iM6985 = (C2105.m6981("ۗܰ") ^ i14) * (-45);
                        i = ((iM6985 ^ i15) * 23053) ^ (-1059144182);
                        i3 = iM6985 ^ (-1355806111);
                        sArr2 = sArr2;
                        sb6 = null;
                        str4 = strM947;
                        i17 = i3;
                        i16 = i;
                        strM947 = str4;
                    }
                    strM947 = strM947;
                    sArr2 = sArr2;
                    int iM25616 = C0630.m2566("֫ܰ") ^ i14;
                    i = ((iM25616 ^ i15) * 32137) ^ 1452213994;
                    i3 = iM25616 ^ (-1159725487);
                    sArr2 = sArr2;
                    str4 = strM947;
                    i17 = i3;
                    i16 = i;
                    strM947 = str4;
                    break;
                case -768381614:
                case -150941863:
                    throw new IOException(C20094.m46315(RunnableC0588.m2436(f43333, 34, 20, i19), strM947));
                case -684549495:
                case -593044814:
                    context.log(C0050.m947(sb6));
                    short[] sArr3 = f43333;
                    if (!C1711.f5919) {
                        strM947 = strM947;
                        sArr2 = sArr2;
                        String strM4902 = C1420.m4902(sArr3, 23, 11, i19);
                        if (C0422.f1886 > 0) {
                            StringBuilder sb7 = new StringBuilder(strM4902);
                            C0422.m1944(sb7, strArrSplit.length);
                            C3245.m9923(sb7, strM9934);
                            C1420.m4905(sb7, str6);
                            context.log(C0422.m1959(sb7));
                            sb6 = sb6;
                            z2 = z2;
                            iM6981 = C2105.m6981("᩹᩺") ^ i15;
                            i4 = ((iM6981 ^ i14) * 29803) ^ (-79947249);
                            i5 = 1622952212;
                            int i33 = iM6981 ^ i5;
                            sb6 = sb6;
                            z2 = z2;
                            i16 = i4;
                            strM947 = strM947;
                            sArr2 = sArr2;
                            i17 = i33;
                        } else {
                            int iM25617 = C0630.m2566("֫ܰ") ^ i14;
                            i = ((iM25617 ^ i15) * 32137) ^ 1452213994;
                            i3 = iM25617 ^ (-1159725487);
                            sArr2 = sArr2;
                            str4 = strM947;
                            i17 = i3;
                            i16 = i;
                            strM947 = str4;
                        }
                    } else {
                        strM947 = strM947;
                        sArr2 = sArr2;
                        strM34351 = strM34351;
                        str5 = str5;
                        z2 = z2;
                        i23 = i23;
                        int iM25618 = (i14 - C0630.m2566("֫ܿ")) * 25;
                        z2 = z2;
                        str5 = str5;
                        strM947 = strM947;
                        sArr2 = sArr2;
                        i17 = iM25618 ^ (-752684022);
                        i16 = ((iM25618 ^ i15) * (-10165)) ^ (-24145295);
                        i23 = i23;
                        strM34351 = strM34351;
                    }
                    break;
                case -683634343:
                case 1204816287:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    sb6 = sb6;
                    z2 = z2;
                    context = translationEngine.getContext();
                    if (context != null) {
                        iM6981 = (C0630.m2566("ۗᩳ") + i14) * 39;
                        i4 = ((iM6981 ^ i15) * 16293) ^ 704117523;
                        i5 = -595525808;
                    } else {
                        iM6981 = C2105.m6981("᩹᩺") ^ i15;
                        i4 = ((iM6981 ^ i14) * 29803) ^ (-79947249);
                        i5 = 1622952212;
                    }
                    int i34 = iM6981 ^ i5;
                    sb6 = sb6;
                    z2 = z2;
                    i16 = i4;
                    strM947 = strM947;
                    sArr2 = sArr2;
                    i17 = i34;
                    break;
                case -628057424:
                case -107075677:
                    i19 = 64224;
                    iM6983 = C2105.m6981("᩶᩸") ^ i14;
                    i8 = ((iM6983 ^ i15) * (-25093)) ^ (-382495871);
                    i9 = 351367285;
                    int i214 = iM6983 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM947 = strM947;
                    i17 = i214;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    break;
                case -523837599:
                case -515648384:
                    z = z2;
                    strM34351 = m34351(z, strArr);
                    z3 = true;
                    sb3 = sb6;
                    iM2567 = C2105.m6981("ۢܶ") ^ i14;
                    i10 = ((iM2567 ^ i15) * (-11813)) ^ (-1139755876);
                    i11 = 1000090268;
                    int i215 = iM2567 ^ i11;
                    z2 = z;
                    sb6 = sb3;
                    strM947 = strM947;
                    i17 = i215;
                    i16 = i10;
                    str5 = str5;
                    sArr2 = sArr2;
                    break;
                case -464789631:
                case 144373266:
                    C3245.m9925();
                    return null;
                case -439860694:
                case 1152003256:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    str5 = str5;
                    sb6 = sb6;
                    z2 = z2;
                    i23 = i23;
                    sArr = f43333;
                    if (C21923.m49329()) {
                        iM6983 = C0630.m2566("۬ܶ") ^ i15;
                        i8 = ((iM6983 ^ i14) * 10787) ^ 480570170;
                        i9 = -669470149;
                    } else {
                        iM6983 = (i14 - C2105.m6981("ۙۚ")) * 75;
                        i8 = ((iM6983 ^ i15) * 11773) ^ (-2125248730);
                        i9 = 267344924;
                    }
                    int i216 = iM6983 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM947 = strM947;
                    i17 = i216;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    break;
                case -386903175:
                case 1808534643:
                    return strArrSplit;
                case -325283297:
                case -58768215:
                    if (!C0382.m1848()) {
                        strM947 = strM947;
                        sArr2 = sArr2;
                        int iM25619 = C0630.m2566("֫ܰ") ^ i14;
                        i = ((iM25619 ^ i15) * 32137) ^ 1452213994;
                        i3 = iM25619 ^ (-1159725487);
                        sArr2 = sArr2;
                        str4 = strM947;
                        i17 = i3;
                        i16 = i;
                        strM947 = str4;
                    } else {
                        iM6984 = (C2105.m6981("ܿ۠") + i14) * 17;
                        i12 = ((iM6984 ^ i15) * (-31035)) ^ 754576054;
                        i13 = 1785177223;
                        i17 = iM6984 ^ i13;
                        i16 = i12;
                    }
                    break;
                case -265168645:
                case 1668056822:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    sb6 = sb6;
                    z2 = z2;
                    if (i18 >= strArr.length) {
                        z2 = z2;
                        str3 = str5;
                        sb = sb6;
                        iM2566 = (C2105.m6981("᩹ۙ") ^ i14) * (-9);
                        i = ((iM2566 ^ i15) * 30927) ^ 2040671990;
                        i2 = -1528407139;
                        i3 = iM2566 ^ i2;
                        sb6 = sb;
                        str5 = str3;
                        sArr2 = sArr2;
                        str4 = strM947;
                        i17 = i3;
                        i16 = i;
                        strM947 = str4;
                    } else {
                        iM6981 = (C2105.m6981("ᩳܽ") ^ i14) * (-55);
                        i4 = ((iM6981 ^ i15) * 18821) ^ (-1734260868);
                        i5 = -497128415;
                        int i35 = iM6981 ^ i5;
                        sb6 = sb6;
                        z2 = z2;
                        i16 = i4;
                        strM947 = strM947;
                        sArr2 = sArr2;
                        i17 = i35;
                    }
                    break;
                case -80951375:
                case 1598331846:
                    RunnableC3474.m10630();
                    strM947 = strM947;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    str5 = str5;
                    z2 = z2;
                    i23 = i23;
                    int iM256110 = (i14 - C0630.m2566("֫ܿ")) * 25;
                    z2 = z2;
                    str5 = str5;
                    strM947 = strM947;
                    sArr2 = sArr2;
                    i17 = iM256110 ^ (-752684022);
                    i16 = ((iM256110 ^ i15) * (-10165)) ^ (-24145295);
                    i23 = i23;
                    strM34351 = strM34351;
                    break;
                case -45427431:
                case 1874809407:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    str5 = str5;
                    sb6 = sb6;
                    z2 = z2;
                    String strM12252 = C4075.m12252(f43333, 1, 1, i19);
                    strM34351 = strM34351;
                    strM14172 = C4860.m14172(strM12252, strM34351, strM12252);
                    if (strM14172 != null) {
                        iM6983 = (C0630.m2566("ܰ᩶") ^ i15) * (-61);
                        i23 = i23;
                        i8 = ((iM6983 ^ i14) * 25915) ^ (-902950105);
                        i9 = 17376709;
                    } else {
                        i23 = i23;
                        iM6983 = C2105.m6981("ᩳۧ") ^ i15;
                        i8 = ((iM6983 ^ i14) * (-12145)) ^ (-2089595647);
                        i9 = 670794939;
                    }
                    int i217 = iM6983 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM947 = strM947;
                    i17 = i217;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM34351 = strM34351;
                    break;
                case 123111432:
                case 1168639783:
                    sb5 = new StringBuilder();
                    C3245.m9923(sb5, C11340.m28015(str6, i23, 99));
                    sArr2 = f43333;
                    if (C1294.f4556 >= 0) {
                        iM6984 = (C2105.m6981("ܶۡ") ^ i15) * (-127);
                        i12 = ((iM6984 ^ i14) * 11879) ^ (-2105638015);
                        i13 = 1284251695;
                    } else {
                        iM6984 = C0630.m2566("ۨ᩺") ^ i15;
                        i12 = ((iM6984 ^ i14) * (-9169)) ^ (-1584798928);
                        i13 = -2125994650;
                    }
                    i17 = iM6984 ^ i13;
                    i16 = i12;
                    break;
                case 219325973:
                case 328851790:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    String strM6435 = ViewOnClickListenerC1958.m6435(f43333, 11, 9, i19);
                    if (!C1711.f5919) {
                        sb2 = new StringBuilder(strM6435);
                        C0050.m945(sb2, strArr.length);
                        if (C4616.f14690 > 0) {
                            iM6982 = (C0630.m2566("᩹ۤ") ^ i14) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((iM6982 ^ i15) * 7283) ^ (-698873766);
                            i7 = -2132125561;
                            int i218 = iM6982 ^ i7;
                            sb6 = sb2;
                            i16 = i6;
                            sArr2 = sArr2;
                            str4 = strM947;
                            i17 = i218;
                            strM947 = str4;
                        } else {
                            sb6 = sb2;
                            strM34351 = strM34351;
                            str5 = str5;
                            z2 = z2;
                            i23 = i23;
                            int iM256111 = (i14 - C0630.m2566("֫ܿ")) * 25;
                            z2 = z2;
                            str5 = str5;
                            strM947 = strM947;
                            sArr2 = sArr2;
                            i17 = iM256111 ^ (-752684022);
                            i16 = ((iM256111 ^ i15) * (-10165)) ^ (-24145295);
                            i23 = i23;
                            strM34351 = strM34351;
                        }
                    } else {
                        int iM6986 = (C2105.m6981("ۗܰ") ^ i14) * (-45);
                        i = ((iM6986 ^ i15) * 23053) ^ (-1059144182);
                        i3 = iM6986 ^ (-1355806111);
                        sArr2 = sArr2;
                        sb6 = null;
                        str4 = strM947;
                        i17 = i3;
                        i16 = i;
                        strM947 = str4;
                    }
                    break;
                case 245611748:
                case 273525328:
                    sb4.append((CharSequence) strM14172);
                    sb4.append((CharSequence) strArr[i18]);
                    i18++;
                    iM6981 = (C0630.m2566("᩸ܿ") ^ i15) * 127;
                    i4 = ((iM6981 ^ i14) * 5841) ^ 1838380476;
                    i5 = 781491232;
                    int i36 = iM6981 ^ i5;
                    sb6 = sb6;
                    z2 = z2;
                    i16 = i4;
                    strM947 = strM947;
                    sArr2 = sArr2;
                    i17 = i36;
                    break;
                case 1087478400:
                case 2011099529:
                    sb3 = sb6;
                    z = z2;
                    strM34351 = m34351(false, strArr);
                    i23 = 0;
                    z3 = false;
                    iM2567 = C2105.m6981("ۢܶ") ^ i14;
                    i10 = ((iM2567 ^ i15) * (-11813)) ^ (-1139755876);
                    i11 = 1000090268;
                    int i219 = iM2567 ^ i11;
                    z2 = z;
                    sb6 = sb3;
                    strM947 = strM947;
                    i17 = i219;
                    i16 = i10;
                    str5 = str5;
                    sArr2 = sArr2;
                    break;
                case 1407398466:
                case 1527913273:
                    strM947 = strM947;
                    sArr2 = sArr2;
                    sb6 = sb6;
                    z2 = z2;
                    if (z3) {
                        iM6981 = C2105.m6981("᩷۟") ^ i14;
                        i4 = ((iM6981 ^ i15) * (-27441)) ^ (-604014392);
                        i5 = -2090856922;
                    } else {
                        iM6981 = (i15 - C2105.m6981("ܽ֫")) * 15;
                        i4 = ((iM6981 ^ i14) * (-11687)) ^ 1098876119;
                        i5 = -1289732752;
                    }
                    int i37 = iM6981 ^ i5;
                    sb6 = sb6;
                    z2 = z2;
                    i16 = i4;
                    strM947 = strM947;
                    sArr2 = sArr2;
                    i17 = i37;
                    break;
                default:
                    throw new NullPointerException(C11340.m28025(f43333, 2, 9, i19));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17205 m34352() {
        return this.f43334;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0176 A[PHI: r7 r8
      0x0176: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:46:0x0174, B:17:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:46:0x0174, B:17:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0271  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a5 A[PHI: r6
      0x02a5: PHI (r6v3 char[]) = (r6v2 char[]), (r6v4 char[]) binds: [B:75:0x02a3, B:50:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x030b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0340 A[PHI: r2 r20
      0x0340: PHI (r2v4 int) = (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:87:0x033e, B:67:0x024f, B:63:0x0231, B:59:0x0215, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0340: PHI (r20v5 int) = (r20v4 int), (r20v3 int), (r20v3 int), (r20v3 int), (r20v3 int) binds: [B:87:0x033e, B:67:0x024f, B:63:0x0231, B:59:0x0215, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34351(boolean z, String[] strArr) {
        int iM6981;
        int i;
        int i2;
        int i3 = C1773.f6144;
        int i4 = C4616.f14690;
        int iM2566 = C0630.m2566("۬ۖ") ^ i3;
        int i5 = ((iM2566 ^ i4) * (-13973)) ^ (-1290904560);
        String str = null;
        int i6 = iM2566 ^ (-1642524444);
        int length = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 63227906;
        int i16 = 0;
        char[] cArr = null;
        int i17 = 0;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i4) * 21029) >> 31));
            switch (i15) {
                case -2092694159:
                case -317377897:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C0630.m2566("᩷۟") ^ i4;
                        i = ((iM6981 ^ i3) * (-18861)) ^ 298112397;
                        i2 = 1559078901;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۧ᩸")) * 19;
                        i = ((iM6981 ^ i4) * 8329) ^ 924897757;
                        i2 = -474033750;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1974343401:
                case -900668122:
                    if (i7 < length) {
                        iM6981 = C2105.m6981("᩶ܰ") ^ i4;
                        i = ((iM6981 ^ i3) * 9891) ^ (-1104205303);
                        i2 = 1997811416;
                    } else {
                        iM6981 = C2105.m6981("ܰ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-1369)) ^ (-1393711785);
                        i2 = -1286273211;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1929281821:
                case 124712622:
                    C4616.m13552();
                    C11340.m28031();
                    return null;
                case -1807565451:
                case -692036033:
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("᩷۟") ^ i4;
                        i = ((iM6981 ^ i3) * (-18861)) ^ 298112397;
                        i2 = 1559078901;
                    } else {
                        iM6981 = C2105.m6981("ۤ۫") ^ i3;
                        i = ((iM6981 ^ i4) * (-9303)) ^ (-1982110369);
                        i2 = 1558207532;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1748216341:
                case 907830256:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ܺۨ") ^ i3;
                        i = ((iM6981 ^ i4) * (-24801)) ^ (-1325063723);
                        i2 = 1840056746;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܽᩳ")) * 97;
                        i = ((iM6981 ^ i4) * 10487) ^ (-1220626580);
                        i2 = -568517133;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1742626890:
                case 1085631262:
                    int i18 = i12 + 1;
                    if (i18 > i10) {
                        i13 = i18;
                        i14 = i13;
                    } else {
                        i14 = i18;
                        i13 = i10;
                    }
                    iM6981 = C0630.m2566("ۢܰ") ^ i4;
                    i = ((iM6981 ^ i3) * (-11011)) ^ 571798408;
                    i2 = 1327973563;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1645706468:
                case 654353796:
                    cArr = new char[i17];
                    Arrays.fill(cArr, c);
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("ۚۘ") ^ i4) * (-61);
                        i = ((iM6981 ^ i3) * 9617) ^ (-827143952);
                        i2 = -1446591636;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۘ֫")) * 91;
                        i = ((iM6981 ^ i3) * (-8809)) ^ 1734826292;
                        i2 = 1160586118;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1633396315:
                case 1771849461:
                    i9++;
                    i10 = i13;
                    i12 = i14;
                    iM6981 = (i4 - C2105.m6981("᩸֡")) * (-69);
                    i = ((iM6981 ^ i3) * 12339) ^ (-1888868616);
                    i2 = -538648712;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1538670885:
                case 1918755165:
                    i17 = i16;
                    i7 = 0;
                    iM6981 = (C0630.m2566("ۗ᩸") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM6981 ^ i3) * 6289) ^ (-1234066472);
                    i2 = 1098384696;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1380665430:
                case 1823035670:
                    if (C4616.f14690 > 0) {
                        iM6981 = C0630.m2566("ܺۨ") ^ i3;
                        i = ((iM6981 ^ i4) * (-24801)) ^ (-1325063723);
                        i2 = 1840056746;
                    } else {
                        iM6981 = C0630.m2566("᩹ۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 3785) ^ (-677728607);
                        i2 = 428619224;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1331385224:
                case -131880932:
                    if (z) {
                        iM6981 = C0630.m2566("ܳۗ") ^ i3;
                        i = ((iM6981 ^ i4) * 7049) ^ 1475314868;
                        i2 = 1762515759;
                    } else {
                        iM6981 = (C2105.m6981("ۚۧ") ^ i4) * 9;
                        i = ((iM6981 ^ i3) * (-32735)) ^ (-1234984525);
                        i2 = 900281522;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1277719068:
                case 467806014:
                    i13 = i10;
                    i14 = 0;
                    iM6981 = C0630.m2566("ۢܰ") ^ i4;
                    i = ((iM6981 ^ i3) * (-11011)) ^ 571798408;
                    i2 = 1327973563;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -868916833:
                case 350764550:
                    i11 = i10 + 1;
                    iM6981 = C2105.m6981("֨ۙ") ^ i4;
                    i = ((iM6981 ^ i3) * 29419) ^ 447791013;
                    i2 = -1068238147;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -825604268:
                case -633054748:
                    if (C0798.m3000(str, i9) == c) {
                        iM6981 = C2105.m6981("ۤۙ") ^ i3;
                        i = ((iM6981 ^ i4) * (-16567)) ^ 1913307059;
                        i2 = -1231281611;
                    } else {
                        iM6981 = C0630.m2566("ܺ۟") ^ i3;
                        i = ((iM6981 ^ i4) * 22617) ^ 1361078401;
                        i2 = -1653994761;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -767270875:
                case 136239772:
                    if (i10 >= i17) {
                        iM6981 = (C0630.m2566("ۡܺ") ^ i4) * (-31);
                        i = ((iM6981 ^ i3) * (-20837)) ^ (-799187796);
                        i2 = 1538430367;
                    } else {
                        i11 = i17;
                        iM6981 = C2105.m6981("֨ۙ") ^ i4;
                        i = ((iM6981 ^ i3) * 29419) ^ 447791013;
                        i2 = -1068238147;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -754726447:
                case -479840450:
                    if (AbstractC2021.m6574()) {
                        iM6981 = (i3 - C0630.m2566("ܳܿ")) * 31;
                        i = ((iM6981 ^ i4) * 17291) ^ 1393947487;
                        i2 = -1346632936;
                    } else {
                        iM6981 = (i4 - C0630.m2566("֫ۡ")) * (-111);
                        i = ((iM6981 ^ i3) * 6991) ^ 147498655;
                        i2 = 213058888;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -426649173:
                case 1202740445:
                    c = '-';
                    iM6981 = C0630.m2566("᩹֫") ^ i4;
                    i = ((iM6981 ^ i3) * (-23835)) ^ 1528430465;
                    i2 = 1253543596;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -420965812:
                case -237548924:
                    i7++;
                    i17 = i11;
                    iM6981 = (C0630.m2566("ۗ᩸") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM6981 ^ i3) * 6289) ^ (-1234066472);
                    i2 = 1098384696;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -374322142:
                case 1846655567:
                    i9 = i8;
                    i10 = 0;
                    i12 = 0;
                    iM6981 = (i4 - C2105.m6981("᩸֡")) * (-69);
                    i = ((iM6981 ^ i3) * 12339) ^ (-1888868616);
                    i2 = -538648712;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -184997797:
                case 1274216485:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("᩹ۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 3785) ^ (-677728607);
                        i2 = 428619224;
                    } else {
                        iM6981 = (C0630.m2566("ۘ۟") + i4) * (-23);
                        i = ((iM6981 ^ i3) * 5051) ^ 1382005032;
                        i2 = 315038452;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -101809780:
                case 1340046389:
                    if (i9 < C1711.m5741(str)) {
                        iM6981 = (C0630.m2566("ܺ᩷") + i3) * (-11);
                        i = ((iM6981 ^ i4) * (-11471)) ^ 2004308783;
                        i2 = 664166123;
                    } else {
                        iM6981 = (i3 - C0630.m2566("֨۠")) * (-125);
                        i = ((iM6981 ^ i4) * 29047) ^ 1003536015;
                        i2 = 637468326;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -95845223:
                case 946507906:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("᩷۟") ^ i4;
                        i = ((iM6981 ^ i3) * (-18861)) ^ 298112397;
                        i2 = 1559078901;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܺ᩸")) * 37;
                        i = ((iM6981 ^ i3) * 19685) ^ 780860682;
                        i2 = 440858875;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 7550260:
                case 1766025941:
                    C1047.m3599();
                    C2958.m9034();
                    iM6981 = (i3 - C0630.m2566("ܳܿ")) * 31;
                    i = ((iM6981 ^ i4) * 17291) ^ 1393947487;
                    i2 = -1346632936;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 44393743:
                case 1370278754:
                    str = strArr[i7];
                    i8 = 0;
                    if (C1047.m3599() >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۛܶ")) * 63;
                        i = ((iM6981 ^ i3) * (-4645)) ^ (-1900322114);
                        i2 = -515451666;
                    } else {
                        iM6981 = (C2105.m6981("۟᩺") ^ i3) * (-93);
                        i = ((iM6981 ^ i4) * 18879) ^ (-1365317036);
                        i2 = 1798474888;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 316870603:
                case 1812949566:
                    length = strArr.length;
                    i16 = 8;
                    if (C1504.f5354) {
                        iM6981 = C0630.m2566("᩷۟") ^ i4;
                        i = ((iM6981 ^ i3) * (-18861)) ^ 298112397;
                        i2 = 1559078901;
                    } else {
                        iM6981 = C2105.m6981("ܿܺ") ^ i3;
                        i = ((iM6981 ^ i4) * (-23787)) ^ (-448980465);
                        i2 = 1699644936;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 926052263:
                case 2034199281:
                    C5695.m16023();
                    if (C3746.f11829 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܳܿ")) * 31;
                        i = ((iM6981 ^ i4) * 17291) ^ 1393947487;
                        i2 = -1346632936;
                    } else {
                        iM6981 = C0630.m2566("᩷۟") ^ i4;
                        i = ((iM6981 ^ i3) * (-18861)) ^ 298112397;
                        i2 = 1559078901;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1125158578:
                case 1655678543:
                    C3911.m11924();
                    if (C1128.m3851() > 0) {
                        iM6981 = (i3 - C0630.m2566("ܳܿ")) * 31;
                        i = ((iM6981 ^ i4) * 17291) ^ 1393947487;
                        i2 = -1346632936;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۛܶ")) * 63;
                        i = ((iM6981 ^ i3) * (-4645)) ^ (-1900322114);
                        i2 = -515451666;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1353675927:
                case 1765410119:
                    c = a.h;
                    iM6981 = C0630.m2566("᩹֫") ^ i4;
                    i = ((iM6981 ^ i3) * (-23835)) ^ 1528430465;
                    i2 = 1253543596;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1511594655:
                case 1803423443:
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C2105.m6981("ۚۘ") ^ i4) * (-61);
                        i = ((iM6981 ^ i3) * 9617) ^ (-827143952);
                        i2 = -1446591636;
                    } else {
                        iM6981 = (C0630.m2566("۬֨") ^ i3) * 13;
                        i = ((iM6981 ^ i4) * 28039) ^ (-2038139039);
                        i2 = -1935578477;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1793859370:
                case 2052407933:
                    C3663.m11168();
                    if (C3911.f12484 < 0) {
                        iM6981 = (i3 - C0630.m2566("ܳܿ")) * 31;
                        i = ((iM6981 ^ i4) * 17291) ^ 1393947487;
                        i2 = -1346632936;
                    } else {
                        iM6981 = C0630.m2566("ܺۨ") ^ i3;
                        i = ((iM6981 ^ i4) * (-24801)) ^ (-1325063723);
                        i2 = 1840056746;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    return new String(cArr);
            }
        }
    }
}
