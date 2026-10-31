package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.text.ClipboardManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.y.q;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 02QQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4925 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Handler f15519;

    /* JADX INFO: renamed from: ۘۡܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f15520 = {115, 30113, 30125, 30124, 30124, 30119, 30113, 30134, 30123, 30132, 30123, 30134, 30139, 30124, 30135, 30126, 30126, 30178, 30113, 30115, 30124, 30124, 30125, 30134, 30178, 30112, 30119, 30178, 30113, 30115, 30129, 30134, 30178, 30134, 30125, 30178, 30124, 30125, 30124, 30191, 30124, 30135, 30126, 30126, 30178, 30134, 30139, 30130, 30119, 30178, 30115, 30124, 30118, 30128, 30125, 30123, 30118, 30188, 30124, 30119, 30134, 30188, 30081, 30125, 30124, 30124, 30119, 30113, 30134, 30123, 30132, 30123, 30134, 30139, 30095, 30115, 30124, 30115, 30117, 30119, 30128, 8433, 7620, 7622, 7639, 7650, 7635, 7635, 7631, 7626, 7616, 7618, 7639, 7626, 7628, 7629, 7658, 7629, 7621, 7628, 7563, 7565, 7565, 7565, 7562, 946, -27035, -27020, -27018, -27010, -27020, -27022, -27024, -27045, -27020, -27016, -27024, -27022, -27024, -27039, -27067, -27020, -27018, -27010, -27020, -27022, -27024, -27044, -27013, -27021, -27014, -27075, -27077, -27077, -27077, -27076, 2431, 17459, 17466, 17447, 17464, 17460, 17441, 17428, 17447, 17458, 17446, 17458, 17456, 17441, 17414, 17441, 17447, 17468, 17467, 17458, 17533, 17531, 17531, 17531, 17532, 7146, -11313, -11328, -11323, -11300, -11314, -11325, -11315, -11298, -11320, -11326, -11303, -11328, -11328, -11380, -11313, -11315, -11326, -11326, -11325, -11304, -11380, -11314, -11319, -11380, -11313, -11315, -11297, -11304, -11380, -11304, -11325, -11380, -11326, -11325, -11326, -11391, -11326, -11303, -11328, -11328, -11380, -11304, -11307, -11300, -11319, -11380, -11315, -11326, -11320, -11298, -11325, -11323, -11320, -11390, -11304, -11319, -11308, -11304, -11390, -11281, -11328, -11323, -11300, -11314, -11325, -11315, -11298, -11320, -11295, -11315, -11326, -11315, -11317, -11319, -11298, -22110, -21419, -29486, 9026, -21610, -21631, -21625, -21631, -21619, -21614, -21631, -21610, 9832, -22031, -22042, -22048, -22042, -22038, -22027, -22042, -22031, 6178, 14858, 14861, 14871, 14854, 14861, 14871, 3736, -31678, -29958, -31591, 6511, -11811, 8258, -21670, 4483, 3686, 3704, 3692, 3688, 3687, 3682, 3707, 3689, 3684, 3690, 3705, 3695, 3685, 3710, 3687, 3687, 3627, 3688, 3690, 3685, 3685, 3684, 3711, 3627, 3689, 3694, 3627, 3688, 3690, 3704, 3711, 3627, 3711, 3684, 3627, 3685, 3684, 3685, 3622, 3685, 3710, 3687, 3687, 3627, 3711, 3698, 3707, 3694, 3627, 3690, 3685, 3695, 3705, 3684, 3682, 3695, 3621, 3711, 3694, 3699, 3711, 3621, 3656, 3687, 3682, 3707, 3689, 3684, 3690, 3705, 3695, 3654, 3690, 3685, 3690, 3692, 3694, 3705, -30463, 32323, -24816, 7994, 29750, 29748, 29733, 29703, 29744, 29757, 29732, 29748, 29817, 29823, 29823, 29823, 29816, 4714, -28542, -28544, -28527, -28491, -28540, -28538, -28530, -28540, -28542, -28544, -28504, -28540, -28533, -28540, -28542, -28544, -28521, -28467, -28469, -28469, -28469, -28468, 3029, 22712, 22719, 22712, 22689, 22691, 22708, 22690, 22708, 22691, 22695, 22708, 22670, 22711, 22712, 22717, 22708, 22670, 22693, 22712, 22716, 22708, 5986, -30692, -30690, -30705, -30659, -30702, -30697, -30690, -30712, -30657, -30702, -30711, -30637, -30635, -30635, -30635, -30638, 4821, 10867, 10865, 10848, 10818, 10869, 10872, 10849, 10865, 10812, 10810, 10810, 10810, 10813, 3498, 9679, 9677, 9692, 9705, 9691, 9691, 9677, 9692, 9691, 9600, 9606, 9606, 9606, 9601, 2665, 23876, 23878, 23895, 23920, 23895, 23889, 23882, 23885, 23876, 23819, 23821, 23821, 23821, 23818, 6357, 16227, 16228, 16250, 16255, 16254, 16213, 16231, 16239, 16254, 16226, 16229, 16238, 16228, 16255, 16230, 16230, 16170, 16233, 16235, 16228, 16228, 16229, 16254, 16170, 16232, 16239, 16170, 16233, 16235, 16249, 16254, 16170, 16254, 16229, 16170, 16228, 16229, 16228, 16167, 16228, 16255, 16230, 16230, 16170, 16254, 16243, 16250, 16239, 16170, 16235, 16228, 16238, 16248, 16229, 16227, 16238, 16164, 16252, 16227, 16239, 16253, 16164, 16227, 16228, 16250, 16255, 16254, 16231, 16239, 16254, 16226, 16229, 16238, 16164, 16195, 16228, 16250, 16255, 16254, 16199, 16239, 16254, 16226, 16229, 16238, 16199, 16235, 16228, 16235, 16237, 16239, 16248, 4047, -12339, -12350, -12345, -12322, -12340, -12351, -12337, -12324, -12342, -12352, -12325, -12350, -12350, -12402, -12339, -12337, -12352, -12352, -12351, -12326, -12402, -12340, -12341, -12402, -12339, -12337, -12323, -12326, -12402, -12326, -12351, -12402, -12352, -12351, -12352, -12413, -12352, -12325, -12350, -12350, -12402, -12326, -12329, -12322, -12341, -12402, -12337, -12352, -12342, -12324, -12351, -12345, -12342, -12416, -12339, -12351, -12352, -12326, -12341, -12352, -12326, -12416, -12307, -12350, -12345, -12322, -12340, -12351, -12337, -12324, -12342, -12317, -12337, -12352, -12337, -12343, -12341, -12324, 716, -13910, -13912, -13895, -13938, -13908, -13906, -13915, -13912, -13943, -13916, -13889, -13851, -13853, -13853, -13853, -13852, 7410, -17910, -17912, -17895, -17863, -17912, -17899, -17895, -17851, -17853, -17853, -17853, -17852, 7811, 23243, 23239, 23238, 23260, 23245, 23248, 23260, 7208, -13763, -13761, -13778, -13799, -13771, -13772, -13778, -13761, -13772, -13778, -13816, -13761, -13783, -13771, -13770, -13780, -13761, -13784, -13710, -13708, -13708, -13708, -13709, 3241, -13451, -13449, -13466, -13502, -13453, -13455, -13447, -13453, -13451, -13449, -13476, -13453, -13441, -13449, -13510, -13508, -13508, -13508, -13509, 8628, -8265, -8267, -8284, -8318, -8267, -8285, -8257, -8283, -8286, -8269, -8267, -8285, -8200, -8194, -8194, -8194, -8199};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17230 f15521;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ApplicationC20075 f15522;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences f15523;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f15524;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f15525;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17230 f15526;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC12344 f15527;

    /* JADX WARN: Code duplicated, block: B:65:0x0219 A[PHI: r5 r6 r16
      0x0219: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:64:0x0217, B:48:0x016d, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:64:0x0217, B:48:0x016d, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r16v22 java.lang.String) = (r16v4 java.lang.String), (r16v8 java.lang.String), (r16v23 java.lang.String) binds: [B:64:0x0217, B:48:0x016d, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x024b A[PHI: r1 r2 r16
      0x024b: PHI (r1v6 short[]) = (r1v5 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:68:0x0249, B:60:0x01fa, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r2v4 char) = (r2v2 char), (r2v3 char), (r2v2 char) binds: [B:68:0x0249, B:60:0x01fa, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r16v20 java.lang.String) = (r16v3 java.lang.String), (r16v5 java.lang.String), (r16v21 java.lang.String) binds: [B:68:0x0249, B:60:0x01fa, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (l.C7106.f21815 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (l.C4159.f13567 != false) goto L15;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m14327(int i) {
        String str;
        int iM6981;
        int i2;
        int iM2566;
        int i3;
        int i4;
        String strM1958 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = -61746244;
        int i12 = ServiceConnectionC3453.f10921;
        int i13 = C1420.f5096;
        int iM2567 = C0630.m2566("᩵ۡ") ^ i13;
        int i14 = ((iM2567 ^ i12) * 4581) ^ 1016530212;
        int i15 = -834566368;
        while (true) {
            int i16 = iM2567 ^ i15;
            while (true) {
                i11 = ((((i11 ^ i12) * 11689) >> 31) & i14) ^ i16;
                switch (i11) {
                    case -2136400777:
                    case 1380805847:
                        str = strM1958;
                        i8 = 179935396;
                        if (C1294.f4556 < 0) {
                            iM6981 = C0630.m2566("ۨ᩷") ^ i13;
                            i14 = ((iM6981 ^ i12) * 24283) ^ 488677501;
                            i2 = 1968719538;
                            i16 = iM6981 ^ i2;
                            strM1958 = str;
                        } else {
                            strM1958 = str;
                            iM2566 = C0630.m2566("᩶ܽ") ^ i12;
                            str = strM1958;
                            i3 = ((iM2566 ^ i13) * 31439) ^ 834207949;
                            i4 = -1477595539;
                            i16 = iM2566 ^ i4;
                            i14 = i3;
                            strM1958 = str;
                        }
                        break;
                    case -1976941987:
                    case 915565993:
                        str = strM1958;
                        int i17 = i7 + i8;
                        if (i6 - (i17 + i17) <= 0) {
                            iM6981 = C2105.m6981("ۘܺ") ^ i12;
                            i14 = ((iM6981 ^ i13) * 17643) ^ 1887493525;
                            i2 = 1426263993;
                        } else {
                            iM6981 = (i13 - C0630.m2566("۬۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i14 = ((iM6981 ^ i12) * 21399) ^ 2083469048;
                            i2 = -459825104;
                        }
                        i16 = iM6981 ^ i2;
                        strM1958 = str;
                        break;
                    case -1920440392:
                    case 1356947988:
                        str = strM1958;
                        sArr = f15520;
                        if (C4263.f13799 <= 0) {
                            iM6981 = C2105.m6981("ܰۖ") ^ i12;
                            i14 = ((iM6981 ^ i13) * 1151) ^ (-230242831);
                            i2 = -898216661;
                        } else {
                            iM6981 = C2105.m6981("ܿ۬") ^ i13;
                            i14 = ((iM6981 ^ i12) * (-32499)) ^ 1208390652;
                            i2 = -1619813422;
                        }
                        i16 = iM6981 ^ i2;
                        strM1958 = str;
                        break;
                    case -1704786372:
                    case -1175182933:
                        i9 = 23843;
                        iM2566 = C0630.m2566("᩷᩸") ^ i12;
                        str = strM1958;
                        i3 = ((iM2566 ^ i13) * 969) ^ 1921581749;
                        i4 = -1297601235;
                        i16 = iM2566 ^ i4;
                        i14 = i3;
                        strM1958 = str;
                        break;
                    case -1673777097:
                    case 465014801:
                        C1504.m5179();
                        return null;
                    case -1529454301:
                    case 356816110:
                        str = strM1958;
                        c = 460;
                        if (C3537.f11231 >= 0) {
                            iM6981 = C2105.m6981("ܰۖ") ^ i12;
                            i14 = ((iM6981 ^ i13) * 1151) ^ (-230242831);
                            i2 = -898216661;
                        } else {
                            iM6981 = C0630.m2566("ۚ᩹") ^ i13;
                            i14 = ((iM6981 ^ i12) * (-20427)) ^ (-504603188);
                            i2 = -1707186319;
                        }
                        i16 = iM6981 ^ i2;
                        strM1958 = str;
                        break;
                    case -1476911433:
                    case 543461275:
                        C4159.m12575(strM1958, C0483.m2128(sArr2, i10, 14, i9));
                        return strM1958;
                    case -1417210014:
                    case -591812661:
                        str = strM1958;
                        if (C4117.f13076 <= 0) {
                            iM6981 = C2105.m6981("ܳ᩷") ^ i13;
                            i14 = ((iM6981 ^ i12) * (-30909)) ^ 637122022;
                            i2 = 1484632609;
                        } else {
                            iM6981 = C0630.m2566("ۚ۫") ^ i12;
                            i14 = ((iM6981 ^ i13) * 7371) ^ 210982730;
                            i2 = -105661745;
                        }
                        i16 = iM6981 ^ i2;
                        strM1958 = str;
                        break;
                    case -1229969892:
                    case -1068509200:
                        C3245.m9925();
                        if (C3245.f10203 <= 0) {
                            str = strM1958;
                            iM6981 = C2105.m6981("ܰۖ") ^ i12;
                            i14 = ((iM6981 ^ i13) * 1151) ^ (-230242831);
                            i2 = -898216661;
                            i16 = iM6981 ^ i2;
                            strM1958 = str;
                        }
                        str = strM1958;
                        iM6981 = C2105.m6981("᩶ۤ") ^ i13;
                        i14 = ((iM6981 ^ i12) * (-11069)) ^ 24122894;
                        i2 = -1798971098;
                        i16 = iM6981 ^ i2;
                        strM1958 = str;
                        break;
                    case -1023340354:
                    case -286345251:
                        i9 = 25177;
                        iM2566 = C0630.m2566("᩷᩸") ^ i12;
                        str = strM1958;
                        i3 = ((iM2566 ^ i13) * 969) ^ 1921581749;
                        i4 = -1297601235;
                        i16 = iM2566 ^ i4;
                        i14 = i3;
                        strM1958 = str;
                        break;
                    case -1011985471:
                    case -638299590:
                        str = strM1958;
                        s = sArr[c];
                        if (RunnableC1937.f6483 >= 0) {
                            iM6981 = C2105.m6981("᩶ۤ") ^ i13;
                            i14 = ((iM6981 ^ i12) * (-11069)) ^ 24122894;
                            i2 = -1798971098;
                        } else {
                            iM6981 = (C0630.m2566("᩵۟") + i12) * (-109);
                            i14 = ((iM6981 ^ i13) * 4803) ^ 1918616425;
                            i2 = 1242747114;
                        }
                        i16 = iM6981 ^ i2;
                        strM1958 = str;
                        break;
                    case -687079012:
                    case 116913996:
                        C0422.m1963();
                        C1005.m3501();
                        str = strM1958;
                        iM6981 = C2105.m6981("ܳ᩷") ^ i13;
                        i14 = ((iM6981 ^ i12) * (-30909)) ^ 637122022;
                        i2 = 1484632609;
                        i16 = iM6981 ^ i2;
                        strM1958 = str;
                        break;
                    case -648675924:
                    case 1562489215:
                        sArr2 = f15520;
                        if (C3245.f10203 > 0) {
                            iM2567 = C2105.m6981("۠۬") ^ i13;
                            i14 = ((iM2567 ^ i12) * 14571) ^ (-460631442);
                            i15 = 568694230;
                        }
                        iM2566 = C0630.m2566("᩶ܽ") ^ i12;
                        str = strM1958;
                        i3 = ((iM2566 ^ i13) * 31439) ^ 834207949;
                        i4 = -1477595539;
                        i16 = iM2566 ^ i4;
                        i14 = i3;
                        strM1958 = str;
                        break;
                    case -307987752:
                    case 1647284814:
                        i10 = 461;
                        if (C0422.f1886 > 0) {
                            iM2567 = C0630.m2566("ۜ۫") ^ i12;
                            i14 = ((iM2567 ^ i13) * (-27675)) ^ (-411998053);
                            i15 = 1259286600;
                        }
                        iM2566 = C0630.m2566("᩶ܽ") ^ i12;
                        str = strM1958;
                        i3 = ((iM2566 ^ i13) * 31439) ^ 834207949;
                        i4 = -1477595539;
                        i16 = iM2566 ^ i4;
                        i14 = i3;
                        strM1958 = str;
                        break;
                    case -196049424:
                    case 1132777004:
                        str = strM1958;
                        i6 = i5 * i5;
                        i7 = s * s;
                        if (C1294.f4556 >= 0) {
                            iM6981 = C2105.m6981("ܳ᩷") ^ i13;
                            i14 = ((iM6981 ^ i12) * (-30909)) ^ 637122022;
                            i2 = 1484632609;
                        } else {
                            iM6981 = C2105.m6981("ۗۘ") ^ i12;
                            i14 = ((iM6981 ^ i13) * (-137)) ^ (-449046029);
                            i2 = -1095089338;
                        }
                        i16 = iM6981 ^ i2;
                        strM1958 = str;
                        break;
                    case 646012413:
                    case 840123826:
                        C7811.m20844();
                        break;
                    case 998724035:
                    case 1394511076:
                        str = strM1958;
                        i5 = s + 13414;
                        if (C3019.m9255() <= 0) {
                            iM6981 = C2105.m6981("ᩴۚ") ^ i13;
                            i14 = ((iM6981 ^ i12) * 25795) ^ (-890899350);
                            i2 = -176568466;
                        } else {
                            iM6981 = C2105.m6981("ۚܳ") ^ i13;
                            i14 = ((iM6981 ^ i12) * 10861) ^ 1887192037;
                            i2 = 5164577;
                        }
                        i16 = iM6981 ^ i2;
                        strM1958 = str;
                        break;
                    case 1583126204:
                    case 2144134884:
                        strM1958 = C0422.m1958(C0382.m1842(), i);
                        if (C7811.m20844() != 0) {
                            iM2566 = C0630.m2566("᩶ܽ") ^ i12;
                            str = strM1958;
                            i3 = ((iM2566 ^ i13) * 31439) ^ 834207949;
                            i4 = -1477595539;
                        } else {
                            iM2566 = C2105.m6981("۬ܿ") ^ i12;
                            str = strM1958;
                            i3 = ((iM2566 ^ i13) * (-1891)) ^ 219167848;
                            i4 = 899863823;
                        }
                        i16 = iM2566 ^ i4;
                        i14 = i3;
                        strM1958 = str;
                        break;
                    default:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087 A[PHI: r2
      0x0087: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:21:0x0085, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01b7 A[PHI: r4 r7 r8 r11 r12
      0x01b7: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:51:0x01b5, B:43:0x0167, B:29:0x00d8, B:15:0x006a, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:51:0x01b5, B:43:0x0167, B:29:0x00d8, B:15:0x006a, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:51:0x01b5, B:43:0x0167, B:29:0x00d8, B:15:0x006a, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:51:0x01b5, B:43:0x0167, B:29:0x00d8, B:15:0x006a, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:51:0x01b5, B:43:0x0167, B:29:0x00d8, B:15:0x006a, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0208 A[PHI: r9
      0x0208: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:59:0x0206, B:39:0x0145, B:13:0x0066, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0236 A[PHI: r13 r18
      0x0236: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:63:0x0234, B:55:0x01ea, B:25:0x00b6, B:10:0x005d, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:63:0x0234, B:55:0x01ea, B:25:0x00b6, B:10:0x005d, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14315(Runnable runnable) {
        int iM6981;
        int i;
        int i2;
        int i3 = C0714.f2697;
        int i4 = C22628.f73083;
        int iM6982 = C2105.m6981("ۡ֫") ^ i4;
        int i5 = ((iM6982 ^ i3) * (-31401)) ^ (-573736104);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ (-307228348);
        String strM12578 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 2012738843;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 31497) >> 31));
            switch (i12) {
                case -1999290502:
                case 1617161344:
                    c = 269;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܶۖ")) * 25;
                        i = ((iM6981 ^ i4) * 16009) ^ 337473469;
                        i2 = -1895982222;
                    } else {
                        iM6981 = (C2105.m6981("᩸۫") + i4) * 7;
                        i = ((iM6981 ^ i3) * 13601) ^ 1013405638;
                        i2 = -746621765;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1973977348:
                case 1801360903:
                    C2520.m8026();
                    C4075.m12263();
                    break;
                case -1893976146:
                case 445813565:
                    C3911.m11924();
                    if (C1047.f3863 < 0) {
                        iM6981 = (i3 - C0630.m2566("ܶۖ")) * 25;
                        i = ((iM6981 ^ i4) * 16009) ^ 337473469;
                        i2 = -1895982222;
                    } else {
                        iM6981 = C2105.m6981("᩷ۤ") ^ i3;
                        i = ((iM6981 ^ i4) * (-29623)) ^ (-1956579221);
                        i2 = -1300465630;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1886738841:
                case 85854421:
                    sArr2 = f15520;
                    i10 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܶۖ")) * 25;
                        i = ((iM6981 ^ i4) * 16009) ^ 337473469;
                        i2 = -1895982222;
                    } else {
                        iM6981 = (C2105.m6981("ۗۧ") ^ i3) * 51;
                        i = ((iM6981 ^ i4) * 23653) ^ (-847636256);
                        i2 = -420139598;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1851418862:
                case 1009801586:
                    C7106.m19120();
                    iM6981 = (i3 - C0630.m2566("ܶۖ")) * 25;
                    i = ((iM6981 ^ i4) * 16009) ^ 337473469;
                    i2 = -1895982222;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1792570313:
                case 531207365:
                    C2105.m6982();
                    if (C0050.m940() > 0) {
                        iM6981 = C2105.m6981("᩷ۤ") ^ i3;
                        i = ((iM6981 ^ i4) * (-29623)) ^ (-1956579221);
                        i2 = -1300465630;
                    } else {
                        iM6981 = C0630.m2566("֡᩸") ^ i4;
                        i = ((iM6981 ^ i3) * (-24431)) ^ (-387048054);
                        i2 = 795958569;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1559118399:
                case 2054405732:
                    if (C4117.m12364() != 0) {
                        iM6981 = C0630.m2566("֡᩸") ^ i4;
                        i = ((iM6981 ^ i3) * (-24431)) ^ (-387048054);
                        i2 = 795958569;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩶᩹")) * 119;
                        i = ((iM6981 ^ i4) * 13669) ^ (-1622974957);
                        i2 = 1163422294;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1439390495:
                case 1127036160:
                    s = sArr[c];
                    s2 = 20260;
                    if (C4117.f13076 <= 0) {
                        iM6981 = C2105.m6981("ܽۤ") ^ i3;
                        i = ((iM6981 ^ i4) * (-29637)) ^ (-193804513);
                        i2 = -1912936797;
                    } else {
                        iM6981 = C0630.m2566("᩵֡") ^ i3;
                        i = ((iM6981 ^ i4) * 17443) ^ 3943727;
                        i2 = -677406650;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1336038719:
                case -1089060219:
                    i11 = 1;
                    if (RunnableC1108.f4040) {
                        iM6981 = (i4 - C0630.m2566("᩹᩷")) * (-29);
                        i = ((iM6981 ^ i3) * 15167) ^ 1824807212;
                        i2 = 1364061929;
                    } else {
                        iM6981 = C0630.m2566("֡᩸") ^ i4;
                        i = ((iM6981 ^ i3) * (-24431)) ^ (-387048054);
                        i2 = 795958569;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1268438817:
                case 1066691302:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C2105.m6981("᩷ۤ") ^ i3;
                        i = ((iM6981 ^ i4) * (-29623)) ^ (-1956579221);
                        i2 = -1300465630;
                    } else {
                        iM6981 = C0630.m2566("ۤܿ") ^ i3;
                        i = ((iM6981 ^ i4) * 16625) ^ 80224624;
                        i2 = -197363550;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1260011450:
                case 254502052:
                    strM12578 = C4159.m12578(sArr2, i10, i11, i9);
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("ۚۖ") ^ i4) * (-55);
                        i = ((iM6981 ^ i3) * 27297) ^ 522305976;
                        i2 = -114501344;
                    } else {
                        iM6981 = C0630.m2566("ܿۤ") ^ i4;
                        i = ((iM6981 ^ i3) * 3729) ^ (-1396227257);
                        i2 = 604607272;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1055587623:
                case -665596595:
                    sArr = f15520;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("֡᩸") ^ i4;
                        i = ((iM6981 ^ i3) * (-24431)) ^ (-387048054);
                        i2 = 795958569;
                    } else {
                        iM6981 = C2105.m6981("ۜۨ") ^ i4;
                        i = ((iM6981 ^ i3) * (-25149)) ^ (-1467246609);
                        i2 = -2121861712;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -839056131:
                case 93249515:
                    i8 = s + s3;
                    if (C4263.f13799 <= 0) {
                        iM6981 = C2105.m6981("᩷ۤ") ^ i3;
                        i = ((iM6981 ^ i4) * (-29623)) ^ (-1956579221);
                        i2 = -1300465630;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܰۧ")) * (-67);
                        i = ((iM6981 ^ i4) * (-5897)) ^ 962638975;
                        i2 = 822062412;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -359604931:
                case 315967360:
                    i9 = 53679;
                    iM6981 = C0630.m2566("ܽܰ") ^ i4;
                    i = ((iM6981 ^ i3) * (-15821)) ^ (-200991227);
                    i2 = 821946789;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -243801086:
                case 201783190:
                    if (i7 - (i8 * i8) <= 0) {
                        iM6981 = C2105.m6981("ۚܺ") ^ i4;
                        i = ((iM6981 ^ i3) * 31605) ^ 830790987;
                        i2 = 657889987;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۙܶ")) * 41;
                        i = ((iM6981 ^ i4) * 22399) ^ (-1887710695);
                        i2 = 123989165;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 62200825:
                case 688517957:
                    if (C0382.f1805) {
                        iM6981 = (C0630.m2566("ۚۖ") ^ i4) * (-55);
                        i = ((iM6981 ^ i3) * 27297) ^ 522305976;
                        i2 = -114501344;
                    } else {
                        iM6981 = C0630.m2566("֡᩸") ^ i4;
                        i = ((iM6981 ^ i3) * (-24431)) ^ (-387048054);
                        i2 = 795958569;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 300577358:
                case 2140543906:
                    RunnableC0588.m2430(runnable, strM12578);
                    f15519.post(runnable);
                    break;
                case 1507048343:
                case 2000472942:
                    i7 = s * s2;
                    s3 = 5065;
                    if (C0382.f1805) {
                        iM6981 = C0630.m2566("ۙ᩶") ^ i4;
                        i = ((iM6981 ^ i3) * (-935)) ^ 1126495837;
                        i2 = 812464053;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܶۖ")) * 25;
                        i = ((iM6981 ^ i4) * 16009) ^ 337473469;
                        i2 = -1895982222;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    i9 = 64855;
                    iM6981 = C0630.m2566("ܽܰ") ^ i4;
                    i = ((iM6981 ^ i3) * (-15821)) ^ (-200991227);
                    i2 = 821946789;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    static {
        C6700 c6700 = null;
        C21859 c21859 = null;
        InterfaceC17230 interfaceC17230M34431 = null;
        int i = -1746542136;
        int i2 = C0714.f2697;
        int i3 = C0422.f1886;
        int iM2566 = C0630.m2566("ۖ۫") ^ i2;
        int i4 = ((iM2566 ^ i3) * 27461) ^ 528610030;
        int i5 = -510383583;
        while (true) {
            i = ((((i ^ i3) * (-20933)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2133436792:
                case -687250144:
                    f15526 = C14407.m34431(c21859);
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("᩵ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30815)) ^ 1274655477;
                        i5 = 890465289;
                    } else {
                        iM2566 = (C0630.m2566("ۙۗ") + i2) * 123;
                        i4 = ((iM2566 ^ i3) * 25493) ^ 231869974;
                        i5 = 1869001830;
                    }
                    break;
                case -1882480548:
                case -1399891809:
                    C0422.m1963();
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("ۗܿ") ^ i2) * (-59);
                        i4 = ((iM2566 ^ i3) * (-519)) ^ (-1221568368);
                        i5 = -1749508272;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                        i4 = ((iM2566 ^ i2) * 23385) ^ 711974287;
                        i5 = 619609887;
                    }
                    break;
                case -1540952519:
                case -160401023:
                    C4159.m12565();
                    iM2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                    i4 = ((iM2566 ^ i2) * 23385) ^ 711974287;
                    i5 = 619609887;
                    break;
                case -1250037457:
                case 790187752:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                        i4 = ((iM2566 ^ i2) * 23385) ^ 711974287;
                        i5 = 619609887;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ᩴۛ")) * 15;
                        i4 = ((iM2566 ^ i3) * 19365) ^ 1666199758;
                        i5 = -1314514492;
                    }
                    break;
                case -1151382254:
                case 1363187645:
                    C0483.m2121();
                    if (C3683.f11629 < 0) {
                        iM2566 = (C2105.m6981("ۗܿ") ^ i2) * (-59);
                        i4 = ((iM2566 ^ i3) * (-519)) ^ (-1221568368);
                        i5 = -1749508272;
                    } else {
                        iM2566 = (C0630.m2566("ۧ᩻") + i3) * 61;
                        i4 = ((iM2566 ^ i2) * 23879) ^ (-1139162841);
                        i5 = 1556552318;
                    }
                    break;
                case -821235640:
                case 189938279:
                    f15527 = c6700;
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("ۗܿ") ^ i2) * (-59);
                        i4 = ((iM2566 ^ i3) * (-519)) ^ (-1221568368);
                        i5 = -1749508272;
                    } else {
                        iM2566 = (C2105.m6981("ܿۧ") ^ i3) * 89;
                        i4 = ((iM2566 ^ i2) * 14965) ^ 2129842748;
                        i5 = -48696199;
                    }
                    break;
                case -708482563:
                case 380844296:
                    C1294.m4372();
                    throw new RuntimeException();
                case -695161538:
                case 1176411802:
                    if (RunnableC1937.f6483 < 0) {
                        f15519 = new Handler(C0630.m2565());
                        return;
                    }
                    iM2566 = C2105.m6981("֫۬") ^ i2;
                    i4 = ((iM2566 ^ i3) * 21917) ^ 792788019;
                    i5 = -447654269;
                    break;
                case -405533202:
                case 299563671:
                    if (C1916.f6442) {
                        iM2566 = C2105.m6981("᩹ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 30003) ^ 1193533789;
                        i5 = -2061624416;
                    } else {
                        iM2566 = C0630.m2566("᩵ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30815)) ^ 1274655477;
                        i5 = 890465289;
                    }
                    break;
                case 252471103:
                case 1021665809:
                    if (C7811.m20844() != 0) {
                        iM2566 = C2105.m6981("֫۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21917) ^ 792788019;
                        i5 = -447654269;
                    } else {
                        interfaceC17230M34431 = C14407.m34431(new C22564());
                        if (C4075.m12263() <= 0) {
                            iM2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                            i4 = ((iM2566 ^ i2) * 23385) ^ 711974287;
                            i5 = 619609887;
                        } else {
                            iM2566 = C0630.m2566("ۚ᩶") ^ i3;
                            i4 = ((iM2566 ^ i2) * (-14499)) ^ 898897326;
                            i5 = 1546767453;
                        }
                    }
                    break;
                case 1057013512:
                case 1425328088:
                    c21859 = new C21859();
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("᩵ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30815)) ^ 1274655477;
                        i5 = 890465289;
                    } else {
                        iM2566 = (C0630.m2566("᩻ۗ") ^ i3) * 39;
                        i4 = ((iM2566 ^ i2) * (-19439)) ^ 571135902;
                        i5 = 1270624835;
                    }
                    break;
                case 1155162496:
                case 2107864302:
                    f15521 = interfaceC17230M34431;
                    if (C1420.f5096 <= 0) {
                        iM2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                        i4 = ((iM2566 ^ i2) * 23385) ^ 711974287;
                        i5 = 619609887;
                    } else {
                        iM2566 = C0630.m2566("۠֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-32355)) ^ 1441989247;
                        i5 = -934191540;
                    }
                    break;
                case 1654571493:
                case 1797192255:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C0630.m2566("᩵ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30815)) ^ 1274655477;
                        i5 = 890465289;
                    } else {
                        iM2566 = (C2105.m6981("ۗܿ") ^ i2) * (-59);
                        i4 = ((iM2566 ^ i3) * (-519)) ^ (-1221568368);
                        i5 = -1749508272;
                    }
                    break;
                default:
                    c6700 = new C6700();
                    if (C0237.f1507 != 0) {
                        iM2566 = (i3 - C0630.m2566("ۜܶ")) * (-111);
                        i4 = ((iM2566 ^ i2) * 23385) ^ 711974287;
                        i5 = 619609887;
                    } else {
                        iM2566 = (C2105.m6981("ܿܽ") ^ i3) * (-75);
                        i4 = ((iM2566 ^ i2) * 5637) ^ (-1099214775);
                        i5 = -1645216701;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e1 A[PHI: r11 r12 r13
      0x00e1: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:32:0x00df, B:28:0x00be, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:32:0x00df, B:28:0x00be, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:32:0x00df, B:28:0x00be, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x018e A[PHI: r8
      0x018e: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:47:0x018c, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0215 A[PHI: r2 r3 r5
      0x0215: PHI (r2v5 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:59:0x0213, B:55:0x01f8, B:24:0x00a2, B:20:0x0083, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r3v5 android.app.Application) = 
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v3 android.app.Application)
      (r3v2 android.app.Application)
     binds: [B:59:0x0213, B:55:0x01f8, B:24:0x00a2, B:20:0x0083, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r5v5 char) = (r5v2 char), (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:59:0x0213, B:55:0x01f8, B:24:0x00a2, B:20:0x0083, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0245 A[PHI: r9 r18
      0x0245: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:63:0x0243, B:43:0x016a, B:14:0x0064, B:12:0x0060, B:9:0x0057, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:63:0x0243, B:43:0x016a, B:14:0x0064, B:12:0x0060, B:9:0x0057, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14312(Intent intent) {
        int iM2566;
        int i;
        int i2;
        int i3 = C2958.f9394;
        int i4 = C3245.f10203;
        int iM2567 = (i4 - C0630.m2566("۬ᩳ")) * (-107);
        int i5 = ((iM2567 ^ i3) * 19581) ^ (-1363409887);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ (-962305093);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -51271638;
        Application applicationM1842 = null;
        String strM6435 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 13969) >> 31));
            switch (i11) {
                case -2044923295:
                case 271850304:
                    if (i7 - (s * s3) < 0) {
                        iM2566 = (C2105.m6981("ܶ۟") ^ i3) * 65;
                        i = ((iM2566 ^ i4) * 6069) ^ (-1886499761);
                        i2 = -731349948;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۗᩴ")) * (-93);
                        i = ((iM2566 ^ i3) * (-8977)) ^ (-1801161813);
                        i2 = 2003151358;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1826468012:
                case 900331006:
                    c = 258;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ۜۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 13273) ^ 1151876398;
                        i2 = -1788490592;
                    } else {
                        iM2566 = C2105.m6981("۟۫") ^ i4;
                        i = ((iM2566 ^ i3) * 28255) ^ 1677951204;
                        i2 = 1050036561;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1585629894:
                case -1428521144:
                    int i12 = s + s2;
                    i7 = i12 * i12;
                    if (C2126.f7087) {
                        iM2566 = (i3 - C2105.m6981("֡ܰ")) * 29;
                        i = ((iM2566 ^ i4) * (-4653)) ^ (-799452676);
                        i2 = 1083691275;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۟ۚ")) * (-41);
                        i = ((iM2566 ^ i4) * (-11845)) ^ (-1020366242);
                        i2 = 1919603259;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1534297361:
                case 1111512581:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = C2105.m6981("ۜۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 13273) ^ 1151876398;
                        i2 = -1788490592;
                    } else {
                        iM2566 = (C2105.m6981("ۡ۠") ^ i4) * 7;
                        i = ((iM2566 ^ i3) * (-21669)) ^ (-365723720);
                        i2 = 1651560469;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1480426204:
                case 1032663201:
                    strM6435 = ViewOnClickListenerC1958.m6435(sArr2, i9, i10, i8);
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ۜۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 13273) ^ 1151876398;
                        i2 = -1788490592;
                    } else {
                        iM2566 = C0630.m2566("᩻ܽ") ^ i3;
                        i = ((iM2566 ^ i4) * (-25569)) ^ 582761137;
                        i2 = -1954447546;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1468368315:
                case 1445365804:
                    RunnableC1108.m3790();
                    break;
                case -1277822027:
                case 1359522254:
                    sArr = f15520;
                    if (C3683.f11629 >= 0) {
                        iM2566 = C2105.m6981("۫۬") ^ i3;
                        i = ((iM2566 ^ i4) * (-20935)) ^ 1357601863;
                        i2 = -1559982118;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ᩴۡ")) * 13;
                        i = ((iM2566 ^ i4) * 11219) ^ 1294786964;
                        i2 = 819678631;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1242164764:
                case -409697883:
                    sArr2 = f15520;
                    i9 = 259;
                    if (C4616.f14690 <= 0) {
                        iM2566 = (i3 - C2105.m6981("ܿܳ")) * 5;
                        i = ((iM2566 ^ i4) * (-10479)) ^ (-830736247);
                        i2 = -533819467;
                    } else {
                        iM2566 = (C2105.m6981("᩵֨") + i3) * (-13);
                        i = ((iM2566 ^ i4) * 10185) ^ 1264543606;
                        i2 = 1723340163;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1222881356:
                case 1291291537:
                    C1711.m5736();
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("۫۬") ^ i3;
                        i = ((iM2566 ^ i4) * (-20935)) ^ 1357601863;
                        i2 = -1559982118;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܿܳ")) * 5;
                        i = ((iM2566 ^ i4) * (-10479)) ^ (-830736247);
                        i2 = -533819467;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -830049117:
                case -373023895:
                    ViewOnClickListenerC1958.m6429();
                    if (C1773.m5908() > 0) {
                        iM2566 = C2105.m6981("۫۬") ^ i3;
                        i = ((iM2566 ^ i4) * (-20935)) ^ 1357601863;
                        i2 = -1559982118;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֡ܰ")) * 29;
                        i = ((iM2566 ^ i4) * (-4653)) ^ (-799452676);
                        i2 = 1083691275;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -807083553:
                case 1614170309:
                    s3 = 73292;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("۫۬") ^ i3;
                        i = ((iM2566 ^ i4) * (-20935)) ^ 1357601863;
                        i2 = -1559982118;
                    } else {
                        iM2566 = (i4 - C2105.m6981("֨֡")) * (-47);
                        i = ((iM2566 ^ i3) * 12473) ^ 739664105;
                        i2 = 767888638;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -739554332:
                case 696726138:
                    C1711.m5736();
                    C1047.m3599();
                    iM2566 = C2105.m6981("۫۬") ^ i3;
                    i = ((iM2566 ^ i4) * (-20935)) ^ 1357601863;
                    i2 = -1559982118;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -471371381:
                case -362002607:
                    C2234.m7411(applicationM1842).m7415(intent);
                    break;
                case -371654598:
                case 367538683:
                    i8 = 2778;
                    iM2566 = (C0630.m2566("֨ۙ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM2566 ^ i3) * 15099) ^ (-353244437);
                    i2 = -800672532;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -341253347:
                case 1935039821:
                    i10 = 6;
                    if (C4616.f14690 <= 0) {
                        iM2566 = (i3 - C2105.m6981("ܿܳ")) * 5;
                        i = ((iM2566 ^ i4) * (-10479)) ^ (-830736247);
                        i2 = -533819467;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۢ۫")) * 75;
                        i = ((iM2566 ^ i3) * 2017) ^ 1217850055;
                        i2 = -1097981903;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 220474463:
                case 2111968414:
                    i8 = 14947;
                    iM2566 = (C0630.m2566("֨ۙ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM2566 ^ i3) * 15099) ^ (-353244437);
                    i2 = -800672532;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 485477077:
                case 1405121084:
                    s = sArr[c];
                    s2 = 18323;
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C2105.m6981("ܿᩳ") ^ i4) * (-49);
                        i = ((iM2566 ^ i3) * (-27213)) ^ (-1661104061);
                        i2 = -1473134105;
                    } else {
                        iM2566 = (C2105.m6981("ܿܺ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i4) * 20469) ^ 254781644;
                        i2 = -530894810;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 892103553:
                case 2124454387:
                    RunnableC0588.m2430(intent, strM6435);
                    applicationM1842 = C0382.m1842();
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = C2105.m6981("ۜۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 13273) ^ 1151876398;
                        i2 = -1788490592;
                    } else {
                        iM2566 = C0630.m2566("᩻ܿ") ^ i4;
                        i = ((iM2566 ^ i3) * 13403) ^ (-1696897789);
                        i2 = -1046669881;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C0483.f2088 < 0) {
                        iM2566 = C2105.m6981("۫۬") ^ i3;
                        i = ((iM2566 ^ i4) * (-20935)) ^ 1357601863;
                        i2 = -1559982118;
                    } else {
                        iM2566 = C2105.m6981("ۜۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 13273) ^ 1151876398;
                        i2 = -1788490592;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0179 A[PHI: r10
      0x0179: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:16:0x007f, B:13:0x0076, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01b2 A[PHI: r2 r8 r9 r14
      0x01b2: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:49:0x01b0, B:32:0x00e2, B:28:0x00c2, B:18:0x0083, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:49:0x01b0, B:32:0x00e2, B:28:0x00c2, B:18:0x0083, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:49:0x01b0, B:32:0x00e2, B:28:0x00c2, B:18:0x0083, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:49:0x01b0, B:32:0x00e2, B:28:0x00c2, B:18:0x0083, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0206 A[PHI: r6 r7
      0x0206: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:57:0x0204, B:53:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:57:0x0204, B:53:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0254 A[PHI: r3 r5 r12 r13 r19
      0x0254: PHI (r3v4 android.app.Application) = 
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
      (r3v3 android.app.Application)
      (r3v2 android.app.Application)
      (r3v2 android.app.Application)
     binds: [B:65:0x0252, B:61:0x0236, B:36:0x0104, B:24:0x00a2, B:13:0x0076, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r5v4 char) = (r5v2 char), (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:65:0x0252, B:61:0x0236, B:36:0x0104, B:24:0x00a2, B:13:0x0076, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:65:0x0252, B:61:0x0236, B:36:0x0104, B:24:0x00a2, B:13:0x0076, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:65:0x0252, B:61:0x0236, B:36:0x0104, B:24:0x00a2, B:13:0x0076, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:65:0x0252, B:61:0x0236, B:36:0x0104, B:24:0x00a2, B:13:0x0076, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14310(BroadcastReceiver broadcastReceiver) {
        int iM6981;
        int i;
        int i2;
        int i3 = C0714.f2697;
        int i4 = C5695.f17556;
        int iM6982 = (C2105.m6981("ܰܶ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i5 = ((iM6982 ^ i4) * 5769) ^ (-790494936);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ (-244850691);
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1507069597;
        Application applicationM1842 = null;
        String strM9934 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 7103) >> 31));
            switch (i13) {
                case -2047479596:
                case -1020433109:
                    i10 = 44004;
                    iM6981 = (i3 - C2105.m6981("֫ᩳ")) * 7;
                    i = ((iM6981 ^ i4) * 27683) ^ (-1026842099);
                    i2 = -605401786;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1981001303:
                case -1230597924:
                    if (C3245.m9925() == 0) {
                        iM6981 = C2105.m6981("ۙ۟") ^ i3;
                        i = ((iM6981 ^ i4) * 31161) ^ (-2079994796);
                        i2 = 1143732054;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩹") ^ i3;
                        i = ((iM6981 ^ i4) * (-20659)) ^ (-790915881);
                        i2 = -2139707626;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1923529753:
                case -35031544:
                    C3746.m11369();
                    C1420.m4913();
                    break;
                case -1648552032:
                case -856047330:
                    c = 240;
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("֡᩹") ^ i4;
                        i = ((iM6981 ^ i3) * (-2283)) ^ 224348363;
                        i2 = 253749200;
                    } else {
                        iM6981 = C2105.m6981("ۙ۟") ^ i3;
                        i = ((iM6981 ^ i4) * 31161) ^ (-2079994796);
                        i2 = 1143732054;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1359988835:
                case 830155395:
                    strM9934 = C3245.m9934(sArr2, i11, i12, i10);
                    if (C3537.f11231 >= 0) {
                        iM6981 = (i3 - C0630.m2566("֡֨")) * (-25);
                        i = ((iM6981 ^ i4) * (-7991)) ^ 272815162;
                        i2 = -407798542;
                    } else {
                        iM6981 = (C0630.m2566("۠ܿ") + i4) * 31;
                        i = ((iM6981 ^ i3) * 11925) ^ (-1071904252);
                        i2 = -1839647940;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1355855808:
                case 401046813:
                    C2234.m7411(applicationM1842).m7413(broadcastReceiver);
                    break;
                case -1297483970:
                case 1749661986:
                    sArr = f15520;
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("ۙ۟") ^ i3;
                        i = ((iM6981 ^ i4) * 31161) ^ (-2079994796);
                        i2 = 1143732054;
                    } else {
                        iM6981 = C2105.m6981("ۙۖ") ^ i3;
                        i = ((iM6981 ^ i4) * 31995) ^ 1173340915;
                        i2 = 1119223838;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1253401388:
                case 1070490357:
                    sArr2 = f15520;
                    i11 = 241;
                    if (C0714.f2697 >= 0) {
                        iM6981 = C2105.m6981("ۙ۟") ^ i3;
                        i = ((iM6981 ^ i4) * 31161) ^ (-2079994796);
                        i2 = 1143732054;
                    } else {
                        iM6981 = C2105.m6981("᩶ܰ") ^ i4;
                        i = ((iM6981 ^ i3) * (-16901)) ^ (-914161655);
                        i2 = 1038031930;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -899402131:
                case 1250363701:
                    C1504.m5179();
                    if (C5695.f17556 >= 0) {
                        iM6981 = (i3 - C0630.m2566("֡֨")) * (-25);
                        i = ((iM6981 ^ i4) * (-7991)) ^ 272815162;
                        i2 = -407798542;
                    } else {
                        iM6981 = (C0630.m2566("ᩴۗ") ^ i4) * (-77);
                        i = ((iM6981 ^ i3) * (-26207)) ^ 496625392;
                        i2 = 1749579100;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -820280704:
                case -452281583:
                    C3683.m11222();
                    iM6981 = (i3 - C0630.m2566("֡֨")) * (-25);
                    i = ((iM6981 ^ i4) * (-7991)) ^ 272815162;
                    i2 = -407798542;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -789903593:
                case 1092787470:
                    i12 = 8;
                    if (C0798.f2919) {
                        iM6981 = (i3 - C0630.m2566("֡֨")) * (-25);
                        i = ((iM6981 ^ i4) * (-7991)) ^ 272815162;
                        i2 = -407798542;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܺ᩷")) * 17;
                        i = ((iM6981 ^ i4) * 6191) ^ 793366855;
                        i2 = -574607811;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -702315890:
                case 258144503:
                    i10 = 48356;
                    iM6981 = (i3 - C2105.m6981("֫ᩳ")) * 7;
                    i = ((iM6981 ^ i4) * 27683) ^ (-1026842099);
                    i2 = -605401786;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -651020805:
                case 1760629882:
                    if (i8 - (i9 + 1) >= 0) {
                        iM6981 = (i3 - C0630.m2566("ᩴ۟")) * 65;
                        i = ((iM6981 ^ i4) * (-8569)) ^ 272221756;
                        i2 = -1531552922;
                    } else {
                        iM6981 = (C0630.m2566("۠֨") + i4) * (-107);
                        i = ((iM6981 ^ i3) * (-23263)) ^ 1291729583;
                        i2 = 263817349;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -500691073:
                case 118808878:
                    s = sArr[c];
                    if (C3683.f11629 >= 0) {
                        iM6981 = C2105.m6981("۫ܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-14507)) ^ 607390765;
                        i2 = 1536257337;
                    } else {
                        iM6981 = (C2105.m6981("ܰ֡") ^ i4) * 9;
                        i = ((iM6981 ^ i3) * (-4083)) ^ 1539929607;
                        i2 = 1928680825;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 175688607:
                case 1782556134:
                    i8 = i7 * i7;
                    s2 = 2;
                    if (C1504.m5179()) {
                        iM6981 = (C2105.m6981("ۜۜ") + i4) * (-13);
                        i = ((iM6981 ^ i3) * 9285) ^ (-1137181013);
                        i2 = 1117495952;
                    } else {
                        iM6981 = (i3 - C0630.m2566("֡֨")) * (-25);
                        i = ((iM6981 ^ i4) * (-7991)) ^ 272815162;
                        i2 = -407798542;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 238637961:
                case 1860599670:
                    C3019.m9255();
                    if (C3537.f11231 < 0) {
                        iM6981 = (C0630.m2566("ᩴۗ") ^ i4) * (-77);
                        i = ((iM6981 ^ i3) * (-26207)) ^ 496625392;
                        i2 = 1749579100;
                    } else {
                        iM6981 = C2105.m6981("ۙ۟") ^ i3;
                        i = ((iM6981 ^ i4) * 31161) ^ (-2079994796);
                        i2 = 1143732054;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 604024879:
                case 776175847:
                    i7 = s + 1;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("۫ܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-14507)) ^ 607390765;
                        i2 = 1536257337;
                    } else {
                        iM6981 = (C0630.m2566("᩹᩵") ^ i3) * 115;
                        i = ((iM6981 ^ i4) * (-29847)) ^ 337162173;
                        i2 = -2039117163;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 731818294:
                case 854854737:
                    C3683.m11210(broadcastReceiver, strM9934);
                    applicationM1842 = C0382.m1842();
                    if (C4616.m13552() != 0) {
                        iM6981 = C2105.m6981("ۙ۟") ^ i3;
                        i = ((iM6981 ^ i4) * 31161) ^ (-2079994796);
                        i2 = 1143732054;
                    } else {
                        iM6981 = C0630.m2566("ۖۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 29755) ^ 173933798;
                        i2 = -86997119;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    i9 = s * s2;
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C0630.m2566("ᩴۗ") ^ i4) * (-77);
                        i = ((iM6981 ^ i3) * (-26207)) ^ 496625392;
                        i2 = 1749579100;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۙ֡")) * (-23);
                        i = ((iM6981 ^ i4) * (-27649)) ^ 1969425687;
                        i2 = 1577660231;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ad A[PHI: r11 r12 r17
      0x00ad: PHI (r11v3 short[]) = (r11v2 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:26:0x00ab, B:16:0x006e, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:26:0x00ab, B:16:0x006e, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r17v24 int) = (r17v19 int), (r17v21 int), (r17v26 int) binds: [B:26:0x00ab, B:16:0x006e, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01d8 A[PHI: r4 r17
      0x01d8: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short), (r4v1 short) binds: [B:53:0x01d6, B:18:0x0072, B:16:0x006e, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r17v22 int) = (r17v9 int), (r17v20 int), (r17v21 int), (r17v23 int) binds: [B:53:0x01d6, B:18:0x0072, B:16:0x006e, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x022b A[PHI: r7 r8 r13 r17
      0x022b: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:61:0x0229, B:45:0x0198, B:13:0x0066, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r8v3 short) = (r8v1 short), (r8v2 short), (r8v1 short), (r8v1 short) binds: [B:61:0x0229, B:45:0x0198, B:13:0x0066, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r13v2 int) = (r13v1 int), (r13v1 int), (r13v1 int), (r13v4 int) binds: [B:61:0x0229, B:45:0x0198, B:13:0x0066, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r17v27 int) = (r17v7 int), (r17v11 int), (r17v23 int), (r17v30 int) binds: [B:61:0x0229, B:45:0x0198, B:13:0x0066, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x027e A[PHI: r1 r2 r3 r5 r6 r9 r17
      0x027e: PHI (r1v3 short[]) = (r1v2 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:69:0x027c, B:65:0x025a, B:57:0x020a, B:49:0x01b8, B:41:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char), (r2v1 char), (r2v1 char) binds: [B:69:0x027c, B:65:0x025a, B:57:0x020a, B:49:0x01b8, B:41:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r3v3 short) = (r3v1 short), (r3v1 short), (r3v2 short), (r3v1 short), (r3v1 short) binds: [B:69:0x027c, B:65:0x025a, B:57:0x020a, B:49:0x01b8, B:41:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:69:0x027c, B:65:0x025a, B:57:0x020a, B:49:0x01b8, B:41:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:69:0x027c, B:65:0x025a, B:57:0x020a, B:49:0x01b8, B:41:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v3 int) binds: [B:69:0x027c, B:65:0x025a, B:57:0x020a, B:49:0x01b8, B:41:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r17v12 int) = (r17v5 int), (r17v6 int), (r17v8 int), (r17v10 int), (r17v13 int) binds: [B:69:0x027c, B:65:0x025a, B:57:0x020a, B:49:0x01b8, B:41:0x0173] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Application m14335() {
        int iM6981;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short s3 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1332432662;
        int i11 = AbstractC2021.f6743;
        int i12 = C0630.f2410;
        int iM2566 = C0630.m2566("᩻ܰ") ^ i12;
        int i13 = ((iM2566 ^ i11) * 24071) ^ 615627179;
        int i14 = iM2566 ^ 1541562112;
        ApplicationC20075 applicationC20075 = null;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i11) * 26139) >> 31));
            switch (i15) {
                case -2128225208:
                case 22121555:
                    i15 = i15;
                    sArr = f15520;
                    c = 677;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ۨ֫") ^ i11;
                        i = ((iM6981 ^ i12) * (-13137)) ^ (-417822838);
                        i2 = 652523060;
                    } else {
                        iM6981 = (C2105.m6981("۬ۢ") + i11) * (-65);
                        i = ((iM6981 ^ i12) * (-3753)) ^ (-1992548411);
                        i2 = 252433704;
                    }
                    int i16 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i16;
                    break;
                case -2008596144:
                case -1419630096:
                    i15 = i15;
                    i5 = i3 + i4;
                    s3 = 1;
                    if (C0483.m2121()) {
                        iM6981 = C0630.m2566("ᩳ۫") ^ i11;
                        i = ((iM6981 ^ i12) * (-21051)) ^ (-142835037);
                        i2 = -2021281617;
                    } else {
                        iM6981 = C2105.m6981("ܺۙ") ^ i11;
                        i = ((iM6981 ^ i12) * (-10697)) ^ 863680950;
                        i2 = 1620721055;
                    }
                    int i17 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i17;
                    break;
                case -1877906945:
                case 191774770:
                    i15 = i15;
                    sArr2 = f15520;
                    i8 = 678;
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("ܰۡ") ^ i12;
                        i = ((iM6981 ^ i11) * (-26875)) ^ 1637238423;
                        i2 = -2004965538;
                    } else {
                        iM6981 = (i11 - C0630.m2566("ۡ֡")) * 47;
                        i = ((iM6981 ^ i12) * 4555) ^ 1582895099;
                        i2 = 387467983;
                    }
                    int i18 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i18;
                    break;
                case -1496750351:
                case -518667802:
                    i15 = i15;
                    applicationC20075 = f15522;
                    if (applicationC20075 != null) {
                        iM6981 = (i11 - C2105.m6981("۟᩵")) * 71;
                        i = ((iM6981 ^ i12) * (-5203)) ^ (-1747257706);
                        i2 = 1878687300;
                    } else {
                        iM6981 = (i11 - C2105.m6981("ۗ۬")) * 85;
                        i = ((iM6981 ^ i12) * 505) ^ 513855661;
                        i2 = -852053228;
                    }
                    int i19 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i19;
                    break;
                case -1359183506:
                case 444520988:
                    i15 = i15;
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("᩷ۜ") ^ i12;
                        i = ((iM6981 ^ i11) * 2649) ^ (-1532651466);
                        i2 = -1310586299;
                    } else {
                        iM6981 = C2105.m6981("ܺۙ") ^ i11;
                        i = ((iM6981 ^ i12) * (-10697)) ^ 863680950;
                        i2 = 1620721055;
                    }
                    int i110 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i110;
                    break;
                case -1226657104:
                case -63542194:
                    i15 = i15;
                    i3 = s * s2;
                    i4 = 1;
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("ۨ֫") ^ i11;
                        i = ((iM6981 ^ i12) * (-13137)) ^ (-417822838);
                        i2 = 652523060;
                    } else {
                        iM6981 = C2105.m6981("᩺۠") ^ i11;
                        i = ((iM6981 ^ i12) * (-27129)) ^ (-134223595);
                        i2 = -554764939;
                    }
                    int i111 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i111;
                    break;
                case -1178923522:
                case 109203271:
                    i15 = i15;
                    s = sArr[c];
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("ۨ֫") ^ i11;
                        i = ((iM6981 ^ i12) * (-13137)) ^ (-417822838);
                        i2 = 652523060;
                    } else {
                        iM6981 = (C0630.m2566("ܰۨ") + i11) * (-71);
                        i = ((iM6981 ^ i12) * (-4681)) ^ (-1237533709);
                        i2 = -1913192561;
                    }
                    int i112 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i112;
                    break;
                case -1102317928:
                case 663635290:
                    C21923.m49338(C3746.m11357(sArr2, i8, i9, i7));
                    throw null;
                case -1038353648:
                case 1727077855:
                    return applicationC20075;
                case -1012563604:
                case 2072281900:
                    i15 = i15;
                    s2 = 2;
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("᩷ۜ") ^ i12;
                        i = ((iM6981 ^ i11) * 2649) ^ (-1532651466);
                        i2 = -1310586299;
                    } else {
                        iM6981 = C2105.m6981("ܰ᩸") ^ i12;
                        i = ((iM6981 ^ i11) * (-7601)) ^ (-723385731);
                        i2 = -330128194;
                    }
                    int i113 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i113;
                    break;
                case -785644044:
                case 823817734:
                    i15 = i15;
                    i6 = s + s3;
                    if (C0382.m1848()) {
                        iM6981 = C0630.m2566("ۨ֫") ^ i11;
                        i = ((iM6981 ^ i12) * (-13137)) ^ (-417822838);
                        i2 = 652523060;
                    } else {
                        iM6981 = (C2105.m6981("ۛܽ") + i12) * (-117);
                        i = ((iM6981 ^ i11) * (-2995)) ^ (-84073350);
                        i2 = -1424339882;
                    }
                    int i114 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i114;
                    break;
                case -758207063:
                case -393155462:
                    i15 = i15;
                    C4616.m13552();
                    iM6981 = C0630.m2566("᩷ۜ") ^ i12;
                    i = ((iM6981 ^ i11) * 2649) ^ (-1532651466);
                    i2 = -1310586299;
                    int i115 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i115;
                    break;
                case -346956218:
                case 2107083248:
                    C21923.m49329();
                    C0382.m1848();
                    return null;
                case -244153873:
                case 1457305597:
                    i15 = i15;
                    if (C0630.m2564()) {
                        iM6981 = C0630.m2566("ۨ֫") ^ i11;
                        i = ((iM6981 ^ i12) * (-13137)) ^ (-417822838);
                        i2 = 652523060;
                    } else {
                        iM6981 = (i12 - C0630.m2566("ۜ᩹")) * 47;
                        i = ((iM6981 ^ i11) * (-11873)) ^ 172377076;
                        i2 = 1484671391;
                    }
                    int i116 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i116;
                    break;
                case -135723033:
                case 1102553464:
                    i7 = 23208;
                    iM6981 = C2105.m6981("ۗ᩺") ^ i12;
                    i = ((iM6981 ^ i11) * (-733)) ^ 271189637;
                    i2 = -1146765277;
                    int i117 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i117;
                    break;
                case -30519784:
                case 1489613712:
                    i15 = i15;
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("۫ܽ") ^ i12;
                        i = ((iM6981 ^ i11) * (-26815)) ^ (-1540551026);
                        i2 = 1546812851;
                    } else {
                        iM6981 = C2105.m6981("ܺۙ") ^ i11;
                        i = ((iM6981 ^ i12) * (-10697)) ^ 863680950;
                        i2 = 1620721055;
                    }
                    int i118 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i118;
                    break;
                case 665090318:
                case 1109439147:
                    i15 = i15;
                    if (i5 - (i6 * i6) > 0) {
                        iM6981 = C0630.m2566("ۧ֡") ^ i11;
                        i = ((iM6981 ^ i12) * 6263) ^ 551190907;
                        i2 = 559425361;
                    } else {
                        iM6981 = (C2105.m6981("ۨ᩸") ^ i12) * 59;
                        i = ((iM6981 ^ i11) * (-32541)) ^ (-273612084);
                        i2 = -1491011798;
                    }
                    int i119 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i119;
                    break;
                case 909137091:
                case 989357795:
                    i15 = i15;
                    if (C3663.f11553) {
                        iM6981 = C2105.m6981("ܰۡ") ^ i12;
                        i = ((iM6981 ^ i11) * (-26875)) ^ 1637238423;
                        i2 = -2004965538;
                    } else {
                        iM6981 = C0630.m2566("᩷ۜ") ^ i12;
                        i = ((iM6981 ^ i11) * 2649) ^ (-1532651466);
                        i2 = -1310586299;
                    }
                    int i1110 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i1110;
                    break;
                case 1327416548:
                case 1884217972:
                    AbstractC2021.m6574();
                    if (C3911.f12484 < 0) {
                        i15 = i15;
                        iM6981 = C2105.m6981("ܰۡ") ^ i12;
                        i = ((iM6981 ^ i11) * (-26875)) ^ 1637238423;
                        i2 = -2004965538;
                    } else {
                        iM6981 = C2105.m6981("۫ۜ") ^ i12;
                        i15 = i15;
                        i = ((iM6981 ^ i11) * 18111) ^ (-481578466);
                        i2 = 1087301643;
                    }
                    int i1111 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i1111;
                    break;
                case 1993798426:
                case 2012377928:
                    i7 = 64950;
                    iM6981 = C2105.m6981("ۗ᩺") ^ i12;
                    i = ((iM6981 ^ i11) * (-733)) ^ 271189637;
                    i2 = -1146765277;
                    int i1112 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i1112;
                    break;
                default:
                    i15 = i15;
                    i9 = 7;
                    if (RunnableC1108.f4040) {
                        iM6981 = (C2105.m6981("᩷᩸") + i12) * 75;
                        i = ((iM6981 ^ i11) * (-17215)) ^ (-678689108);
                        i2 = 746963957;
                    } else {
                        iM6981 = C2105.m6981("ܺۙ") ^ i11;
                        i = ((iM6981 ^ i12) * (-10697)) ^ 863680950;
                        i2 = 1620721055;
                    }
                    int i1113 = i15;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i10 = i1113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m14329(final View view) {
        Runnable runnable = null;
        int i = 454541698;
        int i2 = C2958.f9394;
        int i3 = C0630.f2410;
        int iM6981 = C2105.m6981("᩵᩹") ^ i3;
        int i4 = ((iM6981 ^ i2) * 805) ^ (-128025258);
        int i5 = -760572033;
        while (true) {
            i = ((((i ^ i2) * 22773) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2132328413:
                case -1952064837:
                    break;
                case -2046451466:
                case -1372175774:
                    RunnableC1937.m6387();
                    C4263.m12819();
                    break;
                case -2011613539:
                case 1681816866:
                    if (view != null) {
                        iM6981 = (C0630.m2566("ۚۗ") + i2) * (-19);
                        i4 = ((iM6981 ^ i3) * (-6003)) ^ (-635242146);
                        i5 = 2114211320;
                    } else {
                        iM6981 = (C2105.m6981("᩷ۜ") + i3) * 55;
                        i4 = ((iM6981 ^ i2) * 491) ^ (-314983818);
                        i5 = -61709314;
                    }
                    break;
                case -1927169682:
                case 768653048:
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("᩷ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14033) ^ 682086701;
                        i5 = 615594825;
                    } else {
                        iM6981 = C0630.m2566("ܰᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11731)) ^ (-1909184728);
                        i5 = 1097569853;
                    }
                    break;
                case -1730662605:
                case -1316451135:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("ۘ᩸") + i3) * 91;
                        i4 = ((iM6981 ^ i2) * (-24621)) ^ (-1334717661);
                        i5 = 1845572802;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۠ۘ")) * 57;
                        i4 = ((iM6981 ^ i2) * (-2415)) ^ 940023981;
                        i5 = -2095510238;
                    }
                    break;
                case -1719435244:
                case -41704665:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM6981 = (C2105.m6981("۫֡") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * (-32465)) ^ (-1982854404);
                        i5 = -1119611953;
                    } else {
                        iM6981 = (i2 - C2105.m6981("۫ۜ")) * 41;
                        i4 = ((iM6981 ^ i3) * 19409) ^ (-1730546914);
                        i5 = -293747870;
                    }
                    break;
                case -1651363728:
                case 857688890:
                    if (C0483.f2088 >= 0) {
                        iM6981 = C0630.m2566("ۚ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12223) ^ (-587517145);
                        i5 = 1931973821;
                    } else {
                        iM6981 = C2105.m6981("ۡ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2601)) ^ 223295400;
                        i5 = 1845112643;
                    }
                    break;
                case -1581526554:
                case -866478242:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C0630.m2566("ۘ᩸") + i3) * 91;
                        i4 = ((iM6981 ^ i2) * (-24621)) ^ (-1334717661);
                        i5 = 1845572802;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۙ") ^ i2) * (-67);
                        i4 = ((iM6981 ^ i3) * 6043) ^ (-1184644002);
                        i5 = -168727962;
                    }
                    break;
                case -1530041336:
                case -1305656964:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C2105.m6981("ۘܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32703) ^ 1139301700;
                        i5 = -1378720167;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ᩴܿ")) * 51;
                        i4 = ((iM6981 ^ i2) * 10043) ^ (-1022007074);
                        i5 = 736115959;
                    }
                    break;
                case -1408478380:
                case -761562566:
                    view.postDelayed(runnable, 250L);
                    iM6981 = (C2105.m6981("᩷ۜ") + i3) * 55;
                    i4 = ((iM6981 ^ i2) * 491) ^ (-314983818);
                    i5 = -61709314;
                    break;
                case -1336030020:
                case 1212044024:
                    runnable = new Runnable() { // from class: l.᩶᩸᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4925.m14328(0, view);
                        }
                    };
                    if (RunnableC1108.f4040) {
                        iM6981 = (C0630.m2566("۫᩶") ^ i2) * 119;
                        i4 = ((iM6981 ^ i3) * 17511) ^ 2134694907;
                        i5 = -425072753;
                    } else {
                        iM6981 = (C0630.m2566("ۘ᩸") + i3) * 91;
                        i4 = ((iM6981 ^ i2) * (-24621)) ^ (-1334717661);
                        i5 = 1845572802;
                    }
                    break;
                case -1193636013:
                case 2114121548:
                    C0483.m2121();
                    C2105.m6982();
                    iM6981 = C0630.m2566("ۚ᩶") ^ i2;
                    i4 = ((iM6981 ^ i3) * 12223) ^ (-587517145);
                    i5 = 1931973821;
                    break;
                case -370925894:
                case 467370040:
                    if (C0382.m1848()) {
                        iM6981 = (C0630.m2566("ۘ᩸") + i3) * 91;
                        i4 = ((iM6981 ^ i2) * (-24621)) ^ (-1334717661);
                        i5 = 1845572802;
                    } else {
                        iM6981 = C2105.m6981("ܰ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12721)) ^ (-430506266);
                        i5 = -1489783509;
                    }
                    break;
                case -132981147:
                case 1492150188:
                    if (!AbstractC2021.m6574()) {
                        iM6981 = (C0630.m2566("ۘ᩸") + i3) * 91;
                        i4 = ((iM6981 ^ i2) * (-24621)) ^ (-1334717661);
                        i5 = 1845572802;
                    } else {
                        iM6981 = C0630.m2566("᩷ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14033) ^ 682086701;
                        i5 = 615594825;
                    }
                    break;
                case 29997242:
                case 997910518:
                    if (C4159.m12565() >= 0) {
                        iM6981 = C0630.m2566("ۚ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12223) ^ (-587517145);
                        i5 = 1931973821;
                    } else {
                        iM6981 = C2105.m6981("᩸۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13439)) ^ 502365853;
                        i5 = 1419390981;
                    }
                    break;
                case 340285483:
                case 960958782:
                    if (C1504.f5354) {
                        iM6981 = C0630.m2566("᩷ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14033) ^ 682086701;
                        i5 = 615594825;
                    } else {
                        iM6981 = C0630.m2566("᩸᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9917) ^ (-1741716339);
                        i5 = 1772940158;
                    }
                    break;
                case 1396233216:
                case 2116016172:
                    C2272.m7503();
                    if (C4075.m12263() > 0) {
                        iM6981 = C0630.m2566("᩷ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14033) ^ 682086701;
                        i5 = 615594825;
                    } else {
                        iM6981 = C0630.m2566("ۚ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12223) ^ (-587517145);
                        i5 = 1931973821;
                    }
                    break;
                default:
                    C3537.m10746();
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("ۘܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32703) ^ 1139301700;
                        i5 = -1378720167;
                    } else {
                        iM6981 = C0630.m2566("᩷ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14033) ^ 682086701;
                        i5 = 615594825;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14318(boolean z) {
        f15525 = z;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final boolean m14331() {
        return f15525;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x020d A[PHI: r3 r4 r16
      0x020d: PHI (r3v3 short) = (r3v2 short), (r3v4 short) binds: [B:64:0x020b, B:55:0x01b5] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r4v3 short) = (r4v2 short), (r4v4 short) binds: [B:64:0x020b, B:55:0x01b5] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r16v6 java.lang.CharSequence) = (r16v4 java.lang.CharSequence), (r16v7 java.lang.CharSequence) binds: [B:64:0x020b, B:55:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x025a A[PHI: r1 r7 r16
      0x025a: PHI (r1v6 short[]) = (r1v5 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:69:0x0258, B:47:0x0155, B:15:0x004b, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:69:0x0258, B:47:0x0155, B:15:0x004b, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r16v25 java.lang.CharSequence) = 
      (r16v3 java.lang.CharSequence)
      (r16v9 java.lang.CharSequence)
      (r16v19 java.lang.CharSequence)
      (r16v28 java.lang.CharSequence)
     binds: [B:69:0x0258, B:47:0x0155, B:15:0x004b, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (l.C4117.m12364() == 0) goto L15;
     */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CharSequence m14333(int i) {
        CharSequence charSequence;
        int iM6981;
        int i2;
        int iM2566;
        int i3;
        int i4;
        CharSequence text = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        short s3 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 1947328627;
        int i10 = C0630.f2410;
        int i11 = RunnableC0588.f2309;
        int iM6982 = C2105.m6981("ܰܳ") ^ i11;
        int i12 = ((iM6982 ^ i10) * (-1889)) ^ 1387030847;
        int i13 = 2030265953;
        while (true) {
            int i14 = iM6982 ^ i13;
            while (true) {
                i9 = ((((i9 ^ i10) * (-3037)) >> 31) & i12) ^ i14;
                switch (i9) {
                    case -2000827390:
                    case 1421380998:
                        charSequence = text;
                        s = sArr[c];
                        s2 = 33540;
                        if (C2126.m7040()) {
                            iM6981 = (C0630.m2566("۟ۜ") + i11) * 73;
                            i12 = ((iM6981 ^ i10) * 27089) ^ (-812048510);
                            i2 = -1780935553;
                        } else {
                            iM6981 = C0630.m2566("᩷ܳ") ^ i11;
                            i12 = ((iM6981 ^ i10) * 31263) ^ (-210624218);
                            i2 = -1368996032;
                        }
                        i14 = iM6981 ^ i2;
                        text = charSequence;
                        break;
                    case -1664924836:
                    case 1481520932:
                        RunnableC1108.m3790();
                        if (C0964.f3626 == 0) {
                            iM6982 = (C2105.m6981("ۡ᩻") ^ i11) * 13;
                            i12 = ((iM6982 ^ i10) * 2233) ^ 1859917894;
                            i13 = -1336125581;
                        }
                        charSequence = text;
                        iM6981 = C2105.m6981("ۗۛ") ^ i10;
                        i12 = ((iM6981 ^ i11) * 14481) ^ 1831932335;
                        i2 = 709942291;
                        i14 = iM6981 ^ i2;
                        text = charSequence;
                        break;
                    case -1555003950:
                    case -725383455:
                        i7 = 37266;
                        iM2566 = (C0630.m2566("᩻ۗ") + i10) * 83;
                        charSequence = text;
                        i3 = ((iM2566 ^ i11) * (-26225)) ^ (-354346038);
                        i4 = 77383627;
                        i14 = iM2566 ^ i4;
                        i12 = i3;
                        text = charSequence;
                        break;
                    case -1427892832:
                    case 1828009581:
                        text = C3432.m10479().getText(i);
                        if (C2105.m6982() != 0) {
                            iM2566 = C0630.m2566("ۧܳ") ^ i10;
                            charSequence = text;
                            i3 = ((iM2566 ^ i11) * 5365) ^ 387065329;
                            i4 = 50201934;
                        } else {
                            iM2566 = C0630.m2566("۠֫") ^ i11;
                            charSequence = text;
                            i3 = ((iM2566 ^ i10) * 30009) ^ (-652098743);
                            i4 = 1577256803;
                        }
                        i14 = iM2566 ^ i4;
                        i12 = i3;
                        text = charSequence;
                        break;
                    case -1394887477:
                    case 1887592275:
                        C4159.m12575(text, C3663.m11162(sArr2, i8, 12, i7));
                        return text;
                    case -1389741472:
                    case 1475894920:
                        charSequence = text;
                        if (i5 - (i6 * i6) > 0) {
                            iM6981 = C2105.m6981("ۜ۠") ^ i11;
                            i12 = ((iM6981 ^ i10) * (-20091)) ^ 1695092626;
                            i2 = 1295557322;
                        } else {
                            iM6981 = C2105.m6981("ۡ᩷") ^ i11;
                            i12 = ((iM6981 ^ i10) * 30125) ^ 340493724;
                            i2 = -593406237;
                        }
                        i14 = iM6981 ^ i2;
                        text = charSequence;
                        break;
                    case -940039673:
                    case 26766044:
                        sArr2 = f15520;
                        if (C1773.f6144 > 0) {
                            iM6982 = C0630.m2566("ۖ۠") ^ i10;
                            i12 = ((iM6982 ^ i11) * 13875) ^ (-777923891);
                            i13 = 14343872;
                        }
                        charSequence = text;
                        iM6981 = C0630.m2566("ۛۗ") ^ i10;
                        i12 = ((iM6981 ^ i11) * 23137) ^ (-946773807);
                        i2 = 616454332;
                        i14 = iM6981 ^ i2;
                        text = charSequence;
                        break;
                    case -932951232:
                    case -676364714:
                        charSequence = text;
                        i6 = s + s3;
                        if (C1294.m4372() <= 0) {
                            iM6981 = C2105.m6981("ۗۛ") ^ i10;
                            i12 = ((iM6981 ^ i11) * 14481) ^ 1831932335;
                            i2 = 709942291;
                        } else {
                            iM6981 = (C0630.m2566("ۡܶ") ^ i10) * 21;
                            i12 = ((iM6981 ^ i11) * (-11317)) ^ 348573032;
                            i2 = -581039793;
                        }
                        i14 = iM6981 ^ i2;
                        text = charSequence;
                        break;
                    case -828430466:
                    case 933102451:
                        charSequence = text;
                        i5 = s * s2;
                        s3 = 8385;
                        if (C0422.f1886 <= 0) {
                            iM6981 = C0630.m2566("ۛۗ") ^ i10;
                            i12 = ((iM6981 ^ i11) * 23137) ^ (-946773807);
                            i2 = 616454332;
                        } else {
                            iM6981 = (C0630.m2566("᩹۠") ^ i10) * (-43);
                            i12 = ((iM6981 ^ i11) * 32029) ^ 480678276;
                            i2 = 342113731;
                        }
                        i14 = iM6981 ^ i2;
                        text = charSequence;
                        break;
                    case -520585267:
                    case 1579359652:
                        charSequence = text;
                        sArr = f15520;
                        if (C4159.f13567) {
                            iM6981 = (C2105.m6981("ۤ᩻") + i10) * (-31);
                            i12 = ((iM6981 ^ i11) * 14377) ^ (-1801577597);
                            i2 = 411294605;
                        } else {
                            iM6981 = C2105.m6981("ۗۛ") ^ i10;
                            i12 = ((iM6981 ^ i11) * 14481) ^ 1831932335;
                            i2 = 709942291;
                        }
                        i14 = iM6981 ^ i2;
                        text = charSequence;
                        break;
                    case -419414699:
                    case 1163544314:
                        i7 = 47725;
                        iM2566 = (C0630.m2566("᩻ۗ") + i10) * 83;
                        charSequence = text;
                        i3 = ((iM2566 ^ i11) * (-26225)) ^ (-354346038);
                        i4 = 77383627;
                        i14 = iM2566 ^ i4;
                        i12 = i3;
                        text = charSequence;
                        break;
                    case -134034561:
                    case 1847266461:
                        charSequence = text;
                        c = 664;
                        if (C4075.f12947 < 0) {
                            iM6981 = C0630.m2566("ᩳۤ") ^ i11;
                            i12 = ((iM6981 ^ i10) * (-32691)) ^ 2073949020;
                            i2 = -851425032;
                            i14 = iM6981 ^ i2;
                            text = charSequence;
                        } else {
                            text = charSequence;
                            iM2566 = C0630.m2566("ۧܳ") ^ i10;
                            charSequence = text;
                            i3 = ((iM2566 ^ i11) * 5365) ^ 387065329;
                            i4 = 50201934;
                            i14 = iM2566 ^ i4;
                            i12 = i3;
                            text = charSequence;
                        }
                        break;
                    case -121021701:
                    case 1642301026:
                        C0630.m2564();
                        break;
                    case 483057122:
                    case 2114874534:
                        C0422.m1963();
                        C4117.m12364();
                        charSequence = text;
                        iM6981 = C2105.m6981("ۗۛ") ^ i10;
                        i12 = ((iM6981 ^ i11) * 14481) ^ 1831932335;
                        i2 = 709942291;
                        i14 = iM6981 ^ i2;
                        text = charSequence;
                        break;
                    case 606717784:
                    case 940039380:
                        charSequence = text;
                        if (C2167.f7158 >= 0) {
                            iM6981 = (C0630.m2566("۟ۜ") + i11) * 73;
                            i12 = ((iM6981 ^ i10) * 27089) ^ (-812048510);
                            i2 = -1780935553;
                        } else {
                            iM6981 = (C0630.m2566("᩻ۤ") + i10) * (-101);
                            i12 = ((iM6981 ^ i11) * 9071) ^ (-1393375932);
                            i2 = -823539606;
                        }
                        i14 = iM6981 ^ i2;
                        text = charSequence;
                        break;
                    case 724981979:
                    case 2093190803:
                        if (C1420.f5096 <= 0) {
                            iM6982 = (C2105.m6981("ۡ᩻") ^ i11) * 13;
                            i12 = ((iM6982 ^ i10) * 2233) ^ 1859917894;
                            i13 = -1336125581;
                        }
                        iM2566 = C0630.m2566("ۧܳ") ^ i10;
                        charSequence = text;
                        i3 = ((iM2566 ^ i11) * 5365) ^ 387065329;
                        i4 = 50201934;
                        i14 = iM2566 ^ i4;
                        i12 = i3;
                        text = charSequence;
                        break;
                    case 804368707:
                    case 1893788081:
                        C4117.m12364();
                        return null;
                    case 1516956492:
                    case 1870110584:
                        i8 = 665;
                        if (C0630.f2410 > 0) {
                            iM6982 = (C0630.m2566("᩹ܳ") ^ i11) * 85;
                            i12 = ((iM6982 ^ i10) * 29067) ^ (-648296499);
                            i13 = 1864066442;
                        }
                        iM2566 = C0630.m2566("ۧܳ") ^ i10;
                        charSequence = text;
                        i3 = ((iM2566 ^ i11) * 5365) ^ 387065329;
                        i4 = 50201934;
                        i14 = iM2566 ^ i4;
                        i12 = i3;
                        text = charSequence;
                        break;
                    default:
                        charSequence = text;
                        if (C3663.f11553) {
                            iM6981 = C2105.m6981("ۗۛ") ^ i10;
                            i12 = ((iM6981 ^ i11) * 14481) ^ 1831932335;
                            i2 = 709942291;
                        } else {
                            iM6981 = (i11 - C2105.m6981("֡ۤ")) * 37;
                            i12 = ((iM6981 ^ i10) * (-19193)) ^ (-1550854246);
                            i2 = 1702394788;
                        }
                        i14 = iM6981 ^ i2;
                        text = charSequence;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final void m14302() {
        f15524 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final boolean m14339() {
        return f15524;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01ff A[PHI: r2 r23 r24
      0x01ff: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String), (r2v1 java.lang.String) binds: [B:52:0x01fd, B:44:0x01ae, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r23v40 java.lang.String) = (r23v32 java.lang.String), (r23v35 java.lang.String), (r23v41 java.lang.String) binds: [B:52:0x01fd, B:44:0x01ae, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r24v3 java.lang.String) = (r24v2 java.lang.String), (r24v1 java.lang.String), (r24v1 java.lang.String) binds: [B:52:0x01fd, B:44:0x01ae, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x035b A[PHI: r1 r5 r13 r14 r15 r16 r23
      0x035b: PHI (r1v15 java.lang.Object) = (r1v1 java.lang.Object), (r1v2 java.lang.Object), (r1v1 java.lang.Object), (r1v16 java.lang.Object) binds: [B:11:0x005f, B:83:0x0359, B:56:0x0239, B:48:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r5v3 short[]) = (r5v2 short[]), (r5v2 short[]), (r5v2 short[]), (r5v4 short[]) binds: [B:11:0x005f, B:83:0x0359, B:56:0x0239, B:48:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r13v3 short[]) = (r13v1 short[]), (r13v1 short[]), (r13v2 short[]), (r13v1 short[]) binds: [B:11:0x005f, B:83:0x0359, B:56:0x0239, B:48:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:11:0x005f, B:83:0x0359, B:56:0x0239, B:48:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r15v3 int) = (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int) binds: [B:11:0x005f, B:83:0x0359, B:56:0x0239, B:48:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r16v6 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:11:0x005f, B:83:0x0359, B:56:0x0239, B:48:0x01d5] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r23v33 java.lang.String) = (r23v7 java.lang.String), (r23v16 java.lang.String), (r23v31 java.lang.String), (r23v34 java.lang.String) binds: [B:11:0x005f, B:83:0x0359, B:56:0x0239, B:48:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14308(int i, CharSequence charSequence) {
        int iM2566;
        int i2;
        int i3;
        Object obj;
        int iM6981;
        int i4;
        int i5;
        int iM6982;
        int i6;
        int i7;
        String str;
        Object objM14326 = null;
        String strM28025 = null;
        ClipboardManager clipboardManager = null;
        String strM11225 = null;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short[] sArr = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 2019572688;
        int i12 = C0050.f910;
        int i13 = ViewOnClickListenerC1958.f6529;
        int iM6983 = C2105.m6981("ܽܽ") ^ i12;
        int i14 = ((iM6983 ^ i13) * 925) ^ 1585991882;
        int i15 = iM6983 ^ (-671196668);
        short[] sArr2 = null;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        int i18 = 0;
        int i19 = 0;
        String strM13542 = null;
        int i20 = 0;
        short[] sArr3 = null;
        short[] sArr4 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-3005)) >> 31));
            switch (i11) {
                case -2137402158:
                case -1293924087:
                    sArr2 = f15520;
                    i16 = 237;
                    i17 = 3;
                    if (C2520.m8026()) {
                        iM2566 = C2105.m6981("ۜۨ") ^ i12;
                        i2 = ((iM2566 ^ i13) * (-4959)) ^ 280529564;
                        i3 = 1912755604;
                    } else {
                        iM2566 = (C0630.m2566("᩸֡") + i13) * (-19);
                        i2 = ((iM2566 ^ i12) * (-7897)) ^ 815752438;
                        i3 = 1841486017;
                    }
                    i15 = iM2566 ^ i3;
                    i14 = i2;
                    break;
                case -2066982463:
                case -560535590:
                    strM11225 = strM11225;
                    int i21 = i18 + i19;
                    i20 = i21 + i21;
                    s2 = 2664;
                    if (C1128.f4106 > 0) {
                        iM6982 = (i13 - C0630.m2566("᩷۟")) * 21;
                        i6 = ((iM6982 ^ i12) * 7621) ^ 975720251;
                        i7 = -157719547;
                        str = strM11225;
                        i15 = iM6982 ^ i7;
                        i14 = i6;
                        strM11225 = str;
                    } else {
                        strM11225 = strM11225;
                        int iM2567 = (i12 - C0630.m2566("ۤܶ")) * (-11);
                        obj = objM14326;
                        i4 = ((iM2567 ^ i13) * 24699) ^ (-2051729390);
                        i15 = iM2567 ^ 915590484;
                        i14 = i4;
                        objM14326 = obj;
                    }
                    break;
                case -2058751079:
                case 1305540069:
                    C11340.m28031();
                    C1005.m3501();
                    break;
                case -1907657103:
                case 764578357:
                    break;
                case -1901620397:
                case -489266881:
                    C0714.m2805();
                    C3911.m11924();
                    strM11225 = strM11225;
                    iM6982 = (i13 - C2105.m6981("ۙܳ")) * (-99);
                    i6 = ((iM6982 ^ i12) * 21819) ^ 1114531370;
                    i7 = 995928844;
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                case -1891256102:
                case -1394629087:
                    strM11225 = C3683.m11225(sArr2, i16, i17, i8);
                    if (C3911.f12484 < 0) {
                        iM2566 = C0630.m2566("᩷ܿ") ^ i12;
                        i2 = ((iM2566 ^ i13) * (-13693)) ^ 700767948;
                        i3 = -217615592;
                        i15 = iM2566 ^ i3;
                        i14 = i2;
                    } else {
                        int iM2568 = (i12 - C0630.m2566("ۤܶ")) * (-11);
                        obj = objM14326;
                        i4 = ((iM2568 ^ i13) * 24699) ^ (-2051729390);
                        i15 = iM2568 ^ 915590484;
                        i14 = i4;
                        objM14326 = obj;
                    }
                    break;
                case -1739116343:
                case 727425263:
                    obj = objM14326;
                    strM11225 = strM11225;
                    sArr3 = f15520;
                    if (RunnableC0588.f2309 < 0) {
                        iM6981 = C2105.m6981("ۤ۫") ^ i12;
                        i4 = ((iM6981 ^ i13) * 27793) ^ (-104687466);
                        i5 = 334599161;
                        int i22 = iM6981 ^ i5;
                        strM11225 = strM11225;
                        i15 = i22;
                        i14 = i4;
                        objM14326 = obj;
                    } else {
                        objM14326 = obj;
                        iM6982 = C0630.m2566("۟ۜ") ^ i13;
                        i6 = ((iM6982 ^ i12) * (-20761)) ^ 260364437;
                        i7 = 1561108285;
                        str = strM11225;
                        i15 = iM6982 ^ i7;
                        i14 = i6;
                        strM11225 = str;
                    }
                    break;
                case -1604857990:
                case 2048901732:
                    strM11225 = strM11225;
                    sArr = f15520;
                    i9 = 162;
                    i10 = 9;
                    if (C3432.f10845 >= 0) {
                        iM6982 = C0630.m2566("۟ۜ") ^ i13;
                        i6 = ((iM6982 ^ i12) * (-20761)) ^ 260364437;
                        i7 = 1561108285;
                    } else {
                        iM6982 = (i12 - C2105.m6981("۬᩺")) * 47;
                        i6 = ((iM6982 ^ i13) * (-13967)) ^ 928260315;
                        i7 = -1787157348;
                    }
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                case -1562902167:
                case 1038621358:
                    i8 = 54188;
                    iM6982 = (i13 - C0630.m2566("ۤܽ")) * (-109);
                    i6 = ((iM6982 ^ i12) * 829) ^ 1979807539;
                    i7 = -1922641024;
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                case -1492726379:
                case 308541337:
                    if (C22628.f73083 <= 0) {
                        strM11225 = strM11225;
                        iM6982 = C0630.m2566("۟ۜ") ^ i13;
                        i6 = ((iM6982 ^ i12) * (-20761)) ^ 260364437;
                        i7 = 1561108285;
                        str = strM11225;
                        i15 = iM6982 ^ i7;
                        i14 = i6;
                        strM11225 = str;
                    } else {
                        iM2566 = C2105.m6981("ۜۨ") ^ i12;
                        i2 = ((iM2566 ^ i13) * (-4959)) ^ 280529564;
                        i3 = 1912755604;
                        i15 = iM2566 ^ i3;
                        i14 = i2;
                    }
                    break;
                case -1411747625:
                case 704169410:
                    strM11225 = strM11225;
                    strM28025 = C11340.m28025(sArr4, 171, 66, i8);
                    if (C1773.f6144 <= 0) {
                        iM6982 = (i13 - C2105.m6981("ۙܳ")) * (-99);
                        i6 = ((iM6982 ^ i12) * 21819) ^ 1114531370;
                        i7 = 995928844;
                    } else {
                        iM6982 = (C2105.m6981("ۚ᩹") + i12) * (-95);
                        i6 = ((iM6982 ^ i13) * 22109) ^ (-894815874);
                        i7 = -42242097;
                    }
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                case -1373751791:
                case 1154639814:
                    if (i != -1) {
                        iM6982 = (C2105.m6981("۠ܽ") ^ i13) * (-79);
                        strM11225 = strM11225;
                        i6 = ((iM6982 ^ i12) * (-6159)) ^ 12408023;
                        i7 = -490369837;
                    } else {
                        strM11225 = strM11225;
                        iM6982 = C0630.m2566("᩵֫") ^ i12;
                        i6 = ((iM6982 ^ i13) * (-15631)) ^ (-212006834);
                        i7 = 1928155884;
                    }
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                case -1095237963:
                case 271712158:
                    strM11225 = strM11225;
                    int i23 = s + s2;
                    if ((i23 * i23) - i20 <= 0) {
                        iM6982 = C0630.m2566("᩸᩶") ^ i12;
                        i6 = ((iM6982 ^ i13) * 31919) ^ (-2008600039);
                        i7 = 1585337052;
                    } else {
                        iM6982 = C2105.m6981("᩺᩵") ^ i13;
                        i6 = ((iM6982 ^ i12) * 27023) ^ 822848739;
                        i7 = 500031451;
                    }
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                case -1021701211:
                case 122156306:
                    strM11225 = strM11225;
                    C11233.m27800(objM14326, strM28025);
                    clipboardManager = (ClipboardManager) objM14326;
                    iM6982 = C2105.m6981("ۡ֡") ^ i13;
                    i6 = ((iM6982 ^ i12) * (-29727)) ^ (-2050251897);
                    i7 = -1076147894;
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                case -593177594:
                case -336054371:
                    strM11225 = strM11225;
                    try {
                        clipboardManager.setText(charSequence);
                        int iM2569 = C0630.m2566("ᩳܽ") ^ i13;
                        i14 = ((iM2569 ^ i12) * 4791) ^ 810968749;
                        str = strM11225;
                        i15 = iM2569 ^ 284358875;
                    } catch (Throwable unused) {
                        iM6982 = C2105.m6981("ܶ۟") ^ i12;
                        i6 = ((iM6982 ^ i13) * (-6331)) ^ 2123828850;
                        i7 = 2084319216;
                        str = strM11225;
                        i15 = iM6982 ^ i7;
                        i14 = i6;
                    }
                    strM11225 = str;
                    break;
                case -370441088:
                case 503687899:
                    strM11225 = strM11225;
                    objM14326 = m14326(strM13542);
                    sArr4 = f15520;
                    if (C1047.f3863 >= 0) {
                        iM6982 = C0630.m2566("۟ۜ") ^ i13;
                        i6 = ((iM6982 ^ i12) * (-20761)) ^ 260364437;
                        i7 = 1561108285;
                    } else {
                        iM6982 = (C0630.m2566("ۨۜ") + i12) * 9;
                        i6 = ((iM6982 ^ i13) * 2289) ^ (-2112529131);
                        i7 = 1242545376;
                    }
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                case -339190887:
                case 593043135:
                    try {
                        C3663.m11161(i);
                        strM11225 = strM11225;
                        iM6982 = C0630.m2566("᩵֫") ^ i12;
                        i6 = ((iM6982 ^ i13) * (-15631)) ^ (-212006834);
                        i7 = 1928155884;
                    } catch (Throwable unused2) {
                        strM11225 = strM11225;
                        iM6982 = C2105.m6981("ܶ۟") ^ i12;
                        i6 = ((iM6982 ^ i13) * (-6331)) ^ 2123828850;
                        i7 = 2084319216;
                    }
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                case -279686603:
                case 833842568:
                    strM11225 = strM11225;
                    c = 161;
                    if (C2958.f9394 < 0) {
                        obj = objM14326;
                        iM6981 = (C2105.m6981("᩹ۚ") ^ i13) * (-57);
                        i4 = ((iM6981 ^ i12) * 15175) ^ (-1941465569);
                        i5 = 1570123343;
                        int i24 = iM6981 ^ i5;
                        strM11225 = strM11225;
                        i15 = i24;
                        i14 = i4;
                        objM14326 = obj;
                    }
                    strM11225 = strM11225;
                    int iM25610 = (i12 - C0630.m2566("ۤܶ")) * (-11);
                    obj = objM14326;
                    i4 = ((iM25610 ^ i13) * 24699) ^ (-2051729390);
                    i15 = iM25610 ^ 915590484;
                    i14 = i4;
                    objM14326 = obj;
                    break;
                case -265180240:
                case -144819281:
                    strM11225 = strM11225;
                    strM13542 = C4616.m13542(sArr, i9, i10, i8);
                    if (C2520.m8026()) {
                        iM6982 = (i13 - C2105.m6981("ۙܳ")) * (-99);
                        i6 = ((iM6982 ^ i12) * 21819) ^ 1114531370;
                        i7 = 995928844;
                    } else {
                        iM6982 = C0630.m2566("֡۠") ^ i13;
                        i6 = ((iM6982 ^ i12) * 5811) ^ (-1389670366);
                        i7 = 1244052403;
                    }
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                case 50353413:
                case 154132695:
                    C2272.m7503();
                    if (C4263.m12819() >= 0) {
                        iM2566 = C0630.m2566("᩹ۜ") ^ i12;
                        i2 = ((iM2566 ^ i13) * 23159) ^ (-1379755889);
                        i3 = 1243318001;
                        i15 = iM2566 ^ i3;
                        i14 = i2;
                    } else {
                        strM11225 = strM11225;
                        iM6982 = (i13 - C2105.m6981("ۙܳ")) * (-99);
                        i6 = ((iM6982 ^ i12) * 21819) ^ 1114531370;
                        i7 = 995928844;
                        str = strM11225;
                        i15 = iM6982 ^ i7;
                        i14 = i6;
                        strM11225 = str;
                    }
                    break;
                case 262231547:
                case 886878539:
                    C1504.m5167(C0630.m2566(strM11225) ^ 2127039692);
                    break;
                case 422207029:
                case 2119850941:
                    strM11225 = strM11225;
                    s = sArr3[c];
                    i18 = s * s;
                    i19 = 7096896;
                    if (C1047.f3863 < 0) {
                        iM6982 = (i12 - C2105.m6981("ۗۚ")) * (-77);
                        i6 = ((iM6982 ^ i13) * 9557) ^ (-1332667808);
                        i7 = -2041290887;
                        str = strM11225;
                        i15 = iM6982 ^ i7;
                        i14 = i6;
                        strM11225 = str;
                    } else {
                        strM11225 = strM11225;
                        int iM25611 = (i12 - C0630.m2566("ۤܶ")) * (-11);
                        obj = objM14326;
                        i4 = ((iM25611 ^ i13) * 24699) ^ (-2051729390);
                        i15 = iM25611 ^ 915590484;
                        i14 = i4;
                        objM14326 = obj;
                    }
                    break;
                case 1240282327:
                case 1815160989:
                    i8 = 11391;
                    iM6982 = (i13 - C0630.m2566("ۤܽ")) * (-109);
                    i6 = ((iM6982 ^ i12) * 829) ^ 1979807539;
                    i7 = -1922641024;
                    str = strM11225;
                    i15 = iM6982 ^ i7;
                    i14 = i6;
                    strM11225 = str;
                    break;
                default:
                    if (C3019.f9544 < 0) {
                        iM2566 = C2105.m6981("ۜۨ") ^ i12;
                        i2 = ((iM2566 ^ i13) * (-4959)) ^ 280529564;
                        i3 = 1912755604;
                        i15 = iM2566 ^ i3;
                        i14 = i2;
                    } else {
                        strM11225 = strM11225;
                        iM6982 = (i13 - C2105.m6981("ۙܳ")) * (-99);
                        i6 = ((iM6982 ^ i12) * 21819) ^ 1114531370;
                        i7 = 995928844;
                        str = strM11225;
                        i15 = iM6982 ^ i7;
                        i14 = i6;
                        strM11225 = str;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01c9 A[PHI: r7 r8 r9 r12 r16
      0x01c9: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:55:0x01c7, B:51:0x01a7, B:47:0x0189, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:55:0x01c7, B:51:0x01a7, B:47:0x0189, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:55:0x01c7, B:51:0x01a7, B:47:0x0189, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:55:0x01c7, B:51:0x01a7, B:47:0x0189, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r16v12 java.lang.Object) = (r16v4 java.lang.Object), (r16v5 java.lang.Object), (r16v6 java.lang.Object), (r16v13 java.lang.Object) binds: [B:55:0x01c7, B:51:0x01a7, B:47:0x0189, B:28:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0258 A[PHI: r3 r4 r11 r16
      0x0258: PHI (r3v5 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:65:0x0256, B:32:0x00ce, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r4v5 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:65:0x0256, B:32:0x00ce, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r11v5 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:65:0x0256, B:32:0x00ce, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r16v23 java.lang.Object) = (r16v2 java.lang.Object), (r16v11 java.lang.Object), (r16v24 java.lang.Object) binds: [B:65:0x0256, B:32:0x00ce, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (l.C5695.f17556 >= 0) goto L17;
     */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C17209 m14323() {
        int iM2566;
        int i;
        int i2;
        int i3 = C4616.f14690;
        int i4 = C3683.f11629;
        int iM2567 = (i3 - C0630.m2566("᩺ᩳ")) * (-123);
        int i5 = ((iM2567 ^ i4) * (-27775)) ^ 1968401513;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ 1470971666;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1957767842;
        String strM4902 = null;
        Object value = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 28551) >> 31));
            switch (i12) {
                case -2068053635:
                case -1343114193:
                    value = f15526.getValue();
                    if (!AbstractC2021.m6574()) {
                        iM2566 = C0630.m2566("ܿܺ") ^ i3;
                        value = value;
                        i = ((iM2566 ^ i4) * 4927) ^ 912886946;
                        i2 = 771109997;
                        Object obj = value;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        value = obj;
                    } else {
                        int iM2568 = C0630.m2566("ۢ᩻") ^ i3;
                        i6 = iM2568 ^ (-1399122515);
                        i5 = ((iM2568 ^ i4) * (-89)) ^ (-1127067754);
                    }
                    break;
                case -1977604940:
                case -568176626:
                    C3019.m9255();
                    if (C0964.f3626 != 0) {
                        value = value;
                        iM2566 = C2105.m6981("᩸ܰ") ^ i4;
                        i = ((iM2566 ^ i3) * 31911) ^ (-1527453257);
                        i2 = 618092677;
                        Object obj2 = value;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        value = obj2;
                    }
                    value = value;
                    iM2566 = (C2105.m6981("ۘ᩹") ^ i3) * 17;
                    i = ((iM2566 ^ i4) * 27633) ^ (-2121133573);
                    i2 = -1255216254;
                    Object obj3 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj3;
                    break;
                case -1801593925:
                case 2015620771:
                    i10 = 55400;
                    iM2566 = (C0630.m2566("֨ۨ") ^ i4) * 5;
                    i = ((iM2566 ^ i3) * (-6973)) ^ 1260241905;
                    i2 = 1767170638;
                    Object obj4 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj4;
                    break;
                case -1779966080:
                case -1267388495:
                    C0714.m2805();
                    if (!C1420.m4913()) {
                        int iM2569 = C0630.m2566("ۢ᩻") ^ i3;
                        i6 = iM2569 ^ (-1399122515);
                        i5 = ((iM2569 ^ i4) * (-89)) ^ (-1127067754);
                    } else {
                        value = value;
                        iM2566 = (C2105.m6981("ۘ᩹") ^ i3) * 17;
                        i = ((iM2566 ^ i4) * 27633) ^ (-2121133573);
                        i2 = -1255216254;
                        Object obj5 = value;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        value = obj5;
                    }
                    break;
                case -1541341748:
                case -575000376:
                    value = value;
                    s2 = 1;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C2105.m6981("᩸ܰ") ^ i4;
                        i = ((iM2566 ^ i3) * 31911) ^ (-1527453257);
                        i2 = 618092677;
                    } else {
                        iM2566 = C0630.m2566("ۚۜ") ^ i3;
                        i = ((iM2566 ^ i4) * (-27887)) ^ (-1964794707);
                        i2 = 2011697606;
                    }
                    Object obj6 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj6;
                    break;
                case -1495358058:
                case 855520561:
                    value = value;
                    sArr = f15520;
                    c = 431;
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C2105.m6981("ۘ᩹") ^ i3) * 17;
                        i = ((iM2566 ^ i4) * 27633) ^ (-2121133573);
                        i2 = -1255216254;
                    } else {
                        iM2566 = C0630.m2566("ۚ֫") ^ i4;
                        i = ((iM2566 ^ i3) * 6915) ^ (-819452091);
                        i2 = -1107310791;
                    }
                    Object obj7 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj7;
                    break;
                case -1467120521:
                case 474546872:
                    value = value;
                    i8 = s * 2;
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("᩷ܿ") ^ i4;
                        i = ((iM2566 ^ i3) * (-23225)) ^ (-65721902);
                        i2 = 1089590772;
                    } else {
                        iM2566 = C2105.m6981("ۚܿ") ^ i4;
                        i = ((iM2566 ^ i3) * (-12589)) ^ (-477714549);
                        i2 = 1589810022;
                    }
                    Object obj8 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj8;
                    break;
                case -1447900809:
                case -306528506:
                    value = value;
                    if ((i8 + i9) - i7 <= 0) {
                        iM2566 = (C2105.m6981("ܰ۠") + i3) * (-81);
                        i = ((iM2566 ^ i4) * (-24889)) ^ 25246864;
                        i2 = 166039998;
                    } else {
                        iM2566 = (C0630.m2566("ۛ۬") ^ i4) * 51;
                        i = ((iM2566 ^ i3) * 13411) ^ (-1926426652);
                        i2 = 578262703;
                    }
                    Object obj9 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj9;
                    break;
                case -1438283474:
                case 544228029:
                    value = value;
                    i9 = 1;
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = C2105.m6981("᩷ܿ") ^ i4;
                        i = ((iM2566 ^ i3) * (-23225)) ^ (-65721902);
                        i2 = 1089590772;
                    } else {
                        iM2566 = C0630.m2566("ܺ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * 4267) ^ 2030717802;
                        i2 = -1895174709;
                    }
                    Object obj10 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj10;
                    break;
                case -1214232274:
                case 2034140053:
                    i10 = 10772;
                    iM2566 = (C0630.m2566("֨ۨ") ^ i4) * 5;
                    i = ((iM2566 ^ i3) * (-6973)) ^ 1260241905;
                    i2 = 1767170638;
                    Object obj11 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj11;
                    break;
                case -1001303403:
                case -136678600:
                    C2126.m7031(value, strM4902);
                    return (C17209) value;
                case -934395308:
                case -799825200:
                    break;
                case -841662282:
                case 1364399172:
                    value = value;
                    int i13 = s + s2;
                    i7 = i13 * i13;
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("᩷ܿ") ^ i4;
                        i = ((iM2566 ^ i3) * (-23225)) ^ (-65721902);
                        i2 = 1089590772;
                    } else {
                        iM2566 = (C2105.m6981("֨֡") ^ i4) * (-93);
                        i = ((iM2566 ^ i3) * 24429) ^ (-829510909);
                        i2 = 914584836;
                    }
                    Object obj12 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj12;
                    break;
                case 168985044:
                case 658562547:
                    C2167.m7155();
                    C3019.m9255();
                    value = value;
                    iM2566 = C0630.m2566("᩹᩺") ^ i3;
                    i = ((iM2566 ^ i4) * (-4837)) ^ 682796820;
                    i2 = 9914662;
                    Object obj13 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj13;
                    break;
                case 189599094:
                case 2120157022:
                    value = value;
                    sArr2 = f15520;
                    if (C5695.m16023() >= 0) {
                        iM2566 = (C2105.m6981("ۘ᩹") ^ i3) * 17;
                        i = ((iM2566 ^ i4) * 27633) ^ (-2121133573);
                        i2 = -1255216254;
                    } else {
                        iM2566 = C0630.m2566("ᩳ۫") ^ i3;
                        i = ((iM2566 ^ i4) * 23265) ^ (-1593145131);
                        i2 = 1195703541;
                    }
                    Object obj14 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj14;
                    break;
                case 534428217:
                case 1464412135:
                    strM4902 = C1420.m4902(sArr2, i11, 13, i10);
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = C2105.m6981("۠᩵") ^ i4;
                        value = value;
                        i = ((iM2566 ^ i3) * 22743) ^ (-1335473371);
                        i2 = 56450368;
                        Object obj15 = value;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        value = obj15;
                    } else {
                        int iM25610 = C0630.m2566("ۢ᩻") ^ i3;
                        i6 = iM25610 ^ (-1399122515);
                        i5 = ((iM25610 ^ i4) * (-89)) ^ (-1127067754);
                    }
                    break;
                case 640669895:
                case 1998713495:
                    C2167.m7155();
                    return null;
                case 1009708653:
                case 1643911405:
                    value = value;
                    i11 = 432;
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("᩷ܿ") ^ i4;
                        i = ((iM2566 ^ i3) * (-23225)) ^ (-65721902);
                        i2 = 1089590772;
                    } else {
                        iM2566 = C0630.m2566("ۙۙ") ^ i4;
                        i = ((iM2566 ^ i3) * (-31463)) ^ 489651099;
                        i2 = -1546765014;
                    }
                    Object obj16 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj16;
                    break;
                default:
                    value = value;
                    s = sArr[c];
                    if (C0630.m2564()) {
                        iM2566 = C0630.m2566("᩹᩺") ^ i3;
                        i = ((iM2566 ^ i4) * (-4837)) ^ 682796820;
                        i2 = 9914662;
                    } else {
                        iM2566 = (C0630.m2566("ܰܽ") + i3) * 43;
                        i = ((iM2566 ^ i4) * (-6197)) ^ (-2137254126);
                        i2 = 630584227;
                    }
                    Object obj17 = value;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    value = obj17;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final void m14334(View view) {
        int i = 0;
        int i2 = -194065089;
        int i3 = C1294.f4556;
        int i4 = C4117.f13076;
        int iM2566 = (C0630.m2566("֨۬") + i3) * (-37);
        int i5 = ((iM2566 ^ i4) * (-10447)) ^ (-137821132);
        int i6 = -1138875232;
        while (true) {
            i2 = ((((i2 ^ i4) * (-5451)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2058736372:
                case 248907940:
                    if (C7106.f21815 != 0) {
                        iM2566 = C0630.m2566("ܶ᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * 18383) ^ (-1086174768);
                        i6 = -1975617293;
                    } else {
                        iM2566 = C0630.m2566("ۗۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-25377)) ^ 344256036;
                        i6 = 1787236416;
                    }
                    break;
                case -1928830013:
                case -1066013680:
                    m14328(i, view);
                    iM2566 = (C0630.m2566("᩵ᩴ") + i4) * 85;
                    i5 = ((iM2566 ^ i3) * 4629) ^ (-1546677252);
                    i6 = 1207087756;
                    break;
                case -1778661710:
                case 1459499255:
                    break;
                case -1648359396:
                case 1390127266:
                    C3683.m11222();
                    if (!C2272.f7362) {
                        iM2566 = (C0630.m2566("ۧ֫") + i3) * 53;
                        i5 = ((iM2566 ^ i4) * (-20291)) ^ 1924379841;
                        i6 = -1817747831;
                    } else {
                        iM2566 = (C2105.m6981("֨ᩳ") + i4) * 65;
                        i5 = ((iM2566 ^ i3) * 12361) ^ 88569417;
                        i6 = -1943425538;
                    }
                    break;
                case -1431425251:
                case 1901586004:
                    if (C1504.f5354) {
                        iM2566 = (C0630.m2566("ۧ֫") + i3) * 53;
                        i5 = ((iM2566 ^ i4) * (-20291)) ^ 1924379841;
                        i6 = -1817747831;
                    } else {
                        iM2566 = C2105.m6981("֨֡") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-30521)) ^ 1157158077;
                        i6 = 309414919;
                    }
                    break;
                case -1352896174:
                case 1398208799:
                    ViewOnClickListenerC1958.m6429();
                    if (C3432.f10845 < 0) {
                        iM2566 = (C2105.m6981("֨ᩳ") + i4) * 65;
                        i5 = ((iM2566 ^ i3) * 12361) ^ 88569417;
                        i6 = -1943425538;
                    } else {
                        iM2566 = C0630.m2566("ܶ᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * 18383) ^ (-1086174768);
                        i6 = -1975617293;
                    }
                    break;
                case -1331825812:
                case -552065020:
                    if (RunnableC3474.m10630()) {
                        iM2566 = (C2105.m6981("ۤ۠") ^ i3) * (-123);
                        i5 = ((iM2566 ^ i4) * 16849) ^ 360682160;
                        i6 = -1305356623;
                    } else {
                        iM2566 = (C2105.m6981("᩻ܿ") ^ i3) * (-23);
                        i5 = ((iM2566 ^ i4) * (-32739)) ^ 1647876798;
                        i6 = 388837381;
                    }
                    break;
                case -1290708902:
                case 1940477366:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("ۧ֫") + i3) * 53;
                        i5 = ((iM2566 ^ i4) * (-20291)) ^ 1924379841;
                        i6 = -1817747831;
                    } else {
                        iM2566 = C2105.m6981("ܶۖ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-9765)) ^ 1297840268;
                        i6 = -430665813;
                    }
                    break;
                case -1237394977:
                case 1461862056:
                    if (C2167.m7155()) {
                        iM2566 = C0630.m2566("ۗۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-25377)) ^ 344256036;
                        i6 = 1787236416;
                    } else {
                        iM2566 = (i3 - C2105.m6981("۫ܶ")) * 115;
                        i5 = ((iM2566 ^ i4) * (-9827)) ^ (-2067174693);
                        i6 = -1294864079;
                    }
                    break;
                case -478565679:
                case 1011765254:
                    ViewOnClickListenerC1958.m6429();
                    C2105.m6982();
                    break;
                case -56667940:
                case 1572420992:
                    if (C21923.f70183 != 0) {
                        iM2566 = (C2105.m6981("᩻ܿ") ^ i3) * (-23);
                        i5 = ((iM2566 ^ i4) * (-32739)) ^ 1647876798;
                        i6 = 388837381;
                    } else {
                        iM2566 = C2105.m6981("᩶ۨ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 24805) ^ 2130440997;
                        i6 = 570683098;
                    }
                    break;
                case 264075093:
                case 927339987:
                    if (view != null) {
                        iM2566 = (i3 - C0630.m2566("ۛ֨")) * (-21);
                        i5 = ((iM2566 ^ i4) * 15179) ^ (-768028102);
                        i6 = 1124967702;
                    } else {
                        iM2566 = (C0630.m2566("᩵ᩴ") + i4) * 85;
                        i5 = ((iM2566 ^ i3) * 4629) ^ (-1546677252);
                        i6 = 1207087756;
                    }
                    break;
                case 307736753:
                case 1913171841:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ܶ᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * 18383) ^ (-1086174768);
                        i6 = -1975617293;
                    } else {
                        iM2566 = C2105.m6981("֨ۜ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 25673) ^ 2038600484;
                        i6 = 191893779;
                    }
                    break;
                case 484982385:
                case 1709666448:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C0630.m2566("ۗۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-25377)) ^ 344256036;
                        i6 = 1787236416;
                    } else {
                        iM2566 = (C2105.m6981("۬۫") + i3) * (-9);
                        i5 = ((iM2566 ^ i4) * 11949) ^ 1187300897;
                        i6 = -1426023760;
                    }
                    break;
                case 624309464:
                case 742994492:
                    C22628.m50615();
                    iM2566 = C0630.m2566("ۗۘ") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-25377)) ^ 344256036;
                    i6 = 1787236416;
                    break;
                case 1039708902:
                case 1422212738:
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ۢ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-13721)) ^ 2094919455;
                        i6 = 32197595;
                    } else {
                        iM2566 = (C2105.m6981("֨ᩳ") + i4) * 65;
                        i5 = ((iM2566 ^ i3) * 12361) ^ 88569417;
                        i6 = -1943425538;
                    }
                    break;
                case 1152934489:
                case 1715870743:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C0630.m2566("ۗۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-25377)) ^ 344256036;
                        i6 = 1787236416;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۢ۟")) * (-103);
                        i5 = ((iM2566 ^ i3) * (-1815)) ^ (-1550912200);
                        i6 = 164846891;
                    }
                    break;
                default:
                    i = 0;
                    if (C1128.m3851() <= 0) {
                        iM2566 = (C2105.m6981("᩻ܿ") ^ i3) * (-23);
                        i5 = ((iM2566 ^ i4) * (-32739)) ^ 1647876798;
                        i6 = 388837381;
                    } else {
                        iM2566 = (C0630.m2566("ۜ᩷") + i3) * (-47);
                        i5 = ((iM2566 ^ i4) * (-25381)) ^ 1655183634;
                        i6 = -1402122638;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0273 A[PHI: r10 r11 r16 r17 r21
      0x0273: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:63:0x0271, B:59:0x024e, B:50:0x01ee, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r11v4 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short) binds: [B:63:0x0271, B:59:0x024e, B:50:0x01ee, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x0271, B:59:0x024e, B:50:0x01ee, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:63:0x0271, B:59:0x024e, B:50:0x01ee, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r21v23 android.app.Application) = 
      (r21v3 android.app.Application)
      (r21v4 android.app.Application)
      (r21v6 android.app.Application)
      (r21v24 android.app.Application)
     binds: [B:63:0x0271, B:59:0x024e, B:50:0x01ee, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005a, code lost:
    
        if (l.C2272.f7362 != false) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m14306(int i, Object... objArr) {
        int iM2566;
        int i2;
        int i3;
        int i4;
        int iM6981;
        Object[] objArr2 = objArr;
        int i5 = C0630.f2410;
        int i6 = C1047.f3863;
        int iM6982 = (C2105.m6981("ۨۢ") ^ i5) * 41;
        int i7 = ((iM6982 ^ i6) * 15633) ^ 299810202;
        Application applicationM1842 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM6982 ^ 546436215;
        String strM7159 = null;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 1250681034;
        int i15 = 0;
        String strM12262 = null;
        int length = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * (-5981)) >> 31));
            switch (i14) {
                case -1649780342:
                case -1264215724:
                    RunnableC3474.m10630();
                    if (!C2126.f7087) {
                        iM6981 = C2105.m6981("ۛܽ") ^ i6;
                        i4 = ((iM6981 ^ i5) * 29027) ^ 1642881331;
                        i3 = 2008133548;
                        i8 = iM6981 ^ i3;
                        i7 = i4;
                        applicationM1842 = applicationM1842;
                    } else {
                        applicationM1842 = applicationM1842;
                        iM2566 = (i5 - C0630.m2566("֫ۨ")) * (-59);
                        i7 = ((iM2566 ^ i6) * (-10797)) ^ (-1697730953);
                        i2 = -826925264;
                        int i16 = iM2566 ^ i2;
                        applicationM1842 = applicationM1842;
                        i8 = i16;
                        objArr2 = objArr;
                    }
                    break;
                case -1642762369:
                case 915466942:
                    i11 = 12748;
                    iM2566 = (C0630.m2566("ۨ᩸") + i6) * 109;
                    i7 = ((iM2566 ^ i5) * 5505) ^ 2029062240;
                    i2 = -556079894;
                    int i17 = iM2566 ^ i2;
                    applicationM1842 = applicationM1842;
                    i8 = i17;
                    objArr2 = objArr;
                    break;
                case -1509166028:
                case -1498825365:
                    applicationM1842 = applicationM1842;
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("֫ܳ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 12257) ^ 1293282292;
                        i2 = 2134645338;
                    } else {
                        iM2566 = (i6 - C0630.m2566("֨ۘ")) * 41;
                        i7 = ((iM2566 ^ i5) * 3773) ^ 69677759;
                        i2 = 1331598788;
                    }
                    int i18 = iM2566 ^ i2;
                    applicationM1842 = applicationM1842;
                    i8 = i18;
                    objArr2 = objArr;
                    break;
                case -1204369836:
                case 587876075:
                    applicationM1842 = applicationM1842;
                    i10 = i15 + 1;
                    s2 = 1;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C0630.m2566("ܰܺ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 2677) ^ 1206468151;
                        i2 = -954576698;
                    } else {
                        iM2566 = C0630.m2566("ܺ۫") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-745)) ^ (-1015492400);
                        i2 = -1309635413;
                    }
                    int i19 = iM2566 ^ i2;
                    applicationM1842 = applicationM1842;
                    i8 = i19;
                    objArr2 = objArr;
                    break;
                case -1077392655:
                case -123853373:
                    strM12262 = C4075.m12262(applicationM1842, i, Arrays.copyOf(objArr2, length));
                    sArr3 = f15520;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C2105.m6981("ۛܽ") ^ i6;
                        i4 = ((iM6981 ^ i5) * 29027) ^ 1642881331;
                        i3 = 2008133548;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ۖ֡")) * 51;
                        i4 = ((iM6981 ^ i5) * (-3895)) ^ (-2030502697);
                        i3 = 311450262;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i4;
                    applicationM1842 = applicationM1842;
                    break;
                case -1043999696:
                case 339239714:
                    applicationM1842 = applicationM1842;
                    c = 136;
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("ܰܺ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 2677) ^ 1206468151;
                        i2 = -954576698;
                    } else {
                        iM2566 = (i5 - C0630.m2566("֨ۗ")) * 127;
                        i7 = ((iM2566 ^ i6) * 15653) ^ (-70639375);
                        i2 = 187812943;
                    }
                    int i110 = iM2566 ^ i2;
                    applicationM1842 = applicationM1842;
                    i8 = i110;
                    objArr2 = objArr;
                    break;
                case -969874906:
                case -673911235:
                    C1005.m3501();
                    AbstractC2021.m6574();
                    applicationM1842 = applicationM1842;
                    iM2566 = C2105.m6981("֫ܳ") ^ i5;
                    i7 = ((iM2566 ^ i6) * 12257) ^ 1293282292;
                    i2 = 2134645338;
                    int i111 = iM2566 ^ i2;
                    applicationM1842 = applicationM1842;
                    i8 = i111;
                    objArr2 = objArr;
                    break;
                case -534436264:
                case 897562715:
                    applicationM1842 = applicationM1842;
                    strM7159 = C2167.m7159(sArr2, i12, i13, i11);
                    if (C0237.f1507 != 0) {
                        iM2566 = (i5 - C0630.m2566("֫ۨ")) * (-59);
                        i7 = ((iM2566 ^ i6) * (-10797)) ^ (-1697730953);
                        i2 = -826925264;
                    } else {
                        iM2566 = C0630.m2566("ۢ᩵") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-4431)) ^ 325800939;
                        i2 = -1365112411;
                    }
                    int i112 = iM2566 ^ i2;
                    applicationM1842 = applicationM1842;
                    i8 = i112;
                    objArr2 = objArr;
                    break;
                case -497393681:
                case -269966516:
                    applicationM1842 = applicationM1842;
                    sArr2 = f15520;
                    i12 = 137;
                    i13 = 10;
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("ܽۙ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 12099) ^ (-426019078);
                        i2 = -1164628446;
                        int i113 = iM2566 ^ i2;
                        applicationM1842 = applicationM1842;
                        i8 = i113;
                        objArr2 = objArr;
                    }
                    applicationM1842 = applicationM1842;
                    int iM2567 = (C0630.m2566("᩸ۛ") + i6) * 43;
                    i7 = ((iM2567 ^ i5) * 10897) ^ 1071611737;
                    i8 = iM2567 ^ (-895685778);
                    objArr2 = objArr;
                    break;
                case -414898715:
                case 1692337745:
                    applicationM1842 = applicationM1842;
                    sArr = f15520;
                    if (C2520.m8026()) {
                        iM2566 = C0630.m2566("ܰܺ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 2677) ^ 1206468151;
                        i2 = -954576698;
                    } else {
                        iM2566 = (C2105.m6981("᩸֡") + i5) * (-31);
                        i7 = ((iM2566 ^ i6) * 29115) ^ 1827802896;
                        i2 = 269916333;
                    }
                    int i114 = iM2566 ^ i2;
                    applicationM1842 = applicationM1842;
                    i8 = i114;
                    objArr2 = objArr;
                    break;
                case -348093156:
                case 585816126:
                    applicationM1842 = applicationM1842;
                    int i20 = s + s2;
                    if ((i20 * i20) - i10 >= 0) {
                        iM2566 = (C0630.m2566("ۨ֨") ^ i6) * (-111);
                        i7 = ((iM2566 ^ i5) * 15789) ^ 424986488;
                        i2 = -1499899207;
                    } else {
                        iM2566 = C0630.m2566("ۛ᩻") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-3225)) ^ 28522280;
                        i2 = 1814096632;
                    }
                    int i115 = iM2566 ^ i2;
                    applicationM1842 = applicationM1842;
                    i8 = i115;
                    objArr2 = objArr;
                    break;
                case -208930282:
                case 2038789964:
                    C2126.m7031(strM12262, C0714.m2816(sArr3, i9, 14, i11));
                    return strM12262;
                case -207939545:
                case 1009641388:
                    i9 = 147;
                    if (RunnableC1108.f4040) {
                        int iM6983 = (C2105.m6981("ܰ᩹") ^ i6) * (-55);
                        i8 = iM6983 ^ 1753886518;
                        i7 = ((iM6983 ^ i5) * 13651) ^ (-142376888);
                    } else {
                        applicationM1842 = applicationM1842;
                        iM2566 = C2105.m6981("֫ܳ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 12257) ^ 1293282292;
                        i2 = 2134645338;
                        int i116 = iM2566 ^ i2;
                        applicationM1842 = applicationM1842;
                        i8 = i116;
                        objArr2 = objArr;
                    }
                    break;
                case -161636826:
                case 104607191:
                    applicationM1842 = applicationM1842;
                    s = sArr[c];
                    i15 = s * 2;
                    if (C2958.f9394 < 0) {
                        iM2566 = (i6 - C2105.m6981("ܶۤ")) * (-117);
                        i7 = ((iM2566 ^ i5) * (-18869)) ^ 926586586;
                        i2 = 2072285602;
                        int i117 = iM2566 ^ i2;
                        applicationM1842 = applicationM1842;
                        i8 = i117;
                        objArr2 = objArr;
                    }
                    applicationM1842 = applicationM1842;
                    int iM2568 = (C0630.m2566("᩸ۛ") + i6) * 43;
                    i7 = ((iM2568 ^ i5) * 10897) ^ 1071611737;
                    i8 = iM2568 ^ (-895685778);
                    objArr2 = objArr;
                    break;
                case 61523755:
                case 235810304:
                    i11 = 17493;
                    iM2566 = (C0630.m2566("ۨ᩸") + i6) * 109;
                    i7 = ((iM2566 ^ i5) * 5505) ^ 2029062240;
                    i2 = -556079894;
                    int i118 = iM2566 ^ i2;
                    applicationM1842 = applicationM1842;
                    i8 = i118;
                    objArr2 = objArr;
                    break;
                case 154077482:
                case 472695889:
                    if (!C2272.f7362) {
                        applicationM1842 = applicationM1842;
                        iM2566 = C0630.m2566("ܰܺ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 2677) ^ 1206468151;
                        i2 = -954576698;
                        int i119 = iM2566 ^ i2;
                        applicationM1842 = applicationM1842;
                        i8 = i119;
                        objArr2 = objArr;
                    }
                    applicationM1842 = applicationM1842;
                    iM2566 = C2105.m6981("֫ܳ") ^ i5;
                    i7 = ((iM2566 ^ i6) * 12257) ^ 1293282292;
                    i2 = 2134645338;
                    int i1110 = iM2566 ^ i2;
                    applicationM1842 = applicationM1842;
                    i8 = i1110;
                    objArr2 = objArr;
                    break;
                case 273800136:
                case 601547551:
                    C3683.m11210(objArr2, strM7159);
                    applicationM1842 = C0382.m1842();
                    length = objArr2.length;
                    if (RunnableC0588.f2309 >= 0) {
                        int iM2569 = (C0630.m2566("᩸ۛ") + i6) * 43;
                        i7 = ((iM2569 ^ i5) * 10897) ^ 1071611737;
                        i8 = iM2569 ^ (-895685778);
                    } else {
                        int iM6984 = (i5 - C2105.m6981("ܰۖ")) * 93;
                        i8 = iM6984 ^ 1312503249;
                        i7 = ((iM6984 ^ i6) * 4547) ^ 1711968681;
                    }
                    objArr2 = objArr;
                    break;
                case 414956519:
                case 629949428:
                    C4075.m12263();
                    return null;
                default:
                    C1128.m3851();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Typeface m14319() {
        Object value = null;
        String strM10633 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 1422248670;
        int i7 = ViewOnClickListenerC1958.f6529;
        int i8 = RunnableC1937.f6483;
        int iM6981 = C2105.m6981("ۢۛ") ^ i8;
        int i9 = ((iM6981 ^ i7) * 13377) ^ 1821186774;
        int i10 = -447770448;
        while (true) {
            i6 = ((((i6 ^ i7) * 26369) >> 31) & i9) ^ (iM6981 ^ i10);
            switch (i6) {
                case -2083628019:
                case -366621271:
                    i2 = s * s;
                    i3 = 352650841;
                    if (C4117.m12364() != 0) {
                        iM6981 = (C2105.m6981("ۡܶ") + i7) * (-119);
                        i9 = ((iM6981 ^ i8) * (-25413)) ^ 268480080;
                        i10 = 757590142;
                    } else {
                        iM6981 = C2105.m6981("ܰ۟") ^ i7;
                        i9 = ((iM6981 ^ i8) * (-1383)) ^ (-816140046);
                        i10 = -389742199;
                    }
                    break;
                case -2053793819:
                case 863587551:
                    C0237.m1481();
                    C3432.m10477();
                    iM6981 = (C0630.m2566("֨۫") ^ i8) * 19;
                    i9 = ((iM6981 ^ i7) * (-26951)) ^ (-1290754269);
                    i10 = 1981695299;
                    break;
                case -1958014549:
                case 657380084:
                    i4 = 29777;
                    iM6981 = C2105.m6981("ۡۚ") ^ i7;
                    i9 = ((iM6981 ^ i8) * (-12731)) ^ (-1337908067);
                    i10 = -1230509708;
                    break;
                case -1514149410:
                case 1369360979:
                    strM10633 = RunnableC3474.m10633(sArr2, i5, 13, i4);
                    if (C1005.f3721) {
                        iM6981 = (C2105.m6981("ۨ۬") + i7) * 109;
                        i9 = ((iM6981 ^ i8) * 4383) ^ 426505197;
                        i10 = -1466894957;
                    } else {
                        iM6981 = (C0630.m2566("֨۫") ^ i8) * 19;
                        i9 = ((iM6981 ^ i7) * (-26951)) ^ (-1290754269);
                        i10 = 1981695299;
                    }
                    break;
                case -1510041720:
                case 974296247:
                    C1420.m4913();
                    return null;
                case -1500289872:
                case -1136896085:
                    if (C5695.m16023() >= 0) {
                        iM6981 = C2105.m6981("۫۟") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-8697)) ^ (-434789550);
                        i10 = -454258868;
                    } else {
                        iM6981 = (C0630.m2566("ۨۖ") + i8) * 119;
                        i9 = ((iM6981 ^ i7) * (-17097)) ^ (-95564500);
                        i10 = -265596698;
                    }
                    break;
                case -1125761007:
                case -539337599:
                    if (i - (i2 + i3) <= 0) {
                        iM6981 = C2105.m6981("ۚ᩷") ^ i8;
                        i9 = ((iM6981 ^ i7) * 15403) ^ (-166206433);
                        i10 = 447225948;
                    } else {
                        iM6981 = (C2105.m6981("ۘ۬") + i7) * (-89);
                        i9 = ((iM6981 ^ i8) * 29263) ^ 826767385;
                        i10 = 1399439506;
                    }
                    break;
                case -1021503180:
                case 1167078715:
                    sArr2 = f15520;
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-4981)) ^ (-1036869123);
                        i10 = 1465494737;
                    } else {
                        iM6981 = C0630.m2566("ۗܶ") ^ i8;
                        i9 = ((iM6981 ^ i7) * 13863) ^ (-1869587524);
                        i10 = -393534449;
                    }
                    break;
                case -993742042:
                case 542440106:
                    i = 37558 * s;
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("ۡܶ") + i7) * (-119);
                        i9 = ((iM6981 ^ i8) * (-25413)) ^ 268480080;
                        i10 = 757590142;
                    } else {
                        iM6981 = (C2105.m6981("֨᩻") + i8) * 53;
                        i9 = ((iM6981 ^ i7) * (-32205)) ^ 470668422;
                        i10 = -1214734228;
                    }
                    break;
                case -960935751:
                case 460811985:
                    C7106.m19120();
                    if (!C0714.m2805()) {
                        iM6981 = C2105.m6981("۫۟") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-8697)) ^ (-434789550);
                        i10 = -454258868;
                    } else {
                        iM6981 = (C0630.m2566("֨۫") ^ i8) * 19;
                        i9 = ((iM6981 ^ i7) * (-26951)) ^ (-1290754269);
                        i10 = 1981695299;
                    }
                    break;
                case -835725198:
                case 381923040:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-4981)) ^ (-1036869123);
                        i10 = 1465494737;
                    } else {
                        iM6981 = C2105.m6981("۫۟") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-8697)) ^ (-434789550);
                        i10 = -454258868;
                    }
                    break;
                case -494628518:
                case -24409645:
                    value = f15521.getValue();
                    if (C2520.m8026()) {
                        iM6981 = (C2105.m6981("ۡܶ") + i7) * (-119);
                        i9 = ((iM6981 ^ i8) * (-25413)) ^ 268480080;
                        i10 = 757590142;
                    } else {
                        iM6981 = C2105.m6981("ܶۨ") ^ i8;
                        i9 = ((iM6981 ^ i7) * 27197) ^ 1721259388;
                        i10 = -730657693;
                    }
                    break;
                case -333021569:
                case -136459249:
                    i4 = 46087;
                    iM6981 = C2105.m6981("ۡۚ") ^ i7;
                    i9 = ((iM6981 ^ i8) * (-12731)) ^ (-1337908067);
                    i10 = -1230509708;
                    break;
                case -47745973:
                case 561528782:
                    s = sArr[c];
                    if (C4616.m13552() != 0) {
                        iM6981 = (C2105.m6981("ۡܶ") + i7) * (-119);
                        i9 = ((iM6981 ^ i8) * (-25413)) ^ 268480080;
                        i10 = 757590142;
                    } else {
                        iM6981 = (C2105.m6981("ܰܺ") ^ i7) * 39;
                        i9 = ((iM6981 ^ i8) * 5119) ^ (-1703247341);
                        i10 = 362521709;
                    }
                    break;
                case 736619144:
                case 2036867098:
                    i5 = 356;
                    if (C4117.m12364() != 0) {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-4981)) ^ (-1036869123);
                        i10 = 1465494737;
                    } else {
                        iM6981 = (C2105.m6981("ۡ᩶") + i7) * 93;
                        i9 = ((iM6981 ^ i8) * 3599) ^ (-1353766329);
                        i10 = 888558946;
                    }
                    break;
                case 1093990303:
                case 1963953458:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (C0630.m2566("֨۫") ^ i8) * 19;
                        i9 = ((iM6981 ^ i7) * (-26951)) ^ (-1290754269);
                        i10 = 1981695299;
                    } else {
                        iM6981 = (i7 - C2105.m6981("۠ۙ")) * 59;
                        i9 = ((iM6981 ^ i8) * 9619) ^ 231983386;
                        i10 = 1467837077;
                    }
                    break;
                case 1341933905:
                case 1957467043:
                    sArr = f15520;
                    c = 355;
                    if (C0050.f910 >= 0) {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-4981)) ^ (-1036869123);
                        i10 = 1465494737;
                    } else {
                        iM6981 = (C0630.m2566("᩹֫") + i7) * (-51);
                        i9 = ((iM6981 ^ i8) * (-9535)) ^ (-91877091);
                        i10 = 1794688290;
                    }
                    break;
                case 1454993303:
                case 1715104853:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C2105.m6981("ۡܶ") + i7) * (-119);
                        i9 = ((iM6981 ^ i8) * (-25413)) ^ 268480080;
                        i10 = 757590142;
                    } else {
                        iM6981 = (C0630.m2566("ۧ֫") ^ i8) * (-105);
                        i9 = ((iM6981 ^ i7) * 7647) ^ 1129202288;
                        i10 = -1780517271;
                    }
                    break;
                default:
                    C4159.m12575(value, strM10633);
                    return (Typeface) value;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0157 A[PHI: r2 r9 r11 r12
      0x0157: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:41:0x0155, B:30:0x00d7, B:22:0x0091, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:41:0x0155, B:30:0x00d7, B:22:0x0091, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:41:0x0155, B:30:0x00d7, B:22:0x0091, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:41:0x0155, B:30:0x00d7, B:22:0x0091, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0237 A[PHI: r5 r6 r18
      0x0237: PHI (r5v6 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:61:0x0235, B:53:0x01e2, B:7:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r6v6 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:61:0x0235, B:53:0x01e2, B:7:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r18v7 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:61:0x0235, B:53:0x01e2, B:7:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0267 A[PHI: r7 r13
      0x0267: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:65:0x0265, B:49:0x01c0, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:65:0x0265, B:49:0x01c0, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        if (l.C1294.f4556 < 0) goto L7;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14311(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int iM2566;
        int i;
        int i2 = C0483.f2088;
        int i3 = RunnableC3474.f10992;
        int iM6981 = (C2105.m6981("᩹֫") ^ i3) * (-23);
        int i4 = ((iM6981 ^ i2) * (-3555)) ^ 1732690544;
        short[] sArr = null;
        short[] sArr2 = null;
        int i5 = iM6981 ^ (-1869855434);
        String strM948 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1868354037;
        while (true) {
            i11 = i5 ^ (i4 & (((i11 ^ i2) * (-11963)) >> 31));
            switch (i11) {
                case -2051426146:
                case -1786679017:
                    sArr = f15520;
                    if (C1711.f5919) {
                        iM2566 = (C2105.m6981("ܺ᩶") + i2) * (-71);
                        i4 = ((iM2566 ^ i3) * 25547) ^ (-1085896881);
                        i = 874210601;
                    } else {
                        iM2566 = C2105.m6981("᩹֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 28487) ^ (-933064219);
                        i = -184440573;
                    }
                    i5 = iM2566 ^ i;
                    break;
                case -2042800840:
                case 2051924770:
                    C3432.m10477();
                    C1047.m3599();
                    iM2566 = (C2105.m6981("ܺ᩶") + i2) * (-71);
                    i4 = ((iM2566 ^ i3) * 25547) ^ (-1085896881);
                    i = 874210601;
                    i5 = iM2566 ^ i;
                    break;
                case -1963428379:
                case 1180931021:
                    i6 = s * s2;
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("ۘܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20131)) ^ (-1221291780);
                        i = -67855388;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۚ᩻")) * (-115);
                        i4 = ((iM2566 ^ i3) * (-29453)) ^ (-273670482);
                        i = -1092951542;
                    }
                    i5 = iM2566 ^ i;
                    break;
                case -1848671944:
                case -395732870:
                    i10 = 8;
                    if (C1711.f5919) {
                        iM2566 = (i2 - C0630.m2566("ۚ᩻")) * (-115);
                        i4 = ((iM2566 ^ i3) * (-29453)) ^ (-273670482);
                        i = -1092951542;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩹ܽ")) * (-105);
                        i4 = ((iM2566 ^ i2) * (-29803)) ^ 703240313;
                        i = -683541060;
                    }
                    i5 = iM2566 ^ i;
                    break;
                case -1831850805:
                case 2102479280:
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("ܰᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32565) ^ (-2124707620);
                        i = -52761179;
                        i5 = iM2566 ^ i;
                    }
                    iM2566 = (C2105.m6981("ۢ۟") ^ i3) * (-29);
                    i4 = ((iM2566 ^ i2) * 16013) ^ 1262774042;
                    i = 173318068;
                    i5 = iM2566 ^ i;
                    break;
                case -1655193563:
                case 1615584778:
                    int i12 = s + s3;
                    if ((i12 * i12) - i7 < 0) {
                        iM2566 = (C2105.m6981("ۛ᩺") ^ i2) * (-99);
                        i4 = ((iM2566 ^ i3) * 14437) ^ (-1468011157);
                        i = 1443356039;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ܺۜ")) * (-99);
                        i4 = ((iM2566 ^ i3) * (-22969)) ^ (-39368855);
                        i = -698919118;
                    }
                    i5 = iM2566 ^ i;
                    break;
                case -1552483039:
                case 765124373:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ۚ᩻")) * (-115);
                        i4 = ((iM2566 ^ i3) * (-29453)) ^ (-273670482);
                        i = -1092951542;
                    } else {
                        iM2566 = C0630.m2566("᩷ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20509) ^ (-12738638);
                        i = -464499030;
                    }
                    i5 = iM2566 ^ i;
                    break;
                case -1476521883:
                case 618075781:
                    i7 = i6 + 1;
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = (C2105.m6981("ۢ۟") ^ i3) * (-29);
                        i4 = ((iM2566 ^ i2) * 16013) ^ 1262774042;
                        i = 173318068;
                    } else {
                        iM2566 = C2105.m6981("֫ܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-10129)) ^ 985229859;
                        i = 1784324361;
                    }
                    i5 = iM2566 ^ i;
                    break;
                case -1295262717:
                case -555287122:
                    C3683.m11210(broadcastReceiver, strM948);
                    C2234.m7411(C3432.m10479()).m7414(broadcastReceiver, intentFilter);
                    break;
                case -1193079242:
                case 256166195:
                    strM948 = C0050.m948(sArr2, i9, i10, i8);
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i2 - C2105.m6981("᩷ۚ")) * (-65);
                        i4 = ((iM2566 ^ i3) * 14631) ^ (-1255733503);
                        i = 580179554;
                        i5 = iM2566 ^ i;
                    } else {
                        int iM6982 = C2105.m6981("ۗܰ") ^ i3;
                        i5 = iM6982 ^ (-1089672390);
                        i4 = ((iM6982 ^ i2) * (-957)) ^ (-1518032344);
                    }
                    break;
                case -1113252207:
                case 1845269779:
                    s = sArr[c];
                    s2 = 2;
                    if (C1504.m5179()) {
                        iM2566 = (C2105.m6981("᩷۬") ^ i2) * 101;
                        i4 = ((iM2566 ^ i3) * 13599) ^ (-1472250315);
                        i = -1926015221;
                    } else {
                        iM2566 = (C2105.m6981("ܺ᩶") + i2) * (-71);
                        i4 = ((iM2566 ^ i3) * 25547) ^ (-1085896881);
                        i = 874210601;
                    }
                    i5 = iM2566 ^ i;
                    break;
                case -879377770:
                case 1677218063:
                    i8 = 43395;
                    iM2566 = C2105.m6981("ۤۢ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-13385)) ^ 1366336329;
                    i = -2084648939;
                    i5 = iM2566 ^ i;
                    break;
                case -500654844:
                case 1063910025:
                    C4616.m13552();
                    if (C11340.f33930 >= 0) {
                        iM2566 = (i2 - C2105.m6981("᩷ۚ")) * (-65);
                        i4 = ((iM2566 ^ i3) * 14631) ^ (-1255733503);
                        i = 580179554;
                        i5 = iM2566 ^ i;
                    }
                    iM2566 = (C2105.m6981("ܺ᩶") + i2) * (-71);
                    i4 = ((iM2566 ^ i3) * 25547) ^ (-1085896881);
                    i = 874210601;
                    i5 = iM2566 ^ i;
                    break;
                case -497755706:
                case 85999423:
                    sArr2 = f15520;
                    i9 = 250;
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("ܶۗ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2566 ^ i3) * (-31067)) ^ 1070706119;
                        i = -1404262986;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩷ۚ")) * (-65);
                        i4 = ((iM2566 ^ i3) * 14631) ^ (-1255733503);
                        i = 580179554;
                    }
                    i5 = iM2566 ^ i;
                    break;
                case -483874037:
                case 2040875621:
                    i8 = 62677;
                    iM2566 = C2105.m6981("ۤۢ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-13385)) ^ 1366336329;
                    i = -2084648939;
                    i5 = iM2566 ^ i;
                    break;
                case 196139606:
                case 2066610833:
                    s3 = 1;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (i2 - C2105.m6981("᩷ۚ")) * (-65);
                        i4 = ((iM2566 ^ i3) * 14631) ^ (-1255733503);
                        i = 580179554;
                    } else {
                        iM2566 = C0630.m2566("֫᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 29229) ^ (-760479205);
                        i = -54671454;
                    }
                    i5 = iM2566 ^ i;
                    break;
                case 606085325:
                case 706856271:
                    c = 249;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("ܰᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32565) ^ (-2124707620);
                        i = -52761179;
                    } else {
                        iM2566 = (C0630.m2566("ۘᩳ") + i3) * 91;
                        i4 = ((iM2566 ^ i2) * 21757) ^ (-1060515923);
                        i = -1556645749;
                    }
                    i5 = iM2566 ^ i;
                    break;
                case 687262190:
                case 1748399023:
                    C3432.m10477();
                    C22628.m50615();
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0168 A[PHI: r10 r12 r13 r14
      0x0168: PHI (r10v6 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:42:0x0166, B:31:0x00f8, B:20:0x0099, B:9:0x0053, B:6:0x004d, B:75:0x0168, B:91:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x0168: PHI (r12v6 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:42:0x0166, B:31:0x00f8, B:20:0x0099, B:9:0x0053, B:6:0x004d, B:75:0x0168, B:91:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x0168: PHI (r13v6 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:42:0x0166, B:31:0x00f8, B:20:0x0099, B:9:0x0053, B:6:0x004d, B:75:0x0168, B:91:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x0168: PHI (r14v6 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:42:0x0166, B:31:0x00f8, B:20:0x0099, B:9:0x0053, B:6:0x004d, B:75:0x0168, B:91:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f6 A[PHI: r2 r4 r5 r6 r8 r9
      0x01f6: PHI (r2v6 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v5 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:58:0x01f4, B:54:0x01d4, B:46:0x0197, B:27:0x00bd, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:58:0x01f4, B:54:0x01d4, B:46:0x0197, B:27:0x00bd, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:58:0x01f4, B:54:0x01d4, B:46:0x0197, B:27:0x00bd, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:58:0x01f4, B:54:0x01d4, B:46:0x0197, B:27:0x00bd, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:58:0x01f4, B:54:0x01d4, B:46:0x0197, B:27:0x00bd, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:58:0x01f4, B:54:0x01d4, B:46:0x0197, B:27:0x00bd, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0240 A[PHI: r7 r19
      0x0240: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:66:0x023e, B:62:0x0223, B:50:0x01b5] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r19v5 short[]) = (r19v3 short[]), (r19v4 short[]), (r19v3 short[]) binds: [B:66:0x023e, B:62:0x0223, B:50:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14316(Runnable runnable, long j) {
        int iM2566;
        int i;
        int iM2567;
        int i2;
        int i3;
        Runnable runnable2 = runnable;
        int i4 = RunnableC0588.f2309;
        int i5 = C2167.f7158;
        int iM6981 = C2105.m6981("ۛۡ") ^ i5;
        int i6 = ((iM6981 ^ i4) * OpenAuthTask.NOT_INSTALLED) ^ 1907125796;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM6981 ^ (-911002178);
        String str = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1667389019;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i4) * 27485) >> 31));
            switch (i14) {
                case -1920863974:
                case 1128180003:
                    i9 = i8 * i8;
                    s3 = 2;
                    if (C1005.f3721) {
                        iM2566 = (i5 - C2105.m6981("ܺܶ")) * (-71);
                        i6 = ((iM2566 ^ i4) * (-5363)) ^ (-118780126);
                        i = 593711637;
                    } else {
                        iM2566 = (C0630.m2566("᩶ᩴ") + i5) * 97;
                        i6 = ((iM2566 ^ i4) * (-23615)) ^ 1876904624;
                        i = -2137457459;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -1907585370:
                case 1594346222:
                    String strM28025 = C11340.m28025(sArr2, i12, i13, i11);
                    if (C0382.f1805) {
                        int iM6982 = (C2105.m6981("ۘۨ") ^ i5) * q.h;
                        int i15 = ((iM6982 ^ i4) * (-4715)) ^ 1399439146;
                        i7 = iM6982 ^ (-782782484);
                        str = strM28025;
                        i6 = i15;
                    } else {
                        str = strM28025;
                        iM2566 = (C0630.m2566("᩶ᩴ") + i5) * 97;
                        i6 = ((iM2566 ^ i4) * (-23615)) ^ 1876904624;
                        i = -2137457459;
                        i7 = iM2566 ^ i;
                    }
                    runnable2 = runnable;
                    break;
                case -1801585689:
                case -136485245:
                    if ((i10 + 1) - i9 > 0) {
                        iM2566 = (C0630.m2566("ᩴ۠") + i4) * 57;
                        i6 = ((iM2566 ^ i5) * 3177) ^ (-725231002);
                        i = 1612237514;
                    } else {
                        iM2566 = C0630.m2566("ܶۢ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-15645)) ^ 1197770714;
                        i = 915906491;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -1739380292:
                case 1677719199:
                    s = sArr[c];
                    s2 = 1;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("᩶ᩴ") + i5) * 97;
                        i6 = ((iM2566 ^ i4) * (-23615)) ^ 1876904624;
                        i = -2137457459;
                    } else {
                        iM2566 = (C2105.m6981("֨ۗ") ^ i5) * (-71);
                        i6 = ((iM2566 ^ i4) * 12009) ^ 221899450;
                        i = 1647406579;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -1736085557:
                case 383290375:
                    sArr2 = f15520;
                    i12 = 272;
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("ۚ֫") ^ i4;
                        i6 = ((iM2566 ^ i5) * 13251) ^ (-2104363521);
                        i = 14570827;
                    } else {
                        iM2566 = C2105.m6981("۫ۧ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 1697) ^ (-806826585);
                        i = -1165233713;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -1725599499:
                case -962202686:
                    C4263.m12819();
                    C7811.m20844();
                    break;
                case -1705242353:
                case -466279908:
                    i10 = s * s3;
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("ۚ֫") ^ i4;
                        i6 = ((iM2566 ^ i5) * 13251) ^ (-2104363521);
                        i = 14570827;
                    } else {
                        iM2566 = (C2105.m6981("᩺᩵") ^ i4) * 21;
                        i6 = ((iM2566 ^ i5) * 10221) ^ (-627121474);
                        i = 1455102631;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -1635294334:
                case 701285961:
                    i11 = 34714;
                    iM2566 = C0630.m2566("ۜۡ") ^ i5;
                    i6 = ((iM2566 ^ i4) * (-12431)) ^ (-1054801280);
                    i = -812721244;
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -1152109675:
                case 283468542:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (i4 - C0630.m2566("ۨۘ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM2566 ^ i5) * 22091) ^ (-1062638525);
                        i = -244209151;
                    } else {
                        iM2566 = C0630.m2566("ۡ᩸") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-20299)) ^ 1262908551;
                        i = -440262193;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -1016604344:
                case 220725936:
                    C0630.m2564();
                    C22628.m50615();
                    iM2566 = C2105.m6981("ۚ֫") ^ i4;
                    i6 = ((iM2566 ^ i5) * 13251) ^ (-2104363521);
                    i = 14570827;
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -830522702:
                case 1426841309:
                    RunnableC0588.m2430(runnable2, str);
                    f15519.postDelayed(runnable2, j);
                    break;
                case -618362254:
                case 386999574:
                    i8 = s + s2;
                    if (C1916.f6442) {
                        iM2566 = (C2105.m6981("ۚ۠") ^ i4) * (-49);
                        i6 = ((iM2566 ^ i5) * (-24343)) ^ 317435408;
                        i = 191635069;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۨۘ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM2566 ^ i5) * 22091) ^ (-1062638525);
                        i = -244209151;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -611119959:
                case 1970499346:
                    ServiceConnectionC3453.m10564();
                    if (C1773.m5908() > 0) {
                        iM2567 = (i4 - C0630.m2566("۠᩷")) * (-105);
                        i2 = ((iM2567 ^ i5) * (-20443)) ^ 2102963000;
                        i3 = 763976960;
                        i7 = iM2567 ^ i3;
                        i6 = i2;
                    } else {
                        iM2566 = C2105.m6981("ۚ֫") ^ i4;
                        i6 = ((iM2566 ^ i5) * 13251) ^ (-2104363521);
                        i = 14570827;
                        i7 = iM2566 ^ i;
                        runnable2 = runnable;
                    }
                    break;
                case -439058052:
                case 967253452:
                    c = 271;
                    if (C3663.m11168() >= 0) {
                        iM2566 = (C0630.m2566("᩶ᩴ") + i5) * 97;
                        i6 = ((iM2566 ^ i4) * (-23615)) ^ 1876904624;
                        i = -2137457459;
                    } else {
                        iM2566 = C0630.m2566("֡ۗ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 9637) ^ 907261848;
                        i = 27812677;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -415562204:
                case -272501263:
                    i11 = 43816;
                    iM2566 = C0630.m2566("ۜۡ") ^ i5;
                    i6 = ((iM2566 ^ i4) * (-12431)) ^ (-1054801280);
                    i = -812721244;
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case -175162584:
                case 1868227606:
                    if (C2520.f8000 >= 0) {
                        iM2567 = (i5 - C0630.m2566("֨֡")) * 73;
                        i2 = ((iM2567 ^ i4) * 13213) ^ (-854984918);
                        i3 = 975012509;
                        i7 = iM2567 ^ i3;
                        i6 = i2;
                    } else {
                        iM2566 = C2105.m6981("ۚ֫") ^ i4;
                        i6 = ((iM2566 ^ i5) * 13251) ^ (-2104363521);
                        i = 14570827;
                        i7 = iM2566 ^ i;
                        runnable2 = runnable;
                    }
                    break;
                case 111934542:
                case 849466062:
                    if (C1916.f6442) {
                        iM2566 = C2105.m6981("ۚ֫") ^ i4;
                        i6 = ((iM2566 ^ i5) * 13251) ^ (-2104363521);
                        i = 14570827;
                    } else {
                        iM2566 = (C0630.m2566("᩶ᩴ") + i5) * 97;
                        i6 = ((iM2566 ^ i4) * (-23615)) ^ 1876904624;
                        i = -2137457459;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                case 1318277766:
                case 2084123095:
                    sArr = f15520;
                    if (C7811.f24123 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ۨۘ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM2566 ^ i5) * 22091) ^ (-1062638525);
                        i = -244209151;
                    } else {
                        iM2566 = (i5 - C2105.m6981("᩹ܶ")) * (-105);
                        i6 = ((iM2566 ^ i4) * 11539) ^ 1394630224;
                        i = -445444157;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
                default:
                    i13 = 1;
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۚ֫") ^ i4;
                        i6 = ((iM2566 ^ i5) * 13251) ^ (-2104363521);
                        i = 14570827;
                    } else {
                        iM2566 = (C0630.m2566("ᩴ᩵") + i4) * 51;
                        i6 = ((iM2566 ^ i5) * (-19753)) ^ 454846866;
                        i = -220505730;
                    }
                    i7 = iM2566 ^ i;
                    runnable2 = runnable;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Handler m14324() {
        return f15519;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14309(long j, Runnable runnable) {
        f15519.postDelayed(runnable, j);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ac A[PHI: r17 r18
      0x00ac: PHI (r17v26 int) = (r17v21 int), (r17v24 int), (r17v27 int) binds: [B:29:0x0108, B:19:0x00b0, B:17:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r18v4 java.lang.String) = (r18v2 java.lang.String), (r18v1 java.lang.String), (r18v1 java.lang.String) binds: [B:29:0x0108, B:19:0x00b0, B:17:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x01c0 A[PHI: r7 r8 r9 r17 r19
      0x01c0: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:49:0x01e4, B:45:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r8v3 int) = (r8v2 int), (r8v1 int) binds: [B:49:0x01e4, B:45:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:49:0x01e4, B:45:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r17v13 int) = (r17v12 int), (r17v14 int) binds: [B:49:0x01e4, B:45:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r19v10 int) = (r19v9 int), (r19v11 int) binds: [B:49:0x01e4, B:45:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0245 A[PHI: r5 r6 r11 r12 r17 r19
      0x0245: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:58:0x0243, B:54:0x0221, B:37:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:58:0x0243, B:54:0x0221, B:37:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r11v2 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v3 short[]) binds: [B:58:0x0243, B:54:0x0221, B:37:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r12v2 int) = (r12v1 int), (r12v1 int), (r12v3 int) binds: [B:58:0x0243, B:54:0x0221, B:37:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r17v18 int) = (r17v10 int), (r17v11 int), (r17v19 int) binds: [B:58:0x0243, B:54:0x0221, B:37:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r19v15 int) = (r19v7 int), (r19v8 int), (r19v16 int) binds: [B:58:0x0243, B:54:0x0221, B:37:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02b8 A[PHI: r3 r13 r17 r19
      0x02b8: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:66:0x02b6, B:33:0x012c, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:66:0x02b6, B:33:0x012c, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r17v28 int) = (r17v8 int), (r17v20 int), (r17v30 int) binds: [B:66:0x02b6, B:33:0x012c, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r19v21 int) = (r19v5 int), (r19v17 int), (r19v23 int) binds: [B:66:0x02b6, B:33:0x012c, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14314(CharSequence charSequence) {
        int iM6981;
        int i;
        int i2;
        int iM2566 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -901911274;
        int i12 = C0050.f910;
        int i13 = C3911.f12484;
        int iM6982 = C2105.m6981("֫᩻") ^ i12;
        int i14 = ((iM6982 ^ i13) * (-32475)) ^ 1654922352;
        int i15 = iM6982 ^ (-128585814);
        String strM7507 = null;
        while (true) {
            int i16 = i15 ^ (i14 & (((i11 ^ i13) * (-17017)) >> 31));
            switch (i16) {
                case -1850067990:
                case -1101870556:
                    i16 = i16;
                    C0382.m1848();
                    C2958.m9034();
                    iM2566 = iM2566;
                    iM6981 = (C0630.m2566("ܿ᩷") + i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i = ((iM6981 ^ i12) * (-8363)) ^ 1205485271;
                    i2 = -635328285;
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case -1683312042:
                case -867543596:
                    iM2566 = iM2566;
                    i16 = i16;
                    sArr2 = f15520;
                    i9 = 266;
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("᩹ܳ") ^ i13) * (-117);
                        i = ((iM6981 ^ i12) * 10673) ^ 1870856750;
                        i2 = -1943196186;
                    } else {
                        iM6981 = C0630.m2566("ܺ᩶") ^ i12;
                        i = ((iM6981 ^ i13) * (-15409)) ^ 995577549;
                        i2 = 1153905676;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case -1454859817:
                case 1773155222:
                    AbstractC2021.m6574();
                    C0964.m3413();
                    break;
                case -1303698254:
                case -927145527:
                    m14308(iM2566 ^ i3, charSequence);
                    break;
                case -1274609340:
                case 509065602:
                    i8 = 50246;
                    iM6981 = (C0630.m2566("ۜۧ") ^ i13) * (-53);
                    i = ((iM6981 ^ i12) * (-9729)) ^ (-620457603);
                    i2 = -1452880868;
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case -1201482949:
                case -536572536:
                    iM2566 = iM2566;
                    i16 = i16;
                    i10 = 3;
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C0630.m2566("ۧۡ") ^ i12) * (-55);
                        i = ((iM6981 ^ i13) * (-32209)) ^ 45870363;
                        i2 = 1233947241;
                    } else {
                        iM6981 = C2105.m6981("᩹ۘ") ^ i12;
                        i = ((iM6981 ^ i13) * (-21363)) ^ (-1700543435);
                        i2 = -1929720821;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case -1055117089:
                case -235936848:
                    C2105.m6982();
                    if (C1294.f4556 < 0) {
                        iM2566 = iM2566;
                        i16 = i16;
                        iM6981 = (C0630.m2566("ܿ᩷") + i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i12) * (-8363)) ^ 1205485271;
                        i2 = -635328285;
                        i11 = i16;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        iM2566 = iM2566;
                    } else {
                        int iM6983 = (C2105.m6981("ۚ᩸") + i12) * 115;
                        i15 = iM6983 ^ (-1256035935);
                        i14 = ((iM6983 ^ i13) * (-32571)) ^ (-15923169);
                        i11 = i16;
                    }
                    break;
                case -999676204:
                case -917343186:
                    iM2566 = iM2566;
                    i16 = i16;
                    i4 = s + 13506;
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C0630.m2566("᩹ܳ") ^ i13) * (-117);
                        i = ((iM6981 ^ i12) * 10673) ^ 1870856750;
                        i2 = -1943196186;
                    } else {
                        iM6981 = C0630.m2566("ۙ᩻") ^ i12;
                        i = ((iM6981 ^ i13) * 8347) ^ (-1352449294);
                        i2 = -572550040;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case -877322294:
                case 502982435:
                    i16 = i16;
                    C0382.m1848();
                    if (C3537.f11231 >= 0) {
                        iM2566 = iM2566;
                        iM6981 = (C0630.m2566("ܿ᩷") + i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i12) * (-8363)) ^ 1205485271;
                        i2 = -635328285;
                    } else {
                        iM6981 = C2105.m6981("᩵۟") ^ i13;
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i12) * (-23265)) ^ (-1999251486);
                        i2 = 2002398965;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case -219887191:
                case 250271993:
                    iM2566 = iM2566;
                    i16 = i16;
                    i7 = 182412036;
                    if (C3245.m9925() != 0) {
                        iM2566 = iM2566;
                        iM6981 = C2105.m6981("᩵۟") ^ i13;
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i12) * (-23265)) ^ (-1999251486);
                        i2 = 2002398965;
                    } else {
                        iM6981 = C0630.m2566("᩻ۤ") ^ i12;
                        i = ((iM6981 ^ i13) * 8137) ^ (-885712661);
                        i2 = 923520151;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case -138457725:
                case -128604829:
                    C0714.m2805();
                    if (!C0382.f1805) {
                        i16 = i16;
                        iM6981 = C2105.m6981("᩵۟") ^ i13;
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i12) * (-23265)) ^ (-1999251486);
                        i2 = 2002398965;
                        i11 = i16;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        iM2566 = iM2566;
                    } else {
                        iM2566 = iM2566;
                        i16 = i16;
                        iM6981 = (C0630.m2566("ۧۡ") ^ i12) * (-55);
                        i = ((iM6981 ^ i13) * (-32209)) ^ 45870363;
                        i2 = 1233947241;
                        i11 = i16;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        iM2566 = iM2566;
                    }
                    break;
                case -63998393:
                case 82852049:
                    iM2566 = iM2566;
                    i16 = i16;
                    sArr = f15520;
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("ۧۡ") ^ i12) * (-55);
                        i = ((iM6981 ^ i13) * (-32209)) ^ 45870363;
                        i2 = 1233947241;
                    } else {
                        iM6981 = (i13 - C2105.m6981("֫ۛ")) * 39;
                        i = ((iM6981 ^ i12) * (-5363)) ^ (-250446265);
                        i2 = 486063509;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case 146665222:
                case 695620186:
                    iM2566 = iM2566;
                    i16 = i16;
                    s = sArr[c];
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C0630.m2566("᩹ܳ") ^ i13) * (-117);
                        i = ((iM6981 ^ i12) * 10673) ^ 1870856750;
                        i2 = -1943196186;
                    } else {
                        iM6981 = C2105.m6981("ܺ֫") ^ i13;
                        i = ((iM6981 ^ i12) * (-9957)) ^ (-189052721);
                        i2 = 800176010;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case 181909139:
                case 258883836:
                    i16 = i16;
                    iM2566 = C0630.m2566(strM7507);
                    if (C22628.m50615() != 0) {
                        i3 = 2124860039;
                        iM6981 = C2105.m6981("᩵۟") ^ i13;
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i12) * (-23265)) ^ (-1999251486);
                        i2 = 2002398965;
                        i11 = i16;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        iM2566 = iM2566;
                    } else {
                        int iM6984 = (C2105.m6981("ᩴ۠") ^ i12) * (-77);
                        i11 = i16;
                        i15 = iM6984 ^ (-1337117065);
                        i14 = ((iM6984 ^ i13) * 2993) ^ 1632220843;
                        i3 = 2124860039;
                    }
                    break;
                case 287043445:
                case 1648957364:
                    i8 = 62567;
                    iM6981 = (C0630.m2566("ۜۧ") ^ i13) * (-53);
                    i = ((iM6981 ^ i12) * (-9729)) ^ (-620457603);
                    i2 = -1452880868;
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case 561670113:
                case 1301278823:
                    iM2566 = iM2566;
                    i16 = i16;
                    i5 = i4 * i4;
                    i6 = s * s;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = iM2566;
                        iM6981 = C2105.m6981("᩵۟") ^ i13;
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i12) * (-23265)) ^ (-1999251486);
                        i2 = 2002398965;
                    } else {
                        iM6981 = C2105.m6981("ܶܿ") ^ i13;
                        i = ((iM6981 ^ i12) * 509) ^ (-1024949141);
                        i2 = 336005493;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case 814104790:
                case 1348306681:
                    iM2566 = iM2566;
                    i16 = i16;
                    c = 265;
                    if (C1916.f6442) {
                        iM6981 = (C0630.m2566("ۨ֡") ^ i12) * 53;
                        i = ((iM6981 ^ i13) * (-6805)) ^ (-176480743);
                        i2 = 1190125340;
                    } else {
                        iM6981 = (C0630.m2566("ܿ᩷") + i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i12) * (-8363)) ^ 1205485271;
                        i2 = -635328285;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                case 956895271:
                case 1885137471:
                    i16 = i16;
                    strM7507 = C2272.m7507(sArr2, i9, i10, i8);
                    if (C0714.f2697 >= 0) {
                        iM2566 = iM2566;
                        iM6981 = (C0630.m2566("ܿ᩷") + i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i12) * (-8363)) ^ 1205485271;
                        i2 = -635328285;
                    } else {
                        iM6981 = C0630.m2566("ۨۧ") ^ i13;
                        iM2566 = iM2566;
                        i = ((iM6981 ^ i12) * (-22721)) ^ (-715787792);
                        i2 = -332116871;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
                default:
                    iM2566 = iM2566;
                    i16 = i16;
                    int i17 = i6 + i7;
                    if (i5 - (i17 + i17) > 0) {
                        iM6981 = (C2105.m6981("۟֡") ^ i12) * (-23);
                        i = ((iM6981 ^ i13) * (-7087)) ^ (-286931582);
                        i2 = 1397535635;
                    } else {
                        iM6981 = C2105.m6981("֨ۨ") ^ i13;
                        i = ((iM6981 ^ i12) * 18121) ^ (-1733691313);
                        i2 = -2069198879;
                    }
                    i11 = i16;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    iM2566 = iM2566;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x017f A[PHI: r14
      0x017f: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:48:0x017d, B:15:0x00a2, B:11:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0252  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e7 A[PHI: r8 r9 r15 r19 r20 r25
      0x02e7: PHI (r8v4 java.lang.Object) = (r8v2 java.lang.Object), (r8v3 java.lang.Object), (r8v2 java.lang.Object) binds: [B:78:0x02e5, B:44:0x0160, B:40:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v4 java.lang.String) binds: [B:78:0x02e5, B:44:0x0160, B:40:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:78:0x02e5, B:44:0x0160, B:40:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:78:0x02e5, B:44:0x0160, B:40:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r20v4 int) = (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:78:0x02e5, B:44:0x0160, B:40:0x013b] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r25v3 short) = (r25v2 short), (r25v1 short), (r25v1 short) binds: [B:78:0x02e5, B:44:0x0160, B:40:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0319 A[PHI: r18
      0x0319: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char) binds: [B:82:0x0317, B:20:0x00af, B:18:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x034b A[PHI: r17
      0x034b: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:86:0x0349, B:18:0x00ab, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0377 A[PHI: r7 r11 r13 r16 r23
      0x0377: PHI (r7v4 android.content.Context) = 
      (r7v2 android.content.Context)
      (r7v2 android.content.Context)
      (r7v3 android.content.Context)
      (r7v2 android.content.Context)
      (r7v2 android.content.Context)
     binds: [B:90:0x0375, B:74:0x02c3, B:52:0x01b5, B:36:0x0116, B:8:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:90:0x0375, B:74:0x02c3, B:52:0x01b5, B:36:0x0116, B:8:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:90:0x0375, B:74:0x02c3, B:52:0x01b5, B:36:0x0116, B:8:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r16v4 short) = (r16v2 short), (r16v3 short), (r16v2 short), (r16v2 short), (r16v2 short) binds: [B:90:0x0375, B:74:0x02c3, B:52:0x01b5, B:36:0x0116, B:8:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0377: PHI (r23v6 int) = (r23v4 int), (r23v5 int), (r23v4 int), (r23v4 int), (r23v4 int) binds: [B:90:0x0375, B:74:0x02c3, B:52:0x01b5, B:36:0x0116, B:8:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m14328(final int i, final View view) {
        int iM2566;
        int i2;
        int i3;
        int i4 = C0050.f910;
        int i5 = C2167.f7158;
        int iM6981 = C2105.m6981("ᩴ۬") ^ i5;
        int i6 = ((iM6981 ^ i4) * 4075) ^ 1568479288;
        int i7 = iM6981 ^ 1558661156;
        String strM1955 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s = 0;
        char c = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1334558218;
        short s2 = 0;
        Context contextM6566 = null;
        Object objM7509 = null;
        int i15 = 0;
        int i16 = i7;
        long j = 0;
        while (true) {
            i14 = i16 ^ (i6 & (((i14 ^ i4) * (-14259)) >> 31));
            switch (i14) {
                case -2146218648:
                case -1935806256:
                    int i17 = s2 + s;
                    if (i13 - (i17 * i17) >= 0) {
                        iM2566 = C2105.m6981("ۤۚ") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-12683)) ^ 1656679888;
                        i3 = 1606017275;
                    } else {
                        iM2566 = (C0630.m2566("ۘܿ") ^ i4) * (-57);
                        i2 = ((iM2566 ^ i5) * 25573) ^ 204950665;
                        i3 = -877076882;
                    }
                    int i18 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i18;
                    break;
                case -2091543999:
                case -982266737:
                    if (i <= 0) {
                        iM2566 = (C2105.m6981("᩸᩶") + i4) * 59;
                        i2 = ((iM2566 ^ i5) * (-15885)) ^ 339414475;
                        i3 = 186188914;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܶ᩶")) * (-13);
                        i2 = ((iM2566 ^ i5) * (-26181)) ^ (-1363212114);
                        i3 = 7341781;
                    }
                    int i19 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i19;
                    break;
                case -2051866886:
                case 892656133:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C0630.m2566("ܳ֨") ^ i4) * 57;
                        i2 = ((iM2566 ^ i5) * 14281) ^ (-1148546454);
                        i3 = 42871130;
                    } else {
                        iM2566 = C0630.m2566("ۖۢ") ^ i4;
                        i2 = ((iM2566 ^ i5) * 32381) ^ 1469221962;
                        i3 = -117897789;
                    }
                    int i110 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i110;
                    break;
                case -2041841743:
                case -1741403338:
                    C3432.m10477();
                    C7106.m19120();
                    break;
                case -1996728683:
                case 1675645225:
                    C11233.m27800(objM7509, strM1955);
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("ܳ֨") ^ i4) * 57;
                        i2 = ((iM2566 ^ i5) * 14281) ^ (-1148546454);
                        i3 = 42871130;
                    } else {
                        iM2566 = C2105.m6981("ᩴۘ") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-5477)) ^ (-266588196);
                        i3 = -376653427;
                    }
                    int i111 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i111;
                    break;
                case -1969309354:
                case 1115340148:
                    C3019.m9255();
                    if (C0630.m2564()) {
                        iM2566 = C2105.m6981("ܽ۟") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-19343)) ^ 1114713818;
                        i3 = 1252026122;
                    } else {
                        iM2566 = C2105.m6981("ܶ᩸") ^ i4;
                        i2 = ((iM2566 ^ i5) * 2071) ^ 1204184905;
                        i3 = 1305606625;
                    }
                    int i112 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i112;
                    break;
                case -1812591506:
                case -1461316597:
                    RunnableC0588.m2441();
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("ۤۤ") ^ i4) * (-97);
                        i2 = ((iM2566 ^ i5) * (-13121)) ^ (-1598910326);
                        i3 = -586819293;
                    } else {
                        iM2566 = C2105.m6981("ۢ֨") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-21939)) ^ 870020207;
                        i3 = 629426829;
                    }
                    int i113 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i113;
                    break;
                case -1789352283:
                case 1204358530:
                    j = 100;
                    i15 = 3;
                    if (view.hasWindowFocus()) {
                        iM2566 = C0630.m2566("ۧ۠") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-28637)) ^ (-170994699);
                        i3 = -814446164;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ܽۤ")) * (-117);
                        i2 = ((iM2566 ^ i4) * 1643) ^ (-190216095);
                        i3 = 1895558565;
                    }
                    int i114 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i114;
                    break;
                case -1631255350:
                case -1417786918:
                    if (i < i15) {
                        iM2566 = (i4 - C2105.m6981("ۚܶ")) * (-39);
                        i2 = ((iM2566 ^ i5) * (-8771)) ^ 1904194981;
                        i3 = -1816415505;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܶ᩶")) * (-13);
                        i2 = ((iM2566 ^ i5) * (-26181)) ^ (-1363212114);
                        i3 = 7341781;
                    }
                    int i115 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i115;
                    break;
                case -1558437434:
                case 310393665:
                    i8 = 16138;
                    iM2566 = C0630.m2566("ۡ֨") ^ i5;
                    i2 = ((iM2566 ^ i4) * 23091) ^ (-2144154170);
                    i3 = -1670236638;
                    int i116 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i116;
                    break;
                case -1517983028:
                case 1918526507:
                    c = 475;
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C2105.m6981("ۤۤ") ^ i4) * (-97);
                        i2 = ((iM2566 ^ i5) * (-13121)) ^ (-1598910326);
                        i3 = -586819293;
                    } else {
                        iM2566 = (i5 - C0630.m2566("᩵۟")) * (-9);
                        i2 = ((iM2566 ^ i4) * 2905) ^ 1958496317;
                        i3 = -1815114714;
                    }
                    int i117 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i117;
                    break;
                case -1395874803:
                case 355114530:
                    if (((InputMethodManager) objM7509).showSoftInput(view, 0)) {
                        iM2566 = (i4 - C2105.m6981("ܶ᩶")) * (-13);
                        i2 = ((iM2566 ^ i5) * (-26181)) ^ (-1363212114);
                        i3 = 7341781;
                    } else {
                        iM2566 = (C2105.m6981("ۢۙ") ^ i5) * (-117);
                        i2 = ((iM2566 ^ i4) * 3791) ^ (-2053613440);
                        i3 = 893938929;
                    }
                    int i118 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i118;
                    break;
                case -1379196885:
                case 1236189395:
                    C3911.m11924();
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("ܶ᩸") ^ i4;
                        i2 = ((iM2566 ^ i5) * 2071) ^ 1204184905;
                        i3 = 1305606625;
                    } else {
                        iM2566 = (C0630.m2566("ܳ֨") ^ i4) * 57;
                        i2 = ((iM2566 ^ i5) * 14281) ^ (-1148546454);
                        i3 = 42871130;
                    }
                    int i119 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i119;
                    break;
                case -1317790040:
                case -225941736:
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("ۢ֨") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-21939)) ^ 870020207;
                        i3 = 629426829;
                    } else {
                        iM2566 = C2105.m6981("ܽ۟") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-19343)) ^ 1114713818;
                        i3 = 1252026122;
                    }
                    int i1110 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i1110;
                    break;
                case -1121544594:
                case 1098138191:
                    strM1955 = C0422.m1955(sArr3, 488, 80, i8);
                    if (C4117.m12364() != 0) {
                        iM2566 = (i5 - C2105.m6981("ۤܰ")) * 109;
                        i2 = ((iM2566 ^ i4) * 30921) ^ 337837913;
                        i3 = -1059755647;
                    } else {
                        iM2566 = C0630.m2566("ۜ۬") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-24985)) ^ (-919447945);
                        i3 = 1370095907;
                    }
                    int i1111 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i1111;
                    break;
                case -988645147:
                case 835317921:
                    if (C0798.m3010(view)) {
                        iM2566 = (i5 - C0630.m2566("᩺ᩴ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM2566 ^ i4) * (-24475)) ^ 1122655852;
                        i3 = -1845265626;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܶ᩶")) * (-13);
                        i2 = ((iM2566 ^ i5) * (-26181)) ^ (-1363212114);
                        i3 = 7341781;
                    }
                    int i1112 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i1112;
                    break;
                case -807556574:
                case 69329256:
                    s2 = sArr[c];
                    i11 = s2 * s2;
                    i12 = 161696656;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (i5 - C2105.m6981("ۤܰ")) * 109;
                        i2 = ((iM2566 ^ i4) * 30921) ^ 337837913;
                        i3 = -1059755647;
                    } else {
                        iM2566 = C0630.m2566("ܶۖ") ^ i4;
                        i2 = ((iM2566 ^ i5) * 8777) ^ (-1410516318);
                        i3 = 2468070;
                    }
                    int i1113 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i1113;
                    break;
                case -740297872:
                case 289557688:
                    view.postDelayed(new Runnable() { // from class: l.ܶ᩸᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4925.m14307(i, view);
                        }

                        {
                            int i20 = -1550056511;
                            int i21 = C1420.f5096;
                            int i22 = C2958.f9394;
                            int iM2567 = (i22 - C0630.m2566("᩸᩷")) * (-125);
                            int i23 = ((iM2567 ^ i21) * 1427) ^ (-1735118273);
                            int i24 = -1808273105;
                            while (true) {
                                i20 = ((((i20 ^ i21) * (-31795)) >> 31) & i23) ^ (iM2567 ^ i24);
                                switch (i20) {
                                    case -1938326612:
                                    case -350891171:
                                        if (C1711.f5919) {
                                            iM2567 = C2105.m6981("᩻۠") ^ i21;
                                            i23 = ((iM2567 ^ i22) * 11957) ^ 153470583;
                                            i24 = -1228753038;
                                        } else {
                                            iM2567 = C0630.m2566("᩻֫") ^ i21;
                                            i23 = ((iM2567 ^ i22) * (-3209)) ^ 196307525;
                                            i24 = -424968189;
                                        }
                                        break;
                                    case -1815486662:
                                    case -730426234:
                                        if (C5695.f17556 >= 0) {
                                            iM2567 = C2105.m6981("ܽܶ") ^ i21;
                                            i23 = ((iM2567 ^ i22) * (-30533)) ^ 834317712;
                                            i24 = -1435484054;
                                        } else {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        }
                                        break;
                                    case -1520279289:
                                    case -1149030121:
                                        if (C2126.f7087) {
                                            iM2567 = (i22 - C0630.m2566("ܳۛ")) * (-9);
                                            i23 = ((iM2567 ^ i21) * (-12509)) ^ (-103070885);
                                            i24 = -234374717;
                                        } else {
                                            iM2567 = (C0630.m2566("ۚۗ") + i22) * (-73);
                                            i23 = ((iM2567 ^ i21) * (-17883)) ^ 1177819141;
                                            i24 = 1021653606;
                                        }
                                        break;
                                    case -1475832951:
                                    case -373654425:
                                        AbstractC2021.m6574();
                                        if (!C1005.f3721) {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        } else {
                                            iM2567 = C2105.m6981("᩻۠") ^ i21;
                                            i23 = ((iM2567 ^ i22) * 11957) ^ 153470583;
                                            i24 = -1228753038;
                                        }
                                        break;
                                    case -901513004:
                                    case 631603226:
                                        return;
                                    case -896709711:
                                    case -383233321:
                                        C0630.m2564();
                                        C2126.m7040();
                                        iM2567 = C2105.m6981("᩻۠") ^ i21;
                                        i23 = ((iM2567 ^ i22) * 11957) ^ 153470583;
                                        i24 = -1228753038;
                                        break;
                                    case -714356722:
                                    case 1328409114:
                                        if (C1916.f6442) {
                                            iM2567 = (i21 - C0630.m2566("᩷ۘ")) * (-119);
                                            i23 = ((iM2567 ^ i22) * 19387) ^ (-1125137094);
                                            i24 = -1768551295;
                                        } else {
                                            iM2567 = (i22 - C0630.m2566("ۘ᩹")) * 59;
                                            i23 = ((iM2567 ^ i21) * 1153) ^ 118722455;
                                            i24 = 837948369;
                                        }
                                        break;
                                    case -609277977:
                                    case -296001012:
                                        if (C5695.m16023() >= 0) {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        } else {
                                            iM2567 = C2105.m6981("ۧۡ") ^ i21;
                                            i23 = ((iM2567 ^ i22) * 3689) ^ 910151430;
                                            i24 = 1441319016;
                                        }
                                        break;
                                    case -507913183:
                                    case 371380006:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        } else {
                                            iM2567 = (i22 - C2105.m6981("᩸ۙ")) * (-75);
                                            i23 = ((iM2567 ^ i21) * (-2909)) ^ (-1579529551);
                                            i24 = -1844124458;
                                        }
                                        break;
                                    case -506001257:
                                    case 607393002:
                                        if (C0630.f2410 <= 0) {
                                            iM2567 = (i22 - C0630.m2566("ܳۛ")) * (-9);
                                            i23 = ((iM2567 ^ i21) * (-12509)) ^ (-103070885);
                                            i24 = -234374717;
                                        } else {
                                            iM2567 = C0630.m2566("ܳܰ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * 12133) ^ (-219507106);
                                            i24 = -448762272;
                                        }
                                        break;
                                    case -392006166:
                                    case 1876504004:
                                        if (RunnableC3474.m10630()) {
                                            iM2567 = (C2105.m6981("ܿۨ") ^ i22) * 9;
                                            i23 = ((iM2567 ^ i21) * (-22193)) ^ (-1092467593);
                                            i24 = 306404770;
                                        } else {
                                            iM2567 = (i22 - C0630.m2566("ܳۛ")) * (-9);
                                            i23 = ((iM2567 ^ i21) * (-12509)) ^ (-103070885);
                                            i24 = -234374717;
                                        }
                                        break;
                                    case -289562038:
                                    case 171405570:
                                        if (C3683.f11629 >= 0) {
                                            iM2567 = C2105.m6981("ܽܶ") ^ i21;
                                            i23 = ((iM2567 ^ i22) * (-30533)) ^ 834317712;
                                            i24 = -1435484054;
                                        } else {
                                            iM2567 = (C2105.m6981("ᩳۨ") ^ i22) * (-53);
                                            i23 = ((iM2567 ^ i21) * 8385) ^ (-194774698);
                                            i24 = -359179688;
                                        }
                                        break;
                                    case -183806173:
                                    case 1691267242:
                                        C2958.m9034();
                                        throw new RuntimeException();
                                    case 248860386:
                                    case 274879146:
                                        if (C3245.f10203 <= 0) {
                                            iM2567 = (i22 - C0630.m2566("ۘ᩹")) * 59;
                                            i23 = ((iM2567 ^ i21) * 1153) ^ 118722455;
                                            i24 = 837948369;
                                        } else {
                                            iM2567 = (i21 - C0630.m2566("۠ۗ")) * 81;
                                            i23 = ((iM2567 ^ i22) * (-18021)) ^ 889695184;
                                            i24 = 1464623287;
                                        }
                                        break;
                                    case 1327723107:
                                    case 1909561554:
                                        C21923.m49329();
                                        if (C4075.f12947 >= 0) {
                                            iM2567 = (i22 - C0630.m2566("ܳۛ")) * (-9);
                                            i23 = ((iM2567 ^ i21) * (-12509)) ^ (-103070885);
                                            i24 = -234374717;
                                        } else {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        }
                                        break;
                                    default:
                                        if (C3432.m10477() <= 0) {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        } else {
                                            iM2567 = (i21 - C2105.m6981("ܰ᩸")) * 7;
                                            i23 = ((iM2567 ^ i22) * 23921) ^ (-304428645);
                                            i24 = -793624298;
                                        }
                                        break;
                                }
                            }
                        }
                    }, j);
                    iM2566 = (i4 - C2105.m6981("ܶ᩶")) * (-13);
                    i2 = ((iM2566 ^ i5) * (-26181)) ^ (-1363212114);
                    i3 = 7341781;
                    int i1114 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i1114;
                    break;
                case -621268951:
                case 1172438313:
                    view.postDelayed(new Runnable() { // from class: l.ܶ᩸᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4925.m14307(i, view);
                        }

                        {
                            int i20 = -1550056511;
                            int i21 = C1420.f5096;
                            int i22 = C2958.f9394;
                            int iM2567 = (i22 - C0630.m2566("᩸᩷")) * (-125);
                            int i23 = ((iM2567 ^ i21) * 1427) ^ (-1735118273);
                            int i24 = -1808273105;
                            while (true) {
                                i20 = ((((i20 ^ i21) * (-31795)) >> 31) & i23) ^ (iM2567 ^ i24);
                                switch (i20) {
                                    case -1938326612:
                                    case -350891171:
                                        if (C1711.f5919) {
                                            iM2567 = C2105.m6981("᩻۠") ^ i21;
                                            i23 = ((iM2567 ^ i22) * 11957) ^ 153470583;
                                            i24 = -1228753038;
                                        } else {
                                            iM2567 = C0630.m2566("᩻֫") ^ i21;
                                            i23 = ((iM2567 ^ i22) * (-3209)) ^ 196307525;
                                            i24 = -424968189;
                                        }
                                        break;
                                    case -1815486662:
                                    case -730426234:
                                        if (C5695.f17556 >= 0) {
                                            iM2567 = C2105.m6981("ܽܶ") ^ i21;
                                            i23 = ((iM2567 ^ i22) * (-30533)) ^ 834317712;
                                            i24 = -1435484054;
                                        } else {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        }
                                        break;
                                    case -1520279289:
                                    case -1149030121:
                                        if (C2126.f7087) {
                                            iM2567 = (i22 - C0630.m2566("ܳۛ")) * (-9);
                                            i23 = ((iM2567 ^ i21) * (-12509)) ^ (-103070885);
                                            i24 = -234374717;
                                        } else {
                                            iM2567 = (C0630.m2566("ۚۗ") + i22) * (-73);
                                            i23 = ((iM2567 ^ i21) * (-17883)) ^ 1177819141;
                                            i24 = 1021653606;
                                        }
                                        break;
                                    case -1475832951:
                                    case -373654425:
                                        AbstractC2021.m6574();
                                        if (!C1005.f3721) {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        } else {
                                            iM2567 = C2105.m6981("᩻۠") ^ i21;
                                            i23 = ((iM2567 ^ i22) * 11957) ^ 153470583;
                                            i24 = -1228753038;
                                        }
                                        break;
                                    case -901513004:
                                    case 631603226:
                                        return;
                                    case -896709711:
                                    case -383233321:
                                        C0630.m2564();
                                        C2126.m7040();
                                        iM2567 = C2105.m6981("᩻۠") ^ i21;
                                        i23 = ((iM2567 ^ i22) * 11957) ^ 153470583;
                                        i24 = -1228753038;
                                        break;
                                    case -714356722:
                                    case 1328409114:
                                        if (C1916.f6442) {
                                            iM2567 = (i21 - C0630.m2566("᩷ۘ")) * (-119);
                                            i23 = ((iM2567 ^ i22) * 19387) ^ (-1125137094);
                                            i24 = -1768551295;
                                        } else {
                                            iM2567 = (i22 - C0630.m2566("ۘ᩹")) * 59;
                                            i23 = ((iM2567 ^ i21) * 1153) ^ 118722455;
                                            i24 = 837948369;
                                        }
                                        break;
                                    case -609277977:
                                    case -296001012:
                                        if (C5695.m16023() >= 0) {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        } else {
                                            iM2567 = C2105.m6981("ۧۡ") ^ i21;
                                            i23 = ((iM2567 ^ i22) * 3689) ^ 910151430;
                                            i24 = 1441319016;
                                        }
                                        break;
                                    case -507913183:
                                    case 371380006:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        } else {
                                            iM2567 = (i22 - C2105.m6981("᩸ۙ")) * (-75);
                                            i23 = ((iM2567 ^ i21) * (-2909)) ^ (-1579529551);
                                            i24 = -1844124458;
                                        }
                                        break;
                                    case -506001257:
                                    case 607393002:
                                        if (C0630.f2410 <= 0) {
                                            iM2567 = (i22 - C0630.m2566("ܳۛ")) * (-9);
                                            i23 = ((iM2567 ^ i21) * (-12509)) ^ (-103070885);
                                            i24 = -234374717;
                                        } else {
                                            iM2567 = C0630.m2566("ܳܰ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * 12133) ^ (-219507106);
                                            i24 = -448762272;
                                        }
                                        break;
                                    case -392006166:
                                    case 1876504004:
                                        if (RunnableC3474.m10630()) {
                                            iM2567 = (C2105.m6981("ܿۨ") ^ i22) * 9;
                                            i23 = ((iM2567 ^ i21) * (-22193)) ^ (-1092467593);
                                            i24 = 306404770;
                                        } else {
                                            iM2567 = (i22 - C0630.m2566("ܳۛ")) * (-9);
                                            i23 = ((iM2567 ^ i21) * (-12509)) ^ (-103070885);
                                            i24 = -234374717;
                                        }
                                        break;
                                    case -289562038:
                                    case 171405570:
                                        if (C3683.f11629 >= 0) {
                                            iM2567 = C2105.m6981("ܽܶ") ^ i21;
                                            i23 = ((iM2567 ^ i22) * (-30533)) ^ 834317712;
                                            i24 = -1435484054;
                                        } else {
                                            iM2567 = (C2105.m6981("ᩳۨ") ^ i22) * (-53);
                                            i23 = ((iM2567 ^ i21) * 8385) ^ (-194774698);
                                            i24 = -359179688;
                                        }
                                        break;
                                    case -183806173:
                                    case 1691267242:
                                        C2958.m9034();
                                        throw new RuntimeException();
                                    case 248860386:
                                    case 274879146:
                                        if (C3245.f10203 <= 0) {
                                            iM2567 = (i22 - C0630.m2566("ۘ᩹")) * 59;
                                            i23 = ((iM2567 ^ i21) * 1153) ^ 118722455;
                                            i24 = 837948369;
                                        } else {
                                            iM2567 = (i21 - C0630.m2566("۠ۗ")) * 81;
                                            i23 = ((iM2567 ^ i22) * (-18021)) ^ 889695184;
                                            i24 = 1464623287;
                                        }
                                        break;
                                    case 1327723107:
                                    case 1909561554:
                                        C21923.m49329();
                                        if (C4075.f12947 >= 0) {
                                            iM2567 = (i22 - C0630.m2566("ܳۛ")) * (-9);
                                            i23 = ((iM2567 ^ i21) * (-12509)) ^ (-103070885);
                                            i24 = -234374717;
                                        } else {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        }
                                        break;
                                    default:
                                        if (C3432.m10477() <= 0) {
                                            iM2567 = C0630.m2566("ۘۛ") ^ i22;
                                            i23 = ((iM2567 ^ i21) * (-1545)) ^ 1058099046;
                                            i24 = 470438723;
                                        } else {
                                            iM2567 = (i21 - C2105.m6981("ܰ᩸")) * 7;
                                            i23 = ((iM2567 ^ i22) * 23921) ^ (-304428645);
                                            i24 = -793624298;
                                        }
                                        break;
                                }
                            }
                        }
                    }, j);
                    break;
                case -586138277:
                case 1160012003:
                    if (view.isFocused()) {
                        iM2566 = (i5 - C0630.m2566("᩺ᩴ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM2566 ^ i4) * (-24475)) ^ 1122655852;
                        i3 = -1845265626;
                    } else {
                        iM2566 = (C2105.m6981("ۙ᩸") ^ i4) * (-69);
                        i2 = ((iM2566 ^ i5) * (-23949)) ^ (-516704672);
                        i3 = 1678814589;
                    }
                    int i1115 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i1115;
                    break;
                case -58698803:
                case 2136065498:
                    int i20 = i11 + i12;
                    i13 = i20 + i20;
                    s = 12716;
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C0630.m2566("ܳ֨") ^ i4) * 57;
                        i2 = ((iM2566 ^ i5) * 14281) ^ (-1148546454);
                        i3 = 42871130;
                    } else {
                        iM2566 = C0630.m2566("ۧۘ") ^ i5;
                        i2 = ((iM2566 ^ i4) * 2369) ^ 1007478020;
                        i3 = 1439408167;
                    }
                    int i1116 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i1116;
                    break;
                case -53338707:
                case 1612978669:
                    C7811.m20844();
                    iM2566 = (C2105.m6981("ۤۤ") ^ i4) * (-97);
                    i2 = ((iM2566 ^ i5) * (-13121)) ^ (-1598910326);
                    i3 = -586819293;
                    int i1117 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i1117;
                    break;
                case 73187908:
                case 348874131:
                    sArr = f15520;
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("ۢ֨") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-21939)) ^ 870020207;
                        i3 = 629426829;
                    } else {
                        iM2566 = C0630.m2566("ܳۗ") ^ i5;
                        i2 = ((iM2566 ^ i4) * 19305) ^ 856208374;
                        i3 = -1425273335;
                    }
                    int i1118 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i1118;
                    break;
                case 73308981:
                case 155276987:
                    objM7509 = C2272.m7509(contextM6566, C1916.m6311(sArr2, i9, i10, i8));
                    sArr3 = f15520;
                    if (C1773.f6144 <= 0) {
                        iM2566 = (i5 - C2105.m6981("ۤܰ")) * 109;
                        i2 = ((iM2566 ^ i4) * 30921) ^ 337837913;
                        i3 = -1059755647;
                    } else {
                        iM2566 = C2105.m6981("᩹ۗ") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-31955)) ^ (-737129866);
                        i3 = -1742605033;
                    }
                    int i1119 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i1119;
                    break;
                case 343488176:
                case 1146823936:
                    i10 = 12;
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("ܽ۟") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-19343)) ^ 1114713818;
                        i3 = 1252026122;
                    } else {
                        iM2566 = (C0630.m2566("ۧ᩵") + i4) * 25;
                        i2 = ((iM2566 ^ i5) * 10223) ^ 1943979223;
                        i3 = -1518992982;
                    }
                    int i11110 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i11110;
                    break;
                case 435343561:
                case 1957576282:
                    i8 = 31231;
                    iM2566 = C0630.m2566("ۡ֨") ^ i5;
                    i2 = ((iM2566 ^ i4) * 23091) ^ (-2144154170);
                    i3 = -1670236638;
                    int i11111 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i11111;
                    break;
                case 735720420:
                case 1430768007:
                    break;
                case 869353534:
                case 2019247191:
                    contextM6566 = AbstractC2021.m6566(view);
                    sArr2 = f15520;
                    i9 = 476;
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C0630.m2566("ܳ֨") ^ i4) * 57;
                        i2 = ((iM2566 ^ i5) * 14281) ^ (-1148546454);
                        i3 = 42871130;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ۤ۟")) * (-99);
                        i2 = ((iM2566 ^ i4) * 20461) ^ 242691508;
                        i3 = -1215941153;
                    }
                    int i11112 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i11112;
                    break;
                default:
                    if (i < i15) {
                        iM2566 = (C0630.m2566("۟ۖ") ^ i5) * 77;
                        i2 = ((iM2566 ^ i4) * (-10041)) ^ 41023226;
                        i3 = 454659668;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܶ᩶")) * (-13);
                        i2 = ((iM2566 ^ i5) * (-26181)) ^ (-1363212114);
                        i3 = 7341781;
                    }
                    int i11113 = i2;
                    i16 = iM2566 ^ i3;
                    i6 = i11113;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Drawable m14305(int i) {
        Drawable drawableM48345 = C21311.m48345(C0382.m1842(), i);
        C0714.m2808(drawableM48345);
        return drawableM48345;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14307(int i, View view) {
        int i2 = -1245195250;
        int i3 = C3537.f11231;
        int i4 = C2167.f7158;
        int iM2566 = (i4 - C0630.m2566("ۘۙ")) * (-77);
        int i5 = ((iM2566 ^ i3) * 23341) ^ (-1107144456);
        int i6 = -1246729424;
        while (true) {
            i2 = ((((i2 ^ i3) * (-275)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -1992676789:
                case -663317106:
                    C3683.m11222();
                    if (!C2126.f7087) {
                        iM2566 = (C2105.m6981("ܶ֡") ^ i3) * 27;
                        i5 = ((iM2566 ^ i4) * 25355) ^ (-1059242427);
                        i6 = 905398559;
                    } else {
                        iM2566 = (C0630.m2566("۫ܶ") ^ i4) * 61;
                        i5 = ((iM2566 ^ i3) * (-5709)) ^ (-243024206);
                        i6 = 939262902;
                    }
                    break;
                case -1807388312:
                case 605358270:
                    if (!C4159.f13567) {
                        iM2566 = (C2105.m6981("ܶ֡") ^ i3) * 27;
                        i5 = ((iM2566 ^ i4) * 25355) ^ (-1059242427);
                        i6 = 905398559;
                    } else {
                        iM2566 = (C0630.m2566("ۚ۟") ^ i4) * q.h;
                        i5 = ((iM2566 ^ i3) * (-14177)) ^ 1050987718;
                        i6 = -950124839;
                    }
                    break;
                case -1386824022:
                case 1806046263:
                    if (C3245.m9925() != 0) {
                        iM2566 = (C2105.m6981("ܶ֡") ^ i3) * 27;
                        i5 = ((iM2566 ^ i4) * 25355) ^ (-1059242427);
                        i6 = 905398559;
                    } else {
                        iM2566 = (C2105.m6981("ܽܺ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2566 ^ i4) * 19717) ^ 1094270350;
                        i6 = -1261385159;
                    }
                    break;
                case -1322573882:
                case -83917384:
                    m14328(i + 1, view);
                    iM2566 = (C0630.m2566("ۘ۟") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i5 = ((iM2566 ^ i4) * (-449)) ^ 490425476;
                    i6 = -1739647133;
                    break;
                case -1297422807:
                case -218355907:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (i4 - C2105.m6981("᩵֫")) * 91;
                        i5 = ((iM2566 ^ i3) * (-31769)) ^ (-394793757);
                        i6 = -1506550229;
                    } else {
                        iM2566 = (i4 - C2105.m6981("۠᩹")) * (-39);
                        i5 = ((iM2566 ^ i3) * (-7409)) ^ (-331661413);
                        i6 = 383341340;
                    }
                    break;
                case -1001602675:
                case -506695391:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("ۚ۟") ^ i4) * q.h;
                        i5 = ((iM2566 ^ i3) * (-14177)) ^ 1050987718;
                        i6 = -950124839;
                    } else {
                        iM2566 = C2105.m6981("᩻ۜ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-1639)) ^ (-1450998895);
                        i6 = -1821832582;
                    }
                    break;
                case -972269153:
                case 2042652316:
                    if (view.isFocused()) {
                        iM2566 = C2105.m6981("ۧۡ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-1621)) ^ 663579116;
                        i6 = 1753042746;
                    } else {
                        iM2566 = (C0630.m2566("ۘ۟") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2566 ^ i4) * (-449)) ^ 490425476;
                        i6 = -1739647133;
                    }
                    break;
                case -945867538:
                case -424829861:
                    if (!C0483.m2121()) {
                        iM2566 = (C0630.m2566("ۚ۟") ^ i4) * q.h;
                        i5 = ((iM2566 ^ i3) * (-14177)) ^ 1050987718;
                        i6 = -950124839;
                    } else {
                        iM2566 = (C0630.m2566("֨ۨ") + i3) * 79;
                        i5 = ((iM2566 ^ i4) * 6183) ^ (-65548538);
                        i6 = 739670526;
                    }
                    break;
                case -721294392:
                case -37173643:
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("ᩴ᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * 10669) ^ (-1250085438);
                        i6 = 591816181;
                    } else {
                        iM2566 = (i4 - C2105.m6981("᩵֫")) * 91;
                        i5 = ((iM2566 ^ i3) * (-31769)) ^ (-394793757);
                        i6 = -1506550229;
                    }
                    break;
                case -597088513:
                case -108853516:
                    break;
                case -412662750:
                case 717246429:
                    if (C2272.m7503()) {
                        iM2566 = (C0630.m2566("֨ۨ") + i3) * 79;
                        i5 = ((iM2566 ^ i4) * 6183) ^ (-65548538);
                        i6 = 739670526;
                    } else {
                        iM2566 = C0630.m2566("ۘۚ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 18003) ^ 1558963771;
                        i6 = -1945461659;
                    }
                    break;
                case -181635687:
                case 1217021219:
                    if (view.isAttachedToWindow()) {
                        iM2566 = (i4 - C2105.m6981("ۤ᩻")) * (-101);
                        i5 = ((iM2566 ^ i3) * (-28997)) ^ 1587219614;
                        i6 = 1345575580;
                    } else {
                        iM2566 = (C0630.m2566("ۘ۟") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2566 ^ i4) * (-449)) ^ 490425476;
                        i6 = -1739647133;
                    }
                    break;
                case -26383057:
                case 1286797076:
                    ServiceConnectionC3453.m10564();
                    C5695.m16023();
                    break;
                case 148642142:
                case 728552484:
                    C0630.m2564();
                    iM2566 = (C0630.m2566("۫ܶ") ^ i4) * 61;
                    i5 = ((iM2566 ^ i3) * (-5709)) ^ (-243024206);
                    i6 = 939262902;
                    break;
                case 285914249:
                case 778581362:
                    if (view.isShown()) {
                        iM2566 = C2105.m6981("ᩳۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-4181)) ^ (-2106107251);
                        i6 = 397831955;
                    } else {
                        iM2566 = (C0630.m2566("ۘ۟") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2566 ^ i4) * (-449)) ^ 490425476;
                        i6 = -1739647133;
                    }
                    break;
                case 292085946:
                case 970870992:
                    if (C1128.m3851() <= 0) {
                        iM2566 = (C0630.m2566("֨ۨ") + i3) * 79;
                        i5 = ((iM2566 ^ i4) * 6183) ^ (-65548538);
                        i6 = 739670526;
                    } else {
                        iM2566 = C2105.m6981("֫֫") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-321)) ^ 27881483;
                        i6 = -208243045;
                    }
                    break;
                case 344579311:
                case 600144934:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (i4 - C2105.m6981("᩵֫")) * 91;
                        i5 = ((iM2566 ^ i3) * (-31769)) ^ (-394793757);
                        i6 = -1506550229;
                    } else {
                        iM2566 = C2105.m6981("ۘۢ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-29531)) ^ (-852687098);
                        i6 = -41038312;
                    }
                    break;
                case 923455749:
                case 1121140209:
                    if (C3019.m9255() <= 0) {
                        iM2566 = (C2105.m6981("ܶ֡") ^ i3) * 27;
                        i5 = ((iM2566 ^ i4) * 25355) ^ (-1059242427);
                        i6 = 905398559;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۖ᩷")) * 127;
                        i5 = ((iM2566 ^ i3) * (-3673)) ^ 295683677;
                        i6 = -1072585727;
                    }
                    break;
                case 1505891772:
                case 1572031277:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C0630.m2566("ۚ۟") ^ i4) * q.h;
                        i5 = ((iM2566 ^ i3) * (-14177)) ^ 1050987718;
                        i6 = -950124839;
                    } else {
                        iM2566 = (C2105.m6981("۟ۛ") ^ i4) * (-21);
                        i5 = ((iM2566 ^ i3) * 14433) ^ (-363324119);
                        i6 = 1078778953;
                    }
                    break;
                default:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C0630.m2566("ۚ۟") ^ i4) * q.h;
                        i5 = ((iM2566 ^ i3) * (-14177)) ^ 1050987718;
                        i6 = -950124839;
                    } else {
                        iM2566 = (C0630.m2566("᩵᩹") ^ i3) * 57;
                        i5 = ((iM2566 ^ i4) * (-25529)) ^ (-1113329340);
                        i6 = 1404344287;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01da A[PHI: r5 r7 r8 r11 r16
      0x01da: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:52:0x01d8, B:47:0x01a5, B:28:0x00de, B:16:0x009a, B:13:0x0092, B:10:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:52:0x01d8, B:47:0x01a5, B:28:0x00de, B:16:0x009a, B:13:0x0092, B:10:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:52:0x01d8, B:47:0x01a5, B:28:0x00de, B:16:0x009a, B:13:0x0092, B:10:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:52:0x01d8, B:47:0x01a5, B:28:0x00de, B:16:0x009a, B:13:0x0092, B:10:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r16v20 int) = (r16v5 int), (r16v6 int), (r16v13 int), (r16v17 int), (r16v19 int), (r16v22 int) binds: [B:52:0x01d8, B:47:0x01a5, B:28:0x00de, B:16:0x009a, B:13:0x0092, B:10:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x022f A[PHI: r4 r9 r16
      0x022f: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:60:0x022d, B:56:0x020f, B:43:0x0181, B:18:0x009e, B:16:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:60:0x022d, B:56:0x020f, B:43:0x0181, B:18:0x009e, B:16:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r16v16 int) = (r16v3 int), (r16v4 int), (r16v7 int), (r16v15 int), (r16v17 int) binds: [B:60:0x022d, B:56:0x020f, B:43:0x0181, B:18:0x009e, B:16:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0263 A[PHI: r1 r2 r3 r12 r16
      0x0263: PHI (r1v4 android.content.pm.PackageManager) = 
      (r1v2 android.content.pm.PackageManager)
      (r1v3 android.content.pm.PackageManager)
      (r1v2 android.content.pm.PackageManager)
      (r1v2 android.content.pm.PackageManager)
     binds: [B:64:0x0261, B:32:0x0105, B:24:0x00bd, B:13:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:64:0x0261, B:32:0x0105, B:24:0x00bd, B:13:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:64:0x0261, B:32:0x0105, B:24:0x00bd, B:13:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:64:0x0261, B:32:0x0105, B:24:0x00bd, B:13:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r16v18 int) = (r16v2 int), (r16v12 int), (r16v14 int), (r16v19 int) binds: [B:64:0x0261, B:32:0x0105, B:24:0x00bd, B:13:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final PackageManager m14320() {
        int iM2566;
        int i;
        int i2;
        int i3 = C3537.f11231;
        int i4 = C2958.f9394;
        int iM6981 = C2105.m6981("ܿۗ") ^ i3;
        int i5 = ((iM6981 ^ i4) * (-8819)) ^ 1916147355;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ 828971186;
        PackageManager packageManager = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -659527826;
        while (true) {
            int i14 = i6 ^ (i5 & (((i13 ^ i4) * 8955) >> 31));
            switch (i14) {
                case -2124597316:
                case -696744325:
                    i14 = i14;
                    s = sArr[c];
                    if (C4159.m12565() >= 0) {
                        iM2566 = C2105.m6981("֨᩺") ^ i3;
                        i = ((iM2566 ^ i4) * 25777) ^ 1610928585;
                        i2 = -373304179;
                    } else {
                        iM2566 = (i4 - C2105.m6981("֫ۤ")) * (-59);
                        i = ((iM2566 ^ i3) * (-13175)) ^ (-1180201061);
                        i2 = 424966335;
                    }
                    int i15 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i15;
                    break;
                case -1888353836:
                case 1720366726:
                    i14 = i14;
                    if (C0483.f2088 < 0) {
                        iM2566 = C2105.m6981("֨᩺") ^ i3;
                        i = ((iM2566 ^ i4) * 25777) ^ 1610928585;
                        i2 = -373304179;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֡ܳ")) * (-127);
                        i = ((iM2566 ^ i4) * 14973) ^ 96882684;
                        i2 = 167905237;
                    }
                    int i16 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i16;
                    break;
                case -1737110327:
                case 1033644878:
                    i14 = i14;
                    i7 = s * s;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (i3 - C2105.m6981("֡ܳ")) * (-127);
                        i = ((iM2566 ^ i4) * 14973) ^ 96882684;
                        i2 = 167905237;
                    } else {
                        iM2566 = C0630.m2566("᩺ۧ") ^ i3;
                        i = ((iM2566 ^ i4) * (-1027)) ^ (-870656);
                        i2 = -932500082;
                    }
                    int i17 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i17;
                    break;
                case -1679412504:
                case 494393618:
                    i14 = i14;
                    if (i9 - (i10 * i10) >= 0) {
                        iM2566 = (C0630.m2566("ۤۧ") + i4) * 7;
                        i = ((iM2566 ^ i3) * (-9053)) ^ 1621314309;
                        i2 = -1492511914;
                    } else {
                        iM2566 = (C2105.m6981("ۗᩴ") + i4) * (-69);
                        i = ((iM2566 ^ i3) * 2811) ^ 2001030476;
                        i2 = 272855894;
                    }
                    int i18 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i18;
                    break;
                case -1233863864:
                case 1908391499:
                    i14 = i14;
                    packageManager = C0382.m1842().getPackageManager();
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("ܽ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * (-32281)) ^ (-455635225);
                        i2 = 2052071837;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۖ᩷")) * (-127);
                        i = ((iM2566 ^ i4) * (-19337)) ^ (-1367117882);
                        i2 = -946935107;
                    }
                    int i19 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i19;
                    break;
                case -1084189309:
                case 939921685:
                    C3245.m9925();
                    return null;
                case -793591838:
                case -7402163:
                    i14 = i14;
                    C1005.m3501();
                    C2105.m6982();
                    iM2566 = C2105.m6981("֨᩺") ^ i3;
                    i = ((iM2566 ^ i4) * 25777) ^ 1610928585;
                    i2 = -373304179;
                    int i110 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i110;
                    break;
                case -662279602:
                case 167320861:
                    if (C7106.m19120() > 0) {
                        i14 = i14;
                        iM2566 = (i3 - C2105.m6981("֡ܳ")) * (-127);
                        i = ((iM2566 ^ i4) * 14973) ^ 96882684;
                        i2 = 167905237;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۧۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i14 = i14;
                        i = ((iM2566 ^ i4) * 11823) ^ 1873452949;
                        i2 = -1890339381;
                    }
                    int i111 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i111;
                    break;
                case -620466447:
                case 1636771208:
                    i14 = i14;
                    C4263.m12819();
                    if (C22628.m50615() == 0) {
                        iM2566 = (i3 - C2105.m6981("֡ܳ")) * (-127);
                        i = ((iM2566 ^ i4) * 14973) ^ 96882684;
                        i2 = 167905237;
                    } else {
                        iM2566 = C0630.m2566("ܽ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * (-32281)) ^ (-455635225);
                        i2 = 2052071837;
                    }
                    int i112 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i112;
                    break;
                case -523177088:
                case 1666592250:
                    i14 = i14;
                    sArr = f15520;
                    c = 369;
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ܽ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * (-32281)) ^ (-455635225);
                        i2 = 2052071837;
                    } else {
                        iM2566 = (C0630.m2566("᩷ܿ") + i3) * 45;
                        i = ((iM2566 ^ i4) * (-18635)) ^ (-2108742059);
                        i2 = -206345646;
                    }
                    int i113 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i113;
                    break;
                case -518664298:
                case 1519064853:
                    i14 = i14;
                    i9 = i8 + i8;
                    s2 = 17703;
                    if (C1294.f4556 >= 0) {
                        iM2566 = (i3 - C2105.m6981("֡ܳ")) * (-127);
                        i = ((iM2566 ^ i4) * 14973) ^ 96882684;
                        i2 = 167905237;
                    } else {
                        iM2566 = C2105.m6981("ۜۚ") ^ i4;
                        i = ((iM2566 ^ i3) * 16635) ^ (-300419142);
                        i2 = -510805984;
                    }
                    int i114 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i114;
                    break;
                case -348527220:
                case 766234584:
                    i14 = i14;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("֨᩺") ^ i3;
                        i = ((iM2566 ^ i4) * 25777) ^ 1610928585;
                        i2 = -373304179;
                    } else {
                        iM2566 = (C2105.m6981("ۚۤ") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i3) * (-12575)) ^ 1307940798;
                        i2 = -924583569;
                    }
                    int i115 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i115;
                    break;
                case -48644406:
                case 314415956:
                    i11 = 23727;
                    iM2566 = C0630.m2566("ܳܺ") ^ i3;
                    i = ((iM2566 ^ i4) * (-25503)) ^ (-133182599);
                    i2 = 1741508965;
                    int i116 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i116;
                    break;
                case 122251696:
                case 384512212:
                    i14 = i14;
                    i12 = 370;
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ܽ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * (-32281)) ^ (-455635225);
                        i2 = 2052071837;
                    } else {
                        iM2566 = C0630.m2566("ᩳۧ") ^ i4;
                        i = ((iM2566 ^ i3) * (-17059)) ^ 1556712672;
                        i2 = -1775934976;
                    }
                    int i117 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i117;
                    break;
                case 347060681:
                case 1574391970:
                    i14 = i14;
                    i10 = s + s2;
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("֨᩺") ^ i3;
                        i = ((iM2566 ^ i4) * 25777) ^ 1610928585;
                        i2 = -373304179;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۘ֨")) * (-19);
                        i = ((iM2566 ^ i4) * (-16225)) ^ (-813609151);
                        i2 = 1914935776;
                    }
                    int i118 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i118;
                    break;
                case 351277792:
                case 1458122385:
                    i11 = 37093;
                    iM2566 = C0630.m2566("ܳܺ") ^ i3;
                    i = ((iM2566 ^ i4) * (-25503)) ^ (-133182599);
                    i2 = 1741508965;
                    int i119 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i119;
                    break;
                case 675000064:
                case 841466836:
                    i14 = i14;
                    sArr2 = f15520;
                    if (C1711.m5736() <= 0) {
                        iM2566 = (i3 - C2105.m6981("֡ܳ")) * (-127);
                        i = ((iM2566 ^ i4) * 14973) ^ 96882684;
                        i2 = 167905237;
                    } else {
                        iM2566 = (C2105.m6981("᩹᩺") ^ i4) * q.h;
                        i = ((iM2566 ^ i3) * 9071) ^ (-1861235128);
                        i2 = -1483921142;
                    }
                    int i1110 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i1110;
                    break;
                case 1661239875:
                case 2047503078:
                    C2126.m7031(packageManager, C4263.m12817(sArr2, i12, 22, i11));
                    return packageManager;
                default:
                    i14 = i14;
                    i8 = i7 + 313396209;
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("֫ܽ") ^ i4) * 19;
                        i = ((iM2566 ^ i3) * 20941) ^ 606600482;
                        i2 = 947328610;
                    } else {
                        iM2566 = C2105.m6981("ܺ۬") ^ i3;
                        i = ((iM2566 ^ i4) * 31947) ^ (-1980030522);
                        i2 = -1959592531;
                    }
                    int i1111 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i1111;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AssetManager m14325() {
        AssetManager assets = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -1958934046;
        int i7 = C1420.f5096;
        int i8 = C0630.f2410;
        int iM6981 = C2105.m6981("۫ܳ") ^ i8;
        int i9 = ((iM6981 ^ i7) * 16195) ^ 145624398;
        int i10 = -222835601;
        while (true) {
            i6 = ((((i6 ^ i7) * 1103) >> 31) & i9) ^ (iM6981 ^ i10);
            switch (i6) {
                case -1688156773:
                case -1134649628:
                    if ((i2 + i3) - i >= 0) {
                        iM6981 = (C2105.m6981("ᩳۗ") ^ i8) * 21;
                        i9 = ((iM6981 ^ i7) * 15985) ^ (-1941615818);
                        i10 = 987500260;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ܺ֫")) * 79;
                        i9 = ((iM6981 ^ i8) * 22593) ^ 1993335900;
                        i10 = -148327197;
                    }
                    break;
                case -1661491843:
                case 882677939:
                    if (!C1005.f3721) {
                        iM6981 = C2105.m6981("᩵ܶ") ^ i7;
                        i9 = ((iM6981 ^ i8) * (-20085)) ^ (-745115580);
                        i10 = 1168607676;
                    } else {
                        iM6981 = (C0630.m2566("ۚۧ") ^ i7) * (-53);
                        i9 = ((iM6981 ^ i8) * 15321) ^ (-1126366225);
                        i10 = 447684959;
                    }
                    break;
                case -1493840523:
                case 1301264963:
                    assets = C3432.m10479().getAssets();
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C0630.m2566("᩺ۗ") + i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((iM6981 ^ i8) * 29939) ^ (-927350119);
                        i10 = 890851086;
                    } else {
                        iM6981 = C2105.m6981("ۛ᩺") ^ i7;
                        i9 = ((iM6981 ^ i8) * 25135) ^ (-1555033810);
                        i10 = 444266233;
                    }
                    break;
                case -1475871103:
                case 1242157857:
                    sArr = f15520;
                    c = 445;
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C0630.m2566("ۚۧ") ^ i7) * (-53);
                        i9 = ((iM6981 ^ i8) * 15321) ^ (-1126366225);
                        i10 = 447684959;
                    } else {
                        iM6981 = C2105.m6981("ܰ֫") ^ i7;
                        i9 = ((iM6981 ^ i8) * 12093) ^ 1871676941;
                        i10 = 1457238176;
                    }
                    break;
                case -1251092678:
                case 997819621:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i8 - C2105.m6981("ܰ֨")) * 65;
                        i9 = ((iM6981 ^ i7) * 5249) ^ 1322000657;
                        i10 = -541175299;
                    } else {
                        iM6981 = C0630.m2566("ۖ֨") ^ i8;
                        i9 = ((iM6981 ^ i7) * 9725) ^ 158040849;
                        i10 = -1119995653;
                    }
                    break;
                case -1241851719:
                case 477779438:
                    i4 = 47786;
                    iM6981 = C0630.m2566("᩶ܶ") ^ i8;
                    i9 = ((iM6981 ^ i7) * 12255) ^ (-2126638760);
                    i10 = -62514765;
                    break;
                case -885680223:
                case -636259139:
                    i5 = 446;
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C0630.m2566("ۚۧ") ^ i7) * (-53);
                        i9 = ((iM6981 ^ i8) * 15321) ^ (-1126366225);
                        i10 = 447684959;
                    } else {
                        iM6981 = C2105.m6981("᩷ᩴ") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-28743)) ^ 1950514423;
                        i10 = 350518495;
                    }
                    break;
                case -826920666:
                case 1243385166:
                    i4 = 9640;
                    iM6981 = C0630.m2566("᩶ܶ") ^ i8;
                    i9 = ((iM6981 ^ i7) * 12255) ^ (-2126638760);
                    i10 = -62514765;
                    break;
                case -728462175:
                case 1815431068:
                    i = s * 1486;
                    if (C1711.f5919) {
                        iM6981 = (i8 - C2105.m6981("ܰ֨")) * 65;
                        i9 = ((iM6981 ^ i7) * 5249) ^ 1322000657;
                        i10 = -541175299;
                    } else {
                        iM6981 = C0630.m2566("ܰܳ") ^ i8;
                        i9 = ((iM6981 ^ i7) * 4093) ^ 1540767706;
                        i10 = 291123197;
                    }
                    break;
                case -656313425:
                case -360881805:
                    C1420.m4913();
                    if (C1128.f4106 > 0) {
                        iM6981 = C2105.m6981("ܰᩴ") ^ i8;
                        i9 = ((iM6981 ^ i7) * 14529) ^ (-1159269416);
                        i10 = -968379521;
                    } else {
                        iM6981 = (C0630.m2566("ۚۧ") ^ i7) * (-53);
                        i9 = ((iM6981 ^ i8) * 15321) ^ (-1126366225);
                        i10 = 447684959;
                    }
                    break;
                case -653463629:
                case -27224968:
                    C1128.m3851();
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("᩺ۗ") + i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((iM6981 ^ i8) * 29939) ^ (-927350119);
                        i10 = 890851086;
                    } else {
                        iM6981 = C2105.m6981("ܰᩴ") ^ i8;
                        i9 = ((iM6981 ^ i7) * 14529) ^ (-1159269416);
                        i10 = -968379521;
                    }
                    break;
                case -468929017:
                case 353472335:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C0630.m2566("᩺ۗ") + i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((iM6981 ^ i8) * 29939) ^ (-927350119);
                        i10 = 890851086;
                    } else {
                        iM6981 = C2105.m6981("ۚۜ") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-32089)) ^ 1785915494;
                        i10 = 1596831570;
                    }
                    break;
                case -410120657:
                case 472069502:
                    s = sArr[c];
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("᩵ܶ") ^ i7;
                        i9 = ((iM6981 ^ i8) * (-20085)) ^ (-745115580);
                        i10 = 1168607676;
                    } else {
                        iM6981 = (C0630.m2566("ۨۨ") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((iM6981 ^ i8) * (-24847)) ^ (-1448343569);
                        i10 = -1578502872;
                    }
                    break;
                case -310185396:
                case 913328814:
                    C2958.m9034();
                    C1420.m4913();
                    return null;
                case -201509788:
                case 1314381124:
                    C2126.m7031(assets, C0382.m1840(sArr2, i5, 14, i4));
                    return assets;
                case 94208854:
                case 1923485120:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("᩵ܶ") ^ i7;
                        i9 = ((iM6981 ^ i8) * (-20085)) ^ (-745115580);
                        i10 = 1168607676;
                    } else {
                        iM6981 = C0630.m2566("ۨ᩻") ^ i7;
                        i9 = ((iM6981 ^ i8) * 6913) ^ (-2110141282);
                        i10 = -156763075;
                    }
                    break;
                case 1273636536:
                case 1887473391:
                    i2 = s * s;
                    i3 = 552049;
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("᩵ܶ") ^ i7;
                        i9 = ((iM6981 ^ i8) * (-20085)) ^ (-745115580);
                        i10 = 1168607676;
                    } else {
                        iM6981 = (i7 - C0630.m2566("ۚ᩻")) * 77;
                        i9 = ((iM6981 ^ i8) * 6597) ^ 261961194;
                        i10 = -538792141;
                    }
                    break;
                case 1341364991:
                case 1504756626:
                    sArr2 = f15520;
                    if (C1916.f6442) {
                        iM6981 = (i8 - C2105.m6981("᩹۠")) * (-95);
                        i9 = ((iM6981 ^ i7) * (-9019)) ^ 256111339;
                        i10 = -1832920130;
                    } else {
                        iM6981 = (i8 - C2105.m6981("ܰ֨")) * 65;
                        i9 = ((iM6981 ^ i7) * 5249) ^ 1322000657;
                        i10 = -541175299;
                    }
                    break;
                default:
                    ViewOnClickListenerC1958.m6429();
                    iM6981 = (C0630.m2566("ۚۧ") ^ i7) * (-53);
                    i9 = ((iM6981 ^ i8) * 15321) ^ (-1126366225);
                    i10 = 447684959;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:55:0x01cd A[PHI: r5 r6 r7 r8 r12 r16
      0x01cd: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:54:0x01cb, B:50:0x01ab, B:46:0x0189, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:54:0x01cb, B:50:0x01ab, B:46:0x0189, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:54:0x01cb, B:50:0x01ab, B:46:0x0189, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:54:0x01cb, B:50:0x01ab, B:46:0x0189, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v5 int) binds: [B:54:0x01cb, B:50:0x01ab, B:46:0x0189, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r16v22 int) = (r16v5 int), (r16v6 int), (r16v7 int), (r16v25 int) binds: [B:54:0x01cb, B:50:0x01ab, B:46:0x0189, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x021c A[PHI: r4 r11 r16
      0x021c: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:62:0x021a, B:58:0x01ff, B:27:0x00b5, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:62:0x021a, B:58:0x01ff, B:27:0x00b5, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r16v19 int) = (r16v3 int), (r16v4 int), (r16v14 int), (r16v20 int) binds: [B:62:0x021a, B:58:0x01ff, B:27:0x00b5, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0250 A[PHI: r1 r2 r3 r16
      0x0250: PHI (r1v4 android.content.res.Resources) = (r1v2 android.content.res.Resources), (r1v3 android.content.res.Resources), (r1v2 android.content.res.Resources) binds: [B:66:0x024e, B:31:0x00dc, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:66:0x024e, B:31:0x00dc, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:66:0x024e, B:31:0x00dc, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r16v18 int) = (r16v2 int), (r16v13 int), (r16v21 int) binds: [B:66:0x024e, B:31:0x00dc, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Resources m14338() {
        int iM2566;
        int i;
        int i2;
        int i3 = C4117.f13076;
        int i4 = C0483.f2088;
        int iM6981 = (C2105.m6981("ۧ۟") ^ i4) * 69;
        int i5 = ((iM6981 ^ i3) * 13339) ^ 19081590;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ 1272143368;
        Resources resources = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1104052263;
        while (true) {
            int i14 = i6 ^ (i5 & (((i13 ^ i3) * 19109) >> 31));
            switch (i14) {
                case -2059668612:
                case -1305881121:
                    C3432.m10477();
                    iM2566 = (C2105.m6981("۠ۖ") + i3) * (-121);
                    i14 = i14;
                    i = ((iM2566 ^ i4) * (-9111)) ^ 942932448;
                    i2 = -932233806;
                    int i15 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i15;
                    break;
                case -1804645992:
                case -1392942196:
                    i14 = i14;
                    i10 = i8 + i9;
                    if (C3746.f11829 <= 0) {
                        iM2566 = C0630.m2566("ۘۖ") ^ i3;
                        i = ((iM2566 ^ i4) * (-71)) ^ 1570407607;
                        i2 = 515547449;
                    } else {
                        iM2566 = (C2105.m6981("۠ܺ") + i3) * (-99);
                        i = ((iM2566 ^ i4) * (-11859)) ^ 26212504;
                        i2 = -1886746960;
                    }
                    int i16 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i16;
                    break;
                case -1802212997:
                case 1830691509:
                    if (C0714.f2697 < 0) {
                        i14 = i14;
                        iM2566 = C2105.m6981("ܽۘ") ^ i4;
                        i = ((iM2566 ^ i3) * (-22685)) ^ (-323449442);
                        i2 = 1989545680;
                        int i17 = i14;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        i13 = i17;
                    }
                    i14 = i14;
                    iM2566 = C2105.m6981("۠۬") ^ i4;
                    i = ((iM2566 ^ i3) * (-28477)) ^ (-1861023397);
                    i2 = 1511553395;
                    int i18 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i18;
                    break;
                case -1452694261:
                case -1447706648:
                    C3245.m9925();
                    if (C5695.f17556 < 0) {
                        iM2566 = (C2105.m6981("۠ۖ") + i3) * (-121);
                        i14 = i14;
                        i = ((iM2566 ^ i4) * (-9111)) ^ 942932448;
                        i2 = -932233806;
                    } else {
                        i14 = i14;
                        iM2566 = C0630.m2566("ۘۖ") ^ i3;
                        i = ((iM2566 ^ i4) * (-71)) ^ 1570407607;
                        i2 = 515547449;
                    }
                    int i19 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i19;
                    break;
                case -1308297111:
                case 320451426:
                    i14 = i14;
                    resources = C0382.m1842().getResources();
                    if (C3019.m9255() <= 0) {
                        iM2566 = C2105.m6981("ܽۘ") ^ i4;
                        i = ((iM2566 ^ i3) * (-22685)) ^ (-323449442);
                        i2 = 1989545680;
                    } else {
                        iM2566 = C0630.m2566("ܽۤ") ^ i4;
                        i = ((iM2566 ^ i3) * (-17051)) ^ 143902866;
                        i2 = 1021071459;
                    }
                    int i110 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i110;
                    break;
                case -1262688969:
                case 264872601:
                    i14 = i14;
                    s = sArr[c];
                    if (C22628.m50615() != 0) {
                        iM2566 = C2105.m6981("۠۬") ^ i4;
                        i = ((iM2566 ^ i3) * (-28477)) ^ (-1861023397);
                        i2 = 1511553395;
                    } else {
                        iM2566 = C0630.m2566("ۧۨ") ^ i4;
                        i = ((iM2566 ^ i3) * 23983) ^ 2082719983;
                        i2 = 303169128;
                    }
                    int i111 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i111;
                    break;
                case -1034108783:
                case 841142905:
                    C3911.m11924();
                    return null;
                case -1002256537:
                case 2049045695:
                    i11 = 4245;
                    iM2566 = (C2105.m6981("ۨ֫") ^ i4) * 41;
                    i = ((iM2566 ^ i3) * 19709) ^ (-1005177408);
                    i2 = -1347944286;
                    int i112 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i112;
                    break;
                case -852331382:
                case -291762:
                    i14 = i14;
                    s2 = 12291;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("ܶ᩵") ^ i3;
                        i = ((iM2566 ^ i4) * 8981) ^ (-1408525639);
                        i2 = -1034089949;
                    } else {
                        iM2566 = C2105.m6981("֨۟") ^ i3;
                        i = ((iM2566 ^ i4) * (-24081)) ^ (-1997054236);
                        i2 = 1723981938;
                    }
                    int i113 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i113;
                    break;
                case -846357672:
                case -747437576:
                    i14 = i14;
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("۠۬") ^ i4;
                        i = ((iM2566 ^ i3) * (-28477)) ^ (-1861023397);
                        i2 = 1511553395;
                    } else {
                        iM2566 = (C0630.m2566("ܺۧ") + i4) * 79;
                        i = ((iM2566 ^ i3) * 9159) ^ 554866927;
                        i2 = 1754409767;
                    }
                    int i114 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i114;
                    break;
                case -704993059:
                case 1215553888:
                    C1128.m3851();
                    if (C3245.f10203 > 0) {
                        iM2566 = (C2105.m6981("۠ۖ") + i3) * (-121);
                        i14 = i14;
                        i = ((iM2566 ^ i4) * (-9111)) ^ 942932448;
                        i2 = -932233806;
                    } else {
                        i14 = i14;
                        iM2566 = C2105.m6981("۠۬") ^ i4;
                        i = ((iM2566 ^ i3) * (-28477)) ^ (-1861023397);
                        i2 = 1511553395;
                    }
                    int i115 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i115;
                    break;
                case -533103571:
                case 598024307:
                    i14 = i14;
                    if ((i10 + i10) - i7 >= 0) {
                        iM2566 = C0630.m2566("᩺۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-10677)) ^ (-1700872946);
                        i2 = 738864362;
                    } else {
                        iM2566 = C2105.m6981("ۙۤ") ^ i3;
                        i = ((iM2566 ^ i4) * 25875) ^ 700979525;
                        i2 = -1836349717;
                    }
                    int i116 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i116;
                    break;
                case -469769945:
                case -192229830:
                    i14 = i14;
                    sArr2 = f15520;
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("۠۬") ^ i4;
                        i = ((iM2566 ^ i3) * (-28477)) ^ (-1861023397);
                        i2 = 1511553395;
                    } else {
                        iM2566 = C2105.m6981("ۙۡ") ^ i3;
                        i = ((iM2566 ^ i4) * (-9817)) ^ (-1790524648);
                        i2 = 805445586;
                    }
                    int i117 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i117;
                    break;
                case -215334577:
                case 1823602135:
                    i11 = 57296;
                    iM2566 = (C2105.m6981("ۨ֫") ^ i4) * 41;
                    i = ((iM2566 ^ i3) * 19709) ^ (-1005177408);
                    i2 = -1347944286;
                    int i118 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i118;
                    break;
                case -33159211:
                case 130943476:
                    i14 = i14;
                    i8 = s * s;
                    i9 = 151068681;
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ܶ᩵") ^ i3;
                        i = ((iM2566 ^ i4) * 8981) ^ (-1408525639);
                        i2 = -1034089949;
                    } else {
                        iM2566 = (C0630.m2566("֡ۡ") ^ i4) * 109;
                        i = ((iM2566 ^ i3) * (-15267)) ^ 1701398420;
                        i2 = -1775724353;
                    }
                    int i119 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i119;
                    break;
                case 110391355:
                case 805883106:
                    i14 = i14;
                    int i20 = s + s2;
                    i7 = i20 * i20;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ܶ᩵") ^ i3;
                        i = ((iM2566 ^ i4) * 8981) ^ (-1408525639);
                        i2 = -1034089949;
                    } else {
                        iM2566 = (C0630.m2566("ۛ۟") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i4) * (-6437)) ^ 999897923;
                        i2 = 1607411984;
                    }
                    int i1110 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i1110;
                    break;
                case 1163320269:
                case 1329433944:
                    C2126.m7031(resources, RunnableC0588.m2436(sArr2, i12, 17, i11));
                    return resources;
                case 1213302681:
                case 1866937103:
                    i14 = i14;
                    sArr = f15520;
                    c = 729;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C2105.m6981("ܽۘ") ^ i4;
                        i = ((iM2566 ^ i3) * (-22685)) ^ (-323449442);
                        i2 = 1989545680;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۧۛ")) * (-21);
                        i = ((iM2566 ^ i4) * 7035) ^ 896527910;
                        i2 = 738588393;
                    }
                    int i1111 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i1111;
                    break;
                default:
                    i14 = i14;
                    i12 = 730;
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("ܶ᩵") ^ i3;
                        i = ((iM2566 ^ i4) * 8981) ^ (-1408525639);
                        i2 = -1034089949;
                    } else {
                        iM2566 = C0630.m2566("ۧ۫") ^ i4;
                        i = ((iM2566 ^ i3) * (-25243)) ^ (-278593579);
                        i2 = -1877080129;
                    }
                    int i1112 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    i13 = i1112;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ContentResolver m14336() {
        ContentResolver contentResolver = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -725426835;
        int i7 = C4263.f13799;
        int i8 = C4075.f12947;
        int iM2566 = (C0630.m2566("ܰۨ") ^ i7) * (-115);
        int i9 = ((iM2566 ^ i8) * (-31051)) ^ 1813085893;
        int i10 = 1292092574;
        while (true) {
            i6 = ((((i6 ^ i8) * 27779) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -2054487261:
                case 928243662:
                    sArr = f15520;
                    c = 685;
                    if (C4263.f13799 <= 0) {
                        iM2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((iM2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    } else {
                        iM2566 = C0630.m2566("ۗܶ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-12067)) ^ 1348114083;
                        i10 = -1289157586;
                    }
                    break;
                case -2037291254:
                case 1957189424:
                    sArr2 = f15520;
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ܳ᩷") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-19915)) ^ 1232288442;
                        i10 = -1657393406;
                    } else {
                        iM2566 = (C2105.m6981("᩺۫") ^ i7) * (-125);
                        i9 = ((iM2566 ^ i8) * (-26693)) ^ (-1478482481);
                        i10 = 1856034760;
                    }
                    break;
                case -2022312391:
                case 255310121:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((iM2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ᩳܶ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((iM2566 ^ i7) * (-1071)) ^ (-1718239191);
                        i10 = 527195562;
                    }
                    break;
                case -1330324434:
                case 1715812333:
                    i4 = 51802;
                    iM2566 = C2105.m6981("ۡۘ") ^ i8;
                    i9 = ((iM2566 ^ i7) * 23259) ^ 563595538;
                    i10 = 1605458890;
                    break;
                case -1304216735:
                case -1125371702:
                    if (C3537.m10746() <= 0) {
                        iM2566 = C2105.m6981("֡ܿ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 27955) ^ 1084240703;
                        i10 = 1608643036;
                    } else {
                        iM2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((iM2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    }
                    break;
                case -1225656160:
                case 189756538:
                    C0798.m2998();
                    return null;
                case -1185705836:
                case 1073795857:
                    s = sArr[c];
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((iM2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    } else {
                        iM2566 = C2105.m6981("ۛ۠") ^ i8;
                        i9 = ((iM2566 ^ i7) * 18637) ^ 1226250777;
                        i10 = -765233249;
                    }
                    break;
                case -861039712:
                case 359516030:
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((iM2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    } else {
                        iM2566 = (C0630.m2566("᩹ᩴ") ^ i7) * 91;
                        i9 = ((iM2566 ^ i8) * 31171) ^ 1952674161;
                        i10 = -1767497637;
                    }
                    break;
                case -807688403:
                case 53689475:
                    i5 = 686;
                    if (C3746.m11369() >= 0) {
                        iM2566 = (C0630.m2566("᩷᩻") + i7) * 87;
                        i9 = ((iM2566 ^ i8) * 14661) ^ (-463521705);
                        i10 = 2117269365;
                    } else {
                        iM2566 = (C0630.m2566("۟۬") ^ i8) * (-101);
                        i9 = ((iM2566 ^ i7) * 5977) ^ 2145817517;
                        i10 = 715304100;
                    }
                    break;
                case -800695237:
                case -598336945:
                    if (C1047.m3599() >= 0) {
                        iM2566 = (C0630.m2566("᩷᩻") + i7) * 87;
                        i9 = ((iM2566 ^ i8) * 14661) ^ (-463521705);
                        i10 = 2117269365;
                    } else {
                        iM2566 = (C2105.m6981("ܽ᩷") + i8) * (-55);
                        i9 = ((iM2566 ^ i7) * (-8437)) ^ (-2013083765);
                        i10 = -197552429;
                    }
                    break;
                case -703052826:
                case 1041987483:
                    i4 = 40468;
                    iM2566 = C2105.m6981("ۡۘ") ^ i8;
                    i9 = ((iM2566 ^ i7) * 23259) ^ 563595538;
                    i10 = 1605458890;
                    break;
                case -675654214:
                case 1001470479:
                    C1128.m3851();
                    if (!C1005.f3721) {
                        iM2566 = C0630.m2566("ܳ᩷") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-19915)) ^ 1232288442;
                        i10 = -1657393406;
                    } else {
                        iM2566 = C0630.m2566("֫᩷") ^ i7;
                        i9 = ((iM2566 ^ i8) * 21291) ^ 1655245455;
                        i10 = 1185989456;
                    }
                    break;
                case -672492027:
                case 1464293514:
                    contentResolver = C0382.m1842().getContentResolver();
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C0630.m2566("᩷᩻") + i7) * 87;
                        i9 = ((iM2566 ^ i8) * 14661) ^ (-463521705);
                        i10 = 2117269365;
                    } else {
                        iM2566 = C2105.m6981("ۡ۫") ^ i8;
                        i9 = ((iM2566 ^ i7) * 7605) ^ 616083480;
                        i10 = 248163064;
                    }
                    break;
                case -646151830:
                case 1513667874:
                    i = s * s;
                    i2 = 9174841;
                    if (C4159.f13567) {
                        iM2566 = (C2105.m6981("ۙ֡") ^ i7) * 33;
                        i9 = ((iM2566 ^ i8) * (-14391)) ^ 587229675;
                        i10 = -993038634;
                    } else {
                        iM2566 = (C0630.m2566("᩷᩻") + i7) * 87;
                        i9 = ((iM2566 ^ i8) * 14661) ^ (-463521705);
                        i10 = 2117269365;
                    }
                    break;
                case -472195059:
                case 148069787:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C2105.m6981("֡ܿ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 27955) ^ 1084240703;
                        i10 = 1608643036;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ܶ᩵")) * 47;
                        i9 = ((iM2566 ^ i8) * (-6937)) ^ (-1812289843);
                        i10 = 1291580604;
                    }
                    break;
                case 426481075:
                case 1640319225:
                    C4159.m12575(contentResolver, C3019.m9250(sArr2, i5, 23, i4));
                    return contentResolver;
                case 961950767:
                case 1928077396:
                    C2958.m9034();
                    C2105.m6982();
                    iM2566 = (C0630.m2566("᩹ᩴ") ^ i7) * 91;
                    i9 = ((iM2566 ^ i8) * 31171) ^ 1952674161;
                    i10 = -1767497637;
                    break;
                case 1596544037:
                case 2067031574:
                    i3 = i + i2;
                    s2 = 6058;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C0630.m2566("᩹ᩴ") ^ i7) * 91;
                        i9 = ((iM2566 ^ i8) * 31171) ^ 1952674161;
                        i10 = -1767497637;
                    } else {
                        iM2566 = C0630.m2566("ۗ᩶") ^ i7;
                        i9 = ((iM2566 ^ i8) * 5389) ^ 1917185526;
                        i10 = -1896213547;
                    }
                    break;
                default:
                    if (i3 - (s * s2) < 0) {
                        iM2566 = C2105.m6981("֨ۜ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 25975) ^ (-1965718175);
                        i10 = 172484743;
                    } else {
                        iM2566 = C2105.m6981("ۜۜ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-13463)) ^ (-1411910861);
                        i10 = 955192950;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final File m14322() {
        File filesDir = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 674260061;
        int i7 = C4117.f13076;
        int i8 = AbstractC2021.f6743;
        int iM2566 = (C0630.m2566("ܳۧ") + i8) * (-11);
        int i9 = ((iM2566 ^ i7) * (-25993)) ^ (-1348426);
        int i10 = -175790241;
        while (true) {
            i6 = ((((i6 ^ i7) * 11697) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -1882308569:
                case 672913356:
                    i = s * s;
                    i2 = 25735329;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("᩷᩸") ^ i7;
                        i9 = ((iM2566 ^ i8) * 29185) ^ 298524077;
                        i10 = -1223536298;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ܰ۬")) * 7;
                        i9 = ((iM2566 ^ i8) * (-32437)) ^ 1909275203;
                        i10 = -331748448;
                    }
                    break;
                case -1792855418:
                case -1483039142:
                    i4 = 34939;
                    iM2566 = C2105.m6981("ܺ᩹") ^ i8;
                    i9 = ((iM2566 ^ i7) * 30667) ^ (-159236322);
                    i10 = 1818523129;
                    break;
                case -1542371031:
                case 117525598:
                    C1005.m3501();
                    return null;
                case -1368706398:
                case -1124344371:
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = C0630.m2566("ۜ֡") ^ i7;
                        i9 = ((iM2566 ^ i8) * 3555) ^ 999734657;
                        i10 = 1112843702;
                    } else {
                        iM2566 = (C2105.m6981("ۙۖ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i9 = ((iM2566 ^ i8) * 32323) ^ 999685085;
                        i10 = 716282297;
                    }
                    break;
                case -1289464356:
                case 1271212502:
                    sArr = f15520;
                    c = 414;
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C2105.m6981("ᩳ۬") ^ i8) * 33;
                        i9 = ((iM2566 ^ i7) * (-6699)) ^ (-1064004041);
                        i10 = 820769978;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ۖ֡")) * (-67);
                        i9 = ((iM2566 ^ i7) * (-5295)) ^ (-48890363);
                        i10 = 1081044606;
                    }
                    break;
                case -1287317043:
                case -1143606988:
                    i3 = i + i2;
                    s2 = 10146;
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C2105.m6981("ᩳ۬") ^ i8) * 33;
                        i9 = ((iM2566 ^ i7) * (-6699)) ^ (-1064004041);
                        i10 = 820769978;
                    } else {
                        iM2566 = C2105.m6981("ܶۤ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 23461) ^ (-1725737112);
                        i10 = 116335365;
                    }
                    break;
                case -1156990180:
                case -888341686:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("᩷᩸") ^ i7;
                        i9 = ((iM2566 ^ i8) * 29185) ^ 298524077;
                        i10 = -1223536298;
                    } else {
                        iM2566 = C0630.m2566("ۚ۫") ^ i8;
                        i9 = ((iM2566 ^ i7) * 15709) ^ (-18673938);
                        i10 = -363755233;
                    }
                    break;
                case -1044055963:
                case 314517349:
                    s = sArr[c];
                    if (C0382.f1805) {
                        iM2566 = (C0630.m2566("ۤ᩵") + i8) * (-61);
                        i9 = ((iM2566 ^ i7) * (-32209)) ^ (-414461922);
                        i10 = -689120869;
                    } else {
                        iM2566 = C2105.m6981("᩷᩸") ^ i7;
                        i9 = ((iM2566 ^ i8) * 29185) ^ 298524077;
                        i10 = -1223536298;
                    }
                    break;
                case -1041439927:
                case 2060167469:
                    sArr2 = f15520;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("᩷᩸") ^ i7;
                        i9 = ((iM2566 ^ i8) * 29185) ^ 298524077;
                        i10 = -1223536298;
                    } else {
                        iM2566 = (i7 - C0630.m2566("᩻ܽ")) * 97;
                        i9 = ((iM2566 ^ i8) * 18871) ^ 2050715092;
                        i10 = 832481620;
                    }
                    break;
                case -793282255:
                case 265172879:
                    i5 = 415;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C0630.m2566("ۜ֡") ^ i7;
                        i9 = ((iM2566 ^ i8) * 3555) ^ 999734657;
                        i10 = 1112843702;
                    } else {
                        iM2566 = (C0630.m2566("ۚ᩶") ^ i7) * 23;
                        i9 = ((iM2566 ^ i8) * 4981) ^ (-570261268);
                        i10 = -1035749841;
                    }
                    break;
                case -538221784:
                case 240828706:
                    C2126.m7031(filesDir, C5695.m16034(sArr2, i5, 16, i4));
                    return filesDir;
                case -152927528:
                case 254694746:
                    ViewOnClickListenerC1958.m6429();
                    if (C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("ۜ֡") ^ i7;
                        i9 = ((iM2566 ^ i8) * 3555) ^ 999734657;
                        i10 = 1112843702;
                    } else {
                        iM2566 = C0630.m2566("ۨۛ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 13555) ^ 11028066;
                        i10 = 1370169134;
                    }
                    break;
                case 243335474:
                case 1346718440:
                    if (i3 - (s * s2) >= 0) {
                        iM2566 = C2105.m6981("ۨܽ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 29995) ^ (-1712856281);
                        i10 = -246163032;
                    } else {
                        iM2566 = (C2105.m6981("֡ۛ") ^ i7) * 95;
                        i9 = ((iM2566 ^ i8) * (-9021)) ^ 1544022971;
                        i10 = 2102139266;
                    }
                    break;
                case 265168178:
                case 986578949:
                    filesDir = C3432.m10479().getFilesDir();
                    if (C4263.f13799 <= 0) {
                        iM2566 = C0630.m2566("ۨۛ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 13555) ^ 11028066;
                        i10 = 1370169134;
                    } else {
                        iM2566 = C0630.m2566("ܺᩳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-8903)) ^ (-677257519);
                        i10 = -1756981581;
                    }
                    break;
                case 301600358:
                case 1597397772:
                    if (C7106.f21815 != 0) {
                        iM2566 = (C0630.m2566("᩸ۢ") ^ i8) * 3;
                        i9 = ((iM2566 ^ i7) * (-17369)) ^ (-31168570);
                        i10 = 215174113;
                    } else {
                        iM2566 = (C2105.m6981("ܽۤ") + i7) * 41;
                        i9 = ((iM2566 ^ i8) * (-9075)) ^ (-1291533777);
                        i10 = 761410644;
                    }
                    break;
                case 345892180:
                case 1157859542:
                    RunnableC3474.m10630();
                    iM2566 = C0630.m2566("ۨۛ") ^ i8;
                    i9 = ((iM2566 ^ i7) * 13555) ^ 11028066;
                    i10 = 1370169134;
                    break;
                case 453743648:
                case 1830275030:
                    if (C0964.f3626 == 0) {
                        iM2566 = (C0630.m2566("᩸ۢ") ^ i8) * 3;
                        i9 = ((iM2566 ^ i7) * (-17369)) ^ (-31168570);
                        i10 = 215174113;
                    } else {
                        iM2566 = C0630.m2566("ۨۛ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 13555) ^ 11028066;
                        i10 = 1370169134;
                    }
                    break;
                case 1130721530:
                case 1239734113:
                    i4 = 17877;
                    iM2566 = C2105.m6981("ܺ᩹") ^ i8;
                    i9 = ((iM2566 ^ i7) * 30667) ^ (-159236322);
                    i10 = 1818523129;
                    break;
                default:
                    if (C2105.f7037 == 0) {
                        iM2566 = (C2105.m6981("ᩳ۬") ^ i8) * 33;
                        i9 = ((iM2566 ^ i7) * (-6699)) ^ (-1064004041);
                        i10 = 820769978;
                    } else {
                        iM2566 = (C0630.m2566("᩸ۢ") ^ i8) * 3;
                        i9 = ((iM2566 ^ i7) * (-17369)) ^ (-31168570);
                        i10 = 215174113;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final File m14340() {
        File filesDir = null;
        int i = 781623778;
        int i2 = C1420.f5096;
        int i3 = C22628.f73083;
        int iM2566 = C0630.m2566("ۨۘ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-8543)) ^ 250954444;
        int i5 = 930710170;
        while (true) {
            i = ((((i ^ i2) * 5951) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1927749349:
                case 1122196190:
                    if (C1773.m5908() > 0) {
                        iM2566 = (i2 - C0630.m2566("ܺܶ")) * 69;
                        i4 = ((iM2566 ^ i3) * 21859) ^ (-1448996003);
                        i5 = 508447094;
                    } else {
                        iM2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((iM2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    }
                    break;
                case -1517775716:
                case 618724392:
                    File dataDir = C3432.m10479().getDataDir();
                    C0714.m2808(dataDir);
                    return dataDir;
                case -1180819163:
                case -902060120:
                    if (C1294.m4372() <= 0) {
                        iM2566 = C0630.m2566("᩺ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 26723) ^ (-667809149);
                        i5 = 1735012168;
                    } else {
                        iM2566 = C2105.m6981("ۜ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 19067) ^ (-226971253);
                        i5 = 1579223120;
                    }
                    break;
                case -1101274464:
                case 351770389:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((iM2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    } else {
                        iM2566 = C2105.m6981("֡۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7245) ^ (-217876309);
                        i5 = 823886941;
                    }
                    break;
                case -960294585:
                case -203200711:
                    filesDir = C3432.m10479().getFilesDir();
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("۬ܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 161) ^ 245643165;
                        i5 = 1243765739;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֡᩶")) * 31;
                        i4 = ((iM2566 ^ i2) * (-19271)) ^ 617744495;
                        i5 = 1728920276;
                    }
                    break;
                case -954760591:
                case 969572833:
                    C2272.m7503();
                    C2272.m7503();
                    return null;
                case -590739576:
                case 614715259:
                    AbstractC2021.m6574();
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("֨۟") ^ i3) * 69;
                        i4 = ((iM2566 ^ i2) * 14735) ^ (-1534133355);
                        i5 = 189155391;
                    } else {
                        iM2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((iM2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    }
                    break;
                case -521874427:
                case 1586836277:
                    if (C0483.f2088 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ܺܶ")) * 69;
                        i4 = ((iM2566 ^ i3) * 21859) ^ (-1448996003);
                        i5 = 508447094;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4179) ^ 1480409079;
                        i5 = 162128539;
                    }
                    break;
                case -513260282:
                case 1922212863:
                    if (C0382.m1848()) {
                        iM2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((iM2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    } else {
                        iM2566 = (C2105.m6981("᩹᩺") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i2) * (-20457)) ^ 2134502074;
                        i5 = 1181447079;
                    }
                    break;
                case -433849534:
                case 83376097:
                    if (C22628.f73083 <= 0) {
                        iM2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((iM2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    } else {
                        iM2566 = (C0630.m2566("ܽᩳ") ^ i2) * 11;
                        i4 = ((iM2566 ^ i3) * 25509) ^ (-710832764);
                        i5 = -1295124282;
                    }
                    break;
                case -331355257:
                case 1247806436:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("۬ܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 161) ^ 245643165;
                        i5 = 1243765739;
                    } else {
                        iM2566 = (C0630.m2566("֫᩹") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * 21881) ^ (-1918950228);
                        i5 = 574783831;
                    }
                    break;
                case 74809533:
                case 1533187344:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C0630.m2566("᩺ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 26723) ^ (-667809149);
                        i5 = 1735012168;
                    } else {
                        iM2566 = (C0630.m2566("ᩳ۫") ^ i3) * 73;
                        i4 = ((iM2566 ^ i2) * (-28925)) ^ (-1054406834);
                        i5 = 186070132;
                    }
                    break;
                case 501942657:
                case 1314476300:
                    File parentFile = filesDir.getParentFile();
                    C2167.m7151(parentFile);
                    return parentFile;
                case 1035634228:
                case 1579105365:
                    if (C2126.f7087) {
                        iM2566 = (C0630.m2566("֨۟") ^ i3) * 69;
                        i4 = ((iM2566 ^ i2) * 14735) ^ (-1534133355);
                        i5 = 189155391;
                    } else {
                        iM2566 = (C0630.m2566("ۚ᩵") ^ i2) * 47;
                        i4 = ((iM2566 ^ i3) * (-11399)) ^ (-441692705);
                        i5 = -1205572055;
                    }
                    break;
                case 1051509122:
                case 2143387842:
                    C0237.m1481();
                    iM2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                    i4 = ((iM2566 ^ i3) * (-4449)) ^ 424548247;
                    i5 = 456043787;
                    break;
                case 1406750882:
                case 1528861390:
                    if (C3746.f11829 > 0) {
                        iM2566 = C0630.m2566("۬ܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 161) ^ 245643165;
                        i5 = 1243765739;
                    } else {
                        iM2566 = (i2 - C2105.m6981("֡ۧ")) * 75;
                        i4 = ((iM2566 ^ i3) * (-4449)) ^ 424548247;
                        i5 = 456043787;
                    }
                    break;
                case 1474697383:
                case 1934397756:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("᩺ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 26723) ^ (-667809149);
                        i5 = 1735012168;
                    } else {
                        iM2566 = C2105.m6981("᩶᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 5539) ^ (-660840610);
                        i5 = 1811903604;
                    }
                    break;
                default:
                    if (Build.VERSION.SDK_INT >= 24) {
                        iM2566 = C0630.m2566("֡֫") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-32255)) ^ (-1792685079);
                        i5 = 285429473;
                    } else {
                        iM2566 = C0630.m2566("᩷۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7055) ^ (-1122021156);
                        i5 = -2062880358;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2 A[PHI: r2 r3 r4
      0x00e2: PHI (r2v3 android.content.ClipData) = (r2v2 android.content.ClipData), (r2v1 android.content.ClipData), (r2v1 android.content.ClipData) binds: [B:31:0x00ca, B:27:0x00a7, B:24:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v1 java.lang.String), (r3v1 java.lang.String) binds: [B:31:0x00ca, B:27:0x00a7, B:24:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r4v2 java.lang.CharSequence) = (r4v1 java.lang.CharSequence), (r4v1 java.lang.CharSequence), (r4v3 java.lang.CharSequence) binds: [B:31:0x00ca, B:27:0x00a7, B:24:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x016a A[PHI: r1 r14 r20
      0x016a: PHI (r1v3 java.lang.Object) = (r1v1 java.lang.Object), (r1v2 java.lang.Object), (r1v1 java.lang.Object), (r1v1 java.lang.Object) binds: [B:47:0x0168, B:43:0x0149, B:12:0x0051, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r14v3 short[]) = (r14v1 short[]), (r14v2 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:47:0x0168, B:43:0x0149, B:12:0x0051, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r20v3 java.lang.String) = (r20v2 java.lang.String), (r20v1 java.lang.String), (r20v1 java.lang.String), (r20v1 java.lang.String) binds: [B:47:0x0168, B:43:0x0149, B:12:0x0051, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0236 A[PHI: r9 r11 r12
      0x0236: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:66:0x0234, B:55:0x01c0, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:66:0x0234, B:55:0x01c0, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:66:0x0234, B:55:0x01c0, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0287 A[PHI: r7
      0x0287: PHI (r7v2 short) = (r7v1 short), (r7v4 short) binds: [B:9:0x0048, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02bb A[PHI: r6 r8 r13 r15 r21
      0x02bb: PHI (r6v3 char) = (r6v2 char), (r6v1 char), (r6v1 char), (r6v1 char), (r6v1 char) binds: [B:76:0x02b9, B:70:0x026d, B:51:0x019e, B:39:0x0127, B:35:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:76:0x02b9, B:70:0x026d, B:51:0x019e, B:39:0x0127, B:35:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:76:0x02b9, B:70:0x026d, B:51:0x019e, B:39:0x0127, B:35:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r15v3 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v2 int), (r15v1 int) binds: [B:76:0x02b9, B:70:0x026d, B:51:0x019e, B:39:0x0127, B:35:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r21v5 short[]) = (r21v4 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]) binds: [B:76:0x02b9, B:70:0x026d, B:51:0x019e, B:39:0x0127, B:35:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String m14330() {
        int iM2566;
        int i;
        int i2;
        Object objM14326 = null;
        ClipData primaryClip = null;
        String str = null;
        CharSequence text = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 180548030;
        int i10 = C0630.f2410;
        int i11 = RunnableC1937.f6483;
        int iM2567 = (C0630.m2566("ۤᩳ") + i10) * (-31);
        int i12 = ((iM2567 ^ i11) * 11957) ^ (-2077070409);
        int i13 = iM2567 ^ (-1244500586);
        short[] sArr3 = null;
        String strM49334 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * (-27233)) >> 31));
            switch (i9) {
                case -2126772224:
                case 64402477:
                    C11233.m27800(objM14326, C5695.m16034(sArr2, i8, 69, i5));
                    if (C0798.m2998() != 0) {
                        iM2566 = (C2105.m6981("ۜ᩺") + i10) * (-33);
                        i = ((iM2566 ^ i11) * 21621) ^ (-1963956592);
                        i2 = -1902326779;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ܶۨ")) * 91;
                        i = ((iM2566 ^ i10) * (-4937)) ^ 1707896637;
                        i2 = 2080591097;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -2084565900:
                case -1887932073:
                    objM14326 = m14326(strM49334);
                    sArr2 = f15520;
                    if (C7811.f24123 >= 0) {
                        iM2566 = (i11 - C0630.m2566("᩺ܺ")) * (-89);
                        i = ((iM2566 ^ i10) * 30505) ^ 1387566421;
                        i2 = -2096176962;
                    } else {
                        iM2566 = C0630.m2566("᩶᩵") ^ i11;
                        i = ((iM2566 ^ i10) * 4457) ^ 1516868501;
                        i2 = 1055683652;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -2032537118:
                case 1245871914:
                    i5 = 53166;
                    iM2566 = C0630.m2566("ۢ֨") ^ i11;
                    i = ((iM2566 ^ i10) * 13113) ^ (-2044070263);
                    i2 = 1063420997;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -2014541824:
                case -1125962698:
                    if (primaryClip.getItemCount() > 0) {
                        iM2566 = (i11 - C2105.m6981("ۗܳ")) * (-31);
                        i = ((iM2566 ^ i10) * 17739) ^ 1811461539;
                        i2 = 1882476099;
                    } else {
                        iM2566 = (i10 - C2105.m6981("۠ۨ")) * (-39);
                        i = ((iM2566 ^ i11) * 8589) ^ (-101155304);
                        i2 = 372183354;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1969841153:
                case -1314416349:
                    sArr3 = f15520;
                    c = 568;
                    if (C4263.m12819() >= 0) {
                        iM2566 = (C2105.m6981("ۜ᩺") + i10) * (-33);
                        i = ((iM2566 ^ i11) * 21621) ^ (-1963956592);
                        i2 = -1902326779;
                    } else {
                        iM2566 = (i11 - C0630.m2566("۫ۡ")) * (-87);
                        i = ((iM2566 ^ i10) * (-24053)) ^ 2020733234;
                        i2 = 713704697;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1818794216:
                case 1532858986:
                    C5695.m16023();
                    RunnableC3474.m10630();
                    return null;
                case -1669079597:
                case 190698052:
                    RunnableC1108.m3790();
                    iM2566 = C2105.m6981("ܽ۠") ^ i11;
                    i = ((iM2566 ^ i10) * (-8517)) ^ (-1419574233);
                    i2 = 41181041;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1610595690:
                case -999498664:
                    i5 = 34481;
                    iM2566 = C0630.m2566("ۢ֨") ^ i11;
                    i = ((iM2566 ^ i10) * 13113) ^ (-2044070263);
                    i2 = 1063420997;
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1481824879:
                case 674699342:
                    primaryClip = ((android.content.ClipboardManager) objM14326).getPrimaryClip();
                    str = null;
                    if (primaryClip != null) {
                        iM2566 = C0630.m2566("᩷֫") ^ i10;
                        i = ((iM2566 ^ i11) * 22025) ^ 844827150;
                        i2 = -580952750;
                    } else {
                        iM2566 = (i10 - C2105.m6981("۠ۨ")) * (-39);
                        i = ((iM2566 ^ i11) * 8589) ^ (-101155304);
                        i2 = 372183354;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1367244695:
                case -717357446:
                    sArr = f15520;
                    i6 = 569;
                    if (C3019.f9544 >= 0) {
                        iM2566 = (i10 - C2105.m6981("֨֫")) * (-51);
                        i = ((iM2566 ^ i11) * 14953) ^ 1299697986;
                        i2 = -440813853;
                    } else {
                        iM2566 = C0630.m2566("᩺᩵") ^ i10;
                        i = ((iM2566 ^ i11) * 6975) ^ (-1346723140);
                        i2 = 425470511;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1358109231:
                case 1226142159:
                    i8 = 578;
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("ۜ᩺") + i10) * (-33);
                        i = ((iM2566 ^ i11) * 21621) ^ (-1963956592);
                        i2 = -1902326779;
                    } else {
                        iM2566 = C2105.m6981("᩷֡") ^ i10;
                        i = ((iM2566 ^ i11) * 28527) ^ 1591476247;
                        i2 = 1499816289;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1047619303:
                case 1858280743:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (i11 - C0630.m2566("᩺ܺ")) * (-89);
                        i = ((iM2566 ^ i10) * 30505) ^ 1387566421;
                        i2 = -2096176962;
                    } else {
                        iM2566 = C2105.m6981("ۜ᩻") ^ i11;
                        i = ((iM2566 ^ i10) * (-31911)) ^ (-1427605420);
                        i2 = 1507694989;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -1041701459:
                case 834900884:
                    strM49334 = C21923.m49334(sArr, i6, i7, i5);
                    if (C3746.f11829 <= 0) {
                        iM2566 = (i11 - C0630.m2566("᩺ܺ")) * (-89);
                        i = ((iM2566 ^ i10) * 30505) ^ 1387566421;
                        i2 = -2096176962;
                    } else {
                        iM2566 = C0630.m2566("ܿܿ") ^ i10;
                        i = ((iM2566 ^ i11) * 343) ^ 1642967479;
                        i2 = -708281871;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -935417416:
                case -556050921:
                    C1504.m5179();
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("ܽ۠") ^ i11;
                        i = ((iM2566 ^ i10) * (-8517)) ^ (-1419574233);
                        i2 = 41181041;
                    } else {
                        iM2566 = (i11 - C0630.m2566("᩺ܺ")) * (-89);
                        i = ((iM2566 ^ i10) * 30505) ^ 1387566421;
                        i2 = -2096176962;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -873879848:
                case 922404269:
                    C4075.m12263();
                    if (C2520.f8000 < 0) {
                        iM2566 = C2105.m6981("ܽ۠") ^ i11;
                        i = ((iM2566 ^ i10) * (-8517)) ^ (-1419574233);
                        i2 = 41181041;
                    } else {
                        iM2566 = (i10 - C2105.m6981("֨֫")) * (-51);
                        i = ((iM2566 ^ i11) * 14953) ^ 1299697986;
                        i2 = -440813853;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -492703783:
                case 1585184909:
                    i4 = s + 17438;
                    if (C1504.f5354) {
                        iM2566 = (i10 - C2105.m6981("֨֫")) * (-51);
                        i = ((iM2566 ^ i11) * 14953) ^ 1299697986;
                        i2 = -440813853;
                    } else {
                        iM2566 = (C2105.m6981("ۨ۠") + i10) * (-13);
                        i = ((iM2566 ^ i11) * 15197) ^ 1480954170;
                        i2 = 1124002155;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case -73668260:
                case 62760304:
                    i3 = s * 69752;
                    if (C4159.f13567) {
                        iM2566 = (C2105.m6981("ۗۜ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i10) * 20849) ^ 68812807;
                        i2 = 406334364;
                    } else {
                        iM2566 = (C2105.m6981("ۜ᩺") + i10) * (-33);
                        i = ((iM2566 ^ i11) * 21621) ^ (-1963956592);
                        i2 = -1902326779;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case 7375608:
                case 956432564:
                    return str;
                case 523899579:
                case 637946289:
                    if (i3 - (i4 * i4) <= 0) {
                        iM2566 = C2105.m6981("᩶۬") ^ i10;
                        i = ((iM2566 ^ i11) * 16023) ^ (-2106724130);
                        i2 = -597023342;
                    } else {
                        iM2566 = (C2105.m6981("ۤ۫") + i11) * (-117);
                        i = ((iM2566 ^ i10) * (-19359)) ^ 789274867;
                        i2 = -1776622525;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case 632735853:
                case 1147376822:
                    text = primaryClip.getItemAt(0).getText();
                    if (text != null) {
                        iM2566 = C2105.m6981("֨ۚ") ^ i10;
                        i = ((iM2566 ^ i11) * 13121) ^ 766503295;
                        i2 = 1794131283;
                    } else {
                        iM2566 = (i10 - C2105.m6981("۠ۨ")) * (-39);
                        i = ((iM2566 ^ i11) * 8589) ^ (-101155304);
                        i2 = 372183354;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                case 809507879:
                case 1578508934:
                    return C0422.m1959(text);
                case 1139771986:
                case 1785244551:
                    i7 = 9;
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C2105.m6981("ۜ᩺") + i10) * (-33);
                        i = ((iM2566 ^ i11) * 21621) ^ (-1963956592);
                        i2 = -1902326779;
                    } else {
                        iM2566 = (i11 - C2105.m6981("᩷ۢ")) * 37;
                        i = ((iM2566 ^ i10) * 19383) ^ (-1753690526);
                        i2 = 615791791;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
                default:
                    s = sArr3[c];
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("ۜ᩻") ^ i11;
                        i = ((iM2566 ^ i10) * (-31911)) ^ (-1427605420);
                        i2 = 1507694989;
                    } else {
                        iM2566 = C0630.m2566("֫۬") ^ i10;
                        i = ((iM2566 ^ i11) * 29357) ^ 1633627813;
                        i2 = -1590972229;
                    }
                    i13 = iM2566 ^ i2;
                    i12 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007f A[PHI: r12
      0x007f: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:22:0x007d, B:15:0x0063, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0179 A[PHI: r7 r8 r9 r16
      0x0179: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:45:0x0177, B:41:0x0157, B:9:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0179: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:45:0x0177, B:41:0x0157, B:9:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0179: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:45:0x0177, B:41:0x0157, B:9:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0179: PHI (r16v21 java.io.File) = (r16v9 java.io.File), (r16v10 java.io.File), (r16v22 java.io.File) binds: [B:45:0x0177, B:41:0x0157, B:9:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01cf A[PHI: r4 r5 r16
      0x01cf: PHI (r4v4 short) = (r4v3 short), (r4v2 short) binds: [B:57:0x01f0, B:53:0x01cd] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:57:0x01f0, B:53:0x01cd] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r16v5 java.io.File) = (r16v4 java.io.File), (r16v6 java.io.File) binds: [B:57:0x01f0, B:53:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f3 A[PHI: r1 r4 r5
      0x01f3: PHI (r1v58 java.io.File) = (r1v12 java.io.File), (r1v37 java.io.File), (r1v2 java.io.File), (r1v2 java.io.File), (r1v2 java.io.File) binds: [B:54:0x01cf, B:30:0x00dd, B:15:0x0063, B:11:0x0059, B:5:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r4v6 short) = (r4v4 short), (r4v2 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:54:0x01cf, B:30:0x00dd, B:15:0x0063, B:11:0x0059, B:5:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x01f3: PHI (r5v6 int) = (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:54:0x01cf, B:30:0x00dd, B:15:0x0063, B:11:0x0059, B:5:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0227 A[PHI: r6 r16
      0x0227: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:62:0x0225, B:49:0x01ae] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r16v7 java.io.File) = (r16v3 java.io.File), (r16v8 java.io.File) binds: [B:62:0x0225, B:49:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025e A[PHI: r2 r3 r11 r16
      0x025e: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:66:0x025c, B:26:0x00b7, B:13:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:66:0x025c, B:26:0x00b7, B:13:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:66:0x025c, B:26:0x00b7, B:13:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r16v18 java.io.File) = (r16v2 java.io.File), (r16v16 java.io.File), (r16v19 java.io.File) binds: [B:66:0x025c, B:26:0x00b7, B:13:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final File m14332() {
        int iM6981;
        int i;
        int i2;
        int i3 = C3683.f11629;
        int i4 = C4616.f14690;
        int iM2566 = C0630.m2566("ۘۖ") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-17593)) ^ (-656150358);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2566 ^ (-1681093575);
        File cacheDir = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1237949170;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-22977)) >> 31));
            switch (i13) {
                case -2011396568:
                case -1116239865:
                    cacheDir = cacheDir;
                    sArr = f15520;
                    c = 647;
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ۙۗ") ^ i3;
                        i = ((iM6981 ^ i4) * (-29655)) ^ (-1152534697);
                        i2 = -1669017006;
                    } else {
                        iM6981 = (C2105.m6981("ᩳܺ") + i4) * (-85);
                        i = ((iM6981 ^ i3) * (-9577)) ^ (-153603576);
                        i2 = 1335736320;
                    }
                    File file = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file;
                    break;
                case -1975162893:
                case -458738811:
                    C1005.m3501();
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ܿۤ") ^ i3;
                        cacheDir = cacheDir;
                        i = ((iM6981 ^ i4) * 3269) ^ 1029119452;
                        i2 = 1527545564;
                    } else {
                        cacheDir = cacheDir;
                        iM6981 = C0630.m2566("ۙۗ") ^ i3;
                        i = ((iM6981 ^ i4) * (-29655)) ^ (-1152534697);
                        i2 = -1669017006;
                    }
                    File file2 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file2;
                    break;
                case -1914783730:
                case -307543705:
                    i11 = 51661;
                    iM6981 = C0630.m2566("֨ۤ") ^ i4;
                    i = ((iM6981 ^ i3) * (-22325)) ^ (-1645709764);
                    i2 = 1434221327;
                    File file3 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file3;
                    break;
                case -1913228287:
                case 1765462182:
                    cacheDir = cacheDir;
                    i9 = i8 + i8;
                    s2 = 14483;
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("۬᩺") ^ i3;
                        i = ((iM6981 ^ i4) * 11545) ^ 1394752541;
                        i2 = 271516518;
                    } else {
                        iM6981 = (C0630.m2566("᩻ܶ") ^ i3) * (-103);
                        i = ((iM6981 ^ i4) * 8769) ^ (-2137932106);
                        i2 = 794607698;
                    }
                    File file4 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file4;
                    break;
                case -1454876364:
                case -575693996:
                    i12 = 648;
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("ܰᩴ") ^ i4;
                        cacheDir = cacheDir;
                        i = ((iM6981 ^ i3) * (-21367)) ^ (-681591955);
                        i2 = -1144451171;
                    } else {
                        cacheDir = cacheDir;
                        iM6981 = (C2105.m6981("۠ۜ") + i4) * (-95);
                        i = ((iM6981 ^ i3) * (-12241)) ^ 1666084196;
                        i2 = -936523668;
                    }
                    File file5 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file5;
                    break;
                case -1349822284:
                case 911178784:
                    C22628.m50615();
                    C2167.m7155();
                    return null;
                case -1323232684:
                case 105588388:
                    cacheDir = cacheDir;
                    i10 = s + s2;
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("۬᩺") ^ i3;
                        i = ((iM6981 ^ i4) * 11545) ^ 1394752541;
                        i2 = 271516518;
                    } else {
                        iM6981 = C0630.m2566("ۧۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 28959) ^ (-1385276952);
                        i2 = 739353348;
                    }
                    File file6 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file6;
                    break;
                case -1156488309:
                case -511694867:
                    cacheDir = cacheDir;
                    sArr2 = f15520;
                    if (C4616.m13552() != 0) {
                        iM6981 = C0630.m2566("ۙۗ") ^ i3;
                        i = ((iM6981 ^ i4) * (-29655)) ^ (-1152534697);
                        i2 = -1669017006;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۫֡")) * (-7);
                        i = ((iM6981 ^ i4) * 29205) ^ (-304726229);
                        i2 = -1914688437;
                    }
                    File file7 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file7;
                    break;
                case -1017959834:
                case 1396744677:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ܰᩴ") ^ i4;
                        cacheDir = cacheDir;
                        i = ((iM6981 ^ i3) * (-21367)) ^ (-681591955);
                        i2 = -1144451171;
                    } else {
                        cacheDir = cacheDir;
                        iM6981 = C0630.m2566("۬᩺") ^ i3;
                        i = ((iM6981 ^ i4) * 11545) ^ 1394752541;
                        i2 = 271516518;
                    }
                    File file8 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file8;
                    break;
                case -780555310:
                case 219585855:
                    cacheDir = cacheDir;
                    i7 = s * s;
                    if (AbstractC2021.f6743 <= 0) {
                        cacheDir = cacheDir;
                        iM6981 = C0630.m2566("ܿۤ") ^ i3;
                        cacheDir = cacheDir;
                        i = ((iM6981 ^ i4) * 3269) ^ 1029119452;
                        i2 = 1527545564;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩺ۙ")) * 37;
                        i = ((iM6981 ^ i4) * 24787) ^ 583997815;
                        i2 = 666836826;
                    }
                    File file9 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file9;
                    break;
                case -661209550:
                case 841201424:
                    cacheDir = cacheDir;
                    if ((i10 * i10) - i9 <= 0) {
                        iM6981 = C0630.m2566("ۧۗ") ^ i4;
                        i = ((iM6981 ^ i3) * 10601) ^ (-1774575956);
                        i2 = -1419396578;
                    } else {
                        iM6981 = C0630.m2566("ۨᩴ") ^ i3;
                        i = ((iM6981 ^ i4) * 4265) ^ 818260071;
                        i2 = 312075651;
                    }
                    File file10 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file10;
                    break;
                case -434187038:
                case 1341078988:
                    i11 = 57430;
                    iM6981 = C0630.m2566("֨ۤ") ^ i4;
                    i = ((iM6981 ^ i3) * (-22325)) ^ (-1645709764);
                    i2 = 1434221327;
                    File file11 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file11;
                    break;
                case -241553443:
                case 1745078433:
                    if (C2520.f8000 < 0) {
                        iM6981 = C0630.m2566("ܿۤ") ^ i3;
                        cacheDir = cacheDir;
                        i = ((iM6981 ^ i4) * 3269) ^ 1029119452;
                        i2 = 1527545564;
                    } else {
                        iM6981 = C2105.m6981("ܰᩴ") ^ i4;
                        cacheDir = cacheDir;
                        i = ((iM6981 ^ i3) * (-21367)) ^ (-681591955);
                        i2 = -1144451171;
                    }
                    File file12 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file12;
                    break;
                case -239802870:
                case -213037819:
                    cacheDir = cacheDir;
                    s = sArr[c];
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        cacheDir = cacheDir;
                        iM6981 = C0630.m2566("ܿۤ") ^ i3;
                        cacheDir = cacheDir;
                        i = ((iM6981 ^ i4) * 3269) ^ 1029119452;
                        i2 = 1527545564;
                    } else {
                        iM6981 = (i4 - C0630.m2566("֡ۖ")) * (-25);
                        i = ((iM6981 ^ i3) * (-24065)) ^ (-615990195);
                        i2 = -423534753;
                    }
                    File file13 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file13;
                    break;
                case 506983205:
                case 1829887565:
                    cacheDir = cacheDir;
                    if (C0714.f2697 >= 0) {
                        iM6981 = (C2105.m6981("ۗ۟") ^ i4) * (-27);
                        i = ((iM6981 ^ i3) * (-2127)) ^ (-403427050);
                        i2 = -1190777299;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܶ᩶")) * (-43);
                        i = ((iM6981 ^ i4) * 11811) ^ (-2119792900);
                        i2 = 504440372;
                    }
                    File file14 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file14;
                    break;
                case 903044532:
                case 1942426611:
                    cacheDir = C0382.m1842().getCacheDir();
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("ܿۤ") ^ i3;
                        cacheDir = cacheDir;
                        i = ((iM6981 ^ i4) * 3269) ^ 1029119452;
                        i2 = 1527545564;
                    } else {
                        iM6981 = (C2105.m6981("᩺ܿ") ^ i4) * (-77);
                        cacheDir = cacheDir;
                        i = ((iM6981 ^ i3) * (-28183)) ^ 372571076;
                        i2 = -1142690478;
                    }
                    File file15 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file15;
                    break;
                case 984280089:
                case 1889039900:
                    cacheDir = cacheDir;
                    i8 = i7 + 209757289;
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C2105.m6981("ۗ۟") ^ i4) * (-27);
                        i = ((iM6981 ^ i3) * (-2127)) ^ (-403427050);
                        i2 = -1190777299;
                    } else {
                        iM6981 = C2105.m6981("۬ܺ") ^ i4;
                        i = ((iM6981 ^ i3) * (-16447)) ^ (-157290876);
                        i2 = -1420986609;
                    }
                    File file16 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file16;
                    break;
                case 1193828459:
                case 1474002000:
                    C4159.m12575(cacheDir, C2105.m6988(sArr2, i12, 16, i11));
                    return cacheDir;
                default:
                    C1773.m5908();
                    C1420.m4913();
                    iM6981 = C0630.m2566("ܿۤ") ^ i3;
                    cacheDir = cacheDir;
                    i = ((iM6981 ^ i4) * 3269) ^ 1029119452;
                    i2 = 1527545564;
                    File file17 = cacheDir;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    cacheDir = file17;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x013a A[PHI: r2 r7 r8
      0x013a: PHI (r2v6 java.lang.Object) = (r2v3 java.lang.Object), (r2v2 java.lang.Object) binds: [B:35:0x0138, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r7v6 short[]) = (r7v3 short[]), (r7v2 short[]) binds: [B:35:0x0138, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r8v6 int) = (r8v3 int), (r8v2 int) binds: [B:35:0x0138, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0193 A[PHI: r5 r6 r15
      0x0193: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:90:0x0193, B:89:0x0193, B:43:0x0191, B:20:0x0092, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:90:0x0193, B:89:0x0193, B:43:0x0191, B:20:0x0092, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:90:0x0193, B:89:0x0193, B:43:0x0191, B:20:0x0092, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0306 A[PHI: r12 r13 r14 r16 r17 r23
      0x0306: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:72:0x02ee, B:52:0x01f7, B:16:0x0088, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:72:0x02ee, B:52:0x01f7, B:16:0x0088, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:72:0x02ee, B:52:0x01f7, B:16:0x0088, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v5 short[]) binds: [B:72:0x02ee, B:52:0x01f7, B:16:0x0088, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:72:0x02ee, B:52:0x01f7, B:16:0x0088, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r23v19 java.lang.String) = (r23v7 java.lang.String), (r23v16 java.lang.String), (r23v17 java.lang.String), (r23v22 java.lang.String) binds: [B:72:0x02ee, B:52:0x01f7, B:16:0x0088, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14317(String str, String str2) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5 = C4117.f13076;
        int i6 = C1128.f4106;
        int iM2568 = (C0630.m2566("᩺᩹") + i6) * (-77);
        int i7 = ((iM2568 ^ i5) * (-6037)) ^ 125949523;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i8 = iM2568 ^ (-2141274831);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s = 0;
        int i16 = 0;
        int i17 = -2011157964;
        int i18 = 0;
        String strM3502 = null;
        ClipboardManager clipboardManager = null;
        Object objM7509 = null;
        String strM9031 = null;
        while (true) {
            i17 = i8 ^ (i7 & (((i17 ^ i5) * (-30733)) >> 31));
            switch (i17) {
                case -2047655550:
                case -1093941571:
                    C11233.m27800(objM7509, C2958.m9031(sArr4, i11, 66, i13));
                    clipboardManager = (ClipboardManager) objM7509;
                    iM2566 = C0630.m2566("ܽ۬") ^ i5;
                    i = ((iM2566 ^ i6) * (-28663)) ^ 902627003;
                    i2 = -790558039;
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -2044168383:
                case -659569958:
                    try {
                        clipboardManager.setText(str);
                        RunnableC0588.m2440(str2);
                        int iM2569 = C0630.m2566("᩻ܶ") ^ i6;
                        i7 = ((iM2569 ^ i5) * 3073) ^ 1229518365;
                        i8 = iM2569 ^ 640412792;
                    } catch (Throwable unused) {
                        iM2566 = (C2105.m6981("ۡ۠") + i6) * 51;
                        i = ((iM2566 ^ i5) * 833) ^ 1118067124;
                        i2 = -646187186;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1979927560:
                case -789077079:
                    C3683.m11210(str2, C0964.m3396(sArr2, i14, i15, i13));
                    if (C0382.f1805) {
                        iM2567 = (C0630.m2566("۠᩻") ^ i6) * (-79);
                        strM9031 = strM9031;
                        i3 = ((iM2567 ^ i5) * 8585) ^ (-1570666588);
                        i4 = 1703435372;
                    } else {
                        strM9031 = strM9031;
                        iM2567 = (i6 - C2105.m6981("ܿ۠")) * (-25);
                        i3 = ((iM2567 ^ i5) * (-15555)) ^ (-690083305);
                        i4 = 1726257562;
                    }
                    String str3 = strM9031;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    strM9031 = str3;
                    break;
                case -1823920685:
                case 1423100456:
                    strM9031 = C2958.m9031(sArr3, i9, i10, i13);
                    if (C0630.f2410 > 0) {
                        iM2566 = (C0630.m2566("᩺۫") + i5) * (-99);
                        i = ((iM2566 ^ i6) * (-13785)) ^ (-1124264220);
                        i2 = 966899253;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    } else {
                        iM2567 = C2105.m6981("ۗܳ") ^ i5;
                        strM9031 = strM9031;
                        i3 = ((iM2567 ^ i6) * 7623) ^ 186323534;
                        i4 = -193228175;
                        String str4 = strM9031;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        strM9031 = str4;
                    }
                    break;
                case -1784404657:
                case -682776156:
                    strM9031 = strM9031;
                    c = 273;
                    if (C1711.f5919) {
                        iM2567 = (i6 - C2105.m6981("ܿ۠")) * (-25);
                        i3 = ((iM2567 ^ i5) * (-15555)) ^ (-690083305);
                        i4 = 1726257562;
                    } else {
                        iM2567 = C0630.m2566("ۖ᩷") ^ i5;
                        i3 = ((iM2567 ^ i6) * 23827) ^ 765579856;
                        i4 = 1526916354;
                    }
                    String str5 = strM9031;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    strM9031 = str5;
                    break;
                case -1565338646:
                case -1499410399:
                    C3911.m11924();
                    if (!RunnableC1108.m3790()) {
                        iM2566 = (C0630.m2566("۫֡") ^ i5) * (-101);
                        i = ((iM2566 ^ i6) * 4969) ^ 1796662475;
                        i2 = -206560976;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    } else {
                        strM9031 = strM9031;
                        iM2567 = C2105.m6981("֨ۡ") ^ i5;
                        i3 = ((iM2567 ^ i6) * (-17369)) ^ (-185353144);
                        i4 = 1476755271;
                        String str6 = strM9031;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        strM9031 = str6;
                    }
                    break;
                case -1465709876:
                case 43612546:
                    C1504.m5167(C0630.m2566(strM3502) ^ 2098927522);
                    break;
                case -1445012359:
                case -1150994656:
                    strM9031 = strM9031;
                    sArr2 = f15520;
                    i14 = 274;
                    i15 = 3;
                    if (C0714.f2697 >= 0) {
                        iM2567 = (i6 - C2105.m6981("ܿ۠")) * (-25);
                        i3 = ((iM2567 ^ i5) * (-15555)) ^ (-690083305);
                        i4 = 1726257562;
                    } else {
                        iM2567 = C2105.m6981("ۡۧ") ^ i5;
                        i3 = ((iM2567 ^ i6) * (-26607)) ^ (-1181696632);
                        i4 = -2042698456;
                    }
                    String str7 = strM9031;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    strM9031 = str7;
                    break;
                case -1301168450:
                case 744702465:
                    strM9031 = strM9031;
                    if ((i12 + 1) - i18 <= 0) {
                        iM2567 = (C0630.m2566("۟ܶ") + i5) * 5;
                        i3 = ((iM2567 ^ i6) * (-18681)) ^ (-1279014776);
                        i4 = 1865455804;
                    } else {
                        iM2567 = C2105.m6981("ۢۜ") ^ i6;
                        i3 = ((iM2567 ^ i5) * 28917) ^ (-1693332236);
                        i4 = 2089979671;
                    }
                    String str8 = strM9031;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    strM9031 = str8;
                    break;
                case -1168600967:
                case 1466478029:
                    objM7509 = C2272.m7509(C3432.m10479(), strM9031);
                    sArr4 = f15520;
                    i11 = 286;
                    if (C3245.m9925() != 0) {
                        iM2566 = (i6 - C0630.m2566("᩻ۢ")) * (-41);
                        i = ((iM2566 ^ i5) * (-30739)) ^ 922812796;
                        i2 = -680947083;
                    } else {
                        iM2566 = C0630.m2566("᩺᩻") ^ i6;
                        i = ((iM2566 ^ i5) * 5795) ^ (-385400715);
                        i2 = -1921775349;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -869681841:
                case 997462543:
                    sArr3 = f15520;
                    i9 = 277;
                    i10 = 9;
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("᩺ۤ") ^ i5;
                        i = ((iM2566 ^ i6) * 10255) ^ 389114480;
                        i2 = 35154725;
                    } else {
                        iM2566 = (C0630.m2566("۫֡") ^ i5) * (-101);
                        i = ((iM2566 ^ i6) * 4969) ^ 1796662475;
                        i2 = -206560976;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -677987642:
                case -383235343:
                    strM9031 = strM9031;
                    i18 = i16 * i16;
                    i12 = s * 2;
                    if (C0382.f1805) {
                        iM2567 = (C2105.m6981("ۧ֨") + i5) * 123;
                        i3 = ((iM2567 ^ i6) * 20457) ^ (-1650786449);
                        i4 = -1624926567;
                    } else {
                        iM2567 = C2105.m6981("֨ۡ") ^ i5;
                        i3 = ((iM2567 ^ i6) * (-17369)) ^ (-185353144);
                        i4 = 1476755271;
                    }
                    String str9 = strM9031;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    strM9031 = str9;
                    break;
                case -557528342:
                case 1689209648:
                    i13 = 3595;
                    iM2567 = (C2105.m6981("ۡ᩸") ^ i6) * (-93);
                    i3 = ((iM2567 ^ i5) * 32395) ^ 2142336103;
                    i4 = 1557315325;
                    String str10 = strM9031;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    strM9031 = str10;
                    break;
                case -477942200:
                case 1947620581:
                    i13 = 25133;
                    iM2567 = (C2105.m6981("ۡ᩸") ^ i6) * (-93);
                    i3 = ((iM2567 ^ i5) * 32395) ^ 2142336103;
                    i4 = 1557315325;
                    String str11 = strM9031;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    strM9031 = str11;
                    break;
                case 48358302:
                case 231444932:
                    strM9031 = strM9031;
                    s = sArr[c];
                    i16 = s + 1;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        strM9031 = strM9031;
                        iM2567 = C2105.m6981("ۗܳ") ^ i5;
                        strM9031 = strM9031;
                        i3 = ((iM2567 ^ i6) * 7623) ^ 186323534;
                        i4 = -193228175;
                    } else {
                        iM2567 = C0630.m2566("֨ۙ") ^ i6;
                        i3 = ((iM2567 ^ i5) * (-31535)) ^ (-1522520183);
                        i4 = -508757240;
                    }
                    String str12 = strM9031;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    strM9031 = str12;
                    break;
                case 172983773:
                case 1795330123:
                    strM3502 = C1005.m3502(f15520, 352, 3, i13);
                    if (!C0964.m3413()) {
                        iM2567 = C2105.m6981("ۗܳ") ^ i5;
                        strM9031 = strM9031;
                        i3 = ((iM2567 ^ i6) * 7623) ^ 186323534;
                        i4 = -193228175;
                        String str13 = strM9031;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        strM9031 = str13;
                    } else {
                        iM2566 = C0630.m2566("ۖܽ") ^ i5;
                        i = ((iM2566 ^ i6) * (-26799)) ^ (-1901738106);
                        i2 = 1414543362;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    }
                    break;
                case 248271833:
                case 604056971:
                    C0964.m3413();
                    if (C4616.f14690 > 0) {
                        strM9031 = strM9031;
                        iM2567 = (i6 - C2105.m6981("ܿ۠")) * (-25);
                        i3 = ((iM2567 ^ i5) * (-15555)) ^ (-690083305);
                        i4 = 1726257562;
                        String str14 = strM9031;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        strM9031 = str14;
                    } else {
                        iM2566 = (C0630.m2566("۫֡") ^ i5) * (-101);
                        i = ((iM2566 ^ i6) * 4969) ^ 1796662475;
                        i2 = -206560976;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    }
                    break;
                case 383357131:
                case 824655131:
                    C4263.m12819();
                    break;
                case 783079339:
                case 1778659522:
                    break;
                case 1192144578:
                case 1305821323:
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C0630.m2566("۫֡") ^ i5) * (-101);
                        i = ((iM2566 ^ i6) * 4969) ^ 1796662475;
                        i2 = -206560976;
                    } else {
                        iM2566 = (i6 - C0630.m2566("᩻ۢ")) * (-41);
                        i = ((iM2566 ^ i5) * (-30739)) ^ 922812796;
                        i2 = -680947083;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case 1414876270:
                case 1949745570:
                    C3245.m9925();
                    iM2566 = (C0630.m2566("۫֡") ^ i5) * (-101);
                    i = ((iM2566 ^ i6) * 4969) ^ 1796662475;
                    i2 = -206560976;
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                default:
                    strM9031 = strM9031;
                    sArr = f15520;
                    if (C3019.m9255() <= 0) {
                        iM2567 = (i6 - C2105.m6981("ܿ۠")) * (-25);
                        i3 = ((iM2567 ^ i5) * (-15555)) ^ (-690083305);
                        i4 = 1726257562;
                    } else {
                        iM2567 = C0630.m2566("ۚۙ") ^ i6;
                        i3 = ((iM2567 ^ i5) * 11329) ^ 2069698235;
                        i4 = -540445357;
                    }
                    String str15 = strM9031;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    strM9031 = str15;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ApplicationInfo m14303() {
        ApplicationInfo applicationInfo = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -760440059;
        int i6 = C2167.f7158;
        int i7 = C0630.f2410;
        int iM2566 = (C0630.m2566("ܽۚ") ^ i6) * 101;
        int i8 = ((iM2566 ^ i7) * (-27893)) ^ (-636463149);
        int i9 = 59543065;
        while (true) {
            i5 = ((((i5 ^ i7) * (-12235)) >> 31) & i8) ^ (iM2566 ^ i9);
            switch (i5) {
                case -1893550709:
                case 745390788:
                    i = s + 5378;
                    if (C7106.f21815 != 0) {
                        iM2566 = (C2105.m6981("᩷᩸") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM2566 ^ i7) * (-9317)) ^ 1965290645;
                        i9 = 392314158;
                    } else {
                        iM2566 = (C2105.m6981("ܳ᩵") + i6) * (-93);
                        i8 = ((iM2566 ^ i7) * 22231) ^ 1575905073;
                        i9 = -1253004960;
                    }
                    break;
                case -1688520570:
                case 1929619208:
                    C2958.m9034();
                    return null;
                case -1639302653:
                case 1978081186:
                    i4 = 82;
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("᩵ۗ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 7453) ^ 399132485;
                        i9 = 786396080;
                    } else {
                        iM2566 = (C2105.m6981("᩶ᩴ") ^ i7) * (-117);
                        i8 = ((iM2566 ^ i6) * 28759) ^ (-1549213909);
                        i9 = -1164025651;
                    }
                    break;
                case -1609570184:
                case -884515696:
                    C3746.m11369();
                    iM2566 = (C2105.m6981("ۢۘ") ^ i6) * 41;
                    i8 = ((iM2566 ^ i7) * (-4227)) ^ 92562672;
                    i9 = 1435101718;
                    break;
                case -1413151958:
                case 271376709:
                    if (C4616.f14690 <= 0) {
                        iM2566 = (i7 - C2105.m6981("᩸ܳ")) * 67;
                        i8 = ((iM2566 ^ i6) * (-30849)) ^ 914145454;
                        i9 = -1937945732;
                    } else {
                        iM2566 = C0630.m2566("ܿ֨") ^ i6;
                        i8 = ((iM2566 ^ i7) * 11323) ^ 69243851;
                        i9 = -2147222499;
                    }
                    break;
                case -1131098178:
                case 1833774790:
                    sArr = f15520;
                    c = 'Q';
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("᩵ۗ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 7453) ^ 399132485;
                        i9 = 786396080;
                    } else {
                        iM2566 = C2105.m6981("᩹֨") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-1215)) ^ (-1181459584);
                        i9 = -243870173;
                    }
                    break;
                case -1100689608:
                case 534090811:
                    i2 = i * i;
                    s2 = 21512;
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("᩷᩸") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM2566 ^ i7) * (-9317)) ^ 1965290645;
                        i9 = 392314158;
                    } else {
                        iM2566 = (C0630.m2566("ۘ᩶") ^ i6) * 31;
                        i8 = ((iM2566 ^ i7) * (-22593)) ^ 1220888124;
                        i9 = -2080191914;
                    }
                    break;
                case -1044753405:
                case 1396853599:
                    if (!C1504.f5354) {
                        iM2566 = (C2105.m6981("ۢۘ") ^ i6) * 41;
                        i8 = ((iM2566 ^ i7) * (-4227)) ^ 92562672;
                        i9 = 1435101718;
                    } else {
                        iM2566 = (i7 - C2105.m6981("᩸ܳ")) * 67;
                        i8 = ((iM2566 ^ i6) * (-30849)) ^ 914145454;
                        i9 = -1937945732;
                    }
                    break;
                case -713605602:
                case -602592944:
                    if (i2 - (s * s2) < 0) {
                        iM2566 = C2105.m6981("֨ۖ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 27963) ^ (-1272613667);
                        i9 = -1348909035;
                    } else {
                        iM2566 = (C0630.m2566("ܽ۬") ^ i7) * 59;
                        i8 = ((iM2566 ^ i6) * 17455) ^ (-1563322887);
                        i9 = -1817825290;
                    }
                    break;
                case -630407323:
                case -209617500:
                    if (C7106.f21815 != 0) {
                        iM2566 = (i7 - C2105.m6981("᩸ܳ")) * 67;
                        i8 = ((iM2566 ^ i6) * (-30849)) ^ 914145454;
                        i9 = -1937945732;
                    } else {
                        iM2566 = C0630.m2566("۟ۚ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 28379) ^ (-2073598519);
                        i9 = -1520734926;
                    }
                    break;
                case -541698804:
                case 829987173:
                    C2126.m7031(applicationInfo, C2126.m7036(sArr2, i4, 23, i3));
                    return applicationInfo;
                case -293677686:
                case 923317789:
                    if (C3683.f11629 < 0) {
                        iM2566 = C0630.m2566("᩵ۗ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 7453) ^ 399132485;
                        i9 = 786396080;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ᩳ֡")) * 3;
                        i8 = ((iM2566 ^ i6) * (-14787)) ^ 635413694;
                        i9 = -615613000;
                    }
                    break;
                case -141900652:
                case 197041867:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = (i7 - C2105.m6981("ᩳ֡")) * 3;
                        i8 = ((iM2566 ^ i6) * (-14787)) ^ 635413694;
                        i9 = -615613000;
                    } else {
                        iM2566 = (C2105.m6981("ۢۘ") ^ i6) * 41;
                        i8 = ((iM2566 ^ i7) * (-4227)) ^ 92562672;
                        i9 = 1435101718;
                    }
                    break;
                case 1421620902:
                case 2083583997:
                    sArr2 = f15520;
                    if (C2105.f7037 != 0) {
                        iM2566 = (C2105.m6981("᩷᩸") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM2566 ^ i7) * (-9317)) ^ 1965290645;
                        i9 = 392314158;
                    } else {
                        iM2566 = C2105.m6981("ܺ᩵") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-25411)) ^ (-1495443122);
                        i9 = 1193036894;
                    }
                    break;
                case 1484175818:
                case 1498781298:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i7 - C2105.m6981("᩸ܳ")) * 67;
                        i8 = ((iM2566 ^ i6) * (-30849)) ^ 914145454;
                        i9 = -1937945732;
                    } else {
                        iM2566 = C2105.m6981("ᩳ֫") ^ i7;
                        i8 = ((iM2566 ^ i6) * 20213) ^ 903503257;
                        i9 = -1456297094;
                    }
                    break;
                case 1844402234:
                case 1993306653:
                    i3 = 64593;
                    iM2566 = C0630.m2566("֡ۧ") ^ i7;
                    i8 = ((iM2566 ^ i6) * 24465) ^ 1355136733;
                    i9 = 772449718;
                    break;
                case 1958412182:
                case 2069115437:
                    applicationInfo = C3432.m10479().getApplicationInfo();
                    if (C1504.f5354) {
                        iM2566 = (C2105.m6981("᩷᩸") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM2566 ^ i7) * (-9317)) ^ 1965290645;
                        i9 = 392314158;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۚ") ^ i7) * 87;
                        i8 = ((iM2566 ^ i6) * (-32401)) ^ 1755084324;
                        i9 = -1355974358;
                    }
                    break;
                case 1966601701:
                case 2140702631:
                    i3 = 7587;
                    iM2566 = C0630.m2566("֡ۧ") ^ i7;
                    i8 = ((iM2566 ^ i6) * 24465) ^ 1355136733;
                    i9 = 772449718;
                    break;
                default:
                    s = sArr[c];
                    if (C4075.f12947 >= 0) {
                        iM2566 = (i7 - C2105.m6981("ᩳ֡")) * 3;
                        i8 = ((iM2566 ^ i6) * (-14787)) ^ 635413694;
                        i9 = -615613000;
                    } else {
                        iM2566 = C0630.m2566("ۛۧ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-13239)) ^ 472349731;
                        i9 = -711818847;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String m14337() {
        String packageName = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 1540387515;
        int i7 = C1047.f3863;
        int i8 = RunnableC3474.f10992;
        int iM2566 = C0630.m2566("ܰ᩸") ^ i8;
        int i9 = ((iM2566 ^ i7) * 1169) ^ 1484037241;
        int i10 = -675617376;
        while (true) {
            i6 = ((((i6 ^ i7) * 31451) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -1925131844:
                case -847834076:
                    i = s * s;
                    i2 = 128029225;
                    if (C0964.m3413()) {
                        iM2566 = C0630.m2566("ۙۡ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-11367)) ^ 1457340754;
                        i10 = -896008774;
                    } else {
                        iM2566 = C0630.m2566("ۧۗ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 21157) ^ (-541526932);
                        i10 = 1832301890;
                    }
                    break;
                case -1920388463:
                case 1316847657:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C0630.m2566("֡۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-16165)) ^ 751467723;
                        i10 = 353752266;
                    } else {
                        iM2566 = (i7 - C0630.m2566("᩻᩶")) * (-87);
                        i9 = ((iM2566 ^ i8) * 30221) ^ (-770601648);
                        i10 = -1733979626;
                    }
                    break;
                case -1814365752:
                case -455014668:
                    C4075.m12263();
                    if (C1047.f3863 < 0) {
                        iM2566 = (C2105.m6981("ۛ᩸") ^ i8) * 21;
                        i9 = ((iM2566 ^ i7) * 3509) ^ 1532765547;
                        i10 = -871512410;
                    } else {
                        iM2566 = C0630.m2566("֡۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-16165)) ^ 751467723;
                        i10 = 353752266;
                    }
                    break;
                case -1737661239:
                case 1967201240:
                    C5695.m16023();
                    return null;
                case -1656620273:
                case 1978905384:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C2105.m6981("ۛ᩸") ^ i8) * 21;
                        i9 = ((iM2566 ^ i7) * 3509) ^ 1532765547;
                        i10 = -871512410;
                    } else {
                        iM2566 = C0630.m2566("ۤ᩵") ^ i8;
                        i9 = ((iM2566 ^ i7) * 24985) ^ (-633069424);
                        i10 = -1460173814;
                    }
                    break;
                case -1526788443:
                case 1206854651:
                    i3 = i + i2;
                    s2 = 22630;
                    if (C2272.f7362) {
                        iM2566 = C0630.m2566("ۧۗ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 21157) ^ (-541526932);
                        i10 = 1832301890;
                    } else {
                        iM2566 = (C0630.m2566("᩺᩹") + i7) * (-73);
                        i9 = ((iM2566 ^ i8) * (-11103)) ^ (-673375598);
                        i10 = -1252968149;
                    }
                    break;
                case -1448080016:
                case -1236217531:
                    sArr = f15520;
                    c = 709;
                    if (C0382.f1805) {
                        iM2566 = C0630.m2566("᩺ܳ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 15085) ^ (-1987397223);
                        i10 = 1580409827;
                    } else {
                        iM2566 = C0630.m2566("ۛ۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-8833)) ^ (-1482863879);
                        i10 = -1982839391;
                    }
                    break;
                case -1403557164:
                case 83883043:
                    i5 = 710;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C2105.m6981("ۛ᩸") ^ i8) * 21;
                        i9 = ((iM2566 ^ i7) * 3509) ^ 1532765547;
                        i10 = -871512410;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ۨۘ")) * (-53);
                        i9 = ((iM2566 ^ i7) * 7015) ^ (-979912413);
                        i10 = 1147485608;
                    }
                    break;
                case -1180519600:
                case -1002888394:
                    C4616.m13552();
                    iM2566 = C0630.m2566("֡۫") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-16165)) ^ 751467723;
                    i10 = 353752266;
                    break;
                case -995690124:
                case 310764851:
                    if ((s * s2) - i3 <= 0) {
                        iM2566 = (i8 - C0630.m2566("ᩳۜ")) * (-113);
                        i9 = ((iM2566 ^ i7) * (-3041)) ^ (-633336906);
                        i10 = -727932258;
                    } else {
                        iM2566 = C0630.m2566("۟ܰ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-5195)) ^ 1726155477;
                        i10 = 2049608621;
                    }
                    break;
                case -920798794:
                case -642435733:
                    s = sArr[c];
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("ۛ۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-8833)) ^ (-1482863879);
                        i10 = -1982839391;
                    } else {
                        iM2566 = C2105.m6981("ۗ᩸") ^ i8;
                        i9 = ((iM2566 ^ i7) * 13219) ^ (-23471753);
                        i10 = -324341104;
                    }
                    break;
                case -821144628:
                case 83308090:
                    sArr2 = f15520;
                    if (C3432.f10845 >= 0) {
                        iM2566 = C0630.m2566("ۛ۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-8833)) ^ (-1482863879);
                        i10 = -1982839391;
                    } else {
                        iM2566 = C0630.m2566("۠ܽ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 14463) ^ (-128896752);
                        i10 = 1695933907;
                    }
                    break;
                case -750248589:
                case 1324918163:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("ۛ۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-8833)) ^ (-1482863879);
                        i10 = -1982839391;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ۧ۫")) * (-43);
                        i9 = ((iM2566 ^ i7) * 22325) ^ 1850136284;
                        i10 = 4045996;
                    }
                    break;
                case -531731205:
                case 2070134899:
                    C21923.m49329();
                    if (C3746.f11829 > 0) {
                        iM2566 = C0630.m2566("ۛ۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-8833)) ^ (-1482863879);
                        i10 = -1982839391;
                    } else {
                        iM2566 = C2105.m6981("ۢܿ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-29807)) ^ 1279993429;
                        i10 = 513941564;
                    }
                    break;
                case -398830723:
                case 744562255:
                    C2272.m7503();
                    if (!C2272.m7503()) {
                        iM2566 = C2105.m6981("ۢܿ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-29807)) ^ 1279993429;
                        i10 = 513941564;
                    } else {
                        iM2566 = (C2105.m6981("ۛ᩸") ^ i8) * 21;
                        i9 = ((iM2566 ^ i7) * 3509) ^ 1532765547;
                        i10 = -871512410;
                    }
                    break;
                case -396992993:
                case 475302850:
                    i4 = 51986;
                    iM2566 = (C0630.m2566("ܳᩴ") ^ i7) * (-7);
                    i9 = ((iM2566 ^ i8) * (-31699)) ^ 1889568535;
                    i10 = -751891886;
                    break;
                case -17558153:
                case 767572590:
                    C2126.m7031(packageName, C3683.m11225(sArr2, i5, 19, i4));
                    return packageName;
                case 465607217:
                case 984819933:
                    i4 = 64063;
                    iM2566 = (C0630.m2566("ܳᩴ") ^ i7) * (-7);
                    i9 = ((iM2566 ^ i8) * (-31699)) ^ 1889568535;
                    i10 = -751891886;
                    break;
                default:
                    packageName = C0382.m1842().getPackageName();
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C2105.m6981("ۛ᩸") ^ i8) * 21;
                        i9 = ((iM2566 ^ i7) * 3509) ^ 1532765547;
                        i10 = -871512410;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۘ") + i7) * 79;
                        i9 = ((iM2566 ^ i8) * (-29517)) ^ (-907550948);
                        i10 = 1711703055;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object m14326(String str) {
        return C2272.m7509(C0382.m1842(), str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ca A[PHI: r8 r10 r11
      0x01ca: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:54:0x01c8, B:39:0x0121, B:16:0x0080, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:54:0x01c8, B:39:0x0121, B:16:0x0080, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:54:0x01c8, B:39:0x0121, B:16:0x0080, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0237 A[PHI: r5 r6 r13 r14 r15
      0x0237: PHI (r5v3 short) = (r5v2 short), (r5v2 short), (r5v2 short), (r5v5 short) binds: [B:62:0x021c, B:29:0x00d9, B:25:0x00b7, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:62:0x021c, B:29:0x00d9, B:25:0x00b7, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:62:0x021c, B:29:0x00d9, B:25:0x00b7, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:62:0x021c, B:29:0x00d9, B:25:0x00b7, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:62:0x021c, B:29:0x00d9, B:25:0x00b7, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0287 A[PHI: r3 r4 r7 r12 r20
      0x0287: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:72:0x0285, B:68:0x0267, B:58:0x01fa, B:35:0x00ff, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:72:0x0285, B:68:0x0267, B:58:0x01fa, B:35:0x00ff, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:72:0x0285, B:68:0x0267, B:58:0x01fa, B:35:0x00ff, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:72:0x0285, B:68:0x0267, B:58:0x01fa, B:35:0x00ff, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:72:0x0285, B:68:0x0267, B:58:0x01fa, B:35:0x00ff, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final boolean m14321() {
        int iM2566;
        int i;
        int i2;
        int i3 = C0714.f2697;
        int i4 = C0050.f910;
        int iM2567 = (i4 - C0630.m2566("ۤ᩶")) * (-13);
        int i5 = ((iM2567 ^ i3) * (-4687)) ^ 1431748632;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2567 ^ (-1615840525);
        SharedPreferences sharedPreferences = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 428959849;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * (-7625)) >> 31));
            switch (i15) {
                case -2078384197:
                case 724489841:
                    i12 = 3;
                    if (C3683.f11629 >= 0) {
                        iM2566 = C2105.m6981("ܿܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 14371) ^ 2098339792;
                        i2 = 813613898;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ֫") ^ i3) * 67;
                        i = ((iM2566 ^ i4) * (-28553)) ^ (-1464648055);
                        i2 = 104084657;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2068050678:
                case -434086457:
                    int i16 = s + s2;
                    i7 = i16 * i16;
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C0630.m2566("֡ܺ") + i4) * (-95);
                        i = ((iM2566 ^ i3) * 6115) ^ 1033769396;
                        i2 = 968258701;
                    } else {
                        iM2566 = (C0630.m2566("֫ܳ") + i4) * 93;
                        i = ((iM2566 ^ i3) * 31337) ^ (-1901635014);
                        i2 = -667193771;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2040270804:
                case -659453070:
                    i10 = 22737;
                    iM2566 = (C2105.m6981("ᩳۤ") ^ i3) * (-85);
                    i = ((iM2566 ^ i4) * (-17661)) ^ (-1689286174);
                    i2 = 1343493114;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1884539852:
                case 1415068670:
                    i14 = 18;
                    if (C4159.f13567) {
                        iM2566 = (i3 - C2105.m6981("᩷ܶ")) * (-117);
                        i = ((iM2566 ^ i4) * 27985) ^ 197670730;
                        i2 = 1834232358;
                    } else {
                        iM2566 = (C0630.m2566("֡ܺ") + i4) * (-95);
                        i = ((iM2566 ^ i3) * 6115) ^ 1033769396;
                        i2 = 968258701;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1867706434:
                case 602439281:
                    sharedPreferences = f15523;
                    if (sharedPreferences != null) {
                        iM2566 = (C2105.m6981("ۗܶ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i3) * 7829) ^ 2041040901;
                        i2 = 810123144;
                    } else {
                        iM2566 = C2105.m6981("ܽۨ") ^ i4;
                        i = ((iM2566 ^ i3) * 31627) ^ 482544559;
                        i2 = 288939123;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1768980466:
                case 771923260:
                    sArr3 = f15520;
                    i13 = 396;
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("ۨ۫") ^ i3;
                        i = ((iM2566 ^ i4) * 28739) ^ 151542773;
                        i2 = -635962144;
                    } else {
                        iM2566 = (C0630.m2566("֡ܺ") + i4) * (-95);
                        i = ((iM2566 ^ i3) * 6115) ^ 1033769396;
                        i2 = 968258701;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1710785972:
                case 906639735:
                    return C2520.m8023(sharedPreferences, C3432.m10488(sArr3, i13, i14, i10), true);
                case -1582549333:
                case 1004109694:
                    C22628.m50610(C1504.m5177(sArr2, i11, i12, i10));
                    throw null;
                case -1373277497:
                case -1173436282:
                    i10 = 50384;
                    iM2566 = (C2105.m6981("ᩳۤ") ^ i3) * (-85);
                    i = ((iM2566 ^ i4) * (-17661)) ^ (-1689286174);
                    i2 = 1343493114;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1361190706:
                case 1818998733:
                    RunnableC0588.m2441();
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("ۢ۬") ^ i4;
                        i = ((iM2566 ^ i3) * (-18527)) ^ 1507304792;
                        i2 = -1457234080;
                    } else {
                        iM2566 = (C0630.m2566("ۗ۠") + i4) * 21;
                        i = ((iM2566 ^ i3) * (-12951)) ^ 1088618722;
                        i2 = -896255014;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1312261742:
                case 1163732314:
                    if ((i8 + i9) - i7 <= 0) {
                        iM2566 = (C2105.m6981("ܳܺ") ^ i3) * 63;
                        i = ((iM2566 ^ i4) * 11363) ^ 1325780377;
                        i2 = -585193100;
                    } else {
                        iM2566 = C0630.m2566("֨᩶") ^ i4;
                        i = ((iM2566 ^ i3) * (-1355)) ^ (-1425589447);
                        i2 = 1185618947;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1273393432:
                case 1960619734:
                    sArr = f15520;
                    c = 392;
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ܿܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 14371) ^ 2098339792;
                        i2 = 813613898;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩵۫")) * (-29);
                        i = ((iM2566 ^ i4) * (-11157)) ^ (-1712906447);
                        i2 = -1575667954;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1104068980:
                case -736581093:
                    C3245.m9925();
                    if (C4616.f14690 > 0) {
                        iM2566 = (C0630.m2566("ۗ۠") + i4) * 21;
                        i = ((iM2566 ^ i3) * (-12951)) ^ 1088618722;
                        i2 = -896255014;
                    } else {
                        iM2566 = (C2105.m6981("ܰᩳ") ^ i3) * (-15);
                        i = ((iM2566 ^ i4) * 9827) ^ 1300125052;
                        i2 = 126635440;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -831802525:
                case -308468109:
                    sArr2 = f15520;
                    i11 = 393;
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("ۢ۬") ^ i4;
                        i = ((iM2566 ^ i3) * (-18527)) ^ 1507304792;
                        i2 = -1457234080;
                    } else {
                        iM2566 = C0630.m2566("᩶֨") ^ i4;
                        i = ((iM2566 ^ i3) * 15487) ^ 55839382;
                        i2 = 2025356034;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 130073865:
                case 1272132374:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("ۢ۬") ^ i4;
                        i = ((iM2566 ^ i3) * (-18527)) ^ 1507304792;
                        i2 = -1457234080;
                    } else {
                        iM2566 = C2105.m6981("ܿܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 14371) ^ 2098339792;
                        i2 = 813613898;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 268794066:
                case 1526574530:
                    i8 = s * 2;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ܿܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 14371) ^ 2098339792;
                        i2 = 813613898;
                    } else {
                        iM2566 = (C0630.m2566("ۙۧ") + i4) * (-115);
                        i = ((iM2566 ^ i3) * (-11277)) ^ 783737351;
                        i2 = -1809154313;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 358293330:
                case 1199434493:
                    i9 = 1;
                    if (AbstractC2021.m6574()) {
                        iM2566 = C2105.m6981("ۢ۬") ^ i4;
                        i = ((iM2566 ^ i3) * (-18527)) ^ 1507304792;
                        i2 = -1457234080;
                    } else {
                        iM2566 = C0630.m2566("ۙ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-975)) ^ (-1478867661);
                        i2 = 1065848114;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 637682592:
                case 1131580219:
                    s = sArr[c];
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("ܿܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 14371) ^ 2098339792;
                        i2 = 813613898;
                    } else {
                        iM2566 = C2105.m6981("ۤ֡") ^ i4;
                        i = ((iM2566 ^ i3) * (-22963)) ^ (-752902424);
                        i2 = -1034340254;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 852588797:
                case 1929996190:
                    C3245.m9925();
                    C1047.m3599();
                    return false;
                case 1097788325:
                case 1434558049:
                    C2167.m7155();
                    C2167.m7155();
                    iM2566 = (C0630.m2566("ۗ۠") + i4) * 21;
                    i = ((iM2566 ^ i3) * (-12951)) ^ 1088618722;
                    i2 = -896255014;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    s2 = 1;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("֡ܺ") + i4) * (-95);
                        i = ((iM2566 ^ i3) * 6115) ^ 1033769396;
                        i2 = 968258701;
                    } else {
                        iM2566 = C0630.m2566("۫ۜ") ^ i3;
                        i = ((iM2566 ^ i4) * 13189) ^ 535755374;
                        i2 = 1752144523;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01a3 A[PHI: r2 r5 r6 r7 r11
      0x01a3: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:47:0x01a1, B:31:0x00f6, B:23:0x0098, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r5v4 android.content.pm.PackageInfo) = 
      (r5v2 android.content.pm.PackageInfo)
      (r5v2 android.content.pm.PackageInfo)
      (r5v3 android.content.pm.PackageInfo)
      (r5v2 android.content.pm.PackageInfo)
     binds: [B:47:0x01a1, B:31:0x00f6, B:23:0x0098, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r6v4 short[]) = (r6v2 short[]), (r6v2 short[]), (r6v3 short[]), (r6v2 short[]) binds: [B:47:0x01a1, B:31:0x00f6, B:23:0x0098, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:47:0x01a1, B:31:0x00f6, B:23:0x0098, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:47:0x01a1, B:31:0x00f6, B:23:0x0098, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d8 A[PHI: r10
      0x01d8: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:51:0x01d6, B:17:0x0075, B:15:0x0071, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0212 A[PHI: r8 r13 r14 r22
      0x0212: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:55:0x0210, B:15:0x0071, B:9:0x0062, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v5 short[]) binds: [B:55:0x0210, B:15:0x0071, B:9:0x0062, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v5 int) binds: [B:55:0x0210, B:15:0x0071, B:9:0x0062, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r22v5 int) = (r22v4 int), (r22v3 int), (r22v3 int), (r22v3 int) binds: [B:55:0x0210, B:15:0x0071, B:9:0x0062, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0260 A[PHI: r15 r16 r17
      0x0260: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:63:0x025e, B:59:0x0240, B:35:0x0116, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x025e, B:59:0x0240, B:35:0x0116, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:63:0x025e, B:59:0x0240, B:35:0x0116, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final PackageInfo m14304(String str) {
        int iM2566;
        int i;
        int i2;
        int i3 = C3432.f10845;
        int i4 = C1773.f6144;
        int iM6981 = C2105.m6981("᩹ᩴ") ^ i4;
        int i5 = ((iM6981 ^ i3) * 30309) ^ (-1095008788);
        PackageManager packageManagerM14320 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM6981 ^ 1253611821;
        String strM10568 = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = -1299665760;
        int i13 = 0;
        PackageInfo packageInfo = null;
        int i14 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-3873)) >> 31));
            switch (i12) {
                case -2005211218:
                case -1897480618:
                    C4159.m12565();
                    iM2566 = (i4 - C2105.m6981("᩵֫")) * 43;
                    i = ((iM2566 ^ i3) * (-28177)) ^ (-1770866028);
                    i2 = 1806217116;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1566327243:
                case 224222075:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (i4 - C2105.m6981("᩵֫")) * 43;
                        i = ((iM2566 ^ i3) * (-28177)) ^ (-1770866028);
                        i2 = 1806217116;
                    } else {
                        iM2566 = C2105.m6981("ᩳᩴ") ^ i4;
                        i = ((iM2566 ^ i3) * (-28431)) ^ (-17297865);
                        i2 = -1604808255;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1545678651:
                case -136466628:
                    i11 = 11;
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("᩶ۙ") ^ i3;
                        i = ((iM2566 ^ i4) * (-2947)) ^ (-1508509241);
                        i2 = -1203094672;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۜۖ")) * 17;
                        i = ((iM2566 ^ i4) * (-19127)) ^ (-1751094658);
                        i2 = 1152423079;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1311723957:
                case -1165848107:
                    i9 = 3740;
                    iM2566 = C2105.m6981("۟᩺") ^ i3;
                    i = ((iM2566 ^ i4) * (-16283)) ^ 615926837;
                    i2 = 1061187250;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1293151492:
                case 791899472:
                    C3019.m9255();
                    C3432.m10477();
                    return null;
                case -1244467547:
                case 1085738517:
                    packageInfo = packageManagerM14320.getPackageInfo(str, i14);
                    sArr3 = f15520;
                    i7 = BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    if (C22628.m50615() != 0) {
                        iM2566 = C0630.m2566("ۖۡ") ^ i4;
                        i = ((iM2566 ^ i3) * 14513) ^ 1311503791;
                        i2 = -17683808;
                    } else {
                        iM2566 = (C0630.m2566("᩸᩵") ^ i3) * 75;
                        i = ((iM2566 ^ i4) * 2563) ^ (-1216881810);
                        i2 = 822234986;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1188655929:
                case 286716611:
                    if (i8 - (s * s2) >= 0) {
                        iM2566 = (C2105.m6981("ۚܳ") + i3) * (-3);
                        i = ((iM2566 ^ i4) * 31759) ^ (-1964941369);
                        i2 = 1605947795;
                    } else {
                        iM2566 = C2105.m6981("ۗۖ") ^ i4;
                        i = ((iM2566 ^ i3) * 32411) ^ (-683073275);
                        i2 = -1620241054;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1187833658:
                case -776449981:
                    i8 = i13 + 214329600;
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i4 - C2105.m6981("᩵֫")) * 43;
                        i = ((iM2566 ^ i3) * (-28177)) ^ (-1770866028);
                        i2 = 1806217116;
                    } else {
                        iM2566 = (C2105.m6981("֫ۙ") + i4) * 93;
                        i = ((iM2566 ^ i3) * 11109) ^ (-1730076899);
                        i2 = 864580833;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1082619346:
                case -200578164:
                    i9 = 38421;
                    iM2566 = C2105.m6981("۟᩺") ^ i3;
                    i = ((iM2566 ^ i4) * (-16283)) ^ 615926837;
                    i2 = 1061187250;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1080141476:
                case 441241762:
                    c = 'i';
                    if (C2272.f7362) {
                        iM2566 = C2105.m6981("᩶ۙ") ^ i3;
                        i = ((iM2566 ^ i4) * (-2947)) ^ (-1508509241);
                        i2 = -1203094672;
                    } else {
                        iM2566 = (C2105.m6981("۠ܶ") ^ i3) * (-27);
                        i = ((iM2566 ^ i4) * (-23233)) ^ 589667230;
                        i2 = -978062678;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -930704619:
                case 505608900:
                    s2 = 29280;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۖۡ") ^ i4;
                        i = ((iM2566 ^ i3) * 14513) ^ 1311503791;
                        i2 = -17683808;
                    } else {
                        iM2566 = C0630.m2566("ۧۡ") ^ i4;
                        i = ((iM2566 ^ i3) * 24771) ^ (-526660856);
                        i2 = 1068191727;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -800091747:
                case 1461510839:
                    ViewOnClickListenerC1958.m6429();
                    if (C0964.f3626 != 0) {
                        iM2566 = (i4 - C2105.m6981("᩵֫")) * 43;
                        i = ((iM2566 ^ i3) * (-28177)) ^ (-1770866028);
                        i2 = 1806217116;
                    } else {
                        iM2566 = C2105.m6981("᩶ۙ") ^ i3;
                        i = ((iM2566 ^ i4) * (-2947)) ^ (-1508509241);
                        i2 = -1203094672;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -586070320:
                case 1019292173:
                    C4159.m12575(packageInfo, C3245.m9934(sArr3, i7, 19, i9));
                    return packageInfo;
                case -571679819:
                case -426672776:
                    C4263.m12819();
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = C2105.m6981("ᩳᩴ") ^ i4;
                        i = ((iM2566 ^ i3) * (-28431)) ^ (-17297865);
                        i2 = -1604808255;
                    } else {
                        iM2566 = C0630.m2566("ۖۡ") ^ i4;
                        i = ((iM2566 ^ i3) * 14513) ^ 1311503791;
                        i2 = -17683808;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -271040946:
                case -211591878:
                    RunnableC0588.m2430(str, strM10568);
                    packageManagerM14320 = m14320();
                    i14 = 0;
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C2105.m6981("ۘ᩷") + i3) * 127;
                        i = ((iM2566 ^ i4) * 28947) ^ 522119696;
                        i2 = 857662657;
                    } else {
                        iM2566 = (C2105.m6981("۬ۡ") + i3) * (-115);
                        i = ((iM2566 ^ i4) * (-26789)) ^ 1260206949;
                        i2 = 312836060;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 236627778:
                case 593905436:
                    s = sArr[c];
                    i13 = s * s;
                    if (C4616.m13552() != 0) {
                        iM2566 = C2105.m6981("ᩳᩴ") ^ i4;
                        i = ((iM2566 ^ i3) * (-28431)) ^ (-17297865);
                        i2 = -1604808255;
                    } else {
                        iM2566 = C2105.m6981("ۤ۬") ^ i3;
                        i = ((iM2566 ^ i4) * (-17307)) ^ 542265195;
                        i2 = 1689049059;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 640978581:
                case 1678161856:
                    sArr = f15520;
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("᩶ۙ") ^ i3;
                        i = ((iM2566 ^ i4) * (-2947)) ^ (-1508509241);
                        i2 = -1203094672;
                    } else {
                        iM2566 = C0630.m2566("ܶܿ") ^ i4;
                        i = ((iM2566 ^ i3) * 23595) ^ (-1787645405);
                        i2 = 888231837;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1098525039:
                case 1123806761:
                    strM10568 = ServiceConnectionC3453.m10568(sArr2, i10, i11, i9);
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("ۖۡ") ^ i4;
                        i = ((iM2566 ^ i3) * 14513) ^ 1311503791;
                        i2 = -17683808;
                    } else {
                        iM2566 = (C2105.m6981("ۧ۫") + i4) * (-125);
                        i = ((iM2566 ^ i3) * (-13175)) ^ 1398486946;
                        i2 = -562556236;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr2 = f15520;
                    i10 = IShizukuService.Stub.TRANSACTION_getFlagsForUid;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ᩳᩴ") ^ i4;
                        i = ((iM2566 ^ i3) * (-28431)) ^ (-17297865);
                        i2 = -1604808255;
                    } else {
                        iM2566 = C2105.m6981("ۛ֡") ^ i4;
                        i = ((iM2566 ^ i3) * (-9241)) ^ (-1127917519);
                        i2 = -648014612;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f2 A[PHI: r4
      0x00f2: PHI (r4v4 android.net.NetworkInfo) = (r4v3 android.net.NetworkInfo), (r4v2 android.net.NetworkInfo), (r4v2 android.net.NetworkInfo) binds: [B:32:0x00d8, B:27:0x00b4, B:24:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0114 A[PHI: r3
      0x0114: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:36:0x0112, B:16:0x0082, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x023b A[PHI: r1 r9 r10 r12 r13 r15
      0x023b: PHI (r1v4 android.app.Application) = 
      (r1v2 android.app.Application)
      (r1v3 android.app.Application)
      (r1v2 android.app.Application)
      (r1v2 android.app.Application)
     binds: [B:64:0x0239, B:53:0x01c9, B:49:0x01a3, B:40:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:64:0x0239, B:53:0x01c9, B:49:0x01a3, B:40:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:64:0x0239, B:53:0x01c9, B:49:0x01a3, B:40:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:64:0x0239, B:53:0x01c9, B:49:0x01a3, B:40:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:64:0x0239, B:53:0x01c9, B:49:0x01a3, B:40:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:64:0x0239, B:53:0x01c9, B:49:0x01a3, B:40:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x026f A[PHI: r2 r8
      0x026f: PHI (r2v4 java.lang.Object) = 
      (r2v2 java.lang.Object)
      (r2v3 java.lang.Object)
      (r2v2 java.lang.Object)
      (r2v2 java.lang.Object)
      (r2v2 java.lang.Object)
     binds: [B:68:0x026d, B:44:0x016e, B:18:0x0086, B:16:0x0082, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:68:0x026d, B:44:0x016e, B:18:0x0086, B:16:0x0082, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02be A[PHI: r6 r7 r14 r20
      0x02be: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:76:0x02bc, B:72:0x029f, B:13:0x0079, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:76:0x02bc, B:72:0x029f, B:13:0x0079, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v5 int) binds: [B:76:0x02bc, B:72:0x029f, B:13:0x0079, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:76:0x02bc, B:72:0x029f, B:13:0x0079, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final boolean m14301() {
        int iM2566;
        int i;
        int i2;
        int i3 = C0630.f2410;
        int i4 = C3683.f11629;
        int iM6981 = (i4 - C2105.m6981("ܺ۠")) * (-77);
        int i5 = ((iM6981 ^ i3) * (-20761)) ^ (-321638142);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM6981 ^ 387148116;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1435118461;
        NetworkInfo activeNetworkInfo = null;
        String strM10568 = null;
        Object objM3793 = null;
        Application applicationM10479 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-5961)) >> 31));
            switch (i13) {
                case -2038504869:
                case 1005820406:
                    applicationM10479 = C3432.m10479();
                    sArr2 = f15520;
                    if (C1711.m5736() <= 0) {
                        iM2566 = C2105.m6981("۠ܰ") ^ i4;
                        i = ((iM2566 ^ i3) * 31633) ^ (-1077181379);
                        i2 = 1318256728;
                    } else {
                        iM2566 = C2105.m6981("֨۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-11479)) ^ (-563334747);
                        i2 = -1635567026;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2016294236:
                case 1945437173:
                    if ((i8 + i9) - i7 >= 0) {
                        iM2566 = C0630.m2566("۫۬") ^ i4;
                        i = ((iM2566 ^ i3) * (-27969)) ^ 1374366779;
                        i2 = 2075681250;
                    } else {
                        iM2566 = C0630.m2566("ܳ۠") ^ i3;
                        i = ((iM2566 ^ i4) * 28393) ^ (-349533696);
                        i2 = -1436133699;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2014278827:
                case 652088000:
                    sArr3 = f15520;
                    if (C7811.m20844() != 0) {
                        iM2566 = C2105.m6981("۠ܰ") ^ i4;
                        i = ((iM2566 ^ i3) * 31633) ^ (-1077181379);
                        i2 = 1318256728;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܺ۟")) * 95;
                        i = ((iM2566 ^ i3) * 25231) ^ (-1429485502);
                        i2 = -1616339038;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2008837189:
                case -1218411324:
                    s = sArr[c];
                    if (C4159.f13567) {
                        iM2566 = C0630.m2566("۫ۘ") ^ i3;
                        i = ((iM2566 ^ i4) * 26323) ^ 972951544;
                        i2 = -1249598001;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۤ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i3) * 9081) ^ 2005941194;
                        i2 = -1337352289;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1968135949:
                case -1173086747:
                    C21923.m49329();
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("ۤܰ") ^ i3;
                        i = ((iM2566 ^ i4) * 5235) ^ 865748474;
                        i2 = 1599376654;
                    } else {
                        iM2566 = C2105.m6981("ۙ۠") ^ i3;
                        i = ((iM2566 ^ i4) * (-6765)) ^ (-265735671);
                        i2 = -907254885;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1891664530:
                case 774522595:
                    i10 = 30146;
                    iM2566 = C0630.m2566("᩻۠") ^ i3;
                    i = ((iM2566 ^ i4) * (-4393)) ^ 431044815;
                    i2 = 1631604085;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1828706592:
                case -254386186:
                    i10 = 15790;
                    iM2566 = C0630.m2566("᩻۠") ^ i3;
                    i = ((iM2566 ^ i4) * (-4393)) ^ 431044815;
                    i2 = 1631604085;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1822664710:
                case 1078550167:
                    C4616.m13552();
                    iM2566 = C0630.m2566("᩷۟") ^ i3;
                    i = ((iM2566 ^ i4) * 3173) ^ 1492476056;
                    i2 = 256182134;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1808702253:
                case 1598785626:
                    if (activeNetworkInfo.isConnected()) {
                        iM2566 = C0630.m2566("ᩳ۬") ^ i3;
                        i = ((iM2566 ^ i4) * (-13705)) ^ 566998142;
                        i2 = 1710433620;
                    } else {
                        iM2566 = C2105.m6981("᩻ۙ") ^ i3;
                        i = ((iM2566 ^ i4) * 19017) ^ 1856453040;
                        i2 = 1872605830;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1804661957:
                case 98877060:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C0630.m2566("᩷۟") ^ i3;
                        i = ((iM2566 ^ i4) * 3173) ^ 1492476056;
                        i2 = 256182134;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۤ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i3) * 9081) ^ 2005941194;
                        i2 = -1337352289;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1786911563:
                case 1778666907:
                    i11 = 1;
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = C2105.m6981("۠ܰ") ^ i4;
                        i = ((iM2566 ^ i3) * 31633) ^ (-1077181379);
                        i2 = 1318256728;
                    } else {
                        iM2566 = (C0630.m2566("۠ܺ") ^ i3) * (-121);
                        i = ((iM2566 ^ i4) * (-13451)) ^ (-1402071778);
                        i2 = -1504778917;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1309629420:
                case 72399885:
                    C11233.m27800(objM3793, strM10568);
                    activeNetworkInfo = ((ConnectivityManager) objM3793).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        iM2566 = (i4 - C0630.m2566("۬ܿ")) * 53;
                        i = ((iM2566 ^ i3) * (-13147)) ^ (-293512771);
                        i2 = -1062817480;
                    } else {
                        iM2566 = C2105.m6981("᩻ۙ") ^ i3;
                        i = ((iM2566 ^ i4) * 19017) ^ 1856453040;
                        i2 = 1872605830;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -512013517:
                case 892233342:
                    return false;
                case -479317941:
                case 1061220555:
                    if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        iM2566 = C2105.m6981("ᩳ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * (-24631)) ^ (-888532220);
                        i2 = -745628340;
                    } else {
                        iM2566 = C2105.m6981("᩻ۙ") ^ i3;
                        i = ((iM2566 ^ i4) * 19017) ^ 1856453040;
                        i2 = 1872605830;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -281765948:
                case 897659566:
                    i7 = s * 7130;
                    if (C4117.f13076 <= 0) {
                        iM2566 = C0630.m2566("᩷۟") ^ i3;
                        i = ((iM2566 ^ i4) * 3173) ^ 1492476056;
                        i2 = 256182134;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ᩺") ^ i4) * (-109);
                        i = ((iM2566 ^ i3) * 20107) ^ 1161960961;
                        i2 = -1470715909;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 41293782:
                case 654971593:
                    return true;
                case 268693050:
                case 564385882:
                    strM10568 = ServiceConnectionC3453.m10568(sArr3, 13, 68, i10);
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("ۙ۠") ^ i3;
                        i = ((iM2566 ^ i4) * (-6765)) ^ (-265735671);
                        i2 = -907254885;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩷᩺")) * (-59);
                        i = ((iM2566 ^ i3) * 6785) ^ (-398832147);
                        i2 = -1591099201;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 486700130:
                case 1921798362:
                    objM3793 = RunnableC1108.m3793(applicationM10479, C7811.m20837(sArr2, i11, i12, i10));
                    if (C4117.f13076 <= 0) {
                        iM2566 = C0630.m2566("᩷۟") ^ i3;
                        i = ((iM2566 ^ i4) * 3173) ^ 1492476056;
                        i2 = 256182134;
                    } else {
                        iM2566 = C0630.m2566("ᩴ۫") ^ i3;
                        i = ((iM2566 ^ i4) * 16911) ^ 56783089;
                        i2 = -582787356;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 637069905:
                case 1569354707:
                    C2105.m6982();
                    if (C1047.f3863 < 0) {
                        iM2566 = C0630.m2566("᩷۟") ^ i3;
                        i = ((iM2566 ^ i4) * 3173) ^ 1492476056;
                        i2 = 256182134;
                    } else {
                        iM2566 = C2105.m6981("ۙ۠") ^ i3;
                        i = ((iM2566 ^ i4) * (-6765)) ^ (-265735671);
                        i2 = -907254885;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 647034223:
                case 1442239352:
                    C0422.m1963();
                    return false;
                case 1272464837:
                case 1917959148:
                    i8 = s * s;
                    i9 = 12709225;
                    if (C1916.f6442) {
                        iM2566 = (i3 - C2105.m6981("ۧܶ")) * 23;
                        i = ((iM2566 ^ i4) * (-30071)) ^ (-1036743027);
                        i2 = -1577030987;
                    } else {
                        iM2566 = C2105.m6981("۠ܰ") ^ i4;
                        i = ((iM2566 ^ i3) * 31633) ^ (-1077181379);
                        i2 = 1318256728;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1459917478:
                case 1684240305:
                    sArr = f15520;
                    c = 0;
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("᩻ᩴ") ^ i4;
                        i = ((iM2566 ^ i3) * 8055) ^ 1830208001;
                        i2 = 2093423887;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۤ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i3) * 9081) ^ 2005941194;
                        i2 = -1337352289;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    i12 = 12;
                    if (C1047.m3599() >= 0) {
                        iM2566 = (C2105.m6981("ᩳۤ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i3) * 9081) ^ 2005941194;
                        i2 = -1337352289;
                    } else {
                        iM2566 = C0630.m2566("ۗۧ") ^ i4;
                        i = ((iM2566 ^ i3) * (-16605)) ^ (-216700471);
                        i2 = -2046080057;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
