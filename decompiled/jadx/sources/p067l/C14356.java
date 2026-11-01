package p067l;

import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Map;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۫᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14356 implements InterfaceC6386 {

    /* JADX INFO: renamed from: ᩸۫ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f82179 = {4004, -5774, -5783, -5803, -5774, -5772, -5777, -5784, -5791, -5842, -5848, -5848, -5848, -5841, 5973, 22044, 22027, 22042, 22076, 22027, 22042, 22043, 22044, 22016, 22061, 22017, 22026, 22027, 22100, 22094, 22031, 22029, 22029, 22027, 22045, 22045, 22065, 22042, 22017, 22021, 22027, 22016};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC7928 f41043;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C22681 f41044;

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x019d A[PHI: r9 r13
      0x019d: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:47:0x019b, B:27:0x00c9, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:47:0x019b, B:27:0x00c9, B:15:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f0 A[PHI: r5 r6 r12
      0x01f0: PHI (r5v4 short) = (r5v3 short), (r5v2 short) binds: [B:55:0x01ee, B:31:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:55:0x01ee, B:31:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:55:0x01ee, B:31:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x023f A[PHI: r18
      0x023f: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:63:0x023d, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x026f A[PHI: r2 r4 r7 r8 r11
      0x026f: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:67:0x026d, B:59:0x0220, B:51:0x01cf, B:35:0x0108, B:17:0x007d, B:15:0x0079, B:12:0x0073, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:67:0x026d, B:59:0x0220, B:51:0x01cf, B:35:0x0108, B:17:0x007d, B:15:0x0079, B:12:0x0073, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:67:0x026d, B:59:0x0220, B:51:0x01cf, B:35:0x0108, B:17:0x007d, B:15:0x0079, B:12:0x0073, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:67:0x026d, B:59:0x0220, B:51:0x01cf, B:35:0x0108, B:17:0x007d, B:15:0x0079, B:12:0x0073, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r11v4 short[]) = 
      (r11v2 short[])
      (r11v2 short[])
      (r11v2 short[])
      (r11v3 short[])
      (r11v2 short[])
      (r11v2 short[])
      (r11v2 short[])
      (r11v2 short[])
     binds: [B:67:0x026d, B:59:0x0220, B:51:0x01cf, B:35:0x0108, B:17:0x007d, B:15:0x0079, B:12:0x0073, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5757(C21139 c21139) {
        int iM55680;
        int i;
        int i2;
        int i3 = C0989.f81920;
        int i4 = C1964.f83032;
        int iM55979 = (C0946.m55979("ۤ᩹") + i3) * (-59);
        int i5 = ((iM55979 ^ i4) * (-5983)) ^ 1749125898;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ (-940457312);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -941582702;
        String strM55591 = null;
        C22681 c22681 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 13407) >> 31));
            switch (i13) {
                case -1952849292:
                case 668940578:
                    i12 = 13;
                    if (C0882.f81846) {
                        iM55680 = C0873.m55680("ۧᩳ") ^ i4;
                        i = ((iM55680 ^ i3) * 19357) ^ (-625651572);
                        i2 = 440551226;
                    } else {
                        iM55680 = (C0873.m55680("ۨܺ") + i4) * 39;
                        i = ((iM55680 ^ i3) * 18565) ^ (-1987170281);
                        i2 = 437261152;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1660783898:
                case 423270253:
                    i7 = s * s2;
                    i8 = s * s;
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM55680 = C0873.m55680("ᩴ۬") ^ i3;
                        i = ((iM55680 ^ i4) * (-30691)) ^ 623657517;
                        i2 = -495130594;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1558644434:
                case 1959627960:
                    sArr = f82179;
                    if (C0866.m55645()) {
                        iM55680 = (C0873.m55680("᩹۫") + i3) * (-111);
                        i = ((iM55680 ^ i4) * 8579) ^ (-2083049041);
                        i2 = -2016158818;
                    } else {
                        iM55680 = C0873.m55680("ᩴܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 20623) ^ (-692147628);
                        i2 = -1338255220;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1501446100:
                case 1524381076:
                    if (C0877.f81843 < 0) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM55680 = C0873.m55680("ᩴܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 20623) ^ (-692147628);
                        i2 = -1338255220;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1471817505:
                case 129914542:
                    s = sArr[c];
                    s2 = 7014;
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("۠ۢ") ^ i4;
                        i = ((iM55680 ^ i3) * (-14223)) ^ 558535086;
                        i2 = 1866461045;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ᩴᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55680 ^ i3) * (-12777)) ^ (-1379962242);
                        i2 = 1870966825;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1288630414:
                case -1195221892:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM55680 = C0873.m55680("ۧᩳ") ^ i4;
                        i = ((iM55680 ^ i3) * 19357) ^ (-625651572);
                        i2 = 440551226;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1284415511:
                case 1194428668:
                    if (C1003.m56123() != 0) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM55680 = (C0873.m55680("֨ᩴ") ^ i4) * 75;
                        i = ((iM55680 ^ i3) * (-13895)) ^ 1478340820;
                        i2 = -1116717443;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1275906490:
                case 1658116276:
                    break;
                case -997437413:
                case 1296580419:
                    i10 = 59654;
                    iM55680 = (C0873.m55680("ۛ۠") ^ i3) * (-91);
                    i = ((iM55680 ^ i4) * (-27767)) ^ 1027322993;
                    i2 = -461952633;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -756796427:
                case 1383400915:
                    C0912.m55833();
                    break;
                case -692125338:
                case 1951279381:
                    i11 = 1;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("۠ۢ") ^ i4;
                        i = ((iM55680 ^ i3) * (-14223)) ^ 558535086;
                        i2 = 1866461045;
                    } else {
                        iM55680 = C0946.m55979("ۧ᩺") ^ i4;
                        i = ((iM55680 ^ i3) * (-7559)) ^ (-731765223);
                        i2 = 305975218;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -301996574:
                case 2000658321:
                    i10 = 17394;
                    iM55680 = (C0873.m55680("ۛ۠") ^ i3) * (-91);
                    i = ((iM55680 ^ i4) * (-27767)) ^ 1027322993;
                    i2 = -461952633;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -29793900:
                case 1140749253:
                    strM55591 = C0845.m55591(c21139);
                    sArr2 = f82179;
                    if (C0947.f81895) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM55680 = C0946.m55979("᩺ۜ") ^ i3;
                        i = ((iM55680 ^ i4) * 31611) ^ (-503833183);
                        i2 = -2123380704;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 109351975:
                case 1159346521:
                    AbstractC0942.m55971();
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM55680 = C0946.m55979("ۤܰ") ^ i3;
                        i = ((iM55680 ^ i4) * (-28885)) ^ 619361766;
                        i2 = 1175652649;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 391972977:
                case 1215510400:
                    i9 = 12299049;
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("᩶۟") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55680 ^ i3) * (-8151)) ^ (-1263630015);
                        i2 = -1933560503;
                    } else {
                        iM55680 = C0873.m55680("ۧᩳ") ^ i4;
                        i = ((iM55680 ^ i3) * 19357) ^ (-625651572);
                        i2 = 440551226;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 436900596:
                case 1360281109:
                    c22681.m50792(strM55591, false);
                    break;
                case 799125941:
                case 997716865:
                    C0854.m55595();
                    C1036.m56257();
                    iM55680 = C0946.m55979("᩹᩶") ^ i3;
                    i = ((iM55680 ^ i4) * (-31837)) ^ 964206845;
                    i2 = -1487630247;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 799528819:
                case 1478761968:
                    C0947.m55988(strM55591, C1404.m56462(sArr2, i11, i12, i10));
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("ۤܰ") ^ i3;
                        i = ((iM55680 ^ i4) * (-28885)) ^ 619361766;
                        i2 = 1175652649;
                    } else {
                        iM55680 = (C0873.m55680("ۡᩳ") ^ i3) * 73;
                        i = ((iM55680 ^ i4) * (-28825)) ^ (-1427682909);
                        i2 = -53758599;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 867155879:
                case 1345659270:
                    c = 0;
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM55680 = C0873.m55680("֫ᩴ") ^ i3;
                        i = ((iM55680 ^ i4) * 7851) ^ (-832350098);
                        i2 = 1567082593;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 949905277:
                case 1349002093:
                    c22681 = this.f41044;
                    if (c22681.f71551.m33960()) {
                        int iM559710 = (C0946.m55979("᩻ۗ") + i4) * (-89);
                        i5 = ((iM559710 ^ i3) * 14633) ^ 305127340;
                        i6 = iM559710 ^ 539364877;
                    } else {
                        iM55680 = (C0873.m55680("۬ۜ") + i4) * (-43);
                        i = ((iM55680 ^ i3) * 23343) ^ (-228461127);
                        i2 = 209831835;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    }
                    break;
                default:
                    if (i7 - (i8 + i9) > 0) {
                        iM55680 = (i4 - C0873.m55680("ۜܳ")) * 59;
                        i = ((iM55680 ^ i3) * 13889) ^ (-1892584864);
                        i2 = 471888981;
                    } else {
                        iM55680 = (C0873.m55680("ܳ۟") ^ i3) * (-29);
                        i = ((iM55680 ^ i4) * (-31499)) ^ (-1134810910);
                        i2 = 1985420594;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C14356(C22681 c22681, ViewOnClickListenerC7928 viewOnClickListenerC7928) {
        int i = 1713585506;
        int i2 = C1053.f81965;
        int i3 = C1046.f81962;
        int iM55680 = C0873.m55680("ܰܿ") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-4037)) ^ (-921774194);
        int i5 = -916018260;
        while (true) {
            i = ((((i ^ i3) * (-8393)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2057684376:
                case -1873183798:
                    C0866.m55645();
                    C1124.m56367();
                    iM55680 = (C0873.m55680("ܺ֫") + i3) * (-7);
                    i4 = ((iM55680 ^ i2) * 26413) ^ 68769974;
                    i5 = -267496916;
                    break;
                case -1685407627:
                case 205617670:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("ۘᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4489) ^ (-473308815);
                        i5 = -1399311482;
                    } else {
                        iM55680 = C0873.m55680("ܰۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-15713)) ^ (-116940075);
                        i5 = 463646949;
                    }
                    break;
                case -1266317953:
                case -95336518:
                    C1964.m56597();
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("ܺ֫") + i3) * (-7);
                        i4 = ((iM55680 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    } else {
                        iM55680 = C0873.m55680("ܽ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-13895)) ^ 1035023054;
                        i5 = -1543129695;
                    }
                    break;
                case -1148196922:
                case 1298911208:
                    if (C1048.f81963) {
                        iM55680 = (C0946.m55979("ۗ᩸") ^ i2) * (-123);
                        i4 = ((iM55680 ^ i3) * 4753) ^ (-1209407618);
                        i5 = 298156160;
                    } else {
                        iM55680 = C0873.m55680("ۢۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4987)) ^ (-1048046875);
                        i5 = 45017923;
                    }
                    break;
                case -961965747:
                case 1674648889:
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("ۘᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4489) ^ (-473308815);
                        i5 = -1399311482;
                    } else {
                        iM55680 = C0946.m55979("۠ۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18369) ^ (-1872952931);
                        i5 = 733285878;
                    }
                    break;
                case -667310370:
                case -254039605:
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0873.m55680("ܺ֫") + i3) * (-7);
                        i4 = ((iM55680 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    } else {
                        iM55680 = C0873.m55680("֨ۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3455) ^ 932355782;
                        i5 = 1832929156;
                    }
                    break;
                case -46504821:
                case 1462110085:
                    this.f41044 = c22681;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("ܺ֫") + i3) * (-7);
                        i4 = ((iM55680 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    } else {
                        iM55680 = C0946.m55979("ᩳܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11993)) ^ 587525472;
                        i5 = 1823945254;
                    }
                    break;
                case 333478934:
                case 494687164:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0873.m55680("ܽ֫") + i2) * (-51);
                        i4 = ((iM55680 ^ i3) * 13931) ^ 882977125;
                        i5 = -1987846638;
                    } else {
                        iM55680 = (C0873.m55680("᩻ܳ") ^ i3) * 33;
                        i4 = ((iM55680 ^ i2) * 24805) ^ 493480757;
                        i5 = 702916495;
                    }
                    break;
                case 350123194:
                case 418784812:
                    C0892.m55749();
                    if (!C0955.f81898) {
                        iM55680 = C0873.m55680("ۢۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4987)) ^ (-1048046875);
                        i5 = 45017923;
                    } else {
                        iM55680 = C0873.m55680("ۘᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4489) ^ (-473308815);
                        i5 = -1399311482;
                    }
                    break;
                case 363930774:
                case 435869968:
                    if (C0861.m55626()) {
                        iM55680 = C0873.m55680("ۢۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4987)) ^ (-1048046875);
                        i5 = 45017923;
                    } else {
                        iM55680 = C0873.m55680("ۢۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29297)) ^ 1737090100;
                        i5 = 941461352;
                    }
                    break;
                case 397978661:
                case 1495062659:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (C0873.m55680("ܺ֫") + i3) * (-7);
                        i4 = ((iM55680 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    } else {
                        iM55680 = (C0873.m55680("ۚۖ") + i3) * 91;
                        i4 = ((iM55680 ^ i2) * (-21923)) ^ (-1365342145);
                        i5 = -904422489;
                    }
                    break;
                case 535427289:
                case 1260598476:
                    if (C0927.f81875) {
                        iM55680 = (C0873.m55680("ܽ֫") + i2) * (-51);
                        i4 = ((iM55680 ^ i3) * 13931) ^ 882977125;
                        i5 = -1987846638;
                    } else {
                        iM55680 = C0873.m55680("ۗ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 24549) ^ (-1036202785);
                        i5 = 187922987;
                    }
                    break;
                case 921837140:
                case 2106804929:
                    C0967.m56074();
                    if (C0946.f81894 == 0) {
                        iM55680 = C0873.m55680("ۘᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4489) ^ (-473308815);
                        i5 = -1399311482;
                    } else {
                        iM55680 = (C0873.m55680("ܺ֫") + i3) * (-7);
                        i4 = ((iM55680 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    }
                    break;
                case 981308321:
                case 2024787816:
                    if (C1024.f81946) {
                        iM55680 = (C0873.m55680("ܺ֫") + i3) * (-7);
                        i4 = ((iM55680 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ܽᩴ")) * 61;
                        i4 = ((iM55680 ^ i3) * 2925) ^ 57870263;
                        i5 = -1990090618;
                    }
                    break;
                case 1206044146:
                case 1350053812:
                    C1044.m56286();
                    C1194.m56396();
                    throw new RuntimeException();
                default:
                    this.f41043 = viewOnClickListenerC7928;
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0450 A[PHI: r16 r25 r26
      0x0450: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:126:0x044e, B:110:0x0390, B:7:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r25v30 java.lang.String) = (r25v6 java.lang.String), (r25v10 java.lang.String), (r25v31 java.lang.String) binds: [B:126:0x044e, B:110:0x0390, B:7:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0450: PHI (r26v6 int) = (r26v3 int), (r26v4 int), (r26v3 int) binds: [B:126:0x044e, B:110:0x0390, B:7:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x0480 A[PHI: r10 r11 r12 r25
      0x0480: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v4 short[]) binds: [B:18:0x00a9, B:130:0x047e, B:99:0x0318] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:18:0x00a9, B:130:0x047e, B:99:0x0318] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:18:0x00a9, B:130:0x047e, B:99:0x0318] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r25v15 java.lang.String) = (r25v2 java.lang.String), (r25v5 java.lang.String), (r25v16 java.lang.String) binds: [B:18:0x00a9, B:130:0x047e, B:99:0x0318] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006a, code lost:
    
        if (p067l.C1964.f83032 > 0) goto L7;
     */
    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5758(JSONObject jSONObject) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        short[] sArr;
        int i5;
        int i6;
        int iM55682;
        int i7;
        int i8;
        short[] sArr2;
        int i9;
        int i10;
        int iM55683;
        int i11;
        int i12;
        int i13 = C0863.f81833;
        int i14 = C0866.f81837;
        int iM55979 = C0946.m55979("ۙ᩵") ^ i13;
        int i15 = ((iM55979 ^ i14) * (-1523)) ^ 277009346;
        final C22681 c22681 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i16 = iM55979 ^ (-877932616);
        boolean z = false;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 1283039654;
        int i24 = 0;
        String strM56403 = null;
        short[] sArr5 = null;
        String strM55717 = null;
        JSONException jSONException = null;
        int iM56279 = 0;
        while (true) {
            i23 = i16 ^ (i15 & (((i23 ^ i14) * (-18199)) >> 31));
            switch (i23) {
                case -2094361096:
                case 211513439:
                    if (C1964.f83032 > 0) {
                        strM56403 = strM56403;
                        iM55681 = C0946.m55979("᩶۟") ^ i14;
                        i3 = ((iM55681 ^ i13) * 2013) ^ (-1967983325);
                        i4 = 923168036;
                        i8 = iM55681 ^ i4;
                        String str = strM56403;
                        i16 = i8;
                        i15 = i3;
                        strM56403 = str;
                    } else {
                        sArr2 = sArr3;
                        i9 = i18;
                        i10 = i19;
                        iM55683 = C0946.m55979("ۗܰ") ^ i14;
                        i11 = ((iM55683 ^ i13) * (-6351)) ^ (-831201630);
                        i12 = -1300702790;
                        i16 = iM55683 ^ i12;
                        i15 = i11;
                        sArr3 = sArr2;
                        i18 = i9;
                        i19 = i10;
                    }
                    break;
                case -1872284797:
                case -409377485:
                    strM56403 = strM56403;
                    sArr = sArr3;
                    i5 = i18;
                    i6 = i19;
                    if (c22681.f71551.m33960()) {
                        iM55682 = C0946.m55979("ᩳ᩹") ^ i13;
                        i3 = ((iM55682 ^ i14) * (-31041)) ^ (-468008716);
                        i7 = -1325973791;
                    } else {
                        iM55682 = (C0946.m55979("ۚ᩺") + i14) * (-69);
                        i3 = ((iM55682 ^ i13) * 25029) ^ (-315147052);
                        i7 = 1647303634;
                    }
                    i8 = iM55682 ^ i7;
                    sArr3 = sArr;
                    i18 = i5;
                    i19 = i6;
                    String str2 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str2;
                    break;
                case -1871471902:
                case -929789714:
                    strM56403 = strM56403;
                    sArr = sArr3;
                    i5 = i18;
                    i6 = i19;
                    if (iM56279 != 0) {
                        iM55682 = C0873.m55680("᩹ۨ") ^ i14;
                        i3 = ((iM55682 ^ i13) * 22131) ^ 1312518858;
                        i7 = -751323742;
                    } else {
                        iM55682 = (C0946.m55979("᩹᩸") + i13) * (-91);
                        i3 = ((iM55682 ^ i14) * (-29045)) ^ 1671219177;
                        i7 = 102100989;
                    }
                    i8 = iM55682 ^ i7;
                    sArr3 = sArr;
                    i18 = i5;
                    i19 = i6;
                    String str3 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str3;
                    break;
                case -1857819080:
                case -75626757:
                case 995133860:
                case 1189947014:
                    break;
                case -1785369890:
                case 1965188900:
                    if (C1028.f81950 > 0) {
                        iM55680 = (C0873.m55680("ۜۧ") + i13) * 9;
                        i = ((iM55680 ^ i14) * (-19165)) ^ (-766475766);
                        i2 = -321494349;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    } else {
                        strM56403 = strM56403;
                        iM55681 = (C0946.m55979("ۘۚ") ^ i13) * (-5);
                        i3 = ((iM55681 ^ i14) * (-7679)) ^ (-739457860);
                        i4 = -1159669886;
                        i8 = iM55681 ^ i4;
                        String str4 = strM56403;
                        i16 = i8;
                        i15 = i3;
                        strM56403 = str4;
                    }
                    break;
                case -1751091040:
                case 642734854:
                    strM56403 = strM56403;
                    c = 14;
                    if (C0937.f81884) {
                        iM55681 = C0946.m55979("۬ۖ") ^ i13;
                        i3 = ((iM55681 ^ i14) * 27989) ^ 541526309;
                        i4 = 833555022;
                    } else {
                        iM55681 = C0946.m55979("᩶۟") ^ i14;
                        i3 = ((iM55681 ^ i13) * 2013) ^ (-1967983325);
                        i4 = 923168036;
                    }
                    i8 = iM55681 ^ i4;
                    String str5 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str5;
                    break;
                case -1589148264:
                case -1373282554:
                    RunnableC0871.m55672();
                    if (C0898.f81858 <= 0) {
                        iM55680 = (i14 - C0873.m55680("᩹ۙ")) * (-77);
                        i = ((iM55680 ^ i13) * 5155) ^ (-1178091482);
                        i2 = -1044966667;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    } else {
                        sArr2 = sArr3;
                        i9 = i18;
                        i10 = i19;
                        iM55683 = C0946.m55979("ۗܰ") ^ i14;
                        i11 = ((iM55683 ^ i13) * (-6351)) ^ (-831201630);
                        i12 = -1300702790;
                        i16 = iM55683 ^ i12;
                        i15 = i11;
                        sArr3 = sArr2;
                        i18 = i9;
                        i19 = i10;
                    }
                    break;
                case -1552011409:
                case 628715062:
                    strM56403 = strM56403;
                    sArr3 = f82179;
                    i18 = 15;
                    i19 = 3;
                    if (C1048.f81963) {
                        iM55681 = C0873.m55680("᩵ᩴ") ^ i14;
                        i3 = ((iM55681 ^ i13) * (-21015)) ^ (-861499399);
                        i4 = -255261596;
                    } else {
                        iM55681 = (C0946.m55979("ۘۚ") ^ i13) * (-5);
                        i3 = ((iM55681 ^ i14) * (-7679)) ^ (-739457860);
                        i4 = -1159669886;
                    }
                    i8 = iM55681 ^ i4;
                    String str6 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str6;
                    break;
                case -1529836890:
                case 1611421612:
                    if (C1024.m56209() >= 0) {
                        strM56403 = strM56403;
                        iM55681 = C0946.m55979("۬᩺") ^ i14;
                        i3 = ((iM55681 ^ i13) * 22461) ^ (-877483454);
                        i4 = 1896282123;
                        i8 = iM55681 ^ i4;
                        String str7 = strM56403;
                        i16 = i8;
                        i15 = i3;
                        strM56403 = str7;
                    }
                    strM56403 = strM56403;
                    iM55681 = C0873.m55680("᩵ۛ") ^ i13;
                    i3 = ((iM55681 ^ i14) * 24635) ^ (-576579818);
                    i4 = 1841962787;
                    i8 = iM55681 ^ i4;
                    String str8 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str8;
                    break;
                case -1474350202:
                case 1798206702:
                    break;
                case -1400052383:
                case -750755323:
                    strM56403 = strM56403;
                    if (C1194.f82045 != 0) {
                        iM55681 = (C0946.m55979("ۘۚ") ^ i13) * (-5);
                        i3 = ((iM55681 ^ i14) * (-7679)) ^ (-739457860);
                        i4 = -1159669886;
                    } else {
                        iM55681 = C0873.m55680("ۜܳ") ^ i13;
                        i3 = ((iM55681 ^ i14) * 26495) ^ (-1139331065);
                        i4 = -1602744243;
                    }
                    i8 = iM55681 ^ i4;
                    String str9 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str9;
                    break;
                case -1332229071:
                case 1790319240:
                    strM56403 = strM56403;
                    i24 = 92313664;
                    if (C1012.f81938 >= 0) {
                        iM55681 = (i13 - C0873.m55680("ܽۨ")) * 3;
                        i3 = ((iM55681 ^ i14) * (-10855)) ^ 680066063;
                        i4 = -98283392;
                    } else {
                        iM55681 = C0873.m55680("ۧܺ") ^ i13;
                        i3 = ((iM55681 ^ i14) * 18089) ^ 1727051764;
                        i4 = -470112640;
                    }
                    i8 = iM55681 ^ i4;
                    String str10 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str10;
                    break;
                case -1332001886:
                case -1294239212:
                    C1036.m56257();
                    iM55680 = C0946.m55979("ۤ۬") ^ i14;
                    i = ((iM55680 ^ i13) * 30081) ^ 1107937540;
                    i2 = 139029993;
                    i16 = iM55680 ^ i2;
                    i15 = i;
                    break;
                case -1198290789:
                case -481102281:
                    strM56403 = strM56403;
                    sArr5 = f82179;
                    if (C1404.f82149 >= 0) {
                        iM55681 = (i13 - C0873.m55680("ܽۨ")) * 3;
                        i3 = ((iM55681 ^ i14) * (-10855)) ^ 680066063;
                        i4 = -98283392;
                    } else {
                        iM55681 = C0873.m55680("ܳ᩶") ^ i14;
                        i3 = ((iM55681 ^ i13) * (-14641)) ^ (-1271529591);
                        i4 = 1216599808;
                    }
                    i8 = iM55681 ^ i4;
                    String str11 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str11;
                    break;
                case -1189694205:
                case 3709127:
                    strM56403 = strM56403;
                    sArr = sArr3;
                    i5 = i18;
                    i6 = i19;
                    z = false;
                    iM55682 = C0873.m55680("ۜ᩹") ^ i14;
                    i3 = ((iM55682 ^ i13) * 29353) ^ 12673991;
                    i7 = -1442085527;
                    i8 = iM55682 ^ i7;
                    sArr3 = sArr;
                    i18 = i5;
                    i19 = i6;
                    String str12 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str12;
                    break;
                case -1188240280:
                case 891707623:
                    strM56403 = strM56403;
                    sArr = sArr3;
                    i5 = i18;
                    i6 = i19;
                    sArr4 = f82179;
                    i20 = 18;
                    if (C0949.f81897 < 0) {
                        iM55682 = (C0873.m55680("ܶ᩵") + i13) * 57;
                        i3 = ((iM55682 ^ i14) * 29995) ^ (-1548403400);
                        i7 = -1614884154;
                        i8 = iM55682 ^ i7;
                        sArr3 = sArr;
                        i18 = i5;
                        i19 = i6;
                        String str13 = strM56403;
                        i16 = i8;
                        i15 = i3;
                        strM56403 = str13;
                    } else {
                        sArr3 = sArr;
                        i18 = i5;
                        i19 = i6;
                        iM55681 = C0873.m55680("᩵ۛ") ^ i13;
                        i3 = ((iM55681 ^ i14) * 24635) ^ (-576579818);
                        i4 = 1841962787;
                        i8 = iM55681 ^ i4;
                        String str14 = strM56403;
                        i16 = i8;
                        i15 = i3;
                        strM56403 = str14;
                    }
                    break;
                case -878250715:
                case 1361289627:
                    i17 = 56939;
                    iM55681 = C0946.m55979("ۡۤ") ^ i13;
                    i3 = ((iM55681 ^ i14) * 30703) ^ 1609915798;
                    i4 = -1147817907;
                    i8 = iM55681 ^ i4;
                    String str15 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str15;
                    break;
                case -692002499:
                case 965136499:
                    if (C1124.f82007 >= 0) {
                        strM56403 = strM56403;
                        iM55681 = (i13 - C0873.m55680("ܽۨ")) * 3;
                        i3 = ((iM55681 ^ i14) * (-10855)) ^ 680066063;
                        i4 = -98283392;
                        i8 = iM55681 ^ i4;
                        String str16 = strM56403;
                        i16 = i8;
                        i15 = i3;
                        strM56403 = str16;
                    } else {
                        iM55680 = C0946.m55979("ۤ۬") ^ i14;
                        i = ((iM55680 ^ i13) * 30081) ^ 1107937540;
                        i2 = 139029993;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    }
                    break;
                case -680859806:
                case -450195732:
                    C0906.m55809();
                    RunnableC0871.m55672();
                    break;
                case -605201793:
                case 321341382:
                    sArr2 = sArr3;
                    i9 = i18;
                    i10 = i19;
                    strM56403 = C1229.m56403(sArr4, i20, 12, i17);
                    c22681 = this.f41044;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55683 = C0946.m55979("ۗܰ") ^ i14;
                        i11 = ((iM55683 ^ i13) * (-6351)) ^ (-831201630);
                        i12 = -1300702790;
                    } else {
                        iM55683 = C0873.m55680("ۢۖ") ^ i13;
                        i11 = ((iM55683 ^ i14) * (-18543)) ^ (-1868052698);
                        i12 = -9242106;
                    }
                    i16 = iM55683 ^ i12;
                    i15 = i11;
                    sArr3 = sArr2;
                    i18 = i9;
                    i19 = i10;
                    break;
                case -604156024:
                case 692360229:
                    strM56403 = strM56403;
                    s = sArr5[c];
                    s2 = 19216;
                    if (C0927.f81875) {
                        iM55681 = (i13 - C0946.m55979("ᩳۨ")) * 85;
                        i3 = ((iM55681 ^ i14) * (-30685)) ^ (-1229721417);
                        i4 = 621207856;
                    } else {
                        iM55681 = (C0946.m55979("᩸֡") ^ i14) * 25;
                        i3 = ((iM55681 ^ i13) * 3859) ^ (-144735525);
                        i4 = 634735422;
                    }
                    i8 = iM55681 ^ i4;
                    String str17 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str17;
                    break;
                case -413066754:
                case -268444892:
                    strM56403 = strM56403;
                    i21 = s * s2;
                    i22 = s * s;
                    if (C1046.f81962 <= 0) {
                        iM55681 = C0946.m55979("۬᩺") ^ i14;
                        i3 = ((iM55681 ^ i13) * 22461) ^ (-877483454);
                        i4 = 1896282123;
                    } else {
                        iM55681 = (i14 - C0946.m55979("᩹ۖ")) * (-91);
                        i3 = ((iM55681 ^ i13) * (-30713)) ^ (-798103776);
                        i4 = -987723562;
                    }
                    i8 = iM55681 ^ i4;
                    String str18 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str18;
                    break;
                case -400162802:
                case 1782512946:
                    if (!C0917.f81868) {
                        sArr2 = sArr3;
                        i9 = i18;
                        i10 = i19;
                        iM55683 = C0946.m55979("ۗܰ") ^ i14;
                        i11 = ((iM55683 ^ i13) * (-6351)) ^ (-831201630);
                        i12 = -1300702790;
                        i16 = iM55683 ^ i12;
                        i15 = i11;
                        sArr3 = sArr2;
                        i18 = i9;
                        i19 = i10;
                    } else {
                        iM55680 = C0946.m55979("ۤ۬") ^ i14;
                        i = ((iM55680 ^ i13) * 30081) ^ 1107937540;
                        i2 = 139029993;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    }
                    break;
                case -82757454:
                case 1470628127:
                    strM56403 = strM56403;
                    if (i21 - (i22 + i24) <= 0) {
                        iM55681 = C0873.m55680("᩻ۤ") ^ i13;
                        i3 = ((iM55681 ^ i14) * 2455) ^ (-1001088173);
                        i4 = 1597308682;
                    } else {
                        iM55681 = (i14 - C0946.m55979("ۢۜ")) * (-35);
                        i3 = ((iM55681 ^ i13) * 26589) ^ 1209969482;
                        i4 = 795539486;
                    }
                    i8 = iM55681 ^ i4;
                    String str19 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str19;
                    break;
                case -81096328:
                case 1178009681:
                    c22681.m50792(C0863.m55639(jSONException), z);
                    break;
                case 40123497:
                case 1834701952:
                    C0949.m56012();
                    if (C1028.f81950 <= 0) {
                        strM56403 = strM56403;
                        iM55681 = (C0946.m55979("ۘۚ") ^ i13) * (-5);
                        i3 = ((iM55681 ^ i14) * (-7679)) ^ (-739457860);
                        i4 = -1159669886;
                        i8 = iM55681 ^ i4;
                        String str110 = strM56403;
                        i16 = i8;
                        i15 = i3;
                        strM56403 = str110;
                    } else {
                        iM55680 = C0946.m55979("ۤ۬") ^ i14;
                        i = ((iM55680 ^ i13) * 30081) ^ 1107937540;
                        i2 = 139029993;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    }
                    break;
                case 170781156:
                case 803806456:
                    strM56403 = strM56403;
                    strM55717 = C0882.m55717(sArr3, i18, i19, i17);
                    if (C1124.f82007 >= 0) {
                        iM55681 = C0873.m55680("᩵ۛ") ^ i13;
                        i3 = ((iM55681 ^ i14) * 24635) ^ (-576579818);
                        i4 = 1841962787;
                    } else {
                        iM55681 = C0873.m55680("۫۬") ^ i14;
                        i3 = ((iM55681 ^ i13) * (-29831)) ^ 643560260;
                        i4 = 1712287498;
                    }
                    i8 = iM55681 ^ i4;
                    String str111 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str111;
                    break;
                case 202889262:
                case 1137044915:
                    try {
                        int iM56152 = ServiceConnectionC1013.m56152(jSONObject, strM55717);
                        StringBuilder sb = new StringBuilder(strM56403);
                        C0845.m55589(sb, iM56152);
                        c22681.m50792(C0845.m55591(sb), z);
                        iM55680 = C0946.m55979("֨۫") ^ i14;
                        i = ((iM55680 ^ i13) * (-467)) ^ 1532033235;
                        i2 = -1714501946;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    } catch (JSONException e) {
                        jSONException = e;
                        strM56403 = strM56403;
                        sArr = sArr3;
                        i5 = i18;
                        i6 = i19;
                        iM55682 = (C0873.m55680("֨ܽ") + i14) * (-39);
                        i3 = ((iM55682 ^ i13) * (-3323)) ^ (-1736105196);
                        i7 = -89619040;
                        i8 = iM55682 ^ i7;
                        sArr3 = sArr;
                        i18 = i5;
                        i19 = i6;
                        String str112 = strM56403;
                        i16 = i8;
                        i15 = i3;
                        strM56403 = str112;
                    }
                    break;
                case 384283591:
                case 1965571191:
                    strM56403 = strM56403;
                    sArr = sArr3;
                    i5 = i18;
                    i6 = i19;
                    iM56279 = C1044.m56279(jSONObject, strM55717);
                    iM55682 = (i13 - C0946.m55979("ۚ֡")) * 95;
                    i3 = ((iM55682 ^ i14) * 20195) ^ 872564899;
                    i7 = -160924632;
                    i8 = iM55682 ^ i7;
                    sArr3 = sArr;
                    i18 = i5;
                    i19 = i6;
                    String str113 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str113;
                    break;
                case 623370589:
                case 1699327029:
                    try {
                        strM56403 = strM56403;
                        try {
                            try {
                                sArr = sArr3;
                                try {
                                    i5 = i18;
                                    try {
                                        i6 = i19;
                                        try {
                                            C0892.m55747(new Thread(new RunnableC20477(C1929.m56556(jSONObject, C1012.m56144(f82179, 30, 12, i17)), this.f41043, new InterfaceC11360() { // from class: l.۬᩵ۡ

                                                /* JADX INFO: renamed from: ᩴܰ۬, reason: not valid java name and contains not printable characters */
                                                private static final short[] f82192 = {6024, 1077, 1058, 1076, 1079, 1064, 1065, 1076, 1058, 22087, 26463, -28864, 1078, 1078, 1070, 1065, 1057, 1064, 1046, 1046, -25983, 22618, -29474, -24902, 27796, 26006};

                                                /* JADX WARN: Code duplicated, block: B:95:0x0541 A[PHI: r3 r7 r18 r19 r20 r21 r22 r23 r25 r26 r30
                                                  0x0541: PHI (r3v23 int) = (r3v3 int), (r3v9 int), (r3v10 int), (r3v24 int) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0541: PHI (r7v36 short[]) = (r7v14 short[]), (r7v20 short[]), (r7v21 short[]), (r7v37 short[]) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0541: PHI (r18v8 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0541: PHI (r19v8 char) = (r19v3 char), (r19v2 char), (r19v2 char), (r19v2 char) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0541: PHI (r20v8 java.lang.String) = (r20v2 java.lang.String), (r20v3 java.lang.String), (r20v2 java.lang.String), (r20v2 java.lang.String) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0541: PHI (r21v23 int) = (r21v3 int), (r21v9 int), (r21v10 int), (r21v24 int) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0541: PHI (r22v23 l.᩸ۚۡ) = (r22v3 l.᩸ۚۡ), (r22v9 l.᩸ۚۡ), (r22v10 l.᩸ۚۡ), (r22v24 l.᩸ۚۡ) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0541: PHI (r23v24 int) = (r23v3 int), (r23v9 int), (r23v10 int), (r23v25 int) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0541: PHI (r25v30 int) = (r25v3 int), (r25v9 int), (r25v11 int), (r25v31 int) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0541: PHI (r26v24 short[]) = (r26v3 short[]), (r26v9 short[]), (r26v10 short[]), (r26v25 short[]) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0541: PHI (r30v33 short[]) = (r30v11 short[]), (r30v17 short[]), (r30v18 short[]), (r30v34 short[]) binds: [B:94:0x053f, B:78:0x0438, B:70:0x036b, B:12:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
                                                /* JADX WARN: Code restructure failed: missing block: B:11:0x00b0, code lost:
                                                
                                                    if (p067l.C0955.m56025() != false) goto L12;
                                                 */
                                                /* JADX WARN: Code restructure failed: missing block: B:7:0x0080, code lost:
                                                
                                                    if (p067l.C1044.f81959 < 0) goto L8;
                                                 */
                                                @Override // p067l.InterfaceC11360
                                                /* JADX INFO: renamed from: ֫ */
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final void mo3843(C25065 c25065) throws Throwable {
                                                    int iM559710;
                                                    int i25;
                                                    int i26;
                                                    int i27;
                                                    int iM55684;
                                                    int i28;
                                                    int i29;
                                                    short[] sArr6;
                                                    int i30;
                                                    int i31;
                                                    short[] sArr7;
                                                    int i32;
                                                    String strM56233;
                                                    int i33 = 1566914764;
                                                    int i34 = C0967.f81910;
                                                    int i35 = C1003.f81929;
                                                    int iM559711 = C0946.m55979("ۜ᩵") ^ i34;
                                                    int i36 = ((iM559711 ^ i35) * (-13681)) ^ (-621770608);
                                                    int i37 = iM559711 ^ (-1034024523);
                                                    String str20 = null;
                                                    TextView textView = null;
                                                    short[] sArr8 = null;
                                                    short[] sArr9 = null;
                                                    int i38 = 0;
                                                    int i39 = 0;
                                                    short s3 = 0;
                                                    short s4 = 0;
                                                    char c2 = 0;
                                                    String strM55936 = null;
                                                    int i40 = 0;
                                                    int i41 = 0;
                                                    int i42 = 0;
                                                    boolean zContainsKey = false;
                                                    Map mapM53846 = null;
                                                    TextView textView2 = null;
                                                    short[] sArr10 = null;
                                                    ViewOnClickListenerC7928 viewOnClickListenerC7928 = null;
                                                    String strM55993 = null;
                                                    short[] sArr11 = null;
                                                    C22681 c22682 = null;
                                                    Throwable th = null;
                                                    String strM55667 = null;
                                                    short[] sArr12 = null;
                                                    int i43 = 0;
                                                    int iM55685 = 0;
                                                    while (true) {
                                                        i33 = i37 ^ (i36 & (((i33 ^ i35) * 4239) >> 31));
                                                        switch (i33) {
                                                            case -1922419504:
                                                            case -1287581000:
                                                                sArr10 = sArr10;
                                                                sArr8 = sArr8;
                                                                i42 = i42;
                                                                sArr9 = sArr9;
                                                                i40 = i40;
                                                                i43 = i43;
                                                                int i44 = i41;
                                                                c22682 = c22682;
                                                                i27 = i44;
                                                                strM55936 = RunnableC0938.m55936(f82192, 1, 8, i38);
                                                                if (C1028.m56247() >= 0) {
                                                                    iM55684 = (i34 - C0873.m55680("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                    i36 = ((iM55684 ^ i35) * 23137) ^ 1849741220;
                                                                    i28 = 1681341092;
                                                                } else {
                                                                    iM55684 = (C0873.m55680("۫۠") ^ i34) * (-31);
                                                                    i36 = ((iM55684 ^ i35) * (-5497)) ^ (-1416609521);
                                                                    i28 = 875489827;
                                                                }
                                                                i31 = iM55684 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr13 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr13;
                                                                C22681 c22683 = c22682;
                                                                i41 = i27;
                                                                c22682 = c22683;
                                                                break;
                                                            case -1760072620:
                                                            case -1441539217:
                                                                if (!C0892.f81851) {
                                                                    iM559710 = (C0946.m55979("ۖܿ") + i35) * (-125);
                                                                    i25 = ((iM559710 ^ i34) * (-4045)) ^ 1691722775;
                                                                    i26 = -1772640779;
                                                                    i37 = iM559710 ^ i26;
                                                                    i36 = i25;
                                                                } else {
                                                                    sArr10 = sArr10;
                                                                    sArr8 = sArr8;
                                                                    i42 = i42;
                                                                    sArr9 = sArr9;
                                                                    i40 = i40;
                                                                    i43 = i43;
                                                                    int i45 = i41;
                                                                    c22682 = c22682;
                                                                    i27 = i45;
                                                                    iM55684 = (i34 - C0873.m55680("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                    i36 = ((iM55684 ^ i35) * 23137) ^ 1849741220;
                                                                    i28 = 1681341092;
                                                                    i31 = iM55684 ^ i28;
                                                                    i43 = i43;
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr14 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr14;
                                                                    C22681 c22684 = c22682;
                                                                    i41 = i27;
                                                                    c22682 = c22684;
                                                                }
                                                                break;
                                                            case -1621620027:
                                                            case -1478690927:
                                                                RunnableC0938.m55928(textView, (CharSequence) mapM53846.get(str20));
                                                                iM559710 = (C0873.m55680("᩶ۛ") + i34) * (-31);
                                                                i25 = ((iM559710 ^ i35) * 31181) ^ 613416656;
                                                                i26 = -1378533490;
                                                                i37 = iM559710 ^ i26;
                                                                i36 = i25;
                                                                break;
                                                            case -1444823238:
                                                            case 221563275:
                                                                C1964.m56592(strM55993);
                                                                throw th;
                                                            case -1363351039:
                                                            case 92116901:
                                                                c22682.m50792(AbstractC0942.m55960(c25065, iM55685 ^ 2119326159), false);
                                                                return;
                                                            case -1313020017:
                                                            case 1065442841:
                                                                C0917.m55842(C0873.m55680(C0967.m56077(sArr12, i43, i39, i38)) ^ 2101406145);
                                                                return;
                                                            case -1291557695:
                                                            case -15244280:
                                                                strM55667 = RunnableC0871.m55667(f82192, 20, 3, i38);
                                                                if (C1053.f81965 > 0) {
                                                                    iM559710 = (C0946.m55979("᩻۠") + i34) * 65;
                                                                    i25 = ((iM559710 ^ i35) * 14529) ^ (-1592847795);
                                                                    i26 = 20497634;
                                                                    i37 = iM559710 ^ i26;
                                                                    i36 = i25;
                                                                } else {
                                                                    int i46 = i42;
                                                                    sArr9 = sArr9;
                                                                    sArr6 = sArr10;
                                                                    i42 = i46;
                                                                    int i47 = i40;
                                                                    i43 = i43;
                                                                    i30 = i47;
                                                                    int i48 = i41;
                                                                    c22682 = c22682;
                                                                    i27 = i48;
                                                                    int iM55686 = (i34 - C0873.m55680("ۛ᩹")) * (-31);
                                                                    short[] sArr15 = sArr6;
                                                                    i36 = ((iM55686 ^ i35) * (-8443)) ^ (-27680913);
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr15;
                                                                    i37 = iM55686 ^ (-169230562);
                                                                    int i49 = i43;
                                                                    i40 = i30;
                                                                    i43 = i49;
                                                                    C22681 c22685 = c22682;
                                                                    i41 = i27;
                                                                    c22682 = c22685;
                                                                }
                                                                break;
                                                            case -1244215963:
                                                            case 744422344:
                                                                RunnableC1014.m56177();
                                                                return;
                                                            case -1159556669:
                                                            case 1241132792:
                                                                sArr10 = sArr10;
                                                                sArr8 = sArr8;
                                                                i42 = i42;
                                                                sArr9 = sArr9;
                                                                i40 = i40;
                                                                i43 = i43;
                                                                int i50 = i41;
                                                                c22682 = c22682;
                                                                i27 = i50;
                                                                sArr11 = f82192;
                                                                c2 = 0;
                                                                if (C0882.m55710() != 0) {
                                                                    iM55684 = (i34 - C0873.m55680("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                    i36 = ((iM55684 ^ i35) * 23137) ^ 1849741220;
                                                                    i28 = 1681341092;
                                                                } else {
                                                                    iM55684 = (C0873.m55680("ܽۢ") ^ i35) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                    i36 = ((iM55684 ^ i34) * (-23143)) ^ 1567755350;
                                                                    i28 = 140907879;
                                                                }
                                                                i31 = iM55684 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr16 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr16;
                                                                C22681 c22686 = c22682;
                                                                i41 = i27;
                                                                c22682 = c22686;
                                                                break;
                                                            case -1150112809:
                                                            case 991033658:
                                                                C0854.m55599(c22682.f71551);
                                                                sArr12 = f82192;
                                                                i43 = 23;
                                                                i39 = 3;
                                                                if (!C0861.f81831) {
                                                                    sArr10 = sArr10;
                                                                    sArr8 = sArr8;
                                                                    i42 = i42;
                                                                    sArr9 = sArr9;
                                                                    i40 = i40;
                                                                    int i51 = i41;
                                                                    c22682 = c22682;
                                                                    i27 = i51;
                                                                    int iM55687 = C0873.m55680("ܿ᩺") ^ i35;
                                                                    i36 = ((iM55687 ^ i34) * (-13581)) ^ (-1248408770);
                                                                    i31 = iM55687 ^ (-1251029209);
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr17 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr17;
                                                                    C22681 c22687 = c22682;
                                                                    i41 = i27;
                                                                    c22682 = c22687;
                                                                } else {
                                                                    iM559710 = (C0873.m55680("ܺۘ") ^ i35) * 49;
                                                                    i25 = ((iM559710 ^ i34) * (-11071)) ^ (-1487606892);
                                                                    i26 = 686909273;
                                                                    i37 = iM559710 ^ i26;
                                                                    i36 = i25;
                                                                }
                                                                break;
                                                            case -1079970019:
                                                            case -694288772:
                                                                sArr10 = sArr10;
                                                                sArr8 = sArr8;
                                                                i42 = i42;
                                                                sArr9 = sArr9;
                                                                i40 = i40;
                                                                i43 = i43;
                                                                int i52 = i41;
                                                                c22682 = c22682;
                                                                i27 = i52;
                                                                s3 = sArr11[c2];
                                                                s4 = 31412;
                                                                if (C1036.f81953 < 0) {
                                                                    iM55684 = C0873.m55680("ۘ۟") ^ i34;
                                                                    i36 = ((iM55684 ^ i35) * 20931) ^ 1756725174;
                                                                    i28 = 1588270979;
                                                                    i31 = iM55684 ^ i28;
                                                                    i43 = i43;
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr18 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr18;
                                                                    C22681 c22688 = c22682;
                                                                    i41 = i27;
                                                                    c22682 = c22688;
                                                                } else {
                                                                    i43 = i43;
                                                                    int iM55688 = C0873.m55680("ܿ᩺") ^ i35;
                                                                    i36 = ((iM55688 ^ i34) * (-13581)) ^ (-1248408770);
                                                                    i31 = iM55688 ^ (-1251029209);
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr19 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr19;
                                                                    C22681 c22689 = c22682;
                                                                    i41 = i27;
                                                                    c22682 = c22689;
                                                                }
                                                                break;
                                                            case -1027777426:
                                                            case 2032572366:
                                                                C1964.m56592(strM55993);
                                                                throw th;
                                                            case -989797554:
                                                            case 499058895:
                                                                textView2 = viewOnClickListenerC7928.f20799;
                                                                if (textView2 != null) {
                                                                    iM559710 = (C0873.m55680("ᩴܿ") ^ i35) * 83;
                                                                    i25 = ((iM559710 ^ i34) * (-7555)) ^ (-2017936240);
                                                                    i26 = -759611311;
                                                                } else {
                                                                    iM559710 = (C0946.m55979("ܺ֫") + i35) * (-107);
                                                                    i25 = ((iM559710 ^ i34) * 31853) ^ 320320709;
                                                                    i26 = 1414879203;
                                                                }
                                                                i37 = iM559710 ^ i26;
                                                                i36 = i25;
                                                                break;
                                                            case -984677386:
                                                            case -205897555:
                                                                sArr7 = sArr8;
                                                                i32 = i42;
                                                                strM56233 = C1025.m56233(sArr7, i32, 2, i38);
                                                                if (C0845.m55584() <= 0) {
                                                                    int iM55689 = (C0873.m55680("ᩳ֨") + i34) * 5;
                                                                    int i53 = ((iM55689 ^ i35) * 75) ^ 1503456865;
                                                                    i37 = iM55689 ^ 1100842163;
                                                                    sArr8 = sArr7;
                                                                    i29 = i32;
                                                                    str20 = strM56233;
                                                                    i36 = i53;
                                                                    i42 = i29;
                                                                } else {
                                                                    int iM559712 = (i34 - C0946.m55979("ۨۘ")) * 97;
                                                                    short[] sArr20 = sArr9;
                                                                    int i54 = ((iM559712 ^ i35) * (-30341)) ^ 1228296771;
                                                                    i37 = iM559712 ^ 574362225;
                                                                    sArr8 = sArr7;
                                                                    i36 = i54;
                                                                    sArr9 = sArr20;
                                                                    i42 = i32;
                                                                    str20 = strM56233;
                                                                }
                                                                break;
                                                            case -887086443:
                                                            case 339105682:
                                                                zContainsKey = mapM53846.containsKey(str20);
                                                                th = null;
                                                                sArr9 = f82192;
                                                                if (RunnableC0938.f81886 < 0) {
                                                                    iM559710 = C0873.m55680("֨ۡ") ^ i35;
                                                                    i25 = ((iM559710 ^ i34) * (-13121)) ^ 1135629207;
                                                                    i26 = -137931986;
                                                                    i37 = iM559710 ^ i26;
                                                                    i36 = i25;
                                                                } else {
                                                                    strM56233 = str20;
                                                                    sArr7 = sArr8;
                                                                    i32 = i42;
                                                                    int iM556810 = (C0873.m55680("ᩳ֨") + i34) * 5;
                                                                    int i55 = ((iM556810 ^ i35) * 75) ^ 1503456865;
                                                                    i37 = iM556810 ^ 1100842163;
                                                                    sArr8 = sArr7;
                                                                    i29 = i32;
                                                                    str20 = strM56233;
                                                                    i36 = i55;
                                                                    i42 = i29;
                                                                }
                                                                break;
                                                            case -884197223:
                                                            case 1015378991:
                                                                i43 = i43;
                                                                c22682 = c22682;
                                                                sArr8 = sArr8;
                                                                i42 = i42;
                                                                sArr9 = sArr9;
                                                                short[] sArr21 = f82192;
                                                                i27 = 3;
                                                                if (ViewOnClickListenerC0939.f81888 > 0) {
                                                                    int iM556811 = (C0873.m55680("᩷֫") + i35) * 13;
                                                                    i36 = ((iM556811 ^ i34) * (-18771)) ^ (-110254216);
                                                                    i43 = i43;
                                                                    c22682 = c22682;
                                                                    i37 = iM556811 ^ (-401031326);
                                                                    i40 = 9;
                                                                    i41 = 3;
                                                                    sArr8 = sArr8;
                                                                    i29 = i42;
                                                                    sArr10 = sArr21;
                                                                    sArr9 = sArr9;
                                                                    i42 = i29;
                                                                } else {
                                                                    sArr10 = sArr21;
                                                                    i40 = 9;
                                                                    iM55684 = (i34 - C0873.m55680("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                    i36 = ((iM55684 ^ i35) * 23137) ^ 1849741220;
                                                                    i28 = 1681341092;
                                                                    i31 = iM55684 ^ i28;
                                                                    i43 = i43;
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr110 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr110;
                                                                    C22681 c226810 = c22682;
                                                                    i41 = i27;
                                                                    c22682 = c226810;
                                                                }
                                                                break;
                                                            case -720436016:
                                                            case -706247785:
                                                                sArr10 = sArr10;
                                                                sArr8 = sArr8;
                                                                i42 = i42;
                                                                sArr9 = sArr9;
                                                                i40 = i40;
                                                                i43 = i43;
                                                                int i56 = i41;
                                                                c22682 = c22682;
                                                                i27 = i56;
                                                                if (((s3 * s3) + 246678436) - (s3 * s4) >= 0) {
                                                                    iM55684 = (C0873.m55680("ۨ۠") ^ i35) * (-41);
                                                                    i36 = ((iM55684 ^ i34) * (-15231)) ^ 228377202;
                                                                    i28 = -2080539834;
                                                                } else {
                                                                    iM55684 = C0946.m55979("ۗ᩸") ^ i34;
                                                                    i36 = ((iM55684 ^ i35) * 5093) ^ 870350013;
                                                                    i28 = -966268718;
                                                                }
                                                                i31 = iM55684 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr111 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr111;
                                                                C22681 c226811 = c22682;
                                                                i41 = i27;
                                                                c22682 = c226811;
                                                                break;
                                                            case -708919937:
                                                            case 1179170643:
                                                                strM55993 = C0947.m55993(sArr9, 14, 6, i38);
                                                                if (zContainsKey) {
                                                                    iM559710 = C0946.m55979("᩺ۙ") ^ i34;
                                                                    i25 = ((iM559710 ^ i35) * (-4621)) ^ (-921022686);
                                                                    i26 = -892065171;
                                                                } else {
                                                                    iM559710 = C0873.m55680("۟ܶ") ^ i34;
                                                                    i25 = ((iM559710 ^ i35) * (-16689)) ^ (-1796584092);
                                                                    i26 = 1319434029;
                                                                }
                                                                i37 = iM559710 ^ i26;
                                                                i36 = i25;
                                                                break;
                                                            case -522267565:
                                                            case 873082783:
                                                                sArr9 = sArr9;
                                                                viewOnClickListenerC7928 = c22682.f71552;
                                                                mapM53846 = C24414.m53846();
                                                                sArr8 = f82192;
                                                                if (ServiceConnectionC1013.f81940 >= 0) {
                                                                    sArr6 = sArr10;
                                                                    i42 = 12;
                                                                    int i57 = i40;
                                                                    i43 = i43;
                                                                    i30 = i57;
                                                                    int i58 = i41;
                                                                    c22682 = c22682;
                                                                    i27 = i58;
                                                                    int iM556812 = (i34 - C0873.m55680("ۛ᩹")) * (-31);
                                                                    short[] sArr112 = sArr6;
                                                                    i36 = ((iM556812 ^ i35) * (-8443)) ^ (-27680913);
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr112;
                                                                    i37 = iM556812 ^ (-169230562);
                                                                    int i410 = i43;
                                                                    i40 = i30;
                                                                    i43 = i410;
                                                                    C22681 c226812 = c22682;
                                                                    i41 = i27;
                                                                    c22682 = c226812;
                                                                } else {
                                                                    int iM559713 = (C0946.m55979("᩶ܺ") + i35) * 109;
                                                                    i37 = iM559713 ^ 1555086289;
                                                                    i36 = ((iM559713 ^ i34) * (-21797)) ^ (-316469149);
                                                                    sArr9 = sArr9;
                                                                    i42 = 12;
                                                                }
                                                                break;
                                                            case -490663544:
                                                            case 1700502033:
                                                                break;
                                                            case -109789258:
                                                            case 206869344:
                                                                i27 = i41;
                                                                i38 = 1095;
                                                                iM55684 = C0873.m55680("ۧۚ") ^ i35;
                                                                i36 = ((iM55684 ^ i34) * 1059) ^ (-1872861499);
                                                                i28 = -1858562557;
                                                                i31 = iM55684 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr113 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr113;
                                                                C22681 c226813 = c22682;
                                                                i41 = i27;
                                                                c22682 = c226813;
                                                                break;
                                                            case -69890754:
                                                            case 876322120:
                                                                C1404.m56468();
                                                                break;
                                                            case 87321074:
                                                            case 588226242:
                                                                int i59 = i41;
                                                                short[] sArr22 = sArr10;
                                                                short[] sArr23 = sArr8;
                                                                int i60 = i42;
                                                                short[] sArr24 = sArr9;
                                                                int i61 = i40;
                                                                int i62 = i43;
                                                                RunnableC0871.m55661(c25065, strM55936);
                                                                boolean zM55655 = C0866.m55655(c25065);
                                                                C22681 c226814 = c22681;
                                                                if (zM55655) {
                                                                    int iM556813 = (i35 - C0873.m55680("֫᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                                    i41 = i59;
                                                                    c22682 = c226814;
                                                                    i36 = ((iM556813 ^ i34) * 14735) ^ (-847109974);
                                                                    sArr9 = sArr24;
                                                                    i42 = i60;
                                                                    sArr10 = sArr22;
                                                                    i37 = iM556813 ^ 393771249;
                                                                    i43 = i62;
                                                                    i40 = i61;
                                                                    sArr8 = sArr23;
                                                                } else {
                                                                    int iM556814 = (i34 - C0873.m55680("ۙܰ")) * (-33);
                                                                    i41 = i59;
                                                                    c22682 = c226814;
                                                                    i36 = ((iM556814 ^ i35) * (-16193)) ^ 1678462179;
                                                                    i43 = i62;
                                                                    i40 = i61;
                                                                    sArr8 = sArr23;
                                                                    i37 = iM556814 ^ (-1017445460);
                                                                    sArr9 = sArr24;
                                                                    i42 = i60;
                                                                    sArr10 = sArr22;
                                                                }
                                                                break;
                                                            case 328626695:
                                                            case 1955712699:
                                                                C0946.m55976(textView2, C0873.m55680(strM55667) ^ 2102247021);
                                                                iM559710 = (C0873.m55680("᩶ۛ") + i34) * (-31);
                                                                i25 = ((iM559710 ^ i35) * 31181) ^ 613416656;
                                                                i26 = -1378533490;
                                                                i37 = iM559710 ^ i26;
                                                                i36 = i25;
                                                                break;
                                                            case 497669291:
                                                            case 1304677895:
                                                                i27 = i41;
                                                                i38 = 19189;
                                                                iM55684 = C0873.m55680("ۧۚ") ^ i35;
                                                                i36 = ((iM55684 ^ i34) * 1059) ^ (-1872861499);
                                                                i28 = -1858562557;
                                                                i31 = iM55684 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr114 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr114;
                                                                C22681 c226815 = c22682;
                                                                i41 = i27;
                                                                c22682 = c226815;
                                                                break;
                                                            case 676056878:
                                                            case 1779830894:
                                                                sArr8 = sArr8;
                                                                int i63 = i42;
                                                                sArr9 = sArr9;
                                                                sArr6 = sArr10;
                                                                i42 = i63;
                                                                int i64 = i40;
                                                                i43 = i43;
                                                                i30 = i64;
                                                                int i65 = i41;
                                                                c22682 = c22682;
                                                                i27 = i65;
                                                                iM55685 = C0873.m55680(C0866.m55652(sArr6, i30, i27, i38));
                                                                if (C0949.f81897 < 0) {
                                                                    sArr10 = sArr6;
                                                                    int iM559714 = C0946.m55979("᩺᩸") ^ i34;
                                                                    i40 = i30;
                                                                    int i66 = ((iM559714 ^ i35) * 23647) ^ (-1978137574);
                                                                    i31 = iM559714 ^ (-1898311473);
                                                                    i36 = i66;
                                                                    i43 = i43;
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr115 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr115;
                                                                    C22681 c226816 = c22682;
                                                                    i41 = i27;
                                                                    c22682 = c226816;
                                                                } else {
                                                                    sArr8 = sArr8;
                                                                    int iM556815 = (i34 - C0873.m55680("ۛ᩹")) * (-31);
                                                                    short[] sArr116 = sArr6;
                                                                    i36 = ((iM556815 ^ i35) * (-8443)) ^ (-27680913);
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr116;
                                                                    i37 = iM556815 ^ (-169230562);
                                                                    int i411 = i43;
                                                                    i40 = i30;
                                                                    i43 = i411;
                                                                    C22681 c226817 = c22682;
                                                                    i41 = i27;
                                                                    c22682 = c226817;
                                                                }
                                                                break;
                                                            case 1073103933:
                                                            case 1098111398:
                                                                textView = viewOnClickListenerC7928.f20799;
                                                                if (textView != null) {
                                                                    iM559710 = C0946.m55979("۫ᩴ") ^ i34;
                                                                    i25 = ((iM559710 ^ i35) * (-15889)) ^ 576456335;
                                                                    i26 = 746114860;
                                                                } else {
                                                                    iM559710 = (i35 - C0873.m55680("᩹ۨ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                                    i25 = ((iM559710 ^ i34) * (-10635)) ^ 732848752;
                                                                    i26 = -1614609165;
                                                                }
                                                                i37 = iM559710 ^ i26;
                                                                i36 = i25;
                                                                break;
                                                            default:
                                                                C0894.m55769();
                                                                sArr10 = sArr10;
                                                                sArr8 = sArr8;
                                                                i42 = i42;
                                                                sArr9 = sArr9;
                                                                i40 = i40;
                                                                i43 = i43;
                                                                int i412 = i41;
                                                                c22682 = c22682;
                                                                i27 = i412;
                                                                iM55684 = (i34 - C0873.m55680("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                i36 = ((iM55684 ^ i35) * 23137) ^ 1849741220;
                                                                i28 = 1681341092;
                                                                i31 = iM55684 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr117 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr117;
                                                                C22681 c226818 = c22682;
                                                                i41 = i27;
                                                                c22682 = c226818;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }, 2)));
                                            iM55682 = C0946.m55979("ۜۨ") ^ i13;
                                            i3 = ((iM55682 ^ i14) * (-2097)) ^ (-1137538675);
                                            i7 = -476733834;
                                        } catch (JSONException e2) {
                                            e = e2;
                                            jSONException = e;
                                            iM55682 = (C0873.m55680("֨ܽ") + i14) * (-39);
                                            i3 = ((iM55682 ^ i13) * (-3323)) ^ (-1736105196);
                                            i7 = -89619040;
                                        }
                                    } catch (JSONException e3) {
                                        e = e3;
                                        i6 = i19;
                                        jSONException = e;
                                        iM55682 = (C0873.m55680("֨ܽ") + i14) * (-39);
                                        i3 = ((iM55682 ^ i13) * (-3323)) ^ (-1736105196);
                                        i7 = -89619040;
                                        i8 = iM55682 ^ i7;
                                        sArr3 = sArr;
                                        i18 = i5;
                                        i19 = i6;
                                        String str114 = strM56403;
                                        i16 = i8;
                                        i15 = i3;
                                        strM56403 = str114;
                                        break;
                                    }
                                } catch (JSONException e4) {
                                    e = e4;
                                    i5 = i18;
                                    i6 = i19;
                                    jSONException = e;
                                    iM55682 = (C0873.m55680("֨ܽ") + i14) * (-39);
                                    i3 = ((iM55682 ^ i13) * (-3323)) ^ (-1736105196);
                                    i7 = -89619040;
                                    i8 = iM55682 ^ i7;
                                    sArr3 = sArr;
                                    i18 = i5;
                                    i19 = i6;
                                    String str115 = strM56403;
                                    i16 = i8;
                                    i15 = i3;
                                    strM56403 = str115;
                                    break;
                                }
                            } catch (JSONException e5) {
                                e = e5;
                                sArr = sArr3;
                            }
                        } catch (JSONException e6) {
                            e = e6;
                            sArr = sArr3;
                            i5 = i18;
                            i6 = i19;
                            jSONException = e;
                            iM55682 = (C0873.m55680("֨ܽ") + i14) * (-39);
                            i3 = ((iM55682 ^ i13) * (-3323)) ^ (-1736105196);
                            i7 = -89619040;
                            i8 = iM55682 ^ i7;
                            sArr3 = sArr;
                            i18 = i5;
                            i19 = i6;
                            String str116 = strM56403;
                            i16 = i8;
                            i15 = i3;
                            strM56403 = str116;
                            break;
                        }
                    } catch (JSONException e7) {
                        e = e7;
                        strM56403 = strM56403;
                    }
                    i8 = iM55682 ^ i7;
                    sArr3 = sArr;
                    i18 = i5;
                    i19 = i6;
                    String str117 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str117;
                    break;
                case 1205635010:
                case 2130026540:
                    i17 = 22126;
                    iM55681 = C0946.m55979("ۡۤ") ^ i13;
                    i3 = ((iM55681 ^ i14) * 30703) ^ 1609915798;
                    i4 = -1147817907;
                    i8 = iM55681 ^ i4;
                    String str118 = strM56403;
                    i16 = i8;
                    i15 = i3;
                    strM56403 = str118;
                    break;
                default:
                    C1124.m56367();
                    break;
            }
            return;
        }
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5756() {
        C22681 c22681 = null;
        int i = 1432323999;
        int i2 = RunnableC1014.f81941;
        int i3 = C1964.f83032;
        int iM55979 = C0946.m55979("ܿᩳ") ^ i3;
        int i4 = ((iM55979 ^ i2) * 14305) ^ (-1034066614);
        int i5 = -736802652;
        while (true) {
            i = ((((i ^ i2) * 8307) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2141970322:
                case 914927587:
                    if (C1048.f81963) {
                        iM55979 = (i2 - C0873.m55680("֡ܶ")) * (-61);
                        i4 = ((iM55979 ^ i3) * 23279) ^ (-2057675392);
                        i5 = 187508186;
                    } else {
                        iM55979 = (C0946.m55979("᩻ۡ") ^ i3) * (-43);
                        i4 = ((iM55979 ^ i2) * 17425) ^ 490764299;
                        i5 = 122342651;
                    }
                    break;
                case -1920826496:
                case 360828204:
                    AbstractC0942.m55971();
                    iM55979 = (C0946.m55979("ܺ᩺") + i2) * 3;
                    i4 = ((iM55979 ^ i3) * (-30723)) ^ (-1845525493);
                    i5 = -768455433;
                    break;
                case -1795887220:
                case 400244407:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (C0946.m55979("᩻ۡ") ^ i3) * (-43);
                        i4 = ((iM55979 ^ i2) * 17425) ^ 490764299;
                        i5 = 122342651;
                    } else {
                        iM55979 = C0946.m55979("ܺ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * 16661) ^ 1359370241;
                        i5 = -1402943069;
                    }
                    break;
                case -1719457042:
                case -249378161:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("᩻ۡ") ^ i3) * (-43);
                        i4 = ((iM55979 ^ i2) * 17425) ^ 490764299;
                        i5 = 122342651;
                    } else {
                        iM55979 = C0946.m55979("֫ۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31275) ^ (-1094250182);
                        i5 = 430066211;
                    }
                    break;
                case -1609208782:
                case 1304926455:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("ۛۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 671) ^ (-728862628);
                        i5 = 1174256725;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩹ᩴ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i2) * (-3869)) ^ (-704569804);
                        i5 = -2053708306;
                    }
                    break;
                case -1363827989:
                case -881812040:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0946.m55979("᩷᩷") + i3) * 57;
                        i4 = ((iM55979 ^ i2) * 7525) ^ (-1931899982);
                        i5 = 365483335;
                    } else {
                        iM55979 = (C0946.m55979("ܺ᩺") + i2) * 3;
                        i4 = ((iM55979 ^ i3) * (-30723)) ^ (-1845525493);
                        i5 = -768455433;
                    }
                    break;
                case -1039170757:
                case 1635902907:
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0946.m55979("᩻ۡ") ^ i3) * (-43);
                        i4 = ((iM55979 ^ i2) * 17425) ^ 490764299;
                        i5 = 122342651;
                    } else {
                        iM55979 = (C0946.m55979("ܰۖ") + i2) * 31;
                        i4 = ((iM55979 ^ i3) * (-7309)) ^ (-1769047961);
                        i5 = 1541314403;
                    }
                    break;
                case -982608721:
                case -135195536:
                    RunnableC0871.m55672();
                    C0949.m56012();
                    break;
                case -503925421:
                case -153287421:
                    c22681 = this.f41044;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ۛۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 671) ^ (-728862628);
                        i5 = 1174256725;
                    } else {
                        iM55979 = (C0946.m55979("֡᩻") + i2) * 81;
                        i4 = ((iM55979 ^ i3) * 23235) ^ (-500718937);
                        i5 = 1870546267;
                    }
                    break;
                case -414109574:
                case 1881039339:
                    if (!C0955.m56025()) {
                        iM55979 = (C0946.m55979("᩷᩷") + i3) * 57;
                        i4 = ((iM55979 ^ i2) * 7525) ^ (-1931899982);
                        i5 = 365483335;
                    } else {
                        iM55979 = (C0946.m55979("᩻ۡ") ^ i3) * (-43);
                        i4 = ((iM55979 ^ i2) * 17425) ^ 490764299;
                        i5 = 122342651;
                    }
                    break;
                case -199264718:
                case 1932686237:
                    C1046.m56302();
                    if (!C0877.m55696()) {
                        iM55979 = (C0946.m55979("ܺ᩺") + i2) * 3;
                        i4 = ((iM55979 ^ i3) * (-30723)) ^ (-1845525493);
                        i5 = -768455433;
                    } else {
                        iM55979 = C0946.m55979("۫ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14009) ^ (-1057109272);
                        i5 = -1432711864;
                    }
                    break;
                case 131907426:
                case 284661857:
                    break;
                case 541747006:
                case 1116821309:
                    C1036.m56253(c22681.f71551);
                    break;
                case 576434960:
                case 1185308422:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55979 = C0946.m55979("۫ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14009) ^ (-1057109272);
                        i5 = -1432711864;
                    } else {
                        iM55979 = C0873.m55680("᩶᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7891)) ^ (-601627876);
                        i5 = -135279846;
                    }
                    break;
                case 742521433:
                case 823554686:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("᩷᩷") + i3) * 57;
                        i4 = ((iM55979 ^ i2) * 7525) ^ (-1931899982);
                        i5 = 365483335;
                    } else {
                        iM55979 = C0873.m55680("ۖۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15615)) ^ 1551146082;
                        i5 = 1433847115;
                    }
                    break;
                case 771568523:
                case 1129464548:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("۫ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14009) ^ (-1057109272);
                        i5 = -1432711864;
                    } else {
                        iM55979 = C0873.m55680("ܰ᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2387)) ^ 180321816;
                        i5 = 659319779;
                    }
                    break;
                case 882692647:
                case 1110552778:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("۫ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14009) ^ (-1057109272);
                        i5 = -1432711864;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۟ۧ")) * 33;
                        i4 = ((iM55979 ^ i2) * 26637) ^ (-2012748271);
                        i5 = -1317680961;
                    }
                    break;
                default:
                    if (c22681.f71551.m33960()) {
                        iM55979 = C0946.m55979("ܿۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28059) ^ (-565480940);
                        i5 = 843013882;
                    } else {
                        iM55979 = (C0873.m55680("ᩳܳ") + i2) * (-37);
                        i4 = ((iM55979 ^ i3) * (-25415)) ^ 711640031;
                        i5 = -1710625438;
                    }
                    break;
            }
            return;
        }
    }
}
