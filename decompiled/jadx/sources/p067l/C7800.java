package p067l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G6K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7800 implements InterfaceC10052 {

    /* JADX INFO: renamed from: ۘ֨ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f82008 = {9591, 28755, 28740, 28762, 1365, 22182, 22193, 22191, 12642, -11330, -13450, -10963, -10745, -10324, 3284, -12312, 8363, -16212, 12392, 1931, 571, -5094, -5107, -5101, -5090, -5102, -5104, -5037, -5092, -5101, -5095, -5105, -5102, -5100, -5095, -5037, -5109, -5096, -5101, -5095, -5100, -5101, -5094, -5092, -5101, -5095, -5105, -5102, -5100, -5095, -5037, -5100, -5101, -5111, -5096, -5101, -5111, -5037, -5090, -5092, -5111, -5096, -5094, -5102, -5105, -5116, -5037, -5071, -5060, -5080, -5069, -5058, -5067, -5064, -5073, -5094, -5107, -5101, -5092, -5101, -5095, -5105, -5102, -5100, -5095, -5037, -5100, -5101, -5111, -5096, -5101, -5111, -5037, -5090, -5092, -5111, -5096, -5094, -5102, -5105, -5116, -5037, -5068, -5069, -5061, -5070, 3497, -2130, -2143, -2133, -2115, -2144, -2138, -2133, -2079, -2138, -2143, -2117, -2134, -2143, -2117, -2079, -2130, -2132, -2117, -2138, -2144, -2143, -2079, -2174, -2162, -2170, -2175, -2132, -2144, -2142, -2079, -2130, -2143, -2133, -2115, -2144, -2138, -2133, -2079, -2119, -2134, -2143, -2133, -2138, -2143, -2136, 5510, -27040, -27012, -27012, -27016, -27013, -27086, -27097, -27097, -27035, -27012, -27098, -27029, -27029};

    /* JADX INFO: renamed from: ۛ */
    public static final Object f20463 = new Object();

    /* JADX INFO: renamed from: ۗ */
    public DialogInterfaceC2564 f20464;

    /* JADX INFO: renamed from: ۙ */
    public boolean f20465;

    /* JADX INFO: renamed from: ۤ */
    public int f20466;

    /* JADX INFO: renamed from: ۫ */
    public final RunnableC21212 f20467;

    /* JADX INFO: renamed from: ۬ */
    public final ViewTreeObserverOnWindowFocusChangeListenerC6459 f20468;

    /* JADX INFO: renamed from: ᩶ */
    public final View f20469;

    /* JADX INFO: renamed from: ᩸ */
    public final Main f20470;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f20471;

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo8221(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo8223(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo8226(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܿ */
    public final void mo8225(InterfaceC24784 interfaceC24784) {
        boolean z = false;
        RunnableC21212 runnableC21212 = null;
        View view = null;
        DialogInterfaceC2564 dialogInterfaceC2564 = null;
        int i = -1272230385;
        int i2 = C0906.f81862;
        int i3 = C0949.f81897;
        int iM55680 = C0873.m55680("᩺֫") ^ i3;
        int i4 = ((iM55680 ^ i2) * 11959) ^ (-762948050);
        int i5 = 2100701069;
        while (true) {
            i = ((((i ^ i2) * 2151) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1791208926:
                case 970426418:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("ۧܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12091)) ^ (-1229600705);
                        i5 = 1798268636;
                    } else {
                        iM55680 = (C0946.m55979("֫ۡ") + i2) * 73;
                        i4 = ((iM55680 ^ i3) * (-10165)) ^ (-306265091);
                        i5 = 172191343;
                    }
                    break;
                case -1727056150:
                case 209987016:
                    break;
                case -1572419080:
                case 1144738995:
                    C0989.m56084(interfaceC24784).mo21807(this);
                    dialogInterfaceC2564 = this.f20464;
                    if (dialogInterfaceC2564 != null) {
                        iM55680 = (C0946.m55979("᩺ۜ") + i2) * (-89);
                        i4 = ((iM55680 ^ i3) * 6487) ^ (-1443172147);
                        i5 = 1640272645;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۠ۨ")) * (-75);
                        i4 = ((iM55680 ^ i2) * (-8753)) ^ (-1791095727);
                        i5 = -890613284;
                    }
                    break;
                case -1536978470:
                case 611608400:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0946.m55979("ۙۛ") ^ i2) * (-85);
                        i4 = ((iM55680 ^ i3) * 20233) ^ (-849864119);
                        i5 = 1210218598;
                    } else {
                        iM55680 = C0873.m55680("ۜۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23099) ^ 1489429099;
                        i5 = 1936326643;
                    }
                    break;
                case -1441680283:
                case 840106593:
                    if (C0877.f81843 < 0) {
                        iM55680 = (i3 - C0873.m55680("ܽ֫")) * 67;
                        i4 = ((iM55680 ^ i2) * 4567) ^ 1889028783;
                        i5 = -1211231577;
                    } else {
                        iM55680 = (C0946.m55979("ܿ֡") ^ i2) * 81;
                        i4 = ((iM55680 ^ i3) * 13119) ^ (-141111995);
                        i5 = -1846852850;
                    }
                    break;
                case -1438668632:
                case 1374035475:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("۟ܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        iM55680 = (i2 - C0873.m55680("᩶ۖ")) * (-127);
                        i4 = ((iM55680 ^ i3) * 24135) ^ (-1356944191);
                        i5 = -179015011;
                    }
                    break;
                case -1300678701:
                case 1333649752:
                    C0955.m56025();
                    C1044.m56286();
                    break;
                case -1183177665:
                case -1042653982:
                    if (C0892.f81851) {
                        iM55680 = (i2 - C0946.m55979("᩸ۧ")) * 31;
                        i4 = ((iM55680 ^ i3) * 18569) ^ 1509025657;
                        i5 = 443188278;
                    } else {
                        iM55680 = C0873.m55680("۟ܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    }
                    break;
                case -1048533835:
                case 173979521:
                    if (C0967.f81910 >= 0) {
                        iM55680 = (i3 - C0873.m55680("ܽ֫")) * 67;
                        i4 = ((iM55680 ^ i2) * 4567) ^ 1889028783;
                        i5 = -1211231577;
                    } else {
                        iM55680 = C0873.m55680("۟᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26433)) ^ 1726086044;
                        i5 = 1282027901;
                    }
                    break;
                case -653031658:
                case 344682284:
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0873.m55680("۟ܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        iM55680 = C0946.m55979("᩶ۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29837)) ^ 1642101232;
                        i5 = -1521141109;
                    }
                    break;
                case -619010542:
                case -234365771:
                    view = this.f20469;
                    view.removeCallbacks(runnableC21212);
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("۟ܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        iM55680 = C0873.m55680("֡ᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5605) ^ 130745467;
                        i5 = -486221031;
                    }
                    break;
                case -470586010:
                case 1130443870:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("ۧܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12091)) ^ (-1229600705);
                        i5 = 1798268636;
                    } else {
                        iM55680 = C0873.m55680("᩷֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5579)) ^ (-73488400);
                        i5 = 412084944;
                    }
                    break;
                case -417732448:
                case 1275897280:
                    if (view.getViewTreeObserver().isAlive()) {
                        iM55680 = C0946.m55979("ۖۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1815) ^ 1244618187;
                        i5 = -1940529516;
                    } else {
                        iM55680 = C0946.m55979("ܿۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26353) ^ (-571993900);
                        i5 = -348977894;
                    }
                    break;
                case -482520:
                case 1159494846:
                    C1024.m56208(dialogInterfaceC2564);
                    iM55680 = (i3 - C0873.m55680("۠ۨ")) * (-75);
                    i4 = ((iM55680 ^ i2) * (-8753)) ^ (-1791095727);
                    i5 = -890613284;
                    break;
                case 223569785:
                case 734222578:
                    z = true;
                    if (C0917.m55854()) {
                        iM55680 = (C0946.m55979("۬֨") + i3) * (-19);
                        i4 = ((iM55680 ^ i2) * 8723) ^ 1225629465;
                        i5 = -8189136;
                    } else {
                        iM55680 = C0873.m55680("۟ܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    }
                    break;
                case 553667466:
                case 1815042640:
                    this.f20465 = z;
                    runnableC21212 = this.f20467;
                    if (C0955.m56025()) {
                        iM55680 = (C0946.m55979("ۙۛ") ^ i2) * (-85);
                        i4 = ((iM55680 ^ i3) * 20233) ^ (-849864119);
                        i5 = 1210218598;
                    } else {
                        iM55680 = C0873.m55680("۫ܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1685) ^ 934792505;
                        i5 = 38598559;
                    }
                    break;
                case 599934540:
                case 2046584751:
                    C0955.m56025();
                    if (C0930.f81879 > 0) {
                        iM55680 = (C0946.m55979("ܿ֡") ^ i2) * 81;
                        i4 = ((iM55680 ^ i3) * 13119) ^ (-141111995);
                        i5 = -1846852850;
                    } else {
                        iM55680 = C0873.m55680("ۧܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12091)) ^ (-1229600705);
                        i5 = 1798268636;
                    }
                    break;
                case 629630130:
                case 1426294902:
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f20468);
                    iM55680 = C0946.m55979("ܿۡ") ^ i2;
                    i4 = ((iM55680 ^ i3) * 26353) ^ (-571993900);
                    i5 = -348977894;
                    break;
                case 1116981349:
                case 1453615855:
                    C0892.m55749();
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0873.m55680("۟ܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        iM55680 = (C0946.m55979("ܿ֡") ^ i2) * 81;
                        i4 = ((iM55680 ^ i3) * 13119) ^ (-141111995);
                        i5 = -1846852850;
                    }
                    break;
                default:
                    ViewOnClickListenerC0939.m55941();
                    iM55680 = C0873.m55680("ۧܰ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-12091)) ^ (-1229600705);
                    i5 = 1798268636;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01fa A[PHI: r0 r2 r6 r8
      0x01fa: PHI (r0v4 bin.mt.plus.Main) = 
      (r0v2 bin.mt.plus.Main)
      (r0v2 bin.mt.plus.Main)
      (r0v2 bin.mt.plus.Main)
      (r0v3 bin.mt.plus.Main)
      (r0v2 bin.mt.plus.Main)
     binds: [B:63:0x01f8, B:53:0x018f, B:41:0x0114, B:30:0x009e, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r2v4 char) = (r2v2 char), (r2v3 char), (r2v2 char), (r2v2 char), (r2v2 char) binds: [B:63:0x01f8, B:53:0x018f, B:41:0x0114, B:30:0x009e, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:63:0x01f8, B:53:0x018f, B:41:0x0114, B:30:0x009e, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r8v4 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]) binds: [B:63:0x01f8, B:53:0x018f, B:41:0x0114, B:30:0x009e, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x022c A[PHI: r1 r5 r9
      0x022c: PHI (r1v6 short[]) = (r1v5 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:67:0x022a, B:57:0x01b0, B:45:0x0138, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r5v5 int) = (r5v2 int), (r5v2 int), (r5v4 int), (r5v2 int) binds: [B:67:0x022a, B:57:0x01b0, B:45:0x0138, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v6 int) binds: [B:67:0x022a, B:57:0x01b0, B:45:0x0138, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (p067l.C0930.f81879 > 0) goto L11;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m18063(C7800 c7800) {
        int iM55680;
        int i;
        int i2;
        Main main = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 655550703;
        int i8 = C1124.f82007;
        int i9 = C0845.f81821;
        int iM55681 = C0873.m55680("ۗۨ") ^ i9;
        int i10 = ((iM55681 ^ i8) * 3885) ^ 674275172;
        int i11 = -1394203080;
        while (true) {
            int i12 = iM55681 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i8) * 15007) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -2042147270:
                    case -1976003078:
                        i6 = 153;
                        if (C1053.f81965 > 0) {
                            iM55681 = (C0946.m55979("᩵ۙ") ^ i8) * 73;
                            i10 = ((iM55681 ^ i9) * (-21995)) ^ (-1148135625);
                            i11 = 1041187483;
                        }
                        iM55680 = (C0873.m55680("ۛ᩶") ^ i9) * (-71);
                        i = ((iM55680 ^ i8) * (-31711)) ^ (-1228069691);
                        i2 = 1376247514;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -1747133537:
                    case 348420426:
                        if (C1036.f81953 >= 0) {
                            iM55680 = C0946.m55979("۟֡") ^ i8;
                            i = ((iM55680 ^ i9) * (-13189)) ^ (-1238647717);
                            i2 = 761209203;
                        } else {
                            iM55680 = C0873.m55680("ۨܶ") ^ i9;
                            i = ((iM55680 ^ i8) * (-23365)) ^ 1603334641;
                            i2 = 29262274;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -1647015888:
                    case 514206311:
                        C1929.m56559(main, C1404.m56462(sArr2, i6, 13, i5));
                        break;
                    case -1609812804:
                    case 1679572726:
                        break;
                    case -1481551054:
                    case 327287768:
                        if (C0863.m55643()) {
                            iM55680 = (C0946.m55979("֡۠") ^ i8) * (-93);
                            i = ((iM55680 ^ i9) * 29505) ^ (-1204979853);
                            i2 = -1966207939;
                        } else {
                            iM55680 = (C0873.m55680("ۛ᩶") ^ i9) * (-71);
                            i = ((iM55680 ^ i8) * (-31711)) ^ (-1228069691);
                            i2 = 1376247514;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -1471728507:
                    case -870084402:
                        i5 = 59988;
                        iM55680 = (C0946.m55979("ܺۜ") + i8) * 93;
                        i = ((iM55680 ^ i9) * 27291) ^ 603117018;
                        i2 = 1176606815;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -1463192663:
                    case 980504378:
                        if (i4 - (s * s2) >= 0) {
                            iM55680 = (i8 - C0946.m55979("᩶᩸")) * 27;
                            i = ((iM55680 ^ i9) * (-28441)) ^ (-134873154);
                            i2 = 119277466;
                        } else {
                            iM55680 = C0873.m55680("ۘᩳ") ^ i9;
                            i = ((iM55680 ^ i8) * (-2645)) ^ 161012326;
                            i2 = 1424148309;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -1183274502:
                    case 1803225066:
                        main = c7800.f20470;
                        sArr2 = f82008;
                        if (C1012.f81938 >= 0) {
                            iM55680 = C0946.m55979("۟֡") ^ i8;
                            i = ((iM55680 ^ i9) * (-13189)) ^ (-1238647717);
                            i2 = 761209203;
                        } else {
                            iM55680 = C0946.m55979("۫ܳ") ^ i9;
                            i = ((iM55680 ^ i8) * (-3193)) ^ (-1015774932);
                            i2 = 2061668057;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -1073826582:
                    case 666772328:
                        C0845.m55584();
                        break;
                    case -1066869882:
                    case -322852969:
                        if (C1046.f81962 <= 0) {
                            iM55681 = C0946.m55979("᩺֡") ^ i8;
                            i10 = ((iM55681 ^ i9) * 19045) ^ 510757837;
                            i11 = -1993857850;
                        }
                        iM55680 = C0873.m55680("ۧ᩵") ^ i9;
                        i = ((iM55680 ^ i8) * (-16241)) ^ 477273021;
                        i2 = -2113461903;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -996150651:
                    case 731016034:
                        i4 = 125865961 + i3;
                        if (C0947.f81895) {
                            iM55680 = (C0873.m55680("ۛ᩶") ^ i9) * (-71);
                            i = ((iM55680 ^ i8) * (-31711)) ^ (-1228069691);
                            i2 = 1376247514;
                        } else {
                            iM55680 = (C0946.m55979("ܿᩴ") + i8) * (-31);
                            i = ((iM55680 ^ i9) * (-4661)) ^ 1702947432;
                            i2 = 1114308060;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -904210097:
                    case 1346625922:
                        sArr = f82008;
                        if (AbstractC0942.m55971()) {
                            iM55680 = (C0873.m55680("ۛ᩶") ^ i9) * (-71);
                            i = ((iM55680 ^ i8) * (-31711)) ^ (-1228069691);
                            i2 = 1376247514;
                        } else {
                            iM55680 = C0873.m55680("ۗ۬") ^ i8;
                            i = ((iM55680 ^ i9) * (-19673)) ^ (-21455446);
                            i2 = -101481496;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -786827195:
                    case 1476448293:
                        c = 152;
                        if (C0877.f81843 >= 0) {
                            iM55680 = C0946.m55979("۟֡") ^ i8;
                            i = ((iM55680 ^ i9) * (-13189)) ^ (-1238647717);
                            i2 = 761209203;
                        } else {
                            iM55680 = (i8 - C0946.m55979("ۜ۬")) * 109;
                            i = ((iM55680 ^ i9) * 6825) ^ (-619169759);
                            i2 = 576389395;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -684102919:
                    case 574638504:
                        s = sArr[c];
                        i3 = s * s;
                        if (C0863.f81833 <= 0) {
                            iM55680 = C0873.m55680("۫ۖ") ^ i9;
                            i = ((iM55680 ^ i8) * 16717) ^ (-1806275489);
                            i2 = -5646205;
                        } else {
                            iM55680 = (C0873.m55680("᩸᩶") + i9) * (-73);
                            i = ((iM55680 ^ i8) * 13669) ^ 898595775;
                            i2 = 929492394;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case 51124355:
                    case 58320375:
                        C1046.m56302();
                        if (C0890.f81849 == 0) {
                            iM55680 = C0946.m55979("۟֡") ^ i8;
                            i = ((iM55680 ^ i9) * (-13189)) ^ (-1238647717);
                            i2 = 761209203;
                            i12 = iM55680 ^ i2;
                            i10 = i;
                        }
                        iM55680 = (C0873.m55680("ۛ᩶") ^ i9) * (-71);
                        i = ((iM55680 ^ i8) * (-31711)) ^ (-1228069691);
                        i2 = 1376247514;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case 57351469:
                    case 1452807927:
                        i5 = 38408;
                        iM55680 = (C0946.m55979("ܺۜ") + i8) * 93;
                        i = ((iM55680 ^ i9) * 27291) ^ 603117018;
                        i2 = 1176606815;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case 73289776:
                    case 1085543733:
                        s2 = 22438;
                        if (C0863.f81833 <= 0) {
                            iM55680 = C0946.m55979("۟֡") ^ i8;
                            i = ((iM55680 ^ i9) * (-13189)) ^ (-1238647717);
                            i2 = 761209203;
                        } else {
                            iM55680 = (i9 - C0873.m55680("ܿܽ")) * (-109);
                            i = ((iM55680 ^ i8) * (-22641)) ^ (-567707693);
                            i2 = -958647490;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case 2124598356:
                    case 2138314055:
                        C0877.m55696();
                        C1229.m56410();
                        iM55680 = (C0873.m55680("ۛ᩶") ^ i9) * (-71);
                        i = ((iM55680 ^ i8) * (-31711)) ^ (-1228069691);
                        i2 = 1376247514;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    default:
                        if (C0917.f81868) {
                            iM55680 = C0873.m55680("ۧ᩵") ^ i9;
                            i = ((iM55680 ^ i8) * (-16241)) ^ 477273021;
                            i2 = -2113461903;
                        } else {
                            iM55680 = C0873.m55680("۬᩸") ^ i9;
                            i = ((iM55680 ^ i8) * (-12053)) ^ 793576026;
                            i2 = 1528086389;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18060(C7800 c7800, boolean z) {
        int i = 233378655;
        int i2 = C1044.f81959;
        int i3 = RunnableC1014.f81941;
        int iM55979 = C0946.m55979("֫ۖ") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-4509)) ^ 962336508;
        int i5 = -86089535;
        while (true) {
            i = ((((i ^ i3) * 8369) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2106468556:
                case -461046994:
                    if (z) {
                        iM55979 = C0873.m55680("ܶܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4013)) ^ (-130328665);
                        i5 = 1161803065;
                    } else {
                        iM55979 = (C0946.m55979("ۗܶ") + i3) * 119;
                        i4 = ((iM55979 ^ i2) * 2213) ^ (-1753964250);
                        i5 = -1587090020;
                    }
                    break;
                case -2053753631:
                case -849067429:
                    c7800.m18064();
                    iM55979 = (C0946.m55979("ۗܶ") + i3) * 119;
                    i4 = ((iM55979 ^ i2) * 2213) ^ (-1753964250);
                    i5 = -1587090020;
                    break;
                case -1950488611:
                case -1165090422:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0946.m55979("֡᩷") ^ i2) * (-81);
                        i4 = ((iM55979 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        iM55979 = C0873.m55680("᩸ۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-13455)) ^ 490874970;
                        i5 = -879984947;
                    }
                    break;
                case -1455947729:
                case -1436186609:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("᩺֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        iM55979 = (C0873.m55680("ۢܰ") ^ i2) * 17;
                        i4 = ((iM55979 ^ i3) * 25897) ^ (-492189819);
                        i5 = 1651463347;
                    }
                    break;
                case -1434198580:
                case 882625511:
                    C1194.m56396();
                    if (!C0866.m55645()) {
                        iM55979 = C0946.m55979("ۤܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    } else {
                        iM55979 = C0946.m55979("ۤ᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-3891)) ^ (-1820689869);
                        i5 = -1852943581;
                    }
                    break;
                case -1378921132:
                case 1921370002:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0873.m55680("᩺֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        iM55979 = C0946.m55979("᩷ۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13323) ^ (-1642854909);
                        i5 = -824782497;
                    }
                    break;
                case -1356631251:
                case 1400732010:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("֡᩷") ^ i2) * (-81);
                        i4 = ((iM55979 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        iM55979 = (C0873.m55680("۠ᩳ") ^ i2) * 53;
                        i4 = ((iM55979 ^ i3) * 9481) ^ (-1559259296);
                        i5 = -544252247;
                    }
                    break;
                case -1354815566:
                case 1351455478:
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("᩺᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 297) ^ 151758345;
                        i5 = 1107043907;
                    } else {
                        iM55979 = C0946.m55979("۬ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27457)) ^ (-1226184070);
                        i5 = 1209526669;
                    }
                    break;
                case -911968091:
                case -528270161:
                    C0947.m55997();
                    if (RunnableC0871.f81839 < 0) {
                        iM55979 = C0873.m55680("᩺֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        iM55979 = C0946.m55979("ۤ᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-3891)) ^ (-1820689869);
                        i5 = -1852943581;
                    }
                    break;
                case -607555994:
                case 1632560423:
                    C0949.m56012();
                    iM55979 = C0946.m55979("ۤ᩹") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-3891)) ^ (-1820689869);
                    i5 = -1852943581;
                    break;
                case -419714162:
                case 1389161694:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("ۤܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    } else {
                        iM55979 = C0873.m55680("ۗᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26305) ^ (-529192148);
                        i5 = 1579058955;
                    }
                    break;
                case -261853541:
                case 1929681992:
                    C0989.m56095();
                    C0930.m55885();
                    break;
                case 325969341:
                case 375068753:
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("᩺֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        iM55979 = C0946.m55979("ܳ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23371) ^ (-614459285);
                        i5 = 858183895;
                    }
                    break;
                case 386164735:
                case 1072997595:
                    if (C0845.m55584() <= 0) {
                        iM55979 = (C0946.m55979("֡᩷") ^ i2) * (-81);
                        i4 = ((iM55979 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        iM55979 = (C0873.m55680("᩸֫") + i2) * (-87);
                        i4 = ((iM55979 ^ i3) * (-9323)) ^ (-369906735);
                        i5 = 494537161;
                    }
                    break;
                case 429106337:
                case 1726768914:
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0946.m55979("᩺᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 297) ^ 151758345;
                        i5 = 1107043907;
                    } else {
                        iM55979 = C0946.m55979("ۤܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    }
                    break;
                case 494355411:
                case 1819801093:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ܰۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27125)) ^ 1424775467;
                        i5 = 848777590;
                    } else {
                        iM55979 = C0946.m55979("ۤܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    }
                    break;
                case 636315688:
                case 1972027538:
                    break;
                default:
                    if (C0955.m56025()) {
                        iM55979 = (C0946.m55979("֡᩷") ^ i2) * (-81);
                        i4 = ((iM55979 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        iM55979 = (C0873.m55680("᩻ۘ") + i2) * 89;
                        i4 = ((iM55979 ^ i3) * (-8959)) ^ 1591797900;
                        i5 = 2123620508;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.ViewTreeObserver] */
    /* JADX WARN: Type inference failed for: r1v45, types: [l.᩶֡᩷] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ۙ֡᩷] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public C7800(Main main) {
        boolean z;
        int iM55680;
        int i;
        int i2;
        boolean z2;
        int iM55681;
        int i3;
        int i4;
        final C7800 c7800 = this;
        View decorView = null;
        AbstractC9381 abstractC9381M56294 = null;
        final InterfaceC14100 interfaceC14100 = null;
        boolean z3 = false;
        final PackageManager packageManager = null;
        final WeakReference weakReference = null;
        short[] sArr = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1005309266;
        int i8 = C1028.f81950;
        int i9 = C0930.f81879;
        short s = f82008[0];
        int i10 = (s * 2) + 1;
        int i11 = s + 1;
        int i12 = i10 - (i11 * i11) > 0 ? 1974 : 28724;
        int iM55979 = C0946.m55979("֫ۗ") ^ i8;
        int i13 = ((iM55979 ^ i9) * (-25813)) ^ (-988525604);
        int i14 = iM55979 ^ (-615350234);
        ?? r2 = 0;
        boolean z4 = false;
        while (true) {
            i7 = i14 ^ (i13 & (((i7 ^ i9) * 11889) >> 31));
            switch (i7) {
                case -2144782395:
                case 1287123558:
                    z = z3;
                    decorView = C0937.m55910(main).getDecorView();
                    if (!C0937.f81884) {
                        z2 = z4 ? 1 : 0;
                        int iM559710 = C0946.m55979("۠۟") ^ i9;
                        z3 = z;
                        z4 = z2;
                        i14 = iM559710 ^ 1374369648;
                        i13 = ((iM559710 ^ i8) * (-17165)) ^ 1288205239;
                        c7800 = this;
                    } else {
                        iM55680 = C0873.m55680("۟۠") ^ i9;
                        i = ((iM55680 ^ i8) * (-24253)) ^ 581166985;
                        i2 = -1922113609;
                        boolean z5 = z;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                        z3 = z5;
                    }
                    break;
                case -1767224755:
                case -369060245:
                    c7800.f20471 = z3;
                    return;
                case -1660115775:
                case 1649523580:
                    z = z3;
                    if (C0866.f81837 >= 0) {
                        int iM55682 = C0873.m55680("ۜܳ") ^ i8;
                        z3 = z;
                        z4 = z4 ? 1 : 0;
                        i14 = iM55682 ^ 1220631036;
                        i13 = ((iM55682 ^ i9) * (-31385)) ^ 1113201747;
                        r2 = 0;
                    } else {
                        r2 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: l.ۙ֡᩷
                            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                            public final void onWindowFocusChanged(boolean z6) {
                                C7800.m18060(this.f16696, z6);
                            }
                        };
                        c7800.f20468 = r2;
                        z4 = true;
                        z4 = true;
                        if (C1053.m56327() >= 0) {
                            int iM55683 = C0873.m55680("᩶ۗ") ^ i9;
                            z3 = z;
                            i14 = iM55683 ^ (-1324887266);
                            i13 = ((iM55683 ^ i8) * 19555) ^ (-549947688);
                            r2 = r2;
                        } else {
                            int iM55684 = C0873.m55680("᩷᩵") ^ i8;
                            z3 = z;
                            i14 = iM55684 ^ 1155253716;
                            i13 = ((iM55684 ^ i9) * 25895) ^ (-383705830);
                            r2 = r2;
                        }
                    }
                    break;
                case -1644127280:
                case -587345970:
                    C1929.m56553();
                    if (C1036.m56257() > 0) {
                        z = z3;
                        int iM55685 = C0873.m55680("᩶ۗ") ^ i9;
                        z3 = z;
                        i14 = iM55685 ^ (-1324887266);
                        i13 = ((iM55685 ^ i8) * 19555) ^ (-549947688);
                        r2 = r2;
                    } else {
                        z = z3;
                        int iM55686 = C0873.m55680("ۜܳ") ^ i8;
                        z3 = z;
                        z4 = z4 ? 1 : 0;
                        i14 = iM55686 ^ 1220631036;
                        i13 = ((iM55686 ^ i9) * (-31385)) ^ 1113201747;
                        r2 = 0;
                    }
                    break;
                case -1546426976:
                case -46971521:
                    z = z3;
                    c7800.f20469 = decorView;
                    decorView.getViewTreeObserver().addOnWindowFocusChangeListener(r2);
                    if (C1024.m56209() >= 0) {
                        iM55680 = (C0946.m55979("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55680 ^ i9) * (-24831)) ^ 330365308;
                        i2 = -1629886662;
                    } else {
                        iM55680 = C0873.m55680("ۤܰ") ^ i9;
                        i = ((iM55680 ^ i8) * 28937) ^ (-157424388);
                        i2 = 1829662637;
                    }
                    boolean z6 = z;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    z3 = z6;
                    break;
                case -1480113777:
                case 2022750319:
                    z = z3;
                    sArr = f82008;
                    i5 = 1;
                    i6 = 3;
                    if (RunnableC0871.f81839 < 0) {
                        iM55680 = (C0946.m55979("ۤۢ") ^ i8) * (-95);
                        i = ((iM55680 ^ i9) * (-8077)) ^ (-1209210024);
                        i2 = -1962542587;
                        boolean z7 = z;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                        z3 = z7;
                    } else {
                        int iM55687 = C0873.m55680("᩶ۗ") ^ i9;
                        z3 = z;
                        i14 = iM55687 ^ (-1324887266);
                        i13 = ((iM55687 ^ i8) * 19555) ^ (-549947688);
                        r2 = r2;
                    }
                    break;
                case -1455807044:
                case 1135858327:
                    z = z3;
                    abstractC9381M56294 = C1046.m56294(main);
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0946.m55979("ۨ᩵") ^ i8;
                        i = ((iM55680 ^ i9) * 12347) ^ (-621374604);
                        i2 = -119987272;
                    } else {
                        iM55680 = C0946.m55979("ܳܽ") ^ i8;
                        i = ((iM55680 ^ i9) * (-18261)) ^ 625368250;
                        i2 = -1436587614;
                    }
                    boolean z8 = z;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    z3 = z8;
                    break;
                case -1443654131:
                case 1815408226:
                    C0873.m55676(C4081.f8987, new Runnable() { // from class: l.ۗ֡᩷
                        {
                            int i15 = -1140562290;
                            int i16 = C0992.f81922;
                            int i17 = C1071.f81975;
                            int iM559711 = C0946.m55979("ۨܰ") ^ i16;
                            int i18 = ((iM559711 ^ i17) * 2497) ^ 941329529;
                            int i19 = 2027775712;
                            while (true) {
                                i15 = ((((i15 ^ i17) * 9205) >> 31) & i18) ^ (iM559711 ^ i19);
                                switch (i15) {
                                    case -1799749057:
                                    case 635835572:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559711 = (C0946.m55979("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((iM559711 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            iM559711 = C0946.m55979("ܳ֡") ^ i16;
                                            i18 = ((iM559711 ^ i17) * 8735) ^ 1769923667;
                                            i19 = -1282632636;
                                        }
                                        break;
                                    case -1798322186:
                                    case 419133921:
                                        if (C1053.f81965 <= 0) {
                                            iM559711 = (C0946.m55979("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((iM559711 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            iM559711 = C0946.m55979("ۛܰ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * 26783) ^ (-1432187322);
                                            i19 = 2066799363;
                                        }
                                        break;
                                    case -1787022760:
                                    case -1601756583:
                                        if (C0967.m56074()) {
                                            iM559711 = (C0946.m55979("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((iM559711 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            iM559711 = (C0873.m55680("ۨۧ") + i16) * (-27);
                                            i18 = ((iM559711 ^ i17) * (-10017)) ^ (-2130083554);
                                            i19 = -1940845041;
                                        }
                                        break;
                                    case -1703987570:
                                    case -445146:
                                        RunnableC1014.m56177();
                                        if (C1025.f81947 < 0) {
                                            iM559711 = C0946.m55979("ܺۤ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            iM559711 = C0946.m55979("֡ܺ") ^ i16;
                                            i18 = ((iM559711 ^ i17) * 17621) ^ (-1485101316);
                                            i19 = -1898301824;
                                        }
                                        break;
                                    case -1641025354:
                                    case -981178082:
                                        C1124.m56367();
                                        if (C0989.f81920 < 0) {
                                            iM559711 = C0946.m55979("ܺۤ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            iM559711 = (C0873.m55680("ܺۧ") ^ i16) * 77;
                                            i18 = ((iM559711 ^ i17) * 18833) ^ 1456215461;
                                            i19 = -1551347188;
                                        }
                                        break;
                                    case -1413868991:
                                    case 1207770826:
                                        if (C0930.f81879 <= 0) {
                                            iM559711 = C0946.m55979("ܺۤ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            iM559711 = C0946.m55979("۬۟") ^ i16;
                                            i18 = ((iM559711 ^ i17) * (-621)) ^ (-592829074);
                                            i19 = 2037289845;
                                        }
                                        break;
                                    case -1293850983:
                                    case -637126219:
                                        if (!C0947.f81895) {
                                            iM559711 = (C0873.m55680("᩺ۖ") + i17) * 67;
                                            i18 = ((iM559711 ^ i16) * 30883) ^ (-478798460);
                                            i19 = -604318926;
                                        } else {
                                            iM559711 = C0946.m55979("ܺۤ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        }
                                        break;
                                    case -443878456:
                                    case 1669008073:
                                        C0989.m56095();
                                        C0873.m55678();
                                        throw new RuntimeException();
                                    case -35469383:
                                    case 1603021114:
                                        if (C0894.f81854 >= 0) {
                                            iM559711 = C0946.m55979("֡ܺ") ^ i16;
                                            i18 = ((iM559711 ^ i17) * 17621) ^ (-1485101316);
                                            i19 = -1898301824;
                                        } else {
                                            iM559711 = C0873.m55680("ܿۖ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * 5255) ^ (-2122016774);
                                            i19 = -1308542072;
                                        }
                                        break;
                                    case -16923816:
                                    case 961890349:
                                        if (C1028.m56247() >= 0) {
                                            iM559711 = (C0946.m55979("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((iM559711 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            iM559711 = C0946.m55979("ۙᩴ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * 10461) ^ (-1514208446);
                                            i19 = 827869413;
                                        }
                                        break;
                                    case 326146795:
                                    case 1580071290:
                                        if (C0898.f81858 <= 0) {
                                            iM559711 = (C0946.m55979("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((iM559711 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            iM559711 = C0946.m55979("֨ܶ") ^ i16;
                                            i18 = ((iM559711 ^ i17) * 4929) ^ 1463607371;
                                            i19 = -722176173;
                                        }
                                        break;
                                    case 431627947:
                                    case 1569447542:
                                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                                            iM559711 = (C0873.m55680("᩺ۖ") + i17) * 67;
                                            i18 = ((iM559711 ^ i16) * 30883) ^ (-478798460);
                                            i19 = -604318926;
                                        } else {
                                            iM559711 = C0946.m55979("ۨۖ") ^ i16;
                                            i18 = ((iM559711 ^ i17) * (-73)) ^ (-1224674511);
                                            i19 = 272863911;
                                        }
                                        break;
                                    case 803140298:
                                    case 1938410400:
                                        RunnableC0938.m55938();
                                        iM559711 = C0946.m55979("֡ܺ") ^ i16;
                                        i18 = ((iM559711 ^ i17) * 17621) ^ (-1485101316);
                                        i19 = -1898301824;
                                        break;
                                    case 856180907:
                                    case 1374674031:
                                        if (RunnableC0871.m55672() >= 0) {
                                            iM559711 = C0946.m55979("ܺۤ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            iM559711 = C0946.m55979("ۙۡ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * 27723) ^ 1604724611;
                                            i19 = -1929308247;
                                        }
                                        break;
                                    case 1164164175:
                                    case 1670261444:
                                        if (C1046.f81962 <= 0) {
                                            iM559711 = (C0873.m55680("᩺ۖ") + i17) * 67;
                                            i18 = ((iM559711 ^ i16) * 30883) ^ (-478798460);
                                            i19 = -604318926;
                                        } else {
                                            iM559711 = (i17 - C0873.m55680("ۜۛ")) * 27;
                                            i18 = ((iM559711 ^ i16) * 4133) ^ 194861299;
                                            i19 = 649142128;
                                        }
                                        break;
                                    default:
                                        return;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC14100 interfaceC14101 = null;
                            PackageManager packageManager2 = null;
                            int i15 = -1599686091;
                            int i16 = C0930.f81879;
                            int i17 = C1071.f81975;
                            int iM559711 = C0946.m55979("ۤ᩺") ^ i16;
                            int i18 = ((iM559711 ^ i17) * (-5227)) ^ (-340710021);
                            int i19 = 1073703919;
                            while (true) {
                                i15 = ((((i15 ^ i17) * 28115) >> 31) & i18) ^ (iM559711 ^ i19);
                                switch (i15) {
                                    case -1791573041:
                                    case -1327506373:
                                        if (C1044.f81959 >= 0) {
                                            iM559711 = (C0946.m55979("᩻ܽ") ^ i16) * 91;
                                            i18 = ((iM559711 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            iM559711 = C0946.m55979("۬ܽ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * 30161) ^ (-1127704937);
                                            i19 = -496847692;
                                        }
                                        break;
                                    case -1746837543:
                                    case 921810460:
                                        int i20 = 0;
                                        if (C0845.f81821 < 0) {
                                            WeakReference weakReference2 = weakReference;
                                            if (C0912.f81867 > 0) {
                                                C0854.m55606(new RunnableC14505(i20, weakReference2));
                                            }
                                            iM559711 = C0873.m55680("ܿۡ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            iM559711 = (C0873.m55680("۟֡") + i16) * 87;
                                            i18 = ((iM559711 ^ i17) * (-2631)) ^ 2081692676;
                                            i19 = 218072162;
                                        }
                                        break;
                                    case -1569634072:
                                    case 1192923563:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM559711 = (C0873.m55680("ᩴۚ") + i17) * 33;
                                            i18 = ((iM559711 ^ i16) * (-6439)) ^ 1236014622;
                                            i19 = -833032995;
                                        } else {
                                            iM559711 = (i16 - C0946.m55979("ۜᩴ")) * 87;
                                            i18 = ((iM559711 ^ i17) * (-19619)) ^ 1723125342;
                                            i19 = 1389679945;
                                        }
                                        break;
                                    case -1508514447:
                                    case -920242674:
                                        if (C0947.m55997()) {
                                            iM559711 = C0873.m55680("ܿۡ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            iM559711 = (C0946.m55979("ܽ֨") + i16) * (-69);
                                            i18 = ((iM559711 ^ i17) * (-26041)) ^ (-1193769879);
                                            i19 = 1420769499;
                                        }
                                        break;
                                    case -1383420468:
                                    case 1805798045:
                                        if (C0877.f81843 >= 0) {
                                            iM559711 = (C0873.m55680("۟֡") + i16) * 87;
                                            i18 = ((iM559711 ^ i17) * (-2631)) ^ 2081692676;
                                            i19 = 218072162;
                                        } else {
                                            iM559711 = (C0873.m55680("ᩴۚ") + i17) * 33;
                                            i18 = ((iM559711 ^ i16) * (-6439)) ^ 1236014622;
                                            i19 = -833032995;
                                        }
                                        break;
                                    case -1071483557:
                                    case -884074980:
                                        if (C0917.f81868) {
                                            iM559711 = C0873.m55680("ܿۡ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            iM559711 = C0873.m55680("۫ܿ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * (-26817)) ^ (-1909980536);
                                            i19 = 774158761;
                                        }
                                        break;
                                    case -992364635:
                                    case 8089765:
                                        if (C0854.m55595() >= 0) {
                                            iM559711 = (C0873.m55680("۟֡") + i16) * 87;
                                            i18 = ((iM559711 ^ i17) * (-2631)) ^ 2081692676;
                                            i19 = 218072162;
                                        } else {
                                            iM559711 = (C0946.m55979("ۙܿ") ^ i17) * 57;
                                            i18 = ((iM559711 ^ i16) * 27435) ^ 1034210399;
                                            i19 = 1451367064;
                                        }
                                        break;
                                    case -971998593:
                                    case -439506978:
                                        C1194.m56396();
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM559711 = (C0946.m55979("᩻ܽ") ^ i16) * 91;
                                            i18 = ((iM559711 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            iM559711 = C0873.m55680("ۜܺ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * 9221) ^ (-931627047);
                                            i19 = -1959679790;
                                        }
                                        break;
                                    case -955551975:
                                    case 533608810:
                                        if (C0877.f81843 >= 0) {
                                            iM559711 = C0873.m55680("ۜܺ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * 9221) ^ (-931627047);
                                            i19 = -1959679790;
                                        } else {
                                            iM559711 = (C0873.m55680("ᩴۚ") + i17) * 33;
                                            i18 = ((iM559711 ^ i16) * (-6439)) ^ 1236014622;
                                            i19 = -833032995;
                                        }
                                        break;
                                    case -576891989:
                                    case 144685789:
                                        if (C1003.f81929 <= 0) {
                                            iM559711 = (C0946.m55979("᩻ܽ") ^ i16) * 91;
                                            i18 = ((iM559711 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            iM559711 = C0946.m55979("֨֡") ^ i16;
                                            i18 = ((iM559711 ^ i17) * (-23521)) ^ 689361746;
                                            i19 = 1772569764;
                                        }
                                        break;
                                    case -572671276:
                                    case 289602063:
                                        interfaceC14101 = interfaceC14100;
                                        if (C1124.f82007 >= 0) {
                                            iM559711 = (C0946.m55979("᩻ܽ") ^ i16) * 91;
                                            i18 = ((iM559711 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            iM559711 = C0873.m55680("ۙۢ") ^ i16;
                                            i18 = ((iM559711 ^ i17) * (-16125)) ^ (-1087544890);
                                            i19 = 1885557081;
                                        }
                                        break;
                                    case -447767578:
                                    case -296152118:
                                        C1003.m56123();
                                        C0946.m55980();
                                        iM559711 = (C0873.m55680("ᩴۚ") + i17) * 33;
                                        i18 = ((iM559711 ^ i16) * (-6439)) ^ 1236014622;
                                        i19 = -833032995;
                                        break;
                                    case -223775724:
                                    case 840544096:
                                        packageManager2 = packageManager;
                                        iM559711 = (i16 - C0946.m55979("ܶۘ")) * 75;
                                        i18 = ((iM559711 ^ i17) * 12545) ^ 123152555;
                                        i19 = 561160130;
                                        break;
                                    case 821732027:
                                    case 1187775925:
                                        C0854.m55595();
                                        break;
                                    case 1591667590:
                                    case 1687945501:
                                        if (C1229.f82066 >= 0) {
                                            iM559711 = C0873.m55680("ܿۡ") ^ i17;
                                            i18 = ((iM559711 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            iM559711 = (i17 - C0946.m55979("ܳۡ")) * 35;
                                            i18 = ((iM559711 ^ i16) * (-15767)) ^ (-1970001433);
                                            i19 = -2132928950;
                                        }
                                        break;
                                    default:
                                        try {
                                            C7800.m18061(interfaceC14101, packageManager2);
                                            break;
                                        } catch (RuntimeException unused) {
                                        }
                                        iM559711 = (C0946.m55979("ᩳۗ") + i17) * (-33);
                                        i18 = ((iM559711 ^ i16) * (-2619)) ^ (-1879681929);
                                        i19 = 934020064;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    return;
                case -1114931633:
                case 225583398:
                    z = z3;
                    boolean z9 = z4 ? 1 : 0;
                    c7800.f20467 = new Runnable() { // from class: l.᩶֡᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7800.m18059(this.f66695);
                        }
                    };
                    z2 = z9;
                    if (C0946.f81894 != 0) {
                        int iM559711 = C0946.m55979("۠۟") ^ i9;
                        z3 = z;
                        z4 = z2;
                        i14 = iM559711 ^ 1374369648;
                        i13 = ((iM559711 ^ i8) * (-17165)) ^ 1288205239;
                    } else {
                        int iM55688 = (C0873.m55680("۫֨") ^ i9) * (-85);
                        i13 = ((iM55688 ^ i8) * 20361) ^ (-53201599);
                        z3 = z;
                        z4 = z9 ? 1 : 0;
                        i14 = iM55688 ^ 414075781;
                    }
                    c7800 = this;
                    break;
                case -863582419:
                case -381938108:
                    z = z3;
                    abstractC9381M56294.mo21806(c7800);
                    interfaceC14100 = ApplicationC21448.f67649;
                    if (!C0955.f81898) {
                        iM55680 = C0873.m55680("ܰܶ") ^ i9;
                        i = ((iM55680 ^ i8) * (-1721)) ^ (-1927536077);
                        i2 = -1988442497;
                        boolean z10 = z;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                        z3 = z10;
                    } else {
                        int iM55689 = C0873.m55680("᩶ۗ") ^ i9;
                        z3 = z;
                        i14 = iM55689 ^ (-1324887266);
                        i13 = ((iM55689 ^ i8) * 19555) ^ (-549947688);
                        r2 = r2;
                    }
                    break;
                case -724231990:
                case 2136378745:
                    ServiceConnectionC1013.m56157();
                    if (C1017.f81942 >= 0) {
                        z = z3;
                        iM55680 = C0946.m55979("ۨ᩵") ^ i8;
                        i = ((iM55680 ^ i9) * 12347) ^ (-621374604);
                        i2 = -119987272;
                        boolean z11 = z;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                        z3 = z11;
                    }
                    z = z3;
                    iM55680 = (C0946.m55979("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM55680 ^ i9) * (-24831)) ^ 330365308;
                    i2 = -1629886662;
                    boolean z12 = z;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    z3 = z12;
                    break;
                case -455787761:
                case -41078557:
                    packageManager = main.getApplicationContext().getPackageManager();
                    weakReference = new WeakReference(c7800);
                    if (RunnableC0871.f81839 >= 0) {
                        z = z3;
                        iM55680 = (C0946.m55979("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55680 ^ i9) * (-24831)) ^ 330365308;
                        i2 = -1629886662;
                    } else {
                        iM55680 = C0946.m55979("۫ۢ") ^ i9;
                        z = z3;
                        i = ((iM55680 ^ i8) * (-24809)) ^ (-2059184525);
                        i2 = 1116295875;
                    }
                    boolean z13 = z;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    z3 = z13;
                    break;
                case -205826495:
                case 773376718:
                    C0854.m55595();
                    C1229.m56410();
                    throw new RuntimeException();
                case 66893293:
                case 410320560:
                    AbstractC0942.m55971();
                    z = z3;
                    int iM556810 = C0873.m55680("ۜܳ") ^ i8;
                    z3 = z;
                    z4 = z4 ? 1 : 0;
                    i14 = iM556810 ^ 1220631036;
                    i13 = ((iM556810 ^ i9) * (-31385)) ^ 1113201747;
                    r2 = 0;
                    break;
                case 412381134:
                case 570541039:
                    z = z3;
                    boolean z14 = z4 ? 1 : 0;
                    c7800.f20466 = z14 ? 1 : 0;
                    c7800.f20471 = z14;
                    c7800.f20470 = main;
                    if (RunnableC0871.f81839 >= 0) {
                        z2 = z14 ? 1 : 0;
                        int iM559712 = C0946.m55979("۠۟") ^ i9;
                        z3 = z;
                        z4 = z2;
                        i14 = iM559712 ^ 1374369648;
                        i13 = ((iM559712 ^ i8) * (-17165)) ^ 1288205239;
                        c7800 = this;
                    } else {
                        int iM556811 = (C0873.m55680("ᩳܶ") + i8) * (-17);
                        i13 = ((iM556811 ^ i9) * (-16215)) ^ (-2098167267);
                        z3 = z;
                        i14 = iM556811 ^ (-1418588995);
                        z4 = z14 ? 1 : 0;
                    }
                    break;
                case 1581523070:
                case 1925081969:
                    if (interfaceC14100.getInt(C0912.m55822(sArr, i5, i6, i12), 0) != 0) {
                        iM55681 = C0946.m55979("۫ۨ") ^ i9;
                        i3 = ((iM55681 ^ i8) * 11019) ^ 1844790652;
                        i4 = -1206389018;
                    } else {
                        iM55681 = C0873.m55680("ܳۖ") ^ i8;
                        i3 = ((iM55681 ^ i9) * 21967) ^ 454800924;
                        i4 = -2113104407;
                    }
                    i14 = iM55681 ^ i4;
                    i13 = i3;
                    z3 = false;
                    break;
                default:
                    RunnableC0938.m55938();
                    if (!C0882.f81846) {
                        z = z3;
                        iM55680 = (C0946.m55979("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55680 ^ i9) * (-24831)) ^ 330365308;
                        i2 = -1629886662;
                        boolean z15 = z;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                        z3 = z15;
                    } else {
                        z = z3;
                        int iM556812 = C0873.m55680("ۜܳ") ^ i8;
                        z3 = z;
                        z4 = z4 ? 1 : 0;
                        i14 = iM556812 ^ 1220631036;
                        i13 = ((iM556812 ^ i9) * (-31385)) ^ 1113201747;
                        r2 = 0;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18058(WeakReference weakReference) {
        Object obj = null;
        C7800 c7800 = null;
        int i = -2000704342;
        int i2 = C0845.f81821;
        int i3 = RunnableC0871.f81839;
        int iM55680 = C0873.m55680("۬۫") ^ i2;
        int i4 = ((iM55680 ^ i3) * 161) ^ 40236585;
        int i5 = 1705432381;
        while (true) {
            i = ((((i ^ i3) * (-16295)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2031252785:
                case 827416415:
                    c7800 = (C7800) obj;
                    if (c7800 != null) {
                        iM55680 = (C0946.m55979("ۘۢ") + i3) * (-21);
                        i4 = ((iM55680 ^ i2) * (-5171)) ^ (-627900262);
                        i5 = 1652395052;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۘۨ")) * (-39);
                        i4 = ((iM55680 ^ i3) * 7665) ^ (-212268125);
                        i5 = -1719401703;
                    }
                    break;
                case -1824225956:
                case 309032148:
                    RunnableC0938.m55938();
                    break;
                case -1732003107:
                case 1010795263:
                    c7800.f20471 = false;
                    c7800.m18064();
                    iM55680 = (i2 - C0873.m55680("ۘۨ")) * (-39);
                    i4 = ((iM55680 ^ i3) * 7665) ^ (-212268125);
                    i5 = -1719401703;
                    break;
                case -1727851255:
                case 1528882011:
                    obj = weakReference.get();
                    if (C0845.m55584() <= 0) {
                        iM55680 = (C0873.m55680("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        iM55680 = C0873.m55680("֫ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13939)) ^ (-1282692664);
                        i5 = -1996300688;
                    }
                    break;
                case -926361227:
                case 782982414:
                    C0937.m55918();
                    iM55680 = (i2 - C0946.m55979("᩹ܽ")) * 9;
                    i4 = ((iM55680 ^ i3) * (-13715)) ^ (-523961608);
                    i5 = -203712437;
                    break;
                case -532931347:
                case 1328101629:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = (C0873.m55680("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        iM55680 = (C0873.m55680("ܺۜ") + i2) * 61;
                        i4 = ((iM55680 ^ i3) * (-25845)) ^ 425916125;
                        i5 = 122238123;
                    }
                    break;
                case -474049578:
                case 1794178700:
                    if (C1964.f83032 > 0) {
                        iM55680 = C0873.m55680("ۢᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4125) ^ 1982329612;
                        i5 = -423915595;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩶ܰ")) * (-13);
                        i4 = ((iM55680 ^ i2) * (-28589)) ^ 1757821239;
                        i5 = 16077889;
                    }
                    break;
                case -87459729:
                case 1390522843:
                    if (C1964.m56597() != 0) {
                        iM55680 = (i2 - C0946.m55979("᩹ܽ")) * 9;
                        i4 = ((iM55680 ^ i3) * (-13715)) ^ (-523961608);
                        i5 = -203712437;
                    } else {
                        iM55680 = (C0873.m55680("᩺۫") ^ i2) * (-119);
                        i4 = ((iM55680 ^ i3) * (-2305)) ^ 414817103;
                        i5 = 1049941404;
                    }
                    break;
                case -82141856:
                case 2035716691:
                    if (C1964.m56597() != 0) {
                        iM55680 = C0873.m55680("ۢᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4125) ^ 1982329612;
                        i5 = -423915595;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩷ۘ")) * (-127);
                        i4 = ((iM55680 ^ i2) * 29137) ^ 121724669;
                        i5 = -670508410;
                    }
                    break;
                case -77443764:
                case 1908007646:
                    if (C0917.m55854()) {
                        iM55680 = (i2 - C0946.m55979("ܺ᩸")) * (-29);
                        i4 = ((iM55680 ^ i3) * 15131) ^ (-132799412);
                        i5 = 864665372;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩹ܽ")) * 9;
                        i4 = ((iM55680 ^ i3) * (-13715)) ^ (-523961608);
                        i5 = -203712437;
                    }
                    break;
                case 2620653:
                case 457464216:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0873.m55680("ᩳ᩷") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i3) * 10563) ^ 1570272178;
                        i5 = 1362034421;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ᩴܺ")) * 19;
                        i4 = ((iM55680 ^ i2) * 22297) ^ (-1945940336);
                        i5 = -1924493530;
                    }
                    break;
                case 71065917:
                case 885508626:
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0873.m55680("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        iM55680 = C0873.m55680("᩶ܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26765) ^ 2144120535;
                        i5 = -398383604;
                    }
                    break;
                case 284792634:
                case 865743743:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0873.m55680("ᩳ᩷") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i3) * 10563) ^ 1570272178;
                        i5 = 1362034421;
                    } else {
                        iM55680 = C0873.m55680("ܺ᩹") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-32717)) ^ 1041417108;
                        i5 = -58582055;
                    }
                    break;
                case 461236762:
                case 1101804117:
                    break;
                case 565616448:
                case 702007310:
                    if (C0890.f81849 == 0) {
                        iM55680 = (i3 - C0873.m55680("᩶ܰ")) * (-13);
                        i4 = ((iM55680 ^ i2) * (-28589)) ^ 1757821239;
                        i5 = 16077889;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩹ܽ")) * 9;
                        i4 = ((iM55680 ^ i3) * (-13715)) ^ (-523961608);
                        i5 = -203712437;
                    }
                    break;
                case 1168005096:
                case 1600522784:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (C0873.m55680("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        iM55680 = C0946.m55979("ܳۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 10661) ^ (-740469537);
                        i5 = 2051568003;
                    }
                    break;
                case 1428009946:
                case 2134941640:
                    C0989.m56095();
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0873.m55680("ᩳ᩷") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i3) * 10563) ^ 1570272178;
                        i5 = 1362034421;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩶ܰ")) * (-13);
                        i4 = ((iM55680 ^ i2) * (-28589)) ^ 1757821239;
                        i5 = 16077889;
                    }
                    break;
                default:
                    if (C1024.f81946) {
                        iM55680 = C0873.m55680("ۢᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4125) ^ 1982329612;
                        i5 = -423915595;
                    } else {
                        iM55680 = (C0873.m55680("᩺ۘ") + i3) * (-25);
                        i4 = ((iM55680 ^ i2) * (-22831)) ^ 920248323;
                        i5 = -1891260632;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18061(InterfaceC14100 interfaceC14100, PackageManager packageManager) {
        short s = f82008[20];
        int i = (s * s) + 283417225;
        int i2 = s + 16835;
        int i3 = (i2 * i2) - (i + i) > 0 ? 46292 : 60541;
        synchronized (f20463) {
            if (interfaceC14100.getInt(C0946.m55986(f82008, 21, 3, i3), 0) != 0) {
                return;
            }
            int i4 = 1;
            try {
                packageManager.getApplicationInfo(C0967.m56077(f82008, 24, 19, i3), 0);
                if (m18062(packageManager, C1024.m56203(f82008, 43, 32, i3)) || m18062(packageManager, C0912.m55822(f82008, 78, 28, i3))) {
                    i4 = 2;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            C1194.m56383(ViewOnClickListenerC0939.m55950(interfaceC14100).mo27875(i4, C1124.m56373(f82008, 75, 3, i3)));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m18064() {
        View view = null;
        RunnableC21212 runnableC21212 = null;
        int i = 1531537474;
        int i2 = RunnableC1014.f81941;
        int i3 = C1044.f81959;
        int iM55680 = C0873.m55680("֫ۢ") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-26377)) ^ (-569681961);
        int i5 = -2145962093;
        while (true) {
            i = ((((i ^ i3) * (-23735)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2131345056:
                case 1748506267:
                    if (C1017.m56187() <= 0) {
                        iM55680 = (C0873.m55680("ܿۙ") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * 12189) ^ 1540243310;
                        i5 = 1698189462;
                    } else {
                        iM55680 = C0873.m55680("ܿۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 31689) ^ 494774842;
                        i5 = 90215782;
                    }
                    break;
                case -2107878238:
                case 1385982338:
                    RunnableC0938.m55938();
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("ܿۙ") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * 12189) ^ 1540243310;
                        i5 = 1698189462;
                    } else {
                        iM55680 = C0946.m55979("ۗ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 9275) ^ (-2070727306);
                        i5 = 386950962;
                    }
                    break;
                case -2026806202:
                case 1959129902:
                    if (C0854.f81826 != 0) {
                        iM55680 = (C0873.m55680("ܿۙ") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * 12189) ^ 1540243310;
                        i5 = 1698189462;
                    } else {
                        iM55680 = C0946.m55979("۠ܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 18573) ^ (-763575126);
                        i5 = 1553318771;
                    }
                    break;
                case -1989724782:
                case 1951399520:
                    break;
                case -1985767262:
                case -989639199:
                    C0930.m55885();
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0946.m55979("ۢܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    } else {
                        iM55680 = C0946.m55979("ۗ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 9275) ^ (-2070727306);
                        i5 = 386950962;
                    }
                    break;
                case -1622430717:
                case -614273919:
                    C0890.m55740();
                    break;
                case -1467482541:
                case -1174586066:
                    RunnableC1014.m56177();
                    iM55680 = C0946.m55979("ۗ۠") ^ i3;
                    i4 = ((iM55680 ^ i2) * 9275) ^ (-2070727306);
                    i5 = 386950962;
                    break;
                case -1236606084:
                case -202401930:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0946.m55979("ۢܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    } else {
                        iM55680 = C0873.m55680("ܺܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 30687) ^ (-1396151478);
                        i5 = 1909763971;
                    }
                    break;
                case -1058817412:
                case 229426356:
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("᩶۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 569) ^ 570748479;
                        i5 = -1528120475;
                    } else {
                        iM55680 = C0873.m55680("ۙۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 23433) ^ 362188148;
                        i5 = 164757524;
                    }
                    break;
                case -890258437:
                case 1430336183:
                    view.removeCallbacks(runnableC21212);
                    view.post(runnableC21212);
                    iM55680 = C0946.m55979("ܶܽ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-14369)) ^ (-428296964);
                    i5 = 20759181;
                    break;
                case -724693256:
                case 2016743100:
                    if (C0917.f81868) {
                        iM55680 = (C0946.m55979("۬᩹") ^ i3) * (-53);
                        i4 = ((iM55680 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۜ") ^ i3) * (-95);
                        i4 = ((iM55680 ^ i2) * 8835) ^ (-93071561);
                        i5 = 9245995;
                    }
                    break;
                case -636633636:
                case 1686814531:
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0946.m55979("۬᩹") ^ i3) * (-53);
                        i4 = ((iM55680 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        iM55680 = (C0946.m55979("ܳۢ") + i3) * (-25);
                        i4 = ((iM55680 ^ i2) * 24339) ^ 792440856;
                        i5 = 1709928842;
                    }
                    break;
                case -519529744:
                case 1155770849:
                    C0937.m55918();
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("᩶۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 569) ^ 570748479;
                        i5 = -1528120475;
                    } else {
                        iM55680 = C0946.m55979("ۢܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    }
                    break;
                case -503493463:
                case 1496599408:
                    if (this.f20465) {
                        iM55680 = C0946.m55979("ܶܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-14369)) ^ (-428296964);
                        i5 = 20759181;
                    } else {
                        iM55680 = C0873.m55680("ܿ᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10633)) ^ (-1261696193);
                        i5 = 197196892;
                    }
                    break;
                case 272532759:
                case 1325667689:
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0946.m55979("۬᩹") ^ i3) * (-53);
                        i4 = ((iM55680 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֡ۙ")) * 81;
                        i4 = ((iM55680 ^ i2) * (-7597)) ^ (-429429444);
                        i5 = 1483554760;
                    }
                    break;
                case 1262298595:
                case 2096790344:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("ۢܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    } else {
                        iM55680 = C0873.m55680("۠ܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23201)) ^ 15590709;
                        i5 = 1220048882;
                    }
                    break;
                case 1308939805:
                case 1781189357:
                    view = this.f20469;
                    runnableC21212 = this.f20467;
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0946.m55979("۬᩹") ^ i3) * (-53);
                        i4 = ((iM55680 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        iM55680 = C0873.m55680("᩵ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 22019) ^ 623874304;
                        i5 = -422014234;
                    }
                    break;
                default:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0946.m55979("۬᩹") ^ i3) * (-53);
                        i4 = ((iM55680 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        iM55680 = C0873.m55680("֫ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 19431) ^ (-1664267338);
                        i5 = -677341120;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x033a A[PHI: r5 r9 r10 r16 r17 r18 r19
      0x033a: PHI (r5v7 short[]) = (r5v3 short[]), (r5v2 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:77:0x0338, B:64:0x029f, B:48:0x01b6, B:10:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r9v7 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:77:0x0338, B:64:0x029f, B:48:0x01b6, B:10:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r10v7 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:77:0x0338, B:64:0x029f, B:48:0x01b6, B:10:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r16v36 int) = (r16v8 int), (r16v11 int), (r16v17 int), (r16v37 int) binds: [B:77:0x0338, B:64:0x029f, B:48:0x01b6, B:10:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r17v33 android.content.Intent) = 
      (r17v10 android.content.Intent)
      (r17v13 android.content.Intent)
      (r17v19 android.content.Intent)
      (r17v34 android.content.Intent)
     binds: [B:77:0x0338, B:64:0x029f, B:48:0x01b6, B:10:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r18v26 android.content.Intent) = 
      (r18v1 android.content.Intent)
      (r18v4 android.content.Intent)
      (r18v10 android.content.Intent)
      (r18v27 android.content.Intent)
     binds: [B:77:0x0338, B:64:0x029f, B:48:0x01b6, B:10:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r19v19 java.lang.String) = (r19v1 java.lang.String), (r19v4 java.lang.String), (r19v11 java.lang.String), (r19v20 java.lang.String) binds: [B:77:0x0338, B:64:0x029f, B:48:0x01b6, B:10:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0372 A[PHI: r6 r12 r16 r17 r18 r19
      0x0372: PHI (r6v4 char) = (r6v2 char), (r6v3 char), (r6v2 char) binds: [B:81:0x0370, B:73:0x030f, B:54:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x0372: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:81:0x0370, B:73:0x030f, B:54:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x0372: PHI (r16v16 int) = (r16v7 int), (r16v9 int), (r16v17 int) binds: [B:81:0x0370, B:73:0x030f, B:54:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x0372: PHI (r17v18 android.content.Intent) = (r17v9 android.content.Intent), (r17v11 android.content.Intent), (r17v19 android.content.Intent) binds: [B:81:0x0370, B:73:0x030f, B:54:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x0372: PHI (r18v9 android.content.Intent) = (r18v0 android.content.Intent), (r18v2 android.content.Intent), (r18v13 android.content.Intent) binds: [B:81:0x0370, B:73:0x030f, B:54:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x0372: PHI (r19v9 java.lang.String) = (r19v0 java.lang.String), (r19v2 java.lang.String), (r19v12 java.lang.String) binds: [B:81:0x0370, B:73:0x030f, B:54:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m18062(PackageManager packageManager, String str) {
        int iM55680;
        int i;
        int i2;
        int i3;
        int iM55979;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM55681;
        int i9;
        int i10;
        int i11;
        int i12 = C0877.f81843;
        int i13 = ServiceConnectionC1013.f81940;
        int iM559710 = (i12 - C0946.m55979("ۧܽ")) * 9;
        int i14 = ((iM559710 ^ i13) * (-25331)) ^ 1422155399;
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = iM559710 ^ (-932612106);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -649194530;
        Iterator itM55925 = null;
        Intent intent = null;
        String strM56077 = null;
        Intent intent2 = null;
        while (true) {
            int i20 = i15 ^ (i14 & (((i19 ^ i13) * 27055) >> 31));
            switch (i20) {
                case -2044708840:
                case -891009899:
                    intent2 = intent2;
                    strM56077 = strM56077;
                    intent = intent;
                    i20 = i20;
                    s = sArr[c];
                    s2 = 78000;
                    if (!C0882.f81846) {
                        iM55979 = C0946.m55979("ᩳ֨") ^ i12;
                        i4 = ((iM55979 ^ i13) * (-4283)) ^ 1452566984;
                        i5 = 1879645781;
                        int i21 = iM55979 ^ i5;
                        i19 = i20;
                        intent = intent;
                        intent2 = intent2;
                        i15 = i21;
                        i14 = i4;
                        strM56077 = strM56077;
                    } else {
                        strM56077 = strM56077;
                        int iM559711 = (C0946.m55979("᩻֨") ^ i12) * 101;
                        i10 = ((iM559711 ^ i13) * 28415) ^ (-744369099);
                        i11 = iM559711 ^ 481526652;
                        i19 = i20;
                        intent2 = intent2;
                        i15 = i11;
                        i14 = i10;
                        intent = intent;
                    }
                    break;
                case -1953813299:
                case -29016611:
                    intent2 = intent2;
                    strM56077 = strM56077;
                    intent = intent;
                    i20 = i20;
                    i16 = s * s2;
                    i17 = s + 19500;
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("۬ۙ") ^ i13;
                        i4 = ((iM55979 ^ i12) * 14803) ^ (-682401035);
                        i5 = -1120694864;
                    } else {
                        iM55979 = C0873.m55680("۠ۤ") ^ i12;
                        i4 = ((iM55979 ^ i13) * (-2179)) ^ 1052181993;
                        i5 = -1058905545;
                    }
                    int i22 = iM55979 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i22;
                    i14 = i4;
                    strM56077 = strM56077;
                    break;
                case -1828548530:
                case -522931455:
                    i8 = i20;
                    intent = intent2.setPackage(strM56077);
                    if (C0947.f81895) {
                        iM55681 = C0873.m55680("۫ۗ") ^ i12;
                        i6 = ((iM55681 ^ i13) * 26757) ^ 222936209;
                        i9 = 1296506059;
                    } else {
                        iM55681 = (i13 - C0873.m55680("᩻ۛ")) * 61;
                        i6 = ((iM55681 ^ i12) * (-12491)) ^ 539498886;
                        i9 = -1383103086;
                    }
                    i7 = iM55681 ^ i9;
                    i19 = i8;
                    i15 = i7;
                    i14 = i6;
                    intent2 = intent2;
                    break;
                case -1818825995:
                case -606094494:
                    itM55925 = RunnableC0938.m55925(packageManager.queryIntentActivities(intent, 512));
                    int iM55682 = C0873.m55680("ۙܿ") ^ i12;
                    intent = intent;
                    i10 = ((iM55682 ^ i13) * 21407) ^ 1896945708;
                    i11 = iM55682 ^ (-1390786439);
                    i19 = i20;
                    i15 = i11;
                    i14 = i10;
                    intent = intent;
                    break;
                case -1624360406:
                case -401428624:
                    intent2 = intent2;
                    intent = intent;
                    i20 = i20;
                    strM56077 = C0967.m56077(sArr2, 133, 19, i18);
                    if (C0845.m55584() > 0) {
                        int iM55683 = C0873.m55680("ۨ۟") ^ i12;
                        i6 = ((iM55683 ^ i13) * (-11347)) ^ 650047069;
                        i7 = iM55683 ^ 1855682027;
                        i19 = i20;
                        intent = intent;
                        i15 = i7;
                        i14 = i6;
                        intent2 = intent2;
                    } else {
                        int iM559712 = (C0946.m55979("᩻֨") ^ i12) * 101;
                        i10 = ((iM559712 ^ i13) * 28415) ^ (-744369099);
                        i11 = iM559712 ^ 481526652;
                        i19 = i20;
                        intent2 = intent2;
                        i15 = i11;
                        i14 = i10;
                        intent = intent;
                    }
                    break;
                case -1460849266:
                case 890521636:
                    intent2 = intent2;
                    strM56077 = strM56077;
                    intent = intent;
                    i20 = i20;
                    sArr = f82008;
                    if (C1025.m56230()) {
                        iM55979 = C0873.m55680("۬ۙ") ^ i13;
                        i4 = ((iM55979 ^ i12) * 14803) ^ (-682401035);
                        i5 = -1120694864;
                    } else {
                        iM55979 = C0873.m55680("ۙᩳ") ^ i13;
                        i4 = ((iM55979 ^ i12) * (-24175)) ^ 1065531454;
                        i5 = 1378899864;
                    }
                    int i23 = iM55979 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i23;
                    i14 = i4;
                    strM56077 = strM56077;
                    break;
                case -1094235054:
                case 550483371:
                    intent2 = intent2;
                    strM56077 = strM56077;
                    intent = intent;
                    i20 = i20;
                    c = 'j';
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0873.m55680("᩶ۨ") + i13) * 127;
                        i4 = ((iM55979 ^ i12) * 7725) ^ 797377981;
                        i5 = -839280810;
                    } else {
                        iM55979 = C0946.m55979("᩵۟") ^ i13;
                        i4 = ((iM55979 ^ i12) * (-9993)) ^ (-1496470548);
                        i5 = 1792341602;
                    }
                    int i24 = iM55979 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i24;
                    i14 = i4;
                    strM56077 = strM56077;
                    break;
                case -1022829670:
                case -800189394:
                    C0861.m55626();
                    C1124.m56367();
                    intent2 = intent2;
                    strM56077 = strM56077;
                    intent = intent;
                    i20 = i20;
                    int iM55684 = (i13 - C0873.m55680("ۡۨ")) * 37;
                    i6 = ((iM55684 ^ i12) * 1537) ^ (-1079179950);
                    i7 = iM55684 ^ (-927271924);
                    i19 = i20;
                    intent = intent;
                    strM56077 = strM56077;
                    i15 = i7;
                    i14 = i6;
                    intent2 = intent2;
                    break;
                case -993375421:
                case -150187135:
                    C0949.m56012();
                    return false;
                case -928427031:
                case -189089587:
                    intent2 = intent2;
                    strM56077 = strM56077;
                    intent = intent;
                    i20 = i20;
                    if (C1025.m56230()) {
                        iM55979 = (C0873.m55680("᩶ۨ") + i13) * 127;
                        i4 = ((iM55979 ^ i12) * 7725) ^ 797377981;
                        i5 = -839280810;
                    } else {
                        iM55979 = C0946.m55979("ۛۖ") ^ i12;
                        i4 = ((iM55979 ^ i13) * (-4109)) ^ (-459766552);
                        i5 = -1151628958;
                    }
                    int i25 = iM55979 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i25;
                    i14 = i4;
                    strM56077 = strM56077;
                    break;
                case -902248318:
                case 1320002606:
                    intent2 = intent2;
                    strM56077 = strM56077;
                    intent = intent;
                    i20 = i20;
                    if (i16 - (i17 * i17) > 0) {
                        iM55979 = C0946.m55979("֫۠") ^ i12;
                        i4 = ((iM55979 ^ i13) * 10433) ^ (-1577221325);
                        i5 = 1573965440;
                    } else {
                        iM55979 = (C0873.m55680("۬ۗ") ^ i13) * (-43);
                        i4 = ((iM55979 ^ i12) * (-22077)) ^ (-521925723);
                        i5 = -587930917;
                    }
                    int i26 = iM55979 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i26;
                    i14 = i4;
                    strM56077 = strM56077;
                    break;
                case -744529400:
                case 1231581891:
                    i18 = 14474;
                    iM55979 = (i13 - C0946.m55979("ۙ᩹")) * 63;
                    i4 = ((iM55979 ^ i12) * 5115) ^ 482219243;
                    i5 = 1943067976;
                    int i27 = iM55979 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i27;
                    i14 = i4;
                    strM56077 = strM56077;
                    break;
                case -429592232:
                case 1371841965:
                    C1012.m56134();
                    if (C1012.m56134() > 0) {
                        i8 = i20;
                        iM55681 = C0873.m55680("۫ۗ") ^ i12;
                        i6 = ((iM55681 ^ i13) * 26757) ^ 222936209;
                        i9 = 1296506059;
                        i7 = iM55681 ^ i9;
                        i19 = i8;
                        i15 = i7;
                        i14 = i6;
                        intent2 = intent2;
                    }
                    intent2 = intent2;
                    strM56077 = strM56077;
                    intent = intent;
                    i20 = i20;
                    int iM55685 = (i13 - C0873.m55680("ۡۨ")) * 37;
                    i6 = ((iM55685 ^ i12) * 1537) ^ (-1079179950);
                    i7 = iM55685 ^ (-927271924);
                    i19 = i20;
                    intent = intent;
                    strM56077 = strM56077;
                    i15 = i7;
                    i14 = i6;
                    intent2 = intent2;
                    break;
                case -371802185:
                case -293035604:
                    i18 = 63439;
                    iM55979 = (i13 - C0946.m55979("ۙ᩹")) * 63;
                    i4 = ((iM55979 ^ i12) * 5115) ^ 482219243;
                    i5 = 1943067976;
                    int i28 = iM55979 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i28;
                    i14 = i4;
                    strM56077 = strM56077;
                    break;
                case -202975498:
                case 2078679393:
                    return false;
                case 129598716:
                case 259275212:
                    if (!((ResolveInfo) RunnableC0897.m55785(itM55925)).activityInfo.exported) {
                        int iM55686 = C0873.m55680("ۙܿ") ^ i12;
                        intent = intent;
                        i10 = ((iM55686 ^ i13) * 21407) ^ 1896945708;
                        i11 = iM55686 ^ (-1390786439);
                        i19 = i20;
                        i15 = i11;
                        i14 = i10;
                        intent = intent;
                    } else {
                        iM55680 = (C0873.m55680("ۚۡ") + i12) * 91;
                        i = i20;
                        i2 = ((iM55680 ^ i13) * (-30607)) ^ 415237065;
                        i3 = -487181457;
                        int i29 = i;
                        i15 = iM55680 ^ i3;
                        i14 = i2;
                        i19 = i29;
                    }
                    break;
                case 588937240:
                case 636562316:
                    intent2 = intent2;
                    intent = intent;
                    i20 = i20;
                    short[] sArr3 = f82008;
                    if (C1017.f81942 >= 0) {
                        strM56077 = strM56077;
                        iM55979 = C0873.m55680("۬ۙ") ^ i13;
                        i4 = ((iM55979 ^ i12) * 14803) ^ (-682401035);
                        i5 = -1120694864;
                        int i210 = iM55979 ^ i5;
                        i19 = i20;
                        intent = intent;
                        intent2 = intent2;
                        i15 = i210;
                        i14 = i4;
                    } else {
                        strM56077 = strM56077;
                        String strM55652 = C0866.m55652(sArr3, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 26, i18);
                        if (C0845.f81821 >= 0) {
                            int iM55687 = (i13 - C0873.m55680("ۡۨ")) * 37;
                            i6 = ((iM55687 ^ i12) * 1537) ^ (-1079179950);
                            i7 = iM55687 ^ (-927271924);
                            i19 = i20;
                            intent = intent;
                            strM56077 = strM56077;
                            i15 = i7;
                            i14 = i6;
                            intent2 = intent2;
                            break;
                        } else {
                            Intent intentAddCategory = new Intent(strM55652).addCategory(str);
                            sArr2 = f82008;
                            if (C0946.f81894 != 0) {
                                intent2 = intentAddCategory;
                                iM55979 = (C0873.m55680("᩶ۨ") + i13) * 127;
                                i4 = ((iM55979 ^ i12) * 7725) ^ 797377981;
                                i5 = -839280810;
                                int i211 = iM55979 ^ i5;
                                i19 = i20;
                                intent = intent;
                                intent2 = intent2;
                                i15 = i211;
                                i14 = i4;
                            } else {
                                int iM559713 = C0946.m55979("֨ܿ") ^ i13;
                                intent2 = intentAddCategory;
                                i14 = ((iM559713 ^ i12) * (-12569)) ^ 1710934476;
                                i19 = i20;
                                intent = intent;
                                i15 = iM559713 ^ 82177175;
                            }
                        }
                    }
                    strM56077 = strM56077;
                    break;
                case 819183097:
                case 951802796:
                    C1964.m56597();
                    if (C1194.m56396() > 0) {
                        intent2 = intent2;
                        strM56077 = strM56077;
                        intent = intent;
                        i20 = i20;
                        iM55979 = C0873.m55680("۬ۙ") ^ i13;
                        i4 = ((iM55979 ^ i12) * 14803) ^ (-682401035);
                        i5 = -1120694864;
                        int i212 = iM55979 ^ i5;
                        i19 = i20;
                        intent = intent;
                        intent2 = intent2;
                        i15 = i212;
                        i14 = i4;
                        strM56077 = strM56077;
                    } else {
                        intent2 = intent2;
                        strM56077 = strM56077;
                        intent = intent;
                        i20 = i20;
                        int iM55688 = (i13 - C0873.m55680("ۡۨ")) * 37;
                        i6 = ((iM55688 ^ i12) * 1537) ^ (-1079179950);
                        i7 = iM55688 ^ (-927271924);
                        i19 = i20;
                        intent = intent;
                        strM56077 = strM56077;
                        i15 = i7;
                        i14 = i6;
                        intent2 = intent2;
                    }
                    break;
                case 1566881544:
                case 2133566834:
                    if (!C1048.f81963) {
                        intent2 = intent2;
                        intent = intent;
                        i20 = i20;
                        int iM559714 = (C0946.m55979("᩻֨") ^ i12) * 101;
                        i10 = ((iM559714 ^ i13) * 28415) ^ (-744369099);
                        i11 = iM559714 ^ 481526652;
                        i19 = i20;
                        intent2 = intent2;
                        i15 = i11;
                        i14 = i10;
                        intent = intent;
                    } else {
                        intent2 = intent2;
                        strM56077 = strM56077;
                        intent = intent;
                        i20 = i20;
                        iM55979 = C0873.m55680("۬ۙ") ^ i13;
                        i4 = ((iM55979 ^ i12) * 14803) ^ (-682401035);
                        i5 = -1120694864;
                        int i213 = iM55979 ^ i5;
                        i19 = i20;
                        intent = intent;
                        intent2 = intent2;
                        i15 = i213;
                        i14 = i4;
                        strM56077 = strM56077;
                    }
                    break;
                case 1956252131:
                case 2031264790:
                    return true;
                default:
                    i = i20;
                    if (C0866.m55647(itM55925)) {
                        iM55680 = (i13 - C0946.m55979("ۨܶ")) * 11;
                        i2 = ((iM55680 ^ i12) * (-16723)) ^ (-830131073);
                        i3 = 568996026;
                    } else {
                        iM55680 = C0946.m55979("ۧۜ") ^ i12;
                        i2 = ((iM55680 ^ i13) * 15163) ^ (-1134582529);
                        i3 = -173414487;
                    }
                    int i214 = i;
                    i15 = iM55680 ^ i3;
                    i14 = i2;
                    i19 = i214;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final Runnable m18066() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -664418331;
        int i5 = C0877.f81843;
        int i6 = C1036.f81953;
        int iM55979 = (i5 - C0946.m55979("۠ܳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
        int i7 = ((iM55979 ^ i6) * 309) ^ (-40041346);
        int i8 = 1154238186;
        while (true) {
            i4 = ((((i4 ^ i6) * 18359) >> 31) & i7) ^ (iM55979 ^ i8);
            switch (i4) {
                case -1910061152:
                case 1029662202:
                    C1036.m56257();
                    iM55979 = (i6 - C0946.m55979("ᩳܺ")) * (-73);
                    i7 = ((iM55979 ^ i5) * (-9405)) ^ (-1765700054);
                    i8 = 687456289;
                    break;
                case -1742931113:
                case -1542105165:
                    if (!C0882.f81846) {
                        iM55979 = C0946.m55979("᩺᩹") ^ i5;
                        i7 = ((iM55979 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ᩳܺ")) * (-73);
                        i7 = ((iM55979 ^ i5) * (-9405)) ^ (-1765700054);
                        i8 = 687456289;
                    }
                    break;
                case -811627498:
                case -507711172:
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("᩺᩹") ^ i5;
                        i7 = ((iM55979 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        iM55979 = C0873.m55680("᩺ۨ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-8761)) ^ 589494789;
                        i8 = -1108778262;
                    }
                    break;
                case -664327314:
                case 755607207:
                    i2 = 1;
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("ᩳܰ") ^ i5) * 77;
                        i7 = ((iM55979 ^ i6) * (-29295)) ^ (-737178009);
                        i8 = 823336175;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ۖܽ")) * (-5);
                        i7 = ((iM55979 ^ i5) * (-2031)) ^ (-274940537);
                        i8 = -1543719094;
                    }
                    break;
                case -638654694:
                case 383193734:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("᩺᩹") ^ i5;
                        i7 = ((iM55979 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        iM55979 = (C0873.m55680("ܿ᩹") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM55979 ^ i5) * (-32693)) ^ 500043814;
                        i8 = 1836102725;
                    }
                    break;
                case -563593712:
                case 1695419424:
                    i3 = i + i2;
                    if (C0845.f81821 >= 0) {
                        iM55979 = (i6 - C0873.m55680("۟ᩳ")) * (-39);
                        i7 = ((iM55979 ^ i5) * 16191) ^ (-879956429);
                        i8 = -1944371879;
                    } else {
                        iM55979 = C0946.m55979("۟ܺ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 21283) ^ 1841211348;
                        i8 = -381221249;
                    }
                    break;
                case -555669502:
                case 506160250:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ܰۤ") ^ i6) * (-15);
                        i7 = ((iM55979 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        iM55979 = (C0873.m55680("ᩳᩳ") + i5) * (-11);
                        i7 = ((iM55979 ^ i6) * (-31739)) ^ 179520588;
                        i8 = -674231419;
                    }
                    break;
                case -379066259:
                case -34147857:
                    RunnableC1014.m56177();
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("ܰۤ") ^ i6) * (-15);
                        i7 = ((iM55979 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ᩳܺ")) * (-73);
                        i7 = ((iM55979 ^ i5) * (-9405)) ^ (-1765700054);
                        i8 = 687456289;
                    }
                    break;
                case -148040589:
                case 846886147:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ۚۨ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-29597)) ^ 204653880;
                        i8 = 123669607;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ᩳܺ")) * (-73);
                        i7 = ((iM55979 ^ i5) * (-9405)) ^ (-1765700054);
                        i8 = 687456289;
                    }
                    break;
                case 48218627:
                case 1126068564:
                    C1229.m56410();
                    return null;
                case 540855020:
                case 900040996:
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0873.m55680("ܰۤ") ^ i6) * (-15);
                        i7 = ((iM55979 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        iM55979 = C0873.m55680("۠ܺ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-6819)) ^ (-766779236);
                        i8 = -1423361868;
                    }
                    break;
                case 866468697:
                case 1652881750:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ܰۤ") ^ i6) * (-15);
                        i7 = ((iM55979 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        iM55979 = (i6 - C0946.m55979("᩵۟")) * 5;
                        i7 = ((iM55979 ^ i5) * (-10503)) ^ (-241245165);
                        i8 = -1353305712;
                    }
                    break;
                case 1305133819:
                case 1420162477:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0873.m55680("ܰۤ") ^ i6) * (-15);
                        i7 = ((iM55979 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        iM55979 = C0946.m55979("ۢۘ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-32131)) ^ (-1017275594);
                        i8 = -1137331416;
                    }
                    break;
                case 1457866868:
                case 1728626777:
                    this.f20466 = i3;
                    return new RunnableC11824(this);
                case 1603440672:
                case 1863762831:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0873.m55680("ᩳܰ") ^ i5) * 77;
                        i7 = ((iM55979 ^ i6) * (-29295)) ^ (-737178009);
                        i8 = 823336175;
                    } else {
                        iM55979 = C0946.m55979("᩺᩹") ^ i5;
                        i7 = ((iM55979 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    }
                    break;
                default:
                    i = this.f20466;
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0946.m55979("᩺᩹") ^ i5;
                        i7 = ((iM55979 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        iM55979 = C0946.m55979("ۘܶ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-23379)) ^ 1452054658;
                        i8 = 1470178905;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18065() {
        int i = 0;
        int i2 = 0;
        int i3 = 1780370886;
        int i4 = C1044.f81959;
        int i5 = C1229.f82066;
        int iM55979 = C0946.m55979("᩵ۡ") ^ i4;
        int i6 = ((iM55979 ^ i5) * (-15399)) ^ (-1800380403);
        int i7 = -714445884;
        while (true) {
            i3 = ((((i3 ^ i5) * 27281) >> 31) & i6) ^ (iM55979 ^ i7);
            switch (i3) {
                case -2027908881:
                case -1899830817:
                    if (C1024.f81946) {
                        iM55979 = C0873.m55680("ᩴ᩸") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    } else {
                        iM55979 = (C0946.m55979("᩹ۘ") + i4) * 67;
                        i6 = ((iM55979 ^ i5) * (-30949)) ^ 365861244;
                        i7 = 1897816460;
                    }
                    break;
                case -1779431805:
                case -1045406647:
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("ᩴ᩸") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    } else {
                        iM55979 = (i5 - C0873.m55680("֡ۙ")) * (-19);
                        i6 = ((iM55979 ^ i4) * 2559) ^ 1610716585;
                        i7 = 169245861;
                    }
                    break;
                case -1523134444:
                case 739384368:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0946.m55979("֨᩹") ^ i5) * C0254q.f1218h;
                        i6 = ((iM55979 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    } else {
                        iM55979 = C0946.m55979("֡ᩳ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-27267)) ^ (-1438047479);
                        i7 = 1060301930;
                    }
                    break;
                case -1508035779:
                case 997642860:
                    C1025.m56230();
                    break;
                case -1320611832:
                case 1307653053:
                    if (C1194.f82045 != 0) {
                        iM55979 = (i5 - C0873.m55680("᩺ܺ")) * (-31);
                        i6 = ((iM55979 ^ i4) * (-10741)) ^ 1241398244;
                        i7 = -1363072812;
                    } else {
                        iM55979 = C0946.m55979("᩵᩵") ^ i4;
                        i6 = ((iM55979 ^ i5) * 5527) ^ 1581181453;
                        i7 = -1538636984;
                    }
                    break;
                case -1106571597:
                case 1964240785:
                    this.f20466 = i + i2;
                    m18064();
                    break;
                case -1053250074:
                case -148277974:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("᩷ۜ") ^ i5) * 33;
                        i6 = ((iM55979 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    } else {
                        iM55979 = C0946.m55979("֫۠") ^ i5;
                        i6 = ((iM55979 ^ i4) * 30049) ^ 818783612;
                        i7 = -914925028;
                    }
                    break;
                case -788313465:
                case 1027938618:
                    C1044.m56286();
                    iM55979 = (C0946.m55979("֨᩹") ^ i5) * C0254q.f1218h;
                    i6 = ((iM55979 ^ i4) * (-18507)) ^ (-2041892401);
                    i7 = -650053806;
                    break;
                case -620934989:
                case 1288437346:
                    C1194.m56396();
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0873.m55680("᩷ۜ") ^ i5) * 33;
                        i6 = ((iM55979 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    } else {
                        iM55979 = (i4 - C0946.m55979("᩶ۤ")) * (-11);
                        i6 = ((iM55979 ^ i5) * (-28415)) ^ (-1698992312);
                        i7 = 1009590037;
                    }
                    break;
                case -431910021:
                case 1941592363:
                    C0906.m55809();
                    if (!C0947.m55997()) {
                        iM55979 = (C0946.m55979("֨᩹") ^ i5) * C0254q.f1218h;
                        i6 = ((iM55979 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    } else {
                        iM55979 = C0873.m55680("ᩴ᩸") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    }
                    break;
                case -272728550:
                case 404019623:
                    C1229.m56410();
                    if (!C1025.m56230()) {
                        iM55979 = (C0946.m55979("֨᩹") ^ i5) * C0254q.f1218h;
                        i6 = ((iM55979 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۜ") ^ i5) * 33;
                        i6 = ((iM55979 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    }
                    break;
                case -172570696:
                case 937537037:
                    i2 = -1;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (i5 - C0873.m55680("᩺ܺ")) * (-31);
                        i6 = ((iM55979 ^ i4) * (-10741)) ^ 1241398244;
                        i7 = -1363072812;
                    } else {
                        iM55979 = (C0946.m55979("֨᩺") + i4) * 23;
                        i6 = ((iM55979 ^ i5) * (-31379)) ^ (-719787185);
                        i7 = -28593419;
                    }
                    break;
                case 464446612:
                case 1288027112:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ᩴ᩸") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    } else {
                        iM55979 = C0946.m55979("ۗ᩸") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-19901)) ^ 279130735;
                        i7 = -978662172;
                    }
                    break;
                case 933010479:
                case 1497830188:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (i5 - C0873.m55680("᩺ܺ")) * (-31);
                        i6 = ((iM55979 ^ i4) * (-10741)) ^ 1241398244;
                        i7 = -1363072812;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ۫") ^ i5) * (-101);
                        i6 = ((iM55979 ^ i4) * (-29661)) ^ (-1572986942);
                        i7 = 1057677821;
                    }
                    break;
                case 1710504824:
                case 2022123982:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("֨᩹") ^ i5) * C0254q.f1218h;
                        i6 = ((iM55979 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    } else {
                        iM55979 = C0946.m55979("ܽۜ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-11583)) ^ (-669997917);
                        i7 = -786635317;
                    }
                    break;
                default:
                    i = this.f20466;
                    if (C1194.f82045 != 0) {
                        iM55979 = (C0873.m55680("᩷ۜ") ^ i5) * 33;
                        i6 = ((iM55979 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    } else {
                        iM55979 = (C0873.m55680("ܿܺ") ^ i5) * 3;
                        i6 = ((iM55979 ^ i4) * (-1259)) ^ 1682517376;
                        i7 = 243172160;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ۧ */
    public final void mo8222(InterfaceC24784 interfaceC24784) {
        m18064();
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܽ */
    public final void mo8224(InterfaceC24784 interfaceC24784) {
        View view = null;
        int i = -538671467;
        int i2 = C1053.f81965;
        int i3 = C0898.f81858;
        int iM55979 = (i3 - C0946.m55979("ܺ֡")) * 25;
        int i4 = ((iM55979 ^ i2) * 19853) ^ 1956256893;
        int i5 = 1852708358;
        while (true) {
            i = ((((i ^ i2) * 21421) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2054470088:
                case 1992791479:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("ۨۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25533)) ^ 1950176769;
                        i5 = -1824823740;
                    } else {
                        iM55979 = C0873.m55680("ۨ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-18165)) ^ (-1226061810);
                        i5 = -854501417;
                    }
                    break;
                case -2048938420:
                case 1087570223:
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0873.m55680("ܺᩴ") + i2) * 77;
                        i4 = ((iM55979 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM55979 = C0946.m55979("ۢۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18203)) ^ 1465714789;
                        i5 = 2132518265;
                    }
                    break;
                case -1782264858:
                case 439846571:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("ܺᩴ") + i2) * 77;
                        i4 = ((iM55979 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM55979 = C0873.m55680("ۤۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12393) ^ 1362828384;
                        i5 = -1311263897;
                    }
                    break;
                case -1681932939:
                case -1044941825:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("۟ܶ") ^ i3) * (-65);
                        i4 = ((iM55979 ^ i2) * 14131) ^ 1958739787;
                        i5 = -1558128367;
                    } else {
                        iM55979 = C0873.m55680("ۜۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13585) ^ (-1820949018);
                        i5 = -1510919578;
                    }
                    break;
                case -1384780245:
                case -885694600:
                    view = this.f20469;
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0873.m55680("ۢۢ") + i2) * (-15);
                        i4 = ((iM55979 ^ i3) * (-25873)) ^ 1236766795;
                        i5 = -1419857135;
                    } else {
                        iM55979 = (C0946.m55979("۟۠") + i2) * 9;
                        i4 = ((iM55979 ^ i3) * 293) ^ 798601563;
                        i5 = 10670036;
                    }
                    break;
                case -1163902145:
                case 1908747551:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0873.m55680("ܺᩴ") + i2) * 77;
                        i4 = ((iM55979 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM55979 = C0946.m55979("ܽܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6191)) ^ 1005341855;
                        i5 = -912736132;
                    }
                    break;
                case -1055121386:
                case 2074390635:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("ܺᩴ") + i2) * 77;
                        i4 = ((iM55979 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM55979 = C0946.m55979("ۛ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-12109)) ^ 1356278408;
                        i5 = -361755387;
                    }
                    break;
                case -672669051:
                case -529820989:
                    view.removeCallbacks(this.f20467);
                    break;
                case -567476388:
                case 1397969335:
                    if (C0955.f81898) {
                        iM55979 = (C0873.m55680("۟ܶ") ^ i3) * (-65);
                        i4 = ((iM55979 ^ i2) * 14131) ^ 1958739787;
                        i5 = -1558128367;
                    } else {
                        iM55979 = C0946.m55979("᩸ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1237)) ^ (-289535181);
                        i5 = -1500618802;
                    }
                    break;
                case -125661443:
                case 804443108:
                    C1046.m56302();
                    if (!RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("ۨ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-18165)) ^ (-1226061810);
                        i5 = -854501417;
                    } else {
                        iM55979 = (C0873.m55680("ܰܳ") + i3) * (-51);
                        i4 = ((iM55979 ^ i2) * (-14327)) ^ (-492976067);
                        i5 = 479126599;
                    }
                    break;
                case -112357776:
                case 939951035:
                    C1025.m56230();
                    break;
                case 880228592:
                case 1969552720:
                    if (C0854.f81826 == 0) {
                        iM55979 = (C0873.m55680("ܺᩴ") + i2) * 77;
                        i4 = ((iM55979 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM55979 = C0873.m55680("ۨ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-18165)) ^ (-1226061810);
                        i5 = -854501417;
                    }
                    break;
                case 1121364306:
                case 1171398137:
                    C1044.m56286();
                    if (!C0861.f81831) {
                        iM55979 = (C0873.m55680("ܰܳ") + i3) * (-51);
                        i4 = ((iM55979 ^ i2) * (-14327)) ^ (-492976067);
                        i5 = 479126599;
                    } else {
                        iM55979 = (C0873.m55680("۟ܶ") ^ i3) * (-65);
                        i4 = ((iM55979 ^ i2) * 14131) ^ 1958739787;
                        i5 = -1558128367;
                    }
                    break;
                case 1225839368:
                case 2006941428:
                    if (C0861.f81831) {
                        iM55979 = C0946.m55979("֫᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15639) ^ (-1443731687);
                        i5 = -1583863582;
                    } else {
                        iM55979 = (C0873.m55680("ܰܳ") + i3) * (-51);
                        i4 = ((iM55979 ^ i2) * (-14327)) ^ (-492976067);
                        i5 = 479126599;
                    }
                    break;
                case 1359627464:
                case 1494729258:
                    C0937.m55918();
                    C0955.m56025();
                    iM55979 = C0873.m55680("ۨ᩷") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-18165)) ^ (-1226061810);
                    i5 = -854501417;
                    break;
                default:
                    if (C0989.m56095() <= 0) {
                        iM55979 = (C0873.m55680("ܺᩴ") + i2) * 77;
                        i4 = ((iM55979 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩺ۗ")) * (-69);
                        i4 = ((iM55979 ^ i3) * 16757) ^ 1592597462;
                        i5 = -1529546586;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e2 A[PHI: r7 r8
      0x00e2: PHI (r7v3 l.ܺ᩶ۘ) = (r7v2 l.ܺ᩶ۘ), (r7v1 l.ܺ᩶ۘ) binds: [B:30:0x00e0, B:16:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r8v3 java.lang.CharSequence) = (r8v2 java.lang.CharSequence), (r8v1 java.lang.CharSequence) binds: [B:30:0x00e0, B:16:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x017e A[PHI: r5 r6
      0x017e: PHI (r5v7 android.widget.TextView) = 
      (r5v1 android.widget.TextView)
      (r5v1 android.widget.TextView)
      (r5v4 android.widget.TextView)
      (r5v1 android.widget.TextView)
     binds: [B:125:0x017e, B:42:0x017c, B:34:0x0123, B:152:0x017e] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r6v5 android.content.Context) = 
      (r6v1 android.content.Context)
      (r6v1 android.content.Context)
      (r6v2 android.content.Context)
      (r6v1 android.content.Context)
     binds: [B:125:0x017e, B:42:0x017c, B:34:0x0123, B:152:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m18059(final C7800 c7800) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int iM55979;
        int i5;
        String str;
        int i6;
        int iM55682;
        int i7;
        int iM559710;
        int i8;
        int i9;
        String strM56386 = null;
        C20671 c20671 = null;
        TextView textView = null;
        Context contextM3845 = null;
        AbstractC17724 abstractC17724M49285 = null;
        CharSequence charSequenceM55673 = null;
        String strM55792 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1856776058;
        int i13 = C1071.f81975;
        int i14 = C0898.f81858;
        int iM559711 = (i14 - C0946.m55979("ܶۜ")) * 127;
        int i15 = ((iM559711 ^ i13) * 19829) ^ 709950266;
        int i16 = iM559711 ^ (-469005017);
        short[] sArr = null;
        short[] sArr2 = null;
        DialogInterface.OnClickListener onClickListener = null;
        int i17 = 0;
        int i18 = 0;
        short s = 0;
        short s2 = 0;
        Main main = null;
        int i19 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 28713) >> 31));
            switch (i12) {
                case -2134300241:
                case -312360340:
                    C0947.m55997();
                    C1046.m56302();
                    break;
                case -1980907171:
                case 1205605753:
                    C0877.m55696();
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0946.m55979("۬ᩳ") ^ i13;
                        i = ((iM55680 ^ i14) * (-28445)) ^ 1977427403;
                        i2 = -1070946423;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    } else {
                        strM56386 = strM56386;
                        sArr = sArr;
                        iM55681 = C0873.m55680("ۘ֨") ^ i14;
                        i3 = ((iM55681 ^ i13) * 18707) ^ (-234704230);
                        i4 = 1909763498;
                        i6 = iM55681 ^ i4;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    }
                    break;
                case -1965018080:
                case -1607149722:
                    break;
                case -1879225157:
                case -1329568863:
                    i10 = 60175;
                    iM55979 = (C0873.m55680("᩻֨") ^ i14) * (-69);
                    i3 = ((iM55979 ^ i13) * (-31533)) ^ 108164458;
                    i5 = -1815388190;
                    i6 = iM55979 ^ i5;
                    c20671 = c20671;
                    sArr2 = sArr2;
                    sArr = sArr;
                    str = strM56386;
                    i16 = i6;
                    i15 = i3;
                    strM56386 = str;
                    break;
                case -1706191069:
                case -352978870:
                    strM56386 = strM56386;
                    C0861.m55627(c20671, i19 ^ 2122831582);
                    sArr = f82008;
                    i11 = 11;
                    if (RunnableC0871.m55672() >= 0) {
                        iM55682 = C0873.m55680("ۡ᩸") ^ i13;
                        i3 = ((iM55682 ^ i14) * 27711) ^ (-107987638);
                        i7 = 1792724914;
                    } else {
                        iM55682 = (C0873.m55680("ܳۜ") + i14) * 45;
                        i3 = ((iM55682 ^ i13) * (-29337)) ^ 1636832685;
                        i7 = 1897052704;
                    }
                    i6 = iM55682 ^ i7;
                    str = strM56386;
                    i16 = i6;
                    i15 = i3;
                    strM56386 = str;
                    break;
                case -1676916243:
                case -1527129591:
                    sArr = sArr;
                    InterfaceC14100 interfaceC14100 = ApplicationC21448.f67649;
                    c20671 = c20671;
                    sArr2 = sArr2;
                    strM56386 = C1194.m56386(f82008, 5, 3, i10);
                    if (interfaceC14100.getInt(strM56386, 0) != 2) {
                        iM559710 = (C0873.m55680("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM559710 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                    } else {
                        iM559710 = C0946.m55979("ܺۛ") ^ i14;
                        i8 = ((iM559710 ^ i13) * (-4061)) ^ 1566668232;
                        i9 = 1871327048;
                    }
                    i16 = iM559710 ^ i9;
                    i15 = i8;
                    c20671 = c20671;
                    sArr2 = sArr2;
                    sArr = sArr;
                    break;
                case -1550152587:
                case -586808647:
                    strM56386 = strM56386;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c20671 = c20671;
                    s = f82008[4];
                    s2 = 25438;
                    if (C1003.f81929 > 0) {
                        iM55979 = C0946.m55979("᩸֫") ^ i14;
                        i3 = ((iM55979 ^ i13) * 13751) ^ (-545975960);
                        i5 = -847086195;
                        i6 = iM55979 ^ i5;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    } else {
                        c20671 = c20671;
                        sArr2 = sArr2;
                        iM55681 = C0873.m55680("ۘ֨") ^ i14;
                        i3 = ((iM55681 ^ i13) * 18707) ^ (-234704230);
                        i4 = 1909763498;
                        i6 = iM55681 ^ i4;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    }
                    break;
                case -1357588630:
                case -537768055:
                    DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
                    c7800.f20464 = dialogInterfaceC2564M46709;
                    dialogInterfaceC2564M46709.m3862();
                    if (!C0866.m55648(c7800.f20464)) {
                        sArr2 = sArr2;
                        sArr = sArr;
                        c20671 = c20671;
                        iM559710 = (C0873.m55680("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM559710 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM559710 ^ i9;
                        i15 = i8;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                    } else {
                        iM55680 = C0873.m55680("֨ܰ") ^ i14;
                        i = ((iM55680 ^ i13) * 32551) ^ (-723776507);
                        i2 = 241851249;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1293813965:
                case -989511562:
                    strM56386 = strM56386;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c20671 = c20671;
                    if ((s * s2) - ((s * s) + 161772961) <= 0) {
                        iM55979 = (i13 - C0873.m55680("ܽ᩺")) * (-27);
                        i3 = ((iM55979 ^ i14) * (-19131)) ^ 1520337294;
                        i5 = -1990825761;
                    } else {
                        iM55979 = (C0946.m55979("ۚۚ") + i13) * (-127);
                        i3 = ((iM55979 ^ i14) * 12219) ^ 124155394;
                        i5 = 2023741857;
                    }
                    i6 = iM55979 ^ i5;
                    c20671 = c20671;
                    sArr2 = sArr2;
                    sArr = sArr;
                    str = strM56386;
                    i16 = i6;
                    i15 = i3;
                    strM56386 = str;
                    break;
                case -1185493362:
                case 1281490629:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (i13 - C0873.m55680("֫ۘ")) * 37;
                        i = ((iM55680 ^ i14) * (-20375)) ^ 742863194;
                        i2 = 1827092509;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    } else {
                        sArr = sArr;
                        int iM55683 = (C0873.m55680("᩵ۛ") + i13) * 45;
                        i16 = iM55683 ^ 586565026;
                        i15 = ((iM55683 ^ i14) * (-16365)) ^ (-1948652623);
                        sArr = sArr;
                        onClickListener = null;
                    }
                    break;
                case -1071934202:
                case 1492248534:
                    C0906.m55817(c20671, C0946.m55979(strM55792) ^ 2121740138, null);
                    if (C0894.m55769() < 0) {
                        onClickListener = new DialogInterface.OnClickListener() { // from class: l.۫֡᩷
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i20) {
                                int i21 = 1489649976;
                                int i22 = C0989.f81920;
                                int i23 = RunnableC0871.f81839;
                                int iM559712 = C0946.m55979("ܳᩳ") ^ i23;
                                int i24 = ((iM559712 ^ i22) * 2925) ^ 981011907;
                                int i25 = -710820208;
                                while (true) {
                                    i21 = ((((i21 ^ i22) * (-11623)) >> 31) & i24) ^ (iM559712 ^ i25);
                                    switch (i21) {
                                        case -1950440195:
                                        case -1257584912:
                                            if (C0882.f81846) {
                                                iM559712 = C0873.m55680("ᩴ۠") ^ i22;
                                                i24 = ((iM559712 ^ i23) * (-32323)) ^ (-571310909);
                                                i25 = -1351207202;
                                            } else {
                                                iM559712 = (C0873.m55680("ᩳܶ") + i23) * 25;
                                                i24 = ((iM559712 ^ i22) * 18195) ^ (-332209792);
                                                i25 = -226438482;
                                            }
                                            break;
                                        case -1830307914:
                                        case -197813036:
                                            if (C1046.f81962 <= 0) {
                                                iM559712 = (C0946.m55979("ܳ᩶") + i23) * 17;
                                                i24 = ((iM559712 ^ i22) * 21001) ^ 424746921;
                                                i25 = -158386809;
                                            } else {
                                                iM559712 = (C0873.m55680("ܰ۟") + i22) * 123;
                                                i24 = ((iM559712 ^ i23) * (-9453)) ^ 815905786;
                                                i25 = 1133757791;
                                            }
                                            break;
                                        case -1794154231:
                                        case 1039634963:
                                            if (C1229.m56410() != 0) {
                                                iM559712 = C0946.m55979("ܽܺ") ^ i22;
                                                i24 = ((iM559712 ^ i23) * 31563) ^ 31319200;
                                                i25 = -1879291033;
                                            } else {
                                                iM559712 = C0873.m55680("۟ܰ") ^ i23;
                                                i24 = ((iM559712 ^ i22) * (-7221)) ^ (-1461162579);
                                                i25 = 1981267523;
                                            }
                                            break;
                                        case -1698076945:
                                        case 1921546465:
                                            C7800.m18063(this.f39092);
                                            break;
                                        case -1600456222:
                                        case 1515706021:
                                            if (C0930.f81879 > 0) {
                                                iM559712 = (C0946.m55979("ܳ᩶") + i23) * 17;
                                                i24 = ((iM559712 ^ i22) * 21001) ^ 424746921;
                                                i25 = -158386809;
                                            } else {
                                                iM559712 = (C0946.m55979("ۢۨ") + i22) * (-117);
                                                i24 = ((iM559712 ^ i23) * 11935) ^ (-1921245545);
                                                i25 = -1251694300;
                                            }
                                            break;
                                        case -1021394460:
                                        case 1281013919:
                                            if (C1024.m56209() >= 0) {
                                                iM559712 = C0873.m55680("ۤۗ") ^ i23;
                                                i24 = ((iM559712 ^ i22) * (-5357)) ^ 583281565;
                                                i25 = 1242207575;
                                            } else {
                                                iM559712 = (C0946.m55979("ۛ᩸") ^ i22) * (-21);
                                                i24 = ((iM559712 ^ i23) * (-6539)) ^ 1499380687;
                                                i25 = -641326755;
                                            }
                                            break;
                                        case -1013988217:
                                        case -739133813:
                                            C1071.m56343();
                                            if (C0989.f81920 >= 0) {
                                                iM559712 = C0873.m55680("ᩴ۠") ^ i22;
                                                i24 = ((iM559712 ^ i23) * (-32323)) ^ (-571310909);
                                                i25 = -1351207202;
                                            } else {
                                                iM559712 = (C0946.m55979("ۢۨ") + i22) * (-117);
                                                i24 = ((iM559712 ^ i23) * 11935) ^ (-1921245545);
                                                i25 = -1251694300;
                                            }
                                            break;
                                        case -1011683936:
                                        case -414394264:
                                            if (C1124.f82007 >= 0) {
                                                iM559712 = (C0946.m55979("ۢۨ") + i22) * (-117);
                                                i24 = ((iM559712 ^ i23) * 11935) ^ (-1921245545);
                                                i25 = -1251694300;
                                            } else {
                                                iM559712 = C0873.m55680("ۨܶ") ^ i23;
                                                i24 = ((iM559712 ^ i22) * 22923) ^ (-2023176848);
                                                i25 = 186422615;
                                            }
                                            break;
                                        case -817644555:
                                        case 1568731729:
                                            C1025.m56230();
                                            iM559712 = (C0946.m55979("ۢۨ") + i22) * (-117);
                                            i24 = ((iM559712 ^ i23) * 11935) ^ (-1921245545);
                                            i25 = -1251694300;
                                            break;
                                        case -694600191:
                                        case 393913356:
                                            if (C0882.f81846) {
                                                iM559712 = C0873.m55680("ᩴ۠") ^ i22;
                                                i24 = ((iM559712 ^ i23) * (-32323)) ^ (-571310909);
                                                i25 = -1351207202;
                                            } else {
                                                iM559712 = (i23 - C0873.m55680("ۢᩴ")) * 73;
                                                i24 = ((iM559712 ^ i22) * (-13585)) ^ 1634916265;
                                                i25 = 215805599;
                                            }
                                            break;
                                        case -660175533:
                                        case -269705763:
                                            if (C0967.f81910 >= 0) {
                                                iM559712 = C0873.m55680("ۤۗ") ^ i23;
                                                i24 = ((iM559712 ^ i22) * (-5357)) ^ 583281565;
                                                i25 = 1242207575;
                                            } else {
                                                iM559712 = C0946.m55979("᩸ܽ") ^ i22;
                                                i24 = ((iM559712 ^ i23) * (-17235)) ^ 1160815915;
                                                i25 = -1362319536;
                                            }
                                            break;
                                        case -464820070:
                                        case -843907:
                                            if (C0854.f81826 != 0) {
                                                iM559712 = C0946.m55979("ܽܺ") ^ i22;
                                                i24 = ((iM559712 ^ i23) * 31563) ^ 31319200;
                                                i25 = -1879291033;
                                            } else {
                                                iM559712 = C0873.m55680("ۗۛ") ^ i22;
                                                i24 = ((iM559712 ^ i23) * (-28263)) ^ 1612224626;
                                                i25 = -2018871150;
                                            }
                                            break;
                                        case -76780500:
                                        case 374197539:
                                            if (C0845.f81821 >= 0) {
                                                iM559712 = C0946.m55979("ܽܺ") ^ i22;
                                                i24 = ((iM559712 ^ i23) * 31563) ^ 31319200;
                                                i25 = -1879291033;
                                            } else {
                                                iM559712 = C0946.m55979("֫ۢ") ^ i22;
                                                i24 = ((iM559712 ^ i23) * (-71)) ^ 239833210;
                                                i25 = -497498100;
                                            }
                                            break;
                                        case -11346022:
                                        case 2061399661:
                                            C0877.m55696();
                                            if (C0866.f81837 < 0) {
                                                iM559712 = C0873.m55680("ۤۗ") ^ i23;
                                                i24 = ((iM559712 ^ i22) * (-5357)) ^ 583281565;
                                                i25 = 1242207575;
                                            } else {
                                                iM559712 = (C0946.m55979("ۢۨ") + i22) * (-117);
                                                i24 = ((iM559712 ^ i23) * 11935) ^ (-1921245545);
                                                i25 = -1251694300;
                                            }
                                            break;
                                        case 1137296859:
                                        case 2072511996:
                                            C1036.m56257();
                                            C0989.m56095();
                                            break;
                                        default:
                                            if (C0947.m55997()) {
                                                iM559712 = C0873.m55680("ᩴ۠") ^ i22;
                                                i24 = ((iM559712 ^ i23) * (-32323)) ^ (-571310909);
                                                i25 = -1351207202;
                                            } else {
                                                iM559712 = (i23 - C0946.m55979("ۤܳ")) * (-73);
                                                i24 = ((iM559712 ^ i22) * 9237) ^ (-173139253);
                                                i25 = -724442240;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        };
                        sArr2 = f82008;
                        i17 = 17;
                        i18 = 3;
                        if (C1124.f82007 < 0) {
                            iM55680 = C0873.m55680("ۛۖ") ^ i13;
                            i = ((iM55680 ^ i14) * 21031) ^ (-2042775892);
                            i2 = 1316846595;
                            i16 = iM55680 ^ i2;
                            i15 = i;
                        } else {
                            strM56386 = strM56386;
                            sArr = sArr;
                            iM55681 = C0873.m55680("ۘ֨") ^ i14;
                            i3 = ((iM55681 ^ i13) * 18707) ^ (-234704230);
                            i4 = 1909763498;
                            i6 = iM55681 ^ i4;
                            sArr = sArr;
                            str = strM56386;
                            i16 = i6;
                            i15 = i3;
                            strM56386 = str;
                        }
                    } else {
                        sArr = sArr;
                        int iM55684 = (C0873.m55680("᩵ۛ") + i13) * 45;
                        i16 = iM55684 ^ 586565026;
                        i15 = ((iM55684 ^ i14) * (-16365)) ^ (-1948652623);
                        sArr = sArr;
                        onClickListener = null;
                    }
                    break;
                case -906358971:
                case 1994435494:
                    strM56386 = strM56386;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c20671 = c20671;
                    if (!c7800.f20471) {
                        iM55979 = (C0873.m55680("ۙۛ") + i13) * 101;
                        i3 = ((iM55979 ^ i14) * (-31645)) ^ (-1265782647);
                        i5 = 956349292;
                        i6 = iM55979 ^ i5;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    } else {
                        strM56386 = strM56386;
                        iM559710 = (C0873.m55680("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM559710 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM559710 ^ i9;
                        i15 = i8;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                    }
                    break;
                case -726909039:
                case 1757837720:
                    C1124.m56374(c20671, C0873.m55680(C0912.m55822(sArr2, i17, i18, i10)) ^ 2102617499, onClickListener);
                    if (C0877.f81843 >= 0) {
                        iM55680 = (i13 - C0873.m55680("֫ۘ")) * 37;
                        i = ((iM55680 ^ i14) * (-20375)) ^ 742863194;
                        i2 = 1827092509;
                    } else {
                        iM55680 = (C0946.m55979("ܶ֨") ^ i14) * (-105);
                        i = ((iM55680 ^ i13) * (-18619)) ^ (-1974128403);
                        i2 = 778711068;
                    }
                    i16 = iM55680 ^ i2;
                    i15 = i;
                    break;
                case -609476676:
                case -492535589:
                    abstractC17724M49285.mo40282(textView, C0845.m55591(charSequenceM55673));
                    C0937.m55912(ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649).mo27875(3, strM56386));
                    sArr2 = sArr2;
                    sArr = sArr;
                    c20671 = c20671;
                    iM559710 = (C0873.m55680("֫ۤ") ^ i14) * (-7);
                    i8 = ((iM559710 ^ i13) * 16617) ^ (-356719753);
                    i9 = 1321145065;
                    i16 = iM559710 ^ i9;
                    i15 = i8;
                    c20671 = c20671;
                    sArr2 = sArr2;
                    sArr = sArr;
                    break;
                case -486011970:
                case 238160232:
                    strM56386 = strM56386;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c20671 = c20671;
                    if (!c7800.f20469.hasWindowFocus()) {
                        strM56386 = strM56386;
                        iM559710 = (C0873.m55680("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM559710 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM559710 ^ i9;
                        i15 = i8;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                    } else {
                        iM55979 = (C0873.m55680("᩺ᩳ") ^ i13) * (-109);
                        i3 = ((iM55979 ^ i14) * 26253) ^ (-536358157);
                        i5 = 526749974;
                        i6 = iM55979 ^ i5;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    }
                    break;
                case -426670002:
                case -214607672:
                    C1053.m56327();
                    if (C0992.f81922 >= 0) {
                        strM56386 = strM56386;
                        sArr = sArr;
                        iM55681 = C0873.m55680("ۘ֨") ^ i14;
                        i3 = ((iM55681 ^ i13) * 18707) ^ (-234704230);
                        i4 = 1909763498;
                        i6 = iM55681 ^ i4;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    } else {
                        sArr = sArr;
                        int iM55685 = (C0873.m55680("᩵ۛ") + i13) * 45;
                        i16 = iM55685 ^ 586565026;
                        i15 = ((iM55685 ^ i14) * (-16365)) ^ (-1948652623);
                        sArr = sArr;
                        onClickListener = null;
                    }
                    break;
                case -289904352:
                case 2035315634:
                    C1048.m56305();
                    sArr = sArr;
                    int iM55686 = (C0873.m55680("᩵ۛ") + i13) * 45;
                    i16 = iM55686 ^ 586565026;
                    i15 = ((iM55686 ^ i14) * (-16365)) ^ (-1948652623);
                    sArr = sArr;
                    onClickListener = null;
                    break;
                case -289041902:
                case -156554635:
                    strM56386 = strM56386;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c20671 = c20671;
                    if (!C1046.m56287(main)) {
                        iM55979 = (C0946.m55979("᩹ܳ") ^ i14) * (-7);
                        i3 = ((iM55979 ^ i13) * (-9067)) ^ (-1652384597);
                        i5 = -937044845;
                        i6 = iM55979 ^ i5;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    } else {
                        strM56386 = strM56386;
                        iM559710 = (C0873.m55680("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM559710 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM559710 ^ i9;
                        i15 = i8;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                    }
                    break;
                case -227113219:
                case 1663016912:
                    i10 = 22209;
                    iM55979 = (C0873.m55680("᩻֨") ^ i14) * (-69);
                    i3 = ((iM55979 ^ i13) * (-31533)) ^ 108164458;
                    i5 = -1815388190;
                    i6 = iM55979 ^ i5;
                    c20671 = c20671;
                    sArr2 = sArr2;
                    sArr = sArr;
                    str = strM56386;
                    i16 = i6;
                    i15 = i3;
                    strM56386 = str;
                    break;
                case -216893591:
                case 540335310:
                    strM55792 = C0898.m55792(f82008, 14, 3, i10);
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("ܶۧ") ^ i14;
                        i = ((iM55680 ^ i13) * 18993) ^ 994165201;
                        i2 = 400974165;
                    } else {
                        iM55680 = (i14 - C0946.m55979("۠֨")) * (-39);
                        i = ((iM55680 ^ i13) * 16003) ^ 266084752;
                        i2 = 1948233734;
                    }
                    i16 = iM55680 ^ i2;
                    i15 = i;
                    break;
                case -169085118:
                case 734516215:
                    if (C1003.m56123() == 0) {
                        iM55680 = C0946.m55979("۬ᩳ") ^ i13;
                        i = ((iM55680 ^ i14) * (-28445)) ^ 1977427403;
                        i2 = -1070946423;
                    } else {
                        iM55680 = C0946.m55979("᩵ܽ") ^ i14;
                        i = ((iM55680 ^ i13) * (-18157)) ^ 1166932228;
                        i2 = -2123694595;
                    }
                    i16 = iM55680 ^ i2;
                    i15 = i;
                    break;
                case -61771863:
                case 1903553862:
                    strM56386 = strM56386;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c20671 = c20671;
                    if (c7800.f20466 != 0) {
                        strM56386 = strM56386;
                        iM559710 = (C0873.m55680("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM559710 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM559710 ^ i9;
                        i15 = i8;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                    } else {
                        iM55979 = (C0946.m55979("ۗ֡") + i14) * (-73);
                        i3 = ((iM55979 ^ i13) * (-20353)) ^ 1656106533;
                        i5 = 2094933100;
                        i6 = iM55979 ^ i5;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    }
                    break;
                case -11250480:
                case 208178961:
                    strM56386 = strM56386;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c20671 = c20671;
                    if (!C1046.m56294(main).mo21805().m35142(EnumC15415.RESUMED)) {
                        strM56386 = strM56386;
                        iM559710 = (C0873.m55680("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM559710 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM559710 ^ i9;
                        i15 = i8;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                    } else {
                        iM55979 = C0946.m55979("۫ᩴ") ^ i13;
                        i3 = ((iM55979 ^ i14) * 30383) ^ 1463899161;
                        i5 = 680077121;
                        i6 = iM55979 ^ i5;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    }
                    break;
                case -2804296:
                case 423506676:
                    abstractC17724M49285 = C21852.m49285(contextM3845, true);
                    charSequenceM55673 = RunnableC0871.m55673(textView);
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("᩵ܽ") ^ i14;
                        i = ((iM55680 ^ i13) * (-18157)) ^ 1166932228;
                        i2 = -2123694595;
                    } else {
                        iM55680 = (C0873.m55680("ۢۛ") ^ i14) * 31;
                        i = ((iM55680 ^ i13) * (-22999)) ^ 1121215264;
                        i2 = -742736493;
                    }
                    i16 = iM55680 ^ i2;
                    i15 = i;
                    break;
                case 106389780:
                case 526549228:
                    C0898.m55800();
                    if (!C1929.m56553()) {
                        iM55680 = (i13 - C0873.m55680("֫ۘ")) * 37;
                        i = ((iM55680 ^ i14) * (-20375)) ^ 742863194;
                        i2 = 1827092509;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    } else {
                        strM56386 = strM56386;
                        iM55682 = C0873.m55680("ۡ᩸") ^ i13;
                        i3 = ((iM55682 ^ i14) * 27711) ^ (-107987638);
                        i7 = 1792724914;
                        i6 = iM55682 ^ i7;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    }
                    break;
                case 116320817:
                case 1372101300:
                    DialogInterfaceC2564 dialogInterfaceC2564 = c7800.f20464;
                    textView = (TextView) dialogInterfaceC2564.m3846(R.id.message);
                    contextM3845 = dialogInterfaceC2564.m3845();
                    if (C0949.m56012()) {
                        iM55680 = (i13 - C0873.m55680("֫ۘ")) * 37;
                        i = ((iM55680 ^ i14) * (-20375)) ^ 742863194;
                        i2 = 1827092509;
                    } else {
                        iM55680 = C0946.m55979("ۜ۟") ^ i13;
                        i = ((iM55680 ^ i14) * (-22699)) ^ (-1780317589);
                        i2 = -647089925;
                    }
                    i16 = iM55680 ^ i2;
                    i15 = i;
                    break;
                case 541533061:
                case 740785482:
                    strM56386 = strM56386;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c20671 = c20671;
                    Main main2 = c7800.f20470;
                    if (!c7800.f20465) {
                        int iM559712 = (C0946.m55979("᩵ۖ") + i13) * (-37);
                        main = main2;
                        i15 = ((iM559712 ^ i14) * (-31101)) ^ (-1049544422);
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM56386;
                        i16 = iM559712 ^ (-1348777890);
                        strM56386 = str;
                    } else {
                        main = main2;
                        strM56386 = strM56386;
                        iM559710 = (C0873.m55680("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM559710 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM559710 ^ i9;
                        i15 = i8;
                        c20671 = c20671;
                        sArr2 = sArr2;
                        sArr = sArr;
                    }
                    break;
                case 1690867570:
                case 1729023585:
                    strM56386 = strM56386;
                    sArr = sArr;
                    C20671 c20671M55654 = C0866.m55654(main);
                    int iM559713 = C0946.m55979(C1025.m56233(f82008, 8, 3, i10));
                    if (C0861.f81831) {
                        int iM559714 = (C0946.m55979("ܿ᩻") + i13) * 109;
                        sArr = sArr;
                        i19 = iM559713;
                        i15 = ((iM559714 ^ i14) * (-14285)) ^ (-1790632571);
                        c20671 = c20671M55654;
                        i16 = iM559714 ^ (-1801635098);
                        strM56386 = strM56386;
                    } else {
                        c20671 = c20671M55654;
                        i19 = iM559713;
                        iM55681 = C0873.m55680("ۘ֨") ^ i14;
                        i3 = ((iM55681 ^ i13) * 18707) ^ (-234704230);
                        i4 = 1909763498;
                        i6 = iM55681 ^ i4;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    }
                    break;
                default:
                    sArr = sArr;
                    C1194.m56390(c20671, C0873.m55680(C1929.m56558(sArr, i11, 3, i10)) ^ 2129483383);
                    if (!C0882.f81846) {
                        iM55681 = (C0873.m55680("ۚۙ") + i13) * 75;
                        strM56386 = strM56386;
                        i3 = ((iM55681 ^ i14) * 13667) ^ (-1324116752);
                        i4 = -1437070628;
                        i6 = iM55681 ^ i4;
                        sArr = sArr;
                        str = strM56386;
                        i16 = i6;
                        i15 = i3;
                        strM56386 = str;
                    } else {
                        int iM55687 = (C0873.m55680("᩵ۛ") + i13) * 45;
                        i16 = iM55687 ^ 586565026;
                        i15 = ((iM55687 ^ i14) * (-16365)) ^ (-1948652623);
                        sArr = sArr;
                        onClickListener = null;
                    }
                    break;
            }
            return;
        }
    }
}
