package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import com.google.android.material.slider.BaseSlider;
import com.tencent.p062mm.opensdk.modelbase.BaseResp;
import com.tencent.p062mm.opensdk.modelmsg.SendAuth;
import com.tencent.p062mm.opensdk.openapi.IWXAPI;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes3.dex */
public final class C13686 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC18744 f38599;

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC18744 f38600;

    /* JADX INFO: renamed from: ۧ᩸ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f82162 = {2412, 28329, 28331, 28346, 28312, 28335, 28322, 28347, 28331, 28390, 28384, 28384, 28384, 28391, 7331, 1547, 1545, 1566, 1539, 1564, 1539, 1566, 1555, 3838, -24873, -24886, -24873, -24891, -24876, -24883, -24837, -24879, -24873, -24895, -24874, -24883, -24886, -24894, -24885, -24896, -24883, -24891, -24886, -24896, -24883, -24837, -24877, -24868, -24837, -24888, -24885, -24893, -24883, -24886, -24893, -24895, -24880, -24846, -24891, -24888, -24879, -24895, -24948, -24950, -24950, -24950, -24947, 7430, 7620, 7622, 7633, 7628, 7635, 7628, 7633, 7644, 7638, 7627, 7638, 7620, 7637, 7628, 7674, 7632, 7638, 7616, 7639, 7628, 7627, 7619, 7626, 7617, 7628, 7620, 7627, 7617, 7628, 7674, 7634, 7645, 7674, 7625, 7626, 7618, 7628, 7627, 7618, 7616, 7633, 7667, 7620, 7625, 7632, 7616, 7565, 7563, 7563, 7563, 7564};

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
    /* JADX INFO: renamed from: ۧ */
    public static void m31090(final AbstractActivityC5549 abstractActivityC5549, final C20531 c20531) {
        int iM55979;
        int i;
        int i2;
        int i3 = C0989.f81920;
        int i4 = C1229.f82066;
        int iM55680 = (C0873.m55680("ᩳۖ") + i3) * (-39);
        int i5 = ((iM55680 ^ i4) * (-12383)) ^ 1761377680;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM55680 ^ 297329041;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        int i11 = 946298178;
        short s2 = 0;
        String strM55717 = null;
        short[] sArr4 = null;
        int i12 = 0;
        Object value = null;
        InterfaceC11094 interfaceC11094 = null;
        SendAuth.Req req = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * 30175) >> 31));
            switch (i11) {
                case -2106460476:
                case 140057398:
                    ActivityC17798.m40409(interfaceC11094);
                    value = f38600.getValue();
                    if (C1194.m56396() <= 0) {
                        iM55979 = C0946.m55979("ܽܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    } else {
                        iM55979 = C0873.m55680("ۗܺ") ^ i3;
                        i = ((iM55979 ^ i4) * (-14919)) ^ 540947395;
                        i2 = 102444864;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1962024687:
                case -493817722:
                    req = new SendAuth.Req();
                    sArr4 = f82162;
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("ܿۗ") ^ i3;
                        i = ((iM55979 ^ i4) * 23303) ^ (-199339236);
                        i2 = -410238536;
                    } else {
                        iM55979 = C0946.m55979("ܽܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1820859017:
                case 1971271758:
                    sArr2 = f82162;
                    i10 = 68;
                    i12 = 8;
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("᩺ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * (-7143)) ^ (-1015449361);
                        i2 = 2110313812;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܰᩳ")) * 85;
                        i = ((iM55979 ^ i3) * 25033) ^ (-495147865);
                        i2 = -128121435;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1778038940:
                case -1149993673:
                    if (((s2 * s2) + 91872225) - (s2 * s) < 0) {
                        iM55979 = (C0873.m55680("᩻ܶ") ^ i3) * (-67);
                        i = ((iM55979 ^ i4) * 31037) ^ (-1181816126);
                        i2 = 502782930;
                    } else {
                        iM55979 = (C0873.m55680("֫᩶") ^ i4) * (-99);
                        i = ((iM55979 ^ i3) * (-3357)) ^ 143424276;
                        i2 = 363364255;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1566428920:
                case -195315935:
                    sArr3 = f82162;
                    i7 = 91;
                    i8 = 15;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ۨ۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-21531)) ^ 1819039419;
                        i2 = -739967025;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩹۠")) * 77;
                        i = ((iM55979 ^ i4) * (-30591)) ^ (-1389481448);
                        i2 = 112305078;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1552469239:
                case -1118350200:
                    s2 = sArr[c];
                    s = 19170;
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0946.m55979("ܽܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    } else {
                        iM55979 = C0873.m55680("֡ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-15977)) ^ (-1743078051);
                        i2 = 670386897;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1367259315:
                case -322717455:
                    C1025.m56218(abstractActivityC5549, C0989.m56092(sArr2, i10, i12, i9));
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ۨ۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-21531)) ^ 1819039419;
                        i2 = -739967025;
                    } else {
                        iM55979 = C0946.m55979("ܿ۠") ^ i4;
                        i = ((iM55979 ^ i3) * 20743) ^ (-875857248);
                        i2 = 1398854208;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1232445733:
                case -930847130:
                    sArr = f82162;
                    c = 'C';
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("ܽܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    } else {
                        iM55979 = C0946.m55979("ۨۙ") ^ i3;
                        i = ((iM55979 ^ i4) * 30485) ^ (-2082586828);
                        i2 = 1448424815;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1137478554:
                case 1524224105:
                    req.state = C1024.m56203(sArr3, i7, i8, i9);
                    interfaceC11094 = new InterfaceC11094() { // from class: l.᩵᩵ۡ

                        /* JADX INFO: renamed from: ۫ۡ᩷, reason: not valid java name and contains not printable characters */
                        private static final short[] f82957 = {5169, 23170, 23189, 23171, 23168, 16029, 1240, -10457, 23189, 23170, 23170, 23203, 23172, 23170};

                        {
                            int i13 = -1186897559;
                            int i14 = C1012.f81938;
                            int i15 = C0845.f81821;
                            int iM559710 = C0946.m55979("۫᩶") ^ i14;
                            int i16 = ((iM559710 ^ i15) * (-26747)) ^ (-1471553277);
                            int i17 = 1011599107;
                            while (true) {
                                i13 = ((((i13 ^ i15) * (-4485)) >> 31) & i16) ^ (iM559710 ^ i17);
                                switch (i13) {
                                    case -2112516727:
                                    case -236874777:
                                        C0949.m56012();
                                        if (C1044.f81959 >= 0) {
                                            iM559710 = (i15 - C0873.m55680("᩹ۚ")) * (-109);
                                            i16 = ((iM559710 ^ i14) * 17829) ^ (-688098386);
                                            i17 = 1305303747;
                                        } else {
                                            iM559710 = C0946.m55979("᩻۫") ^ i14;
                                            i16 = ((iM559710 ^ i15) * (-13723)) ^ (-725454291);
                                            i17 = 1950108202;
                                        }
                                        break;
                                    case -2070353326:
                                    case 314837618:
                                        if (C1071.f81975 <= 0) {
                                            iM559710 = (i15 - C0873.m55680("᩹ۚ")) * (-109);
                                            i16 = ((iM559710 ^ i14) * 17829) ^ (-688098386);
                                            i17 = 1305303747;
                                        } else {
                                            iM559710 = C0946.m55979("᩻᩹") ^ i14;
                                            i16 = ((iM559710 ^ i15) * 12293) ^ (-435902335);
                                            i17 = -675598272;
                                        }
                                        break;
                                    case -1990234944:
                                    case 1147175275:
                                        if (C0863.f81833 <= 0) {
                                            iM559710 = C0946.m55979("᩷ܶ") ^ i14;
                                            i16 = ((iM559710 ^ i15) * 30125) ^ (-253263311);
                                            i17 = 241763802;
                                        } else {
                                            iM559710 = (C0946.m55979("ܿܰ") ^ i15) * 115;
                                            i16 = ((iM559710 ^ i14) * 15075) ^ 1076844914;
                                            i17 = 1816893788;
                                        }
                                        break;
                                    case -1946659798:
                                    case 786912241:
                                        if (C1194.f82045 != 0) {
                                            iM559710 = C0946.m55979("᩷ܶ") ^ i14;
                                            i16 = ((iM559710 ^ i15) * 30125) ^ (-253263311);
                                            i17 = 241763802;
                                        } else {
                                            iM559710 = C0873.m55680("ܽۘ") ^ i15;
                                            i16 = ((iM559710 ^ i14) * (-18437)) ^ 358627327;
                                            i17 = -1692296807;
                                        }
                                        break;
                                    case -1511726766:
                                    case -1200016579:
                                        if (C1229.f82066 >= 0) {
                                            iM559710 = (i14 - C0873.m55680("ۚۚ")) * (-25);
                                            i16 = ((iM559710 ^ i15) * 20345) ^ (-784133483);
                                            i17 = -1594289729;
                                        } else {
                                            iM559710 = (C0946.m55979("ۡ᩷") ^ i15) * (-103);
                                            i16 = ((iM559710 ^ i14) * (-5995)) ^ 495653933;
                                            i17 = -315757869;
                                        }
                                        break;
                                    case -1401845462:
                                    case -1273571610:
                                        return;
                                    case -1181127195:
                                    case -675281028:
                                        if (C1053.m56327() >= 0) {
                                            iM559710 = C0946.m55979("᩻۫") ^ i14;
                                            i16 = ((iM559710 ^ i15) * (-13723)) ^ (-725454291);
                                            i17 = 1950108202;
                                        } else {
                                            iM559710 = (i14 - C0946.m55979("ۢۗ")) * 11;
                                            i16 = ((iM559710 ^ i15) * (-25409)) ^ (-484450915);
                                            i17 = 1278091355;
                                        }
                                        break;
                                    case -1149344403:
                                    case 715827216:
                                        if (C1929.f83011 == 0) {
                                            iM559710 = (i15 - C0873.m55680("᩷۬")) * (-23);
                                            i16 = ((iM559710 ^ i14) * (-20143)) ^ (-252665005);
                                            i17 = 99330481;
                                        } else {
                                            iM559710 = C0946.m55979("᩻۫") ^ i14;
                                            i16 = ((iM559710 ^ i15) * (-13723)) ^ (-725454291);
                                            i17 = 1950108202;
                                        }
                                        break;
                                    case -1125003395:
                                    case 585074237:
                                        if (C1044.f81959 >= 0) {
                                            iM559710 = C0946.m55979("᩷ܶ") ^ i14;
                                            i16 = ((iM559710 ^ i15) * 30125) ^ (-253263311);
                                            i17 = 241763802;
                                        } else {
                                            iM559710 = (i15 - C0873.m55680("᩷۬")) * (-23);
                                            i16 = ((iM559710 ^ i14) * (-20143)) ^ (-252665005);
                                            i17 = 99330481;
                                        }
                                        break;
                                    case -1054135598:
                                    case 2030996832:
                                        C0912.m55833();
                                        throw new RuntimeException();
                                    case -887213820:
                                    case 1903571379:
                                        if (C1036.f81953 >= 0) {
                                            iM559710 = (i15 - C0873.m55680("᩹ۚ")) * (-109);
                                            i16 = ((iM559710 ^ i14) * 17829) ^ (-688098386);
                                            i17 = 1305303747;
                                        } else {
                                            iM559710 = (C0873.m55680("ۨۗ") ^ i15) * 35;
                                            i16 = ((iM559710 ^ i14) * (-30063)) ^ (-841659725);
                                            i17 = 1412738780;
                                        }
                                        break;
                                    case -389853858:
                                    case 1736729577:
                                        if (C0946.f81894 != 0) {
                                            iM559710 = (i15 - C0873.m55680("᩹ۚ")) * (-109);
                                            i16 = ((iM559710 ^ i14) * 17829) ^ (-688098386);
                                            i17 = 1305303747;
                                        } else {
                                            iM559710 = C0873.m55680("᩻᩵") ^ i14;
                                            i16 = ((iM559710 ^ i15) * (-14505)) ^ 2062459696;
                                            i17 = 225322831;
                                        }
                                        break;
                                    case -134779023:
                                    case 923842491:
                                        if (C0882.m55710() != 0) {
                                            iM559710 = C0946.m55979("᩷ܶ") ^ i14;
                                            i16 = ((iM559710 ^ i15) * 30125) ^ (-253263311);
                                            i17 = 241763802;
                                        } else {
                                            iM559710 = C0873.m55680("ۨܺ") ^ i15;
                                            i16 = ((iM559710 ^ i14) * 9075) ^ 223936666;
                                            i17 = 728090469;
                                        }
                                        break;
                                    case 384618538:
                                    case 1218386775:
                                        C0989.m56095();
                                        iM559710 = C0946.m55979("᩻۫") ^ i14;
                                        i16 = ((iM559710 ^ i15) * (-13723)) ^ (-725454291);
                                        i17 = 1950108202;
                                        break;
                                    case 1453134470:
                                    case 1655448630:
                                        if (C0898.f81858 <= 0) {
                                            iM559710 = (i15 - C0873.m55680("᩹ۚ")) * (-109);
                                            i16 = ((iM559710 ^ i14) * 17829) ^ (-688098386);
                                            i17 = 1305303747;
                                        } else {
                                            iM559710 = C0946.m55979("ۙۙ") ^ i14;
                                            i16 = ((iM559710 ^ i15) * (-20941)) ^ 1886052078;
                                            i17 = 2114629900;
                                        }
                                        break;
                                    default:
                                        if (C0937.f81884) {
                                            iM559710 = C0873.m55680("۫ۗ") ^ i14;
                                            i16 = ((iM559710 ^ i15) * 6663) ^ (-847651709);
                                            i17 = 1122232597;
                                        } else {
                                            iM559710 = C0946.m55979("᩷ܶ") ^ i14;
                                            i16 = ((iM559710 ^ i15) * 30125) ^ (-253263311);
                                            i17 = 241763802;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:31:0x00f4 A[PHI: r8 r9
                          0x00f4: PHI (r8v6 l.ۢ۠ۡ) = (r8v2 l.ۢ۠ۡ), (r8v3 l.ۢ۠ۡ), (r8v2 l.ۢ۠ۡ) binds: [B:114:0x00f4, B:30:0x00f2, B:10:0x0078] A[DONT_GENERATE, DONT_INLINE]
                          0x00f4: PHI (r9v6 l.ۗܺ᩷) = (r9v2 l.ۗܺ᩷), (r9v3 l.ۗܺ᩷), (r9v2 l.ۗܺ᩷) binds: [B:114:0x00f4, B:30:0x00f2, B:10:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // p067l.InterfaceC11094
                        public final void onResp(BaseResp baseResp) {
                            int iM559710;
                            int i13;
                            int i14;
                            short s3;
                            String str;
                            int iM559711;
                            int i15;
                            int i16;
                            int i17;
                            int i18;
                            int iM559712;
                            int i19;
                            int i20;
                            int i21;
                            int i22;
                            int iM55681;
                            int i23;
                            int i24;
                            int iM559713;
                            int i25;
                            int i26;
                            C21063 c21063 = this;
                            BaseResp baseResp2 = baseResp;
                            int i27 = C1012.f81938;
                            int i28 = C0992.f81922;
                            int iM559714 = C0946.m55979("۬᩵") ^ i27;
                            int i29 = ((iM559714 ^ i28) * (-20713)) ^ 1683880300;
                            final C20531 c20532 = null;
                            short[] sArr5 = null;
                            short[] sArr6 = null;
                            int i30 = iM559714 ^ (-1827194108);
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            char c2 = 0;
                            short s4 = 0;
                            int i34 = 0;
                            String strM55783 = null;
                            int i35 = 0;
                            int i36 = -1552853797;
                            short[] sArr7 = null;
                            String strM55689 = null;
                            String str2 = null;
                            final AbstractActivityC5549 abstractActivityC55410 = null;
                            InterfaceC11360 interfaceC11360 = null;
                            final C22682 c22682M56202 = null;
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
                                            iM55681 = C0873.m55680("ۙ֡") ^ i27;
                                            i23 = ((iM55681 ^ i28) * (-12779)) ^ 251753395;
                                            i24 = 139427402;
                                        } else {
                                            iM55681 = (i28 - C0946.m55979("۠ܽ")) * (-111);
                                            i23 = ((iM55681 ^ i27) * (-1453)) ^ (-808698622);
                                            i24 = 383177007;
                                        }
                                        i26 = iM55681 ^ i24;
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
                                            iM55681 = (C0873.m55680("᩻ᩳ") ^ i28) * 37;
                                            i23 = ((iM55681 ^ i27) * (-18941)) ^ 1437154280;
                                            i24 = 1913446608;
                                            i26 = iM55681 ^ i24;
                                            sArr5 = sArr5;
                                            i22 = i31;
                                            i30 = i26;
                                            i29 = i23;
                                            i31 = i22;
                                        } else {
                                            int iM55682 = (C0873.m55680("ܰۖ") + i27) * 31;
                                            i35 = i38;
                                            i29 = ((iM55682 ^ i28) * (-10115)) ^ (-1794168013);
                                            i21 = iM55682 ^ 1741470492;
                                            sArr5 = sArr5;
                                            i22 = i31;
                                            i30 = i21;
                                            i31 = i22;
                                        }
                                        break;
                                    case -1745394161:
                                    case 1908616677:
                                        i31 = i31;
                                        String str4 = strM55783;
                                        sArr5 = sArr5;
                                        s4 = sArr7[c2];
                                        i34 = s4 * s4;
                                        if (C1053.f81965 > 0) {
                                            int iM559715 = C0946.m55979("ܽۤ") ^ i28;
                                            i15 = ((iM559715 ^ i27) * 29475) ^ (-2044092229);
                                            i17 = iM559715 ^ (-986289809);
                                            strM55783 = str4;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i17;
                                            i29 = i15;
                                            c21063 = this;
                                            baseResp2 = baseResp;
                                        } else {
                                            strM55783 = str4;
                                            i31 = i31;
                                            int iM559716 = C0946.m55979("ۖ᩹") ^ i27;
                                            i29 = (-2004565644) ^ ((iM559716 ^ i28) * (-18053));
                                            i30 = iM559716 ^ (-8054173);
                                            c21063 = this;
                                            baseResp2 = baseResp;
                                            sArr5 = sArr5;
                                        }
                                        break;
                                    case -1725350267:
                                    case 1251061544:
                                        C1929.m56553();
                                        if (C0947.f81895) {
                                            iM559710 = C0946.m55979("ܿܰ") ^ i28;
                                            i13 = ((iM559710 ^ i27) * (-28969)) ^ (-533374221);
                                            i14 = -1183702089;
                                        } else {
                                            iM559710 = (C0873.m55680("ܺܺ") + i28) * (-123);
                                            i13 = ((iM559710 ^ i27) * (-24249)) ^ (-1201165872);
                                            i14 = -815926983;
                                        }
                                        i30 = iM559710 ^ i14;
                                        i29 = i13;
                                        break;
                                    case -1697537174:
                                    case 941382126:
                                        i31 = i31;
                                        s3 = s4;
                                        str = strM55783;
                                        sArr5 = sArr5;
                                        c2 = 0;
                                        if (C0955.f81898) {
                                            iM559711 = (C0873.m55680("֡֫") ^ i28) * 75;
                                            i15 = ((iM559711 ^ i27) * 11249) ^ 857514738;
                                            i16 = -512304784;
                                        } else {
                                            iM559711 = (C0946.m55979("ܽۨ") ^ i27) * (-105);
                                            i15 = ((iM559711 ^ i28) * (-32459)) ^ (-1859533261);
                                            i16 = -876767616;
                                        }
                                        i17 = iM559711 ^ i16;
                                        strM55783 = str;
                                        s4 = s3;
                                        sArr5 = sArr5;
                                        i31 = i31;
                                        i30 = i17;
                                        i29 = i15;
                                        c21063 = this;
                                        baseResp2 = baseResp;
                                        break;
                                    case -1499317240:
                                    case 1644491582:
                                        i32 = 23280;
                                        iM559712 = C0946.m55979("᩺ۖ") ^ i27;
                                        i19 = ((iM559712 ^ i28) * (-7091)) ^ 533296592;
                                        i20 = 1689038453;
                                        i18 = iM559712 ^ i20;
                                        strM55783 = strM55783;
                                        i29 = i19;
                                        sArr5 = sArr5;
                                        i31 = i31;
                                        i30 = i18;
                                        c21063 = this;
                                        break;
                                    case -1118045046:
                                    case 1492125129:
                                        str2 = baseResp2.errStr;
                                        sArr6 = f82957;
                                        i31 = 8;
                                        i37 = 6;
                                        if (C1012.f81938 < 0) {
                                            iM559710 = C0946.m55979("֡ᩳ") ^ i28;
                                            i13 = ((iM559710 ^ i27) * (-16223)) ^ (-1862498352);
                                            i14 = 997700363;
                                            i30 = iM559710 ^ i14;
                                            i29 = i13;
                                        } else {
                                            sArr5 = sArr5;
                                            int iM559717 = C0946.m55979("ۖ᩹") ^ i27;
                                            i29 = (-2004565644) ^ ((iM559717 ^ i28) * (-18053));
                                            i30 = iM559717 ^ (-8054173);
                                            c21063 = this;
                                            baseResp2 = baseResp;
                                            sArr5 = sArr5;
                                        }
                                        break;
                                    case -982482509:
                                    case -690556407:
                                        C1048.m56315(str2, C1071.m56336(sArr6, i31, i37, i32));
                                        c20532.m46333(str2, false);
                                        break;
                                    case -776220991:
                                    case 1676804709:
                                        i31 = i31;
                                        sArr5 = sArr5;
                                        strM55783 = RunnableC0897.m55783(f82957, 1, 4, i32);
                                        if (C0898.m55800() > 0) {
                                            int iM559718 = (C0946.m55979("ܰ۬") ^ i28) * (-117);
                                            i29 = ((iM559718 ^ i27) * (-17439)) ^ (-1682931515);
                                            i18 = iM559718 ^ 114258885;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i18;
                                            c21063 = this;
                                        } else {
                                            i31 = i31;
                                            int iM559719 = C0946.m55979("ۖ᩹") ^ i27;
                                            i29 = (-2004565644) ^ ((iM559719 ^ i28) * (-18053));
                                            i30 = iM559719 ^ (-8054173);
                                            c21063 = this;
                                            baseResp2 = baseResp;
                                            sArr5 = sArr5;
                                        }
                                        break;
                                    case -677661215:
                                    case 2114044626:
                                        i32 = 46182;
                                        iM559712 = C0946.m55979("᩺ۖ") ^ i27;
                                        i19 = ((iM559712 ^ i28) * (-7091)) ^ 533296592;
                                        i20 = 1689038453;
                                        i18 = iM559712 ^ i20;
                                        strM55783 = strM55783;
                                        i29 = i19;
                                        sArr5 = sArr5;
                                        i31 = i31;
                                        i30 = i18;
                                        c21063 = this;
                                        break;
                                    case -605396001:
                                    case -511546260:
                                        i31 = i31;
                                        str3 = ((SendAuth.Resp) baseResp2).code;
                                        sArr5 = f82957;
                                        i33 = 5;
                                        if (C1929.f83011 != 0) {
                                            iM559713 = (C0946.m55979("ᩳܽ") ^ i27) * 97;
                                            i23 = ((iM559713 ^ i28) * (-8191)) ^ 361344993;
                                            i25 = 2025948570;
                                        } else {
                                            iM559713 = C0946.m55979("ۧ᩻") ^ i28;
                                            i23 = ((iM559713 ^ i27) * 1057) ^ 595000615;
                                            i25 = -1514984215;
                                        }
                                        i26 = iM559713 ^ i25;
                                        i22 = i31;
                                        i30 = i26;
                                        i29 = i23;
                                        i31 = i22;
                                        break;
                                    case -473439349:
                                    case -451222184:
                                        C0967.m56074();
                                        C0898.m55800();
                                        break;
                                    case -441483634:
                                    case 637767973:
                                        i31 = i31;
                                        s3 = s4;
                                        str = strM55783;
                                        sArr5 = sArr5;
                                        sArr7 = f82957;
                                        if (C1012.m56134() > 0) {
                                            iM559711 = (C0946.m55979("᩸֫") ^ i28) * 101;
                                            i15 = ((iM559711 ^ i27) * 11231) ^ (-144011043);
                                            i16 = -114511359;
                                            i17 = iM559711 ^ i16;
                                            strM55783 = str;
                                            s4 = s3;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i17;
                                            i29 = i15;
                                            c21063 = this;
                                            baseResp2 = baseResp;
                                        } else {
                                            strM55783 = str;
                                            s4 = s3;
                                            i31 = i31;
                                            int iM5597110 = C0946.m55979("ۖ᩹") ^ i27;
                                            i29 = (-2004565644) ^ ((iM5597110 ^ i28) * (-18053));
                                            i30 = iM5597110 ^ (-8054173);
                                            c21063 = this;
                                            baseResp2 = baseResp;
                                            sArr5 = sArr5;
                                        }
                                        break;
                                    case -67288703:
                                    case 1912048609:
                                        abstractActivityC55410 = abstractActivityC5549;
                                        interfaceC11360 = new InterfaceC11360() { // from class: l.ۚ᩵ۡ

                                            /* JADX INFO: renamed from: ܰ᩺ܿ, reason: not valid java name and contains not printable characters */
                                            private static final short[] f82006 = {357, 27442, 27429, 27443, 27440, 27439, 27438, 27443, 27429, 4316, -2846, 5578, -3423, 437, -7361, -3478, -7142, 3390, 27431, 27429, 27444, 27411, 27444, 27442, 27433, 27438, 27431, 27496, 27502, 27502, 27502, 27497};

                                            {
                                                int i39 = 261476939;
                                                int i40 = C0894.f81854;
                                                int i41 = C1025.f81947;
                                                int iM559720 = C0946.m55979("ۜᩴ") ^ i40;
                                                int i42 = ((iM559720 ^ i41) * 3747) ^ (-1022331236);
                                                int i43 = -1062639374;
                                                while (true) {
                                                    i39 = ((((i39 ^ i41) * 6157) >> 31) & i42) ^ (iM559720 ^ i43);
                                                    switch (i39) {
                                                        case -2024697888:
                                                        case -1430494664:
                                                            RunnableC0871.m55672();
                                                            if (C0946.f81894 == 0) {
                                                                iM559720 = (C0946.m55979("۫᩷") ^ i41) * 79;
                                                                i42 = ((iM559720 ^ i40) * 21981) ^ (-292392780);
                                                                i43 = -220041531;
                                                            } else {
                                                                iM559720 = C0873.m55680("ܿۗ") ^ i40;
                                                                i42 = ((iM559720 ^ i41) * 21549) ^ 250554510;
                                                                i43 = -568434613;
                                                            }
                                                            break;
                                                        case -2024115830:
                                                        case -280153616:
                                                            if (!AbstractC0942.m55971()) {
                                                                iM559720 = C0873.m55680("ܿۗ") ^ i40;
                                                                i42 = ((iM559720 ^ i41) * 21549) ^ 250554510;
                                                                i43 = -568434613;
                                                            } else {
                                                                iM559720 = (i40 - C0873.m55680("۫۫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                i42 = ((iM559720 ^ i41) * 28441) ^ 1960157589;
                                                                i43 = 1147217293;
                                                            }
                                                            break;
                                                        case -1615404651:
                                                        case 590959719:
                                                            if (C0946.f81894 != 0) {
                                                                iM559720 = C0946.m55979("᩺ۗ") ^ i41;
                                                                i42 = ((iM559720 ^ i40) * 9367) ^ (-1510730137);
                                                                i43 = 1943369104;
                                                            } else {
                                                                iM559720 = (C0946.m55979("ܺ۫") ^ i41) * 57;
                                                                i42 = ((iM559720 ^ i40) * (-7251)) ^ (-628769363);
                                                                i43 = 150486850;
                                                            }
                                                            break;
                                                        case -1560001548:
                                                        case -1357572489:
                                                            if (C1124.f82007 >= 0) {
                                                                iM559720 = C0946.m55979("᩺ۗ") ^ i41;
                                                                i42 = ((iM559720 ^ i40) * 9367) ^ (-1510730137);
                                                                i43 = 1943369104;
                                                            } else {
                                                                iM559720 = (i40 - C0873.m55680("ᩴ֫")) * (-115);
                                                                i42 = ((iM559720 ^ i41) * (-17239)) ^ 276096841;
                                                                i43 = 849916042;
                                                            }
                                                            break;
                                                        case -1356331960:
                                                        case 1476237586:
                                                            if (RunnableC1014.f81941 <= 0) {
                                                                iM559720 = (C0946.m55979("۫᩷") ^ i41) * 79;
                                                                i42 = ((iM559720 ^ i40) * 21981) ^ (-292392780);
                                                                i43 = -220041531;
                                                            } else {
                                                                iM559720 = (C0873.m55680("ۚ᩻") ^ i41) * (-61);
                                                                i42 = ((iM559720 ^ i40) * (-7353)) ^ 1907602969;
                                                                i43 = 2131691085;
                                                            }
                                                            break;
                                                        case -1281245397:
                                                        case -993604503:
                                                            if (C0912.f81867 <= 0) {
                                                                iM559720 = (C0946.m55979("۫᩷") ^ i41) * 79;
                                                                i42 = ((iM559720 ^ i40) * 21981) ^ (-292392780);
                                                                i43 = -220041531;
                                                            } else {
                                                                iM559720 = (i40 - C0873.m55680("۠ܶ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                i42 = ((iM559720 ^ i41) * 7225) ^ (-302749194);
                                                                i43 = 1991165552;
                                                            }
                                                            break;
                                                        case -918638248:
                                                        case 1063291605:
                                                            if (C0873.m55678()) {
                                                                iM559720 = C0873.m55680("ۖᩳ") ^ i41;
                                                                i42 = ((iM559720 ^ i40) * 24673) ^ 1295640127;
                                                                i43 = 1207088761;
                                                            } else {
                                                                iM559720 = C0946.m55979("۠֨") ^ i41;
                                                                i42 = ((iM559720 ^ i40) * 411) ^ (-796593785);
                                                                i43 = 1536298322;
                                                            }
                                                            break;
                                                        case -906288011:
                                                        case -485201520:
                                                            RunnableC1014.m56177();
                                                            iM559720 = C0873.m55680("ۖᩳ") ^ i41;
                                                            i42 = ((iM559720 ^ i40) * 24673) ^ 1295640127;
                                                            i43 = 1207088761;
                                                            break;
                                                        case -774175777:
                                                        case 360005787:
                                                            if (C0890.m55740()) {
                                                                iM559720 = (i41 - C0873.m55680("ۘ᩷")) * 19;
                                                                i42 = ((iM559720 ^ i40) * (-591)) ^ (-2062920932);
                                                                i43 = -36223276;
                                                            } else {
                                                                iM559720 = (C0946.m55979("۫᩷") ^ i41) * 79;
                                                                i42 = ((iM559720 ^ i40) * 21981) ^ (-292392780);
                                                                i43 = -220041531;
                                                            }
                                                            break;
                                                        case -606672866:
                                                        case 2092988849:
                                                            if (RunnableC0871.m55672() >= 0) {
                                                                iM559720 = C0873.m55680("ۖᩳ") ^ i41;
                                                                i42 = ((iM559720 ^ i40) * 24673) ^ 1295640127;
                                                                i43 = 1207088761;
                                                            } else {
                                                                iM559720 = C0873.m55680("᩵ۡ") ^ i40;
                                                                i42 = ((iM559720 ^ i41) * 10257) ^ 490049018;
                                                                i43 = 315482096;
                                                            }
                                                            break;
                                                        case -574893827:
                                                        case 1208143874:
                                                            return;
                                                        case 234586806:
                                                        case 1176555392:
                                                            if (C0917.f81868) {
                                                                iM559720 = C0873.m55680("ܿۗ") ^ i40;
                                                                i42 = ((iM559720 ^ i41) * 21549) ^ 250554510;
                                                                i43 = -568434613;
                                                            } else {
                                                                iM559720 = C0946.m55979("ܰ᩵") ^ i41;
                                                                i42 = ((iM559720 ^ i40) * 13731) ^ 2107169721;
                                                                i43 = -1552244294;
                                                            }
                                                            break;
                                                        case 790280267:
                                                        case 1305576067:
                                                            if (C0989.m56095() <= 0) {
                                                                iM559720 = C0873.m55680("ۖᩳ") ^ i41;
                                                                i42 = ((iM559720 ^ i40) * 24673) ^ 1295640127;
                                                                i43 = 1207088761;
                                                            } else {
                                                                iM559720 = C0946.m55979("ۨ᩹") ^ i40;
                                                                i42 = ((iM559720 ^ i41) * 18447) ^ 449302198;
                                                                i43 = -1307017427;
                                                            }
                                                            break;
                                                        case 1399226970:
                                                        case 1948363160:
                                                            C1012.m56134();
                                                            if (ViewOnClickListenerC0939.f81888 <= 0) {
                                                                iM559720 = (i40 - C0873.m55680("۫۫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                i42 = ((iM559720 ^ i41) * 28441) ^ 1960157589;
                                                                i43 = 1147217293;
                                                            } else {
                                                                iM559720 = C0873.m55680("ۖᩳ") ^ i41;
                                                                i42 = ((iM559720 ^ i40) * 24673) ^ 1295640127;
                                                                i43 = 1207088761;
                                                            }
                                                            break;
                                                        case 1475002274:
                                                        case 2062518910:
                                                            if (C1036.f81953 >= 0) {
                                                                iM559720 = C0946.m55979("᩺ۗ") ^ i41;
                                                                i42 = ((iM559720 ^ i40) * 9367) ^ (-1510730137);
                                                                i43 = 1943369104;
                                                            } else {
                                                                iM559720 = C0946.m55979("֫ܶ") ^ i40;
                                                                i42 = ((iM559720 ^ i41) * (-18945)) ^ 995456878;
                                                                i43 = -981834880;
                                                            }
                                                            break;
                                                        default:
                                                            C1017.m56187();
                                                            throw new RuntimeException();
                                                    }
                                                }
                                            }

                                            @Override // p067l.InterfaceC11360
                                            /* JADX INFO: renamed from: ֫ */
                                            public final void mo3843(C25065 c25065) {
                                                int i39;
                                                int i40;
                                                short[] sArr8;
                                                short s5;
                                                short[] sArr9;
                                                int i41;
                                                int i42;
                                                short[] sArr10;
                                                short s6;
                                                int iM559720;
                                                int i43;
                                                int i44;
                                                int iM559721;
                                                int i45;
                                                int i46;
                                                int iM559722;
                                                int i47;
                                                int iM55683;
                                                int i48;
                                                int i49;
                                                int iM55684;
                                                int i50;
                                                int i51;
                                                int i52;
                                                short[] sArr11;
                                                int iM55685;
                                                int i53;
                                                int iM55686;
                                                int i54;
                                                C7651 c7651 = this;
                                                c25065 = c25065;
                                                int i55 = C1124.f82007;
                                                int i56 = RunnableC0871.f81839;
                                                int iM55687 = C0873.m55680("۬֡") ^ i55;
                                                int i57 = ((iM55687 ^ i56) * 15195) ^ 1804559598;
                                                short[] sArr12 = null;
                                                short[] sArr13 = null;
                                                short[] sArr14 = null;
                                                short[] sArr15 = null;
                                                int i58 = iM55687 ^ (-967813770);
                                                C20531 c20533 = null;
                                                int iM56586 = 0;
                                                int i59 = 0;
                                                int iM559723 = 0;
                                                int iM55688 = 0;
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
                                                            iM55683 = C0873.m55680("ܽܰ") ^ i55;
                                                            i48 = ((iM55683 ^ i56) * (-5551)) ^ (-906798001);
                                                            i49 = 403096135;
                                                            i51 = iM55683 ^ i49;
                                                            sArr13 = sArr13;
                                                            i66 = i66;
                                                            i68 = i68;
                                                            i57 = i48;
                                                            sArr14 = sArr14;
                                                            iM559723 = iM559723;
                                                            c25065 = c25065;
                                                            i58 = i51;
                                                            c7651 = this;
                                                            break;
                                                        case -1709995697:
                                                        case 557373083:
                                                            iM559723 = iM559723;
                                                            sArr10 = sArr14;
                                                            iM55688 = C0873.m55680(RunnableC0897.m55783(sArr10, i60, i61, i62));
                                                            if (C0937.m55918() < 0) {
                                                                iM55684 = (C0946.m55979("ۡۜ") ^ i55) * 55;
                                                                i57 = 1521070794 ^ ((iM55684 ^ i56) * (-10649));
                                                                i50 = 1586161491;
                                                                i51 = iM55684 ^ i50;
                                                                sArr14 = sArr10;
                                                                iM559723 = iM559723;
                                                                i58 = i51;
                                                                c7651 = this;
                                                            } else {
                                                                sArr14 = sArr10;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                int iM559724 = (i56 - C0946.m55979("᩷۠")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                iM559723 = iM559723;
                                                                c25065 = c25065;
                                                                i57 = ((iM559724 ^ i55) * 21673) ^ 1833833190;
                                                                i58 = iM559724 ^ 1479369247;
                                                                c7651 = this;
                                                            }
                                                            break;
                                                        case -1582039069:
                                                        case 362164468:
                                                            RunnableC1014.m56177();
                                                            if (C0873.f81841 <= 0) {
                                                                iM559723 = iM559723;
                                                                int iM55689 = (C0873.m55680("֡ۖ") ^ i55) * 59;
                                                                i57 = ((iM55689 ^ i56) * 3311) ^ 1285744918;
                                                                i39 = iM55689 ^ (-2105257484);
                                                                iM559723 = iM559723;
                                                                i58 = i39;
                                                                c25065 = c25065;
                                                            } else {
                                                                i52 = iM559723;
                                                                sArr11 = sArr14;
                                                                iM55685 = (i55 - C0946.m55979("ۙᩳ")) * (-35);
                                                                i57 = 891816681 ^ ((iM55685 ^ i56) * (-8087));
                                                                i53 = 1593607652;
                                                                i51 = iM55685 ^ i53;
                                                                c25065 = c25065;
                                                                iM559723 = i52;
                                                                sArr14 = sArr11;
                                                                i58 = i51;
                                                                c7651 = this;
                                                            }
                                                            break;
                                                        case -1485626056:
                                                        case 451033700:
                                                            c20533.m46333(AbstractC0942.m55960(c25065, iM559723), false);
                                                            C10027 c10027 = C10027.f27775;
                                                            break;
                                                        case -1450323193:
                                                        case -585465296:
                                                            c20533.m46332(2129779909 ^ iM55688);
                                                            C10027 c10028 = C10027.f27775;
                                                            break;
                                                        case -1401666673:
                                                        case -1165256389:
                                                            iM559723 = iM559723;
                                                            short[] sArr16 = sArr14;
                                                            c22682M56202.m50802();
                                                            boolean zM55655 = C0866.m55655(c25065);
                                                            c20533 = c20532;
                                                            if (zM55655) {
                                                                iM559722 = C0946.m55979("۟ۧ") ^ i55;
                                                                i57 = ((iM559722 ^ i56) * 547) ^ 1681859384;
                                                                i47 = 164178201;
                                                            } else {
                                                                iM559722 = C0946.m55979("ۨۤ") ^ i56;
                                                                i57 = ((iM559722 ^ i55) * 17153) ^ 184435532;
                                                                i47 = 1888807314;
                                                            }
                                                            i39 = iM559722 ^ i47;
                                                            sArr14 = sArr16;
                                                            iM559723 = iM559723;
                                                            i58 = i39;
                                                            c25065 = c25065;
                                                            break;
                                                        case -1324698789:
                                                        case -288835946:
                                                            i62 = 27456;
                                                            iM55683 = C0873.m55680("ܽܰ") ^ i55;
                                                            i48 = ((iM55683 ^ i56) * (-5551)) ^ (-906798001);
                                                            i49 = 403096135;
                                                            i51 = iM55683 ^ i49;
                                                            sArr13 = sArr13;
                                                            i66 = i66;
                                                            i68 = i68;
                                                            i57 = i48;
                                                            sArr14 = sArr14;
                                                            iM559723 = iM559723;
                                                            c25065 = c25065;
                                                            i58 = i51;
                                                            c7651 = this;
                                                            break;
                                                        case -1021784602:
                                                        case 47674557:
                                                            C1036.m56257();
                                                            if (!C0955.m56025()) {
                                                                i40 = iM559723;
                                                                sArr8 = sArr14;
                                                                s5 = s7;
                                                                sArr9 = sArr13;
                                                                i41 = i66;
                                                                i42 = i68;
                                                                iM559721 = C0946.m55979("۬᩹") ^ i56;
                                                                i45 = ((iM559721 ^ i55) * 20779) ^ 1259265257;
                                                                i46 = -669620747;
                                                                int i69 = iM559721 ^ i46;
                                                                i66 = i41;
                                                                i68 = i42;
                                                                i57 = i45;
                                                                sArr14 = sArr8;
                                                                sArr13 = sArr9;
                                                                iM559723 = i40;
                                                                s7 = s5;
                                                                i58 = i69;
                                                                c7651 = this;
                                                                c25065 = c25065;
                                                            } else {
                                                                iM559723 = iM559723;
                                                                sArr10 = sArr14;
                                                                iM55684 = C0873.m55680("۠۠") ^ i56;
                                                                i57 = 1985896463 ^ ((iM55684 ^ i55) * 22685);
                                                                i50 = -1939008677;
                                                                i51 = iM55684 ^ i50;
                                                                sArr14 = sArr10;
                                                                iM559723 = iM559723;
                                                                i58 = i51;
                                                                c7651 = this;
                                                            }
                                                            break;
                                                        case -913484507:
                                                        case 728213780:
                                                            i40 = iM559723;
                                                            sArr8 = sArr14;
                                                            s6 = s7;
                                                            sArr9 = sArr13;
                                                            i41 = i66;
                                                            i42 = i68;
                                                            sArr12 = f82006;
                                                            c3 = 0;
                                                            if (!C0892.f81851) {
                                                                s5 = s6;
                                                                iM559721 = C0946.m55979("۬᩹") ^ i56;
                                                                i45 = ((iM559721 ^ i55) * 20779) ^ 1259265257;
                                                                i46 = -669620747;
                                                                int i610 = iM559721 ^ i46;
                                                                i66 = i41;
                                                                i68 = i42;
                                                                i57 = i45;
                                                                sArr14 = sArr8;
                                                                sArr13 = sArr9;
                                                                iM559723 = i40;
                                                                s7 = s5;
                                                                i58 = i610;
                                                                c7651 = this;
                                                                c25065 = c25065;
                                                            } else {
                                                                iM559720 = C0946.m55979("ܺۨ") ^ i56;
                                                                i43 = ((iM559720 ^ i55) * 10239) ^ 517176708;
                                                                i44 = -1031044635;
                                                                int i70 = iM559720 ^ i44;
                                                                i66 = i41;
                                                                i68 = i42;
                                                                sArr13 = sArr9;
                                                                iM559723 = i40;
                                                                i58 = i70;
                                                                i57 = i43;
                                                                s7 = s6;
                                                                sArr14 = sArr8;
                                                                c7651 = this;
                                                                c25065 = c25065;
                                                            }
                                                            break;
                                                        case -815025555:
                                                        case 567996178:
                                                            C1929.m56553();
                                                            break;
                                                        case -453061978:
                                                        case 254631854:
                                                            iM559723 = iM559723;
                                                            sArr14 = f82006;
                                                            i60 = 9;
                                                            i61 = 3;
                                                            if (C1964.m56597() == 0) {
                                                                int iM559725 = (C0946.m55979("ܽۖ") + i56) * (-57);
                                                                i57 = (-1486278055) ^ ((iM559725 ^ i55) * 24227);
                                                                i51 = iM559725 ^ 748887831;
                                                                iM559723 = iM559723;
                                                                i58 = i51;
                                                                c7651 = this;
                                                            } else {
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                int iM559726 = (i56 - C0946.m55979("᩷۠")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                iM559723 = iM559723;
                                                                c25065 = c25065;
                                                                i57 = ((iM559726 ^ i55) * 21673) ^ 1833833190;
                                                                i58 = iM559726 ^ 1479369247;
                                                                c7651 = this;
                                                            }
                                                            break;
                                                        case -378549567:
                                                        case 973571721:
                                                            iM559723 = iM559723;
                                                            sArr10 = sArr14;
                                                            if (C1964.m56586(c25065) == 1600) {
                                                                iM55684 = (i55 - C0873.m55680("ۛ᩷")) * 77;
                                                                i57 = (-638009396) ^ ((iM55684 ^ i56) * (-10621));
                                                                i50 = 440922110;
                                                            } else {
                                                                iM55684 = C0946.m55979("۟ۛ") ^ i56;
                                                                i57 = 847834117 ^ ((iM55684 ^ i55) * 28201);
                                                                i50 = -1606255642;
                                                            }
                                                            i51 = iM55684 ^ i50;
                                                            sArr14 = sArr10;
                                                            iM559723 = iM559723;
                                                            i58 = i51;
                                                            c7651 = this;
                                                            break;
                                                        case -181336701:
                                                        case 1527184919:
                                                            iM559723 = iM559723;
                                                            sArr10 = sArr14;
                                                            sArr13 = f82006;
                                                            i66 = 1;
                                                            i68 = 8;
                                                            if (C0898.f81858 <= 0) {
                                                                iM55684 = C0873.m55680("۠۠") ^ i56;
                                                                i57 = 1985896463 ^ ((iM55684 ^ i55) * 22685);
                                                                i50 = -1939008677;
                                                            } else {
                                                                iM55684 = (C0946.m55979("ᩴ᩶") ^ i56) * (-97);
                                                                i57 = 344244899 ^ ((iM55684 ^ i55) * 15929);
                                                                i50 = 1590216470;
                                                            }
                                                            i51 = iM55684 ^ i50;
                                                            sArr14 = sArr10;
                                                            iM559723 = iM559723;
                                                            i58 = i51;
                                                            c7651 = this;
                                                            break;
                                                        case -166978843:
                                                        case 1212803522:
                                                            iM559723 = iM559723;
                                                            sArr14 = sArr14;
                                                            sArr13 = sArr13;
                                                            i66 = i66;
                                                            i68 = i68;
                                                            C1025.m56218(c25065, C0863.m55635(sArr13, i66, i68, i62));
                                                            if (C1964.m56597() == 0) {
                                                                iM55683 = C0873.m55680("ܳۤ") ^ i55;
                                                                i48 = ((iM55683 ^ i56) * 1547) ^ (-656528969);
                                                                i49 = 1094944201;
                                                                i51 = iM55683 ^ i49;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                i57 = i48;
                                                                sArr14 = sArr14;
                                                                iM559723 = iM559723;
                                                                c25065 = c25065;
                                                                i58 = i51;
                                                                c7651 = this;
                                                            } else {
                                                                sArr14 = sArr14;
                                                                int iM559727 = (i56 - C0946.m55979("᩷۠")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                iM559723 = iM559723;
                                                                c25065 = c25065;
                                                                i57 = ((iM559727 ^ i55) * 21673) ^ 1833833190;
                                                                i58 = iM559727 ^ 1479369247;
                                                                c7651 = this;
                                                            }
                                                            break;
                                                        case 199198653:
                                                        case 1124808609:
                                                            byte[] bArrM55023 = c25065.m55023();
                                                            iM559723 = iM559723;
                                                            short[] sArr17 = f82006;
                                                            if (C1229.m56410() == 0) {
                                                                short[] sArr18 = sArr14;
                                                                int iM559728 = C0946.m55979(C0873.m55689(sArr17, 15, 3, i62)) ^ 2101523056;
                                                                if (C1012.f81938 < 0) {
                                                                    AbstractActivityC5549 abstractActivityC55411 = abstractActivityC55410;
                                                                    String strM55590 = C0845.m55590(abstractActivityC55411, iM559728);
                                                                    short[] sArr19 = f82006;
                                                                    if (C0877.f81843 < 0) {
                                                                        C0947.m55988(strM55590, C1071.m56336(sArr19, 18, 14, i62));
                                                                        new ViewOnClickListenerC5639(abstractActivityC55411, c20533, bArrM55023, strM55590);
                                                                    }
                                                                }
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                sArr14 = sArr18;
                                                                int iM559729 = (i56 - C0946.m55979("᩷۠")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                                sArr13 = sArr13;
                                                                i66 = i66;
                                                                i68 = i68;
                                                                iM559723 = iM559723;
                                                                c25065 = c25065;
                                                                i57 = ((iM559729 ^ i55) * 21673) ^ 1833833190;
                                                                i58 = iM559729 ^ 1479369247;
                                                                c7651 = this;
                                                            } else {
                                                                int iM556810 = (C0873.m55680("֡ۖ") ^ i55) * 59;
                                                                i57 = ((iM556810 ^ i56) * 3311) ^ 1285744918;
                                                                i39 = iM556810 ^ (-2105257484);
                                                                iM559723 = iM559723;
                                                                i58 = i39;
                                                                c25065 = c25065;
                                                            }
                                                            break;
                                                        case 692782722:
                                                        case 855253251:
                                                            if (!C0863.m55643()) {
                                                                i40 = iM559723;
                                                                sArr8 = sArr14;
                                                                s5 = s7;
                                                                sArr9 = sArr13;
                                                                i41 = i66;
                                                                i42 = i68;
                                                                iM559721 = C0946.m55979("۬᩹") ^ i56;
                                                                i45 = ((iM559721 ^ i55) * 20779) ^ 1259265257;
                                                                i46 = -669620747;
                                                                int i611 = iM559721 ^ i46;
                                                                i66 = i41;
                                                                i68 = i42;
                                                                i57 = i45;
                                                                sArr14 = sArr8;
                                                                sArr13 = sArr9;
                                                                iM559723 = i40;
                                                                s7 = s5;
                                                                i58 = i611;
                                                                c7651 = this;
                                                                c25065 = c25065;
                                                            } else {
                                                                i52 = iM559723;
                                                                sArr11 = sArr14;
                                                                iM55685 = (i55 - C0946.m55979("ۙᩳ")) * (-35);
                                                                i57 = 891816681 ^ ((iM55685 ^ i56) * (-8087));
                                                                i53 = 1593607652;
                                                                i51 = iM55685 ^ i53;
                                                                c25065 = c25065;
                                                                iM559723 = i52;
                                                                sArr14 = sArr11;
                                                                i58 = i51;
                                                                c7651 = this;
                                                            }
                                                            break;
                                                        case 834458570:
                                                        case 1534105764:
                                                            i40 = iM559723;
                                                            sArr8 = sArr14;
                                                            sArr9 = sArr13;
                                                            i41 = i66;
                                                            i42 = i68;
                                                            s5 = sArr12[c3];
                                                            i65 = s5 * s5;
                                                            if (C0992.m56107() <= 0) {
                                                                iM559721 = C0946.m55979("۬᩹") ^ i56;
                                                                i45 = ((iM559721 ^ i55) * 20779) ^ 1259265257;
                                                                i46 = -669620747;
                                                            } else {
                                                                iM559721 = C0873.m55680("۟ܶ") ^ i55;
                                                                i45 = ((iM559721 ^ i56) * (-6581)) ^ 1867614816;
                                                                i46 = -1131719976;
                                                            }
                                                            int i612 = iM559721 ^ i46;
                                                            i66 = i41;
                                                            i68 = i42;
                                                            i57 = i45;
                                                            sArr14 = sArr8;
                                                            sArr13 = sArr9;
                                                            iM559723 = i40;
                                                            s7 = s5;
                                                            i58 = i612;
                                                            c7651 = this;
                                                            c25065 = c25065;
                                                            break;
                                                        case 868540313:
                                                        case 1106078551:
                                                            C1048.m56305();
                                                            C1003.m56123();
                                                            i52 = iM559723;
                                                            sArr11 = sArr14;
                                                            iM55685 = (i55 - C0946.m55979("ۙᩳ")) * (-35);
                                                            i57 = 891816681 ^ ((iM55685 ^ i56) * (-8087));
                                                            i53 = 1593607652;
                                                            i51 = iM55685 ^ i53;
                                                            c25065 = c25065;
                                                            iM559723 = i52;
                                                            sArr14 = sArr11;
                                                            i58 = i51;
                                                            c7651 = this;
                                                            break;
                                                        case 968449941:
                                                        case 1430622804:
                                                            i52 = iM559723;
                                                            sArr11 = sArr14;
                                                            iM56586 = C1964.m56586(c25065);
                                                            i59 = 9;
                                                            sArr15 = f82006;
                                                            i63 = 12;
                                                            i64 = 3;
                                                            if (RunnableC0897.f81856) {
                                                                iM55685 = C0873.m55680("ۛۡ") ^ i56;
                                                                i57 = 853472675 ^ ((iM55685 ^ i55) * 11505);
                                                                i53 = -1048397042;
                                                            } else {
                                                                iM55685 = (i55 - C0946.m55979("ۙᩳ")) * (-35);
                                                                i57 = 891816681 ^ ((iM55685 ^ i56) * (-8087));
                                                                i53 = 1593607652;
                                                            }
                                                            i51 = iM55685 ^ i53;
                                                            c25065 = c25065;
                                                            iM559723 = i52;
                                                            sArr14 = sArr11;
                                                            i58 = i51;
                                                            c7651 = this;
                                                            break;
                                                        case 1099903869:
                                                        case 1371319992:
                                                            i40 = iM559723;
                                                            sArr8 = sArr14;
                                                            i41 = i66;
                                                            i42 = i68;
                                                            s6 = s7;
                                                            sArr9 = sArr13;
                                                            if ((i65 + 5635876) - (s6 * 4748) < 0) {
                                                                iM559720 = C0946.m55979("ܶۤ") ^ i55;
                                                                i43 = ((iM559720 ^ i56) * 3493) ^ 605430872;
                                                                i44 = -146303074;
                                                            } else {
                                                                iM559720 = C0873.m55680("֡ܶ") ^ i56;
                                                                i43 = ((iM559720 ^ i55) * (-23001)) ^ (-1308157322);
                                                                i44 = 1999895692;
                                                            }
                                                            int i71 = iM559720 ^ i44;
                                                            i66 = i41;
                                                            i68 = i42;
                                                            sArr13 = sArr9;
                                                            iM559723 = i40;
                                                            i58 = i71;
                                                            i57 = i43;
                                                            s7 = s6;
                                                            sArr14 = sArr8;
                                                            c7651 = this;
                                                            c25065 = c25065;
                                                            break;
                                                        case 1484365767:
                                                        case 1853680346:
                                                            short[] sArr20 = sArr14;
                                                            iM559723 = C0946.m55979(C0930.m55893(sArr15, i63, i64, i62)) ^ 2103257909;
                                                            if (iM56586 == i59) {
                                                                iM55686 = (C0946.m55979("᩹ܺ") ^ i56) * 71;
                                                                i57 = (-672789130) ^ ((iM55686 ^ i55) * (-13007));
                                                                i54 = -910273806;
                                                            } else {
                                                                iM55686 = C0873.m55680("ᩴܶ") ^ i55;
                                                                i57 = 1027275938 ^ ((iM55686 ^ i56) * 10251);
                                                                i54 = 1246182957;
                                                            }
                                                            i58 = iM55686 ^ i54;
                                                            c7651 = this;
                                                            c25065 = c25065;
                                                            sArr14 = sArr20;
                                                            break;
                                                        default:
                                                            c20533.m46333(RunnableC1014.m56178(c25065, iM559723), true);
                                                            C10027 c10029 = C10027.f27775;
                                                            break;
                                                    }
                                                    return;
                                                }
                                            }
                                        };
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM559710 = C0946.m55979("ܿܰ") ^ i28;
                                            i13 = ((iM559710 ^ i27) * (-28969)) ^ (-533374221);
                                            i14 = -1183702089;
                                        } else {
                                            iM559710 = (C0873.m55680("᩷ܶ") ^ i27) * (-113);
                                            i13 = ((iM559710 ^ i28) * (-13801)) ^ 1092138583;
                                            i14 = 739460382;
                                        }
                                        i30 = iM559710 ^ i14;
                                        i29 = i13;
                                        break;
                                    case 366594687:
                                    case 1019021863:
                                        if (RunnableC0938.m55938() == 0) {
                                            C0892.m55747(new Thread(new RunnableC5798(str3, abstractActivityC55410, interfaceC11360, 0)));
                                        }
                                        iM559710 = (C0873.m55680("ܺܺ") + i28) * (-123);
                                        i13 = ((iM559710 ^ i27) * (-24249)) ^ (-1201165872);
                                        i14 = -815926983;
                                        i30 = iM559710 ^ i14;
                                        i29 = i13;
                                        break;
                                    case 437447033:
                                    case 1723975746:
                                        c22682M56202 = C1024.m56202(C0946.m55979(strM55689) ^ 2123823908);
                                        if (C1964.f83032 > 0) {
                                            iM559710 = (i28 - C0946.m55979("ܶ᩷")) * (-49);
                                            i13 = ((iM559710 ^ i27) * (-11491)) ^ (-185543547);
                                            i14 = 2142843584;
                                            i30 = iM559710 ^ i14;
                                            i29 = i13;
                                        } else {
                                            i31 = i31;
                                            s3 = s4;
                                            str = strM55783;
                                            sArr5 = sArr5;
                                            iM559711 = (C0873.m55680("֡֫") ^ i28) * 75;
                                            i15 = ((iM559711 ^ i27) * 11249) ^ 857514738;
                                            i16 = -512304784;
                                            i17 = iM559711 ^ i16;
                                            strM55783 = str;
                                            s4 = s3;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i17;
                                            i29 = i15;
                                            c21063 = this;
                                            baseResp2 = baseResp;
                                        }
                                        break;
                                    case 497970377:
                                    case 1806973169:
                                        AbstractC0942.m55971();
                                        i31 = i31;
                                        iM559713 = (C0946.m55979("ᩳܽ") ^ i27) * 97;
                                        i23 = ((iM559713 ^ i28) * (-8191)) ^ 361344993;
                                        i25 = 2025948570;
                                        i26 = iM559713 ^ i25;
                                        i22 = i31;
                                        i30 = i26;
                                        i29 = i23;
                                        i31 = i22;
                                        break;
                                    case 679510118:
                                    case 1209161069:
                                        sArr5 = sArr5;
                                        strM55689 = C0873.m55689(sArr5, i33, 3, i32);
                                        if (C0898.m55800() > 0) {
                                            iM55681 = C0873.m55680("֨᩻") ^ i27;
                                            i31 = i31;
                                            i23 = ((iM55681 ^ i28) * 8777) ^ 636423448;
                                            i24 = -740992327;
                                            i26 = iM55681 ^ i24;
                                            sArr5 = sArr5;
                                            i22 = i31;
                                            i30 = i26;
                                            i29 = i23;
                                            i31 = i22;
                                        } else {
                                            i31 = i31;
                                            s3 = s4;
                                            str = strM55783;
                                            iM559711 = (C0873.m55680("֡֫") ^ i28) * 75;
                                            i15 = ((iM559711 ^ i27) * 11249) ^ 857514738;
                                            i16 = -512304784;
                                            i17 = iM559711 ^ i16;
                                            strM55783 = str;
                                            s4 = s3;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i17;
                                            i29 = i15;
                                            c21063 = this;
                                            baseResp2 = baseResp;
                                        }
                                        break;
                                    case 680986584:
                                    case 694314718:
                                        i31 = i31;
                                        str = strM55783;
                                        sArr5 = sArr5;
                                        s3 = s4;
                                        if ((s3 * 12118) - (i34 + 36711481) <= 0) {
                                            iM559711 = (C0946.m55979("ܺ۫") ^ i27) * 27;
                                            i15 = ((iM559711 ^ i28) * 4763) ^ (-1956648265);
                                            i16 = 2067068637;
                                        } else {
                                            iM559711 = (i28 - C0873.m55680("ۖ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i15 = ((iM559711 ^ i27) * (-16245)) ^ 580881030;
                                            i16 = -462333115;
                                        }
                                        i17 = iM559711 ^ i16;
                                        strM55783 = str;
                                        s4 = s3;
                                        sArr5 = sArr5;
                                        i31 = i31;
                                        i30 = i17;
                                        i29 = i15;
                                        c21063 = this;
                                        baseResp2 = baseResp;
                                        break;
                                    case 713709208:
                                    case 792225104:
                                        c20532.m46335();
                                        break;
                                    case 1423134102:
                                    case 2054660074:
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM559710 = (C0873.m55680("ܺܺ") + i28) * (-123);
                                            i13 = ((iM559710 ^ i27) * (-24249)) ^ (-1201165872);
                                            i14 = -815926983;
                                            i30 = iM559710 ^ i14;
                                            i29 = i13;
                                        } else {
                                            i31 = i31;
                                            iM559713 = (C0946.m55979("ᩳܽ") ^ i27) * 97;
                                            i23 = ((iM559713 ^ i28) * (-8191)) ^ 361344993;
                                            i25 = 2025948570;
                                            i26 = iM559713 ^ i25;
                                            i22 = i31;
                                            i30 = i26;
                                            i29 = i23;
                                            i31 = i22;
                                        }
                                        break;
                                    case 1677128321:
                                    case 1680584360:
                                        i31 = i31;
                                        strM55783 = strM55783;
                                        sArr5 = sArr5;
                                        C1025.m56218(baseResp2, strM55783);
                                        c20532 = c20531;
                                        if (!c20532.m46334()) {
                                            iM559712 = C0873.m55680("᩻ܺ") ^ i27;
                                            i19 = ((iM559712 ^ i28) * 17039) ^ (-124893647);
                                            i20 = 616212147;
                                            i18 = iM559712 ^ i20;
                                            strM55783 = strM55783;
                                            i29 = i19;
                                            sArr5 = sArr5;
                                            i31 = i31;
                                            i30 = i18;
                                            c21063 = this;
                                        } else {
                                            int iM55683 = C0873.m55680("ܶۗ") ^ i27;
                                            int i39 = ((iM55683 ^ i28) * (-5197)) ^ 740643207;
                                            i21 = iM55683 ^ (-978797668);
                                            strM55783 = strM55783;
                                            sArr5 = sArr5;
                                            i29 = i39;
                                            c21063 = this;
                                            i22 = i31;
                                            i30 = i21;
                                            i31 = i22;
                                        }
                                        break;
                                    case 1891370709:
                                    case 1979311881:
                                        break;
                                    default:
                                        C1229.m56410();
                                        if (C1024.m56209() < 0) {
                                            sArr5 = sArr5;
                                            int iM5597111 = C0946.m55979("ۖ᩹") ^ i27;
                                            i29 = (-2004565644) ^ ((iM5597111 ^ i28) * (-18053));
                                            i30 = iM5597111 ^ (-8054173);
                                            c21063 = this;
                                            baseResp2 = baseResp;
                                            sArr5 = sArr5;
                                        } else {
                                            iM559710 = C0946.m55979("ܿܰ") ^ i28;
                                            i13 = ((iM559710 ^ i27) * (-28969)) ^ (-533374221);
                                            i14 = -1183702089;
                                            i30 = iM559710 ^ i14;
                                            i29 = i13;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (C0890.m55740()) {
                        int iM559710 = (i4 - C0946.m55979("۫᩵")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM559710 ^ i3) * 14825) ^ (-1546714124);
                        i6 = iM559710 ^ 1522865591;
                    } else {
                        iM55979 = C0946.m55979("ۨ۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-21531)) ^ 1819039419;
                        i2 = -739967025;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    }
                    break;
                case -979690205:
                case -975736178:
                    i9 = 43694;
                    iM55979 = (C0873.m55680("ܿ۬") ^ i3) * (-31);
                    i = ((iM55979 ^ i4) * (-3263)) ^ (-486189084);
                    i2 = 631611796;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -919279965:
                case -182727271:
                    C0882.m55710();
                    C1124.m56367();
                    break;
                case -868537371:
                case -684061508:
                    C0927.m55873();
                    if (C0861.f81831) {
                        iM55979 = C0946.m55979("ܽܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    } else {
                        iM55979 = (C0873.m55680("ۢܺ") ^ i3) * 109;
                        i = ((iM55979 ^ i4) * (-32419)) ^ 468902226;
                        i2 = 2025827790;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -552193545:
                case 650574255:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0873.m55680("ۢܺ") ^ i3) * 109;
                        i = ((iM55979 ^ i4) * (-32419)) ^ 468902226;
                        i2 = 2025827790;
                    } else {
                        iM55979 = C0946.m55979("᩺ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * (-7143)) ^ (-1015449361);
                        i2 = 2110313812;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -214356332:
                case -100323220:
                    strM55717 = C0882.m55717(f82162, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 13, i9);
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("ۖܺ") ^ i4;
                        i = ((iM55979 ^ i3) * 22299) ^ (-1158427761);
                        i2 = -1815039382;
                    } else {
                        iM55979 = C0946.m55979("᩺ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * (-7143)) ^ (-1015449361);
                        i2 = 2110313812;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 97707177:
                case 2100815192:
                    C1017.m56187();
                    iM55979 = C0946.m55979("۬֨") ^ i3;
                    i = ((iM55979 ^ i4) * (-65)) ^ (-1168938450);
                    i2 = 3787570;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 110668755:
                case 313424983:
                    req.scope = C1048.m56318(sArr4, 76, 15, i9);
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("ۢܺ") ^ i3) * 109;
                        i = ((iM55979 ^ i4) * (-32419)) ^ 468902226;
                        i2 = 2025827790;
                    } else {
                        iM55979 = (C0946.m55979("᩶ܰ") ^ i4) * 77;
                        i = ((iM55979 ^ i3) * 8737) ^ (-974332249);
                        i2 = 616646993;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 572566537:
                case 2080036410:
                    C1048.m56315(value, strM55717);
                    ((IWXAPI) value).sendReq(req);
                    break;
                case 667105709:
                case 814302955:
                    C0863.m55643();
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("۬֨") ^ i3;
                        i = ((iM55979 ^ i4) * (-65)) ^ (-1168938450);
                        i2 = 3787570;
                    } else {
                        iM55979 = C0946.m55979("ܽܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-7349)) ^ 995039521;
                        i2 = -1272789426;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    i9 = 7589;
                    iM55979 = (C0873.m55680("ܿ۬") ^ i3) * (-31);
                    i = ((iM55979 ^ i4) * (-3263)) ^ (-486189084);
                    i2 = 631611796;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    static {
        C6310 c6310 = null;
        InterfaceC18744 interfaceC18744M36565 = null;
        C20392 c20392 = null;
        int i = -1313965116;
        int i2 = C1012.f81938;
        int i3 = C0912.f81867;
        int iM55979 = (C0946.m55979("᩻֨") ^ i3) * (-69);
        int i4 = ((iM55979 ^ i2) * 2407) ^ 1321820452;
        int i5 = 768450915;
        while (true) {
            i = ((((i ^ i2) * 11427) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1885907224:
                case 1753177736:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55979 = C0873.m55680("ۘ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 12935) ^ 828116468;
                        i5 = 969112473;
                    } else {
                        iM55979 = C0873.m55680("᩵᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15533) ^ 1149168687;
                        i5 = 901911945;
                    }
                    break;
                case -1849264238:
                case -1200426821:
                    RunnableC0871.m55672();
                    throw new RuntimeException();
                case -1804541997:
                case 1611355048:
                    f38600 = C16061.m36565(c20392);
                    return;
                case -1755581152:
                case 374104841:
                    c6310 = new C6310();
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0946.m55979("۠ۖ") + i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 26879) ^ (-772267862);
                        i5 = 497947154;
                    } else {
                        iM55979 = (C0873.m55680("᩹᩷") ^ i3) * (-71);
                        i4 = ((iM55979 ^ i2) * 31655) ^ 1926599578;
                        i5 = -1034699347;
                    }
                    break;
                case -1522434913:
                case -107823413:
                    c20392 = new C20392();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0873.m55680("ۖܺ") + i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-20347)) ^ 1140682792;
                        i5 = 1190841641;
                    } else {
                        iM55979 = (C0946.m55979("᩸ܶ") + i3) * (-7);
                        i4 = ((iM55979 ^ i2) * (-1089)) ^ (-852567571);
                        i5 = -1322417391;
                    }
                    break;
                case -1505837901:
                case -247173097:
                    if (C0892.f81851) {
                        iM55979 = (C0946.m55979("۫ۛ") ^ i2) * (-35);
                        i4 = ((iM55979 ^ i3) * 10391) ^ (-1117405374);
                        i5 = 497948117;
                    } else {
                        iM55979 = (C0946.m55979("۠ۖ") + i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 26879) ^ (-772267862);
                        i5 = 497947154;
                    }
                    break;
                case -1438850059:
                case 215317941:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0946.m55979("۠ۖ") + i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 26879) ^ (-772267862);
                        i5 = 497947154;
                    } else {
                        iM55979 = (C0946.m55979("۬ܰ") ^ i2) * 119;
                        i4 = ((iM55979 ^ i3) * 20121) ^ 935778313;
                        i5 = -1795668209;
                    }
                    break;
                case -1341863732:
                case 333895358:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0946.m55979("۬ܰ") ^ i2) * 119;
                        i4 = ((iM55979 ^ i3) * 20121) ^ 935778313;
                        i5 = -1795668209;
                    } else {
                        iM55979 = C0946.m55979("ۢۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6799)) ^ 1881972881;
                        i5 = 1750771478;
                    }
                    break;
                case -914785766:
                case -883944241:
                    interfaceC18744M36565 = C16061.m36565(c6310);
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("ۘܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 4591) ^ 289408955;
                        i5 = 1641659973;
                    } else {
                        iM55979 = C0873.m55680("ۧ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2957)) ^ (-585513861);
                        i5 = 1651404226;
                    }
                    break;
                case -724746744:
                case -130281180:
                    f38599 = interfaceC18744M36565;
                    if (C1053.m56327() >= 0) {
                        iM55979 = C0873.m55680("ۧ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2957)) ^ (-585513861);
                        i5 = 1651404226;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ܰۖ")) * (-121);
                        i4 = ((iM55979 ^ i3) * (-21099)) ^ (-1512692362);
                        i5 = -863237871;
                    }
                    break;
                case -679809717:
                case 1946073911:
                    C0898.m55800();
                    if (C0906.f81862 < 0) {
                        iM55979 = C0873.m55680("ۘ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 12935) ^ 828116468;
                        i5 = 969112473;
                    } else {
                        iM55979 = (C0946.m55979("۬ܰ") ^ i2) * 119;
                        i4 = ((iM55979 ^ i3) * 20121) ^ 935778313;
                        i5 = -1795668209;
                    }
                    break;
                case -672173437:
                case 2047441348:
                    if (!C1024.f81946) {
                        iM55979 = (C0946.m55979("۠ۖ") + i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 26879) ^ (-772267862);
                        i5 = 497947154;
                    } else {
                        iM55979 = (C0873.m55680("ۖܺ") + i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-20347)) ^ 1140682792;
                        i5 = 1190841641;
                    }
                    break;
                case -577948564:
                case 2092237204:
                    ViewOnClickListenerC0939.m55941();
                    C0845.m55584();
                    iM55979 = (C0946.m55979("۬ܰ") ^ i2) * 119;
                    i4 = ((iM55979 ^ i3) * 20121) ^ 935778313;
                    i5 = -1795668209;
                    break;
                case -498824530:
                case 1980465337:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("ۖܺ") + i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-20347)) ^ 1140682792;
                        i5 = 1190841641;
                    } else {
                        iM55979 = C0946.m55979("ۧ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7935)) ^ 85822726;
                        i5 = -2003157196;
                    }
                    break;
                case 215090715:
                case 597657677:
                    if (C1003.m56123() != 0) {
                        iM55979 = C0873.m55680("ۧ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2957)) ^ (-585513861);
                        i5 = 1651404226;
                    } else {
                        iM55979 = C0946.m55979("᩵ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6477)) ^ (-1273275469);
                        i5 = -1494108527;
                    }
                    break;
                default:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ۖܺ") + i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-20347)) ^ 1140682792;
                        i5 = 1190841641;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ܺ᩹")) * (-53);
                        i4 = ((iM55979 ^ i3) * (-9845)) ^ 1332607645;
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
    /* JADX INFO: renamed from: ֫ */
    public static C20468 m31086() {
        int iM55680;
        int i;
        int i2;
        int i3 = C0930.f81879;
        int i4 = C1071.f81975;
        int iM55681 = (C0873.m55680("ܶܳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i5 = ((iM55681 ^ i3) * (-29043)) ^ 553604117;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ 1429140615;
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
        String strM56132 = null;
        Object value = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 3297) >> 31));
            switch (i13) {
                case -1940321161:
                case -1737171045:
                    i11 = 22986;
                    iM55680 = C0873.m55680("֨ۢ") ^ i4;
                    i = ((iM55680 ^ i3) * 8923) ^ 1340071877;
                    i2 = -673857312;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1893341928:
                case 1707638712:
                    sArr = f82162;
                    c = 0;
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("۠ۡ") ^ i3;
                        i = ((iM55680 ^ i4) * 20705) ^ 1900607693;
                        i2 = 23101473;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩸֫")) * 59;
                        i = ((iM55680 ^ i4) * 17465) ^ (-742134263);
                        i2 = 848244493;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1342985383:
                case 1627378486:
                    strM56132 = C1003.m56132(sArr2, i12, 13, i11);
                    if (C0947.m55997()) {
                        iM55680 = (i4 - C0946.m55979("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM55680 = C0873.m55680("۬ۡ") ^ i4;
                        i = ((iM55680 ^ i3) * 5207) ^ 1488610695;
                        i2 = 1094998910;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1295523794:
                case -261320697:
                    C0946.m55980();
                    if (C1048.f81963) {
                        iM55680 = (i4 - C0946.m55979("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM55680 = (C0873.m55680("֡ܰ") + i3) * 53;
                        i = ((iM55680 ^ i4) * 23553) ^ (-1760163128);
                        i2 = 1884110896;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1248773461:
                case 1644748065:
                    i11 = 28366;
                    iM55680 = C0873.m55680("֨ۢ") ^ i4;
                    i = ((iM55680 ^ i3) * 8923) ^ 1340071877;
                    i2 = -673857312;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1071512022:
                case 50845158:
                    if ((i10 * i10) - i9 > 0) {
                        iM55680 = C0946.m55979("۟۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-15133)) ^ (-1977297591);
                        i2 = -1428027050;
                    } else {
                        iM55680 = C0946.m55979("۫᩺") ^ i3;
                        i = ((iM55680 ^ i4) * (-7603)) ^ 2064871887;
                        i2 = -1691571278;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1045357544:
                case 1230330916:
                    i7 = s * s;
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0873.m55680("֡ܰ") + i3) * 53;
                        i = ((iM55680 ^ i4) * 23553) ^ (-1760163128);
                        i2 = 1884110896;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ᩴۖ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i3) * 19059) ^ (-1291562152);
                        i2 = 404798385;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -768624909:
                case 783890807:
                    i8 = i7 + 21529600;
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0873.m55680("ۘۨ") + i4) * (-119);
                        i = ((iM55680 ^ i3) * 16015) ^ 495346328;
                        i2 = -382449291;
                    } else {
                        iM55680 = C0946.m55979("ܰ۫") ^ i3;
                        i = ((iM55680 ^ i4) * (-7535)) ^ (-782672698);
                        i2 = -574354856;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -626732920:
                case 423291902:
                    i12 = 1;
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0946.m55979("۠ᩴ") + i3) * (-11);
                        i = ((iM55680 ^ i4) * (-603)) ^ 1820632691;
                        i2 = 1326817084;
                    } else {
                        iM55680 = (C0946.m55979("ۧᩳ") + i3) * 127;
                        i = ((iM55680 ^ i4) * (-3565)) ^ (-1938711915);
                        i2 = 1351945640;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -619903649:
                case 1829541810:
                    i10 = s + s2;
                    if (C1044.f81959 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩹᩹")) * 123;
                        i = ((iM55680 ^ i3) * (-9221)) ^ (-317795234);
                        i2 = 1519323082;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -585652967:
                case 929650744:
                    C0854.m55595();
                    return null;
                case -287567602:
                case -210137579:
                    i9 = i8 + i8;
                    s2 = 4640;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (C0873.m55680("ۘۨ") + i4) * (-119);
                        i = ((iM55680 ^ i3) * 16015) ^ 495346328;
                        i2 = -382449291;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩺᩶")) * 109;
                        i = ((iM55680 ^ i4) * 965) ^ 1335951831;
                        i2 = 1043659885;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -244406246:
                case 351019675:
                    value = f38599.getValue();
                    if (C1048.m56305() >= 0) {
                        iM55680 = (C0873.m55680("ۘۨ") + i4) * (-119);
                        i = ((iM55680 ^ i3) * 16015) ^ 495346328;
                        i2 = -382449291;
                    } else {
                        iM55680 = (C0873.m55680("᩸ۙ") + i3) * 37;
                        i = ((iM55680 ^ i4) * (-24041)) ^ (-598837166);
                        i2 = -2020495194;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -215100409:
                case 393341221:
                    C1124.m56367();
                    if (C0854.f81826 != 0) {
                        iM55680 = (i4 - C0946.m55979("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM55680 = C0873.m55680("۠ۡ") ^ i3;
                        i = ((iM55680 ^ i4) * 20705) ^ 1900607693;
                        i2 = 23101473;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -160954628:
                case 1039656220:
                    s = sArr[c];
                    if (C1024.m56209() >= 0) {
                        iM55680 = (i4 - C0946.m55979("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM55680 = C0946.m55979("ۡ۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-1367)) ^ (-1392459731);
                        i2 = -418767161;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 110992777:
                case 1744787659:
                    C0947.m55988(value, strM56132);
                    return (C20468) value;
                case 803028438:
                case 1376495180:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ۖ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i3) * (-7973)) ^ 629168898;
                        i2 = 1053682829;
                    } else {
                        iM55680 = (C0946.m55979("۠ᩴ") + i3) * (-11);
                        i = ((iM55680 ^ i4) * (-603)) ^ 1820632691;
                        i2 = 1326817084;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 978454290:
                case 1179061557:
                    sArr2 = f82162;
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0873.m55680("ۘۨ") + i4) * (-119);
                        i = ((iM55680 ^ i3) * 16015) ^ 495346328;
                        i2 = -382449291;
                    } else {
                        iM55680 = C0946.m55979("ܶ۬") ^ i4;
                        i = ((iM55680 ^ i3) * 3661) ^ 22307638;
                        i2 = -65017794;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    ServiceConnectionC1013.m56157();
                    iM55680 = (C0873.m55680("֡ܰ") + i3) * 53;
                    i = ((iM55680 ^ i4) * 23553) ^ (-1760163128);
                    i2 = 1884110896;
                    i6 = iM55680 ^ i2;
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
    /* JADX INFO: renamed from: ֫ */
    public static void m31087(AbstractActivityC5549 abstractActivityC5549, C20531 c20531) {
        int iM55680;
        int i;
        int i2;
        int i3 = C0967.f81910;
        int i4 = C0894.f81854;
        int iM55979 = C0946.m55979("ۜۧ") ^ i3;
        int i5 = ((iM55979 ^ i4) * 7883) ^ 1144570490;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ 1446032626;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 2023233172;
        C8321 c8321 = null;
        String strM55689 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 10479) >> 31));
            switch (i12) {
                case -2122202194:
                case 536888449:
                    s2 = 4316;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (i3 - C0946.m55979("ᩳܺ")) * (-35);
                        i = ((iM55680 ^ i4) * 6975) ^ 1940109590;
                        i2 = 33989160;
                    } else {
                        iM55680 = C0946.m55979("֨᩷") ^ i3;
                        i = ((iM55680 ^ i4) * (-3173)) ^ (-1841953399);
                        i2 = 1744543963;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2069950385:
                case -329277120:
                    if ((s * s2) - i8 > 0) {
                        iM55680 = (C0946.m55979("᩵۟") + i4) * 75;
                        i = ((iM55680 ^ i3) * (-28845)) ^ (-1830692297);
                        i2 = 1859950455;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩻ܺ")) * (-23);
                        i = ((iM55680 ^ i4) * 2487) ^ (-229336149);
                        i2 = -1485894553;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1568460027:
                case -577460435:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (i3 - C0946.m55979("ᩳܺ")) * (-35);
                        i = ((iM55680 ^ i4) * 6975) ^ 1940109590;
                        i2 = 33989160;
                    } else {
                        iM55680 = (C0873.m55680("ܰۢ") + i3) * 9;
                        i = ((iM55680 ^ i4) * 8741) ^ 2109130156;
                        i2 = 1531175090;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1526739858:
                case 1181631885:
                    sArr2 = f82162;
                    i10 = 15;
                    if (C1028.m56247() >= 0) {
                        iM55680 = (C0873.m55680("ۧۤ") ^ i3) * (-65);
                        i = ((iM55680 ^ i4) * 32423) ^ (-43222108);
                        i2 = -1567144478;
                    } else {
                        iM55680 = (C0873.m55680("ۚۧ") ^ i3) * 15;
                        i = ((iM55680 ^ i4) * 22297) ^ (-33093854);
                        i2 = 411827056;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1518622317:
                case -1282343292:
                    sArr = f82162;
                    if (C0967.f81910 >= 0) {
                        iM55680 = (i4 - C0946.m55979("۟ۚ")) * (-73);
                        i = ((iM55680 ^ i3) * (-16731)) ^ (-822840113);
                        i2 = 352348662;
                    } else {
                        iM55680 = (C0873.m55680("᩻᩷") + i4) * (-85);
                        i = ((iM55680 ^ i3) * (-8425)) ^ (-2134970721);
                        i2 = 1901459035;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1451747936:
                case 1225388506:
                    C1025.m56218(abstractActivityC5549, strM55689);
                    if (m31086().m46169()) {
                        iM55680 = (i4 - C0873.m55680("۫ܶ")) * (-73);
                        i = ((iM55680 ^ i3) * (-26397)) ^ 1543973081;
                        i2 = -653967613;
                    } else {
                        iM55680 = C0946.m55979("᩹֨") ^ i4;
                        i = ((iM55680 ^ i3) * (-12593)) ^ 1443856009;
                        i2 = 1066276569;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1292555777:
                case 876512856:
                    c8321 = new C8321(abstractActivityC5549, c20531);
                    abstractActivityC5549.m12262(c8321);
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0873.m55680("ۧۤ") ^ i3) * (-65);
                        i = ((iM55680 ^ i4) * 32423) ^ (-43222108);
                        i2 = -1567144478;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM55681 = (i3 - C0873.m55680("ۘᩴ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55681 ^ i4) * (-27253)) ^ 163920333;
                        i6 = iM55681 ^ (-539074170);
                    }
                    break;
                case -1148573171:
                case 2037584546:
                    s = sArr[c];
                    i7 = s * s;
                    if (C1028.f81950 <= 0) {
                        iM55680 = (i4 - C0946.m55979("۟ۚ")) * (-73);
                        i = ((iM55680 ^ i3) * (-16731)) ^ (-822840113);
                        i2 = 352348662;
                    } else {
                        iM55680 = (C0873.m55680("ۨܺ") + i4) * 91;
                        i = ((iM55680 ^ i3) * (-13113)) ^ 1719310137;
                        i2 = -1560334163;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1140502668:
                case -533006251:
                    RunnableC1014.m56177();
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0873.m55680("ۘۧ") ^ i4) * 119;
                        i = ((iM55680 ^ i3) * (-26071)) ^ 1384637878;
                        i2 = 1053221523;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ᩳܺ")) * (-35);
                        i = ((iM55680 ^ i4) * 6975) ^ 1940109590;
                        i2 = 33989160;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -998806089:
                case -353431311:
                    if (C0947.m55997()) {
                        iM55680 = C0946.m55979("ᩳܽ") ^ i3;
                        i = ((iM55680 ^ i4) * (-2817)) ^ (-1930001702);
                        i2 = -1970290068;
                    } else {
                        iM55680 = (C0873.m55680("ۘۧ") ^ i4) * 119;
                        i = ((iM55680 ^ i3) * (-26071)) ^ 1384637878;
                        i2 = 1053221523;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -978296285:
                case 700550357:
                    C0947.m55997();
                    break;
                case -883282738:
                case 499611334:
                    i9 = 10633;
                    iM55680 = (C0873.m55680("ᩳۧ") ^ i4) * (-51);
                    i = ((iM55680 ^ i3) * 16525) ^ (-721747510);
                    i2 = 1955430711;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -753702054:
                case 147902205:
                    i9 = 1642;
                    iM55680 = (C0873.m55680("ᩳۧ") ^ i4) * (-51);
                    i = ((iM55680 ^ i3) * 16525) ^ (-721747510);
                    i2 = 1955430711;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -732709087:
                case 19411218:
                    C1229.m56410();
                    if (C0947.f81895) {
                        iM55680 = (C0873.m55680("ۧۤ") ^ i3) * (-65);
                        i = ((iM55680 ^ i4) * 32423) ^ (-43222108);
                        i2 = -1567144478;
                    } else {
                        iM55680 = (C0873.m55680("ۘۧ") ^ i4) * 119;
                        i = ((iM55680 ^ i3) * (-26071)) ^ 1384637878;
                        i2 = 1053221523;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -720178200:
                case 1406469966:
                    m31086().m46168(abstractActivityC5549, c8321);
                    break;
                case -670822122:
                case -351819564:
                    i8 = i7 + 4656964;
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0873.m55680("ۧۤ") ^ i3) * (-65);
                        i = ((iM55680 ^ i4) * 32423) ^ (-43222108);
                        i2 = -1567144478;
                    } else {
                        iM55680 = C0946.m55979("ۤ֡") ^ i4;
                        i = ((iM55680 ^ i3) * (-3763)) ^ (-1956046545);
                        i2 = 217652730;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -129413418:
                case 2002332876:
                    c = 14;
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ᩳܽ") ^ i3;
                        i = ((iM55680 ^ i4) * (-2817)) ^ (-1930001702);
                        i2 = -1970290068;
                    } else {
                        iM55680 = C0873.m55680("۫ۘ") ^ i3;
                        i = ((iM55680 ^ i4) * (-2875)) ^ 879386271;
                        i2 = -220788805;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -35027975:
                case 1468072097:
                    ViewOnClickListenerC0939.m55941();
                    C0949.m56012();
                    iM55680 = (C0873.m55680("ۧۤ") ^ i3) * (-65);
                    i = ((iM55680 ^ i4) * 32423) ^ (-43222108);
                    i2 = -1567144478;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 152326618:
                case 1879086545:
                    m31086().m46170();
                    iM55680 = C0946.m55979("᩹֨") ^ i4;
                    i = ((iM55680 ^ i3) * (-12593)) ^ 1443856009;
                    i2 = 1066276569;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 361182667:
                case 907470087:
                    i11 = 8;
                    if (C0882.f81846) {
                        iM55680 = (C0873.m55680("ۘۧ") ^ i4) * 119;
                        i = ((iM55680 ^ i3) * (-26071)) ^ 1384637878;
                        i2 = 1053221523;
                    } else {
                        iM55680 = (C0946.m55979("ۨܽ") ^ i3) * 75;
                        i = ((iM55680 ^ i4) * 4175) ^ 57742920;
                        i2 = 313263054;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM55689 = C0873.m55689(sArr2, i10, i11, i9);
                    if (C1071.m56343() != 0) {
                        iM55680 = (i3 - C0946.m55979("ᩳܺ")) * (-35);
                        i = ((iM55680 ^ i4) * 6975) ^ 1940109590;
                        i2 = 33989160;
                    } else {
                        iM55680 = (C0873.m55680("۟ᩴ") ^ i4) * 15;
                        i = ((iM55680 ^ i3) * (-16249)) ^ 619680746;
                        i2 = 52184702;
                    }
                    i6 = iM55680 ^ i2;
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
    
        if (p067l.C0906.f81862 >= 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m31089(final C23351 c23351, final ViewOnClickListenerC7928 viewOnClickListenerC7928) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        SendAuth.Req req;
        InterfaceC18744 interfaceC18744;
        int iM55979;
        int i5;
        int i6;
        int i7 = RunnableC0871.f81839;
        int i8 = C1028.f81950;
        int iM55682 = C0873.m55680("ۢ᩶") ^ i7;
        int i9 = ((iM55682 ^ i8) * 25637) ^ 1238215695;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i10 = iM55682 ^ 1571470144;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -2146953129;
        String strM55863 = null;
        Object value = null;
        InterfaceC18744 interfaceC18745 = null;
        SendAuth.Req req2 = null;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i8) * 29085) >> 31));
            switch (i15) {
                case -2074952020:
                case -1749342102:
                    interfaceC18745 = interfaceC18745;
                    sArr3 = f82162;
                    i13 = 39;
                    i14 = 15;
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0946.m55979("ۚۢ") + i8) * 89;
                        i = ((iM55680 ^ i7) * 20559) ^ 1592031793;
                        i2 = -2118641657;
                    } else {
                        iM55680 = (C0946.m55979("֨۫") + i7) * (-29);
                        i = ((iM55680 ^ i8) * 21427) ^ (-55534458);
                        i2 = 1555634289;
                    }
                    InterfaceC18744 interfaceC18746 = interfaceC18745;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    interfaceC18745 = interfaceC18746;
                    break;
                case -2073365105:
                case 832862776:
                    if (C0937.f81884) {
                        req = req2;
                        interfaceC18744 = interfaceC18745;
                        iM55979 = C0873.m55680("ۜۡ") ^ i7;
                        i5 = ((iM55979 ^ i8) * 1657) ^ (-1591190359);
                        i6 = -1936612545;
                        int i16 = iM55979 ^ i6;
                        interfaceC18745 = interfaceC18744;
                        i10 = i16;
                        i9 = i5;
                        req2 = req;
                    }
                    int iM559710 = (C0946.m55979("ۛܳ") ^ i8) * 49;
                    req = req2;
                    i5 = ((iM559710 ^ i7) * (-3885)) ^ 1791581398;
                    i10 = iM559710 ^ 236428881;
                    i9 = i5;
                    req2 = req;
                    break;
                case -2011006519:
                case 1002171447:
                    interfaceC18744 = interfaceC18745;
                    s = sArr[c];
                    s2 = 23998;
                    if (C1046.f81962 > 0) {
                        req = req2;
                        iM55979 = (C0873.m55680("ۨ᩺") + i7) * 9;
                        i5 = ((iM55979 ^ i8) * 15843) ^ 1357585086;
                        i6 = -743477786;
                        int i17 = iM55979 ^ i6;
                        interfaceC18745 = interfaceC18744;
                        i10 = i17;
                        i9 = i5;
                        req2 = req;
                    } else {
                        interfaceC18745 = interfaceC18744;
                        int iM559711 = (C0946.m55979("ۛܳ") ^ i8) * 49;
                        req = req2;
                        i5 = ((iM559711 ^ i7) * (-3885)) ^ 1791581398;
                        i10 = iM559711 ^ 236428881;
                        i9 = i5;
                        req2 = req;
                    }
                    break;
                case -1582126436:
                case 672167820:
                    C1012.m56134();
                    C0873.m55678();
                    req = req2;
                    interfaceC18744 = interfaceC18745;
                    iM55979 = C0946.m55979("ܿ᩷") ^ i7;
                    i5 = ((iM55979 ^ i8) * (-19241)) ^ 315431956;
                    i6 = 728193178;
                    int i18 = iM55979 ^ i6;
                    interfaceC18745 = interfaceC18744;
                    i10 = i18;
                    i9 = i5;
                    req2 = req;
                    break;
                case -1377269584:
                case -373304668:
                    i11 = 40612;
                    iM55680 = (C0873.m55680("᩺ܿ") + i8) * (-85);
                    i = ((iM55680 ^ i7) * 4605) ^ 848184759;
                    i2 = -1787983061;
                    InterfaceC18744 interfaceC18747 = interfaceC18745;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    interfaceC18745 = interfaceC18747;
                    break;
                case -1342400895:
                case -704010513:
                    req = req2;
                    interfaceC18744 = interfaceC18745;
                    c = 23;
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("ۜۡ") ^ i7;
                        i5 = ((iM55979 ^ i8) * 1657) ^ (-1591190359);
                        i6 = -1936612545;
                    } else {
                        iM55979 = (C0873.m55680("ۜۘ") ^ i8) * (-87);
                        i5 = ((iM55979 ^ i7) * 25071) ^ 1473478028;
                        i6 = -2077446456;
                    }
                    int i19 = iM55979 ^ i6;
                    interfaceC18745 = interfaceC18744;
                    i10 = i19;
                    i9 = i5;
                    req2 = req;
                    break;
                case -1298375635:
                case -1217101593:
                    C1036.m56257();
                    C0917.m55854();
                    break;
                case -1169481809:
                case -253360235:
                    interfaceC18745 = interfaceC18745;
                    if ((s * s2) - ((s * s) + 143976001) <= 0) {
                        iM55680 = (C0946.m55979("᩻᩶") + i8) * 9;
                        i = ((iM55680 ^ i7) * 5007) ^ (-213633131);
                        i2 = 808047344;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ۢ۠")) * (-45);
                        i = ((iM55680 ^ i8) * 4125) ^ (-1213911618);
                        i2 = -1772189497;
                    }
                    InterfaceC18744 interfaceC18748 = interfaceC18745;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    interfaceC18745 = interfaceC18748;
                    break;
                case -1001280709:
                case -955743774:
                    req = req2;
                    interfaceC18744 = interfaceC18745;
                    sArr = f82162;
                    if (C1017.m56187() <= 0) {
                        iM55979 = C0946.m55979("ܿ᩷") ^ i7;
                        i5 = ((iM55979 ^ i8) * (-19241)) ^ 315431956;
                        i6 = 728193178;
                    } else {
                        iM55979 = (C0946.m55979("ۚܺ") ^ i7) * 99;
                        i5 = ((iM55979 ^ i8) * 13765) ^ 2096362406;
                        i6 = 602040140;
                    }
                    int i110 = iM55979 ^ i6;
                    interfaceC18745 = interfaceC18744;
                    i10 = i110;
                    i9 = i5;
                    req2 = req;
                    break;
                case -779051925:
                case 359302933:
                    break;
                case -562872236:
                case 1284917360:
                    strM55863 = C0927.m55863(sArr4, 54, 13, i11);
                    if (C0930.f81879 > 0) {
                        iM55681 = C0946.m55979("᩷ᩴ") ^ i8;
                        i3 = ((iM55681 ^ i7) * (-26657)) ^ (-677671453);
                        i4 = 153312117;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                    } else {
                        req = req2;
                        interfaceC18744 = interfaceC18745;
                        iM55979 = C0946.m55979("ܿ᩷") ^ i7;
                        i5 = ((iM55979 ^ i8) * (-19241)) ^ 315431956;
                        i6 = 728193178;
                        int i111 = iM55979 ^ i6;
                        interfaceC18745 = interfaceC18744;
                        i10 = i111;
                        i9 = i5;
                        req2 = req;
                    }
                    break;
                case -519017898:
                case 1849118546:
                    interfaceC18745 = interfaceC18745;
                    req2.scope = C1024.m56203(sArr2, i12, 15, i11);
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0946.m55979("۫۠") ^ i7;
                        i = ((iM55680 ^ i8) * (-20831)) ^ (-613924664);
                        i2 = 496097141;
                    } else {
                        iM55680 = C0946.m55979("ۢᩴ") ^ i7;
                        i = ((iM55680 ^ i8) * 2385) ^ (-49088802);
                        i2 = 497659601;
                    }
                    InterfaceC18744 interfaceC18749 = interfaceC18745;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    interfaceC18745 = interfaceC18749;
                    break;
                case -144987353:
                case 1878613325:
                    C0947.m55988(value, strM55863);
                    ((IWXAPI) value).sendReq(req2);
                    break;
                case -21039857:
                case 896981319:
                    value = interfaceC18745.getValue();
                    sArr4 = f82162;
                    if (C0890.f81849 == 0) {
                        iM55681 = (C0873.m55680("ۗ᩶") ^ i7) * 95;
                        i3 = ((iM55681 ^ i8) * (-7873)) ^ (-2095473329);
                        i4 = 1757271104;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                    } else {
                        interfaceC18745 = interfaceC18745;
                        iM55680 = C0946.m55979("۫۠") ^ i7;
                        i = ((iM55680 ^ i8) * (-20831)) ^ (-613924664);
                        i2 = 496097141;
                        InterfaceC18744 interfaceC187410 = interfaceC18745;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                        interfaceC18745 = interfaceC187410;
                    }
                    break;
                case 160005263:
                case 1303008613:
                    interfaceC18745 = interfaceC18745;
                    req2 = new SendAuth.Req();
                    sArr2 = f82162;
                    i12 = 24;
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0946.m55979("۫۠") ^ i7;
                        i = ((iM55680 ^ i8) * (-20831)) ^ (-613924664);
                        i2 = 496097141;
                    } else {
                        iM55680 = (C0873.m55680("֫ܿ") ^ i8) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-21639)) ^ (-1171895620);
                        i2 = -2136649087;
                    }
                    InterfaceC18744 interfaceC187411 = interfaceC18745;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    interfaceC18745 = interfaceC187411;
                    break;
                case 528887350:
                case 1045490367:
                    ActivityC17798.m40409(new InterfaceC11094() { // from class: l.֡᩵ۡ

                        /* JADX INFO: renamed from: ۘۖܺ, reason: not valid java name and contains not printable characters */
                        private static final short[] f81840 = {5337, 20866, 20885, 20867, 20864, 20885, 20866, 20866, 20899, 20868, 20866};

                        {
                            int i20 = -657138090;
                            int i21 = C1053.f81965;
                            int i22 = RunnableC1014.f81941;
                            int iM55683 = C0873.m55680("᩺ۖ") ^ i22;
                            int i23 = ((iM55683 ^ i21) * (-18647)) ^ 1777241290;
                            int i24 = 976665233;
                            while (true) {
                                i20 = ((((i20 ^ i21) * (-11181)) >> 31) & i23) ^ (iM55683 ^ i24);
                                switch (i20) {
                                    case -2116420266:
                                    case 1646360528:
                                        C0967.m56074();
                                        if (C0967.f81910 >= 0) {
                                            iM55683 = (i21 - C0873.m55680("۬ۛ")) * (-107);
                                            i23 = ((iM55683 ^ i22) * (-3101)) ^ (-974163572);
                                            i24 = -2029870535;
                                        } else {
                                            iM55683 = (i22 - C0873.m55680("֨ۧ")) * (-101);
                                            i23 = ((iM55683 ^ i21) * 21409) ^ 252926697;
                                            i24 = 141120396;
                                        }
                                        break;
                                    case -2033447655:
                                    case -989602681:
                                        C0917.m55854();
                                        if (C0863.f81833 > 0) {
                                            iM55683 = C0873.m55680("᩷ܿ") ^ i21;
                                            i23 = ((iM55683 ^ i22) * 7811) ^ (-1916968908);
                                            i24 = -931149044;
                                        } else {
                                            iM55683 = C0946.m55979("ۤ᩹") ^ i22;
                                            i23 = ((iM55683 ^ i21) * (-21051)) ^ 260810838;
                                            i24 = -533479186;
                                        }
                                        break;
                                    case -1697252460:
                                    case 1428993560:
                                        C0854.m55595();
                                        iM55683 = (i22 - C0873.m55680("֨ۧ")) * (-101);
                                        i23 = ((iM55683 ^ i21) * 21409) ^ 252926697;
                                        i24 = 141120396;
                                        break;
                                    case -1608334067:
                                    case 1456312854:
                                        C1046.m56302();
                                        C0912.m55833();
                                        throw new RuntimeException();
                                    case -1249604203:
                                    case -493925285:
                                        if (C1017.f81942 >= 0) {
                                            iM55683 = C0873.m55680("᩷ܿ") ^ i21;
                                            i23 = ((iM55683 ^ i22) * 7811) ^ (-1916968908);
                                            i24 = -931149044;
                                        } else {
                                            iM55683 = (i21 - C0946.m55979("۫۬")) * 5;
                                            i23 = ((iM55683 ^ i22) * 3711) ^ 1412337340;
                                            i24 = 752057800;
                                        }
                                        break;
                                    case -1211513882:
                                    case -271994388:
                                        return;
                                    case -1124483592:
                                    case 1917395512:
                                        if (C0882.f81846) {
                                            iM55683 = C0873.m55680("᩷ܿ") ^ i21;
                                            i23 = ((iM55683 ^ i22) * 7811) ^ (-1916968908);
                                            i24 = -931149044;
                                        } else {
                                            iM55683 = C0873.m55680("ܺ᩵") ^ i22;
                                            i23 = ((iM55683 ^ i21) * (-25989)) ^ 178259338;
                                            i24 = -1578001230;
                                        }
                                        break;
                                    case -1071928476:
                                    case 1419517668:
                                        if (C1003.m56123() != 0) {
                                            iM55683 = C0946.m55979("᩷᩷") ^ i21;
                                            i23 = ((iM55683 ^ i22) * (-23471)) ^ (-1762571157);
                                            i24 = -1298961711;
                                        } else {
                                            iM55683 = C0873.m55680("᩺ܳ") ^ i21;
                                            i23 = ((iM55683 ^ i22) * 25149) ^ 1407437446;
                                            i24 = -2087268041;
                                        }
                                        break;
                                    case -671401199:
                                    case -168274131:
                                        if (C0892.f81851) {
                                            iM55683 = (C0873.m55680("ᩴۛ") ^ i22) * (-75);
                                            i23 = ((iM55683 ^ i21) * 25937) ^ 1690790276;
                                            i24 = 2045208005;
                                        } else {
                                            iM55683 = C0946.m55979("ۤ᩹") ^ i22;
                                            i23 = ((iM55683 ^ i21) * (-21051)) ^ 260810838;
                                            i24 = -533479186;
                                        }
                                        break;
                                    case -301286875:
                                    case 689637163:
                                        if (C1048.f81963) {
                                            iM55683 = C0873.m55680("᩸ᩴ") ^ i22;
                                            i23 = ((iM55683 ^ i21) * (-12687)) ^ (-1756101975);
                                            i24 = 329294185;
                                        } else {
                                            iM55683 = (i22 - C0873.m55680("֨ۧ")) * (-101);
                                            i23 = ((iM55683 ^ i21) * 21409) ^ 252926697;
                                            i24 = 141120396;
                                        }
                                        break;
                                    case -273458581:
                                    case 1541360800:
                                        if (C1053.f81965 <= 0) {
                                            iM55683 = (i21 - C0873.m55680("۬ۛ")) * (-107);
                                            i23 = ((iM55683 ^ i22) * (-3101)) ^ (-974163572);
                                            i24 = -2029870535;
                                        } else {
                                            iM55683 = (C0946.m55979("᩶֫") + i21) * 25;
                                            i23 = ((iM55683 ^ i22) * 13025) ^ 105736900;
                                            i24 = 1612997485;
                                        }
                                        break;
                                    case -191582839:
                                    case 697559191:
                                        if (C1229.f82066 >= 0) {
                                            iM55683 = (i22 - C0873.m55680("֨ۧ")) * (-101);
                                            i23 = ((iM55683 ^ i21) * 21409) ^ 252926697;
                                            i24 = 141120396;
                                        } else {
                                            iM55683 = C0873.m55680("ۙۢ") ^ i21;
                                            i23 = ((iM55683 ^ i22) * (-27043)) ^ (-69457742);
                                            i24 = -2116517996;
                                        }
                                        break;
                                    case -151282308:
                                    case 664787328:
                                        if (C0863.f81833 <= 0) {
                                            iM55683 = C0873.m55680("᩷ܿ") ^ i21;
                                            i23 = ((iM55683 ^ i22) * 7811) ^ (-1916968908);
                                            i24 = -931149044;
                                        } else {
                                            iM55683 = (C0946.m55979("ۧܿ") ^ i22) * (-113);
                                            i23 = ((iM55683 ^ i21) * (-21505)) ^ 1438142673;
                                            i24 = 844560662;
                                        }
                                        break;
                                    case -64956020:
                                    case 1571144639:
                                        ViewOnClickListenerC0939.m55941();
                                        if (!C0861.f81831) {
                                            iM55683 = C0946.m55979("ۤ᩹") ^ i22;
                                            i23 = ((iM55683 ^ i21) * (-21051)) ^ 260810838;
                                            i24 = -533479186;
                                        } else {
                                            iM55683 = (i21 - C0873.m55680("۬ۛ")) * (-107);
                                            i23 = ((iM55683 ^ i22) * (-3101)) ^ (-974163572);
                                            i24 = -2029870535;
                                        }
                                        break;
                                    case 259629719:
                                    case 1424517567:
                                        if (C1036.m56257() <= 0) {
                                            iM55683 = (i21 - C0873.m55680("۬ۛ")) * (-107);
                                            i23 = ((iM55683 ^ i22) * (-3101)) ^ (-974163572);
                                            i24 = -2029870535;
                                        } else {
                                            iM55683 = C0946.m55979("ܿ᩵") ^ i21;
                                            i23 = ((iM55683 ^ i22) * 4865) ^ 191515759;
                                            i24 = -1029222590;
                                        }
                                        break;
                                    default:
                                        if (C0873.m55678()) {
                                            iM55683 = C0873.m55680("᩷ܿ") ^ i21;
                                            i23 = ((iM55683 ^ i22) * 7811) ^ (-1916968908);
                                            i24 = -931149044;
                                        } else {
                                            iM55683 = C0946.m55979("ۜܰ") ^ i22;
                                            i23 = ((iM55683 ^ i21) * (-6543)) ^ 143815657;
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
                        
                            if (p067l.C1028.m56247() < 0) goto L8;
                         */
                        @Override // p067l.InterfaceC11094
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onResp(BaseResp baseResp) {
                            int iM55683;
                            int i20;
                            int i21;
                            int iM55684;
                            int i22;
                            int i23;
                            int i24;
                            int i25 = C1964.f83032;
                            int i26 = RunnableC0871.f81839;
                            int iM55685 = C0873.m55680("ܿܶ") ^ i26;
                            int i27 = ((iM55685 ^ i25) * 30957) ^ (-432576158);
                            C23351 c23352 = null;
                            short[] sArr5 = null;
                            short[] sArr6 = null;
                            int i28 = iM55685 ^ 919305409;
                            String strM56016 = null;
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
                                            iM55683 = (C0873.m55680("۫᩶") + i25) * (-127);
                                            i20 = ((iM55683 ^ i26) * (-11403)) ^ (-1791277935);
                                            i21 = -614418076;
                                        } else {
                                            iM55683 = (C0873.m55680("ۡۤ") + i25) * 95;
                                            i20 = ((iM55683 ^ i26) * (-4841)) ^ 1953034166;
                                            i21 = 30789969;
                                        }
                                        i24 = iM55683 ^ i21;
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
                                        if (C0912.f81867 <= 0) {
                                            iM55683 = (C0873.m55680("ܶ᩷") + i26) * (-83);
                                            i20 = ((iM55683 ^ i25) * (-21113)) ^ (-2072347740);
                                            i21 = 118592379;
                                        } else {
                                            iM55683 = C0873.m55680("ܶᩳ") ^ i25;
                                            i20 = ((iM55683 ^ i26) * (-23169)) ^ 683493764;
                                            i21 = 1627588133;
                                        }
                                        i24 = iM55683 ^ i21;
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
                                        iM55683 = C0873.m55680("ۡܺ") ^ i26;
                                        i20 = ((iM55683 ^ i25) * (-21083)) ^ 1732750586;
                                        i21 = 1078100906;
                                        i24 = iM55683 ^ i21;
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
                                            iM55683 = C0946.m55979("᩵ۘ") ^ i25;
                                            i20 = ((iM55683 ^ i26) * 27343) ^ (-994992735);
                                            i21 = 1536839274;
                                        } else {
                                            iM55683 = (i26 - C0873.m55680("᩻ܰ")) * (-3);
                                            i20 = ((iM55683 ^ i25) * 14059) ^ (-1674514191);
                                            i21 = 544850430;
                                        }
                                        i24 = iM55683 ^ i21;
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
                                        if (C1048.f81963) {
                                            iM55683 = C0946.m55979("۫ۢ") ^ i26;
                                            i20 = ((iM55683 ^ i25) * (-16511)) ^ 1048281357;
                                            i21 = 1467170439;
                                        } else {
                                            iM55683 = (C0873.m55680("ܶ᩷") + i26) * (-83);
                                            i20 = ((iM55683 ^ i25) * (-21113)) ^ (-2072347740);
                                            i21 = 118592379;
                                        }
                                        i24 = iM55683 ^ i21;
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
                                        strM56016 = C0949.m56016(sArr5, i33, i29, i32);
                                        if (!AbstractC0942.m55971()) {
                                            iM55683 = (C0946.m55979("᩵᩸") + i25) * 99;
                                            i20 = ((iM55683 ^ i26) * (-16429)) ^ (-2014807776);
                                            i21 = -643485591;
                                            i24 = iM55683 ^ i21;
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
                                            iM55684 = (i25 - C0873.m55680("᩷ۢ")) * 109;
                                            i22 = ((iM55684 ^ i26) * 8779) ^ 837791023;
                                            i23 = -2003925450;
                                            i28 = iM55684 ^ i23;
                                            i27 = i22;
                                        }
                                        break;
                                    case -1460577636:
                                    case 28713659:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        C1025.m56218(baseResp, strM56016);
                                        c23352 = c23351;
                                        if (c23352.f74446.m33960()) {
                                            iM55683 = C0873.m55680("ۢ᩺") ^ i26;
                                            i20 = ((iM55683 ^ i25) * 30329) ^ (-1362702631);
                                            i21 = -1002094337;
                                        } else {
                                            iM55683 = C0873.m55680("ܳܰ") ^ i26;
                                            i20 = ((iM55683 ^ i25) * (-2921)) ^ (-1043714394);
                                            i21 = 411041279;
                                        }
                                        i24 = iM55683 ^ i21;
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
                                        sArr5 = f81840;
                                        i33 = 1;
                                        i29 = 4;
                                        if (AbstractC0942.f81890 > 0) {
                                            iM55683 = (C0873.m55680("᩸۟") ^ i25) * 31;
                                            i20 = ((iM55683 ^ i26) * (-26349)) ^ 64607888;
                                            i21 = 625405648;
                                            i24 = iM55683 ^ i21;
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
                                            iM55684 = (i25 - C0873.m55680("᩷ۢ")) * 109;
                                            i22 = ((iM55684 ^ i26) * 8779) ^ 837791023;
                                            i23 = -2003925450;
                                            i28 = iM55684 ^ i23;
                                            i27 = i22;
                                        }
                                        break;
                                    case -1423656341:
                                    case -893048823:
                                        if (C1036.f81953 < 0) {
                                            iM55684 = (i26 - C0946.m55979("ܽܽ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i22 = ((iM55684 ^ i25) * 7329) ^ (-2094541988);
                                            i23 = 151829439;
                                            i28 = iM55684 ^ i23;
                                            i27 = i22;
                                        } else {
                                            str = str;
                                            int iM559712 = (C0946.m55979("۟᩹") ^ i25) * 51;
                                            i20 = ((iM559712 ^ i26) * 6457) ^ (-370199033);
                                            i24 = iM559712 ^ (-474675036);
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
                                        if (C0892.f81851) {
                                            iM55683 = (C0873.m55680("۬ܰ") + i25) * (-55);
                                            i20 = ((iM55683 ^ i26) * 30115) ^ (-833116509);
                                            i21 = 1094796280;
                                        } else {
                                            iM55683 = (i25 - C0946.m55979("۠ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i20 = ((iM55683 ^ i26) * 26751) ^ (-465557861);
                                            i21 = -754536159;
                                        }
                                        i24 = iM55683 ^ i21;
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
                                        sArr7 = f81840;
                                        if (C0863.f81833 <= 0) {
                                            iM55683 = (C0873.m55680("ܶ᩷") + i26) * (-83);
                                            i20 = ((iM55683 ^ i25) * (-21113)) ^ (-2072347740);
                                            i21 = 118592379;
                                        } else {
                                            iM55683 = C0873.m55680("ۜᩴ") ^ i26;
                                            i20 = ((iM55683 ^ i25) * (-14653)) ^ 978363658;
                                            i21 = 291610985;
                                        }
                                        i24 = iM55683 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str12 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str12;
                                        break;
                                    case -1094342337:
                                    case -1042898951:
                                        C0947.m55988(str, C1024.m56203(sArr6, i30, i31, i32));
                                        c23352.m52008(str, false);
                                        break;
                                    case -1033927506:
                                    case 1402826042:
                                        i32 = 20976;
                                        iM55683 = C0873.m55680("ۡܺ") ^ i26;
                                        i20 = ((iM55683 ^ i25) * (-21083)) ^ 1732750586;
                                        i21 = 1078100906;
                                        i24 = iM55683 ^ i21;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        String str13 = str;
                                        i28 = i24;
                                        i27 = i20;
                                        str = str13;
                                        break;
                                    case -849330242:
                                    case -29036949:
                                        C1036.m56253(c23352.f74446);
                                        break;
                                    case -829940609:
                                    case 1712114665:
                                        str = str;
                                        sArr6 = sArr6;
                                        i30 = i30;
                                        if ((s5 * s3) - i34 <= 0) {
                                            iM55683 = C0946.m55979("᩹ᩳ") ^ i26;
                                            i20 = ((iM55683 ^ i25) * (-23771)) ^ 1594291706;
                                            i21 = -899293809;
                                        } else {
                                            iM55683 = C0873.m55680("ܰᩳ") ^ i25;
                                            i20 = ((iM55683 ^ i26) * 21427) ^ (-1909536250);
                                            i21 = 1058088747;
                                        }
                                        i24 = iM55683 ^ i21;
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
                                        if (C1071.f81975 > 0) {
                                            C3627 c3627 = new C3627(c23352);
                                            str = str;
                                            if (ServiceConnectionC1013.f81940 < 0) {
                                                sArr6 = sArr6;
                                                i30 = i30;
                                                RunnableC9821 runnableC9821 = new RunnableC9821(str15, viewOnClickListenerC7928, c3627);
                                                if (C1071.f81975 > 0) {
                                                    C0892.m55747(new Thread(runnableC9821));
                                                }
                                                iM55683 = (i25 - C0946.m55979("۠ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i20 = ((iM55683 ^ i26) * 26751) ^ (-465557861);
                                                i21 = -754536159;
                                                i24 = iM55683 ^ i21;
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
                                        int iM559713 = (C0946.m55979("۟᩹") ^ i25) * 51;
                                        i20 = ((iM559713 ^ i26) * 6457) ^ (-370199033);
                                        i24 = iM559713 ^ (-474675036);
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
                                        RunnableC0871.m55672();
                                        if (C1229.m56410() == 0) {
                                            iM55684 = (i25 - C0873.m55680("᩷ۢ")) * 109;
                                            i22 = ((iM55684 ^ i26) * 8779) ^ 837791023;
                                            i23 = -2003925450;
                                            i28 = iM55684 ^ i23;
                                            i27 = i22;
                                        } else {
                                            str = str;
                                            sArr6 = sArr6;
                                            i30 = i30;
                                            iM55683 = (C0873.m55680("ܶ᩷") + i26) * (-83);
                                            i20 = ((iM55683 ^ i25) * (-21113)) ^ (-2072347740);
                                            i21 = 118592379;
                                            i24 = iM55683 ^ i21;
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
                                        sArr6 = f81840;
                                        i30 = 5;
                                        i31 = 6;
                                        if (C0930.f81879 <= 0) {
                                            iM55684 = (i25 - C0873.m55680("᩷ۢ")) * 109;
                                            i22 = ((iM55684 ^ i26) * 8779) ^ 837791023;
                                            i23 = -2003925450;
                                        } else {
                                            iM55684 = (i26 - C0873.m55680("֫ᩳ")) * (-59);
                                            i22 = ((iM55684 ^ i25) * (-13671)) ^ (-816012858);
                                            i23 = 1038024924;
                                        }
                                        i28 = iM55684 ^ i23;
                                        i27 = i22;
                                        break;
                                    case 290234092:
                                    case 1607631327:
                                        C0873.m55678();
                                        C0992.m56107();
                                        break;
                                    default:
                                        C1003.m56123();
                                        ViewOnClickListenerC0939.m55941();
                                        str = str;
                                        int iM559714 = (C0946.m55979("۟᩹") ^ i25) * 51;
                                        i20 = ((iM559714 ^ i26) * 6457) ^ (-370199033);
                                        i24 = iM559714 ^ (-474675036);
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
                    InterfaceC18744 interfaceC187412 = f38600;
                    if (C0854.f81826 != 0) {
                        interfaceC18745 = interfaceC187412;
                        int iM559712 = (C0946.m55979("ۛܳ") ^ i8) * 49;
                        req = req2;
                        i5 = ((iM559712 ^ i7) * (-3885)) ^ 1791581398;
                        i10 = iM559712 ^ 236428881;
                        i9 = i5;
                        req2 = req;
                    } else {
                        int iM559713 = (C0946.m55979("᩻ܶ") ^ i8) * (-79);
                        i9 = ((iM559713 ^ i7) * 24635) ^ 402277635;
                        i10 = iM559713 ^ (-1138028399);
                        interfaceC18745 = interfaceC187412;
                    }
                    break;
                case 1080986530:
                case 2035123845:
                    C0992.m56107();
                    if (!C0947.f81895) {
                        req = req2;
                        interfaceC18744 = interfaceC18745;
                        iM55979 = C0946.m55979("ܿ᩷") ^ i7;
                        i5 = ((iM55979 ^ i8) * (-19241)) ^ 315431956;
                        i6 = 728193178;
                        int i112 = iM55979 ^ i6;
                        interfaceC18745 = interfaceC18744;
                        i10 = i112;
                        i9 = i5;
                        req2 = req;
                    } else {
                        interfaceC18745 = interfaceC18745;
                        iM55680 = C0946.m55979("۫۠") ^ i7;
                        i = ((iM55680 ^ i8) * (-20831)) ^ (-613924664);
                        i2 = 496097141;
                        InterfaceC18744 interfaceC187413 = interfaceC18745;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                        interfaceC18745 = interfaceC187413;
                    }
                    break;
                case 1851920180:
                case 2021936612:
                    i11 = 22369;
                    iM55680 = (C0873.m55680("᩺ܿ") + i8) * (-85);
                    i = ((iM55680 ^ i7) * 4605) ^ 848184759;
                    i2 = -1787983061;
                    InterfaceC18744 interfaceC187414 = interfaceC18745;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    interfaceC18745 = interfaceC187414;
                    break;
                default:
                    req2.state = C0947.m55993(sArr3, i13, i14, i11);
                    if (C1053.f81965 <= 0) {
                        interfaceC18745 = interfaceC18745;
                        iM55680 = (C0946.m55979("ۚۢ") + i8) * 89;
                        i = ((iM55680 ^ i7) * 20559) ^ 1592031793;
                        i2 = -2118641657;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ᩴܺ")) * (-43);
                        interfaceC18745 = interfaceC18745;
                        i = ((iM55680 ^ i7) * 16007) ^ 72018869;
                        i2 = -1517447043;
                    }
                    InterfaceC18744 interfaceC187415 = interfaceC18745;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    interfaceC18745 = interfaceC187415;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31088(C22681 c22681, ViewOnClickListenerC7928 viewOnClickListenerC7928) {
        C14356 c14356 = null;
        int i = -1539522466;
        int i2 = C0989.f81920;
        int i3 = C0863.f81833;
        int iM55979 = (C0946.m55979("۫᩶") ^ i2) * 95;
        int i4 = ((iM55979 ^ i3) * 2399) ^ 1619146335;
        int i5 = -1492188228;
        while (true) {
            i = ((((i ^ i3) * (-27881)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2041962417:
                case -375342617:
                    RunnableC0897.m55784();
                    iM55979 = C0946.m55979("ܶۡ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 25139) ^ (-657653849);
                    i5 = -466739551;
                    break;
                case -1984422479:
                case -1482525278:
                    if (!C1048.f81963) {
                        iM55979 = C0873.m55680("ۨᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    } else {
                        iM55979 = C0946.m55979("ܶۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25139) ^ (-657653849);
                        i5 = -466739551;
                    }
                    break;
                case -1972525470:
                case 744416884:
                    RunnableC1014.m56177();
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0873.m55680("۟۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18629) ^ (-1199038479);
                        i5 = -1856797348;
                    } else {
                        iM55979 = C0873.m55680("ۨᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    }
                    break;
                case -1728507783:
                case -1185140560:
                    m31086().m46168(viewOnClickListenerC7928, c14356);
                    break;
                case -1723129977:
                case -1148802196:
                    if (m31086().m46169()) {
                        iM55979 = (C0873.m55680("ۖۧ") + i2) * (-57);
                        i4 = ((iM55979 ^ i3) * (-12089)) ^ 497962648;
                        i5 = 1642788572;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۟ܶ")) * 101;
                        i4 = ((iM55979 ^ i2) * (-28105)) ^ 182527256;
                        i5 = 280968612;
                    }
                    break;
                case -1664367778:
                case 1672838431:
                    if (C0946.m55980() == 0) {
                        iM55979 = (C0946.m55979("۬᩹") + i2) * 15;
                        i4 = ((iM55979 ^ i3) * (-11991)) ^ (-787104973);
                        i5 = 1900415208;
                    } else {
                        iM55979 = C0873.m55680("ۨᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    }
                    break;
                case -1460462396:
                case 6027886:
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("۟۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18629) ^ (-1199038479);
                        i5 = -1856797348;
                    } else {
                        iM55979 = (C0946.m55979("᩹֫") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55979 ^ i2) * (-11763)) ^ (-563936955);
                        i5 = -798579998;
                    }
                    break;
                case -1210531021:
                case 182873348:
                    m31086().m46170();
                    iM55979 = (i3 - C0873.m55680("۟ܶ")) * 101;
                    i4 = ((iM55979 ^ i2) * (-28105)) ^ 182527256;
                    i5 = 280968612;
                    break;
                case -993677290:
                case -89372675:
                    c14356 = new C14356(c22681, viewOnClickListenerC7928);
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("ܶۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25139) ^ (-657653849);
                        i5 = -466739551;
                    } else {
                        iM55979 = (C0946.m55979("֡ۧ") ^ i2) * (-19);
                        i4 = ((iM55979 ^ i3) * (-6039)) ^ (-1122618943);
                        i5 = -239647676;
                    }
                    break;
                case -799816791:
                case 727315042:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0946.m55979("ܶۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25139) ^ (-657653849);
                        i5 = -466739551;
                    } else {
                        iM55979 = C0873.m55680("᩺۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25039) ^ (-1596143323);
                        i5 = -1901122537;
                    }
                    break;
                case -719668469:
                case 2072956210:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ۨᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    } else {
                        iM55979 = C0873.m55680("ۘۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32161)) ^ (-2042447391);
                        i5 = -1340570426;
                    }
                    break;
                case -638884676:
                case 1114617274:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("ۨᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ܶ۬")) * (-25);
                        i4 = ((iM55979 ^ i3) * (-2101)) ^ 700069097;
                        i5 = -1763428544;
                    }
                    break;
                case -485981599:
                case -333254713:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("ܶۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25139) ^ (-657653849);
                        i5 = -466739551;
                    } else {
                        iM55979 = (C0873.m55680("ۚ᩹") + i3) * (-47);
                        i4 = ((iM55979 ^ i2) * (-3849)) ^ (-490750950);
                        i5 = -1125051319;
                    }
                    break;
                case -66426396:
                case 1070003545:
                    viewOnClickListenerC7928.m12262(c14356);
                    if (C0845.f81821 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۢۗ")) * 109;
                        i4 = ((iM55979 ^ i2) * (-7243)) ^ (-1478536634);
                        i5 = 117835650;
                    } else {
                        iM55979 = (C0873.m55680("ۨ֫") ^ i3) * 19;
                        i4 = ((iM55979 ^ i2) * OpenAuthTask.NOT_INSTALLED) ^ 1344135768;
                        i5 = 1612736214;
                    }
                    break;
                case 286007901:
                case 1273201821:
                    C0877.m55696();
                    break;
                case 1352845240:
                case 1976284732:
                    if (C1025.f81947 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۢۗ")) * 109;
                        i4 = ((iM55979 ^ i2) * (-7243)) ^ (-1478536634);
                        i5 = 117835650;
                    } else {
                        iM55979 = C0873.m55680("۟ᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-21063)) ^ (-1977533267);
                        i5 = 419486245;
                    }
                    break;
                case 1595234072:
                case 2070476522:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("ۨᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26705) ^ 1619413138;
                        i5 = -1633578046;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۧ᩸")) * (-17);
                        i4 = ((iM55979 ^ i2) * (-8101)) ^ (-873591525);
                        i5 = -2120490804;
                    }
                    break;
                default:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0946.m55979("۬᩹") + i2) * 15;
                        i4 = ((iM55979 ^ i3) * (-11991)) ^ (-787104973);
                        i5 = 1900415208;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩶᩵")) * 71;
                        i4 = ((iM55979 ^ i3) * (-12535)) ^ (-347278397);
                        i5 = -1532321808;
                    }
                    break;
            }
            return;
        }
    }
}
