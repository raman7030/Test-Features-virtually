package p067l;

import android.content.Intent;
import android.view.View;
import bin.p000mt.plus.Main;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H508 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10159 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ۡۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f82082 = {9450, -23997, -23977, -23990, -23992, -23967, -23988, -23996, -23991, -23990, -23998};

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f28109;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f28110;

    public /* synthetic */ ViewOnClickListenerC10159(int i, Object obj) {
        int i2 = -1069723739;
        int i3 = C1012.f81938;
        int i4 = C0863.f81833;
        this.f28109 = i;
        this.f28110 = obj;
        int iM55979 = (C0946.m55979("᩵ۧ") ^ i4) * 7;
        int i5 = ((iM55979 ^ i3) * (-13247)) ^ (-1303393543);
        int i6 = -1841721455;
        while (true) {
            i2 = (iM55979 ^ i6) ^ (i5 & (((i2 ^ i3) * 2449) >> 31));
            switch (i2) {
                case -1727066806:
                case -1353567801:
                    return;
                case -1483620971:
                case -1172931670:
                    C0898.m55800();
                    iM55979 = C0946.m55979("ۜۚ") ^ i3;
                    i5 = ((iM55979 ^ i4) * (-13587)) ^ (-1191905848);
                    i6 = 1902235172;
                    break;
                case -1293339235:
                case 1239788289:
                    C1404.m56468();
                    if (C0947.f81895) {
                        iM55979 = (C0946.m55979("ۧ᩹") ^ i4) * (-91);
                        i5 = ((iM55979 ^ i3) * (-12095)) ^ 506785601;
                        i6 = -987694402;
                    } else {
                        iM55979 = C0873.m55680("᩺ܽ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-11453)) ^ 723899073;
                        i6 = -1560410968;
                    }
                    break;
                case -998945166:
                case 1578288689:
                    ServiceConnectionC1013.m56157();
                    C1071.m56343();
                    throw new RuntimeException();
                case -518533983:
                case 941106583:
                    C0845.m55584();
                    if (C1044.f81959 < 0) {
                        iM55979 = C0873.m55680("᩺ܽ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-11453)) ^ 723899073;
                        i6 = -1560410968;
                    } else {
                        iM55979 = (C0946.m55979("ۙۗ") + i3) * 31;
                        i5 = ((iM55979 ^ i4) * 7949) ^ (-1386873528);
                        i6 = 506953887;
                    }
                    break;
                case 1013106452:
                case 1362745088:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0946.m55979("۠᩸") ^ i3) * 43;
                        i5 = ((iM55979 ^ i4) * 5103) ^ 1098649283;
                        i6 = -661427187;
                    } else {
                        iM55979 = (C0873.m55680("ܿۗ") ^ i4) * 17;
                        i5 = ((iM55979 ^ i3) * (-26123)) ^ 1429784344;
                        i6 = 1051386179;
                    }
                    break;
                default:
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0873.m55680("᩺ܽ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-11453)) ^ 723899073;
                        i6 = -1560410968;
                    } else {
                        iM55979 = C0946.m55979("ۜۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-13587)) ^ (-1191905848);
                        i6 = 1902235172;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01d4 A[PHI: r7 r8 r10 r11
      0x01d4: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:56:0x01d2, B:48:0x017e, B:5:0x0047, B:98:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:56:0x01d2, B:48:0x017e, B:5:0x0047, B:98:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:56:0x01d2, B:48:0x017e, B:5:0x0047, B:98:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r11v4 short) = (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:56:0x01d2, B:48:0x017e, B:5:0x0047, B:98:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int i5 = C1003.f81929;
        int i6 = C0866.f81837;
        int iM55680 = C0873.m55680("ᩴۡ") ^ i5;
        int i7 = ((iM55680 ^ i6) * 5451) ^ 2132681220;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM55680 ^ (-686742713);
        Intent intent = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 153653535;
        String strM55947 = null;
        Main main = null;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i6) * (-30989)) >> 31));
            switch (i13) {
                case -2144892382:
                case 1414449775:
                    C12094.m27906((C12094) this.f28110);
                    break;
                case -2000879063:
                case 1203594398:
                    if (!C0917.f81868) {
                        iM55979 = C0873.m55680("᩵ۢ") ^ i5;
                        i = ((iM55979 ^ i6) * (-7761)) ^ (-194369228);
                        i2 = 1895893789;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        iM559710 = (i6 - C0873.m55680("ᩴܰ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM559710 ^ i5) * 27213) ^ 1455872744;
                        i4 = -531943111;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        intent = null;
                    }
                    break;
                case -1874467363:
                case -1574211866:
                    main = (Main) this.f28110;
                    if (C0967.f81910 < 0) {
                        if (C1044.m56286() <= 0) {
                            iM559710 = (i6 - C0873.m55680("ᩴܰ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i3 = ((iM559710 ^ i5) * 27213) ^ 1455872744;
                            i4 = -531943111;
                            i8 = iM559710 ^ i4;
                            i7 = i3;
                            intent = null;
                            break;
                        } else {
                            intent = new Intent(main, (Class<?>) ActivityC23336.class);
                            sArr2 = f82082;
                            if (C0906.f81862 < 0) {
                                iM55979 = (C0873.m55680("ܿ۬") ^ i5) * (-65);
                                i = ((iM55979 ^ i6) * 13175) ^ (-1958331597);
                                i2 = 1803465262;
                                i8 = iM55979 ^ i2;
                                i7 = i;
                                break;
                            }
                        }
                    }
                    iM559710 = C0946.m55979("۠֫") ^ i6;
                    i3 = ((iM559710 ^ i5) * (-21913)) ^ 1646142154;
                    i4 = 726127559;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    intent = null;
                    break;
                case -1771595466:
                case 868398885:
                    C0912.m55833();
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("᩵ۢ") ^ i5;
                        i = ((iM55979 ^ i6) * (-7761)) ^ (-194369228);
                        i2 = 1895893789;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        iM559710 = C0946.m55979("۠֫") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-21913)) ^ 1646142154;
                        i4 = 726127559;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        intent = null;
                    }
                    break;
                case -1217943817:
                case 689649445:
                    sArr = f82082;
                    if (!AbstractC0942.m55971()) {
                        iM55979 = C0873.m55680("֫۠") ^ i6;
                        i = ((iM55979 ^ i5) * 7263) ^ (-585520367);
                        i2 = 532372235;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        iM559710 = C0946.m55979("۠֫") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-21913)) ^ 1646142154;
                        i4 = 726127559;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        intent = null;
                    }
                    break;
                case -1217515974:
                case -611126053:
                    i10 = 50509449;
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0946.m55979("ܳۚ") ^ i5) * 119;
                        i = ((iM55979 ^ i6) * 25091) ^ 153028729;
                        i2 = 1093329159;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ۜۡ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i5) * (-12167)) ^ (-1686530518);
                        i2 = 886940404;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1063732323:
                case -311984434:
                    c = 0;
                    if (!C0882.f81846) {
                        iM55979 = (C0873.m55680("۫ۢ") + i5) * (-125);
                        i = ((iM55979 ^ i6) * 1735) ^ 753591054;
                        i2 = 95116219;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        iM559710 = (i6 - C0873.m55680("ᩴܰ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM559710 ^ i5) * 27213) ^ 1455872744;
                        i4 = -531943111;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        intent = null;
                    }
                    break;
                case -980064266:
                case 1400596600:
                    if (C1229.f82066 >= 0) {
                        iM559710 = C0946.m55979("۠֫") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-21913)) ^ 1646142154;
                        i4 = 726127559;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        intent = null;
                    } else {
                        iM55979 = C0873.m55680("֡ۨ") ^ i5;
                        i = ((iM55979 ^ i6) * (-5275)) ^ 14738058;
                        i2 = -555790201;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case -871859279:
                case 434293797:
                    intent.putExtra(strM55947, true);
                    C1044.m56284(main, intent);
                    break;
                case -733776400:
                case 423214295:
                    int i14 = s + s2;
                    if ((i14 * i14) - i11 > 0) {
                        iM55979 = C0873.m55680("᩵֡") ^ i5;
                        i = ((iM55979 ^ i6) * (-31145)) ^ (-1260709551);
                        i2 = 182183725;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ۡۧ")) * 89;
                        i = ((iM55979 ^ i5) * (-9563)) ^ 1443351238;
                        i2 = -489892022;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -177520190:
                case 262788:
                    if (!C0917.m55854()) {
                        iM559710 = (i6 - C0873.m55680("ᩴܰ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM559710 ^ i5) * 27213) ^ 1455872744;
                        i4 = -531943111;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        intent = null;
                    } else {
                        iM55979 = (C0873.m55680("ܶ᩵") + i5) * 87;
                        i = ((iM55979 ^ i6) * (-7993)) ^ (-1467550884);
                        i2 = -1635174876;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case -56181368:
                case 2134216894:
                    C0955.m56025();
                    C0946.m55980();
                    break;
                case 146197529:
                case 681674377:
                    i12 = 58684;
                    iM55979 = C0873.m55680("۠᩺") ^ i5;
                    i = ((iM55979 ^ i6) * 19015) ^ (-1008072787);
                    i2 = 725547951;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 155667549:
                case 1126766631:
                    switch (this.f28109) {
                        case 0:
                            iM55979 = (C0946.m55979("۠֨") + i6) * 83;
                            i = ((iM55979 ^ i5) * 423) ^ (-450946156);
                            i2 = -922864628;
                            break;
                        default:
                            iM55979 = (C0873.m55680("۠ۗ") ^ i6) * (-7);
                            i = ((iM55979 ^ i5) * (-12895)) ^ (-1090160655);
                            i2 = -1303784389;
                            break;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 338367406:
                case 1416164597:
                    strM55947 = ViewOnClickListenerC0939.m55947(sArr2, 1, 10, i12);
                    if (C0890.f81849 == 0) {
                        iM55979 = (i6 - C0946.m55979("ۘ֫")) * (-35);
                        i = ((iM55979 ^ i5) * (-28663)) ^ (-1055755700);
                        i2 = 1739311445;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        iM559710 = (i6 - C0873.m55680("ᩴܰ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM559710 ^ i5) * 27213) ^ 1455872744;
                        i4 = -531943111;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        intent = null;
                    }
                    break;
                case 544412614:
                case 2008322142:
                    int i15 = i9 + i10;
                    i11 = i15 + i15;
                    s2 = 7107;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("֡ۨ") ^ i5;
                        i = ((iM55979 ^ i6) * (-5275)) ^ 14738058;
                        i2 = -555790201;
                    } else {
                        iM55979 = C0946.m55979("᩷᩸") ^ i5;
                        i = ((iM55979 ^ i6) * (-14073)) ^ 233428193;
                        i2 = -164011143;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 550888584:
                case 1882229407:
                    i12 = 41509;
                    iM55979 = C0873.m55680("۠᩺") ^ i5;
                    i = ((iM55979 ^ i6) * 19015) ^ (-1008072787);
                    i2 = 725547951;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case 804821510:
                case 1829114298:
                    s = sArr[c];
                    i9 = s * s;
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("֡ۨ") ^ i5;
                        i = ((iM55979 ^ i6) * (-5275)) ^ 14738058;
                        i2 = -555790201;
                    } else {
                        iM55979 = C0946.m55979("ܳ᩻") ^ i6;
                        i = ((iM55979 ^ i5) * C0719o.a.f2897c) ^ (-881734232);
                        i2 = 78732144;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                default:
                    C1017.m56187();
                    C1229.m56410();
                    iM55979 = C0873.m55680("֡ۨ") ^ i5;
                    i = ((iM55979 ^ i6) * (-5275)) ^ 14738058;
                    i2 = -555790201;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }
}
