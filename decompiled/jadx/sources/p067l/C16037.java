package p067l;

import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܳ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7HQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C16037 {

    /* JADX INFO: renamed from: ۗۤ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f82218 = {5155, 12562, 12668, 12669, 12660, 12657, 12661, 12657, 12652, 12669, 12650, 12631, 12650, 12657, 12671, 12657, 12662, 12665, 12660, 12592, 12593, 12578, 12562, 12620, 12650, 12665, 12662, 12651, 12660, 12665, 12652, 12669, 12668, 12592, 12620, 12650, 12665, 12662, 12651, 12660, 12665, 12652, 12657, 12663, 12662, 12600, 12670, 12665, 12657, 12660, 12669, 12668, 12578, 12600, 12598, 12598, 12598};

    /* JADX INFO: renamed from: ֫ */
    public C18720 f46424;

    /* JADX INFO: renamed from: ۧ */
    public final TranslationEngine f46425;

    public C16037(TranslationEngine translationEngine) {
        TranslationEngine.Configuration configuration = null;
        int i = -1420020520;
        int i2 = C0863.f81833;
        int i3 = C0873.f81841;
        int iM55680 = C0873.m55680("ᩳܽ") ^ i3;
        int i4 = ((iM55680 ^ i2) * 1353) ^ (-1149831526);
        int i5 = -650242924;
        while (true) {
            i = ((((i ^ i2) * 8865) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2087862024:
                case -1631356553:
                    this.f46425 = translationEngine;
                    configuration = translationEngine.getConfiguration();
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = (C0946.m55979("ۢܽ") + i3) * 23;
                        i4 = ((iM55680 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        iM55680 = (C0873.m55680("ܰۢ") ^ i2) * (-21);
                        i4 = ((iM55680 ^ i3) * 2501) ^ (-1550531222);
                        i5 = 919219343;
                    }
                    break;
                case -1999200371:
                case -1356911697:
                    if (C0937.f81884) {
                        iM55680 = (C0873.m55680("֨ܿ") + i2) * (-109);
                        i4 = ((iM55680 ^ i3) * 30863) ^ (-957019217);
                        i5 = -1676365776;
                    } else {
                        iM55680 = (C0946.m55979("ۜᩳ") ^ i3) * (-113);
                        i4 = ((iM55680 ^ i2) * 30225) ^ (-664108010);
                        i5 = 1029571029;
                    }
                    break;
                case -1872629430:
                case 2080434629:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0946.m55979("ۢܽ") + i3) * 23;
                        i4 = ((iM55680 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩺ܰ")) * (-103);
                        i4 = ((iM55680 ^ i3) * (-10981)) ^ 500736597;
                        i5 = 1920185630;
                    }
                    break;
                case -1795082745:
                case -1033797666:
                    if (C1048.m56305() >= 0) {
                        iM55680 = C0873.m55680("ۡۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1451)) ^ (-1316263353);
                        i5 = -444987562;
                    } else {
                        iM55680 = C0873.m55680("ܶ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26767)) ^ 1619368134;
                        i5 = -1693210553;
                    }
                    break;
                case -1629209469:
                case 1663665764:
                    if (C1046.m56302() == 0) {
                        int i6 = configuration.maxTranslationTextLength;
                        if (RunnableC0938.f81886 < 0) {
                            this.f46424 = new C18720(this, i6, configuration.textLengthCalculator);
                            return;
                        }
                    }
                    iM55680 = C0873.m55680("ۡۨ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-1451)) ^ (-1316263353);
                    i5 = -444987562;
                    break;
                case -1077267401:
                case -302296688:
                    C0845.m55584();
                    if (C1053.m56327() < 0) {
                        iM55680 = (C0946.m55979("ۜᩳ") ^ i3) * (-113);
                        i4 = ((iM55680 ^ i2) * 30225) ^ (-664108010);
                        i5 = 1029571029;
                    } else {
                        iM55680 = (C0946.m55979("ۢܽ") + i3) * 23;
                        i4 = ((iM55680 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    }
                    break;
                case -1046240920:
                case 2046351840:
                    if (RunnableC0897.f81856) {
                        iM55680 = C0946.m55979("᩵ۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-19975)) ^ (-585435769);
                        i5 = -892197629;
                    } else {
                        iM55680 = C0946.m55979("۬֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21421) ^ 853028996;
                        i5 = 1697853529;
                    }
                    break;
                case -988684822:
                case -785482014:
                    if (C1229.f82066 < 0) {
                        iM55680 = C0946.m55979("۬֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21421) ^ 853028996;
                        i5 = 1697853529;
                    } else {
                        iM55680 = (C0946.m55979("ۢܽ") + i3) * 23;
                        i4 = ((iM55680 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    }
                    break;
                case -39810569:
                case 1313196162:
                    C0930.m55885();
                    iM55680 = (C0873.m55680("ᩴۤ") ^ i2) * (-105);
                    i4 = ((iM55680 ^ i3) * 16509) ^ (-48076900);
                    i5 = -1665410258;
                    break;
                case -7206280:
                case 1415516933:
                    if (C1046.f81962 <= 0) {
                        iM55680 = (C0946.m55979("ۜᩳ") ^ i3) * (-113);
                        i4 = ((iM55680 ^ i2) * 30225) ^ (-664108010);
                        i5 = 1029571029;
                    } else {
                        iM55680 = (C0946.m55979("۬ۚ") ^ i3) * 11;
                        i4 = ((iM55680 ^ i2) * (-8755)) ^ 1102292230;
                        i5 = -1717136443;
                    }
                    break;
                case 807335624:
                case 1411262217:
                    RunnableC0897.m55784();
                    C1964.m56597();
                    throw new RuntimeException();
                case 843217919:
                case 2111352676:
                    AbstractC0942.m55971();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = (C0946.m55979("ۢܽ") + i3) * 23;
                        i4 = ((iM55680 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        iM55680 = (C0873.m55680("ᩴۤ") ^ i2) * (-105);
                        i4 = ((iM55680 ^ i3) * 16509) ^ (-48076900);
                        i5 = -1665410258;
                    }
                    break;
                case 1559710814:
                case 2083828861:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0946.m55979("ۢܽ") + i3) * 23;
                        i4 = ((iM55680 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        iM55680 = C0873.m55680("ܰܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 13745) ^ (-186436353);
                        i5 = 1577928970;
                    }
                    break;
                default:
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0946.m55979("ۢܽ") + i3) * 23;
                        i4 = ((iM55680 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ܿܺ")) * 39;
                        i4 = ((iM55680 ^ i3) * 2871) ^ (-1259251725);
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
    /* JADX INFO: renamed from: ֫ */
    public final String[] m36487(String[] strArr, String str, String str2) {
        String str3;
        StringBuilder sb;
        int iM55680;
        int i;
        int i2;
        int i3;
        int iM55979;
        int i4;
        int i5;
        StringBuilder sb2;
        int iM559710;
        int i6;
        int i7;
        String str4;
        int iM559711;
        int i8;
        int i9;
        StringBuilder sb3;
        boolean z;
        int iM55681;
        int i10;
        int i11;
        int iM559712;
        int i12;
        int i13;
        int i14 = ViewOnClickListenerC0939.f81888;
        int i15 = C1025.f81947;
        int iM55682 = C0873.m55680("᩺᩹") ^ i15;
        int i16 = ((iM55682 ^ i14) * 26071) ^ 1093874113;
        StringBuilder sb4 = null;
        TranslationEngine translationEngine = null;
        String[] strArrSplit = null;
        PluginContext context = null;
        String strM56132 = null;
        StringBuilder sb5 = null;
        short[] sArr = null;
        int i17 = iM55682 ^ 290245880;
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        int i20 = 0;
        int i21 = 0;
        short s2 = 0;
        int i22 = 612616836;
        StringBuilder sb6 = null;
        boolean z2 = false;
        String strM36485 = null;
        String strM16053 = null;
        String strM55639 = null;
        String str5 = null;
        String strM55591 = null;
        int i23 = 0;
        String str6 = null;
        short[] sArr2 = null;
        boolean z3 = false;
        while (true) {
            i22 = i17 ^ (i16 & (((i22 ^ i14) * 32207) >> 31));
            switch (i22) {
                case -2135303815:
                case 2036467907:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    z = z2;
                    str5 = str5;
                    strArrSplit = str6.split(str5, -1);
                    sb3 = sb6;
                    if (strArrSplit.length == strArr.length) {
                        iM55681 = (i14 - C0946.m55979("۬֫")) * (-47);
                        i10 = ((iM55681 ^ i15) * (-17529)) ^ 890339993;
                        i11 = -430881525;
                    } else {
                        iM55681 = (C0873.m55680("ܽᩳ") + i15) * 5;
                        i10 = ((iM55681 ^ i14) * 29755) ^ 1647709011;
                        i11 = -1790403187;
                    }
                    int i24 = iM55681 ^ i11;
                    z2 = z;
                    sb6 = sb3;
                    strM55591 = strM55591;
                    i17 = i24;
                    i16 = i10;
                    str5 = str5;
                    sArr2 = sArr2;
                    break;
                case -1973653698:
                case -1808218152:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    sb2 = sb6;
                    if (C0882.m55719(str6) <= 100) {
                        strM55591 = str6;
                        int iM55683 = (C0873.m55680("᩺ܶ") + i15) * 71;
                        i17 = iM55683 ^ 12519117;
                        sb6 = sb2;
                        i16 = ((iM55683 ^ i14) * 6957) ^ 318610051;
                        sArr2 = sArr2;
                    } else {
                        iM559710 = (C0946.m55979("᩻۬") ^ i14) * (-73);
                        i6 = ((iM559710 ^ i15) * (-18491)) ^ 1748117964;
                        i7 = 1192910925;
                        int i25 = iM559710 ^ i7;
                        sb6 = sb2;
                        i16 = i6;
                        sArr2 = sArr2;
                        str4 = strM55591;
                        i17 = i25;
                        strM55591 = str4;
                    }
                    break;
                case -1966393632:
                case -66395201:
                    C0949.m56012();
                    if (!RunnableC0897.f81856) {
                        iM559712 = (i15 - C0946.m55979("ۘܽ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i12 = ((iM559712 ^ i14) * (-14835)) ^ (-1005930684);
                        i13 = 346490297;
                        i17 = iM559712 ^ i13;
                        i16 = i12;
                    } else {
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        strM36485 = strM36485;
                        str5 = str5;
                        z2 = z2;
                        i23 = i23;
                        int iM55684 = (i14 - C0873.m55680("֫ܿ")) * 25;
                        z2 = z2;
                        str5 = str5;
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        i17 = iM55684 ^ (-752684022);
                        i16 = ((iM55684 ^ i15) * (-10165)) ^ (-24145295);
                        i23 = i23;
                        strM36485 = strM36485;
                    }
                    break;
                case -1922007279:
                case 1975571481:
                    C1003.m56121(sb5, C0882.m55717(sArr2, 54, 3, i19));
                    strM55591 = C0845.m55591(sb5);
                    sArr2 = sArr2;
                    sb2 = sb6;
                    int iM55685 = (C0873.m55680("᩺ܶ") + i15) * 71;
                    i17 = iM55685 ^ 12519117;
                    sb6 = sb2;
                    i16 = ((iM55685 ^ i14) * 6957) ^ 318610051;
                    sArr2 = sArr2;
                    break;
                case -1909081316:
                case 872123146:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    str5 = str5;
                    sb6 = sb6;
                    z2 = z2;
                    i23 = i23;
                    int i26 = s + s2;
                    if ((i26 * i26) - i21 <= 0) {
                        iM559711 = (C0873.m55680("ܿ֡") + i14) * (-119);
                        i8 = ((iM559711 ^ i15) * (-22273)) ^ (-1222316168);
                        i9 = 98015208;
                    } else {
                        iM559711 = C0946.m55979("ۘ᩸") ^ i15;
                        i8 = ((iM559711 ^ i14) * 13677) ^ 1440815585;
                        i9 = 773305853;
                    }
                    int i27 = iM559711 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM55591 = strM55591;
                    i17 = i27;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    break;
                case -1695375125:
                case 1650767066:
                    if (RunnableC0871.f81839 >= 0) {
                        iM559712 = (C0946.m55979("ܶۡ") ^ i15) * (-127);
                        i12 = ((iM559712 ^ i14) * 11879) ^ (-2105638015);
                        i13 = 1284251695;
                        i17 = iM559712 ^ i13;
                        i16 = i12;
                    } else {
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        int iM55686 = C0873.m55680("֫ܰ") ^ i14;
                        i = ((iM55686 ^ i15) * 32137) ^ 1452213994;
                        i3 = iM55686 ^ (-1159725487);
                        sArr2 = sArr2;
                        str4 = strM55591;
                        i17 = i3;
                        i16 = i;
                        strM55591 = str4;
                    }
                    break;
                case -1567827589:
                case 1592095362:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    strM56132 = C1003.m56132(f82218, 20, 3, i19);
                    sb2 = sb6;
                    C0912.m55825(sb2, strM56132);
                    C0912.m55825(sb2, strM55639);
                    if (C0877.f81843 < 0) {
                        iM559710 = (i15 - C0946.m55979("᩷ۜ")) * (-27);
                        i6 = ((iM559710 ^ i14) * 6463) ^ (-331587974);
                        i7 = -358410502;
                        int i28 = iM559710 ^ i7;
                        sb6 = sb2;
                        i16 = i6;
                        sArr2 = sArr2;
                        str4 = strM55591;
                        i17 = i28;
                        strM55591 = str4;
                    } else {
                        str5 = str5;
                        z2 = z2;
                        sb6 = sb2;
                        i23 = i23;
                        iM559711 = C0873.m55680("۬ܶ") ^ i15;
                        i8 = ((iM559711 ^ i14) * 10787) ^ 480570170;
                        i9 = -669470149;
                        int i29 = iM559711 ^ i9;
                        z2 = z2;
                        sb6 = sb6;
                        strM55591 = strM55591;
                        i17 = i29;
                        i16 = i8;
                        str5 = str5;
                        i23 = i23;
                        sArr2 = sArr2;
                        strM36485 = strM36485;
                    }
                    break;
                case -1444956818:
                case -643044757:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    str5 = str5;
                    sb6 = sb6;
                    z2 = z2;
                    i23 = i23;
                    s = sArr[0];
                    i20 = s * s;
                    if (C0890.f81849 != 0) {
                        iM559711 = C0873.m55680("۬ܶ") ^ i15;
                        i8 = ((iM559711 ^ i14) * 10787) ^ 480570170;
                        i9 = -669470149;
                    } else {
                        iM559711 = C0873.m55680("ۡ᩶") ^ i15;
                        i8 = ((iM559711 ^ i14) * 25793) ^ 1615148903;
                        i9 = 830822296;
                    }
                    int i210 = iM559711 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM55591 = strM55591;
                    i17 = i210;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    break;
                case -1396389757:
                case -107306086:
                    sb4.append((CharSequence) strArr[i23]);
                    i18 = 1;
                    iM55979 = (C0873.m55680("᩸ܿ") ^ i15) * 127;
                    i4 = ((iM55979 ^ i14) * 5841) ^ 1838380476;
                    i5 = 781491232;
                    int i30 = iM55979 ^ i5;
                    sb6 = sb6;
                    z2 = z2;
                    i16 = i4;
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    i17 = i30;
                    break;
                case -1371784948:
                case 1170687678:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    sb6 = sb6;
                    z2 = z2;
                    strM55639 = C0863.m55639(sb4);
                    TranslationEngine translationEngine2 = this.f46425;
                    String strTranslate = translationEngine2.translate(strM55639, str, str2);
                    String strQuote = Pattern.quote(strM16053);
                    if (C0917.m55854()) {
                        int iM55687 = C0873.m55680("ܺ᩹") ^ i14;
                        i16 = ((iM55687 ^ i15) * (-8601)) ^ 1020494041;
                        int i31 = iM55687 ^ 759256715;
                        str6 = strTranslate;
                        sArr2 = sArr2;
                        translationEngine = translationEngine2;
                        z2 = z2;
                        strM55591 = strM55591;
                        i17 = i31;
                        sb6 = sb6;
                        str5 = strQuote;
                    } else {
                        str6 = strTranslate;
                        str5 = strQuote;
                        translationEngine = translationEngine2;
                        i23 = i23;
                        iM559711 = C0873.m55680("۬ܶ") ^ i15;
                        i8 = ((iM559711 ^ i14) * 10787) ^ 480570170;
                        i9 = -669470149;
                        int i211 = iM559711 ^ i9;
                        z2 = z2;
                        sb6 = sb6;
                        strM55591 = strM55591;
                        i17 = i211;
                        i16 = i8;
                        str5 = str5;
                        i23 = i23;
                        sArr2 = sArr2;
                        strM36485 = strM36485;
                    }
                    break;
                case -1170443643:
                case -422300119:
                    i19 = 12568;
                    iM559711 = C0946.m55979("᩶᩸") ^ i14;
                    i8 = ((iM559711 ^ i15) * (-25093)) ^ (-382495871);
                    i9 = 351367285;
                    int i212 = iM559711 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM55591 = strM55591;
                    i17 = i212;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    break;
                case -1160881532:
                case -457938031:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    str3 = str5;
                    sb = sb6;
                    sb4 = new StringBuilder();
                    z2 = true;
                    if (strArr.length > 0) {
                        iM55680 = (C0873.m55680("ܿ᩷") ^ i15) * 119;
                        i = ((iM55680 ^ i14) * (-11495)) ^ (-1529630547);
                        i2 = 1397146745;
                    } else {
                        iM55680 = (C0946.m55979("᩹ۙ") ^ i14) * (-9);
                        i = ((iM55680 ^ i15) * 30927) ^ 2040671990;
                        i2 = -1528407139;
                    }
                    i3 = iM55680 ^ i2;
                    sb6 = sb;
                    str5 = str3;
                    sArr2 = sArr2;
                    str4 = strM55591;
                    i17 = i3;
                    i16 = i;
                    strM55591 = str4;
                    break;
                case -989693504:
                case -950470904:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    str5 = str5;
                    sb6 = sb6;
                    z2 = z2;
                    i23 = i23;
                    int i32 = i20 + 1527696;
                    i21 = i32 + i32;
                    s2 = 1236;
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM559711 = C0946.m55979("ۜۡ") ^ i15;
                        i8 = ((iM559711 ^ i14) * (-1091)) ^ (-601456331);
                        i9 = -948137630;
                        int i213 = iM559711 ^ i9;
                        z2 = z2;
                        sb6 = sb6;
                        strM55591 = strM55591;
                        i17 = i213;
                        i16 = i8;
                        str5 = str5;
                        i23 = i23;
                        sArr2 = sArr2;
                        strM36485 = strM36485;
                    } else {
                        sb6 = sb6;
                        int iM55688 = (i14 - C0873.m55680("֫ܿ")) * 25;
                        z2 = z2;
                        str5 = str5;
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        i17 = iM55688 ^ (-752684022);
                        i16 = ((iM55688 ^ i15) * (-10165)) ^ (-24145295);
                        i23 = i23;
                        strM36485 = strM36485;
                    }
                    break;
                case -886495778:
                case -285414269:
                    if (C0989.f81920 >= 0) {
                        iM559712 = (C0946.m55979("ܿ۠") + i14) * 17;
                        i12 = ((iM559712 ^ i15) * (-31035)) ^ 754576054;
                        i13 = 1785177223;
                        i17 = iM559712 ^ i13;
                        i16 = i12;
                    } else {
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        strM36485 = strM36485;
                        str5 = str5;
                        z2 = z2;
                        i23 = i23;
                        int iM55689 = (i14 - C0873.m55680("֫ܿ")) * 25;
                        z2 = z2;
                        str5 = str5;
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        i17 = iM55689 ^ (-752684022);
                        i16 = ((iM55689 ^ i15) * (-10165)) ^ (-24145295);
                        i23 = i23;
                        strM36485 = strM36485;
                    }
                    break;
                case -863203562:
                case 748662300:
                    C1024.m56209();
                    if (C1071.m56343() == 0) {
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        int iM559713 = (C0946.m55979("ۗܰ") ^ i14) * (-45);
                        i = ((iM559713 ^ i15) * 23053) ^ (-1059144182);
                        i3 = iM559713 ^ (-1355806111);
                        sArr2 = sArr2;
                        sb6 = null;
                        str4 = strM55591;
                        i17 = i3;
                        i16 = i;
                        strM55591 = str4;
                    }
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    int iM556810 = C0873.m55680("֫ܰ") ^ i14;
                    i = ((iM556810 ^ i15) * 32137) ^ 1452213994;
                    i3 = iM556810 ^ (-1159725487);
                    sArr2 = sArr2;
                    str4 = strM55591;
                    i17 = i3;
                    i16 = i;
                    strM55591 = str4;
                    break;
                case -768381614:
                case -150941863:
                    throw new IOException(C21466.m48631(RunnableC0871.m55667(f82218, 34, 20, i19), strM55591));
                case -684549495:
                case -593044814:
                    context.log(C0845.m55591(sb6));
                    short[] sArr3 = f82218;
                    if (!C0927.f81875) {
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        String strM55822 = C0912.m55822(sArr3, 23, 11, i19);
                        if (C0863.f81833 > 0) {
                            StringBuilder sb7 = new StringBuilder(strM55822);
                            C0863.m55629(sb7, strArrSplit.length);
                            C1003.m56121(sb7, strM56132);
                            C0912.m55825(sb7, str6);
                            context.log(C0863.m55639(sb7));
                            sb6 = sb6;
                            z2 = z2;
                            iM55979 = C0946.m55979("᩹᩺") ^ i15;
                            i4 = ((iM55979 ^ i14) * 29803) ^ (-79947249);
                            i5 = 1622952212;
                            int i33 = iM55979 ^ i5;
                            sb6 = sb6;
                            z2 = z2;
                            i16 = i4;
                            strM55591 = strM55591;
                            sArr2 = sArr2;
                            i17 = i33;
                        } else {
                            int iM556811 = C0873.m55680("֫ܰ") ^ i14;
                            i = ((iM556811 ^ i15) * 32137) ^ 1452213994;
                            i3 = iM556811 ^ (-1159725487);
                            sArr2 = sArr2;
                            str4 = strM55591;
                            i17 = i3;
                            i16 = i;
                            strM55591 = str4;
                        }
                    } else {
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        strM36485 = strM36485;
                        str5 = str5;
                        z2 = z2;
                        i23 = i23;
                        int iM556812 = (i14 - C0873.m55680("֫ܿ")) * 25;
                        z2 = z2;
                        str5 = str5;
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        i17 = iM556812 ^ (-752684022);
                        i16 = ((iM556812 ^ i15) * (-10165)) ^ (-24145295);
                        i23 = i23;
                        strM36485 = strM36485;
                    }
                    break;
                case -683634343:
                case 1204816287:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    sb6 = sb6;
                    z2 = z2;
                    context = translationEngine.getContext();
                    if (context != null) {
                        iM55979 = (C0873.m55680("ۗᩳ") + i14) * 39;
                        i4 = ((iM55979 ^ i15) * 16293) ^ 704117523;
                        i5 = -595525808;
                    } else {
                        iM55979 = C0946.m55979("᩹᩺") ^ i15;
                        i4 = ((iM55979 ^ i14) * 29803) ^ (-79947249);
                        i5 = 1622952212;
                    }
                    int i34 = iM55979 ^ i5;
                    sb6 = sb6;
                    z2 = z2;
                    i16 = i4;
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    i17 = i34;
                    break;
                case -628057424:
                case -107075677:
                    i19 = 64224;
                    iM559711 = C0946.m55979("᩶᩸") ^ i14;
                    i8 = ((iM559711 ^ i15) * (-25093)) ^ (-382495871);
                    i9 = 351367285;
                    int i214 = iM559711 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM55591 = strM55591;
                    i17 = i214;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    break;
                case -523837599:
                case -515648384:
                    z = z2;
                    strM36485 = m36485(z, strArr);
                    z3 = true;
                    sb3 = sb6;
                    iM55681 = C0946.m55979("ۢܶ") ^ i14;
                    i10 = ((iM55681 ^ i15) * (-11813)) ^ (-1139755876);
                    i11 = 1000090268;
                    int i215 = iM55681 ^ i11;
                    z2 = z;
                    sb6 = sb3;
                    strM55591 = strM55591;
                    i17 = i215;
                    i16 = i10;
                    str5 = str5;
                    sArr2 = sArr2;
                    break;
                case -464789631:
                case 144373266:
                    C1003.m56123();
                    return null;
                case -439860694:
                case 1152003256:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    str5 = str5;
                    sb6 = sb6;
                    z2 = z2;
                    i23 = i23;
                    sArr = f82218;
                    if (C1929.m56553()) {
                        iM559711 = C0873.m55680("۬ܶ") ^ i15;
                        i8 = ((iM559711 ^ i14) * 10787) ^ 480570170;
                        i9 = -669470149;
                    } else {
                        iM559711 = (i14 - C0946.m55979("ۙۚ")) * 75;
                        i8 = ((iM559711 ^ i15) * 11773) ^ (-2125248730);
                        i9 = 267344924;
                    }
                    int i216 = iM559711 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM55591 = strM55591;
                    i17 = i216;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    break;
                case -386903175:
                case 1808534643:
                    return strArrSplit;
                case -325283297:
                case -58768215:
                    if (!C0861.m55626()) {
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        int iM556813 = C0873.m55680("֫ܰ") ^ i14;
                        i = ((iM556813 ^ i15) * 32137) ^ 1452213994;
                        i3 = iM556813 ^ (-1159725487);
                        sArr2 = sArr2;
                        str4 = strM55591;
                        i17 = i3;
                        i16 = i;
                        strM55591 = str4;
                    } else {
                        iM559712 = (C0946.m55979("ܿ۠") + i14) * 17;
                        i12 = ((iM559712 ^ i15) * (-31035)) ^ 754576054;
                        i13 = 1785177223;
                        i17 = iM559712 ^ i13;
                        i16 = i12;
                    }
                    break;
                case -265168645:
                case 1668056822:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    sb6 = sb6;
                    z2 = z2;
                    if (i18 >= strArr.length) {
                        z2 = z2;
                        str3 = str5;
                        sb = sb6;
                        iM55680 = (C0946.m55979("᩹ۙ") ^ i14) * (-9);
                        i = ((iM55680 ^ i15) * 30927) ^ 2040671990;
                        i2 = -1528407139;
                        i3 = iM55680 ^ i2;
                        sb6 = sb;
                        str5 = str3;
                        sArr2 = sArr2;
                        str4 = strM55591;
                        i17 = i3;
                        i16 = i;
                        strM55591 = str4;
                    } else {
                        iM55979 = (C0946.m55979("ᩳܽ") ^ i14) * (-55);
                        i4 = ((iM55979 ^ i15) * 18821) ^ (-1734260868);
                        i5 = -497128415;
                        int i35 = iM55979 ^ i5;
                        sb6 = sb6;
                        z2 = z2;
                        i16 = i4;
                        strM55591 = strM55591;
                        sArr2 = sArr2;
                        i17 = i35;
                    }
                    break;
                case -80951375:
                case 1598331846:
                    RunnableC1014.m56177();
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    str5 = str5;
                    z2 = z2;
                    i23 = i23;
                    int iM556814 = (i14 - C0873.m55680("֫ܿ")) * 25;
                    z2 = z2;
                    str5 = str5;
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    i17 = iM556814 ^ (-752684022);
                    i16 = ((iM556814 ^ i15) * (-10165)) ^ (-24145295);
                    i23 = i23;
                    strM36485 = strM36485;
                    break;
                case -45427431:
                case 1874809407:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    str5 = str5;
                    sb6 = sb6;
                    z2 = z2;
                    String strM56276 = C1044.m56276(f82218, 1, 1, i19);
                    strM36485 = strM36485;
                    strM16053 = C6988.m16053(strM56276, strM36485, strM56276);
                    if (strM16053 != null) {
                        iM559711 = (C0873.m55680("ܰ᩶") ^ i15) * (-61);
                        i23 = i23;
                        i8 = ((iM559711 ^ i14) * 25915) ^ (-902950105);
                        i9 = 17376709;
                    } else {
                        i23 = i23;
                        iM559711 = C0946.m55979("ᩳۧ") ^ i15;
                        i8 = ((iM559711 ^ i14) * (-12145)) ^ (-2089595647);
                        i9 = 670794939;
                    }
                    int i217 = iM559711 ^ i9;
                    z2 = z2;
                    sb6 = sb6;
                    strM55591 = strM55591;
                    i17 = i217;
                    i16 = i8;
                    str5 = str5;
                    i23 = i23;
                    sArr2 = sArr2;
                    strM36485 = strM36485;
                    break;
                case 123111432:
                case 1168639783:
                    sb5 = new StringBuilder();
                    C1003.m56121(sb5, C1404.m56454(str6, i23, 99));
                    sArr2 = f82218;
                    if (C0906.f81862 >= 0) {
                        iM559712 = (C0946.m55979("ܶۡ") ^ i15) * (-127);
                        i12 = ((iM559712 ^ i14) * 11879) ^ (-2105638015);
                        i13 = 1284251695;
                    } else {
                        iM559712 = C0873.m55680("ۨ᩺") ^ i15;
                        i12 = ((iM559712 ^ i14) * (-9169)) ^ (-1584798928);
                        i13 = -2125994650;
                    }
                    i17 = iM559712 ^ i13;
                    i16 = i12;
                    break;
                case 219325973:
                case 328851790:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    String strM55947 = ViewOnClickListenerC0939.m55947(f82218, 11, 9, i19);
                    if (!C0927.f81875) {
                        sb2 = new StringBuilder(strM55947);
                        C0845.m55589(sb2, strArr.length);
                        if (C1071.f81975 > 0) {
                            iM559710 = (C0873.m55680("᩹ۤ") ^ i14) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((iM559710 ^ i15) * 7283) ^ (-698873766);
                            i7 = -2132125561;
                            int i218 = iM559710 ^ i7;
                            sb6 = sb2;
                            i16 = i6;
                            sArr2 = sArr2;
                            str4 = strM55591;
                            i17 = i218;
                            strM55591 = str4;
                        } else {
                            sb6 = sb2;
                            strM36485 = strM36485;
                            str5 = str5;
                            z2 = z2;
                            i23 = i23;
                            int iM556815 = (i14 - C0873.m55680("֫ܿ")) * 25;
                            z2 = z2;
                            str5 = str5;
                            strM55591 = strM55591;
                            sArr2 = sArr2;
                            i17 = iM556815 ^ (-752684022);
                            i16 = ((iM556815 ^ i15) * (-10165)) ^ (-24145295);
                            i23 = i23;
                            strM36485 = strM36485;
                        }
                    } else {
                        int iM559714 = (C0946.m55979("ۗܰ") ^ i14) * (-45);
                        i = ((iM559714 ^ i15) * 23053) ^ (-1059144182);
                        i3 = iM559714 ^ (-1355806111);
                        sArr2 = sArr2;
                        sb6 = null;
                        str4 = strM55591;
                        i17 = i3;
                        i16 = i;
                        strM55591 = str4;
                    }
                    break;
                case 245611748:
                case 273525328:
                    sb4.append((CharSequence) strM16053);
                    sb4.append((CharSequence) strArr[i18]);
                    i18++;
                    iM55979 = (C0873.m55680("᩸ܿ") ^ i15) * 127;
                    i4 = ((iM55979 ^ i14) * 5841) ^ 1838380476;
                    i5 = 781491232;
                    int i36 = iM55979 ^ i5;
                    sb6 = sb6;
                    z2 = z2;
                    i16 = i4;
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    i17 = i36;
                    break;
                case 1087478400:
                case 2011099529:
                    sb3 = sb6;
                    z = z2;
                    strM36485 = m36485(false, strArr);
                    i23 = 0;
                    z3 = false;
                    iM55681 = C0946.m55979("ۢܶ") ^ i14;
                    i10 = ((iM55681 ^ i15) * (-11813)) ^ (-1139755876);
                    i11 = 1000090268;
                    int i219 = iM55681 ^ i11;
                    z2 = z;
                    sb6 = sb3;
                    strM55591 = strM55591;
                    i17 = i219;
                    i16 = i10;
                    str5 = str5;
                    sArr2 = sArr2;
                    break;
                case 1407398466:
                case 1527913273:
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    sb6 = sb6;
                    z2 = z2;
                    if (z3) {
                        iM55979 = C0946.m55979("᩷۟") ^ i14;
                        i4 = ((iM55979 ^ i15) * (-27441)) ^ (-604014392);
                        i5 = -2090856922;
                    } else {
                        iM55979 = (i15 - C0946.m55979("ܽ֫")) * 15;
                        i4 = ((iM55979 ^ i14) * (-11687)) ^ 1098876119;
                        i5 = -1289732752;
                    }
                    int i37 = iM55979 ^ i5;
                    sb6 = sb6;
                    z2 = z2;
                    i16 = i4;
                    strM55591 = strM55591;
                    sArr2 = sArr2;
                    i17 = i37;
                    break;
                default:
                    throw new NullPointerException(C1404.m56462(f82218, 2, 9, i19));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18720 m36486() {
        return this.f46424;
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
    /* JADX INFO: renamed from: ֫ */
    public static String m36485(boolean z, String[] strArr) {
        int iM55979;
        int i;
        int i2;
        int i3 = C0930.f81879;
        int i4 = C1071.f81975;
        int iM55680 = C0873.m55680("۬ۖ") ^ i3;
        int i5 = ((iM55680 ^ i4) * (-13973)) ^ (-1290904560);
        String str = null;
        int i6 = iM55680 ^ (-1642524444);
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
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0873.m55680("᩷۟") ^ i4;
                        i = ((iM55979 ^ i3) * (-18861)) ^ 298112397;
                        i2 = 1559078901;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۧ᩸")) * 19;
                        i = ((iM55979 ^ i4) * 8329) ^ 924897757;
                        i2 = -474033750;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1974343401:
                case -900668122:
                    if (i7 < length) {
                        iM55979 = C0946.m55979("᩶ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * 9891) ^ (-1104205303);
                        i2 = 1997811416;
                    } else {
                        iM55979 = C0946.m55979("ܰ۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-1369)) ^ (-1393711785);
                        i2 = -1286273211;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1929281821:
                case 124712622:
                    C1071.m56343();
                    C1404.m56468();
                    return null;
                case -1807565451:
                case -692036033:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("᩷۟") ^ i4;
                        i = ((iM55979 ^ i3) * (-18861)) ^ 298112397;
                        i2 = 1559078901;
                    } else {
                        iM55979 = C0946.m55979("ۤ۫") ^ i3;
                        i = ((iM55979 ^ i4) * (-9303)) ^ (-1982110369);
                        i2 = 1558207532;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1748216341:
                case 907830256:
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0873.m55680("ܺۨ") ^ i3;
                        i = ((iM55979 ^ i4) * (-24801)) ^ (-1325063723);
                        i2 = 1840056746;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܽᩳ")) * 97;
                        i = ((iM55979 ^ i4) * 10487) ^ (-1220626580);
                        i2 = -568517133;
                    }
                    i6 = iM55979 ^ i2;
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
                    iM55979 = C0873.m55680("ۢܰ") ^ i4;
                    i = ((iM55979 ^ i3) * (-11011)) ^ 571798408;
                    i2 = 1327973563;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1645706468:
                case 654353796:
                    cArr = new char[i17];
                    Arrays.fill(cArr, c);
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0946.m55979("ۚۘ") ^ i4) * (-61);
                        i = ((iM55979 ^ i3) * 9617) ^ (-827143952);
                        i2 = -1446591636;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۘ֫")) * 91;
                        i = ((iM55979 ^ i3) * (-8809)) ^ 1734826292;
                        i2 = 1160586118;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1633396315:
                case 1771849461:
                    i9++;
                    i10 = i13;
                    i12 = i14;
                    iM55979 = (i4 - C0946.m55979("᩸֡")) * (-69);
                    i = ((iM55979 ^ i3) * 12339) ^ (-1888868616);
                    i2 = -538648712;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1538670885:
                case 1918755165:
                    i17 = i16;
                    i7 = 0;
                    iM55979 = (C0873.m55680("ۗ᩸") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM55979 ^ i3) * 6289) ^ (-1234066472);
                    i2 = 1098384696;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1380665430:
                case 1823035670:
                    if (C1071.f81975 > 0) {
                        iM55979 = C0873.m55680("ܺۨ") ^ i3;
                        i = ((iM55979 ^ i4) * (-24801)) ^ (-1325063723);
                        i2 = 1840056746;
                    } else {
                        iM55979 = C0873.m55680("᩹ۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 3785) ^ (-677728607);
                        i2 = 428619224;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1331385224:
                case -131880932:
                    if (z) {
                        iM55979 = C0873.m55680("ܳۗ") ^ i3;
                        i = ((iM55979 ^ i4) * 7049) ^ 1475314868;
                        i2 = 1762515759;
                    } else {
                        iM55979 = (C0946.m55979("ۚۧ") ^ i4) * 9;
                        i = ((iM55979 ^ i3) * (-32735)) ^ (-1234984525);
                        i2 = 900281522;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1277719068:
                case 467806014:
                    i13 = i10;
                    i14 = 0;
                    iM55979 = C0873.m55680("ۢܰ") ^ i4;
                    i = ((iM55979 ^ i3) * (-11011)) ^ 571798408;
                    i2 = 1327973563;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -868916833:
                case 350764550:
                    i11 = i10 + 1;
                    iM55979 = C0946.m55979("֨ۙ") ^ i4;
                    i = ((iM55979 ^ i3) * 29419) ^ 447791013;
                    i2 = -1068238147;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -825604268:
                case -633054748:
                    if (C0882.m55712(str, i9) == c) {
                        iM55979 = C0946.m55979("ۤۙ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16567)) ^ 1913307059;
                        i2 = -1231281611;
                    } else {
                        iM55979 = C0873.m55680("ܺ۟") ^ i3;
                        i = ((iM55979 ^ i4) * 22617) ^ 1361078401;
                        i2 = -1653994761;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -767270875:
                case 136239772:
                    if (i10 >= i17) {
                        iM55979 = (C0873.m55680("ۡܺ") ^ i4) * (-31);
                        i = ((iM55979 ^ i3) * (-20837)) ^ (-799187796);
                        i2 = 1538430367;
                    } else {
                        i11 = i17;
                        iM55979 = C0946.m55979("֨ۙ") ^ i4;
                        i = ((iM55979 ^ i3) * 29419) ^ 447791013;
                        i2 = -1068238147;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -754726447:
                case -479840450:
                    if (AbstractC0942.m55971()) {
                        iM55979 = (i3 - C0873.m55680("ܳܿ")) * 31;
                        i = ((iM55979 ^ i4) * 17291) ^ 1393947487;
                        i2 = -1346632936;
                    } else {
                        iM55979 = (i4 - C0873.m55680("֫ۡ")) * (-111);
                        i = ((iM55979 ^ i3) * 6991) ^ 147498655;
                        i2 = 213058888;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -426649173:
                case 1202740445:
                    c = '-';
                    iM55979 = C0873.m55680("᩹֫") ^ i4;
                    i = ((iM55979 ^ i3) * (-23835)) ^ 1528430465;
                    i2 = 1253543596;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -420965812:
                case -237548924:
                    i7++;
                    i17 = i11;
                    iM55979 = (C0873.m55680("ۗ᩸") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM55979 ^ i3) * 6289) ^ (-1234066472);
                    i2 = 1098384696;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -374322142:
                case 1846655567:
                    i9 = i8;
                    i10 = 0;
                    i12 = 0;
                    iM55979 = (i4 - C0946.m55979("᩸֡")) * (-69);
                    i = ((iM55979 ^ i3) * 12339) ^ (-1888868616);
                    i2 = -538648712;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -184997797:
                case 1274216485:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("᩹ۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 3785) ^ (-677728607);
                        i2 = 428619224;
                    } else {
                        iM55979 = (C0873.m55680("ۘ۟") + i4) * (-23);
                        i = ((iM55979 ^ i3) * 5051) ^ 1382005032;
                        i2 = 315038452;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -101809780:
                case 1340046389:
                    if (i9 < C0927.m55878(str)) {
                        iM55979 = (C0873.m55680("ܺ᩷") + i3) * (-11);
                        i = ((iM55979 ^ i4) * (-11471)) ^ 2004308783;
                        i2 = 664166123;
                    } else {
                        iM55979 = (i3 - C0873.m55680("֨۠")) * (-125);
                        i = ((iM55979 ^ i4) * 29047) ^ 1003536015;
                        i2 = 637468326;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -95845223:
                case 946507906:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0873.m55680("᩷۟") ^ i4;
                        i = ((iM55979 ^ i3) * (-18861)) ^ 298112397;
                        i2 = 1559078901;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܺ᩸")) * 37;
                        i = ((iM55979 ^ i3) * 19685) ^ 780860682;
                        i2 = 440858875;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 7550260:
                case 1766025941:
                    C0894.m55769();
                    C0989.m56095();
                    iM55979 = (i3 - C0873.m55680("ܳܿ")) * 31;
                    i = ((iM55979 ^ i4) * 17291) ^ 1393947487;
                    i2 = -1346632936;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 44393743:
                case 1370278754:
                    str = strArr[i7];
                    i8 = 0;
                    if (C0894.m55769() >= 0) {
                        iM55979 = (i4 - C0946.m55979("ۛܶ")) * 63;
                        i = ((iM55979 ^ i3) * (-4645)) ^ (-1900322114);
                        i2 = -515451666;
                    } else {
                        iM55979 = (C0946.m55979("۟᩺") ^ i3) * (-93);
                        i = ((iM55979 ^ i4) * 18879) ^ (-1365317036);
                        i2 = 1798474888;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 316870603:
                case 1812949566:
                    length = strArr.length;
                    i16 = 8;
                    if (C0917.f81868) {
                        iM55979 = C0873.m55680("᩷۟") ^ i4;
                        i = ((iM55979 ^ i3) * (-18861)) ^ 298112397;
                        i2 = 1559078901;
                    } else {
                        iM55979 = C0946.m55979("ܿܺ") ^ i3;
                        i = ((iM55979 ^ i4) * (-23787)) ^ (-448980465);
                        i2 = 1699644936;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 926052263:
                case 2034199281:
                    C1124.m56367();
                    if (C1028.f81950 <= 0) {
                        iM55979 = (i3 - C0873.m55680("ܳܿ")) * 31;
                        i = ((iM55979 ^ i4) * 17291) ^ 1393947487;
                        i2 = -1346632936;
                    } else {
                        iM55979 = C0873.m55680("᩷۟") ^ i4;
                        i = ((iM55979 ^ i3) * (-18861)) ^ 298112397;
                        i2 = 1559078901;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1125158578:
                case 1655678543:
                    C1036.m56257();
                    if (C0898.m55800() > 0) {
                        iM55979 = (i3 - C0873.m55680("ܳܿ")) * 31;
                        i = ((iM55979 ^ i4) * 17291) ^ 1393947487;
                        i2 = -1346632936;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۛܶ")) * 63;
                        i = ((iM55979 ^ i3) * (-4645)) ^ (-1900322114);
                        i2 = -515451666;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1353675927:
                case 1765410119:
                    c = C0184a.f880h;
                    iM55979 = C0873.m55680("᩹֫") ^ i4;
                    i = ((iM55979 ^ i3) * (-23835)) ^ 1528430465;
                    i2 = 1253543596;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1511594655:
                case 1803423443:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0946.m55979("ۚۘ") ^ i4) * (-61);
                        i = ((iM55979 ^ i3) * 9617) ^ (-827143952);
                        i2 = -1446591636;
                    } else {
                        iM55979 = (C0873.m55680("۬֨") ^ i3) * 13;
                        i = ((iM55979 ^ i4) * 28039) ^ (-2038139039);
                        i2 = -1935578477;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1793859370:
                case 2052407933:
                    C1024.m56209();
                    if (C1036.f81953 < 0) {
                        iM55979 = (i3 - C0873.m55680("ܳܿ")) * 31;
                        i = ((iM55979 ^ i4) * 17291) ^ 1393947487;
                        i2 = -1346632936;
                    } else {
                        iM55979 = C0873.m55680("ܺۨ") ^ i3;
                        i = ((iM55979 ^ i4) * (-24801)) ^ (-1325063723);
                        i2 = 1840056746;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    return new String(cArr);
            }
        }
    }
}
