package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F6N1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5256 {

    /* JADX INFO: renamed from: ܺۤ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f81923 = {154, 22538, 22577, 22590, 22589, 22579, 22586, 22655, 22571, 22576, 22655, 22587, 22586, 22579, 22586, 22571, 22586, 22655, 22579, 22586, 22584, 22590, 22588, 22566, 22655, 22587, 22590, 22571, 22590, 22629, 22655, 9584, -18398, -18381, -18373, -18394, -18373, -18379, -18394, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18395, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18395, -18429, -18376, -18377, -18380, -18374, -18381, -18314, -18398, -18375, -18314, -18374, -18369, -18395, -18398, -18314, -18374, -18381, -18383, -18377, -18379, -18385, -18314, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18395, -18429, -18376, -18377, -18380, -18374, -18381, -18314, -18398, -18375, -18314, -18373, -18375, -18400, -18381, -18314, -18374, -18381, -18383, -18377, -18379, -18385, -18314, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18324, -18314};

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m11335(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044) {
        short s = f81923[31];
        int i = (s * 2) + 1;
        int i2 = s + 1;
        int i3 = (i2 * i2) - i >= 0 ? 47190 : 13665;
        synchronized (C5256.class) {
            m11334(C0917.m55846(abstractC17043, RunnableC0871.m55667(f81923, 32, 4, i3)));
            m11334(C0917.m55846(abstractC17043, C0877.m55707(f81923, 36, 3, i3)));
            try {
                AbstractC17043 abstractC17043M55846 = C0917.m55846(abstractC17044, C1124.m56373(f81923, 39, 8, i3));
                Iterator itM55766 = C0894.m55766(C0917.m55846(abstractC17043, C0906.m55810(f81923, 47, 8, i3)).mo25500(true));
                while (C0930.m55886(itM55766)) {
                    AbstractC17043 abstractC17045 = (AbstractC17043) RunnableC0897.m55785(itM55766);
                    try {
                        if (ServiceConnectionC1013.m56162(abstractC17045)) {
                            if (!ServiceConnectionC1013.m56162(abstractC17043M55846) && !abstractC17043M55846.mo25497()) {
                                return;
                            }
                            AbstractC17043 abstractC17043M55847 = C0917.m55846(abstractC17043M55846, C1404.m56460(abstractC17045));
                            if (!C1003.m56124(abstractC17043M55847)) {
                                abstractC17045.mo25502(abstractC17043M55847);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        C0912.m55825(sb, C0937.m55921(f81923, 85, 31, i3));
                        C0912.m55825(sb, C0989.m56086(abstractC17045));
                        C1046.m56296(C0863.m55639(sb), e);
                    }
                }
            } catch (Exception e2) {
                C1046.m56296(C1025.m56233(f81923, 55, 30, i3), e2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x022e A[PHI: r4 r14 r15
      0x022e: PHI (r4v4 java.lang.StringBuilder) = 
      (r4v2 java.lang.StringBuilder)
      (r4v3 java.lang.StringBuilder)
      (r4v2 java.lang.StringBuilder)
      (r4v2 java.lang.StringBuilder)
      (r4v2 java.lang.StringBuilder)
     binds: [B:60:0x022c, B:48:0x0187, B:31:0x00ff, B:28:0x00e3, B:25:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:60:0x022c, B:48:0x0187, B:31:0x00ff, B:28:0x00e3, B:25:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:60:0x022c, B:48:0x0187, B:31:0x00ff, B:28:0x00e3, B:25:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b8 A[PHI: r5 r12
      0x02b8: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:71:0x02b6, B:44:0x0166, B:9:0x0058, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r12v5 short) = (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:71:0x02b6, B:44:0x0166, B:9:0x0058, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0369 A[PHI: r8 r11
      0x0369: PHI (r8v4 char) = (r8v2 char), (r8v2 char), (r8v3 char), (r8v2 char), (r8v2 char), (r8v2 char) binds: [B:91:0x0367, B:87:0x0349, B:83:0x032e, B:75:0x02ed, B:25:0x00da, B:21:0x00b7] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:91:0x0367, B:87:0x0349, B:83:0x032e, B:75:0x02ed, B:25:0x00da, B:21:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x039f A[PHI: r9 r10 r20
      0x039f: PHI (r9v3 short) = (r9v2 short), (r9v4 short) binds: [B:95:0x039d, B:79:0x030f] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:95:0x039d, B:79:0x030f] A[DONT_GENERATE, DONT_INLINE]
      0x039f: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]) binds: [B:95:0x039d, B:79:0x030f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m11334(AbstractC17043 abstractC17043) {
        int iM55979;
        int i;
        int i2;
        int i3 = C1046.f81962;
        int i4 = C1404.f82149;
        int iM559710 = C0946.m55979("᩷ۛ") ^ i4;
        int i5 = ((iM559710 ^ i3) * 26933) ^ (-1890104622);
        String strM56086 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM559710 ^ (-1041163177);
        String strM56132 = null;
        boolean zM56173 = false;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 947838670;
        StringBuilder sb = null;
        Exception exc = null;
        boolean zM55837 = false;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 22513) >> 31));
            switch (i11) {
                case -2093415120:
                case -1022444769:
                    C0917.m55854();
                    if (C0882.m55710() == 0) {
                        iM55979 = (C0873.m55680("᩺ᩳ") + i4) * (-113);
                        i = ((iM55979 ^ i3) * 4571) ^ (-152396454);
                        i2 = 711109143;
                    } else {
                        iM55979 = C0946.m55979("ۚۜ") ^ i4;
                        i = ((iM55979 ^ i3) * 295) ^ (-1149091065);
                        i2 = 1110128794;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2065522177:
                case -1121818131:
                    zM55837 = C0912.m55837(abstractC17043);
                    iM55979 = (C0873.m55680("ۤ᩻") ^ i4) * (-69);
                    i = ((iM55979 ^ i3) * (-1943)) ^ (-560933659);
                    i2 = -2108601425;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1868682153:
                case 545132787:
                    try {
                        StringBuilder sb2 = new StringBuilder(strM56132);
                        C1003.m56121(sb2, C1046.m56297(abstractC17043));
                        C21306.m48193(C0863.m55639(sb2));
                        iM55979 = (C0946.m55979("ܺ۟") + i4) * (-123);
                        i = ((iM55979 ^ i3) * (-15057)) ^ 36806884;
                        i2 = 1212538647;
                    } catch (Exception e) {
                        exc = e;
                        iM55979 = (C0946.m55979("᩸ۙ") + i3) * (-47);
                        i = ((iM55979 ^ i4) * (-695)) ^ (-259906348);
                        i2 = 804852191;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1859695536:
                case 1462455734:
                    i9 = 22623;
                    iM55979 = C0946.m55979("ۙۖ") ^ i3;
                    i = ((iM55979 ^ i4) * (-1889)) ^ (-302080742);
                    i2 = -1397448749;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1846994717:
                case 1548750446:
                    strM56132 = C1003.m56132(sArr2, i10, 30, i9);
                    iM55979 = (i3 - C0873.m55680("֨֨")) * 41;
                    i = ((iM55979 ^ i4) * (-19085)) ^ 1284551115;
                    i2 = 1527688786;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1835328697:
                case 2032579418:
                    C0989.m56095();
                    if (C0917.f81868) {
                        iM55979 = (C0873.m55680("᩺ᩳ") + i4) * (-113);
                        i = ((iM55979 ^ i3) * 4571) ^ (-152396454);
                        i2 = 711109143;
                    } else {
                        iM55979 = C0946.m55979("᩺ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 4481) ^ (-1673912813);
                        i2 = 388474756;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1720070105:
                case 338217004:
                    c = 0;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩹ܳ")) * (-127);
                        i = ((iM55979 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    } else {
                        iM55979 = C0873.m55680("᩶۠") ^ i3;
                        i = ((iM55979 ^ i4) * (-12007)) ^ (-716386148);
                        i2 = 1840415003;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1645199126:
                case -1017217565:
                    if ((s * s2) - i8 > 0) {
                        iM55979 = (i4 - C0873.m55680("ۘۨ")) * (-91);
                        i = ((iM55979 ^ i3) * (-22307)) ^ (-943852998);
                        i2 = -1032425462;
                    } else {
                        iM55979 = C0873.m55680("ۢܶ") ^ i3;
                        i = ((iM55979 ^ i4) * (-8877)) ^ (-1619039429);
                        i2 = 31591301;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1378806219:
                case -1168896580:
                    if (C0992.m56107() <= 0) {
                        iM55979 = (i3 - C0873.m55680("᩹ܳ")) * (-127);
                        i = ((iM55979 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    } else {
                        iM55979 = (C0873.m55680("ܳۡ") + i4) * (-3);
                        i = ((iM55979 ^ i3) * 21569) ^ (-2068404987);
                        i2 = -1863738963;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1327369556:
                case 214704676:
                    i8 = i7 + 12334144;
                    if (C1124.f82007 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩹ܳ")) * (-127);
                        i = ((iM55979 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۢۗ")) * (-101);
                        i = ((iM55979 ^ i3) * (-18699)) ^ (-957099538);
                        i2 = -1437094534;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1256200500:
                case 673013033:
                    C1003.m56121(sb, strM56086);
                    C0989.m56088(C0845.m55591(sb), exc);
                    break;
                case -1253955114:
                case 366477359:
                    sArr = f81923;
                    if (C1048.m56305() >= 0) {
                        iM55979 = (C0873.m55680("۫ۜ") ^ i4) * (-63);
                        i = ((iM55979 ^ i3) * 5937) ^ 1915795461;
                        i2 = 702260457;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܶ۬")) * (-61);
                        i = ((iM55979 ^ i4) * (-12215)) ^ (-903027410);
                        i2 = -260506;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1207001470:
                case -218095479:
                    C0892.m55749();
                    iM55979 = (C0873.m55680("᩷ۤ") + i4) * 77;
                    i = ((iM55979 ^ i3) * 31755) ^ 7309577;
                    i2 = -1135143646;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1045265449:
                case 1067296087:
                    sb = new StringBuilder(strM56132);
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("᩷ۤ") + i4) * 77;
                        i = ((iM55979 ^ i3) * 31755) ^ 7309577;
                        i2 = -1135143646;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܽۢ")) * 119;
                        i = ((iM55979 ^ i3) * 25801) ^ (-215392078);
                        i2 = 1990404485;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -632034979:
                case 1378175686:
                    if (zM55837) {
                        iM55979 = C0873.m55680("᩶ܽ") ^ i3;
                        i = ((iM55979 ^ i4) * 3913) ^ 1190006701;
                        i2 = -1266010920;
                    } else {
                        iM55979 = (C0946.m55979("ܺ۟") + i4) * (-123);
                        i = ((iM55979 ^ i3) * (-15057)) ^ 36806884;
                        i2 = 1212538647;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -600568232:
                case 1844557335:
                    C0898.m55800();
                    C1964.m56597();
                    break;
                case -581993559:
                case -499083784:
                    zM56173 = RunnableC1014.m56173(abstractC17043);
                    iM55979 = (C0873.m55680("ܿۢ") + i3) * 45;
                    i = ((iM55979 ^ i4) * 4593) ^ (-2032422473);
                    i2 = 1148236985;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -524813372:
                case -503482709:
                    C0854.m55595();
                    if (C0890.f81849 == 0) {
                        iM55979 = C0873.m55680("᩺֫") ^ i3;
                        i = ((iM55979 ^ i4) * (-31531)) ^ 909464319;
                        i2 = 1941098634;
                    } else {
                        iM55979 = (C0873.m55680("۠᩸") ^ i3) * 109;
                        i = ((iM55979 ^ i4) * 23699) ^ (-316524256);
                        i2 = 1633546388;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -517865277:
                case 1462213718:
                    i9 = 34029;
                    iM55979 = C0946.m55979("ۙۖ") ^ i3;
                    i = ((iM55979 ^ i4) * (-1889)) ^ (-302080742);
                    i2 = -1397448749;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -505230521:
                case 814227915:
                    s2 = 7024;
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("᩺֫") ^ i3;
                        i = ((iM55979 ^ i4) * (-31531)) ^ 909464319;
                        i2 = 1941098634;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܺܳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55979 ^ i3) * (-15075)) ^ 1532859309;
                        i2 = 1002766777;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -376466860:
                case 526364480:
                    strM56086 = C0989.m56086(abstractC17043);
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("᩺֫") ^ i3;
                        i = ((iM55979 ^ i4) * (-31531)) ^ 909464319;
                        i2 = 1941098634;
                    } else {
                        iM55979 = C0873.m55680("᩸֨") ^ i3;
                        i = ((iM55979 ^ i4) * (-31913)) ^ 1158490104;
                        i2 = -472562085;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -299364659:
                case -14594701:
                    C1012.m56134();
                    if (C0873.f81841 > 0) {
                        iM55979 = (C0873.m55680("᩷ۤ") + i4) * 77;
                        i = ((iM55979 ^ i3) * 31755) ^ 7309577;
                        i2 = -1135143646;
                    } else {
                        iM55979 = (C0873.m55680("᩷֫") ^ i3) * (-7);
                        i = ((iM55979 ^ i4) * 10693) ^ (-1446988024);
                        i2 = 1400224658;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -226860209:
                case 328679823:
                    if (C0930.f81879 <= 0) {
                        iM55979 = (i3 - C0873.m55680("᩹ܳ")) * (-127);
                        i = ((iM55979 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    } else {
                        iM55979 = (C0873.m55680("ۖۢ") + i4) * 123;
                        i = ((iM55979 ^ i3) * 10911) ^ (-1419658774);
                        i2 = -461295116;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -92414359:
                case 663436873:
                    sArr2 = f81923;
                    i10 = 1;
                    if (C1024.f81946) {
                        iM55979 = (C0873.m55680("᩷ۤ") + i4) * 77;
                        i = ((iM55979 ^ i3) * 31755) ^ 7309577;
                        i2 = -1135143646;
                    } else {
                        iM55979 = (C0946.m55979("᩵۬") ^ i4) * 35;
                        i = ((iM55979 ^ i3) * (-14209)) ^ (-265676489);
                        i2 = -1871199998;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 99112411:
                case 1330321426:
                    if (zM56173) {
                        iM55979 = (C0946.m55979("ܺ۟") + i4) * (-123);
                        i = ((iM55979 ^ i3) * (-15057)) ^ 36806884;
                        i2 = 1212538647;
                    } else {
                        iM55979 = C0946.m55979("۟ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 27411) ^ 1918177631;
                        i2 = 1152700553;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 501659266:
                case 2106334284:
                    C1071.m56343();
                    if (C1003.m56123() == 0) {
                        iM55979 = (C0873.m55680("᩷ۤ") + i4) * 77;
                        i = ((iM55979 ^ i3) * 31755) ^ 7309577;
                        i2 = -1135143646;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩹ܳ")) * (-127);
                        i = ((iM55979 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 628650076:
                case 834051857:
                    C1003.m56123();
                    if (C0989.f81920 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩹ܳ")) * (-127);
                        i = ((iM55979 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    } else {
                        iM55979 = (C0873.m55680("᩺ᩳ") + i4) * (-113);
                        i = ((iM55979 ^ i3) * 4571) ^ (-152396454);
                        i2 = 711109143;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 997728406:
                case 1627805763:
                    s = sArr[c];
                    i7 = s * s;
                    if (C0892.f81851) {
                        iM55979 = (C0946.m55979("۬᩻") ^ i3) * 89;
                        i = ((iM55979 ^ i4) * 22089) ^ 431274364;
                        i2 = 550129484;
                    } else {
                        iM55979 = (C0873.m55680("۫ۜ") ^ i4) * (-63);
                        i = ((iM55979 ^ i3) * 5937) ^ 1915795461;
                        i2 = 702260457;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1192618290:
                case 1297153032:
                    break;
                default:
                    if (C0989.m56095() <= 0) {
                        iM55979 = (C0873.m55680("᩺ᩳ") + i4) * (-113);
                        i = ((iM55979 ^ i3) * 4571) ^ (-152396454);
                        i2 = 711109143;
                    } else {
                        iM55979 = C0873.m55680("᩺֫") ^ i3;
                        i = ((iM55979 ^ i4) * (-31531)) ^ 909464319;
                        i2 = 1941098634;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
