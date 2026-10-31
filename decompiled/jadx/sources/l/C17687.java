package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.net.SocketTimeoutException;
import java.util.LinkedHashMap;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܿ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 32SX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17687 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean f54139 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String f54140;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C17209 f54141;

    /* JADX INFO: renamed from: ᩷ۤۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f54142 = {5186, -8799, -8771, -8771, -8775, -8774, -8717, -8730, -8730, -8773, -8788, -8775, -8732, -8775, -8795, -8772, -8786, -8800, -8793, -8729, -8796, -8771, -8709, -8729, -8790, -8793, 2557, 2998, 2986, 2995, 2977, 2991, 2984, 3051, 2981, 2979, 2984, 2994, 2979, 2996, 3046, 2981, 2985, 2984, 2994, 2979, 2984, 2994, 2990, 2994, 2994, 2998, 2997, 3068, 3049, 3049, 2996, 2979, 2998, 3060, 3051, 2998, 2986, 2995, 2977, 2991, 2984, 3048, 2987, 2994, 3060, 3048, 2981, 2984, 2990, 2994, 2994, 2998, 2997, 3068, 3049, 3049, 2996, 2979, 2998, 3051, 2998, 2986, 2995, 2977, 2991, 2984, 3048, 2987, 2994, 3060, 3048, 2981, 2984, 3049, 2994, 2979, 2997, 2994, 2946, 2983, 2994, 2979, 2974, 3051, 2954, 2951, 2952, 2945, 2974, 3051, 2955, 2962, 3051, 2960, 2947, 2964, 2965, 2959, 2953, 2952, 2966, 2953, 2965, 2962, 2997, 2978, 2976, 2997, 3061, 2996, 2978, 3058, 3061, 2976, 2978, 2997, 2983, 3049, 2983, 2998, 2998, 2986, 2991, 2981, 2983, 2994, 2991, 2985, 2984, 3049, 2985, 2981, 2994, 2979, 2994, 3051, 2997, 2994, 2996, 2979, 2983, 2987, 2963, 2962, 2944, 3051, 3070, 2974, 3051, 2965, 2993, 2991, 2976, 2994, 3051, 2947, 2996, 2996, 2985, 2996, 2979, 2996, 2996, 2985, 2996, 3046, 2964, 2979, 2997, 2998, 2985, 2984, 2997, 2979, 3046, 2981, 2985, 2978, 2979, 3068, 3046, 2995, 2996, 2986, 2981, 2985, 2978, 2979, 2987, 2979, 2997, 2997, 2983, 2977, 2979, 2990, 2979, 2983, 2978, 2979, 2996, 2997, 2996, 2979, 2997, 2998, 2985, 2984, 2997, 2979, 3046, 3842, -12014, -12019, -12015, 2697, -20150, -20155, -20160, -20151, 2088, 2004, 1999, 1995, 1989, 1998};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static long f54143;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f54144;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f54145;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f54146;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17687 m41422(String str) {
        int iM2566;
        int i;
        int iM2567;
        int i2;
        LinkedHashMap linkedHashMap = null;
        int i3 = -1409247493;
        int i4 = C3683.f11629;
        int i5 = C3746.f11829;
        int iM2568 = (C0630.m2566("ۙ֡") + i4) * 41;
        int i6 = ((iM2568 ^ i5) * 12247) ^ 1055921266;
        int i7 = 1618458842;
        while (true) {
            int i8 = iM2568 ^ i7;
            C17687 c17687 = null;
            LinkedHashMap linkedHashMap2 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 10627) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2002072947:
                    case -435674804:
                        c17687.f54144 = linkedHashMap2;
                        c17687.f54146 = str;
                        return c17687;
                    case -1837359913:
                    case 114130436:
                        linkedHashMap = new LinkedHashMap();
                        if (C1047.f3863 < 0) {
                            iM2567 = C2105.m6981("ܿ۫") ^ i5;
                            i6 = ((iM2567 ^ i4) * (-20777)) ^ (-979701036);
                            i2 = 1908393910;
                            i8 = iM2567 ^ i2;
                        } else {
                            iM2566 = C0630.m2566("۟ۜ") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-3481)) ^ 741259740;
                            i = 1684460280;
                            i8 = iM2566 ^ i;
                            c17687 = null;
                        }
                        break;
                    case -1808331118:
                    case 510730461:
                        C1711.m5736();
                        RunnableC1108.m3790();
                        return null;
                    case -1778756177:
                    case 46088640:
                        if (C3911.f12484 < 0) {
                        }
                        iM2566 = C2105.m6981("᩸᩶") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-13087)) ^ (-1926374056);
                        i = 1253762081;
                        i8 = iM2566 ^ i;
                        c17687 = null;
                        break;
                    case -1528991396:
                    case -1103205582:
                        C4159.m12565();
                        if (C2520.f8000 >= 0) {
                        }
                        iM2566 = C0630.m2566("֨ۢ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 20583) ^ 2096026002;
                        i = -1683168498;
                        i8 = iM2566 ^ i;
                        c17687 = null;
                        break;
                    case 392587487:
                    case 2132021975:
                        c17687.f54145 = linkedHashMap;
                        if (C0630.f2410 > 0) {
                            linkedHashMap2 = new LinkedHashMap();
                            if (!C0382.m1848()) {
                                iM2567 = (i5 - C0630.m2566("۟ܺ")) * (-25);
                                i6 = ((iM2567 ^ i4) * 25695) ^ (-410880428);
                                i2 = 2088217067;
                                i8 = iM2567 ^ i2;
                            } else {
                                iM2566 = C0630.m2566("۟ۜ") ^ i5;
                                i6 = ((iM2566 ^ i4) * (-3481)) ^ 741259740;
                                i = 1684460280;
                                i8 = iM2566 ^ i;
                                c17687 = null;
                            }
                        }
                        break;
                    case 1148078165:
                    case 1865127129:
                        C2105.m6982();
                        C3019.m9255();
                        iM2566 = C2105.m6981("᩶ۛ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-31671)) ^ (-802411366);
                        i = 1622406234;
                        i8 = iM2566 ^ i;
                        c17687 = null;
                        break;
                    case 1234652615:
                    case 1412975357:
                        if (C5695.f17556 < 0) {
                            if (C3432.f10845 >= 0) {
                            }
                            if (ViewOnClickListenerC1958.m6429() < 0) {
                                if (C0964.f3626 != 0) {
                                    iM2566 = C0630.m2566("֨ۢ") ^ i4;
                                    i6 = ((iM2566 ^ i5) * 20583) ^ 2096026002;
                                    i = -1683168498;
                                    i8 = iM2566 ^ i;
                                    c17687 = null;
                                } else if (C3911.m11924() > 0) {
                                    if (!C0714.m2805()) {
                                    }
                                    c17687 = new C17687();
                                    if (C21923.f70183 == 0) {
                                        iM2567 = (C0630.m2566("ۨ᩶") ^ i4) * (-45);
                                        i6 = ((iM2567 ^ i5) * (-24441)) ^ (-1443851593);
                                        i2 = -1774170802;
                                        i8 = iM2567 ^ i2;
                                        break;
                                    }
                                } else {
                                    iM2566 = C2105.m6981("᩶ۛ") ^ i4;
                                    i6 = ((iM2566 ^ i5) * (-31671)) ^ (-802411366);
                                    i = 1622406234;
                                    i8 = iM2566 ^ i;
                                    c17687 = null;
                                }
                                break;
                            }
                            iM2566 = C2105.m6981("᩸᩶") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-13087)) ^ (-1926374056);
                            i = 1253762081;
                            i8 = iM2566 ^ i;
                            c17687 = null;
                        } else {
                            iM2566 = C0630.m2566("۟ۜ") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-3481)) ^ 741259740;
                            i = 1684460280;
                            i8 = iM2566 ^ i;
                            c17687 = null;
                        }
                        break;
                    default:
                        if (C7106.f21815 == 0) {
                            iM2566 = C2105.m6981("᩶ۛ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-31671)) ^ (-802411366);
                            i = 1622406234;
                        } else {
                            iM2566 = C0630.m2566("֨ۢ") ^ i4;
                            i6 = ((iM2566 ^ i5) * 20583) ^ 2096026002;
                            i = -1683168498;
                        }
                        i8 = iM2566 ^ i;
                        c17687 = null;
                        break;
                }
            }
            iM2568 = C0630.m2566("۫᩷") ^ i5;
            i6 = ((iM2568 ^ i4) * (-10245)) ^ 976693871;
            i7 = 1780510146;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0292 A[PHI: r10 r16 r17 r18
      0x0292: PHI (r10v8 int) = (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:66:0x0290, B:62:0x026d, B:26:0x009a, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r16v35 int) = (r16v19 int), (r16v20 int), (r16v27 int), (r16v36 int) binds: [B:66:0x0290, B:62:0x026d, B:26:0x009a, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r17v21 int) = (r17v11 int), (r17v12 int), (r17v17 int), (r17v22 int) binds: [B:66:0x0290, B:62:0x026d, B:26:0x009a, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r18v33 short) = (r18v20 short), (r18v21 short), (r18v27 short), (r18v34 short) binds: [B:66:0x0290, B:62:0x026d, B:26:0x009a, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (l.C2272.f7362 == false) goto L14;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m41427(AbstractC15440 abstractC15440) {
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        short s;
        int i5;
        int iM6981;
        int i6;
        int i7;
        int iM6982;
        int i8;
        int i9;
        short[] sArr = null;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short[] sArr2 = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = -2098120898;
        int i17 = C1420.f5096;
        int i18 = C4263.f13799;
        int iM2567 = (i18 - C0630.m2566("᩵᩶")) * 11;
        int i19 = ((iM2567 ^ i17) * 28127) ^ (-296004230);
        int i20 = iM2567 ^ (-1171315721);
        while (true) {
            i16 = ((((i16 ^ i17) * (-6483)) >> 31) & i19) ^ i20;
            switch (i16) {
                case -2113507385:
                case -2046934982:
                    s = s2;
                    i = i10;
                    i2 = i13;
                    if (C7106.m19120() > 0) {
                        iM6982 = C2105.m6981("ۛۧ") ^ i17;
                        i8 = ((iM6982 ^ i18) * 28033) ^ (-1121166435);
                        i9 = -292688669;
                        i20 = iM6982 ^ i9;
                        i19 = i8;
                        i10 = i;
                        i13 = i2;
                        s2 = s;
                    }
                    i10 = i;
                    int iM6983 = (C2105.m6981("ۡ۟") ^ i17) * 31;
                    i20 = iM6983 ^ (-1602797445);
                    i19 = ((iM6983 ^ i18) * 19133) ^ (-38571509);
                    i13 = i2;
                    s2 = s;
                    break;
                case -2034587273:
                case 1728026452:
                    i = i10;
                    i2 = i13;
                    s2 = sArr[c];
                    s3 = 28918;
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("ۜۘ") ^ i17) * (-89);
                        i3 = ((iM2566 ^ i18) * 30643) ^ 1095126548;
                        i4 = -1266859474;
                    } else {
                        iM2566 = (C0630.m2566("ᩳܿ") ^ i18) * (-49);
                        i3 = ((iM2566 ^ i17) * 20303) ^ (-694410249);
                        i4 = -778212670;
                    }
                    i20 = iM2566 ^ i4;
                    i19 = i3;
                    i10 = i;
                    i13 = i2;
                    break;
                case -2008107829:
                case 538755766:
                    i5 = 24188;
                    iM6981 = (C2105.m6981("۫ܿ") ^ i18) * 41;
                    i2 = i5;
                    i6 = ((iM6981 ^ i17) * 2631) ^ 1380762758;
                    i7 = -108036578;
                    i19 = i6;
                    i20 = iM6981 ^ i7;
                    i13 = i2;
                    break;
                case -1921482994:
                case 452419900:
                    s = s2;
                    i = i10;
                    i2 = i13;
                    c = 241;
                    if (C0483.f2088 < 0) {
                        iM6982 = C0630.m2566("ۜܿ") ^ i17;
                        i8 = ((iM6982 ^ i18) * 9231) ^ (-2558286);
                        i9 = 624269091;
                        i20 = iM6982 ^ i9;
                        i19 = i8;
                        i10 = i;
                        i13 = i2;
                        s2 = s;
                    }
                    i10 = i;
                    int iM6984 = (C2105.m6981("ۡ۟") ^ i17) * 31;
                    i20 = iM6984 ^ (-1602797445);
                    i19 = ((iM6984 ^ i18) * 19133) ^ (-38571509);
                    i13 = i2;
                    s2 = s;
                    break;
                case -1795053107:
                case 1351564128:
                    if (C0798.m2998() == 0) {
                        s = s2;
                        i = i10;
                        i2 = i13;
                        iM6982 = (C2105.m6981("ۛۙ") + i18) * 93;
                        i8 = ((iM6982 ^ i17) * (-9319)) ^ (-539598858);
                        i9 = 2033778284;
                        i20 = iM6982 ^ i9;
                        i19 = i8;
                        i10 = i;
                        i13 = i2;
                        s2 = s;
                    }
                    s = s2;
                    i = i10;
                    i2 = i13;
                    iM6982 = C2105.m6981("ۖ۟") ^ i17;
                    i8 = ((iM6982 ^ i18) * (-18967)) ^ (-1238258235);
                    i9 = -2066601900;
                    i20 = iM6982 ^ i9;
                    i19 = i8;
                    i10 = i;
                    i13 = i2;
                    s2 = s;
                    break;
                case -1678919920:
                case -501228668:
                    s = s2;
                    i = i10;
                    i2 = i13;
                    sArr = f54142;
                    if (C1773.f6144 <= 0) {
                        iM6982 = (C2105.m6981("ۛۙ") + i18) * 93;
                        i8 = ((iM6982 ^ i17) * (-9319)) ^ (-539598858);
                        i9 = 2033778284;
                    } else {
                        iM6982 = (C2105.m6981("֡ۗ") ^ i17) * (-31);
                        i8 = ((iM6982 ^ i18) * (-31943)) ^ 3912936;
                        i9 = -796133442;
                    }
                    i20 = iM6982 ^ i9;
                    i19 = i8;
                    i10 = i;
                    i13 = i2;
                    s2 = s;
                    break;
                case -1460072527:
                case -954717943:
                    C1294.m4372();
                    C4616.m13552();
                    break;
                case -1387795429:
                case 571676246:
                    s = s2;
                    i = i10;
                    i2 = i13;
                    if (C3432.f10845 >= 0) {
                        iM6982 = C2105.m6981("ۖ۟") ^ i17;
                        i8 = ((iM6982 ^ i18) * (-18967)) ^ (-1238258235);
                        i9 = -2066601900;
                    } else {
                        iM6982 = C2105.m6981("᩻֨") ^ i18;
                        i8 = ((iM6982 ^ i17) * (-10573)) ^ (-1994915417);
                        i9 = 1366322429;
                    }
                    i20 = iM6982 ^ i9;
                    i19 = i8;
                    i10 = i;
                    i13 = i2;
                    s2 = s;
                    break;
                case -1145584824:
                case -477730560:
                    if (C2520.f8000 >= 0) {
                        s = s2;
                        i = i10;
                        i2 = i13;
                        i15 = 4;
                        iM6982 = C2105.m6981("ۖ۟") ^ i17;
                        i8 = ((iM6982 ^ i18) * (-18967)) ^ (-1238258235);
                        i9 = -2066601900;
                        i20 = iM6982 ^ i9;
                        i19 = i8;
                        i10 = i;
                        i13 = i2;
                        s2 = s;
                    } else {
                        int iM6985 = C2105.m6981("᩹ۛ") ^ i18;
                        i19 = ((iM6985 ^ i17) * (-1433)) ^ (-1626322787);
                        i20 = iM6985 ^ 1242560742;
                        i15 = 4;
                    }
                    break;
                case -827705188:
                case 2076514494:
                    break;
                case -632077533:
                case 1187173250:
                    i2 = i13;
                    if (i10 - (i11 + i12) > 0) {
                        int iM2568 = C0630.m2566("ܰᩴ") ^ i17;
                        i = i10;
                        i19 = ((iM2568 ^ i18) * (-7401)) ^ 390958389;
                        i20 = iM2568 ^ (-880503269);
                    } else {
                        i = i10;
                        iM2566 = C2105.m6981("ۤۢ") ^ i18;
                        i3 = ((iM2566 ^ i17) * 29845) ^ 1118356142;
                        i4 = -674152801;
                        i20 = iM2566 ^ i4;
                        i19 = i3;
                    }
                    i10 = i;
                    i13 = i2;
                    break;
                case -625414794:
                case 757707570:
                    if (!C1916.f6442) {
                        iM6981 = C2105.m6981("ۗ۠") ^ i18;
                        i2 = i13;
                        i6 = ((iM6981 ^ i17) * 16333) ^ 38016819;
                        i7 = -84489379;
                        i19 = i6;
                        i20 = iM6981 ^ i7;
                        i13 = i2;
                    } else {
                        s = s2;
                        i2 = i13;
                        int iM6986 = (C2105.m6981("ۡ۟") ^ i17) * 31;
                        i20 = iM6986 ^ (-1602797445);
                        i19 = ((iM6986 ^ i18) * 19133) ^ (-38571509);
                        i13 = i2;
                        s2 = s;
                    }
                    break;
                case -477246519:
                case 112990093:
                    i5 = 45356;
                    iM6981 = (C2105.m6981("۫ܿ") ^ i18) * 41;
                    i2 = i5;
                    i6 = ((iM6981 ^ i17) * 2631) ^ 1380762758;
                    i7 = -108036578;
                    i19 = i6;
                    i20 = iM6981 ^ i7;
                    i13 = i2;
                    break;
                case -422211908:
                case 1697611608:
                    s = s2;
                    i = i10;
                    i2 = i13;
                    if (C2167.f7158 >= 0) {
                        iM6982 = C2105.m6981("ۖ۟") ^ i17;
                        i8 = ((iM6982 ^ i18) * (-18967)) ^ (-1238258235);
                        i9 = -2066601900;
                    } else {
                        iM6982 = C0630.m2566("᩹۠") ^ i18;
                        i8 = ((iM6982 ^ i17) * 8725) ^ (-839828669);
                        i9 = -1347246657;
                    }
                    i20 = iM6982 ^ i9;
                    i19 = i8;
                    i10 = i;
                    i13 = i2;
                    s2 = s;
                    break;
                case 171250375:
                case 1193068174:
                    i = i10;
                    i2 = i13;
                    i12 = 209062681;
                    if (C1420.f5096 > 0) {
                        iM2566 = C2105.m6981("ᩴ֡") ^ i18;
                        i3 = ((iM2566 ^ i17) * (-11515)) ^ (-1649710348);
                        i4 = -301182042;
                        i20 = iM2566 ^ i4;
                        i19 = i3;
                        i10 = i;
                        i13 = i2;
                    } else {
                        s = s2;
                        iM6982 = (C2105.m6981("ۛۙ") + i18) * 93;
                        i8 = ((iM6982 ^ i17) * (-9319)) ^ (-539598858);
                        i9 = 2033778284;
                        i20 = iM6982 ^ i9;
                        i19 = i8;
                        i10 = i;
                        i13 = i2;
                        s2 = s;
                    }
                    break;
                case 676390910:
                case 1389187537:
                    i2 = i13;
                    i10 = s2 * s3;
                    i11 = s2 * s2;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        s = s2;
                        int iM6987 = (C2105.m6981("ۡ۟") ^ i17) * 31;
                        i20 = iM6987 ^ (-1602797445);
                        i19 = ((iM6987 ^ i18) * 19133) ^ (-38571509);
                    } else {
                        int iM2569 = (i17 - C0630.m2566("ܽᩴ")) * 33;
                        s = s2;
                        i19 = ((iM2569 ^ i18) * 2239) ^ 94845442;
                        i20 = iM2569 ^ (-1221530982);
                    }
                    i13 = i2;
                    s2 = s;
                    break;
                case 1624023710:
                case 2096257730:
                    C0714.m2805();
                    s = s2;
                    i = i10;
                    i2 = i13;
                    iM6982 = C2105.m6981("ۖ۟") ^ i17;
                    i8 = ((iM6982 ^ i18) * (-18967)) ^ (-1238258235);
                    i9 = -2066601900;
                    i20 = iM6982 ^ i9;
                    i19 = i8;
                    i10 = i;
                    i13 = i2;
                    s2 = s;
                    break;
                case 2076975395:
                case 2119232076:
                    this.f54144.put(C2958.m9031(sArr2, i14, i15, i13), abstractC15440);
                    break;
                default:
                    sArr2 = f54142;
                    if (C1005.f3721) {
                        int i21 = i13;
                        int iM25610 = C0630.m2566("ܽ֨") ^ i17;
                        i20 = iM25610 ^ (-1605610337);
                        i19 = ((iM25610 ^ i18) * 29315) ^ 1597488621;
                        i13 = i21;
                        i14 = 242;
                    } else {
                        i14 = 242;
                        iM6981 = C2105.m6981("ۗ۠") ^ i18;
                        i2 = i13;
                        i6 = ((iM6981 ^ i17) * 16333) ^ 38016819;
                        i7 = -84489379;
                        i19 = i6;
                        i20 = iM6981 ^ i7;
                        i13 = i2;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41426(String str, String str2) {
        int i = 414907125;
        int i2 = C1047.f3863;
        int i3 = C4117.f13076;
        int iM6981 = (C2105.m6981("֫֨") ^ i3) * (-33);
        int i4 = ((iM6981 ^ i2) * (-18535)) ^ 698228174;
        int i5 = 923869832;
        while (true) {
            i = ((((i ^ i2) * (-16443)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1991619681:
                case -1707675476:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("֫ܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26605) ^ (-1083691743);
                        i5 = -953621939;
                    } else {
                        iM6981 = C2105.m6981("ᩳܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-15451)) ^ 855156216;
                        i5 = -2088505117;
                    }
                    break;
                case -1828151103:
                case 1630407730:
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22873) ^ 861604498;
                        i5 = 1989959862;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۧۢ")) * 37;
                        i4 = ((iM6981 ^ i3) * 8831) ^ 1134464719;
                        i5 = 2012108419;
                    }
                    break;
                case -1247843820:
                case -706258017:
                    if (C3663.m11168() >= 0) {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22873) ^ 861604498;
                        i5 = 1989959862;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9089) ^ 956771735;
                        i5 = -1946591942;
                    }
                    break;
                case -860822588:
                case 1782747233:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۨ᩻")) * 85;
                        i4 = ((iM6981 ^ i2) * 23421) ^ (-562006207);
                        i5 = -1706623455;
                    } else {
                        iM6981 = (C2105.m6981("۠ۙ") + i3) * (-103);
                        i4 = ((iM6981 ^ i2) * 25189) ^ 962032893;
                        i5 = 478334077;
                    }
                    break;
                case -785075539:
                case 2105158514:
                    C2105.m6982();
                    break;
                case -716615324:
                case -278502406:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22873) ^ 861604498;
                        i5 = 1989959862;
                    } else {
                        iM6981 = (C0630.m2566("ܿ᩹") + i2) * (-119);
                        i4 = ((iM6981 ^ i3) * 29967) ^ 630314419;
                        i5 = 657043955;
                    }
                    break;
                case -584046458:
                case 316800836:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۨ᩻")) * 85;
                        i4 = ((iM6981 ^ i2) * 23421) ^ (-562006207);
                        i5 = -1706623455;
                    } else {
                        iM6981 = C2105.m6981("ۧۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-357)) ^ (-1296967795);
                        i5 = 70423074;
                    }
                    break;
                case -419302834:
                case 539435287:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22873) ^ 861604498;
                        i5 = 1989959862;
                    } else {
                        iM6981 = (C0630.m2566("᩷᩶") ^ i3) * (-111);
                        i4 = ((iM6981 ^ i2) * (-1201)) ^ 104804684;
                        i5 = 1059312586;
                    }
                    break;
                case -140987496:
                case 616994018:
                    if (C1773.f6144 <= 0) {
                        iM6981 = (i3 - C2105.m6981("ۨ᩻")) * 85;
                        i4 = ((iM6981 ^ i2) * 23421) ^ (-562006207);
                        i5 = -1706623455;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6299)) ^ (-15812700);
                        i5 = 1103634190;
                    }
                    break;
                case 97946117:
                case 424290453:
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("۬ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-20911)) ^ 402173684;
                        i5 = -2013399681;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܶܿ")) * (-65);
                        i4 = ((iM6981 ^ i3) * 2231) ^ 422804170;
                        i5 = -1054448897;
                    }
                    break;
                case 134777309:
                case 1212120173:
                    this.f54145.put(str, str2);
                    break;
                case 390565333:
                case 1985926856:
                    C4616.m13552();
                    C0483.m2121();
                    iM6981 = C0630.m2566("۬ۡ") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-20911)) ^ 402173684;
                    i5 = -2013399681;
                    break;
                case 468284136:
                case 1123518815:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۨ᩻")) * 85;
                        i4 = ((iM6981 ^ i2) * 23421) ^ (-562006207);
                        i5 = -1706623455;
                    } else {
                        iM6981 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 13523) ^ (-824139192);
                        i5 = -1588471753;
                    }
                    break;
                case 542557714:
                case 1862335429:
                    if (!C2126.m7040()) {
                        iM6981 = C0630.m2566("۬ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-20911)) ^ 402173684;
                        i5 = -2013399681;
                    } else {
                        iM6981 = C2105.m6981("ۤ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10735)) ^ (-529732290);
                        i5 = -81393508;
                    }
                    break;
                case 1246777793:
                case 1605047599:
                    C5695.m16023();
                    if (C3019.m9255() <= 0) {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22873) ^ 861604498;
                        i5 = 1989959862;
                    } else {
                        iM6981 = C2105.m6981("ۤ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10735)) ^ (-529732290);
                        i5 = -81393508;
                    }
                    break;
                default:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("֫ܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26605) ^ (-1083691743);
                        i5 = -953621939;
                    } else {
                        iM6981 = C0630.m2566("᩺ܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22873) ^ 861604498;
                        i5 = 1989959862;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0123 A[PHI: r16 r17
      0x0123: PHI (r16v21 int) = (r16v18 int), (r16v22 int) binds: [B:36:0x0187, B:26:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r17v4 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String) binds: [B:36:0x0187, B:26:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0275 A[PHI: r5 r7 r8 r16
      0x0275: PHI (r5v22 short) = (r5v6 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:59:0x0273, B:36:0x0187, B:32:0x015c, B:22:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:59:0x0273, B:36:0x0187, B:32:0x015c, B:22:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:59:0x0273, B:36:0x0187, B:32:0x015c, B:22:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r16v24 int) = (r16v4 int), (r16v18 int), (r16v19 int), (r16v26 int) binds: [B:59:0x0273, B:36:0x0187, B:32:0x015c, B:22:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x02bf A[PHI: r2 r16 r18
      0x02bf: PHI (r2v3 l.ۛۚ᩷) = (r2v2 l.ۛۚ᩷), (r2v2 l.ۛۚ᩷), (r2v4 l.ۛۚ᩷) binds: [B:63:0x02bd, B:56:0x0250, B:51:0x0222] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r16v8 int) = (r16v2 int), (r16v6 int), (r16v9 int) binds: [B:63:0x02bd, B:56:0x0250, B:51:0x0222] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r18v6 short) = (r18v0 short), (r18v4 short), (r18v7 short) binds: [B:63:0x02bd, B:56:0x0250, B:51:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int i;
        int iM6981;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = C5695.f17556;
        int i7 = C0714.f2697;
        int iM2566 = (C0630.m2566("ۖ᩸") + i7) * (-39);
        int i8 = ((iM2566 ^ i6) * (-27515)) ^ (-1202758250);
        String strM7036 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM2566 ^ 899926460;
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 987234864;
        C5860 c5860 = null;
        C17915 c17915M21306 = null;
        while (true) {
            i16 = i9 ^ (i8 & (((i16 ^ i6) * 16327) >> 31));
            switch (i16) {
                case -1896402146:
                case 1231344184:
                    s = s;
                    i = i10;
                    c17915M21306.m41903(c5860);
                    if (C0798.m2998() != 0) {
                        i10 = i;
                        iM6981 = C0630.m2566("ۛ᩸") ^ i7;
                        i2 = ((iM6981 ^ i6) * (-10427)) ^ 993442844;
                        i3 = -332820505;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ۡۧ")) * 65;
                        i2 = ((iM6981 ^ i6) * 22387) ^ (-843602242);
                        i10 = i;
                        i3 = -939726685;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case -1764264415:
                case -897275411:
                    i = i10;
                    s = sArr[c];
                    if (C3911.f12484 >= 0) {
                        iM6981 = (C2105.m6981("ۨܿ") + i7) * (-127);
                        s = s;
                        i2 = ((iM6981 ^ i6) * 25993) ^ 28946900;
                        i10 = i;
                        i3 = 1830415724;
                    } else {
                        iM6981 = (C2105.m6981("᩻ܰ") ^ i7) * 7;
                        s = s;
                        i2 = ((iM6981 ^ i6) * 185) ^ 1930835906;
                        i10 = i;
                        i3 = 396997064;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case -1631813089:
                case 1339510218:
                    s = s;
                    i = i10;
                    if (C4263.m12819() >= 0) {
                        iM6981 = (C0630.m2566("᩹֫") + i6) * (-95);
                        i2 = ((iM6981 ^ i7) * (-29111)) ^ (-198409128);
                        i10 = i;
                        i3 = -677537364;
                    } else {
                        i10 = i;
                        iM6981 = C0630.m2566("ۛ᩸") ^ i7;
                        i2 = ((iM6981 ^ i6) * (-10427)) ^ 993442844;
                        i3 = -332820505;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case -1199765641:
                case 189648920:
                    s = s;
                    i = i10;
                    C7106.m19120();
                    iM6981 = C0630.m2566("ۘܿ") ^ i6;
                    i2 = ((iM6981 ^ i7) * 5163) ^ 781229423;
                    i10 = i;
                    i3 = -851052307;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case -908771569:
                case 996745318:
                    s = s;
                    i = i10;
                    c5860 = new C5860();
                    if (C2520.f8000 >= 0) {
                        i10 = i;
                        iM6981 = C0630.m2566("ۛ᩸") ^ i7;
                        i2 = ((iM6981 ^ i6) * (-10427)) ^ 993442844;
                        i3 = -332820505;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩵") ^ i7;
                        i2 = ((iM6981 ^ i6) * 5699) ^ (-1387274054);
                        i10 = i;
                        i3 = -953473445;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case -908279906:
                case 1740620003:
                    s = s;
                    i4 = i10;
                    i15 = 25;
                    if (C2520.m8026()) {
                        iM6981 = C0630.m2566("ܶۛ") ^ i6;
                        i2 = ((iM6981 ^ i7) * (-18227)) ^ 2024855158;
                        i10 = i4;
                        i3 = 1938506797;
                    } else {
                        iM6981 = C0630.m2566("ۢܽ") ^ i6;
                        i2 = ((iM6981 ^ i7) * (-28935)) ^ (-173092262);
                        i10 = i4;
                        i3 = -747842716;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case -700878014:
                case 507721315:
                    i5 = 56777;
                    int iM2567 = (C0630.m2566("ܳۙ") + i7) * (-63);
                    i13 = i5;
                    iM6981 = iM2567;
                    i2 = ((iM2567 ^ i6) * 5913) ^ 716905372;
                    i10 = i10;
                    i3 = -2102772251;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case -473182198:
                case -434023660:
                    f54141 = c17915M21306.m41894();
                    return;
                case -205734928:
                case 421144069:
                    i10 = s * 29224;
                    if (C0798.f2919) {
                        s = s;
                        iM6981 = C0630.m2566("ۛ᩸") ^ i7;
                        i2 = ((iM6981 ^ i6) * (-10427)) ^ 993442844;
                        i3 = -332820505;
                    } else {
                        iM6981 = (C2105.m6981("ᩴ᩶") + i7) * 67;
                        s = s;
                        i2 = ((iM6981 ^ i6) * (-22109)) ^ (-1242123492);
                        i3 = 39297456;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case -127697335:
                case 549831397:
                    i = i10;
                    C1916.m6308();
                    if (C1711.f5919) {
                        iM6981 = (C2105.m6981("ۨܿ") + i7) * (-127);
                        s = s;
                        i2 = ((iM6981 ^ i6) * 25993) ^ 28946900;
                        i10 = i;
                        i3 = 1830415724;
                    } else {
                        s = s;
                        iM6981 = C0630.m2566("ۘܿ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 5163) ^ 781229423;
                        i10 = i;
                        i3 = -851052307;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case 397430447:
                case 1036435501:
                    i = i10;
                    i11 = s * s;
                    i12 = 213510544;
                    if (C21923.f70183 != 0) {
                        iM6981 = (C2105.m6981("ۨܿ") + i7) * (-127);
                        s = s;
                        i2 = ((iM6981 ^ i6) * 25993) ^ 28946900;
                        i10 = i;
                        i3 = 1830415724;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ܶۘ")) * 49;
                        s = s;
                        i2 = ((iM6981 ^ i7) * 14469) ^ 505488069;
                        i10 = i;
                        i3 = 341815235;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case 544343005:
                case 671598653:
                    C21923.m49329();
                    C2167.m7155();
                    throw new RuntimeException();
                case 574263995:
                case 1046163368:
                    i = i10;
                    strM7036 = C2126.m7036(sArr2, i14, i15, i13);
                    if (C3746.f11829 <= 0) {
                        s = s;
                        iM6981 = C0630.m2566("ۘܿ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 5163) ^ 781229423;
                        i10 = i;
                        i3 = -851052307;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ᩴۨ")) * 61;
                        s = s;
                        i2 = ((iM6981 ^ i6) * 29005) ^ 1420457026;
                        i10 = i;
                        i3 = -580277322;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case 751878472:
                case 1650883335:
                    i = i10;
                    C2958.m9034();
                    if (C4075.m12263() <= 0) {
                        iM6981 = (C2105.m6981("ۨܿ") + i7) * (-127);
                        s = s;
                        i2 = ((iM6981 ^ i6) * 25993) ^ 28946900;
                        i10 = i;
                        i3 = 1830415724;
                    } else {
                        s = s;
                        iM6981 = (C0630.m2566("᩹֫") + i6) * (-95);
                        i2 = ((iM6981 ^ i7) * (-29111)) ^ (-198409128);
                        i10 = i;
                        i3 = -677537364;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case 897419123:
                case 1707133659:
                    i4 = i10;
                    f54140 = strM7036;
                    c17915M21306 = C7987.m21306();
                    if (C3245.f10203 <= 0) {
                        s = s;
                        iM6981 = C0630.m2566("ܶۛ") ^ i6;
                        i2 = ((iM6981 ^ i7) * (-18227)) ^ 2024855158;
                        i10 = i4;
                        i3 = 1938506797;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ۜۡ")) * 77;
                        s = s;
                        i2 = ((iM6981 ^ i7) * 29999) ^ (-25941136);
                        i10 = i4;
                        i3 = 1648071500;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case 1280175685:
                case 1420650994:
                    i5 = 37592;
                    int iM2568 = (C0630.m2566("ܳۙ") + i7) * (-63);
                    i13 = i5;
                    iM6981 = iM2568;
                    i2 = ((iM2568 ^ i6) * 5913) ^ 716905372;
                    i10 = i10;
                    i3 = -2102772251;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case 1524898619:
                case 1933490214:
                    if (i10 - (i11 + i12) <= 0) {
                        iM6981 = C0630.m2566("ܽ֨") ^ i7;
                        s = s;
                        i2 = ((iM6981 ^ i6) * 2295) ^ 134533014;
                        i10 = i10;
                        i3 = 1484164948;
                    } else {
                        iM6981 = (i6 - C0630.m2566("۟۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        s = s;
                        i2 = ((iM6981 ^ i7) * 20483) ^ (-2109160931);
                        i10 = i10;
                        i3 = 1391179990;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                case 1954308366:
                case 2028325510:
                    sArr2 = f54142;
                    if (C22628.f73083 <= 0) {
                        s = s;
                        i = i10;
                        i14 = 1;
                        iM6981 = (C0630.m2566("᩹֫") + i6) * (-95);
                        i2 = ((iM6981 ^ i7) * (-29111)) ^ (-198409128);
                        i10 = i;
                        i3 = -677537364;
                    } else {
                        iM6981 = (C2105.m6981("ۜܰ") + i6) * (-83);
                        s = s;
                        i2 = ((iM6981 ^ i7) * (-23693)) ^ (-1372269205);
                        i14 = 1;
                        i3 = -553287279;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
                default:
                    s = s;
                    i = i10;
                    sArr = f54142;
                    c = 0;
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("ۘܿ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 5163) ^ 781229423;
                        i10 = i;
                        i3 = -851052307;
                    } else {
                        iM6981 = C0630.m2566("ۙۨ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 28441) ^ 2094731793;
                        i10 = i;
                        i3 = 666063509;
                    }
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    s = s;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01bf A[PHI: r3 r7 r16
      0x01bf: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:58:0x01bd, B:46:0x0156, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01bf: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:58:0x01bd, B:46:0x0156, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01bf: PHI (r16v19 java.util.LinkedHashMap) = (r16v5 java.util.LinkedHashMap), (r16v8 java.util.LinkedHashMap), (r16v20 java.util.LinkedHashMap) binds: [B:58:0x01bd, B:46:0x0156, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0222 A[PHI: r4 r5 r6 r16
      0x0222: PHI (r4v4 short) = (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:54:0x019c, B:50:0x0179, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:54:0x019c, B:50:0x0179, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:54:0x019c, B:50:0x0179, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r16v25 java.util.LinkedHashMap) = (r16v6 java.util.LinkedHashMap), (r16v7 java.util.LinkedHashMap), (r16v28 java.util.LinkedHashMap) binds: [B:54:0x019c, B:50:0x0179, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (l.C3911.f12484 < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (l.C0630.f2410 > 0) goto L15;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m41425(int i) {
        LinkedHashMap linkedHashMap;
        int iM6981;
        int i2;
        int iM2566;
        int i3;
        int i4;
        LinkedHashMap linkedHashMap2 = null;
        String strM1962 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = -106978546;
        int i10 = C3683.f11629;
        int i11 = ViewOnClickListenerC1958.f6529;
        int iM2567 = C0630.m2566("ۗ۫") ^ i10;
        int i12 = ((iM2567 ^ i11) * (-17425)) ^ (-733478373);
        int i13 = -104463284;
        while (true) {
            int i14 = iM2567 ^ i13;
            while (true) {
                i9 = ((((i9 ^ i11) * (-7939)) >> 31) & i12) ^ i14;
                switch (i9) {
                    case -2135552365:
                    case -1461586830:
                        C0798.m2998();
                        break;
                    case -1978493294:
                    case -1268553421:
                        ServiceConnectionC3453.m10564();
                        if (C0714.f2697 < 0) {
                            iM2566 = (C2105.m6981("֨ܶ") ^ i10) * (-31);
                            linkedHashMap = linkedHashMap2;
                            i3 = ((iM2566 ^ i11) * (-17281)) ^ (-1495406828);
                            i4 = 871100150;
                            i14 = iM2566 ^ i4;
                            i12 = i3;
                            linkedHashMap2 = linkedHashMap;
                        }
                        linkedHashMap = linkedHashMap2;
                        iM6981 = C2105.m6981("ۛᩳ") ^ i10;
                        i12 = ((iM6981 ^ i11) * 1457) ^ 661479294;
                        i2 = 725019726;
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case -1920192737:
                    case 714150788:
                        linkedHashMap = linkedHashMap2;
                        i6 = i5 + 247810564;
                        if (C0630.f2410 <= 0) {
                            iM6981 = (C0630.m2566("۬ۜ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i12 = ((iM6981 ^ i10) * (-31507)) ^ 1996834049;
                            i2 = -1588550049;
                        } else {
                            iM6981 = C2105.m6981("֨ܰ") ^ i10;
                            i12 = ((iM6981 ^ i11) * 23497) ^ 680043197;
                            i2 = -841751549;
                        }
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case -1454104391:
                    case 961844070:
                        linkedHashMap = linkedHashMap2;
                        s2 = 31484;
                        if (C1916.m6308() >= 0) {
                            iM6981 = (C2105.m6981("֨ܺ") ^ i10) * (-39);
                            i12 = ((iM6981 ^ i11) * 22115) ^ 158585649;
                            i2 = 1885959200;
                        } else {
                            iM6981 = C2105.m6981("ᩴ᩺") ^ i10;
                            i12 = ((iM6981 ^ i11) * 32523) ^ 1962956796;
                            i2 = -1269457106;
                        }
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case -1331216217:
                    case -541998245:
                        RunnableC0588.m2441();
                        linkedHashMap = linkedHashMap2;
                        iM6981 = (C2105.m6981("֨ܺ") ^ i10) * (-39);
                        i12 = ((iM6981 ^ i11) * 22115) ^ 158585649;
                        i2 = 1885959200;
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case -1175494538:
                    case -217953581:
                        linkedHashMap2.put(C2520.m8030(sArr2, i8, 3, i7), strM1962);
                        break;
                    case -967070178:
                    case 1886393242:
                        i7 = 17270;
                        iM2566 = C0630.m2566("۠ۗ") ^ i10;
                        linkedHashMap = linkedHashMap2;
                        i3 = ((iM2566 ^ i11) * (-15285)) ^ 1078955531;
                        i4 = -1785965654;
                        i14 = iM2566 ^ i4;
                        i12 = i3;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case -818561145:
                    case 663021574:
                        RunnableC3474.m10630();
                        break;
                    case -701342086:
                    case 1999515230:
                        sArr2 = f54142;
                        if (C0050.m940() > 0) {
                            iM2567 = (C2105.m6981("֡ܰ") ^ i10) * (-119);
                            i12 = ((iM2567 ^ i11) * (-18565)) ^ 2143907292;
                            i13 = 1159781944;
                        }
                        linkedHashMap = linkedHashMap2;
                        iM6981 = C0630.m2566("ۛ۟") ^ i11;
                        i12 = ((iM6981 ^ i10) * 24479) ^ (-1051918109);
                        i2 = -728403520;
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case -648328772:
                    case 401554565:
                        i7 = 53602;
                        iM2566 = C0630.m2566("۠ۗ") ^ i10;
                        linkedHashMap = linkedHashMap2;
                        i3 = ((iM2566 ^ i11) * (-15285)) ^ 1078955531;
                        i4 = -1785965654;
                        i14 = iM2566 ^ i4;
                        i12 = i3;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case -530528435:
                    case 1087443013:
                        linkedHashMap = linkedHashMap2;
                        if (i6 - (s * s2) >= 0) {
                            iM6981 = C2105.m6981("ۚ۠") ^ i11;
                            i12 = ((iM6981 ^ i10) * (-11169)) ^ (-2098487587);
                            i2 = -1921501491;
                        } else {
                            iM6981 = (C2105.m6981("᩺ۖ") + i11) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i12 = ((iM6981 ^ i10) * (-8139)) ^ (-410988178);
                            i2 = 95705333;
                        }
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case 101625925:
                    case 2065815682:
                        linkedHashMap = linkedHashMap2;
                        c = 237;
                        if (C4117.f13076 <= 0) {
                            iM6981 = (C2105.m6981("֨ܺ") ^ i10) * (-39);
                            i12 = ((iM6981 ^ i11) * 22115) ^ 158585649;
                            i2 = 1885959200;
                        } else {
                            iM6981 = C2105.m6981("᩹ۧ") ^ i10;
                            i12 = ((iM6981 ^ i11) * (-32693)) ^ 2034137963;
                            i2 = -869600593;
                        }
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case 222371669:
                    case 1263405244:
                        linkedHashMap = linkedHashMap2;
                        if (C3663.f11553) {
                            iM6981 = C0630.m2566("ۛ۟") ^ i11;
                            i12 = ((iM6981 ^ i10) * 24479) ^ (-1051918109);
                            i2 = -728403520;
                        } else {
                            iM6981 = C2105.m6981("ۙۚ") ^ i11;
                            i12 = ((iM6981 ^ i10) * 21681) ^ 1973734277;
                            i2 = -2045720219;
                        }
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case 271068010:
                    case 1518012465:
                        i8 = 238;
                        if (!RunnableC1108.m3790()) {
                            iM2567 = C2105.m6981("ܺۘ") ^ i11;
                            i12 = ((iM2567 ^ i10) * (-6707)) ^ 50746513;
                            i13 = -305388897;
                        }
                        linkedHashMap = linkedHashMap2;
                        iM6981 = C2105.m6981("ۛᩳ") ^ i10;
                        i12 = ((iM6981 ^ i11) * 1457) ^ 661479294;
                        i2 = 725019726;
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case 469506093:
                    case 1349740021:
                        break;
                    case 542036283:
                    case 950929612:
                        linkedHashMap = linkedHashMap2;
                        s = sArr[c];
                        i5 = s * s;
                        if (C2105.f7037 != 0) {
                            iM6981 = (C0630.m2566("۬ۜ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i12 = ((iM6981 ^ i10) * (-31507)) ^ 1996834049;
                            i2 = -1588550049;
                        } else {
                            iM6981 = C0630.m2566("ܰۜ") ^ i11;
                            i12 = ((iM6981 ^ i10) * (-15843)) ^ (-57096763);
                            i2 = 2125615647;
                        }
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case 1391848596:
                    case 1628129712:
                        linkedHashMap2 = this.f54145;
                        strM1962 = C0422.m1962(i);
                        if (C3019.f9544 >= 0) {
                            iM2566 = (C2105.m6981("֨ܶ") ^ i10) * (-31);
                            linkedHashMap = linkedHashMap2;
                            i3 = ((iM2566 ^ i11) * (-17281)) ^ (-1495406828);
                            i4 = 871100150;
                        } else {
                            iM2566 = (i11 - C2105.m6981("ۘᩴ")) * 89;
                            linkedHashMap = linkedHashMap2;
                            i3 = ((iM2566 ^ i10) * (-26585)) ^ (-1750952186);
                            i4 = -1776059239;
                        }
                        i14 = iM2566 ^ i4;
                        i12 = i3;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    case 1662484310:
                    case 1743177378:
                        linkedHashMap = linkedHashMap2;
                        sArr = f54142;
                        if (C1128.m3851() <= 0) {
                            iM6981 = C2105.m6981("ۛᩳ") ^ i10;
                            i12 = ((iM6981 ^ i11) * 1457) ^ 661479294;
                            i2 = 725019726;
                        } else {
                            iM6981 = (C2105.m6981("ۖ᩻") ^ i11) * (-99);
                            i12 = ((iM6981 ^ i10) * (-4167)) ^ (-1585879960);
                            i2 = 226204360;
                        }
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                    default:
                        linkedHashMap = linkedHashMap2;
                        if (C1005.m3501()) {
                            iM6981 = (i10 - C0630.m2566("᩵ܺ")) * 31;
                            i12 = ((iM6981 ^ i11) * 7185) ^ (-1915826485);
                            i2 = -14994130;
                        } else {
                            iM6981 = (C0630.m2566("۬ۜ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i12 = ((iM6981 ^ i10) * (-31507)) ^ 1996834049;
                            i2 = -1588550049;
                        }
                        i14 = iM6981 ^ i2;
                        linkedHashMap2 = linkedHashMap;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14864 m41428() {
        int iM2566;
        int i;
        boolean z = false;
        int i2 = -1503915421;
        int i3 = RunnableC3474.f10992;
        int i4 = C4117.f13076;
        int iM2567 = C0630.m2566("ۙᩳ") ^ i4;
        int i5 = ((iM2567 ^ i3) * 20085) ^ 1596968782;
        int i6 = iM2567 ^ (-1344998695);
        C14864 c14864 = null;
        while (true) {
            i2 = ((((i2 ^ i3) * (-28767)) >> 31) & i5) ^ i6;
            switch (i2) {
                case -1981035909:
                case 1438428099:
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("ۖ۫") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-2833)) ^ (-688876965);
                        i = -2099137270;
                    } else if (C0050.f910 >= 0) {
                        iM2566 = (C2105.m6981("ܳ۠") + i4) * (-93);
                        i5 = ((iM2566 ^ i3) * (-6475)) ^ (-327710712);
                        i = -2104733511;
                    } else if (C0483.f2088 >= 0 || C0382.m1848()) {
                        iM2566 = (C2105.m6981("ܰ۫") ^ i3) * (-31);
                        i5 = ((iM2566 ^ i4) * 3839) ^ 709226518;
                        i = 177300492;
                    } else if (!C4159.f13567) {
                        iM2566 = C2105.m6981("ᩳ֫") ^ i3;
                        i5 = ((iM2566 ^ i4) * 14967) ^ (-503572446);
                        i = 339799139;
                    } else if (!RunnableC1108.f4040) {
                        iM2566 = (C2105.m6981("ܳ۠") + i4) * (-93);
                        i5 = ((iM2566 ^ i3) * (-6475)) ^ (-327710712);
                        i = -2104733511;
                    } else if (!RunnableC3474.m10630()) {
                        iM2566 = (C0630.m2566("֫ۡ") ^ i3) * 99;
                        i5 = ((iM2566 ^ i4) * (-9441)) ^ (-417799470);
                        i = -1122387217;
                    } else if (C1711.f5919) {
                        iM2566 = (C2105.m6981("ܰ۫") ^ i3) * (-31);
                        i5 = ((iM2566 ^ i4) * 3839) ^ 709226518;
                        i = 177300492;
                    } else {
                        if (!C1711.f5919 && C1047.f3863 < 0) {
                            return new C14864(-2);
                        }
                        iM2566 = C2105.m6981("۟ܶ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-6183)) ^ (-1429714221);
                        i = -1433327553;
                    }
                    i6 = iM2566 ^ i;
                    break;
                case -1888006221:
                case 607038951:
                    C2105.m6982();
                    return null;
                case -1855021736:
                case 1248455009:
                    try {
                        try {
                            c14864 = new C14864(new JSONObject(m41423(z).m43170().m1612()));
                            iM2566 = C2105.m6981("ۨ᩺") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-5747)) ^ 1377891150;
                            i = -1022989332;
                        } catch (SocketTimeoutException unused) {
                            c14864 = null;
                            iM2566 = (C2105.m6981("֫ۛ") ^ i3) * 65;
                            i5 = ((iM2566 ^ i4) * 7799) ^ 13484270;
                            i = -1992957506;
                        } catch (Throwable unused2) {
                            c14864 = null;
                            iM2566 = (C0630.m2566("ۛۛ") ^ i4) * (-97);
                            i5 = ((iM2566 ^ i3) * 24367) ^ (-1680497036);
                            i = 1295914614;
                        }
                    } catch (SocketTimeoutException unused3) {
                    } catch (Throwable unused4) {
                    }
                    i6 = iM2566 ^ i;
                    break;
                case -1721781225:
                case 1350567407:
                    return new C14864(-1);
                case -1561569581:
                case -631766235:
                    return c14864;
                case -1277872902:
                case -115505468:
                    z = true;
                    iM2566 = C0630.m2566("۬ۗ") ^ i4;
                    i5 = ((iM2566 ^ i3) * 22829) ^ (-681805772);
                    i = 480292525;
                    i6 = iM2566 ^ i;
                    break;
                case -485776782:
                case -93204712:
                    if (RunnableC1108.f4040) {
                        iM2566 = (C0630.m2566("۬᩶") ^ i4) * 35;
                        i5 = ((iM2566 ^ i3) * (-27347)) ^ 550078102;
                        i = -106490560;
                    } else {
                        iM2566 = (C2105.m6981("ܰ۫") ^ i3) * (-31);
                        i5 = ((iM2566 ^ i4) * 3839) ^ 709226518;
                        i = 177300492;
                    }
                    i6 = iM2566 ^ i;
                    break;
                case -470967130:
                case 1622416702:
                    if (C3663.f11553) {
                        iM2566 = (C2105.m6981("ܳ۠") + i4) * (-93);
                        i5 = ((iM2566 ^ i3) * (-6475)) ^ (-327710712);
                        i = -2104733511;
                    } else {
                        iM2566 = C2105.m6981("ᩳ֫") ^ i3;
                        i5 = ((iM2566 ^ i4) * 14967) ^ (-503572446);
                        i = 339799139;
                    }
                    i6 = iM2566 ^ i;
                    break;
                case -391909821:
                case 775176538:
                    C7106.m19120();
                    iM2566 = (C0630.m2566("۬᩶") ^ i4) * 35;
                    i5 = ((iM2566 ^ i3) * (-27347)) ^ 550078102;
                    i = -106490560;
                    i6 = iM2566 ^ i;
                    break;
                case -61313361:
                case 303576521:
                    C3683.m11222();
                    if (C11340.m28031()) {
                        iM2566 = (C2105.m6981("ܰ۫") ^ i3) * (-31);
                        i5 = ((iM2566 ^ i4) * 3839) ^ 709226518;
                        i = 177300492;
                    } else {
                        iM2566 = (C0630.m2566("֫ۡ") ^ i3) * 99;
                        i5 = ((iM2566 ^ i4) * (-9441)) ^ (-417799470);
                        i = -1122387217;
                    }
                    i6 = iM2566 ^ i;
                    break;
                case 1279081599:
                case 1550531726:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("۬᩶") ^ i4) * 35;
                        i5 = ((iM2566 ^ i3) * (-27347)) ^ 550078102;
                        i = -106490560;
                    } else {
                        iM2566 = C2105.m6981("ۖ۫") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-2833)) ^ (-688876965);
                        i = -2099137270;
                    }
                    i6 = iM2566 ^ i;
                    break;
                case 1836415402:
                case 1974016086:
                    if (C1294.m4372() > 0) {
                        iM2566 = (C2105.m6981("ܰ۫") ^ i3) * (-31);
                        i5 = ((iM2566 ^ i4) * 3839) ^ 709226518;
                        i = 177300492;
                    } else {
                        iM2566 = (C2105.m6981("ܳ۠") + i4) * (-93);
                        i5 = ((iM2566 ^ i3) * (-6475)) ^ (-327710712);
                        i = -2104733511;
                    }
                    i6 = iM2566 ^ i;
                    break;
                default:
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C0630.m2566("۬᩶") ^ i4) * 35;
                        i5 = ((iM2566 ^ i3) * (-27347)) ^ 550078102;
                        i = -106490560;
                    } else {
                        iM2566 = C0630.m2566("ᩴۖ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-30963)) ^ 1759833145;
                        i = 178363595;
                    }
                    i6 = iM2566 ^ i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad A[PHI: r11
      0x00ad: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]) binds: [B:27:0x00ab, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01cd A[PHI: r4 r9 r16
      0x01cd: PHI (r4v4 char) = (r4v3 char), (r4v2 char) binds: [B:51:0x01cb, B:42:0x015f] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:51:0x01cb, B:42:0x015f] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r16v9 java.lang.String) = (r16v7 java.lang.String), (r16v10 java.lang.String) binds: [B:51:0x01cb, B:42:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0254 A[PHI: r3 r7 r8 r12 r16
      0x0254: PHI (r3v4 short[]) = (r3v2 short[]), (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:24:0x0084, B:64:0x0252, B:60:0x0235, B:16:0x0069, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v6 int) binds: [B:24:0x0084, B:64:0x0252, B:60:0x0235, B:16:0x0069, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v6 int) binds: [B:24:0x0084, B:64:0x0252, B:60:0x0235, B:16:0x0069, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r12v8 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:24:0x0084, B:64:0x0252, B:60:0x0235, B:16:0x0069, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r16v27 java.lang.String) = 
      (r16v2 java.lang.String)
      (r16v4 java.lang.String)
      (r16v5 java.lang.String)
      (r16v22 java.lang.String)
      (r16v31 java.lang.String)
     binds: [B:24:0x0084, B:64:0x0252, B:60:0x0235, B:16:0x0069, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (l.C4159.m12565() < 0) goto L16;
     */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m41430() {
        int iM6981;
        int i;
        int i2;
        int i3 = ServiceConnectionC3453.f10921;
        int i4 = C3245.f10203;
        int iM2566 = (C0630.m2566("ۜ᩸") + i4) * 41;
        int i5 = ((iM2566 ^ i3) * (-20929)) ^ 1151142282;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2566 ^ 177690203;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -987874752;
        LinkedHashMap linkedHashMap = null;
        String strM42819 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 3945) >> 31));
            switch (i12) {
                case -2072396649:
                case -1426603935:
                    if (C3537.m10746() <= 0) {
                        strM42819 = strM42819;
                        iM6981 = C0630.m2566("᩹ۧ") ^ i3;
                        i = ((iM6981 ^ i4) * 7307) ^ 617854130;
                        i2 = 393125669;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܽ۟")) * 69;
                        strM42819 = strM42819;
                        i = ((iM6981 ^ i3) * 7901) ^ (-1923217684);
                        i2 = -1352713155;
                    }
                    String str = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str;
                    break;
                case -2072064839:
                case -450280701:
                    if (C4075.f12947 >= 0) {
                        strM42819 = strM42819;
                        iM6981 = C0630.m2566("᩹ۧ") ^ i3;
                        i = ((iM6981 ^ i4) * 7307) ^ 617854130;
                        i2 = 393125669;
                    } else {
                        iM6981 = C2105.m6981("ۨܶ") ^ i4;
                        strM42819 = strM42819;
                        i = ((iM6981 ^ i3) * 17951) ^ 1277163096;
                        i2 = 1423429477;
                    }
                    String str2 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str2;
                    break;
                case -2039199282:
                case 1801073711:
                    i10 = 1952;
                    iM6981 = C2105.m6981("᩵ܿ") ^ i4;
                    i = ((iM6981 ^ i3) * (-22913)) ^ (-1886142733);
                    i2 = -1965041833;
                    String str3 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str3;
                    break;
                case -1929951963:
                case 1258850846:
                    strM42819 = strM42819;
                    c = 246;
                    if (C3683.f11629 >= 0) {
                        strM42819 = strM42819;
                        iM6981 = (i4 - C2105.m6981("ܽ۟")) * 69;
                        strM42819 = strM42819;
                        i = ((iM6981 ^ i3) * 7901) ^ (-1923217684);
                        i2 = -1352713155;
                    } else {
                        iM6981 = (C0630.m2566("۠᩵") ^ i4) * 27;
                        i = ((iM6981 ^ i3) * 23819) ^ (-377296069);
                        i2 = 973327505;
                    }
                    String str4 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str4;
                    break;
                case -1895685505:
                case -1437613991:
                    strM42819 = strM42819;
                    sArr = f54142;
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ܺ᩻") ^ i4;
                        i = ((iM6981 ^ i3) * 12029) ^ 451761917;
                        i2 = 2100882495;
                    } else {
                        iM6981 = (C2105.m6981("ۖܰ") ^ i4) * 77;
                        i = ((iM6981 ^ i3) * 15575) ^ 834624141;
                        i2 = -1556237501;
                    }
                    String str5 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str5;
                    break;
                case -1771076568:
                case -1465535403:
                    strM42819 = C18393.m42819();
                    linkedHashMap = this.f54145;
                    if (C3432.f10845 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ܽ۟")) * 69;
                        strM42819 = strM42819;
                        i = ((iM6981 ^ i3) * 7901) ^ (-1923217684);
                        i2 = -1352713155;
                        String str6 = strM42819;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        strM42819 = str6;
                    } else {
                        int iM6982 = (C2105.m6981("᩹ۖ") + i3) * (-117);
                        i5 = ((iM6982 ^ i4) * (-27807)) ^ (-1587757123);
                        i6 = iM6982 ^ (-117430128);
                    }
                    break;
                case -1730827458:
                case -56946032:
                    strM42819 = strM42819;
                    s = sArr[c];
                    s2 = 31370;
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM6981 = C2105.m6981("ۗۡ") ^ i3;
                        i = ((iM6981 ^ i4) * (-31047)) ^ 1900356884;
                        i2 = 1174466555;
                    } else {
                        iM6981 = C0630.m2566("ܰۢ") ^ i4;
                        i = ((iM6981 ^ i3) * (-25957)) ^ (-1492612074);
                        i2 = 1248521778;
                    }
                    String str7 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str7;
                    break;
                case -1661427739:
                case 1211271999:
                    sArr2 = f54142;
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("ۨܶ") ^ i4;
                        strM42819 = strM42819;
                        i = ((iM6981 ^ i3) * 17951) ^ 1277163096;
                        i2 = 1423429477;
                    } else {
                        strM42819 = strM42819;
                        iM6981 = C2105.m6981("֡۫") ^ i4;
                        i = ((iM6981 ^ i3) * (-16727)) ^ (-698850077);
                        i2 = 1657137425;
                    }
                    String str8 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str8;
                    break;
                case -1024754781:
                case 1967784744:
                    i10 = 4384;
                    iM6981 = C2105.m6981("᩵ܿ") ^ i4;
                    i = ((iM6981 ^ i3) * (-22913)) ^ (-1886142733);
                    i2 = -1965041833;
                    String str9 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str9;
                    break;
                case -844182226:
                case -152198733:
                    strM42819 = strM42819;
                    if ((i8 + i9) - i7 < 0) {
                        iM6981 = C2105.m6981("᩻ۜ") ^ i3;
                        i = ((iM6981 ^ i4) * (-3783)) ^ 101623770;
                        i2 = -1715548775;
                    } else {
                        iM6981 = C0630.m2566("ۡ᩷") ^ i4;
                        i = ((iM6981 ^ i3) * 10729) ^ 621212607;
                        i2 = 1227064305;
                    }
                    String str10 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str10;
                    break;
                case -817454479:
                case 1991133763:
                    C7106.m19120();
                    break;
                case -205125602:
                case 1598115542:
                    C2126.m7040();
                    break;
                case -73772581:
                case 2081476123:
                    C0483.m2121();
                    strM42819 = strM42819;
                    iM6981 = C2105.m6981("ܺ᩻") ^ i4;
                    i = ((iM6981 ^ i3) * 12029) ^ 451761917;
                    i2 = 2100882495;
                    String str11 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str11;
                    break;
                case -38716919:
                case 450661426:
                    strM42819 = strM42819;
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("ܺ᩻") ^ i4;
                        i = ((iM6981 ^ i3) * 12029) ^ 451761917;
                        i2 = 2100882495;
                    } else {
                        iM6981 = C2105.m6981("᩸ۜ") ^ i3;
                        i = ((iM6981 ^ i4) * 5883) ^ (-1995759394);
                        i2 = -60663758;
                    }
                    String str12 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str12;
                    break;
                case 163465317:
                case 2089146406:
                    linkedHashMap.put(C1711.m5726(sArr2, i11, 5, i10), strM42819);
                    break;
                case 278304294:
                case 912033132:
                    strM42819 = strM42819;
                    if (C3019.f9544 >= 0) {
                        iM6981 = C0630.m2566("᩹ۧ") ^ i3;
                        i = ((iM6981 ^ i4) * 7307) ^ 617854130;
                        i2 = 393125669;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۘۘ")) * (-83);
                        i = ((iM6981 ^ i4) * (-24921)) ^ 509386963;
                        i2 = -1491785579;
                    }
                    String str13 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str13;
                    break;
                case 419659434:
                case 2100011858:
                    strM42819 = strM42819;
                    i9 = 246019225;
                    if (C4159.m12565() >= 0) {
                        strM42819 = strM42819;
                        iM6981 = (i4 - C2105.m6981("ܽ۟")) * 69;
                        strM42819 = strM42819;
                        i = ((iM6981 ^ i3) * 7901) ^ (-1923217684);
                        i2 = -1352713155;
                    } else {
                        iM6981 = C2105.m6981("ۗۨ") ^ i3;
                        i = ((iM6981 ^ i4) * (-17517)) ^ 238969174;
                        i2 = 437947954;
                    }
                    String str14 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str14;
                    break;
                case 795140018:
                case 1086063635:
                    if (RunnableC1937.m6387() != 0) {
                        strM42819 = strM42819;
                        i11 = 247;
                        iM6981 = C2105.m6981("ܺ᩻") ^ i4;
                        i = ((iM6981 ^ i3) * 12029) ^ 451761917;
                        i2 = 2100882495;
                        String str15 = strM42819;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        strM42819 = str15;
                    } else {
                        int iM6983 = (C2105.m6981("᩹ܳ") + i3) * (-53);
                        i6 = iM6983 ^ (-431979573);
                        i5 = ((iM6983 ^ i4) * 32349) ^ 298300077;
                        i11 = 247;
                    }
                    break;
                default:
                    strM42819 = strM42819;
                    i7 = s * s2;
                    i8 = s * s;
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("ܺ᩻") ^ i4;
                        i = ((iM6981 ^ i3) * 12029) ^ 451761917;
                        i2 = 2100882495;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۡܺ")) * (-49);
                        i = ((iM6981 ^ i4) * (-12267)) ^ (-392618787);
                        i2 = -643851285;
                    }
                    String str16 = strM42819;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    strM42819 = str16;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 44341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private l.C18621 m41423(boolean r56) {
        /*
            Method dump skipped, instruction units count: 4434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17687.m41423(boolean):l.ᩴ۟᩵");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18621 m41429() {
        return m41423(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 m41424() {
        return m41423(false);
    }
}
