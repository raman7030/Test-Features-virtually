package p067l;

import android.content.DialogInterface;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.p080ec.rfc8032.Ed448;

/* JADX INFO: renamed from: l.ܽ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C18402 extends AbstractViewOnClickListenerC14239 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final C6724 f54940;

    /* JADX INFO: renamed from: ۟ */
    public static final HashSet f54941;

    /* JADX INFO: renamed from: ۠۫֫, reason: not valid java name and contains not printable characters */
    private static final short[] f82272 = {2114, -19690, -19711, -9757, 9461, -14878, -19696, -19701, -19701, -19704, -19639, -19690, -19711, -19705, -19683, -19705, -19704, -19711, -19639, -19706, -19699, -19702, -19692, -19696, -9387, -16089, 8594, -19696, -19701, -19701, -19704, -19639, -19707, -19692, -19692, -19639, -19692, -19690, -19701, -19696, -19711, -19705, -19696, -19692, -19703, -619, 10761, -12466, -19696, -19701, -19701, -19704, -19639, -19692, -19704, -19695, -19709, -19699, -19702, -19639, -19703, -19707, -19702, -19707, -19709, -19711, -19690, -19703, 10753, -14361, -5630, -19696, -19701, -19701, -19704, -19639, -19690, -19711, -19703, -19701, -19696, -19711, -19639, -19703, -19707, -19702, -19707, -19709, -19711, -19705, -19701, 8792, 11666, -12093, -19696, -19701, -19701, -19704, -19639, -19705, -19701, -19704, -19701, -19690, -19639, -19692, -19699, -19705, -19697, -19711, -19690, -19689, -19697, -570, -8226, -5708, -19696, -19701, -19701, -19704, -19639, -19689, -19699, -19709, -19702, -19707, -19696, -19695, -19690, -19711, -19639, -19697, -19711, -19683, -19705, -19692, 16140, -8429, 10363, -19696, -19701, -19701, -19704, -19639, -19705, -19701, -19703, -19703, -19701, -19702, -19639, -19692, -19707, -19689, -19689, -19693, -19701, -19690, -19712, -19689, -19696, -19695, 11148, -4346, -16103, -19696, -19701, -19701, -19704, -19639, -19696, -19695, -19696, -19701, -19690, -19699, -19707, -19704, -19711, -19707, 11234, 9863, 10087, -19696, -19701, -19701, -19704, -19639, -19711, -19684, -19696, -19690, -19707, -19705, -19696, -19639, -19707, -19692, -19697, -19696, -19684, 12276, -4459, 16340, -19696, -19701, -19701, -19704, -19639, -19696, -19711, -19684, -19696, -19639, -19711, -19712, -19699, -19696, -19701, -19690, -19703, -19692, 14205, -7046, 14836, -19696, -19701, -19701, -19704, -19639, -19703, -19695, -19689, -19699, -19705, -19639, -19692, -19704, -19707, -19683, -19711, -19690, -19689, -19692, -12981, -7303, -14439, -19696, -19701, -19701, -19704, -19639, -19689, -19696, -19690, -19711, -19707, -19703, -19639, -19703, -19711, -19712, -19699, -19707, -19696, -19711, -16377, 14256, -15360, -19696, -19701, -19701, -19704, -19639, -19696, -19711, -19690, -19703, -19699, -19702, -19707, -19704, -19703, -19705, 9415, -14835, 8759, -19696, -19701, -19701, -19704, -19639, -19707, -19692, -19697, -19639, -19703, -19705, -19692, -19707, -19690, 10641, -836, 14232, -19696, -19701, -19701, -19704, -19639, -19707, -19705, -19696, -19699, -19694, -19699, -19696, -19683, -19639, -19690, -19711, -19705, -19701, -19690, -19712, -19689, -19691, 9891, -7059, -13438, -19696, -19701, -19701, -19704, -19639, -19689, -19703, -19707, -19704, -19699, -19639, -19691, -19695, -19711, -19690, -19683, -19690, -19692, 11079, -7304, 9469, -19696, -19701, -19701, -19704, -19639, -19690, -19711, -19703, -19701, -19696, -19711, -19639, -19692, -19707, -19683, -19704, -19701, -19707, -19712, 74, -31025, -27151, 23839, 6668, -11299, -11307, -11314, -11314, -11315, -11310, -11266, -11319, -11320, -11323, -11323, -11324, -11313, -11316, -11314, 5229, -6289, -6297, -6276, -6276, -6273, -6304, -6324, -6277, -6278, -6281, -6281, -6282, -6275, 5316, 12309, -3439, 11656, -23390, -23392, -14284, -9247, -10637, -968, -147, -645, 14375, -3884, 8622, 7956, -30541, 22879, -21323, -19865, 20209, -23080, 21526, -16875, 20776, -29547, 17331, 20056, -24043, 23343, -30691, -29033, -32433, -18627, -20261, 19429, 18530, 22864, 19998, -19163, -31430, 20532, 23163, -23720, -31320, -25832, 2678, -23500, -17787, 23332, 17231, 25507, -17126, -22471, -23931, 19398, -21829, 25775, 27234, -20617, 16840, -21289, 7991, 27248, 27243, 27243, 27240, 27255, 27227, 27255, 27243, 27254, 27248, 27224, 27256, 387, 15204, 15206, 15227, 15200, 15217, 15223, 15200, 15160, 15200, 15201, 15200, 15227, 15206, 15229, 15221, 15224, 15221, 15216, 15221, 15216, 15179, 15228, 15229, 15216, 15217, 15179, 15227, 15222, 15230, 15207, 15228, 15227, 15203, 15179, 15221, 15216, 15179, 15229, 15226, 15179, 15200, 15227, 15227, 15224, 15207, 15225, 15227, 9469, -28583, -28581, 9350, 833, 841, 850, 850, 849, 846, 866, 846, 850, 847, 841, 7245, -30899, -30890, -30890, -30891, -30902, -30874, -30895, -30896, -30883, -30883, -30884, -30889, -30875, -30907, -30886, -30890, -30907, -30902, -30894, -30907, -30886, -30903, -30907, -30892, -30903, -30907, -30902, -30903, -30907, -30902, -30904, -30907, -30901, -30903, 5282, 16428, -23911, 25125, 23881, 17549, 17134, 17733, 18325, -18313, 7426, -20335, 28990, 24798, 18647, 29133, 26877, 1941, -9129, -10495, 2222};

    /* JADX INFO: renamed from: ۧ֫ */
    public static boolean f54942;

    /* JADX INFO: renamed from: ܰ */
    public static final LinkedHashMap f54943;

    /* JADX INFO: renamed from: ܽ֫ */
    public static boolean f54944;

    /* JADX INFO: renamed from: ᩺ */
    public static final /* synthetic */ int f54945 = 0;

    /* JADX INFO: renamed from: ۛ */
    public final C13596 f54946;

    /* JADX INFO: renamed from: ۤ */
    public final C13596 f54947;

    /* JADX INFO: renamed from: ۨ */
    public final C24497 f54948;

    /* JADX WARN: Code duplicated, block: B:34:0x00d8 A[PHI: r10 r11 r12
      0x00d8: PHI (r10v3 short[]) = (r10v2 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:33:0x00d6, B:29:0x00b8, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:33:0x00d6, B:29:0x00b8, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:33:0x00d6, B:29:0x00b8, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x019c A[PHI: r5 r6 r7 r8
      0x019c: PHI (r5v2 int) = (r5v1 int), (r5v1 int), (r5v5 int) binds: [B:48:0x0182, B:44:0x0162, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:48:0x0182, B:44:0x0162, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:48:0x0182, B:44:0x0162, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:48:0x0182, B:44:0x0162, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0208 A[PHI: r2 r3 r4 r17
      0x0208: PHI (r2v4 char) = (r2v1 char), (r2v3 char), (r2v1 char), (r2v1 char), (r2v1 char), (r2v1 char) binds: [B:62:0x0206, B:58:0x01ea, B:54:0x01ce, B:17:0x005d, B:15:0x0059, B:12:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r3v3 short) = (r3v1 short), (r3v1 short), (r3v2 short), (r3v1 short), (r3v1 short), (r3v1 short) binds: [B:62:0x0206, B:58:0x01ea, B:54:0x01ce, B:17:0x005d, B:15:0x0059, B:12:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r4v3 short) = (r4v1 short), (r4v1 short), (r4v2 short), (r4v1 short), (r4v1 short), (r4v1 short) binds: [B:62:0x0206, B:58:0x01ea, B:54:0x01ce, B:17:0x005d, B:15:0x0059, B:12:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r17v3 short[]) = (r17v2 short[]), (r17v1 short[]), (r17v1 short[]), (r17v1 short[]), (r17v1 short[]), (r17v1 short[]) binds: [B:62:0x0206, B:58:0x01ea, B:54:0x01ce, B:17:0x005d, B:15:0x0059, B:12:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0236  */
    /* JADX WARN: Code duplicated, block: B:71:0x0267  */
    /* JADX INFO: renamed from: ۧ */
    private InterfaceC4321 m41897(String str) {
        int iM55979;
        int i;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1201729192;
        int i10 = C1229.f82066;
        int i11 = C1025.f81947;
        int iM559710 = (C0946.m55979("۟ۧ") + i11) * 7;
        int i12 = ((iM559710 ^ i10) * 19919) ^ (-1652821965);
        int i13 = iM559710 ^ 1123038097;
        short[] sArr2 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * (-5755)) >> 31));
            switch (i9) {
                case -2084847667:
                case -1869024381:
                    c = 526;
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0946.m55979("ۘ۠") ^ i10) * (-93);
                        i12 = ((iM55979 ^ i11) * 18733) ^ 1725788055;
                        i = 368646537;
                    } else {
                        iM55979 = C0946.m55979("֨᩸") ^ i10;
                        i12 = ((iM55979 ^ i11) * 4059) ^ 1135918858;
                        i = -2101552878;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case -2070894699:
                case -994736063:
                    i3 = i2 * i2;
                    i4 = s * s;
                    if (C1071.m56343() != 0) {
                        iM55979 = (C0946.m55979("ۙ֨") + i11) * 47;
                        i12 = ((iM55979 ^ i10) * 19071) ^ (-220104832);
                        i = 1047041401;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ᩹") + i10) * 9;
                        i12 = ((iM55979 ^ i11) * (-10651)) ^ (-1758550867);
                        i = -1153689890;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case -1881493839:
                case -314751380:
                    sArr2 = f82272;
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0946.m55979("ۘ۠") ^ i10) * (-93);
                        i12 = ((iM55979 ^ i11) * 18733) ^ 1725788055;
                        i = 368646537;
                    } else {
                        iM55979 = C0873.m55680("֫᩻") ^ i11;
                        i12 = ((iM55979 ^ i10) * (-6017)) ^ 674382376;
                        i = 2000466960;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case -1818481276:
                case -1496173914:
                    int i14 = i4 + i5;
                    if (i3 - (i14 + i14) <= 0) {
                        iM55979 = C0946.m55979("ۚᩳ") ^ i10;
                        i12 = ((iM55979 ^ i11) * (-4867)) ^ 855840896;
                        i = -476440126;
                    } else {
                        iM55979 = (i11 - C0946.m55979("ܿ֡")) * 61;
                        i12 = ((iM55979 ^ i10) * 20983) ^ 1448132947;
                        i = 244692252;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case -1217514904:
                case 1067486603:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("᩻۟") ^ i11;
                        i12 = ((iM55979 ^ i10) * 32029) ^ (-1081854718);
                        i = 65986047;
                    } else {
                        iM55979 = (C0946.m55979("ۘ۠") ^ i10) * (-93);
                        i12 = ((iM55979 ^ i11) * 18733) ^ 1725788055;
                        i = 368646537;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case -1013512054:
                case -22144115:
                    return (InterfaceC4321) f54943.get(str);
                case -788507203:
                case 34186181:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (i10 - C0873.m55680("ۛۖ")) * (-3);
                        i12 = ((iM55979 ^ i11) * (-5451)) ^ 2057470758;
                        i = 1566470228;
                    } else {
                        iM55979 = C0873.m55680("ᩴۨ") ^ i10;
                        i12 = ((iM55979 ^ i11) * 12725) ^ 969408171;
                        i = 1557051871;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case -766810440:
                case 1253565091:
                    i6 = 35763;
                    iM55979 = (C0946.m55979("ۖ᩶") + i11) * (-95);
                    i12 = ((iM55979 ^ i10) * 26107) ^ (-398611797);
                    i = 1001996828;
                    i13 = iM55979 ^ i;
                    break;
                case -738475149:
                case 1312679108:
                    RunnableC1014.m56177();
                    return null;
                case -612628451:
                case 928819392:
                    C0917.m55854();
                    if (C0989.f81920 < 0) {
                        iM55979 = C0946.m55979("᩻۟") ^ i11;
                        i12 = ((iM55979 ^ i10) * 32029) ^ (-1081854718);
                        i = 65986047;
                    } else {
                        iM55979 = C0946.m55979("ܺۛ") ^ i10;
                        i12 = ((iM55979 ^ i11) * (-20507)) ^ 816981778;
                        i = 1319815569;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case -541469759:
                case 2119909455:
                    i8 = 2;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("ܺۛ") ^ i10;
                        i12 = ((iM55979 ^ i11) * (-20507)) ^ 816981778;
                        i = 1319815569;
                    } else {
                        iM55979 = C0946.m55979("ۧ۫") ^ i10;
                        i12 = ((iM55979 ^ i11) * 19365) ^ (-987897755);
                        i = -1419183157;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case -372377694:
                case -144037930:
                    C1044.m56286();
                    C1124.m56367();
                    iM55979 = (C0946.m55979("ۘ۠") ^ i10) * (-93);
                    i12 = ((iM55979 ^ i11) * 18733) ^ 1725788055;
                    i = 368646537;
                    i13 = iM55979 ^ i;
                    break;
                case -313760958:
                case -119675427:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55979 = C0946.m55979("᩻۟") ^ i11;
                        i12 = ((iM55979 ^ i10) * 32029) ^ (-1081854718);
                        i = 65986047;
                    } else {
                        iM55979 = C0946.m55979("᩺ܺ") ^ i11;
                        i12 = ((iM55979 ^ i10) * 9851) ^ 1279886294;
                        i = 629450832;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case -236729515:
                case 1702205609:
                    return this.f54948;
                case -95715534:
                case -10819017:
                    C0912.m55833();
                    if (C0882.m55710() == 0) {
                        iM55979 = (C0946.m55979("ۘ۠") ^ i10) * (-93);
                        i12 = ((iM55979 ^ i11) * 18733) ^ 1725788055;
                        i = 368646537;
                    } else {
                        iM55979 = (i10 - C0873.m55680("ۛۖ")) * (-3);
                        i12 = ((iM55979 ^ i11) * (-5451)) ^ 2057470758;
                        i = 1566470228;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case -89610293:
                case 765780670:
                    i5 = 43401744;
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0946.m55979("ۙ֨") + i11) * 47;
                        i12 = ((iM55979 ^ i10) * 19071) ^ (-220104832);
                        i = 1047041401;
                    } else {
                        iM55979 = C0873.m55680("۠᩷") ^ i11;
                        i12 = ((iM55979 ^ i10) * (-10473)) ^ 1012351577;
                        i = 1381309660;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case 41846737:
                case 860673413:
                    s = sArr2[c];
                    s2 = 6588;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("ۘ۠") ^ i10) * (-93);
                        i12 = ((iM55979 ^ i11) * 18733) ^ 1725788055;
                        i = 368646537;
                    } else {
                        iM55979 = C0946.m55979("֨۟") ^ i11;
                        i12 = ((iM55979 ^ i10) * (-21055)) ^ 2111752367;
                        i = -1033089251;
                    }
                    i13 = iM55979 ^ i;
                    break;
                case 446227048:
                case 1025001035:
                    if (ViewOnClickListenerC0939.m55949(C0882.m55717(sArr, i7, i8, i6), str)) {
                        int iM559711 = (C0946.m55979("۠ܳ") ^ i11) * 123;
                        i13 = iM559711 ^ (-1928822497);
                        i12 = ((iM559711 ^ i10) * (-9733)) ^ 1940657475;
                    } else {
                        iM55979 = (C0873.m55680("֨᩶") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i12 = ((iM55979 ^ i10) * (-20419)) ^ (-901567589);
                        i = 869442817;
                        i13 = iM55979 ^ i;
                    }
                    break;
                case 676896123:
                case 1382691420:
                    i6 = 36916;
                    iM55979 = (C0946.m55979("ۖ᩶") + i11) * (-95);
                    i12 = ((iM55979 ^ i10) * 26107) ^ (-398611797);
                    i = 1001996828;
                    i13 = iM55979 ^ i;
                    break;
                case 1611101940:
                case 2063585649:
                    sArr = f82272;
                    i7 = 527;
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("ܺۛ") ^ i10;
                        i12 = ((iM55979 ^ i11) * (-20507)) ^ 816981778;
                        i = 1319815569;
                    } else {
                        iM55979 = (i10 - C0946.m55979("ۧܰ")) * (-101);
                        i12 = ((iM55979 ^ i11) * 32515) ^ (-2093788709);
                        i = 333496299;
                    }
                    i13 = iM55979 ^ i;
                    break;
                default:
                    i2 = s + s2;
                    if (C0890.m55740()) {
                        iM55979 = C0873.m55680("᩺֡") ^ i10;
                        i12 = ((iM55979 ^ i11) * (-9897)) ^ (-1529531521);
                        i = 895703221;
                    } else {
                        iM55979 = (C0946.m55979("ۙ֨") + i11) * 47;
                        i12 = ((iM55979 ^ i10) * 19071) ^ (-220104832);
                        i = 1047041401;
                    }
                    i13 = iM55979 ^ i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x013d  */
    /* JADX WARN: Code duplicated, block: B:79:0x035e A[PHI: r9 r10 r16 r17 r18
      0x035e: PHI (r9v4 android.view.View) = (r9v2 android.view.View), (r9v2 android.view.View), (r9v5 android.view.View) binds: [B:78:0x035c, B:74:0x033e, B:16:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:78:0x035c, B:74:0x033e, B:16:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:78:0x035c, B:74:0x033e, B:16:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r17v5 short) = (r17v2 short), (r17v3 short), (r17v2 short) binds: [B:78:0x035c, B:74:0x033e, B:16:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r18v5 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:78:0x035c, B:74:0x033e, B:16:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        if (p067l.C0967.m56074() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (p067l.C1025.f81947 >= 0) goto L12;
     */
    @Override // p067l.AbstractViewOnClickListenerC14239
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5113(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250, int i) {
        int iM55680;
        int i2;
        int iM55681;
        int i3;
        int i4;
        C18402 c18402 = this;
        int i5 = C1124.f82007;
        int i6 = C1036.f81953;
        int iM55979 = (C0946.m55979("ܶܿ") + i5) * (-75);
        int i7 = ((iM55979 ^ i6) * 28903) ^ 1763445582;
        View view = null;
        View view2 = null;
        short[] sArr = null;
        int i8 = iM55979 ^ (-153208112);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        short s2 = 0;
        int i13 = -605808558;
        int i14 = 0;
        C12255 c12255 = null;
        short[] sArr2 = null;
        int i15 = 0;
        TextView textView = null;
        InterfaceC4321 interfaceC4321 = null;
        C21146 c21146 = null;
        C13769 c13769 = null;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i6) * (-4829)) >> 31));
            switch (i13) {
                case -2034691617:
                case -1955244106:
                    if ((i12 + 1) - i14 > 0) {
                        iM55680 = (i5 - C0946.m55979("ܰ۬")) * 33;
                        i7 = ((iM55680 ^ i6) * 22439) ^ 2093235922;
                        i2 = -162464802;
                    } else {
                        iM55680 = (C0873.m55680("۠ܿ") ^ i5) * (-93);
                        i7 = ((iM55680 ^ i6) * (-8969)) ^ 545808236;
                        i2 = -793834388;
                    }
                    i8 = iM55680 ^ i2;
                    c18402 = this;
                    break;
                case -1774228031:
                case -1416166646:
                    int i16 = s + s2;
                    i14 = i16 * i16;
                    i12 = s * 2;
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0946.m55979("ܽ۠") ^ i6;
                        i7 = ((iM55680 ^ i5) * 31813) ^ 8659844;
                        i2 = -872262931;
                    } else {
                        iM55680 = C0873.m55680("۠ۜ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 11779) ^ 1855650643;
                        i2 = 1838590559;
                    }
                    i8 = iM55680 ^ i2;
                    c18402 = this;
                    break;
                case -1708893164:
                case -1490452225:
                    c13769.f38926 = c21146;
                    interfaceC4321 = c21146.f66449;
                    textView = c13769.f47809;
                    if (C1053.f81965 > 0) {
                        iM55681 = (C0946.m55979("ܽ᩹") ^ i5) * 33;
                        i3 = ((iM55681 ^ i6) * (-14279)) ^ (-1547558190);
                        i4 = 1117289313;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    } else {
                        int iM55682 = (i5 - C0873.m55680("ۙ֡")) * 65;
                        i8 = iM55682 ^ (-986522336);
                        i7 = ((iM55682 ^ i6) * 23943) ^ 876296040;
                        c18402 = this;
                    }
                    break;
                case -1325025935:
                case -1101791452:
                    c13769.f38927 = interfaceC4321 instanceof C13039;
                    if (C1229.f82066 < 0) {
                        iM55681 = (C0946.m55979("ܳۚ") ^ i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM55681 ^ i5) * (-17413)) ^ 420926739;
                        i4 = 851090294;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    } else {
                        int iM55683 = (i5 - C0873.m55680("ۙ֡")) * 65;
                        i8 = iM55683 ^ (-986522336);
                        i7 = ((iM55683 ^ i6) * 23943) ^ 876296040;
                        c18402 = this;
                    }
                    break;
                case -1242954238:
                case -257756001:
                    C0863.m55643();
                    iM55680 = C0946.m55979("ܽ۠") ^ i6;
                    i7 = ((iM55680 ^ i5) * 31813) ^ 8659844;
                    i2 = -872262931;
                    i8 = iM55680 ^ i2;
                    c18402 = this;
                    break;
                case -1184725775:
                case -704753:
                    break;
                case -1155043178:
                case 1243570637:
                    c12255.m28262(interfaceC4321.mo8868());
                    C0947.m55996(c13769.itemView, c21146);
                    if (C1964.m56597() != 0) {
                        iM55681 = (i6 - C0946.m55979("۠ܶ")) * 99;
                        i3 = ((iM55681 ^ i5) * (-14873)) ^ 1221649266;
                        i4 = -1467232373;
                    } else {
                        iM55681 = C0946.m55979("ܽ۬") ^ i6;
                        i3 = ((iM55681 ^ i5) * (-16939)) ^ 778998404;
                        i4 = 1487945342;
                    }
                    i8 = iM55681 ^ i4;
                    i7 = i3;
                    break;
                case -904314187:
                case 1705866789:
                    i10 = 52178;
                    iM55680 = C0946.m55979("ۛۜ") ^ i6;
                    i7 = ((iM55680 ^ i5) * 19891) ^ 698453227;
                    i2 = -1828993862;
                    i8 = iM55680 ^ i2;
                    c18402 = this;
                    break;
                case -873196022:
                case 1410880109:
                    s = sArr2[593];
                    s2 = 1;
                    if (C1046.f81962 <= 0) {
                        iM55680 = (C0946.m55979("᩺֡") + i5) * (-13);
                        i7 = ((iM55680 ^ i6) * (-13863)) ^ (-249837206);
                        i2 = 78352581;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩵") ^ i6;
                        i7 = ((iM55680 ^ i5) * 27527) ^ 132311168;
                        i2 = 1299499840;
                    }
                    i8 = iM55680 ^ i2;
                    c18402 = this;
                    break;
                case -779890476:
                case 105877041:
                    break;
                case -713950509:
                case 636038461:
                    C1028.m56238(view2, i15);
                    sArr = f82272;
                    i11 = 594;
                    if (C0898.f81858 > 0) {
                        iM55681 = (i5 - C0873.m55680("ܰᩴ")) * (-43);
                        i3 = ((iM55681 ^ i6) * 27217) ^ 1853684220;
                        i4 = 1750354506;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    } else {
                        int iM55684 = (i5 - C0873.m55680("ۙ֡")) * 65;
                        i8 = iM55684 ^ (-986522336);
                        i7 = ((iM55684 ^ i6) * 23943) ^ 876296040;
                        c18402 = this;
                    }
                    break;
                case -693415798:
                case 2016083926:
                    RunnableC0938.m55928(textView, interfaceC4321.getName());
                    c12255 = c13769.f47810;
                    c12255.m28261(interfaceC4321.mo8867());
                    if (C0863.f81833 <= 0) {
                        iM55681 = (i6 - C0946.m55979("ܺ᩹")) * 69;
                        i3 = ((iM55681 ^ i5) * (-2307)) ^ 382354726;
                        i4 = -830412144;
                    } else {
                        iM55681 = (C0873.m55680("ۚᩳ") + i5) * (-85);
                        i3 = ((iM55681 ^ i6) * (-15491)) ^ 857983274;
                        i4 = -2025486970;
                    }
                    i8 = iM55681 ^ i4;
                    i7 = i3;
                    break;
                case -669999205:
                case 758952672:
                    C0912.m55828(textView, -15658735);
                    view2 = c13769.f38925;
                    i15 = 0;
                    if (!C0892.m55749()) {
                        iM55680 = (C0946.m55979("᩺֡") + i5) * (-13);
                        i7 = ((iM55680 ^ i6) * (-13863)) ^ (-249837206);
                        i2 = 78352581;
                        i8 = iM55680 ^ i2;
                        c18402 = this;
                    } else {
                        iM55681 = C0946.m55979("֫ܰ") ^ i6;
                        i3 = ((iM55681 ^ i5) * (-16457)) ^ (-2068367473);
                        i4 = -1022706227;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -571339885:
                case 33979764:
                    i10 = 23589;
                    iM55680 = C0946.m55979("ۛۜ") ^ i6;
                    i7 = ((iM55680 ^ i5) * 19891) ^ 698453227;
                    i2 = -1828993862;
                    i8 = iM55680 ^ i2;
                    c18402 = this;
                    break;
                case -519484586:
                case 1797391010:
                    break;
                case -247375568:
                case 320820212:
                    c18402.f40549.m12184((AbstractViewOnLongClickListenerC16250) c13769);
                    view = c13769.itemView;
                    i9 = 23;
                    if (interfaceC4321 instanceof C15779) {
                        iM55681 = (i5 - C0946.m55979("֡᩸")) * 119;
                        i3 = ((iM55681 ^ i6) * (-27843)) ^ 380732506;
                        i4 = 1769877312;
                    } else {
                        iM55681 = (i5 - C0946.m55979("ۚ᩹")) * 37;
                        i3 = ((iM55681 ^ i6) * 5321) ^ 1548777615;
                        i4 = 1720484138;
                    }
                    i8 = iM55681 ^ i4;
                    i7 = i3;
                    break;
                case -193636866:
                case 1134571917:
                    AbstractC0942.m55971();
                    if (!C1929.m56553()) {
                        int iM55685 = (i5 - C0873.m55680("ۙ֡")) * 65;
                        i8 = iM55685 ^ (-986522336);
                        i7 = ((iM55685 ^ i6) * 23943) ^ 876296040;
                        c18402 = this;
                    } else {
                        iM55681 = (i6 - C0946.m55979("۠ܶ")) * 99;
                        i3 = ((iM55681 ^ i5) * (-14873)) ^ 1221649266;
                        i4 = -1467232373;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -115311229:
                case 1337140613:
                    view.setBackgroundResource(C0873.m55680(C0989.m56092(sArr, i11, 3, i10)) ^ 2130402127);
                    if (Build.VERSION.SDK_INT >= i9) {
                        iM55681 = (i6 - C0946.m55979("ۨ᩶")) * (-23);
                        i3 = ((iM55681 ^ i5) * (-7961)) ^ 1857573905;
                        i4 = 1202849709;
                    } else {
                        iM55681 = C0873.m55680("ۗۗ") ^ i6;
                        i3 = ((iM55681 ^ i5) * (-32265)) ^ 119594155;
                        i4 = -525569340;
                    }
                    i8 = iM55681 ^ i4;
                    i7 = i3;
                    break;
                case 102709106:
                case 341084635:
                    view.setForeground(C21272.m48049(AbstractC0942.m55963(view)));
                    break;
                case 300127068:
                case 1947744718:
                    c13769 = (C13769) abstractViewOnLongClickListenerC16250;
                    c21146 = (C21146) C0992.m56115(c18402.f40548, i);
                    if (C0946.f81894 != 0) {
                        int iM55686 = (i5 - C0873.m55680("ۙ֡")) * 65;
                        i8 = iM55686 ^ (-986522336);
                        i7 = ((iM55686 ^ i6) * 23943) ^ 876296040;
                    } else {
                        iM55680 = C0873.m55680("ۧۜ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 4801) ^ (-539314884);
                        i2 = 2093459156;
                        i8 = iM55680 ^ i2;
                    }
                    c18402 = this;
                    break;
                case 500138560:
                case 1040588949:
                    view.setForeground(null);
                    iM55681 = C0873.m55680("ۗۗ") ^ i6;
                    i3 = ((iM55681 ^ i5) * (-32265)) ^ 119594155;
                    i4 = -525569340;
                    i8 = iM55681 ^ i4;
                    i7 = i3;
                    break;
                case 777627506:
                case 1919262600:
                    textView.setTextColor(C23223.f72986);
                    C1028.m56238(c13769.f38925, 8);
                    C21272.m48052(view);
                    if (Build.VERSION.SDK_INT >= i9) {
                        iM55681 = (C0946.m55979("ۨ۫") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM55681 ^ i6) * (-32555)) ^ 1854814632;
                        i4 = 408994441;
                    } else {
                        iM55681 = C0873.m55680("ۗۗ") ^ i6;
                        i3 = ((iM55681 ^ i5) * (-32265)) ^ 119594155;
                        i4 = -525569340;
                    }
                    i8 = iM55681 ^ i4;
                    i7 = i3;
                    break;
                case 1866679405:
                case 1984680816:
                    sArr2 = f82272;
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0946.m55979("᩺֡") + i5) * (-13);
                        i7 = ((iM55680 ^ i6) * (-13863)) ^ (-249837206);
                        i2 = 78352581;
                    } else {
                        iM55680 = (i5 - C0873.m55680("ۧ֫")) * 43;
                        i7 = ((iM55680 ^ i6) * 12775) ^ 156614651;
                        i2 = -1945773956;
                    }
                    i8 = iM55680 ^ i2;
                    c18402 = this;
                    break;
                default:
                    ServiceConnectionC1013.m56157();
                    C0892.m55749();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x018a A[PHI: r4 r6 r9 r11 r20
      0x018a: PHI (r4v3 l.ۗܶܳ) = (r4v2 l.ۗܶܳ), (r4v2 l.ۗܶܳ), (r4v4 l.ۗܶܳ) binds: [B:48:0x0172, B:40:0x0133, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x018a: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:48:0x0172, B:40:0x0133, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x018a: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:48:0x0172, B:40:0x0133, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x018a: PHI (r11v4 java.util.ArrayList) = (r11v2 java.util.ArrayList), (r11v3 java.util.ArrayList), (r11v2 java.util.ArrayList) binds: [B:48:0x0172, B:40:0x0133, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x018a: PHI (r20v2 int) = (r20v1 int), (r20v1 int), (r20v3 int) binds: [B:48:0x0172, B:40:0x0133, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0267 A[PHI: r7 r8 r13
      0x0267: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:66:0x0265, B:44:0x0155, B:25:0x00af, B:17:0x006b, B:92:0x0267] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:66:0x0265, B:44:0x0155, B:25:0x00af, B:17:0x006b, B:92:0x0267] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r13v5 l.᩵᩹ܳ) = (r13v2 l.᩵᩹ܳ), (r13v2 l.᩵᩹ܳ), (r13v4 l.᩵᩹ܳ), (r13v2 l.᩵᩹ܳ), (r13v2 l.᩵᩹ܳ) binds: [B:66:0x0265, B:44:0x0155, B:25:0x00af, B:17:0x006b, B:92:0x0267] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m41892(C18402 c18402, C13769 c13769, C13769 c137610) {
        int iM55979;
        int i;
        int i2;
        int i3 = C1017.f81942;
        int i4 = AbstractC0942.f81890;
        int iM55680 = (i3 - C0873.m55680("ۖ᩻")) * (-65);
        int i5 = ((iM55680 ^ i4) * (-2695)) ^ (-1624299601);
        C5522 c5522 = null;
        InterfaceC4321 interfaceC4321 = null;
        int i6 = iM55680 ^ 65561423;
        int bindingAdapterPosition = 0;
        int bindingAdapterPosition2 = 0;
        int i7 = 0;
        int iM12179 = 0;
        int i8 = 0;
        ArrayList arrayList = null;
        int i9 = 2130465154;
        int iM121710 = 0;
        C21146 c21146 = null;
        Iterator itM56292 = null;
        ArrayList arrayList2 = null;
        int i10 = 0;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i4) * (-18319)) >> 31));
            switch (i9) {
                case -2103626060:
                case 2060859369:
                    m41899(arrayList);
                    break;
                case -1599708447:
                case 1271447193:
                    RunnableC1014.m56165(c18402);
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0873.m55680("ۙۜ") + i3) * 23;
                        i = ((iM55979 ^ i4) * (-19799)) ^ 1826336402;
                        i2 = -1029170813;
                    } else {
                        iM55979 = (C0873.m55680("۫ۢ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM55979 ^ i4) * (-20403)) ^ 14682317;
                        i2 = 272566016;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1417082358:
                case 270997403:
                    i7 = iM121710 - 1;
                    if (C0854.f81826 != 0) {
                        iM55979 = (i3 - C0946.m55979("۬֨")) * 73;
                        i = ((iM55979 ^ i4) * (-21977)) ^ 2118205785;
                        i2 = 2060643879;
                    } else {
                        iM55979 = C0873.m55680("ۗܳ") ^ i3;
                        i = ((iM55979 ^ i4) * 18279) ^ 1113508752;
                        i2 = -222887488;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1317179384:
                case 493170558:
                    C0854.m55595();
                    C0947.m55997();
                    iM55979 = C0873.m55680("᩷ۜ") ^ i3;
                    i = ((iM55979 ^ i4) * (-31651)) ^ (-1947496445);
                    i2 = 519019221;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1290729723:
                case -816468518:
                    C0927.m55873();
                    C0873.m55678();
                    break;
                case -1219011111:
                case 217458059:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0873.m55680("ۗܺ") ^ i4) * (-5);
                        i = ((iM55979 ^ i3) * 8141) ^ 592055954;
                        i2 = 1675993075;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM559710 = (C0946.m55979("᩸ۤ") ^ i4) * 95;
                        i6 = iM559710 ^ (-1719184199);
                        i5 = ((iM559710 ^ i3) * 28685) ^ (-1504789559);
                        arrayList = null;
                    }
                    break;
                case -1012397164:
                case 1636940963:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = C0873.m55680("᩷ۜ") ^ i3;
                        i = ((iM55979 ^ i4) * (-31651)) ^ (-1947496445);
                        i2 = 519019221;
                    } else {
                        iM55979 = C0946.m55979("֨᩵") ^ i4;
                        i = ((iM55979 ^ i3) * (-1071)) ^ (-1744681455);
                        i2 = 894918097;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -909590123:
                case 823186118:
                    bindingAdapterPosition = c13769.getBindingAdapterPosition();
                    bindingAdapterPosition2 = c137610.getBindingAdapterPosition();
                    if (!C1929.m56553()) {
                        iM55979 = C0873.m55680("۫۬") ^ i4;
                        i = ((iM55979 ^ i3) * 8481) ^ 824322613;
                        i2 = 956188232;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM559711 = (C0946.m55979("᩸ۤ") ^ i4) * 95;
                        i6 = iM559711 ^ (-1719184199);
                        i5 = ((iM559711 ^ i3) * 28685) ^ (-1504789559);
                        arrayList = null;
                    }
                    break;
                case -685465419:
                case 588175030:
                    iM12179 = bindingAdapterPosition2 - c5522.m12179(c18402);
                    i8 = -1;
                    if (C1024.f81946) {
                        iM55979 = C0873.m55680("᩷ۜ") ^ i3;
                        i = ((iM55979 ^ i4) * (-31651)) ^ (-1947496445);
                        i2 = 519019221;
                    } else {
                        iM55979 = C0873.m55680("ۚܶ") ^ i3;
                        i = ((iM55979 ^ i4) * 12299) ^ 2079602870;
                        i2 = -1113478671;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -596011249:
                case -311407650:
                    C8123.m18819(i7, i10, arrayList2);
                    c5522.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                    if (C0898.m55800() > 0) {
                        arrayList = new ArrayList();
                        itM56292 = C1046.m56292(arrayList2);
                        iM55979 = C0873.m55680("ۗ᩸") ^ i3;
                        i = ((iM55979 ^ i4) * 15089) ^ (-255262725);
                        i2 = -273033071;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM559712 = (C0946.m55979("᩸ۤ") ^ i4) * 95;
                        i6 = iM559712 ^ (-1719184199);
                        i5 = ((iM559712 ^ i3) * 28685) ^ (-1504789559);
                        arrayList = null;
                    }
                    break;
                case -146650333:
                case 759809971:
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0873.m55680("ۙۜ") + i3) * 23;
                        i = ((iM55979 ^ i4) * (-19799)) ^ 1826336402;
                        i2 = -1029170813;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM559713 = (C0946.m55979("᩸ۤ") ^ i4) * 95;
                        i6 = iM559713 ^ (-1719184199);
                        i5 = ((iM559713 ^ i3) * 28685) ^ (-1504789559);
                        arrayList = null;
                    }
                    break;
                case -11357870:
                case 354145096:
                    if (RunnableC0938.f81886 >= 0) {
                        int iM559714 = (C0946.m55979("᩸ۤ") ^ i4) * 95;
                        i6 = iM559714 ^ (-1719184199);
                        i5 = ((iM559714 ^ i3) * 28685) ^ (-1504789559);
                        arrayList = null;
                    } else {
                        iM55979 = C0873.m55680("᩷ۜ") ^ i3;
                        i = ((iM55979 ^ i4) * (-31651)) ^ (-1947496445);
                        i2 = 519019221;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    }
                    break;
                case 375693159:
                case 1025861783:
                    C0937.m55917(arrayList, (C13039) interfaceC4321);
                    iM55979 = C0873.m55680("ۗ᩸") ^ i3;
                    i = ((iM55979 ^ i4) * 15089) ^ (-255262725);
                    i2 = -273033071;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 498205898:
                case 1677532063:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("ۗܺ") ^ i4) * (-5);
                        i = ((iM55979 ^ i3) * 8141) ^ 592055954;
                        i2 = 1675993075;
                    } else {
                        iM55979 = (i3 - C0873.m55680("֫ᩴ")) * (-111);
                        i = ((iM55979 ^ i4) * 6187) ^ 1558867998;
                        i2 = 1523838248;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 636403660:
                case 2065404738:
                    c21146 = (C21146) ((AbstractViewOnClickListenerC3510) C0955.m56035(itM56292));
                    if (C0937.m55918() >= 0) {
                        iM55979 = C0873.m55680("᩷ۜ") ^ i3;
                        i = ((iM55979 ^ i4) * (-31651)) ^ (-1947496445);
                        i2 = 519019221;
                    } else {
                        iM55979 = C0946.m55979("۟ۧ") ^ i3;
                        i = ((iM55979 ^ i4) * 24337) ^ 1676622230;
                        i2 = -1319824013;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 654238326:
                case 1626129105:
                    interfaceC4321 = c21146.f66449;
                    if (interfaceC4321 instanceof C13039) {
                        iM55979 = (C0873.m55680("ᩴۧ") + i4) * (-111);
                        i = ((iM55979 ^ i3) * (-5359)) ^ 928051116;
                        i2 = 2093066673;
                    } else {
                        iM55979 = C0873.m55680("ۗ᩸") ^ i3;
                        i = ((iM55979 ^ i4) * 15089) ^ (-255262725);
                        i2 = -273033071;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1040202330:
                case 1589966185:
                    if (C0866.m55647(itM56292)) {
                        iM55979 = (i4 - C0873.m55680("֡ᩴ")) * 29;
                        i = ((iM55979 ^ i3) * (-12735)) ^ (-132069356);
                        i2 = -187317860;
                    } else {
                        iM55979 = C0873.m55680("ۗ᩺") ^ i4;
                        i = ((iM55979 ^ i3) * 12857) ^ 652265511;
                        i2 = 746346217;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1813544487:
                case 2039020854:
                    i10 = iM12179 + i8;
                    arrayList2 = c18402.f40548;
                    if (C0882.f81846) {
                        iM55979 = (i3 - C0946.m55979("۬֨")) * 73;
                        i = ((iM55979 ^ i4) * (-21977)) ^ 2118205785;
                        i2 = 2060643879;
                    } else {
                        iM55979 = C0946.m55979("ۧۛ") ^ i4;
                        i = ((iM55979 ^ i3) * (-19061)) ^ (-1683031698);
                        i2 = -1965833128;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    c5522 = c18402.f40549;
                    iM121710 = bindingAdapterPosition - c5522.m12179(c18402);
                    if (C0927.f81875) {
                        iM55979 = (i3 - C0946.m55979("۬֨")) * 73;
                        i = ((iM55979 ^ i4) * (-21977)) ^ 2118205785;
                        i2 = 2060643879;
                    } else {
                        iM55979 = (C0946.m55979("۬᩶") ^ i4) * (-53);
                        i = ((iM55979 ^ i3) * (-19203)) ^ (-2017563948);
                        i2 = -1522874455;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:77:0x02de A[PHI: r17 r18 r19 r24
      0x02de: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:76:0x02dc, B:72:0x02bb, B:68:0x0297, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:76:0x02dc, B:72:0x02bb, B:68:0x0297, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:76:0x02dc, B:72:0x02bb, B:68:0x0297, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r24v5 short) = (r24v3 short), (r24v3 short), (r24v4 short), (r24v3 short) binds: [B:76:0x02dc, B:72:0x02bb, B:68:0x0297, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0311 A[PHI: r0 r7 r9 r10 r11 r16
      0x0311: PHI (r0v37 int) = (r0v1 int), (r0v1 int), (r0v1 int), (r0v39 int) binds: [B:80:0x030f, B:18:0x008a, B:15:0x006e, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v4 java.lang.String) binds: [B:80:0x030f, B:18:0x008a, B:15:0x006e, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:80:0x030f, B:18:0x008a, B:15:0x006e, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v4 short[]) binds: [B:80:0x030f, B:18:0x008a, B:15:0x006e, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:80:0x030f, B:18:0x008a, B:15:0x006e, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:80:0x030f, B:18:0x008a, B:15:0x006e, B:28:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m41884(int i, boolean[] zArr, ArrayList arrayList) {
        int iM55680;
        int i2;
        int i3;
        int iM55979;
        int i4;
        int i5 = i;
        int i6 = C1046.f81962;
        int i7 = C1003.f81929;
        int iM559710 = C0946.m55979("ᩳܽ") ^ i6;
        int i8 = ((iM559710 ^ i7) * (-22715)) ^ (-1026165617);
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM559710 ^ (-1546376660);
        HashSet hashSet = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short s = 0;
        int i17 = -1165578688;
        short s2 = 0;
        short[] sArr3 = null;
        String strM26623 = null;
        String strM56336 = null;
        InterfaceC14770 interfaceC14770M55814 = null;
        HashSet hashSet2 = null;
        int i18 = 0;
        while (true) {
            i17 = i9 ^ (i8 & (((i17 ^ i7) * (-32105)) >> 31));
            switch (i17) {
                case -2015718072:
                case 1904617213:
                    C0937.m55912(C1025.m56231(interfaceC14770M55814, C0912.m55822(sArr2, i12, i11, i13), strM26623));
                    m41905();
                    break;
                case -1788145368:
                case -427464785:
                    C1028.m56247();
                    C1929.m56553();
                    iM55680 = C0873.m55680("ܰۧ") ^ i7;
                    i2 = ((iM55680 ^ i6) * 1809) ^ (-1070497373);
                    i3 = 1544894931;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -1633574317:
                case 1364403307:
                    hashSet = new HashSet();
                    i18 = 0;
                    iM55680 = C0873.m55680("֫ܺ") ^ i6;
                    i2 = ((iM55680 ^ i7) * 27167) ^ (-987583504);
                    i3 = -440866365;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -1284389493:
                case 1193288091:
                    if (i18 < i5) {
                        iM55680 = C0946.m55979("᩸ۘ") ^ i7;
                        i2 = ((iM55680 ^ i6) * (-11197)) ^ (-1686012887);
                        i3 = 1784874605;
                    } else {
                        iM55680 = C0946.m55979("᩸ᩳ") ^ i7;
                        i2 = ((iM55680 ^ i6) * (-7221)) ^ (-1745838135);
                        i3 = 1539912573;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -1047930880:
                case -11680881:
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0873.m55680("ۛܽ") ^ i7;
                        i8 = ((iM55979 ^ i6) * 11467) ^ 1586928937;
                        i4 = -689093497;
                        i9 = iM55979 ^ i4;
                        i5 = i;
                    } else {
                        iM55680 = (i6 - C0946.m55979("ۛۧ")) * 31;
                        i2 = ((iM55680 ^ i7) * 25971) ^ 19703056;
                        i3 = 388249869;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -900242772:
                case -356692403:
                    i13 = 54177;
                    iM55680 = C0946.m55979("۟᩹") ^ i6;
                    i2 = ((iM55680 ^ i7) * (-25289)) ^ 1071535323;
                    i3 = -932653170;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -586892127:
                case 441314133:
                    if (C0967.f81910 < 0) {
                        iM55680 = C0873.m55680("ܰۧ") ^ i7;
                        i2 = ((iM55680 ^ i6) * 1809) ^ (-1070497373);
                        i3 = 1544894931;
                    } else {
                        iM55680 = (i6 - C0946.m55979("ۛۧ")) * 31;
                        i2 = ((iM55680 ^ i7) * 25971) ^ 19703056;
                        i3 = 388249869;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -583142629:
                case 2041783790:
                    if (zArr[i5]) {
                        iM55680 = (i6 - C0946.m55979("֡ۖ")) * (-57);
                        i2 = ((iM55680 ^ i7) * 14001) ^ (-470366472);
                        i3 = 1397985935;
                    } else {
                        iM55680 = C0873.m55680("ۛ֡") ^ i7;
                        i2 = ((iM55680 ^ i6) * (-19225)) ^ (-855198939);
                        i3 = 254829572;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -473031856:
                case 759817802:
                    ServiceConnectionC1013.m56151(hashSet, C0892.m55750(f82272, 387, 2, i13));
                    i5 = i;
                    iM55680 = (i6 - C0946.m55979("֡ۖ")) * (-57);
                    i2 = ((iM55680 ^ i7) * 14001) ^ (-470366472);
                    i3 = 1397985935;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -253175962:
                case 1208102251:
                    sArr3 = f82272;
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0873.m55680("ܰۧ") ^ i7;
                        i2 = ((iM55680 ^ i6) * 1809) ^ (-1070497373);
                        i3 = 1544894931;
                    } else {
                        iM55680 = (C0873.m55680("۟᩶") ^ i6) * (-107);
                        i2 = ((iM55680 ^ i7) * 3627) ^ (-1891843201);
                        i3 = -372940631;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -191576275:
                case 1643135819:
                    if (C0946.f81894 == 0) {
                        iM55680 = (i6 - C0946.m55979("ۛۧ")) * 31;
                        i2 = ((iM55680 ^ i7) * 25971) ^ 19703056;
                        i3 = 388249869;
                    } else {
                        iM55680 = C0946.m55979("᩹ܶ") ^ i6;
                        i2 = ((iM55680 ^ i7) * (-30767)) ^ (-243432890);
                        i3 = -1949426213;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -122093413:
                case 1336319819:
                    sArr = f82272;
                    i14 = 374;
                    i10 = 1;
                    if (C0863.f81833 > 0) {
                        iM55979 = (C0946.m55979("᩺᩸") ^ i6) * (-43);
                        i8 = ((iM55979 ^ i7) * (-27707)) ^ (-1043598728);
                        i4 = 1864370109;
                        i9 = iM55979 ^ i4;
                        i5 = i;
                    } else {
                        i5 = i;
                        iM55680 = (C0873.m55680("ܿ۟") ^ i7) * (-85);
                        i2 = ((iM55680 ^ i6) * (-14745)) ^ (-1784442698);
                        i3 = 1927185527;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -53531077:
                case 1759807118:
                    strM26623 = C11567.m26623(hashSet2, strM56336);
                    sArr2 = f82272;
                    i12 = 375;
                    i11 = 12;
                    if (C0863.f81833 > 0) {
                        iM55979 = (C0946.m55979("᩷ܰ") + i6) * (-31);
                        i8 = ((iM55979 ^ i7) * 20389) ^ 1568173181;
                        i4 = 213133501;
                        i9 = iM55979 ^ i4;
                        i5 = i;
                    } else {
                        i5 = i;
                        iM55680 = C0873.m55680("ܰۧ") ^ i7;
                        i2 = ((iM55680 ^ i6) * 1809) ^ (-1070497373);
                        i3 = 1544894931;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -48556815:
                case 80615664:
                    strM56336 = C1071.m56336(sArr, i14, i10, i13);
                    if (!C1024.f81946) {
                        iM55979 = C0873.m55680("ۗ᩻") ^ i7;
                        i8 = ((iM55979 ^ i6) * 10083) ^ 1657480884;
                        i4 = -558458665;
                        i9 = iM55979 ^ i4;
                        i5 = i;
                    } else {
                        i5 = i;
                        iM55680 = (C0873.m55680("ܿ۟") ^ i7) * (-85);
                        i2 = ((iM55680 ^ i6) * (-14745)) ^ (-1784442698);
                        i3 = 1927185527;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -44472475:
                case 1064922578:
                    i13 = 29910;
                    iM55680 = C0946.m55979("۟᩹") ^ i6;
                    i2 = ((iM55680 ^ i7) * (-25289)) ^ 1071535323;
                    i3 = -932653170;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -39818394:
                case 351563585:
                    int i19 = s + s2;
                    if (i16 - (i19 * i19) < 0) {
                        iM55680 = (C0873.m55680("ᩴ۟") + i7) * (-115);
                        i2 = ((iM55680 ^ i6) * 5567) ^ 1132485191;
                        i3 = -1116685211;
                    } else {
                        iM55680 = C0873.m55680("ܿᩴ") ^ i6;
                        i2 = ((iM55680 ^ i7) * 10363) ^ (-1184893089);
                        i3 = -1667366114;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -32021967:
                case 383744831:
                    hashSet2 = f54941;
                    hashSet2.clear();
                    hashSet2.addAll(hashSet);
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0873.m55680("ۛܽ") ^ i7;
                        i8 = ((iM55979 ^ i6) * 11467) ^ 1586928937;
                        i4 = -689093497;
                    } else {
                        iM55979 = C0946.m55979("᩵֨") ^ i7;
                        i8 = ((iM55979 ^ i6) * (-31489)) ^ 570023932;
                        i4 = 1464807115;
                    }
                    i9 = iM55979 ^ i4;
                    i5 = i;
                    break;
                case 60132741:
                case 1303673369:
                    i18++;
                    iM55680 = C0873.m55680("֫ܺ") ^ i6;
                    i2 = ((iM55680 ^ i7) * 27167) ^ (-987583504);
                    i3 = -440866365;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case 667067589:
                case 1708369245:
                    int i20 = i15 + 98386561;
                    i16 = i20 + i20;
                    if (C0947.m55997()) {
                        iM55680 = C0946.m55979("᩹ܶ") ^ i6;
                        i2 = ((iM55680 ^ i7) * (-30767)) ^ (-243432890);
                        i3 = -1949426213;
                    } else {
                        iM55680 = C0873.m55680("ۤۧ") ^ i6;
                        i2 = ((iM55680 ^ i7) * 28973) ^ 1547813067;
                        i3 = 572631974;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case 781968215:
                case 2121040908:
                    C0894.m55769();
                    break;
                case 876667886:
                case 1343136441:
                    s = sArr3[373];
                    i15 = s * s;
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("᩹ܶ") ^ i6;
                        i2 = ((iM55680 ^ i7) * (-30767)) ^ (-243432890);
                        i3 = -1949426213;
                    } else {
                        iM55680 = (C0873.m55680("֨ۨ") + i7) * (-11);
                        i2 = ((iM55680 ^ i6) * (-3125)) ^ 1491804317;
                        i3 = -1560020467;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case 1164509288:
                case 1966428016:
                    interfaceC14770M55814 = C0906.m55814(ApplicationC21448.f67649);
                    if (C0873.f81841 > 0) {
                        iM55979 = (C0946.m55979("ۡۤ") ^ i6) * (-81);
                        i8 = ((iM55979 ^ i7) * (-24315)) ^ 210092660;
                        i4 = -973721737;
                        i9 = iM55979 ^ i4;
                        i5 = i;
                    } else {
                        i5 = i;
                        iM55680 = (C0873.m55680("ܿ۟") ^ i7) * (-85);
                        i2 = ((iM55680 ^ i6) * (-14745)) ^ (-1784442698);
                        i3 = 1927185527;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    }
                    break;
                case 1209623909:
                case 1336434049:
                    if (zArr[i18]) {
                        iM55979 = (C0946.m55979("᩸֫") ^ i6) * 11;
                        i8 = ((iM55979 ^ i7) * 17379) ^ 420918144;
                        i4 = -150954939;
                    } else {
                        iM55979 = C0946.m55979("ۙ᩶") ^ i7;
                        i8 = ((iM55979 ^ i6) * (-3011)) ^ (-1675866232);
                        i4 = 1516533783;
                    }
                    i9 = iM55979 ^ i4;
                    i5 = i;
                    break;
                case 1761473045:
                case 1961422210:
                    s2 = 9919;
                    if (C0890.f81849 != 0) {
                        iM55680 = C0946.m55979("᩹ܶ") ^ i6;
                        i2 = ((iM55680 ^ i7) * (-30767)) ^ (-243432890);
                        i3 = -1949426213;
                    } else {
                        iM55680 = C0946.m55979("ۨۖ") ^ i7;
                        i2 = ((iM55680 ^ i6) * 10389) ^ (-2040351470);
                        i3 = 915270599;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case 1877261920:
                case 2015219394:
                    C1044.m56271(hashSet, ((C13039) C0992.m56115(arrayList, i18)).f36664);
                    iM55979 = (C0946.m55979("᩸֫") ^ i6) * 11;
                    i8 = ((iM55979 ^ i7) * 17379) ^ 420918144;
                    i4 = -150954939;
                    i9 = iM55979 ^ i4;
                    i5 = i;
                    break;
                default:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0873.m55680("ܿ۟") ^ i7) * (-85);
                        i2 = ((iM55680 ^ i6) * (-14745)) ^ (-1784442698);
                        i3 = 1927185527;
                    } else {
                        iM55680 = (i7 - C0873.m55680("۬ܽ")) * (-19);
                        i2 = ((iM55680 ^ i6) * (-12477)) ^ (-2104615351);
                        i3 = 957139872;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0541 A[PHI: r4 r7 r11 r15 r16 r17 r21 r22
      0x0541: PHI (r4v22 int) = (r4v5 int), (r4v7 int), (r4v19 int), (r4v29 int) binds: [B:100:0x0528, B:92:0x04cd, B:14:0x0078, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r7v35 int) = (r7v1 int), (r7v1 int), (r7v30 int), (r7v1 int) binds: [B:100:0x0528, B:92:0x04cd, B:14:0x0078, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r11v6 int) = (r11v2 int), (r11v2 int), (r11v4 int), (r11v2 int) binds: [B:100:0x0528, B:92:0x04cd, B:14:0x0078, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r15v6 java.lang.String) = (r15v2 java.lang.String), (r15v2 java.lang.String), (r15v4 java.lang.String), (r15v2 java.lang.String) binds: [B:100:0x0528, B:92:0x04cd, B:14:0x0078, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:100:0x0528, B:92:0x04cd, B:14:0x0078, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r17v23 int) = (r17v6 int), (r17v8 int), (r17v20 int), (r17v29 int) binds: [B:100:0x0528, B:92:0x04cd, B:14:0x0078, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r21v45 int) = (r21v4 int), (r21v6 int), (r21v39 int), (r21v51 int) binds: [B:100:0x0528, B:92:0x04cd, B:14:0x0078, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r22v33 l.ۗۜ) = (r22v7 l.ۗۜ), (r22v9 l.ۗۜ), (r22v30 l.ۗۜ), (r22v39 l.ۗۜ) binds: [B:100:0x0528, B:92:0x04cd, B:14:0x0078, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x024f A[PHI: r7 r9 r13
      0x024f: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:55:0x024d, B:51:0x0227] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r9v3 android.view.MenuItem) = (r9v2 android.view.MenuItem), (r9v5 android.view.MenuItem) binds: [B:55:0x024d, B:51:0x0227] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r13v5 java.lang.String) = (r13v4 java.lang.String), (r13v2 java.lang.String) binds: [B:55:0x024d, B:51:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (p067l.C0949.f81897 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (p067l.ViewOnClickListenerC0939.m55941() < 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m41890(final C18402 c18402, View view, final InterfaceC4321 interfaceC4321, boolean z, final DialogInterfaceC2564 dialogInterfaceC2564, final Runnable runnable, final RunnableC23827 runnableC23827) {
        int iM55680;
        int i;
        int i2;
        int i3;
        int iM55979;
        int i4;
        int iM55681;
        int i5;
        int i6;
        int iM559710;
        int i7;
        int iM55682;
        int i8;
        int iM55683;
        int i9;
        C0994 c0994M50638 = null;
        boolean z2 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = C0949.f81897;
        int i13 = C1003.f81929;
        int iM559711 = C0946.m55979("ۡ۫") ^ i12;
        int i14 = ((iM559711 ^ i13) * (-1201)) ^ (-477078122);
        MenuItem menuItemM55972 = null;
        String strM56233 = null;
        short[] sArr = null;
        int i15 = iM559711 ^ (-2032101595);
        final String strMo8865 = null;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1291017535;
        int i19 = 0;
        MenuItem menuItemM55687 = null;
        MenuItem menuItemM55688 = null;
        String strM56558 = null;
        int i20 = 0;
        int iM559712 = 0;
        C1898 c1898 = null;
        while (true) {
            i18 = i15 ^ (i14 & (((i18 ^ i13) * (-6103)) >> 31));
            switch (i18) {
                case -2136578161:
                case -1830233088:
                    C0967.m56067(menuItemM55972, C0946.m55979(C1028.m56235(f82272, 440, 3, i16)) ^ 2100274684);
                    i11 = i11;
                    i10 = i10;
                    i17 = i17;
                    i19 = i19;
                    iM55979 = (C0873.m55680("ۡۙ") + i12) * (-121);
                    i = ((iM55979 ^ i13) * 19943) ^ 1860853294;
                    i4 = -157581283;
                    i3 = iM55979 ^ i4;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
                case -2095281871:
                case -805696949:
                    C1071.m56343();
                    break;
                case -2078594804:
                case 1595394255:
                    if (C0890.f81849 != 0) {
                        i10 = i10;
                        i17 = i17;
                        i19 = i19;
                        c0994M50638 = c0994M50638;
                        iM55680 = C0873.m55680("᩶᩶") ^ i12;
                        i = ((iM55680 ^ i13) * (-20615)) ^ (-674718620);
                        i2 = 1514752983;
                        i3 = iM55680 ^ i2;
                        c0994M50638 = c0994M50638;
                        i19 = i19;
                        i17 = i17;
                        i10 = i10;
                        i15 = i3;
                        i14 = i;
                    }
                    i6 = i11;
                    iM559710 = C0873.m55680("ۗܳ") ^ i13;
                    i = ((iM559710 ^ i12) * (-11335)) ^ 1137905151;
                    i7 = -1213669678;
                    i3 = iM559710 ^ i7;
                    i11 = i6;
                    i15 = i3;
                    i14 = i;
                    break;
                case -2034504930:
                case -1610782703:
                    i10 = i10;
                    i17 = i17;
                    int i21 = i19;
                    c1898 = new C1898(c18402.f37526, view, 8388611);
                    C9702.m22649(view);
                    c1898.m50640();
                    c0994M50638 = c1898.m50638();
                    boolean z3 = interfaceC4321 instanceof C13039;
                    if (z) {
                        int iM559713 = C0946.m55979("᩶ᩳ") ^ i13;
                        i14 = ((iM559713 ^ i12) * (-5701)) ^ 2105363746;
                        z2 = z3;
                        i17 = i17;
                        i10 = i10;
                        i15 = iM559713 ^ (-795038013);
                        i19 = i21;
                    } else {
                        int iM55684 = (C0873.m55680("ܿ᩵") + i12) * 41;
                        i = ((iM55684 ^ i13) * 20133) ^ 327592680;
                        i3 = iM55684 ^ (-1854753699);
                        i19 = i21;
                        z2 = z3;
                        i17 = i17;
                        i10 = i10;
                        i15 = i3;
                        i14 = i;
                    }
                    break;
                case -2032119255:
                case 1728184588:
                    break;
                case -1996742601:
                case -1288422737:
                    i11 = 2;
                    strM56233 = C1025.m56233(f82272, 431, 3, i16);
                    if (C1053.f81965 <= 0) {
                        iM55681 = (i12 - C0946.m55979("ܰ֫")) * (-41);
                        i = ((iM55681 ^ i13) * (-23777)) ^ (-2093949336);
                        i5 = -1252848495;
                    } else {
                        iM55681 = C0873.m55680("ܰۗ") ^ i13;
                        i = ((iM55681 ^ i12) * 23285) ^ (-588240165);
                        i5 = 1733522509;
                    }
                    i15 = iM55681 ^ i5;
                    i14 = i;
                    break;
                case -1977735046:
                case 695396456:
                    i10 = i10;
                    i17 = i17;
                    i19 = i19;
                    c0994M50638 = c0994M50638;
                    sArr = f82272;
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("ᩴۙ") ^ i13) * (-53);
                        i = ((iM55680 ^ i12) * (-25243)) ^ 2132965612;
                        i2 = -1594670745;
                    } else {
                        iM55680 = C0946.m55979("֫ܺ") ^ i12;
                        i = ((iM55680 ^ i13) * 15575) ^ 653670632;
                        i2 = -1191467573;
                    }
                    i3 = iM55680 ^ i2;
                    c0994M50638 = c0994M50638;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
                case -1892499366:
                case -205673960:
                    break;
                case -1789495465:
                case -1468896071:
                    i10 = i10;
                    i17 = i17;
                    i19 = i19;
                    c0994M50638 = c0994M50638;
                    AbstractC0942.m55962(c18402);
                    strMo8865 = interfaceC4321.mo8865();
                    if (strMo8865 == null) {
                        iM55680 = (C0873.m55680("ᩴܺ") ^ i13) * 91;
                        i = ((iM55680 ^ i12) * 12789) ^ 1967009929;
                        i2 = 646135894;
                    } else {
                        iM55680 = C0873.m55680("ۤ᩶") ^ i13;
                        i = ((iM55680 ^ i12) * (-20547)) ^ (-1643497245);
                        i2 = -1530772636;
                    }
                    i3 = iM55680 ^ i2;
                    c0994M50638 = c0994M50638;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
                case -1781441146:
                case -381071589:
                    C0873.m55678();
                    if (C1929.f83011 != 0) {
                        i6 = i11;
                        iM559710 = C0873.m55680("ܶܶ") ^ i12;
                        i = ((iM559710 ^ i13) * 25487) ^ (-211464944);
                        i7 = 1449437884;
                        i3 = iM559710 ^ i7;
                        i11 = i6;
                        i15 = i3;
                        i14 = i;
                    }
                    i6 = i11;
                    iM559710 = C0946.m55979("֨ۘ") ^ i13;
                    i = ((iM559710 ^ i12) * 14145) ^ (-296758236);
                    i7 = -305745706;
                    i3 = iM559710 ^ i7;
                    i11 = i6;
                    i15 = i3;
                    i14 = i;
                    break;
                case -1708425177:
                case 1014807633:
                    i6 = i11;
                    C1124.m56375(menuItemM55687, C0873.m55680(C0873.m55689(f82272, 434, 3, i16)) ^ 2119499808);
                    if (z2) {
                        iM559710 = C0946.m55979("۬᩻") ^ i12;
                        i = ((iM559710 ^ i13) * (-17007)) ^ 1057669038;
                        i7 = 1911654637;
                    } else {
                        iM559710 = (i12 - C0946.m55979("᩵۠")) * (-17);
                        i = ((iM559710 ^ i13) * 24827) ^ (-1662933533);
                        i7 = -1063197223;
                    }
                    i3 = iM559710 ^ i7;
                    i11 = i6;
                    i15 = i3;
                    i14 = i;
                    break;
                case -1465387580:
                case 2035899579:
                    i6 = i11;
                    i20 = 3;
                    strM56558 = C1929.m56558(f82272, 443, 3, i16);
                    if (AbstractC0942.f81890 > 0) {
                        iM559710 = (i13 - C0946.m55979("ܿܿ")) * (-27);
                        i = ((iM559710 ^ i12) * 8785) ^ 1554755425;
                        i7 = 1279709378;
                        i3 = iM559710 ^ i7;
                        i11 = i6;
                        i15 = i3;
                        i14 = i;
                    } else {
                        i11 = i6;
                        i10 = i10;
                        i17 = i17;
                        i19 = i19;
                        c0994M50638 = c0994M50638;
                        iM55680 = C0946.m55979("֫ܺ") ^ i12;
                        i = ((iM55680 ^ i13) * 15575) ^ 653670632;
                        i2 = -1191467573;
                        i3 = iM55680 ^ i2;
                        c0994M50638 = c0994M50638;
                        i19 = i19;
                        i17 = i17;
                        i10 = i10;
                        i15 = i3;
                        i14 = i;
                    }
                    break;
                case -1351628048:
                case 1881000798:
                    i6 = i11;
                    iM559712 = C0946.m55979(C0894.m55773(f82272, 437, 3, i16));
                    if (C0894.f81854 >= 0) {
                        iM559710 = C0873.m55680("ܶܶ") ^ i12;
                        i = ((iM559710 ^ i13) * 25487) ^ (-211464944);
                        i7 = 1449437884;
                    } else {
                        iM559710 = (C0873.m55680("۠ܺ") + i12) * (-77);
                        i = ((iM559710 ^ i13) * 21541) ^ 718759100;
                        i7 = -479131409;
                    }
                    i3 = iM559710 ^ i7;
                    i11 = i6;
                    i15 = i3;
                    i14 = i;
                    break;
                case -1159068464:
                case -640472226:
                    iM55683 = C0873.m55680(C0845.m55592(f82272, 425, 3, i16));
                    i9 = 2130194927;
                    int i22 = iM55683 ^ i9;
                    int iM55685 = (C0873.m55680("᩸᩹") + i13) * (-85);
                    i19 = i19;
                    i17 = i22;
                    i14 = ((iM55685 ^ i12) * 13231) ^ 1635530662;
                    i10 = i10;
                    i15 = iM55685 ^ (-762013843);
                    break;
                case -1141537367:
                case 2086328744:
                    i10 = i10;
                    i17 = i17;
                    i19 = i19;
                    c0994M50638 = c0994M50638;
                    short s = sArr[418];
                    if (((s * s) + 13734436) - (s * 7412) >= 0) {
                        iM55680 = (C0873.m55680("᩸ۤ") ^ i12) * 15;
                        i = ((iM55680 ^ i13) * (-15043)) ^ 664053055;
                        i2 = 1888759058;
                    } else {
                        iM55680 = (C0873.m55680("᩻۬") ^ i13) * 89;
                        i = ((iM55680 ^ i12) * 27551) ^ 1090904664;
                        i2 = 926481877;
                    }
                    i3 = iM55680 ^ i2;
                    c0994M50638 = c0994M50638;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
                case -1063116021:
                case -1008343343:
                    i10 = i10;
                    i17 = i17;
                    i19 = i19;
                    c0994M50638 = c0994M50638;
                    if (C0947.m55997()) {
                        iM55680 = C0946.m55979("֫ܺ") ^ i12;
                        i = ((iM55680 ^ i13) * 15575) ^ 653670632;
                        i2 = -1191467573;
                    } else {
                        iM55680 = (C0873.m55680("ۛ֫") ^ i12) * (-37);
                        i = ((iM55680 ^ i13) * 15483) ^ 1834125612;
                        i2 = -407001017;
                    }
                    i3 = iM55680 ^ i2;
                    c0994M50638 = c0994M50638;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
                case -877373820:
                case 978094901:
                    i16 = 60770;
                    iM55680 = C0873.m55680("֨ۡ") ^ i12;
                    i = ((iM55680 ^ i13) * (-27293)) ^ 1745833195;
                    i2 = 1898206886;
                    i3 = iM55680 ^ i2;
                    c0994M50638 = c0994M50638;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
                case -862875580:
                case 300441789:
                    i16 = 54413;
                    iM55680 = C0873.m55680("֨ۡ") ^ i12;
                    i = ((iM55680 ^ i13) * (-27293)) ^ 1745833195;
                    i2 = 1898206886;
                    i3 = iM55680 ^ i2;
                    c0994M50638 = c0994M50638;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
                case -809542002:
                case -725509804:
                    C0967.m56074();
                    C0947.m55997();
                    i10 = i10;
                    i17 = i17;
                    i19 = i19;
                    c0994M50638 = c0994M50638;
                    iM55680 = C0946.m55979("֫ܺ") ^ i12;
                    i = ((iM55680 ^ i13) * 15575) ^ 653670632;
                    i2 = -1191467573;
                    i3 = iM55680 ^ i2;
                    c0994M50638 = c0994M50638;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
                case -733429984:
                case 1373075692:
                    c1898.m50636(new InterfaceC1583() { // from class: l.ᩳ᩹ܳ
                        @Override // p067l.InterfaceC1583
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return C18402.m41893(this.f60232, runnable, dialogInterfaceC2564, strMo8865, runnableC23827, interfaceC4321, menuItem);
                        }
                    });
                    c1898.m50639();
                    break;
                case -732726994:
                case 1446093141:
                    i10 = i10;
                    i17 = i17;
                    i19 = i19;
                    if (z) {
                        iM55979 = C0946.m55979("᩹ܳ") ^ i13;
                        i = ((iM55979 ^ i12) * 29939) ^ (-1177636386);
                        i4 = 235527150;
                    } else {
                        iM55979 = (i12 - C0946.m55979("֨۫")) * (-43);
                        i = ((iM55979 ^ i13) * (-4051)) ^ (-203121243);
                        i4 = -998304241;
                    }
                    i3 = iM55979 ^ i4;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
                case -219760618:
                case -130895947:
                    iM55682 = C0946.m55979(C1929.m56558(f82272, 422, 3, i16));
                    i8 = 2122807323;
                    int i23 = iM55682 ^ i8;
                    int iM55686 = (C0873.m55680("᩹ۡ") ^ i12) * 95;
                    i17 = i17;
                    i10 = i10;
                    i15 = iM55686 ^ 1922846908;
                    i19 = i23;
                    i14 = ((iM55686 ^ i13) * (-9089)) ^ (-1407599747);
                    c0994M50638 = c0994M50638;
                    break;
                case 285929834:
                case 450665445:
                    i6 = i11;
                    int iM559714 = C0946.m55979(strM56558) ^ 2119265246;
                    menuItemM55688 = C0873.m55687(c0994M50638, i10, iM559714, i20, iM559714);
                    if (C1003.f81929 <= 0) {
                        iM559710 = C0873.m55680("ۗܳ") ^ i13;
                        i = ((iM559710 ^ i12) * (-11335)) ^ 1137905151;
                        i7 = -1213669678;
                    } else {
                        iM559710 = C0946.m55979("᩹᩹") ^ i13;
                        i = ((iM559710 ^ i12) * 10881) ^ (-235962734);
                        i7 = 1573151022;
                    }
                    i3 = iM559710 ^ i7;
                    i11 = i6;
                    i15 = i3;
                    i14 = i;
                    break;
                case 732196071:
                case 1899505301:
                    i10 = i10;
                    i17 = i17;
                    i19 = i19;
                    c0994M50638 = c0994M50638;
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("᩶᩶") ^ i12;
                        i = ((iM55680 ^ i13) * (-20615)) ^ (-674718620);
                        i2 = 1514752983;
                    } else {
                        iM55680 = C0873.m55680("ܿۗ") ^ i12;
                        i = ((iM55680 ^ i13) * (-25515)) ^ 1439049980;
                        i2 = 1397244708;
                    }
                    i3 = iM55680 ^ i2;
                    c0994M50638 = c0994M50638;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
                case 745781340:
                case 1569419518:
                    iM55683 = C0873.m55680(C1194.m56386(f82272, 428, 3, i16));
                    i9 = 2119540541;
                    int i24 = iM55683 ^ i9;
                    int iM55687 = (C0873.m55680("᩸᩹") + i13) * (-85);
                    i19 = i19;
                    i17 = i24;
                    i14 = ((iM55687 ^ i12) * 13231) ^ 1635530662;
                    i10 = i10;
                    i15 = iM55687 ^ (-762013843);
                    break;
                case 787674755:
                case 1577647438:
                    int i25 = i19;
                    i17 = i17;
                    C1124.m56375(C0873.m55687(c0994M50638, 0, i25, 0, i25), i17);
                    if (z2) {
                        int iM55688 = C0873.m55680("۠۬") ^ i13;
                        i14 = ((iM55688 ^ i12) * (-21319)) ^ (-919253476);
                        i15 = iM55688 ^ (-1927917932);
                        i19 = i25;
                        i17 = i17;
                        i10 = 0;
                    } else {
                        i19 = i25;
                        i10 = 0;
                        iM55979 = (C0873.m55680("ۡۙ") + i12) * (-121);
                        i = ((iM55979 ^ i13) * 19943) ^ 1860853294;
                        i4 = -157581283;
                        i3 = iM55979 ^ i4;
                        i19 = i19;
                        i17 = i17;
                        i10 = i10;
                        i15 = i3;
                        i14 = i;
                    }
                    break;
                case 1013322605:
                case 1584798913:
                    iM55682 = C0873.m55680(C1017.m56189(f82272, 419, 3, i16));
                    i8 = 2121919790;
                    int i26 = iM55682 ^ i8;
                    int iM55689 = (C0873.m55680("᩹ۡ") ^ i12) * 95;
                    i17 = i17;
                    i10 = i10;
                    i15 = iM55689 ^ 1922846908;
                    i19 = i26;
                    i14 = ((iM55689 ^ i13) * (-9089)) ^ (-1407599747);
                    c0994M50638 = c0994M50638;
                    break;
                case 1136957807:
                case 1892332379:
                    i6 = i11;
                    int i27 = 2124323048 ^ iM559712;
                    menuItemM55972 = C0946.m55972(c0994M50638, i10, i27, 1, i27);
                    if (C1036.m56257() <= 0) {
                        iM559710 = C0946.m55979("֨ۘ") ^ i13;
                        i = ((iM559710 ^ i12) * 14145) ^ (-296758236);
                        i7 = -305745706;
                    } else {
                        iM559710 = (i13 - C0946.m55979("۠ܳ")) * (-43);
                        i = ((iM559710 ^ i12) * 11303) ^ (-784144906);
                        i7 = -1490291591;
                    }
                    i3 = iM559710 ^ i7;
                    i11 = i6;
                    i15 = i3;
                    i14 = i;
                    break;
                case 1160432002:
                case 1651265188:
                    int iM559715 = C0946.m55979(strM56233) ^ 2128409362;
                    menuItemM55687 = C0873.m55687(c0994M50638, i10, iM559715, i11, iM559715);
                    if (C0992.f81922 >= 0) {
                        iM55681 = (i12 - C0946.m55979("ܰ֫")) * (-41);
                        i = ((iM55681 ^ i13) * (-23777)) ^ (-2093949336);
                        i5 = -1252848495;
                    } else {
                        iM55681 = (C0946.m55979("ܿۤ") + i12) * 41;
                        i = ((iM55681 ^ i13) * 31957) ^ (-2025246895);
                        i5 = 1428817476;
                    }
                    i15 = iM55681 ^ i5;
                    i14 = i;
                    break;
                case 1219639005:
                case 1638768386:
                    C1046.m56302();
                    break;
                case 1823168154:
                case 2143188582:
                    i6 = i11;
                    C1124.m56375(menuItemM55688, C0946.m55979(C0967.m56077(f82272, 446, 3, i16)) ^ 2126773146);
                    iM559710 = (i12 - C0946.m55979("᩵۠")) * (-17);
                    i = ((iM559710 ^ i13) * 24827) ^ (-1662933533);
                    i7 = -1063197223;
                    i3 = iM559710 ^ i7;
                    i11 = i6;
                    i15 = i3;
                    i14 = i;
                    break;
                default:
                    i10 = i10;
                    i17 = i17;
                    i19 = i19;
                    c0994M50638 = c0994M50638;
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0946.m55979("֫ܺ") ^ i12;
                        i = ((iM55680 ^ i13) * 15575) ^ 653670632;
                        i2 = -1191467573;
                    } else {
                        iM55680 = (C0946.m55979("۬᩹") + i13) * (-83);
                        i = ((iM55680 ^ i12) * 25709) ^ (-1486536783);
                        i2 = 318245914;
                    }
                    i3 = iM55680 ^ i2;
                    c0994M50638 = c0994M50638;
                    i19 = i19;
                    i17 = i17;
                    i10 = i10;
                    i15 = i3;
                    i14 = i;
                    break;
            }
            return;
        }
    }

    static {
        C21265 c21265;
        String str;
        short[] sArr;
        int i;
        int i2;
        int i3;
        C21265 c21266;
        C15759 c15759;
        C17791 c17791;
        String str2;
        int i4;
        int i5;
        C21265 c21267;
        C12408 c12408;
        String str3;
        C21265 c21268;
        C21265 c21269;
        C24477 c24477;
        String str4;
        C21265 c212610;
        C15759 c157510;
        String str5;
        short[] sArr2;
        short[] sArr3;
        short[] sArr4;
        int i6;
        int i7;
        int i8;
        int i9;
        C4381 c4381;
        int i10;
        int iM55680;
        short[] sArr5;
        String str6;
        int i11;
        int i12;
        C4381 c4382;
        int i13;
        int i14;
        int iM55979;
        int i15;
        int iM55681;
        int i16;
        int i17;
        int i18;
        String str7;
        short[] sArr6;
        short[] sArr7;
        int i19;
        int i20;
        C21265 c212611;
        String str8;
        int i21;
        int i22;
        int i23;
        C21265 c212612;
        C24477 c24478;
        short[] sArr8;
        short[] sArr9;
        int i24;
        int i25;
        String str9;
        int i26;
        int i27;
        C21265 c212613;
        C12408 c12409;
        int i28;
        String str10;
        String str11;
        C13749 c13749;
        C21265 c212614;
        int i29;
        String strM56092 = null;
        int i30 = 2064109342;
        int i31 = C0877.f81843;
        int i32 = ServiceConnectionC1013.f81940;
        int iM559710 = (C0946.m55979("ᩴۧ") + i32) * (-127);
        int i33 = ((iM559710 ^ i31) * 20661) ^ 1536013213;
        int i34 = iM559710 ^ 1197166701;
        int iM55682 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int iM559711 = 0;
        C8384 c8384 = null;
        C21265 c212615 = null;
        C24477 c24479 = null;
        String strM55597 = null;
        C21265 c212616 = null;
        C15759 c157511 = null;
        String strM55598 = null;
        C21265 c212617 = null;
        C25168 c25168 = null;
        String strM55822 = null;
        C21265 c212618 = null;
        C9075 c9075 = null;
        String strM55599 = null;
        C21265 c212619 = null;
        C22487 c22487 = null;
        String strM56203 = null;
        C21265 c212620 = null;
        C11758 c11758 = null;
        String strM56403 = null;
        String strM56293 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        short[] sArr17 = null;
        short[] sArr18 = null;
        short[] sArr19 = null;
        short[] sArr20 = null;
        short[] sArr21 = null;
        short[] sArr22 = null;
        C21265 c212621 = null;
        int i38 = 0;
        int i39 = 0;
        int iM559712 = 0;
        int iM559713 = 0;
        int iM559714 = 0;
        int i40 = 0;
        int iM55683 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int iM559715 = 0;
        String str12 = null;
        C21265 c212622 = null;
        C21265 c212623 = null;
        C14419 c14419 = null;
        String str13 = null;
        C13749 c137410 = null;
        String str14 = null;
        C19133 c19133 = null;
        String strM55947 = null;
        short[] sArr23 = null;
        int i51 = 0;
        C4381 c4383 = null;
        String str15 = null;
        String str16 = null;
        String strM55618 = null;
        C21265 c212624 = null;
        String strM55993 = null;
        C17791 c17792 = null;
        C5702 c5702 = null;
        String strM56189 = null;
        C21265 c212625 = null;
        int i52 = 0;
        C21265 c212626 = null;
        C21265 c212627 = null;
        C12408 c124010 = null;
        C21265 c212628 = null;
        C21265 c212629 = null;
        int i53 = 0;
        String str17 = null;
        C15089 c15089 = null;
        C16450 c16450 = null;
        short[] sArr24 = null;
        C21265 c212630 = null;
        while (true) {
            i30 = i34 ^ (i33 & (((i30 ^ i31) * (-10671)) >> 31));
            switch (i30) {
                case -2147477561:
                case -1839295627:
                    m41885(strM56403, iM559713, c212620, strM56293, c11758);
                    m41885(C0898.m55792(f82272, 345, 2, i53), C0873.m55680(C1229.m56403(f82272, 347, 3, i53)) ^ 2102881840, C21265.f66869, C0873.m55689(f82272, 350, 19, i53), new C11087());
                    return;
                case -2112176414:
                case 1860205991:
                    sArr24 = sArr24;
                    c212627 = c212627;
                    strM56189 = strM56189;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    c212623 = c212623;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    str4 = strM55597;
                    c212610 = c212616;
                    c157510 = c157511;
                    str5 = strM55598;
                    c212617 = c212617;
                    c25168 = c25168;
                    strM55822 = strM55822;
                    c212618 = c212618;
                    c9075 = c9075;
                    strM55599 = strM55599;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr3 = sArr18;
                    sArr4 = sArr19;
                    i = iM559714;
                    iM55683 = iM55683;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i7 = i48;
                    i8 = i49;
                    i9 = iM559715;
                    c21266 = c212621;
                    i52 = i52;
                    c124010 = c124010;
                    c212625 = c212625;
                    sArr6 = sArr21;
                    C17791 c17793 = c17792;
                    c212630 = c212630;
                    c17791 = c17793;
                    short[] sArr25 = sArr15;
                    String strM56016 = C0949.m56016(sArr25, DHParameters.DEFAULT_MINIMUM_LENGTH, 2, i53);
                    sArr7 = sArr25;
                    int iM559716 = C0946.m55979(C0866.m55652(f82272, 162, 3, i53)) ^ 2103159773;
                    short[] sArr26 = f82272;
                    int iM559717 = (i31 - C0946.m55979("ܿܳ")) * 35;
                    sArr16 = sArr26;
                    i40 = iM559716;
                    i51 = i51;
                    i19 = ((iM559717 ^ i32) * 12567) ^ (-1302639150);
                    i20 = iM559717 ^ 2077878579;
                    c212611 = c212628;
                    str8 = strM56016;
                    str14 = str8;
                    c212628 = c212611;
                    sArr18 = sArr3;
                    i48 = i7;
                    i49 = i8;
                    strM55597 = str4;
                    iM559715 = i9;
                    strM55598 = str5;
                    str10 = str14;
                    c212625 = c212625;
                    c212624 = c212624;
                    sArr19 = sArr4;
                    c212616 = c212610;
                    c157511 = c157510;
                    sArr15 = sArr7;
                    i34 = i20;
                    i33 = i19;
                    sArr24 = sArr24;
                    sArr21 = sArr6;
                    c124010 = c124010;
                    str13 = str13;
                    strM55822 = strM55822;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    i52 = i52;
                    sArr13 = sArr;
                    iM559714 = i;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    str14 = str10;
                    C21265 c212631 = c212630;
                    c17792 = c17791;
                    c212630 = c212631;
                    break;
                case -2098923561:
                case -532672046:
                    c212616 = c212616;
                    c157511 = c157511;
                    strM55598 = strM55598;
                    c17791 = c17792;
                    i53 = 45924;
                    iM55979 = (i31 - C0946.m55979("ܽۧ")) * 65;
                    i13 = ((iM55979 ^ i32) * (-11393)) ^ (-749121808);
                    i15 = -2143313926;
                    i14 = iM55979 ^ i15;
                    i43 = i43;
                    i44 = i44;
                    c212621 = c212621;
                    c4382 = c4383;
                    sArr13 = sArr13;
                    iM559714 = iM559714;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr12 = sArr12;
                    sArr15 = sArr15;
                    sArr12 = sArr12;
                    strM55822 = strM55822;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    i18 = i14;
                    i33 = i13;
                    str7 = str12;
                    c4383 = c4382;
                    str17 = str17;
                    str16 = str16;
                    C21265 c212632 = c212630;
                    c17792 = c17791;
                    c212630 = c212632;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    strM55598 = strM55598;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    c212623 = c212623;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    i52 = i52;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    sArr19 = sArr19;
                    iM559715 = iM559715;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str12 = str7;
                    i34 = i18;
                    str14 = str14;
                    c212625 = c212625;
                    str13 = str13;
                    sArr24 = sArr24;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    break;
                case -2037880700:
                case 1304063582:
                    c17791 = c17792;
                    short[] sArr27 = sArr22;
                    int i54 = i50;
                    String strM55921 = C0937.m55921(sArr27, i54, 20, i53);
                    C21265 c212633 = c212619;
                    C22487 c22488 = c22487;
                    m41885(strM56203, iM559712, c212633, strM55921, c22488);
                    c212620 = C21265.f66830;
                    c11758 = new C11758();
                    strM56403 = C1229.m56403(f82272, 324, 2, i53);
                    iM559713 = C0946.m55979(ServiceConnectionC1013.m56161(f82272, 326, 3, i53)) ^ 2100251307;
                    strM56293 = C1046.m56293(f82272, 329, 16, i53);
                    int iM559718 = C0946.m55979("ᩴۡ") ^ i32;
                    i21 = ((iM559718 ^ i31) * (-20223)) ^ 2038944050;
                    i22 = iM559718 ^ 2125094120;
                    c124010 = c124010;
                    i52 = i52;
                    i51 = i51;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212624 = c212624;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    i42 = i42;
                    sArr22 = sArr27;
                    i50 = i54;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212633;
                    c22487 = c22488;
                    i34 = i22;
                    i33 = i21;
                    str13 = str13;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    sArr24 = sArr24;
                    c4383 = c4383;
                    str16 = str16;
                    c137410 = c137410;
                    str14 = str14;
                    c212625 = c212625;
                    strM55618 = strM55618;
                    C21265 c212634 = c212630;
                    c17792 = c17791;
                    c212630 = c212634;
                    break;
                case -2015537571:
                case 2981731:
                    C0845.m55584();
                    throw new RuntimeException();
                case -1912523871:
                case 1246875094:
                    sArr24 = sArr24;
                    i51 = i51;
                    c212627 = c212627;
                    strM56189 = strM56189;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM55598 = strM55598;
                    c212617 = c212617;
                    c25168 = c25168;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr10 = sArr10;
                    sArr11 = sArr11;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    i = iM559714;
                    i40 = i40;
                    i4 = iM55683;
                    i41 = i41;
                    i5 = i42;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i47 = i47;
                    i48 = i48;
                    i49 = i49;
                    iM559715 = iM559715;
                    c21266 = c212621;
                    i52 = i52;
                    c124010 = c124010;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    strM55822 = strM55822;
                    str2 = strM55599;
                    sArr21 = sArr21;
                    C17791 c17794 = c17792;
                    c212630 = c212630;
                    c17791 = c17794;
                    C0894.m55769();
                    if (C1964.f83032 <= 0) {
                        i42 = i5;
                        strM55599 = str2;
                        iM55683 = i4;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        c4381 = c4383;
                        sArr13 = sArr;
                        iM559714 = i;
                        i50 = i50;
                        int iM55684 = (i31 - C0873.m55680("۫ܰ")) * (-9);
                        c4382 = c4381;
                        i13 = ((iM55684 ^ i32) * (-14201)) ^ (-1837679458);
                        i14 = iM55684 ^ 819334028;
                        sArr12 = sArr12;
                        strM55822 = strM55822;
                        c212617 = c212617;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        i18 = i14;
                        i33 = i13;
                        str7 = str12;
                        c4383 = c4382;
                        str17 = str17;
                        str16 = str16;
                        C21265 c212635 = c212630;
                        c17792 = c17791;
                        c212630 = c212635;
                        strM56203 = strM56203;
                        iM559712 = iM559712;
                        strM55598 = strM55598;
                        sArr21 = sArr21;
                        c124010 = c124010;
                        sArr16 = sArr16;
                        c212623 = c212623;
                        i40 = i40;
                        c212620 = c212620;
                        c11758 = c11758;
                        i52 = i52;
                        i51 = i51;
                        strM56403 = strM56403;
                        c15089 = c15089;
                        c212622 = c212622;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        sArr17 = sArr17;
                        i47 = i47;
                        c212624 = c212624;
                        sArr18 = sArr18;
                        i48 = i48;
                        i49 = i49;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        sArr19 = sArr19;
                        iM559715 = iM559715;
                        c212616 = c212616;
                        c157511 = c157511;
                        strM56189 = strM56189;
                        c212627 = c212627;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        sArr22 = sArr22;
                        i50 = i50;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212619 = c212619;
                        c22487 = c22487;
                        sArr15 = sArr15;
                        str12 = str7;
                        i34 = i18;
                        str14 = str14;
                        c212625 = c212625;
                        str13 = str13;
                        sArr24 = sArr24;
                        c137410 = c137410;
                        strM55618 = strM55618;
                    }
                    strM55822 = strM55822;
                    c212617 = c212617;
                    c25168 = c25168;
                    iM55681 = C0946.m55979("֫᩶") ^ i31;
                    i16 = ((iM55681 ^ i32) * 11505) ^ 305346520;
                    i17 = 160597611;
                    i12 = iM55681 ^ i17;
                    sArr5 = sArr23;
                    str6 = str15;
                    i11 = i16;
                    iM55680 = i39;
                    i39 = iM55680;
                    i42 = i5;
                    strM55599 = str2;
                    iM55683 = i4;
                    i33 = i11;
                    str15 = str6;
                    sArr23 = sArr5;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    sArr13 = sArr;
                    iM559714 = i;
                    sArr10 = sArr10;
                    c212619 = c212619;
                    c22487 = c22487;
                    strM56203 = strM56203;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr15 = sArr15;
                    sArr22 = sArr22;
                    iM559712 = iM559712;
                    i50 = i50;
                    i18 = i12;
                    str17 = str17;
                    str7 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    C21265 c212636 = c212630;
                    c17792 = c17791;
                    c212630 = c212636;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    strM55598 = strM55598;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    c212623 = c212623;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    i52 = i52;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    sArr19 = sArr19;
                    iM559715 = iM559715;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str12 = str7;
                    i34 = i18;
                    str14 = str14;
                    c212625 = c212625;
                    str13 = str13;
                    sArr24 = sArr24;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    break;
                case -1793828967:
                case -1471996242:
                    c17791 = c17792;
                    strM55599 = C0854.m55597(sArr20, 282, 2, i53);
                    iM55683 = C0873.m55680(C1048.m56318(f82272, 284, 3, i53)) ^ 2103051908;
                    sArr21 = f82272;
                    int iM55685 = (C0873.m55680("ۙܿ") + i31) * 69;
                    i21 = ((iM55685 ^ i32) * 15481) ^ 123687557;
                    i22 = iM55685 ^ (-264210501);
                    i52 = i52;
                    i51 = i51;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212624 = c212624;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    i34 = i22;
                    i33 = i21;
                    str13 = str13;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    sArr24 = sArr24;
                    c4383 = c4383;
                    str16 = str16;
                    c137410 = c137410;
                    str14 = str14;
                    c212625 = c212625;
                    strM55618 = strM55618;
                    C21265 c212637 = c212630;
                    c17792 = c17791;
                    c212630 = c212637;
                    break;
                case -1713877737:
                case -1032230793:
                    sArr24 = sArr24;
                    i51 = i51;
                    c212627 = c212627;
                    strM56189 = strM56189;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM55598 = strM55598;
                    c212618 = c212618;
                    c9075 = c9075;
                    str2 = strM55599;
                    sArr10 = sArr10;
                    short[] sArr28 = sArr11;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    i = iM559714;
                    i40 = i40;
                    i4 = iM55683;
                    int i55 = i41;
                    i5 = i42;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i47 = i47;
                    i48 = i48;
                    i49 = i49;
                    iM559715 = iM559715;
                    c21266 = c212621;
                    c124010 = c124010;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    sArr21 = sArr21;
                    C17791 c17795 = c17792;
                    c212630 = c212630;
                    c17791 = c17795;
                    String strM55823 = C0912.m55822(sArr28, i55, i5, i53);
                    sArr11 = sArr28;
                    i41 = i55;
                    iM55680 = C0873.m55680(C1071.m56336(f82272, 45, 3, i53)) ^ 2116640865;
                    short[] sArr29 = f82272;
                    int iM55686 = C0873.m55680("ᩳ۟") ^ i32;
                    sArr5 = sArr29;
                    str6 = strM55823;
                    i11 = ((iM55686 ^ i31) * 15505) ^ (-1288751194);
                    i12 = iM55686 ^ (-633118200);
                    i52 = 48;
                    i39 = iM55680;
                    i42 = i5;
                    strM55599 = str2;
                    iM55683 = i4;
                    i33 = i11;
                    str15 = str6;
                    sArr23 = sArr5;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    sArr13 = sArr;
                    iM559714 = i;
                    sArr10 = sArr10;
                    c212619 = c212619;
                    c22487 = c22487;
                    strM56203 = strM56203;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr15 = sArr15;
                    sArr22 = sArr22;
                    iM559712 = iM559712;
                    i50 = i50;
                    i18 = i12;
                    str17 = str17;
                    str7 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    C21265 c212638 = c212630;
                    c17792 = c17791;
                    c212630 = c212638;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    strM55598 = strM55598;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    c212623 = c212623;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    i52 = i52;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    sArr19 = sArr19;
                    iM559715 = iM559715;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str12 = str7;
                    i34 = i18;
                    str14 = str14;
                    c212625 = c212625;
                    str13 = str13;
                    sArr24 = sArr24;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    break;
                case -1578796951:
                case -1347010300:
                    sArr24 = sArr24;
                    i51 = i51;
                    c212627 = c212627;
                    strM56189 = strM56189;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    str12 = str12;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM55598 = strM55598;
                    c212617 = c212617;
                    c25168 = c25168;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr10 = sArr10;
                    short[] sArr30 = sArr13;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    int i56 = iM559714;
                    i40 = i40;
                    int i57 = iM55683;
                    int i58 = i43;
                    int i59 = i44;
                    i45 = i45;
                    i46 = i46;
                    i47 = i47;
                    i48 = i48;
                    i49 = i49;
                    iM559715 = iM559715;
                    i52 = i52;
                    c124010 = c124010;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    strM55822 = strM55822;
                    String str18 = strM55599;
                    sArr21 = sArr21;
                    C17791 c17796 = c17792;
                    c212630 = c212630;
                    c17791 = c17796;
                    f54941 = new HashSet();
                    f54943 = new LinkedHashMap();
                    f54940 = new C6724();
                    m41901();
                    c212621 = C21265.f66822;
                    C4381 c4384 = new C4381();
                    String strM55717 = C0882.m55717(f82272, 1, 2, i53);
                    iM55682 = C0873.m55680(C0937.m55921(f82272, 3, 3, i53));
                    if (C1194.f82045 != 0) {
                        strM55599 = str18;
                        iM55683 = i57;
                        i43 = i58;
                        i44 = i59;
                        c4381 = c4384;
                        str17 = strM55717;
                        sArr13 = sArr30;
                        iM559714 = i56;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        i50 = i50;
                        int iM55687 = (i31 - C0873.m55680("۫ܰ")) * (-9);
                        c4382 = c4381;
                        i13 = ((iM55687 ^ i32) * (-14201)) ^ (-1837679458);
                        i14 = iM55687 ^ 819334028;
                    } else {
                        int iM559719 = C0946.m55979("ۛ᩶") ^ i32;
                        i13 = ((iM559719 ^ i31) * (-18651)) ^ (-44402663);
                        i14 = iM559719 ^ (-1061091991);
                        strM55599 = str18;
                        iM55683 = i57;
                        i43 = i58;
                        i44 = i59;
                        sArr13 = sArr30;
                        iM559714 = i56;
                        c212619 = c212619;
                        c22487 = c22487;
                        strM56203 = strM56203;
                        c212620 = c212620;
                        c11758 = c11758;
                        strM56403 = strM56403;
                        sArr11 = sArr11;
                        sArr12 = sArr12;
                        sArr15 = sArr15;
                        sArr22 = sArr22;
                        iM559712 = iM559712;
                        i41 = i41;
                        i42 = i42;
                        i50 = i50;
                        c4382 = c4384;
                        str17 = strM55717;
                    }
                    sArr12 = sArr12;
                    strM55822 = strM55822;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    i18 = i14;
                    i33 = i13;
                    str7 = str12;
                    c4383 = c4382;
                    str17 = str17;
                    str16 = str16;
                    C21265 c212639 = c212630;
                    c17792 = c17791;
                    c212630 = c212639;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    strM55598 = strM55598;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    c212623 = c212623;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    i52 = i52;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    sArr19 = sArr19;
                    iM559715 = iM559715;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str12 = str7;
                    i34 = i18;
                    str14 = str14;
                    c212625 = c212625;
                    str13 = str13;
                    sArr24 = sArr24;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    break;
                case -1412611244:
                case -755705354:
                    sArr24 = sArr24;
                    i23 = i51;
                    C21265 c212640 = c212627;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212612 = c212615;
                    c24478 = c24479;
                    str4 = strM55597;
                    c212610 = c212616;
                    c157510 = c157511;
                    str5 = strM55598;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr8 = sArr16;
                    sArr9 = sArr17;
                    sArr3 = sArr18;
                    sArr4 = sArr19;
                    i = iM559714;
                    i24 = i40;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i25 = i47;
                    i7 = i48;
                    i8 = i49;
                    i9 = iM559715;
                    c21266 = c212621;
                    i52 = i52;
                    String str19 = strM56189;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    strM55822 = strM55822;
                    c124010 = c124010;
                    C17791 c17797 = c17792;
                    c212630 = c212630;
                    c17791 = c17797;
                    short[] sArr31 = sArr21;
                    String strM56093 = C0989.m56092(sArr31, 287, 12, i53);
                    sArr6 = sArr31;
                    strM56189 = str19;
                    c212627 = c212640;
                    C21265 c212641 = c212618;
                    C9075 c9076 = c9075;
                    str9 = strM55599;
                    i26 = iM55683;
                    m41885(str9, i26, c212641, strM56093, c9076);
                    c212619 = C21265.f66826;
                    c22487 = new C22487();
                    c212618 = c212641;
                    c9075 = c9076;
                    strM56203 = C1024.m56203(f82272, 299, 2, i53);
                    iM559712 = C0946.m55979(C1048.m56318(f82272, 301, 3, i53)) ^ 2103304689;
                    sArr22 = f82272;
                    if (C0949.f81897 < 0) {
                        int iM55688 = C0873.m55680("᩺ܺ") ^ i32;
                        c212618 = c212618;
                        c9075 = c9075;
                        i50 = 304;
                        i27 = iM55688 ^ (-1588680914);
                        i33 = ((iM55688 ^ i31) * 1953) ^ (-237636521);
                        strM55599 = str9;
                        iM55683 = i26;
                        strM55598 = str5;
                        sArr21 = sArr6;
                        c124010 = c124010;
                        sArr16 = sArr8;
                        strM55822 = strM55822;
                        i40 = i24;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        i52 = i52;
                        i51 = i23;
                        sArr13 = sArr;
                        iM559714 = i;
                        c15089 = c15089;
                        c212622 = c212622;
                        c212617 = c212617;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        sArr17 = sArr9;
                        i47 = i25;
                        c212624 = c212624;
                        sArr18 = sArr3;
                        i48 = i7;
                        i49 = i8;
                        c212615 = c212612;
                        c24479 = c24478;
                        strM55597 = str4;
                        sArr19 = sArr4;
                        iM559715 = i9;
                        c212616 = c212610;
                        c157511 = c157510;
                        strM56189 = strM56189;
                        c212627 = c212627;
                        i34 = i27;
                        str13 = str13;
                        c212623 = c212623;
                        str17 = str17;
                        str12 = str12;
                        sArr24 = sArr24;
                        c4383 = c4383;
                        str16 = str16;
                        c137410 = c137410;
                        str14 = str14;
                        c212625 = c212625;
                        strM55618 = strM55618;
                        C21265 c2126310 = c212630;
                        c17792 = c17791;
                        c212630 = c2126310;
                    } else {
                        i50 = 304;
                        sArr24 = sArr24;
                        sArr17 = sArr9;
                        i47 = i25;
                        c212615 = c212612;
                        c24479 = c24478;
                        int iM55689 = C0873.m55680("ۘᩳ") ^ i32;
                        int i60 = ((iM55689 ^ i31) * (-12957)) ^ 706432957;
                        i20 = iM55689 ^ 569551520;
                        sArr24 = sArr24;
                        i19 = i60;
                        strM55599 = str9;
                        iM55683 = i26;
                        c212611 = c212628;
                        str8 = str14;
                        sArr16 = sArr8;
                        i40 = i24;
                        i51 = i23;
                        sArr7 = sArr15;
                        str14 = str8;
                        c212628 = c212611;
                        sArr18 = sArr3;
                        i48 = i7;
                        i49 = i8;
                        strM55597 = str4;
                        iM559715 = i9;
                        strM55598 = str5;
                        str10 = str14;
                        c212625 = c212625;
                        c212624 = c212624;
                        sArr19 = sArr4;
                        c212616 = c212610;
                        c157511 = c157510;
                        sArr15 = sArr7;
                        i34 = i20;
                        i33 = i19;
                        sArr24 = sArr24;
                        sArr21 = sArr6;
                        c124010 = c124010;
                        str13 = str13;
                        strM55822 = strM55822;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        i52 = i52;
                        sArr13 = sArr;
                        iM559714 = i;
                        c15089 = c15089;
                        c212622 = c212622;
                        c212617 = c212617;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        c137410 = c137410;
                        strM55618 = strM55618;
                        strM56189 = strM56189;
                        c212627 = c212627;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212623 = c212623;
                        str17 = str17;
                        str12 = str12;
                        c4383 = c4383;
                        str16 = str16;
                        str14 = str10;
                        C21265 c2126311 = c212630;
                        c17792 = c17791;
                        c212630 = c2126311;
                    }
                    break;
                case -1219939504:
                case 1410940389:
                    sArr24 = sArr24;
                    i51 = i51;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str14 = str14;
                    c212623 = c212623;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c21269 = c212615;
                    c24477 = c24479;
                    str4 = strM55597;
                    c212617 = c212617;
                    c25168 = c25168;
                    strM55822 = strM55822;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    sArr2 = sArr17;
                    sArr3 = sArr18;
                    sArr4 = sArr19;
                    i = iM559714;
                    i40 = i40;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i6 = i47;
                    i7 = i48;
                    i8 = i49;
                    i9 = iM559715;
                    c21266 = c212621;
                    i52 = i52;
                    C17791 c17798 = c17792;
                    c212630 = c212630;
                    c17791 = c17798;
                    c212610 = c212616;
                    c157510 = c157511;
                    c12408 = c124010;
                    str3 = strM56189;
                    C21265 c212642 = c212627;
                    str5 = strM55598;
                    c21267 = c212642;
                    m41885(str3, i35 ^ 2116467444, c21267, C0894.m55773(f82272, 116, 18, i53), c12408);
                    c21268 = C21265.f66835;
                    if (C1025.f81947 < 0) {
                        c8384 = new C8384();
                        c212613 = c21268;
                        c12409 = c12408;
                        strM55618 = C0861.m55618(f82272, 134, 2, i53);
                        int iM556810 = C0873.m55680(RunnableC0871.m55667(f82272, 136, 3, i53));
                        int iM559720 = C0946.m55979("᩺۠") ^ i32;
                        int i61 = ((iM559720 ^ i31) * 30433) ^ (-879441457);
                        i28 = iM559720 ^ (-1945769661);
                        i36 = iM556810;
                        i33 = i61;
                        i37 = 2098122310;
                        strM55598 = str5;
                        sArr16 = sArr16;
                        strM55822 = strM55822;
                        i40 = i40;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        sArr24 = sArr24;
                        sArr13 = sArr;
                        iM559714 = i;
                        c15089 = c15089;
                        c212622 = c212622;
                        c212617 = c212617;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        sArr17 = sArr2;
                        i47 = i6;
                        c212624 = c212624;
                        sArr18 = sArr3;
                        i48 = i7;
                        i49 = i8;
                        c212615 = c21269;
                        c24479 = c24477;
                        strM55597 = str4;
                        sArr19 = sArr4;
                        iM559715 = i9;
                        c212616 = c212610;
                        c157511 = c157510;
                        i34 = i28;
                        c212627 = c21267;
                        str13 = str13;
                        c212623 = c212623;
                        str17 = str17;
                        i51 = i51;
                        str16 = str16;
                        c137410 = c137410;
                        str14 = str14;
                        c212625 = c212613;
                        c124010 = c12409;
                        strM56189 = str3;
                        i52 = i52;
                        str12 = str12;
                        c4383 = c4383;
                        C21265 c2126312 = c212630;
                        c17792 = c17791;
                        c212630 = c2126312;
                    }
                    int iM556811 = (C0873.m55680("۫᩻") + i32) * (-123);
                    C21265 c212643 = c21268;
                    int i62 = ((iM556811 ^ i31) * 20761) ^ 2057538754;
                    int i63 = iM556811 ^ 1849197110;
                    c124010 = c12408;
                    strM56189 = str3;
                    c212627 = c21267;
                    c212625 = c212643;
                    c8384 = null;
                    sArr16 = sArr16;
                    i40 = i40;
                    i51 = i51;
                    sArr17 = sArr2;
                    i47 = i6;
                    c212615 = c21269;
                    c24479 = c24477;
                    c212618 = c212618;
                    c9075 = c9075;
                    strM55599 = strM55599;
                    sArr11 = sArr11;
                    sArr7 = sArr15;
                    sArr6 = sArr21;
                    iM55683 = iM55683;
                    i41 = i41;
                    i42 = i42;
                    i19 = i62;
                    i20 = i63;
                    sArr18 = sArr3;
                    i48 = i7;
                    i49 = i8;
                    strM55597 = str4;
                    iM559715 = i9;
                    strM55598 = str5;
                    str10 = str14;
                    c212625 = c212625;
                    c212624 = c212624;
                    sArr19 = sArr4;
                    c212616 = c212610;
                    c157511 = c157510;
                    sArr15 = sArr7;
                    i34 = i20;
                    i33 = i19;
                    sArr24 = sArr24;
                    sArr21 = sArr6;
                    c124010 = c124010;
                    str13 = str13;
                    strM55822 = strM55822;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    i52 = i52;
                    sArr13 = sArr;
                    iM559714 = i;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    str14 = str10;
                    C21265 c2126313 = c212630;
                    c17792 = c17791;
                    c212630 = c2126313;
                    break;
                case -895464615:
                case 1185009804:
                    c17791 = c17792;
                    c212616 = c212616;
                    c157511 = c157511;
                    i53 = 62959;
                    strM55598 = strM55598;
                    iM55979 = (i31 - C0946.m55979("ܽۧ")) * 65;
                    i13 = ((iM55979 ^ i32) * (-11393)) ^ (-749121808);
                    i15 = -2143313926;
                    i14 = iM55979 ^ i15;
                    i43 = i43;
                    i44 = i44;
                    c212621 = c212621;
                    c4382 = c4383;
                    sArr13 = sArr13;
                    iM559714 = iM559714;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr12 = sArr12;
                    sArr15 = sArr15;
                    sArr12 = sArr12;
                    strM55822 = strM55822;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    i18 = i14;
                    i33 = i13;
                    str7 = str12;
                    c4383 = c4382;
                    str17 = str17;
                    str16 = str16;
                    C21265 c2126314 = c212630;
                    c17792 = c17791;
                    c212630 = c2126314;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    strM55598 = strM55598;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    c212623 = c212623;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    i52 = i52;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    sArr19 = sArr19;
                    iM559715 = iM559715;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str12 = str7;
                    i34 = i18;
                    str14 = str14;
                    c212625 = c212625;
                    str13 = str13;
                    sArr24 = sArr24;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    break;
                case -855264949:
                case 1675247316:
                    sArr24 = sArr24;
                    i51 = i51;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    c21265 = c212616;
                    str = strM55598;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    i = iM559714;
                    i40 = i40;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i47 = i47;
                    i48 = i48;
                    i49 = i49;
                    iM559715 = iM559715;
                    c21266 = c212621;
                    i52 = i52;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    c15759 = c157511;
                    strM55822 = strM55822;
                    C17791 c17799 = c17792;
                    c212630 = c212630;
                    c17791 = c17799;
                    C1929.m56553();
                    if (C0949.f81897 >= 0) {
                        c212616 = c21265;
                        c157511 = c15759;
                        strM55598 = str;
                        sArr19 = sArr19;
                        int iM559721 = (i31 - C0946.m55979("ܶ᩵")) * (-73);
                        i10 = iM559721 ^ 1893676964;
                        i33 = ((iM559721 ^ i32) * 24731) ^ 1763996843;
                        strM56189 = strM56189;
                        i43 = i2;
                        i44 = i3;
                        sArr13 = sArr;
                        iM559714 = i;
                        c212618 = c212618;
                        c9075 = c9075;
                        strM55599 = strM55599;
                        c212619 = c212619;
                        c22487 = c22487;
                        strM56203 = strM56203;
                        c212620 = c212620;
                        c11758 = c11758;
                        strM56403 = strM56403;
                        sArr11 = sArr11;
                        sArr12 = sArr12;
                        sArr15 = sArr15;
                        sArr22 = sArr22;
                        iM559712 = iM559712;
                        iM55683 = iM55683;
                        i41 = i41;
                        i42 = i42;
                        i50 = i50;
                        c124010 = c124010;
                        sArr21 = sArr21;
                        i34 = i10;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        sArr12 = sArr12;
                        strM56203 = strM56203;
                        iM559712 = iM559712;
                        sArr21 = sArr21;
                        c124010 = c124010;
                        sArr16 = sArr16;
                        strM55822 = strM55822;
                        i40 = i40;
                        c212620 = c212620;
                        c11758 = c11758;
                        c212621 = c21266;
                        i52 = i52;
                        sArr24 = sArr24;
                        i51 = i51;
                        strM56403 = strM56403;
                        c15089 = c15089;
                        c212622 = c212622;
                        c212617 = c212617;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        sArr17 = sArr17;
                        i47 = i47;
                        c212624 = c212624;
                        sArr18 = sArr18;
                        i48 = i48;
                        i49 = i49;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        iM559715 = iM559715;
                        strM56189 = strM56189;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        sArr22 = sArr22;
                        i50 = i50;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212619 = c212619;
                        c22487 = c22487;
                        sArr15 = sArr15;
                        str13 = str13;
                        c212623 = c212623;
                        str17 = str17;
                        str12 = str12;
                        c4383 = c4383;
                        str16 = str16;
                        c137410 = c137410;
                        str14 = str14;
                        c212625 = c212625;
                        strM55618 = strM55618;
                        C21265 c2126315 = c212630;
                        c17792 = c17791;
                        c212630 = c2126315;
                    } else {
                        c212616 = c21265;
                        c157511 = c15759;
                        c212627 = c212627;
                        strM56189 = strM56189;
                        c212618 = c212618;
                        c9075 = c9075;
                        str2 = strM55599;
                        sArr11 = sArr11;
                        i41 = i41;
                        i5 = i42;
                        strM55598 = str;
                        c124010 = c124010;
                        sArr21 = sArr21;
                        i4 = iM55683;
                        strM55822 = strM55822;
                        c212617 = c212617;
                        c25168 = c25168;
                        iM55681 = C0946.m55979("֫᩶") ^ i31;
                        i16 = ((iM55681 ^ i32) * 11505) ^ 305346520;
                        i17 = 160597611;
                        i12 = iM55681 ^ i17;
                        sArr5 = sArr23;
                        str6 = str15;
                        i11 = i16;
                        iM55680 = i39;
                        i39 = iM55680;
                        i42 = i5;
                        strM55599 = str2;
                        iM55683 = i4;
                        i33 = i11;
                        str15 = str6;
                        sArr23 = sArr5;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        sArr13 = sArr;
                        iM559714 = i;
                        sArr10 = sArr10;
                        c212619 = c212619;
                        c22487 = c22487;
                        strM56203 = strM56203;
                        c212620 = c212620;
                        c11758 = c11758;
                        strM56403 = strM56403;
                        sArr15 = sArr15;
                        sArr22 = sArr22;
                        iM559712 = iM559712;
                        i50 = i50;
                        i18 = i12;
                        str17 = str17;
                        str7 = str12;
                        c4383 = c4383;
                        str16 = str16;
                        C21265 c2126316 = c212630;
                        c17792 = c17791;
                        c212630 = c2126316;
                        strM56203 = strM56203;
                        iM559712 = iM559712;
                        strM55598 = strM55598;
                        sArr21 = sArr21;
                        c124010 = c124010;
                        sArr16 = sArr16;
                        c212623 = c212623;
                        i40 = i40;
                        c212620 = c212620;
                        c11758 = c11758;
                        i52 = i52;
                        i51 = i51;
                        strM56403 = strM56403;
                        c15089 = c15089;
                        c212622 = c212622;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        sArr17 = sArr17;
                        i47 = i47;
                        c212624 = c212624;
                        sArr18 = sArr18;
                        i48 = i48;
                        i49 = i49;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        sArr19 = sArr19;
                        iM559715 = iM559715;
                        c212616 = c212616;
                        c157511 = c157511;
                        strM56189 = strM56189;
                        c212627 = c212627;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        sArr22 = sArr22;
                        i50 = i50;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212619 = c212619;
                        c22487 = c22487;
                        sArr15 = sArr15;
                        str12 = str7;
                        i34 = i18;
                        str14 = str14;
                        c212625 = c212625;
                        str13 = str13;
                        sArr24 = sArr24;
                        c137410 = c137410;
                        strM55618 = strM55618;
                    }
                    break;
                case -806759356:
                case -123162670:
                    sArr24 = sArr24;
                    i51 = i51;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    c21265 = c212616;
                    str = strM55598;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    i = iM559714;
                    i40 = i40;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i47 = i47;
                    i48 = i48;
                    i49 = i49;
                    iM559715 = iM559715;
                    c21266 = c212621;
                    i52 = i52;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    c15759 = c157511;
                    strM55822 = strM55822;
                    C17791 c177910 = c17792;
                    c212630 = c212630;
                    c17791 = c177910;
                    C0898.m55800();
                    C1124.m56367();
                    c212616 = c21265;
                    c157511 = c15759;
                    c212627 = c212627;
                    strM56189 = strM56189;
                    c212618 = c212618;
                    c9075 = c9075;
                    str2 = strM55599;
                    sArr11 = sArr11;
                    i41 = i41;
                    i5 = i42;
                    strM55598 = str;
                    c124010 = c124010;
                    sArr21 = sArr21;
                    i4 = iM55683;
                    strM55822 = strM55822;
                    c212617 = c212617;
                    c25168 = c25168;
                    iM55681 = C0946.m55979("֫᩶") ^ i31;
                    i16 = ((iM55681 ^ i32) * 11505) ^ 305346520;
                    i17 = 160597611;
                    i12 = iM55681 ^ i17;
                    sArr5 = sArr23;
                    str6 = str15;
                    i11 = i16;
                    iM55680 = i39;
                    i39 = iM55680;
                    i42 = i5;
                    strM55599 = str2;
                    iM55683 = i4;
                    i33 = i11;
                    str15 = str6;
                    sArr23 = sArr5;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    sArr13 = sArr;
                    iM559714 = i;
                    sArr10 = sArr10;
                    c212619 = c212619;
                    c22487 = c22487;
                    strM56203 = strM56203;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr15 = sArr15;
                    sArr22 = sArr22;
                    iM559712 = iM559712;
                    i50 = i50;
                    i18 = i12;
                    str17 = str17;
                    str7 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    C21265 c2126317 = c212630;
                    c17792 = c17791;
                    c212630 = c2126317;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    strM55598 = strM55598;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    c212623 = c212623;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    i52 = i52;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    sArr19 = sArr19;
                    iM559715 = iM559715;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str12 = str7;
                    i34 = i18;
                    str14 = str14;
                    c212625 = c212625;
                    str13 = str13;
                    sArr24 = sArr24;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    break;
                case -775317984:
                case 717241512:
                    sArr24 = sArr24;
                    int i64 = i51;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr3 = sArr18;
                    i = iM559714;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i7 = i48;
                    i8 = i49;
                    c21266 = c212621;
                    i52 = i52;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    strM55822 = strM55822;
                    C17791 c177911 = c17792;
                    c212630 = c212630;
                    c17791 = c177911;
                    short[] sArr32 = sArr19;
                    str4 = strM55597;
                    sArr4 = sArr32;
                    i9 = iM559715;
                    C21265 c212644 = c212616;
                    C15759 c157512 = c157511;
                    String str20 = strM55598;
                    m41885(str20, C0873.m55680(C0877.m55707(sArr32, 201, 3, i53)) ^ 2101718840, c212644, C1404.m56462(f82272, 204, 16, i53), c157512);
                    int iM559722 = (C0946.m55979("۫ܳ") + i32) * 87;
                    i19 = ((iM559722 ^ i31) * 18257) ^ 1715213982;
                    i20 = iM559722 ^ 1712538378;
                    c212610 = c212644;
                    c157510 = c157512;
                    c212627 = c212627;
                    strM56189 = strM56189;
                    c212618 = c212618;
                    c9075 = c9075;
                    strM55599 = strM55599;
                    sArr11 = sArr11;
                    sArr7 = sArr15;
                    iM55683 = iM55683;
                    i41 = i41;
                    i42 = i42;
                    str5 = str20;
                    c124010 = c124010;
                    i51 = i64;
                    sArr6 = sArr21;
                    sArr18 = sArr3;
                    i48 = i7;
                    i49 = i8;
                    strM55597 = str4;
                    iM559715 = i9;
                    strM55598 = str5;
                    str10 = str14;
                    c212625 = c212625;
                    c212624 = c212624;
                    sArr19 = sArr4;
                    c212616 = c212610;
                    c157511 = c157510;
                    sArr15 = sArr7;
                    i34 = i20;
                    i33 = i19;
                    sArr24 = sArr24;
                    sArr21 = sArr6;
                    c124010 = c124010;
                    str13 = str13;
                    strM55822 = strM55822;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    i52 = i52;
                    sArr13 = sArr;
                    iM559714 = i;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    str14 = str10;
                    C21265 c2126318 = c212630;
                    c17792 = c17791;
                    c212630 = c2126318;
                    break;
                case -698078504:
                case 1521476052:
                    sArr24 = sArr24;
                    i51 = i51;
                    String str21 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    short[] sArr33 = sArr18;
                    i = iM559714;
                    i40 = i40;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i47 = i47;
                    int i65 = i48;
                    int i66 = i49;
                    c21266 = c212621;
                    i52 = i52;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    strM55822 = strM55822;
                    C17791 c177912 = c17792;
                    c212630 = c212630;
                    c17791 = c177912;
                    String strM56252 = C1036.m56252(sArr33, i65, i66, i53);
                    sArr18 = sArr33;
                    i48 = i65;
                    i49 = i66;
                    strM55618 = str21;
                    C21265 c212645 = c212615;
                    C24477 c244710 = c24479;
                    String str22 = strM55597;
                    int i67 = iM559715;
                    m41885(str22, i67, c212645, strM56252, c244710);
                    c212616 = C21265.f66876;
                    c157511 = new C15759();
                    c212615 = c212645;
                    c24479 = c244710;
                    strM55598 = C0854.m55597(f82272, 199, 2, i53);
                    sArr19 = f82272;
                    if (C0854.f81826 == 0) {
                        int iM556812 = C0873.m55680("ܽۗ") ^ i31;
                        i34 = iM556812 ^ (-1534082673);
                        i33 = ((iM556812 ^ i32) * (-2029)) ^ 1751928061;
                        strM55597 = str22;
                        iM559715 = i67;
                        str10 = str14;
                        c212625 = c212625;
                        sArr16 = sArr16;
                        i40 = i40;
                        sArr24 = sArr24;
                        i51 = i51;
                        sArr17 = sArr17;
                        i47 = i47;
                        c212624 = c212624;
                        sArr18 = sArr18;
                        i48 = i48;
                        i49 = i49;
                        c212615 = c212615;
                        c24479 = c24479;
                        sArr6 = sArr21;
                        sArr21 = sArr6;
                        c124010 = c124010;
                        str13 = str13;
                        strM55822 = strM55822;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        i52 = i52;
                        sArr13 = sArr;
                        iM559714 = i;
                        c15089 = c15089;
                        c212622 = c212622;
                        c212617 = c212617;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        c137410 = c137410;
                        strM55618 = strM55618;
                        strM56189 = strM56189;
                        c212627 = c212627;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212623 = c212623;
                        str17 = str17;
                        str12 = str12;
                        c4383 = c4383;
                        str16 = str16;
                        str14 = str10;
                        C21265 c2126319 = c212630;
                        c17792 = c17791;
                        c212630 = c2126319;
                    } else {
                        strM55597 = str22;
                        iM559715 = i67;
                        int iM559723 = (i31 - C0946.m55979("ܶ᩵")) * (-73);
                        i10 = iM559723 ^ 1893676964;
                        i33 = ((iM559723 ^ i32) * 24731) ^ 1763996843;
                        strM56189 = strM56189;
                        i43 = i2;
                        i44 = i3;
                        sArr13 = sArr;
                        iM559714 = i;
                        c212618 = c212618;
                        c9075 = c9075;
                        strM55599 = strM55599;
                        c212619 = c212619;
                        c22487 = c22487;
                        strM56203 = strM56203;
                        c212620 = c212620;
                        c11758 = c11758;
                        strM56403 = strM56403;
                        sArr11 = sArr11;
                        sArr12 = sArr12;
                        sArr15 = sArr15;
                        sArr22 = sArr22;
                        iM559712 = iM559712;
                        iM55683 = iM55683;
                        i41 = i41;
                        i42 = i42;
                        i50 = i50;
                        c124010 = c124010;
                        sArr21 = sArr21;
                        i34 = i10;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        sArr12 = sArr12;
                        strM56203 = strM56203;
                        iM559712 = iM559712;
                        sArr21 = sArr21;
                        c124010 = c124010;
                        sArr16 = sArr16;
                        strM55822 = strM55822;
                        i40 = i40;
                        c212620 = c212620;
                        c11758 = c11758;
                        c212621 = c21266;
                        i52 = i52;
                        sArr24 = sArr24;
                        i51 = i51;
                        strM56403 = strM56403;
                        c15089 = c15089;
                        c212622 = c212622;
                        c212617 = c212617;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        sArr17 = sArr17;
                        i47 = i47;
                        c212624 = c212624;
                        sArr18 = sArr18;
                        i48 = i48;
                        i49 = i49;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        iM559715 = iM559715;
                        strM56189 = strM56189;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        sArr22 = sArr22;
                        i50 = i50;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212619 = c212619;
                        c22487 = c22487;
                        sArr15 = sArr15;
                        str13 = str13;
                        c212623 = c212623;
                        str17 = str17;
                        str12 = str12;
                        c4383 = c4383;
                        str16 = str16;
                        c137410 = c137410;
                        str14 = str14;
                        c212625 = c212625;
                        strM55618 = strM55618;
                        C21265 c21263110 = c212630;
                        c17792 = c17791;
                        c212630 = c21263110;
                    }
                    break;
                case -420699527:
                case 1558993222:
                    sArr24 = sArr24;
                    int i68 = i51;
                    String str23 = strM55618;
                    C13749 c137411 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    i = iM559714;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    c21266 = c212621;
                    i52 = i52;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    strM55822 = strM55822;
                    C17791 c177913 = c17792;
                    c212630 = c212630;
                    c17791 = c177913;
                    c137410 = c137411;
                    short[] sArr34 = sArr17;
                    int i69 = i47;
                    strM55597 = C0854.m55597(sArr34, i69, 2, i53);
                    iM559715 = C0946.m55979(C1017.m56189(f82272, 180, 3, i53)) ^ 2103266009;
                    sArr18 = f82272;
                    i48 = 183;
                    i49 = 16;
                    int iM559724 = C0946.m55979("᩶᩶") ^ i32;
                    i19 = ((iM559724 ^ i31) * 25687) ^ 1411403463;
                    i20 = iM559724 ^ 982552936;
                    c212624 = c212624;
                    strM55618 = str23;
                    c212627 = c212627;
                    strM56189 = strM56189;
                    i51 = i68;
                    sArr17 = sArr34;
                    i47 = i69;
                    c212610 = c212616;
                    c157510 = c157511;
                    str5 = strM55598;
                    c212618 = c212618;
                    c9075 = c9075;
                    strM55599 = strM55599;
                    sArr11 = sArr11;
                    sArr7 = sArr15;
                    sArr4 = sArr19;
                    iM55683 = iM55683;
                    i41 = i41;
                    i42 = i42;
                    c124010 = c124010;
                    sArr6 = sArr21;
                    strM55598 = str5;
                    str10 = str14;
                    c212625 = c212625;
                    c212624 = c212624;
                    sArr19 = sArr4;
                    c212616 = c212610;
                    c157511 = c157510;
                    sArr15 = sArr7;
                    i34 = i20;
                    i33 = i19;
                    sArr24 = sArr24;
                    sArr21 = sArr6;
                    c124010 = c124010;
                    str13 = str13;
                    strM55822 = strM55822;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    i52 = i52;
                    sArr13 = sArr;
                    iM559714 = i;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    str14 = str10;
                    C21265 c21263111 = c212630;
                    c17792 = c17791;
                    c212630 = c21263111;
                    break;
                case -337001653:
                case 459792598:
                    sArr24 = sArr24;
                    i51 = i51;
                    String str24 = strM55618;
                    C13749 c137412 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    i = iM559714;
                    i40 = i40;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    c21266 = c212621;
                    i52 = i52;
                    c212625 = c212625;
                    C21265 c212646 = c212624;
                    str14 = str14;
                    c212623 = c212623;
                    strM55822 = strM55822;
                    sArr16 = sArr16;
                    C17791 c177914 = c17792;
                    c212630 = c212630;
                    c17791 = c177914;
                    C1053.m56327();
                    c137410 = c137412;
                    c212624 = c212646;
                    strM55618 = str24;
                    if (!C0866.m55645()) {
                        c21267 = c212627;
                        c12408 = c124010;
                        str3 = strM56189;
                        c21268 = c212625;
                        c21269 = c212615;
                        c24477 = c24479;
                        str4 = strM55597;
                        c212610 = c212616;
                        c157510 = c157511;
                        str5 = strM55598;
                        sArr2 = sArr17;
                        sArr3 = sArr18;
                        sArr4 = sArr19;
                        i6 = i47;
                        i7 = i48;
                        i8 = i49;
                        i9 = iM559715;
                        int iM556813 = (C0873.m55680("۫᩻") + i32) * (-123);
                        C21265 c212647 = c21268;
                        int i610 = ((iM556813 ^ i31) * 20761) ^ 2057538754;
                        int i611 = iM556813 ^ 1849197110;
                        c124010 = c12408;
                        strM56189 = str3;
                        c212627 = c21267;
                        c212625 = c212647;
                        c8384 = null;
                        sArr16 = sArr16;
                        i40 = i40;
                        i51 = i51;
                        sArr17 = sArr2;
                        i47 = i6;
                        c212615 = c21269;
                        c24479 = c24477;
                        c212618 = c212618;
                        c9075 = c9075;
                        strM55599 = strM55599;
                        sArr11 = sArr11;
                        sArr7 = sArr15;
                        sArr6 = sArr21;
                        iM55683 = iM55683;
                        i41 = i41;
                        i42 = i42;
                        i19 = i610;
                        i20 = i611;
                        sArr18 = sArr3;
                        i48 = i7;
                        i49 = i8;
                        strM55597 = str4;
                        iM559715 = i9;
                        strM55598 = str5;
                        str10 = str14;
                        c212625 = c212625;
                        c212624 = c212624;
                        sArr19 = sArr4;
                        c212616 = c212610;
                        c157511 = c157510;
                        sArr15 = sArr7;
                        i34 = i20;
                        i33 = i19;
                        sArr24 = sArr24;
                        sArr21 = sArr6;
                        c124010 = c124010;
                        str13 = str13;
                        strM55822 = strM55822;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        i52 = i52;
                        sArr13 = sArr;
                        iM559714 = i;
                        c15089 = c15089;
                        c212622 = c212622;
                        c212617 = c212617;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        c137410 = c137410;
                        strM55618 = strM55618;
                        strM56189 = strM56189;
                        c212627 = c212627;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212623 = c212623;
                        str17 = str17;
                        str12 = str12;
                        c4383 = c4383;
                        str16 = str16;
                        str14 = str10;
                        C21265 c21263112 = c212630;
                        c17792 = c17791;
                        c212630 = c21263112;
                    } else {
                        c212627 = c212627;
                        strM56189 = strM56189;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        c212616 = c212616;
                        c157511 = c157511;
                        strM55598 = strM55598;
                        c212618 = c212618;
                        c9075 = c9075;
                        str2 = strM55599;
                        sArr11 = sArr11;
                        sArr17 = sArr17;
                        sArr18 = sArr18;
                        sArr19 = sArr19;
                        i4 = iM55683;
                        i41 = i41;
                        i5 = i42;
                        i47 = i47;
                        i48 = i48;
                        i49 = i49;
                        iM559715 = iM559715;
                        c124010 = c124010;
                        sArr21 = sArr21;
                        strM55822 = strM55822;
                        c212617 = c212617;
                        c25168 = c25168;
                        iM55681 = C0946.m55979("֫᩶") ^ i31;
                        i16 = ((iM55681 ^ i32) * 11505) ^ 305346520;
                        i17 = 160597611;
                        i12 = iM55681 ^ i17;
                        sArr5 = sArr23;
                        str6 = str15;
                        i11 = i16;
                        iM55680 = i39;
                        i39 = iM55680;
                        i42 = i5;
                        strM55599 = str2;
                        iM55683 = i4;
                        i33 = i11;
                        str15 = str6;
                        sArr23 = sArr5;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        sArr13 = sArr;
                        iM559714 = i;
                        sArr10 = sArr10;
                        c212619 = c212619;
                        c22487 = c22487;
                        strM56203 = strM56203;
                        c212620 = c212620;
                        c11758 = c11758;
                        strM56403 = strM56403;
                        sArr15 = sArr15;
                        sArr22 = sArr22;
                        iM559712 = iM559712;
                        i50 = i50;
                        i18 = i12;
                        str17 = str17;
                        str7 = str12;
                        c4383 = c4383;
                        str16 = str16;
                        C21265 c21263113 = c212630;
                        c17792 = c17791;
                        c212630 = c21263113;
                        strM56203 = strM56203;
                        iM559712 = iM559712;
                        strM55598 = strM55598;
                        sArr21 = sArr21;
                        c124010 = c124010;
                        sArr16 = sArr16;
                        c212623 = c212623;
                        i40 = i40;
                        c212620 = c212620;
                        c11758 = c11758;
                        i52 = i52;
                        i51 = i51;
                        strM56403 = strM56403;
                        c15089 = c15089;
                        c212622 = c212622;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        sArr17 = sArr17;
                        i47 = i47;
                        c212624 = c212624;
                        sArr18 = sArr18;
                        i48 = i48;
                        i49 = i49;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        sArr19 = sArr19;
                        iM559715 = iM559715;
                        c212616 = c212616;
                        c157511 = c157511;
                        strM56189 = strM56189;
                        c212627 = c212627;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        sArr22 = sArr22;
                        i50 = i50;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212619 = c212619;
                        c22487 = c22487;
                        sArr15 = sArr15;
                        str12 = str7;
                        i34 = i18;
                        str14 = str14;
                        c212625 = c212625;
                        str13 = str13;
                        sArr24 = sArr24;
                        c137410 = c137410;
                        strM55618 = strM55618;
                    }
                    break;
                case -291701214:
                case 435450489:
                    C21265 c212648 = c212625;
                    str11 = strM55618;
                    c13749 = c137410;
                    str14 = str14;
                    c212623 = c212623;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212617 = c212617;
                    c25168 = c25168;
                    strM55822 = strM55822;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    i = iM559714;
                    i24 = i40;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    c21266 = c212621;
                    i52 = i52;
                    c212614 = c212624;
                    sArr8 = sArr16;
                    C17791 c177915 = c17792;
                    c212630 = c212630;
                    c17791 = c177915;
                    c212628 = C21265.f66859;
                    c19133 = new C19133();
                    c212625 = c212648;
                    strM55947 = ViewOnClickListenerC0939.m55947(f82272, 220, 2, i53);
                    sArr24 = f82272;
                    if (C1964.f83032 > 0) {
                        int iM556814 = C0873.m55680("᩹֨") ^ i31;
                        i33 = ((iM556814 ^ i32) * (-14603)) ^ (-954999339);
                        i34 = iM556814 ^ (-627754923);
                        i29 = 222;
                        sArr16 = sArr8;
                        strM55822 = strM55822;
                        i40 = i24;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        sArr13 = sArr;
                        iM559714 = i;
                        c15089 = c15089;
                        c212622 = c212622;
                        c212617 = c212617;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        c212624 = c212614;
                        str13 = str13;
                        c212623 = c212623;
                        str17 = str17;
                        i52 = i52;
                        str16 = str16;
                        c137410 = c13749;
                        str14 = str14;
                        c212625 = c212625;
                        str12 = str12;
                        c4383 = c4383;
                        strM55618 = str11;
                        i51 = i29;
                        C21265 c21263114 = c212630;
                        c17792 = c17791;
                        c212630 = c21263114;
                    } else {
                        c137410 = c13749;
                        c212624 = c212614;
                        strM55618 = str11;
                        c212627 = c212627;
                        strM56189 = strM56189;
                        str4 = strM55597;
                        c212610 = c212616;
                        c157510 = c157511;
                        str5 = strM55598;
                        c212618 = c212618;
                        c9075 = c9075;
                        str9 = strM55599;
                        sArr3 = sArr18;
                        sArr4 = sArr19;
                        i26 = iM55683;
                        i7 = i48;
                        i8 = i49;
                        i9 = iM559715;
                        i23 = 222;
                        c124010 = c124010;
                        sArr6 = sArr21;
                        int iM556815 = C0873.m55680("ۘᩳ") ^ i32;
                        int i612 = ((iM556815 ^ i31) * (-12957)) ^ 706432957;
                        i20 = iM556815 ^ 569551520;
                        sArr24 = sArr24;
                        i19 = i612;
                        strM55599 = str9;
                        iM55683 = i26;
                        c212611 = c212628;
                        str8 = str14;
                        sArr16 = sArr8;
                        i40 = i24;
                        i51 = i23;
                        sArr7 = sArr15;
                        str14 = str8;
                        c212628 = c212611;
                        sArr18 = sArr3;
                        i48 = i7;
                        i49 = i8;
                        strM55597 = str4;
                        iM559715 = i9;
                        strM55598 = str5;
                        str10 = str14;
                        c212625 = c212625;
                        c212624 = c212624;
                        sArr19 = sArr4;
                        c212616 = c212610;
                        c157511 = c157510;
                        sArr15 = sArr7;
                        i34 = i20;
                        i33 = i19;
                        sArr24 = sArr24;
                        sArr21 = sArr6;
                        c124010 = c124010;
                        str13 = str13;
                        strM55822 = strM55822;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        i52 = i52;
                        sArr13 = sArr;
                        iM559714 = i;
                        c15089 = c15089;
                        c212622 = c212622;
                        c212617 = c212617;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        c137410 = c137410;
                        strM55618 = strM55618;
                        strM56189 = strM56189;
                        c212627 = c212627;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212623 = c212623;
                        str17 = str17;
                        str12 = str12;
                        c4383 = c4383;
                        str16 = str16;
                        str14 = str10;
                        C21265 c21263115 = c212630;
                        c17792 = c17791;
                        c212630 = c21263115;
                    }
                    break;
                case -263293391:
                case 1626417045:
                    short[] sArr35 = sArr24;
                    int i70 = i51;
                    String str25 = str14;
                    c212623 = c212623;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212617 = c212617;
                    c25168 = c25168;
                    strM55822 = strM55822;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    i = iM559714;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    c21266 = c212621;
                    i52 = i52;
                    C17791 c177916 = c17792;
                    c212630 = c212630;
                    c17791 = c177916;
                    C21265 c212649 = c212625;
                    String str26 = strM55618;
                    m41885(str26, i36 ^ i37, c212649, C0866.m55652(f82272, 139, 21, i53), c8384);
                    C21265 c212650 = C21265.f66868;
                    C13749 c137413 = new C13749();
                    short[] sArr36 = f82272;
                    int iM556816 = C0873.m55680("᩷᩷") ^ i32;
                    i33 = ((iM556816 ^ i31) * 631) ^ (-1333661234);
                    strM55618 = str26;
                    str10 = str25;
                    sArr15 = sArr36;
                    i51 = i70;
                    i34 = iM556816 ^ (-2112567753);
                    c212624 = c212650;
                    c137410 = c137413;
                    c212625 = c212649;
                    sArr24 = sArr35;
                    sArr6 = sArr21;
                    sArr21 = sArr6;
                    c124010 = c124010;
                    str13 = str13;
                    strM55822 = strM55822;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    i52 = i52;
                    sArr13 = sArr;
                    iM559714 = i;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    str14 = str10;
                    C21265 c21263116 = c212630;
                    c17792 = c17791;
                    c212630 = c21263116;
                    break;
                case -256174489:
                case 258553544:
                    sArr24 = sArr24;
                    i23 = i51;
                    C21265 c212651 = c212623;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212617 = c212617;
                    c25168 = c25168;
                    strM55822 = strM55822;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    i = iM559714;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    c21266 = c212621;
                    i52 = i52;
                    C17791 c177917 = c17792;
                    c212630 = c212630;
                    c17791 = c177917;
                    short[] sArr37 = sArr16;
                    String strM56132 = C1003.m56132(sArr37, 165, 13, i53);
                    int i71 = i40;
                    C21265 c212652 = c212624;
                    sArr8 = sArr37;
                    C13749 c137414 = c137410;
                    str13 = str13;
                    String str27 = str14;
                    c212623 = c212651;
                    m41885(str27, i71, c212652, strM56132, c137414);
                    c212615 = C21265.f66839;
                    c24479 = new C24477();
                    sArr17 = f82272;
                    i47 = 178;
                    if (C0947.f81895) {
                        i24 = i71;
                        c137410 = c137414;
                        c212624 = c212652;
                        c212627 = c212627;
                        strM56189 = strM56189;
                        strM55618 = strM55618;
                        sArr24 = sArr24;
                        str4 = strM55597;
                        c212610 = c212616;
                        c157510 = c157511;
                        str5 = strM55598;
                        c212618 = c212618;
                        c9075 = c9075;
                        str9 = strM55599;
                        sArr3 = sArr18;
                        sArr4 = sArr19;
                        i7 = i48;
                        i8 = i49;
                        i9 = iM559715;
                        c124010 = c124010;
                        c212625 = c212625;
                        sArr6 = sArr21;
                        str14 = str27;
                        i26 = iM55683;
                        int iM556817 = C0873.m55680("ۘᩳ") ^ i32;
                        int i613 = ((iM556817 ^ i31) * (-12957)) ^ 706432957;
                        i20 = iM556817 ^ 569551520;
                        sArr24 = sArr24;
                        i19 = i613;
                        strM55599 = str9;
                        iM55683 = i26;
                        c212611 = c212628;
                        str8 = str14;
                        sArr16 = sArr8;
                        i40 = i24;
                        i51 = i23;
                        sArr7 = sArr15;
                    } else {
                        int iM556818 = (C0873.m55680("ۙ۬") + i31) * 17;
                        i19 = ((iM556818 ^ i32) * 5037) ^ 470315935;
                        i20 = iM556818 ^ (-1784420311);
                        c137410 = c137414;
                        c212624 = c212652;
                        c212611 = c212628;
                        c212627 = c212627;
                        strM56189 = strM56189;
                        strM55618 = strM55618;
                        sArr16 = sArr8;
                        i40 = i71;
                        str4 = strM55597;
                        c212610 = c212616;
                        c157510 = c157511;
                        str5 = strM55598;
                        c212618 = c212618;
                        c9075 = c9075;
                        strM55599 = strM55599;
                        sArr7 = sArr15;
                        sArr3 = sArr18;
                        sArr4 = sArr19;
                        iM55683 = iM55683;
                        i7 = i48;
                        i8 = i49;
                        i9 = iM559715;
                        str8 = str27;
                        c124010 = c124010;
                        c212625 = c212625;
                        i51 = i23;
                        sArr6 = sArr21;
                    }
                    str14 = str8;
                    c212628 = c212611;
                    sArr18 = sArr3;
                    i48 = i7;
                    i49 = i8;
                    strM55597 = str4;
                    iM559715 = i9;
                    strM55598 = str5;
                    str10 = str14;
                    c212625 = c212625;
                    c212624 = c212624;
                    sArr19 = sArr4;
                    c212616 = c212610;
                    c157511 = c157510;
                    sArr15 = sArr7;
                    i34 = i20;
                    i33 = i19;
                    sArr24 = sArr24;
                    sArr21 = sArr6;
                    c124010 = c124010;
                    str13 = str13;
                    strM55822 = strM55822;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    i52 = i52;
                    sArr13 = sArr;
                    iM559714 = i;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    str14 = str10;
                    C21265 c21263117 = c212630;
                    c17792 = c17791;
                    c212630 = c21263117;
                    break;
                case -116189133:
                case 615472437:
                    sArr24 = sArr24;
                    i52 = i52;
                    i51 = i51;
                    C21265 c212653 = c212623;
                    String str28 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    C21265 c212654 = c212617;
                    C25168 c25169 = c25168;
                    String str29 = strM55822;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    i = iM559714;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    c21266 = c212621;
                    C17791 c177918 = c17792;
                    c212630 = c212630;
                    c17791 = c177918;
                    short[] sArr38 = sArr10;
                    String strM56404 = C1229.m56403(sArr38, 22, 2, i53);
                    sArr10 = sArr38;
                    int iM559725 = C0946.m55979(C1229.m56403(f82272, 24, 3, i53)) ^ 2122811797;
                    if (C1012.f81938 >= 0) {
                        i38 = iM559725;
                        c212627 = c212627;
                        strM56189 = strM56189;
                        strM55618 = strM55618;
                        c212624 = c212624;
                        c137410 = c137410;
                        strM55822 = str29;
                        str12 = strM56404;
                        c212617 = c212654;
                        c25168 = c25169;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        c212616 = c212616;
                        c157511 = c157511;
                        strM55598 = strM55598;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        sArr16 = sArr16;
                        sArr17 = sArr17;
                        sArr18 = sArr18;
                        sArr19 = sArr19;
                        i40 = i40;
                        i41 = i41;
                        i5 = i42;
                        i47 = i47;
                        i48 = i48;
                        i49 = i49;
                        iM559715 = iM559715;
                        str13 = str28;
                        c124010 = c124010;
                        c212625 = c212625;
                        str14 = str14;
                        str2 = strM55599;
                        sArr21 = sArr21;
                        c212623 = c212653;
                        i4 = iM55683;
                        iM55681 = C0946.m55979("֫᩶") ^ i31;
                        i16 = ((iM55681 ^ i32) * 11505) ^ 305346520;
                        i17 = 160597611;
                    } else {
                        iM55681 = C0873.m55680("۠ۡ") ^ i32;
                        i38 = iM559725;
                        i16 = ((iM55681 ^ i31) * 15347) ^ 707177060;
                        c212627 = c212627;
                        strM56189 = strM56189;
                        strM55618 = strM55618;
                        c212624 = c212624;
                        c137410 = c137410;
                        strM55822 = str29;
                        str12 = strM56404;
                        c212617 = c212654;
                        c25168 = c25169;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        c212616 = c212616;
                        c157511 = c157511;
                        strM55598 = strM55598;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        sArr16 = sArr16;
                        sArr17 = sArr17;
                        sArr18 = sArr18;
                        sArr19 = sArr19;
                        i40 = i40;
                        i41 = i41;
                        i5 = i42;
                        i47 = i47;
                        i48 = i48;
                        i49 = i49;
                        iM559715 = iM559715;
                        i17 = -899103300;
                        str13 = str28;
                        c124010 = c124010;
                        c212625 = c212625;
                        str14 = str14;
                        str2 = strM55599;
                        sArr21 = sArr21;
                        c212623 = c212653;
                        i4 = iM55683;
                    }
                    i12 = iM55681 ^ i17;
                    sArr5 = sArr23;
                    str6 = str15;
                    i11 = i16;
                    iM55680 = i39;
                    i39 = iM55680;
                    i42 = i5;
                    strM55599 = str2;
                    iM55683 = i4;
                    i33 = i11;
                    str15 = str6;
                    sArr23 = sArr5;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    sArr13 = sArr;
                    iM559714 = i;
                    sArr10 = sArr10;
                    c212619 = c212619;
                    c22487 = c22487;
                    strM56203 = strM56203;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr15 = sArr15;
                    sArr22 = sArr22;
                    iM559712 = iM559712;
                    i50 = i50;
                    i18 = i12;
                    str17 = str17;
                    str7 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    C21265 c21263118 = c212630;
                    c17792 = c17791;
                    c212630 = c21263118;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    strM55598 = strM55598;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    c212623 = c212623;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    i52 = i52;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    sArr19 = sArr19;
                    iM559715 = iM559715;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str12 = str7;
                    i34 = i18;
                    str14 = str14;
                    c212625 = c212625;
                    str13 = str13;
                    sArr24 = sArr24;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    break;
                case -21603707:
                case 674868878:
                    sArr24 = sArr24;
                    i51 = i51;
                    C21265 c212655 = c212623;
                    c14419 = c14419;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212617 = c212617;
                    c25168 = c25168;
                    strM55822 = strM55822;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    iM559714 = iM559714;
                    i43 = i43;
                    i44 = i44;
                    i45 = i45;
                    i46 = i46;
                    c212621 = c212621;
                    i52 = i52;
                    String str30 = str13;
                    C17791 c177919 = c17792;
                    c212630 = c212630;
                    c17791 = c177919;
                    short s = f82272[0];
                    if ((s * 11092) - ((s * s) + 30758116) <= 0) {
                        iM55979 = (C0946.m55979("֫ܰ") ^ i31) * (-81);
                        i13 = ((iM55979 ^ i32) * (-2915)) ^ (-416477667);
                        i15 = 411718746;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩶") ^ i32;
                        i13 = ((iM55979 ^ i31) * 18471) ^ 1177031156;
                        i15 = -1437152538;
                    }
                    str13 = str30;
                    c124010 = c124010;
                    c212625 = c212625;
                    str14 = str14;
                    strM56203 = strM56203;
                    sArr21 = sArr21;
                    c212623 = c212655;
                    iM559712 = iM559712;
                    i14 = iM55979 ^ i15;
                    i43 = i43;
                    i44 = i44;
                    c212621 = c212621;
                    c4382 = c4383;
                    sArr13 = sArr13;
                    iM559714 = iM559714;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr12 = sArr12;
                    sArr15 = sArr15;
                    sArr12 = sArr12;
                    strM55822 = strM55822;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    i18 = i14;
                    i33 = i13;
                    str7 = str12;
                    c4383 = c4382;
                    str17 = str17;
                    str16 = str16;
                    C21265 c21263119 = c212630;
                    c17792 = c17791;
                    c212630 = c21263119;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    strM55598 = strM55598;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    c212623 = c212623;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    i52 = i52;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    sArr19 = sArr19;
                    iM559715 = iM559715;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str12 = str7;
                    i34 = i18;
                    str14 = str14;
                    c212625 = c212625;
                    str13 = str13;
                    sArr24 = sArr24;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    break;
                case 45418059:
                case 189939840:
                    sArr24 = sArr24;
                    i51 = i51;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212617 = c212617;
                    sArr = sArr13;
                    short[] sArr39 = sArr14;
                    i = iM559714;
                    i2 = i43;
                    i3 = i44;
                    int i72 = i45;
                    int i73 = i46;
                    c21266 = c212621;
                    i52 = i52;
                    C17791 c177920 = c17792;
                    c212630 = c212630;
                    c17791 = c177920;
                    sArr14 = sArr39;
                    i45 = i72;
                    i46 = i73;
                    c25168 = c25168;
                    C14419 c144110 = c14419;
                    String str31 = str13;
                    C21265 c212656 = c212623;
                    strM55822 = strM55822;
                    m41885(str31, C0873.m55680(ServiceConnectionC1013.m56161(sArr39, i72, i73, i53)) ^ 2099699015, c212656, C1053.m56325(f82272, 94, 17, i53), c144110);
                    C21265 c212657 = C21265.f66847;
                    if (C0890.f81849 != 0) {
                        c212627 = c212657;
                        c14419 = c144110;
                        strM55618 = strM55618;
                        c212624 = c212624;
                        c137410 = c137410;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        sArr10 = sArr10;
                        sArr16 = sArr16;
                        sArr17 = sArr17;
                        sArr18 = sArr18;
                        i40 = i40;
                        i47 = i47;
                        i48 = i48;
                        i49 = i49;
                        iM559715 = iM559715;
                        str13 = str31;
                        c212625 = c212625;
                        str14 = str14;
                        c212623 = c212656;
                        int iM559726 = (i31 - C0946.m55979("ܶ᩵")) * (-73);
                        i10 = iM559726 ^ 1893676964;
                        i33 = ((iM559726 ^ i32) * 24731) ^ 1763996843;
                    } else {
                        int iM559727 = C0946.m55979("ۗ᩵") ^ i32;
                        c212627 = c212657;
                        i33 = ((iM559727 ^ i31) * (-21739)) ^ 1148347270;
                        i10 = iM559727 ^ (-1999443925);
                        c14419 = c144110;
                        strM55618 = strM55618;
                        c212624 = c212624;
                        c137410 = c137410;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        sArr10 = sArr10;
                        sArr16 = sArr16;
                        sArr17 = sArr17;
                        sArr18 = sArr18;
                        i40 = i40;
                        i47 = i47;
                        i48 = i48;
                        i49 = i49;
                        iM559715 = iM559715;
                        str13 = str31;
                        c212625 = c212625;
                        str14 = str14;
                        c212623 = c212656;
                    }
                    strM56189 = strM56189;
                    i43 = i2;
                    i44 = i3;
                    sArr13 = sArr;
                    iM559714 = i;
                    c212618 = c212618;
                    c9075 = c9075;
                    strM55599 = strM55599;
                    c212619 = c212619;
                    c22487 = c22487;
                    strM56203 = strM56203;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr11 = sArr11;
                    sArr12 = sArr12;
                    sArr15 = sArr15;
                    sArr22 = sArr22;
                    iM559712 = iM559712;
                    iM55683 = iM55683;
                    i41 = i41;
                    i42 = i42;
                    i50 = i50;
                    c124010 = c124010;
                    sArr21 = sArr21;
                    i34 = i10;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr12 = sArr12;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    strM55822 = strM55822;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    c212621 = c21266;
                    i52 = i52;
                    sArr24 = sArr24;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    iM559715 = iM559715;
                    strM56189 = strM56189;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str13 = str13;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    c137410 = c137410;
                    str14 = str14;
                    c212625 = c212625;
                    strM55618 = strM55618;
                    C21265 c212631110 = c212630;
                    c17792 = c17791;
                    c212630 = c212631110;
                    break;
                case 121216881:
                case 1075357509:
                    sArr24 = sArr24;
                    i23 = i51;
                    C21265 c212658 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    sArr = sArr13;
                    i = iM559714;
                    i2 = i43;
                    i3 = i44;
                    c21266 = c212621;
                    i52 = i52;
                    C17791 c177921 = c17792;
                    c212630 = c212630;
                    c17791 = c177921;
                    c212622 = c212658;
                    C21265 c212659 = c212617;
                    C25168 c251610 = c25168;
                    String str32 = strM55822;
                    m41885(str32, iM559711 ^ 2127804926, c212659, C0955.m56029(f82272, 269, 13, i53), c251610);
                    C21265 c212660 = C21265.f66845;
                    C9075 c9077 = new C9075();
                    short[] sArr40 = f82272;
                    int iM559728 = C0946.m55979("ۜ۬") ^ i31;
                    i33 = ((iM559728 ^ i32) * (-4037)) ^ 7548792;
                    c9075 = c9077;
                    c25168 = c251610;
                    c212627 = c212627;
                    strM56189 = strM56189;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    sArr20 = sArr40;
                    i27 = iM559728 ^ 458987028;
                    c212618 = c212660;
                    c212612 = c212615;
                    c24478 = c24479;
                    str4 = strM55597;
                    c212610 = c212616;
                    c157510 = c157511;
                    str5 = strM55598;
                    str9 = strM55599;
                    sArr10 = sArr10;
                    sArr14 = sArr14;
                    sArr8 = sArr16;
                    sArr9 = sArr17;
                    sArr3 = sArr18;
                    sArr4 = sArr19;
                    i24 = i40;
                    i45 = i45;
                    i46 = i46;
                    i25 = i47;
                    i7 = i48;
                    i8 = i49;
                    i9 = iM559715;
                    c212617 = c212659;
                    c124010 = c124010;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    sArr6 = sArr21;
                    strM55822 = str32;
                    i26 = iM55683;
                    strM55599 = str9;
                    iM55683 = i26;
                    strM55598 = str5;
                    sArr21 = sArr6;
                    c124010 = c124010;
                    sArr16 = sArr8;
                    strM55822 = strM55822;
                    i40 = i24;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    i52 = i52;
                    i51 = i23;
                    sArr13 = sArr;
                    iM559714 = i;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr17 = sArr9;
                    i47 = i25;
                    c212624 = c212624;
                    sArr18 = sArr3;
                    i48 = i7;
                    i49 = i8;
                    c212615 = c212612;
                    c24479 = c24478;
                    strM55597 = str4;
                    sArr19 = sArr4;
                    iM559715 = i9;
                    c212616 = c212610;
                    c157511 = c157510;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    i34 = i27;
                    str13 = str13;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    sArr24 = sArr24;
                    c4383 = c4383;
                    str16 = str16;
                    c137410 = c137410;
                    str14 = str14;
                    c212625 = c212625;
                    strM55618 = strM55618;
                    C21265 c212631111 = c212630;
                    c17792 = c17791;
                    c212630 = c212631111;
                    break;
                case 418882274:
                case 1184136131:
                    sArr24 = sArr24;
                    i51 = i51;
                    c4383 = c4383;
                    String str33 = str17;
                    str12 = str12;
                    short[] sArr41 = sArr13;
                    int i74 = i43;
                    int i75 = i44;
                    c21266 = c212621;
                    i52 = i52;
                    C17791 c177922 = c17792;
                    c212630 = c212630;
                    c17791 = c177922;
                    String strM55718 = C0882.m55717(sArr41, i74, i75, i53);
                    int i76 = iM559714;
                    C21265 c212661 = c212622;
                    C15089 c150810 = c15089;
                    String str34 = str16;
                    str17 = str33;
                    m41885(str34, i76, c212661, strM55718, c150810);
                    C21265 c212662 = C21265.f66825;
                    C14419 c144111 = new C14419();
                    c15089 = c150810;
                    str16 = str34;
                    String strM561810 = C1017.m56189(f82272, 89, 2, i53);
                    short[] sArr42 = f82272;
                    int iM556819 = C0873.m55680("۠֫") ^ i31;
                    int i77 = ((iM556819 ^ i32) * 10101) ^ 666601493;
                    sArr14 = sArr42;
                    c212622 = c212661;
                    strM56189 = strM56189;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    c14419 = c144111;
                    i34 = iM556819 ^ (-1929722211);
                    i43 = i74;
                    i44 = i75;
                    sArr13 = sArr41;
                    iM559714 = i76;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    c212617 = c212617;
                    c25168 = c25168;
                    strM55822 = strM55822;
                    c212618 = c212618;
                    c9075 = c9075;
                    strM55599 = strM55599;
                    c212619 = c212619;
                    c22487 = c22487;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr10 = sArr10;
                    sArr11 = sArr11;
                    sArr15 = sArr15;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    sArr22 = sArr22;
                    iM559712 = iM559712;
                    i40 = i40;
                    iM55683 = iM55683;
                    i41 = i41;
                    i42 = i42;
                    i47 = i47;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    iM559715 = iM559715;
                    i45 = 91;
                    i46 = 3;
                    str13 = strM561810;
                    i33 = i77;
                    c124010 = c124010;
                    c212625 = c212625;
                    str14 = str14;
                    sArr12 = sArr12;
                    sArr21 = sArr21;
                    c212623 = c212662;
                    strM56203 = strM56203;
                    sArr12 = sArr12;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    strM55822 = strM55822;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    c212621 = c21266;
                    i52 = i52;
                    sArr24 = sArr24;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    iM559715 = iM559715;
                    strM56189 = strM56189;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str13 = str13;
                    c212623 = c212623;
                    str17 = str17;
                    str12 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    c137410 = c137410;
                    str14 = str14;
                    c212625 = c212625;
                    strM55618 = strM55618;
                    C21265 c212631112 = c212630;
                    c17792 = c17791;
                    c212630 = c212631112;
                    break;
                case 491262549:
                case 741744354:
                    sArr24 = sArr24;
                    i51 = i51;
                    String str35 = str12;
                    i52 = i52;
                    C4381 c4385 = c4383;
                    String str36 = str17;
                    m41885(str36, iM55682 ^ 2125509123, c212621, C0992.m56102(f82272, 6, 16, i53), c4385);
                    C21265 c212663 = C21265.f66840;
                    C17791 c177923 = new C17791();
                    short[] sArr43 = f82272;
                    int iM556820 = (C0873.m55680("᩸ۗ") + i31) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i33 = ((iM556820 ^ i32) * 16307) ^ (-106402606);
                    c212627 = c212627;
                    strM56189 = strM56189;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    sArr10 = sArr43;
                    i18 = iM556820 ^ 789466265;
                    c212630 = c212663;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM55598 = strM55598;
                    c212618 = c212618;
                    c9075 = c9075;
                    strM55599 = strM55599;
                    c212619 = c212619;
                    c22487 = c22487;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr11 = sArr11;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    sArr22 = sArr22;
                    i40 = i40;
                    iM55683 = iM55683;
                    i41 = i41;
                    i42 = i42;
                    i45 = i45;
                    i46 = i46;
                    i47 = i47;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    iM559715 = iM559715;
                    c17792 = c177923;
                    str17 = str36;
                    c124010 = c124010;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    str7 = str35;
                    sArr21 = sArr21;
                    iM559712 = iM559712;
                    c4383 = c4385;
                    strM56203 = strM56203;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    strM55598 = strM55598;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    c212623 = c212623;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    i52 = i52;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    sArr19 = sArr19;
                    iM559715 = iM559715;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str12 = str7;
                    i34 = i18;
                    str14 = str14;
                    c212625 = c212625;
                    str13 = str13;
                    sArr24 = sArr24;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    break;
                case 552294188:
                case 1680208677:
                    short[] sArr44 = sArr24;
                    i29 = i51;
                    C21265 c212664 = c212630;
                    String str37 = str12;
                    c124010 = new C12408();
                    c17791 = c17792;
                    c212630 = c212664;
                    strM56189 = C1017.m56189(f82272, UMErrorCode.E_UM_BE_CREATE_FAILED, 2, i53);
                    int iM559729 = C0946.m55979(C0861.m55618(f82272, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i53));
                    int iM556821 = C0873.m55680("֫᩷") ^ i31;
                    i35 = iM559729;
                    i34 = iM556821 ^ (-631837228);
                    i33 = ((iM556821 ^ i32) * (-25595)) ^ 475748592;
                    i52 = i52;
                    c212614 = c212624;
                    c13749 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    sArr24 = sArr44;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr8 = sArr16;
                    i = iM559714;
                    i24 = i40;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    c21266 = c212621;
                    str12 = str37;
                    str11 = strM55618;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    strM55822 = strM55822;
                    sArr16 = sArr8;
                    strM55822 = strM55822;
                    i40 = i24;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    sArr13 = sArr;
                    iM559714 = i;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    c212624 = c212614;
                    str13 = str13;
                    c212623 = c212623;
                    str17 = str17;
                    i52 = i52;
                    str16 = str16;
                    c137410 = c13749;
                    str14 = str14;
                    c212625 = c212625;
                    str12 = str12;
                    c4383 = c4383;
                    strM55618 = str11;
                    i51 = i29;
                    C21265 c212631113 = c212630;
                    c17792 = c17791;
                    c212630 = c212631113;
                    break;
                case 604763437:
                case 648015053:
                    sArr24 = sArr24;
                    i51 = i51;
                    C21265 c212665 = c212630;
                    C17791 c177924 = c17792;
                    String str38 = str12;
                    int i78 = i38;
                    m41885(str38, i78, c212665, C1046.m56293(f82272, 27, 16, i53), c177924);
                    C21265 c212666 = C21265.f66865;
                    c5702 = new C5702();
                    short[] sArr45 = f82272;
                    int iM556822 = C0873.m55680("ᩴۜ") ^ i31;
                    i33 = ((iM556822 ^ i32) * (-4289)) ^ (-2002086949);
                    c212630 = c212665;
                    i52 = i52;
                    str3 = strM56189;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    str17 = str17;
                    sArr11 = sArr45;
                    i28 = iM556822 ^ 395603426;
                    c21269 = c212615;
                    c24477 = c24479;
                    str4 = strM55597;
                    c212610 = c212616;
                    c157510 = c157511;
                    c212617 = c212617;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    sArr2 = sArr17;
                    sArr3 = sArr18;
                    sArr4 = sArr19;
                    i = iM559714;
                    i40 = i40;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i6 = i47;
                    i7 = i48;
                    i8 = i49;
                    i9 = iM559715;
                    c21266 = c212621;
                    i41 = 43;
                    i42 = 2;
                    c17791 = c177924;
                    i38 = i78;
                    c12409 = c124010;
                    c212613 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    c212626 = c212666;
                    strM55822 = strM55822;
                    c4383 = c4383;
                    str12 = str38;
                    c21267 = c212627;
                    str5 = strM55598;
                    strM55598 = str5;
                    sArr16 = sArr16;
                    strM55822 = strM55822;
                    i40 = i40;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    sArr24 = sArr24;
                    sArr13 = sArr;
                    iM559714 = i;
                    c15089 = c15089;
                    c212622 = c212622;
                    c212617 = c212617;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    c25168 = c25168;
                    sArr10 = sArr10;
                    sArr17 = sArr2;
                    i47 = i6;
                    c212624 = c212624;
                    sArr18 = sArr3;
                    i48 = i7;
                    i49 = i8;
                    c212615 = c21269;
                    c24479 = c24477;
                    strM55597 = str4;
                    sArr19 = sArr4;
                    iM559715 = i9;
                    c212616 = c212610;
                    c157511 = c157510;
                    i34 = i28;
                    c212627 = c21267;
                    str13 = str13;
                    c212623 = c212623;
                    str17 = str17;
                    i51 = i51;
                    str16 = str16;
                    c137410 = c137410;
                    str14 = str14;
                    c212625 = c212613;
                    c124010 = c12409;
                    strM56189 = str3;
                    i52 = i52;
                    str12 = str12;
                    c4383 = c4383;
                    C21265 c212631114 = c212630;
                    c17792 = c17791;
                    c212630 = c212631114;
                    break;
                case 918007220:
                case 2012030499:
                    sArr24 = sArr24;
                    i51 = i51;
                    m41885(str15, i39, c212626, ViewOnClickListenerC0939.m55947(sArr23, i52, 18, i53), c5702);
                    C21265 c212667 = C21265.f66850;
                    C15089 c150811 = new C15089();
                    String strM55750 = C0892.m55750(f82272, 66, 2, i53);
                    sArr12 = f82272;
                    int iM559730 = C0946.m55979("ۘ֡") ^ i32;
                    int i79 = ((iM559730 ^ i31) * (-14209)) ^ (-1630688256);
                    i12 = iM559730 ^ (-644738304);
                    str16 = strM55750;
                    c15089 = c150811;
                    c212627 = c212627;
                    strM56189 = strM56189;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212667;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    iM55680 = i39;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM55598 = strM55598;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr10 = sArr10;
                    sArr11 = sArr11;
                    sArr = sArr13;
                    sArr14 = sArr14;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    i = iM559714;
                    i40 = i40;
                    i41 = i41;
                    i5 = i42;
                    i2 = i43;
                    i3 = i44;
                    i45 = i45;
                    i46 = i46;
                    i47 = i47;
                    i48 = i48;
                    i49 = i49;
                    iM559715 = iM559715;
                    c21266 = c212621;
                    i52 = i52;
                    c124010 = c124010;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    str2 = strM55599;
                    sArr21 = sArr21;
                    sArr5 = sArr23;
                    str6 = str15;
                    i11 = i79;
                    i4 = iM55683;
                    C17791 c177925 = c17792;
                    c212630 = c212630;
                    c17791 = c177925;
                    i39 = iM55680;
                    i42 = i5;
                    strM55599 = str2;
                    iM55683 = i4;
                    i33 = i11;
                    str15 = str6;
                    sArr23 = sArr5;
                    i43 = i2;
                    i44 = i3;
                    c212621 = c21266;
                    sArr13 = sArr;
                    iM559714 = i;
                    sArr10 = sArr10;
                    c212619 = c212619;
                    c22487 = c22487;
                    strM56203 = strM56203;
                    c212620 = c212620;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr15 = sArr15;
                    sArr22 = sArr22;
                    iM559712 = iM559712;
                    i50 = i50;
                    i18 = i12;
                    str17 = str17;
                    str7 = str12;
                    c4383 = c4383;
                    str16 = str16;
                    C21265 c212631115 = c212630;
                    c17792 = c17791;
                    c212630 = c212631115;
                    strM56203 = strM56203;
                    iM559712 = iM559712;
                    strM55598 = strM55598;
                    sArr21 = sArr21;
                    c124010 = c124010;
                    sArr16 = sArr16;
                    c212623 = c212623;
                    i40 = i40;
                    c212620 = c212620;
                    c11758 = c11758;
                    i52 = i52;
                    i51 = i51;
                    strM56403 = strM56403;
                    c15089 = c15089;
                    c212622 = c212622;
                    i45 = i45;
                    sArr14 = sArr14;
                    i46 = i46;
                    sArr17 = sArr17;
                    i47 = i47;
                    c212624 = c212624;
                    sArr18 = sArr18;
                    i48 = i48;
                    i49 = i49;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    sArr19 = sArr19;
                    iM559715 = iM559715;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM56189 = strM56189;
                    c212627 = c212627;
                    c212618 = c212618;
                    c9075 = c9075;
                    sArr11 = sArr11;
                    i41 = i41;
                    i42 = i42;
                    sArr22 = sArr22;
                    i50 = i50;
                    strM55599 = strM55599;
                    iM55683 = iM55683;
                    c212619 = c212619;
                    c22487 = c22487;
                    sArr15 = sArr15;
                    str12 = str7;
                    i34 = i18;
                    str14 = str14;
                    c212625 = c212625;
                    str13 = str13;
                    sArr24 = sArr24;
                    c137410 = c137410;
                    strM55618 = strM55618;
                    break;
                case 1211565081:
                case 2056920156:
                    sArr24 = sArr24;
                    i51 = i51;
                    m41885(strM55993, C0946.m55979(strM56092) ^ 2129780502, c212629, C1036.m56252(f82272, 247, 17, i53), c16450);
                    c212617 = C21265.f66858;
                    c25168 = new C25168();
                    strM55822 = C0912.m55822(f82272, 264, 2, i53);
                    iM559711 = C0946.m55979(C1012.m56144(f82272, 266, 3, i53));
                    if (C0845.f81821 >= 0) {
                        c212627 = c212627;
                        strM56189 = strM56189;
                        strM55618 = strM55618;
                        c212624 = c212624;
                        c137410 = c137410;
                        str13 = str13;
                        c212622 = c212622;
                        c15089 = c15089;
                        str16 = str16;
                        c4383 = c4383;
                        str17 = str17;
                        str12 = str12;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        c212616 = c212616;
                        c157511 = c157511;
                        strM55598 = strM55598;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr10 = sArr10;
                        sArr11 = sArr11;
                        sArr = sArr13;
                        sArr14 = sArr14;
                        sArr16 = sArr16;
                        sArr17 = sArr17;
                        sArr18 = sArr18;
                        sArr19 = sArr19;
                        i = iM559714;
                        i40 = i40;
                        i4 = iM55683;
                        i41 = i41;
                        i5 = i42;
                        i2 = i43;
                        i3 = i44;
                        i45 = i45;
                        i46 = i46;
                        i47 = i47;
                        i48 = i48;
                        i49 = i49;
                        iM559715 = iM559715;
                        c21266 = c212621;
                        i52 = i52;
                        c124010 = c124010;
                        c212625 = c212625;
                        str14 = str14;
                        c212623 = c212623;
                        str2 = strM55599;
                        sArr21 = sArr21;
                        C17791 c177926 = c17792;
                        c212630 = c212630;
                        c17791 = c177926;
                        iM55681 = C0946.m55979("֫᩶") ^ i31;
                        i16 = ((iM55681 ^ i32) * 11505) ^ 305346520;
                        i17 = 160597611;
                        i12 = iM55681 ^ i17;
                        sArr5 = sArr23;
                        str6 = str15;
                        i11 = i16;
                        iM55680 = i39;
                        i39 = iM55680;
                        i42 = i5;
                        strM55599 = str2;
                        iM55683 = i4;
                        i33 = i11;
                        str15 = str6;
                        sArr23 = sArr5;
                        i43 = i2;
                        i44 = i3;
                        c212621 = c21266;
                        sArr13 = sArr;
                        iM559714 = i;
                        sArr10 = sArr10;
                        c212619 = c212619;
                        c22487 = c22487;
                        strM56203 = strM56203;
                        c212620 = c212620;
                        c11758 = c11758;
                        strM56403 = strM56403;
                        sArr15 = sArr15;
                        sArr22 = sArr22;
                        iM559712 = iM559712;
                        i50 = i50;
                        i18 = i12;
                        str17 = str17;
                        str7 = str12;
                        c4383 = c4383;
                        str16 = str16;
                        C21265 c212631116 = c212630;
                        c17792 = c17791;
                        c212630 = c212631116;
                        strM56203 = strM56203;
                        iM559712 = iM559712;
                        strM55598 = strM55598;
                        sArr21 = sArr21;
                        c124010 = c124010;
                        sArr16 = sArr16;
                        c212623 = c212623;
                        i40 = i40;
                        c212620 = c212620;
                        c11758 = c11758;
                        i52 = i52;
                        i51 = i51;
                        strM56403 = strM56403;
                        c15089 = c15089;
                        c212622 = c212622;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        sArr17 = sArr17;
                        i47 = i47;
                        c212624 = c212624;
                        sArr18 = sArr18;
                        i48 = i48;
                        i49 = i49;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        sArr19 = sArr19;
                        iM559715 = iM559715;
                        c212616 = c212616;
                        c157511 = c157511;
                        strM56189 = strM56189;
                        c212627 = c212627;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        sArr22 = sArr22;
                        i50 = i50;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212619 = c212619;
                        c22487 = c22487;
                        sArr15 = sArr15;
                        str12 = str7;
                        i34 = i18;
                        str14 = str14;
                        c212625 = c212625;
                        str13 = str13;
                        sArr24 = sArr24;
                        c137410 = c137410;
                        strM55618 = strM55618;
                    } else {
                        int iM556823 = C0873.m55680("۬ܶ") ^ i32;
                        i34 = iM556823 ^ (-1393586177);
                        i33 = ((iM556823 ^ i31) * (-6145)) ^ 531176813;
                        sArr24 = sArr24;
                        i51 = i51;
                    }
                    break;
                case 1423513607:
                case 2092138584:
                    m41885(strM55947, C0946.m55979(C0866.m55652(sArr24, i51, 3, i53)) ^ 2129199019, c212628, C0946.m55986(f82272, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 17, i53), c19133);
                    c212629 = C21265.f66828;
                    c16450 = new C16450();
                    strM55993 = C0947.m55993(f82272, 242, 2, i53);
                    strM56092 = C0989.m56092(f82272, 244, 3, i53);
                    int iM559731 = C0946.m55979("ۙ֡") ^ i32;
                    i34 = iM559731 ^ (-1771228988);
                    i33 = ((iM559731 ^ i31) * (-7997)) ^ 422444810;
                    sArr24 = sArr24;
                    break;
                default:
                    sArr24 = sArr24;
                    i51 = i51;
                    c212627 = c212627;
                    strM56189 = strM56189;
                    strM55618 = strM55618;
                    c212624 = c212624;
                    c137410 = c137410;
                    str13 = str13;
                    c212622 = c212622;
                    c15089 = c15089;
                    str16 = str16;
                    c4383 = c4383;
                    str17 = str17;
                    str12 = str12;
                    c212615 = c212615;
                    c24479 = c24479;
                    strM55597 = strM55597;
                    c212616 = c212616;
                    c157511 = c157511;
                    strM55598 = strM55598;
                    c212617 = c212617;
                    c25168 = c25168;
                    c212618 = c212618;
                    c9075 = c9075;
                    strM55599 = strM55599;
                    c212619 = c212619;
                    c22487 = c22487;
                    c212620 = c212620;
                    sArr10 = sArr10;
                    sArr11 = sArr11;
                    sArr14 = sArr14;
                    sArr15 = sArr15;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    sArr22 = sArr22;
                    iM559712 = iM559712;
                    i40 = i40;
                    iM55683 = iM55683;
                    i41 = i41;
                    i42 = i42;
                    i45 = i45;
                    i46 = i46;
                    i47 = i47;
                    i48 = i48;
                    i49 = i49;
                    i50 = i50;
                    iM559715 = iM559715;
                    c21266 = c212621;
                    i52 = i52;
                    c124010 = c124010;
                    c212625 = c212625;
                    str14 = str14;
                    c212623 = c212623;
                    strM55822 = strM55822;
                    strM56203 = strM56203;
                    sArr21 = sArr21;
                    C17791 c177927 = c17792;
                    c212630 = c212630;
                    c17791 = c177927;
                    c11758 = c11758;
                    strM56403 = strM56403;
                    sArr12 = sArr12;
                    iM559714 = C0946.m55979(C1003.m56132(sArr12, 68, 3, i53)) ^ 2103197990;
                    sArr13 = f82272;
                    i43 = 71;
                    i44 = 18;
                    if (C0906.m55809() > 0) {
                        int iM556824 = C0873.m55680("ᩴ᩺") ^ i31;
                        strM55598 = strM55598;
                        sArr19 = sArr19;
                        c212616 = c212616;
                        c157511 = c157511;
                        c212627 = c212627;
                        i10 = iM556824 ^ (-1766066567);
                        i33 = ((iM556824 ^ i32) * (-11181)) ^ (-1654472176);
                        i34 = i10;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        sArr12 = sArr12;
                        strM56203 = strM56203;
                        iM559712 = iM559712;
                        sArr21 = sArr21;
                        c124010 = c124010;
                        sArr16 = sArr16;
                        strM55822 = strM55822;
                        i40 = i40;
                        c212620 = c212620;
                        c11758 = c11758;
                        c212621 = c21266;
                        i52 = i52;
                        sArr24 = sArr24;
                        i51 = i51;
                        strM56403 = strM56403;
                        c15089 = c15089;
                        c212622 = c212622;
                        c212617 = c212617;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        sArr17 = sArr17;
                        i47 = i47;
                        c212624 = c212624;
                        sArr18 = sArr18;
                        i48 = i48;
                        i49 = i49;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        iM559715 = iM559715;
                        strM56189 = strM56189;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        sArr22 = sArr22;
                        i50 = i50;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212619 = c212619;
                        c22487 = c22487;
                        sArr15 = sArr15;
                        str13 = str13;
                        c212623 = c212623;
                        str17 = str17;
                        str12 = str12;
                        c4383 = c4383;
                        str16 = str16;
                        c137410 = c137410;
                        str14 = str14;
                        c212625 = c212625;
                        strM55618 = strM55618;
                        C21265 c212631117 = c212630;
                        c17792 = c17791;
                        c212630 = c212631117;
                    } else {
                        c212621 = c21266;
                        c4381 = c4383;
                        int iM556825 = (i31 - C0873.m55680("۫ܰ")) * (-9);
                        c4382 = c4381;
                        i13 = ((iM556825 ^ i32) * (-14201)) ^ (-1837679458);
                        i14 = iM556825 ^ 819334028;
                        sArr12 = sArr12;
                        strM55822 = strM55822;
                        c212617 = c212617;
                        c25168 = c25168;
                        sArr10 = sArr10;
                        i18 = i14;
                        i33 = i13;
                        str7 = str12;
                        c4383 = c4382;
                        str17 = str17;
                        str16 = str16;
                        C21265 c212631118 = c212630;
                        c17792 = c17791;
                        c212630 = c212631118;
                        strM56203 = strM56203;
                        iM559712 = iM559712;
                        strM55598 = strM55598;
                        sArr21 = sArr21;
                        c124010 = c124010;
                        sArr16 = sArr16;
                        c212623 = c212623;
                        i40 = i40;
                        c212620 = c212620;
                        c11758 = c11758;
                        i52 = i52;
                        i51 = i51;
                        strM56403 = strM56403;
                        c15089 = c15089;
                        c212622 = c212622;
                        i45 = i45;
                        sArr14 = sArr14;
                        i46 = i46;
                        sArr17 = sArr17;
                        i47 = i47;
                        c212624 = c212624;
                        sArr18 = sArr18;
                        i48 = i48;
                        i49 = i49;
                        c212615 = c212615;
                        c24479 = c24479;
                        strM55597 = strM55597;
                        sArr19 = sArr19;
                        iM559715 = iM559715;
                        c212616 = c212616;
                        c157511 = c157511;
                        strM56189 = strM56189;
                        c212627 = c212627;
                        c212618 = c212618;
                        c9075 = c9075;
                        sArr11 = sArr11;
                        i41 = i41;
                        i42 = i42;
                        sArr22 = sArr22;
                        i50 = i50;
                        strM55599 = strM55599;
                        iM55683 = iM55683;
                        c212619 = c212619;
                        c22487 = c22487;
                        sArr15 = sArr15;
                        str12 = str7;
                        i34 = i18;
                        str14 = str14;
                        c212625 = c212625;
                        str13 = str13;
                        sArr24 = sArr24;
                        c137410 = c137410;
                        strM55618 = strM55618;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0148 A[PHI: r16 r17 r18 r28
      0x0148: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:32:0x0146, B:28:0x011a, B:10:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:32:0x0146, B:28:0x011a, B:10:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r18v4 java.lang.String) = (r18v2 java.lang.String), (r18v3 java.lang.String), (r18v2 java.lang.String) binds: [B:32:0x0146, B:28:0x011a, B:10:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r28v26 android.content.DialogInterface$OnClickListener) = 
      (r28v16 android.content.DialogInterface$OnClickListener)
      (r28v17 android.content.DialogInterface$OnClickListener)
      (r28v27 android.content.DialogInterface$OnClickListener)
     binds: [B:32:0x0146, B:28:0x011a, B:10:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x024c A[PHI: r9 r12 r13 r14 r24 r29
      0x024c: PHI (r9v4 short[]) = (r9v2 short[]), (r9v3 short[]), (r9v2 short[]) binds: [B:42:0x01be, B:36:0x018c, B:22:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r12v5 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:42:0x01be, B:36:0x018c, B:22:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r13v30 android.content.DialogInterface$OnClickListener) = 
      (r13v21 android.content.DialogInterface$OnClickListener)
      (r13v24 android.content.DialogInterface$OnClickListener)
      (r13v2 android.content.DialogInterface$OnClickListener)
     binds: [B:42:0x01be, B:36:0x018c, B:22:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v2 java.lang.String), (r14v4 java.lang.String) binds: [B:42:0x01be, B:36:0x018c, B:22:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r24v6 int) = (r24v5 int), (r24v2 int), (r24v2 int) binds: [B:42:0x01be, B:36:0x018c, B:22:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r29v14 java.lang.String) = (r29v13 java.lang.String), (r29v3 java.lang.String), (r29v3 java.lang.String) binds: [B:42:0x01be, B:36:0x018c, B:22:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
    
        if (p067l.C1003.f81929 <= 0) goto L17;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m41888(AbstractActivityC5549 abstractActivityC5549) {
        String str;
        int iM55979;
        int i;
        int i2;
        int i3;
        int iM559710;
        int i4;
        int i5;
        int iM55680;
        int i6;
        int iM559711;
        int i7;
        int iM559712;
        int i8;
        int i9;
        int i10 = ServiceConnectionC1013.f81940;
        int i11 = C0877.f81843;
        int iM559713 = (C0946.m55979("۠ۘ") ^ i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i12 = ((iM559713 ^ i11) * (-23799)) ^ 348193300;
        C13039 c13039 = null;
        HashSet hashSet = null;
        String strM55947 = null;
        C20671 c20671M55888 = null;
        String strM55618 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i13 = iM559713 ^ 1006884165;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int iM559714 = 0;
        int i17 = 0;
        short s = 0;
        int i18 = 0;
        int iM55681 = 0;
        int i19 = -630597238;
        Iterator itM56593 = null;
        final boolean[] zArr = null;
        String strM55619 = null;
        final ArrayList arrayList = null;
        String[] strArr = null;
        String str2 = null;
        final int iM55625 = 0;
        DialogInterface.OnClickListener onClickListener = null;
        int iM55682 = 0;
        while (true) {
            i19 = i13 ^ (i12 & (((i19 ^ i11) * 25035) >> 31));
            switch (i19) {
                case -2127804742:
                case -1541516643:
                    onClickListener = onClickListener;
                    c13039 = (C13039) RunnableC0897.m55785(itM56593);
                    if (c13039.m29856()) {
                        iM559710 = (i10 - C0946.m55979("ۨ᩺")) * 57;
                        i4 = ((iM559710 ^ i11) * (-5547)) ^ (-564484092);
                        i5 = -2146719027;
                    } else {
                        iM559710 = (C0873.m55680("ۢۚ") ^ i10) * (-61);
                        i4 = ((iM559710 ^ i11) * 6953) ^ (-1771488054);
                        i5 = 1506170785;
                    }
                    int i20 = iM559710 ^ i5;
                    onClickListener = onClickListener;
                    i13 = i20;
                    i12 = i4;
                    break;
                case -2084370867:
                case -600436534:
                    C0967.m56076(c20671M55888, C0946.m55979(strM55618) ^ 2101720784, null);
                    C1025.m56221(c20671M55888);
                    break;
                case -1943126554:
                case 457036244:
                    onClickListener = onClickListener;
                    iM55682 = C0873.m55680(C1071.m56336(sArr, i16, 3, i14)) ^ 2126180701;
                    if (C0949.f81897 < 0) {
                        iM559710 = (C0946.m55979("ۡ᩹") ^ i11) * (-105);
                        i4 = ((iM559710 ^ i10) * (-2799)) ^ (-1060826357);
                        i5 = 1443218905;
                        int i21 = iM559710 ^ i5;
                        onClickListener = onClickListener;
                        i13 = i21;
                        i12 = i4;
                    }
                    onClickListener = onClickListener;
                    iM55680 = (C0946.m55979("᩶᩵") + i11) * (-35);
                    i4 = ((iM55680 ^ i10) * (-27843)) ^ 481666416;
                    i6 = 1203182285;
                    i13 = iM55680 ^ i6;
                    i12 = i4;
                    break;
                case -1938507677:
                case 854389009:
                    i14 = 42191;
                    iM559711 = (i11 - C0873.m55680("۟ۡ")) * (-67);
                    i = ((iM559711 ^ i10) * (-24339)) ^ 407073563;
                    i7 = -671706585;
                    i3 = iM559711 ^ i7;
                    c13039 = c13039;
                    i12 = i;
                    onClickListener = onClickListener;
                    i13 = i3;
                    break;
                case -1897286663:
                case -1438615625:
                    onClickListener = onClickListener;
                    strArr[iM55625] = C1044.m56275(iM55681);
                    strM55947 = ViewOnClickListenerC0939.m55947(f82272, 407, 2, i14);
                    if (C0949.f81897 < 0) {
                        iM559710 = C0946.m55979("۟᩺") ^ i11;
                        i4 = ((iM559710 ^ i10) * 16241) ^ (-1501744153);
                        i5 = -1983070025;
                        int i22 = iM559710 ^ i5;
                        onClickListener = onClickListener;
                        i13 = i22;
                        i12 = i4;
                    }
                    onClickListener = onClickListener;
                    iM55680 = (C0946.m55979("᩶᩵") + i11) * (-35);
                    i4 = ((iM55680 ^ i10) * (-27843)) ^ 481666416;
                    i6 = 1203182285;
                    i13 = iM55680 ^ i6;
                    i12 = i4;
                    break;
                case -1877666708:
                case -867946363:
                    onClickListener = onClickListener;
                    strM55619 = C0861.m55618(f82272, 404, 3, i14);
                    if (C0845.m55584() <= 0) {
                        iM559710 = (C0873.m55680("᩷ܺ") ^ i11) * (-107);
                        i4 = ((iM559710 ^ i10) * 4029) ^ (-547804856);
                        i5 = 1259307593;
                    } else {
                        iM559710 = (i11 - C0873.m55680("ܶܰ")) * 67;
                        i4 = ((iM559710 ^ i10) * 7517) ^ (-1150309527);
                        i5 = 1464890883;
                    }
                    int i23 = iM559710 ^ i5;
                    onClickListener = onClickListener;
                    i13 = i23;
                    i12 = i4;
                    break;
                case -1616869996:
                case 1196218365:
                    C0937.m55918();
                    C1071.m56343();
                    break;
                case -1369683091:
                case -465422771:
                    DialogInterface.OnClickListener onClickListener2 = onClickListener;
                    C13039 c130310 = c13039;
                    int iM55626 = C0861.m55625(arrayList);
                    HashSet hashSet2 = f54941;
                    if (i15 < iM55626) {
                        iM559712 = (C0946.m55979("֫᩻") + i10) * (-87);
                        i8 = ((iM559712 ^ i11) * (-6759)) ^ 1208239612;
                        i9 = -1043617045;
                    } else {
                        iM559712 = C0946.m55979("᩻᩶") ^ i11;
                        i8 = ((iM559712 ^ i10) * 6897) ^ 1555458623;
                        i9 = 509165866;
                    }
                    int i24 = iM559712 ^ i9;
                    c13039 = c130310;
                    i12 = i8;
                    onClickListener = onClickListener2;
                    i13 = i24;
                    hashSet = hashSet2;
                    break;
                case -1229108661:
                case 680387650:
                    C13039 c130311 = (C13039) C0992.m56115(arrayList, i15);
                    strArr[i15] = ServiceConnectionC1013.m56156(c130311.f36665);
                    str2 = c130311.f36664;
                    if (RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("֡᩷") ^ i11;
                        i4 = ((iM55680 ^ i10) * 28885) ^ 193770867;
                        i6 = 1892895492;
                    } else {
                        iM55680 = (C0946.m55979("᩶᩵") + i11) * (-35);
                        i4 = ((iM55680 ^ i10) * (-27843)) ^ 481666416;
                        i6 = 1203182285;
                    }
                    i13 = iM55680 ^ i6;
                    i12 = i4;
                    break;
                case -1149190823:
                case -853383201:
                    C1229.m56410();
                    break;
                case -1007366127:
                case -708541257:
                    i14 = 47906;
                    iM559711 = (i11 - C0873.m55680("۟ۡ")) * (-67);
                    i = ((iM559711 ^ i10) * (-24339)) ^ 407073563;
                    i7 = -671706585;
                    i3 = iM559711 ^ i7;
                    c13039 = c13039;
                    i12 = i;
                    onClickListener = onClickListener;
                    i13 = i3;
                    break;
                case -968118302:
                case 1722508363:
                    iM55625 = C0861.m55625(arrayList);
                    int i25 = iM55625 + 1;
                    i15 = 0;
                    zArr = new boolean[i25];
                    strArr = new String[i25];
                    iM559711 = C0873.m55680("ۨ᩻") ^ i11;
                    i = ((iM559711 ^ i10) * 18575) ^ (-1480117310);
                    i7 = 538157539;
                    i3 = iM559711 ^ i7;
                    c13039 = c13039;
                    i12 = i;
                    onClickListener = onClickListener;
                    i13 = i3;
                    break;
                case -854805727:
                case 226145149:
                    if (C1194.f82045 == 0) {
                        onClickListener = onClickListener;
                        c13039 = c13039;
                        iM559711 = (C0946.m55979("֫۠") ^ i10) * (-25);
                        i = ((iM559711 ^ i11) * (-10829)) ^ 1145103103;
                        i7 = -539794659;
                        i3 = iM559711 ^ i7;
                        c13039 = c13039;
                        i12 = i;
                        onClickListener = onClickListener;
                        i13 = i3;
                    } else {
                        onClickListener = onClickListener;
                        iM559710 = (C0946.m55979("ۢۙ") + i10) * (-61);
                        i4 = ((iM559710 ^ i11) * (-9969)) ^ 1256332862;
                        i5 = -96058105;
                        int i26 = iM559710 ^ i5;
                        onClickListener = onClickListener;
                        i13 = i26;
                        i12 = i4;
                    }
                    break;
                case -831563723:
                case -659512752:
                    ViewOnClickListenerC0939.m55953(c20671M55888, iM559714 ^ i17, onClickListener);
                    onClickListener = onClickListener;
                    strM55618 = C0861.m55618(f82272, 415, 3, i14);
                    if (C0845.m55584() <= 0) {
                        iM559710 = (C0946.m55979("ۢۙ") + i10) * (-61);
                        i4 = ((iM559710 ^ i11) * (-9969)) ^ 1256332862;
                        i5 = -96058105;
                    } else {
                        iM559710 = (C0946.m55979("۟ᩳ") ^ i10) * (-33);
                        i4 = ((iM559710 ^ i11) * (-26467)) ^ 1782767866;
                        i5 = -135879887;
                    }
                    int i27 = iM559710 ^ i5;
                    onClickListener = onClickListener;
                    i13 = i27;
                    i12 = i4;
                    break;
                case -790790535:
                case 1262900030:
                    onClickListener = onClickListener;
                    c13039 = c13039;
                    if (C0930.m55886(itM56593)) {
                        iM559711 = (i10 - C0946.m55979("ۗܺ")) * (-41);
                        i = ((iM559711 ^ i11) * (-7765)) ^ (-1306831659);
                        i7 = -1468883882;
                    } else {
                        iM559711 = C0946.m55979("֨ܿ") ^ i11;
                        i = ((iM559711 ^ i10) * (-5003)) ^ 400121067;
                        i7 = 1208222568;
                    }
                    i3 = iM559711 ^ i7;
                    c13039 = c13039;
                    i12 = i;
                    onClickListener = onClickListener;
                    i13 = i3;
                    break;
                case -699005755:
                case -219921730:
                    onClickListener = onClickListener;
                    iM559714 = C0946.m55979(C1053.m56325(sArr2, 412, 3, i14));
                    i17 = 2118872707;
                    if (C0845.f81821 >= 0) {
                        iM559710 = (C0946.m55979("ۢۙ") + i10) * (-61);
                        i4 = ((iM559710 ^ i11) * (-9969)) ^ 1256332862;
                        i5 = -96058105;
                    } else {
                        iM559710 = (i11 - C0873.m55680("᩹᩻")) * (-75);
                        i4 = ((iM559710 ^ i10) * 25285) ^ (-742973946);
                        i5 = -1753535961;
                    }
                    int i28 = iM559710 ^ i5;
                    onClickListener = onClickListener;
                    i13 = i28;
                    i12 = i4;
                    break;
                case -632997866:
                case 1764164842:
                    onClickListener = onClickListener;
                    str = strM55947;
                    iM55681 = C0873.m55680(strM55619) ^ 2100021210;
                    if (!C0917.f81868) {
                        iM55979 = C0946.m55979("֡֫") ^ i10;
                        i = ((iM55979 ^ i11) * 26031) ^ 480292039;
                        i2 = 1646195363;
                        i3 = iM55979 ^ i2;
                        strM55947 = str;
                        i12 = i;
                        onClickListener = onClickListener;
                        i13 = i3;
                    } else {
                        strM55947 = str;
                        onClickListener = onClickListener;
                        iM55680 = (C0946.m55979("᩶᩵") + i11) * (-35);
                        i4 = ((iM55680 ^ i10) * (-27843)) ^ 481666416;
                        i6 = 1203182285;
                        i13 = iM55680 ^ i6;
                        i12 = i4;
                    }
                    break;
                case -147719542:
                case -140246318:
                    C0861.m55627(c20671M55888, iM55682);
                    c20671M55888.m46725(strArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.۟᩸ܳ
                        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                        public final void onClick(DialogInterface dialogInterface, int i29, boolean z) {
                            zArr[i29] = z;
                        }
                    });
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۧ᩹ܳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i29) {
                            C18402.m41884(iM55625, zArr, arrayList);
                        }
                    };
                    sArr2 = f82272;
                    if (C0854.m55595() >= 0) {
                        iM55680 = (C0946.m55979("᩶᩵") + i11) * (-35);
                        i4 = ((iM55680 ^ i10) * (-27843)) ^ 481666416;
                        i6 = 1203182285;
                    } else {
                        iM55680 = (i10 - C0873.m55680("ۖۘ")) * (-125);
                        i4 = ((iM55680 ^ i11) * 17865) ^ 1359857268;
                        i6 = -1179403340;
                    }
                    i13 = iM55680 ^ i6;
                    i12 = i4;
                    break;
                case -23291409:
                case 1100803947:
                    zArr[i15] = !C1071.m56338(hashSet, str2);
                    i15++;
                    iM559711 = C0873.m55680("ۨ᩻") ^ i11;
                    i = ((iM559711 ^ i10) * 18575) ^ (-1480117310);
                    i7 = 538157539;
                    i3 = iM559711 ^ i7;
                    c13039 = c13039;
                    i12 = i;
                    onClickListener = onClickListener;
                    i13 = i3;
                    break;
                case 126039505:
                case 2059629952:
                    onClickListener = onClickListener;
                    str = strM55947;
                    zArr[iM55625] = !C1071.m56338(hashSet, str);
                    c20671M55888 = C0930.m55888(abstractActivityC5549);
                    sArr = f82272;
                    i16 = 409;
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (C0873.m55680("ܰۚ") + i10) * 33;
                        i = ((iM55979 ^ i11) * 19625) ^ 199486189;
                        i2 = -1758859378;
                        i3 = iM55979 ^ i2;
                        strM55947 = str;
                        i12 = i;
                        onClickListener = onClickListener;
                        i13 = i3;
                    } else {
                        strM55947 = str;
                        iM559710 = (C0873.m55680("᩷ܺ") ^ i11) * (-107);
                        i4 = ((iM559710 ^ i10) * 4029) ^ (-547804856);
                        i5 = 1259307593;
                        int i29 = iM559710 ^ i5;
                        onClickListener = onClickListener;
                        i13 = i29;
                        i12 = i4;
                    }
                    break;
                case 376644776:
                case 930677920:
                    onClickListener = onClickListener;
                    arrayList = new ArrayList();
                    itM56593 = C1964.m56593(f54943.values());
                    iM559710 = (C0873.m55680("ۢۚ") ^ i10) * (-61);
                    i4 = ((iM559710 ^ i11) * 6953) ^ (-1771488054);
                    i5 = 1506170785;
                    int i210 = iM559710 ^ i5;
                    onClickListener = onClickListener;
                    i13 = i210;
                    i12 = i4;
                    break;
                case 880970541:
                case 1020696425:
                    onClickListener = onClickListener;
                    c13039 = c13039;
                    int i30 = s + 1;
                    if ((i30 * i30) - (i18 + 1) < 0) {
                        iM559711 = (i10 - C0946.m55979("֨ܺ")) * (-39);
                        i = ((iM559711 ^ i11) * (-8301)) ^ 1271208175;
                        i7 = 631356479;
                    } else {
                        iM559711 = (i10 - C0873.m55680("᩸ܶ")) * (-11);
                        i = ((iM559711 ^ i11) * 27939) ^ 1993787591;
                        i7 = 1560853817;
                    }
                    i3 = iM559711 ^ i7;
                    c13039 = c13039;
                    i12 = i;
                    onClickListener = onClickListener;
                    i13 = i3;
                    break;
                case 1119692936:
                case 1124843427:
                    onClickListener = onClickListener;
                    C1194.m56393(arrayList, c13039);
                    iM559710 = (C0873.m55680("ۢۚ") ^ i10) * (-61);
                    i4 = ((iM559710 ^ i11) * 6953) ^ (-1771488054);
                    i5 = 1506170785;
                    int i211 = iM559710 ^ i5;
                    onClickListener = onClickListener;
                    i13 = i211;
                    i12 = i4;
                    break;
                case 1323874644:
                case 1928351282:
                    C0877.m55696();
                    C1025.m56230();
                    iM55680 = (C0873.m55680("ܺۗ") + i11) * (-13);
                    i4 = ((iM55680 ^ i10) * (-1501)) ^ (-691063789);
                    i6 = -2103237453;
                    i13 = iM55680 ^ i6;
                    i12 = i4;
                    break;
                case 1594072484:
                case 1895534957:
                    onClickListener = onClickListener;
                    c13039 = c13039;
                    s = f82272[403];
                    i18 = s * 2;
                    if (RunnableC1014.m56177()) {
                        iM559711 = (C0946.m55979("ᩴܺ") ^ i11) * 95;
                        i = ((iM559711 ^ i10) * (-23969)) ^ 1903953007;
                        i7 = -224987220;
                    } else {
                        iM559711 = (C0946.m55979("֫۠") ^ i10) * (-25);
                        i = ((iM559711 ^ i11) * (-10829)) ^ 1145103103;
                        i7 = -539794659;
                    }
                    i3 = iM559711 ^ i7;
                    c13039 = c13039;
                    i12 = i;
                    onClickListener = onClickListener;
                    i13 = i3;
                    break;
                default:
                    C0930.m55885();
                    if (C0873.f81841 <= 0) {
                        onClickListener = onClickListener;
                        iM559710 = (C0873.m55680("᩷ܺ") ^ i11) * (-107);
                        i4 = ((iM559710 ^ i10) * 4029) ^ (-547804856);
                        i5 = 1259307593;
                        int i212 = iM559710 ^ i5;
                        onClickListener = onClickListener;
                        i13 = i212;
                        i12 = i4;
                    }
                    onClickListener = onClickListener;
                    iM559710 = (C0946.m55979("ۢۙ") + i10) * (-61);
                    i4 = ((iM559710 ^ i11) * (-9969)) ^ 1256332862;
                    i5 = -96058105;
                    int i213 = iM559710 ^ i5;
                    onClickListener = onClickListener;
                    i13 = i213;
                    i12 = i4;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x018c  */
    /* JADX WARN: Code duplicated, block: B:60:0x01df A[PHI: r1 r10 r11
      0x01df: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v4 int) binds: [B:28:0x00a4, B:14:0x006e, B:59:0x01dd] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r10v11 l.֫ܶۢ) = (r10v10 l.֫ܶۢ), (r10v10 l.֫ܶۢ), (r10v12 l.֫ܶۢ) binds: [B:28:0x00a4, B:14:0x006e, B:59:0x01dd] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r11v7 l.۟ۢۡ) = (r11v4 l.۟ۢۡ), (r11v3 l.۟ۢۡ), (r11v3 l.۟ۢۡ) binds: [B:28:0x00a4, B:14:0x006e, B:59:0x01dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public C18402(Main main, C5522 c5522) {
        int iM55979;
        int i;
        int i2 = 0;
        C12897 c12897 = null;
        C13596 c13596M30925 = null;
        C24497 c24497 = null;
        int i3 = 192310485;
        int i4 = C0949.f81897;
        int i5 = RunnableC0938.f81886;
        short s = f82272[369];
        String strM56156 = ServiceConnectionC1013.m56156(C0873.m55680(C0890.m55726(f82272, 370, 3, (34564 * s) - ((s * s) + 298667524) <= 0 ? 1534 : 38247)) ^ 2129415979);
        super(main, strM56156, strM56156, c5522);
        int iM559710 = (C0946.m55979("֫ۨ") ^ i4) * (-125);
        int i6 = ((iM559710 ^ i5) * 19701) ^ 109961254;
        int i7 = iM559710 ^ 598535309;
        C4179 c4179 = null;
        while (true) {
            C9387 c9387 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-19259)) >> 31) & i6) ^ i7;
                switch (i3) {
                    case -2066247544:
                    case 1775445119:
                        C0890.m55740();
                        if (!C0882.f81846) {
                        }
                        iM55979 = (i5 - C0946.m55979("۫ܿ")) * 79;
                        i6 = ((iM55979 ^ i4) * 315) ^ (-1801894292);
                        i = 1954953214;
                        i7 = iM55979 ^ i;
                        break;
                    case -1832097610:
                    case -314457513:
                        m41895();
                        if (C0927.m55873() > 0) {
                            c9387 = new C9387(2, this);
                            if (C1124.f82007 >= 0) {
                                iM55979 = (i5 - C0946.m55979("۫ܿ")) * 79;
                                i6 = ((iM55979 ^ i4) * 315) ^ (-1801894292);
                                i = 1954953214;
                            } else {
                                iM55979 = (i4 - C0873.m55680("᩸ۙ")) * 49;
                                i6 = ((iM55979 ^ i5) * 5381) ^ (-406338872);
                                i = 186768540;
                            }
                            i7 = iM55979 ^ i;
                        }
                        break;
                    case -1814845143:
                    case -733803526:
                        f54940.m15372(main, c9387);
                        return;
                    case -1379711094:
                    case 1844446733:
                        this.f54946 = C13596.m30925(c4179);
                        if (C0863.m55643()) {
                            iM55979 = (C0946.m55979("ۢۘ") + i5) * (-69);
                            i6 = ((iM55979 ^ i4) * (-7221)) ^ 2027179780;
                            i = -2142353755;
                        } else {
                            iM55979 = (C0873.m55680("ܺۛ") ^ i5) * 89;
                            i6 = ((iM55979 ^ i4) * (-1447)) ^ 1988717180;
                            i = 1405106292;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1175460304:
                    case -307350674:
                        this.f54947 = c13596M30925;
                        if (C0906.f81862 >= 0) {
                            iM55979 = C0873.m55680("ۙۖ") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-2891)) ^ 150789362;
                            i = 355767487;
                        } else {
                            iM55979 = C0873.m55680("ܰܺ") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-22843)) ^ 608755981;
                            i = -271814617;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1018577348:
                    case -661924019:
                        i2 = 1;
                        if (C0946.f81894 == 0) {
                            c4179 = new C4179(i2);
                            if (C0845.m55584() <= 0) {
                                iM55979 = (i5 - C0946.m55979("۫ܿ")) * 79;
                                i6 = ((iM55979 ^ i4) * 315) ^ (-1801894292);
                                i = 1954953214;
                            } else {
                                iM55979 = C0946.m55979("ܽܶ") ^ i4;
                                i6 = ((iM55979 ^ i5) * (-13519)) ^ (-1940392446);
                                i = 1955933237;
                            }
                            i7 = iM55979 ^ i;
                        } else {
                            int iM55680 = (i4 - C0873.m55680("ۗ᩵")) * 101;
                            i6 = ((iM55680 ^ i5) * (-4201)) ^ 400233365;
                            i7 = iM55680 ^ (-671159336);
                            c4179 = null;
                        }
                        break;
                    case -465621017:
                    case -303651210:
                        C1194.m56396();
                        C0917.m55854();
                        throw new RuntimeException();
                    case -271449398:
                    case 898426208:
                        if (C0912.f81867 > 0) {
                            int iM55681 = (i4 - C0873.m55680("ۗ᩵")) * 101;
                            i6 = ((iM55681 ^ i5) * (-4201)) ^ 400233365;
                            i7 = iM55681 ^ (-671159336);
                            c4179 = null;
                        } else {
                            iM55979 = (C0873.m55680("ܺۛ") ^ i5) * 89;
                            i6 = ((iM55979 ^ i4) * (-1447)) ^ 1988717180;
                            i = 1405106292;
                            i7 = iM55979 ^ i;
                        }
                        break;
                    case 636887243:
                    case 1765398672:
                        C0937.m55918();
                        C0946.m55980();
                        iM55979 = (C0873.m55680("ܺۛ") ^ i5) * 89;
                        i6 = ((iM55979 ^ i4) * (-1447)) ^ 1988717180;
                        i = 1405106292;
                        i7 = iM55979 ^ i;
                        break;
                    case 756496773:
                    case 1876783427:
                        c12897 = new C12897(i2);
                        if (C1071.f81975 > 0) {
                            iM55979 = (C0946.m55979("᩹֨") ^ i4) * (-51);
                            i6 = ((iM55979 ^ i5) * (-6327)) ^ 480266158;
                            i = -811401753;
                            i7 = iM55979 ^ i;
                        } else {
                            int iM55682 = (i4 - C0873.m55680("ۗ᩵")) * 101;
                            i6 = ((iM55682 ^ i5) * (-4201)) ^ 400233365;
                            i7 = iM55682 ^ (-671159336);
                            c4179 = null;
                        }
                        break;
                    case 792735927:
                    case 2029338152:
                        this.f54948 = c24497;
                        if (C1929.m56553()) {
                            iM55979 = (C0873.m55680("ܺۛ") ^ i5) * 89;
                            i6 = ((iM55979 ^ i4) * (-1447)) ^ 1988717180;
                            i = 1405106292;
                        } else {
                            iM55979 = C0873.m55680("ܺܳ") ^ i5;
                            i6 = ((iM55979 ^ i4) * 2703) ^ (-922480262);
                            i = 53432485;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 1213700500:
                    case 2117028103:
                        c24497 = new C24497(this);
                        if (!C0949.m56012()) {
                            iM55979 = C0946.m55979("ۘ۟") ^ i4;
                            i6 = ((iM55979 ^ i5) * 23225) ^ 179708780;
                            i = -166303850;
                            i7 = iM55979 ^ i;
                        }
                        break;
                    case 1395819435:
                    case 2085508338:
                        c13596M30925 = C13596.m30925(c12897);
                        if (!C0955.m56025()) {
                            iM55979 = C0873.m55680("ۛۨ") ^ i5;
                            i6 = ((iM55979 ^ i4) * 2137) ^ (-1491163929);
                            i = 671933047;
                            i7 = iM55979 ^ i;
                        } else {
                            int iM55683 = (i4 - C0873.m55680("ۗ᩵")) * 101;
                            i6 = ((iM55683 ^ i5) * (-4201)) ^ 400233365;
                            i7 = iM55683 ^ (-671159336);
                            c4179 = null;
                        }
                        break;
                    default:
                        C0890.m55740();
                        if (C1404.f82149 >= 0) {
                        }
                        int iM55684 = (i4 - C0873.m55680("ۗ᩵")) * 101;
                        i6 = ((iM55684 ^ i5) * (-4201)) ^ 400233365;
                        i7 = iM55684 ^ (-671159336);
                        c4179 = null;
                        break;
                }
            }
            int iM55685 = (C0873.m55680("ܽܿ") ^ i4) * (-97);
            i6 = ((iM55685 ^ i5) * 21097) ^ 840937324;
            i7 = iM55685 ^ (-1815238756);
        }
    }

    @Override // p067l.AbstractViewOnClickListenerC14239, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int iM55680;
        int i;
        int i2;
        short[] sArr;
        C0994 c0994;
        int iM55681;
        int i3;
        int iM55979;
        int i4;
        int i5;
        int iM559710;
        int i6;
        int i7;
        int i8;
        final C18402 c18402 = this;
        int i9 = ServiceConnectionC1013.f81940;
        int i10 = C1964.f83032;
        int iM559711 = C0946.m55979("۫ۡ") ^ i10;
        int i11 = ((iM559711 ^ i9) * 8135) ^ (-840428088);
        C0994 c0994M50638 = null;
        InterfaceC1583 interfaceC1583 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i12 = iM559711 ^ (-129239625);
        int iM55682 = 0;
        int iM559712 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        short s = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1619520398;
        C1898 c1898 = null;
        MenuItem menuItemM55972 = null;
        short[] sArr4 = null;
        boolean z = false;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            i20 = i12 ^ (i11 & (((i20 ^ i9) * 14805) >> 31));
            switch (i20) {
                case -2039633390:
                case 1039344207:
                    z = z ? 1 : 0;
                    sArr = sArr2;
                    c0994 = c0994M50638;
                    short s2 = sArr4[c];
                    int i23 = s2 + 7158;
                    if (C0992.f81922 >= 0) {
                        s = s2;
                        i18 = i23;
                        iM55681 = C0946.m55979("ۙ᩷") ^ i9;
                        i11 = ((iM55681 ^ i10) * 16137) ^ (-2056574856);
                        i3 = -2095084584;
                        int i24 = iM55681 ^ i3;
                        z = z;
                        c0994M50638 = c0994;
                        i12 = i24;
                        sArr2 = sArr;
                    } else {
                        int iM55683 = C0873.m55680("ܽ᩶") ^ i10;
                        int i25 = ((iM55683 ^ i9) * 28675) ^ 1484341692;
                        i18 = i23;
                        z = z ? 1 : 0;
                        c0994M50638 = c0994;
                        sArr2 = sArr;
                        i12 = iM55683 ^ 396619750;
                        s = s2;
                        i11 = i25;
                    }
                    c18402 = this;
                    break;
                case -1847677207:
                case -1467215711:
                    i21 = iM55682 ^ 2100744512;
                    if (C0949.f81897 < 0) {
                        iM55680 = C0873.m55680("۟ۨ") ^ i10;
                        i = ((iM55680 ^ i9) * 10551) ^ 856676144;
                        i2 = 1834251878;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    } else {
                        sArr2 = sArr2;
                        c0994M50638 = c0994M50638;
                        iM55979 = C0873.m55680("ܶۨ") ^ i9;
                        i4 = ((iM55979 ^ i10) * 3251) ^ (-1652011898);
                        i5 = -1850335796;
                        i8 = iM55979 ^ i5;
                        c0994M50638 = c0994M50638;
                        sArr2 = sArr2;
                        boolean z2 = z;
                        i12 = i8;
                        i11 = i4;
                        z = z2 ? 1 : 0;
                    }
                    break;
                case -1626692557:
                case -407324430:
                    z = z ? 1 : 0;
                    sArr2 = sArr2;
                    c0994M50638 = c0994M50638;
                    c1898 = new C1898(c18402.f37526, view, 8388693);
                    C9702.m22649(view);
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("ܶۨ") ^ i9;
                        i4 = ((iM55979 ^ i10) * 3251) ^ (-1652011898);
                        i5 = -1850335796;
                    } else {
                        iM55979 = C0946.m55979("᩶ܺ") ^ i10;
                        i4 = ((iM55979 ^ i9) * (-32237)) ^ 254947309;
                        i5 = 526564346;
                    }
                    i8 = iM55979 ^ i5;
                    c0994M50638 = c0994M50638;
                    sArr2 = sArr2;
                    boolean z3 = z;
                    i12 = i8;
                    i11 = i4;
                    z = z3 ? 1 : 0;
                    break;
                case -1366032192:
                case -1130856685:
                    z = z ? 1 : 0;
                    sArr2 = sArr2;
                    c0994M50638 = c0994M50638;
                    int i26 = i16 + i17;
                    if (i19 - (i26 + i26) > 0) {
                        iM55979 = (i9 - C0946.m55979("ۛۡ")) * 21;
                        i4 = ((iM55979 ^ i10) * (-18233)) ^ (-2084012113);
                        i5 = -894761107;
                    } else {
                        iM55979 = C0873.m55680("ܽۗ") ^ i9;
                        i4 = ((iM55979 ^ i10) * 29465) ^ (-1269080223);
                        i5 = -1709217397;
                    }
                    i8 = iM55979 ^ i5;
                    c0994M50638 = c0994M50638;
                    sArr2 = sArr2;
                    boolean z4 = z;
                    i12 = i8;
                    i11 = i4;
                    z = z4 ? 1 : 0;
                    break;
                case -1267807391:
                case 1822687663:
                    iM559712 = C0946.m55979(C0906.m55810(sArr3, i14, i15, i13));
                    i22 = 2126752874;
                    if (!C0877.m55696()) {
                        sArr2 = sArr2;
                        c0994M50638 = c0994M50638;
                        iM55979 = C0873.m55680("ܶۨ") ^ i9;
                        i4 = ((iM55979 ^ i10) * 3251) ^ (-1652011898);
                        i5 = -1850335796;
                        i8 = iM55979 ^ i5;
                        c0994M50638 = c0994M50638;
                        sArr2 = sArr2;
                        boolean z5 = z;
                        i12 = i8;
                        i11 = i4;
                        z = z5 ? 1 : 0;
                    } else {
                        iM55680 = C0873.m55680("ۗ᩹") ^ i9;
                        i = ((iM55680 ^ i10) * 12823) ^ (-1642690268);
                        i2 = -704733587;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    }
                    break;
                case -1158797889:
                case 1356726279:
                    i13 = 1203;
                    iM55979 = C0946.m55979("ۗۤ") ^ i10;
                    i4 = ((iM55979 ^ i9) * 29923) ^ 1134431428;
                    i5 = -10122076;
                    i8 = iM55979 ^ i5;
                    c0994M50638 = c0994M50638;
                    sArr2 = sArr2;
                    boolean z6 = z;
                    i12 = i8;
                    i11 = i4;
                    z = z6 ? 1 : 0;
                    break;
                case -916135364:
                case 956925343:
                    C0967.m56067(menuItemM55972, iM559712 ^ i22);
                    interfaceC1583 = new InterfaceC1583() { // from class: l.ܽ᩹ܳ
                        @Override // p067l.InterfaceC1583
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            if (menuItem.getItemId() != R.string.MT_Protector) {
                                return false;
                            }
                            C18402.m41888(this.f55184.f37526);
                            return true;
                        }
                    };
                    if (C0906.f81862 < 0) {
                        iM55680 = (C0873.m55680("᩹ܳ") + i10) * 123;
                        i = ((iM55680 ^ i9) * 32603) ^ 1581980325;
                        i2 = -2099527709;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    } else {
                        z = z ? 1 : 0;
                        sArr2 = sArr2;
                        c0994M50638 = c0994M50638;
                        iM55979 = C0946.m55979("ܿܺ") ^ i10;
                        i4 = ((iM55979 ^ i9) * 11565) ^ (-1057288821);
                        i5 = 2105313054;
                        i8 = iM55979 ^ i5;
                        c0994M50638 = c0994M50638;
                        sArr2 = sArr2;
                        boolean z7 = z;
                        i12 = i8;
                        i11 = i4;
                        z = z7 ? 1 : 0;
                    }
                    break;
                case -897167190:
                case 381009620:
                    short[] sArr5 = sArr2;
                    C0994 c0995 = c0994M50638;
                    if (c18402.f40549.m12191()) {
                        iM559710 = (i10 - C0873.m55680("ۢۨ")) * (-15);
                        i6 = ((iM559710 ^ i9) * 17065) ^ 578202788;
                        i7 = 883921153;
                    } else {
                        iM559710 = C0946.m55979("֡ܰ") ^ i9;
                        i6 = ((iM559710 ^ i10) * 12671) ^ (-365801723);
                        i7 = 1946019052;
                    }
                    i12 = iM559710 ^ i7;
                    i11 = i6;
                    c0994M50638 = c0995;
                    z = false;
                    sArr2 = sArr5;
                    break;
                case -844616190:
                case 807013865:
                    z = z ? 1 : 0;
                    sArr = sArr2;
                    c0994 = c0994M50638;
                    sArr4 = f82272;
                    c = 586;
                    if (C0877.f81843 >= 0) {
                        iM55681 = C0946.m55979("ۙ᩷") ^ i9;
                        i11 = ((iM55681 ^ i10) * 16137) ^ (-2056574856);
                        i3 = -2095084584;
                    } else {
                        iM55681 = C0873.m55680("ܽ۬") ^ i9;
                        i11 = ((iM55681 ^ i10) * 23691) ^ (-1359418583);
                        i3 = 1788524589;
                    }
                    int i27 = iM55681 ^ i3;
                    z = z;
                    c0994M50638 = c0994;
                    i12 = i27;
                    sArr2 = sArr;
                    c18402 = this;
                    break;
                case -676274580:
                case 1736027948:
                    c1898.m50636(interfaceC1583);
                    c1898.m50639();
                    return true;
                case -610860676:
                case 1498406057:
                    C0937.m55918();
                    C0861.m55626();
                    z = z ? 1 : 0;
                    sArr = sArr2;
                    c0994 = c0994M50638;
                    iM55681 = C0946.m55979("ۙ᩷") ^ i9;
                    i11 = ((iM55681 ^ i10) * 16137) ^ (-2056574856);
                    i3 = -2095084584;
                    int i28 = iM55681 ^ i3;
                    z = z;
                    c0994M50638 = c0994;
                    i12 = i28;
                    sArr2 = sArr;
                    c18402 = this;
                    break;
                case -485486132:
                case 274124461:
                    return z;
                case -91305183:
                case 1994947521:
                    i13 = 16133;
                    iM55979 = C0946.m55979("ۗۤ") ^ i10;
                    i4 = ((iM55979 ^ i9) * 29923) ^ 1134431428;
                    i5 = -10122076;
                    i8 = iM55979 ^ i5;
                    c0994M50638 = c0994M50638;
                    sArr2 = sArr2;
                    boolean z8 = z;
                    i12 = i8;
                    i11 = i4;
                    z = z8 ? 1 : 0;
                    break;
                case 429216907:
                case 1992161814:
                    sArr2 = sArr2;
                    iM55682 = C0873.m55680(C0946.m55986(sArr2, 587, 3, i13));
                    if (C0894.f81854 >= 0) {
                        c0994M50638 = c0994M50638;
                        iM55979 = C0873.m55680("ܶۨ") ^ i9;
                        i4 = ((iM55979 ^ i10) * 3251) ^ (-1652011898);
                        i5 = -1850335796;
                        i8 = iM55979 ^ i5;
                        c0994M50638 = c0994M50638;
                    } else {
                        int iM559713 = C0946.m55979("ܶܳ") ^ i10;
                        z = z ? 1 : 0;
                        i4 = ((iM559713 ^ i9) * 13007) ^ 1244832378;
                        i8 = iM559713 ^ (-1653608193);
                    }
                    sArr2 = sArr2;
                    boolean z9 = z;
                    i12 = i8;
                    i11 = i4;
                    z = z9 ? 1 : 0;
                    break;
                case 553031596:
                case 1599187315:
                    if (!C0866.m55645()) {
                        z = z ? 1 : 0;
                        sArr2 = sArr2;
                        c0994M50638 = c0994M50638;
                        iM55979 = C0946.m55979("ܿܺ") ^ i10;
                        i4 = ((iM55979 ^ i9) * 11565) ^ (-1057288821);
                        i5 = 2105313054;
                        i8 = iM55979 ^ i5;
                        c0994M50638 = c0994M50638;
                        sArr2 = sArr2;
                        boolean z10 = z;
                        i12 = i8;
                        i11 = i4;
                        z = z10 ? 1 : 0;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ۖ۟")) * 17;
                        i = ((iM55680 ^ i10) * (-21905)) ^ 756884249;
                        i2 = -450422338;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    }
                    break;
                case 574624732:
                case 896870846:
                    z = z ? 1 : 0;
                    sArr2 = sArr2;
                    c0994M50638 = c0994M50638;
                    i19 = i18 * i18;
                    i16 = s * s;
                    i17 = 51236964;
                    if (C0892.f81851) {
                        iM55979 = (i10 - C0873.m55680("֨ܺ")) * (-47);
                        i4 = ((iM55979 ^ i9) * (-13517)) ^ (-1005102864);
                        i5 = -1477755342;
                    } else {
                        iM55979 = C0946.m55979("ܿܺ") ^ i10;
                        i4 = ((iM55979 ^ i9) * 11565) ^ (-1057288821);
                        i5 = 2105313054;
                    }
                    i8 = iM55979 ^ i5;
                    c0994M50638 = c0994M50638;
                    sArr2 = sArr2;
                    boolean z11 = z;
                    i12 = i8;
                    i11 = i4;
                    z = z11 ? 1 : 0;
                    break;
                case 713197213:
                case 1308110533:
                    z = z ? 1 : 0;
                    c1898.m50640();
                    c0994M50638 = c1898.m50638();
                    sArr2 = f82272;
                    if (C1012.m56134() > 0) {
                        int iM55684 = (C0873.m55680("ܰۛ") ^ i9) * 69;
                        i4 = ((iM55684 ^ i10) * (-24583)) ^ (-1246613415);
                        i8 = iM55684 ^ (-956113012);
                        boolean z12 = z;
                        i12 = i8;
                        i11 = i4;
                        z = z12 ? 1 : 0;
                    } else {
                        sArr = sArr2;
                        c0994 = c0994M50638;
                        iM55681 = C0946.m55979("ۙ᩷") ^ i9;
                        i11 = ((iM55681 ^ i10) * 16137) ^ (-2056574856);
                        i3 = -2095084584;
                        int i29 = iM55681 ^ i3;
                        z = z;
                        c0994M50638 = c0994;
                        i12 = i29;
                        sArr2 = sArr;
                        c18402 = this;
                    }
                    break;
                case 947671813:
                case 1218405926:
                    C1053.m56327();
                    if (C0898.f81858 <= 0) {
                        iM55680 = (i9 - C0873.m55680("ۖ۟")) * 17;
                        i = ((iM55680 ^ i10) * (-21905)) ^ 756884249;
                        i2 = -450422338;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    } else {
                        z = z ? 1 : 0;
                        sArr = sArr2;
                        c0994 = c0994M50638;
                        iM55681 = C0946.m55979("ۙ᩷") ^ i9;
                        i11 = ((iM55681 ^ i10) * 16137) ^ (-2056574856);
                        i3 = -2095084584;
                        int i210 = iM55681 ^ i3;
                        z = z;
                        c0994M50638 = c0994;
                        i12 = i210;
                        sArr2 = sArr;
                        c18402 = this;
                    }
                    break;
                case 1524144667:
                case 2101415630:
                    if (C1071.f81975 > 0) {
                        iM55680 = C0946.m55979("ܿᩴ") ^ i10;
                        i = ((iM55680 ^ i9) * 5249) ^ (-1939473063);
                        i2 = 353725018;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    } else {
                        z = z ? 1 : 0;
                        sArr2 = sArr2;
                        c0994M50638 = c0994M50638;
                        iM55979 = C0946.m55979("ܿܺ") ^ i10;
                        i4 = ((iM55979 ^ i9) * 11565) ^ (-1057288821);
                        i5 = 2105313054;
                        i8 = iM55979 ^ i5;
                        c0994M50638 = c0994M50638;
                        sArr2 = sArr2;
                        boolean z13 = z;
                        i12 = i8;
                        i11 = i4;
                        z = z13 ? 1 : 0;
                    }
                    break;
                case 1877512214:
                case 2120262139:
                    C0863.m55643();
                    C0898.m55800();
                    return false;
                default:
                    menuItemM55972 = C0946.m55972(c0994M50638, z ? 1 : 0, i21, z ? 1 : 0, i21);
                    sArr3 = f82272;
                    i14 = 590;
                    i15 = 3;
                    if (C1053.f81965 <= 0) {
                        iM55680 = (i9 - C0873.m55680("ۖ۟")) * 17;
                        i = ((iM55680 ^ i10) * (-21905)) ^ 756884249;
                        i2 = -450422338;
                    } else {
                        iM55680 = (C0873.m55680("ۧ֨") ^ i9) * 41;
                        i = ((iM55680 ^ i10) * (-16285)) ^ (-1177727936);
                        i2 = -1624080682;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0192 A[PHI: r7 r8 r10 r12 r21
      0x0192: PHI (r7v4 l.۬ۤۡ) = (r7v3 l.۬ۤۡ), (r7v2 l.۬ۤۡ), (r7v2 l.۬ۤۡ) binds: [B:45:0x0190, B:37:0x014f, B:21:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v3 java.lang.String), (r8v2 java.lang.String) binds: [B:45:0x0190, B:37:0x014f, B:21:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:45:0x0190, B:37:0x014f, B:21:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r12v3 java.lang.Object) = (r12v2 java.lang.Object), (r12v2 java.lang.Object), (r12v4 java.lang.Object) binds: [B:45:0x0190, B:37:0x014f, B:21:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r21v3 int) = (r21v2 int), (r21v2 int), (r21v4 int) binds: [B:45:0x0190, B:37:0x014f, B:21:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x034f A[PHI: r16 r17 r18 r24 r28
      0x034f: PHI (r16v5 int) = (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:81:0x034d, B:77:0x032d, B:11:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x034f: PHI (r17v5 int) = (r17v2 int), (r17v3 int), (r17v2 int) binds: [B:81:0x034d, B:77:0x032d, B:11:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x034f: PHI (r18v5 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:81:0x034d, B:77:0x032d, B:11:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x034f: PHI (r24v5 short) = (r24v3 short), (r24v2 short), (r24v2 short) binds: [B:81:0x034d, B:77:0x032d, B:11:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x034f: PHI (r28v39 java.util.ArrayList) = (r28v3 java.util.ArrayList), (r28v4 java.util.ArrayList), (r28v40 java.util.ArrayList) binds: [B:81:0x034d, B:77:0x032d, B:11:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
    
        if (p067l.ViewOnClickListenerC0939.f81888 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0075, code lost:
    
        if (p067l.C0912.f81867 <= 0) goto L7;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m41899(ArrayList arrayList) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        ArrayList arrayList2;
        int i4;
        int i5 = C1053.f81965;
        int i6 = C1044.f81959;
        int iM559710 = C0946.m55979("۠ᩳ") ^ i6;
        int i7 = ((iM559710 ^ i5) * 31747) ^ (-22633804);
        Iterator itM56292 = null;
        ArrayList arrayListM41894 = null;
        HashSet hashSet = null;
        String strM26623 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM559710 ^ (-1960463756);
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s2 = 0;
        int i17 = -1867461469;
        InterfaceC14770 interfaceC14770M55950 = null;
        Object objM56115 = null;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i17 = i8 ^ (i7 & (((i17 ^ i5) * 11681) >> 31));
            switch (i17) {
                case -2123204078:
                case -599775802:
                    if (C0937.f81884) {
                        arrayList2 = arrayListM41894;
                        arrayList4 = new ArrayList(arrayList2);
                        i18 = 0;
                        i10 = 0;
                        iM55979 = (C0946.m55979("ܰۛ") + i6) * (-123);
                        arrayListM41894 = arrayList2;
                        i = ((iM55979 ^ i5) * 24461) ^ 122634389;
                        i2 = -1121406726;
                        i4 = iM55979 ^ i2;
                        arrayListM41894 = arrayListM41894;
                        i8 = i4;
                        i7 = i;
                    }
                    arrayListM41894 = arrayListM41894;
                    int iM559711 = (C0946.m55979("᩹ܿ") + i6) * 65;
                    i = ((iM559711 ^ i5) * (-22689)) ^ (-28339510);
                    i4 = iM559711 ^ 452457282;
                    arrayListM41894 = arrayListM41894;
                    arrayList4 = null;
                    i8 = i4;
                    i7 = i;
                    break;
                case -2063790815:
                case -1524919329:
                    arrayListM41894 = arrayListM41894;
                    if (i14 - (s2 * s) < 0) {
                        iM55979 = (C0873.m55680("ܰۜ") + i6) * (-7);
                        i = ((iM55979 ^ i5) * (-19545)) ^ (-2095882575);
                        i2 = -636160528;
                    } else {
                        iM55979 = C0946.m55979("֨ۚ") ^ i5;
                        i = ((iM55979 ^ i6) * (-24753)) ^ 1555051261;
                        i2 = -441179648;
                    }
                    i4 = iM55979 ^ i2;
                    arrayListM41894 = arrayListM41894;
                    i8 = i4;
                    i7 = i;
                    break;
                case -2063184260:
                case 665293468:
                    ViewOnClickListenerC0939.m55941();
                    iM55680 = C0946.m55979("ۨܳ") ^ i5;
                    i = ((iM55680 ^ i6) * (-645)) ^ (-1371199515);
                    i3 = 329768717;
                    i8 = iM55680 ^ i3;
                    i7 = i;
                    break;
                case -1927208375:
                case 2068177125:
                    C1194.m56393(arrayList3, ((C13039) RunnableC0897.m55785(itM56292)).f36664);
                    iM55979 = C0873.m55680("ܿ۫") ^ i6;
                    i = ((iM55979 ^ i5) * (-28935)) ^ (-1556507313);
                    i2 = 1762483419;
                    i4 = iM55979 ^ i2;
                    arrayListM41894 = arrayListM41894;
                    i8 = i4;
                    i7 = i;
                    break;
                case -1902076306:
                case -1747997163:
                    ArrayList arrayList5 = new ArrayList(C0861.m55625(arrayList));
                    itM56292 = C1046.m56292(arrayList);
                    arrayList3 = arrayList5;
                    iM55979 = C0873.m55680("ܿ۫") ^ i6;
                    i = ((iM55979 ^ i5) * (-28935)) ^ (-1556507313);
                    i2 = 1762483419;
                    i4 = iM55979 ^ i2;
                    arrayListM41894 = arrayListM41894;
                    i8 = i4;
                    i7 = i;
                    break;
                case -1725828754:
                case -1453784549:
                    C0937.m55912(RunnableC0871.m55665(interfaceC14770M55950, C0861.m55618(sArr3, i11, i12, i9), strM26623));
                    break;
                case -1716670745:
                case 489636307:
                    arrayListM41894 = m41894();
                    hashSet = new HashSet(arrayList3);
                    if (C1012.m56134() <= 0) {
                        iM55680 = (C0946.m55979("֡ܳ") + i6) * 47;
                        i = ((iM55680 ^ i5) * (-26663)) ^ 1181760083;
                        i3 = -738304128;
                    } else {
                        iM55680 = C0873.m55680("۫֨") ^ i5;
                        i = ((iM55680 ^ i6) * 17349) ^ (-1613795659);
                        i3 = -400764685;
                    }
                    i8 = iM55680 ^ i3;
                    i7 = i;
                    break;
                case -1620521324:
                case 974160817:
                    i9 = 26161;
                    iM55979 = C0946.m55979("ۗܺ") ^ i5;
                    i = ((iM55979 ^ i6) * (-2535)) ^ 344919552;
                    i2 = -1550623618;
                    i4 = iM55979 ^ i2;
                    arrayListM41894 = arrayListM41894;
                    i8 = i4;
                    i7 = i;
                    break;
                case -1536883655:
                case -773276390:
                    i9 = 829;
                    iM55979 = C0946.m55979("ۗܺ") ^ i5;
                    i = ((iM55979 ^ i6) * (-2535)) ^ 344919552;
                    i2 = -1550623618;
                    i4 = iM55979 ^ i2;
                    arrayListM41894 = arrayListM41894;
                    i8 = i4;
                    i7 = i;
                    break;
                case -1128659109:
                case -91141674:
                    i18++;
                    i10 = i15;
                    arrayList2 = arrayListM41894;
                    iM55979 = (C0946.m55979("ܰۛ") + i6) * (-123);
                    arrayListM41894 = arrayList2;
                    i = ((iM55979 ^ i5) * 24461) ^ 122634389;
                    i2 = -1121406726;
                    i4 = iM55979 ^ i2;
                    arrayListM41894 = arrayListM41894;
                    i8 = i4;
                    i7 = i;
                    break;
                case -956783371:
                case 458801947:
                    if (i18 < C1012.m56137(arrayList4)) {
                        iM55680 = C0873.m55680("ۡܿ") ^ i6;
                        i = ((iM55680 ^ i5) * (-25179)) ^ (-1773942050);
                        i3 = -379786978;
                    } else {
                        iM55680 = C0873.m55680("۠᩶") ^ i5;
                        i = ((iM55680 ^ i6) * 24995) ^ (-1219092341);
                        i3 = 1406305592;
                    }
                    i8 = iM55680 ^ i3;
                    i7 = i;
                    break;
                case -911989934:
                case 670772078:
                    C1003.m56123();
                    break;
                case -721974304:
                case 1627858104:
                    if (C1229.m56400(hashSet, C0992.m56115(arrayList4, i18))) {
                        iM55680 = C0873.m55680("᩸۟") ^ i5;
                        i = ((iM55680 ^ i6) * (-23)) ^ 1637165961;
                        i3 = 50766833;
                    } else {
                        i15 = i10;
                        iM55680 = C0873.m55680("ۘۙ") ^ i5;
                        i = ((iM55680 ^ i6) * 26645) ^ (-418065336);
                        i3 = -1998129806;
                    }
                    i8 = iM55680 ^ i3;
                    i7 = i;
                    break;
                case -674245471:
                case 2077521378:
                    strM26623 = C11567.m26623(arrayList4, C1229.m56403(sArr2, i19, 1, i9));
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0946.m55979("ܳۡ") + i6) * 65;
                        i = ((iM55680 ^ i5) * 10547) ^ (-1129747893);
                        i3 = 1760273567;
                    } else {
                        iM55680 = C0946.m55979("ܶ۟") ^ i5;
                        i = ((iM55680 ^ i6) * 14317) ^ (-2097411980);
                        i3 = 1133743610;
                    }
                    i8 = iM55680 ^ i3;
                    i7 = i;
                    break;
                case -618136106:
                case 464209995:
                    C0927.m55873();
                    if (C0949.f81897 >= 0) {
                        arrayListM41894 = arrayListM41894;
                        iM55979 = (C0873.m55680("᩹᩺") + i5) * (-111);
                        i = ((iM55979 ^ i6) * (-8897)) ^ (-986626749);
                        i2 = -1487313541;
                        i4 = iM55979 ^ i2;
                        arrayListM41894 = arrayListM41894;
                        i8 = i4;
                        i7 = i;
                    }
                    iM55680 = C0946.m55979("ۨܳ") ^ i5;
                    i = ((iM55680 ^ i6) * (-645)) ^ (-1371199515);
                    i3 = 329768717;
                    i8 = iM55680 ^ i3;
                    i7 = i;
                    break;
                case -514413937:
                case 541857884:
                    arrayListM41894 = arrayListM41894;
                    if (C0866.m55647(itM56292)) {
                        iM55979 = (i6 - C0873.m55680("۠ۤ")) * 37;
                        i = ((iM55979 ^ i5) * (-5395)) ^ (-1402401488);
                        i2 = 942204397;
                    } else {
                        iM55979 = C0946.m55979("۫ۢ") ^ i5;
                        i = ((iM55979 ^ i6) * 29295) ^ (-1892540835);
                        i2 = 695449004;
                    }
                    i4 = iM55979 ^ i2;
                    arrayListM41894 = arrayListM41894;
                    i8 = i4;
                    i7 = i;
                    break;
                case -510990025:
                case -482664549:
                    i19 = 530;
                    if (C0992.f81922 < 0) {
                        iM55680 = C0946.m55979("ۢۜ") ^ i6;
                        i = ((iM55680 ^ i5) * 12445) ^ 1738968737;
                        i3 = -208685056;
                        i8 = iM55680 ^ i3;
                        i7 = i;
                    }
                    arrayListM41894 = arrayListM41894;
                    int iM559712 = (C0946.m55979("᩹ܿ") + i6) * 65;
                    i = ((iM559712 ^ i5) * (-22689)) ^ (-28339510);
                    i4 = iM559712 ^ 452457282;
                    arrayListM41894 = arrayListM41894;
                    arrayList4 = null;
                    i8 = i4;
                    i7 = i;
                    break;
                case -305939166:
                case 1204882398:
                    break;
                case -38562654:
                case 58608703:
                    arrayListM41894 = arrayListM41894;
                    sArr = f82272;
                    c = 529;
                    if (C0992.f81922 >= 0) {
                        int iM559713 = (C0946.m55979("᩹ܿ") + i6) * 65;
                        i = ((iM559713 ^ i5) * (-22689)) ^ (-28339510);
                        i4 = iM559713 ^ 452457282;
                        arrayListM41894 = arrayListM41894;
                        arrayList4 = null;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩸") ^ i5;
                        i = ((iM55979 ^ i6) * (-3351)) ^ (-1390783643);
                        i2 = 870005176;
                        i4 = iM55979 ^ i2;
                        arrayListM41894 = arrayListM41894;
                    }
                    i8 = i4;
                    i7 = i;
                    break;
                case 126353292:
                case 533279013:
                    arrayListM41894 = arrayListM41894;
                    s2 = sArr[c];
                    i13 = s2 * s2;
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("᩹᩺") + i5) * (-111);
                        i = ((iM55979 ^ i6) * (-8897)) ^ (-986626749);
                        i2 = -1487313541;
                    } else {
                        iM55979 = (C0873.m55680("ۤ᩹") ^ i6) * 77;
                        i = ((iM55979 ^ i5) * (-22565)) ^ 251999052;
                        i2 = 207557473;
                    }
                    i4 = iM55979 ^ i2;
                    arrayListM41894 = arrayListM41894;
                    i8 = i4;
                    i7 = i;
                    break;
                case 268302792:
                case 1409395935:
                    arrayListM41894 = arrayListM41894;
                    i14 = i13 + 4782969;
                    s = 4374;
                    if (C0917.f81868) {
                        iM55979 = (C0873.m55680("᩹᩺") + i5) * (-111);
                        i = ((iM55979 ^ i6) * (-8897)) ^ (-986626749);
                        i2 = -1487313541;
                    } else {
                        iM55979 = C0873.m55680("ۚ᩷") ^ i6;
                        i = ((iM55979 ^ i5) * 22651) ^ 679854433;
                        i2 = 759196890;
                    }
                    i4 = iM55979 ^ i2;
                    arrayListM41894 = arrayListM41894;
                    i8 = i4;
                    i7 = i;
                    break;
                case 824752234:
                case 2010071739:
                    sArr3 = f82272;
                    i11 = 531;
                    i12 = 10;
                    if (C0989.f81920 < 0) {
                        iM55680 = (i6 - C0873.m55680("ۗۨ")) * (-53);
                        i = ((iM55680 ^ i5) * 22749) ^ 690964516;
                        i3 = 1812701238;
                        i8 = iM55680 ^ i3;
                        i7 = i;
                    }
                    arrayListM41894 = arrayListM41894;
                    int iM559714 = (C0946.m55979("᩹ܿ") + i6) * 65;
                    i = ((iM559714 ^ i5) * (-22689)) ^ (-28339510);
                    i4 = iM559714 ^ 452457282;
                    arrayListM41894 = arrayListM41894;
                    arrayList4 = null;
                    i8 = i4;
                    i7 = i;
                    break;
                case 928625086:
                case 1299134296:
                    i16 = i10 + 1;
                    objM56115 = C0992.m56115(arrayList3, i10);
                    if (C1048.f81963) {
                        iM55680 = C0946.m55979("۫ܿ") ^ i6;
                        i = ((iM55680 ^ i5) * (-12199)) ^ (-330452638);
                        i3 = -916279047;
                    } else {
                        iM55680 = (C0946.m55979("ܳۡ") + i6) * 65;
                        i = ((iM55680 ^ i5) * 10547) ^ (-1129747893);
                        i3 = 1760273567;
                    }
                    i8 = iM55680 ^ i3;
                    i7 = i;
                    break;
                case 1094286485:
                case 1320499539:
                    arrayList4.set(i18, (String) objM56115);
                    i15 = i16;
                    iM55680 = C0873.m55680("ۘۙ") ^ i5;
                    i = ((iM55680 ^ i6) * 26645) ^ (-418065336);
                    i3 = -1998129806;
                    i8 = iM55680 ^ i3;
                    i7 = i;
                    break;
                case 1631824127:
                case 1737376646:
                    interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649);
                    sArr2 = f82272;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0946.m55979("ܳۡ") + i6) * 65;
                        i = ((iM55680 ^ i5) * 10547) ^ (-1129747893);
                        i3 = 1760273567;
                    } else {
                        iM55680 = C0946.m55979("ᩳۡ") ^ i5;
                        i = ((iM55680 ^ i6) * 24319) ^ (-1033827986);
                        i3 = -707396911;
                    }
                    i8 = iM55680 ^ i3;
                    i7 = i;
                    break;
                default:
                    C0898.m55800();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:130:0x0686 A[PHI: r7 r9 r12 r13 r16 r17 r18 r21 r23 r25 r29 r30 r31
      0x0686: PHI (r7v85 short[]) = (r7v6 short[]), (r7v7 short[]), (r7v86 short[]) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r9v79 java.util.List) = (r9v26 java.util.List), (r9v27 java.util.List), (r9v80 java.util.List) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r12v6 java.lang.String) = (r12v2 java.lang.String), (r12v2 java.lang.String), (r12v7 java.lang.String) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r13v6 l.۫ۤۡ) = (r13v2 l.۫ۤۡ), (r13v2 l.۫ۤۡ), (r13v7 l.۫ۤۡ) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r16v6 short) = (r16v3 short), (r16v2 short), (r16v2 short) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r17v6 int) = (r17v2 int), (r17v3 int), (r17v2 int) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r18v6 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r21v37 l.᩵ܶ᩷) = (r21v3 l.᩵ܶ᩷), (r21v4 l.᩵ܶ᩷), (r21v38 l.᩵ܶ᩷) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r23v36 java.lang.String) = (r23v3 java.lang.String), (r23v4 java.lang.String), (r23v37 java.lang.String) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r25v34 java.lang.String) = (r25v3 java.lang.String), (r25v4 java.lang.String), (r25v35 java.lang.String) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r29v64 short[]) = (r29v19 short[]), (r29v20 short[]), (r29v65 short[]) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r30v47 java.lang.String) = (r30v4 java.lang.String), (r30v5 java.lang.String), (r30v48 java.lang.String) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0686: PHI (r31v17 java.util.ArrayList) = (r31v1 java.util.ArrayList), (r31v2 java.util.ArrayList), (r2v2 java.util.ArrayList) binds: [B:129:0x0684, B:125:0x0653, B:22:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۡ */
    public void m41895() {
        int iM55680;
        int i;
        int i2;
        InterfaceC4321 interfaceC4321;
        int iM55979;
        int i3;
        int i4;
        List list;
        String str;
        int iM559710;
        int i5;
        int i6;
        int iM559711;
        int i7;
        int i8;
        C20953 c20953;
        short[] sArr;
        short[] sArr2;
        List list2;
        String str2;
        String str3;
        String strM56235;
        int iM559712;
        int i9;
        int i10;
        int i11;
        short[] sArr3;
        String str4;
        String str5;
        int i12;
        int i13;
        int iM559713;
        int i14;
        String str6;
        int iM559714;
        int i15;
        int i16;
        int i17;
        short[] sArr4;
        int i18 = C0873.f81841;
        int i19 = ViewOnClickListenerC0939.f81888;
        int iM559715 = C0946.m55979("۫֫") ^ i18;
        int i20 = ((iM559715 ^ i19) * 27577) ^ (-1791385076);
        String strM47268 = null;
        List listAsList = null;
        String strM55863 = null;
        InterfaceC4321 interfaceC4322 = null;
        short[] sArr5 = null;
        int i21 = iM559715 ^ 1970552333;
        int i22 = 0;
        int i23 = 0;
        short s = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        short s2 = 0;
        int i27 = 0;
        int i28 = -1372483460;
        String str7 = null;
        short[] sArr6 = null;
        String str8 = null;
        InterfaceC14100 interfaceC14100 = null;
        String str9 = null;
        String strM47269 = null;
        C20953 c20953M47267 = null;
        String strM56161 = null;
        Main main = null;
        Iterator itM56292 = null;
        ArrayList arrayList = null;
        while (true) {
            i28 = i21 ^ (i20 & (((i28 ^ i19) * 22103) >> 31));
            switch (i28) {
                case -2136185879:
                case 1384314567:
                    c20953 = c20953M47267;
                    sArr = sArr5;
                    sArr2 = sArr6;
                    list2 = listAsList;
                    str2 = strM55863;
                    str3 = str9;
                    strM56235 = C1028.m56235(f82272, 479, 7, i22);
                    if (C1044.f81959 >= 0) {
                        iM559712 = C0946.m55979("ܺۚ") ^ i18;
                        i9 = ((iM559712 ^ i19) * (-22619)) ^ 591631716;
                        i10 = 511779038;
                    } else {
                        iM559712 = C0946.m55979("᩸۟") ^ i18;
                        i9 = ((iM559712 ^ i19) * (-7561)) ^ (-878969234);
                        i10 = 936597807;
                    }
                    int i29 = iM559712 ^ i10;
                    listAsList = list2;
                    C20953 c20954 = c20953;
                    str8 = strM56235;
                    i20 = i9;
                    str9 = str3;
                    strM55863 = str2;
                    sArr6 = sArr2;
                    sArr5 = sArr;
                    i21 = i29;
                    c20953M47267 = c20954;
                    break;
                case -2120518011:
                case 261019851:
                    list = listAsList;
                    f54942 = list.contains(AbstractC0942.m55964());
                    str = strM55863;
                    iM559710 = (C0946.m55979("ܺۘ") ^ i18) * 115;
                    i5 = ((iM559710 ^ i19) * (-17857)) ^ 1827209905;
                    i6 = -1884066453;
                    i11 = iM559710 ^ i6;
                    str9 = str9;
                    strM55863 = str;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i11;
                    i20 = i5;
                    c20953M47267 = c20953M47267;
                    str8 = str8;
                    listAsList = list;
                    break;
                case -2112185362:
                case 801377643:
                    arrayList = arrayList;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    listAsList = listAsList;
                    strM55863 = strM55863;
                    str9 = str9;
                    str8 = str8;
                    c20953M47267 = c20953M47267;
                    s = f82272[478];
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("ܳۢ") ^ i19;
                        i3 = ((iM55979 ^ i18) * (-5435)) ^ 2020843357;
                        i4 = -1739164090;
                    } else {
                        iM55979 = (C0946.m55979("ۢۨ") + i19) * 91;
                        i3 = ((iM55979 ^ i18) * (-4389)) ^ 242531869;
                        i4 = -280026995;
                    }
                    i8 = iM55979 ^ i4;
                    c20953M47267 = c20953M47267;
                    str8 = str8;
                    str9 = str9;
                    listAsList = listAsList;
                    strM55863 = strM55863;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i8;
                    i20 = i3;
                    arrayList = arrayList;
                    break;
                case -2089699834:
                case 2101431398:
                    C0882.m55710();
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("ۖ᩶") ^ i18;
                        i = ((iM55680 ^ i19) * 29727) ^ (-345714112);
                        i2 = -1765967615;
                        i21 = iM55680 ^ i2;
                        i20 = i;
                    } else {
                        sArr = sArr5;
                        strM56235 = str8;
                        sArr2 = sArr6;
                        list2 = listAsList;
                        str2 = strM55863;
                        c20953 = c20953M47267;
                        str3 = str9;
                        iM559712 = C0946.m55979("ܺۚ") ^ i18;
                        i9 = ((iM559712 ^ i19) * (-22619)) ^ 591631716;
                        i10 = 511779038;
                        int i210 = iM559712 ^ i10;
                        listAsList = list2;
                        C20953 c20955 = c20953;
                        str8 = strM56235;
                        i20 = i9;
                        str9 = str3;
                        strM55863 = str2;
                        sArr6 = sArr2;
                        sArr5 = sArr;
                        i21 = i210;
                        c20953M47267 = c20955;
                    }
                    break;
                case -2062335453:
                case 895922542:
                    C0937.m55917(arrayList, new C21146(this, main, interfaceC4322));
                    iM559713 = C0873.m55680("ᩴ֫") ^ i19;
                    i12 = ((iM559713 ^ i18) * 15443) ^ 1234259564;
                    i14 = -926388115;
                    i13 = iM559713 ^ i14;
                    sArr4 = sArr5;
                    i21 = i13;
                    i20 = i12;
                    sArr5 = sArr4;
                    break;
                case -2010481808:
                case 1226933926:
                    i22 = 42079;
                    iM55979 = (i18 - C0946.m55979("ۜܿ")) * 79;
                    i3 = ((iM55979 ^ i19) * (-4633)) ^ 82584603;
                    i4 = -1165558654;
                    i8 = iM55979 ^ i4;
                    c20953M47267 = c20953M47267;
                    str8 = str8;
                    str9 = str9;
                    listAsList = listAsList;
                    strM55863 = strM55863;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i8;
                    i20 = i3;
                    arrayList = arrayList;
                    break;
                case -1916462232:
                case -871532505:
                    RunnableC0897.m55784();
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("۫ۡ") ^ i19;
                        i = ((iM55680 ^ i18) * (-31079)) ^ 1987689148;
                        i2 = -1381643775;
                        i21 = iM55680 ^ i2;
                        i20 = i;
                    } else {
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        listAsList = listAsList;
                        strM55863 = strM55863;
                        str9 = str9;
                        str8 = str8;
                        c20953M47267 = c20953M47267;
                        iM55979 = C0873.m55680("ܳۢ") ^ i19;
                        i3 = ((iM55979 ^ i18) * (-5435)) ^ 2020843357;
                        i4 = -1739164090;
                        i8 = iM55979 ^ i4;
                        c20953M47267 = c20953M47267;
                        str8 = str8;
                        str9 = str9;
                        listAsList = listAsList;
                        strM55863 = strM55863;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i21 = i8;
                        i20 = i3;
                        arrayList = arrayList;
                    }
                    break;
                case -1857186625:
                case 1943660326:
                    sArr5 = sArr5;
                    short[] sArr7 = sArr6;
                    List list3 = listAsList;
                    String str10 = strM55863;
                    String str11 = str8;
                    c20953M47267 = C20953.m47267();
                    str9 = "";
                    if (C0894.m55772()) {
                        iM559711 = (C0873.m55680("ۜ֡") + i18) * (-111);
                        i3 = ((iM559711 ^ i19) * (-3611)) ^ 1639642130;
                        i7 = -26514820;
                    } else {
                        iM559711 = C0946.m55979("ۡۜ") ^ i19;
                        i3 = ((iM559711 ^ i18) * (-7799)) ^ 1330256360;
                        i7 = 676894068;
                    }
                    i8 = iM559711 ^ i7;
                    strM55863 = str10;
                    str8 = str11;
                    sArr6 = sArr7;
                    listAsList = list3;
                    sArr5 = sArr5;
                    i21 = i8;
                    i20 = i3;
                    arrayList = arrayList;
                    break;
                case -1751048319:
                case -1719407764:
                    i22 = 15124;
                    iM55979 = (i18 - C0946.m55979("ۜܿ")) * 79;
                    i3 = ((iM55979 ^ i19) * (-4633)) ^ 82584603;
                    i4 = -1165558654;
                    i8 = iM55979 ^ i4;
                    c20953M47267 = c20953M47267;
                    str8 = str8;
                    str9 = str9;
                    listAsList = listAsList;
                    strM55863 = strM55863;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i8;
                    i20 = i3;
                    arrayList = arrayList;
                    break;
                case -1733985938:
                case -1692146774:
                    interfaceC4321 = this.f54948;
                    interfaceC4322 = interfaceC4321;
                    iM55680 = (C0946.m55979("᩵ܿ") ^ i18) * (-5);
                    i = ((iM55680 ^ i19) * (-7073)) ^ (-1002635458);
                    i2 = -432237988;
                    i21 = iM55680 ^ i2;
                    i20 = i;
                    break;
                case -1662456339:
                case 1187134899:
                    sArr5 = sArr5;
                    if (C0930.m55886(itM56292)) {
                        iM559713 = (i18 - C0946.m55979("ۙ᩻")) * (-79);
                        i12 = ((iM559713 ^ i19) * 26499) ^ (-1601688989);
                        i14 = 56894809;
                    } else {
                        iM559713 = C0946.m55979("ܶۡ") ^ i19;
                        i12 = ((iM559713 ^ i18) * (-16863)) ^ 423478262;
                        i14 = 603317939;
                    }
                    i13 = iM559713 ^ i14;
                    sArr4 = sArr5;
                    i21 = i13;
                    i20 = i12;
                    sArr5 = sArr4;
                    break;
                case -1601963197:
                case 2010555631:
                    ViewOnClickListenerC0939.m55946(this.f40549);
                    break;
                case -1491435620:
                case -250781912:
                    sArr5 = sArr5;
                    if (!C0906.m55806(strM47269, C0890.m55734(interfaceC14100, RunnableC0938.m55936(f82272, 508, 16, i22), str9))) {
                        iM559713 = (C0946.m55979("ܰۧ") + i18) * (-39);
                        i12 = ((iM559713 ^ i19) * (-3851)) ^ (-1378314621);
                        i14 = 160621247;
                        i13 = iM559713 ^ i14;
                        sArr4 = sArr5;
                        i21 = i13;
                        i20 = i12;
                        sArr5 = sArr4;
                    }
                    str6 = strM55863;
                    iM559714 = (i18 - C0873.m55680("۟ᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i15 = ((iM559714 ^ i19) * (-2941)) ^ (-440210205);
                    i16 = -445910141;
                    i17 = iM559714 ^ i16;
                    strM55863 = str6;
                    i20 = i15;
                    sArr4 = sArr5;
                    i21 = i17;
                    sArr5 = sArr4;
                    break;
                case -1438922477:
                case -448649533:
                    C1017.m56187();
                    if (!C0955.f81898) {
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        listAsList = listAsList;
                        strM55863 = strM55863;
                        str9 = str9;
                        str8 = str8;
                        c20953M47267 = c20953M47267;
                        iM55979 = (C0873.m55680("ۖܿ") + i18) * 91;
                        i3 = ((iM55979 ^ i19) * 12847) ^ 1379677566;
                        i4 = 1081325843;
                        i8 = iM55979 ^ i4;
                        c20953M47267 = c20953M47267;
                        str8 = str8;
                        str9 = str9;
                        listAsList = listAsList;
                        strM55863 = strM55863;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i21 = i8;
                        i20 = i3;
                        arrayList = arrayList;
                    } else {
                        iM55680 = C0873.m55680("۫ۡ") ^ i19;
                        i = ((iM55680 ^ i18) * (-31079)) ^ 1987689148;
                        i2 = -1381643775;
                        i21 = iM55680 ^ i2;
                        i20 = i;
                    }
                    break;
                case -1402128678:
                case 590640762:
                    C1404.m56468();
                    break;
                case -1233160749:
                case 1356159609:
                    C1053.m56327();
                    if (!C0955.m56025()) {
                        sArr5 = sArr5;
                        iM559713 = C0873.m55680("ۙۙ") ^ i19;
                        i12 = ((iM559713 ^ i18) * 19103) ^ (-98049121);
                        i14 = -31934972;
                        i13 = iM559713 ^ i14;
                        sArr4 = sArr5;
                        i21 = i13;
                        i20 = i12;
                        sArr5 = sArr4;
                    } else {
                        sArr = sArr5;
                        strM56235 = str8;
                        sArr2 = sArr6;
                        list2 = listAsList;
                        str2 = strM55863;
                        c20953 = c20953M47267;
                        str3 = str9;
                        iM559712 = C0946.m55979("ܺۚ") ^ i18;
                        i9 = ((iM559712 ^ i19) * (-22619)) ^ 591631716;
                        i10 = 511779038;
                        int i211 = iM559712 ^ i10;
                        listAsList = list2;
                        C20953 c20956 = c20953;
                        str8 = strM56235;
                        i20 = i9;
                        str9 = str3;
                        strM55863 = str2;
                        sArr6 = sArr2;
                        sArr5 = sArr;
                        i21 = i211;
                        c20953M47267 = c20956;
                    }
                    break;
                case -1222369395:
                case 1692449349:
                    itM56292 = C1046.m56292(m41906().f26909);
                    iM559713 = C0873.m55680("ᩴ֫") ^ i19;
                    i12 = ((iM559713 ^ i18) * 15443) ^ 1234259564;
                    i14 = -926388115;
                    i13 = iM559713 ^ i14;
                    sArr4 = sArr5;
                    i21 = i13;
                    i20 = i12;
                    sArr5 = sArr4;
                    break;
                case -864734082:
                case 851248853:
                    if (C0894.f81854 >= 0) {
                        sArr = sArr5;
                        strM56235 = str8;
                        sArr2 = sArr6;
                        list2 = listAsList;
                        str2 = strM55863;
                        c20953 = c20953M47267;
                        str3 = str9;
                        iM559712 = C0946.m55979("ܺۚ") ^ i18;
                        i9 = ((iM559712 ^ i19) * (-22619)) ^ 591631716;
                        i10 = 511779038;
                        int i212 = iM559712 ^ i10;
                        listAsList = list2;
                        C20953 c20957 = c20953;
                        str8 = strM56235;
                        i20 = i9;
                        str9 = str3;
                        strM55863 = str2;
                        sArr6 = sArr2;
                        sArr5 = sArr;
                        i21 = i212;
                        c20953M47267 = c20957;
                    } else {
                        sArr5 = sArr5;
                        str5 = strM47268;
                        sArr3 = sArr6;
                        str4 = strM55863;
                        int iM559716 = (i18 - C0946.m55979("ۚܳ")) * (-87);
                        strM47268 = str5;
                        i20 = ((iM559716 ^ i19) * 6283) ^ (-980685386);
                        i17 = iM559716 ^ 220014159;
                        strM55863 = str4;
                        sArr6 = sArr3;
                        sArr4 = sArr5;
                        i21 = i17;
                        sArr5 = sArr4;
                    }
                    break;
                case -859984224:
                case 678004653:
                    arrayList = arrayList;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    listAsList = listAsList;
                    strM55863 = strM55863;
                    str9 = str9;
                    str8 = str8;
                    c20953M47267 = c20953M47267;
                    int i30 = s + s2;
                    if ((i30 * i30) - i26 > 0) {
                        iM55979 = C0873.m55680("ۧۧ") ^ i19;
                        i3 = ((iM55979 ^ i18) * (-28225)) ^ 544066553;
                        i4 = 486735473;
                    } else {
                        iM55979 = (i19 - C0946.m55979("ܰ֡")) * (-45);
                        i3 = ((iM55979 ^ i18) * 6611) ^ 147736177;
                        i4 = -1572514381;
                    }
                    i8 = iM55979 ^ i4;
                    c20953M47267 = c20953M47267;
                    str8 = str8;
                    str9 = str9;
                    listAsList = listAsList;
                    strM55863 = strM55863;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i8;
                    i20 = i3;
                    arrayList = arrayList;
                    break;
                case -843683301:
                case 741870888:
                    if (ViewOnClickListenerC0939.m55949(C0949.m56016(sArr5, i23, 2, i22), str7)) {
                        iM55680 = (C0946.m55979("ۛ۫") ^ i19) * 57;
                        i = ((iM55680 ^ i18) * 23007) ^ (-915561069);
                        i2 = 549762405;
                    } else {
                        iM55680 = C0946.m55979("ۘ᩺") ^ i19;
                        i = ((iM55680 ^ i18) * 22905) ^ (-824776234);
                        i2 = -2093131751;
                    }
                    i21 = iM55680 ^ i2;
                    i20 = i;
                    break;
                case -685895028:
                case 564609249:
                    interfaceC4321 = (InterfaceC4321) f54943.get(str7);
                    interfaceC4322 = interfaceC4321;
                    iM55680 = (C0946.m55979("᩵ܿ") ^ i18) * (-5);
                    i = ((iM55680 ^ i19) * (-7073)) ^ (-1002635458);
                    i2 = -432237988;
                    i21 = iM55680 ^ i2;
                    i20 = i;
                    break;
                case -560478966:
                case 2088496472:
                    list = listAsList;
                    str = strM55863;
                    f54942 = false;
                    iM559710 = (C0946.m55979("ܺۘ") ^ i18) * 115;
                    i5 = ((iM559710 ^ i19) * (-17857)) ^ 1827209905;
                    i6 = -1884066453;
                    i11 = iM559710 ^ i6;
                    str9 = str9;
                    strM55863 = str;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i11;
                    i20 = i5;
                    c20953M47267 = c20953M47267;
                    str8 = str8;
                    listAsList = list;
                    break;
                case -405931377:
                case 1429956406:
                    sArr5 = sArr5;
                    sArr3 = sArr6;
                    str4 = strM55863;
                    str5 = strM47268;
                    listAsList = Arrays.asList(C0906.m55811(str5, C0955.m56029(sArr3, i27, 1, i22)));
                    if (C0894.m55769() < 0) {
                        strM47268 = str5;
                        int iM559717 = C0946.m55979("ۚܶ") ^ i19;
                        i12 = ((iM559717 ^ i18) * (-11079)) ^ (-1515237109);
                        i13 = iM559717 ^ (-709359314);
                        strM55863 = str4;
                        sArr6 = sArr3;
                        sArr4 = sArr5;
                        i21 = i13;
                        i20 = i12;
                        sArr5 = sArr4;
                    }
                    int iM559718 = (i18 - C0946.m55979("ۚܳ")) * (-87);
                    strM47268 = str5;
                    i20 = ((iM559718 ^ i19) * 6283) ^ (-980685386);
                    i17 = iM559718 ^ 220014159;
                    strM55863 = str4;
                    sArr6 = sArr3;
                    sArr4 = sArr5;
                    i21 = i17;
                    sArr5 = sArr4;
                    break;
                case -284065625:
                case 13365789:
                    str7 = (String) RunnableC0897.m55785(itM56292);
                    sArr5 = f82272;
                    i23 = 524;
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0873.m55680("ۖ᩶") ^ i18;
                        i = ((iM55680 ^ i19) * 29727) ^ (-345714112);
                        i2 = -1765967615;
                    } else {
                        iM55680 = (C0946.m55979("ܰ֫") ^ i19) * 27;
                        i = ((iM55680 ^ i18) * (-15429)) ^ (-1773104123);
                        i2 = 302096927;
                    }
                    i21 = iM55680 ^ i2;
                    i20 = i;
                    break;
                case -279368045:
                case -108612768:
                    if (C1025.f81947 >= 0) {
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        listAsList = listAsList;
                        strM55863 = strM55863;
                        str9 = str9;
                        str8 = str8;
                        c20953M47267 = c20953M47267;
                        iM55979 = C0873.m55680("ܳۢ") ^ i19;
                        i3 = ((iM55979 ^ i18) * (-5435)) ^ 2020843357;
                        i4 = -1739164090;
                        i8 = iM55979 ^ i4;
                        c20953M47267 = c20953M47267;
                        str8 = str8;
                        str9 = str9;
                        listAsList = listAsList;
                        strM55863 = strM55863;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i21 = i8;
                        i20 = i3;
                        arrayList = arrayList;
                    } else {
                        sArr5 = sArr5;
                        str5 = strM47268;
                        sArr3 = sArr6;
                        str4 = strM55863;
                        int iM559719 = (i18 - C0946.m55979("ۚܳ")) * (-87);
                        strM47268 = str5;
                        i20 = ((iM559719 ^ i19) * 6283) ^ (-980685386);
                        i17 = iM559719 ^ 220014159;
                        strM55863 = str4;
                        sArr6 = sArr3;
                        sArr4 = sArr5;
                        i21 = i17;
                        sArr5 = sArr4;
                    }
                    break;
                case -276454208:
                case 900021986:
                    sArr5 = sArr5;
                    str6 = strM55863;
                    f54944 = c20953M47267.m47269(str6);
                    if (C5383.m11773()) {
                        iM559714 = C0946.m55979("ۛ᩵") ^ i18;
                        i15 = ((iM559714 ^ i19) * (-24587)) ^ (-262823750);
                        i16 = -1510555863;
                    } else {
                        iM559714 = (i18 - C0873.m55680("۟ᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i15 = ((iM559714 ^ i19) * (-2941)) ^ (-440210205);
                        i16 = -445910141;
                    }
                    i17 = iM559714 ^ i16;
                    strM55863 = str6;
                    i20 = i15;
                    sArr4 = sArr5;
                    i21 = i17;
                    sArr5 = sArr4;
                    break;
                case -209423120:
                case 1854437651:
                    arrayList = arrayList;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    listAsList = listAsList;
                    strM55863 = strM55863;
                    str9 = str9;
                    str8 = str8;
                    c20953M47267 = c20953M47267;
                    int i31 = i24 + i25;
                    i26 = i31 + i31;
                    s2 = 12638;
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("ۖܿ") + i18) * 91;
                        i3 = ((iM55979 ^ i19) * 12847) ^ 1379677566;
                        i4 = 1081325843;
                    } else {
                        iM55979 = C0873.m55680("ۢ֨") ^ i18;
                        i3 = ((iM55979 ^ i19) * (-32295)) ^ (-1027718446);
                        i4 = 1926869997;
                    }
                    i8 = iM55979 ^ i4;
                    c20953M47267 = c20953M47267;
                    str8 = str8;
                    str9 = str9;
                    listAsList = listAsList;
                    strM55863 = strM55863;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i8;
                    i20 = i3;
                    arrayList = arrayList;
                    break;
                case -12140907:
                case 243326248:
                    sArr5 = sArr5;
                    if (c20953M47267.m47269(C0937.m55921(f82272, 495, 2, i22))) {
                        iM559713 = C0873.m55680("֡۫") ^ i18;
                        i12 = ((iM559713 ^ i19) * (-29189)) ^ (-2084328981);
                        i14 = 1168608803;
                        i13 = iM559713 ^ i14;
                        sArr4 = sArr5;
                        i21 = i13;
                        i20 = i12;
                        sArr5 = sArr4;
                    }
                    str6 = strM55863;
                    iM559714 = (i18 - C0873.m55680("۟ᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i15 = ((iM559714 ^ i19) * (-2941)) ^ (-440210205);
                    i16 = -445910141;
                    i17 = iM559714 ^ i16;
                    strM55863 = str6;
                    i20 = i15;
                    sArr4 = sArr5;
                    i21 = i17;
                    sArr5 = sArr4;
                    break;
                case 129404130:
                case 1412538604:
                    arrayList = arrayList;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    listAsList = listAsList;
                    strM55863 = strM55863;
                    str9 = str9;
                    str8 = str8;
                    c20953M47267 = c20953M47267;
                    i24 = s * s;
                    i25 = 159719044;
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("ܳۢ") ^ i19;
                        i3 = ((iM55979 ^ i18) * (-5435)) ^ 2020843357;
                        i4 = -1739164090;
                    } else {
                        iM55979 = (C0946.m55979("᩵ۛ") ^ i18) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i3 = ((iM55979 ^ i19) * (-19637)) ^ 347124670;
                        i4 = -1602391248;
                    }
                    i8 = iM55979 ^ i4;
                    c20953M47267 = c20953M47267;
                    str8 = str8;
                    str9 = str9;
                    listAsList = listAsList;
                    strM55863 = strM55863;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i8;
                    i20 = i3;
                    arrayList = arrayList;
                    break;
                case 485005163:
                case 996116441:
                    sArr5 = sArr5;
                    strM47269 = c20953M47267.m47268(strM56161, str9);
                    interfaceC14100 = ApplicationC21448.f67649;
                    if (!C0892.f81851) {
                        sArr6 = sArr6;
                        listAsList = listAsList;
                        strM55863 = strM55863;
                        str9 = str9;
                        str8 = str8;
                        c20953M47267 = c20953M47267;
                        iM55979 = C0873.m55680("ܳۢ") ^ i19;
                        i3 = ((iM55979 ^ i18) * (-5435)) ^ 2020843357;
                        i4 = -1739164090;
                        i8 = iM55979 ^ i4;
                        c20953M47267 = c20953M47267;
                        str8 = str8;
                        str9 = str9;
                        listAsList = listAsList;
                        strM55863 = strM55863;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i21 = i8;
                        i20 = i3;
                        arrayList = arrayList;
                    } else {
                        iM559713 = (C0873.m55680("ۢ۟") ^ i18) * 73;
                        i12 = ((iM559713 ^ i19) * 31143) ^ (-760512056);
                        i14 = 2066010511;
                        i13 = iM559713 ^ i14;
                        sArr4 = sArr5;
                        i21 = i13;
                        i20 = i12;
                        sArr5 = sArr4;
                    }
                    break;
                case 521655311:
                case 1394638493:
                    sArr5 = sArr5;
                    strM56161 = ServiceConnectionC1013.m56161(f82272, 497, 11, i22);
                    if (C1964.f83032 <= 0) {
                        iM559713 = C0873.m55680("ۙۙ") ^ i19;
                        i12 = ((iM559713 ^ i18) * 19103) ^ (-98049121);
                        i14 = -31934972;
                    } else {
                        iM559713 = (C0873.m55680("᩶ܽ") + i19) * (-51);
                        i12 = ((iM559713 ^ i18) * (-21989)) ^ (-1642360686);
                        i14 = 119466751;
                    }
                    i13 = iM559713 ^ i14;
                    sArr4 = sArr5;
                    i21 = i13;
                    i20 = i12;
                    sArr5 = sArr4;
                    break;
                case 662335434:
                case 1534633315:
                    C1194.m56393(arrayList, new C21146(this, main, new C10416(c20953M47267)));
                    sArr5 = sArr5;
                    str6 = strM55863;
                    iM559714 = (i18 - C0873.m55680("۟ᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i15 = ((iM559714 ^ i19) * (-2941)) ^ (-440210205);
                    i16 = -445910141;
                    i17 = iM559714 ^ i16;
                    strM55863 = str6;
                    i20 = i15;
                    sArr4 = sArr5;
                    i21 = i17;
                    sArr5 = sArr4;
                    break;
                case 759467347:
                case 1649001477:
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    list = listAsList;
                    str = strM55863;
                    str9 = str9;
                    str8 = str8;
                    c20953M47267 = c20953M47267;
                    C0937.m55917(arrayList, new C21146(this, main, new C15779(this)));
                    iM559710 = C0873.m55680("ܳۤ") ^ i18;
                    i5 = ((iM559710 ^ i19) * (-29463)) ^ (-1152565255);
                    i6 = -872571416;
                    i11 = iM559710 ^ i6;
                    str9 = str9;
                    strM55863 = str;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i11;
                    i20 = i5;
                    c20953M47267 = c20953M47267;
                    str8 = str8;
                    listAsList = list;
                    break;
                case 849814051:
                case 1141906131:
                    sArr5 = sArr5;
                    strM55863 = C0927.m55863(f82272, 487, 8, i22);
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM559713 = (C0946.m55979("ۙܰ") + i19) * 91;
                        i12 = ((iM559713 ^ i18) * (-1903)) ^ 1964822398;
                        i14 = 125617690;
                        i13 = iM559713 ^ i14;
                        sArr4 = sArr5;
                        i21 = i13;
                        i20 = i12;
                        sArr5 = sArr4;
                    } else {
                        sArr6 = sArr6;
                        listAsList = listAsList;
                        strM55863 = strM55863;
                        str9 = str9;
                        str8 = str8;
                        c20953M47267 = c20953M47267;
                        iM55979 = (C0873.m55680("ۖܿ") + i18) * 91;
                        i3 = ((iM55979 ^ i19) * 12847) ^ 1379677566;
                        i4 = 1081325843;
                        i8 = iM55979 ^ i4;
                        c20953M47267 = c20953M47267;
                        str8 = str8;
                        str9 = str9;
                        listAsList = listAsList;
                        strM55863 = strM55863;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i21 = i8;
                        i20 = i3;
                        arrayList = arrayList;
                    }
                    break;
                case 1144072568:
                case 1789249897:
                    RunnableC0871.m55672();
                    sArr5 = sArr5;
                    str5 = strM47268;
                    sArr3 = sArr6;
                    str4 = strM55863;
                    int iM5597110 = (i18 - C0946.m55979("ۚܳ")) * (-87);
                    strM47268 = str5;
                    i20 = ((iM5597110 ^ i19) * 6283) ^ (-980685386);
                    i17 = iM5597110 ^ 220014159;
                    strM55863 = str4;
                    sArr6 = sArr3;
                    sArr4 = sArr5;
                    i21 = i17;
                    sArr5 = sArr4;
                    break;
                case 1188235023:
                case 2072687042:
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    list = listAsList;
                    str = strM55863;
                    str9 = str9;
                    str8 = str8;
                    c20953M47267 = c20953M47267;
                    arrayList = this.f40548;
                    RunnableC0938.m55934(arrayList);
                    boolean zM55713 = C0882.m55713();
                    main = this.f37526;
                    if (zM55713) {
                        iM559710 = C0873.m55680("ܳۤ") ^ i18;
                        i5 = ((iM559710 ^ i19) * (-29463)) ^ (-1152565255);
                        i6 = -872571416;
                    } else {
                        iM559710 = (i19 - C0946.m55979("᩵᩺")) * (-91);
                        i5 = ((iM559710 ^ i18) * (-25789)) ^ (-2103315646);
                        i6 = 902109257;
                    }
                    i11 = iM559710 ^ i6;
                    str9 = str9;
                    strM55863 = str;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i21 = i11;
                    i20 = i5;
                    c20953M47267 = c20953M47267;
                    str8 = str8;
                    listAsList = list;
                    break;
                case 1835044110:
                case 2130376026:
                    sArr5 = sArr5;
                    String str12 = str8;
                    list = listAsList;
                    str = strM55863;
                    strM47268 = c20953M47267.m47268(str12, str9);
                    sArr6 = f82272;
                    i27 = 486;
                    if (C1046.m56302() != 0) {
                        int iM559720 = C0946.m55979("ܺ۫") ^ i18;
                        str8 = str12;
                        i20 = ((iM559720 ^ i19) * 15749) ^ 632982570;
                        strM55863 = str;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i21 = iM559720 ^ (-321946524);
                    } else {
                        str8 = str12;
                        int iM559721 = (i19 - C0946.m55979("ۡ᩸")) * 83;
                        c20953M47267 = c20953M47267;
                        i5 = ((iM559721 ^ i18) * (-5393)) ^ (-122669213);
                        i11 = iM559721 ^ 310108854;
                        strM55863 = str;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i21 = i11;
                        i20 = i5;
                        c20953M47267 = c20953M47267;
                    }
                    str8 = str8;
                    listAsList = list;
                    break;
                default:
                    if (interfaceC4322 == null) {
                        iM559713 = C0873.m55680("ᩴ֫") ^ i19;
                        i12 = ((iM559713 ^ i18) * 15443) ^ 1234259564;
                        i14 = -926388115;
                        i13 = iM559713 ^ i14;
                        sArr4 = sArr5;
                        i21 = i13;
                        i20 = i12;
                        sArr5 = sArr4;
                    } else {
                        iM55680 = C0873.m55680("ܶ֨") ^ i19;
                        i = ((iM55680 ^ i18) * 17721) ^ (-1129568090);
                        i2 = -785382618;
                        i21 = iM55680 ^ i2;
                        i20 = i;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m41886(String str, boolean z) {
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5;
        int iM55681;
        int i6;
        int iM55682;
        int i7;
        int iM55979;
        int i8;
        int iM559710;
        int i9;
        int i10;
        int i11;
        short[] sArr;
        int i12;
        int i13;
        int i14;
        int iM559711;
        int i15;
        int i16;
        int iM559712;
        int i17;
        int i18;
        int i19;
        HashSet hashSet;
        boolean zRemove;
        int i20;
        int i21;
        short[] sArr2;
        int iM55683;
        int i22;
        int i23;
        InterfaceC14770 interfaceC14770;
        int i24;
        C21146 c21146;
        short[] sArr3;
        int i25;
        ArrayList arrayList;
        int i26;
        int i27;
        ArrayList arrayList2;
        String str2;
        int i28;
        int i29;
        int i30;
        int i31;
        HashSet hashSet2;
        String str3;
        int i32;
        short[] sArr4;
        int i33;
        String strM56584;
        int iM55684;
        String str4;
        int i34;
        ArrayList arrayList3;
        String str5;
        int i35;
        C21146 c21147;
        int i36;
        ArrayList arrayList4;
        int iM56137;
        int i37;
        C21146 c21148;
        int i38;
        ArrayList arrayList5;
        int i39;
        String str6;
        int i40;
        int i41;
        int i42;
        int iM55685;
        int i43;
        int i44;
        C21146 c21149;
        int i45;
        int i46;
        C21146 c211410;
        int i47;
        C18402 c18402 = this;
        Iterator itM56292 = null;
        int i48 = 0;
        Iterator itM56090 = null;
        int iM55586 = 0;
        int i49 = 0;
        Iterator itM56293 = null;
        int i50 = 0;
        short[] sArr5 = null;
        short s = 0;
        int i51 = 0;
        int i52 = 0;
        short s2 = 0;
        int i53 = 1874482155;
        int i54 = C0866.f81837;
        int i55 = C1229.f82066;
        int iM559713 = C0946.m55979("ܺᩳ") ^ i54;
        int i56 = ((iM559713 ^ i55) * (-28161)) ^ 1302814774;
        int i57 = iM559713 ^ 1939208582;
        ArrayList arrayList6 = null;
        InterfaceC14770 interfaceC14771 = null;
        String strM26623 = null;
        ArrayList arrayList7 = null;
        Main main = null;
        C21146 c211411 = null;
        ArrayList arrayList8 = null;
        String str7 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i58 = 0;
        ArrayList arrayList9 = null;
        int iM56138 = 0;
        int i59 = 0;
        int iM12179 = 0;
        boolean z2 = false;
        int i60 = 0;
        int iM56139 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        String str8 = null;
        ArrayList arrayList10 = null;
        int i66 = 0;
        HashSet hashSet3 = null;
        C5522 c5522 = null;
        int i67 = 0;
        while (true) {
            i53 = i57 ^ (i56 & (((i53 ^ i55) * 10411) >> 31));
            switch (i53) {
                case -2129521552:
                case -734759263:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    if (iM56139 != 0) {
                        iM55680 = (i55 - C0873.m55680("ᩳۡ")) * 57;
                        i3 = ((iM55680 ^ i54) * 22645) ^ 127969425;
                        i4 = 409633676;
                        i57 = iM55680 ^ i4;
                        iM56139 = iM56139;
                        str7 = str7;
                        i66 = i66;
                        i49 = i49;
                        i61 = i61;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211411;
                        i48 = i48;
                        i56 = i3;
                    } else {
                        iM56139 = iM56139;
                        iM55681 = (i54 - C0873.m55680("ۖۘ")) * 67;
                        i5 = ((iM55681 ^ i55) * 13321) ^ 152094767;
                        i6 = 203592547;
                        i57 = iM55681 ^ i6;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                        c211410 = c211411;
                        i48 = i48;
                        i56 = i5;
                        i66 = i66;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211410;
                    }
                    break;
                case -2115460305:
                case -184249916:
                    arrayList9.set(i61, c211411);
                    break;
                case -2103250138:
                case -1340119348:
                    i48 = i48;
                    String str9 = str8;
                    interfaceC14771 = interfaceC14771;
                    i61 = i61;
                    c211411 = c211411;
                    arrayList9 = arrayList9;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i = i62;
                    i58 = i58;
                    HashSet hashSet4 = hashSet3;
                    strM26623 = C11567.m26623(hashSet4, str9);
                    sArr7 = f82272;
                    i64 = 391;
                    i65 = 12;
                    if (C0894.f81854 < 0) {
                        int iM559714 = (i55 - C0946.m55979("֡᩵")) * (-65);
                        i57 = iM559714 ^ (-323865388);
                        hashSet3 = hashSet4;
                        str8 = str9;
                        i62 = i;
                        i56 = ((iM559714 ^ i54) * (-30707)) ^ 562737296;
                        arrayList9 = arrayList9;
                        i58 = i58;
                        i66 = i66;
                        interfaceC14771 = interfaceC14771;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        c211411 = c211411;
                        i48 = i48;
                    } else {
                        hashSet3 = hashSet4;
                        i67 = i67;
                        strM26623 = strM26623;
                        str8 = str9;
                        int iM55686 = C0873.m55680("ۤۢ") ^ i55;
                        int i68 = ((iM55686 ^ i54) * 8935) ^ (-1581532806);
                        i11 = iM55686 ^ (-583486022);
                        i56 = i68;
                        i62 = i;
                        i67 = i67;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i58 = i58;
                        i66 = i66;
                        interfaceC14771 = interfaceC14771;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        hashSet3 = hashSet3;
                        i57 = i11;
                        c211411 = c211411;
                        i48 = i48;
                        c18402 = this;
                    }
                    break;
                case -2100624347:
                case 325589623:
                    int i69 = i49;
                    str6 = str7;
                    i42 = iM56138 + i58;
                    i40 = i61;
                    i41 = i69;
                    i37 = i48;
                    c21148 = c211411;
                    i38 = i59;
                    arrayList5 = arrayList10;
                    iM55685 = (C0946.m55979("۟ۢ") ^ i55) * (-115);
                    i39 = i42;
                    i43 = ((iM55685 ^ i54) * 969) ^ 233651594;
                    i44 = 1746981332;
                    i57 = iM55685 ^ i44;
                    C21146 c211412 = c21148;
                    i48 = i37;
                    i56 = i43;
                    i66 = i39;
                    arrayList10 = arrayList5;
                    i59 = i38;
                    c211411 = c211412;
                    int i70 = i41;
                    i61 = i40;
                    str7 = str6;
                    i49 = i70;
                    break;
                case -2096402586:
                case 481738931:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    if (RunnableC0938.m55937(arrayList7, C0992.m56115(arrayList6, i48))) {
                        iM55681 = C0946.m55979("ۧۖ") ^ i54;
                        i5 = ((iM55681 ^ i55) * (-29999)) ^ 1421877873;
                        i6 = -2051619856;
                    } else {
                        iM55681 = C0873.m55680("᩸ᩳ") ^ i55;
                        i5 = ((iM55681 ^ i54) * (-20993)) ^ (-1838084209);
                        i6 = -979582337;
                    }
                    i57 = iM55681 ^ i6;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    c211410 = c211411;
                    i48 = i48;
                    i56 = i5;
                    i66 = i66;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211410;
                    break;
                case -2083096041:
                case -1803173067:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC14771 = interfaceC14771;
                    strM26623 = strM26623;
                    i61 = i61;
                    c211411 = c211411;
                    sArr6 = sArr6;
                    sArr = sArr7;
                    i65 = i65;
                    i59 = i59;
                    str8 = str8;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i12 = i67;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i13 = i62;
                    i14 = i63;
                    i58 = i58;
                    C9745 c9745M41906 = m41906();
                    arrayList9 = c18402.f40548;
                    iM56138 = C1012.m56137(arrayList9);
                    arrayList6 = c9745M41906.f26909;
                    if (C0967.f81910 < 0) {
                        int iM55687 = C0873.m55680("ܽᩴ") ^ i54;
                        int i71 = ((iM55687 ^ i55) * (-14179)) ^ 958140675;
                        i11 = iM55687 ^ (-326596693);
                        i56 = i71;
                        i63 = i14;
                        i62 = i13;
                        sArr7 = sArr;
                        i67 = i12;
                        str8 = str8;
                        i58 = i58;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr6;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        hashSet3 = hashSet3;
                        i57 = i11;
                        c211411 = c211411;
                        i48 = i48;
                        c18402 = this;
                    } else {
                        int iM559715 = C0946.m55979("᩹۬") ^ i54;
                        int i72 = ((iM559715 ^ i55) * (-31519)) ^ (-1013590972);
                        i19 = iM559715 ^ (-1410263857);
                        i56 = i72;
                        i63 = i14;
                        i62 = i13;
                        sArr7 = sArr;
                        i67 = i12;
                        str8 = str8;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr6;
                        c18402 = this;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        i57 = i19;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    }
                    break;
                case -2054596739:
                case 752285558:
                    i48 = i48;
                    i49 = i49;
                    c211411 = c211411;
                    str7 = str7;
                    i59 = i59;
                    iM56139 = iM56139;
                    arrayList10 = arrayList10;
                    i66 = i66;
                    if (iM56138 != i58) {
                        i61 = 0;
                        iM55680 = (C0946.m55979("ۙ᩸") + i55) * (-21);
                        i3 = ((iM55680 ^ i54) * 25769) ^ 399914521;
                        i4 = 526366639;
                        i57 = iM55680 ^ i4;
                        iM56139 = iM56139;
                        str7 = str7;
                        i66 = i66;
                        i49 = i49;
                        i61 = i61;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211411;
                        i48 = i48;
                        i56 = i3;
                    } else {
                        int iM559716 = C0946.m55979("۟ܳ") ^ i55;
                        i5 = ((iM559716 ^ i54) * 32189) ^ (-1145140885);
                        i57 = iM559716 ^ 1842064461;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = 0;
                        c211410 = c211411;
                        i48 = i48;
                        i56 = i5;
                        i66 = i66;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211410;
                    }
                    break;
                case -2048167219:
                case -389722400:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    if (i48 >= 0) {
                        iM55681 = (C0946.m55979("ܺ᩶") + i55) * 57;
                        i5 = ((iM55681 ^ i54) * (-27951)) ^ (-868718787);
                        i6 = -2107280680;
                    } else {
                        iM55681 = C0946.m55979("ۡ۠") ^ i54;
                        i5 = ((iM55681 ^ i55) * (-6403)) ^ (-1949711434);
                        i6 = 1010521248;
                    }
                    i57 = iM55681 ^ i6;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    c211410 = c211411;
                    i48 = i48;
                    i56 = i5;
                    i66 = i66;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211410;
                    break;
                case -2021205160:
                case -1663285392:
                    i48 = i48;
                    c211411 = c211411;
                    i59 = i59;
                    arrayList10 = arrayList10;
                    i66 = i66;
                    int i73 = i49;
                    str7 = str7;
                    int i74 = i61;
                    i49 = i73;
                    i61 = i74;
                    i60 = iM56139 + i58;
                    iM55681 = (C0873.m55680("ۢۡ") ^ i54) * (-17);
                    i5 = ((iM55681 ^ i55) * 9433) ^ 774652073;
                    i6 = -1023664122;
                    i57 = iM55681 ^ i6;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    c211410 = c211411;
                    i48 = i48;
                    i56 = i5;
                    i66 = i66;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211410;
                    break;
                case -1875318437:
                case 139048087:
                    C0863.m55643();
                    if (RunnableC1014.f81941 > 0) {
                        iM55979 = (i55 - C0946.m55979("ۘۘ")) * 13;
                        i3 = ((iM55979 ^ i54) * 22737) ^ 2064415390;
                        i8 = 1563959368;
                        i57 = iM55979 ^ i8;
                        i56 = i3;
                    } else {
                        hashSet3 = hashSet3;
                        i48 = i48;
                        interfaceC14771 = interfaceC14771;
                        strM26623 = strM26623;
                        i61 = i61;
                        c211411 = c211411;
                        sArr6 = sArr6;
                        sArr7 = sArr7;
                        i65 = i65;
                        arrayList9 = arrayList9;
                        i59 = i59;
                        str8 = str8;
                        i49 = i49;
                        arrayList10 = arrayList10;
                        i67 = i67;
                        str7 = str7;
                        i66 = i66;
                        iM56139 = iM56139;
                        i = i62;
                        i2 = i63;
                        i58 = i58;
                        iM559710 = C0946.m55979("۬ܽ") ^ i54;
                        i9 = ((iM559710 ^ i55) * 2513) ^ (-427909314);
                        i10 = -691881675;
                        i11 = iM559710 ^ i10;
                        i56 = i9;
                        i63 = i2;
                        i62 = i;
                        sArr7 = sArr7;
                        i67 = i67;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i58 = i58;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr6;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        hashSet3 = hashSet3;
                        i57 = i11;
                        c211411 = c211411;
                        i48 = i48;
                        c18402 = this;
                    }
                    break;
                case -1786722162:
                case 1593457017:
                    i48 = i48;
                    interfaceC14771 = interfaceC14771;
                    strM26623 = strM26623;
                    i61 = i61;
                    c211411 = c211411;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    i59 = i59;
                    str8 = str8;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i67 = i67;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i62 = i62;
                    i63 = i63;
                    i58 = i58;
                    HashSet hashSet5 = f54941;
                    if (!z) {
                        hashSet3 = hashSet5;
                        iM559711 = C0873.m55680("ۨۨ") ^ i54;
                        i15 = ((iM559711 ^ i55) * (-15163)) ^ (-1526349678);
                        i16 = -2121848737;
                        i19 = iM559711 ^ i16;
                        i56 = i15;
                        i63 = i63;
                        i62 = i62;
                        sArr7 = sArr7;
                        i67 = i67;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr6;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        i57 = i19;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    } else {
                        iM559712 = (i55 - C0946.m55979("᩸᩺")) * 29;
                        hashSet3 = hashSet5;
                        i17 = ((iM559712 ^ i54) * 26123) ^ (-1623604020);
                        i18 = -2076850059;
                        i56 = i17;
                        i63 = i63;
                        i62 = i62;
                        sArr7 = sArr7;
                        i67 = i67;
                        str8 = str8;
                        i58 = i58;
                        i66 = i66;
                        i65 = i65;
                        sArr6 = sArr6;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        hashSet3 = hashSet3;
                        i57 = iM559712 ^ i18;
                        c211411 = c211411;
                        arrayList9 = arrayList9;
                        i48 = i48;
                        interfaceC14771 = interfaceC14771;
                    }
                    break;
                case -1780431323:
                case -771872997:
                    int i75 = i48;
                    c21149 = c211411;
                    i45 = i59;
                    ArrayList arrayList11 = arrayList10;
                    int i76 = i49;
                    str7 = str7;
                    i46 = i61;
                    i49 = i76;
                    if (C0930.m55886(itM56090)) {
                        int iM55688 = (C0873.m55680("ܺ᩵") + i54) * (-21);
                        int i77 = i66;
                        int i78 = ((iM55688 ^ i55) * (-6711)) ^ (-195508301);
                        i57 = iM55688 ^ 1523332687;
                        i48 = i75;
                        i56 = i78;
                        i66 = i77;
                        arrayList10 = arrayList11;
                        i59 = i45;
                        c211411 = c21149;
                    } else {
                        int i79 = i66;
                        int iM55689 = (C0873.m55680("۠ۙ") ^ i54) * 85;
                        int i80 = ((iM55689 ^ i55) * (-30027)) ^ (-105825599);
                        i57 = iM55689 ^ (-485027639);
                        i66 = i79;
                        arrayList10 = arrayList11;
                        i59 = i45;
                        c211411 = c21149;
                        i48 = i75;
                        i56 = i80;
                    }
                    int i81 = i49;
                    i61 = i46;
                    str7 = str7;
                    i49 = i81;
                    break;
                case -1757517190:
                case 447753295:
                    int iM55587 = C0845.m55586((Integer) C0955.m56035(itM56293));
                    str7 = (String) C0992.m56115(arrayList7, iM55587);
                    i59 = i67 + iM55587;
                    if (C0949.f81897 >= 0) {
                        i50 = iM55587;
                        iM55979 = (i55 - C0946.m55979("ۘۘ")) * 13;
                        i3 = ((iM55979 ^ i54) * 22737) ^ 2064415390;
                        i8 = 1563959368;
                        i57 = iM55979 ^ i8;
                        i56 = i3;
                    } else {
                        int iM556810 = C0873.m55680("ۘ֨") ^ i54;
                        i50 = iM55587;
                        i56 = ((iM556810 ^ i55) * (-20829)) ^ 523744058;
                        i57 = iM556810 ^ 1020525772;
                    }
                    break;
                case -1739691547:
                case -600066754:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    if (iM56139 == i58) {
                        iM55680 = (C0873.m55680("ܺܳ") + i54) * 61;
                        i3 = ((iM55680 ^ i55) * (-5289)) ^ (-770952980);
                        i4 = 66570114;
                    } else {
                        iM55680 = (C0946.m55979("ۙ᩸") + i55) * (-21);
                        i3 = ((iM55680 ^ i54) * 25769) ^ 399914521;
                        i4 = 526366639;
                    }
                    i57 = iM55680 ^ i4;
                    iM56139 = iM56139;
                    str7 = str7;
                    i66 = i66;
                    i49 = i49;
                    i61 = i61;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211411;
                    i48 = i48;
                    i56 = i3;
                    break;
                case -1682720642:
                case 1274480135:
                    i62 = 59155;
                    int iM556811 = C0873.m55680("᩺ۡ") ^ i55;
                    int i82 = ((iM556811 ^ i54) * 13415) ^ (-284051849);
                    i11 = iM556811 ^ 841319671;
                    i56 = i82;
                    i63 = i63;
                    sArr7 = sArr7;
                    i67 = i67;
                    arrayList9 = arrayList9;
                    str8 = str8;
                    i58 = i58;
                    i66 = i66;
                    i65 = i65;
                    interfaceC14771 = interfaceC14771;
                    sArr6 = sArr6;
                    iM56139 = iM56139;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    str7 = str7;
                    i49 = i49;
                    i59 = i59;
                    i61 = i61;
                    hashSet3 = hashSet3;
                    i57 = i11;
                    c211411 = c211411;
                    i48 = i48;
                    c18402 = this;
                    break;
                case -1647269652:
                case 1407054900:
                    i47 = i49;
                    if (C0866.m55647(itM56293)) {
                        int iM556812 = C0873.m55680("᩸۠") ^ i55;
                        i57 = iM556812 ^ (-1421618592);
                        i49 = i47;
                        i56 = ((iM556812 ^ i54) * (-12879)) ^ (-2125609895);
                        str7 = str7;
                    } else {
                        i48 = i48;
                        i61 = i61;
                        c211411 = c211411;
                        i49 = i47;
                        i59 = i59;
                        arrayList10 = arrayList10;
                        i66 = i66;
                        i20 = i67;
                        i21 = i63;
                        iM55683 = (C0946.m55979("۫۟") ^ i54) * 63;
                        sArr2 = sArr6;
                        i22 = ((iM55683 ^ i55) * (-21641)) ^ 488251117;
                        i23 = -1469071740;
                        i57 = iM55683 ^ i23;
                        i56 = i22;
                        i63 = i21;
                        i62 = i62;
                        sArr7 = sArr7;
                        i67 = i20;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr2;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    }
                    break;
                case -1546408540:
                case 2146733934:
                    hashSet = hashSet3;
                    zRemove = ServiceConnectionC1013.m56151(hashSet, str);
                    z2 = zRemove;
                    iM559712 = (i54 - C0946.m55979("ۚ۠")) * (-11);
                    hashSet3 = hashSet;
                    i17 = ((iM559712 ^ i55) * (-15479)) ^ 23192141;
                    i18 = 781733392;
                    i56 = i17;
                    i63 = i63;
                    i62 = i62;
                    sArr7 = sArr7;
                    i67 = i67;
                    str8 = str8;
                    i58 = i58;
                    i66 = i66;
                    i65 = i65;
                    sArr6 = sArr6;
                    iM56139 = iM56139;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    str7 = str7;
                    i49 = i49;
                    i59 = i59;
                    i61 = i61;
                    hashSet3 = hashSet3;
                    i57 = iM559712 ^ i18;
                    c211411 = c211411;
                    arrayList9 = arrayList9;
                    i48 = i48;
                    interfaceC14771 = interfaceC14771;
                    break;
                case -1524042724:
                case 2098513509:
                    C1194.m56393(arrayList9, new C21146(c18402, main, c18402.m41897((String) RunnableC0897.m55785(itM56292))));
                    iM55680 = (i55 - C0946.m55979("ܿ᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i3 = ((iM55680 ^ i54) * (-31669)) ^ 1004983523;
                    i4 = 1713085058;
                    i57 = iM55680 ^ i4;
                    iM56139 = iM56139;
                    str7 = str7;
                    i66 = i66;
                    i49 = i49;
                    i61 = i61;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211411;
                    i48 = i48;
                    i56 = i3;
                    break;
                case -1433329227:
                case 255192709:
                    int i83 = i49;
                    c21149 = c211411;
                    str7 = str7;
                    i46 = i61;
                    C1194.m56393(arrayList9, c21149);
                    i49 = i83;
                    c5522.notifyItemInserted(iM12179 + 2);
                    if (C1036.f81953 < 0) {
                        int iM559717 = C0946.m55979("ۡ᩸") ^ i54;
                        i45 = i59;
                        i57 = iM559717 ^ (-1193510244);
                        i56 = ((iM559717 ^ i55) * (-6815)) ^ (-803569);
                        i59 = i45;
                        c211411 = c21149;
                        int i84 = i49;
                        i61 = i46;
                        str7 = str7;
                        i49 = i84;
                    } else {
                        i61 = i46;
                        c211411 = c21149;
                        arrayList3 = arrayList9;
                        str5 = strM26623;
                        int iM559718 = (i55 - C0946.m55979("۬᩶")) * (-35);
                        InterfaceC14770 interfaceC14772 = interfaceC14771;
                        int i85 = ((iM559718 ^ i54) * 17399) ^ (-918637358);
                        i57 = iM559718 ^ (-1971623494);
                        strM26623 = str5;
                        i62 = i62;
                        sArr7 = sArr7;
                        i64 = i64;
                        arrayList9 = arrayList3;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14772;
                        arrayList7 = arrayList7;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        i56 = i85;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    }
                    break;
                case -1418002061:
                case 298854171:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC14771 = interfaceC14771;
                    strM26623 = strM26623;
                    i61 = i61;
                    c211411 = c211411;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    i59 = i59;
                    str8 = str8;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i67 = i67;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i = i62;
                    i2 = i63;
                    i58 = i58;
                    int i86 = s + s2;
                    if ((i86 * i86) - i52 > 0) {
                        iM559710 = (i54 - C0873.m55680("ۨ᩵")) * 21;
                        i9 = ((iM559710 ^ i55) * 27203) ^ 979534371;
                        i10 = 712967614;
                    } else {
                        iM559710 = C0873.m55680("ۨ᩹") ^ i55;
                        i9 = ((iM559710 ^ i54) * (-5169)) ^ (-1778778558);
                        i10 = -100191279;
                    }
                    i11 = iM559710 ^ i10;
                    i56 = i9;
                    i63 = i2;
                    i62 = i;
                    sArr7 = sArr7;
                    i67 = i67;
                    arrayList9 = arrayList9;
                    str8 = str8;
                    i58 = i58;
                    i66 = i66;
                    i65 = i65;
                    interfaceC14771 = interfaceC14771;
                    sArr6 = sArr6;
                    iM56139 = iM56139;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    str7 = str7;
                    i49 = i49;
                    i59 = i59;
                    i61 = i61;
                    hashSet3 = hashSet3;
                    i57 = i11;
                    c211411 = c211411;
                    i48 = i48;
                    c18402 = this;
                    break;
                case -1412541838:
                case 912520593:
                    i48 = i48;
                    interfaceC14770 = interfaceC14771;
                    i24 = i61;
                    c21146 = c211411;
                    sArr3 = sArr7;
                    i25 = i65;
                    arrayList = arrayList9;
                    i26 = i59;
                    i27 = i49;
                    arrayList2 = arrayList10;
                    str2 = str7;
                    i28 = i66;
                    i29 = iM56139;
                    i30 = i62;
                    i31 = i58;
                    hashSet2 = hashSet3;
                    str3 = strM26623;
                    i32 = i67;
                    sArr4 = sArr6;
                    i33 = i63;
                    strM56584 = C1964.m56584(sArr4, i33, 1, i30);
                    if (C1003.f81929 <= 0) {
                        iM55684 = (i55 - C0946.m55979("ۜۜ")) * (-127);
                        str4 = strM56584;
                        i56 = ((iM55684 ^ i54) * 32573) ^ 410298797;
                        i34 = -1591066297;
                    } else {
                        iM55684 = (C0873.m55680("ۙۡ") ^ i55) * (-111);
                        str4 = strM56584;
                        i56 = ((iM55684 ^ i54) * (-16919)) ^ 1372705494;
                        i34 = 1514159865;
                    }
                    i57 = iM55684 ^ i34;
                    sArr6 = sArr4;
                    i63 = i33;
                    i62 = i30;
                    sArr7 = sArr3;
                    strM26623 = str3;
                    i67 = i32;
                    arrayList9 = arrayList;
                    i66 = i28;
                    i65 = i25;
                    interfaceC14771 = interfaceC14770;
                    str8 = str4;
                    hashSet3 = hashSet2;
                    arrayList10 = arrayList2;
                    i58 = i31;
                    i59 = i26;
                    iM56139 = i29;
                    c211411 = c21146;
                    str7 = str2;
                    i49 = i27;
                    i61 = i24;
                    i48 = i48;
                    break;
                case -1397336580:
                case 1491424521:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC14771 = interfaceC14771;
                    strM26623 = strM26623;
                    i61 = i61;
                    c211411 = c211411;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    i59 = i59;
                    str8 = str8;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i67 = i67;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i = i62;
                    i2 = i63;
                    i58 = i58;
                    sArr5 = f82272;
                    if (RunnableC0897.f81856) {
                        iM559710 = (i55 - C0873.m55680("ۘۤ")) * (-45);
                        i9 = ((iM559710 ^ i54) * (-24193)) ^ (-373669742);
                        i10 = -265648465;
                    } else {
                        iM559710 = C0946.m55979("۫ᩴ") ^ i55;
                        i9 = ((iM559710 ^ i54) * 9849) ^ 478107507;
                        i10 = 1455146701;
                    }
                    i11 = iM559710 ^ i10;
                    i56 = i9;
                    i63 = i2;
                    i62 = i;
                    sArr7 = sArr7;
                    i67 = i67;
                    arrayList9 = arrayList9;
                    str8 = str8;
                    i58 = i58;
                    i66 = i66;
                    i65 = i65;
                    interfaceC14771 = interfaceC14771;
                    sArr6 = sArr6;
                    iM56139 = iM56139;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    str7 = str7;
                    i49 = i49;
                    i59 = i59;
                    i61 = i61;
                    hashSet3 = hashSet3;
                    i57 = i11;
                    c211411 = c211411;
                    i48 = i48;
                    c18402 = this;
                    break;
                case -1360113601:
                case 1314573068:
                    i49++;
                    iM55682 = (i55 - C0946.m55979("ܽ᩹")) * (-27);
                    i3 = ((iM55682 ^ i54) * (-1113)) ^ 1156860769;
                    i7 = 1176263438;
                    i57 = iM55682 ^ i7;
                    str7 = str7;
                    i49 = i49;
                    i56 = i3;
                    break;
                case -1343912274:
                case -1153023277:
                    C0937.m55917(arrayList8, C1003.m56129(i49));
                    i49 = i49;
                    str7 = str7;
                    iM55682 = C0873.m55680("۟ۨ") ^ i54;
                    i3 = ((iM55682 ^ i55) * 18353) ^ (-645291602);
                    i7 = 1909317077;
                    i57 = iM55682 ^ i7;
                    str7 = str7;
                    i49 = i49;
                    i56 = i3;
                    break;
                case -1304908453:
                case 866855807:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC14771 = interfaceC14771;
                    strM26623 = strM26623;
                    i61 = i61;
                    c211411 = c211411;
                    sArr6 = sArr6;
                    i63 = i63;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    i59 = i59;
                    str8 = str8;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i62 = i62;
                    i58 = i58;
                    int iM55625 = iM56138 - C0861.m55625(arrayList6);
                    c5522 = c18402.f40549;
                    if (iM56138 != 0) {
                        i67 = iM55625;
                        iM559711 = C0946.m55979("᩻ܿ") ^ i55;
                        i15 = ((iM559711 ^ i54) * 2693) ^ (-2032438474);
                        i16 = -539198282;
                        i19 = iM559711 ^ i16;
                        i56 = i15;
                        i63 = i63;
                        i62 = i62;
                        sArr7 = sArr7;
                        i67 = i67;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr6;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        i57 = i19;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    } else {
                        iM559712 = C0946.m55979("ۖ֨") ^ i55;
                        i67 = iM55625;
                        i17 = ((iM559712 ^ i54) * 18635) ^ (-491029571);
                        i18 = 1893309954;
                        i56 = i17;
                        i63 = i63;
                        i62 = i62;
                        sArr7 = sArr7;
                        i67 = i67;
                        str8 = str8;
                        i58 = i58;
                        i66 = i66;
                        i65 = i65;
                        sArr6 = sArr6;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        hashSet3 = hashSet3;
                        i57 = iM559712 ^ i18;
                        c211411 = c211411;
                        arrayList9 = arrayList9;
                        i48 = i48;
                        interfaceC14771 = interfaceC14771;
                    }
                    break;
                case -1248878134:
                case 847986342:
                    int i87 = i59;
                    i48 = i48;
                    ArrayList arrayList12 = arrayList10;
                    int i88 = i66;
                    int i89 = i49;
                    String str10 = str7;
                    int i90 = i61;
                    C21146 c211413 = new C21146(c18402, main, c18402.m41897((String) C1017.m56196(arrayList7, i90)));
                    if (c18402.f40545) {
                        int iM556813 = (i55 - C0873.m55680("۟֡")) * (-21);
                        i57 = iM556813 ^ 1751396082;
                        i56 = ((iM556813 ^ i54) * 15839) ^ 1544453180;
                    } else {
                        int iM559719 = (C0946.m55979("۟ۜ") ^ i54) * 83;
                        i57 = iM559719 ^ (-1383960770);
                        i56 = ((iM559719 ^ i55) * (-31321)) ^ 159456160;
                    }
                    str7 = str10;
                    i66 = i88;
                    i49 = i89;
                    i61 = i90;
                    arrayList10 = arrayList12;
                    i59 = i87;
                    c211411 = c211413;
                    break;
                case -1230917841:
                case -201445487:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    if (iM56139 != 0) {
                        i48 = i48;
                        i20 = i67;
                        i21 = i63;
                        iM55683 = (C0946.m55979("۫۟") ^ i54) * 63;
                        sArr2 = sArr6;
                        i22 = ((iM55683 ^ i55) * (-21641)) ^ 488251117;
                        i23 = -1469071740;
                        i57 = iM55683 ^ i23;
                        i56 = i22;
                        i63 = i21;
                        i62 = i62;
                        sArr7 = sArr7;
                        i67 = i20;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr2;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    } else {
                        iM55681 = (C0873.m55680("ܶۡ") + i55) * 75;
                        i5 = ((iM55681 ^ i54) * (-20491)) ^ (-1478414938);
                        i6 = 711510570;
                        i57 = iM55681 ^ i6;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                        c211410 = c211411;
                        i48 = i48;
                        i56 = i5;
                        i66 = i66;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211410;
                    }
                    break;
                case -1212918971:
                case 2030235008:
                    i47 = i49;
                    c5522.notifyItemRangeRemoved(iM12179, i66);
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i49 = i47;
                    i59 = i59;
                    arrayList10 = arrayList10;
                    i66 = i66;
                    i20 = i67;
                    i21 = i63;
                    iM55683 = (C0946.m55979("۫۟") ^ i54) * 63;
                    sArr2 = sArr6;
                    i22 = ((iM55683 ^ i55) * (-21641)) ^ 488251117;
                    i23 = -1469071740;
                    i57 = iM55683 ^ i23;
                    i56 = i22;
                    i63 = i21;
                    i62 = i62;
                    sArr7 = sArr7;
                    i67 = i20;
                    arrayList9 = arrayList9;
                    str8 = str8;
                    i66 = i66;
                    i65 = i65;
                    interfaceC14771 = interfaceC14771;
                    sArr6 = sArr2;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c211411 = c211411;
                    i58 = i58;
                    i48 = i48;
                    iM56139 = iM56139;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    break;
                case -1096552147:
                case -912363076:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    if (iM56139 <= 0) {
                        iM56139 = iM56139;
                        iM55680 = (i54 - C0873.m55680("ۡۧ")) * (-103);
                        i3 = ((iM55680 ^ i55) * (-24625)) ^ (-205943524);
                        i4 = 372383137;
                        i57 = iM55680 ^ i4;
                        iM56139 = iM56139;
                        str7 = str7;
                        i66 = i66;
                        i49 = i49;
                        i61 = i61;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211411;
                        i48 = i48;
                        i56 = i3;
                    } else {
                        iM55681 = C0873.m55680("᩵᩷") ^ i55;
                        i5 = ((iM55681 ^ i54) * 22989) ^ (-2025168680);
                        i6 = 1403916557;
                        i57 = iM55681 ^ i6;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                        c211410 = c211411;
                        i48 = i48;
                        i56 = i5;
                        i66 = i66;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211410;
                    }
                    break;
                case -1054244137:
                case 1829404376:
                    iM12179 = -1;
                    iM559711 = C0946.m55979("ۖۤ") ^ i54;
                    i15 = ((iM559711 ^ i55) * 21767) ^ (-464837327);
                    i16 = 1252213827;
                    i19 = iM559711 ^ i16;
                    i56 = i15;
                    i63 = i63;
                    i62 = i62;
                    sArr7 = sArr7;
                    i67 = i67;
                    arrayList9 = arrayList9;
                    str8 = str8;
                    i66 = i66;
                    i65 = i65;
                    interfaceC14771 = interfaceC14771;
                    sArr6 = sArr6;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    i57 = i19;
                    c211411 = c211411;
                    i58 = i58;
                    i48 = i48;
                    iM56139 = iM56139;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    break;
                case -970800841:
                case 1389681694:
                    if (!C0955.f81898) {
                        iM55979 = C0946.m55979("ܽ֫") ^ i54;
                        i3 = ((iM55979 ^ i55) * 32581) ^ 442176969;
                        i8 = 341654813;
                        i57 = iM55979 ^ i8;
                        i56 = i3;
                    } else {
                        i61 = i61;
                        c211411 = c211411;
                        i49 = i49;
                        str7 = str7;
                        arrayList3 = arrayList9;
                        str5 = strM26623;
                        int iM5597110 = (i55 - C0946.m55979("۬᩶")) * (-35);
                        InterfaceC14770 interfaceC14773 = interfaceC14771;
                        int i810 = ((iM5597110 ^ i54) * 17399) ^ (-918637358);
                        i57 = iM5597110 ^ (-1971623494);
                        strM26623 = str5;
                        i62 = i62;
                        sArr7 = sArr7;
                        i64 = i64;
                        arrayList9 = arrayList3;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14773;
                        arrayList7 = arrayList7;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        i56 = i810;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    }
                    break;
                case -938440661:
                case 1780797792:
                    arrayList9.subList(i67, C1012.m56137(arrayList9)).clear();
                    itM56292 = C1046.m56292(arrayList7);
                    iM55680 = (i55 - C0946.m55979("ܿ᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i3 = ((iM55680 ^ i54) * (-31669)) ^ 1004983523;
                    i4 = 1713085058;
                    i57 = iM55680 ^ i4;
                    iM56139 = iM56139;
                    str7 = str7;
                    i66 = i66;
                    i49 = i49;
                    i61 = i61;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211411;
                    i48 = i48;
                    i56 = i3;
                    break;
                case -880898800:
                case 386648619:
                    if (!C1024.f81946) {
                        i48 = i48;
                        strM56584 = str8;
                        interfaceC14770 = interfaceC14771;
                        i24 = i61;
                        c21146 = c211411;
                        sArr3 = sArr7;
                        i25 = i65;
                        arrayList = arrayList9;
                        i32 = i67;
                        i26 = i59;
                        i27 = i49;
                        arrayList2 = arrayList10;
                        sArr4 = sArr6;
                        i33 = i63;
                        str2 = str7;
                        i28 = i66;
                        i29 = iM56139;
                        i30 = i62;
                        i31 = i58;
                        hashSet2 = hashSet3;
                        str3 = strM26623;
                        iM55684 = (i55 - C0946.m55979("ۜۜ")) * (-127);
                        str4 = strM56584;
                        i56 = ((iM55684 ^ i54) * 32573) ^ 410298797;
                        i34 = -1591066297;
                        i57 = iM55684 ^ i34;
                        sArr6 = sArr4;
                        i63 = i33;
                        i62 = i30;
                        sArr7 = sArr3;
                        strM26623 = str3;
                        i67 = i32;
                        arrayList9 = arrayList;
                        i66 = i28;
                        i65 = i25;
                        interfaceC14771 = interfaceC14770;
                        str8 = str4;
                        hashSet3 = hashSet2;
                        arrayList10 = arrayList2;
                        i58 = i31;
                        i59 = i26;
                        iM56139 = i29;
                        c211411 = c21146;
                        str7 = str2;
                        i49 = i27;
                        i61 = i24;
                        i48 = i48;
                    } else {
                        hashSet3 = hashSet3;
                        i48 = i48;
                        interfaceC14771 = interfaceC14771;
                        strM26623 = strM26623;
                        i61 = i61;
                        c211411 = c211411;
                        sArr6 = sArr6;
                        sArr = sArr7;
                        i65 = i65;
                        i59 = i59;
                        str8 = str8;
                        i49 = i49;
                        arrayList10 = arrayList10;
                        i12 = i67;
                        str7 = str7;
                        i66 = i66;
                        iM56139 = iM56139;
                        i13 = i62;
                        i14 = i63;
                        i58 = i58;
                        int iM5597111 = C0946.m55979("᩹۬") ^ i54;
                        int i710 = ((iM5597111 ^ i55) * (-31519)) ^ (-1013590972);
                        i19 = iM5597111 ^ (-1410263857);
                        i56 = i710;
                        i63 = i14;
                        i62 = i13;
                        sArr7 = sArr;
                        i67 = i12;
                        str8 = str8;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr6;
                        c18402 = this;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        i57 = i19;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    }
                    break;
                case -772197735:
                case 416368384:
                    C0861.m55626();
                    C0845.m55584();
                    break;
                case -599710545:
                case 1825090691:
                    C0898.m55800();
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i55 - C0946.m55979("ۘۘ")) * 13;
                        i3 = ((iM55979 ^ i54) * 22737) ^ 2064415390;
                        i8 = 1563959368;
                    } else {
                        iM55979 = (i54 - C0946.m55979("ܶܽ")) * 89;
                        i3 = ((iM55979 ^ i55) * 25393) ^ 1863467367;
                        i8 = 46154375;
                    }
                    i57 = iM55979 ^ i8;
                    i56 = i3;
                    break;
                case -569987238:
                case 712713764:
                    c5522.notifyItemInserted(iM12179 + 1 + i67 + i50);
                    iM55682 = (C0946.m55979("ۡܰ") ^ i55) * 69;
                    i3 = ((iM55682 ^ i54) * (-30995)) ^ (-353343945);
                    i7 = 1751543588;
                    i57 = iM55682 ^ i7;
                    str7 = str7;
                    i49 = i49;
                    i56 = i3;
                    break;
                case -497181976:
                case 1064394014:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    if (c18402.f40545) {
                        iM55681 = C0873.m55680("֨᩸") ^ i55;
                        i5 = ((iM55681 ^ i54) * 23855) ^ 1005582596;
                        i6 = 757877735;
                    } else {
                        i60 = i58;
                        iM55681 = (C0873.m55680("ۢۡ") ^ i54) * (-17);
                        i5 = ((iM55681 ^ i55) * 9433) ^ 774652073;
                        i6 = -1023664122;
                    }
                    i57 = iM55681 ^ i6;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    c211410 = c211411;
                    i48 = i48;
                    i56 = i5;
                    i66 = i66;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211410;
                    break;
                case -484909380:
                case 2014786533:
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    itM56090 = C0989.m56090(arrayList10);
                    iM55681 = C0946.m55979("᩻֡") ^ i54;
                    i5 = ((iM55681 ^ i55) * (-2911)) ^ (-1386526148);
                    i6 = 1254140576;
                    i57 = iM55681 ^ i6;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    c211410 = c211411;
                    i48 = i48;
                    i56 = i5;
                    i66 = i66;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211410;
                    break;
                case -470781153:
                case 509793305:
                    arrayList9.add(i59, new C21146(c18402, main, c18402.m41897(str7)));
                    if (c18402.f40545) {
                        iM55979 = C0946.m55979("֡ۢ") ^ i54;
                        i3 = ((iM55979 ^ i55) * (-29613)) ^ (-1252978559);
                        i8 = 19221560;
                        i57 = iM55979 ^ i8;
                        i56 = i3;
                    }
                    iM55682 = (C0946.m55979("ۡܰ") ^ i55) * 69;
                    i3 = ((iM55682 ^ i54) * (-30995)) ^ (-353343945);
                    i7 = 1751543588;
                    i57 = iM55682 ^ i7;
                    str7 = str7;
                    i49 = i49;
                    i56 = i3;
                    break;
                case -455545364:
                case 1959885151:
                    if (C0946.f81894 != 0) {
                        i61 = i61;
                        c211411 = c211411;
                        i49 = i49;
                        str7 = str7;
                        arrayList3 = arrayList9;
                        str5 = strM26623;
                        int iM5597112 = (i55 - C0946.m55979("۬᩶")) * (-35);
                        InterfaceC14770 interfaceC14774 = interfaceC14771;
                        int i811 = ((iM5597112 ^ i54) * 17399) ^ (-918637358);
                        i57 = iM5597112 ^ (-1971623494);
                        strM26623 = str5;
                        i62 = i62;
                        sArr7 = sArr7;
                        i64 = i64;
                        arrayList9 = arrayList3;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14774;
                        arrayList7 = arrayList7;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        i56 = i811;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    } else {
                        i48 = i48;
                        strM56584 = str8;
                        interfaceC14770 = interfaceC14771;
                        i24 = i61;
                        c21146 = c211411;
                        sArr3 = sArr7;
                        i25 = i65;
                        arrayList = arrayList9;
                        i32 = i67;
                        i26 = i59;
                        i27 = i49;
                        arrayList2 = arrayList10;
                        sArr4 = sArr6;
                        i33 = i63;
                        str2 = str7;
                        i28 = i66;
                        i29 = iM56139;
                        i30 = i62;
                        i31 = i58;
                        hashSet2 = hashSet3;
                        str3 = strM26623;
                        iM55684 = (i55 - C0946.m55979("ۜۜ")) * (-127);
                        str4 = strM56584;
                        i56 = ((iM55684 ^ i54) * 32573) ^ 410298797;
                        i34 = -1591066297;
                        i57 = iM55684 ^ i34;
                        sArr6 = sArr4;
                        i63 = i33;
                        i62 = i30;
                        sArr7 = sArr3;
                        strM26623 = str3;
                        i67 = i32;
                        arrayList9 = arrayList;
                        i66 = i28;
                        i65 = i25;
                        interfaceC14771 = interfaceC14770;
                        str8 = str4;
                        hashSet3 = hashSet2;
                        arrayList10 = arrayList2;
                        i58 = i31;
                        i59 = i26;
                        iM56139 = i29;
                        c211411 = c21146;
                        str7 = str2;
                        i49 = i27;
                        i61 = i24;
                        i48 = i48;
                    }
                    break;
                case -414452893:
                case 964783829:
                    RunnableC0938.m55938();
                    if (C0845.f81821 < 0) {
                        iM55979 = C0946.m55979("ܽ֫") ^ i54;
                        i3 = ((iM55979 ^ i55) * 32581) ^ 442176969;
                        i8 = 341654813;
                    } else {
                        iM55979 = (C0946.m55979("ۜ᩵") + i55) * 87;
                        i3 = ((iM55979 ^ i54) * (-7945)) ^ (-646951316);
                        i8 = -1090089577;
                    }
                    i57 = iM55979 ^ i8;
                    i56 = i3;
                    break;
                case -414182371:
                case 2020838445:
                    i35 = i61;
                    c21147 = c211411;
                    i36 = i49;
                    arrayList4 = new ArrayList();
                    iM56137 = C1012.m56137(arrayList6) - i58;
                    int iM556814 = (C0873.m55680("᩺֡") ^ i54) * 45;
                    int i91 = ((iM556814 ^ i55) * (-11075)) ^ (-576142358);
                    i57 = iM556814 ^ (-797555852);
                    iM56139 = iM56139;
                    str7 = str7;
                    i66 = i66;
                    i49 = i36;
                    i61 = i35;
                    arrayList10 = arrayList4;
                    i56 = i91;
                    c211410 = c21147;
                    i48 = iM56137;
                    i59 = i59;
                    c211411 = c211410;
                    break;
                case -412975731:
                case 1902086350:
                    arrayList9 = arrayList9;
                    i48 = i48;
                    String str11 = str8;
                    i61 = i61;
                    c211411 = c211411;
                    short[] sArr8 = sArr7;
                    int i92 = i65;
                    i67 = i67;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i = i62;
                    i58 = i58;
                    HashSet hashSet6 = hashSet3;
                    strM26623 = strM26623;
                    InterfaceC14770 interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649);
                    sArr6 = f82272;
                    i63 = 390;
                    if (C1964.f83032 <= 0) {
                        hashSet3 = hashSet6;
                        str8 = str11;
                        interfaceC14771 = interfaceC14770M55950;
                        sArr7 = sArr8;
                        i65 = i92;
                        int iM556815 = C0873.m55680("ۤۢ") ^ i55;
                        int i610 = ((iM556815 ^ i54) * 8935) ^ (-1581532806);
                        i11 = iM556815 ^ (-583486022);
                        i56 = i610;
                        i62 = i;
                        i67 = i67;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i58 = i58;
                        i66 = i66;
                        interfaceC14771 = interfaceC14771;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        hashSet3 = hashSet3;
                        i57 = i11;
                        c211411 = c211411;
                        i48 = i48;
                        c18402 = this;
                    } else {
                        int iM556816 = (C0873.m55680("ܺۤ") ^ i54) * (-43);
                        i56 = ((iM556816 ^ i55) * 14097) ^ (-186918183);
                        i57 = iM556816 ^ 785324719;
                        i62 = i;
                        sArr7 = sArr8;
                        i67 = i67;
                        str8 = str11;
                        i66 = i66;
                        i65 = i92;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        i59 = i59;
                        hashSet3 = hashSet6;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                        interfaceC14771 = interfaceC14770M55950;
                        arrayList9 = arrayList9;
                    }
                    break;
                case -389458971:
                case 796118851:
                    i49 = i49;
                    str7 = str7;
                    iM55586 = C0845.m55586((Integer) C0955.m56035(itM56090));
                    arrayList9.remove(i67 + iM55586);
                    if (!c18402.f40545) {
                        i49 = i49;
                        arrayList10 = arrayList10;
                        iM55681 = C0946.m55979("᩻֡") ^ i54;
                        i5 = ((iM55681 ^ i55) * (-2911)) ^ (-1386526148);
                        i6 = 1254140576;
                        i57 = iM55681 ^ i6;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                        c211410 = c211411;
                        i48 = i48;
                        i56 = i5;
                        i66 = i66;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211410;
                    } else {
                        iM55682 = C0873.m55680("֫۫") ^ i55;
                        i3 = ((iM55682 ^ i54) * (-15265)) ^ 617997126;
                        i7 = -836786778;
                        i57 = iM55682 ^ i7;
                        str7 = str7;
                        i49 = i49;
                        i56 = i3;
                    }
                    break;
                case -329256446:
                case 2127008096:
                    c5522.notifyItemRangeInserted(c5522.m12179(c18402), i60);
                    break;
                case -268945214:
                case 1224299790:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC14771 = interfaceC14771;
                    strM26623 = strM26623;
                    i61 = i61;
                    c211411 = c211411;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    i59 = i59;
                    str8 = str8;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i67 = i67;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i = i62;
                    i2 = i63;
                    i58 = i58;
                    s = sArr5[389];
                    i51 = s * s;
                    if (C0863.m55643()) {
                        iM559710 = C0873.m55680("᩹᩹") ^ i54;
                        i9 = ((iM559710 ^ i55) * (-23141)) ^ (-868604941);
                        i10 = -418364531;
                    } else {
                        iM559710 = C0946.m55979("۬ܽ") ^ i54;
                        i9 = ((iM559710 ^ i55) * 2513) ^ (-427909314);
                        i10 = -691881675;
                    }
                    i11 = iM559710 ^ i10;
                    i56 = i9;
                    i63 = i2;
                    i62 = i;
                    sArr7 = sArr7;
                    i67 = i67;
                    arrayList9 = arrayList9;
                    str8 = str8;
                    i58 = i58;
                    i66 = i66;
                    i65 = i65;
                    interfaceC14771 = interfaceC14771;
                    sArr6 = sArr6;
                    iM56139 = iM56139;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    str7 = str7;
                    i49 = i49;
                    i59 = i59;
                    i61 = i61;
                    hashSet3 = hashSet3;
                    i57 = i11;
                    c211411 = c211411;
                    i48 = i48;
                    c18402 = this;
                    break;
                case -170314549:
                case 1341618627:
                    arrayList8 = new ArrayList();
                    i49 = i61;
                    iM55682 = (i55 - C0946.m55979("ܽ᩹")) * (-27);
                    i3 = ((iM55682 ^ i54) * (-1113)) ^ 1156860769;
                    i7 = 1176263438;
                    i57 = iM55682 ^ i7;
                    str7 = str7;
                    i49 = i49;
                    i56 = i3;
                    break;
                case -129783141:
                case 2146424385:
                    i49 = i49;
                    str7 = str7;
                    c5522.notifyItemRemoved(iM12179 + 1 + i67 + iM55586);
                    i49 = i49;
                    arrayList10 = arrayList10;
                    iM55681 = C0946.m55979("᩻֡") ^ i54;
                    i5 = ((iM55681 ^ i55) * (-2911)) ^ (-1386526148);
                    i6 = 1254140576;
                    i57 = iM55681 ^ i6;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    c211410 = c211411;
                    i48 = i48;
                    i56 = i5;
                    i66 = i66;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211410;
                    break;
                case -21257630:
                case 1104213229:
                    break;
                case 99831848:
                case 792625234:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    if (iM56138 == 0) {
                        iM55680 = (C0873.m55680("᩻֫") + i55) * (-97);
                        i3 = ((iM55680 ^ i54) * (-17801)) ^ 1564173239;
                        i4 = 1527938613;
                    } else {
                        iM55680 = (i54 - C0873.m55680("ۡۧ")) * (-103);
                        i3 = ((iM55680 ^ i55) * (-24625)) ^ (-205943524);
                        i4 = 372383137;
                    }
                    i57 = iM55680 ^ i4;
                    iM56139 = iM56139;
                    str7 = str7;
                    i66 = i66;
                    i49 = i49;
                    i61 = i61;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211411;
                    i48 = i48;
                    i56 = i3;
                    break;
                case 131713404:
                case 165753575:
                    C0892.m55749();
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        hashSet3 = hashSet3;
                        i48 = i48;
                        interfaceC14771 = interfaceC14771;
                        strM26623 = strM26623;
                        i61 = i61;
                        c211411 = c211411;
                        sArr6 = sArr6;
                        sArr7 = sArr7;
                        i65 = i65;
                        arrayList9 = arrayList9;
                        i59 = i59;
                        str8 = str8;
                        i49 = i49;
                        arrayList10 = arrayList10;
                        i67 = i67;
                        str7 = str7;
                        i66 = i66;
                        iM56139 = iM56139;
                        i = i62;
                        i2 = i63;
                        i58 = i58;
                        iM559710 = C0946.m55979("۫ᩴ") ^ i55;
                        i9 = ((iM559710 ^ i54) * 9849) ^ 478107507;
                        i10 = 1455146701;
                        i11 = iM559710 ^ i10;
                        i56 = i9;
                        i63 = i2;
                        i62 = i;
                        sArr7 = sArr7;
                        i67 = i67;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i58 = i58;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr6;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        hashSet3 = hashSet3;
                        i57 = i11;
                        c211411 = c211411;
                        i48 = i48;
                        c18402 = this;
                    } else {
                        iM55979 = C0946.m55979("ܽ֫") ^ i54;
                        i3 = ((iM55979 ^ i55) * 32581) ^ 442176969;
                        i8 = 341654813;
                        i57 = iM55979 ^ i8;
                        i56 = i3;
                    }
                    break;
                case 195397388:
                case 252571587:
                    i37 = i48;
                    c21148 = c211411;
                    i38 = i59;
                    arrayList5 = arrayList10;
                    i39 = i66;
                    int i93 = i60;
                    int i94 = i49;
                    str6 = str7;
                    i40 = i61;
                    i41 = i94;
                    if (c18402.f40545) {
                        iM55685 = (i55 - C0873.m55680("᩵ᩳ")) * 99;
                        i60 = i93;
                        i43 = ((iM55685 ^ i54) * 29081) ^ (-2051790902);
                        i44 = -574818004;
                    } else {
                        i60 = i93;
                        i42 = i58;
                        iM55685 = (C0946.m55979("۟ۢ") ^ i55) * (-115);
                        i39 = i42;
                        i43 = ((iM55685 ^ i54) * 969) ^ 233651594;
                        i44 = 1746981332;
                    }
                    i57 = iM55685 ^ i44;
                    C21146 c211414 = c21148;
                    i48 = i37;
                    i56 = i43;
                    i66 = i39;
                    arrayList10 = arrayList5;
                    i59 = i38;
                    c211411 = c211414;
                    int i711 = i41;
                    i61 = i40;
                    str7 = str6;
                    i49 = i711;
                    break;
                case 305917640:
                case 1739413264:
                    i62 = 50045;
                    int iM556817 = C0873.m55680("᩺ۡ") ^ i55;
                    int i812 = ((iM556817 ^ i54) * 13415) ^ (-284051849);
                    i11 = iM556817 ^ 841319671;
                    i56 = i812;
                    i63 = i63;
                    sArr7 = sArr7;
                    i67 = i67;
                    arrayList9 = arrayList9;
                    str8 = str8;
                    i58 = i58;
                    i66 = i66;
                    i65 = i65;
                    interfaceC14771 = interfaceC14771;
                    sArr6 = sArr6;
                    iM56139 = iM56139;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    str7 = str7;
                    i49 = i49;
                    i59 = i59;
                    i61 = i61;
                    hashSet3 = hashSet3;
                    i57 = i11;
                    c211411 = c211411;
                    i48 = i48;
                    c18402 = this;
                    break;
                case 312358836:
                case 2108292537:
                    i49 = i49;
                    str7 = str7;
                    if (i49 < C0861.m55625(arrayList7)) {
                        iM55682 = (C0873.m55680("۠ۧ") ^ i54) * (-113);
                        i3 = ((iM55682 ^ i55) * 27821) ^ 258814729;
                        i7 = -2039969746;
                    } else {
                        iM55682 = (C0873.m55680("֨ܶ") + i54) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i3 = ((iM55682 ^ i55) * (-3881)) ^ 1769801592;
                        i7 = -1520068281;
                    }
                    i57 = iM55682 ^ i7;
                    str7 = str7;
                    i49 = i49;
                    i56 = i3;
                    break;
                case 354757575:
                case 642683411:
                    C1036.m56257();
                    C0894.m55769();
                    i48 = i48;
                    strM56584 = str8;
                    interfaceC14770 = interfaceC14771;
                    i24 = i61;
                    c21146 = c211411;
                    sArr3 = sArr7;
                    i25 = i65;
                    arrayList = arrayList9;
                    i32 = i67;
                    i26 = i59;
                    i27 = i49;
                    arrayList2 = arrayList10;
                    sArr4 = sArr6;
                    i33 = i63;
                    str2 = str7;
                    i28 = i66;
                    i29 = iM56139;
                    i30 = i62;
                    i31 = i58;
                    hashSet2 = hashSet3;
                    str3 = strM26623;
                    iM55684 = (i55 - C0946.m55979("ۜۜ")) * (-127);
                    str4 = strM56584;
                    i56 = ((iM55684 ^ i54) * 32573) ^ 410298797;
                    i34 = -1591066297;
                    i57 = iM55684 ^ i34;
                    sArr6 = sArr4;
                    i63 = i33;
                    i62 = i30;
                    sArr7 = sArr3;
                    strM26623 = str3;
                    i67 = i32;
                    arrayList9 = arrayList;
                    i66 = i28;
                    i65 = i25;
                    interfaceC14771 = interfaceC14770;
                    str8 = str4;
                    hashSet3 = hashSet2;
                    arrayList10 = arrayList2;
                    i58 = i31;
                    i59 = i26;
                    iM56139 = i29;
                    c211411 = c21146;
                    str7 = str2;
                    i49 = i27;
                    i61 = i24;
                    i48 = i48;
                    break;
                case 480140360:
                case 1707404184:
                    itM56293 = C1046.m56292(arrayList8);
                    iM55682 = (C0946.m55979("ۡܰ") ^ i55) * 69;
                    i3 = ((iM55682 ^ i54) * (-30995)) ^ (-353343945);
                    i7 = 1751543588;
                    i57 = iM55682 ^ i7;
                    str7 = str7;
                    i49 = i49;
                    i56 = i3;
                    break;
                case 495760694:
                case 1519733052:
                    int i95 = i61;
                    i36 = i49;
                    i35 = i95;
                    arrayList4 = arrayList10;
                    iM56137 = i48 - 1;
                    c21147 = c211411;
                    int iM556818 = (C0873.m55680("᩺֡") ^ i54) * 45;
                    int i96 = ((iM556818 ^ i55) * (-11075)) ^ (-576142358);
                    i57 = iM556818 ^ (-797555852);
                    iM56139 = iM56139;
                    str7 = str7;
                    i66 = i66;
                    i49 = i36;
                    i61 = i35;
                    arrayList10 = arrayList4;
                    i56 = i96;
                    c211410 = c21147;
                    i48 = iM56137;
                    i59 = i59;
                    c211411 = c211410;
                    break;
                case 676679886:
                case 1265080991:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    if (!C0906.m55806(arrayList6, arrayList7)) {
                        iM55681 = C0946.m55979("֫ܽ") ^ i54;
                        i5 = ((iM55681 ^ i55) * (-26339)) ^ 515609842;
                        i6 = -307700137;
                        i57 = iM55681 ^ i6;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                        c211410 = c211411;
                        i48 = i48;
                        i56 = i5;
                        i66 = i66;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211410;
                    } else {
                        iM56139 = iM56139;
                        iM55680 = (C0946.m55979("ۙ᩸") + i55) * (-21);
                        i3 = ((iM55680 ^ i54) * 25769) ^ 399914521;
                        i4 = 526366639;
                        i57 = iM55680 ^ i4;
                        iM56139 = iM56139;
                        str7 = str7;
                        i66 = i66;
                        i49 = i49;
                        i61 = i61;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211411;
                        i48 = i48;
                        i56 = i3;
                    }
                    break;
                case 773299665:
                case 942693038:
                    hashSet3 = hashSet3;
                    i48 = i48;
                    interfaceC14771 = interfaceC14771;
                    strM26623 = strM26623;
                    i61 = i61;
                    c211411 = c211411;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    i59 = i59;
                    str8 = str8;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    i67 = i67;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i = i62;
                    i2 = i63;
                    i58 = i58;
                    int i97 = i51 + 73496329;
                    i52 = i97 + i97;
                    s2 = 8573;
                    if (C1003.f81929 > 0) {
                        iM559710 = C0946.m55979("ܺ۫") ^ i54;
                        i9 = ((iM559710 ^ i55) * 29887) ^ 1001517155;
                        i10 = 1951969665;
                        i11 = iM559710 ^ i10;
                        i56 = i9;
                        i63 = i2;
                        i62 = i;
                        sArr7 = sArr7;
                        i67 = i67;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i58 = i58;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr6;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        hashSet3 = hashSet3;
                        i57 = i11;
                        c211411 = c211411;
                        i48 = i48;
                        c18402 = this;
                    } else {
                        i63 = i2;
                        sArr7 = sArr7;
                        i65 = i65;
                        sArr6 = sArr6;
                        int iM556819 = C0873.m55680("ۤۢ") ^ i55;
                        int i611 = ((iM556819 ^ i54) * 8935) ^ (-1581532806);
                        i11 = iM556819 ^ (-583486022);
                        i56 = i611;
                        i62 = i;
                        i67 = i67;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i58 = i58;
                        i66 = i66;
                        interfaceC14771 = interfaceC14771;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        hashSet3 = hashSet3;
                        i57 = i11;
                        c211411 = c211411;
                        i48 = i48;
                        c18402 = this;
                    }
                    break;
                case 789767604:
                case 1703865318:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    if (iM56138 <= 0) {
                        i48 = i48;
                        i20 = i67;
                        i21 = i63;
                        iM55683 = (C0946.m55979("۫۟") ^ i54) * 63;
                        sArr2 = sArr6;
                        i22 = ((iM55683 ^ i55) * (-21641)) ^ 488251117;
                        i23 = -1469071740;
                        i57 = iM55683 ^ i23;
                        i56 = i22;
                        i63 = i21;
                        i62 = i62;
                        sArr7 = sArr7;
                        i67 = i20;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr2;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        i59 = i59;
                        hashSet3 = hashSet3;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    } else {
                        iM55681 = (i55 - C0873.m55680("ܶ֡")) * (-79);
                        i5 = ((iM55681 ^ i54) * (-2583)) ^ 286206665;
                        i6 = -452462387;
                        i57 = iM55681 ^ i6;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                        c211410 = c211411;
                        i48 = i48;
                        i56 = i5;
                        i66 = i66;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        c211411 = c211410;
                    }
                    break;
                case 881655154:
                case 888326048:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    if (C0930.m55886(itM56292)) {
                        iM55680 = (C0946.m55979("᩷֡") + i54) * (-61);
                        i3 = ((iM55680 ^ i55) * (-28105)) ^ 67158809;
                        i4 = 1994873083;
                    } else {
                        iM55680 = (C0873.m55680("ܰܶ") ^ i54) * 57;
                        i3 = ((iM55680 ^ i55) * (-16883)) ^ (-85269272);
                        i4 = -1425972939;
                    }
                    i57 = iM55680 ^ i4;
                    iM56139 = iM56139;
                    str7 = str7;
                    i66 = i66;
                    i49 = i49;
                    i61 = i61;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211411;
                    i48 = i48;
                    i56 = i3;
                    break;
                case 939051316:
                case 1744814888:
                    arrayList9.remove(i61);
                    c5522.notifyItemRemoved(iM12179 + i58);
                    break;
                case 971123098:
                case 1587848028:
                    hashSet = hashSet3;
                    zRemove = hashSet.remove(str);
                    z2 = zRemove;
                    iM559712 = (i54 - C0946.m55979("ۚ۠")) * (-11);
                    hashSet3 = hashSet;
                    i17 = ((iM559712 ^ i55) * (-15479)) ^ 23192141;
                    i18 = 781733392;
                    i56 = i17;
                    i63 = i63;
                    i62 = i62;
                    sArr7 = sArr7;
                    i67 = i67;
                    str8 = str8;
                    i58 = i58;
                    i66 = i66;
                    i65 = i65;
                    sArr6 = sArr6;
                    iM56139 = iM56139;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    str7 = str7;
                    i49 = i49;
                    i59 = i59;
                    i61 = i61;
                    hashSet3 = hashSet3;
                    i57 = iM559712 ^ i18;
                    c211411 = c211411;
                    arrayList9 = arrayList9;
                    i48 = i48;
                    interfaceC14771 = interfaceC14771;
                    break;
                case 1050860089:
                case 1943584447:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    sArr7 = sArr7;
                    i64 = i64;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i62 = i62;
                    i58 = i58;
                    int i98 = i65;
                    String strM55635 = C0863.m55635(sArr7, i64, i98, i62);
                    i65 = i98;
                    interfaceC14771 = interfaceC14771;
                    arrayList3 = arrayList9;
                    str5 = strM26623;
                    C1194.m56383(C1025.m56231(interfaceC14771, strM55635, str5));
                    arrayList7 = m41906().f26909;
                    if (!RunnableC0897.f81856) {
                        int iM5597113 = (i55 - C0946.m55979("۬᩶")) * (-35);
                        InterfaceC14770 interfaceC14775 = interfaceC14771;
                        int i813 = ((iM5597113 ^ i54) * 17399) ^ (-918637358);
                        i57 = iM5597113 ^ (-1971623494);
                        strM26623 = str5;
                        i62 = i62;
                        sArr7 = sArr7;
                        i64 = i64;
                        arrayList9 = arrayList3;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14775;
                        arrayList7 = arrayList7;
                        arrayList10 = arrayList10;
                        i59 = i59;
                        i56 = i813;
                        c211411 = c211411;
                        i58 = i58;
                        i48 = i48;
                        iM56139 = iM56139;
                        str7 = str7;
                        i49 = i49;
                        i61 = i61;
                    } else {
                        int iM556820 = C0873.m55680("ۘ᩹") ^ i54;
                        i56 = ((iM556820 ^ i55) * (-15765)) ^ 236959754;
                        i57 = iM556820 ^ (-1238194833);
                        i62 = i62;
                        sArr7 = sArr7;
                        i64 = i64;
                        arrayList7 = arrayList7;
                        i58 = i58;
                        i66 = i66;
                        i65 = i65;
                        strM26623 = str5;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        arrayList9 = arrayList3;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        interfaceC14771 = interfaceC14771;
                        c211411 = c211411;
                        i48 = i48;
                    }
                    break;
                case 1193080817:
                case 1390293866:
                    i48 = i48;
                    interfaceC14771 = interfaceC14771;
                    i61 = i61;
                    c211411 = c211411;
                    sArr7 = sArr7;
                    i65 = i65;
                    arrayList9 = arrayList9;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    sArr6 = sArr6;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = iM56139;
                    i62 = i62;
                    i58 = i58;
                    hashSet3 = hashSet3;
                    strM26623 = strM26623;
                    str8 = str8;
                    i20 = i67;
                    i21 = i63;
                    if (z2) {
                        sArr2 = sArr6;
                        iM55683 = (C0873.m55680("ܿܿ") ^ i55) * (-37);
                        i22 = ((iM55683 ^ i54) * (-13131)) ^ 15769269;
                        i23 = 957707539;
                    } else {
                        iM55683 = (C0946.m55979("۫۟") ^ i54) * 63;
                        sArr2 = sArr6;
                        i22 = ((iM55683 ^ i55) * (-21641)) ^ 488251117;
                        i23 = -1469071740;
                    }
                    i57 = iM55683 ^ i23;
                    i56 = i22;
                    i63 = i21;
                    i62 = i62;
                    sArr7 = sArr7;
                    i67 = i20;
                    arrayList9 = arrayList9;
                    str8 = str8;
                    i66 = i66;
                    i65 = i65;
                    interfaceC14771 = interfaceC14771;
                    sArr6 = sArr2;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    c211411 = c211411;
                    i58 = i58;
                    i48 = i48;
                    iM56139 = iM56139;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    break;
                case 1278849549:
                case 1953450435:
                    C21146 c211415 = c211411;
                    i59 = i59;
                    int i99 = i49;
                    str7 = str7;
                    int i100 = i61;
                    i49 = i99;
                    arrayList10 = arrayList10;
                    C0937.m55917(arrayList10, C1003.m56129(i48));
                    i61 = i100;
                    i66 = i66;
                    i48 = i48;
                    c211411 = c211415;
                    iM55681 = C0946.m55979("ۧۖ") ^ i54;
                    i5 = ((iM55681 ^ i55) * (-29999)) ^ 1421877873;
                    i6 = -2051619856;
                    i57 = iM55681 ^ i6;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    c211410 = c211411;
                    i48 = i48;
                    i56 = i5;
                    i66 = i66;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211410;
                    break;
                case 1370499587:
                case 1848608213:
                    iM12179 = c5522.m12179(c18402);
                    iM559711 = C0946.m55979("ۖۤ") ^ i54;
                    i15 = ((iM559711 ^ i55) * 21767) ^ (-464837327);
                    i16 = 1252213827;
                    i19 = iM559711 ^ i16;
                    i56 = i15;
                    i63 = i63;
                    i62 = i62;
                    sArr7 = sArr7;
                    i67 = i67;
                    arrayList9 = arrayList9;
                    str8 = str8;
                    i66 = i66;
                    i65 = i65;
                    interfaceC14771 = interfaceC14771;
                    sArr6 = sArr6;
                    arrayList10 = arrayList10;
                    strM26623 = strM26623;
                    i59 = i59;
                    hashSet3 = hashSet3;
                    i57 = i19;
                    c211411 = c211411;
                    i58 = i58;
                    i48 = i48;
                    iM56139 = iM56139;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    break;
                case 1410778579:
                case 1508991061:
                    if (C1964.m56597() != 0) {
                        hashSet3 = hashSet3;
                        i48 = i48;
                        interfaceC14771 = interfaceC14771;
                        strM26623 = strM26623;
                        i61 = i61;
                        c211411 = c211411;
                        sArr6 = sArr6;
                        sArr7 = sArr7;
                        i65 = i65;
                        arrayList9 = arrayList9;
                        i59 = i59;
                        str8 = str8;
                        i49 = i49;
                        arrayList10 = arrayList10;
                        i67 = i67;
                        str7 = str7;
                        i66 = i66;
                        iM56139 = iM56139;
                        i = i62;
                        i2 = i63;
                        i58 = i58;
                        iM559710 = C0946.m55979("۬ܽ") ^ i54;
                        i9 = ((iM559710 ^ i55) * 2513) ^ (-427909314);
                        i10 = -691881675;
                        i11 = iM559710 ^ i10;
                        i56 = i9;
                        i63 = i2;
                        i62 = i;
                        sArr7 = sArr7;
                        i67 = i67;
                        arrayList9 = arrayList9;
                        str8 = str8;
                        i58 = i58;
                        i66 = i66;
                        i65 = i65;
                        interfaceC14771 = interfaceC14771;
                        sArr6 = sArr6;
                        iM56139 = iM56139;
                        arrayList10 = arrayList10;
                        strM26623 = strM26623;
                        str7 = str7;
                        i49 = i49;
                        i59 = i59;
                        i61 = i61;
                        hashSet3 = hashSet3;
                        i57 = i11;
                        c211411 = c211411;
                        i48 = i48;
                        c18402 = this;
                    } else {
                        iM55979 = C0946.m55979("ܽ֫") ^ i54;
                        i3 = ((iM55979 ^ i55) * 32581) ^ 442176969;
                        i8 = 341654813;
                        i57 = iM55979 ^ i8;
                        i56 = i3;
                    }
                    break;
                case 1762729421:
                case 2129038704:
                    i48 = i48;
                    i61 = i61;
                    c211411 = c211411;
                    i59 = i59;
                    i49 = i49;
                    arrayList10 = arrayList10;
                    str7 = str7;
                    i66 = i66;
                    iM56139 = C1012.m56137(arrayList7) + i67;
                    main = c18402.f37526;
                    i58 = 1;
                    if (iM56138 != 0) {
                        iM55681 = (C0946.m55979("ᩴܳ") ^ i55) * 91;
                        i5 = ((iM55681 ^ i54) * 14233) ^ 762910690;
                        i6 = -1785789943;
                    } else {
                        iM55681 = (i54 - C0873.m55680("ۖۘ")) * 67;
                        i5 = ((iM55681 ^ i55) * 13321) ^ 152094767;
                        i6 = 203592547;
                    }
                    i57 = iM55681 ^ i6;
                    str7 = str7;
                    i49 = i49;
                    i61 = i61;
                    c211410 = c211411;
                    i48 = i48;
                    i56 = i5;
                    i66 = i66;
                    arrayList10 = arrayList10;
                    i59 = i59;
                    c211411 = c211410;
                    break;
                default:
                    i49 = i49;
                    str7 = str7;
                    if (C0894.m55758(arrayList6, C1017.m56196(arrayList7, i49))) {
                        iM55682 = C0873.m55680("۟ۨ") ^ i54;
                        i3 = ((iM55682 ^ i55) * 18353) ^ (-645291602);
                        i7 = 1909317077;
                    } else {
                        iM55682 = (C0873.m55680("᩶ܳ") ^ i55) * 47;
                        i3 = ((iM55682 ^ i54) * (-11897)) ^ (-193714562);
                        i7 = 70134280;
                    }
                    i57 = iM55682 ^ i7;
                    str7 = str7;
                    i49 = i49;
                    i56 = i3;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m41904(C18402 c18402) {
        int iM55680;
        int i;
        int i2;
        int i3;
        int i4;
        int iM55979;
        int i5;
        int iM559710;
        int i6;
        int i7;
        int i8;
        int iM559711;
        int i9;
        int i10;
        C13039 c13039;
        int i11;
        short[] sArr;
        C18402 c18403 = c18402;
        int i12 = C1025.f81947;
        int i13 = C1053.f81965;
        int iM559712 = C0946.m55979("ۙۛ") ^ i12;
        int i14 = ((iM559712 ^ i13) * (-22061)) ^ 321138476;
        View viewM56111 = null;
        String strM55750 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i15 = iM559712 ^ (-1849303084);
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int iM559713 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -580965689;
        int iM559714 = 0;
        Iterator itM56292 = null;
        C13039 c130310 = null;
        C3847 c3847 = null;
        int i21 = 0;
        ArrayList arrayList = null;
        C14439 c14439 = null;
        Main main = null;
        C14849 c14849 = null;
        View viewM55755 = null;
        View viewM56465 = null;
        while (true) {
            i20 = i15 ^ (i14 & (((i20 ^ i13) * 28143) >> 31));
            switch (i20) {
                case -1786354522:
                case -1753744633:
                    c14849 = (C14849) viewM55755;
                    c14439 = new C14439(c18403, c14849, arrayList);
                    C0906.m55818(c14849, c14439);
                    if (!C0917.m55854()) {
                        sArr3 = sArr3;
                        i8 = iM559714;
                        c130310 = c130310;
                        iM559711 = C0946.m55979("ۡ᩻") ^ i12;
                        i9 = ((iM559711 ^ i13) * 30881) ^ 376967730;
                        i10 = -227023279;
                        int i22 = iM559711 ^ i10;
                        iM559714 = i8;
                        i15 = i22;
                        i14 = i9;
                        c130310 = c130310;
                        sArr3 = sArr3;
                    } else {
                        iM559710 = (C0873.m55680("֨᩷") ^ i12) * 43;
                        i6 = ((iM559710 ^ i13) * (-16039)) ^ 1835756646;
                        i7 = 1326157589;
                        i15 = iM559710 ^ i7;
                        i14 = i6;
                    }
                    break;
                case -1767026750:
                case 1157374538:
                    sArr3 = sArr3;
                    i8 = iM559714;
                    c130310 = c130310;
                    iM559713 = C0946.m55979(strM55750);
                    i18 = 2124483813;
                    if (C1048.f81963) {
                        iM559711 = (i12 - C0946.m55979("ܰܰ")) * (-73);
                        i9 = ((iM559711 ^ i13) * 25299) ^ 944704439;
                        i10 = 1281679507;
                    } else {
                        iM559711 = C0946.m55979("ۡ᩻") ^ i12;
                        i9 = ((iM559711 ^ i13) * 30881) ^ 376967730;
                        i10 = -227023279;
                    }
                    int i23 = iM559711 ^ i10;
                    iM559714 = i8;
                    i15 = i23;
                    i14 = i9;
                    c130310 = c130310;
                    sArr3 = sArr3;
                    break;
                case -1746099256:
                case 15861293:
                    sArr3 = sArr3;
                    c130310 = c130310;
                    int i24 = i19;
                    iM559714 = C0946.m55979(C1036.m56252(sArr3, i24, 3, i21)) ^ 2126007306;
                    if (!C0861.f81831) {
                        i19 = i24;
                        i2 = iM559714;
                        main = main;
                        int iM55681 = (C0873.m55680("֡ۡ") + i13) * (-85);
                        int i25 = ((iM55681 ^ i12) * (-6299)) ^ (-1078677335);
                        i15 = iM55681 ^ (-754735250);
                        c18403 = c18402;
                        c130310 = c130310;
                        sArr3 = sArr3;
                        Main main2 = main;
                        iM559714 = i2;
                        i14 = i25;
                        main = main2;
                    } else {
                        int iM55682 = C0873.m55680("ۜۢ") ^ i13;
                        i19 = i24;
                        i9 = ((iM55682 ^ i12) * 15673) ^ 1404863318;
                        i15 = iM55682 ^ 1000174029;
                        i14 = i9;
                        c130310 = c130310;
                        sArr3 = sArr3;
                    }
                    break;
                case -1638151860:
                case -1307901134:
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    main = main;
                    c130310 = c130310;
                    s = sArr2[c];
                    s2 = 13478;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("ܶܳ") ^ i13;
                        i14 = ((iM55680 ^ i12) * 27201) ^ 1551175672;
                        i = 1636205332;
                    } else {
                        iM55680 = C0873.m55680("᩻ۗ") ^ i12;
                        i14 = ((iM55680 ^ i13) * (-16541)) ^ 2007537184;
                        i = -1698650647;
                    }
                    int i26 = iM55680 ^ i;
                    c130310 = c130310;
                    main = main;
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    i15 = i26;
                    c18403 = c18402;
                    break;
                case -1614493869:
                case 1849974712:
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    main = main;
                    c130310 = c130310;
                    if ((s * s2) - ((s * s) + 45414121) <= 0) {
                        iM55680 = C0873.m55680("ۗ᩺") ^ i12;
                        i14 = ((iM55680 ^ i13) * 231) ^ 89444565;
                        i = 1428109658;
                    } else {
                        iM55680 = (C0873.m55680("ۤ۟") + i13) * 53;
                        i14 = ((iM55680 ^ i12) * (-22641)) ^ 1788304954;
                        i = -524945110;
                    }
                    int i27 = iM55680 ^ i;
                    c130310 = c130310;
                    main = main;
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    i15 = i27;
                    c18403 = c18402;
                    break;
                case -1591790333:
                case -93604460:
                    c18402.m41895();
                    break;
                case -1586597941:
                case -1583868364:
                    i21 = 11617;
                    iM55680 = C0873.m55680("ۤܳ") ^ i12;
                    i14 = ((iM55680 ^ i13) * (-26553)) ^ 2137998272;
                    i = 976605823;
                    int i28 = iM55680 ^ i;
                    c130310 = c130310;
                    main = main;
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    i15 = i28;
                    c18403 = c18402;
                    break;
                case -1573708031:
                case 1440369793:
                    C1194.m56396();
                    i11 = iM559714;
                    short[] sArr5 = sArr3;
                    c13039 = c130310;
                    sArr = sArr5;
                    int iM55683 = (C0873.m55680("᩻ܰ") + i12) * (-15);
                    int i29 = i11;
                    i14 = ((iM55683 ^ i13) * 25167) ^ (-1970557765);
                    iM559714 = i29;
                    i15 = iM55683 ^ (-894234981);
                    C13039 c130311 = c13039;
                    sArr3 = sArr;
                    c130310 = c130311;
                    break;
                case -1443082964:
                case 358060307:
                    viewM55755 = C0892.m55755(viewM56111, C0946.m55979(C0967.m56077(sArr4, i16, i17, i21)) ^ 2124313408);
                    if (!C0866.m55645()) {
                        i2 = iM559714;
                        c130310 = c130310;
                        int iM55684 = (C0873.m55680("֡ۡ") + i13) * (-85);
                        int i210 = ((iM55684 ^ i12) * (-6299)) ^ (-1078677335);
                        i15 = iM55684 ^ (-754735250);
                        c18403 = c18402;
                        c130310 = c130310;
                        sArr3 = sArr3;
                        Main main3 = main;
                        iM559714 = i2;
                        i14 = i210;
                        main = main3;
                    } else {
                        iM559710 = (C0946.m55979("۠ܽ") + i13) * (-109);
                        i6 = ((iM559710 ^ i12) * 19047) ^ (-712395969);
                        i7 = 568509177;
                        i15 = iM559710 ^ i7;
                        i14 = i6;
                    }
                    break;
                case -1369800542:
                case -578629253:
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    main = main;
                    c130310 = c130310;
                    if (C0866.m55647(itM56292)) {
                        iM55979 = C0946.m55979("۬ۢ") ^ i12;
                        i3 = ((iM55979 ^ i13) * 22743) ^ (-144248386);
                        i5 = -1674513413;
                    } else {
                        iM55979 = C0946.m55979("ۢۧ") ^ i13;
                        i3 = ((iM55979 ^ i12) * (-24133)) ^ 405791115;
                        i5 = -732974493;
                    }
                    i4 = iM55979 ^ i5;
                    c130310 = c130310;
                    sArr3 = sArr3;
                    int i30 = iM559714;
                    i15 = i4;
                    i14 = i3;
                    main = main;
                    iM559714 = i30;
                    break;
                case -1285797030:
                case -1053939643:
                    C20671 c20671M55654 = C0866.m55654(main);
                    C0927.m55864(c20671M55654, viewM56111);
                    C14439.m33048(c14439, RunnableC0871.m55669(c20671M55654), c3847, viewM56465);
                    break;
                case -880540910:
                case -528689391:
                    if (C0845.m55584() > 0) {
                        sArr3 = sArr3;
                        iM559714 = iM559714;
                        main = main;
                        c130310 = c130310;
                        iM55680 = C0946.m55979("ܶܳ") ^ i13;
                        i14 = ((iM55680 ^ i12) * 27201) ^ 1551175672;
                        i = 1636205332;
                        int i211 = iM55680 ^ i;
                        c130310 = c130310;
                        main = main;
                        sArr3 = sArr3;
                        iM559714 = iM559714;
                        i15 = i211;
                        c18403 = c18402;
                    } else {
                        i11 = iM559714;
                        short[] sArr6 = sArr3;
                        c13039 = c130310;
                        sArr = sArr6;
                        int iM55685 = (C0873.m55680("᩻ܰ") + i12) * (-15);
                        int i212 = i11;
                        i14 = ((iM55685 ^ i13) * 25167) ^ (-1970557765);
                        iM559714 = i212;
                        i15 = iM55685 ^ (-894234981);
                        C13039 c130312 = c13039;
                        sArr3 = sArr;
                        c130310 = c130312;
                    }
                    break;
                case -849428597:
                case 1756884832:
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    main = main;
                    c130310 = (C13039) f54943.get((String) RunnableC0897.m55785(itM56292));
                    if (c130310 == null) {
                        main = main;
                        int iM55686 = C0873.m55680("ۗۜ") ^ i13;
                        sArr3 = sArr3;
                        iM559714 = iM559714;
                        i15 = iM55686 ^ (-371318090);
                        i14 = ((iM55686 ^ i12) * (-7489)) ^ 1081275449;
                        c18403 = c18402;
                    } else {
                        int iM55687 = C0873.m55680("ۘܽ") ^ i13;
                        i3 = ((iM55687 ^ i12) * (-5289)) ^ (-470333754);
                        i4 = iM55687 ^ 918264007;
                        sArr3 = sArr3;
                        int i31 = iM559714;
                        i15 = i4;
                        i14 = i3;
                        main = main;
                        iM559714 = i31;
                    }
                    break;
                case -535607538:
                case 2141159173:
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    main = main;
                    c130310 = c130310;
                    if (C1017.m56195(arrayList)) {
                        iM55979 = C0873.m55680("۫᩵") ^ i13;
                        i3 = ((iM55979 ^ i12) * (-30041)) ^ (-1967940546);
                        i5 = -835228586;
                    } else {
                        iM55979 = (i12 - C0873.m55680("᩹ܰ")) * (-115);
                        i3 = ((iM55979 ^ i13) * (-5119)) ^ 1585071059;
                        i5 = 781379106;
                    }
                    i4 = iM55979 ^ i5;
                    c130310 = c130310;
                    sArr3 = sArr3;
                    int i32 = iM559714;
                    i15 = i4;
                    i14 = i3;
                    main = main;
                    iM559714 = i32;
                    break;
                case -439622421:
                case 116443142:
                    if (C1229.f82066 < 0) {
                        iM559710 = C0946.m55979("ۨۢ") ^ i12;
                        i6 = ((iM559710 ^ i13) * (-18473)) ^ 1573535210;
                        i7 = 1057168901;
                        i15 = iM559710 ^ i7;
                        i14 = i6;
                    } else {
                        sArr3 = sArr3;
                        iM559714 = iM559714;
                        main = main;
                        c130310 = c130310;
                        iM55680 = C0946.m55979("ܶܳ") ^ i13;
                        i14 = ((iM55680 ^ i12) * 27201) ^ 1551175672;
                        i = 1636205332;
                        int i213 = iM55680 ^ i;
                        c130310 = c130310;
                        main = main;
                        sArr3 = sArr3;
                        iM559714 = iM559714;
                        i15 = i213;
                        c18403 = c18402;
                    }
                    break;
                case -279374293:
                case 1571148451:
                    c3847 = new C3847(new C5052(c14439, arrayList));
                    c3847.m7551(c14849);
                    if (!AbstractC0942.m55971()) {
                        iM559710 = C0873.m55680("᩶᩺") ^ i12;
                        i6 = ((iM559710 ^ i13) * 16967) ^ 613429080;
                        i7 = 1205388403;
                        i15 = iM559710 ^ i7;
                        i14 = i6;
                    } else {
                        sArr3 = sArr3;
                        i8 = iM559714;
                        c130310 = c130310;
                        iM559711 = C0946.m55979("ۡ᩻") ^ i12;
                        i9 = ((iM559711 ^ i13) * 30881) ^ 376967730;
                        i10 = -227023279;
                        int i214 = iM559711 ^ i10;
                        iM559714 = i8;
                        i15 = i214;
                        i14 = i9;
                        c130310 = c130310;
                        sArr3 = sArr3;
                    }
                    break;
                case -180562727:
                case 115679804:
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    c130310 = c130310;
                    main = main;
                    strM55750 = C0892.m55750(f82272, 577, 3, i21);
                    if (!C0863.m55643()) {
                        iM55680 = C0946.m55979("ܶܳ") ^ i13;
                        i14 = ((iM55680 ^ i12) * 27201) ^ 1551175672;
                        i = 1636205332;
                        int i215 = iM55680 ^ i;
                        c130310 = c130310;
                        main = main;
                        sArr3 = sArr3;
                        iM559714 = iM559714;
                        i15 = i215;
                        c18403 = c18402;
                    } else {
                        iM55979 = C0946.m55979("ܿ᩵") ^ i13;
                        i3 = ((iM55979 ^ i12) * (-30321)) ^ 913936469;
                        i5 = -1561223684;
                        i4 = iM55979 ^ i5;
                        c130310 = c130310;
                        sArr3 = sArr3;
                        int i33 = iM559714;
                        i15 = i4;
                        i14 = i3;
                        main = main;
                        iM559714 = i33;
                    }
                    break;
                case 7253074:
                case 1698874651:
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    main = main;
                    c130310 = c130310;
                    sArr2 = f82272;
                    c = 576;
                    if (C0927.m55873() > 0) {
                        iM55680 = (C0873.m55680("᩵ۗ") + i13) * 83;
                        i14 = ((iM55680 ^ i12) * (-30635)) ^ (-290874287);
                        i = 1689694418;
                        int i216 = iM55680 ^ i;
                        c130310 = c130310;
                        main = main;
                        sArr3 = sArr3;
                        iM559714 = iM559714;
                        i15 = i216;
                        c18403 = c18402;
                    } else {
                        i2 = iM559714;
                        int iM55688 = (C0873.m55680("֡ۡ") + i13) * (-85);
                        int i217 = ((iM55688 ^ i12) * (-6299)) ^ (-1078677335);
                        i15 = iM55688 ^ (-754735250);
                        c18403 = c18402;
                        c130310 = c130310;
                        sArr3 = sArr3;
                        Main main4 = main;
                        iM559714 = i2;
                        i14 = i217;
                        main = main4;
                    }
                    break;
                case 48720522:
                case 1850885932:
                    C0937.m55917(arrayList, c130310);
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    int iM55689 = C0873.m55680("ۗۜ") ^ i13;
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    i15 = iM55689 ^ (-371318090);
                    i14 = ((iM55689 ^ i12) * (-7489)) ^ 1081275449;
                    c18403 = c18402;
                    break;
                case 166701560:
                case 1996316534:
                    c13039 = c130310;
                    i11 = iM559714;
                    viewM56111 = C0992.m56111(main, iM559713 ^ i18);
                    sArr = f82272;
                    i19 = 580;
                    if (C1012.f81938 >= 0) {
                        int iM556810 = (C0873.m55680("᩻ܰ") + i12) * (-15);
                        int i218 = i11;
                        i14 = ((iM556810 ^ i13) * 25167) ^ (-1970557765);
                        iM559714 = i218;
                        i15 = iM556810 ^ (-894234981);
                    } else {
                        int iM556811 = C0873.m55680("᩷ۢ") ^ i13;
                        iM559714 = i11;
                        i15 = iM556811 ^ (-1548504661);
                        i14 = ((iM556811 ^ i12) * 6113) ^ 1854739499;
                    }
                    C13039 c130313 = c13039;
                    sArr3 = sArr;
                    c130310 = c130313;
                    break;
                case 264340323:
                case 1886937310:
                    i2 = iM559714;
                    viewM56465 = C1404.m56465(viewM56111, i2);
                    sArr4 = f82272;
                    i17 = 3;
                    if (C0949.f81897 >= 0) {
                        i16 = 583;
                        c130310 = c130310;
                        int iM556812 = (C0873.m55680("֡ۡ") + i13) * (-85);
                        int i219 = ((iM556812 ^ i12) * (-6299)) ^ (-1078677335);
                        i15 = iM556812 ^ (-754735250);
                        c18403 = c18402;
                        c130310 = c130310;
                        sArr3 = sArr3;
                        Main main5 = main;
                        iM559714 = i2;
                        i14 = i219;
                        main = main5;
                    } else {
                        int iM556813 = C0873.m55680("ۜ᩻") ^ i12;
                        iM559714 = i2;
                        i15 = iM556813 ^ 1568367582;
                        i14 = ((iM556813 ^ i13) * 28047) ^ 1075505401;
                        i16 = 583;
                    }
                    break;
                case 386736532:
                case 1634210681:
                    C0989.m56095();
                    break;
                case 938988437:
                case 1910406497:
                    i21 = 29903;
                    iM55680 = C0873.m55680("ۤܳ") ^ i12;
                    i14 = ((iM55680 ^ i13) * (-26553)) ^ 2137998272;
                    i = 976605823;
                    int i2110 = iM55680 ^ i;
                    c130310 = c130310;
                    main = main;
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    i15 = i2110;
                    c18403 = c18402;
                    break;
                case 1197675510:
                case 1311357878:
                    if (C1229.f82066 >= 0) {
                        sArr3 = sArr3;
                        i8 = iM559714;
                        c130310 = c130310;
                        iM559711 = C0946.m55979("ۡ᩻") ^ i12;
                        i9 = ((iM559711 ^ i13) * 30881) ^ 376967730;
                        i10 = -227023279;
                        int i2111 = iM559711 ^ i10;
                        iM559714 = i8;
                        i15 = i2111;
                        i14 = i9;
                        c130310 = c130310;
                        sArr3 = sArr3;
                    } else {
                        sArr3 = sArr3;
                        iM559714 = iM559714;
                        main = main;
                        c130310 = c130310;
                        iM55680 = C0946.m55979("ܶܳ") ^ i13;
                        i14 = ((iM55680 ^ i12) * 27201) ^ 1551175672;
                        i = 1636205332;
                        int i2112 = iM55680 ^ i;
                        c130310 = c130310;
                        main = main;
                        sArr3 = sArr3;
                        iM559714 = iM559714;
                        i15 = i2112;
                        c18403 = c18402;
                    }
                    break;
                default:
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    Main main6 = c18403.f37526;
                    ArrayList arrayList2 = new ArrayList();
                    itM56292 = C1046.m56292(m41906().f26908);
                    arrayList = arrayList2;
                    main = main6;
                    int iM556814 = C0873.m55680("ۗۜ") ^ i13;
                    sArr3 = sArr3;
                    iM559714 = iM559714;
                    i15 = iM556814 ^ (-371318090);
                    i14 = ((iM556814 ^ i12) * (-7489)) ^ 1081275449;
                    c18403 = c18402;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0556 A[PHI: r20
      0x0556: PHI (r20v52 int) = (r20v3 int), (r20v4 int), (r20v53 int) binds: [B:136:0x0554, B:132:0x0535, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x022f A[PHI: r20
      0x022f: PHI (r20v26 int) = (r20v23 int), (r20v27 int) binds: [B:70:0x0218, B:56:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        if (p067l.C0873.f81841 <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        r20 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        if (p067l.C0949.f81897 >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ca, code lost:
    
        r20 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
    
        if (p067l.C1044.m56286() > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        if (p067l.C0967.f81910 < 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        if (p067l.C0989.f81920 >= 0) goto L36;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m41893(C18402 c18402, Runnable runnable, DialogInterfaceC2564 dialogInterfaceC2564, String str, Runnable runnable2, InterfaceC4321 interfaceC4321, MenuItem menuItem) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4 = C0845.f81821;
        int i5 = C0873.f81841;
        int iM55681 = C0873.m55680("ۙᩳ") ^ i4;
        int i6 = ((iM55681 ^ i5) * 23069) ^ (-1512008439);
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM55681 ^ 2131328626;
        Main main = null;
        int iM55998 = 0;
        boolean z = false;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1982712430;
        char c = 0;
        C13039 c13039 = null;
        boolean z2 = false;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i5) * 17333) >> 31));
            switch (i12) {
                case -2102852390:
                case 1105107745:
                    i9 = i9;
                    sArr = f82272;
                    c = 449;
                    if (C1044.m56286() <= 0) {
                        iM55979 = C0873.m55680("ܺۜ") ^ i5;
                        i = ((iM55979 ^ i4) * 31635) ^ 882715846;
                        i2 = 1902816657;
                    } else {
                        iM55979 = (C0946.m55979("ܰ۫") + i5) * (-103);
                        i = ((iM55979 ^ i4) * 18985) ^ 123872004;
                        i2 = 655407367;
                    }
                    int i13 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i13;
                    i6 = i;
                    break;
                case -2085843581:
                case 439389745:
                    i9 = i9;
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("᩵᩶") ^ i5) * 59;
                        i = ((iM55979 ^ i4) * 6055) ^ (-1832976898);
                        i2 = -641707826;
                    } else {
                        iM55979 = (C0946.m55979("ۗᩳ") ^ i5) * (-51);
                        i = ((iM55979 ^ i4) * (-1101)) ^ (-1440308945);
                        i2 = -901266969;
                    }
                    int i14 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i14;
                    i6 = i;
                    break;
                case -2017623905:
                case -1285270206:
                    i9 = i9;
                    if (C1194.f82045 != 0) {
                        iM55979 = (i4 - C0873.m55680("ۚ᩶")) * 53;
                        i = ((iM55979 ^ i5) * (-15581)) ^ (-703950750);
                        i2 = -1080534861;
                    } else {
                        iM55979 = (i4 - C0946.m55979("۬ۛ")) * 13;
                        i = ((iM55979 ^ i5) * (-22581)) ^ (-1993771044);
                        i2 = 2036915157;
                    }
                    int i15 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i15;
                    i6 = i;
                    break;
                case -2012306136:
                case 801580531:
                    i9 = i9;
                    z2 = false;
                    z2 = false;
                    if (iM55998 == (C0946.m55979(AbstractC0942.m55970(f82272, 456, 3, i10)) ^ 2101695109)) {
                        iM55979 = C0946.m55979("ܽۙ") ^ i5;
                        i = ((iM55979 ^ i4) * (-1859)) ^ (-2095463252);
                        i2 = 1918077729;
                    } else {
                        iM55979 = C0946.m55979("ۢ֡") ^ i4;
                        i = ((iM55979 ^ i5) * (-12647)) ^ 1410175446;
                        i2 = -869721830;
                    }
                    int i16 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i16;
                    i6 = i;
                    break;
                case -2010616974:
                case -1267827756:
                    i9 = i9;
                    if (C0845.m55584() <= 0) {
                        iM55979 = C0946.m55979("ۢ᩵") ^ i4;
                        i = ((iM55979 ^ i5) * 19233) ^ 1465608178;
                        i2 = 904721262;
                    } else {
                        iM55979 = (C0873.m55680("ۚܿ") ^ i4) * 7;
                        i = ((iM55979 ^ i5) * (-22849)) ^ (-300947362);
                        i2 = -710233880;
                    }
                    int i17 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i17;
                    i6 = i;
                    break;
                case -1854942946:
                case 1697507254:
                    m41888(main);
                    return z;
                case -1772123122:
                case 1591673940:
                    C5729 c5729 = new C5729(main);
                    c5729.m12729(ServiceConnectionC1013.m56156(c13039.f36665));
                    i9 = i9;
                    C21265 c21265 = c13039.f36667;
                    if (C0967.f81910 < 0) {
                        AbstractC22606 abstractC22606 = C21265.f66820;
                        c5729.m12730(new C13776(c21265, z2 ? 1 : 0));
                        c5729.m12734(c13039.f36668);
                        c5729.m12733();
                        return z;
                    }
                    iM55979 = C0946.m55979("ۢ᩵") ^ i4;
                    i = ((iM55979 ^ i5) * 19233) ^ 1465608178;
                    i2 = 904721262;
                    int i18 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i18;
                    i6 = i;
                    break;
                case -1686015935:
                case 1984343956:
                    c18402.m41886(str, z2);
                    return z;
                case -1666503819:
                case 846917696:
                    break;
                case -1642879189:
                case -1388321287:
                    i9 = i9;
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0946.m55979("᩺ܰ") ^ i5) * (-113);
                        i = ((iM55979 ^ i4) * (-11053)) ^ (-610914188);
                        i2 = -991564272;
                    } else {
                        iM55979 = (C0946.m55979("ۖۧ") + i5) * 57;
                        i = ((iM55979 ^ i4) * 3743) ^ 570112650;
                        i2 = -1178758035;
                    }
                    int i19 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i19;
                    i6 = i;
                    break;
                case -1620206083:
                case -228211640:
                    C1046.m56302();
                    break;
                case -1573547026:
                case 162725093:
                    break;
                case -1548901646:
                case 450195126:
                    C0992.m56107();
                    if (C0898.f81858 > 0) {
                        iM55680 = C0946.m55979("ۗۢ") ^ i4;
                        i = ((iM55680 ^ i5) * (-25585)) ^ (-591076751);
                        i3 = 1586517070;
                        i7 = iM55680 ^ i3;
                        i6 = i;
                    }
                    i9 = i9;
                    iM55979 = (C0946.m55979("᩺ܰ") ^ i5) * (-113);
                    i = ((iM55979 ^ i4) * (-11053)) ^ (-610914188);
                    i2 = -991564272;
                    int i110 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i110;
                    i6 = i;
                    break;
                case -1520175714:
                case -503834568:
                    s = sArr[c];
                    int i20 = (s * s) + 30647296;
                    i9 = i20 + i20;
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("۫ܶ") ^ i5;
                        i = ((iM55680 ^ i4) * (-32209)) ^ (-1459042498);
                        i3 = 1080384603;
                    } else {
                        iM55680 = (i4 - C0873.m55680("۠ۙ")) * (-13);
                        i = ((iM55680 ^ i5) * 12819) ^ 1132796516;
                        i3 = -21276934;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -1494181483:
                case 884422251:
                    if (C1053.f81965 > 0) {
                        i9 = i9;
                        iM55979 = (C0873.m55680("᩵᩶") ^ i5) * 59;
                        i = ((iM55979 ^ i4) * 6055) ^ (-1832976898);
                        i2 = -641707826;
                        int i111 = iM55979 ^ i2;
                        i9 = i9;
                        i7 = i111;
                        i6 = i;
                    }
                    iM55680 = C0946.m55979("۫ܶ") ^ i5;
                    i = ((iM55680 ^ i4) * (-32209)) ^ (-1459042498);
                    i3 = 1080384603;
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -1460945125:
                case -703590430:
                    C0927.m55868(runnable);
                    return z;
                case -1441328898:
                case 1885562035:
                    C1229.m56410();
                    break;
                case -1238613417:
                case -435464292:
                    i9 = i9;
                    main = c18402.f37526;
                    iM55998 = C0947.m55998(menuItem);
                    sArr2 = f82272;
                    i11 = Ed448.PRECOMP_RANGE;
                    i8 = 3;
                    if (C1017.m56187() > 0) {
                        iM55979 = (i4 - C0946.m55979("ۙ֡")) * 5;
                        i = ((iM55979 ^ i5) * (-22159)) ^ 1133381024;
                        i2 = 1361883216;
                        int i112 = iM55979 ^ i2;
                        i9 = i9;
                        i7 = i112;
                        i6 = i;
                    } else {
                        i9 = i9;
                        iM55680 = C0946.m55979("۫ܶ") ^ i5;
                        i = ((iM55680 ^ i4) * (-32209)) ^ (-1459042498);
                        i3 = 1080384603;
                        i7 = iM55680 ^ i3;
                        i6 = i;
                    }
                    break;
                case -1219121793:
                case 1338795686:
                    i9 = i9;
                    if (dialogInterfaceC2564 != null) {
                        iM55979 = C0946.m55979("֨ܺ") ^ i4;
                        i = ((iM55979 ^ i5) * (-12521)) ^ (-2115272242);
                        i2 = -1058582100;
                    } else {
                        iM55979 = (C0946.m55979("۫ۜ") ^ i5) * 79;
                        i = ((iM55979 ^ i4) * (-21877)) ^ (-2060662957);
                        i2 = -1978017139;
                    }
                    int i113 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i113;
                    i6 = i;
                    break;
                case -1105600321:
                case 1450233734:
                    i9 = i9;
                    z = true;
                    if (iM55998 == (C0946.m55979(C1404.m56462(sArr2, i11, i8, i10)) ^ 2102727169)) {
                        iM55979 = (C0946.m55979("۫֫") + i5) * (-39);
                        i = ((iM55979 ^ i4) * (-26781)) ^ (-1614144402);
                        i2 = -2046706579;
                    } else {
                        iM55979 = (C0946.m55979("ۢۢ") + i4) * C0254q.f1218h;
                        i = ((iM55979 ^ i5) * 18875) ^ (-1049236273);
                        i2 = 1138625085;
                    }
                    int i114 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i114;
                    i6 = i;
                    break;
                case -1054367140:
                case 1241413176:
                    i9 = i9;
                    if (dialogInterfaceC2564 != null) {
                        iM55979 = C0946.m55979("ۙ᩶") ^ i4;
                        i = ((iM55979 ^ i5) * (-9387)) ^ 1580660343;
                        i2 = -2111862711;
                    } else {
                        iM55979 = C0873.m55680("ۨ֫") ^ i5;
                        i = ((iM55979 ^ i4) * (-22705)) ^ (-1331736620);
                        i2 = 345774676;
                    }
                    int i115 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i115;
                    i6 = i;
                    break;
                case -1019649272:
                case 1025687658:
                    i9 = i9;
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("ۘᩳ") + i5) * (-37);
                        i = ((iM55979 ^ i4) * 26283) ^ (-1722227363);
                        i2 = -1809216824;
                    } else {
                        iM55979 = (i5 - C0946.m55979("᩶۫")) * 93;
                        i = ((iM55979 ^ i4) * (-18881)) ^ (-890406431);
                        i2 = -1329270516;
                    }
                    int i116 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i116;
                    i6 = i;
                    break;
                case -917962250:
                case 107644314:
                    C1046.m56302();
                    C0890.m55740();
                    iM55680 = (C0946.m55979("ܳ᩷") ^ i4) * (-91);
                    i = ((iM55680 ^ i5) * (-6091)) ^ 811738569;
                    i3 = 1168975869;
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -796698080:
                case 2102543775:
                    i9 = i9;
                    c13039 = (C13039) interfaceC4321;
                    if (dialogInterfaceC2564 != null) {
                        iM55979 = C0946.m55979("ۘ֫") ^ i5;
                        i = ((iM55979 ^ i4) * (-2261)) ^ (-1171067557);
                        i2 = -1915279884;
                    } else {
                        iM55979 = (C0946.m55979("ᩳᩴ") + i5) * (-111);
                        i = ((iM55979 ^ i4) * (-3457)) ^ 1363543166;
                        i2 = -184139581;
                    }
                    int i117 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i117;
                    i6 = i;
                    break;
                case -684360900:
                case 337424226:
                    i10 = 62652;
                    iM55979 = C0946.m55979("۫֨") ^ i5;
                    i = ((iM55979 ^ i4) * (-6431)) ^ (-2117547557);
                    i2 = -1128569657;
                    int i118 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i118;
                    i6 = i;
                    break;
                case -681110687:
                case 1247178352:
                    C1024.m56208(dialogInterfaceC2564);
                    i9 = i9;
                    iM55979 = (C0946.m55979("ᩳᩴ") + i5) * (-111);
                    i = ((iM55979 ^ i4) * (-3457)) ^ 1363543166;
                    i2 = -184139581;
                    int i119 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i119;
                    i6 = i;
                    break;
                case -628850847:
                case 614989973:
                    i9 = i9;
                    if (C0992.m56107() <= 0) {
                        iM55979 = (i4 - C0873.m55680("ۚ᩶")) * 53;
                        i = ((iM55979 ^ i5) * (-15581)) ^ (-703950750);
                        i2 = -1080534861;
                    } else {
                        iM55979 = C0946.m55979("ܶۙ") ^ i4;
                        i = ((iM55979 ^ i5) * 14205) ^ (-1418244501);
                        i2 = 1338093162;
                    }
                    int i1110 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i1110;
                    i6 = i;
                    break;
                case -335179239:
                case 680198206:
                    i10 = 13031;
                    iM55979 = C0946.m55979("۫֨") ^ i5;
                    i = ((iM55979 ^ i4) * (-6431)) ^ (-2117547557);
                    i2 = -1128569657;
                    int i1111 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i1111;
                    i6 = i;
                    break;
                case -145444100:
                case 1634543783:
                    i9 = i9;
                    if (interfaceC4321 instanceof C13039) {
                        iM55979 = (C0946.m55979("ۢ᩺") + i4) * 7;
                        i = ((iM55979 ^ i5) * (-25511)) ^ (-1442580092);
                        i2 = 940114389;
                    } else {
                        iM55979 = C0873.m55680("ᩳ᩸") ^ i5;
                        i = ((iM55979 ^ i4) * 20015) ^ 706745331;
                        i2 = 201408238;
                    }
                    int i1112 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i1112;
                    i6 = i;
                    break;
                case -118528115:
                case 159266776:
                    i9 = i9;
                    C0917.m55847(dialogInterfaceC2564);
                    iM55979 = C0873.m55680("۟ۨ") ^ i5;
                    i = ((iM55979 ^ i4) * (-7017)) ^ 1369764820;
                    i2 = 1067307801;
                    int i1113 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i1113;
                    i6 = i;
                    break;
                case -84695149:
                case 1952311710:
                    C0882.m55724(runnable2);
                    return z;
                case 71687415:
                case 1051066611:
                    C1046.m56302();
                    break;
                case 187825677:
                case 1470438746:
                    i9 = i9;
                    if (dialogInterfaceC2564 != null) {
                        iM55979 = (i4 - C0946.m55979("ۗۨ")) * (-79);
                        i = ((iM55979 ^ i5) * 4587) ^ (-521781119);
                        i2 = 3256802;
                    } else {
                        iM55979 = C0873.m55680("۟ۨ") ^ i5;
                        i = ((iM55979 ^ i4) * (-7017)) ^ 1369764820;
                        i2 = 1067307801;
                    }
                    int i1114 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i1114;
                    i6 = i;
                    break;
                case 386321190:
                case 1454546893:
                    return z2;
                case 441198999:
                case 1311518417:
                    c18402.m41886(str, z);
                    return z;
                case 517264098:
                case 1631585262:
                    i9 = i9;
                    if (iM55998 == (C0946.m55979(C0863.m55635(f82272, 453, 3, i10)) ^ 2124876459)) {
                        iM55979 = (C0946.m55979("ܶ᩷") ^ i4) * 81;
                        i = ((iM55979 ^ i5) * (-15785)) ^ 1906518416;
                        i2 = -1182771118;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ܳۚ")) * (-39);
                        i = ((iM55979 ^ i4) * (-3613)) ^ (-1066700321);
                        i2 = -1491062193;
                    }
                    int i1115 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i1115;
                    i6 = i;
                    break;
                case 685998939:
                case 1595759322:
                    i9 = i9;
                    if (runnable2 != null) {
                        iM55979 = (C0946.m55979("᩹ܰ") ^ i5) * 71;
                        i = ((iM55979 ^ i4) * (-13911)) ^ (-179031855);
                        i2 = -584297564;
                    } else {
                        iM55979 = (C0946.m55979("᩺᩸") ^ i4) * 69;
                        i = ((iM55979 ^ i5) * (-20047)) ^ 838299590;
                        i2 = -1350462218;
                    }
                    int i1116 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i1116;
                    i6 = i;
                    break;
                case 735749173:
                case 1617842894:
                    if (C1071.f81975 > 0) {
                        iM55680 = (C0946.m55979("ᩴۨ") ^ i4) * (-87);
                        i = ((iM55680 ^ i5) * (-12337)) ^ (-1565831039);
                        i3 = -2055673982;
                        i7 = iM55680 ^ i3;
                        i6 = i;
                    }
                    i9 = i9;
                    iM55979 = (i4 - C0873.m55680("ۚ᩶")) * 53;
                    i = ((iM55979 ^ i5) * (-15581)) ^ (-703950750);
                    i2 = -1080534861;
                    int i1117 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i1117;
                    i6 = i;
                    break;
                case 814538414:
                case 1143438298:
                    i9 = i9;
                    if (iM55998 == (C0873.m55680(C0912.m55822(f82272, 459, 3, i10)) ^ 2102705741)) {
                        iM55979 = (C0946.m55979("ܽ۠") ^ i4) * (-25);
                        i = ((iM55979 ^ i5) * (-209)) ^ 529865845;
                        i2 = 74418274;
                    } else {
                        iM55979 = (C0873.m55680("᩷۫") ^ i5) * 31;
                        i = ((iM55979 ^ i4) * (-28271)) ^ (-365349328);
                        i2 = -1407983697;
                    }
                    int i1118 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i1118;
                    i6 = i;
                    break;
                case 928095160:
                case 2126150591:
                    i9 = i9;
                    C1024.m56208(dialogInterfaceC2564);
                    iM55979 = C0873.m55680("ۨ֫") ^ i5;
                    i = ((iM55979 ^ i4) * (-22705)) ^ (-1331736620);
                    i2 = 345774676;
                    int i1119 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i1119;
                    i6 = i;
                    break;
                case 1011022453:
                case 1685045490:
                    i9 = i9;
                    C0917.m55847(dialogInterfaceC2564);
                    iM55979 = (C0946.m55979("۫ۜ") ^ i5) * 79;
                    i = ((iM55979 ^ i4) * (-21877)) ^ (-2060662957);
                    i2 = -1978017139;
                    int i11110 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i11110;
                    i6 = i;
                    break;
                case 1229166212:
                case 1473606017:
                    i9 = i9;
                    if (iM55998 == (C0873.m55680(C0894.m55773(f82272, 462, 3, i10)) ^ 2102132987)) {
                        iM55979 = C0873.m55680("᩻ۖ") ^ i4;
                        i = ((iM55979 ^ i5) * 31189) ^ 1618296885;
                        i2 = -1647636905;
                    } else {
                        iM55979 = C0873.m55680("ᩳ᩸") ^ i5;
                        i = ((iM55979 ^ i4) * 20015) ^ 706745331;
                        i2 = 201408238;
                    }
                    int i11111 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i11111;
                    i6 = i;
                    break;
                case 1589353166:
                case 1957345526:
                    RunnableC1014.m56177();
                    C0898.m55800();
                    return false;
                default:
                    i9 = i9;
                    int i21 = s + 5536;
                    if (i9 - (i21 * i21) >= 0) {
                        iM55979 = (C0946.m55979("ۙۤ") + i5) * (-11);
                        i = ((iM55979 ^ i4) * (-17805)) ^ 1385144141;
                        i2 = 852970779;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۙܺ")) * (-97);
                        i = ((iM55979 ^ i5) * 1985) ^ 561505646;
                        i2 = -1829344950;
                    }
                    int i11112 = iM55979 ^ i2;
                    i9 = i9;
                    i7 = i11112;
                    i6 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41885(String str, int i, C21265 c21265, String str2, InterfaceC1489 interfaceC1489) {
        int i2 = -196593502;
        int i3 = C1012.f81938;
        int i4 = C1017.f81942;
        int iM55680 = (C0873.m55680("ܳܿ") ^ i3) * 43;
        int i5 = ((iM55680 ^ i4) * 22251) ^ (-371400815);
        int i6 = 352098074;
        while (true) {
            i2 = ((((i2 ^ i4) * (-25269)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2124903779:
                case 1117899099:
                    C0882.m55710();
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0873.m55680("ۜۖ") + i3) * 41;
                        i5 = ((iM55680 ^ i4) * (-5929)) ^ 1231868606;
                        i6 = 1525738531;
                    } else {
                        iM55680 = C0946.m55979("ܺ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-14365)) ^ (-1123842112);
                        i6 = 1514547349;
                    }
                    break;
                case -1975634933:
                case 723179380:
                    if (C0930.m55885() <= 0) {
                        iM55680 = C0946.m55979("ܺ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-14365)) ^ (-1123842112);
                        i6 = 1514547349;
                    } else {
                        iM55680 = C0873.m55680("۠᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-30563)) ^ 491452231;
                        i6 = -1032616862;
                    }
                    break;
                case -1946165597:
                case -1400337671:
                    C1028.m56247();
                    break;
                case -1419804593:
                case 819829648:
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0873.m55680("᩷ۧ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM55680 ^ i4) * (-11253)) ^ 1128928847;
                        i6 = 576939515;
                    } else {
                        iM55680 = C0873.m55680("ܳ۫") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-8013)) ^ 350137920;
                        i6 = 57011150;
                    }
                    break;
                case -1296988982:
                case 717652562:
                    C0927.m55873();
                    if (!C0927.f81875) {
                        iM55680 = C0946.m55979("ܺ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-14365)) ^ (-1123842112);
                        i6 = 1514547349;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩷۬")) * (-103);
                        i5 = ((iM55680 ^ i4) * (-2721)) ^ 257812169;
                        i6 = -1488668538;
                    }
                    break;
                case -852299517:
                case 935792874:
                    C1929.m56553();
                    if (!RunnableC1014.m56177()) {
                        iM55680 = C0873.m55680("ۗܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 24357) ^ 1817970879;
                        i6 = -75541215;
                    } else {
                        iM55680 = (C0873.m55680("ۜۖ") + i3) * 41;
                        i5 = ((iM55680 ^ i4) * (-5929)) ^ 1231868606;
                        i6 = 1525738531;
                    }
                    break;
                case -757333604:
                case 1765898130:
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("ۗܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 24357) ^ 1817970879;
                        i6 = -75541215;
                    } else {
                        iM55680 = C0946.m55979("ۜ۠") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-2513)) ^ (-1408030764);
                        i6 = -514223522;
                    }
                    break;
                case -753873218:
                case 1824606915:
                    f54943.put(str, new C13039(str, i, c21265, str2, interfaceC1489));
                    break;
                case -158469974:
                case 1790595916:
                    if (C0947.m55997()) {
                        iM55680 = (C0873.m55680("᩷ۧ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM55680 ^ i4) * (-11253)) ^ 1128928847;
                        i6 = 576939515;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֡ܶ")) * 27;
                        i5 = ((iM55680 ^ i4) * 18297) ^ (-692821266);
                        i6 = 1976777186;
                    }
                    break;
                case 302804520:
                case 906738614:
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ܺ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-14365)) ^ (-1123842112);
                        i6 = 1514547349;
                    } else {
                        iM55680 = (C0873.m55680("ܿۙ") ^ i3) * (-87);
                        i5 = ((iM55680 ^ i4) * 4569) ^ 1461324861;
                        i6 = 386482746;
                    }
                    break;
                case 372922393:
                case 660961298:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0873.m55680("ۗܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 24357) ^ 1817970879;
                        i6 = -75541215;
                    } else {
                        iM55680 = C0873.m55680("ۨ᩵") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-32445)) ^ 388282131;
                        i6 = -1011510545;
                    }
                    break;
                case 637042467:
                case 2003251409:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("ۜۖ") + i3) * 41;
                        i5 = ((iM55680 ^ i4) * (-5929)) ^ 1231868606;
                        i6 = 1525738531;
                    } else {
                        iM55680 = (C0873.m55680("᩺ۘ") ^ i4) * (-73);
                        i5 = ((iM55680 ^ i3) * 5347) ^ 1294126474;
                        i6 = 1532774336;
                    }
                    break;
                case 1275451164:
                case 1414337266:
                    if (C1964.m56597() != 0) {
                        iM55680 = (i3 - C0946.m55979("᩷۬")) * (-103);
                        i5 = ((iM55680 ^ i4) * (-2721)) ^ 257812169;
                        i6 = -1488668538;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩷") ^ i4) * (-93);
                        i5 = ((iM55680 ^ i3) * 25355) ^ 107382601;
                        i6 = -464575938;
                    }
                    break;
                case 1455759885:
                case 1660764696:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("ۗܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 24357) ^ 1817970879;
                        i6 = -75541215;
                    } else {
                        iM55680 = (C0873.m55680("ۧ֫") ^ i4) * (-75);
                        i5 = ((iM55680 ^ i3) * 7653) ^ 608669113;
                        i6 = -1102043434;
                    }
                    break;
                case 1560750597:
                case 2122800502:
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0873.m55680("ۜۖ") + i3) * 41;
                        i5 = ((iM55680 ^ i4) * (-5929)) ^ 1231868606;
                        i6 = 1525738531;
                    } else {
                        iM55680 = C0946.m55979("ۖۘ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-12499)) ^ 1262052651;
                        i6 = -1557210637;
                    }
                    break;
                default:
                    ServiceConnectionC1013.m56157();
                    C0937.m55918();
                    iM55680 = C0946.m55979("ܺ᩶") ^ i4;
                    i5 = ((iM55680 ^ i3) * (-14365)) ^ (-1123842112);
                    i6 = 1514547349;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C9745 m41906() {
        HashSet hashSet = null;
        LinkedHashMap linkedHashMap = null;
        Iterator itM56593 = null;
        C13039 c13039 = null;
        int i = -1921847286;
        int i2 = C0930.f81879;
        int i3 = C0906.f81862;
        int iM55680 = (C0873.m55680("ܿܶ") + i3) * 63;
        int i4 = ((iM55680 ^ i2) * 26727) ^ 1161228223;
        int i5 = -1925339970;
        while (true) {
            i = ((((i ^ i2) * (-6229)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2114991521:
                case -1687275302:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0873.m55680("ۛᩳ") + i3) * (-119);
                        i4 = ((iM55680 ^ i2) * (-25461)) ^ 963876777;
                        i5 = -1487225321;
                    } else {
                        iM55680 = C0946.m55979("۫ۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14277) ^ 561660986;
                        i5 = -763791370;
                    }
                    break;
                case -2044821046:
                case 98468524:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22787) ^ 809636737;
                        i5 = -607513744;
                    } else {
                        iM55680 = C0873.m55680("ܰ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 11647) ^ 454482768;
                        i5 = 936000947;
                    }
                    break;
                case -1956388995:
                case -1519030322:
                    if (C0930.m55886(itM56593)) {
                        iM55680 = (C0946.m55979("᩺᩻") ^ i2) * 7;
                        i4 = ((iM55680 ^ i3) * (-19141)) ^ (-439949083);
                        i5 = 1812094594;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܳۧ")) * (-121);
                        i4 = ((iM55680 ^ i2) * (-14421)) ^ 99084704;
                        i5 = -1274036516;
                    }
                    break;
                case -1822194475:
                case 504392935:
                    if (C1012.f81938 < 0) {
                        iM55680 = (C0873.m55680("ۛᩳ") + i3) * (-119);
                        i4 = ((iM55680 ^ i2) * (-25461)) ^ 963876777;
                        i5 = -1487225321;
                    } else {
                        iM55680 = C0873.m55680("ܰ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 11647) ^ 454482768;
                        i5 = 936000947;
                    }
                    break;
                case -1715957912:
                case -681860152:
                    if (C1194.m56396() <= 0) {
                        iM55680 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28485)) ^ (-1434225742);
                        i5 = 1448736902;
                    } else {
                        iM55680 = C0873.m55680("᩸֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17063)) ^ (-564675086);
                        i5 = -59323084;
                    }
                    break;
                case -1644773643:
                case -112216145:
                    linkedHashMap = f54943;
                    if (C1053.m56327() >= 0) {
                        iM55680 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28485)) ^ (-1434225742);
                        i5 = 1448736902;
                    } else {
                        iM55680 = C0946.m55979("᩶ܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-23503)) ^ 1132665174;
                        i5 = -14952922;
                    }
                    break;
                case -1637857600:
                case -1047362873:
                    hashSet = new HashSet();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22787) ^ 809636737;
                        i5 = -607513744;
                    } else {
                        iM55680 = C0873.m55680("ܳܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 24735) ^ (-2086819646);
                        i5 = 1822666279;
                    }
                    break;
                case -1242951423:
                case 1047914324:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = (C0873.m55680("ۛᩳ") + i3) * (-119);
                        i4 = ((iM55680 ^ i2) * (-25461)) ^ 963876777;
                        i5 = -1487225321;
                    } else {
                        iM55680 = C0873.m55680("᩹᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9643)) ^ (-1207415028);
                        i5 = 2018532034;
                    }
                    break;
                case -1038486481:
                case -1012138389:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22787) ^ 809636737;
                        i5 = -607513744;
                    } else {
                        iM55680 = (C0946.m55979("ܶۗ") ^ i2) * (-21);
                        i4 = ((iM55680 ^ i3) * 4961) ^ 817146531;
                        i5 = -1617301092;
                    }
                    break;
                case -981614513:
                case 1958895394:
                    C1964.m56597();
                    C0894.m55769();
                    iM55680 = C0873.m55680("ܰ֫") ^ i2;
                    i4 = ((iM55680 ^ i3) * 11647) ^ 454482768;
                    i5 = 936000947;
                    break;
                case -896430988:
                case 1628015119:
                    ServiceConnectionC1013.m56151(hashSet, c13039.f36664);
                    iM55680 = C0873.m55680("ܿ᩻") ^ i2;
                    i4 = ((iM55680 ^ i3) * 32713) ^ (-1771744710);
                    i5 = -1949764316;
                    break;
                case -821181429:
                case 415272235:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("ۛᩳ") + i3) * (-119);
                        i4 = ((iM55680 ^ i2) * (-25461)) ^ 963876777;
                        i5 = -1487225321;
                    } else {
                        iM55680 = C0873.m55680("ۛܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-2497)) ^ (-1937229922);
                        i5 = -1367402949;
                    }
                    break;
                case -758606094:
                case 885824357:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22787) ^ 809636737;
                        i5 = -607513744;
                    } else {
                        iM55680 = C0873.m55680("֡ۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 32215) ^ 1472129181;
                        i5 = 914184587;
                    }
                    break;
                case -624312074:
                case -112093314:
                    if (C0947.f81895) {
                        iM55680 = (i2 - C0873.m55680("ۡۚ")) * (-39);
                        i4 = ((iM55680 ^ i3) * 3457) ^ (-163136948);
                        i5 = -11012174;
                    } else {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22787) ^ 809636737;
                        i5 = -607513744;
                    }
                    break;
                case -247391235:
                case 564555456:
                    return C9745.m22781(m41894(), hashSet, f54941);
                case -54211751:
                case 1747844343:
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28485)) ^ (-1434225742);
                        i5 = 1448736902;
                    } else {
                        iM55680 = C0873.m55680("ۧ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 17019) ^ (-1704305738);
                        i5 = 855561223;
                    }
                    break;
                case 24607663:
                case 1424847919:
                    if (C1048.f81963) {
                        iM55680 = C0873.m55680("ܰ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 8405) ^ (-2003776929);
                        i5 = 786930139;
                    } else {
                        iM55680 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28485)) ^ (-1434225742);
                        i5 = 1448736902;
                    }
                    break;
                case 427276350:
                case 815377972:
                    C1053.m56327();
                    return null;
                case 724638083:
                case 954120136:
                    c13039 = (C13039) C0955.m56035(itM56593);
                    if (c13039.m29856()) {
                        iM55680 = C0873.m55680("ܽ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17523)) ^ 824765160;
                        i5 = -838739098;
                    } else {
                        iM55680 = C0873.m55680("ܿ᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 32713) ^ (-1771744710);
                        i5 = -1949764316;
                    }
                    break;
                default:
                    itM56593 = C1964.m56593(linkedHashMap.values());
                    iM55680 = C0873.m55680("ܿ᩻") ^ i2;
                    i4 = ((iM55680 ^ i3) * 32713) ^ (-1771744710);
                    i5 = -1949764316;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0166 A[PHI: r11
      0x0166: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v2 java.lang.String), (r11v2 java.lang.String) binds: [B:37:0x014c, B:29:0x00f8, B:23:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x03cc A[PHI: r3 r16 r17 r18 r24 r28
      0x03cc: PHI (r3v60 java.lang.String) = (r3v47 java.lang.String), (r3v48 java.lang.String), (r3v49 java.lang.String), (r3v63 java.lang.String) binds: [B:84:0x03ca, B:80:0x03a5, B:76:0x037c, B:11:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x03cc: PHI (r16v5 short) = (r16v3 short), (r16v2 short), (r16v2 short), (r16v2 short) binds: [B:84:0x03ca, B:80:0x03a5, B:76:0x037c, B:11:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x03cc: PHI (r17v5 int) = (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:84:0x03ca, B:80:0x03a5, B:76:0x037c, B:11:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x03cc: PHI (r18v5 int) = (r18v2 int), (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:84:0x03ca, B:80:0x03a5, B:76:0x037c, B:11:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x03cc: PHI (r24v28 java.util.ArrayList) = (r24v14 java.util.ArrayList), (r24v15 java.util.ArrayList), (r24v16 java.util.ArrayList), (r24v35 java.util.ArrayList) binds: [B:84:0x03ca, B:80:0x03a5, B:76:0x037c, B:11:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x03cc: PHI (r28v50 l.۫ۤۡ) = (r28v35 l.۫ۤۡ), (r28v36 l.۫ۤۡ), (r28v37 l.۫ۤۡ), (r28v55 l.۫ۤۡ) binds: [B:84:0x03ca, B:80:0x03a5, B:76:0x037c, B:11:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b1, code lost:
    
        if (p067l.C1964.f83032 > 0) goto L18;
     */
    /* JADX INFO: renamed from: ۜ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m41894() {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        InterfaceC14100 interfaceC14100;
        String str;
        InterfaceC14100 interfaceC14101;
        int i5 = C1964.f83032;
        int i6 = C1053.f81965;
        int iM55682 = (C0873.m55680("֡ܰ") + i5) * C0254q.f1218h;
        int i7 = ((iM55682 ^ i6) * (-23163)) ^ (-346352721);
        InterfaceC14100 interfaceC14102 = null;
        String strM56252 = null;
        String[] strArr = null;
        LinkedHashMap linkedHashMap = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM55682 ^ (-1320745729);
        ArrayList arrayList = null;
        int i9 = 0;
        int length = 0;
        int i10 = 0;
        int i11 = 0;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = -1146085068;
        String strM55734 = null;
        short[] sArr3 = null;
        Object obj = null;
        String str2 = null;
        String str3 = null;
        Iterator itM56139 = null;
        int i16 = 0;
        while (true) {
            i15 = i8 ^ (i7 & (((i15 ^ i6) * (-16879)) >> 31));
            switch (i15) {
                case -2067858244:
                case 604929500:
                    String str4 = strM56252;
                    arrayList = new ArrayList();
                    interfaceC14102 = ApplicationC21448.f67649;
                    if (C0947.f81895) {
                        strM56252 = str4;
                        iM55680 = (C0873.m55680("ܶܺ") ^ i6) * (-109);
                        i = ((iM55680 ^ i5) * (-29937)) ^ 1430336686;
                        i2 = -163290072;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    } else {
                        int iM55979 = (C0946.m55979("ۡܽ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        strM56252 = str4;
                        i8 = iM55979 ^ 215392518;
                        i7 = ((iM55979 ^ i6) * 13943) ^ 62310979;
                        arrayList = arrayList;
                    }
                    break;
                case -2043728572:
                case 1739272788:
                    i9 = 2;
                    if (C1025.f81947 < 0) {
                        iM55680 = (C0873.m55680("ۧ۬") ^ i5) * 65;
                        i = ((iM55680 ^ i6) * (-2005)) ^ (-48402204);
                        i2 = 1892628694;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    } else {
                        interfaceC14100 = interfaceC14102;
                        str = strM56252;
                        int iM55683 = C0873.m55680("۠᩻") ^ i5;
                        InterfaceC14100 interfaceC14103 = interfaceC14100;
                        i7 = ((iM55683 ^ i6) * 3381) ^ (-2120329935);
                        strM56252 = str;
                        interfaceC14101 = interfaceC14103;
                        i8 = iM55683 ^ (-1885198664);
                        interfaceC14102 = interfaceC14101;
                    }
                    break;
                case -2016268422:
                case -49043184:
                    if (C0894.m55758(arrayList, str3)) {
                        iM55680 = (i5 - C0873.m55680("۟ۡ")) * (-107);
                        i = ((iM55680 ^ i6) * (-15103)) ^ (-1378847555);
                        i2 = 1748650227;
                    } else {
                        iM55680 = C0873.m55680("ۡ᩶") ^ i5;
                        i = ((iM55680 ^ i6) * 30877) ^ (-2091608413);
                        i2 = -206279672;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1954704944:
                case -1652213528:
                    C1194.m56393(arrayList, str2);
                    iM55680 = (i6 - C0946.m55979("ܽܺ")) * (-29);
                    i = ((iM55680 ^ i5) * 32207) ^ 1818164557;
                    i2 = 494676588;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1899908501:
                case 1832016727:
                    if (C1017.f81942 >= 0) {
                        interfaceC14102 = interfaceC14102;
                        strM56252 = strM56252;
                        arrayList = arrayList;
                        iM55681 = (i6 - C0946.m55979("᩶ۤ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM55681 ^ i5) * 24001) ^ 1153691617;
                        i4 = 2066061674;
                        int i17 = iM55681 ^ i4;
                        strM56252 = strM56252;
                        interfaceC14101 = interfaceC14102;
                        i8 = i17;
                        i7 = i3;
                        arrayList = arrayList;
                        interfaceC14102 = interfaceC14101;
                    }
                    interfaceC14100 = interfaceC14102;
                    str = strM56252;
                    int iM55684 = C0873.m55680("۠᩻") ^ i5;
                    InterfaceC14100 interfaceC14104 = interfaceC14100;
                    i7 = ((iM55684 ^ i6) * 3381) ^ (-2120329935);
                    strM56252 = str;
                    interfaceC14101 = interfaceC14104;
                    i8 = iM55684 ^ (-1885198664);
                    interfaceC14102 = interfaceC14101;
                    break;
                case -1753130456:
                case 849727144:
                    C1044.m56286();
                    break;
                case -1671345085:
                case -841302715:
                    interfaceC14102 = interfaceC14102;
                    strM56252 = strM56252;
                    arrayList = arrayList;
                    int i18 = s2 + s;
                    i12 = i18 * i18;
                    if (C1017.m56187() <= 0) {
                        iM55681 = C0873.m55680("ۛۘ") ^ i5;
                        i3 = ((iM55681 ^ i6) * (-3955)) ^ 344178594;
                        i4 = 1490126569;
                    } else {
                        iM55681 = (i6 - C0946.m55979("ܽ᩹")) * (-97);
                        i3 = ((iM55681 ^ i5) * 7639) ^ 1115176255;
                        i4 = -120174900;
                    }
                    int i19 = iM55681 ^ i4;
                    strM56252 = strM56252;
                    interfaceC14101 = interfaceC14102;
                    i8 = i19;
                    i7 = i3;
                    arrayList = arrayList;
                    interfaceC14102 = interfaceC14101;
                    break;
                case -1627958078:
                case 1769803788:
                    str3 = strArr[i16];
                    if (linkedHashMap.containsKey(str3)) {
                        iM55680 = (C0873.m55680("ܽ᩻") + i6) * (-117);
                        i = ((iM55680 ^ i5) * (-21659)) ^ 300463087;
                        i2 = -327344046;
                    } else {
                        iM55680 = (i5 - C0873.m55680("۟ۡ")) * (-107);
                        i = ((iM55680 ^ i6) * (-15103)) ^ (-1378847555);
                        i2 = 1748650227;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1626691131:
                case -1118021772:
                    C0930.m55885();
                    return null;
                case -1576823831:
                case 1877125776:
                    interfaceC14100 = interfaceC14102;
                    str = strM56252;
                    strM55734 = C0890.m55734(interfaceC14100, str, obj);
                    sArr2 = f82272;
                    if (C1024.m56209() >= 0) {
                        i11 = 476;
                        int iM55685 = C0873.m55680("۠᩻") ^ i5;
                        InterfaceC14100 interfaceC14105 = interfaceC14100;
                        i7 = ((iM55685 ^ i6) * 3381) ^ (-2120329935);
                        strM56252 = str;
                        interfaceC14101 = interfaceC14105;
                        i8 = iM55685 ^ (-1885198664);
                        interfaceC14102 = interfaceC14101;
                    } else {
                        int iM559710 = (C0946.m55979("ۙܳ") ^ i5) * (-53);
                        strM56252 = str;
                        interfaceC14102 = interfaceC14100;
                        i8 = iM559710 ^ 1375482391;
                        i7 = ((iM559710 ^ i6) * 23597) ^ (-1773873009);
                        i11 = 476;
                    }
                    break;
                case -1554142403:
                case -1254535014:
                    return arrayList;
                case -1546366050:
                case 215333165:
                    if (C0930.m55886(itM56139)) {
                        iM55680 = C0946.m55979("ᩴۖ") ^ i6;
                        i = ((iM55680 ^ i5) * (-28185)) ^ (-901685347);
                        i2 = -1723767347;
                    } else {
                        iM55680 = C0873.m55680("۫ܽ") ^ i5;
                        i = ((iM55680 ^ i6) * (-28539)) ^ (-121572486);
                        i2 = -2133161013;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1529326282:
                case -456870444:
                    interfaceC14102 = interfaceC14102;
                    strM56252 = strM56252;
                    arrayList = arrayList;
                    if (i12 - (i13 + i13) <= 0) {
                        iM55681 = C0946.m55979("ۗ᩵") ^ i5;
                        i3 = ((iM55681 ^ i6) * 26273) ^ 1321029467;
                        i4 = 894364246;
                    } else {
                        iM55681 = C0873.m55680("ۛܰ") ^ i6;
                        i3 = ((iM55681 ^ i5) * 29953) ^ (-1116242590);
                        i4 = 1808161765;
                    }
                    int i110 = iM55681 ^ i4;
                    strM56252 = strM56252;
                    interfaceC14101 = interfaceC14102;
                    i8 = i110;
                    i7 = i3;
                    arrayList = arrayList;
                    interfaceC14102 = interfaceC14101;
                    break;
                case -1390512633:
                case 1691711845:
                    str2 = (String) C0955.m56035(itM56139);
                    if (C0894.m55758(arrayList, str2)) {
                        iM55680 = (i6 - C0946.m55979("ܽܺ")) * (-29);
                        i = ((iM55680 ^ i5) * 32207) ^ 1818164557;
                        i2 = 494676588;
                    } else {
                        iM55680 = (C0873.m55680("ܰܰ") + i6) * 41;
                        i = ((iM55680 ^ i5) * 21849) ^ (-1362746517);
                        i2 = -10332800;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1373144336:
                case -512485451:
                    interfaceC14102 = interfaceC14102;
                    strM56252 = strM56252;
                    arrayList = arrayList;
                    sArr3 = f82272;
                    c = 465;
                    if (C0906.m55809() <= 0) {
                        iM55681 = (i6 - C0946.m55979("᩶ۤ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM55681 ^ i5) * 24001) ^ 1153691617;
                        i4 = 2066061674;
                    } else {
                        iM55681 = (C0873.m55680("֫ۢ") + i6) * (-49);
                        i3 = ((iM55681 ^ i5) * (-15051)) ^ (-850805188);
                        i4 = 1241832252;
                    }
                    int i111 = iM55681 ^ i4;
                    strM56252 = strM56252;
                    interfaceC14101 = interfaceC14102;
                    i8 = i111;
                    i7 = i3;
                    arrayList = arrayList;
                    interfaceC14102 = interfaceC14101;
                    break;
                case -1338116275:
                case -1120967861:
                    interfaceC14102 = interfaceC14102;
                    strM56252 = strM56252;
                    arrayList = arrayList;
                    s2 = sArr3[c];
                    if (C0863.m55643()) {
                        iM55681 = C0946.m55979("ۘۖ") ^ i5;
                        i3 = ((iM55681 ^ i6) * 6071) ^ (-1127423012);
                        i4 = -2103671236;
                    } else {
                        iM55681 = C0873.m55680("᩸ܰ") ^ i5;
                        i3 = ((iM55681 ^ i6) * 22067) ^ (-1526707624);
                        i4 = -1427467106;
                    }
                    int i112 = iM55681 ^ i4;
                    strM56252 = strM56252;
                    interfaceC14101 = interfaceC14102;
                    i8 = i112;
                    i7 = i3;
                    arrayList = arrayList;
                    interfaceC14102 = interfaceC14101;
                    break;
                case -1311306053:
                case -967342754:
                    C1194.m56393(arrayList, str3);
                    iM55680 = (i5 - C0873.m55680("۟ۡ")) * (-107);
                    i = ((iM55680 ^ i6) * (-15103)) ^ (-1378847555);
                    i2 = 1748650227;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -1216390623:
                case 1962127902:
                    interfaceC14102 = interfaceC14102;
                    strM56252 = strM56252;
                    arrayList = arrayList;
                    s = 2133;
                    if (C0866.f81837 >= 0) {
                        iM55681 = C0873.m55680("ۛۘ") ^ i5;
                        i3 = ((iM55681 ^ i6) * (-3955)) ^ 344178594;
                        i4 = 1490126569;
                    } else {
                        iM55681 = (C0873.m55680("᩺֫") ^ i5) * (-69);
                        i3 = ((iM55681 ^ i6) * (-6731)) ^ 1036812896;
                        i4 = -420552475;
                    }
                    int i113 = iM55681 ^ i4;
                    strM56252 = strM56252;
                    interfaceC14101 = interfaceC14102;
                    i8 = i113;
                    i7 = i3;
                    arrayList = arrayList;
                    interfaceC14102 = interfaceC14101;
                    break;
                case -1170092096:
                case 581532257:
                    C0845.m55584();
                    interfaceC14102 = interfaceC14102;
                    strM56252 = strM56252;
                    arrayList = arrayList;
                    iM55681 = C0873.m55680("᩸ܰ") ^ i5;
                    i3 = ((iM55681 ^ i6) * 22067) ^ (-1526707624);
                    i4 = -1427467106;
                    int i114 = iM55681 ^ i4;
                    strM56252 = strM56252;
                    interfaceC14101 = interfaceC14102;
                    i8 = i114;
                    i7 = i3;
                    arrayList = arrayList;
                    interfaceC14102 = interfaceC14101;
                    break;
                case -911365546:
                case -777702408:
                    interfaceC14102 = interfaceC14102;
                    strM56252 = strM56252;
                    arrayList = arrayList;
                    i13 = (s2 * s2) + 4549689;
                    if (C1229.f82066 >= 0) {
                        iM55681 = C0873.m55680("ۛۘ") ^ i5;
                        i3 = ((iM55681 ^ i6) * (-3955)) ^ 344178594;
                        i4 = 1490126569;
                    } else {
                        iM55681 = (C0946.m55979("۫۫") + i6) * 33;
                        i3 = ((iM55681 ^ i5) * 16499) ^ (-2144455693);
                        i4 = 455443134;
                    }
                    int i115 = iM55681 ^ i4;
                    strM56252 = strM56252;
                    interfaceC14101 = interfaceC14102;
                    i8 = i115;
                    i7 = i3;
                    arrayList = arrayList;
                    interfaceC14102 = interfaceC14101;
                    break;
                case -824787643:
                case 11338443:
                    i10 = 27140;
                    iM55681 = (i5 - C0946.m55979("ۨ᩺")) * (-123);
                    i3 = ((iM55681 ^ i6) * (-24131)) ^ (-466665111);
                    i4 = 944847561;
                    int i116 = iM55681 ^ i4;
                    strM56252 = strM56252;
                    interfaceC14101 = interfaceC14102;
                    i8 = i116;
                    i7 = i3;
                    arrayList = arrayList;
                    interfaceC14102 = interfaceC14101;
                    break;
                case -569023664:
                case -470302578:
                    String[] strArrM55948 = ViewOnClickListenerC0939.m55948(strM55734, C0949.m56016(sArr2, i11, i9, i10));
                    strArr = strArrM55948;
                    length = strArrM55948.length;
                    i16 = 0;
                    iM55680 = (i6 - C0946.m55979("᩹᩸")) * 11;
                    i = ((iM55680 ^ i5) * (-13739)) ^ (-429560487);
                    i2 = 1074669370;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case -246121205:
                case 1111432364:
                    if (C1044.f81959 >= 0) {
                        interfaceC14102 = interfaceC14102;
                        strM56252 = strM56252;
                        arrayList = arrayList;
                        iM55681 = C0873.m55680("ۛۘ") ^ i5;
                        i3 = ((iM55681 ^ i6) * (-3955)) ^ 344178594;
                        i4 = 1490126569;
                        int i117 = iM55681 ^ i4;
                        strM56252 = strM56252;
                        interfaceC14101 = interfaceC14102;
                        i8 = i117;
                        i7 = i3;
                        arrayList = arrayList;
                        interfaceC14102 = interfaceC14101;
                    }
                    interfaceC14100 = interfaceC14102;
                    str = strM56252;
                    int iM55686 = C0873.m55680("۠᩻") ^ i5;
                    InterfaceC14100 interfaceC14106 = interfaceC14100;
                    i7 = ((iM55686 ^ i6) * 3381) ^ (-2120329935);
                    strM56252 = str;
                    interfaceC14101 = interfaceC14106;
                    i8 = iM55686 ^ (-1885198664);
                    interfaceC14102 = interfaceC14101;
                    break;
                case 306335334:
                case 1219598950:
                    i16++;
                    iM55680 = (i6 - C0946.m55979("᩹᩸")) * 11;
                    i = ((iM55680 ^ i5) * (-13739)) ^ (-429560487);
                    i2 = 1074669370;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case 357811739:
                case 379718193:
                    interfaceC14102 = interfaceC14102;
                    strM56252 = strM56252;
                    sArr = f82272;
                    i14 = 466;
                    if (!C0949.m56012()) {
                        iM55681 = C0873.m55680("ܿۨ") ^ i6;
                        arrayList = arrayList;
                        i3 = ((iM55681 ^ i5) * 8565) ^ (-830926540);
                        i4 = -1914070325;
                        int i118 = iM55681 ^ i4;
                        strM56252 = strM56252;
                        interfaceC14101 = interfaceC14102;
                        i8 = i118;
                        i7 = i3;
                        arrayList = arrayList;
                        interfaceC14102 = interfaceC14101;
                    } else {
                        strM56252 = strM56252;
                        interfaceC14102 = interfaceC14102;
                        iM55680 = (C0873.m55680("ܶܺ") ^ i6) * (-109);
                        i = ((iM55680 ^ i5) * (-29937)) ^ 1430336686;
                        i2 = -163290072;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    }
                    break;
                case 479194508:
                case 1093093292:
                    itM56139 = C1012.m56139(linkedHashMap.keySet());
                    iM55680 = (i6 - C0946.m55979("ܽܺ")) * (-29);
                    i = ((iM55680 ^ i5) * 32207) ^ 1818164557;
                    i2 = 494676588;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case 1572238976:
                case 2145352025:
                    linkedHashMap = f54943;
                    if (i16 < length) {
                        iM55680 = C0946.m55979("ܺۛ") ^ i6;
                        i = ((iM55680 ^ i5) * (-25729)) ^ (-1001554664);
                        i2 = -1431594229;
                    } else {
                        iM55680 = C0946.m55979("᩸᩷") ^ i5;
                        i = ((iM55680 ^ i6) * 2713) ^ 952797748;
                        i2 = 695182736;
                    }
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    break;
                case 1586519652:
                case 1603971448:
                    i10 = 21576;
                    iM55681 = (i5 - C0946.m55979("ۨ᩺")) * (-123);
                    i3 = ((iM55681 ^ i6) * (-24131)) ^ (-466665111);
                    i4 = 944847561;
                    int i119 = iM55681 ^ i4;
                    strM56252 = strM56252;
                    interfaceC14101 = interfaceC14102;
                    i8 = i119;
                    i7 = i3;
                    arrayList = arrayList;
                    interfaceC14102 = interfaceC14101;
                    break;
                default:
                    InterfaceC14100 interfaceC14107 = interfaceC14102;
                    short[] sArr4 = sArr;
                    int i20 = i14;
                    strM56252 = C1036.m56252(sArr4, i20, 10, i10);
                    if (C0866.f81837 >= 0) {
                        sArr = sArr4;
                        i14 = i20;
                        interfaceC14102 = interfaceC14107;
                        obj = "";
                        iM55680 = (C0873.m55680("ܶܺ") ^ i6) * (-109);
                        i = ((iM55680 ^ i5) * (-29937)) ^ 1430336686;
                        i2 = -163290072;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    } else {
                        int iM559711 = (C0946.m55979("۬֨") ^ i6) * (-71);
                        i7 = ((iM559711 ^ i5) * 26535) ^ (-127863816);
                        interfaceC14102 = interfaceC14107;
                        i8 = iM559711 ^ (-667183971);
                        sArr = sArr4;
                        i14 = i20;
                        obj = "";
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public static void m41896() {
        m41901();
        m41905();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0182 A[PHI: r4 r14
      0x0182: PHI (r4v4 java.util.HashSet) = (r4v3 java.util.HashSet), (r4v2 java.util.HashSet), (r4v2 java.util.HashSet) binds: [B:41:0x0180, B:13:0x0097, B:9:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:41:0x0180, B:13:0x0097, B:9:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02d9 A[PHI: r2 r11 r12 r15 r19 r21 r25
      0x02d9: PHI (r2v3 l.۫ۤۡ) = (r2v2 l.۫ۤۡ), (r2v2 l.۫ۤۡ), (r2v6 l.۫ۤۡ) binds: [B:18:0x00a4, B:70:0x02d7, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r11v22 short[]) = (r11v13 short[]), (r11v17 short[]), (r11v24 short[]) binds: [B:18:0x00a4, B:70:0x02d7, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r12v5 int) = (r12v4 int), (r12v2 int), (r12v2 int) binds: [B:18:0x00a4, B:70:0x02d7, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r15v5 int) = (r15v4 int), (r15v2 int), (r15v2 int) binds: [B:18:0x00a4, B:70:0x02d7, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:18:0x00a4, B:70:0x02d7, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r21v4 short) = (r21v2 short), (r21v3 short), (r21v2 short) binds: [B:18:0x00a4, B:70:0x02d7, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r25v19 java.util.HashSet) = (r25v9 java.util.HashSet), (r25v14 java.util.HashSet), (r25v23 java.util.HashSet) binds: [B:18:0x00a4, B:70:0x02d7, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܺ */
    public static void m41901() {
        int iM55979;
        int i;
        int i2;
        int i3;
        int iM55680;
        int i4;
        int i5;
        String strM55734;
        int i6 = C1404.f82149;
        int i7 = C1003.f81929;
        int iM559710 = (C0946.m55979("᩻ܳ") ^ i7) * (-7);
        int i8 = ((iM559710 ^ i6) * (-22285)) ^ 1584695864;
        String[] strArr = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM559710 ^ 904859696;
        int length = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        short s2 = 0;
        int i16 = -1453749426;
        String str = null;
        short[] sArr3 = null;
        HashSet hashSet = null;
        String str2 = null;
        int i17 = 0;
        String strM56558 = null;
        InterfaceC14100 interfaceC14100 = null;
        HashSet hashSet2 = null;
        while (true) {
            i16 = i9 ^ (i8 & (((i16 ^ i6) * (-12467)) >> 31));
            switch (i16) {
                case -2130148769:
                case 593843378:
                    hashSet2 = hashSet2;
                    sArr = f82272;
                    i12 = 542;
                    if (!RunnableC0897.f81856) {
                        hashSet2 = hashSet2;
                        iM55680 = C0946.m55979("ۗ֫") ^ i6;
                        i4 = ((iM55680 ^ i7) * (-17775)) ^ (-1893408855);
                        i5 = 9471088;
                        i9 = iM55680 ^ i5;
                        i8 = i4;
                    } else {
                        int iM55681 = C0873.m55680("᩵ܽ") ^ i7;
                        i = ((iM55681 ^ i6) * 8739) ^ (-1381703828);
                        i3 = iM55681 ^ 498773864;
                        HashSet hashSet3 = hashSet2;
                        i9 = i3;
                        i8 = i;
                        hashSet2 = hashSet3;
                    }
                    break;
                case -1995438819:
                case -775986096:
                    i17++;
                    iM55680 = C0873.m55680("۟ۢ") ^ i7;
                    i4 = ((iM55680 ^ i6) * 24869) ^ 2100644251;
                    i5 = -1300490107;
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                case -1956345388:
                case 1402199990:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    short s3 = s;
                    int i18 = s3 + 4106;
                    if (C1044.f81959 >= 0) {
                        s = s3;
                        i14 = i18;
                        iM55979 = C0873.m55680("ܿۖ") ^ i6;
                        i = ((iM55979 ^ i7) * (-32139)) ^ (-1494198336);
                        i2 = 485271536;
                        i3 = iM55979 ^ i2;
                        sArr = sArr;
                        HashSet hashSet4 = hashSet2;
                        i9 = i3;
                        i8 = i;
                        hashSet2 = hashSet4;
                    } else {
                        int iM559711 = (C0946.m55979("۠ۨ") + i6) * 71;
                        s = s3;
                        i8 = ((iM559711 ^ i7) * 30055) ^ (-592756534);
                        int i19 = iM559711 ^ 1979077434;
                        sArr = sArr;
                        i14 = i18;
                        hashSet2 = hashSet2;
                        i9 = i19;
                    }
                    break;
                case -1951536268:
                case 1812329348:
                    i10 = 34617;
                    iM55979 = (C0873.m55680("᩶ܳ") + i6) * (-29);
                    i = ((iM55979 ^ i7) * (-987)) ^ 677077112;
                    i2 = -62224503;
                    i3 = iM55979 ^ i2;
                    sArr = sArr;
                    HashSet hashSet5 = hashSet2;
                    i9 = i3;
                    i8 = i;
                    hashSet2 = hashSet5;
                    break;
                case -1878680818:
                case -1498351642:
                    if (i17 < length) {
                        iM55680 = (i6 - C0873.m55680("ۡۤ")) * 93;
                        i4 = ((iM55680 ^ i7) * (-26041)) ^ 1032410418;
                        i5 = -435819496;
                    } else {
                        iM55680 = (i7 - C0946.m55979("᩵۫")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55680 ^ i6) * (-19349)) ^ 1542886517;
                        i5 = -2130199819;
                    }
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                case -1798088119:
                case 186235746:
                    RunnableC0871.m55672();
                    if (C1017.f81942 < 0) {
                        hashSet2 = hashSet2;
                        sArr = sArr;
                        iM55979 = (i7 - C0873.m55680("ۢ᩻")) * (-53);
                        i = ((iM55979 ^ i6) * (-19993)) ^ (-1849924217);
                        i2 = 1996306516;
                        i3 = iM55979 ^ i2;
                        sArr = sArr;
                        HashSet hashSet6 = hashSet2;
                        i9 = i3;
                        i8 = i;
                        hashSet2 = hashSet6;
                    } else {
                        iM55680 = C0946.m55979("ۗ֫") ^ i6;
                        i4 = ((iM55680 ^ i7) * (-17775)) ^ (-1893408855);
                        i5 = 9471088;
                        i9 = iM55680 ^ i5;
                        i8 = i4;
                    }
                    break;
                case -1635065731:
                case -1147935133:
                    hashSet = new HashSet();
                    sArr2 = f82272;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("ܰ۫") ^ i7;
                        i4 = ((iM55680 ^ i6) * (-31337)) ^ (-2146079534);
                        i5 = -1230313574;
                    } else {
                        iM55680 = C0946.m55979("ۤ᩺") ^ i6;
                        i4 = ((iM55680 ^ i7) * 29821) ^ 1939144191;
                        i5 = -1517833141;
                    }
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                case -1586735322:
                case 342270798:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    if ((s * s2) - i15 > 0) {
                        iM55979 = C0873.m55680("᩹ۢ") ^ i6;
                        i = ((iM55979 ^ i7) * 5821) ^ (-1093803739);
                        i2 = 1775053173;
                    } else {
                        iM55979 = (i7 - C0946.m55979("ܺۨ")) * 127;
                        i = ((iM55979 ^ i6) * (-5477)) ^ 1614790766;
                        i2 = 1975891970;
                    }
                    i3 = iM55979 ^ i2;
                    sArr = sArr;
                    HashSet hashSet7 = hashSet2;
                    i9 = i3;
                    i8 = i;
                    hashSet2 = hashSet7;
                    break;
                case -1575242522:
                case -1262055104:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    i15 = i14 * i14;
                    s2 = 16424;
                    if (C1012.f81938 >= 0) {
                        iM55979 = (i7 - C0873.m55680("ۢ᩻")) * (-53);
                        i = ((iM55979 ^ i6) * (-19993)) ^ (-1849924217);
                        i2 = 1996306516;
                    } else {
                        iM55979 = (C0873.m55680("ᩴܰ") + i7) * (-9);
                        i = ((iM55979 ^ i6) * (-1499)) ^ (-1195410328);
                        i2 = 1760729114;
                    }
                    i3 = iM55979 ^ i2;
                    sArr = sArr;
                    HashSet hashSet8 = hashSet2;
                    i9 = i3;
                    i8 = i;
                    hashSet2 = hashSet8;
                    break;
                case -1454988123:
                case -910483676:
                    strM55734 = C0890.m55734(interfaceC14100, strM56558, null);
                    if (strM55734 == null) {
                        iM55680 = (C0873.m55680("ۡۗ") + i6) * (-25);
                        i4 = ((iM55680 ^ i7) * (-14853)) ^ 2088726601;
                        i5 = -1670142287;
                    } else {
                        str = strM55734;
                        iM55680 = C0873.m55680("֨ᩳ") ^ i6;
                        i4 = ((iM55680 ^ i7) * (-10115)) ^ 391009725;
                        i5 = 1252003466;
                    }
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                case -1410375119:
                case -652631047:
                    AbstractC0942.m55971();
                    C1025.m56230();
                    iM55680 = C0946.m55979("ۗ֫") ^ i6;
                    i4 = ((iM55680 ^ i7) * (-17775)) ^ (-1893408855);
                    i5 = 9471088;
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                case -1265814124:
                case -184179699:
                    str2 = strArr[i17];
                    if (C1194.m56397(str2)) {
                        iM55680 = C0946.m55979("᩷ۘ") ^ i7;
                        i4 = ((iM55680 ^ i6) * 20573) ^ (-926930196);
                        i5 = -205191303;
                    } else {
                        iM55680 = (i6 - C0946.m55979("֨ۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i7) * (-597)) ^ 2012285281;
                        i5 = 1113667461;
                    }
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                case -1140588084:
                case -1109117504:
                    i10 = 20939;
                    iM55979 = (C0873.m55680("᩶ܳ") + i6) * (-29);
                    i = ((iM55979 ^ i7) * (-987)) ^ 677077112;
                    i2 = -62224503;
                    i3 = iM55979 ^ i2;
                    sArr = sArr;
                    HashSet hashSet9 = hashSet2;
                    i9 = i3;
                    i8 = i;
                    hashSet2 = hashSet9;
                    break;
                case -1112032164:
                case 994595008:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    sArr3 = f82272;
                    c = 541;
                    if (C0930.f81879 > 0) {
                        iM55979 = C0946.m55979("ܺ۠") ^ i6;
                        i = ((iM55979 ^ i7) * 17659) ^ (-322253713);
                        i2 = -1050261084;
                        i3 = iM55979 ^ i2;
                        sArr = sArr;
                        HashSet hashSet10 = hashSet2;
                        i9 = i3;
                        i8 = i;
                        hashSet2 = hashSet10;
                    } else {
                        sArr = sArr;
                        hashSet2 = hashSet2;
                        iM55680 = C0946.m55979("ۗ֫") ^ i6;
                        i4 = ((iM55680 ^ i7) * (-17775)) ^ (-1893408855);
                        i5 = 9471088;
                        i9 = iM55680 ^ i5;
                        i8 = i4;
                    }
                    break;
                case -999465168:
                case 1069599848:
                    sArr = sArr;
                    strM56558 = C1929.m56558(sArr, i12, 12, i10);
                    if (C0912.f81867 > 0) {
                        iM55979 = C0946.m55979("ۖۚ") ^ i7;
                        hashSet2 = hashSet2;
                        i = ((iM55979 ^ i6) * (-29983)) ^ (-1849059311);
                        i2 = -1958795767;
                        i3 = iM55979 ^ i2;
                        sArr = sArr;
                        HashSet hashSet11 = hashSet2;
                        i9 = i3;
                        i8 = i;
                        hashSet2 = hashSet11;
                    } else {
                        sArr = sArr;
                        iM55680 = C0946.m55979("ۗ֫") ^ i6;
                        i4 = ((iM55680 ^ i7) * (-17775)) ^ (-1893408855);
                        i5 = 9471088;
                        i9 = iM55680 ^ i5;
                        i8 = i4;
                    }
                    break;
                case -942479775:
                case 417017141:
                    if (C1048.f81963) {
                        iM55680 = C0946.m55979("ۗ֫") ^ i6;
                        i4 = ((iM55680 ^ i7) * (-17775)) ^ (-1893408855);
                        i5 = 9471088;
                    } else {
                        iM55680 = C0946.m55979("ܰ۫") ^ i7;
                        i4 = ((iM55680 ^ i6) * (-31337)) ^ (-2146079534);
                        i5 = -1230313574;
                    }
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                case -926521413:
                case 23428484:
                    C1017.m56187();
                    if (C0906.f81862 < 0) {
                        iM55680 = C0946.m55979("ܰ۫") ^ i7;
                        i4 = ((iM55680 ^ i6) * (-31337)) ^ (-2146079534);
                        i5 = -1230313574;
                    } else {
                        iM55680 = (C0946.m55979("᩷ۨ") ^ i6) * (-37);
                        i4 = ((iM55680 ^ i7) * (-12501)) ^ 2047226057;
                        i5 = -1847852450;
                    }
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                case -829033672:
                case -430310477:
                    hashSet2.addAll(hashSet);
                    break;
                case -725976328:
                case -27336271:
                    C1048.m56305();
                    break;
                case -608236977:
                case 1841841940:
                    strM55734 = C1048.m56318(f82272, 556, 20, i10);
                    str = strM55734;
                    iM55680 = C0873.m55680("֨ᩳ") ^ i6;
                    i4 = ((iM55680 ^ i7) * (-10115)) ^ 391009725;
                    i5 = 1252003466;
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                case 177297026:
                case 328366517:
                    sArr = sArr;
                    hashSet2 = f54941;
                    hashSet2.clear();
                    if (C0845.f81821 < 0) {
                        iM55979 = C0946.m55979("᩹ᩳ") ^ i7;
                        hashSet2 = hashSet2;
                        i = ((iM55979 ^ i6) * 16165) ^ 491434186;
                        i2 = -992019801;
                        i3 = iM55979 ^ i2;
                        sArr = sArr;
                        HashSet hashSet12 = hashSet2;
                        i9 = i3;
                        i8 = i;
                        hashSet2 = hashSet12;
                    } else {
                        sArr = sArr;
                        iM55680 = C0946.m55979("ۗ֫") ^ i6;
                        i4 = ((iM55680 ^ i7) * (-17775)) ^ (-1893408855);
                        i5 = 9471088;
                        i9 = iM55680 ^ i5;
                        i8 = i4;
                    }
                    break;
                case 357337214:
                case 1095548311:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    s = sArr3[c];
                    if (C0866.m55645()) {
                        iM55979 = C0946.m55979("ۜᩴ") ^ i7;
                        i = ((iM55979 ^ i6) * 6441) ^ 1150213710;
                        i2 = -1457701212;
                    } else {
                        iM55979 = C0873.m55680("ܿۖ") ^ i6;
                        i = ((iM55979 ^ i7) * (-32139)) ^ (-1494198336);
                        i2 = 485271536;
                    }
                    i3 = iM55979 ^ i2;
                    sArr = sArr;
                    HashSet hashSet13 = hashSet2;
                    i9 = i3;
                    i8 = i;
                    hashSet2 = hashSet13;
                    break;
                case 404493070:
                case 1184786896:
                    ServiceConnectionC1013.m56151(hashSet, str2);
                    iM55680 = C0946.m55979("᩷ۘ") ^ i7;
                    i4 = ((iM55680 ^ i6) * 20573) ^ (-926930196);
                    i5 = -205191303;
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                case 563037604:
                case 1907188577:
                    i11 = 554;
                    i13 = 2;
                    if (!C0927.f81875) {
                        iM55680 = C0873.m55680("ܺܿ") ^ i7;
                        i4 = ((iM55680 ^ i6) * 10399) ^ 601928820;
                        i5 = 1540257483;
                        i9 = iM55680 ^ i5;
                        i8 = i4;
                    } else {
                        hashSet2 = hashSet2;
                        sArr = sArr;
                        iM55979 = (i7 - C0873.m55680("ۢ᩻")) * (-53);
                        i = ((iM55979 ^ i6) * (-19993)) ^ (-1849924217);
                        i2 = 1996306516;
                        i3 = iM55979 ^ i2;
                        sArr = sArr;
                        HashSet hashSet14 = hashSet2;
                        i9 = i3;
                        i8 = i;
                        hashSet2 = hashSet14;
                    }
                    break;
                case 1475962653:
                case 2042087910:
                    String[] strArrM55811 = C0906.m55811(str, AbstractC0942.m55970(sArr2, i11, i13, i10));
                    length = strArrM55811.length;
                    i17 = 0;
                    strArr = strArrM55811;
                    iM55680 = C0873.m55680("۟ۢ") ^ i7;
                    i4 = ((iM55680 ^ i6) * 24869) ^ 2100644251;
                    i5 = -1300490107;
                    i9 = iM55680 ^ i5;
                    i8 = i4;
                    break;
                default:
                    hashSet2 = hashSet2;
                    sArr = sArr;
                    interfaceC14100 = ApplicationC21448.f67649;
                    if (C0854.m55595() >= 0) {
                        iM55979 = (i7 - C0873.m55680("ۢ᩻")) * (-53);
                        i = ((iM55979 ^ i6) * (-19993)) ^ (-1849924217);
                        i2 = 1996306516;
                    } else {
                        iM55979 = C0946.m55979("ۡۡ") ^ i6;
                        i = ((iM55979 ^ i7) * (-17903)) ^ (-558762919);
                        i2 = -145772626;
                    }
                    i3 = iM55979 ^ i2;
                    sArr = sArr;
                    HashSet hashSet15 = hashSet2;
                    i9 = i3;
                    i8 = i;
                    hashSet2 = hashSet15;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m41905() {
        f54940.m15370((Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m41883(String str) {
        LinkedHashMap linkedHashMap = null;
        Iterator itM56561 = null;
        C13039 c13039 = null;
        int i = 79306930;
        int i2 = C1017.f81942;
        int i3 = C0967.f81910;
        int iM55979 = (i3 - C0946.m55979("᩵᩵")) * 3;
        int i4 = ((iM55979 ^ i2) * (-12799)) ^ (-1111135390);
        int i5 = 1361108512;
        while (true) {
            i = ((((i ^ i2) * 23951) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2031535884:
                case 581280049:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("ۗ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13449) ^ (-1343267667);
                        i5 = -12387522;
                    } else {
                        iM55979 = (i2 - C0946.m55979("֡۬")) * 9;
                        i4 = ((iM55979 ^ i3) * 16295) ^ 67334190;
                        i5 = 472401377;
                    }
                    break;
                case -2004501604:
                case 1624083982:
                    RunnableC0938.m55938();
                    if (C0863.f81833 > 0) {
                        iM55979 = (C0946.m55979("᩹ܿ") ^ i2) * 29;
                        i4 = ((iM55979 ^ i3) * 915) ^ (-1018193199);
                        i5 = 1456196832;
                    } else {
                        iM55979 = (C0946.m55979("᩹֡") + i3) * (-89);
                        i4 = ((iM55979 ^ i2) * 25903) ^ (-144131549);
                        i5 = -1822228711;
                    }
                    break;
                case -1945978471:
                case -1106696963:
                    itM56561 = C1929.m56561(linkedHashMap.values());
                    iM55979 = (C0873.m55680("ۢۗ") ^ i2) * 37;
                    i4 = ((iM55979 ^ i3) * 9999) ^ 639217615;
                    i5 = 572501042;
                    break;
                case -1798077796:
                case -615540555:
                    C1124.m56367();
                    C0917.m55854();
                    iM55979 = (C0946.m55979("᩹֡") + i3) * (-89);
                    i4 = ((iM55979 ^ i2) * 25903) ^ (-144131549);
                    i5 = -1822228711;
                    break;
                case -1490869169:
                case 788207883:
                    RunnableC0897.m55784();
                    if (C1017.f81942 < 0) {
                        iM55979 = C0873.m55680("ۧۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9759)) ^ (-645259057);
                        i5 = -2135013930;
                    } else {
                        iM55979 = (C0946.m55979("᩹ܿ") ^ i2) * 29;
                        i4 = ((iM55979 ^ i3) * 915) ^ (-1018193199);
                        i5 = 1456196832;
                    }
                    break;
                case -1463472787:
                case 1129531446:
                    if (C0937.m55918() >= 0) {
                        iM55979 = (C0946.m55979("᩹֡") + i3) * (-89);
                        i4 = ((iM55979 ^ i2) * 25903) ^ (-144131549);
                        i5 = -1822228711;
                    } else {
                        iM55979 = C0946.m55979("ܽۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 3775) ^ (-1031363897);
                        i5 = -1926880531;
                    }
                    break;
                case -1321859281:
                case 1668721901:
                    c13039 = (C13039) C0955.m56035(itM56561);
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("ۧۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9759)) ^ (-645259057);
                        i5 = -2135013930;
                    } else {
                        iM55979 = C0946.m55979("ۖۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32321) ^ 698321840;
                        i5 = -1677379201;
                    }
                    break;
                case -667097149:
                case -648980070:
                    return C1044.m56275(c13039.f36665);
                case -554686782:
                case 1424618705:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("ܺ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * 32109) ^ 2140303970;
                        i5 = -345398284;
                    } else {
                        iM55979 = C0873.m55680("᩶ܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-20551)) ^ 1770207893;
                        i5 = -477932939;
                    }
                    break;
                case -539392352:
                case 1118742536:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0946.m55979("ۗ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13449) ^ (-1343267667);
                        i5 = -12387522;
                    } else {
                        iM55979 = C0946.m55979("۬ܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25501) ^ 247593633;
                        i5 = -2058345121;
                    }
                    break;
                case -503977763:
                case 818628588:
                    C1012.m56134();
                    C1929.m56553();
                    return null;
                case -348804248:
                case 514736405:
                    return null;
                case -205212868:
                case 2019249416:
                    linkedHashMap = f54943;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0873.m55680("ۧۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9759)) ^ (-645259057);
                        i5 = -2135013930;
                    } else {
                        iM55979 = C0873.m55680("֡ۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18357) ^ 1165006381;
                        i5 = 223167990;
                    }
                    break;
                case 109186558:
                case 396923486:
                    if (C1053.m56327() >= 0) {
                        iM55979 = C0946.m55979("ۗ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13449) ^ (-1343267667);
                        i5 = -12387522;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۨ᩻")) * (-75);
                        i4 = ((iM55979 ^ i3) * (-14933)) ^ (-1723954712);
                        i5 = -199626174;
                    }
                    break;
                case 865548602:
                case 1880077810:
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0946.m55979("ۗ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13449) ^ (-1343267667);
                        i5 = -12387522;
                    } else {
                        iM55979 = C0873.m55680("ᩴ۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18735) ^ (-15330449);
                        i5 = 1417573379;
                    }
                    break;
                case 1241268340:
                case 2065044257:
                    if (C0866.m55645()) {
                        iM55979 = C0946.m55979("ܳ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14063)) ^ (-264851566);
                        i5 = -500249388;
                    } else {
                        iM55979 = (C0946.m55979("᩹ܿ") ^ i2) * 29;
                        i4 = ((iM55979 ^ i3) * 915) ^ (-1018193199);
                        i5 = 1456196832;
                    }
                    break;
                case 1279310829:
                case 1359451457:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("ܺ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * 32109) ^ 2140303970;
                        i5 = -345398284;
                    } else {
                        iM55979 = (C0946.m55979("᩹֡") + i3) * (-89);
                        i4 = ((iM55979 ^ i2) * 25903) ^ (-144131549);
                        i5 = -1822228711;
                    }
                    break;
                case 1304227828:
                case 1387658459:
                    if (ViewOnClickListenerC0939.m55949(c13039.f36668, str)) {
                        iM55979 = (C0873.m55680("ۘܽ") ^ i3) * 63;
                        i4 = ((iM55979 ^ i2) * 8261) ^ 742114752;
                        i5 = -2057543988;
                    } else {
                        iM55979 = (C0873.m55680("ۢۗ") ^ i2) * 37;
                        i4 = ((iM55979 ^ i3) * 9999) ^ 639217615;
                        i5 = 572501042;
                    }
                    break;
                case 1344329634:
                case 1747231142:
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("ۗ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13449) ^ (-1343267667);
                        i5 = -12387522;
                    } else {
                        iM55979 = C0946.m55979("ܳۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 20377) ^ (-354121067);
                        i5 = 900532910;
                    }
                    break;
                default:
                    if (C0930.m55886(itM56561)) {
                        iM55979 = C0946.m55979("ۙ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9709)) ^ (-1882739990);
                        i5 = 982651997;
                    } else {
                        iM55979 = (C0946.m55979("ۜܿ") + i2) * 89;
                        i4 = ((iM55979 ^ i3) * (-23537)) ^ 835455330;
                        i5 = -149948752;
                    }
                    break;
            }
        }
    }
}
