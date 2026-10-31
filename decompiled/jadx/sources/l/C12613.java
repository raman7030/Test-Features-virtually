package l;

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
public final class C12613 implements InterfaceC4227 {

    /* JADX INFO: renamed from: ᩸۫ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f38016 = {4004, -5774, -5783, -5803, -5774, -5772, -5777, -5784, -5791, -5842, -5848, -5848, -5848, -5841, 5973, 22044, 22027, 22042, 22076, 22027, 22042, 22043, 22044, 22016, 22061, 22017, 22026, 22027, 22100, 22094, 22031, 22029, 22029, 22027, 22045, 22045, 22065, 22042, 22017, 22021, 22027, 22016};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5850 f38017;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21373 f38018;

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
    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫ */
    public final void mo3454(C19750 c19750) {
        int iM2566;
        int i;
        int i2;
        int i3 = C2958.f9394;
        int i4 = C22628.f73083;
        int iM6981 = (C2105.m6981("ۤ᩹") + i3) * (-59);
        int i5 = ((iM6981 ^ i4) * (-5983)) ^ 1749125898;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ (-940457312);
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
        String strM947 = null;
        C21373 c21373 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 13407) >> 31));
            switch (i13) {
                case -1952849292:
                case 668940578:
                    i12 = 13;
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("ۧᩳ") ^ i4;
                        i = ((iM2566 ^ i3) * 19357) ^ (-625651572);
                        i2 = 440551226;
                    } else {
                        iM2566 = (C0630.m2566("ۨܺ") + i4) * 39;
                        i = ((iM2566 ^ i3) * 18565) ^ (-1987170281);
                        i2 = 437261152;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1660783898:
                case 423270253:
                    i7 = s * s2;
                    i8 = s * s;
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM2566 = C0630.m2566("ᩴ۬") ^ i3;
                        i = ((iM2566 ^ i4) * (-30691)) ^ 623657517;
                        i2 = -495130594;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1558644434:
                case 1959627960:
                    sArr = f38016;
                    if (C0483.m2121()) {
                        iM2566 = (C0630.m2566("᩹۫") + i3) * (-111);
                        i = ((iM2566 ^ i4) * 8579) ^ (-2083049041);
                        i2 = -2016158818;
                    } else {
                        iM2566 = C0630.m2566("ᩴܶ") ^ i3;
                        i = ((iM2566 ^ i4) * 20623) ^ (-692147628);
                        i2 = -1338255220;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1501446100:
                case 1524381076:
                    if (C0714.f2697 < 0) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM2566 = C0630.m2566("ᩴܶ") ^ i3;
                        i = ((iM2566 ^ i4) * 20623) ^ (-692147628);
                        i2 = -1338255220;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1471817505:
                case 129914542:
                    s = sArr[c];
                    s2 = 7014;
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("۠ۢ") ^ i4;
                        i = ((iM2566 ^ i3) * (-14223)) ^ 558535086;
                        i2 = 1866461045;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ᩴᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i3) * (-12777)) ^ (-1379962242);
                        i2 = 1870966825;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1288630414:
                case -1195221892:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM2566 = C0630.m2566("ۧᩳ") ^ i4;
                        i = ((iM2566 ^ i3) * 19357) ^ (-625651572);
                        i2 = 440551226;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1284415511:
                case 1194428668:
                    if (C3245.m9925() != 0) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM2566 = (C0630.m2566("֨ᩴ") ^ i4) * 75;
                        i = ((iM2566 ^ i3) * (-13895)) ^ 1478340820;
                        i2 = -1116717443;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1275906490:
                case 1658116276:
                    break;
                case -997437413:
                case 1296580419:
                    i10 = 59654;
                    iM2566 = (C0630.m2566("ۛ۠") ^ i3) * (-91);
                    i = ((iM2566 ^ i4) * (-27767)) ^ 1027322993;
                    i2 = -461952633;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -756796427:
                case 1383400915:
                    C1420.m4913();
                    break;
                case -692125338:
                case 1951279381:
                    i11 = 1;
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("۠ۢ") ^ i4;
                        i = ((iM2566 ^ i3) * (-14223)) ^ 558535086;
                        i2 = 1866461045;
                    } else {
                        iM2566 = C2105.m6981("ۧ᩺") ^ i4;
                        i = ((iM2566 ^ i3) * (-7559)) ^ (-731765223);
                        i2 = 305975218;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -301996574:
                case 2000658321:
                    i10 = 17394;
                    iM2566 = (C0630.m2566("ۛ۠") ^ i3) * (-91);
                    i = ((iM2566 ^ i4) * (-27767)) ^ 1027322993;
                    i2 = -461952633;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -29793900:
                case 1140749253:
                    strM947 = C0050.m947(c19750);
                    sArr2 = f38016;
                    if (C2126.f7087) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM2566 = C2105.m6981("᩺ۜ") ^ i3;
                        i = ((iM2566 ^ i4) * 31611) ^ (-503833183);
                        i2 = -2123380704;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 109351975:
                case 1159346521:
                    AbstractC2021.m6574();
                    if (C3019.f9544 >= 0) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM2566 = C2105.m6981("ۤܰ") ^ i3;
                        i = ((iM2566 ^ i4) * (-28885)) ^ 619361766;
                        i2 = 1175652649;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 391972977:
                case 1215510400:
                    i9 = 12299049;
                    if (C0382.f1805) {
                        iM2566 = (C0630.m2566("᩶۟") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2566 ^ i3) * (-8151)) ^ (-1263630015);
                        i2 = -1933560503;
                    } else {
                        iM2566 = C0630.m2566("ۧᩳ") ^ i4;
                        i = ((iM2566 ^ i3) * 19357) ^ (-625651572);
                        i2 = 440551226;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 436900596:
                case 1360281109:
                    c21373.m48456(strM947, false);
                    break;
                case 799125941:
                case 997716865:
                    C0237.m1481();
                    C3911.m11924();
                    iM2566 = C2105.m6981("᩹᩶") ^ i3;
                    i = ((iM2566 ^ i4) * (-31837)) ^ 964206845;
                    i2 = -1487630247;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 799528819:
                case 1478761968:
                    C2126.m7031(strM947, C11340.m28025(sArr2, i11, i12, i10));
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("ۤܰ") ^ i3;
                        i = ((iM2566 ^ i4) * (-28885)) ^ 619361766;
                        i2 = 1175652649;
                    } else {
                        iM2566 = (C0630.m2566("ۡᩳ") ^ i3) * 73;
                        i = ((iM2566 ^ i4) * (-28825)) ^ (-1427682909);
                        i2 = -53758599;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 867155879:
                case 1345659270:
                    c = 0;
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-31837)) ^ 964206845;
                        i2 = -1487630247;
                    } else {
                        iM2566 = C0630.m2566("֫ᩴ") ^ i3;
                        i = ((iM2566 ^ i4) * 7851) ^ (-832350098);
                        i2 = 1567082593;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 949905277:
                case 1349002093:
                    c21373 = this.f38018;
                    if (c21373.f68856.m31868()) {
                        int iM6982 = (C2105.m6981("᩻ۗ") + i4) * (-89);
                        i5 = ((iM6982 ^ i3) * 14633) ^ 305127340;
                        i6 = iM6982 ^ 539364877;
                    } else {
                        iM2566 = (C0630.m2566("۬ۜ") + i4) * (-43);
                        i = ((iM2566 ^ i3) * 23343) ^ (-228461127);
                        i2 = 209831835;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    }
                    break;
                default:
                    if (i7 - (i8 + i9) > 0) {
                        iM2566 = (i4 - C0630.m2566("ۜܳ")) * 59;
                        i = ((iM2566 ^ i3) * 13889) ^ (-1892584864);
                        i2 = 471888981;
                    } else {
                        iM2566 = (C0630.m2566("ܳ۟") ^ i3) * (-29);
                        i = ((iM2566 ^ i4) * (-31499)) ^ (-1134810910);
                        i2 = 1985420594;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C12613(C21373 c21373, ViewOnClickListenerC5850 viewOnClickListenerC5850) {
        int i = 1713585506;
        int i2 = C4263.f13799;
        int i3 = C4117.f13076;
        int iM2566 = C0630.m2566("ܰܿ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-4037)) ^ (-921774194);
        int i5 = -916018260;
        while (true) {
            i = ((((i ^ i3) * (-8393)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2057684376:
                case -1873183798:
                    C0483.m2121();
                    C5695.m16023();
                    iM2566 = (C0630.m2566("ܺ֫") + i3) * (-7);
                    i4 = ((iM2566 ^ i2) * 26413) ^ 68769974;
                    i5 = -267496916;
                    break;
                case -1685407627:
                case 205617670:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("ۘᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4489) ^ (-473308815);
                        i5 = -1399311482;
                    } else {
                        iM2566 = C0630.m2566("ܰۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-15713)) ^ (-116940075);
                        i5 = 463646949;
                    }
                    break;
                case -1266317953:
                case -95336518:
                    C22628.m50615();
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C0630.m2566("ܺ֫") + i3) * (-7);
                        i4 = ((iM2566 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    } else {
                        iM2566 = C0630.m2566("ܽ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13895)) ^ 1035023054;
                        i5 = -1543129695;
                    }
                    break;
                case -1148196922:
                case 1298911208:
                    if (C4159.f13567) {
                        iM2566 = (C2105.m6981("ۗ᩸") ^ i2) * (-123);
                        i4 = ((iM2566 ^ i3) * 4753) ^ (-1209407618);
                        i5 = 298156160;
                    } else {
                        iM2566 = C0630.m2566("ۢۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4987)) ^ (-1048046875);
                        i5 = 45017923;
                    }
                    break;
                case -961965747:
                case 1674648889:
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ۘᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4489) ^ (-473308815);
                        i5 = -1399311482;
                    } else {
                        iM2566 = C2105.m6981("۠ۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18369) ^ (-1872952931);
                        i5 = 733285878;
                    }
                    break;
                case -667310370:
                case -254039605:
                    if (C0964.f3626 != 0) {
                        iM2566 = (C0630.m2566("ܺ֫") + i3) * (-7);
                        i4 = ((iM2566 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    } else {
                        iM2566 = C0630.m2566("֨ۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3455) ^ 932355782;
                        i5 = 1832929156;
                    }
                    break;
                case -46504821:
                case 1462110085:
                    this.f38018 = c21373;
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("ܺ֫") + i3) * (-7);
                        i4 = ((iM2566 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    } else {
                        iM2566 = C2105.m6981("ᩳܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-11993)) ^ 587525472;
                        i5 = 1823945254;
                    }
                    break;
                case 333478934:
                case 494687164:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C0630.m2566("ܽ֫") + i2) * (-51);
                        i4 = ((iM2566 ^ i3) * 13931) ^ 882977125;
                        i5 = -1987846638;
                    } else {
                        iM2566 = (C0630.m2566("᩻ܳ") ^ i3) * 33;
                        i4 = ((iM2566 ^ i2) * 24805) ^ 493480757;
                        i5 = 702916495;
                    }
                    break;
                case 350123194:
                case 418784812:
                    C1005.m3501();
                    if (!C2272.f7362) {
                        iM2566 = C0630.m2566("ۢۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4987)) ^ (-1048046875);
                        i5 = 45017923;
                    } else {
                        iM2566 = C0630.m2566("ۘᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4489) ^ (-473308815);
                        i5 = -1399311482;
                    }
                    break;
                case 363930774:
                case 435869968:
                    if (C0382.m1848()) {
                        iM2566 = C0630.m2566("ۢۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4987)) ^ (-1048046875);
                        i5 = 45017923;
                    } else {
                        iM2566 = C0630.m2566("ۢۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-29297)) ^ 1737090100;
                        i5 = 941461352;
                    }
                    break;
                case 397978661:
                case 1495062659:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("ܺ֫") + i3) * (-7);
                        i4 = ((iM2566 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    } else {
                        iM2566 = (C0630.m2566("ۚۖ") + i3) * 91;
                        i4 = ((iM2566 ^ i2) * (-21923)) ^ (-1365342145);
                        i5 = -904422489;
                    }
                    break;
                case 535427289:
                case 1260598476:
                    if (C1711.f5919) {
                        iM2566 = (C0630.m2566("ܽ֫") + i2) * (-51);
                        i4 = ((iM2566 ^ i3) * 13931) ^ 882977125;
                        i5 = -1987846638;
                    } else {
                        iM2566 = C0630.m2566("ۗ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 24549) ^ (-1036202785);
                        i5 = 187922987;
                    }
                    break;
                case 921837140:
                case 2106804929:
                    C2520.m8026();
                    if (C2105.f7037 == 0) {
                        iM2566 = C0630.m2566("ۘᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4489) ^ (-473308815);
                        i5 = -1399311482;
                    } else {
                        iM2566 = (C0630.m2566("ܺ֫") + i3) * (-7);
                        i4 = ((iM2566 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    }
                    break;
                case 981308321:
                case 2024787816:
                    if (C3663.f11553) {
                        iM2566 = (C0630.m2566("ܺ֫") + i3) * (-7);
                        i4 = ((iM2566 ^ i2) * 26413) ^ 68769974;
                        i5 = -267496916;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܽᩴ")) * 61;
                        i4 = ((iM2566 ^ i3) * 2925) ^ 57870263;
                        i5 = -1990090618;
                    }
                    break;
                case 1206044146:
                case 1350053812:
                    C4075.m12263();
                    C7106.m19120();
                    throw new RuntimeException();
                default:
                    this.f38017 = viewOnClickListenerC5850;
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
    
        if (l.C22628.f73083 > 0) goto L7;
     */
    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3455(JSONObject jSONObject) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        short[] sArr;
        int i5;
        int i6;
        int iM2568;
        int i7;
        int i8;
        short[] sArr2;
        int i9;
        int i10;
        int iM2569;
        int i11;
        int i12;
        int i13 = C0422.f1886;
        int i14 = C0483.f2088;
        int iM6981 = C2105.m6981("ۙ᩵") ^ i13;
        int i15 = ((iM6981 ^ i14) * (-1523)) ^ 277009346;
        final C21373 c21373 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i16 = iM6981 ^ (-877932616);
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
        String strM20837 = null;
        short[] sArr5 = null;
        String strM3005 = null;
        JSONException jSONException = null;
        int iM12255 = 0;
        while (true) {
            i23 = i16 ^ (i15 & (((i23 ^ i14) * (-18199)) >> 31));
            switch (i23) {
                case -2094361096:
                case 211513439:
                    if (C22628.f73083 > 0) {
                        strM20837 = strM20837;
                        iM2567 = C2105.m6981("᩶۟") ^ i14;
                        i3 = ((iM2567 ^ i13) * 2013) ^ (-1967983325);
                        i4 = 923168036;
                        i8 = iM2567 ^ i4;
                        String str = strM20837;
                        i16 = i8;
                        i15 = i3;
                        strM20837 = str;
                    } else {
                        sArr2 = sArr3;
                        i9 = i18;
                        i10 = i19;
                        iM2569 = C2105.m6981("ۗܰ") ^ i14;
                        i11 = ((iM2569 ^ i13) * (-6351)) ^ (-831201630);
                        i12 = -1300702790;
                        i16 = iM2569 ^ i12;
                        i15 = i11;
                        sArr3 = sArr2;
                        i18 = i9;
                        i19 = i10;
                    }
                    break;
                case -1872284797:
                case -409377485:
                    strM20837 = strM20837;
                    sArr = sArr3;
                    i5 = i18;
                    i6 = i19;
                    if (c21373.f68856.m31868()) {
                        iM2568 = C2105.m6981("ᩳ᩹") ^ i13;
                        i3 = ((iM2568 ^ i14) * (-31041)) ^ (-468008716);
                        i7 = -1325973791;
                    } else {
                        iM2568 = (C2105.m6981("ۚ᩺") + i14) * (-69);
                        i3 = ((iM2568 ^ i13) * 25029) ^ (-315147052);
                        i7 = 1647303634;
                    }
                    i8 = iM2568 ^ i7;
                    sArr3 = sArr;
                    i18 = i5;
                    i19 = i6;
                    String str2 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str2;
                    break;
                case -1871471902:
                case -929789714:
                    strM20837 = strM20837;
                    sArr = sArr3;
                    i5 = i18;
                    i6 = i19;
                    if (iM12255 != 0) {
                        iM2568 = C0630.m2566("᩹ۨ") ^ i14;
                        i3 = ((iM2568 ^ i13) * 22131) ^ 1312518858;
                        i7 = -751323742;
                    } else {
                        iM2568 = (C2105.m6981("᩹᩸") + i13) * (-91);
                        i3 = ((iM2568 ^ i14) * (-29045)) ^ 1671219177;
                        i7 = 102100989;
                    }
                    i8 = iM2568 ^ i7;
                    sArr3 = sArr;
                    i18 = i5;
                    i19 = i6;
                    String str3 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str3;
                    break;
                case -1857819080:
                case -75626757:
                case 995133860:
                case 1189947014:
                    break;
                case -1785369890:
                case 1965188900:
                    if (C3746.f11829 > 0) {
                        iM2566 = (C0630.m2566("ۜۧ") + i13) * 9;
                        i = ((iM2566 ^ i14) * (-19165)) ^ (-766475766);
                        i2 = -321494349;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    } else {
                        strM20837 = strM20837;
                        iM2567 = (C2105.m6981("ۘۚ") ^ i13) * (-5);
                        i3 = ((iM2567 ^ i14) * (-7679)) ^ (-739457860);
                        i4 = -1159669886;
                        i8 = iM2567 ^ i4;
                        String str4 = strM20837;
                        i16 = i8;
                        i15 = i3;
                        strM20837 = str4;
                    }
                    break;
                case -1751091040:
                case 642734854:
                    strM20837 = strM20837;
                    c = 14;
                    if (C1916.f6442) {
                        iM2567 = C2105.m6981("۬ۖ") ^ i13;
                        i3 = ((iM2567 ^ i14) * 27989) ^ 541526309;
                        i4 = 833555022;
                    } else {
                        iM2567 = C2105.m6981("᩶۟") ^ i14;
                        i3 = ((iM2567 ^ i13) * 2013) ^ (-1967983325);
                        i4 = 923168036;
                    }
                    i8 = iM2567 ^ i4;
                    String str5 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str5;
                    break;
                case -1589148264:
                case -1373282554:
                    RunnableC0588.m2441();
                    if (C1128.f4106 <= 0) {
                        iM2566 = (i14 - C0630.m2566("᩹ۙ")) * (-77);
                        i = ((iM2566 ^ i13) * 5155) ^ (-1178091482);
                        i2 = -1044966667;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    } else {
                        sArr2 = sArr3;
                        i9 = i18;
                        i10 = i19;
                        iM2569 = C2105.m6981("ۗܰ") ^ i14;
                        i11 = ((iM2569 ^ i13) * (-6351)) ^ (-831201630);
                        i12 = -1300702790;
                        i16 = iM2569 ^ i12;
                        i15 = i11;
                        sArr3 = sArr2;
                        i18 = i9;
                        i19 = i10;
                    }
                    break;
                case -1552011409:
                case 628715062:
                    strM20837 = strM20837;
                    sArr3 = f38016;
                    i18 = 15;
                    i19 = 3;
                    if (C4159.f13567) {
                        iM2567 = C0630.m2566("᩵ᩴ") ^ i14;
                        i3 = ((iM2567 ^ i13) * (-21015)) ^ (-861499399);
                        i4 = -255261596;
                    } else {
                        iM2567 = (C2105.m6981("ۘۚ") ^ i13) * (-5);
                        i3 = ((iM2567 ^ i14) * (-7679)) ^ (-739457860);
                        i4 = -1159669886;
                    }
                    i8 = iM2567 ^ i4;
                    String str6 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str6;
                    break;
                case -1529836890:
                case 1611421612:
                    if (C3663.m11168() >= 0) {
                        strM20837 = strM20837;
                        iM2567 = C2105.m6981("۬᩺") ^ i14;
                        i3 = ((iM2567 ^ i13) * 22461) ^ (-877483454);
                        i4 = 1896282123;
                        i8 = iM2567 ^ i4;
                        String str7 = strM20837;
                        i16 = i8;
                        i15 = i3;
                        strM20837 = str7;
                    }
                    strM20837 = strM20837;
                    iM2567 = C0630.m2566("᩵ۛ") ^ i13;
                    i3 = ((iM2567 ^ i14) * 24635) ^ (-576579818);
                    i4 = 1841962787;
                    i8 = iM2567 ^ i4;
                    String str8 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str8;
                    break;
                case -1474350202:
                case 1798206702:
                    break;
                case -1400052383:
                case -750755323:
                    strM20837 = strM20837;
                    if (C7106.f21815 != 0) {
                        iM2567 = (C2105.m6981("ۘۚ") ^ i13) * (-5);
                        i3 = ((iM2567 ^ i14) * (-7679)) ^ (-739457860);
                        i4 = -1159669886;
                    } else {
                        iM2567 = C0630.m2566("ۜܳ") ^ i13;
                        i3 = ((iM2567 ^ i14) * 26495) ^ (-1139331065);
                        i4 = -1602744243;
                    }
                    i8 = iM2567 ^ i4;
                    String str9 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str9;
                    break;
                case -1332229071:
                case 1790319240:
                    strM20837 = strM20837;
                    i24 = 92313664;
                    if (C3432.f10845 >= 0) {
                        iM2567 = (i13 - C0630.m2566("ܽۨ")) * 3;
                        i3 = ((iM2567 ^ i14) * (-10855)) ^ 680066063;
                        i4 = -98283392;
                    } else {
                        iM2567 = C0630.m2566("ۧܺ") ^ i13;
                        i3 = ((iM2567 ^ i14) * 18089) ^ 1727051764;
                        i4 = -470112640;
                    }
                    i8 = iM2567 ^ i4;
                    String str10 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str10;
                    break;
                case -1332001886:
                case -1294239212:
                    C3911.m11924();
                    iM2566 = C2105.m6981("ۤ۬") ^ i14;
                    i = ((iM2566 ^ i13) * 30081) ^ 1107937540;
                    i2 = 139029993;
                    i16 = iM2566 ^ i2;
                    i15 = i;
                    break;
                case -1198290789:
                case -481102281:
                    strM20837 = strM20837;
                    sArr5 = f38016;
                    if (C11340.f33930 >= 0) {
                        iM2567 = (i13 - C0630.m2566("ܽۨ")) * 3;
                        i3 = ((iM2567 ^ i14) * (-10855)) ^ 680066063;
                        i4 = -98283392;
                    } else {
                        iM2567 = C0630.m2566("ܳ᩶") ^ i14;
                        i3 = ((iM2567 ^ i13) * (-14641)) ^ (-1271529591);
                        i4 = 1216599808;
                    }
                    i8 = iM2567 ^ i4;
                    String str11 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str11;
                    break;
                case -1189694205:
                case 3709127:
                    strM20837 = strM20837;
                    sArr = sArr3;
                    i5 = i18;
                    i6 = i19;
                    z = false;
                    iM2568 = C0630.m2566("ۜ᩹") ^ i14;
                    i3 = ((iM2568 ^ i13) * 29353) ^ 12673991;
                    i7 = -1442085527;
                    i8 = iM2568 ^ i7;
                    sArr3 = sArr;
                    i18 = i5;
                    i19 = i6;
                    String str12 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str12;
                    break;
                case -1188240280:
                case 891707623:
                    strM20837 = strM20837;
                    sArr = sArr3;
                    i5 = i18;
                    i6 = i19;
                    sArr4 = f38016;
                    i20 = 18;
                    if (C2167.f7158 < 0) {
                        iM2568 = (C0630.m2566("ܶ᩵") + i13) * 57;
                        i3 = ((iM2568 ^ i14) * 29995) ^ (-1548403400);
                        i7 = -1614884154;
                        i8 = iM2568 ^ i7;
                        sArr3 = sArr;
                        i18 = i5;
                        i19 = i6;
                        String str13 = strM20837;
                        i16 = i8;
                        i15 = i3;
                        strM20837 = str13;
                    } else {
                        sArr3 = sArr;
                        i18 = i5;
                        i19 = i6;
                        iM2567 = C0630.m2566("᩵ۛ") ^ i13;
                        i3 = ((iM2567 ^ i14) * 24635) ^ (-576579818);
                        i4 = 1841962787;
                        i8 = iM2567 ^ i4;
                        String str14 = strM20837;
                        i16 = i8;
                        i15 = i3;
                        strM20837 = str14;
                    }
                    break;
                case -878250715:
                case 1361289627:
                    i17 = 56939;
                    iM2567 = C2105.m6981("ۡۤ") ^ i13;
                    i3 = ((iM2567 ^ i14) * 30703) ^ 1609915798;
                    i4 = -1147817907;
                    i8 = iM2567 ^ i4;
                    String str15 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str15;
                    break;
                case -692002499:
                case 965136499:
                    if (C5695.f17556 >= 0) {
                        strM20837 = strM20837;
                        iM2567 = (i13 - C0630.m2566("ܽۨ")) * 3;
                        i3 = ((iM2567 ^ i14) * (-10855)) ^ 680066063;
                        i4 = -98283392;
                        i8 = iM2567 ^ i4;
                        String str16 = strM20837;
                        i16 = i8;
                        i15 = i3;
                        strM20837 = str16;
                    } else {
                        iM2566 = C2105.m6981("ۤ۬") ^ i14;
                        i = ((iM2566 ^ i13) * 30081) ^ 1107937540;
                        i2 = 139029993;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    }
                    break;
                case -680859806:
                case -450195732:
                    C1294.m4372();
                    RunnableC0588.m2441();
                    break;
                case -605201793:
                case 321341382:
                    sArr2 = sArr3;
                    i9 = i18;
                    i10 = i19;
                    strM20837 = C7811.m20837(sArr4, i20, 12, i17);
                    c21373 = this.f38018;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2569 = C2105.m6981("ۗܰ") ^ i14;
                        i11 = ((iM2569 ^ i13) * (-6351)) ^ (-831201630);
                        i12 = -1300702790;
                    } else {
                        iM2569 = C0630.m2566("ۢۖ") ^ i13;
                        i11 = ((iM2569 ^ i14) * (-18543)) ^ (-1868052698);
                        i12 = -9242106;
                    }
                    i16 = iM2569 ^ i12;
                    i15 = i11;
                    sArr3 = sArr2;
                    i18 = i9;
                    i19 = i10;
                    break;
                case -604156024:
                case 692360229:
                    strM20837 = strM20837;
                    s = sArr5[c];
                    s2 = 19216;
                    if (C1711.f5919) {
                        iM2567 = (i13 - C2105.m6981("ᩳۨ")) * 85;
                        i3 = ((iM2567 ^ i14) * (-30685)) ^ (-1229721417);
                        i4 = 621207856;
                    } else {
                        iM2567 = (C2105.m6981("᩸֡") ^ i14) * 25;
                        i3 = ((iM2567 ^ i13) * 3859) ^ (-144735525);
                        i4 = 634735422;
                    }
                    i8 = iM2567 ^ i4;
                    String str17 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str17;
                    break;
                case -413066754:
                case -268444892:
                    strM20837 = strM20837;
                    i21 = s * s2;
                    i22 = s * s;
                    if (C4117.f13076 <= 0) {
                        iM2567 = C2105.m6981("۬᩺") ^ i14;
                        i3 = ((iM2567 ^ i13) * 22461) ^ (-877483454);
                        i4 = 1896282123;
                    } else {
                        iM2567 = (i14 - C2105.m6981("᩹ۖ")) * (-91);
                        i3 = ((iM2567 ^ i13) * (-30713)) ^ (-798103776);
                        i4 = -987723562;
                    }
                    i8 = iM2567 ^ i4;
                    String str18 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str18;
                    break;
                case -400162802:
                case 1782512946:
                    if (!C1504.f5354) {
                        sArr2 = sArr3;
                        i9 = i18;
                        i10 = i19;
                        iM2569 = C2105.m6981("ۗܰ") ^ i14;
                        i11 = ((iM2569 ^ i13) * (-6351)) ^ (-831201630);
                        i12 = -1300702790;
                        i16 = iM2569 ^ i12;
                        i15 = i11;
                        sArr3 = sArr2;
                        i18 = i9;
                        i19 = i10;
                    } else {
                        iM2566 = C2105.m6981("ۤ۬") ^ i14;
                        i = ((iM2566 ^ i13) * 30081) ^ 1107937540;
                        i2 = 139029993;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    }
                    break;
                case -82757454:
                case 1470628127:
                    strM20837 = strM20837;
                    if (i21 - (i22 + i24) <= 0) {
                        iM2567 = C0630.m2566("᩻ۤ") ^ i13;
                        i3 = ((iM2567 ^ i14) * 2455) ^ (-1001088173);
                        i4 = 1597308682;
                    } else {
                        iM2567 = (i14 - C2105.m6981("ۢۜ")) * (-35);
                        i3 = ((iM2567 ^ i13) * 26589) ^ 1209969482;
                        i4 = 795539486;
                    }
                    i8 = iM2567 ^ i4;
                    String str19 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str19;
                    break;
                case -81096328:
                case 1178009681:
                    c21373.m48456(C0422.m1959(jSONException), z);
                    break;
                case 40123497:
                case 1834701952:
                    C2167.m7155();
                    if (C3746.f11829 <= 0) {
                        strM20837 = strM20837;
                        iM2567 = (C2105.m6981("ۘۚ") ^ i13) * (-5);
                        i3 = ((iM2567 ^ i14) * (-7679)) ^ (-739457860);
                        i4 = -1159669886;
                        i8 = iM2567 ^ i4;
                        String str110 = strM20837;
                        i16 = i8;
                        i15 = i3;
                        strM20837 = str110;
                    } else {
                        iM2566 = C2105.m6981("ۤ۬") ^ i14;
                        i = ((iM2566 ^ i13) * 30081) ^ 1107937540;
                        i2 = 139029993;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    }
                    break;
                case 170781156:
                case 803806456:
                    strM20837 = strM20837;
                    strM3005 = C0798.m3005(sArr3, i18, i19, i17);
                    if (C5695.f17556 >= 0) {
                        iM2567 = C0630.m2566("᩵ۛ") ^ i13;
                        i3 = ((iM2567 ^ i14) * 24635) ^ (-576579818);
                        i4 = 1841962787;
                    } else {
                        iM2567 = C0630.m2566("۫۬") ^ i14;
                        i3 = ((iM2567 ^ i13) * (-29831)) ^ 643560260;
                        i4 = 1712287498;
                    }
                    i8 = iM2567 ^ i4;
                    String str111 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str111;
                    break;
                case 202889262:
                case 1137044915:
                    try {
                        int iM10558 = ServiceConnectionC3453.m10558(jSONObject, strM3005);
                        StringBuilder sb = new StringBuilder(strM20837);
                        C0050.m945(sb, iM10558);
                        c21373.m48456(C0050.m947(sb), z);
                        iM2566 = C2105.m6981("֨۫") ^ i14;
                        i = ((iM2566 ^ i13) * (-467)) ^ 1532033235;
                        i2 = -1714501946;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    } catch (JSONException e) {
                        jSONException = e;
                        strM20837 = strM20837;
                        sArr = sArr3;
                        i5 = i18;
                        i6 = i19;
                        iM2568 = (C0630.m2566("֨ܽ") + i14) * (-39);
                        i3 = ((iM2568 ^ i13) * (-3323)) ^ (-1736105196);
                        i7 = -89619040;
                        i8 = iM2568 ^ i7;
                        sArr3 = sArr;
                        i18 = i5;
                        i19 = i6;
                        String str112 = strM20837;
                        i16 = i8;
                        i15 = i3;
                        strM20837 = str112;
                    }
                    break;
                case 384283591:
                case 1965571191:
                    strM20837 = strM20837;
                    sArr = sArr3;
                    i5 = i18;
                    i6 = i19;
                    iM12255 = C4075.m12255(jSONObject, strM3005);
                    iM2568 = (i13 - C2105.m6981("ۚ֡")) * 95;
                    i3 = ((iM2568 ^ i14) * 20195) ^ 872564899;
                    i7 = -160924632;
                    i8 = iM2568 ^ i7;
                    sArr3 = sArr;
                    i18 = i5;
                    i19 = i6;
                    String str113 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str113;
                    break;
                case 623370589:
                case 1699327029:
                    try {
                        strM20837 = strM20837;
                        try {
                            try {
                                sArr = sArr3;
                                try {
                                    i5 = i18;
                                    try {
                                        i6 = i19;
                                        try {
                                            C1005.m3499(new Thread(new RunnableC19053(C21923.m49332(jSONObject, C3432.m10488(f38016, 30, 12, i17)), this.f38017, new InterfaceC9461() { // from class: l.۬᩵ۡ

                                                /* JADX INFO: renamed from: ᩴܰ۬, reason: not valid java name and contains not printable characters */
                                                private static final short[] f39867 = {6024, 1077, 1058, 1076, 1079, 1064, 1065, 1076, 1058, 22087, 26463, -28864, 1078, 1078, 1070, 1065, 1057, 1064, 1046, 1046, -25983, 22618, -29474, -24902, 27796, 26006};

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
                                                
                                                    if (l.C2272.m7503() != false) goto L12;
                                                 */
                                                /* JADX WARN: Code restructure failed: missing block: B:7:0x0080, code lost:
                                                
                                                    if (l.C4075.f12947 < 0) goto L8;
                                                 */
                                                @Override // l.InterfaceC9461
                                                /* JADX INFO: renamed from: ֫ */
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final void mo1430(C23881 c23881) throws Throwable {
                                                    int iM6982;
                                                    int i25;
                                                    int i26;
                                                    int i27;
                                                    int iM25610;
                                                    int i28;
                                                    int i29;
                                                    short[] sArr6;
                                                    int i30;
                                                    int i31;
                                                    short[] sArr7;
                                                    int i32;
                                                    String strM11225;
                                                    int i33 = 1566914764;
                                                    int i34 = C2520.f8000;
                                                    int i35 = C3245.f10203;
                                                    int iM6983 = C2105.m6981("ۜ᩵") ^ i34;
                                                    int i36 = ((iM6983 ^ i35) * (-13681)) ^ (-621770608);
                                                    int i37 = iM6983 ^ (-1034024523);
                                                    String str20 = null;
                                                    TextView textView = null;
                                                    short[] sArr8 = null;
                                                    short[] sArr9 = null;
                                                    int i38 = 0;
                                                    int i39 = 0;
                                                    short s3 = 0;
                                                    short s4 = 0;
                                                    char c2 = 0;
                                                    String strM6385 = null;
                                                    int i40 = 0;
                                                    int i41 = 0;
                                                    int i42 = 0;
                                                    boolean zContainsKey = false;
                                                    Map mapM51450 = null;
                                                    TextView textView2 = null;
                                                    short[] sArr10 = null;
                                                    ViewOnClickListenerC5850 viewOnClickListenerC5850 = null;
                                                    String strM7036 = null;
                                                    short[] sArr11 = null;
                                                    C21373 c21374 = null;
                                                    Throwable th = null;
                                                    String strM2436 = null;
                                                    short[] sArr12 = null;
                                                    int i43 = 0;
                                                    int iM25611 = 0;
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
                                                                c21374 = c21374;
                                                                i27 = i44;
                                                                strM6385 = RunnableC1937.m6385(f39867, 1, 8, i38);
                                                                if (C3746.m11369() >= 0) {
                                                                    iM25610 = (i34 - C0630.m2566("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                    i36 = ((iM25610 ^ i35) * 23137) ^ 1849741220;
                                                                    i28 = 1681341092;
                                                                } else {
                                                                    iM25610 = (C0630.m2566("۫۠") ^ i34) * (-31);
                                                                    i36 = ((iM25610 ^ i35) * (-5497)) ^ (-1416609521);
                                                                    i28 = 875489827;
                                                                }
                                                                i31 = iM25610 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr13 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr13;
                                                                C21373 c21375 = c21374;
                                                                i41 = i27;
                                                                c21374 = c21375;
                                                                break;
                                                            case -1760072620:
                                                            case -1441539217:
                                                                if (!C1005.f3721) {
                                                                    iM6982 = (C2105.m6981("ۖܿ") + i35) * (-125);
                                                                    i25 = ((iM6982 ^ i34) * (-4045)) ^ 1691722775;
                                                                    i26 = -1772640779;
                                                                    i37 = iM6982 ^ i26;
                                                                    i36 = i25;
                                                                } else {
                                                                    sArr10 = sArr10;
                                                                    sArr8 = sArr8;
                                                                    i42 = i42;
                                                                    sArr9 = sArr9;
                                                                    i40 = i40;
                                                                    i43 = i43;
                                                                    int i45 = i41;
                                                                    c21374 = c21374;
                                                                    i27 = i45;
                                                                    iM25610 = (i34 - C0630.m2566("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                    i36 = ((iM25610 ^ i35) * 23137) ^ 1849741220;
                                                                    i28 = 1681341092;
                                                                    i31 = iM25610 ^ i28;
                                                                    i43 = i43;
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr14 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr14;
                                                                    C21373 c21376 = c21374;
                                                                    i41 = i27;
                                                                    c21374 = c21376;
                                                                }
                                                                break;
                                                            case -1621620027:
                                                            case -1478690927:
                                                                RunnableC1937.m6377(textView, (CharSequence) mapM51450.get(str20));
                                                                iM6982 = (C0630.m2566("᩶ۛ") + i34) * (-31);
                                                                i25 = ((iM6982 ^ i35) * 31181) ^ 613416656;
                                                                i26 = -1378533490;
                                                                i37 = iM6982 ^ i26;
                                                                i36 = i25;
                                                                break;
                                                            case -1444823238:
                                                            case 221563275:
                                                                C22628.m50610(strM7036);
                                                                throw th;
                                                            case -1363351039:
                                                            case 92116901:
                                                                c21374.m48456(AbstractC2021.m6563(c23881, iM25611 ^ 2119326159), false);
                                                                return;
                                                            case -1313020017:
                                                            case 1065442841:
                                                                C1504.m5167(C0630.m2566(C2520.m8030(sArr12, i43, i39, i38)) ^ 2101406145);
                                                                return;
                                                            case -1291557695:
                                                            case -15244280:
                                                                strM2436 = RunnableC0588.m2436(f39867, 20, 3, i38);
                                                                if (C4263.f13799 > 0) {
                                                                    iM6982 = (C2105.m6981("᩻۠") + i34) * 65;
                                                                    i25 = ((iM6982 ^ i35) * 14529) ^ (-1592847795);
                                                                    i26 = 20497634;
                                                                    i37 = iM6982 ^ i26;
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
                                                                    c21374 = c21374;
                                                                    i27 = i48;
                                                                    int iM25612 = (i34 - C0630.m2566("ۛ᩹")) * (-31);
                                                                    short[] sArr15 = sArr6;
                                                                    i36 = ((iM25612 ^ i35) * (-8443)) ^ (-27680913);
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr15;
                                                                    i37 = iM25612 ^ (-169230562);
                                                                    int i49 = i43;
                                                                    i40 = i30;
                                                                    i43 = i49;
                                                                    C21373 c21377 = c21374;
                                                                    i41 = i27;
                                                                    c21374 = c21377;
                                                                }
                                                                break;
                                                            case -1244215963:
                                                            case 744422344:
                                                                RunnableC3474.m10630();
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
                                                                c21374 = c21374;
                                                                i27 = i50;
                                                                sArr11 = f39867;
                                                                c2 = 0;
                                                                if (C0798.m2998() != 0) {
                                                                    iM25610 = (i34 - C0630.m2566("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                    i36 = ((iM25610 ^ i35) * 23137) ^ 1849741220;
                                                                    i28 = 1681341092;
                                                                } else {
                                                                    iM25610 = (C0630.m2566("ܽۢ") ^ i35) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                                    i36 = ((iM25610 ^ i34) * (-23143)) ^ 1567755350;
                                                                    i28 = 140907879;
                                                                }
                                                                i31 = iM25610 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr16 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr16;
                                                                C21373 c21378 = c21374;
                                                                i41 = i27;
                                                                c21374 = c21378;
                                                                break;
                                                            case -1150112809:
                                                            case 991033658:
                                                                C0237.m1485(c21374.f68856);
                                                                sArr12 = f39867;
                                                                i43 = 23;
                                                                i39 = 3;
                                                                if (!C0382.f1805) {
                                                                    sArr10 = sArr10;
                                                                    sArr8 = sArr8;
                                                                    i42 = i42;
                                                                    sArr9 = sArr9;
                                                                    i40 = i40;
                                                                    int i51 = i41;
                                                                    c21374 = c21374;
                                                                    i27 = i51;
                                                                    int iM25613 = C0630.m2566("ܿ᩺") ^ i35;
                                                                    i36 = ((iM25613 ^ i34) * (-13581)) ^ (-1248408770);
                                                                    i31 = iM25613 ^ (-1251029209);
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr17 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr17;
                                                                    C21373 c21379 = c21374;
                                                                    i41 = i27;
                                                                    c21374 = c21379;
                                                                } else {
                                                                    iM6982 = (C0630.m2566("ܺۘ") ^ i35) * 49;
                                                                    i25 = ((iM6982 ^ i34) * (-11071)) ^ (-1487606892);
                                                                    i26 = 686909273;
                                                                    i37 = iM6982 ^ i26;
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
                                                                c21374 = c21374;
                                                                i27 = i52;
                                                                s3 = sArr11[c2];
                                                                s4 = 31412;
                                                                if (C3911.f12484 < 0) {
                                                                    iM25610 = C0630.m2566("ۘ۟") ^ i34;
                                                                    i36 = ((iM25610 ^ i35) * 20931) ^ 1756725174;
                                                                    i28 = 1588270979;
                                                                    i31 = iM25610 ^ i28;
                                                                    i43 = i43;
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr18 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr18;
                                                                    C21373 c213710 = c21374;
                                                                    i41 = i27;
                                                                    c21374 = c213710;
                                                                } else {
                                                                    i43 = i43;
                                                                    int iM25614 = C0630.m2566("ܿ᩺") ^ i35;
                                                                    i36 = ((iM25614 ^ i34) * (-13581)) ^ (-1248408770);
                                                                    i31 = iM25614 ^ (-1251029209);
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr19 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr19;
                                                                    C21373 c213711 = c21374;
                                                                    i41 = i27;
                                                                    c21374 = c213711;
                                                                }
                                                                break;
                                                            case -1027777426:
                                                            case 2032572366:
                                                                C22628.m50610(strM7036);
                                                                throw th;
                                                            case -989797554:
                                                            case 499058895:
                                                                textView2 = viewOnClickListenerC5850.f17948;
                                                                if (textView2 != null) {
                                                                    iM6982 = (C0630.m2566("ᩴܿ") ^ i35) * 83;
                                                                    i25 = ((iM6982 ^ i34) * (-7555)) ^ (-2017936240);
                                                                    i26 = -759611311;
                                                                } else {
                                                                    iM6982 = (C2105.m6981("ܺ֫") + i35) * (-107);
                                                                    i25 = ((iM6982 ^ i34) * 31853) ^ 320320709;
                                                                    i26 = 1414879203;
                                                                }
                                                                i37 = iM6982 ^ i26;
                                                                i36 = i25;
                                                                break;
                                                            case -984677386:
                                                            case -205897555:
                                                                sArr7 = sArr8;
                                                                i32 = i42;
                                                                strM11225 = C3683.m11225(sArr7, i32, 2, i38);
                                                                if (C0050.m940() <= 0) {
                                                                    int iM25615 = (C0630.m2566("ᩳ֨") + i34) * 5;
                                                                    int i53 = ((iM25615 ^ i35) * 75) ^ 1503456865;
                                                                    i37 = iM25615 ^ 1100842163;
                                                                    sArr8 = sArr7;
                                                                    i29 = i32;
                                                                    str20 = strM11225;
                                                                    i36 = i53;
                                                                    i42 = i29;
                                                                } else {
                                                                    int iM6984 = (i34 - C2105.m6981("ۨۘ")) * 97;
                                                                    short[] sArr20 = sArr9;
                                                                    int i54 = ((iM6984 ^ i35) * (-30341)) ^ 1228296771;
                                                                    i37 = iM6984 ^ 574362225;
                                                                    sArr8 = sArr7;
                                                                    i36 = i54;
                                                                    sArr9 = sArr20;
                                                                    i42 = i32;
                                                                    str20 = strM11225;
                                                                }
                                                                break;
                                                            case -887086443:
                                                            case 339105682:
                                                                zContainsKey = mapM51450.containsKey(str20);
                                                                th = null;
                                                                sArr9 = f39867;
                                                                if (RunnableC1937.f6483 < 0) {
                                                                    iM6982 = C0630.m2566("֨ۡ") ^ i35;
                                                                    i25 = ((iM6982 ^ i34) * (-13121)) ^ 1135629207;
                                                                    i26 = -137931986;
                                                                    i37 = iM6982 ^ i26;
                                                                    i36 = i25;
                                                                } else {
                                                                    strM11225 = str20;
                                                                    sArr7 = sArr8;
                                                                    i32 = i42;
                                                                    int iM25616 = (C0630.m2566("ᩳ֨") + i34) * 5;
                                                                    int i55 = ((iM25616 ^ i35) * 75) ^ 1503456865;
                                                                    i37 = iM25616 ^ 1100842163;
                                                                    sArr8 = sArr7;
                                                                    i29 = i32;
                                                                    str20 = strM11225;
                                                                    i36 = i55;
                                                                    i42 = i29;
                                                                }
                                                                break;
                                                            case -884197223:
                                                            case 1015378991:
                                                                i43 = i43;
                                                                c21374 = c21374;
                                                                sArr8 = sArr8;
                                                                i42 = i42;
                                                                sArr9 = sArr9;
                                                                short[] sArr21 = f39867;
                                                                i27 = 3;
                                                                if (ViewOnClickListenerC1958.f6529 > 0) {
                                                                    int iM25617 = (C0630.m2566("᩷֫") + i35) * 13;
                                                                    i36 = ((iM25617 ^ i34) * (-18771)) ^ (-110254216);
                                                                    i43 = i43;
                                                                    c21374 = c21374;
                                                                    i37 = iM25617 ^ (-401031326);
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
                                                                    iM25610 = (i34 - C0630.m2566("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                    i36 = ((iM25610 ^ i35) * 23137) ^ 1849741220;
                                                                    i28 = 1681341092;
                                                                    i31 = iM25610 ^ i28;
                                                                    i43 = i43;
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr110 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr110;
                                                                    C21373 c213712 = c21374;
                                                                    i41 = i27;
                                                                    c21374 = c213712;
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
                                                                c21374 = c21374;
                                                                i27 = i56;
                                                                if (((s3 * s3) + 246678436) - (s3 * s4) >= 0) {
                                                                    iM25610 = (C0630.m2566("ۨ۠") ^ i35) * (-41);
                                                                    i36 = ((iM25610 ^ i34) * (-15231)) ^ 228377202;
                                                                    i28 = -2080539834;
                                                                } else {
                                                                    iM25610 = C2105.m6981("ۗ᩸") ^ i34;
                                                                    i36 = ((iM25610 ^ i35) * 5093) ^ 870350013;
                                                                    i28 = -966268718;
                                                                }
                                                                i31 = iM25610 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr111 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr111;
                                                                C21373 c213713 = c21374;
                                                                i41 = i27;
                                                                c21374 = c213713;
                                                                break;
                                                            case -708919937:
                                                            case 1179170643:
                                                                strM7036 = C2126.m7036(sArr9, 14, 6, i38);
                                                                if (zContainsKey) {
                                                                    iM6982 = C2105.m6981("᩺ۙ") ^ i34;
                                                                    i25 = ((iM6982 ^ i35) * (-4621)) ^ (-921022686);
                                                                    i26 = -892065171;
                                                                } else {
                                                                    iM6982 = C0630.m2566("۟ܶ") ^ i34;
                                                                    i25 = ((iM6982 ^ i35) * (-16689)) ^ (-1796584092);
                                                                    i26 = 1319434029;
                                                                }
                                                                i37 = iM6982 ^ i26;
                                                                i36 = i25;
                                                                break;
                                                            case -522267565:
                                                            case 873082783:
                                                                sArr9 = sArr9;
                                                                viewOnClickListenerC5850 = c21374.f68857;
                                                                mapM51450 = C23196.m51450();
                                                                sArr8 = f39867;
                                                                if (ServiceConnectionC3453.f10921 >= 0) {
                                                                    sArr6 = sArr10;
                                                                    i42 = 12;
                                                                    int i57 = i40;
                                                                    i43 = i43;
                                                                    i30 = i57;
                                                                    int i58 = i41;
                                                                    c21374 = c21374;
                                                                    i27 = i58;
                                                                    int iM25618 = (i34 - C0630.m2566("ۛ᩹")) * (-31);
                                                                    short[] sArr112 = sArr6;
                                                                    i36 = ((iM25618 ^ i35) * (-8443)) ^ (-27680913);
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr112;
                                                                    i37 = iM25618 ^ (-169230562);
                                                                    int i410 = i43;
                                                                    i40 = i30;
                                                                    i43 = i410;
                                                                    C21373 c213714 = c21374;
                                                                    i41 = i27;
                                                                    c21374 = c213714;
                                                                } else {
                                                                    int iM6985 = (C2105.m6981("᩶ܺ") + i35) * 109;
                                                                    i37 = iM6985 ^ 1555086289;
                                                                    i36 = ((iM6985 ^ i34) * (-21797)) ^ (-316469149);
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
                                                                iM25610 = C0630.m2566("ۧۚ") ^ i35;
                                                                i36 = ((iM25610 ^ i34) * 1059) ^ (-1872861499);
                                                                i28 = -1858562557;
                                                                i31 = iM25610 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr113 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr113;
                                                                C21373 c213715 = c21374;
                                                                i41 = i27;
                                                                c21374 = c213715;
                                                                break;
                                                            case -69890754:
                                                            case 876322120:
                                                                C11340.m28031();
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
                                                                RunnableC0588.m2430(c23881, strM6385);
                                                                boolean zM2131 = C0483.m2131(c23881);
                                                                C21373 c213716 = c21373;
                                                                if (zM2131) {
                                                                    int iM25619 = (i35 - C0630.m2566("֫᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                                    i41 = i59;
                                                                    c21374 = c213716;
                                                                    i36 = ((iM25619 ^ i34) * 14735) ^ (-847109974);
                                                                    sArr9 = sArr24;
                                                                    i42 = i60;
                                                                    sArr10 = sArr22;
                                                                    i37 = iM25619 ^ 393771249;
                                                                    i43 = i62;
                                                                    i40 = i61;
                                                                    sArr8 = sArr23;
                                                                } else {
                                                                    int iM25620 = (i34 - C0630.m2566("ۙܰ")) * (-33);
                                                                    i41 = i59;
                                                                    c21374 = c213716;
                                                                    i36 = ((iM25620 ^ i35) * (-16193)) ^ 1678462179;
                                                                    i43 = i62;
                                                                    i40 = i61;
                                                                    sArr8 = sArr23;
                                                                    i37 = iM25620 ^ (-1017445460);
                                                                    sArr9 = sArr24;
                                                                    i42 = i60;
                                                                    sArr10 = sArr22;
                                                                }
                                                                break;
                                                            case 328626695:
                                                            case 1955712699:
                                                                C2105.m6978(textView2, C0630.m2566(strM2436) ^ 2102247021);
                                                                iM6982 = (C0630.m2566("᩶ۛ") + i34) * (-31);
                                                                i25 = ((iM6982 ^ i35) * 31181) ^ 613416656;
                                                                i26 = -1378533490;
                                                                i37 = iM6982 ^ i26;
                                                                i36 = i25;
                                                                break;
                                                            case 497669291:
                                                            case 1304677895:
                                                                i27 = i41;
                                                                i38 = 19189;
                                                                iM25610 = C0630.m2566("ۧۚ") ^ i35;
                                                                i36 = ((iM25610 ^ i34) * 1059) ^ (-1872861499);
                                                                i28 = -1858562557;
                                                                i31 = iM25610 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr114 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr114;
                                                                C21373 c213717 = c21374;
                                                                i41 = i27;
                                                                c21374 = c213717;
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
                                                                c21374 = c21374;
                                                                i27 = i65;
                                                                iM25611 = C0630.m2566(C0483.m2128(sArr6, i30, i27, i38));
                                                                if (C2167.f7158 < 0) {
                                                                    sArr10 = sArr6;
                                                                    int iM6986 = C2105.m6981("᩺᩸") ^ i34;
                                                                    i40 = i30;
                                                                    int i66 = ((iM6986 ^ i35) * 23647) ^ (-1978137574);
                                                                    i31 = iM6986 ^ (-1898311473);
                                                                    i36 = i66;
                                                                    i43 = i43;
                                                                    i40 = i40;
                                                                    sArr8 = sArr8;
                                                                    short[] sArr115 = sArr10;
                                                                    i37 = i31;
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr115;
                                                                    C21373 c213718 = c21374;
                                                                    i41 = i27;
                                                                    c21374 = c213718;
                                                                } else {
                                                                    sArr8 = sArr8;
                                                                    int iM256110 = (i34 - C0630.m2566("ۛ᩹")) * (-31);
                                                                    short[] sArr116 = sArr6;
                                                                    i36 = ((iM256110 ^ i35) * (-8443)) ^ (-27680913);
                                                                    sArr9 = sArr9;
                                                                    i42 = i42;
                                                                    sArr10 = sArr116;
                                                                    i37 = iM256110 ^ (-169230562);
                                                                    int i411 = i43;
                                                                    i40 = i30;
                                                                    i43 = i411;
                                                                    C21373 c213719 = c21374;
                                                                    i41 = i27;
                                                                    c21374 = c213719;
                                                                }
                                                                break;
                                                            case 1073103933:
                                                            case 1098111398:
                                                                textView = viewOnClickListenerC5850.f17948;
                                                                if (textView != null) {
                                                                    iM6982 = C2105.m6981("۫ᩴ") ^ i34;
                                                                    i25 = ((iM6982 ^ i35) * (-15889)) ^ 576456335;
                                                                    i26 = 746114860;
                                                                } else {
                                                                    iM6982 = (i35 - C0630.m2566("᩹ۨ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                                    i25 = ((iM6982 ^ i34) * (-10635)) ^ 732848752;
                                                                    i26 = -1614609165;
                                                                }
                                                                i37 = iM6982 ^ i26;
                                                                i36 = i25;
                                                                break;
                                                            default:
                                                                C1047.m3599();
                                                                sArr10 = sArr10;
                                                                sArr8 = sArr8;
                                                                i42 = i42;
                                                                sArr9 = sArr9;
                                                                i40 = i40;
                                                                i43 = i43;
                                                                int i412 = i41;
                                                                c21374 = c21374;
                                                                i27 = i412;
                                                                iM25610 = (i34 - C0630.m2566("ۡ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                i36 = ((iM25610 ^ i35) * 23137) ^ 1849741220;
                                                                i28 = 1681341092;
                                                                i31 = iM25610 ^ i28;
                                                                i43 = i43;
                                                                i40 = i40;
                                                                sArr8 = sArr8;
                                                                short[] sArr117 = sArr10;
                                                                i37 = i31;
                                                                sArr9 = sArr9;
                                                                i42 = i42;
                                                                sArr10 = sArr117;
                                                                C21373 c2137110 = c21374;
                                                                i41 = i27;
                                                                c21374 = c2137110;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }, 2)));
                                            iM2568 = C2105.m6981("ۜۨ") ^ i13;
                                            i3 = ((iM2568 ^ i14) * (-2097)) ^ (-1137538675);
                                            i7 = -476733834;
                                        } catch (JSONException e2) {
                                            e = e2;
                                            jSONException = e;
                                            iM2568 = (C0630.m2566("֨ܽ") + i14) * (-39);
                                            i3 = ((iM2568 ^ i13) * (-3323)) ^ (-1736105196);
                                            i7 = -89619040;
                                        }
                                    } catch (JSONException e3) {
                                        e = e3;
                                        i6 = i19;
                                        jSONException = e;
                                        iM2568 = (C0630.m2566("֨ܽ") + i14) * (-39);
                                        i3 = ((iM2568 ^ i13) * (-3323)) ^ (-1736105196);
                                        i7 = -89619040;
                                        i8 = iM2568 ^ i7;
                                        sArr3 = sArr;
                                        i18 = i5;
                                        i19 = i6;
                                        String str114 = strM20837;
                                        i16 = i8;
                                        i15 = i3;
                                        strM20837 = str114;
                                        break;
                                    }
                                } catch (JSONException e4) {
                                    e = e4;
                                    i5 = i18;
                                    i6 = i19;
                                    jSONException = e;
                                    iM2568 = (C0630.m2566("֨ܽ") + i14) * (-39);
                                    i3 = ((iM2568 ^ i13) * (-3323)) ^ (-1736105196);
                                    i7 = -89619040;
                                    i8 = iM2568 ^ i7;
                                    sArr3 = sArr;
                                    i18 = i5;
                                    i19 = i6;
                                    String str115 = strM20837;
                                    i16 = i8;
                                    i15 = i3;
                                    strM20837 = str115;
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
                            iM2568 = (C0630.m2566("֨ܽ") + i14) * (-39);
                            i3 = ((iM2568 ^ i13) * (-3323)) ^ (-1736105196);
                            i7 = -89619040;
                            i8 = iM2568 ^ i7;
                            sArr3 = sArr;
                            i18 = i5;
                            i19 = i6;
                            String str116 = strM20837;
                            i16 = i8;
                            i15 = i3;
                            strM20837 = str116;
                            break;
                        }
                    } catch (JSONException e7) {
                        e = e7;
                        strM20837 = strM20837;
                    }
                    i8 = iM2568 ^ i7;
                    sArr3 = sArr;
                    i18 = i5;
                    i19 = i6;
                    String str117 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str117;
                    break;
                case 1205635010:
                case 2130026540:
                    i17 = 22126;
                    iM2567 = C2105.m6981("ۡۤ") ^ i13;
                    i3 = ((iM2567 ^ i14) * 30703) ^ 1609915798;
                    i4 = -1147817907;
                    i8 = iM2567 ^ i4;
                    String str118 = strM20837;
                    i16 = i8;
                    i15 = i3;
                    strM20837 = str118;
                    break;
                default:
                    C5695.m16023();
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC4227
    /* JADX INFO: renamed from: ֫ */
    public final void mo3453() {
        C21373 c21373 = null;
        int i = 1432323999;
        int i2 = RunnableC3474.f10992;
        int i3 = C22628.f73083;
        int iM6981 = C2105.m6981("ܿᩳ") ^ i3;
        int i4 = ((iM6981 ^ i2) * 14305) ^ (-1034066614);
        int i5 = -736802652;
        while (true) {
            i = ((((i ^ i2) * 8307) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2141970322:
                case 914927587:
                    if (C4159.f13567) {
                        iM6981 = (i2 - C0630.m2566("֡ܶ")) * (-61);
                        i4 = ((iM6981 ^ i3) * 23279) ^ (-2057675392);
                        i5 = 187508186;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۡ") ^ i3) * (-43);
                        i4 = ((iM6981 ^ i2) * 17425) ^ 490764299;
                        i5 = 122342651;
                    }
                    break;
                case -1920826496:
                case 360828204:
                    AbstractC2021.m6574();
                    iM6981 = (C2105.m6981("ܺ᩺") + i2) * 3;
                    i4 = ((iM6981 ^ i3) * (-30723)) ^ (-1845525493);
                    i5 = -768455433;
                    break;
                case -1795887220:
                case 400244407:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C2105.m6981("᩻ۡ") ^ i3) * (-43);
                        i4 = ((iM6981 ^ i2) * 17425) ^ 490764299;
                        i5 = 122342651;
                    } else {
                        iM6981 = C2105.m6981("ܺ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16661) ^ 1359370241;
                        i5 = -1402943069;
                    }
                    break;
                case -1719457042:
                case -249378161:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("᩻ۡ") ^ i3) * (-43);
                        i4 = ((iM6981 ^ i2) * 17425) ^ 490764299;
                        i5 = 122342651;
                    } else {
                        iM6981 = C2105.m6981("֫ۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31275) ^ (-1094250182);
                        i5 = 430066211;
                    }
                    break;
                case -1609208782:
                case 1304926455:
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("ۛۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 671) ^ (-728862628);
                        i5 = 1174256725;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩹ᩴ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM6981 ^ i2) * (-3869)) ^ (-704569804);
                        i5 = -2053708306;
                    }
                    break;
                case -1363827989:
                case -881812040:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C2105.m6981("᩷᩷") + i3) * 57;
                        i4 = ((iM6981 ^ i2) * 7525) ^ (-1931899982);
                        i5 = 365483335;
                    } else {
                        iM6981 = (C2105.m6981("ܺ᩺") + i2) * 3;
                        i4 = ((iM6981 ^ i3) * (-30723)) ^ (-1845525493);
                        i5 = -768455433;
                    }
                    break;
                case -1039170757:
                case 1635902907:
                    if (C4263.m12819() >= 0) {
                        iM6981 = (C2105.m6981("᩻ۡ") ^ i3) * (-43);
                        i4 = ((iM6981 ^ i2) * 17425) ^ 490764299;
                        i5 = 122342651;
                    } else {
                        iM6981 = (C2105.m6981("ܰۖ") + i2) * 31;
                        i4 = ((iM6981 ^ i3) * (-7309)) ^ (-1769047961);
                        i5 = 1541314403;
                    }
                    break;
                case -982608721:
                case -135195536:
                    RunnableC0588.m2441();
                    C2167.m7155();
                    break;
                case -503925421:
                case -153287421:
                    c21373 = this.f38018;
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("ۛۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 671) ^ (-728862628);
                        i5 = 1174256725;
                    } else {
                        iM6981 = (C2105.m6981("֡᩻") + i2) * 81;
                        i4 = ((iM6981 ^ i3) * 23235) ^ (-500718937);
                        i5 = 1870546267;
                    }
                    break;
                case -414109574:
                case 1881039339:
                    if (!C2272.m7503()) {
                        iM6981 = (C2105.m6981("᩷᩷") + i3) * 57;
                        i4 = ((iM6981 ^ i2) * 7525) ^ (-1931899982);
                        i5 = 365483335;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۡ") ^ i3) * (-43);
                        i4 = ((iM6981 ^ i2) * 17425) ^ 490764299;
                        i5 = 122342651;
                    }
                    break;
                case -199264718:
                case 1932686237:
                    C4117.m12364();
                    if (!C0714.m2805()) {
                        iM6981 = (C2105.m6981("ܺ᩺") + i2) * 3;
                        i4 = ((iM6981 ^ i3) * (-30723)) ^ (-1845525493);
                        i5 = -768455433;
                    } else {
                        iM6981 = C2105.m6981("۫ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14009) ^ (-1057109272);
                        i5 = -1432711864;
                    }
                    break;
                case 131907426:
                case 284661857:
                    break;
                case 541747006:
                case 1116821309:
                    C3911.m11920(c21373.f68856);
                    break;
                case 576434960:
                case 1185308422:
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = C2105.m6981("۫ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14009) ^ (-1057109272);
                        i5 = -1432711864;
                    } else {
                        iM6981 = C0630.m2566("᩶᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-7891)) ^ (-601627876);
                        i5 = -135279846;
                    }
                    break;
                case 742521433:
                case 823554686:
                    if (C0050.f910 >= 0) {
                        iM6981 = (C2105.m6981("᩷᩷") + i3) * 57;
                        i4 = ((iM6981 ^ i2) * 7525) ^ (-1931899982);
                        i5 = 365483335;
                    } else {
                        iM6981 = C0630.m2566("ۖۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15615)) ^ 1551146082;
                        i5 = 1433847115;
                    }
                    break;
                case 771568523:
                case 1129464548:
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("۫ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14009) ^ (-1057109272);
                        i5 = -1432711864;
                    } else {
                        iM6981 = C0630.m2566("ܰ᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2387)) ^ 180321816;
                        i5 = 659319779;
                    }
                    break;
                case 882692647:
                case 1110552778:
                    if (C0483.f2088 >= 0) {
                        iM6981 = C2105.m6981("۫ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14009) ^ (-1057109272);
                        i5 = -1432711864;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۟ۧ")) * 33;
                        i4 = ((iM6981 ^ i2) * 26637) ^ (-2012748271);
                        i5 = -1317680961;
                    }
                    break;
                default:
                    if (c21373.f68856.m31868()) {
                        iM6981 = C2105.m6981("ܿۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 28059) ^ (-565480940);
                        i5 = 843013882;
                    } else {
                        iM6981 = (C0630.m2566("ᩳܳ") + i2) * (-37);
                        i4 = ((iM6981 ^ i3) * (-25415)) ^ 711640031;
                        i5 = -1710625438;
                    }
                    break;
            }
            return;
        }
    }
}
