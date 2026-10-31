package l;

import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.p.a;
import com.google.android.material.slider.BaseSlider;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7HQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17205 implements BatchTranslationEngine.BatchingStrategy {

    /* JADX INFO: renamed from: ֨ۘܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f52747 = {9519, -3379};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f52748;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f52749;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f52750;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52751;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f52752;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52753;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52754;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f52755;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.TextLengthCalculator f52756;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f52757;

    /* JADX WARN: Code duplicated, block: B:61:0x020b A[PHI: r5 r6 r7 r8 r17
      0x020b: PHI (r5v5 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:73:0x029d, B:60:0x0209, B:56:0x01e4, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r6v5 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:73:0x029d, B:60:0x0209, B:56:0x01e4, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:73:0x029d, B:60:0x0209, B:56:0x01e4, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r8v5 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:73:0x029d, B:60:0x0209, B:56:0x01e4, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x020b: PHI (r17v19 java.lang.String) = (r17v2 java.lang.String), (r17v5 java.lang.String), (r17v6 java.lang.String), (r17v21 java.lang.String) binds: [B:73:0x029d, B:60:0x0209, B:56:0x01e4, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0269 A[PHI: r16 r17
      0x0269: PHI (r16v6 short[]) = (r16v4 short[]), (r16v5 short[]), (r16v4 short[]) binds: [B:69:0x0267, B:64:0x0230, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r17v12 java.lang.String) = (r17v3 java.lang.String), (r17v4 java.lang.String), (r17v13 java.lang.String) binds: [B:69:0x0267, B:64:0x0230, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m40465(char c, int i) {
        int iM6981;
        int i2;
        int i3;
        String str;
        int iM2566;
        int i4;
        int i5;
        String strM13542 = null;
        String strM14172 = null;
        TranslationEngine.TextLengthCalculator textLengthCalculator = null;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr = null;
        int i10 = 1983134576;
        int i11 = C2520.f8000;
        int i12 = ViewOnClickListenerC1958.f6529;
        int iM2567 = C0630.m2566("ܺ᩷") ^ i12;
        int i13 = ((iM2567 ^ i11) * 24201) ^ 383750967;
        int i14 = iM2567 ^ (-550905155);
        short[] sArr2 = null;
        while (true) {
            String str2 = null;
            while (true) {
                i10 = i14 ^ (i13 & (((i10 ^ i11) * 7345) >> 31));
                switch (i10) {
                    case -2111631477:
                    case -799166731:
                        C4159.m12565();
                        return 0;
                    case -2022256284:
                    case -1158697256:
                        strM13542 = C4616.m13542(sArr, 1, 1, i9);
                        if (C1047.f3863 < 0) {
                            iM6981 = C2105.m6981("ۧۙ") ^ i12;
                            i2 = ((iM6981 ^ i11) * (-14405)) ^ 1658746967;
                            i3 = -135658218;
                            int i15 = i2;
                            i14 = iM6981 ^ i3;
                            i13 = i15;
                        } else {
                            iM2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                            str = strM13542;
                            i4 = ((iM2566 ^ i11) * 27035) ^ (-1651711954);
                            i5 = 1221946316;
                            i14 = iM2566 ^ i5;
                            i13 = i4;
                            strM13542 = str;
                        }
                        break;
                    case -1962244873:
                    case -176468530:
                        str = strM13542;
                        if (C0714.f2697 >= 0) {
                            strM13542 = str;
                            iM2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                            str = strM13542;
                            i4 = ((iM2566 ^ i11) * 27035) ^ (-1651711954);
                            i5 = 1221946316;
                        } else {
                            iM2566 = (C0630.m2566("ܽۗ") + i11) * 43;
                            i4 = ((iM2566 ^ i12) * (-14899)) ^ (-1997043752);
                            i5 = -1136908;
                        }
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    case -1959077330:
                    case 1152863039:
                        str = strM13542;
                        if (C0382.f1805) {
                            iM2566 = (i12 - C0630.m2566("ܽܽ")) * (-43);
                            i4 = ((iM2566 ^ i11) * 207) ^ (-2142233243);
                            i5 = 56114292;
                        } else {
                            iM2566 = (i12 - C2105.m6981("ۚۛ")) * 31;
                            i4 = ((iM2566 ^ i11) * 3269) ^ (-1121443585);
                            i5 = -2016040762;
                        }
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    case -1700484983:
                    case 605556182:
                        i9 = 56903;
                        iM2566 = (C0630.m2566("۟᩵") ^ i11) * (-25);
                        str = strM13542;
                        i4 = ((iM2566 ^ i12) * 19147) ^ (-2090928827);
                        i5 = 163839406;
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    case -1547076109:
                    case -791564817:
                        strM14172 = C4860.m14172(strM13542, str2, strM13542);
                        textLengthCalculator = this.f52756;
                        if (textLengthCalculator != null) {
                            int iM6982 = C2105.m6981("᩺ۤ") ^ i11;
                            i13 = ((iM6982 ^ i12) * (-26769)) ^ (-9099524);
                            i14 = iM6982 ^ (-1373200099);
                        } else {
                            iM6981 = C2105.m6981("ۛ۫") ^ i12;
                            i2 = ((iM6981 ^ i11) * 14207) ^ 850273195;
                            i3 = 1555956785;
                            int i16 = i2;
                            i14 = iM6981 ^ i3;
                            i13 = i16;
                        }
                        break;
                    case -1380355306:
                    case 1429983232:
                        char[] cArr = new char[i];
                        Arrays.fill(cArr, c);
                        if (!C2272.f7362) {
                            String str3 = new String(cArr);
                            sArr = f52747;
                            if (C2105.f7037 != 0) {
                                str2 = str3;
                                iM2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                                str = strM13542;
                                i4 = ((iM2566 ^ i11) * 27035) ^ (-1651711954);
                                i5 = 1221946316;
                                i14 = iM2566 ^ i5;
                                i13 = i4;
                                strM13542 = str;
                            } else {
                                int iM2568 = (C0630.m2566("ܿ۠") ^ i11) * 47;
                                i13 = ((iM2568 ^ i12) * 6253) ^ (-573288192);
                                i14 = iM2568 ^ 432760515;
                                str2 = str3;
                            }
                        }
                        break;
                    case -1209795316:
                    case 1040019301:
                        C1773.m5908();
                        if (C0630.f2410 <= 0) {
                            str = strM13542;
                            iM2566 = (C2105.m6981("᩹֡") ^ i12) * 93;
                            i4 = ((iM2566 ^ i11) * (-3669)) ^ 1065461126;
                            i5 = -250668448;
                            i14 = iM2566 ^ i5;
                            i13 = i4;
                            strM13542 = str;
                        } else {
                            iM6981 = (C2105.m6981("ܳۛ") ^ i11) * 31;
                            i2 = ((iM6981 ^ i12) * 19421) ^ (-2011334887);
                            i3 = 951858129;
                            int i17 = i2;
                            i14 = iM6981 ^ i3;
                            i13 = i17;
                        }
                        break;
                    case -1178404435:
                    case 296065749:
                        i9 = 62151;
                        iM2566 = (C0630.m2566("۟᩵") ^ i11) * (-25);
                        str = strM13542;
                        i4 = ((iM2566 ^ i12) * 19147) ^ (-2090928827);
                        i5 = 163839406;
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    case -1057565492:
                    case -276003010:
                        if (!C3663.f11553) {
                        }
                        str = strM13542;
                        iM2566 = (C2105.m6981("᩹֡") ^ i12) * 93;
                        i4 = ((iM2566 ^ i11) * (-3669)) ^ 1065461126;
                        i5 = -250668448;
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    case -1044707724:
                    case 272863448:
                        str = strM13542;
                        int i18 = i7 + i8;
                        if ((i18 + i18) - i6 >= 0) {
                            iM2566 = C2105.m6981("ۡ᩷") ^ i11;
                            i4 = ((iM2566 ^ i12) * (-13881)) ^ 224646379;
                            i5 = -1711162057;
                        } else {
                            iM2566 = (C0630.m2566("۟ۚ") + i12) * (-101);
                            i4 = ((iM2566 ^ i11) * 17491) ^ (-1772931863);
                            i5 = 1463668847;
                        }
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    case -842399892:
                    case 1141195431:
                        str = strM13542;
                        sArr2 = f52747;
                        if (RunnableC0588.m2441() >= 0) {
                            iM2566 = (i12 - C2105.m6981("ۚۛ")) * 31;
                            i4 = ((iM2566 ^ i11) * 3269) ^ (-1121443585);
                            i5 = -2016040762;
                        } else {
                            iM2566 = (i12 - C2105.m6981("֡᩶")) * (-121);
                            i4 = ((iM2566 ^ i11) * (-17427)) ^ 1018063113;
                            i5 = -848409684;
                        }
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    case -820913546:
                    case 831040501:
                        str = strM13542;
                        int i19 = s + s2;
                        i6 = i19 * i19;
                        i7 = s * s;
                        if (C11340.m28031()) {
                            iM2566 = (C2105.m6981("ۡۘ") ^ i11) * (-89);
                            i4 = ((iM2566 ^ i12) * (-2279)) ^ 2133776987;
                            i5 = 1648524199;
                        } else {
                            strM13542 = str;
                            iM2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                            str = strM13542;
                            i4 = ((iM2566 ^ i11) * 27035) ^ (-1651711954);
                            i5 = 1221946316;
                        }
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    case -435756616:
                    case 2127990339:
                        C3911.m11924();
                        C7106.m19120();
                        iM6981 = (C2105.m6981("ܳۛ") ^ i11) * 31;
                        i2 = ((iM6981 ^ i12) * 19421) ^ (-2011334887);
                        i3 = 951858129;
                        int i110 = i2;
                        i14 = iM6981 ^ i3;
                        i13 = i110;
                        break;
                    case -152562078:
                    case 2012709625:
                        str = strM13542;
                        s = sArr2[0];
                        s2 = 10054;
                        if (AbstractC2021.f6743 <= 0) {
                            strM13542 = str;
                            iM2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                            str = strM13542;
                            i4 = ((iM2566 ^ i11) * 27035) ^ (-1651711954);
                            i5 = 1221946316;
                        } else {
                            iM2566 = (C0630.m2566("֨ۚ") ^ i12) * (-109);
                            i4 = ((iM2566 ^ i11) * 19057) ^ (-343496744);
                            i5 = -503281239;
                        }
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    case 144538486:
                    case 916176816:
                        return C0798.m3007(strM14172);
                    case 297176850:
                    case 1017782267:
                        str = strM13542;
                        i8 = 101082916;
                        if (RunnableC1108.f4040) {
                            iM2566 = (i12 - C2105.m6981("ܰ۫")) * (-87);
                            i4 = ((iM2566 ^ i11) * (-2615)) ^ (-1835850908);
                            i5 = 2020791044;
                        } else {
                            iM2566 = (C2105.m6981("᩹֡") ^ i12) * 93;
                            i4 = ((iM2566 ^ i11) * (-3669)) ^ 1065461126;
                            i5 = -250668448;
                        }
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    case 629232355:
                    case 2023025464:
                        return textLengthCalculator.calculate(strM14172);
                    case 708705434:
                    case 1690329281:
                        if (C3911.f12484 < 0) {
                            str = strM13542;
                            iM2566 = (i12 - C2105.m6981("ۚۛ")) * 31;
                            i4 = ((iM2566 ^ i11) * 3269) ^ (-1121443585);
                            i5 = -2016040762;
                            i14 = iM2566 ^ i5;
                            i13 = i4;
                            strM13542 = str;
                        }
                        str = strM13542;
                        iM2566 = (C2105.m6981("᩹֡") ^ i12) * 93;
                        i4 = ((iM2566 ^ i11) * (-3669)) ^ 1065461126;
                        i5 = -250668448;
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                    default:
                        str = strM13542;
                        if (C3663.f11553) {
                            strM13542 = str;
                            iM2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                            str = strM13542;
                            i4 = ((iM2566 ^ i11) * 27035) ^ (-1651711954);
                            i5 = 1221946316;
                        } else {
                            iM2566 = (C2105.m6981("ᩴ۟") + i11) * (-49);
                            i4 = ((iM2566 ^ i12) * 22621) ^ (-985450971);
                            i5 = 13771350;
                        }
                        i14 = iM2566 ^ i5;
                        i13 = i4;
                        strM13542 = str;
                        break;
                }
            }
            int iM2569 = C0630.m2566("ۜۤ") ^ i11;
            i14 = iM2569 ^ (-278629603);
            i13 = ((iM2569 ^ i12) * 23779) ^ (-1249045190);
        }
    }

    public C17205(C14382 c14382, int i, TranslationEngine.TextLengthCalculator textLengthCalculator) {
        int i2 = 0;
        int i3 = 1585652460;
        int i4 = ServiceConnectionC3453.f10921;
        int i5 = ViewOnClickListenerC1958.f6529;
        int iM6981 = (i4 - C2105.m6981("ۘۢ")) * 55;
        int i6 = ((iM6981 ^ i5) * 31673) ^ 341248988;
        int i7 = -1329029734;
        while (true) {
            i3 = ((((i3 ^ i5) * 5705) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -2137374149:
                case -2123377442:
                    C0714.m2805();
                    C0964.m3413();
                    throw new RuntimeException();
                case -2122142438:
                case -629881203:
                    C1047.m3599();
                    if (C21923.f70183 == 0) {
                        iM6981 = C2105.m6981("֨᩻") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-17839)) ^ 28567514;
                        i7 = -1927459268;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۘ᩻")) * (-51);
                        i6 = ((iM6981 ^ i5) * (-11487)) ^ 1476544571;
                        i7 = 1247012626;
                    }
                    break;
                case -2051835684:
                case -183659038:
                    ViewOnClickListenerC1958.m6429();
                    iM6981 = (i4 - C2105.m6981("ۘ᩻")) * (-51);
                    i6 = ((iM6981 ^ i5) * (-11487)) ^ 1476544571;
                    i7 = 1247012626;
                    break;
                case -1663997131:
                case -580914357:
                    C2520.m8026();
                    if (C1294.f4556 < 0) {
                        iM6981 = (C0630.m2566("᩷ᩳ") + i5) * 35;
                        i6 = ((iM6981 ^ i4) * 4883) ^ 90230236;
                        i7 = 1529347348;
                    } else {
                        iM6981 = C2105.m6981("ۘۚ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-8913)) ^ (-1868357995);
                        i7 = -1590760745;
                    }
                    break;
                case -1376662300:
                case -686350313:
                    this.f52752 = i;
                    this.f52756 = textLengthCalculator;
                    return;
                case -1246633450:
                case -194777959:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("ۘۚ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-8913)) ^ (-1868357995);
                        i7 = -1590760745;
                    } else {
                        iM6981 = (C2105.m6981("᩺ᩴ") ^ i5) * (-83);
                        i6 = ((iM6981 ^ i4) * 6539) ^ (-650619991);
                        i7 = 953943590;
                    }
                    break;
                case -1188580544:
                case 1467343235:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C2105.m6981("ܶᩴ") ^ i5) * (-31);
                        i6 = ((iM6981 ^ i4) * 31079) ^ (-736172239);
                        i7 = 1399246748;
                    } else {
                        iM6981 = C0630.m2566("ܶ۟") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-7287)) ^ (-1865949423);
                        i7 = 1497821455;
                    }
                    break;
                case -1134619714:
                case 297090498:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("֨᩻") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-17839)) ^ 28567514;
                        i7 = -1927459268;
                    } else {
                        iM6981 = (C0630.m2566("ܺۨ") + i4) * (-9);
                        i6 = ((iM6981 ^ i5) * (-21123)) ^ (-170648074);
                        i7 = 1339638679;
                    }
                    break;
                case -911744579:
                case -8472996:
                    if (C1916.m6308() >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۘ᩻")) * (-51);
                        i6 = ((iM6981 ^ i5) * (-11487)) ^ 1476544571;
                        i7 = 1247012626;
                    } else {
                        iM6981 = C0630.m2566("ᩴۛ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-31759)) ^ 377626129;
                        i7 = -1727719199;
                    }
                    break;
                case -853178831:
                case 144222592:
                    this.f52748 = i2;
                    if (C0237.f1507 != 0) {
                        iM6981 = (C2105.m6981("ܶᩴ") ^ i5) * (-31);
                        i6 = ((iM6981 ^ i4) * 31079) ^ (-736172239);
                        i7 = 1399246748;
                    } else {
                        iM6981 = (C0630.m2566("۫ۜ") + i4) * (-65);
                        i6 = ((iM6981 ^ i5) * (-16779)) ^ (-297635941);
                        i7 = 2032381979;
                    }
                    break;
                case -459734235:
                case 1105357602:
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("ۜܽ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 7285) ^ 1444927261;
                        i7 = 56008277;
                    } else {
                        iM6981 = (C0630.m2566("᩷ᩳ") + i5) * 35;
                        i6 = ((iM6981 ^ i4) * 4883) ^ 90230236;
                        i7 = 1529347348;
                    }
                    break;
                case -253346609:
                case 505966675:
                    if (C0382.f1805) {
                        iM6981 = C0630.m2566("᩶۫") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-31433)) ^ 16404383;
                        i7 = 626208760;
                    } else {
                        iM6981 = C2105.m6981("ۘۚ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-8913)) ^ (-1868357995);
                        i7 = -1590760745;
                    }
                    break;
                case 970087313:
                case 1642754719:
                    C2126.m7040();
                    if (C3245.f10203 > 0) {
                        iM6981 = C2105.m6981("ۘۚ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-8913)) ^ (-1868357995);
                        i7 = -1590760745;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۘ᩻")) * (-51);
                        i6 = ((iM6981 ^ i5) * (-11487)) ^ 1476544571;
                        i7 = 1247012626;
                    }
                    break;
                case 1459152990:
                case 1563112812:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ۘۚ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-8913)) ^ (-1868357995);
                        i7 = -1590760745;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۛۙ")) * 97;
                        i6 = ((iM6981 ^ i5) * 15655) ^ (-343924321);
                        i7 = 1979708268;
                    }
                    break;
                case 1507735152:
                case 1954453529:
                    i2 = -1;
                    this.f52753 = -1;
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = C2105.m6981("֨᩻") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-17839)) ^ 28567514;
                        i7 = -1927459268;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۧ۫")) * (-89);
                        i6 = ((iM6981 ^ i4) * 31275) ^ (-793663883);
                        i7 = -490503863;
                    }
                    break;
                default:
                    if (C0714.m2805()) {
                        iM6981 = C2105.m6981("۫ۛ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 15135) ^ (-1329066155);
                        i7 = -1530575448;
                    } else {
                        iM6981 = (C2105.m6981("ܶᩴ") ^ i5) * (-31);
                        i6 = ((iM6981 ^ i4) * 31079) ^ (-736172239);
                        i7 = 1399246748;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public final void reset() {
        int i = 0;
        int i2 = 0;
        int i3 = 1577055096;
        int i4 = C3911.f12484;
        int i5 = C11340.f33930;
        int iM6981 = C2105.m6981("᩻۬") ^ i4;
        int i6 = ((iM6981 ^ i5) * 19645) ^ (-992230278);
        int i7 = 739251227;
        while (true) {
            i3 = ((((i3 ^ i5) * 12955) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -2062375613:
                case -912033845:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (i5 - C2105.m6981("ۢۚ")) * (-91);
                        i6 = ((iM6981 ^ i4) * 9667) ^ (-1708586307);
                        i7 = -308639895;
                    } else {
                        iM6981 = C2105.m6981("֡ܿ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 21765) ^ 1652080829;
                        i7 = -1423683974;
                    }
                    break;
                case -2031907482:
                case -334488678:
                    i2 = -1;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C2105.m6981("ۖ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-23865)) ^ 798523056;
                        i7 = 606786011;
                    } else {
                        iM6981 = (C2105.m6981("ۜܺ") + i4) * 31;
                        i6 = ((iM6981 ^ i5) * (-21109)) ^ (-639038920);
                        i7 = 1018453137;
                    }
                    break;
                case -2031819587:
                case -890238497:
                    i = 0;
                    if (C0483.m2121()) {
                        iM6981 = (i4 - C2105.m6981("۬ᩴ")) * 17;
                        i6 = ((iM6981 ^ i5) * 9387) ^ (-1174449867);
                        i7 = 217554127;
                    } else {
                        iM6981 = C2105.m6981("ۖ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-23865)) ^ 798523056;
                        i7 = 606786011;
                    }
                    break;
                case -1998634007:
                case 2004211323:
                    if (C4117.m12364() != 0) {
                        iM6981 = C2105.m6981("ۖ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-23865)) ^ 798523056;
                        i7 = 606786011;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ۢۚ")) * (-91);
                        i6 = ((iM6981 ^ i4) * 9667) ^ (-1708586307);
                        i7 = -308639895;
                    }
                    break;
                case -1450138684:
                case 316335926:
                    this.f52750 = 0L;
                    if (C21923.m49329()) {
                        iM6981 = C0630.m2566("᩶ܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-30235)) ^ (-645852986);
                        i7 = -2112935709;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ۙ֫")) * (-121);
                        i6 = ((iM6981 ^ i4) * (-2413)) ^ (-2019288897);
                        i7 = -1439674584;
                    }
                    break;
                case -1439339391:
                case -11944855:
                    if (C1711.m5736() <= 0) {
                        iM6981 = C0630.m2566("᩶ܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-30235)) ^ (-645852986);
                        i7 = -2112935709;
                    } else {
                        iM6981 = (C2105.m6981("ۡ۬") ^ i4) * 41;
                        i6 = ((iM6981 ^ i5) * (-12199)) ^ (-2037331837);
                        i7 = 213872082;
                    }
                    break;
                case -1202891615:
                case -1027008082:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (i5 - C2105.m6981("ۢۚ")) * (-91);
                        i6 = ((iM6981 ^ i4) * 9667) ^ (-1708586307);
                        i7 = -308639895;
                    } else {
                        iM6981 = (C0630.m2566("ۗ֫") + i4) * 47;
                        i6 = ((iM6981 ^ i5) * 22897) ^ (-1583670571);
                        i7 = -1647546032;
                    }
                    break;
                case -1047893640:
                case 306853678:
                    this.f52749 = i;
                    this.f52757 = i;
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("᩶ܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-30235)) ^ (-645852986);
                        i7 = -2112935709;
                    } else {
                        iM6981 = (C0630.m2566("᩺ۙ") + i5) * 61;
                        i6 = ((iM6981 ^ i4) * (-4549)) ^ 148907938;
                        i7 = 1656788405;
                    }
                    break;
                case -1031541443:
                case 973264384:
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("ۢ᩹") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-29585)) ^ (-801154870);
                        i7 = 727938178;
                    } else {
                        iM6981 = C0630.m2566("᩶ܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-30235)) ^ (-645852986);
                        i7 = -2112935709;
                    }
                    break;
                case -792185703:
                case 1693398399:
                    if (C7811.f24123 < 0) {
                        iM6981 = (C0630.m2566("ۗ֫") + i4) * 47;
                        i6 = ((iM6981 ^ i5) * 22897) ^ (-1583670571);
                        i7 = -1647546032;
                    } else {
                        iM6981 = (C0630.m2566("ۖۤ") + i5) * (-85);
                        i6 = ((iM6981 ^ i4) * 25759) ^ (-1731454537);
                        i7 = -87194411;
                    }
                    break;
                case -342837834:
                case 2131680504:
                    this.f52754 = i;
                    if (C0483.m2121()) {
                        iM6981 = C0630.m2566("ۘۡ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-311)) ^ (-142456878);
                        i7 = 1332960984;
                    } else {
                        iM6981 = C0630.m2566("᩶ܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-30235)) ^ (-645852986);
                        i7 = -2112935709;
                    }
                    break;
                case -163807684:
                case 239553469:
                    if (RunnableC1108.m3790()) {
                        iM6981 = (i5 - C2105.m6981("ۢۚ")) * (-91);
                        i6 = ((iM6981 ^ i4) * 9667) ^ (-1708586307);
                        i7 = -308639895;
                    } else {
                        iM6981 = C2105.m6981("ᩳܺ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 25041) ^ 1537827302;
                        i7 = 792947449;
                    }
                    break;
                case -32013129:
                case 461417417:
                    C1128.m3851();
                    C0714.m2805();
                    break;
                case 498350188:
                case 1509038354:
                    if (C1504.m5179()) {
                        iM6981 = C0630.m2566("᩹ۙ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-2619)) ^ (-1650927056);
                        i7 = -299119940;
                    } else {
                        iM6981 = C2105.m6981("ۖ᩶") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-23865)) ^ 798523056;
                        i7 = 606786011;
                    }
                    break;
                case 658339843:
                case 2026427133:
                    C1504.m5179();
                    iM6981 = (C0630.m2566("ۗ֫") + i4) * 47;
                    i6 = ((iM6981 ^ i5) * 22897) ^ (-1583670571);
                    i7 = -1647546032;
                    break;
                default:
                    this.f52753 = i2;
                    this.f52748 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0144, code lost:
    
        if (l.C5695.f17556 < 0) goto L37;
     */
    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean tryAdd(String str) {
        int iM6981;
        int i;
        int iM1484;
        int i2;
        TranslationEngine.TextLengthCalculator textLengthCalculator;
        int i3;
        int i4;
        int iM2566;
        int i5;
        int i6;
        TranslationEngine.TextLengthCalculator textLengthCalculator2;
        int i7;
        int i8;
        TranslationEngine.TextLengthCalculator textLengthCalculator3;
        int iM2567;
        int i9;
        int iM2568;
        int i10;
        int i11;
        TranslationEngine.TextLengthCalculator textLengthCalculator4;
        int iM5741;
        int iM2569;
        int i12;
        int iM6982;
        int i13;
        int i14;
        int iM25610;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iM25611;
        int i20;
        int i21 = C3683.f11629;
        int i22 = C11340.f33930;
        int iM6983 = (C2105.m6981("ۖ᩶") + i21) * (-45);
        int i23 = ((iM6983 ^ i22) * (-20843)) ^ (-587845610);
        TranslationEngine.TextLengthCalculator textLengthCalculator5 = null;
        long j = 0;
        long j2 = 0;
        int i24 = iM6983 ^ (-1434436278);
        int i25 = 0;
        int i26 = 0;
        int iM11932 = 0;
        int iM11933 = 0;
        char cM5733 = 0;
        int i27 = 0;
        char c = 0;
        char c2 = 0;
        boolean z = false;
        int i28 = 0;
        int i29 = 0;
        int iM1485 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        boolean z2 = false;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = -910667697;
        long j3 = 0;
        long j4 = 0;
        int i43 = 0;
        long j5 = 0;
        int i44 = 0;
        while (true) {
            i42 = i24 ^ ((((i42 ^ i22) * (-28119)) >> 31) & i23);
            switch (i42) {
                case -2053857379:
                case -531571654:
                    C4616.m13552();
                    break;
                case -2043238479:
                case 79322849:
                    return z2;
                case -1974721465:
                case -643150394:
                    C0382.m1848();
                    if (C1294.f4556 < 0) {
                        i30 = i30;
                        iM1484 = i25;
                        i2 = i43;
                        int iM25612 = (i21 - C0630.m2566("ۢۘ")) * 33;
                        i43 = i2;
                        i24 = iM25612 ^ 996936739;
                        i23 = ((iM25612 ^ i22) * 22811) ^ (-506403197);
                        i25 = iM1484;
                        i30 = i30;
                    } else {
                        iM6981 = C2105.m6981("ۚ֨") ^ i22;
                        i23 = ((iM6981 ^ i21) * 31099) ^ 510345315;
                        i = -856864098;
                        i24 = iM6981 ^ i;
                    }
                    break;
                case -1904369268:
                case -1451671747:
                    i30 = i30;
                    textLengthCalculator = textLengthCalculator5;
                    i37 = i37;
                    i3 = i25;
                    i4 = this.f52754;
                    if (C0382.f1805) {
                        iM2566 = (i21 - C0630.m2566("֡ۢ")) * 41;
                        i5 = ((iM2566 ^ i22) * 3489) ^ 204482751;
                        i6 = -2074135803;
                    } else {
                        iM2566 = C0630.m2566("ۛۨ") ^ i21;
                        i5 = ((iM2566 ^ i22) * (-18755)) ^ (-387789044);
                        i6 = -1976686797;
                    }
                    i24 = iM2566 ^ i6;
                    i23 = i5;
                    textLengthCalculator5 = textLengthCalculator;
                    i25 = i3;
                    i34 = i4;
                    i37 = i37;
                    i30 = i30;
                    break;
                case -1817357846:
                case 415741868:
                    C0964.m3413();
                    if (C3663.m11168() >= 0) {
                        i16 = iM1485;
                        i17 = i30;
                        iM25611 = C0630.m2566("֫ᩴ") ^ i21;
                        i23 = ((iM25611 ^ i22) * 10593) ^ 2014675551;
                        i20 = 349689854;
                        int i45 = iM25611 ^ i20;
                        iM1485 = i16;
                        i30 = i17;
                        i24 = i45;
                    } else {
                        i30 = i30;
                        i37 = i37;
                        i7 = i25;
                        iM2569 = C0630.m2566("۫֨") ^ i22;
                        i10 = ((iM2569 ^ i21) * 30717) ^ (-2065304815);
                        i12 = 466837217;
                        i24 = iM2569 ^ i12;
                        i23 = i10;
                        i25 = i7;
                        i37 = i37;
                        i30 = i30;
                    }
                    break;
                case -1734645421:
                case -100992088:
                    RunnableC1108.m3790();
                    if (C7811.m20844() == 0) {
                        i30 = i30;
                        i7 = i25;
                        iM2569 = C2105.m6981("᩸ܺ") ^ i22;
                        i10 = ((iM2569 ^ i21) * (-19951)) ^ 1378299469;
                        i12 = -1222005137;
                        i24 = iM2569 ^ i12;
                        i23 = i10;
                        i25 = i7;
                        i37 = i37;
                        i30 = i30;
                    } else {
                        i16 = iM1485;
                        i17 = i30;
                        iM25611 = C0630.m2566("֫ᩴ") ^ i21;
                        i23 = ((iM25611 ^ i22) * 10593) ^ 2014675551;
                        i20 = 349689854;
                        int i46 = iM25611 ^ i20;
                        iM1485 = i16;
                        i30 = i17;
                        i24 = i46;
                    }
                    break;
                case -1706702477:
                case 2125020595:
                    if (!C0382.f1805) {
                        i30 = i30;
                        i37 = i37;
                        i7 = i25;
                        iM2569 = C0630.m2566("۫֨") ^ i22;
                        i10 = ((iM2569 ^ i21) * 30717) ^ (-2065304815);
                        i12 = 466837217;
                        i24 = iM2569 ^ i12;
                        i23 = i10;
                        i25 = i7;
                        i37 = i37;
                        i30 = i30;
                    } else {
                        iM6981 = C2105.m6981("ۚ֨") ^ i22;
                        i23 = ((iM6981 ^ i21) * 31099) ^ 510345315;
                        i = -856864098;
                        i24 = iM6981 ^ i;
                    }
                    break;
                case -1701070515:
                case -805722688:
                    C11340.m28031();
                    i30 = i30;
                    iM25610 = (i21 - C2105.m6981("ᩴܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i23 = ((iM25610 ^ i22) * (-8009)) ^ (-132942971);
                    i15 = -626851119;
                    i24 = iM25610 ^ i15;
                    i30 = i30;
                    break;
                case -1625753038:
                case 1726514840:
                    i16 = iM1485;
                    i17 = i30;
                    this.f52755 = m40465(c2, i25);
                    this.f52753 = i25;
                    iM25611 = C0630.m2566("᩻᩶") ^ i22;
                    i23 = ((iM25611 ^ i21) * 27541) ^ 4193703;
                    i20 = -1176454780;
                    int i47 = iM25611 ^ i20;
                    iM1485 = i16;
                    i30 = i17;
                    i24 = i47;
                    break;
                case -1498379147:
                case 1616479381:
                    i30 = i30;
                    i37 = i37;
                    i7 = i25;
                    i43 = iM1485 + 1;
                    if (C1504.f5354) {
                        iM2569 = C0630.m2566("۫֨") ^ i22;
                        i10 = ((iM2569 ^ i21) * 30717) ^ (-2065304815);
                        i12 = 466837217;
                    } else {
                        iM2569 = C2105.m6981("ۢ᩷") ^ i21;
                        i10 = ((iM2569 ^ i22) * 21651) ^ 1598795515;
                        i12 = -1903244726;
                    }
                    i24 = iM2569 ^ i12;
                    i23 = i10;
                    i25 = i7;
                    i37 = i37;
                    i30 = i30;
                    break;
                case -1487637719:
                case 1046164384:
                    i38 = i30;
                    i39 = 0;
                    iM6981 = C0630.m2566("۬֡") ^ i21;
                    i23 = ((iM6981 ^ i22) * 13185) ^ 563529657;
                    i = 633297224;
                    i24 = iM6981 ^ i;
                    break;
                case -1472873435:
                case 1393368625:
                    int i48 = i36 + (z ? 1 : 0);
                    if (i48 > i30) {
                        i38 = i48;
                        i39 = i38;
                    } else {
                        i39 = i48;
                        i38 = i30;
                    }
                    iM6981 = C0630.m2566("۬֡") ^ i21;
                    i23 = ((iM6981 ^ i22) * 13185) ^ 563529657;
                    i = 633297224;
                    i24 = iM6981 ^ i;
                    break;
                case -1380938064:
                case 883294812:
                    i16 = iM1485;
                    i17 = i30;
                    int i49 = i44 + (z ? 1 : 0);
                    if (i49 > i29) {
                        i40 = i49;
                        i41 = i40;
                    } else {
                        i41 = i49;
                        i40 = i29;
                    }
                    iM25611 = C0630.m2566("᩸ܶ") ^ i21;
                    i23 = ((iM25611 ^ i22) * 3699) ^ (-165083264);
                    i20 = 761232628;
                    int i410 = iM25611 ^ i20;
                    iM1485 = i16;
                    i30 = i17;
                    i24 = i410;
                    break;
                case -1375850135:
                case 615095942:
                    i30 = i30;
                    textLengthCalculator2 = textLengthCalculator5;
                    i37 = i37;
                    i7 = i25;
                    z2 = false;
                    i8 = i34;
                    if (i8 >= 100) {
                        iM2567 = C0630.m2566("ۤܳ") ^ i22;
                        textLengthCalculator3 = textLengthCalculator2;
                        i23 = ((iM2567 ^ i21) * 30553) ^ 1622269758;
                        i9 = 1377590338;
                    } else {
                        textLengthCalculator3 = textLengthCalculator2;
                        iM2567 = C0630.m2566("ۛܺ") ^ i22;
                        i23 = ((iM2567 ^ i21) * (-25833)) ^ (-152807265);
                        i9 = -1456127964;
                    }
                    i24 = iM2567 ^ i9;
                    textLengthCalculator5 = textLengthCalculator3;
                    i34 = i8;
                    i25 = i7;
                    i37 = i37;
                    i30 = i30;
                    break;
                case -1357695035:
                case 2047468658:
                    i30 = i30;
                    i2 = i43;
                    iM1484 = C0237.m1484(8, i2);
                    i35 = 1;
                    if (C2167.f7158 >= 0) {
                        i37 = 8;
                        int iM25613 = (i21 - C0630.m2566("ۢۘ")) * 33;
                        i43 = i2;
                        i24 = iM25613 ^ 996936739;
                        i23 = ((iM25613 ^ i22) * 22811) ^ (-506403197);
                        i25 = iM1484;
                        i30 = i30;
                    } else {
                        i43 = i2;
                        int iM6984 = C2105.m6981("ܿ᩷") ^ i22;
                        i23 = ((iM6984 ^ i21) * 16079) ^ 890410296;
                        i24 = iM6984 ^ (-1200487544);
                        i25 = iM1484;
                        i30 = i30;
                        i37 = 8;
                    }
                    break;
                case -1197557329:
                case -448328425:
                    i30 = i30;
                    cM5733 = C1711.m5733(str, i28);
                    if (cM5733 == c2) {
                        iM6982 = (C0630.m2566("ܰۗ") ^ i21) * 101;
                        i13 = ((iM6982 ^ i22) * 30719) ^ (-1462921954);
                        i14 = -723394686;
                    } else {
                        iM6982 = C2105.m6981("ۨۤ") ^ i21;
                        i13 = ((iM6982 ^ i22) * (-2269)) ^ (-663937671);
                        i14 = -1184797864;
                    }
                    i24 = iM6982 ^ i14;
                    i23 = i13;
                    i30 = i30;
                    break;
                case -1127612507:
                case -605525719:
                    i30 = i30;
                    j3 = this.f52750;
                    long j6 = i27;
                    if (C0630.f2410 <= 0) {
                        j = j6;
                        iM25610 = (i21 - C2105.m6981("ᩴܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i23 = ((iM25610 ^ i22) * (-8009)) ^ (-132942971);
                        i15 = -626851119;
                        i24 = iM25610 ^ i15;
                    } else {
                        int iM6985 = (C2105.m6981("ܳۘ") + i21) * 127;
                        j = j6;
                        i23 = 264387184 ^ ((iM6985 ^ i22) * 5673);
                        i24 = iM6985 ^ 49115831;
                    }
                    i30 = i30;
                    break;
                case -1118315262:
                case -795693171:
                    this.f52751 = m40465(c, iM11932);
                    this.f52748 = iM11932;
                    i16 = iM1485;
                    i17 = i30;
                    iM25611 = C0630.m2566("ۨ֫") ^ i21;
                    i23 = ((iM25611 ^ i22) * 15801) ^ 37904188;
                    i20 = 938430616;
                    int i411 = iM25611 ^ i20;
                    iM1485 = i16;
                    i30 = i17;
                    i24 = i411;
                    break;
                case -1106276172:
                case 1792690238:
                    C2520.m8026();
                    if (C21923.f70183 == 0) {
                        int i50 = i37;
                        i7 = i25;
                        i18 = i30;
                        i37 = i50;
                        iM2569 = (i22 - C0630.m2566("᩻ۗ")) * 59;
                        i30 = i18;
                        i10 = ((iM2569 ^ i21) * (-24409)) ^ (-656880042);
                        i12 = 756196100;
                        i24 = iM2569 ^ i12;
                        i23 = i10;
                        i25 = i7;
                        i37 = i37;
                        i30 = i30;
                    }
                    i30 = i30;
                    i7 = i25;
                    iM2569 = C2105.m6981("᩸ܺ") ^ i22;
                    i10 = ((iM2569 ^ i21) * (-19951)) ^ 1378299469;
                    i12 = -1222005137;
                    i24 = iM2569 ^ i12;
                    i23 = i10;
                    i25 = i7;
                    i37 = i37;
                    i30 = i30;
                    break;
                case -1101340322:
                case 439519362:
                    C1294.m4372();
                    return false;
                case -1016575306:
                case 630487432:
                    int i51 = iM1485;
                    i30 = i30;
                    long jM1484 = C0237.m1484(this.f52755, this.f52751);
                    if (C0714.m2805()) {
                        int iM25614 = C0630.m2566("ܶ᩵") ^ i22;
                        j5 = jM1484;
                        i23 = ((iM25614 ^ i21) * 27215) ^ 2095460659;
                        i30 = i30;
                        i24 = iM25614 ^ (-1173224115);
                        iM1485 = i51;
                    } else {
                        j5 = jM1484;
                        iM1485 = i51;
                        i7 = i25;
                        iM2569 = C2105.m6981("᩸ܺ") ^ i22;
                        i10 = ((iM2569 ^ i21) * (-19951)) ^ 1378299469;
                        i12 = -1222005137;
                        i24 = iM2569 ^ i12;
                        i23 = i10;
                        i25 = i7;
                        i37 = i37;
                        i30 = i30;
                    }
                    break;
                case -943273729:
                case 686646146:
                    i28 = i31;
                    i29 = i32;
                    i19 = i33;
                    i44 = 0;
                    i36 = 0;
                    int iM6986 = (i21 - C2105.m6981("ۖۖ")) * 31;
                    int i52 = i19;
                    i23 = ((iM6986 ^ i22) * 22965) ^ (-1453994094);
                    i24 = iM6986 ^ (-1896319883);
                    i25 = i25;
                    i37 = i37;
                    i30 = i52;
                    break;
                case -907352700:
                case -514174007:
                    C0237.m1481();
                    if (C2520.f8000 < 0) {
                        i30 = i30;
                        iM25610 = (i21 - C0630.m2566("۠۟")) * (-61);
                        i23 = ((iM25610 ^ i22) * 29617) ^ (-773552531);
                        i15 = 1109511650;
                        i24 = iM25610 ^ i15;
                        i30 = i30;
                    }
                    i30 = i30;
                    i7 = i25;
                    iM2569 = C2105.m6981("᩸ܺ") ^ i22;
                    i10 = ((iM2569 ^ i21) * (-19951)) ^ 1378299469;
                    i12 = -1222005137;
                    i24 = iM2569 ^ i12;
                    i23 = i10;
                    i25 = i7;
                    i37 = i37;
                    i30 = i30;
                    break;
                case -784841584:
                case 178822093:
                    i28++;
                    i19 = i38;
                    i36 = i39;
                    i29 = i40;
                    i44 = i41;
                    int iM6987 = (i21 - C2105.m6981("ۖۖ")) * 31;
                    int i53 = i19;
                    i23 = ((iM6987 ^ i22) * 22965) ^ (-1453994094);
                    i24 = iM6987 ^ (-1896319883);
                    i25 = i25;
                    i37 = i37;
                    i30 = i53;
                    break;
                case -714639201:
                case 1660990097:
                    if (C0964.f3626 != 0) {
                        i30 = i30;
                        i4 = i34;
                        textLengthCalculator = textLengthCalculator5;
                        i37 = i37;
                        i3 = i25;
                        iM2566 = C0630.m2566("ۛۨ") ^ i21;
                        i5 = ((iM2566 ^ i22) * (-18755)) ^ (-387789044);
                        i6 = -1976686797;
                        i24 = iM2566 ^ i6;
                        i23 = i5;
                        textLengthCalculator5 = textLengthCalculator;
                        i25 = i3;
                        i34 = i4;
                        i37 = i37;
                        i30 = i30;
                    }
                    i30 = i30;
                    i37 = i37;
                    i7 = i25;
                    iM2569 = C0630.m2566("۫֨") ^ i22;
                    i10 = ((iM2569 ^ i21) * 30717) ^ (-2065304815);
                    i12 = 466837217;
                    i24 = iM2569 ^ i12;
                    i23 = i10;
                    i25 = i7;
                    i37 = i37;
                    i30 = i30;
                    break;
                case -695516785:
                case 1849219982:
                    i16 = iM1485;
                    i17 = i30;
                    j4 = this.f52750 + ((long) i27);
                    if (C4616.f14690 <= 0) {
                        iM25611 = (C0630.m2566("ܰ᩻") ^ i22) * (-119);
                        i23 = ((iM25611 ^ i21) * 26355) ^ (-647989721);
                        i20 = -1179067543;
                    } else {
                        iM25611 = C2105.m6981("᩶ۧ") ^ i22;
                        i23 = ((iM25611 ^ i21) * 30451) ^ (-820958689);
                        i20 = -604763715;
                    }
                    int i412 = iM25611 ^ i20;
                    iM1485 = i16;
                    i30 = i17;
                    i24 = i412;
                    break;
                case -639924569:
                case 291179514:
                    i16 = iM1485;
                    i17 = i30;
                    if (cM5733 == c) {
                        iM25611 = (C2105.m6981("᩷ۛ") ^ i22) * (-121);
                        i23 = ((iM25611 ^ i21) * 24591) ^ 712285631;
                        i20 = 279197549;
                    } else {
                        iM25611 = (C0630.m2566("᩺ᩴ") ^ i21) * 69;
                        i23 = ((iM25611 ^ i22) * 31275) ^ (-358690740);
                        i20 = 1089342682;
                    }
                    int i413 = iM25611 ^ i20;
                    iM1485 = i16;
                    i30 = i17;
                    i24 = i413;
                    break;
                case -548976381:
                case 799963045:
                    i30 = i30;
                    this.f52754 += z ? 1 : 0;
                    if (C7811.f24123 >= 0) {
                        iM25610 = (i21 - C0630.m2566("۠۟")) * (-61);
                        i23 = ((iM25610 ^ i22) * 29617) ^ (-773552531);
                        i15 = 1109511650;
                    } else {
                        iM25610 = C0630.m2566("۠᩹") ^ i22;
                        i23 = ((iM25610 ^ i21) * 30783) ^ 1104059956;
                        i15 = 1759721216;
                    }
                    i24 = iM25610 ^ i15;
                    i30 = i30;
                    break;
                case -545891672:
                case 961856073:
                    textLengthCalculator4 = textLengthCalculator5;
                    iM5741 = textLengthCalculator4.calculate(str);
                    i27 = iM5741;
                    int iM25615 = C0630.m2566("ܽܳ") ^ i21;
                    int i54 = ((iM25615 ^ i22) * (-28109)) ^ 1922594157;
                    i24 = iM25615 ^ (-360230257);
                    textLengthCalculator5 = textLengthCalculator4;
                    i25 = i25;
                    i23 = i54;
                    i37 = i37;
                    i30 = i30;
                    break;
                case -181914601:
                case 1306949193:
                    i16 = iM1485;
                    i17 = i30;
                    i40 = i29;
                    i41 = 0;
                    iM25611 = C0630.m2566("᩸ܶ") ^ i21;
                    i23 = ((iM25611 ^ i22) * 3699) ^ (-165083264);
                    i20 = 761232628;
                    int i414 = iM25611 ^ i20;
                    iM1485 = i16;
                    i30 = i17;
                    i24 = i414;
                    break;
                case 8096019:
                case 1817763756:
                    i30 = i30;
                    i37 = i37;
                    iM11932 = C3911.m11932(i37, iM11933 + i35);
                    i26 = this.f52752;
                    if (i26 > 0) {
                        iM2569 = (i22 - C2105.m6981("ܳۤ")) * (-57);
                        i7 = i25;
                        i10 = ((iM2569 ^ i21) * (-24843)) ^ 586785662;
                        i12 = -1123514077;
                    } else {
                        i7 = i25;
                        iM2569 = (C2105.m6981("᩵ܳ") ^ i22) * (-55);
                        i10 = ((iM2569 ^ i21) * 11475) ^ (-1365660629);
                        i12 = 1149538647;
                    }
                    i24 = iM2569 ^ i12;
                    i23 = i10;
                    i25 = i7;
                    i37 = i37;
                    i30 = i30;
                    break;
                case 252272207:
                case 313362950:
                    i30 = i30;
                    i37 = i37;
                    i7 = i25;
                    int iM5742 = C1711.m5741(str);
                    c = '-';
                    c2 = a.h;
                    z = true;
                    z = true;
                    if (i28 < iM5742) {
                        iM2569 = C0630.m2566("᩵۫") ^ i21;
                        i10 = ((iM2569 ^ i22) * 9191) ^ 1002825513;
                        i12 = 298055660;
                    } else {
                        iM2569 = (i22 - C0630.m2566("ۨᩴ")) * 87;
                        i10 = ((iM2569 ^ i21) * 4729) ^ 881491920;
                        i12 = 1832537340;
                    }
                    i24 = iM2569 ^ i12;
                    i23 = i10;
                    i25 = i7;
                    i37 = i37;
                    i30 = i30;
                    break;
                case 266147248:
                case 1619911695:
                    i16 = iM1485;
                    i17 = i30;
                    j2 = ((long) this.f52754) * j5;
                    if (C3019.f9544 >= 0) {
                        iM25611 = C0630.m2566("֫ᩴ") ^ i21;
                        i23 = ((iM25611 ^ i22) * 10593) ^ 2014675551;
                        i20 = 349689854;
                    } else {
                        iM25611 = C2105.m6981("ܿۘ") ^ i21;
                        i23 = ((iM25611 ^ i22) * (-25799)) ^ 520817940;
                        i20 = -1748794057;
                    }
                    int i415 = iM25611 ^ i20;
                    iM1485 = i16;
                    i30 = i17;
                    i24 = i415;
                    break;
                case 362816459:
                case 1294345145:
                    this.f52750 = j3 + j;
                    this.f52749 = iM1485;
                    this.f52757 = iM11933;
                    return z;
                case 498072282:
                case 2099231911:
                    i30 = i30;
                    i37 = i37;
                    i7 = i25;
                    TranslationEngine.TextLengthCalculator textLengthCalculator6 = this.f52756;
                    if (textLengthCalculator6 != null) {
                        iM2568 = C2105.m6981("᩷ۙ") ^ i21;
                        i10 = ((iM2568 ^ i22) * (-14937)) ^ (-484232956);
                        i11 = -841991962;
                    } else {
                        iM2568 = C0630.m2566("ۘܽ") ^ i22;
                        i10 = ((iM2568 ^ i21) * (-11033)) ^ (-705747460);
                        i11 = -1682493694;
                    }
                    i24 = iM2568 ^ i11;
                    textLengthCalculator5 = textLengthCalculator6;
                    i23 = i10;
                    i25 = i7;
                    i37 = i37;
                    i30 = i30;
                    break;
                case 503346420:
                case 1198702268:
                    i30 = i30;
                    i37 = i37;
                    i7 = i25;
                    i31 = 0;
                    i32 = 0;
                    i33 = 0;
                    if (C4117.f13076 <= 0) {
                        iM2569 = C2105.m6981("᩸ܺ") ^ i22;
                        i10 = ((iM2569 ^ i21) * (-19951)) ^ 1378299469;
                        i12 = -1222005137;
                    } else {
                        iM2569 = C0630.m2566("֨ܽ") ^ i22;
                        i10 = ((iM2569 ^ i21) * (-23639)) ^ 1936384921;
                        i12 = 334256470;
                    }
                    i24 = iM2569 ^ i12;
                    i23 = i10;
                    i25 = i7;
                    i37 = i37;
                    i30 = i30;
                    break;
                case 801459147:
                case 1335743323:
                    textLengthCalculator4 = textLengthCalculator5;
                    iM5741 = C1711.m5741(str);
                    i27 = iM5741;
                    int iM25616 = C0630.m2566("ܽܳ") ^ i21;
                    int i55 = ((iM25616 ^ i22) * (-28109)) ^ 1922594157;
                    i24 = iM25616 ^ (-360230257);
                    textLengthCalculator5 = textLengthCalculator4;
                    i25 = i25;
                    i23 = i55;
                    i37 = i37;
                    i30 = i30;
                    break;
                case 921645488:
                case 2144924750:
                    i16 = iM1485;
                    i17 = i30;
                    if (i25 != this.f52753) {
                        iM25611 = (C0630.m2566("ۖۘ") ^ i22) * 47;
                        i23 = ((iM25611 ^ i21) * (-2111)) ^ (-361191387);
                        i20 = -1794365638;
                    } else {
                        iM25611 = C0630.m2566("᩻᩶") ^ i22;
                        i23 = ((iM25611 ^ i21) * 27541) ^ 4193703;
                        i20 = -1176454780;
                    }
                    int i416 = iM25611 ^ i20;
                    iM1485 = i16;
                    i30 = i17;
                    i24 = i416;
                    break;
                case 1665442723:
                case 2022815967:
                    int i56 = iM1485;
                    i30 = i30;
                    if (j2 + j4 <= i26) {
                        i37 = i37;
                        iM1485 = i56;
                        i7 = i25;
                        iM2569 = (C2105.m6981("᩵ܳ") ^ i22) * (-55);
                        i10 = ((iM2569 ^ i21) * 11475) ^ (-1365660629);
                        i12 = 1149538647;
                        i24 = iM2569 ^ i12;
                        i23 = i10;
                        i25 = i7;
                        i37 = i37;
                        i30 = i30;
                    } else {
                        textLengthCalculator2 = textLengthCalculator5;
                        i37 = i37;
                        iM1485 = i56;
                        i7 = i25;
                        i8 = i34;
                        iM2567 = C0630.m2566("ۤܳ") ^ i22;
                        textLengthCalculator3 = textLengthCalculator2;
                        i23 = ((iM2567 ^ i21) * 30553) ^ 1622269758;
                        i9 = 1377590338;
                        i24 = iM2567 ^ i9;
                        textLengthCalculator5 = textLengthCalculator3;
                        i34 = i8;
                        i25 = i7;
                        i37 = i37;
                        i30 = i30;
                    }
                    break;
                case 1802729238:
                case 1841943011:
                    i16 = iM1485;
                    i17 = i30;
                    if (iM11932 != this.f52748) {
                        iM25611 = (C0630.m2566("ۡ֫") ^ i22) * 27;
                        i23 = ((iM25611 ^ i21) * (-2265)) ^ 1793346262;
                        i20 = -1340446177;
                    } else {
                        iM25611 = C0630.m2566("ۨ֫") ^ i21;
                        i23 = ((iM25611 ^ i22) * 15801) ^ 37904188;
                        i20 = 938430616;
                    }
                    int i417 = iM25611 ^ i20;
                    iM1485 = i16;
                    i30 = i17;
                    i24 = i417;
                    break;
                default:
                    int i57 = i30;
                    i37 = i37;
                    i7 = i25;
                    iM1485 = C0237.m1484(this.f52749, i29);
                    i18 = i57;
                    iM11933 = C3911.m11932(this.f52757, i18);
                    if (C3663.f11553) {
                        iM2569 = (i22 - C0630.m2566("᩻ۗ")) * 59;
                        i30 = i18;
                        i10 = ((iM2569 ^ i21) * (-24409)) ^ (-656880042);
                        i12 = 756196100;
                    } else {
                        i30 = i18;
                        iM2569 = C0630.m2566("ܿ۟") ^ i21;
                        i10 = ((iM2569 ^ i22) * 3901) ^ 715392941;
                        i12 = -1797348616;
                    }
                    i24 = iM2569 ^ i12;
                    i23 = i10;
                    i25 = i7;
                    i37 = i37;
                    i30 = i30;
                    break;
            }
        }
    }
}
