package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4368 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۢۘۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f81893 = {9342, -9260, 10344, -14453, -9678, -10689, -5574, 14230, 16024, 15803};

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC9062 f9818;

    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    /* JADX WARN: Code duplicated, block: B:43:0x013f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171 A[PHI: r8
      0x0171: PHI (r8v50 char) = (r8v49 char), (r8v2 char) binds: [B:45:0x015a, B:37:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x039d A[PHI: r2 r10 r11 r15 r16 r17 r22 r23
      0x039d: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:11:0x007e, B:90:0x039b, B:82:0x032f, B:59:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r10v6 java.lang.String) = (r10v5 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String) binds: [B:11:0x007e, B:90:0x039b, B:82:0x032f, B:59:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r11v22 l.۬۬ܿ) = (r11v9 l.۬۬ܿ), (r11v12 l.۬۬ܿ), (r11v16 l.۬۬ܿ), (r11v24 l.۬۬ܿ) binds: [B:11:0x007e, B:90:0x039b, B:82:0x032f, B:59:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:11:0x007e, B:90:0x039b, B:82:0x032f, B:59:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:11:0x007e, B:90:0x039b, B:82:0x032f, B:59:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r17v4 int) = (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:11:0x007e, B:90:0x039b, B:82:0x032f, B:59:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r22v18 char[]) = (r22v5 char[]), (r22v8 char[]), (r22v12 char[]), (r22v20 char[]) binds: [B:11:0x007e, B:90:0x039b, B:82:0x032f, B:59:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r23v18 char) = (r23v5 char), (r23v8 char), (r23v12 char), (r23v19 char) binds: [B:11:0x007e, B:90:0x039b, B:82:0x032f, B:59:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x03d6 A[PHI: r7 r9 r11 r13 r14 r22 r23
      0x03d6: PHI (r7v3 l.ۜ᩸᩷) = (r7v2 l.ۜ᩸᩷), (r7v2 l.ۜ᩸᩷), (r7v2 l.ۜ᩸᩷), (r7v4 l.ۜ᩸᩷) binds: [B:18:0x0093, B:94:0x03d4, B:72:0x0298, B:62:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v3 java.lang.String), (r9v2 java.lang.String) binds: [B:18:0x0093, B:94:0x03d4, B:72:0x0298, B:62:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r11v20 l.۬۬ܿ) = (r11v8 l.۬۬ܿ), (r11v11 l.۬۬ܿ), (r11v18 l.۬۬ܿ), (r11v21 l.۬۬ܿ) binds: [B:18:0x0093, B:94:0x03d4, B:72:0x0298, B:62:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r13v4 short) = (r13v2 short), (r13v3 short), (r13v2 short), (r13v2 short) binds: [B:18:0x0093, B:94:0x03d4, B:72:0x0298, B:62:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r14v4 short) = (r14v2 short), (r14v3 short), (r14v2 short), (r14v2 short) binds: [B:18:0x0093, B:94:0x03d4, B:72:0x0298, B:62:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r22v16 char[]) = (r22v4 char[]), (r22v7 char[]), (r22v14 char[]), (r22v17 char[]) binds: [B:18:0x0093, B:94:0x03d4, B:72:0x0298, B:62:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x03d6: PHI (r23v16 char) = (r23v4 char), (r23v7 char), (r23v14 char), (r23v17 char) binds: [B:18:0x0093, B:94:0x03d4, B:72:0x0298, B:62:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v98, types: [l.۟ܶ᩷] */
    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int i5;
        int i6 = RunnableC0871.f81839;
        int i7 = RunnableC1014.f81941;
        int iM559711 = (C0946.m55979("ᩴ᩵") ^ i7) * (-13);
        int i8 = ((iM559711 ^ i6) * (-9397)) ^ (-1482165813);
        char[] cArr = null;
        ViewOnClickListenerC9062 viewOnClickListenerC9062 = null;
        short[] sArr = null;
        int i9 = iM559711 ^ 1198935072;
        String strM55995 = null;
        int length = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -598274641;
        C14853 c14853 = null;
        String strM55921 = null;
        String strM55893 = null;
        char c2 = 0;
        while (true) {
            i15 = i9 ^ (i8 & (((i15 ^ i6) * 6109) >> 31));
            switch (i15) {
                case -2080296185:
                case -1000830132:
                    cArr = cArr;
                    c14853 = c14853;
                    c2 = c2;
                    s = sArr[c];
                    s2 = 12650;
                    if (C0877.f81843 >= 0) {
                        iM559710 = C0873.m55680("ᩴۘ") ^ i7;
                        i3 = ((iM559710 ^ i6) * (-27319)) ^ (-945794061);
                        i4 = -33407900;
                    } else {
                        iM559710 = (C0873.m55680("ۨۜ") + i6) * 21;
                        i3 = ((iM559710 ^ i7) * 14455) ^ (-698174992);
                        i4 = -284939019;
                    }
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr2 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr2;
                    break;
                case -2059095616:
                case -1498079961:
                    cArr = cArr;
                    c14853 = c14853;
                    c2 = c2;
                    strM55893 = C0930.m55893(f81893, 1, 3, i11);
                    if (C1229.m56410() != 0) {
                        iM559710 = C0873.m55680("ᩴۘ") ^ i7;
                        i3 = ((iM559710 ^ i6) * (-27319)) ^ (-945794061);
                        i4 = -33407900;
                    } else {
                        iM559710 = (C0873.m55680("ܰᩴ") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM559710 ^ i7) * 18865) ^ (-719087603);
                        i4 = 1567252866;
                    }
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr3 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr3;
                    break;
                case -2052605018:
                case -1067417950:
                    C0863.m55643();
                    cArr = cArr;
                    c14853 = c14853;
                    c2 = c2;
                    iM559710 = C0873.m55680("ۧ۟") ^ i7;
                    i3 = ((iM559710 ^ i6) * (-14035)) ^ 275334545;
                    i4 = 191461182;
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr4 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr4;
                    break;
                case -1760995293:
                case 1021604570:
                    cArr = cArr;
                    c14853 = c14853;
                    c2 = c2;
                    if (C0882.m55719(strM55995) != 32) {
                        iM559710 = C0946.m55979("۟ܳ") ^ i7;
                        i3 = ((iM559710 ^ i6) * 32145) ^ 1619650161;
                        i4 = -458317735;
                    } else {
                        iM559710 = (C0873.m55680("ۤۨ") ^ i7) * (-59);
                        i3 = ((iM559710 ^ i6) * 15241) ^ (-748095377);
                        i4 = -1209168604;
                    }
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr5 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr5;
                    break;
                case -1674615903:
                case 139724662:
                    cArr = cArr;
                    c14853 = c14853;
                    c2 = c2;
                    strM55995 = C0947.m55995(m33346().toUpperCase());
                    if (C0863.m55643()) {
                        iM559710 = C0946.m55979("۬᩶") ^ i6;
                        i3 = ((iM559710 ^ i7) * (-6809)) ^ 1149143745;
                        i4 = -1524663169;
                    } else {
                        iM559710 = C0873.m55680("᩷᩹") ^ i7;
                        i3 = ((iM559710 ^ i6) * (-10079)) ^ (-150848549);
                        i4 = -781283233;
                    }
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr6 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr6;
                    break;
                case -1611936979:
                case 1797783368:
                    if (C1003.m56123() != 0) {
                        iM55979 = (i6 - C0946.m55979("ۚܳ")) * (-41);
                        i = ((iM55979 ^ i7) * (-25827)) ^ 1542505311;
                        i2 = -1767422248;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    } else {
                        cArr = cArr;
                        c14853 = c14853;
                        c2 = c2;
                        iM559710 = C0873.m55680("ۧ۟") ^ i7;
                        i3 = ((iM559710 ^ i6) * (-14035)) ^ 275334545;
                        i4 = 191461182;
                        i5 = iM559710 ^ i4;
                        c2 = c2;
                        c14853 = c14853;
                        char[] cArr7 = cArr;
                        i9 = i5;
                        i8 = i3;
                        cArr = cArr7;
                    }
                    break;
                case -1333369313:
                case 1307214818:
                    if (c2 >= '0') {
                        iM55979 = C0946.m55979("ۜ֡") ^ i7;
                        i = ((iM55979 ^ i6) * 29269) ^ (-202798215);
                        i2 = 343755283;
                    } else {
                        iM55979 = (C0946.m55979("᩵֡") + i6) * 29;
                        i = ((iM55979 ^ i7) * 1291) ^ (-533690440);
                        i2 = 117068234;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1333325040:
                case 1738055723:
                    C0946.m55980();
                    if (C1017.f81942 < 0) {
                        int iM55680 = (i6 - C0873.m55680("ܰ᩺")) * 19;
                        i9 = iM55680 ^ 540521814;
                        i8 = ((iM55680 ^ i7) * (-3821)) ^ 1516966591;
                        c14853 = null;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ۚܳ")) * (-41);
                        i = ((iM55979 ^ i7) * (-25827)) ^ 1542505311;
                        i2 = -1767422248;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case -1296128877:
                case -159333603:
                    short[] sArr2 = f81893;
                    if (C1404.f82149 >= 0) {
                        int iM55681 = (i6 - C0873.m55680("ܰ᩺")) * 19;
                        i9 = iM55681 ^ 540521814;
                        i8 = ((iM55681 ^ i7) * (-3821)) ^ 1516966591;
                        c14853 = null;
                    } else {
                        cArr = cArr;
                        c2 = c2;
                        String strM56558 = C1929.m56558(sArr2, 4, 3, i11);
                        if (C1229.f82066 >= 0) {
                            int iM55682 = C0873.m55680("ۜۘ") ^ i6;
                            i3 = ((iM55682 ^ i7) * (-4383)) ^ 999339845;
                            i5 = iM55682 ^ 1198624322;
                            c2 = c2;
                            c14853 = null;
                            char[] cArr8 = cArr;
                            i9 = i5;
                            i8 = i3;
                            cArr = cArr8;
                        } else {
                            C14853 c14854 = new C14853(viewOnClickListenerC9062, C0946.m55979(strM56558) ^ 2123255942);
                            if (C0949.f81897 >= 0) {
                                c14853 = c14854;
                                iM559710 = C0873.m55680("᩷᩹") ^ i7;
                                i3 = ((iM559710 ^ i6) * (-10079)) ^ (-150848549);
                                i4 = -781283233;
                                i5 = iM559710 ^ i4;
                                c2 = c2;
                                c14853 = c14853;
                                char[] cArr9 = cArr;
                                i9 = i5;
                                i8 = i3;
                                cArr = cArr9;
                            } else {
                                int iM559712 = C0946.m55979("۫ۚ") ^ i7;
                                c14853 = c14854;
                                i8 = ((iM559712 ^ i6) * 1995) ^ 599166625;
                                c2 = c2;
                                i9 = iM559712 ^ (-1416641061);
                                cArr = cArr;
                            }
                        }
                    }
                    break;
                case -1232333518:
                case 39719278:
                    cArr = cArr;
                    c14853 = c14853;
                    c2 = c2;
                    if (i10 < length) {
                        iM559710 = (C0946.m55979("ۡ᩺") + i6) * (-57);
                        i3 = ((iM559710 ^ i7) * 22617) ^ (-1730262516);
                        i4 = -1709263220;
                    } else {
                        iM559710 = C0873.m55680("᩻۬") ^ i6;
                        i3 = ((iM559710 ^ i7) * (-2521)) ^ 191725338;
                        i4 = -148256504;
                    }
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr10 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr10;
                    break;
                case -1170471544:
                case 1786996299:
                    C0898.m55800();
                    C1003.m56123();
                    break;
                case -1140134174:
                case 109151675:
                    m33349(C0873.m55680(strM55893) ^ 2125778378);
                    break;
                case -1035326611:
                case 1960142027:
                    i10++;
                    int iM559713 = (C0946.m55979("ᩴۤ") + i7) * (-65);
                    i9 = iM559713 ^ (-1811692271);
                    i8 = ((iM559713 ^ i6) * 17765) ^ (-243959200);
                    c2 = c2;
                    c14853 = c14853;
                    break;
                case -899295943:
                case -636451177:
                    C0898.m55803(c14853);
                    final C14853 c14855 = c14853;
                    C4654.m9850(viewOnClickListenerC9062, (C9552) new InterfaceC11360(this) { // from class: l.۟ܶ᩷

                        /* JADX INFO: renamed from: ۫ۡ۟, reason: not valid java name and contains not printable characters */
                        private static final short[] f82061 = {9307, 19896, -21612, -17522, -19944, 26382, -22273};

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C4368 f26258;

                        {
                            int i16 = -635432263;
                            int i17 = C0866.f81837;
                            int i18 = ServiceConnectionC1013.f81940;
                            int iM55683 = (C0873.m55680("ܽ֨") ^ i18) * (-37);
                            int i19 = ((iM55683 ^ i17) * (-31147)) ^ 114085386;
                            int i20 = -1351467753;
                            while (true) {
                                i16 = ((((i16 ^ i17) * (-24695)) >> 31) & i19) ^ (iM55683 ^ i20);
                                switch (i16) {
                                    case -1906627791:
                                    case -1683212124:
                                        if (C0854.f81826 == 0) {
                                            iM55683 = C0873.m55680("ۧ۫") ^ i17;
                                            i19 = ((iM55683 ^ i18) * 27381) ^ (-1886310057);
                                            i20 = 789735601;
                                        } else {
                                            iM55683 = C0873.m55680("֨ۙ") ^ i18;
                                            i19 = ((iM55683 ^ i17) * 22467) ^ (-980952085);
                                            i20 = 1179268156;
                                        }
                                        break;
                                    case -1744019917:
                                    case 1634922434:
                                        if (C0894.m55769() >= 0) {
                                            iM55683 = C0873.m55680("ۧ۫") ^ i17;
                                            i19 = ((iM55683 ^ i18) * 27381) ^ (-1886310057);
                                            i20 = 789735601;
                                        } else {
                                            iM55683 = (C0946.m55979("ۨܶ") ^ i17) * (-123);
                                            i19 = ((iM55683 ^ i18) * (-8297)) ^ 679398071;
                                            i20 = 117237311;
                                        }
                                        break;
                                    case -1555841107:
                                    case -788613963:
                                        if (C0882.f81846) {
                                            iM55683 = (C0873.m55680("ܳ᩸") + i17) * (-43);
                                            i19 = ((iM55683 ^ i18) * 6473) ^ 1972092141;
                                            i20 = 180205049;
                                        } else {
                                            iM55683 = C0946.m55979("ۚᩳ") ^ i17;
                                            i19 = ((iM55683 ^ i18) * (-12945)) ^ (-466196498);
                                            i20 = 645512964;
                                        }
                                        break;
                                    case -1430423683:
                                    case -486591536:
                                        C0946.m55980();
                                        C0854.m55595();
                                        throw new RuntimeException();
                                    case -1376662482:
                                    case -820972482:
                                        if (C0894.f81854 >= 0) {
                                            iM55683 = C0873.m55680("ۧ۫") ^ i17;
                                            i19 = ((iM55683 ^ i18) * 27381) ^ (-1886310057);
                                            i20 = 789735601;
                                        } else {
                                            iM55683 = C0873.m55680("ܳ۬") ^ i18;
                                            i19 = ((iM55683 ^ i17) * 27333) ^ 1324899210;
                                            i20 = -577397731;
                                        }
                                        break;
                                    case -1198679444:
                                    case 828542836:
                                        if (C1003.f81929 <= 0) {
                                            iM55683 = C0873.m55680("ۧ۫") ^ i17;
                                            i19 = ((iM55683 ^ i18) * 27381) ^ (-1886310057);
                                            i20 = 789735601;
                                        } else {
                                            iM55683 = C0946.m55979("ᩴ᩷") ^ i17;
                                            i19 = ((iM55683 ^ i18) * 15727) ^ 1201336704;
                                            i20 = 741400111;
                                        }
                                        break;
                                    case -1160037995:
                                    case 1109967893:
                                        if (C1229.f82066 >= 0) {
                                            iM55683 = (C0946.m55979("ܿۚ") + i17) * (-101);
                                            i19 = ((iM55683 ^ i18) * (-7907)) ^ (-1395369261);
                                            i20 = 866591768;
                                        } else {
                                            iM55683 = (i17 - C0946.m55979("֨ܰ")) * 93;
                                            i19 = ((iM55683 ^ i18) * (-6115)) ^ (-1382341095);
                                            i20 = -275267407;
                                        }
                                        break;
                                    case -999605960:
                                    case 1561402446:
                                        C0912.m55833();
                                        if (C0863.f81833 <= 0) {
                                            iM55683 = (C0873.m55680("ܳ᩸") + i17) * (-43);
                                            i19 = ((iM55683 ^ i18) * 6473) ^ 1972092141;
                                            i20 = 180205049;
                                        } else {
                                            iM55683 = C0873.m55680("֨ۙ") ^ i18;
                                            i19 = ((iM55683 ^ i17) * 22467) ^ (-980952085);
                                            i20 = 1179268156;
                                        }
                                        break;
                                    case -988505774:
                                    case -583144685:
                                        if (C1044.f81959 < 0) {
                                            iM55683 = (i18 - C0946.m55979("֫ۧ")) * C0254q.f1218h;
                                            i19 = ((iM55683 ^ i17) * 19695) ^ (-517553537);
                                            i20 = -374820406;
                                        } else {
                                            iM55683 = C0873.m55680("ۧ۫") ^ i17;
                                            i19 = ((iM55683 ^ i18) * 27381) ^ (-1886310057);
                                            i20 = 789735601;
                                        }
                                        break;
                                    case -756634682:
                                    case 334818592:
                                        if (C1964.f83032 <= 0) {
                                            iM55683 = (C0873.m55680("ܳ᩸") + i17) * (-43);
                                            i19 = ((iM55683 ^ i18) * 6473) ^ 1972092141;
                                            i20 = 180205049;
                                        } else {
                                            iM55683 = (C0873.m55680("᩸۠") ^ i17) * (-49);
                                            i19 = ((iM55683 ^ i18) * (-27593)) ^ 427968614;
                                            i20 = -1375716116;
                                        }
                                        break;
                                    case -536596706:
                                    case 307046980:
                                        return;
                                    case -393055614:
                                    case -265166250:
                                        RunnableC0871.m55672();
                                        C1017.m56187();
                                        iM55683 = C0873.m55680("֨ۙ") ^ i18;
                                        i19 = ((iM55683 ^ i17) * 22467) ^ (-980952085);
                                        i20 = 1179268156;
                                        break;
                                    case -217004369:
                                    case 1524132927:
                                        if (C0906.m55809() <= 0) {
                                            iM55683 = (i18 - C0946.m55979("֫ۧ")) * C0254q.f1218h;
                                            i19 = ((iM55683 ^ i17) * 19695) ^ (-517553537);
                                            i20 = -374820406;
                                        } else {
                                            iM55683 = C0873.m55680("ۘ֨") ^ i18;
                                            i19 = ((iM55683 ^ i17) * (-26637)) ^ (-191860679);
                                            i20 = 1445729589;
                                        }
                                        break;
                                    case -111540258:
                                    case 821603974:
                                        if (C0892.f81851) {
                                            iM55683 = (C0946.m55979("ۧܶ") ^ i18) * (-15);
                                            i19 = ((iM55683 ^ i17) * (-16325)) ^ 652535061;
                                            i20 = -2054620068;
                                        } else {
                                            iM55683 = C0873.m55680("ۧ۫") ^ i17;
                                            i19 = ((iM55683 ^ i18) * 27381) ^ (-1886310057);
                                            i20 = 789735601;
                                        }
                                        break;
                                    case 1137393766:
                                    case 1865945646:
                                        this.f26258 = this;
                                        if (C0877.f81843 >= 0) {
                                            iM55683 = (C0873.m55680("ܳ᩸") + i17) * (-43);
                                            i19 = ((iM55683 ^ i18) * 6473) ^ 1972092141;
                                            i20 = 180205049;
                                        } else {
                                            iM55683 = C0946.m55979("ۨܳ") ^ i18;
                                            i19 = ((iM55683 ^ i17) * (-14027)) ^ (-755867778);
                                            i20 = 1041335293;
                                        }
                                        break;
                                    default:
                                        if (C0863.f81833 <= 0) {
                                            iM55683 = C0873.m55680("ۧ۫") ^ i17;
                                            i19 = ((iM55683 ^ i18) * 27381) ^ (-1886310057);
                                            i20 = 789735601;
                                        } else {
                                            iM55683 = C0873.m55680("᩵᩶") ^ i18;
                                            i19 = ((iM55683 ^ i17) * (-9771)) ^ 1322314402;
                                            i20 = 1337394300;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // p067l.InterfaceC11360
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo3843(C25065 c25065) {
                            int iM559714;
                            int i16;
                            int i17;
                            short s3;
                            int iM559715;
                            int i18;
                            int i19;
                            int iM559716;
                            int i20;
                            int iM55683;
                            int i21;
                            int i22;
                            C9552 c9552 = this;
                            int i23 = C1003.f81929;
                            int i24 = C0989.f81920;
                            int iM559717 = (C0946.m55979("ᩳ֨") + i24) * (-121);
                            int i25 = ((iM559717 ^ i23) * 5103) ^ (-1755043467);
                            short[] sArr3 = null;
                            short[] sArr4 = null;
                            short[] sArr5 = null;
                            int i26 = iM559717 ^ (-464273738);
                            C4368 c4368 = null;
                            int iM559718 = 0;
                            int iM559719 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            short s4 = 0;
                            int i29 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            char c3 = 0;
                            int i34 = 1711619614;
                            short s5 = 0;
                            while (true) {
                                i34 = i26 ^ (i25 & (((i34 ^ i23) * 18497) >> 31));
                                switch (i34) {
                                    case -1997590352:
                                    case 227017226:
                                        iM559719 = C0946.m55979(C1036.m56252(sArr5, i27, i28, i31));
                                        if (C0894.m55769() < 0) {
                                            iM559714 = C0946.m55979("ۖ۫") ^ i23;
                                            i16 = ((iM559714 ^ i24) * 19969) ^ 854795383;
                                            i17 = 628585743;
                                            i26 = iM559714 ^ i17;
                                            i25 = i16;
                                        } else {
                                            c4368 = c4368;
                                            iM55683 = C0873.m55680("᩻۫") ^ i23;
                                            i18 = ((iM55683 ^ i24) * 3571) ^ (-104268610);
                                            i21 = 2061010490;
                                            i22 = iM55683 ^ i21;
                                            C4368 c4369 = c4368;
                                            i26 = i22;
                                            i25 = i18;
                                            c4368 = c4369;
                                        }
                                        break;
                                    case -1739261244:
                                    case -83579867:
                                        if (!C0917.f81868) {
                                            c4368 = c4368;
                                            s3 = s5;
                                            iM559715 = C0946.m55979("᩶ۖ") ^ i24;
                                            i18 = ((iM559715 ^ i23) * (-19381)) ^ (-1760121386);
                                            i19 = -1268014308;
                                            i22 = iM559715 ^ i19;
                                            s5 = s3;
                                            c9552 = this;
                                            C4368 c43610 = c4368;
                                            i26 = i22;
                                            i25 = i18;
                                            c4368 = c43610;
                                        }
                                        c4368 = c4368;
                                        iM55683 = C0873.m55680("᩻۫") ^ i23;
                                        i18 = ((iM55683 ^ i24) * 3571) ^ (-104268610);
                                        i21 = 2061010490;
                                        i22 = iM55683 ^ i21;
                                        C4368 c43611 = c4368;
                                        i26 = i22;
                                        i25 = i18;
                                        c4368 = c43611;
                                        break;
                                    case -1715079185:
                                    case 118421426:
                                        C0927.m55865(2097430349 ^ iM559719);
                                        if (!C0866.m55645()) {
                                            c4368 = c4368;
                                            iM55683 = C0873.m55680("᩻۫") ^ i23;
                                            i18 = ((iM55683 ^ i24) * 3571) ^ (-104268610);
                                            i21 = 2061010490;
                                            i22 = iM55683 ^ i21;
                                            C4368 c43612 = c4368;
                                            i26 = i22;
                                            i25 = i18;
                                            c4368 = c43612;
                                        } else {
                                            iM559714 = C0946.m55979("ܰۢ") ^ i24;
                                            i16 = ((iM559714 ^ i23) * (-28819)) ^ (-717097924);
                                            i17 = 1073841701;
                                            i26 = iM559714 ^ i17;
                                            i25 = i16;
                                        }
                                        break;
                                    case -1651016425:
                                    case 1788952095:
                                        C1036.m56253(c14855);
                                        boolean zM55655 = C0866.m55655(c25065);
                                        c4368 = c9552.f26258;
                                        if (zM55655) {
                                            int iM55684 = C0873.m55680("ۧۙ") ^ i24;
                                            i26 = iM55684 ^ (-1755217153);
                                            i25 = ((iM55684 ^ i23) * 24431) ^ 1948864558;
                                        } else {
                                            int iM559720 = (C0946.m55979("۬۟") + i23) * 35;
                                            i25 = ((iM559720 ^ i24) * 1043) ^ (-748108851);
                                            i26 = iM559720 ^ (-1524027493);
                                        }
                                        c9552 = this;
                                        break;
                                    case -1636465493:
                                    case 2038372114:
                                        c4368 = c4368;
                                        s5 = sArr3[c3];
                                        s4 = 36548;
                                        if (C0967.m56074()) {
                                            iM559716 = (C0946.m55979("֫ܶ") + i23) * (-5);
                                            i25 = ((iM559716 ^ i24) * (-14613)) ^ (-576248878);
                                            i20 = 384239557;
                                        } else {
                                            iM559716 = C0946.m55979("ۙ᩷") ^ i23;
                                            i25 = ((iM559716 ^ i24) * (-30817)) ^ (-1982464428);
                                            i20 = 1180974810;
                                        }
                                        int i35 = iM559716 ^ i20;
                                        c4368 = c4368;
                                        i26 = i35;
                                        c9552 = this;
                                        break;
                                    case -1570370811:
                                    case 619188473:
                                        i31 = 14599;
                                        iM559716 = (C0946.m55979("۟ۜ") ^ i24) * (-67);
                                        i25 = ((iM559716 ^ i23) * (-24839)) ^ (-1668441486);
                                        i20 = 1166988469;
                                        int i36 = iM559716 ^ i20;
                                        c4368 = c4368;
                                        i26 = i36;
                                        c9552 = this;
                                        break;
                                    case -1565777611:
                                    case 329020266:
                                        c4368 = c4368;
                                        sArr4 = f82061;
                                        i32 = 1;
                                        i33 = 3;
                                        if (C1964.f83032 <= 0) {
                                            iM55683 = C0873.m55680("᩻۫") ^ i23;
                                            i18 = ((iM55683 ^ i24) * 3571) ^ (-104268610);
                                            i21 = 2061010490;
                                        } else {
                                            iM55683 = C0873.m55680("ܰۜ") ^ i24;
                                            i18 = ((iM55683 ^ i23) * 3805) ^ (-324080921);
                                            i21 = 512603205;
                                        }
                                        i22 = iM55683 ^ i21;
                                        C4368 c43613 = c4368;
                                        i26 = i22;
                                        i25 = i18;
                                        c4368 = c43613;
                                        break;
                                    case -1255950080:
                                    case 959689717:
                                        C0955.m56027(c4368.f9818);
                                        break;
                                    case -984364670:
                                    case 1854990867:
                                        c4368 = c4368;
                                        s3 = s5;
                                        if (C0906.f81862 >= 0) {
                                            iM559715 = C0946.m55979("᩶ۖ") ^ i24;
                                            i18 = ((iM559715 ^ i23) * (-19381)) ^ (-1760121386);
                                            i19 = -1268014308;
                                        } else {
                                            iM559715 = C0946.m55979("ۢۘ") ^ i24;
                                            i18 = ((iM559715 ^ i23) * 591) ^ 1883870942;
                                            i19 = -1048802318;
                                        }
                                        i22 = iM559715 ^ i19;
                                        s5 = s3;
                                        c9552 = this;
                                        C4368 c43614 = c4368;
                                        i26 = i22;
                                        i25 = i18;
                                        c4368 = c43614;
                                        break;
                                    case -394402241:
                                    case 366439866:
                                        c4368.m33337(AbstractC0942.m55960(c25065, 2128250953 ^ iM559718));
                                        break;
                                    case -340817026:
                                    case -292561602:
                                        iM559718 = C0946.m55979(C0890.m55726(sArr4, i32, i33, i31));
                                        if (C1071.f81975 <= 0) {
                                            c4368 = c4368;
                                            iM55683 = C0873.m55680("᩻۫") ^ i23;
                                            i18 = ((iM55683 ^ i24) * 3571) ^ (-104268610);
                                            i21 = 2061010490;
                                        } else {
                                            iM55683 = (C0873.m55680("᩶᩷") + i23) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            c4368 = c4368;
                                            i18 = ((iM55683 ^ i24) * 21345) ^ 729316531;
                                            i21 = -1533615010;
                                        }
                                        i22 = iM55683 ^ i21;
                                        C4368 c43615 = c4368;
                                        i26 = i22;
                                        i25 = i18;
                                        c4368 = c43615;
                                        break;
                                    case 6326862:
                                    case 54302332:
                                        c4368 = c4368;
                                        s3 = s5;
                                        c3 = 0;
                                        if (C0873.f81841 > 0) {
                                            iM559715 = (C0946.m55979("᩷֫") ^ i24) * 63;
                                            i18 = ((iM559715 ^ i23) * (-27987)) ^ (-1487636280);
                                            i19 = 707352367;
                                            i22 = iM559715 ^ i19;
                                            s5 = s3;
                                            c9552 = this;
                                            C4368 c43616 = c4368;
                                            i26 = i22;
                                            i25 = i18;
                                            c4368 = c43616;
                                        } else {
                                            s5 = s3;
                                            iM559716 = (C0946.m55979("֫ܶ") + i23) * (-5);
                                            i25 = ((iM559716 ^ i24) * (-14613)) ^ (-576248878);
                                            i20 = 384239557;
                                            int i37 = iM559716 ^ i20;
                                            c4368 = c4368;
                                            i26 = i37;
                                            c9552 = this;
                                        }
                                        break;
                                    case 86326570:
                                    case 711059382:
                                        c4368 = c4368;
                                        if ((i30 * i30) - i29 < 0) {
                                            iM559716 = (C0873.m55680("ۤᩳ") ^ i23) * (-69);
                                            i25 = ((iM559716 ^ i24) * 14023) ^ (-1639362554);
                                            i20 = -604622691;
                                        } else {
                                            iM559716 = (i24 - C0873.m55680("ۖۡ")) * (-63);
                                            i25 = ((iM559716 ^ i23) * (-867)) ^ (-1447148696);
                                            i20 = -2008409035;
                                        }
                                        int i38 = iM559716 ^ i20;
                                        c4368 = c4368;
                                        i26 = i38;
                                        c9552 = this;
                                        break;
                                    case 728309668:
                                    case 1165669540:
                                        C0967.m56074();
                                        if (C0892.f81851) {
                                            c4368 = c4368;
                                            s3 = s5;
                                            iM559715 = C0946.m55979("۬ۘ") ^ i24;
                                            i18 = ((iM559715 ^ i23) * 1891) ^ (-1033007987);
                                            i19 = -666734126;
                                            i22 = iM559715 ^ i19;
                                            s5 = s3;
                                            c9552 = this;
                                            C4368 c43617 = c4368;
                                            i26 = i22;
                                            i25 = i18;
                                            c4368 = c43617;
                                        }
                                        c4368 = c4368;
                                        iM55683 = C0873.m55680("᩻۫") ^ i23;
                                        i18 = ((iM55683 ^ i24) * 3571) ^ (-104268610);
                                        i21 = 2061010490;
                                        i22 = iM55683 ^ i21;
                                        C4368 c43618 = c4368;
                                        i26 = i22;
                                        i25 = i18;
                                        c4368 = c43618;
                                        break;
                                    case 878611795:
                                    case 1878575498:
                                        c4368 = c4368;
                                        s3 = s5;
                                        sArr3 = f82061;
                                        if (C1048.f81963) {
                                            iM559715 = (C0873.m55680("ܶۚ") + i23) * 13;
                                            i18 = ((iM559715 ^ i24) * (-3019)) ^ (-575798219);
                                            i19 = -1068123630;
                                        } else {
                                            iM559715 = C0946.m55979("۬ۘ") ^ i24;
                                            i18 = ((iM559715 ^ i23) * 1891) ^ (-1033007987);
                                            i19 = -666734126;
                                        }
                                        i22 = iM559715 ^ i19;
                                        s5 = s3;
                                        c9552 = this;
                                        C4368 c43619 = c4368;
                                        i26 = i22;
                                        i25 = i18;
                                        c4368 = c43619;
                                        break;
                                    case 1095385771:
                                    case 1770827560:
                                        C0930.m55885();
                                        C1046.m56302();
                                        c4368 = c4368;
                                        iM55683 = C0873.m55680("᩻۫") ^ i23;
                                        i18 = ((iM55683 ^ i24) * 3571) ^ (-104268610);
                                        i21 = 2061010490;
                                        i22 = iM55683 ^ i21;
                                        C4368 c436110 = c4368;
                                        i26 = i22;
                                        i25 = i18;
                                        c4368 = c436110;
                                        break;
                                    case 1249195648:
                                    case 1858317472:
                                        i31 = 21695;
                                        iM559716 = (C0946.m55979("۟ۜ") ^ i24) * (-67);
                                        i25 = ((iM559716 ^ i23) * (-24839)) ^ (-1668441486);
                                        i20 = 1166988469;
                                        int i39 = iM559716 ^ i20;
                                        c4368 = c4368;
                                        i26 = i39;
                                        c9552 = this;
                                        break;
                                    case 1274360737:
                                    case 1487070594:
                                        C0947.m55997();
                                        break;
                                    case 1593465879:
                                    case 1648592058:
                                        sArr5 = f82061;
                                        i27 = 4;
                                        i28 = 3;
                                        if (C0863.f81833 <= 0) {
                                            iM559714 = C0873.m55680("ᩳۡ") ^ i23;
                                            i16 = ((iM559714 ^ i24) * (-15605)) ^ 2143054842;
                                            i17 = -646001021;
                                        } else {
                                            iM559714 = C0873.m55680("ᩳۛ") ^ i24;
                                            i16 = ((iM559714 ^ i23) * (-16035)) ^ (-528330687);
                                            i17 = 2110705903;
                                        }
                                        i26 = iM559714 ^ i17;
                                        i25 = i16;
                                        break;
                                    case 1679656972:
                                    case 1716909319:
                                        c4368 = c4368;
                                        i29 = s5 * s4;
                                        s3 = s5;
                                        i30 = s3 + 9137;
                                        if (!C0917.m55854()) {
                                            s5 = s3;
                                            iM559716 = (C0946.m55979("֫ܶ") + i23) * (-5);
                                            i25 = ((iM559716 ^ i24) * (-14613)) ^ (-576248878);
                                            i20 = 384239557;
                                            int i310 = iM559716 ^ i20;
                                            c4368 = c4368;
                                            i26 = i310;
                                            c9552 = this;
                                        } else {
                                            iM559715 = C0946.m55979("۠֡") ^ i23;
                                            i18 = ((iM559715 ^ i24) * (-16863)) ^ 423803234;
                                            i19 = 660389763;
                                            i22 = iM559715 ^ i19;
                                            s5 = s3;
                                            c9552 = this;
                                            C4368 c436111 = c4368;
                                            i26 = i22;
                                            i25 = i18;
                                            c4368 = c436111;
                                        }
                                        break;
                                    default:
                                        C0882.m55710();
                                        if (!C1025.m56230()) {
                                            iM559714 = C0873.m55680("ᩳۡ") ^ i23;
                                            i16 = ((iM559714 ^ i24) * (-15605)) ^ 2143054842;
                                            i17 = -646001021;
                                            i26 = iM559714 ^ i17;
                                            i25 = i16;
                                        } else {
                                            c4368 = c4368;
                                            iM55683 = C0873.m55680("᩻۫") ^ i23;
                                            i18 = ((iM55683 ^ i24) * 3571) ^ (-104268610);
                                            i21 = 2061010490;
                                            i22 = iM55683 ^ i21;
                                            C4368 c436112 = c4368;
                                            i26 = i22;
                                            i25 = i18;
                                            c4368 = c436112;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    }, strM55995);
                    break;
                case -786470127:
                case 1972854267:
                    if (c2 > '9') {
                        iM55979 = (C0946.m55979("᩵֡") + i6) * 29;
                        i = ((iM55979 ^ i7) * 1291) ^ (-533690440);
                        i2 = 117068234;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ۛ۟")) * 51;
                        i = ((iM55979 ^ i7) * (-32165)) ^ (-1468929518);
                        i2 = -639803846;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -748158220:
                case -656177495:
                    char[] charArray = strM55995.toCharArray();
                    length = charArray.length;
                    i10 = 0;
                    cArr = charArray;
                    int iM559714 = (C0946.m55979("ᩴۤ") + i7) * (-65);
                    i9 = iM559714 ^ (-1811692271);
                    i8 = ((iM559714 ^ i6) * 17765) ^ (-243959200);
                    c2 = c2;
                    c14853 = c14853;
                    break;
                case -705089035:
                case 749733716:
                    c2 = cArr[i10];
                    if (c2 >= 'A') {
                        iM55979 = C0946.m55979("ᩳ۬") ^ i7;
                        i = ((iM55979 ^ i6) * 31891) ^ 86041975;
                        i2 = 1864177895;
                    } else {
                        iM55979 = (C0873.m55680("۠ۤ") + i7) * 85;
                        i = ((iM55979 ^ i6) * (-5163)) ^ (-559707185);
                        i2 = -824847321;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -561337711:
                case 541673066:
                    if (C0967.f81910 < 0) {
                        cArr = cArr;
                        c14853 = c14853;
                        c2 = c2;
                        iM559710 = C0873.m55680("᩷᩹") ^ i7;
                        i3 = ((iM559710 ^ i6) * (-10079)) ^ (-150848549);
                        i4 = -781283233;
                        i5 = iM559710 ^ i4;
                        c2 = c2;
                        c14853 = c14853;
                        char[] cArr11 = cArr;
                        i9 = i5;
                        i8 = i3;
                        cArr = cArr11;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ۚܳ")) * (-41);
                        i = ((iM55979 ^ i7) * (-25827)) ^ 1542505311;
                        i2 = -1767422248;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case -536887178:
                case 1079122660:
                    cArr = cArr;
                    c14853 = c14853;
                    c2 = c2;
                    sArr = f81893;
                    c = 0;
                    if (C0949.f81897 >= 0) {
                        iM559710 = C0873.m55680("ۧ۟") ^ i7;
                        i3 = ((iM559710 ^ i6) * (-14035)) ^ 275334545;
                        i4 = 191461182;
                    } else {
                        iM559710 = (C0946.m55979("ۢ֨") ^ i7) * 33;
                        i3 = ((iM559710 ^ i6) * 32347) ^ 172428039;
                        i4 = 455991052;
                    }
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr12 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr12;
                    break;
                case -134822426:
                case 1902613403:
                    m33349(C0873.m55680(strM55921) ^ 2099104269);
                    break;
                case 148807366:
                case 289822874:
                    i11 = 13917;
                    iM559710 = (i7 - C0946.m55979("᩵֫")) * (-49);
                    i3 = ((iM559710 ^ i6) * (-13809)) ^ (-74976707);
                    i4 = 1257813167;
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr13 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr13;
                    break;
                case 250933139:
                case 628171557:
                    if (c2 > 'Z') {
                        iM55979 = (C0873.m55680("۠ۤ") + i7) * 85;
                        i = ((iM55979 ^ i6) * (-5163)) ^ (-559707185);
                        i2 = -824847321;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ۛ۟")) * 51;
                        i = ((iM55979 ^ i7) * (-32165)) ^ (-1468929518);
                        i2 = -639803846;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case 557158961:
                case 1490090912:
                    i11 = 45123;
                    iM559710 = (i7 - C0946.m55979("᩵֫")) * (-49);
                    i3 = ((iM559710 ^ i6) * (-13809)) ^ (-74976707);
                    i4 = 1257813167;
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr14 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr14;
                    break;
                case 1301728297:
                case 1845216000:
                    if (C0992.f81922 >= 0) {
                        cArr = cArr;
                        c14853 = c14853;
                        c2 = c2;
                        iM559710 = C0873.m55680("ᩴۘ") ^ i7;
                        i3 = ((iM559710 ^ i6) * (-27319)) ^ (-945794061);
                        i4 = -33407900;
                        i5 = iM559710 ^ i4;
                        c2 = c2;
                        c14853 = c14853;
                        char[] cArr15 = cArr;
                        i9 = i5;
                        i8 = i3;
                        cArr = cArr15;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ۚܳ")) * (-41);
                        i = ((iM55979 ^ i7) * (-25827)) ^ 1542505311;
                        i2 = -1767422248;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case 1320826282:
                case 1859872804:
                    cArr = cArr;
                    c14853 = c14853;
                    c2 = c2;
                    i12 = s * s2;
                    i13 = s * s;
                    i14 = 40005625;
                    if (C0861.f81831) {
                        iM559710 = (C0873.m55680("֡ۨ") ^ i6) * 65;
                        i3 = ((iM559710 ^ i7) * 12205) ^ (-1456411670);
                        i4 = 1001272437;
                    } else {
                        iM559710 = C0873.m55680("᩷᩹") ^ i7;
                        i3 = ((iM559710 ^ i6) * (-10079)) ^ (-150848549);
                        i4 = -781283233;
                    }
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr16 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr16;
                    break;
                case 1469310283:
                case 1997787941:
                    strM55921 = C0937.m55921(f81893, 7, 3, i11);
                    if (!C0877.m55696()) {
                        cArr = cArr;
                        c14853 = c14853;
                        c2 = c2;
                        iM559710 = C0873.m55680("᩷᩹") ^ i7;
                        i3 = ((iM559710 ^ i6) * (-10079)) ^ (-150848549);
                        i4 = -781283233;
                        i5 = iM559710 ^ i4;
                        c2 = c2;
                        c14853 = c14853;
                        char[] cArr17 = cArr;
                        i9 = i5;
                        i8 = i3;
                        cArr = cArr17;
                    } else {
                        iM55979 = C0946.m55979("ܶ۫") ^ i6;
                        i = ((iM55979 ^ i7) * (-26003)) ^ 39934678;
                        i2 = -392394175;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case 1859194230:
                case 1944138569:
                    cArr = cArr;
                    c14853 = c14853;
                    c2 = c2;
                    C7350 c7350 = C23724.f75498;
                    viewOnClickListenerC9062 = this.f9818;
                    c7350.m4065((InterfaceC24784) viewOnClickListenerC9062);
                    if (C0892.f81851) {
                        iM559710 = (C0946.m55979("ۖܺ") ^ i6) * C0254q.f1218h;
                        i3 = ((iM559710 ^ i7) * 31399) ^ 651162576;
                        i4 = -1658948788;
                    } else {
                        iM559710 = C0873.m55680("ᩴۘ") ^ i7;
                        i3 = ((iM559710 ^ i6) * (-27319)) ^ (-945794061);
                        i4 = -33407900;
                    }
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr18 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr18;
                    break;
                default:
                    cArr = cArr;
                    c14853 = c14853;
                    c2 = c2;
                    if (i12 - (i13 + i14) > 0) {
                        iM559710 = C0873.m55680("ᩴۧ") ^ i6;
                        i3 = ((iM559710 ^ i7) * (-23203)) ^ (-1396223279);
                        i4 = -1859757158;
                    } else {
                        iM559710 = (i7 - C0946.m55979("ܰۖ")) * (-109);
                        i3 = ((iM559710 ^ i6) * (-29827)) ^ 1131358867;
                        i4 = 1851631412;
                    }
                    i5 = iM559710 ^ i4;
                    c2 = c2;
                    c14853 = c14853;
                    char[] cArr19 = cArr;
                    i9 = i5;
                    i8 = i3;
                    cArr = cArr19;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4368(ViewOnClickListenerC9062 viewOnClickListenerC9062, ViewOnClickListenerC9062 viewOnClickListenerC9063) {
        super(viewOnClickListenerC9063, -1);
        int i = 16983690;
        int i2 = ServiceConnectionC1013.f81940;
        int i3 = C0877.f81843;
        this.f9818 = viewOnClickListenerC9062;
        int iM55979 = (C0946.m55979("۫ᩳ") + i3) * 39;
        int i4 = ((iM55979 ^ i2) * 18059) ^ 1138223469;
        int i5 = -1855153570;
        while (true) {
            i = (iM55979 ^ i5) ^ (i4 & (((i ^ i2) * (-28223)) >> 31));
            switch (i) {
                case -859456951:
                case 382627117:
                    C0927.m55873();
                    C0892.m55749();
                    throw new RuntimeException();
                case -807115683:
                case 1087463784:
                    C1194.m56396();
                    iM55979 = C0946.m55979("۬᩸") ^ i2;
                    i4 = ((iM55979 ^ i3) * 4885) ^ 424699793;
                    i5 = -96900783;
                    break;
                case -754173107:
                case -679047024:
                    return;
                case 206906613:
                case 686362689:
                    C0894.m55769();
                    if (!RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("۬᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 4885) ^ 424699793;
                        i5 = -96900783;
                    } else {
                        iM55979 = C0873.m55680("ܶܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-10523)) ^ (-1841348364);
                        i5 = 1101764736;
                    }
                    break;
                case 249445257:
                case 1039856826:
                    if (C0873.m55678()) {
                        iM55979 = C0946.m55979("۬᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 4885) ^ 424699793;
                        i5 = -96900783;
                    } else {
                        iM55979 = (C0873.m55680("֡ۛ") + i2) * 19;
                        i4 = ((iM55979 ^ i3) * (-7791)) ^ 1511075111;
                        i5 = -1096958785;
                    }
                    break;
                case 813894751:
                case 1993492030:
                    C0898.m55800();
                    if (RunnableC0871.f81839 < 0) {
                        iM55979 = C0873.m55680("ܶܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-10523)) ^ (-1841348364);
                        i5 = 1101764736;
                    } else {
                        iM55979 = (i3 - C0873.m55680("֡ܰ")) * (-71);
                        i4 = ((iM55979 ^ i2) * (-31579)) ^ (-347300299);
                        i5 = -2036588809;
                    }
                    break;
                default:
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("ܰܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32561)) ^ (-896289538);
                        i5 = 1506372749;
                    } else {
                        iM55979 = C0946.m55979("ܿۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11513) ^ (-533555138);
                        i5 = -596369835;
                    }
                    break;
            }
        }
    }
}
