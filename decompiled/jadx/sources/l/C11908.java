package l;

import com.alipay.sdk.app.OpenAuthTask;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11908 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17230 f35589;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17230 f35590;

    /* JADX INFO: renamed from: ۧ᩸ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f35591 = {2412, 28329, 28331, 28346, 28312, 28335, 28322, 28347, 28331, 28390, 28384, 28384, 28384, 28391, 7331, 1547, 1545, 1566, 1539, 1564, 1539, 1566, 1555, 3838, -24873, -24886, -24873, -24891, -24876, -24883, -24837, -24879, -24873, -24895, -24874, -24883, -24886, -24894, -24885, -24896, -24883, -24891, -24886, -24896, -24883, -24837, -24877, -24868, -24837, -24888, -24885, -24893, -24883, -24886, -24893, -24895, -24880, -24846, -24891, -24888, -24879, -24895, -24948, -24950, -24950, -24950, -24947, 7430, 7620, 7622, 7633, 7628, 7635, 7628, 7633, 7644, 7638, 7627, 7638, 7620, 7637, 7628, 7674, 7632, 7638, 7616, 7639, 7628, 7627, 7619, 7626, 7617, 7628, 7620, 7627, 7617, 7628, 7674, 7634, 7645, 7674, 7625, 7626, 7618, 7628, 7627, 7618, 7616, 7633, 7667, 7620, 7625, 7632, 7616, 7565, 7563, 7563, 7563, 7564};

    /* JADX WARN: Code duplicated, block: B:39:0x0149  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a7 A[PHI: r3 r6 r7 r15
      0x01a7: PHI (r3v4 l.ۡ᩹᩷) = (r3v2 l.ۡ᩹᩷), (r3v2 l.ۡ᩹᩷), (r3v6 l.ۡ᩹᩷) binds: [B:46:0x01a5, B:34:0x011f, B:87:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r6v5 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:46:0x01a5, B:34:0x011f, B:87:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:46:0x01a5, B:34:0x011f, B:87:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r15v5 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:46:0x01a5, B:34:0x011f, B:87:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01dd A[PHI: r5 r11 r12 r13
      0x01dd: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String), (r5v2 java.lang.String) binds: [B:50:0x01db, B:22:0x00a7, B:7:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:50:0x01db, B:22:0x00a7, B:7:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:50:0x01db, B:22:0x00a7, B:7:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:50:0x01db, B:22:0x00a7, B:7:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0289 A[PHI: r2 r4 r9 r14 r16 r17 r22
      0x0289: PHI (r2v4 com.tencent.mm.opensdk.modelmsg.SendAuth$Req) = 
      (r2v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r2v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r2v3 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r2v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r2v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r2v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
     binds: [B:64:0x0287, B:60:0x0269, B:42:0x0182, B:26:0x00ce, B:13:0x006f, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r4v4 java.lang.Object) = 
      (r4v2 java.lang.Object)
      (r4v2 java.lang.Object)
      (r4v2 java.lang.Object)
      (r4v3 java.lang.Object)
      (r4v2 java.lang.Object)
      (r4v2 java.lang.Object)
     binds: [B:64:0x0287, B:60:0x0269, B:42:0x0182, B:26:0x00ce, B:13:0x006f, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:64:0x0287, B:60:0x0269, B:42:0x0182, B:26:0x00ce, B:13:0x006f, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:64:0x0287, B:60:0x0269, B:42:0x0182, B:26:0x00ce, B:13:0x006f, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0287, B:60:0x0269, B:42:0x0182, B:26:0x00ce, B:13:0x006f, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:64:0x0287, B:60:0x0269, B:42:0x0182, B:26:0x00ce, B:13:0x006f, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r22v5 short) = (r22v3 short), (r22v4 short), (r22v3 short), (r22v3 short), (r22v3 short), (r22v3 short) binds: [B:64:0x0287, B:60:0x0269, B:42:0x0182, B:26:0x00ce, B:13:0x006f, B:10:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29038(final AbstractActivityC3346 abstractActivityC3346, final C19111 c19111) {
        int iM6981;
        int i;
        int i2;
        int i3 = C2958.f9394;
        int i4 = C7811.f24123;
        int iM2566 = (C0630.m2566("ᩳۖ") + i3) * (-39);
        int i5 = ((iM2566 ^ i4) * (-12383)) ^ 1761377680;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2566 ^ 297329041;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        int i11 = 946298178;
        short s2 = 0;
        String strM3005 = null;
        short[] sArr4 = null;
        int i12 = 0;
        Object value = null;
        InterfaceC9180 interfaceC9180 = null;
        SendAuth.Req req = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * 30175) >> 31));
            switch (i11) {
                case -2106460476:
                case 140057398:
                    ActivityC16234.m38197(interfaceC9180);
                    value = f35590.getValue();
                    if (C7106.m19120() <= 0) {
                        iM6981 = C2105.m6981("ܽܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    } else {
                        iM6981 = C0630.m2566("ۗܺ") ^ i3;
                        i = ((iM6981 ^ i4) * (-14919)) ^ 540947395;
                        i2 = 102444864;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1962024687:
                case -493817722:
                    req = new SendAuth.Req();
                    sArr4 = f35591;
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("ܿۗ") ^ i3;
                        i = ((iM6981 ^ i4) * 23303) ^ (-199339236);
                        i2 = -410238536;
                    } else {
                        iM6981 = C2105.m6981("ܽܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1820859017:
                case 1971271758:
                    sArr2 = f35591;
                    i10 = 68;
                    i12 = 8;
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("᩺ܰ") ^ i4;
                        i = ((iM6981 ^ i3) * (-7143)) ^ (-1015449361);
                        i2 = 2110313812;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܰᩳ")) * 85;
                        i = ((iM6981 ^ i3) * 25033) ^ (-495147865);
                        i2 = -128121435;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1778038940:
                case -1149993673:
                    if (((s2 * s2) + 91872225) - (s2 * s) < 0) {
                        iM6981 = (C0630.m2566("᩻ܶ") ^ i3) * (-67);
                        i = ((iM6981 ^ i4) * 31037) ^ (-1181816126);
                        i2 = 502782930;
                    } else {
                        iM6981 = (C0630.m2566("֫᩶") ^ i4) * (-99);
                        i = ((iM6981 ^ i3) * (-3357)) ^ 143424276;
                        i2 = 363364255;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1566428920:
                case -195315935:
                    sArr3 = f35591;
                    i7 = 91;
                    i8 = 15;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ۨ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-21531)) ^ 1819039419;
                        i2 = -739967025;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩹۠")) * 77;
                        i = ((iM6981 ^ i4) * (-30591)) ^ (-1389481448);
                        i2 = 112305078;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1552469239:
                case -1118350200:
                    s2 = sArr[c];
                    s = 19170;
                    if (C3683.f11629 >= 0) {
                        iM6981 = C2105.m6981("ܽܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    } else {
                        iM6981 = C0630.m2566("֡ᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-15977)) ^ (-1743078051);
                        i2 = 670386897;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1367259315:
                case -322717455:
                    C3683.m11210(abstractActivityC3346, C2958.m9031(sArr2, i10, i12, i9));
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("ۨ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-21531)) ^ 1819039419;
                        i2 = -739967025;
                    } else {
                        iM6981 = C2105.m6981("ܿ۠") ^ i4;
                        i = ((iM6981 ^ i3) * 20743) ^ (-875857248);
                        i2 = 1398854208;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1232445733:
                case -930847130:
                    sArr = f35591;
                    c = 'C';
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("ܽܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    } else {
                        iM6981 = C2105.m6981("ۨۙ") ^ i3;
                        i = ((iM6981 ^ i4) * 30485) ^ (-2082586828);
                        i2 = 1448424815;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1137478554:
                case 1524224105:
                    req.state = C3663.m11162(sArr3, i7, i8, i9);
                    interfaceC9180 = new InterfaceC9180() { // from class: l.᩵᩵ۡ

                        /* JADX INFO: renamed from: ۫ۡ᩷, reason: not valid java name and contains not printable characters */
                        private static final short[] f63525 = {5169, 23170, 23189, 23171, 23168, 16029, 1240, -10457, 23189, 23170, 23170, 23203, 23172, 23170};

                        {
                            int i13 = -1186897559;
                            int i14 = C3432.f10845;
                            int i15 = C0050.f910;
                            int iM6982 = C2105.m6981("۫᩶") ^ i14;
                            int i16 = ((iM6982 ^ i15) * (-26747)) ^ (-1471553277);
                            int i17 = 1011599107;
                            while (true) {
                                i13 = ((((i13 ^ i15) * (-4485)) >> 31) & i16) ^ (iM6982 ^ i17);
                                switch (i13) {
                                    case -2112516727:
                                    case -236874777:
                                        C2167.m7155();
                                        if (C4075.f12947 >= 0) {
                                            iM6982 = (i15 - C0630.m2566("᩹ۚ")) * (-109);
                                            i16 = ((iM6982 ^ i14) * 17829) ^ (-688098386);
                                            i17 = 1305303747;
                                        } else {
                                            iM6982 = C2105.m6981("᩻۫") ^ i14;
                                            i16 = ((iM6982 ^ i15) * (-13723)) ^ (-725454291);
                                            i17 = 1950108202;
                                        }
                                        break;
                                    case -2070353326:
                                    case 314837618:
                                        if (C4616.f14690 <= 0) {
                                            iM6982 = (i15 - C0630.m2566("᩹ۚ")) * (-109);
                                            i16 = ((iM6982 ^ i14) * 17829) ^ (-688098386);
                                            i17 = 1305303747;
                                        } else {
                                            iM6982 = C2105.m6981("᩻᩹") ^ i14;
                                            i16 = ((iM6982 ^ i15) * 12293) ^ (-435902335);
                                            i17 = -675598272;
                                        }
                                        break;
                                    case -1990234944:
                                    case 1147175275:
                                        if (C0422.f1886 <= 0) {
                                            iM6982 = C2105.m6981("᩷ܶ") ^ i14;
                                            i16 = ((iM6982 ^ i15) * 30125) ^ (-253263311);
                                            i17 = 241763802;
                                        } else {
                                            iM6982 = (C2105.m6981("ܿܰ") ^ i15) * 115;
                                            i16 = ((iM6982 ^ i14) * 15075) ^ 1076844914;
                                            i17 = 1816893788;
                                        }
                                        break;
                                    case -1946659798:
                                    case 786912241:
                                        if (C7106.f21815 != 0) {
                                            iM6982 = C2105.m6981("᩷ܶ") ^ i14;
                                            i16 = ((iM6982 ^ i15) * 30125) ^ (-253263311);
                                            i17 = 241763802;
                                        } else {
                                            iM6982 = C0630.m2566("ܽۘ") ^ i15;
                                            i16 = ((iM6982 ^ i14) * (-18437)) ^ 358627327;
                                            i17 = -1692296807;
                                        }
                                        break;
                                    case -1511726766:
                                    case -1200016579:
                                        if (C7811.f24123 >= 0) {
                                            iM6982 = (i14 - C0630.m2566("ۚۚ")) * (-25);
                                            i16 = ((iM6982 ^ i15) * 20345) ^ (-784133483);
                                            i17 = -1594289729;
                                        } else {
                                            iM6982 = (C2105.m6981("ۡ᩷") ^ i15) * (-103);
                                            i16 = ((iM6982 ^ i14) * (-5995)) ^ 495653933;
                                            i17 = -315757869;
                                        }
                                        break;
                                    case -1401845462:
                                    case -1273571610:
                                        return;
                                    case -1181127195:
                                    case -675281028:
                                        if (C4263.m12819() >= 0) {
                                            iM6982 = C2105.m6981("᩻۫") ^ i14;
                                            i16 = ((iM6982 ^ i15) * (-13723)) ^ (-725454291);
                                            i17 = 1950108202;
                                        } else {
                                            iM6982 = (i14 - C2105.m6981("ۢۗ")) * 11;
                                            i16 = ((iM6982 ^ i15) * (-25409)) ^ (-484450915);
                                            i17 = 1278091355;
                                        }
                                        break;
                                    case -1149344403:
                                    case 715827216:
                                        if (C21923.f70183 == 0) {
                                            iM6982 = (i15 - C0630.m2566("᩷۬")) * (-23);
                                            i16 = ((iM6982 ^ i14) * (-20143)) ^ (-252665005);
                                            i17 = 99330481;
                                        } else {
                                            iM6982 = C2105.m6981("᩻۫") ^ i14;
                                            i16 = ((iM6982 ^ i15) * (-13723)) ^ (-725454291);
                                            i17 = 1950108202;
                                        }
                                        break;
                                    case -1125003395:
                                    case 585074237:
                                        if (C4075.f12947 >= 0) {
                                            iM6982 = C2105.m6981("᩷ܶ") ^ i14;
                                            i16 = ((iM6982 ^ i15) * 30125) ^ (-253263311);
                                            i17 = 241763802;
                                        } else {
                                            iM6982 = (i15 - C0630.m2566("᩷۬")) * (-23);
                                            i16 = ((iM6982 ^ i14) * (-20143)) ^ (-252665005);
                                            i17 = 99330481;
                                        }
                                        break;
                                    case -1054135598:
                                    case 2030996832:
                                        C1420.m4913();
                                        throw new RuntimeException();
                                    case -887213820:
                                    case 1903571379:
                                        if (C3911.f12484 >= 0) {
                                            iM6982 = (i15 - C0630.m2566("᩹ۚ")) * (-109);
                                            i16 = ((iM6982 ^ i14) * 17829) ^ (-688098386);
                                            i17 = 1305303747;
                                        } else {
                                            iM6982 = (C0630.m2566("ۨۗ") ^ i15) * 35;
                                            i16 = ((iM6982 ^ i14) * (-30063)) ^ (-841659725);
                                            i17 = 1412738780;
                                        }
                                        break;
                                    case -389853858:
                                    case 1736729577:
                                        if (C2105.f7037 != 0) {
                                            iM6982 = (i15 - C0630.m2566("᩹ۚ")) * (-109);
                                            i16 = ((iM6982 ^ i14) * 17829) ^ (-688098386);
                                            i17 = 1305303747;
                                        } else {
                                            iM6982 = C0630.m2566("᩻᩵") ^ i14;
                                            i16 = ((iM6982 ^ i15) * (-14505)) ^ 2062459696;
                                            i17 = 225322831;
                                        }
                                        break;
                                    case -134779023:
                                    case 923842491:
                                        if (C0798.m2998() != 0) {
                                            iM6982 = C2105.m6981("᩷ܶ") ^ i14;
                                            i16 = ((iM6982 ^ i15) * 30125) ^ (-253263311);
                                            i17 = 241763802;
                                        } else {
                                            iM6982 = C0630.m2566("ۨܺ") ^ i15;
                                            i16 = ((iM6982 ^ i14) * 9075) ^ 223936666;
                                            i17 = 728090469;
                                        }
                                        break;
                                    case 384618538:
                                    case 1218386775:
                                        C2958.m9034();
                                        iM6982 = C2105.m6981("᩻۫") ^ i14;
                                        i16 = ((iM6982 ^ i15) * (-13723)) ^ (-725454291);
                                        i17 = 1950108202;
                                        break;
                                    case 1453134470:
                                    case 1655448630:
                                        if (C1128.f4106 <= 0) {
                                            iM6982 = (i15 - C0630.m2566("᩹ۚ")) * (-109);
                                            i16 = ((iM6982 ^ i14) * 17829) ^ (-688098386);
                                            i17 = 1305303747;
                                        } else {
                                            iM6982 = C2105.m6981("ۙۙ") ^ i14;
                                            i16 = ((iM6982 ^ i15) * (-20941)) ^ 1886052078;
                                            i17 = 2114629900;
                                        }
                                        break;
                                    default:
                                        if (C1916.f6442) {
                                            iM6982 = C0630.m2566("۫ۗ") ^ i14;
                                            i16 = ((iM6982 ^ i15) * 6663) ^ (-847651709);
                                            i17 = 1122232597;
                                        } else {
                                            iM6982 = C2105.m6981("᩷ܶ") ^ i14;
                                            i16 = ((iM6982 ^ i15) * 30125) ^ (-253263311);
                                            i17 = 241763802;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:31:0x00f4 A[PHI: r8 r9
                          0x00f4: PHI (r8v6 l.ۢ۠ۡ) = (r8v2 l.ۢ۠ۡ), (r8v3 l.ۢ۠ۡ), (r8v2 l.ۢ۠ۡ) binds: [B:114:0x00f4, B:30:0x00f2, B:10:0x0078] A[DONT_GENERATE, DONT_INLINE]
                          0x00f4: PHI (r9v6 l.ۗܺ᩷) = (r9v2 l.ۗܺ᩷), (r9v3 l.ۗܺ᩷), (r9v2 l.ۗܺ᩷) binds: [B:114:0x00f4, B:30:0x00f2, B:10:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // l.InterfaceC9180
                        public final void onResp(BaseResp baseResp) {
                            int iM6982;
                            int i13;
                            int i14;
                            short s3;
                            String str;
                            int iM6983;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int iM6984;
                            int i19;
                            int i20;
                            int i21;
                            int i22;
                            int iM2567;
                            int i23;
                            int i24;
                            int iM6985;
                            int i25;
                            int i26;
                            C19670 c19670 = this;
                            BaseResp baseResp2 = baseResp;
                            int i27 = C3432.f10845;
                            int i28 = C3019.f9544;
                            int iM6986 = C2105.m6981("۬᩵") ^ i27;
                            int i29 = ((iM6986 ^ i28) * (-20713)) ^ 1683880300;
                            final C19111 c19112 = null;
                            short[] sArr5 = null;
                            short[] sArr6 = null;
                            int i30 = iM6986 ^ (-1827194108);
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            char c2 = 0;
                            short s4 = 0;
                            int i34 = 0;
                            String strM3789 = null;
                            int i35 = 0;
                            int i36 = -1552853797;
                            short[] sArr7 = null;
                            String strM2575 = null;
                            String str2 = null;
                            final AbstractActivityC3346 abstractActivityC3347 = null;
                            InterfaceC9461 interfaceC9461 = null;
                            final C21374 c21374M11161 = null;
                            String str3 = null;
                            int i37 = 0;
                            while (true) {
                                i36 = i30 ^ (i29 & (((i36 ^ i28) * (-31057)) >> 31));
                                switch (i36) {
                                    case -1973525522:
                                    case 188183847:
                                        i31 = i31;
                                        sArr5 = sArr5;
                                        if (i35 != 0) {
                                            iM2567 = C0630.m2566("ۙ֡") ^ i27;
                                            i23 = ((iM2567 ^ i28) * (-12779)) ^ 251753395;
                                            i24 = 139427402;
                                        } else {
                                            iM2567 = (i28 - C2105.m6981("۠ܽ")) * (-111);
                                            i23 = ((iM2567 ^ i27) * (-1453)) ^ (-808698622);
                                            i24 = 383177007;
                                        }
                                        i26 = iM2567 ^ i24;
                                        sArr5 = sArr5;
                                        i22 = i31;
                                        i30 = i26;
                                        i29 = i23;
                                        i31 = i22;
                                        break;
                                    case -1850883708:
                                    case -560125796:
                                        i31 = i31;
                                        sArr5 = sArr5;
                                        int i38 = baseResp2.errCode;
                                        if (i38 == -2) {
                                            i35 = i38;
                                            iM2567 = (C0630.m2566("᩻ᩳ") ^ i28) * 37;
                                            i23 = ((iM2567 ^ i27) * (-18941)) ^ 1437154280;
                                            i24 = 1913446608;
                                            i26 = iM2567 ^ i24;
                                            sArr5 = sArr5;
                                            i22 = i31;
                                            i30 = i26;
                                            i29 = i23;
                                            i31 = i22;
                                        } else {
                                            int iM2568 = (C0630.m2566("ܰۖ") + i27) * 31;
                                            i35 = i38;
                                            i29 = ((iM2568 ^ i28) * (-10115)) ^ (-1794168013);
                                            i21 = iM2568 ^ 1741470492;
                                            sArr5 = sArr5;
                                            i22 = i31;
                                            i30 = i21;
                                            i31 = i22;
                                        }
                                        break;
                                    case -1745394161:
                                    case 1908616677:
                                        i31 = i31;
                                        String str4 = strM3789;
                                        sArr5 = sArr5;
                                        s4 = sArr7[c2];
                                        i34 = s4 * s4;
                                        if (C4263.f13799 > 0) {
                                            int iM6987 = C2105.m6981("ܽۤ") ^ i28;
                                            i15 = ((iM6987 ^ i27) * 29475) ^ (-2044092229);
                                            i17 = iM6987 ^ (-986289809);
                                            strM3789 = str4;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i17;
                                            i29 = i15;
                                            c19670 = this;
                                            baseResp2 = baseResp;
                                        } else {
                                            strM3789 = str4;
                                            i31 = i31;
                                            int iM6988 = C2105.m6981("ۖ᩹") ^ i27;
                                            i29 = (-2004565644) ^ ((iM6988 ^ i28) * (-18053));
                                            i30 = iM6988 ^ (-8054173);
                                            c19670 = this;
                                            baseResp2 = baseResp;
                                            sArr5 = sArr5;
                                        }
                                        break;
                                    case -1725350267:
                                    case 1251061544:
                                        C21923.m49329();
                                        if (C2126.f7087) {
                                            iM6982 = C2105.m6981("ܿܰ") ^ i28;
                                            i13 = ((iM6982 ^ i27) * (-28969)) ^ (-533374221);
                                            i14 = -1183702089;
                                        } else {
                                            iM6982 = (C0630.m2566("ܺܺ") + i28) * (-123);
                                            i13 = ((iM6982 ^ i27) * (-24249)) ^ (-1201165872);
                                            i14 = -815926983;
                                        }
                                        i30 = iM6982 ^ i14;
                                        i29 = i13;
                                        break;
                                    case -1697537174:
                                    case 941382126:
                                        i31 = i31;
                                        s3 = s4;
                                        str = strM3789;
                                        sArr5 = sArr5;
                                        c2 = 0;
                                        if (C2272.f7362) {
                                            iM6983 = (C0630.m2566("֡֫") ^ i28) * 75;
                                            i15 = ((iM6983 ^ i27) * 11249) ^ 857514738;
                                            i16 = -512304784;
                                        } else {
                                            iM6983 = (C2105.m6981("ܽۨ") ^ i27) * (-105);
                                            i15 = ((iM6983 ^ i28) * (-32459)) ^ (-1859533261);
                                            i16 = -876767616;
                                        }
                                        i17 = iM6983 ^ i16;
                                        strM3789 = str;
                                        s4 = s3;
                                        sArr5 = sArr5;
                                        i31 = i31;
                                        i30 = i17;
                                        i29 = i15;
                                        c19670 = this;
                                        baseResp2 = baseResp;
                                        break;
                                    case -1499317240:
                                    case 1644491582:
                                        i32 = 23280;
                                        iM6984 = C2105.m6981("᩺ۖ") ^ i27;
                                        i19 = ((iM6984 ^ i28) * (-7091)) ^ 533296592;
                                        i20 = 1689038453;
                                        i18 = iM6984 ^ i20;
                                        strM3789 = strM3789;
                                        i29 = i19;
                                        sArr5 = sArr5;
                                        i31 = i31;
                                        i30 = i18;
                                        c19670 = this;
                                        break;
                                    case -1118045046:
                                    case 1492125129:
                                        str2 = baseResp2.errStr;
                                        sArr6 = f63525;
                                        i31 = 8;
                                        i37 = 6;
                                        if (C3432.f10845 < 0) {
                                            iM6982 = C2105.m6981("֡ᩳ") ^ i28;
                                            i13 = ((iM6982 ^ i27) * (-16223)) ^ (-1862498352);
                                            i14 = 997700363;
                                            i30 = iM6982 ^ i14;
                                            i29 = i13;
                                        } else {
                                            sArr5 = sArr5;
                                            int iM6989 = C2105.m6981("ۖ᩹") ^ i27;
                                            i29 = (-2004565644) ^ ((iM6989 ^ i28) * (-18053));
                                            i30 = iM6989 ^ (-8054173);
                                            c19670 = this;
                                            baseResp2 = baseResp;
                                            sArr5 = sArr5;
                                        }
                                        break;
                                    case -982482509:
                                    case -690556407:
                                        C4159.m12575(str2, C4616.m13542(sArr6, i31, i37, i32));
                                        c19112.m44039(str2, false);
                                        break;
                                    case -776220991:
                                    case 1676804709:
                                        i31 = i31;
                                        sArr5 = sArr5;
                                        strM3789 = RunnableC1108.m3789(f63525, 1, 4, i32);
                                        if (C1128.m3851() > 0) {
                                            int iM69810 = (C2105.m6981("ܰ۬") ^ i28) * (-117);
                                            i29 = ((iM69810 ^ i27) * (-17439)) ^ (-1682931515);
                                            i18 = iM69810 ^ 114258885;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i18;
                                            c19670 = this;
                                        } else {
                                            i31 = i31;
                                            int iM69811 = C2105.m6981("ۖ᩹") ^ i27;
                                            i29 = (-2004565644) ^ ((iM69811 ^ i28) * (-18053));
                                            i30 = iM69811 ^ (-8054173);
                                            c19670 = this;
                                            baseResp2 = baseResp;
                                            sArr5 = sArr5;
                                        }
                                        break;
                                    case -677661215:
                                    case 2114044626:
                                        i32 = 46182;
                                        iM6984 = C2105.m6981("᩺ۖ") ^ i27;
                                        i19 = ((iM6984 ^ i28) * (-7091)) ^ 533296592;
                                        i20 = 1689038453;
                                        i18 = iM6984 ^ i20;
                                        strM3789 = strM3789;
                                        i29 = i19;
                                        sArr5 = sArr5;
                                        i31 = i31;
                                        i30 = i18;
                                        c19670 = this;
                                        break;
                                    case -605396001:
                                    case -511546260:
                                        i31 = i31;
                                        str3 = ((SendAuth.Resp) baseResp2).code;
                                        sArr5 = f63525;
                                        i33 = 5;
                                        if (C21923.f70183 != 0) {
                                            iM6985 = (C2105.m6981("ᩳܽ") ^ i27) * 97;
                                            i23 = ((iM6985 ^ i28) * (-8191)) ^ 361344993;
                                            i25 = 2025948570;
                                        } else {
                                            iM6985 = C2105.m6981("ۧ᩻") ^ i28;
                                            i23 = ((iM6985 ^ i27) * 1057) ^ 595000615;
                                            i25 = -1514984215;
                                        }
                                        i26 = iM6985 ^ i25;
                                        i22 = i31;
                                        i30 = i26;
                                        i29 = i23;
                                        i31 = i22;
                                        break;
                                    case -473439349:
                                    case -451222184:
                                        C2520.m8026();
                                        C1128.m3851();
                                        break;
                                    case -441483634:
                                    case 637767973:
                                        i31 = i31;
                                        s3 = s4;
                                        str = strM3789;
                                        sArr5 = sArr5;
                                        sArr7 = f63525;
                                        if (C3432.m10477() > 0) {
                                            iM6983 = (C2105.m6981("᩸֫") ^ i28) * 101;
                                            i15 = ((iM6983 ^ i27) * 11231) ^ (-144011043);
                                            i16 = -114511359;
                                            i17 = iM6983 ^ i16;
                                            strM3789 = str;
                                            s4 = s3;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i17;
                                            i29 = i15;
                                            c19670 = this;
                                            baseResp2 = baseResp;
                                        } else {
                                            strM3789 = str;
                                            s4 = s3;
                                            i31 = i31;
                                            int iM69812 = C2105.m6981("ۖ᩹") ^ i27;
                                            i29 = (-2004565644) ^ ((iM69812 ^ i28) * (-18053));
                                            i30 = iM69812 ^ (-8054173);
                                            c19670 = this;
                                            baseResp2 = baseResp;
                                            sArr5 = sArr5;
                                        }
                                        break;
                                    case -67288703:
                                    case 1912048609:
                                        abstractActivityC3347 = abstractActivityC3346;
                                        interfaceC9461 = new InterfaceC9461() { // from class: l.ۚ᩵ۡ

                                            /* JADX INFO: renamed from: ܰ᩺ܿ, reason: not valid java name and contains not printable characters */
                                            private static final short[] f17187 = {357, 27442, 27429, 27443, 27440, 27439, 27438, 27443, 27429, 4316, -2846, 5578, -3423, 437, -7361, -3478, -7142, 3390, 27431, 27429, 27444, 27411, 27444, 27442, 27433, 27438, 27431, 27496, 27502, 27502, 27502, 27497};

                                            {
                                                int i39 = 261476939;
                                                int i40 = C1047.f3863;
                                                int i41 = C3683.f11629;
                                                int iM69813 = C2105.m6981("ۜᩴ") ^ i40;
                                                int i42 = ((iM69813 ^ i41) * 3747) ^ (-1022331236);
                                                int i43 = -1062639374;
                                                while (true) {
                                                    i39 = ((((i39 ^ i41) * 6157) >> 31) & i42) ^ (iM69813 ^ i43);
                                                    switch (i39) {
                                                        case -2024697888:
                                                        case -1430494664:
                                                            RunnableC0588.m2441();
                                                            if (C2105.f7037 == 0) {
                                                                iM69813 = (C2105.m6981("۫᩷") ^ i41) * 79;
                                                                i42 = ((iM69813 ^ i40) * 21981) ^ (-292392780);
                                                                i43 = -220041531;
                                                            } else {
                                                                iM69813 = C0630.m2566("ܿۗ") ^ i40;
                                                                i42 = ((iM69813 ^ i41) * 21549) ^ 250554510;
                                                                i43 = -568434613;
                                                            }
                                                            break;
                                                        case -2024115830:
                                                        case -280153616:
                                                            if (!AbstractC2021.m6574()) {
                                                                iM69813 = C0630.m2566("ܿۗ") ^ i40;
                                                                i42 = ((iM69813 ^ i41) * 21549) ^ 250554510;
                                                                i43 = -568434613;
                                                            } else {
                                                                iM69813 = (i40 - C0630.m2566("۫۫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                i42 = ((iM69813 ^ i41) * 28441) ^ 1960157589;
                                                                i43 = 1147217293;
                                                            }
                                                            break;
                                                        case -1615404651:
                                                        case 590959719:
                                                            if (C2105.f7037 != 0) {
                                                                iM69813 = C2105.m6981("᩺ۗ") ^ i41;
                                                                i42 = ((iM69813 ^ i40) * 9367) ^ (-1510730137);
                                                                i43 = 1943369104;
                                                            } else {
                                                                iM69813 = (C2105.m6981("ܺ۫") ^ i41) * 57;
                                                                i42 = ((iM69813 ^ i40) * (-7251)) ^ (-628769363);
                                                                i43 = 150486850;
                                                            }
                                                            break;
                                                        case -1560001548:
                                                        case -1357572489:
                                                            if (C5695.f17556 >= 0) {
                                                                iM69813 = C2105.m6981("᩺ۗ") ^ i41;
                                                                i42 = ((iM69813 ^ i40) * 9367) ^ (-1510730137);
                                                                i43 = 1943369104;
                                                            } else {
                                                                iM69813 = (i40 - C0630.m2566("ᩴ֫")) * (-115);
                                                                i42 = ((iM69813 ^ i41) * (-17239)) ^ 276096841;
                                                                i43 = 849916042;
                                                            }
                                                            break;
                                                        case -1356331960:
                                                        case 1476237586:
                                                            if (RunnableC3474.f10992 <= 0) {
                                                                iM69813 = (C2105.m6981("۫᩷") ^ i41) * 79;
                                                                i42 = ((iM69813 ^ i40) * 21981) ^ (-292392780);
                                                                i43 = -220041531;
                                                            } else {
                                                                iM69813 = (C0630.m2566("ۚ᩻") ^ i41) * (-61);
                                                                i42 = ((iM69813 ^ i40) * (-7353)) ^ 1907602969;
                                                                i43 = 2131691085;
                                                            }
                                                            break;
                                                        case -1281245397:
                                                        case -993604503:
                                                            if (C1420.f5096 <= 0) {
                                                                iM69813 = (C2105.m6981("۫᩷") ^ i41) * 79;
                                                                i42 = ((iM69813 ^ i40) * 21981) ^ (-292392780);
                                                                i43 = -220041531;
                                                            } else {
                                                                iM69813 = (i40 - C0630.m2566("۠ܶ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                i42 = ((iM69813 ^ i41) * 7225) ^ (-302749194);
                                                                i43 = 1991165552;
                                                            }
                                                            break;
                                                        case -918638248:
                                                        case 1063291605:
                                                            if (C0630.m2564()) {
                                                                iM69813 = C0630.m2566("ۖᩳ") ^ i41;
                                                                i42 = ((iM69813 ^ i40) * 24673) ^ 1295640127;
                                                                i43 = 1207088761;
                                                            } else {
                                                                iM69813 = C2105.m6981("۠֨") ^ i41;
                                                                i42 = ((iM69813 ^ i40) * 411) ^ (-796593785);
                                                                i43 = 1536298322;
                                                            }
                                                            break;
                                                        case -906288011:
                                                        case -485201520:
                                                            RunnableC3474.m10630();
                                                            iM69813 = C0630.m2566("ۖᩳ") ^ i41;
                                                            i42 = ((iM69813 ^ i40) * 24673) ^ 1295640127;
                                                            i43 = 1207088761;
                                                            break;
                                                        case -774175777:
                                                        case 360005787:
                                                            if (C0964.m3413()) {
                                                                iM69813 = (i41 - C0630.m2566("ۘ᩷")) * 19;
                                                                i42 = ((iM69813 ^ i40) * (-591)) ^ (-2062920932);
                                                                i43 = -36223276;
                                                            } else {
                                                                iM69813 = (C2105.m6981("۫᩷") ^ i41) * 79;
                                                                i42 = ((iM69813 ^ i40) * 21981) ^ (-292392780);
                                                                i43 = -220041531;
                                                            }
                                                            break;
                                                        case -606672866:
                                                        case 2092988849:
                                                            if (RunnableC0588.m2441() >= 0) {
                                                                iM69813 = C0630.m2566("ۖᩳ") ^ i41;
                                                                i42 = ((iM69813 ^ i40) * 24673) ^ 1295640127;
                                                                i43 = 1207088761;
                                                            } else {
                                                                iM69813 = C0630.m2566("᩵ۡ") ^ i40;
                                                                i42 = ((iM69813 ^ i41) * 10257) ^ 490049018;
                                                                i43 = 315482096;
                                                            }
                                                            break;
                                                        case -574893827:
                                                        case 1208143874:
                                                            return;
                                                        case 234586806:
                                                        case 1176555392:
                                                            if (C1504.f5354) {
                                                                iM69813 = C0630.m2566("ܿۗ") ^ i40;
                                                                i42 = ((iM69813 ^ i41) * 21549) ^ 250554510;
                                                                i43 = -568434613;
                                                            } else {
                                                                iM69813 = C2105.m6981("ܰ᩵") ^ i41;
                                                                i42 = ((iM69813 ^ i40) * 13731) ^ 2107169721;
                                                                i43 = -1552244294;
                                                            }
                                                            break;
                                                        case 790280267:
                                                        case 1305576067:
                                                            if (C2958.m9034() <= 0) {
                                                                iM69813 = C0630.m2566("ۖᩳ") ^ i41;
                                                                i42 = ((iM69813 ^ i40) * 24673) ^ 1295640127;
                                                                i43 = 1207088761;
                                                            } else {
                                                                iM69813 = C2105.m6981("ۨ᩹") ^ i40;
                                                                i42 = ((iM69813 ^ i41) * 18447) ^ 449302198;
                                                                i43 = -1307017427;
                                                            }
                                                            break;
                                                        case 1399226970:
                                                        case 1948363160:
                                                            C3432.m10477();
                                                            if (ViewOnClickListenerC1958.f6529 <= 0) {
                                                                iM69813 = (i40 - C0630.m2566("۫۫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                i42 = ((iM69813 ^ i41) * 28441) ^ 1960157589;
                                                                i43 = 1147217293;
                                                            } else {
                                                                iM69813 = C0630.m2566("ۖᩳ") ^ i41;
                                                                i42 = ((iM69813 ^ i40) * 24673) ^ 1295640127;
                                                                i43 = 1207088761;
                                                            }
                                                            break;
                                                        case 1475002274:
                                                        case 2062518910:
                                                            if (C3911.f12484 >= 0) {
                                                                iM69813 = C2105.m6981("᩺ۗ") ^ i41;
                                                                i42 = ((iM69813 ^ i40) * 9367) ^ (-1510730137);
                                                                i43 = 1943369104;
                                                            } else {
                                                                iM69813 = C2105.m6981("֫ܶ") ^ i40;
                                                                i42 = ((iM69813 ^ i41) * (-18945)) ^ 995456878;
                                                                i43 = -981834880;
                                                            }
                                                            break;
                                                        default:
                                                            C3537.m10746();
                                                            throw new RuntimeException();
                                                    }
                                                }
                                            }

                                            @Override // l.InterfaceC9461
                                            /* JADX INFO: renamed from: ֫ */
                                            public final void mo1430(C23881 c23881) {
                                                int i39;
                                                int i40;
                                                short[] sArr8;
                                                short s5;
                                                short[] sArr9;
                                                int i41;
                                                int i42;
                                                short[] sArr10;
                                                short s6;
                                                int iM69813;
                                                int i43;
                                                int i44;
                                                int iM69814;
                                                int i45;
                                                int i46;
                                                int iM69815;
                                                int i47;
                                                int iM2569;
                                                int i48;
                                                int i49;
                                                int iM25610;
                                                int i50;
                                                int i51;
                                                int i52;
                                                short[] sArr11;
                                                int iM25611;
                                                int i53;
                                                int iM25612;
                                                int i54;
                                                C5558 c5558 = this;
                                                c23881 = c23881;
                                                int i55 = C5695.f17556;
                                                int i56 = RunnableC0588.f2309;
                                                int iM25613 = C0630.m2566("۬֡") ^ i55;
                                                int i57 = ((iM25613 ^ i56) * 15195) ^ 1804559598;
                                                short[] sArr12 = null;
                                                short[] sArr13 = null;
                                                short[] sArr14 = null;
                                                short[] sArr15 = null;
                                                int i58 = iM25613 ^ (-967813770);
                                                C19111 c19113 = null;
                                                int iM50604 = 0;
                                                int i59 = 0;
                                                int iM69816 = 0;
                                                int iM25614 = 0;
                                                int i60 = 0;
                                                int i61 = 0;
                                                int i62 = 0;
                                                int i63 = 0;
                                                int i64 = 0;
                                                char c3 = 0;
                                                short s7 = 0;
                                                int i65 = 0;
                                                int i66 = 0;
                                                int i67 = -646148824;
                                                int i68 = 0;
                                                while (true) {
                                                    i67 = i58 ^ (i57 & (((i67 ^ i56) * 28979) >> 31));
                                                    switch (i67) {
                                                        case -1729376687:
                                                        case 443568551:
                                                            i62 = 34262;
                                                            iM2569 = C0630.m2566("ܽܰ") ^ i55;
                                                            i48 = ((iM2569 ^ i56) * (-5551)) ^ (-906798001);
                                                            i49 = 403096135;
                                                            i51 = iM2569 ^ i49;
                                                            sArr13 = sArr13;
                                                            i66 = i66;
                                                            i68 = i68;
                                                            i57 = i48;
                                                            sArr14 = sArr14;
                                                            iM69816 = iM69816;
                                                            c23881 = c23881;
                                                            i58 = i51;
                                                            c5558 = this;
                                                            break;
                                                        case -1709995697:
                                                        case 557373083:
                                                            iM69816 = iM69816;
                                                            sArr10 = sArr14;
                                                            iM25614 = C0630.m2566(RunnableC1108.m3789(sArr10, i60, i61, i62));
                                                            if (C1916.m6308() < 0) {
                                                                iM25610 = (C2105.m6981("ۡۜ") ^ i55) * 55;
                                                                i57 = 1521070794 ^ ((iM25610 ^ i56) * (-10649));
                                                                i50 = 1586161491;
                                                                i51 = iM25610 ^ i50;
                                                                sArr14 = sArr10;
                                                                iM69816 = iM69816;
                                                                i58 = i51;
                                                                c5558 = this;
                                                            } else {
                                                                sArr14 = sArr10;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                int iM69817 = (i56 - C2105.m6981("᩷۠")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                iM69816 = iM69816;
                                                                c23881 = c23881;
                                                                i57 = ((iM69817 ^ i55) * 21673) ^ 1833833190;
                                                                i58 = iM69817 ^ 1479369247;
                                                                c5558 = this;
                                                            }
                                                            break;
                                                        case -1582039069:
                                                        case 362164468:
                                                            RunnableC3474.m10630();
                                                            if (C0630.f2410 <= 0) {
                                                                iM69816 = iM69816;
                                                                int iM25615 = (C0630.m2566("֡ۖ") ^ i55) * 59;
                                                                i57 = ((iM25615 ^ i56) * 3311) ^ 1285744918;
                                                                i39 = iM25615 ^ (-2105257484);
                                                                iM69816 = iM69816;
                                                                i58 = i39;
                                                                c23881 = c23881;
                                                            } else {
                                                                i52 = iM69816;
                                                                sArr11 = sArr14;
                                                                iM25611 = (i55 - C2105.m6981("ۙᩳ")) * (-35);
                                                                i57 = 891816681 ^ ((iM25611 ^ i56) * (-8087));
                                                                i53 = 1593607652;
                                                                i51 = iM25611 ^ i53;
                                                                c23881 = c23881;
                                                                iM69816 = i52;
                                                                sArr14 = sArr11;
                                                                i58 = i51;
                                                                c5558 = this;
                                                            }
                                                            break;
                                                        case -1485626056:
                                                        case 451033700:
                                                            c19113.m44039(AbstractC2021.m6563(c23881, iM69816), false);
                                                            C8058 c8058 = C8058.f24861;
                                                            break;
                                                        case -1450323193:
                                                        case -585465296:
                                                            c19113.m44038(2129779909 ^ iM25614);
                                                            C8058 c8059 = C8058.f24861;
                                                            break;
                                                        case -1401666673:
                                                        case -1165256389:
                                                            iM69816 = iM69816;
                                                            short[] sArr16 = sArr14;
                                                            c21374M11161.m48466();
                                                            boolean zM2131 = C0483.m2131(c23881);
                                                            c19113 = c19112;
                                                            if (zM2131) {
                                                                iM69815 = C2105.m6981("۟ۧ") ^ i55;
                                                                i57 = ((iM69815 ^ i56) * 547) ^ 1681859384;
                                                                i47 = 164178201;
                                                            } else {
                                                                iM69815 = C2105.m6981("ۨۤ") ^ i56;
                                                                i57 = ((iM69815 ^ i55) * 17153) ^ 184435532;
                                                                i47 = 1888807314;
                                                            }
                                                            i39 = iM69815 ^ i47;
                                                            sArr14 = sArr16;
                                                            iM69816 = iM69816;
                                                            i58 = i39;
                                                            c23881 = c23881;
                                                            break;
                                                        case -1324698789:
                                                        case -288835946:
                                                            i62 = 27456;
                                                            iM2569 = C0630.m2566("ܽܰ") ^ i55;
                                                            i48 = ((iM2569 ^ i56) * (-5551)) ^ (-906798001);
                                                            i49 = 403096135;
                                                            i51 = iM2569 ^ i49;
                                                            sArr13 = sArr13;
                                                            i66 = i66;
                                                            i68 = i68;
                                                            i57 = i48;
                                                            sArr14 = sArr14;
                                                            iM69816 = iM69816;
                                                            c23881 = c23881;
                                                            i58 = i51;
                                                            c5558 = this;
                                                            break;
                                                        case -1021784602:
                                                        case 47674557:
                                                            C3911.m11924();
                                                            if (!C2272.m7503()) {
                                                                i40 = iM69816;
                                                                sArr8 = sArr14;
                                                                s5 = s7;
                                                                sArr9 = sArr13;
                                                                i41 = i66;
                                                                i42 = i68;
                                                                iM69814 = C2105.m6981("۬᩹") ^ i56;
                                                                i45 = ((iM69814 ^ i55) * 20779) ^ 1259265257;
                                                                i46 = -669620747;
                                                                int i69 = iM69814 ^ i46;
                                                                i66 = i41;
                                                                i68 = i42;
                                                                i57 = i45;
                                                                sArr14 = sArr8;
                                                                sArr13 = sArr9;
                                                                iM69816 = i40;
                                                                s7 = s5;
                                                                i58 = i69;
                                                                c5558 = this;
                                                                c23881 = c23881;
                                                            } else {
                                                                iM69816 = iM69816;
                                                                sArr10 = sArr14;
                                                                iM25610 = C0630.m2566("۠۠") ^ i56;
                                                                i57 = 1985896463 ^ ((iM25610 ^ i55) * 22685);
                                                                i50 = -1939008677;
                                                                i51 = iM25610 ^ i50;
                                                                sArr14 = sArr10;
                                                                iM69816 = iM69816;
                                                                i58 = i51;
                                                                c5558 = this;
                                                            }
                                                            break;
                                                        case -913484507:
                                                        case 728213780:
                                                            i40 = iM69816;
                                                            sArr8 = sArr14;
                                                            s6 = s7;
                                                            sArr9 = sArr13;
                                                            i41 = i66;
                                                            i42 = i68;
                                                            sArr12 = f17187;
                                                            c3 = 0;
                                                            if (!C1005.f3721) {
                                                                s5 = s6;
                                                                iM69814 = C2105.m6981("۬᩹") ^ i56;
                                                                i45 = ((iM69814 ^ i55) * 20779) ^ 1259265257;
                                                                i46 = -669620747;
                                                                int i610 = iM69814 ^ i46;
                                                                i66 = i41;
                                                                i68 = i42;
                                                                i57 = i45;
                                                                sArr14 = sArr8;
                                                                sArr13 = sArr9;
                                                                iM69816 = i40;
                                                                s7 = s5;
                                                                i58 = i610;
                                                                c5558 = this;
                                                                c23881 = c23881;
                                                            } else {
                                                                iM69813 = C2105.m6981("ܺۨ") ^ i56;
                                                                i43 = ((iM69813 ^ i55) * 10239) ^ 517176708;
                                                                i44 = -1031044635;
                                                                int i70 = iM69813 ^ i44;
                                                                i66 = i41;
                                                                i68 = i42;
                                                                sArr13 = sArr9;
                                                                iM69816 = i40;
                                                                i58 = i70;
                                                                i57 = i43;
                                                                s7 = s6;
                                                                sArr14 = sArr8;
                                                                c5558 = this;
                                                                c23881 = c23881;
                                                            }
                                                            break;
                                                        case -815025555:
                                                        case 567996178:
                                                            C21923.m49329();
                                                            break;
                                                        case -453061978:
                                                        case 254631854:
                                                            iM69816 = iM69816;
                                                            sArr14 = f17187;
                                                            i60 = 9;
                                                            i61 = 3;
                                                            if (C22628.m50615() == 0) {
                                                                int iM69818 = (C2105.m6981("ܽۖ") + i56) * (-57);
                                                                i57 = (-1486278055) ^ ((iM69818 ^ i55) * 24227);
                                                                i51 = iM69818 ^ 748887831;
                                                                iM69816 = iM69816;
                                                                i58 = i51;
                                                                c5558 = this;
                                                            } else {
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                int iM69819 = (i56 - C2105.m6981("᩷۠")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                iM69816 = iM69816;
                                                                c23881 = c23881;
                                                                i57 = ((iM69819 ^ i55) * 21673) ^ 1833833190;
                                                                i58 = iM69819 ^ 1479369247;
                                                                c5558 = this;
                                                            }
                                                            break;
                                                        case -378549567:
                                                        case 973571721:
                                                            iM69816 = iM69816;
                                                            sArr10 = sArr14;
                                                            if (C22628.m50604(c23881) == 1600) {
                                                                iM25610 = (i55 - C0630.m2566("ۛ᩷")) * 77;
                                                                i57 = (-638009396) ^ ((iM25610 ^ i56) * (-10621));
                                                                i50 = 440922110;
                                                            } else {
                                                                iM25610 = C2105.m6981("۟ۛ") ^ i56;
                                                                i57 = 847834117 ^ ((iM25610 ^ i55) * 28201);
                                                                i50 = -1606255642;
                                                            }
                                                            i51 = iM25610 ^ i50;
                                                            sArr14 = sArr10;
                                                            iM69816 = iM69816;
                                                            i58 = i51;
                                                            c5558 = this;
                                                            break;
                                                        case -181336701:
                                                        case 1527184919:
                                                            iM69816 = iM69816;
                                                            sArr10 = sArr14;
                                                            sArr13 = f17187;
                                                            i66 = 1;
                                                            i68 = 8;
                                                            if (C1128.f4106 <= 0) {
                                                                iM25610 = C0630.m2566("۠۠") ^ i56;
                                                                i57 = 1985896463 ^ ((iM25610 ^ i55) * 22685);
                                                                i50 = -1939008677;
                                                            } else {
                                                                iM25610 = (C2105.m6981("ᩴ᩶") ^ i56) * (-97);
                                                                i57 = 344244899 ^ ((iM25610 ^ i55) * 15929);
                                                                i50 = 1590216470;
                                                            }
                                                            i51 = iM25610 ^ i50;
                                                            sArr14 = sArr10;
                                                            iM69816 = iM69816;
                                                            i58 = i51;
                                                            c5558 = this;
                                                            break;
                                                        case -166978843:
                                                        case 1212803522:
                                                            iM69816 = iM69816;
                                                            sArr14 = sArr14;
                                                            sArr13 = sArr13;
                                                            i66 = i66;
                                                            i68 = i68;
                                                            C3683.m11210(c23881, C0422.m1955(sArr13, i66, i68, i62));
                                                            if (C22628.m50615() == 0) {
                                                                iM2569 = C0630.m2566("ܳۤ") ^ i55;
                                                                i48 = ((iM2569 ^ i56) * 1547) ^ (-656528969);
                                                                i49 = 1094944201;
                                                                i51 = iM2569 ^ i49;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                i57 = i48;
                                                                sArr14 = sArr14;
                                                                iM69816 = iM69816;
                                                                c23881 = c23881;
                                                                i58 = i51;
                                                                c5558 = this;
                                                            } else {
                                                                sArr14 = sArr14;
                                                                int iM698110 = (i56 - C2105.m6981("᩷۠")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                iM69816 = iM69816;
                                                                c23881 = c23881;
                                                                i57 = ((iM698110 ^ i55) * 21673) ^ 1833833190;
                                                                i58 = iM698110 ^ 1479369247;
                                                                c5558 = this;
                                                            }
                                                            break;
                                                        case 199198653:
                                                        case 1124808609:
                                                            byte[] bArrM52614 = c23881.m52614();
                                                            iM69816 = iM69816;
                                                            short[] sArr17 = f17187;
                                                            if (C7811.m20844() == 0) {
                                                                short[] sArr18 = sArr14;
                                                                int iM69820 = C2105.m6981(C0630.m2575(sArr17, 15, 3, i62)) ^ 2101523056;
                                                                if (C3432.f10845 < 0) {
                                                                    AbstractActivityC3346 abstractActivityC3348 = abstractActivityC3347;
                                                                    String strM946 = C0050.m946(abstractActivityC3348, iM69820);
                                                                    short[] sArr19 = f17187;
                                                                    if (C0714.f2697 < 0) {
                                                                        C2126.m7031(strM946, C4616.m13542(sArr19, 18, 14, i62));
                                                                        new ViewOnClickListenerC3441(abstractActivityC3348, c19113, bArrM52614, strM946);
                                                                    }
                                                                }
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                sArr14 = sArr18;
                                                                int iM698111 = (i56 - C2105.m6981("᩷۠")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                iM69816 = iM69816;
                                                                c23881 = c23881;
                                                                i57 = ((iM698111 ^ i55) * 21673) ^ 1833833190;
                                                                i58 = iM698111 ^ 1479369247;
                                                                c5558 = this;
                                                            } else {
                                                                int iM25616 = (C0630.m2566("֡ۖ") ^ i55) * 59;
                                                                i57 = ((iM25616 ^ i56) * 3311) ^ 1285744918;
                                                                i39 = iM25616 ^ (-2105257484);
                                                                iM69816 = iM69816;
                                                                i58 = i39;
                                                                c23881 = c23881;
                                                            }
                                                            break;
                                                        case 692782722:
                                                        case 855253251:
                                                            if (!C0422.m1963()) {
                                                                i40 = iM69816;
                                                                sArr8 = sArr14;
                                                                s5 = s7;
                                                                sArr9 = sArr13;
                                                                i41 = i66;
                                                                i42 = i68;
                                                                iM69814 = C2105.m6981("۬᩹") ^ i56;
                                                                i45 = ((iM69814 ^ i55) * 20779) ^ 1259265257;
                                                                i46 = -669620747;
                                                                int i611 = iM69814 ^ i46;
                                                                i66 = i41;
                                                                i68 = i42;
                                                                i57 = i45;
                                                                sArr14 = sArr8;
                                                                sArr13 = sArr9;
                                                                iM69816 = i40;
                                                                s7 = s5;
                                                                i58 = i611;
                                                                c5558 = this;
                                                                c23881 = c23881;
                                                            } else {
                                                                i52 = iM69816;
                                                                sArr11 = sArr14;
                                                                iM25611 = (i55 - C2105.m6981("ۙᩳ")) * (-35);
                                                                i57 = 891816681 ^ ((iM25611 ^ i56) * (-8087));
                                                                i53 = 1593607652;
                                                                i51 = iM25611 ^ i53;
                                                                c23881 = c23881;
                                                                iM69816 = i52;
                                                                sArr14 = sArr11;
                                                                i58 = i51;
                                                                c5558 = this;
                                                            }
                                                            break;
                                                        case 834458570:
                                                        case 1534105764:
                                                            i40 = iM69816;
                                                            sArr8 = sArr14;
                                                            sArr9 = sArr13;
                                                            i41 = i66;
                                                            i42 = i68;
                                                            s5 = sArr12[c3];
                                                            i65 = s5 * s5;
                                                            if (C3019.m9255() <= 0) {
                                                                iM69814 = C2105.m6981("۬᩹") ^ i56;
                                                                i45 = ((iM69814 ^ i55) * 20779) ^ 1259265257;
                                                                i46 = -669620747;
                                                            } else {
                                                                iM69814 = C0630.m2566("۟ܶ") ^ i55;
                                                                i45 = ((iM69814 ^ i56) * (-6581)) ^ 1867614816;
                                                                i46 = -1131719976;
                                                            }
                                                            int i612 = iM69814 ^ i46;
                                                            i66 = i41;
                                                            i68 = i42;
                                                            i57 = i45;
                                                            sArr14 = sArr8;
                                                            sArr13 = sArr9;
                                                            iM69816 = i40;
                                                            s7 = s5;
                                                            i58 = i612;
                                                            c5558 = this;
                                                            c23881 = c23881;
                                                            break;
                                                        case 868540313:
                                                        case 1106078551:
                                                            C4159.m12565();
                                                            C3245.m9925();
                                                            i52 = iM69816;
                                                            sArr11 = sArr14;
                                                            iM25611 = (i55 - C2105.m6981("ۙᩳ")) * (-35);
                                                            i57 = 891816681 ^ ((iM25611 ^ i56) * (-8087));
                                                            i53 = 1593607652;
                                                            i51 = iM25611 ^ i53;
                                                            c23881 = c23881;
                                                            iM69816 = i52;
                                                            sArr14 = sArr11;
                                                            i58 = i51;
                                                            c5558 = this;
                                                            break;
                                                        case 968449941:
                                                        case 1430622804:
                                                            i52 = iM69816;
                                                            sArr11 = sArr14;
                                                            iM50604 = C22628.m50604(c23881);
                                                            i59 = 9;
                                                            sArr15 = f17187;
                                                            i63 = 12;
                                                            i64 = 3;
                                                            if (RunnableC1108.f4040) {
                                                                iM25611 = C0630.m2566("ۛۡ") ^ i56;
                                                                i57 = 853472675 ^ ((iM25611 ^ i55) * 11505);
                                                                i53 = -1048397042;
                                                            } else {
                                                                iM25611 = (i55 - C2105.m6981("ۙᩳ")) * (-35);
                                                                i57 = 891816681 ^ ((iM25611 ^ i56) * (-8087));
                                                                i53 = 1593607652;
                                                            }
                                                            i51 = iM25611 ^ i53;
                                                            c23881 = c23881;
                                                            iM69816 = i52;
                                                            sArr14 = sArr11;
                                                            i58 = i51;
                                                            c5558 = this;
                                                            break;
                                                        case 1099903869:
                                                        case 1371319992:
                                                            i40 = iM69816;
                                                            sArr8 = sArr14;
                                                            i41 = i66;
                                                            i42 = i68;
                                                            s6 = s7;
                                                            sArr9 = sArr13;
                                                            if ((i65 + 5635876) - (s6 * 4748) < 0) {
                                                                iM69813 = C2105.m6981("ܶۤ") ^ i55;
                                                                i43 = ((iM69813 ^ i56) * 3493) ^ 605430872;
                                                                i44 = -146303074;
                                                            } else {
                                                                iM69813 = C0630.m2566("֡ܶ") ^ i56;
                                                                i43 = ((iM69813 ^ i55) * (-23001)) ^ (-1308157322);
                                                                i44 = 1999895692;
                                                            }
                                                            int i71 = iM69813 ^ i44;
                                                            i66 = i41;
                                                            i68 = i42;
                                                            sArr13 = sArr9;
                                                            iM69816 = i40;
                                                            i58 = i71;
                                                            i57 = i43;
                                                            s7 = s6;
                                                            sArr14 = sArr8;
                                                            c5558 = this;
                                                            c23881 = c23881;
                                                            break;
                                                        case 1484365767:
                                                        case 1853680346:
                                                            short[] sArr20 = sArr14;
                                                            iM69816 = C2105.m6981(C1773.m5917(sArr15, i63, i64, i62)) ^ 2103257909;
                                                            if (iM50604 == i59) {
                                                                iM25612 = (C2105.m6981("᩹ܺ") ^ i56) * 71;
                                                                i57 = (-672789130) ^ ((iM25612 ^ i55) * (-13007));
                                                                i54 = -910273806;
                                                            } else {
                                                                iM25612 = C0630.m2566("ᩴܶ") ^ i55;
                                                                i57 = 1027275938 ^ ((iM25612 ^ i56) * 10251);
                                                                i54 = 1246182957;
                                                            }
                                                            i58 = iM25612 ^ i54;
                                                            c5558 = this;
                                                            c23881 = c23881;
                                                            sArr14 = sArr20;
                                                            break;
                                                        default:
                                                            c19113.m44039(RunnableC3474.m10631(c23881, iM69816), true);
                                                            C8058 c80510 = C8058.f24861;
                                                            break;
                                                    }
                                                    return;
                                                }
                                            }
                                        };
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM6982 = C2105.m6981("ܿܰ") ^ i28;
                                            i13 = ((iM6982 ^ i27) * (-28969)) ^ (-533374221);
                                            i14 = -1183702089;
                                        } else {
                                            iM6982 = (C0630.m2566("᩷ܶ") ^ i27) * (-113);
                                            i13 = ((iM6982 ^ i28) * (-13801)) ^ 1092138583;
                                            i14 = 739460382;
                                        }
                                        i30 = iM6982 ^ i14;
                                        i29 = i13;
                                        break;
                                    case 366594687:
                                    case 1019021863:
                                        if (RunnableC1937.m6387() == 0) {
                                            C1005.m3499(new Thread(new RunnableC3609(str3, abstractActivityC3347, interfaceC9461, 0)));
                                        }
                                        iM6982 = (C0630.m2566("ܺܺ") + i28) * (-123);
                                        i13 = ((iM6982 ^ i27) * (-24249)) ^ (-1201165872);
                                        i14 = -815926983;
                                        i30 = iM6982 ^ i14;
                                        i29 = i13;
                                        break;
                                    case 437447033:
                                    case 1723975746:
                                        c21374M11161 = C3663.m11161(C2105.m6981(strM2575) ^ 2123823908);
                                        if (C22628.f73083 > 0) {
                                            iM6982 = (i28 - C2105.m6981("ܶ᩷")) * (-49);
                                            i13 = ((iM6982 ^ i27) * (-11491)) ^ (-185543547);
                                            i14 = 2142843584;
                                            i30 = iM6982 ^ i14;
                                            i29 = i13;
                                        } else {
                                            i31 = i31;
                                            s3 = s4;
                                            str = strM3789;
                                            sArr5 = sArr5;
                                            iM6983 = (C0630.m2566("֡֫") ^ i28) * 75;
                                            i15 = ((iM6983 ^ i27) * 11249) ^ 857514738;
                                            i16 = -512304784;
                                            i17 = iM6983 ^ i16;
                                            strM3789 = str;
                                            s4 = s3;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i17;
                                            i29 = i15;
                                            c19670 = this;
                                            baseResp2 = baseResp;
                                        }
                                        break;
                                    case 497970377:
                                    case 1806973169:
                                        AbstractC2021.m6574();
                                        i31 = i31;
                                        iM6985 = (C2105.m6981("ᩳܽ") ^ i27) * 97;
                                        i23 = ((iM6985 ^ i28) * (-8191)) ^ 361344993;
                                        i25 = 2025948570;
                                        i26 = iM6985 ^ i25;
                                        i22 = i31;
                                        i30 = i26;
                                        i29 = i23;
                                        i31 = i22;
                                        break;
                                    case 679510118:
                                    case 1209161069:
                                        sArr5 = sArr5;
                                        strM2575 = C0630.m2575(sArr5, i33, 3, i32);
                                        if (C1128.m3851() > 0) {
                                            iM2567 = C0630.m2566("֨᩻") ^ i27;
                                            i31 = i31;
                                            i23 = ((iM2567 ^ i28) * 8777) ^ 636423448;
                                            i24 = -740992327;
                                            i26 = iM2567 ^ i24;
                                            sArr5 = sArr5;
                                            i22 = i31;
                                            i30 = i26;
                                            i29 = i23;
                                            i31 = i22;
                                        } else {
                                            i31 = i31;
                                            s3 = s4;
                                            str = strM3789;
                                            iM6983 = (C0630.m2566("֡֫") ^ i28) * 75;
                                            i15 = ((iM6983 ^ i27) * 11249) ^ 857514738;
                                            i16 = -512304784;
                                            i17 = iM6983 ^ i16;
                                            strM3789 = str;
                                            s4 = s3;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i17;
                                            i29 = i15;
                                            c19670 = this;
                                            baseResp2 = baseResp;
                                        }
                                        break;
                                    case 680986584:
                                    case 694314718:
                                        i31 = i31;
                                        str = strM3789;
                                        sArr5 = sArr5;
                                        s3 = s4;
                                        if ((s3 * 12118) - (i34 + 36711481) <= 0) {
                                            iM6983 = (C2105.m6981("ܺ۫") ^ i27) * 27;
                                            i15 = ((iM6983 ^ i28) * 4763) ^ (-1956648265);
                                            i16 = 2067068637;
                                        } else {
                                            iM6983 = (i28 - C0630.m2566("ۖ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i15 = ((iM6983 ^ i27) * (-16245)) ^ 580881030;
                                            i16 = -462333115;
                                        }
                                        i17 = iM6983 ^ i16;
                                        strM3789 = str;
                                        s4 = s3;
                                        sArr5 = sArr5;
                                        i31 = i31;
                                        i30 = i17;
                                        i29 = i15;
                                        c19670 = this;
                                        baseResp2 = baseResp;
                                        break;
                                    case 713709208:
                                    case 792225104:
                                        c19112.m44041();
                                        break;
                                    case 1423134102:
                                    case 2054660074:
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM6982 = (C0630.m2566("ܺܺ") + i28) * (-123);
                                            i13 = ((iM6982 ^ i27) * (-24249)) ^ (-1201165872);
                                            i14 = -815926983;
                                            i30 = iM6982 ^ i14;
                                            i29 = i13;
                                        } else {
                                            i31 = i31;
                                            iM6985 = (C2105.m6981("ᩳܽ") ^ i27) * 97;
                                            i23 = ((iM6985 ^ i28) * (-8191)) ^ 361344993;
                                            i25 = 2025948570;
                                            i26 = iM6985 ^ i25;
                                            i22 = i31;
                                            i30 = i26;
                                            i29 = i23;
                                            i31 = i22;
                                        }
                                        break;
                                    case 1677128321:
                                    case 1680584360:
                                        i31 = i31;
                                        strM3789 = strM3789;
                                        sArr5 = sArr5;
                                        C3683.m11210(baseResp2, strM3789);
                                        c19112 = c19111;
                                        if (!c19112.m44040()) {
                                            iM6984 = C0630.m2566("᩻ܺ") ^ i27;
                                            i19 = ((iM6984 ^ i28) * 17039) ^ (-124893647);
                                            i20 = 616212147;
                                            i18 = iM6984 ^ i20;
                                            strM3789 = strM3789;
                                            i29 = i19;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i18;
                                            c19670 = this;
                                        } else {
                                            int iM2569 = C0630.m2566("ܶۗ") ^ i27;
                                            int i39 = ((iM2569 ^ i28) * (-5197)) ^ 740643207;
                                            i21 = iM2569 ^ (-978797668);
                                            strM3789 = strM3789;
                                            sArr5 = sArr5;
                                            i29 = i39;
                                            c19670 = this;
                                            i22 = i31;
                                            i30 = i21;
                                            i31 = i22;
                                        }
                                        break;
                                    case 1891370709:
                                    case 1979311881:
                                        break;
                                    default:
                                        C7811.m20844();
                                        if (C3663.m11168() < 0) {
                                            sArr5 = sArr5;
                                            int iM69813 = C2105.m6981("ۖ᩹") ^ i27;
                                            i29 = (-2004565644) ^ ((iM69813 ^ i28) * (-18053));
                                            i30 = iM69813 ^ (-8054173);
                                            c19670 = this;
                                            baseResp2 = baseResp;
                                            sArr5 = sArr5;
                                        } else {
                                            iM6982 = C2105.m6981("ܿܰ") ^ i28;
                                            i13 = ((iM6982 ^ i27) * (-28969)) ^ (-533374221);
                                            i14 = -1183702089;
                                            i30 = iM6982 ^ i14;
                                            i29 = i13;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (C0964.m3413()) {
                        int iM6982 = (i4 - C2105.m6981("۫᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM6982 ^ i3) * 14825) ^ (-1546714124);
                        i6 = iM6982 ^ 1522865591;
                    } else {
                        iM6981 = C2105.m6981("ۨ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-21531)) ^ 1819039419;
                        i2 = -739967025;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    }
                    break;
                case -979690205:
                case -975736178:
                    i9 = 43694;
                    iM6981 = (C0630.m2566("ܿ۬") ^ i3) * (-31);
                    i = ((iM6981 ^ i4) * (-3263)) ^ (-486189084);
                    i2 = 631611796;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -919279965:
                case -182727271:
                    C0798.m2998();
                    C5695.m16023();
                    break;
                case -868537371:
                case -684061508:
                    C1711.m5736();
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("ܽܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    } else {
                        iM6981 = (C0630.m2566("ۢܺ") ^ i3) * 109;
                        i = ((iM6981 ^ i4) * (-32419)) ^ 468902226;
                        i2 = 2025827790;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -552193545:
                case 650574255:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C0630.m2566("ۢܺ") ^ i3) * 109;
                        i = ((iM6981 ^ i4) * (-32419)) ^ 468902226;
                        i2 = 2025827790;
                    } else {
                        iM6981 = C2105.m6981("᩺ܰ") ^ i4;
                        i = ((iM6981 ^ i3) * (-7143)) ^ (-1015449361);
                        i2 = 2110313812;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -214356332:
                case -100323220:
                    strM3005 = C0798.m3005(f35591, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 13, i9);
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("ۖܺ") ^ i4;
                        i = ((iM6981 ^ i3) * 22299) ^ (-1158427761);
                        i2 = -1815039382;
                    } else {
                        iM6981 = C2105.m6981("᩺ܰ") ^ i4;
                        i = ((iM6981 ^ i3) * (-7143)) ^ (-1015449361);
                        i2 = 2110313812;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 97707177:
                case 2100815192:
                    C3537.m10746();
                    iM6981 = C2105.m6981("۬֨") ^ i3;
                    i = ((iM6981 ^ i4) * (-65)) ^ (-1168938450);
                    i2 = 3787570;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 110668755:
                case 313424983:
                    req.scope = C4159.m12578(sArr4, 76, 15, i9);
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C0630.m2566("ۢܺ") ^ i3) * 109;
                        i = ((iM6981 ^ i4) * (-32419)) ^ 468902226;
                        i2 = 2025827790;
                    } else {
                        iM6981 = (C2105.m6981("᩶ܰ") ^ i4) * 77;
                        i = ((iM6981 ^ i3) * 8737) ^ (-974332249);
                        i2 = 616646993;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 572566537:
                case 2080036410:
                    C4159.m12575(value, strM3005);
                    ((IWXAPI) value).sendReq(req);
                    break;
                case 667105709:
                case 814302955:
                    C0422.m1963();
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("۬֨") ^ i3;
                        i = ((iM6981 ^ i4) * (-65)) ^ (-1168938450);
                        i2 = 3787570;
                    } else {
                        iM6981 = C2105.m6981("ܽܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    i9 = 7589;
                    iM6981 = (C0630.m2566("ܿ۬") ^ i3) * (-31);
                    i = ((iM6981 ^ i4) * (-3263)) ^ (-486189084);
                    i2 = 631611796;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    static {
        C4147 c4147 = null;
        InterfaceC17230 interfaceC17230M34431 = null;
        C18964 c18964 = null;
        int i = -1313965116;
        int i2 = C3432.f10845;
        int i3 = C1420.f5096;
        int iM6981 = (C2105.m6981("᩻֨") ^ i3) * (-69);
        int i4 = ((iM6981 ^ i2) * 2407) ^ 1321820452;
        int i5 = 768450915;
        while (true) {
            i = ((((i ^ i2) * 11427) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1885907224:
                case 1753177736:
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = C0630.m2566("ۘ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12935) ^ 828116468;
                        i5 = 969112473;
                    } else {
                        iM6981 = C0630.m2566("᩵᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15533) ^ 1149168687;
                        i5 = 901911945;
                    }
                    break;
                case -1849264238:
                case -1200426821:
                    RunnableC0588.m2441();
                    throw new RuntimeException();
                case -1804541997:
                case 1611355048:
                    f35590 = C14407.m34431(c18964);
                    return;
                case -1755581152:
                case 374104841:
                    c4147 = new C4147();
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("۠ۖ") + i3) * (-25);
                        i4 = ((iM6981 ^ i2) * 26879) ^ (-772267862);
                        i5 = 497947154;
                    } else {
                        iM6981 = (C0630.m2566("᩹᩷") ^ i3) * (-71);
                        i4 = ((iM6981 ^ i2) * 31655) ^ 1926599578;
                        i5 = -1034699347;
                    }
                    break;
                case -1522434913:
                case -107823413:
                    c18964 = new C18964();
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C0630.m2566("ۖܺ") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-20347)) ^ 1140682792;
                        i5 = 1190841641;
                    } else {
                        iM6981 = (C2105.m6981("᩸ܶ") + i3) * (-7);
                        i4 = ((iM6981 ^ i2) * (-1089)) ^ (-852567571);
                        i5 = -1322417391;
                    }
                    break;
                case -1505837901:
                case -247173097:
                    if (C1005.f3721) {
                        iM6981 = (C2105.m6981("۫ۛ") ^ i2) * (-35);
                        i4 = ((iM6981 ^ i3) * 10391) ^ (-1117405374);
                        i5 = 497948117;
                    } else {
                        iM6981 = (C2105.m6981("۠ۖ") + i3) * (-25);
                        i4 = ((iM6981 ^ i2) * 26879) ^ (-772267862);
                        i5 = 497947154;
                    }
                    break;
                case -1438850059:
                case 215317941:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C2105.m6981("۠ۖ") + i3) * (-25);
                        i4 = ((iM6981 ^ i2) * 26879) ^ (-772267862);
                        i5 = 497947154;
                    } else {
                        iM6981 = (C2105.m6981("۬ܰ") ^ i2) * 119;
                        i4 = ((iM6981 ^ i3) * 20121) ^ 935778313;
                        i5 = -1795668209;
                    }
                    break;
                case -1341863732:
                case 333895358:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C2105.m6981("۬ܰ") ^ i2) * 119;
                        i4 = ((iM6981 ^ i3) * 20121) ^ 935778313;
                        i5 = -1795668209;
                    } else {
                        iM6981 = C2105.m6981("ۢۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6799)) ^ 1881972881;
                        i5 = 1750771478;
                    }
                    break;
                case -914785766:
                case -883944241:
                    interfaceC17230M34431 = C14407.m34431(c4147);
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("ۘܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4591) ^ 289408955;
                        i5 = 1641659973;
                    } else {
                        iM6981 = C0630.m2566("ۧ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2957)) ^ (-585513861);
                        i5 = 1651404226;
                    }
                    break;
                case -724746744:
                case -130281180:
                    f35589 = interfaceC17230M34431;
                    if (C4263.m12819() >= 0) {
                        iM6981 = C0630.m2566("ۧ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2957)) ^ (-585513861);
                        i5 = 1651404226;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܰۖ")) * (-121);
                        i4 = ((iM6981 ^ i3) * (-21099)) ^ (-1512692362);
                        i5 = -863237871;
                    }
                    break;
                case -679809717:
                case 1946073911:
                    C1128.m3851();
                    if (C1294.f4556 < 0) {
                        iM6981 = C0630.m2566("ۘ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12935) ^ 828116468;
                        i5 = 969112473;
                    } else {
                        iM6981 = (C2105.m6981("۬ܰ") ^ i2) * 119;
                        i4 = ((iM6981 ^ i3) * 20121) ^ 935778313;
                        i5 = -1795668209;
                    }
                    break;
                case -672173437:
                case 2047441348:
                    if (!C3663.f11553) {
                        iM6981 = (C2105.m6981("۠ۖ") + i3) * (-25);
                        i4 = ((iM6981 ^ i2) * 26879) ^ (-772267862);
                        i5 = 497947154;
                    } else {
                        iM6981 = (C0630.m2566("ۖܺ") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-20347)) ^ 1140682792;
                        i5 = 1190841641;
                    }
                    break;
                case -577948564:
                case 2092237204:
                    ViewOnClickListenerC1958.m6429();
                    C0050.m940();
                    iM6981 = (C2105.m6981("۬ܰ") ^ i2) * 119;
                    i4 = ((iM6981 ^ i3) * 20121) ^ 935778313;
                    i5 = -1795668209;
                    break;
                case -498824530:
                case 1980465337:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C0630.m2566("ۖܺ") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-20347)) ^ 1140682792;
                        i5 = 1190841641;
                    } else {
                        iM6981 = C2105.m6981("ۧ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-7935)) ^ 85822726;
                        i5 = -2003157196;
                    }
                    break;
                case 215090715:
                case 597657677:
                    if (C3245.m9925() != 0) {
                        iM6981 = C0630.m2566("ۧ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2957)) ^ (-585513861);
                        i5 = 1651404226;
                    } else {
                        iM6981 = C2105.m6981("᩵ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6477)) ^ (-1273275469);
                        i5 = -1494108527;
                    }
                    break;
                default:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("ۖܺ") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-20347)) ^ 1140682792;
                        i5 = 1190841641;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܺ᩹")) * (-53);
                        i4 = ((iM6981 ^ i3) * (-9845)) ^ 1332607645;
                        i5 = 225160171;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a A[PHI: r13
      0x009a: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:24:0x0098, B:10:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01a1 A[PHI: r1 r7 r8 r9 r12
      0x01a1: PHI (r1v5 java.lang.Object) = (r1v2 java.lang.Object), (r1v2 java.lang.Object), (r1v4 java.lang.Object), (r1v2 java.lang.Object) binds: [B:51:0x019f, B:47:0x017d, B:32:0x00ef, B:28:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:51:0x019f, B:47:0x017d, B:32:0x00ef, B:28:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:51:0x019f, B:47:0x017d, B:32:0x00ef, B:28:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:51:0x019f, B:47:0x017d, B:32:0x00ef, B:28:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:51:0x019f, B:47:0x017d, B:32:0x00ef, B:28:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01d3 A[PHI: r6
      0x01d3: PHI (r6v5 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:55:0x01d1, B:13:0x0063, B:5:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0209 A[PHI: r2 r5 r10
      0x0209: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:59:0x0207, B:43:0x015b, B:20:0x007c, B:13:0x0063, B:10:0x005a, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:59:0x0207, B:43:0x015b, B:20:0x007c, B:13:0x0063, B:10:0x005a, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:59:0x0207, B:43:0x015b, B:20:0x007c, B:13:0x0063, B:10:0x005a, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x023b A[PHI: r4 r18
      0x023b: PHI (r4v4 char) = (r4v3 char), (r4v2 char) binds: [B:63:0x0239, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:63:0x0239, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19044 m29034() {
        int iM2566;
        int i;
        int i2;
        int i3 = C1773.f6144;
        int i4 = C4616.f14690;
        int iM2567 = (C0630.m2566("ܶܳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i5 = ((iM2567 ^ i3) * (-29043)) ^ 553604117;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ 1429140615;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -846101331;
        String strM9934 = null;
        Object value = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 3297) >> 31));
            switch (i13) {
                case -1940321161:
                case -1737171045:
                    i11 = 22986;
                    iM2566 = C0630.m2566("֨ۢ") ^ i4;
                    i = ((iM2566 ^ i3) * 8923) ^ 1340071877;
                    i2 = -673857312;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1893341928:
                case 1707638712:
                    sArr = f35591;
                    c = 0;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("۠ۡ") ^ i3;
                        i = ((iM2566 ^ i4) * 20705) ^ 1900607693;
                        i2 = 23101473;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩸֫")) * 59;
                        i = ((iM2566 ^ i4) * 17465) ^ (-742134263);
                        i2 = 848244493;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1342985383:
                case 1627378486:
                    strM9934 = C3245.m9934(sArr2, i12, 13, i11);
                    if (C2126.m7040()) {
                        iM2566 = (i4 - C2105.m6981("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM2566 = C0630.m2566("۬ۡ") ^ i4;
                        i = ((iM2566 ^ i3) * 5207) ^ 1488610695;
                        i2 = 1094998910;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1295523794:
                case -261320697:
                    C2105.m6982();
                    if (C4159.f13567) {
                        iM2566 = (i4 - C2105.m6981("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM2566 = (C0630.m2566("֡ܰ") + i3) * 53;
                        i = ((iM2566 ^ i4) * 23553) ^ (-1760163128);
                        i2 = 1884110896;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1248773461:
                case 1644748065:
                    i11 = 28366;
                    iM2566 = C0630.m2566("֨ۢ") ^ i4;
                    i = ((iM2566 ^ i3) * 8923) ^ 1340071877;
                    i2 = -673857312;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1071512022:
                case 50845158:
                    if ((i10 * i10) - i9 > 0) {
                        iM2566 = C2105.m6981("۟۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-15133)) ^ (-1977297591);
                        i2 = -1428027050;
                    } else {
                        iM2566 = C2105.m6981("۫᩺") ^ i3;
                        i = ((iM2566 ^ i4) * (-7603)) ^ 2064871887;
                        i2 = -1691571278;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1045357544:
                case 1230330916:
                    i7 = s * s;
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C0630.m2566("֡ܰ") + i3) * 53;
                        i = ((iM2566 ^ i4) * 23553) ^ (-1760163128);
                        i2 = 1884110896;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ᩴۖ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i3) * 19059) ^ (-1291562152);
                        i2 = 404798385;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -768624909:
                case 783890807:
                    i8 = i7 + 21529600;
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C0630.m2566("ۘۨ") + i4) * (-119);
                        i = ((iM2566 ^ i3) * 16015) ^ 495346328;
                        i2 = -382449291;
                    } else {
                        iM2566 = C2105.m6981("ܰ۫") ^ i3;
                        i = ((iM2566 ^ i4) * (-7535)) ^ (-782672698);
                        i2 = -574354856;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -626732920:
                case 423291902:
                    i12 = 1;
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C2105.m6981("۠ᩴ") + i3) * (-11);
                        i = ((iM2566 ^ i4) * (-603)) ^ 1820632691;
                        i2 = 1326817084;
                    } else {
                        iM2566 = (C2105.m6981("ۧᩳ") + i3) * 127;
                        i = ((iM2566 ^ i4) * (-3565)) ^ (-1938711915);
                        i2 = 1351945640;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -619903649:
                case 1829541810:
                    i10 = s + s2;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (i4 - C2105.m6981("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩹᩹")) * 123;
                        i = ((iM2566 ^ i3) * (-9221)) ^ (-317795234);
                        i2 = 1519323082;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -585652967:
                case 929650744:
                    C0237.m1481();
                    return null;
                case -287567602:
                case -210137579:
                    i9 = i8 + i8;
                    s2 = 4640;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C0630.m2566("ۘۨ") + i4) * (-119);
                        i = ((iM2566 ^ i3) * 16015) ^ 495346328;
                        i2 = -382449291;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩺᩶")) * 109;
                        i = ((iM2566 ^ i4) * 965) ^ 1335951831;
                        i2 = 1043659885;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -244406246:
                case 351019675:
                    value = f35589.getValue();
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C0630.m2566("ۘۨ") + i4) * (-119);
                        i = ((iM2566 ^ i3) * 16015) ^ 495346328;
                        i2 = -382449291;
                    } else {
                        iM2566 = (C0630.m2566("᩸ۙ") + i3) * 37;
                        i = ((iM2566 ^ i4) * (-24041)) ^ (-598837166);
                        i2 = -2020495194;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -215100409:
                case 393341221:
                    C5695.m16023();
                    if (C0237.f1507 != 0) {
                        iM2566 = (i4 - C2105.m6981("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM2566 = C0630.m2566("۠ۡ") ^ i3;
                        i = ((iM2566 ^ i4) * 20705) ^ 1900607693;
                        i2 = 23101473;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -160954628:
                case 1039656220:
                    s = sArr[c];
                    if (C3663.m11168() >= 0) {
                        iM2566 = (i4 - C2105.m6981("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM2566 = C2105.m6981("ۡ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-1367)) ^ (-1392459731);
                        i2 = -418767161;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 110992777:
                case 1744787659:
                    C2126.m7031(value, strM9934);
                    return (C19044) value;
                case 803028438:
                case 1376495180:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (i4 - C2105.m6981("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM2566 = (C2105.m6981("۠ᩴ") + i3) * (-11);
                        i = ((iM2566 ^ i4) * (-603)) ^ 1820632691;
                        i2 = 1326817084;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 978454290:
                case 1179061557:
                    sArr2 = f35591;
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C0630.m2566("ۘۨ") + i4) * (-119);
                        i = ((iM2566 ^ i3) * 16015) ^ 495346328;
                        i2 = -382449291;
                    } else {
                        iM2566 = C2105.m6981("ܶ۬") ^ i4;
                        i = ((iM2566 ^ i3) * 3661) ^ 22307638;
                        i2 = -65017794;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    ServiceConnectionC3453.m10564();
                    iM2566 = (C0630.m2566("֡ܰ") + i3) * 53;
                    i = ((iM2566 ^ i4) * 23553) ^ (-1760163128);
                    i2 = 1884110896;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010a A[PHI: r13
      0x010a: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:33:0x0108, B:15:0x006a, B:12:0x0061, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d5 A[PHI: r3 r8 r11 r12
      0x01d5: PHI (r3v4 l.ۛ᩵ۡ) = (r3v2 l.ۛ᩵ۡ), (r3v2 l.ۛ᩵ۡ), (r3v2 l.ۛ᩵ۡ), (r3v2 l.ۛ᩵ۡ), (r3v6 l.ۛ᩵ۡ) binds: [B:52:0x01d3, B:37:0x0140, B:17:0x006e, B:15:0x006a, B:93:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r8v5 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:52:0x01d3, B:37:0x0140, B:17:0x006e, B:15:0x006a, B:93:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r11v5 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:52:0x01d3, B:37:0x0140, B:17:0x006e, B:15:0x006a, B:93:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:52:0x01d3, B:37:0x0140, B:17:0x006e, B:15:0x006a, B:93:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0227 A[PHI: r5
      0x0227: PHI (r5v4 char) = (r5v3 char), (r5v2 char) binds: [B:60:0x0225, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0256 A[PHI: r6 r7 r18
      0x0256: PHI (r6v3 short) = (r6v2 short), (r6v4 short) binds: [B:64:0x0254, B:56:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:64:0x0254, B:56:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:64:0x0254, B:56:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0287 A[PHI: r2 r9
      0x0287: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:68:0x0285, B:48:0x01b3, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:68:0x0285, B:48:0x01b3, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29035(AbstractActivityC3346 abstractActivityC3346, C19111 c19111) {
        int iM2566;
        int i;
        int i2;
        int i3 = C2520.f8000;
        int i4 = C1047.f3863;
        int iM6981 = C2105.m6981("ۜۧ") ^ i3;
        int i5 = ((iM6981 ^ i4) * 7883) ^ 1144570490;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ 1446032626;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 2023233172;
        C6263 c6263 = null;
        String strM2575 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 10479) >> 31));
            switch (i12) {
                case -2122202194:
                case 536888449:
                    s2 = 4316;
                    if (C1128.f4106 <= 0) {
                        iM2566 = (i3 - C2105.m6981("ᩳܺ")) * (-35);
                        i = ((iM2566 ^ i4) * 6975) ^ 1940109590;
                        i2 = 33989160;
                    } else {
                        iM2566 = C2105.m6981("֨᩷") ^ i3;
                        i = ((iM2566 ^ i4) * (-3173)) ^ (-1841953399);
                        i2 = 1744543963;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2069950385:
                case -329277120:
                    if ((s * s2) - i8 > 0) {
                        iM2566 = (C2105.m6981("᩵۟") + i4) * 75;
                        i = ((iM2566 ^ i3) * (-28845)) ^ (-1830692297);
                        i2 = 1859950455;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩻ܺ")) * (-23);
                        i = ((iM2566 ^ i4) * 2487) ^ (-229336149);
                        i2 = -1485894553;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1568460027:
                case -577460435:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (i3 - C2105.m6981("ᩳܺ")) * (-35);
                        i = ((iM2566 ^ i4) * 6975) ^ 1940109590;
                        i2 = 33989160;
                    } else {
                        iM2566 = (C0630.m2566("ܰۢ") + i3) * 9;
                        i = ((iM2566 ^ i4) * 8741) ^ 2109130156;
                        i2 = 1531175090;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1526739858:
                case 1181631885:
                    sArr2 = f35591;
                    i10 = 15;
                    if (C3746.m11369() >= 0) {
                        iM2566 = (C0630.m2566("ۧۤ") ^ i3) * (-65);
                        i = ((iM2566 ^ i4) * 32423) ^ (-43222108);
                        i2 = -1567144478;
                    } else {
                        iM2566 = (C0630.m2566("ۚۧ") ^ i3) * 15;
                        i = ((iM2566 ^ i4) * 22297) ^ (-33093854);
                        i2 = 411827056;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1518622317:
                case -1282343292:
                    sArr = f35591;
                    if (C2520.f8000 >= 0) {
                        iM2566 = (i4 - C2105.m6981("۟ۚ")) * (-73);
                        i = ((iM2566 ^ i3) * (-16731)) ^ (-822840113);
                        i2 = 352348662;
                    } else {
                        iM2566 = (C0630.m2566("᩻᩷") + i4) * (-85);
                        i = ((iM2566 ^ i3) * (-8425)) ^ (-2134970721);
                        i2 = 1901459035;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1451747936:
                case 1225388506:
                    C3683.m11210(abstractActivityC3346, strM2575);
                    if (m29034().m43900()) {
                        iM2566 = (i4 - C0630.m2566("۫ܶ")) * (-73);
                        i = ((iM2566 ^ i3) * (-26397)) ^ 1543973081;
                        i2 = -653967613;
                    } else {
                        iM2566 = C2105.m6981("᩹֨") ^ i4;
                        i = ((iM2566 ^ i3) * (-12593)) ^ 1443856009;
                        i2 = 1066276569;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1292555777:
                case 876512856:
                    c6263 = new C6263(abstractActivityC3346, c19111);
                    abstractActivityC3346.m10226(c6263);
                    if (C0964.f3626 != 0) {
                        iM2566 = (C0630.m2566("ۧۤ") ^ i3) * (-65);
                        i = ((iM2566 ^ i4) * 32423) ^ (-43222108);
                        i2 = -1567144478;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        int iM2567 = (i3 - C0630.m2566("ۘᩴ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM2567 ^ i4) * (-27253)) ^ 163920333;
                        i6 = iM2567 ^ (-539074170);
                    }
                    break;
                case -1148573171:
                case 2037584546:
                    s = sArr[c];
                    i7 = s * s;
                    if (C3746.f11829 <= 0) {
                        iM2566 = (i4 - C2105.m6981("۟ۚ")) * (-73);
                        i = ((iM2566 ^ i3) * (-16731)) ^ (-822840113);
                        i2 = 352348662;
                    } else {
                        iM2566 = (C0630.m2566("ۨܺ") + i4) * 91;
                        i = ((iM2566 ^ i3) * (-13113)) ^ 1719310137;
                        i2 = -1560334163;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1140502668:
                case -533006251:
                    RunnableC3474.m10630();
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C0630.m2566("ۘۧ") ^ i4) * 119;
                        i = ((iM2566 ^ i3) * (-26071)) ^ 1384637878;
                        i2 = 1053221523;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ᩳܺ")) * (-35);
                        i = ((iM2566 ^ i4) * 6975) ^ 1940109590;
                        i2 = 33989160;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -998806089:
                case -353431311:
                    if (C2126.m7040()) {
                        iM2566 = C2105.m6981("ᩳܽ") ^ i3;
                        i = ((iM2566 ^ i4) * (-2817)) ^ (-1930001702);
                        i2 = -1970290068;
                    } else {
                        iM2566 = (C0630.m2566("ۘۧ") ^ i4) * 119;
                        i = ((iM2566 ^ i3) * (-26071)) ^ 1384637878;
                        i2 = 1053221523;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -978296285:
                case 700550357:
                    C2126.m7040();
                    break;
                case -883282738:
                case 499611334:
                    i9 = 10633;
                    iM2566 = (C0630.m2566("ᩳۧ") ^ i4) * (-51);
                    i = ((iM2566 ^ i3) * 16525) ^ (-721747510);
                    i2 = 1955430711;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -753702054:
                case 147902205:
                    i9 = 1642;
                    iM2566 = (C0630.m2566("ᩳۧ") ^ i4) * (-51);
                    i = ((iM2566 ^ i3) * 16525) ^ (-721747510);
                    i2 = 1955430711;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -732709087:
                case 19411218:
                    C7811.m20844();
                    if (C2126.f7087) {
                        iM2566 = (C0630.m2566("ۧۤ") ^ i3) * (-65);
                        i = ((iM2566 ^ i4) * 32423) ^ (-43222108);
                        i2 = -1567144478;
                    } else {
                        iM2566 = (C0630.m2566("ۘۧ") ^ i4) * 119;
                        i = ((iM2566 ^ i3) * (-26071)) ^ 1384637878;
                        i2 = 1053221523;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -720178200:
                case 1406469966:
                    m29034().m43899(abstractActivityC3346, c6263);
                    break;
                case -670822122:
                case -351819564:
                    i8 = i7 + 4656964;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("ۧۤ") ^ i3) * (-65);
                        i = ((iM2566 ^ i4) * 32423) ^ (-43222108);
                        i2 = -1567144478;
                    } else {
                        iM2566 = C2105.m6981("ۤ֡") ^ i4;
                        i = ((iM2566 ^ i3) * (-3763)) ^ (-1956046545);
                        i2 = 217652730;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -129413418:
                case 2002332876:
                    c = 14;
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("ᩳܽ") ^ i3;
                        i = ((iM2566 ^ i4) * (-2817)) ^ (-1930001702);
                        i2 = -1970290068;
                    } else {
                        iM2566 = C0630.m2566("۫ۘ") ^ i3;
                        i = ((iM2566 ^ i4) * (-2875)) ^ 879386271;
                        i2 = -220788805;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -35027975:
                case 1468072097:
                    ViewOnClickListenerC1958.m6429();
                    C2167.m7155();
                    iM2566 = (C0630.m2566("ۧۤ") ^ i3) * (-65);
                    i = ((iM2566 ^ i4) * 32423) ^ (-43222108);
                    i2 = -1567144478;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 152326618:
                case 1879086545:
                    m29034().m43901();
                    iM2566 = C2105.m6981("᩹֨") ^ i4;
                    i = ((iM2566 ^ i3) * (-12593)) ^ 1443856009;
                    i2 = 1066276569;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 361182667:
                case 907470087:
                    i11 = 8;
                    if (C0798.f2919) {
                        iM2566 = (C0630.m2566("ۘۧ") ^ i4) * 119;
                        i = ((iM2566 ^ i3) * (-26071)) ^ 1384637878;
                        i2 = 1053221523;
                    } else {
                        iM2566 = (C2105.m6981("ۨܽ") ^ i3) * 75;
                        i = ((iM2566 ^ i4) * 4175) ^ 57742920;
                        i2 = 313263054;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM2575 = C0630.m2575(sArr2, i10, i11, i9);
                    if (C4616.m13552() != 0) {
                        iM2566 = (i3 - C2105.m6981("ᩳܺ")) * (-35);
                        i = ((iM2566 ^ i4) * 6975) ^ 1940109590;
                        i2 = 33989160;
                    } else {
                        iM2566 = (C0630.m2566("۟ᩴ") ^ i4) * 15;
                        i = ((iM2566 ^ i3) * (-16249)) ^ 619680746;
                        i2 = 52184702;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01a8 A[PHI: r1 r3 r10 r11 r15 r19
      0x01a8: PHI (r1v4 com.tencent.mm.opensdk.modelmsg.SendAuth$Req) = 
      (r1v3 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r1v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
      (r1v2 com.tencent.mm.opensdk.modelmsg.SendAuth$Req)
     binds: [B:47:0x01a6, B:43:0x017e, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r3v3 java.lang.Object) = (r3v2 java.lang.Object), (r3v2 java.lang.Object), (r3v4 java.lang.Object) binds: [B:47:0x01a6, B:43:0x017e, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:47:0x01a6, B:43:0x017e, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:47:0x01a6, B:43:0x017e, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:47:0x01a6, B:43:0x017e, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r19v9 l.ܿ۠᩵) = (r19v6 l.ܿ۠᩵), (r19v7 l.ܿ۠᩵), (r19v10 l.ܿ۠᩵) binds: [B:47:0x01a6, B:43:0x017e, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (l.C1294.f4556 >= 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m29037(final C22078 c22078, final ViewOnClickListenerC5850 viewOnClickListenerC5850) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        SendAuth.Req req;
        InterfaceC17230 interfaceC17230;
        int iM6981;
        int i5;
        int i6;
        int i7 = RunnableC0588.f2309;
        int i8 = C3746.f11829;
        int iM2568 = C0630.m2566("ۢ᩶") ^ i7;
        int i9 = ((iM2568 ^ i8) * 25637) ^ 1238215695;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i10 = iM2568 ^ 1571470144;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -2146953129;
        String strM5726 = null;
        Object value = null;
        InterfaceC17230 interfaceC17231 = null;
        SendAuth.Req req2 = null;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i8) * 29085) >> 31));
            switch (i15) {
                case -2074952020:
                case -1749342102:
                    interfaceC17231 = interfaceC17231;
                    sArr3 = f35591;
                    i13 = 39;
                    i14 = 15;
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C2105.m6981("ۚۢ") + i8) * 89;
                        i = ((iM2566 ^ i7) * 20559) ^ 1592031793;
                        i2 = -2118641657;
                    } else {
                        iM2566 = (C2105.m6981("֨۫") + i7) * (-29);
                        i = ((iM2566 ^ i8) * 21427) ^ (-55534458);
                        i2 = 1555634289;
                    }
                    InterfaceC17230 interfaceC17232 = interfaceC17231;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    interfaceC17231 = interfaceC17232;
                    break;
                case -2073365105:
                case 832862776:
                    if (C1916.f6442) {
                        req = req2;
                        interfaceC17230 = interfaceC17231;
                        iM6981 = C0630.m2566("ۜۡ") ^ i7;
                        i5 = ((iM6981 ^ i8) * 1657) ^ (-1591190359);
                        i6 = -1936612545;
                        int i16 = iM6981 ^ i6;
                        interfaceC17231 = interfaceC17230;
                        i10 = i16;
                        i9 = i5;
                        req2 = req;
                    }
                    int iM6982 = (C2105.m6981("ۛܳ") ^ i8) * 49;
                    req = req2;
                    i5 = ((iM6982 ^ i7) * (-3885)) ^ 1791581398;
                    i10 = iM6982 ^ 236428881;
                    i9 = i5;
                    req2 = req;
                    break;
                case -2011006519:
                case 1002171447:
                    interfaceC17230 = interfaceC17231;
                    s = sArr[c];
                    s2 = 23998;
                    if (C4117.f13076 > 0) {
                        req = req2;
                        iM6981 = (C0630.m2566("ۨ᩺") + i7) * 9;
                        i5 = ((iM6981 ^ i8) * 15843) ^ 1357585086;
                        i6 = -743477786;
                        int i17 = iM6981 ^ i6;
                        interfaceC17231 = interfaceC17230;
                        i10 = i17;
                        i9 = i5;
                        req2 = req;
                    } else {
                        interfaceC17231 = interfaceC17230;
                        int iM6983 = (C2105.m6981("ۛܳ") ^ i8) * 49;
                        req = req2;
                        i5 = ((iM6983 ^ i7) * (-3885)) ^ 1791581398;
                        i10 = iM6983 ^ 236428881;
                        i9 = i5;
                        req2 = req;
                    }
                    break;
                case -1582126436:
                case 672167820:
                    C3432.m10477();
                    C0630.m2564();
                    req = req2;
                    interfaceC17230 = interfaceC17231;
                    iM6981 = C2105.m6981("ܿ᩷") ^ i7;
                    i5 = ((iM6981 ^ i8) * (-19241)) ^ 315431956;
                    i6 = 728193178;
                    int i18 = iM6981 ^ i6;
                    interfaceC17231 = interfaceC17230;
                    i10 = i18;
                    i9 = i5;
                    req2 = req;
                    break;
                case -1377269584:
                case -373304668:
                    i11 = 40612;
                    iM2566 = (C0630.m2566("᩺ܿ") + i8) * (-85);
                    i = ((iM2566 ^ i7) * 4605) ^ 848184759;
                    i2 = -1787983061;
                    InterfaceC17230 interfaceC17233 = interfaceC17231;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    interfaceC17231 = interfaceC17233;
                    break;
                case -1342400895:
                case -704010513:
                    req = req2;
                    interfaceC17230 = interfaceC17231;
                    c = 23;
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ۜۡ") ^ i7;
                        i5 = ((iM6981 ^ i8) * 1657) ^ (-1591190359);
                        i6 = -1936612545;
                    } else {
                        iM6981 = (C0630.m2566("ۜۘ") ^ i8) * (-87);
                        i5 = ((iM6981 ^ i7) * 25071) ^ 1473478028;
                        i6 = -2077446456;
                    }
                    int i19 = iM6981 ^ i6;
                    interfaceC17231 = interfaceC17230;
                    i10 = i19;
                    i9 = i5;
                    req2 = req;
                    break;
                case -1298375635:
                case -1217101593:
                    C3911.m11924();
                    C1504.m5179();
                    break;
                case -1169481809:
                case -253360235:
                    interfaceC17231 = interfaceC17231;
                    if ((s * s2) - ((s * s) + 143976001) <= 0) {
                        iM2566 = (C2105.m6981("᩻᩶") + i8) * 9;
                        i = ((iM2566 ^ i7) * 5007) ^ (-213633131);
                        i2 = 808047344;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ۢ۠")) * (-45);
                        i = ((iM2566 ^ i8) * 4125) ^ (-1213911618);
                        i2 = -1772189497;
                    }
                    InterfaceC17230 interfaceC17234 = interfaceC17231;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    interfaceC17231 = interfaceC17234;
                    break;
                case -1001280709:
                case -955743774:
                    req = req2;
                    interfaceC17230 = interfaceC17231;
                    sArr = f35591;
                    if (C3537.m10746() <= 0) {
                        iM6981 = C2105.m6981("ܿ᩷") ^ i7;
                        i5 = ((iM6981 ^ i8) * (-19241)) ^ 315431956;
                        i6 = 728193178;
                    } else {
                        iM6981 = (C2105.m6981("ۚܺ") ^ i7) * 99;
                        i5 = ((iM6981 ^ i8) * 13765) ^ 2096362406;
                        i6 = 602040140;
                    }
                    int i110 = iM6981 ^ i6;
                    interfaceC17231 = interfaceC17230;
                    i10 = i110;
                    i9 = i5;
                    req2 = req;
                    break;
                case -779051925:
                case 359302933:
                    break;
                case -562872236:
                case 1284917360:
                    strM5726 = C1711.m5726(sArr4, 54, 13, i11);
                    if (C1773.f6144 > 0) {
                        iM2567 = C2105.m6981("᩷ᩴ") ^ i8;
                        i3 = ((iM2567 ^ i7) * (-26657)) ^ (-677671453);
                        i4 = 153312117;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                    } else {
                        req = req2;
                        interfaceC17230 = interfaceC17231;
                        iM6981 = C2105.m6981("ܿ᩷") ^ i7;
                        i5 = ((iM6981 ^ i8) * (-19241)) ^ 315431956;
                        i6 = 728193178;
                        int i111 = iM6981 ^ i6;
                        interfaceC17231 = interfaceC17230;
                        i10 = i111;
                        i9 = i5;
                        req2 = req;
                    }
                    break;
                case -519017898:
                case 1849118546:
                    interfaceC17231 = interfaceC17231;
                    req2.scope = C3663.m11162(sArr2, i12, 15, i11);
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("۫۠") ^ i7;
                        i = ((iM2566 ^ i8) * (-20831)) ^ (-613924664);
                        i2 = 496097141;
                    } else {
                        iM2566 = C2105.m6981("ۢᩴ") ^ i7;
                        i = ((iM2566 ^ i8) * 2385) ^ (-49088802);
                        i2 = 497659601;
                    }
                    InterfaceC17230 interfaceC17235 = interfaceC17231;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    interfaceC17231 = interfaceC17235;
                    break;
                case -144987353:
                case 1878613325:
                    C2126.m7031(value, strM5726);
                    ((IWXAPI) value).sendReq(req2);
                    break;
                case -21039857:
                case 896981319:
                    value = interfaceC17231.getValue();
                    sArr4 = f35591;
                    if (C0964.f3626 == 0) {
                        iM2567 = (C0630.m2566("ۗ᩶") ^ i7) * 95;
                        i3 = ((iM2567 ^ i8) * (-7873)) ^ (-2095473329);
                        i4 = 1757271104;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                    } else {
                        interfaceC17231 = interfaceC17231;
                        iM2566 = C2105.m6981("۫۠") ^ i7;
                        i = ((iM2566 ^ i8) * (-20831)) ^ (-613924664);
                        i2 = 496097141;
                        InterfaceC17230 interfaceC17236 = interfaceC17231;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                        interfaceC17231 = interfaceC17236;
                    }
                    break;
                case 160005263:
                case 1303008613:
                    interfaceC17231 = interfaceC17231;
                    req2 = new SendAuth.Req();
                    sArr2 = f35591;
                    i12 = 24;
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("۫۠") ^ i7;
                        i = ((iM2566 ^ i8) * (-20831)) ^ (-613924664);
                        i2 = 496097141;
                    } else {
                        iM2566 = (C0630.m2566("֫ܿ") ^ i8) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i7) * (-21639)) ^ (-1171895620);
                        i2 = -2136649087;
                    }
                    InterfaceC17230 interfaceC17237 = interfaceC17231;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    interfaceC17231 = interfaceC17237;
                    break;
                case 528887350:
                case 1045490367:
                    ActivityC16234.m38197(new InterfaceC9180() { // from class: l.֡᩵ۡ

                        /* JADX INFO: renamed from: ۘۖܺ, reason: not valid java name and contains not printable characters */
                        private static final short[] f2374 = {5337, 20866, 20885, 20867, 20864, 20885, 20866, 20866, 20899, 20868, 20866};

                        {
                            int i20 = -657138090;
                            int i21 = C4263.f13799;
                            int i22 = RunnableC3474.f10992;
                            int iM2569 = C0630.m2566("᩺ۖ") ^ i22;
                            int i23 = ((iM2569 ^ i21) * (-18647)) ^ 1777241290;
                            int i24 = 976665233;
                            while (true) {
                                i20 = ((((i20 ^ i21) * (-11181)) >> 31) & i23) ^ (iM2569 ^ i24);
                                switch (i20) {
                                    case -2116420266:
                                    case 1646360528:
                                        C2520.m8026();
                                        if (C2520.f8000 >= 0) {
                                            iM2569 = (i21 - C0630.m2566("۬ۛ")) * (-107);
                                            i23 = ((iM2569 ^ i22) * (-3101)) ^ (-974163572);
                                            i24 = -2029870535;
                                        } else {
                                            iM2569 = (i22 - C0630.m2566("֨ۧ")) * (-101);
                                            i23 = ((iM2569 ^ i21) * 21409) ^ 252926697;
                                            i24 = 141120396;
                                        }
                                        break;
                                    case -2033447655:
                                    case -989602681:
                                        C1504.m5179();
                                        if (C0422.f1886 > 0) {
                                            iM2569 = C0630.m2566("᩷ܿ") ^ i21;
                                            i23 = ((iM2569 ^ i22) * 7811) ^ (-1916968908);
                                            i24 = -931149044;
                                        } else {
                                            iM2569 = C2105.m6981("ۤ᩹") ^ i22;
                                            i23 = ((iM2569 ^ i21) * (-21051)) ^ 260810838;
                                            i24 = -533479186;
                                        }
                                        break;
                                    case -1697252460:
                                    case 1428993560:
                                        C0237.m1481();
                                        iM2569 = (i22 - C0630.m2566("֨ۧ")) * (-101);
                                        i23 = ((iM2569 ^ i21) * 21409) ^ 252926697;
                                        i24 = 141120396;
                                        break;
                                    case -1608334067:
                                    case 1456312854:
                                        C4117.m12364();
                                        C1420.m4913();
                                        throw new RuntimeException();
                                    case -1249604203:
                                    case -493925285:
                                        if (C3537.f11231 >= 0) {
                                            iM2569 = C0630.m2566("᩷ܿ") ^ i21;
                                            i23 = ((iM2569 ^ i22) * 7811) ^ (-1916968908);
                                            i24 = -931149044;
                                        } else {
                                            iM2569 = (i21 - C2105.m6981("۫۬")) * 5;
                                            i23 = ((iM2569 ^ i22) * 3711) ^ 1412337340;
                                            i24 = 752057800;
                                        }
                                        break;
                                    case -1211513882:
                                    case -271994388:
                                        return;
                                    case -1124483592:
                                    case 1917395512:
                                        if (C0798.f2919) {
                                            iM2569 = C0630.m2566("᩷ܿ") ^ i21;
                                            i23 = ((iM2569 ^ i22) * 7811) ^ (-1916968908);
                                            i24 = -931149044;
                                        } else {
                                            iM2569 = C0630.m2566("ܺ᩵") ^ i22;
                                            i23 = ((iM2569 ^ i21) * (-25989)) ^ 178259338;
                                            i24 = -1578001230;
                                        }
                                        break;
                                    case -1071928476:
                                    case 1419517668:
                                        if (C3245.m9925() != 0) {
                                            iM2569 = C2105.m6981("᩷᩷") ^ i21;
                                            i23 = ((iM2569 ^ i22) * (-23471)) ^ (-1762571157);
                                            i24 = -1298961711;
                                        } else {
                                            iM2569 = C0630.m2566("᩺ܳ") ^ i21;
                                            i23 = ((iM2569 ^ i22) * 25149) ^ 1407437446;
                                            i24 = -2087268041;
                                        }
                                        break;
                                    case -671401199:
                                    case -168274131:
                                        if (C1005.f3721) {
                                            iM2569 = (C0630.m2566("ᩴۛ") ^ i22) * (-75);
                                            i23 = ((iM2569 ^ i21) * 25937) ^ 1690790276;
                                            i24 = 2045208005;
                                        } else {
                                            iM2569 = C2105.m6981("ۤ᩹") ^ i22;
                                            i23 = ((iM2569 ^ i21) * (-21051)) ^ 260810838;
                                            i24 = -533479186;
                                        }
                                        break;
                                    case -301286875:
                                    case 689637163:
                                        if (C4159.f13567) {
                                            iM2569 = C0630.m2566("᩸ᩴ") ^ i22;
                                            i23 = ((iM2569 ^ i21) * (-12687)) ^ (-1756101975);
                                            i24 = 329294185;
                                        } else {
                                            iM2569 = (i22 - C0630.m2566("֨ۧ")) * (-101);
                                            i23 = ((iM2569 ^ i21) * 21409) ^ 252926697;
                                            i24 = 141120396;
                                        }
                                        break;
                                    case -273458581:
                                    case 1541360800:
                                        if (C4263.f13799 <= 0) {
                                            iM2569 = (i21 - C0630.m2566("۬ۛ")) * (-107);
                                            i23 = ((iM2569 ^ i22) * (-3101)) ^ (-974163572);
                                            i24 = -2029870535;
                                        } else {
                                            iM2569 = (C2105.m6981("᩶֫") + i21) * 25;
                                            i23 = ((iM2569 ^ i22) * 13025) ^ 105736900;
                                            i24 = 1612997485;
                                        }
                                        break;
                                    case -191582839:
                                    case 697559191:
                                        if (C7811.f24123 >= 0) {
                                            iM2569 = (i22 - C0630.m2566("֨ۧ")) * (-101);
                                            i23 = ((iM2569 ^ i21) * 21409) ^ 252926697;
                                            i24 = 141120396;
                                        } else {
                                            iM2569 = C0630.m2566("ۙۢ") ^ i21;
                                            i23 = ((iM2569 ^ i22) * (-27043)) ^ (-69457742);
                                            i24 = -2116517996;
                                        }
                                        break;
                                    case -151282308:
                                    case 664787328:
                                        if (C0422.f1886 <= 0) {
                                            iM2569 = C0630.m2566("᩷ܿ") ^ i21;
                                            i23 = ((iM2569 ^ i22) * 7811) ^ (-1916968908);
                                            i24 = -931149044;
                                        } else {
                                            iM2569 = (C2105.m6981("ۧܿ") ^ i22) * (-113);
                                            i23 = ((iM2569 ^ i21) * (-21505)) ^ 1438142673;
                                            i24 = 844560662;
                                        }
                                        break;
                                    case -64956020:
                                    case 1571144639:
                                        ViewOnClickListenerC1958.m6429();
                                        if (!C0382.f1805) {
                                            iM2569 = C2105.m6981("ۤ᩹") ^ i22;
                                            i23 = ((iM2569 ^ i21) * (-21051)) ^ 260810838;
                                            i24 = -533479186;
                                        } else {
                                            iM2569 = (i21 - C0630.m2566("۬ۛ")) * (-107);
                                            i23 = ((iM2569 ^ i22) * (-3101)) ^ (-974163572);
                                            i24 = -2029870535;
                                        }
                                        break;
                                    case 259629719:
                                    case 1424517567:
                                        if (C3911.m11924() <= 0) {
                                            iM2569 = (i21 - C0630.m2566("۬ۛ")) * (-107);
                                            i23 = ((iM2569 ^ i22) * (-3101)) ^ (-974163572);
                                            i24 = -2029870535;
                                        } else {
                                            iM2569 = C2105.m6981("ܿ᩵") ^ i21;
                                            i23 = ((iM2569 ^ i22) * 4865) ^ 191515759;
                                            i24 = -1029222590;
                                        }
                                        break;
                                    default:
                                        if (C0630.m2564()) {
                                            iM2569 = C0630.m2566("᩷ܿ") ^ i21;
                                            i23 = ((iM2569 ^ i22) * 7811) ^ (-1916968908);
                                            i24 = -931149044;
                                        } else {
                                            iM2569 = C2105.m6981("ۜܰ") ^ i22;
                                            i23 = ((iM2569 ^ i21) * (-6543)) ^ 143815657;
                                            i24 = 1855173870;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:80:0x0326 A[PHI: r12 r16 r17 r19 r23 r25 r26
                          0x0326: PHI (r12v5 short) = (r12v2 short), (r12v2 short), (r12v3 short), (r12v2 short) binds: [B:79:0x0324, B:75:0x0303, B:67:0x02a6, B:12:0x008b] A[DONT_GENERATE, DONT_INLINE]
                          0x0326: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:79:0x0324, B:75:0x0303, B:67:0x02a6, B:12:0x008b] A[DONT_GENERATE, DONT_INLINE]
                          0x0326: PHI (r17v5 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:79:0x0324, B:75:0x0303, B:67:0x02a6, B:12:0x008b] A[DONT_GENERATE, DONT_INLINE]
                          0x0326: PHI (r19v5 int) = (r19v2 int), (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:79:0x0324, B:75:0x0303, B:67:0x02a6, B:12:0x008b] A[DONT_GENERATE, DONT_INLINE]
                          0x0326: PHI (r23v22 java.lang.String) = (r23v2 java.lang.String), (r23v3 java.lang.String), (r23v5 java.lang.String), (r23v23 java.lang.String) binds: [B:79:0x0324, B:75:0x0303, B:67:0x02a6, B:12:0x008b] A[DONT_GENERATE, DONT_INLINE]
                          0x0326: PHI (r25v18 short[]) = (r25v0 short[]), (r25v1 short[]), (r25v3 short[]), (r25v19 short[]) binds: [B:79:0x0324, B:75:0x0303, B:67:0x02a6, B:12:0x008b] A[DONT_GENERATE, DONT_INLINE]
                          0x0326: PHI (r26v17 int) = (r26v0 int), (r26v1 int), (r26v3 int), (r26v18 int) binds: [B:79:0x0324, B:75:0x0303, B:67:0x02a6, B:12:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
                        
                            if (l.C3746.m11369() < 0) goto L8;
                         */
                        @Override // l.InterfaceC9180
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onResp(BaseResp baseResp) {
                            int iM2569;
                            int i20;
                            int i21;
                            int iM25610;
                            int i22;
                            int i23;
                            int i24;
                            int i25 = C22628.f73083;
                            int i26 = RunnableC0588.f2309;
                            int iM25611 = C0630.m2566("ܿܶ") ^ i26;
                            int i27 = ((iM25611 ^ i25) * 30957) ^ (-432576158);
                            C22078 c22079 = null;
                            short[] sArr5 = null;
                            short[] sArr6 = null;
                            int i28 = iM25611 ^ 919305409;
                            String strM7159 = null;
                            int i29 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            short s3 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            char c2 = 0;
                            short s4 = 0;
                            int i34 = 0;
                            int i35 = -158823435;
                            short s5 = 0;
                            short[] sArr7 = null;
                            String str = null;
                            int i36 = 0;
                            while (true) {
                                i35 = i28 ^ (i27 & (((i35 ^ i25) * 18591) >> 31));
                                switch (i35) {
                                    case -2121997299:
                                    case 546000300:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        i36 = baseResp.errCode;
                                        if (i36 != -2) {
                                            iM2569 = (C0630.m2566("۫᩶") + i25) * (-127);
                                            i20 = ((iM2569 ^ i26) * (-11403)) ^ (-1791277935);
                                            i21 = -614418076;
                                        } else {
                                            iM2569 = (C0630.m2566("ۡۤ") + i25) * 95;
                                            i20 = ((iM2569 ^ i26) * (-4841)) ^ 1953034166;
                                            i21 = 30789969;
                                        }
                                        i24 = iM2569 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str2 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str2;
                                        break;
                                    case -2102231643:
                                    case 1572753544:
                                        break;
                                    case -2003127842:
                                    case 327413032:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        c2 = 0;
                                        if (C1420.f5096 <= 0) {
                                            iM2569 = (C0630.m2566("ܶ᩷") + i26) * (-83);
                                            i20 = ((iM2569 ^ i25) * (-21113)) ^ (-2072347740);
                                            i21 = 118592379;
                                        } else {
                                            iM2569 = C0630.m2566("ܶᩳ") ^ i25;
                                            i20 = ((iM2569 ^ i26) * (-23169)) ^ 683493764;
                                            i21 = 1627588133;
                                        }
                                        i24 = iM2569 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str3 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str3;
                                        break;
                                    case -1743718928:
                                    case 183687307:
                                        i32 = 9668;
                                        iM2569 = C0630.m2566("ۡܺ") ^ i26;
                                        i20 = ((iM2569 ^ i25) * (-21083)) ^ 1732750586;
                                        i21 = 1078100906;
                                        i24 = iM2569 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str4 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str4;
                                        break;
                                    case -1735874134:
                                    case 666613614:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        if (i36 != 0) {
                                            iM2569 = C2105.m6981("᩵ۘ") ^ i25;
                                            i20 = ((iM2569 ^ i26) * 27343) ^ (-994992735);
                                            i21 = 1536839274;
                                        } else {
                                            iM2569 = (i26 - C0630.m2566("᩻ܰ")) * (-3);
                                            i20 = ((iM2569 ^ i25) * 14059) ^ (-1674514191);
                                            i21 = 544850430;
                                        }
                                        i24 = iM2569 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str5 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str5;
                                        break;
                                    case -1564829612:
                                    case 759735271:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        int i37 = s5 + s4;
                                        i34 = i37 * i37;
                                        s3 = 49632;
                                        if (C4159.f13567) {
                                            iM2569 = C2105.m6981("۫ۢ") ^ i26;
                                            i20 = ((iM2569 ^ i25) * (-16511)) ^ 1048281357;
                                            i21 = 1467170439;
                                        } else {
                                            iM2569 = (C0630.m2566("ܶ᩷") + i26) * (-83);
                                            i20 = ((iM2569 ^ i25) * (-21113)) ^ (-2072347740);
                                            i21 = 118592379;
                                        }
                                        i24 = iM2569 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str6 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str6;
                                        break;
                                    case -1553884116:
                                    case 3822229:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        strM7159 = C2167.m7159(sArr5, i33, i29, i32);
                                        if (!AbstractC2021.m6574()) {
                                            iM2569 = (C2105.m6981("᩵᩸") + i25) * 99;
                                            i20 = ((iM2569 ^ i26) * (-16429)) ^ (-2014807776);
                                            i21 = -643485591;
                                            i24 = iM2569 ^ i21;
                                            sArr6 = sArr6;
                                            i30 = i30;
                                            String str7 = str;
                                            i28 = i24;
                                            i27 = i20;
                                            str = str7;
                                        } else {
                                            str = str;
                                            sArr6 = sArr6;
                                            i30 = i30;
                                            iM25610 = (i25 - C0630.m2566("᩷ۢ")) * 109;
                                            i22 = ((iM25610 ^ i26) * 8779) ^ 837791023;
                                            i23 = -2003925450;
                                            i28 = iM25610 ^ i23;
                                            i27 = i22;
                                        }
                                        break;
                                    case -1460577636:
                                    case 28713659:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        C3683.m11210(baseResp, strM7159);
                                        c22079 = c22078;
                                        if (c22079.f71726.m31868()) {
                                            iM2569 = C0630.m2566("ۢ᩺") ^ i26;
                                            i20 = ((iM2569 ^ i25) * 30329) ^ (-1362702631);
                                            i21 = -1002094337;
                                        } else {
                                            iM2569 = C0630.m2566("ܳܰ") ^ i26;
                                            i20 = ((iM2569 ^ i25) * (-2921)) ^ (-1043714394);
                                            i21 = 411041279;
                                        }
                                        i24 = iM2569 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str8 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str8;
                                        break;
                                    case -1451114321:
                                    case -642146180:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        sArr5 = f2374;
                                        i33 = 1;
                                        i29 = 4;
                                        if (AbstractC2021.f6743 > 0) {
                                            iM2569 = (C0630.m2566("᩸۟") ^ i25) * 31;
                                            i20 = ((iM2569 ^ i26) * (-26349)) ^ 64607888;
                                            i21 = 625405648;
                                            i24 = iM2569 ^ i21;
                                            sArr6 = sArr6;
                                            i30 = i30;
                                            String str9 = str;
                                            i28 = i24;
                                            i27 = i20;
                                            str = str9;
                                        } else {
                                            str = str;
                                            sArr6 = sArr6;
                                            i30 = i30;
                                            iM25610 = (i25 - C0630.m2566("᩷ۢ")) * 109;
                                            i22 = ((iM25610 ^ i26) * 8779) ^ 837791023;
                                            i23 = -2003925450;
                                            i28 = iM25610 ^ i23;
                                            i27 = i22;
                                        }
                                        break;
                                    case -1423656341:
                                    case -893048823:
                                        if (C3911.f12484 < 0) {
                                            iM25610 = (i26 - C2105.m6981("ܽܽ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i22 = ((iM25610 ^ i25) * 7329) ^ (-2094541988);
                                            i23 = 151829439;
                                            i28 = iM25610 ^ i23;
                                            i27 = i22;
                                        } else {
                                            str = str;
                                            int iM6984 = (C2105.m6981("۟᩹") ^ i25) * 51;
                                            i20 = ((iM6984 ^ i26) * 6457) ^ (-370199033);
                                            i24 = iM6984 ^ (-474675036);
                                            String str10 = str;
                                            i28 = i24;
                                            i27 = i20;
                                            str = str10;
                                        }
                                        break;
                                    case -1410016144:
                                    case 1424030011:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        s5 = sArr7[c2];
                                        s4 = 12408;
                                        if (C1005.f3721) {
                                            iM2569 = (C0630.m2566("۬ܰ") + i25) * (-55);
                                            i20 = ((iM2569 ^ i26) * 30115) ^ (-833116509);
                                            i21 = 1094796280;
                                        } else {
                                            iM2569 = (i25 - C2105.m6981("۠ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i20 = ((iM2569 ^ i26) * 26751) ^ (-465557861);
                                            i21 = -754536159;
                                        }
                                        i24 = iM2569 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str11 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str11;
                                        break;
                                    case -1355782983:
                                    case -374607708:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        sArr7 = f2374;
                                        if (C0422.f1886 <= 0) {
                                            iM2569 = (C0630.m2566("ܶ᩷") + i26) * (-83);
                                            i20 = ((iM2569 ^ i25) * (-21113)) ^ (-2072347740);
                                            i21 = 118592379;
                                        } else {
                                            iM2569 = C0630.m2566("ۜᩴ") ^ i26;
                                            i20 = ((iM2569 ^ i25) * (-14653)) ^ 978363658;
                                            i21 = 291610985;
                                        }
                                        i24 = iM2569 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str12 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str12;
                                        break;
                                    case -1094342337:
                                    case -1042898951:
                                        C2126.m7031(str, C3663.m11162(sArr6, i30, i31, i32));
                                        c22079.m49670(str, false);
                                        break;
                                    case -1033927506:
                                    case 1402826042:
                                        i32 = 20976;
                                        iM2569 = C0630.m2566("ۡܺ") ^ i26;
                                        i20 = ((iM2569 ^ i25) * (-21083)) ^ 1732750586;
                                        i21 = 1078100906;
                                        i24 = iM2569 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str13 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str13;
                                        break;
                                    case -849330242:
                                    case -29036949:
                                        C3911.m11920(c22079.f71726);
                                        break;
                                    case -829940609:
                                    case 1712114665:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        if ((s5 * s3) - i34 <= 0) {
                                            iM2569 = C2105.m6981("᩹ᩳ") ^ i26;
                                            i20 = ((iM2569 ^ i25) * (-23771)) ^ 1594291706;
                                            i21 = -899293809;
                                        } else {
                                            iM2569 = C0630.m2566("ܰᩳ") ^ i25;
                                            i20 = ((iM2569 ^ i26) * 21427) ^ (-1909536250);
                                            i21 = 1058088747;
                                        }
                                        i24 = iM2569 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str14 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str14;
                                        break;
                                    case -684088602:
                                    case 309097676:
                                        String str15 = ((SendAuth.Resp) baseResp).code;
                                        if (C4616.f14690 > 0) {
                                            C1324 c1324 = new C1324(c22079);
                                            str = str;
                                            if (ServiceConnectionC3453.f10921 < 0) {
                                                sArr6 = sArr6;
                                                i30 = i30;
                                                RunnableC7842 runnableC7842 = new RunnableC7842(str15, viewOnClickListenerC5850, c1324);
                                                if (C4616.f14690 > 0) {
                                                    C1005.m3499(new Thread(runnableC7842));
                                                }
                                                iM2569 = (i25 - C2105.m6981("۠ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i20 = ((iM2569 ^ i26) * 26751) ^ (-465557861);
                                                i21 = -754536159;
                                                i24 = iM2569 ^ i21;
                                                sArr6 = sArr6;
                                                i30 = i30;
                                                break;
                                            }
                                            String str16 = str;
                                            i28 = i24;
                                            i27 = i20;
                                            str = str16;
                                        } else {
                                            str = str;
                                        }
                                        int iM6985 = (C2105.m6981("۟᩹") ^ i25) * 51;
                                        i20 = ((iM6985 ^ i26) * 6457) ^ (-370199033);
                                        i24 = iM6985 ^ (-474675036);
                                        String str17 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str17;
                                        break;
                                    case -322437092:
                                    case 2026318222:
                                        break;
                                    case -19323616:
                                    case 1627227008:
                                        RunnableC0588.m2441();
                                        if (C7811.m20844() == 0) {
                                            iM25610 = (i25 - C0630.m2566("᩷ۢ")) * 109;
                                            i22 = ((iM25610 ^ i26) * 8779) ^ 837791023;
                                            i23 = -2003925450;
                                            i28 = iM25610 ^ i23;
                                            i27 = i22;
                                        } else {
                                            str = str;
                                            sArr6 = sArr6;
                                            i30 = i30;
                                            iM2569 = (C0630.m2566("ܶ᩷") + i26) * (-83);
                                            i20 = ((iM2569 ^ i25) * (-21113)) ^ (-2072347740);
                                            i21 = 118592379;
                                            i24 = iM2569 ^ i21;
                                            sArr6 = sArr6;
                                            i30 = i30;
                                            String str18 = str;
                                            i28 = i24;
                                            i27 = i20;
                                            str = str18;
                                        }
                                        break;
                                    case 36519370:
                                    case 1853518730:
                                        str = baseResp.errStr;
                                        sArr6 = f2374;
                                        i30 = 5;
                                        i31 = 6;
                                        if (C1773.f6144 <= 0) {
                                            iM25610 = (i25 - C0630.m2566("᩷ۢ")) * 109;
                                            i22 = ((iM25610 ^ i26) * 8779) ^ 837791023;
                                            i23 = -2003925450;
                                        } else {
                                            iM25610 = (i26 - C0630.m2566("֫ᩳ")) * (-59);
                                            i22 = ((iM25610 ^ i25) * (-13671)) ^ (-816012858);
                                            i23 = 1038024924;
                                        }
                                        i28 = iM25610 ^ i23;
                                        i27 = i22;
                                        break;
                                    case 290234092:
                                    case 1607631327:
                                        C0630.m2564();
                                        C3019.m9255();
                                        break;
                                    default:
                                        C3245.m9925();
                                        ViewOnClickListenerC1958.m6429();
                                        str = str;
                                        int iM6986 = (C2105.m6981("۟᩹") ^ i25) * 51;
                                        i20 = ((iM6986 ^ i26) * 6457) ^ (-370199033);
                                        i24 = iM6986 ^ (-474675036);
                                        String str19 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str19;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    InterfaceC17230 interfaceC17238 = f35590;
                    if (C0237.f1507 != 0) {
                        interfaceC17231 = interfaceC17238;
                        int iM6984 = (C2105.m6981("ۛܳ") ^ i8) * 49;
                        req = req2;
                        i5 = ((iM6984 ^ i7) * (-3885)) ^ 1791581398;
                        i10 = iM6984 ^ 236428881;
                        i9 = i5;
                        req2 = req;
                    } else {
                        int iM6985 = (C2105.m6981("᩻ܶ") ^ i8) * (-79);
                        i9 = ((iM6985 ^ i7) * 24635) ^ 402277635;
                        i10 = iM6985 ^ (-1138028399);
                        interfaceC17231 = interfaceC17238;
                    }
                    break;
                case 1080986530:
                case 2035123845:
                    C3019.m9255();
                    if (!C2126.f7087) {
                        req = req2;
                        interfaceC17230 = interfaceC17231;
                        iM6981 = C2105.m6981("ܿ᩷") ^ i7;
                        i5 = ((iM6981 ^ i8) * (-19241)) ^ 315431956;
                        i6 = 728193178;
                        int i112 = iM6981 ^ i6;
                        interfaceC17231 = interfaceC17230;
                        i10 = i112;
                        i9 = i5;
                        req2 = req;
                    } else {
                        interfaceC17231 = interfaceC17231;
                        iM2566 = C2105.m6981("۫۠") ^ i7;
                        i = ((iM2566 ^ i8) * (-20831)) ^ (-613924664);
                        i2 = 496097141;
                        InterfaceC17230 interfaceC17239 = interfaceC17231;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                        interfaceC17231 = interfaceC17239;
                    }
                    break;
                case 1851920180:
                case 2021936612:
                    i11 = 22369;
                    iM2566 = (C0630.m2566("᩺ܿ") + i8) * (-85);
                    i = ((iM2566 ^ i7) * 4605) ^ 848184759;
                    i2 = -1787983061;
                    InterfaceC17230 interfaceC172310 = interfaceC17231;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    interfaceC17231 = interfaceC172310;
                    break;
                default:
                    req2.state = C2126.m7036(sArr3, i13, i14, i11);
                    if (C4263.f13799 <= 0) {
                        interfaceC17231 = interfaceC17231;
                        iM2566 = (C2105.m6981("ۚۢ") + i8) * 89;
                        i = ((iM2566 ^ i7) * 20559) ^ 1592031793;
                        i2 = -2118641657;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ᩴܺ")) * (-43);
                        interfaceC17231 = interfaceC17231;
                        i = ((iM2566 ^ i7) * 16007) ^ 72018869;
                        i2 = -1517447043;
                    }
                    InterfaceC17230 interfaceC172311 = interfaceC17231;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    interfaceC17231 = interfaceC172311;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29036(C21373 c21373, ViewOnClickListenerC5850 viewOnClickListenerC5850) {
        C12613 c12613 = null;
        int i = -1539522466;
        int i2 = C2958.f9394;
        int i3 = C0422.f1886;
        int iM6981 = (C2105.m6981("۫᩶") ^ i2) * 95;
        int i4 = ((iM6981 ^ i3) * 2399) ^ 1619146335;
        int i5 = -1492188228;
        while (true) {
            i = ((((i ^ i3) * (-27881)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2041962417:
                case -375342617:
                    RunnableC1108.m3790();
                    iM6981 = C2105.m6981("ܶۡ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 25139) ^ (-657653849);
                    i5 = -466739551;
                    break;
                case -1984422479:
                case -1482525278:
                    if (!C4159.f13567) {
                        iM6981 = C0630.m2566("ۨᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    } else {
                        iM6981 = C2105.m6981("ܶۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 25139) ^ (-657653849);
                        i5 = -466739551;
                    }
                    break;
                case -1972525470:
                case 744416884:
                    RunnableC3474.m10630();
                    if (C11340.f33930 >= 0) {
                        iM6981 = C0630.m2566("۟۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18629) ^ (-1199038479);
                        i5 = -1856797348;
                    } else {
                        iM6981 = C0630.m2566("ۨᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    }
                    break;
                case -1728507783:
                case -1185140560:
                    m29034().m43899(viewOnClickListenerC5850, c12613);
                    break;
                case -1723129977:
                case -1148802196:
                    if (m29034().m43900()) {
                        iM6981 = (C0630.m2566("ۖۧ") + i2) * (-57);
                        i4 = ((iM6981 ^ i3) * (-12089)) ^ 497962648;
                        i5 = 1642788572;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۟ܶ")) * 101;
                        i4 = ((iM6981 ^ i2) * (-28105)) ^ 182527256;
                        i5 = 280968612;
                    }
                    break;
                case -1664367778:
                case 1672838431:
                    if (C2105.m6982() == 0) {
                        iM6981 = (C2105.m6981("۬᩹") + i2) * 15;
                        i4 = ((iM6981 ^ i3) * (-11991)) ^ (-787104973);
                        i5 = 1900415208;
                    } else {
                        iM6981 = C0630.m2566("ۨᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    }
                    break;
                case -1460462396:
                case 6027886:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C0630.m2566("۟۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18629) ^ (-1199038479);
                        i5 = -1856797348;
                    } else {
                        iM6981 = (C2105.m6981("᩹֫") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i2) * (-11763)) ^ (-563936955);
                        i5 = -798579998;
                    }
                    break;
                case -1210531021:
                case 182873348:
                    m29034().m43901();
                    iM6981 = (i3 - C0630.m2566("۟ܶ")) * 101;
                    i4 = ((iM6981 ^ i2) * (-28105)) ^ 182527256;
                    i5 = 280968612;
                    break;
                case -993677290:
                case -89372675:
                    c12613 = new C12613(c21373, viewOnClickListenerC5850);
                    if (C4075.f12947 >= 0) {
                        iM6981 = C2105.m6981("ܶۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 25139) ^ (-657653849);
                        i5 = -466739551;
                    } else {
                        iM6981 = (C2105.m6981("֡ۧ") ^ i2) * (-19);
                        i4 = ((iM6981 ^ i3) * (-6039)) ^ (-1122618943);
                        i5 = -239647676;
                    }
                    break;
                case -799816791:
                case 727315042:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("ܶۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 25139) ^ (-657653849);
                        i5 = -466739551;
                    } else {
                        iM6981 = C0630.m2566("᩺۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 25039) ^ (-1596143323);
                        i5 = -1901122537;
                    }
                    break;
                case -719668469:
                case 2072956210:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ۨᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    } else {
                        iM6981 = C0630.m2566("ۘۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32161)) ^ (-2042447391);
                        i5 = -1340570426;
                    }
                    break;
                case -638884676:
                case 1114617274:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C0630.m2566("ۨᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܶ۬")) * (-25);
                        i4 = ((iM6981 ^ i3) * (-2101)) ^ 700069097;
                        i5 = -1763428544;
                    }
                    break;
                case -485981599:
                case -333254713:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C2105.m6981("ܶۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 25139) ^ (-657653849);
                        i5 = -466739551;
                    } else {
                        iM6981 = (C0630.m2566("ۚ᩹") + i3) * (-47);
                        i4 = ((iM6981 ^ i2) * (-3849)) ^ (-490750950);
                        i5 = -1125051319;
                    }
                    break;
                case -66426396:
                case 1070003545:
                    viewOnClickListenerC5850.m10226(c12613);
                    if (C0050.f910 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۢۗ")) * 109;
                        i4 = ((iM6981 ^ i2) * (-7243)) ^ (-1478536634);
                        i5 = 117835650;
                    } else {
                        iM6981 = (C0630.m2566("ۨ֫") ^ i3) * 19;
                        i4 = ((iM6981 ^ i2) * OpenAuthTask.NOT_INSTALLED) ^ 1344135768;
                        i5 = 1612736214;
                    }
                    break;
                case 286007901:
                case 1273201821:
                    C0714.m2805();
                    break;
                case 1352845240:
                case 1976284732:
                    if (C3683.f11629 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۢۗ")) * 109;
                        i4 = ((iM6981 ^ i2) * (-7243)) ^ (-1478536634);
                        i5 = 117835650;
                    } else {
                        iM6981 = C0630.m2566("۟ᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21063)) ^ (-1977533267);
                        i5 = 419486245;
                    }
                    break;
                case 1595234072:
                case 2070476522:
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ۨᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۧ᩸")) * (-17);
                        i4 = ((iM6981 ^ i2) * (-8101)) ^ (-873591525);
                        i5 = -2120490804;
                    }
                    break;
                default:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C2105.m6981("۬᩹") + i2) * 15;
                        i4 = ((iM6981 ^ i3) * (-11991)) ^ (-787104973);
                        i5 = 1900415208;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩶᩵")) * 71;
                        i4 = ((iM6981 ^ i3) * (-12535)) ^ (-347278397);
                        i5 = -1532321808;
                    }
                    break;
            }
            return;
        }
    }
}
