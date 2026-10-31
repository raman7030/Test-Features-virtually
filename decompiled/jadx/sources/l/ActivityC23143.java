package l;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tabs.TabLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: H3YF */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC23143 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74396 = 0;

    /* JADX INFO: renamed from: ۤᩳ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f74397 = {3727, -3528, 7077, -3900, 109, 7649, -4427, 3189, 2822, 2744, -10193, 4111, -2182, -6117, 6535, 2357, -6084, -11025, -2745, -1505, -2217, 5826, 8962, 14039, -12468, 15588, -14161, 5317, -11711, 9245, 1486, 1820, -8984, 2330, -7219, -11127, -2082, -6996, -6056, -5878, -6882, -8380, -30127, -30086, -30083, 6981, -1970, -1934, -1941, -1927, -1929, -1936, -1965, -1921, -1936, -1921, -1927, -1925, -1953, -1923, -1942, -1929, -1944, -1929, -1942, -1945};

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C23592 f74398;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C5484 f74399;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public boolean f74400;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C16772 f74401;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C13244 f74402;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f74403;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 1722383129;
        int i7 = C4263.f13799;
        int i8 = ViewOnClickListenerC1958.f6529;
        int iM2566 = C0630.m2566("ۤ᩵") ^ i8;
        int i9 = ((iM2566 ^ i7) * (-10621)) ^ 1378797186;
        int i10 = 2033626841;
        while (true) {
            i6 = ((((i6 ^ i7) * 21913) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -1998893946:
                case -835104701:
                    c = '-';
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("ۜ᩻") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-31033)) ^ 418312800;
                        i10 = -255687957;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ۜۗ")) * 97;
                        i9 = ((iM2566 ^ i7) * 2487) ^ 208827124;
                        i10 = 114245368;
                    }
                    break;
                case -1995633323:
                case 1941460982:
                    C1773.m5908();
                    return null;
                case -1974843881:
                case -1204307237:
                    C3019.m9255();
                    if (!C2126.f7087) {
                        iM2566 = C2105.m6981("᩶ܳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    } else {
                        iM2566 = C0630.m2566("ܽۛ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 19445) ^ 1675619624;
                        i10 = 2097235393;
                    }
                    break;
                case -1658992220:
                case -1510432594:
                    i = s * s2;
                    i2 = s * s;
                    if (C0382.f1805) {
                        iM2566 = (C2105.m6981("ۨ᩹") ^ i8) * (-37);
                        i9 = ((iM2566 ^ i7) * (-2213)) ^ (-1979342568);
                        i10 = 360181902;
                    } else {
                        iM2566 = C0630.m2566("ܽۛ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 19445) ^ 1675619624;
                        i10 = 2097235393;
                    }
                    break;
                case -1528706621:
                case -228715101:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("ۘۛ") + i7) * 13;
                        i9 = ((iM2566 ^ i8) * (-2917)) ^ (-2134857660);
                        i10 = 277777652;
                    } else {
                        iM2566 = C2105.m6981("᩶ܳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    }
                    break;
                case -926272602:
                case -829763437:
                    return AbstractC2021.m6573(sArr2, i5, 20, i4);
                case -924861189:
                case 41776483:
                    if (C3019.f9544 < 0) {
                        iM2566 = C2105.m6981("ۜ᩻") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-31033)) ^ 418312800;
                        i10 = -255687957;
                    } else {
                        iM2566 = C2105.m6981("᩶ܳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    }
                    break;
                case -898251391:
                case 2084878451:
                    if ((i2 + i3) - i < 0) {
                        iM2566 = (i7 - C0630.m2566("ۛۧ")) * 27;
                        i9 = ((iM2566 ^ i8) * (-30667)) ^ 556007263;
                        i10 = 1593931559;
                    } else {
                        iM2566 = (C2105.m6981("ۖܿ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM2566 ^ i7) * (-29771)) ^ (-1243131948);
                        i10 = 962982777;
                    }
                    break;
                case -840986885:
                case 1726687002:
                    sArr2 = f74397;
                    i5 = 46;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (C2105.m6981("ۖۖ") ^ i7) * 25;
                        i9 = ((iM2566 ^ i8) * 4337) ^ 660235063;
                        i10 = -708022957;
                    } else {
                        iM2566 = C0630.m2566("۬ۧ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 32571) ^ 1618591801;
                        i10 = -86629184;
                    }
                    break;
                case -758288813:
                case -627030541:
                    i4 = 24781;
                    iM2566 = (i8 - C0630.m2566("ۙ᩸")) * 127;
                    i9 = ((iM2566 ^ i7) * 25139) ^ 302257409;
                    i10 = 1894221939;
                    break;
                case -576658411:
                case -384328265:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C0630.m2566("ܽۛ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 19445) ^ 1675619624;
                        i10 = 2097235393;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ۢۛ")) * (-37);
                        i9 = ((iM2566 ^ i8) * 5083) ^ 156348728;
                        i10 = 433810634;
                    }
                    break;
                case -453650571:
                case 690095816:
                    C1711.m5736();
                    C7106.m19120();
                    iM2566 = C2105.m6981("᩶ܳ") ^ i8;
                    i9 = ((iM2566 ^ i7) * (-12073)) ^ 1547671277;
                    i10 = 664324284;
                    break;
                case -404672060:
                case 2088546172:
                    s = sArr[c];
                    s2 = 6760;
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C2105.m6981("ۖۖ") ^ i7) * 25;
                        i9 = ((iM2566 ^ i8) * 4337) ^ 660235063;
                        i10 = -708022957;
                    } else {
                        iM2566 = C2105.m6981("ۛ۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * 2033) ^ 1809321589;
                        i10 = -1851501834;
                    }
                    break;
                case -111040621:
                case 399710812:
                    if (C5695.m16023() >= 0) {
                        iM2566 = C2105.m6981("᩶ܳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    } else {
                        iM2566 = C2105.m6981("ܳܺ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-19871)) ^ (-1083502480);
                        i10 = 1987963555;
                    }
                    break;
                case 159616599:
                case 756415231:
                    sArr = f74397;
                    if (RunnableC1108.m3790()) {
                        iM2566 = (C2105.m6981("ۘۛ") + i7) * 13;
                        i9 = ((iM2566 ^ i8) * (-2917)) ^ (-2134857660);
                        i10 = 277777652;
                    } else {
                        iM2566 = (C0630.m2566("۟ۨ") ^ i7) * 85;
                        i9 = ((iM2566 ^ i8) * 26757) ^ (-1385452955);
                        i10 = 1963950153;
                    }
                    break;
                case 549228795:
                case 576628979:
                    if (C1420.m4913()) {
                        iM2566 = C2105.m6981("᩶ܳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩸") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-25203)) ^ (-777517680);
                        i10 = -1988096441;
                    }
                    break;
                case 728375589:
                case 1119275481:
                    i4 = 63518;
                    iM2566 = (i8 - C0630.m2566("ۙ᩸")) * 127;
                    i9 = ((iM2566 ^ i7) * 25139) ^ 302257409;
                    i10 = 1894221939;
                    break;
                case 1723734513:
                case 1997966783:
                    if (C1916.m6308() >= 0) {
                        iM2566 = C2105.m6981("᩶ܳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    } else {
                        iM2566 = (C0630.m2566("ۨ۠") ^ i7) * 71;
                        i9 = ((iM2566 ^ i8) * (-8747)) ^ 866926486;
                        i10 = 219373622;
                    }
                    break;
                default:
                    i3 = 11424400;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("ۜ᩻") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-31033)) ^ 418312800;
                        i10 = -255687957;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۜ") ^ i7) * 63;
                        i9 = ((iM2566 ^ i8) * 16635) ^ (-772462763);
                        i10 = -1625175807;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        C5484 c5484 = null;
        int i = 164434352;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C3245.f10203;
        int iM6981 = (i3 - C2105.m6981("ۖ᩶")) * (-65);
        int i4 = ((iM6981 ^ i2) * 16159) ^ 1592397061;
        int i5 = 1580845289;
        while (true) {
            i = ((((i ^ i2) * 26993) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2117880724:
                case 1632951057:
                    super.onDestroy();
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C0630.m2566("ۙ֫") + i2) * (-41);
                        i4 = ((iM6981 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    } else {
                        iM6981 = C0630.m2566("ܶ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12443) ^ (-193841558);
                        i5 = -1202393202;
                    }
                    break;
                case -2021415870:
                case -1514043645:
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = (C0630.m2566("ۙ֫") + i2) * (-41);
                        i4 = ((iM6981 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    } else {
                        iM6981 = C0630.m2566("ᩴ᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * 247) ^ 1623360391;
                        i5 = 1258686431;
                    }
                    break;
                case -1946413662:
                case -363912608:
                    if (C0237.m1481() >= 0) {
                        iM6981 = (C0630.m2566("ܽܶ") + i3) * 73;
                        i4 = ((iM6981 ^ i2) * (-26659)) ^ (-880792925);
                        i5 = -1024439324;
                    } else {
                        iM6981 = (C0630.m2566("ۜܿ") ^ i2) * (-23);
                        i4 = ((iM6981 ^ i3) * 23021) ^ (-123402547);
                        i5 = 463014788;
                    }
                    break;
                case -1925122971:
                case -1370236081:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("ۙ֫") + i2) * (-41);
                        i4 = ((iM6981 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    } else {
                        iM6981 = C2105.m6981("ۨۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 13587) ^ 122382768;
                        i5 = -301193870;
                    }
                    break;
                case -1780208750:
                case 386969776:
                    if (C0382.m1848()) {
                        iM6981 = (C0630.m2566("֫᩹") ^ i2) * 93;
                        i4 = ((iM6981 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM6981 = C2105.m6981("᩷֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17423)) ^ (-1472426531);
                        i5 = 1898141016;
                    }
                    break;
                case -1646814660:
                case 2088755629:
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C0630.m2566("ۙ֫") + i2) * (-41);
                        i4 = ((iM6981 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    } else {
                        iM6981 = C0630.m2566("ۤ᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5909) ^ (-962065789);
                        i5 = 536141793;
                    }
                    break;
                case -1601849806:
                case -978648496:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C0630.m2566("֫᩹") ^ i2) * 93;
                        i4 = ((iM6981 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM6981 = C0630.m2566("ۙܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32325) ^ (-1093037173);
                        i5 = 1050320726;
                    }
                    break;
                case -1502517487:
                case -764563033:
                    if (C0237.f1507 != 0) {
                        iM6981 = (C0630.m2566("֫᩹") ^ i2) * 93;
                        i4 = ((iM6981 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM6981 = C0630.m2566("ܰᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14431)) ^ (-1269953794);
                        i5 = 896078236;
                    }
                    break;
                case -864706070:
                case 421114978:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C0630.m2566("֫᩹") ^ i2) * 93;
                        i4 = ((iM6981 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩶ۖ")) * 43;
                        i4 = ((iM6981 ^ i2) * (-28739)) ^ (-1373028694);
                        i5 = 1767071018;
                    }
                    break;
                case -775844195:
                case 1601155089:
                    c5484 = this.f74399;
                    if (c5484 != null) {
                        iM6981 = C0630.m2566("ۚۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2475)) ^ 201345695;
                        i5 = 1510106040;
                    } else {
                        iM6981 = C0630.m2566("ܿۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1023) ^ 1322459581;
                        i5 = -1669616841;
                    }
                    break;
                case 60217449:
                case 135833864:
                    C3245.m9925();
                    C3683.m11222();
                    iM6981 = (C0630.m2566("ܽܶ") + i3) * 73;
                    i4 = ((iM6981 ^ i2) * (-26659)) ^ (-880792925);
                    i5 = -1024439324;
                    break;
                case 371985325:
                case 1305161787:
                    C3746.m11369();
                    break;
                case 1032681368:
                case 1194069414:
                    if (C2272.f7362) {
                        iM6981 = (i3 - C0630.m2566("ۛۜ")) * (-125);
                        i4 = ((iM6981 ^ i2) * (-22251)) ^ 1703648904;
                        i5 = -1398188073;
                    } else {
                        iM6981 = C0630.m2566("᩶ۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4147)) ^ (-1899373221);
                        i5 = -1281655222;
                    }
                    break;
                case 1129844430:
                case 1769738546:
                    C0964.m3413();
                    if (!C0798.f2919) {
                        iM6981 = (C0630.m2566("֫᩹") ^ i2) * 93;
                        i4 = ((iM6981 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM6981 = (C0630.m2566("ۙ֫") + i2) * (-41);
                        i4 = ((iM6981 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    }
                    break;
                case 1420026106:
                case 1615997796:
                    if (C0798.m2998() != 0) {
                        iM6981 = (C0630.m2566("֫᩹") ^ i2) * 93;
                        i4 = ((iM6981 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM6981 = (C0630.m2566("ۚۜ") ^ i3) * (-21);
                        i4 = ((iM6981 ^ i2) * (-7667)) ^ (-1294186716);
                        i5 = -1477171156;
                    }
                    break;
                case 1422156060:
                case 1888270798:
                    break;
                case 1893104515:
                case 2021384337:
                    c5484.m15591();
                    iM6981 = C0630.m2566("ܿۨ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 1023) ^ 1322459581;
                    i5 = -1669616841;
                    break;
                default:
                    if (C7811.m20844() != 0) {
                        iM6981 = (C0630.m2566("ۙ֫") + i2) * (-41);
                        i4 = ((iM6981 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    } else {
                        iM6981 = (C0630.m2566("ܽܶ") + i3) * 73;
                        i4 = ((iM6981 ^ i2) * (-26659)) ^ (-880792925);
                        i5 = -1024439324;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM2566;
        int i;
        int i2;
        C11855 c11855;
        int iM2567;
        int i3;
        int i4;
        C11855 c11856;
        short[] sArr;
        C11815 c11815;
        int i5;
        int iM2568;
        int i6;
        int i7;
        int iM6981;
        int i8;
        int i9;
        C11855 c11857;
        ActivityC23143 activityC23143 = this;
        ViewOnClickListenerC14274 viewOnClickListenerC14274 = null;
        C9762 c9762 = null;
        C23592 c23592 = null;
        int i10 = 0;
        C5484 c5484 = null;
        C16772 c16772 = null;
        C23592 c23593 = null;
        TabLayout tabLayout = null;
        C0452 c0452 = null;
        C10444 c10444 = null;
        int i11 = 0;
        String strM948 = null;
        String strM12817 = null;
        int iM6982 = 0;
        int iM6983 = 0;
        short s = 0;
        int i12 = 0;
        int i13 = 1391051687;
        int i14 = C0630.f2410;
        int i15 = C1047.f3863;
        int iM6984 = (C2105.m6981("֨ܰ") + i15) * (-59);
        int i16 = ((iM6984 ^ i14) * 32139) ^ 748178390;
        int i17 = iM6984 ^ 1393159816;
        C11855 c11858 = null;
        C9762 c9763 = null;
        short[] sArr2 = null;
        int i18 = 0;
        int i19 = 0;
        int iM2569 = 0;
        View viewM12813 = null;
        int i20 = 0;
        int i21 = 0;
        C11815 onBackPressedDispatcher = null;
        short[] sArr3 = null;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * (-25471)) >> 31));
            switch (i13) {
                case -1914614244:
                case 105150387:
                    if (C1047.m3599() >= 0) {
                        i10 = i10;
                        c9763 = c9763;
                        sArr2 = sArr2;
                        i20 = i20;
                        sArr3 = sArr3;
                        i5 = i21;
                        C11855 c11859 = c11858;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c11855 = c11859;
                        iM2568 = (C0630.m2566("۠᩵") + i15) * (-19);
                        i21 = i5;
                        i6 = ((iM2568 ^ i14) * 617) ^ 468090963;
                        i7 = -1697206091;
                        i17 = iM2568 ^ i7;
                        i16 = i6;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c9763 = c9763;
                        C11815 c11816 = onBackPressedDispatcher;
                        c11858 = c11855;
                        onBackPressedDispatcher = c11816;
                    }
                    i10 = i10;
                    sArr3 = sArr3;
                    C11855 c118510 = c11858;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c11855 = c118510;
                    iM2567 = C2105.m6981("ܽ᩻") ^ i14;
                    i16 = ((iM2567 ^ i15) * 26365) ^ (-2010429631);
                    i3 = -1686151745;
                    i17 = iM2567 ^ i3;
                    activityC23143 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c9763 = c9763;
                    C11815 c11817 = onBackPressedDispatcher;
                    c11858 = c11855;
                    onBackPressedDispatcher = c11817;
                    break;
                case -1865573491:
                case 781056526:
                    c0452.m2043(i10);
                    i10 = i10;
                    iM6981 = C2105.m6981("۠ۤ") ^ i14;
                    i8 = ((iM6981 ^ i15) * (-29765)) ^ (-1202953065);
                    i9 = -1111466659;
                    i17 = iM6981 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case -1777455205:
                case 1622534282:
                    i10 = i10;
                    iM6983 = C2105.m6981(C2126.m7036(f74397, 19, 3, i19));
                    iM6981 = C2105.m6981("ۙ᩷") ^ i15;
                    i8 = ((iM6981 ^ i14) * (-23091)) ^ 856080857;
                    i9 = -71320301;
                    i17 = iM6981 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case -1530550293:
                case 1073563778:
                    if (C1916.m6308() >= 0) {
                        i4 = i10;
                        c11856 = c11858;
                        c9763 = c9763;
                        sArr = sArr3;
                        c11815 = onBackPressedDispatcher;
                        int iM6985 = (C2105.m6981("ܽۗ") + i14) * 27;
                        c11857 = c11856;
                        i16 = ((iM6985 ^ i15) * 17001) ^ (-2135580098);
                        i17 = iM6985 ^ 488690076;
                        c11858 = c11857;
                        i10 = i4;
                        onBackPressedDispatcher = c11815;
                        sArr3 = sArr;
                        c9763 = c9763;
                    } else {
                        i10 = i10;
                        sArr3 = sArr3;
                        C11855 c118511 = c11858;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c11855 = c118511;
                        iM2567 = C2105.m6981("ܽ᩻") ^ i14;
                        i16 = ((iM2567 ^ i15) * 26365) ^ (-2010429631);
                        i3 = -1686151745;
                        i17 = iM2567 ^ i3;
                        activityC23143 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c9763 = c9763;
                        C11815 c11818 = onBackPressedDispatcher;
                        c11858 = c11855;
                        onBackPressedDispatcher = c11818;
                    }
                    break;
                case -1360452743:
                case 1316925368:
                    activityC23143.f74398 = c23592;
                    i10 = 1;
                    c23592.m52056(true);
                    activityC23143.f74399 = new C5484(activityC23143);
                    if (C3911.f12484 < 0) {
                        activityC23143.f74402 = new C13244(activityC23143);
                        activityC23143.f74401 = new C16772(activityC23143);
                        c5484 = activityC23143.f74399;
                        if (C2105.f7037 == 0) {
                            iM2566 = (i15 - C0630.m2566("᩺ۢ")) * 63;
                            i = ((iM2566 ^ i14) * 15991) ^ (-96085237);
                            i2 = 450366548;
                            i17 = iM2566 ^ i2;
                            i16 = i;
                        } else {
                            i10 = 1;
                            sArr3 = sArr3;
                            C11855 c118512 = c11858;
                            onBackPressedDispatcher = onBackPressedDispatcher;
                            c11855 = c118512;
                            iM2567 = C2105.m6981("ܽ᩻") ^ i14;
                            i16 = ((iM2567 ^ i15) * 26365) ^ (-2010429631);
                            i3 = -1686151745;
                            i17 = iM2567 ^ i3;
                            activityC23143 = this;
                            i20 = i20;
                            sArr3 = sArr3;
                            i10 = i10;
                            i21 = i21;
                            sArr2 = sArr2;
                            c9763 = c9763;
                            C11815 c11819 = onBackPressedDispatcher;
                            c11858 = c11855;
                            onBackPressedDispatcher = c11819;
                        }
                    } else {
                        i10 = 1;
                        sArr3 = sArr3;
                        int iM25610 = C0630.m2566("᩹᩷") ^ i15;
                        i16 = ((iM25610 ^ i14) * (-20467)) ^ (-897516524);
                        i17 = iM25610 ^ (-1299840267);
                        activityC23143 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c9763 = c9763;
                    }
                    break;
                case -1345804705:
                case -714757589:
                    i10 = i10;
                    c5484.m15592(new RunnableC12560(0, activityC23143));
                    c16772 = activityC23143.f74401;
                    c23593 = activityC23143.f74398;
                    RunnableC3474.m10618(c16772);
                    iM6981 = C0630.m2566("ۖۜ") ^ i14;
                    i8 = ((iM6981 ^ i15) * 29463) ^ 636562489;
                    i9 = -409962651;
                    i17 = iM6981 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case -1323666297:
                case 1096851184:
                    sArr = sArr3;
                    i4 = i10;
                    c11815 = onBackPressedDispatcher;
                    c11856 = c11858;
                    c11815.m28891(c11856);
                    C0483.m2125(this);
                    c9763 = activityC23143.f10584;
                    viewOnClickListenerC14274 = new ViewOnClickListenerC14274(5, activityC23143);
                    if (C4159.f13567) {
                        c11857 = c11856;
                        int iM25611 = (C0630.m2566("ۤ᩷") ^ i15) * 61;
                        i17 = iM25611 ^ (-409548554);
                        i16 = ((iM25611 ^ i14) * 29353) ^ 1980195692;
                    } else {
                        int iM6986 = (C2105.m6981("ܽۗ") + i14) * 27;
                        c11857 = c11856;
                        i16 = ((iM6986 ^ i15) * 17001) ^ (-2135580098);
                        i17 = iM6986 ^ 488690076;
                    }
                    c11858 = c11857;
                    i10 = i4;
                    onBackPressedDispatcher = c11815;
                    sArr3 = sArr;
                    c9763 = c9763;
                    break;
                case -1314839142:
                case 90888645:
                    i10 = i10;
                    c0452.m2029(c10444);
                    tabLayout.setupWithViewPager(c0452);
                    c0452.m2028(new C6210(activityC23143));
                    if (C4715.m13816()) {
                        iM6981 = C2105.m6981("֨᩹") ^ i15;
                        i8 = ((iM6981 ^ i14) * 4687) ^ 386569953;
                        i9 = 498423605;
                    } else {
                        iM6981 = C2105.m6981("۠ۤ") ^ i14;
                        i8 = ((iM6981 ^ i15) * (-29765)) ^ (-1202953065);
                        i9 = -1111466659;
                    }
                    i17 = iM6981 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case -1259086238:
                case -129526991:
                    i10 = i10;
                    c9763 = c9763;
                    short[] sArr4 = sArr2;
                    i20 = i20;
                    sArr3 = sArr3;
                    i5 = i21;
                    C11855 c118513 = c11858;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c11855 = c118513;
                    sArr2 = sArr4;
                    viewM12813 = C4263.m12813(activityC23143, C0630.m2566(C0630.m2575(sArr4, i20, i5, i19)) ^ 2099798760);
                    if (C1420.f5096 <= 0) {
                        iM2568 = (C0630.m2566("۠᩵") + i15) * (-19);
                        i21 = i5;
                        i6 = ((iM2568 ^ i14) * 617) ^ 468090963;
                        i7 = -1697206091;
                    } else {
                        i21 = i5;
                        iM2568 = C0630.m2566("֡᩻") ^ i14;
                        i6 = ((iM2568 ^ i15) * (-5779)) ^ (-1878506862);
                        i7 = 1742510050;
                    }
                    i17 = iM2568 ^ i7;
                    i16 = i6;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c9763 = c9763;
                    C11815 c118110 = onBackPressedDispatcher;
                    c11858 = c11855;
                    onBackPressedDispatcher = c118110;
                    break;
                case -1121959195:
                case -937139917:
                    i10 = i10;
                    c23593.m52055(new C10259(c16772));
                    sArr3 = f74397;
                    i18 = 13;
                    if (!C2167.m7155()) {
                        iM6981 = (C2105.m6981("ۡۤ") ^ i15) * 21;
                        i8 = ((iM6981 ^ i14) * (-23265)) ^ 1767167527;
                        i9 = 1744816586;
                        i17 = iM6981 ^ i9;
                        i16 = i8;
                        i10 = i10;
                    } else {
                        c9763 = c9763;
                        sArr2 = sArr2;
                        i20 = i20;
                        sArr3 = sArr3;
                        i5 = i21;
                        C11855 c118514 = c11858;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c11855 = c118514;
                        iM2568 = (C0630.m2566("۠᩵") + i15) * (-19);
                        i21 = i5;
                        i6 = ((iM2568 ^ i14) * 617) ^ 468090963;
                        i7 = -1697206091;
                        i17 = iM2568 ^ i7;
                        i16 = i6;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c9763 = c9763;
                        C11815 c118111 = onBackPressedDispatcher;
                        c11858 = c11855;
                        onBackPressedDispatcher = c118111;
                    }
                    break;
                case -1097020597:
                case -1043380185:
                    C1504.m5179();
                    C4616.m13552();
                    break;
                case -1076439171:
                case 108409262:
                    i10 = i10;
                    c23592 = (C23592) C1005.m3507(c9762, C0630.m2566(strM12817) ^ 2119493921);
                    if (!C0798.f2919) {
                        iM6981 = C0630.m2566("᩶ۛ") ^ i14;
                        i8 = ((iM6981 ^ i15) * 3759) ^ 1230372119;
                        i9 = -195365094;
                        i17 = iM6981 ^ i9;
                        i16 = i8;
                        i10 = i10;
                    } else {
                        sArr3 = sArr3;
                        int iM25612 = C0630.m2566("᩹᩷") ^ i15;
                        i16 = ((iM25612 ^ i14) * (-20467)) ^ (-897516524);
                        i17 = iM25612 ^ (-1299840267);
                        activityC23143 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c9763 = c9763;
                    }
                    break;
                case -930443780:
                case 1380234980:
                    i10 = i10;
                    c9763 = c9763;
                    RunnableC3474.m10625(c9763, viewOnClickListenerC14274);
                    c9762 = activityC23143.f10584;
                    sArr3 = sArr3;
                    strM12817 = C4263.m12817(f74397, 10, 3, i19);
                    int iM25613 = (i14 - C0630.m2566("ۡۙ")) * (-31);
                    i17 = iM25613 ^ (-1149535725);
                    i16 = ((iM25613 ^ i15) * (-14689)) ^ (-1979637622);
                    sArr3 = sArr3;
                    i10 = i10;
                    c9763 = c9763;
                    break;
                case -901740966:
                case 942830019:
                    c11855 = c11858;
                    i19 = 32925;
                    iM2567 = (i14 - C2105.m6981("ۤۤ")) * (-67);
                    i16 = ((iM2567 ^ i15) * (-17087)) ^ (-1539608669);
                    i3 = 1648287351;
                    i17 = iM2567 ^ i3;
                    activityC23143 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c9763 = c9763;
                    C11815 c118112 = onBackPressedDispatcher;
                    c11858 = c11855;
                    onBackPressedDispatcher = c118112;
                    break;
                case -879274480:
                case 798944356:
                    c11855 = c11858;
                    i19 = 30109;
                    iM2567 = (i14 - C2105.m6981("ۤۤ")) * (-67);
                    i16 = ((iM2567 ^ i15) * (-17087)) ^ (-1539608669);
                    i3 = 1648287351;
                    i17 = iM2567 ^ i3;
                    activityC23143 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c9763 = c9763;
                    C11815 c118113 = onBackPressedDispatcher;
                    c11858 = c11855;
                    onBackPressedDispatcher = c118113;
                    break;
                case -812463974:
                case 908411389:
                    C9762 c9764 = c9763;
                    short[] sArr5 = sArr3;
                    C11855 c118515 = c11858;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c11855 = c118515;
                    short s2 = f74397[0];
                    int i22 = s2 * 19916;
                    int iM25614 = (C0630.m2566("ۖܶ") ^ i14) * (-105);
                    s = s2;
                    int i23 = ((iM25614 ^ i15) * 13171) ^ 19779188;
                    i17 = iM25614 ^ 1005979332;
                    i12 = i22;
                    i20 = i20;
                    sArr3 = sArr5;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    i16 = i23;
                    c9763 = c9764;
                    activityC23143 = this;
                    C11815 c118114 = onBackPressedDispatcher;
                    c11858 = c11855;
                    onBackPressedDispatcher = c118114;
                    break;
                case -671158736:
                case 489603295:
                    c9763 = c9763;
                    C11855 c118516 = c11858;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c11855 = c118516;
                    C0964.m3409(activityC23143, C0630.m2566(strM948) ^ 2128970355);
                    sArr2 = f74397;
                    i20 = 7;
                    i21 = 3;
                    int iM25615 = (i15 - C0630.m2566("ۡ۬")) * 11;
                    i17 = iM25615 ^ (-1595073592);
                    i16 = ((iM25615 ^ i14) * 8105) ^ 1150854303;
                    sArr3 = sArr3;
                    i10 = i10;
                    c9763 = c9763;
                    C11815 c118115 = onBackPressedDispatcher;
                    c11858 = c11855;
                    onBackPressedDispatcher = c118115;
                    break;
                case -430442683:
                case 140992079:
                    C0422.m1963();
                    i10 = i10;
                    sArr3 = sArr3;
                    C11855 c118517 = c11858;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c11855 = c118517;
                    iM2567 = C2105.m6981("ܽ᩻") ^ i14;
                    i16 = ((iM2567 ^ i15) * 26365) ^ (-2010429631);
                    i3 = -1686151745;
                    i17 = iM2567 ^ i3;
                    activityC23143 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c9763 = c9763;
                    C11815 c118116 = onBackPressedDispatcher;
                    c11858 = c11855;
                    onBackPressedDispatcher = c118116;
                    break;
                case -412062177:
                case 1094836449:
                    break;
                case -196244992:
                case 1992775364:
                    C3663.m11161(iM6983 ^ 2127101602);
                    RunnableC1108.m3781(this);
                    break;
                case -162757394:
                case 791959171:
                    i10 = i10;
                    c9763 = c9763;
                    sArr2 = sArr2;
                    i20 = i20;
                    i21 = i21;
                    sArr3 = sArr3;
                    C11855 c118518 = c11858;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c11855 = c118518;
                    if (i12 - ((s * s) + 99161764) > 0) {
                        iM2567 = (C2105.m6981("֨ܽ") + i15) * 47;
                        i16 = ((iM2567 ^ i14) * 8479) ^ 1404381672;
                        i3 = 851301810;
                    } else {
                        iM2567 = C2105.m6981("ۚ֨") ^ i15;
                        i16 = ((iM2567 ^ i14) * (-1897)) ^ (-136205074);
                        i3 = -1253396828;
                    }
                    i17 = iM2567 ^ i3;
                    activityC23143 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c9763 = c9763;
                    C11815 c118117 = onBackPressedDispatcher;
                    c11858 = c11855;
                    onBackPressedDispatcher = c118117;
                    break;
                case -84812745:
                case 1993605804:
                    i10 = i10;
                    c9763 = c9763;
                    sArr2 = sArr2;
                    i20 = i20;
                    i21 = i21;
                    sArr3 = sArr3;
                    C11855 c118519 = c11858;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c11855 = c118519;
                    m10214();
                    iM2569 = C0630.m2566(C2272.m7507(f74397, 1, 3, i19));
                    i11 = 2127337943;
                    if (C1420.f5096 > 0) {
                        iM2567 = (C0630.m2566("ܽۛ") ^ i14) * (-31);
                        i16 = ((iM2567 ^ i15) * (-30085)) ^ 1902235842;
                        i3 = 1875782856;
                        i17 = iM2567 ^ i3;
                        activityC23143 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c9763 = c9763;
                        C11815 c118118 = onBackPressedDispatcher;
                        c11858 = c11855;
                        onBackPressedDispatcher = c118118;
                    } else {
                        c11858 = c11855;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        int iM25616 = C0630.m2566("᩹᩷") ^ i15;
                        i16 = ((iM25616 ^ i14) * (-20467)) ^ (-897516524);
                        i17 = iM25616 ^ (-1299840267);
                        activityC23143 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c9763 = c9763;
                    }
                    break;
                case -48882984:
                case 102678227:
                    i10 = i10;
                    tabLayout = (TabLayout) C4263.m12813(activityC23143, C2105.m6981(C2167.m7159(sArr3, i18, 3, i19)) ^ 2123462516);
                    iM6981 = C0630.m2566("ۢ۬") ^ i15;
                    i8 = ((iM6981 ^ i14) * 12463) ^ 1855651414;
                    i9 = -1740030966;
                    i17 = iM6981 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case 32555229:
                case 1355419937:
                    i10 = i10;
                    c0452 = (C0452) C4263.m12813(activityC23143, iM6982 ^ 2123985548);
                    c10444 = new C10444(activityC23143);
                    iM6981 = (C2105.m6981("֡ۤ") ^ i15) * (-103);
                    i8 = ((iM6981 ^ i14) * (-9181)) ^ 806914539;
                    i9 = -1513091488;
                    i17 = iM6981 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case 355591465:
                case 2008745076:
                    i10 = i10;
                    iM6982 = C2105.m6981(C2126.m7036(f74397, 16, 3, i19));
                    if (C3245.f10203 > 0) {
                        iM6981 = (i14 - C0630.m2566("᩹֨")) * (-95);
                        i8 = ((iM6981 ^ i15) * 26333) ^ 1674077050;
                        i9 = 1484331146;
                        i17 = iM6981 ^ i9;
                        i16 = i8;
                        i10 = i10;
                    } else {
                        sArr3 = sArr3;
                        C11855 c1185110 = c11858;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c11855 = c1185110;
                        iM2567 = C2105.m6981("ܽ᩻") ^ i14;
                        i16 = ((iM2567 ^ i15) * 26365) ^ (-2010429631);
                        i3 = -1686151745;
                        i17 = iM2567 ^ i3;
                        activityC23143 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c9763 = c9763;
                        C11815 c118119 = onBackPressedDispatcher;
                        c11858 = c11855;
                        onBackPressedDispatcher = c118119;
                    }
                    break;
                case 450060691:
                case 535213216:
                    RunnableC0588.m2441();
                    if (!C2126.f7087) {
                        iM2566 = (C0630.m2566("᩻֨") + i14) * 57;
                        i = ((iM2566 ^ i15) * 21745) ^ (-2065452424);
                        i2 = -733300546;
                        i17 = iM2566 ^ i2;
                        i16 = i;
                    } else {
                        i10 = i10;
                        sArr3 = sArr3;
                        C11855 c1185111 = c11858;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c11855 = c1185111;
                        iM2567 = C2105.m6981("ܽ᩻") ^ i14;
                        i16 = ((iM2567 ^ i15) * 26365) ^ (-2010429631);
                        i3 = -1686151745;
                        i17 = iM2567 ^ i3;
                        activityC23143 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c9763 = c9763;
                        C11815 c1181110 = onBackPressedDispatcher;
                        c11858 = c11855;
                        onBackPressedDispatcher = c1181110;
                    }
                    break;
                case 941245273:
                case 1801508272:
                    i10 = i10;
                    c9763 = c9763;
                    sArr2 = sArr2;
                    i20 = i20;
                    i21 = i21;
                    sArr3 = sArr3;
                    C11855 c118520 = c11858;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c11855 = c118520;
                    C4263.m12813(activityC23143, iM2569 ^ i11);
                    strM948 = C0050.m948(f74397, 4, 3, i19);
                    if (C2272.f7362) {
                        iM2567 = C2105.m6981("ܽ᩻") ^ i14;
                        i16 = ((iM2567 ^ i15) * 26365) ^ (-2010429631);
                        i3 = -1686151745;
                    } else {
                        iM2567 = C0630.m2566("֫ۛ") ^ i14;
                        i16 = ((iM2567 ^ i15) * 19777) ^ (-954936944);
                        i3 = -1924220954;
                    }
                    i17 = iM2567 ^ i3;
                    activityC23143 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c9763 = c9763;
                    C11815 c1181111 = onBackPressedDispatcher;
                    c11858 = c11855;
                    onBackPressedDispatcher = c1181111;
                    break;
                case 1030533214:
                case 1215382397:
                    i10 = i10;
                    c9763 = c9763;
                    sArr3 = sArr3;
                    C9762 c9765 = (C9762) viewM12813;
                    activityC23143.f10584 = c9765;
                    RunnableC1108.m3780(activityC23143, c9765);
                    onBackPressedDispatcher = getOnBackPressedDispatcher();
                    C11855 c118521 = new C11855(activityC23143);
                    AbstractC2021.m6565(onBackPressedDispatcher);
                    if (C0050.f910 < 0) {
                        int iM6987 = C2105.m6981("ۨ۠") ^ i15;
                        i17 = iM6987 ^ (-870824095);
                        c11858 = c118521;
                        i16 = ((iM6987 ^ i14) * (-24317)) ^ (-897306126);
                        sArr3 = sArr3;
                        i10 = i10;
                        c9763 = c9763;
                    } else {
                        c11858 = c118521;
                        sArr2 = sArr2;
                        i20 = i20;
                        i21 = i21;
                        int iM25617 = C0630.m2566("᩹᩷") ^ i15;
                        i16 = ((iM25617 ^ i14) * (-20467)) ^ (-897516524);
                        i17 = iM25617 ^ (-1299840267);
                        activityC23143 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c9763 = c9763;
                    }
                    break;
                default:
                    i10 = i10;
                    c9763 = c9763;
                    sArr2 = sArr2;
                    i20 = i20;
                    i21 = i21;
                    sArr3 = sArr3;
                    C11855 c118522 = c11858;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c11855 = c118522;
                    super.onCreate(bundle);
                    if (C1711.m5729()) {
                        iM2567 = (i15 - C0630.m2566("ܿۘ")) * 69;
                        i16 = ((iM2567 ^ i14) * 13137) ^ (-384601267);
                        i3 = -605368953;
                    } else {
                        iM2567 = (C2105.m6981("᩷ᩴ") ^ i14) * 7;
                        i16 = ((iM2567 ^ i15) * (-19321)) ^ (-1773405859);
                        i3 = -320387930;
                    }
                    i17 = iM2567 ^ i3;
                    activityC23143 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c9763 = c9763;
                    C11815 c1181112 = onBackPressedDispatcher;
                    c11858 = c11855;
                    onBackPressedDispatcher = c1181112;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f4 A[PHI: r4 r5
      0x00f4: PHI (r4v3 android.view.MenuItem) = (r4v2 android.view.MenuItem), (r4v1 android.view.MenuItem) binds: [B:30:0x00dc, B:24:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r5v3 boolean) = (r5v2 boolean), (r5v1 boolean) binds: [B:30:0x00dc, B:24:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02eb A[PHI: r2 r7 r19 r20 r21
      0x02eb: PHI (r2v52 short[]) = (r2v5 short[]), (r2v6 short[]), (r2v50 short[]), (r2v54 short[]) binds: [B:78:0x02e9, B:74:0x02c9, B:117:0x02eb, B:18:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r7v4 int) = (r7v1 int), (r7v1 int), (r7v3 int), (r7v1 int) binds: [B:78:0x02e9, B:74:0x02c9, B:117:0x02eb, B:18:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r19v4 char) = (r19v3 char), (r19v2 char), (r19v2 char), (r19v2 char) binds: [B:78:0x02e9, B:74:0x02c9, B:117:0x02eb, B:18:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r20v4 short) = (r20v2 short), (r20v3 short), (r20v2 short), (r20v2 short) binds: [B:78:0x02e9, B:74:0x02c9, B:117:0x02eb, B:18:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r21v4 short) = (r21v2 short), (r21v3 short), (r21v2 short), (r21v2 short) binds: [B:78:0x02e9, B:74:0x02c9, B:117:0x02eb, B:18:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int iM2567;
        int i4;
        ActivityC23143 activityC23143 = this;
        MenuInflater menuInflater = null;
        MenuItem menuItemM6301 = null;
        boolean z = false;
        boolean z2 = false;
        int iM2568 = 0;
        String strM50602 = null;
        int iM6982 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1513742824;
        int i9 = C3911.f12484;
        int i10 = C22628.f73083;
        int iM2569 = C0630.m2566("ܿۙ") ^ i9;
        int i11 = ((iM2569 ^ i10) * (-7609)) ^ (-640812582);
        int i12 = iM2569 ^ (-189733540);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i16 = 0;
        boolean z3 = false;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-18855)) >> 31));
            switch (i8) {
                case -2062385474:
                case -970648868:
                    i13 = 45415;
                    iM2566 = C2105.m6981("ܿۗ") ^ i10;
                    i = ((iM2566 ^ i9) * 31777) ^ (-155881211);
                    i2 = -89948853;
                    i12 = iM2566 ^ i2;
                    activityC23143 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -2049008780:
                case 1033826451:
                    menuItemM6301 = C1916.m6301(menu, iM6982 ^ i5);
                    activityC23143.f74403 = menuItemM6301;
                    z = true;
                    if (activityC23143.f74400) {
                        iM6981 = C0630.m2566("ۖ۫") ^ i10;
                        i = ((iM6981 ^ i9) * (-17379)) ^ 1761466018;
                        i3 = -1193675729;
                    } else {
                        z2 = z3;
                        iM6981 = C0630.m2566("ۨۖ") ^ i10;
                        i = ((iM6981 ^ i9) * 20751) ^ (-1445115001);
                        i3 = 2000085365;
                    }
                    i12 = iM6981 ^ i3;
                    i11 = i;
                    break;
                case -1970108543:
                case 1951742006:
                    C7106.m19120();
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i9 - C0630.m2566("۠᩷")) * 25;
                        i = ((iM6981 ^ i10) * (-16015)) ^ 225667106;
                        i3 = 420782707;
                        i12 = iM6981 ^ i3;
                        i11 = i;
                    } else {
                        iM2567 = (i10 - C2105.m6981("ۘ֨")) * 25;
                        i11 = ((iM2567 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                        i12 = iM2567 ^ i4;
                        activityC23143 = this;
                    }
                    break;
                case -1925568487:
                case 1097660236:
                    if (activityC23143.f74398.m52061()) {
                        z2 = z3;
                        iM6981 = C0630.m2566("ۨۖ") ^ i10;
                        i = ((iM6981 ^ i9) * 20751) ^ (-1445115001);
                        i3 = 2000085365;
                    } else {
                        iM6981 = C2105.m6981("ܳۜ") ^ i9;
                        i = ((iM6981 ^ i10) * (-17681)) ^ (-1010721228);
                        i3 = -75235733;
                    }
                    i12 = iM6981 ^ i3;
                    i11 = i;
                    break;
                case -1875147038:
                case -1325580093:
                    menuInflater = getMenuInflater();
                    sArr2 = f74397;
                    i14 = 23;
                    if (RunnableC1108.f4040) {
                        iM2567 = C0630.m2566("۫ܿ") ^ i9;
                        i11 = ((iM2567 ^ i10) * (-28325)) ^ 201858535;
                        i4 = -1315326880;
                    } else {
                        iM2567 = (i10 - C2105.m6981("ۘ֨")) * 25;
                        i11 = ((iM2567 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                    }
                    i12 = iM2567 ^ i4;
                    activityC23143 = this;
                    break;
                case -1794904003:
                case 1819432258:
                    C3537.m10746();
                    if (C0630.f2410 > 0) {
                        iM6981 = (C0630.m2566("֡᩶") ^ i10) * (-7);
                        i = ((iM6981 ^ i9) * (-2661)) ^ (-1304649837);
                        i3 = 1295274471;
                        i12 = iM6981 ^ i3;
                        i11 = i;
                    } else {
                        iM2567 = (i10 - C2105.m6981("ۘ֨")) * 25;
                        i11 = ((iM2567 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                        i12 = iM2567 ^ i4;
                        activityC23143 = this;
                    }
                    break;
                case -1505086915:
                case 307438643:
                    sArr2 = sArr2;
                    sArr = f74397;
                    if (C4616.f14690 > 0) {
                        iM2566 = (C2105.m6981("ۢ᩺") + i9) * (-11);
                        i = ((iM2566 ^ i10) * 28711) ^ 284220779;
                        i2 = -350449833;
                        i12 = iM2566 ^ i2;
                        activityC23143 = this;
                        sArr2 = sArr2;
                        i11 = i;
                    } else {
                        sArr2 = sArr2;
                        iM2567 = (i10 - C2105.m6981("ۘ֨")) * 25;
                        i11 = ((iM2567 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                        i12 = iM2567 ^ i4;
                        activityC23143 = this;
                    }
                    break;
                case -1439208293:
                case -817849136:
                    sArr2 = sArr2;
                    z3 = false;
                    if (C1711.m5729()) {
                        iM2566 = (C2105.m6981("۠ܶ") ^ i9) * (-91);
                        i = ((iM2566 ^ i10) * (-29075)) ^ 780492029;
                        i2 = 1544243948;
                    } else {
                        iM2566 = (i9 - C0630.m2566("ܺۜ")) * (-25);
                        i = ((iM2566 ^ i10) * 24725) ^ (-1733734586);
                        i2 = -1747595952;
                    }
                    i12 = iM2566 ^ i2;
                    activityC23143 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -979877005:
                case -13663866:
                    sArr2 = sArr2;
                    c = 22;
                    if (C7106.f21815 != 0) {
                        iM2566 = (C0630.m2566("۫᩻") + i9) * 67;
                        i = ((iM2566 ^ i10) * (-7273)) ^ (-1682040842);
                        i2 = 470756420;
                    } else {
                        iM2566 = C0630.m2566("ۢᩳ") ^ i10;
                        i = ((iM2566 ^ i9) * 1177) ^ (-1896026536);
                        i2 = -888106745;
                    }
                    i12 = iM2566 ^ i2;
                    activityC23143 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -923256240:
                case 1467633601:
                    sArr2 = sArr2;
                    i15 = 3;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۧۜ") ^ i9;
                        i = ((iM2566 ^ i10) * (-26789)) ^ 1730738886;
                        i2 = 1819376961;
                    } else {
                        iM2566 = (i10 - C2105.m6981("᩺ۚ")) * (-71);
                        i = ((iM2566 ^ i9) * (-19933)) ^ 1487453087;
                        i2 = -113916644;
                    }
                    i12 = iM2566 ^ i2;
                    activityC23143 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -873395071:
                case -164405581:
                    C0382.m1848();
                    if (C2958.f9394 < 0) {
                        sArr2 = sArr2;
                        iM2566 = (C0630.m2566("۫᩻") + i9) * 67;
                        i = ((iM2566 ^ i10) * (-7273)) ^ (-1682040842);
                        i2 = 470756420;
                        i12 = iM2566 ^ i2;
                        activityC23143 = this;
                        sArr2 = sArr2;
                        i11 = i;
                    } else {
                        iM2567 = (i10 - C2105.m6981("ۘ֨")) * 25;
                        i11 = ((iM2567 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                        i12 = iM2567 ^ i4;
                        activityC23143 = this;
                    }
                    break;
                case -775703694:
                case 354834401:
                    strM50602 = C22628.m50602(sArr3, 26, 3, i13);
                    if (C2105.f7037 == 0) {
                        iM6981 = (C2105.m6981("ۢ۫") ^ i10) * 57;
                        i = ((iM6981 ^ i9) * (-855)) ^ (-120959100);
                        i3 = -2044249718;
                        i12 = iM6981 ^ i3;
                        i11 = i;
                    }
                    sArr2 = sArr2;
                    iM2566 = C0630.m2566("ۧۜ") ^ i9;
                    i = ((iM2566 ^ i10) * (-26789)) ^ 1730738886;
                    i2 = 1819376961;
                    i12 = iM2566 ^ i2;
                    activityC23143 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -669162381:
                case 2040305232:
                    iM6982 = C2105.m6981(strM50602);
                    i5 = 2097227061;
                    if (C1047.f3863 >= 0) {
                        iM6981 = (i9 - C0630.m2566("۠᩷")) * 25;
                        i = ((iM6981 ^ i10) * (-16015)) ^ 225667106;
                        i3 = 420782707;
                    } else {
                        iM6981 = (i9 - C0630.m2566("۠ۖ")) * (-103);
                        i = ((iM6981 ^ i10) * (-15543)) ^ 1342496867;
                        i3 = -1624590605;
                    }
                    i12 = iM6981 ^ i3;
                    i11 = i;
                    break;
                case -466807758:
                case 1422467412:
                    menuInflater.inflate(2126769320 ^ iM2568, menu);
                    sArr3 = f74397;
                    if (!C3663.f11553) {
                        iM6981 = C2105.m6981("ۙ֫") ^ i10;
                        i = ((iM6981 ^ i9) * 22307) ^ (-383286497);
                        i3 = 549816560;
                        i12 = iM6981 ^ i3;
                        i11 = i;
                    }
                    sArr2 = sArr2;
                    iM2566 = C0630.m2566("ۧۜ") ^ i9;
                    i = ((iM2566 ^ i10) * (-26789)) ^ 1730738886;
                    i2 = 1819376961;
                    i12 = iM2566 ^ i2;
                    activityC23143 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -466478763:
                case -209737267:
                    return z3;
                case -136616585:
                case 900538834:
                    sArr2 = sArr2;
                    iM2568 = C0630.m2566(C3537.m10748(sArr2, i14, i15, i13));
                    if (C7811.f24123 < 0) {
                        int iM6983 = (C2105.m6981("ۖ۬") ^ i9) * (-17);
                        i12 = iM6983 ^ 1324426047;
                        sArr2 = sArr2;
                        i11 = ((iM6983 ^ i10) * (-29063)) ^ (-1874417640);
                        activityC23143 = this;
                    } else {
                        iM2566 = (C0630.m2566("۫᩻") + i9) * 67;
                        i = ((iM2566 ^ i10) * (-7273)) ^ (-1682040842);
                        i2 = 470756420;
                        i12 = iM2566 ^ i2;
                        activityC23143 = this;
                        sArr2 = sArr2;
                        i11 = i;
                    }
                    break;
                case -17598411:
                case 1857551394:
                    sArr2 = sArr2;
                    s = sArr[c];
                    s2 = 406;
                    if (RunnableC1108.f4040) {
                        iM2566 = (C0630.m2566("ᩴ۬") ^ i9) * (-97);
                        i = ((iM2566 ^ i10) * (-29337)) ^ 755413837;
                        i2 = -1113081735;
                    } else {
                        iM2566 = (C0630.m2566("۫᩻") + i9) * 67;
                        i = ((iM2566 ^ i10) * (-7273)) ^ (-1682040842);
                        i2 = 470756420;
                    }
                    i12 = iM2566 ^ i2;
                    activityC23143 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case 11588745:
                case 1908222475:
                    C4616.m13552();
                    iM2567 = (i10 - C2105.m6981("ۘ֨")) * 25;
                    i11 = ((iM2567 ^ i9) * (-29617)) ^ 249471353;
                    i4 = 1315502323;
                    i12 = iM2567 ^ i4;
                    activityC23143 = this;
                    break;
                case 226401832:
                case 384932035:
                    AbstractC2021.m6574();
                    return false;
                case 435269202:
                case 492846711:
                    z2 = true;
                    iM6981 = C0630.m2566("ۨۖ") ^ i10;
                    i = ((iM6981 ^ i9) * 20751) ^ (-1445115001);
                    i3 = 2000085365;
                    i12 = iM6981 ^ i3;
                    i11 = i;
                    break;
                case 634605080:
                case 710739524:
                    sArr2 = sArr2;
                    if ((i6 + i7) - i16 < 0) {
                        iM2566 = C2105.m6981("ܶۧ") ^ i9;
                        i = ((iM2566 ^ i10) * 9521) ^ 1021374133;
                        i2 = 1676787418;
                    } else {
                        iM2566 = C0630.m2566("֨۬") ^ i10;
                        i = ((iM2566 ^ i9) * 2635) ^ (-680748064);
                        i2 = 1775516825;
                    }
                    i12 = iM2566 ^ i2;
                    activityC23143 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case 1121270648:
                case 1205480855:
                    C0050.m943(menuItemM6301, z2);
                    return z;
                case 1547144254:
                case 1549012472:
                    i13 = 16593;
                    iM2566 = C2105.m6981("ܿۗ") ^ i10;
                    i = ((iM2566 ^ i9) * 31777) ^ (-155881211);
                    i2 = -89948853;
                    i12 = iM2566 ^ i2;
                    activityC23143 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                default:
                    sArr2 = sArr2;
                    i16 = s * s2;
                    i6 = s * s;
                    i7 = 41209;
                    if (C0050.f910 < 0) {
                        iM2566 = C2105.m6981("ۜۛ") ^ i10;
                        i = ((iM2566 ^ i9) * (-6057)) ^ (-1840321581);
                        i2 = 271618948;
                        i12 = iM2566 ^ i2;
                        activityC23143 = this;
                        sArr2 = sArr2;
                        i11 = i;
                    } else {
                        sArr2 = sArr2;
                        iM2567 = (i10 - C2105.m6981("ۘ֨")) * 25;
                        i11 = ((iM2567 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                        i12 = iM2567 ^ i4;
                        activityC23143 = this;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        C5484 c5484 = null;
        C13244 c13244 = null;
        C16772 c16772 = null;
        int i = -418934976;
        int i2 = C1420.f5096;
        int i3 = C5695.f17556;
        int iM2566 = (C0630.m2566("ۖۡ") + i2) * (-85);
        int i4 = ((iM2566 ^ i3) * (-1183)) ^ (-534092121);
        int i5 = -2111203441;
        while (true) {
            i = ((((i ^ i3) * (-30709)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2010185242:
                case -743126086:
                    if (C4117.f13076 > 0) {
                        iM2566 = (C2105.m6981("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM2566 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܶ֫")) * 19;
                        i4 = ((iM2566 ^ i2) * (-15993)) ^ (-1198841668);
                        i5 = 454767822;
                    }
                    break;
                case -1963384134:
                case -1495260263:
                    if (C3432.f10845 < 0) {
                        iM2566 = C0630.m2566("ۘᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 32357) ^ (-1043989977);
                        i5 = -1870725454;
                    } else {
                        iM2566 = (C2105.m6981("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM2566 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    }
                    break;
                case -1823650944:
                case 295997305:
                    c16772 = this.f74401;
                    if (c16772 != null) {
                        iM2566 = (C0630.m2566("ܳ֫") + i3) * (-93);
                        i4 = ((iM2566 ^ i2) * (-28557)) ^ 31256740;
                        i5 = 627888899;
                    } else {
                        iM2566 = C0630.m2566("ܺۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 19653) ^ 1703743881;
                        i5 = -1861063790;
                    }
                    break;
                case -1814896863:
                case 361363146:
                    c13244 = this.f74402;
                    if (c13244 != null) {
                        iM2566 = (C0630.m2566("᩺۟") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i2) * 14173) ^ (-1524553806);
                        i5 = -1986851745;
                    } else {
                        iM2566 = C2105.m6981("᩻ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25393) ^ (-2115359382);
                        i5 = -796611628;
                    }
                    break;
                case -1719440720:
                case 1974202034:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ۗ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6913) ^ 1277334372;
                        i5 = 1272442186;
                    } else {
                        iM2566 = C0630.m2566("ۙܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 17543) ^ (-1037302073);
                        i5 = 1460144083;
                    }
                    break;
                case -1480757552:
                case -1263975117:
                    c5484.m15593();
                    iM2566 = C0630.m2566("᩶ۡ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 10245) ^ (-1085985437);
                    i5 = -121770570;
                    break;
                case -1444329807:
                case -1114397802:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C2105.m6981("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM2566 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM2566 = (C0630.m2566("ᩳۘ") + i3) * 33;
                        i4 = ((iM2566 ^ i2) * (-19147)) ^ (-526893589);
                        i5 = -89722429;
                    }
                    break;
                case -1306309907:
                case 533980993:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C0630.m2566("ۗ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6913) ^ 1277334372;
                        i5 = 1272442186;
                    } else {
                        iM2566 = (C2105.m6981("ۗܶ") ^ i2) * (-119);
                        i4 = ((iM2566 ^ i3) * 20889) ^ (-1612423916);
                        i5 = -1228940040;
                    }
                    break;
                case -1276800037:
                case -878285701:
                    c5484 = this.f74399;
                    if (c5484 != null) {
                        iM2566 = C0630.m2566("ۜ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-32325)) ^ 743909031;
                        i5 = -461934837;
                    } else {
                        iM2566 = C0630.m2566("᩶ۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10245) ^ (-1085985437);
                        i5 = -121770570;
                    }
                    break;
                case -1170211835:
                case -65114100:
                    if (C1711.m5736() <= 0) {
                        iM2566 = (C2105.m6981("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM2566 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM2566 = C0630.m2566("᩶ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14377) ^ 1601944745;
                        i5 = 830691783;
                    }
                    break;
                case -1085212737:
                case -9050630:
                    super.onResume();
                    if (C0798.m2998() != 0) {
                        iM2566 = (C2105.m6981("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM2566 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM2566 = (C0630.m2566("ۚܳ") ^ i2) * (-13);
                        i4 = ((iM2566 ^ i3) * (-8923)) ^ (-279221410);
                        i5 = 2022317296;
                    }
                    break;
                case -757573927:
                case 2050945500:
                    break;
                case -563224548:
                case 1847807839:
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C2105.m6981("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM2566 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM2566 = C2105.m6981("ܶۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 26737) ^ 1701267593;
                        i5 = 1333762110;
                    }
                    break;
                case -515651131:
                case 9634657:
                    c13244.m32134();
                    iM2566 = C2105.m6981("᩻ۛ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 25393) ^ (-2115359382);
                    i5 = -796611628;
                    break;
                case -305697815:
                case 1917499694:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C2105.m6981("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM2566 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֨᩸")) * 93;
                        i4 = ((iM2566 ^ i2) * 9525) ^ 578792422;
                        i5 = 686386558;
                    }
                    break;
                case -164109401:
                case 2147070969:
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("ۗ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 16439) ^ (-908773936);
                        i5 = 1352953155;
                    } else {
                        iM2566 = C0630.m2566("ۘᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 32357) ^ (-1043989977);
                        i5 = -1870725454;
                    }
                    break;
                case -137703698:
                case 1260258833:
                    c16772.m39492();
                    iM2566 = C0630.m2566("ܺۙ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 19653) ^ 1703743881;
                    i5 = -1861063790;
                    break;
                case 72614517:
                case 1187575416:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C0630.m2566("ۗ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6913) ^ 1277334372;
                        i5 = 1272442186;
                    } else {
                        iM2566 = (C0630.m2566("ۤ۠") + i3) * 25;
                        i4 = ((iM2566 ^ i2) * 15217) ^ (-105374925);
                        i5 = -1739261322;
                    }
                    break;
                case 154142910:
                case 905444601:
                    C0964.m3413();
                    C1047.m3599();
                    break;
                case 213231064:
                case 2014899824:
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ۗ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6913) ^ 1277334372;
                        i5 = 1272442186;
                    } else {
                        iM2566 = (C0630.m2566("᩻ۚ") + i2) * (-31);
                        i4 = ((iM2566 ^ i3) * (-29019)) ^ 1614518710;
                        i5 = 1401439811;
                    }
                    break;
                case 1894398721:
                case 1908108391:
                    RunnableC3474.m10630();
                    if (C0237.m1481() < 0) {
                        iM2566 = (i3 - C0630.m2566("ܶ֫")) * 19;
                        i4 = ((iM2566 ^ i2) * (-15993)) ^ (-1198841668);
                        i5 = 454767822;
                    } else {
                        iM2566 = (C0630.m2566("۠ܰ") + i2) * (-57);
                        i4 = ((iM2566 ^ i3) * 6593) ^ 1689880044;
                        i5 = -292288894;
                    }
                    break;
                default:
                    C1005.m3501();
                    iM2566 = (C0630.m2566("۠ܰ") + i2) * (-57);
                    i4 = ((iM2566 ^ i3) * 6593) ^ 1689880044;
                    i5 = -292288894;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m51322() {
        MenuItem menuItem = null;
        boolean z = false;
        int i = -2063450364;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C1128.f4106;
        int iM6981 = C2105.m6981("᩵ᩳ") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-8927)) ^ 1896557703;
        int i5 = -1955788441;
        while (true) {
            i = ((((i ^ i2) * 23379) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2081800143:
                case -1775289801:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = (C0630.m2566("ۤܳ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * 24553) ^ (-1101682433);
                        i5 = 1186206393;
                    } else {
                        iM6981 = C2105.m6981("ۡ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3557) ^ (-1302679619);
                        i5 = 616584000;
                    }
                    break;
                case -1901139005:
                case -226667634:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM6981 = (i2 - C2105.m6981("ۙۤ")) * 17;
                        i4 = ((iM6981 ^ i3) * 14877) ^ 152726286;
                        i5 = 1395697466;
                    } else {
                        iM6981 = C2105.m6981("᩸ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1665)) ^ (-37541132);
                        i5 = -815191929;
                    }
                    break;
                case -1689667617:
                case 334570075:
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("ۡۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23457)) ^ (-854506791);
                        i5 = -2000060731;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۨ᩸")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i2) * (-7975)) ^ 822547277;
                        i5 = -1701592259;
                    }
                    break;
                case -1620690363:
                case 1030364927:
                    if (C4159.m12565() >= 0) {
                        iM6981 = (i2 - C2105.m6981("ۙۤ")) * 17;
                        i4 = ((iM6981 ^ i3) * 14877) ^ 152726286;
                        i5 = 1395697466;
                    } else {
                        iM6981 = C0630.m2566("ܺ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2799)) ^ (-2099887948);
                        i5 = -1694290183;
                    }
                    break;
                case -1499904041:
                case -585301226:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM6981 = C0630.m2566("ۘܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-28793)) ^ (-887719193);
                        i5 = 102239789;
                    } else {
                        iM6981 = C2105.m6981("᩷᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22539) ^ (-488237265);
                        i5 = 627884984;
                    }
                    break;
                case -1160424411:
                case -819958741:
                    if (C4159.f13567) {
                        iM6981 = (C2105.m6981("᩶ۛ") ^ i2) * (-17);
                        i4 = ((iM6981 ^ i3) * 16941) ^ 1671729615;
                        i5 = -1261933352;
                    } else {
                        iM6981 = C2105.m6981("ۛܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30087)) ^ 594763252;
                        i5 = -1487875154;
                    }
                    break;
                case -1145061496:
                case -693080336:
                    C0422.m1953(menuItem, z);
                    iM6981 = (i2 - C2105.m6981("ᩴᩴ")) * 87;
                    i4 = ((iM6981 ^ i3) * (-8411)) ^ (-1767191324);
                    i5 = 1799723430;
                    break;
                case -981467402:
                case -600630388:
                    C7811.m20844();
                    if (C3746.f11829 > 0) {
                        iM6981 = (C0630.m2566("ۤܳ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * 24553) ^ (-1101682433);
                        i5 = 1186206393;
                    } else {
                        iM6981 = C0630.m2566("ۘܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-28793)) ^ (-887719193);
                        i5 = 102239789;
                    }
                    break;
                case -870336708:
                case -560847212:
                    if (this.f74400) {
                        iM6981 = (i3 - C0630.m2566("֫֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i2) * 21247) ^ 998763961;
                        i5 = 1050175676;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܿ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * (-4857)) ^ 639851031;
                        i5 = 1449750936;
                    }
                    break;
                case -802639924:
                case 1128577150:
                    if (this.f74398.m52061()) {
                        iM6981 = (i2 - C0630.m2566("ܿ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * (-4857)) ^ 639851031;
                        i5 = 1449750936;
                    } else {
                        iM6981 = C2105.m6981("᩺ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1017)) ^ (-1462700179);
                        i5 = 2092556603;
                    }
                    break;
                case -630810927:
                case 2081807981:
                    z = false;
                    iM6981 = (i2 - C2105.m6981("ۧܿ")) * (-55);
                    i4 = ((iM6981 ^ i3) * 14035) ^ (-241035947);
                    i5 = 1463320767;
                    break;
                case -588642583:
                case 566870444:
                    C3911.m11924();
                    break;
                case -453099718:
                case 713275153:
                    if (C0237.m1481() >= 0) {
                        iM6981 = C0630.m2566("ۘܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-28793)) ^ (-887719193);
                        i5 = 102239789;
                    } else {
                        iM6981 = C0630.m2566("ۡۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23457)) ^ (-854506791);
                        i5 = -2000060731;
                    }
                    break;
                case -210523092:
                case 1236619042:
                    if (!C1711.f5919) {
                        iM6981 = (i2 - C2105.m6981("ۙۤ")) * 17;
                        i4 = ((iM6981 ^ i3) * 14877) ^ 152726286;
                        i5 = 1395697466;
                    } else {
                        iM6981 = (C0630.m2566("ۤܳ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * 24553) ^ (-1101682433);
                        i5 = 1186206393;
                    }
                    break;
                case -51691242:
                case 742690402:
                    if (C7106.f21815 != 0) {
                        iM6981 = C2105.m6981("ۛܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30087)) ^ 594763252;
                        i5 = -1487875154;
                    } else {
                        iM6981 = C0630.m2566("᩵ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 8249) ^ 773360463;
                        i5 = 1741651590;
                    }
                    break;
                case -38225769:
                case 577698958:
                    break;
                case 245158535:
                case 899278251:
                    C2520.m8026();
                    C0714.m2805();
                    iM6981 = C0630.m2566("ۡۜ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-23457)) ^ (-854506791);
                    i5 = -2000060731;
                    break;
                case 431494610:
                case 1076137500:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("ۛܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30087)) ^ 594763252;
                        i5 = -1487875154;
                    } else {
                        iM6981 = C2105.m6981("ۛۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23861)) ^ 1566683597;
                        i5 = -1406938119;
                    }
                    break;
                case 720429137:
                case 1950276948:
                    z = true;
                    iM6981 = (i2 - C2105.m6981("ۧܿ")) * (-55);
                    i4 = ((iM6981 ^ i3) * 14035) ^ (-241035947);
                    i5 = 1463320767;
                    break;
                case 770411155:
                case 1671056776:
                    if (C1504.f5354) {
                        iM6981 = (i2 - C2105.m6981("ۙۤ")) * 17;
                        i4 = ((iM6981 ^ i3) * 14877) ^ 152726286;
                        i5 = 1395697466;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩹ۙ")) * 49;
                        i4 = ((iM6981 ^ i2) * (-23599)) ^ 1053155809;
                        i5 = -528246828;
                    }
                    break;
                case 775046537:
                case 871358903:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C0630.m2566("ۤܳ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * 24553) ^ (-1101682433);
                        i5 = 1186206393;
                    } else {
                        iM6981 = C0630.m2566("ܽܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31799) ^ (-1847815869);
                        i5 = -84298789;
                    }
                    break;
                default:
                    menuItem = this.f74403;
                    if (menuItem != null) {
                        iM6981 = C0630.m2566("ۖ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 2427) ^ 1966355995;
                        i5 = -996447710;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ᩴᩴ")) * 87;
                        i4 = ((iM6981 ^ i3) * (-8411)) ^ (-1767191324);
                        i5 = 1799723430;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0273 A[PHI: r2 r5 r7 r8 r9
      0x0273: PHI (r2v8 int) = (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:65:0x0271, B:52:0x01d5, B:32:0x010a, B:18:0x00a1, B:124:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r5v4 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v3 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:65:0x0271, B:52:0x01d5, B:32:0x010a, B:18:0x00a1, B:124:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r7v5 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v4 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:65:0x0271, B:52:0x01d5, B:32:0x010a, B:18:0x00a1, B:124:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r8v4 short[]) = (r8v3 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:65:0x0271, B:52:0x01d5, B:32:0x010a, B:18:0x00a1, B:124:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:65:0x0271, B:52:0x01d5, B:32:0x010a, B:18:0x00a1, B:124:0x0273] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        ActivityC23143 activityC23143 = this;
        int i4 = C3245.f10203;
        int i5 = C7811.f24123;
        int iM2568 = (i5 - C0630.m2566("ۤ۬")) * 61;
        int i6 = ((iM2568 ^ i4) * (-3185)) ^ (-105479607);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM2568 ^ 1873733423;
        int iM12567 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 842796526;
        int i16 = 0;
        String strM1840 = null;
        String strM11162 = null;
        String strM3841 = null;
        String strM2816 = null;
        boolean z = false;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * 1019) >> 31));
            switch (i15) {
                case -2112655385:
                case 475942024:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C2105.m6981("ܳ᩸") + i5) * (-55);
                        i = ((iM2566 ^ i4) * 11197) ^ 1498785029;
                        i2 = -1096381215;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = C0630.m2566("᩵ۜ") ^ i5;
                        i6 = ((iM2567 ^ i4) * (-4271)) ^ 1792658683;
                        i3 = 1398764942;
                        i7 = iM2567 ^ i3;
                        activityC23143 = this;
                    }
                    break;
                case -2087884930:
                case -1000589225:
                    ServiceConnectionC3453.m10570(activityC23143, new Intent(activityC23143, (Class<?>) ActivityC4094.class));
                    return z;
                case -2076323085:
                case -671526238:
                    return false;
                case -2022469773:
                case -1146812019:
                    c = 29;
                    if (C3537.f11231 >= 0) {
                        iM2567 = C0630.m2566("᩵ۜ") ^ i5;
                        i6 = ((iM2567 ^ i4) * (-4271)) ^ 1792658683;
                        i3 = 1398764942;
                    } else {
                        iM2567 = C0630.m2566("ܽۖ") ^ i5;
                        i6 = ((iM2567 ^ i4) * 8253) ^ 488102104;
                        i3 = -1613356171;
                    }
                    i7 = iM2567 ^ i3;
                    activityC23143 = this;
                    break;
                case -1938797734:
                case 1520614718:
                    C3432.m10477();
                    if (C11340.f33930 < 0) {
                        iM2567 = C0630.m2566("᩵ۜ") ^ i5;
                        i6 = ((iM2567 ^ i4) * (-4271)) ^ 1792658683;
                        i3 = 1398764942;
                        i7 = iM2567 ^ i3;
                        activityC23143 = this;
                    } else {
                        iM2566 = (C0630.m2566("۬ܽ") ^ i4) * (-113);
                        i = ((iM2566 ^ i5) * 26619) ^ (-1165133678);
                        i2 = 2136411398;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1885592173:
                case 537372894:
                    int i17 = i16 + i11;
                    if (i14 - (i17 + i17) <= 0) {
                        iM2566 = C2105.m6981("ܰۢ") ^ i4;
                        i = ((iM2566 ^ i5) * (-27035)) ^ (-42259620);
                        i2 = -736797702;
                    } else {
                        iM2566 = C0630.m2566("ۘۛ") ^ i5;
                        i = ((iM2566 ^ i4) * 26209) ^ (-501120171);
                        i2 = -1085947123;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1751730041:
                case 813755028:
                    i14 = i13 * i13;
                    i16 = s * s;
                    i11 = 2762244;
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C2105.m6981("ܳ᩸") + i5) * (-55);
                        i = ((iM2566 ^ i4) * 11197) ^ 1498785029;
                        i2 = -1096381215;
                    } else {
                        iM2566 = C0630.m2566("۬۫") ^ i4;
                        i = ((iM2566 ^ i5) * 31225) ^ (-260124515);
                        i2 = -1377460092;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1645872890:
                case 639795911:
                    if (iM12567 == (C2105.m6981(strM11162) ^ 2129398427)) {
                        iM2566 = C0630.m2566("ۘ᩵") ^ i4;
                        i = ((iM2566 ^ i5) * (-8007)) ^ 547524068;
                        i2 = 1729841731;
                    } else {
                        iM2566 = (C0630.m2566("ۗܰ") ^ i5) * 49;
                        i = ((iM2566 ^ i4) * 18185) ^ 1546356316;
                        i2 = 389255984;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1590445466:
                case -680277162:
                    z = true;
                    if (iM12567 == (C2105.m6981(strM2816) ^ 2099739447)) {
                        iM2566 = (i5 - C2105.m6981("ۧᩴ")) * 37;
                        i = ((iM2566 ^ i4) * 12885) ^ 996550555;
                        i2 = 1945500629;
                    } else {
                        iM2566 = (C2105.m6981("ۧۡ") + i4) * 5;
                        i = ((iM2566 ^ i5) * (-20413)) ^ (-1730189164);
                        i2 = -1062572813;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1438986135:
                case 369972819:
                    C4075.m12261(activityC23143, new Intent(activityC23143, (Class<?>) ActivityC16608.class));
                    return z;
                case -1296614660:
                case 160513805:
                    strM11162 = C3663.m11162(f74397, 36, 3, i12);
                    if (C1420.f5096 > 0) {
                        iM2566 = C2105.m6981("ۘۤ") ^ i4;
                        i = ((iM2566 ^ i5) * (-11905)) ^ 1191060892;
                        i2 = 73073059;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = (C0630.m2566("᩺᩹") ^ i4) * (-119);
                        i6 = ((iM2567 ^ i5) * (-18823)) ^ (-869795097);
                        i3 = 2066499944;
                        i7 = iM2567 ^ i3;
                        activityC23143 = this;
                    }
                    break;
                case -1223887791:
                case 1032839027:
                    C7106.m19120();
                    C1294.m4372();
                    return false;
                case -912359596:
                case 432424238:
                    strM1840 = C0382.m1840(f74397, 39, 3, i12);
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("۬ܽ") ^ i4) * (-113);
                        i = ((iM2566 ^ i5) * 26619) ^ (-1165133678);
                        i2 = 2136411398;
                    } else {
                        iM2566 = C0630.m2566("ۘܺ") ^ i4;
                        i = ((iM2566 ^ i5) * (-28669)) ^ 1797593771;
                        i2 = 135699141;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -492008498:
                case -241128035:
                    C2958.m9034();
                    iM2566 = (C0630.m2566("۬ܽ") ^ i4) * (-113);
                    i = ((iM2566 ^ i5) * 26619) ^ (-1165133678);
                    i2 = 2136411398;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -359652989:
                case 711924175:
                    if (iM12567 == (C2105.m6981(strM1840) ^ 2123090956)) {
                        iM2566 = C2105.m6981("ܺ֨") ^ i5;
                        i = ((iM2566 ^ i4) * 25135) ^ (-1237648478);
                        i2 = -690811288;
                    } else {
                        iM2566 = C2105.m6981("۟ۜ") ^ i5;
                        i = ((iM2566 ^ i4) * 11985) ^ 1310123971;
                        i2 = 1711885368;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -318656708:
                case 2074703789:
                    C1916.m6308();
                    if (C7106.m19120() <= 0) {
                        iM2566 = (i4 - C2105.m6981("᩻ۡ")) * 119;
                        i = ((iM2566 ^ i5) * (-19953)) ^ (-1501516061);
                        i2 = 1581642352;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = C0630.m2566("᩵ۜ") ^ i5;
                        i6 = ((iM2567 ^ i4) * (-4271)) ^ 1792658683;
                        i3 = 1398764942;
                        i7 = iM2567 ^ i3;
                        activityC23143 = this;
                    }
                    break;
                case -160635360:
                case 1113349773:
                    i12 = 35347;
                    iM2566 = C2105.m6981("ܳۗ") ^ i5;
                    i = ((iM2566 ^ i4) * (-29185)) ^ 1329438323;
                    i2 = -2034947643;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 18065312:
                case 159683244:
                    sArr = f74397;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2567 = (C0630.m2566("᩺᩹") ^ i4) * (-119);
                        i6 = ((iM2567 ^ i5) * (-18823)) ^ (-869795097);
                        i3 = 2066499944;
                    } else {
                        iM2567 = C0630.m2566("ۗᩳ") ^ i4;
                        i6 = ((iM2567 ^ i5) * 17549) ^ (-109046199);
                        i3 = -1713586279;
                    }
                    i7 = iM2567 ^ i3;
                    activityC23143 = this;
                    break;
                case 169749232:
                case 1164115126:
                    ActivityC17520.m40936(activityC23143, C7811.m20837(f74397, 42, 3, i12));
                    return z;
                case 246799689:
                case 1953317040:
                    i12 = 38847;
                    iM2566 = C2105.m6981("ܳۗ") ^ i5;
                    i = ((iM2566 ^ i4) * (-29185)) ^ 1329438323;
                    i2 = -2034947643;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 473980571:
                case 2108806811:
                    if (iM12567 == (C0630.m2566(strM3841) ^ 2129860221)) {
                        iM2566 = (i5 - C0630.m2566("ܺۙ")) * 27;
                        i = ((iM2566 ^ i4) * (-25429)) ^ (-1138032118);
                        i2 = 1853269137;
                    } else {
                        iM2566 = C0630.m2566("۫ۛ") ^ i4;
                        i = ((iM2566 ^ i5) * (-14649)) ^ 741497160;
                        i2 = 736672309;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 541647606:
                case 1045229624:
                    strM3841 = C1128.m3841(sArr3, i9, i10, i12);
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C0630.m2566("۬ܽ") ^ i4) * (-113);
                        i = ((iM2566 ^ i5) * 26619) ^ (-1165133678);
                        i2 = 2136411398;
                    } else {
                        iM2566 = (C0630.m2566("ۨܶ") + i5) * 79;
                        i = ((iM2566 ^ i4) * 12901) ^ (-1195784449);
                        i2 = -170822304;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 774242571:
                case 1681198829:
                    short s2 = sArr[c];
                    int i18 = s2 + 1662;
                    if (C0714.f2697 >= 0) {
                        s = s2;
                        i13 = i18;
                        iM2567 = (C0630.m2566("᩺᩹") ^ i4) * (-119);
                        i6 = ((iM2567 ^ i5) * (-18823)) ^ (-869795097);
                        i3 = 2066499944;
                        i7 = iM2567 ^ i3;
                    } else {
                        int iM2569 = (i5 - C0630.m2566("۫᩵")) * 79;
                        int i19 = ((iM2569 ^ i4) * (-30195)) ^ (-468518132);
                        i7 = iM2569 ^ (-645766617);
                        s = s2;
                        i13 = i18;
                        i6 = i19;
                    }
                    activityC23143 = this;
                    break;
                case 927271558:
                case 1273350688:
                    iM12567 = C4159.m12567(menuItem);
                    sArr2 = f74397;
                    i8 = 30;
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C0630.m2566("۬ܽ") ^ i4) * (-113);
                        i = ((iM2566 ^ i5) * 26619) ^ (-1165133678);
                        i2 = 2136411398;
                    } else {
                        iM2566 = C0630.m2566("ܶ۠") ^ i4;
                        i = ((iM2566 ^ i5) * (-11447)) ^ 280035325;
                        i2 = 245523627;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 1730358913:
                case 1732727948:
                    activityC23143.f74398.m52054((String) null);
                    activityC23143.f74398.m52058(z);
                    return z;
                case 1825138361:
                case 2028809802:
                    sArr3 = f74397;
                    i9 = 33;
                    i10 = 3;
                    if (C4075.f12947 < 0) {
                        iM2566 = (C0630.m2566("ۖۧ") ^ i4) * 23;
                        i = ((iM2566 ^ i5) * (-19599)) ^ (-1284202346);
                        i2 = 648433319;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = C0630.m2566("᩵ۜ") ^ i5;
                        i6 = ((iM2567 ^ i4) * (-4271)) ^ 1792658683;
                        i3 = 1398764942;
                        i7 = iM2567 ^ i3;
                        activityC23143 = this;
                    }
                    break;
                default:
                    strM2816 = C0714.m2816(sArr2, i8, 3, i12);
                    if (C7811.m20844() == 0) {
                        iM2566 = (i5 - C2105.m6981("ܰ۬")) * (-109);
                        i = ((iM2566 ^ i4) * 28347) ^ 1662937363;
                        i2 = -340911481;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = (C0630.m2566("᩺᩹") ^ i4) * (-119);
                        i6 = ((iM2567 ^ i5) * (-18823)) ^ (-869795097);
                        i3 = 2066499944;
                        i7 = iM2567 ^ i3;
                        activityC23143 = this;
                    }
                    break;
            }
        }
    }
}
