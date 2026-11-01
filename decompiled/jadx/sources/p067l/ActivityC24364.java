package p067l;

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
public class ActivityC24364 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۢۧ */
    public static final /* synthetic */ int f77143 = 0;

    /* JADX INFO: renamed from: ۤᩳ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f83044 = {3727, -3528, 7077, -3900, 109, 7649, -4427, 3189, 2822, 2744, -10193, 4111, -2182, -6117, 6535, 2357, -6084, -11025, -2745, -1505, -2217, 5826, 8962, 14039, -12468, 15588, -14161, 5317, -11711, 9245, 1486, 1820, -8984, 2330, -7219, -11127, -2082, -6996, -6056, -5878, -6882, -8380, -30127, -30086, -30083, 6981, -1970, -1934, -1941, -1927, -1929, -1936, -1965, -1921, -1936, -1921, -1927, -1925, -1953, -1923, -1942, -1929, -1944, -1929, -1942, -1945};

    /* JADX INFO: renamed from: ۜۧ */
    public C24790 f77144;

    /* JADX INFO: renamed from: ܳۧ */
    public C7581 f77145;

    /* JADX INFO: renamed from: ܿۧ */
    public boolean f77146;

    /* JADX INFO: renamed from: ᩳۧ */
    public C18309 f77147;

    /* JADX INFO: renamed from: ᩷ۧ */
    public C14956 f77148;

    /* JADX INFO: renamed from: ᩻ۧ */
    public MenuItem f77149;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
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
        int i7 = C1053.f81965;
        int i8 = ViewOnClickListenerC0939.f81888;
        int iM55680 = C0873.m55680("ۤ᩵") ^ i8;
        int i9 = ((iM55680 ^ i7) * (-10621)) ^ 1378797186;
        int i10 = 2033626841;
        while (true) {
            i6 = ((((i6 ^ i7) * 21913) >> 31) & i9) ^ (iM55680 ^ i10);
            switch (i6) {
                case -1998893946:
                case -835104701:
                    c = '-';
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("ۜ᩻") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-31033)) ^ 418312800;
                        i10 = -255687957;
                    } else {
                        iM55680 = (i8 - C0873.m55680("ۜۗ")) * 97;
                        i9 = ((iM55680 ^ i7) * 2487) ^ 208827124;
                        i10 = 114245368;
                    }
                    break;
                case -1995633323:
                case 1941460982:
                    C0930.m55885();
                    return null;
                case -1974843881:
                case -1204307237:
                    C0992.m56107();
                    if (!C0947.f81895) {
                        iM55680 = C0946.m55979("᩶ܳ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    } else {
                        iM55680 = C0873.m55680("ܽۛ") ^ i8;
                        i9 = ((iM55680 ^ i7) * 19445) ^ 1675619624;
                        i10 = 2097235393;
                    }
                    break;
                case -1658992220:
                case -1510432594:
                    i = s * s2;
                    i2 = s * s;
                    if (C0861.f81831) {
                        iM55680 = (C0946.m55979("ۨ᩹") ^ i8) * (-37);
                        i9 = ((iM55680 ^ i7) * (-2213)) ^ (-1979342568);
                        i10 = 360181902;
                    } else {
                        iM55680 = C0873.m55680("ܽۛ") ^ i8;
                        i9 = ((iM55680 ^ i7) * 19445) ^ 1675619624;
                        i10 = 2097235393;
                    }
                    break;
                case -1528706621:
                case -228715101:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0946.m55979("ۘۛ") + i7) * 13;
                        i9 = ((iM55680 ^ i8) * (-2917)) ^ (-2134857660);
                        i10 = 277777652;
                    } else {
                        iM55680 = C0946.m55979("᩶ܳ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    }
                    break;
                case -926272602:
                case -829763437:
                    return AbstractC0942.m55970(sArr2, i5, 20, i4);
                case -924861189:
                case 41776483:
                    if (C0992.f81922 < 0) {
                        iM55680 = C0946.m55979("ۜ᩻") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-31033)) ^ 418312800;
                        i10 = -255687957;
                    } else {
                        iM55680 = C0946.m55979("᩶ܳ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    }
                    break;
                case -898251391:
                case 2084878451:
                    if ((i2 + i3) - i < 0) {
                        iM55680 = (i7 - C0873.m55680("ۛۧ")) * 27;
                        i9 = ((iM55680 ^ i8) * (-30667)) ^ 556007263;
                        i10 = 1593931559;
                    } else {
                        iM55680 = (C0946.m55979("ۖܿ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM55680 ^ i7) * (-29771)) ^ (-1243131948);
                        i10 = 962982777;
                    }
                    break;
                case -840986885:
                case 1726687002:
                    sArr2 = f83044;
                    i5 = 46;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0946.m55979("ۖۖ") ^ i7) * 25;
                        i9 = ((iM55680 ^ i8) * 4337) ^ 660235063;
                        i10 = -708022957;
                    } else {
                        iM55680 = C0873.m55680("۬ۧ") ^ i7;
                        i9 = ((iM55680 ^ i8) * 32571) ^ 1618591801;
                        i10 = -86629184;
                    }
                    break;
                case -758288813:
                case -627030541:
                    i4 = 24781;
                    iM55680 = (i8 - C0873.m55680("ۙ᩸")) * 127;
                    i9 = ((iM55680 ^ i7) * 25139) ^ 302257409;
                    i10 = 1894221939;
                    break;
                case -576658411:
                case -384328265:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0873.m55680("ܽۛ") ^ i8;
                        i9 = ((iM55680 ^ i7) * 19445) ^ 1675619624;
                        i10 = 2097235393;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ۢۛ")) * (-37);
                        i9 = ((iM55680 ^ i8) * 5083) ^ 156348728;
                        i10 = 433810634;
                    }
                    break;
                case -453650571:
                case 690095816:
                    C0927.m55873();
                    C1194.m56396();
                    iM55680 = C0946.m55979("᩶ܳ") ^ i8;
                    i9 = ((iM55680 ^ i7) * (-12073)) ^ 1547671277;
                    i10 = 664324284;
                    break;
                case -404672060:
                case 2088546172:
                    s = sArr[c];
                    s2 = 6760;
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0946.m55979("ۖۖ") ^ i7) * 25;
                        i9 = ((iM55680 ^ i8) * 4337) ^ 660235063;
                        i10 = -708022957;
                    } else {
                        iM55680 = C0946.m55979("ۛ۫") ^ i7;
                        i9 = ((iM55680 ^ i8) * 2033) ^ 1809321589;
                        i10 = -1851501834;
                    }
                    break;
                case -111040621:
                case 399710812:
                    if (C1124.m56367() >= 0) {
                        iM55680 = C0946.m55979("᩶ܳ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    } else {
                        iM55680 = C0946.m55979("ܳܺ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-19871)) ^ (-1083502480);
                        i10 = 1987963555;
                    }
                    break;
                case 159616599:
                case 756415231:
                    sArr = f83044;
                    if (RunnableC0897.m55784()) {
                        iM55680 = (C0946.m55979("ۘۛ") + i7) * 13;
                        i9 = ((iM55680 ^ i8) * (-2917)) ^ (-2134857660);
                        i10 = 277777652;
                    } else {
                        iM55680 = (C0873.m55680("۟ۨ") ^ i7) * 85;
                        i9 = ((iM55680 ^ i8) * 26757) ^ (-1385452955);
                        i10 = 1963950153;
                    }
                    break;
                case 549228795:
                case 576628979:
                    if (C0912.m55833()) {
                        iM55680 = C0946.m55979("᩶ܳ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    } else {
                        iM55680 = C0946.m55979("ᩳ᩸") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-25203)) ^ (-777517680);
                        i10 = -1988096441;
                    }
                    break;
                case 728375589:
                case 1119275481:
                    i4 = 63518;
                    iM55680 = (i8 - C0873.m55680("ۙ᩸")) * 127;
                    i9 = ((iM55680 ^ i7) * 25139) ^ 302257409;
                    i10 = 1894221939;
                    break;
                case 1723734513:
                case 1997966783:
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0946.m55979("᩶ܳ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-12073)) ^ 1547671277;
                        i10 = 664324284;
                    } else {
                        iM55680 = (C0873.m55680("ۨ۠") ^ i7) * 71;
                        i9 = ((iM55680 ^ i8) * (-8747)) ^ 866926486;
                        i10 = 219373622;
                    }
                    break;
                default:
                    i3 = 11424400;
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("ۜ᩻") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-31033)) ^ 418312800;
                        i10 = -255687957;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۜ") ^ i7) * 63;
                        i9 = ((iM55680 ^ i8) * 16635) ^ (-772462763);
                        i10 = -1625175807;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onDestroy() {
        C7581 c7581 = null;
        int i = 164434352;
        int i2 = ServiceConnectionC1013.f81940;
        int i3 = C1003.f81929;
        int iM55979 = (i3 - C0946.m55979("ۖ᩶")) * (-65);
        int i4 = ((iM55979 ^ i2) * 16159) ^ 1592397061;
        int i5 = 1580845289;
        while (true) {
            i = ((((i ^ i2) * 26993) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2117880724:
                case 1632951057:
                    super.onDestroy();
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0873.m55680("ۙ֫") + i2) * (-41);
                        i4 = ((iM55979 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    } else {
                        iM55979 = C0873.m55680("ܶ᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12443) ^ (-193841558);
                        i5 = -1202393202;
                    }
                    break;
                case -2021415870:
                case -1514043645:
                    if (RunnableC0938.f81886 < 0) {
                        iM55979 = (C0873.m55680("ۙ֫") + i2) * (-41);
                        i4 = ((iM55979 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    } else {
                        iM55979 = C0873.m55680("ᩴ᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * 247) ^ 1623360391;
                        i5 = 1258686431;
                    }
                    break;
                case -1946413662:
                case -363912608:
                    if (C0854.m55595() >= 0) {
                        iM55979 = (C0873.m55680("ܽܶ") + i3) * 73;
                        i4 = ((iM55979 ^ i2) * (-26659)) ^ (-880792925);
                        i5 = -1024439324;
                    } else {
                        iM55979 = (C0873.m55680("ۜܿ") ^ i2) * (-23);
                        i4 = ((iM55979 ^ i3) * 23021) ^ (-123402547);
                        i5 = 463014788;
                    }
                    break;
                case -1925122971:
                case -1370236081:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (C0873.m55680("ۙ֫") + i2) * (-41);
                        i4 = ((iM55979 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    } else {
                        iM55979 = C0946.m55979("ۨۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13587) ^ 122382768;
                        i5 = -301193870;
                    }
                    break;
                case -1780208750:
                case 386969776:
                    if (C0861.m55626()) {
                        iM55979 = (C0873.m55680("֫᩹") ^ i2) * 93;
                        i4 = ((iM55979 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM55979 = C0946.m55979("᩷֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-17423)) ^ (-1472426531);
                        i5 = 1898141016;
                    }
                    break;
                case -1646814660:
                case 2088755629:
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0873.m55680("ۙ֫") + i2) * (-41);
                        i4 = ((iM55979 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    } else {
                        iM55979 = C0873.m55680("ۤ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * 5909) ^ (-962065789);
                        i5 = 536141793;
                    }
                    break;
                case -1601849806:
                case -978648496:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("֫᩹") ^ i2) * 93;
                        i4 = ((iM55979 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM55979 = C0873.m55680("ۙܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32325) ^ (-1093037173);
                        i5 = 1050320726;
                    }
                    break;
                case -1502517487:
                case -764563033:
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("֫᩹") ^ i2) * 93;
                        i4 = ((iM55979 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM55979 = C0873.m55680("ܰᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-14431)) ^ (-1269953794);
                        i5 = 896078236;
                    }
                    break;
                case -864706070:
                case 421114978:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0873.m55680("֫᩹") ^ i2) * 93;
                        i4 = ((iM55979 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩶ۖ")) * 43;
                        i4 = ((iM55979 ^ i2) * (-28739)) ^ (-1373028694);
                        i5 = 1767071018;
                    }
                    break;
                case -775844195:
                case 1601155089:
                    c7581 = this.f77145;
                    if (c7581 != null) {
                        iM55979 = C0873.m55680("ۚۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2475)) ^ 201345695;
                        i5 = 1510106040;
                    } else {
                        iM55979 = C0873.m55680("ܿۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 1023) ^ 1322459581;
                        i5 = -1669616841;
                    }
                    break;
                case 60217449:
                case 135833864:
                    C1003.m56123();
                    C1025.m56230();
                    iM55979 = (C0873.m55680("ܽܶ") + i3) * 73;
                    i4 = ((iM55979 ^ i2) * (-26659)) ^ (-880792925);
                    i5 = -1024439324;
                    break;
                case 371985325:
                case 1305161787:
                    C1028.m56247();
                    break;
                case 1032681368:
                case 1194069414:
                    if (C0955.f81898) {
                        iM55979 = (i3 - C0873.m55680("ۛۜ")) * (-125);
                        i4 = ((iM55979 ^ i2) * (-22251)) ^ 1703648904;
                        i5 = -1398188073;
                    } else {
                        iM55979 = C0873.m55680("᩶ۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4147)) ^ (-1899373221);
                        i5 = -1281655222;
                    }
                    break;
                case 1129844430:
                case 1769738546:
                    C0890.m55740();
                    if (!C0882.f81846) {
                        iM55979 = (C0873.m55680("֫᩹") ^ i2) * 93;
                        i4 = ((iM55979 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM55979 = (C0873.m55680("ۙ֫") + i2) * (-41);
                        i4 = ((iM55979 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    }
                    break;
                case 1420026106:
                case 1615997796:
                    if (C0882.m55710() != 0) {
                        iM55979 = (C0873.m55680("֫᩹") ^ i2) * 93;
                        i4 = ((iM55979 ^ i3) * (-15861)) ^ 1112294945;
                        i5 = -491287356;
                    } else {
                        iM55979 = (C0873.m55680("ۚۜ") ^ i3) * (-21);
                        i4 = ((iM55979 ^ i2) * (-7667)) ^ (-1294186716);
                        i5 = -1477171156;
                    }
                    break;
                case 1422156060:
                case 1888270798:
                    break;
                case 1893104515:
                case 2021384337:
                    c7581.m17502();
                    iM55979 = C0873.m55680("ܿۨ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 1023) ^ 1322459581;
                    i5 = -1669616841;
                    break;
                default:
                    if (C1229.m56410() != 0) {
                        iM55979 = (C0873.m55680("ۙ֫") + i2) * (-41);
                        i4 = ((iM55979 ^ i3) * (-31799)) ^ (-1264117321);
                        i5 = 263196967;
                    } else {
                        iM55979 = (C0873.m55680("ܽܶ") + i3) * 73;
                        i4 = ((iM55979 ^ i2) * (-26659)) ^ (-880792925);
                        i5 = -1024439324;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM55680;
        int i;
        int i2;
        C13636 c13636;
        int iM55681;
        int i3;
        int i4;
        C13636 c13637;
        short[] sArr;
        C1428 c1428;
        int i5;
        int iM55682;
        int i6;
        int i7;
        int iM55979;
        int i8;
        int i9;
        C13636 c13638;
        ActivityC24364 activityC24364 = this;
        ViewOnClickListenerC15934 viewOnClickListenerC15934 = null;
        C1326 c1326 = null;
        C24790 c24790 = null;
        int i10 = 0;
        C7581 c7581 = null;
        C18309 c18309 = null;
        C24790 c24791 = null;
        TabLayout tabLayout = null;
        C2798 c2798 = null;
        C12295 c12295 = null;
        int i11 = 0;
        String strM55592 = null;
        String strM56325 = null;
        int iM559710 = 0;
        int iM559711 = 0;
        short s = 0;
        int i12 = 0;
        int i13 = 1391051687;
        int i14 = C0873.f81841;
        int i15 = C0894.f81854;
        int iM559712 = (C0946.m55979("֨ܰ") + i15) * (-59);
        int i16 = ((iM559712 ^ i14) * 32139) ^ 748178390;
        int i17 = iM559712 ^ 1393159816;
        C13636 c13639 = null;
        C1326 c1327 = null;
        short[] sArr2 = null;
        int i18 = 0;
        int i19 = 0;
        int iM55683 = 0;
        View viewM56321 = null;
        int i20 = 0;
        int i21 = 0;
        C1428 onBackPressedDispatcher = null;
        short[] sArr3 = null;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * (-25471)) >> 31));
            switch (i13) {
                case -1914614244:
                case 105150387:
                    if (C0894.m55769() >= 0) {
                        i10 = i10;
                        c1327 = c1327;
                        sArr2 = sArr2;
                        i20 = i20;
                        sArr3 = sArr3;
                        i5 = i21;
                        C13636 c136310 = c13639;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c13636 = c136310;
                        iM55682 = (C0873.m55680("۠᩵") + i15) * (-19);
                        i21 = i5;
                        i6 = ((iM55682 ^ i14) * 617) ^ 468090963;
                        i7 = -1697206091;
                        i17 = iM55682 ^ i7;
                        i16 = i6;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c1327 = c1327;
                        C1428 c1429 = onBackPressedDispatcher;
                        c13639 = c13636;
                        onBackPressedDispatcher = c1429;
                    }
                    i10 = i10;
                    sArr3 = sArr3;
                    C13636 c136311 = c13639;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c13636 = c136311;
                    iM55681 = C0946.m55979("ܽ᩻") ^ i14;
                    i16 = ((iM55681 ^ i15) * 26365) ^ (-2010429631);
                    i3 = -1686151745;
                    i17 = iM55681 ^ i3;
                    activityC24364 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c1327 = c1327;
                    C1428 c14210 = onBackPressedDispatcher;
                    c13639 = c13636;
                    onBackPressedDispatcher = c14210;
                    break;
                case -1865573491:
                case 781056526:
                    c2798.m4420(i10);
                    i10 = i10;
                    iM55979 = C0946.m55979("۠ۤ") ^ i14;
                    i8 = ((iM55979 ^ i15) * (-29765)) ^ (-1202953065);
                    i9 = -1111466659;
                    i17 = iM55979 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case -1777455205:
                case 1622534282:
                    i10 = i10;
                    iM559711 = C0946.m55979(C0947.m55993(f83044, 19, 3, i19));
                    iM55979 = C0946.m55979("ۙ᩷") ^ i15;
                    i8 = ((iM55979 ^ i14) * (-23091)) ^ 856080857;
                    i9 = -71320301;
                    i17 = iM55979 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case -1530550293:
                case 1073563778:
                    if (C0937.m55918() >= 0) {
                        i4 = i10;
                        c13637 = c13639;
                        c1327 = c1327;
                        sArr = sArr3;
                        c1428 = onBackPressedDispatcher;
                        int iM559713 = (C0946.m55979("ܽۗ") + i14) * 27;
                        c13638 = c13637;
                        i16 = ((iM559713 ^ i15) * 17001) ^ (-2135580098);
                        i17 = iM559713 ^ 488690076;
                        c13639 = c13638;
                        i10 = i4;
                        onBackPressedDispatcher = c1428;
                        sArr3 = sArr;
                        c1327 = c1327;
                    } else {
                        i10 = i10;
                        sArr3 = sArr3;
                        C13636 c136312 = c13639;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c13636 = c136312;
                        iM55681 = C0946.m55979("ܽ᩻") ^ i14;
                        i16 = ((iM55681 ^ i15) * 26365) ^ (-2010429631);
                        i3 = -1686151745;
                        i17 = iM55681 ^ i3;
                        activityC24364 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c1327 = c1327;
                        C1428 c14211 = onBackPressedDispatcher;
                        c13639 = c13636;
                        onBackPressedDispatcher = c14211;
                    }
                    break;
                case -1360452743:
                case 1316925368:
                    activityC24364.f77144 = c24790;
                    i10 = 1;
                    c24790.m54459(true);
                    activityC24364.f77145 = new C7581(activityC24364);
                    if (C1036.f81953 < 0) {
                        activityC24364.f77148 = new C14956(activityC24364);
                        activityC24364.f77147 = new C18309(activityC24364);
                        c7581 = activityC24364.f77145;
                        if (C0946.f81894 == 0) {
                            iM55680 = (i15 - C0873.m55680("᩺ۢ")) * 63;
                            i = ((iM55680 ^ i14) * 15991) ^ (-96085237);
                            i2 = 450366548;
                            i17 = iM55680 ^ i2;
                            i16 = i;
                        } else {
                            i10 = 1;
                            sArr3 = sArr3;
                            C13636 c136313 = c13639;
                            onBackPressedDispatcher = onBackPressedDispatcher;
                            c13636 = c136313;
                            iM55681 = C0946.m55979("ܽ᩻") ^ i14;
                            i16 = ((iM55681 ^ i15) * 26365) ^ (-2010429631);
                            i3 = -1686151745;
                            i17 = iM55681 ^ i3;
                            activityC24364 = this;
                            i20 = i20;
                            sArr3 = sArr3;
                            i10 = i10;
                            i21 = i21;
                            sArr2 = sArr2;
                            c1327 = c1327;
                            C1428 c14212 = onBackPressedDispatcher;
                            c13639 = c13636;
                            onBackPressedDispatcher = c14212;
                        }
                    } else {
                        i10 = 1;
                        sArr3 = sArr3;
                        int iM55684 = C0873.m55680("᩹᩷") ^ i15;
                        i16 = ((iM55684 ^ i14) * (-20467)) ^ (-897516524);
                        i17 = iM55684 ^ (-1299840267);
                        activityC24364 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c1327 = c1327;
                    }
                    break;
                case -1345804705:
                case -714757589:
                    i10 = i10;
                    c7581.m17503(new RunnableC14306(0, activityC24364));
                    c18309 = activityC24364.f77147;
                    c24791 = activityC24364.f77144;
                    RunnableC1014.m56165(c18309);
                    iM55979 = C0873.m55680("ۖۜ") ^ i14;
                    i8 = ((iM55979 ^ i15) * 29463) ^ 636562489;
                    i9 = -409962651;
                    i17 = iM55979 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case -1323666297:
                case 1096851184:
                    sArr = sArr3;
                    i4 = i10;
                    c1428 = onBackPressedDispatcher;
                    c13637 = c13639;
                    c1428.m30940(c13637);
                    C0866.m55649(this);
                    c1327 = activityC24364.f13392;
                    viewOnClickListenerC15934 = new ViewOnClickListenerC15934(5, activityC24364);
                    if (C1048.f81963) {
                        c13638 = c13637;
                        int iM55685 = (C0873.m55680("ۤ᩷") ^ i15) * 61;
                        i17 = iM55685 ^ (-409548554);
                        i16 = ((iM55685 ^ i14) * 29353) ^ 1980195692;
                    } else {
                        int iM559714 = (C0946.m55979("ܽۗ") + i14) * 27;
                        c13638 = c13637;
                        i16 = ((iM559714 ^ i15) * 17001) ^ (-2135580098);
                        i17 = iM559714 ^ 488690076;
                    }
                    c13639 = c13638;
                    i10 = i4;
                    onBackPressedDispatcher = c1428;
                    sArr3 = sArr;
                    c1327 = c1327;
                    break;
                case -1314839142:
                case 90888645:
                    i10 = i10;
                    c2798.m4406(c12295);
                    tabLayout.setupWithViewPager(c2798);
                    c2798.m4405(new C8271(activityC24364));
                    if (C6850.m15692()) {
                        iM55979 = C0946.m55979("֨᩹") ^ i15;
                        i8 = ((iM55979 ^ i14) * 4687) ^ 386569953;
                        i9 = 498423605;
                    } else {
                        iM55979 = C0946.m55979("۠ۤ") ^ i14;
                        i8 = ((iM55979 ^ i15) * (-29765)) ^ (-1202953065);
                        i9 = -1111466659;
                    }
                    i17 = iM55979 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case -1259086238:
                case -129526991:
                    i10 = i10;
                    c1327 = c1327;
                    short[] sArr4 = sArr2;
                    i20 = i20;
                    sArr3 = sArr3;
                    i5 = i21;
                    C13636 c136314 = c13639;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c13636 = c136314;
                    sArr2 = sArr4;
                    viewM56321 = C1053.m56321(activityC24364, C0873.m55680(C0873.m55689(sArr4, i20, i5, i19)) ^ 2099798760);
                    if (C0912.f81867 <= 0) {
                        iM55682 = (C0873.m55680("۠᩵") + i15) * (-19);
                        i21 = i5;
                        i6 = ((iM55682 ^ i14) * 617) ^ 468090963;
                        i7 = -1697206091;
                    } else {
                        i21 = i5;
                        iM55682 = C0873.m55680("֡᩻") ^ i14;
                        i6 = ((iM55682 ^ i15) * (-5779)) ^ (-1878506862);
                        i7 = 1742510050;
                    }
                    i17 = iM55682 ^ i7;
                    i16 = i6;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c1327 = c1327;
                    C1428 c14213 = onBackPressedDispatcher;
                    c13639 = c13636;
                    onBackPressedDispatcher = c14213;
                    break;
                case -1121959195:
                case -937139917:
                    i10 = i10;
                    c24791.m54458(new C12119(c18309));
                    sArr3 = f83044;
                    i18 = 13;
                    if (!C0949.m56012()) {
                        iM55979 = (C0946.m55979("ۡۤ") ^ i15) * 21;
                        i8 = ((iM55979 ^ i14) * (-23265)) ^ 1767167527;
                        i9 = 1744816586;
                        i17 = iM55979 ^ i9;
                        i16 = i8;
                        i10 = i10;
                    } else {
                        c1327 = c1327;
                        sArr2 = sArr2;
                        i20 = i20;
                        sArr3 = sArr3;
                        i5 = i21;
                        C13636 c136315 = c13639;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c13636 = c136315;
                        iM55682 = (C0873.m55680("۠᩵") + i15) * (-19);
                        i21 = i5;
                        i6 = ((iM55682 ^ i14) * 617) ^ 468090963;
                        i7 = -1697206091;
                        i17 = iM55682 ^ i7;
                        i16 = i6;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c1327 = c1327;
                        C1428 c14214 = onBackPressedDispatcher;
                        c13639 = c13636;
                        onBackPressedDispatcher = c14214;
                    }
                    break;
                case -1097020597:
                case -1043380185:
                    C0917.m55854();
                    C1071.m56343();
                    break;
                case -1076439171:
                case 108409262:
                    i10 = i10;
                    c24790 = (C24790) C0892.m55755(c1326, C0873.m55680(strM56325) ^ 2119493921);
                    if (!C0882.f81846) {
                        iM55979 = C0873.m55680("᩶ۛ") ^ i14;
                        i8 = ((iM55979 ^ i15) * 3759) ^ 1230372119;
                        i9 = -195365094;
                        i17 = iM55979 ^ i9;
                        i16 = i8;
                        i10 = i10;
                    } else {
                        sArr3 = sArr3;
                        int iM55686 = C0873.m55680("᩹᩷") ^ i15;
                        i16 = ((iM55686 ^ i14) * (-20467)) ^ (-897516524);
                        i17 = iM55686 ^ (-1299840267);
                        activityC24364 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c1327 = c1327;
                    }
                    break;
                case -930443780:
                case 1380234980:
                    i10 = i10;
                    c1327 = c1327;
                    RunnableC1014.m56172(c1327, viewOnClickListenerC15934);
                    c1326 = activityC24364.f13392;
                    sArr3 = sArr3;
                    strM56325 = C1053.m56325(f83044, 10, 3, i19);
                    int iM55687 = (i14 - C0873.m55680("ۡۙ")) * (-31);
                    i17 = iM55687 ^ (-1149535725);
                    i16 = ((iM55687 ^ i15) * (-14689)) ^ (-1979637622);
                    sArr3 = sArr3;
                    i10 = i10;
                    c1327 = c1327;
                    break;
                case -901740966:
                case 942830019:
                    c13636 = c13639;
                    i19 = 32925;
                    iM55681 = (i14 - C0946.m55979("ۤۤ")) * (-67);
                    i16 = ((iM55681 ^ i15) * (-17087)) ^ (-1539608669);
                    i3 = 1648287351;
                    i17 = iM55681 ^ i3;
                    activityC24364 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c1327 = c1327;
                    C1428 c14215 = onBackPressedDispatcher;
                    c13639 = c13636;
                    onBackPressedDispatcher = c14215;
                    break;
                case -879274480:
                case 798944356:
                    c13636 = c13639;
                    i19 = 30109;
                    iM55681 = (i14 - C0946.m55979("ۤۤ")) * (-67);
                    i16 = ((iM55681 ^ i15) * (-17087)) ^ (-1539608669);
                    i3 = 1648287351;
                    i17 = iM55681 ^ i3;
                    activityC24364 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c1327 = c1327;
                    C1428 c14216 = onBackPressedDispatcher;
                    c13639 = c13636;
                    onBackPressedDispatcher = c14216;
                    break;
                case -812463974:
                case 908411389:
                    C1326 c1328 = c1327;
                    short[] sArr5 = sArr3;
                    C13636 c136316 = c13639;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c13636 = c136316;
                    short s2 = f83044[0];
                    int i22 = s2 * 19916;
                    int iM55688 = (C0873.m55680("ۖܶ") ^ i14) * (-105);
                    s = s2;
                    int i23 = ((iM55688 ^ i15) * 13171) ^ 19779188;
                    i17 = iM55688 ^ 1005979332;
                    i12 = i22;
                    i20 = i20;
                    sArr3 = sArr5;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    i16 = i23;
                    c1327 = c1328;
                    activityC24364 = this;
                    C1428 c14217 = onBackPressedDispatcher;
                    c13639 = c13636;
                    onBackPressedDispatcher = c14217;
                    break;
                case -671158736:
                case 489603295:
                    c1327 = c1327;
                    C13636 c136317 = c13639;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c13636 = c136317;
                    C0890.m55736(activityC24364, C0873.m55680(strM55592) ^ 2128970355);
                    sArr2 = f83044;
                    i20 = 7;
                    i21 = 3;
                    int iM55689 = (i15 - C0873.m55680("ۡ۬")) * 11;
                    i17 = iM55689 ^ (-1595073592);
                    i16 = ((iM55689 ^ i14) * 8105) ^ 1150854303;
                    sArr3 = sArr3;
                    i10 = i10;
                    c1327 = c1327;
                    C1428 c14218 = onBackPressedDispatcher;
                    c13639 = c13636;
                    onBackPressedDispatcher = c14218;
                    break;
                case -430442683:
                case 140992079:
                    C0863.m55643();
                    i10 = i10;
                    sArr3 = sArr3;
                    C13636 c136318 = c13639;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c13636 = c136318;
                    iM55681 = C0946.m55979("ܽ᩻") ^ i14;
                    i16 = ((iM55681 ^ i15) * 26365) ^ (-2010429631);
                    i3 = -1686151745;
                    i17 = iM55681 ^ i3;
                    activityC24364 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c1327 = c1327;
                    C1428 c14219 = onBackPressedDispatcher;
                    c13639 = c13636;
                    onBackPressedDispatcher = c14219;
                    break;
                case -412062177:
                case 1094836449:
                    break;
                case -196244992:
                case 1992775364:
                    C1024.m56202(iM559711 ^ 2127101602);
                    RunnableC0897.m55775(this);
                    break;
                case -162757394:
                case 791959171:
                    i10 = i10;
                    c1327 = c1327;
                    sArr2 = sArr2;
                    i20 = i20;
                    i21 = i21;
                    sArr3 = sArr3;
                    C13636 c136319 = c13639;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c13636 = c136319;
                    if (i12 - ((s * s) + 99161764) > 0) {
                        iM55681 = (C0946.m55979("֨ܽ") + i15) * 47;
                        i16 = ((iM55681 ^ i14) * 8479) ^ 1404381672;
                        i3 = 851301810;
                    } else {
                        iM55681 = C0946.m55979("ۚ֨") ^ i15;
                        i16 = ((iM55681 ^ i14) * (-1897)) ^ (-136205074);
                        i3 = -1253396828;
                    }
                    i17 = iM55681 ^ i3;
                    activityC24364 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c1327 = c1327;
                    C1428 c142110 = onBackPressedDispatcher;
                    c13639 = c13636;
                    onBackPressedDispatcher = c142110;
                    break;
                case -84812745:
                case 1993605804:
                    i10 = i10;
                    c1327 = c1327;
                    sArr2 = sArr2;
                    i20 = i20;
                    i21 = i21;
                    sArr3 = sArr3;
                    C13636 c136320 = c13639;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c13636 = c136320;
                    m12250();
                    iM55683 = C0873.m55680(C0955.m56029(f83044, 1, 3, i19));
                    i11 = 2127337943;
                    if (C0912.f81867 > 0) {
                        iM55681 = (C0873.m55680("ܽۛ") ^ i14) * (-31);
                        i16 = ((iM55681 ^ i15) * (-30085)) ^ 1902235842;
                        i3 = 1875782856;
                        i17 = iM55681 ^ i3;
                        activityC24364 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c1327 = c1327;
                        C1428 c142111 = onBackPressedDispatcher;
                        c13639 = c13636;
                        onBackPressedDispatcher = c142111;
                    } else {
                        c13639 = c13636;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        int iM556810 = C0873.m55680("᩹᩷") ^ i15;
                        i16 = ((iM556810 ^ i14) * (-20467)) ^ (-897516524);
                        i17 = iM556810 ^ (-1299840267);
                        activityC24364 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c1327 = c1327;
                    }
                    break;
                case -48882984:
                case 102678227:
                    i10 = i10;
                    tabLayout = (TabLayout) C1053.m56321(activityC24364, C0946.m55979(C0949.m56016(sArr3, i18, 3, i19)) ^ 2123462516);
                    iM55979 = C0873.m55680("ۢ۬") ^ i15;
                    i8 = ((iM55979 ^ i14) * 12463) ^ 1855651414;
                    i9 = -1740030966;
                    i17 = iM55979 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case 32555229:
                case 1355419937:
                    i10 = i10;
                    c2798 = (C2798) C1053.m56321(activityC24364, iM559710 ^ 2123985548);
                    c12295 = new C12295(activityC24364);
                    iM55979 = (C0946.m55979("֡ۤ") ^ i15) * (-103);
                    i8 = ((iM55979 ^ i14) * (-9181)) ^ 806914539;
                    i9 = -1513091488;
                    i17 = iM55979 ^ i9;
                    i16 = i8;
                    i10 = i10;
                    break;
                case 355591465:
                case 2008745076:
                    i10 = i10;
                    iM559710 = C0946.m55979(C0947.m55993(f83044, 16, 3, i19));
                    if (C1003.f81929 > 0) {
                        iM55979 = (i14 - C0873.m55680("᩹֨")) * (-95);
                        i8 = ((iM55979 ^ i15) * 26333) ^ 1674077050;
                        i9 = 1484331146;
                        i17 = iM55979 ^ i9;
                        i16 = i8;
                        i10 = i10;
                    } else {
                        sArr3 = sArr3;
                        C13636 c1363110 = c13639;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c13636 = c1363110;
                        iM55681 = C0946.m55979("ܽ᩻") ^ i14;
                        i16 = ((iM55681 ^ i15) * 26365) ^ (-2010429631);
                        i3 = -1686151745;
                        i17 = iM55681 ^ i3;
                        activityC24364 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c1327 = c1327;
                        C1428 c142112 = onBackPressedDispatcher;
                        c13639 = c13636;
                        onBackPressedDispatcher = c142112;
                    }
                    break;
                case 450060691:
                case 535213216:
                    RunnableC0871.m55672();
                    if (!C0947.f81895) {
                        iM55680 = (C0873.m55680("᩻֨") + i14) * 57;
                        i = ((iM55680 ^ i15) * 21745) ^ (-2065452424);
                        i2 = -733300546;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                    } else {
                        i10 = i10;
                        sArr3 = sArr3;
                        C13636 c1363111 = c13639;
                        onBackPressedDispatcher = onBackPressedDispatcher;
                        c13636 = c1363111;
                        iM55681 = C0946.m55979("ܽ᩻") ^ i14;
                        i16 = ((iM55681 ^ i15) * 26365) ^ (-2010429631);
                        i3 = -1686151745;
                        i17 = iM55681 ^ i3;
                        activityC24364 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c1327 = c1327;
                        C1428 c142113 = onBackPressedDispatcher;
                        c13639 = c13636;
                        onBackPressedDispatcher = c142113;
                    }
                    break;
                case 941245273:
                case 1801508272:
                    i10 = i10;
                    c1327 = c1327;
                    sArr2 = sArr2;
                    i20 = i20;
                    i21 = i21;
                    sArr3 = sArr3;
                    C13636 c136321 = c13639;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c13636 = c136321;
                    C1053.m56321(activityC24364, iM55683 ^ i11);
                    strM55592 = C0845.m55592(f83044, 4, 3, i19);
                    if (C0955.f81898) {
                        iM55681 = C0946.m55979("ܽ᩻") ^ i14;
                        i16 = ((iM55681 ^ i15) * 26365) ^ (-2010429631);
                        i3 = -1686151745;
                    } else {
                        iM55681 = C0873.m55680("֫ۛ") ^ i14;
                        i16 = ((iM55681 ^ i15) * 19777) ^ (-954936944);
                        i3 = -1924220954;
                    }
                    i17 = iM55681 ^ i3;
                    activityC24364 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c1327 = c1327;
                    C1428 c142114 = onBackPressedDispatcher;
                    c13639 = c13636;
                    onBackPressedDispatcher = c142114;
                    break;
                case 1030533214:
                case 1215382397:
                    i10 = i10;
                    c1327 = c1327;
                    sArr3 = sArr3;
                    C1326 c1329 = (C1326) viewM56321;
                    activityC24364.f13392 = c1329;
                    RunnableC0897.m55774(activityC24364, c1329);
                    onBackPressedDispatcher = getOnBackPressedDispatcher();
                    C13636 c136322 = new C13636(activityC24364);
                    AbstractC0942.m55962(onBackPressedDispatcher);
                    if (C0845.f81821 < 0) {
                        int iM559715 = C0946.m55979("ۨ۠") ^ i15;
                        i17 = iM559715 ^ (-870824095);
                        c13639 = c136322;
                        i16 = ((iM559715 ^ i14) * (-24317)) ^ (-897306126);
                        sArr3 = sArr3;
                        i10 = i10;
                        c1327 = c1327;
                    } else {
                        c13639 = c136322;
                        sArr2 = sArr2;
                        i20 = i20;
                        i21 = i21;
                        int iM556811 = C0873.m55680("᩹᩷") ^ i15;
                        i16 = ((iM556811 ^ i14) * (-20467)) ^ (-897516524);
                        i17 = iM556811 ^ (-1299840267);
                        activityC24364 = this;
                        i20 = i20;
                        sArr3 = sArr3;
                        i10 = i10;
                        i21 = i21;
                        sArr2 = sArr2;
                        c1327 = c1327;
                    }
                    break;
                default:
                    i10 = i10;
                    c1327 = c1327;
                    sArr2 = sArr2;
                    i20 = i20;
                    i21 = i21;
                    sArr3 = sArr3;
                    C13636 c136323 = c13639;
                    onBackPressedDispatcher = onBackPressedDispatcher;
                    c13636 = c136323;
                    super.onCreate(bundle);
                    if (C0927.m55866()) {
                        iM55681 = (i15 - C0873.m55680("ܿۘ")) * 69;
                        i16 = ((iM55681 ^ i14) * 13137) ^ (-384601267);
                        i3 = -605368953;
                    } else {
                        iM55681 = (C0946.m55979("᩷ᩴ") ^ i14) * 7;
                        i16 = ((iM55681 ^ i15) * (-19321)) ^ (-1773405859);
                        i3 = -320387930;
                    }
                    i17 = iM55681 ^ i3;
                    activityC24364 = this;
                    i20 = i20;
                    sArr3 = sArr3;
                    i10 = i10;
                    i21 = i21;
                    sArr2 = sArr2;
                    c1327 = c1327;
                    C1428 c142115 = onBackPressedDispatcher;
                    c13639 = c13636;
                    onBackPressedDispatcher = c142115;
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
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int iM55681;
        int i4;
        ActivityC24364 activityC24364 = this;
        MenuInflater menuInflater = null;
        MenuItem menuItemM55911 = null;
        boolean z = false;
        boolean z2 = false;
        int iM55682 = 0;
        String strM56584 = null;
        int iM559710 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1513742824;
        int i9 = C1036.f81953;
        int i10 = C1964.f83032;
        int iM55683 = C0873.m55680("ܿۙ") ^ i9;
        int i11 = ((iM55683 ^ i10) * (-7609)) ^ (-640812582);
        int i12 = iM55683 ^ (-189733540);
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
                    iM55680 = C0946.m55979("ܿۗ") ^ i10;
                    i = ((iM55680 ^ i9) * 31777) ^ (-155881211);
                    i2 = -89948853;
                    i12 = iM55680 ^ i2;
                    activityC24364 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -2049008780:
                case 1033826451:
                    menuItemM55911 = C0937.m55911(menu, iM559710 ^ i5);
                    activityC24364.f77149 = menuItemM55911;
                    z = true;
                    if (activityC24364.f77146) {
                        iM55979 = C0873.m55680("ۖ۫") ^ i10;
                        i = ((iM55979 ^ i9) * (-17379)) ^ 1761466018;
                        i3 = -1193675729;
                    } else {
                        z2 = z3;
                        iM55979 = C0873.m55680("ۨۖ") ^ i10;
                        i = ((iM55979 ^ i9) * 20751) ^ (-1445115001);
                        i3 = 2000085365;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i;
                    break;
                case -1970108543:
                case 1951742006:
                    C1194.m56396();
                    if (C0989.f81920 >= 0) {
                        iM55979 = (i9 - C0873.m55680("۠᩷")) * 25;
                        i = ((iM55979 ^ i10) * (-16015)) ^ 225667106;
                        i3 = 420782707;
                        i12 = iM55979 ^ i3;
                        i11 = i;
                    } else {
                        iM55681 = (i10 - C0946.m55979("ۘ֨")) * 25;
                        i11 = ((iM55681 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                        i12 = iM55681 ^ i4;
                        activityC24364 = this;
                    }
                    break;
                case -1925568487:
                case 1097660236:
                    if (activityC24364.f77144.m54464()) {
                        z2 = z3;
                        iM55979 = C0873.m55680("ۨۖ") ^ i10;
                        i = ((iM55979 ^ i9) * 20751) ^ (-1445115001);
                        i3 = 2000085365;
                    } else {
                        iM55979 = C0946.m55979("ܳۜ") ^ i9;
                        i = ((iM55979 ^ i10) * (-17681)) ^ (-1010721228);
                        i3 = -75235733;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i;
                    break;
                case -1875147038:
                case -1325580093:
                    menuInflater = getMenuInflater();
                    sArr2 = f83044;
                    i14 = 23;
                    if (RunnableC0897.f81856) {
                        iM55681 = C0873.m55680("۫ܿ") ^ i9;
                        i11 = ((iM55681 ^ i10) * (-28325)) ^ 201858535;
                        i4 = -1315326880;
                    } else {
                        iM55681 = (i10 - C0946.m55979("ۘ֨")) * 25;
                        i11 = ((iM55681 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                    }
                    i12 = iM55681 ^ i4;
                    activityC24364 = this;
                    break;
                case -1794904003:
                case 1819432258:
                    C1017.m56187();
                    if (C0873.f81841 > 0) {
                        iM55979 = (C0873.m55680("֡᩶") ^ i10) * (-7);
                        i = ((iM55979 ^ i9) * (-2661)) ^ (-1304649837);
                        i3 = 1295274471;
                        i12 = iM55979 ^ i3;
                        i11 = i;
                    } else {
                        iM55681 = (i10 - C0946.m55979("ۘ֨")) * 25;
                        i11 = ((iM55681 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                        i12 = iM55681 ^ i4;
                        activityC24364 = this;
                    }
                    break;
                case -1505086915:
                case 307438643:
                    sArr2 = sArr2;
                    sArr = f83044;
                    if (C1071.f81975 > 0) {
                        iM55680 = (C0946.m55979("ۢ᩺") + i9) * (-11);
                        i = ((iM55680 ^ i10) * 28711) ^ 284220779;
                        i2 = -350449833;
                        i12 = iM55680 ^ i2;
                        activityC24364 = this;
                        sArr2 = sArr2;
                        i11 = i;
                    } else {
                        sArr2 = sArr2;
                        iM55681 = (i10 - C0946.m55979("ۘ֨")) * 25;
                        i11 = ((iM55681 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                        i12 = iM55681 ^ i4;
                        activityC24364 = this;
                    }
                    break;
                case -1439208293:
                case -817849136:
                    sArr2 = sArr2;
                    z3 = false;
                    if (C0927.m55866()) {
                        iM55680 = (C0946.m55979("۠ܶ") ^ i9) * (-91);
                        i = ((iM55680 ^ i10) * (-29075)) ^ 780492029;
                        i2 = 1544243948;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ܺۜ")) * (-25);
                        i = ((iM55680 ^ i10) * 24725) ^ (-1733734586);
                        i2 = -1747595952;
                    }
                    i12 = iM55680 ^ i2;
                    activityC24364 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -979877005:
                case -13663866:
                    sArr2 = sArr2;
                    c = 22;
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0873.m55680("۫᩻") + i9) * 67;
                        i = ((iM55680 ^ i10) * (-7273)) ^ (-1682040842);
                        i2 = 470756420;
                    } else {
                        iM55680 = C0873.m55680("ۢᩳ") ^ i10;
                        i = ((iM55680 ^ i9) * 1177) ^ (-1896026536);
                        i2 = -888106745;
                    }
                    i12 = iM55680 ^ i2;
                    activityC24364 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -923256240:
                case 1467633601:
                    sArr2 = sArr2;
                    i15 = 3;
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("ۧۜ") ^ i9;
                        i = ((iM55680 ^ i10) * (-26789)) ^ 1730738886;
                        i2 = 1819376961;
                    } else {
                        iM55680 = (i10 - C0946.m55979("᩺ۚ")) * (-71);
                        i = ((iM55680 ^ i9) * (-19933)) ^ 1487453087;
                        i2 = -113916644;
                    }
                    i12 = iM55680 ^ i2;
                    activityC24364 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -873395071:
                case -164405581:
                    C0861.m55626();
                    if (C0989.f81920 < 0) {
                        sArr2 = sArr2;
                        iM55680 = (C0873.m55680("۫᩻") + i9) * 67;
                        i = ((iM55680 ^ i10) * (-7273)) ^ (-1682040842);
                        i2 = 470756420;
                        i12 = iM55680 ^ i2;
                        activityC24364 = this;
                        sArr2 = sArr2;
                        i11 = i;
                    } else {
                        iM55681 = (i10 - C0946.m55979("ۘ֨")) * 25;
                        i11 = ((iM55681 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                        i12 = iM55681 ^ i4;
                        activityC24364 = this;
                    }
                    break;
                case -775703694:
                case 354834401:
                    strM56584 = C1964.m56584(sArr3, 26, 3, i13);
                    if (C0946.f81894 == 0) {
                        iM55979 = (C0946.m55979("ۢ۫") ^ i10) * 57;
                        i = ((iM55979 ^ i9) * (-855)) ^ (-120959100);
                        i3 = -2044249718;
                        i12 = iM55979 ^ i3;
                        i11 = i;
                    }
                    sArr2 = sArr2;
                    iM55680 = C0873.m55680("ۧۜ") ^ i9;
                    i = ((iM55680 ^ i10) * (-26789)) ^ 1730738886;
                    i2 = 1819376961;
                    i12 = iM55680 ^ i2;
                    activityC24364 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -669162381:
                case 2040305232:
                    iM559710 = C0946.m55979(strM56584);
                    i5 = 2097227061;
                    if (C0894.f81854 >= 0) {
                        iM55979 = (i9 - C0873.m55680("۠᩷")) * 25;
                        i = ((iM55979 ^ i10) * (-16015)) ^ 225667106;
                        i3 = 420782707;
                    } else {
                        iM55979 = (i9 - C0873.m55680("۠ۖ")) * (-103);
                        i = ((iM55979 ^ i10) * (-15543)) ^ 1342496867;
                        i3 = -1624590605;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i;
                    break;
                case -466807758:
                case 1422467412:
                    menuInflater.inflate(2126769320 ^ iM55682, menu);
                    sArr3 = f83044;
                    if (!C1024.f81946) {
                        iM55979 = C0946.m55979("ۙ֫") ^ i10;
                        i = ((iM55979 ^ i9) * 22307) ^ (-383286497);
                        i3 = 549816560;
                        i12 = iM55979 ^ i3;
                        i11 = i;
                    }
                    sArr2 = sArr2;
                    iM55680 = C0873.m55680("ۧۜ") ^ i9;
                    i = ((iM55680 ^ i10) * (-26789)) ^ 1730738886;
                    i2 = 1819376961;
                    i12 = iM55680 ^ i2;
                    activityC24364 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case -466478763:
                case -209737267:
                    return z3;
                case -136616585:
                case 900538834:
                    sArr2 = sArr2;
                    iM55682 = C0873.m55680(C1017.m56189(sArr2, i14, i15, i13));
                    if (C1229.f82066 < 0) {
                        int iM559711 = (C0946.m55979("ۖ۬") ^ i9) * (-17);
                        i12 = iM559711 ^ 1324426047;
                        sArr2 = sArr2;
                        i11 = ((iM559711 ^ i10) * (-29063)) ^ (-1874417640);
                        activityC24364 = this;
                    } else {
                        iM55680 = (C0873.m55680("۫᩻") + i9) * 67;
                        i = ((iM55680 ^ i10) * (-7273)) ^ (-1682040842);
                        i2 = 470756420;
                        i12 = iM55680 ^ i2;
                        activityC24364 = this;
                        sArr2 = sArr2;
                        i11 = i;
                    }
                    break;
                case -17598411:
                case 1857551394:
                    sArr2 = sArr2;
                    s = sArr[c];
                    s2 = 406;
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("ᩴ۬") ^ i9) * (-97);
                        i = ((iM55680 ^ i10) * (-29337)) ^ 755413837;
                        i2 = -1113081735;
                    } else {
                        iM55680 = (C0873.m55680("۫᩻") + i9) * 67;
                        i = ((iM55680 ^ i10) * (-7273)) ^ (-1682040842);
                        i2 = 470756420;
                    }
                    i12 = iM55680 ^ i2;
                    activityC24364 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case 11588745:
                case 1908222475:
                    C1071.m56343();
                    iM55681 = (i10 - C0946.m55979("ۘ֨")) * 25;
                    i11 = ((iM55681 ^ i9) * (-29617)) ^ 249471353;
                    i4 = 1315502323;
                    i12 = iM55681 ^ i4;
                    activityC24364 = this;
                    break;
                case 226401832:
                case 384932035:
                    AbstractC0942.m55971();
                    return false;
                case 435269202:
                case 492846711:
                    z2 = true;
                    iM55979 = C0873.m55680("ۨۖ") ^ i10;
                    i = ((iM55979 ^ i9) * 20751) ^ (-1445115001);
                    i3 = 2000085365;
                    i12 = iM55979 ^ i3;
                    i11 = i;
                    break;
                case 634605080:
                case 710739524:
                    sArr2 = sArr2;
                    if ((i6 + i7) - i16 < 0) {
                        iM55680 = C0946.m55979("ܶۧ") ^ i9;
                        i = ((iM55680 ^ i10) * 9521) ^ 1021374133;
                        i2 = 1676787418;
                    } else {
                        iM55680 = C0873.m55680("֨۬") ^ i10;
                        i = ((iM55680 ^ i9) * 2635) ^ (-680748064);
                        i2 = 1775516825;
                    }
                    i12 = iM55680 ^ i2;
                    activityC24364 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                case 1121270648:
                case 1205480855:
                    C0845.m55587(menuItemM55911, z2);
                    return z;
                case 1547144254:
                case 1549012472:
                    i13 = 16593;
                    iM55680 = C0946.m55979("ܿۗ") ^ i10;
                    i = ((iM55680 ^ i9) * 31777) ^ (-155881211);
                    i2 = -89948853;
                    i12 = iM55680 ^ i2;
                    activityC24364 = this;
                    sArr2 = sArr2;
                    i11 = i;
                    break;
                default:
                    sArr2 = sArr2;
                    i16 = s * s2;
                    i6 = s * s;
                    i7 = 41209;
                    if (C0845.f81821 < 0) {
                        iM55680 = C0946.m55979("ۜۛ") ^ i10;
                        i = ((iM55680 ^ i9) * (-6057)) ^ (-1840321581);
                        i2 = 271618948;
                        i12 = iM55680 ^ i2;
                        activityC24364 = this;
                        sArr2 = sArr2;
                        i11 = i;
                    } else {
                        sArr2 = sArr2;
                        iM55681 = (i10 - C0946.m55979("ۘ֨")) * 25;
                        i11 = ((iM55681 ^ i9) * (-29617)) ^ 249471353;
                        i4 = 1315502323;
                        i12 = iM55681 ^ i4;
                        activityC24364 = this;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        C7581 c7581 = null;
        C14956 c14956 = null;
        C18309 c18309 = null;
        int i = -418934976;
        int i2 = C0912.f81867;
        int i3 = C1124.f82007;
        int iM55680 = (C0873.m55680("ۖۡ") + i2) * (-85);
        int i4 = ((iM55680 ^ i3) * (-1183)) ^ (-534092121);
        int i5 = -2111203441;
        while (true) {
            i = ((((i ^ i3) * (-30709)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2010185242:
                case -743126086:
                    if (C1046.f81962 > 0) {
                        iM55680 = (C0946.m55979("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM55680 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܶ֫")) * 19;
                        i4 = ((iM55680 ^ i2) * (-15993)) ^ (-1198841668);
                        i5 = 454767822;
                    }
                    break;
                case -1963384134:
                case -1495260263:
                    if (C1012.f81938 < 0) {
                        iM55680 = C0873.m55680("ۘᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 32357) ^ (-1043989977);
                        i5 = -1870725454;
                    } else {
                        iM55680 = (C0946.m55979("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM55680 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    }
                    break;
                case -1823650944:
                case 295997305:
                    c18309 = this.f77147;
                    if (c18309 != null) {
                        iM55680 = (C0873.m55680("ܳ֫") + i3) * (-93);
                        i4 = ((iM55680 ^ i2) * (-28557)) ^ 31256740;
                        i5 = 627888899;
                    } else {
                        iM55680 = C0873.m55680("ܺۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 19653) ^ 1703743881;
                        i5 = -1861063790;
                    }
                    break;
                case -1814896863:
                case 361363146:
                    c14956 = this.f77148;
                    if (c14956 != null) {
                        iM55680 = (C0873.m55680("᩺۟") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i2) * 14173) ^ (-1524553806);
                        i5 = -1986851745;
                    } else {
                        iM55680 = C0946.m55979("᩻ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25393) ^ (-2115359382);
                        i5 = -796611628;
                    }
                    break;
                case -1719440720:
                case 1974202034:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("ۗ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 6913) ^ 1277334372;
                        i5 = 1272442186;
                    } else {
                        iM55680 = C0873.m55680("ۙܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 17543) ^ (-1037302073);
                        i5 = 1460144083;
                    }
                    break;
                case -1480757552:
                case -1263975117:
                    c7581.m17504();
                    iM55680 = C0873.m55680("᩶ۡ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 10245) ^ (-1085985437);
                    i5 = -121770570;
                    break;
                case -1444329807:
                case -1114397802:
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0946.m55979("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM55680 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM55680 = (C0873.m55680("ᩳۘ") + i3) * 33;
                        i4 = ((iM55680 ^ i2) * (-19147)) ^ (-526893589);
                        i5 = -89722429;
                    }
                    break;
                case -1306309907:
                case 533980993:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0873.m55680("ۗ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 6913) ^ 1277334372;
                        i5 = 1272442186;
                    } else {
                        iM55680 = (C0946.m55979("ۗܶ") ^ i2) * (-119);
                        i4 = ((iM55680 ^ i3) * 20889) ^ (-1612423916);
                        i5 = -1228940040;
                    }
                    break;
                case -1276800037:
                case -878285701:
                    c7581 = this.f77145;
                    if (c7581 != null) {
                        iM55680 = C0873.m55680("ۜ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-32325)) ^ 743909031;
                        i5 = -461934837;
                    } else {
                        iM55680 = C0873.m55680("᩶ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 10245) ^ (-1085985437);
                        i5 = -121770570;
                    }
                    break;
                case -1170211835:
                case -65114100:
                    if (C0927.m55873() <= 0) {
                        iM55680 = (C0946.m55979("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM55680 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM55680 = C0873.m55680("᩶ܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14377) ^ 1601944745;
                        i5 = 830691783;
                    }
                    break;
                case -1085212737:
                case -9050630:
                    super.onResume();
                    if (C0882.m55710() != 0) {
                        iM55680 = (C0946.m55979("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM55680 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM55680 = (C0873.m55680("ۚܳ") ^ i2) * (-13);
                        i4 = ((iM55680 ^ i3) * (-8923)) ^ (-279221410);
                        i5 = 2022317296;
                    }
                    break;
                case -757573927:
                case 2050945500:
                    break;
                case -563224548:
                case 1847807839:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0946.m55979("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM55680 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM55680 = C0946.m55979("ܶۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 26737) ^ 1701267593;
                        i5 = 1333762110;
                    }
                    break;
                case -515651131:
                case 9634657:
                    c14956.m34233();
                    iM55680 = C0946.m55979("᩻ۛ") ^ i2;
                    i4 = ((iM55680 ^ i3) * 25393) ^ (-2115359382);
                    i5 = -796611628;
                    break;
                case -305697815:
                case 1917499694:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0946.m55979("֡ܽ") ^ i3) * (-81);
                        i4 = ((iM55680 ^ i2) * 4247) ^ (-1839907199);
                        i5 = -2133656382;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֨᩸")) * 93;
                        i4 = ((iM55680 ^ i2) * 9525) ^ 578792422;
                        i5 = 686386558;
                    }
                    break;
                case -164109401:
                case 2147070969:
                    if (RunnableC0897.f81856) {
                        iM55680 = C0946.m55979("ۗ᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * 16439) ^ (-908773936);
                        i5 = 1352953155;
                    } else {
                        iM55680 = C0873.m55680("ۘᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 32357) ^ (-1043989977);
                        i5 = -1870725454;
                    }
                    break;
                case -137703698:
                case 1260258833:
                    c18309.m41728();
                    iM55680 = C0873.m55680("ܺۙ") ^ i2;
                    i4 = ((iM55680 ^ i3) * 19653) ^ 1703743881;
                    i5 = -1861063790;
                    break;
                case 72614517:
                case 1187575416:
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0873.m55680("ۗ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 6913) ^ 1277334372;
                        i5 = 1272442186;
                    } else {
                        iM55680 = (C0873.m55680("ۤ۠") + i3) * 25;
                        i4 = ((iM55680 ^ i2) * 15217) ^ (-105374925);
                        i5 = -1739261322;
                    }
                    break;
                case 154142910:
                case 905444601:
                    C0890.m55740();
                    C0894.m55769();
                    break;
                case 213231064:
                case 2014899824:
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("ۗ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 6913) ^ 1277334372;
                        i5 = 1272442186;
                    } else {
                        iM55680 = (C0873.m55680("᩻ۚ") + i2) * (-31);
                        i4 = ((iM55680 ^ i3) * (-29019)) ^ 1614518710;
                        i5 = 1401439811;
                    }
                    break;
                case 1894398721:
                case 1908108391:
                    RunnableC1014.m56177();
                    if (C0854.m55595() < 0) {
                        iM55680 = (i3 - C0873.m55680("ܶ֫")) * 19;
                        i4 = ((iM55680 ^ i2) * (-15993)) ^ (-1198841668);
                        i5 = 454767822;
                    } else {
                        iM55680 = (C0873.m55680("۠ܰ") + i2) * (-57);
                        i4 = ((iM55680 ^ i3) * 6593) ^ 1689880044;
                        i5 = -292288894;
                    }
                    break;
                default:
                    C0892.m55749();
                    iM55680 = (C0873.m55680("۠ܰ") + i2) * (-57);
                    i4 = ((iM55680 ^ i3) * 6593) ^ 1689880044;
                    i5 = -292288894;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public final void m53717() {
        MenuItem menuItem = null;
        boolean z = false;
        int i = -2063450364;
        int i2 = ViewOnClickListenerC0939.f81888;
        int i3 = C0898.f81858;
        int iM55979 = C0946.m55979("᩵ᩳ") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-8927)) ^ 1896557703;
        int i5 = -1955788441;
        while (true) {
            i = ((((i ^ i2) * 23379) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2081800143:
                case -1775289801:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55979 = (C0873.m55680("ۤܳ") + i3) * (-11);
                        i4 = ((iM55979 ^ i2) * 24553) ^ (-1101682433);
                        i5 = 1186206393;
                    } else {
                        iM55979 = C0946.m55979("ۡ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 3557) ^ (-1302679619);
                        i5 = 616584000;
                    }
                    break;
                case -1901139005:
                case -226667634:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = (i2 - C0946.m55979("ۙۤ")) * 17;
                        i4 = ((iM55979 ^ i3) * 14877) ^ 152726286;
                        i5 = 1395697466;
                    } else {
                        iM55979 = C0946.m55979("᩸ۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1665)) ^ (-37541132);
                        i5 = -815191929;
                    }
                    break;
                case -1689667617:
                case 334570075:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("ۡۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23457)) ^ (-854506791);
                        i5 = -2000060731;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۨ᩸")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * (-7975)) ^ 822547277;
                        i5 = -1701592259;
                    }
                    break;
                case -1620690363:
                case 1030364927:
                    if (C1048.m56305() >= 0) {
                        iM55979 = (i2 - C0946.m55979("ۙۤ")) * 17;
                        i4 = ((iM55979 ^ i3) * 14877) ^ 152726286;
                        i5 = 1395697466;
                    } else {
                        iM55979 = C0873.m55680("ܺ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2799)) ^ (-2099887948);
                        i5 = -1694290183;
                    }
                    break;
                case -1499904041:
                case -585301226:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = C0873.m55680("ۘܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28793)) ^ (-887719193);
                        i5 = 102239789;
                    } else {
                        iM55979 = C0946.m55979("᩷᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 22539) ^ (-488237265);
                        i5 = 627884984;
                    }
                    break;
                case -1160424411:
                case -819958741:
                    if (C1048.f81963) {
                        iM55979 = (C0946.m55979("᩶ۛ") ^ i2) * (-17);
                        i4 = ((iM55979 ^ i3) * 16941) ^ 1671729615;
                        i5 = -1261933352;
                    } else {
                        iM55979 = C0946.m55979("ۛܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30087)) ^ 594763252;
                        i5 = -1487875154;
                    }
                    break;
                case -1145061496:
                case -693080336:
                    C0863.m55633(menuItem, z);
                    iM55979 = (i2 - C0946.m55979("ᩴᩴ")) * 87;
                    i4 = ((iM55979 ^ i3) * (-8411)) ^ (-1767191324);
                    i5 = 1799723430;
                    break;
                case -981467402:
                case -600630388:
                    C1229.m56410();
                    if (C1028.f81950 > 0) {
                        iM55979 = (C0873.m55680("ۤܳ") + i3) * (-11);
                        i4 = ((iM55979 ^ i2) * 24553) ^ (-1101682433);
                        i5 = 1186206393;
                    } else {
                        iM55979 = C0873.m55680("ۘܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28793)) ^ (-887719193);
                        i5 = 102239789;
                    }
                    break;
                case -870336708:
                case -560847212:
                    if (this.f77146) {
                        iM55979 = (i3 - C0873.m55680("֫֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i2) * 21247) ^ 998763961;
                        i5 = 1050175676;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ܿ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55979 ^ i3) * (-4857)) ^ 639851031;
                        i5 = 1449750936;
                    }
                    break;
                case -802639924:
                case 1128577150:
                    if (this.f77144.m54464()) {
                        iM55979 = (i2 - C0873.m55680("ܿ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55979 ^ i3) * (-4857)) ^ 639851031;
                        i5 = 1449750936;
                    } else {
                        iM55979 = C0946.m55979("᩺ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1017)) ^ (-1462700179);
                        i5 = 2092556603;
                    }
                    break;
                case -630810927:
                case 2081807981:
                    z = false;
                    iM55979 = (i2 - C0946.m55979("ۧܿ")) * (-55);
                    i4 = ((iM55979 ^ i3) * 14035) ^ (-241035947);
                    i5 = 1463320767;
                    break;
                case -588642583:
                case 566870444:
                    C1036.m56257();
                    break;
                case -453099718:
                case 713275153:
                    if (C0854.m55595() >= 0) {
                        iM55979 = C0873.m55680("ۘܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28793)) ^ (-887719193);
                        i5 = 102239789;
                    } else {
                        iM55979 = C0873.m55680("ۡۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23457)) ^ (-854506791);
                        i5 = -2000060731;
                    }
                    break;
                case -210523092:
                case 1236619042:
                    if (!C0927.f81875) {
                        iM55979 = (i2 - C0946.m55979("ۙۤ")) * 17;
                        i4 = ((iM55979 ^ i3) * 14877) ^ 152726286;
                        i5 = 1395697466;
                    } else {
                        iM55979 = (C0873.m55680("ۤܳ") + i3) * (-11);
                        i4 = ((iM55979 ^ i2) * 24553) ^ (-1101682433);
                        i5 = 1186206393;
                    }
                    break;
                case -51691242:
                case 742690402:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0946.m55979("ۛܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30087)) ^ 594763252;
                        i5 = -1487875154;
                    } else {
                        iM55979 = C0873.m55680("᩵ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 8249) ^ 773360463;
                        i5 = 1741651590;
                    }
                    break;
                case -38225769:
                case 577698958:
                    break;
                case 245158535:
                case 899278251:
                    C0967.m56074();
                    C0877.m55696();
                    iM55979 = C0873.m55680("ۡۜ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-23457)) ^ (-854506791);
                    i5 = -2000060731;
                    break;
                case 431494610:
                case 1076137500:
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("ۛܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30087)) ^ 594763252;
                        i5 = -1487875154;
                    } else {
                        iM55979 = C0946.m55979("ۛۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23861)) ^ 1566683597;
                        i5 = -1406938119;
                    }
                    break;
                case 720429137:
                case 1950276948:
                    z = true;
                    iM55979 = (i2 - C0946.m55979("ۧܿ")) * (-55);
                    i4 = ((iM55979 ^ i3) * 14035) ^ (-241035947);
                    i5 = 1463320767;
                    break;
                case 770411155:
                case 1671056776:
                    if (C0917.f81868) {
                        iM55979 = (i2 - C0946.m55979("ۙۤ")) * 17;
                        i4 = ((iM55979 ^ i3) * 14877) ^ 152726286;
                        i5 = 1395697466;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩹ۙ")) * 49;
                        i4 = ((iM55979 ^ i2) * (-23599)) ^ 1053155809;
                        i5 = -528246828;
                    }
                    break;
                case 775046537:
                case 871358903:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("ۤܳ") + i3) * (-11);
                        i4 = ((iM55979 ^ i2) * 24553) ^ (-1101682433);
                        i5 = 1186206393;
                    } else {
                        iM55979 = C0873.m55680("ܽܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31799) ^ (-1847815869);
                        i5 = -84298789;
                    }
                    break;
                default:
                    menuItem = this.f77149;
                    if (menuItem != null) {
                        iM55979 = C0873.m55680("ۖ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2427) ^ 1966355995;
                        i5 = -996447710;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩴᩴ")) * 87;
                        i4 = ((iM55979 ^ i3) * (-8411)) ^ (-1767191324);
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
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        ActivityC24364 activityC24364 = this;
        int i4 = C1003.f81929;
        int i5 = C1229.f82066;
        int iM55682 = (i5 - C0873.m55680("ۤ۬")) * 61;
        int i6 = ((iM55682 ^ i4) * (-3185)) ^ (-105479607);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM55682 ^ 1873733423;
        int iM56307 = 0;
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
        String strM55618 = null;
        String strM56203 = null;
        String strM55792 = null;
        String strM55707 = null;
        boolean z = false;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * 1019) >> 31));
            switch (i15) {
                case -2112655385:
                case 475942024:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0946.m55979("ܳ᩸") + i5) * (-55);
                        i = ((iM55680 ^ i4) * 11197) ^ 1498785029;
                        i2 = -1096381215;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55681 = C0873.m55680("᩵ۜ") ^ i5;
                        i6 = ((iM55681 ^ i4) * (-4271)) ^ 1792658683;
                        i3 = 1398764942;
                        i7 = iM55681 ^ i3;
                        activityC24364 = this;
                    }
                    break;
                case -2087884930:
                case -1000589225:
                    ServiceConnectionC1013.m56163(activityC24364, new Intent(activityC24364, (Class<?>) ActivityC6260.class));
                    return z;
                case -2076323085:
                case -671526238:
                    return false;
                case -2022469773:
                case -1146812019:
                    c = 29;
                    if (C1017.f81942 >= 0) {
                        iM55681 = C0873.m55680("᩵ۜ") ^ i5;
                        i6 = ((iM55681 ^ i4) * (-4271)) ^ 1792658683;
                        i3 = 1398764942;
                    } else {
                        iM55681 = C0873.m55680("ܽۖ") ^ i5;
                        i6 = ((iM55681 ^ i4) * 8253) ^ 488102104;
                        i3 = -1613356171;
                    }
                    i7 = iM55681 ^ i3;
                    activityC24364 = this;
                    break;
                case -1938797734:
                case 1520614718:
                    C1012.m56134();
                    if (C1404.f82149 < 0) {
                        iM55681 = C0873.m55680("᩵ۜ") ^ i5;
                        i6 = ((iM55681 ^ i4) * (-4271)) ^ 1792658683;
                        i3 = 1398764942;
                        i7 = iM55681 ^ i3;
                        activityC24364 = this;
                    } else {
                        iM55680 = (C0873.m55680("۬ܽ") ^ i4) * (-113);
                        i = ((iM55680 ^ i5) * 26619) ^ (-1165133678);
                        i2 = 2136411398;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1885592173:
                case 537372894:
                    int i17 = i16 + i11;
                    if (i14 - (i17 + i17) <= 0) {
                        iM55680 = C0946.m55979("ܰۢ") ^ i4;
                        i = ((iM55680 ^ i5) * (-27035)) ^ (-42259620);
                        i2 = -736797702;
                    } else {
                        iM55680 = C0873.m55680("ۘۛ") ^ i5;
                        i = ((iM55680 ^ i4) * 26209) ^ (-501120171);
                        i2 = -1085947123;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -1751730041:
                case 813755028:
                    i14 = i13 * i13;
                    i16 = s * s;
                    i11 = 2762244;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("ܳ᩸") + i5) * (-55);
                        i = ((iM55680 ^ i4) * 11197) ^ 1498785029;
                        i2 = -1096381215;
                    } else {
                        iM55680 = C0873.m55680("۬۫") ^ i4;
                        i = ((iM55680 ^ i5) * 31225) ^ (-260124515);
                        i2 = -1377460092;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -1645872890:
                case 639795911:
                    if (iM56307 == (C0946.m55979(strM56203) ^ 2129398427)) {
                        iM55680 = C0873.m55680("ۘ᩵") ^ i4;
                        i = ((iM55680 ^ i5) * (-8007)) ^ 547524068;
                        i2 = 1729841731;
                    } else {
                        iM55680 = (C0873.m55680("ۗܰ") ^ i5) * 49;
                        i = ((iM55680 ^ i4) * 18185) ^ 1546356316;
                        i2 = 389255984;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -1590445466:
                case -680277162:
                    z = true;
                    if (iM56307 == (C0946.m55979(strM55707) ^ 2099739447)) {
                        iM55680 = (i5 - C0946.m55979("ۧᩴ")) * 37;
                        i = ((iM55680 ^ i4) * 12885) ^ 996550555;
                        i2 = 1945500629;
                    } else {
                        iM55680 = (C0946.m55979("ۧۡ") + i4) * 5;
                        i = ((iM55680 ^ i5) * (-20413)) ^ (-1730189164);
                        i2 = -1062572813;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -1438986135:
                case 369972819:
                    C1044.m56284(activityC24364, new Intent(activityC24364, (Class<?>) ActivityC18153.class));
                    return z;
                case -1296614660:
                case 160513805:
                    strM56203 = C1024.m56203(f83044, 36, 3, i12);
                    if (C0912.f81867 > 0) {
                        iM55680 = C0946.m55979("ۘۤ") ^ i4;
                        i = ((iM55680 ^ i5) * (-11905)) ^ 1191060892;
                        i2 = 73073059;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55681 = (C0873.m55680("᩺᩹") ^ i4) * (-119);
                        i6 = ((iM55681 ^ i5) * (-18823)) ^ (-869795097);
                        i3 = 2066499944;
                        i7 = iM55681 ^ i3;
                        activityC24364 = this;
                    }
                    break;
                case -1223887791:
                case 1032839027:
                    C1194.m56396();
                    C0906.m55809();
                    return false;
                case -912359596:
                case 432424238:
                    strM55618 = C0861.m55618(f83044, 39, 3, i12);
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0873.m55680("۬ܽ") ^ i4) * (-113);
                        i = ((iM55680 ^ i5) * 26619) ^ (-1165133678);
                        i2 = 2136411398;
                    } else {
                        iM55680 = C0873.m55680("ۘܺ") ^ i4;
                        i = ((iM55680 ^ i5) * (-28669)) ^ 1797593771;
                        i2 = 135699141;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -492008498:
                case -241128035:
                    C0989.m56095();
                    iM55680 = (C0873.m55680("۬ܽ") ^ i4) * (-113);
                    i = ((iM55680 ^ i5) * 26619) ^ (-1165133678);
                    i2 = 2136411398;
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -359652989:
                case 711924175:
                    if (iM56307 == (C0946.m55979(strM55618) ^ 2123090956)) {
                        iM55680 = C0946.m55979("ܺ֨") ^ i5;
                        i = ((iM55680 ^ i4) * 25135) ^ (-1237648478);
                        i2 = -690811288;
                    } else {
                        iM55680 = C0946.m55979("۟ۜ") ^ i5;
                        i = ((iM55680 ^ i4) * 11985) ^ 1310123971;
                        i2 = 1711885368;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case -318656708:
                case 2074703789:
                    C0937.m55918();
                    if (C1194.m56396() <= 0) {
                        iM55680 = (i4 - C0946.m55979("᩻ۡ")) * 119;
                        i = ((iM55680 ^ i5) * (-19953)) ^ (-1501516061);
                        i2 = 1581642352;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55681 = C0873.m55680("᩵ۜ") ^ i5;
                        i6 = ((iM55681 ^ i4) * (-4271)) ^ 1792658683;
                        i3 = 1398764942;
                        i7 = iM55681 ^ i3;
                        activityC24364 = this;
                    }
                    break;
                case -160635360:
                case 1113349773:
                    i12 = 35347;
                    iM55680 = C0946.m55979("ܳۗ") ^ i5;
                    i = ((iM55680 ^ i4) * (-29185)) ^ 1329438323;
                    i2 = -2034947643;
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case 18065312:
                case 159683244:
                    sArr = f83044;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55681 = (C0873.m55680("᩺᩹") ^ i4) * (-119);
                        i6 = ((iM55681 ^ i5) * (-18823)) ^ (-869795097);
                        i3 = 2066499944;
                    } else {
                        iM55681 = C0873.m55680("ۗᩳ") ^ i4;
                        i6 = ((iM55681 ^ i5) * 17549) ^ (-109046199);
                        i3 = -1713586279;
                    }
                    i7 = iM55681 ^ i3;
                    activityC24364 = this;
                    break;
                case 169749232:
                case 1164115126:
                    ActivityC19020.m43195(activityC24364, C1229.m56403(f83044, 42, 3, i12));
                    return z;
                case 246799689:
                case 1953317040:
                    i12 = 38847;
                    iM55680 = C0946.m55979("ܳۗ") ^ i5;
                    i = ((iM55680 ^ i4) * (-29185)) ^ 1329438323;
                    i2 = -2034947643;
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case 473980571:
                case 2108806811:
                    if (iM56307 == (C0873.m55680(strM55792) ^ 2129860221)) {
                        iM55680 = (i5 - C0873.m55680("ܺۙ")) * 27;
                        i = ((iM55680 ^ i4) * (-25429)) ^ (-1138032118);
                        i2 = 1853269137;
                    } else {
                        iM55680 = C0873.m55680("۫ۛ") ^ i4;
                        i = ((iM55680 ^ i5) * (-14649)) ^ 741497160;
                        i2 = 736672309;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case 541647606:
                case 1045229624:
                    strM55792 = C0898.m55792(sArr3, i9, i10, i12);
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0873.m55680("۬ܽ") ^ i4) * (-113);
                        i = ((iM55680 ^ i5) * 26619) ^ (-1165133678);
                        i2 = 2136411398;
                    } else {
                        iM55680 = (C0873.m55680("ۨܶ") + i5) * 79;
                        i = ((iM55680 ^ i4) * 12901) ^ (-1195784449);
                        i2 = -170822304;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case 774242571:
                case 1681198829:
                    short s2 = sArr[c];
                    int i18 = s2 + 1662;
                    if (C0877.f81843 >= 0) {
                        s = s2;
                        i13 = i18;
                        iM55681 = (C0873.m55680("᩺᩹") ^ i4) * (-119);
                        i6 = ((iM55681 ^ i5) * (-18823)) ^ (-869795097);
                        i3 = 2066499944;
                        i7 = iM55681 ^ i3;
                    } else {
                        int iM55683 = (i5 - C0873.m55680("۫᩵")) * 79;
                        int i19 = ((iM55683 ^ i4) * (-30195)) ^ (-468518132);
                        i7 = iM55683 ^ (-645766617);
                        s = s2;
                        i13 = i18;
                        i6 = i19;
                    }
                    activityC24364 = this;
                    break;
                case 927271558:
                case 1273350688:
                    iM56307 = C1048.m56307(menuItem);
                    sArr2 = f83044;
                    i8 = 30;
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0873.m55680("۬ܽ") ^ i4) * (-113);
                        i = ((iM55680 ^ i5) * 26619) ^ (-1165133678);
                        i2 = 2136411398;
                    } else {
                        iM55680 = C0873.m55680("ܶ۠") ^ i4;
                        i = ((iM55680 ^ i5) * (-11447)) ^ 280035325;
                        i2 = 245523627;
                    }
                    i7 = iM55680 ^ i2;
                    i6 = i;
                    break;
                case 1730358913:
                case 1732727948:
                    activityC24364.f77144.m54457((String) null);
                    activityC24364.f77144.m54461(z);
                    return z;
                case 1825138361:
                case 2028809802:
                    sArr3 = f83044;
                    i9 = 33;
                    i10 = 3;
                    if (C1044.f81959 < 0) {
                        iM55680 = (C0873.m55680("ۖۧ") ^ i4) * 23;
                        i = ((iM55680 ^ i5) * (-19599)) ^ (-1284202346);
                        i2 = 648433319;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55681 = C0873.m55680("᩵ۜ") ^ i5;
                        i6 = ((iM55681 ^ i4) * (-4271)) ^ 1792658683;
                        i3 = 1398764942;
                        i7 = iM55681 ^ i3;
                        activityC24364 = this;
                    }
                    break;
                default:
                    strM55707 = C0877.m55707(sArr2, i8, 3, i12);
                    if (C1229.m56410() == 0) {
                        iM55680 = (i5 - C0946.m55979("ܰ۬")) * (-109);
                        i = ((iM55680 ^ i4) * 28347) ^ 1662937363;
                        i2 = -340911481;
                        i7 = iM55680 ^ i2;
                        i6 = i;
                    } else {
                        iM55681 = (C0873.m55680("᩺᩹") ^ i4) * (-119);
                        i6 = ((iM55681 ^ i5) * (-18823)) ^ (-869795097);
                        i3 = 2066499944;
                        i7 = iM55681 ^ i3;
                        activityC24364 = this;
                    }
                    break;
            }
        }
    }
}
