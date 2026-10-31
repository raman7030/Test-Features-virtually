package l;

import android.util.Base64;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1PE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1926 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6460 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f6462;

    /* JADX INFO: renamed from: ᩴܶۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f6463 = {3930, -2133, 598, 10912, 8680, 3251, 2617, 7370, 5350, -14267, -12801, -13504, 3111, -30483, 18525, 27499, 1658, 1635, 1639, 1594, 1636, 1635, 1656, 1637, 1650, 1593, 1658, 1635, 1573, 1593, 1652, 1657, 1658, 1635, 1594, 1639, 1637, 1656, 1635, 1650, 1652, 1635, 1593, 1656, 1636, 1636, 1594, 1654, 1652, 1652, 1650, 1659, 1650, 1637, 1654, 1635, 1650, 1593, 1654, 1659, 1662, 1646, 1634, 1657, 1652, 1636, 1593, 1652, 1656, 1658, 609, -19315, 29462, 19552, 15654, 15679, 15675, 15718, 15672, 15679, 15652, 15673, 15662, 15717, 15654, 15679, 15737, 15717, 15656, 15653, 15654, 15679, 15718, 15675, 15673, 15652, 15679, 15662, 15656, 15679, 15717, 15652, 15672, 15672, 15718, 15658, 15656, 15656, 15662, 15655, 15662, 15673, 15658, 15679, 15662, 15717, 15658, 15655, 15650, 15666, 15678, 15653, 15656, 15672, 15717, 15656, 15652, 15654, 8869, -19238, -17217, -21182};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List f6461 = Collections.EMPTY_LIST;

    /* JADX WARN: Code duplicated, block: B:62:0x024d A[PHI: r3 r5 r11 r12 r17 r19
      0x024d: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:38:0x012f, B:61:0x024b, B:47:0x018e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r5v4 l.ۧܺۢ) = (r5v3 l.ۧܺۢ), (r5v2 l.ۧܺۢ), (r5v2 l.ۧܺۢ), (r5v2 l.ۧܺۢ) binds: [B:38:0x012f, B:61:0x024b, B:47:0x018e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:38:0x012f, B:61:0x024b, B:47:0x018e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:38:0x012f, B:61:0x024b, B:47:0x018e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r17v18 char) = (r17v3 char), (r17v12 char), (r17v17 char), (r17v19 char) binds: [B:38:0x012f, B:61:0x024b, B:47:0x018e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r19v15 int) = (r19v1 int), (r19v9 int), (r19v14 int), (r19v16 int) binds: [B:38:0x012f, B:61:0x024b, B:47:0x018e, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6338(String str, C9688 c9688) throws C1637 {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM6981;
        int i7;
        int iM6982;
        int i8;
        int i9;
        int i10 = C0050.f910;
        int i11 = C1128.f4106;
        int iM6983 = (i10 - C2105.m6981("ܽ᩻")) * 119;
        int i12 = ((iM6983 ^ i11) * 13269) ^ (-55459938);
        short[] sArr = null;
        int i13 = iM6983 ^ (-685993650);
        char c = 0;
        short s = 0;
        int i14 = 0;
        int i15 = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 1414060853;
        C23881 c23881M2437 = null;
        C11099 c11099 = null;
        String str2 = null;
        String str3 = null;
        C18237 c18237M7511 = null;
        while (true) {
            i17 = i13 ^ (i12 & (((i17 ^ i11) * 15047) >> 31));
            switch (i17) {
                case -2015410628:
                case -1815142359:
                    c = c;
                    i14 = i14;
                    C1773.m5907(c18237M7511, str2);
                    C1773.m5907(c18237M7511, c9688.f29295);
                    c11099 = c9688.f29299;
                    if (C0237.f1507 == 0) {
                        iM2566 = (C2105.m6981("۬᩸") ^ i10) * (-99);
                        i = ((iM2566 ^ i11) * (-3105)) ^ 71864492;
                        i2 = 123528988;
                        int i18 = iM2566 ^ i2;
                        c = c;
                        i14 = i14;
                        i13 = i18;
                        i12 = i;
                    } else {
                        iM2567 = (C2105.m6981("᩹᩵") + i10) * (-53);
                        i3 = ((iM2567 ^ i11) * (-6753)) ^ (-1886423001);
                        i4 = -163809067;
                        i7 = iM2567 ^ i4;
                        i12 = i3;
                        c = c;
                        i14 = i14;
                        i13 = i7;
                    }
                    break;
                case -2011085496:
                case -1334965273:
                    c = c;
                    i14 = i14;
                    C0483.m2120(c18237M7511, str);
                    str3 = c9688.f29296;
                    if (C3432.f10845 >= 0) {
                        iM2567 = (C2105.m6981("᩹᩵") + i10) * (-53);
                        i3 = ((iM2567 ^ i11) * (-6753)) ^ (-1886423001);
                        i4 = -163809067;
                    } else {
                        iM2567 = (C0630.m2566("ܽ᩹") + i10) * (-37);
                        i3 = ((iM2567 ^ i11) * (-14641)) ^ 313755200;
                        i4 = -1299370203;
                    }
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    c = c;
                    i14 = i14;
                    i13 = i7;
                    break;
                case -1487891995:
                case 201846820:
                    c = c;
                    i14 = i14;
                    sArr = f6463;
                    if (!C0382.f1805) {
                        c = c;
                        iM6982 = C2105.m6981("ܳ᩶") ^ i11;
                        i8 = ((iM6982 ^ i10) * (-1327)) ^ 861592625;
                        i9 = 1800774857;
                        i13 = iM6982 ^ i9;
                        i12 = i8;
                        i14 = i14;
                    } else {
                        iM2567 = C0630.m2566("ܰۙ") ^ i10;
                        i3 = ((iM2567 ^ i11) * 2445) ^ (-1536545667);
                        i4 = 301405085;
                        i7 = iM2567 ^ i4;
                        i12 = i3;
                        c = c;
                        i14 = i14;
                        i13 = i7;
                    }
                    break;
                case -1350774222:
                case -1040149514:
                    short[] sArr2 = f6463;
                    c = c;
                    if (RunnableC1108.f4040) {
                        i14 = i14;
                        String strM16034 = C5695.m16034(sArr2, 1, 3, i16);
                        if (C4159.f13567) {
                            throw new C1637(RunnableC3474.m10631(c23881M2437, C0630.m2566(strM16034) ^ 2097750397));
                        }
                    } else {
                        i14 = i14;
                    }
                    c = c;
                    iM6982 = C2105.m6981("ܳ᩶") ^ i11;
                    i8 = ((iM6982 ^ i10) * (-1327)) ^ 861592625;
                    i9 = 1800774857;
                    i13 = iM6982 ^ i9;
                    i12 = i8;
                    i14 = i14;
                    break;
                case -1144581202:
                case 2107032277:
                    if (C4263.m12819() >= 0) {
                        int iM6984 = (C2105.m6981("᩹۟") ^ i10) * (-123);
                        i = ((iM6984 ^ i11) * (-30073)) ^ 690931046;
                        i13 = iM6984 ^ 1286745597;
                        i12 = i;
                    } else {
                        c = c;
                        i14 = i14;
                        iM2567 = (C2105.m6981("᩹᩵") + i10) * (-53);
                        i3 = ((iM2567 ^ i11) * (-6753)) ^ (-1886423001);
                        i4 = -163809067;
                        i7 = iM2567 ^ i4;
                        i12 = i3;
                        c = c;
                        i14 = i14;
                        i13 = i7;
                    }
                    break;
                case -915165832:
                case 1175349827:
                    c = c;
                    i14 = i14;
                    C1773.m5907(c18237M7511, str3);
                    C0483.m2120(c18237M7511, c9688.f29298);
                    str2 = c9688.f29297;
                    if (C2105.m6982() == 0) {
                        iM2566 = (i11 - C0630.m2566("ۧۖ")) * 55;
                        i = ((iM2566 ^ i10) * 30133) ^ 1455923409;
                        i2 = 1205934934;
                        int i19 = iM2566 ^ i2;
                        c = c;
                        i14 = i14;
                        i13 = i19;
                        i12 = i;
                    } else {
                        i14 = i14;
                        iM6981 = C2105.m6981("ۧۨ") ^ i10;
                        i6 = ((iM6981 ^ i11) * 27705) ^ 1809722399;
                        i5 = -797422960;
                        i7 = iM6981 ^ i5;
                        i12 = i6;
                        c = c;
                        i13 = i7;
                    }
                    break;
                case -795249028:
                case 1783084901:
                    if (C3245.f10203 <= 0) {
                        i14 = i14;
                        iM6982 = C2105.m6981("ܳ᩶") ^ i11;
                        i8 = ((iM6982 ^ i10) * (-1327)) ^ 861592625;
                        i9 = 1800774857;
                        i13 = iM6982 ^ i9;
                        i12 = i8;
                        i14 = i14;
                    } else {
                        c = c;
                        i14 = i14;
                        iM2567 = (C2105.m6981("᩹᩵") + i10) * (-53);
                        i3 = ((iM2567 ^ i11) * (-6753)) ^ (-1886423001);
                        i4 = -163809067;
                        i7 = iM2567 ^ i4;
                        i12 = i3;
                        c = c;
                        i14 = i14;
                        i13 = i7;
                    }
                    break;
                case -795174936:
                case 1060071903:
                    c = c;
                    i14 = i14;
                    m6339();
                    c18237M7511 = C2272.m7511(4166);
                    if (C11340.f33930 >= 0) {
                        iM2567 = (i11 - C2105.m6981("ۡۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM2567 ^ i10) * (-15279)) ^ (-2001071608);
                        i4 = 1479925862;
                    } else {
                        iM2567 = C0630.m2566("ᩴۜ") ^ i10;
                        i3 = ((iM2567 ^ i11) * 31793) ^ 2054375124;
                        i4 = 1288186948;
                    }
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    c = c;
                    i14 = i14;
                    i13 = i7;
                    break;
                case -753219583:
                case 1531640040:
                    c = c;
                    i14 = i14;
                    if ((s * s2) - i15 <= 0) {
                        iM2567 = (C0630.m2566("᩵ۖ") ^ i10) * 95;
                        i3 = ((iM2567 ^ i11) * 1129) ^ 1611220562;
                        i4 = -1088955371;
                    } else {
                        iM2567 = (i11 - C0630.m2566("ۜܺ")) * 63;
                        i3 = ((iM2567 ^ i10) * (-14883)) ^ 692933762;
                        i4 = -1287964958;
                    }
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    c = c;
                    i14 = i14;
                    i13 = i7;
                    break;
                case -742362493:
                case 1915462597:
                    C15972.m37763(c23881M2437.m52613());
                    return c23881M2437.m52605();
                case -723768397:
                case 1674664610:
                    C2126.m7040();
                    c = c;
                    i14 = i14;
                    iM2567 = (C2105.m6981("᩹᩵") + i10) * (-53);
                    i3 = ((iM2567 ^ i11) * (-6753)) ^ (-1886423001);
                    i4 = -163809067;
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    c = c;
                    i14 = i14;
                    i13 = i7;
                    break;
                case -600496905:
                case 752716602:
                    if (C0964.f3626 != 0) {
                        c = c;
                        i14 = i14;
                        iM2567 = (i11 - C2105.m6981("ۡۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM2567 ^ i10) * (-15279)) ^ (-2001071608);
                        i4 = 1479925862;
                        i7 = iM2567 ^ i4;
                        i12 = i3;
                        c = c;
                        i14 = i14;
                        i13 = i7;
                    } else {
                        int iM6985 = (C2105.m6981("᩹۟") ^ i10) * (-123);
                        i = ((iM6985 ^ i11) * (-30073)) ^ 690931046;
                        i13 = iM6985 ^ 1286745597;
                        i12 = i;
                    }
                    break;
                case -510999776:
                case -313332865:
                    i14 = i14;
                    c = 0;
                    if (C3019.f9544 >= 0) {
                        iM6982 = C2105.m6981("ܳ᩶") ^ i11;
                        i8 = ((iM6982 ^ i10) * (-1327)) ^ 861592625;
                        i9 = 1800774857;
                    } else {
                        iM6982 = (C2105.m6981("᩺ܳ") ^ i11) * 49;
                        i8 = ((iM6982 ^ i10) * 16379) ^ 1579112952;
                        i9 = -1999447102;
                    }
                    i13 = iM6982 ^ i9;
                    i12 = i8;
                    i14 = i14;
                    break;
                case -255996381:
                case 16927180:
                    c = c;
                    i14 = i14;
                    i15 = i14 + 130370724;
                    s2 = 22836;
                    if (C0422.f1886 <= 0) {
                        iM2567 = (C2105.m6981("᩹᩵") + i10) * (-53);
                        i3 = ((iM2567 ^ i11) * (-6753)) ^ (-1886423001);
                        i4 = -163809067;
                    } else {
                        iM2567 = (i10 - C2105.m6981("ۖ᩶")) * (-107);
                        i3 = ((iM2567 ^ i11) * (-26011)) ^ (-1385345278);
                        i4 = -1267029050;
                    }
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    c = c;
                    i14 = i14;
                    i13 = i7;
                    break;
                case 281026788:
                case 1193145976:
                    C4616.m13552();
                    C2105.m6982();
                    return 0;
                case 691035811:
                case 1686863989:
                    c = c;
                    s = sArr[c];
                    i14 = s * s;
                    if (C0714.f2697 >= 0) {
                        iM6981 = C2105.m6981("ۧۨ") ^ i10;
                        i6 = ((iM6981 ^ i11) * 27705) ^ 1809722399;
                        i5 = -797422960;
                    } else {
                        iM6981 = (C0630.m2566("ۢۨ") + i11) * (-39);
                        i6 = ((iM6981 ^ i10) * 25493) ^ (-192412074);
                        i5 = 1132236797;
                    }
                    i7 = iM6981 ^ i5;
                    i12 = i6;
                    c = c;
                    i13 = i7;
                    break;
                case 761096415:
                case 2126506339:
                    i16 = 31960;
                    iM2567 = C0630.m2566("ۡۘ") ^ i11;
                    i3 = ((iM2567 ^ i10) * 4361) ^ 1021980931;
                    i4 = -669103049;
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    c = c;
                    i14 = i14;
                    i13 = i7;
                    break;
                case 912497510:
                case 1284065175:
                    c = c;
                    i14 = i14;
                    C1773.m5907(c18237M7511, c11099.m27532());
                    c23881M2437 = RunnableC0588.m2437(c18237M7511);
                    if (C0483.m2131(c23881M2437)) {
                        iM2566 = (C0630.m2566("۠᩻") ^ i11) * (-63);
                        i = ((iM2566 ^ i10) * (-13019)) ^ (-493351810);
                        i2 = 881500432;
                    } else {
                        iM2566 = C0630.m2566("ۡ۫") ^ i11;
                        i = ((iM2566 ^ i10) * (-3947)) ^ (-1774038631);
                        i2 = -1476916784;
                    }
                    int i110 = iM2566 ^ i2;
                    c = c;
                    i14 = i14;
                    i13 = i110;
                    i12 = i;
                    break;
                default:
                    i16 = 34561;
                    iM2567 = C0630.m2566("ۡۘ") ^ i11;
                    i3 = ((iM2567 ^ i10) * 4361) ^ 1021980931;
                    i4 = -669103049;
                    i7 = iM2567 ^ i4;
                    i12 = i3;
                    c = c;
                    i14 = i14;
                    i13 = i7;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (l.RunnableC1937.m6387() != 0) goto L9;
     */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6344() throws C1637 {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        int iM2566;
        int i5;
        int iM2567;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = C1294.f4556;
        int i11 = C3432.f10845;
        int iM2568 = (C0630.m2566("ۛܿ") ^ i11) * (-79);
        int i12 = ((iM2568 ^ i10) * 11475) ^ 1372865033;
        ArrayList arrayList = null;
        String strM4378 = null;
        int i13 = iM2568 ^ 421106229;
        C23881 c23881M11224 = null;
        int iM52603 = 0;
        int iM52605 = 0;
        short s = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1990130552;
        C16742 c16742 = null;
        int i18 = 0;
        while (true) {
            int i19 = i13 ^ (i12 & (((i17 ^ i10) * 4345) >> 31));
            switch (i19) {
                case -2094645062:
                case 1042564239:
                    i19 = i19;
                    c16742.f51393 = strM4378;
                    c16742.f51397 = ViewOnClickListenerC1958.m6440(c23881M11224);
                    strM4378 = strM4378;
                    s = s;
                    c16742.f51389 = c23881M11224.m52604();
                    if (C22628.f73083 > 0) {
                        iM6981 = (C0630.m2566("ܶۖ") ^ i10) * (-39);
                        i = ((iM6981 ^ i11) * 25339) ^ 1056704062;
                        i2 = -200725108;
                        int i20 = iM6981 ^ i2;
                        strM4378 = strM4378;
                        i12 = i;
                        s = s;
                        i17 = i19;
                        i13 = i20;
                    } else {
                        strM4378 = strM4378;
                        iM52603 = iM52603;
                        s = s;
                        iM6982 = C0630.m2566("۠᩸") ^ i10;
                        i3 = ((iM6982 ^ i11) * 7917) ^ 794578919;
                        i4 = -781658502;
                        i9 = iM6982 ^ i4;
                        i17 = i19;
                        strM4378 = strM4378;
                        i13 = i9;
                        i12 = i3;
                        iM52603 = iM52603;
                    }
                    break;
                case -2003692586:
                case 344839997:
                    ViewOnClickListenerC1958.m6429();
                    C1128.m3851();
                    return;
                case -1906659589:
                case -939977387:
                    if (!C1005.f3721) {
                        int iM2569 = (C0630.m2566("ۜ֡") ^ i11) * 75;
                        i8 = i19;
                        i13 = iM2569 ^ (-1633302324);
                        i12 = ((iM2569 ^ i10) * 19173) ^ (-1036938790);
                        i17 = i8;
                    } else {
                        iM52603 = iM52603;
                        strM4378 = strM4378;
                        i19 = i19;
                        s = s;
                        iM2566 = C2105.m6981("ۢ᩶") ^ i11;
                        i3 = ((iM2566 ^ i10) * 25473) ^ 1630099388;
                        i5 = -1583782975;
                        i9 = iM2566 ^ i5;
                        s = s;
                        i17 = i19;
                        strM4378 = strM4378;
                        i13 = i9;
                        i12 = i3;
                        iM52603 = iM52603;
                    }
                    break;
                case -1817959901:
                case -156954451:
                    i19 = i19;
                    iM52603 = iM52603;
                    strM4378 = strM4378;
                    break;
                case -1797589125:
                case -1289002534:
                    strM4378 = strM4378;
                    i19 = i19;
                    s = s;
                    iM52603 = c23881M11224.m52603();
                    if (iM52603 <= 0) {
                        iM6981 = C2105.m6981("ۘ۠") ^ i10;
                        i = ((iM6981 ^ i11) * (-28351)) ^ (-563965632);
                        i2 = 1839833215;
                    } else {
                        iM6981 = (C2105.m6981("۬᩺") ^ i11) * 13;
                        i = ((iM6981 ^ i10) * (-4627)) ^ (-662800020);
                        i2 = -1427317902;
                    }
                    int i21 = iM6981 ^ i2;
                    strM4378 = strM4378;
                    i12 = i;
                    s = s;
                    i17 = i19;
                    i13 = i21;
                    break;
                case -1730119524:
                case 1337231761:
                    strM4378 = strM4378;
                    i19 = i19;
                    s = s;
                    C15972.m37761(iM52603);
                    C15972.m37745(c23881M11224.m52605());
                    C15972.m37756(c23881M11224.m52605());
                    if (C0483.f2088 < 0) {
                        iM6981 = (i11 - C2105.m6981("ۢ᩵")) * (-87);
                        i = ((iM6981 ^ i10) * (-9621)) ^ 1867120196;
                        i2 = -833767286;
                        int i22 = iM6981 ^ i2;
                        strM4378 = strM4378;
                        i12 = i;
                        s = s;
                        i17 = i19;
                        i13 = i22;
                    } else {
                        strM4378 = strM4378;
                        iM2566 = C2105.m6981("۠۫") ^ i10;
                        i3 = ((iM2566 ^ i11) * (-4617)) ^ 1345064214;
                        i5 = 559072475;
                        i9 = iM2566 ^ i5;
                        s = s;
                        i17 = i19;
                        strM4378 = strM4378;
                        i13 = i9;
                        i12 = i3;
                        iM52603 = iM52603;
                    }
                    break;
                case -1582110433:
                case 404348280:
                    c16742.f51392 = c23881M11224.m52603();
                    C7106.m19117(arrayList, c16742);
                    i18++;
                    iM6981 = (C2105.m6981("᩵ۤ") ^ i10) * 13;
                    i = ((iM6981 ^ i11) * 6361) ^ (-389533078);
                    i2 = -1479988192;
                    int i23 = iM6981 ^ i2;
                    strM4378 = strM4378;
                    i12 = i;
                    s = s;
                    i17 = i19;
                    i13 = i23;
                    break;
                case -1510924442:
                case -781979092:
                    iM52603 = iM52603;
                    strM4378 = strM4378;
                    i19 = i19;
                    s = s;
                    c23881M11224 = C3683.m11224(RunnableC1108.m3787(4164));
                    if (C1773.m5916(c23881M11224)) {
                        iM2566 = C0630.m2566("᩶ۜ") ^ i10;
                        i3 = ((iM2566 ^ i11) * 31593) ^ 620956300;
                        i5 = 471919831;
                    } else {
                        iM2566 = C2105.m6981("֫ܺ") ^ i11;
                        i3 = ((iM2566 ^ i10) * (-389)) ^ 1451890139;
                        i5 = -275661800;
                    }
                    i9 = iM2566 ^ i5;
                    s = s;
                    i17 = i19;
                    strM4378 = strM4378;
                    i13 = i9;
                    i12 = i3;
                    iM52603 = iM52603;
                    break;
                case -1205125481:
                case 1384440385:
                    strM4378 = strM4378;
                    i19 = i19;
                    s = s;
                    C15972.m37765(c23881M11224.m52613());
                    C15972.m37763(c23881M11224.m52613());
                    if (!AbstractC2021.m6574()) {
                        iM6981 = (C2105.m6981("ۙ᩻") + i10) * 87;
                        i = ((iM6981 ^ i11) * 32431) ^ (-406727382);
                        i2 = -1040803901;
                        int i24 = iM6981 ^ i2;
                        strM4378 = strM4378;
                        i12 = i;
                        s = s;
                        i17 = i19;
                        i13 = i24;
                    } else {
                        strM4378 = strM4378;
                        iM2567 = C0630.m2566("ۤܶ") ^ i11;
                        i6 = ((iM2567 ^ i10) * 5105) ^ (-1472138663);
                        i7 = 1232517603;
                        i8 = i19;
                        i13 = iM2567 ^ i7;
                        i12 = i6;
                        s = s;
                        i17 = i8;
                    }
                    break;
                case -1112433848:
                case -9737201:
                    strM4378 = strM4378;
                    i19 = i19;
                    s = s;
                    C15972.m37747(c23881M11224.m52604());
                    C15972.m37749(c23881M11224.m52615());
                    if (C0964.f3626 == 0) {
                        iM6981 = C2105.m6981("᩺֨") ^ i11;
                        i = ((iM6981 ^ i10) * 14927) ^ 374915809;
                        i2 = 1701059181;
                        int i25 = iM6981 ^ i2;
                        strM4378 = strM4378;
                        i12 = i;
                        s = s;
                        i17 = i19;
                        i13 = i25;
                    } else {
                        strM4378 = strM4378;
                        iM2567 = C0630.m2566("ۤܶ") ^ i11;
                        i6 = ((iM2567 ^ i10) * 5105) ^ (-1472138663);
                        i7 = 1232517603;
                        i8 = i19;
                        i13 = iM2567 ^ i7;
                        i12 = i6;
                        s = s;
                        i17 = i8;
                    }
                    break;
                case -1029583524:
                case 2038018007:
                    C15972.m37752();
                    C15972.m37761(iM52603);
                    f6461 = Collections.EMPTY_LIST;
                    iM6981 = C2105.m6981("ۘۚ") ^ i11;
                    i = ((iM6981 ^ i10) * 22765) ^ (-50499102);
                    i2 = 1262064396;
                    int i26 = iM6981 ^ i2;
                    strM4378 = strM4378;
                    i12 = i;
                    s = s;
                    i17 = i19;
                    i13 = i26;
                    break;
                case -713483193:
                case 1581005110:
                    i19 = i19;
                    s = s;
                    c16742.f51390 = ViewOnClickListenerC1958.m6440(c23881M11224);
                    c16742.f51395 = C1294.m4378(c23881M11224);
                    strM4378 = C1294.m4378(c23881M11224);
                    if (C2958.m9034() <= 0) {
                        iM2567 = C0630.m2566("ۤܶ") ^ i11;
                        i6 = ((iM2567 ^ i10) * 5105) ^ (-1472138663);
                        i7 = 1232517603;
                    } else {
                        iM2567 = (C0630.m2566("ܰᩳ") + i11) * (-7);
                        i6 = ((iM2567 ^ i10) * (-13523)) ^ (-776034067);
                        i7 = 844035484;
                    }
                    i8 = i19;
                    i13 = iM2567 ^ i7;
                    i12 = i6;
                    s = s;
                    i17 = i8;
                    break;
                case -595708887:
                case -30600410:
                    f6462 = C15972.m37766();
                    return;
                case -465481717:
                case 1803196297:
                    i16 = 10325;
                    iM2566 = (i10 - C2105.m6981("ᩴۜ")) * (-13);
                    i3 = ((iM2566 ^ i11) * (-21159)) ^ (-1698546237);
                    i5 = -841265227;
                    i9 = iM2566 ^ i5;
                    s = s;
                    i17 = i19;
                    strM4378 = strM4378;
                    i13 = i9;
                    i12 = i3;
                    iM52603 = iM52603;
                    break;
                case -425563179:
                case 129344793:
                    iM52603 = iM52603;
                    strM4378 = strM4378;
                    i19 = i19;
                    s = f6463[128];
                    s2 = 2;
                    if (C0382.m1848()) {
                        iM6982 = C0630.m2566("۠᩸") ^ i10;
                        i3 = ((iM6982 ^ i11) * 7917) ^ 794578919;
                        i4 = -781658502;
                    } else {
                        iM6982 = (C2105.m6981("ܿۡ") + i11) * (-123);
                        i3 = ((iM6982 ^ i10) * 5041) ^ 86637067;
                        i4 = 66697207;
                    }
                    i9 = iM6982 ^ i4;
                    i17 = i19;
                    strM4378 = strM4378;
                    i13 = i9;
                    i12 = i3;
                    iM52603 = iM52603;
                    break;
                case -132143999:
                case -60670439:
                    if (C2272.f7362) {
                        strM4378 = strM4378;
                        i19 = i19;
                        s = s;
                        iM2566 = C2105.m6981("۠۫") ^ i10;
                        i3 = ((iM2566 ^ i11) * (-4617)) ^ 1345064214;
                        i5 = 559072475;
                        i9 = iM2566 ^ i5;
                        s = s;
                        i17 = i19;
                        strM4378 = strM4378;
                        i13 = i9;
                        i12 = i3;
                        iM52603 = iM52603;
                    }
                    iM52603 = iM52603;
                    strM4378 = strM4378;
                    i19 = i19;
                    s = s;
                    iM2566 = C2105.m6981("ۢ᩶") ^ i11;
                    i3 = ((iM2566 ^ i10) * 25473) ^ 1630099388;
                    i5 = -1583782975;
                    i9 = iM2566 ^ i5;
                    s = s;
                    i17 = i19;
                    strM4378 = strM4378;
                    i13 = i9;
                    i12 = i3;
                    iM52603 = iM52603;
                    break;
                case -47099995:
                case 869370119:
                    iM52603 = iM52603;
                    strM4378 = strM4378;
                    i19 = i19;
                    s = s;
                    i14 = s * s2;
                    i15 = 1;
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("ۢ᩶") ^ i11;
                        i3 = ((iM2566 ^ i10) * 25473) ^ 1630099388;
                        i5 = -1583782975;
                    } else {
                        iM2566 = C0630.m2566("ܺᩳ") ^ i10;
                        i3 = ((iM2566 ^ i11) * 10603) ^ 1890857565;
                        i5 = -1881808122;
                    }
                    i9 = iM2566 ^ i5;
                    s = s;
                    i17 = i19;
                    strM4378 = strM4378;
                    i13 = i9;
                    i12 = i3;
                    iM52603 = iM52603;
                    break;
                case 64376621:
                case 1087203805:
                    f6461 = arrayList;
                    iM6981 = C2105.m6981("ۘۚ") ^ i11;
                    i = ((iM6981 ^ i10) * 22765) ^ (-50499102);
                    i2 = 1262064396;
                    int i27 = iM6981 ^ i2;
                    strM4378 = strM4378;
                    i12 = i;
                    s = s;
                    i17 = i19;
                    i13 = i27;
                    break;
                case 177828981:
                case 955665250:
                    strM4378 = strM4378;
                    i19 = i19;
                    s = s;
                    c16742 = new C16742();
                    c16742.f51388 = c23881M11224.m52605();
                    c16742.f51391 = AbstractC2021.m6567();
                    if (RunnableC3474.f10992 > 0) {
                        iM6981 = C2105.m6981("ۜۜ") ^ i10;
                        i = ((iM6981 ^ i11) * 31695) ^ 541335964;
                        i2 = -248228707;
                        int i28 = iM6981 ^ i2;
                        strM4378 = strM4378;
                        i12 = i;
                        s = s;
                        i17 = i19;
                        i13 = i28;
                    } else {
                        strM4378 = strM4378;
                        iM52603 = iM52603;
                        s = s;
                        iM6982 = C0630.m2566("۠᩸") ^ i10;
                        i3 = ((iM6982 ^ i11) * 7917) ^ 794578919;
                        i4 = -781658502;
                        i9 = iM6982 ^ i4;
                        i17 = i19;
                        strM4378 = strM4378;
                        i13 = i9;
                        i12 = i3;
                        iM52603 = iM52603;
                    }
                    break;
                case 551399252:
                case 971621623:
                    iM52603 = iM52603;
                    strM4378 = strM4378;
                    i19 = i19;
                    s = s;
                    int i29 = s + 1;
                    if ((i29 * i29) - (i14 + i15) >= 0) {
                        iM2566 = (i11 - C0630.m2566("ܰۜ")) * 3;
                        i3 = ((iM2566 ^ i10) * (-12149)) ^ (-1403825641);
                        i5 = -75812737;
                    } else {
                        iM2566 = (C0630.m2566("۟ۡ") ^ i10) * (-55);
                        i3 = ((iM2566 ^ i11) * 18419) ^ (-1723976086);
                        i5 = 1281226529;
                    }
                    i9 = iM2566 ^ i5;
                    s = s;
                    i17 = i19;
                    strM4378 = strM4378;
                    i13 = i9;
                    i12 = i3;
                    iM52603 = iM52603;
                    break;
                case 601164290:
                case 1147078388:
                    strM4378 = strM4378;
                    i19 = i19;
                    s = s;
                    if (i18 < iM52605) {
                        iM6981 = (C2105.m6981("ۙۨ") ^ i11) * (-5);
                        i = ((iM6981 ^ i10) * 29135) ^ 1969806589;
                        i2 = 1315910847;
                    } else {
                        iM6981 = C2105.m6981("ۗܶ") ^ i10;
                        i = ((iM6981 ^ i11) * 30341) ^ (-759368740);
                        i2 = -1394728391;
                    }
                    int i210 = iM6981 ^ i2;
                    strM4378 = strM4378;
                    i12 = i;
                    s = s;
                    i17 = i19;
                    i13 = i210;
                    break;
                case 620778321:
                case 2120257481:
                    i19 = i19;
                    C4075.m12263();
                    C2958.m9034();
                    iM52603 = iM52603;
                    strM4378 = strM4378;
                    s = s;
                    iM2566 = C2105.m6981("ۢ᩶") ^ i11;
                    i3 = ((iM2566 ^ i10) * 25473) ^ 1630099388;
                    i5 = -1583782975;
                    i9 = iM2566 ^ i5;
                    s = s;
                    i17 = i19;
                    strM4378 = strM4378;
                    i13 = i9;
                    i12 = i3;
                    iM52603 = iM52603;
                    break;
                case 695049968:
                case 741136833:
                    i16 = 13275;
                    iM2566 = (i10 - C2105.m6981("ᩴۜ")) * (-13);
                    i3 = ((iM2566 ^ i11) * (-21159)) ^ (-1698546237);
                    i5 = -841265227;
                    i9 = iM2566 ^ i5;
                    s = s;
                    i17 = i19;
                    strM4378 = strM4378;
                    i13 = i9;
                    i12 = i3;
                    iM52603 = iM52603;
                    break;
                case 1518686687:
                case 1592202848:
                    i19 = i19;
                    s = s;
                    C15972.m37752();
                    short[] sArr = f6463;
                    strM4378 = strM4378;
                    if (C11340.f33930 < 0) {
                        String strM6385 = RunnableC1937.m6385(sArr, 129, 3, i16);
                        if (RunnableC3474.f10992 > 0) {
                            throw new C1637(AbstractC2021.m6563(c23881M11224, C2105.m6981(strM6385) ^ 2102150940));
                        }
                        iM2566 = C2105.m6981("۠۫") ^ i10;
                        i3 = ((iM2566 ^ i11) * (-4617)) ^ 1345064214;
                        i5 = 559072475;
                        i9 = iM2566 ^ i5;
                        s = s;
                        i17 = i19;
                        strM4378 = strM4378;
                        i13 = i9;
                        i12 = i3;
                        iM52603 = iM52603;
                    } else {
                        iM52603 = iM52603;
                        iM2566 = C2105.m6981("ۢ᩶") ^ i11;
                        i3 = ((iM2566 ^ i10) * 25473) ^ 1630099388;
                        i5 = -1583782975;
                        i9 = iM2566 ^ i5;
                        s = s;
                        i17 = i19;
                        strM4378 = strM4378;
                        i13 = i9;
                        i12 = i3;
                        iM52603 = iM52603;
                    }
                    break;
                default:
                    iM52605 = c23881M11224.m52605();
                    arrayList = new ArrayList(iM52605);
                    i18 = 0;
                    iM6981 = (C2105.m6981("᩵ۤ") ^ i10) * 13;
                    i = ((iM6981 ^ i11) * 6361) ^ (-389533078);
                    i2 = -1479988192;
                    int i211 = iM6981 ^ i2;
                    strM4378 = strM4378;
                    i12 = i;
                    s = s;
                    i17 = i19;
                    i13 = i211;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m6343() {
        return f6461;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x015a A[PHI: r4 r5 r6 r8 r10 r11 r15
      0x015a: PHI (r4v12 java.lang.String[]) = (r4v11 java.lang.String[]), (r4v1 java.lang.String[]), (r4v1 java.lang.String[]) binds: [B:39:0x0158, B:26:0x00cb, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r5v26 java.lang.String) = (r5v25 java.lang.String), (r5v1 java.lang.String), (r5v1 java.lang.String) binds: [B:39:0x0158, B:26:0x00cb, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r6v3 char) = (r6v2 char), (r6v1 char), (r6v1 char) binds: [B:39:0x0158, B:26:0x00cb, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r8v3 java.lang.String) = (r8v1 java.lang.String), (r8v2 java.lang.String), (r8v1 java.lang.String) binds: [B:39:0x0158, B:26:0x00cb, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:39:0x0158, B:26:0x00cb, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:39:0x0158, B:26:0x00cb, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r15v3 short[]) = (r15v1 short[]), (r15v2 short[]), (r15v1 short[]) binds: [B:39:0x0158, B:26:0x00cb, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (l.C21923.f70183 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (l.C0714.f2697 >= 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] m6341(AbstractC15440 abstractC15440, String str) throws C1637 {
        int iM2566;
        int i;
        int i2;
        String str2;
        short s;
        int iM6981;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        byte[] bArrDigest = null;
        int i7 = 0;
        C23881 c23881M11224 = null;
        String[] strArr = null;
        String strM6440 = null;
        char c = 0;
        char c2 = 0;
        String str3 = null;
        String strM11162 = null;
        int i8 = 0;
        short[] sArr = null;
        int i9 = -931434071;
        int i10 = C1420.f5096;
        int i11 = C2958.f9394;
        int iM2568 = C0630.m2566("ۢ۟") ^ i10;
        int i12 = ((iM2568 ^ i11) * (-22785)) ^ (-522786438);
        int i13 = iM2568 ^ (-592633015);
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i14 = 0;
        int i15 = 0;
        char c3 = 0;
        short s2 = 0;
        MessageDigest messageDigest = null;
        int i16 = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-15057)) >> 31));
            switch (i9) {
                case -2133520955:
                case 950970359:
                    i8 = 1559;
                    iM2566 = C0630.m2566("ۛ֫") ^ i10;
                    i = ((iM2566 ^ i11) * (-16739)) ^ (-866266337);
                    i2 = -1897478983;
                    strArr = strArr;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    strM6440 = strM6440;
                    break;
                case -2052036909:
                case -1245920996:
                    strArr[c] = strM6440;
                    c2 = 1;
                    if (C7106.m19120() > 0) {
                        int iM2569 = C0630.m2566("ܶ֨") ^ i10;
                        i3 = ((iM2569 ^ i11) * 26675) ^ 951646795;
                        i6 = iM2569 ^ (-22609);
                        i13 = i6;
                        i12 = i3;
                    } else {
                        strArr = strArr;
                        strM6440 = strM6440;
                        iM2566 = C0630.m2566("ܳۙ") ^ i11;
                        i = ((iM2566 ^ i10) * (-10235)) ^ 2028496950;
                        i2 = 2092939256;
                        strArr = strArr;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                        strM6440 = strM6440;
                    }
                    break;
                case -1998107885:
                case -646085244:
                    strArr = strArr;
                    strM6440 = strM6440;
                    s2 = sArr2[c3];
                    i16 = s2 * s2;
                    if (C4159.m12565() >= 0) {
                        iM2566 = C0630.m2566("ܳۙ") ^ i11;
                        i = ((iM2566 ^ i10) * (-10235)) ^ 2028496950;
                        i2 = 2092939256;
                    } else {
                        iM2566 = (C0630.m2566("ܰܳ") ^ i11) * (-103);
                        i = ((iM2566 ^ i10) * 28197) ^ 1002785734;
                        i2 = -2002397303;
                    }
                    strArr = strArr;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    strM6440 = strM6440;
                    break;
                case -1986773375:
                case -1137338103:
                    strArr[c2] = C1294.m4378(c23881M11224);
                    strArr[2] = Base64.encodeToString(bArrDigest, 2);
                    if (f6462) {
                        iM2567 = (i10 - C2105.m6981("ۗۡ")) * (-73);
                        i3 = ((iM2567 ^ i11) * 19269) ^ 1563326907;
                        i5 = -1968726109;
                    } else {
                        iM2567 = C0630.m2566("ܺۚ") ^ i11;
                        i3 = ((iM2567 ^ i10) * 22095) ^ (-1733588335);
                        i5 = 623731894;
                    }
                    i13 = iM2567 ^ i5;
                    i12 = i3;
                    break;
                case -1986163863:
                case -553232314:
                    RunnableC1937.m6387();
                    if (!C1916.f6442) {
                        iM2567 = C0630.m2566("ۤۨ") ^ i10;
                        i3 = ((iM2567 ^ i11) * (-19183)) ^ 297544994;
                        i5 = -1951240998;
                        i13 = iM2567 ^ i5;
                        i12 = i3;
                    } else {
                        strArr = strArr;
                        iM2566 = (C2105.m6981("ۛᩴ") ^ i10) * 93;
                        i = ((iM2566 ^ i11) * (-115)) ^ (-410205648);
                        i2 = 279309623;
                        strArr = strArr;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                        strM6440 = strM6440;
                    }
                    break;
                case -1772676035:
                case -503427110:
                    i8 = 5161;
                    iM2566 = C0630.m2566("ۛ֫") ^ i10;
                    i = ((iM2566 ^ i11) * (-16739)) ^ (-866266337);
                    i2 = -1897478983;
                    strArr = strArr;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    strM6440 = strM6440;
                    break;
                case -1620630304:
                case 731732312:
                    strArr = strArr;
                    str2 = strM6440;
                    s = s2;
                    sArr2 = f6463;
                    c3 = '\f';
                    if (C3911.f12484 >= 0) {
                        iM6981 = C0630.m2566("ܽᩴ") ^ i11;
                        i3 = ((iM6981 ^ i10) * 22053) ^ 1945394435;
                        i4 = -2052838875;
                    } else {
                        iM6981 = (C2105.m6981("֨ۖ") ^ i10) * (-17);
                        i3 = ((iM6981 ^ i11) * 10485) ^ (-160301966);
                        i4 = -144048715;
                    }
                    i6 = iM6981 ^ i4;
                    s2 = s;
                    strArr = strArr;
                    strM6440 = str2;
                    i13 = i6;
                    i12 = i3;
                    break;
                case -1552739968:
                case -332455013:
                    strArr = strArr;
                    strM6440 = strM6440;
                    C18237 c18237M3787 = RunnableC1108.m3787(i7);
                    c18237M3787.m42487(bArrDigest);
                    C1773.m5907(c18237M3787, str);
                    c23881M11224 = C3683.m11224(c18237M3787);
                    if (C1773.m5916(c23881M11224)) {
                        iM2566 = C2105.m6981("ۡ᩻") ^ i10;
                        i = ((iM2566 ^ i11) * (-9843)) ^ (-2021550551);
                        i2 = -134354085;
                    } else {
                        iM2566 = (C2105.m6981("ۘ᩵") ^ i11) * 63;
                        i = ((iM2566 ^ i10) * (-25829)) ^ 1111606602;
                        i2 = 1999661930;
                    }
                    strArr = strArr;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    strM6440 = strM6440;
                    break;
                case -1538089043:
                case 295012823:
                    strArr = strArr;
                    strM6440 = strM6440;
                    bArrDigest = messageDigest.digest();
                    i7 = 4165;
                    if (C4159.f13567) {
                        iM2566 = (C2105.m6981("֡۟") ^ i10) * (-127);
                        i = ((iM2566 ^ i11) * 10013) ^ (-989581678);
                        i2 = -35645366;
                    } else {
                        iM2566 = (C2105.m6981("ۛᩴ") ^ i10) * 93;
                        i = ((iM2566 ^ i11) * (-115)) ^ (-410205648);
                        i2 = 279309623;
                    }
                    strArr = strArr;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    strM6440 = strM6440;
                    break;
                case -1328511570:
                case -20495320:
                    break;
                case -1271406731:
                case 1918567865:
                    strArr = new String[3];
                    strM6440 = ViewOnClickListenerC1958.m6440(c23881M11224);
                    c = 0;
                    if (C1773.m5908() <= 0) {
                        iM2567 = C2105.m6981("ۘᩴ") ^ i11;
                        i3 = ((iM2567 ^ i10) * 5891) ^ (-318672475);
                        i5 = 1314161727;
                    } else {
                        iM2567 = C0630.m2566("ۙܰ") ^ i11;
                        i3 = ((iM2567 ^ i10) * 31237) ^ (-1163187317);
                        i5 = 1888642867;
                    }
                    i13 = iM2567 ^ i5;
                    i12 = i3;
                    break;
                case -1149849548:
                case 1144378956:
                    break;
                case -978314029:
                case -887342796:
                    strM11162 = C3663.m11162(sArr, i14, i15, i8);
                    sArr3 = f6463;
                    if (C3432.f10845 < 0) {
                        iM2567 = C0630.m2566("᩺ۢ") ^ i10;
                        i3 = ((iM2567 ^ i11) * 18557) ^ 1294168193;
                        i5 = 1029130761;
                        i13 = iM2567 ^ i5;
                        i12 = i3;
                    }
                    strArr = strArr;
                    str2 = strM6440;
                    s = s2;
                    iM6981 = C0630.m2566("ܽᩴ") ^ i11;
                    i3 = ((iM6981 ^ i10) * 22053) ^ 1945394435;
                    i4 = -2052838875;
                    i6 = iM6981 ^ i4;
                    s2 = s;
                    strArr = strArr;
                    strM6440 = str2;
                    i13 = i6;
                    i12 = i3;
                    break;
                case -931632182:
                case 894725663:
                    C22628.m50615();
                    C4263.m12819();
                    strArr = strArr;
                    str2 = strM6440;
                    s = s2;
                    iM6981 = C0630.m2566("ܽᩴ") ^ i11;
                    i3 = ((iM6981 ^ i10) * 22053) ^ 1945394435;
                    i4 = -2052838875;
                    i6 = iM6981 ^ i4;
                    s2 = s;
                    strArr = strArr;
                    strM6440 = str2;
                    i13 = i6;
                    i12 = i3;
                    break;
                case -852703971:
                case 624582213:
                    strArr = strArr;
                    strM6440 = strM6440;
                    m6339();
                    MessageDigest messageDigestM34526 = C14460.m34526();
                    C14460.m34527(messageDigestM34526, C1420.m4910(abstractC15440));
                    if (RunnableC1108.f4040) {
                        int iM25610 = C0630.m2566("ۡ۠") ^ i11;
                        messageDigest = messageDigestM34526;
                        i12 = ((iM25610 ^ i10) * (-24059)) ^ (-1533337610);
                        strArr = strArr;
                        i13 = iM25610 ^ 1366333733;
                    } else {
                        messageDigest = messageDigestM34526;
                        iM2566 = C0630.m2566("ܳۙ") ^ i11;
                        i = ((iM2566 ^ i10) * (-10235)) ^ 2028496950;
                        i2 = 2092939256;
                        strArr = strArr;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                    }
                    strM6440 = strM6440;
                    break;
                case -804300607:
                case -413072547:
                    return strArr;
                case -677611523:
                case 573709147:
                    strArr = strArr;
                    str2 = strM6440;
                    s = s2;
                    if ((i16 + 23251684) - (s * 9644) >= 0) {
                        iM6981 = (C2105.m6981("ۨۘ") ^ i11) * (-65);
                        i3 = ((iM6981 ^ i10) * (-13945)) ^ 1200133033;
                        i4 = 1116295708;
                    } else {
                        iM6981 = (C0630.m2566("ۜۘ") + i10) * 69;
                        i3 = ((iM6981 ^ i11) * 24993) ^ (-1733115200);
                        i4 = -742438035;
                    }
                    i6 = iM6981 ^ i4;
                    s2 = s;
                    strArr = strArr;
                    strM6440 = str2;
                    i13 = i6;
                    i12 = i3;
                    break;
                case -27573120:
                case 609920284:
                    short[] sArr4 = f6463;
                    strArr = strArr;
                    if (AbstractC2021.f6743 > 0) {
                        String strM13542 = C4616.m13542(sArr4, 13, 3, i8);
                        if (C3432.f10845 < 0) {
                            throw new C1637(AbstractC2021.m6563(c23881M11224, C2105.m6981(strM13542) ^ 2100340172));
                        }
                        iM2566 = (C2105.m6981("ۛᩴ") ^ i10) * 93;
                        i = ((iM2566 ^ i11) * (-115)) ^ (-410205648);
                        i2 = 279309623;
                        strArr = strArr;
                        i13 = iM2566 ^ i2;
                        i12 = i;
                        strM6440 = strM6440;
                    } else {
                        str2 = strM6440;
                        s = s2;
                        iM6981 = C0630.m2566("ܽᩴ") ^ i11;
                        i3 = ((iM6981 ^ i10) * 22053) ^ 1945394435;
                        i4 = -2052838875;
                        i6 = iM6981 ^ i4;
                        s2 = s;
                        strArr = strArr;
                        strM6440 = str2;
                        i13 = i6;
                        i12 = i3;
                    }
                    break;
                case 566382629:
                case 1085833483:
                    str3 = strArr[c];
                    sArr = f6463;
                    i14 = 16;
                    i15 = 16;
                    if (C3019.f9544 >= 0) {
                        iM2567 = C2105.m6981("ۘᩴ") ^ i11;
                        i3 = ((iM2567 ^ i10) * 5891) ^ (-318672475);
                        i5 = 1314161727;
                    } else {
                        iM2567 = (C2105.m6981("ܿۜ") + i11) * 71;
                        i3 = ((iM2567 ^ i10) * 3867) ^ 108423023;
                        i5 = 962252639;
                    }
                    i13 = iM2567 ^ i5;
                    i12 = i3;
                    break;
                case 1256613835:
                case 2124327477:
                    strArr[c] = RunnableC0588.m2443(str3, strM11162, C1711.m5726(sArr3, 32, 38, i8));
                    iM2567 = C0630.m2566("ܺۚ") ^ i11;
                    i3 = ((iM2567 ^ i10) * 22095) ^ (-1733588335);
                    i5 = 623731894;
                    i13 = iM2567 ^ i5;
                    i12 = i3;
                    break;
                default:
                    C0714.m2805();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m6342(C16742 c16742) throws C1637 {
        int iM2566;
        int i;
        int i2;
        C18237 c18237;
        int iM6981;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        short[] sArr;
        int i7;
        int i8;
        int i9 = 0;
        int iM2567 = 0;
        C18237 c18237M7511 = null;
        int i10 = 0;
        C23881 c23881M11224 = null;
        String[] strArr = null;
        char c = 0;
        String str = null;
        String strM12355 = null;
        int i11 = -469793566;
        int i12 = RunnableC3474.f10992;
        int i13 = RunnableC0588.f2309;
        int iM6983 = (i12 - C2105.m6981("᩻ۤ")) * 59;
        int i14 = ((iM6983 ^ i13) * (-27409)) ^ (-666550677);
        int i15 = iM6983 ^ (-1554646890);
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c2 = 0;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        short s2 = 0;
        int i21 = 0;
        boolean zM37751 = false;
        int i22 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-22757)) >> 31));
            switch (i11) {
                case -1987436487:
                case 764408495:
                    C18237 c18238 = c18237M7511;
                    sArr = sArr3;
                    i7 = i9;
                    i8 = 71;
                    i22 = 3;
                    if (C0382.f1805) {
                        int iM6984 = C2105.m6981("ۡܶ") ^ i13;
                        i14 = ((iM6984 ^ i12) * 30891) ^ 1867227819;
                        c18237M7511 = c18238;
                        i15 = iM6984 ^ 1570874789;
                        i9 = i7;
                        sArr3 = sArr;
                        i21 = 71;
                    } else {
                        c18237M7511 = c18238;
                        int iM2568 = C0630.m2566("ܰۘ") ^ i12;
                        i5 = ((iM2568 ^ i13) * (-21069)) ^ 1610772459;
                        i15 = iM2568 ^ (-1514402990);
                        i9 = i7;
                        sArr3 = sArr;
                        i21 = i8;
                        i14 = i5;
                    }
                    break;
                case -1978733950:
                case 1986577768:
                    c18237M7511 = C2272.m7511(4169);
                    i10 = c16742.f51388;
                    if (C3746.m11369() >= 0) {
                        i8 = i21;
                        sArr = sArr3;
                        i7 = i9;
                        int iM2569 = C0630.m2566("ܰۘ") ^ i12;
                        i5 = ((iM2569 ^ i13) * (-21069)) ^ 1610772459;
                        i15 = iM2569 ^ (-1514402990);
                        i9 = i7;
                        sArr3 = sArr;
                        i21 = i8;
                        i14 = i5;
                    } else {
                        int iM6985 = C2105.m6981("ܳۛ") ^ i12;
                        i14 = ((iM6985 ^ i13) * (-29491)) ^ (-1733130123);
                        i15 = iM6985 ^ 1474895009;
                    }
                    break;
                case -1973345364:
                case 1248486346:
                    strArr[c] = C3683.m11219(str, strM12355, C7106.m19110(sArr5, 90, 38, i16));
                    iM6982 = C0630.m2566("۫ܺ") ^ i13;
                    i5 = ((iM6982 ^ i12) * 14349) ^ 1694286674;
                    i6 = 1165569755;
                    i15 = iM6982 ^ i6;
                    i14 = i5;
                    break;
                case -1966227964:
                case -1686634987:
                    c18237M7511 = c18237M7511;
                    i21 = i21;
                    i22 = i22;
                    sArr3 = sArr3;
                    i9 = i9;
                    if (i20 - (s * s2) < 0) {
                        iM2566 = C0630.m2566("ܳܺ") ^ i12;
                        i = ((iM2566 ^ i13) * (-10975)) ^ 97333339;
                        i2 = -908581975;
                    } else {
                        iM2566 = C0630.m2566("ۘ֫") ^ i13;
                        i = ((iM2566 ^ i12) * 25877) ^ (-453351689);
                        i2 = -968237309;
                    }
                    int i23 = iM2566 ^ i2;
                    i22 = i22;
                    c18237 = c18237M7511;
                    i15 = i23;
                    i14 = i;
                    i9 = i9;
                    sArr3 = sArr3;
                    i21 = i21;
                    c18237M7511 = c18237;
                    break;
                case -1957547512:
                case -1876526218:
                    throw new C1637(AbstractC2021.m6563(new C23881(i9), iM2567));
                case -1518319923:
                case -276592213:
                    str = strArr[c];
                    sArr4 = f6463;
                    i18 = 74;
                    i17 = 16;
                    if (C5695.m16023() >= 0) {
                        iM6982 = C0630.m2566("ۢ֫") ^ i13;
                        i5 = ((iM6982 ^ i12) * 5569) ^ 358839142;
                        i6 = 593646069;
                    } else {
                        iM6982 = (i13 - C2105.m6981("۠ۙ")) * (-87);
                        i5 = ((iM6982 ^ i12) * (-25969)) ^ (-1898315353);
                        i6 = 1776146300;
                    }
                    i15 = iM6982 ^ i6;
                    i14 = i5;
                    break;
                case -1481280601:
                case -1366044904:
                    C3683.m11222();
                    AbstractC2021.m6574();
                    c18237M7511 = c18237M7511;
                    i21 = i21;
                    i22 = i22;
                    int iM25610 = C0630.m2566("᩶ۨ") ^ i13;
                    i22 = i22;
                    c18237 = c18237M7511;
                    i15 = iM25610 ^ 1440157352;
                    i14 = ((iM25610 ^ i12) * 22059) ^ (-1822570692);
                    i9 = i9;
                    i21 = i21;
                    c18237M7511 = c18237;
                    break;
                case -1473116061:
                case 1449153085:
                    i16 = 2364;
                    iM2566 = (C0630.m2566("ܿܽ") + i13) * (-121);
                    i = ((iM2566 ^ i12) * 16601) ^ (-487030842);
                    i2 = 469847603;
                    int i24 = iM2566 ^ i2;
                    i22 = i22;
                    c18237 = c18237M7511;
                    i15 = i24;
                    i14 = i;
                    i9 = i9;
                    sArr3 = sArr3;
                    i21 = i21;
                    c18237M7511 = c18237;
                    break;
                case -1328335447:
                case -1000700289:
                    c18237M7511 = c18237M7511;
                    short[] sArr6 = sArr3;
                    i21 = i21;
                    i22 = i22;
                    iM2567 = C0630.m2566(C3746.m11357(sArr6, i21, i22, i16)) ^ 2099059604;
                    if (zM37751) {
                        sArr3 = sArr6;
                        iM2566 = (C2105.m6981("ۡۢ") + i12) * 47;
                        i9 = i9;
                        i = ((iM2566 ^ i13) * (-31197)) ^ 587469161;
                        i2 = 1897275098;
                        int i25 = iM2566 ^ i2;
                        i22 = i22;
                        c18237 = c18237M7511;
                        i15 = i25;
                        i14 = i;
                        i9 = i9;
                        sArr3 = sArr3;
                        i21 = i21;
                        c18237M7511 = c18237;
                    } else {
                        int iM6986 = C2105.m6981("ۤ᩵") ^ i13;
                        i14 = ((iM6986 ^ i12) * 26403) ^ (-313495755);
                        i22 = i22;
                        i21 = i21;
                        c18237M7511 = c18237M7511;
                        i15 = iM6986 ^ 1916974871;
                        sArr3 = sArr6;
                    }
                    break;
                case -1164348077:
                case -765157762:
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = C2105.m6981("ܺܺ") ^ i12;
                        i3 = ((iM6981 ^ i13) * 28859) ^ 192224137;
                        i4 = -814094859;
                        c18237 = c18237M7511;
                        i15 = iM6981 ^ i4;
                        i14 = i3;
                        c18237M7511 = c18237;
                    }
                    c18237M7511 = c18237M7511;
                    i21 = i21;
                    i22 = i22;
                    int iM25611 = C0630.m2566("᩶ۨ") ^ i13;
                    i22 = i22;
                    c18237 = c18237M7511;
                    i15 = iM25611 ^ 1440157352;
                    i14 = ((iM25611 ^ i12) * 22059) ^ (-1822570692);
                    i9 = i9;
                    i21 = i21;
                    c18237M7511 = c18237;
                    break;
                case -1032123814:
                case -45821864:
                    strM12355 = C4117.m12355(sArr4, i18, i17, i16);
                    sArr5 = f6463;
                    if (!C3683.m11222()) {
                        iM6982 = C2105.m6981("ۗۛ") ^ i12;
                        i5 = ((iM6982 ^ i13) * 2331) ^ 186181156;
                        i6 = 729838723;
                        i15 = iM6982 ^ i6;
                        i14 = i5;
                    }
                    i8 = i21;
                    sArr = sArr3;
                    i7 = i9;
                    int iM25612 = C0630.m2566("ܰۘ") ^ i12;
                    i5 = ((iM25612 ^ i13) * (-21069)) ^ 1610772459;
                    i15 = iM25612 ^ (-1514402990);
                    i9 = i7;
                    sArr3 = sArr;
                    i21 = i8;
                    i14 = i5;
                    break;
                case -1000987817:
                case 265937250:
                    C2167.m7155();
                    if (C0237.f1507 == 0) {
                        iM6982 = C2105.m6981("ܺۤ") ^ i12;
                        i5 = ((iM6982 ^ i13) * (-21819)) ^ (-1604375766);
                        i6 = 132385466;
                        i15 = iM6982 ^ i6;
                        i14 = i5;
                    } else {
                        c18237M7511 = c18237M7511;
                        i21 = i21;
                        i22 = i22;
                        int iM25613 = C0630.m2566("᩶ۨ") ^ i13;
                        i22 = i22;
                        c18237 = c18237M7511;
                        i15 = iM25613 ^ 1440157352;
                        i14 = ((iM25613 ^ i12) * 22059) ^ (-1822570692);
                        i9 = i9;
                        i21 = i21;
                        c18237M7511 = c18237;
                    }
                    break;
                case -941202888:
                case 171617541:
                    throw new C1637(RunnableC3474.m10631(c23881M11224, iM2567));
                case -869283275:
                case -445667815:
                    C4075.m12263();
                    C1047.m3599();
                    return null;
                case -792112467:
                case 1605564799:
                    i16 = 15691;
                    iM2566 = (C0630.m2566("ܿܽ") + i13) * (-121);
                    i = ((iM2566 ^ i12) * 16601) ^ (-487030842);
                    i2 = 469847603;
                    int i26 = iM2566 ^ i2;
                    i22 = i22;
                    c18237 = c18237M7511;
                    i15 = i26;
                    i14 = i;
                    i9 = i9;
                    sArr3 = sArr3;
                    i21 = i21;
                    c18237M7511 = c18237;
                    break;
                case -677665316:
                case 856385306:
                    c18237M7511 = c18237M7511;
                    i21 = i21;
                    i22 = i22;
                    sArr3 = sArr3;
                    i9 = i9;
                    sArr2 = f6463;
                    c2 = 'F';
                    if (C4117.f13076 > 0) {
                        iM2566 = C0630.m2566("ۨ۬") ^ i12;
                        i = ((iM2566 ^ i13) * 5347) ^ (-437718280);
                        i2 = -1981634145;
                        int i27 = iM2566 ^ i2;
                        i22 = i22;
                        c18237 = c18237M7511;
                        i15 = i27;
                        i14 = i;
                        i9 = i9;
                        sArr3 = sArr3;
                        i21 = i21;
                        c18237M7511 = c18237;
                    }
                    i9 = i9;
                    sArr3 = sArr3;
                    int iM25614 = C0630.m2566("᩶ۨ") ^ i13;
                    i22 = i22;
                    c18237 = c18237M7511;
                    i15 = iM25614 ^ 1440157352;
                    i14 = ((iM25614 ^ i12) * 22059) ^ (-1822570692);
                    i9 = i9;
                    i21 = i21;
                    c18237M7511 = c18237;
                    break;
                case -595456805:
                case 1026149440:
                    return strArr;
                case -402081482:
                case 1400054172:
                    c18237M7511 = c18237M7511;
                    i21 = i21;
                    i22 = i22;
                    sArr3 = sArr3;
                    i9 = i9;
                    s = sArr2[c2];
                    i19 = s * s;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2566 = C2105.m6981("᩵۬") ^ i13;
                        i = ((iM2566 ^ i12) * 23831) ^ (-1235508453);
                        i2 = -808220988;
                        int i28 = iM2566 ^ i2;
                        i22 = i22;
                        c18237 = c18237M7511;
                        i15 = i28;
                        i14 = i;
                        i9 = i9;
                        sArr3 = sArr3;
                        i21 = i21;
                        c18237M7511 = c18237;
                    }
                    i9 = i9;
                    sArr3 = sArr3;
                    int iM25615 = C0630.m2566("᩶ۨ") ^ i13;
                    i22 = i22;
                    c18237 = c18237M7511;
                    i15 = iM25615 ^ 1440157352;
                    i14 = ((iM25615 ^ i12) * 22059) ^ (-1822570692);
                    i9 = i9;
                    i21 = i21;
                    c18237M7511 = c18237;
                    break;
                case -340150103:
                case 158005765:
                    c18237M7511 = c18237M7511;
                    if (C15972.m37767()) {
                        iM6981 = (i13 - C2105.m6981("ܽ۫")) * 43;
                        i3 = ((iM6981 ^ i12) * (-21747)) ^ (-111937600);
                        i4 = 770937141;
                    } else {
                        iM6981 = (C0630.m2566("۬᩸") ^ i12) * (-105);
                        i3 = ((iM6981 ^ i13) * 17359) ^ 331939522;
                        i4 = -1601837921;
                    }
                    c18237 = c18237M7511;
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    c18237M7511 = c18237;
                    break;
                case -253851266:
                case 900530192:
                    if (C2105.f7037 == 0) {
                        throw new C1637(AbstractC2021.m6563(new C23881(1702), iM2567));
                    }
                    iM6981 = C2105.m6981("ܺܺ") ^ i12;
                    i3 = ((iM6981 ^ i13) * 28859) ^ 192224137;
                    i4 = -814094859;
                    c18237 = c18237M7511;
                    i15 = iM6981 ^ i4;
                    i14 = i3;
                    c18237M7511 = c18237;
                    break;
                case 100778749:
                case 350723076:
                    strArr[1] = C1294.m4378(c23881M11224);
                    if (f6462) {
                        iM6982 = C0630.m2566("֫ᩳ") ^ i12;
                        i5 = ((iM6982 ^ i13) * 25645) ^ (-367343612);
                        i6 = -999669432;
                    } else {
                        iM6982 = C0630.m2566("۫ܺ") ^ i13;
                        i5 = ((iM6982 ^ i12) * 14349) ^ 1694286674;
                        i6 = 1165569755;
                    }
                    i15 = iM6982 ^ i6;
                    i14 = i5;
                    break;
                case 778300511:
                case 1712202237:
                    RunnableC1108.m3790();
                    if (C2958.f9394 >= 0) {
                        iM6982 = C0630.m2566("ۢ֫") ^ i13;
                        i5 = ((iM6982 ^ i12) * 5569) ^ 358839142;
                        i6 = 593646069;
                        i15 = iM6982 ^ i6;
                        i14 = i5;
                    } else {
                        c18237M7511 = c18237M7511;
                        i21 = i21;
                        i22 = i22;
                        int iM25616 = C0630.m2566("᩶ۨ") ^ i13;
                        i22 = i22;
                        c18237 = c18237M7511;
                        i15 = iM25616 ^ 1440157352;
                        i14 = ((iM25616 ^ i12) * 22059) ^ (-1822570692);
                        i9 = i9;
                        i21 = i21;
                        c18237M7511 = c18237;
                    }
                    break;
                case 906180356:
                case 1015282547:
                    c18237M7511.m42490(i10);
                    c23881M11224 = C3683.m11224(c18237M7511);
                    if (C1773.m5916(c23881M11224)) {
                        iM6982 = C0630.m2566("ܶܳ") ^ i12;
                        i5 = ((iM6982 ^ i13) * 3169) ^ (-599933417);
                        i6 = 189700219;
                    } else {
                        iM6982 = (C0630.m2566("᩵֡") ^ i13) * 81;
                        i5 = ((iM6982 ^ i12) * 30539) ^ 1492679511;
                        i6 = -1114871722;
                    }
                    i15 = iM6982 ^ i6;
                    i14 = i5;
                    break;
                case 916164740:
                case 1445675644:
                    c18237M7511 = c18237M7511;
                    i21 = i21;
                    i22 = i22;
                    sArr3 = sArr3;
                    i9 = i9;
                    i20 = i19 + 10949481;
                    s2 = 6618;
                    if (C0964.f3626 == 0) {
                        iM2566 = (i12 - C0630.m2566("᩹ۧ")) * (-81);
                        i = ((iM2566 ^ i13) * (-21365)) ^ 2120337115;
                        i2 = -1630717404;
                        int i29 = iM2566 ^ i2;
                        i22 = i22;
                        c18237 = c18237M7511;
                        i15 = i29;
                        i14 = i;
                        i9 = i9;
                        sArr3 = sArr3;
                        i21 = i21;
                        c18237M7511 = c18237;
                    }
                    i9 = i9;
                    sArr3 = sArr3;
                    int iM25617 = C0630.m2566("᩶ۨ") ^ i13;
                    i22 = i22;
                    c18237 = c18237M7511;
                    i15 = iM25617 ^ 1440157352;
                    i14 = ((iM25617 ^ i12) * 22059) ^ (-1822570692);
                    i9 = i9;
                    i21 = i21;
                    c18237M7511 = c18237;
                    break;
                case 1646501155:
                case 1789178731:
                    strArr = new String[i9];
                    c = 0;
                    strArr[0] = C1294.m4378(c23881M11224);
                    if (C1005.f3721) {
                        iM6982 = C2105.m6981("ᩳ᩸") ^ i13;
                        i5 = ((iM6982 ^ i12) * 30153) ^ 733536550;
                        i6 = -1927336498;
                        i15 = iM6982 ^ i6;
                        i14 = i5;
                    }
                    i8 = i21;
                    sArr = sArr3;
                    i7 = i9;
                    int iM25618 = C0630.m2566("ܰۘ") ^ i12;
                    i5 = ((iM25618 ^ i13) * (-21069)) ^ 1610772459;
                    i15 = iM25618 ^ (-1514402990);
                    i9 = i7;
                    sArr3 = sArr;
                    i21 = i8;
                    i14 = i5;
                    break;
                default:
                    c18237M7511 = c18237M7511;
                    i21 = i21;
                    i22 = i22;
                    zM37751 = C15972.m37751();
                    sArr3 = f6463;
                    if (C1005.f3721) {
                        int iM25619 = C0630.m2566("ܿܿ") ^ i12;
                        i21 = i21;
                        i22 = i22;
                        c18237M7511 = c18237M7511;
                        i15 = iM25619 ^ (-396359052);
                        i14 = ((iM25619 ^ i13) * 30681) ^ 898598916;
                        i9 = 2;
                    } else {
                        i9 = 2;
                        int iM256110 = C0630.m2566("᩶ۨ") ^ i13;
                        i22 = i22;
                        c18237 = c18237M7511;
                        i15 = iM256110 ^ 1440157352;
                        i14 = ((iM256110 ^ i12) * 22059) ^ (-1822570692);
                        i9 = i9;
                        i21 = i21;
                        c18237M7511 = c18237;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0285 A[PHI: r12 r13 r27
      0x0285: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:68:0x0283, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:68:0x0283, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r27v3 boolean) = (r27v2 boolean), (r27v1 boolean) binds: [B:68:0x0283, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0312 A[PHI: r16 r17 r18
      0x0312: PHI (r16v3 int) = (r16v2 int), (r16v1 int), (r16v1 int), (r16v1 int) binds: [B:79:0x0310, B:55:0x0211, B:46:0x01cb, B:12:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r17v3 int) = (r17v2 int), (r17v1 int), (r17v1 int), (r17v1 int) binds: [B:79:0x0310, B:55:0x0211, B:46:0x01cb, B:12:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r18v3 int) = (r18v2 int), (r18v1 int), (r18v1 int), (r18v1 int) binds: [B:79:0x0310, B:55:0x0211, B:46:0x01cb, B:12:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0391 A[PHI: r14 r20 r21
      0x0391: PHI (r14v5 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:91:0x038f, B:87:0x0374, B:64:0x025e, B:14:0x0071, B:12:0x006d, B:6:0x0061, B:126:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x0391: PHI (r20v5 short[]) = (r20v3 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]) binds: [B:91:0x038f, B:87:0x0374, B:64:0x025e, B:14:0x0071, B:12:0x006d, B:6:0x0061, B:126:0x0391] A[DONT_GENERATE, DONT_INLINE]
      0x0391: PHI (r21v5 char) = (r21v2 char), (r21v3 char), (r21v2 char), (r21v2 char), (r21v2 char), (r21v2 char), (r21v2 char) binds: [B:91:0x038f, B:87:0x0374, B:64:0x025e, B:14:0x0071, B:12:0x006d, B:6:0x0061, B:126:0x0391] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m6340(int[] iArr) throws C1637 {
        int iM2566;
        int i;
        int iM2567;
        int i2;
        int i3;
        int[] iArr2 = iArr;
        int iM2568 = 0;
        C18237 c18237M3787 = null;
        int length = 0;
        int length2 = 0;
        int i4 = 0;
        C23881 c23881M11224 = null;
        int i5 = 0;
        int[] iArr3 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1556072976;
        int i11 = C3911.f12484;
        int i12 = C0714.f2697;
        int iM2569 = C0630.m2566("ۧۗ") ^ i11;
        int i13 = ((iM2569 ^ i12) * 19817) ^ 835557468;
        int i14 = iM2569 ^ 979033889;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c = 0;
        short s = 0;
        boolean zM37751 = false;
        short s2 = 0;
        short[] sArr = null;
        short[] sArr2 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-7009)) >> 31));
            switch (i10) {
                case -2094528770:
                case 875228633:
                    return iArr3;
                case -2078630305:
                case 1619168736:
                    c18237M3787.m42494(length);
                    if (C5695.f17556 < 0) {
                        iM2567 = C2105.m6981("ᩳ۟") ^ i11;
                        i2 = ((iM2567 ^ i12) * 6949) ^ 1515788196;
                        i3 = -1530866249;
                        i14 = iM2567 ^ i3;
                        i13 = i2;
                    } else {
                        iM2566 = C2105.m6981("᩹۟") ^ i11;
                        i13 = ((iM2566 ^ i12) * (-31899)) ^ 1660136570;
                        i = -208362853;
                        i14 = iM2566 ^ i;
                        iArr2 = iArr;
                    }
                    break;
                case -2053232941:
                case 254070928:
                    if (C22628.f73083 > 0) {
                        throw new C1637(AbstractC2021.m6563(new C23881(2), iM2568));
                    }
                    iM2566 = (C2105.m6981("᩶۠") + i12) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i13 = ((iM2566 ^ i11) * (-18029)) ^ (-1499317481);
                    i = 1000345585;
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -2009425880:
                case 1435898446:
                    if (i4 < length2) {
                        iM2567 = C0630.m2566("֡᩺") ^ i12;
                        i2 = ((iM2567 ^ i11) * (-9447)) ^ 1502181791;
                        i3 = -606313706;
                    } else {
                        iM2567 = C2105.m6981("᩺ۤ") ^ i11;
                        i2 = ((iM2567 ^ i12) * (-2511)) ^ 1548660339;
                        i3 = -1226618172;
                    }
                    i14 = iM2567 ^ i3;
                    i13 = i2;
                    break;
                case -1911359944:
                case 173886075:
                    C1504.m5179();
                    C1711.m5736();
                    iM2566 = (C2105.m6981("۬ܰ") ^ i11) * 53;
                    i13 = ((iM2566 ^ i12) * (-1751)) ^ 1694370051;
                    i = -1250624780;
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -1887733602:
                case 1109444974:
                    i4 = 0;
                    length2 = iArr2.length;
                    i18 = 0;
                    iM2567 = (i12 - C0630.m2566("᩸ۛ")) * (-3);
                    i2 = ((iM2567 ^ i11) * 31345) ^ (-951965519);
                    i3 = -584647686;
                    i14 = iM2567 ^ i3;
                    i13 = i2;
                    break;
                case -1869860904:
                case -317714343:
                    if (C4616.f14690 > 0) {
                        throw new C1637(RunnableC3474.m10631(new C23881(1702), iM2568));
                    }
                    iM2566 = (C2105.m6981("᩶۠") + i12) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i13 = ((iM2566 ^ i11) * (-18029)) ^ (-1499317481);
                    i = 1000345585;
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -1745172319:
                case -1166317468:
                    if (C15972.m37767()) {
                        iM2566 = C0630.m2566("۬ۚ") ^ i11;
                        i13 = ((iM2566 ^ i12) * 12849) ^ (-1333711097);
                        i = 1987040419;
                    } else {
                        iM2566 = C0630.m2566("֡ۡ") ^ i11;
                        i13 = ((iM2566 ^ i12) * (-30201)) ^ (-1346763568);
                        i = -476088955;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -1465931804:
                case -1156432570:
                    s = sArr[c];
                    s2 = 2962;
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("᩹۟") ^ i11;
                        i13 = ((iM2566 ^ i12) * (-31899)) ^ 1660136570;
                        i = -208362853;
                    } else {
                        iM2566 = C2105.m6981("۬ܺ") ^ i11;
                        i13 = ((iM2566 ^ i12) * 24549) ^ 135575422;
                        i = -614379092;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -1416058486:
                case -168986572:
                    iArr3[i6] = c23881M11224.m52603();
                    i6++;
                    iM2567 = (i12 - C2105.m6981("᩻ۙ")) * 39;
                    i2 = ((iM2567 ^ i11) * (-18171)) ^ (-539001366);
                    i3 = -1469698441;
                    i14 = iM2567 ^ i3;
                    i13 = i2;
                    break;
                case -1371834399:
                case 1258821514:
                    i17 = 3;
                    if (RunnableC1108.f4040) {
                        iM2566 = (i11 - C2105.m6981("ۧۜ")) * 91;
                        i13 = ((iM2566 ^ i12) * 12901) ^ 1055136125;
                        i = -949578108;
                    } else {
                        iM2566 = (C2105.m6981("۬ܰ") ^ i11) * 53;
                        i13 = ((iM2566 ^ i12) * (-1751)) ^ 1694370051;
                        i = -1250624780;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -1158078136:
                case -570647395:
                    if (!C1711.f5919) {
                        iM2567 = C2105.m6981("ۚ۟") ^ i11;
                        i2 = ((iM2567 ^ i12) * (-28307)) ^ (-1696255876);
                        i3 = -901751286;
                        i14 = iM2567 ^ i3;
                        i13 = i2;
                    } else {
                        iM2566 = (C2105.m6981("۬ܰ") ^ i11) * 53;
                        i13 = ((iM2566 ^ i12) * (-1751)) ^ 1694370051;
                        i = -1250624780;
                        i14 = iM2566 ^ i;
                        iArr2 = iArr;
                    }
                    break;
                case -914264140:
                case 431332161:
                    throw new C1637(AbstractC2021.m6563(c23881M11224, iM2568));
                case -719937724:
                case 490112520:
                    iM2568 = C0630.m2566(C4117.m12355(sArr2, i16, i17, i15)) ^ 2121665939;
                    if (zM37751) {
                        iM2566 = (C0630.m2566("ۖ۟") + i12) * 87;
                        i13 = ((iM2566 ^ i11) * (-24421)) ^ (-2123068314);
                        i = -659415815;
                    } else {
                        iM2566 = C0630.m2566("ᩳ᩶") ^ i12;
                        i13 = ((iM2566 ^ i11) * (-18889)) ^ (-350288328);
                        i = 876035098;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -591845916:
                case 66948384:
                    sArr = f6463;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C2105.m6981("۬ܰ") ^ i11) * 53;
                        i13 = ((iM2566 ^ i12) * (-1751)) ^ 1694370051;
                        i = -1250624780;
                    } else {
                        iM2566 = (i12 - C0630.m2566("ۙ᩻")) * 109;
                        i13 = ((iM2566 ^ i11) * (-12331)) ^ 2047318229;
                        i = 1784279598;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -584359944:
                case 99143182:
                    if (i6 < i5) {
                        iM2567 = C2105.m6981("᩹ܳ") ^ i12;
                        i2 = ((iM2567 ^ i11) * 17911) ^ 1938420768;
                        i3 = 634685517;
                    } else {
                        iM2567 = C2105.m6981("֫ۙ") ^ i11;
                        i2 = ((iM2567 ^ i12) * (-23095)) ^ 1832503825;
                        i3 = 1707841125;
                    }
                    i14 = iM2567 ^ i3;
                    i13 = i2;
                    break;
                case -570112590:
                case 1309862115:
                    zM37751 = C15972.m37751();
                    sArr2 = f6463;
                    i16 = 9;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("۠ۧ") ^ i12) * (-29);
                        i13 = ((iM2566 ^ i11) * (-14409)) ^ (-506371432);
                        i = 1510977094;
                    } else {
                        iM2566 = (C2105.m6981("᩸ۙ") + i11) * (-57);
                        i13 = ((iM2566 ^ i12) * 20967) ^ (-200972326);
                        i = 948910939;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -314228327:
                case 941157740:
                    i15 = 37885;
                    iM2566 = C2105.m6981("۟ۛ") ^ i12;
                    i13 = ((iM2566 ^ i11) * (-26807)) ^ 2116946469;
                    i = 1347093619;
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -268158826:
                case 894145460:
                    if ((i8 + i9) - i7 < 0) {
                        iM2566 = C2105.m6981("֫ܿ") ^ i11;
                        i13 = ((iM2566 ^ i12) * (-24159)) ^ 2056732823;
                        i = 444903446;
                    } else {
                        iM2566 = (C2105.m6981("֡ۙ") ^ i12) * 123;
                        i13 = ((iM2566 ^ i11) * (-25791)) ^ (-845689273);
                        i = 1481759563;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -60350217:
                case 1243579420:
                    i15 = 31532;
                    iM2566 = C2105.m6981("۟ۛ") ^ i12;
                    i13 = ((iM2566 ^ i11) * (-26807)) ^ 2116946469;
                    i = 1347093619;
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -49182831:
                case 1335823670:
                    c = '\b';
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("۬ܰ") ^ i11) * 53;
                        i13 = ((iM2566 ^ i12) * (-1751)) ^ 1694370051;
                        i = -1250624780;
                    } else {
                        iM2566 = C2105.m6981("᩶ۛ") ^ i11;
                        i13 = ((iM2566 ^ i12) * (-9109)) ^ 933769581;
                        i = 1316993748;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case -5819400:
                case 92071664:
                    c18237M3787 = RunnableC1108.m3787(4176);
                    length = iArr2.length;
                    if (C4075.f12947 >= 0) {
                        iM2567 = C2105.m6981("ۚ۟") ^ i11;
                        i2 = ((iM2567 ^ i12) * (-28307)) ^ (-1696255876);
                        i3 = -901751286;
                    } else {
                        iM2567 = (C0630.m2566("᩹ᩴ") ^ i12) * 61;
                        i2 = ((iM2567 ^ i11) * 13515) ^ 1452390966;
                        i3 = -2001547378;
                    }
                    i14 = iM2567 ^ i3;
                    i13 = i2;
                    break;
                case -496361:
                case 1031973495:
                    i7 = s * s2;
                    i8 = s * s;
                    i9 = 2193361;
                    if (C0714.m2805()) {
                        iM2566 = (C0630.m2566("᩻ۛ") ^ i12) * 29;
                        i13 = ((iM2566 ^ i11) * 1039) ^ 1180510854;
                        i = -291770721;
                    } else {
                        iM2566 = (C2105.m6981("᩶۠") + i12) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i13 = ((iM2566 ^ i11) * (-18029)) ^ (-1499317481);
                        i = 1000345585;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case 748921690:
                case 789744623:
                    if (C2520.f8000 < 0) {
                        iM2566 = (C2105.m6981("۬ܰ") ^ i11) * 53;
                        i13 = ((iM2566 ^ i12) * (-1751)) ^ 1694370051;
                        i = -1250624780;
                    } else {
                        iM2566 = (C2105.m6981("᩶۠") + i12) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i13 = ((iM2566 ^ i11) * (-18029)) ^ (-1499317481);
                        i = 1000345585;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
                case 895999716:
                case 1435742706:
                    c18237M3787.m42490(iArr2[i4]);
                    i4++;
                    iM2567 = (i12 - C0630.m2566("᩸ۛ")) * (-3);
                    i2 = ((iM2567 ^ i11) * 31345) ^ (-951965519);
                    i3 = -584647686;
                    i14 = iM2567 ^ i3;
                    i13 = i2;
                    break;
                case 1064950538:
                case 1342396283:
                    c23881M11224 = C3683.m11224(c18237M3787);
                    if (C0483.m2131(c23881M11224)) {
                        iM2567 = C0630.m2566("ܺۤ") ^ i11;
                        i2 = ((iM2567 ^ i12) * 10775) ^ (-701859402);
                        i3 = -1508894845;
                    } else {
                        iM2567 = C2105.m6981("۠ۗ") ^ i12;
                        i2 = ((iM2567 ^ i11) * 16439) ^ 1729192764;
                        i3 = 1204727390;
                    }
                    i14 = iM2567 ^ i3;
                    i13 = i2;
                    break;
                case 1089722236:
                case 1437143172:
                    int length3 = iArr2.length;
                    iArr3 = new int[length3];
                    i6 = i18;
                    i5 = length3;
                    iM2567 = (i12 - C2105.m6981("᩻ۙ")) * 39;
                    i2 = ((iM2567 ^ i11) * (-18171)) ^ (-539001366);
                    i3 = -1469698441;
                    i14 = iM2567 ^ i3;
                    i13 = i2;
                    break;
                case 1977831338:
                case 2017974449:
                    AbstractC2021.m6574();
                    C1711.m5736();
                    return null;
                default:
                    C2272.m7503();
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = (C2105.m6981("۬ܰ") ^ i11) * 53;
                        i13 = ((iM2566 ^ i12) * (-1751)) ^ 1694370051;
                        i = -1250624780;
                    } else {
                        iM2566 = (C2105.m6981("۠ۧ") ^ i12) * (-29);
                        i13 = ((iM2566 ^ i11) * (-14409)) ^ (-506371432);
                        i = 1510977094;
                    }
                    i14 = iM2566 ^ i;
                    iArr2 = iArr;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x029f A[PHI: r5 r6 r7 r17
      0x029f: PHI (r5v3 int) = (r5v2 int), (r5v1 int) binds: [B:78:0x029d, B:74:0x027d] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:78:0x029d, B:74:0x027d] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:78:0x029d, B:74:0x027d] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r17v4 int) = (r17v3 int), (r17v5 int) binds: [B:78:0x029d, B:74:0x027d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x02fd A[PHI: r2 r3 r9 r10 r16 r17
      0x02fd: PHI (r2v2 short[]) = (r2v1 short[]), (r2v1 short[]), (r2v1 short[]), (r2v4 short[]) binds: [B:63:0x0202, B:23:0x007d, B:10:0x004a, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r3v2 char) = (r3v1 char), (r3v1 char), (r3v1 char), (r3v4 char) binds: [B:63:0x0202, B:23:0x007d, B:10:0x004a, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r9v3 short[]) = (r9v2 short[]), (r9v1 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:63:0x0202, B:23:0x007d, B:10:0x004a, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:63:0x0202, B:23:0x007d, B:10:0x004a, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r16v3 boolean) = (r16v2 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean) binds: [B:63:0x0202, B:23:0x007d, B:10:0x004a, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r17v27 int) = (r17v10 int), (r17v19 int), (r17v25 int), (r17v29 int) binds: [B:63:0x0202, B:23:0x007d, B:10:0x004a, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (l.C3746.f11829 <= 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6339() throws C1637 {
        int iM2566;
        int i;
        int i2;
        int iM2567 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 262699645;
        int i10 = C4263.f13799;
        int i11 = C2520.f8000;
        int iM6981 = (C2105.m6981("ۡܽ") ^ i11) * 77;
        int i12 = ((iM6981 ^ i10) * 14067) ^ 805034025;
        int i13 = iM6981 ^ (-420666129);
        boolean zM37751 = false;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i10) * 24507) >> 31));
            switch (i14) {
                case -2002541221:
                case -286301525:
                    if (RunnableC1937.m6387() == 0) {
                        throw new C1637(AbstractC2021.m6563(new C23881(1702), iM2567));
                    }
                    iM2566 = (i11 - C0630.m2566("᩺ܶ")) * 5;
                    i = ((iM2566 ^ i10) * (-31809)) ^ (-1601434829);
                    i2 = -1784144739;
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -1863954158:
                case -1699185267:
                    i14 = i14;
                    i4 = s * s;
                    i5 = 251000649;
                    if (C2105.f7037 != 0) {
                        iM2566 = (i10 - C2105.m6981("۟᩵")) * (-3);
                        i = ((iM2566 ^ i11) * 20767) ^ (-107799145);
                        i2 = -688239012;
                    } else {
                        iM2566 = (i10 - C2105.m6981("֡֨")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i11) * (-18543)) ^ 67624801;
                        i2 = 1488902503;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -1753621981:
                case -1273750346:
                    C3019.m9255();
                    if (C2167.f7158 >= 0) {
                        i14 = i14;
                        iM2566 = (C0630.m2566("᩸ۧ") + i11) * (-43);
                        i = ((iM2566 ^ i10) * 1799) ^ 1774128769;
                        i2 = -1072564615;
                        i13 = i2 ^ iM2566;
                        i12 = i;
                        i9 = i14;
                    }
                    i14 = i14;
                    iM2566 = C2105.m6981("ۢᩳ") ^ i10;
                    i = ((iM2566 ^ i11) * (-8503)) ^ (-879807804);
                    i2 = -791355544;
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -1359695085:
                case 1382227051:
                    if (C0382.f1805) {
                        throw new C1637(AbstractC2021.m6563(new C23881(1701), iM2567));
                    }
                    iM2566 = (i11 - C0630.m2566("᩺ܶ")) * 5;
                    i = ((iM2566 ^ i10) * (-31809)) ^ (-1601434829);
                    i2 = -1784144739;
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -1357549948:
                case 97697227:
                    i14 = i14;
                    iM2567 = 2099132544 ^ C0630.m2566(C3663.m11162(sArr2, i7, i8, i6));
                    if (zM37751) {
                        iM2566 = C2105.m6981("ۛۨ") ^ i10;
                        i = ((iM2566 ^ i11) * (-21745)) ^ 2140858715;
                        i2 = -562088601;
                    } else {
                        iM2566 = C2105.m6981("֨ܿ") ^ i10;
                        i = ((iM2566 ^ i11) * (-31351)) ^ 1110806308;
                        i2 = -889278440;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -1258372959:
                case 999724265:
                    return;
                case -1165541876:
                case 1091447490:
                    i14 = i14;
                    if (i3 - (i4 + i5) <= 0) {
                        iM2566 = (C0630.m2566("ܿܺ") ^ i10) * 41;
                        i = ((iM2566 ^ i11) * (-14231)) ^ (-437945278);
                        i2 = 1448733170;
                    } else {
                        iM2566 = (i11 - C0630.m2566("ۙۨ")) * (-27);
                        i = ((iM2566 ^ i10) * (-2791)) ^ 1543319047;
                        i2 = -1217274214;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -1165062067:
                case -222026877:
                    i6 = 906;
                    iM2566 = C0630.m2566("ۛܽ") ^ i10;
                    i = ((iM2566 ^ i11) * 32745) ^ (-999876664);
                    i2 = 1715840315;
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -1138581828:
                case 1297197433:
                    i14 = i14;
                    s = sArr[c];
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("ܳ۠") ^ i11) * 69;
                        i = ((iM2566 ^ i10) * (-6969)) ^ 1213027751;
                        i2 = -547965340;
                    } else {
                        iM2566 = (C0630.m2566("᩶֫") + i10) * 21;
                        i = ((iM2566 ^ i11) * (-12021)) ^ (-1404061515);
                        i2 = 1815889825;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -967187700:
                case 881118489:
                    i6 = 35836;
                    iM2566 = C0630.m2566("ۛܽ") ^ i10;
                    i = ((iM2566 ^ i11) * 32745) ^ (-999876664);
                    i2 = 1715840315;
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -889809870:
                case 670000832:
                    i14 = i14;
                    i3 = s * 31686;
                    if (C4616.f14690 <= 0) {
                        iM2566 = (i10 - C2105.m6981("۟᩵")) * (-3);
                        i = ((iM2566 ^ i11) * 20767) ^ (-107799145);
                        i2 = -688239012;
                    } else {
                        iM2566 = (i11 - C0630.m2566("ᩳ۠")) * 49;
                        i = ((iM2566 ^ i10) * 27257) ^ (-124520168);
                        i2 = 688539589;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -769750606:
                case -309038393:
                    i14 = i14;
                    i8 = 3;
                    if (C1916.f6442) {
                        iM2566 = (i11 - C2105.m6981("ۤۨ")) * (-23);
                        i = ((iM2566 ^ i10) * (-1889)) ^ (-1433279801);
                        i2 = 1905749403;
                    } else {
                        iM2566 = (C0630.m2566("᩸ۧ") + i11) * (-43);
                        i = ((iM2566 ^ i10) * 1799) ^ 1774128769;
                        i2 = -1072564615;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -717323456:
                case -22925401:
                    i14 = i14;
                    if (C15972.m37767()) {
                        iM2566 = (i11 - C0630.m2566("ܺᩳ")) * (-115);
                        i = ((iM2566 ^ i10) * (-20901)) ^ (-596959235);
                        i2 = -842456124;
                    } else {
                        iM2566 = C2105.m6981("ۙۧ") ^ i10;
                        i = ((iM2566 ^ i11) * 6715) ^ 1203210420;
                        i2 = 1211953255;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -460842607:
                case -388521856:
                    C1711.m5736();
                    i14 = i14;
                    iM2566 = (C0630.m2566("ܳ۠") ^ i11) * 69;
                    i = ((iM2566 ^ i10) * (-6969)) ^ 1213027751;
                    i2 = -547965340;
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -396982366:
                case 1662583301:
                    i14 = i14;
                    if (C15972.m37762() > 0) {
                        iM2566 = (i10 - C0630.m2566("ᩴ᩹")) * 11;
                        i = ((iM2566 ^ i11) * (-21807)) ^ 1153409069;
                        i2 = 71823848;
                    } else {
                        iM2566 = (C0630.m2566("᩹ۘ") ^ i11) * 47;
                        i = ((iM2566 ^ i10) * 32735) ^ 193339329;
                        i2 = -410913103;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case -366754014:
                case 1106964358:
                    i14 = i14;
                    if (C0237.f1507 == 0) {
                        throw new C1637(AbstractC2021.m6563(new C23881(2), iM2567));
                    }
                    iM2566 = (C0630.m2566("᩸ۧ") + i11) * (-43);
                    i = ((iM2566 ^ i10) * 1799) ^ 1774128769;
                    i2 = -1072564615;
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case 797942053:
                case 2041195878:
                    break;
                case 1146376788:
                case 1912173830:
                    i14 = i14;
                    if (C1128.f4106 > 0) {
                        throw new C1637(AbstractC2021.m6563(new C23881(1700), iM2567));
                    }
                    iM2566 = C2105.m6981("ۢᩳ") ^ i10;
                    i = ((iM2566 ^ i11) * (-8503)) ^ (-879807804);
                    i2 = -791355544;
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case 1215297783:
                case 1377392593:
                    i14 = i14;
                    zM37751 = C15972.m37751();
                    sArr2 = f6463;
                    i7 = 5;
                    if (RunnableC1108.m3790()) {
                        iM2566 = C2105.m6981("ۢᩳ") ^ i10;
                        i = ((iM2566 ^ i11) * (-8503)) ^ (-879807804);
                        i2 = -791355544;
                    } else {
                        iM2566 = (C2105.m6981("ۜܺ") + i11) * (-35);
                        i = ((iM2566 ^ i10) * 2249) ^ (-908316953);
                        i2 = 97452013;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case 1255581766:
                case 1441285222:
                    C0798.m2998();
                    if (C3537.m10746() > 0) {
                        iM2566 = (i11 - C0630.m2566("᩺ܶ")) * 5;
                        i = ((iM2566 ^ i10) * (-31809)) ^ (-1601434829);
                        i2 = -1784144739;
                        i13 = i2 ^ iM2566;
                        i12 = i;
                        i9 = i14;
                    }
                    i14 = i14;
                    iM2566 = (C0630.m2566("ܳ۠") ^ i11) * 69;
                    i = ((iM2566 ^ i10) * (-6969)) ^ 1213027751;
                    i2 = -547965340;
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case 1341541939:
                case 2086666849:
                    i14 = i14;
                    if (C15972.m37758()) {
                        iM2566 = (i11 - C0630.m2566("ۙ۬")) * 29;
                        i = ((iM2566 ^ i10) * (-11757)) ^ (-255861897);
                        i2 = -2081242922;
                    } else {
                        iM2566 = (i10 - C2105.m6981("۬ۘ")) * 45;
                        i = ((iM2566 ^ i11) * (-20929)) ^ (-1560360945);
                        i2 = 1461015049;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
                case 1776630701:
                case 2081868697:
                    C2520.m8026();
                    C3245.m9925();
                    return;
                default:
                    i14 = i14;
                    sArr = f6463;
                    c = 4;
                    if (C1711.m5736() <= 0) {
                        iM2566 = C2105.m6981("ۢᩳ") ^ i10;
                        i = ((iM2566 ^ i11) * (-8503)) ^ (-879807804);
                        i2 = -791355544;
                    } else {
                        iM2566 = C2105.m6981("֫ۨ") ^ i11;
                        i = ((iM2566 ^ i10) * (-24103)) ^ 1637271932;
                        i2 = 931586165;
                    }
                    i13 = i2 ^ iM2566;
                    i12 = i;
                    i9 = i14;
                    break;
            }
        }
    }
}
