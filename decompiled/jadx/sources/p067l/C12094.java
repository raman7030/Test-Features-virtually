package p067l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.p080ec.custom.sec.SecP192K1Field;

/* JADX INFO: renamed from: l.ۤۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1W9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12094 {

    /* JADX INFO: renamed from: ۚ᩵ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f82125 = {6013, 25800, -30349, -26395, 18950, 30970, 17389, 16897, 18605, 29590, -31568, 29537, 21377, -31288, 30380, -31228, 17570, 16939, 20254, 7640, 7631, 7641, 7640, 7631, 7631, 7646, 7640, 7631, 7647, 7640, 7631, 7647, 7633, 7640, 7631, 7647, 7628, -29977, 16994, -25042, -30346, 27028, 29025, -27597, -30830, 31147, -29808, 26314, 30974, 16741, -32705, 32632, 5087, -15850, -12322, -15989, 1760, -11893, -15498, 13198, 3251, -12022, 3387, -14964, 14654, 9411, -17426, -17415, -17425, -17426, -17415, -17415, -17432, -17426, -17415, -17431, -17426, -17415, -17431, -17433, -17426, -17415, -17431, -17414, 1170, -28176, 30936, 26079, 30667, 27296, -25950, 18780, -26952, 26562, 16688, 19525, 18289, 9435, 17616, 20205, 22117, 7648, -6563, -6564, -6566, -6581, -6592, -6583, -6579, -6565, -6568, -6582, -6564, -6633, -6568, -6583, -6574, -6571, -6576, -6565, -6532, -6581, -6581, -6570, -6581, 7428, 6493, 6523, 6512, 6503, 6512, 6462, 6525, 6512, 6527, 6518, 6462, 6494, 6515, 6523, 6516, 6514, 6501, 6442, 6493, 6523, 6512, 6503, 6512, 6462, 6525, 6512, 6527, 6518, 6462, 6466, 6501, 6499, 6520, 6527, 6518, 6442, 6493, 6523, 6512, 6503, 6512, 6462, 6525, 6512, 6527, 6518, 6462, 6482, 6521, 6512, 6499, 6466, 6516, 6496, 6500, 6516, 6527, 6514, 6516, 6442, 6483, 6482, 6485, 6487, 6488, 6491, 6466, 6475, 6474, 6483, 6474, 6482, 6474, 6488, 6474, 6466, 3817, 16065, 25805, -22606, -16829, 25944, -21412, -23171};

    /* JADX INFO: renamed from: ֫ */
    public Main f33794;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f33795;

    /* JADX INFO: renamed from: ۢ */
    public C18107 f33796;

    /* JADX INFO: renamed from: ۧ */
    public TreeSet f33797;

    /* JADX INFO: renamed from: ܳ */
    public boolean f33798;

    /* JADX INFO: renamed from: ܽ */
    public C0990 f33799;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC17043 f33800;

    /* JADX INFO: renamed from: ᩳ */
    public C12096 f33801;

    /* JADX INFO: renamed from: ᩷ */
    public C12096 f33802;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f33803;

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:57:0x0224 A[PHI: r1 r5
      0x0224: PHI (r1v8 l.ܶ᩵ܿ) = (r1v1 l.ܶ᩵ܿ), (r1v7 l.ܶ᩵ܿ), (r1v1 l.ܶ᩵ܿ) binds: [B:56:0x0222, B:44:0x01a0, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:56:0x0222, B:44:0x01a0, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0288 A[PHI: r2 r3
      0x0288: PHI (r2v4 l.ܶ᩵ܿ) = (r2v2 l.ܶ᩵ܿ), (r2v2 l.ܶ᩵ܿ), (r2v7 l.ܶ᩵ܿ) binds: [B:68:0x0286, B:40:0x0177, B:36:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r3v6 l.ܶ᩵ܿ) = (r3v2 l.ܶ᩵ܿ), (r3v5 l.ܶ᩵ܿ), (r3v2 l.ܶ᩵ܿ) binds: [B:68:0x0286, B:40:0x0177, B:36:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02b4 A[PHI: r6 r7
      0x02b4: PHI (r6v3 short[]) = (r6v1 short[]), (r6v1 short[]), (r6v1 short[]), (r6v1 short[]), (r6v5 short[]) binds: [B:72:0x02b2, B:64:0x026b, B:18:0x0073, B:16:0x006f, B:6:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r7v3 char) = (r7v1 char), (r7v1 char), (r7v1 char), (r7v1 char), (r7v5 char) binds: [B:72:0x02b2, B:64:0x026b, B:18:0x0073, B:16:0x006f, B:6:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02e0  */
    /* JADX INFO: renamed from: ֫ */
    private void m27899(boolean z, boolean z2, List list, C13457 c13457, boolean z3) {
        int iM55979;
        int i;
        AbstractC17043 abstractC17043 = null;
        AbstractC17043 abstractC17043M56217 = null;
        short[] sArr = null;
        char c = 0;
        int i2 = 0;
        int i3 = 1597007690;
        int i4 = C1071.f81975;
        int i5 = C1229.f82066;
        int iM55680 = (C0873.m55680("᩹ۨ") ^ i4) * (-79);
        int i6 = ((iM55680 ^ i5) * 32697) ^ (-2022291113);
        int i7 = iM55680 ^ (-1590922495);
        String strM55591 = null;
        boolean zM56124 = false;
        AbstractC17043 abstractC17043M55846 = null;
        AbstractC17043 abstractC17043M55847 = null;
        while (true) {
            i3 = ((((i3 ^ i5) * (-21281)) >> 31) & i6) ^ i7;
            switch (i3) {
                case -2083219881:
                case 579675783:
                    RunnableC0871.m55671(C1229.m56403(f82125, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 5, i2));
                    break;
                case -1956872988:
                case -540504782:
                    try {
                        AbstractC0942.m55966(abstractC17043M55846);
                        iM55979 = C0946.m55979("ᩳۛ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-26279)) ^ (-1107612549);
                        i = -277045368;
                    } catch (IOException unused) {
                        iM55979 = C0946.m55979("ۨܳ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-16861)) ^ (-2025708236);
                        i = 70657292;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1762756091:
                case -1583706433:
                    C1044.m56286();
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("ۗ᩹") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM55979 ^ i5) * 28331) ^ 923434964;
                        i = 1275458954;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ۚ᩺")) * (-37);
                        i6 = ((iM55979 ^ i4) * (-25283)) ^ (-960465947);
                        i = 914250815;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1643692485:
                case 518288471:
                    zM56124 = C1003.m56124(abstractC17043M55846);
                    iM55979 = (i5 - C0873.m55680("ᩴ۫")) * (-9);
                    i6 = ((iM55979 ^ i4) * 32173) ^ 1939432547;
                    i = -905259502;
                    i7 = iM55979 ^ i;
                    break;
                case -1626406007:
                case 1141710078:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ۡۙ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-16031)) ^ (-78486467);
                        i = 2016630244;
                    } else {
                        iM55979 = (C0873.m55680("۬֫") ^ i5) * 57;
                        i6 = ((iM55979 ^ i4) * 21369) ^ 87999056;
                        i = 1990401690;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1539106102:
                case -388582110:
                    if (C1194.f82045 != 0) {
                        iM55979 = (C0946.m55979("۫᩵") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55979 ^ i4) * 13861) ^ 744211655;
                        i = 876045611;
                    } else {
                        iM55979 = C0946.m55979("ۤۖ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 8639) ^ 1596255053;
                        i = -226838657;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1491779069:
                case -46996038:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0946.m55979("ۗ᩹") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM55979 ^ i5) * 28331) ^ 923434964;
                        i = 1275458954;
                    } else {
                        iM55979 = C0946.m55979("ܳ᩶") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-31531)) ^ 644010466;
                        i = -1791337012;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1378005090:
                case -1141591087:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("ۗ᩹") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM55979 ^ i5) * 28331) ^ 923434964;
                        i = 1275458954;
                    } else {
                        iM55979 = C0873.m55680("ᩳۙ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-1857)) ^ 1187305480;
                        i = -1179129969;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1318841969:
                case 646296700:
                    abstractC17043M55846 = C0917.m55846(abstractC17043, C1028.m56235(f82125, IShizukuService.Stub.TRANSACTION_attachUserService, 7, i2));
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0946.m55979("۫᩵") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55979 ^ i4) * 13861) ^ 744211655;
                        i = 876045611;
                    } else {
                        iM55979 = C0946.m55979("᩷ۧ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-29055)) ^ 186909879;
                        i = -101884551;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1283360081:
                case -1250288455:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("᩶᩵") ^ i4;
                        i6 = ((iM55979 ^ i5) * 17283) ^ 1864742674;
                        i = -2027807040;
                    } else {
                        iM55979 = (i5 - C0873.m55680("᩹ܰ")) * (-87);
                        i6 = ((iM55979 ^ i4) * (-15923)) ^ 713276603;
                        i = -481671616;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1157725748:
                case 1133162058:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("ۡۙ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-16031)) ^ (-78486467);
                        i = 2016630244;
                    } else {
                        iM55979 = (C0873.m55680("᩺ۢ") + i4) * 35;
                        i6 = ((iM55979 ^ i5) * 27553) ^ (-279446938);
                        i = -348791237;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -932992012:
                case 1547001882:
                    strM55591 = C0845.m55591(C0892.m55745(this.f33802));
                    this.f33797 = null;
                    abstractC17043 = C17853.f53277;
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("᩶᩵") ^ i4;
                        i6 = ((iM55979 ^ i5) * 17283) ^ 1864742674;
                        i = -2027807040;
                    } else {
                        iM55979 = C0946.m55979("ۤ۟") ^ i5;
                        i6 = ((iM55979 ^ i4) * 2407) ^ 509933463;
                        i = 9701555;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -926322167:
                case -548030231:
                    abstractC17043M55847 = C0917.m55846(abstractC17043M55846, C1025.m56233(f82125, 109, 8, i2));
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0946.m55979("۫᩵") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55979 ^ i4) * 13861) ^ 744211655;
                        i = 876045611;
                    } else {
                        iM55979 = C0873.m55680("ۖܰ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 15593) ^ (-438999450);
                        i = 2110750206;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -922138002:
                case 2116575010:
                    C0892.m55749();
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0873.m55680("ۡۙ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-16031)) ^ (-78486467);
                        i = 2016630244;
                    } else {
                        iM55979 = (C0946.m55979("ۗ᩹") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM55979 ^ i5) * 28331) ^ 923434964;
                        i = 1275458954;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -868260957:
                case 1560092448:
                    abstractC17043M56217 = C1024.m56217(abstractC17043M55846, RunnableC0938.m55936(f82125, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i2));
                    iM55979 = (i4 - C0873.m55680("ۚܺ")) * 19;
                    i6 = ((iM55979 ^ i5) * 1345) ^ (-865402741);
                    i = -1056616649;
                    i7 = iM55979 ^ i;
                    break;
                case -648700156:
                case 1820469651:
                    C1044.m56286();
                    C1044.m56286();
                    iM55979 = C0873.m55680("ۡۙ") ^ i4;
                    i6 = ((iM55979 ^ i5) * (-16031)) ^ (-78486467);
                    i = 2016630244;
                    i7 = iM55979 ^ i;
                    break;
                case -644850446:
                case 1703845940:
                    i2 = 58937;
                    iM55979 = (C0946.m55979("ۡᩴ") ^ i4) * (-81);
                    i6 = ((iM55979 ^ i5) * (-31753)) ^ (-369556808);
                    i = -487572857;
                    i7 = iM55979 ^ i;
                    break;
                case -634150625:
                case 1249428660:
                    i2 = 7838;
                    iM55979 = (C0946.m55979("ۡᩴ") ^ i4) * (-81);
                    i6 = ((iM55979 ^ i5) * (-31753)) ^ (-369556808);
                    i = -487572857;
                    i7 = iM55979 ^ i;
                    break;
                case 139243838:
                case 1585993532:
                    C0949.m56012();
                    RunnableC1014.m56177();
                    break;
                case 335190548:
                case 513797384:
                    C0912.m55833();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (i5 - C0946.m55979("ۚ᩺")) * (-37);
                        i6 = ((iM55979 ^ i4) * (-25283)) ^ (-960465947);
                        i = 914250815;
                    } else {
                        iM55979 = C0946.m55979("᩶᩵") ^ i4;
                        i6 = ((iM55979 ^ i5) * 17283) ^ 1864742674;
                        i = -2027807040;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case 594715330:
                case 1159440686:
                    C0890.m55729(new C14105(this, abstractC17043M55847, abstractC17043M55846, abstractC17043M56217, strM55591, z, z2, list, c13457, z3));
                    break;
                case 1478124823:
                case 1520516593:
                    short s = sArr[c];
                    int i8 = s * 16276;
                    int i9 = s + 4069;
                    if (i8 - (i9 * i9) > 0) {
                        iM55979 = C0946.m55979("֨ۚ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 7173) ^ (-1422830302);
                        i = 1807995498;
                    } else {
                        iM55979 = (i5 - C0873.m55680("֨۟")) * (-27);
                        i6 = ((iM55979 ^ i4) * 11181) ^ (-241385322);
                        i = -499239518;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case 1586454535:
                case 1910015755:
                    C0927.m55872(abstractC17043M55846);
                    C0927.m55872(abstractC17043M56217);
                    iM55979 = C0873.m55680("ۢ۫") ^ i5;
                    i6 = ((iM55979 ^ i4) * (-17791)) ^ (-488353502);
                    i = -1836926004;
                    i7 = iM55979 ^ i;
                    break;
                case 1957492002:
                case 1987533425:
                    if (zM56124) {
                        iM55979 = C0946.m55979("֡ۤ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-14125)) ^ 1904981050;
                        i = -109844847;
                    } else {
                        iM55979 = C0946.m55979("ᩳۛ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-26279)) ^ (-1107612549);
                        i = -277045368;
                    }
                    i7 = iM55979 ^ i;
                    break;
                default:
                    sArr = f82125;
                    c = 'e';
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("ۡۙ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-16031)) ^ (-78486467);
                        i = 2016630244;
                    } else {
                        iM55979 = (C0873.m55680("ᩴ᩵") ^ i4) * 45;
                        i6 = ((iM55979 ^ i5) * (-17701)) ^ (-1608939256);
                        i = -1771356550;
                    }
                    i7 = iM55979 ^ i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m27894(C12094 c12094, C0990 c0990, C0990 c0991, List list, C13457 c13457, boolean z) {
        int i = 1226255464;
        int i2 = C0930.f81879;
        int i3 = C0912.f81867;
        int iM55979 = C0946.m55979("۠֨") ^ i2;
        int i4 = ((iM55979 ^ i3) * 22987) ^ 877124526;
        int i5 = 2075993032;
        while (true) {
            i = ((((i ^ i3) * (-11275)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1816952366:
                case 1261464900:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("ᩴۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31913) ^ 730807325;
                        i5 = -1220067772;
                    } else {
                        iM55979 = (C0873.m55680("ۘ᩺") ^ i2) * 53;
                        i4 = ((iM55979 ^ i3) * 19475) ^ 702013230;
                        i5 = -1194298309;
                    }
                    break;
                case -1708871637:
                case 1805267447:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0946.m55979("ۧܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27079) ^ 1117339992;
                        i5 = -1109790510;
                    } else {
                        iM55979 = (C0873.m55680("֨ۘ") ^ i2) * 25;
                        i4 = ((iM55979 ^ i3) * 19647) ^ 143870725;
                        i5 = -1959399989;
                    }
                    break;
                case -1380237350:
                case -32246155:
                    C1028.m56247();
                    C1929.m56553();
                    break;
                case -1098316826:
                case 543335509:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("ۧܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27079) ^ 1117339992;
                        i5 = -1109790510;
                    } else {
                        iM55979 = C0946.m55979("֫ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 5215) ^ (-1657743407);
                        i5 = 1456985994;
                    }
                    break;
                case -904877274:
                case 465567645:
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("᩻᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1047)) ^ 1029807252;
                        i5 = 154358174;
                    } else {
                        iM55979 = (i3 - C0873.m55680("֫۬")) * 65;
                        i4 = ((iM55979 ^ i2) * 18669) ^ (-588625033);
                        i5 = 2103643383;
                    }
                    break;
                case -602314830:
                case 583068189:
                    if (RunnableC1014.f81941 > 0) {
                        iM55979 = C0946.m55979("ᩴۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31913) ^ 730807325;
                        i5 = -1220067772;
                    } else {
                        iM55979 = C0946.m55979("᩻᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1047)) ^ 1029807252;
                        i5 = 154358174;
                    }
                    break;
                case -389674866:
                case 85072224:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("᩻᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1047)) ^ 1029807252;
                        i5 = 154358174;
                    } else {
                        iM55979 = C0946.m55979("ۧܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27079) ^ 1117339992;
                        i5 = -1109790510;
                    }
                    break;
                case -245559685:
                case 1295789411:
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0946.m55979("᩷۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17801) ^ 83195072;
                        i5 = -1613723789;
                    } else {
                        iM55979 = C0873.m55680("ۨܳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-12553)) ^ 1312451236;
                        i5 = 1288904979;
                    }
                    break;
                case -191963360:
                case 1865317215:
                    C0845.m55584();
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0946.m55979("ۧܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27079) ^ 1117339992;
                        i5 = -1109790510;
                    } else {
                        iM55979 = (C0946.m55979("ۤ۟") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i3) * 18077) ^ 793172015;
                        i5 = -1528064383;
                    }
                    break;
                case 354269941:
                case 1678063603:
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0946.m55979("᩷۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17801) ^ 83195072;
                        i5 = -1613723789;
                    } else {
                        iM55979 = (C0946.m55979("᩵ۛ") + i2) * (-79);
                        i4 = ((iM55979 ^ i3) * (-8245)) ^ 2053776747;
                        i5 = -642885478;
                    }
                    break;
                case 367974495:
                case 1945706913:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("᩷۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17801) ^ 83195072;
                        i5 = -1613723789;
                    } else {
                        iM55979 = C0873.m55680("ۙܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12249)) ^ (-736994294);
                        i5 = -45939953;
                    }
                    break;
                case 663584567:
                case 1279647782:
                    C0927.m55873();
                    C0917.m55854();
                    iM55979 = C0946.m55979("ۧܺ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 27079) ^ 1117339992;
                    i5 = -1109790510;
                    break;
                case 788759446:
                case 1426102518:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("ۧܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27079) ^ 1117339992;
                        i5 = -1109790510;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۠᩶")) * (-123);
                        i4 = ((iM55979 ^ i2) * (-15403)) ^ (-1280925160);
                        i5 = 549958037;
                    }
                    break;
                case 817608693:
                case 1260508838:
                    c12094.m27899(C0949.m56014(c0990), C0877.m55695(c0991), list, c13457, z);
                    break;
                case 1616540037:
                case 1651416494:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0946.m55979("᩷۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17801) ^ 83195072;
                        i5 = -1613723789;
                    } else {
                        iM55979 = C0873.m55680("ܰۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13277) ^ 1371950055;
                        i5 = -336691776;
                    }
                    break;
                default:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("᩷۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17801) ^ 83195072;
                        i5 = -1613723789;
                    } else {
                        iM55979 = C0946.m55979("֨ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11771)) ^ 1321097536;
                        i5 = -638657231;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0219, code lost:
    
        if (p067l.C0854.f81826 != 0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12094(AbstractC17043 abstractC17043, final C18107 c18107, final String str) throws Throwable {
        int iM55979;
        int i;
        DialogInterfaceC2564 dialogInterfaceC2564;
        Object obj;
        C0990 c0990;
        String str2;
        View viewM56111;
        Object obj2;
        int i2;
        short[] sArr;
        int i3;
        int i4;
        short[] sArr2;
        short[] sArr3;
        short[] sArr4;
        short[] sArr5;
        String str3;
        C20671 c20671;
        boolean z;
        boolean z2;
        boolean z3;
        C12096 c12096;
        InterfaceC14100 interfaceC14100;
        int i5;
        int i6;
        Throwable th;
        C20671 c20672;
        boolean z4;
        int i7;
        boolean z5;
        int iM559710;
        int i8;
        int i9;
        int i10;
        String str4;
        C20671 c20673;
        boolean z6;
        boolean z7;
        boolean z8;
        C12096 c12097;
        InterfaceC14100 interfaceC14101;
        int i11;
        Throwable th2;
        View view;
        Object obj3;
        short[] sArr6;
        int i12;
        int i13;
        int i14;
        int i15;
        int iM55680;
        DialogInterfaceC2564 dialogInterfaceC2565;
        Object obj4;
        int i16;
        String str5;
        int i17;
        short[] sArr7;
        short[] sArr8;
        short[] sArr9;
        String str6;
        C20671 c20674;
        boolean z9;
        boolean z10;
        boolean z11;
        C12096 c12098;
        InterfaceC14100 interfaceC14102;
        int i18;
        int i19;
        Throwable th3;
        View view2;
        Object obj5;
        short[] sArr10;
        C0990 c0991;
        int iM559711;
        int i20;
        int i21;
        DialogInterfaceC2564 dialogInterfaceC2566;
        Object obj6;
        int i22;
        int i23;
        short[] sArr11;
        short[] sArr12;
        int i24;
        short[] sArr13;
        int iM55681;
        int i25;
        int i26;
        int i27;
        boolean z12;
        boolean z13;
        short[] sArr14;
        C0990 c0992;
        short[] sArr15;
        boolean z14;
        int iM55682;
        int i28;
        int i29;
        DialogInterfaceC2564 dialogInterfaceC2567;
        int i30;
        short[] sArr16;
        short[] sArr17;
        Throwable th4;
        View view3;
        Object obj7;
        short[] sArr18;
        short[] sArr19;
        C12096 c12099;
        InterfaceC14100 interfaceC14103;
        int i31;
        boolean z15;
        String strM55921;
        int iM55683;
        int i32;
        int i33;
        int i34;
        short[] sArr20;
        Throwable th5;
        View view4;
        Object obj8;
        short[] sArr21;
        String str7;
        InterfaceC14100 interfaceC14104;
        String str8;
        DialogInterfaceC2564 dialogInterfaceC2568;
        C12096 c120910;
        int iM55684;
        int i35;
        int i36;
        int i37;
        C20671 c20675;
        boolean z16;
        int i38;
        Throwable th6;
        View view5;
        Object obj9;
        int iM559712;
        int i39;
        int i40;
        short[] sArr22;
        short[] sArr23;
        int iM55685;
        int i41;
        Throwable th7;
        int i42;
        C20671 c20671M55654;
        View view6;
        int iM55686;
        C20671 c20676;
        int iM559713;
        int i43;
        int i44;
        int iM55687;
        int i45;
        int i46 = -1338678069;
        int i47 = RunnableC1014.f81941;
        int i48 = C1003.f81929;
        short s = f82125[0];
        int i49 = s + 6501;
        int i50 = (s * s) + 42263001;
        int i51 = (i49 * i49) - (i50 + i50) > 0 ? 17151 : 7612;
        int iM55688 = (C0873.m55680("֡᩹") + i47) * (-65);
        int i52 = ((iM55688 ^ i48) * 25441) ^ 1968588646;
        int i53 = iM55688 ^ (-1288931693);
        int i54 = i51;
        View view7 = null;
        C12096 c120911 = null;
        Throwable th8 = null;
        String str9 = null;
        short[] sArr24 = null;
        short[] sArr25 = null;
        short[] sArr26 = null;
        short[] sArr27 = null;
        InputStream inputStreamM55830 = null;
        int i55 = 0;
        int iM55651 = 0;
        int i56 = 0;
        boolean z17 = false;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = i52;
        final C0990 c0993 = null;
        String str10 = null;
        C20671 c20677 = null;
        Object obj10 = null;
        DialogInterfaceC2564 dialogInterfaceC2569 = null;
        short[] sArr28 = null;
        C0990 c0994 = null;
        C12096 c120912 = null;
        InterfaceC14100 interfaceC14105 = null;
        Main mainM56594 = null;
        boolean z18 = false;
        int i62 = 0;
        boolean z19 = false;
        final C0990 c0995 = null;
        Object obj11 = null;
        InterfaceC14100 interfaceC14106 = null;
        int iM559714 = 0;
        while (true) {
            i46 = i53 ^ ((((i46 ^ i48) * 237) >> 31) & i61);
            switch (i46) {
                case -2085821334:
                case -767365546:
                    Object obj12 = obj10;
                    i37 = i54;
                    sArr22 = sArr28;
                    C20671 c20678 = c20677;
                    z16 = z18;
                    i38 = i57;
                    th6 = th8;
                    view5 = view7;
                    obj9 = obj12;
                    c20675 = c20678;
                    short[] sArr29 = sArr27;
                    sArr23 = sArr29;
                    C0947.m55996(C1404.m56465(view5, C0873.m55680(C0946.m55986(sArr29, 40, 3, i37)) ^ 2100757424), new ViewOnClickListenerC10159(1, this));
                    mainM56594 = C1964.m56594(c18107);
                    if (C0898.f81858 <= 0) {
                        iM55685 = C0946.m55979("ܰ֡") ^ i48;
                        i39 = ((iM55685 ^ i47) * 18725) ^ 27643640;
                        i41 = -891783808;
                    } else {
                        iM55685 = (i47 - C0873.m55680("ܰۜ")) * (-33);
                        i39 = ((iM55685 ^ i48) * (-18587)) ^ (-2008473386);
                        i41 = 270738899;
                    }
                    i53 = iM55685 ^ i41;
                    sArr28 = sArr22;
                    sArr27 = sArr23;
                    obj10 = obj9;
                    view7 = view5;
                    th8 = th6;
                    i57 = i38;
                    z18 = z16;
                    c20677 = c20675;
                    i54 = i37;
                    i61 = i39;
                    break;
                case -2022584963:
                case -1878870392:
                    C0990 c0996 = c0994;
                    String str11 = str10;
                    int i63 = i54;
                    String str12 = str9;
                    c20672 = c20677;
                    z4 = z18;
                    InterfaceC14100 interfaceC14107 = interfaceC14106;
                    int i64 = i57;
                    Throwable th9 = th8;
                    View view8 = view7;
                    this.f33794 = C1929.m56560(c18107);
                    this.f33796 = c18107;
                    this.f33800 = abstractC17043;
                    z17 = false;
                    int iM559715 = C0946.m55979("ܿۗ") ^ i48;
                    i58 = i58;
                    i59 = i59;
                    iM559714 = iM559714;
                    i60 = i60;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    dialogInterfaceC2569 = dialogInterfaceC2569;
                    obj11 = obj11;
                    sArr25 = sArr25;
                    sArr24 = sArr24;
                    i62 = i62;
                    c120911 = c120911;
                    sArr28 = sArr28;
                    z19 = true;
                    obj10 = obj10;
                    view7 = view8;
                    th8 = th9;
                    i57 = i64;
                    interfaceC14106 = interfaceC14107;
                    str9 = str12;
                    str10 = str11;
                    c0994 = c0996;
                    i7 = i63;
                    i61 = ((iM559715 ^ i47) * 6833) ^ (-60089571);
                    i53 = iM559715 ^ (-1896191168);
                    z18 = z4;
                    c20677 = c20672;
                    i54 = i7;
                    break;
                case -1882530392:
                case 678706491:
                    dialogInterfaceC2564 = dialogInterfaceC2569;
                    obj = obj11;
                    c0990 = c0994;
                    str2 = str10;
                    obj2 = obj10;
                    i2 = i54;
                    sArr = sArr24;
                    i3 = i58;
                    i4 = i59;
                    sArr2 = sArr25;
                    sArr3 = sArr26;
                    sArr4 = sArr27;
                    sArr5 = sArr28;
                    str3 = str9;
                    c20671 = c20677;
                    z = z18;
                    z2 = z17 ? 1 : 0;
                    z3 = z19;
                    c12096 = c120911;
                    interfaceC14100 = interfaceC14106;
                    i5 = i57;
                    i6 = i60;
                    th = th8;
                    viewM56111 = C0992.m56111(C1929.m56560(c18107), C0873.m55680(C0967.m56077(f82125, 1, 3, i2)) ^ 2128049835);
                    iM559714 = C0946.m55979(RunnableC0871.m55667(f82125, 4, 3, i2)) ^ 2120217567;
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0873.m55680("ܽۨ") ^ i47;
                        i15 = ((iM55680 ^ i48) * 17247) ^ (-610436288);
                        i14 = -1168043379;
                    } else {
                        iM55680 = (i48 - C0873.m55680("ۧۙ")) * (-51);
                        i15 = ((iM55680 ^ i47) * (-22349)) ^ 33278081;
                        i14 = -926407639;
                    }
                    int i65 = iM55680 ^ i14;
                    i58 = i3;
                    i59 = i4;
                    i60 = i6;
                    th8 = th;
                    sArr27 = sArr4;
                    sArr26 = sArr3;
                    dialogInterfaceC2569 = dialogInterfaceC2564;
                    obj11 = obj;
                    sArr25 = sArr2;
                    sArr24 = sArr;
                    c120911 = c12096;
                    i57 = i5;
                    interfaceC14106 = interfaceC14100;
                    str9 = str3;
                    z19 = z3;
                    str10 = str2;
                    c0994 = c0990;
                    z17 = z2;
                    z18 = z;
                    c20677 = c20671;
                    i54 = i2;
                    i61 = i15;
                    sArr28 = sArr5;
                    obj10 = obj2;
                    view7 = viewM56111;
                    i53 = i65;
                    break;
                case -1868263679:
                case 1778773693:
                    C11896.m27216(c18107, dialogInterfaceC2569, str);
                    iM55687 = C0873.m55680("᩸᩶") ^ i48;
                    i61 = ((iM55687 ^ i47) * 16835) ^ (-475326387);
                    i45 = 1463040261;
                    i53 = iM55687 ^ i45;
                    break;
                case -1858140214:
                case 1528599594:
                    if (C1024.m56209() < 0) {
                        dialogInterfaceC2568 = dialogInterfaceC2569;
                        c120910 = c120911;
                        i34 = i54;
                        sArr20 = sArr27;
                        c20672 = c20677;
                        z4 = z18;
                        str7 = str10;
                        str8 = str9;
                        interfaceC14104 = interfaceC14106;
                        i33 = i57;
                        th5 = th8;
                        view4 = view7;
                        obj8 = obj10;
                        sArr21 = sArr28;
                        iM55684 = C0873.m55680("ۧ֫") ^ i48;
                        i35 = ((iM55684 ^ i47) * 28471) ^ (-1517593490);
                        i36 = 879298300;
                        i53 = iM55684 ^ i36;
                        c120911 = c120910;
                        sArr27 = sArr20;
                        dialogInterfaceC2569 = dialogInterfaceC2568;
                        i7 = i34;
                        i61 = i35;
                        sArr28 = sArr21;
                        obj10 = obj8;
                        view7 = view4;
                        th8 = th5;
                        i57 = i33;
                        interfaceC14106 = interfaceC14104;
                        str9 = str8;
                        str10 = str7;
                        z18 = z4;
                        c20677 = c20672;
                        i54 = i7;
                    } else {
                        iM55686 = i57;
                        c20671M55654 = c20677;
                        i42 = i54;
                        th7 = th8;
                        z6 = z18;
                        view6 = view7;
                        int iM55689 = (i47 - C0873.m55680("۠᩻")) * (-53);
                        C20671 c20679 = c20671M55654;
                        i54 = i42;
                        i61 = ((iM55689 ^ i48) * 29881) ^ 663121161;
                        i53 = iM55689 ^ 1865151281;
                        z18 = z6;
                        c20677 = c20679;
                        view7 = view6;
                        th8 = th7;
                        i57 = iM55686;
                    }
                    break;
                case -1741782920:
                case -1320881450:
                    i27 = i54;
                    C1028.m56238(c0993, i55);
                    z12 = z17 ? 1 : 0;
                    C0890.m55728(c0993, z12);
                    z13 = z19;
                    sArr14 = sArr25;
                    int iM556810 = C0873.m55680("᩺ۤ") ^ i47;
                    int i66 = ((iM556810 ^ i48) * (-29773)) ^ (-51869487);
                    i53 = iM556810 ^ 424367438;
                    i60 = i60;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    dialogInterfaceC2569 = dialogInterfaceC2569;
                    obj11 = obj11;
                    sArr25 = sArr14;
                    c120911 = c120911;
                    z19 = z13;
                    z17 = z12;
                    z18 = z18;
                    c20677 = c20677;
                    i54 = i27;
                    i61 = i66;
                    sArr28 = sArr28;
                    obj10 = obj10;
                    view7 = view7;
                    th8 = th8;
                    i57 = i57;
                    interfaceC14106 = interfaceC14106;
                    str9 = str9;
                    str10 = str10;
                    c0994 = c0994;
                    break;
                case -1736548605:
                case 1842013984:
                    if (inputStreamM55830 == null) {
                        z5 = z17 ? 1 : 0;
                        iM559710 = C0946.m55979("᩺ۛ") ^ i47;
                        i8 = ((iM559710 ^ i48) * (-12495)) ^ (-1695621705);
                        i9 = -299684956;
                        i53 = iM559710 ^ i9;
                        i58 = i58;
                        i59 = i59;
                        iM559714 = iM559714;
                        i60 = i60;
                        sArr27 = sArr27;
                        sArr26 = sArr26;
                        dialogInterfaceC2569 = dialogInterfaceC2569;
                        obj11 = obj11;
                        sArr25 = sArr25;
                        sArr24 = sArr24;
                        i62 = i62;
                        c120911 = c120911;
                        sArr28 = sArr28;
                        z19 = z19;
                        obj10 = obj10;
                        view7 = view7;
                        z17 = z5;
                        th8 = th8;
                        z18 = z18;
                        c20677 = c20677;
                        i54 = i54;
                        i57 = i57;
                        interfaceC14106 = interfaceC14106;
                        str9 = str9;
                        i61 = i8;
                        str10 = str10;
                        c0994 = c0994;
                    } else {
                        iM55979 = C0946.m55979("᩵᩻") ^ i47;
                        i61 = (-1488529097) ^ ((iM55979 ^ i48) * 3281);
                        i = 665451155;
                        i53 = iM55979 ^ i;
                    }
                    break;
                case -1732759358:
                case -225370850:
                    throw th8;
                case -1707403515:
                case 2023924553:
                    dialogInterfaceC2566 = dialogInterfaceC2569;
                    c0992 = c0994;
                    i10 = i54;
                    sArr11 = sArr26;
                    sArr12 = sArr27;
                    c20673 = c20677;
                    z6 = z18;
                    String str13 = str10;
                    str4 = str9;
                    interfaceC14101 = interfaceC14106;
                    i11 = i57;
                    th2 = th8;
                    view = view7;
                    obj3 = obj10;
                    sArr6 = sArr28;
                    z14 = z19;
                    c12097 = c120911;
                    i24 = i60;
                    str10 = str13;
                    obj6 = obj11;
                    C0890.m55728(c0995, C0890.m55727(ApplicationC21448.f67649, C0967.m56077(f82125, 22, 4, i10), z14));
                    C0917.m55841(c0995, new CompoundButton.OnCheckedChangeListener(this) { // from class: l.ۚۤܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C12094 f19367;

                        {
                            int i67 = -1907863441;
                            int i68 = C0912.f81867;
                            int i69 = C0873.f81841;
                            int iM559716 = C0946.m55979("᩸ܿ") ^ i68;
                            int i70 = ((iM559716 ^ i69) * 20801) ^ 1653023528;
                            int i71 = 406082456;
                            while (true) {
                                i67 = ((((i67 ^ i69) * 3405) >> 31) & i70) ^ (iM559716 ^ i71);
                                switch (i67) {
                                    case -2135744233:
                                    case -1276152849:
                                        C1404.m56468();
                                        if (!C1024.f81946) {
                                            iM559716 = C0873.m55680("ܺܶ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 1501) ^ (-950704988);
                                            i71 = -487068718;
                                        } else {
                                            iM559716 = (C0873.m55680("֡᩷") + i69) * 49;
                                            i70 = ((iM559716 ^ i68) * 27253) ^ 1400438004;
                                            i71 = -1387591307;
                                        }
                                        break;
                                    case -1589782662:
                                    case 54798760:
                                        C1024.m56209();
                                        iM559716 = (C0946.m55979("۫֡") + i69) * (-81);
                                        i70 = ((iM559716 ^ i68) * 16531) ^ 1952063573;
                                        i71 = 1375052286;
                                        break;
                                    case -1440119718:
                                    case -603521462:
                                        if (RunnableC0897.m55784()) {
                                            iM559716 = C0873.m55680("ܺܶ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 1501) ^ (-950704988);
                                            i71 = -487068718;
                                        } else {
                                            iM559716 = C0946.m55979("ܿۘ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 30899) ^ (-1099986772);
                                            i71 = 1974768688;
                                        }
                                        break;
                                    case -1232321291:
                                    case -246461943:
                                        C0937.m55918();
                                        if (C1071.m56343() == 0) {
                                            iM559716 = C0873.m55680("ܺܶ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 1501) ^ (-950704988);
                                            i71 = -487068718;
                                        } else {
                                            iM559716 = (C0946.m55979("۫֡") + i69) * (-81);
                                            i70 = ((iM559716 ^ i68) * 16531) ^ 1952063573;
                                            i71 = 1375052286;
                                        }
                                        break;
                                    case -873500140:
                                    case 1559545894:
                                        if (C1048.f81963) {
                                            iM559716 = (i68 - C0946.m55979("ᩴۘ")) * (-65);
                                            i70 = ((iM559716 ^ i69) * (-30177)) ^ 1862535498;
                                            i71 = -1119171045;
                                        } else {
                                            iM559716 = (i68 - C0873.m55680("ܺ᩶")) * 27;
                                            i70 = ((iM559716 ^ i69) * (-17211)) ^ (-1023010217);
                                            i71 = 784640344;
                                        }
                                        break;
                                    case -690147041:
                                    case 470854272:
                                        if (C0955.f81898) {
                                            iM559716 = C0873.m55680("ܺܶ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 1501) ^ (-950704988);
                                            i71 = -487068718;
                                        } else {
                                            iM559716 = (C0873.m55680("ۨۡ") + i69) * 37;
                                            i70 = ((iM559716 ^ i68) * (-19923)) ^ 2000860945;
                                            i71 = -799148273;
                                        }
                                        break;
                                    case -334821152:
                                    case 914270429:
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM559716 = (C0946.m55979("۫֡") + i69) * (-81);
                                            i70 = ((iM559716 ^ i68) * 16531) ^ 1952063573;
                                            i71 = 1375052286;
                                        } else {
                                            iM559716 = (C0946.m55979("ۧܿ") ^ i69) * 77;
                                            i70 = ((iM559716 ^ i68) * 27411) ^ (-710965600);
                                            i71 = 989850252;
                                        }
                                        break;
                                    case -145801544:
                                    case 370049229:
                                        if (C0955.f81898) {
                                            iM559716 = (C0873.m55680("֨᩵") ^ i68) * (-99);
                                            i70 = ((iM559716 ^ i69) * (-22415)) ^ 513347547;
                                            i71 = 1214891650;
                                        } else {
                                            iM559716 = C0873.m55680("֡ܽ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 13081) ^ 1145321255;
                                            i71 = -1157309172;
                                        }
                                        break;
                                    case -120671452:
                                    case 1479870909:
                                        if (C1036.m56257() <= 0) {
                                            iM559716 = (C0873.m55680("֨᩵") ^ i68) * (-99);
                                            i70 = ((iM559716 ^ i69) * (-22415)) ^ 513347547;
                                            i71 = 1214891650;
                                        } else {
                                            iM559716 = (C0873.m55680("ۧ۠") ^ i68) * (-21);
                                            i70 = ((iM559716 ^ i69) * 24439) ^ 1107692072;
                                            i71 = 651501958;
                                        }
                                        break;
                                    case -50796106:
                                    case 1543353291:
                                        this.f19367 = this;
                                        if (C1071.f81975 <= 0) {
                                            iM559716 = (C0873.m55680("֨᩵") ^ i68) * (-99);
                                            i70 = ((iM559716 ^ i69) * (-22415)) ^ 513347547;
                                            i71 = 1214891650;
                                        } else {
                                            iM559716 = C0873.m55680("ᩳۜ") ^ i69;
                                            i70 = ((iM559716 ^ i68) * (-14913)) ^ (-95358128);
                                            i71 = 1287476546;
                                        }
                                        break;
                                    case -36276565:
                                    case 1998257483:
                                        return;
                                    case 65950239:
                                    case 474678810:
                                        C1017.m56187();
                                        throw new RuntimeException();
                                    case 90667445:
                                    case 229212316:
                                        if (C0927.m55873() <= 0) {
                                            iM559716 = (C0873.m55680("֨᩵") ^ i68) * (-99);
                                            i70 = ((iM559716 ^ i69) * (-22415)) ^ 513347547;
                                            i71 = 1214891650;
                                        } else {
                                            iM559716 = (i69 - C0873.m55680("ۙۢ")) * 49;
                                            i70 = ((iM559716 ^ i68) * 23279) ^ (-1451744056);
                                            i71 = 1201894157;
                                        }
                                        break;
                                    case 143529168:
                                    case 1697320449:
                                        AbstractC0942.m55971();
                                        if (C1048.m56305() >= 0) {
                                            iM559716 = (C0873.m55680("֨᩵") ^ i68) * (-99);
                                            i70 = ((iM559716 ^ i69) * (-22415)) ^ 513347547;
                                            i71 = 1214891650;
                                        } else {
                                            iM559716 = (C0873.m55680("֡᩷") + i69) * 49;
                                            i70 = ((iM559716 ^ i68) * 27253) ^ 1400438004;
                                            i71 = -1387591307;
                                        }
                                        break;
                                    case 1504938428:
                                    case 2080425322:
                                        if (C1012.f81938 >= 0) {
                                            iM559716 = (C0946.m55979("۫֡") + i69) * (-81);
                                            i70 = ((iM559716 ^ i68) * 16531) ^ 1952063573;
                                            i71 = 1375052286;
                                        } else {
                                            iM559716 = (C0873.m55680("֫ۡ") ^ i68) * 27;
                                            i70 = ((iM559716 ^ i69) * 1511) ^ 1314749497;
                                            i71 = 737214378;
                                        }
                                        break;
                                    default:
                                        if (C1964.f83032 <= 0) {
                                            iM559716 = (C0873.m55680("֨᩵") ^ i68) * (-99);
                                            i70 = ((iM559716 ^ i69) * (-22415)) ^ 513347547;
                                            i71 = 1214891650;
                                        } else {
                                            iM559716 = (i69 - C0946.m55979("ۚܽ")) * (-113);
                                            i70 = ((iM559716 ^ i68) * (-14887)) ^ 756016801;
                                            i71 = 1382994263;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                            int i67 = 425865866;
                            int i68 = C1044.f81959;
                            int i69 = ViewOnClickListenerC0939.f81888;
                            int iM559716 = (C0946.m55979("ᩳ᩵") + i68) * (-21);
                            int i70 = ((iM559716 ^ i69) * (-10173)) ^ (-594166074);
                            int i71 = -568606665;
                            while (true) {
                                i67 = ((((i67 ^ i69) * (-11227)) >> 31) & i70) ^ (iM559716 ^ i71);
                                switch (i67) {
                                    case -2099470526:
                                    case -1801943505:
                                        C1017.m56187();
                                        if (!C0917.f81868) {
                                            iM559716 = C0946.m55979("ۨܰ") ^ i69;
                                            i70 = ((iM559716 ^ i68) * 30797) ^ (-1563508210);
                                            i71 = -1125116481;
                                        } else {
                                            iM559716 = (C0873.m55680("֫ᩴ") + i69) * (-9);
                                            i70 = ((iM559716 ^ i68) * 4677) ^ 1032897174;
                                            i71 = 781168226;
                                        }
                                        break;
                                    case -1957139211:
                                    case -388797248:
                                        C0892.m55749();
                                        C0892.m55749();
                                        iM559716 = C0873.m55680("᩹ۢ") ^ i68;
                                        i70 = ((iM559716 ^ i69) * 31309) ^ (-695684878);
                                        i71 = -1283960945;
                                        break;
                                    case -1921518956:
                                    case 240769801:
                                        if (C1036.m56257() <= 0) {
                                            iM559716 = C0946.m55979("ۨܰ") ^ i69;
                                            i70 = ((iM559716 ^ i68) * 30797) ^ (-1563508210);
                                            i71 = -1125116481;
                                        } else {
                                            iM559716 = (i69 - C0873.m55680("۟ܶ")) * 109;
                                            i70 = ((iM559716 ^ i68) * 32611) ^ (-1651463707);
                                            i71 = -369587853;
                                        }
                                        break;
                                    case -1606185831:
                                    case 958268957:
                                        if (C0992.f81922 >= 0) {
                                            iM559716 = (i69 - C0873.m55680("ܳ᩹")) * (-55);
                                            i70 = ((iM559716 ^ i68) * (-26573)) ^ (-1379422275);
                                            i71 = 1369917162;
                                        } else {
                                            iM559716 = C0946.m55979("ܳۧ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 22225) ^ (-342383638);
                                            i71 = 704624028;
                                        }
                                        break;
                                    case -1583070640:
                                    case 541130833:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559716 = (C0946.m55979("ۗۛ") + i68) * (-67);
                                            i70 = ((iM559716 ^ i69) * 19501) ^ 2042584946;
                                            i71 = -613839645;
                                        } else {
                                            iM559716 = C0946.m55979("ܿۘ") ^ i69;
                                            i70 = ((iM559716 ^ i68) * 19401) ^ (-152335035);
                                            i71 = 358489849;
                                        }
                                        break;
                                    case -1422903469:
                                    case -90763908:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM559716 = C0946.m55979("ۨܰ") ^ i69;
                                            i70 = ((iM559716 ^ i68) * 30797) ^ (-1563508210);
                                            i71 = -1125116481;
                                        } else {
                                            iM559716 = C0873.m55680("ܶ۟") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 25531) ^ (-1548965642);
                                            i71 = 1676265304;
                                        }
                                        break;
                                    case -1121313741:
                                    case 416627389:
                                        if (C0845.f81821 >= 0) {
                                            iM559716 = (C0946.m55979("ۗۛ") + i68) * (-67);
                                            i70 = ((iM559716 ^ i69) * 19501) ^ 2042584946;
                                            i71 = -613839645;
                                        } else {
                                            iM559716 = (C0873.m55680("֫ᩴ") + i69) * (-9);
                                            i70 = ((iM559716 ^ i68) * 4677) ^ 1032897174;
                                            i71 = 781168226;
                                        }
                                        break;
                                    case -888759643:
                                    case 366959541:
                                        C12094.m27895(this.f19367, c0995, z20);
                                        break;
                                    case -851604439:
                                    case 1673508184:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM559716 = (C0873.m55680("֫ᩴ") + i69) * (-9);
                                            i70 = ((iM559716 ^ i68) * 4677) ^ 1032897174;
                                            i71 = 781168226;
                                        } else {
                                            iM559716 = C0873.m55680("᩸ᩳ") ^ i69;
                                            i70 = ((iM559716 ^ i68) * 4169) ^ (-483638040);
                                            i71 = 1725909224;
                                        }
                                        break;
                                    case -600879875:
                                    case -340643607:
                                        if (C0863.m55643()) {
                                            iM559716 = C0946.m55979("ۛۤ") ^ i69;
                                            i70 = ((iM559716 ^ i68) * (-16431)) ^ (-216023070);
                                            i71 = 1832745283;
                                        } else {
                                            iM559716 = (C0873.m55680("֫ᩴ") + i69) * (-9);
                                            i70 = ((iM559716 ^ i68) * 4677) ^ 1032897174;
                                            i71 = 781168226;
                                        }
                                        break;
                                    case -558979710:
                                    case 991978974:
                                        C0863.m55643();
                                        break;
                                    case 271593737:
                                    case 304805725:
                                        if (C1229.m56410() != 0) {
                                            iM559716 = (i69 - C0873.m55680("ܳ᩹")) * (-55);
                                            i70 = ((iM559716 ^ i68) * (-26573)) ^ (-1379422275);
                                            i71 = 1369917162;
                                        } else {
                                            iM559716 = C0946.m55979("᩶ܶ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * (-2495)) ^ (-115927745);
                                            i71 = 1130279165;
                                        }
                                        break;
                                    case 607629506:
                                    case 669968652:
                                        C0866.m55645();
                                        if (C0894.m55769() >= 0) {
                                            iM559716 = C0946.m55979("ۨܰ") ^ i69;
                                            i70 = ((iM559716 ^ i68) * 30797) ^ (-1563508210);
                                            i71 = -1125116481;
                                        } else {
                                            iM559716 = C0873.m55680("᩹ۢ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 31309) ^ (-695684878);
                                            i71 = -1283960945;
                                        }
                                        break;
                                    case 855613988:
                                    case 1322794616:
                                        if (C1929.f83011 != 0) {
                                            iM559716 = C0873.m55680("᩹ۢ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 31309) ^ (-695684878);
                                            i71 = -1283960945;
                                        } else {
                                            iM559716 = C0873.m55680("ۢۚ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * (-24739)) ^ 637847092;
                                            i71 = 594279091;
                                        }
                                        break;
                                    case 916688414:
                                    case 993501555:
                                        if (C1003.f81929 <= 0) {
                                            iM559716 = (C0946.m55979("ۗۛ") + i68) * (-67);
                                            i70 = ((iM559716 ^ i69) * 19501) ^ 2042584946;
                                            i71 = -613839645;
                                        } else {
                                            iM559716 = (C0946.m55979("ܰۧ") + i68) * 65;
                                            i70 = ((iM559716 ^ i69) * 24323) ^ 2034188057;
                                            i71 = -52007401;
                                        }
                                        break;
                                    default:
                                        if (C0930.m55885() <= 0) {
                                            iM559716 = C0873.m55680("᩹ۢ") ^ i68;
                                            i70 = ((iM559716 ^ i69) * 31309) ^ (-695684878);
                                            i71 = -1283960945;
                                        } else {
                                            iM559716 = C0873.m55680("ۙ᩵") ^ i69;
                                            i70 = ((iM559716 ^ i68) * (-8721)) ^ 1576677161;
                                            i71 = 1175043542;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    interfaceC14105 = ApplicationC21448.f67649;
                    sArr25 = f82125;
                    if (C1028.f81950 > 0) {
                        int iM559716 = (C0946.m55979("ᩳۧ") + i47) * 7;
                        i28 = ((iM559716 ^ i48) * 26579) ^ (-983077239);
                        i53 = iM559716 ^ (-331305013);
                        i60 = i24;
                        sArr27 = sArr12;
                        sArr26 = sArr11;
                        dialogInterfaceC2569 = dialogInterfaceC2566;
                        obj11 = obj6;
                        c120911 = c12097;
                        z19 = z14;
                        sArr28 = sArr6;
                        obj10 = obj3;
                        view7 = view;
                        th8 = th2;
                        i57 = i11;
                        interfaceC14106 = interfaceC14101;
                        str9 = str4;
                        str10 = str10;
                        c0994 = c0992;
                        c20676 = c20673;
                        i54 = i10;
                        i61 = i28;
                        z18 = z6;
                        c20677 = c20676;
                    } else {
                        c0994 = c0992;
                        z7 = z17 ? 1 : 0;
                        sArr13 = sArr24;
                        i22 = i58;
                        i23 = i59;
                        z8 = z14;
                        int iM556811 = (i47 - C0873.m55680("᩷ܶ")) * 37;
                        i39 = ((iM556811 ^ i48) * (-30935)) ^ 1301823979;
                        i53 = iM556811 ^ 801448837;
                        i58 = i22;
                        i59 = i23;
                        i60 = i24;
                        sArr28 = sArr6;
                        sArr27 = sArr12;
                        sArr26 = sArr11;
                        dialogInterfaceC2569 = dialogInterfaceC2566;
                        obj11 = obj6;
                        sArr24 = sArr13;
                        c120911 = c12097;
                        obj10 = obj3;
                        view7 = view;
                        z19 = z8;
                        th8 = th2;
                        z17 = z7;
                        i57 = i11;
                        interfaceC14106 = interfaceC14101;
                        str9 = str4;
                        z18 = z6;
                        c20677 = c20673;
                        i54 = i10;
                        str10 = str10;
                        c0994 = c0994;
                        i61 = i39;
                    }
                    break;
                case -1659707734:
                case -530799829:
                    C1404.m56468();
                    if (C0967.f81910 >= 0) {
                        dialogInterfaceC2565 = dialogInterfaceC2569;
                        obj4 = obj11;
                        i16 = iM559714;
                        c0991 = c0994;
                        str5 = str10;
                        i17 = i54;
                        sArr7 = sArr25;
                        sArr8 = sArr26;
                        sArr9 = sArr27;
                        str6 = str9;
                        c20674 = c20677;
                        z9 = z18;
                        z10 = z17 ? 1 : 0;
                        z11 = z19;
                        c12098 = c120911;
                        interfaceC14102 = interfaceC14106;
                        i18 = i57;
                        i19 = i60;
                        th3 = th8;
                        view2 = view7;
                        obj5 = obj10;
                        sArr10 = sArr28;
                        iM559711 = (i48 - C0946.m55979("֨֨")) * (-21);
                        i20 = ((iM559711 ^ i47) * 10361) ^ 1291410608;
                        i21 = 1117379995;
                        int i67 = iM559711 ^ i21;
                        iM559714 = i16;
                        i60 = i19;
                        sArr27 = sArr9;
                        sArr26 = sArr8;
                        obj11 = obj4;
                        sArr25 = sArr7;
                        c120911 = c12098;
                        z19 = z11;
                        z17 = z10;
                        z18 = z9;
                        c20677 = c20674;
                        i54 = i17;
                        i61 = i20;
                        dialogInterfaceC2569 = dialogInterfaceC2565;
                        String str14 = str5;
                        c0994 = c0991;
                        i53 = i67;
                        sArr28 = sArr10;
                        obj10 = obj5;
                        view7 = view2;
                        th8 = th3;
                        i57 = i18;
                        interfaceC14106 = interfaceC14102;
                        str9 = str6;
                        str10 = str14;
                    } else {
                        dialogInterfaceC2566 = dialogInterfaceC2569;
                        obj6 = obj11;
                        c0994 = c0994;
                        str10 = str10;
                        i10 = i54;
                        sArr13 = sArr24;
                        i22 = i58;
                        i23 = i59;
                        sArr11 = sArr26;
                        sArr12 = sArr27;
                        str4 = str9;
                        c20673 = c20677;
                        z6 = z18;
                        z7 = z17 ? 1 : 0;
                        z8 = z19;
                        c12097 = c120911;
                        interfaceC14101 = interfaceC14106;
                        i11 = i57;
                        i24 = i60;
                        th2 = th8;
                        view = view7;
                        obj3 = obj10;
                        sArr6 = sArr28;
                        int iM556812 = (i47 - C0873.m55680("᩷ܶ")) * 37;
                        i39 = ((iM556812 ^ i48) * (-30935)) ^ 1301823979;
                        i53 = iM556812 ^ 801448837;
                        i58 = i22;
                        i59 = i23;
                        i60 = i24;
                        sArr28 = sArr6;
                        sArr27 = sArr12;
                        sArr26 = sArr11;
                        dialogInterfaceC2569 = dialogInterfaceC2566;
                        obj11 = obj6;
                        sArr24 = sArr13;
                        c120911 = c12097;
                        obj10 = obj3;
                        view7 = view;
                        z19 = z8;
                        th8 = th2;
                        z17 = z7;
                        i57 = i11;
                        interfaceC14106 = interfaceC14101;
                        str9 = str4;
                        z18 = z6;
                        c20677 = c20673;
                        i54 = i10;
                        str10 = str10;
                        c0994 = c0994;
                        i61 = i39;
                    }
                    break;
                case -1631290871:
                case 958311723:
                    z18 = false;
                    iM55979 = C0873.m55680("֨᩵") ^ i47;
                    i61 = 808426702 ^ ((iM55979 ^ i48) * 14781);
                    i = -1461643998;
                    i53 = iM55979 ^ i;
                    break;
                case -1621167387:
                case -1571106087:
                    i27 = i54;
                    z12 = z17 ? 1 : 0;
                    z13 = z19;
                    sArr14 = sArr25;
                    C1053.m56322(c0993, C0890.m55727(ApplicationC21448.f67649, C0967.m56077(f82125, 19, 3, i27), z12));
                    int iM556813 = C0873.m55680("᩺ۤ") ^ i47;
                    int i68 = ((iM556813 ^ i48) * (-29773)) ^ (-51869487);
                    i53 = iM556813 ^ 424367438;
                    i60 = i60;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    dialogInterfaceC2569 = dialogInterfaceC2569;
                    obj11 = obj11;
                    sArr25 = sArr14;
                    c120911 = c120911;
                    z19 = z13;
                    z17 = z12;
                    z18 = z18;
                    c20677 = c20677;
                    i54 = i27;
                    i61 = i68;
                    sArr28 = sArr28;
                    obj10 = obj10;
                    view7 = view7;
                    th8 = th8;
                    i57 = i57;
                    interfaceC14106 = interfaceC14106;
                    str9 = str9;
                    str10 = str10;
                    c0994 = c0994;
                    break;
                case -1565422268:
                case 683299523:
                    dialogInterfaceC2566 = dialogInterfaceC2569;
                    obj6 = obj11;
                    c0992 = c0994;
                    str10 = str10;
                    i10 = i54;
                    sArr15 = sArr25;
                    sArr11 = sArr26;
                    sArr12 = sArr27;
                    str4 = str9;
                    c20673 = c20677;
                    z6 = z18;
                    interfaceC14101 = interfaceC14106;
                    i11 = i57;
                    th2 = th8;
                    view = view7;
                    obj3 = obj10;
                    sArr6 = sArr28;
                    z14 = z19;
                    c12097 = c120911;
                    i24 = i60;
                    if (inputStreamM55830 != null) {
                        iM55682 = C0873.m55680("ۛۡ") ^ i47;
                        i28 = ((iM55682 ^ i48) * 27535) ^ (-997732749);
                        i29 = 354070292;
                    } else {
                        iM55682 = C0946.m55979("۟ᩳ") ^ i47;
                        i28 = ((iM55682 ^ i48) * 26667) ^ 699706983;
                        i29 = -1820639289;
                    }
                    i53 = iM55682 ^ i29;
                    sArr25 = sArr15;
                    i60 = i24;
                    sArr27 = sArr12;
                    sArr26 = sArr11;
                    dialogInterfaceC2569 = dialogInterfaceC2566;
                    obj11 = obj6;
                    c120911 = c12097;
                    z19 = z14;
                    sArr28 = sArr6;
                    obj10 = obj3;
                    view7 = view;
                    th8 = th2;
                    i57 = i11;
                    interfaceC14106 = interfaceC14101;
                    str9 = str4;
                    str10 = str10;
                    c0994 = c0992;
                    c20676 = c20673;
                    i54 = i10;
                    i61 = i28;
                    z18 = z6;
                    c20677 = c20676;
                    break;
                case -1444557009:
                case 1968058259:
                    final DialogInterfaceC2564 dialogInterfaceC25610 = dialogInterfaceC2569;
                    final C0990 c0997 = c0995;
                    final C0990 c0998 = c0993;
                    C1048.m56304(C1964.m56591(dialogInterfaceC2569), new View.OnClickListener(this) { // from class: l.ܶۤܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C12094 f49461;

                        /* JADX WARN: Code duplicated, block: B:21:0x0064 A[PHI: r12 r13
                          0x0064: PHI (r12v3 l.ܽۢܳ) = (r12v2 l.ܽۢܳ), (r12v1 l.ܽۢܳ), (r12v1 l.ܽۢܳ), (r12v1 l.ܽۢܳ) binds: [B:20:0x0062, B:14:0x004c, B:12:0x0049, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]
                          0x0064: PHI (r13v3 l.֡ۚۢ) = (r13v2 l.֡ۚۢ), (r13v1 l.֡ۚۢ), (r13v1 l.֡ۚۢ), (r13v1 l.֡ۚۢ) binds: [B:20:0x0062, B:14:0x004c, B:12:0x0049, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:46:0x0140  */
                        /* JADX WARN: Code duplicated, block: B:50:0x016e A[PHI: r15
                          0x016e: PHI (r15v4 java.lang.String) = (r15v1 java.lang.String), (r15v1 java.lang.String), (r15v2 java.lang.String), (r15v1 java.lang.String) binds: [B:49:0x016c, B:41:0x0122, B:29:0x00cc, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:58:0x01ba  */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view9) {
                            int iM556814;
                            int i69;
                            int iM559717;
                            int i70;
                            int i71 = -1217499336;
                            int i72 = RunnableC0938.f81886;
                            int i73 = C0866.f81837;
                            int iM559718 = (i73 - C0946.m55979("ۡܳ")) * (-85);
                            int i74 = ((iM559718 ^ i72) * 8643) ^ 1894773245;
                            int i75 = iM559718 ^ 150608514;
                            String str15 = null;
                            C0990 c0999 = null;
                            C12094 c12094 = null;
                            C18107 c18108 = null;
                            DialogInterfaceC2564 dialogInterfaceC25611 = null;
                            while (true) {
                                i71 = i75 ^ ((((i71 ^ i72) * 3113) >> 31) & i74);
                                switch (i71) {
                                    case -1938278252:
                                    case -135627150:
                                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                                            iM556814 = (i73 - C0946.m55979("۬᩷")) * (-9);
                                            i74 = ((iM556814 ^ i72) * (-15965)) ^ 1313318277;
                                            i69 = -1321663246;
                                        } else {
                                            iM556814 = C0946.m55979("ۗۜ") ^ i72;
                                            i74 = ((iM556814 ^ i73) * (-19727)) ^ 562973648;
                                            i69 = -718527289;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case -1818231854:
                                    case -1649291837:
                                        c18108 = c18107;
                                        dialogInterfaceC25611 = dialogInterfaceC25610;
                                        if (C1025.m56230()) {
                                            iM556814 = (i73 - C0946.m55979("۬ܽ")) * 85;
                                            i74 = ((iM556814 ^ i72) * (-17765)) ^ 2005944031;
                                            i69 = -1450552157;
                                        } else {
                                            iM556814 = (C0873.m55680("ۢᩴ") + i73) * (-47);
                                            i74 = ((iM556814 ^ i72) * 20207) ^ 737067204;
                                            i69 = -525387468;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case -1762428998:
                                    case 1671984729:
                                        if (C1044.f81959 >= 0) {
                                            iM556814 = (i73 - C0946.m55979("۬ܽ")) * 85;
                                            i74 = ((iM556814 ^ i72) * (-17765)) ^ 2005944031;
                                            i69 = -1450552157;
                                        } else {
                                            iM556814 = C0873.m55680("ۘ᩻") ^ i72;
                                            i74 = ((iM556814 ^ i73) * 12891) ^ 1205199384;
                                            i69 = -247341384;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case -1755286421:
                                    case -33150373:
                                        C1071.m56343();
                                        iM556814 = (i73 - C0946.m55979("۬ܽ")) * 85;
                                        i74 = ((iM556814 ^ i72) * (-17765)) ^ 2005944031;
                                        i69 = -1450552157;
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case -1639925907:
                                    case 1055435228:
                                        str15 = str;
                                        if (C0892.f81851) {
                                            iM556814 = (C0873.m55680("۟֨") + i72) * (-7);
                                            i74 = ((iM556814 ^ i73) * (-25137)) ^ (-1879304943);
                                            i69 = -755534971;
                                        } else {
                                            iM556814 = (i73 - C0946.m55979("۬᩷")) * (-9);
                                            i74 = ((iM556814 ^ i72) * (-15965)) ^ 1313318277;
                                            i69 = -1321663246;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case -1577954578:
                                    case -352457137:
                                        if (C0866.f81837 >= 0) {
                                            iM556814 = (i73 - C0946.m55979("۬᩷")) * (-9);
                                            i74 = ((iM556814 ^ i72) * (-15965)) ^ 1313318277;
                                            i69 = -1321663246;
                                        } else {
                                            iM556814 = (C0873.m55680("ۢܳ") ^ i72) * (-91);
                                            i74 = ((iM556814 ^ i73) * (-8843)) ^ (-59207060);
                                            i69 = 1678555839;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case -1242902745:
                                    case 1621290801:
                                        C0955.m56025();
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM556814 = (i73 - C0946.m55979("۬ܽ")) * 85;
                                            i74 = ((iM556814 ^ i72) * (-17765)) ^ 2005944031;
                                            i69 = -1450552157;
                                        } else {
                                            iM556814 = (C0873.m55680("ۖۘ") + i72) * (-105);
                                            i74 = ((iM556814 ^ i73) * 7525) ^ (-536639869);
                                            i69 = -1102067105;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case -1074021319:
                                    case -769233546:
                                        C1048.m56305();
                                        break;
                                    case -800483138:
                                    case 1844106727:
                                        C0990 c09910 = c0998;
                                        c12094 = this.f49461;
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM559717 = C0873.m55680("᩷᩹") ^ i73;
                                            i74 = ((iM559717 ^ i72) * (-11687)) ^ 1201560071;
                                            i70 = 1855784631;
                                        } else {
                                            iM559717 = C0946.m55979("۟ܶ") ^ i72;
                                            i74 = ((iM559717 ^ i73) * (-7465)) ^ (-1750872541);
                                            i70 = 41744591;
                                        }
                                        i75 = iM559717 ^ i70;
                                        c0999 = c09910;
                                        break;
                                    case -512247719:
                                    case 1811789367:
                                        if (C1044.f81959 >= 0) {
                                            iM556814 = (C0873.m55680("ۖۘ") + i72) * (-105);
                                            i74 = ((iM556814 ^ i73) * 7525) ^ (-536639869);
                                            i69 = -1102067105;
                                        } else {
                                            iM556814 = (i73 - C0873.m55680("ᩳ۫")) * 3;
                                            i74 = ((iM556814 ^ i72) * (-2015)) ^ 1520564170;
                                            i69 = -1357001791;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case -396598911:
                                    case 847092288:
                                        if (C0866.f81837 >= 0) {
                                            iM556814 = (C0873.m55680("ۖۘ") + i72) * (-105);
                                            i74 = ((iM556814 ^ i73) * 7525) ^ (-536639869);
                                            i69 = -1102067105;
                                        } else {
                                            iM556814 = (C0946.m55979("֫᩻") ^ i72) * (-7);
                                            i74 = ((iM556814 ^ i73) * (-27677)) ^ 1022502170;
                                            i69 = -1556595036;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case -386394927:
                                    case 1660884308:
                                        C12094.m27896(c12094, c18108, dialogInterfaceC25611, c0997, str15, c0999);
                                        break;
                                    case -322448940:
                                    case 1154425096:
                                        if (C0845.f81821 >= 0) {
                                            iM556814 = (C0873.m55680("ۖۘ") + i72) * (-105);
                                            i74 = ((iM556814 ^ i73) * 7525) ^ (-536639869);
                                            i69 = -1102067105;
                                        } else {
                                            iM556814 = (C0873.m55680("֡ۚ") ^ i73) * (-11);
                                            i74 = ((iM556814 ^ i72) * 4521) ^ 1831910662;
                                            i69 = 1255547004;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case 21100032:
                                    case 1078007352:
                                        if (C0912.m55833()) {
                                            iM556814 = C0873.m55680("ۘ᩻") ^ i72;
                                            i74 = ((iM556814 ^ i73) * 12891) ^ 1205199384;
                                            i69 = -247341384;
                                        } else {
                                            iM556814 = C0873.m55680("֡ܶ") ^ i73;
                                            i74 = ((iM556814 ^ i72) * 9283) ^ (-548959694);
                                            i69 = 684301764;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    case 597891934:
                                    case 1850914576:
                                        if (C0989.m56095() <= 0) {
                                            iM556814 = C0873.m55680("ۘ᩻") ^ i72;
                                            i74 = ((iM556814 ^ i73) * 12891) ^ 1205199384;
                                            i69 = -247341384;
                                        } else {
                                            iM556814 = C0873.m55680("ܳ᩵") ^ i73;
                                            i74 = ((iM556814 ^ i72) * 18995) ^ (-260667648);
                                            i69 = -506788227;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                    default:
                                        C0937.m55918();
                                        if (RunnableC1014.f81941 > 0) {
                                            iM556814 = (C0873.m55680("ۖۘ") + i72) * (-105);
                                            i74 = ((iM556814 ^ i73) * 7525) ^ (-536639869);
                                            i69 = -1102067105;
                                        } else {
                                            iM556814 = (i73 - C0946.m55979("۬᩷")) * (-9);
                                            i74 = ((iM556814 ^ i72) * (-15965)) ^ 1313318277;
                                            i69 = -1321663246;
                                        }
                                        i75 = iM556814 ^ i69;
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i69 = -45300241;
                            int i70 = C0877.f81843;
                            int i71 = C0967.f81910;
                            int iM556814 = (C0873.m55680("ܳܽ") + i70) * 81;
                            int i72 = ((iM556814 ^ i71) * (-28767)) ^ (-1498824867);
                            int i73 = -1685138594;
                            while (true) {
                                i69 = ((((i69 ^ i71) * 20289) >> 31) & i72) ^ (iM556814 ^ i73);
                                switch (i69) {
                                    case -2126125120:
                                    case 378054188:
                                        if (C0967.f81910 >= 0) {
                                            iM556814 = (C0946.m55979("֫ۖ") + i71) * 21;
                                            i72 = ((iM556814 ^ i70) * 5961) ^ 963459707;
                                            i73 = -1527865608;
                                        } else {
                                            iM556814 = C0873.m55680("ܺ᩹") ^ i71;
                                            i72 = ((iM556814 ^ i70) * (-12389)) ^ (-1176436299);
                                            i73 = 28633651;
                                        }
                                        break;
                                    case -2017307340:
                                    case 1887889397:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM556814 = C0946.m55979("۫᩻") ^ i70;
                                            i72 = ((iM556814 ^ i71) * (-25965)) ^ 1004130568;
                                            i73 = 1268477601;
                                        } else {
                                            iM556814 = C0873.m55680("ۤܽ") ^ i71;
                                            i72 = ((iM556814 ^ i70) * (-32323)) ^ (-2025965857);
                                            i73 = -1589236872;
                                        }
                                        break;
                                    case -1978607592:
                                    case -1587619041:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM556814 = (C0873.m55680("᩸֨") ^ i70) * (-95);
                                            i72 = ((iM556814 ^ i71) * 15163) ^ (-915582741);
                                            i73 = -1261794880;
                                        } else {
                                            iM556814 = C0946.m55979("ܿۜ") ^ i70;
                                            i72 = ((iM556814 ^ i71) * 27059) ^ (-1309097296);
                                            i73 = -1357467393;
                                        }
                                        break;
                                    case -1762993701:
                                    case 1832786793:
                                        if (C0930.f81879 <= 0) {
                                            iM556814 = (C0873.m55680("᩸֨") ^ i70) * (-95);
                                            i72 = ((iM556814 ^ i71) * 15163) ^ (-915582741);
                                            i73 = -1261794880;
                                        } else {
                                            iM556814 = C0873.m55680("ۤᩳ") ^ i70;
                                            i72 = ((iM556814 ^ i71) * 2151) ^ 761379782;
                                            i73 = 252317138;
                                        }
                                        break;
                                    case -1663108631:
                                    case -1213514889:
                                        this.f49461 = this;
                                        if (C0854.m55595() >= 0) {
                                            iM556814 = (C0873.m55680("ܿ۟") + i71) * (-123);
                                            i72 = ((iM556814 ^ i70) * 30441) ^ (-242869864);
                                            i73 = 674659388;
                                        } else {
                                            iM556814 = C0946.m55979("֫ۜ") ^ i71;
                                            i72 = ((iM556814 ^ i70) * (-1403)) ^ 1966773898;
                                            i73 = 491693854;
                                        }
                                        break;
                                    case -1660605071:
                                    case 348048827:
                                        if (C0946.m55980() != 0) {
                                            iM556814 = (C0946.m55979("֫ۖ") + i71) * 21;
                                            i72 = ((iM556814 ^ i70) * 5961) ^ 963459707;
                                            i73 = -1527865608;
                                        } else {
                                            iM556814 = C0946.m55979("ᩳۘ") ^ i70;
                                            i72 = ((iM556814 ^ i71) * (-7675)) ^ 621318269;
                                            i73 = 160331244;
                                        }
                                        break;
                                    case -1103980466:
                                    case -797051213:
                                        C0992.m56107();
                                        if (ServiceConnectionC1013.f81940 < 0) {
                                            iM556814 = (C0873.m55680("᩸֨") ^ i70) * (-95);
                                            i72 = ((iM556814 ^ i71) * 15163) ^ (-915582741);
                                            i73 = -1261794880;
                                        } else {
                                            iM556814 = (i71 - C0946.m55979("ۧۛ")) * (-87);
                                            i72 = ((iM556814 ^ i70) * 22403) ^ 1488977852;
                                            i73 = -1738443664;
                                        }
                                        break;
                                    case -975928244:
                                    case 1210216319:
                                        C0894.m55769();
                                        if (!C0955.f81898) {
                                            iM556814 = (C0946.m55979("֫ۖ") + i71) * 21;
                                            i72 = ((iM556814 ^ i70) * 5961) ^ 963459707;
                                            i73 = -1527865608;
                                        } else {
                                            iM556814 = (i71 - C0946.m55979("ۧۛ")) * (-87);
                                            i72 = ((iM556814 ^ i70) * 22403) ^ 1488977852;
                                            i73 = -1738443664;
                                        }
                                        break;
                                    case -816645864:
                                    case -355676063:
                                        if (C1036.f81953 >= 0) {
                                            iM556814 = C0946.m55979("۫᩻") ^ i70;
                                            i72 = ((iM556814 ^ i71) * (-25965)) ^ 1004130568;
                                            i73 = 1268477601;
                                        } else {
                                            iM556814 = (i71 - C0946.m55979("ۧۛ")) * (-87);
                                            i72 = ((iM556814 ^ i70) * 22403) ^ 1488977852;
                                            i73 = -1738443664;
                                        }
                                        break;
                                    case -564359653:
                                    case 321618928:
                                        C0989.m56095();
                                        throw new RuntimeException();
                                    case 216598643:
                                    case 559500703:
                                        if (C0863.m55643()) {
                                            iM556814 = C0873.m55680("ۚ۟") ^ i71;
                                            i72 = ((iM556814 ^ i70) * 24151) ^ 354901712;
                                            i73 = -1332629656;
                                        } else {
                                            iM556814 = (C0946.m55979("֫ۖ") + i71) * 21;
                                            i72 = ((iM556814 ^ i70) * 5961) ^ 963459707;
                                            i73 = -1527865608;
                                        }
                                        break;
                                    case 286132568:
                                    case 853202321:
                                        return;
                                    case 620870499:
                                    case 2040575725:
                                        if (C1194.f82045 != 0) {
                                            iM556814 = (C0873.m55680("ܿ۟") + i71) * (-123);
                                            i72 = ((iM556814 ^ i70) * 30441) ^ (-242869864);
                                            i73 = 674659388;
                                        } else {
                                            iM556814 = C0946.m55979("᩷۟") ^ i71;
                                            i72 = ((iM556814 ^ i70) * (-31657)) ^ 312373150;
                                            i73 = -1182980467;
                                        }
                                        break;
                                    case 719470581:
                                    case 1871468922:
                                        if (C1048.f81963) {
                                            iM556814 = C0946.m55979("ܺ֨") ^ i70;
                                            i72 = ((iM556814 ^ i71) * 6083) ^ (-124757893);
                                            i73 = -1420933936;
                                        } else {
                                            iM556814 = (C0946.m55979("֫ۖ") + i71) * 21;
                                            i72 = ((iM556814 ^ i70) * 5961) ^ 963459707;
                                            i73 = -1527865608;
                                        }
                                        break;
                                    case 993377401:
                                    case 2116065725:
                                        if (C0946.f81894 != 0) {
                                            iM556814 = (i71 - C0946.m55979("ۧۛ")) * (-87);
                                            i72 = ((iM556814 ^ i70) * 22403) ^ 1488977852;
                                            i73 = -1738443664;
                                        } else {
                                            iM556814 = C0946.m55979("ᩴۨ") ^ i70;
                                            i72 = ((iM556814 ^ i71) * 26457) ^ 1244075135;
                                            i73 = -1695355566;
                                        }
                                        break;
                                    default:
                                        C0877.m55696();
                                        C0917.m55854();
                                        iM556814 = (i71 - C0946.m55979("ۧۛ")) * (-87);
                                        i72 = ((iM556814 ^ i70) * 22403) ^ 1488977852;
                                        i73 = -1738443664;
                                        break;
                                }
                            }
                        }
                    });
                    return;
                case -1432031335:
                case -611633045:
                    C1929.m56553();
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0946.m55979("۫᩻") ^ i48) * C0254q.f1218h;
                        i61 = (-1953104251) ^ ((iM55979 ^ i47) * 17759);
                        i = 496426457;
                        i53 = iM55979 ^ i;
                    } else {
                        i37 = i54;
                        sArr23 = sArr27;
                        c20675 = c20677;
                        z16 = z18;
                        i38 = i57;
                        th6 = th8;
                        view5 = view7;
                        obj9 = obj10;
                        sArr22 = sArr28;
                        iM55685 = C0946.m55979("ܰ֡") ^ i48;
                        i39 = ((iM55685 ^ i47) * 18725) ^ 27643640;
                        i41 = -891783808;
                        i53 = iM55685 ^ i41;
                        sArr28 = sArr22;
                        sArr27 = sArr23;
                        obj10 = obj9;
                        view7 = view5;
                        th8 = th6;
                        i57 = i38;
                        z18 = z16;
                        c20677 = c20675;
                        i54 = i37;
                        i61 = i39;
                    }
                    break;
                case -1400646576:
                case -495892000:
                    dialogInterfaceC2569 = dialogInterfaceC2569;
                    obj11 = obj11;
                    c0994 = c0994;
                    str10 = str10;
                    i54 = i54;
                    sArr24 = sArr24;
                    i58 = i58;
                    i59 = i59;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    sArr27 = sArr27;
                    str9 = str9;
                    c20677 = c20677;
                    z18 = z18;
                    z5 = z17 ? 1 : 0;
                    z19 = z19;
                    c120911 = c120911;
                    interfaceC14106 = interfaceC14106;
                    i57 = i57;
                    i60 = i60;
                    th8 = th8;
                    view7 = view7;
                    obj10 = obj10;
                    sArr28 = sArr28;
                    i62 = i62;
                    iM559714 = iM559714;
                    try {
                        inputStreamM55830 = C0912.m55830(abstractC17043);
                        iM559710 = (C0946.m55979("ۧۨ") + i47) * 63;
                        i8 = ((iM559710 ^ i48) * (-19563)) ^ (-1523208536);
                        i9 = -78462791;
                    } catch (IOException unused) {
                        iM559710 = (C0873.m55680("۟֨") + i48) * (-57);
                        i8 = ((iM559710 ^ i47) * 26979) ^ (-383167587);
                        i9 = -512549510;
                    }
                    i53 = iM559710 ^ i9;
                    i58 = i58;
                    i59 = i59;
                    iM559714 = iM559714;
                    i60 = i60;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    dialogInterfaceC2569 = dialogInterfaceC2569;
                    obj11 = obj11;
                    sArr25 = sArr25;
                    sArr24 = sArr24;
                    i62 = i62;
                    c120911 = c120911;
                    sArr28 = sArr28;
                    z19 = z19;
                    obj10 = obj10;
                    view7 = view7;
                    z17 = z5;
                    th8 = th8;
                    z18 = z18;
                    c20677 = c20677;
                    i54 = i54;
                    i57 = i57;
                    interfaceC14106 = interfaceC14106;
                    str9 = str9;
                    i61 = i8;
                    str10 = str10;
                    c0994 = c0994;
                    break;
                case -1291406177:
                case -382253769:
                    dialogInterfaceC2565 = dialogInterfaceC2569;
                    obj4 = obj11;
                    i16 = iM559714;
                    str5 = str10;
                    i17 = i54;
                    sArr7 = sArr25;
                    sArr8 = sArr26;
                    sArr9 = sArr27;
                    str6 = str9;
                    c20674 = c20677;
                    z9 = z18;
                    z10 = z17 ? 1 : 0;
                    z11 = z19;
                    c12098 = c120911;
                    interfaceC14102 = interfaceC14106;
                    i18 = i57;
                    i19 = i60;
                    th3 = th8;
                    view2 = view7;
                    obj5 = obj10;
                    sArr10 = sArr28;
                    c0991 = (C0990) C0892.m55755(view2, i16);
                    this.f33799 = c0991;
                    c0993 = (C0990) C0892.m55755(view2, C0873.m55680(C0949.m56016(f82125, 7, 3, i17)) ^ 2121801576);
                    sArr24 = f82125;
                    i58 = 10;
                    i59 = 3;
                    if (C1124.m56367() >= 0) {
                        iM559711 = (i48 - C0946.m55979("֨֨")) * (-21);
                        i20 = ((iM559711 ^ i47) * 10361) ^ 1291410608;
                        i21 = 1117379995;
                    } else {
                        iM559711 = C0946.m55979("ܺᩴ") ^ i48;
                        i20 = ((iM559711 ^ i47) * (-25817)) ^ 240172455;
                        i21 = 1430418630;
                    }
                    int i69 = iM559711 ^ i21;
                    iM559714 = i16;
                    i60 = i19;
                    sArr27 = sArr9;
                    sArr26 = sArr8;
                    obj11 = obj4;
                    sArr25 = sArr7;
                    c120911 = c12098;
                    z19 = z11;
                    z17 = z10;
                    z18 = z9;
                    c20677 = c20674;
                    i54 = i17;
                    i61 = i20;
                    dialogInterfaceC2569 = dialogInterfaceC2565;
                    String str15 = str5;
                    c0994 = c0991;
                    i53 = i69;
                    sArr28 = sArr10;
                    obj10 = obj5;
                    view7 = view2;
                    th8 = th3;
                    i57 = i18;
                    interfaceC14106 = interfaceC14102;
                    str9 = str6;
                    str10 = str15;
                    break;
                case -1279673267:
                case 1216726622:
                    z5 = z17 ? 1 : 0;
                    this.f33803 = z5;
                    iM559710 = C0946.m55979("᩺ۛ") ^ i47;
                    i8 = ((iM559710 ^ i48) * (-12495)) ^ (-1695621705);
                    i9 = -299684956;
                    i53 = iM559710 ^ i9;
                    i58 = i58;
                    i59 = i59;
                    iM559714 = iM559714;
                    i60 = i60;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    dialogInterfaceC2569 = dialogInterfaceC2569;
                    obj11 = obj11;
                    sArr25 = sArr25;
                    sArr24 = sArr24;
                    i62 = i62;
                    c120911 = c120911;
                    sArr28 = sArr28;
                    z19 = z19;
                    obj10 = obj10;
                    view7 = view7;
                    z17 = z5;
                    th8 = th8;
                    z18 = z18;
                    c20677 = c20677;
                    i54 = i54;
                    i57 = i57;
                    interfaceC14106 = interfaceC14106;
                    str9 = str9;
                    i61 = i8;
                    str10 = str10;
                    c0994 = c0994;
                    break;
                case -1197368997:
                case 1813039771:
                    if (iM55651 == 175662436) {
                        iM55687 = (i48 - C0946.m55979("ۢ᩹")) * 37;
                        i61 = ((iM55687 ^ i47) * (-12153)) ^ 78908907;
                        i45 = -1419060953;
                    } else {
                        iM55687 = C0873.m55680("ܶۨ") ^ i47;
                        i61 = ((iM55687 ^ i48) * 28001) ^ (-990309259);
                        i45 = -13741610;
                    }
                    i53 = iM55687 ^ i45;
                    break;
                case -1153357475:
                case 267555148:
                    DialogInterfaceC2564 dialogInterfaceC25611 = dialogInterfaceC2569;
                    Object obj13 = obj11;
                    c0994 = c0994;
                    str10 = str10;
                    int i70 = i54;
                    short[] sArr30 = sArr25;
                    short[] sArr31 = sArr26;
                    int i71 = i60;
                    short[] sArr32 = sArr27;
                    str9 = str9;
                    C20671 c206710 = c20677;
                    boolean z20 = z18;
                    Object[] objArr = z17 ? 1 : 0;
                    boolean z21 = z19;
                    interfaceC14106 = interfaceC14106;
                    i57 = i57;
                    th8 = th8;
                    view7 = view7;
                    Object obj14 = obj10;
                    short[] sArr33 = sArr28;
                    C12096 c120913 = (C12096) C0892.m55755(view7, C0946.m55979(RunnableC0871.m55667(f82125, 16, 3, i70)) ^ 2119200503);
                    this.f33802 = c120913;
                    C0917.m55841(c0994, new CompoundButton.OnCheckedChangeListener() { // from class: l.֡ۤܽ
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z22) {
                            int i72 = 469831867;
                            int i73 = C1071.f81975;
                            int i74 = C1012.f81938;
                            int iM559717 = (i73 - C0946.m55979("۠᩷")) * (-25);
                            int i75 = ((iM559717 ^ i74) * 27165) ^ (-2109034713);
                            int i76 = 1856935124;
                            while (true) {
                                i72 = ((((i72 ^ i74) * (-14683)) >> 31) & i75) ^ (iM559717 ^ i76);
                                switch (i72) {
                                    case -2087240253:
                                    case 1171883900:
                                        if (C0989.f81920 < 0) {
                                            iM559717 = C0946.m55979("᩵ۤ") ^ i73;
                                            i75 = ((iM559717 ^ i74) * 325) ^ 1625184553;
                                            i76 = 2059102669;
                                        } else {
                                            iM559717 = (C0946.m55979("ܰۡ") + i74) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i75 = ((iM559717 ^ i73) * (-32451)) ^ 950299551;
                                            i76 = 1652059951;
                                        }
                                        break;
                                    case -2070036590:
                                    case -1135244036:
                                        if (C1048.f81963) {
                                            iM559717 = C0873.m55680("ۢ۟") ^ i74;
                                            i75 = ((iM559717 ^ i73) * (-7031)) ^ (-1794470015);
                                            i76 = -359745470;
                                        } else {
                                            iM559717 = C0946.m55979("۟ۖ") ^ i74;
                                            i75 = ((iM559717 ^ i73) * (-313)) ^ 1877116595;
                                            i76 = -1046553842;
                                        }
                                        break;
                                    case -2058312616:
                                    case 1329950560:
                                        C0937.m55918();
                                        if (C1028.f81950 <= 0) {
                                            iM559717 = C0873.m55680("֨ۤ") ^ i74;
                                            i75 = ((iM559717 ^ i73) * (-9787)) ^ 849554587;
                                            i76 = -254973336;
                                        } else {
                                            iM559717 = C0946.m55979("᩵ۤ") ^ i73;
                                            i75 = ((iM559717 ^ i74) * 325) ^ 1625184553;
                                            i76 = 2059102669;
                                        }
                                        break;
                                    case -1632877777:
                                    case 467598182:
                                        if (C0927.m55873() <= 0) {
                                            iM559717 = C0946.m55979("۟ۖ") ^ i74;
                                            i75 = ((iM559717 ^ i73) * (-313)) ^ 1877116595;
                                            i76 = -1046553842;
                                        } else {
                                            iM559717 = (C0873.m55680("۬ۚ") ^ i74) * 19;
                                            i75 = ((iM559717 ^ i73) * (-21347)) ^ 114227942;
                                            i76 = 2083977602;
                                        }
                                        break;
                                    case -1154565724:
                                    case -985000970:
                                        if (C0894.f81854 >= 0) {
                                            iM559717 = C0873.m55680("֨ۤ") ^ i74;
                                            i75 = ((iM559717 ^ i73) * (-9787)) ^ 849554587;
                                            i76 = -254973336;
                                        } else {
                                            iM559717 = (C0946.m55979("᩺ۢ") + i74) * (-47);
                                            i75 = ((iM559717 ^ i73) * 761) ^ (-2091806695);
                                            i76 = -1737567524;
                                        }
                                        break;
                                    case -935401945:
                                    case 2009663686:
                                        if (C1053.m56327() >= 0) {
                                            iM559717 = C0946.m55979("۟ۖ") ^ i74;
                                            i75 = ((iM559717 ^ i73) * (-313)) ^ 1877116595;
                                            i76 = -1046553842;
                                        } else {
                                            iM559717 = (i73 - C0873.m55680("ۨ֫")) * 29;
                                            i75 = ((iM559717 ^ i74) * 21445) ^ (-994982043);
                                            i76 = 1215732803;
                                        }
                                        break;
                                    case -609180452:
                                    case 2052704624:
                                        if (C0877.f81843 >= 0) {
                                            iM559717 = (i73 - C0873.m55680("۫ۨ")) * (-107);
                                            i75 = ((iM559717 ^ i74) * 8451) ^ (-1298406883);
                                            i76 = -2137848577;
                                        } else {
                                            iM559717 = (C0946.m55979("᩺ۚ") ^ i73) * 115;
                                            i75 = ((iM559717 ^ i74) * 24415) ^ (-666390095);
                                            i76 = -73185009;
                                        }
                                        break;
                                    case -281396534:
                                    case 727304938:
                                        if (C1003.f81929 <= 0) {
                                            iM559717 = (C0946.m55979("ܰۡ") + i74) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i75 = ((iM559717 ^ i73) * (-32451)) ^ 950299551;
                                            i76 = 1652059951;
                                        } else {
                                            iM559717 = C0873.m55680("ۘۛ") ^ i73;
                                            i75 = ((iM559717 ^ i74) * (-913)) ^ 974946326;
                                            i76 = -775271374;
                                        }
                                        break;
                                    case -176961090:
                                    case 109829740:
                                        ServiceConnectionC1013.m56157();
                                        break;
                                    case 213061296:
                                    case 1948362044:
                                        C12094.m27897(this.f4541, z22);
                                        break;
                                    case 294876715:
                                    case 1603944279:
                                        if (C0955.f81898) {
                                            iM559717 = C0946.m55979("۟ۖ") ^ i74;
                                            i75 = ((iM559717 ^ i73) * (-313)) ^ 1877116595;
                                            i76 = -1046553842;
                                        } else {
                                            iM559717 = (C0946.m55979("᩶ۘ") ^ i73) * 11;
                                            i75 = ((iM559717 ^ i74) * (-31395)) ^ 1614058548;
                                            i76 = 316627218;
                                        }
                                        break;
                                    case 1017853317:
                                    case 1489345804:
                                        if (C0946.f81894 != 0) {
                                            iM559717 = (C0946.m55979("ܰۡ") + i74) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i75 = ((iM559717 ^ i73) * (-32451)) ^ 950299551;
                                            i76 = 1652059951;
                                        } else {
                                            iM559717 = (C0873.m55680("᩷ᩳ") + i73) * 77;
                                            i75 = ((iM559717 ^ i74) * (-26717)) ^ 509555040;
                                            i76 = -572948836;
                                        }
                                        break;
                                    case 1075093079:
                                    case 1494233131:
                                        if (C1229.f82066 >= 0) {
                                            iM559717 = C0946.m55979("᩵ۤ") ^ i73;
                                            i75 = ((iM559717 ^ i74) * 325) ^ 1625184553;
                                            i76 = 2059102669;
                                        } else {
                                            iM559717 = C0946.m55979("۠۠") ^ i74;
                                            i75 = ((iM559717 ^ i73) * (-1691)) ^ (-951136663);
                                            i76 = 2099929359;
                                        }
                                        break;
                                    case 1184075368:
                                    case 1543736322:
                                        C0863.m55643();
                                        C0955.m56025();
                                        iM559717 = (C0946.m55979("ܰۡ") + i74) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                        i75 = ((iM559717 ^ i73) * (-32451)) ^ 950299551;
                                        i76 = 1652059951;
                                        break;
                                    case 1955224561:
                                    case 1979521467:
                                        C0955.m56025();
                                        if (C0877.f81843 < 0) {
                                            iM559717 = (i73 - C0873.m55680("۫ۨ")) * (-107);
                                            i75 = ((iM559717 ^ i74) * 8451) ^ (-1298406883);
                                            i76 = -2137848577;
                                        } else {
                                            iM559717 = C0946.m55979("᩵ۤ") ^ i73;
                                            i75 = ((iM559717 ^ i74) * 325) ^ 1625184553;
                                            i76 = 2059102669;
                                        }
                                        break;
                                    default:
                                        if (C1044.f81959 >= 0) {
                                            iM559717 = (C0946.m55979("ܰۡ") + i74) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i75 = ((iM559717 ^ i73) * (-32451)) ^ 950299551;
                                            i76 = 1652059951;
                                        } else {
                                            iM559717 = (C0946.m55979("ܽ۫") + i74) * 67;
                                            i75 = ((iM559717 ^ i73) * (-31655)) ^ (-339538244);
                                            i76 = -535962768;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    i55 = 8;
                    if (this.f33803) {
                        iM55681 = (C0946.m55979("ۨۖ") ^ i48) * 83;
                        i25 = ((iM55681 ^ i47) * (-31849)) ^ 299279399;
                        i26 = -1675557468;
                    } else {
                        iM55681 = C0873.m55680("۠ۛ") ^ i47;
                        i25 = ((iM55681 ^ i48) * 11019) ^ (-1736644970);
                        i26 = -21699405;
                    }
                    int i72 = iM55681 ^ i26;
                    z19 = z21;
                    i60 = i71;
                    sArr27 = sArr32;
                    sArr26 = sArr31;
                    obj11 = obj13;
                    sArr25 = sArr30;
                    c120911 = c120913;
                    i53 = i72;
                    z17 = objArr == true ? 1 : 0;
                    z18 = z20;
                    sArr28 = sArr33;
                    c20677 = c206710;
                    i54 = i70;
                    i61 = i25;
                    obj10 = obj14;
                    dialogInterfaceC2569 = dialogInterfaceC25611;
                    view7 = view7;
                    th8 = th8;
                    i57 = i57;
                    interfaceC14106 = interfaceC14106;
                    str9 = str9;
                    str10 = str10;
                    c0994 = c0994;
                    break;
                case -1120850607:
                case 1343079890:
                    z18 = true;
                    iM55979 = C0873.m55680("֨᩵") ^ i47;
                    i61 = 808426702 ^ ((iM55979 ^ i48) * 14781);
                    i = -1461643998;
                    i53 = iM55979 ^ i;
                    break;
                case -947277281:
                case 963721647:
                    C0949.m56011(th8, obj11);
                    dialogInterfaceC2566 = dialogInterfaceC2569;
                    obj6 = obj11;
                    c0992 = c0994;
                    str10 = str10;
                    i10 = i54;
                    sArr15 = sArr25;
                    sArr11 = sArr26;
                    sArr12 = sArr27;
                    str4 = str9;
                    c20673 = c20677;
                    z6 = z18;
                    interfaceC14101 = interfaceC14106;
                    i11 = i57;
                    th2 = th8;
                    view = view7;
                    obj3 = obj10;
                    sArr6 = sArr28;
                    z14 = z19;
                    c12097 = c120911;
                    i24 = i60;
                    iM55682 = C0946.m55979("۟ᩳ") ^ i47;
                    i28 = ((iM55682 ^ i48) * 26667) ^ 699706983;
                    i29 = -1820639289;
                    i53 = iM55682 ^ i29;
                    sArr25 = sArr15;
                    i60 = i24;
                    sArr27 = sArr12;
                    sArr26 = sArr11;
                    dialogInterfaceC2569 = dialogInterfaceC2566;
                    obj11 = obj6;
                    c120911 = c12097;
                    z19 = z14;
                    sArr28 = sArr6;
                    obj10 = obj3;
                    view7 = view;
                    th8 = th2;
                    i57 = i11;
                    interfaceC14106 = interfaceC14101;
                    str9 = str4;
                    str10 = str10;
                    c0994 = c0992;
                    c20676 = c20673;
                    i54 = i10;
                    i61 = i28;
                    z18 = z6;
                    c20677 = c20676;
                    break;
                case -923693087:
                case 1878331439:
                    if (!C0866.m55645()) {
                        iM55686 = i57;
                        c20671M55654 = c20677;
                        i42 = i54;
                        th7 = th8;
                        z6 = z18;
                        view6 = view7;
                        int iM556814 = (i47 - C0873.m55680("۠᩻")) * (-53);
                        C20671 c206711 = c20671M55654;
                        i54 = i42;
                        i61 = ((iM556814 ^ i48) * 29881) ^ 663121161;
                        i53 = iM556814 ^ 1865151281;
                        z18 = z6;
                        c20677 = c206711;
                        view7 = view6;
                        th8 = th7;
                        i57 = iM55686;
                    } else {
                        i37 = i54;
                        sArr23 = sArr27;
                        c20675 = c20677;
                        z16 = z18;
                        i38 = i57;
                        th6 = th8;
                        view5 = view7;
                        obj9 = obj10;
                        sArr22 = sArr28;
                        iM55685 = C0946.m55979("ܰ֡") ^ i48;
                        i39 = ((iM55685 ^ i47) * 18725) ^ 27643640;
                        i41 = -891783808;
                        i53 = iM55685 ^ i41;
                        sArr28 = sArr22;
                        sArr27 = sArr23;
                        obj10 = obj9;
                        view7 = view5;
                        th8 = th6;
                        i57 = i38;
                        z18 = z16;
                        c20677 = c20675;
                        i54 = i37;
                        i61 = i39;
                    }
                    break;
                case -922021566:
                case 1248605284:
                    try {
                        this.f33803 = z18;
                        iM55979 = C0946.m55979("᩺֫") ^ i47;
                        i61 = 1204077343 ^ ((iM55979 ^ i48) * (-2517));
                        i = 203624700;
                        i53 = iM55979 ^ i;
                    } catch (Throwable th10) {
                        th = th10;
                        dialogInterfaceC2569 = dialogInterfaceC2569;
                        obj11 = obj11;
                        c0994 = c0994;
                        str10 = str10;
                        view7 = view7;
                        obj10 = obj10;
                        i54 = i54;
                        sArr24 = sArr24;
                        i58 = i58;
                        i59 = i59;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        sArr27 = sArr27;
                        sArr28 = sArr28;
                        i62 = i62;
                        i13 = iM559714;
                        str9 = str9;
                        c20677 = c20677;
                        z18 = z18;
                        z5 = z17 ? 1 : 0;
                        z19 = z19;
                        c120911 = c120911;
                        interfaceC14106 = interfaceC14106;
                        i57 = i57;
                        i60 = i60;
                        int iM556815 = (C0873.m55680("֫ۢ") ^ i48) * 77;
                        Throwable th11 = th;
                        i58 = i58;
                        i59 = i59;
                        i60 = i60;
                        i57 = i57;
                        interfaceC14106 = interfaceC14106;
                        str9 = str9;
                        sArr27 = sArr27;
                        sArr26 = sArr26;
                        dialogInterfaceC2569 = dialogInterfaceC2569;
                        obj11 = obj11;
                        sArr25 = sArr25;
                        sArr24 = sArr24;
                        str10 = str10;
                        c120911 = c120911;
                        c0994 = c0994;
                        z19 = z19;
                        z17 = z5;
                        z18 = z18;
                        c20677 = c20677;
                        i54 = i54;
                        i61 = ((iM556815 ^ i47) * 3927) ^ 395778741;
                        i53 = iM556815 ^ (-65179657);
                        int i73 = i13;
                        i62 = i62;
                        sArr28 = sArr28;
                        obj10 = obj10;
                        view7 = view7;
                        th8 = th11;
                        iM559714 = i73;
                    }
                    break;
                case -807310182:
                case 918269092:
                    int i74 = i57;
                    C20671 c206712 = c20677;
                    Object obj15 = obj10;
                    i42 = i54;
                    ViewOnClickListenerC0939.m55953(c206712, i74, obj15);
                    th7 = th8;
                    z6 = z18;
                    C1124.m56374(c206712, C0873.m55680(C1124.m56373(f82125, 46, 3, i42)) ^ 2102465254, obj15);
                    short[] sArr34 = f82125;
                    if (C1929.f83011 == 0) {
                        int iM559717 = C0946.m55979("ۨ᩶") ^ i48;
                        obj10 = obj15;
                        i54 = i42;
                        i61 = ((iM559717 ^ i47) * 15887) ^ (-276819017);
                        th8 = th7;
                        i57 = i74;
                        i56 = 49;
                        c20676 = c206712;
                        sArr28 = sArr34;
                        i53 = iM559717 ^ 1325039546;
                        z18 = z6;
                        c20677 = c20676;
                    } else {
                        obj10 = obj15;
                        iM55686 = i74;
                        view6 = view7;
                        i56 = 49;
                        sArr28 = sArr34;
                        c20671M55654 = c206712;
                        int iM556816 = (i47 - C0873.m55680("۠᩻")) * (-53);
                        C20671 c206713 = c20671M55654;
                        i54 = i42;
                        i61 = ((iM556816 ^ i48) * 29881) ^ 663121161;
                        i53 = iM556816 ^ 1865151281;
                        z18 = z6;
                        c20677 = c206713;
                        view7 = view6;
                        th8 = th7;
                        i57 = iM55686;
                    }
                    break;
                case -801489783:
                case 370181424:
                    RunnableC0897.m55784();
                    if (!C0955.m56025()) {
                        dialogInterfaceC2564 = dialogInterfaceC2569;
                        obj = obj11;
                        c0990 = c0994;
                        str2 = str10;
                        viewM56111 = view7;
                        obj2 = obj10;
                        i2 = i54;
                        sArr = sArr24;
                        i3 = i58;
                        i4 = i59;
                        sArr2 = sArr25;
                        sArr3 = sArr26;
                        sArr4 = sArr27;
                        sArr5 = sArr28;
                        str3 = str9;
                        c20671 = c20677;
                        z = z18;
                        z2 = z17 ? 1 : 0;
                        z3 = z19;
                        c12096 = c120911;
                        interfaceC14100 = interfaceC14106;
                        i5 = i57;
                        i6 = i60;
                        th = th8;
                        iM55680 = C0873.m55680("ܽۨ") ^ i47;
                        i15 = ((iM55680 ^ i48) * 17247) ^ (-610436288);
                        i14 = -1168043379;
                        int i610 = iM55680 ^ i14;
                        i58 = i3;
                        i59 = i4;
                        i60 = i6;
                        th8 = th;
                        sArr27 = sArr4;
                        sArr26 = sArr3;
                        dialogInterfaceC2569 = dialogInterfaceC2564;
                        obj11 = obj;
                        sArr25 = sArr2;
                        sArr24 = sArr;
                        c120911 = c12096;
                        i57 = i5;
                        interfaceC14106 = interfaceC14100;
                        str9 = str3;
                        z19 = z3;
                        str10 = str2;
                        c0994 = c0990;
                        z17 = z2;
                        z18 = z;
                        c20677 = c20671;
                        i54 = i2;
                        i61 = i15;
                        sArr28 = sArr5;
                        obj10 = obj2;
                        view7 = viewM56111;
                        i53 = i610;
                    } else {
                        iM55979 = (C0946.m55979("᩷ۢ") + i48) * (-25);
                        i61 = 50947257 ^ ((iM55979 ^ i47) * 26107);
                        i = 1019694383;
                        i53 = iM55979 ^ i;
                    }
                    break;
                case -708905609:
                case 1866760000:
                    if (AbstractC0942.f81890 <= 0) {
                        dialogInterfaceC2567 = dialogInterfaceC2569;
                        c0992 = c0994;
                        interfaceC14103 = interfaceC14106;
                        strM55921 = str9;
                        i30 = i57;
                        i10 = i54;
                        sArr19 = sArr25;
                        sArr16 = sArr26;
                        sArr17 = sArr27;
                        th4 = th8;
                        z15 = z19;
                        c12099 = c120911;
                        view3 = view7;
                        c20673 = c20677;
                        obj7 = obj10;
                        i31 = i60;
                        sArr18 = sArr28;
                        z6 = z18;
                        iM55683 = (C0946.m55979("ۙܰ") ^ i47) * 87;
                        i28 = ((iM55683 ^ i48) * 25581) ^ (-800967704);
                        i32 = 510006109;
                        sArr25 = sArr19;
                        i60 = i31;
                        sArr27 = sArr17;
                        sArr26 = sArr16;
                        dialogInterfaceC2569 = dialogInterfaceC2567;
                        c120911 = c12099;
                        z19 = z15;
                        str9 = strM55921;
                        i53 = iM55683 ^ i32;
                        sArr28 = sArr18;
                        obj10 = obj7;
                        view7 = view3;
                        th8 = th4;
                        i57 = i30;
                        interfaceC14106 = interfaceC14103;
                        c0994 = c0992;
                        c20676 = c20673;
                        i54 = i10;
                        i61 = i28;
                        z18 = z6;
                        c20677 = c20676;
                    } else {
                        dialogInterfaceC2566 = dialogInterfaceC2569;
                        obj6 = obj11;
                        c0994 = c0994;
                        str10 = str10;
                        i10 = i54;
                        sArr13 = sArr24;
                        i22 = i58;
                        i23 = i59;
                        sArr11 = sArr26;
                        sArr12 = sArr27;
                        str4 = str9;
                        c20673 = c20677;
                        z6 = z18;
                        z7 = z17 ? 1 : 0;
                        z8 = z19;
                        c12097 = c120911;
                        interfaceC14101 = interfaceC14106;
                        i11 = i57;
                        i24 = i60;
                        th2 = th8;
                        view = view7;
                        obj3 = obj10;
                        sArr6 = sArr28;
                        int iM556817 = (i47 - C0873.m55680("᩷ܶ")) * 37;
                        i39 = ((iM556817 ^ i48) * (-30935)) ^ 1301823979;
                        i53 = iM556817 ^ 801448837;
                        i58 = i22;
                        i59 = i23;
                        i60 = i24;
                        sArr28 = sArr6;
                        sArr27 = sArr12;
                        sArr26 = sArr11;
                        dialogInterfaceC2569 = dialogInterfaceC2566;
                        obj11 = obj6;
                        sArr24 = sArr13;
                        c120911 = c12097;
                        obj10 = obj3;
                        view7 = view;
                        z19 = z8;
                        th8 = th2;
                        z17 = z7;
                        i57 = i11;
                        interfaceC14106 = interfaceC14101;
                        str9 = str4;
                        z18 = z6;
                        c20677 = c20673;
                        i54 = i10;
                        str10 = str10;
                        c0994 = c0994;
                        i61 = i39;
                    }
                    break;
                case -514819679:
                case 1961933279:
                    try {
                        RunnableC0897.m55779(inputStreamM55830);
                        dialogInterfaceC2566 = dialogInterfaceC2569;
                        obj6 = obj11;
                        c0992 = c0994;
                        str10 = str10;
                        i10 = i54;
                        sArr15 = sArr25;
                        sArr11 = sArr26;
                        sArr12 = sArr27;
                        str4 = str9;
                        c20673 = c20677;
                        z6 = z18;
                        interfaceC14101 = interfaceC14106;
                        i11 = i57;
                        th2 = th8;
                        view = view7;
                        obj3 = obj10;
                        sArr6 = sArr28;
                        z14 = z19;
                        c12097 = c120911;
                        i24 = i60;
                        iM55682 = C0946.m55979("۟ᩳ") ^ i47;
                        i28 = ((iM55682 ^ i48) * 26667) ^ 699706983;
                        i29 = -1820639289;
                        i53 = iM55682 ^ i29;
                        sArr25 = sArr15;
                        i60 = i24;
                        sArr27 = sArr12;
                        sArr26 = sArr11;
                        dialogInterfaceC2569 = dialogInterfaceC2566;
                        obj11 = obj6;
                        c120911 = c12097;
                        z19 = z14;
                        sArr28 = sArr6;
                        obj10 = obj3;
                        view7 = view;
                        th8 = th2;
                        i57 = i11;
                        interfaceC14106 = interfaceC14101;
                        str9 = str4;
                        str10 = str10;
                        c0994 = c0992;
                        c20676 = c20673;
                        i54 = i10;
                        i61 = i28;
                        z18 = z6;
                        c20677 = c20676;
                    } catch (Throwable th12) {
                        int iM559718 = C0946.m55979("۫᩸") ^ i48;
                        obj11 = th12;
                        i53 = iM559718 ^ 453546282;
                        i61 = ((iM559718 ^ i47) * (-26797)) ^ (-1967855544);
                    }
                    break;
                case -483971011:
                case -341840438:
                    InterfaceC14100 interfaceC14108 = interfaceC14106;
                    i33 = i57;
                    i34 = i54;
                    sArr20 = sArr27;
                    th5 = th8;
                    view4 = view7;
                    c20672 = c20677;
                    obj8 = obj10;
                    sArr21 = sArr28;
                    z4 = z18;
                    String str16 = str9;
                    str7 = str10;
                    interfaceC14104 = interfaceC14108;
                    C1964.m56598(c120912, C0890.m55734(interfaceC14108, str16, str7));
                    str8 = str16;
                    dialogInterfaceC2568 = dialogInterfaceC2569;
                    c120910 = c120911;
                    C1964.m56598(c120910, C0890.m55734(ApplicationC21448.f67649, C1053.m56325(f82125, 33, 4, i34), str7));
                    sArr26 = f82125;
                    i60 = 37;
                    if (C0917.f81868) {
                        iM55684 = C0873.m55680("ۧ֫") ^ i48;
                        i35 = ((iM55684 ^ i47) * 28471) ^ (-1517593490);
                        i36 = 879298300;
                    } else {
                        iM55684 = (C0873.m55680("ܳܽ") + i48) * (-31);
                        i35 = ((iM55684 ^ i47) * 17735) ^ 1297458742;
                        i36 = -1636046883;
                    }
                    i53 = iM55684 ^ i36;
                    c120911 = c120910;
                    sArr27 = sArr20;
                    dialogInterfaceC2569 = dialogInterfaceC2568;
                    i7 = i34;
                    i61 = i35;
                    sArr28 = sArr21;
                    obj10 = obj8;
                    view7 = view4;
                    th8 = th5;
                    i57 = i33;
                    interfaceC14106 = interfaceC14104;
                    str9 = str8;
                    str10 = str7;
                    z18 = z4;
                    c20677 = c20672;
                    i54 = i7;
                    break;
                case -475252661:
                case 54243649:
                    c0994 = c0994;
                    str10 = str10;
                    i10 = i54;
                    str4 = str9;
                    c20673 = c20677;
                    z6 = z18;
                    z7 = z17 ? 1 : 0;
                    z8 = z19;
                    c12097 = c120911;
                    interfaceC14101 = interfaceC14106;
                    i11 = i57;
                    th2 = th8;
                    view = view7;
                    obj3 = obj10;
                    sArr6 = sArr28;
                    int iM559719 = (C0946.m55979("᩸۫") + i47) * (-21);
                    i12 = ((iM559719 ^ i48) * (-4949)) ^ 1491944294;
                    i53 = iM559719 ^ 507994340;
                    i58 = i58;
                    i59 = i59;
                    iM559714 = iM559714;
                    i60 = i60;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    dialogInterfaceC2569 = dialogInterfaceC2569;
                    obj11 = obj11;
                    sArr25 = sArr25;
                    sArr24 = sArr24;
                    i62 = 4;
                    c120911 = c12097;
                    z19 = z8;
                    z17 = z7;
                    z18 = z6;
                    c20677 = c20673;
                    i54 = i10;
                    i61 = i12;
                    sArr28 = sArr6;
                    obj10 = obj3;
                    view7 = view;
                    th8 = th2;
                    i57 = i11;
                    interfaceC14106 = interfaceC14101;
                    str9 = str4;
                    str10 = str10;
                    c0994 = c0994;
                    break;
                case -392050279:
                case 650101861:
                    C1194.m56396();
                    throw new RuntimeException();
                case -381804412:
                case -184807750:
                    dialogInterfaceC2569 = dialogInterfaceC2569;
                    obj11 = obj11;
                    int i75 = iM559714;
                    c0994 = c0994;
                    str10 = str10;
                    i54 = i54;
                    sArr24 = sArr24;
                    i58 = i58;
                    i59 = i59;
                    sArr25 = sArr25;
                    sArr26 = sArr26;
                    sArr27 = sArr27;
                    str9 = str9;
                    c20677 = c20677;
                    z18 = z18;
                    z5 = z17 ? 1 : 0;
                    z19 = z19;
                    c120911 = c120911;
                    interfaceC14106 = interfaceC14106;
                    i57 = i57;
                    i60 = i60;
                    th8 = th8;
                    view7 = view7;
                    obj10 = obj10;
                    sArr28 = sArr28;
                    i62 = i62;
                    try {
                        byte[] bArr = new byte[i62];
                        C23461.m52184(inputStreamM55830, bArr, i62);
                        iM55651 = C0866.m55651(z5 ? 1 : 0, bArr);
                        iM559710 = (i48 - C0873.m55680("ۛܰ")) * 57;
                        iM559714 = i75;
                        i8 = ((iM559710 ^ i47) * 4923) ^ 1552434418;
                        i9 = -1060959936;
                        i53 = iM559710 ^ i9;
                        i58 = i58;
                        i59 = i59;
                        iM559714 = iM559714;
                        i60 = i60;
                        sArr27 = sArr27;
                        sArr26 = sArr26;
                        dialogInterfaceC2569 = dialogInterfaceC2569;
                        obj11 = obj11;
                        sArr25 = sArr25;
                        sArr24 = sArr24;
                        i62 = i62;
                        c120911 = c120911;
                        sArr28 = sArr28;
                        z19 = z19;
                        obj10 = obj10;
                        view7 = view7;
                        z17 = z5;
                        th8 = th8;
                        z18 = z18;
                        c20677 = c20677;
                        i54 = i54;
                        i57 = i57;
                        interfaceC14106 = interfaceC14106;
                        str9 = str9;
                        i61 = i8;
                        str10 = str10;
                        c0994 = c0994;
                    } catch (Throwable th13) {
                        th = th13;
                        i13 = i75;
                        int iM556818 = (C0873.m55680("֫ۢ") ^ i48) * 77;
                        Throwable th14 = th;
                        i58 = i58;
                        i59 = i59;
                        i60 = i60;
                        i57 = i57;
                        interfaceC14106 = interfaceC14106;
                        str9 = str9;
                        sArr27 = sArr27;
                        sArr26 = sArr26;
                        dialogInterfaceC2569 = dialogInterfaceC2569;
                        obj11 = obj11;
                        sArr25 = sArr25;
                        sArr24 = sArr24;
                        str10 = str10;
                        c120911 = c120911;
                        c0994 = c0994;
                        z19 = z19;
                        z17 = z5;
                        z18 = z18;
                        c20677 = c20677;
                        i54 = i54;
                        i61 = ((iM556818 ^ i47) * 3927) ^ 395778741;
                        i53 = iM556818 ^ (-65179657);
                        int i76 = i13;
                        i62 = i62;
                        sArr28 = sArr28;
                        obj10 = obj10;
                        view7 = view7;
                        th8 = th14;
                        iM559714 = i76;
                    }
                    break;
                case -5714432:
                case 1296663375:
                    i37 = i54;
                    c20675 = c20677;
                    z16 = z18;
                    i38 = i57;
                    th6 = th8;
                    view5 = view7;
                    obj9 = obj10;
                    short[] sArr35 = sArr28;
                    short[] sArr36 = sArr26;
                    int i77 = i60;
                    C0947.m55996(C1404.m56465(view5, C0946.m55979(C1404.m56462(sArr36, i77, 3, i37)) ^ 2102283864), new View.OnClickListener() { // from class: l.֨ۤܽ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view9) {
                            C12094.m27890(this.f6671);
                        }
                    });
                    sArr27 = f82125;
                    if (C0861.f81831) {
                        iM559712 = (C0946.m55979("ᩳ֫") ^ i47) * (-59);
                        i39 = ((iM559712 ^ i48) * (-667)) ^ 327069113;
                        i40 = -1118414433;
                    } else {
                        iM559712 = (C0873.m55680("۫ۘ") + i48) * (-119);
                        i39 = ((iM559712 ^ i47) * (-15565)) ^ (-543213904);
                        i40 = -1574069001;
                    }
                    i53 = iM559712 ^ i40;
                    i60 = i77;
                    sArr28 = sArr35;
                    sArr26 = sArr36;
                    obj10 = obj9;
                    view7 = view5;
                    th8 = th6;
                    i57 = i38;
                    z18 = z16;
                    c20677 = c20675;
                    i54 = i37;
                    i61 = i39;
                    break;
                case 163397507:
                case 1325304310:
                    ServiceConnectionC1013.m56157();
                    C1028.m56247();
                    i37 = i54;
                    sArr23 = sArr27;
                    c20675 = c20677;
                    z16 = z18;
                    i38 = i57;
                    th6 = th8;
                    view5 = view7;
                    obj9 = obj10;
                    sArr22 = sArr28;
                    iM55685 = C0946.m55979("ܰ֡") ^ i48;
                    i39 = ((iM55685 ^ i47) * 18725) ^ 27643640;
                    i41 = -891783808;
                    i53 = iM55685 ^ i41;
                    sArr28 = sArr22;
                    sArr27 = sArr23;
                    obj10 = obj9;
                    view7 = view5;
                    th8 = th6;
                    i57 = i38;
                    z18 = z16;
                    c20677 = c20675;
                    i54 = i37;
                    i61 = i39;
                    break;
                case 311238524:
                case 1178630552:
                    try {
                        RunnableC0897.m55779(inputStreamM55830);
                        z5 = z17 ? 1 : 0;
                        iM559710 = C0946.m55979("᩺ۛ") ^ i47;
                        i8 = ((iM559710 ^ i48) * (-12495)) ^ (-1695621705);
                        i9 = -299684956;
                    } catch (IOException unused2) {
                        dialogInterfaceC2569 = dialogInterfaceC2569;
                        obj11 = obj11;
                        c0994 = c0994;
                        str10 = str10;
                        i54 = i54;
                        sArr24 = sArr24;
                        i58 = i58;
                        i59 = i59;
                        sArr25 = sArr25;
                        sArr26 = sArr26;
                        sArr27 = sArr27;
                        str9 = str9;
                        c20677 = c20677;
                        z18 = z18;
                        z5 = z17 ? 1 : 0;
                        z19 = z19;
                        c120911 = c120911;
                        interfaceC14106 = interfaceC14106;
                        i57 = i57;
                        i60 = i60;
                        th8 = th8;
                        view7 = view7;
                        obj10 = obj10;
                        sArr28 = sArr28;
                        i62 = i62;
                        iM559714 = iM559714;
                        iM559710 = (C0873.m55680("۟֨") + i48) * (-57);
                        i8 = ((iM559710 ^ i47) * 26979) ^ (-383167587);
                        i9 = -512549510;
                    }
                    i53 = iM559710 ^ i9;
                    i58 = i58;
                    i59 = i59;
                    iM559714 = iM559714;
                    i60 = i60;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    dialogInterfaceC2569 = dialogInterfaceC2569;
                    obj11 = obj11;
                    sArr25 = sArr25;
                    sArr24 = sArr24;
                    i62 = i62;
                    c120911 = c120911;
                    sArr28 = sArr28;
                    z19 = z19;
                    obj10 = obj10;
                    view7 = view7;
                    z17 = z5;
                    th8 = th8;
                    z18 = z18;
                    c20677 = c20677;
                    i54 = i54;
                    i57 = i57;
                    interfaceC14106 = interfaceC14106;
                    str9 = str9;
                    i61 = i8;
                    str10 = str10;
                    c0994 = c0994;
                    break;
                case 724098446:
                case 1820579676:
                    int i78 = i54;
                    C20671 c206714 = c20677;
                    Object obj16 = obj10;
                    C1124.m56363(c206714, C0873.m55680(C0877.m55707(sArr28, i56, 3, i78)) ^ 2120352959, obj16);
                    c206714.m46714(new DialogInterface.OnDismissListener(this) { // from class: l.۠ۤܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C12094 f27985;

                        {
                            int i79 = -1301637709;
                            int i80 = C1017.f81942;
                            int i81 = C0912.f81867;
                            int iM559720 = C0946.m55979("֨ܰ") ^ i80;
                            int i82 = ((iM559720 ^ i81) * 23451) ^ (-1430760201);
                            int i83 = 473003526;
                            while (true) {
                                i79 = ((((i79 ^ i81) * 32063) >> 31) & i82) ^ (iM559720 ^ i83);
                                switch (i79) {
                                    case -2056874461:
                                    case 864223976:
                                        return;
                                    case -2031944535:
                                    case 644331382:
                                        C0927.m55873();
                                        C0863.m55643();
                                        iM559720 = (C0873.m55680("ۤۡ") + i81) * 15;
                                        i82 = ((iM559720 ^ i80) * (-7643)) ^ 792819500;
                                        i83 = 1419790770;
                                        break;
                                    case -1722543847:
                                    case -143103762:
                                        if (C1012.f81938 >= 0) {
                                            iM559720 = (i80 - C0873.m55680("ۘܿ")) * 9;
                                            i82 = ((iM559720 ^ i81) * 28775) ^ (-386249919);
                                            i83 = -1768635993;
                                        } else {
                                            iM559720 = C0873.m55680("ᩴۜ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * 29793) ^ 514051517;
                                            i83 = 1423745153;
                                        }
                                        break;
                                    case -1404075699:
                                    case 1299435080:
                                        C1017.m56187();
                                        C1124.m56367();
                                        throw new RuntimeException();
                                    case -1396915948:
                                    case -795568705:
                                        if (C0917.f81868) {
                                            iM559720 = (C0946.m55979("ܽۜ") + i81) * 45;
                                            i82 = ((iM559720 ^ i80) * 1093) ^ (-392139700);
                                            i83 = -382309082;
                                        } else {
                                            iM559720 = C0946.m55979("ۜۨ") ^ i81;
                                            i82 = ((iM559720 ^ i80) * C0719o.a.f2906l) ^ (-8189989);
                                            i83 = 1153301217;
                                        }
                                        break;
                                    case -1257978364:
                                    case 2045024267:
                                        if (C1036.f81953 >= 0) {
                                            iM559720 = (C0873.m55680("ۤۡ") + i81) * 15;
                                            i82 = ((iM559720 ^ i80) * (-7643)) ^ 792819500;
                                            i83 = 1419790770;
                                        } else {
                                            iM559720 = (C0873.m55680("ۜۡ") + i81) * (-103);
                                            i82 = ((iM559720 ^ i80) * 29923) ^ 2060146314;
                                            i83 = 1160732010;
                                        }
                                        break;
                                    case -907184548:
                                    case 716574132:
                                        C1024.m56209();
                                        if (C1012.f81938 < 0) {
                                            iM559720 = (C0946.m55979("ܽۜ") + i81) * 45;
                                            i82 = ((iM559720 ^ i80) * 1093) ^ (-392139700);
                                            i83 = -382309082;
                                        } else {
                                            iM559720 = C0946.m55979("ۤۘ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * (-30873)) ^ 725818553;
                                            i83 = 1465592983;
                                        }
                                        break;
                                    case -827292816:
                                    case 125303545:
                                        if (C1012.f81938 >= 0) {
                                            iM559720 = (C0946.m55979("۠ۘ") + i80) * 5;
                                            i82 = ((iM559720 ^ i81) * (-24989)) ^ (-1833921657);
                                            i83 = -45726228;
                                        } else {
                                            iM559720 = (C0873.m55680("ۡ֡") + i80) * 85;
                                            i82 = ((iM559720 ^ i81) * 5809) ^ (-1449272574);
                                            i83 = -313135385;
                                        }
                                        break;
                                    case -598306162:
                                    case 1100849197:
                                        if (C0861.f81831) {
                                            iM559720 = C0873.m55680("۬ۡ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * 8273) ^ 2069601812;
                                            i83 = 1690113851;
                                        } else {
                                            iM559720 = (C0946.m55979("ܽۜ") + i81) * 45;
                                            i82 = ((iM559720 ^ i80) * 1093) ^ (-392139700);
                                            i83 = -382309082;
                                        }
                                        break;
                                    case -437793626:
                                    case 866078971:
                                        C1124.m56367();
                                        if (C1194.f82045 != 0) {
                                            iM559720 = C0946.m55979("ۤۘ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * (-30873)) ^ 725818553;
                                            i83 = 1465592983;
                                        } else {
                                            iM559720 = (C0873.m55680("ۤۡ") + i81) * 15;
                                            i82 = ((iM559720 ^ i80) * (-7643)) ^ 792819500;
                                            i83 = 1419790770;
                                        }
                                        break;
                                    case -70385831:
                                    case 1304751032:
                                        if (C0845.f81821 >= 0) {
                                            iM559720 = (C0873.m55680("ۤۡ") + i81) * 15;
                                            i82 = ((iM559720 ^ i80) * (-7643)) ^ 792819500;
                                            i83 = 1419790770;
                                        } else {
                                            iM559720 = (i81 - C0946.m55979("᩺ۡ")) * 45;
                                            i82 = ((iM559720 ^ i80) * (-19945)) ^ 794169038;
                                            i83 = 1185668541;
                                        }
                                        break;
                                    case -64616037:
                                    case 981350080:
                                        if (C0898.f81858 <= 0) {
                                            iM559720 = C0946.m55979("ۤۘ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * (-30873)) ^ 725818553;
                                            i83 = 1465592983;
                                        } else {
                                            iM559720 = (C0873.m55680("ۖۧ") ^ i81) * (-39);
                                            i82 = ((iM559720 ^ i80) * (-14719)) ^ 2144149056;
                                            i83 = 896393060;
                                        }
                                        break;
                                    case 65491505:
                                    case 1218736748:
                                        if (C0882.m55710() != 0) {
                                            iM559720 = (C0946.m55979("۠ۘ") + i80) * 5;
                                            i82 = ((iM559720 ^ i81) * (-24989)) ^ (-1833921657);
                                            i83 = -45726228;
                                        } else {
                                            iM559720 = (C0873.m55680("ۤۡ") + i81) * 15;
                                            i82 = ((iM559720 ^ i80) * (-7643)) ^ 792819500;
                                            i83 = 1419790770;
                                        }
                                        break;
                                    case 578896017:
                                    case 1340878357:
                                        if (C0947.f81895) {
                                            iM559720 = (i80 - C0873.m55680("ۘܿ")) * 9;
                                            i82 = ((iM559720 ^ i81) * 28775) ^ (-386249919);
                                            i83 = -1768635993;
                                        } else {
                                            iM559720 = (i81 - C0873.m55680("ܿۨ")) * 99;
                                            i82 = ((iM559720 ^ i80) * 17807) ^ 961675918;
                                            i83 = 1529387941;
                                        }
                                        break;
                                    case 1171826767:
                                    case 1815215076:
                                        if (C1929.f83011 != 0) {
                                            iM559720 = (i80 - C0873.m55680("ۘܿ")) * 9;
                                            i82 = ((iM559720 ^ i81) * 28775) ^ (-386249919);
                                            i83 = -1768635993;
                                        } else {
                                            iM559720 = C0873.m55680("ۜᩳ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * 28927) ^ (-732515692);
                                            i83 = -1876671632;
                                        }
                                        break;
                                    default:
                                        this.f27985 = this;
                                        if (C1229.m56410() != 0) {
                                            iM559720 = (i80 - C0873.m55680("ۘܿ")) * 9;
                                            i82 = ((iM559720 ^ i81) * 28775) ^ (-386249919);
                                            i83 = -1768635993;
                                        } else {
                                            iM559720 = C0946.m55979("ۡܰ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * (-9783)) ^ (-1014685160);
                                            i83 = -1669514339;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C0990 c0999 = null;
                            int i79 = 1000347142;
                            int i80 = RunnableC0938.f81886;
                            int i81 = C1012.f81938;
                            int iM559720 = C0946.m55979("᩻ۨ") ^ i80;
                            int i82 = ((iM559720 ^ i81) * 23067) ^ 2072864453;
                            int i83 = -1069263540;
                            while (true) {
                                i79 = ((((i79 ^ i81) * (-17641)) >> 31) & i82) ^ (iM559720 ^ i83);
                                switch (i79) {
                                    case -2040377345:
                                    case 218606942:
                                        if (C0863.f81833 <= 0) {
                                            iM559720 = C0873.m55680("ۚۘ") ^ i81;
                                            i82 = ((iM559720 ^ i80) * (-13133)) ^ 725811074;
                                            i83 = 2045984832;
                                        } else {
                                            iM559720 = C0946.m55979("ۛܺ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * (-26267)) ^ (-1433955713);
                                            i83 = 6470716;
                                        }
                                        break;
                                    case -1884234163:
                                    case 237051634:
                                        if (C1229.f82066 >= 0) {
                                            iM559720 = (C0946.m55979("ۢᩳ") ^ i81) * 101;
                                            i82 = ((iM559720 ^ i80) * 16021) ^ (-1342949748);
                                            i83 = 957036133;
                                        } else {
                                            iM559720 = (C0946.m55979("᩸ܽ") ^ i81) * 99;
                                            i82 = ((iM559720 ^ i80) * 11351) ^ 25611363;
                                            i83 = -691067606;
                                        }
                                        break;
                                    case -1853769559:
                                    case 890605639:
                                        if (C0967.f81910 >= 0) {
                                            iM559720 = C0873.m55680("ۚۘ") ^ i81;
                                            i82 = ((iM559720 ^ i80) * (-13133)) ^ 725811074;
                                            i83 = 2045984832;
                                        } else {
                                            iM559720 = C0873.m55680("ۘ᩵") ^ i81;
                                            i82 = ((iM559720 ^ i80) * 10449) ^ (-1365698575);
                                            i83 = -300158870;
                                        }
                                        break;
                                    case -1592730207:
                                    case 883577426:
                                        if (C0861.f81831) {
                                            iM559720 = C0946.m55979("ۢۗ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * (-8085)) ^ 1171815511;
                                            i83 = 1753888478;
                                        } else {
                                            iM559720 = (C0873.m55680("۬᩹") ^ i81) * 83;
                                            i82 = ((iM559720 ^ i80) * 10431) ^ (-1001737222);
                                            i83 = -1448388644;
                                        }
                                        break;
                                    case -1500565149:
                                    case 111537654:
                                        C0866.m55645();
                                        iM559720 = (C0873.m55680("۬᩹") ^ i81) * 83;
                                        i82 = ((iM559720 ^ i80) * 10431) ^ (-1001737222);
                                        i83 = -1448388644;
                                        break;
                                    case -1444104955:
                                    case -557490547:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559720 = C0873.m55680("ۚۘ") ^ i81;
                                            i82 = ((iM559720 ^ i80) * (-13133)) ^ 725811074;
                                            i83 = 2045984832;
                                        } else {
                                            iM559720 = (i81 - C0946.m55979("ᩳܰ")) * (-95);
                                            i82 = ((iM559720 ^ i80) * 3933) ^ 1156360802;
                                            i83 = 118968343;
                                        }
                                        break;
                                    case -1056349567:
                                    case 1448102465:
                                        C12094.m27893(this.f27985, c0999, c0995);
                                        break;
                                    case -911062020:
                                    case 1331832963:
                                        if (C0845.f81821 >= 0) {
                                            iM559720 = C0946.m55979("֡ۘ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * 6875) ^ 833871872;
                                            i83 = -480575493;
                                        } else {
                                            iM559720 = C0873.m55680("֡ۛ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * (-21679)) ^ 191818539;
                                            i83 = -1521928158;
                                        }
                                        break;
                                    case -857227178:
                                    case 2117753120:
                                        if (C1229.m56410() != 0) {
                                            iM559720 = C0873.m55680("֫ܶ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * (-5333)) ^ 1316138166;
                                            i83 = -1756986313;
                                        } else {
                                            iM559720 = (C0873.m55680("۬᩹") ^ i81) * 83;
                                            i82 = ((iM559720 ^ i80) * 10431) ^ (-1001737222);
                                            i83 = -1448388644;
                                        }
                                        break;
                                    case -619259973:
                                    case 1369747883:
                                        if (C1044.f81959 >= 0) {
                                            iM559720 = C0946.m55979("֡ۘ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * 6875) ^ 833871872;
                                            i83 = -480575493;
                                        } else {
                                            iM559720 = (i80 - C0946.m55979("۫᩻")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i82 = ((iM559720 ^ i81) * (-2035)) ^ (-105167199);
                                            i83 = -134705972;
                                        }
                                        break;
                                    case -308700666:
                                    case 1222476409:
                                        c0999 = c0993;
                                        if (AbstractC0942.m55971()) {
                                            iM559720 = (C0946.m55979("ۢᩳ") ^ i81) * 101;
                                            i82 = ((iM559720 ^ i80) * 16021) ^ (-1342949748);
                                            i83 = 957036133;
                                        } else {
                                            iM559720 = C0946.m55979("ܰۢ") ^ i81;
                                            i82 = ((iM559720 ^ i80) * (-25415)) ^ (-2084179728);
                                            i83 = 1948113947;
                                        }
                                        break;
                                    case -110545471:
                                    case 887863147:
                                        if (C1028.f81950 <= 0) {
                                            iM559720 = C0873.m55680("֫ܶ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * (-5333)) ^ 1316138166;
                                            i83 = -1756986313;
                                        } else {
                                            iM559720 = (i81 - C0873.m55680("ܳۘ")) * (-93);
                                            i82 = ((iM559720 ^ i80) * 29847) ^ (-1345862716);
                                            i83 = 988405527;
                                        }
                                        break;
                                    case -109862863:
                                    case 1924765062:
                                        C1012.m56134();
                                        if (C0992.f81922 < 0) {
                                            iM559720 = C0873.m55680("ۚۘ") ^ i81;
                                            i82 = ((iM559720 ^ i80) * (-13133)) ^ 725811074;
                                            i83 = 2045984832;
                                        } else {
                                            iM559720 = C0873.m55680("֫ܶ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * (-5333)) ^ 1316138166;
                                            i83 = -1756986313;
                                        }
                                        break;
                                    case 471367203:
                                    case 1722531122:
                                        C1124.m56367();
                                        break;
                                    case 590393825:
                                    case 1527727583:
                                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                                            iM559720 = (C0873.m55680("۬᩹") ^ i81) * 83;
                                            i82 = ((iM559720 ^ i80) * 10431) ^ (-1001737222);
                                            i83 = -1448388644;
                                        } else {
                                            iM559720 = (i80 - C0873.m55680("ۡۜ")) * (-25);
                                            i82 = ((iM559720 ^ i81) * (-2623)) ^ (-650875362);
                                            i83 = 760031631;
                                        }
                                        break;
                                    default:
                                        C0989.m56095();
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559720 = C0946.m55979("֡ۘ") ^ i80;
                                            i82 = ((iM559720 ^ i81) * 6875) ^ 833871872;
                                            i83 = -480575493;
                                        } else {
                                            iM559720 = (C0873.m55680("۬᩹") ^ i81) * 83;
                                            i82 = ((iM559720 ^ i80) * 10431) ^ (-1001737222);
                                            i83 = -1448388644;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    DialogInterfaceC2564 dialogInterfaceC2564M55669 = RunnableC0871.m55669(c206714);
                    if (this.f33803) {
                        iM559713 = (i47 - C0946.m55979("ۘۡ")) * 55;
                        i43 = ((iM559713 ^ i48) * (-3111)) ^ (-1649149519);
                        i44 = 1839018522;
                    } else {
                        iM559713 = (C0946.m55979("֫֫") ^ i48) * (-55);
                        i43 = ((iM559713 ^ i47) * 14787) ^ 1226286291;
                        i44 = 124427337;
                    }
                    i53 = iM559713 ^ i44;
                    i54 = i78;
                    i61 = i43;
                    sArr28 = sArr28;
                    obj10 = obj16;
                    c20677 = c206714;
                    dialogInterfaceC2569 = dialogInterfaceC2564M55669;
                    break;
                case 1103270988:
                case 1439530040:
                    dialogInterfaceC2567 = dialogInterfaceC2569;
                    i30 = i57;
                    i10 = i54;
                    sArr16 = sArr26;
                    sArr17 = sArr27;
                    th4 = th8;
                    view3 = view7;
                    c20673 = c20677;
                    obj7 = obj10;
                    sArr18 = sArr28;
                    z6 = z18;
                    sArr19 = sArr25;
                    boolean z22 = z19;
                    c12099 = c120911;
                    c0992 = c0994;
                    C0890.m55728(c0992, C0890.m55727(interfaceC14105, C1229.m56403(sArr19, 26, 3, i10), z22));
                    interfaceC14103 = ApplicationC21448.f67649;
                    i31 = i60;
                    z15 = z22;
                    strM55921 = C0937.m55921(f82125, 29, 4, i10);
                    str10 = "";
                    if (C1404.f82149 >= 0) {
                        iM55683 = (C0946.m55979("ۙܰ") ^ i47) * 87;
                        i28 = ((iM55683 ^ i48) * 25581) ^ (-800967704);
                        i32 = 510006109;
                    } else {
                        iM55683 = C0873.m55680("ۘ֨") ^ i48;
                        i28 = ((iM55683 ^ i47) * 24843) ^ (-1081023472);
                        i32 = -907645838;
                    }
                    sArr25 = sArr19;
                    i60 = i31;
                    sArr27 = sArr17;
                    sArr26 = sArr16;
                    dialogInterfaceC2569 = dialogInterfaceC2567;
                    c120911 = c12099;
                    z19 = z15;
                    str9 = strM55921;
                    i53 = iM55683 ^ i32;
                    sArr28 = sArr18;
                    obj10 = obj7;
                    view7 = view3;
                    th8 = th4;
                    i57 = i30;
                    interfaceC14106 = interfaceC14103;
                    c0994 = c0992;
                    c20676 = c20673;
                    i54 = i10;
                    i61 = i28;
                    z18 = z6;
                    c20677 = c20676;
                    break;
                case 1182515454:
                case 1854096867:
                    break;
                case 1426751139:
                case 1692275494:
                    C1028.m56238(C1071.m56337(dialogInterfaceC2569), i55);
                    iM55687 = C0873.m55680("᩸᩶") ^ i48;
                    i61 = ((iM55687 ^ i47) * 16835) ^ (-475326387);
                    i45 = 1463040261;
                    i53 = iM55687 ^ i45;
                    break;
                case 1496629354:
                case 2000410324:
                    dialogInterfaceC2566 = dialogInterfaceC2569;
                    obj6 = obj11;
                    C0990 c0999 = c0994;
                    str10 = str10;
                    i10 = i54;
                    i22 = i58;
                    i23 = i59;
                    short[] sArr37 = sArr25;
                    sArr11 = sArr26;
                    sArr12 = sArr27;
                    str4 = str9;
                    c20673 = c20677;
                    z6 = z18;
                    z7 = z17 ? 1 : 0;
                    z8 = z19;
                    c12097 = c120911;
                    interfaceC14101 = interfaceC14106;
                    i11 = i57;
                    i24 = i60;
                    th2 = th8;
                    view = view7;
                    obj3 = obj10;
                    sArr6 = sArr28;
                    short[] sArr38 = sArr24;
                    c0995 = (C0990) C0892.m55755(view, C0946.m55979(C0845.m55592(sArr38, i22, i23, i10)) ^ 2101756371);
                    c0994 = c0999;
                    sArr13 = sArr38;
                    C12096 c120914 = (C12096) C1404.m56465(view, C0873.m55680(C0947.m55993(f82125, 13, 3, i10)) ^ 2101600096);
                    this.f33801 = c120914;
                    if (C0989.f81920 < 0) {
                        int iM559720 = (C0946.m55979("ܶ᩺") ^ i47) * (-9);
                        i12 = ((iM559720 ^ i48) * (-16347)) ^ 372307442;
                        c120912 = c120914;
                        i53 = iM559720 ^ 897917522;
                        i58 = i22;
                        i59 = i23;
                        i60 = i24;
                        sArr27 = sArr12;
                        sArr26 = sArr11;
                        dialogInterfaceC2569 = dialogInterfaceC2566;
                        obj11 = obj6;
                        sArr25 = sArr37;
                        sArr24 = sArr13;
                        c120911 = c12097;
                        z19 = z8;
                        z17 = z7;
                        z18 = z6;
                        c20677 = c20673;
                        i54 = i10;
                        i61 = i12;
                        sArr28 = sArr6;
                        obj10 = obj3;
                        view7 = view;
                        th8 = th2;
                        i57 = i11;
                        interfaceC14106 = interfaceC14101;
                        str9 = str4;
                        str10 = str10;
                        c0994 = c0994;
                    } else {
                        c120912 = c120914;
                        sArr25 = sArr37;
                        int iM556819 = (i47 - C0873.m55680("᩷ܶ")) * 37;
                        i39 = ((iM556819 ^ i48) * (-30935)) ^ 1301823979;
                        i53 = iM556819 ^ 801448837;
                        i58 = i22;
                        i59 = i23;
                        i60 = i24;
                        sArr28 = sArr6;
                        sArr27 = sArr12;
                        sArr26 = sArr11;
                        dialogInterfaceC2569 = dialogInterfaceC2566;
                        obj11 = obj6;
                        sArr24 = sArr13;
                        c120911 = c12097;
                        obj10 = obj3;
                        view7 = view;
                        z19 = z8;
                        th8 = th2;
                        z17 = z7;
                        i57 = i11;
                        interfaceC14106 = interfaceC14101;
                        str9 = str4;
                        z18 = z6;
                        c20677 = c20673;
                        i54 = i10;
                        str10 = str10;
                        c0994 = c0994;
                        i61 = i39;
                    }
                    break;
                case 1782011625:
                case 1895445004:
                    short[] sArr39 = sArr28;
                    th7 = th8;
                    z6 = z18;
                    i42 = i54;
                    c20671M55654 = C0866.m55654(mainM56594);
                    view6 = view7;
                    C0927.m55864(c20671M55654, view6);
                    iM55686 = C0873.m55680(C1229.m56403(f82125, 43, 3, i42)) ^ 2097510002;
                    if (C0894.f81854 >= 0) {
                        sArr28 = sArr39;
                        obj10 = null;
                        int iM5568110 = (i47 - C0873.m55680("۠᩻")) * (-53);
                        C20671 c206715 = c20671M55654;
                        i54 = i42;
                        i61 = ((iM5568110 ^ i48) * 29881) ^ 663121161;
                        i53 = iM5568110 ^ 1865151281;
                        z18 = z6;
                        c20677 = c206715;
                        view7 = view6;
                        th8 = th7;
                        i57 = iM55686;
                    } else {
                        int iM559721 = (C0946.m55979("ᩴۡ") ^ i48) * (-127);
                        view7 = view6;
                        i54 = i42;
                        th8 = th7;
                        i57 = iM55686;
                        i61 = ((iM559721 ^ i47) * (-6077)) ^ (-1580879162);
                        sArr28 = sArr39;
                        obj10 = null;
                        c20677 = c20671M55654;
                        i53 = iM559721 ^ 715672735;
                        z18 = z6;
                    }
                    break;
                default:
                    if (!C0947.f81895) {
                        iM55979 = (C0946.m55979("᩷ۢ") + i48) * (-25);
                        i61 = 50947257 ^ ((iM55979 ^ i47) * 26107);
                        i = 1019694383;
                        i53 = iM55979 ^ i;
                    } else {
                        i37 = i54;
                        sArr23 = sArr27;
                        c20675 = c20677;
                        z16 = z18;
                        i38 = i57;
                        th6 = th8;
                        view5 = view7;
                        obj9 = obj10;
                        sArr22 = sArr28;
                        iM55685 = C0946.m55979("ܰ֡") ^ i48;
                        i39 = ((iM55685 ^ i47) * 18725) ^ 27643640;
                        i41 = -891783808;
                        i53 = iM55685 ^ i41;
                        sArr28 = sArr22;
                        sArr27 = sArr23;
                        obj10 = obj9;
                        view7 = view5;
                        th8 = th6;
                        i57 = i38;
                        z18 = z16;
                        c20677 = c20675;
                        i54 = i37;
                        i61 = i39;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m27897(C12094 c12094, boolean z) {
        C12096 c12096 = null;
        int i = 0;
        int i2 = -603816887;
        int i3 = AbstractC0942.f81890;
        int i4 = ServiceConnectionC1013.f81940;
        int iM55680 = (C0873.m55680("ܳۘ") ^ i3) * 75;
        int i5 = ((iM55680 ^ i4) * 30417) ^ (-1641501898);
        int i6 = -1457252846;
        while (true) {
            i2 = ((((i2 ^ i4) * 12427) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2144672861:
                case 1191405597:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("ܳ۬") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24867) ^ (-308413087);
                        i6 = 231131596;
                    } else {
                        iM55680 = C0946.m55979("ۙ᩸") ^ i4;
                        i5 = ((iM55680 ^ i3) * 28747) ^ 1426179729;
                        i6 = 1452624077;
                    }
                    break;
                case -1983911853:
                case 1021338008:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("֫ۙ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 13961) ^ 1602005034;
                        i6 = -1636948496;
                    } else {
                        iM55680 = (C0946.m55979("᩵֨") ^ i3) * 61;
                        i5 = ((iM55680 ^ i4) * (-28279)) ^ 335068672;
                        i6 = -1439069946;
                    }
                    break;
                case -1833345281:
                case -1636850294:
                    C1028.m56238(c12096, i);
                    break;
                case -1607840990:
                case -810506297:
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("֫ۙ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 13961) ^ 1602005034;
                        i6 = -1636948496;
                    } else {
                        iM55680 = C0873.m55680("ᩳܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-19263)) ^ (-1197116671);
                        i6 = 747271089;
                    }
                    break;
                case -1464794431:
                case 1922655758:
                    if (C1044.f81959 < 0) {
                        iM55680 = C0873.m55680("ܳ۬") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24867) ^ (-308413087);
                        i6 = 231131596;
                    } else {
                        iM55680 = C0873.m55680("ܶ᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-28987)) ^ 1291429529;
                        i6 = 708148820;
                    }
                    break;
                case -1304150673:
                case 472447005:
                    i = 8;
                    iM55680 = (C0946.m55979("۟᩹") ^ i4) * 19;
                    i5 = ((iM55680 ^ i3) * (-2041)) ^ 1862941662;
                    i6 = 137972532;
                    break;
                case -1302515836:
                case -578612250:
                    if (RunnableC0897.f81856) {
                        iM55680 = (i4 - C0946.m55979("ۘۡ")) * 91;
                        i5 = ((iM55680 ^ i3) * 28801) ^ 345577376;
                        i6 = -1141079746;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۧ۠")) * (-21);
                        i5 = ((iM55680 ^ i4) * (-21101)) ^ 760175420;
                        i6 = -539607349;
                    }
                    break;
                case -1167961342:
                case 1697130455:
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("֫ۙ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 13961) ^ 1602005034;
                        i6 = -1636948496;
                    } else {
                        iM55680 = (C0946.m55979("ܿۛ") ^ i3) * 33;
                        i5 = ((iM55680 ^ i4) * 11945) ^ (-978067642);
                        i6 = 185143749;
                    }
                    break;
                case -1065435674:
                case -44073421:
                    c12096 = c12094.f33801;
                    if (z) {
                        iM55680 = C0873.m55680("᩷ۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-20231)) ^ 323123032;
                        i6 = 1857973456;
                    } else {
                        iM55680 = C0873.m55680("ܿۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 23373) ^ (-78804212);
                        i6 = 1588801434;
                    }
                    break;
                case -960335583:
                case 1287481078:
                    ViewOnClickListenerC0939.m55941();
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0873.m55680("ۨ᩹") ^ i3) * 49;
                        i5 = ((iM55680 ^ i4) * (-29153)) ^ (-974188405);
                        i6 = -1228249922;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۧ۠")) * (-21);
                        i5 = ((iM55680 ^ i4) * (-21101)) ^ 760175420;
                        i6 = -539607349;
                    }
                    break;
                case -892797872:
                case 23450804:
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("֫ۙ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 13961) ^ 1602005034;
                        i6 = -1636948496;
                    } else {
                        iM55680 = C0873.m55680("᩺ܿ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18023)) ^ 1400116068;
                        i6 = -453731326;
                    }
                    break;
                case -93211728:
                case 941086745:
                    i = 0;
                    iM55680 = (C0946.m55979("۟᩹") ^ i4) * 19;
                    i5 = ((iM55680 ^ i3) * (-2041)) ^ 1862941662;
                    i6 = 137972532;
                    break;
                case 14943406:
                case 2137528409:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("ܶ᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-28987)) ^ 1291429529;
                        i6 = 708148820;
                    } else {
                        iM55680 = C0873.m55680("۠ۛ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 32349) ^ 2082137635;
                        i6 = 1783248352;
                    }
                    break;
                case 206174230:
                case 1066496374:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("ܶ᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-28987)) ^ 1291429529;
                        i6 = 708148820;
                    } else {
                        iM55680 = C0946.m55979("֫ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-16823)) ^ (-1564748576);
                        i6 = -124076372;
                    }
                    break;
                case 342752599:
                case 1088321423:
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0873.m55680("ۨ᩹") ^ i3) * 49;
                        i5 = ((iM55680 ^ i4) * (-29153)) ^ (-974188405);
                        i6 = -1228249922;
                    } else {
                        iM55680 = C0946.m55979("᩹֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-13383)) ^ 1160576198;
                        i6 = -1726410228;
                    }
                    break;
                case 543700684:
                case 1233613689:
                    C0882.m55710();
                    iM55680 = (i3 - C0946.m55979("ۧ۠")) * (-21);
                    i5 = ((iM55680 ^ i4) * (-21101)) ^ 760175420;
                    i6 = -539607349;
                    break;
                case 1002596037:
                case 1609693347:
                    C0947.m55997();
                    break;
                case 1169178825:
                case 1533845590:
                    RunnableC1014.m56177();
                    if (!C0967.m56074()) {
                        iM55680 = (C0873.m55680("ۨ᩹") ^ i3) * 49;
                        i5 = ((iM55680 ^ i4) * (-29153)) ^ (-974188405);
                        i6 = -1228249922;
                    } else {
                        iM55680 = C0873.m55680("ܶ᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-28987)) ^ 1291429529;
                        i6 = 708148820;
                    }
                    break;
                default:
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("֫ۙ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 13961) ^ 1602005034;
                        i6 = -1636948496;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۖۗ")) * 87;
                        i5 = ((iM55680 ^ i3) * 14487) ^ 1725458817;
                        i6 = -2028071465;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0219 A[PHI: r2 r3 r10 r11 r21
      0x0219: PHI (r2v4 int) = (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:50:0x0217, B:38:0x0189, B:6:0x0067, B:34:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r3v4 boolean[]) = (r3v3 boolean[]), (r3v2 boolean[]), (r3v2 boolean[]), (r3v2 boolean[]) binds: [B:50:0x0217, B:38:0x0189, B:6:0x0067, B:34:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r10v5 java.lang.String) = (r10v2 java.lang.String), (r10v4 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String) binds: [B:50:0x0217, B:38:0x0189, B:6:0x0067, B:34:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v8 int) binds: [B:50:0x0217, B:38:0x0189, B:6:0x0067, B:34:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r21v23 short[]) = (r21v15 short[]), (r21v16 short[]), (r21v28 short[]), (r21v28 short[]) binds: [B:50:0x0217, B:38:0x0189, B:6:0x0067, B:34:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0284 A[PHI: r21
      0x0284: PHI (r21v19 short[]) = (r21v13 short[]), (r21v14 short[]), (r21v20 short[]) binds: [B:59:0x026d, B:54:0x024c, B:23:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (p067l.C0912.f81867 <= 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m27895(C12094 c12094, final C0990 c0990, boolean z) {
        short s;
        int i;
        int iM55979;
        int i2;
        int i3;
        int iM55680;
        int i4;
        int i5;
        short[] sArr;
        int i6;
        int i7;
        int i8;
        int iM55681;
        final C12094 c12095 = c12094;
        int i9 = C1404.f82149;
        int i10 = C0877.f81843;
        int iM559710 = C0946.m55979("ܳۡ") ^ i10;
        int i11 = ((iM559710 ^ i9) * (-8685)) ^ 1436584144;
        C20671 c20671M55888 = null;
        Object obj = null;
        String strM56558 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i12 = iM559710 ^ (-1798495933);
        int iM559711 = 0;
        int i13 = 0;
        int i14 = 0;
        int iM559712 = 0;
        int i15 = 0;
        DialogInterfaceOnClickListenerC3428 dialogInterfaceOnClickListenerC3428 = null;
        int i16 = 0;
        int i17 = 1231149079;
        short s2 = 0;
        final boolean[] zArr = null;
        int i18 = 0;
        while (true) {
            i17 = i12 ^ (i11 & (((i17 ^ i9) * 21537) >> 31));
            switch (i17) {
                case -2036024389:
                case 1135390650:
                    sArr4 = sArr4;
                    s = s2;
                    if ((s * 17008) - ((s * s) + 72318016) <= 0) {
                        iM55979 = C0946.m55979("ۖۜ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 24537) ^ (-1199452350);
                        i3 = -452024235;
                        i7 = iM55979 ^ i3;
                        s2 = s;
                        i11 = i2;
                        sArr4 = sArr4;
                        i12 = i7;
                        c12095 = c12094;
                    } else {
                        int iM559713 = C0946.m55979("᩸۟") ^ i10;
                        int i19 = ((iM559713 ^ i9) * 14575) ^ (-288433510);
                        i = iM559713 ^ 1903012840;
                        s2 = s;
                        i11 = i19;
                        c12095 = c12094;
                        sArr = sArr4;
                        i12 = i;
                        sArr4 = sArr;
                    }
                    break;
                case -1848628667:
                case 935096990:
                    sArr4 = sArr4;
                    if (z) {
                        iM55680 = (C0946.m55979("᩸᩹") ^ i9) * C0254q.f1218h;
                        i4 = ((iM55680 ^ i10) * (-1603)) ^ 787306324;
                        i5 = 716383039;
                    } else {
                        iM55680 = (i9 - C0873.m55680("᩶ܰ")) * 13;
                        i4 = ((iM55680 ^ i10) * 8647) ^ 1658174556;
                        i5 = -1365937461;
                    }
                    i6 = iM55680 ^ i5;
                    sArr = sArr4;
                    i12 = i6;
                    i11 = i4;
                    sArr4 = sArr;
                    break;
                case -1844877977:
                case 1563470890:
                    C1124.m56374(c20671M55888, iM559711, obj);
                    c20671M55888.m46714(new DialogInterface.OnDismissListener(c12095) { // from class: l.᩶ۤܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C12094 f67769;

                        {
                            int i20 = 1489250021;
                            int i21 = ServiceConnectionC1013.f81940;
                            int i22 = C0877.f81843;
                            int iM55682 = (i22 - C0873.m55680("ۜܺ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            int i23 = ((iM55682 ^ i21) * (-21581)) ^ 2029654711;
                            int i24 = -2078775027;
                            while (true) {
                                i20 = ((((i20 ^ i21) * 4227) >> 31) & i23) ^ (iM55682 ^ i24);
                                switch (i20) {
                                    case -2003720050:
                                    case 213989153:
                                        if (ViewOnClickListenerC0939.f81888 > 0) {
                                            iM55682 = C0873.m55680("ܽۘ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * (-29863)) ^ 270895964;
                                            i24 = -1772688999;
                                        } else {
                                            iM55682 = C0946.m55979("ۖۗ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * 27833) ^ 1164683414;
                                            i24 = -829124130;
                                        }
                                        break;
                                    case -1916762787:
                                    case 200051632:
                                        if (C1053.f81965 <= 0) {
                                            iM55682 = (C0946.m55979("ۢܿ") + i21) * (-67);
                                            i23 = ((iM55682 ^ i22) * (-9701)) ^ 1829479806;
                                            i24 = -716979057;
                                        } else {
                                            iM55682 = C0946.m55979("᩸᩵") ^ i21;
                                            i23 = ((iM55682 ^ i22) * 5793) ^ (-1121485079);
                                            i24 = -1982850156;
                                        }
                                        break;
                                    case -1798356309:
                                    case 1310607493:
                                        if (C1025.m56230()) {
                                            iM55682 = C0873.m55680("ܽۘ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * (-29863)) ^ 270895964;
                                            i24 = -1772688999;
                                        } else {
                                            iM55682 = C0946.m55979("ܽᩳ") ^ i21;
                                            i23 = ((iM55682 ^ i22) * 5829) ^ (-83929483);
                                            i24 = -833880514;
                                        }
                                        break;
                                    case -1582140464:
                                    case -888636762:
                                        return;
                                    case -1304144414:
                                    case 1732918653:
                                        if (C1028.m56247() >= 0) {
                                            iM55682 = C0946.m55979("ۖۗ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * 27833) ^ 1164683414;
                                            i24 = -829124130;
                                        } else {
                                            iM55682 = C0946.m55979("ۢܶ") ^ i21;
                                            i23 = ((iM55682 ^ i22) * (-8785)) ^ (-32134980);
                                            i24 = -1861186936;
                                        }
                                        break;
                                    case -819824665:
                                    case 2112332652:
                                        if (C0898.f81858 <= 0) {
                                            iM55682 = (C0873.m55680("᩵ᩴ") + i21) * (-101);
                                            i23 = ((iM55682 ^ i22) * (-16823)) ^ 832606695;
                                            i24 = 139431579;
                                        } else {
                                            iM55682 = (i21 - C0946.m55979("ۤ֨")) * (-121);
                                            i23 = ((iM55682 ^ i22) * 26905) ^ (-1381136082);
                                            i24 = -93939546;
                                        }
                                        break;
                                    case -610481252:
                                    case 1672638968:
                                        if (C0906.m55809() <= 0) {
                                            iM55682 = (i22 - C0873.m55680("᩸ۧ")) * 47;
                                            i23 = ((iM55682 ^ i21) * (-3757)) ^ (-493809399);
                                            i24 = -238472550;
                                        } else {
                                            iM55682 = (i22 - C0873.m55680("ᩳᩴ")) * (-5);
                                            i23 = ((iM55682 ^ i21) * (-13797)) ^ (-207179294);
                                            i24 = -1404418049;
                                        }
                                        break;
                                    case -299576472:
                                    case 1190447687:
                                        if (C0992.f81922 >= 0) {
                                            iM55682 = (C0873.m55680("᩵ᩴ") + i21) * (-101);
                                            i23 = ((iM55682 ^ i22) * (-16823)) ^ 832606695;
                                            i24 = 139431579;
                                        } else {
                                            iM55682 = (C0946.m55979("ۢܿ") + i21) * (-67);
                                            i23 = ((iM55682 ^ i22) * (-9701)) ^ 1829479806;
                                            i24 = -716979057;
                                        }
                                        break;
                                    case -270457504:
                                    case 1696899097:
                                        if (C0927.f81875) {
                                            iM55682 = (C0946.m55979("ۢܿ") + i21) * (-67);
                                            i23 = ((iM55682 ^ i22) * (-9701)) ^ 1829479806;
                                            i24 = -716979057;
                                        } else {
                                            iM55682 = (C0873.m55680("֨֫") + i22) * 53;
                                            i23 = ((iM55682 ^ i21) * (-15895)) ^ (-535018122);
                                            i24 = -2114162247;
                                        }
                                        break;
                                    case -143028199:
                                    case 1775244351:
                                        if (C1404.f82149 >= 0) {
                                            iM55682 = C0946.m55979("ۖۗ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * 27833) ^ 1164683414;
                                            i24 = -829124130;
                                        } else {
                                            iM55682 = (i21 - C0946.m55979("֫ܰ")) * (-79);
                                            i23 = ((iM55682 ^ i22) * (-27779)) ^ (-867679350);
                                            i24 = -1140735261;
                                        }
                                        break;
                                    case 89274770:
                                    case 2082908349:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55682 = (i22 - C0873.m55680("᩸ۧ")) * 47;
                                            i23 = ((iM55682 ^ i21) * (-3757)) ^ (-493809399);
                                            i24 = -238472550;
                                        } else {
                                            iM55682 = (C0946.m55979("ۧ۟") + i22) * (-79);
                                            i23 = ((iM55682 ^ i21) * 18247) ^ 2078890149;
                                            i24 = -1260340811;
                                        }
                                        break;
                                    case 298151178:
                                    case 582807960:
                                        if (C0947.f81895) {
                                            iM55682 = C0946.m55979("ۖۗ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * 27833) ^ 1164683414;
                                            i24 = -829124130;
                                        } else {
                                            iM55682 = C0946.m55979("ܳۧ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * (-23851)) ^ 1521163058;
                                            i24 = -385498764;
                                        }
                                        break;
                                    case 404296895:
                                    case 1041696773:
                                        C0863.m55643();
                                        if (!C0892.m55749()) {
                                            iM55682 = (C0946.m55979("ۢܿ") + i21) * (-67);
                                            i23 = ((iM55682 ^ i22) * (-9701)) ^ 1829479806;
                                            i24 = -716979057;
                                        } else {
                                            iM55682 = C0946.m55979("ۖۗ") ^ i22;
                                            i23 = ((iM55682 ^ i21) * 27833) ^ 1164683414;
                                            i24 = -829124130;
                                        }
                                        break;
                                    case 799195670:
                                    case 881331844:
                                        C1929.m56553();
                                        iM55682 = C0946.m55979("ۖۗ") ^ i22;
                                        i23 = ((iM55682 ^ i21) * 27833) ^ 1164683414;
                                        i24 = -829124130;
                                        break;
                                    case 1418793154:
                                    case 1806433528:
                                        this.f67769 = c12095;
                                        if (C0955.f81898) {
                                            iM55682 = (C0873.m55680("᩵ᩴ") + i21) * (-101);
                                            i23 = ((iM55682 ^ i22) * (-16823)) ^ 832606695;
                                            i24 = 139431579;
                                        } else {
                                            iM55682 = (C0873.m55680("᩸ܽ") + i22) * (-13);
                                            i23 = ((iM55682 ^ i21) * (-561)) ^ 1423400967;
                                            i24 = -834852810;
                                        }
                                        break;
                                    default:
                                        C0845.m55584();
                                        C0873.m55678();
                                        throw new RuntimeException();
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            boolean[] zArr2 = null;
                            int i20 = -1474223623;
                            int i21 = C0894.f81854;
                            int i22 = C1012.f81938;
                            int iM559714 = (C0946.m55979("۫᩷") + i22) * (-127);
                            int i23 = ((iM559714 ^ i21) * 19801) ^ 1980726109;
                            int i24 = -1384388874;
                            while (true) {
                                i20 = ((((i20 ^ i21) * 24087) >> 31) & i23) ^ (iM559714 ^ i24);
                                switch (i20) {
                                    case -2028690206:
                                    case -427578166:
                                        if (C0861.f81831) {
                                            iM559714 = (C0873.m55680("᩻ܿ") + i21) * (-9);
                                            i23 = ((iM559714 ^ i22) * 20137) ^ 678296476;
                                            i24 = -418278027;
                                        } else {
                                            iM559714 = C0946.m55979("ۨ۟") ^ i21;
                                            i23 = ((iM559714 ^ i22) * (-20511)) ^ 195547859;
                                            i24 = 323658016;
                                        }
                                        break;
                                    case -1953169141:
                                    case 1677168116:
                                        if (C0877.m55696()) {
                                            iM559714 = (i22 - C0873.m55680("᩸᩹")) * 5;
                                            i23 = ((iM559714 ^ i21) * (-22845)) ^ 1077921692;
                                            i24 = 756229206;
                                        } else {
                                            iM559714 = C0873.m55680("۫ܽ") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-23967)) ^ (-281050066);
                                            i24 = -199979856;
                                        }
                                        break;
                                    case -1848912625:
                                    case 489014196:
                                        if (C0873.m55678()) {
                                            iM559714 = C0946.m55979("ۨ۟") ^ i21;
                                            i23 = ((iM559714 ^ i22) * (-20511)) ^ 195547859;
                                            i24 = 323658016;
                                        } else {
                                            iM559714 = (C0946.m55979("ܰܺ") + i22) * 41;
                                            i23 = ((iM559714 ^ i21) * 6041) ^ 214282323;
                                            i24 = 1051764418;
                                        }
                                        break;
                                    case -1640859458:
                                    case -677977701:
                                        C1036.m56257();
                                        RunnableC0938.m55938();
                                        iM559714 = C0873.m55680("۫ܽ") ^ i22;
                                        i23 = ((iM559714 ^ i21) * (-23967)) ^ (-281050066);
                                        i24 = -199979856;
                                        break;
                                    case -1596127769:
                                    case -700150634:
                                        if (C0877.f81843 >= 0) {
                                            iM559714 = C0873.m55680("۫ܽ") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-23967)) ^ (-281050066);
                                            i24 = -199979856;
                                        } else {
                                            iM559714 = (C0873.m55680("ܽ۫") ^ i22) * 11;
                                            i23 = ((iM559714 ^ i21) * (-18163)) ^ (-1213940985);
                                            i24 = 1862411875;
                                        }
                                        break;
                                    case -1538910059:
                                    case -1403717769:
                                        if (C0898.f81858 <= 0) {
                                            iM559714 = C0946.m55979("ۨ۟") ^ i21;
                                            i23 = ((iM559714 ^ i22) * (-20511)) ^ 195547859;
                                            i24 = 323658016;
                                        } else {
                                            iM559714 = (i21 - C0873.m55680("ۖᩳ")) * (-37);
                                            i23 = ((iM559714 ^ i22) * (-18507)) ^ (-1647986387);
                                            i24 = 756330147;
                                        }
                                        break;
                                    case -1461305855:
                                    case 1654516105:
                                        if (C0866.f81837 >= 0) {
                                            iM559714 = (i22 - C0946.m55979("᩹ۙ")) * 59;
                                            i23 = ((iM559714 ^ i21) * (-31861)) ^ (-1683957919);
                                            i24 = -1307857150;
                                        } else {
                                            iM559714 = (C0873.m55680("ۜܽ") + i21) * 11;
                                            i23 = ((iM559714 ^ i22) * (-1363)) ^ (-1723990933);
                                            i24 = -1064361535;
                                        }
                                        break;
                                    case -877356808:
                                    case -654636405:
                                        if (C0894.m55769() >= 0) {
                                            iM559714 = C0946.m55979("ۨ۟") ^ i21;
                                            i23 = ((iM559714 ^ i22) * (-20511)) ^ 195547859;
                                            i24 = 323658016;
                                        } else {
                                            iM559714 = (C0873.m55680("ᩳܿ") + i21) * (-89);
                                            i23 = ((iM559714 ^ i22) * (-507)) ^ 2083352952;
                                            i24 = -1278148153;
                                        }
                                        break;
                                    case -725708817:
                                    case 1332413066:
                                        zArr2 = zArr;
                                        if (C1044.m56286() <= 0) {
                                            iM559714 = C0946.m55979("ܶۗ") ^ i22;
                                            i23 = ((iM559714 ^ i21) * 11323) ^ (-1342911173);
                                            i24 = -1073447097;
                                        } else {
                                            iM559714 = C0873.m55680("ܳۙ") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-11041)) ^ (-1293195188);
                                            i24 = -2068080509;
                                        }
                                        break;
                                    case -507828354:
                                    case 499535609:
                                        if (RunnableC0897.m55784()) {
                                            iM559714 = C0873.m55680("۫ܽ") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-23967)) ^ (-281050066);
                                            i24 = -199979856;
                                        } else {
                                            iM559714 = C0946.m55979("ۗ۟") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-6283)) ^ (-1135987066);
                                            i24 = -1473166732;
                                        }
                                        break;
                                    case -466119062:
                                    case 1940756847:
                                        if (C1003.m56123() != 0) {
                                            iM559714 = C0946.m55979("ۨ۟") ^ i21;
                                            i23 = ((iM559714 ^ i22) * (-20511)) ^ 195547859;
                                            i24 = 323658016;
                                        } else {
                                            iM559714 = C0873.m55680("۫ܽ") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-23967)) ^ (-281050066);
                                            i24 = -199979856;
                                        }
                                        break;
                                    case -196338632:
                                    case 833562029:
                                        C12094.m27898(this.f67769, zArr2, c0990);
                                        break;
                                    case 424695648:
                                    case 1054332864:
                                        if (C1071.m56343() != 0) {
                                            iM559714 = (i22 - C0946.m55979("᩹ۙ")) * 59;
                                            i23 = ((iM559714 ^ i21) * (-31861)) ^ (-1683957919);
                                            i24 = -1307857150;
                                        } else {
                                            iM559714 = (C0946.m55979("᩷ۚ") ^ i21) * (-17);
                                            i23 = ((iM559714 ^ i22) * (-10121)) ^ 1828400001;
                                            i24 = 1110169021;
                                        }
                                        break;
                                    case 647318295:
                                    case 1090521642:
                                        C0947.m55997();
                                        C0892.m55749();
                                        break;
                                    case 1784143957:
                                    case 1964032526:
                                        AbstractC0942.m55971();
                                        if (!C0937.f81884) {
                                            iM559714 = (i22 - C0946.m55979("᩹ۙ")) * 59;
                                            i23 = ((iM559714 ^ i21) * (-31861)) ^ (-1683957919);
                                            i24 = -1307857150;
                                        } else {
                                            iM559714 = (C0946.m55979("ᩳᩳ") ^ i21) * (-125);
                                            i23 = ((iM559714 ^ i22) * (-13163)) ^ 1890979882;
                                            i24 = 251382513;
                                        }
                                        break;
                                    default:
                                        C1194.m56396();
                                        if (C0912.f81867 <= 0) {
                                            iM559714 = (C0946.m55979("ᩳᩳ") ^ i21) * (-125);
                                            i23 = ((iM559714 ^ i22) * (-13163)) ^ 1890979882;
                                            i24 = 251382513;
                                        } else {
                                            iM559714 = C0873.m55680("۫ܽ") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-23967)) ^ (-281050066);
                                            i24 = -199979856;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C1025.m56221(c20671M55888);
                    sArr4 = sArr4;
                    iM55680 = (C0946.m55979("᩸᩹") ^ i9) * C0254q.f1218h;
                    i4 = ((iM55680 ^ i10) * (-1603)) ^ 787306324;
                    i5 = 716383039;
                    i6 = iM55680 ^ i5;
                    sArr = sArr4;
                    i12 = i6;
                    i11 = i4;
                    sArr4 = sArr;
                    break;
                case -1576946099:
                case 501022278:
                    sArr4 = sArr4;
                    s2 = sArr2[84];
                    if (RunnableC0871.m55672() >= 0) {
                        iM55681 = C0873.m55680("֡ܽ") ^ i10;
                        i11 = ((iM55681 ^ i9) * (-5845)) ^ 937768697;
                        i8 = -1830184435;
                    } else {
                        iM55681 = (C0946.m55979("۠᩵") + i10) * (-105);
                        i11 = ((iM55681 ^ i9) * 4971) ^ (-1691551465);
                        i8 = -494884284;
                    }
                    i7 = iM55681 ^ i8;
                    sArr4 = sArr4;
                    i12 = i7;
                    c12095 = c12094;
                    break;
                case -1485800622:
                case -14579054:
                    i16 = 57768;
                    iM55680 = (C0946.m55979("ۗܳ") ^ i10) * (-93);
                    i4 = ((iM55680 ^ i9) * 23431) ^ (-450273617);
                    i5 = 1120159070;
                    i6 = iM55680 ^ i5;
                    sArr = sArr4;
                    i12 = i6;
                    i11 = i4;
                    sArr4 = sArr;
                    break;
                case -1299921162:
                case -734035418:
                    break;
                case -1259203996:
                case 1779476193:
                    if (C1124.m56367() >= 0) {
                        sArr4 = sArr4;
                        s = s2;
                        iM55979 = C0946.m55979("ۤܿ") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-3119)) ^ (-965169181);
                        i3 = -96161181;
                        i7 = iM55979 ^ i3;
                        s2 = s;
                        i11 = i2;
                        sArr4 = sArr4;
                        i12 = i7;
                        c12095 = c12094;
                    } else {
                        iM55680 = (C0873.m55680("ۛ᩹") ^ i10) * (-111);
                        sArr4 = sArr4;
                        i4 = ((iM55680 ^ i9) * (-15881)) ^ (-840096632);
                        i5 = 396299628;
                        i6 = iM55680 ^ i5;
                        sArr = sArr4;
                        i12 = i6;
                        i11 = i4;
                        sArr4 = sArr;
                    }
                    break;
                case -1233678375:
                case 1891993623:
                    iM559711 = 2119011034 ^ C0946.m55979(ViewOnClickListenerC0939.m55947(sArr4, i15, 3, i16));
                    obj = null;
                    if (C0854.f81826 != 0) {
                        iM55680 = (i9 - C0946.m55979("֫᩵")) * (-119);
                        sArr4 = sArr4;
                        i4 = ((iM55680 ^ i10) * (-32235)) ^ (-1764085575);
                        i5 = 1434016678;
                    } else {
                        sArr4 = sArr4;
                        iM55680 = C0946.m55979("ܿ۟") ^ i9;
                        i4 = ((iM55680 ^ i10) * (-12805)) ^ (-1737064042);
                        i5 = -1994756970;
                    }
                    i6 = iM55680 ^ i5;
                    sArr = sArr4;
                    i12 = i6;
                    i11 = i4;
                    sArr4 = sArr;
                    break;
                case -598371100:
                case 588759274:
                    C0906.m55817(c20671M55888, 2119860371 ^ iM559712, dialogInterfaceOnClickListenerC3428);
                    sArr4 = f82125;
                    if (RunnableC0938.m55938() != 0) {
                        i15 = 94;
                        iM55680 = (C0873.m55680("ۛ᩹") ^ i10) * (-111);
                        sArr4 = sArr4;
                        i4 = ((iM55680 ^ i9) * (-15881)) ^ (-840096632);
                        i5 = 396299628;
                        i6 = iM55680 ^ i5;
                        sArr = sArr4;
                        i12 = i6;
                        i11 = i4;
                        sArr4 = sArr;
                    } else {
                        int iM55682 = (C0873.m55680("۫ܽ") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i12 = iM55682 ^ (-31269977);
                        i11 = ((iM55682 ^ i10) * 5221) ^ (-265113919);
                        i15 = 94;
                    }
                    break;
                case -429248061:
                case 1219761211:
                    sArr4 = sArr4;
                    C0861.m55627(c20671M55888, i13 ^ i14);
                    strM56558 = C1929.m56558(f82125, 88, 3, i16);
                    if (C1012.m56134() <= 0) {
                        int iM559714 = C0946.m55979("ܶۚ") ^ i10;
                        i4 = ((iM559714 ^ i9) * (-26063)) ^ 1724108464;
                        i6 = iM559714 ^ (-463512936);
                        dialogInterfaceOnClickListenerC3428 = null;
                    } else {
                        iM55680 = C0946.m55979("ܳܳ") ^ i10;
                        i4 = ((iM55680 ^ i9) * (-10293)) ^ 670822952;
                        i5 = 200892838;
                        i6 = iM55680 ^ i5;
                    }
                    sArr = sArr4;
                    i12 = i6;
                    i11 = i4;
                    sArr4 = sArr;
                    break;
                case -265585642:
                case 901572356:
                    RunnableC0938.m55938();
                    C1024.m56209();
                    iM55680 = (C0873.m55680("ۛ᩹") ^ i10) * (-111);
                    sArr4 = sArr4;
                    i4 = ((iM55680 ^ i9) * (-15881)) ^ (-840096632);
                    i5 = 396299628;
                    i6 = iM55680 ^ i5;
                    sArr = sArr4;
                    i12 = i6;
                    i11 = i4;
                    sArr4 = sArr;
                    break;
                case -120205022:
                case 824464815:
                    i16 = 7048;
                    iM55680 = (C0946.m55979("ۗܳ") ^ i10) * (-93);
                    i4 = ((iM55680 ^ i9) * 23431) ^ (-450273617);
                    i5 = 1120159070;
                    i6 = iM55680 ^ i5;
                    sArr = sArr4;
                    i12 = i6;
                    i11 = i4;
                    sArr4 = sArr;
                    break;
                case 91220526:
                case 1899098665:
                    sArr4 = sArr4;
                    short[] sArr5 = sArr3;
                    int iM55683 = C0873.m55680(C0863.m55635(sArr5, 85, 3, i16));
                    if (C1229.m56410() == 0) {
                        int iM55684 = (C0873.m55680("ܺۨ") + i9) * (-67);
                        int i20 = ((iM55684 ^ i10) * (-25427)) ^ (-575369205);
                        i = iM55684 ^ 806313785;
                        sArr3 = sArr5;
                        i13 = iM55683;
                        i11 = i20;
                        i14 = 2097566464;
                        sArr = sArr4;
                        i12 = i;
                        sArr4 = sArr;
                    } else {
                        sArr3 = sArr5;
                        i14 = 2097566464;
                        i13 = iM55683;
                        s = s2;
                        iM55979 = C0946.m55979("ۤܿ") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-3119)) ^ (-965169181);
                        i3 = -96161181;
                        i7 = iM55979 ^ i3;
                        s2 = s;
                        i11 = i2;
                        sArr4 = sArr4;
                        i12 = i7;
                        c12095 = c12094;
                    }
                    break;
                case 264409693:
                case 720558795:
                    sArr4 = sArr4;
                    if (c12095.f33798) {
                        iM55680 = (C0946.m55979("᩸᩹") ^ i9) * C0254q.f1218h;
                        i4 = ((iM55680 ^ i10) * (-1603)) ^ 787306324;
                        i5 = 716383039;
                    } else {
                        iM55680 = C0873.m55680("֫ᩴ") ^ i10;
                        i4 = ((iM55680 ^ i9) * 8911) ^ 86874019;
                        i5 = 530578033;
                    }
                    i6 = iM55680 ^ i5;
                    sArr = sArr4;
                    i12 = i6;
                    i11 = i4;
                    sArr4 = sArr;
                    break;
                case 273696194:
                case 1396474551:
                    sArr4 = sArr4;
                    c20671M55888 = C0930.m55888(c12095.f33794);
                    sArr3 = f82125;
                    if (C0992.f81922 < 0) {
                        iM55680 = C0873.m55680("ۖܶ") ^ i10;
                        i4 = ((iM55680 ^ i9) * 13767) ^ 697165760;
                        i5 = -8506604;
                        i6 = iM55680 ^ i5;
                        sArr = sArr4;
                        i12 = i6;
                        i11 = i4;
                        sArr4 = sArr;
                    } else {
                        s = s2;
                        iM55979 = C0946.m55979("ۤܿ") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-3119)) ^ (-965169181);
                        i3 = -96161181;
                        i7 = iM55979 ^ i3;
                        s2 = s;
                        i11 = i2;
                        sArr4 = sArr4;
                        i12 = i7;
                        c12095 = c12094;
                    }
                    break;
                case 444783952:
                case 1632719869:
                    sArr4 = sArr4;
                    s = s2;
                    sArr2 = f82125;
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("ۤܿ") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-3119)) ^ (-965169181);
                        i3 = -96161181;
                    } else {
                        iM55979 = (C0873.m55680("᩶ᩴ") + i9) * (-93);
                        i2 = ((iM55979 ^ i10) * (-7619)) ^ (-1539928020);
                        i3 = 1232966243;
                    }
                    i7 = iM55979 ^ i3;
                    s2 = s;
                    i11 = i2;
                    sArr4 = sArr4;
                    i12 = i7;
                    c12095 = c12094;
                    break;
                case 480654764:
                case 612684810:
                    break;
                case 778979716:
                case 1218784637:
                    C0877.m55696();
                    if (C1071.m56343() != 0) {
                        sArr4 = sArr4;
                        iM55681 = C0873.m55680("֡ܽ") ^ i10;
                        i11 = ((iM55681 ^ i9) * (-5845)) ^ 937768697;
                        i8 = -1830184435;
                        i7 = iM55681 ^ i8;
                        sArr4 = sArr4;
                        i12 = i7;
                        c12095 = c12094;
                    } else {
                        iM55680 = (i9 - C0946.m55979("֫᩵")) * (-119);
                        sArr4 = sArr4;
                        i4 = ((iM55680 ^ i10) * (-32235)) ^ (-1764085575);
                        i5 = 1434016678;
                        i6 = iM55680 ^ i5;
                        sArr = sArr4;
                        i12 = i6;
                        i11 = i4;
                        sArr4 = sArr;
                    }
                    break;
                case 904661422:
                case 1556864255:
                    C0927.m55873();
                    break;
                case 1742526972:
                case 1802275345:
                    sArr4 = sArr4;
                    i18 = 1;
                    zArr = new boolean[]{false};
                    if (C0898.f81858 <= 0) {
                        int iM559715 = C0946.m55979("ܶۚ") ^ i10;
                        i4 = ((iM559715 ^ i9) * (-26063)) ^ 1724108464;
                        i6 = iM559715 ^ (-463512936);
                        dialogInterfaceOnClickListenerC3428 = null;
                    } else {
                        iM55680 = (C0946.m55979("᩻ۛ") + i9) * (-27);
                        i4 = ((iM55680 ^ i10) * (-6485)) ^ 275095310;
                        i5 = -1889088850;
                        i6 = iM55680 ^ i5;
                    }
                    sArr = sArr4;
                    i12 = i6;
                    i11 = i4;
                    sArr4 = sArr;
                    break;
                default:
                    sArr4 = sArr4;
                    C1194.m56390(c20671M55888, C0873.m55680(strM56558) ^ 2125897467);
                    if (C0898.m55800() > 0) {
                        dialogInterfaceOnClickListenerC3428 = new DialogInterfaceOnClickListenerC3428(i18, zArr);
                        iM559712 = C0946.m55979(C0898.m55792(f82125, 91, 3, i16));
                        if (C1404.f82149 < 0) {
                            iM55680 = (i10 - C0946.m55979("֫۬")) * (-15);
                            i4 = ((iM55680 ^ i9) * 31207) ^ (-1044147314);
                            i5 = -1971328170;
                            i6 = iM55680 ^ i5;
                        }
                        sArr = sArr4;
                        i12 = i6;
                        i11 = i4;
                        sArr4 = sArr;
                    }
                    int iM559716 = C0946.m55979("ܶۚ") ^ i10;
                    i4 = ((iM559716 ^ i9) * (-26063)) ^ 1724108464;
                    i6 = iM559716 ^ (-463512936);
                    dialogInterfaceOnClickListenerC3428 = null;
                    sArr = sArr4;
                    i12 = i6;
                    i11 = i4;
                    sArr4 = sArr;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m27898(C12094 c12094, boolean[] zArr, C0990 c0990) {
        boolean z = false;
        int i = 917322771;
        int i2 = C1071.f81975;
        int i3 = C1017.f81942;
        int iM55979 = C0946.m55979("ܺܿ") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-61)) ^ 1135852211;
        int i5 = -787390412;
        while (true) {
            i = ((((i ^ i2) * 27259) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2095788311:
                case 1727957599:
                    break;
                case -1820734779:
                case 1379783469:
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0873.m55680("ۖܽ") ^ i2) * (-85);
                        i4 = ((iM55979 ^ i3) * (-29065)) ^ 410123737;
                        i5 = 1245706337;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۜ᩸")) * 51;
                        i4 = ((iM55979 ^ i2) * 14307) ^ (-1806142328);
                        i5 = 361553407;
                    }
                    break;
                case -1772065156:
                case -882030093:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("۫᩸") ^ i3) * (-7);
                        i4 = ((iM55979 ^ i2) * (-15909)) ^ 708701930;
                        i5 = 426486458;
                    } else {
                        iM55979 = (C0873.m55680("ۚ۠") + i2) * (-81);
                        i4 = ((iM55979 ^ i3) * 13359) ^ (-707305774);
                        i5 = 1189920978;
                    }
                    break;
                case -1618251837:
                case -607953767:
                    if (C0861.f81831) {
                        iM55979 = (C0946.m55979("֫ᩳ") ^ i3) * 101;
                        i4 = ((iM55979 ^ i2) * 5961) ^ 1968245147;
                        i5 = 1505760921;
                    } else {
                        iM55979 = (C0873.m55680("ۖܽ") ^ i2) * (-85);
                        i4 = ((iM55979 ^ i3) * (-29065)) ^ 410123737;
                        i5 = 1245706337;
                    }
                    break;
                case -1465789038:
                case -410299853:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("۠᩵") ^ i2) * 73;
                        i4 = ((iM55979 ^ i3) * (-28249)) ^ 1396291630;
                        i5 = -1660846271;
                    } else {
                        iM55979 = C0946.m55979("᩺ܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 29889) ^ (-679923820);
                        i5 = 1954887195;
                    }
                    break;
                case -1454704588:
                case 1649083202:
                    if (C0967.m56074()) {
                        iM55979 = C0946.m55979("ܶ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23203)) ^ (-660308887);
                        i5 = -1865785881;
                    } else {
                        iM55979 = C0946.m55979("ۛܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18503) ^ 695863091;
                        i5 = -1831070177;
                    }
                    break;
                case -1163091788:
                case 1775825452:
                    C0989.m56095();
                    C0898.m55800();
                    break;
                case -996239452:
                case 1452077203:
                    if (C0877.m55696()) {
                        iM55979 = C0873.m55680("ܽ᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 7833) ^ (-1150936376);
                        i5 = 2094720364;
                    } else {
                        iM55979 = (C0873.m55680("۠᩵") ^ i2) * 73;
                        i4 = ((iM55979 ^ i3) * (-28249)) ^ 1396291630;
                        i5 = -1660846271;
                    }
                    break;
                case -769585707:
                case 364512803:
                    if (AbstractC0942.m55971()) {
                        iM55979 = (C0873.m55680("۠᩵") ^ i2) * 73;
                        i4 = ((iM55979 ^ i3) * (-28249)) ^ 1396291630;
                        i5 = -1660846271;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩶ܳ")) * (-99);
                        i4 = ((iM55979 ^ i3) * (-15867)) ^ 1328503176;
                        i5 = 1354767395;
                    }
                    break;
                case -215357020:
                case 1137052489:
                    if (C0892.m55749()) {
                        iM55979 = C0873.m55680("᩷᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-21333)) ^ 847806868;
                        i5 = 175709747;
                    } else {
                        iM55979 = C0946.m55979("ܶ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23203)) ^ (-660308887);
                        i5 = -1865785881;
                    }
                    break;
                case -123345720:
                case 2016746666:
                    C1194.m56396();
                    if (C1012.f81938 < 0) {
                        iM55979 = C0946.m55979("ܶ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23203)) ^ (-660308887);
                        i5 = -1865785881;
                    } else {
                        iM55979 = (C0873.m55680("۫᩸") ^ i3) * (-7);
                        i4 = ((iM55979 ^ i2) * (-15909)) ^ 708701930;
                        i5 = 426486458;
                    }
                    break;
                case -51829622:
                case 1518452181:
                    C0906.m55809();
                    C0882.m55710();
                    iM55979 = (C0873.m55680("ۖܽ") ^ i2) * (-85);
                    i4 = ((iM55979 ^ i3) * (-29065)) ^ 410123737;
                    i5 = 1245706337;
                    break;
                case 282070:
                case 1516355959:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0873.m55680("۠᩵") ^ i2) * 73;
                        i4 = ((iM55979 ^ i3) * (-28249)) ^ 1396291630;
                        i5 = -1660846271;
                    } else {
                        iM55979 = (C0946.m55979("۫۟") ^ i2) * 65;
                        i4 = ((iM55979 ^ i3) * (-10693)) ^ (-1347309113);
                        i5 = -1765940259;
                    }
                    break;
                case 11045691:
                case 1734482981:
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0873.m55680("ۖܽ") ^ i2) * (-85);
                        i4 = ((iM55979 ^ i3) * (-29065)) ^ 410123737;
                        i5 = 1245706337;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ܳܳ")) * 41;
                        i4 = ((iM55979 ^ i3) * 13141) ^ 1772431748;
                        i5 = 1371194402;
                    }
                    break;
                case 461572205:
                case 1448657204:
                    z = false;
                    if (zArr[0]) {
                        iM55979 = (C0946.m55979("ۗܺ") ^ i3) * 93;
                        i4 = ((iM55979 ^ i2) * 25001) ^ (-914147205);
                        i5 = -1281896276;
                    } else {
                        iM55979 = (C0946.m55979("֫ۖ") ^ i2) * (-95);
                        i4 = ((iM55979 ^ i3) * 897) ^ 1262693420;
                        i5 = 1397746632;
                    }
                    break;
                case 1098099629:
                case 1854438374:
                    C0930.m55885();
                    if (C0989.m56095() <= 0) {
                        iM55979 = (C0873.m55680("۫᩸") ^ i3) * (-7);
                        i4 = ((iM55979 ^ i2) * (-15909)) ^ 708701930;
                        i5 = 426486458;
                    } else {
                        iM55979 = (C0873.m55680("ۖܽ") ^ i2) * (-85);
                        i4 = ((iM55979 ^ i3) * (-29065)) ^ 410123737;
                        i5 = 1245706337;
                    }
                    break;
                case 1130742167:
                case 2117276764:
                    if (C0946.m55980() != 0) {
                        iM55979 = C0946.m55979("ܶ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23203)) ^ (-660308887);
                        i5 = -1865785881;
                    } else {
                        iM55979 = C0946.m55979("ܳۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-20945)) ^ 914845020;
                        i5 = 354909665;
                    }
                    break;
                default:
                    c12094.f33798 = true;
                    C0890.m55728(c0990, true);
                    c12094.f33798 = z;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m27906(C12094 c12094) {
        C12096 c12096 = null;
        InterfaceC9768 interfaceC9768M56467 = null;
        String strM55591 = null;
        boolean zM55695 = false;
        String strM55639 = null;
        int i = 1815769573;
        int i2 = AbstractC0942.f81890;
        int i3 = C0877.f81843;
        int iM55680 = (C0873.m55680("ۜ᩶") + i3) * (-115);
        int i4 = ((iM55680 ^ i2) * 13819) ^ 1152781661;
        int i5 = 1117009607;
        while (true) {
            i = ((((i ^ i2) * (-5931)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1532204343:
                case 1352657548:
                    c12096 = c12094.f33802;
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0946.m55979("ۛۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21487) ^ (-640561202);
                        i5 = 215231863;
                    } else {
                        iM55680 = (C0873.m55680("ᩴۜ") + i3) * (-25);
                        i4 = ((iM55680 ^ i2) * (-18755)) ^ 2059068029;
                        i5 = 748879462;
                    }
                    break;
                case -1522231631:
                case -1351551793:
                    strM55591 = C0845.m55591(interfaceC9768M56467);
                    zM55695 = C0877.m55695(c12094.f33799);
                    if (zM55695) {
                        iM55680 = (C0873.m55680("ܽᩴ") + i2) * 79;
                        i4 = ((iM55680 ^ i3) * 31503) ^ (-712402482);
                        i5 = -1775652103;
                    } else {
                        iM55680 = C0946.m55979("ۗ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26641) ^ 129265943;
                        i5 = 2014605993;
                    }
                    break;
                case -1461927738:
                case -1449163022:
                    interfaceC9768M56467 = C1404.m56467(c12096);
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("ۗ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 7941) ^ (-1391774957);
                        i5 = -201096180;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܳᩴ")) * 95;
                        i4 = ((iM55680 ^ i2) * 17199) ^ 526286519;
                        i5 = 1636760267;
                    }
                    break;
                case -1281102397:
                case 1700348767:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ᩳܽ")) * (-53);
                        i4 = ((iM55680 ^ i3) * 15899) ^ (-738112553);
                        i5 = 352874532;
                    } else {
                        iM55680 = (C0946.m55979("ۘ᩶") + i2) * (-89);
                        i4 = ((iM55680 ^ i3) * 26343) ^ (-996324158);
                        i5 = 1992156737;
                    }
                    break;
                case -1062288323:
                case 1901298639:
                    if (C0890.f81849 == 0) {
                        iM55680 = (C0946.m55979("ܺ۟") + i3) * (-91);
                        i4 = ((iM55680 ^ i2) * (-16607)) ^ 1870198841;
                        i5 = 1223656784;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ᩳܽ")) * (-53);
                        i4 = ((iM55680 ^ i3) * 15899) ^ (-738112553);
                        i5 = 352874532;
                    }
                    break;
                case -1016450316:
                case 831064302:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (i2 - C0873.m55680("ᩳܽ")) * (-53);
                        i4 = ((iM55680 ^ i3) * 15899) ^ (-738112553);
                        i5 = 352874532;
                    } else {
                        iM55680 = C0873.m55680("ܶۘ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22055) ^ (-921567752);
                        i5 = -350830816;
                    }
                    break;
                case -786117116:
                case 2051829909:
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0946.m55979("ۛۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21487) ^ (-640561202);
                        i5 = 215231863;
                    } else {
                        iM55680 = (C0946.m55979("ܺ۟") + i3) * (-91);
                        i4 = ((iM55680 ^ i2) * (-16607)) ^ 1870198841;
                        i5 = 1223656784;
                    }
                    break;
                case -161773877:
                case 1350522413:
                    strM55639 = "";
                    iM55680 = (C0946.m55979("ۙᩳ") + i3) * 75;
                    i4 = ((iM55680 ^ i2) * 19035) ^ (-1688302636);
                    i5 = -1804605964;
                    break;
                case -155987932:
                case 684065599:
                    strM55639 = C0863.m55639(C0892.m55745(c12094.f33801));
                    iM55680 = (C0946.m55979("ۙᩳ") + i3) * 75;
                    i4 = ((iM55680 ^ i2) * 19035) ^ (-1688302636);
                    i5 = -1804605964;
                    break;
                case -38518070:
                case 559948058:
                    C0892.m55749();
                    C0930.m55885();
                    iM55680 = (i2 - C0873.m55680("ᩳܽ")) * (-53);
                    i4 = ((iM55680 ^ i3) * 15899) ^ (-738112553);
                    i5 = 352874532;
                    break;
                case 193471459:
                case 1181245750:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0873.m55680("۠ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-26351)) ^ (-1790082704);
                        i5 = 670685104;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ܺ᩹")) * (-69);
                        i4 = ((iM55680 ^ i3) * 10397) ^ (-2037369222);
                        i5 = -937999812;
                    }
                    break;
                case 283646474:
                case 1074322722:
                    if (C1071.m56343() != 0) {
                        iM55680 = (C0946.m55979("ܺ۟") + i3) * (-91);
                        i4 = ((iM55680 ^ i2) * (-16607)) ^ 1870198841;
                        i5 = 1223656784;
                    } else {
                        iM55680 = C0946.m55979("ۧܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28097)) ^ 666130932;
                        i5 = -814361896;
                    }
                    break;
                case 441711031:
                case 1454719386:
                    C1124.m56367();
                    C0845.m55584();
                    break;
                case 622686985:
                case 1600946967:
                    C1053.m56329(new C6729(c12094, zM55695, strM55639, strM55591));
                    break;
                case 894913765:
                case 1581492120:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0946.m55979("ܺ۟") + i3) * (-91);
                        i4 = ((iM55680 ^ i2) * (-16607)) ^ 1870198841;
                        i5 = 1223656784;
                    } else {
                        iM55680 = (C0946.m55979("᩶ۖ") + i2) * (-109);
                        i4 = ((iM55680 ^ i3) * (-22631)) ^ 1811447345;
                        i5 = 327719802;
                    }
                    break;
                case 1117508327:
                case 1335056224:
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0946.m55979("ܺ۟") + i3) * (-91);
                        i4 = ((iM55680 ^ i2) * (-16607)) ^ 1870198841;
                        i5 = 1223656784;
                    } else {
                        iM55680 = C0946.m55979("᩵ۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-26947)) ^ (-824017593);
                        i5 = 379677092;
                    }
                    break;
                case 1153666919:
                case 1818073040:
                    if (C1036.m56257() <= 0) {
                        iM55680 = C0873.m55680("۠ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-26351)) ^ (-1790082704);
                        i5 = 670685104;
                    } else {
                        iM55680 = C0873.m55680("ۤۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26419)) ^ (-2070096773);
                        i5 = -858516344;
                    }
                    break;
                case 1426102228:
                case 1518238098:
                    if (!C0917.f81868) {
                        iM55680 = (i2 - C0873.m55680("ᩳܽ")) * (-53);
                        i4 = ((iM55680 ^ i3) * 15899) ^ (-738112553);
                        i5 = 352874532;
                    } else {
                        iM55680 = C0873.m55680("۠ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-26351)) ^ (-1790082704);
                        i5 = 670685104;
                    }
                    break;
                default:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0946.m55979("ۛۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21487) ^ (-640561202);
                        i5 = 215231863;
                    } else {
                        iM55680 = C0873.m55680("ᩳ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6439)) ^ (-1682303477);
                        i5 = -1782320368;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ea A[PHI: r7 r14 r15
      0x00ea: PHI (r7v4 java.lang.Object) = (r7v3 java.lang.Object), (r7v2 java.lang.Object), (r7v2 java.lang.Object) binds: [B:28:0x00e8, B:24:0x00c3, B:12:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:28:0x00e8, B:24:0x00c3, B:12:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:28:0x00e8, B:24:0x00c3, B:12:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x012e A[PHI: r9 r10
      0x012e: PHI (r9v5 int) = (r9v4 int), (r9v2 int) binds: [B:32:0x012c, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:32:0x012c, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0207 A[PHI: r2 r3 r5 r18 r19
      0x0207: PHI (r2v4 android.text.SpannableString) = 
      (r2v2 android.text.SpannableString)
      (r2v3 android.text.SpannableString)
      (r2v2 android.text.SpannableString)
      (r2v2 android.text.SpannableString)
      (r2v2 android.text.SpannableString)
      (r2v2 android.text.SpannableString)
     binds: [B:94:0x0207, B:49:0x0205, B:18:0x0094, B:12:0x0082, B:9:0x0077, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r3v4 bin.mt.plus.Main) = 
      (r3v2 bin.mt.plus.Main)
      (r3v3 bin.mt.plus.Main)
      (r3v2 bin.mt.plus.Main)
      (r3v2 bin.mt.plus.Main)
      (r3v2 bin.mt.plus.Main)
      (r3v2 bin.mt.plus.Main)
     binds: [B:94:0x0207, B:49:0x0205, B:18:0x0094, B:12:0x0082, B:9:0x0077, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r5v3 android.view.View) = 
      (r5v2 android.view.View)
      (r5v2 android.view.View)
      (r5v2 android.view.View)
      (r5v2 android.view.View)
      (r5v2 android.view.View)
      (r5v6 android.view.View)
     binds: [B:94:0x0207, B:49:0x0205, B:18:0x0094, B:12:0x0082, B:9:0x0077, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r18v6 short[]) = (r18v2 short[]), (r18v4 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:94:0x0207, B:49:0x0205, B:18:0x0094, B:12:0x0082, B:9:0x0077, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:94:0x0207, B:49:0x0205, B:18:0x0094, B:12:0x0082, B:9:0x0077, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m27890(C12094 c12094) {
        short s;
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int iM55681;
        int i4;
        int i5;
        final C12094 c12095 = c12094;
        int i6 = C0873.f81841;
        int i7 = C1404.f82149;
        int iM55682 = C0873.m55680("۟ۚ") ^ i6;
        int i8 = ((iM55682 ^ i7) * (-10759)) ^ 1729777440;
        Object obj = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = iM55682 ^ 1913472451;
        int iM559710 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -773805986;
        int iM55683 = 0;
        C20671 c20671M55888 = null;
        View viewM55755 = null;
        View viewM56111 = null;
        Main main = null;
        SpannableString spannableStringM48396 = null;
        while (true) {
            i16 = i9 ^ (i8 & (((i16 ^ i7) * (-617)) >> 31));
            switch (i16) {
                case -2047599462:
                case -297919703:
                    iM559710 = C0946.m55979(C0989.m56092(f82125, 59, 3, i12));
                    i10 = 2124239296;
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("ᩴۛ") ^ i6;
                        i = ((iM55979 ^ i7) * 21861) ^ (-1318490457);
                        i2 = -1281335799;
                    } else {
                        iM55979 = (C0946.m55979("᩺ۛ") + i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i7) * 5755) ^ (-1258576171);
                        i2 = -1095395665;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1940968583:
                case 764914734:
                    C1048.m56305();
                    iM55979 = (i7 - C0873.m55680("۟۟")) * (-127);
                    i = ((iM55979 ^ i6) * (-22801)) ^ 449203444;
                    i2 = -237914876;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1807959027:
                case -1405860834:
                    sArr = sArr;
                    spannableStringM48396 = spannableStringM48396;
                    int i17 = (s2 * s2) + 8708401;
                    if ((i17 + i17) - (i14 * i14) < 0) {
                        iM55681 = C0873.m55680("ܽ᩸") ^ i7;
                        i4 = ((iM55681 ^ i6) * 14133) ^ (-257439835);
                        i5 = 1620228659;
                    } else {
                        iM55681 = C0873.m55680("ᩴܰ") ^ i6;
                        i4 = ((iM55681 ^ i7) * (-31629)) ^ (-1006354032);
                        i5 = -949012416;
                    }
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    spannableStringM48396 = spannableStringM48396;
                    sArr = sArr;
                    break;
                case -1657392409:
                case 683503966:
                    sArr = sArr;
                    spannableStringM48396 = spannableStringM48396;
                    s2 = f82125[52];
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("ܳ᩷") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-18689)) ^ 843181541;
                        i3 = -1793006553;
                    } else {
                        iM55680 = C0873.m55680("۬ۙ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-18315)) ^ 768859892;
                        i3 = 1414476082;
                    }
                    i9 = iM55680 ^ i3;
                    c12095 = c12094;
                    spannableStringM48396 = spannableStringM48396;
                    sArr = sArr;
                    break;
                case -1646465990:
                case 613076440:
                    i12 = 21740;
                    iM55681 = (C0946.m55979("֡۟") ^ i6) * (-115);
                    i4 = ((iM55681 ^ i7) * 13571) ^ (-544056491);
                    i5 = 1078835693;
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    spannableStringM48396 = spannableStringM48396;
                    sArr = sArr;
                    break;
                case -1511082303:
                case 1139110549:
                    C0967.m56080(c20671M55888, C0873.m55680(RunnableC0938.m55936(sArr3, i13, 3, i12)) ^ 2121354941, obj);
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i6 - C0946.m55979("ۢ۟")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55979 ^ i7) * 13433) ^ (-1352565033);
                        i2 = -365805891;
                    } else {
                        iM55979 = C0946.m55979("֡ᩳ") ^ i6;
                        i = ((iM55979 ^ i7) * 29607) ^ (-929545752);
                        i2 = 2003951725;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1433787360:
                case 1109948581:
                    C0894.m55771((TextView) viewM55755, spannableStringM48396);
                    c20671M55888 = C0930.m55888(main);
                    C0927.m55864(c20671M55888, viewM56111);
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = C0873.m55680("۬᩵") ^ i7;
                        i = ((iM55979 ^ i6) * (-453)) ^ (-1026404302);
                        i2 = 974441756;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    } else {
                        sArr = sArr;
                        spannableStringM48396 = spannableStringM48396;
                        iM55680 = C0873.m55680("ܳ᩷") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-18689)) ^ 843181541;
                        i3 = -1793006553;
                        i9 = iM55680 ^ i3;
                        c12095 = c12094;
                        spannableStringM48396 = spannableStringM48396;
                        sArr = sArr;
                    }
                    break;
                case -1425818508:
                case 1637732736:
                    obj = null;
                    C0906.m55817(c20671M55888, iM559710 ^ i10, null);
                    sArr3 = f82125;
                    i13 = 62;
                    if (C0989.f81920 >= 0) {
                        iM55979 = (i6 - C0946.m55979("ۢ۟")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55979 ^ i7) * 13433) ^ (-1352565033);
                        i2 = -365805891;
                    } else {
                        iM55979 = (i7 - C0873.m55680("ۧ۠")) * (-57);
                        i = ((iM55979 ^ i6) * (-10169)) ^ 1626504689;
                        i2 = -2127880864;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1333917974:
                case 1314007128:
                    C0927.m55873();
                    C1025.m56230();
                    break;
                case -1262983212:
                case -489508316:
                    i12 = 13007;
                    iM55681 = (C0946.m55979("֡۟") ^ i6) * (-115);
                    i4 = ((iM55681 ^ i7) * 13571) ^ (-544056491);
                    i5 = 1078835693;
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    spannableStringM48396 = spannableStringM48396;
                    sArr = sArr;
                    break;
                case -1184587731:
                case 2140868797:
                    viewM56111 = C0992.m56111(main, iM55683 ^ 2101813369);
                    sArr2 = f82125;
                    i11 = 56;
                    if (C1071.f81975 > 0) {
                        iM55979 = C0946.m55979("ᩴܳ") ^ i6;
                        i = ((iM55979 ^ i7) * (-16313)) ^ 679292699;
                        i2 = 31383651;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    } else {
                        sArr = sArr;
                        spannableStringM48396 = spannableStringM48396;
                        iM55680 = C0873.m55680("ܳ᩷") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-18689)) ^ 843181541;
                        i3 = -1793006553;
                        i9 = iM55680 ^ i3;
                        c12095 = c12094;
                        spannableStringM48396 = spannableStringM48396;
                        sArr = sArr;
                    }
                    break;
                case -867651798:
                case -706375054:
                    sArr = sArr;
                    spannableStringM48396 = spannableStringM48396;
                    int i18 = i15;
                    iM55683 = C0873.m55680(C1194.m56386(sArr, i18, 3, i12));
                    if (!C0890.m55740()) {
                        i15 = i18;
                        iM55680 = C0873.m55680("ܳ᩷") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-18689)) ^ 843181541;
                        i3 = -1793006553;
                        i9 = iM55680 ^ i3;
                        c12095 = c12094;
                        spannableStringM48396 = spannableStringM48396;
                        sArr = sArr;
                    } else {
                        iM55681 = C0946.m55979("۠ܰ") ^ i7;
                        i15 = i18;
                        i4 = ((iM55681 ^ i6) * 5287) ^ (-689315850);
                        i5 = -1414403119;
                        i9 = iM55681 ^ i5;
                        i8 = i4;
                        spannableStringM48396 = spannableStringM48396;
                        sArr = sArr;
                    }
                    break;
                case -773130615:
                case 767674329:
                    C0947.m55996(C1229.m56405(RunnableC0871.m55669(c20671M55888)), new View.OnClickListener() { // from class: l.᩹ۤܽ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1929.m56559(this.f74842.f33794, C25165.m55236());
                        }
                    });
                    break;
                case -384595032:
                case 942685694:
                    C1404.m56468();
                    if (C0854.m55595() < 0) {
                        iM55979 = (i7 - C0873.m55680("۟۟")) * (-127);
                        i = ((iM55979 ^ i6) * (-22801)) ^ 449203444;
                        i2 = -237914876;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ۢ۟")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55979 ^ i7) * 13433) ^ (-1352565033);
                        i2 = -365805891;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -309700540:
                case -141149042:
                    if (C0946.f81894 != 0) {
                        s = s2;
                        sArr = sArr;
                        spannableStringM48396 = spannableStringM48396;
                        int iM559711 = (C0946.m55979("ܶܳ") + i7) * (-49);
                        int i19 = ((iM559711 ^ i6) * (-11731)) ^ (-625440854);
                        i9 = iM559711 ^ (-275941330);
                        s2 = s;
                        spannableStringM48396 = spannableStringM48396;
                        i8 = i19;
                        sArr = sArr;
                        c12095 = c12094;
                    } else {
                        iM55979 = (i7 - C0873.m55680("۟۟")) * (-127);
                        i = ((iM55979 ^ i6) * (-22801)) ^ 449203444;
                        i2 = -237914876;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case -179177874:
                case 251593497:
                    sArr = sArr;
                    spannableStringM48396 = spannableStringM48396;
                    s = s2;
                    int i20 = s + 2951;
                    if (C1003.f81929 > 0) {
                        int iM559712 = C0946.m55979("ܰ᩹") ^ i7;
                        s2 = s;
                        i8 = ((iM559712 ^ i6) * (-3455)) ^ 1426782368;
                        i9 = iM559712 ^ 1075208824;
                        c12095 = c12094;
                        i14 = i20;
                        spannableStringM48396 = spannableStringM48396;
                        sArr = sArr;
                    } else {
                        i14 = i20;
                        int iM559713 = (C0946.m55979("ܶܳ") + i7) * (-49);
                        int i110 = ((iM559713 ^ i6) * (-11731)) ^ (-625440854);
                        i9 = iM559713 ^ (-275941330);
                        s2 = s;
                        spannableStringM48396 = spannableStringM48396;
                        i8 = i110;
                        sArr = sArr;
                        c12095 = c12094;
                    }
                    break;
                case 42614485:
                case 737268108:
                    spannableStringM48396 = ViewOnClickListenerC21364.m48396();
                    main = c12095.f33794;
                    sArr = f82125;
                    i15 = 53;
                    if (C0989.m56095() <= 0) {
                        iM55979 = (i7 - C0873.m55680("۟۟")) * (-127);
                        i = ((iM55979 ^ i6) * (-22801)) ^ 449203444;
                        i2 = -237914876;
                    } else {
                        iM55979 = (C0946.m55979("ۗܿ") ^ i7) * (-59);
                        i = ((iM55979 ^ i6) * (-27113)) ^ (-1762360458);
                        i2 = -806206666;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case 174479224:
                case 1091189439:
                    if (RunnableC0871.f81839 < 0) {
                        iM55979 = (i7 - C0873.m55680("۟۟")) * (-127);
                        i = ((iM55979 ^ i6) * (-22801)) ^ 449203444;
                        i2 = -237914876;
                    } else {
                        iM55979 = C0873.m55680("ᩴۛ") ^ i6;
                        i = ((iM55979 ^ i7) * 21861) ^ (-1318490457);
                        i2 = -1281335799;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                default:
                    viewM55755 = C0892.m55755(viewM56111, C0946.m55979(RunnableC0938.m55936(sArr2, i11, 3, i12)) ^ 2119089134);
                    if (AbstractC0942.m55971()) {
                        iM55979 = (i7 - C0873.m55680("۟۟")) * (-127);
                        i = ((iM55979 ^ i6) * (-22801)) ^ 449203444;
                        i2 = -237914876;
                    } else {
                        iM55979 = C0946.m55979("᩻ۢ") ^ i6;
                        i = ((iM55979 ^ i7) * 29775) ^ 726763478;
                        i2 = -264638303;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        if (p067l.C0854.f81826 != 0) goto L12;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m27903(String str) throws C3924 {
        int i;
        int iM55680;
        int i2;
        int i3;
        int iM55681;
        int i4;
        int i5;
        int iM55979;
        int i6;
        int iM559710;
        int i7;
        int i8;
        int i9 = C0877.f81843;
        int i10 = C0967.f81910;
        int iM559711 = (C0946.m55979("᩺ۛ") + i10) * (-83);
        int i11 = ((iM559711 ^ i9) * 28923) ^ (-1041691130);
        String[] strArr = null;
        String strM55995 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i12 = iM559711 ^ (-1871799806);
        ArrayList arrayList = null;
        int length = 0;
        char c = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -454237496;
        char c2 = 0;
        C14983 c14983M26642 = null;
        int i18 = 0;
        while (true) {
            i17 = i12 ^ (i11 & (((i17 ^ i9) * 28543) >> 31));
            switch (i17) {
                case -2020500514:
                case -1792686249:
                    C0912.m55833();
                    if (C1194.f82045 != 0) {
                        s = s;
                        s2 = s2;
                        iM55680 = C0946.m55979("ۖۨ") ^ i9;
                        i2 = ((iM55680 ^ i10) * (-6301)) ^ (-727381307);
                        i3 = 1614620302;
                        int i19 = iM55680 ^ i3;
                        s2 = s2;
                        short s3 = s;
                        i12 = i19;
                        i11 = i2;
                        s = s3;
                    } else {
                        int iM55682 = (C0873.m55680("᩷᩻") + i9) * 99;
                        i12 = iM55682 ^ (-76730677);
                        i11 = ((iM55682 ^ i10) * 8125) ^ (-321514544);
                    }
                    break;
                case -1939500426:
                case 59946708:
                    i15 = 16075;
                    iM55680 = (C0873.m55680("ۖۜ") ^ i10) * (-13);
                    i2 = ((iM55680 ^ i9) * 17003) ^ (-359096025);
                    i3 = 594108970;
                    int i110 = iM55680 ^ i3;
                    s2 = s2;
                    short s4 = s;
                    i12 = i110;
                    i11 = i2;
                    s = s4;
                    break;
                case -1779093594:
                case -1263149645:
                    C0937.m55917(arrayList, c14983M26642);
                    i = i14;
                    s = s;
                    s2 = s2;
                    iM559710 = (C0946.m55979("ۗۤ") + i10) * 11;
                    i7 = ((iM559710 ^ i9) * 26261) ^ (-198200324);
                    i8 = -658684205;
                    s = s;
                    s2 = s2;
                    i12 = iM559710 ^ i8;
                    i11 = i7;
                    i14 = i;
                    break;
                case -1582807956:
                case -340144966:
                    i = i14;
                    s = s;
                    s2 = s2;
                    if (m27900(c14983M26642)) {
                        iM559710 = C0873.m55680("ۖ᩵") ^ i10;
                        i7 = ((iM559710 ^ i9) * 19017) ^ (-1909289901);
                        i8 = 508627373;
                    } else {
                        iM559710 = C0873.m55680("֫ۛ") ^ i9;
                        i7 = ((iM559710 ^ i10) * (-25529)) ^ 1351799572;
                        i8 = -1328420131;
                    }
                    s = s;
                    s2 = s2;
                    i12 = iM559710 ^ i8;
                    i11 = i7;
                    i14 = i;
                    break;
                case -1545718073:
                case 1885562136:
                    s = s;
                    s2 = s2;
                    int i20 = s + s2;
                    if ((62200 * s) - (i20 * i20) > 0) {
                        iM55680 = (C0873.m55680("ܽܶ") + i9) * (-35);
                        i2 = ((iM55680 ^ i10) * (-18847)) ^ (-921049074);
                        i3 = -1703057213;
                    } else {
                        iM55680 = (i10 - C0873.m55680("ᩳܰ")) * (-101);
                        i2 = ((iM55680 ^ i9) * (-29943)) ^ 1923905906;
                        i3 = -355336295;
                    }
                    int i111 = iM55680 ^ i3;
                    s2 = s2;
                    short s5 = s;
                    i12 = i111;
                    i11 = i2;
                    s = s5;
                    break;
                case -1516922903:
                case -1364962835:
                    i = i14;
                    s = s;
                    s2 = s2;
                    if (i13 < length) {
                        iM559710 = (C0946.m55979("ܿۡ") ^ i10) * 93;
                        i7 = ((iM559710 ^ i9) * 23869) ^ (-593353355);
                        i8 = -552350299;
                    } else {
                        iM559710 = (C0946.m55979("ۤ᩶") ^ i9) * (-59);
                        i7 = ((iM559710 ^ i10) * (-29473)) ^ (-1899550771);
                        i8 = -1784359251;
                    }
                    s = s;
                    s2 = s2;
                    i12 = iM559710 ^ i8;
                    i11 = i7;
                    i14 = i;
                    break;
                case -1506682842:
                case -842412118:
                    return arrayList;
                case -1436526059:
                case -1375431836:
                    s = sArr[c2];
                    s2 = 15550;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("ܰ᩵") ^ i10;
                        i4 = ((iM55979 ^ i9) * 16719) ^ 677531681;
                        i6 = 1965641210;
                    } else {
                        iM55979 = C0946.m55979("ۖۘ") ^ i9;
                        i4 = ((iM55979 ^ i10) * 6403) ^ (-701759618);
                        i6 = 764540440;
                    }
                    i12 = iM55979 ^ i6;
                    i11 = i4;
                    arrayList = arrayList;
                    break;
                case -1385336569:
                case 1401700589:
                    i = i14;
                    s = s;
                    s2 = s2;
                    Object[] objArr = new Object[i18];
                    objArr[c] = strM55995;
                    short[] sArr3 = f82125;
                    if (C0912.f81867 <= 0) {
                        i14 = i;
                        iM55680 = (i9 - C0873.m55680("᩹ۨ")) * (-53);
                        i2 = ((iM55680 ^ i10) * (-13757)) ^ 1462006115;
                        i3 = 232486724;
                        int i112 = iM55680 ^ i3;
                        s2 = s2;
                        short s6 = s;
                        i12 = i112;
                        i11 = i2;
                        s = s6;
                    } else if (C1194.f82045 != 0) {
                        iM559710 = C0946.m55979("ۤ۫") ^ i10;
                        i7 = ((iM559710 ^ i9) * (-23131)) ^ 955577787;
                        i8 = 1297369594;
                        s = s;
                        s2 = s2;
                        i12 = iM559710 ^ i8;
                        i11 = i7;
                        i14 = i;
                    } else {
                        int iM55683 = C0873.m55680(C1229.m56403(sArr3, 204, 3, i15));
                        if (C0890.m55740()) {
                            throw new C3924(C1003.m56122(iM55683 ^ 2121729191, objArr));
                        }
                        i14 = i;
                        arrayList = arrayList;
                        iM55681 = (C0946.m55979("֨᩹") + i10) * 45;
                        i4 = ((iM55681 ^ i9) * (-2807)) ^ 1178869743;
                        i5 = -164586936;
                        int i21 = iM55681 ^ i5;
                        s = s;
                        s2 = s2;
                        i12 = i21;
                        i11 = i4;
                        arrayList = arrayList;
                    }
                    break;
                case -1369035834:
                case -630069424:
                    s = s;
                    s2 = s2;
                    i16 = 203;
                    i14 = 1;
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ۖۨ") ^ i9;
                        i2 = ((iM55680 ^ i10) * (-6301)) ^ (-727381307);
                        i3 = 1614620302;
                    } else {
                        iM55680 = C0873.m55680("۟᩸") ^ i10;
                        i2 = ((iM55680 ^ i9) * 19057) ^ (-1239614819);
                        i3 = 1982736779;
                    }
                    int i113 = iM55680 ^ i3;
                    s2 = s2;
                    short s7 = s;
                    i12 = i113;
                    i11 = i2;
                    s = s7;
                    break;
                case -1218955649:
                case 1867137904:
                    i = i14;
                    s = s;
                    s2 = s2;
                    try {
                        c14983M26642 = C11572.m26642(strM55995);
                        C0992.m56109(c14983M26642);
                        iM559710 = (i10 - C0946.m55979("ᩳۜ")) * 37;
                        i7 = ((iM559710 ^ i9) * 22161) ^ 2081671292;
                        i8 = -1880018565;
                    } catch (Exception unused) {
                        iM559710 = C0946.m55979("ۗ۬") ^ i9;
                        i7 = ((iM559710 ^ i10) * 4319) ^ 648636974;
                        i8 = -574390267;
                    }
                    s = s;
                    s2 = s2;
                    i12 = iM559710 ^ i8;
                    i11 = i7;
                    i14 = i;
                    break;
                case -1137051564:
                case -957326039:
                    C1048.m56305();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0946.m55979("ܰ᩵") ^ i10;
                        i4 = ((iM55979 ^ i9) * 16719) ^ 677531681;
                        i6 = 1965641210;
                        i12 = iM55979 ^ i6;
                        i11 = i4;
                        arrayList = arrayList;
                    } else {
                        s = s;
                        s2 = s2;
                        iM55680 = (i9 - C0873.m55680("᩹ۨ")) * (-53);
                        i2 = ((iM55680 ^ i10) * (-13757)) ^ 1462006115;
                        i3 = 232486724;
                        int i114 = iM55680 ^ i3;
                        s2 = s2;
                        short s8 = s;
                        i12 = i114;
                        i11 = i2;
                        s = s8;
                    }
                    break;
                case -876450628:
                case -268787326:
                    s = s;
                    s2 = s2;
                    arrayList = new ArrayList();
                    sArr2 = f82125;
                    if (C0930.f81879 <= 0) {
                        iM55680 = (i9 - C0873.m55680("᩹ۨ")) * (-53);
                        i2 = ((iM55680 ^ i10) * (-13757)) ^ 1462006115;
                        i3 = 232486724;
                    } else {
                        iM55680 = C0873.m55680("ۜܶ") ^ i9;
                        i2 = ((iM55680 ^ i10) * (-705)) ^ (-944935237);
                        i3 = 539617793;
                    }
                    int i115 = iM55680 ^ i3;
                    s2 = s2;
                    short s9 = s;
                    i12 = i115;
                    i11 = i2;
                    s = s9;
                    break;
                case -686615029:
                case -41283930:
                    String[] strArrM55948 = ViewOnClickListenerC0939.m55948(str, C0912.m55822(sArr2, i16, i14, i15));
                    length = strArrM55948.length;
                    c = 0;
                    i13 = 0;
                    strArr = strArrM55948;
                    iM55680 = C0873.m55680("ᩴ۫") ^ i9;
                    i2 = ((iM55680 ^ i10) * 27103) ^ (-1503040122);
                    i3 = 735688451;
                    int i116 = iM55680 ^ i3;
                    s2 = s2;
                    short s10 = s;
                    i12 = i116;
                    i11 = i2;
                    s = s10;
                    break;
                case -660388584:
                case 166968170:
                    i13++;
                    iM55680 = C0873.m55680("ᩴ۫") ^ i9;
                    i2 = ((iM55680 ^ i10) * 27103) ^ (-1503040122);
                    i3 = 735688451;
                    int i117 = iM55680 ^ i3;
                    s2 = s2;
                    short s11 = s;
                    i12 = i117;
                    i11 = i2;
                    s = s11;
                    break;
                case -555179669:
                case 1050560080:
                    Object[] objArr2 = new Object[i18];
                    objArr2[c] = strM55995;
                    s = s;
                    short[] sArr4 = f82125;
                    if (C0898.f81858 <= 0) {
                        i = i14;
                        s2 = s2;
                        iM559710 = C0946.m55979("ۤ۫") ^ i10;
                        i7 = ((iM559710 ^ i9) * (-23131)) ^ 955577787;
                        i8 = 1297369594;
                        s = s;
                        s2 = s2;
                        i12 = iM559710 ^ i8;
                        i11 = i7;
                        i14 = i;
                    } else {
                        s2 = s2;
                        if (!C0866.m55645()) {
                            arrayList = arrayList;
                            iM55681 = (C0946.m55979("֨᩹") + i10) * 45;
                            i4 = ((iM55681 ^ i9) * (-2807)) ^ 1178869743;
                            i5 = -164586936;
                            int i22 = iM55681 ^ i5;
                            s = s;
                            s2 = s2;
                            i12 = i22;
                            i11 = i4;
                            arrayList = arrayList;
                        } else {
                            int i23 = i14;
                            int iM559712 = C0946.m55979(C0866.m55652(sArr4, 207, 3, i15));
                            if (!RunnableC0897.m55784()) {
                                throw new C3924(C0912.m55826(iM559712 ^ 2121800902, objArr2));
                            }
                            s = s;
                            s2 = s2;
                            i14 = i23;
                            iM55979 = C0946.m55979("ܰ᩵") ^ i10;
                            i4 = ((iM55979 ^ i9) * 16719) ^ 677531681;
                            i6 = 1965641210;
                            i12 = iM55979 ^ i6;
                            i11 = i4;
                            arrayList = arrayList;
                        }
                    }
                    break;
                case -294459839:
                case 1826282613:
                    C0873.m55678();
                    if (C1046.f81962 > 0) {
                        arrayList = arrayList;
                        s = s;
                        s2 = s2;
                        iM55681 = (C0946.m55979("֨᩹") + i10) * 45;
                        i4 = ((iM55681 ^ i9) * (-2807)) ^ 1178869743;
                        i5 = -164586936;
                        int i24 = iM55681 ^ i5;
                        s = s;
                        s2 = s2;
                        i12 = i24;
                        i11 = i4;
                        arrayList = arrayList;
                    } else {
                        int iM55684 = (C0873.m55680("᩷᩻") + i9) * 99;
                        i12 = iM55684 ^ (-76730677);
                        i11 = ((iM55684 ^ i10) * 8125) ^ (-321514544);
                    }
                    break;
                case -223103576:
                case 973520611:
                    C0882.m55710();
                    C0947.m55997();
                    return null;
                case -24281877:
                case 1601140862:
                    break;
                case 148707531:
                case 1882929794:
                    i = i14;
                    s = s;
                    s2 = s2;
                    i18 = 1;
                    iM559710 = C0946.m55979("ܿܽ") ^ i9;
                    i7 = ((iM559710 ^ i10) * 15607) ^ 244477374;
                    i8 = -519717197;
                    s = s;
                    s2 = s2;
                    i12 = iM559710 ^ i8;
                    i11 = i7;
                    i14 = i;
                    break;
                case 447433681:
                case 686304659:
                    arrayList = arrayList;
                    s = s;
                    s2 = s2;
                    sArr = f82125;
                    c2 = 202;
                    if (C0927.m55873() <= 0) {
                        iM55681 = (C0946.m55979("֨᩹") + i10) * 45;
                        i4 = ((iM55681 ^ i9) * (-2807)) ^ 1178869743;
                        i5 = -164586936;
                    } else {
                        iM55681 = C0873.m55680("᩻᩶") ^ i10;
                        i4 = ((iM55681 ^ i9) * (-5581)) ^ 733181927;
                        i5 = 566746394;
                    }
                    int i25 = iM55681 ^ i5;
                    s = s;
                    s2 = s2;
                    i12 = i25;
                    i11 = i4;
                    arrayList = arrayList;
                    break;
                case 1522564698:
                case 2049583817:
                    C1028.m56247();
                    C1017.m56187();
                    int iM55685 = (C0873.m55680("᩷᩻") + i9) * 99;
                    i12 = iM55685 ^ (-76730677);
                    i11 = ((iM55685 ^ i10) * 8125) ^ (-321514544);
                    break;
                case 1706470683:
                case 1937303481:
                    i = i14;
                    s = s;
                    s2 = s2;
                    strM55995 = C0947.m55995(strArr[i13]);
                    if (C1194.m56397(strM55995)) {
                        iM559710 = (C0946.m55979("ۗۤ") + i10) * 11;
                        i7 = ((iM559710 ^ i9) * 26261) ^ (-198200324);
                        i8 = -658684205;
                    } else {
                        iM559710 = C0946.m55979("ۢܰ") ^ i10;
                        i7 = ((iM559710 ^ i9) * 20463) ^ 1759778432;
                        i8 = -73453992;
                    }
                    s = s;
                    s2 = s2;
                    i12 = iM559710 ^ i8;
                    i11 = i7;
                    i14 = i;
                    break;
                default:
                    i15 = 3464;
                    iM55680 = (C0873.m55680("ۖۜ") ^ i10) * (-13);
                    i2 = ((iM55680 ^ i9) * 17003) ^ (-359096025);
                    i3 = 594108970;
                    int i118 = iM55680 ^ i3;
                    s2 = s2;
                    short s12 = s;
                    i12 = i118;
                    i11 = i2;
                    s = s12;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x009d, code lost:
    
        if (p067l.C1028.f81950 <= 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m27893(C12094 c12094, C0990 c0990, C0990 c0991) {
        InterfaceC14770 interfaceC14770M55950;
        String strM55993;
        int iM55680;
        int i;
        int i2;
        int i3;
        InterfaceC14770 interfaceC14770;
        String str;
        short[] sArr;
        int i4;
        int iM55681;
        int i5;
        int i6;
        int iM55979;
        int i7;
        int i8;
        C12094 c12095 = c12094;
        int i9 = C1071.f81975;
        int i10 = C1046.f81962;
        int iM55682 = C0873.m55680("۬ܶ") ^ i9;
        int i11 = ((iM55682 ^ i10) * (-881)) ^ (-583294644);
        C0990 c0992 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i12 = iM55682 ^ (-1912812683);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short s = 0;
        short s2 = 0;
        int i17 = 0;
        InterfaceC14770 interfaceC14771 = null;
        int i18 = 0;
        int i19 = -683591220;
        InterfaceC14770 interfaceC14770M56341 = null;
        InterfaceC14770 interfaceC14772 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i20 = 0;
        String str2 = null;
        String strM55639 = null;
        int i21 = 0;
        InterfaceC14770 interfaceC14770M55665 = null;
        String strM556310 = null;
        InterfaceC14770 interfaceC14770M56401 = null;
        boolean zM56014 = false;
        while (true) {
            i19 = i12 ^ (i11 & (((i19 ^ i10) * 21613) >> 31));
            switch (i19) {
                case -1891068014:
                case -726601291:
                    strM55639 = C0863.m55639(C0892.m55745(c12095.f33802));
                    sArr4 = f82125;
                    i14 = 80;
                    if (C1012.f81938 < 0) {
                        iM55979 = (C0873.m55680("᩵ۧ") + i10) * (-11);
                        i7 = ((iM55979 ^ i9) * (-12871)) ^ (-551511476);
                        i8 = 108174426;
                        i12 = iM55979 ^ i8;
                        i11 = i7;
                    } else {
                        sArr2 = sArr2;
                        i21 = i21;
                        str2 = str2;
                        interfaceC14770M55950 = interfaceC14771;
                        i18 = i18;
                        i20 = i20;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        iM55680 = (i9 - C0946.m55979("ܶ֫")) * 17;
                        i11 = ((iM55680 ^ i10) * 22933) ^ 299274621;
                        i = 1071792037;
                        i12 = iM55680 ^ i;
                        c12095 = c12094;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        i20 = i20;
                        i18 = i18;
                        interfaceC14771 = interfaceC14770M55950;
                        str2 = str2;
                        i21 = i21;
                        sArr2 = sArr2;
                    }
                    break;
                case -1797549157:
                case -240550419:
                    interfaceC14770M56401 = C1229.m56401(interfaceC14772, C0866.m55652(sArr3, i21, i20, i13), zM56014);
                    strM556310 = C0863.m55639(C0892.m55745(c12095.f33801));
                    sArr6 = f82125;
                    if (RunnableC0938.m55938() == 0) {
                        iM55979 = (C0946.m55979("ۙۜ") + i10) * 3;
                        i7 = ((iM55979 ^ i9) * 13993) ^ 1340297973;
                        i8 = 2119335114;
                        i12 = iM55979 ^ i8;
                        i11 = i7;
                    } else {
                        interfaceC14770 = interfaceC14771;
                        sArr = sArr2;
                        i2 = i21;
                        str = str2;
                        int i22 = i18;
                        i3 = i20;
                        i4 = i22;
                        int iM55683 = (i10 - C0873.m55680("۬ۗ")) * (-35);
                        i12 = iM55683 ^ 2037204020;
                        str2 = str;
                        i21 = i2;
                        sArr2 = sArr;
                        interfaceC14771 = interfaceC14770;
                        i11 = ((iM55683 ^ i9) * (-18249)) ^ (-2080130601);
                        c12095 = c12094;
                        int i23 = i3;
                        i18 = i4;
                        i20 = i23;
                    }
                    break;
                case -1772506928:
                case 1082656976:
                    sArr2 = sArr2;
                    i21 = i21;
                    str2 = str2;
                    interfaceC14770M55950 = interfaceC14771;
                    i18 = i18;
                    i20 = i20;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    int i24 = s + s2;
                    i17 = i24 * i24;
                    i15 = s * s;
                    i16 = 3489424;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (i9 - C0946.m55979("ܶ֫")) * 17;
                        i11 = ((iM55680 ^ i10) * 22933) ^ 299274621;
                        i = 1071792037;
                    } else {
                        iM55680 = C0946.m55979("ۜۨ") ^ i9;
                        i11 = ((iM55680 ^ i10) * (-14925)) ^ (-328949727);
                        i = 1376000602;
                    }
                    i12 = iM55680 ^ i;
                    c12095 = c12094;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    i20 = i20;
                    i18 = i18;
                    interfaceC14771 = interfaceC14770M55950;
                    str2 = str2;
                    i21 = i21;
                    sArr2 = sArr2;
                    break;
                case -1729587074:
                case -1563939760:
                    i13 = 48010;
                    iM55680 = C0946.m55979("ۡۖ") ^ i9;
                    interfaceC14770M55950 = interfaceC14771;
                    i11 = ((iM55680 ^ i10) * 17037) ^ (-310942226);
                    i = 1164041847;
                    i12 = iM55680 ^ i;
                    c12095 = c12094;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    i20 = i20;
                    i18 = i18;
                    interfaceC14771 = interfaceC14770M55950;
                    str2 = str2;
                    i21 = i21;
                    sArr2 = sArr2;
                    break;
                case -1665400273:
                case -1383551586:
                    C0946.m55980();
                    if (C0894.m55769() < 0) {
                        strM55993 = str2;
                        sArr2 = sArr2;
                        i21 = i21;
                        interfaceC14770M55950 = interfaceC14771;
                        i18 = i18;
                        i20 = i20;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        iM55681 = (i9 - C0873.m55680("ۢᩴ")) * 43;
                        i5 = ((iM55681 ^ i10) * 21007) ^ (-1223510377);
                        i6 = -1276268837;
                        i12 = iM55681 ^ i6;
                        i11 = i5;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        i21 = i21;
                        i20 = i20;
                        sArr2 = sArr2;
                        i18 = i18;
                        interfaceC14771 = interfaceC14770M55950;
                        str2 = strM55993;
                        c12095 = c12094;
                    } else {
                        sArr2 = sArr2;
                        i21 = i21;
                        str2 = str2;
                        interfaceC14770M55950 = interfaceC14771;
                        i18 = i18;
                        i20 = i20;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        iM55680 = C0873.m55680("ۨۚ") ^ i9;
                        i11 = ((iM55680 ^ i10) * (-8663)) ^ (-882502548);
                        i = -558317562;
                        i12 = iM55680 ^ i;
                        c12095 = c12094;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        i20 = i20;
                        i18 = i18;
                        interfaceC14771 = interfaceC14770M55950;
                        str2 = str2;
                        i21 = i21;
                        sArr2 = sArr2;
                    }
                    break;
                case -1629590464:
                case -1567737892:
                    i2 = i21;
                    i3 = i20;
                    interfaceC14770 = interfaceC14771;
                    str = str2;
                    interfaceC14770M56341 = C1071.m56341(interfaceC14770, str, C0949.m56014(c0990));
                    sArr = f82125;
                    if (C0949.f81897 < 0) {
                        int iM55684 = C0873.m55680("᩸ۜ") ^ i9;
                        i12 = iM55684 ^ 232768150;
                        interfaceC14771 = interfaceC14770;
                        str2 = str;
                        i11 = ((iM55684 ^ i10) * 5349) ^ 227899358;
                        i21 = i2;
                        i20 = i3;
                        i18 = 69;
                        sArr2 = sArr;
                        c12095 = c12094;
                    } else {
                        i4 = 69;
                        int iM55685 = (i10 - C0873.m55680("۬ۗ")) * (-35);
                        i12 = iM55685 ^ 2037204020;
                        str2 = str;
                        i21 = i2;
                        sArr2 = sArr;
                        interfaceC14771 = interfaceC14770;
                        i11 = ((iM55685 ^ i9) * (-18249)) ^ (-2080130601);
                        c12095 = c12094;
                        int i25 = i3;
                        i18 = i4;
                        i20 = i25;
                    }
                    break;
                case -1421358977:
                case 1944144528:
                    sArr2 = sArr2;
                    i21 = i21;
                    str2 = str2;
                    interfaceC14770M55950 = interfaceC14771;
                    i18 = i18;
                    i20 = i20;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    sArr5 = f82125;
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("ۨۚ") ^ i9;
                        i11 = ((iM55680 ^ i10) * (-8663)) ^ (-882502548);
                        i = -558317562;
                    } else {
                        iM55680 = C0946.m55979("᩹ۨ") ^ i10;
                        i11 = ((iM55680 ^ i9) * (-20787)) ^ (-507724694);
                        i = 1503889232;
                    }
                    i12 = iM55680 ^ i;
                    c12095 = c12094;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    i20 = i20;
                    i18 = i18;
                    interfaceC14771 = interfaceC14770M55950;
                    str2 = str2;
                    i21 = i21;
                    sArr2 = sArr2;
                    break;
                case -1383000218:
                case 1958682390:
                    sArr2 = sArr2;
                    i21 = i21;
                    str2 = str2;
                    interfaceC14770M55950 = interfaceC14771;
                    i18 = i18;
                    i20 = i20;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    int i26 = i15 + i16;
                    if (i17 - (i26 + i26) > 0) {
                        iM55680 = (C0873.m55680("᩹ᩴ") ^ i10) * (-109);
                        i11 = ((iM55680 ^ i9) * 24573) ^ (-1567872991);
                        i = 1817496240;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩶") ^ i10;
                        i11 = ((iM55680 ^ i9) * (-3871)) ^ (-1831060118);
                        i = -836633734;
                    }
                    i12 = iM55680 ^ i;
                    c12095 = c12094;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    i20 = i20;
                    i18 = i18;
                    interfaceC14771 = interfaceC14770M55950;
                    str2 = str2;
                    i21 = i21;
                    sArr2 = sArr2;
                    break;
                case -1013203371:
                case -322874684:
                    break;
                case -133971404:
                case -109874299:
                    C0892.m55749();
                    C1404.m56468();
                    break;
                case 59130686:
                case 1128287575:
                    C1194.m56383(C1025.m56231(interfaceC14770M55665, C0866.m55652(sArr4, i14, 4, i13), strM55639));
                    break;
                case 214296507:
                case 1541629176:
                    C0949.m56012();
                    C0930.m55885();
                    sArr2 = sArr2;
                    i21 = i21;
                    str2 = str2;
                    interfaceC14770M55950 = interfaceC14771;
                    i18 = i18;
                    i20 = i20;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    iM55680 = C0873.m55680("ۨۚ") ^ i9;
                    i11 = ((iM55680 ^ i10) * (-8663)) ^ (-882502548);
                    i = -558317562;
                    i12 = iM55680 ^ i;
                    c12095 = c12094;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    i20 = i20;
                    i18 = i18;
                    interfaceC14771 = interfaceC14770M55950;
                    str2 = str2;
                    i21 = i21;
                    sArr2 = sArr2;
                    break;
                case 258549368:
                case 1094616794:
                    sArr2 = sArr2;
                    i21 = i21;
                    str2 = str2;
                    interfaceC14770M55950 = interfaceC14771;
                    i18 = i18;
                    i20 = i20;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    s = sArr5[65];
                    s2 = 1868;
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = (C0873.m55680("֨ۖ") ^ i9) * (-127);
                        i11 = ((iM55680 ^ i10) * (-2935)) ^ 438912529;
                        i = -1987118786;
                        i12 = iM55680 ^ i;
                        c12095 = c12094;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        i20 = i20;
                        i18 = i18;
                        interfaceC14771 = interfaceC14770M55950;
                        str2 = str2;
                        i21 = i21;
                        sArr2 = sArr2;
                    } else {
                        strM55993 = str2;
                        iM55681 = (i9 - C0873.m55680("ۢᩴ")) * 43;
                        i5 = ((iM55681 ^ i10) * 21007) ^ (-1223510377);
                        i6 = -1276268837;
                        i12 = iM55681 ^ i6;
                        i11 = i5;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        i21 = i21;
                        i20 = i20;
                        sArr2 = sArr2;
                        i18 = i18;
                        interfaceC14771 = interfaceC14770M55950;
                        str2 = strM55993;
                        c12095 = c12094;
                    }
                    break;
                case 565314305:
                case 1744188484:
                    i13 = 32077;
                    iM55680 = C0946.m55979("ۡۖ") ^ i9;
                    interfaceC14770M55950 = interfaceC14771;
                    i11 = ((iM55680 ^ i10) * 17037) ^ (-310942226);
                    i = 1164041847;
                    i12 = iM55680 ^ i;
                    c12095 = c12094;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    i20 = i20;
                    i18 = i18;
                    interfaceC14771 = interfaceC14770M55950;
                    str2 = str2;
                    i21 = i21;
                    sArr2 = sArr2;
                    break;
                case 728180530:
                case 1434487107:
                    sArr2 = sArr2;
                    int i27 = i18;
                    i21 = i21;
                    i20 = i20;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    InterfaceC14770 interfaceC14770M56402 = C1229.m56401(interfaceC14770M56341, C1012.m56144(sArr2, i27, 4, i13), C0877.m55695(c0991));
                    C0990 c0993 = c12095.f33799;
                    if (C0992.m56107() <= 0) {
                        c0992 = c0993;
                        strM55993 = str2;
                        interfaceC14770M55950 = interfaceC14771;
                        i18 = i27;
                        interfaceC14772 = interfaceC14770M56402;
                        iM55681 = (i9 - C0873.m55680("ۢᩴ")) * 43;
                        i5 = ((iM55681 ^ i10) * 21007) ^ (-1223510377);
                        i6 = -1276268837;
                        i12 = iM55681 ^ i6;
                        i11 = i5;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        i21 = i21;
                        i20 = i20;
                        sArr2 = sArr2;
                        i18 = i18;
                        interfaceC14771 = interfaceC14770M55950;
                        str2 = strM55993;
                    } else {
                        int iM559710 = (C0946.m55979("ܿۨ") + i10) * 3;
                        int i28 = ((iM559710 ^ i9) * (-14841)) ^ 1185061651;
                        i12 = iM559710 ^ 1306149553;
                        c0992 = c0993;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        i21 = i21;
                        i20 = i20;
                        i18 = i27;
                        sArr2 = sArr2;
                        interfaceC14772 = interfaceC14770M56402;
                        i11 = i28;
                    }
                    c12095 = c12094;
                    break;
                case 848006945:
                case 1758920133:
                    if (RunnableC0871.m55672() >= 0) {
                        interfaceC14770 = interfaceC14771;
                        sArr = sArr2;
                        i2 = i21;
                        str = str2;
                        int i29 = i18;
                        i3 = i20;
                        i4 = i29;
                        int iM55686 = (i10 - C0873.m55680("۬ۗ")) * (-35);
                        i12 = iM55686 ^ 2037204020;
                        str2 = str;
                        i21 = i2;
                        sArr2 = sArr;
                        interfaceC14771 = interfaceC14770;
                        i11 = ((iM55686 ^ i9) * (-18249)) ^ (-2080130601);
                        c12095 = c12094;
                        int i210 = i3;
                        i18 = i4;
                        i20 = i210;
                    } else {
                        sArr2 = sArr2;
                        i21 = i21;
                        str2 = str2;
                        interfaceC14770M55950 = interfaceC14771;
                        i18 = i18;
                        i20 = i20;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        iM55680 = C0873.m55680("ۨۚ") ^ i9;
                        i11 = ((iM55680 ^ i10) * (-8663)) ^ (-882502548);
                        i = -558317562;
                        i12 = iM55680 ^ i;
                        c12095 = c12094;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        i20 = i20;
                        i18 = i18;
                        interfaceC14771 = interfaceC14770M55950;
                        str2 = str2;
                        i21 = i21;
                        sArr2 = sArr2;
                    }
                    break;
                case 924521730:
                case 1233503265:
                    zM56014 = C0949.m56014(c0992);
                    sArr3 = f82125;
                    i21 = 73;
                    i20 = 3;
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ۢ᩹") ^ i9;
                        i7 = ((iM55979 ^ i10) * (-11211)) ^ (-146168570);
                        i8 = -686666502;
                    } else {
                        iM55979 = (C0946.m55979("ᩳ۟") + i10) * (-35);
                        i7 = ((iM55979 ^ i9) * (-2319)) ^ 171095174;
                        i8 = -496668910;
                    }
                    i12 = iM55979 ^ i8;
                    i11 = i7;
                    break;
                case 2047679892:
                case 2088999983:
                    interfaceC14770M55665 = RunnableC0871.m55665(interfaceC14770M56401, C1964.m56584(sArr6, 76, 4, i13), strM556310);
                    if (C0854.f81826 == 0) {
                        iM55979 = C0946.m55979("᩹ܶ") ^ i9;
                        i7 = ((iM55979 ^ i10) * 479) ^ 1067817761;
                        i8 = -1443859825;
                        i12 = iM55979 ^ i8;
                        i11 = i7;
                    } else {
                        sArr2 = sArr2;
                        i21 = i21;
                        str2 = str2;
                        interfaceC14770M55950 = interfaceC14771;
                        i18 = i18;
                        i20 = i20;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        iM55680 = (i9 - C0946.m55979("ܶ֫")) * 17;
                        i11 = ((iM55680 ^ i10) * 22933) ^ 299274621;
                        i = 1071792037;
                        i12 = iM55680 ^ i;
                        c12095 = c12094;
                        interfaceC14770M56341 = interfaceC14770M56341;
                        i20 = i20;
                        i18 = i18;
                        interfaceC14771 = interfaceC14770M55950;
                        str2 = str2;
                        i21 = i21;
                        sArr2 = sArr2;
                    }
                    break;
                default:
                    sArr2 = sArr2;
                    i18 = i18;
                    i21 = i21;
                    i20 = i20;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649);
                    strM55993 = C0947.m55993(f82125, 66, 3, i13);
                    if (C1194.f82045 != 0) {
                        iM55681 = (i9 - C0873.m55680("ۢᩴ")) * 43;
                        i5 = ((iM55681 ^ i10) * 21007) ^ (-1223510377);
                        i6 = -1276268837;
                    } else {
                        iM55681 = (i10 - C0873.m55680("֨᩻")) * 65;
                        i5 = ((iM55681 ^ i9) * (-27743)) ^ (-753395704);
                        i6 = -1435291128;
                    }
                    i12 = iM55681 ^ i6;
                    i11 = i5;
                    interfaceC14770M56341 = interfaceC14770M56341;
                    i21 = i21;
                    i20 = i20;
                    sArr2 = sArr2;
                    i18 = i18;
                    interfaceC14771 = interfaceC14770M55950;
                    str2 = strM55993;
                    c12095 = c12094;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 32121. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m27900(p067l.InterfaceC7568 r32) {
        /*
            Method dump skipped, instruction units count: 3212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C12094.m27900(l.ۚܽۚ):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0414 A[PHI: r18
      0x0414: PHI (r18v10 int) = (r18v9 int), (r18v11 int) binds: [B:105:0x0412, B:101:0x03dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x044a A[PHI: r18
      0x044a: PHI (r18v46 int) = (r18v8 int), (r18v47 int) binds: [B:109:0x0448, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x047f A[PHI: r10 r11 r18
      0x047f: PHI (r10v3 l.۫ۘܽ) = (r10v1 l.۫ۘܽ), (r10v2 l.۫ۘܽ), (r10v1 l.۫ۘܽ), (r10v1 l.۫ۘܽ), (r10v1 l.۫ۘܽ) binds: [B:113:0x047d, B:62:0x0207, B:30:0x00b2, B:28:0x00ae, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x047f: PHI (r11v3 l.۫ۘܽ) = (r11v1 l.۫ۘܽ), (r11v2 l.۫ۘܽ), (r11v1 l.۫ۘܽ), (r11v1 l.۫ۘܽ), (r11v1 l.۫ۘܽ) binds: [B:113:0x047d, B:62:0x0207, B:30:0x00b2, B:28:0x00ae, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x047f: PHI (r18v45 int) = (r18v7 int), (r18v22 int), (r18v39 int), (r18v40 int), (r18v47 int) binds: [B:113:0x047d, B:62:0x0207, B:30:0x00b2, B:28:0x00ae, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x04b3 A[PHI: r7 r18
      0x04b3: PHI (r7v4 l.ۚܽۚ) = (r7v1 l.ۚܽۚ), (r7v3 l.ۚܽۚ), (r7v1 l.ۚܽۚ) binds: [B:117:0x04b1, B:74:0x02a0, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x04b3: PHI (r18v41 int) = (r18v6 int), (r18v19 int), (r18v42 int) binds: [B:117:0x04b1, B:74:0x02a0, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088 A[PHI: r18
      0x0088: PHI (r18v48 int) = (r18v44 int), (r18v49 int) binds: [B:21:0x0084, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x013b A[PHI: r14 r18
      0x013b: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v1 java.lang.String), (r14v1 java.lang.String) binds: [B:45:0x0139, B:15:0x0072, B:12:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r18v50 int) = (r18v31 int), (r18v49 int), (r18v51 int) binds: [B:45:0x0139, B:15:0x0072, B:12:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0243 A[PHI: r9 r18
      0x0243: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v1 java.lang.String) binds: [B:66:0x022b, B:57:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r18v24 int) = (r18v21 int), (r18v25 int) binds: [B:66:0x022b, B:57:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0267 A[PHI: r8 r18
      0x0267: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v1 java.lang.String), (r8v1 java.lang.String), (r8v1 java.lang.String) binds: [B:70:0x0265, B:28:0x00ae, B:25:0x00a6, B:21:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r18v43 int) = (r18v20 int), (r18v40 int), (r18v42 int), (r18v44 int) binds: [B:70:0x0265, B:28:0x00ae, B:25:0x00a6, B:21:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0344 A[PHI: r3 r4 r18
      0x0344: PHI (r3v3 int) = (r3v2 int), (r3v1 int) binds: [B:88:0x032c, B:83:0x02fb] A[DONT_GENERATE, DONT_INLINE]
      0x0344: PHI (r4v3 int) = (r4v2 int), (r4v1 int) binds: [B:88:0x032c, B:83:0x02fb] A[DONT_GENERATE, DONT_INLINE]
      0x0344: PHI (r18v16 int) = (r18v14 int), (r18v17 int) binds: [B:88:0x032c, B:83:0x02fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0366 A[PHI: r2 r13 r18
      0x0366: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v1 java.lang.String) binds: [B:92:0x0364, B:49:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r13v2 l.ۚܽۚ) = (r13v1 l.ۚܽۚ), (r13v4 l.ۚܽۚ) binds: [B:92:0x0364, B:49:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r18v29 int) = (r18v13 int), (r18v30 int) binds: [B:92:0x0364, B:49:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final List m27910(ArrayList arrayList) {
        int i;
        int iM55680;
        int i2;
        int i3;
        int i4;
        InterfaceC7568 interfaceC7568 = null;
        String strM55650 = null;
        int i5 = 0;
        int i6 = 0;
        ArrayList arrayList2 = null;
        Iterator itM56292 = null;
        InterfaceC7568 interfaceC7569 = null;
        String strM55651 = null;
        String strMo5853 = null;
        C13929 c13929M54476 = null;
        C13929 c13929M54477 = null;
        Iterator itM56293 = null;
        InterfaceC7568 interfaceC75610 = null;
        String strMo5854 = null;
        int i7 = -1420795189;
        int i8 = C1964.f83032;
        int i9 = AbstractC0942.f81890;
        int iM55979 = (C0946.m55979("᩻᩶") + i9) * (-81);
        int i10 = ((iM55979 ^ i8) * 9283) ^ 1626142069;
        int i11 = iM55979 ^ 1959048149;
        Iterator itM56090 = null;
        while (true) {
            int i12 = i11 ^ (i10 & (((i7 ^ i8) * (-21341)) >> 31));
            switch (i12) {
                case -2139754027:
                case 618223801:
                    i = i12;
                    strMo5854 = interfaceC75610.mo5853();
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0873.m55680("ۖۗ") ^ i9;
                        i2 = ((iM55680 ^ i8) * 11805) ^ (-89098334);
                        i3 = -464724778;
                    } else {
                        iM55680 = C0873.m55680("ܿ᩸") ^ i8;
                        i2 = ((iM55680 ^ i9) * 24843) ^ (-1095507120);
                        i3 = 139934589;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -2123925041:
                case -1646419713:
                    i = i12;
                    if (C0989.m56097(interfaceC7568.mo5853(), i5) != i6) {
                        iM55680 = (C0946.m55979("֫᩺") + i8) * (-69);
                        i2 = ((iM55680 ^ i9) * (-183)) ^ (-1086197549);
                        i3 = 1552126299;
                    } else {
                        iM55680 = (C0873.m55680("۬ۡ") ^ i8) * (-71);
                        i2 = ((iM55680 ^ i9) * (-19779)) ^ (-1572805635);
                        i3 = 1778980955;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -2110575292:
                case 1047602276:
                    i = i12;
                    c13929M54476.m56473reset((CharSequence) C0930.m55894(interfaceC75610));
                    if (c13929M54476.matches()) {
                        iM55680 = C0946.m55979("ۙ֡") ^ i9;
                        i2 = ((iM55680 ^ i8) * 20035) ^ 1581493768;
                        i3 = -319269722;
                        i4 = i;
                        i11 = iM55680 ^ i3;
                        i10 = i2;
                        i7 = i4;
                    }
                    int iM559710 = (i9 - C0946.m55979("ۛۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i10 = ((iM559710 ^ i8) * 30893) ^ 2145919512;
                    i4 = i;
                    i11 = iM559710 ^ (-155739293);
                    i7 = i4;
                    break;
                case -1934793098:
                case -1480634602:
                    i = i12;
                    strM55651 = C0866.m55650(interfaceC7569);
                    if (C0955.m56025()) {
                        iM55680 = (C0946.m55979("ۖۘ") + i8) * 69;
                        i2 = ((iM55680 ^ i9) * (-15447)) ^ (-846714325);
                        i3 = -552074077;
                    } else {
                        iM55680 = C0873.m55680("ۙ۟") ^ i8;
                        i2 = ((iM55680 ^ i9) * (-31369)) ^ (-766253821);
                        i3 = 75155211;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1817305603:
                case 1929303539:
                    if (C0937.f81884) {
                        i = i12;
                        iM55680 = C0873.m55680("ۖۗ") ^ i9;
                        i2 = ((iM55680 ^ i8) * 11805) ^ (-89098334);
                        i3 = -464724778;
                    } else {
                        iM55680 = C0946.m55979("ۚ۫") ^ i8;
                        i = i12;
                        i2 = ((iM55680 ^ i9) * 25555) ^ 48748882;
                        i3 = 1978854548;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1728547341:
                case 429069932:
                    i = i12;
                    if (C0866.m55647(itM56292)) {
                        iM55680 = C0946.m55979("᩶᩻") ^ i9;
                        i2 = ((iM55680 ^ i8) * 30419) ^ 301352300;
                        i3 = -344519730;
                    } else {
                        iM55680 = (i8 - C0873.m55680("֨ܽ")) * 91;
                        i2 = ((iM55680 ^ i9) * 28791) ^ 1560109727;
                        i3 = 1064198581;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1686052380:
                case 1035257479:
                    i = i12;
                    c13929M54477.m56473reset((CharSequence) strMo5854);
                    if (c13929M54477.matches()) {
                        iM55680 = C0873.m55680("ۗ᩸") ^ i8;
                        i2 = ((iM55680 ^ i9) * (-26851)) ^ 2009471201;
                        i3 = 927553737;
                        i4 = i;
                        i11 = iM55680 ^ i3;
                        i10 = i2;
                        i7 = i4;
                    }
                    int iM559711 = (i9 - C0946.m55979("ۛۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i10 = ((iM559711 ^ i8) * 30893) ^ 2145919512;
                    i4 = i;
                    i11 = iM559711 ^ (-155739293);
                    i7 = i4;
                    break;
                case -1634366242:
                case 1203048702:
                    i = i12;
                    if (C1046.m56300(strMo5853, i5) == i6) {
                        iM55680 = C0873.m55680("ۙܶ") ^ i9;
                        i2 = ((iM55680 ^ i8) * 1953) ^ (-1369961724);
                        i3 = 1493738654;
                    } else {
                        iM55680 = (C0873.m55680("᩶᩷") + i8) * 71;
                        i2 = ((iM55680 ^ i9) * 14877) ^ (-1951632225);
                        i3 = -1794612776;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1603984293:
                case 1877138410:
                    i = i12;
                    strM55650 = C0866.m55650(interfaceC7568);
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (C0946.m55979("ۡܺ") ^ i8) * (-13);
                        i2 = ((iM55680 ^ i9) * (-4791)) ^ 1501695737;
                        i3 = 1622799626;
                    } else {
                        iM55680 = (C0946.m55979("ۨ֫") + i9) * (-7);
                        i2 = ((iM55680 ^ i8) * 23977) ^ (-1719523155);
                        i3 = -523962912;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1570029272:
                case 1004969525:
                    i = i12;
                    if (C1017.m56195(arrayList)) {
                        iM55680 = (i9 - C0946.m55979("᩺ۢ")) * (-119);
                        i2 = ((iM55680 ^ i8) * (-7043)) ^ 1632809557;
                        i3 = -1452691289;
                    } else {
                        iM55680 = (C0873.m55680("۫ۢ") ^ i8) * 97;
                        i2 = ((iM55680 ^ i9) * (-12921)) ^ (-1491437140);
                        i3 = 1834358835;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1409130815:
                case -432486377:
                    i = i12;
                    if (C0967.m56074()) {
                        iM55680 = (C0873.m55680("۠᩶") ^ i9) * (-103);
                        i2 = ((iM55680 ^ i8) * (-1821)) ^ (-1456950581);
                        i3 = 859027423;
                    } else {
                        iM55680 = C0873.m55680("ܿ۠") ^ i8;
                        i2 = ((iM55680 ^ i9) * (-31455)) ^ (-276467167);
                        i3 = 15225075;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1293514348:
                case 604215563:
                    i = i12;
                    C1046.m56302();
                    if (C0947.f81895) {
                        iM55680 = (C0946.m55979("᩹۬") ^ i8) * 37;
                        i2 = ((iM55680 ^ i9) * 23609) ^ 261174051;
                        i3 = -1972195278;
                    } else {
                        iM55680 = (C0946.m55979("ۛۚ") + i8) * (-121);
                        i2 = ((iM55680 ^ i9) * 4017) ^ 1569387326;
                        i3 = 1321759476;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1230491811:
                case -1169030451:
                    i = i12;
                    C1194.m56393(arrayList2, interfaceC75610);
                    int iM559712 = (i9 - C0946.m55979("ۛۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i10 = ((iM559712 ^ i8) * 30893) ^ 2145919512;
                    i4 = i;
                    i11 = iM559712 ^ (-155739293);
                    i7 = i4;
                    break;
                case -1109472632:
                case -494922469:
                    i = i12;
                    interfaceC7569 = (InterfaceC7568) C0955.m56035(itM56292);
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0873.m55680("۠᩶") ^ i9) * (-103);
                        i2 = ((iM55680 ^ i8) * (-1821)) ^ (-1456950581);
                        i3 = 859027423;
                    } else {
                        iM55680 = C0873.m55680("֫᩷") ^ i9;
                        i2 = ((iM55680 ^ i8) * 4453) ^ 575517084;
                        i3 = -637066279;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1038684408:
                case -790577488:
                    i = i12;
                    interfaceC7568 = (InterfaceC7568) RunnableC0897.m55785(itM56090);
                    if (RunnableC1014.m56177()) {
                        iM55680 = (C0873.m55680("ܺ᩺") + i8) * (-11);
                        i2 = ((iM55680 ^ i9) * 12931) ^ 2078419973;
                        i3 = 257348836;
                    } else {
                        iM55680 = (C0873.m55680("֨۫") + i9) * 67;
                        i2 = ((iM55680 ^ i8) * (-25049)) ^ (-881890951);
                        i3 = 1031626543;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -914195398:
                case -674994631:
                    C0967.m56074();
                    C1404.m56468();
                    return null;
                case -744385447:
                case 262336608:
                    i = i12;
                    C0937.m55917(arrayList2, interfaceC7569);
                    iM55680 = (i9 - C0873.m55680("ᩳ۫")) * 23;
                    i2 = ((iM55680 ^ i8) * 32327) ^ (-1651040211);
                    i3 = 1374744238;
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -645989213:
                case 622540669:
                    i = i12;
                    ArrayList arrayList3 = new ArrayList();
                    itM56292 = C1046.m56292(arrayList);
                    arrayList2 = arrayList3;
                    iM55680 = (i9 - C0873.m55680("ᩳ۫")) * 23;
                    i2 = ((iM55680 ^ i8) * 32327) ^ (-1651040211);
                    i3 = 1374744238;
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -562805004:
                case 2100132497:
                    i = i12;
                    if (C0930.m55886(itM56293)) {
                        iM55680 = C0946.m55979("ܿ᩺") ^ i8;
                        i2 = ((iM55680 ^ i9) * (-24431)) ^ 2126289228;
                        i3 = 449200234;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ᩳ۫")) * 23;
                        i2 = ((iM55680 ^ i8) * 32327) ^ (-1651040211);
                        i3 = 1374744238;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -533556363:
                case 791002514:
                    i = i12;
                    interfaceC75610 = (InterfaceC7568) RunnableC0897.m55785(itM56293);
                    if (RunnableC0871.m55672() >= 0) {
                        iM55680 = (C0946.m55979("ۡܺ") ^ i8) * (-13);
                        i2 = ((iM55680 ^ i9) * (-4791)) ^ 1501695737;
                        i3 = 1622799626;
                    } else {
                        iM55680 = (C0873.m55680("۬֫") + i9) * (-43);
                        i2 = ((iM55680 ^ i8) * 9359) ^ 1954879979;
                        i3 = 1441644243;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -503833114:
                case 1100276982:
                    i = i12;
                    i5 = 42;
                    i6 = -1;
                    if (C0989.m56097(strM55650, 42) == -1) {
                        iM55680 = C0946.m55979("᩹ᩴ") ^ i8;
                        i2 = ((iM55680 ^ i9) * (-25825)) ^ (-1727702827);
                        i3 = -1266208713;
                    } else {
                        iM55680 = (C0946.m55979("֫᩺") + i8) * (-69);
                        i2 = ((iM55680 ^ i9) * (-183)) ^ (-1086197549);
                        i3 = 1552126299;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -154349113:
                case 1861954131:
                    i = i12;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("᩹۬") ^ i8) * 37;
                        i2 = ((iM55680 ^ i9) * 23609) ^ 261174051;
                        i3 = -1972195278;
                    } else {
                        iM55680 = (C0873.m55680("ۘ۬") ^ i9) * (-39);
                        i2 = ((iM55680 ^ i8) * (-12357)) ^ 1684040041;
                        i3 = 1852202455;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 33854995:
                case 306241618:
                    i = i12;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("ۛۚ") + i8) * (-121);
                        i2 = ((iM55680 ^ i9) * 4017) ^ 1569387326;
                        i3 = 1321759476;
                    } else {
                        iM55680 = (C0946.m55979("ۖۘ") + i8) * 69;
                        i2 = ((iM55680 ^ i9) * (-15447)) ^ (-846714325);
                        i3 = -552074077;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 44740779:
                case 1457115959:
                    i = i12;
                    if (AbstractC24797.m54477(interfaceC7569, interfaceC75610)) {
                        iM55680 = (i9 - C0873.m55680("ۢ᩷")) * (-97);
                        i2 = ((iM55680 ^ i8) * 1767) ^ 299542359;
                        i3 = -1417063850;
                        i4 = i;
                        i11 = iM55680 ^ i3;
                        i10 = i2;
                        i7 = i4;
                    }
                    int iM559713 = (i9 - C0946.m55979("ۛۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i10 = ((iM559713 ^ i8) * 30893) ^ 2145919512;
                    i4 = i;
                    i11 = iM559713 ^ (-155739293);
                    i7 = i4;
                    break;
                case 252875975:
                case 654422683:
                    i = i12;
                    if (C0845.m55584() > 0) {
                        iM55680 = (C0946.m55979("ۖۘ") + i8) * 69;
                        i2 = ((iM55680 ^ i9) * (-15447)) ^ (-846714325);
                        i3 = -552074077;
                    } else {
                        iM55680 = (C0873.m55680("۠᩶") ^ i9) * (-103);
                        i2 = ((iM55680 ^ i8) * (-1821)) ^ (-1456950581);
                        i3 = 859027423;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 256336711:
                case 832117454:
                    i = i12;
                    strMo5853 = interfaceC7569.mo5853();
                    if (C0989.m56097(strM55651, i5) == i6) {
                        iM55680 = C0873.m55680("֡ۘ") ^ i8;
                        i2 = ((iM55680 ^ i9) * (-6619)) ^ 811106771;
                        i3 = -1418313878;
                    } else {
                        iM55680 = (C0873.m55680("᩶᩷") + i8) * 71;
                        i2 = ((iM55680 ^ i9) * 14877) ^ (-1951632225);
                        i3 = -1794612776;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 290567572:
                case 1065687889:
                    return arrayList;
                case 324228744:
                case 601101092:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("ۚ۫") ^ i8;
                        i = i12;
                        i2 = ((iM55680 ^ i9) * 25555) ^ 48748882;
                        i3 = 1978854548;
                    } else {
                        i = i12;
                        iM55680 = (C0873.m55680("֨۫") + i9) * 67;
                        i2 = ((iM55680 ^ i8) * (-25049)) ^ (-881890951);
                        i3 = 1031626543;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 382616529:
                case 1741095229:
                    i = i12;
                    if (C0930.m55886(itM56090)) {
                        iM55680 = C0946.m55979("ۚۢ") ^ i9;
                        i2 = ((iM55680 ^ i8) * 14963) ^ 612017728;
                        i3 = -1799570493;
                    } else {
                        iM55680 = (i9 - C0946.m55979("᩺ۢ")) * (-119);
                        i2 = ((iM55680 ^ i8) * (-7043)) ^ 1632809557;
                        i3 = -1452691289;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 404548111:
                case 698576623:
                    return arrayList2;
                case 687726331:
                case 1500763610:
                    i = i12;
                    ViewOnClickListenerC0939.m55941();
                    iM55680 = (C0946.m55979("ۛۚ") + i8) * (-121);
                    i2 = ((iM55680 ^ i9) * 4017) ^ 1569387326;
                    i3 = 1321759476;
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 889958801:
                case 1589638065:
                    i = i12;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("ۛۚ") + i8) * (-121);
                        i2 = ((iM55680 ^ i9) * 4017) ^ 1569387326;
                        i3 = 1321759476;
                    } else {
                        iM55680 = C0946.m55979("۠᩸") ^ i9;
                        i2 = ((iM55680 ^ i8) * (-6577)) ^ (-1224315620);
                        i3 = 944851528;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 1050254330:
                case 1125798146:
                    i = i12;
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0946.m55979("ۖۘ") + i8) * 69;
                        i2 = ((iM55680 ^ i9) * (-15447)) ^ (-846714325);
                        i3 = -552074077;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۙ") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM55680 ^ i8) * (-27119)) ^ (-586653776);
                        i3 = -551220396;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 1074868518:
                case 1925273879:
                    i = i12;
                    if (C1036.f81953 < 0) {
                        iM55680 = (C0873.m55680("᩵ۙ") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM55680 ^ i8) * (-27119)) ^ (-586653776);
                        i3 = -551220396;
                    } else {
                        iM55680 = C0873.m55680("ۖۗ") ^ i9;
                        i2 = ((iM55680 ^ i8) * 11805) ^ (-89098334);
                        i3 = -464724778;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 1088553176:
                case 1743364516:
                    i = i12;
                    c13929M54476 = AbstractC24797.m54476(strM55651);
                    c13929M54477 = AbstractC24797.m54476(strMo5853);
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0946.m55979("ۛۚ") + i8) * (-121);
                        i2 = ((iM55680 ^ i9) * 4017) ^ 1569387326;
                        i3 = 1321759476;
                    } else {
                        iM55680 = C0946.m55979("۠ܳ") ^ i9;
                        i2 = ((iM55680 ^ i8) * 28689) ^ (-1574172789);
                        i3 = 975841948;
                    }
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 1669891748:
                case 1820358988:
                    i = i12;
                    itM56293 = C1046.m56292(this.f33795);
                    int iM559714 = (i9 - C0946.m55979("ۛۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i10 = ((iM559714 ^ i8) * 30893) ^ 2145919512;
                    i4 = i;
                    i11 = iM559714 ^ (-155739293);
                    i7 = i4;
                    break;
                default:
                    i = i12;
                    itM56090 = C0989.m56090(arrayList);
                    iM55680 = (C0873.m55680("۬ۡ") ^ i8) * (-71);
                    i2 = ((iM55680 ^ i9) * (-19779)) ^ (-1572805635);
                    i3 = 1778980955;
                    i4 = i;
                    i11 = iM55680 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x02e7 A[PHI: r7 r16 r17
      0x02e7: PHI (r7v2 short) = (r7v1 short), (r7v5 short) binds: [B:76:0x02e5, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r16v31 l.ۤۤᩳ) = (r16v12 l.ۤۤᩳ), (r16v33 l.ۤۤᩳ) binds: [B:76:0x02e5, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r17v25 java.lang.Exception) = (r17v6 java.lang.Exception), (r17v28 java.lang.Exception) binds: [B:76:0x02e5, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x031f A[PHI: r8 r9 r16 r17
      0x031f: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:80:0x031d, B:67:0x0279, B:18:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x031f: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:80:0x031d, B:67:0x0279, B:18:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x031f: PHI (r16v21 l.ۤۤᩳ) = (r16v11 l.ۤۤᩳ), (r16v14 l.ۤۤᩳ), (r16v22 l.ۤۤᩳ) binds: [B:80:0x031d, B:67:0x0279, B:18:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x031f: PHI (r17v15 java.lang.Exception) = (r17v5 java.lang.Exception), (r17v8 java.lang.Exception), (r17v16 java.lang.Exception) binds: [B:80:0x031d, B:67:0x0279, B:18:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x03ae A[PHI: r16 r17
      0x03ae: PHI (r16v27 l.ۤۤᩳ) = (r16v8 l.ۤۤᩳ), (r16v10 l.ۤۤᩳ), (r16v30 l.ۤۤᩳ) binds: [B:92:0x03ac, B:84:0x0353, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x03ae: PHI (r17v21 java.lang.Exception) = (r17v2 java.lang.Exception), (r17v4 java.lang.Exception), (r17v24 java.lang.Exception) binds: [B:92:0x03ac, B:84:0x0353, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (p067l.C0866.m55645() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        r17 = r0;
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (p067l.RunnableC0897.f81856 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (p067l.C0949.f81897 >= 0) goto L18;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m27896(C12094 c12094, C18107 c18107, DialogInterfaceC2564 dialogInterfaceC2564, final C0990 c0990, String str, final C0990 c0991) {
        int iM55979;
        int i;
        int iM559710;
        int i2;
        int i3;
        Exception exc;
        int iM559711;
        int i4;
        int i5;
        int iM55680;
        int i6;
        int i7;
        final C12094 c12095 = c12094;
        final ArrayList arrayList = null;
        ArrayList arrayListM27903 = null;
        int iM559712 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1595998839;
        int i12 = C0912.f81867;
        int i13 = AbstractC0942.f81890;
        int iM55681 = C0873.m55680("ۗ۬") ^ i13;
        int i14 = ((iM55681 ^ i12) * 11083) ^ (-731619831);
        int i15 = iM55681 ^ 1565465473;
        C12096 c12096 = null;
        Exception exc2 = null;
        Object obj = null;
        while (true) {
            i11 = ((((i11 ^ i12) * (-20657)) >> 31) & i14) ^ i15;
            switch (i11) {
                case -2026486275:
                case -1177962382:
                    exc2 = exc2;
                    c12096 = c12096;
                    if (C1071.f81975 <= 0) {
                        iM559710 = C0946.m55979("ۛۡ") ^ i13;
                        i2 = ((iM559710 ^ i12) * 3745) ^ (-2076359659);
                        i3 = -1965623435;
                    } else {
                        iM559710 = (C0946.m55979("᩹ۜ") + i13) * (-121);
                        i2 = ((iM559710 ^ i12) * 23097) ^ (-1016503559);
                        i3 = 1421293276;
                    }
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case -1982189639:
                case 951797720:
                    exc2 = exc2;
                    c12096 = c12096;
                    int i16 = 5602689 + i9;
                    if ((i16 + i16) - i8 < 0) {
                        iM559710 = (C0946.m55979("ۖ᩺") ^ i12) * 19;
                        i2 = ((iM559710 ^ i13) * 3979) ^ (-223970255);
                        i3 = 1277092722;
                    } else {
                        iM559710 = C0873.m55680("ᩳۜ") ^ i12;
                        i2 = ((iM559710 ^ i13) * 5841) ^ (-1539381742);
                        i3 = 2019962182;
                    }
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case -1962115617:
                case 680869101:
                    exc2 = exc2;
                    c12096 = c12096;
                    if (C1404.m56468()) {
                        iM559710 = (C0873.m55680("֫᩷") + i12) * 13;
                        i2 = ((iM559710 ^ i13) * (-22849)) ^ (-1389657230);
                        i3 = -929115470;
                    } else {
                        iM559710 = C0873.m55680("ۗۤ") ^ i13;
                        i2 = ((iM559710 ^ i12) * 24481) ^ (-1539813189);
                        i3 = 1486780051;
                    }
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case -1960304903:
                case 471343581:
                    C1025.m56230();
                    break;
                case -1901180647:
                case 661864504:
                    exc2 = exc2;
                    c12096 = c12096;
                    if (C0845.f81821 >= 0) {
                        iM559710 = C0946.m55979("᩹ܿ") ^ i12;
                        i2 = ((iM559710 ^ i13) * 1259) ^ (-1489520353);
                        i3 = 1607582127;
                    } else {
                        iM559710 = (i12 - C0946.m55979("ۖ֡")) * (-49);
                        i2 = ((iM559710 ^ i13) * 6687) ^ 360451470;
                        i3 = -1923489384;
                    }
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case -1866384655:
                case -148414830:
                    if (!C0992.m56108(arrayListM27903)) {
                        exc2 = exc2;
                        arrayList = arrayListM27903;
                        int iM55682 = C0873.m55680("ۢܰ") ^ i13;
                        i15 = iM55682 ^ (-1663417946);
                        i14 = ((iM55682 ^ i12) * 13137) ^ 1945969663;
                        exc2 = exc2;
                        c12095 = c12094;
                    } else {
                        iM55979 = C0946.m55979("ᩳᩳ") ^ i13;
                        i14 = ((iM55979 ^ i12) * 27057) ^ 386354112;
                        i = 1691914546;
                        i15 = iM55979 ^ i;
                    }
                    break;
                case -1855317718:
                case -1749178810:
                    try {
                        arrayListM27903 = m27903(C0863.m55639(C1404.m56467(c12096)));
                        iM55680 = (C0946.m55979("ۡ᩹") + i12) * (-27);
                        exc = exc2;
                        i6 = ((iM55680 ^ i13) * 5353) ^ (-844878604);
                        i7 = 782684270;
                    } catch (Exception e) {
                        iM55680 = C0873.m55680("ۧܺ") ^ i13;
                        exc = e;
                        i6 = ((iM55680 ^ i12) * (-6499)) ^ 739947350;
                        i7 = -391969191;
                    }
                    i14 = i6;
                    i15 = iM55680 ^ i7;
                    exc2 = exc;
                    break;
                case -1842260625:
                case -739987884:
                    C11896.m27214(new InterfaceC14577(c12095) { // from class: l.᩸ۤܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C12094 f71895;

                        @Override // p067l.InterfaceC14577
                        public final /* synthetic */ void onCanceled() {
                        }

                        /* JADX WARN: Code duplicated, block: B:36:0x00b1 A[PHI: r8
                          0x00b1: PHI (r8v2 l.ۗۘ) = (r8v1 l.ۗۘ), (r8v3 l.ۗۘ) binds: [B:35:0x00af, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:46:0x010d  */
                        /* JADX WARN: Code duplicated, block: B:50:0x013d  */
                        /* JADX WARN: Code duplicated, block: B:54:0x0167  */
                        /* JADX WARN: Code duplicated, block: B:58:0x0195  */
                        @Override // p067l.InterfaceC14577
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6049(C13457 c13457, boolean z) {
                            int iM55683;
                            int i17;
                            int i18 = 2094897838;
                            int i19 = C0992.f81922;
                            int i20 = C0863.f81833;
                            int iM559713 = (i19 - C0946.m55979("ۤۛ")) * (-125);
                            int i21 = ((iM559713 ^ i20) * 26837) ^ 677301759;
                            int i22 = iM559713 ^ 209725141;
                            C0990 c0992 = null;
                            while (true) {
                                i18 = i22 ^ ((((i18 ^ i20) * SecP192K1Field.PInv33) >> 31) & i21);
                                switch (i18) {
                                    case -2082020691:
                                    case 598637435:
                                        if (RunnableC0897.f81856) {
                                            iM55683 = C0946.m55979("۠ۢ") ^ i20;
                                            i21 = (-1925169453) ^ ((iM55683 ^ i19) * 14345);
                                            i17 = -1828812887;
                                        } else {
                                            iM55683 = C0873.m55680("֫֫") ^ i20;
                                            i21 = (-111109451) ^ ((iM55683 ^ i19) * (-22013));
                                            i17 = -1093906986;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -2042369615:
                                    case -1507345481:
                                        C1012.m56134();
                                        iM55683 = (C0946.m55979("᩵ܺ") + i19) * (-107);
                                        i21 = 1619235734 ^ ((iM55683 ^ i20) * 15631);
                                        i17 = -783914234;
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -2030265422:
                                    case 1070174563:
                                        if (C0892.f81851) {
                                            iM55683 = C0873.m55680("֫᩻") ^ i19;
                                            i21 = (-855817646) ^ ((iM55683 ^ i20) * 24273);
                                            i17 = -666576195;
                                        } else {
                                            iM55683 = C0873.m55680("֫֫") ^ i20;
                                            i21 = (-111109451) ^ ((iM55683 ^ i19) * (-22013));
                                            i17 = -1093906986;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -1997133793:
                                    case 628428188:
                                        if (RunnableC0897.f81856) {
                                            iM55683 = (C0946.m55979("᩵ۜ") + i20) * 61;
                                            i21 = 1646138836 ^ ((iM55683 ^ i19) * (-4555));
                                            i17 = -432512700;
                                        } else {
                                            iM55683 = (C0946.m55979("᩵ܺ") + i19) * (-107);
                                            i21 = 1619235734 ^ ((iM55683 ^ i20) * 15631);
                                            i17 = -783914234;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -1995110690:
                                    case 689194874:
                                        c0992 = c0990;
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55683 = C0873.m55680("۫۟") ^ i20;
                                            i21 = (-1181219180) ^ ((iM55683 ^ i19) * 13145);
                                            i17 = 1679386811;
                                        } else {
                                            iM55683 = C0946.m55979("ᩴ֫") ^ i20;
                                            i21 = (-447741817) ^ ((iM55683 ^ i19) * 14827);
                                            i17 = -2134141860;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -1978328918:
                                    case -741682958:
                                        if (C0894.f81854 >= 0) {
                                            iM55683 = C0873.m55680("۫۟") ^ i20;
                                            i21 = (-1181219180) ^ ((iM55683 ^ i19) * 13145);
                                            i17 = 1679386811;
                                        } else {
                                            iM55683 = C0946.m55979("۬۫") ^ i19;
                                            i21 = 4364234 ^ ((iM55683 ^ i20) * 16091);
                                            i17 = 229398831;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -1742475542:
                                    case -545322705:
                                        C12094.m27894(this.f71895, c0991, c0992, arrayList, c13457, z);
                                        break;
                                    case -1648826897:
                                    case 588704898:
                                        if (C1071.f81975 <= 0) {
                                            iM55683 = (C0946.m55979("֨ܶ") + i19) * 69;
                                            i21 = 1978779428 ^ ((iM55683 ^ i20) * (-24111));
                                            i17 = 701394026;
                                        } else {
                                            iM55683 = C0946.m55979("֨ܺ") ^ i19;
                                            i21 = (-547232126) ^ ((iM55683 ^ i20) * 31569);
                                            i17 = -764891647;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -1582642816:
                                    case 384591532:
                                        C0854.m55595();
                                        if (C0946.f81894 == 0) {
                                            iM55683 = (C0946.m55979("᩵ܺ") + i19) * (-107);
                                            i21 = 1619235734 ^ ((iM55683 ^ i20) * 15631);
                                            i17 = -783914234;
                                        } else {
                                            iM55683 = C0873.m55680("֫֫") ^ i20;
                                            i21 = (-111109451) ^ ((iM55683 ^ i19) * (-22013));
                                            i17 = -1093906986;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -871176409:
                                    case 2096297710:
                                        if (C0845.f81821 < 0) {
                                            iM55683 = (C0946.m55979("᩵ۜ") + i20) * 61;
                                            i21 = 1646138836 ^ ((iM55683 ^ i19) * (-4555));
                                            i17 = -432512700;
                                        } else {
                                            iM55683 = (C0946.m55979("֨ܶ") + i19) * 69;
                                            i21 = 1978779428 ^ ((iM55683 ^ i20) * (-24111));
                                            i17 = 701394026;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -827284748:
                                    case -811966181:
                                        if (C0930.m55885() <= 0) {
                                            iM55683 = (C0946.m55979("֨ܶ") + i19) * 69;
                                            i21 = 1978779428 ^ ((iM55683 ^ i20) * (-24111));
                                            i17 = 701394026;
                                        } else {
                                            iM55683 = C0873.m55680("᩺ᩴ") ^ i19;
                                            i21 = (-1943877995) ^ ((iM55683 ^ i20) * (-25239));
                                            i17 = 1849959527;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -536015456:
                                    case 676925456:
                                        if (C0912.f81867 <= 0) {
                                            iM55683 = (C0946.m55979("᩵ۜ") + i20) * 61;
                                            i21 = 1646138836 ^ ((iM55683 ^ i19) * (-4555));
                                            i17 = -432512700;
                                        } else {
                                            iM55683 = C0946.m55979("۫۠") ^ i20;
                                            i21 = (-2021215866) ^ ((iM55683 ^ i19) * (-6185));
                                            i17 = 856258403;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -200577730:
                                    case 1876154995:
                                        if (C0890.m55740()) {
                                            iM55683 = (C0873.m55680("֫۬") ^ i20) * (-91);
                                            i21 = (-987409155) ^ ((iM55683 ^ i19) * 15469);
                                            i17 = 118054050;
                                        } else {
                                            iM55683 = (C0946.m55979("᩵ܺ") + i19) * (-107);
                                            i21 = 1619235734 ^ ((iM55683 ^ i20) * 15631);
                                            i17 = -783914234;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    case -188201759:
                                    case 2103963263:
                                        C0937.m55918();
                                        ViewOnClickListenerC0939.m55941();
                                        break;
                                    case 736291127:
                                    case 1754172941:
                                        if (C1964.f83032 <= 0) {
                                            iM55683 = C0873.m55680("֫֫") ^ i20;
                                            i21 = (-111109451) ^ ((iM55683 ^ i19) * (-22013));
                                            i17 = -1093906986;
                                        } else {
                                            iM55683 = C0873.m55680("۠᩻") ^ i19;
                                            i21 = (-62068982) ^ ((iM55683 ^ i20) * (-26277));
                                            i17 = -994762479;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                    default:
                                        if (C0927.f81875) {
                                            iM55683 = (C0946.m55979("᩵ۜ") + i20) * 61;
                                            i21 = 1646138836 ^ ((iM55683 ^ i19) * (-4555));
                                            i17 = -432512700;
                                        } else {
                                            iM55683 = (C0946.m55979("֡ۢ") + i20) * 43;
                                            i21 = (-1807415207) ^ ((iM55683 ^ i19) * (-4855));
                                            i17 = -518907262;
                                        }
                                        i22 = i17 ^ iM55683;
                                        break;
                                }
                                return;
                            }
                        }

                        @Override // p067l.InterfaceC14577
                        /* JADX INFO: renamed from: ֫ */
                        public final /* synthetic */ boolean mo6050(Exception exc3) {
                            return false;
                        }

                        {
                            int i17 = -233007319;
                            int i18 = C0873.f81841;
                            int i19 = RunnableC0938.f81886;
                            int iM55683 = C0873.m55680("ܽۡ") ^ i19;
                            int i20 = ((iM55683 ^ i18) * 14893) ^ (-930066006);
                            int i21 = 1800968839;
                            while (true) {
                                i17 = ((((i17 ^ i18) * (-20785)) >> 31) & i20) ^ (iM55683 ^ i21);
                                switch (i17) {
                                    case -2025808489:
                                    case -1039299495:
                                        if (C1028.f81950 <= 0) {
                                            iM55683 = (C0873.m55680("ᩳ᩺") + i18) * (-29);
                                            i20 = ((iM55683 ^ i19) * 22875) ^ (-265616918);
                                            i21 = 318921793;
                                        } else {
                                            iM55683 = C0873.m55680("᩷ۨ") ^ i18;
                                            i20 = ((iM55683 ^ i19) * 31749) ^ 548660186;
                                            i21 = 142227408;
                                        }
                                        break;
                                    case -1941012564:
                                    case -1932555131:
                                        C0912.m55833();
                                        C0873.m55678();
                                        throw new RuntimeException();
                                    case -1927366952:
                                    case 1309534850:
                                        if (C1025.f81947 >= 0) {
                                            iM55683 = C0873.m55680("֨᩵") ^ i19;
                                            i20 = ((iM55683 ^ i18) * 7307) ^ (-1788357310);
                                            i21 = 489462370;
                                        } else {
                                            iM55683 = C0946.m55979("ۘ֡") ^ i19;
                                            i20 = ((iM55683 ^ i18) * 25215) ^ 1683969577;
                                            i21 = -1787445181;
                                        }
                                        break;
                                    case -1907355317:
                                    case -88366359:
                                        this.f71895 = c12095;
                                        if (AbstractC0942.m55971()) {
                                            iM55683 = (C0946.m55979("ܿᩳ") + i19) * (-39);
                                            i20 = ((iM55683 ^ i18) * 907) ^ (-1287560480);
                                            i21 = -1551603593;
                                        } else {
                                            iM55683 = (C0873.m55680("ۙ۟") + i18) * C0254q.f1218h;
                                            i20 = ((iM55683 ^ i19) * 31617) ^ (-1700842208);
                                            i21 = 1813310074;
                                        }
                                        break;
                                    case -1629781422:
                                    case 76990112:
                                        if (C0967.f81910 >= 0) {
                                            iM55683 = (i18 - C0873.m55680("ۧᩳ")) * 87;
                                            i20 = ((iM55683 ^ i19) * (-24269)) ^ (-585228447);
                                            i21 = 164025561;
                                        } else {
                                            iM55683 = C0873.m55680("᩻ۜ") ^ i18;
                                            i20 = ((iM55683 ^ i19) * (-26593)) ^ 584918121;
                                            i21 = 911908428;
                                        }
                                        break;
                                    case -1432920282:
                                    case -294958445:
                                        C0917.m55854();
                                        C0873.m55678();
                                        iM55683 = C0873.m55680("֨᩵") ^ i19;
                                        i20 = ((iM55683 ^ i18) * 7307) ^ (-1788357310);
                                        i21 = 489462370;
                                        break;
                                    case -985637532:
                                    case -713095128:
                                        if (C1053.m56327() >= 0) {
                                            iM55683 = (C0946.m55979("ܿᩳ") + i19) * (-39);
                                            i20 = ((iM55683 ^ i18) * 907) ^ (-1287560480);
                                            i21 = -1551603593;
                                        } else {
                                            iM55683 = (i18 - C0873.m55680("ۤ۫")) * (-71);
                                            i20 = ((iM55683 ^ i19) * 22111) ^ (-1574293379);
                                            i21 = -2065868303;
                                        }
                                        break;
                                    case -864304084:
                                    case 1388962759:
                                        if (C0930.f81879 <= 0) {
                                            iM55683 = C0873.m55680("֨᩵") ^ i19;
                                            i20 = ((iM55683 ^ i18) * 7307) ^ (-1788357310);
                                            i21 = 489462370;
                                        } else {
                                            iM55683 = C0946.m55979("ܳ᩻") ^ i19;
                                            i20 = ((iM55683 ^ i18) * 2087) ^ 735151992;
                                            i21 = 1748630147;
                                        }
                                        break;
                                    case -670480177:
                                    case 1590261594:
                                        C0861.m55626();
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM55683 = C0873.m55680("۠ۤ") ^ i18;
                                            i20 = ((iM55683 ^ i19) * (-28569)) ^ (-1150443338);
                                            i21 = 286183700;
                                        } else {
                                            iM55683 = C0873.m55680("֨᩵") ^ i19;
                                            i20 = ((iM55683 ^ i18) * 7307) ^ (-1788357310);
                                            i21 = 489462370;
                                        }
                                        break;
                                    case -410656968:
                                    case 1270800982:
                                        C0873.m55678();
                                        if (C0949.f81897 < 0) {
                                            iM55683 = (C0946.m55979("ܿᩳ") + i19) * (-39);
                                            i20 = ((iM55683 ^ i18) * 907) ^ (-1287560480);
                                            i21 = -1551603593;
                                        } else {
                                            iM55683 = (C0873.m55680("ᩳ᩺") + i18) * (-29);
                                            i20 = ((iM55683 ^ i19) * 22875) ^ (-265616918);
                                            i21 = 318921793;
                                        }
                                        break;
                                    case -103097343:
                                    case 1243252645:
                                        if (C1404.f82149 >= 0) {
                                            iM55683 = C0873.m55680("۠ۤ") ^ i18;
                                            i20 = ((iM55683 ^ i19) * (-28569)) ^ (-1150443338);
                                            i21 = 286183700;
                                        } else {
                                            iM55683 = C0946.m55979("᩷֨") ^ i19;
                                            i20 = ((iM55683 ^ i18) * (-19823)) ^ 111575096;
                                            i21 = 1968600547;
                                        }
                                        break;
                                    case 618347718:
                                    case 697298800:
                                        if (C1124.m56367() >= 0) {
                                            iM55683 = C0873.m55680("۠ۤ") ^ i18;
                                            i20 = ((iM55683 ^ i19) * (-28569)) ^ (-1150443338);
                                            i21 = 286183700;
                                        } else {
                                            iM55683 = C0873.m55680("ܽ᩸") ^ i19;
                                            i20 = ((iM55683 ^ i18) * (-32353)) ^ (-1488630811);
                                            i21 = 1419999381;
                                        }
                                        break;
                                    case 1472679761:
                                    case 1827228363:
                                        return;
                                    case 1576506614:
                                    case 1902475320:
                                        if (C0955.f81898) {
                                            iM55683 = (C0946.m55979("ܿᩳ") + i19) * (-39);
                                            i20 = ((iM55683 ^ i18) * 907) ^ (-1287560480);
                                            i21 = -1551603593;
                                        } else {
                                            iM55683 = C0873.m55680("֨ۡ") ^ i19;
                                            i20 = ((iM55683 ^ i18) * 30551) ^ (-1449576403);
                                            i21 = 379843716;
                                        }
                                        break;
                                    case 1705421049:
                                    case 1862828929:
                                        C0917.m55854();
                                        if (C1044.f81959 < 0) {
                                            iM55683 = (C0873.m55680("ᩳ᩺") + i18) * (-29);
                                            i20 = ((iM55683 ^ i19) * 22875) ^ (-265616918);
                                            i21 = 318921793;
                                        } else {
                                            iM55683 = C0873.m55680("֨᩵") ^ i19;
                                            i20 = ((iM55683 ^ i18) * 7307) ^ (-1788357310);
                                            i21 = 489462370;
                                        }
                                        break;
                                    default:
                                        if (C1124.f82007 >= 0) {
                                            iM55683 = (C0873.m55680("ᩳ᩺") + i18) * (-29);
                                            i20 = ((iM55683 ^ i19) * 22875) ^ (-265616918);
                                            i21 = 318921793;
                                        } else {
                                            iM55683 = C0946.m55979("ܺۛ") ^ i18;
                                            i20 = ((iM55683 ^ i19) * (-19781)) ^ 969776805;
                                            i21 = -676413569;
                                        }
                                        break;
                                }
                            }
                        }
                    }, C1964.m56594(c18107), str);
                    break;
                case -1721344763:
                case -571916605:
                    break;
                case -1641693897:
                case 1001376795:
                    i10 = 13718;
                    iM559710 = (C0873.m55680("֫ܰ") ^ i13) * 37;
                    i2 = ((iM559710 ^ i12) * (-4489)) ^ (-477557834);
                    i3 = -1695743452;
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case -1530346808:
                case 199577335:
                    exc2 = exc2;
                    c12096 = c12096;
                    if (C1964.f83032 <= 0) {
                        iM559710 = C0873.m55680("۠֨") ^ i12;
                        i2 = ((iM559710 ^ i13) * 17279) ^ (-246057088);
                        i3 = 2080516743;
                    } else {
                        iM559710 = (C0946.m55979("᩸ۧ") + i13) * (-3);
                        i2 = ((iM559710 ^ i12) * 12291) ^ 1791111532;
                        i3 = -2073611519;
                    }
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case -1106684695:
                case -598371157:
                    C1044.m56272(C1929.m56560(c18107), exc2, obj);
                    break;
                case -898624853:
                case 1196196413:
                    exc = exc2;
                    C0917.m55847(dialogInterfaceC2564);
                    if (c12095.f33803) {
                        iM559711 = (C0946.m55979("᩶ۤ") + i12) * (-75);
                        i4 = ((iM559711 ^ i13) * 17517) ^ 1326582075;
                        i5 = -986721220;
                    } else {
                        iM559711 = (i13 - C0946.m55979("۟۬")) * (-75);
                        i4 = ((iM559711 ^ i12) * 32141) ^ (-1359534615);
                        i5 = 1336724826;
                    }
                    i15 = iM559711 ^ i5;
                    i14 = i4;
                    c12096 = c12096;
                    exc2 = exc;
                    break;
                case -690640937:
                case 1330048168:
                    exc2 = exc2;
                    c12096 = c12096;
                    int i17 = s + 2367;
                    i8 = i17 * i17;
                    i9 = s * s;
                    if (C0898.f81858 <= 0) {
                        iM559710 = C0873.m55680("ۗۤ") ^ i13;
                        i2 = ((iM559710 ^ i12) * 24481) ^ (-1539813189);
                        i3 = 1486780051;
                    } else {
                        iM559710 = C0946.m55979("ۛ۬") ^ i13;
                        i2 = ((iM559710 ^ i12) * 15631) ^ (-206381925);
                        i3 = -546276533;
                    }
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case -595811440:
                case -506231916:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        exc2 = exc2;
                        c12096 = c12096;
                        iM559710 = C0946.m55979("᩹ܿ") ^ i12;
                        i2 = ((iM559710 ^ i13) * 1259) ^ (-1489520353);
                        i3 = 1607582127;
                        i15 = iM559710 ^ i3;
                        i14 = i2;
                        c12096 = c12096;
                        exc2 = exc2;
                        c12095 = c12094;
                    }
                    exc2 = exc2;
                    c12096 = c12096;
                    iM559710 = C0873.m55680("ܿ᩵") ^ i12;
                    i2 = ((iM559710 ^ i13) * 1115) ^ 618155219;
                    i3 = 224720120;
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case -451271831:
                case 16794550:
                    exc2 = exc2;
                    c12096 = c12096;
                    if (C0967.f81910 >= 0) {
                        iM559710 = C0873.m55680("᩹ۖ") ^ i13;
                        i2 = ((iM559710 ^ i12) * 4907) ^ (-1132988664);
                        i3 = -808457733;
                    } else {
                        iM559710 = (C0873.m55680("ۛᩴ") ^ i13) * (-103);
                        i2 = ((iM559710 ^ i12) * (-12287)) ^ 1958573407;
                        i3 = -1344499981;
                    }
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case -407863018:
                case 1637905880:
                    c12094.m27899(false, C0949.m56014(c0990), arrayList, null, false);
                    break;
                case -322649476:
                case 238298109:
                    C1048.m56305();
                    C0946.m55980();
                    break;
                case -240235094:
                case 477579674:
                    exc2 = exc2;
                    c12096 = c12095.f33801;
                    if (C0877.m55695(c12095.f33799)) {
                        int iM55683 = (i12 - C0873.m55680("۟ܶ")) * (-17);
                        i15 = iM55683 ^ (-399790955);
                        i14 = ((iM55683 ^ i13) * 5545) ^ 691285692;
                        exc2 = exc2;
                        obj = null;
                    } else {
                        arrayList = null;
                        obj = null;
                        int iM55684 = C0873.m55680("ۢܰ") ^ i13;
                        i15 = iM55684 ^ (-1663417946);
                        i14 = ((iM55684 ^ i12) * 13137) ^ 1945969663;
                        exc2 = exc2;
                        c12095 = c12094;
                    }
                    break;
                case -212782974:
                case 1142743970:
                    i10 = 30157;
                    iM559710 = (C0873.m55680("֫ܰ") ^ i13) * 37;
                    i2 = ((iM559710 ^ i12) * (-4489)) ^ (-477557834);
                    i3 = -1695743452;
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case -72277695:
                case 1399602422:
                    exc2 = exc2;
                    c12096 = c12096;
                    if (C1229.m56410() != 0) {
                        iM559710 = C0873.m55680("ܿ᩵") ^ i12;
                        i2 = ((iM559710 ^ i13) * 1115) ^ 618155219;
                        i3 = 224720120;
                    } else {
                        iM559710 = C0873.m55680("ܰ֨") ^ i13;
                        i2 = ((iM559710 ^ i12) * (-3401)) ^ 359900224;
                        i3 = 1310771753;
                    }
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case 27343981:
                case 1907397888:
                    C1024.m56202(2125106573 ^ iM559712);
                    C0927.m55877(c12096);
                    break;
                case 785801722:
                case 1070083035:
                    C1194.m56396();
                    break;
                case 846287057:
                case 1242955862:
                    iM559712 = C0946.m55979(C1044.m56276(f82125, 98, 3, i10));
                    if (C0890.f81849 == 0) {
                        iM55979 = C0946.m55979("᩷ۛ") ^ i12;
                        i14 = ((iM55979 ^ i13) * (-6771)) ^ 991373018;
                        i = 1114168509;
                        i15 = iM55979 ^ i;
                    } else {
                        exc2 = exc2;
                        c12096 = c12096;
                        iM559710 = C0873.m55680("۠֨") ^ i12;
                        i2 = ((iM559710 ^ i13) * 17279) ^ (-246057088);
                        i3 = 2080516743;
                        i15 = iM559710 ^ i3;
                        i14 = i2;
                        c12096 = c12096;
                        exc2 = exc2;
                        c12095 = c12094;
                    }
                    break;
                case 1320080506:
                case 1986830834:
                    C0937.m55918();
                    exc2 = exc2;
                    c12096 = c12096;
                    iM559710 = C0873.m55680("ۗۤ") ^ i13;
                    i2 = ((iM559710 ^ i12) * 24481) ^ (-1539813189);
                    i3 = 1486780051;
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                case 1623978877:
                case 2140253227:
                    exc2 = exc2;
                    c12096 = c12096;
                    if (C1124.f82007 >= 0) {
                        iM559710 = C0946.m55979("᩹ܿ") ^ i12;
                        i2 = ((iM559710 ^ i13) * 1259) ^ (-1489520353);
                        i3 = 1607582127;
                    } else {
                        iM559710 = C0946.m55979("ۚۤ") ^ i12;
                        i2 = ((iM559710 ^ i13) * (-8965)) ^ (-2053563152);
                        i3 = 1120551784;
                    }
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
                default:
                    exc2 = exc2;
                    c12096 = c12096;
                    s = f82125[97];
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM559710 = C0946.m55979("ۛۡ") ^ i13;
                        i2 = ((iM559710 ^ i12) * 3745) ^ (-2076359659);
                        i3 = -1965623435;
                    } else {
                        iM559710 = C0873.m55680("᩸ۙ") ^ i12;
                        i2 = ((iM559710 ^ i13) * (-19127)) ^ 1847623129;
                        i3 = -1793308894;
                    }
                    i15 = iM559710 ^ i3;
                    i14 = i2;
                    c12096 = c12096;
                    exc2 = exc2;
                    c12095 = c12094;
                    break;
            }
            return;
        }
    }
}
