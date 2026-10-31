package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F6N1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3038 {

    /* JADX INFO: renamed from: ܺۤ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f9574 = {154, 22538, 22577, 22590, 22589, 22579, 22586, 22655, 22571, 22576, 22655, 22587, 22586, 22579, 22586, 22571, 22586, 22655, 22579, 22586, 22584, 22590, 22588, 22566, 22655, 22587, 22590, 22571, 22590, 22629, 22655, 9584, -18398, -18381, -18373, -18394, -18373, -18379, -18394, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18395, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18395, -18429, -18376, -18377, -18380, -18374, -18381, -18314, -18398, -18375, -18314, -18374, -18369, -18395, -18398, -18314, -18374, -18381, -18383, -18377, -18379, -18385, -18314, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18395, -18429, -18376, -18377, -18380, -18374, -18381, -18314, -18398, -18375, -18314, -18373, -18375, -18400, -18381, -18314, -18374, -18381, -18383, -18377, -18379, -18385, -18314, -18394, -18396, -18375, -18372, -18381, -18379, -18398, -18324, -18314};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m9293(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441) {
        short s = f9574[31];
        int i = (s * 2) + 1;
        int i2 = s + 1;
        int i3 = (i2 * i2) - i >= 0 ? 47190 : 13665;
        synchronized (C3038.class) {
            m9292(C1504.m5171(abstractC15440, RunnableC0588.m2436(f9574, 32, 4, i3)));
            m9292(C1504.m5171(abstractC15440, C0714.m2816(f9574, 36, 3, i3)));
            try {
                AbstractC15440 abstractC15440M5171 = C1504.m5171(abstractC15441, C5695.m16034(f9574, 39, 8, i3));
                Iterator itM3596 = C1047.m3596(C1504.m5171(abstractC15440, C1294.m4373(f9574, 47, 8, i3)).mo23549(true));
                while (C1773.m5910(itM3596)) {
                    AbstractC15440 abstractC15442 = (AbstractC15440) RunnableC1108.m3791(itM3596);
                    try {
                        if (ServiceConnectionC3453.m10569(abstractC15442)) {
                            if (!ServiceConnectionC3453.m10569(abstractC15440M5171) && !abstractC15440M5171.mo23546()) {
                                return;
                            }
                            AbstractC15440 abstractC15440M5172 = C1504.m5171(abstractC15440M5171, C11340.m28023(abstractC15442));
                            if (!C3245.m9926(abstractC15440M5172)) {
                                abstractC15442.mo23551(abstractC15440M5172);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        C1420.m4905(sb, C1916.m6311(f9574, 85, 31, i3));
                        C1420.m4905(sb, C2958.m9025(abstractC15442));
                        C4117.m12358(C0422.m1959(sb), e);
                    }
                }
            } catch (Exception e2) {
                C4117.m12358(C3683.m11225(f9574, 55, 30, i3), e2);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9292(AbstractC15440 abstractC15440) {
        int iM6981;
        int i;
        int i2;
        int i3 = C4117.f13076;
        int i4 = C11340.f33930;
        int iM6982 = C2105.m6981("᩷ۛ") ^ i4;
        int i5 = ((iM6982 ^ i3) * 26933) ^ (-1890104622);
        String strM9025 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ (-1041163177);
        String strM9934 = null;
        boolean zM10626 = false;
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
        boolean zM4917 = false;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 22513) >> 31));
            switch (i11) {
                case -2093415120:
                case -1022444769:
                    C1504.m5179();
                    if (C0798.m2998() == 0) {
                        iM6981 = (C0630.m2566("᩺ᩳ") + i4) * (-113);
                        i = ((iM6981 ^ i3) * 4571) ^ (-152396454);
                        i2 = 711109143;
                    } else {
                        iM6981 = C2105.m6981("ۚۜ") ^ i4;
                        i = ((iM6981 ^ i3) * 295) ^ (-1149091065);
                        i2 = 1110128794;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2065522177:
                case -1121818131:
                    zM4917 = C1420.m4917(abstractC15440);
                    iM6981 = (C0630.m2566("ۤ᩻") ^ i4) * (-69);
                    i = ((iM6981 ^ i3) * (-1943)) ^ (-560933659);
                    i2 = -2108601425;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1868682153:
                case 545132787:
                    try {
                        StringBuilder sb2 = new StringBuilder(strM9934);
                        C3245.m9923(sb2, C4117.m12359(abstractC15440));
                        C19926.m45880(C0422.m1959(sb2));
                        iM6981 = (C2105.m6981("ܺ۟") + i4) * (-123);
                        i = ((iM6981 ^ i3) * (-15057)) ^ 36806884;
                        i2 = 1212538647;
                    } catch (Exception e) {
                        exc = e;
                        iM6981 = (C2105.m6981("᩸ۙ") + i3) * (-47);
                        i = ((iM6981 ^ i4) * (-695)) ^ (-259906348);
                        i2 = 804852191;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1859695536:
                case 1462455734:
                    i9 = 22623;
                    iM6981 = C2105.m6981("ۙۖ") ^ i3;
                    i = ((iM6981 ^ i4) * (-1889)) ^ (-302080742);
                    i2 = -1397448749;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1846994717:
                case 1548750446:
                    strM9934 = C3245.m9934(sArr2, i10, 30, i9);
                    iM6981 = (i3 - C0630.m2566("֨֨")) * 41;
                    i = ((iM6981 ^ i4) * (-19085)) ^ 1284551115;
                    i2 = 1527688786;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1835328697:
                case 2032579418:
                    C2958.m9034();
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("᩺ᩳ") + i4) * (-113);
                        i = ((iM6981 ^ i3) * 4571) ^ (-152396454);
                        i2 = 711109143;
                    } else {
                        iM6981 = C2105.m6981("᩺ۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 4481) ^ (-1673912813);
                        i2 = 388474756;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1720070105:
                case 338217004:
                    c = 0;
                    if (C3683.f11629 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩹ܳ")) * (-127);
                        i = ((iM6981 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    } else {
                        iM6981 = C0630.m2566("᩶۠") ^ i3;
                        i = ((iM6981 ^ i4) * (-12007)) ^ (-716386148);
                        i2 = 1840415003;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1645199126:
                case -1017217565:
                    if ((s * s2) - i8 > 0) {
                        iM6981 = (i4 - C0630.m2566("ۘۨ")) * (-91);
                        i = ((iM6981 ^ i3) * (-22307)) ^ (-943852998);
                        i2 = -1032425462;
                    } else {
                        iM6981 = C0630.m2566("ۢܶ") ^ i3;
                        i = ((iM6981 ^ i4) * (-8877)) ^ (-1619039429);
                        i2 = 31591301;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1378806219:
                case -1168896580:
                    if (C3019.m9255() <= 0) {
                        iM6981 = (i3 - C0630.m2566("᩹ܳ")) * (-127);
                        i = ((iM6981 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    } else {
                        iM6981 = (C0630.m2566("ܳۡ") + i4) * (-3);
                        i = ((iM6981 ^ i3) * 21569) ^ (-2068404987);
                        i2 = -1863738963;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1327369556:
                case 214704676:
                    i8 = i7 + 12334144;
                    if (C5695.f17556 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩹ܳ")) * (-127);
                        i = ((iM6981 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۢۗ")) * (-101);
                        i = ((iM6981 ^ i3) * (-18699)) ^ (-957099538);
                        i2 = -1437094534;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1256200500:
                case 673013033:
                    C3245.m9923(sb, strM9025);
                    C2958.m9027(C0050.m947(sb), exc);
                    break;
                case -1253955114:
                case 366477359:
                    sArr = f9574;
                    if (C4159.m12565() >= 0) {
                        iM6981 = (C0630.m2566("۫ۜ") ^ i4) * (-63);
                        i = ((iM6981 ^ i3) * 5937) ^ 1915795461;
                        i2 = 702260457;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܶ۬")) * (-61);
                        i = ((iM6981 ^ i4) * (-12215)) ^ (-903027410);
                        i2 = -260506;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1207001470:
                case -218095479:
                    C1005.m3501();
                    iM6981 = (C0630.m2566("᩷ۤ") + i4) * 77;
                    i = ((iM6981 ^ i3) * 31755) ^ 7309577;
                    i2 = -1135143646;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1045265449:
                case 1067296087:
                    sb = new StringBuilder(strM9934);
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C0630.m2566("᩷ۤ") + i4) * 77;
                        i = ((iM6981 ^ i3) * 31755) ^ 7309577;
                        i2 = -1135143646;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܽۢ")) * 119;
                        i = ((iM6981 ^ i3) * 25801) ^ (-215392078);
                        i2 = 1990404485;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -632034979:
                case 1378175686:
                    if (zM4917) {
                        iM6981 = C0630.m2566("᩶ܽ") ^ i3;
                        i = ((iM6981 ^ i4) * 3913) ^ 1190006701;
                        i2 = -1266010920;
                    } else {
                        iM6981 = (C2105.m6981("ܺ۟") + i4) * (-123);
                        i = ((iM6981 ^ i3) * (-15057)) ^ 36806884;
                        i2 = 1212538647;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -600568232:
                case 1844557335:
                    C1128.m3851();
                    C22628.m50615();
                    break;
                case -581993559:
                case -499083784:
                    zM10626 = RunnableC3474.m10626(abstractC15440);
                    iM6981 = (C0630.m2566("ܿۢ") + i3) * 45;
                    i = ((iM6981 ^ i4) * 4593) ^ (-2032422473);
                    i2 = 1148236985;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -524813372:
                case -503482709:
                    C0237.m1481();
                    if (C0964.f3626 == 0) {
                        iM6981 = C0630.m2566("᩺֫") ^ i3;
                        i = ((iM6981 ^ i4) * (-31531)) ^ 909464319;
                        i2 = 1941098634;
                    } else {
                        iM6981 = (C0630.m2566("۠᩸") ^ i3) * 109;
                        i = ((iM6981 ^ i4) * 23699) ^ (-316524256);
                        i2 = 1633546388;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -517865277:
                case 1462213718:
                    i9 = 34029;
                    iM6981 = C2105.m6981("ۙۖ") ^ i3;
                    i = ((iM6981 ^ i4) * (-1889)) ^ (-302080742);
                    i2 = -1397448749;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -505230521:
                case 814227915:
                    s2 = 7024;
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("᩺֫") ^ i3;
                        i = ((iM6981 ^ i4) * (-31531)) ^ 909464319;
                        i2 = 1941098634;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܺܳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM6981 ^ i3) * (-15075)) ^ 1532859309;
                        i2 = 1002766777;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -376466860:
                case 526364480:
                    strM9025 = C2958.m9025(abstractC15440);
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("᩺֫") ^ i3;
                        i = ((iM6981 ^ i4) * (-31531)) ^ 909464319;
                        i2 = 1941098634;
                    } else {
                        iM6981 = C0630.m2566("᩸֨") ^ i3;
                        i = ((iM6981 ^ i4) * (-31913)) ^ 1158490104;
                        i2 = -472562085;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -299364659:
                case -14594701:
                    C3432.m10477();
                    if (C0630.f2410 > 0) {
                        iM6981 = (C0630.m2566("᩷ۤ") + i4) * 77;
                        i = ((iM6981 ^ i3) * 31755) ^ 7309577;
                        i2 = -1135143646;
                    } else {
                        iM6981 = (C0630.m2566("᩷֫") ^ i3) * (-7);
                        i = ((iM6981 ^ i4) * 10693) ^ (-1446988024);
                        i2 = 1400224658;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -226860209:
                case 328679823:
                    if (C1773.f6144 <= 0) {
                        iM6981 = (i3 - C0630.m2566("᩹ܳ")) * (-127);
                        i = ((iM6981 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    } else {
                        iM6981 = (C0630.m2566("ۖۢ") + i4) * 123;
                        i = ((iM6981 ^ i3) * 10911) ^ (-1419658774);
                        i2 = -461295116;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -92414359:
                case 663436873:
                    sArr2 = f9574;
                    i10 = 1;
                    if (C3663.f11553) {
                        iM6981 = (C0630.m2566("᩷ۤ") + i4) * 77;
                        i = ((iM6981 ^ i3) * 31755) ^ 7309577;
                        i2 = -1135143646;
                    } else {
                        iM6981 = (C2105.m6981("᩵۬") ^ i4) * 35;
                        i = ((iM6981 ^ i3) * (-14209)) ^ (-265676489);
                        i2 = -1871199998;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 99112411:
                case 1330321426:
                    if (zM10626) {
                        iM6981 = (C2105.m6981("ܺ۟") + i4) * (-123);
                        i = ((iM6981 ^ i3) * (-15057)) ^ 36806884;
                        i2 = 1212538647;
                    } else {
                        iM6981 = C2105.m6981("۟ۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 27411) ^ 1918177631;
                        i2 = 1152700553;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 501659266:
                case 2106334284:
                    C4616.m13552();
                    if (C3245.m9925() == 0) {
                        iM6981 = (C0630.m2566("᩷ۤ") + i4) * 77;
                        i = ((iM6981 ^ i3) * 31755) ^ 7309577;
                        i2 = -1135143646;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩹ܳ")) * (-127);
                        i = ((iM6981 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 628650076:
                case 834051857:
                    C3245.m9925();
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩹ܳ")) * (-127);
                        i = ((iM6981 ^ i4) * 2263) ^ 1469213785;
                        i2 = 213366078;
                    } else {
                        iM6981 = (C0630.m2566("᩺ᩳ") + i4) * (-113);
                        i = ((iM6981 ^ i3) * 4571) ^ (-152396454);
                        i2 = 711109143;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 997728406:
                case 1627805763:
                    s = sArr[c];
                    i7 = s * s;
                    if (C1005.f3721) {
                        iM6981 = (C2105.m6981("۬᩻") ^ i3) * 89;
                        i = ((iM6981 ^ i4) * 22089) ^ 431274364;
                        i2 = 550129484;
                    } else {
                        iM6981 = (C0630.m2566("۫ۜ") ^ i4) * (-63);
                        i = ((iM6981 ^ i3) * 5937) ^ 1915795461;
                        i2 = 702260457;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1192618290:
                case 1297153032:
                    break;
                default:
                    if (C2958.m9034() <= 0) {
                        iM6981 = (C0630.m2566("᩺ᩳ") + i4) * (-113);
                        i = ((iM6981 ^ i3) * 4571) ^ (-152396454);
                        i2 = 711109143;
                    } else {
                        iM6981 = C0630.m2566("᩺֫") ^ i3;
                        i = ((iM6981 ^ i4) * (-31531)) ^ 909464319;
                        i2 = 1941098634;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
