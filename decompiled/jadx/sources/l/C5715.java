package l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G6K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5715 implements InterfaceC8085 {

    /* JADX INFO: renamed from: ۘ֨ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f17617 = {9591, 28755, 28740, 28762, 1365, 22182, 22193, 22191, 12642, -11330, -13450, -10963, -10745, -10324, 3284, -12312, 8363, -16212, 12392, 1931, 571, -5094, -5107, -5101, -5090, -5102, -5104, -5037, -5092, -5101, -5095, -5105, -5102, -5100, -5095, -5037, -5109, -5096, -5101, -5095, -5100, -5101, -5094, -5092, -5101, -5095, -5105, -5102, -5100, -5095, -5037, -5100, -5101, -5111, -5096, -5101, -5111, -5037, -5090, -5092, -5111, -5096, -5094, -5102, -5105, -5116, -5037, -5071, -5060, -5080, -5069, -5058, -5067, -5064, -5073, -5094, -5107, -5101, -5092, -5101, -5095, -5105, -5102, -5100, -5095, -5037, -5100, -5101, -5111, -5096, -5101, -5111, -5037, -5090, -5092, -5111, -5096, -5094, -5102, -5105, -5116, -5037, -5068, -5069, -5061, -5070, 3497, -2130, -2143, -2133, -2115, -2144, -2138, -2133, -2079, -2138, -2143, -2117, -2134, -2143, -2117, -2079, -2130, -2132, -2117, -2138, -2144, -2143, -2079, -2174, -2162, -2170, -2175, -2132, -2144, -2142, -2079, -2130, -2143, -2133, -2115, -2144, -2138, -2133, -2079, -2119, -2134, -2143, -2133, -2138, -2143, -2136, 5510, -27040, -27012, -27012, -27016, -27013, -27086, -27097, -27097, -27035, -27012, -27098, -27029, -27029};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Object f17618 = new Object();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f17619;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f17621;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final RunnableC19827 f17622;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnWindowFocusChangeListenerC4304 f17623;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f17624;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Main f17625;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f17626;

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo6024(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo6026(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo6029(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܿ */
    public final void mo6028(InterfaceC23586 interfaceC23586) {
        boolean z = false;
        RunnableC19827 runnableC19827 = null;
        View view = null;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        int i = -1272230385;
        int i2 = C1294.f4556;
        int i3 = C2167.f7158;
        int iM2566 = C0630.m2566("᩺֫") ^ i3;
        int i4 = ((iM2566 ^ i2) * 11959) ^ (-762948050);
        int i5 = 2100701069;
        while (true) {
            i = ((((i ^ i2) * 2151) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1791208926:
                case 970426418:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("ۧܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12091)) ^ (-1229600705);
                        i5 = 1798268636;
                    } else {
                        iM2566 = (C2105.m6981("֫ۡ") + i2) * 73;
                        i4 = ((iM2566 ^ i3) * (-10165)) ^ (-306265091);
                        i5 = 172191343;
                    }
                    break;
                case -1727056150:
                case 209987016:
                    break;
                case -1572419080:
                case 1144738995:
                    C2958.m9023(interfaceC23586).mo19834(this);
                    dialogInterfaceC0206 = this.f17619;
                    if (dialogInterfaceC0206 != null) {
                        iM2566 = (C2105.m6981("᩺ۜ") + i2) * (-89);
                        i4 = ((iM2566 ^ i3) * 6487) ^ (-1443172147);
                        i5 = 1640272645;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۠ۨ")) * (-75);
                        i4 = ((iM2566 ^ i2) * (-8753)) ^ (-1791095727);
                        i5 = -890613284;
                    }
                    break;
                case -1536978470:
                case 611608400:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C2105.m6981("ۙۛ") ^ i2) * (-85);
                        i4 = ((iM2566 ^ i3) * 20233) ^ (-849864119);
                        i5 = 1210218598;
                    } else {
                        iM2566 = C0630.m2566("ۜۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 23099) ^ 1489429099;
                        i5 = 1936326643;
                    }
                    break;
                case -1441680283:
                case 840106593:
                    if (C0714.f2697 < 0) {
                        iM2566 = (i3 - C0630.m2566("ܽ֫")) * 67;
                        i4 = ((iM2566 ^ i2) * 4567) ^ 1889028783;
                        i5 = -1211231577;
                    } else {
                        iM2566 = (C2105.m6981("ܿ֡") ^ i2) * 81;
                        i4 = ((iM2566 ^ i3) * 13119) ^ (-141111995);
                        i5 = -1846852850;
                    }
                    break;
                case -1438668632:
                case 1374035475:
                    if (C0050.f910 >= 0) {
                        iM2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        iM2566 = (i2 - C0630.m2566("᩶ۖ")) * (-127);
                        i4 = ((iM2566 ^ i3) * 24135) ^ (-1356944191);
                        i5 = -179015011;
                    }
                    break;
                case -1300678701:
                case 1333649752:
                    C2272.m7503();
                    C4075.m12263();
                    break;
                case -1183177665:
                case -1042653982:
                    if (C1005.f3721) {
                        iM2566 = (i2 - C2105.m6981("᩸ۧ")) * 31;
                        i4 = ((iM2566 ^ i3) * 18569) ^ 1509025657;
                        i5 = 443188278;
                    } else {
                        iM2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    }
                    break;
                case -1048533835:
                case 173979521:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ܽ֫")) * 67;
                        i4 = ((iM2566 ^ i2) * 4567) ^ 1889028783;
                        i5 = -1211231577;
                    } else {
                        iM2566 = C0630.m2566("۟᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26433)) ^ 1726086044;
                        i5 = 1282027901;
                    }
                    break;
                case -653031658:
                case 344682284:
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        iM2566 = C2105.m6981("᩶ۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-29837)) ^ 1642101232;
                        i5 = -1521141109;
                    }
                    break;
                case -619010542:
                case -234365771:
                    view = this.f17624;
                    view.removeCallbacks(runnableC19827);
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        iM2566 = C0630.m2566("֡ᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5605) ^ 130745467;
                        i5 = -486221031;
                    }
                    break;
                case -470586010:
                case 1130443870:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("ۧܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12091)) ^ (-1229600705);
                        i5 = 1798268636;
                    } else {
                        iM2566 = C0630.m2566("᩷֫") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-5579)) ^ (-73488400);
                        i5 = 412084944;
                    }
                    break;
                case -417732448:
                case 1275897280:
                    if (view.getViewTreeObserver().isAlive()) {
                        iM2566 = C2105.m6981("ۖۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1815) ^ 1244618187;
                        i5 = -1940529516;
                    } else {
                        iM2566 = C2105.m6981("ܿۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 26353) ^ (-571993900);
                        i5 = -348977894;
                    }
                    break;
                case -482520:
                case 1159494846:
                    C3663.m11167(dialogInterfaceC0206);
                    iM2566 = (i3 - C0630.m2566("۠ۨ")) * (-75);
                    i4 = ((iM2566 ^ i2) * (-8753)) ^ (-1791095727);
                    i5 = -890613284;
                    break;
                case 223569785:
                case 734222578:
                    z = true;
                    if (C1504.m5179()) {
                        iM2566 = (C2105.m6981("۬֨") + i3) * (-19);
                        i4 = ((iM2566 ^ i2) * 8723) ^ 1225629465;
                        i5 = -8189136;
                    } else {
                        iM2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    }
                    break;
                case 553667466:
                case 1815042640:
                    this.f17620 = z;
                    runnableC19827 = this.f17622;
                    if (C2272.m7503()) {
                        iM2566 = (C2105.m6981("ۙۛ") ^ i2) * (-85);
                        i4 = ((iM2566 ^ i3) * 20233) ^ (-849864119);
                        i5 = 1210218598;
                    } else {
                        iM2566 = C0630.m2566("۫ܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1685) ^ 934792505;
                        i5 = 38598559;
                    }
                    break;
                case 599934540:
                case 2046584751:
                    C2272.m7503();
                    if (C1773.f6144 > 0) {
                        iM2566 = (C2105.m6981("ܿ֡") ^ i2) * 81;
                        i4 = ((iM2566 ^ i3) * 13119) ^ (-141111995);
                        i5 = -1846852850;
                    } else {
                        iM2566 = C0630.m2566("ۧܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12091)) ^ (-1229600705);
                        i5 = 1798268636;
                    }
                    break;
                case 629630130:
                case 1426294902:
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f17623);
                    iM2566 = C2105.m6981("ܿۡ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 26353) ^ (-571993900);
                    i5 = -348977894;
                    break;
                case 1116981349:
                case 1453615855:
                    C1005.m3501();
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        iM2566 = (C2105.m6981("ܿ֡") ^ i2) * 81;
                        i4 = ((iM2566 ^ i3) * 13119) ^ (-141111995);
                        i5 = -1846852850;
                    }
                    break;
                default:
                    ViewOnClickListenerC1958.m6429();
                    iM2566 = C0630.m2566("ۧܰ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-12091)) ^ (-1229600705);
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
    
        if (l.C1773.f6144 > 0) goto L11;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m16144(C5715 c5715) {
        int iM2566;
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
        int i8 = C5695.f17556;
        int i9 = C0050.f910;
        int iM2567 = C0630.m2566("ۗۨ") ^ i9;
        int i10 = ((iM2567 ^ i8) * 3885) ^ 674275172;
        int i11 = -1394203080;
        while (true) {
            int i12 = iM2567 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i8) * 15007) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -2042147270:
                    case -1976003078:
                        i6 = 153;
                        if (C4263.f13799 > 0) {
                            iM2567 = (C2105.m6981("᩵ۙ") ^ i8) * 73;
                            i10 = ((iM2567 ^ i9) * (-21995)) ^ (-1148135625);
                            i11 = 1041187483;
                        }
                        iM2566 = (C0630.m2566("ۛ᩶") ^ i9) * (-71);
                        i = ((iM2566 ^ i8) * (-31711)) ^ (-1228069691);
                        i2 = 1376247514;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1747133537:
                    case 348420426:
                        if (C3911.f12484 >= 0) {
                            iM2566 = C2105.m6981("۟֡") ^ i8;
                            i = ((iM2566 ^ i9) * (-13189)) ^ (-1238647717);
                            i2 = 761209203;
                        } else {
                            iM2566 = C0630.m2566("ۨܶ") ^ i9;
                            i = ((iM2566 ^ i8) * (-23365)) ^ 1603334641;
                            i2 = 29262274;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1647015888:
                    case 514206311:
                        C21923.m49335(main, C11340.m28025(sArr2, i6, 13, i5));
                        break;
                    case -1609812804:
                    case 1679572726:
                        break;
                    case -1481551054:
                    case 327287768:
                        if (C0422.m1963()) {
                            iM2566 = (C2105.m6981("֡۠") ^ i8) * (-93);
                            i = ((iM2566 ^ i9) * 29505) ^ (-1204979853);
                            i2 = -1966207939;
                        } else {
                            iM2566 = (C0630.m2566("ۛ᩶") ^ i9) * (-71);
                            i = ((iM2566 ^ i8) * (-31711)) ^ (-1228069691);
                            i2 = 1376247514;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1471728507:
                    case -870084402:
                        i5 = 59988;
                        iM2566 = (C2105.m6981("ܺۜ") + i8) * 93;
                        i = ((iM2566 ^ i9) * 27291) ^ 603117018;
                        i2 = 1176606815;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1463192663:
                    case 980504378:
                        if (i4 - (s * s2) >= 0) {
                            iM2566 = (i8 - C2105.m6981("᩶᩸")) * 27;
                            i = ((iM2566 ^ i9) * (-28441)) ^ (-134873154);
                            i2 = 119277466;
                        } else {
                            iM2566 = C0630.m2566("ۘᩳ") ^ i9;
                            i = ((iM2566 ^ i8) * (-2645)) ^ 161012326;
                            i2 = 1424148309;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1183274502:
                    case 1803225066:
                        main = c5715.f17625;
                        sArr2 = f17617;
                        if (C3432.f10845 >= 0) {
                            iM2566 = C2105.m6981("۟֡") ^ i8;
                            i = ((iM2566 ^ i9) * (-13189)) ^ (-1238647717);
                            i2 = 761209203;
                        } else {
                            iM2566 = C2105.m6981("۫ܳ") ^ i9;
                            i = ((iM2566 ^ i8) * (-3193)) ^ (-1015774932);
                            i2 = 2061668057;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1073826582:
                    case 666772328:
                        C0050.m940();
                        break;
                    case -1066869882:
                    case -322852969:
                        if (C4117.f13076 <= 0) {
                            iM2567 = C2105.m6981("᩺֡") ^ i8;
                            i10 = ((iM2567 ^ i9) * 19045) ^ 510757837;
                            i11 = -1993857850;
                        }
                        iM2566 = C0630.m2566("ۧ᩵") ^ i9;
                        i = ((iM2566 ^ i8) * (-16241)) ^ 477273021;
                        i2 = -2113461903;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -996150651:
                    case 731016034:
                        i4 = 125865961 + i3;
                        if (C2126.f7087) {
                            iM2566 = (C0630.m2566("ۛ᩶") ^ i9) * (-71);
                            i = ((iM2566 ^ i8) * (-31711)) ^ (-1228069691);
                            i2 = 1376247514;
                        } else {
                            iM2566 = (C2105.m6981("ܿᩴ") + i8) * (-31);
                            i = ((iM2566 ^ i9) * (-4661)) ^ 1702947432;
                            i2 = 1114308060;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -904210097:
                    case 1346625922:
                        sArr = f17617;
                        if (AbstractC2021.m6574()) {
                            iM2566 = (C0630.m2566("ۛ᩶") ^ i9) * (-71);
                            i = ((iM2566 ^ i8) * (-31711)) ^ (-1228069691);
                            i2 = 1376247514;
                        } else {
                            iM2566 = C0630.m2566("ۗ۬") ^ i8;
                            i = ((iM2566 ^ i9) * (-19673)) ^ (-21455446);
                            i2 = -101481496;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -786827195:
                    case 1476448293:
                        c = 152;
                        if (C0714.f2697 >= 0) {
                            iM2566 = C2105.m6981("۟֡") ^ i8;
                            i = ((iM2566 ^ i9) * (-13189)) ^ (-1238647717);
                            i2 = 761209203;
                        } else {
                            iM2566 = (i8 - C2105.m6981("ۜ۬")) * 109;
                            i = ((iM2566 ^ i9) * 6825) ^ (-619169759);
                            i2 = 576389395;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -684102919:
                    case 574638504:
                        s = sArr[c];
                        i3 = s * s;
                        if (C0422.f1886 <= 0) {
                            iM2566 = C0630.m2566("۫ۖ") ^ i9;
                            i = ((iM2566 ^ i8) * 16717) ^ (-1806275489);
                            i2 = -5646205;
                        } else {
                            iM2566 = (C0630.m2566("᩸᩶") + i9) * (-73);
                            i = ((iM2566 ^ i8) * 13669) ^ 898595775;
                            i2 = 929492394;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 51124355:
                    case 58320375:
                        C4117.m12364();
                        if (C0964.f3626 == 0) {
                            iM2566 = C2105.m6981("۟֡") ^ i8;
                            i = ((iM2566 ^ i9) * (-13189)) ^ (-1238647717);
                            i2 = 761209203;
                            i12 = iM2566 ^ i2;
                            i10 = i;
                        }
                        iM2566 = (C0630.m2566("ۛ᩶") ^ i9) * (-71);
                        i = ((iM2566 ^ i8) * (-31711)) ^ (-1228069691);
                        i2 = 1376247514;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 57351469:
                    case 1452807927:
                        i5 = 38408;
                        iM2566 = (C2105.m6981("ܺۜ") + i8) * 93;
                        i = ((iM2566 ^ i9) * 27291) ^ 603117018;
                        i2 = 1176606815;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 73289776:
                    case 1085543733:
                        s2 = 22438;
                        if (C0422.f1886 <= 0) {
                            iM2566 = C2105.m6981("۟֡") ^ i8;
                            i = ((iM2566 ^ i9) * (-13189)) ^ (-1238647717);
                            i2 = 761209203;
                        } else {
                            iM2566 = (i9 - C0630.m2566("ܿܽ")) * (-109);
                            i = ((iM2566 ^ i8) * (-22641)) ^ (-567707693);
                            i2 = -958647490;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 2124598356:
                    case 2138314055:
                        C0714.m2805();
                        C7811.m20844();
                        iM2566 = (C0630.m2566("ۛ᩶") ^ i9) * (-71);
                        i = ((iM2566 ^ i8) * (-31711)) ^ (-1228069691);
                        i2 = 1376247514;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    default:
                        if (C1504.f5354) {
                            iM2566 = C0630.m2566("ۧ᩵") ^ i9;
                            i = ((iM2566 ^ i8) * (-16241)) ^ 477273021;
                            i2 = -2113461903;
                        } else {
                            iM2566 = C0630.m2566("۬᩸") ^ i9;
                            i = ((iM2566 ^ i8) * (-12053)) ^ 793576026;
                            i2 = 1528086389;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16141(C5715 c5715, boolean z) {
        int i = 233378655;
        int i2 = C4075.f12947;
        int i3 = RunnableC3474.f10992;
        int iM6981 = C2105.m6981("֫ۖ") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-4509)) ^ 962336508;
        int i5 = -86089535;
        while (true) {
            i = ((((i ^ i3) * 8369) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2106468556:
                case -461046994:
                    if (z) {
                        iM6981 = C0630.m2566("ܶܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4013)) ^ (-130328665);
                        i5 = 1161803065;
                    } else {
                        iM6981 = (C2105.m6981("ۗܶ") + i3) * 119;
                        i4 = ((iM6981 ^ i2) * 2213) ^ (-1753964250);
                        i5 = -1587090020;
                    }
                    break;
                case -2053753631:
                case -849067429:
                    c5715.m16145();
                    iM6981 = (C2105.m6981("ۗܶ") + i3) * 119;
                    i4 = ((iM6981 ^ i2) * 2213) ^ (-1753964250);
                    i5 = -1587090020;
                    break;
                case -1950488611:
                case -1165090422:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C2105.m6981("֡᩷") ^ i2) * (-81);
                        i4 = ((iM6981 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        iM6981 = C0630.m2566("᩸ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13455)) ^ 490874970;
                        i5 = -879984947;
                    }
                    break;
                case -1455947729:
                case -1436186609:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("᩺֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        iM6981 = (C0630.m2566("ۢܰ") ^ i2) * 17;
                        i4 = ((iM6981 ^ i3) * 25897) ^ (-492189819);
                        i5 = 1651463347;
                    }
                    break;
                case -1434198580:
                case 882625511:
                    C7106.m19120();
                    if (!C0483.m2121()) {
                        iM6981 = C2105.m6981("ۤܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3891)) ^ (-1820689869);
                        i5 = -1852943581;
                    }
                    break;
                case -1378921132:
                case 1921370002:
                    if (C0964.f3626 != 0) {
                        iM6981 = C0630.m2566("᩺֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        iM6981 = C2105.m6981("᩷ۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 13323) ^ (-1642854909);
                        i5 = -824782497;
                    }
                    break;
                case -1356631251:
                case 1400732010:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C2105.m6981("֡᩷") ^ i2) * (-81);
                        i4 = ((iM6981 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        iM6981 = (C0630.m2566("۠ᩳ") ^ i2) * 53;
                        i4 = ((iM6981 ^ i3) * 9481) ^ (-1559259296);
                        i5 = -544252247;
                    }
                    break;
                case -1354815566:
                case 1351455478:
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("᩺᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 297) ^ 151758345;
                        i5 = 1107043907;
                    } else {
                        iM6981 = C2105.m6981("۬ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27457)) ^ (-1226184070);
                        i5 = 1209526669;
                    }
                    break;
                case -911968091:
                case -528270161:
                    C2126.m7040();
                    if (RunnableC0588.f2309 < 0) {
                        iM6981 = C0630.m2566("᩺֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3891)) ^ (-1820689869);
                        i5 = -1852943581;
                    }
                    break;
                case -607555994:
                case 1632560423:
                    C2167.m7155();
                    iM6981 = C2105.m6981("ۤ᩹") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-3891)) ^ (-1820689869);
                    i5 = -1852943581;
                    break;
                case -419714162:
                case 1389161694:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ۤܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    } else {
                        iM6981 = C0630.m2566("ۗᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26305) ^ (-529192148);
                        i5 = 1579058955;
                    }
                    break;
                case -261853541:
                case 1929681992:
                    C2958.m9034();
                    C1773.m5908();
                    break;
                case 325969341:
                case 375068753:
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("᩺֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        iM6981 = C2105.m6981("ܳ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23371) ^ (-614459285);
                        i5 = 858183895;
                    }
                    break;
                case 386164735:
                case 1072997595:
                    if (C0050.m940() <= 0) {
                        iM6981 = (C2105.m6981("֡᩷") ^ i2) * (-81);
                        i4 = ((iM6981 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        iM6981 = (C0630.m2566("᩸֫") + i2) * (-87);
                        i4 = ((iM6981 ^ i3) * (-9323)) ^ (-369906735);
                        i5 = 494537161;
                    }
                    break;
                case 429106337:
                case 1726768914:
                    if (C11340.f33930 >= 0) {
                        iM6981 = C2105.m6981("᩺᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 297) ^ 151758345;
                        i5 = 1107043907;
                    } else {
                        iM6981 = C2105.m6981("ۤܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    }
                    break;
                case 494355411:
                case 1819801093:
                    if (C1916.f6442) {
                        iM6981 = C2105.m6981("ܰۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27125)) ^ 1424775467;
                        i5 = 848777590;
                    } else {
                        iM6981 = C2105.m6981("ۤܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    }
                    break;
                case 636315688:
                case 1972027538:
                    break;
                default:
                    if (C2272.m7503()) {
                        iM6981 = (C2105.m6981("֡᩷") ^ i2) * (-81);
                        i4 = ((iM6981 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        iM6981 = (C0630.m2566("᩻ۘ") + i2) * 89;
                        i4 = ((iM6981 ^ i3) * (-8959)) ^ 1591797900;
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
    public C5715(Main main) {
        boolean z;
        int iM2566;
        int i;
        int i2;
        boolean z2;
        int iM2567;
        int i3;
        int i4;
        final C5715 c5715 = this;
        View decorView = null;
        AbstractC7379 abstractC7379M12356 = null;
        final InterfaceC12344 interfaceC12344 = null;
        boolean z3 = false;
        final PackageManager packageManager = null;
        final WeakReference weakReference = null;
        short[] sArr = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1005309266;
        int i8 = C3746.f11829;
        int i9 = C1773.f6144;
        short s = f17617[0];
        int i10 = (s * 2) + 1;
        int i11 = s + 1;
        int i12 = i10 - (i11 * i11) > 0 ? 1974 : 28724;
        int iM6981 = C2105.m6981("֫ۗ") ^ i8;
        int i13 = ((iM6981 ^ i9) * (-25813)) ^ (-988525604);
        int i14 = iM6981 ^ (-615350234);
        ?? r2 = 0;
        boolean z4 = false;
        while (true) {
            i7 = i14 ^ (i13 & (((i7 ^ i9) * 11889) >> 31));
            switch (i7) {
                case -2144782395:
                case 1287123558:
                    z = z3;
                    decorView = C1916.m6300(main).getDecorView();
                    if (!C1916.f6442) {
                        z2 = z4 ? 1 : 0;
                        int iM6982 = C2105.m6981("۠۟") ^ i9;
                        z3 = z;
                        z4 = z2;
                        i14 = iM6982 ^ 1374369648;
                        i13 = ((iM6982 ^ i8) * (-17165)) ^ 1288205239;
                        c5715 = this;
                    } else {
                        iM2566 = C0630.m2566("۟۠") ^ i9;
                        i = ((iM2566 ^ i8) * (-24253)) ^ 581166985;
                        i2 = -1922113609;
                        boolean z5 = z;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                        z3 = z5;
                    }
                    break;
                case -1767224755:
                case -369060245:
                    c5715.f17626 = z3;
                    return;
                case -1660115775:
                case 1649523580:
                    z = z3;
                    if (C0483.f2088 >= 0) {
                        int iM2568 = C0630.m2566("ۜܳ") ^ i8;
                        z3 = z;
                        z4 = z4 ? 1 : 0;
                        i14 = iM2568 ^ 1220631036;
                        i13 = ((iM2568 ^ i9) * (-31385)) ^ 1113201747;
                        r2 = 0;
                    } else {
                        r2 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: l.ۙ֡᩷
                            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                            public final void onWindowFocusChanged(boolean z6) {
                                C5715.m16141(this.f13881, z6);
                            }
                        };
                        c5715.f17623 = r2;
                        z4 = true;
                        z4 = true;
                        if (C4263.m12819() >= 0) {
                            int iM2569 = C0630.m2566("᩶ۗ") ^ i9;
                            z3 = z;
                            i14 = iM2569 ^ (-1324887266);
                            i13 = ((iM2569 ^ i8) * 19555) ^ (-549947688);
                            r2 = r2;
                        } else {
                            int iM25610 = C0630.m2566("᩷᩵") ^ i8;
                            z3 = z;
                            i14 = iM25610 ^ 1155253716;
                            i13 = ((iM25610 ^ i9) * 25895) ^ (-383705830);
                            r2 = r2;
                        }
                    }
                    break;
                case -1644127280:
                case -587345970:
                    C21923.m49329();
                    if (C3911.m11924() > 0) {
                        z = z3;
                        int iM25611 = C0630.m2566("᩶ۗ") ^ i9;
                        z3 = z;
                        i14 = iM25611 ^ (-1324887266);
                        i13 = ((iM25611 ^ i8) * 19555) ^ (-549947688);
                        r2 = r2;
                    } else {
                        z = z3;
                        int iM25612 = C0630.m2566("ۜܳ") ^ i8;
                        z3 = z;
                        z4 = z4 ? 1 : 0;
                        i14 = iM25612 ^ 1220631036;
                        i13 = ((iM25612 ^ i9) * (-31385)) ^ 1113201747;
                        r2 = 0;
                    }
                    break;
                case -1546426976:
                case -46971521:
                    z = z3;
                    c5715.f17624 = decorView;
                    decorView.getViewTreeObserver().addOnWindowFocusChangeListener(r2);
                    if (C3663.m11168() >= 0) {
                        iM2566 = (C2105.m6981("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i9) * (-24831)) ^ 330365308;
                        i2 = -1629886662;
                    } else {
                        iM2566 = C0630.m2566("ۤܰ") ^ i9;
                        i = ((iM2566 ^ i8) * 28937) ^ (-157424388);
                        i2 = 1829662637;
                    }
                    boolean z6 = z;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    z3 = z6;
                    break;
                case -1480113777:
                case 2022750319:
                    z = z3;
                    sArr = f17617;
                    i5 = 1;
                    i6 = 3;
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = (C2105.m6981("ۤۢ") ^ i8) * (-95);
                        i = ((iM2566 ^ i9) * (-8077)) ^ (-1209210024);
                        i2 = -1962542587;
                        boolean z7 = z;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                        z3 = z7;
                    } else {
                        int iM25613 = C0630.m2566("᩶ۗ") ^ i9;
                        z3 = z;
                        i14 = iM25613 ^ (-1324887266);
                        i13 = ((iM25613 ^ i8) * 19555) ^ (-549947688);
                        r2 = r2;
                    }
                    break;
                case -1455807044:
                case 1135858327:
                    z = z3;
                    abstractC7379M12356 = C4117.m12356(main);
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("ۨ᩵") ^ i8;
                        i = ((iM2566 ^ i9) * 12347) ^ (-621374604);
                        i2 = -119987272;
                    } else {
                        iM2566 = C2105.m6981("ܳܽ") ^ i8;
                        i = ((iM2566 ^ i9) * (-18261)) ^ 625368250;
                        i2 = -1436587614;
                    }
                    boolean z8 = z;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    z3 = z8;
                    break;
                case -1443654131:
                case 1815408226:
                    C0630.m2560(C1802.f6208, new Runnable() { // from class: l.ۗ֡᩷
                        {
                            int i15 = -1140562290;
                            int i16 = C3019.f9544;
                            int i17 = C4616.f14690;
                            int iM6983 = C2105.m6981("ۨܰ") ^ i16;
                            int i18 = ((iM6983 ^ i17) * 2497) ^ 941329529;
                            int i19 = 2027775712;
                            while (true) {
                                i15 = ((((i15 ^ i17) * 9205) >> 31) & i18) ^ (iM6983 ^ i19);
                                switch (i15) {
                                    case -1799749057:
                                    case 635835572:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM6983 = (C2105.m6981("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((iM6983 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            iM6983 = C2105.m6981("ܳ֡") ^ i16;
                                            i18 = ((iM6983 ^ i17) * 8735) ^ 1769923667;
                                            i19 = -1282632636;
                                        }
                                        break;
                                    case -1798322186:
                                    case 419133921:
                                        if (C4263.f13799 <= 0) {
                                            iM6983 = (C2105.m6981("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((iM6983 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            iM6983 = C2105.m6981("ۛܰ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * 26783) ^ (-1432187322);
                                            i19 = 2066799363;
                                        }
                                        break;
                                    case -1787022760:
                                    case -1601756583:
                                        if (C2520.m8026()) {
                                            iM6983 = (C2105.m6981("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((iM6983 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            iM6983 = (C0630.m2566("ۨۧ") + i16) * (-27);
                                            i18 = ((iM6983 ^ i17) * (-10017)) ^ (-2130083554);
                                            i19 = -1940845041;
                                        }
                                        break;
                                    case -1703987570:
                                    case -445146:
                                        RunnableC3474.m10630();
                                        if (C3683.f11629 < 0) {
                                            iM6983 = C2105.m6981("ܺۤ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            iM6983 = C2105.m6981("֡ܺ") ^ i16;
                                            i18 = ((iM6983 ^ i17) * 17621) ^ (-1485101316);
                                            i19 = -1898301824;
                                        }
                                        break;
                                    case -1641025354:
                                    case -981178082:
                                        C5695.m16023();
                                        if (C2958.f9394 < 0) {
                                            iM6983 = C2105.m6981("ܺۤ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            iM6983 = (C0630.m2566("ܺۧ") ^ i16) * 77;
                                            i18 = ((iM6983 ^ i17) * 18833) ^ 1456215461;
                                            i19 = -1551347188;
                                        }
                                        break;
                                    case -1413868991:
                                    case 1207770826:
                                        if (C1773.f6144 <= 0) {
                                            iM6983 = C2105.m6981("ܺۤ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            iM6983 = C2105.m6981("۬۟") ^ i16;
                                            i18 = ((iM6983 ^ i17) * (-621)) ^ (-592829074);
                                            i19 = 2037289845;
                                        }
                                        break;
                                    case -1293850983:
                                    case -637126219:
                                        if (!C2126.f7087) {
                                            iM6983 = (C0630.m2566("᩺ۖ") + i17) * 67;
                                            i18 = ((iM6983 ^ i16) * 30883) ^ (-478798460);
                                            i19 = -604318926;
                                        } else {
                                            iM6983 = C2105.m6981("ܺۤ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        }
                                        break;
                                    case -443878456:
                                    case 1669008073:
                                        C2958.m9034();
                                        C0630.m2564();
                                        throw new RuntimeException();
                                    case -35469383:
                                    case 1603021114:
                                        if (C1047.f3863 >= 0) {
                                            iM6983 = C2105.m6981("֡ܺ") ^ i16;
                                            i18 = ((iM6983 ^ i17) * 17621) ^ (-1485101316);
                                            i19 = -1898301824;
                                        } else {
                                            iM6983 = C0630.m2566("ܿۖ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * 5255) ^ (-2122016774);
                                            i19 = -1308542072;
                                        }
                                        break;
                                    case -16923816:
                                    case 961890349:
                                        if (C3746.m11369() >= 0) {
                                            iM6983 = (C2105.m6981("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((iM6983 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            iM6983 = C2105.m6981("ۙᩴ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * 10461) ^ (-1514208446);
                                            i19 = 827869413;
                                        }
                                        break;
                                    case 326146795:
                                    case 1580071290:
                                        if (C1128.f4106 <= 0) {
                                            iM6983 = (C2105.m6981("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((iM6983 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            iM6983 = C2105.m6981("֨ܶ") ^ i16;
                                            i18 = ((iM6983 ^ i17) * 4929) ^ 1463607371;
                                            i19 = -722176173;
                                        }
                                        break;
                                    case 431627947:
                                    case 1569447542:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM6983 = (C0630.m2566("᩺ۖ") + i17) * 67;
                                            i18 = ((iM6983 ^ i16) * 30883) ^ (-478798460);
                                            i19 = -604318926;
                                        } else {
                                            iM6983 = C2105.m6981("ۨۖ") ^ i16;
                                            i18 = ((iM6983 ^ i17) * (-73)) ^ (-1224674511);
                                            i19 = 272863911;
                                        }
                                        break;
                                    case 803140298:
                                    case 1938410400:
                                        RunnableC1937.m6387();
                                        iM6983 = C2105.m6981("֡ܺ") ^ i16;
                                        i18 = ((iM6983 ^ i17) * 17621) ^ (-1485101316);
                                        i19 = -1898301824;
                                        break;
                                    case 856180907:
                                    case 1374674031:
                                        if (RunnableC0588.m2441() >= 0) {
                                            iM6983 = C2105.m6981("ܺۤ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            iM6983 = C2105.m6981("ۙۡ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * 27723) ^ 1604724611;
                                            i19 = -1929308247;
                                        }
                                        break;
                                    case 1164164175:
                                    case 1670261444:
                                        if (C4117.f13076 <= 0) {
                                            iM6983 = (C0630.m2566("᩺ۖ") + i17) * 67;
                                            i18 = ((iM6983 ^ i16) * 30883) ^ (-478798460);
                                            i19 = -604318926;
                                        } else {
                                            iM6983 = (i17 - C0630.m2566("ۜۛ")) * 27;
                                            i18 = ((iM6983 ^ i16) * 4133) ^ 194861299;
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
                            InterfaceC12344 interfaceC12345 = null;
                            PackageManager packageManager2 = null;
                            int i15 = -1599686091;
                            int i16 = C1773.f6144;
                            int i17 = C4616.f14690;
                            int iM6983 = C2105.m6981("ۤ᩺") ^ i16;
                            int i18 = ((iM6983 ^ i17) * (-5227)) ^ (-340710021);
                            int i19 = 1073703919;
                            while (true) {
                                i15 = ((((i15 ^ i17) * 28115) >> 31) & i18) ^ (iM6983 ^ i19);
                                switch (i15) {
                                    case -1791573041:
                                    case -1327506373:
                                        if (C4075.f12947 >= 0) {
                                            iM6983 = (C2105.m6981("᩻ܽ") ^ i16) * 91;
                                            i18 = ((iM6983 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            iM6983 = C2105.m6981("۬ܽ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * 30161) ^ (-1127704937);
                                            i19 = -496847692;
                                        }
                                        break;
                                    case -1746837543:
                                    case 921810460:
                                        int i20 = 0;
                                        if (C0050.f910 < 0) {
                                            WeakReference weakReference2 = weakReference;
                                            if (C1420.f5096 > 0) {
                                                C0237.m1492(new RunnableC12770(i20, weakReference2));
                                            }
                                            iM6983 = C0630.m2566("ܿۡ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            iM6983 = (C0630.m2566("۟֡") + i16) * 87;
                                            i18 = ((iM6983 ^ i17) * (-2631)) ^ 2081692676;
                                            i19 = 218072162;
                                        }
                                        break;
                                    case -1569634072:
                                    case 1192923563:
                                        if (RunnableC0588.f2309 >= 0) {
                                            iM6983 = (C0630.m2566("ᩴۚ") + i17) * 33;
                                            i18 = ((iM6983 ^ i16) * (-6439)) ^ 1236014622;
                                            i19 = -833032995;
                                        } else {
                                            iM6983 = (i16 - C2105.m6981("ۜᩴ")) * 87;
                                            i18 = ((iM6983 ^ i17) * (-19619)) ^ 1723125342;
                                            i19 = 1389679945;
                                        }
                                        break;
                                    case -1508514447:
                                    case -920242674:
                                        if (C2126.m7040()) {
                                            iM6983 = C0630.m2566("ܿۡ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            iM6983 = (C2105.m6981("ܽ֨") + i16) * (-69);
                                            i18 = ((iM6983 ^ i17) * (-26041)) ^ (-1193769879);
                                            i19 = 1420769499;
                                        }
                                        break;
                                    case -1383420468:
                                    case 1805798045:
                                        if (C0714.f2697 >= 0) {
                                            iM6983 = (C0630.m2566("۟֡") + i16) * 87;
                                            i18 = ((iM6983 ^ i17) * (-2631)) ^ 2081692676;
                                            i19 = 218072162;
                                        } else {
                                            iM6983 = (C0630.m2566("ᩴۚ") + i17) * 33;
                                            i18 = ((iM6983 ^ i16) * (-6439)) ^ 1236014622;
                                            i19 = -833032995;
                                        }
                                        break;
                                    case -1071483557:
                                    case -884074980:
                                        if (C1504.f5354) {
                                            iM6983 = C0630.m2566("ܿۡ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            iM6983 = C0630.m2566("۫ܿ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * (-26817)) ^ (-1909980536);
                                            i19 = 774158761;
                                        }
                                        break;
                                    case -992364635:
                                    case 8089765:
                                        if (C0237.m1481() >= 0) {
                                            iM6983 = (C0630.m2566("۟֡") + i16) * 87;
                                            i18 = ((iM6983 ^ i17) * (-2631)) ^ 2081692676;
                                            i19 = 218072162;
                                        } else {
                                            iM6983 = (C2105.m6981("ۙܿ") ^ i17) * 57;
                                            i18 = ((iM6983 ^ i16) * 27435) ^ 1034210399;
                                            i19 = 1451367064;
                                        }
                                        break;
                                    case -971998593:
                                    case -439506978:
                                        C7106.m19120();
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM6983 = (C2105.m6981("᩻ܽ") ^ i16) * 91;
                                            i18 = ((iM6983 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            iM6983 = C0630.m2566("ۜܺ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * 9221) ^ (-931627047);
                                            i19 = -1959679790;
                                        }
                                        break;
                                    case -955551975:
                                    case 533608810:
                                        if (C0714.f2697 >= 0) {
                                            iM6983 = C0630.m2566("ۜܺ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * 9221) ^ (-931627047);
                                            i19 = -1959679790;
                                        } else {
                                            iM6983 = (C0630.m2566("ᩴۚ") + i17) * 33;
                                            i18 = ((iM6983 ^ i16) * (-6439)) ^ 1236014622;
                                            i19 = -833032995;
                                        }
                                        break;
                                    case -576891989:
                                    case 144685789:
                                        if (C3245.f10203 <= 0) {
                                            iM6983 = (C2105.m6981("᩻ܽ") ^ i16) * 91;
                                            i18 = ((iM6983 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            iM6983 = C2105.m6981("֨֡") ^ i16;
                                            i18 = ((iM6983 ^ i17) * (-23521)) ^ 689361746;
                                            i19 = 1772569764;
                                        }
                                        break;
                                    case -572671276:
                                    case 289602063:
                                        interfaceC12345 = interfaceC12344;
                                        if (C5695.f17556 >= 0) {
                                            iM6983 = (C2105.m6981("᩻ܽ") ^ i16) * 91;
                                            i18 = ((iM6983 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            iM6983 = C0630.m2566("ۙۢ") ^ i16;
                                            i18 = ((iM6983 ^ i17) * (-16125)) ^ (-1087544890);
                                            i19 = 1885557081;
                                        }
                                        break;
                                    case -447767578:
                                    case -296152118:
                                        C3245.m9925();
                                        C2105.m6982();
                                        iM6983 = (C0630.m2566("ᩴۚ") + i17) * 33;
                                        i18 = ((iM6983 ^ i16) * (-6439)) ^ 1236014622;
                                        i19 = -833032995;
                                        break;
                                    case -223775724:
                                    case 840544096:
                                        packageManager2 = packageManager;
                                        iM6983 = (i16 - C2105.m6981("ܶۘ")) * 75;
                                        i18 = ((iM6983 ^ i17) * 12545) ^ 123152555;
                                        i19 = 561160130;
                                        break;
                                    case 821732027:
                                    case 1187775925:
                                        C0237.m1481();
                                        break;
                                    case 1591667590:
                                    case 1687945501:
                                        if (C7811.f24123 >= 0) {
                                            iM6983 = C0630.m2566("ܿۡ") ^ i17;
                                            i18 = ((iM6983 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            iM6983 = (i17 - C2105.m6981("ܳۡ")) * 35;
                                            i18 = ((iM6983 ^ i16) * (-15767)) ^ (-1970001433);
                                            i19 = -2132928950;
                                        }
                                        break;
                                    default:
                                        try {
                                            C5715.m16142(interfaceC12345, packageManager2);
                                            break;
                                        } catch (RuntimeException unused) {
                                        }
                                        iM6983 = (C2105.m6981("ᩳۗ") + i17) * (-33);
                                        i18 = ((iM6983 ^ i16) * (-2619)) ^ (-1879681929);
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
                    c5715.f17622 = new Runnable() { // from class: l.᩶֡᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5715.m16140(this.f64058);
                        }
                    };
                    z2 = z9;
                    if (C2105.f7037 != 0) {
                        int iM6983 = C2105.m6981("۠۟") ^ i9;
                        z3 = z;
                        z4 = z2;
                        i14 = iM6983 ^ 1374369648;
                        i13 = ((iM6983 ^ i8) * (-17165)) ^ 1288205239;
                    } else {
                        int iM25614 = (C0630.m2566("۫֨") ^ i9) * (-85);
                        i13 = ((iM25614 ^ i8) * 20361) ^ (-53201599);
                        z3 = z;
                        z4 = z9 ? 1 : 0;
                        i14 = iM25614 ^ 414075781;
                    }
                    c5715 = this;
                    break;
                case -863582419:
                case -381938108:
                    z = z3;
                    abstractC7379M12356.mo19833(c5715);
                    interfaceC12344 = ApplicationC20075.f65008;
                    if (!C2272.f7362) {
                        iM2566 = C0630.m2566("ܰܶ") ^ i9;
                        i = ((iM2566 ^ i8) * (-1721)) ^ (-1927536077);
                        i2 = -1988442497;
                        boolean z10 = z;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                        z3 = z10;
                    } else {
                        int iM25615 = C0630.m2566("᩶ۗ") ^ i9;
                        z3 = z;
                        i14 = iM25615 ^ (-1324887266);
                        i13 = ((iM25615 ^ i8) * 19555) ^ (-549947688);
                        r2 = r2;
                    }
                    break;
                case -724231990:
                case 2136378745:
                    ServiceConnectionC3453.m10564();
                    if (C3537.f11231 >= 0) {
                        z = z3;
                        iM2566 = C2105.m6981("ۨ᩵") ^ i8;
                        i = ((iM2566 ^ i9) * 12347) ^ (-621374604);
                        i2 = -119987272;
                        boolean z11 = z;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                        z3 = z11;
                    }
                    z = z3;
                    iM2566 = (C2105.m6981("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM2566 ^ i9) * (-24831)) ^ 330365308;
                    i2 = -1629886662;
                    boolean z12 = z;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    z3 = z12;
                    break;
                case -455787761:
                case -41078557:
                    packageManager = main.getApplicationContext().getPackageManager();
                    weakReference = new WeakReference(c5715);
                    if (RunnableC0588.f2309 >= 0) {
                        z = z3;
                        iM2566 = (C2105.m6981("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i9) * (-24831)) ^ 330365308;
                        i2 = -1629886662;
                    } else {
                        iM2566 = C2105.m6981("۫ۢ") ^ i9;
                        z = z3;
                        i = ((iM2566 ^ i8) * (-24809)) ^ (-2059184525);
                        i2 = 1116295875;
                    }
                    boolean z13 = z;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    z3 = z13;
                    break;
                case -205826495:
                case 773376718:
                    C0237.m1481();
                    C7811.m20844();
                    throw new RuntimeException();
                case 66893293:
                case 410320560:
                    AbstractC2021.m6574();
                    z = z3;
                    int iM25616 = C0630.m2566("ۜܳ") ^ i8;
                    z3 = z;
                    z4 = z4 ? 1 : 0;
                    i14 = iM25616 ^ 1220631036;
                    i13 = ((iM25616 ^ i9) * (-31385)) ^ 1113201747;
                    r2 = 0;
                    break;
                case 412381134:
                case 570541039:
                    z = z3;
                    boolean z14 = z4 ? 1 : 0;
                    c5715.f17621 = z14 ? 1 : 0;
                    c5715.f17626 = z14;
                    c5715.f17625 = main;
                    if (RunnableC0588.f2309 >= 0) {
                        z2 = z14 ? 1 : 0;
                        int iM6984 = C2105.m6981("۠۟") ^ i9;
                        z3 = z;
                        z4 = z2;
                        i14 = iM6984 ^ 1374369648;
                        i13 = ((iM6984 ^ i8) * (-17165)) ^ 1288205239;
                        c5715 = this;
                    } else {
                        int iM25617 = (C0630.m2566("ᩳܶ") + i8) * (-17);
                        i13 = ((iM25617 ^ i9) * (-16215)) ^ (-2098167267);
                        z3 = z;
                        i14 = iM25617 ^ (-1418588995);
                        z4 = z14 ? 1 : 0;
                    }
                    break;
                case 1581523070:
                case 1925081969:
                    if (interfaceC12344.getInt(C1420.m4902(sArr, i5, i6, i12), 0) != 0) {
                        iM2567 = C2105.m6981("۫ۨ") ^ i9;
                        i3 = ((iM2567 ^ i8) * 11019) ^ 1844790652;
                        i4 = -1206389018;
                    } else {
                        iM2567 = C0630.m2566("ܳۖ") ^ i8;
                        i3 = ((iM2567 ^ i9) * 21967) ^ 454800924;
                        i4 = -2113104407;
                    }
                    i14 = iM2567 ^ i4;
                    i13 = i3;
                    z3 = false;
                    break;
                default:
                    RunnableC1937.m6387();
                    if (!C0798.f2919) {
                        z = z3;
                        iM2566 = (C2105.m6981("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i9) * (-24831)) ^ 330365308;
                        i2 = -1629886662;
                        boolean z15 = z;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                        z3 = z15;
                    } else {
                        z = z3;
                        int iM25618 = C0630.m2566("ۜܳ") ^ i8;
                        z3 = z;
                        z4 = z4 ? 1 : 0;
                        i14 = iM25618 ^ 1220631036;
                        i13 = ((iM25618 ^ i9) * (-31385)) ^ 1113201747;
                        r2 = 0;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16139(WeakReference weakReference) {
        Object obj = null;
        C5715 c5715 = null;
        int i = -2000704342;
        int i2 = C0050.f910;
        int i3 = RunnableC0588.f2309;
        int iM2566 = C0630.m2566("۬۫") ^ i2;
        int i4 = ((iM2566 ^ i3) * 161) ^ 40236585;
        int i5 = 1705432381;
        while (true) {
            i = ((((i ^ i3) * (-16295)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2031252785:
                case 827416415:
                    c5715 = (C5715) obj;
                    if (c5715 != null) {
                        iM2566 = (C2105.m6981("ۘۢ") + i3) * (-21);
                        i4 = ((iM2566 ^ i2) * (-5171)) ^ (-627900262);
                        i5 = 1652395052;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۘۨ")) * (-39);
                        i4 = ((iM2566 ^ i3) * 7665) ^ (-212268125);
                        i5 = -1719401703;
                    }
                    break;
                case -1824225956:
                case 309032148:
                    RunnableC1937.m6387();
                    break;
                case -1732003107:
                case 1010795263:
                    c5715.f17626 = false;
                    c5715.m16145();
                    iM2566 = (i2 - C0630.m2566("ۘۨ")) * (-39);
                    i4 = ((iM2566 ^ i3) * 7665) ^ (-212268125);
                    i5 = -1719401703;
                    break;
                case -1727851255:
                case 1528882011:
                    obj = weakReference.get();
                    if (C0050.m940() <= 0) {
                        iM2566 = (C0630.m2566("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        iM2566 = C0630.m2566("֫ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-13939)) ^ (-1282692664);
                        i5 = -1996300688;
                    }
                    break;
                case -926361227:
                case 782982414:
                    C1916.m6308();
                    iM2566 = (i2 - C2105.m6981("᩹ܽ")) * 9;
                    i4 = ((iM2566 ^ i3) * (-13715)) ^ (-523961608);
                    i5 = -203712437;
                    break;
                case -532931347:
                case 1328101629:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = (C0630.m2566("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        iM2566 = (C0630.m2566("ܺۜ") + i2) * 61;
                        i4 = ((iM2566 ^ i3) * (-25845)) ^ 425916125;
                        i5 = 122238123;
                    }
                    break;
                case -474049578:
                case 1794178700:
                    if (C22628.f73083 > 0) {
                        iM2566 = C0630.m2566("ۢᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4125) ^ 1982329612;
                        i5 = -423915595;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩶ܰ")) * (-13);
                        i4 = ((iM2566 ^ i2) * (-28589)) ^ 1757821239;
                        i5 = 16077889;
                    }
                    break;
                case -87459729:
                case 1390522843:
                    if (C22628.m50615() != 0) {
                        iM2566 = (i2 - C2105.m6981("᩹ܽ")) * 9;
                        i4 = ((iM2566 ^ i3) * (-13715)) ^ (-523961608);
                        i5 = -203712437;
                    } else {
                        iM2566 = (C0630.m2566("᩺۫") ^ i2) * (-119);
                        i4 = ((iM2566 ^ i3) * (-2305)) ^ 414817103;
                        i5 = 1049941404;
                    }
                    break;
                case -82141856:
                case 2035716691:
                    if (C22628.m50615() != 0) {
                        iM2566 = C0630.m2566("ۢᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4125) ^ 1982329612;
                        i5 = -423915595;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩷ۘ")) * (-127);
                        i4 = ((iM2566 ^ i2) * 29137) ^ 121724669;
                        i5 = -670508410;
                    }
                    break;
                case -77443764:
                case 1908007646:
                    if (C1504.m5179()) {
                        iM2566 = (i2 - C2105.m6981("ܺ᩸")) * (-29);
                        i4 = ((iM2566 ^ i3) * 15131) ^ (-132799412);
                        i5 = 864665372;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩹ܽ")) * 9;
                        i4 = ((iM2566 ^ i3) * (-13715)) ^ (-523961608);
                        i5 = -203712437;
                    }
                    break;
                case 2620653:
                case 457464216:
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C0630.m2566("ᩳ᩷") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i3) * 10563) ^ 1570272178;
                        i5 = 1362034421;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ᩴܺ")) * 19;
                        i4 = ((iM2566 ^ i2) * 22297) ^ (-1945940336);
                        i5 = -1924493530;
                    }
                    break;
                case 71065917:
                case 885508626:
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C0630.m2566("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        iM2566 = C0630.m2566("᩶ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26765) ^ 2144120535;
                        i5 = -398383604;
                    }
                    break;
                case 284792634:
                case 865743743:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C0630.m2566("ᩳ᩷") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i3) * 10563) ^ 1570272178;
                        i5 = 1362034421;
                    } else {
                        iM2566 = C0630.m2566("ܺ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-32717)) ^ 1041417108;
                        i5 = -58582055;
                    }
                    break;
                case 461236762:
                case 1101804117:
                    break;
                case 565616448:
                case 702007310:
                    if (C0964.f3626 == 0) {
                        iM2566 = (i3 - C0630.m2566("᩶ܰ")) * (-13);
                        i4 = ((iM2566 ^ i2) * (-28589)) ^ 1757821239;
                        i5 = 16077889;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩹ܽ")) * 9;
                        i4 = ((iM2566 ^ i3) * (-13715)) ^ (-523961608);
                        i5 = -203712437;
                    }
                    break;
                case 1168005096:
                case 1600522784:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C0630.m2566("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        iM2566 = C2105.m6981("ܳۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10661) ^ (-740469537);
                        i5 = 2051568003;
                    }
                    break;
                case 1428009946:
                case 2134941640:
                    C2958.m9034();
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C0630.m2566("ᩳ᩷") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i3) * 10563) ^ 1570272178;
                        i5 = 1362034421;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩶ܰ")) * (-13);
                        i4 = ((iM2566 ^ i2) * (-28589)) ^ 1757821239;
                        i5 = 16077889;
                    }
                    break;
                default:
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("ۢᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4125) ^ 1982329612;
                        i5 = -423915595;
                    } else {
                        iM2566 = (C0630.m2566("᩺ۘ") + i3) * (-25);
                        i4 = ((iM2566 ^ i2) * (-22831)) ^ 920248323;
                        i5 = -1891260632;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16142(InterfaceC12344 interfaceC12344, PackageManager packageManager) {
        short s = f17617[20];
        int i = (s * s) + 283417225;
        int i2 = s + 16835;
        int i3 = (i2 * i2) - (i + i) > 0 ? 46292 : 60541;
        synchronized (f17618) {
            if (interfaceC12344.getInt(C2105.m6988(f17617, 21, 3, i3), 0) != 0) {
                return;
            }
            int i4 = 1;
            try {
                packageManager.getApplicationInfo(C2520.m8030(f17617, 24, 19, i3), 0);
                if (m16143(packageManager, C3663.m11162(f17617, 43, 32, i3)) || m16143(packageManager, C1420.m4902(f17617, 78, 28, i3))) {
                    i4 = 2;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            C7106.m19107(ViewOnClickListenerC1958.m6438(interfaceC12344).mo25853(i4, C5695.m16034(f17617, 75, 3, i3)));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m16145() {
        View view = null;
        RunnableC19827 runnableC19827 = null;
        int i = 1531537474;
        int i2 = RunnableC3474.f10992;
        int i3 = C4075.f12947;
        int iM2566 = C0630.m2566("֫ۢ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-26377)) ^ (-569681961);
        int i5 = -2145962093;
        while (true) {
            i = ((((i ^ i3) * (-23735)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2131345056:
                case 1748506267:
                    if (C3537.m10746() <= 0) {
                        iM2566 = (C0630.m2566("ܿۙ") + i3) * 123;
                        i4 = ((iM2566 ^ i2) * 12189) ^ 1540243310;
                        i5 = 1698189462;
                    } else {
                        iM2566 = C0630.m2566("ܿۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 31689) ^ 494774842;
                        i5 = 90215782;
                    }
                    break;
                case -2107878238:
                case 1385982338:
                    RunnableC1937.m6387();
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("ܿۙ") + i3) * 123;
                        i4 = ((iM2566 ^ i2) * 12189) ^ 1540243310;
                        i5 = 1698189462;
                    } else {
                        iM2566 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 9275) ^ (-2070727306);
                        i5 = 386950962;
                    }
                    break;
                case -2026806202:
                case 1959129902:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("ܿۙ") + i3) * 123;
                        i4 = ((iM2566 ^ i2) * 12189) ^ 1540243310;
                        i5 = 1698189462;
                    } else {
                        iM2566 = C2105.m6981("۠ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 18573) ^ (-763575126);
                        i5 = 1553318771;
                    }
                    break;
                case -1989724782:
                case 1951399520:
                    break;
                case -1985767262:
                case -989639199:
                    C1773.m5908();
                    if (C1128.m3851() <= 0) {
                        iM2566 = C2105.m6981("ۢܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    } else {
                        iM2566 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 9275) ^ (-2070727306);
                        i5 = 386950962;
                    }
                    break;
                case -1622430717:
                case -614273919:
                    C0964.m3413();
                    break;
                case -1467482541:
                case -1174586066:
                    RunnableC3474.m10630();
                    iM2566 = C2105.m6981("ۗ۠") ^ i3;
                    i4 = ((iM2566 ^ i2) * 9275) ^ (-2070727306);
                    i5 = 386950962;
                    break;
                case -1236606084:
                case -202401930:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("ۢܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    } else {
                        iM2566 = C0630.m2566("ܺܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 30687) ^ (-1396151478);
                        i5 = 1909763971;
                    }
                    break;
                case -1058817412:
                case 229426356:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C0630.m2566("᩶۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 569) ^ 570748479;
                        i5 = -1528120475;
                    } else {
                        iM2566 = C0630.m2566("ۙۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23433) ^ 362188148;
                        i5 = 164757524;
                    }
                    break;
                case -890258437:
                case 1430336183:
                    view.removeCallbacks(runnableC19827);
                    view.post(runnableC19827);
                    iM2566 = C2105.m6981("ܶܽ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-14369)) ^ (-428296964);
                    i5 = 20759181;
                    break;
                case -724693256:
                case 2016743100:
                    if (C1504.f5354) {
                        iM2566 = (C2105.m6981("۬᩹") ^ i3) * (-53);
                        i4 = ((iM2566 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۜ") ^ i3) * (-95);
                        i4 = ((iM2566 ^ i2) * 8835) ^ (-93071561);
                        i5 = 9245995;
                    }
                    break;
                case -636633636:
                case 1686814531:
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C2105.m6981("۬᩹") ^ i3) * (-53);
                        i4 = ((iM2566 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        iM2566 = (C2105.m6981("ܳۢ") + i3) * (-25);
                        i4 = ((iM2566 ^ i2) * 24339) ^ 792440856;
                        i5 = 1709928842;
                    }
                    break;
                case -519529744:
                case 1155770849:
                    C1916.m6308();
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("᩶۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 569) ^ 570748479;
                        i5 = -1528120475;
                    } else {
                        iM2566 = C2105.m6981("ۢܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    }
                    break;
                case -503493463:
                case 1496599408:
                    if (this.f17620) {
                        iM2566 = C2105.m6981("ܶܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14369)) ^ (-428296964);
                        i5 = 20759181;
                    } else {
                        iM2566 = C0630.m2566("ܿ᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-10633)) ^ (-1261696193);
                        i5 = 197196892;
                    }
                    break;
                case 272532759:
                case 1325667689:
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C2105.m6981("۬᩹") ^ i3) * (-53);
                        i4 = ((iM2566 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֡ۙ")) * 81;
                        i4 = ((iM2566 ^ i2) * (-7597)) ^ (-429429444);
                        i5 = 1483554760;
                    }
                    break;
                case 1262298595:
                case 2096790344:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C2105.m6981("ۢܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    } else {
                        iM2566 = C0630.m2566("۠ܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-23201)) ^ 15590709;
                        i5 = 1220048882;
                    }
                    break;
                case 1308939805:
                case 1781189357:
                    view = this.f17624;
                    runnableC19827 = this.f17622;
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C2105.m6981("۬᩹") ^ i3) * (-53);
                        i4 = ((iM2566 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        iM2566 = C0630.m2566("᩵ۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22019) ^ 623874304;
                        i5 = -422014234;
                    }
                    break;
                default:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C2105.m6981("۬᩹") ^ i3) * (-53);
                        i4 = ((iM2566 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        iM2566 = C0630.m2566("֫ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 19431) ^ (-1664267338);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16143(PackageManager packageManager, String str) {
        int iM2566;
        int i;
        int i2;
        int i3;
        int iM6981;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM2567;
        int i9;
        int i10;
        int i11;
        int i12 = C0714.f2697;
        int i13 = ServiceConnectionC3453.f10921;
        int iM6982 = (i12 - C2105.m6981("ۧܽ")) * 9;
        int i14 = ((iM6982 ^ i13) * (-25331)) ^ 1422155399;
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = iM6982 ^ (-932612106);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -649194530;
        Iterator itM6374 = null;
        Intent intent = null;
        String strM8030 = null;
        Intent intent2 = null;
        while (true) {
            int i20 = i15 ^ (i14 & (((i19 ^ i13) * 27055) >> 31));
            switch (i20) {
                case -2044708840:
                case -891009899:
                    intent2 = intent2;
                    strM8030 = strM8030;
                    intent = intent;
                    i20 = i20;
                    s = sArr[c];
                    s2 = 78000;
                    if (!C0798.f2919) {
                        iM6981 = C2105.m6981("ᩳ֨") ^ i12;
                        i4 = ((iM6981 ^ i13) * (-4283)) ^ 1452566984;
                        i5 = 1879645781;
                        int i21 = iM6981 ^ i5;
                        i19 = i20;
                        intent = intent;
                        intent2 = intent2;
                        i15 = i21;
                        i14 = i4;
                        strM8030 = strM8030;
                    } else {
                        strM8030 = strM8030;
                        int iM6983 = (C2105.m6981("᩻֨") ^ i12) * 101;
                        i10 = ((iM6983 ^ i13) * 28415) ^ (-744369099);
                        i11 = iM6983 ^ 481526652;
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
                    strM8030 = strM8030;
                    intent = intent;
                    i20 = i20;
                    i16 = s * s2;
                    i17 = s + 19500;
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("۬ۙ") ^ i13;
                        i4 = ((iM6981 ^ i12) * 14803) ^ (-682401035);
                        i5 = -1120694864;
                    } else {
                        iM6981 = C0630.m2566("۠ۤ") ^ i12;
                        i4 = ((iM6981 ^ i13) * (-2179)) ^ 1052181993;
                        i5 = -1058905545;
                    }
                    int i22 = iM6981 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i22;
                    i14 = i4;
                    strM8030 = strM8030;
                    break;
                case -1828548530:
                case -522931455:
                    i8 = i20;
                    intent = intent2.setPackage(strM8030);
                    if (C2126.f7087) {
                        iM2567 = C0630.m2566("۫ۗ") ^ i12;
                        i6 = ((iM2567 ^ i13) * 26757) ^ 222936209;
                        i9 = 1296506059;
                    } else {
                        iM2567 = (i13 - C0630.m2566("᩻ۛ")) * 61;
                        i6 = ((iM2567 ^ i12) * (-12491)) ^ 539498886;
                        i9 = -1383103086;
                    }
                    i7 = iM2567 ^ i9;
                    i19 = i8;
                    i15 = i7;
                    i14 = i6;
                    intent2 = intent2;
                    break;
                case -1818825995:
                case -606094494:
                    itM6374 = RunnableC1937.m6374(packageManager.queryIntentActivities(intent, 512));
                    int iM2568 = C0630.m2566("ۙܿ") ^ i12;
                    intent = intent;
                    i10 = ((iM2568 ^ i13) * 21407) ^ 1896945708;
                    i11 = iM2568 ^ (-1390786439);
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
                    strM8030 = C2520.m8030(sArr2, 133, 19, i18);
                    if (C0050.m940() > 0) {
                        int iM2569 = C0630.m2566("ۨ۟") ^ i12;
                        i6 = ((iM2569 ^ i13) * (-11347)) ^ 650047069;
                        i7 = iM2569 ^ 1855682027;
                        i19 = i20;
                        intent = intent;
                        i15 = i7;
                        i14 = i6;
                        intent2 = intent2;
                    } else {
                        int iM6984 = (C2105.m6981("᩻֨") ^ i12) * 101;
                        i10 = ((iM6984 ^ i13) * 28415) ^ (-744369099);
                        i11 = iM6984 ^ 481526652;
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
                    strM8030 = strM8030;
                    intent = intent;
                    i20 = i20;
                    sArr = f17617;
                    if (C3683.m11222()) {
                        iM6981 = C0630.m2566("۬ۙ") ^ i13;
                        i4 = ((iM6981 ^ i12) * 14803) ^ (-682401035);
                        i5 = -1120694864;
                    } else {
                        iM6981 = C0630.m2566("ۙᩳ") ^ i13;
                        i4 = ((iM6981 ^ i12) * (-24175)) ^ 1065531454;
                        i5 = 1378899864;
                    }
                    int i23 = iM6981 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i23;
                    i14 = i4;
                    strM8030 = strM8030;
                    break;
                case -1094235054:
                case 550483371:
                    intent2 = intent2;
                    strM8030 = strM8030;
                    intent = intent;
                    i20 = i20;
                    c = 'j';
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C0630.m2566("᩶ۨ") + i13) * 127;
                        i4 = ((iM6981 ^ i12) * 7725) ^ 797377981;
                        i5 = -839280810;
                    } else {
                        iM6981 = C2105.m6981("᩵۟") ^ i13;
                        i4 = ((iM6981 ^ i12) * (-9993)) ^ (-1496470548);
                        i5 = 1792341602;
                    }
                    int i24 = iM6981 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i24;
                    i14 = i4;
                    strM8030 = strM8030;
                    break;
                case -1022829670:
                case -800189394:
                    C0382.m1848();
                    C5695.m16023();
                    intent2 = intent2;
                    strM8030 = strM8030;
                    intent = intent;
                    i20 = i20;
                    int iM25610 = (i13 - C0630.m2566("ۡۨ")) * 37;
                    i6 = ((iM25610 ^ i12) * 1537) ^ (-1079179950);
                    i7 = iM25610 ^ (-927271924);
                    i19 = i20;
                    intent = intent;
                    strM8030 = strM8030;
                    i15 = i7;
                    i14 = i6;
                    intent2 = intent2;
                    break;
                case -993375421:
                case -150187135:
                    C2167.m7155();
                    return false;
                case -928427031:
                case -189089587:
                    intent2 = intent2;
                    strM8030 = strM8030;
                    intent = intent;
                    i20 = i20;
                    if (C3683.m11222()) {
                        iM6981 = (C0630.m2566("᩶ۨ") + i13) * 127;
                        i4 = ((iM6981 ^ i12) * 7725) ^ 797377981;
                        i5 = -839280810;
                    } else {
                        iM6981 = C2105.m6981("ۛۖ") ^ i12;
                        i4 = ((iM6981 ^ i13) * (-4109)) ^ (-459766552);
                        i5 = -1151628958;
                    }
                    int i25 = iM6981 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i25;
                    i14 = i4;
                    strM8030 = strM8030;
                    break;
                case -902248318:
                case 1320002606:
                    intent2 = intent2;
                    strM8030 = strM8030;
                    intent = intent;
                    i20 = i20;
                    if (i16 - (i17 * i17) > 0) {
                        iM6981 = C2105.m6981("֫۠") ^ i12;
                        i4 = ((iM6981 ^ i13) * 10433) ^ (-1577221325);
                        i5 = 1573965440;
                    } else {
                        iM6981 = (C0630.m2566("۬ۗ") ^ i13) * (-43);
                        i4 = ((iM6981 ^ i12) * (-22077)) ^ (-521925723);
                        i5 = -587930917;
                    }
                    int i26 = iM6981 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i26;
                    i14 = i4;
                    strM8030 = strM8030;
                    break;
                case -744529400:
                case 1231581891:
                    i18 = 14474;
                    iM6981 = (i13 - C2105.m6981("ۙ᩹")) * 63;
                    i4 = ((iM6981 ^ i12) * 5115) ^ 482219243;
                    i5 = 1943067976;
                    int i27 = iM6981 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i27;
                    i14 = i4;
                    strM8030 = strM8030;
                    break;
                case -429592232:
                case 1371841965:
                    C3432.m10477();
                    if (C3432.m10477() > 0) {
                        i8 = i20;
                        iM2567 = C0630.m2566("۫ۗ") ^ i12;
                        i6 = ((iM2567 ^ i13) * 26757) ^ 222936209;
                        i9 = 1296506059;
                        i7 = iM2567 ^ i9;
                        i19 = i8;
                        i15 = i7;
                        i14 = i6;
                        intent2 = intent2;
                    }
                    intent2 = intent2;
                    strM8030 = strM8030;
                    intent = intent;
                    i20 = i20;
                    int iM25611 = (i13 - C0630.m2566("ۡۨ")) * 37;
                    i6 = ((iM25611 ^ i12) * 1537) ^ (-1079179950);
                    i7 = iM25611 ^ (-927271924);
                    i19 = i20;
                    intent = intent;
                    strM8030 = strM8030;
                    i15 = i7;
                    i14 = i6;
                    intent2 = intent2;
                    break;
                case -371802185:
                case -293035604:
                    i18 = 63439;
                    iM6981 = (i13 - C2105.m6981("ۙ᩹")) * 63;
                    i4 = ((iM6981 ^ i12) * 5115) ^ 482219243;
                    i5 = 1943067976;
                    int i28 = iM6981 ^ i5;
                    i19 = i20;
                    intent = intent;
                    intent2 = intent2;
                    i15 = i28;
                    i14 = i4;
                    strM8030 = strM8030;
                    break;
                case -202975498:
                case 2078679393:
                    return false;
                case 129598716:
                case 259275212:
                    if (!((ResolveInfo) RunnableC1108.m3791(itM6374)).activityInfo.exported) {
                        int iM25612 = C0630.m2566("ۙܿ") ^ i12;
                        intent = intent;
                        i10 = ((iM25612 ^ i13) * 21407) ^ 1896945708;
                        i11 = iM25612 ^ (-1390786439);
                        i19 = i20;
                        i15 = i11;
                        i14 = i10;
                        intent = intent;
                    } else {
                        iM2566 = (C0630.m2566("ۚۡ") + i12) * 91;
                        i = i20;
                        i2 = ((iM2566 ^ i13) * (-30607)) ^ 415237065;
                        i3 = -487181457;
                        int i29 = i;
                        i15 = iM2566 ^ i3;
                        i14 = i2;
                        i19 = i29;
                    }
                    break;
                case 588937240:
                case 636562316:
                    intent2 = intent2;
                    intent = intent;
                    i20 = i20;
                    short[] sArr3 = f17617;
                    if (C3537.f11231 >= 0) {
                        strM8030 = strM8030;
                        iM6981 = C0630.m2566("۬ۙ") ^ i13;
                        i4 = ((iM6981 ^ i12) * 14803) ^ (-682401035);
                        i5 = -1120694864;
                        int i210 = iM6981 ^ i5;
                        i19 = i20;
                        intent = intent;
                        intent2 = intent2;
                        i15 = i210;
                        i14 = i4;
                    } else {
                        strM8030 = strM8030;
                        String strM2128 = C0483.m2128(sArr3, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 26, i18);
                        if (C0050.f910 >= 0) {
                            int iM25613 = (i13 - C0630.m2566("ۡۨ")) * 37;
                            i6 = ((iM25613 ^ i12) * 1537) ^ (-1079179950);
                            i7 = iM25613 ^ (-927271924);
                            i19 = i20;
                            intent = intent;
                            strM8030 = strM8030;
                            i15 = i7;
                            i14 = i6;
                            intent2 = intent2;
                            break;
                        } else {
                            Intent intentAddCategory = new Intent(strM2128).addCategory(str);
                            sArr2 = f17617;
                            if (C2105.f7037 != 0) {
                                intent2 = intentAddCategory;
                                iM6981 = (C0630.m2566("᩶ۨ") + i13) * 127;
                                i4 = ((iM6981 ^ i12) * 7725) ^ 797377981;
                                i5 = -839280810;
                                int i211 = iM6981 ^ i5;
                                i19 = i20;
                                intent = intent;
                                intent2 = intent2;
                                i15 = i211;
                                i14 = i4;
                            } else {
                                int iM6985 = C2105.m6981("֨ܿ") ^ i13;
                                intent2 = intentAddCategory;
                                i14 = ((iM6985 ^ i12) * (-12569)) ^ 1710934476;
                                i19 = i20;
                                intent = intent;
                                i15 = iM6985 ^ 82177175;
                            }
                        }
                    }
                    strM8030 = strM8030;
                    break;
                case 819183097:
                case 951802796:
                    C22628.m50615();
                    if (C7106.m19120() > 0) {
                        intent2 = intent2;
                        strM8030 = strM8030;
                        intent = intent;
                        i20 = i20;
                        iM6981 = C0630.m2566("۬ۙ") ^ i13;
                        i4 = ((iM6981 ^ i12) * 14803) ^ (-682401035);
                        i5 = -1120694864;
                        int i212 = iM6981 ^ i5;
                        i19 = i20;
                        intent = intent;
                        intent2 = intent2;
                        i15 = i212;
                        i14 = i4;
                        strM8030 = strM8030;
                    } else {
                        intent2 = intent2;
                        strM8030 = strM8030;
                        intent = intent;
                        i20 = i20;
                        int iM25614 = (i13 - C0630.m2566("ۡۨ")) * 37;
                        i6 = ((iM25614 ^ i12) * 1537) ^ (-1079179950);
                        i7 = iM25614 ^ (-927271924);
                        i19 = i20;
                        intent = intent;
                        strM8030 = strM8030;
                        i15 = i7;
                        i14 = i6;
                        intent2 = intent2;
                    }
                    break;
                case 1566881544:
                case 2133566834:
                    if (!C4159.f13567) {
                        intent2 = intent2;
                        intent = intent;
                        i20 = i20;
                        int iM6986 = (C2105.m6981("᩻֨") ^ i12) * 101;
                        i10 = ((iM6986 ^ i13) * 28415) ^ (-744369099);
                        i11 = iM6986 ^ 481526652;
                        i19 = i20;
                        intent2 = intent2;
                        i15 = i11;
                        i14 = i10;
                        intent = intent;
                    } else {
                        intent2 = intent2;
                        strM8030 = strM8030;
                        intent = intent;
                        i20 = i20;
                        iM6981 = C0630.m2566("۬ۙ") ^ i13;
                        i4 = ((iM6981 ^ i12) * 14803) ^ (-682401035);
                        i5 = -1120694864;
                        int i213 = iM6981 ^ i5;
                        i19 = i20;
                        intent = intent;
                        intent2 = intent2;
                        i15 = i213;
                        i14 = i4;
                        strM8030 = strM8030;
                    }
                    break;
                case 1956252131:
                case 2031264790:
                    return true;
                default:
                    i = i20;
                    if (C0483.m2123(itM6374)) {
                        iM2566 = (i13 - C2105.m6981("ۨܶ")) * 11;
                        i2 = ((iM2566 ^ i12) * (-16723)) ^ (-830131073);
                        i3 = 568996026;
                    } else {
                        iM2566 = C2105.m6981("ۧۜ") ^ i12;
                        i2 = ((iM2566 ^ i13) * 15163) ^ (-1134582529);
                        i3 = -173414487;
                    }
                    int i214 = i;
                    i15 = iM2566 ^ i3;
                    i14 = i2;
                    i19 = i214;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable m16147() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -664418331;
        int i5 = C0714.f2697;
        int i6 = C3911.f12484;
        int iM6981 = (i5 - C2105.m6981("۠ܳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
        int i7 = ((iM6981 ^ i6) * 309) ^ (-40041346);
        int i8 = 1154238186;
        while (true) {
            i4 = ((((i4 ^ i6) * 18359) >> 31) & i7) ^ (iM6981 ^ i8);
            switch (i4) {
                case -1910061152:
                case 1029662202:
                    C3911.m11924();
                    iM6981 = (i6 - C2105.m6981("ᩳܺ")) * (-73);
                    i7 = ((iM6981 ^ i5) * (-9405)) ^ (-1765700054);
                    i8 = 687456289;
                    break;
                case -1742931113:
                case -1542105165:
                    if (!C0798.f2919) {
                        iM6981 = C2105.m6981("᩺᩹") ^ i5;
                        i7 = ((iM6981 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ᩳܺ")) * (-73);
                        i7 = ((iM6981 ^ i5) * (-9405)) ^ (-1765700054);
                        i8 = 687456289;
                    }
                    break;
                case -811627498:
                case -507711172:
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("᩺᩹") ^ i5;
                        i7 = ((iM6981 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        iM6981 = C0630.m2566("᩺ۨ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-8761)) ^ 589494789;
                        i8 = -1108778262;
                    }
                    break;
                case -664327314:
                case 755607207:
                    i2 = 1;
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("ᩳܰ") ^ i5) * 77;
                        i7 = ((iM6981 ^ i6) * (-29295)) ^ (-737178009);
                        i8 = 823336175;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ۖܽ")) * (-5);
                        i7 = ((iM6981 ^ i5) * (-2031)) ^ (-274940537);
                        i8 = -1543719094;
                    }
                    break;
                case -638654694:
                case 383193734:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("᩺᩹") ^ i5;
                        i7 = ((iM6981 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        iM6981 = (C0630.m2566("ܿ᩹") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM6981 ^ i5) * (-32693)) ^ 500043814;
                        i8 = 1836102725;
                    }
                    break;
                case -563593712:
                case 1695419424:
                    i3 = i + i2;
                    if (C0050.f910 >= 0) {
                        iM6981 = (i6 - C0630.m2566("۟ᩳ")) * (-39);
                        i7 = ((iM6981 ^ i5) * 16191) ^ (-879956429);
                        i8 = -1944371879;
                    } else {
                        iM6981 = C2105.m6981("۟ܺ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 21283) ^ 1841211348;
                        i8 = -381221249;
                    }
                    break;
                case -555669502:
                case 506160250:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("ܰۤ") ^ i6) * (-15);
                        i7 = ((iM6981 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        iM6981 = (C0630.m2566("ᩳᩳ") + i5) * (-11);
                        i7 = ((iM6981 ^ i6) * (-31739)) ^ 179520588;
                        i8 = -674231419;
                    }
                    break;
                case -379066259:
                case -34147857:
                    RunnableC3474.m10630();
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C0630.m2566("ܰۤ") ^ i6) * (-15);
                        i7 = ((iM6981 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ᩳܺ")) * (-73);
                        i7 = ((iM6981 ^ i5) * (-9405)) ^ (-1765700054);
                        i8 = 687456289;
                    }
                    break;
                case -148040589:
                case 846886147:
                    if (C1916.f6442) {
                        iM6981 = C2105.m6981("ۚۨ") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-29597)) ^ 204653880;
                        i8 = 123669607;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ᩳܺ")) * (-73);
                        i7 = ((iM6981 ^ i5) * (-9405)) ^ (-1765700054);
                        i8 = 687456289;
                    }
                    break;
                case 48218627:
                case 1126068564:
                    C7811.m20844();
                    return null;
                case 540855020:
                case 900040996:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C0630.m2566("ܰۤ") ^ i6) * (-15);
                        i7 = ((iM6981 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        iM6981 = C0630.m2566("۠ܺ") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-6819)) ^ (-766779236);
                        i8 = -1423361868;
                    }
                    break;
                case 866468697:
                case 1652881750:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("ܰۤ") ^ i6) * (-15);
                        i7 = ((iM6981 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        iM6981 = (i6 - C2105.m6981("᩵۟")) * 5;
                        i7 = ((iM6981 ^ i5) * (-10503)) ^ (-241245165);
                        i8 = -1353305712;
                    }
                    break;
                case 1305133819:
                case 1420162477:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (C0630.m2566("ܰۤ") ^ i6) * (-15);
                        i7 = ((iM6981 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        iM6981 = C2105.m6981("ۢۘ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-32131)) ^ (-1017275594);
                        i8 = -1137331416;
                    }
                    break;
                case 1457866868:
                case 1728626777:
                    this.f17621 = i3;
                    return new RunnableC9949(this);
                case 1603440672:
                case 1863762831:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("ᩳܰ") ^ i5) * 77;
                        i7 = ((iM6981 ^ i6) * (-29295)) ^ (-737178009);
                        i8 = 823336175;
                    } else {
                        iM6981 = C2105.m6981("᩺᩹") ^ i5;
                        i7 = ((iM6981 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    }
                    break;
                default:
                    i = this.f17621;
                    if (C1047.m3599() >= 0) {
                        iM6981 = C2105.m6981("᩺᩹") ^ i5;
                        i7 = ((iM6981 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        iM6981 = C2105.m6981("ۘܶ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-23379)) ^ 1452054658;
                        i8 = 1470178905;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16146() {
        int i = 0;
        int i2 = 0;
        int i3 = 1780370886;
        int i4 = C4075.f12947;
        int i5 = C7811.f24123;
        int iM6981 = C2105.m6981("᩵ۡ") ^ i4;
        int i6 = ((iM6981 ^ i5) * (-15399)) ^ (-1800380403);
        int i7 = -714445884;
        while (true) {
            i3 = ((((i3 ^ i5) * 27281) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -2027908881:
                case -1899830817:
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("ᩴ᩸") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    } else {
                        iM6981 = (C2105.m6981("᩹ۘ") + i4) * 67;
                        i6 = ((iM6981 ^ i5) * (-30949)) ^ 365861244;
                        i7 = 1897816460;
                    }
                    break;
                case -1779431805:
                case -1045406647:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C0630.m2566("ᩴ᩸") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    } else {
                        iM6981 = (i5 - C0630.m2566("֡ۙ")) * (-19);
                        i6 = ((iM6981 ^ i4) * 2559) ^ 1610716585;
                        i7 = 169245861;
                    }
                    break;
                case -1523134444:
                case 739384368:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C2105.m6981("֨᩹") ^ i5) * q.h;
                        i6 = ((iM6981 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    } else {
                        iM6981 = C2105.m6981("֡ᩳ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-27267)) ^ (-1438047479);
                        i7 = 1060301930;
                    }
                    break;
                case -1508035779:
                case 997642860:
                    C3683.m11222();
                    break;
                case -1320611832:
                case 1307653053:
                    if (C7106.f21815 != 0) {
                        iM6981 = (i5 - C0630.m2566("᩺ܺ")) * (-31);
                        i6 = ((iM6981 ^ i4) * (-10741)) ^ 1241398244;
                        i7 = -1363072812;
                    } else {
                        iM6981 = C2105.m6981("᩵᩵") ^ i4;
                        i6 = ((iM6981 ^ i5) * 5527) ^ 1581181453;
                        i7 = -1538636984;
                    }
                    break;
                case -1106571597:
                case 1964240785:
                    this.f17621 = i + i2;
                    m16145();
                    break;
                case -1053250074:
                case -148277974:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("᩷ۜ") ^ i5) * 33;
                        i6 = ((iM6981 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    } else {
                        iM6981 = C2105.m6981("֫۠") ^ i5;
                        i6 = ((iM6981 ^ i4) * 30049) ^ 818783612;
                        i7 = -914925028;
                    }
                    break;
                case -788313465:
                case 1027938618:
                    C4075.m12263();
                    iM6981 = (C2105.m6981("֨᩹") ^ i5) * q.h;
                    i6 = ((iM6981 ^ i4) * (-18507)) ^ (-2041892401);
                    i7 = -650053806;
                    break;
                case -620934989:
                case 1288437346:
                    C7106.m19120();
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C0630.m2566("᩷ۜ") ^ i5) * 33;
                        i6 = ((iM6981 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    } else {
                        iM6981 = (i4 - C2105.m6981("᩶ۤ")) * (-11);
                        i6 = ((iM6981 ^ i5) * (-28415)) ^ (-1698992312);
                        i7 = 1009590037;
                    }
                    break;
                case -431910021:
                case 1941592363:
                    C1294.m4372();
                    if (!C2126.m7040()) {
                        iM6981 = (C2105.m6981("֨᩹") ^ i5) * q.h;
                        i6 = ((iM6981 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    } else {
                        iM6981 = C0630.m2566("ᩴ᩸") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    }
                    break;
                case -272728550:
                case 404019623:
                    C7811.m20844();
                    if (!C3683.m11222()) {
                        iM6981 = (C2105.m6981("֨᩹") ^ i5) * q.h;
                        i6 = ((iM6981 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۜ") ^ i5) * 33;
                        i6 = ((iM6981 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    }
                    break;
                case -172570696:
                case 937537037:
                    i2 = -1;
                    if (C3746.f11829 <= 0) {
                        iM6981 = (i5 - C0630.m2566("᩺ܺ")) * (-31);
                        i6 = ((iM6981 ^ i4) * (-10741)) ^ 1241398244;
                        i7 = -1363072812;
                    } else {
                        iM6981 = (C2105.m6981("֨᩺") + i4) * 23;
                        i6 = ((iM6981 ^ i5) * (-31379)) ^ (-719787185);
                        i7 = -28593419;
                    }
                    break;
                case 464446612:
                case 1288027112:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ᩴ᩸") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩸") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-19901)) ^ 279130735;
                        i7 = -978662172;
                    }
                    break;
                case 933010479:
                case 1497830188:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (i5 - C0630.m2566("᩺ܺ")) * (-31);
                        i6 = ((iM6981 ^ i4) * (-10741)) ^ 1241398244;
                        i7 = -1363072812;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ۫") ^ i5) * (-101);
                        i6 = ((iM6981 ^ i4) * (-29661)) ^ (-1572986942);
                        i7 = 1057677821;
                    }
                    break;
                case 1710504824:
                case 2022123982:
                    if (C0050.f910 >= 0) {
                        iM6981 = (C2105.m6981("֨᩹") ^ i5) * q.h;
                        i6 = ((iM6981 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    } else {
                        iM6981 = C2105.m6981("ܽۜ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-11583)) ^ (-669997917);
                        i7 = -786635317;
                    }
                    break;
                default:
                    i = this.f17621;
                    if (C7106.f21815 != 0) {
                        iM6981 = (C0630.m2566("᩷ۜ") ^ i5) * 33;
                        i6 = ((iM6981 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    } else {
                        iM6981 = (C0630.m2566("ܿܺ") ^ i5) * 3;
                        i6 = ((iM6981 ^ i4) * (-1259)) ^ 1682517376;
                        i7 = 243172160;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ۧ */
    public final void mo6025(InterfaceC23586 interfaceC23586) {
        m16145();
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܽ */
    public final void mo6027(InterfaceC23586 interfaceC23586) {
        View view = null;
        int i = -538671467;
        int i2 = C4263.f13799;
        int i3 = C1128.f4106;
        int iM6981 = (i3 - C2105.m6981("ܺ֡")) * 25;
        int i4 = ((iM6981 ^ i2) * 19853) ^ 1956256893;
        int i5 = 1852708358;
        while (true) {
            i = ((((i ^ i2) * 21421) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2054470088:
                case 1992791479:
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("ۨۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25533)) ^ 1950176769;
                        i5 = -1824823740;
                    } else {
                        iM6981 = C0630.m2566("ۨ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18165)) ^ (-1226061810);
                        i5 = -854501417;
                    }
                    break;
                case -2048938420:
                case 1087570223:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((iM6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM6981 = C2105.m6981("ۢۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18203)) ^ 1465714789;
                        i5 = 2132518265;
                    }
                    break;
                case -1782264858:
                case 439846571:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((iM6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM6981 = C0630.m2566("ۤۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12393) ^ 1362828384;
                        i5 = -1311263897;
                    }
                    break;
                case -1681932939:
                case -1044941825:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C0630.m2566("۟ܶ") ^ i3) * (-65);
                        i4 = ((iM6981 ^ i2) * 14131) ^ 1958739787;
                        i5 = -1558128367;
                    } else {
                        iM6981 = C0630.m2566("ۜۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 13585) ^ (-1820949018);
                        i5 = -1510919578;
                    }
                    break;
                case -1384780245:
                case -885694600:
                    view = this.f17624;
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C0630.m2566("ۢۢ") + i2) * (-15);
                        i4 = ((iM6981 ^ i3) * (-25873)) ^ 1236766795;
                        i5 = -1419857135;
                    } else {
                        iM6981 = (C2105.m6981("۟۠") + i2) * 9;
                        i4 = ((iM6981 ^ i3) * 293) ^ 798601563;
                        i5 = 10670036;
                    }
                    break;
                case -1163902145:
                case 1908747551:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((iM6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM6981 = C2105.m6981("ܽܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6191)) ^ 1005341855;
                        i5 = -912736132;
                    }
                    break;
                case -1055121386:
                case 2074390635:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((iM6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM6981 = C2105.m6981("ۛ۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-12109)) ^ 1356278408;
                        i5 = -361755387;
                    }
                    break;
                case -672669051:
                case -529820989:
                    view.removeCallbacks(this.f17622);
                    break;
                case -567476388:
                case 1397969335:
                    if (C2272.f7362) {
                        iM6981 = (C0630.m2566("۟ܶ") ^ i3) * (-65);
                        i4 = ((iM6981 ^ i2) * 14131) ^ 1958739787;
                        i5 = -1558128367;
                    } else {
                        iM6981 = C2105.m6981("᩸ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1237)) ^ (-289535181);
                        i5 = -1500618802;
                    }
                    break;
                case -125661443:
                case 804443108:
                    C4117.m12364();
                    if (!RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("ۨ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18165)) ^ (-1226061810);
                        i5 = -854501417;
                    } else {
                        iM6981 = (C0630.m2566("ܰܳ") + i3) * (-51);
                        i4 = ((iM6981 ^ i2) * (-14327)) ^ (-492976067);
                        i5 = 479126599;
                    }
                    break;
                case -112357776:
                case 939951035:
                    C3683.m11222();
                    break;
                case 880228592:
                case 1969552720:
                    if (C0237.f1507 == 0) {
                        iM6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((iM6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM6981 = C0630.m2566("ۨ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18165)) ^ (-1226061810);
                        i5 = -854501417;
                    }
                    break;
                case 1121364306:
                case 1171398137:
                    C4075.m12263();
                    if (!C0382.f1805) {
                        iM6981 = (C0630.m2566("ܰܳ") + i3) * (-51);
                        i4 = ((iM6981 ^ i2) * (-14327)) ^ (-492976067);
                        i5 = 479126599;
                    } else {
                        iM6981 = (C0630.m2566("۟ܶ") ^ i3) * (-65);
                        i4 = ((iM6981 ^ i2) * 14131) ^ 1958739787;
                        i5 = -1558128367;
                    }
                    break;
                case 1225839368:
                case 2006941428:
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("֫᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15639) ^ (-1443731687);
                        i5 = -1583863582;
                    } else {
                        iM6981 = (C0630.m2566("ܰܳ") + i3) * (-51);
                        i4 = ((iM6981 ^ i2) * (-14327)) ^ (-492976067);
                        i5 = 479126599;
                    }
                    break;
                case 1359627464:
                case 1494729258:
                    C1916.m6308();
                    C2272.m7503();
                    iM6981 = C0630.m2566("ۨ᩷") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-18165)) ^ (-1226061810);
                    i5 = -854501417;
                    break;
                default:
                    if (C2958.m9034() <= 0) {
                        iM6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((iM6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩺ۗ")) * (-69);
                        i4 = ((iM6981 ^ i3) * 16757) ^ 1592597462;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16140(final C5715 c5715) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int iM6981;
        int i5;
        String str;
        int i6;
        int iM2568;
        int i7;
        int iM6982;
        int i8;
        int i9;
        String strM19110 = null;
        C19258 c19258 = null;
        TextView textView = null;
        Context contextM1432 = null;
        AbstractC16157 abstractC16157M46962 = null;
        CharSequence charSequenceM2442 = null;
        String strM3841 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1856776058;
        int i13 = C4616.f14690;
        int i14 = C1128.f4106;
        int iM6983 = (i14 - C2105.m6981("ܶۜ")) * 127;
        int i15 = ((iM6983 ^ i13) * 19829) ^ 709950266;
        int i16 = iM6983 ^ (-469005017);
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
                    C2126.m7040();
                    C4117.m12364();
                    break;
                case -1980907171:
                case 1205605753:
                    C0714.m2805();
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("۬ᩳ") ^ i13;
                        i = ((iM2566 ^ i14) * (-28445)) ^ 1977427403;
                        i2 = -1070946423;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    } else {
                        strM19110 = strM19110;
                        sArr = sArr;
                        iM2567 = C0630.m2566("ۘ֨") ^ i14;
                        i3 = ((iM2567 ^ i13) * 18707) ^ (-234704230);
                        i4 = 1909763498;
                        i6 = iM2567 ^ i4;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    }
                    break;
                case -1965018080:
                case -1607149722:
                    break;
                case -1879225157:
                case -1329568863:
                    i10 = 60175;
                    iM6981 = (C0630.m2566("᩻֨") ^ i14) * (-69);
                    i3 = ((iM6981 ^ i13) * (-31533)) ^ 108164458;
                    i5 = -1815388190;
                    i6 = iM6981 ^ i5;
                    c19258 = c19258;
                    sArr2 = sArr2;
                    sArr = sArr;
                    str = strM19110;
                    i16 = i6;
                    i15 = i3;
                    strM19110 = str;
                    break;
                case -1706191069:
                case -352978870:
                    strM19110 = strM19110;
                    C0382.m1849(c19258, i19 ^ 2122831582);
                    sArr = f17617;
                    i11 = 11;
                    if (RunnableC0588.m2441() >= 0) {
                        iM2568 = C0630.m2566("ۡ᩸") ^ i13;
                        i3 = ((iM2568 ^ i14) * 27711) ^ (-107987638);
                        i7 = 1792724914;
                    } else {
                        iM2568 = (C0630.m2566("ܳۜ") + i14) * 45;
                        i3 = ((iM2568 ^ i13) * (-29337)) ^ 1636832685;
                        i7 = 1897052704;
                    }
                    i6 = iM2568 ^ i7;
                    str = strM19110;
                    i16 = i6;
                    i15 = i3;
                    strM19110 = str;
                    break;
                case -1676916243:
                case -1527129591:
                    sArr = sArr;
                    InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
                    c19258 = c19258;
                    sArr2 = sArr2;
                    strM19110 = C7106.m19110(f17617, 5, 3, i10);
                    if (interfaceC12344.getInt(strM19110, 0) != 2) {
                        iM6982 = (C0630.m2566("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM6982 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                    } else {
                        iM6982 = C2105.m6981("ܺۛ") ^ i14;
                        i8 = ((iM6982 ^ i13) * (-4061)) ^ 1566668232;
                        i9 = 1871327048;
                    }
                    i16 = iM6982 ^ i9;
                    i15 = i8;
                    c19258 = c19258;
                    sArr2 = sArr2;
                    sArr = sArr;
                    break;
                case -1550152587:
                case -586808647:
                    strM19110 = strM19110;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c19258 = c19258;
                    s = f17617[4];
                    s2 = 25438;
                    if (C3245.f10203 > 0) {
                        iM6981 = C2105.m6981("᩸֫") ^ i14;
                        i3 = ((iM6981 ^ i13) * 13751) ^ (-545975960);
                        i5 = -847086195;
                        i6 = iM6981 ^ i5;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    } else {
                        c19258 = c19258;
                        sArr2 = sArr2;
                        iM2567 = C0630.m2566("ۘ֨") ^ i14;
                        i3 = ((iM2567 ^ i13) * 18707) ^ (-234704230);
                        i4 = 1909763498;
                        i6 = iM2567 ^ i4;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    }
                    break;
                case -1357588630:
                case -537768055:
                    DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258.m44415();
                    c5715.f17619 = dialogInterfaceC0206M44415;
                    dialogInterfaceC0206M44415.m1449();
                    if (!C0483.m2124(c5715.f17619)) {
                        sArr2 = sArr2;
                        sArr = sArr;
                        c19258 = c19258;
                        iM6982 = (C0630.m2566("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM6982 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM6982 ^ i9;
                        i15 = i8;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                    } else {
                        iM2566 = C0630.m2566("֨ܰ") ^ i14;
                        i = ((iM2566 ^ i13) * 32551) ^ (-723776507);
                        i2 = 241851249;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1293813965:
                case -989511562:
                    strM19110 = strM19110;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c19258 = c19258;
                    if ((s * s2) - ((s * s) + 161772961) <= 0) {
                        iM6981 = (i13 - C0630.m2566("ܽ᩺")) * (-27);
                        i3 = ((iM6981 ^ i14) * (-19131)) ^ 1520337294;
                        i5 = -1990825761;
                    } else {
                        iM6981 = (C2105.m6981("ۚۚ") + i13) * (-127);
                        i3 = ((iM6981 ^ i14) * 12219) ^ 124155394;
                        i5 = 2023741857;
                    }
                    i6 = iM6981 ^ i5;
                    c19258 = c19258;
                    sArr2 = sArr2;
                    sArr = sArr;
                    str = strM19110;
                    i16 = i6;
                    i15 = i3;
                    strM19110 = str;
                    break;
                case -1185493362:
                case 1281490629:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (i13 - C0630.m2566("֫ۘ")) * 37;
                        i = ((iM2566 ^ i14) * (-20375)) ^ 742863194;
                        i2 = 1827092509;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    } else {
                        sArr = sArr;
                        int iM2569 = (C0630.m2566("᩵ۛ") + i13) * 45;
                        i16 = iM2569 ^ 586565026;
                        i15 = ((iM2569 ^ i14) * (-16365)) ^ (-1948652623);
                        sArr = sArr;
                        onClickListener = null;
                    }
                    break;
                case -1071934202:
                case 1492248534:
                    C1294.m4380(c19258, C2105.m6981(strM3841) ^ 2121740138, null);
                    if (C1047.m3599() < 0) {
                        onClickListener = new DialogInterface.OnClickListener() { // from class: l.۫֡᩷
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i20) {
                                int i21 = 1489649976;
                                int i22 = C2958.f9394;
                                int i23 = RunnableC0588.f2309;
                                int iM6984 = C2105.m6981("ܳᩳ") ^ i23;
                                int i24 = ((iM6984 ^ i22) * 2925) ^ 981011907;
                                int i25 = -710820208;
                                while (true) {
                                    i21 = ((((i21 ^ i22) * (-11623)) >> 31) & i24) ^ (iM6984 ^ i25);
                                    switch (i21) {
                                        case -1950440195:
                                        case -1257584912:
                                            if (C0798.f2919) {
                                                iM6984 = C0630.m2566("ᩴ۠") ^ i22;
                                                i24 = ((iM6984 ^ i23) * (-32323)) ^ (-571310909);
                                                i25 = -1351207202;
                                            } else {
                                                iM6984 = (C0630.m2566("ᩳܶ") + i23) * 25;
                                                i24 = ((iM6984 ^ i22) * 18195) ^ (-332209792);
                                                i25 = -226438482;
                                            }
                                            break;
                                        case -1830307914:
                                        case -197813036:
                                            if (C4117.f13076 <= 0) {
                                                iM6984 = (C2105.m6981("ܳ᩶") + i23) * 17;
                                                i24 = ((iM6984 ^ i22) * 21001) ^ 424746921;
                                                i25 = -158386809;
                                            } else {
                                                iM6984 = (C0630.m2566("ܰ۟") + i22) * 123;
                                                i24 = ((iM6984 ^ i23) * (-9453)) ^ 815905786;
                                                i25 = 1133757791;
                                            }
                                            break;
                                        case -1794154231:
                                        case 1039634963:
                                            if (C7811.m20844() != 0) {
                                                iM6984 = C2105.m6981("ܽܺ") ^ i22;
                                                i24 = ((iM6984 ^ i23) * 31563) ^ 31319200;
                                                i25 = -1879291033;
                                            } else {
                                                iM6984 = C0630.m2566("۟ܰ") ^ i23;
                                                i24 = ((iM6984 ^ i22) * (-7221)) ^ (-1461162579);
                                                i25 = 1981267523;
                                            }
                                            break;
                                        case -1698076945:
                                        case 1921546465:
                                            C5715.m16144(this.f36081);
                                            break;
                                        case -1600456222:
                                        case 1515706021:
                                            if (C1773.f6144 > 0) {
                                                iM6984 = (C2105.m6981("ܳ᩶") + i23) * 17;
                                                i24 = ((iM6984 ^ i22) * 21001) ^ 424746921;
                                                i25 = -158386809;
                                            } else {
                                                iM6984 = (C2105.m6981("ۢۨ") + i22) * (-117);
                                                i24 = ((iM6984 ^ i23) * 11935) ^ (-1921245545);
                                                i25 = -1251694300;
                                            }
                                            break;
                                        case -1021394460:
                                        case 1281013919:
                                            if (C3663.m11168() >= 0) {
                                                iM6984 = C0630.m2566("ۤۗ") ^ i23;
                                                i24 = ((iM6984 ^ i22) * (-5357)) ^ 583281565;
                                                i25 = 1242207575;
                                            } else {
                                                iM6984 = (C2105.m6981("ۛ᩸") ^ i22) * (-21);
                                                i24 = ((iM6984 ^ i23) * (-6539)) ^ 1499380687;
                                                i25 = -641326755;
                                            }
                                            break;
                                        case -1013988217:
                                        case -739133813:
                                            C4616.m13552();
                                            if (C2958.f9394 >= 0) {
                                                iM6984 = C0630.m2566("ᩴ۠") ^ i22;
                                                i24 = ((iM6984 ^ i23) * (-32323)) ^ (-571310909);
                                                i25 = -1351207202;
                                            } else {
                                                iM6984 = (C2105.m6981("ۢۨ") + i22) * (-117);
                                                i24 = ((iM6984 ^ i23) * 11935) ^ (-1921245545);
                                                i25 = -1251694300;
                                            }
                                            break;
                                        case -1011683936:
                                        case -414394264:
                                            if (C5695.f17556 >= 0) {
                                                iM6984 = (C2105.m6981("ۢۨ") + i22) * (-117);
                                                i24 = ((iM6984 ^ i23) * 11935) ^ (-1921245545);
                                                i25 = -1251694300;
                                            } else {
                                                iM6984 = C0630.m2566("ۨܶ") ^ i23;
                                                i24 = ((iM6984 ^ i22) * 22923) ^ (-2023176848);
                                                i25 = 186422615;
                                            }
                                            break;
                                        case -817644555:
                                        case 1568731729:
                                            C3683.m11222();
                                            iM6984 = (C2105.m6981("ۢۨ") + i22) * (-117);
                                            i24 = ((iM6984 ^ i23) * 11935) ^ (-1921245545);
                                            i25 = -1251694300;
                                            break;
                                        case -694600191:
                                        case 393913356:
                                            if (C0798.f2919) {
                                                iM6984 = C0630.m2566("ᩴ۠") ^ i22;
                                                i24 = ((iM6984 ^ i23) * (-32323)) ^ (-571310909);
                                                i25 = -1351207202;
                                            } else {
                                                iM6984 = (i23 - C0630.m2566("ۢᩴ")) * 73;
                                                i24 = ((iM6984 ^ i22) * (-13585)) ^ 1634916265;
                                                i25 = 215805599;
                                            }
                                            break;
                                        case -660175533:
                                        case -269705763:
                                            if (C2520.f8000 >= 0) {
                                                iM6984 = C0630.m2566("ۤۗ") ^ i23;
                                                i24 = ((iM6984 ^ i22) * (-5357)) ^ 583281565;
                                                i25 = 1242207575;
                                            } else {
                                                iM6984 = C2105.m6981("᩸ܽ") ^ i22;
                                                i24 = ((iM6984 ^ i23) * (-17235)) ^ 1160815915;
                                                i25 = -1362319536;
                                            }
                                            break;
                                        case -464820070:
                                        case -843907:
                                            if (C0237.f1507 != 0) {
                                                iM6984 = C2105.m6981("ܽܺ") ^ i22;
                                                i24 = ((iM6984 ^ i23) * 31563) ^ 31319200;
                                                i25 = -1879291033;
                                            } else {
                                                iM6984 = C0630.m2566("ۗۛ") ^ i22;
                                                i24 = ((iM6984 ^ i23) * (-28263)) ^ 1612224626;
                                                i25 = -2018871150;
                                            }
                                            break;
                                        case -76780500:
                                        case 374197539:
                                            if (C0050.f910 >= 0) {
                                                iM6984 = C2105.m6981("ܽܺ") ^ i22;
                                                i24 = ((iM6984 ^ i23) * 31563) ^ 31319200;
                                                i25 = -1879291033;
                                            } else {
                                                iM6984 = C2105.m6981("֫ۢ") ^ i22;
                                                i24 = ((iM6984 ^ i23) * (-71)) ^ 239833210;
                                                i25 = -497498100;
                                            }
                                            break;
                                        case -11346022:
                                        case 2061399661:
                                            C0714.m2805();
                                            if (C0483.f2088 < 0) {
                                                iM6984 = C0630.m2566("ۤۗ") ^ i23;
                                                i24 = ((iM6984 ^ i22) * (-5357)) ^ 583281565;
                                                i25 = 1242207575;
                                            } else {
                                                iM6984 = (C2105.m6981("ۢۨ") + i22) * (-117);
                                                i24 = ((iM6984 ^ i23) * 11935) ^ (-1921245545);
                                                i25 = -1251694300;
                                            }
                                            break;
                                        case 1137296859:
                                        case 2072511996:
                                            C3911.m11924();
                                            C2958.m9034();
                                            break;
                                        default:
                                            if (C2126.m7040()) {
                                                iM6984 = C0630.m2566("ᩴ۠") ^ i22;
                                                i24 = ((iM6984 ^ i23) * (-32323)) ^ (-571310909);
                                                i25 = -1351207202;
                                            } else {
                                                iM6984 = (i23 - C2105.m6981("ۤܳ")) * (-73);
                                                i24 = ((iM6984 ^ i22) * 9237) ^ (-173139253);
                                                i25 = -724442240;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        };
                        sArr2 = f17617;
                        i17 = 17;
                        i18 = 3;
                        if (C5695.f17556 < 0) {
                            iM2566 = C0630.m2566("ۛۖ") ^ i13;
                            i = ((iM2566 ^ i14) * 21031) ^ (-2042775892);
                            i2 = 1316846595;
                            i16 = iM2566 ^ i2;
                            i15 = i;
                        } else {
                            strM19110 = strM19110;
                            sArr = sArr;
                            iM2567 = C0630.m2566("ۘ֨") ^ i14;
                            i3 = ((iM2567 ^ i13) * 18707) ^ (-234704230);
                            i4 = 1909763498;
                            i6 = iM2567 ^ i4;
                            sArr = sArr;
                            str = strM19110;
                            i16 = i6;
                            i15 = i3;
                            strM19110 = str;
                        }
                    } else {
                        sArr = sArr;
                        int iM25610 = (C0630.m2566("᩵ۛ") + i13) * 45;
                        i16 = iM25610 ^ 586565026;
                        i15 = ((iM25610 ^ i14) * (-16365)) ^ (-1948652623);
                        sArr = sArr;
                        onClickListener = null;
                    }
                    break;
                case -906358971:
                case 1994435494:
                    strM19110 = strM19110;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c19258 = c19258;
                    if (!c5715.f17626) {
                        iM6981 = (C0630.m2566("ۙۛ") + i13) * 101;
                        i3 = ((iM6981 ^ i14) * (-31645)) ^ (-1265782647);
                        i5 = 956349292;
                        i6 = iM6981 ^ i5;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    } else {
                        strM19110 = strM19110;
                        iM6982 = (C0630.m2566("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM6982 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM6982 ^ i9;
                        i15 = i8;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                    }
                    break;
                case -726909039:
                case 1757837720:
                    C5695.m16035(c19258, C0630.m2566(C1420.m4902(sArr2, i17, i18, i10)) ^ 2102617499, onClickListener);
                    if (C0714.f2697 >= 0) {
                        iM2566 = (i13 - C0630.m2566("֫ۘ")) * 37;
                        i = ((iM2566 ^ i14) * (-20375)) ^ 742863194;
                        i2 = 1827092509;
                    } else {
                        iM2566 = (C2105.m6981("ܶ֨") ^ i14) * (-105);
                        i = ((iM2566 ^ i13) * (-18619)) ^ (-1974128403);
                        i2 = 778711068;
                    }
                    i16 = iM2566 ^ i2;
                    i15 = i;
                    break;
                case -609476676:
                case -492535589:
                    abstractC16157M46962.mo38090(textView, C0050.m947(charSequenceM2442));
                    C1916.m6302(ViewOnClickListenerC1958.m6438(ApplicationC20075.f65008).mo25853(3, strM19110));
                    sArr2 = sArr2;
                    sArr = sArr;
                    c19258 = c19258;
                    iM6982 = (C0630.m2566("֫ۤ") ^ i14) * (-7);
                    i8 = ((iM6982 ^ i13) * 16617) ^ (-356719753);
                    i9 = 1321145065;
                    i16 = iM6982 ^ i9;
                    i15 = i8;
                    c19258 = c19258;
                    sArr2 = sArr2;
                    sArr = sArr;
                    break;
                case -486011970:
                case 238160232:
                    strM19110 = strM19110;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c19258 = c19258;
                    if (!c5715.f17624.hasWindowFocus()) {
                        strM19110 = strM19110;
                        iM6982 = (C0630.m2566("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM6982 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM6982 ^ i9;
                        i15 = i8;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                    } else {
                        iM6981 = (C0630.m2566("᩺ᩳ") ^ i13) * (-109);
                        i3 = ((iM6981 ^ i14) * 26253) ^ (-536358157);
                        i5 = 526749974;
                        i6 = iM6981 ^ i5;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    }
                    break;
                case -426670002:
                case -214607672:
                    C4263.m12819();
                    if (C3019.f9544 >= 0) {
                        strM19110 = strM19110;
                        sArr = sArr;
                        iM2567 = C0630.m2566("ۘ֨") ^ i14;
                        i3 = ((iM2567 ^ i13) * 18707) ^ (-234704230);
                        i4 = 1909763498;
                        i6 = iM2567 ^ i4;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    } else {
                        sArr = sArr;
                        int iM25611 = (C0630.m2566("᩵ۛ") + i13) * 45;
                        i16 = iM25611 ^ 586565026;
                        i15 = ((iM25611 ^ i14) * (-16365)) ^ (-1948652623);
                        sArr = sArr;
                        onClickListener = null;
                    }
                    break;
                case -289904352:
                case 2035315634:
                    C4159.m12565();
                    sArr = sArr;
                    int iM25612 = (C0630.m2566("᩵ۛ") + i13) * 45;
                    i16 = iM25612 ^ 586565026;
                    i15 = ((iM25612 ^ i14) * (-16365)) ^ (-1948652623);
                    sArr = sArr;
                    onClickListener = null;
                    break;
                case -289041902:
                case -156554635:
                    strM19110 = strM19110;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c19258 = c19258;
                    if (!C4117.m12349(main)) {
                        iM6981 = (C2105.m6981("᩹ܳ") ^ i14) * (-7);
                        i3 = ((iM6981 ^ i13) * (-9067)) ^ (-1652384597);
                        i5 = -937044845;
                        i6 = iM6981 ^ i5;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    } else {
                        strM19110 = strM19110;
                        iM6982 = (C0630.m2566("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM6982 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM6982 ^ i9;
                        i15 = i8;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                    }
                    break;
                case -227113219:
                case 1663016912:
                    i10 = 22209;
                    iM6981 = (C0630.m2566("᩻֨") ^ i14) * (-69);
                    i3 = ((iM6981 ^ i13) * (-31533)) ^ 108164458;
                    i5 = -1815388190;
                    i6 = iM6981 ^ i5;
                    c19258 = c19258;
                    sArr2 = sArr2;
                    sArr = sArr;
                    str = strM19110;
                    i16 = i6;
                    i15 = i3;
                    strM19110 = str;
                    break;
                case -216893591:
                case 540335310:
                    strM3841 = C1128.m3841(f17617, 14, 3, i10);
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("ܶۧ") ^ i14;
                        i = ((iM2566 ^ i13) * 18993) ^ 994165201;
                        i2 = 400974165;
                    } else {
                        iM2566 = (i14 - C2105.m6981("۠֨")) * (-39);
                        i = ((iM2566 ^ i13) * 16003) ^ 266084752;
                        i2 = 1948233734;
                    }
                    i16 = iM2566 ^ i2;
                    i15 = i;
                    break;
                case -169085118:
                case 734516215:
                    if (C3245.m9925() == 0) {
                        iM2566 = C2105.m6981("۬ᩳ") ^ i13;
                        i = ((iM2566 ^ i14) * (-28445)) ^ 1977427403;
                        i2 = -1070946423;
                    } else {
                        iM2566 = C2105.m6981("᩵ܽ") ^ i14;
                        i = ((iM2566 ^ i13) * (-18157)) ^ 1166932228;
                        i2 = -2123694595;
                    }
                    i16 = iM2566 ^ i2;
                    i15 = i;
                    break;
                case -61771863:
                case 1903553862:
                    strM19110 = strM19110;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c19258 = c19258;
                    if (c5715.f17621 != 0) {
                        strM19110 = strM19110;
                        iM6982 = (C0630.m2566("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM6982 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM6982 ^ i9;
                        i15 = i8;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                    } else {
                        iM6981 = (C2105.m6981("ۗ֡") + i14) * (-73);
                        i3 = ((iM6981 ^ i13) * (-20353)) ^ 1656106533;
                        i5 = 2094933100;
                        i6 = iM6981 ^ i5;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    }
                    break;
                case -11250480:
                case 208178961:
                    strM19110 = strM19110;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c19258 = c19258;
                    if (!C4117.m12356(main).mo19832().m33028(EnumC13728.RESUMED)) {
                        strM19110 = strM19110;
                        iM6982 = (C0630.m2566("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM6982 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM6982 ^ i9;
                        i15 = i8;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                    } else {
                        iM6981 = C2105.m6981("۫ᩴ") ^ i13;
                        i3 = ((iM6981 ^ i14) * 30383) ^ 1463899161;
                        i5 = 680077121;
                        i6 = iM6981 ^ i5;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    }
                    break;
                case -2804296:
                case 423506676:
                    abstractC16157M46962 = C20500.m46962(contextM1432, true);
                    charSequenceM2442 = RunnableC0588.m2442(textView);
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = C2105.m6981("᩵ܽ") ^ i14;
                        i = ((iM2566 ^ i13) * (-18157)) ^ 1166932228;
                        i2 = -2123694595;
                    } else {
                        iM2566 = (C0630.m2566("ۢۛ") ^ i14) * 31;
                        i = ((iM2566 ^ i13) * (-22999)) ^ 1121215264;
                        i2 = -742736493;
                    }
                    i16 = iM2566 ^ i2;
                    i15 = i;
                    break;
                case 106389780:
                case 526549228:
                    C1128.m3851();
                    if (!C21923.m49329()) {
                        iM2566 = (i13 - C0630.m2566("֫ۘ")) * 37;
                        i = ((iM2566 ^ i14) * (-20375)) ^ 742863194;
                        i2 = 1827092509;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    } else {
                        strM19110 = strM19110;
                        iM2568 = C0630.m2566("ۡ᩸") ^ i13;
                        i3 = ((iM2568 ^ i14) * 27711) ^ (-107987638);
                        i7 = 1792724914;
                        i6 = iM2568 ^ i7;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    }
                    break;
                case 116320817:
                case 1372101300:
                    DialogInterfaceC0206 dialogInterfaceC0206 = c5715.f17619;
                    textView = (TextView) dialogInterfaceC0206.m1433(R.id.message);
                    contextM1432 = dialogInterfaceC0206.m1432();
                    if (C2167.m7155()) {
                        iM2566 = (i13 - C0630.m2566("֫ۘ")) * 37;
                        i = ((iM2566 ^ i14) * (-20375)) ^ 742863194;
                        i2 = 1827092509;
                    } else {
                        iM2566 = C2105.m6981("ۜ۟") ^ i13;
                        i = ((iM2566 ^ i14) * (-22699)) ^ (-1780317589);
                        i2 = -647089925;
                    }
                    i16 = iM2566 ^ i2;
                    i15 = i;
                    break;
                case 541533061:
                case 740785482:
                    strM19110 = strM19110;
                    sArr2 = sArr2;
                    sArr = sArr;
                    c19258 = c19258;
                    Main main2 = c5715.f17625;
                    if (!c5715.f17620) {
                        int iM6984 = (C2105.m6981("᩵ۖ") + i13) * (-37);
                        main = main2;
                        i15 = ((iM6984 ^ i14) * (-31101)) ^ (-1049544422);
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                        str = strM19110;
                        i16 = iM6984 ^ (-1348777890);
                        strM19110 = str;
                    } else {
                        main = main2;
                        strM19110 = strM19110;
                        iM6982 = (C0630.m2566("֫ۤ") ^ i14) * (-7);
                        i8 = ((iM6982 ^ i13) * 16617) ^ (-356719753);
                        i9 = 1321145065;
                        i16 = iM6982 ^ i9;
                        i15 = i8;
                        c19258 = c19258;
                        sArr2 = sArr2;
                        sArr = sArr;
                    }
                    break;
                case 1690867570:
                case 1729023585:
                    strM19110 = strM19110;
                    sArr = sArr;
                    C19258 c19258M2130 = C0483.m2130(main);
                    int iM6985 = C2105.m6981(C3683.m11225(f17617, 8, 3, i10));
                    if (C0382.f1805) {
                        int iM6986 = (C2105.m6981("ܿ᩻") + i13) * 109;
                        sArr = sArr;
                        i19 = iM6985;
                        i15 = ((iM6986 ^ i14) * (-14285)) ^ (-1790632571);
                        c19258 = c19258M2130;
                        i16 = iM6986 ^ (-1801635098);
                        strM19110 = strM19110;
                    } else {
                        c19258 = c19258M2130;
                        i19 = iM6985;
                        iM2567 = C0630.m2566("ۘ֨") ^ i14;
                        i3 = ((iM2567 ^ i13) * 18707) ^ (-234704230);
                        i4 = 1909763498;
                        i6 = iM2567 ^ i4;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    }
                    break;
                default:
                    sArr = sArr;
                    C7106.m19114(c19258, C0630.m2566(C21923.m49334(sArr, i11, 3, i10)) ^ 2129483383);
                    if (!C0798.f2919) {
                        iM2567 = (C0630.m2566("ۚۙ") + i13) * 75;
                        strM19110 = strM19110;
                        i3 = ((iM2567 ^ i14) * 13667) ^ (-1324116752);
                        i4 = -1437070628;
                        i6 = iM2567 ^ i4;
                        sArr = sArr;
                        str = strM19110;
                        i16 = i6;
                        i15 = i3;
                        strM19110 = str;
                    } else {
                        int iM25613 = (C0630.m2566("᩵ۛ") + i13) * 45;
                        i16 = iM25613 ^ 586565026;
                        i15 = ((iM25613 ^ i14) * (-16365)) ^ (-1948652623);
                        sArr = sArr;
                        onClickListener = null;
                    }
                    break;
            }
            return;
        }
    }
}
