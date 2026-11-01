package p067l;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alipay.sdk.p010m.p050t0.C0215b;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.math.p080ec.rfc8032.Ed448;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۗܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L61J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC5549 extends ActivityC4388 implements InterfaceC14936 {

    /* JADX INFO: renamed from: ֫ۧ */
    public static final /* synthetic */ int f13384 = 0;

    /* JADX INFO: renamed from: ۧۧ */
    public static final C7350 f13385;

    /* JADX INFO: renamed from: ܶܳ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f81933;

    /* JADX INFO: renamed from: ܽۧ */
    public static WeakReference f13386;

    /* JADX INFO: renamed from: ֡֫ */
    public boolean f13387;

    /* JADX INFO: renamed from: ֨֫ */
    public Intent f13388;

    /* JADX INFO: renamed from: ۗ֫ */
    public boolean f13389;

    /* JADX INFO: renamed from: ۙ֫ */
    public volatile Runnable f13390;

    /* JADX INFO: renamed from: ۚ֫ */
    public boolean f13391;

    /* JADX INFO: renamed from: ۛ֫ */
    public C1326 f13392;

    /* JADX INFO: renamed from: ۟֫ */
    public ArrayList f13393;

    /* JADX INFO: renamed from: ۠֫ */
    public boolean f13394;

    /* JADX INFO: renamed from: ۤ֫ */
    public View f13395;

    /* JADX INFO: renamed from: ۨ֫ */
    public boolean f13396;

    /* JADX INFO: renamed from: ۫֫ */
    public volatile C2942 f13397;

    /* JADX INFO: renamed from: ۬֫ */
    public final Set f13398;

    /* JADX INFO: renamed from: ܰ֫ */
    public AbstractC17043 f13399;

    /* JADX INFO: renamed from: ܶ֫ */
    public C7741 f13400;

    /* JADX INFO: renamed from: ᩵֫ */
    public ViewOnClickListenerC1309 f13401;

    /* JADX INFO: renamed from: ᩶֫ */
    public volatile boolean f13402;

    /* JADX INFO: renamed from: ᩸֫ */
    public C7741 f13403;

    /* JADX INFO: renamed from: ᩹֫ */
    public InterfaceC6386 f13404;

    /* JADX INFO: renamed from: ᩺֫ */
    public C1459 f13405;

    /* JADX INFO: renamed from: ֫ */
    public native View m12252(int i);

    /* JADX INFO: renamed from: ۚ */
    public abstract String mo119();

    /* JADX INFO: renamed from: ᩻ */
    public /* synthetic */ boolean mo133() {
        return false;
    }

    @Override // p067l.ActivityC3069, p067l.ActivityC2023, android.app.Activity, p067l.InterfaceC0981
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 376185616;
        int i3 = C0989.f81920;
        int i4 = C0877.f81843;
        int iM55680 = C0873.m55680("ۨᩳ") ^ i3;
        int i5 = ((iM55680 ^ i4) * 25127) ^ 777002926;
        int i6 = -194054602;
        while (true) {
            i2 = ((((i2 ^ i4) * 27023) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2085931449:
                case 919997172:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("᩷֡") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-14915)) ^ (-69497417);
                        i6 = 582608859;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ᩴۗ")) * 7;
                        i5 = ((iM55680 ^ i4) * (-32585)) ^ 2041492769;
                        i6 = 1555000723;
                    }
                    break;
                case -1903628766:
                case -220817861:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    break;
                case -1854837555:
                case 1433128950:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("᩷֡") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-14915)) ^ (-69497417);
                        i6 = 582608859;
                    } else {
                        iM55680 = (i3 - C0946.m55979("۫ۢ")) * (-109);
                        i5 = ((iM55680 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    }
                    break;
                case -1842196367:
                case -886916665:
                    if (C0930.m55885() <= 0) {
                        iM55680 = (i4 - C0873.m55680("ܿܺ")) * (-109);
                        i5 = ((iM55680 ^ i3) * 31009) ^ 1699926459;
                        i6 = 1815999310;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ᩳܺ")) * 99;
                        i5 = ((iM55680 ^ i4) * (-25243)) ^ 135912485;
                        i6 = 1918093585;
                    }
                    break;
                case -1826827971:
                case 594723490:
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0946.m55979("᩸֨") + i4) * (-59);
                        i5 = ((iM55680 ^ i3) * 31769) ^ (-291840037);
                        i6 = -1048205467;
                    } else {
                        iM55680 = C0873.m55680("ܰܶ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 4551) ^ 1752738658;
                        i6 = 1729129696;
                    }
                    break;
                case -1639638912:
                case -1533703704:
                    if (C0949.f81897 >= 0) {
                        iM55680 = (i3 - C0946.m55979("۫ۢ")) * (-109);
                        i5 = ((iM55680 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۨܺ")) * 19;
                        i5 = ((iM55680 ^ i3) * (-15949)) ^ (-906868819);
                        i6 = 909963784;
                    }
                    break;
                case -1393178676:
                case -635618565:
                    C1025.m56230();
                    if (C0898.f81858 <= 0) {
                        iM55680 = (i3 - C0946.m55979("۫ۢ")) * (-109);
                        i5 = ((iM55680 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ܿܺ")) * (-109);
                        i5 = ((iM55680 ^ i3) * 31009) ^ 1699926459;
                        i6 = 1815999310;
                    }
                    break;
                case -1375651648:
                case 74982538:
                    if (C1044.m56286() <= 0) {
                        iM55680 = (C0946.m55979("᩸֨") + i4) * (-59);
                        i5 = ((iM55680 ^ i3) * 31769) ^ (-291840037);
                        i6 = -1048205467;
                    } else {
                        iM55680 = C0873.m55680("᩺ۛ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-1117)) ^ 1876541733;
                        i6 = 1912171028;
                    }
                    break;
                case -1256296029:
                case 21814314:
                    if (C0947.m55997()) {
                        iM55680 = (i3 - C0946.m55979("۫ۢ")) * (-109);
                        i5 = ((iM55680 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    } else {
                        iM55680 = C0946.m55979("ۡ᩺") ^ i4;
                        i5 = ((iM55680 ^ i3) * 20899) ^ (-1843780634);
                        i6 = 491988121;
                    }
                    break;
                case -1187338234:
                case -1175293671:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("ۛۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-4717)) ^ 42870719;
                        i6 = -1605775865;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ܿ᩷")) * (-55);
                        i5 = ((iM55680 ^ i4) * (-497)) ^ 1186977861;
                        i6 = 1668215107;
                    }
                    break;
                case -1184276159:
                case 1376463877:
                    if (C0892.f81851) {
                        iM55680 = (C0873.m55680("ۧۙ") ^ i4) * (-69);
                        i5 = ((iM55680 ^ i3) * 7405) ^ (-1445024622);
                        i6 = 976908981;
                    } else {
                        iM55680 = C0873.m55680("ۛۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-4717)) ^ 42870719;
                        i6 = -1605775865;
                    }
                    break;
                case -641633585:
                case 351954159:
                    C0967.m56074();
                    iM55680 = (i4 - C0873.m55680("ܿܺ")) * (-109);
                    i5 = ((iM55680 ^ i3) * 31009) ^ 1699926459;
                    i6 = 1815999310;
                    break;
                case -277729153:
                case 1229219865:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (i3 - C0946.m55979("۫ۢ")) * (-109);
                        i5 = ((iM55680 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    } else {
                        iM55680 = (C0946.m55979("ᩴ᩺") + i4) * (-31);
                        i5 = ((iM55680 ^ i3) * 20197) ^ 2076482068;
                        i6 = -573775956;
                    }
                    break;
                case -255119847:
                case -226282204:
                    C1028.m56247();
                    if (C0882.m55710() == 0) {
                        iM55680 = C0873.m55680("ۛۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-4717)) ^ 42870719;
                        i6 = -1605775865;
                    } else {
                        iM55680 = (i3 - C0946.m55979("۫ۢ")) * (-109);
                        i5 = ((iM55680 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    }
                    break;
                case 76114600:
                case 937730434:
                    C1017.m56187();
                    C1229.m56410();
                    break;
                case 432638959:
                case 1743407711:
                    if (C1036.m56257() <= 0) {
                        iM55680 = C0873.m55680("ۛۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-4717)) ^ 42870719;
                        i6 = -1605775865;
                    } else {
                        iM55680 = (C0873.m55680("ۘܽ") ^ i4) * (-15);
                        i5 = ((iM55680 ^ i3) * (-22855)) ^ 1092516221;
                        i6 = 122851640;
                    }
                    break;
                case 503022157:
                case 1255855256:
                    C5664.m12612(this, true);
                    break;
                default:
                    if (i == 23680) {
                        iM55680 = C0946.m55979("᩺۫") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-31991)) ^ 1897550022;
                        i6 = -1074055746;
                    } else {
                        iM55680 = C0873.m55680("۠ᩴ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 12651) ^ 16324499;
                        i6 = 2090427314;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12272(View view) {
        AbstractC9381 abstractC9381M56294 = null;
        EnumC15415 enumC15415Mo21805 = null;
        int i = -2071266513;
        int i2 = C1124.f82007;
        int i3 = ViewOnClickListenerC0939.f81888;
        int iM55979 = C0946.m55979("ܳᩴ") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-24365)) ^ 2141417400;
        int i5 = 1715757382;
        while (true) {
            i = ((((i ^ i3) * 21429) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1955350352:
                case 678138139:
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("ۖۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 19071) ^ 617705010;
                        i5 = 1711907120;
                    } else {
                        iM55979 = C0873.m55680("᩶۫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 21271) ^ (-873543200);
                        i5 = -1900545547;
                    }
                    break;
                case -1882708161:
                case 244193637:
                    this.f13395 = view;
                    abstractC9381M56294 = C1046.m56294(this);
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ܶܿ") + i2) * (-13);
                        i4 = ((iM55979 ^ i3) * 7201) ^ 267450518;
                        i5 = 1428848925;
                    } else {
                        iM55979 = (C0946.m55979("۫ܿ") + i3) * 13;
                        i4 = ((iM55979 ^ i2) * 17791) ^ 1016744308;
                        i5 = -714309574;
                    }
                    break;
                case -1881068340:
                case -168415913:
                    if (C0955.f81898) {
                        iM55979 = (C0873.m55680("ܶܿ") + i2) * (-13);
                        i4 = ((iM55979 ^ i3) * 7201) ^ 267450518;
                        i5 = 1428848925;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩻ۢ")) * 119;
                        i4 = ((iM55979 ^ i2) * 20621) ^ (-917419664);
                        i5 = -1219195353;
                    }
                    break;
                case -1867114283:
                case 1284795113:
                    enumC15415Mo21805 = abstractC9381M56294.mo21805();
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("ܶۚ") ^ i3) * (-63);
                        i4 = ((iM55979 ^ i2) * 31657) ^ (-1620582260);
                        i5 = 1247214909;
                    } else {
                        iM55979 = C0873.m55680("ۡ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11635) ^ 1443160173;
                        i5 = 371246276;
                    }
                    break;
                case -1666885540:
                case -1404829129:
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("ۛ᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8067) ^ 2097144621;
                        i5 = 1164089900;
                    } else {
                        iM55979 = C0946.m55979("ܳ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-31867)) ^ (-579541120);
                        i5 = -1352191575;
                    }
                    break;
                case -1592974723:
                case -1079005988:
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0946.m55979("ۖۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 19071) ^ 617705010;
                        i5 = 1711907120;
                    } else {
                        iM55979 = C0946.m55979("ܿۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4547)) ^ 1398848313;
                        i5 = -1253261915;
                    }
                    break;
                case -1577556965:
                case 1484487310:
                    RunnableC1014.m56177();
                    C0917.m55854();
                    return;
                case -1568566741:
                case 841670614:
                    RunnableC0897.m55784();
                    C0892.m55749();
                    iM55979 = C0946.m55979("ܿۛ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-4547)) ^ 1398848313;
                    i5 = -1253261915;
                    break;
                case -1342148207:
                case 2029816749:
                    if (view instanceof C14146) {
                        iM55979 = (i3 - C0873.m55680("ۙ֨")) * (-35);
                        i4 = ((iM55979 ^ i2) * 21893) ^ (-2102658399);
                        i5 = 1907376461;
                    } else {
                        iM55979 = (C0873.m55680("ۙ᩶") + i2) * (-89);
                        i4 = ((iM55979 ^ i3) * 25867) ^ 2143129330;
                        i5 = 1857391030;
                    }
                    break;
                case -1296864897:
                case -1076753282:
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0946.m55979("ܿۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4547)) ^ 1398848313;
                        i5 = -1253261915;
                    } else {
                        iM55979 = C0946.m55979("ᩳ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 6683) ^ (-1171892160);
                        i5 = 649255777;
                    }
                    break;
                case -1189539694:
                case 1112598621:
                    if (C0892.m55749()) {
                        iM55979 = (i2 - C0873.m55680("۟۬")) * (-81);
                        i4 = ((iM55979 ^ i3) * 29601) ^ 13820893;
                        i5 = -1993813541;
                    } else {
                        iM55979 = C0946.m55979("ۖۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 19071) ^ 617705010;
                        i5 = 1711907120;
                    }
                    break;
                case -382252102:
                case 1406037697:
                    if (view instanceof C9471) {
                        iM55979 = (i3 - C0873.m55680("ۙ֨")) * (-35);
                        i4 = ((iM55979 ^ i2) * 21893) ^ (-2102658399);
                        i5 = 1907376461;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩷ۚ")) * (-3);
                        i4 = ((iM55979 ^ i2) * (-1551)) ^ 1319073309;
                        i5 = 479770263;
                    }
                    break;
                case -135618479:
                case 608622477:
                    f13386 = new WeakReference(view);
                    iM55979 = (C0946.m55979("᩻ۗ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM55979 ^ i2) * (-26009)) ^ 2008696710;
                    i5 = 1957102110;
                    break;
                case -82375899:
                case 372434026:
                    if (enumC15415Mo21805.m35142(EnumC15415.STARTED)) {
                        iM55979 = C0873.m55680("ۚۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30203) ^ 354615542;
                        i5 = 450714424;
                    } else {
                        iM55979 = (C0946.m55979("᩻ۗ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i2) * (-26009)) ^ 2008696710;
                        i5 = 1957102110;
                    }
                    break;
                case 17060014:
                case 977564230:
                    C1028.m56247();
                    if (C1012.f81938 < 0) {
                        iM55979 = C0946.m55979("ۛ᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8067) ^ 2097144621;
                        i5 = 1164089900;
                    } else {
                        iM55979 = C0946.m55979("ܿۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4547)) ^ 1398848313;
                        i5 = -1253261915;
                    }
                    break;
                case 289525989:
                case 1139114770:
                    C0863.m55643();
                    if (!C0917.f81868) {
                        iM55979 = C0946.m55979("ܿۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4547)) ^ 1398848313;
                        i5 = -1253261915;
                    } else {
                        iM55979 = (C0873.m55680("ܶܿ") + i2) * (-13);
                        i4 = ((iM55979 ^ i3) * 7201) ^ 267450518;
                        i5 = 1428848925;
                    }
                    break;
                case 520516531:
                case 1496570349:
                    Class clsM55962 = AbstractC0942.m55962(view);
                    if (C0863.f81833 > 0) {
                        throw new IllegalArgumentException(C0863.m55639(clsM55962));
                    }
                    iM55979 = C0946.m55979("ۖۧ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 19071) ^ 617705010;
                    i5 = 1711907120;
                    break;
                case 605288727:
                case 1455517253:
                    return;
                case 645408678:
                case 1922189006:
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0946.m55979("ܿۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4547)) ^ 1398848313;
                        i5 = -1253261915;
                    } else {
                        iM55979 = (C0873.m55680("֫ܰ") + i2) * (-121);
                        i4 = ((iM55979 ^ i3) * (-26159)) ^ 1384329880;
                        i5 = 1870293096;
                    }
                    break;
                default:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("ۛ᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8067) ^ 2097144621;
                        i5 = 1164089900;
                    } else {
                        iM55979 = C0873.m55680("ۖ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 16661) ^ 1358353237;
                        i5 = -426761428;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo113(Intent intent) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12253(int i, int i2, boolean z) {
        int i3 = 1498733920;
        int i4 = C0930.f81879;
        int i5 = C0866.f81837;
        int iM55979 = (C0946.m55979("֨ܶ") ^ i4) * (-69);
        int i6 = ((iM55979 ^ i5) * 24789) ^ 808255392;
        int i7 = -1456730602;
        while (true) {
            i3 = ((((i3 ^ i5) * 661) >> 31) & i6) ^ (iM55979 ^ i7);
            switch (i3) {
                case -2025688093:
                case -1409732461:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("ܽۛ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-27089)) ^ (-1964808193);
                        i7 = -1034679147;
                    } else {
                        iM55979 = (C0946.m55979("ᩳ᩶") ^ i5) * 5;
                        i6 = ((iM55979 ^ i4) * 18619) ^ (-462183688);
                        i7 = 289672539;
                    }
                    break;
                case -1810154868:
                case 1036841660:
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("ܳۖ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 5625) ^ 682071875;
                        i7 = -902893308;
                    } else {
                        iM55979 = C0946.m55979("᩶ܺ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 21509) ^ 1690631827;
                        i7 = 1806794405;
                    }
                    break;
                case -1616563912:
                case -559050293:
                    if (!C0937.f81884) {
                        iM55979 = C0946.m55979("ۨ۟") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-17547)) ^ (-1615351278);
                        i7 = -591406561;
                    } else {
                        iM55979 = C0873.m55680("ܽۛ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-27089)) ^ (-1964808193);
                        i7 = -1034679147;
                    }
                    break;
                case -1534498924:
                case 1970702998:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("ۖ֫") + i5) * (-121);
                        i6 = ((iM55979 ^ i4) * (-15203)) ^ 1204109525;
                        i7 = 406892560;
                    } else {
                        iM55979 = C0946.m55979("ۨ۟") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-17547)) ^ (-1615351278);
                        i7 = -591406561;
                    }
                    break;
                case -1157443209:
                case 181175017:
                    if (C0861.f81831) {
                        iM55979 = (C0946.m55979("᩵֫") + i5) * 33;
                        i6 = ((iM55979 ^ i4) * 25585) ^ 1141003631;
                        i7 = 1744943722;
                    } else {
                        iM55979 = C0946.m55979("ܳۖ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 5625) ^ 682071875;
                        i7 = -902893308;
                    }
                    break;
                case -877244375:
                case 148028274:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0946.m55979("ܳۖ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 5625) ^ 682071875;
                        i7 = -902893308;
                    } else {
                        iM55979 = C0946.m55979("ۙ۫") ^ i4;
                        i6 = ((iM55979 ^ i5) * 6207) ^ 1083886361;
                        i7 = 1933847557;
                    }
                    break;
                case -805772610:
                case 1590324569:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("ۨ۟") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-17547)) ^ (-1615351278);
                        i7 = -591406561;
                    } else {
                        iM55979 = C0873.m55680("ۨۘ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 15451) ^ (-1822628519);
                        i7 = -1782616975;
                    }
                    break;
                case -703508490:
                case 1815319206:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0946.m55979("ۖ֫") + i5) * (-121);
                        i6 = ((iM55979 ^ i4) * (-15203)) ^ 1204109525;
                        i7 = 406892560;
                    } else {
                        iM55979 = C0946.m55979("ۧᩳ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 16861) ^ 1326964773;
                        i7 = -487631661;
                    }
                    break;
                case -54305102:
                case 1838274962:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("ۨ۟") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-17547)) ^ (-1615351278);
                        i7 = -591406561;
                    } else {
                        iM55979 = (C0873.m55680("ۛۚ") + i4) * 19;
                        i6 = ((iM55979 ^ i5) * (-22695)) ^ 425790524;
                        i7 = -1374698823;
                    }
                    break;
                case 60575979:
                case 73547539:
                    C0927.m55873();
                    C1124.m56367();
                    break;
                case 98138438:
                case 1757645627:
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("ۖ֨") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-25703)) ^ 1645360525;
                        i7 = 1540043506;
                    } else {
                        iM55979 = C0873.m55680("ۧܳ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-12139)) ^ 1143244653;
                        i7 = 601937309;
                    }
                    break;
                case 353190148:
                case 924430337:
                    if (!C0927.f81875) {
                        iM55979 = C0873.m55680("ܽۛ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-27089)) ^ (-1964808193);
                        i7 = -1034679147;
                    } else {
                        iM55979 = C0873.m55680("ۖ֨") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-25703)) ^ 1645360525;
                        i7 = 1540043506;
                    }
                    break;
                case 361832017:
                case 1256486075:
                    if (C0890.m55740()) {
                        iM55979 = C0946.m55979("ۢ᩷") ^ i4;
                        i6 = ((iM55979 ^ i5) * 23995) ^ (-252734405);
                        i7 = 644822353;
                    } else {
                        iM55979 = C0946.m55979("ۨ۟") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-17547)) ^ (-1615351278);
                        i7 = -591406561;
                    }
                    break;
                case 1093513505:
                case 1576638145:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("ܳۖ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 5625) ^ 682071875;
                        i7 = -902893308;
                    } else {
                        iM55979 = (C0873.m55680("ۡۢ") ^ i5) * 45;
                        i6 = ((iM55979 ^ i4) * 7589) ^ (-2010442815);
                        i7 = 1375521985;
                    }
                    break;
                case 1158620375:
                case 1642956913:
                    m12254(i, C0863.m55638(this, i2), z);
                    break;
                default:
                    C1404.m56468();
                    iM55979 = C0946.m55979("ۨ۟") ^ i5;
                    i6 = ((iM55979 ^ i4) * (-17547)) ^ (-1615351278);
                    i7 = -591406561;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo121(Intent intent) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12246(ViewGroup viewGroup, int i) {
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        View viewM56085 = null;
        int i5 = 1875844524;
        int i6 = C0866.f81837;
        int i7 = C1229.f82066;
        int iM55680 = C0873.m55680("᩵᩺") ^ i6;
        int i8 = ((iM55680 ^ i7) * 21411) ^ (-286666493);
        int i9 = -302522170;
        while (true) {
            i5 = ((((i5 ^ i7) * 8707) >> 31) & i8) ^ (iM55680 ^ i9);
            switch (i5) {
                case -1988311203:
                case -1891959738:
                    return true;
                case -1974771801:
                case 1496263322:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ۤᩴ") ^ i7) * (-47);
                        i8 = ((iM55680 ^ i6) * 19735) ^ (-979454656);
                        i9 = 995513170;
                    } else {
                        iM55680 = C0946.m55979("ܰ۟") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-7065)) ^ (-503120900);
                        i9 = -1372091594;
                    }
                    break;
                case -1837006207:
                case -1299859711:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i7) * (-31);
                        i8 = ((iM55680 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    } else {
                        iM55680 = C0946.m55979("֨ۢ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 17775) ^ (-487002331);
                        i9 = -1107444739;
                    }
                    break;
                case -1814392954:
                case 829370207:
                    viewM56085 = C0989.m56085(viewGroup, i4);
                    if (viewM56085.getVisibility() == 0) {
                        iM55680 = C0946.m55979("ܽ֨") ^ i6;
                        i8 = ((iM55680 ^ i7) * 19351) ^ 2090026647;
                        i9 = -137448133;
                    } else {
                        iM55680 = C0946.m55979("֨᩻") ^ i7;
                        i8 = ((iM55680 ^ i6) * 8093) ^ 2109791636;
                        i9 = -1866275547;
                    }
                    break;
                case -1697443808:
                case 853014624:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i7) * (-31);
                        i8 = ((iM55680 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩸") ^ i6;
                        i8 = ((iM55680 ^ i7) * 18167) ^ 556721680;
                        i9 = -1947908624;
                    }
                    break;
                case -1486467393:
                case -780869390:
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("۬ܶ") ^ i7;
                        i8 = ((iM55680 ^ i6) * 18509) ^ 1631092090;
                        i9 = -1196240529;
                    } else {
                        iM55680 = C0873.m55680("᩷ܳ") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-32541)) ^ 1548877423;
                        i9 = 1944890219;
                    }
                    break;
                case -1449709460:
                case 1856366493:
                    if (C0894.m55769() >= 0) {
                        iM55680 = C0873.m55680("۬ܶ") ^ i7;
                        i8 = ((iM55680 ^ i6) * 18509) ^ 1631092090;
                        i9 = -1196240529;
                    } else {
                        iM55680 = (C0946.m55979("ۤۛ") + i6) * (-55);
                        i8 = ((iM55680 ^ i7) * 11821) ^ 55991796;
                        i9 = -2056095635;
                    }
                    break;
                case -1411636178:
                case 155372002:
                    C1036.m56257();
                    iM55680 = (C0873.m55680("ۧ۫") ^ i7) * (-31);
                    i8 = ((iM55680 ^ i6) * 30631) ^ (-1117416850);
                    i9 = 848575181;
                    break;
                case -1405188843:
                case -607869632:
                    if (viewM56085 instanceof ViewGroup) {
                        iM55680 = (C0873.m55680("᩵ۚ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM55680 ^ i6) * (-16963)) ^ 1378825154;
                        i9 = 759197330;
                    } else {
                        iM55680 = C0946.m55979("ܶܶ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 8799) ^ 950855469;
                        i9 = -2074189820;
                    }
                    break;
                case -1258900253:
                case -173557357:
                    if (C1404.m56463(viewM56085) > 0) {
                        iM55680 = (C0946.m55979("ۧ֫") ^ i7) * 57;
                        i8 = ((iM55680 ^ i6) * (-18425)) ^ (-637821459);
                        i9 = 843605406;
                    } else {
                        iM55680 = C0946.m55979("֨᩻") ^ i7;
                        i8 = ((iM55680 ^ i6) * 8093) ^ 2109791636;
                        i9 = -1866275547;
                    }
                    break;
                case -1228447371:
                case 1583697207:
                    if (i4 < C0898.m55797(viewGroup)) {
                        iM55680 = C0946.m55979("ܺ֡") ^ i6;
                        i8 = ((iM55680 ^ i7) * 7591) ^ (-488643124);
                        i9 = -296968965;
                    } else {
                        iM55680 = (C0946.m55979("ۚۙ") ^ i7) * (-115);
                        i8 = ((iM55680 ^ i6) * 24975) ^ 392275366;
                        i9 = 722381482;
                    }
                    break;
                case -1144134880:
                case 1098440590:
                    C0930.m55885();
                    C0917.m55854();
                    return false;
                case -1038133840:
                case 1893145687:
                    if (C0992.m56107() <= 0) {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i7) * (-31);
                        i8 = ((iM55680 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    } else {
                        iM55680 = C0873.m55680("ۜ۠") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-3333)) ^ 755899052;
                        i9 = 395903287;
                    }
                    break;
                case -927298384:
                case -23510436:
                    i2 = -1;
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("ۖܽ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-7609)) ^ (-1175755571);
                        i9 = -699461108;
                    } else {
                        iM55680 = C0946.m55979("۠ۗ") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-23901)) ^ (-479234443);
                        i9 = -60325356;
                    }
                    break;
                case -924997295:
                case 1422322262:
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("᩸֨") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-6823)) ^ (-1008023632);
                        i9 = -1408756681;
                    } else {
                        iM55680 = C0873.m55680("ۨۙ") ^ i7;
                        i8 = ((iM55680 ^ i6) * 8903) ^ 383568435;
                        i9 = 594647863;
                    }
                    break;
                case -748362818:
                case 556984753:
                    i4++;
                    iM55680 = C0946.m55979("ᩴᩴ") ^ i6;
                    i8 = ((iM55680 ^ i7) * (-25163)) ^ 2068566998;
                    i9 = 1776777718;
                    break;
                case -697674207:
                case -256984201:
                    C0927.m55873();
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0873.m55680("᩸֨") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-6823)) ^ (-1008023632);
                        i9 = -1408756681;
                    } else {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i7) * (-31);
                        i8 = ((iM55680 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    }
                    break;
                case 107353405:
                case 686622003:
                    if (C1036.m56264(viewM56085) > 0) {
                        iM55680 = C0946.m55979("ۤ֫") ^ i6;
                        i8 = ((iM55680 ^ i7) * 24313) ^ 514009499;
                        i9 = 713307351;
                    } else {
                        iM55680 = C0946.m55979("֨᩻") ^ i7;
                        i8 = ((iM55680 ^ i6) * 8093) ^ 2109791636;
                        i9 = -1866275547;
                    }
                    break;
                case 112734467:
                case 1908552587:
                    i4 = 0;
                    iM55680 = C0946.m55979("ᩴᩴ") ^ i6;
                    i8 = ((iM55680 ^ i7) * (-25163)) ^ 2068566998;
                    i9 = 1776777718;
                    break;
                case 158113576:
                case 1251639952:
                    C0917.m55854();
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0946.m55979("ۤᩴ") ^ i7) * (-47);
                        i8 = ((iM55680 ^ i6) * 19735) ^ (-979454656);
                        i9 = 995513170;
                    } else {
                        iM55680 = C0873.m55680("᩸֨") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-6823)) ^ (-1008023632);
                        i9 = -1408756681;
                    }
                    break;
                case 183660231:
                case 1304111876:
                    if (m12246((ViewGroup) viewM56085, i3)) {
                        iM55680 = (C0873.m55680("ۧܿ") + i6) * 115;
                        i8 = ((iM55680 ^ i7) * (-3571)) ^ 1443135253;
                        i9 = -1300627513;
                    } else {
                        iM55680 = C0946.m55979("֨᩻") ^ i7;
                        i8 = ((iM55680 ^ i6) * 8093) ^ 2109791636;
                        i9 = -1866275547;
                    }
                    break;
                case 879301344:
                case 1932032004:
                    C1024.m56209();
                    if (!C0937.f81884) {
                        iM55680 = C0873.m55680("۬ܶ") ^ i7;
                        i8 = ((iM55680 ^ i6) * 18509) ^ 1631092090;
                        i9 = -1196240529;
                    } else {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i7) * (-31);
                        i8 = ((iM55680 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    }
                    break;
                case 976026290:
                case 1487928065:
                    return z;
                case 1202375241:
                case 1873831509:
                    C1194.m56396();
                    if (C1048.f81963) {
                        iM55680 = C0873.m55680("۬ܶ") ^ i7;
                        i8 = ((iM55680 ^ i6) * 18509) ^ 1631092090;
                        i9 = -1196240529;
                    } else {
                        iM55680 = (C0873.m55680("֫᩻") + i6) * (-125);
                        i8 = ((iM55680 ^ i7) * (-25971)) ^ 869708944;
                        i9 = -583659208;
                    }
                    break;
                case 1301781668:
                case 1429038376:
                    i3 = i + i2;
                    z = false;
                    if (i3 <= 0) {
                        iM55680 = (C0946.m55979("ۚۙ") ^ i7) * (-115);
                        i8 = ((iM55680 ^ i6) * 24975) ^ 392275366;
                        i9 = 722381482;
                    } else {
                        iM55680 = (C0873.m55680("ܿ᩷") ^ i7) * 85;
                        i8 = ((iM55680 ^ i6) * 10971) ^ 231339984;
                        i9 = 310150280;
                    }
                    break;
                case 1438979094:
                case 1534972103:
                    return viewM56085.getGlobalVisibleRect(new Rect());
                case 1658739652:
                case 1989051203:
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i7) * (-31);
                        i8 = ((iM55680 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    } else {
                        iM55680 = (C0873.m55680("ۧܶ") + i7) * 99;
                        i8 = ((iM55680 ^ i6) * 22541) ^ (-502073636);
                        i9 = -1093389249;
                    }
                    break;
                default:
                    if (C0890.m55740()) {
                        iM55680 = C0873.m55680("᩺ᩴ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 16007) ^ 1939366975;
                        i9 = 240449995;
                    } else {
                        iM55680 = (C0873.m55680("ۧ۫") ^ i7) * (-31);
                        i8 = ((iM55680 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12264(C14784 c14784) {
        int i = 0;
        Resources.Theme theme = null;
        int iM55617 = 0;
        int i2 = 0;
        int iM56148 = 0;
        Window windowM56391 = null;
        int i3 = 267933573;
        int i4 = ServiceConnectionC1013.f81940;
        int i5 = C0894.f81854;
        int iM55979 = C0946.m55979("۫ۧ") ^ i4;
        int i6 = ((iM55979 ^ i5) * (-7405)) ^ (-633253000);
        int i7 = -285555934;
        while (true) {
            i3 = ((((i3 ^ i5) * 6907) >> 31) & i6) ^ (iM55979 ^ i7);
            switch (i3) {
                case -2136817699:
                case -1949323254:
                    i = R.attr.navigationBarColor;
                    if (C1124.m56367() >= 0) {
                        iM55979 = C0873.m55680("۠ۚ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 16897) ^ 2103705680;
                        i7 = 1332085565;
                    } else {
                        iM55979 = C0873.m55680("ܶۧ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 2001) ^ (-942251165);
                        i7 = 1366367201;
                    }
                    break;
                case -2110820631:
                case -1785674946:
                    C0927.m55873();
                    iM55979 = (C0873.m55680("ۜܺ") + i5) * 97;
                    i6 = ((iM55979 ^ i4) * (-14729)) ^ 612729921;
                    i7 = 736518710;
                    break;
                case -1910532838:
                case -825592770:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (i5 - C0873.m55680("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55979 ^ i4) * 2883) ^ (-1025059802);
                        i7 = -1182198395;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ܿ᩶")) * (-15);
                        i6 = ((iM55979 ^ i4) * (-3135)) ^ 1548771689;
                        i7 = 1759015079;
                    }
                    break;
                case -1809146876:
                case -1550766665:
                    if (C1124.f82007 < 0) {
                        iM55979 = (i5 - C0873.m55680("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55979 ^ i4) * 2883) ^ (-1025059802);
                        i7 = -1182198395;
                    } else {
                        iM55979 = (C0873.m55680("ۜܺ") + i5) * 97;
                        i6 = ((iM55979 ^ i4) * (-14729)) ^ 612729921;
                        i7 = 736518710;
                    }
                    break;
                case -1599565677:
                case 1932074123:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (i5 - C0873.m55680("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55979 ^ i4) * 2883) ^ (-1025059802);
                        i7 = -1182198395;
                    } else {
                        iM55979 = C0873.m55680("ܺ᩷") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-6997)) ^ (-350136174);
                        i7 = -1188763863;
                    }
                    break;
                case -1456488601:
                case 697031328:
                    iM55617 = C0861.m55617(theme, i);
                    i2 = R.attr.colorBackground;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i5 - C0873.m55680("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55979 ^ i4) * 2883) ^ (-1025059802);
                        i7 = -1182198395;
                    } else {
                        iM55979 = (C0873.m55680("ۘ᩵") + i5) * 101;
                        i6 = ((iM55979 ^ i4) * 3207) ^ 594408977;
                        i7 = -1568662435;
                    }
                    break;
                case -1329927395:
                case 1699298232:
                    RunnableC1014.m56177();
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0873.m55680("۠ۚ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 16897) ^ 2103705680;
                        i7 = 1332085565;
                    } else {
                        iM55979 = (C0873.m55680("ۜܺ") + i5) * 97;
                        i6 = ((iM55979 ^ i4) * (-14729)) ^ 612729921;
                        i7 = 736518710;
                    }
                    break;
                case -1322567215:
                case 1008095137:
                    C0890.m55740();
                    C0992.m56107();
                    break;
                case -1115289376:
                case -180467349:
                    theme = getTheme();
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0873.m55680("᩺ۤ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 13041) ^ (-2136512218);
                        i7 = 1036113374;
                    } else {
                        iM55979 = C0946.m55979("᩻᩺") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-11779)) ^ 274680809;
                        i7 = 609547601;
                    }
                    break;
                case -1026114479:
                case -274810881:
                    C0949.m56015(c14784, iM55617);
                    windowM56391 = C1194.m56391(this);
                    if (C0947.f81895) {
                        iM55979 = (i5 - C0873.m55680("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55979 ^ i4) * 2883) ^ (-1025059802);
                        i7 = -1182198395;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ۡ᩸")) * 59;
                        i6 = ((iM55979 ^ i4) * (-13265)) ^ (-1434858111);
                        i7 = 1747439438;
                    }
                    break;
                case -728753565:
                case -229257400:
                    windowM56391.setNavigationBarColor(0);
                    break;
                case -727708136:
                case 1520234400:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i5 - C0873.m55680("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55979 ^ i4) * 2883) ^ (-1025059802);
                        i7 = -1182198395;
                    } else {
                        iM55979 = C0946.m55979("۠۫") ^ i4;
                        i6 = ((iM55979 ^ i5) * 15151) ^ 1005629782;
                        i7 = -1612827152;
                    }
                    break;
                case -617084592:
                case 1916295683:
                    iM56148 = C1012.m56148(getTheme(), i2);
                    if (iM55617 == iM56148) {
                        iM55979 = (i4 - C0873.m55680("ۧ۟")) * (-47);
                        i6 = ((iM55979 ^ i5) * 13847) ^ (-747195255);
                        i7 = -1133199287;
                    } else {
                        iM55979 = C0873.m55680("֨᩹") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-11633)) ^ (-1328953616);
                        i7 = -208954774;
                    }
                    break;
                case -583847063:
                case 34466574:
                    if (C0845.m55584() <= 0) {
                        iM55979 = (i5 - C0873.m55680("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55979 ^ i4) * 2883) ^ (-1025059802);
                        i7 = -1182198395;
                    } else {
                        iM55979 = (C0873.m55680("ܿۧ") ^ i4) * (-117);
                        i6 = ((iM55979 ^ i5) * (-25363)) ^ 982362761;
                        i7 = 1024180658;
                    }
                    break;
                case -334345886:
                case 474825409:
                    C1404.m56468();
                    if (C1025.m56230()) {
                        iM55979 = (i4 - C0946.m55979("᩹֡")) * (-65);
                        i6 = ((iM55979 ^ i5) * (-7583)) ^ 1491208646;
                        i7 = 1475548209;
                    } else {
                        iM55979 = (C0873.m55680("ۜܺ") + i5) * 97;
                        i6 = ((iM55979 ^ i4) * (-14729)) ^ 612729921;
                        i7 = 736518710;
                    }
                    break;
                case 528262859:
                case 1831483011:
                    C0949.m56015(c14784, iM56148);
                    C0937.m55910(this).setNavigationBarColor(iM55617);
                    break;
                case 1000059002:
                case 1439950884:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ۛ֫") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-7147)) ^ 1397552778;
                        i7 = 232415364;
                    } else {
                        iM55979 = (C0873.m55680("ۜܺ") + i5) * 97;
                        i6 = ((iM55979 ^ i4) * (-14729)) ^ 612729921;
                        i7 = 736518710;
                    }
                    break;
                default:
                    if (C1024.f81946) {
                        iM55979 = (C0873.m55680("ۜܺ") + i5) * 97;
                        i6 = ((iM55979 ^ i4) * (-14729)) ^ 612729921;
                        i7 = 736518710;
                    } else {
                        iM55979 = C0873.m55680("᩶᩹") ^ i5;
                        i6 = ((iM55979 ^ i4) * 26035) ^ 847877590;
                        i7 = -672685046;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b7 A[PHI: r2
      0x00b7: PHI (r2v3 boolean) = (r2v2 boolean), (r2v4 boolean) binds: [B:30:0x00b5, B:26:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a5 A[PHI: r0 r8
      0x01a5: PHI (r0v6 boolean) = (r0v5 boolean), (r0v2 boolean), (r0v2 boolean), (r0v2 boolean), (r0v2 boolean) binds: [B:57:0x01a3, B:53:0x0184, B:37:0x00f1, B:15:0x0047, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r8v6 java.util.WeakHashMap) = 
      (r8v4 java.util.WeakHashMap)
      (r8v4 java.util.WeakHashMap)
      (r8v5 java.util.WeakHashMap)
      (r8v4 java.util.WeakHashMap)
      (r8v4 java.util.WeakHashMap)
     binds: [B:57:0x01a3, B:53:0x0184, B:37:0x00f1, B:15:0x0047, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    public AbstractActivityC5549() {
        int iM55979;
        int i;
        boolean z = false;
        boolean z2 = false;
        int i2 = -10663927;
        int i3 = C1404.f82149;
        int i4 = ServiceConnectionC1013.f81940;
        int iM55680 = (C0873.m55680("᩺᩵") + i3) * C0254q.f1218h;
        int i5 = ((iM55680 ^ i4) * 5293) ^ 1098968136;
        int i6 = -930215774;
        while (true) {
            int i7 = iM55680 ^ i6;
            WeakHashMap weakHashMap = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-7395)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2123987805:
                    case -502233441:
                        if (!C0947.m55997()) {
                            iM55979 = C0946.m55979("᩶۬") ^ i4;
                            i5 = ((iM55979 ^ i3) * 21071) ^ 1969979047;
                            i = -961188159;
                            i7 = iM55979 ^ i;
                        }
                        break;
                    case -2057689639:
                    case 1043012056:
                        C0949.m56012();
                        if (C1024.f81946) {
                            iM55979 = (C0946.m55979("᩵ܺ") ^ i4) * (-107);
                            i5 = ((iM55979 ^ i3) * (-15305)) ^ 439322242;
                            i = 544764329;
                        } else {
                            iM55979 = (i3 - C0946.m55979("ܳۘ")) * (-43);
                            i5 = ((iM55979 ^ i4) * 16793) ^ (-1597589243);
                            i = 905484972;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1949404792:
                    case 1610250967:
                        if (C0949.f81897 >= 0) {
                            iM55979 = C0946.m55979("᩵ۤ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29081) ^ (-648101878);
                            i = -757082201;
                        } else {
                            iM55979 = C0873.m55680("ܰ᩻") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-30833)) ^ (-991556077);
                            i = -663143598;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1704484607:
                    case -707416944:
                        C0863.m55643();
                        C0890.m55740();
                        throw new RuntimeException();
                    case -1397096826:
                    case 708944007:
                        if (C0854.f81826 != 0) {
                            iM55979 = C0946.m55979("᩵ۤ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29081) ^ (-648101878);
                            i = -757082201;
                        } else {
                            iM55979 = (i3 - C0946.m55979("ܰ᩹")) * 31;
                            i5 = ((iM55979 ^ i4) * 25599) ^ (-1018698308);
                            i = 993190373;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1309833391:
                    case -447572232:
                        if (C0863.f81833 <= 0) {
                            iM55979 = (i3 - C0946.m55979("ܳۘ")) * (-43);
                            i5 = ((iM55979 ^ i4) * 16793) ^ (-1597589243);
                            i = 905484972;
                        } else {
                            iM55979 = (C0873.m55680("֫ۨ") ^ i4) * 57;
                            i5 = ((iM55979 ^ i3) * 2967) ^ 1470517219;
                            i = 1114151782;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1175440962:
                    case 1388105913:
                        z = true;
                        this.f13389 = true;
                        if (RunnableC0871.m55672() >= 0) {
                            iM55979 = (i3 - C0946.m55979("ܳۘ")) * (-43);
                            i5 = ((iM55979 ^ i4) * 16793) ^ (-1597589243);
                            i = 905484972;
                        } else {
                            iM55979 = (C0946.m55979("ܺܿ") + i3) * (-91);
                            i5 = ((iM55979 ^ i4) * (-30097)) ^ (-1724422030);
                            i = 1910722269;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -585231912:
                    case 386138766:
                        C1964.m56597();
                        if (C0898.f81858 <= 0) {
                            iM55979 = (i3 - C0946.m55979("ܳۘ")) * (-43);
                            i5 = ((iM55979 ^ i4) * 16793) ^ (-1597589243);
                            i = 905484972;
                        } else {
                            iM55979 = C0946.m55979("᩵ۤ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29081) ^ (-648101878);
                            i = -757082201;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -226405665:
                    case 206824741:
                        if (!C0917.f81868) {
                            weakHashMap = new WeakHashMap();
                            if (C1964.m56597() != 0) {
                                iM55979 = (i3 - C0946.m55979("ܳۘ")) * (-43);
                                i5 = ((iM55979 ^ i4) * 16793) ^ (-1597589243);
                                i = 905484972;
                            } else {
                                iM55979 = (C0873.m55680("ܶۛ") + i4) * 71;
                                i5 = ((iM55979 ^ i3) * (-24497)) ^ 1747117713;
                                i = -1557245033;
                            }
                            i7 = iM55979 ^ i;
                        }
                        break;
                    case -128678939:
                    case 1838899838:
                        if (C1071.f81975 <= 0) {
                        }
                        iM55979 = C0946.m55979("᩵ۤ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 29081) ^ (-648101878);
                        i = -757082201;
                        i7 = iM55979 ^ i;
                        break;
                    case 154017254:
                    case 265031434:
                        this.f13396 = z;
                        z2 = false;
                        if (C1229.m56410() != 0) {
                            iM55979 = (C0946.m55979("ۡ᩵") + i4) * 77;
                            i5 = ((iM55979 ^ i3) * 709) ^ (-1874157805);
                            i = -1098356687;
                        } else {
                            iM55979 = (C0873.m55680("ۜۡ") + i3) * (-113);
                            i5 = ((iM55979 ^ i4) * 9185) ^ 2025853945;
                            i = 555977313;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 439004036:
                    case 1875735188:
                        this.f13398 = Collections.newSetFromMap(weakHashMap);
                        if (C1048.f81963) {
                            iM55979 = (C0946.m55979("ۖۚ") ^ i4) * (-95);
                            i5 = ((iM55979 ^ i3) * (-22069)) ^ (-535284300);
                            i = 529089342;
                        } else {
                            iM55979 = (C0946.m55979("ۡ᩵") + i4) * 77;
                            i5 = ((iM55979 ^ i3) * 709) ^ (-1874157805);
                            i = -1098356687;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 1358639240:
                    case 2015380142:
                        this.f13391 = z2;
                        if (!C0882.f81846) {
                            iM55979 = (C0946.m55979("ܶܰ") ^ i3) * 31;
                            i5 = ((iM55979 ^ i4) * 24573) ^ 778121999;
                            i = 1498868766;
                            i7 = iM55979 ^ i;
                        }
                        break;
                    case 1760203119:
                    case 1879868305:
                        C0863.m55643();
                        iM55979 = (C0946.m55979("᩵ܺ") ^ i4) * (-107);
                        i5 = ((iM55979 ^ i3) * (-15305)) ^ 439322242;
                        i = 544764329;
                        i7 = iM55979 ^ i;
                        break;
                    default:
                        this.f13401 = null;
                        this.f13387 = z2;
                        return;
                }
            }
            iM55680 = (C0946.m55979("ۖ֡") + i3) * (-59);
            i5 = ((iM55680 ^ i4) * (-12165)) ^ (-1395374153);
            i6 = -955726853;
        }
    }

    @Override // p067l.ActivityC3069, android.app.Activity
    public void onResume() {
        String strMo119 = null;
        Runnable runnable = null;
        Runnable runnable2 = null;
        int i = -1428678436;
        int i2 = C1404.f82149;
        int i3 = C0992.f81922;
        int iM55979 = (C0946.m55979("ۨۤ") ^ i3) * (-27);
        int i4 = ((iM55979 ^ i2) * 10589) ^ (-1779638247);
        int i5 = 2026228614;
        while (true) {
            i = ((((i ^ i2) * 9501) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2065885275:
                case 1909862827:
                    break;
                case -2064729699:
                case -1719601704:
                    C0927.m55873();
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("ۡ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    } else {
                        iM55979 = (C0873.m55680("ᩳܽ") ^ i2) * (-103);
                        i4 = ((iM55979 ^ i3) * 31123) ^ (-1298265146);
                        i5 = -1217844518;
                    }
                    break;
                case -2052730746:
                case 1662896318:
                    if (C0845.m55584() <= 0) {
                        iM55979 = C0873.m55680("ۡ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    } else {
                        iM55979 = (C0873.m55680("᩷۠") ^ i2) * (-81);
                        i4 = ((iM55979 ^ i3) * 11805) ^ 482056499;
                        i5 = -1674659785;
                    }
                    break;
                case -1909990844:
                case -1607124442:
                    strMo119 = mo119();
                    int i6 = C8775.f23820;
                    if (C17452.m39788()) {
                        iM55979 = (C0873.m55680("ۗ᩻") + i2) * 5;
                        i4 = ((iM55979 ^ i3) * (-20725)) ^ 2071652213;
                        i5 = -2048945287;
                    } else {
                        iM55979 = (C0946.m55979("᩻ۜ") + i3) * 63;
                        i4 = ((iM55979 ^ i2) * (-21333)) ^ 1943431124;
                        i5 = -894795468;
                    }
                    break;
                case -1757819846:
                case 86729379:
                    super.onResume();
                    if (C0917.m55854()) {
                        iM55979 = C0873.m55680("ۧۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9389)) ^ (-1745654667);
                        i5 = -1815472672;
                    } else {
                        iM55979 = (C0873.m55680("ᩳܽ") ^ i2) * (-103);
                        i4 = ((iM55979 ^ i3) * 31123) ^ (-1298265146);
                        i5 = -1217844518;
                    }
                    break;
                case -1593245767:
                case -739921444:
                    C5178.m11083(this);
                    if (this.f13390 != null) {
                        iM55979 = C0873.m55680("ۜۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23093)) ^ 582002688;
                        i5 = -1715337906;
                    } else {
                        iM55979 = (C0946.m55979("ۢۖ") + i2) * 51;
                        i4 = ((iM55979 ^ i3) * 20639) ^ (-1210061478);
                        i5 = -344225231;
                    }
                    break;
                case -1587080144:
                case 824298144:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0873.m55680("ᩳܽ") ^ i2) * (-103);
                        i4 = ((iM55979 ^ i3) * 31123) ^ (-1298265146);
                        i5 = -1217844518;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۙۙ")) * 45;
                        i4 = ((iM55979 ^ i2) * 421) ^ 940294323;
                        i5 = -1435747337;
                    }
                    break;
                case -1343609503:
                case 952907099:
                    if (C7050.m16236()) {
                        iM55979 = C0946.m55979("ܰܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-3041)) ^ (-1836670638);
                        i5 = -78783650;
                    } else {
                        iM55979 = (C0946.m55979("ۖۚ") ^ i2) * (-67);
                        i4 = ((iM55979 ^ i3) * (-5271)) ^ 1177413158;
                        i5 = -60645443;
                    }
                    break;
                case -1322899525:
                case 1935255294:
                    MobclickAgent.onPageStart(strMo119);
                    MobclickAgent.onResume(this);
                    iM55979 = (C0873.m55680("ۗ᩻") + i2) * 5;
                    i4 = ((iM55979 ^ i3) * (-20725)) ^ 2071652213;
                    i5 = -2048945287;
                    break;
                case -868894428:
                case -102250251:
                    RunnableC0871.m55672();
                    if (!C1024.f81946) {
                        iM55979 = C0946.m55979("֫ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16571)) ^ (-889701488);
                        i5 = -535513064;
                    } else {
                        iM55979 = C0873.m55680("ۡ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    }
                    break;
                case -663080310:
                case -108607342:
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0873.m55680("ۡ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    } else {
                        iM55979 = C0873.m55680("֡ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 20769) ^ 1612183933;
                        i5 = -2033244116;
                    }
                    break;
                case -560592321:
                case 848532038:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("֫ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16571)) ^ (-889701488);
                        i5 = -535513064;
                    } else {
                        iM55979 = C0873.m55680("ᩴ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 405) ^ (-1473117458);
                        i5 = -1968684438;
                    }
                    break;
                case -207549452:
                case 1585536954:
                    if (C1024.f81946) {
                        iM55979 = (i2 - C0873.m55680("ܳ᩶")) * 23;
                        i4 = ((iM55979 ^ i3) * 2615) ^ 2121808936;
                        i5 = -162213814;
                    } else {
                        iM55979 = C0873.m55680("᩻ܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-20047)) ^ (-2082300677);
                        i5 = 903382885;
                    }
                    break;
                case -199338680:
                case 384611502:
                    C0955.m56027(this);
                    iM55979 = (C0946.m55979("ۖۚ") ^ i2) * (-67);
                    i4 = ((iM55979 ^ i3) * (-5271)) ^ 1177413158;
                    i5 = -60645443;
                    break;
                case -166153104:
                case 230000485:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0946.m55979("ۙۗ") + i3) * 7;
                        i4 = ((iM55979 ^ i2) * 14575) ^ (-962490489);
                        i5 = -420464966;
                    } else {
                        iM55979 = C0873.m55680("ۡ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    }
                    break;
                case 337418748:
                case 892239064:
                    C0863.m55643();
                    C0898.m55800();
                    break;
                case 817211840:
                case 1121142476:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("֫ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16571)) ^ (-889701488);
                        i5 = -535513064;
                    } else {
                        iM55979 = C0873.m55680("ܳᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9243) ^ 968577775;
                        i5 = -595543311;
                    }
                    break;
                case 901029122:
                case 1924328292:
                    this.f13390 = runnable2;
                    C0927.m55868(runnable);
                    iM55979 = (C0946.m55979("ۢۖ") + i2) * 51;
                    i4 = ((iM55979 ^ i3) * 20639) ^ (-1210061478);
                    i5 = -344225231;
                    break;
                case 1102973448:
                case 1867678055:
                    if (this.f13396) {
                        iM55979 = C0873.m55680("ۜ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 6303) ^ (-440700660);
                        i5 = 1301568712;
                    } else {
                        iM55979 = (C0873.m55680("ۗ᩻") + i2) * 5;
                        i4 = ((iM55979 ^ i3) * (-20725)) ^ 2071652213;
                        i5 = -2048945287;
                    }
                    break;
                case 1205923336:
                case 1353385909:
                    if (C0912.m55833()) {
                        iM55979 = C0873.m55680("ۡ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    } else {
                        iM55979 = (C0946.m55979("᩸֡") + i3) * 123;
                        i4 = ((iM55979 ^ i2) * 17533) ^ (-161585734);
                        i5 = 481929797;
                    }
                    break;
                case 1307113742:
                case 1637389214:
                    runnable = this.f13390;
                    runnable2 = null;
                    if (C0930.f81879 <= 0) {
                        iM55979 = (i2 - C0873.m55680("ܳ᩶")) * 23;
                        i4 = ((iM55979 ^ i3) * 2615) ^ 2121808936;
                        i5 = -162213814;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܶ۫")) * (-107);
                        i4 = ((iM55979 ^ i2) * 21303) ^ (-997793829);
                        i5 = -1737541995;
                    }
                    break;
                case 1390787241:
                case 1550634177:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0946.m55979("ۙۗ") + i3) * 7;
                        i4 = ((iM55979 ^ i2) * 14575) ^ (-962490489);
                        i5 = -420464966;
                    } else {
                        iM55979 = C0873.m55680("ۗᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7)) ^ (-1953946872);
                        i5 = 1745139466;
                    }
                    break;
                default:
                    C0861.m55626();
                    C1053.m56327();
                    iM55979 = (C0873.m55680("ᩳܽ") ^ i2) * (-103);
                    i4 = ((iM55979 ^ i3) * 31123) ^ (-1298265146);
                    i5 = -1217844518;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a4 A[PHI: r4 r5
      0x00a4: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:24:0x00a2, B:15:0x007d, B:12:0x0078, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:24:0x00a2, B:15:0x007d, B:12:0x0078, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01cf A[PHI: r2 r10 r11 r14
      0x01cf: PHI (r2v4 l.ۢᩴ) = (r2v2 l.ۢᩴ), (r2v2 l.ۢᩴ), (r2v6 l.ۢᩴ) binds: [B:52:0x01cd, B:12:0x0078, B:75:0x01cf] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r10v5 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:52:0x01cd, B:12:0x0078, B:75:0x01cf] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r11v5 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:52:0x01cd, B:12:0x0078, B:75:0x01cf] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v6 short[]) binds: [B:52:0x01cd, B:12:0x0078, B:75:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0203 A[PHI: r3 r8 r9
      0x0203: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:56:0x0201, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0203: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:56:0x0201, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0203: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:56:0x0201, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0253 A[PHI: r7 r12
      0x0253: PHI (r7v4 char) = (r7v2 char), (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:64:0x0251, B:60:0x0235, B:48:0x01ab, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:64:0x0251, B:60:0x0235, B:48:0x01ab, B:9:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0289 A[PHI: r15 r20
      0x0289: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:68:0x0287, B:32:0x00f7, B:17:0x0081, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:68:0x0287, B:32:0x00f7, B:17:0x0081, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۗ */
    public final void m12268() {
        int iM55979;
        int i;
        int i2;
        int i3 = RunnableC0871.f81839;
        int i4 = AbstractC0942.f81890;
        int iM559710 = (C0946.m55979("ۛۖ") ^ i3) * 91;
        int i5 = ((iM559710 ^ i4) * 23047) ^ (-339945091);
        String strM55652 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM559710 ^ 169801439;
        int iM559711 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1877481982;
        C1326 c1326 = null;
        AbstractC1360 abstractC1360M6355 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-26951)) >> 31));
            switch (i13) {
                case -1408189065:
                case 494944628:
                    abstractC1360M6355 = m6355();
                    if (abstractC1360M6355 != null) {
                        iM55979 = (C0946.m55979("ᩴܶ") ^ i4) * (-15);
                        i = ((iM55979 ^ i3) * 10021) ^ (-587424590);
                        i2 = 399532767;
                    } else {
                        iM55979 = (C0946.m55979("֫᩺") + i3) * (-121);
                        i = ((iM55979 ^ i4) * (-10885)) ^ (-2005311879);
                        i2 = 177270687;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1235692445:
                case -58396761:
                    sArr = f81933;
                    if (C0892.m55749()) {
                        iM55979 = (i4 - C0946.m55979("ܰܰ")) * (-103);
                        i = ((iM55979 ^ i3) * 1927) ^ (-1090349248);
                        i2 = 1304855983;
                    } else {
                        iM55979 = C0946.m55979("۬᩺") ^ i3;
                        i = ((iM55979 ^ i4) * (-11879)) ^ 1375000257;
                        i2 = 1998847857;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1149786039:
                case 414613620:
                    i11 = 48879;
                    iM55979 = C0873.m55680("᩶ۘ") ^ i4;
                    i = ((iM55979 ^ i3) * 24601) ^ (-1430362019);
                    i2 = 1261041109;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1132657672:
                case 1456926100:
                    c1326.setNavigationIcon(iM559711 ^ i7);
                    break;
                case -869543956:
                case 1622214226:
                    i8 = s * s2;
                    i9 = s * s;
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("۫۬") ^ i4;
                        i = ((iM55979 ^ i3) * (-4821)) ^ (-344103197);
                        i2 = 1962915715;
                    } else {
                        iM55979 = C0946.m55979("᩷᩶") ^ i4;
                        i = ((iM55979 ^ i3) * (-14989)) ^ (-134140214);
                        i2 = 1367784900;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -863025256:
                case 1819953636:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0946.m55979("ۛ֡") ^ i4) * (-73);
                        i = ((iM55979 ^ i3) * 7813) ^ (-42808420);
                        i2 = 36802219;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܽ᩻")) * 83;
                        i = ((iM55979 ^ i4) * (-20795)) ^ 626335732;
                        i2 = 430467752;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -796841995:
                case 863038101:
                    s = sArr[c];
                    s2 = 23032;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("ۙۨ") ^ i3;
                        i = ((iM55979 ^ i4) * 30387) ^ (-53662716);
                        i2 = -939942262;
                    } else {
                        iM55979 = C0873.m55680("ۜܶ") ^ i4;
                        i = ((iM55979 ^ i3) * 10669) ^ (-2111745408);
                        i2 = -1702782027;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -765586309:
                case 120552600:
                    i10 = 132618256;
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("ۛ֡") ^ i4) * (-73);
                        i = ((iM55979 ^ i3) * 7813) ^ (-42808420);
                        i2 = 36802219;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܿܿ")) * 109;
                        i = ((iM55979 ^ i4) * (-7255)) ^ 702797688;
                        i2 = 745556386;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -428980228:
                case 539271335:
                    i12 = 345;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("۬᩺") ^ i3;
                        i = ((iM55979 ^ i4) * (-11879)) ^ 1375000257;
                        i2 = 1998847857;
                    } else {
                        iM55979 = (C0946.m55979("۟ۧ") + i4) * 33;
                        i = ((iM55979 ^ i3) * (-17649)) ^ 1892721939;
                        i2 = -666040739;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -365682343:
                case -195699050:
                    strM55652 = C0866.m55652(sArr2, i12, 3, i11);
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("ۙۨ") ^ i3;
                        i = ((iM55979 ^ i4) * 30387) ^ (-53662716);
                        i2 = -939942262;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩹۠")) * (-23);
                        i = ((iM55979 ^ i4) * (-32427)) ^ (-1882611686);
                        i2 = 1799800379;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -287772208:
                case 1311557699:
                    C0892.m55749();
                    C0890.m55740();
                    break;
                case -171252373:
                case 2068597727:
                    c = 344;
                    if (C0845.m55584() <= 0) {
                        iM55979 = (C0946.m55979("ۛ֡") ^ i4) * (-73);
                        i = ((iM55979 ^ i3) * 7813) ^ (-42808420);
                        i2 = 36802219;
                    } else {
                        iM55979 = (C0946.m55979("۬֨") ^ i3) * 21;
                        i = ((iM55979 ^ i4) * 16363) ^ 1914310116;
                        i2 = 1897450746;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -69334418:
                case 1369898890:
                    abstractC1360M6355.mo28329(true);
                    iM55979 = (C0946.m55979("֫᩺") + i3) * (-121);
                    i = ((iM55979 ^ i4) * (-10885)) ^ (-2005311879);
                    i2 = 177270687;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 191828558:
                case 1105241683:
                    iM559711 = C0946.m55979(strM55652);
                    i7 = 2117205189;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("ۛܽ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16101)) ^ (-312303451);
                        i2 = -1523169292;
                    } else {
                        iM55979 = C0946.m55979("ۗۙ") ^ i4;
                        i = ((iM55979 ^ i3) * (-12959)) ^ (-1572781982);
                        i2 = 8173813;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 200533869:
                case 576054625:
                    if (C1229.f82066 < 0) {
                        iM55979 = C0946.m55979("۬᩺") ^ i3;
                        i = ((iM55979 ^ i4) * (-11879)) ^ 1375000257;
                        i2 = 1998847857;
                    } else {
                        iM55979 = C0946.m55979("ۛܽ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16101)) ^ (-312303451);
                        i2 = -1523169292;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 367153958:
                case 1020093337:
                    C0989.m56095();
                    iM55979 = C0946.m55979("۬᩺") ^ i3;
                    i = ((iM55979 ^ i4) * (-11879)) ^ 1375000257;
                    i2 = 1998847857;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 411242431:
                case 1125393091:
                    i11 = 1891;
                    iM55979 = C0873.m55680("᩶ۘ") ^ i4;
                    i = ((iM55979 ^ i3) * 24601) ^ (-1430362019);
                    i2 = 1261041109;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 941777687:
                case 1577237002:
                    C1044.m56286();
                    if (C0912.m55833()) {
                        iM55979 = C0946.m55979("ۛܽ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16101)) ^ (-312303451);
                        i2 = -1523169292;
                    } else {
                        iM55979 = (C0946.m55979("ۛ֡") ^ i4) * (-73);
                        i = ((iM55979 ^ i3) * 7813) ^ (-42808420);
                        i2 = 36802219;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1024752013:
                case 1203227231:
                    c1326 = this.f13392;
                    sArr2 = f81933;
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0873.m55680("۫۬") ^ i4;
                        i = ((iM55979 ^ i3) * (-4821)) ^ (-344103197);
                        i2 = 1962915715;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM55680 = C0873.m55680("᩺ۚ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-11247)) ^ 1496322839;
                        i6 = iM55680 ^ 2140570611;
                    }
                    break;
                case 1224197384:
                case 1264328024:
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0946.m55979("ۛܽ") ^ i3;
                        i = ((iM55979 ^ i4) * (-16101)) ^ (-312303451);
                        i2 = -1523169292;
                    } else {
                        iM55979 = C0873.m55680("۫۬") ^ i4;
                        i = ((iM55979 ^ i3) * (-4821)) ^ (-344103197);
                        i2 = 1962915715;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (i8 - (i9 + i10) <= 0) {
                        iM55979 = (C0946.m55979("᩺֡") ^ i3) * 5;
                        i = ((iM55979 ^ i4) * (-32749)) ^ 1886558412;
                        i2 = -1163103071;
                    } else {
                        iM55979 = (C0873.m55680("۫۠") ^ i4) * 89;
                        i = ((iM55979 ^ i3) * 24189) ^ (-828294567);
                        i2 = 968213465;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0408 A[PHI: r1 r2 r5 r6 r11 r12 r13 r23 r24 r25
      0x0408: PHI (r1v11 int) = (r1v7 int), (r1v8 int), (r1v10 int), (r1v12 int) binds: [B:78:0x0406, B:74:0x03d9, B:66:0x037d, B:63:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x0408: PHI (r2v11 int) = (r2v7 int), (r2v8 int), (r2v10 int), (r2v15 int) binds: [B:78:0x0406, B:74:0x03d9, B:66:0x037d, B:63:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x0408: PHI (r5v12 int) = (r5v8 int), (r5v9 int), (r5v11 int), (r5v14 int) binds: [B:78:0x0406, B:74:0x03d9, B:66:0x037d, B:63:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x0408: PHI (r6v12 l.᩸ܰ) = (r6v8 l.᩸ܰ), (r6v9 l.᩸ܰ), (r6v11 l.᩸ܰ), (r6v13 l.᩸ܰ) binds: [B:78:0x0406, B:74:0x03d9, B:66:0x037d, B:63:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x0408: PHI (r11v3 l.ۧ۬) = (r11v2 l.ۧ۬), (r11v2 l.ۧ۬), (r11v2 l.ۧ۬), (r11v4 l.ۧ۬) binds: [B:78:0x0406, B:74:0x03d9, B:66:0x037d, B:63:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x0408: PHI (r12v12 int) = (r12v8 int), (r12v9 int), (r12v11 int), (r12v13 int) binds: [B:78:0x0406, B:74:0x03d9, B:66:0x037d, B:63:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x0408: PHI (r13v12 int) = (r13v8 int), (r13v9 int), (r13v11 int), (r13v13 int) binds: [B:78:0x0406, B:74:0x03d9, B:66:0x037d, B:63:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x0408: PHI (r23v12 int) = (r23v8 int), (r23v9 int), (r23v11 int), (r23v13 int) binds: [B:78:0x0406, B:74:0x03d9, B:66:0x037d, B:63:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x0408: PHI (r24v11 int) = (r24v7 int), (r24v8 int), (r24v10 int), (r24v12 int) binds: [B:78:0x0406, B:74:0x03d9, B:66:0x037d, B:63:0x0343] A[DONT_GENERATE, DONT_INLINE]
      0x0408: PHI (r25v9 android.view.ViewGroup$MarginLayoutParams) = 
      (r25v5 android.view.ViewGroup$MarginLayoutParams)
      (r25v6 android.view.ViewGroup$MarginLayoutParams)
      (r25v8 android.view.ViewGroup$MarginLayoutParams)
      (r25v10 android.view.ViewGroup$MarginLayoutParams)
     binds: [B:78:0x0406, B:74:0x03d9, B:66:0x037d, B:63:0x0343] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0497 A[PHI: r1 r2 r5 r6 r12 r13 r23 r24 r25
      0x0497: PHI (r1v22 int) = (r1v4 int), (r1v9 int), (r1v21 int), (r1v26 int) binds: [B:86:0x047c, B:70:0x03ab, B:12:0x008e, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r2v22 int) = (r2v4 int), (r2v9 int), (r2v21 int), (r2v26 int) binds: [B:86:0x047c, B:70:0x03ab, B:12:0x008e, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r5v23 int) = (r5v5 int), (r5v10 int), (r5v21 int), (r5v27 int) binds: [B:86:0x047c, B:70:0x03ab, B:12:0x008e, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r6v24 l.᩸ܰ) = (r6v5 l.᩸ܰ), (r6v10 l.᩸ܰ), (r6v23 l.᩸ܰ), (r6v29 l.᩸ܰ) binds: [B:86:0x047c, B:70:0x03ab, B:12:0x008e, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r12v23 int) = (r12v5 int), (r12v10 int), (r12v22 int), (r12v28 int) binds: [B:86:0x047c, B:70:0x03ab, B:12:0x008e, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r13v21 int) = (r13v5 int), (r13v10 int), (r13v20 int), (r13v26 int) binds: [B:86:0x047c, B:70:0x03ab, B:12:0x008e, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r23v23 int) = (r23v5 int), (r23v10 int), (r23v21 int), (r23v27 int) binds: [B:86:0x047c, B:70:0x03ab, B:12:0x008e, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r24v19 int) = (r24v4 int), (r24v9 int), (r24v17 int), (r24v22 int) binds: [B:86:0x047c, B:70:0x03ab, B:12:0x008e, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r25v17 android.view.ViewGroup$MarginLayoutParams) = 
      (r25v2 android.view.ViewGroup$MarginLayoutParams)
      (r25v7 android.view.ViewGroup$MarginLayoutParams)
      (r25v15 android.view.ViewGroup$MarginLayoutParams)
      (r25v20 android.view.ViewGroup$MarginLayoutParams)
     binds: [B:86:0x047c, B:70:0x03ab, B:12:0x008e, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C1914 m12242(AbstractActivityC5549 abstractActivityC5549, View view, int[] iArr, View view2, int[] iArr2, C14784 c14784, View view3, View view4, int[] iArr3, int[] iArr4, View view5, View view6, int[] iArr5, int[] iArr6, View view7, int[] iArr7, View view8, int i, C1914 c1914) {
        int i2;
        C1914 c1915;
        int i3;
        int i4;
        int i5;
        int iM55979;
        int i6;
        int i7;
        int i8;
        int iM55680;
        int i9;
        int i10;
        int iM559710;
        int i11;
        int i12;
        int iM55681;
        int i13;
        int i14;
        int iM55682;
        int i15;
        int i16;
        View view9 = view8;
        C1914 c1916 = c1914;
        int i17 = 0;
        int i18 = C1044.f81959;
        int i19 = RunnableC0938.f81886;
        int iM55683 = (C0873.m55680("۠᩺") ^ i18) * 77;
        int i20 = ((iM55683 ^ i19) * (-12263)) ^ 653265179;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        int i21 = iM55683 ^ (-856542753);
        int i22 = 2120074422;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        C1388 c1388Mo112 = null;
        int i27 = 0;
        int i28 = 0;
        int iM55598 = 0;
        char c = 0;
        char c2 = 0;
        char c3 = 0;
        int i29 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int i30 = i21 ^ (i20 & (((i22 ^ i19) * (-16655)) >> 31));
            switch (i30) {
                case -2138788839:
                case -115306135:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    if (iArr7 != null) {
                        iM55681 = (i18 - C0873.m55680("ۗܺ")) * 127;
                        i11 = ((iM55681 ^ i19) * (-9167)) ^ (-98334070);
                        i13 = 581115089;
                        i14 = iM55681 ^ i13;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i16 = i30;
                        i21 = i14;
                        i20 = i11;
                        i22 = i16;
                    }
                    i24 = i24;
                    i25 = i25;
                    i27 = i27;
                    i28 = i28;
                    i17 = i17;
                    i26 = i26;
                    iM559710 = (i18 - C0873.m55680("֡᩶")) * (-45);
                    i11 = ((iM559710 ^ i19) * (-18305)) ^ (-467982338);
                    i12 = -1077160616;
                    i14 = iM559710 ^ i12;
                    i24 = i24;
                    i25 = i25;
                    i17 = i17;
                    i26 = i26;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i27 = i27;
                    i28 = i28;
                    view9 = view8;
                    c1916 = c1914;
                    i16 = i30;
                    i21 = i14;
                    i20 = i11;
                    i22 = i16;
                    break;
                case -2078622479:
                case -36640573:
                    return C1914.f72089;
                case -2040393926:
                case 983533889:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    view7.setPadding(iArr7[c], iArr7[i17] + i29, iArr7[c2], iArr7[c3]);
                    i24 = i24;
                    i25 = i25;
                    i27 = i27;
                    i28 = i28;
                    i17 = i17;
                    i26 = i26;
                    iM559710 = (i18 - C0873.m55680("֡᩶")) * (-45);
                    i11 = ((iM559710 ^ i19) * (-18305)) ^ (-467982338);
                    i12 = -1077160616;
                    i14 = iM559710 ^ i12;
                    i24 = i24;
                    i25 = i25;
                    i17 = i17;
                    i26 = i26;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i27 = i27;
                    i28 = i28;
                    view9 = view8;
                    c1916 = c1914;
                    i16 = i30;
                    i21 = i14;
                    i20 = i11;
                    i22 = i16;
                    break;
                case -2004057672:
                case 196109038:
                    z = true;
                    iM559710 = (C0946.m55979("ۘ۟") + i19) * 97;
                    i11 = ((iM559710 ^ i18) * (-7363)) ^ 1460457802;
                    i12 = 480790622;
                    i14 = iM559710 ^ i12;
                    i24 = i24;
                    i25 = i25;
                    i17 = i17;
                    i26 = i26;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i27 = i27;
                    i28 = i28;
                    view9 = view8;
                    c1916 = c1914;
                    i16 = i30;
                    i21 = i14;
                    i20 = i11;
                    i22 = i16;
                    break;
                case -1835956059:
                case 1644773234:
                    C0873.m55678();
                    if (C1964.f83032 <= 0) {
                        i30 = i30;
                        iM55682 = (C0946.m55979("ۗۖ") + i18) * (-17);
                        i11 = ((iM55682 ^ i19) * (-8215)) ^ (-1229825444);
                        i15 = 1577669056;
                        i14 = iM55682 ^ i15;
                        i16 = i30;
                        i21 = i14;
                        i20 = i11;
                    } else {
                        int iM55684 = C0873.m55680("ۘۨ") ^ i18;
                        i20 = ((iM55684 ^ i19) * (-8121)) ^ (-2056575803);
                        i16 = i30;
                        i21 = iM55684 ^ 1050950383;
                    }
                    i22 = i16;
                    break;
                case -1813689897:
                case 994149327:
                    C0894.m55769();
                    C0927.m55873();
                    return null;
                case -1793610130:
                case -1343482343:
                    i30 = i30;
                    C0866.m55645();
                    c1915 = c1916;
                    i4 = i27;
                    i5 = i17;
                    int iM559711 = (C0946.m55979("᩷ۘ") ^ i19) * (-121);
                    i17 = i5;
                    i20 = ((iM559711 ^ i18) * 22337) ^ (-1430387987);
                    i22 = i30;
                    i21 = iM559711 ^ (-1622064966);
                    i27 = i4;
                    i28 = i28;
                    c1916 = c1915;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    view9 = view8;
                    break;
                case -1703960223:
                case 1279078795:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i2 = i24;
                    i28 = i28;
                    c1915 = c1916;
                    i3 = i26;
                    i4 = i27;
                    i5 = i17;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("֫ۖ") ^ i19) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM55979 ^ i18) * 9111) ^ (-890546334);
                        i7 = -1744561863;
                    } else {
                        iM55979 = C0873.m55680("ۙ֫") ^ i19;
                        i6 = ((iM55979 ^ i18) * (-489)) ^ 2087998172;
                        i7 = 1584347627;
                    }
                    i8 = iM55979 ^ i7;
                    i20 = i6;
                    i17 = i5;
                    i26 = i3;
                    i22 = i30;
                    i27 = i4;
                    i28 = i28;
                    c1916 = c1915;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i2;
                    view9 = view8;
                    break;
                case -1540875648:
                case 402005224:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i2 = i24;
                    i28 = i28;
                    c1915 = c1916;
                    i3 = i26;
                    i4 = i27;
                    i5 = i17;
                    if (C1194.f82045 == 0) {
                        iM55979 = (C0946.m55979("ۨ᩶") ^ i18) * (-53);
                        i6 = ((iM55979 ^ i19) * 31071) ^ 534016218;
                        i7 = 813746159;
                        i8 = iM55979 ^ i7;
                        i20 = i6;
                        i17 = i5;
                        i26 = i3;
                        i22 = i30;
                        i27 = i4;
                        i28 = i28;
                        c1916 = c1915;
                        i21 = i8;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i24 = i2;
                        view9 = view8;
                    }
                    i24 = i2;
                    i26 = i3;
                    int iM559712 = (C0946.m55979("᩷ۘ") ^ i19) * (-121);
                    i17 = i5;
                    i20 = ((iM559712 ^ i18) * 22337) ^ (-1430387987);
                    i22 = i30;
                    i21 = iM559712 ^ (-1622064966);
                    i27 = i4;
                    i28 = i28;
                    c1916 = c1915;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    view9 = view8;
                    break;
                case -1224740825:
                case 751109452:
                    i30 = i30;
                    C0845.m55584();
                    if (RunnableC0938.f81886 < 0) {
                        iM55682 = (C0946.m55979("ۗۖ") + i18) * (-17);
                        i11 = ((iM55682 ^ i19) * (-8215)) ^ (-1229825444);
                        i15 = 1577669056;
                        i14 = iM55682 ^ i15;
                        i16 = i30;
                        i21 = i14;
                        i20 = i11;
                        i22 = i16;
                    } else {
                        c1915 = c1916;
                        i4 = i27;
                        i5 = i17;
                        int iM559713 = (C0946.m55979("᩷ۘ") ^ i19) * (-121);
                        i17 = i5;
                        i20 = ((iM559713 ^ i18) * 22337) ^ (-1430387987);
                        i22 = i30;
                        i21 = iM559713 ^ (-1622064966);
                        i27 = i4;
                        i28 = i28;
                        c1916 = c1915;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        view9 = view8;
                    }
                    break;
                case -1209342655:
                case 664768754:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    if (view9 == null) {
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        iM55682 = (C0873.m55680("۠֫") + i19) * (-53);
                        i11 = ((iM55682 ^ i18) * (-443)) ^ 800085481;
                        i15 = 913664132;
                        i14 = iM55682 ^ i15;
                        i16 = i30;
                        i21 = i14;
                        i20 = i11;
                        i22 = i16;
                    } else {
                        iM55681 = C0873.m55680("ܿۡ") ^ i18;
                        i11 = ((iM55681 ^ i19) * WhirlpoolDigest.REDUCTION_POLYNOMIAL) ^ 1301476954;
                        i13 = 1550259005;
                        i14 = iM55681 ^ i13;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i16 = i30;
                        i21 = i14;
                        i20 = i11;
                        i22 = i16;
                    }
                    break;
                case -1106375020:
                case 1369202030:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i2 = i24;
                    i28 = i28;
                    c1915 = c1916;
                    i3 = i26;
                    i4 = i27;
                    i5 = i17;
                    if (C0937.f81884) {
                        iM55979 = (C0873.m55680("۬ܺ") + i19) * (-27);
                        i6 = ((iM55979 ^ i18) * (-22043)) ^ 1301874280;
                        i7 = -1961489104;
                    } else {
                        iM55979 = (C0873.m55680("֫ۖ") ^ i19) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM55979 ^ i18) * 9111) ^ (-890546334);
                        i7 = -1744561863;
                    }
                    i8 = iM55979 ^ i7;
                    i20 = i6;
                    i17 = i5;
                    i26 = i3;
                    i22 = i30;
                    i27 = i4;
                    i28 = i28;
                    c1916 = c1915;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i2;
                    view9 = view8;
                    break;
                case -1096743182:
                case 629300588:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i2 = i24;
                    i28 = i28;
                    c1915 = c1916;
                    i3 = i26;
                    i4 = i27;
                    i5 = i17;
                    if (!z2) {
                        iM55979 = (C0873.m55680("ܰۛ") + i18) * 47;
                        i6 = ((iM55979 ^ i19) * 32561) ^ 468084582;
                        i7 = 740785936;
                        i8 = iM55979 ^ i7;
                        i20 = i6;
                        i17 = i5;
                        i26 = i3;
                        i22 = i30;
                        i27 = i4;
                        i28 = i28;
                        c1916 = c1915;
                        i21 = i8;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i24 = i2;
                        view9 = view8;
                    }
                    i24 = i2;
                    i26 = i3;
                    int iM559714 = (C0946.m55979("᩷ۘ") ^ i19) * (-121);
                    i17 = i5;
                    i20 = ((iM559714 ^ i18) * 22337) ^ (-1430387987);
                    i22 = i30;
                    i21 = iM559714 ^ (-1622064966);
                    i27 = i4;
                    i28 = i28;
                    c1916 = c1915;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    view9 = view8;
                    break;
                case -972229805:
                case 1973366458:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i4 = i27;
                    i28 = i28;
                    iM55598 = C0854.m55598(i4, i28);
                    c = 0;
                    i26 = iArr[0] + c1388Mo112.f36103;
                    i25 = iArr[1];
                    c2 = 2;
                    i24 = iArr[2] + c1388Mo112.f36104;
                    c3 = 3;
                    if (C0854.f81826 != 0) {
                        c1915 = c1914;
                        i5 = 1;
                        int iM559715 = (C0946.m55979("᩷ۘ") ^ i19) * (-121);
                        i17 = i5;
                        i20 = ((iM559715 ^ i18) * 22337) ^ (-1430387987);
                        i22 = i30;
                        i21 = iM559715 ^ (-1622064966);
                        i27 = i4;
                        i28 = i28;
                        c1916 = c1915;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        view9 = view8;
                    } else {
                        int iM55685 = (C0873.m55680("᩻ۘ") ^ i18) * 13;
                        view9 = view8;
                        i27 = i4;
                        i28 = i28;
                        i22 = i30;
                        i23 = i23;
                        i17 = 1;
                        c1916 = c1914;
                        i21 = iM55685 ^ 284874226;
                        i20 = ((iM55685 ^ i19) * 23071) ^ (-534496610);
                        marginLayoutParams = marginLayoutParams;
                    }
                    break;
                case -816232443:
                case 1080167534:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i2 = i24;
                    i28 = i28;
                    c1915 = c1916;
                    i3 = i26;
                    i4 = i27;
                    i5 = i17;
                    z2 = C0947.f81895;
                    iM55979 = (C0946.m55979("ۙۘ") ^ i19) * 91;
                    i6 = ((iM55979 ^ i18) * 20311) ^ 381224071;
                    i7 = -30399557;
                    i8 = iM55979 ^ i7;
                    i20 = i6;
                    i17 = i5;
                    i26 = i3;
                    i22 = i30;
                    i27 = i4;
                    i28 = i28;
                    c1916 = c1915;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i2;
                    view9 = view8;
                    break;
                case -812892365:
                case 1822719215:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i2 = i24;
                    i28 = i28;
                    c1915 = c1916;
                    i3 = i26;
                    i4 = i27;
                    i5 = i17;
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("ۖۧ") ^ i19;
                        i6 = ((iM55979 ^ i18) * 13465) ^ (-264114611);
                        i7 = -1325417967;
                    } else {
                        iM55979 = C0946.m55979("֡ᩳ") ^ i18;
                        i6 = ((iM55979 ^ i19) * (-741)) ^ (-558251145);
                        i7 = -1836598606;
                    }
                    i8 = iM55979 ^ i7;
                    i20 = i6;
                    i17 = i5;
                    i26 = i3;
                    i22 = i30;
                    i27 = i4;
                    i28 = i28;
                    c1916 = c1915;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i2;
                    view9 = view8;
                    break;
                case -770189257:
                case 2025579222:
                    i30 = i30;
                    marginLayoutParams.bottomMargin = i23;
                    view9.setLayoutParams(marginLayoutParams);
                    iM55682 = (C0873.m55680("۠֫") + i19) * (-53);
                    i11 = ((iM55682 ^ i18) * (-443)) ^ 800085481;
                    i15 = 913664132;
                    i14 = iM55682 ^ i15;
                    i16 = i30;
                    i21 = i14;
                    i20 = i11;
                    i22 = i16;
                    break;
                case -734206617:
                case 1000878733:
                    i30 = i30;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) C1229.m56402(view8);
                    i23 = i + iM55598;
                    if (marginLayoutParams.bottomMargin != i23) {
                        iM55682 = (i19 - C0873.m55680("ۜ᩻")) * (-39);
                        i11 = ((iM55682 ^ i18) * (-16285)) ^ 899459104;
                        i15 = -1093235579;
                    } else {
                        iM55682 = (C0873.m55680("۠֫") + i19) * (-53);
                        i11 = ((iM55682 ^ i18) * (-443)) ^ 800085481;
                        i15 = 913664132;
                    }
                    i14 = iM55682 ^ i15;
                    i16 = i30;
                    i21 = i14;
                    i20 = i11;
                    i22 = i16;
                    break;
                case -193290531:
                case 1333064943:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i2 = i24;
                    i28 = i28;
                    c1915 = c1916;
                    i3 = i26;
                    i4 = i27;
                    i5 = i17;
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("֡ᩳ") ^ i18;
                        i6 = ((iM55979 ^ i19) * (-741)) ^ (-558251145);
                        i7 = -1836598606;
                    } else {
                        iM55979 = (C0873.m55680("ܽۛ") ^ i19) * 9;
                        i6 = ((iM55979 ^ i18) * 30401) ^ (-1770584913);
                        i7 = 1210356178;
                    }
                    i8 = iM55979 ^ i7;
                    i20 = i6;
                    i17 = i5;
                    i26 = i3;
                    i22 = i30;
                    i27 = i4;
                    i28 = i28;
                    c1916 = c1915;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i2;
                    view9 = view8;
                    break;
                case -58658093:
                case 1249652504:
                    int i31 = i23;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    int i32 = i24;
                    int i33 = i25;
                    int i34 = i27;
                    int i35 = i28;
                    int i36 = i17;
                    int i37 = i26;
                    view.setPadding(i37, i33, i32, iArr[c3] + iM55598);
                    int i38 = iArr2[c];
                    int i39 = iArr2[i36];
                    int i40 = c1388Mo112.f36105;
                    view2.setPadding(i38, i39 + i40, iArr2[c2], iArr2[c3]);
                    int i41 = C1717.f57146;
                    if (c14784.getLayoutDirection() == i36) {
                        iM55680 = C0873.m55680("᩸ۡ") ^ i18;
                        i9 = ((iM55680 ^ i19) * (-18081)) ^ (-392248109);
                        i10 = 13937417;
                    } else {
                        iM55680 = C0873.m55680("ᩴᩳ") ^ i19;
                        i9 = ((iM55680 ^ i18) * (-4677)) ^ (-1388329704);
                        i10 = -1098605281;
                    }
                    int i42 = iM55680 ^ i10;
                    i24 = i32;
                    i25 = i33;
                    i29 = i40;
                    i17 = i36;
                    i26 = i37;
                    i22 = i30;
                    marginLayoutParams = marginLayoutParams2;
                    i27 = i34;
                    i28 = i35;
                    view9 = view8;
                    c1916 = c1914;
                    i21 = i42;
                    i20 = i9;
                    i23 = i31;
                    break;
                case 306607436:
                case 555532266:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i2 = i24;
                    i5 = i17;
                    i3 = i26;
                    c1915 = c1916;
                    c1388Mo112 = abstractActivityC5549.mo112(c1915);
                    C1388 c1388M51163 = c1915.m51163(8);
                    int i43 = c1388Mo112.f36102;
                    int i44 = c1388M51163.f36102;
                    if (C0906.f81862 >= 0) {
                        i28 = i44;
                        i4 = i43;
                        iM55979 = C0946.m55979("֡ᩳ") ^ i18;
                        i6 = ((iM55979 ^ i19) * (-741)) ^ (-558251145);
                        i7 = -1836598606;
                        i8 = iM55979 ^ i7;
                        i20 = i6;
                        i17 = i5;
                        i26 = i3;
                        i22 = i30;
                        i27 = i4;
                        i28 = i28;
                    } else {
                        int iM55686 = C0873.m55680("ᩴ֡") ^ i18;
                        int i45 = ((iM55686 ^ i19) * 28881) ^ (-1925359258);
                        i8 = iM55686 ^ 1314183974;
                        i20 = i45;
                        i17 = i5;
                        i26 = i3;
                        i22 = i30;
                        i28 = i44;
                        i27 = i43;
                    }
                    c1916 = c1915;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i2;
                    view9 = view8;
                    break;
                case 450651032:
                case 1244857071:
                    C1036.m56257();
                    if (C0854.f81826 == 0) {
                        i30 = i30;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i2 = i24;
                        i28 = i28;
                        c1915 = c1916;
                        i3 = i26;
                        i4 = i27;
                        i5 = i17;
                        iM55979 = (C0873.m55680("֫ۖ") ^ i19) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM55979 ^ i18) * 9111) ^ (-890546334);
                        i7 = -1744561863;
                        i8 = iM55979 ^ i7;
                        i20 = i6;
                        i17 = i5;
                        i26 = i3;
                        i22 = i30;
                        i27 = i4;
                        i28 = i28;
                        c1916 = c1915;
                        i21 = i8;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        i24 = i2;
                        view9 = view8;
                    } else {
                        i30 = i30;
                        c1915 = c1916;
                        i4 = i27;
                        i5 = i17;
                        int iM559716 = (C0946.m55979("᩷ۘ") ^ i19) * (-121);
                        i17 = i5;
                        i20 = ((iM559716 ^ i18) * 22337) ^ (-1430387987);
                        i22 = i30;
                        i21 = iM559716 ^ (-1622064966);
                        i27 = i4;
                        i28 = i28;
                        c1916 = c1915;
                        i23 = i23;
                        marginLayoutParams = marginLayoutParams;
                        view9 = view8;
                    }
                    break;
                case 567222496:
                case 1526908111:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i24;
                    i25 = i25;
                    C1388 c1388 = c1388Mo112;
                    i27 = i27;
                    i17 = i17;
                    int i46 = iM55598;
                    i28 = i28;
                    i26 = i26;
                    m12244(view3, view4, iArr3, iArr4, c1388, i46, !z);
                    m12244(view5, view6, iArr5, iArr6, c1388, i46, z);
                    if (view7 != null) {
                        iM559710 = C0873.m55680("֡᩺") ^ i19;
                        i11 = ((iM559710 ^ i18) * 13747) ^ 1833483713;
                        i12 = 1757644474;
                    } else {
                        iM559710 = (i18 - C0873.m55680("֡᩶")) * (-45);
                        i11 = ((iM559710 ^ i19) * (-18305)) ^ (-467982338);
                        i12 = -1077160616;
                    }
                    i14 = iM559710 ^ i12;
                    i24 = i24;
                    i25 = i25;
                    i17 = i17;
                    i26 = i26;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i27 = i27;
                    i28 = i28;
                    view9 = view8;
                    c1916 = c1914;
                    i16 = i30;
                    i21 = i14;
                    i20 = i11;
                    i22 = i16;
                    break;
                case 795085898:
                case 1664591533:
                    z = false;
                    iM559710 = (C0946.m55979("ۘ۟") + i19) * 97;
                    i11 = ((iM559710 ^ i18) * (-7363)) ^ 1460457802;
                    i12 = 480790622;
                    i14 = iM559710 ^ i12;
                    i24 = i24;
                    i25 = i25;
                    i17 = i17;
                    i26 = i26;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i27 = i27;
                    i28 = i28;
                    view9 = view8;
                    c1916 = c1914;
                    i16 = i30;
                    i21 = i14;
                    i20 = i11;
                    i22 = i16;
                    break;
                case 1759013222:
                case 1921101733:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i2 = i24;
                    i28 = i28;
                    c1915 = c1916;
                    i3 = i26;
                    i4 = i27;
                    i5 = i17;
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("֡ᩳ") ^ i18;
                        i6 = ((iM55979 ^ i19) * (-741)) ^ (-558251145);
                        i7 = -1836598606;
                    } else {
                        iM55979 = C0946.m55979("۠᩵") ^ i18;
                        i6 = ((iM55979 ^ i19) * 13723) ^ 1731468471;
                        i7 = -999895098;
                    }
                    i8 = iM55979 ^ i7;
                    i20 = i6;
                    i17 = i5;
                    i26 = i3;
                    i22 = i30;
                    i27 = i4;
                    i28 = i28;
                    c1916 = c1915;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i2;
                    view9 = view8;
                    break;
                default:
                    i30 = i30;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i2 = i24;
                    i28 = i28;
                    c1915 = c1916;
                    i3 = i26;
                    i4 = i27;
                    i5 = i17;
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("֫ۖ") ^ i19) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM55979 ^ i18) * 9111) ^ (-890546334);
                        i7 = -1744561863;
                    } else {
                        iM55979 = (i18 - C0946.m55979("۬ۧ")) * 77;
                        i6 = ((iM55979 ^ i19) * 30615) ^ 71000719;
                        i7 = -1120947859;
                    }
                    i8 = iM55979 ^ i7;
                    i20 = i6;
                    i17 = i5;
                    i26 = i3;
                    i22 = i30;
                    i27 = i4;
                    i28 = i28;
                    c1916 = c1915;
                    i21 = i8;
                    i23 = i23;
                    marginLayoutParams = marginLayoutParams;
                    i24 = i2;
                    view9 = view8;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12260(Throwable th, boolean z) {
        DialogInterface.OnDismissListener onDismissListener = null;
        int i = -1295656167;
        int i2 = C1964.f83032;
        int i3 = C0873.f81841;
        int iM55680 = C0873.m55680("۠ۖ") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-5789)) ^ (-1596362922);
        int i5 = -1030285970;
        while (true) {
            i = ((((i ^ i3) * (-22295)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2005951516:
                case 444161859:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0873.m55680("֨ᩴ") ^ i3) * (-117);
                        i4 = ((iM55680 ^ i2) * 3951) ^ (-1494099025);
                        i5 = -509731622;
                    } else {
                        iM55680 = C0873.m55680("ܽ֨") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1891) ^ (-371797182);
                        i5 = -497864791;
                    }
                    break;
                case -1969316153:
                case 175526194:
                    if (C1046.m56302() != 0) {
                        iM55680 = C0946.m55979("֡֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20959) ^ (-1020651879);
                        i5 = -1150570217;
                    } else {
                        iM55680 = (C0873.m55680("۟۬") + i2) * 87;
                        i4 = ((iM55680 ^ i3) * (-24637)) ^ 1560732433;
                        i5 = 452835816;
                    }
                    break;
                case -1895949005:
                case -145045220:
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0873.m55680("۟۬") + i2) * 87;
                        i4 = ((iM55680 ^ i3) * (-24637)) ^ 1560732433;
                        i5 = 452835816;
                    } else {
                        iM55680 = C0946.m55979("ܶܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-7449)) ^ 1799532502;
                        i5 = -405278974;
                    }
                    break;
                case -1895136968:
                case 1826651700:
                    RunnableC0897.m55784();
                    break;
                case -1479331519:
                case -1025081683:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0946.m55979("֡֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20959) ^ (-1020651879);
                        i5 = -1150570217;
                    } else {
                        iM55680 = (C0946.m55979("ᩴᩳ") ^ i2) * (-115);
                        i4 = ((iM55680 ^ i3) * (-32743)) ^ 1280321814;
                        i5 = 1407043105;
                    }
                    break;
                case -1432815403:
                case 356119321:
                    if (z) {
                        iM55680 = C0946.m55979("֫ᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30607)) ^ 1757438838;
                        i5 = -838017188;
                    } else {
                        iM55680 = (C0946.m55979("᩵ܿ") + i3) * (-117);
                        i4 = ((iM55680 ^ i2) * 19541) ^ 666709543;
                        i5 = -807672255;
                    }
                    break;
                case -1275368815:
                case 12269673:
                    if (C0949.m56012()) {
                        iM55680 = (C0873.m55680("ۗܶ") + i2) * 63;
                        i4 = ((iM55680 ^ i3) * 27589) ^ (-451835763);
                        i5 = 1231222636;
                    } else {
                        iM55680 = (i2 - C0873.m55680("᩵᩵")) * 95;
                        i4 = ((iM55680 ^ i3) * (-22051)) ^ (-1018281981);
                        i5 = -348351548;
                    }
                    break;
                case -1205444564:
                case -68217962:
                    onDismissListener = new DialogInterface.OnDismissListener() { // from class: l.֡ܺ᩷
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            int i6 = -311124708;
                            int i7 = C1404.f82149;
                            int i8 = ServiceConnectionC1013.f81940;
                            int iM55681 = (C0873.m55680("۬۟") + i7) * 87;
                            int i9 = ((iM55681 ^ i8) * (-2715)) ^ (-771024020);
                            int i10 = 820740241;
                            while (true) {
                                i6 = ((((i6 ^ i8) * 15919) >> 31) & i9) ^ (iM55681 ^ i10);
                                switch (i6) {
                                    case -2051458906:
                                    case 1814429827:
                                        if (C0845.f81821 >= 0) {
                                            iM55681 = C0946.m55979("ۘܽ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * 27727) ^ (-453704019);
                                            i10 = 225651977;
                                        } else {
                                            iM55681 = (i7 - C0946.m55979("ۚܶ")) * (-55);
                                            i9 = ((iM55681 ^ i8) * (-713)) ^ 1821221175;
                                            i10 = -1560601003;
                                        }
                                        break;
                                    case -1958244800:
                                    case -1433744808:
                                        if (C0989.f81920 >= 0) {
                                            iM55681 = (i7 - C0946.m55979("ۚܶ")) * (-55);
                                            i9 = ((iM55681 ^ i8) * (-713)) ^ 1821221175;
                                            i10 = -1560601003;
                                        } else {
                                            iM55681 = (C0946.m55979("ܳ᩺") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i9 = ((iM55681 ^ i8) * 14829) ^ (-1387835322);
                                            i10 = -1239262155;
                                        }
                                        break;
                                    case -1858235001:
                                    case -1839900886:
                                        if (C0967.f81910 >= 0) {
                                            iM55681 = (i7 - C0946.m55979("ۚܶ")) * (-55);
                                            i9 = ((iM55681 ^ i8) * (-713)) ^ 1821221175;
                                            i10 = -1560601003;
                                        } else {
                                            iM55681 = (C0873.m55680("᩸ۜ") ^ i8) * 51;
                                            i9 = ((iM55681 ^ i7) * 7385) ^ (-224036648);
                                            i10 = -1081965636;
                                        }
                                        break;
                                    case -1787578138:
                                    case 1314344613:
                                        if (C1404.f82149 >= 0) {
                                            iM55681 = (i8 - C0946.m55979("ۜۖ")) * 127;
                                            i9 = ((iM55681 ^ i7) * 77) ^ (-2023243579);
                                            i10 = 2101151005;
                                        } else {
                                            iM55681 = (i7 - C0946.m55979("ۚܶ")) * (-55);
                                            i9 = ((iM55681 ^ i8) * (-713)) ^ 1821221175;
                                            i10 = -1560601003;
                                        }
                                        break;
                                    case -1415269251:
                                    case -99120570:
                                        if (C0967.f81910 >= 0) {
                                            iM55681 = C0873.m55680("᩸ۤ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * 5587) ^ (-1052312251);
                                            i10 = 1766717114;
                                        } else {
                                            iM55681 = (C0946.m55979("ۗ֡") ^ i8) * (-61);
                                            i9 = ((iM55681 ^ i7) * 18609) ^ 478563343;
                                            i10 = 1305474543;
                                        }
                                        break;
                                    case -1341653104:
                                    case -431303652:
                                        if (ViewOnClickListenerC0939.m55941() >= 0) {
                                            iM55681 = (i7 - C0946.m55979("ۚܶ")) * (-55);
                                            i9 = ((iM55681 ^ i8) * (-713)) ^ 1821221175;
                                            i10 = -1560601003;
                                        } else {
                                            iM55681 = (i7 - C0873.m55680("ᩴܰ")) * 89;
                                            i9 = ((iM55681 ^ i8) * 11451) ^ 684653448;
                                            i10 = 1966883754;
                                        }
                                        break;
                                    case -1282268882:
                                    case -95654041:
                                        if (C0949.f81897 >= 0) {
                                            iM55681 = C0873.m55680("ܽ᩵") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 9435) ^ 1707241695;
                                            i10 = 1096377602;
                                        } else {
                                            iM55681 = C0946.m55979("ۙۜ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 26225) ^ (-708950942);
                                            i10 = 747767095;
                                        }
                                        break;
                                    case -992631327:
                                    case -933523332:
                                        if (C1964.f83032 <= 0) {
                                            iM55681 = C0946.m55979("ۘܽ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * 27727) ^ (-453704019);
                                            i10 = 225651977;
                                        } else {
                                            iM55681 = (C0873.m55680("᩹ۖ") + i7) * 19;
                                            i9 = ((iM55681 ^ i8) * (-14203)) ^ 216667387;
                                            i10 = 1494517671;
                                        }
                                        break;
                                    case -916317674:
                                    case -511442148:
                                        if (!C0949.m56012()) {
                                            iM55681 = C0873.m55680("ܽ᩵") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 9435) ^ 1707241695;
                                            i10 = 1096377602;
                                        } else {
                                            iM55681 = (i8 - C0946.m55979("ۜۖ")) * 127;
                                            i9 = ((iM55681 ^ i7) * 77) ^ (-2023243579);
                                            i10 = 2101151005;
                                        }
                                        break;
                                    case -908337419:
                                    case 214786162:
                                        C0917.m55854();
                                        break;
                                    case -207035369:
                                    case 1063369452:
                                        C1929.m56553();
                                        iM55681 = (i7 - C0946.m55979("ۚܶ")) * (-55);
                                        i9 = ((iM55681 ^ i8) * (-713)) ^ 1821221175;
                                        i10 = -1560601003;
                                        break;
                                    case -122095320:
                                    case 106290869:
                                        if (C0946.f81894 != 0) {
                                            iM55681 = C0946.m55979("ۘܽ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * 27727) ^ (-453704019);
                                            i10 = 225651977;
                                        } else {
                                            iM55681 = (C0946.m55979("ۚۛ") + i8) * 3;
                                            i9 = ((iM55681 ^ i7) * (-25369)) ^ (-1678393518);
                                            i10 = 1833879150;
                                        }
                                        break;
                                    case -3161088:
                                    case 760653549:
                                        RunnableC0897.m55775(this.f4953);
                                        break;
                                    case 712316904:
                                    case 1210271241:
                                        if (C1017.f81942 >= 0) {
                                            iM55681 = C0873.m55680("᩸ۤ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * 5587) ^ (-1052312251);
                                            i10 = 1766717114;
                                        } else {
                                            iM55681 = C0946.m55979("ۤۡ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * (-4075)) ^ (-2116959133);
                                            i10 = -331179372;
                                        }
                                        break;
                                    case 946364885:
                                    case 1619443635:
                                        if (C0992.f81922 >= 0) {
                                            iM55681 = C0873.m55680("᩸ۤ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * 5587) ^ (-1052312251);
                                            i10 = 1766717114;
                                        } else {
                                            iM55681 = (i8 - C0946.m55979("ܰܶ")) * 65;
                                            i9 = ((iM55681 ^ i7) * (-6143)) ^ 1749318779;
                                            i10 = -1148748691;
                                        }
                                        break;
                                    default:
                                        int i11 = AbstractActivityC5549.f13384;
                                        if (RunnableC0897.f81856) {
                                            iM55681 = C0946.m55979("᩺ۖ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * (-21615)) ^ (-533119939);
                                            i10 = 322636524;
                                        } else {
                                            iM55681 = C0873.m55680("᩸ۤ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * 5587) ^ (-1052312251);
                                            i10 = 1766717114;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    iM55680 = (C0873.m55680("ۨ֨") ^ i2) * 81;
                    i4 = ((iM55680 ^ i3) * (-10987)) ^ 1336231610;
                    i5 = -58004383;
                    break;
                case -1193072924:
                case 62466028:
                    if (C1048.f81963) {
                        iM55680 = (i3 - C0946.m55979("᩵֡")) * 27;
                        i4 = ((iM55680 ^ i2) * (-2465)) ^ 570965339;
                        i5 = 598296911;
                    } else {
                        iM55680 = (C0873.m55680("۟۬") + i2) * 87;
                        i4 = ((iM55680 ^ i3) * (-24637)) ^ 1560732433;
                        i5 = 452835816;
                    }
                    break;
                case -1117264135:
                case 1846052743:
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0873.m55680("ۗܶ") + i2) * 63;
                        i4 = ((iM55680 ^ i3) * 27589) ^ (-451835763);
                        i5 = 1231222636;
                    } else {
                        iM55680 = (C0946.m55979("֡ۙ") + i2) * 5;
                        i4 = ((iM55680 ^ i3) * 6925) ^ 1674272074;
                        i5 = -2061683005;
                    }
                    break;
                case -1005935052:
                case -143341445:
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0946.m55979("֨۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25393)) ^ (-1319164373);
                        i5 = -1481685688;
                    } else {
                        iM55680 = (C0873.m55680("᩻ܽ") ^ i2) * 63;
                        i4 = ((iM55680 ^ i3) * 2633) ^ (-105627229);
                        i5 = 1561395455;
                    }
                    break;
                case -775225246:
                case 524252544:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("֡֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20959) ^ (-1020651879);
                        i5 = -1150570217;
                    } else {
                        iM55680 = C0946.m55979("ۧۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26385)) ^ 1170464245;
                        i5 = -1739174599;
                    }
                    break;
                case -505681295:
                case 2026141491:
                    if (!C0947.m55997()) {
                        iM55680 = C0946.m55979("֨۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25393)) ^ (-1319164373);
                        i5 = -1481685688;
                    } else {
                        iM55680 = (C0873.m55680("۟۬") + i2) * 87;
                        i4 = ((iM55680 ^ i3) * (-24637)) ^ 1560732433;
                        i5 = 452835816;
                    }
                    break;
                case -242084750:
                case 1256845361:
                    ServiceConnectionC1013.m56155(this, th, onDismissListener);
                    break;
                case -193424167:
                case 1148427217:
                    onDismissListener = null;
                    iM55680 = (C0873.m55680("ۨ֨") ^ i2) * 81;
                    i4 = ((iM55680 ^ i3) * (-10987)) ^ 1336231610;
                    i5 = -58004383;
                    break;
                case -48292787:
                case 1052018844:
                    C1053.m56327();
                    C0917.m55854();
                    iM55680 = (C0873.m55680("֨ᩴ") ^ i3) * (-117);
                    i4 = ((iM55680 ^ i2) * 3951) ^ (-1494099025);
                    i5 = -509731622;
                    break;
                case 633555372:
                case 1980917200:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0946.m55979("֨۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25393)) ^ (-1319164373);
                        i5 = -1481685688;
                    } else {
                        iM55680 = C0873.m55680("ۚ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 31239) ^ (-445642144);
                        i5 = -1155664628;
                    }
                    break;
                case 1183119403:
                case 1250930008:
                    RunnableC0897.m55784();
                    if (!C0917.f81868) {
                        iM55680 = C0946.m55979("֨۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25393)) ^ (-1319164373);
                        i5 = -1481685688;
                    } else {
                        iM55680 = (C0873.m55680("֨ᩴ") ^ i3) * (-117);
                        i4 = ((iM55680 ^ i2) * 3951) ^ (-1494099025);
                        i5 = -509731622;
                    }
                    break;
                default:
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0873.m55680("֨ᩴ") ^ i3) * (-117);
                        i4 = ((iM55680 ^ i2) * 3951) ^ (-1494099025);
                        i5 = -509731622;
                    } else {
                        iM55680 = (C0946.m55979("۬۬") ^ i3) * 35;
                        i4 = ((iM55680 ^ i2) * 28187) ^ (-659843049);
                        i5 = 1138079934;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: ۤ */
    public final void m12270() {
        AbstractC9381 abstractC9381M56294 = null;
        EnumC15415 enumC15415Mo21805 = null;
        ?? r2 = 0;
        WeakReference weakReference = null;
        int i = 1208985228;
        int i2 = C1028.f81950;
        int i3 = C1071.f81975;
        int iM55979 = (i3 - C0946.m55979("ۜۘ")) * (-27);
        int i4 = ((iM55979 ^ i2) * 6823) ^ (-1821817866);
        int i5 = 1370582542;
        while (true) {
            int i6 = iM55979 ^ i5;
            r2 = r2;
            while (true) {
                i = ((((i ^ i2) * 18351) >> 31) & i4) ^ i6;
                switch (i) {
                    case -1982473204:
                    case -13026955:
                        RunnableC0871.m55672();
                        if (C1964.f83032 <= 0) {
                            iM55979 = C0946.m55979("ۡ᩻") ^ i3;
                            i4 = ((iM55979 ^ i2) * 5495) ^ 1506242042;
                            i5 = 1667873938;
                        } else {
                            iM55979 = C0873.m55680("ۧۙ") ^ i3;
                            i4 = ((iM55979 ^ i2) * (-18957)) ^ 1718819229;
                            i5 = -1920466802;
                        }
                        break;
                    case -1868813226:
                    case 53924718:
                        C1964.m56597();
                        C1048.m56305();
                        break;
                    case -1802367330:
                    case -976214411:
                        if (!C0892.f81851) {
                            iM55979 = C0873.m55680("ۙ᩵") ^ i2;
                            i4 = ((iM55979 ^ i3) * (-1579)) ^ 1929959285;
                            i5 = 1710191927;
                        } else {
                            iM55979 = C0873.m55680("ۨ᩺") ^ i2;
                            i4 = ((iM55979 ^ i3) * 7701) ^ 314080518;
                            i5 = -805890811;
                        }
                        break;
                    case -1676226444:
                    case -1422720356:
                        C0917.m55854();
                        C0894.m55769();
                        iM55979 = C0873.m55680("ۙ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1579)) ^ 1929959285;
                        i5 = 1710191927;
                        break;
                    case -1456558734:
                    case 1804406647:
                        if (ServiceConnectionC1013.f81940 < 0) {
                            iM55979 = C0946.m55979("ۜ۠") ^ i3;
                            i4 = ((iM55979 ^ i2) * (-3853)) ^ 1240025904;
                            i5 = 2087803081;
                        } else {
                            iM55979 = C0873.m55680("ۧۙ") ^ i3;
                            i4 = ((iM55979 ^ i2) * (-18957)) ^ 1718819229;
                            i5 = -1920466802;
                        }
                        break;
                    case -1383339284:
                    case 1513493458:
                        if (C0845.f81821 < 0) {
                            iM55979 = C0873.m55680("᩹᩻") ^ i2;
                            i4 = ((iM55979 ^ i3) * 20675) ^ 932828616;
                            i5 = -1654964159;
                        } else {
                            iM55979 = C0946.m55979("ۡ᩻") ^ i3;
                            i4 = ((iM55979 ^ i2) * 5495) ^ 1506242042;
                            i5 = 1667873938;
                        }
                        break;
                    case -1370961273:
                    case 1624828190:
                        if (C1053.f81965 > 0) {
                            iM55979 = (C0873.m55680("᩷ܳ") + i2) * (-81);
                            i4 = ((iM55979 ^ i3) * (-9349)) ^ 371695595;
                            i5 = -642647613;
                        } else {
                            iM55979 = (C0946.m55979("۬ۙ") + i2) * 45;
                            i4 = ((iM55979 ^ i3) * 8061) ^ 387262075;
                            i5 = -345930465;
                        }
                        break;
                    case -1171201427:
                    case -459968385:
                        if (!C0877.m55696()) {
                            iM55979 = C0873.m55680("ۙ᩵") ^ i2;
                            i4 = ((iM55979 ^ i3) * (-1579)) ^ 1929959285;
                            i5 = 1710191927;
                            break;
                        }
                        iM55979 = (i3 - C0873.m55680("ۛܶ")) * 95;
                        i4 = ((iM55979 ^ i2) * (-27623)) ^ (-1173394203);
                        i5 = -873197499;
                        break;
                    case -1141388838:
                    case -767653669:
                        abstractC9381M56294 = C1046.m56294(this);
                        if (C0930.f81879 > 0) {
                            iM55979 = C0873.m55680("ۖۛ") ^ i3;
                            i4 = ((iM55979 ^ i2) * 2235) ^ (-727382983);
                            i5 = -1997287806;
                        } else {
                            iM55979 = C0946.m55979("ۡ᩻") ^ i3;
                            i4 = ((iM55979 ^ i2) * 5495) ^ 1506242042;
                            i5 = 1667873938;
                        }
                        break;
                    case -960151022:
                    case 382670011:
                        C0892.m55749();
                        if (C0930.f81879 <= 0) {
                            iM55979 = (C0946.m55979("۬ۙ") + i2) * 45;
                            i4 = ((iM55979 ^ i3) * 8061) ^ 387262075;
                            i5 = -345930465;
                            break;
                        }
                        iM55979 = C0873.m55680("ۧۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18957)) ^ 1718819229;
                        i5 = -1920466802;
                        break;
                    case -873835921:
                    case 1079405450:
                        if (!enumC15415Mo21805.m35142(EnumC15415.STARTED)) {
                            r2 = 0;
                            iM55979 = C0946.m55979("֨ۚ") ^ i2;
                            i4 = ((iM55979 ^ i3) * (-15545)) ^ 696331662;
                            i5 = 36115180;
                        }
                        int iM559710 = (C0946.m55979("ۙܶ") ^ i3) * 31;
                        i4 = ((iM559710 ^ i2) * (-12029)) ^ (-1477154170);
                        i6 = iM559710 ^ (-1926923305);
                        r2 = 0;
                        break;
                        break;
                    case -815544771:
                    case 172277074:
                        enumC15415Mo21805 = abstractC9381M56294.mo21805();
                        if (C0845.f81821 < 0) {
                            iM55979 = (C0873.m55680("᩺᩵") + i2) * 53;
                            i4 = ((iM55979 ^ i3) * 26809) ^ 429317253;
                            i5 = -2143212337;
                        } else {
                            iM55979 = C0946.m55979("᩻ۤ") ^ i2;
                            i4 = ((iM55979 ^ i3) * (-4821)) ^ 1081467917;
                            i5 = -1608568514;
                        }
                        break;
                    case -346650258:
                    case 1523211661:
                        if (!C0912.m55833()) {
                            iM55979 = (C0946.m55979("ܳᩳ") ^ i3) * 27;
                            i4 = ((iM55979 ^ i2) * (-29713)) ^ 378025092;
                            i5 = -622927587;
                        } else {
                            iM55979 = (C0946.m55979("۬ۙ") + i2) * 45;
                            i4 = ((iM55979 ^ i3) * 8061) ^ 387262075;
                            i5 = -345930465;
                        }
                        break;
                    case -75413626:
                    case 1380061723:
                        if (C1053.f81965 > 0) {
                            iM55979 = (C0946.m55979("ܽܳ") + i3) * 109;
                            i4 = ((iM55979 ^ i2) * (-495)) ^ 690459500;
                            i5 = 861063353;
                        } else {
                            iM55979 = C0873.m55680("ۧۙ") ^ i3;
                            i4 = ((iM55979 ^ i2) * (-18957)) ^ 1718819229;
                            i5 = -1920466802;
                        }
                        break;
                    case 96135557:
                    case 1284056272:
                        f13386 = r2;
                        iM55979 = C0946.m55979("֨ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15545)) ^ 696331662;
                        i5 = 36115180;
                        break;
                    case 197816736:
                    case 1031850548:
                        weakReference = f13386;
                        if (weakReference == null) {
                            iM55979 = C0946.m55979("֨ۚ") ^ i2;
                            i4 = ((iM55979 ^ i3) * (-15545)) ^ 696331662;
                            i5 = 36115180;
                            break;
                        }
                        iM55979 = C0946.m55979("ᩴۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 379) ^ (-861985036);
                        i5 = -1771334351;
                        break;
                    case 500528123:
                    case 1171426792:
                        if (C0890.f81849 == 0) {
                            iM55979 = C0873.m55680("ۧۙ") ^ i3;
                            i4 = ((iM55979 ^ i2) * (-18957)) ^ 1718819229;
                            i5 = -1920466802;
                            break;
                        }
                        iM55979 = C0873.m55680("ۙ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1579)) ^ 1929959285;
                        i5 = 1710191927;
                        break;
                    case 888056532:
                    case 1694428219:
                        this.f13395 = r2;
                        break;
                    case 1295170087:
                    case 1438827872:
                        if (C1028.f81950 > 0) {
                            iM55979 = (i2 - C0873.m55680("ᩴ᩹")) * 99;
                            i4 = ((iM55979 ^ i3) * (-9605)) ^ (-1555629902);
                            i5 = 2123313485;
                        } else {
                            iM55979 = C0873.m55680("ۙ᩵") ^ i2;
                            i4 = ((iM55979 ^ i3) * (-1579)) ^ 1929959285;
                            i5 = 1710191927;
                        }
                        break;
                    default:
                        if (weakReference.get() != this.f13395) {
                            iM55979 = C0946.m55979("֨ۚ") ^ i2;
                            i4 = ((iM55979 ^ i3) * (-15545)) ^ 696331662;
                            i5 = 36115180;
                            break;
                        }
                        iM55979 = (C0946.m55979("᩸۟") + i3) * 61;
                        i4 = ((iM55979 ^ i2) * 27555) ^ 1134603423;
                        i5 = 1996496795;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m12279() {
        return this.f13402;
    }

    @Override // p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public void onStop() {
        WeakReference weakReference = null;
        int i = 1098353035;
        int i2 = C0967.f81910;
        int i3 = RunnableC0938.f81886;
        int iM55979 = (C0946.m55979("᩹ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i4 = ((iM55979 ^ i2) * 15207) ^ 1487995998;
        int i5 = -457242141;
        while (true) {
            i = ((((i ^ i2) * 3915) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2087466601:
                case -1411981408:
                    C0890.m55740();
                    C1028.m56247();
                    iM55979 = (C0946.m55979("᩺ܿ") + i3) * (-79);
                    i4 = ((iM55979 ^ i2) * (-31073)) ^ 424555612;
                    i5 = -337297031;
                    break;
                case -1997552309:
                case -114783821:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("᩶ۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 1419) ^ 1615315595;
                        i5 = 526441808;
                    } else {
                        iM55979 = (C0873.m55680("۬۟") + i2) * 109;
                        i4 = ((iM55979 ^ i3) * (-3441)) ^ (-1322214492);
                        i5 = -1567296376;
                    }
                    break;
                case -1872429267:
                case -1867632742:
                    if (weakReference.get() == this.f13395) {
                        iM55979 = (C0873.m55680("۬۠") ^ i3) * (-93);
                        i4 = ((iM55979 ^ i2) * (-25973)) ^ (-1725826051);
                        i5 = 1777922809;
                    } else {
                        iM55979 = (C0873.m55680("۫ܰ") ^ i3) * 25;
                        i4 = ((iM55979 ^ i2) * 15165) ^ 1985606650;
                        i5 = -745894469;
                    }
                    break;
                case -1798885841:
                case 1667323779:
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0873.m55680("ۨۘ") + i2) * 79;
                        i4 = ((iM55979 ^ i3) * 3305) ^ (-1450115855);
                        i5 = -1278533540;
                    } else {
                        iM55979 = C0946.m55979("ۨܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-19079)) ^ (-1847718147);
                        i5 = -868509936;
                    }
                    break;
                case -1787519005:
                case 1504762167:
                    if (C0946.f81894 != 0) {
                        iM55979 = (i3 - C0873.m55680("ᩴܽ")) * (-49);
                        i4 = ((iM55979 ^ i2) * 3777) ^ (-1866118077);
                        i5 = -2008803592;
                    } else {
                        iM55979 = C0946.m55979("ܿۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8001)) ^ (-137722852);
                        i5 = -2062645684;
                    }
                    break;
                case -1673218281:
                case 1413092527:
                    C0949.m56012();
                    if (C1048.m56305() < 0) {
                        iM55979 = (C0873.m55680("ۨۘ") + i2) * 79;
                        i4 = ((iM55979 ^ i3) * 3305) ^ (-1450115855);
                        i5 = -1278533540;
                    } else {
                        iM55979 = (C0946.m55979("᩺ܿ") + i3) * (-79);
                        i4 = ((iM55979 ^ i2) * (-31073)) ^ 424555612;
                        i5 = -337297031;
                    }
                    break;
                case -1484014452:
                case 29639535:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0946.m55979("᩺ܿ") + i3) * (-79);
                        i4 = ((iM55979 ^ i2) * (-31073)) ^ 424555612;
                        i5 = -337297031;
                    } else {
                        iM55979 = C0946.m55979("᩹֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29073)) ^ 177539579;
                        i5 = 1898552265;
                    }
                    break;
                case -1468105333:
                case -1328678194:
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("ۨۘ") + i2) * 79;
                        i4 = ((iM55979 ^ i3) * 3305) ^ (-1450115855);
                        i5 = -1278533540;
                    } else {
                        iM55979 = (C0946.m55979("۫ᩳ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * 26367) ^ (-1285751418);
                        i5 = 423626343;
                    }
                    break;
                case -1453828103:
                case 167289357:
                    if (C0917.f81868) {
                        iM55979 = (i3 - C0873.m55680("ᩴܽ")) * (-49);
                        i4 = ((iM55979 ^ i2) * 3777) ^ (-1866118077);
                        i5 = -2008803592;
                    } else {
                        iM55979 = (C0873.m55680("᩺ۗ") ^ i3) * (-17);
                        i4 = ((iM55979 ^ i2) * (-13533)) ^ (-1244947521);
                        i5 = -1455929750;
                    }
                    break;
                case -1365716127:
                case -324947380:
                    super.onStop();
                    break;
                case -1347151047:
                case 1574475124:
                    if (C0906.m55809() <= 0) {
                        iM55979 = (C0873.m55680("۬۟") + i2) * 109;
                        i4 = ((iM55979 ^ i3) * (-3441)) ^ (-1322214492);
                        i5 = -1567296376;
                    } else {
                        iM55979 = C0873.m55680("᩹᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26877) ^ (-1581133403);
                        i5 = 556624634;
                    }
                    break;
                case -863198283:
                case 282779736:
                    weakReference = f13386;
                    if (weakReference != null) {
                        iM55979 = C0873.m55680("ܽܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22987) ^ (-654295114);
                        i5 = 465621220;
                    } else {
                        iM55979 = (C0873.m55680("۫ܰ") ^ i3) * 25;
                        i4 = ((iM55979 ^ i2) * 15165) ^ 1985606650;
                        i5 = -745894469;
                    }
                    break;
                case -686595789:
                case 1909604968:
                    if (C0845.f81821 < 0) {
                        iM55979 = (i3 - C0873.m55680("ᩴܽ")) * (-49);
                        i4 = ((iM55979 ^ i2) * 3777) ^ (-1866118077);
                        i5 = -2008803592;
                    } else {
                        iM55979 = C0873.m55680("᩺۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-3067)) ^ (-1193702825);
                        i5 = -316045770;
                    }
                    break;
                case -523665743:
                case -315782818:
                    if (C1194.f82045 != 0) {
                        iM55979 = (C0873.m55680("ۨۘ") + i2) * 79;
                        i4 = ((iM55979 ^ i3) * 3305) ^ (-1450115855);
                        i5 = -1278533540;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩳܿ")) * (-61);
                        i4 = ((iM55979 ^ i3) * 17567) ^ 663228708;
                        i5 = -1610164075;
                    }
                    break;
                case -481811985:
                case 306961670:
                    C1194.m56396();
                    break;
                case -345549414:
                case 510104116:
                    if (this.f13395 != null) {
                        iM55979 = (C0873.m55680("ۢۧ") + i2) * 47;
                        i4 = ((iM55979 ^ i3) * (-21429)) ^ (-427296462);
                        i5 = 1877318562;
                    } else {
                        iM55979 = (C0873.m55680("۫ܰ") ^ i3) * 25;
                        i4 = ((iM55979 ^ i2) * 15165) ^ 1985606650;
                        i5 = -745894469;
                    }
                    break;
                case 351125021:
                case 2123123130:
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0873.m55680("۬۟") + i2) * 109;
                        i4 = ((iM55979 ^ i3) * (-3441)) ^ (-1322214492);
                        i5 = -1567296376;
                    } else {
                        iM55979 = C0873.m55680("ۨ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-21897)) ^ (-329587432);
                        i5 = -1782347932;
                    }
                    break;
                case 445089261:
                case 566438951:
                    if (C0863.m55643()) {
                        iM55979 = C0873.m55680("ۧ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 10799) ^ 976698461;
                        i5 = 586957684;
                    } else {
                        iM55979 = (C0873.m55680("۬۟") + i2) * 109;
                        i4 = ((iM55979 ^ i3) * (-3441)) ^ (-1322214492);
                        i5 = -1567296376;
                    }
                    break;
                case 1540913348:
                case 1769001251:
                    f13386 = null;
                    iM55979 = (C0873.m55680("۫ܰ") ^ i3) * 25;
                    i4 = ((iM55979 ^ i2) * 15165) ^ 1985606650;
                    i5 = -745894469;
                    break;
                default:
                    C1404.m56468();
                    if (C1404.f82149 < 0) {
                        iM55979 = (i3 - C0873.m55680("ᩴܽ")) * (-49);
                        i4 = ((iM55979 ^ i2) * 3777) ^ (-1866118077);
                        i5 = -2008803592;
                    } else {
                        iM55979 = (C0946.m55979("᩺ܿ") + i3) * (-79);
                        i4 = ((iM55979 ^ i2) * (-31073)) ^ 424555612;
                        i5 = -337297031;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z = false;
        boolean z2 = false;
        C6395 c6395 = null;
        C7741 c7741M24117 = null;
        C7350 c7350 = null;
        Display defaultDisplay = null;
        Point point = null;
        int i = 1370861749;
        int i2 = C0949.f81897;
        int i3 = C0992.f81922;
        int iM55979 = (C0946.m55979("ۙܳ") + i2) * (-43);
        int i4 = ((iM55979 ^ i3) * 29193) ^ (-50800662);
        int i5 = -1814163142;
        while (true) {
            i = ((((i ^ i3) * 27179) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1975910249:
                case -1572471833:
                    this.f13400 = C10423.m24117(this, c6395);
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = (C0873.m55680("ܺۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * (-25071)) ^ (-223738335);
                        i5 = 1244108834;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۠ܳ")) * (-7);
                        i4 = ((iM55979 ^ i2) * (-937)) ^ 10055718;
                        i5 = 1927136638;
                    }
                    break;
                case -1971471095:
                case 373408955:
                    if (C13076.f36762) {
                        iM55979 = (C0873.m55680("֡ܶ") ^ i3) * (-127);
                        i4 = ((iM55979 ^ i2) * 12313) ^ 1837977641;
                        i5 = -26103935;
                    } else {
                        iM55979 = (C0946.m55979("۟ۘ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55979 ^ i3) * 24391) ^ (-1485893091);
                        i5 = 473009517;
                    }
                    break;
                case -1846376812:
                case -1229267420:
                    break;
                case -1642186878:
                case 657553689:
                    C0894.m55769();
                    iM55979 = (C0873.m55680("۫ܽ") ^ i3) * 25;
                    i4 = ((iM55979 ^ i2) * (-7675)) ^ 29042200;
                    i5 = -350833765;
                    break;
                case -1448559470:
                case 969531510:
                    if (C0930.f81879 > 0) {
                        iM55979 = (C0873.m55680("ܺۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * (-25071)) ^ (-223738335);
                        i5 = 1244108834;
                    } else {
                        iM55979 = (C0873.m55680("۫ܽ") ^ i3) * 25;
                        i4 = ((iM55979 ^ i2) * (-7675)) ^ 29042200;
                        i5 = -350833765;
                    }
                    break;
                case -1440569186:
                case -338570294:
                    this.f13403 = c7741M24117;
                    super.onCreate(bundle);
                    c7350 = f13385;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 5291) ^ 782305203;
                        i5 = -731336619;
                    } else {
                        iM55979 = C0946.m55979("֡ۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14743) ^ (-681900727);
                        i5 = -86082254;
                    }
                    break;
                case -1419552489:
                case 1827712236:
                    defaultDisplay.getSize(point);
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("ܺۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * (-25071)) ^ (-223738335);
                        i5 = 1244108834;
                    } else {
                        iM55979 = (C0873.m55680("ܰ᩷") ^ i3) * (-51);
                        i4 = ((iM55979 ^ i2) * 16955) ^ 258498961;
                        i5 = 1213820944;
                    }
                    break;
                case -1387274501:
                case 858752558:
                    setTheme(C19552.m44401());
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0873.m55680("۫ܽ") ^ i3) * 25;
                        i4 = ((iM55979 ^ i2) * (-7675)) ^ 29042200;
                        i5 = -350833765;
                    } else {
                        iM55979 = C0873.m55680("֡᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17521) ^ 813343903;
                        i5 = -1468766345;
                    }
                    break;
                case -1232480954:
                case -479021500:
                    c6395 = new C6395(8, this);
                    if (C0937.m55918() >= 0) {
                        iM55979 = C0946.m55979("֫᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29477)) ^ (-1231467261);
                        i5 = 71414;
                    } else {
                        iM55979 = C0946.m55979("۠ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23447)) ^ (-1917998212);
                        i5 = 2064886843;
                    }
                    break;
                case -1118782745:
                case -136682856:
                    C14976.m34315();
                    z = true;
                    if (bundle != null) {
                        iM55979 = (C0873.m55680("۠ۡ") ^ i2) * 31;
                        i4 = ((iM55979 ^ i3) * 15331) ^ (-2010073836);
                        i5 = 984949853;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩸᩸")) * (-117);
                        i4 = ((iM55979 ^ i3) * (-22847)) ^ 292128146;
                        i5 = 1364171633;
                    }
                    break;
                case -1084109800:
                case -230259253:
                    c7741M24117 = C10423.m24117(this, new InterfaceC21153() { // from class: l.ۡܺ᩷
                        @Override // p067l.InterfaceC21153
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6900(Intent intent, int i6) {
                            int i7 = 1143757815;
                            int i8 = RunnableC0871.f81839;
                            int i9 = C0845.f81821;
                            int iM55680 = C0873.m55680("᩺۟") ^ i8;
                            int i10 = ((iM55680 ^ i9) * (-20503)) ^ 1466496225;
                            int i11 = -1620657124;
                            while (true) {
                                i7 = ((((i7 ^ i9) * 28589) >> 31) & i10) ^ (iM55680 ^ i11);
                                switch (i7) {
                                    case -2067922159:
                                    case -1027602884:
                                        C0937.m55918();
                                        if (C0866.f81837 >= 0) {
                                            iM55680 = (C0873.m55680("ۖ᩸") + i8) * 25;
                                            i10 = ((iM55680 ^ i9) * 14905) ^ 1231325300;
                                            i11 = -2084449937;
                                        } else {
                                            iM55680 = (C0946.m55979("ۤ᩸") + i8) * (-11);
                                            i10 = ((iM55680 ^ i9) * (-30829)) ^ 1503242367;
                                            i11 = 1254180106;
                                        }
                                        break;
                                    case -1972179258:
                                    case 1455595232:
                                        AbstractC0942.m55971();
                                        if (C0906.m55809() > 0) {
                                            iM55680 = C0873.m55680("ۨ᩺") ^ i9;
                                            i10 = ((iM55680 ^ i8) * 26243) ^ 288784012;
                                            i11 = 500743624;
                                        } else {
                                            iM55680 = (C0946.m55979("ۤ᩸") + i8) * (-11);
                                            i10 = ((iM55680 ^ i9) * (-30829)) ^ 1503242367;
                                            i11 = 1254180106;
                                        }
                                        break;
                                    case -1743651429:
                                    case 713589002:
                                        if (C1024.f81946) {
                                            iM55680 = C0946.m55979("᩺۫") ^ i9;
                                            i10 = ((iM55680 ^ i8) * 16997) ^ (-1022168476);
                                            i11 = 372391867;
                                        } else {
                                            iM55680 = (i8 - C0873.m55680("ۨۤ")) * 5;
                                            i10 = ((iM55680 ^ i9) * 18315) ^ (-2142576005);
                                            i11 = -1235609240;
                                        }
                                        break;
                                    case -1650661971:
                                    case 1807505866:
                                        if (C0955.f81898) {
                                            iM55680 = (C0873.m55680("ܳܶ") ^ i9) * (-103);
                                            i10 = ((iM55680 ^ i8) * (-7385)) ^ 132841468;
                                            i11 = -578162183;
                                        } else {
                                            iM55680 = (i9 - C0946.m55979("֡۫")) * (-37);
                                            i10 = ((iM55680 ^ i8) * 9719) ^ (-2041735131);
                                            i11 = 1815908403;
                                        }
                                        break;
                                    case -1439344385:
                                    case -511881199:
                                        C0892.m55749();
                                        AbstractC0942.m55971();
                                        iM55680 = (C0946.m55979("ۤ᩸") + i8) * (-11);
                                        i10 = ((iM55680 ^ i9) * (-30829)) ^ 1503242367;
                                        i11 = 1254180106;
                                        break;
                                    case -1267891950:
                                    case 97834383:
                                        if (C0866.f81837 >= 0) {
                                            iM55680 = (C0873.m55680("ۖ᩸") + i8) * 25;
                                            i10 = ((iM55680 ^ i9) * 14905) ^ 1231325300;
                                            i11 = -2084449937;
                                        } else {
                                            iM55680 = C0873.m55680("ۜۤ") ^ i8;
                                            i10 = ((iM55680 ^ i9) * 20431) ^ 1270454206;
                                            i11 = -1640930366;
                                        }
                                        break;
                                    case -1212304361:
                                    case 904089168:
                                        if (C0866.f81837 >= 0) {
                                            iM55680 = C0873.m55680("ۨ᩺") ^ i9;
                                            i10 = ((iM55680 ^ i8) * 26243) ^ 288784012;
                                            i11 = 500743624;
                                        } else {
                                            iM55680 = C0946.m55979("᩹ܿ") ^ i9;
                                            i10 = ((iM55680 ^ i8) * 7999) ^ (-589850949);
                                            i11 = 351626426;
                                        }
                                        break;
                                    case -1050957858:
                                    case 111048726:
                                        if (C0947.m55997()) {
                                            iM55680 = (C0873.m55680("ܳܶ") ^ i9) * (-103);
                                            i10 = ((iM55680 ^ i8) * (-7385)) ^ 132841468;
                                            i11 = -578162183;
                                        } else {
                                            iM55680 = (C0946.m55979("֫ܰ") + i9) * (-13);
                                            i10 = ((iM55680 ^ i8) * (-10491)) ^ (-706979858);
                                            i11 = 1663719306;
                                        }
                                        break;
                                    case -522214943:
                                    case 268463176:
                                        if (C0894.f81854 >= 0) {
                                            iM55680 = (C0873.m55680("ܳܶ") ^ i9) * (-103);
                                            i10 = ((iM55680 ^ i8) * (-7385)) ^ 132841468;
                                            i11 = -578162183;
                                        } else {
                                            iM55680 = (i8 - C0946.m55979("᩺᩸")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i10 = ((iM55680 ^ i9) * (-28671)) ^ 1020534659;
                                            i11 = 227073875;
                                        }
                                        break;
                                    case -359392959:
                                    case 428360620:
                                        if (C0949.f81897 < 0) {
                                            iM55680 = (C0873.m55680("ܳܶ") ^ i9) * (-103);
                                            i10 = ((iM55680 ^ i8) * (-7385)) ^ 132841468;
                                            i11 = -578162183;
                                        } else {
                                            iM55680 = (C0946.m55979("ۤ᩸") + i8) * (-11);
                                            i10 = ((iM55680 ^ i9) * (-30829)) ^ 1503242367;
                                            i11 = 1254180106;
                                        }
                                        break;
                                    case -243326985:
                                    case 1064301969:
                                        if (C0992.f81922 >= 0) {
                                            iM55680 = (C0873.m55680("ܳܶ") ^ i9) * (-103);
                                            i10 = ((iM55680 ^ i8) * (-7385)) ^ 132841468;
                                            i11 = -578162183;
                                        } else {
                                            iM55680 = (C0873.m55680("֡ۢ") ^ i9) * 101;
                                            i10 = ((iM55680 ^ i8) * 9153) ^ 306331488;
                                            i11 = -1466987235;
                                        }
                                        break;
                                    case -146549643:
                                    case 1854495683:
                                        AbstractActivityC5549.m12245(this.f30258, i6);
                                        break;
                                    case 130697189:
                                    case 1184567823:
                                        if (C1028.f81950 <= 0) {
                                            iM55680 = C0946.m55979("᩺۫") ^ i9;
                                            i10 = ((iM55680 ^ i8) * 16997) ^ (-1022168476);
                                            i11 = 372391867;
                                        } else {
                                            iM55680 = C0873.m55680("ᩴܶ") ^ i9;
                                            i10 = ((iM55680 ^ i8) * 22935) ^ (-221472420);
                                            i11 = -1842381366;
                                        }
                                        break;
                                    case 135066063:
                                    case 1220439578:
                                        if (C0906.f81862 >= 0) {
                                            iM55680 = C0946.m55979("᩺۫") ^ i9;
                                            i10 = ((iM55680 ^ i8) * 16997) ^ (-1022168476);
                                            i11 = 372391867;
                                        } else {
                                            iM55680 = (i8 - C0946.m55979("ۙۘ")) * 37;
                                            i10 = ((iM55680 ^ i9) * 15091) ^ (-675161018);
                                            i11 = 720376090;
                                        }
                                        break;
                                    case 685832085:
                                    case 1047305558:
                                        C1044.m56286();
                                        break;
                                    default:
                                        if (C0912.f81867 <= 0) {
                                            iM55680 = (C0873.m55680("ۖ᩸") + i8) * 25;
                                            i10 = ((iM55680 ^ i9) * 14905) ^ 1231325300;
                                            i11 = -2084449937;
                                        } else {
                                            iM55680 = (C0946.m55979("᩺ᩳ") ^ i8) * 83;
                                            i10 = ((iM55680 ^ i9) * (-14795)) ^ 145771867;
                                            i11 = -724650701;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 5291) ^ 782305203;
                        i5 = -731336619;
                    } else {
                        iM55979 = C0873.m55680("ۤۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 23855) ^ (-2107444664);
                        i5 = 847741854;
                    }
                    break;
                case -979647275:
                case -527434853:
                    defaultDisplay.getRealSize(C13076.f36763);
                    C13076.f36762 = z;
                    iM55979 = (C0873.m55680("֡ܶ") ^ i3) * (-127);
                    i4 = ((iM55979 ^ i2) * 12313) ^ 1837977641;
                    i5 = -26103935;
                    break;
                case -539522583:
                case 49551445:
                    C0955.m56025();
                    C0989.m56095();
                    break;
                case -309360358:
                case 170401440:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("ۘ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 5291) ^ 782305203;
                        i5 = -731336619;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۛ᩺")) * (-63);
                        i4 = ((iM55979 ^ i2) * 30415) ^ 283097702;
                        i5 = 1923333161;
                    }
                    break;
                case -308259541:
                case 1593325457:
                    if (!C0890.m55740()) {
                        iM55979 = (C0873.m55680("۫ܽ") ^ i3) * 25;
                        i4 = ((iM55979 ^ i2) * (-7675)) ^ 29042200;
                        i5 = -350833765;
                    } else {
                        iM55979 = C0946.m55979("ܺۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-32335)) ^ 478453404;
                        i5 = 1195924805;
                    }
                    break;
                case -38103341:
                case 1726086803:
                    z2 = false;
                    iM55979 = (C0873.m55680("ۤۘ") ^ i3) * 75;
                    i4 = ((iM55979 ^ i2) * (-3173)) ^ 1296577548;
                    i5 = -1819804953;
                    break;
                case 24776523:
                case 1808175332:
                    z2 = true;
                    iM55979 = (C0873.m55680("ۤۘ") ^ i3) * 75;
                    i4 = ((iM55979 ^ i2) * (-3173)) ^ 1296577548;
                    i5 = -1819804953;
                    break;
                case 42611603:
                case 1851160744:
                    C0898.m55800();
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("֫᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29477)) ^ (-1231467261);
                        i5 = 71414;
                    } else {
                        iM55979 = C0946.m55979("ܺۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-32335)) ^ 478453404;
                        i5 = 1195924805;
                    }
                    break;
                case 230946635:
                case 1462480841:
                    this.f13402 = z2;
                    if (this.f13389) {
                        iM55979 = (C0946.m55979("ܿۙ") ^ i2) * (-75);
                        i4 = ((iM55979 ^ i3) * (-23213)) ^ (-639761311);
                        i5 = 1619069474;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩺᩺")) * 21;
                        i4 = ((iM55979 ^ i2) * (-12027)) ^ 240548380;
                        i5 = -142119559;
                    }
                    break;
                case 1053060854:
                case 1847286516:
                    defaultDisplay = getWindowManager().getDefaultDisplay();
                    point = C13076.f36764;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0946.m55979("֫᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29477)) ^ (-1231467261);
                        i5 = 71414;
                    } else {
                        iM55979 = C0946.m55979("᩶ۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-12999)) ^ (-431701898);
                        i5 = -1247470615;
                    }
                    break;
                case 1171596915:
                case 1181816558:
                    C15766.m35832(this);
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("ܺۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-32335)) ^ 478453404;
                        i5 = 1195924805;
                    } else {
                        iM55979 = (i2 - C0946.m55979("۬ۛ")) * 99;
                        i4 = ((iM55979 ^ i3) * (-16723)) ^ (-1265233661);
                        i5 = 1455934907;
                    }
                    break;
                case 1225174425:
                case 1848932282:
                    C0955.m56027(this);
                    iM55979 = (i3 - C0946.m55979("ۢᩳ")) * C0254q.f1218h;
                    i4 = ((iM55979 ^ i2) * (-20111)) ^ 541764741;
                    i5 = -1768306761;
                    break;
                case 1524981118:
                case 2003505836:
                    this.f13394 = C23223.m51768();
                    iM55979 = (i3 - C0946.m55979("᩺᩺")) * 21;
                    i4 = ((iM55979 ^ i2) * (-12027)) ^ 240548380;
                    i5 = -142119559;
                    break;
                default:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ܺۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * (-25071)) ^ (-223738335);
                        i5 = 1244108834;
                    } else {
                        RunnableC0897.m55782(c7350, this, new InterfaceC3326() { // from class: l.ۚܺ᩷
                            @Override // p067l.InterfaceC3326
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo4017(Object obj) {
                                C22314 c22314 = null;
                                int i6 = 1180031638;
                                int i7 = C0866.f81837;
                                int i8 = C0845.f81821;
                                int iM55680 = C0873.m55680("ۡ֫") ^ i7;
                                int i9 = ((iM55680 ^ i8) * 14983) ^ (-323820990);
                                int i10 = -1167187254;
                                while (true) {
                                    i6 = ((((i6 ^ i8) * (-13309)) >> 31) & i9) ^ (iM55680 ^ i10);
                                    switch (i6) {
                                        case -2146842469:
                                        case -1032049262:
                                            if (C0989.f81920 >= 0) {
                                                iM55680 = (C0946.m55979("ܳۢ") + i7) * (-35);
                                                i9 = ((iM55680 ^ i8) * (-9665)) ^ 1062299346;
                                                i10 = -1214361807;
                                            } else {
                                                iM55680 = (i7 - C0946.m55979("᩷ܺ")) * C0254q.f1218h;
                                                i9 = ((iM55680 ^ i8) * 21065) ^ (-503704908);
                                                i10 = -406170190;
                                            }
                                            break;
                                        case -2004613779:
                                        case -1706446278:
                                            break;
                                        case -1900603393:
                                        case -218264597:
                                            if (C0992.m56107() > 0) {
                                                iM55680 = (C0946.m55979("ۡ۫") ^ i7) * 91;
                                                i9 = ((iM55680 ^ i8) * (-18575)) ^ 96542099;
                                                i10 = 1112063104;
                                            } else {
                                                iM55680 = C0946.m55979("ۤ᩶") ^ i7;
                                                i9 = ((iM55680 ^ i8) * 27499) ^ (-1817926301);
                                                i10 = 554170003;
                                            }
                                            break;
                                        case -1862258865:
                                        case 1312635718:
                                            if (c22314.m50125()) {
                                                iM55680 = (C0946.m55979("۠ۤ") + i8) * 41;
                                                i9 = ((iM55680 ^ i7) * (-18453)) ^ 173523935;
                                                i10 = 1396149437;
                                            } else {
                                                iM55680 = (C0873.m55680("ۗܰ") ^ i7) * (-53);
                                                i9 = ((iM55680 ^ i8) * (-4087)) ^ 1502558730;
                                                i10 = 1160234899;
                                            }
                                            break;
                                        case -1534364431:
                                        case -1026001871:
                                            if (C1404.m56468()) {
                                                iM55680 = (C0873.m55680("ᩴܺ") + i8) * 51;
                                                i9 = ((iM55680 ^ i7) * 15973) ^ 1580332905;
                                                i10 = -713003912;
                                            } else {
                                                iM55680 = C0946.m55979("ۤ᩶") ^ i7;
                                                i9 = ((iM55680 ^ i8) * 27499) ^ (-1817926301);
                                                i10 = 554170003;
                                            }
                                            break;
                                        case -1507286787:
                                        case -393576502:
                                            C0946.m55980();
                                            iM55680 = C0946.m55979("ۤ᩶") ^ i7;
                                            i9 = ((iM55680 ^ i8) * 27499) ^ (-1817926301);
                                            i10 = 554170003;
                                            break;
                                        case -1324692465:
                                        case 1699589667:
                                            if (C1025.f81947 >= 0) {
                                                iM55680 = (C0946.m55979("ۡ۫") ^ i7) * 91;
                                                i9 = ((iM55680 ^ i8) * (-18575)) ^ 96542099;
                                                i10 = 1112063104;
                                            } else {
                                                iM55680 = (i7 - C0873.m55680("ۧ᩸")) * 25;
                                                i9 = ((iM55680 ^ i8) * (-7923)) ^ (-61089620);
                                                i10 = -1324589951;
                                            }
                                            break;
                                        case -1064911835:
                                        case 359052626:
                                            c22314 = (C22314) obj;
                                            int i11 = AbstractActivityC5549.f13384;
                                            if (c22314 != null) {
                                                iM55680 = C0873.m55680("֫ܿ") ^ i8;
                                                i9 = ((iM55680 ^ i7) * 4815) ^ (-389843187);
                                                i10 = 1839564016;
                                            } else {
                                                iM55680 = (C0873.m55680("ۗܰ") ^ i7) * (-53);
                                                i9 = ((iM55680 ^ i8) * (-4087)) ^ 1502558730;
                                                i10 = 1160234899;
                                            }
                                            break;
                                        case -1055565520:
                                        case -1005092511:
                                            if (C1964.f83032 <= 0) {
                                                iM55680 = (C0946.m55979("ۡ۫") ^ i7) * 91;
                                                i9 = ((iM55680 ^ i8) * (-18575)) ^ 96542099;
                                                i10 = 1112063104;
                                            } else {
                                                iM55680 = (C0873.m55680("᩺ۗ") ^ i8) * (-37);
                                                i9 = ((iM55680 ^ i7) * 22567) ^ (-705243784);
                                                i10 = 1153204770;
                                            }
                                            break;
                                        case -1011526378:
                                        case -912947525:
                                            C0882.m55710();
                                            if (C0898.f81858 <= 0) {
                                                iM55680 = (C0946.m55979("᩻֡") ^ i8) * 11;
                                                i9 = ((iM55680 ^ i7) * (-27905)) ^ (-710697213);
                                                i10 = 866765317;
                                            } else {
                                                iM55680 = (C0946.m55979("᩵֫") + i8) * (-51);
                                                i9 = ((iM55680 ^ i7) * 12927) ^ (-2101977978);
                                                i10 = 616674194;
                                            }
                                            break;
                                        case -191250466:
                                        case 555807244:
                                            if (ViewOnClickListenerC0939.f81888 <= 0) {
                                                iM55680 = C0946.m55979("ۤ᩶") ^ i7;
                                                i9 = ((iM55680 ^ i8) * 27499) ^ (-1817926301);
                                                i10 = 554170003;
                                            } else {
                                                iM55680 = C0873.m55680("ܳ۫") ^ i7;
                                                i9 = ((iM55680 ^ i8) * 15563) ^ (-633786704);
                                                i10 = 2074658026;
                                            }
                                            break;
                                        case -31174526:
                                        case 1142823295:
                                            C1012.m56134();
                                            break;
                                        case 334143507:
                                        case 1991935448:
                                            if (!C0912.m55833()) {
                                                iM55680 = (C0946.m55979("᩻֡") ^ i8) * 11;
                                                i9 = ((iM55680 ^ i7) * (-27905)) ^ (-710697213);
                                                i10 = 866765317;
                                            } else {
                                                iM55680 = C0946.m55979("ۤ᩶") ^ i7;
                                                i9 = ((iM55680 ^ i8) * 27499) ^ (-1817926301);
                                                i10 = 554170003;
                                            }
                                            break;
                                        case 631464218:
                                        case 1221843273:
                                            this.f19834.mo115(c22314);
                                            iM55680 = (C0873.m55680("ۗܰ") ^ i7) * (-53);
                                            i9 = ((iM55680 ^ i8) * (-4087)) ^ 1502558730;
                                            i10 = 1160234899;
                                            break;
                                        case 782466610:
                                        case 1901820497:
                                            if (RunnableC1014.f81941 <= 0) {
                                                iM55680 = C0946.m55979("ۤ᩶") ^ i7;
                                                i9 = ((iM55680 ^ i8) * 27499) ^ (-1817926301);
                                                i10 = 554170003;
                                            } else {
                                                iM55680 = (i8 - C0873.m55680("ۙܺ")) * (-117);
                                                i9 = ((iM55680 ^ i7) * 10553) ^ 2099486295;
                                                i10 = -1446175582;
                                            }
                                            break;
                                        case 847829471:
                                        case 1061216560:
                                            if (C0854.f81826 != 0) {
                                                iM55680 = (C0946.m55979("᩻֡") ^ i8) * 11;
                                                i9 = ((iM55680 ^ i7) * (-27905)) ^ (-710697213);
                                                i10 = 866765317;
                                            } else {
                                                iM55680 = (C0873.m55680("֡۠") + i7) * (-57);
                                                i9 = ((iM55680 ^ i8) * (-23113)) ^ (-173091354);
                                                i10 = -1912045079;
                                            }
                                            break;
                                        case 1042222029:
                                        case 2002907789:
                                            if (C0992.f81922 >= 0) {
                                                iM55680 = (C0946.m55979("ۡ۫") ^ i7) * 91;
                                                i9 = ((iM55680 ^ i8) * (-18575)) ^ 96542099;
                                                i10 = 1112063104;
                                            } else {
                                                iM55680 = C0946.m55979("ܿܺ") ^ i8;
                                                i9 = ((iM55680 ^ i7) * (-32629)) ^ (-1406257230);
                                                i10 = -1912700735;
                                            }
                                            break;
                                        case 1814759450:
                                        case 2069346243:
                                            if (C1124.f82007 >= 0) {
                                                iM55680 = (C0946.m55979("᩻֡") ^ i8) * 11;
                                                i9 = ((iM55680 ^ i7) * (-27905)) ^ (-710697213);
                                                i10 = 866765317;
                                            } else {
                                                iM55680 = (C0946.m55979("ۙ᩹") + i8) * (-67);
                                                i9 = ((iM55680 ^ i7) * (-27775)) ^ (-410982067);
                                                i10 = 564101167;
                                            }
                                            break;
                                        default:
                                            if (ViewOnClickListenerC0939.f81888 <= 0) {
                                                iM55680 = (C0946.m55979("᩻֡") ^ i8) * 11;
                                                i9 = ((iM55680 ^ i7) * (-27905)) ^ (-710697213);
                                                i10 = 866765317;
                                            } else {
                                                iM55680 = C0873.m55680("ܶ֡") ^ i7;
                                                i9 = ((iM55680 ^ i8) * 22609) ^ (-1057895405);
                                                i10 = -1472052827;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        if (C7050.m16236()) {
                            iM55979 = C0946.m55979("ۛۡ") ^ i2;
                            i4 = ((iM55979 ^ i3) * 379) ^ 1304720563;
                            i5 = -1218305798;
                        } else {
                            iM55979 = (i3 - C0946.m55979("ۢᩳ")) * C0254q.f1218h;
                            i4 = ((iM55979 ^ i2) * (-20111)) ^ 541764741;
                            i5 = -1768306761;
                        }
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f3 A[PHI: r7 r8 r9
      0x00f3: PHI (r7v4 short[]) = (r7v3 short[]), (r7v2 short[]) binds: [B:32:0x00f1, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:32:0x00f1, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:32:0x00f1, B:12:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0163 A[PHI: r3 r4 r5
      0x0163: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:40:0x0161, B:28:0x00d0, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:40:0x0161, B:28:0x00d0, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:40:0x0161, B:28:0x00d0, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0276 A[PHI: r6 r15 r17 r18 r19
      0x0276: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:67:0x0274, B:63:0x0255, B:44:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:67:0x0274, B:63:0x0255, B:44:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:67:0x0274, B:63:0x0255, B:44:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:67:0x0274, B:63:0x0255, B:44:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r19v4 short) = (r19v2 short), (r19v3 short), (r19v2 short) binds: [B:67:0x0274, B:63:0x0255, B:44:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02ab A[PHI: r1 r11 r12 r14 r16 r24
      0x02ab: PHI (r1v5 int) = (r1v2 int), (r1v2 int), (r1v3 int), (r1v2 int), (r1v2 int) binds: [B:71:0x02a9, B:59:0x0236, B:48:0x01ba, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:71:0x02a9, B:59:0x0236, B:48:0x01ba, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:71:0x02a9, B:59:0x0236, B:48:0x01ba, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r14v5 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:71:0x02a9, B:59:0x0236, B:48:0x01ba, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:71:0x02a9, B:59:0x0236, B:48:0x01ba, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02ab: PHI (r24v6 int) = (r24v3 int), (r24v4 int), (r24v3 int), (r24v3 int), (r24v3 int) binds: [B:71:0x02a9, B:59:0x0236, B:48:0x01ba, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02df  */
    /* JADX INFO: renamed from: ܽ */
    public final View m12277(int i) {
        int iM55680;
        int i2;
        int i3;
        int i4 = C0898.f81858;
        int i5 = RunnableC1014.f81941;
        int iM55681 = C0873.m55680("᩻֫") ^ i5;
        int i6 = ((iM55681 ^ i4) * 28241) ^ 142126441;
        View view = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM55681 ^ (-2084543276);
        int i8 = 0;
        int iM55682 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i16 = 1968692395;
        int i17 = 0;
        short[] sArr3 = null;
        String strM56373 = null;
        int i18 = 0;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i4) * (-32113)) >> 31));
            switch (i16) {
                case -2070848528:
                case -245363550:
                    super.setTitle(i);
                    return view;
                case -2043999377:
                case 1460185859:
                    C0892.m55749();
                    iM55680 = C0873.m55680("ۜ᩶") ^ i4;
                    i2 = ((iM55680 ^ i5) * 9827) ^ (-2146041554);
                    i3 = -962027387;
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -1887236022:
                case 1716422484:
                    return findViewById(i);
                case -1861831248:
                case -1289558760:
                    sArr3 = f81933;
                    if (AbstractC0942.m55971()) {
                        iM55680 = (C0946.m55979("ۙ֡") ^ i5) * 99;
                        i2 = ((iM55680 ^ i4) * 12005) ^ (-1991786299);
                        i3 = -620091906;
                    } else {
                        iM55680 = (C0946.m55979("ۧ۫") + i4) * 63;
                        i2 = ((iM55680 ^ i5) * 8647) ^ (-1822743932);
                        i3 = 551170904;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -1847328584:
                case 48579178:
                    i14 = 33389;
                    iM55680 = (C0873.m55680("ۚ۫") ^ i4) * 7;
                    i2 = ((iM55680 ^ i5) * (-21925)) ^ (-1782020612);
                    i3 = 1613743268;
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -1830203996:
                case 1659184183:
                    s = sArr3[c];
                    s2 = 20434;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ۖۤ")) * (-63);
                        i2 = ((iM55680 ^ i5) * 28551) ^ 733953260;
                        i3 = 329728132;
                    } else {
                        iM55680 = (C0873.m55680("ۘܽ") ^ i4) * (-27);
                        i2 = ((iM55680 ^ i5) * (-14079)) ^ (-765187677);
                        i3 = -1475099918;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -1309705421:
                case -963112196:
                    i17 = s * s2;
                    i12 = s * s;
                    i13 = 104387089;
                    if (RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("ۛ᩷") ^ i4;
                        i2 = ((iM55680 ^ i5) * (-15935)) ^ 1491615623;
                        i3 = 1403226715;
                    } else {
                        iM55680 = (C0946.m55979("ۙ֡") ^ i5) * 99;
                        i2 = ((iM55680 ^ i4) * 12005) ^ (-1991786299);
                        i3 = -620091906;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -1254378212:
                case -807012297:
                    strM56373 = C1124.m56373(sArr2, i10, i11, i14);
                    if (C1024.m56209() >= 0) {
                        iM55680 = C0873.m55680("ۜ᩷") ^ i5;
                        i2 = ((iM55680 ^ i4) * (-21289)) ^ 1235943442;
                        i3 = 1762305475;
                    } else {
                        iM55680 = C0873.m55680("ܳۚ") ^ i4;
                        i2 = ((iM55680 ^ i5) * 9281) ^ 565339347;
                        i3 = 1738134195;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -1230206158:
                case 561591499:
                    sArr2 = f81933;
                    i10 = 453;
                    i11 = 3;
                    if (C0946.f81894 != 0) {
                        iM55680 = C0946.m55979("ۘ֨") ^ i4;
                        i2 = ((iM55680 ^ i5) * 18081) ^ (-1229045063);
                        i3 = -1901079177;
                    } else {
                        iM55680 = (C0946.m55979("֨ۜ") + i5) * (-101);
                        i2 = ((iM55680 ^ i4) * 7333) ^ (-575813964);
                        i3 = -1846476788;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -1191818380:
                case 966899314:
                    i14 = 8859;
                    iM55680 = (C0873.m55680("ۚ۫") ^ i4) * 7;
                    i2 = ((iM55680 ^ i5) * (-21925)) ^ (-1782020612);
                    i3 = 1613743268;
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -1005115895:
                case 659159412:
                    setContentView(i);
                    return view;
                case -835958697:
                case 1360204644:
                    C1017.m56187();
                    return null;
                case -502821517:
                case -200233218:
                    C1012.m56134();
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("ۙ֡") ^ i5) * 99;
                        i2 = ((iM55680 ^ i4) * 12005) ^ (-1991786299);
                        i3 = -620091906;
                    } else {
                        iM55680 = C0873.m55680("ۜ᩷") ^ i5;
                        i2 = ((iM55680 ^ i4) * (-21289)) ^ 1235943442;
                        i3 = 1762305475;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -500591639:
                case 1929624837:
                    if (C0890.m55740()) {
                        iM55680 = C0873.m55680("ܰܰ") ^ i5;
                        i2 = ((iM55680 ^ i4) * (-24011)) ^ 2108049985;
                        i3 = -252928483;
                    } else {
                        iM55680 = C0873.m55680("ۜ᩶") ^ i4;
                        i2 = ((iM55680 ^ i5) * 9827) ^ (-2146041554);
                        i3 = -962027387;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -488847195:
                case 1500204835:
                    view = null;
                    if (i8 == (iM55682 ^ i18)) {
                        iM55680 = C0873.m55680("᩵۬") ^ i4;
                        i2 = ((iM55680 ^ i5) * (-1293)) ^ (-1662165941);
                        i3 = 802080171;
                    } else {
                        iM55680 = (C0873.m55680("۫᩷") ^ i5) * 43;
                        i2 = ((iM55680 ^ i4) * (-28445)) ^ 419186416;
                        i3 = 1394703648;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case -208310522:
                case 2008587877:
                    i15 = Ed448.PRECOMP_RANGE;
                    i9 = 3;
                    if (C1194.f82045 != 0) {
                        iM55680 = (i4 - C0946.m55979("ۖۤ")) * (-63);
                        i2 = ((iM55680 ^ i5) * 28551) ^ 733953260;
                        i3 = 329728132;
                    } else {
                        iM55680 = (C0946.m55979("֡᩺") + i5) * (-61);
                        i2 = ((iM55680 ^ i4) * 8821) ^ 1343991887;
                        i3 = -1186663721;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case 110097233:
                case 1367924919:
                    C0861.m55626();
                    if (C0863.f81833 > 0) {
                        iM55680 = C0873.m55680("ۜ᩶") ^ i4;
                        i2 = ((iM55680 ^ i5) * 9827) ^ (-2146041554);
                        i3 = -962027387;
                    } else {
                        iM55680 = C0946.m55979("ۘ֨") ^ i4;
                        i2 = ((iM55680 ^ i5) * 18081) ^ (-1229045063);
                        i3 = -1901079177;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case 228088653:
                case 1864184700:
                    if (i8 == (C0946.m55979(strM56373) ^ 2102277202)) {
                        iM55680 = (C0873.m55680("᩹᩹") + i5) * 7;
                        i2 = ((iM55680 ^ i4) * 20829) ^ 1865441397;
                        i3 = 1558365497;
                    } else {
                        iM55680 = (i5 - C0946.m55979("֡ۛ")) * (-59);
                        i2 = ((iM55680 ^ i4) * 28623) ^ 871534471;
                        i3 = 155378571;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case 328853669:
                case 1261376232:
                    iM55682 = C0873.m55680(C1071.m56336(sArr, i15, i9, i14));
                    i18 = 2097880017;
                    if (C0882.f81846) {
                        iM55680 = C0873.m55680("ۜ᩷") ^ i5;
                        i2 = ((iM55680 ^ i4) * (-21289)) ^ 1235943442;
                        i3 = 1762305475;
                    } else {
                        iM55680 = (C0946.m55979("ۡ۬") ^ i4) * 43;
                        i2 = ((iM55680 ^ i5) * (-24923)) ^ 1510550458;
                        i3 = 926654466;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case 599568391:
                case 946763020:
                    c = 449;
                    if (C0930.f81879 <= 0) {
                        iM55680 = (i4 - C0946.m55979("ۖۤ")) * (-63);
                        i2 = ((iM55680 ^ i5) * 28551) ^ 733953260;
                        i3 = 329728132;
                    } else {
                        iM55680 = C0873.m55680("ᩳۢ") ^ i5;
                        i2 = ((iM55680 ^ i4) * 24513) ^ (-1203900487);
                        i3 = 51172181;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case 1529308015:
                case 1657318577:
                    if (i17 - (i12 + i13) <= 0) {
                        iM55680 = (C0873.m55680("ᩴ᩶") ^ i5) * 25;
                        i2 = ((iM55680 ^ i4) * (-31059)) ^ (-1039605963);
                        i3 = 926647523;
                    } else {
                        iM55680 = C0873.m55680("ܶۙ") ^ i5;
                        i2 = ((iM55680 ^ i4) * 19555) ^ (-374502272);
                        i3 = -267506826;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                case 1536019595:
                case 1807859777:
                    i8 = i & (-65536);
                    sArr = f81933;
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0946.m55979("ۙ֡") ^ i5) * 99;
                        i2 = ((iM55680 ^ i4) * 12005) ^ (-1991786299);
                        i3 = -620091906;
                    } else {
                        iM55680 = (C0873.m55680("᩺۠") ^ i4) * (-15);
                        i2 = ((iM55680 ^ i5) * (-24117)) ^ 27129762;
                        i3 = -139727893;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
                default:
                    C0877.m55696();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55680 = C0873.m55680("ۜ᩶") ^ i4;
                        i2 = ((iM55680 ^ i5) * 9827) ^ (-2146041554);
                        i3 = -962027387;
                    } else {
                        iM55680 = (C0946.m55979("ۙ֡") ^ i5) * 99;
                        i2 = ((iM55680 ^ i4) * 12005) ^ (-1991786299);
                        i3 = -620091906;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12254(int i, String str, boolean z) {
        int i2 = 1903973894;
        int i3 = C1044.f81959;
        int i4 = C0912.f81867;
        int iM55680 = C0873.m55680("ܽۨ") ^ i4;
        int i5 = ((iM55680 ^ i3) * 13823) ^ 107450766;
        int i6 = 639039696;
        while (true) {
            i2 = ((((i2 ^ i3) * (-6361)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -1944798910:
                case -1554418596:
                    if (C0894.m55769() >= 0) {
                        iM55680 = (C0946.m55979("ۧۛ") ^ i4) * (-91);
                        i5 = ((iM55680 ^ i3) * (-3407)) ^ 450964052;
                        i6 = 1886888856;
                    } else {
                        iM55680 = C0946.m55979("֨֡") ^ i4;
                        i5 = ((iM55680 ^ i3) * 5437) ^ (-1847694754);
                        i6 = -1267860283;
                    }
                    break;
                case -1755787304:
                case 1024811924:
                    C0845.m55584();
                    ServiceConnectionC1013.m56157();
                    break;
                case -1495171996:
                case -17201457:
                    C1194.m56396();
                    if (!C0967.m56074()) {
                        iM55680 = C0873.m55680("ۛۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24601) ^ (-422138891);
                        i6 = -656348761;
                    } else {
                        iM55680 = C0873.m55680("ܳۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 869) ^ (-135041789);
                        i6 = -213826341;
                    }
                    break;
                case -1336600200:
                case 1708966927:
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("ۛۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24601) ^ (-422138891);
                        i6 = -656348761;
                    } else {
                        iM55680 = C0873.m55680("ܳ᩹") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-10095)) ^ (-1301538156);
                        i6 = 721591330;
                    }
                    break;
                case -1333036709:
                case 1152619232:
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0873.m55680("ۛۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24601) ^ (-422138891);
                        i6 = -656348761;
                    } else {
                        iM55680 = C0873.m55680("᩺ۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-11569)) ^ (-1034714264);
                        i6 = 1573010500;
                    }
                    break;
                case -1242516594:
                case 1698577844:
                    if (C1024.f81946) {
                        iM55680 = C0873.m55680("ۛۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 24601) ^ (-422138891);
                        i6 = -656348761;
                    } else {
                        iM55680 = (C0946.m55979("۬ۖ") + i4) * 81;
                        i5 = ((iM55680 ^ i3) * (-9247)) ^ 1331301729;
                        i6 = 1358099913;
                    }
                    break;
                case -1113139428:
                case -477732620:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0946.m55979("ۧۛ") ^ i4) * (-91);
                        i5 = ((iM55680 ^ i3) * (-3407)) ^ 450964052;
                        i6 = 1886888856;
                    } else {
                        iM55680 = (C0873.m55680("ܶ۬") ^ i3) * (-101);
                        i5 = ((iM55680 ^ i4) * (-12251)) ^ 1994975097;
                        i6 = -803421519;
                    }
                    break;
                case -711322058:
                case 596890020:
                    C0890.m55740();
                    C1036.m56257();
                    iM55680 = (C0946.m55979("ۧۛ") ^ i4) * (-91);
                    i5 = ((iM55680 ^ i3) * (-3407)) ^ 450964052;
                    i6 = 1886888856;
                    break;
                case -475297045:
                case 590139732:
                    if (C1964.m56597() != 0) {
                        iM55680 = C0873.m55680("ܳۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 869) ^ (-135041789);
                        i6 = -213826341;
                    } else {
                        iM55680 = C0946.m55979("۬ۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 13027) ^ (-750672448);
                        i6 = 1155351522;
                    }
                    break;
                case -235411978:
                case 1354441497:
                    if (C1194.m56396() > 0) {
                        iM55680 = C0873.m55680("᩺ۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-11569)) ^ (-1034714264);
                        i6 = 1573010500;
                    } else {
                        iM55680 = (C0946.m55979("ۧۛ") ^ i4) * (-91);
                        i5 = ((iM55680 ^ i3) * (-3407)) ^ 450964052;
                        i6 = 1886888856;
                    }
                    break;
                case -140012632:
                case 392819671:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0946.m55979("ۧۛ") ^ i4) * (-91);
                        i5 = ((iM55680 ^ i3) * (-3407)) ^ 450964052;
                        i6 = 1886888856;
                    } else {
                        iM55680 = C0946.m55979("᩵ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 1521) ^ (-1711166848);
                        i6 = 1820468212;
                    }
                    break;
                case -99665687:
                case 755850203:
                    runOnUiThread(new RunnableC11585(this, C0845.m55590(this, i), str, z));
                    break;
                case 118965528:
                case 209373182:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("᩺ۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-11569)) ^ (-1034714264);
                        i6 = 1573010500;
                    } else {
                        iM55680 = C0873.m55680("ܽۗ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 8247) ^ 823200352;
                        i6 = -312095914;
                    }
                    break;
                case 596082071:
                case 1796857904:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (i4 - C0873.m55680("ۚܳ")) * 61;
                        i5 = ((iM55680 ^ i3) * 17823) ^ 1205029090;
                        i6 = -2118090069;
                    } else {
                        iM55680 = C0946.m55979("۠᩸") ^ i3;
                        i5 = ((iM55680 ^ i4) * 17319) ^ 529812094;
                        i6 = -1521048165;
                    }
                    break;
                case 793494277:
                case 826326300:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("ܳۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 869) ^ (-135041789);
                        i6 = -213826341;
                    } else {
                        iM55680 = C0946.m55979("ۖܰ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-2671)) ^ (-869861072);
                        i6 = 788922015;
                    }
                    break;
                default:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (i4 - C0873.m55680("ۚܳ")) * 61;
                        i5 = ((iM55680 ^ i3) * 17823) ^ 1205029090;
                        i6 = -2118090069;
                    } else {
                        iM55680 = C0946.m55979("ۜ֨") ^ i4;
                        i5 = ((iM55680 ^ i3) * 4859) ^ (-1803941912);
                        i6 = -26421564;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Exception e = null;
        int i = 1734067063;
        int i2 = C0906.f81862;
        int i3 = C0967.f81910;
        int iM55680 = C0873.m55680("ۡۡ") ^ i2;
        int i4 = ((iM55680 ^ i3) * 20531) ^ 1964270157;
        int i5 = 622914895;
        while (true) {
            i = ((((i ^ i3) * (-9583)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2096502325:
                case -463321357:
                    C0927.m55873();
                    C0894.m55769();
                    break;
                case -2089581256:
                case 1008286427:
                    if (C0890.f81849 != 0) {
                        iM55680 = C0946.m55979("᩵ᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27219)) ^ (-273057672);
                        i5 = 1681722374;
                    } else {
                        iM55680 = (C0873.m55680("᩸ܶ") ^ i3) * (-31);
                        i4 = ((iM55680 ^ i2) * (-5003)) ^ 139881979;
                        i5 = -476581301;
                    }
                    break;
                case -2049275628:
                case -1417578866:
                    if (C1404.f82149 >= 0) {
                        iM55680 = (i3 - C0946.m55979("᩵۟")) * (-7);
                        i4 = ((iM55680 ^ i2) * (-24943)) ^ 72745510;
                        i5 = -968507315;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۜۨ")) * 25;
                        i4 = ((iM55680 ^ i3) * 7367) ^ 2117360663;
                        i5 = -1904094789;
                    }
                    break;
                case -1977055420:
                case -1105269276:
                    if (C0946.f81894 != 0) {
                        iM55680 = (i3 - C0946.m55979("᩵۟")) * (-7);
                        i4 = ((iM55680 ^ i2) * (-24943)) ^ 72745510;
                        i5 = -968507315;
                    } else {
                        iM55680 = C0946.m55979("ܽۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2727) ^ 1623588867;
                        i5 = 1334314583;
                    }
                    break;
                case -1889357316:
                case -677176743:
                    C1003.m56123();
                    C1048.m56305();
                    iM55680 = C0946.m55979("֨֨") ^ i3;
                    i4 = ((iM55680 ^ i2) * 4015) ^ 1432364009;
                    i5 = 1875262375;
                    break;
                case -1776764985:
                case -666352709:
                    if (C0854.f81826 != 0) {
                        iM55680 = (i3 - C0946.m55979("᩵۟")) * (-7);
                        i4 = ((iM55680 ^ i2) * (-24943)) ^ 72745510;
                        i5 = -968507315;
                    } else {
                        iM55680 = C0946.m55979("᩵ᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27219)) ^ (-273057672);
                        i5 = 1681722374;
                    }
                    break;
                case -1723496388:
                case -126502098:
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("ۛᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26399) ^ (-1856297691);
                        i5 = 498897259;
                    } else {
                        iM55680 = C0873.m55680("֡۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9431)) ^ 38985171;
                        i5 = -192878628;
                    }
                    break;
                case -1377546017:
                case 1152309917:
                    try {
                        super.onRestoreInstanceState(bundle);
                        iM55680 = (i2 - C0946.m55979("ܿۛ")) * (-53);
                        i4 = ((iM55680 ^ i3) * 19789) ^ (-101551180);
                        i5 = -708721949;
                    } catch (Exception e2) {
                        e = e2;
                        iM55680 = (C0873.m55680("۠᩺") ^ i3) * (-11);
                        i4 = ((iM55680 ^ i2) * 2457) ^ (-1314893117);
                        i5 = 179668762;
                    }
                    break;
                case -1267043898:
                case -885590861:
                    if (C0946.f81894 == 0) {
                        iM55680 = (C0873.m55680("۠ۚ") + i2) * (-63);
                        i4 = ((iM55680 ^ i3) * 24299) ^ 1805470686;
                        i5 = 990253756;
                    } else {
                        iM55680 = C0946.m55979("֨֨") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4015) ^ 1432364009;
                        i5 = 1875262375;
                    }
                    break;
                case -1003738809:
                case 243165753:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("ۛᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26399) ^ (-1856297691);
                        i5 = 498897259;
                    } else {
                        iM55680 = C0946.m55979("ۖۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17091) ^ (-828546305);
                        i5 = -1827580357;
                    }
                    break;
                case -958337826:
                case 626331554:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("ۛᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26399) ^ (-1856297691);
                        i5 = 498897259;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩹") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-24597)) ^ (-1548881551);
                        i5 = 49028946;
                    }
                    break;
                case -829812753:
                case -180452127:
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0873.m55680("ۛᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26399) ^ (-1856297691);
                        i5 = 498897259;
                    } else {
                        iM55680 = (C0873.m55680("᩸ܿ") + i2) * (-27);
                        i4 = ((iM55680 ^ i3) * (-67)) ^ 1562240364;
                        i5 = 208138862;
                    }
                    break;
                case -388963657:
                case -70276880:
                    if (C0894.f81854 < 0) {
                        iM55680 = C0946.m55979("᩵ᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27219)) ^ (-273057672);
                        i5 = 1681722374;
                    } else {
                        iM55680 = (C0873.m55680("۠ۚ") + i2) * (-63);
                        i4 = ((iM55680 ^ i3) * 24299) ^ 1805470686;
                        i5 = 990253756;
                    }
                    break;
                case -346398823:
                case 1808436489:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0873.m55680("ۛᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26399) ^ (-1856297691);
                        i5 = 498897259;
                    } else {
                        iM55680 = (i3 - C0873.m55680("֫ۜ")) * (-25);
                        i4 = ((iM55680 ^ i2) * (-19723)) ^ (-1825682934);
                        i5 = 2041531479;
                    }
                    break;
                case -179843780:
                case 2084210490:
                    ServiceConnectionC1013.m56155(this, e, null);
                    break;
                case 379844390:
                case 1364157711:
                    break;
                case 1978649807:
                case 2136641314:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("᩵ᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27219)) ^ (-273057672);
                        i5 = 1681722374;
                    } else {
                        iM55680 = (C0946.m55979("ۢۜ") + i3) * (-31);
                        i4 = ((iM55680 ^ i2) * 1295) ^ 1162473723;
                        i5 = 2101059527;
                    }
                    break;
                default:
                    if (C0861.f81831) {
                        iM55680 = (i2 - C0946.m55979("ۘۨ")) * 75;
                        i4 = ((iM55680 ^ i3) * 18509) ^ 2061613876;
                        i5 = 941080523;
                    } else {
                        iM55680 = (C0873.m55680("۠ۚ") + i2) * (-63);
                        i4 = ((iM55680 ^ i3) * 24299) ^ 1805470686;
                        i5 = 990253756;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0258 A[PHI: r14 r18 r19 r20 r21
      0x0258: PHI (r14v3 char) = (r14v1 char), (r14v1 char), (r14v2 char), (r14v1 char), (r14v1 char) binds: [B:58:0x0256, B:51:0x0212, B:27:0x00ed, B:24:0x00c6, B:22:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r18v30 int) = (r18v15 int), (r18v17 int), (r18v28 int), (r18v29 int), (r18v31 int) binds: [B:58:0x0256, B:51:0x0212, B:27:0x00ed, B:24:0x00c6, B:22:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r19v4 int) = (r19v2 int), (r19v1 int), (r19v1 int), (r19v1 int), (r19v1 int) binds: [B:58:0x0256, B:51:0x0212, B:27:0x00ed, B:24:0x00c6, B:22:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r20v26 char) = (r20v12 char), (r20v13 char), (r20v24 char), (r20v25 char), (r20v27 char) binds: [B:58:0x0256, B:51:0x0212, B:27:0x00ed, B:24:0x00c6, B:22:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r21v24 char) = (r21v10 char), (r21v11 char), (r21v22 char), (r21v23 char), (r21v25 char) binds: [B:58:0x0256, B:51:0x0212, B:27:0x00ed, B:24:0x00c6, B:22:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0319 A[PHI: r18 r20 r21
      0x0319: PHI (r18v35 int) = (r18v10 int), (r18v13 int), (r18v36 int) binds: [B:77:0x0317, B:65:0x02af, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r20v31 char) = (r20v7 char), (r20v10 char), (r20v32 char) binds: [B:77:0x0317, B:65:0x02af, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r21v29 char) = (r21v5 char), (r21v8 char), (r21v30 char) binds: [B:77:0x0317, B:65:0x02af, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0371 A[PHI: r18 r20 r21
      0x0371: PHI (r18v34 int) = (r18v8 int), (r18v9 int), (r18v37 int) binds: [B:85:0x036f, B:81:0x034d, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0371: PHI (r20v30 char) = (r20v5 char), (r20v6 char), (r20v33 char) binds: [B:85:0x036f, B:81:0x034d, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0371: PHI (r21v28 char) = (r21v3 char), (r21v4 char), (r21v31 char) binds: [B:85:0x036f, B:81:0x034d, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x03c6 A[PHI: r18 r20 r21
      0x03c6: PHI (r18v44 int) = (r18v6 int), (r18v12 int), (r18v32 int), (r18v39 int), (r18v48 int) binds: [B:93:0x03c4, B:69:0x02d3, B:19:0x0096, B:6:0x0044, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x03c6: PHI (r20v42 char) = (r20v3 char), (r20v9 char), (r20v28 char), (r20v35 char), (r20v44 char) binds: [B:93:0x03c4, B:69:0x02d3, B:19:0x0096, B:6:0x0044, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x03c6: PHI (r21v35 char) = (r21v1 char), (r21v7 char), (r21v26 char), (r21v33 char), (r21v36 char) binds: [B:93:0x03c4, B:69:0x02d3, B:19:0x0096, B:6:0x0044, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x03fa A[PHI: r18 r20 r21
      0x03fa: PHI (r18v38 int) = (r18v5 int), (r18v7 int), (r18v11 int), (r18v33 int), (r18v39 int) binds: [B:97:0x03f8, B:89:0x03a3, B:73:0x02f4, B:14:0x0065, B:6:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r20v34 char) = (r20v2 char), (r20v4 char), (r20v8 char), (r20v29 char), (r20v35 char) binds: [B:97:0x03f8, B:89:0x03a3, B:73:0x02f4, B:14:0x0065, B:6:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x03fa: PHI (r21v32 char) = (r21v0 char), (r21v2 char), (r21v6 char), (r21v27 char), (r21v33 char) binds: [B:97:0x03f8, B:89:0x03a3, B:73:0x02f4, B:14:0x0065, B:6:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m12244(View view, View view2, int[] iArr, int[] iArr2, C1388 c1388, int i, boolean z) {
        int iM55680;
        int i2;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int i6;
        char c = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        char c2 = 0;
        int i10 = 0;
        int i11 = 0;
        char c3 = 0;
        int i12 = 0;
        int i13 = 0;
        char c4 = 0;
        int i14 = 1828581991;
        int i15 = ViewOnClickListenerC0939.f81888;
        int i16 = C1028.f81950;
        int iM55979 = C0946.m55979("ۙۙ") ^ i16;
        int i17 = ((iM55979 ^ i15) * 16589) ^ (-559569658);
        int i18 = iM55979 ^ 458694021;
        int i19 = 0;
        while (true) {
            int i20 = i18 ^ (i17 & (((i14 ^ i15) * (-28385)) >> 31));
            switch (i20) {
                case -2128618019:
                case 1957975295:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = C0873.m55680("᩶ᩳ") ^ i15;
                        i2 = ((iM55680 ^ i16) * (-6767)) ^ 1128862212;
                        i3 = 624943123;
                    } else {
                        iM55680 = (C0873.m55680("ۙ۫") + i15) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i2 = ((iM55680 ^ i16) * (-5193)) ^ (-1240397988);
                        i3 = -146553552;
                    }
                    int i21 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i21;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -2122381558:
                case 650155281:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    c = 0;
                    if (view2 == null) {
                        i10 = i19;
                        iM55680 = C0873.m55680("᩻ۡ") ^ i15;
                        i2 = ((iM55680 ^ i16) * 7383) ^ 1470004400;
                        i3 = -1318702605;
                    } else {
                        iM55680 = C0946.m55979("۫᩵") ^ i15;
                        i2 = ((iM55680 ^ i16) * (-10561)) ^ (-2043604383);
                        i3 = -2135697760;
                    }
                    int i22 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i22;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -2103195299:
                case -1639287135:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ܶ۬") ^ i16;
                        i2 = ((iM55680 ^ i15) * 32623) ^ 1835330800;
                        i3 = -2081826143;
                    } else {
                        iM55680 = C0946.m55979("ܳۡ") ^ i15;
                        i2 = ((iM55680 ^ i16) * 16507) ^ (-514869778);
                        i3 = 237162093;
                    }
                    int i23 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i23;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -2081554483:
                case 1392144313:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C0882.m55710() != 0) {
                        iM55680 = C0873.m55680("ۗ᩺") ^ i15;
                        i2 = ((iM55680 ^ i16) * 26335) ^ 338227918;
                        i3 = -1803860855;
                    } else {
                        iM55680 = C0946.m55979("ۗ᩹") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-23797)) ^ (-624321689);
                        i3 = 565236500;
                    }
                    int i24 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i24;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1989984463:
                case -1494341743:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (iArr2 != null) {
                        iM55680 = C0873.m55680("֫ۧ") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-4719)) ^ 1460672248;
                        i3 = -1711777854;
                    } else {
                        iM55680 = (C0946.m55979("۬᩻") ^ i16) * 33;
                        i2 = ((iM55680 ^ i15) * 29879) ^ (-1672548611);
                        i3 = -1917985117;
                    }
                    int i25 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i25;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1870279593:
                case -1143858901:
                    i13 = 0;
                    iM55680 = (C0873.m55680("ᩴᩴ") + i15) * 15;
                    i2 = ((iM55680 ^ i16) * 6539) ^ 1224390716;
                    i3 = -1080520680;
                    int i26 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i26;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1853815938:
                case -448352766:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    i7 = iArr[c];
                    if (z) {
                        iM55680 = C0873.m55680("ۚ֡") ^ i16;
                        i2 = ((iM55680 ^ i15) * 28197) ^ 71535952;
                        i3 = -1318243297;
                    } else {
                        iM55680 = C0946.m55979("᩺ᩴ") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-18239)) ^ 1011901563;
                        i3 = -76524818;
                    }
                    int i27 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i27;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1713282910:
                case -1649781455:
                    i8 = 0;
                    iM55680 = C0946.m55979("ܽ۬") ^ i15;
                    i2 = ((iM55680 ^ i16) * 31045) ^ 2059262333;
                    i3 = -1075292055;
                    int i28 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i28;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1498576857:
                case -1186602385:
                    C1025.m56230();
                    C0930.m55885();
                    break;
                case -1448078798:
                case 1850939246:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("᩶ᩳ") ^ i15;
                        i2 = ((iM55680 ^ i16) * (-6767)) ^ 1128862212;
                        i3 = 624943123;
                    } else {
                        iM55680 = C0946.m55979("ᩳۚ") ^ i16;
                        i2 = ((iM55680 ^ i15) * 24919) ^ (-518682897);
                        i3 = -1200180960;
                    }
                    int i29 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i29;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1386721836:
                case -728726915:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    i10 = 0;
                    iM55680 = C0873.m55680("᩻ۡ") ^ i15;
                    i2 = ((iM55680 ^ i16) * 7383) ^ 1470004400;
                    i3 = -1318702605;
                    int i210 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i210;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1377476130:
                case -449809358:
                    if (C1194.m56396() <= 0) {
                        c2 = c2;
                        c3 = c3;
                        i20 = i20;
                        iM55680 = C0873.m55680("ۨܶ") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-19533)) ^ (-503077686);
                        i3 = 1539389175;
                        int i211 = iM55680 ^ i3;
                        i14 = i20;
                        c3 = c3;
                        i18 = i211;
                        i17 = i2;
                        c2 = c2;
                    }
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    iM55680 = C0873.m55680("᩶ᩳ") ^ i15;
                    i2 = ((iM55680 ^ i16) * (-6767)) ^ 1128862212;
                    i3 = 624943123;
                    int i212 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i212;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1189784766:
                case 1897859737:
                    C0927.m55873();
                    if (C0873.f81841 > 0) {
                        iM55681 = (C0873.m55680("ۤ֡") ^ i15) * (-17);
                        i4 = i20;
                        i5 = ((iM55681 ^ i16) * (-15677)) ^ 460662271;
                        i6 = 31212871;
                        int i30 = i4;
                        i18 = iM55681 ^ i6;
                        i17 = i5;
                        i14 = i30;
                    } else {
                        c2 = c2;
                        c3 = c3;
                        i20 = i20;
                        iM55680 = (C0946.m55979("֨ۨ") + i15) * 61;
                        i2 = ((iM55680 ^ i16) * (-29967)) ^ 661122710;
                        i3 = -1442576772;
                        int i213 = iM55680 ^ i3;
                        i14 = i20;
                        c3 = c3;
                        i18 = i213;
                        i17 = i2;
                        c2 = c2;
                    }
                    break;
                case -1155546238:
                case 1025024860:
                    i20 = i20;
                    C0898.m55800();
                    C0863.m55643();
                    c2 = c2;
                    c3 = c3;
                    iM55680 = (C0946.m55979("֨ۨ") + i15) * 61;
                    i2 = ((iM55680 ^ i16) * (-29967)) ^ 661122710;
                    i3 = -1442576772;
                    int i214 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i214;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1147924978:
                case 1510050900:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C0894.m55769() >= 0) {
                        iM55680 = C0946.m55979("ܶ۬") ^ i16;
                        i2 = ((iM55680 ^ i15) * 32623) ^ 1835330800;
                        i3 = -2081826143;
                    } else {
                        iM55680 = (i15 - C0946.m55979("ۤۢ")) * 85;
                        i2 = ((iM55680 ^ i16) * (-26719)) ^ (-1332240172);
                        i3 = -2116073725;
                    }
                    int i215 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i215;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1069029532:
                case 1198093683:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    int i31 = c1388.f36105;
                    if (view != null) {
                        int iM55682 = (C0873.m55680("ۤ۟") ^ i15) * 25;
                        i19 = i31;
                        i17 = ((iM55682 ^ i16) * 11035) ^ 17451962;
                        i14 = i20;
                        c3 = c3;
                        i18 = iM55682 ^ 1041442476;
                    } else {
                        i19 = i31;
                        iM55680 = (C0946.m55979("۬᩻") ^ i16) * 33;
                        i2 = ((iM55680 ^ i15) * 29879) ^ (-1672548611);
                        i3 = -1917985117;
                        int i216 = iM55680 ^ i3;
                        i14 = i20;
                        c3 = c3;
                        i18 = i216;
                        i17 = i2;
                    }
                    c2 = c2;
                    break;
                case -1067971011:
                case -792414596:
                    C1036.m56257();
                    if (C1124.f82007 < 0) {
                        c2 = c2;
                        c3 = c3;
                        i20 = i20;
                        iM55680 = C0946.m55979("ܶ۬") ^ i16;
                        i2 = ((iM55680 ^ i15) * 32623) ^ 1835330800;
                        i3 = -2081826143;
                        int i217 = iM55680 ^ i3;
                        i14 = i20;
                        c3 = c3;
                        i18 = i217;
                        i17 = i2;
                        c2 = c2;
                    }
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    iM55680 = C0873.m55680("᩶ᩳ") ^ i15;
                    i2 = ((iM55680 ^ i16) * (-6767)) ^ 1128862212;
                    i3 = 624943123;
                    int i218 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i218;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1027804210:
                case -559103230:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("ۨܶ") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-19533)) ^ (-503077686);
                        i3 = 1539389175;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ۠") ^ i16) * C0254q.f1218h;
                        i2 = ((iM55680 ^ i15) * (-835)) ^ (-873450321);
                        i3 = -181594266;
                    }
                    int i219 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i219;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -1016043636:
                case 2106494528:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("ۨܶ") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-19533)) ^ (-503077686);
                        i3 = 1539389175;
                    } else {
                        iM55680 = C0873.m55680("᩷ۢ") ^ i15;
                        i2 = ((iM55680 ^ i16) * (-5665)) ^ (-950167796);
                        i3 = 1575288276;
                    }
                    int i2110 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2110;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -864769422:
                case -784645955:
                    i13 = c1388.f36104;
                    iM55680 = (C0873.m55680("ᩴᩴ") + i15) * 15;
                    i2 = ((iM55680 ^ i16) * 6539) ^ 1224390716;
                    i3 = -1080520680;
                    int i2111 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2111;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -846943506:
                case -354238:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C0854.m55595() >= 0) {
                        iM55680 = (C0946.m55979("֨ۨ") + i15) * 61;
                        i2 = ((iM55680 ^ i16) * (-29967)) ^ 661122710;
                        i3 = -1442576772;
                    } else {
                        iM55680 = C0946.m55979("۬ۛ") ^ i15;
                        i2 = ((iM55680 ^ i16) * (-3253)) ^ (-814845827);
                        i3 = 546778535;
                    }
                    int i2112 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2112;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -809686647:
                case 1940540111:
                    break;
                case -676026627:
                case 843995492:
                    i8 = c1388.f36103;
                    iM55680 = C0946.m55979("ܽ۬") ^ i15;
                    i2 = ((iM55680 ^ i16) * 31045) ^ 2059262333;
                    i3 = -1075292055;
                    int i2113 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2113;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -483859603:
                case -14571077:
                    i20 = i20;
                    c2 = c2;
                    c3 = c3;
                    view2.setPadding(iArr2[c], iArr2[c2] + i19, iArr2[c3], iArr2[c4]);
                    iM55680 = (C0946.m55979("۬᩻") ^ i16) * 33;
                    i2 = ((iM55680 ^ i15) * 29879) ^ (-1672548611);
                    i3 = -1917985117;
                    int i2114 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2114;
                    i17 = i2;
                    c2 = c2;
                    break;
                case -339010799:
                case 2106889277:
                    i4 = i20;
                    i9 = i7 + i8;
                    c2 = 1;
                    i11 = iArr[1] + i10;
                    c3 = 2;
                    i12 = iArr[2];
                    if (z) {
                        iM55681 = (i15 - C0873.m55680("ۘۚ")) * (-9);
                        i5 = ((iM55681 ^ i16) * 18803) ^ (-1289013106);
                        i6 = -1324026872;
                    } else {
                        iM55681 = C0873.m55680("ۜ᩹") ^ i16;
                        i5 = ((iM55681 ^ i15) * 12731) ^ 169119226;
                        i6 = -1209866427;
                    }
                    int i32 = i4;
                    i18 = iM55681 ^ i6;
                    i17 = i5;
                    i14 = i32;
                    break;
                case 157653440:
                case 609012745:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (iArr == null) {
                        iM55680 = (C0946.m55979("۬᩻") ^ i16) * 33;
                        i2 = ((iM55680 ^ i15) * 29879) ^ (-1672548611);
                        i3 = -1917985117;
                    } else {
                        iM55680 = C0873.m55680("۟ܶ") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-1023)) ^ (-309784834);
                        i3 = -408513576;
                    }
                    int i2115 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2115;
                    i17 = i2;
                    c2 = c2;
                    break;
                case 163865256:
                case 1004403427:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C0917.f81868) {
                        iM55680 = (C0946.m55979("֨ۨ") + i15) * 61;
                        i2 = ((iM55680 ^ i16) * (-29967)) ^ 661122710;
                        i3 = -1442576772;
                    } else {
                        iM55680 = C0873.m55680("ۨ۠") ^ i16;
                        i2 = ((iM55680 ^ i15) * 8999) ^ (-754958710);
                        i3 = 269864485;
                    }
                    int i2116 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2116;
                    i17 = i2;
                    c2 = c2;
                    break;
                case 1138421097:
                case 1372629153:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    c4 = 3;
                    view.setPadding(i9, i11, i12 + i13, iArr[3] + i);
                    if (view2 != null) {
                        iM55680 = (C0946.m55979("ۜۚ") + i16) * (-63);
                        i2 = ((iM55680 ^ i15) * (-19081)) ^ (-1202562708);
                        i3 = 381627442;
                    } else {
                        iM55680 = (C0946.m55979("۬᩻") ^ i16) * 33;
                        i2 = ((iM55680 ^ i15) * 29879) ^ (-1672548611);
                        i3 = -1917985117;
                    }
                    int i2117 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2117;
                    i17 = i2;
                    c2 = c2;
                    break;
                case 1568633044:
                case 1993103928:
                    c2 = c2;
                    c3 = c3;
                    i20 = i20;
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("ۨܶ") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-19533)) ^ (-503077686);
                        i3 = 1539389175;
                    } else {
                        iM55680 = (i16 - C0873.m55680("᩷ۘ")) * 69;
                        i2 = ((iM55680 ^ i15) * (-29723)) ^ (-815132845);
                        i3 = 890397801;
                    }
                    int i2118 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2118;
                    i17 = i2;
                    c2 = c2;
                    break;
                default:
                    i20 = i20;
                    c2 = c2;
                    c3 = c3;
                    if (C1229.f82066 < 0) {
                        iM55680 = (C0946.m55979("֨ۨ") + i15) * 61;
                        i2 = ((iM55680 ^ i16) * (-29967)) ^ 661122710;
                        i3 = -1442576772;
                    } else {
                        iM55680 = C0873.m55680("ۨܶ") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-19533)) ^ (-503077686);
                        i3 = 1539389175;
                    }
                    int i2119 = iM55680 ^ i3;
                    i14 = i20;
                    c3 = c3;
                    i18 = i2119;
                    i17 = i2;
                    c2 = c2;
                    break;
            }
            return;
        }
    }

    @Override // p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C15440.m35174(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12263(C1326 c1326) {
        AbstractC1499 abstractC1499M6357 = null;
        int contentInsetStartWithNavigation = 0;
        int i = 0;
        int i2 = -658212947;
        int i3 = C1053.f81965;
        int i4 = C0863.f81833;
        int iM55979 = (C0946.m55979("۟ۤ") ^ i3) * 85;
        int i5 = ((iM55979 ^ i4) * 12931) ^ 210553054;
        int i6 = 171061686;
        while (true) {
            i2 = ((((i2 ^ i4) * 10489) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2123043489:
                case -1415232695:
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0946.m55979("ۛܺ") ^ i4) * 33;
                        i5 = ((iM55979 ^ i3) * (-23941)) ^ (-824204836);
                        i6 = -1717280753;
                    } else {
                        iM55979 = C0873.m55680("֫ۘ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 31579) ^ 2052194163;
                        i6 = -1604287009;
                    }
                    break;
                case -1987776648:
                case -343557285:
                    if (C0892.f81851) {
                        iM55979 = (i4 - C0873.m55680("֫ۡ")) * (-59);
                        i5 = ((iM55979 ^ i3) * 5197) ^ 1371432554;
                        i6 = 386674528;
                    } else {
                        iM55979 = (C0946.m55979("ۛܺ") ^ i4) * 33;
                        i5 = ((iM55979 ^ i3) * (-23941)) ^ (-824204836);
                        i6 = -1717280753;
                    }
                    break;
                case -1540596249:
                case -334864312:
                    abstractC1499M6357.mo17352(c1326);
                    if (C1964.m56597() != 0) {
                        iM55979 = (C0946.m55979("ۛܺ") ^ i4) * 33;
                        i5 = ((iM55979 ^ i3) * (-23941)) ^ (-824204836);
                        i6 = -1717280753;
                    } else {
                        iM55979 = C0873.m55680("ܺۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30921) ^ (-1843706425);
                        i6 = -1324782375;
                    }
                    break;
                case -1487487445:
                case -481409547:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("۬ۨ") ^ i4) * 61;
                        i5 = ((iM55979 ^ i3) * 27469) ^ 114693650;
                        i6 = 988813670;
                    } else {
                        iM55979 = (C0946.m55979("ۜ᩷") + i4) * 33;
                        i5 = ((iM55979 ^ i3) * 28435) ^ 1139769851;
                        i6 = 802713937;
                    }
                    break;
                case -1455099843:
                case 360372243:
                    if (!C0947.f81895) {
                        iM55979 = (C0946.m55979("۬ۨ") ^ i4) * 61;
                        i5 = ((iM55979 ^ i3) * 27469) ^ 114693650;
                        i6 = 988813670;
                    } else {
                        iM55979 = C0873.m55680("᩷֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * 17713) ^ (-793025399);
                        i6 = -1026125347;
                    }
                    break;
                case -1444755144:
                case 501370158:
                    contentInsetStartWithNavigation = c1326.getContentInsetStartWithNavigation();
                    i = 3;
                    if (C0861.f81831) {
                        iM55979 = (C0873.m55680("ۘۖ") ^ i3) * 23;
                        i5 = ((iM55979 ^ i4) * 13715) ^ 1374357997;
                        i6 = -51210831;
                    } else {
                        iM55979 = C0873.m55680("᩷֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * 17713) ^ (-793025399);
                        i6 = -1026125347;
                    }
                    break;
                case -1342517135:
                case 1675061759:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("᩷֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * 17713) ^ (-793025399);
                        i6 = -1026125347;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۢ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55979 ^ i3) * 6039) ^ (-1624371638);
                        i6 = -656357369;
                    }
                    break;
                case -1198821293:
                case -24857236:
                    if (C0898.m55800() <= 0) {
                        iM55979 = (C0946.m55979("۬ۨ") ^ i4) * 61;
                        i5 = ((iM55979 ^ i3) * 27469) ^ 114693650;
                        i6 = 988813670;
                    } else {
                        iM55979 = (i4 - C0946.m55979("᩶ۘ")) * (-87);
                        i5 = ((iM55979 ^ i3) * (-29595)) ^ (-852090159);
                        i6 = -258388230;
                    }
                    break;
                case -892020049:
                case 1854438416:
                    C0946.m55980();
                    break;
                case -577032225:
                case 638779465:
                    C0955.m56025();
                    iM55979 = (C0946.m55979("۬ۨ") ^ i4) * 61;
                    i5 = ((iM55979 ^ i3) * 27469) ^ 114693650;
                    i6 = 988813670;
                    break;
                case -213418386:
                case 1459457079:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0873.m55680("᩷֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * 17713) ^ (-793025399);
                        i6 = -1026125347;
                    } else {
                        iM55979 = C0873.m55680("ܳۨ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 7603) ^ 635992034;
                        i6 = -1611035532;
                    }
                    break;
                case -158760193:
                case 237904837:
                    C1404.m56468();
                    if (C0894.m55769() >= 0) {
                        iM55979 = (C0946.m55979("۬ۨ") ^ i4) * 61;
                        i5 = ((iM55979 ^ i3) * 27469) ^ 114693650;
                        i6 = 988813670;
                    } else {
                        iM55979 = C0946.m55979("᩺᩹") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-20443)) ^ (-772123720);
                        i6 = -373012024;
                    }
                    break;
                case 18685223:
                case 2042371533:
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0946.m55979("ۛܺ") ^ i4) * 33;
                        i5 = ((iM55979 ^ i3) * (-23941)) ^ (-824204836);
                        i6 = -1717280753;
                    } else {
                        iM55979 = C0946.m55979("ۡ᩷") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30759) ^ (-1836115737);
                        i6 = -1828030283;
                    }
                    break;
                case 396449865:
                case 1760472999:
                    if (C1024.f81946) {
                        iM55979 = C0873.m55680("᩷֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * 17713) ^ (-793025399);
                        i6 = -1026125347;
                    } else {
                        iM55979 = C0873.m55680("ۧۧ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-16143)) ^ 1229031194;
                        i6 = -539406701;
                    }
                    break;
                case 827063687:
                case 1219198347:
                    c1326.setContentInsetStartWithNavigation(contentInsetStartWithNavigation / i);
                    break;
                default:
                    abstractC1499M6357 = m6357();
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55979 = (C0946.m55979("۬ۨ") ^ i4) * 61;
                        i5 = ((iM55979 ^ i3) * 27469) ^ 114693650;
                        i6 = 988813670;
                    } else {
                        iM55979 = (C0873.m55680("ܳ֫") + i3) * (-37);
                        i5 = ((iM55979 ^ i4) * (-23581)) ^ 132485964;
                        i6 = -895440921;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12255(Runnable runnable) {
        this.f13390 = runnable;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m12245(AbstractActivityC5549 abstractActivityC5549, int i) {
        AbstractC17043 abstractC17043 = null;
        ArrayList arrayList = null;
        ?? r2 = 0;
        int i2 = 854409376;
        int i3 = C1053.f81965;
        int i4 = C0866.f81837;
        int iM55979 = (C0946.m55979("᩵֫") ^ i4) * 27;
        int i5 = ((iM55979 ^ i3) * 15961) ^ (-1368761637);
        int i6 = 1541076504;
        while (true) {
            i2 = ((((i2 ^ i3) * (-1597)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2112602960:
                case -1897849158:
                    if (i == -1) {
                        iM55979 = (i3 - C0873.m55680("֨֫")) * 37;
                        i5 = ((iM55979 ^ i4) * 6463) ^ 2111481166;
                        i6 = 474896187;
                    } else {
                        iM55979 = C0946.m55979("۫ۜ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-809)) ^ (-1179324877);
                        i6 = 1215680273;
                    }
                    break;
                case -2056427688:
                case 1364134314:
                    if (!C1025.m56230()) {
                        iM55979 = C0873.m55680("۠ܰ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-3809)) ^ 333521503;
                        i6 = 2128819355;
                    } else {
                        iM55979 = C0873.m55680("۟֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-2243)) ^ 704412113;
                        i6 = 380124075;
                    }
                    break;
                case -2053385549:
                case -743359121:
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("ܰۢ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-6539)) ^ 915832689;
                        i6 = -1474910606;
                    } else {
                        iM55979 = (i4 - C0946.m55979("֨ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM55979 ^ i3) * 6101) ^ (-1521751907);
                        i6 = -6874463;
                    }
                    break;
                case -1921409438:
                case -905954806:
                    abstractC17043 = abstractActivityC5549.f13399;
                    arrayList = abstractActivityC5549.f13393;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0946.m55979("ۗۡ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 26409) ^ 239113286;
                        i6 = -981266852;
                    } else {
                        iM55979 = (C0946.m55979("ܰ֨") + i4) * 119;
                        i5 = ((iM55979 ^ i3) * (-9639)) ^ 1447870870;
                        i6 = 2139794477;
                    }
                    break;
                case -1755954109:
                case -414898682:
                    break;
                case -1672844568:
                case 21104756:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i4 - C0946.m55979("֨ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM55979 ^ i3) * 6101) ^ (-1521751907);
                        i6 = -6874463;
                    } else {
                        iM55979 = (C0946.m55979("ۡۛ") ^ i4) * 33;
                        i5 = ((iM55979 ^ i3) * 27477) ^ (-1725522101);
                        i6 = 590157859;
                    }
                    break;
                case -1540160641:
                case 1949968390:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("۟֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-2243)) ^ 704412113;
                        i6 = 380124075;
                    } else {
                        iM55979 = C0873.m55680("ۜ֫") ^ i3;
                        i5 = ((iM55979 ^ i4) * 489) ^ 2119981715;
                        i6 = 1503498836;
                    }
                    break;
                case -1416621739:
                case 586467361:
                    if (C0906.m55809() > 0) {
                        iM55979 = (i4 - C0946.m55979("֨ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM55979 ^ i3) * 6101) ^ (-1521751907);
                        i6 = -6874463;
                    } else {
                        iM55979 = C0873.m55680("۠ܰ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-3809)) ^ 333521503;
                        i6 = 2128819355;
                    }
                    break;
                case -1082942749:
                case -387689184:
                    if (C1229.f82066 >= 0) {
                        iM55979 = (i4 - C0946.m55979("֨ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM55979 ^ i3) * 6101) ^ (-1521751907);
                        i6 = -6874463;
                    } else {
                        iM55979 = (i3 - C0873.m55680("֨ۨ")) * 101;
                        i5 = ((iM55979 ^ i4) * (-22117)) ^ 1894763043;
                        i6 = 653609778;
                    }
                    break;
                case -1071610003:
                case 92874916:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0873.m55680("ۘۢ") + i4) * 61;
                        i5 = ((iM55979 ^ i3) * (-32485)) ^ (-2071742503);
                        i6 = -1359816895;
                    } else {
                        iM55979 = (C0946.m55979("ۛۨ") + i3) * 55;
                        i5 = ((iM55979 ^ i4) * 2427) ^ (-1097925010);
                        i6 = -1307936597;
                    }
                    break;
                case -1033721388:
                case 89984825:
                    if (!C0861.m55626()) {
                        iM55979 = C0946.m55979("ۗۡ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 26409) ^ 239113286;
                        i6 = -981266852;
                    } else {
                        iM55979 = C0873.m55680("۠ܰ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-3809)) ^ 333521503;
                        i6 = 2128819355;
                    }
                    break;
                case -984623196:
                case 1841389875:
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0873.m55680("ۘۢ") + i4) * 61;
                        i5 = ((iM55979 ^ i3) * (-32485)) ^ (-2071742503);
                        i6 = -1359816895;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩸ۛ")) * (-65);
                        i5 = ((iM55979 ^ i3) * (-15361)) ^ 892191867;
                        i6 = -408246397;
                    }
                    break;
                case -966950144:
                case 39918379:
                    r2 = 0;
                    r2 = 0;
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ۘۢ") + i4) * 61;
                        i5 = ((iM55979 ^ i3) * (-32485)) ^ (-2071742503);
                        i6 = -1359816895;
                    } else {
                        iM55979 = (C0946.m55979("ܶ᩷") ^ i3) * (-13);
                        i5 = ((iM55979 ^ i4) * (-21369)) ^ (-1420317976);
                        i6 = -2144186457;
                    }
                    break;
                case -679802548:
                case 1582197244:
                    abstractActivityC5549.f13399 = r2;
                    abstractActivityC5549.f13393 = r2;
                    if (abstractC17043 != null) {
                        iM55979 = C0873.m55680("ۨ۬") ^ i4;
                        i5 = ((iM55979 ^ i3) * 18221) ^ (-907916622);
                        i6 = -1425667718;
                    } else {
                        iM55979 = C0946.m55979("۫ۜ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-809)) ^ (-1179324877);
                        i6 = 1215680273;
                    }
                    break;
                case -524692198:
                case 1150918388:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0873.m55680("۟֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-2243)) ^ 704412113;
                        i6 = 380124075;
                    } else {
                        iM55979 = C0873.m55680("ۘۖ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 5637) ^ 1410802912;
                        i6 = 520293264;
                    }
                    break;
                case -323134671:
                case -236978786:
                    RunnableC1014.m56177();
                    C0947.m55997();
                    iM55979 = C0873.m55680("۠ܰ") ^ i3;
                    i5 = ((iM55979 ^ i4) * (-3809)) ^ 333521503;
                    i6 = 2128819355;
                    break;
                case 1254080995:
                case 1354659161:
                    RunnableC0938.m55938();
                    C0992.m56107();
                    break;
                case 1948615293:
                case 1991066508:
                    C21898.m49404(abstractActivityC5549, abstractC17043, arrayList);
                    iM55979 = C0946.m55979("۫ۜ") ^ i4;
                    i5 = ((iM55979 ^ i3) * (-809)) ^ (-1179324877);
                    i6 = 1215680273;
                    break;
                default:
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("ۗۡ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 26409) ^ 239113286;
                        i6 = -981266852;
                    } else {
                        iM55979 = C0946.m55979("᩶᩷") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-23537)) ^ (-94371889);
                        i6 = -1424346940;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x0217 A[PHI: r12
      0x0217: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:56:0x0215, B:33:0x0150, B:30:0x0134, B:189:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0250 A[PHI: r2 r3 r4 r9
      0x0250: PHI (r2v6 int) = (r2v4 int), (r2v2 int), (r2v2 int) binds: [B:60:0x024e, B:52:0x01f2, B:16:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r3v6 short[]) = (r3v4 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:60:0x024e, B:52:0x01f2, B:16:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:60:0x024e, B:52:0x01f2, B:16:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r9v4 android.view.View) = (r9v2 android.view.View), (r9v3 android.view.View), (r9v2 android.view.View) binds: [B:60:0x024e, B:52:0x01f2, B:16:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d5, code lost:
    
        if (p067l.C1017.f81942 >= 0) goto L14;
     */
    /* JADX INFO: renamed from: ᩹ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m12281() {
        int iM55680;
        int i;
        int i2;
        ArrayList arrayListM13876;
        int i3;
        ArrayList arrayList;
        int iM55979;
        int i4;
        int i5;
        short[] sArr;
        View view;
        ArrayList arrayList2;
        int i6;
        int i7;
        int i8;
        int iM55681;
        int i9;
        int i10;
        int i11;
        int i12 = C0930.f81879;
        int i13 = C1012.f81938;
        int iM559710 = (C0946.m55979("ᩳۛ") + i12) * 25;
        int i14 = ((iM559710 ^ i13) * 17159) ^ (-798736069);
        View decorView = null;
        View viewM56465 = null;
        String name = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i15 = iM559710 ^ (-1492046469);
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        short s = 0;
        char c = 0;
        short s2 = 0;
        int iM55989 = 0;
        int i25 = 0;
        int i26 = 0;
        ArrayList arrayList3 = null;
        int i27 = 1705762453;
        int i28 = 0;
        String name2 = null;
        short[] sArr5 = null;
        int iM55682 = 0;
        View view2 = null;
        while (true) {
            i27 = i15 ^ (i14 & (((i27 ^ i13) * 20259) >> 31));
            switch (i27) {
                case -2143010815:
                case -1170352015:
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList4 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList4;
                    int i29 = s2 + s;
                    if ((i29 * i29) - i24 <= 0) {
                        iM55979 = (i12 - C0873.m55680("ۙۖ")) * 51;
                        i4 = ((iM55979 ^ i13) * 10735) ^ 1838161840;
                        i5 = 246443089;
                    } else {
                        iM55979 = (C0873.m55680("۫ۚ") ^ i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i12) * 6571) ^ (-1336639040);
                        i5 = 506859866;
                    }
                    int i30 = iM55979 ^ i5;
                    i28 = i28;
                    i11 = i16;
                    i15 = i30;
                    i14 = i4;
                    i16 = i11;
                    short[] sArr6 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr6;
                    break;
                case -2004510731:
                case 1583165254:
                    arrayList = arrayList3;
                    i20 = 49594;
                    iM55979 = (i12 - C0873.m55680("᩹۠")) * (-61);
                    i4 = ((iM55979 ^ i13) * 1997) ^ (-1507684053);
                    i5 = 83875821;
                    int i31 = iM55979 ^ i5;
                    i28 = i28;
                    i11 = i16;
                    i15 = i31;
                    i14 = i4;
                    i16 = i11;
                    short[] sArr7 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr7;
                    break;
                case -1748731332:
                case 535633897:
                    i16 = i16;
                    sArr = sArr3;
                    view = decorView;
                    arrayList2 = arrayList3;
                    int i32 = i28;
                    i17 = i17;
                    i6 = iM55989 - 1;
                    if (i6 >= 0) {
                        int iM559711 = C0946.m55979("ᩳۨ") ^ i12;
                        i7 = ((iM559711 ^ i13) * 29145) ^ 2003289417;
                        i8 = iM559711 ^ 1260170611;
                        i28 = i32;
                    } else {
                        i28 = i32;
                        int iM559712 = (i13 - C0946.m55979("ۧۢ")) * (-69);
                        i7 = ((iM559712 ^ i12) * (-8075)) ^ 16215518;
                        i8 = iM559712 ^ (-1744322204);
                    }
                    short[] sArr8 = sArr;
                    i25 = i6;
                    i14 = i7;
                    i17 = i17;
                    arrayList3 = arrayList2;
                    decorView = view;
                    sArr3 = sArr8;
                    int i33 = i16;
                    i15 = i8;
                    i16 = i33;
                    break;
                case -1726834585:
                case 1094627690:
                    arrayList = arrayList3;
                    i20 = 60011;
                    iM55979 = (i12 - C0873.m55680("᩹۠")) * (-61);
                    i4 = ((iM55979 ^ i13) * 1997) ^ (-1507684053);
                    i5 = 83875821;
                    int i34 = iM55979 ^ i5;
                    i28 = i28;
                    i11 = i16;
                    i15 = i34;
                    i14 = i4;
                    i16 = i11;
                    short[] sArr9 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr9;
                    break;
                case -1447480229:
                case 323454552:
                    return false;
                case -1373995164:
                case 1798309947:
                    ViewOnClickListenerC0939.m55941();
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("۫ۘ") + i13) * 119;
                        i = ((iM55680 ^ i12) * (-9897)) ^ 2063200660;
                        i2 = -1047773825;
                    } else {
                        iM55680 = C0946.m55979("ᩳ֡") ^ i13;
                        i = ((iM55680 ^ i12) * (-26751)) ^ 893550049;
                        i2 = 1341918700;
                    }
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case -1349323447:
                case -523398881:
                    return m12246((ViewGroup) view2, i19);
                case -1214760405:
                case -313457892:
                    C0854.m55595();
                    iM55680 = (C0946.m55979("ۧۙ") ^ i12) * 99;
                    i = ((iM55680 ^ i13) * 27919) ^ (-95452597);
                    i2 = -571188635;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case -1206768828:
                case 937321461:
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList5 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList5;
                    sArr5 = f81933;
                    c = 456;
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("ܳۗ") ^ i12;
                        i4 = ((iM55979 ^ i13) * (-25773)) ^ (-1227165711);
                        i5 = 1166905289;
                    } else {
                        iM55979 = (i12 - C0946.m55979("֫ۧ")) * 11;
                        i4 = ((iM55979 ^ i13) * 29177) ^ 1113374968;
                        i5 = 632177168;
                    }
                    int i35 = iM55979 ^ i5;
                    i28 = i28;
                    i11 = i16;
                    i15 = i35;
                    i14 = i4;
                    i16 = i11;
                    short[] sArr10 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr10;
                    break;
                case -1140939342:
                case -960895936:
                    if (!C0906.m55806(name, RunnableC1014.m56180(sArr4, i16, 41, i20))) {
                        arrayListM13876 = arrayList3;
                        i3 = i28;
                        i17 = i17;
                        i26 = i3;
                        i25 = i25;
                        iM55681 = C0873.m55680("۬ܳ") ^ i13;
                        sArr3 = sArr3;
                        i9 = ((iM55681 ^ i12) * (-27651)) ^ (-1587010672);
                        i10 = -2054309279;
                        i8 = iM55681 ^ i10;
                        i28 = i3;
                        int i36 = i17;
                        arrayList3 = arrayListM13876;
                        i14 = i9;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i36;
                        int i37 = i16;
                        i15 = i8;
                        i16 = i37;
                    } else {
                        iM55680 = C0946.m55979("ۧۨ") ^ i13;
                        i = ((iM55680 ^ i12) * (-27381)) ^ (-498078749);
                        i2 = 1440290518;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    }
                    break;
                case -1128370334:
                case -1117450712:
                    i21 = 457;
                    if (C1071.m56343() == 0) {
                        iM55680 = C0873.m55680("ۜ᩺") ^ i13;
                        i = ((iM55680 ^ i12) * 20055) ^ (-644599601);
                        i2 = -905387350;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    } else {
                        i16 = i16;
                        i28 = i28;
                        ArrayList arrayList6 = arrayList3;
                        i17 = i17;
                        i25 = i25;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList6;
                        iM55979 = C0946.m55979("᩹ۡ") ^ i12;
                        i4 = ((iM55979 ^ i13) * (-17509)) ^ 1482175098;
                        i5 = 2107644922;
                        int i38 = iM55979 ^ i5;
                        i28 = i28;
                        i11 = i16;
                        i15 = i38;
                        i14 = i4;
                        i16 = i11;
                        short[] sArr11 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr11;
                    }
                    break;
                case -1030279738:
                case -186315202:
                    i16 = i16;
                    arrayListM13876 = arrayList3;
                    i3 = i28;
                    i17 = i17;
                    i25 = i25;
                    if (i25 != C0947.m55989(arrayListM13876) - 1) {
                        i26 = i25;
                        iM55681 = C0873.m55680("۬ܳ") ^ i13;
                        sArr3 = sArr3;
                        i9 = ((iM55681 ^ i12) * (-27651)) ^ (-1587010672);
                        i10 = -2054309279;
                        i8 = iM55681 ^ i10;
                        i28 = i3;
                        int i39 = i17;
                        arrayList3 = arrayListM13876;
                        i14 = i9;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i39;
                        int i310 = i16;
                        i15 = i8;
                        i16 = i310;
                    } else {
                        sArr = sArr3;
                        i28 = i3;
                        view = decorView;
                        arrayList2 = arrayListM13876;
                        i6 = i25;
                        int iM559713 = (i13 - C0946.m55979("ۧۢ")) * (-69);
                        i7 = ((iM559713 ^ i12) * (-8075)) ^ 16215518;
                        i8 = iM559713 ^ (-1744322204);
                        short[] sArr12 = sArr;
                        i25 = i6;
                        i14 = i7;
                        i17 = i17;
                        arrayList3 = arrayList2;
                        decorView = view;
                        sArr3 = sArr12;
                        int i311 = i16;
                        i15 = i8;
                        i16 = i311;
                    }
                    break;
                case -895637866:
                case 163274350:
                    return m12246((C1593) viewM56465, i19);
                case -829129079:
                case 1877085374:
                    C1404.m56468();
                    return false;
                case -708081040:
                case 666181326:
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList7 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList7;
                    s2 = sArr5[c];
                    if (C1048.m56305() >= 0) {
                        i16 = i16;
                        iM55979 = C0946.m55979("۟ܶ") ^ i12;
                        i16 = i16;
                        i4 = ((iM55979 ^ i13) * (-2533)) ^ (-89846122);
                        i5 = 1399929574;
                    } else {
                        iM55979 = C0873.m55680("ۡ۫") ^ i13;
                        i4 = ((iM55979 ^ i12) * 15141) ^ (-1131830456);
                        i5 = -1578765206;
                    }
                    int i312 = iM55979 ^ i5;
                    i28 = i28;
                    i11 = i16;
                    i15 = i312;
                    i14 = i4;
                    i16 = i11;
                    short[] sArr13 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr13;
                    break;
                case -700403094:
                case -648347552:
                    i16 = i16;
                    i17 = i17;
                    i25 = i25;
                    i3 = i28;
                    sArr3 = sArr3;
                    arrayListM13876 = C6093.m13876();
                    decorView = C0937.m55910(this).getDecorView();
                    iM55989 = C0947.m55989(arrayListM13876);
                    iM55681 = (i13 - C0873.m55680("ܶ֫")) * (-9);
                    i9 = ((iM55681 ^ i12) * 8221) ^ 645396482;
                    i10 = 898932809;
                    i8 = iM55681 ^ i10;
                    i28 = i3;
                    int i313 = i17;
                    arrayList3 = arrayListM13876;
                    i14 = i9;
                    sArr3 = sArr3;
                    i25 = i25;
                    i17 = i313;
                    int i314 = i16;
                    i15 = i8;
                    i16 = i314;
                    break;
                case -665867125:
                case -418287939:
                    arrayListM13876 = arrayList3;
                    i3 = i28;
                    view2 = (View) C1929.m56563(arrayListM13876, i3);
                    if (view2.getVisibility() == 0) {
                        int iM55683 = C0873.m55680("۠֨") ^ i13;
                        int i40 = i16;
                        int i41 = ((iM55683 ^ i12) * 3095) ^ (-763937645);
                        int i42 = iM55683 ^ (-1516885817);
                        i28 = i3;
                        arrayList3 = arrayListM13876;
                        i14 = i41;
                        i16 = i40;
                        i15 = i42;
                    } else {
                        i17 = i17;
                        i26 = i3;
                        i25 = i25;
                        iM55681 = C0873.m55680("۬ܳ") ^ i13;
                        sArr3 = sArr3;
                        i9 = ((iM55681 ^ i12) * (-27651)) ^ (-1587010672);
                        i10 = -2054309279;
                        i8 = iM55681 ^ i10;
                        i28 = i3;
                        int i315 = i17;
                        arrayList3 = arrayListM13876;
                        i14 = i9;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i315;
                        int i316 = i16;
                        i15 = i8;
                        i16 = i316;
                    }
                    break;
                case -462843744:
                case -250768180:
                    C0866.m55645();
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0946.m55979("ۧۙ") ^ i12) * 99;
                        i = ((iM55680 ^ i13) * 27919) ^ (-95452597);
                        i2 = -571188635;
                    } else {
                        iM55680 = (C0946.m55979("۫ۘ") + i13) * 119;
                        i = ((iM55680 ^ i12) * (-9897)) ^ 2063200660;
                        i2 = -1047773825;
                    }
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case -369830871:
                case 627243309:
                    iM55682 = C0873.m55680(RunnableC0897.m55783(sArr3, i17, i18, i20));
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("᩵֫") + i12) * 23;
                        i = ((iM55680 ^ i13) * (-31953)) ^ (-1914037583);
                        i2 = 2066439795;
                    } else {
                        iM55680 = (C0946.m55979("ۧۙ") ^ i12) * 99;
                        i = ((iM55680 ^ i13) * 27919) ^ (-95452597);
                        i2 = -571188635;
                    }
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case -294477397:
                case 815348878:
                    i16 = i16;
                    ArrayList arrayList8 = arrayList3;
                    int i43 = i26 + 1;
                    if (i43 < C1048.m56303(arrayList8)) {
                        int iM55684 = (i12 - C0873.m55680("ܰۗ")) * (-9);
                        i28 = i43;
                        arrayList3 = arrayList8;
                        i14 = ((iM55684 ^ i13) * 28451) ^ (-1165079195);
                        i16 = i16;
                        i15 = iM55684 ^ (-1135685756);
                    } else {
                        i28 = i43;
                        i17 = i17;
                        View view3 = decorView;
                        arrayList2 = arrayList8;
                        i6 = i25;
                        sArr = sArr3;
                        view = view3;
                        int iM559714 = (i13 - C0946.m55979("ۧۢ")) * (-69);
                        i7 = ((iM559714 ^ i12) * (-8075)) ^ 16215518;
                        i8 = iM559714 ^ (-1744322204);
                        short[] sArr14 = sArr;
                        i25 = i6;
                        i14 = i7;
                        i17 = i17;
                        arrayList3 = arrayList2;
                        decorView = view;
                        sArr3 = sArr14;
                        int i317 = i16;
                        i15 = i8;
                        i16 = i317;
                    }
                    break;
                case -270805174:
                case 1705178704:
                    i16 = i16;
                    arrayListM13876 = arrayList3;
                    i3 = i28;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    if (C1964.m56587(arrayListM13876, i25) != decorView) {
                        iM55989 = i25;
                        decorView = decorView;
                        iM55681 = (i13 - C0873.m55680("ܶ֫")) * (-9);
                        i9 = ((iM55681 ^ i12) * 8221) ^ 645396482;
                        i10 = 898932809;
                        i8 = iM55681 ^ i10;
                        i28 = i3;
                        int i318 = i17;
                        arrayList3 = arrayListM13876;
                        i14 = i9;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i318;
                        int i319 = i16;
                        i15 = i8;
                        i16 = i319;
                    } else {
                        int iM55685 = (C0873.m55680("ۘܽ") + i12) * (-95);
                        arrayList = arrayListM13876;
                        i14 = ((iM55685 ^ i13) * 14301) ^ (-2125715809);
                        i28 = i3;
                        i11 = i16;
                        i15 = iM55685 ^ 1401042181;
                        i16 = i11;
                        short[] sArr15 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr15;
                    }
                    break;
                case -154544784:
                case 1049371040:
                    sArr3 = f81933;
                    i17 = 466;
                    i18 = 3;
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("᩶۬") ^ i13;
                        i = ((iM55680 ^ i12) * (-20137)) ^ 197517249;
                        i2 = -792600069;
                    } else {
                        iM55680 = (i13 - C0873.m55680("ۘ۠")) * (-119);
                        i = ((iM55680 ^ i12) * 25545) ^ 1835521794;
                        i2 = -158496755;
                    }
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case -85233846:
                case 2061945339:
                    C1024.m56209();
                    if (C1025.f81947 >= 0) {
                        i16 = i16;
                        i28 = i28;
                        ArrayList arrayList9 = arrayList3;
                        i17 = i17;
                        i25 = i25;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList9;
                        iM55979 = C0873.m55680("֡ۢ") ^ i12;
                        i4 = ((iM55979 ^ i13) * (-13453)) ^ (-955448415);
                        i5 = -542097317;
                        int i3110 = iM55979 ^ i5;
                        i28 = i28;
                        i11 = i16;
                        i15 = i3110;
                        i14 = i4;
                        i16 = i11;
                        short[] sArr16 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr16;
                    } else {
                        iM55680 = (C0946.m55979("۫ۘ") + i13) * 119;
                        i = ((iM55680 ^ i12) * (-9897)) ^ 2063200660;
                        i2 = -1047773825;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    }
                    break;
                case 12830127:
                case 90484039:
                    name2 = RunnableC1014.m56165(view2).getName();
                    sArr2 = f81933;
                    if (!RunnableC0897.f81856) {
                        i16 = i16;
                        i28 = i28;
                        ArrayList arrayList10 = arrayList3;
                        i17 = i17;
                        i25 = i25;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList10;
                        iM55979 = C0946.m55979("᩹ۡ") ^ i12;
                        i4 = ((iM55979 ^ i13) * (-17509)) ^ 1482175098;
                        i5 = 2107644922;
                        int i3111 = iM55979 ^ i5;
                        i28 = i28;
                        i11 = i16;
                        i15 = i3111;
                        i14 = i4;
                        i16 = i11;
                        short[] sArr17 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr17;
                    } else {
                        iM55680 = (C0946.m55979("᩷ۨ") + i12) * 37;
                        i = ((iM55680 ^ i13) * (-20233)) ^ (-1069648265);
                        i2 = 2104022049;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    }
                    break;
                case 117906805:
                case 907455562:
                    break;
                case 263212388:
                case 351368040:
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList11 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList11;
                    i22 = s2 * s2;
                    i23 = 240653169;
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("᩹ۡ") ^ i12;
                        i4 = ((iM55979 ^ i13) * (-17509)) ^ 1482175098;
                        i5 = 2107644922;
                    } else {
                        iM55979 = (C0873.m55680("ܺᩴ") + i13) * 57;
                        i4 = ((iM55979 ^ i12) * (-31955)) ^ 1903777756;
                        i5 = 315744392;
                    }
                    int i3112 = iM55979 ^ i5;
                    i28 = i28;
                    i11 = i16;
                    i15 = i3112;
                    i14 = i4;
                    i16 = i11;
                    short[] sArr18 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr18;
                    break;
                case 276998439:
                case 808565838:
                    if (C0854.m55594(view2) <= 0) {
                        arrayListM13876 = arrayList3;
                        i3 = i28;
                        i17 = i17;
                        i26 = i3;
                        i25 = i25;
                        iM55681 = C0873.m55680("۬ܳ") ^ i13;
                        sArr3 = sArr3;
                        i9 = ((iM55681 ^ i12) * (-27651)) ^ (-1587010672);
                        i10 = -2054309279;
                        i8 = iM55681 ^ i10;
                        i28 = i3;
                        int i3113 = i17;
                        arrayList3 = arrayListM13876;
                        i14 = i9;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i3113;
                        int i3114 = i16;
                        i15 = i8;
                        i16 = i3114;
                    } else {
                        iM55680 = (i12 - C0873.m55680("᩷ۗ")) * 81;
                        i = ((iM55680 ^ i13) * 11065) ^ (-1760717676);
                        i2 = -1597832640;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    }
                    break;
                case 444932690:
                case 1125249434:
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList12 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList12;
                    int i44 = i22 + i23;
                    i24 = i44 + i44;
                    s = 15513;
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0873.m55680("֡ۢ") ^ i12;
                        i4 = ((iM55979 ^ i13) * (-13453)) ^ (-955448415);
                        i5 = -542097317;
                    } else {
                        iM55979 = (i12 - C0873.m55680("۫᩺")) * 23;
                        i4 = ((iM55979 ^ i13) * 5993) ^ 2090138433;
                        i5 = -1297455200;
                    }
                    int i3115 = iM55979 ^ i5;
                    i28 = i28;
                    i11 = i16;
                    i15 = i3115;
                    i14 = i4;
                    i16 = i11;
                    short[] sArr19 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr19;
                    break;
                case 505631740:
                case 1708556773:
                    if (C1964.f83032 <= 0) {
                        i16 = i16;
                        i28 = i28;
                        ArrayList arrayList13 = arrayList3;
                        i17 = i17;
                        i25 = i25;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList13;
                        iM55979 = C0873.m55680("ܳۗ") ^ i12;
                        i4 = ((iM55979 ^ i13) * (-25773)) ^ (-1227165711);
                        i5 = 1166905289;
                        int i3116 = iM55979 ^ i5;
                        i28 = i28;
                        i11 = i16;
                        i15 = i3116;
                        i14 = i4;
                        i16 = i11;
                        short[] sArr110 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr110;
                    } else {
                        iM55680 = (C0946.m55979("ۧۙ") ^ i12) * 99;
                        i = ((iM55680 ^ i13) * 27919) ^ (-95452597);
                        i2 = -571188635;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    }
                    break;
                case 547888466:
                case 1214685479:
                    viewM56465 = C1404.m56465(view2, 2122383954 ^ iM55682);
                    if (C0892.f81851) {
                        iM55680 = C0946.m55979("ۙۛ") ^ i13;
                        i = ((iM55680 ^ i12) * 3769) ^ (-1554850601);
                        i2 = -1920249075;
                    } else {
                        iM55680 = C0946.m55979("᩶۬") ^ i13;
                        i = ((iM55680 ^ i12) * (-20137)) ^ 197517249;
                        i2 = -792600069;
                    }
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case 949998343:
                case 1408047308:
                    i19 = 10;
                    if (viewM56465 instanceof C1593) {
                        iM55680 = C0873.m55680("᩵ܶ") ^ i12;
                        i = ((iM55680 ^ i13) * 32293) ^ (-280446365);
                        i2 = 654640377;
                    } else {
                        iM55680 = (C0946.m55979("᩷ܺ") ^ i12) * 39;
                        i = ((iM55680 ^ i13) * (-17477)) ^ 983078479;
                        i2 = 1973662965;
                    }
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case 1053618444:
                case 1747271126:
                    if (C1404.m56463(view2) <= 0) {
                        arrayListM13876 = arrayList3;
                        i3 = i28;
                        i17 = i17;
                        i26 = i3;
                        i25 = i25;
                        iM55681 = C0873.m55680("۬ܳ") ^ i13;
                        sArr3 = sArr3;
                        i9 = ((iM55681 ^ i12) * (-27651)) ^ (-1587010672);
                        i10 = -2054309279;
                        i8 = iM55681 ^ i10;
                        i28 = i3;
                        int i3117 = i17;
                        arrayList3 = arrayListM13876;
                        i14 = i9;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i3117;
                        int i3118 = i16;
                        i15 = i8;
                        i16 = i3118;
                    } else {
                        iM55680 = (C0946.m55979("ۗۙ") ^ i13) * 119;
                        i = ((iM55680 ^ i12) * (-13217)) ^ 122689560;
                        i2 = 703396257;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    }
                    break;
                case 1083164962:
                case 2110555943:
                    C0894.m55769();
                    if (RunnableC0871.f81839 < 0) {
                        iM55680 = (C0946.m55979("۫ۘ") + i13) * 119;
                        i = ((iM55680 ^ i12) * (-9897)) ^ 2063200660;
                        i2 = -1047773825;
                    } else {
                        iM55680 = C0946.m55979("᩶۬") ^ i13;
                        i = ((iM55680 ^ i12) * (-20137)) ^ 197517249;
                        i2 = -792600069;
                    }
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    break;
                case 1164295088:
                case 1801221638:
                    name = AbstractC0942.m55962(view2).getName();
                    sArr4 = f81933;
                    i16 = 469;
                    if (C0930.m55885() > 0) {
                        iM55680 = C0946.m55979("ܶܿ") ^ i13;
                        i = ((iM55680 ^ i12) * (-7095)) ^ (-1306886275);
                        i2 = 250222675;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    } else {
                        i28 = i28;
                        ArrayList arrayList14 = arrayList3;
                        i17 = i17;
                        i25 = i25;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList14;
                        iM55979 = C0946.m55979("۟ܶ") ^ i12;
                        i16 = i16;
                        i4 = ((iM55979 ^ i13) * (-2533)) ^ (-89846122);
                        i5 = 1399929574;
                        int i3119 = iM55979 ^ i5;
                        i28 = i28;
                        i11 = i16;
                        i15 = i3119;
                        i14 = i4;
                        i16 = i11;
                        short[] sArr111 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr111;
                    }
                    break;
                case 1394491780:
                case 1725223660:
                    C1044.m56286();
                    if (C1194.m56396() > 0) {
                        iM55680 = C0873.m55680("ۙ۠") ^ i13;
                        i = ((iM55680 ^ i12) * (-7661)) ^ (-1808718268);
                        i2 = -1307337350;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    } else {
                        i28 = i28;
                        ArrayList arrayList15 = arrayList3;
                        i17 = i17;
                        i25 = i25;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList15;
                        iM55979 = C0946.m55979("۟ܶ") ^ i12;
                        i16 = i16;
                        i4 = ((iM55979 ^ i13) * (-2533)) ^ (-89846122);
                        i5 = 1399929574;
                        int i31110 = iM55979 ^ i5;
                        i28 = i28;
                        i11 = i16;
                        i15 = i31110;
                        i14 = i4;
                        i16 = i11;
                        short[] sArr112 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr112;
                    }
                    break;
                default:
                    if (!C1028.m56248(name2, C1929.m56558(sArr2, i21, 9, i20))) {
                        arrayListM13876 = arrayList3;
                        i3 = i28;
                        i17 = i17;
                        i26 = i3;
                        i25 = i25;
                        iM55681 = C0873.m55680("۬ܳ") ^ i13;
                        sArr3 = sArr3;
                        i9 = ((iM55681 ^ i12) * (-27651)) ^ (-1587010672);
                        i10 = -2054309279;
                        i8 = iM55681 ^ i10;
                        i28 = i3;
                        int i31111 = i17;
                        arrayList3 = arrayListM13876;
                        i14 = i9;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i31111;
                        int i31112 = i16;
                        i15 = i8;
                        i16 = i31112;
                    } else {
                        iM55680 = (C0873.m55680("֨ۘ") + i12) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55680 ^ i13) * 23661) ^ (-1730363694);
                        i2 = -1208469950;
                        i15 = iM55680 ^ i2;
                        i14 = i;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01ed A[PHI: r2 r7 r8 r10 r17
      0x01ed: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:53:0x01eb, B:45:0x01a0, B:27:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:53:0x01eb, B:45:0x01a0, B:27:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:53:0x01eb, B:45:0x01a0, B:27:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short) binds: [B:53:0x01eb, B:45:0x01a0, B:27:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r17v18 boolean) = (r17v8 boolean), (r17v11 boolean), (r17v20 boolean) binds: [B:53:0x01eb, B:45:0x01a0, B:27:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0254 A[PHI: r9 r17 r18
      0x0254: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:61:0x0252, B:49:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r17v9 boolean) = (r17v6 boolean), (r17v10 boolean) binds: [B:61:0x0252, B:49:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:61:0x0252, B:49:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x028a A[PHI: r13 r17
      0x028a: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:66:0x0288, B:30:0x00f8, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r17v27 boolean) = (r17v5 boolean), (r17v17 boolean), (r17v28 boolean) binds: [B:66:0x0288, B:30:0x00f8, B:12:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        if (p067l.C1012.f81938 >= 0) goto L8;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12271(int i) {
        int iM55979;
        int i2;
        int i3;
        int i4 = C0906.f81862;
        int i5 = C1044.f81959;
        int iM55680 = (C0873.m55680("۠۠") ^ i5) * (-125);
        int i6 = ((iM55680 ^ i4) * (-7135)) ^ (-2030916476);
        String strM56403 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM55680 ^ 1391020122;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i10 = 0;
        short s3 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 283196461;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i4) * 22597) >> 31));
            switch (i13) {
                case -2127960555:
                case 1860392344:
                    z = z;
                    if ((s * s3) - i10 > 0) {
                        iM55979 = (C0873.m55680("ۛ᩸") + i5) * 59;
                        i2 = ((iM55979 ^ i4) * (-4127)) ^ (-1345276533);
                        i3 = 1976354862;
                    } else {
                        iM55979 = (i4 - C0873.m55680("֡᩸")) * 65;
                        i2 = ((iM55979 ^ i5) * 9671) ^ 1129708100;
                        i3 = 167513355;
                    }
                    boolean z2 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z2;
                    break;
                case -1932896882:
                case -1691433940:
                    z = z;
                    s = sArr[c];
                    s2 = 14183;
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("᩹ܳ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 25971) ^ (-1710869865);
                        i3 = -1620122612;
                    } else {
                        iM55979 = C0946.m55979("֡ܳ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 10803) ^ 1669793556;
                        i3 = -1416062582;
                    }
                    boolean z3 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z3;
                    break;
                case -1889810389:
                case -1087376617:
                    strM56403 = C1229.m56403(sArr2, i12, 3, i11);
                    if (C0892.f81851) {
                        iM55979 = C0873.m55680("۫ܰ") ^ i5;
                        z = z;
                        i2 = ((iM55979 ^ i4) * 20529) ^ (-1830901251);
                        i3 = 1609118860;
                    } else {
                        z = z;
                        iM55979 = C0946.m55979("᩹ܳ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 25971) ^ (-1710869865);
                        i3 = -1620122612;
                    }
                    boolean z4 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z4;
                    break;
                case -1438020337:
                case 2029991743:
                    i11 = 12529;
                    iM55979 = C0946.m55979("ۡ֡") ^ i4;
                    i2 = ((iM55979 ^ i5) * 10679) ^ (-730246660);
                    i3 = 1831911891;
                    boolean z5 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z5;
                    break;
                case -1326951584:
                case -1007031684:
                    z = z;
                    sArr = f81933;
                    if (C0927.f81875) {
                        z = z;
                        iM55979 = (C0946.m55979("ܽܿ") + i5) * (-83);
                        z = z;
                        i2 = ((iM55979 ^ i4) * (-11443)) ^ 954689391;
                        i3 = 378210670;
                    } else {
                        iM55979 = C0946.m55979("ᩳᩴ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-20293)) ^ 1859342363;
                        i3 = 2085004071;
                    }
                    boolean z6 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z6;
                    break;
                case -1036473064:
                case 1844940657:
                    sArr2 = f81933;
                    if (C1046.f81962 <= 0) {
                        z = false;
                        iM55979 = (C0946.m55979("ܽܿ") + i5) * (-83);
                        z = z;
                        i2 = ((iM55979 ^ i4) * (-11443)) ^ 954689391;
                        i3 = 378210670;
                        boolean z7 = z;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                        z = z7;
                    } else {
                        int iM55681 = (C0873.m55680("֡۬") ^ i5) * 45;
                        i7 = iM55681 ^ (-112309595);
                        i6 = ((iM55681 ^ i4) * (-11531)) ^ (-1091736624);
                        z = false;
                    }
                    break;
                case -763169072:
                case -749905043:
                    z = z;
                    c = 348;
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0946.m55979("ܿۧ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 14195) ^ 1029642010;
                        i3 = -596539536;
                    } else {
                        iM55979 = C0873.m55680("ۗۤ") ^ i5;
                        i2 = ((iM55979 ^ i4) * (-17025)) ^ (-1085757888);
                        i3 = 76652219;
                    }
                    boolean z8 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z8;
                    break;
                case -676136719:
                case -665248902:
                    int iM55682 = C0873.m55680(strM56403);
                    if (C0906.f81862 >= 0) {
                        i8 = iM55682;
                        i9 = 2102850107;
                        iM55979 = (C0946.m55979("ܽܿ") + i5) * (-83);
                        z = z;
                        i2 = ((iM55979 ^ i4) * (-11443)) ^ 954689391;
                        i3 = 378210670;
                        boolean z9 = z;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                        z = z9;
                    } else {
                        int iM559710 = C0946.m55979("ܽܰ") ^ i4;
                        int i14 = ((iM559710 ^ i5) * (-18295)) ^ 1022693730;
                        i7 = iM559710 ^ 1895988756;
                        i8 = iM55682;
                        i6 = i14;
                        i9 = 2102850107;
                    }
                    break;
                case -644488187:
                case 99821995:
                    if (C1071.f81975 > 0) {
                        iM55979 = (C0946.m55979("ܽܿ") + i5) * (-83);
                        z = z;
                        i2 = ((iM55979 ^ i4) * (-11443)) ^ 954689391;
                        i3 = 378210670;
                        boolean z10 = z;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                        z = z10;
                    }
                    z = z;
                    iM55979 = C0946.m55979("۫ܳ") ^ i4;
                    i2 = ((iM55979 ^ i5) * (-681)) ^ (-1975829986);
                    i3 = 1609919663;
                    boolean z11 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z11;
                    break;
                case -593161188:
                case 1153472438:
                    C0898.m55800();
                    break;
                case -592377855:
                case 811952637:
                    C0930.m55885();
                    if (C0949.m56012()) {
                        z = z;
                        iM55979 = C0946.m55979("ܿۧ") ^ i5;
                        i2 = ((iM55979 ^ i4) * 14195) ^ 1029642010;
                        i3 = -596539536;
                        boolean z12 = z;
                        i7 = iM55979 ^ i3;
                        i6 = i2;
                        z = z12;
                    } else {
                        int iM55683 = C0873.m55680("۫ܺ") ^ i5;
                        i7 = iM55683 ^ (-1918310948);
                        i6 = ((iM55683 ^ i4) * 10203) ^ (-2140439270);
                    }
                    break;
                case -569757780:
                case 1133333934:
                    m12253(i8 ^ i9, i, z);
                    break;
                case -466288005:
                case 1412067616:
                    C1036.m56257();
                    break;
                case -86227269:
                case 296018698:
                    z = z;
                    s3 = 56732;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("᩹ܳ") ^ i4;
                        i2 = ((iM55979 ^ i5) * 25971) ^ (-1710869865);
                        i3 = -1620122612;
                    } else {
                        iM55979 = (C0873.m55680("֡᩵") ^ i5) * 29;
                        i2 = ((iM55979 ^ i4) * (-29125)) ^ 1788410624;
                        i3 = 478465124;
                    }
                    boolean z13 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z13;
                    break;
                case -45091499:
                case 969225682:
                    z = z;
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0946.m55979("۫ܳ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-681)) ^ (-1975829986);
                        i3 = 1609919663;
                    } else {
                        iM55979 = (i5 - C0946.m55979("֨ۚ")) * (-75);
                        i2 = ((iM55979 ^ i4) * (-17531)) ^ (-1313391915);
                        i3 = -1116768962;
                    }
                    boolean z14 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z14;
                    break;
                case 22395346:
                case 1631718158:
                    z = z;
                    i12 = 349;
                    if (C0890.f81849 != 0) {
                        iM55979 = C0946.m55979("۫ܳ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-681)) ^ (-1975829986);
                        i3 = 1609919663;
                    } else {
                        iM55979 = C0946.m55979("۬ۚ") ^ i4;
                        i2 = ((iM55979 ^ i5) * (-25443)) ^ (-1304894091);
                        i3 = 542352238;
                    }
                    boolean z15 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z15;
                    break;
                case 76585491:
                case 295490036:
                    z = z;
                    int i15 = s + s2;
                    i10 = i15 * i15;
                    if (C1964.m56597() != 0) {
                        z = z;
                        iM55979 = (C0946.m55979("ܽܿ") + i5) * (-83);
                        z = z;
                        i2 = ((iM55979 ^ i4) * (-11443)) ^ 954689391;
                        i3 = 378210670;
                    } else {
                        iM55979 = (C0946.m55979("ܳ۬") + i4) * (-17);
                        i2 = ((iM55979 ^ i5) * (-11349)) ^ 1132582461;
                        i3 = -1702831673;
                    }
                    boolean z16 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z16;
                    break;
                case 85955342:
                case 418969913:
                    i11 = 13527;
                    iM55979 = C0946.m55979("ۡ֡") ^ i4;
                    i2 = ((iM55979 ^ i5) * 10679) ^ (-730246660);
                    i3 = 1831911891;
                    boolean z17 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z17;
                    break;
                default:
                    C1025.m56230();
                    C0930.m55885();
                    z = z;
                    iM55979 = C0946.m55979("ܿۧ") ^ i5;
                    i2 = ((iM55979 ^ i4) * 14195) ^ 1029642010;
                    i3 = -596539536;
                    boolean z18 = z;
                    i7 = iM55979 ^ i3;
                    i6 = i2;
                    z = z18;
                    break;
            }
            return;
        }
    }

    @Override // p067l.ActivityC4388, p067l.ActivityC0904, p067l.ActivityC2023, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws Throwable {
        boolean z = false;
        boolean z2 = false;
        Throwable th = null;
        boolean z3 = false;
        boolean zM51768 = false;
        int i = -1923164769;
        int i2 = C0989.f81920;
        int i3 = C1046.f81962;
        int iM55979 = C0946.m55979("ۢ᩻") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-29747)) ^ 1616366878;
        int i5 = -851888551;
        while (true) {
            i = ((((i ^ i3) * 2055) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2086277531:
                case -1071898652:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (i2 - C0946.m55979("ܺۚ")) * 33;
                        i4 = ((iM55979 ^ i3) * (-10701)) ^ (-1989912335);
                        i5 = 1468219115;
                    } else {
                        iM55979 = (i2 - C0946.m55979("֨ܳ")) * 39;
                        i4 = ((iM55979 ^ i3) * 29125) ^ 316905236;
                        i5 = 2144560241;
                    }
                    break;
                case -1850233817:
                case 1154474029:
                    if (C1036.f81953 >= 0) {
                        iM55979 = (i2 - C0946.m55979("᩸᩹")) * 99;
                        i4 = ((iM55979 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    } else {
                        iM55979 = (C0873.m55680("۬ۛ") + i3) * (-57);
                        i4 = ((iM55979 ^ i2) * (-29277)) ^ (-1333493977);
                        i5 = -430608579;
                    }
                    break;
                case -1665164425:
                case -1230621194:
                    if (z3 != zM51768) {
                        iM55979 = (C0946.m55979("۫ۛ") ^ i2) * (-107);
                        i4 = ((iM55979 ^ i3) * 26525) ^ 1827245868;
                        i5 = 368153529;
                    } else {
                        iM55979 = (C0873.m55680("ۗۘ") ^ i2) * 91;
                        i4 = ((iM55979 ^ i3) * 29597) ^ 919210475;
                        i5 = -315253087;
                    }
                    break;
                case -1623774102:
                case -24836254:
                    try {
                        mo118();
                        iM55979 = (C0873.m55680("ۗۘ") ^ i2) * 91;
                        i4 = ((iM55979 ^ i3) * 29597) ^ 919210475;
                        i5 = -315253087;
                    } catch (Throwable th2) {
                        th = th2;
                        iM55979 = (C0873.m55680("᩻ܽ") ^ i3) * (-107);
                        i4 = ((iM55979 ^ i2) * 24867) ^ (-1113045684);
                        i5 = 1249828144;
                    }
                    break;
                case -1601240457:
                case -1160298149:
                    this.f13387 = true;
                    z = false;
                    iM55979 = (i2 - C0946.m55979("ۙܳ")) * 87;
                    i4 = ((iM55979 ^ i3) * 27751) ^ (-1013924108);
                    i5 = 428690484;
                    break;
                case -1329516732:
                case 797669732:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (i2 - C0946.m55979("᩸᩹")) * 99;
                        i4 = ((iM55979 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܳۡ")) * (-55);
                        i4 = ((iM55979 ^ i2) * 30857) ^ 1311383933;
                        i5 = -1883278471;
                    }
                    break;
                case -1142977940:
                case 1124285796:
                    C1929.m56553();
                    C0912.m55833();
                    iM55979 = (C0946.m55979("ۧۛ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i4 = ((iM55979 ^ i2) * (-23939)) ^ (-1413827681);
                    i5 = 1034204509;
                    break;
                case -1129083656:
                case -221497050:
                    z3 = this.f13394;
                    zM51768 = C23223.m51768();
                    iM55979 = (C0873.m55680("ۚ۬") + i3) * 101;
                    i4 = ((iM55979 ^ i2) * 12289) ^ 302751531;
                    i5 = -1587605430;
                    break;
                case -1009476666:
                case -231373730:
                    C0894.m55769();
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0946.m55979("ᩴܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4815) ^ 427215229;
                        i5 = -317379712;
                    } else {
                        iM55979 = (C0946.m55979("ۧۛ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55979 ^ i2) * (-23939)) ^ (-1413827681);
                        i5 = 1034204509;
                    }
                    break;
                case -836520109:
                case 1059689625:
                    this.f13387 = z;
                    return;
                case -823962500:
                case 989197597:
                    C1194.m56396();
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i2 - C0946.m55979("᩸᩹")) * 99;
                        i4 = ((iM55979 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    } else {
                        iM55979 = (C0946.m55979("ۧۛ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55979 ^ i2) * (-23939)) ^ (-1413827681);
                        i5 = 1034204509;
                    }
                    break;
                case -792184067:
                case -690837728:
                    C1229.m56410();
                    RunnableC0897.m55784();
                    return;
                case -736448868:
                case 941294359:
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("ۡܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8229) ^ (-2132373704);
                        i5 = -1915374673;
                    } else {
                        iM55979 = (C0946.m55979("᩵۫") ^ i2) * (-29);
                        i4 = ((iM55979 ^ i3) * 13863) ^ (-86377514);
                        i5 = 2145817678;
                    }
                    break;
                case -715243432:
                case 2115044163:
                    if (RunnableC1014.m56177()) {
                        iM55979 = C0946.m55979("᩺֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23533)) ^ (-571465228);
                        i5 = -714125659;
                    } else {
                        iM55979 = C0946.m55979("ᩴܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4815) ^ 427215229;
                        i5 = -317379712;
                    }
                    break;
                case -618859142:
                case 2138025928:
                    if (C0989.m56095() > 0) {
                        iM55979 = (i2 - C0946.m55979("ܺۚ")) * 33;
                        i4 = ((iM55979 ^ i3) * (-10701)) ^ (-1989912335);
                        i5 = 1468219115;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩸᩹")) * 99;
                        i4 = ((iM55979 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    }
                    break;
                case -576807571:
                case 952606871:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0873.m55680("ۡܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8229) ^ (-2132373704);
                        i5 = -1915374673;
                    } else {
                        iM55979 = (C0946.m55979("᩵ᩴ") + i2) * (-45);
                        i4 = ((iM55979 ^ i3) * (-25653)) ^ (-1034427013);
                        i5 = 1308407030;
                    }
                    break;
                case -395755703:
                case 2087957695:
                    C0992.m56107();
                    if (C0890.f81849 != 0) {
                        iM55979 = C0873.m55680("ۡܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8229) ^ (-2132373704);
                        i5 = -1915374673;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩸᩹")) * 99;
                        i4 = ((iM55979 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    }
                    break;
                case -214779047:
                case 643492527:
                    this.f13387 = z;
                    throw th;
                case -181653711:
                case 1819524509:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0946.m55979("᩷ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31487) ^ (-1687049872);
                        i5 = -1096573276;
                    } else {
                        iM55979 = C0946.m55979("᩻ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18347)) ^ 1479775822;
                        i5 = 1179650942;
                    }
                    break;
                case 269539839:
                case 1459683055:
                    super.onConfigurationChanged(configuration);
                    z2 = this.f13389;
                    iM55979 = (C0873.m55680("ܶۜ") ^ i3) * (-9);
                    i4 = ((iM55979 ^ i2) * 5605) ^ 1031950466;
                    i5 = -767593441;
                    break;
                case 278571620:
                case 1104699899:
                    if (this.f13387) {
                        iM55979 = C0946.m55979("ܽܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-17003)) ^ (-71350442);
                        i5 = -945397441;
                    } else {
                        iM55979 = (C0873.m55680("ܿ֫") + i3) * (-23);
                        i4 = ((iM55979 ^ i2) * 14297) ^ 1656909936;
                        i5 = -1994839184;
                    }
                    break;
                case 550889768:
                case 2036304778:
                    if (z2) {
                        iM55979 = C0946.m55979("᩵֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6187) ^ 486915196;
                        i5 = 133028455;
                    } else {
                        iM55979 = (C0873.m55680("ۗۘ") ^ i2) * 91;
                        i4 = ((iM55979 ^ i3) * 29597) ^ 919210475;
                        i5 = -315253087;
                    }
                    break;
                case 668998053:
                case 1916686542:
                    if (C1044.f81959 >= 0) {
                        iM55979 = (i2 - C0946.m55979("᩸᩹")) * 99;
                        i4 = ((iM55979 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    } else {
                        iM55979 = C0946.m55979("֨ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31239) ^ 200096197;
                        i5 = -1957187085;
                    }
                    break;
                case 847535114:
                case 1920354982:
                    super.onConfigurationChanged(configuration);
                    return;
                case 1253977127:
                case 1633173191:
                    if (C0892.f81851) {
                        iM55979 = C0873.m55680("ۖܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30115) ^ (-1817682672);
                        i5 = -626427693;
                    } else {
                        iM55979 = (C0946.m55979("ۧۛ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55979 ^ i2) * (-23939)) ^ (-1413827681);
                        i5 = 1034204509;
                    }
                    break;
                default:
                    if (C1194.m56396() <= 0) {
                        iM55979 = (i2 - C0946.m55979("ܺۚ")) * 33;
                        i4 = ((iM55979 ^ i3) * (-10701)) ^ (-1989912335);
                        i5 = 1468219115;
                    } else {
                        iM55979 = (C0873.m55680("ۜܰ") + i2) * (-75);
                        i4 = ((iM55979 ^ i3) * 20011) ^ 562351788;
                        i5 = 1123693370;
                    }
                    break;
            }
        }
    }

    @Override // p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public void onStart() {
        int i = -2140909081;
        int i2 = AbstractC0942.f81890;
        int i3 = C0845.f81821;
        int iM55680 = C0873.m55680("ۙ֫") ^ i3;
        int i4 = ((iM55680 ^ i2) * (-19579)) ^ 984017032;
        int i5 = -2110001402;
        while (true) {
            i = ((((i ^ i2) * (-17949)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2098310193:
                case -2044304990:
                    View view = this.f13395;
                    if (ServiceConnectionC1013.f81940 < 0) {
                        if (RunnableC0871.f81839 < 0) {
                            if (C1003.f81929 > 0) {
                                if (C0898.f81858 <= 0) {
                                    iM55680 = (i3 - C0873.m55680("ۢ۟")) * (-19);
                                    i4 = ((iM55680 ^ i2) * (-10959)) ^ 2094926182;
                                    i5 = -1912479161;
                                    break;
                                } else if (C1194.m56396() <= 0) {
                                    iM55680 = (C0946.m55979("᩶ۡ") ^ i2) * 39;
                                    i4 = ((iM55680 ^ i3) * (-28075)) ^ (-1460708114);
                                    i5 = -161785004;
                                    break;
                                } else if (C0882.m55710() == 0) {
                                    if (C1003.f81929 > 0 && RunnableC0871.f81839 < 0 && C0861.f81831) {
                                        if (C0946.f81894 == 0) {
                                            f13386 = new WeakReference(view);
                                            iM55680 = C0946.m55979("ܿܶ") ^ i2;
                                            i4 = ((iM55680 ^ i3) * 27927) ^ (-1567003104);
                                            i5 = 1500245537;
                                            break;
                                        }
                                    }
                                }
                            }
                            iM55680 = C0946.m55979("۫ۗ") ^ i2;
                            i4 = ((iM55680 ^ i3) * 6035) ^ 1754383410;
                            i5 = -444867568;
                            break;
                        }
                        iM55680 = (C0946.m55979("ۢܽ") + i2) * C0254q.f1218h;
                        i4 = ((iM55680 ^ i3) * (-1329)) ^ 218266080;
                        i5 = -1263158248;
                        break;
                    }
                    iM55680 = C0946.m55979("ܺۨ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 1167) ^ 588063611;
                    i5 = -1848882752;
                    break;
                case -2073468907:
                case 2124295103:
                    if (this.f13395 != null) {
                        iM55680 = C0873.m55680("ᩳᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 14969) ^ 1322952588;
                        i5 = 2118648037;
                    } else {
                        iM55680 = C0946.m55979("ܿܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27927) ^ (-1567003104);
                        i5 = 1500245537;
                    }
                    break;
                case -1311848015:
                case -725347406:
                    C0992.m56107();
                    if (!C0861.f81831) {
                        iM55680 = C0946.m55979("ܺۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1167) ^ 588063611;
                        i5 = -1848882752;
                    } else {
                        iM55680 = (C0946.m55979("᩶ۡ") ^ i2) * 39;
                        i4 = ((iM55680 ^ i3) * (-28075)) ^ (-1460708114);
                        i5 = -161785004;
                    }
                    break;
                case -1278112033:
                case -575680991:
                    C0912.m55833();
                    break;
                case -981344564:
                case 2094896685:
                    if (C1036.f81953 < 0) {
                        iM55680 = C0946.m55979("ܺۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1167) ^ 588063611;
                        i5 = -1848882752;
                    } else {
                        iM55680 = C0946.m55979("۫ۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6035) ^ 1754383410;
                        i5 = -444867568;
                    }
                    break;
                case 264341109:
                case 1897484444:
                    super.onStart();
                    break;
                case 1835643493:
                case 1914103844:
                    C0882.m55710();
                    C1194.m56396();
                    iM55680 = C0946.m55979("۫ۗ") ^ i2;
                    i4 = ((iM55680 ^ i3) * 6035) ^ 1754383410;
                    i5 = -444867568;
                    break;
                default:
                    if (!C0917.f81868) {
                        iM55680 = C0946.m55979("ܺۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1167) ^ 588063611;
                        i5 = -1848882752;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۢ۟")) * (-19);
                        i4 = ((iM55680 ^ i2) * (-10959)) ^ 2094926182;
                        i5 = -1912479161;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.ActivityC3069, android.app.Activity
    public void onPause() {
        String strMo119 = null;
        int i = 1496605112;
        int i2 = C1017.f81942;
        int i3 = C0866.f81837;
        int iM55680 = (C0873.m55680("۟۫") ^ i3) * (-71);
        int i4 = ((iM55680 ^ i2) * 18311) ^ (-666152788);
        int i5 = -891046536;
        while (true) {
            i = ((((i ^ i2) * (-25555)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2053926059:
                case 1676787467:
                    C0845.m55584();
                    break;
                case -2048285307:
                case 1510687791:
                    C0946.m55980();
                    if (C1229.f82066 < 0) {
                        iM55680 = (i2 - C0873.m55680("ۢۜ")) * (-111);
                        i4 = ((iM55680 ^ i3) * 1461) ^ 762034219;
                        i5 = -733565944;
                    } else {
                        iM55680 = C0873.m55680("ۙۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 30693) ^ (-1004404685);
                        i5 = 598894329;
                    }
                    break;
                case -1997759956:
                case 1436831477:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0873.m55680("ۙۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 30693) ^ (-1004404685);
                        i5 = 598894329;
                    } else {
                        iM55680 = (C0946.m55979("ۙ᩵") ^ i2) * 99;
                        i4 = ((iM55680 ^ i3) * 9511) ^ (-1983174386);
                        i5 = 1993613544;
                    }
                    break;
                case -1769429226:
                case 576234786:
                    C0861.m55626();
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0873.m55680("ۙۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 30693) ^ (-1004404685);
                        i5 = 598894329;
                    } else {
                        iM55680 = C0946.m55979("ۤᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15953)) ^ 229418889;
                        i5 = 1412067087;
                    }
                    break;
                case -1760024746:
                case -298759610:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0873.m55680("ۛۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27407)) ^ 606353018;
                        i5 = 1194422331;
                    } else {
                        iM55680 = (C0946.m55979("᩸ܺ") ^ i3) * (-25);
                        i4 = ((iM55680 ^ i2) * 29645) ^ (-1667623710);
                        i5 = 381804;
                    }
                    break;
                case -1306346815:
                case -412732643:
                    if (C0955.m56025()) {
                        iM55680 = C0873.m55680("ۛۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27407)) ^ 606353018;
                        i5 = 1194422331;
                    } else {
                        iM55680 = C0946.m55979("ۨᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20105) ^ 1697944484;
                        i5 = -1749938169;
                    }
                    break;
                case -1177635330:
                case -463956025:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("ۛۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27407)) ^ 606353018;
                        i5 = 1194422331;
                    } else {
                        iM55680 = (C0946.m55979("᩸ܶ") + i3) * (-97);
                        i4 = ((iM55680 ^ i2) * 13159) ^ 1809718570;
                        i5 = -91332621;
                    }
                    break;
                case -1097418176:
                case 325960605:
                    MobclickAgent.onPageEnd(strMo119);
                    MobclickAgent.onPause(this);
                    iM55680 = C0873.m55680("ۤ᩵") ^ i2;
                    i4 = ((iM55680 ^ i3) * 12187) ^ (-1166967533);
                    i5 = -1892925223;
                    break;
                case -1082774886:
                case -428858167:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("᩺ۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21449)) ^ 288453797;
                        i5 = 1523173414;
                    } else {
                        iM55680 = C0873.m55680("ۘۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 8219) ^ (-1745439984);
                        i5 = -2012484725;
                    }
                    break;
                case -1013893880:
                case -675276849:
                    super.onPause();
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("᩺ۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21449)) ^ 288453797;
                        i5 = 1523173414;
                    } else {
                        iM55680 = (C0873.m55680("ᩴ۠") ^ i2) * (-111);
                        i4 = ((iM55680 ^ i3) * (-20551)) ^ (-1796919323);
                        i5 = 1519473493;
                    }
                    break;
                case -983202536:
                case 1088096860:
                    C0866.m55645();
                    if (!C0927.f81875) {
                        iM55680 = C0873.m55680("ۛۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27407)) ^ 606353018;
                        i5 = 1194422331;
                    } else {
                        iM55680 = C0873.m55680("ۙۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 30693) ^ (-1004404685);
                        i5 = 598894329;
                    }
                    break;
                case -670070055:
                case 1586871426:
                    break;
                case -622184156:
                case -57545774:
                    C0894.m55769();
                    iM55680 = C0946.m55979("ۤᩴ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-15953)) ^ 229418889;
                    i5 = 1412067087;
                    break;
                case -580298503:
                case 1217509007:
                    if (C1024.f81946) {
                        iM55680 = C0873.m55680("᩺ۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21449)) ^ 288453797;
                        i5 = 1523173414;
                    } else {
                        iM55680 = C0873.m55680("᩻ᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 19881) ^ (-202168576);
                        i5 = 904058069;
                    }
                    break;
                case -89721813:
                case 1255349587:
                    if (C1046.f81962 <= 0) {
                        iM55680 = (i2 - C0873.m55680("ۢۜ")) * (-111);
                        i4 = ((iM55680 ^ i3) * 1461) ^ 762034219;
                        i5 = -733565944;
                    } else {
                        iM55680 = (C0873.m55680("ܺۚ") + i3) * 39;
                        i4 = ((iM55680 ^ i2) * 12641) ^ 151281775;
                        i5 = 1771921859;
                    }
                    break;
                case -12786749:
                case 1815537098:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("ۤᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15953)) ^ 229418889;
                        i5 = 1412067087;
                    } else {
                        iM55680 = (C0946.m55979("֫ۚ") ^ i2) * 43;
                        i4 = ((iM55680 ^ i3) * (-22539)) ^ 337883767;
                        i5 = -2059111027;
                    }
                    break;
                case 606424544:
                case 902863691:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0946.m55979("ۤᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15953)) ^ 229418889;
                        i5 = 1412067087;
                    } else {
                        iM55680 = C0946.m55979("᩻ۘ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 4225) ^ (-1540550104);
                        i5 = 1670942006;
                    }
                    break;
                case 1775408231:
                case 1896163469:
                    strMo119 = mo119();
                    int i6 = C8775.f23820;
                    if (C17452.m39788()) {
                        iM55680 = C0873.m55680("ۤ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12187) ^ (-1166967533);
                        i5 = -1892925223;
                    } else {
                        iM55680 = (C0873.m55680("ۙ۠") ^ i3) * 101;
                        i4 = ((iM55680 ^ i2) * 19179) ^ (-254346889);
                        i5 = 443247785;
                    }
                    break;
                default:
                    if (this.f13396) {
                        iM55680 = (C0873.m55680("ܽܶ") + i3) * (-109);
                        i4 = ((iM55680 ^ i2) * 8873) ^ (-1991398812);
                        i5 = -1807527693;
                    } else {
                        iM55680 = C0873.m55680("ۤ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12187) ^ (-1166967533);
                        i5 = -1892925223;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static int[] m12249(View view) {
        int paddingLeft = 0;
        int paddingTop = 0;
        int paddingRight = 0;
        int i = 1492280921;
        int i2 = C1025.f81947;
        int i3 = C1044.f81959;
        int iM55979 = C0946.m55979("۫ۧ") ^ i2;
        int i4 = ((iM55979 ^ i3) * 12561) ^ 1154946093;
        int i5 = -242704573;
        while (true) {
            i = ((((i ^ i3) * 12545) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2074490283:
                case 1481088792:
                    C0882.m55710();
                    iM55979 = (i2 - C0873.m55680("᩻᩵")) * (-41);
                    i4 = ((iM55979 ^ i3) * (-8405)) ^ (-179260279);
                    i5 = 781947222;
                    break;
                case -1869494967:
                case -109760398:
                    return new int[]{paddingLeft, paddingTop, paddingRight, view.getPaddingBottom()};
                case -1793956698:
                case 212430369:
                    return null;
                case -1704327329:
                case 1866223546:
                    C1036.m56257();
                    if (!C0912.m55833()) {
                        iM55979 = C0946.m55979("ۜܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32749) ^ (-890832554);
                        i5 = -1771532825;
                    } else {
                        iM55979 = (C0873.m55680("ۖܿ") + i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 307) ^ 1628977587;
                        i5 = 727453874;
                    }
                    break;
                case -1375170830:
                case 1567888784:
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0873.m55680("ۖܿ") + i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 307) ^ 1628977587;
                        i5 = 727453874;
                    } else {
                        iM55979 = C0946.m55979("۠֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31347) ^ (-1913838444);
                        i5 = -255631740;
                    }
                    break;
                case -1374706726:
                case 1032853193:
                    if (C0898.m55800() <= 0) {
                        iM55979 = C0946.m55979("ۜܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32749) ^ (-890832554);
                        i5 = -1771532825;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩵") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55979 ^ i2) * 9947) ^ (-1878300800);
                        i5 = 693049155;
                    }
                    break;
                case -1133527349:
                case 1661178553:
                    if (C1046.m56302() == 0) {
                        iM55979 = (i2 - C0873.m55680("᩻᩵")) * (-41);
                        i4 = ((iM55979 ^ i3) * (-8405)) ^ (-179260279);
                        i5 = 781947222;
                    } else {
                        iM55979 = (C0873.m55680("᩶۠") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i2) * 32099) ^ (-873038388);
                        i5 = -2075092559;
                    }
                    break;
                case -1040407885:
                case -929679540:
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("ۜܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32749) ^ (-890832554);
                        i5 = -1771532825;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ᩶") + i3) * 27;
                        i4 = ((iM55979 ^ i2) * 16805) ^ (-567779576);
                        i5 = -416583954;
                    }
                    break;
                case -914077872:
                case 1780254383:
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("ܽ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28639)) ^ 533459340;
                        i5 = -346528406;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܿ᩸")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i2) * (-24099)) ^ (-1284892215);
                        i5 = 307502214;
                    }
                    break;
                case -683887499:
                case -494223188:
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0873.m55680("ܽ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28639)) ^ 533459340;
                        i5 = -346528406;
                    } else {
                        iM55979 = C0946.m55979("ܺ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11481) ^ (-1183045340);
                        i5 = 1007751239;
                    }
                    break;
                case -394844120:
                case 1381651617:
                    paddingLeft = view.getPaddingLeft();
                    paddingTop = view.getPaddingTop();
                    if (C1025.m56230()) {
                        iM55979 = (i2 - C0873.m55680("᩻᩵")) * (-41);
                        i4 = ((iM55979 ^ i3) * (-8405)) ^ (-179260279);
                        i5 = 781947222;
                    } else {
                        iM55979 = (C0946.m55979("ܿᩴ") + i3) * (-55);
                        i4 = ((iM55979 ^ i2) * (-28213)) ^ (-881917298);
                        i5 = -1337069569;
                    }
                    break;
                case -168489307:
                case -128829661:
                    C0877.m55696();
                    C0906.m55809();
                    return null;
                case 23081127:
                case 2023265684:
                    paddingRight = view.getPaddingRight();
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0873.m55680("ܽ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28639)) ^ 533459340;
                        i5 = -346528406;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۨ֨")) * 15;
                        i4 = ((iM55979 ^ i3) * 22343) ^ (-1819025626);
                        i5 = -1433252655;
                    }
                    break;
                case 74766058:
                case 1180709068:
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("ܽ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28639)) ^ 533459340;
                        i5 = -346528406;
                    } else {
                        iM55979 = C0873.m55680("ܽ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26189)) ^ 271656650;
                        i5 = 1023631871;
                    }
                    break;
                case 84902898:
                case 687172390:
                    if (view == null) {
                        iM55979 = C0873.m55680("ܳ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-20765)) ^ (-1208742240);
                        i5 = -2064475359;
                    } else {
                        iM55979 = (C0873.m55680("ܶ۟") ^ i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-24399)) ^ (-1968776395);
                        i5 = -895863035;
                    }
                    break;
                case 1305247630:
                case 1670980725:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ۜܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32749) ^ (-890832554);
                        i5 = -1771532825;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩳܺ")) * 7;
                        i4 = ((iM55979 ^ i3) * 13381) ^ 1572804248;
                        i5 = 26681752;
                    }
                    break;
                case 1659869150:
                case 1771237573:
                    if (C1964.f83032 > 0) {
                        iM55979 = (C0873.m55680("ۖܿ") + i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 307) ^ 1628977587;
                        i5 = 727453874;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩻᩵")) * (-41);
                        i4 = ((iM55979 ^ i3) * (-8405)) ^ (-179260279);
                        i5 = 781947222;
                    }
                    break;
                default:
                    if (C0882.m55710() != 0) {
                        iM55979 = C0946.m55979("ۜܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32749) ^ (-890832554);
                        i5 = -1771532825;
                    } else {
                        iM55979 = (C0873.m55680("᩹ۘ") + i2) * (-99);
                        i4 = ((iM55979 ^ i3) * 19239) ^ (-2063045817);
                        i5 = 603160754;
                    }
                    break;
            }
        }
    }

    @Override // p067l.ActivityC3069, p067l.ActivityC2023, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = -1965780049;
        int i4 = C0949.f81897;
        int i5 = C0989.f81920;
        int iM55979 = (C0946.m55979("᩵ۚ") ^ i4) * (-65);
        int i6 = ((iM55979 ^ i5) * (-11171)) ^ (-1673937413);
        int i7 = 431953199;
        while (true) {
            i3 = ((((i3 ^ i5) * (-3971)) >> 31) & i6) ^ (iM55979 ^ i7);
            switch (i3) {
                case -2075187582:
                case 1234368543:
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0946.m55979("ۙܿ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۙܶ")) * (-89);
                        i6 = ((iM55979 ^ i5) * (-1303)) ^ 1545966298;
                        i7 = 445237713;
                    }
                    break;
                case -2069725320:
                case 479597415:
                    if (C1404.f82149 < 0) {
                        iM55979 = C0946.m55979("ۙܿ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    } else {
                        iM55979 = (C0946.m55979("ܶ᩹") ^ i4) * 17;
                        i6 = ((iM55979 ^ i5) * 24413) ^ (-1006712157);
                        i7 = -14553456;
                    }
                    break;
                case -1987970044:
                case 1826573012:
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0946.m55979("۫ۛ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 28977) ^ (-548230627);
                        i7 = -268645028;
                    } else {
                        iM55979 = C0946.m55979("۟ۢ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 7647) ^ 1390806190;
                        i7 = 347116918;
                    }
                    break;
                case -1852033307:
                case -659089828:
                    C0917.m55854();
                    break;
                case -1698676260:
                case 1807506670:
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0946.m55979("۫ۛ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 28977) ^ (-548230627);
                        i7 = -268645028;
                    } else {
                        iM55979 = (C0946.m55979("ۚ۟") ^ i5) * (-15);
                        i6 = ((iM55979 ^ i4) * 6771) ^ 693050203;
                        i7 = 477564657;
                    }
                    break;
                case -1456834981:
                case -380775024:
                    if (C0912.m55833()) {
                        iM55979 = C0946.m55979("۫ۛ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 28977) ^ (-548230627);
                        i7 = -268645028;
                    } else {
                        iM55979 = (C0946.m55979("ܿ᩸") + i5) * (-7);
                        i6 = ((iM55979 ^ i4) * 10005) ^ 805704019;
                        i7 = -934670670;
                    }
                    break;
                case -1278409493:
                case -930900686:
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("ۙܿ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    } else {
                        iM55979 = C0873.m55680("֨ۡ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-25357)) ^ 1132459991;
                        i7 = -1023955836;
                    }
                    break;
                case -840514893:
                case 1921622643:
                    if (i == 11101) {
                        iM55979 = (C0873.m55680("᩸۠") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM55979 ^ i4) * 24503) ^ 449050767;
                        i7 = 2041682837;
                    } else {
                        iM55979 = C0946.m55979("ۢܽ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 3181) ^ 1342463247;
                        i7 = 201650917;
                    }
                    break;
                case -749848351:
                case 1870986473:
                    if (C0967.m56074()) {
                        iM55979 = C0946.m55979("ۙܿ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    } else {
                        iM55979 = C0873.m55680("ۤۘ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 25301) ^ (-1582631543);
                        i7 = -1823478256;
                    }
                    break;
                case -740138924:
                case 463574683:
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("ۙܿ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    } else {
                        iM55979 = (C0873.m55680("ۧ᩷") ^ i5) * 127;
                        i6 = ((iM55979 ^ i4) * (-25419)) ^ 1258266733;
                        i7 = -157562956;
                    }
                    break;
                case -716004776:
                case -514968395:
                    super.onActivityResult(i, i2, intent);
                    break;
                case -672717986:
                case 906169311:
                    C0873.m55678();
                    if (!C0917.f81868) {
                        iM55979 = (i5 - C0873.m55680("ۧᩳ")) * 17;
                        i6 = ((iM55979 ^ i4) * 13865) ^ 1838148250;
                        i7 = 1540792252;
                    } else {
                        iM55979 = C0946.m55979("ۙܿ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    }
                    break;
                case -187272420:
                case 147450693:
                    C0989.m56095();
                    iM55979 = (C0946.m55979("ܶ᩹") ^ i4) * 17;
                    i6 = ((iM55979 ^ i5) * 24413) ^ (-1006712157);
                    i7 = -14553456;
                    break;
                case 450808475:
                case 830568343:
                    if (C0861.m55626()) {
                        iM55979 = (i5 - C0873.m55680("ۧᩳ")) * 17;
                        i6 = ((iM55979 ^ i4) * 13865) ^ 1838148250;
                        i7 = 1540792252;
                    } else {
                        iM55979 = C0946.m55979("ܽ᩵") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-22367)) ^ 1006141064;
                        i7 = 246502816;
                    }
                    break;
                case 1243201090:
                case 1906676770:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("۫ۛ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 28977) ^ (-548230627);
                        i7 = -268645028;
                    } else {
                        iM55979 = C0873.m55680("ܳۨ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 7631) ^ 1782238039;
                        i7 = 807124899;
                    }
                    break;
                case 1524075322:
                case 1943639582:
                    C20468.m46162(i, i2, intent, this.f13404);
                    this.f13404 = null;
                    break;
                case 1835568941:
                case 2043564107:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0946.m55979("ܶ᩹") ^ i4) * 17;
                        i6 = ((iM55979 ^ i5) * 24413) ^ (-1006712157);
                        i7 = -14553456;
                    } else {
                        iM55979 = C0946.m55979("ܿᩳ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-20509)) ^ 1011744839;
                        i7 = 644618594;
                    }
                    break;
                default:
                    if (C0898.m55800() <= 0) {
                        iM55979 = (C0946.m55979("ܶ᩹") ^ i4) * 17;
                        i6 = ((iM55979 ^ i5) * 24413) ^ (-1006712157);
                        i7 = -14553456;
                    } else {
                        iM55979 = (C0873.m55680("ۖۨ") ^ i5) * (-115);
                        i6 = ((iM55979 ^ i4) * 20239) ^ (-571942759);
                        i7 = -1922651179;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12262(InterfaceC6386 interfaceC6386) {
        this.f13404 = interfaceC6386;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01ed A[PHI: r16 r17 r18
      0x01ed: PHI (r16v11 java.lang.String) = (r16v10 java.lang.String), (r16v12 java.lang.String) binds: [B:57:0x01d6, B:52:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r17v8 int) = (r17v7 int), (r17v9 int) binds: [B:57:0x01d6, B:52:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r18v8 short[]) = (r18v7 short[]), (r18v9 short[]) binds: [B:57:0x01d6, B:52:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x031d A[PHI: r5 r6 r7 r8 r9 r16 r17 r18
      0x031d: PHI (r5v7 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:82:0x031b, B:73:0x02c1, B:69:0x0296, B:7:0x0040, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r6v7 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:82:0x031b, B:73:0x02c1, B:69:0x0296, B:7:0x0040, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r7v7 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:82:0x031b, B:73:0x02c1, B:69:0x0296, B:7:0x0040, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r8v7 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:82:0x031b, B:73:0x02c1, B:69:0x0296, B:7:0x0040, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r9v7 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:82:0x031b, B:73:0x02c1, B:69:0x0296, B:7:0x0040, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r16v29 java.lang.String) = 
      (r16v3 java.lang.String)
      (r16v4 java.lang.String)
      (r16v5 java.lang.String)
      (r16v20 java.lang.String)
      (r16v33 java.lang.String)
     binds: [B:82:0x031b, B:73:0x02c1, B:69:0x0296, B:7:0x0040, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r17v29 int) = (r17v0 int), (r17v1 int), (r17v2 int), (r17v15 int), (r17v33 int) binds: [B:82:0x031b, B:73:0x02c1, B:69:0x0296, B:7:0x0040, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r18v26 short[]) = (r18v0 short[]), (r18v1 short[]), (r18v2 short[]), (r18v15 short[]), (r18v27 short[]) binds: [B:82:0x031b, B:73:0x02c1, B:69:0x0296, B:7:0x0040, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m12267(AbstractC17043 abstractC17043, List list) {
        int iM55979;
        int i;
        int iM559710;
        int i2;
        int iM559711;
        int i3;
        int i4;
        int iM55680;
        int i5;
        ArrayList arrayList = null;
        String strM55591 = null;
        short[] sArr = null;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1802945081;
        int i11 = C1124.f82007;
        int i12 = C0863.f81833;
        int iM55681 = C0873.m55680("ܺܿ") ^ i12;
        int i13 = ((iM55681 ^ i11) * (-14579)) ^ (-335876518);
        int i14 = 14096528;
        while (true) {
            int i15 = iM55681 ^ i14;
            while (true) {
                i10 = ((((i10 ^ i11) * 15325) >> 31) & i13) ^ i15;
                switch (i10) {
                    case -2121771609:
                    case -1067212264:
                        C0863.m55643();
                        C0845.m55584();
                        return false;
                    case -2041752676:
                    case -1665224340:
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        if (Build.VERSION.SDK_INT >= 26) {
                            iM55979 = C0946.m55979("ܿܿ") ^ i11;
                            i13 = ((iM55979 ^ i12) * (-9403)) ^ 1279258740;
                            i = 2064635492;
                        } else {
                            iM55979 = C0873.m55680("۠ۘ") ^ i12;
                            i13 = ((iM55979 ^ i11) * 1843) ^ (-2117455069);
                            i = 1896840768;
                        }
                        i15 = iM55979 ^ i;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -2015545592:
                    case -372352594:
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        this.f13399 = abstractC17043;
                        if (list == null) {
                            iM55979 = (i12 - C0946.m55979("ۘۘ")) * (-123);
                            i13 = ((iM55979 ^ i11) * (-30139)) ^ (-1668140013);
                            i = 702271985;
                        } else {
                            iM55979 = C0873.m55680("᩸ܺ") ^ i11;
                            i13 = ((iM55979 ^ i12) * (-20479)) ^ 616066820;
                            i = 2062075366;
                        }
                        i15 = iM55979 ^ i;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -1999724233:
                    case 1438733393:
                        i9 = 52509;
                        iM55979 = (C0873.m55680("֨ۛ") ^ i12) * (-41);
                        i13 = ((iM55979 ^ i11) * 21401) ^ (-1438590735);
                        i = -1635054702;
                        i15 = iM55979 ^ i;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -1861473415:
                    case 406633684:
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        if (C0967.f81910 >= 0) {
                            iM55979 = (C0873.m55680("ۜܿ") ^ i12) * (-83);
                            i13 = ((iM55979 ^ i11) * (-21865)) ^ (-1595930280);
                            i = -488740154;
                        } else {
                            iM55979 = (C0946.m55979("ᩳ᩵") ^ i11) * (-51);
                            i13 = ((iM55979 ^ i12) * (-12897)) ^ (-2109932388);
                            i = 2051926906;
                        }
                        i15 = iM55979 ^ i;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -1806707592:
                    case 1642649735:
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        this.f13393 = arrayList;
                        short[] sArr2 = f81933;
                        if (C1003.m56123() == 0) {
                            String strM55970 = AbstractC0942.m55970(sArr2, 293, 8, i9);
                            if (C1028.m56247() < 0) {
                                StringBuilder sb = new StringBuilder(strM55970);
                                C1003.m56121(sb, getPackageName());
                                strM55591 = C0845.m55591(sb);
                                if (C1017.f81942 < 0) {
                                    iM559711 = C0946.m55979("ܶܽ") ^ i12;
                                    i13 = ((iM559711 ^ i11) * (-5747)) ^ (-272646407);
                                    i3 = 298339265;
                                }
                                i15 = iM559711 ^ i3;
                                i10 = i10;
                                sArr = sArr;
                            }
                            iM559710 = (C0946.m55979("ۚ᩵") ^ i11) * (-115);
                            i13 = ((iM559710 ^ i12) * (-9175)) ^ 174093082;
                            i2 = -295279941;
                            i15 = iM559710 ^ i2;
                            strM55591 = strM55591;
                            i10 = i10;
                            sArr = sArr;
                        } else {
                            strM55591 = strM55591;
                        }
                        iM559711 = C0946.m55979("ۧܿ") ^ i11;
                        i13 = ((iM559711 ^ i12) * 19059) ^ (-1205281878);
                        i3 = 1349918794;
                        i15 = iM559711 ^ i3;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -1774710317:
                    case -1085892951:
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        if (getPackageManager().canRequestPackageInstalls()) {
                            iM55979 = C0873.m55680("۠ۘ") ^ i12;
                            i13 = ((iM55979 ^ i11) * 1843) ^ (-2117455069);
                            i = 1896840768;
                        } else {
                            iM55979 = C0946.m55979("ܺۜ") ^ i12;
                            i13 = ((iM55979 ^ i11) * 11627) ^ (-390076262);
                            i = -1623813397;
                        }
                        i15 = iM55979 ^ i;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -1747132813:
                    case -1722439197:
                        arrayList = new ArrayList(list);
                        iM559710 = C0946.m55979("۫ᩳ") ^ i11;
                        i13 = ((iM559710 ^ i12) * 15319) ^ (-1477717395);
                        i2 = 2037908679;
                        i15 = iM559710 ^ i2;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -1674101240:
                    case 1377831020:
                        i9 = 13740;
                        iM55979 = (C0873.m55680("֨ۛ") ^ i12) * (-41);
                        i13 = ((iM55979 ^ i11) * 21401) ^ (-1438590735);
                        i = -1635054702;
                        i15 = iM55979 ^ i;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -1601904009:
                    case -140339477:
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        s = sArr[292];
                        s2 = 8872;
                        if (C0927.f81875) {
                            iM55979 = (C0873.m55680("ۜܿ") ^ i12) * (-83);
                            i13 = ((iM55979 ^ i11) * (-21865)) ^ (-1595930280);
                            i = -488740154;
                        } else {
                            iM55979 = C0946.m55979("ۛ᩹") ^ i11;
                            i13 = ((iM55979 ^ i12) * (-97)) ^ (-1941210994);
                            i = 357785880;
                        }
                        i15 = iM55979 ^ i;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -1555987353:
                    case -127619151:
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        int i16 = s + s2;
                        i6 = i16 * i16;
                        i7 = s * s;
                        if (C0861.m55626()) {
                            iM55979 = (C0873.m55680("ۜܿ") ^ i12) * (-83);
                            i13 = ((iM55979 ^ i11) * (-21865)) ^ (-1595930280);
                            i = -488740154;
                        } else {
                            iM55979 = (C0873.m55680("᩸ܽ") ^ i12) * 81;
                            i13 = ((iM55979 ^ i11) * (-4223)) ^ 168003991;
                            i = 1179263481;
                        }
                        i15 = iM55979 ^ i;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -1119757019:
                    case 1146900965:
                        C1046.m56302();
                        if (C1046.m56302() != 0) {
                            strM55591 = strM55591;
                            sArr = sArr;
                            i10 = i10;
                            iM55979 = (C0873.m55680("ۜܿ") ^ i12) * (-83);
                            i13 = ((iM55979 ^ i11) * (-21865)) ^ (-1595930280);
                            i = -488740154;
                            i15 = iM55979 ^ i;
                            strM55591 = strM55591;
                            i10 = i10;
                            sArr = sArr;
                        } else {
                            strM55591 = strM55591;
                            i4 = i10;
                            iM55680 = C0946.m55979("ܳ᩻") ^ i12;
                            i13 = 1166384921 ^ ((iM55680 ^ i11) * (-18075));
                            i5 = 1841624896;
                            i15 = i5 ^ iM55680;
                            strM55591 = strM55591;
                            i10 = i4;
                        }
                        break;
                    case -993796085:
                    case 1837543687:
                        strM55591 = strM55591;
                        i4 = i10;
                        sArr = f81933;
                        if (C0898.f81858 <= 0) {
                            iM55680 = C0946.m55979("ܳ᩻") ^ i12;
                            i13 = 1166384921 ^ ((iM55680 ^ i11) * (-18075));
                            i5 = 1841624896;
                        } else {
                            iM55680 = C0873.m55680("ܰۜ") ^ i12;
                            i13 = (-1141692154) ^ ((iM55680 ^ i11) * 22929);
                            i5 = -280416186;
                        }
                        i15 = i5 ^ iM55680;
                        strM55591 = strM55591;
                        i10 = i4;
                        break;
                    case -928203296:
                    case 1288081870:
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        int i17 = i7 + i8;
                        if (i6 - (i17 + i17) <= 0) {
                            iM55979 = (C0946.m55979("ۗ֡") ^ i12) * 73;
                            i13 = ((iM55979 ^ i11) * 2573) ^ (-1080821792);
                            i = -2028460853;
                        } else {
                            iM55979 = C0946.m55979("ܳ᩹") ^ i11;
                            i13 = ((iM55979 ^ i12) * 3991) ^ 792495862;
                            i = 1710848198;
                        }
                        i15 = iM55979 ^ i;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -509188410:
                    case 1966034409:
                        if (C1017.m56187() <= 0) {
                        }
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        iM559710 = (C0946.m55979("ۚ᩵") ^ i11) * (-115);
                        i13 = ((iM559710 ^ i12) * (-9175)) ^ 174093082;
                        i2 = -295279941;
                        i15 = iM559710 ^ i2;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case -332703440:
                    case 1776608953:
                        return true;
                    case -11062218:
                    case 841569311:
                        C1017.m56187();
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        iM559710 = (C0946.m55979("ۚ᩵") ^ i11) * (-115);
                        i13 = ((iM559710 ^ i12) * (-9175)) ^ 174093082;
                        i2 = -295279941;
                        i15 = iM559710 ^ i2;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    case 153349639:
                    case 2095700259:
                        Uri uri = Uri.parse(strM55591);
                        strM55591 = strM55591;
                        short[] sArr3 = f81933;
                        if (C0854.m55595() >= 0) {
                            i4 = i10;
                            iM55680 = C0946.m55979("ܳ᩻") ^ i12;
                            i13 = 1166384921 ^ ((iM55680 ^ i11) * (-18075));
                            i5 = 1841624896;
                            i15 = i5 ^ iM55680;
                            strM55591 = strM55591;
                            i10 = i4;
                        } else {
                            i10 = i10;
                            if (C0866.f81837 < 0) {
                                this.f13403.m17868(new Intent(C1028.m56235(sArr3, 301, 43, i9), uri));
                                return false;
                            }
                            sArr = sArr;
                            strM55591 = strM55591;
                            iM559711 = C0946.m55979("ۧܿ") ^ i11;
                            i13 = ((iM559711 ^ i12) * 19059) ^ (-1205281878);
                            i3 = 1349918794;
                            i15 = iM559711 ^ i3;
                            i10 = i10;
                            sArr = sArr;
                        }
                        break;
                    case 155387004:
                    case 508814063:
                        C0861.m55626();
                        if (!C0947.f81895) {
                            strM55591 = strM55591;
                            sArr = sArr;
                            i10 = i10;
                            iM559710 = (C0946.m55979("ۚ᩵") ^ i11) * (-115);
                            i13 = ((iM559710 ^ i12) * (-9175)) ^ 174093082;
                            i2 = -295279941;
                            i15 = iM559710 ^ i2;
                            strM55591 = strM55591;
                            i10 = i10;
                            sArr = sArr;
                        } else {
                            strM55591 = strM55591;
                            i4 = i10;
                            iM55680 = C0946.m55979("ܳ᩻") ^ i12;
                            i13 = 1166384921 ^ ((iM55680 ^ i11) * (-18075));
                            i5 = 1841624896;
                            i15 = i5 ^ iM55680;
                            strM55591 = strM55591;
                            i10 = i4;
                        }
                        break;
                    case 784062068:
                    case 1326124541:
                        arrayList = null;
                        iM559710 = C0946.m55979("۫ᩳ") ^ i11;
                        i13 = ((iM559710 ^ i12) * 15319) ^ (-1477717395);
                        i2 = 2037908679;
                        i15 = iM559710 ^ i2;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                    default:
                        strM55591 = strM55591;
                        sArr = sArr;
                        i10 = i10;
                        i8 = 78712384;
                        if (C1124.f82007 >= 0) {
                            iM55979 = (C0873.m55680("ۜܿ") ^ i12) * (-83);
                            i13 = ((iM55979 ^ i11) * (-21865)) ^ (-1595930280);
                            i = -488740154;
                        } else {
                            iM55979 = C0946.m55979("ۖۢ") ^ i11;
                            i13 = ((iM55979 ^ i12) * (-32367)) ^ 1167824404;
                            i = 630933371;
                        }
                        i15 = iM55979 ^ i;
                        strM55591 = strM55591;
                        i10 = i10;
                        sArr = sArr;
                        break;
                }
            }
            iM55681 = (i11 - C0946.m55979("ۡ᩹")) * 119;
            i13 = ((iM55681 ^ i12) * (-9503)) ^ 935499201;
            i14 = -1150833185;
        }
    }

    /* JADX INFO: renamed from: ۬ */
    public final void m12275() {
        Window windowM56391 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = -657210023;
        int i5 = C0989.f81920;
        int i6 = C1044.f81959;
        int iM55680 = C0873.m55680("ܿܽ") ^ i5;
        int i7 = ((iM55680 ^ i6) * (-8415)) ^ (-1534318067);
        int i8 = 1461532532;
        while (true) {
            i4 = ((((i4 ^ i6) * 7991) >> 31) & i7) ^ (iM55680 ^ i8);
            switch (i4) {
                case -1957483135:
                case -1572926915:
                    windowM56391 = C1194.m56391(this);
                    if (C0947.f81895) {
                        iM55680 = (C0946.m55979("᩻֨") + i6) * (-109);
                        i7 = ((iM55680 ^ i5) * 28385) ^ (-977003989);
                        i8 = -62429060;
                    } else {
                        iM55680 = (C0946.m55979("ܳۜ") ^ i6) * (-119);
                        i7 = ((iM55680 ^ i5) * (-27927)) ^ (-1627289345);
                        i8 = -1175675706;
                    }
                    break;
                case -1616357023:
                case -632256074:
                    windowM56391.addFlags(i);
                    i2 = R.color.transparent;
                    if (C0882.f81846) {
                        iM55680 = C0873.m55680("ۙۜ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 26587) ^ 1887382787;
                        i8 = -28583531;
                    } else {
                        iM55680 = (C0946.m55979("᩻᩵") + i6) * (-47);
                        i7 = ((iM55680 ^ i5) * 3293) ^ 2018730968;
                        i8 = -506520544;
                    }
                    break;
                case -1451247429:
                case 392379378:
                    windowM56391.setBackgroundDrawableResource(i2);
                    z = false;
                    z = false;
                    if (C0894.f81854 >= 0) {
                        iM55680 = (i5 - C0946.m55979("ۨ᩷")) * 31;
                        i7 = ((iM55680 ^ i6) * 32251) ^ (-365289178);
                        i8 = 1917943302;
                    } else {
                        iM55680 = (i6 - C0873.m55680("᩹ۢ")) * (-17);
                        i7 = ((iM55680 ^ i5) * (-1827)) ^ 1979864723;
                        i8 = -1848799550;
                    }
                    break;
                case -1422924515:
                case 2012470627:
                    windowM56391.setNavigationBarContrastEnforced(z);
                    iM55680 = (C0946.m55979("۠۠") + i6) * (-9);
                    i7 = ((iM55680 ^ i5) * 7373) ^ 1677705090;
                    i8 = 1512676988;
                    break;
                case -1421720151:
                case 1272767345:
                    if (i3 >= 29) {
                        iM55680 = C0946.m55979("ᩳۤ") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-9501)) ^ (-654642332);
                        i8 = -2100151003;
                    } else {
                        iM55680 = (C0946.m55979("۠۠") + i6) * (-9);
                        i7 = ((iM55680 ^ i5) * 7373) ^ 1677705090;
                        i8 = 1512676988;
                    }
                    break;
                case -1335768747:
                case 1515727195:
                    windowM56391.setNavigationBarDividerColor(z ? 1 : 0);
                    iM55680 = (C0873.m55680("ۜۖ") ^ i5) * 77;
                    i7 = ((iM55680 ^ i6) * (-1139)) ^ (-2054939387);
                    i8 = 276353504;
                    break;
                case -1323441017:
                case -1015304243:
                    if (!C0917.f81868) {
                        iM55680 = (C0946.m55979("᩻֨") + i6) * (-109);
                        i7 = ((iM55680 ^ i5) * 28385) ^ (-977003989);
                        i8 = -62429060;
                    } else {
                        iM55680 = (C0946.m55979("ۢۧ") + i5) * (-117);
                        i7 = ((iM55680 ^ i6) * 10571) ^ 364373041;
                        i8 = -1153642991;
                    }
                    break;
                case -1293449987:
                case -1188161225:
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0946.m55979("ۢۧ") + i5) * (-117);
                        i7 = ((iM55680 ^ i6) * 10571) ^ 364373041;
                        i8 = -1153642991;
                    } else {
                        iM55680 = (C0873.m55680("۫᩺") + i5) * 127;
                        i7 = ((iM55680 ^ i6) * 28863) ^ 221972814;
                        i8 = -121950990;
                    }
                    break;
                case -991257426:
                case 1676102147:
                    windowM56391.setNavigationBarColor(z ? 1 : 0);
                    if (C0845.f81821 >= 0) {
                        iM55680 = (i5 - C0946.m55979("ۨ᩷")) * 31;
                        i7 = ((iM55680 ^ i6) * 32251) ^ (-365289178);
                        i8 = 1917943302;
                    } else {
                        iM55680 = (i5 - C0946.m55979("۠ۤ")) * (-3);
                        i7 = ((iM55680 ^ i6) * (-19737)) ^ 1116759963;
                        i8 = 1685748706;
                    }
                    break;
                case -825216982:
                case 425070311:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("֫ۧ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-20603)) ^ (-852963115);
                        i8 = 960906179;
                    } else {
                        iM55680 = (i6 - C0873.m55680("֨ܿ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM55680 ^ i5) * 20897) ^ (-1603058124);
                        i8 = 1411478686;
                    }
                    break;
                case -582342402:
                case -374319688:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("֫ۧ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-20603)) ^ (-852963115);
                        i8 = 960906179;
                    } else {
                        iM55680 = (C0946.m55979("᩻֨") + i6) * (-109);
                        i7 = ((iM55680 ^ i5) * 28385) ^ (-977003989);
                        i8 = -62429060;
                    }
                    break;
                case -413951406:
                case 2017272873:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("֫ۧ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-20603)) ^ (-852963115);
                        i8 = 960906179;
                    } else {
                        iM55680 = C0946.m55979("᩻ܳ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 25609) ^ (-1502179134);
                        i8 = -1861344473;
                    }
                    break;
                case -200780496:
                case 1301390181:
                    C1012.m56134();
                    iM55680 = (C0946.m55979("᩻֨") + i6) * (-109);
                    i7 = ((iM55680 ^ i5) * 28385) ^ (-977003989);
                    i8 = -62429060;
                    break;
                case -106665954:
                case 617828639:
                    if (C0917.f81868) {
                        iM55680 = (i5 - C0946.m55979("ۨ᩷")) * 31;
                        i7 = ((iM55680 ^ i6) * 32251) ^ (-365289178);
                        i8 = 1917943302;
                    } else {
                        iM55680 = C0873.m55680("ۧ᩷") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-81)) ^ (-804809752);
                        i8 = -537500860;
                    }
                    break;
                case 11036608:
                case 329126019:
                    RunnableC0897.m55784();
                    break;
                case 191485985:
                case 2000319814:
                    if (C1194.f82045 != 0) {
                        iM55680 = (i5 - C0946.m55979("ۨ᩷")) * 31;
                        i7 = ((iM55680 ^ i6) * 32251) ^ (-365289178);
                        i8 = 1917943302;
                    } else {
                        iM55680 = C0946.m55979("֫ۧ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-20603)) ^ (-852963115);
                        i8 = 960906179;
                    }
                    break;
                case 1155563429:
                case 2010384455:
                    i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 28) {
                        iM55680 = C0873.m55680("ܰܿ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 28021) ^ 446434894;
                        i8 = -771498356;
                    } else {
                        iM55680 = (C0873.m55680("ۜۖ") ^ i5) * 77;
                        i7 = ((iM55680 ^ i6) * (-1139)) ^ (-2054939387);
                        i8 = 276353504;
                    }
                    break;
                case 1295589400:
                case 1685773192:
                    i = 201326592;
                    if (C1003.m56123() != 0) {
                        iM55680 = (C0946.m55979("ۢۧ") + i5) * (-117);
                        i7 = ((iM55680 ^ i6) * 10571) ^ 364373041;
                        i8 = -1153642991;
                    } else {
                        iM55680 = C0873.m55680("᩶᩵") ^ i5;
                        i7 = ((iM55680 ^ i6) * 29705) ^ (-1475893849);
                        i8 = 1787415881;
                    }
                    break;
                case 1861041428:
                case 2012551077:
                    break;
                default:
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("֫ۘ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 8057) ^ (-1681370935);
                        i8 = -1927329741;
                    } else {
                        iM55680 = C0873.m55680("ۙۜ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 26587) ^ 1887382787;
                        i8 = -28583531;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0430 A[PHI: r14 r23 r25 r26
      0x0430: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:11:0x0085, B:105:0x042e, B:81:0x031d] A[DONT_GENERATE, DONT_INLINE]
      0x0430: PHI (r23v12 java.lang.String) = (r23v4 java.lang.String), (r23v5 java.lang.String), (r23v13 java.lang.String) binds: [B:11:0x0085, B:105:0x042e, B:81:0x031d] A[DONT_GENERATE, DONT_INLINE]
      0x0430: PHI (r25v10 java.lang.Object) = (r25v2 java.lang.Object), (r25v3 java.lang.Object), (r25v11 java.lang.Object) binds: [B:11:0x0085, B:105:0x042e, B:81:0x031d] A[DONT_GENERATE, DONT_INLINE]
      0x0430: PHI (r26v6 int) = (r26v1 int), (r26v2 int), (r26v7 int) binds: [B:11:0x0085, B:105:0x042e, B:81:0x031d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x0129  */
    /* JADX WARN: Code duplicated, block: B:97:0x03bf A[PHI: r7 r8 r10 r17 r23 r25 r26
      0x03bf: PHI (r7v4 short[]) = (r7v2 short[]), (r7v2 short[]), (r7v3 short[]), (r7v2 short[]) binds: [B:39:0x011b, B:96:0x03bd, B:70:0x0292, B:66:0x026d] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:39:0x011b, B:96:0x03bd, B:70:0x0292, B:66:0x026d] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:39:0x011b, B:96:0x03bd, B:70:0x0292, B:66:0x026d] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:39:0x011b, B:96:0x03bd, B:70:0x0292, B:66:0x026d] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r23v19 java.lang.String) = (r23v2 java.lang.String), (r23v7 java.lang.String), (r23v18 java.lang.String), (r23v20 java.lang.String) binds: [B:39:0x011b, B:96:0x03bd, B:70:0x0292, B:66:0x026d] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r25v17 java.lang.Object) = (r25v0 java.lang.Object), (r25v5 java.lang.Object), (r25v16 java.lang.Object), (r25v18 java.lang.Object) binds: [B:39:0x011b, B:96:0x03bd, B:70:0x0292, B:66:0x026d] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r26v13 int) = (r26v0 int), (r26v4 int), (r26v12 int), (r26v14 int) binds: [B:39:0x011b, B:96:0x03bd, B:70:0x0292, B:66:0x026d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC14936
    /* JADX INFO: renamed from: ֫ */
    public final void mo12256(String str) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int i6;
        int iM55682;
        int i7;
        int i8;
        int i9 = C0930.f81879;
        int i10 = ServiceConnectionC1013.f81940;
        int iM55683 = C0873.m55680("ۜۚ") ^ i10;
        int i11 = ((iM55683 ^ i9) * 9385) ^ 1305242899;
        String strM56558 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i12 = iM55683 ^ (-445600179);
        String strM56293 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i19 = -823195295;
        int i20 = 0;
        Object obj = null;
        int i21 = 0;
        while (true) {
            i19 = i12 ^ (i11 & (((i19 ^ i9) * 13011) >> 31));
            switch (i19) {
                case -1956804019:
                case -1466524041:
                    if (C1046.m56302() != 0) {
                        strM56293 = strM56293;
                        obj = obj;
                        iM55979 = (C0946.m55979("ۛ᩸") ^ i10) * (-67);
                        i = ((iM55979 ^ i9) * (-29667)) ^ (-318316);
                        i3 = 375602135;
                        i4 = iM55979 ^ i3;
                        obj = obj;
                        String str2 = strM56293;
                        i12 = i4;
                        i11 = i;
                        strM56293 = str2;
                    } else {
                        iM55682 = C0946.m55979("ᩳ᩸") ^ i10;
                        i7 = ((iM55682 ^ i9) * 28747) ^ (-1267672847);
                        i8 = 744437647;
                        i12 = iM55682 ^ i8;
                        i11 = i7;
                    }
                    break;
                case -1685458986:
                case 738853051:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i20 * i20;
                    i16 = s2 * s2;
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0946.m55979("ۛ᩸") ^ i10) * (-67);
                        i = ((iM55979 ^ i9) * (-29667)) ^ (-318316);
                        i3 = 375602135;
                    } else {
                        iM55979 = (i10 - C0946.m55979("֫ۘ")) * 27;
                        i = ((iM55979 ^ i9) * (-20621)) ^ 1605683508;
                        i3 = -1751555959;
                    }
                    i4 = iM55979 ^ i3;
                    obj = obj;
                    String str3 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str3;
                    break;
                case -1655711897:
                case -1638203623:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i15;
                    s2 = sArr[c];
                    s = 14289;
                    if (C0866.f81837 < 0) {
                        iM55680 = C0946.m55979("ܰۤ") ^ i9;
                        i = ((iM55680 ^ i10) * (-26831)) ^ 432709108;
                        i2 = 1164457446;
                        i4 = iM55680 ^ i2;
                        obj = obj;
                        i15 = i15;
                        String str4 = strM56293;
                        i12 = i4;
                        i11 = i;
                        strM56293 = str4;
                    } else {
                        strM56293 = strM56293;
                        iM55681 = (C0946.m55979("۬ۗ") ^ i9) * (-103);
                        i5 = ((iM55681 ^ i10) * 12281) ^ 1781208562;
                        i6 = 525771444;
                        i12 = iM55681 ^ i6;
                        i11 = i5;
                        obj = obj;
                        i15 = i15;
                    }
                    break;
                case -1605582831:
                case -1580636779:
                    C0947.m55997();
                    if (C1012.f81938 >= 0) {
                        iM55682 = (i9 - C0873.m55680("᩺۫")) * (-17);
                        i7 = ((iM55682 ^ i10) * (-18473)) ^ 72212548;
                        i8 = 161663217;
                    } else {
                        iM55682 = C0946.m55979("ᩳ᩸") ^ i10;
                        i7 = ((iM55682 ^ i9) * 28747) ^ (-1267672847);
                        i8 = 744437647;
                    }
                    i12 = iM55682 ^ i8;
                    i11 = i7;
                    break;
                case -1552618051:
                case 1513707737:
                    ServiceConnectionC1013.m56155(this, obj, null);
                    iM55682 = C0946.m55979("֫ܽ") ^ i9;
                    i7 = ((iM55682 ^ i10) * (-6293)) ^ (-395926966);
                    i8 = -203016443;
                    i12 = iM55682 ^ i8;
                    i11 = i7;
                    break;
                case -1546463226:
                case -1163263097:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i15;
                    c = 146;
                    if (C0890.f81849 != 0) {
                        iM55680 = C0946.m55979("ܰۙ") ^ i10;
                        i = ((iM55680 ^ i9) * (-20519)) ^ 99843791;
                        i2 = 406911676;
                    } else {
                        iM55680 = C0873.m55680("ۗ۠") ^ i10;
                        i = ((iM55680 ^ i9) * (-3433)) ^ (-1969284857);
                        i2 = 1923993728;
                    }
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str5 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str5;
                    break;
                case -1269995976:
                case 2010647736:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i15;
                    sArr = f81933;
                    if (C0992.f81922 < 0) {
                        iM55680 = (C0946.m55979("ۢ֨") ^ i10) * 71;
                        i = ((iM55680 ^ i9) * 9167) ^ 173364725;
                        i2 = 36167997;
                        i4 = iM55680 ^ i2;
                        obj = obj;
                        i15 = i15;
                        String str6 = strM56293;
                        i12 = i4;
                        i11 = i;
                        strM56293 = str6;
                    } else {
                        i15 = i15;
                        iM55979 = (C0946.m55979("ۛ᩸") ^ i10) * (-67);
                        i = ((iM55979 ^ i9) * (-29667)) ^ (-318316);
                        i3 = 375602135;
                        i4 = iM55979 ^ i3;
                        obj = obj;
                        String str7 = strM56293;
                        i12 = i4;
                        i11 = i;
                        strM56293 = str7;
                    }
                    break;
                case -1062499174:
                case 1337795818:
                    if (C0955.f81898) {
                        iM55682 = C0873.m55680("֫ܿ") ^ i10;
                        i7 = ((iM55682 ^ i9) * 16645) ^ (-1536324194);
                        i8 = 970442569;
                    } else {
                        iM55682 = (i9 - C0873.m55680("᩺۫")) * (-17);
                        i7 = ((iM55682 ^ i10) * (-18473)) ^ 72212548;
                        i8 = 161663217;
                    }
                    i12 = iM55682 ^ i8;
                    i11 = i7;
                    break;
                case -1029550025:
                case -581181439:
                case 1360744704:
                case 1753545404:
                    break;
                case -999183269:
                case 536607921:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i15;
                    sArr2 = f81933;
                    i13 = 147;
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("ܰۙ") ^ i10;
                        i = ((iM55680 ^ i9) * (-20519)) ^ 99843791;
                        i2 = 406911676;
                    } else {
                        iM55680 = C0873.m55680("ۧ۠") ^ i9;
                        i = ((iM55680 ^ i10) * (-2081)) ^ (-1118451742);
                        i2 = -772315700;
                    }
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str8 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str8;
                    break;
                case -972943568:
                case 1624649248:
                    if (RunnableC0897.f81856) {
                        iM55682 = (C0946.m55979("֨᩹") ^ i9) * (-37);
                        i7 = ((iM55682 ^ i10) * 28501) ^ 736243915;
                        i8 = -1778373590;
                    } else {
                        iM55682 = C0873.m55680("۟ۘ") ^ i9;
                        i7 = ((iM55682 ^ i10) * (-5225)) ^ (-2133351539);
                        i8 = -1896777154;
                    }
                    i12 = iM55682 ^ i8;
                    i11 = i7;
                    break;
                case -807179035:
                case 1398208356:
                    i18 = 29521;
                    iM55680 = (i9 - C0946.m55979("ۚۙ")) * (-13);
                    i = ((iM55680 ^ i10) * (-14469)) ^ (-2003967923);
                    i2 = 1679590638;
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str9 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str9;
                    break;
                case -770800259:
                case -189273499:
                    C1053.m56327();
                    C0866.m55645();
                    iM55682 = (i9 - C0873.m55680("᩺۫")) * (-17);
                    i7 = ((iM55682 ^ i10) * (-18473)) ^ 72212548;
                    i8 = 161663217;
                    i12 = iM55682 ^ i8;
                    i11 = i7;
                    break;
                case -719289139:
                case -277047447:
                    if (C0912.f81867 <= 0) {
                        obj = obj;
                        i15 = i15;
                        iM55681 = (C0946.m55979("۬ۗ") ^ i9) * (-103);
                        i5 = ((iM55681 ^ i10) * 12281) ^ 1781208562;
                        i6 = 525771444;
                        i12 = iM55681 ^ i6;
                        i11 = i5;
                        obj = obj;
                        i15 = i15;
                    } else {
                        iM55682 = (i9 - C0873.m55680("᩺۫")) * (-17);
                        i7 = ((iM55682 ^ i10) * (-18473)) ^ 72212548;
                        i8 = 161663217;
                        i12 = iM55682 ^ i8;
                        i11 = i7;
                    }
                    break;
                case -533287744:
                case -11872029:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i15;
                    i14 = 45;
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0946.m55979("ܰۙ") ^ i10;
                        i = ((iM55680 ^ i9) * (-20519)) ^ 99843791;
                        i2 = 406911676;
                    } else {
                        iM55680 = C0873.m55680("֨۠") ^ i10;
                        i = ((iM55680 ^ i9) * (-29659)) ^ 42389628;
                        i2 = -861966731;
                    }
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str10 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str10;
                    break;
                case -335430246:
                case 1428405875:
                    C0917.m55854();
                    C1028.m56247();
                    break;
                case -315559474:
                case 82508617:
                    if (C0917.f81868) {
                        iM55682 = C0946.m55979("ᩳ᩸") ^ i10;
                        i7 = ((iM55682 ^ i9) * 28747) ^ (-1267672847);
                        i8 = 744437647;
                    } else {
                        iM55682 = C0873.m55680("۟ۘ") ^ i9;
                        i7 = ((iM55682 ^ i10) * (-5225)) ^ (-2133351539);
                        i8 = -1896777154;
                    }
                    i12 = iM55682 ^ i8;
                    i11 = i7;
                    break;
                case -234469400:
                case 159875139:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i15;
                    if (C0873.m55678()) {
                        iM55680 = (C0873.m55680("ܶ᩸") + i10) * (-7);
                        i = ((iM55680 ^ i9) * 2425) ^ (-1492967836);
                        i2 = 1127447762;
                    } else {
                        iM55680 = C0873.m55680("ۛۤ") ^ i9;
                        i = ((iM55680 ^ i10) * (-15211)) ^ 1762781339;
                        i2 = 1499837991;
                    }
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str11 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str11;
                    break;
                case -85841938:
                case 788512353:
                    if (C0989.f81920 >= 0) {
                        strM56293 = strM56293;
                        obj = obj;
                        i15 = i15;
                        iM55680 = C0946.m55979("ܰۙ") ^ i10;
                        i = ((iM55680 ^ i9) * (-20519)) ^ 99843791;
                        i2 = 406911676;
                        i4 = iM55680 ^ i2;
                        obj = obj;
                        i15 = i15;
                        String str12 = strM56293;
                        i12 = i4;
                        i11 = i;
                        strM56293 = str12;
                    } else {
                        iM55682 = (i9 - C0873.m55680("᩺۫")) * (-17);
                        i7 = ((iM55682 ^ i10) * (-18473)) ^ 72212548;
                        i8 = 161663217;
                        i12 = iM55682 ^ i8;
                        i11 = i7;
                    }
                    break;
                case -61412823:
                case 1975155219:
                    i18 = 43221;
                    iM55680 = (i9 - C0946.m55979("ۚۙ")) * (-13);
                    i = ((iM55680 ^ i10) * (-14469)) ^ (-2003967923);
                    i2 = 1679590638;
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str13 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str13;
                    break;
                case 54371381:
                case 558518440:
                    try {
                        Intent intent = new Intent(strM56293);
                        StringBuilder sb = new StringBuilder(strM56558);
                        C0912.m55825(sb, str);
                        intent.setData(Uri.parse(C0863.m55639(sb)));
                        C0927.m55875(intent, i21);
                        C1044.m56284(this, intent);
                        iM55682 = C0946.m55979("֫ܽ") ^ i9;
                        i7 = ((iM55682 ^ i10) * (-6293)) ^ (-395926966);
                        i8 = -203016443;
                    } catch (Throwable th) {
                        obj = th;
                        iM55682 = (C0873.m55680("ۖᩳ") + i9) * (-99);
                        i7 = ((iM55682 ^ i10) * 7065) ^ 1573610587;
                        i8 = -1235241154;
                    }
                    i12 = iM55682 ^ i8;
                    i11 = i7;
                    break;
                case 73082468:
                case 1900966035:
                    C0955.m56025();
                    if (C1044.f81959 >= 0) {
                        strM56293 = strM56293;
                        obj = obj;
                        i15 = i15;
                        iM55680 = (C0873.m55680("ܶ᩸") + i10) * (-7);
                        i = ((iM55680 ^ i9) * 2425) ^ (-1492967836);
                        i2 = 1127447762;
                        i4 = iM55680 ^ i2;
                        obj = obj;
                        i15 = i15;
                        String str14 = strM56293;
                        i12 = i4;
                        i11 = i;
                        strM56293 = str14;
                    } else {
                        iM55682 = (C0946.m55979("֨᩹") ^ i9) * (-37);
                        i7 = ((iM55682 ^ i10) * 28501) ^ 736243915;
                        i8 = -1778373590;
                        i12 = iM55682 ^ i8;
                        i11 = i7;
                    }
                    break;
                case 247056138:
                case 1222994215:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i15;
                    int i22 = i16 + i17;
                    if ((i22 + i22) - i15 >= 0) {
                        iM55680 = C0873.m55680("ۗ᩻") ^ i10;
                        i = ((iM55680 ^ i9) * 7463) ^ (-2134491020);
                        i2 = -1722981913;
                    } else {
                        iM55680 = (C0873.m55680("֨ܿ") + i10) * 3;
                        i = ((iM55680 ^ i9) * (-28857)) ^ 1089574260;
                        i2 = -1782779023;
                    }
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str15 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str15;
                    break;
                case 296251696:
                case 1835584101:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i15;
                    strM56558 = C1929.m56558(sArr3, 192, 8, i18);
                    i21 = 268435456;
                    iM55680 = (C0873.m55680("ܽ᩹") ^ i9) * 31;
                    i = ((iM55680 ^ i10) * 3809) ^ (-1321234038);
                    i2 = -857457965;
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str16 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str16;
                    break;
                case 543698237:
                case 1578504247:
                    obj = obj;
                    i15 = i15;
                    strM56293 = C1046.m56293(sArr2, i13, i14, i18);
                    sArr3 = f81933;
                    if (C1017.m56187() <= 0) {
                        iM55681 = (C0946.m55979("۬ۗ") ^ i9) * (-103);
                        i5 = ((iM55681 ^ i10) * 12281) ^ 1781208562;
                        i6 = 525771444;
                    } else {
                        iM55681 = (C0873.m55680("᩶ۙ") + i10) * (-83);
                        i5 = ((iM55681 ^ i9) * (-18433)) ^ (-1634194166);
                        i6 = 1206356530;
                    }
                    i12 = iM55681 ^ i6;
                    i11 = i5;
                    obj = obj;
                    i15 = i15;
                    break;
                case 811544041:
                case 1678897349:
                    try {
                        Intent intent2 = new Intent(strM56293);
                        strM56293 = strM56293;
                        obj = obj;
                        try {
                            i15 = i15;
                            try {
                                intent2.setComponent(new ComponentName(C0866.m55652(f81933, 200, 20, i18), C0890.m55726(f81933, 220, 53, i18)));
                                StringBuilder sb2 = new StringBuilder(strM56558);
                                C0912.m55825(sb2, str);
                                intent2.setData(Uri.parse(C0863.m55639(sb2)));
                                C0882.m55721(intent2, i21);
                                C1044.m56284(this, intent2);
                                iM55680 = C0873.m55680("ۡ֡") ^ i10;
                                i = ((iM55680 ^ i9) * (-10001)) ^ (-25105786);
                                i2 = -2072783572;
                            } catch (Throwable unused) {
                                iM55680 = C0873.m55680("ܶ᩶") ^ i10;
                                i = ((iM55680 ^ i9) * 2159) ^ (-1278351225);
                                i2 = -271930555;
                            }
                        } catch (Throwable unused2) {
                            i15 = i15;
                            iM55680 = C0873.m55680("ܶ᩶") ^ i10;
                            i = ((iM55680 ^ i9) * 2159) ^ (-1278351225);
                            i2 = -271930555;
                            i4 = iM55680 ^ i2;
                            obj = obj;
                            i15 = i15;
                            String str17 = strM56293;
                            i12 = i4;
                            i11 = i;
                            strM56293 = str17;
                            break;
                        }
                    } catch (Throwable unused3) {
                        strM56293 = strM56293;
                        obj = obj;
                    }
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str18 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str18;
                    break;
                case 1166017641:
                case 1770701176:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i15;
                    i17 = 204175521;
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0873.m55680("ܶ᩸") + i10) * (-7);
                        i = ((iM55680 ^ i9) * 2425) ^ (-1492967836);
                        i2 = 1127447762;
                    } else {
                        iM55680 = (i9 - C0873.m55680("۟᩺")) * 119;
                        i = ((iM55680 ^ i10) * (-17223)) ^ 389377816;
                        i2 = -1222578137;
                    }
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str19 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str19;
                    break;
                default:
                    strM56293 = strM56293;
                    obj = obj;
                    i15 = i15;
                    i20 = s2 + s;
                    if (C0861.f81831) {
                        iM55680 = (C0946.m55979("ۧᩴ") + i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55680 ^ i10) * 2823) ^ 24383800;
                        i2 = 965456485;
                    } else {
                        iM55680 = C0873.m55680("ۡۛ") ^ i9;
                        i = ((iM55680 ^ i10) * (-16947)) ^ 1366165019;
                        i2 = 1609813375;
                    }
                    i4 = iM55680 ^ i2;
                    obj = obj;
                    i15 = i15;
                    String str110 = strM56293;
                    i12 = i4;
                    i11 = i;
                    strM56293 = str110;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final C1326 m12276() {
        return this.f13392;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x040a A[PHI: r5 r7 r15 r16 r21 r23 r24
      0x040a: PHI (r5v8 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:84:0x0408, B:80:0x03e3, B:76:0x03bc, B:29:0x0123, B:11:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x040a: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:84:0x0408, B:80:0x03e3, B:76:0x03bc, B:29:0x0123, B:11:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x040a: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:84:0x0408, B:80:0x03e3, B:76:0x03bc, B:29:0x0123, B:11:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x040a: PHI (r16v4 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:84:0x0408, B:80:0x03e3, B:76:0x03bc, B:29:0x0123, B:11:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x040a: PHI (r21v32 java.lang.String) = 
      (r21v5 java.lang.String)
      (r21v6 java.lang.String)
      (r21v7 java.lang.String)
      (r21v19 java.lang.String)
      (r21v35 java.lang.String)
     binds: [B:84:0x0408, B:80:0x03e3, B:76:0x03bc, B:29:0x0123, B:11:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x040a: PHI (r23v24 java.lang.String) = 
      (r23v4 java.lang.String)
      (r23v5 java.lang.String)
      (r23v6 java.lang.String)
      (r23v17 java.lang.String)
      (r23v27 java.lang.String)
     binds: [B:84:0x0408, B:80:0x03e3, B:76:0x03bc, B:29:0x0123, B:11:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x040a: PHI (r24v26 int) = (r24v4 int), (r24v5 int), (r24v6 int), (r24v16 int), (r24v29 int) binds: [B:84:0x0408, B:80:0x03e3, B:76:0x03bc, B:29:0x0123, B:11:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a5, code lost:
    
        if (p067l.C1964.m56597() != 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12257(String str, boolean z) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        String strM55750;
        String strM56310;
        int i5;
        int i6 = C0992.f81922;
        int i7 = C0989.f81920;
        int iM55680 = (i6 - C0873.m55680("۟ۙ")) * (-19);
        int i8 = ((iM55680 ^ i7) * (-24751)) ^ (-973657655);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = iM55680 ^ (-435893099);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short s2 = 0;
        int i17 = 116893318;
        short s3 = 0;
        String str2 = null;
        String str3 = null;
        int iM55878 = 0;
        while (true) {
            i17 = i9 ^ (i8 & (((i17 ^ i7) * 12379) >> 31));
            switch (i17) {
                case -2067012710:
                case 1777862737:
                    str2 = str2;
                    m12254(C0873.m55680(str2) ^ 2130170277, str3, z);
                    iM55878 = iM55878;
                    str3 = str3;
                    iM55979 = (i7 - C0946.m55979("ۧۛ")) * (-41);
                    i = ((iM55979 ^ i6) * (-29283)) ^ 1457549916;
                    i2 = -1029515163;
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case -1950396444:
                case 1947100836:
                    str2 = str2;
                    if (C0882.m55719(str3) <= 0) {
                        str3 = str3;
                        iM55878 = iM55878;
                        iM55979 = (i7 - C0946.m55979("ۧۛ")) * (-41);
                        i = ((iM55979 ^ i6) * (-29283)) ^ 1457549916;
                        i2 = -1029515163;
                        i5 = iM55979 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM55878 = iM55878;
                    } else {
                        iM559710 = C0946.m55979("ܳܳ") ^ i6;
                        str3 = str3;
                        i3 = ((iM559710 ^ i7) * (-12577)) ^ 1928070244;
                        i4 = 1263046982;
                        str2 = str2;
                        i9 = iM559710 ^ i4;
                        i8 = i3;
                        str3 = str3;
                    }
                    break;
                case -1742017923:
                case 2133623712:
                    break;
                case -1656584221:
                case -591931830:
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    sArr = f81933;
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("֫۬") ^ i7;
                        i = ((iM55979 ^ i6) * 23675) ^ 317586973;
                        i2 = -1478909380;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ܰ֡")) * (-33);
                        i = ((iM55979 ^ i7) * 16933) ^ (-138187682);
                        i2 = -1131169314;
                    }
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case -1494614314:
                case 1968875947:
                    str2 = str2;
                    sArr3 = f81933;
                    i11 = 3;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55878 = iM55878;
                        str3 = str3;
                        i10 = 276;
                        iM55979 = C0873.m55680("֫۬") ^ i7;
                        i = ((iM55979 ^ i6) * 23675) ^ 317586973;
                        i2 = -1478909380;
                        i5 = iM55979 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM55878 = iM55878;
                    } else {
                        int iM559711 = C0946.m55979("۬ᩴ") ^ i7;
                        str2 = str2;
                        i9 = iM559711 ^ (-123078081);
                        i8 = ((iM559711 ^ i6) * (-21055)) ^ (-1079412147);
                        i10 = 276;
                    }
                    break;
                case -1156065077:
                case 646493595:
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("֫۬") ^ i7;
                        i = ((iM55979 ^ i6) * 23675) ^ 317586973;
                        i2 = -1478909380;
                    } else {
                        iM55979 = (i6 - C0946.m55979("᩻ᩴ")) * 69;
                        i = ((iM55979 ^ i7) * (-20527)) ^ (-1360209239);
                        i2 = 1234735008;
                    }
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case -1001856094:
                case 112838917:
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    if (C0898.m55799(str, C1017.m56189(sArr2, i15, i16, i14))) {
                        iM55979 = (i7 - C0873.m55680("ܽܰ")) * (-99);
                        i = ((iM55979 ^ i6) * 665) ^ 1938983843;
                        i2 = 1683516338;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ۙۚ")) * (-109);
                        i = ((iM55979 ^ i7) * 3401) ^ 1781144598;
                        i2 = 825416920;
                    }
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case -991353925:
                case 79992457:
                    C1194.m56396();
                    if (C0890.f81849 != 0) {
                        iM55878 = iM55878;
                        str3 = str3;
                        str2 = str2;
                        iM55979 = C0873.m55680("֫۬") ^ i7;
                        i = ((iM55979 ^ i6) * 23675) ^ 317586973;
                        i2 = -1478909380;
                        i5 = iM55979 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM55878 = iM55878;
                    }
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    iM55979 = (C0946.m55979("᩸ۤ") ^ i6) * 99;
                    i = ((iM55979 ^ i7) * 30339) ^ 1521532995;
                    i2 = 498988216;
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case -958471324:
                case 1385945609:
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    if ((i13 + 1) - i12 > 0) {
                        iM55979 = C0946.m55979("ܶۡ") ^ i7;
                        i = ((iM55979 ^ i6) * (-4409)) ^ 1061255574;
                        i2 = 526175428;
                    } else {
                        iM55979 = C0946.m55979("ܶ۬") ^ i6;
                        i = ((iM55979 ^ i7) * 21367) ^ 547299695;
                        i2 = -1658480246;
                    }
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case -780148012:
                case 593390043:
                    C1929.m56553();
                    break;
                case -760289407:
                case 1468493510:
                    str3 = str3;
                    str2 = str2;
                    iM55878 = C0927.m55878(str) - 2;
                    if (C0906.m55809() <= 0) {
                        iM559710 = (i7 - C0873.m55680("ۤܰ")) * 31;
                        i3 = ((iM559710 ^ i6) * (-15147)) ^ 1987041;
                        i4 = -1287748817;
                    } else {
                        iM559710 = C0873.m55680("᩹ۛ") ^ i7;
                        i3 = ((iM559710 ^ i6) * 6063) ^ (-1051922785);
                        i4 = -1692698926;
                    }
                    str2 = str2;
                    i9 = iM559710 ^ i4;
                    i8 = i3;
                    str3 = str3;
                    break;
                case -475575035:
                case 731540233:
                    strM56310 = C1048.m56310(str);
                    str3 = strM56310;
                    int iM559712 = (C0946.m55979("᩸ۡ") ^ i6) * (-45);
                    iM55878 = iM55878;
                    i = ((iM559712 ^ i7) * (-28397)) ^ 907280420;
                    i5 = iM559712 ^ 1315503551;
                    str2 = str2;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case -431866157:
                case 1849333703:
                    strM56310 = C1048.m56310(C1404.m56454(str, 0, iM55878));
                    str3 = strM56310;
                    int iM559713 = (C0946.m55979("᩸ۡ") ^ i6) * (-45);
                    iM55878 = iM55878;
                    i = ((iM559713 ^ i7) * (-28397)) ^ 907280420;
                    i5 = iM559713 ^ 1315503551;
                    str2 = str2;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case -360779720:
                case 513371642:
                    i14 = 36508;
                    iM55979 = (C0946.m55979("᩵ۛ") ^ i6) * (-57);
                    i = ((iM55979 ^ i7) * 18455) ^ (-1622042664);
                    i2 = 1941898632;
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case -205171786:
                case -162369448:
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    i13 = s3 * s;
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0946.m55979("᩸ۤ") ^ i6) * 99;
                        i = ((iM55979 ^ i7) * 30339) ^ 1521532995;
                        i2 = 498988216;
                    } else {
                        iM55979 = C0946.m55979("ܺܰ") ^ i7;
                        i = ((iM55979 ^ i6) * 123) ^ 1392679814;
                        i2 = 872210117;
                    }
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case -128522516:
                case 992852838:
                    C1194.m56396();
                    if (C1025.f81947 >= 0) {
                        str3 = str3;
                        str2 = str2;
                        iM559710 = (i7 - C0873.m55680("ۤܰ")) * 31;
                        i3 = ((iM559710 ^ i6) * (-15147)) ^ 1987041;
                        i4 = -1287748817;
                        str2 = str2;
                        i9 = iM559710 ^ i4;
                        i8 = i3;
                        str3 = str3;
                    } else {
                        iM55878 = iM55878;
                        str3 = str3;
                        strM55750 = str2;
                        int iM55681 = (C0873.m55680("ܰۤ") + i6) * (-127);
                        i9 = iM55681 ^ (-854229136);
                        str2 = strM55750;
                        i8 = ((iM55681 ^ i7) * (-6373)) ^ 2039090286;
                        str3 = str3;
                        iM55878 = iM55878;
                    }
                    break;
                case -50768162:
                case 1111311635:
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    if (C0882.m55710() != 0) {
                        iM55979 = C0873.m55680("֫۬") ^ i7;
                        i = ((iM55979 ^ i6) * 23675) ^ 317586973;
                        i2 = -1478909380;
                    } else {
                        iM55979 = (C0873.m55680("֡᩶") + i7) * 95;
                        i = ((iM55979 ^ i6) * (-19199)) ^ 1024548013;
                        i2 = 1702573847;
                    }
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case 125049275:
                case 452932693:
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    int i18 = s3 + s2;
                    i12 = i18 * i18;
                    s = 2;
                    if (!C0861.f81831) {
                        iM55878 = iM55878;
                        iM559710 = (i7 - C0873.m55680("ۤܰ")) * 31;
                        i3 = ((iM559710 ^ i6) * (-15147)) ^ 1987041;
                        i4 = -1287748817;
                        str2 = str2;
                        i9 = iM559710 ^ i4;
                        i8 = i3;
                        str3 = str3;
                    } else {
                        iM55979 = C0946.m55979("ۙ᩻") ^ i6;
                        i = ((iM55979 ^ i7) * (-25335)) ^ (-270665693);
                        i2 = 468916074;
                        i5 = iM55979 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM55878 = iM55878;
                    }
                    break;
                case 227266976:
                case 2142360386:
                    strM55750 = C0892.m55750(sArr3, i10, i11, i14);
                    if (C0955.f81898) {
                        iM55878 = iM55878;
                        str3 = str3;
                        int iM55682 = (C0873.m55680("ܰۤ") + i6) * (-127);
                        i9 = iM55682 ^ (-854229136);
                        str2 = strM55750;
                        i8 = ((iM55682 ^ i7) * (-6373)) ^ 2039090286;
                        str3 = str3;
                        iM55878 = iM55878;
                    } else {
                        int iM55683 = (C0873.m55680("᩶֨") + i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((iM55683 ^ i6) * (-31679)) ^ (-1937411070);
                        i9 = iM55683 ^ (-1325075485);
                        str2 = strM55750;
                    }
                    break;
                case 449038305:
                case 1702437554:
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    if (str != null) {
                        iM55979 = (i7 - C0946.m55979("֡۫")) * (-105);
                        i = ((iM55979 ^ i6) * 31621) ^ 1155681095;
                        i2 = 265310164;
                    } else {
                        iM55979 = (i7 - C0946.m55979("ۧۛ")) * (-41);
                        i = ((iM55979 ^ i6) * (-29283)) ^ 1457549916;
                        i2 = -1029515163;
                    }
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case 472070330:
                case 1996172114:
                    C1194.m56396();
                    C1964.m56597();
                    iM55878 = iM55878;
                    str3 = str3;
                    strM55750 = str2;
                    int iM55684 = (C0873.m55680("ܰۤ") + i6) * (-127);
                    i9 = iM55684 ^ (-854229136);
                    str2 = strM55750;
                    i8 = ((iM55684 ^ i7) * (-6373)) ^ 2039090286;
                    str3 = str3;
                    iM55878 = iM55878;
                    break;
                case 1224112772:
                case 1887761932:
                    i14 = 41067;
                    iM55979 = (C0946.m55979("᩵ۛ") ^ i6) * (-57);
                    i = ((iM55979 ^ i7) * 18455) ^ (-1622042664);
                    i2 = 1941898632;
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
                case 1224966655:
                case 2066648927:
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    sArr2 = f81933;
                    i15 = 274;
                    i16 = 2;
                    if (!RunnableC0897.f81856) {
                        strM55750 = str2;
                        int iM55685 = (C0873.m55680("ܰۤ") + i6) * (-127);
                        i9 = iM55685 ^ (-854229136);
                        str2 = strM55750;
                        i8 = ((iM55685 ^ i7) * (-6373)) ^ 2039090286;
                        str3 = str3;
                        iM55878 = iM55878;
                    } else {
                        iM55979 = C0946.m55979("᩶۠") ^ i6;
                        i = ((iM55979 ^ i7) * (-7997)) ^ 1580529664;
                        i2 = 703222136;
                        i5 = iM55979 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM55878 = iM55878;
                    }
                    break;
                case 1392233994:
                case 1843707445:
                    break;
                default:
                    iM55878 = iM55878;
                    str3 = str3;
                    str2 = str2;
                    s3 = sArr[273];
                    s2 = 1;
                    if (C0967.m56074()) {
                        iM55979 = (C0946.m55979("᩷ܳ") + i6) * 33;
                        i = ((iM55979 ^ i7) * (-21481)) ^ (-1362359841);
                        i2 = -1493573243;
                    } else {
                        iM55979 = (i7 - C0946.m55979("ܿۖ")) * 31;
                        i = ((iM55979 ^ i6) * 22413) ^ 1338880062;
                        i2 = -1469552293;
                    }
                    i5 = iM55979 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM55878 = iM55878;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m12278() {
        this.f13396 = false;
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m12250() {
        this.f13391 = true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a2 A[PHI: r27
      0x03a2: PHI (r27v15 short[]) = (r27v14 short[]), (r27v16 short[]) binds: [B:99:0x038a, B:94:0x0369] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x04b6 A[PHI: r3 r6 r7 r13 r17 r29
      0x04b6: PHI (r3v4 int) = (r3v1 int), (r3v2 int), (r3v1 int), (r3v1 int) binds: [B:123:0x04b4, B:72:0x0287, B:42:0x0152, B:9:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x04b6: PHI (r6v5 l.ۡۢ) = (r6v1 l.ۡۢ), (r6v1 l.ۡۢ), (r6v3 l.ۡۢ), (r6v1 l.ۡۢ) binds: [B:123:0x04b4, B:72:0x0287, B:42:0x0152, B:9:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x04b6: PHI (r7v4 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:123:0x04b4, B:72:0x0287, B:42:0x0152, B:9:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x04b6: PHI (r13v5 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:123:0x04b4, B:72:0x0287, B:42:0x0152, B:9:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x04b6: PHI (r17v5 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:123:0x04b4, B:72:0x0287, B:42:0x0152, B:9:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x04b6: PHI (r29v48 short[]) = (r29v8 short[]), (r29v34 short[]), (r29v3 short[]), (r29v3 short[]) binds: [B:123:0x04b4, B:72:0x0287, B:42:0x0152, B:9:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x04eb A[PHI: r18 r27
      0x04eb: PHI (r18v4 char) = (r18v2 char), (r18v3 char), (r18v2 char) binds: [B:127:0x04e9, B:118:0x0494, B:25:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x04eb: PHI (r27v45 short[]) = (r27v5 short[]), (r27v7 short[]), (r27v46 short[]) binds: [B:127:0x04e9, B:118:0x0494, B:25:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01be A[PHI: r9
      0x01be: PHI (r9v3 java.lang.String) = 
      (r9v2 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
     binds: [B:54:0x01bc, B:32:0x010f, B:28:0x0105, B:20:0x00c6, B:12:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b8, code lost:
    
        if (p067l.C1404.f82149 >= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e2, code lost:
    
        if (p067l.C0906.f81862 >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010f, code lost:
    
        if (p067l.C0877.f81843 >= 0) goto L25;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.ActivityC0904, p067l.ActivityC1086, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int iM55979;
        int i;
        int i2;
        int i3;
        int iM559710;
        int i4;
        int iM559711;
        int i5;
        int iM55718 = 0;
        int iM56236 = 0;
        View viewM56085 = null;
        C1278 c1278 = null;
        int iM55797 = 0;
        View viewM56086 = null;
        String strM55717 = null;
        short s = 0;
        int i6 = -1561695980;
        int i7 = C0898.f81858;
        int i8 = C0845.f81821;
        int iM559712 = C0946.m55979("ۢ᩻") ^ i8;
        int i9 = ((iM559712 ^ i7) * (-28831)) ^ 969440835;
        int i10 = iM559712 ^ (-1773263842);
        ViewOnClickListenerC1309 viewOnClickListenerC1309 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        short s2 = 0;
        boolean z = false;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * 18403) >> 31));
            switch (i6) {
                case -2147370328:
                case -809887791:
                    C1048.m56305();
                    if (C0989.f81920 < 0) {
                        sArr2 = sArr2;
                        iM55979 = C0946.m55979("ۧ᩵") ^ i8;
                        i = ((iM55979 ^ i7) * (-22993)) ^ 1166258690;
                        i2 = 1415913451;
                        i3 = iM55979 ^ i2;
                        sArr2 = sArr2;
                        i10 = i3;
                        i9 = i;
                    }
                    iM559710 = C0873.m55680("ܳ֫") ^ i7;
                    i = ((iM559710 ^ i8) * (-12737)) ^ 945316593;
                    i4 = -1746602904;
                    i10 = iM559710 ^ i4;
                    i9 = i;
                    break;
                case -2146142671:
                case 1852140621:
                    sArr2 = sArr2;
                    i15 = 3;
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0946.m55979("ۧ᩵") ^ i8;
                        i = ((iM55979 ^ i7) * (-22993)) ^ 1166258690;
                        i2 = 1415913451;
                    } else {
                        iM55979 = C0873.m55680("ۜۚ") ^ i7;
                        i = ((iM55979 ^ i8) * 29973) ^ (-309621389);
                        i2 = 1226873376;
                    }
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -2124628927:
                case 490264593:
                    sArr2 = sArr2;
                    if (keyEvent.getAction() == 1) {
                        int iM55680 = C0873.m55680("ۛܰ") ^ i7;
                        i = ((iM55680 ^ i8) * (-27073)) ^ 1911584828;
                        i3 = iM55680 ^ (-1494252016);
                        sArr2 = sArr2;
                        z = true;
                    } else {
                        z = true;
                        iM55979 = (C0946.m55979("ۢᩴ") + i8) * (-123);
                        i = ((iM55979 ^ i7) * (-25693)) ^ 1061824534;
                        i2 = -563711765;
                        i3 = iM55979 ^ i2;
                        sArr2 = sArr2;
                    }
                    i10 = i3;
                    i9 = i;
                    break;
                case -2079581717:
                case 2146873827:
                    sArr2 = sArr2;
                    int i19 = s2 + s;
                    if ((i19 * i19) - i18 <= 0) {
                        iM55979 = C0946.m55979("ۢ۫") ^ i8;
                        i = ((iM55979 ^ i7) * 26503) ^ (-2133566998);
                        i2 = -1111618421;
                    } else {
                        iM55979 = C0873.m55680("۠ۛ") ^ i7;
                        i = ((iM55979 ^ i8) * 32039) ^ 1438253347;
                        i2 = -2039363545;
                    }
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -2017370587:
                case -1294732560:
                    sArr2 = sArr2;
                    int i20 = i16 + i17;
                    i18 = i20 + i20;
                    s = 15424;
                    if (C0967.f81910 >= 0) {
                        iM55979 = (i7 - C0946.m55979("ۜۨ")) * (-13);
                        i = ((iM55979 ^ i8) * 9055) ^ (-1326053277);
                        i2 = 1780266068;
                    } else {
                        iM55979 = C0946.m55979("۬᩵") ^ i7;
                        i = ((iM55979 ^ i8) * (-7805)) ^ 707754390;
                        i2 = 2003978018;
                    }
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1922470655:
                case 1462835637:
                    return super.dispatchKeyEvent(keyEvent);
                case -1916285625:
                case 1024634273:
                    this.f13401 = (ViewOnClickListenerC1309) viewM56086;
                    sArr2 = sArr2;
                    iM55979 = (C0946.m55979("۠۫") ^ i8) * (-21);
                    i = ((iM55979 ^ i7) * (-12405)) ^ 2090473796;
                    i2 = -747678846;
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1909780708:
                case 1649212485:
                    viewM56086 = C0989.m56085(c1278, iM55797);
                    if (viewM56086 instanceof ViewOnClickListenerC1309) {
                        iM559710 = (C0946.m55979("֫ᩴ") + i8) * (-95);
                        i = ((iM559710 ^ i7) * 4067) ^ (-906695214);
                        i4 = -1280780621;
                        i10 = iM559710 ^ i4;
                        i9 = i;
                    }
                    sArr2 = sArr2;
                    iM55979 = (C0946.m55979("۠۫") ^ i8) * (-21);
                    i = ((iM55979 ^ i7) * (-12405)) ^ 2090473796;
                    i2 = -747678846;
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1908259879:
                case 455313046:
                    iM55718 = C0882.m55718(viewOnClickListenerC1309);
                    sArr2 = f81933;
                    i14 = 6;
                    if (C0992.f81922 >= 0) {
                        iM559710 = (C0946.m55979("ᩳ᩹") + i8) * (-57);
                        i = ((iM559710 ^ i7) * (-4579)) ^ 782952069;
                        i4 = 1827381203;
                    } else {
                        iM559710 = C0946.m55979("ᩴ۟") ^ i8;
                        i = ((iM559710 ^ i7) * 7539) ^ 1735478468;
                        i4 = -1832694803;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i;
                    break;
                case -1896541164:
                case 2010317951:
                    i12 = 7294;
                    iM55979 = C0873.m55680("ۨᩳ") ^ i8;
                    i = ((iM55979 ^ i7) * (-16091)) ^ 1474267113;
                    i2 = -1737619881;
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1794863387:
                case 1092341129:
                    i12 = 11394;
                    iM55979 = C0873.m55680("ۨᩳ") ^ i8;
                    i = ((iM55979 ^ i7) * (-16091)) ^ 1474267113;
                    i2 = -1737619881;
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1794607550:
                case -1302487714:
                    sArr2 = sArr2;
                    ViewOnClickListenerC1309 viewOnClickListenerC13010 = this.f13401;
                    if (viewOnClickListenerC13010 == null) {
                        viewOnClickListenerC1309 = viewOnClickListenerC13010;
                        iM55979 = (C0946.m55979("ۢᩴ") + i8) * (-123);
                        i = ((iM55979 ^ i7) * (-25693)) ^ 1061824534;
                        i2 = -563711765;
                        i3 = iM55979 ^ i2;
                        sArr2 = sArr2;
                        i10 = i3;
                        i9 = i;
                    } else {
                        iM559711 = C0946.m55979("֡۫") ^ i8;
                        viewOnClickListenerC1309 = viewOnClickListenerC13010;
                        i9 = ((iM559711 ^ i7) * 5609) ^ 1668742494;
                        i5 = 1927801848;
                        int i21 = iM559711 ^ i5;
                        sArr2 = sArr2;
                        i10 = i21;
                    }
                    break;
                case -1790464801:
                case -1776839452:
                    c1278 = (C1278) viewM56085;
                    iM55797 = C0898.m55797(c1278) - (z ? 1 : 0);
                    if (C0906.m55809() <= 0) {
                        iM559710 = (C0946.m55979("ᩳ᩹") + i8) * (-57);
                        i = ((iM559710 ^ i7) * (-4579)) ^ 782952069;
                        i4 = 1827381203;
                    } else {
                        iM559710 = C0873.m55680("ۤۙ") ^ i7;
                        i = ((iM559710 ^ i8) * (-23279)) ^ (-656197873);
                        i4 = -2035297119;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i;
                    break;
                case -1788683859:
                case 964928687:
                    iM56236 = C1028.m56236(this.f13392) - (z ? 1 : 0);
                    iM55979 = C0873.m55680("۟᩹") ^ i8;
                    i = ((iM55979 ^ i7) * (-23983)) ^ 989183154;
                    i2 = -1575913007;
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1621092488:
                case -677926932:
                    C1012.m56134();
                    sArr2 = sArr2;
                    iM55979 = C0873.m55680("ۛۢ") ^ i8;
                    i = ((iM55979 ^ i7) * 22173) ^ (-2035796426);
                    i2 = -936418288;
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1620861637:
                case 1965621125:
                    ViewOnClickListenerC1309 viewOnClickListenerC13011 = this.f13401;
                    viewOnClickListenerC13011.onClick(viewOnClickListenerC13011);
                    sArr2 = sArr2;
                    iM55979 = (C0946.m55979("ۢᩴ") + i8) * (-123);
                    i = ((iM55979 ^ i7) * (-25693)) ^ 1061824534;
                    i2 = -563711765;
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1606997223:
                case -721494217:
                    sArr2 = sArr2;
                    sArr = f81933;
                    if (!C1024.f81946) {
                        iM55979 = (i8 - C0873.m55680("ܶܰ")) * (-37);
                        i = ((iM55979 ^ i7) * (-24329)) ^ (-1845234247);
                        i2 = -1845059353;
                        i3 = iM55979 ^ i2;
                        sArr2 = sArr2;
                        i10 = i3;
                        i9 = i;
                    } else {
                        sArr2 = sArr2;
                        iM559710 = (C0946.m55979("ᩳ᩹") + i8) * (-57);
                        i = ((iM559710 ^ i7) * (-4579)) ^ 782952069;
                        i4 = 1827381203;
                        i10 = iM559710 ^ i4;
                        i9 = i;
                    }
                    break;
                case -1574153573:
                case 1588890592:
                    if (iM56236 >= 0) {
                        iM559710 = (C0873.m55680("᩻ۧ") ^ i8) * 81;
                        i = ((iM559710 ^ i7) * (-29053)) ^ 360506108;
                        i4 = 1232200320;
                        i10 = iM559710 ^ i4;
                        i9 = i;
                    }
                    sArr2 = sArr2;
                    iM55979 = (C0946.m55979("۠۫") ^ i8) * (-21);
                    i = ((iM55979 ^ i7) * (-12405)) ^ 2090473796;
                    i2 = -747678846;
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1573329098:
                case -1176251849:
                    viewM56085 = C0989.m56085(this.f13392, iM56236);
                    if (viewM56085 instanceof C1278) {
                        iM559710 = C0946.m55979("᩹ܽ") ^ i7;
                        i = ((iM559710 ^ i8) * (-14657)) ^ 1790291426;
                        i4 = -1648324365;
                    } else {
                        iM559710 = C0946.m55979("᩵ܳ") ^ i8;
                        i = ((iM559710 ^ i7) * (-4877)) ^ 230097878;
                        i4 = 1309661005;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i;
                    break;
                case -1463749938:
                case 149000015:
                    break;
                case -1433867774:
                case -764700092:
                    C0861.m55626();
                    if (C0890.f81849 == 0) {
                        iM559710 = C0873.m55680("ܳ֫") ^ i7;
                        i = ((iM559710 ^ i8) * (-12737)) ^ 945316593;
                        i4 = -1746602904;
                    } else {
                        iM559710 = C0873.m55680("֡᩷") ^ i7;
                        i = ((iM559710 ^ i8) * C0215b.f1001d) ^ (-1737209209);
                        i4 = -1488933085;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i;
                    break;
                case -1368696211:
                case -975891941:
                    sArr2 = sArr2;
                    if (this.f13401 == null) {
                        iM55979 = (i7 - C0873.m55680("ᩴܽ")) * 5;
                        i = ((iM55979 ^ i8) * 11507) ^ 1494522770;
                        i2 = -1075763242;
                    } else {
                        iM55979 = (C0946.m55979("۠۫") ^ i8) * (-21);
                        i = ((iM55979 ^ i7) * (-12405)) ^ 2090473796;
                        i2 = -747678846;
                    }
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1361178039:
                case -1297485480:
                    iM56236--;
                    iM55979 = C0873.m55680("۟᩹") ^ i8;
                    i = ((iM55979 ^ i7) * (-23983)) ^ 989183154;
                    i2 = -1575913007;
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1346084835:
                case -1221346563:
                    break;
                case -1257676089:
                case 1112654842:
                    return z;
                case -1108077346:
                case 881500732:
                    C1003.m56123();
                    C0861.m55626();
                    return false;
                case -1017465002:
                case 1691085719:
                    sArr2 = sArr2;
                    if (this.f13391) {
                        iM55979 = C0873.m55680("ۚ۬") ^ i7;
                        i = ((iM55979 ^ i8) * (-26125)) ^ 762265505;
                        i2 = 650509128;
                    } else {
                        iM55979 = (C0873.m55680("ܺܰ") + i8) * 61;
                        i = ((iM55979 ^ i7) * 1743) ^ (-634428625);
                        i2 = -1092190276;
                    }
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -833343925:
                case 2043884903:
                    sArr2 = sArr2;
                    s2 = sArr[c];
                    i16 = s2 * s2;
                    i17 = 237899776;
                    if (C0906.m55809() <= 0) {
                        iM55979 = (C0873.m55680("ۢۢ") + i8) * 63;
                        i = ((iM55979 ^ i7) * (-24053)) ^ 2110160545;
                        i2 = 570617680;
                    } else {
                        iM55979 = (C0873.m55680("ۨۚ") + i8) * (-11);
                        i = ((iM55979 ^ i7) * 17003) ^ (-112989066);
                        i2 = -1558224572;
                    }
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -824493767:
                case 597453340:
                    sArr2 = sArr2;
                    if (iM55718 == (C0873.m55680(strM55717) ^ 2116999285)) {
                        iM55979 = C0873.m55680("۬ۤ") ^ i7;
                        i = ((iM55979 ^ i8) * (-3167)) ^ 945579877;
                        i2 = 2108433717;
                    } else {
                        iM55979 = (C0946.m55979("ۢᩴ") + i8) * (-123);
                        i = ((iM55979 ^ i7) * (-25693)) ^ 1061824534;
                        i2 = -563711765;
                    }
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -793602603:
                case 1793840780:
                    sArr2 = sArr2;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("ۛۢ") ^ i8;
                        i = ((iM55979 ^ i7) * 22173) ^ (-2035796426);
                        i2 = -936418288;
                    } else {
                        iM55979 = (C0946.m55979("ۗܳ") ^ i7) * (-119);
                        i = ((iM55979 ^ i8) * 10859) ^ 1692312603;
                        i2 = -1442160243;
                    }
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -418252176:
                case -297615892:
                    sArr2 = sArr2;
                    c = 5;
                    if (C1044.m56286() <= 0) {
                        iM55979 = C0873.m55680("ۛۢ") ^ i8;
                        i = ((iM55979 ^ i7) * 22173) ^ (-2035796426);
                        i2 = -936418288;
                    } else {
                        iM55979 = C0873.m55680("֫᩶") ^ i7;
                        i = ((iM55979 ^ i8) * (-29673)) ^ 737838132;
                        i2 = 1901590660;
                    }
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -332716517:
                case 249202277:
                    C0854.m55595();
                    if (C0892.m55749()) {
                        iM559710 = (i7 - C0946.m55979("ۨ᩶")) * (-23);
                        i = ((iM559710 ^ i8) * 24557) ^ (-1605593324);
                        i4 = -1137093790;
                    } else {
                        iM559710 = (C0946.m55979("ᩳ᩹") + i8) * (-57);
                        i = ((iM559710 ^ i7) * (-4579)) ^ 782952069;
                        i4 = 1827381203;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i;
                    break;
                case -79006560:
                case 1869355554:
                    C0861.m55626();
                    if (ViewOnClickListenerC0939.m55941() < 0) {
                        iM559710 = C0873.m55680("ܳ֫") ^ i7;
                        i = ((iM559710 ^ i8) * (-12737)) ^ 945316593;
                        i4 = -1746602904;
                    } else {
                        iM559710 = C0873.m55680("۫ۘ") ^ i8;
                        i = ((iM559710 ^ i7) * (-23155)) ^ 375800324;
                        i4 = -1194328648;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i;
                    break;
                case 486109277:
                case 1953162913:
                    strM55717 = C0882.m55717(sArr3, i13, i11, i12);
                    if (C1053.f81965 <= 0) {
                        iM559710 = C0873.m55680("ܳ֫") ^ i7;
                        i = ((iM559710 ^ i8) * (-12737)) ^ 945316593;
                        i4 = -1746602904;
                    } else {
                        iM559710 = (C0946.m55979("ۤᩳ") + i7) * (-25);
                        i = ((iM559710 ^ i8) * 17707) ^ (-1037481397);
                        i4 = -438766280;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i;
                    break;
                case 606206480:
                case 776021970:
                    sArr2 = sArr2;
                    if (keyEvent.getKeyCode() == 82) {
                        iM55979 = C0946.m55979("᩶ܺ") ^ i7;
                        i = ((iM55979 ^ i8) * 24407) ^ 1035908657;
                        i2 = -1982103539;
                    } else {
                        iM55979 = (C0873.m55680("ܺܰ") + i8) * 61;
                        i = ((iM55979 ^ i7) * 1743) ^ (-634428625);
                        i2 = -1092190276;
                    }
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case 647540172:
                case 1147813310:
                    break;
                case 1035903388:
                case 1905065179:
                    sArr3 = f81933;
                    i13 = 9;
                    i11 = 3;
                    if (C0890.f81849 == 0) {
                        iM559710 = C0946.m55979("ۨۖ") ^ i7;
                        i = ((iM559710 ^ i8) * (-28041)) ^ (-1864109993);
                        i4 = 2095988103;
                        i10 = iM559710 ^ i4;
                        i9 = i;
                    }
                    sArr2 = sArr2;
                    iM55979 = (i7 - C0946.m55979("ۜۨ")) * (-13);
                    i = ((iM55979 ^ i8) * 9055) ^ (-1326053277);
                    i2 = 1780266068;
                    i3 = iM55979 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                default:
                    short[] sArr4 = sArr2;
                    if (iM55718 == (C0946.m55979(C1194.m56386(sArr4, i14, i15, i12)) ^ 2099317168)) {
                        sArr2 = sArr4;
                        iM55979 = C0873.m55680("۬ۤ") ^ i7;
                        i = ((iM55979 ^ i8) * (-3167)) ^ 945579877;
                        i2 = 2108433717;
                        i3 = iM55979 ^ i2;
                        sArr2 = sArr2;
                        i10 = i3;
                        i9 = i;
                    } else {
                        iM559711 = (C0873.m55680("᩸ۜ") ^ i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        sArr2 = sArr4;
                        i9 = ((iM559711 ^ i7) * (-20605)) ^ (-145513156);
                        i5 = -1313591299;
                        int i22 = iM559711 ^ i5;
                        sArr2 = sArr2;
                        i10 = i22;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12259(final Throwable th, final DialogInterface.OnDismissListener onDismissListener) {
        AbstractC9381 abstractC9381M56084 = null;
        int i = -1433689341;
        int i2 = C0877.f81843;
        int i3 = C0989.f81920;
        int iM55680 = (i2 - C0873.m55680("ۡ۟")) * (-113);
        int i4 = ((iM55680 ^ i3) * (-22271)) ^ 1299338265;
        int i5 = 1395876033;
        while (true) {
            i = ((((i ^ i3) * (-23593)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2069673194:
                case -1264253369:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("ܺ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3325) ^ (-624413977);
                        i5 = 1489639945;
                    } else {
                        iM55680 = (C0873.m55680("ܽ֡") + i3) * (-75);
                        i4 = ((iM55680 ^ i2) * (-24947)) ^ 1655951245;
                        i5 = 1344199704;
                    }
                    break;
                case -2050074797:
                case -1246246722:
                    break;
                case -2020589977:
                case 343040942:
                    C0854.m55595();
                    if (!C0882.f81846) {
                        iM55680 = C0946.m55979("᩻ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11595) ^ (-1106532471);
                        i5 = 810320356;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۗܰ")) * 43;
                        i4 = ((iM55680 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    }
                    break;
                case -1869692112:
                case 792013681:
                    if (C1929.f83011 == 0) {
                        iM55680 = C0873.m55680("ܺ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3325) ^ (-624413977);
                        i5 = 1489639945;
                    } else {
                        iM55680 = C0946.m55979("᩻ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11595) ^ (-1106532471);
                        i5 = 810320356;
                    }
                    break;
                case -1627163569:
                case -155952453:
                    if (C0854.m55595() >= 0) {
                        iM55680 = C0946.m55979("᩻ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11595) ^ (-1106532471);
                        i5 = 810320356;
                    } else {
                        iM55680 = C0873.m55680("᩶ܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5219)) ^ 1958128657;
                        i5 = -907262919;
                    }
                    break;
                case -1607770263:
                case -836808815:
                    C0892.m55749();
                    iM55680 = C0946.m55979("᩻ۧ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 11595) ^ (-1106532471);
                    i5 = 810320356;
                    break;
                case -1528640858:
                case 813565275:
                    if (C0877.m55696()) {
                        iM55680 = (C0873.m55680("ۨۢ") + i3) * (-5);
                        i4 = ((iM55680 ^ i2) * 8885) ^ 959479213;
                        i5 = 1303900464;
                    } else {
                        iM55680 = C0946.m55979("֨᩹") ^ i2;
                        i4 = ((iM55680 ^ i3) * 10789) ^ 99655782;
                        i5 = -1585776451;
                    }
                    break;
                case -982687553:
                case -792187724:
                    C0912.m55833();
                    C0989.m56095();
                    break;
                case -695862636:
                case 367467409:
                    RunnableC0938.m55938();
                    if (C0873.f81841 > 0) {
                        iM55680 = (C0946.m55979("ᩴۗ") + i3) * 91;
                        i4 = ((iM55680 ^ i2) * (-4817)) ^ 153912964;
                        i5 = -1558602695;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۗܰ")) * 43;
                        i4 = ((iM55680 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    }
                    break;
                case -149646541:
                case 831240462:
                    final C22103 c22103 = (C22103) abstractC9381M56084;
                    runOnUiThread(new Runnable(this) { // from class: l.֨ܺ᩷

                        /* JADX INFO: renamed from: ܰܶᩴ, reason: not valid java name and contains not printable characters */
                        private static final short[] f81860 = {2332, 16503, -25564, 17478, -13256, -13261, -13262, -13266, -13267, -13250, -13261, -13294, -13219, -13298, -13299, -13284, -13282, -13288, -13219, -13295, -13288, -13285, -13303, -13219, -13294, -13293, -13219, -13287, -13288, -13301, -13292, -13282, -13288, -26944, 16825, 17498, -27334, 17637, -17721, -19815, 20338, -24305, -13256, -13260, -13266, -13255, -13260, -13265, -13293, -13294, -13303, -13219, -13285, -13294, -13304, -13293, -13287, -25486, -24982, -20515, -13293, -13294, -13303, -13219, -13288, -13307, -13292, -13298, -13303, 17128, -26700, 24094, 23169, 21012, -28253, -25290, -17183, 23385, -13253, -13292, -13295, -13288, -13219, -13293, -13294, -13303, -13219, -13285, -13294, -13304, -13293, -13287, -13241, -13193, 22470, -16387, 19658};

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ AbstractActivityC5549 f7170;

                        {
                            int i6 = 389449940;
                            int i7 = ViewOnClickListenerC0939.f81888;
                            int i8 = C1053.f81965;
                            int iM55979 = C0946.m55979("ܰᩳ") ^ i7;
                            int i9 = ((iM55979 ^ i8) * (-17181)) ^ (-1227650749);
                            int i10 = 407301182;
                            while (true) {
                                i6 = ((((i6 ^ i8) * (-25465)) >> 31) & i9) ^ (iM55979 ^ i10);
                                switch (i6) {
                                    case -2039567439:
                                    case 1524997906:
                                        C1404.m56468();
                                        if (C0863.f81833 <= 0) {
                                            iM55979 = (C0946.m55979("ܰ֨") ^ i7) * (-127);
                                            i9 = ((iM55979 ^ i8) * (-6179)) ^ 1122262089;
                                            i10 = -736158297;
                                        } else {
                                            iM55979 = (i8 - C0946.m55979("ۨۧ")) * (-3);
                                            i9 = ((iM55979 ^ i7) * 25005) ^ (-1521260902);
                                            i10 = 1347801141;
                                        }
                                        break;
                                    case -1987727777:
                                    case 1738361426:
                                        if (C0930.f81879 <= 0) {
                                            iM55979 = (i8 - C0946.m55979("ۨۧ")) * (-3);
                                            i9 = ((iM55979 ^ i7) * 25005) ^ (-1521260902);
                                            i10 = 1347801141;
                                        } else {
                                            iM55979 = C0946.m55979("᩷᩶") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 10109) ^ (-1104709482);
                                            i10 = 171092886;
                                        }
                                        break;
                                    case -1768159896:
                                    case 112647242:
                                        C0861.m55626();
                                        if (C0906.f81862 >= 0) {
                                            iM55979 = (i8 - C0946.m55979("ۨۧ")) * (-3);
                                            i9 = ((iM55979 ^ i7) * 25005) ^ (-1521260902);
                                            i10 = 1347801141;
                                        } else {
                                            iM55979 = (C0946.m55979("۠֫") + i8) * 37;
                                            i9 = ((iM55979 ^ i7) * (-13205)) ^ 311771126;
                                            i10 = -1152129110;
                                        }
                                        break;
                                    case -1627955145:
                                    case 1047383137:
                                        if (C1404.m56468()) {
                                            iM55979 = C0873.m55680("᩹֫") ^ i8;
                                            i9 = ((iM55979 ^ i7) * (-4217)) ^ 1864580048;
                                            i10 = -1839581410;
                                        } else {
                                            iM55979 = (C0946.m55979("ܰ֨") ^ i7) * (-127);
                                            i9 = ((iM55979 ^ i8) * (-6179)) ^ 1122262089;
                                            i10 = -736158297;
                                        }
                                        break;
                                    case -1509612444:
                                    case 1354666799:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55979 = C0946.m55979("᩷ᩴ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * (-6295)) ^ (-1199215567);
                                            i10 = 247821816;
                                        } else {
                                            iM55979 = (i7 - C0946.m55979("ۛܶ")) * 115;
                                            i9 = ((iM55979 ^ i8) * 28599) ^ (-1732591334);
                                            i10 = 756832147;
                                        }
                                        break;
                                    case -1439627907:
                                    case -311949167:
                                        if (C1025.f81947 >= 0) {
                                            iM55979 = C0946.m55979("᩷ᩴ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * (-6295)) ^ (-1199215567);
                                            i10 = 247821816;
                                        } else {
                                            iM55979 = C0873.m55680("ۤۚ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * (-31859)) ^ 567300027;
                                            i10 = -319785294;
                                        }
                                        break;
                                    case -1194127629:
                                    case 1650249885:
                                        if (C0894.m55769() >= 0) {
                                            iM55979 = C0946.m55979("᩷ᩴ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * (-6295)) ^ (-1199215567);
                                            i10 = 247821816;
                                        } else {
                                            iM55979 = C0946.m55979("ۛۛ") ^ i8;
                                            i9 = ((iM55979 ^ i7) * (-21003)) ^ 1073528863;
                                            i10 = 905959452;
                                        }
                                        break;
                                    case -530514728:
                                    case 2060774770:
                                        C0912.m55833();
                                        iM55979 = (i8 - C0946.m55979("ۨۧ")) * (-3);
                                        i9 = ((iM55979 ^ i7) * 25005) ^ (-1521260902);
                                        i10 = 1347801141;
                                        break;
                                    case -423864281:
                                    case 805020857:
                                        if (C0877.f81843 >= 0) {
                                            iM55979 = C0873.m55680("֫ۙ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * 28371) ^ (-1362987223);
                                            i10 = -1270616479;
                                        } else {
                                            iM55979 = C0946.m55979("ۚۛ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * 24311) ^ (-1823359554);
                                            i10 = 1070525445;
                                        }
                                        break;
                                    case -18102021:
                                    case 706901429:
                                        if (C1028.f81950 <= 0) {
                                            iM55979 = C0873.m55680("֫ۙ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * 28371) ^ (-1362987223);
                                            i10 = -1270616479;
                                        } else {
                                            iM55979 = (i8 - C0946.m55979("ۨۧ")) * (-3);
                                            i9 = ((iM55979 ^ i7) * 25005) ^ (-1521260902);
                                            i10 = 1347801141;
                                        }
                                        break;
                                    case 607057535:
                                    case 1810731891:
                                        if (C1964.f83032 <= 0) {
                                            iM55979 = C0946.m55979("᩷ᩴ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * (-6295)) ^ (-1199215567);
                                            i10 = 247821816;
                                        } else {
                                            iM55979 = (i8 - C0946.m55979("᩺֡")) * 127;
                                            i9 = ((iM55979 ^ i7) * (-22337)) ^ 132291988;
                                            i10 = 360085806;
                                        }
                                        break;
                                    case 770666063:
                                    case 1452269638:
                                        if (C0882.f81846) {
                                            iM55979 = C0873.m55680("֫ۙ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * 28371) ^ (-1362987223);
                                            i10 = -1270616479;
                                        } else {
                                            iM55979 = (C0946.m55979("ۖۧ") ^ i7) * 71;
                                            i9 = ((iM55979 ^ i8) * (-10081)) ^ (-654081808);
                                            i10 = 742935020;
                                        }
                                        break;
                                    case 851168176:
                                    case 1766084704:
                                        C0892.m55749();
                                        C0890.m55740();
                                        throw new RuntimeException();
                                    case 1281732938:
                                    case 1286440349:
                                        this.f7170 = this;
                                        if (C1044.f81959 >= 0) {
                                            iM55979 = C0873.m55680("֫ۙ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * 28371) ^ (-1362987223);
                                            i10 = -1270616479;
                                        } else {
                                            iM55979 = (C0873.m55680("᩷֡") + i8) * 61;
                                            i9 = ((iM55979 ^ i7) * 27927) ^ 751515858;
                                            i10 = 1465240741;
                                        }
                                        break;
                                    case 1304157320:
                                    case 2039511078:
                                        if (C0892.f81851) {
                                            iM55979 = C0873.m55680("᩸ۧ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * (-22445)) ^ (-2019540387);
                                            i10 = -576376569;
                                        } else {
                                            iM55979 = C0873.m55680("֫ۙ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * 28371) ^ (-1362987223);
                                            i10 = -1270616479;
                                        }
                                        break;
                                    default:
                                        return;
                                }
                            }
                        }

                        /*  JADX ERROR: Type inference failed
                            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35881. Try increasing type updates limit count.
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                            */
                        @Override // java.lang.Runnable
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 3588
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p067l.RunnableC3537.run():void");
                        }
                    });
                    break;
                case -26458466:
                case 1964533489:
                    if (C0861.m55626()) {
                        iM55680 = (C0946.m55979("ᩴۗ") + i3) * 91;
                        i4 = ((iM55680 ^ i2) * (-4817)) ^ 153912964;
                        i5 = -1558602695;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۤܺ")) * (-39);
                        i4 = ((iM55680 ^ i3) * (-31617)) ^ (-1167605504);
                        i5 = 1330478908;
                    }
                    break;
                case 8462064:
                case 1253317024:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۗܰ")) * 43;
                        i4 = ((iM55680 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    } else {
                        iM55680 = C0873.m55680("ۡ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 20589) ^ (-980880776);
                        i5 = 290226660;
                    }
                    break;
                case 336189519:
                case 2084946608:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("֨᩹") ^ i2;
                        i4 = ((iM55680 ^ i3) * 10789) ^ 99655782;
                        i5 = -1585776451;
                    } else {
                        iM55680 = (C0946.m55979("۫ۚ") + i2) * (-5);
                        i4 = ((iM55680 ^ i3) * 32735) ^ 814664828;
                        i5 = -1126997518;
                    }
                    break;
                case 492426515:
                case 844554075:
                    if (C0863.m55643()) {
                        iM55680 = C0873.m55680("۟ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 16601) ^ 1926046530;
                        i5 = -1104034661;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۗܰ")) * 43;
                        i4 = ((iM55680 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    }
                    break;
                case 739201694:
                case 1458311574:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0946.m55979("֨᩹") ^ i2;
                        i4 = ((iM55680 ^ i3) * 10789) ^ 99655782;
                        i5 = -1585776451;
                    } else {
                        iM55680 = C0946.m55979("۟۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 19007) ^ (-1544330170);
                        i5 = -1080682281;
                    }
                    break;
                case 778724504:
                case 2080021275:
                    abstractC9381M56084 = C0989.m56084(this);
                    if (abstractC9381M56084.mo21805() == EnumC15415.DESTROYED) {
                        iM55680 = C0946.m55979("᩺֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4623) ^ 962577752;
                        i5 = 1083582552;
                    } else {
                        iM55680 = (C0946.m55979("ܳ᩵") ^ i2) * 85;
                        i4 = ((iM55680 ^ i3) * 3941) ^ (-1891184303);
                        i5 = 1896687461;
                    }
                    break;
                case 1955651840:
                case 2123910799:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۗܰ")) * 43;
                        i4 = ((iM55680 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    } else {
                        iM55680 = (C0946.m55979("ܳܺ") ^ i2) * (-115);
                        i4 = ((iM55680 ^ i3) * (-11409)) ^ 1088210051;
                        i5 = 1042204588;
                    }
                    break;
                default:
                    if (C0873.f81841 <= 0) {
                        iM55680 = (i2 - C0946.m55979("ۗܰ")) * 43;
                        i4 = ((iM55680 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    } else {
                        iM55680 = (C0946.m55979("֨᩺") ^ i3) * 77;
                        i4 = ((iM55680 ^ i2) * (-2985)) ^ 1425351083;
                        i5 = 1163103583;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.InterfaceC14936
    /* JADX INFO: renamed from: ֫ */
    public final void mo12258(Throwable th) {
        C1044.m56272(this, th, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12265(C14784 c14784, View view, View view2, View view3, View view4, View view5) {
        int i = 566312286;
        int i2 = C0989.f81920;
        int i3 = C1071.f81975;
        int iM55979 = (C0946.m55979("ۜۜ") + i3) * 57;
        int i4 = ((iM55979 ^ i2) * (-24379)) ^ 1870911273;
        int i5 = -1231035743;
        while (true) {
            i = ((((i ^ i2) * (-5527)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1887594949:
                case -67790218:
                    if (C0989.f81920 < 0) {
                        iM55979 = (C0873.m55680("ۛᩳ") + i3) * (-73);
                        i4 = ((iM55979 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        iM55979 = C0873.m55680("ᩴۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9041)) ^ (-276382857);
                        i5 = 731083918;
                    }
                    break;
                case -1787576634:
                case 884303079:
                    if (C1024.f81946) {
                        iM55979 = (C0946.m55979("۫ۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * 12977) ^ (-1900390154);
                        i5 = -1469601899;
                    } else {
                        iM55979 = (C0946.m55979("֡᩻") + i3) * (-29);
                        i4 = ((iM55979 ^ i2) * 26931) ^ 1767489414;
                        i5 = -421296862;
                    }
                    break;
                case -1493619699:
                case 2105965355:
                    C0947.m55997();
                    if (!RunnableC0897.f81856) {
                        iM55979 = (C0946.m55979("۫ۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * 12977) ^ (-1900390154);
                        i5 = -1469601899;
                    } else {
                        iM55979 = (C0873.m55680("ۛᩳ") + i3) * (-73);
                        i4 = ((iM55979 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    }
                    break;
                case -1462047047:
                case 939442099:
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ۖۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4267) ^ (-2126978927);
                        i5 = -582050187;
                    } else {
                        iM55979 = C0946.m55979("ܽܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15437)) ^ (-45696381);
                        i5 = 240915454;
                    }
                    break;
                case -1243457988:
                case 731985195:
                    C0898.m55800();
                    C0955.m56025();
                    iM55979 = C0873.m55680("ᩴۙ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-9041)) ^ (-276382857);
                    i5 = 731083918;
                    break;
                case -995361755:
                case -558721796:
                    RunnableC1014.m56177();
                    C0946.m55980();
                    break;
                case -747183429:
                case 379230945:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0873.m55680("ۛᩳ") + i3) * (-73);
                        i4 = ((iM55979 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۬ܿ")) * 127;
                        i4 = ((iM55979 ^ i2) * 2493) ^ 1366913465;
                        i5 = 1150600723;
                    }
                    break;
                case -599717057:
                case 1723094027:
                    if (C1048.m56305() >= 0) {
                        iM55979 = (C0873.m55680("ۛᩳ") + i3) * (-73);
                        i4 = ((iM55979 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        iM55979 = C0946.m55979("ۧۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 22845) ^ 2026533693;
                        i5 = 289783207;
                    }
                    break;
                case -474924425:
                case 1448975450:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0946.m55979("ۚܶ") + i2) * 69;
                        i4 = ((iM55979 ^ i3) * (-28819)) ^ 920215349;
                        i5 = 1864786068;
                    } else {
                        iM55979 = C0946.m55979("۫ۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 10743) ^ 2009494441;
                        i5 = 694357236;
                    }
                    break;
                case -75616567:
                case 1332748031:
                    if (C0937.f81884) {
                        iM55979 = (C0873.m55680("ܳܶ") ^ i3) * 95;
                        i4 = ((iM55979 ^ i2) * 15723) ^ (-1048299537);
                        i5 = -905332037;
                    } else {
                        iM55979 = C0946.m55979("ۖۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4267) ^ (-2126978927);
                        i5 = -582050187;
                    }
                    break;
                case 468469349:
                case 1505270658:
                    if (C0877.m55696()) {
                        iM55979 = C0873.m55680("ܽ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 871) ^ (-698515243);
                        i5 = -1535912353;
                    } else {
                        iM55979 = (C0946.m55979("ۚܶ") + i2) * 69;
                        i4 = ((iM55979 ^ i3) * (-28819)) ^ 920215349;
                        i5 = 1864786068;
                    }
                    break;
                case 580034217:
                case 670391139:
                    C0863.m55643();
                    if (C1071.m56343() == 0) {
                        iM55979 = C0946.m55979("ۖۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4267) ^ (-2126978927);
                        i5 = -582050187;
                    } else {
                        iM55979 = (C0873.m55680("ۛᩳ") + i3) * (-73);
                        i4 = ((iM55979 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    }
                    break;
                case 1094712853:
                case 1598805085:
                    m12266(c14784, view, view2, view3, view4, null, null, view5, null);
                    break;
                case 1364325904:
                case 2013097548:
                    if (C0912.m55833()) {
                        iM55979 = (C0946.m55979("ۚܶ") + i2) * 69;
                        i4 = ((iM55979 ^ i3) * (-28819)) ^ 920215349;
                        i5 = 1864786068;
                    } else {
                        iM55979 = C0873.m55680("ۙ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28979) ^ 103685744;
                        i5 = 2045830178;
                    }
                    break;
                case 1968627025:
                case 2051242700:
                    if (C1194.m56396() <= 0) {
                        iM55979 = (C0873.m55680("ۛᩳ") + i3) * (-73);
                        i4 = ((iM55979 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        iM55979 = C0873.m55680("ۤۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 13481) ^ (-1306269302);
                        i5 = -1399153305;
                    }
                    break;
                default:
                    if (C1024.f81946) {
                        iM55979 = (C0873.m55680("ۛᩳ") + i3) * (-73);
                        i4 = ((iM55979 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        iM55979 = C0873.m55680("ۤ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-22537)) ^ 376635303;
                        i5 = -1551911204;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12273(String str) {
        int iM55979;
        int i;
        int iM559710;
        int i2;
        int iM55680;
        int i3;
        Object th = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 697002361;
        int i8 = C0967.f81910;
        int i9 = C1071.f81975;
        int iM55681 = C0873.m55680("ܳۗ") ^ i8;
        int i10 = ((iM55681 ^ i9) * 12205) ^ (-729879575);
        int i11 = iM55681 ^ 680403357;
        while (true) {
            Intent intent = null;
            while (true) {
                i7 = ((((i7 ^ i9) * (-6531)) >> 31) & i10) ^ i11;
                switch (i7) {
                    case -2106541712:
                    case -858177268:
                        C0890.m55740();
                        if (C1012.f81938 < 0) {
                            th = th;
                            iM559710 = C0946.m55979("۬ܽ") ^ i8;
                            i10 = ((iM559710 ^ i9) * (-13207)) ^ 1550594259;
                            i2 = 948931738;
                            i11 = iM559710 ^ i2;
                            th = th;
                        }
                        iM55680 = C0946.m55979("᩵֨") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-6371)) ^ (-1758551215);
                        i3 = -2096133633;
                        i11 = iM55680 ^ i3;
                        break;
                    case -2084535518:
                    case 1064837023:
                        try {
                            ServiceConnectionC1013.m56163(this, intent);
                            iM55680 = (C0946.m55979("᩶᩻") + i8) * 109;
                            i10 = ((iM55680 ^ i9) * (-28427)) ^ 2088365845;
                            i3 = 1775745727;
                        } catch (Throwable th2) {
                            th = th2;
                            iM55680 = (i8 - C0873.m55680("ۖ᩺")) * (-39);
                            i10 = ((iM55680 ^ i9) * (-27431)) ^ 1620746174;
                            i3 = 1756599166;
                        }
                        i11 = iM55680 ^ i3;
                        break;
                    case -1557524531:
                    case -1399528076:
                        th = th;
                        if (!RunnableC0897.f81856) {
                            iM559710 = C0946.m55979("֫ܰ") ^ i8;
                            i10 = ((iM559710 ^ i9) * 32061) ^ (-1056812096);
                            i2 = 1463546858;
                            i11 = iM559710 ^ i2;
                            th = th;
                        } else {
                            iM55979 = (i8 - C0946.m55979("ۧۙ")) * (-121);
                            i10 = ((iM55979 ^ i9) * 24949) ^ 1994179315;
                            i = -1531014986;
                            i11 = iM55979 ^ i;
                            th = th;
                        }
                        break;
                    case -1514705172:
                    case -385179210:
                        C0882.m55710();
                        break;
                    case -1477236493:
                    case -470226347:
                        th = th;
                        if (i5 - (s * s2) >= 0) {
                            iM55979 = (C0946.m55979("᩵᩵") + i9) * (-5);
                            i10 = ((iM55979 ^ i8) * (-1429)) ^ (-1504429650);
                            i = -1792293026;
                        } else {
                            iM55979 = C0873.m55680("ۢۛ") ^ i8;
                            i10 = ((iM55979 ^ i9) * 19937) ^ 539446191;
                            i = 2059643840;
                        }
                        i11 = iM55979 ^ i;
                        th = th;
                        break;
                    case -1418732930:
                    case -1295803220:
                        i6 = 2305;
                        iM55979 = C0873.m55680("ۜۖ") ^ i8;
                        i10 = ((iM55979 ^ i9) * 1897) ^ (-2083437992);
                        i = 1183932198;
                        i11 = iM55979 ^ i;
                        th = th;
                        break;
                    case -1401046666:
                    case -593523365:
                        if (C0845.m55584() <= 0) {
                            th = th;
                            iM55979 = (C0946.m55979("ۢۜ") ^ i9) * (-27);
                            i10 = ((iM55979 ^ i8) * (-14793)) ^ (-222338650);
                            i = 648015534;
                            i11 = iM55979 ^ i;
                            th = th;
                        } else {
                            iM55680 = C0946.m55979("ܳܺ") ^ i9;
                            i10 = ((iM55680 ^ i8) * 31481) ^ (-1764898421);
                            i3 = 899185908;
                            i11 = iM55680 ^ i3;
                        }
                        break;
                    case -1370949938:
                    case -852145144:
                        Uri uri = Uri.parse(str);
                        if (C1053.f81965 > 0) {
                            short[] sArr2 = f81933;
                            if (C1036.f81953 < 0) {
                                if (C1964.f83032 <= 0) {
                                    th = th;
                                    iM559710 = C0946.m55979("۬ܽ") ^ i8;
                                    i10 = ((iM559710 ^ i9) * (-13207)) ^ 1550594259;
                                    i2 = 948931738;
                                    i11 = iM559710 ^ i2;
                                    th = th;
                                    break;
                                } else {
                                    th = th;
                                    intent = new Intent(C1003.m56132(sArr2, 353, 26, i6), uri);
                                    if (C0937.f81884) {
                                        iM55979 = (C0873.m55680("֫ܿ") + i9) * (-39);
                                        i10 = ((iM55979 ^ i8) * 8997) ^ (-1039314811);
                                        i = -1437907020;
                                        i11 = iM55979 ^ i;
                                        th = th;
                                        break;
                                    }
                                }
                            }
                            iM559710 = C0946.m55979("֫ܰ") ^ i8;
                            i10 = ((iM559710 ^ i9) * 32061) ^ (-1056812096);
                            i2 = 1463546858;
                            i11 = iM559710 ^ i2;
                            th = th;
                            break;
                        }
                        th = th;
                        iM559710 = C0946.m55979("֫ܰ") ^ i8;
                        i10 = ((iM559710 ^ i9) * 32061) ^ (-1056812096);
                        i2 = 1463546858;
                        i11 = iM559710 ^ i2;
                        th = th;
                        break;
                    case -1290897888:
                    case 1858960997:
                        C0882.m55721(intent, 268435456);
                        iM55680 = (C0873.m55680("ۢܿ") + i9) * 75;
                        i10 = ((iM55680 ^ i8) * (-26513)) ^ 260134616;
                        i3 = -628463843;
                        i11 = iM55680 ^ i3;
                        break;
                    case -1288988385:
                    case 1669853825:
                        if (C0890.f81849 != 0) {
                            iM55680 = C0946.m55979("᩵֨") ^ i9;
                            i10 = ((iM55680 ^ i8) * (-6371)) ^ (-1758551215);
                            i3 = -2096133633;
                        } else {
                            iM55680 = C0946.m55979("ܳܺ") ^ i9;
                            i10 = ((iM55680 ^ i8) * 31481) ^ (-1764898421);
                            i3 = 899185908;
                        }
                        i11 = iM55680 ^ i3;
                        break;
                    case -953246703:
                    case 1733419873:
                        th = th;
                        s2 = 35274;
                        if (C1028.f81950 > 0) {
                            iM55979 = C0873.m55680("ۢ᩹") ^ i9;
                            i10 = ((iM55979 ^ i8) * (-26495)) ^ 2077401189;
                            i = -985408702;
                            i11 = iM55979 ^ i;
                            th = th;
                        } else {
                            iM559710 = C0946.m55979("۬ܽ") ^ i8;
                            i10 = ((iM559710 ^ i9) * (-13207)) ^ 1550594259;
                            i2 = 948931738;
                            i11 = iM559710 ^ i2;
                            th = th;
                        }
                        break;
                    case -759537906:
                    case 19879808:
                        C1044.m56272(this, th, null);
                        break;
                    case -643870838:
                    case 1190559003:
                        th = th;
                        i5 = i4 + 311063769;
                        if (C1929.m56553()) {
                            iM55979 = (C0946.m55979("ۢۜ") ^ i9) * (-27);
                            i10 = ((iM55979 ^ i8) * (-14793)) ^ (-222338650);
                            i = 648015534;
                        } else {
                            iM55979 = C0946.m55979("ܿۗ") ^ i8;
                            i10 = ((iM55979 ^ i9) * 21441) ^ 1090230684;
                            i = 1284158269;
                        }
                        i11 = iM55979 ^ i;
                        th = th;
                        break;
                    case -244858963:
                    case 1772609295:
                        i6 = 25956;
                        iM55979 = C0873.m55680("ۜۖ") ^ i8;
                        i10 = ((iM55979 ^ i9) * 1897) ^ (-2083437992);
                        i = 1183932198;
                        i11 = iM55979 ^ i;
                        th = th;
                        break;
                    case 321078355:
                    case 420194179:
                        C0946.m55980();
                        RunnableC1014.m56177();
                        iM55680 = C0946.m55979("᩵֨") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-6371)) ^ (-1758551215);
                        i3 = -2096133633;
                        i11 = iM55680 ^ i3;
                        break;
                    case 352327693:
                    case 2120642099:
                        th = th;
                        c = 352;
                        if (ServiceConnectionC1013.f81940 < 0) {
                            iM55979 = (C0946.m55979("ۤ᩹") ^ i8) * (-121);
                            i10 = ((iM55979 ^ i9) * 31403) ^ (-856483863);
                            i = -1856698015;
                            i11 = iM55979 ^ i;
                            th = th;
                        } else {
                            iM559710 = C0946.m55979("۬ܽ") ^ i8;
                            i10 = ((iM559710 ^ i9) * (-13207)) ^ 1550594259;
                            i2 = 948931738;
                            i11 = iM559710 ^ i2;
                            th = th;
                        }
                        break;
                    case 524709658:
                    case 813643686:
                        break;
                    case 1648990946:
                    case 1848926246:
                        th = th;
                        s = sArr[c];
                        i4 = s * s;
                        if (C0967.f81910 < 0) {
                            iM55979 = (i9 - C0946.m55979("ܳᩳ")) * (-71);
                            i10 = ((iM55979 ^ i8) * (-8497)) ^ (-1710503075);
                            i = 81529147;
                            i11 = iM55979 ^ i;
                            th = th;
                        } else {
                            iM559710 = C0946.m55979("֫ܰ") ^ i8;
                            i10 = ((iM559710 ^ i9) * 32061) ^ (-1056812096);
                            i2 = 1463546858;
                            i11 = iM559710 ^ i2;
                            th = th;
                        }
                        break;
                    default:
                        th = th;
                        sArr = f81933;
                        if (ViewOnClickListenerC0939.m55941() < 0) {
                            iM55979 = (C0873.m55680("ۧ᩸") + i9) * (-93);
                            i10 = ((iM55979 ^ i8) * (-12521)) ^ 1898041727;
                            i = -127360194;
                            i11 = iM55979 ^ i;
                            th = th;
                        } else {
                            iM559710 = C0946.m55979("۬ܽ") ^ i8;
                            i10 = ((iM559710 ^ i9) * (-13207)) ^ 1550594259;
                            i2 = 948931738;
                            i11 = iM559710 ^ i2;
                            th = th;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03f6 A[PHI: r23 r27 r29
      0x03f6: PHI (r23v7 int) = (r23v4 int), (r23v2 int), (r23v2 int) binds: [B:102:0x03f4, B:91:0x0360, B:82:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x03f6: PHI (r27v39 int) = (r27v31 int), (r27v37 int), (r27v40 int) binds: [B:102:0x03f4, B:91:0x0360, B:82:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x03f6: PHI (r29v16 java.lang.String) = (r29v11 java.lang.String), (r29v14 java.lang.String), (r29v17 java.lang.String) binds: [B:102:0x03f4, B:91:0x0360, B:82:0x0321] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0200 A[PHI: r3 r9 r15
      0x0200: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v5 int) binds: [B:172:0x0200, B:9:0x0086, B:6:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v4 java.lang.String) binds: [B:172:0x0200, B:9:0x0086, B:6:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:172:0x0200, B:9:0x0086, B:6:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
    
        if (p067l.C0955.f81898 != false) goto L25;
     */
    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context, p067l.InterfaceC14936
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startActivity(Intent intent) {
        int iM55680;
        int i;
        int i2;
        int i3;
        String str;
        int iM55979;
        int i4;
        int i5;
        int iM559710;
        int i6;
        int i7;
        int i8;
        short[] sArr;
        int i9;
        String strM55667;
        String str2;
        int i10;
        int i11;
        int iM559711;
        int i12;
        int i13;
        int iM559712;
        int i14;
        int i15;
        int i16;
        AbstractActivityC5549 abstractActivityC5549 = this;
        intent = intent;
        int i17 = C1964.f83032;
        int i18 = C0912.f81867;
        int iM55681 = C0873.m55680("֫ᩴ") ^ i18;
        int i19 = ((iM55681 ^ i17) * 27895) ^ 2022047188;
        String str3 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i20 = iM55681 ^ 1839161238;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        char c = 0;
        short s = 0;
        int i24 = 0;
        String type = null;
        int i25 = 0;
        int i26 = 0;
        int i27 = 589815200;
        boolean zM55806 = false;
        short[] sArr5 = null;
        File file = null;
        InterfaceC14770 interfaceC14770M55814 = null;
        String scheme = null;
        Uri data = null;
        Uri uri = null;
        int i28 = 0;
        while (true) {
            i27 = i20 ^ (i19 & (((i27 ^ i17) * 27179) >> 31));
            switch (i27) {
                case -2115809683:
                case -968077223:
                    C1025.m56231(interfaceC14770M55814, C1012.m56144(sArr4, i23, i28, i22), C0845.m55591(data)).commit();
                    i3 = i21;
                    str = str3;
                    iM559712 = (C0946.m55979("֫֫") ^ i17) * (-5);
                    i12 = ((iM559712 ^ i18) * 9803) ^ (-134425607);
                    i14 = -67964759;
                    i15 = iM559712 ^ i14;
                    str3 = str;
                    i10 = i3;
                    i20 = i15;
                    i19 = i12;
                    i21 = i10;
                    break;
                case -2040027222:
                case 1300412003:
                    interfaceC14770M55814 = C0906.m55814(ApplicationC21448.f67649);
                    sArr4 = f81933;
                    i23 = 134;
                    i28 = 4;
                    if (C0967.f81910 < 0) {
                        iM55680 = C0873.m55680("ۛ۟") ^ i17;
                        i = ((iM55680 ^ i18) * (-2129)) ^ 326854089;
                        i2 = -1275030550;
                        i20 = iM55680 ^ i2;
                        i19 = i;
                    } else {
                        i3 = i21;
                        str = str3;
                        i5 = i26;
                        iM559710 = (i18 - C0946.m55979("۬֡")) * 119;
                        i19 = (-2015888181) ^ ((iM559710 ^ i17) * 7151);
                        i6 = -279869984;
                        i16 = iM559710 ^ i6;
                        i26 = i5;
                        i21 = i3;
                        str3 = str;
                        i20 = i16;
                        abstractActivityC5549 = this;
                    }
                    break;
                case -2004261315:
                case 590489501:
                    if (!C0906.m55806(C0930.m55893(sArr3, i21, 4, i22), scheme)) {
                        i3 = i21;
                        str = str3;
                        i11 = i26;
                        iM559711 = C0873.m55680("ۘ֫") ^ i17;
                        i12 = ((iM559711 ^ i18) * 13883) ^ (-1838119604);
                        i13 = 1829778406;
                        i15 = iM559711 ^ i13;
                        i26 = i11;
                        str3 = str;
                        i10 = i3;
                        i20 = i15;
                        i19 = i12;
                        i21 = i10;
                    } else {
                        iM55680 = (C0946.m55979("᩻۠") ^ i18) * 31;
                        i = ((iM55680 ^ i17) * (-15257)) ^ 787509396;
                        i2 = -439084953;
                        i20 = iM55680 ^ i2;
                        i19 = i;
                    }
                    break;
                case -1910227481:
                case 1623622523:
                    i21 = i21;
                    str3 = str3;
                    sArr2 = sArr2;
                    i25 = i25;
                    i26 = i26;
                    type = type;
                    s = sArr5[c];
                    i24 = s * s;
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("ۡۤ") ^ i17;
                        i19 = 1693171428 ^ ((iM55979 ^ i18) * (-1445));
                        i4 = 396102454;
                    } else {
                        iM55979 = (C0873.m55680("ܺ᩺") ^ i17) * (-25);
                        i19 = (-1950893703) ^ ((iM55979 ^ i18) * (-6705));
                        i4 = -872478640;
                    }
                    i16 = iM55979 ^ i4;
                    i25 = i25;
                    i26 = i26;
                    type = type;
                    str3 = str3;
                    sArr2 = sArr2;
                    i21 = i21;
                    i20 = i16;
                    abstractActivityC5549 = this;
                    break;
                case -1796304623:
                case -232534197:
                    i3 = i21;
                    str = str3;
                    if (getPackageManager().canRequestPackageInstalls()) {
                        iM559712 = (i18 - C0946.m55979("᩺۠")) * 81;
                        i12 = ((iM559712 ^ i17) * (-9431)) ^ 1800965244;
                        i14 = -1933321751;
                    } else {
                        iM559712 = (i18 - C0873.m55680("۟ܺ")) * 77;
                        i12 = ((iM559712 ^ i17) * (-5067)) ^ 1715118061;
                        i14 = 533248448;
                    }
                    i15 = iM559712 ^ i14;
                    str3 = str;
                    i10 = i3;
                    i20 = i15;
                    i19 = i12;
                    i21 = i10;
                    break;
                case -1779816649:
                case -863570180:
                    C1053.m56327();
                    if (C1012.m56134() > 0) {
                        i21 = i21;
                        str3 = str3;
                        sArr2 = sArr2;
                        i25 = i25;
                        i26 = i26;
                        type = type;
                        iM55979 = (C0946.m55979("ۙܳ") + i18) * (-53);
                        i19 = 1793851306 ^ ((iM55979 ^ i17) * (-14023));
                        i4 = 352697402;
                        i16 = iM55979 ^ i4;
                        i25 = i25;
                        i26 = i26;
                        type = type;
                        str3 = str3;
                        sArr2 = sArr2;
                        i21 = i21;
                        i20 = i16;
                        abstractActivityC5549 = this;
                    } else {
                        iM55680 = C0946.m55979("ۙۢ") ^ i17;
                        i = ((iM55680 ^ i18) * 18115) ^ (-404063612);
                        i2 = 773837167;
                        i20 = iM55680 ^ i2;
                        i19 = i;
                    }
                    break;
                case -1774080517:
                case -472472032:
                    C1229.m56410();
                    break;
                case -1750777558:
                case -919773321:
                    if (C1012.f81938 < 0) {
                        iM55680 = C0946.m55979("ۙۢ") ^ i17;
                        i = ((iM55680 ^ i18) * 18115) ^ (-404063612);
                        i2 = 773837167;
                        i20 = iM55680 ^ i2;
                        i19 = i;
                    } else {
                        i3 = i21;
                        str = str3;
                        i5 = i26;
                        iM559710 = (i18 - C0946.m55979("۬֡")) * 119;
                        i19 = (-2015888181) ^ ((iM559710 ^ i17) * 7151);
                        i6 = -279869984;
                        i16 = iM559710 ^ i6;
                        i26 = i5;
                        i21 = i3;
                        str3 = str;
                        i20 = i16;
                        abstractActivityC5549 = this;
                    }
                    break;
                case -1683345096:
                case 315412058:
                    file = new File(intent.getData().getPath());
                    String str4 = C13692.f38625;
                    if (!C0892.f81851) {
                        i3 = i21;
                        str = str3;
                        iM559712 = C0946.m55979("۫᩻") ^ i18;
                        i12 = ((iM559712 ^ i17) * (-9019)) ^ 967078923;
                        i14 = 315489483;
                        i15 = iM559712 ^ i14;
                        str3 = str;
                        i10 = i3;
                        i20 = i15;
                        i19 = i12;
                        i21 = i10;
                    } else {
                        iM55680 = C0946.m55979("᩵ۛ") ^ i17;
                        i = ((iM55680 ^ i18) * 12803) ^ (-169308863);
                        i2 = -95149147;
                        i20 = iM55680 ^ i2;
                        i19 = i;
                    }
                    break;
                case -1672955005:
                case 1395834108:
                    i3 = i21;
                    str = str3;
                    if (zM55806) {
                        iM559712 = C0946.m55979("ܶܶ") ^ i18;
                        i12 = ((iM559712 ^ i17) * (-2359)) ^ 1663146866;
                        i14 = 302824428;
                        i15 = iM559712 ^ i14;
                        str3 = str;
                        i10 = i3;
                        i20 = i15;
                        i19 = i12;
                        i21 = i10;
                    }
                    i11 = i26;
                    iM559711 = C0873.m55680("ۘ֫") ^ i17;
                    i12 = ((iM559711 ^ i18) * 13883) ^ (-1838119604);
                    i13 = 1829778406;
                    i15 = iM559711 ^ i13;
                    i26 = i11;
                    str3 = str;
                    i10 = i3;
                    i20 = i15;
                    i19 = i12;
                    i21 = i10;
                    break;
                case -1642490625:
                case 1556336611:
                    i22 = 53054;
                    iM55979 = C0873.m55680("֨᩵") ^ i17;
                    i19 = 1716002857 ^ ((iM55979 ^ i18) * 13919);
                    i4 = -1659753607;
                    i16 = iM55979 ^ i4;
                    i25 = i25;
                    i26 = i26;
                    type = type;
                    str3 = str3;
                    sArr2 = sArr2;
                    i21 = i21;
                    i20 = i16;
                    abstractActivityC5549 = this;
                    break;
                case -1552098962:
                case -18201689:
                    i3 = i21;
                    str = str3;
                    i11 = i26;
                    if (i11 >= 24) {
                        iM559711 = (i18 - C0946.m55979("ܿۡ")) * (-25);
                        i12 = ((iM559711 ^ i17) * 30159) ^ (-1237630772);
                        i13 = -49311299;
                    } else {
                        iM559711 = C0873.m55680("ۘ֫") ^ i17;
                        i12 = ((iM559711 ^ i18) * 13883) ^ (-1838119604);
                        i13 = 1829778406;
                    }
                    i15 = iM559711 ^ i13;
                    i26 = i11;
                    str3 = str;
                    i10 = i3;
                    i20 = i15;
                    i19 = i12;
                    i21 = i10;
                    break;
                case -1484310436:
                case 669741099:
                    C0890.m55740();
                    if (!C0937.f81884) {
                        i3 = i21;
                        str = str3;
                        iM559712 = C0946.m55979("ۘۨ") ^ i17;
                        i12 = ((iM559712 ^ i18) * (-4003)) ^ 99365536;
                        i14 = -110810353;
                        i15 = iM559712 ^ i14;
                        str3 = str;
                        i10 = i3;
                        i20 = i15;
                        i19 = i12;
                        i21 = i10;
                    } else {
                        i21 = i21;
                        str3 = str3;
                        sArr2 = sArr2;
                        i25 = i25;
                        i26 = i26;
                        type = type;
                        iM55979 = C0873.m55680("ۡۤ") ^ i17;
                        i19 = 1693171428 ^ ((iM55979 ^ i18) * (-1445));
                        i4 = 396102454;
                        i16 = iM55979 ^ i4;
                        i25 = i25;
                        i26 = i26;
                        type = type;
                        str3 = str3;
                        sArr2 = sArr2;
                        i21 = i21;
                        i20 = i16;
                        abstractActivityC5549 = this;
                    }
                    break;
                case -1460542377:
                case 1294215544:
                    i3 = i21;
                    str = str3;
                    i5 = i26;
                    type = intent.getType();
                    sArr2 = f81933;
                    i25 = 13;
                    if (C1046.f81962 <= 0) {
                        iM559710 = (i18 - C0946.m55979("۬֡")) * 119;
                        i19 = (-2015888181) ^ ((iM559710 ^ i17) * 7151);
                        i6 = -279869984;
                    } else {
                        iM559710 = (i18 - C0946.m55979("ۧܺ")) * C0254q.f1218h;
                        i19 = (-611232107) ^ ((iM559710 ^ i17) * 1265);
                        i6 = 1149442807;
                    }
                    i16 = iM559710 ^ i6;
                    i26 = i5;
                    i21 = i3;
                    str3 = str;
                    i20 = i16;
                    abstractActivityC5549 = this;
                    break;
                case -1448390577:
                case 548986580:
                    if (C1044.f81959 < 0) {
                        iM55680 = C0873.m55680("ۛᩳ") ^ i18;
                        i = ((iM55680 ^ i17) * 7833) ^ (-221849088);
                        i2 = -464712400;
                        i20 = iM55680 ^ i2;
                        i19 = i;
                    } else {
                        i21 = i21;
                        str3 = str3;
                        sArr2 = sArr2;
                        i25 = i25;
                        i26 = i26;
                        type = type;
                        iM55979 = C0873.m55680("ۡۤ") ^ i17;
                        i19 = 1693171428 ^ ((iM55979 ^ i18) * (-1445));
                        i4 = 396102454;
                        i16 = iM55979 ^ i4;
                        i25 = i25;
                        i26 = i26;
                        type = type;
                        str3 = str3;
                        sArr2 = sArr2;
                        i21 = i21;
                        i20 = i16;
                        abstractActivityC5549 = this;
                    }
                    break;
                case -1323627377:
                case 1082566506:
                    i3 = i21;
                    str = str3;
                    int i29 = Build.VERSION.SDK_INT;
                    if (i29 >= 26) {
                        int iM559713 = C0946.m55979("ۢۤ") ^ i17;
                        i26 = i29;
                        i19 = ((iM559713 ^ i18) * (-28579)) ^ 739111067;
                        str3 = str;
                        i10 = i3;
                        i20 = iM559713 ^ 293571680;
                    } else {
                        i26 = i29;
                        iM559712 = (i18 - C0946.m55979("᩺۠")) * 81;
                        i12 = ((iM559712 ^ i17) * (-9431)) ^ 1800965244;
                        i14 = -1933321751;
                        i15 = iM559712 ^ i14;
                        str3 = str;
                        i10 = i3;
                        i20 = i15;
                        i19 = i12;
                    }
                    i21 = i10;
                    break;
                case -991167557:
                case 469503141:
                    C1053.m56327();
                    i3 = i21;
                    str = str3;
                    i5 = i26;
                    iM559710 = (i18 - C0946.m55979("۬֡")) * 119;
                    i19 = (-2015888181) ^ ((iM559710 ^ i17) * 7151);
                    i6 = -279869984;
                    i16 = iM559710 ^ i6;
                    i26 = i5;
                    i21 = i3;
                    str3 = str;
                    i20 = i16;
                    abstractActivityC5549 = this;
                    break;
                case -854725752:
                case -794414680:
                    try {
                        super.startActivity(intent);
                        iM55680 = C0873.m55680("۠֨") ^ i17;
                        i = ((iM55680 ^ i18) * 6845) ^ (-2118981185);
                        i2 = 635481202;
                    } catch (ActivityNotFoundException unused) {
                        iM55680 = C0873.m55680("ۘ۠") ^ i18;
                        i = ((iM55680 ^ i17) * 8521) ^ 1928316501;
                        i2 = 1359400646;
                    }
                    i20 = iM55680 ^ i2;
                    i19 = i;
                    break;
                case -810279360:
                case -102869422:
                    Uri uriM31097 = C13692.m31097(file.getPath());
                    intent.setDataAndType(uriM31097, str3);
                    C5065.m10798(intent, uriM31097);
                    super.startActivity(intent);
                    break;
                case -304645261:
                case 2000900613:
                    i21 = i21;
                    str3 = str3;
                    sArr2 = sArr2;
                    i25 = i25;
                    i26 = i26;
                    type = type;
                    if ((i24 + 360240400) - (37960 * s) < 0) {
                        iM55979 = C0873.m55680("ܳܿ") ^ i17;
                        i19 = 1905032236 ^ ((iM55979 ^ i18) * (-8767));
                        i4 = 975906982;
                    } else {
                        iM55979 = (C0946.m55979("ۛܽ") ^ i18) * 7;
                        i19 = 1067724661 ^ ((iM55979 ^ i17) * 30001);
                        i4 = 1151309477;
                    }
                    i16 = iM55979 ^ i4;
                    i25 = i25;
                    i26 = i26;
                    type = type;
                    str3 = str3;
                    sArr2 = sArr2;
                    i21 = i21;
                    i20 = i16;
                    abstractActivityC5549 = this;
                    break;
                case -187701733:
                case 614225601:
                    i3 = i21;
                    str = str3;
                    if (zM55806) {
                        iM559712 = C0946.m55979("᩶۫") ^ i17;
                        i12 = ((iM559712 ^ i18) * (-14755)) ^ 1403514784;
                        i14 = -943459683;
                    } else {
                        iM559712 = (i18 - C0946.m55979("᩺۠")) * 81;
                        i12 = ((iM559712 ^ i17) * (-9431)) ^ 1800965244;
                        i14 = -1933321751;
                    }
                    i15 = iM559712 ^ i14;
                    str3 = str;
                    i10 = i3;
                    i20 = i15;
                    i19 = i12;
                    i21 = i10;
                    break;
                case -156923931:
                case 268660825:
                    break;
                case 22118477:
                case 777342507:
                    i21 = i21;
                    str3 = str3;
                    sArr2 = sArr2;
                    i25 = i25;
                    i26 = i26;
                    type = type;
                    sArr5 = f81933;
                    c = '\f';
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0946.m55979("ۙܳ") + i18) * (-53);
                        i19 = 1793851306 ^ ((iM55979 ^ i17) * (-14023));
                        i4 = 352697402;
                    } else {
                        iM55979 = (C0946.m55979("ۘ᩹") + i18) * (-61);
                        i19 = 196723848 ^ ((iM55979 ^ i17) * (-14645));
                        i4 = -1196010972;
                    }
                    i16 = iM55979 ^ i4;
                    i25 = i25;
                    i26 = i26;
                    type = type;
                    str3 = str3;
                    sArr2 = sArr2;
                    i21 = i21;
                    i20 = i16;
                    abstractActivityC5549 = this;
                    break;
                case 124190006:
                case 2080994309:
                    i3 = i21;
                    str = str3;
                    abstractActivityC5549.f13388 = intent;
                    short[] sArr6 = f81933;
                    if (C1036.f81953 < 0) {
                        String strM56144 = C1012.m56144(sArr6, 79, 8, i22);
                        if (C1929.f83011 == 0) {
                            StringBuilder sb = new StringBuilder(strM56144);
                            C1003.m56121(sb, getPackageName());
                            uri = Uri.parse(C0845.m55591(sb));
                            if (C1124.f82007 < 0) {
                                iM559712 = (C0873.m55680("ᩳۗ") + i17) * (-49);
                                i12 = ((iM559712 ^ i18) * (-32527)) ^ 453888199;
                                i14 = -947067510;
                            }
                            i15 = iM559712 ^ i14;
                            str3 = str;
                            i10 = i3;
                            i20 = i15;
                            i19 = i12;
                            i21 = i10;
                        } else {
                            i5 = i26;
                            iM559710 = (i18 - C0946.m55979("۬֡")) * 119;
                            i19 = (-2015888181) ^ ((iM559710 ^ i17) * 7151);
                            i6 = -279869984;
                            i16 = iM559710 ^ i6;
                            i26 = i5;
                            i21 = i3;
                            str3 = str;
                            i20 = i16;
                            abstractActivityC5549 = this;
                        }
                        break;
                    }
                    iM559712 = C0946.m55979("۫᩻") ^ i18;
                    i12 = ((iM559712 ^ i17) * (-9019)) ^ 967078923;
                    i14 = 315489483;
                    i15 = iM559712 ^ i14;
                    str3 = str;
                    i10 = i3;
                    i20 = i15;
                    i19 = i12;
                    i21 = i10;
                    break;
                case 159354584:
                case 1813955894:
                    break;
                case 205810270:
                case 264816681:
                    i22 = 15732;
                    iM55979 = C0873.m55680("֨᩵") ^ i17;
                    i19 = 1716002857 ^ ((iM55979 ^ i18) * 13919);
                    i4 = -1659753607;
                    i16 = iM55979 ^ i4;
                    i25 = i25;
                    i26 = i26;
                    type = type;
                    str3 = str3;
                    sArr2 = sArr2;
                    i21 = i21;
                    i20 = i16;
                    abstractActivityC5549 = this;
                    break;
                case 418226533:
                case 1371965112:
                    i3 = i21;
                    str = str3;
                    if (intent.getData() != null) {
                        iM559712 = (C0946.m55979("۫ۚ") + i18) * 97;
                        i12 = ((iM559712 ^ i17) * (-31089)) ^ 187883464;
                        i14 = 2033086373;
                        i15 = iM559712 ^ i14;
                        str3 = str;
                        i10 = i3;
                        i20 = i15;
                        i19 = i12;
                        i21 = i10;
                    }
                    i11 = i26;
                    iM559711 = C0873.m55680("ۘ֫") ^ i17;
                    i12 = ((iM559711 ^ i18) * 13883) ^ (-1838119604);
                    i13 = 1829778406;
                    i15 = iM559711 ^ i13;
                    i26 = i11;
                    str3 = str;
                    i10 = i3;
                    i20 = i15;
                    i19 = i12;
                    i21 = i10;
                    break;
                case 444515721:
                case 1768000131:
                    C7741 c7741 = abstractActivityC5549.f13400;
                    i3 = i21;
                    short[] sArr7 = f81933;
                    str = str3;
                    if (C1028.m56247() >= 0) {
                        iM559712 = C0946.m55979("ۘۨ") ^ i17;
                        i12 = ((iM559712 ^ i18) * (-4003)) ^ 99365536;
                        i14 = -110810353;
                    } else {
                        c7741.m17868(new Intent(C0967.m56077(sArr7, 87, 43, i22), uri));
                        data = abstractActivityC5549.f13388.getData();
                        if (data != null) {
                            iM559712 = C0873.m55680("ᩴ۫") ^ i18;
                            i12 = ((iM559712 ^ i17) * (-2217)) ^ 1838431561;
                            i14 = 239818496;
                        } else {
                            iM559712 = (C0946.m55979("֫֫") ^ i17) * (-5);
                            i12 = ((iM559712 ^ i18) * 9803) ^ (-134425607);
                            i14 = -67964759;
                        }
                    }
                    i15 = iM559712 ^ i14;
                    str3 = str;
                    i10 = i3;
                    i20 = i15;
                    i19 = i12;
                    i21 = i10;
                    break;
                case 578802166:
                case 1277161422:
                    C0863.m55643();
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0946.m55979("ۙۢ") ^ i17;
                        i = ((iM55680 ^ i18) * 18115) ^ (-404063612);
                        i2 = 773837167;
                    } else {
                        iM55680 = C0873.m55680("ܽ֫") ^ i18;
                        i = ((iM55680 ^ i17) * (-31465)) ^ (-1867961726);
                        i2 = -1964547347;
                    }
                    i20 = iM55680 ^ i2;
                    i19 = i;
                    break;
                case 686669910:
                case 1492380886:
                    super.startActivity(intent);
                    break;
                case 716301333:
                case 2060770784:
                    i7 = i21;
                    String str5 = str3;
                    i8 = i26;
                    intent.putExtra(C1048.m56318(f81933, 52, 27, i22), true);
                    sArr = sArr2;
                    i9 = i25;
                    strM55667 = str5;
                    str2 = type;
                    int iM559714 = (C0946.m55979("᩶ܺ") + i17) * 3;
                    i25 = i9;
                    i26 = i8;
                    type = str2;
                    str3 = strM55667;
                    sArr2 = sArr;
                    i21 = i7;
                    i20 = iM559714 ^ (-516661153);
                    i19 = ((iM559714 ^ i18) * (-22687)) ^ (-65844252);
                    abstractActivityC5549 = this;
                    intent = intent;
                    break;
                case 898815201:
                case 1562521514:
                    i7 = i21;
                    i8 = i26;
                    sArr = sArr2;
                    i9 = i25;
                    strM55667 = RunnableC0871.m55667(sArr, i9, 39, i22);
                    String str6 = type;
                    zM55806 = C0906.m55806(strM55667, str6);
                    if (zM55806) {
                        int iM559715 = C0946.m55979("۬ۛ") ^ i18;
                        i25 = i9;
                        i26 = i8;
                        str3 = strM55667;
                        i19 = ((iM559715 ^ i17) * 13091) ^ 50000573;
                        abstractActivityC5549 = this;
                        sArr2 = sArr;
                        i21 = i7;
                        i20 = iM559715 ^ 1769726702;
                        type = str6;
                    } else {
                        str2 = str6;
                        int iM559716 = (C0946.m55979("᩶ܺ") + i17) * 3;
                        i25 = i9;
                        i26 = i8;
                        type = str2;
                        str3 = strM55667;
                        sArr2 = sArr;
                        i21 = i7;
                        i20 = iM559716 ^ (-516661153);
                        i19 = ((iM559716 ^ i18) * (-22687)) ^ (-65844252);
                        abstractActivityC5549 = this;
                        intent = intent;
                    }
                    break;
                case 1273671495:
                case 1359468463:
                    C0946.m55980();
                    if (C0917.f81868) {
                        iM55680 = C0946.m55979("ۤ᩹") ^ i17;
                        i = ((iM55680 ^ i18) * 27271) ^ (-711848907);
                        i2 = -1672960327;
                    } else {
                        iM55680 = C0873.m55680("ۛᩳ") ^ i18;
                        i = ((iM55680 ^ i17) * 7833) ^ (-221849088);
                        i2 = -464712400;
                    }
                    i20 = iM55680 ^ i2;
                    i19 = i;
                    break;
                case 1840525513:
                case 2119953300:
                    C1071.m56343();
                    C0894.m55769();
                    break;
                default:
                    scheme = intent.getData().getScheme();
                    sArr3 = f81933;
                    i21 = 130;
                    if (C0863.m55643()) {
                        iM55680 = C0946.m55979("ᩳ֡") ^ i17;
                        i = ((iM55680 ^ i18) * (-6891)) ^ (-2132425523);
                        i2 = -1117169328;
                    } else {
                        iM55680 = C0873.m55680("ۛᩳ") ^ i18;
                        i = ((iM55680 ^ i17) * 7833) ^ (-221849088);
                        i2 = -464712400;
                    }
                    i20 = iM55680 ^ i2;
                    i19 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۛ */
    public static String m12247() {
        WeakReference weakReference = null;
        View view = null;
        C14146 c14146M22070 = null;
        int i = 2025531194;
        int i2 = C0866.f81837;
        int i3 = ServiceConnectionC1013.f81940;
        int iM55680 = C0873.m55680("֡֫") ^ i3;
        int i4 = ((iM55680 ^ i2) * (-20371)) ^ (-1150388003);
        int i5 = -1449218280;
        while (true) {
            i = ((((i ^ i2) * 22135) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2062264275:
                case 1530887349:
                    C0882.m55710();
                    C1012.m56134();
                    return null;
                case -2056048729:
                case -868424295:
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0946.m55979("ܿۜ") + i2) * 89;
                        i4 = ((iM55680 ^ i3) * (-27301)) ^ (-52880950);
                        i5 = 1207276009;
                    } else {
                        iM55680 = (C0873.m55680("ܶ᩹") + i2) * (-39);
                        i4 = ((iM55680 ^ i3) * (-6861)) ^ (-1428678314);
                        i5 = 1226528331;
                    }
                    break;
                case -1650419767:
                case 1579877555:
                    if (view instanceof C14146) {
                        iM55680 = C0946.m55979("ۚܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17423)) ^ (-386663489);
                        i5 = -1507343497;
                    } else {
                        iM55680 = C0946.m55979("۫ܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-4913)) ^ (-1029687349);
                        i5 = 49955357;
                    }
                    break;
                case -1605282625:
                case -784686182:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0873.m55680("᩺ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11129) ^ 600474778;
                        i5 = -53057256;
                    } else {
                        iM55680 = C0873.m55680("ۡᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8957) ^ 1543257135;
                        i5 = -1574875335;
                    }
                    break;
                case -1600862224:
                case 43917465:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (i3 - C0873.m55680("ܶ֨")) * 99;
                        i4 = ((iM55680 ^ i2) * (-11587)) ^ 969661918;
                        i5 = 1314477107;
                    } else {
                        iM55680 = C0946.m55979("᩺᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26561) ^ 200670590;
                        i5 = 706852465;
                    }
                    break;
                case -1566910003:
                case 739213353:
                    view = (View) weakReference.get();
                    if (view != null) {
                        iM55680 = C0946.m55979("ۛܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5435)) ^ 1670676260;
                        i5 = -2130147067;
                    } else {
                        iM55680 = (C0873.m55680("۬۠") + i2) * (-59);
                        i4 = ((iM55680 ^ i3) * 26551) ^ (-1824805456);
                        i5 = 1349762072;
                    }
                    break;
                case -1550348710:
                case 369856760:
                    C1964.m56597();
                    C1046.m56302();
                    iM55680 = (C0873.m55680("֨ܺ") + i2) * (-15);
                    i4 = ((iM55680 ^ i3) * (-9201)) ^ (-910418557);
                    i5 = -1210302480;
                    break;
                case -1273511042:
                case -1025794165:
                    return null;
                case -1172036204:
                case -350758144:
                    if (C0917.f81868) {
                        iM55680 = (C0873.m55680("֨ܺ") + i2) * (-15);
                        i4 = ((iM55680 ^ i3) * (-9201)) ^ (-910418557);
                        i5 = -1210302480;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֨ܰ")) * (-37);
                        i4 = ((iM55680 ^ i2) * (-2433)) ^ (-197478906);
                        i5 = -421139021;
                    }
                    break;
                case -915667220:
                case 1301143640:
                    c14146M22070 = ((C9471) view).m22070();
                    if (C1964.f83032 <= 0) {
                        iM55680 = (i3 - C0873.m55680("ܶ֨")) * 99;
                        i4 = ((iM55680 ^ i2) * (-11587)) ^ 969661918;
                        i5 = 1314477107;
                    } else {
                        iM55680 = C0946.m55979("ۨۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11205)) ^ 493209400;
                        i5 = 1036880414;
                    }
                    break;
                case -731058071:
                case 1018906867:
                    if (!C0917.f81868) {
                        iM55680 = (C0873.m55680("֨ܺ") + i2) * (-15);
                        i4 = ((iM55680 ^ i3) * (-9201)) ^ (-910418557);
                        i5 = -1210302480;
                    } else {
                        iM55680 = (C0946.m55979("ۢܶ") ^ i3) * (-91);
                        i4 = ((iM55680 ^ i2) * (-19885)) ^ 1006705591;
                        i5 = 1739822510;
                    }
                    break;
                case -304999479:
                case 12798146:
                    C0906.m55809();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0946.m55979("ܿۜ") + i2) * 89;
                        i4 = ((iM55680 ^ i3) * (-27301)) ^ (-52880950);
                        i5 = 1207276009;
                    } else {
                        iM55680 = (C0873.m55680("֨ܺ") + i2) * (-15);
                        i4 = ((iM55680 ^ i3) * (-9201)) ^ (-910418557);
                        i5 = -1210302480;
                    }
                    break;
                case -301110586:
                case 1648684453:
                    if (view instanceof C9471) {
                        iM55680 = (C0946.m55979("۫ܿ") + i3) * (-37);
                        i4 = ((iM55680 ^ i2) * 8807) ^ (-1595143427);
                        i5 = 157646112;
                    } else {
                        iM55680 = (C0873.m55680("۬۠") + i2) * (-59);
                        i4 = ((iM55680 ^ i3) * 26551) ^ (-1824805456);
                        i5 = 1349762072;
                    }
                    break;
                case -184438962:
                case 187212479:
                    if (C0992.m56107() <= 0) {
                        iM55680 = (C0946.m55979("ܿۜ") + i2) * 89;
                        i4 = ((iM55680 ^ i3) * (-27301)) ^ (-52880950);
                        i5 = 1207276009;
                    } else {
                        iM55680 = C0946.m55979("ۧܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17853)) ^ 1736298944;
                        i5 = -959954535;
                    }
                    break;
                case -162051279:
                case 270717777:
                    C1048.m56305();
                    if (C1017.f81942 < 0) {
                        iM55680 = (i3 - C0873.m55680("ܶ֨")) * 99;
                        i4 = ((iM55680 ^ i2) * (-11587)) ^ 969661918;
                        i5 = 1314477107;
                    } else {
                        iM55680 = (C0946.m55979("ܿۜ") + i2) * 89;
                        i4 = ((iM55680 ^ i3) * (-27301)) ^ (-52880950);
                        i5 = 1207276009;
                    }
                    break;
                case 304504156:
                case 1803739143:
                    return c14146M22070.m32442();
                case 396023976:
                case 2030325480:
                    return ((C14146) view).m32556();
                case 454099656:
                case 648414667:
                    if (C0955.f81898) {
                        iM55680 = (i3 - C0873.m55680("ܶ֨")) * 99;
                        i4 = ((iM55680 ^ i2) * (-11587)) ^ 969661918;
                        i5 = 1314477107;
                    } else {
                        iM55680 = C0873.m55680("ܿۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12711) ^ 959558675;
                        i5 = 320820450;
                    }
                    break;
                case 708798929:
                case 995505072:
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0946.m55979("ۢܶ") ^ i3) * (-91);
                        i4 = ((iM55680 ^ i2) * (-19885)) ^ 1006705591;
                        i5 = 1739822510;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۨ᩹")) * (-87);
                        i4 = ((iM55680 ^ i3) * 17147) ^ 246950034;
                        i5 = -1067950782;
                    }
                    break;
                case 872789626:
                case 1164570178:
                    weakReference = f13386;
                    if (weakReference != null) {
                        iM55680 = (i3 - C0873.m55680("᩸ᩳ")) * (-61);
                        i4 = ((iM55680 ^ i2) * 32651) ^ 1671408336;
                        i5 = -1514416586;
                    } else {
                        iM55680 = (C0873.m55680("۬۠") + i2) * (-59);
                        i4 = ((iM55680 ^ i3) * 26551) ^ (-1824805456);
                        i5 = 1349762072;
                    }
                    break;
                case 1308595046:
                case 2097346185:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("᩺ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11129) ^ 600474778;
                        i5 = -53057256;
                    } else {
                        iM55680 = (C0946.m55979("۫᩸") + i3) * (-103);
                        i4 = ((iM55680 ^ i2) * 25557) ^ 853777319;
                        i5 = 122656613;
                    }
                    break;
                default:
                    if (C0894.m55769() >= 0) {
                        iM55680 = C0873.m55680("᩺ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11129) ^ 600474778;
                        i5 = -53057256;
                    } else {
                        iM55680 = (C0946.m55979("ܰ֡") + i3) * (-11);
                        i4 = ((iM55680 ^ i2) * 29645) ^ (-1964529019);
                        i5 = -1016529399;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    public final C1459 m12280() {
        C1459 c1459;
        C1459 c14510 = null;
        int i = -1519517302;
        int i2 = C1046.f81962;
        int i3 = RunnableC1014.f81941;
        int iM55979 = (C0946.m55979("ܳ۠") ^ i3) * 63;
        int i4 = ((iM55979 ^ i2) * (-20309)) ^ (-609096686);
        int i5 = -185681823;
        while (true) {
            i = ((((i ^ i2) * (-26511)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1277075714:
                case -330431487:
                    c1459 = this.f13405;
                    if (c1459 == null) {
                        iM55979 = (i2 - C0946.m55979("۬ᩴ")) * 93;
                        i4 = ((iM55979 ^ i3) * (-29577)) ^ (-1769052146);
                        i5 = -1963496234;
                    } else {
                        c14510 = c1459;
                        iM55979 = C0873.m55680("ۛۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28057) ^ 1901045249;
                        i5 = 457658098;
                    }
                    break;
                case -502384913:
                case 980530960:
                    RunnableC0897.m55784();
                    return null;
                case -322082247:
                case 202568213:
                    Window windowM55910 = C0937.m55910(this);
                    if (C0873.f81841 > 0 && C1124.m56367() < 0) {
                        if (!C1024.f81946) {
                            if (C1028.m56247() < 0) {
                                if (C1036.f81953 < 0) {
                                    if (C1964.f83032 > 0) {
                                        if (C0967.m56074()) {
                                            iM55979 = C0946.m55979("᩷֡") ^ i2;
                                            i4 = ((iM55979 ^ i3) * (-14667)) ^ (-1214967504);
                                            i5 = 1766346968;
                                            break;
                                        } else if (C1003.f81929 > 0 && C0949.f81897 < 0) {
                                            Window windowM55911 = C0937.m55910(this);
                                            if (RunnableC0871.f81839 < 0) {
                                                c1459 = new C1459(windowM55910, windowM55911.getDecorView());
                                                this.f13405 = c1459;
                                                c14510 = c1459;
                                                iM55979 = C0873.m55680("ۛۨ") ^ i3;
                                                i4 = ((iM55979 ^ i2) * 28057) ^ 1901045249;
                                                i5 = 457658098;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            iM55979 = C0873.m55680("ۗ֡") ^ i2;
                            i4 = ((iM55979 ^ i3) * 7573) ^ 277990307;
                            i5 = 879097366;
                            break;
                        }
                        iM55979 = C0946.m55979("ᩴܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27851)) ^ 144299641;
                        i5 = 492087008;
                        break;
                    }
                    iM55979 = (i3 - C0873.m55680("᩹ۙ")) * 25;
                    i4 = ((iM55979 ^ i2) * 20023) ^ 1409353809;
                    i5 = 1838379146;
                    break;
                case 484719292:
                case 2058180658:
                    return c14510;
                case 522990139:
                case 2050150705:
                    C1124.m56367();
                    if (!C0882.f81846) {
                        iM55979 = C0946.m55979("᩷֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14667)) ^ (-1214967504);
                        i5 = 1766346968;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩹ۙ")) * 25;
                        i4 = ((iM55979 ^ i2) * 20023) ^ 1409353809;
                        i5 = 1838379146;
                    }
                    break;
                case 690810949:
                case 1065545845:
                    C1071.m56343();
                    iM55979 = (i3 - C0873.m55680("᩹ۙ")) * 25;
                    i4 = ((iM55979 ^ i2) * 20023) ^ 1409353809;
                    i5 = 1838379146;
                    break;
                case 1655485723:
                case 1827102104:
                    C0845.m55584();
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("۠᩻") + i3) * 7;
                        i4 = ((iM55979 ^ i2) * 6431) ^ (-1248542837);
                        i5 = -1302454589;
                    } else {
                        iM55979 = C0946.m55979("᩷֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14667)) ^ (-1214967504);
                        i5 = 1766346968;
                    }
                    break;
                default:
                    if (!C0917.f81868) {
                        iM55979 = (C0873.m55680("۠᩻") + i3) * 7;
                        i4 = ((iM55979 ^ i2) * 6431) ^ (-1248542837);
                        i5 = -1302454589;
                    } else {
                        iM55979 = C0873.m55680("ۗ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * 7573) ^ 277990307;
                        i5 = 879097366;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo118() {
        C15322.m34884();
        C1478.m33218();
        recreate();
    }

    @Override // p067l.InterfaceC14936
    public final C20671 buildDialog() {
        int i = DialogInterfaceC2564.f4230;
        return new C20671(this);
    }

    /* JADX INFO: renamed from: ۠ */
    public final C2942 m12269() {
        if (this.f13397 == null) {
            synchronized (this) {
                if (this.f13397 == null) {
                    this.f13397 = new C2942(this);
                }
            }
        }
        return this.f13397;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0261 A[PHI: r4 r6
      0x0261: PHI (r4v4 android.net.Uri) = (r4v3 android.net.Uri), (r4v2 android.net.Uri), (r4v2 android.net.Uri), (r4v2 android.net.Uri) binds: [B:67:0x025f, B:58:0x01e9, B:9:0x006b, B:145:0x0261] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r6v4 l.۫ۤۡ) = (r6v3 l.۫ۤۡ), (r6v2 l.۫ۤۡ), (r6v2 l.۫ۤۡ), (r6v2 l.۫ۤۡ) binds: [B:67:0x025f, B:58:0x01e9, B:9:0x006b, B:145:0x0261] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02f7 A[PHI: r2 r5 r10 r15
      0x02f7: PHI (r2v4 l.۫ۤۡ) = (r2v3 l.۫ۤۡ), (r2v2 l.۫ۤۡ), (r2v2 l.۫ۤۡ), (r2v2 l.۫ۤۡ) binds: [B:79:0x02f5, B:9:0x006b, B:144:0x02f7, B:140:0x02f7] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:79:0x02f5, B:9:0x006b, B:144:0x02f7, B:140:0x02f7] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:79:0x02f5, B:9:0x006b, B:144:0x02f7, B:140:0x02f7] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:79:0x02f5, B:9:0x006b, B:144:0x02f7, B:140:0x02f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x033f A[PHI: r3
      0x033f: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:84:0x0326, B:75:0x02d3, B:29:0x00c5, B:142:0x033f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۫ */
    public final void m12274() {
        short s;
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int iM559711;
        int i5;
        int i6;
        AbstractActivityC5549 abstractActivityC5549 = this;
        int i7 = C0866.f81837;
        int i8 = C1017.f81942;
        int iM55680 = C0873.m55680("۟᩻") ^ i7;
        int i9 = ((iM55680 ^ i8) * (-17683)) ^ (-507249183);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM55680 ^ (-1083778042);
        int i11 = 0;
        Intent intent = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = -395080438;
        char c = 0;
        short s2 = 0;
        ActivityNotFoundException activityNotFoundException = null;
        ComponentName componentName = null;
        ComponentName componentNameM9638 = null;
        InterfaceC14100 interfaceC14100 = null;
        Uri uri = null;
        String strM56252 = null;
        InterfaceC14100 interfaceC14101 = null;
        while (true) {
            i14 = i10 ^ (i9 & (((i14 ^ i8) * (-11069)) >> 31));
            switch (i14) {
                case -2054065710:
                case 1055967548:
                    intent.setComponent(componentName);
                    iM559711 = (i7 - C0873.m55680("۬ۗ")) * 11;
                    i5 = ((iM559711 ^ i8) * 12629) ^ 1809335483;
                    i6 = 1257427205;
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    break;
                case -2007098305:
                case -918916756:
                    C1044.m56272(abstractActivityC5549, activityNotFoundException, componentName);
                    iM559710 = C0873.m55680("֫ܰ") ^ i8;
                    i3 = ((iM559710 ^ i7) * (-27431)) ^ (-1846797714);
                    i4 = 1003516926;
                    i10 = iM559710 ^ i4;
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case -1999103495:
                case 1199063305:
                    C0882.m55721(intent, 268435456);
                    C0927.m55875(intent, 1);
                    if (C1964.m56597() == 0) {
                        iM559711 = (i7 - C0946.m55979("ۗᩳ")) * 31;
                        i5 = ((iM559711 ^ i8) * (-28001)) ^ (-910229860);
                        i6 = 73470018;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                    } else {
                        int iM559712 = (C0946.m55979("᩺۫") + i7) * 109;
                        i3 = ((iM559712 ^ i8) * (-14045)) ^ 1162708724;
                        i10 = iM559712 ^ 1889107437;
                        intent = null;
                        i9 = i3;
                        abstractActivityC5549 = this;
                    }
                    break;
                case -1823838190:
                case -245153576:
                    if (C0927.f81875) {
                        iM559711 = C0946.m55979("ۘܰ") ^ i8;
                        i5 = ((iM559711 ^ i7) * 16547) ^ 547652287;
                        i6 = -324240993;
                    } else {
                        iM559711 = (C0946.m55979("ܽ᩵") ^ i7) * (-91);
                        i5 = ((iM559711 ^ i8) * 709) ^ (-1396050457);
                        i6 = -1885837589;
                    }
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    break;
                case -1744625641:
                case 1165705322:
                    interfaceC14101 = ApplicationC21448.f67649;
                    sArr2 = f81933;
                    i11 = 380;
                    if (C0845.m55584() <= 0) {
                        iM559710 = C0946.m55979("᩷ᩳ") ^ i8;
                        i3 = ((iM559710 ^ i7) * 14925) ^ (-426069006);
                        i4 = 882821780;
                    } else {
                        iM559710 = C0946.m55979("ܽۧ") ^ i8;
                        i3 = ((iM559710 ^ i7) * (-13113)) ^ (-966593438);
                        i4 = -438706706;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case -1577650346:
                case 235594987:
                    if (getPackageManager().canRequestPackageInstalls()) {
                        iM559710 = (C0946.m55979("ᩴ᩵") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i3 = ((iM559710 ^ i7) * (-16043)) ^ (-976714937);
                        i4 = -763693360;
                    } else {
                        iM559710 = (C0946.m55979("᩶ۘ") ^ i8) * 15;
                        i3 = ((iM559710 ^ i7) * 21779) ^ 1894855319;
                        i4 = 409989162;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case -1516784256:
                case 1669507843:
                    ViewOnClickListenerC0939.m55941();
                    if (ServiceConnectionC1013.m56157() > 0) {
                        iM559710 = C0946.m55979("᩷ᩳ") ^ i8;
                        i3 = ((iM559710 ^ i7) * 14925) ^ (-426069006);
                        i4 = 882821780;
                        i10 = iM559710 ^ i4;
                    } else {
                        int iM559713 = (C0946.m55979("᩺۫") + i7) * 109;
                        i3 = ((iM559713 ^ i8) * (-14045)) ^ 1162708724;
                        i10 = iM559713 ^ 1889107437;
                        intent = null;
                    }
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case -1362029341:
                case 295592634:
                    if (Build.VERSION.SDK_INT >= 26) {
                        iM559710 = (i7 - C0873.m55680("֫ۤ")) * 31;
                        i3 = ((iM559710 ^ i8) * 12231) ^ (-460405703);
                        i4 = 1078595004;
                    } else {
                        iM559710 = C0873.m55680("֫ܰ") ^ i8;
                        i3 = ((iM559710 ^ i7) * (-27431)) ^ (-1846797714);
                        i4 = 1003516926;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case -1346205487:
                case -1289342204:
                    s2 = sArr[c];
                    i12 = s2 * s2;
                    if (C0890.f81849 != 0) {
                        iM559710 = C0873.m55680("۫᩷") ^ i8;
                        i3 = ((iM559710 ^ i7) * 13467) ^ 674608927;
                        i4 = -140037570;
                    } else {
                        iM559710 = C0946.m55979("᩸᩸") ^ i7;
                        i3 = ((iM559710 ^ i8) * (-21835)) ^ (-883649607);
                        i4 = -824507689;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case -1330482819:
                case 1942503164:
                    uri = Uri.parse(C0890.m55734(ApplicationC21448.f67649, strM56252, ""));
                    interfaceC14100 = ApplicationC21448.f67649;
                    if (C0854.f81826 != 0) {
                        int iM559714 = (C0946.m55979("᩺۫") + i7) * 109;
                        i3 = ((iM559714 ^ i8) * (-14045)) ^ 1162708724;
                        i10 = iM559714 ^ 1889107437;
                        intent = null;
                    } else {
                        iM559710 = (C0946.m55979("۠᩹") ^ i8) * (-119);
                        i3 = ((iM559710 ^ i7) * 20431) ^ 1125319093;
                        i4 = -1380571760;
                        i10 = iM559710 ^ i4;
                    }
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case -1327970141:
                case -1269716469:
                    i13 = 46465;
                    iM559710 = C0873.m55680("ۢۘ") ^ i7;
                    i3 = ((iM559710 ^ i8) * 10913) ^ 913317254;
                    i4 = 1911725782;
                    i10 = iM559710 ^ i4;
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case -1276040502:
                case 566880460:
                    C0937.m55918();
                    C0912.m55833();
                    iM559711 = C0946.m55979("ۘܰ") ^ i8;
                    i5 = ((iM559711 ^ i7) * 16547) ^ 547652287;
                    i6 = -324240993;
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    break;
                case -1238639479:
                case 1615160697:
                    s = s2;
                    sArr = f81933;
                    c = 379;
                    if (!C0861.f81831) {
                        s2 = s;
                        iM559710 = C0873.m55680("۫᩷") ^ i8;
                        i3 = ((iM559710 ^ i7) * 13467) ^ 674608927;
                        i4 = -140037570;
                        i10 = iM559710 ^ i4;
                        i9 = i3;
                        abstractActivityC5549 = this;
                    } else {
                        iM55979 = C0946.m55979("ۨ۫") ^ i8;
                        i = ((iM55979 ^ i7) * 12293) ^ 1585856423;
                        i2 = 2122013080;
                        i10 = iM55979 ^ i2;
                        s2 = s;
                        i9 = i;
                        abstractActivityC5549 = this;
                    }
                    break;
                case -971898776:
                case -714461953:
                    try {
                        intent.setComponent(componentNameM9638);
                        ServiceConnectionC1013.m56163(abstractActivityC5549, intent);
                        iM559711 = (C0946.m55979("ۢܳ") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM559711 ^ i7) * 24649) ^ 1197311924;
                        i6 = 404218313;
                    } catch (ActivityNotFoundException unused) {
                        iM559711 = C0946.m55979("ܳ֨") ^ i7;
                        i5 = ((iM559711 ^ i8) * (-21643)) ^ (-267458142);
                        i6 = -506233878;
                    }
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    break;
                case -594935923:
                case 1263343452:
                    try {
                        C1044.m56284(abstractActivityC5549, intent);
                        iM559710 = C0873.m55680("֫ܰ") ^ i8;
                        i3 = ((iM559710 ^ i7) * (-27431)) ^ (-1846797714);
                        i4 = 1003516926;
                        i10 = iM559710 ^ i4;
                        i9 = i3;
                        abstractActivityC5549 = this;
                    } catch (ActivityNotFoundException e) {
                        int iM55681 = (C0873.m55680("ۢۧ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM55681 ^ i8) * 30595) ^ 940001941;
                        i10 = iM55681 ^ (-263858121);
                        activityNotFoundException = e;
                        i9 = i5;
                    }
                    break;
                case -552539010:
                case 952692298:
                    break;
                case -450590718:
                case 285919521:
                    C1229.m56410();
                    if (!C1024.f81946) {
                        iM559710 = C0946.m55979("ۨۧ") ^ i7;
                        i3 = ((iM559710 ^ i8) * (-10519)) ^ (-1834774676);
                        i4 = 1282013934;
                        i10 = iM559710 ^ i4;
                        i9 = i3;
                        abstractActivityC5549 = this;
                    } else {
                        iM559711 = C0946.m55979("ۘܰ") ^ i8;
                        i5 = ((iM559711 ^ i7) * 16547) ^ 547652287;
                        i6 = -324240993;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                    }
                    break;
                case -362165935:
                case 2130697971:
                    break;
                case -319116177:
                case 718763781:
                    intent.setDataAndType(uri, C1929.m56558(sArr3, 410, 39, i13));
                    if (C1044.f81959 < 0) {
                        iM559711 = (C0946.m55979("۠ۘ") + i7) * (-53);
                        i5 = ((iM559711 ^ i8) * 13267) ^ (-1645296644);
                        i6 = -518987372;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                    } else {
                        iM559710 = C0946.m55979("ۨۧ") ^ i7;
                        i3 = ((iM559710 ^ i8) * (-10519)) ^ (-1834774676);
                        i4 = 1282013934;
                        i10 = iM559710 ^ i4;
                        i9 = i3;
                        abstractActivityC5549 = this;
                    }
                    break;
                case -250265119:
                case 1024831117:
                    ServiceConnectionC1013.m56157();
                    break;
                case -81475680:
                case 1889605579:
                    short[] sArr4 = f81933;
                    if (C0866.f81837 >= 0) {
                        int iM559715 = (C0946.m55979("᩺۫") + i7) * 109;
                        i3 = ((iM559715 ^ i8) * (-14045)) ^ 1162708724;
                        i10 = iM559715 ^ 1889107437;
                        intent = null;
                    } else {
                        intent = new Intent(C0967.m56077(sArr4, MLKEMEngine.KyberPolyBytes, 26, i13));
                        if (C0861.f81831) {
                            iM559710 = C0946.m55979("֡᩷") ^ i8;
                            i3 = ((iM559710 ^ i7) * 26585) ^ 1571906583;
                            i4 = -1765702219;
                        } else {
                            iM559710 = (C0946.m55979("ۜۡ") ^ i7) * (-35);
                            i3 = ((iM559710 ^ i8) * (-14081)) ^ (-742701153);
                            i4 = 497094061;
                        }
                        i10 = iM559710 ^ i4;
                    }
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case 21731611:
                case 1820597066:
                    C0882.m55721(intent, 2);
                    sArr3 = f81933;
                    if (C1036.m56257() > 0) {
                        iM559711 = (C0946.m55979("ܶ᩹") ^ i8) * 65;
                        i5 = ((iM559711 ^ i7) * (-24409)) ^ 889501548;
                        i6 = -1395841818;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                    } else {
                        iM559710 = C0946.m55979("᩷ᩳ") ^ i8;
                        i3 = ((iM559710 ^ i7) * 14925) ^ (-426069006);
                        i4 = 882821780;
                        i10 = iM559710 ^ i4;
                        i9 = i3;
                        abstractActivityC5549 = this;
                    }
                    break;
                case 301669332:
                case 1069158128:
                    s = s2;
                    if ((127283524 + i12) - (s * 22564) >= 0) {
                        iM55979 = (C0873.m55680("᩸ܽ") + i8) * 23;
                        i = ((iM55979 ^ i7) * 20089) ^ 1554273853;
                        i2 = -529989314;
                    } else {
                        iM55979 = (C0873.m55680("ۤۧ") + i7) * 55;
                        i = ((iM55979 ^ i8) * 4603) ^ 1360833832;
                        i2 = 1150775489;
                    }
                    i10 = iM55979 ^ i2;
                    s2 = s;
                    i9 = i;
                    abstractActivityC5549 = this;
                    break;
                case 413393872:
                case 931362919:
                    i13 = 19668;
                    iM559710 = C0873.m55680("ۢۘ") ^ i7;
                    i3 = ((iM559710 ^ i8) * 10913) ^ 913317254;
                    i4 = 1911725782;
                    i10 = iM559710 ^ i4;
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case 434541529:
                case 878720750:
                    strM56252 = C1036.m56252(sArr2, i11, 4, i13);
                    if (interfaceC14101.contains(strM56252)) {
                        iM559710 = C0946.m55979("ۛ֫") ^ i7;
                        i3 = ((iM559710 ^ i8) * (-26491)) ^ 2112849248;
                        i4 = -785815336;
                    } else {
                        iM559710 = C0873.m55680("֫ܰ") ^ i8;
                        i3 = ((iM559710 ^ i7) * (-27431)) ^ (-1846797714);
                        i4 = 1003516926;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
                case 639553176:
                case 1281731680:
                    if (C1044.m56286() <= 0) {
                        iM559710 = C0946.m55979("᩷ᩳ") ^ i8;
                        i3 = ((iM559710 ^ i7) * 14925) ^ (-426069006);
                        i4 = 882821780;
                        i10 = iM559710 ^ i4;
                        i9 = i3;
                        abstractActivityC5549 = this;
                    } else {
                        iM559711 = (C0946.m55979("ܽ᩵") ^ i7) * (-91);
                        i5 = ((iM559711 ^ i8) * 709) ^ (-1396050457);
                        i6 = -1885837589;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                    }
                    break;
                case 747718301:
                case 1034683480:
                    componentNameM9638 = C4566.m9638(getPackageManager());
                    componentName = null;
                    if (componentNameM9638 != null) {
                        iM559711 = (C0946.m55979("᩹۫") + i8) * (-29);
                        i5 = ((iM559711 ^ i7) * 21175) ^ (-1196541722);
                        i6 = -389943061;
                    } else {
                        iM559711 = (i7 - C0873.m55680("۬ۗ")) * 11;
                        i5 = ((iM559711 ^ i8) * 12629) ^ 1809335483;
                        i6 = 1257427205;
                    }
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    break;
                case 945905463:
                case 1945465929:
                    if (C0992.f81922 >= 0) {
                        iM559710 = C0873.m55680("۫᩷") ^ i8;
                        i3 = ((iM559710 ^ i7) * 13467) ^ 674608927;
                        i4 = -140037570;
                        i10 = iM559710 ^ i4;
                        i9 = i3;
                        abstractActivityC5549 = this;
                    } else {
                        iM559711 = (C0946.m55979("ܽ᩵") ^ i7) * (-91);
                        i5 = ((iM559711 ^ i8) * 709) ^ (-1396050457);
                        i6 = -1885837589;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                    }
                    break;
                case 1151089060:
                case 1367789362:
                    C1194.m56383(C0906.m55814(ApplicationC21448.f67649).remove(strM56252));
                    break;
                default:
                    C0937.m55912(ViewOnClickListenerC0939.m55950(interfaceC14100).remove(strM56252));
                    if (C0882.f81846) {
                        iM559710 = C0946.m55979("ۨۧ") ^ i7;
                        i3 = ((iM559710 ^ i8) * (-10519)) ^ (-1834774676);
                        i4 = 1282013934;
                    } else {
                        iM559710 = C0873.m55680("᩵ۜ") ^ i7;
                        i3 = ((iM559710 ^ i8) * (-7791)) ^ 965901125;
                        i4 = 604285604;
                    }
                    i10 = iM559710 ^ i4;
                    i9 = i3;
                    abstractActivityC5549 = this;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x025c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0293  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (p067l.C1929.f83011 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (p067l.C1071.f81975 > 0) goto L17;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12266(final C14784 c14784, final View view, final View view2, final View view3, final View view4, final View view5, final View view6, final View view7, final View view8) {
        int iM55979;
        int i;
        Window windowM56391 = null;
        boolean z = false;
        boolean zM55997 = false;
        int i2 = -1492488984;
        int i3 = C0912.f81867;
        int i4 = RunnableC1014.f81941;
        int iM55680 = (C0873.m55680("ܶۜ") ^ i4) * (-41);
        int i5 = ((iM55680 ^ i3) * 26511) ^ (-1562482342);
        int i6 = iM55680 ^ 18820419;
        final int[] iArrM12249 = null;
        final int[] iArrM122410 = null;
        final int[] iArrM122411 = null;
        final int[] iArrM122412 = null;
        final int[] iArrM122413 = null;
        final int[] iArrM122414 = null;
        final int[] iArrM122415 = null;
        final int i7 = 0;
        while (true) {
            i2 = i6 ^ ((((i2 ^ i3) * (-5199)) >> 31) & i5);
            switch (i2) {
                case -2053656725:
                case -1315254064:
                    if (C0877.m55696()) {
                        iM55979 = C0946.m55979("ۢ᩺") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-12599)) ^ 1169097359;
                        i = 769906656;
                    } else {
                        iM55979 = C0873.m55680("۬۫") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-28483)) ^ 1955294148;
                        i = 1372633649;
                    }
                    i6 = iM55979 ^ i;
                    break;
                case -1987037832:
                case 1104709630:
                    i7 = 0;
                    iM55979 = C0873.m55680("֨ۙ") ^ i3;
                    i5 = ((iM55979 ^ i4) * (-13911)) ^ (-1557648518);
                    i = 90980132;
                    i6 = iM55979 ^ i;
                    break;
                case -1842062772:
                case 2131497282:
                    iArrM12249 = m12249(view);
                    iArrM122410 = m12249(view2);
                    iArrM122411 = m12249(view3);
                    iArrM122412 = m12249(view4);
                    iArrM122413 = m12249(view5);
                    iArrM122414 = m12249(view6);
                    iArrM122415 = m12249(view8);
                    if (view7 == null) {
                        iM55979 = (i4 - C0946.m55979("ܰ۠")) * (-33);
                        i5 = ((iM55979 ^ i3) * 6913) ^ (-252288399);
                        i = -381080293;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۗᩳ")) * (-71);
                        i5 = ((iM55979 ^ i4) * 8589) ^ 481665982;
                        i = -1766508352;
                    }
                    i6 = iM55979 ^ i;
                    break;
                case -1693951567:
                case 1434613757:
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("ܶ۟") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-29345)) ^ 983888964;
                        i = -10661826;
                    } else {
                        iM55979 = (C0873.m55680("ܳᩴ") + i4) * (-95);
                        i5 = ((iM55979 ^ i3) * (-22207)) ^ (-603452034);
                        i = -1039017863;
                    }
                    i6 = iM55979 ^ i;
                    break;
                case -1644776567:
                case 809151203:
                    C0892.m55749();
                    C0992.m56107();
                    break;
                case -1632142342:
                case 2052502030:
                    if (C0967.m56074()) {
                        iM55979 = (C0873.m55680("ܳᩴ") + i4) * (-95);
                        i5 = ((iM55979 ^ i3) * (-22207)) ^ (-603452034);
                        i = -1039017863;
                    } else {
                        iM55979 = (C0873.m55680("ᩴۢ") + i4) * 87;
                        i5 = ((iM55979 ^ i3) * 905) ^ 1023109161;
                        i = 2112051019;
                    }
                    i6 = iM55979 ^ i;
                    break;
                case -1538652520:
                case 796284887:
                    i7 = ((ViewGroup.MarginLayoutParams) C1229.m56402(view7)).bottomMargin;
                    iM55979 = C0873.m55680("֨ۙ") ^ i3;
                    i5 = ((iM55979 ^ i4) * (-13911)) ^ (-1557648518);
                    i = 90980132;
                    i6 = iM55979 ^ i;
                    break;
                case -1046615218:
                case 973585382:
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("ܳᩴ") + i4) * (-95);
                        i5 = ((iM55979 ^ i3) * (-22207)) ^ (-603452034);
                        i = -1039017863;
                    } else {
                        iM55979 = C0946.m55979("ۨ᩵") ^ i3;
                        i5 = ((iM55979 ^ i4) * 27655) ^ 2042010261;
                        i = -2062823484;
                    }
                    i6 = iM55979 ^ i;
                    break;
                case -960371491:
                case 1867333796:
                    if (C0937.f81884) {
                        iM55979 = (C0946.m55979("ܿۢ") ^ i3) * (-53);
                        i5 = ((iM55979 ^ i4) * (-491)) ^ (-1840153086);
                        i = -1048205599;
                    } else {
                        iM55979 = (C0873.m55680("ܳۘ") + i4) * 19;
                        i5 = ((iM55979 ^ i3) * 17983) ^ 319769418;
                        i = 362452485;
                    }
                    i6 = iM55979 ^ i;
                    break;
                case -644919689:
                case 912283002:
                    C1036.m56257();
                    C1046.m56302();
                    iM55979 = C0873.m55680("۬۫") ^ i4;
                    i5 = ((iM55979 ^ i3) * (-28483)) ^ 1955294148;
                    i = 1372633649;
                    i6 = iM55979 ^ i;
                    break;
                case -80822341:
                case 1389533869:
                    if (zM55997) {
                        iM55979 = (C0873.m55680("ۛۨ") ^ i3) * 35;
                        i5 = ((iM55979 ^ i4) * (-14509)) ^ (-194861089);
                        i = -1659802500;
                    } else {
                        iM55979 = C0873.m55680("ܺ֨") ^ i3;
                        i5 = ((iM55979 ^ i4) * 14313) ^ 538282887;
                        i = 1021603201;
                    }
                    i6 = iM55979 ^ i;
                    break;
                case -626559:
                case 836115826:
                    if (C1194.f82045 != 0) {
                        iM55979 = (C0873.m55680("ܳᩴ") + i4) * (-95);
                        i5 = ((iM55979 ^ i3) * (-22207)) ^ (-603452034);
                        i = -1039017863;
                    } else {
                        iM55979 = C0946.m55979("᩸ۢ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 16017) ^ (-286541384);
                        i = -966897771;
                    }
                    i6 = iM55979 ^ i;
                    break;
                case 38736495:
                case 466102949:
                    if (C1024.f81946) {
                        iM55979 = (C0873.m55680("ܳۘ") + i4) * 19;
                        i5 = ((iM55979 ^ i3) * 17983) ^ 319769418;
                        i = 362452485;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۟۬")) * 35;
                        i5 = ((iM55979 ^ i4) * 5703) ^ 1834012347;
                        i = 1967910567;
                    }
                    i6 = iM55979 ^ i;
                    break;
                case 83357495:
                case 774511636:
                    windowM56391.setNavigationBarContrastEnforced(z);
                    iM55979 = (C0946.m55979("֡ۢ") + i4) * 65;
                    i5 = ((iM55979 ^ i3) * (-16315)) ^ (-658926836);
                    i = -1547675700;
                    i6 = iM55979 ^ i;
                    break;
                case 113421735:
                case 1373945907:
                    C0946.m55980();
                    if (C0845.f81821 < 0) {
                        iM55979 = (C0873.m55680("ܳᩴ") + i4) * (-95);
                        i5 = ((iM55979 ^ i3) * (-22207)) ^ (-603452034);
                        i = -1039017863;
                        i6 = iM55979 ^ i;
                    }
                    iM55979 = (C0873.m55680("۫ۚ") ^ i3) * 61;
                    i5 = ((iM55979 ^ i4) * (-29239)) ^ 557071672;
                    i = 812045566;
                    i6 = iM55979 ^ i;
                    break;
                case 245120275:
                case 1804653175:
                    break;
                case 390428369:
                case 559967483:
                    C1404.m56468();
                    break;
                case 470725187:
                case 1348587838:
                    zM55997 = C0947.m55997();
                    iM55979 = C0946.m55979("ۙ᩵") ^ i4;
                    i5 = ((iM55979 ^ i3) * 1553) ^ (-1543521341);
                    i = 859355580;
                    i6 = iM55979 ^ i;
                    break;
                case 916728284:
                case 1825702414:
                    windowM56391 = C1194.m56391(this);
                    z = false;
                    C1087.m16291(windowM56391, false);
                    windowM56391.setStatusBarColor(0);
                    m12264(c14784);
                    if (Build.VERSION.SDK_INT >= 29) {
                        iM55979 = (C0873.m55680("ۜۤ") ^ i4) * 63;
                        i5 = ((iM55979 ^ i3) * 8747) ^ 96976166;
                        i = 917597967;
                    } else {
                        iM55979 = (C0946.m55979("֡ۢ") + i4) * 65;
                        i5 = ((iM55979 ^ i3) * (-16315)) ^ (-658926836);
                        i = -1547675700;
                    }
                    i6 = iM55979 ^ i;
                    break;
                case 1185305217:
                case 1621726387:
                    C1717.m43556(c14784, new InterfaceC1666(this) { // from class: l.ۙܺ᩷

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ AbstractActivityC5549 f17932;

                        {
                            int i8;
                            int iM559710;
                            int i9;
                            int i10;
                            int iM559711;
                            int i11;
                            int i12;
                            int i13;
                            C6890 c6890 = this;
                            int i14 = -6703928;
                            int i15 = C0912.f81867;
                            int i16 = C0989.f81920;
                            int iM55681 = (C0873.m55680("۫ܰ") + i15) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            int i17 = ((iM55681 ^ i16) * 3157) ^ 2110955577;
                            int i18 = 1635279231;
                            while (true) {
                                int i19 = iM55681 ^ i18;
                                while (true) {
                                    i14 = ((((i14 ^ i16) * 10005) >> 31) & i17) ^ i19;
                                    switch (i14) {
                                        case -2130953449:
                                        case 337240540:
                                            i8 = i14;
                                            if (C1071.f81975 <= 0) {
                                                int iM55682 = (C0873.m55680("᩻ܶ") ^ i16) * 27;
                                                int i20 = ((iM55682 ^ i15) * 19075) ^ 1425530222;
                                                i19 = iM55682 ^ 895290689;
                                                i17 = i20;
                                            } else {
                                                iM559710 = (C0873.m55680("ᩳ᩵") + i16) * 19;
                                                i9 = ((iM559710 ^ i15) * (-22431)) ^ (-884144821);
                                                i10 = 1814968990;
                                                i17 = i9;
                                                i19 = iM559710 ^ i10;
                                            }
                                            i14 = i8;
                                            break;
                                        case -2075460827:
                                        case -1644508664:
                                            i8 = i14;
                                            if (ViewOnClickListenerC0939.f81888 > 0) {
                                                iM559710 = (C0946.m55979("ᩳۤ") + i16) * 77;
                                                i9 = ((iM559710 ^ i15) * 18979) ^ 1863655266;
                                                i10 = -101780299;
                                                i17 = i9;
                                                i19 = iM559710 ^ i10;
                                                i14 = i8;
                                            } else {
                                                iM559711 = C0873.m55680("᩸ᩳ") ^ i16;
                                                i11 = ((iM559711 ^ i15) * (-25917)) ^ 1966708971;
                                                i12 = -844123618;
                                                i17 = i11;
                                                i14 = i8;
                                                i19 = iM559711 ^ i12;
                                            }
                                            break;
                                        case -1639974688:
                                        case 1782444230:
                                            C0863.m55643();
                                            if (C0898.f81858 > 0) {
                                                i13 = i14;
                                                int iM55683 = C0873.m55680("ۖᩳ") ^ i15;
                                                i17 = ((iM55683 ^ i16) * 8891) ^ 240949630;
                                                i14 = i13;
                                                i19 = iM55683 ^ (-1318722484);
                                                c6890 = this;
                                            } else {
                                                i8 = i14;
                                                iM559711 = C0873.m55680("᩸ᩳ") ^ i16;
                                                i11 = ((iM559711 ^ i15) * (-25917)) ^ 1966708971;
                                                i12 = -844123618;
                                                i17 = i11;
                                                i14 = i8;
                                                i19 = iM559711 ^ i12;
                                            }
                                            break;
                                        case -1352889324:
                                        case 1937315168:
                                            if (C1229.f82066 >= 0) {
                                                i8 = i14;
                                                iM559711 = C0946.m55979("ۛۜ") ^ i15;
                                                i11 = ((iM559711 ^ i16) * 12829) ^ 1107524116;
                                                i12 = -156766405;
                                                i17 = i11;
                                                i14 = i8;
                                                i19 = iM559711 ^ i12;
                                            } else {
                                                int iM55684 = C0873.m55680("ܺ᩶") ^ i16;
                                                i19 = iM55684 ^ 663343802;
                                                i17 = ((iM55684 ^ i15) * (-31137)) ^ 1093207531;
                                            }
                                            break;
                                        case -1318505119:
                                        case -897849409:
                                            if (C0955.f81898) {
                                                i8 = i14;
                                                iM559711 = C0946.m55979("ۛۜ") ^ i15;
                                                i11 = ((iM559711 ^ i16) * 12829) ^ 1107524116;
                                                i12 = -156766405;
                                                i17 = i11;
                                                i14 = i8;
                                                i19 = iM559711 ^ i12;
                                            } else {
                                                int iM55685 = (C0873.m55680("ۜۙ") ^ i16) * (-45);
                                                i19 = iM55685 ^ (-2110254610);
                                                i17 = ((iM55685 ^ i15) * 9199) ^ (-1582653686);
                                            }
                                            break;
                                        case -1251086386:
                                        case -999721792:
                                            if (C1229.m56410() == 0) {
                                                i8 = i14;
                                                int iM55686 = (C0873.m55680("᩻ܶ") ^ i16) * 27;
                                                int i21 = ((iM55686 ^ i15) * 19075) ^ 1425530222;
                                                i19 = iM55686 ^ 895290689;
                                                i17 = i21;
                                                i14 = i8;
                                            }
                                            break;
                                        case -760483247:
                                        case 1259878811:
                                            return;
                                        case -725530956:
                                        case 830600001:
                                            if (C1964.f83032 <= 0) {
                                                i8 = i14;
                                                iM559711 = C0946.m55979("ۛۜ") ^ i15;
                                                i11 = ((iM559711 ^ i16) * 12829) ^ 1107524116;
                                                i12 = -156766405;
                                                i17 = i11;
                                                i14 = i8;
                                                i19 = iM559711 ^ i12;
                                            } else {
                                                int iM559712 = C0946.m55979("ۡۧ") ^ i15;
                                                i19 = iM559712 ^ (-1957160);
                                                i17 = ((iM559712 ^ i16) * 20825) ^ 1057758999;
                                            }
                                            break;
                                        case -615360991:
                                        case 1576743141:
                                            i8 = i14;
                                            if (C1964.m56597() == 0) {
                                                iM559710 = (C0946.m55979("ܰۗ") + i15) * (-63);
                                                i9 = ((iM559710 ^ i16) * (-6223)) ^ 2041482753;
                                                i10 = -728659618;
                                                i17 = i9;
                                                i19 = iM559710 ^ i10;
                                                i14 = i8;
                                            } else {
                                                iM559711 = C0946.m55979("ۛۜ") ^ i15;
                                                i11 = ((iM559711 ^ i16) * 12829) ^ 1107524116;
                                                i12 = -156766405;
                                                i17 = i11;
                                                i14 = i8;
                                                i19 = iM559711 ^ i12;
                                            }
                                            break;
                                        case -556357775:
                                        case 948840050:
                                            C1124.m56367();
                                            throw new RuntimeException();
                                        case -533796581:
                                        case -271688315:
                                            if (C0917.f81868) {
                                            }
                                            i8 = i14;
                                            iM559711 = C0873.m55680("᩸ᩳ") ^ i16;
                                            i11 = ((iM559711 ^ i15) * (-25917)) ^ 1966708971;
                                            i12 = -844123618;
                                            i17 = i11;
                                            i14 = i8;
                                            i19 = iM559711 ^ i12;
                                            break;
                                        case -223358587:
                                        case 1996627281:
                                            C1964.m56597();
                                            i8 = i14;
                                            iM559711 = C0873.m55680("᩸ᩳ") ^ i16;
                                            i11 = ((iM559711 ^ i15) * (-25917)) ^ 1966708971;
                                            i12 = -844123618;
                                            i17 = i11;
                                            i14 = i8;
                                            i19 = iM559711 ^ i12;
                                            break;
                                        case 308092161:
                                        case 928910252:
                                            i13 = i14;
                                            c6890.f17932 = this;
                                            if (C0877.f81843 >= 0) {
                                                int iM55687 = C0873.m55680("ۖᩳ") ^ i15;
                                                i17 = ((iM55687 ^ i16) * 8891) ^ 240949630;
                                                i14 = i13;
                                                i19 = iM55687 ^ (-1318722484);
                                            } else {
                                                int iM55688 = (i15 - C0873.m55680("֡۬")) * (-75);
                                                i19 = iM55688 ^ 937373729;
                                                i17 = ((iM55688 ^ i16) * (-18189)) ^ 1134878549;
                                                i14 = i13;
                                            }
                                            c6890 = this;
                                            break;
                                        case 517797420:
                                        case 1799206960:
                                            if (C0882.f81846) {
                                                i8 = i14;
                                                iM559711 = C0946.m55979("ۛۜ") ^ i15;
                                                i11 = ((iM559711 ^ i16) * 12829) ^ 1107524116;
                                                i12 = -156766405;
                                                i17 = i11;
                                                i14 = i8;
                                                i19 = iM559711 ^ i12;
                                            } else {
                                                int iM559713 = C0946.m55979("֫ܺ") ^ i16;
                                                i19 = iM559713 ^ 568535756;
                                                i17 = ((iM559713 ^ i15) * 5139) ^ 618963825;
                                            }
                                            break;
                                        case 1043369099:
                                        case 1167754493:
                                            if (C0854.m55595() >= 0) {
                                                i8 = i14;
                                                int iM55689 = (C0873.m55680("᩻ܶ") ^ i16) * 27;
                                                int i22 = ((iM55689 ^ i15) * 19075) ^ 1425530222;
                                                i19 = iM55689 ^ 895290689;
                                                i17 = i22;
                                            } else {
                                                int iM559714 = (C0946.m55979("ۚ᩸") + i15) * (-105);
                                                i8 = i14;
                                                i17 = ((iM559714 ^ i16) * (-23897)) ^ 156527073;
                                                i19 = iM559714 ^ (-2147433889);
                                            }
                                            i14 = i8;
                                            break;
                                        default:
                                            if (ServiceConnectionC1013.m56157() <= 0) {
                                                i8 = i14;
                                                iM559711 = C0873.m55680("᩸ᩳ") ^ i16;
                                                i11 = ((iM559711 ^ i15) * (-25917)) ^ 1966708971;
                                                i12 = -844123618;
                                                i17 = i11;
                                                i14 = i8;
                                                i19 = iM559711 ^ i12;
                                            } else {
                                                int iM559715 = C0946.m55979("ۘܽ") ^ i15;
                                                i19 = iM559715 ^ (-325677851);
                                                i17 = ((iM559715 ^ i16) * (-23881)) ^ (-1670958178);
                                            }
                                            break;
                                    }
                                }
                                iM55681 = C0946.m55979("֫᩷") ^ i15;
                                i17 = ((iM55681 ^ i16) * 6399) ^ (-252918793);
                                i18 = 704110974;
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:34:0x011a A[PHI: r27 r28 r29 r30 r31 r32
                          0x011a: PHI (r27v5 android.view.View) = 
                          (r27v2 android.view.View)
                          (r27v1 android.view.View)
                          (r27v1 android.view.View)
                          (r27v1 android.view.View)
                          (r27v1 android.view.View)
                         binds: [B:33:0x0114, B:29:0x00ee, B:25:0x00c8, B:14:0x0080, B:8:0x006f] A[DONT_GENERATE, DONT_INLINE]
                          0x011a: PHI (r28v5 android.view.View) = 
                          (r28v2 android.view.View)
                          (r28v1 android.view.View)
                          (r28v1 android.view.View)
                          (r28v1 android.view.View)
                          (r28v1 android.view.View)
                         binds: [B:33:0x0114, B:29:0x00ee, B:25:0x00c8, B:14:0x0080, B:8:0x006f] A[DONT_GENERATE, DONT_INLINE]
                          0x011a: PHI (r29v5 int[]) = (r29v2 int[]), (r29v1 int[]), (r29v1 int[]), (r29v1 int[]), (r29v1 int[]) binds: [B:33:0x0114, B:29:0x00ee, B:25:0x00c8, B:14:0x0080, B:8:0x006f] A[DONT_GENERATE, DONT_INLINE]
                          0x011a: PHI (r30v5 int[]) = (r30v1 int[]), (r30v3 int[]), (r30v1 int[]), (r30v1 int[]), (r30v1 int[]) binds: [B:33:0x0114, B:29:0x00ee, B:25:0x00c8, B:14:0x0080, B:8:0x006f] A[DONT_GENERATE, DONT_INLINE]
                          0x011a: PHI (r31v4 android.view.View) = 
                          (r31v1 android.view.View)
                          (r31v1 android.view.View)
                          (r31v2 android.view.View)
                          (r31v1 android.view.View)
                          (r31v1 android.view.View)
                         binds: [B:33:0x0114, B:29:0x00ee, B:25:0x00c8, B:14:0x0080, B:8:0x006f] A[DONT_GENERATE, DONT_INLINE]
                          0x011a: PHI (r32v4 android.view.View) = 
                          (r32v1 android.view.View)
                          (r32v1 android.view.View)
                          (r32v2 android.view.View)
                          (r32v1 android.view.View)
                          (r32v1 android.view.View)
                         binds: [B:33:0x0114, B:29:0x00ee, B:25:0x00c8, B:14:0x0080, B:8:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:54:0x01e3 A[PHI: r3 r22 r23 r24 r37 r38
                          0x01e3: PHI (r3v4 l.ۗܺ᩷) = (r3v1 l.ۗܺ᩷), (r3v1 l.ۗܺ᩷), (r3v2 l.ۗܺ᩷), (r3v1 l.ۗܺ᩷), (r3v1 l.ۗܺ᩷), (r3v1 l.ۗܺ᩷) binds: [B:44:0x0191, B:53:0x01e1, B:49:0x01c0, B:16:0x0084, B:14:0x0080, B:11:0x007a] A[DONT_GENERATE, DONT_INLINE]
                          0x01e3: PHI (r22v7 android.view.View) = 
                          (r22v4 android.view.View)
                          (r22v3 android.view.View)
                          (r22v3 android.view.View)
                          (r22v3 android.view.View)
                          (r22v3 android.view.View)
                          (r22v3 android.view.View)
                         binds: [B:44:0x0191, B:53:0x01e1, B:49:0x01c0, B:16:0x0084, B:14:0x0080, B:11:0x007a] A[DONT_GENERATE, DONT_INLINE]
                          0x01e3: PHI (r23v5 int[]) = (r23v2 int[]), (r23v1 int[]), (r23v1 int[]), (r23v1 int[]), (r23v1 int[]), (r23v1 int[]) binds: [B:44:0x0191, B:53:0x01e1, B:49:0x01c0, B:16:0x0084, B:14:0x0080, B:11:0x007a] A[DONT_GENERATE, DONT_INLINE]
                          0x01e3: PHI (r24v5 android.view.View) = 
                          (r24v2 android.view.View)
                          (r24v1 android.view.View)
                          (r24v1 android.view.View)
                          (r24v1 android.view.View)
                          (r24v1 android.view.View)
                          (r24v1 android.view.View)
                         binds: [B:44:0x0191, B:53:0x01e1, B:49:0x01c0, B:16:0x0084, B:14:0x0080, B:11:0x007a] A[DONT_GENERATE, DONT_INLINE]
                          0x01e3: PHI (r37v5 android.view.View) = 
                          (r37v1 android.view.View)
                          (r37v2 android.view.View)
                          (r37v1 android.view.View)
                          (r37v1 android.view.View)
                          (r37v1 android.view.View)
                          (r37v1 android.view.View)
                         binds: [B:44:0x0191, B:53:0x01e1, B:49:0x01c0, B:16:0x0084, B:14:0x0080, B:11:0x007a] A[DONT_GENERATE, DONT_INLINE]
                          0x01e3: PHI (r38v5 int) = (r38v1 int), (r38v1 int), (r38v2 int), (r38v1 int), (r38v1 int), (r38v1 int) binds: [B:44:0x0191, B:53:0x01e1, B:49:0x01c0, B:16:0x0084, B:14:0x0080, B:11:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:59:0x0218  */
                        /* JADX WARN: Code duplicated, block: B:63:0x0246 A[PHI: r33 r34 r35
                          0x0246: PHI (r33v6 int[]) = (r33v3 int[]), (r33v1 int[]), (r33v1 int[]) binds: [B:21:0x009b, B:62:0x0244, B:8:0x006f] A[DONT_GENERATE, DONT_INLINE]
                          0x0246: PHI (r34v6 int[]) = (r34v3 int[]), (r34v1 int[]), (r34v1 int[]) binds: [B:21:0x009b, B:62:0x0244, B:8:0x006f] A[DONT_GENERATE, DONT_INLINE]
                          0x0246: PHI (r35v6 android.view.View) = (r35v3 android.view.View), (r35v1 android.view.View), (r35v1 android.view.View) binds: [B:21:0x009b, B:62:0x0244, B:8:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // p067l.InterfaceC1666
                        public final C1914 onApplyWindowInsets(View view9, C1914 c1914) {
                            int i8;
                            int iM55681;
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int iM55682;
                            int i13;
                            AbstractActivityC5549 abstractActivityC5549 = null;
                            int i14 = -520911324;
                            int i15 = C0845.f81821;
                            int i16 = C1071.f81975;
                            int iM55683 = C0873.m55680("ۗۘ") ^ i16;
                            int i17 = ((iM55683 ^ i15) * 11667) ^ 1601422504;
                            int i18 = iM55683 ^ (-486047647);
                            View view10 = null;
                            int[] iArr = null;
                            View view11 = null;
                            int[] iArr2 = null;
                            C14784 c14785 = null;
                            View view12 = null;
                            View view13 = null;
                            int[] iArr3 = null;
                            int[] iArr4 = null;
                            View view14 = null;
                            View view15 = null;
                            int[] iArr5 = null;
                            int[] iArr6 = null;
                            View view16 = null;
                            View view17 = null;
                            int i19 = 0;
                            while (true) {
                                i14 = i18 ^ (i17 & (((i14 ^ i15) * 2187) >> 31));
                                switch (i14) {
                                    case -2082380887:
                                    case -1185053427:
                                        View view18 = view3;
                                        View view19 = view4;
                                        int[] iArr7 = iArrM122411;
                                        if (C1194.f82045 == 0) {
                                            int iM559710 = C0946.m55979("᩹۫") ^ i16;
                                            i8 = ((iM559710 ^ i15) * 22501) ^ 256555703;
                                            i18 = iM559710 ^ (-1887435762);
                                            view12 = view18;
                                            view13 = view19;
                                            iArr3 = iArr7;
                                            i17 = i8;
                                        } else {
                                            view12 = view18;
                                            view13 = view19;
                                            iArr3 = iArr7;
                                            iM55681 = C0873.m55680("ۚܽ") ^ i16;
                                            i9 = ((iM55681 ^ i15) * (-26979)) ^ 124048684;
                                            i10 = 202474447;
                                            i18 = iM55681 ^ i10;
                                            i17 = i9;
                                        }
                                        break;
                                    case -2054318533:
                                    case 604398489:
                                        C1036.m56257();
                                        if (C1071.m56343() != 0) {
                                            iM55681 = (C0946.m55979("ۤܺ") + i15) * 17;
                                            i9 = ((iM55681 ^ i16) * 31689) ^ 1695327594;
                                            i10 = 262047541;
                                        } else {
                                            iM55681 = C0873.m55680("ۙۨ") ^ i16;
                                            i9 = ((iM55681 ^ i15) * 21215) ^ (-877613811);
                                            i10 = -514069499;
                                        }
                                        i18 = iM55681 ^ i10;
                                        i17 = i9;
                                        break;
                                    case -1750963414:
                                    case 1876741748:
                                        int[] iArr8 = iArrM122410;
                                        C14784 c14786 = c14784;
                                        if (C1024.f81946) {
                                            iM55682 = C0946.m55979("۟ۡ") ^ i16;
                                            i12 = ((iM55682 ^ i15) * 14027) ^ (-566098710);
                                            i13 = -501631890;
                                        } else {
                                            iM55682 = (C0873.m55680("ۜۤ") ^ i15) * (-5);
                                            i12 = ((iM55682 ^ i16) * (-14109)) ^ (-664618217);
                                            i13 = -1449223364;
                                        }
                                        i18 = iM55682 ^ i13;
                                        iArr2 = iArr8;
                                        c14785 = c14786;
                                        i17 = i12;
                                        break;
                                    case -1471432133:
                                    case -941561366:
                                        if (C1124.f82007 >= 0) {
                                            iM55681 = (C0946.m55979("ۤܺ") + i15) * 17;
                                            i9 = ((iM55681 ^ i16) * 31689) ^ 1695327594;
                                            i10 = 262047541;
                                        } else {
                                            iM55681 = C0873.m55680("ۚܽ") ^ i16;
                                            i9 = ((iM55681 ^ i15) * (-26979)) ^ 124048684;
                                            i10 = 202474447;
                                        }
                                        i18 = iM55681 ^ i10;
                                        i17 = i9;
                                        break;
                                    case -1455890084:
                                    case -361941322:
                                        int[] iArr9 = iArrM122412;
                                        if (C1028.f81950 > 0) {
                                            int iM55684 = C0873.m55680("ۙ۬") ^ i15;
                                            i11 = ((iM55684 ^ i16) * 13713) ^ (-1592420069);
                                            i18 = iM55684 ^ 652267802;
                                            iArr4 = iArr9;
                                            i17 = i11;
                                        } else {
                                            iArr4 = iArr9;
                                            iM55681 = C0873.m55680("ۚܽ") ^ i16;
                                            i9 = ((iM55681 ^ i15) * (-26979)) ^ 124048684;
                                            i10 = 202474447;
                                            i18 = iM55681 ^ i10;
                                            i17 = i9;
                                        }
                                        break;
                                    case -1116039615:
                                    case -633006238:
                                        View view20 = view5;
                                        View view21 = view6;
                                        if (C0873.f81841 > 0) {
                                            int iM55685 = C0873.m55680("᩸ۖ") ^ i16;
                                            i12 = ((iM55685 ^ i15) * (-4259)) ^ 1936977447;
                                            i18 = iM55685 ^ 828598451;
                                            view14 = view20;
                                            view15 = view21;
                                            i17 = i12;
                                        } else {
                                            view14 = view20;
                                            view15 = view21;
                                            iM55681 = C0873.m55680("ۚܽ") ^ i16;
                                            i9 = ((iM55681 ^ i15) * (-26979)) ^ 124048684;
                                            i10 = 202474447;
                                            i18 = iM55681 ^ i10;
                                            i17 = i9;
                                        }
                                        break;
                                    case -1033619890:
                                    case -437905269:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55681 = C0873.m55680("ۙۨ") ^ i16;
                                            i9 = ((iM55681 ^ i15) * 21215) ^ (-877613811);
                                            i10 = -514069499;
                                        } else {
                                            iM55681 = C0873.m55680("᩸᩺") ^ i15;
                                            i9 = ((iM55681 ^ i16) * 29023) ^ 626619725;
                                            i10 = -528928936;
                                        }
                                        i18 = iM55681 ^ i10;
                                        i17 = i9;
                                        break;
                                    case -1032218741:
                                    case 484408593:
                                        View view22 = view7;
                                        if (C1044.f81959 < 0) {
                                            int iM55686 = C0873.m55680("ۡۧ") ^ i15;
                                            i11 = ((iM55686 ^ i16) * (-3677)) ^ (-600669180);
                                            i18 = iM55686 ^ (-160123447);
                                            view17 = view22;
                                            i17 = i11;
                                        } else {
                                            view17 = view22;
                                            iM55681 = (C0946.m55979("ۤܺ") + i15) * 17;
                                            i9 = ((iM55681 ^ i16) * 31689) ^ 1695327594;
                                            i10 = 262047541;
                                            i18 = iM55681 ^ i10;
                                            i17 = i9;
                                        }
                                        break;
                                    case -995970740:
                                    case 1440953573:
                                        C0989.m56095();
                                        if (C1036.f81953 >= 0) {
                                            iM55681 = C0873.m55680("ۚܽ") ^ i16;
                                            i9 = ((iM55681 ^ i15) * (-26979)) ^ 124048684;
                                            i10 = 202474447;
                                        } else {
                                            iM55681 = (i15 - C0873.m55680("ᩳܶ")) * (-35);
                                            i9 = ((iM55681 ^ i16) * (-12863)) ^ 972742122;
                                            i10 = 1373140753;
                                        }
                                        i18 = iM55681 ^ i10;
                                        i17 = i9;
                                        break;
                                    case -977501120:
                                    case 319781174:
                                        if (C0894.m55769() >= 0) {
                                            iM55681 = (i15 - C0873.m55680("ᩳܶ")) * (-35);
                                            i9 = ((iM55681 ^ i16) * (-12863)) ^ 972742122;
                                            i10 = 1373140753;
                                        } else {
                                            iM55681 = (C0873.m55680("᩵۫") ^ i16) * 83;
                                            i9 = ((iM55681 ^ i15) * 30319) ^ (-1575591934);
                                            i10 = 1746181353;
                                        }
                                        i18 = iM55681 ^ i10;
                                        i17 = i9;
                                        break;
                                    case -929359100:
                                    case 85714007:
                                        C1046.m56302();
                                        return null;
                                    case -877594489:
                                    case 181499044:
                                        int i20 = i7;
                                        abstractActivityC5549 = this.f17932;
                                        if (C0949.f81897 < 0) {
                                            int iM559711 = C0946.m55979("ᩳ۠") ^ i16;
                                            i11 = ((iM559711 ^ i15) * 19295) ^ (-869666989);
                                            i18 = iM559711 ^ 1680921212;
                                            i19 = i20;
                                            i17 = i11;
                                        } else {
                                            i19 = i20;
                                            iM55681 = (C0946.m55979("ۤܺ") + i15) * 17;
                                            i9 = ((iM55681 ^ i16) * 31689) ^ 1695327594;
                                            i10 = 262047541;
                                            i18 = iM55681 ^ i10;
                                            i17 = i9;
                                        }
                                        break;
                                    case 400264493:
                                    case 1542792043:
                                        int[] iArr10 = iArrM122413;
                                        int[] iArr11 = iArrM122414;
                                        View view23 = view8;
                                        if (!C1048.f81963) {
                                            iArr5 = iArr10;
                                            iArr6 = iArr11;
                                            view16 = view23;
                                            iM55681 = (i15 - C0873.m55680("ᩳܶ")) * (-35);
                                            i9 = ((iM55681 ^ i16) * (-12863)) ^ 972742122;
                                            i10 = 1373140753;
                                            i18 = iM55681 ^ i10;
                                            i17 = i9;
                                        } else {
                                            int iM559712 = C0946.m55979("ۡۘ") ^ i15;
                                            i8 = ((iM559712 ^ i16) * 979) ^ (-565811381);
                                            i18 = iM559712 ^ (-586426910);
                                            iArr5 = iArr10;
                                            iArr6 = iArr11;
                                            view16 = view23;
                                            i17 = i8;
                                        }
                                        break;
                                    case 715818668:
                                    case 1673138952:
                                        C0989.m56095();
                                        ViewOnClickListenerC0939.m55941();
                                        iM55681 = (C0946.m55979("ۤܺ") + i15) * 17;
                                        i9 = ((iM55681 ^ i16) * 31689) ^ 1695327594;
                                        i10 = 262047541;
                                        i18 = iM55681 ^ i10;
                                        i17 = i9;
                                        break;
                                    case 931584984:
                                    case 1116223089:
                                        View view24 = view;
                                        int[] iArr12 = iArrM12249;
                                        View view25 = view2;
                                        if (!C0866.m55645()) {
                                            view10 = view24;
                                            iArr = iArr12;
                                            view11 = view25;
                                            iM55681 = (C0946.m55979("ۤܺ") + i15) * 17;
                                            i9 = ((iM55681 ^ i16) * 31689) ^ 1695327594;
                                            i10 = 262047541;
                                            i18 = iM55681 ^ i10;
                                            i17 = i9;
                                        } else {
                                            int iM559713 = (C0946.m55979("ۡۡ") + i16) * 109;
                                            i8 = ((iM559713 ^ i15) * 11547) ^ 1996681943;
                                            i18 = iM559713 ^ 294084372;
                                            view10 = view24;
                                            iArr = iArr12;
                                            view11 = view25;
                                            i17 = i8;
                                        }
                                        break;
                                    default:
                                        return AbstractActivityC5549.m12242(abstractActivityC5549, view10, iArr, view11, iArr2, c14785, view12, view13, iArr3, iArr4, view14, view15, iArr5, iArr6, view16, iArrM122415, view17, i19, c1914);
                                }
                            }
                        }
                    });
                    C1717.m43585(c14784);
                    break;
                case 2070478163:
                case 2133742523:
                    if (C0967.m56074()) {
                        iM55979 = (C0873.m55680("ܳᩴ") + i4) * (-95);
                        i5 = ((iM55979 ^ i3) * (-22207)) ^ (-603452034);
                        i = -1039017863;
                    } else {
                        iM55979 = C0946.m55979("֨ܰ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 6215) ^ (-1617292835);
                        i = 2049069440;
                    }
                    i6 = iM55979 ^ i;
                    break;
                default:
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0873.m55680("۫ۚ") ^ i3) * 61;
                        i5 = ((iM55979 ^ i4) * (-29239)) ^ 557071672;
                        i = 812045566;
                    } else {
                        iM55979 = C0873.m55680("۠۫") ^ i3;
                        i5 = ((iM55979 ^ i4) * 8723) ^ 767790074;
                        i = 373846114;
                    }
                    i6 = iM55979 ^ i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0293 A[PHI: r15 r20
      0x0293: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:71:0x0291, B:40:0x0142, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:71:0x0291, B:40:0x0142, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02f8 A[PHI: r2 r8 r9 r12 r14
      0x02f8: PHI (r2v3 l.۫ۤۡ) = (r2v2 l.۫ۤۡ), (r2v2 l.۫ۤۡ), (r2v2 l.۫ۤۡ), (r2v4 l.۫ۤۡ) binds: [B:79:0x02f6, B:63:0x023e, B:55:0x01e4, B:44:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:79:0x02f6, B:63:0x023e, B:55:0x01e4, B:44:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:79:0x02f6, B:63:0x023e, B:55:0x01e4, B:44:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:79:0x02f6, B:63:0x023e, B:55:0x01e4, B:44:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v4 short[]) binds: [B:79:0x02f6, B:63:0x023e, B:55:0x01e4, B:44:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (p067l.C1071.f81975 <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (p067l.C0906.f81862 >= 0) goto L18;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m12248(AbstractActivityC5549 abstractActivityC5549, int i) {
        int iM55979;
        int i2;
        int iM559710;
        int i3;
        int i4;
        AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
        int i5 = AbstractC0942.f81890;
        int i6 = C0906.f81862;
        int iM55680 = (C0873.m55680("֡۫") ^ i5) * 101;
        int i7 = ((iM55680 ^ i6) * 237) ^ 505849174;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM55680 ^ (-507893806);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1398552424;
        Intent intent = null;
        InterfaceC14770 interfaceC14770M55950 = null;
        String strM56180 = null;
        InterfaceC14100 interfaceC14100 = null;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i6) * (-28309)) >> 31));
            switch (i13) {
                case -2106237348:
                case 1448363032:
                    i12 = 1;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0873.m55680("۟֡") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-905)) ^ 1547052967;
                        i2 = 1080558328;
                    } else {
                        iM55979 = (i5 - C0873.m55680("֨ۤ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i7 = ((iM55979 ^ i6) * 2043) ^ 28211660;
                        i2 = 1359092557;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1954416454:
                case -895330754:
                    strM56180 = RunnableC1014.m56180(sArr2, i12, 4, i11);
                    if (interfaceC14100.contains(strM56180)) {
                        iM55979 = (C0873.m55680("ۜ۬") ^ i5) * (-5);
                        i7 = ((iM55979 ^ i6) * (-27291)) ^ 121983363;
                        i2 = 1548756742;
                    } else {
                        iM55979 = C0946.m55979("ۡۙ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 19817) ^ 1709731800;
                        i2 = 1330462646;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1885367271:
                case -520600269:
                    C0930.m55885();
                    break;
                case -1797246193:
                case -1540925779:
                    i9 = s * s2;
                    s3 = 7859;
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("ۧܽ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-11583)) ^ (-513308529);
                        i2 = -1197369377;
                    } else {
                        iM55979 = C0946.m55979("ۨۘ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-28843)) ^ 2139616879;
                        i2 = 700453793;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1716172491:
                case 192465729:
                    sArr = f81933;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("۟֡") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-905)) ^ 1547052967;
                        i2 = 1080558328;
                    } else {
                        iM55979 = C0873.m55680("ܽ۠") ^ i6;
                        i7 = ((iM55979 ^ i5) * 4059) ^ (-297712760);
                        i2 = 185840374;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1618110400:
                case 583950591:
                    break;
                case -1541676130:
                case 1396627487:
                    c = 0;
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("ᩳۢ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-22079)) ^ 2020788536;
                        i2 = -342124168;
                    } else {
                        iM55979 = C0873.m55680("ۨۛ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 17497) ^ (-1556223073);
                        i2 = -1990829733;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1413752537:
                case -795665857:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0946.m55979("ۡۤ") + i6) * (-5);
                        i7 = ((iM55979 ^ i5) * (-4747)) ^ (-423217650);
                        i2 = 1432497873;
                    } else {
                        iM55979 = C0946.m55979("᩸᩸") ^ i5;
                        i7 = ((iM55979 ^ i6) * 20357) ^ 848631387;
                        i2 = 1596698994;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1384495804:
                case 1735377191:
                    i11 = 3159;
                    iM55979 = C0946.m55979("ۤۙ") ^ i6;
                    i7 = ((iM55979 ^ i5) * 12955) ^ 191503364;
                    i2 = -1673330701;
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1120785356:
                case -1082430805:
                    break;
                case -1080616222:
                case 159543793:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (C0873.m55680("ܳۡ") ^ i6) * 37;
                        i7 = ((iM55979 ^ i5) * (-19773)) ^ (-216606428);
                        i2 = -1012137664;
                    } else {
                        iM55979 = (C0873.m55680("֡ۤ") ^ i6) * 37;
                        i7 = ((iM55979 ^ i5) * (-5791)) ^ (-708972417);
                        i2 = -711118755;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1045296469:
                case -533126808:
                    if (!RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("ᩳۢ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-22079)) ^ 2020788536;
                        i2 = -342124168;
                        i8 = iM55979 ^ i2;
                        abstractActivityC55410 = abstractActivityC5549;
                    }
                    iM55979 = C0946.m55979("ۧܽ") ^ i6;
                    i7 = ((iM55979 ^ i5) * (-11583)) ^ (-513308529);
                    i2 = -1197369377;
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -827924634:
                case 860525997:
                    interfaceC14100 = ApplicationC21448.f67649;
                    sArr2 = f81933;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0946.m55979("ۡۤ") + i6) * (-5);
                        i7 = ((iM55979 ^ i5) * (-4747)) ^ (-423217650);
                        i2 = 1432497873;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ۖ֡")) * (-105);
                        i7 = ((iM55979 ^ i5) * (-14493)) ^ (-1215247987);
                        i2 = 1670563448;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -715654798:
                case 1754047616:
                    if ((i10 * i10) - i9 < 0) {
                        iM55979 = C0873.m55680("ܶۘ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 2919) ^ (-1171243995);
                        i2 = 835037382;
                    } else {
                        iM55979 = (C0946.m55979("᩻֫") ^ i5) * 41;
                        i7 = ((iM55979 ^ i6) * (-28249)) ^ 162589646;
                        i2 = -1601789407;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -537130453:
                case 1917585687:
                    s = sArr[c];
                    s2 = 31436;
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("ۡۤ") + i6) * (-5);
                        i7 = ((iM55979 ^ i5) * (-4747)) ^ (-423217650);
                        i2 = 1432497873;
                    } else {
                        iM55979 = C0946.m55979("ۡܰ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-26987)) ^ (-395562127);
                        i2 = 187645161;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -532327035:
                case -414507155:
                    if (i == -1) {
                        int iM559711 = C0946.m55979("ۖۚ") ^ i5;
                        i8 = iM559711 ^ 1228282534;
                        i7 = ((iM559711 ^ i6) * (-3995)) ^ 396028873;
                    } else {
                        iM55979 = C0946.m55979("ᩳᩳ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-16321)) ^ (-1383497081);
                        i2 = -920364637;
                        i8 = iM55979 ^ i2;
                    }
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -80217979:
                case 2137669842:
                    i10 = s + s3;
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0946.m55979("ۡۤ") + i6) * (-5);
                        i7 = ((iM55979 ^ i5) * (-4747)) ^ (-423217650);
                        i2 = 1432497873;
                    } else {
                        iM55979 = (C0946.m55979("ۙۚ") ^ i6) * 127;
                        i7 = ((iM55979 ^ i5) * (-4031)) ^ (-1493682105);
                        i2 = -1113410698;
                    }
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case 177351342:
                case 935466457:
                    C0937.m55912(interfaceC14770M55950.remove(strM56180));
                    iM55979 = C0946.m55979("ۡۙ") ^ i6;
                    i7 = ((iM55979 ^ i5) * 19817) ^ 1709731800;
                    i2 = 1330462646;
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case 381835225:
                case 903811544:
                    C1404.m56468();
                    C0863.m55643();
                    break;
                case 397016258:
                case 410485587:
                    C1929.m56553();
                    iM55979 = C0873.m55680("۟֡") ^ i5;
                    i7 = ((iM55979 ^ i6) * (-905)) ^ 1547052967;
                    i2 = 1080558328;
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case 402330049:
                case 1347066904:
                    super.startActivity(intent);
                    iM55979 = C0946.m55979("ᩳᩳ") ^ i5;
                    i7 = ((iM55979 ^ i6) * (-16321)) ^ (-1383497081);
                    i2 = -920364637;
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case 530337761:
                case 1191861684:
                    intent = abstractActivityC55410.f13388;
                    abstractActivityC55410.f13388 = null;
                    if (intent == null) {
                        iM55979 = C0946.m55979("ᩳᩳ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-16321)) ^ (-1383497081);
                        i2 = -920364637;
                        i8 = iM55979 ^ i2;
                        abstractActivityC55410 = abstractActivityC5549;
                    } else {
                        iM559710 = (C0946.m55979("᩻ܶ") + i6) * 3;
                        i3 = ((iM559710 ^ i5) * (-10717)) ^ (-1129422390);
                        i4 = 1567181514;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                    }
                    break;
                case 1101570602:
                case 2052105988:
                    i11 = 46201;
                    iM55979 = C0946.m55979("ۤۙ") ^ i6;
                    i7 = ((iM55979 ^ i5) * 12955) ^ 191503364;
                    i2 = -1673330701;
                    i8 = iM55979 ^ i2;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                default:
                    interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649);
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM559710 = C0946.m55979("ۡۚ") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-17537)) ^ (-759758152);
                        i4 = -1516617572;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                    } else {
                        iM55979 = (C0873.m55680("ܳۡ") ^ i6) * 37;
                        i7 = ((iM55979 ^ i5) * (-19773)) ^ (-216606428);
                        i2 = -1012137664;
                        i8 = iM55979 ^ i2;
                        abstractActivityC55410 = abstractActivityC5549;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12261(DialogInterfaceC2564 dialogInterfaceC2564) {
        synchronized (this.f13398) {
            C0861.m55613(this.f13398, dialogInterfaceC2564);
        }
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m12251() {
        int i;
        synchronized (this.f13398) {
            Iterator itM55615 = C0861.m55615(this.f13398);
            i = 0;
            while (C0866.m55647(itM55615)) {
                if (C0930.m55889((DialogInterfaceC2564) RunnableC0897.m55785(itM55615))) {
                    i++;
                }
            }
        }
        return i;
    }

    static {
        ApplicationC14266.m56479(47);
        f81933 = new short[]{123, -19440, -19432, -19434, -19446, 3089, -24008, -18492, 22760, 32254, 31316, 23537, 5452, -12449, -12466, -12466, -12462, -12457, -12451, -12449, -12470, -12457, -12463, -12464, -12527, -12472, -12464, -12454, -12528, -12449, -12464, -12454, -12468, -12463, -12457, -12454, -12528, -12466, -12449, -12451, -12459, -12449, -12455, -12453, -12525, -12449, -12468, -12451, -12458, -12457, -12472, -12453, -12447, -12457, -12464, -12467, -12470, -12449, -12462, -12462, -12447, -12449, -12466, -12459, -12447, -12456, -12468, -12463, -12461, -12447, -12461, -12470, -12447, -12449, -12467, -12533, -12454, -12534, -12532, -12466, -12449, -12451, -12459, -12449, -12455, -12453, -12540, -12449, -12464, -12454, -12468, -12463, -12457, -12454, -12528, -12467, -12453, -12470, -12470, -12457, -12464, -12455, -12467, -12528, -12429, -12417, -12432, -12417, -12423, -12421, -12447, -12437, -12432, -12427, -12432, -12431, -12439, -12432, -12447, -12417, -12434, -12434, -12447, -12435, -12431, -12437, -12436, -12419, -12421, -12435, -12456, -12457, -12462, -12453, -12457, -12449, -12463, -12467, 5132, -13651, -11121, 5643, 19708, 19683, 19706, 19685, 3081, -22348, -22341, -22351, -22361, -22342, -22340, -22351, -22277, -22362, -22352, -22367, -22367, -22340, -22341, -22350, -22362, -22277, -22380, -22395, -22395, -22375, -22372, -22378, -22380, -22399, -22372, -22374, -22373, -22390, -22383, -22384, -22399, -22380, -22372, -22375, -22394, -22390, -22394, -22384, -22399, -22399, -22372, -22373, -22382, -22394, -22363, -22348, -22346, -22338, -22348, -22350, -22352, -22289, -22346, -22342, -22344, -22277, -22348, -22341, -22351, -22361, -22342, -22340, -22351, -22277, -22362, -22352, -22367, -22367, -22340, -22341, -22350, -22362, -22346, -22342, -22344, -22277, -22348, -22341, -22351, -22361, -22342, -22340, -22351, -22277, -22362, -22352, -22367, -22367, -22340, -22341, -22350, -22362, -22277, -22348, -22363, -22363, -22343, -22340, -22346, -22348, -22367, -22340, -22342, -22341, -22362, -22277, -22372, -22341, -22362, -22367, -22348, -22343, -22343, -22352, -22351, -22380, -22363, -22363, -22383, -22352, -22367, -22348, -22340, -22343, -22362, 5092, -24479, -24479, -9199, 13357, 14430, 7868, 27034, 25468, -27242, -24940, 17546, -31837, -28010, 29136, 32048, 28117, 29867, 30207, 1587, 13788, 13773, 13775, 13767, 13773, 13771, 13769, 13718, 13773, 13762, 13768, 13790, 13763, 13765, 13768, 13698, 13791, 13769, 13784, 13784, 13765, 13762, 13771, 13791, 13698, 13793, 13805, 13794, 13805, 13803, 13801, 13811, 13817, 13794, 13799, 13794, 13795, 13819, 13794, 13811, 13805, 13820, 13820, 13811, 13823, 13795, 13817, 13822, 13807, 13801, 13823, 8085, -3591, 13498, -6768, 9625, -23201, -21767, 22752, 1266, 2400, 2415, 2405, 2419, 2414, 2408, 2405, 2351, 2408, 2415, 2421, 2404, 2415, 2421, 2351, 2400, 2402, 2421, 2408, 2414, 2415, 2351, 2391, 2376, 2372, 2390, 7281, 19645, 19637, 19643, 19623, 19637, 19642, 19632, 19622, 19643, 19645, 19632, 19706, 19645, 19642, 19616, 19633, 19642, 19616, 19706, 19637, 19639, 19616, 19645, 19643, 19642, 19706, 19586, 19613, 19601, 19587, 19637, 19620, 19620, 19640, 19645, 19639, 19637, 19616, 19645, 19643, 19642, 19707, 19618, 19642, 19632, 19706, 19637, 19642, 19632, 19622, 19643, 19645, 19632, 19706, 19620, 19637, 19639, 19647, 19637, 19635, 19633, 19705, 19637, 19622, 19639, 19644, 19645, 19618, 19633, 5767, -23041, 27755, 27846, -17263, 30006, 28750, 2688, -5585, -5618, -5624, -5628, -5607, -5571, -5630, -5618, -5604, -29162, 25765, 26670, -5622, -5627, -5617, -5607, -5628, -5630, -5617, -5563, -5604, -5630, -5617, -5620, -5618, -5601, -5563, -5573, -5628, -5605, -5602, -5605, -5572, -5630, -5627, -5617, -5628, -5604, -5553, -5573, -5628, -5605, -5602, -5605, -5585, -5618, -5624, -5628, -5607, -5571, -5630, -5618, -5604};
        f13385 = new C7350();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12243(Intent intent, boolean z) {
        int iM55680;
        int i;
        C22314 c22314 = null;
        C7350 c7350 = null;
        int i2 = -537669154;
        int i3 = C0992.f81922;
        int i4 = C1124.f82007;
        int iM55979 = (C0946.m55979("۟ۗ") + i4) * 23;
        int i5 = ((iM55979 ^ i3) * 1727) ^ 1672695799;
        int i6 = -1691200300;
        while (true) {
            int i7 = iM55979 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * (-13771)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2116112331:
                    case 1157192557:
                        if (C0992.m56107() > 0) {
                            iM55979 = (C0873.m55680("ܳ֡") ^ i3) * 67;
                            i5 = ((iM55979 ^ i4) * 14781) ^ (-1257775769);
                            i6 = 1599209415;
                        } else {
                            iM55979 = (C0946.m55979("ۙۡ") + i4) * (-19);
                            i5 = ((iM55979 ^ i3) * 21825) ^ 1149697817;
                            i6 = -1359588765;
                        }
                        break;
                    case -1952141194:
                    case 1113633258:
                        c7350.mo4062(c22314);
                        break;
                    case -1911577937:
                    case 57305444:
                        if (!C0890.m55740()) {
                            iM55979 = (i3 - C0873.m55680("ۤ۠")) * (-29);
                            i5 = ((iM55979 ^ i4) * (-24831)) ^ (-711818053);
                            i6 = 1053708152;
                        } else {
                            iM55979 = C0873.m55680("ܽۢ") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-13427)) ^ (-246201566);
                            i6 = 1827239719;
                        }
                        break;
                    case -1872863323:
                    case 858207814:
                        if (!C0861.f81831) {
                            iM55979 = (C0946.m55979("ۙۡ") + i4) * (-19);
                            i5 = ((iM55979 ^ i3) * 21825) ^ 1149697817;
                            i6 = -1359588765;
                            break;
                        }
                        iM55979 = C0873.m55680("۬ܰ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 24587) ^ (-8787062);
                        i6 = 1672410779;
                        break;
                    case -1718731946:
                    case 1259408733:
                        C0892.m55749();
                        break;
                    case -1295576802:
                    case -1030833411:
                        if (RunnableC0938.m55938() == 0) {
                            iM55979 = C0873.m55680("᩷᩵") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-21709)) ^ 1314589457;
                            i6 = -281531489;
                        } else {
                            iM55979 = (i3 - C0873.m55680("ۤ۠")) * (-29);
                            i5 = ((iM55979 ^ i4) * (-24831)) ^ (-711818053);
                            i6 = 1053708152;
                        }
                        break;
                    case -1204877853:
                    case 1852729597:
                        if (C0854.f81826 == 0) {
                            iM55979 = C0873.m55680("ᩳܿ") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-18703)) ^ (-1550624528);
                            i6 = 474300385;
                        } else {
                            iM55979 = (i3 - C0873.m55680("ۚ᩻")) * (-101);
                            i5 = ((iM55979 ^ i4) * (-2919)) ^ 1243249242;
                            i6 = -2050075684;
                        }
                        break;
                    case -1167294263:
                    case 608284897:
                        C1028.m56247();
                        iM55979 = (i4 - C0946.m55979("ۛۙ")) * 127;
                        i5 = ((iM55979 ^ i3) * (-20699)) ^ 1667749432;
                        i6 = 878841041;
                    case -902952976:
                    case -793432886:
                        C0890.m55740();
                        if (!C0861.f81831) {
                            iM55979 = (i4 - C0946.m55979("ۛۙ")) * 127;
                            i5 = ((iM55979 ^ i3) * (-20699)) ^ 1667749432;
                            i6 = 878841041;
                            break;
                        }
                        iM55979 = (i3 - C0873.m55680("ۤ۠")) * (-29);
                        i5 = ((iM55979 ^ i4) * (-24831)) ^ (-711818053);
                        i6 = 1053708152;
                        break;
                    case -885654291:
                    case -885302803:
                        if (RunnableC1014.f81941 > 0) {
                            iM55979 = (C0946.m55979("۫᩺") + i4) * (-27);
                            i5 = ((iM55979 ^ i3) * 26383) ^ 1242626089;
                            i6 = -724394179;
                        } else {
                            iM55979 = (i4 - C0946.m55979("ۛۙ")) * 127;
                            i5 = ((iM55979 ^ i3) * (-20699)) ^ 1667749432;
                            i6 = 878841041;
                        }
                        break;
                    case -709395277:
                    case 1460483954:
                        if (!C0917.f81868) {
                            iM55979 = (i3 - C0873.m55680("ۚ᩻")) * (-101);
                            i5 = ((iM55979 ^ i4) * (-2919)) ^ 1243249242;
                            i6 = -2050075684;
                            break;
                        }
                        iM55979 = (C0946.m55979("ۙۡ") + i4) * (-19);
                        i5 = ((iM55979 ^ i3) * 21825) ^ 1149697817;
                        i6 = -1359588765;
                        break;
                    case -244243302:
                    case 43039409:
                        if (C0992.f81922 < 0) {
                            iM55979 = C0873.m55680("ܿۛ") ^ i3;
                            i5 = ((iM55979 ^ i4) * 30785) ^ 1467093540;
                            i6 = 515971332;
                        } else {
                            iM55979 = (i3 - C0873.m55680("ۤ۠")) * (-29);
                            i5 = ((iM55979 ^ i4) * (-24831)) ^ (-711818053);
                            i6 = 1053708152;
                        }
                        break;
                    case -211781752:
                    case 1060292663:
                        if (!C0912.m55833()) {
                            iM55979 = C0946.m55979("ۤܳ") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-199)) ^ (-79489077);
                            i6 = 1609624966;
                        } else {
                            iM55979 = (C0946.m55979("ۙۡ") + i4) * (-19);
                            i5 = ((iM55979 ^ i3) * 21825) ^ 1149697817;
                            i6 = -1359588765;
                        }
                        break;
                    case -92561784:
                    case 1150216080:
                        boolean zM29347 = C12799.m29347();
                        C7350 c7351 = f13385;
                        if (zM29347) {
                            iM55680 = (C0946.m55979("᩷ۧ") + i3) * (-71);
                            i5 = ((iM55680 ^ i4) * (-32641)) ^ 576635687;
                            i = 95809716;
                        } else {
                            iM55680 = C0873.m55680("۬ۤ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 27233) ^ 1285726179;
                            i = 1720929625;
                        }
                        i7 = iM55680 ^ i;
                        c7350 = c7351;
                        break;
                    case 43707569:
                    case 348133307:
                        if (!C0861.f81831) {
                            iM55979 = C0946.m55979("ۚܽ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 16365) ^ 334283381;
                            i6 = 947947335;
                        } else {
                            iM55979 = (i4 - C0873.m55680("ܿ֫")) * (-55);
                            i5 = ((iM55979 ^ i3) * (-30191)) ^ (-1692764764);
                            i6 = 531424989;
                        }
                        break;
                    case 318290932:
                    case 1032444090:
                        c7350.mo4067(c22314);
                        break;
                    case 385180030:
                    case 1345430873:
                        c22314 = new C22314(intent);
                        if (!z) {
                            iM55979 = (C0873.m55680("ۗۚ") + i4) * 45;
                            i5 = ((iM55979 ^ i3) * (-8743)) ^ 799172935;
                            i6 = -862057629;
                        } else {
                            iM55979 = (C0946.m55979("۟᩸") ^ i3) * (-53);
                            i5 = ((iM55979 ^ i4) * 1245) ^ 114109116;
                            i6 = -1994710477;
                        }
                        break;
                    case 704779940:
                    case 1333615764:
                        RunnableC0897.m55784();
                        if (RunnableC0871.f81839 < 0) {
                            iM55979 = (i3 - C0873.m55680("ۚ᩻")) * (-101);
                            i5 = ((iM55979 ^ i4) * (-2919)) ^ 1243249242;
                            i6 = -2050075684;
                            break;
                        }
                        iM55979 = (i4 - C0946.m55979("ۛۙ")) * 127;
                        i5 = ((iM55979 ^ i3) * (-20699)) ^ 1667749432;
                        i6 = 878841041;
                        break;
                    case 801419939:
                    case 1379839736:
                        if (!C1024.f81946) {
                            iM55979 = (i3 - C0946.m55979("ۛܺ")) * 123;
                            i5 = ((iM55979 ^ i4) * (-23777)) ^ 367645767;
                            i6 = -1133646290;
                        } else {
                            iM55979 = C0946.m55979("ۚܽ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 16365) ^ 334283381;
                            i6 = 947947335;
                        }
                        break;
                    default:
                        c22314.m50124();
                        iM55979 = (C0946.m55979("۟᩸") ^ i3) * (-53);
                        i5 = ((iM55979 ^ i4) * 1245) ^ 114109116;
                        i6 = -1994710477;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo115(C22314 c22314) {
        int iM55979;
        int i;
        int i2;
        short s;
        int i3;
        short[] sArr;
        C20671 c20671;
        int iM559710;
        int i4;
        short s2;
        int i5;
        short[] sArr2;
        C20671 c20672;
        int iM559711;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM55680;
        int iM559712;
        int i10;
        int iM559713;
        int i11;
        short[] sArr3;
        C22314 c22315 = c22314;
        int i12 = C0906.f81862;
        int i13 = ServiceConnectionC1013.f81940;
        int iM559714 = (C0946.m55979("۟ۗ") + i13) * (-7);
        int i14 = ((iM559714 ^ i12) * 11777) ^ 1968400687;
        DialogInterfaceOnClickListenerC6479 dialogInterfaceOnClickListenerC6479 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i15 = iM559714 ^ 1342488437;
        int iM55681 = 0;
        int iM55682 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        char c = 0;
        short s3 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 1923356918;
        DialogInterfaceOnClickListenerC21232 dialogInterfaceOnClickListenerC21232 = null;
        short[] sArr8 = null;
        C20671 c20671M55654 = null;
        int i24 = 0;
        while (true) {
            i23 = i15 ^ (i14 & (((i23 ^ i12) * 25949) >> 31));
            switch (i23) {
                case -2101753962:
                case 525175657:
                    i18 = 6454;
                    iM559712 = (C0946.m55979("ܿۖ") + i13) * 75;
                    i14 = ((iM559712 ^ i12) * 8177) ^ 2001989961;
                    i10 = -536230427;
                    int i25 = iM559712 ^ i10;
                    i22 = i22;
                    sArr4 = sArr4;
                    i15 = i25;
                    c22315 = c22314;
                    break;
                case -2018413677:
                case 1937167109:
                    i22 = i22;
                    sArr3 = sArr4;
                    iM55681 = C0873.m55680(C0967.m56077(sArr3, i19, i22, i18));
                    if (C1929.f83011 == 0) {
                        sArr4 = sArr3;
                        iM559712 = (i13 - C0946.m55979("ܽۖ")) * (-113);
                        i14 = ((iM559712 ^ i12) * 32061) ^ 1095557027;
                        i10 = 1409143846;
                        int i26 = iM559712 ^ i10;
                        i22 = i22;
                        sArr4 = sArr4;
                        i15 = i26;
                        c22315 = c22314;
                    } else {
                        int iM559715 = C0946.m55979("֨᩷") ^ i13;
                        i14 = ((iM559715 ^ i12) * (-14951)) ^ 1194338328;
                        sArr4 = sArr3;
                        c22315 = c22314;
                        i15 = iM559715 ^ (-666374778);
                        i22 = i22;
                    }
                    break;
                case -2011450436:
                case 465107835:
                    mo5283();
                    break;
                case -1989866429:
                case 111736625:
                    dialogInterfaceOnClickListenerC6479 = new DialogInterfaceOnClickListenerC6479(2, c22315);
                    sArr7 = f81933;
                    if (C1025.f81947 < 0) {
                        iM55979 = C0946.m55979("۟᩺") ^ i12;
                        i = ((iM55979 ^ i13) * 31465) ^ (-57538430);
                        i2 = -383431452;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                    } else {
                        i22 = i22;
                        sArr3 = sArr4;
                        int iM559716 = C0946.m55979("֨᩷") ^ i13;
                        i14 = ((iM559716 ^ i12) * (-14951)) ^ 1194338328;
                        sArr4 = sArr3;
                        c22315 = c22314;
                        i15 = iM559716 ^ (-666374778);
                        i22 = i22;
                    }
                    break;
                case -1931382200:
                case 2107779623:
                    i22 = i22;
                    sArr4 = sArr4;
                    if (c22314.m50123()) {
                        iM559712 = C0873.m55680("ۙᩳ") ^ i13;
                        i14 = ((iM559712 ^ i12) * 15851) ^ 1790603372;
                        i10 = -1809918809;
                    } else {
                        iM559712 = (C0946.m55979("ۨۢ") + i12) * 91;
                        i14 = ((iM559712 ^ i13) * 1133) ^ 1462659276;
                        i10 = -1333985893;
                    }
                    int i27 = iM559712 ^ i10;
                    i22 = i22;
                    sArr4 = sArr4;
                    i15 = i27;
                    c22315 = c22314;
                    break;
                case -1760560152:
                case -1672328744:
                    C1124.m56374(c20671M55654, iM55682 ^ i24, dialogInterfaceOnClickListenerC6479);
                    C0930.m55881(c20671M55654, false);
                    RunnableC0871.m55669(c20671M55654);
                    break;
                case -1755951222:
                case 96505480:
                    dialogInterfaceOnClickListenerC21232 = new DialogInterfaceOnClickListenerC21232(this, c22315);
                    sArr6 = f81933;
                    if (C1003.f81929 <= 0) {
                        i17 = 286;
                        iM559713 = C0873.m55680("᩸֨") ^ i13;
                        i14 = ((iM559713 ^ i12) * (-23907)) ^ (-345701967);
                        i11 = -1506905750;
                        i15 = iM559713 ^ i11;
                        c22315 = c22314;
                    } else {
                        int iM55683 = (C0873.m55680("ۤᩴ") ^ i13) * 83;
                        i14 = ((iM55683 ^ i12) * 7491) ^ 1148846746;
                        i15 = iM55683 ^ (-1302703777);
                        i17 = 286;
                    }
                    break;
                case -1694972324:
                case -327526355:
                    c20671 = c20671M55654;
                    i3 = i22;
                    sArr = sArr4;
                    s = sArr8[c];
                    i20 = s * s;
                    i21 = 104040000;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0873.m55680("ܶ֡") ^ i12) * 101;
                        i9 = ((iM55680 ^ i13) * 11625) ^ (-1745284726);
                        i8 = -376201605;
                    } else {
                        iM55680 = (C0946.m55979("ܺܺ") ^ i12) * (-31);
                        i9 = ((iM55680 ^ i13) * 29129) ^ (-709678044);
                        i8 = 1718142937;
                    }
                    int i28 = iM55680 ^ i8;
                    i22 = i3;
                    sArr4 = sArr;
                    i15 = i28;
                    i14 = i9;
                    c20671M55654 = c20671;
                    s3 = s;
                    c22315 = c22314;
                    break;
                case -1416174638:
                case 940116837:
                    i5 = i22;
                    sArr2 = sArr4;
                    int i29 = i20 + i21;
                    s2 = s3;
                    c20672 = c20671M55654;
                    int i30 = s2 + 10200;
                    if ((i29 + i29) - (i30 * i30) >= 0) {
                        iM559711 = (C0946.m55979("۬᩻") ^ i12) * 83;
                        i6 = ((iM559711 ^ i13) * (-85)) ^ (-829431541);
                        i7 = -1595761723;
                    } else {
                        iM559711 = C0946.m55979("ۤ᩹") ^ i13;
                        i6 = ((iM559711 ^ i12) * 22859) ^ 1471867198;
                        i7 = -1222177284;
                    }
                    int i31 = iM559711 ^ i7;
                    i22 = i5;
                    sArr4 = sArr2;
                    i15 = i31;
                    c22315 = c22314;
                    C20671 c20673 = c20672;
                    s3 = s2;
                    i14 = i6;
                    c20671M55654 = c20673;
                    break;
                case -1108102140:
                case 1716318079:
                    ViewOnClickListenerC0939.m55953(c20671M55654, C0873.m55680(RunnableC1014.m56180(sArr6, i17, 3, i18)) ^ 2097888394, dialogInterfaceOnClickListenerC21232);
                    if (C1046.m56302() == 0) {
                        iM55979 = (C0873.m55680("ܽܰ") ^ i13) * 11;
                        i = ((iM55979 ^ i12) * 19357) ^ (-860968464);
                        i2 = 674576624;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                    } else {
                        i22 = i22;
                        sArr3 = sArr4;
                        int iM559717 = C0946.m55979("֨᩷") ^ i13;
                        i14 = ((iM559717 ^ i12) * (-14951)) ^ 1194338328;
                        sArr4 = sArr3;
                        c22315 = c22314;
                        i15 = iM559717 ^ (-666374778);
                        i22 = i22;
                    }
                    break;
                case -850833579:
                case 884003129:
                    C0866.m55645();
                    RunnableC0871.m55672();
                    iM559710 = (C0946.m55979("ܳۤ") + i13) * 5;
                    i = ((iM559710 ^ i12) * 10267) ^ (-1916618831);
                    i4 = -570848740;
                    i15 = iM559710 ^ i4;
                    c22315 = c22314;
                    i14 = i;
                    break;
                case -794228991:
                case -405069445:
                    C0863.m55643();
                    if (C1025.f81947 >= 0) {
                        i22 = i22;
                        sArr3 = sArr4;
                        int iM559718 = C0946.m55979("֨᩷") ^ i13;
                        i14 = ((iM559718 ^ i12) * (-14951)) ^ 1194338328;
                        sArr4 = sArr3;
                        c22315 = c22314;
                        i15 = iM559718 ^ (-666374778);
                        i22 = i22;
                    } else {
                        iM559710 = (C0946.m55979("ܳۤ") + i13) * 5;
                        i = ((iM559710 ^ i12) * 10267) ^ (-1916618831);
                        i4 = -570848740;
                        i15 = iM559710 ^ i4;
                        c22315 = c22314;
                        i14 = i;
                    }
                    break;
                case -717817731:
                case 1642769009:
                    s2 = s3;
                    i5 = i22;
                    sArr2 = sArr4;
                    c20672 = c20671M55654;
                    sArr8 = f81933;
                    c = 279;
                    if (C1194.m56396() <= 0) {
                        iM559711 = (i12 - C0873.m55680("ۗ֫")) * 59;
                        i6 = ((iM559711 ^ i13) * 3437) ^ (-915320669);
                        i7 = -1593551248;
                    } else {
                        iM559711 = C0946.m55979("᩺ۧ") ^ i13;
                        i6 = ((iM559711 ^ i12) * (-20095)) ^ 778540935;
                        i7 = 9344752;
                    }
                    int i32 = iM559711 ^ i7;
                    i22 = i5;
                    sArr4 = sArr2;
                    i15 = i32;
                    c22315 = c22314;
                    C20671 c20674 = c20672;
                    s3 = s2;
                    i14 = i6;
                    c20671M55654 = c20674;
                    break;
                case -617060114:
                case 764960867:
                    C1194.m56390(c20671M55654, C0873.m55680(C1929.m56558(sArr5, i16, 3, i18)) ^ 2098928239);
                    if (C0989.f81920 < 0) {
                        int iM55684 = C0873.m55680("ܽ᩺") ^ i12;
                        i15 = iM55684 ^ 945685372;
                        i14 = ((iM55684 ^ i13) * (-24609)) ^ (-991947592);
                        c22315 = c22314;
                    } else {
                        s2 = s3;
                        i5 = i22;
                        sArr2 = sArr4;
                        c20672 = c20671M55654;
                        iM559711 = (i12 - C0873.m55680("ۗ֫")) * 59;
                        i6 = ((iM559711 ^ i13) * 3437) ^ (-915320669);
                        i7 = -1593551248;
                        int i33 = iM559711 ^ i7;
                        i22 = i5;
                        sArr4 = sArr2;
                        i15 = i33;
                        c22315 = c22314;
                        C20671 c20675 = c20672;
                        s3 = s2;
                        i14 = i6;
                        c20671M55654 = c20675;
                    }
                    break;
                case -581614467:
                case 1540360345:
                    i18 = 40152;
                    iM559712 = (C0946.m55979("ܿۖ") + i13) * 75;
                    i14 = ((iM559712 ^ i12) * 8177) ^ 2001989961;
                    i10 = -536230427;
                    int i210 = iM559712 ^ i10;
                    i22 = i22;
                    sArr4 = sArr4;
                    i15 = i210;
                    c22315 = c22314;
                    break;
                case -137651939:
                case 442433255:
                    if (C0989.m56095() > 0) {
                        s = s3;
                        i3 = i22;
                        sArr = sArr4;
                        c20671 = c20671M55654;
                        iM55680 = (C0873.m55680("ܶ֡") ^ i12) * 101;
                        i9 = ((iM55680 ^ i13) * 11625) ^ (-1745284726);
                        i8 = -376201605;
                        int i211 = iM55680 ^ i8;
                        i22 = i3;
                        sArr4 = sArr;
                        i15 = i211;
                        i14 = i9;
                        c20671M55654 = c20671;
                        s3 = s;
                        c22315 = c22314;
                    } else {
                        iM559710 = (C0946.m55979("ܳۤ") + i13) * 5;
                        i = ((iM559710 ^ i12) * 10267) ^ (-1916618831);
                        i4 = -570848740;
                        i15 = iM559710 ^ i4;
                        c22315 = c22314;
                        i14 = i;
                    }
                    break;
                case 17167382:
                case 1177359796:
                    iM55682 = C0873.m55680(RunnableC0871.m55667(sArr7, 289, 3, i18));
                    i24 = 2127985585;
                    if (!C0955.f81898) {
                        iM55979 = (C0946.m55979("ۡ᩺") + i12) * 67;
                        i = ((iM55979 ^ i13) * (-17593)) ^ 1060157492;
                        i2 = 1485410628;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                    } else {
                        iM559713 = C0873.m55680("᩸֨") ^ i13;
                        i14 = ((iM559713 ^ i12) * (-23907)) ^ (-345701967);
                        i11 = -1506905750;
                        i15 = iM559713 ^ i11;
                        c22315 = c22314;
                    }
                    break;
                case 59593586:
                case 2099626905:
                    C0930.m55885();
                    break;
                case 1248888202:
                case 2028588909:
                    c20671M55654 = C0866.m55654(this);
                    sArr4 = f81933;
                    i19 = 280;
                    i22 = 3;
                    if (C0992.f81922 >= 0) {
                        iM559713 = C0873.m55680("᩸֨") ^ i13;
                        i14 = ((iM559713 ^ i12) * (-23907)) ^ (-345701967);
                        i11 = -1506905750;
                    } else {
                        iM559713 = (C0946.m55979("᩸֫") ^ i12) * 109;
                        i14 = ((iM559713 ^ i13) * 19305) ^ 1923801118;
                        i11 = -191072963;
                    }
                    i15 = iM559713 ^ i11;
                    c22315 = c22314;
                    break;
                case 1255849514:
                case 1560187652:
                    C0877.m55696();
                    if (C0877.f81843 >= 0) {
                        s2 = s3;
                        i5 = i22;
                        sArr2 = sArr4;
                        c20672 = c20671M55654;
                        iM559711 = (i12 - C0873.m55680("ۗ֫")) * 59;
                        i6 = ((iM559711 ^ i13) * 3437) ^ (-915320669);
                        i7 = -1593551248;
                        int i34 = iM559711 ^ i7;
                        i22 = i5;
                        sArr4 = sArr2;
                        i15 = i34;
                        c22315 = c22314;
                        C20671 c20676 = c20672;
                        s3 = s2;
                        i14 = i6;
                        c20671M55654 = c20676;
                    } else {
                        i22 = i22;
                        sArr3 = sArr4;
                        int iM559719 = C0946.m55979("֨᩷") ^ i13;
                        i14 = ((iM559719 ^ i12) * (-14951)) ^ 1194338328;
                        sArr4 = sArr3;
                        c22315 = c22314;
                        i15 = iM559719 ^ (-666374778);
                        i22 = i22;
                    }
                    break;
                default:
                    C1012.m56146(c20671M55654, 2124700217 ^ iM55681);
                    sArr5 = f81933;
                    i16 = 283;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM559710 = (C0946.m55979("ܳۤ") + i13) * 5;
                        i = ((iM559710 ^ i12) * 10267) ^ (-1916618831);
                        i4 = -570848740;
                    } else {
                        iM559710 = (C0873.m55680("᩶ܳ") ^ i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM559710 ^ i13) * 18217) ^ (-197231413);
                        i4 = 1733141832;
                    }
                    i15 = iM559710 ^ i4;
                    c22315 = c22314;
                    i14 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public C1388 mo112(C1914 c1914) {
        return c1914.m51163(7);
    }
}
