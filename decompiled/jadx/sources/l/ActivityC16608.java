package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar448;

/* JADX INFO: renamed from: l.ܽۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F2T1 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16608 extends AbstractActivityC3346 implements InterfaceC4585 {

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean f51007;

    /* JADX INFO: renamed from: ܳ᩵ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f51008 = {6745, -17706, 17501, 30144, -20716, 31338, -24419, 18409, -24164, 22164, 20130, -23928, -22308, 30924, 17879, 16727, 20621, 30488, -18644, -17260, 20806, 30681, 5049, -25188, -17437, -16804, 3295, -5108, -12639, -9636, 5693, -7435, 3037, -32318, -32307, -32313, -32303, -32308, -32310, -32313, -32371, -32310, -32307, -32297, -32314, -32307, -32297, -32371, -32318, -32320, -32297, -32310, -32308, -32307, -32371, -32267, -32278, -32282, -32268, -32313, -32314, -32299, -32314, -32305, -32308, -32301, -32314, -32303, -32269, -32305, -32298, -32316, -32310, -32307, -32278, -32313, -32304, -9459, -1405, 3141, 721, 14214, 14247, 14260, 14247, 14254, 14253, 14258, 14247, 14256, 14209, 14247, 14252, 14262, 14247, 14256, 14211, 14241, 14262, 14251, 14260, 14251, 14262, 14267};

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f51009;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C12346 f51010;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public TextView f51011;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f51012;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C4346 f51013;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C2447 f51014;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public long f51015;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = -45206779;
        int i8 = C2167.f7158;
        int i9 = C22628.f73083;
        int iM2566 = (i8 - C0630.m2566("ۧܿ")) * (-39);
        int i10 = ((iM2566 ^ i9) * 32229) ^ (-1772980044);
        int i11 = 467400820;
        while (true) {
            i7 = ((((i7 ^ i9) * 16817) >> 31) & i10) ^ (iM2566 ^ i11);
            switch (i7) {
                case -2144602672:
                case 2077016296:
                    int i12 = i3 + i4;
                    if (i2 - (i12 + i12) <= 0) {
                        iM2566 = (i9 - C0630.m2566("֡۠")) * (-81);
                        i10 = ((iM2566 ^ i8) * (-21351)) ^ (-1496959094);
                        i11 = 1964399826;
                    } else {
                        iM2566 = C2105.m6981("ۗ۠") ^ i8;
                        i10 = ((iM2566 ^ i9) * 22021) ^ 571698689;
                        i11 = 301947170;
                    }
                    break;
                case -2080043072:
                case -2034320775:
                    c = 'P';
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("᩶۟") + i9) * 57;
                        i10 = ((iM2566 ^ i8) * 21889) ^ (-1425198699);
                        i11 = 520660327;
                    } else {
                        iM2566 = (C2105.m6981("ۜ᩷") ^ i9) * (-79);
                        i10 = ((iM2566 ^ i8) * (-31909)) ^ 1368630111;
                        i11 = -1681401846;
                    }
                    break;
                case -2051569784:
                case 2007323359:
                    C4075.m12263();
                    if (!C1711.f5919) {
                        iM2566 = C0630.m2566("ܿۗ") ^ i9;
                        i10 = ((iM2566 ^ i8) * 28447) ^ (-316369703);
                        i11 = -1434267670;
                    } else {
                        iM2566 = (C2105.m6981("᩶۟") + i9) * 57;
                        i10 = ((iM2566 ^ i8) * 21889) ^ (-1425198699);
                        i11 = 520660327;
                    }
                    break;
                case -2042881848:
                case -380777554:
                    if (C1005.f3721) {
                        iM2566 = C2105.m6981("ۙۚ") ^ i9;
                        i10 = ((iM2566 ^ i8) * (-20585)) ^ 1118936261;
                        i11 = -1285724229;
                    } else {
                        iM2566 = C0630.m2566("۫᩻") ^ i9;
                        i10 = ((iM2566 ^ i8) * 21821) ^ 1341793332;
                        i11 = 2145207604;
                    }
                    break;
                case -2039322130:
                case -1289730322:
                    i5 = 14274;
                    iM2566 = (C2105.m6981("᩺ܿ") ^ i9) * (-73);
                    i10 = ((iM2566 ^ i8) * 4963) ^ 470472308;
                    i11 = 393194573;
                    break;
                case -2024966936:
                case -1040639860:
                    C1711.m5736();
                    iM2566 = (C2105.m6981("᩶۟") + i9) * 57;
                    i10 = ((iM2566 ^ i8) * 21889) ^ (-1425198699);
                    i11 = 520660327;
                    break;
                case -1849316727:
                case -781279651:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("ۘ᩹") ^ i8;
                        i10 = ((iM2566 ^ i9) * 1729) ^ (-206607616);
                        i11 = 1578833519;
                    } else {
                        iM2566 = C0630.m2566("᩶۫") ^ i9;
                        i10 = ((iM2566 ^ i8) * 18333) ^ (-689900959);
                        i11 = -1885434325;
                    }
                    break;
                case -1755222449:
                case -131489334:
                    sArr = f51008;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۘ᩹") ^ i8;
                        i10 = ((iM2566 ^ i9) * 1729) ^ (-206607616);
                        i11 = 1578833519;
                    } else {
                        iM2566 = (i8 - C2105.m6981("֡֨")) * 15;
                        i10 = ((iM2566 ^ i9) * 31747) ^ 454668258;
                        i11 = 767692152;
                    }
                    break;
                case -1692785694:
                case -355207721:
                    i = s + 1253;
                    if (C2272.f7362) {
                        iM2566 = C0630.m2566("۫᩻") ^ i9;
                        i10 = ((iM2566 ^ i8) * 21821) ^ 1341793332;
                        i11 = 2145207604;
                    } else {
                        iM2566 = (i9 - C2105.m6981("᩻ۙ")) * 81;
                        i10 = ((iM2566 ^ i8) * (-11943)) ^ (-1861361239);
                        i11 = -1260440186;
                    }
                    break;
                case -1621021071:
                case 650675787:
                    C2126.m7040();
                    if (C2520.f8000 < 0) {
                        iM2566 = C2105.m6981("ۘ᩹") ^ i8;
                        i10 = ((iM2566 ^ i9) * 1729) ^ (-206607616);
                        i11 = 1578833519;
                    } else {
                        iM2566 = (C2105.m6981("᩶۟") + i9) * 57;
                        i10 = ((iM2566 ^ i8) * 21889) ^ (-1425198699);
                        i11 = 520660327;
                    }
                    break;
                case -1391124302:
                case 1245623079:
                    C1773.m5908();
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C2105.m6981("᩶۟") + i9) * 57;
                        i10 = ((iM2566 ^ i8) * 21889) ^ (-1425198699);
                        i11 = 520660327;
                    } else {
                        iM2566 = C2105.m6981("ܰۡ") ^ i8;
                        i10 = ((iM2566 ^ i9) * 20731) ^ 984241131;
                        i11 = -1359791288;
                    }
                    break;
                case -1268738009:
                case 1362470711:
                    sArr2 = f51008;
                    i6 = 81;
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("۫᩻") ^ i9;
                        i10 = ((iM2566 ^ i8) * 21821) ^ 1341793332;
                        i11 = 2145207604;
                    } else {
                        iM2566 = (C0630.m2566("ܺ᩷") + i8) * (-47);
                        i10 = ((iM2566 ^ i9) * 28029) ^ 2010771243;
                        i11 = -456265224;
                    }
                    break;
                case -1166101507:
                case -1141182036:
                    if (C1504.f5354) {
                        iM2566 = (C2105.m6981("᩶۟") + i9) * 57;
                        i10 = ((iM2566 ^ i8) * 21889) ^ (-1425198699);
                        i11 = 520660327;
                    } else {
                        iM2566 = C2105.m6981("ܶ֫") ^ i8;
                        i10 = ((iM2566 ^ i9) * (-29431)) ^ (-1100362730);
                        i11 = 807117501;
                    }
                    break;
                case -1089440973:
                case -715398527:
                    i2 = i * i;
                    i3 = s * s;
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("ܿۗ") ^ i9;
                        i10 = ((iM2566 ^ i8) * 28447) ^ (-316369703);
                        i11 = -1434267670;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ᩳᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = ((iM2566 ^ i9) * (-6673)) ^ (-333352384);
                        i11 = -2111186161;
                    }
                    break;
                case -1077785529:
                case -982707086:
                    s = sArr[c];
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("ۘ᩹") ^ i8;
                        i10 = ((iM2566 ^ i9) * 1729) ^ (-206607616);
                        i11 = 1578833519;
                    } else {
                        iM2566 = (C0630.m2566("֡֡") ^ i8) * (-17);
                        i10 = ((iM2566 ^ i9) * (-2483)) ^ 1626087760;
                        i11 = 2073408077;
                    }
                    break;
                case -928444435:
                case 1656961328:
                    i5 = 34305;
                    iM2566 = (C2105.m6981("᩺ܿ") ^ i9) * (-73);
                    i10 = ((iM2566 ^ i8) * 4963) ^ 470472308;
                    i11 = 393194573;
                    break;
                case -625643564:
                case 525078987:
                    C4263.m12819();
                    C2105.m6982();
                    return null;
                case 980543897:
                case 1164786146:
                    i4 = 1570009;
                    if (C4263.f13799 <= 0) {
                        iM2566 = C0630.m2566("ܿۗ") ^ i9;
                        i10 = ((iM2566 ^ i8) * 28447) ^ (-316369703);
                        i11 = -1434267670;
                    } else {
                        iM2566 = C0630.m2566("ۤ᩶") ^ i8;
                        i10 = ((iM2566 ^ i9) * 17571) ^ 399075293;
                        i11 = -1566917412;
                    }
                    break;
                default:
                    return C3537.m10748(sArr2, i6, 23, i5);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39103(ActivityC16608 activityC16608, int i, RunnableC0111 runnableC0111) {
        int i2 = 763137124;
        int i3 = C3683.f11629;
        int i4 = C3537.f11231;
        int iM2566 = (C0630.m2566("ۧ֫") + i3) * (-41);
        int i5 = ((iM2566 ^ i4) * 29177) ^ (-580348027);
        int i6 = 1022906397;
        while (true) {
            i2 = ((((i2 ^ i4) * 6783) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -1847510789:
                case -960347305:
                    if (i != activityC16608.f51009) {
                        iM2566 = (C2105.m6981("ۘ۬") + i3) * (-47);
                        i5 = ((iM2566 ^ i4) * (-3687)) ^ 539820662;
                        i6 = 1717066226;
                    } else {
                        iM2566 = C2105.m6981("ᩳۡ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 9115) ^ 1117071290;
                        i6 = -1585696618;
                    }
                    break;
                case -1624375429:
                case -1102470419:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("ܳۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 5195) ^ (-584380118);
                        i6 = 866413103;
                    } else {
                        iM2566 = C2105.m6981("ܺۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17313) ^ 1453213055;
                        i6 = -1415153401;
                    }
                    break;
                case -1286071942:
                case -353987622:
                    if (C4159.f13567) {
                        iM2566 = (C2105.m6981("᩶᩷") ^ i3) * (-27);
                        i5 = ((iM2566 ^ i4) * 25705) ^ 2130293665;
                        i6 = 1865840685;
                    } else {
                        iM2566 = (C2105.m6981("᩷᩻") + i3) * (-127);
                        i5 = ((iM2566 ^ i4) * 3499) ^ (-303758286);
                        i6 = 276209043;
                    }
                    break;
                case -1194231534:
                case 1596022272:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("᩵ᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-9539)) ^ 1359643413;
                        i6 = 638437953;
                    } else {
                        iM2566 = C0630.m2566("֨֡") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-31255)) ^ 2116748283;
                        i6 = -2002253495;
                    }
                    break;
                case -1184197921:
                case 2099949131:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("ܳۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 5195) ^ (-584380118);
                        i6 = 866413103;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܰۙ")) * 23;
                        i5 = ((iM2566 ^ i3) * 15541) ^ (-1566105342);
                        i6 = -1346663138;
                    }
                    break;
                case -1082903102:
                case 2084228345:
                    C1294.m4372();
                    C1420.m4913();
                    iM2566 = C2105.m6981("᩵ᩳ") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-9539)) ^ 1359643413;
                    i6 = 638437953;
                    break;
                case -961085809:
                case 1494331898:
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("۫֡") + i3) * 69;
                        i5 = ((iM2566 ^ i4) * 15347) ^ 451094675;
                        i6 = 2033430068;
                    } else {
                        iM2566 = C2105.m6981("ܳۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 5195) ^ (-584380118);
                        i6 = 866413103;
                    }
                    break;
                case -830222713:
                case 269793560:
                    if (C4159.f13567) {
                        iM2566 = C2105.m6981("ۖᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18247)) ^ (-1417033115);
                        i6 = -1985117704;
                    } else {
                        iM2566 = C2105.m6981("۟ܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 2089) ^ (-491356745);
                        i6 = 81082000;
                    }
                    break;
                case -794355110:
                case -714283285:
                    AbstractC2021.m6574();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = C2105.m6981("᩵ᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-9539)) ^ 1359643413;
                        i6 = 638437953;
                    } else {
                        iM2566 = (C2105.m6981("᩻ۛ") + i3) * (-117);
                        i5 = ((iM2566 ^ i4) * 16647) ^ 410857475;
                        i6 = 1397273901;
                    }
                    break;
                case -501383070:
                case -72755544:
                    C1916.m6308();
                    if (C3245.f10203 > 0) {
                        iM2566 = C2105.m6981("۟ܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 2089) ^ (-491356745);
                        i6 = 81082000;
                    } else {
                        iM2566 = C2105.m6981("᩵ᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-9539)) ^ 1359643413;
                        i6 = 638437953;
                    }
                    break;
                case -390983434:
                case 2092135715:
                    break;
                case -114878474:
                case 1731761090:
                    if (C1504.m5179()) {
                        iM2566 = C2105.m6981("۟ᩴ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-29289)) ^ 795242056;
                        i6 = 1878016466;
                    } else {
                        iM2566 = C2105.m6981("ܳۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 5195) ^ (-584380118);
                        i6 = 866413103;
                    }
                    break;
                case 434668937:
                case 2016474473:
                    if (C2105.m6982() != 0) {
                        iM2566 = C2105.m6981("ܳۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 5195) ^ (-584380118);
                        i6 = 866413103;
                    } else {
                        iM2566 = (C2105.m6981("᩷֫") + i3) * (-23);
                        i5 = ((iM2566 ^ i4) * 11639) ^ (-1636576982);
                        i6 = 1003488399;
                    }
                    break;
                case 463386326:
                case 1496489585:
                    if (C1420.f5096 <= 0) {
                        iM2566 = C2105.m6981("۟ܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 2089) ^ (-491356745);
                        i6 = 81082000;
                    } else {
                        iM2566 = (C2105.m6981("ۚۜ") ^ i4) * (-75);
                        i5 = ((iM2566 ^ i3) * 8123) ^ (-1928265736);
                        i6 = -1634027088;
                    }
                    break;
                case 923469371:
                case 1892025874:
                    runnableC0111.run();
                    ViewOnClickListenerC1958.m6434(activityC16608.f51013);
                    break;
                case 1012096870:
                case 1957096841:
                    if (C1420.f5096 <= 0) {
                        iM2566 = C2105.m6981("᩵ᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-9539)) ^ 1359643413;
                        i6 = 638437953;
                    } else {
                        iM2566 = (C0630.m2566("ۘ۠") ^ i4) * (-69);
                        i5 = ((iM2566 ^ i3) * (-3735)) ^ (-1959539993);
                        i6 = 533752052;
                    }
                    break;
                case 1865595586:
                case 1930327106:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C2105.m6981("᩷᩻") + i3) * (-127);
                        i5 = ((iM2566 ^ i4) * 3499) ^ (-303758286);
                        i6 = 276209043;
                    } else {
                        iM2566 = C2105.m6981("᩵ᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-9539)) ^ 1359643413;
                        i6 = 638437953;
                    }
                    break;
                default:
                    C3432.m10477();
                    C3245.m9925();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0106 A[PHI: r1 r12
      0x0106: PHI (r1v4 android.view.MenuInflater) = (r1v3 android.view.MenuInflater), (r1v2 android.view.MenuInflater) binds: [B:36:0x0104, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:36:0x0104, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01af A[PHI: r3 r8 r9 r10
      0x01af: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:51:0x01ad, B:47:0x018b, B:28:0x00c6, B:18:0x0084, B:16:0x0080, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:51:0x01ad, B:47:0x018b, B:28:0x00c6, B:18:0x0084, B:16:0x0080, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:51:0x01ad, B:47:0x018b, B:28:0x00c6, B:18:0x0084, B:16:0x0080, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:51:0x01ad, B:47:0x018b, B:28:0x00c6, B:18:0x0084, B:16:0x0080, B:13:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0222 A[PHI: r6 r7 r13 r18
      0x0222: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:63:0x0220, B:55:0x01e2, B:32:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:63:0x0220, B:55:0x01e2, B:32:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:63:0x0220, B:55:0x01e2, B:32:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:63:0x0220, B:55:0x01e2, B:32:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x024d A[PHI: r2 r5
      0x024d: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v7 int) binds: [B:59:0x0201, B:16:0x0080, B:9:0x0055, B:6:0x004c, B:88:0x024d] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r5v5 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:59:0x0201, B:16:0x0080, B:9:0x0055, B:6:0x004c, B:88:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM2566;
        int i;
        int i2;
        int i3 = C4616.f14690;
        int i4 = C1420.f5096;
        int iM2567 = C0630.m2566("ܺ᩻") ^ i4;
        int i5 = ((iM2567 ^ i3) * 29619) ^ (-643759546);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ (-1259117331);
        MenuInflater menuInflater = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1132790334;
        String strM9250 = null;
        int iM6981 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 10479) >> 31));
            switch (i11) {
                case -2028179094:
                case -2005358695:
                    c = 22;
                    if (RunnableC1108.f4040) {
                        iM2566 = (C2105.m6981("᩻ۡ") ^ i3) * (-23);
                        i = ((iM2566 ^ i4) * 21827) ^ 1147854195;
                        i2 = -352971729;
                    } else {
                        iM2566 = C2105.m6981("ۚۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-3805)) ^ (-1966063145);
                        i2 = -676318622;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1788010678:
                case -1618426485:
                    menuInflater = getMenuInflater();
                    sArr2 = f51008;
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C0630.m2566("ܺܶ") + i4) * (-39);
                        i = ((iM2566 ^ i3) * 14383) ^ (-1480314599);
                        i2 = 1122972766;
                    } else {
                        iM2566 = C2105.m6981("ܽ᩻") ^ i3;
                        i = ((iM2566 ^ i4) * (-2467)) ^ 161238625;
                        i2 = 1052122601;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1600901076:
                case 304280814:
                    i8 = s + s3;
                    if (C2272.m7503()) {
                        iM2566 = C0630.m2566("ᩳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 21601) ^ 764707143;
                        i2 = -826461451;
                    } else {
                        iM2566 = (C0630.m2566("ۙۙ") + i4) * (-75);
                        i = ((iM2566 ^ i3) * 21631) ^ (-182518401);
                        i2 = 1652713503;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1298719500:
                case -670467968:
                    strM9250 = C3019.m9250(sArr2, i10, 3, i9);
                    if (C3911.f12484 >= 0) {
                        iM2566 = C0630.m2566("ᩳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 21601) ^ 764707143;
                        i2 = -826461451;
                    } else {
                        iM2566 = C0630.m2566("ۢۖ") ^ i4;
                        i = ((iM2566 ^ i3) * (-14643)) ^ (-2070039414);
                        i2 = -1920857495;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -841264042:
                case 1822296309:
                    i9 = 63200;
                    iM2566 = C2105.m6981("᩶᩷") ^ i4;
                    i = ((iM2566 ^ i3) * 15633) ^ (-226730204);
                    i2 = -599699234;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -834138679:
                case 977201315:
                    iM6981 = C2105.m6981(strM9250) ^ 2127922411;
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("ۚۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-3805)) ^ (-1966063145);
                        i2 = -676318622;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        int iM2568 = C0630.m2566("۠᩺") ^ i4;
                        i5 = ((iM2568 ^ i3) * (-26847)) ^ (-463792992);
                        i6 = iM2568 ^ (-1752282527);
                    }
                    break;
                case -733708689:
                case 1786752065:
                    menuInflater.inflate(iM6981, menu);
                    return true;
                case -442835736:
                case 1356131725:
                    C1047.m3599();
                    if (C3663.m11168() < 0) {
                        iM2566 = C0630.m2566("ᩳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 21601) ^ 764707143;
                        i2 = -826461451;
                    } else {
                        iM2566 = (C0630.m2566("ܺܶ") + i4) * (-39);
                        i = ((iM2566 ^ i3) * 14383) ^ (-1480314599);
                        i2 = 1122972766;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -402270446:
                case 693515206:
                    C1916.m6308();
                    return false;
                case -384145906:
                case 1861556583:
                    C4159.m12565();
                    if (C1504.m5179()) {
                        iM2566 = C0630.m2566("ᩳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 21601) ^ 764707143;
                        i2 = -826461451;
                    } else {
                        iM2566 = C2105.m6981("ۚۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-3805)) ^ (-1966063145);
                        i2 = -676318622;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -337867789:
                case 854798098:
                    i7 = s * s2;
                    s3 = 10938;
                    if (C1420.m4913()) {
                        iM2566 = C0630.m2566("ᩳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 21601) ^ 764707143;
                        i2 = -826461451;
                    } else {
                        iM2566 = (C0630.m2566("᩸۬") + i3) * (-115);
                        i = ((iM2566 ^ i4) * 15601) ^ 2031024882;
                        i2 = -1979330998;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -250923028:
                case 1230414261:
                    C21923.m49329();
                    C5695.m16023();
                    iM2566 = C0630.m2566("ᩳܺ") ^ i3;
                    i = ((iM2566 ^ i4) * 21601) ^ 764707143;
                    i2 = -826461451;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 403519991:
                case 2013202100:
                    i10 = 23;
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i3 - C2105.m6981("ۛᩳ")) * 41;
                        i = ((iM2566 ^ i4) * (-31687)) ^ (-1394501131);
                        i2 = 1200792369;
                    } else {
                        iM2566 = C0630.m2566("᩹ۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-6971)) ^ (-124514573);
                        i2 = -1808795205;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 598480639:
                case 1815605256:
                    i9 = 59091;
                    iM2566 = C2105.m6981("᩶᩷") ^ i4;
                    i = ((iM2566 ^ i3) * 15633) ^ (-226730204);
                    i2 = -599699234;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1104351579:
                case 1521321560:
                    if ((i8 * i8) - i7 < 0) {
                        iM2566 = C2105.m6981("۫᩺") ^ i4;
                        i = ((iM2566 ^ i3) * 9599) ^ 1833546342;
                        i2 = -1911455955;
                    } else {
                        iM2566 = (C0630.m2566("ۗܿ") ^ i3) * (-111);
                        i = ((iM2566 ^ i4) * (-10811)) ^ (-1546866693);
                        i2 = 390368503;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1362834288:
                case 1952629817:
                    C2126.m7040();
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("ۚۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-3805)) ^ (-1966063145);
                        i2 = -676318622;
                    } else {
                        iM2566 = C2105.m6981("ۡۗ") ^ i4;
                        i = ((iM2566 ^ i3) * 14151) ^ 755916331;
                        i2 = -1504650390;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1442566976:
                case 1676788447:
                    sArr = f51008;
                    if (C4075.m12263() <= 0) {
                        iM2566 = (i3 - C2105.m6981("ۛᩳ")) * 41;
                        i = ((iM2566 ^ i4) * (-31687)) ^ (-1394501131);
                        i2 = 1200792369;
                    } else {
                        iM2566 = C0630.m2566("ۤ᩺") ^ i4;
                        i = ((iM2566 ^ i3) * (-4133)) ^ 945273733;
                        i2 = -877491173;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1872066649:
                case 1938198284:
                    s = sArr[c];
                    s2 = 43752;
                    if (C2520.f8000 >= 0) {
                        iM2566 = (i3 - C2105.m6981("ۛᩳ")) * 41;
                        i = ((iM2566 ^ i4) * (-31687)) ^ (-1394501131);
                        i2 = 1200792369;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۢܶ")) * 11;
                        i = ((iM2566 ^ i3) * 18957) ^ 904535073;
                        i2 = 40992499;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C2520.m8026()) {
                        iM2566 = C2105.m6981("ۚۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-3805)) ^ (-1966063145);
                        i2 = -676318622;
                    } else {
                        iM2566 = C0630.m2566("ۙ֡") ^ i3;
                        i = ((iM2566 ^ i4) * (-8501)) ^ 1743978635;
                        i2 = 1162528247;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM2566;
        int i;
        short[] sArr;
        int iM6981;
        int i2;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        int iM2567;
        int i7;
        int i8;
        short[] sArr2;
        final ActivityC16608 activityC16608 = this;
        View.OnClickListener onClickListener = null;
        View viewM12813 = null;
        View viewM3409 = null;
        ViewGroup viewGroup = null;
        int i9 = 0;
        int iM6983 = 0;
        int i10 = 0;
        int i11 = 0;
        short[] sArr3 = null;
        int i12 = 0;
        int i13 = 2038724915;
        int i14 = C2167.f7158;
        int i15 = ViewOnClickListenerC1958.f6529;
        int iM6984 = (C2105.m6981("ܿ۠") + i15) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i16 = ((iM6984 ^ i14) * 17403) ^ 260388299;
        int i17 = iM6984 ^ (-400112470);
        C9762 c9762 = null;
        String strM11162 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int iM2568 = 0;
        int i22 = 0;
        int iM2569 = 0;
        View viewM34010 = null;
        short s = 0;
        AbstractC10446 abstractC10446M4111 = null;
        C9762 c9763 = null;
        short[] sArr7 = null;
        int i23 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * (-29341)) >> 31));
            switch (i13) {
                case -2135498839:
                case 2109124336:
                    C12346 c12346 = (C12346) C4263.m12813(activityC16608, iM6983 ^ i10);
                    activityC16608.f51010 = c12346;
                    c12346.m29957(activityC16608);
                    mo1502();
                    break;
                case -1974033988:
                case -1840394907:
                    c9763 = c9763;
                    sArr7 = sArr7;
                    sArr2 = sArr5;
                    sArr6 = sArr6;
                    i4 = i23;
                    iM2569 = C0630.m2566(AbstractC2021.m6573(sArr2, i4, 3, i18));
                    if (C2520.f8000 >= 0) {
                        iM6982 = (C0630.m2566("۫ܿ") + i14) * 13;
                        sArr5 = sArr2;
                        i5 = ((iM6982 ^ i15) * 14203) ^ (-1396348954);
                        i6 = 2054348523;
                    } else {
                        sArr5 = sArr2;
                        iM6982 = C2105.m6981("ۨ᩷") ^ i15;
                        i5 = ((iM6982 ^ i14) * (-1097)) ^ 1536918612;
                        i6 = 128726659;
                    }
                    i17 = iM6982 ^ i6;
                    i16 = i5;
                    sArr7 = sArr7;
                    c9763 = c9763;
                    short[] sArr8 = sArr5;
                    i23 = i4;
                    sArr6 = sArr6;
                    sArr5 = sArr8;
                    break;
                case -1969586414:
                case 472769899:
                    C2272.m7503();
                    iM2567 = (C2105.m6981("֫ۧ") ^ i14) * 95;
                    i7 = ((iM2567 ^ i15) * (-22421)) ^ 1734518987;
                    i8 = -826273887;
                    i17 = iM2567 ^ i8;
                    i16 = i7;
                    break;
                case -1823334791:
                case -1290143789:
                    viewM12813 = C4263.m12813(activityC16608, C2105.m6981(C0422.m1955(sArr7, i19, i20, i18)) ^ 2119657052);
                    iM2567 = C2105.m6981("ۛ᩹") ^ i15;
                    i7 = ((iM2567 ^ i14) * (-21259)) ^ (-459413253);
                    i8 = -1380688944;
                    i17 = iM2567 ^ i8;
                    i16 = i7;
                    break;
                case -1752524112:
                case -1352829558:
                    i23 = i23;
                    c9763 = c9763;
                    sArr7 = sArr7;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    C4263.m12813(activityC16608, iM2568 ^ i22);
                    sArr = f51008;
                    i12 = 7;
                    if (C0798.f2919) {
                        sArr4 = sArr4;
                        int iM6985 = (C2105.m6981("֫֫") ^ i15) * 55;
                        int i24 = ((iM6985 ^ i14) * (-18071)) ^ (-1889778363);
                        i17 = iM6985 ^ (-346828355);
                        activityC16608 = this;
                        sArr4 = sArr4;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i23 = i23;
                        sArr3 = sArr;
                        i16 = i24;
                        sArr7 = sArr7;
                        c9763 = c9763;
                    } else {
                        int iM6986 = C2105.m6981("ᩴۢ") ^ i14;
                        int i25 = ((iM6986 ^ i15) * 5201) ^ (-386090830);
                        i17 = iM6986 ^ (-1495561753);
                        sArr7 = sArr7;
                        c9763 = c9763;
                        sArr3 = sArr;
                        i16 = i25;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i23 = i23;
                    }
                    break;
                case -1733808790:
                case -1073017572:
                    C21923.m49340(activityC16608.f10584, C18393.m42823());
                    iM2567 = (C2105.m6981("᩹۟") + i15) * (-35);
                    i7 = ((iM2567 ^ i14) * (-13695)) ^ (-2115216633);
                    i8 = 1359775375;
                    i17 = iM2567 ^ i8;
                    i16 = i7;
                    break;
                case -1692432247:
                case -190205154:
                    short[] sArr9 = sArr6;
                    C9762 c9764 = c9763;
                    short[] sArr10 = sArr7;
                    AbstractC10446 abstractC10446 = abstractC10446M4111;
                    abstractC10446.mo26300(true);
                    C9762 c9765 = activityC16608.f10584;
                    short[] sArr11 = f51008;
                    i23 = 10;
                    int iM25610 = C0630.m2566("۬ۗ") ^ i14;
                    c9762 = c9765;
                    i16 = ((iM25610 ^ i15) * (-7341)) ^ (-1737185193);
                    i17 = iM25610 ^ 1392570609;
                    abstractC10446M4111 = abstractC10446;
                    sArr7 = sArr10;
                    c9763 = c9764;
                    sArr5 = sArr11;
                    sArr6 = sArr9;
                    break;
                case -1585836199:
                case -107540199:
                    activityC16608.f51014 = (C2447) viewM12813;
                    sArr6 = f51008;
                    i21 = 16;
                    if (RunnableC3474.f10992 > 0) {
                        iM2567 = C0630.m2566("۟ᩳ") ^ i14;
                        i7 = ((iM2567 ^ i15) * (-7275)) ^ 1544036793;
                        i8 = -1897721086;
                        i17 = iM2567 ^ i8;
                        i16 = i7;
                    } else {
                        i12 = i12;
                        c9763 = c9763;
                        sArr7 = sArr7;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr5 = sArr5;
                        int iM6987 = (C2105.m6981("֨ۤ") + i14) * (-119);
                        i17 = iM6987 ^ (-1093587989);
                        i16 = ((iM6987 ^ i15) * 24413) ^ 1915847251;
                        sArr5 = sArr5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        i23 = i23;
                        sArr3 = sArr3;
                        i12 = i12;
                    }
                    break;
                case -1580683502:
                case 571341354:
                    activityC16608.f51011 = (TextView) C2958.m9024(viewGroup, i9);
                    C2447 c2447 = activityC16608.f51014;
                    C4346 c4346 = new C4346(activityC16608);
                    activityC16608.f51013 = c4346;
                    C1294.m4381(c2447, c4346);
                    if (C18393.m42825()) {
                        iM2567 = (i15 - C2105.m6981("ܿۤ")) * 89;
                        i7 = ((iM2567 ^ i14) * 32573) ^ (-1813951550);
                        i8 = -2145872642;
                    } else {
                        iM2567 = (C2105.m6981("᩹۟") + i15) * (-35);
                        i7 = ((iM2567 ^ i14) * (-13695)) ^ (-2115216633);
                        i8 = 1359775375;
                    }
                    i17 = iM2567 ^ i8;
                    i16 = i7;
                    break;
                case -1568687653:
                case 1184960409:
                    C0050.m940();
                    if (!C3663.f11553) {
                        iM2567 = (C2105.m6981("֫ۧ") ^ i14) * 95;
                        i7 = ((iM2567 ^ i15) * (-22421)) ^ 1734518987;
                        i8 = -826273887;
                        i17 = iM2567 ^ i8;
                        i16 = i7;
                    } else {
                        i12 = i12;
                        c9763 = c9763;
                        sArr7 = sArr7;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr4 = sArr4;
                        iM2566 = (C2105.m6981("ܿۧ") + i15) * (-81);
                        i16 = ((iM2566 ^ i14) * 1347) ^ 249762972;
                        i = 2084711930;
                        i17 = iM2566 ^ i;
                        activityC16608 = this;
                        sArr4 = sArr4;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        i23 = i23;
                        sArr3 = sArr3;
                        i12 = i12;
                    }
                    break;
                case -1370866488:
                case 952032053:
                    viewGroup = (ViewGroup) viewM3409;
                    activityC16608.f51014.m7900((View) viewGroup);
                    i9 = 0;
                    if (C3245.f10203 > 0) {
                        iM2567 = (i14 - C2105.m6981("ܽ᩷")) * (-61);
                        i7 = ((iM2567 ^ i15) * 16835) ^ 1791568513;
                        i8 = 345086670;
                        i17 = iM2567 ^ i8;
                        i16 = i7;
                    } else {
                        i12 = i12;
                        c9763 = c9763;
                        sArr7 = sArr7;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr4 = sArr4;
                        iM2566 = (C2105.m6981("ܿۧ") + i15) * (-81);
                        i16 = ((iM2566 ^ i14) * 1347) ^ 249762972;
                        i = 2084711930;
                        i17 = iM2566 ^ i;
                        activityC16608 = this;
                        sArr4 = sArr4;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        i23 = i23;
                        sArr3 = sArr3;
                        i12 = i12;
                    }
                    break;
                case -1356004353:
                case 1866237426:
                    i12 = i12;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    short s2 = s;
                    if ((s2 * 436) - (i11 + 47524) <= 0) {
                        iM6981 = C2105.m6981("᩷ۢ") ^ i14;
                        i2 = ((iM6981 ^ i15) * (-22253)) ^ (-1982883568);
                        i3 = -709808021;
                    } else {
                        iM6981 = C2105.m6981("ۨܰ") ^ i15;
                        i2 = ((iM6981 ^ i14) * 8587) ^ (-624639376);
                        i3 = 175609777;
                    }
                    i17 = iM6981 ^ i3;
                    activityC16608 = this;
                    s = s2;
                    i16 = i2;
                    sArr4 = sArr4;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    c9763 = c9763;
                    i23 = i23;
                    sArr3 = sArr3;
                    i12 = i12;
                    break;
                case -1349903762:
                case 1469763027:
                    c9763 = c9763;
                    sArr7 = sArr7;
                    short[] sArr12 = sArr5;
                    sArr6 = sArr6;
                    i4 = i23;
                    sArr5 = sArr12;
                    C9762 c9766 = (C9762) viewM34010;
                    activityC16608.f10584 = c9766;
                    C2272.m7515(activityC16608, c9766);
                    abstractC10446M4111 = m4111();
                    if (C7106.f21815 == 0) {
                        iM6982 = (C2105.m6981("ۗ֡") + i14) * (-77);
                        i5 = ((iM6982 ^ i15) * 32031) ^ (-783330290);
                        i6 = 1411371886;
                        i17 = iM6982 ^ i6;
                        i16 = i5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        short[] sArr13 = sArr5;
                        i23 = i4;
                        sArr6 = sArr6;
                        sArr5 = sArr13;
                    } else {
                        i12 = i12;
                        sArr3 = sArr3;
                        i23 = i4;
                        sArr6 = sArr6;
                        int iM6988 = (C2105.m6981("֨ۤ") + i14) * (-119);
                        i17 = iM6988 ^ (-1093587989);
                        i16 = ((iM6988 ^ i15) * 24413) ^ 1915847251;
                        sArr5 = sArr5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        i23 = i23;
                        sArr3 = sArr3;
                        i12 = i12;
                    }
                    break;
                case -1263219433:
                case 1749009575:
                    AbstractC2021.m6574();
                    break;
                case -696234321:
                case 820295941:
                    c9763 = c9763;
                    AbstractC2021.m6559(c9763, onClickListener);
                    sArr7 = f51008;
                    i20 = 3;
                    if (C3019.f9544 >= 0) {
                        sArr7 = sArr7;
                        sArr2 = sArr5;
                        i19 = 13;
                        sArr6 = sArr6;
                        i4 = i23;
                        iM6982 = (C0630.m2566("۫ܿ") + i14) * 13;
                        sArr5 = sArr2;
                        i5 = ((iM6982 ^ i15) * 14203) ^ (-1396348954);
                        i6 = 2054348523;
                        i17 = iM6982 ^ i6;
                        i16 = i5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        short[] sArr14 = sArr5;
                        i23 = i4;
                        sArr6 = sArr6;
                        sArr5 = sArr14;
                    } else {
                        int iM6989 = C2105.m6981("֨֨") ^ i15;
                        i17 = iM6989 ^ (-948891826);
                        c9763 = c9763;
                        i16 = ((iM6989 ^ i14) * (-22293)) ^ 1286782769;
                        i19 = 13;
                    }
                    break;
                case -637220936:
                case 216303366:
                    i18 = 8566;
                    iM2566 = (C0630.m2566("ܺ֫") + i14) * (-33);
                    i16 = ((iM2566 ^ i15) * (-21209)) ^ (-1097215809);
                    i = -319081251;
                    i17 = iM2566 ^ i;
                    activityC16608 = this;
                    sArr4 = sArr4;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    c9763 = c9763;
                    i23 = i23;
                    sArr3 = sArr3;
                    i12 = i12;
                    break;
                case -636083043:
                case 1401905723:
                    C9762 c9767 = c9762;
                    c9767.setNavigationIcon(iM2569 ^ 2126270955);
                    C9762 c9768 = activityC16608.f10584;
                    onClickListener = new View.OnClickListener() { // from class: l.ۖ֫᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i26 = 2071277536;
                            int i27 = C0630.f2410;
                            int i28 = C0483.f2088;
                            int iM69810 = (i28 - C2105.m6981("ۘ᩺")) * (-113);
                            int i29 = ((iM69810 ^ i27) * (-22685)) ^ (-790051716);
                            int i30 = 2028786110;
                            while (true) {
                                i26 = ((((i26 ^ i27) * 20369) >> 31) & i29) ^ (iM69810 ^ i30);
                                switch (i26) {
                                    case -2087876691:
                                    case -457701493:
                                        if (C1420.f5096 <= 0) {
                                            iM69810 = (C2105.m6981("ۗۜ") ^ i27) * (-85);
                                            i29 = ((iM69810 ^ i28) * 14949) ^ 1101918183;
                                            i30 = -746517464;
                                        } else {
                                            iM69810 = (C0630.m2566("ۢۖ") + i27) * (-27);
                                            i29 = ((iM69810 ^ i28) * (-32411)) ^ 48019315;
                                            i30 = 658525045;
                                        }
                                        break;
                                    case -2016573171:
                                    case -803426176:
                                        if (C3245.f10203 <= 0) {
                                            iM69810 = C0630.m2566("֡ܽ") ^ i28;
                                            i29 = ((iM69810 ^ i27) * 15623) ^ 601661668;
                                            i30 = -480164475;
                                        } else {
                                            iM69810 = (C2105.m6981("ܰ᩹") ^ i27) * (-51);
                                            i29 = ((iM69810 ^ i28) * (-5505)) ^ (-350120549);
                                            i30 = -1196801536;
                                        }
                                        break;
                                    case -1954932732:
                                    case 822033609:
                                        C1047.m3599();
                                        if (C0630.f2410 > 0) {
                                            iM69810 = C0630.m2566("֡ܽ") ^ i28;
                                            i29 = ((iM69810 ^ i27) * 15623) ^ 601661668;
                                            i30 = -480164475;
                                        } else {
                                            iM69810 = (C2105.m6981("֡ܿ") ^ i28) * (-123);
                                            i29 = ((iM69810 ^ i27) * 149) ^ (-1545141573);
                                            i30 = 309521874;
                                        }
                                        break;
                                    case -1663478221:
                                    case 1499861965:
                                        C2272.m7505(this.f7287);
                                        break;
                                    case -1498575099:
                                    case 1363063592:
                                        if (C0237.f1507 != 0) {
                                            iM69810 = (C2105.m6981("ۗۜ") ^ i27) * (-85);
                                            i29 = ((iM69810 ^ i28) * 14949) ^ 1101918183;
                                            i30 = -746517464;
                                        } else {
                                            iM69810 = (C0630.m2566("ۜۖ") ^ i28) * (-103);
                                            i29 = ((iM69810 ^ i27) * 24295) ^ (-1152800837);
                                            i30 = -141742335;
                                        }
                                        break;
                                    case -1453807845:
                                    case -608994845:
                                        C1128.m3851();
                                        C3911.m11924();
                                        break;
                                    case -1367168751:
                                    case 1011000890:
                                        if (C2167.f7158 < 0) {
                                            iM69810 = C0630.m2566("ۚܺ") ^ i27;
                                            i29 = ((iM69810 ^ i28) * (-12423)) ^ 17386083;
                                            i30 = -1575958209;
                                        } else {
                                            iM69810 = (C2105.m6981("֡ܿ") ^ i28) * (-123);
                                            i29 = ((iM69810 ^ i27) * 149) ^ (-1545141573);
                                            i30 = 309521874;
                                        }
                                        break;
                                    case -817939632:
                                    case -57303254:
                                        if (C2958.m9034() <= 0) {
                                            iM69810 = C0630.m2566("ۚܺ") ^ i27;
                                            i29 = ((iM69810 ^ i28) * (-12423)) ^ 17386083;
                                            i30 = -1575958209;
                                        } else {
                                            iM69810 = (C2105.m6981("ܳܺ") ^ i28) * (-29);
                                            i29 = ((iM69810 ^ i27) * 20173) ^ 672010223;
                                            i30 = 1060670881;
                                        }
                                        break;
                                    case -623963637:
                                    case 257258772:
                                        if (C2167.m7155()) {
                                            iM69810 = C0630.m2566("֡ܽ") ^ i28;
                                            i29 = ((iM69810 ^ i27) * 15623) ^ 601661668;
                                            i30 = -480164475;
                                        } else {
                                            iM69810 = C0630.m2566("ܳ۫") ^ i28;
                                            i29 = ((iM69810 ^ i27) * (-5899)) ^ 1863942101;
                                            i30 = -1181896317;
                                        }
                                        break;
                                    case -600231094:
                                    case -258402571:
                                        if (C0483.f2088 < 0) {
                                            iM69810 = (C2105.m6981("ۗۜ") ^ i27) * (-85);
                                            i29 = ((iM69810 ^ i28) * 14949) ^ 1101918183;
                                            i30 = -746517464;
                                        } else {
                                            iM69810 = C0630.m2566("ۚܺ") ^ i27;
                                            i29 = ((iM69810 ^ i28) * (-12423)) ^ 17386083;
                                            i30 = -1575958209;
                                        }
                                        break;
                                    case -123666983:
                                    case 353525383:
                                        C2126.m7040();
                                        RunnableC1108.m3790();
                                        iM69810 = (C2105.m6981("֡ܿ") ^ i28) * (-123);
                                        i29 = ((iM69810 ^ i27) * 149) ^ (-1545141573);
                                        i30 = 309521874;
                                        break;
                                    case -113471599:
                                    case 291721590:
                                        if (C1504.f5354) {
                                            iM69810 = (C2105.m6981("֡ܿ") ^ i28) * (-123);
                                            i29 = ((iM69810 ^ i27) * 149) ^ (-1545141573);
                                            i30 = 309521874;
                                        } else {
                                            iM69810 = (C0630.m2566("ۙۗ") ^ i27) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i29 = ((iM69810 ^ i28) * 4945) ^ 1163111334;
                                            i30 = 1669057328;
                                        }
                                        break;
                                    case -83905626:
                                    case 733393171:
                                        if (C0964.f3626 != 0) {
                                            iM69810 = (C2105.m6981("֡ܿ") ^ i28) * (-123);
                                            i29 = ((iM69810 ^ i27) * 149) ^ (-1545141573);
                                            i30 = 309521874;
                                        } else {
                                            iM69810 = C0630.m2566("ۖܽ") ^ i27;
                                            i29 = ((iM69810 ^ i28) * (-19075)) ^ 1813107708;
                                            i30 = -650267700;
                                        }
                                        break;
                                    case 212791884:
                                    case 1722679704:
                                        boolean z = ActivityC16608.f51007;
                                        if (C22628.f73083 <= 0) {
                                            iM69810 = C2105.m6981("ᩴܶ") ^ i28;
                                            i29 = ((iM69810 ^ i27) * 1195) ^ 1429132050;
                                            i30 = 800684980;
                                        } else {
                                            iM69810 = C2105.m6981("ܺܶ") ^ i27;
                                            i29 = ((iM69810 ^ i28) * (-6013)) ^ 1278392853;
                                            i30 = -966173111;
                                        }
                                        break;
                                    case 1216332119:
                                    case 1619856417:
                                        if (RunnableC1108.f4040) {
                                            iM69810 = C0630.m2566("۬ۗ") ^ i28;
                                            i29 = ((iM69810 ^ i27) * (-3851)) ^ 1247176473;
                                            i30 = 99391843;
                                        } else {
                                            iM69810 = C0630.m2566("ۚܺ") ^ i27;
                                            i29 = ((iM69810 ^ i28) * (-12423)) ^ 17386083;
                                            i30 = -1575958209;
                                        }
                                        break;
                                    default:
                                        if (RunnableC0588.f2309 >= 0) {
                                            iM69810 = C2105.m6981("ᩴܶ") ^ i28;
                                            i29 = ((iM69810 ^ i27) * 1195) ^ 1429132050;
                                            i30 = 800684980;
                                        } else {
                                            iM69810 = C2105.m6981("۫ܶ") ^ i28;
                                            i29 = ((iM69810 ^ i27) * (-309)) ^ 341716495;
                                            i30 = -191546693;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    int iM69810 = C2105.m6981("ܺ᩹") ^ i14;
                    c9763 = c9768;
                    i16 = ((iM69810 ^ i15) * 16221) ^ (-2064485284);
                    i17 = iM69810 ^ 265697526;
                    c9762 = c9767;
                    break;
                case -473942874:
                case -119838708:
                    if (C7811.f24123 >= 0) {
                        i12 = i12;
                        c9763 = c9763;
                        sArr7 = sArr7;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr5 = sArr5;
                        int iM69811 = (C2105.m6981("֨ۤ") + i14) * (-119);
                        i17 = iM69811 ^ (-1093587989);
                        i16 = ((iM69811 ^ i15) * 24413) ^ 1915847251;
                        sArr5 = sArr5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        i23 = i23;
                        sArr3 = sArr3;
                        i12 = i12;
                    } else {
                        iM2567 = (C2105.m6981("֫ۧ") ^ i14) * 95;
                        i7 = ((iM2567 ^ i15) * (-22421)) ^ 1734518987;
                        i8 = -826273887;
                        i17 = iM2567 ^ i8;
                        i16 = i7;
                    }
                    break;
                case -203553011:
                case 1544692900:
                    sArr5 = sArr5;
                    i12 = i12;
                    sArr4 = sArr4;
                    iM2568 = C0630.m2566(C2105.m6988(sArr4, 4, 3, i18));
                    i22 = 2100300403;
                    int iM25611 = (C0630.m2566("ۧۧ") + i15) * (-85);
                    i2 = ((iM25611 ^ i14) * (-22255)) ^ (-312986351);
                    i17 = iM25611 ^ (-1598269737);
                    i16 = i2;
                    sArr4 = sArr4;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    c9763 = c9763;
                    i23 = i23;
                    sArr3 = sArr3;
                    i12 = i12;
                    break;
                case -170286541:
                case 761318738:
                    i12 = i12;
                    c9763 = c9763;
                    sArr7 = sArr7;
                    sArr3 = sArr3;
                    i23 = i23;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    s = f51008[0];
                    i11 = s * s;
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C2105.m6981("ܿۧ") + i15) * (-81);
                        i16 = ((iM2566 ^ i14) * 1347) ^ 249762972;
                        i = 2084711930;
                    } else {
                        iM2566 = (C0630.m2566("ۖܶ") + i15) * 11;
                        i16 = ((iM2566 ^ i14) * 8599) ^ (-1737964448);
                        i = -223478449;
                    }
                    i17 = iM2566 ^ i;
                    activityC16608 = this;
                    sArr4 = sArr4;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    c9763 = c9763;
                    i23 = i23;
                    sArr3 = sArr3;
                    i12 = i12;
                    break;
                case -162804448:
                case 1471508560:
                    viewM3409 = C0964.m3409(activityC16608, C2105.m6981(C2272.m7507(sArr6, i21, 3, i18)) ^ 2126310774);
                    iM2567 = C0630.m2566("ܿ֨") ^ i15;
                    i7 = ((iM2567 ^ i14) * 14133) ^ 239880133;
                    i8 = 1822267723;
                    i17 = iM2567 ^ i8;
                    i16 = i7;
                    break;
                case 161802712:
                case 1929559801:
                    if (!C0422.m1963()) {
                        i12 = i12;
                        c9763 = c9763;
                        sArr7 = sArr7;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr4 = sArr4;
                        iM2566 = (C2105.m6981("ܿۧ") + i15) * (-81);
                        i16 = ((iM2566 ^ i14) * 1347) ^ 249762972;
                        i = 2084711930;
                        i17 = iM2566 ^ i;
                        activityC16608 = this;
                        sArr4 = sArr4;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        i23 = i23;
                        sArr3 = sArr3;
                        i12 = i12;
                    } else {
                        sArr = sArr3;
                        i23 = i23;
                        c9763 = c9763;
                        sArr7 = sArr7;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr4 = sArr4;
                        int iM69812 = (C2105.m6981("֫֫") ^ i15) * 55;
                        int i26 = ((iM69812 ^ i14) * (-18071)) ^ (-1889778363);
                        i17 = iM69812 ^ (-346828355);
                        activityC16608 = this;
                        sArr4 = sArr4;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i23 = i23;
                        sArr3 = sArr;
                        i16 = i26;
                        sArr7 = sArr7;
                        c9763 = c9763;
                    }
                    break;
                case 390162324:
                case 2096000281:
                    i12 = i12;
                    c9763 = c9763;
                    sArr7 = sArr7;
                    sArr3 = sArr3;
                    i23 = i23;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    super.onCreate(bundle);
                    m10214();
                    strM11162 = C3663.m11162(f51008, 1, 3, i18);
                    if (C7106.m19120() > 0) {
                        iM2566 = C0630.m2566("֡֡") ^ i15;
                        i16 = ((iM2566 ^ i14) * 17087) ^ (-1957301063);
                        i = 1771668466;
                        i17 = iM2566 ^ i;
                        activityC16608 = this;
                        sArr4 = sArr4;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        i23 = i23;
                        sArr3 = sArr3;
                        i12 = i12;
                    } else {
                        sArr = sArr3;
                        i12 = i12;
                        int iM69813 = (C2105.m6981("֫֫") ^ i15) * 55;
                        int i27 = ((iM69813 ^ i14) * (-18071)) ^ (-1889778363);
                        i17 = iM69813 ^ (-346828355);
                        activityC16608 = this;
                        sArr4 = sArr4;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i23 = i23;
                        sArr3 = sArr;
                        i16 = i27;
                        sArr7 = sArr7;
                        c9763 = c9763;
                    }
                    break;
                case 799272870:
                case 1087698478:
                    iM6983 = C2105.m6981(C0483.m2128(f51008, 19, 3, i18));
                    i10 = 2102697280;
                    if (AbstractC2021.f6743 > 0) {
                        iM2567 = (C0630.m2566("ۡܽ") ^ i14) * (-81);
                        i7 = ((iM2567 ^ i15) * 12553) ^ (-455760032);
                        i8 = -1157215185;
                        i17 = iM2567 ^ i8;
                        i16 = i7;
                    } else {
                        i12 = i12;
                        c9763 = c9763;
                        sArr7 = sArr7;
                        sArr3 = sArr3;
                        i23 = i23;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        sArr4 = sArr4;
                        iM2566 = (C2105.m6981("ܿۧ") + i15) * (-81);
                        i16 = ((iM2566 ^ i14) * 1347) ^ 249762972;
                        i = 2084711930;
                        i17 = iM2566 ^ i;
                        activityC16608 = this;
                        sArr4 = sArr4;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        i23 = i23;
                        sArr3 = sArr3;
                        i12 = i12;
                    }
                    break;
                case 1035637733:
                case 1810582995:
                    i12 = i12;
                    c9763 = c9763;
                    sArr7 = sArr7;
                    sArr3 = sArr3;
                    i23 = i23;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    C0964.m3409(activityC16608, C0630.m2566(strM11162) ^ 2103036086);
                    sArr4 = f51008;
                    if (C5695.f17556 < 0) {
                        int iM25612 = C0630.m2566("ۡܶ") ^ i14;
                        i17 = iM25612 ^ (-2059111177);
                        i16 = ((iM25612 ^ i15) * (-27501)) ^ (-663943483);
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        sArr7 = sArr7;
                        c9763 = c9763;
                        i23 = i23;
                        sArr3 = sArr3;
                        i12 = i12;
                    }
                    sArr6 = sArr6;
                    int iM69814 = (C2105.m6981("֨ۤ") + i14) * (-119);
                    i17 = iM69814 ^ (-1093587989);
                    i16 = ((iM69814 ^ i15) * 24413) ^ 1915847251;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    c9763 = c9763;
                    i23 = i23;
                    sArr3 = sArr3;
                    i12 = i12;
                    break;
                case 1822779698:
                case 2140028719:
                    C9762 c9769 = c9763;
                    short[] sArr15 = sArr7;
                    short[] sArr16 = sArr5;
                    short[] sArr17 = sArr6;
                    short[] sArr18 = sArr3;
                    int i28 = i12;
                    viewM34010 = C0964.m3409(activityC16608, C0630.m2566(RunnableC3474.m10633(sArr18, i28, 3, i18)) ^ 2124106029);
                    int iM69815 = C2105.m6981("ܶ֡") ^ i15;
                    i17 = iM69815 ^ 62491855;
                    i16 = ((iM69815 ^ i14) * 843) ^ 721033795;
                    sArr7 = sArr15;
                    c9763 = c9769;
                    i12 = i28;
                    sArr6 = sArr17;
                    sArr5 = sArr16;
                    i23 = i23;
                    sArr3 = sArr18;
                    break;
                default:
                    i18 = 61347;
                    iM2566 = (C0630.m2566("ܺ֫") + i14) * (-33);
                    i16 = ((iM2566 ^ i15) * (-21209)) ^ (-1097215809);
                    i = -319081251;
                    i17 = iM2566 ^ i;
                    activityC16608 = this;
                    sArr4 = sArr4;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    c9763 = c9763;
                    i23 = i23;
                    sArr3 = sArr3;
                    i12 = i12;
                    break;
            }
            return;
        }
    }

    public ActivityC16608() {
        ArrayList arrayList = null;
        int i = -1484273613;
        int i2 = C4263.f13799;
        int i3 = C1420.f5096;
        int iM6981 = C2105.m6981("ۙܿ") ^ i3;
        int i4 = ((iM6981 ^ i2) * 23183) ^ (-310475614);
        int i5 = 519324479;
        while (true) {
            i = ((((i ^ i2) * (-317)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2056087493:
                case -1572118530:
                    RunnableC0588.m2441();
                    if (C0237.f1507 == 0) {
                        iM6981 = (i2 - C0630.m2566("᩵ܰ")) * 3;
                        i4 = ((iM6981 ^ i3) * 26945) ^ 168947489;
                        i5 = -707024875;
                    } else {
                        iM6981 = C2105.m6981("᩵ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29393) ^ 1033604369;
                        i5 = -1846481088;
                    }
                    break;
                case -1952588530:
                case 187085170:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("ᩳۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22925)) ^ 894374391;
                        i5 = 1357536296;
                    } else {
                        iM6981 = C2105.m6981("۠ۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32339) ^ 1409379286;
                        i5 = -1691656463;
                    }
                    break;
                case -1808974747:
                case 1070275181:
                    this.f51012 = arrayList;
                    return;
                case -1641568156:
                case -1544171587:
                    if (C3663.f11553) {
                        iM6981 = (i2 - C0630.m2566("᩵ܰ")) * 3;
                        i4 = ((iM6981 ^ i3) * 26945) ^ 168947489;
                        i5 = -707024875;
                    } else {
                        iM6981 = C2105.m6981("ۘ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19927) ^ (-1848209688);
                        i5 = -1630531462;
                    }
                    break;
                case -1501948428:
                case 717050928:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C0630.m2566("ۡۤ") + i2) * 109;
                        i4 = ((iM6981 ^ i3) * (-31155)) ^ 273419015;
                        i5 = 1046098963;
                    } else {
                        iM6981 = C0630.m2566("ᩴ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6723)) ^ 1664531310;
                        i5 = 607543990;
                    }
                    break;
                case -1433610292:
                case -1361214550:
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("֡ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23601)) ^ (-1697477830);
                        i5 = -933776388;
                    } else {
                        iM6981 = C2105.m6981("᩵ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29393) ^ 1033604369;
                        i5 = -1846481088;
                    }
                    break;
                case -1351111717:
                case 1271163799:
                    if (C4263.m12819() >= 0) {
                        iM6981 = (i2 - C0630.m2566("᩵ܰ")) * 3;
                        i4 = ((iM6981 ^ i3) * 26945) ^ 168947489;
                        i5 = -707024875;
                    } else {
                        iM6981 = C2105.m6981("ۤ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 2695) ^ (-1511574841);
                        i5 = 759727860;
                    }
                    break;
                case -1162311047:
                case -768012328:
                    C0237.m1481();
                    C2958.m9034();
                    throw new RuntimeException();
                case -100771324:
                case 1975612668:
                    C1047.m3599();
                    if (C21923.f70183 != 0) {
                        iM6981 = C2105.m6981("ᩳۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22925)) ^ 894374391;
                        i5 = 1357536296;
                    } else {
                        iM6981 = C2105.m6981("᩵ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29393) ^ 1033604369;
                        i5 = -1846481088;
                    }
                    break;
                case 233727652:
                case 275318040:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C2105.m6981("ᩳۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22925)) ^ 894374391;
                        i5 = 1357536296;
                    } else {
                        iM6981 = (C0630.m2566("۬ᩳ") ^ i2) * (-29);
                        i4 = ((iM6981 ^ i3) * (-3107)) ^ 983119884;
                        i5 = 1022392876;
                    }
                    break;
                case 340456672:
                case 1221681522:
                    C4117.m12364();
                    C1916.m6308();
                    iM6981 = C2105.m6981("᩵ۡ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 29393) ^ 1033604369;
                    i5 = -1846481088;
                    break;
                case 656387305:
                case 1564361517:
                    arrayList = new ArrayList();
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("ᩳۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22925)) ^ 894374391;
                        i5 = 1357536296;
                    } else {
                        iM6981 = C0630.m2566("ᩴ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4045) ^ (-1967906467);
                        i5 = 423318676;
                    }
                    break;
                case 761545736:
                case 772368445:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("᩵ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29393) ^ 1033604369;
                        i5 = -1846481088;
                    } else {
                        iM6981 = (C2105.m6981("ۤۤ") + i3) * 39;
                        i4 = ((iM6981 ^ i2) * (-5355)) ^ (-688079059);
                        i5 = -134429519;
                    }
                    break;
                case 764147841:
                case 1988157880:
                    if (C0798.f2919) {
                        iM6981 = (C0630.m2566("ۡۤ") + i2) * 109;
                        i4 = ((iM6981 ^ i3) * (-31155)) ^ 273419015;
                        i5 = 1046098963;
                    } else {
                        iM6981 = (C2105.m6981("ۚۜ") + i3) * (-47);
                        i4 = ((iM6981 ^ i2) * (-8681)) ^ (-690989766);
                        i5 = -1303218981;
                    }
                    break;
                case 1580499931:
                case 1689604036:
                    C7106.m19120();
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("ᩴᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3291) ^ 1992841492;
                        i5 = -511522283;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩵ܰ")) * 3;
                        i4 = ((iM6981 ^ i3) * 26945) ^ 168947489;
                        i5 = -707024875;
                    }
                    break;
                default:
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("۠ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22535) ^ 1777127129;
                        i5 = 1769427875;
                    } else {
                        iM6981 = (C0630.m2566("ۡۤ") + i2) * 109;
                        i4 = ((iM6981 ^ i3) * (-31155)) ^ 273419015;
                        i5 = 1046098963;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39104(ActivityC16608 activityC16608, Runnable runnable) {
        int i = 980747695;
        int i2 = C3746.f11829;
        int i3 = C5695.f17556;
        int iM6981 = (C2105.m6981("۬᩵") + i2) * 59;
        int i4 = ((iM6981 ^ i3) * 28423) ^ (-853204055);
        int i5 = 100774090;
        while (true) {
            i = ((((i ^ i3) * (-10599)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2137165719:
                case 1797952287:
                    if (C0422.m1963()) {
                        iM6981 = (i2 - C2105.m6981("ᩳ᩵")) * (-59);
                        i4 = ((iM6981 ^ i3) * 29043) ^ (-1458421379);
                        i5 = -161687344;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    }
                    break;
                case -2001479201:
                case 1683950675:
                    if (C0964.f3626 != 0) {
                        iM6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    } else {
                        iM6981 = C2105.m6981("ܶܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 537) ^ (-760377072);
                        i5 = -1091711805;
                    }
                    break;
                case -1955341851:
                case 1582631856:
                    if (!C1504.m5179()) {
                        iM6981 = C0630.m2566("ۧۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 9555) ^ (-1883425471);
                        i5 = -1887471012;
                    } else {
                        iM6981 = C2105.m6981("ܳ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29341)) ^ 689469295;
                        i5 = -608113936;
                    }
                    break;
                case -1355905754:
                case 938912393:
                    ViewOnClickListenerC1958.m6434(activityC16608.f51013);
                    break;
                case -1303713520:
                case 343195490:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("ܳ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29341)) ^ 689469295;
                        i5 = -608113936;
                    } else {
                        iM6981 = (C2105.m6981("ۨۘ") + i2) * (-37);
                        i4 = ((iM6981 ^ i3) * 18219) ^ 117390764;
                        i5 = -1429515800;
                    }
                    break;
                case -1294558544:
                case -191324983:
                    if (RunnableC3474.f10992 > 0) {
                        iM6981 = C2105.m6981("ܳ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29341)) ^ 689469295;
                        i5 = -608113936;
                    } else {
                        iM6981 = C2105.m6981("ܺ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32505)) ^ (-1382611977);
                        i5 = 1715733454;
                    }
                    break;
                case -1200783350:
                case -374935957:
                    C0422.m1963();
                    break;
                case -1158440161:
                case -930410710:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    } else {
                        iM6981 = (C0630.m2566("᩶ۙ") ^ i3) * 93;
                        i4 = ((iM6981 ^ i2) * (-29437)) ^ (-272388972);
                        i5 = 808141211;
                    }
                    break;
                case -1122417639:
                case 1730210316:
                    C1128.m3851();
                    if (!C2126.f7087) {
                        iM6981 = C0630.m2566("ۧۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 9555) ^ (-1883425471);
                        i5 = -1887471012;
                    } else {
                        iM6981 = C0630.m2566("۠ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25635) ^ (-1744040909);
                        i5 = 61664765;
                    }
                    break;
                case -809404824:
                case 466008255:
                    if (C2105.f7037 != 0) {
                        iM6981 = C2105.m6981("ܳ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29341)) ^ 689469295;
                        i5 = -608113936;
                    } else {
                        iM6981 = C0630.m2566("ۜܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 10663) ^ (-746639390);
                        i5 = -2116468734;
                    }
                    break;
                case -625537282:
                case 64409363:
                    if (C1420.m4913()) {
                        iM6981 = C0630.m2566("۠ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25635) ^ (-1744040909);
                        i5 = 61664765;
                    } else {
                        iM6981 = (C0630.m2566("ܶܺ") + i2) * 21;
                        i4 = ((iM6981 ^ i3) * (-17359)) ^ 1498128788;
                        i5 = 2025523188;
                    }
                    break;
                case -534759944:
                case 2104462662:
                    if (C1005.m3501()) {
                        iM6981 = (C0630.m2566("᩷ۨ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i2) * 5687) ^ 1731814726;
                        i5 = 1753033947;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    }
                    break;
                case -291823042:
                case 955284543:
                    C0422.m1963();
                    iM6981 = C0630.m2566("ۧۙ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 9555) ^ (-1883425471);
                    i5 = -1887471012;
                    break;
                case 102717030:
                case 1406798420:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܺ᩷")) * (-97);
                        i4 = ((iM6981 ^ i2) * 20335) ^ 2052073147;
                        i5 = 1968257913;
                    }
                    break;
                case 392097577:
                case 1124529367:
                    C0798.m3012(runnable);
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    } else {
                        iM6981 = (C0630.m2566("۬ۜ") + i3) * (-11);
                        i4 = ((iM6981 ^ i2) * 24903) ^ (-243400651);
                        i5 = -110185734;
                    }
                    break;
                default:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    } else {
                        iM6981 = (i2 - C2105.m6981("֨᩷")) * 51;
                        i4 = ((iM6981 ^ i3) * (-15227)) ^ 74439735;
                        i5 = 5168164;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        int i = -122913659;
        int i2 = C1294.f4556;
        int i3 = RunnableC0588.f2309;
        int iM6981 = (C2105.m6981("ۡ᩵") + i3) * 35;
        int i4 = ((iM6981 ^ i2) * 6259) ^ 1946444069;
        int i5 = -1699710271;
        while (true) {
            i = ((((i ^ i2) * 26797) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2126518213:
                case 1228689332:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (i3 - C2105.m6981("ۗ֫")) * 5;
                        i4 = ((iM6981 ^ i2) * (-20883)) ^ (-126974488);
                        i5 = -310619254;
                    } else {
                        iM6981 = C2105.m6981("᩺ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1047) ^ (-1888304004);
                        i5 = 2133975009;
                    }
                    break;
                case -1917802776:
                case -598155636:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (i2 - C0630.m2566("᩷᩻")) * (-3);
                        i4 = ((iM6981 ^ i3) * (-16751)) ^ (-2985677);
                        i5 = -993846916;
                    } else {
                        iM6981 = (C2105.m6981("ܰۛ") + i3) * (-57);
                        i4 = ((iM6981 ^ i2) * (-14531)) ^ (-369247942);
                        i5 = -1342557472;
                    }
                    break;
                case -1844566582:
                case 799171468:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۬ۤ")) * 115;
                        i4 = ((iM6981 ^ i2) * 18427) ^ (-1826657368);
                        i5 = -631373695;
                    }
                    break;
                case -1759199160:
                case 1315470763:
                    super.onResume();
                    if (C1504.f5354) {
                        iM6981 = (i2 - C0630.m2566("᩷᩻")) * (-3);
                        i4 = ((iM6981 ^ i3) * (-16751)) ^ (-2985677);
                        i5 = -993846916;
                    } else {
                        iM6981 = C2105.m6981("ۙ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10451)) ^ 514202727;
                        i5 = -2136327322;
                    }
                    break;
                case -1692676941:
                case 839606271:
                    if (C22628.m50615() != 0) {
                        iM6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    } else {
                        iM6981 = (C0630.m2566("֫ܳ") + i2) * (-117);
                        i4 = ((iM6981 ^ i3) * (-5439)) ^ 1935342618;
                        i5 = -1929281351;
                    }
                    break;
                case -1185356384:
                case 908907351:
                    if (!C4159.f13567) {
                        iM6981 = (i3 - C2105.m6981("ۗ֫")) * 5;
                        i4 = ((iM6981 ^ i2) * (-20883)) ^ (-126974488);
                        i5 = -310619254;
                    } else {
                        iM6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    }
                    break;
                case -1175019906:
                case 2139983922:
                    if (C0237.m1481() >= 0) {
                        iM6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۬ᩳ")) * (-61);
                        i4 = ((iM6981 ^ i3) * (-12865)) ^ (-817750457);
                        i5 = 2133011477;
                    }
                    break;
                case -1157690981:
                case 1851174189:
                    if (C7811.m20844() != 0) {
                        iM6981 = (i2 - C0630.m2566("᩷᩻")) * (-3);
                        i4 = ((iM6981 ^ i3) * (-16751)) ^ (-2985677);
                        i5 = -993846916;
                    } else {
                        iM6981 = (C2105.m6981("ۘ֨") + i3) * 115;
                        i4 = ((iM6981 ^ i2) * (-25983)) ^ 87687018;
                        i5 = -1788663181;
                    }
                    break;
                case -868800348:
                case 1386915863:
                    mo1502();
                    iM6981 = C2105.m6981("ۘۢ") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-24309)) ^ 385894086;
                    i5 = 218974703;
                    break;
                case -801484203:
                case -299222460:
                    if (C0050.f910 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۗ֫")) * 5;
                        i4 = ((iM6981 ^ i2) * (-20883)) ^ (-126974488);
                        i5 = -310619254;
                    } else {
                        iM6981 = C2105.m6981("֡᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25523) ^ 1044541221;
                        i5 = 48298987;
                    }
                    break;
                case -716315467:
                case 1315488461:
                    C1916.m6308();
                    iM6981 = C0630.m2566("ܰۙ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 32251) ^ 1351948477;
                    i5 = 2145753707;
                    break;
                case -509850813:
                case 872753785:
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("۟᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-20287)) ^ (-2122266761);
                        i5 = 415561960;
                    } else {
                        iM6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    }
                    break;
                case -443247995:
                case 424336406:
                    if (f51007) {
                        iM6981 = C2105.m6981("᩵ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20071)) ^ 1021098442;
                        i5 = -39770791;
                    } else {
                        iM6981 = C2105.m6981("ۘۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-24309)) ^ 385894086;
                        i5 = 218974703;
                    }
                    break;
                case -434208659:
                case 1836077519:
                    C0964.m3413();
                    break;
                case -325325203:
                case -17447335:
                    C4075.m12263();
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("ܽ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10315)) ^ 1236722958;
                        i5 = -513765828;
                    } else {
                        iM6981 = (C0630.m2566("ܰ֡") + i2) * (-89);
                        i4 = ((iM6981 ^ i3) * 15793) ^ 396501548;
                        i5 = 634047941;
                    }
                    break;
                case -242328012:
                case 197054838:
                    if (C7811.m20844() != 0) {
                        iM6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    } else {
                        iM6981 = (C2105.m6981("۟᩷") + i2) * (-115);
                        i4 = ((iM6981 ^ i3) * (-21179)) ^ (-2134980418);
                        i5 = -464150948;
                    }
                    break;
                case -86943530:
                case 6550017:
                    if (C11340.f33930 < 0) {
                        iM6981 = C2105.m6981("ܽ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10315)) ^ 1236722958;
                        i5 = -513765828;
                    } else {
                        iM6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m39111(String str) {
        ArrayList arrayList = null;
        int i = 0;
        C19099 c19099 = null;
        int i2 = -321968053;
        int i3 = C4263.f13799;
        int i4 = AbstractC2021.f6743;
        int iM6981 = (i4 - C2105.m6981("᩵ۚ")) * 7;
        int i5 = ((iM6981 ^ i3) * (-4017)) ^ 1497594208;
        int i6 = -1965946038;
        while (true) {
            i2 = ((((i2 ^ i3) * (-5991)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2131707467:
                case -779928341:
                    if (!C0798.f2919) {
                        iM6981 = (i4 - C0630.m2566("ۗۜ")) * (-45);
                        i5 = ((iM6981 ^ i3) * (-22581)) ^ 847857550;
                        i6 = -66186478;
                    } else {
                        iM6981 = (C2105.m6981("֡ۧ") + i4) * 51;
                        i5 = ((iM6981 ^ i3) * 24153) ^ 1210117597;
                        i6 = 1418602021;
                    }
                    break;
                case -2121423375:
                case 1103591479:
                    if (C4159.f13567) {
                        iM6981 = (i4 - C0630.m2566("ۛ᩷")) * (-79);
                        i5 = ((iM6981 ^ i3) * (-13939)) ^ 1867251262;
                        i6 = 230162177;
                    } else {
                        iM6981 = (C0630.m2566("ۙᩴ") + i4) * (-99);
                        i5 = ((iM6981 ^ i3) * 1609) ^ 693937472;
                        i6 = -77686861;
                    }
                    break;
                case -2074829654:
                case 1738963978:
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C2105.m6981("ۘ᩻") ^ i3) * 81;
                        i5 = ((iM6981 ^ i4) * 7755) ^ 1800997795;
                        i6 = -1295206733;
                    } else {
                        iM6981 = (C2105.m6981("ۗ᩷") ^ i3) * 109;
                        i5 = ((iM6981 ^ i4) * (-18675)) ^ 498488208;
                        i6 = 955853613;
                    }
                    break;
                case -1877382495:
                case -1021686552:
                    if (C3663.f11553) {
                        iM6981 = (i3 - C0630.m2566("ۧۘ")) * 51;
                        i5 = ((iM6981 ^ i4) * (-153)) ^ (-1414973656);
                        i6 = -728662930;
                    } else {
                        iM6981 = C2105.m6981("᩹ۨ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 16717) ^ (-251871076);
                        i6 = 2068159416;
                    }
                    break;
                case -1812216563:
                case -451391562:
                    c19099 = (C19099) C3537.m10755(arrayList, i);
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C2105.m6981("ۘ᩻") ^ i3) * 81;
                        i5 = ((iM6981 ^ i4) * 7755) ^ 1800997795;
                        i6 = -1295206733;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۤܺ")) * (-39);
                        i5 = ((iM6981 ^ i4) * (-31787)) ^ (-1818772174);
                        i6 = -447148738;
                    }
                    break;
                case -1631193959:
                case -1122726485:
                    i = 0;
                    iM6981 = C2105.m6981("᩶ܽ") ^ i4;
                    i5 = ((iM6981 ^ i3) * 13279) ^ 667731122;
                    i6 = 677513173;
                    break;
                case -1360036413:
                case 597136456:
                    if (!C1005.f3721) {
                        iM6981 = (C2105.m6981("֡ۧ") + i4) * 51;
                        i5 = ((iM6981 ^ i3) * 24153) ^ 1210117597;
                        i6 = 1418602021;
                    } else {
                        iM6981 = (C0630.m2566("ۙᩴ") + i4) * (-99);
                        i5 = ((iM6981 ^ i3) * 1609) ^ 693937472;
                        i6 = -77686861;
                    }
                    break;
                case -1163835077:
                case 982394889:
                    C2520.m8026();
                    C21923.m49329();
                    iM6981 = (C2105.m6981("֡ۧ") + i4) * 51;
                    i5 = ((iM6981 ^ i3) * 24153) ^ 1210117597;
                    i6 = 1418602021;
                    break;
                case -1102266927:
                case -3088471:
                    return -1;
                case -733920200:
                case 1922615454:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C2105.m6981("֡ۧ") + i4) * 51;
                        i5 = ((iM6981 ^ i3) * 24153) ^ 1210117597;
                        i6 = 1418602021;
                    } else {
                        iM6981 = C0630.m2566("ᩳ۟") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-1377)) ^ (-404578384);
                        i6 = -1538885307;
                    }
                    break;
                case -625723237:
                case 1276152150:
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("۠ܶ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-26873)) ^ (-428334227);
                        i6 = 952700857;
                    } else {
                        iM6981 = (C0630.m2566("ۙᩴ") + i4) * (-99);
                        i5 = ((iM6981 ^ i3) * 1609) ^ 693937472;
                        i6 = -77686861;
                    }
                    break;
                case -481406276:
                case 260340827:
                    if (ViewOnClickListenerC1958.m6437(str, C2126.m7033(c19099))) {
                        iM6981 = C2105.m6981("ܰ᩵") ^ i3;
                        i5 = ((iM6981 ^ i4) * 2335) ^ (-621965027);
                        i6 = 1884046562;
                    } else {
                        iM6981 = C2105.m6981("ۜ۠") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-15727)) ^ (-1303355680);
                        i6 = -376766650;
                    }
                    break;
                case -280999178:
                case 1888552351:
                    if (C0964.f3626 != 0) {
                        iM6981 = (i3 - C0630.m2566("ۧۘ")) * 51;
                        i5 = ((iM6981 ^ i4) * (-153)) ^ (-1414973656);
                        i6 = -728662930;
                    } else {
                        iM6981 = (C0630.m2566("ۤ۠") + i4) * 83;
                        i5 = ((iM6981 ^ i3) * 17617) ^ 1749346869;
                        i6 = 2117238695;
                    }
                    break;
                case -36271876:
                case 770453428:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (i4 - C0630.m2566("ۗۜ")) * (-45);
                        i5 = ((iM6981 ^ i3) * (-22581)) ^ 847857550;
                        i6 = -66186478;
                    } else {
                        iM6981 = C2105.m6981("ۨۘ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-27887)) ^ 1066675810;
                        i6 = -618873042;
                    }
                    break;
                case 211155655:
                case 1990610497:
                    if (C4159.m12565() >= 0) {
                        iM6981 = (i4 - C0630.m2566("ۗۜ")) * (-45);
                        i5 = ((iM6981 ^ i3) * (-22581)) ^ 847857550;
                        i6 = -66186478;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۜܽ")) * (-13);
                        i5 = ((iM6981 ^ i4) * (-10069)) ^ (-1137662832);
                        i6 = -364273970;
                    }
                    break;
                case 277912654:
                case 562544088:
                    C0422.m1963();
                    AbstractC2021.m6574();
                    return 0;
                case 562371552:
                case 941970216:
                    C1005.m3501();
                    if (!C3663.f11553) {
                        iM6981 = (C2105.m6981("֡ۧ") + i4) * 51;
                        i5 = ((iM6981 ^ i3) * 24153) ^ 1210117597;
                        i6 = 1418602021;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۧۘ")) * 51;
                        i5 = ((iM6981 ^ i4) * (-153)) ^ (-1414973656);
                        i6 = -728662930;
                    }
                    break;
                case 1003093568:
                case 1141937295:
                    return i;
                case 1630567610:
                case 1937254821:
                    if (C0050.f910 >= 0) {
                        iM6981 = (i4 - C0630.m2566("ۗۜ")) * (-45);
                        i5 = ((iM6981 ^ i3) * (-22581)) ^ 847857550;
                        i6 = -66186478;
                    } else {
                        iM6981 = (C2105.m6981("ۤۢ") + i4) * 59;
                        i5 = ((iM6981 ^ i3) * 30997) ^ 2035617865;
                        i6 = -1203332084;
                    }
                    break;
                case 2068109879:
                case 2127279057:
                    arrayList = this.f51012;
                    if (i < C0382.m1847(arrayList)) {
                        iM6981 = (C0630.m2566("᩶ۡ") + i4) * 19;
                        i5 = ((iM6981 ^ i3) * 22063) ^ 1187788325;
                        i6 = -1946270372;
                    } else {
                        iM6981 = C2105.m6981("۟ۖ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-31279)) ^ 493730884;
                        i6 = -880005802;
                    }
                    break;
                default:
                    i++;
                    iM6981 = C2105.m6981("᩶ܽ") ^ i4;
                    i5 = ((iM6981 ^ i3) * 13279) ^ 667731122;
                    i6 = 677513173;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m39108(final ActivityC16608 activityC16608, final int i, final RunnableC0111 runnableC0111) {
        Runnable runnable = null;
        int i2 = -163386083;
        int i3 = C3019.f9544;
        int i4 = C0050.f910;
        int iM6981 = (i4 - C2105.m6981("֨ۤ")) * (-35);
        int i5 = ((iM6981 ^ i3) * 18637) ^ (-1432623089);
        int i6 = -1196686041;
        while (true) {
            i2 = ((((i2 ^ i3) * (-1051)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -1863679319:
                case -1295563006:
                    activityC16608.f51014.post(runnable);
                    break;
                case -1691966606:
                case -787926634:
                    activityC16608.f51014.stopScroll();
                    if (activityC16608.f51014.isComputingLayout()) {
                        iM6981 = (C0630.m2566("ܳ۫") ^ i4) * (-121);
                        i5 = ((iM6981 ^ i3) * 26993) ^ (-330558002);
                        i6 = 659256007;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܳۘ")) * 81;
                        i5 = ((iM6981 ^ i4) * 23759) ^ (-641127393);
                        i6 = -246450163;
                    }
                    break;
                case -1600351011:
                case 394301401:
                    if (C4159.f13567) {
                        iM6981 = (C2105.m6981("᩹ۛ") ^ i3) * (-35);
                        i5 = ((iM6981 ^ i4) * 17721) ^ 455098340;
                        i6 = -646989253;
                    } else {
                        iM6981 = (C0630.m2566("ᩴ᩶") + i3) * 109;
                        i5 = ((iM6981 ^ i4) * (-30809)) ^ 326959456;
                        i6 = 1183452798;
                    }
                    break;
                case -1386314311:
                case -560159402:
                    runnable.run();
                    break;
                case -1198265284:
                case 1278880409:
                    if (C2167.m7155()) {
                        iM6981 = C0630.m2566("ۘۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-23301)) ^ 1089129408;
                        i6 = -2078724218;
                    } else {
                        iM6981 = C2105.m6981("ۢۤ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 28503) ^ 319084699;
                        i6 = 1547261396;
                    }
                    break;
                case -1072754752:
                case 1736229789:
                    if (C7106.f21815 != 0) {
                        iM6981 = (C0630.m2566("ᩴ᩶") + i3) * 109;
                        i5 = ((iM6981 ^ i4) * (-30809)) ^ 326959456;
                        i6 = 1183452798;
                    } else {
                        iM6981 = C2105.m6981("ۧۖ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 28433) ^ (-1250573164);
                        i6 = -1909765398;
                    }
                    break;
                case -881897451:
                case 128437183:
                    C3746.m11369();
                    if (C3019.f9544 < 0) {
                        iM6981 = C0630.m2566("ᩳ᩻") ^ i4;
                        i5 = ((iM6981 ^ i3) * 7319) ^ (-1961092645);
                        i6 = -437933173;
                    } else {
                        iM6981 = (C0630.m2566("ᩴ᩶") + i3) * 109;
                        i5 = ((iM6981 ^ i4) * (-30809)) ^ 326959456;
                        i6 = 1183452798;
                    }
                    break;
                case -852890156:
                case 2010677948:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C2105.m6981("᩸᩵") ^ i3) * (-83);
                        i5 = ((iM6981 ^ i4) * 3099) ^ (-1861489407);
                        i6 = 752414311;
                    } else {
                        iM6981 = C0630.m2566("ۘܳ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 20249) ^ 260431731;
                        i6 = 779054143;
                    }
                    break;
                case -758470097:
                case 593402300:
                    if (C11340.m28031()) {
                        iM6981 = (i3 - C0630.m2566("᩻ۜ")) * (-21);
                        i5 = ((iM6981 ^ i4) * 17915) ^ (-814271772);
                        i6 = 2085915582;
                    } else {
                        iM6981 = C0630.m2566("ᩳ᩻") ^ i4;
                        i5 = ((iM6981 ^ i3) * 7319) ^ (-1961092645);
                        i6 = -437933173;
                    }
                    break;
                case -656303954:
                case 1952652057:
                    C7811.m20844();
                    iM6981 = C0630.m2566("ۘۛ") ^ i4;
                    i5 = ((iM6981 ^ i3) * (-23301)) ^ 1089129408;
                    i6 = -2078724218;
                    break;
                case -148010363:
                case 1135185530:
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("ۘۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-23301)) ^ 1089129408;
                        i6 = -2078724218;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۠ۢ")) * (-87);
                        i5 = ((iM6981 ^ i4) * 24321) ^ 1819102921;
                        i6 = 2090526756;
                    }
                    break;
                case -27845221:
                case 570389925:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("ۘۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-23301)) ^ 1089129408;
                        i6 = -2078724218;
                    } else {
                        iM6981 = C2105.m6981("ۚۡ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4779) ^ 520429995;
                        i6 = -1089714058;
                    }
                    break;
                case 86700147:
                case 1773807348:
                    C2126.m7040();
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("᩸᩵") ^ i3) * (-83);
                        i5 = ((iM6981 ^ i4) * 3099) ^ (-1861489407);
                        i6 = 752414311;
                    } else {
                        iM6981 = C0630.m2566("ۘۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-23301)) ^ 1089129408;
                        i6 = -2078724218;
                    }
                    break;
                case 423884968:
                case 1976485638:
                    C1128.m3851();
                    if (!C1005.m3501()) {
                        iM6981 = C0630.m2566("ۘۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-23301)) ^ 1089129408;
                        i6 = -2078724218;
                    } else {
                        iM6981 = (C0630.m2566("ᩴ᩶") + i3) * 109;
                        i5 = ((iM6981 ^ i4) * (-30809)) ^ 326959456;
                        i6 = 1183452798;
                    }
                    break;
                case 448932710:
                case 2025646542:
                    C3683.m11222();
                    break;
                case 994595918:
                case 1921944430:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("ᩳ᩻") ^ i4;
                        i5 = ((iM6981 ^ i3) * 7319) ^ (-1961092645);
                        i6 = -437933173;
                    } else {
                        iM6981 = (C0630.m2566("ܺۡ") + i3) * 87;
                        i5 = ((iM6981 ^ i4) * 31753) ^ 1688156559;
                        i6 = -1911655544;
                    }
                    break;
                case 1538138193:
                case 2084824300:
                    runnable = new Runnable(activityC16608) { // from class: l.ۘ֫᩷

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ActivityC16608 f11493;

                        {
                            int i7 = -617036049;
                            int i8 = C1294.f4556;
                            int i9 = C7811.f24123;
                            int iM6982 = C2105.m6981("ۧܶ") ^ i8;
                            int i10 = ((iM6982 ^ i9) * (-19943)) ^ (-1256149438);
                            int i11 = -742263787;
                            while (true) {
                                i7 = ((((i7 ^ i9) * (-7029)) >> 31) & i10) ^ (iM6982 ^ i11);
                                switch (i7) {
                                    case -2132255354:
                                    case 187442749:
                                        return;
                                    case -2019734913:
                                    case 2104890715:
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM6982 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((iM6982 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        } else {
                                            iM6982 = (C2105.m6981("ܳۢ") ^ i8) * (-113);
                                            i10 = ((iM6982 ^ i9) * 10929) ^ 638201794;
                                            i11 = 1168570122;
                                        }
                                        break;
                                    case -1999000616:
                                    case 2093588241:
                                        this.f11493 = activityC16608;
                                        if (C3432.f10845 >= 0) {
                                            iM6982 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((iM6982 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        } else {
                                            iM6982 = C0630.m2566("ܳܳ") ^ i9;
                                            i10 = ((iM6982 ^ i8) * 18507) ^ 106190240;
                                            i11 = -863619460;
                                        }
                                        break;
                                    case -1994539709:
                                    case -308551167:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM6982 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((iM6982 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        } else {
                                            iM6982 = (C0630.m2566("᩷ۙ") + i8) * 41;
                                            i10 = ((iM6982 ^ i9) * 23099) ^ (-1308190759);
                                            i11 = 346563422;
                                        }
                                        break;
                                    case -1970667021:
                                    case -1359608792:
                                        C4159.m12565();
                                        if (C5695.f17556 >= 0) {
                                            iM6982 = C0630.m2566("ۡܽ") ^ i9;
                                            i10 = ((iM6982 ^ i8) * (-23283)) ^ 1333403700;
                                            i11 = 1891754399;
                                        } else {
                                            iM6982 = (C0630.m2566("ᩳ᩶") + i8) * 33;
                                            i10 = ((iM6982 ^ i9) * 16275) ^ 1442743382;
                                            i11 = -1744217063;
                                        }
                                        break;
                                    case -1574048960:
                                    case -1053689692:
                                        C1005.m3501();
                                        if (ServiceConnectionC3453.f10921 < 0) {
                                            iM6982 = (C0630.m2566("ۚۜ") + i8) * (-37);
                                            i10 = ((iM6982 ^ i9) * (-25481)) ^ (-2071184471);
                                            i11 = 85551346;
                                        } else {
                                            iM6982 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((iM6982 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        }
                                        break;
                                    case -1366914291:
                                    case -604637799:
                                        if (C1294.f4556 >= 0) {
                                            iM6982 = C0630.m2566("ۡܽ") ^ i9;
                                            i10 = ((iM6982 ^ i8) * (-23283)) ^ 1333403700;
                                            i11 = 1891754399;
                                        } else {
                                            iM6982 = (C2105.m6981("᩶ܽ") ^ i9) * (-93);
                                            i10 = ((iM6982 ^ i8) * 21881) ^ 446773285;
                                            i11 = 142166901;
                                        }
                                        break;
                                    case -1232825395:
                                    case 1181319596:
                                        if (C2167.f7158 >= 0) {
                                            iM6982 = (C0630.m2566("ᩳ᩶") + i8) * 33;
                                            i10 = ((iM6982 ^ i9) * 16275) ^ 1442743382;
                                            i11 = -1744217063;
                                        } else {
                                            iM6982 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((iM6982 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        }
                                        break;
                                    case -1191416465:
                                    case -594176681:
                                        if (C1773.f6144 <= 0) {
                                            iM6982 = (C0630.m2566("ۚۜ") + i8) * (-37);
                                            i10 = ((iM6982 ^ i9) * (-25481)) ^ (-2071184471);
                                            i11 = 85551346;
                                        } else {
                                            iM6982 = (C2105.m6981("ۗ۬") ^ i9) * 49;
                                            i10 = ((iM6982 ^ i8) * (-32517)) ^ (-2047555266);
                                            i11 = 444917506;
                                        }
                                        break;
                                    case -882833321:
                                    case 1477293615:
                                        C0422.m1963();
                                        ServiceConnectionC3453.m10564();
                                        throw new RuntimeException();
                                    case -118335722:
                                    case 1756592447:
                                        if (C1005.f3721) {
                                            iM6982 = (C0630.m2566("۟ۧ") ^ i9) * 23;
                                            i10 = ((iM6982 ^ i8) * 12525) ^ 954879336;
                                            i11 = 1972337914;
                                        } else {
                                            iM6982 = (C0630.m2566("ۚۜ") + i8) * (-37);
                                            i10 = ((iM6982 ^ i9) * (-25481)) ^ (-2071184471);
                                            i11 = 85551346;
                                        }
                                        break;
                                    case 278350797:
                                    case 343078416:
                                        if (RunnableC3474.m10630()) {
                                            iM6982 = (C2105.m6981("ܳ֫") + i8) * (-77);
                                            i10 = ((iM6982 ^ i9) * (-947)) ^ (-933478659);
                                            i11 = -621527649;
                                        } else {
                                            iM6982 = C0630.m2566("᩻ᩳ") ^ i8;
                                            i10 = ((iM6982 ^ i9) * 3779) ^ 1926608455;
                                            i11 = 629274752;
                                        }
                                        break;
                                    case 474057003:
                                    case 934488692:
                                        if (C0630.f2410 <= 0) {
                                            iM6982 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((iM6982 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        } else {
                                            iM6982 = C0630.m2566("ۗܺ") ^ i8;
                                            i10 = ((iM6982 ^ i9) * 27965) ^ 900688039;
                                            i11 = 1962776817;
                                        }
                                        break;
                                    case 602443624:
                                    case 1098820497:
                                        if (C0050.m940() <= 0) {
                                            iM6982 = (C0630.m2566("ۚۜ") + i8) * (-37);
                                            i10 = ((iM6982 ^ i9) * (-25481)) ^ (-2071184471);
                                            i11 = 85551346;
                                        } else {
                                            iM6982 = (C2105.m6981("ᩴ᩶") + i9) * (-87);
                                            i10 = ((iM6982 ^ i8) * (-20885)) ^ 1510196326;
                                            i11 = 1519965158;
                                        }
                                        break;
                                    case 1360620675:
                                    case 1378172725:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM6982 = (C0630.m2566("ᩳ᩶") + i8) * 33;
                                            i10 = ((iM6982 ^ i9) * 16275) ^ 1442743382;
                                            i11 = -1744217063;
                                        } else {
                                            iM6982 = C2105.m6981("۫֡") ^ i8;
                                            i10 = ((iM6982 ^ i9) * (-27103)) ^ 1743797827;
                                            i11 = -1931418283;
                                        }
                                        break;
                                    default:
                                        C0382.m1848();
                                        C21923.m49329();
                                        iM6982 = C2105.m6981("ܳᩴ") ^ i9;
                                        i10 = ((iM6982 ^ i8) * 8865) ^ (-271435115);
                                        i11 = -369259831;
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i7 = 0;
                            RunnableC0111 runnableC0112 = null;
                            int i8 = 1713160387;
                            int i9 = C0714.f2697;
                            int i10 = C4075.f12947;
                            int iM6982 = (C2105.m6981("ܽ᩺") + i9) * (-125);
                            int i11 = ((iM6982 ^ i10) * 13163) ^ 46228445;
                            int i12 = -1272307193;
                            while (true) {
                                i8 = ((((i8 ^ i10) * (-22741)) >> 31) & i11) ^ (iM6982 ^ i12);
                                switch (i8) {
                                    case -2024710071:
                                    case 1859330047:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM6982 = (i10 - C0630.m2566("۬۠")) * (-71);
                                            i11 = ((iM6982 ^ i9) * (-30571)) ^ (-1159670792);
                                            i12 = 328578795;
                                        } else {
                                            iM6982 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((iM6982 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        }
                                        break;
                                    case -1878342033:
                                    case -161694113:
                                        C0483.m2121();
                                        C3245.m9925();
                                        break;
                                    case -1773173556:
                                    case 1030029259:
                                        if (C3746.f11829 <= 0) {
                                            iM6982 = C0630.m2566("ۛۚ") ^ i10;
                                            i11 = ((iM6982 ^ i9) * 21111) ^ (-1745079264);
                                            i12 = 252357326;
                                        } else {
                                            iM6982 = (C2105.m6981("۟ۡ") ^ i10) * 93;
                                            i11 = ((iM6982 ^ i9) * 15097) ^ (-1085969868);
                                            i12 = -255413603;
                                        }
                                        break;
                                    case -1608617933:
                                    case -1245867864:
                                        C1916.m6308();
                                        iM6982 = C2105.m6981("֨᩹") ^ i9;
                                        i11 = ((iM6982 ^ i10) * 17807) ^ (-1682852580);
                                        i12 = 2014539155;
                                        break;
                                    case -1586503284:
                                    case 2081908771:
                                        if (C2105.f7037 != 0) {
                                            iM6982 = (i10 - C0630.m2566("۬۠")) * (-71);
                                            i11 = ((iM6982 ^ i9) * (-30571)) ^ (-1159670792);
                                            i12 = 328578795;
                                        } else {
                                            iM6982 = (C0630.m2566("۬ܿ") + i9) * 77;
                                            i11 = ((iM6982 ^ i10) * (-11729)) ^ (-1735461727);
                                            i12 = 1668799009;
                                        }
                                        break;
                                    case -1384494831:
                                    case 1806230824:
                                        if (C1128.m3851() <= 0) {
                                            iM6982 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((iM6982 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        } else {
                                            iM6982 = C0630.m2566("᩸ܿ") ^ i10;
                                            i11 = ((iM6982 ^ i9) * (-20899)) ^ 666380231;
                                            i12 = 1177042360;
                                        }
                                        break;
                                    case -1254799194:
                                    case 919593961:
                                        i7 = i;
                                        if (C1420.f5096 <= 0) {
                                            iM6982 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((iM6982 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        } else {
                                            iM6982 = C2105.m6981("۬ۢ") ^ i10;
                                            i11 = ((iM6982 ^ i9) * (-10065)) ^ 262134199;
                                            i12 = -1443397892;
                                        }
                                        break;
                                    case -1236583343:
                                    case 1180417033:
                                        if (C0798.f2919) {
                                            iM6982 = C2105.m6981("֨᩹") ^ i9;
                                            i11 = ((iM6982 ^ i10) * 17807) ^ (-1682852580);
                                            i12 = 2014539155;
                                        } else {
                                            iM6982 = C0630.m2566("ᩳۚ") ^ i9;
                                            i11 = ((iM6982 ^ i10) * 20635) ^ 656630157;
                                            i12 = -1128047203;
                                        }
                                        break;
                                    case -1043176870:
                                    case -840823184:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM6982 = C0630.m2566("ۛۚ") ^ i10;
                                            i11 = ((iM6982 ^ i9) * 21111) ^ (-1745079264);
                                            i12 = 252357326;
                                        } else {
                                            iM6982 = C2105.m6981("ᩴ᩷") ^ i10;
                                            i11 = ((iM6982 ^ i9) * 28287) ^ (-667420651);
                                            i12 = -196135048;
                                        }
                                        break;
                                    case -1003373312:
                                    case 9998919:
                                        C1916.m6308();
                                        if (C3432.f10845 < 0) {
                                            iM6982 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((iM6982 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        } else {
                                            iM6982 = C2105.m6981("֨᩹") ^ i9;
                                            i11 = ((iM6982 ^ i10) * 17807) ^ (-1682852580);
                                            i12 = 2014539155;
                                        }
                                        break;
                                    case -995620461:
                                    case 1149070929:
                                        ActivityC16608.m39103(this.f11493, i7, runnableC0112);
                                        break;
                                    case -931027016:
                                    case 564965970:
                                        if (C0483.f2088 >= 0) {
                                            iM6982 = C2105.m6981("֨᩹") ^ i9;
                                            i11 = ((iM6982 ^ i10) * 17807) ^ (-1682852580);
                                            i12 = 2014539155;
                                        } else {
                                            iM6982 = (i9 - C0630.m2566("ۡۡ")) * (-17);
                                            i11 = ((iM6982 ^ i10) * 24189) ^ 7215288;
                                            i12 = -1314316808;
                                        }
                                        break;
                                    case -831514713:
                                    case 549715162:
                                        if (RunnableC0588.f2309 >= 0) {
                                            iM6982 = (i10 - C0630.m2566("۬۠")) * (-71);
                                            i11 = ((iM6982 ^ i9) * (-30571)) ^ (-1159670792);
                                            i12 = 328578795;
                                        } else {
                                            iM6982 = C0630.m2566("ܽܿ") ^ i9;
                                            i11 = ((iM6982 ^ i10) * (-15325)) ^ 493137485;
                                            i12 = -938196554;
                                        }
                                        break;
                                    case -224012756:
                                    case 2040448399:
                                        if (C3537.m10746() <= 0) {
                                            iM6982 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((iM6982 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        } else {
                                            iM6982 = (C2105.m6981("ۗܳ") ^ i9) * 109;
                                            i11 = ((iM6982 ^ i10) * (-8593)) ^ (-1763433359);
                                            i12 = 1445419351;
                                        }
                                        break;
                                    case 1030672047:
                                    case 2104334490:
                                        if (RunnableC1937.m6387() == 0) {
                                            iM6982 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((iM6982 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        } else {
                                            iM6982 = (i9 - C2105.m6981("ۧ۠")) * (-39);
                                            i11 = ((iM6982 ^ i10) * (-3425)) ^ (-1211069);
                                            i12 = 1384921315;
                                        }
                                        break;
                                    default:
                                        runnableC0112 = runnableC0111;
                                        if (C0483.m2121()) {
                                            iM6982 = C0630.m2566("ۛᩴ") ^ i10;
                                            i11 = ((iM6982 ^ i9) * 11801) ^ (-638694114);
                                            i12 = 1291056818;
                                        } else {
                                            iM6982 = C0630.m2566("ۛۚ") ^ i10;
                                            i11 = ((iM6982 ^ i9) * 21111) ^ (-1745079264);
                                            i12 = 252357326;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (C1504.f5354) {
                        iM6981 = (C2105.m6981("ۢ᩻") + i3) * (-5);
                        i5 = ((iM6981 ^ i4) * 24307) ^ (-1248685534);
                        i6 = -1866674426;
                    } else {
                        iM6981 = C0630.m2566("ۢ۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-2199)) ^ (-1642142915);
                        i6 = 1736663667;
                    }
                    break;
                default:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ᩳ᩻") ^ i4;
                        i5 = ((iM6981 ^ i3) * 7319) ^ (-1961092645);
                        i6 = -437933173;
                    } else {
                        iM6981 = (C2105.m6981("ۧۚ") + i3) * 23;
                        i5 = ((iM6981 ^ i4) * 18117) ^ 1900543195;
                        i6 = 1055651864;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC4585
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1502() {
        long jM4371 = 0;
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -120029167;
        int i5 = C0714.f2697;
        int i6 = RunnableC1937.f6483;
        int iM2566 = C0630.m2566("ۛ᩵") ^ i5;
        int i7 = ((iM2566 ^ i6) * (-24239)) ^ (-558868628);
        int i8 = 247535931;
        while (true) {
            i4 = ((((i4 ^ i6) * 15745) >> 31) & i7) ^ (iM2566 ^ i8);
            switch (i4) {
                case -2138116644:
                case 2131128941:
                    jM4371 = C1294.m4371();
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C2105.m6981("֨᩹") ^ i5) * (-3);
                        i7 = ((iM2566 ^ i6) * (-6945)) ^ 1669213543;
                        i8 = 1375883953;
                    } else {
                        iM2566 = (C2105.m6981("ᩳܿ") + i6) * (-43);
                        i7 = ((iM2566 ^ i5) * (-4419)) ^ (-2026185015);
                        i8 = -270899287;
                    }
                    break;
                case -1969745559:
                case -1846217689:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C2105.m6981("֨᩹") ^ i5) * (-3);
                        i7 = ((iM2566 ^ i6) * (-6945)) ^ 1669213543;
                        i8 = 1375883953;
                    } else {
                        iM2566 = (C0630.m2566("۟۬") + i5) * 69;
                        i7 = ((iM2566 ^ i6) * 14117) ^ 2071296666;
                        i8 = 1793978260;
                    }
                    break;
                case -1922024446:
                case 1652236642:
                    i = this.f51009;
                    i2 = 1;
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C2105.m6981("᩺ۧ") ^ i6) * (-5);
                        i7 = ((iM2566 ^ i5) * (-23373)) ^ (-202566982);
                        i8 = 1515171392;
                    } else {
                        iM2566 = C0630.m2566("᩷᩺") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-31863)) ^ 559338908;
                        i8 = 2080311302;
                    }
                    break;
                case -1788066263:
                case -1126986034:
                    j = this.f51015;
                    if (C1005.m3501()) {
                        iM2566 = C2105.m6981("᩻ۛ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 4387) ^ 229155417;
                        i8 = -1876015566;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۧ") ^ i6) * (-5);
                        i7 = ((iM2566 ^ i5) * (-23373)) ^ (-202566982);
                        i8 = 1515171392;
                    }
                    break;
                case -1785200448:
                case 118674989:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C2105.m6981("ۜۗ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-23921)) ^ (-898990133);
                        i8 = 1649993906;
                    } else {
                        iM2566 = C2105.m6981("᩺᩶") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-27101)) ^ 1992631626;
                        i8 = 1992744526;
                    }
                    break;
                case -1239190887:
                case 802713636:
                    break;
                case -423390284:
                case 1087780160:
                    if (C0483.f2088 < 0) {
                        C0964.m3402(new C14928(this, i3));
                    }
                    iM2566 = C2105.m6981("᩺᩶") ^ i6;
                    i7 = ((iM2566 ^ i5) * (-27101)) ^ 1992631626;
                    i8 = 1992744526;
                    break;
                case -380708592:
                case -172794632:
                    i3 = i + i2;
                    this.f51009 = i3;
                    if (C4117.m12364() != 0) {
                        iM2566 = (C2105.m6981("᩺ۧ") ^ i6) * (-5);
                        i7 = ((iM2566 ^ i5) * (-23373)) ^ (-202566982);
                        i8 = 1515171392;
                    } else {
                        iM2566 = (i6 - C0630.m2566("᩷ۘ")) * (-101);
                        i7 = ((iM2566 ^ i5) * (-7151)) ^ 1383731482;
                        i8 = -1801664857;
                    }
                    break;
                case -348914554:
                case 1736372573:
                    f51007 = z;
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = (C2105.m6981("᩺ۧ") ^ i6) * (-5);
                        i7 = ((iM2566 ^ i5) * (-23373)) ^ (-202566982);
                        i8 = 1515171392;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۗ") ^ i6) * 5;
                        i7 = ((iM2566 ^ i5) * (-21563)) ^ 1200917897;
                        i8 = 1410615498;
                    }
                    break;
                case -205787933:
                case 1205114716:
                    RunnableC0588.m2441();
                    if (C0714.f2697 < 0) {
                        iM2566 = (i5 - C0630.m2566("ᩴ᩻")) * 3;
                        i7 = ((iM2566 ^ i6) * 5255) ^ 703195179;
                        i8 = -1902442757;
                    } else {
                        iM2566 = C2105.m6981("᩺᩶") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-27101)) ^ 1992631626;
                        i8 = 1992744526;
                    }
                    break;
                case 30319320:
                case 144196164:
                    if (jM4371 - j < 300) {
                        iM2566 = (C0630.m2566("ۙᩳ") + i5) * (-55);
                        i7 = ((iM2566 ^ i6) * 7711) ^ (-1675433722);
                        i8 = 1125542379;
                    } else {
                        iM2566 = (C0630.m2566("֫ܿ") ^ i5) * 27;
                        i7 = ((iM2566 ^ i6) * 27181) ^ (-1021328382);
                        i8 = 1268200338;
                    }
                    break;
                case 413704253:
                case 467210004:
                    z = false;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۜۗ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-23921)) ^ (-898990133);
                        i8 = 1649993906;
                    } else {
                        iM2566 = C0630.m2566("֨۫") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-27793)) ^ (-1026513257);
                        i8 = -382640893;
                    }
                    break;
                case 564906314:
                case 611869753:
                    C1047.m3599();
                    C2958.m9034();
                    iM2566 = C2105.m6981("᩺᩶") ^ i6;
                    i7 = ((iM2566 ^ i5) * (-27101)) ^ 1992631626;
                    i8 = 1992744526;
                    break;
                case 680444007:
                case 2094278429:
                    if (C3019.m9255() > 0) {
                        iM2566 = (C2105.m6981("֨᩹") ^ i5) * (-3);
                        i7 = ((iM2566 ^ i6) * (-6945)) ^ 1669213543;
                        i8 = 1375883953;
                    } else {
                        iM2566 = C2105.m6981("ۜۗ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-23921)) ^ (-898990133);
                        i8 = 1649993906;
                    }
                    break;
                case 828423974:
                case 1220652356:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (i5 - C0630.m2566("ᩴ᩻")) * 3;
                        i7 = ((iM2566 ^ i6) * 5255) ^ 703195179;
                        i8 = -1902442757;
                    } else {
                        iM2566 = (C0630.m2566("֡ܿ") + i5) * 73;
                        i7 = ((iM2566 ^ i6) * (-9825)) ^ 954500768;
                        i8 = 28181338;
                    }
                    break;
                case 1240469249:
                case 2118740614:
                    this.f51015 = ViewOnClickListenerC1958.m6432();
                    if (C7811.m20844() != 0) {
                        iM2566 = C2105.m6981("ۜۗ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-23921)) ^ (-898990133);
                        i8 = 1649993906;
                    } else {
                        iM2566 = (C2105.m6981("ܽۘ") + i6) * (-61);
                        i7 = ((iM2566 ^ i5) * 6393) ^ 686328139;
                        i8 = 617880018;
                    }
                    break;
                default:
                    C1005.m3501();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0497 A[PHI: r3 r4 r9 r17 r18 r24 r27
      0x0497: PHI (r3v18 short[]) = (r3v8 short[]), (r3v9 short[]), (r3v10 short[]), (r3v21 short[]) binds: [B:11:0x0079, B:107:0x0495, B:103:0x0471, B:78:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r4v16 int) = (r4v6 int), (r4v7 int), (r4v8 int), (r4v19 int) binds: [B:11:0x0079, B:107:0x0495, B:103:0x0471, B:78:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:11:0x0079, B:107:0x0495, B:103:0x0471, B:78:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r17v4 short[]) = (r17v2 short[]), (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:11:0x0079, B:107:0x0495, B:103:0x0471, B:78:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r18v4 char) = (r18v2 char), (r18v2 char), (r18v3 char), (r18v2 char) binds: [B:11:0x0079, B:107:0x0495, B:103:0x0471, B:78:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r24v21 boolean) = (r24v9 boolean), (r24v12 boolean), (r24v13 boolean), (r24v24 boolean) binds: [B:11:0x0079, B:107:0x0495, B:103:0x0471, B:78:0x0312] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r27v11 java.util.ArrayList) = (r27v1 java.util.ArrayList), (r27v2 java.util.ArrayList), (r27v3 java.util.ArrayList), (r27v13 java.util.ArrayList) binds: [B:11:0x0079, B:107:0x0495, B:103:0x0471, B:78:0x0312] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        int iM2566;
        int i5;
        int iM6983;
        int i6;
        int i7;
        int i8;
        int i9 = C1420.f5096;
        int i10 = RunnableC1937.f6483;
        int iM6984 = (C2105.m6981("ۛ᩶") + i10) * 65;
        int i11 = ((iM6984 ^ i9) * 12559) ^ 277742022;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i12 = iM6984 ^ (-1700696429);
        int iM7041 = 0;
        int i13 = 0;
        Intent intent = null;
        int i14 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i15 = 1753825508;
        int i16 = 0;
        String strM2816 = null;
        String strM5917 = null;
        String strM7507 = null;
        Intent intent2 = null;
        Object obj = null;
        Iterator itM12354 = null;
        ArrayList arrayList = null;
        boolean z = false;
        while (true) {
            i15 = i12 ^ (i11 & (((i15 ^ i9) * 8161) >> 31));
            switch (i15) {
                case -2140938885:
                case -1649446691:
                    strM2816 = C0714.m2816(f51008, 77, 3, i13);
                    if (!C2272.m7503()) {
                        iM6982 = C0630.m2566("᩶ᩳ") ^ i10;
                        i3 = ((iM6982 ^ i9) * 6567) ^ 468984471;
                        i4 = -865336556;
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        iM6981 = C0630.m2566("ܺۘ") ^ i9;
                        i = ((iM6981 ^ i10) * (-6337)) ^ 396821879;
                        i2 = -1668386887;
                        i8 = iM6981 ^ i2;
                        arrayList = arrayList;
                        boolean z2 = z;
                        i12 = i8;
                        i11 = i;
                        z = z2;
                    }
                    break;
                case -2125860650:
                case -1852901593:
                    RunnableC1937.m6387();
                    z = z;
                    arrayList = arrayList;
                    iM6981 = C0630.m2566("ܺۘ") ^ i9;
                    i = ((iM6981 ^ i10) * (-6337)) ^ 396821879;
                    i2 = -1668386887;
                    i8 = iM6981 ^ i2;
                    arrayList = arrayList;
                    boolean z3 = z;
                    i12 = i8;
                    i11 = i;
                    z = z3;
                    break;
                case -2020093130:
                case 2079088140:
                    z = z;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i16 = i16;
                    if (((s * s) + 36469521) - (s * s2) < 0) {
                        iM2566 = (C0630.m2566("۫᩺") ^ i9) * 17;
                        i3 = ((iM2566 ^ i10) * 459) ^ 1361268651;
                        i5 = -352004859;
                    } else {
                        iM2566 = (C0630.m2566("ۡۢ") ^ i9) * 95;
                        i3 = ((iM2566 ^ i10) * 11623) ^ (-646489207);
                        i5 = 1431927565;
                    }
                    int i17 = iM2566 ^ i5;
                    sArr2 = sArr2;
                    i16 = i16;
                    z = z;
                    arrayList = arrayList;
                    i12 = i17;
                    i11 = i3;
                    break;
                case -1850131978:
                case 275209007:
                    z = z;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i16 = i16;
                    sArr = f51008;
                    if (C1420.f5096 <= 0) {
                        iM2566 = (i9 - C2105.m6981("᩹ۨ")) * (-79);
                        i3 = ((iM2566 ^ i10) * (-24155)) ^ 1941763678;
                        i5 = -694502201;
                    } else {
                        iM2566 = (C0630.m2566("ܶܿ") ^ i9) * (-65);
                        i3 = ((iM2566 ^ i10) * 23327) ^ (-634692655);
                        i5 = 886572915;
                    }
                    int i18 = iM2566 ^ i5;
                    sArr2 = sArr2;
                    i16 = i16;
                    z = z;
                    arrayList = arrayList;
                    i12 = i18;
                    i11 = i3;
                    break;
                case -1754938222:
                case -379003677:
                    z = z;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i16 = i16;
                    strM7507 = C2272.m7507(sArr2, i16, 3, i13);
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = (i9 - C2105.m6981("᩹ۨ")) * (-79);
                        i3 = ((iM2566 ^ i10) * (-24155)) ^ 1941763678;
                        i5 = -694502201;
                    } else {
                        iM2566 = C2105.m6981("ۡۧ") ^ i9;
                        i3 = ((iM2566 ^ i10) * 2303) ^ 1079173096;
                        i5 = -2101121603;
                    }
                    int i19 = iM2566 ^ i5;
                    sArr2 = sArr2;
                    i16 = i16;
                    z = z;
                    arrayList = arrayList;
                    i12 = i19;
                    i11 = i3;
                    break;
                case -1680547863:
                case 204132072:
                    sArr3 = f51008;
                    i14 = 59;
                    if (!C2520.m8026()) {
                        iM6982 = (i10 - C2105.m6981("֡֫")) * 19;
                        i3 = ((iM6982 ^ i9) * 4107) ^ (-797985790);
                        i4 = -1217177328;
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        iM6981 = C0630.m2566("ܺۘ") ^ i9;
                        i = ((iM6981 ^ i10) * (-6337)) ^ 396821879;
                        i2 = -1668386887;
                        i8 = iM6981 ^ i2;
                        arrayList = arrayList;
                        boolean z4 = z;
                        i12 = i8;
                        i11 = i;
                        z = z4;
                    }
                    break;
                case -1589005424:
                case -471336789:
                    return z;
                case -1573127895:
                case 358015330:
                    C3746.m11369();
                    if (C0422.f1886 > 0) {
                        iM6982 = (C2105.m6981("᩸ܶ") ^ i10) * (-107);
                        i3 = ((iM6982 ^ i9) * (-5041)) ^ 1950277281;
                        i4 = -1769045757;
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        iM6981 = C0630.m2566("ܺۘ") ^ i9;
                        i = ((iM6981 ^ i10) * (-6337)) ^ 396821879;
                        i2 = -1668386887;
                        i8 = iM6981 ^ i2;
                        arrayList = arrayList;
                        boolean z5 = z;
                        i12 = i8;
                        i11 = i;
                        z = z5;
                    }
                    break;
                case -1452896537:
                case -158424698:
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        int iM6985 = C2105.m6981("ܽᩳ") ^ i9;
                        i12 = iM6985 ^ (-504244117);
                        i11 = ((iM6985 ^ i10) * 29437) ^ (-777542525);
                        intent = null;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        iM6981 = C0630.m2566("ܺۘ") ^ i9;
                        i = ((iM6981 ^ i10) * (-6337)) ^ 396821879;
                        i2 = -1668386887;
                        i8 = iM6981 ^ i2;
                        arrayList = arrayList;
                        boolean z6 = z;
                        i12 = i8;
                        i11 = i;
                        z = z6;
                    }
                    break;
                case -1382191809:
                case 148203426:
                    if (!C2272.f7362) {
                        z = z;
                        arrayList = arrayList;
                        iM6981 = C0630.m2566("ܺۘ") ^ i9;
                        i = ((iM6981 ^ i10) * (-6337)) ^ 396821879;
                        i2 = -1668386887;
                        i8 = iM6981 ^ i2;
                        arrayList = arrayList;
                        boolean z7 = z;
                        i12 = i8;
                        i11 = i;
                        z = z7;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        sArr2 = sArr2;
                        i16 = i16;
                        iM2566 = (i9 - C2105.m6981("᩹ۨ")) * (-79);
                        i3 = ((iM2566 ^ i10) * (-24155)) ^ 1941763678;
                        i5 = -694502201;
                        int i110 = iM2566 ^ i5;
                        sArr2 = sArr2;
                        i16 = i16;
                        z = z;
                        arrayList = arrayList;
                        i12 = i110;
                        i11 = i3;
                    }
                    break;
                case -1347182904:
                case 1923196710:
                    i13 = 33187;
                    iM2566 = (C0630.m2566("֡ܶ") ^ i10) * (-73);
                    i3 = ((iM2566 ^ i9) * (-15015)) ^ (-534642044);
                    i5 = 1703522267;
                    int i111 = iM2566 ^ i5;
                    sArr2 = sArr2;
                    i16 = i16;
                    z = z;
                    arrayList = arrayList;
                    i12 = i111;
                    i11 = i3;
                    break;
                case -1292685012:
                case -1109829772:
                    arrayList = new ArrayList();
                    itM12354 = C4117.m12354(this.f51012);
                    int iM2567 = C0630.m2566("ۤۨ") ^ i9;
                    i = ((iM2567 ^ i10) * 28439) ^ (-2038814299);
                    i8 = iM2567 ^ (-1212778706);
                    boolean z8 = z;
                    i12 = i8;
                    i11 = i;
                    z = z8;
                    break;
                case -1248500524:
                case 255599749:
                    C4075.m12246(this, obj, null);
                    return z;
                case -1056347633:
                case 656984719:
                    ArrayList arrayList2 = arrayList;
                    z = true;
                    if (iM7041 == (C0630.m2566(strM7507) ^ 2125442887)) {
                        iM6983 = C2105.m6981("ۖ֨") ^ i10;
                        i6 = ((iM6983 ^ i9) * 28053) ^ 715329732;
                        i7 = 742019532;
                    } else {
                        iM6983 = C2105.m6981("ۙۙ") ^ i10;
                        i6 = ((iM6983 ^ i9) * 8809) ^ 810838762;
                        i7 = -1798213489;
                    }
                    i12 = iM6983 ^ i7;
                    i11 = i6;
                    arrayList = arrayList2;
                    break;
                case -1047999794:
                case 922394318:
                    z = z;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i16 = i16;
                    s = sArr[c];
                    s2 = 12078;
                    if (AbstractC2021.m6574()) {
                        iM2566 = C2105.m6981("ۤ۟") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-13825)) ^ (-11234394);
                        i5 = -1724488461;
                    } else {
                        iM2566 = (C0630.m2566("᩵᩸") + i10) * 17;
                        i3 = ((iM2566 ^ i9) * (-1695)) ^ (-1470334893);
                        i5 = 936237483;
                    }
                    int i112 = iM2566 ^ i5;
                    sArr2 = sArr2;
                    i16 = i16;
                    z = z;
                    arrayList = arrayList;
                    i12 = i112;
                    i11 = i3;
                    break;
                case -1006689614:
                case 671495639:
                    C1504.m5179();
                    if (C3746.f11829 <= 0) {
                        z = z;
                        arrayList = arrayList;
                        iM6981 = C2105.m6981("ۨۤ") ^ i10;
                        i = ((iM6981 ^ i9) * 24257) ^ (-1860408669);
                        i2 = 1735238224;
                        i8 = iM6981 ^ i2;
                        arrayList = arrayList;
                        boolean z9 = z;
                        i12 = i8;
                        i11 = i;
                        z = z9;
                    } else {
                        int iM6986 = C2105.m6981("ܽᩳ") ^ i9;
                        i12 = iM6986 ^ (-504244117);
                        i11 = ((iM6986 ^ i10) * 29437) ^ (-777542525);
                        intent = null;
                    }
                    break;
                case -1004102790:
                case 817888007:
                    try {
                        ServiceConnectionC3453.m10570(this, intent);
                        iM6982 = C2105.m6981("۬ۤ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-8053)) ^ (-1557252679);
                        i4 = 1912929017;
                        i12 = iM6982 ^ i4;
                    } catch (Throwable th) {
                        int iM2568 = C0630.m2566("᩶֡") ^ i10;
                        i3 = ((iM2568 ^ i9) * (-23951)) ^ (-122250028);
                        i12 = iM2568 ^ 611680789;
                        obj = th;
                    }
                    i11 = i3;
                    break;
                case -668513558:
                case 173246332:
                    return false;
                case -549170445:
                case 1775239716:
                    C5695.m16023();
                    return false;
                case -507012189:
                case 1160037374:
                    if (C13265.m32212(arrayList)) {
                        iM6982 = (C0630.m2566("ܺۤ") ^ i9) * 21;
                        i3 = ((iM6982 ^ i10) * (-9139)) ^ (-1292614905);
                        i4 = 783406477;
                    } else {
                        iM6982 = (C2105.m6981("ᩳ᩸") ^ i9) * (-17);
                        i3 = ((iM6982 ^ i10) * 24935) ^ 432082965;
                        i4 = -75900;
                    }
                    i12 = iM6982 ^ i4;
                    i11 = i3;
                    break;
                case -483569858:
                case 531386931:
                    C1916.m6307(arrayList, C4159.m12577((C19099) C2272.m7513(itM12354)));
                    int iM2569 = C0630.m2566("ۤۨ") ^ i9;
                    i = ((iM2569 ^ i10) * 28439) ^ (-2038814299);
                    i8 = iM2569 ^ (-1212778706);
                    boolean z10 = z;
                    i12 = i8;
                    i11 = i;
                    z = z10;
                    break;
                case -346825509:
                case -117492373:
                    z = z;
                    arrayList = arrayList;
                    if (iM7041 != (C2105.m6981(strM5917) ^ 2102377311)) {
                        sArr2 = sArr2;
                        i16 = i16;
                        iM2566 = (C0630.m2566("᩷ۛ") + i10) * 77;
                        i3 = ((iM2566 ^ i9) * 3477) ^ 1534779452;
                        i5 = -388926358;
                        int i113 = iM2566 ^ i5;
                        sArr2 = sArr2;
                        i16 = i16;
                        z = z;
                        arrayList = arrayList;
                        i12 = i113;
                        i11 = i3;
                    } else {
                        iM6981 = (C2105.m6981("ۚ۟") ^ i9) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM6981 ^ i10) * (-17889)) ^ (-654255346);
                        i2 = 523324841;
                        i8 = iM6981 ^ i2;
                        arrayList = arrayList;
                        boolean z11 = z;
                        i12 = i8;
                        i11 = i;
                        z = z11;
                    }
                    break;
                case -193171394:
                case 1954925229:
                    if (C1773.m5910(itM12354)) {
                        iM6982 = C2105.m6981("ۢܶ") ^ i10;
                        i3 = ((iM6982 ^ i9) * 5991) ^ (-1379884053);
                        i4 = -1907404403;
                    } else {
                        iM6982 = C0630.m2566("ۡۤ") ^ i9;
                        i3 = ((iM6982 ^ i10) * 14353) ^ (-1194663376);
                        i4 = 116311113;
                    }
                    i12 = iM6982 ^ i4;
                    i11 = i3;
                    break;
                case -138826335:
                case 87192709:
                    z = z;
                    arrayList = arrayList;
                    strM5917 = C1773.m5917(f51008, 30, 3, i13);
                    if (C1294.f4556 >= 0) {
                        iM6981 = C2105.m6981("ۨۤ") ^ i10;
                        i = ((iM6981 ^ i9) * 24257) ^ (-1860408669);
                        i2 = 1735238224;
                    } else {
                        iM6981 = (C0630.m2566("᩶᩺") + i9) * (-101);
                        i = ((iM6981 ^ i10) * 20251) ^ 1980435942;
                        i2 = -721774701;
                    }
                    i8 = iM6981 ^ i2;
                    arrayList = arrayList;
                    boolean z12 = z;
                    i12 = i8;
                    i11 = i;
                    z = z12;
                    break;
                case -42046448:
                case 1356066838:
                    z = z;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i16 = i16;
                    c = 26;
                    if (C0382.f1805) {
                        iM2566 = C2105.m6981("֫֨") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-18803)) ^ 1157171207;
                        i5 = 1349230777;
                    } else {
                        iM2566 = (i9 - C2105.m6981("᩹ۨ")) * (-79);
                        i3 = ((iM2566 ^ i10) * (-24155)) ^ 1941763678;
                        i5 = -694502201;
                    }
                    int i114 = iM2566 ^ i5;
                    sArr2 = sArr2;
                    i16 = i16;
                    z = z;
                    arrayList = arrayList;
                    i12 = i114;
                    i11 = i3;
                    break;
                case 56325474:
                case 2096650825:
                    z = z;
                    arrayList = arrayList;
                    iM7041 = C2126.m7041(menuItem);
                    sArr2 = f51008;
                    i16 = 27;
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("ܺۘ") ^ i9;
                        i = ((iM6981 ^ i10) * (-6337)) ^ 396821879;
                        i2 = -1668386887;
                    } else {
                        iM6981 = (C2105.m6981("ۛ᩹") + i9) * 75;
                        i = ((iM6981 ^ i10) * 31287) ^ 714716101;
                        i2 = 1272028244;
                    }
                    i8 = iM6981 ^ i2;
                    arrayList = arrayList;
                    boolean z13 = z;
                    i12 = i8;
                    i11 = i;
                    z = z13;
                    break;
                case 61814642:
                case 1479107779:
                    z = z;
                    arrayList = arrayList;
                    sArr2 = sArr2;
                    i16 = i16;
                    if (C18393.m42825()) {
                        iM2566 = C2105.m6981("᩶֫") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-21263)) ^ (-2113652560);
                        i5 = -317145962;
                    } else {
                        iM2566 = (C0630.m2566("᩷ۛ") + i10) * 77;
                        i3 = ((iM2566 ^ i9) * 3477) ^ 1534779452;
                        i5 = -388926358;
                    }
                    int i115 = iM2566 ^ i5;
                    sArr2 = sArr2;
                    i16 = i16;
                    z = z;
                    arrayList = arrayList;
                    i12 = i115;
                    i11 = i3;
                    break;
                case 728074318:
                case 1689217040:
                    intent2.putExtra(C1711.m5726(sArr3, i14, 18, i13), arrayList);
                    C4075.m12261(this, intent2);
                    return z;
                case 873234131:
                case 2074548022:
                    Uri uri = Uri.parse(C23986.m52812());
                    short[] sArr4 = f51008;
                    if (C1128.f4106 > 0) {
                        z = z;
                        arrayList = arrayList;
                        intent = new Intent(C3245.m9934(sArr4, 33, 26, i13), uri);
                        iM6981 = C0630.m2566("ܿ᩶") ^ i10;
                        i = ((iM6981 ^ i9) * 10321) ^ (-73061372);
                        i2 = 1439022919;
                        i8 = iM6981 ^ i2;
                        arrayList = arrayList;
                        boolean z14 = z;
                        i12 = i8;
                        i11 = i;
                        z = z14;
                    } else {
                        int iM6987 = C2105.m6981("ܽᩳ") ^ i9;
                        i12 = iM6987 ^ (-504244117);
                        i11 = ((iM6987 ^ i10) * 29437) ^ (-777542525);
                        intent = null;
                    }
                    break;
                case 1100737614:
                case 1801991726:
                    i13 = 61346;
                    iM2566 = (C0630.m2566("֡ܶ") ^ i10) * (-73);
                    i3 = ((iM2566 ^ i9) * (-15015)) ^ (-534642044);
                    i5 = 1703522267;
                    int i116 = iM2566 ^ i5;
                    sArr2 = sArr2;
                    i16 = i16;
                    z = z;
                    arrayList = arrayList;
                    i12 = i116;
                    i11 = i3;
                    break;
                case 1569493635:
                case 2091393761:
                    C1711.m5728(C2105.m6981(strM2816) ^ 2121390646);
                    return z;
                default:
                    intent2 = new Intent(this, (Class<?>) ActivityC15196.class);
                    if (C22628.m50615() == 0) {
                        iM6982 = C0630.m2566("᩺ۗ") ^ i9;
                        i3 = ((iM6982 ^ i10) * (-30301)) ^ (-1166868664);
                        i4 = -669171744;
                        i12 = iM6982 ^ i4;
                        i11 = i3;
                    } else {
                        z = z;
                        arrayList = arrayList;
                        iM6981 = C0630.m2566("ܺۘ") ^ i9;
                        i = ((iM6981 ^ i10) * (-6337)) ^ 396821879;
                        i2 = -1668386887;
                        i8 = iM6981 ^ i2;
                        arrayList = arrayList;
                        boolean z15 = z;
                        i12 = i8;
                        i11 = i;
                        z = z15;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0149 A[PHI: r6
      0x0149: PHI (r6v5 l.ᩴ֫᩷) = (r6v4 l.ᩴ֫᩷), (r6v4 l.ᩴ֫᩷), (r6v4 l.ᩴ֫᩷), (r6v6 l.ᩴ֫᩷) binds: [B:51:0x0147, B:43:0x0113, B:39:0x00fa, B:35:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0193  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c3  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m39109(ActivityC16608 activityC16608, Runnable runnable) {
        int iM6981;
        int i;
        int i2 = -951158971;
        int i3 = C3537.f11231;
        int i4 = C3245.f10203;
        int iM6982 = C2105.m6981("ᩴܰ") ^ i4;
        int i5 = ((iM6982 ^ i3) * 24193) ^ (-857243106);
        int i6 = -1547179074;
        while (true) {
            int i7 = iM6982 ^ i6;
            RunnableC18457 runnableC18457 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 10109) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2118285078:
                    case -720238358:
                        if (RunnableC0588.f2309 >= 0) {
                            iM6981 = C2105.m6981("ۗ᩶") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-11211)) ^ 834403176;
                            i = -941772310;
                        } else {
                            iM6981 = C2105.m6981("᩶ۙ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-26725)) ^ 1415430473;
                            i = -1146928807;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1854377429:
                    case 1906719491:
                        runnableC18457.run();
                        break;
                    case -1517142282:
                    case 946734225:
                        if (C3432.f10845 < 0) {
                        }
                        iM6981 = (i3 - C2105.m6981("ۢܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM6981 ^ i4) * 2213) ^ 182057256;
                        i = -1874719182;
                        i7 = iM6981 ^ i;
                        break;
                    case -1377828120:
                    case 108974719:
                        if (C0050.f910 >= 0) {
                            iM6981 = (i3 - C2105.m6981("ۢܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i5 = ((iM6981 ^ i4) * 2213) ^ 182057256;
                            i = -1874719182;
                        } else {
                            iM6981 = C2105.m6981("֫ܳ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-21141)) ^ 849313214;
                            i = 125857065;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1129191845:
                    case -700852341:
                        if (C7106.f21815 != 0) {
                            iM6981 = (C0630.m2566("ܽۘ") ^ i4) * 97;
                            i5 = ((iM6981 ^ i3) * 21197) ^ 1180009410;
                            i = 676297442;
                        } else {
                            iM6981 = (C0630.m2566("᩸ۛ") ^ i4) * (-57);
                            i5 = ((iM6981 ^ i3) * (-22175)) ^ (-1701059774);
                            i = 867242436;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1098520468:
                    case 1628365641:
                        if (C2520.f8000 >= 0) {
                            iM6981 = (C0630.m2566("ܽۘ") ^ i4) * 97;
                            i5 = ((iM6981 ^ i3) * 21197) ^ 1180009410;
                            i = 676297442;
                        } else {
                            iM6981 = C2105.m6981("ᩴ۟") ^ i3;
                            i5 = ((iM6981 ^ i4) * 11999) ^ (-55350930);
                            i = 567152045;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -883261712:
                    case 1569379241:
                        if (activityC16608.f51014.isComputingLayout()) {
                            iM6981 = (i4 - C2105.m6981("ۙۢ")) * (-33);
                            i5 = ((iM6981 ^ i3) * 18549) ^ (-1001234519);
                            i = -36862199;
                        } else {
                            iM6981 = C2105.m6981("֡ۗ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-8881)) ^ 963444708;
                            i = 1407178301;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -772227686:
                    case 306757665:
                        ViewOnClickListenerC1958.m6429();
                        if (C7106.m19120() > 0) {
                            iM6981 = C2105.m6981("ۗ᩶") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-11211)) ^ 834403176;
                            i = -941772310;
                        } else {
                            iM6981 = (i3 - C2105.m6981("ۢܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i5 = ((iM6981 ^ i4) * 2213) ^ 182057256;
                            i = -1874719182;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -588239308:
                    case 1689506960:
                        if (RunnableC3474.f10992 <= 0) {
                            iM6981 = (C0630.m2566("ܽۘ") ^ i4) * 97;
                            i5 = ((iM6981 ^ i3) * 21197) ^ 1180009410;
                            i = 676297442;
                        } else {
                            iM6981 = C2105.m6981("۬۫") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-1699)) ^ (-491877538);
                            i = -674823350;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -573232493:
                    case 723784426:
                        if (C0798.f2919) {
                            iM6981 = C2105.m6981("ۗ᩶") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-11211)) ^ 834403176;
                            i = -941772310;
                        } else {
                            iM6981 = (C0630.m2566("ۚܳ") + i4) * (-119);
                            i5 = ((iM6981 ^ i3) * 10129) ^ 2011072727;
                            i = -1652422887;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -510447750:
                    case 1232061032:
                        C0714.m2805();
                        C1047.m3599();
                        iM6981 = C2105.m6981("ۗ᩶") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-11211)) ^ 834403176;
                        i = -941772310;
                        i7 = iM6981 ^ i;
                        break;
                    case -260818164:
                    case 2044906869:
                        if (RunnableC1937.m6387() == 0) {
                            runnableC18457 = new RunnableC18457(0, activityC16608, runnable);
                            if (C2105.f7037 != 0) {
                                iM6981 = (C0630.m2566("ܽۘ") ^ i4) * 97;
                                i5 = ((iM6981 ^ i3) * 21197) ^ 1180009410;
                                i = 676297442;
                            } else {
                                iM6981 = (C2105.m6981("ۢۡ") ^ i4) * 77;
                                i5 = ((iM6981 ^ i3) * (-22793)) ^ 228853346;
                                i = 1012315208;
                            }
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case 703991190:
                    case 1658485347:
                        activityC16608.f51014.stopScroll();
                        if (C3746.f11829 > 0) {
                            iM6981 = C2105.m6981("ۤܰ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-10441)) ^ 515891323;
                            i = 451128950;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case 1107310182:
                    case 1941593576:
                        activityC16608.f51014.post(runnableC18457);
                        break;
                    case 1111069764:
                    case 2105297202:
                        RunnableC1937.m6387();
                        if (RunnableC1937.m6387() != 0) {
                            iM6981 = (i3 - C2105.m6981("ۢܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i5 = ((iM6981 ^ i4) * 2213) ^ 182057256;
                            i = -1874719182;
                        } else {
                            iM6981 = C0630.m2566("᩻֨") ^ i4;
                            i5 = ((iM6981 ^ i3) * 9835) ^ 648888478;
                            i = 808624836;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 1351121890:
                    case 1780053552:
                        if (C2126.m7040()) {
                            iM6981 = (i3 - C2105.m6981("ۢܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i5 = ((iM6981 ^ i4) * 2213) ^ 182057256;
                            i = -1874719182;
                        } else {
                            iM6981 = (i4 - C0630.m2566("ۚܽ")) * 115;
                            i5 = ((iM6981 ^ i3) * (-27707)) ^ (-2024296528);
                            i = -1577769236;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    default:
                        C3245.m9925();
                        break;
                }
                return;
            }
            iM6982 = C0630.m2566("ۢ᩺") ^ i3;
            i5 = ((iM6982 ^ i4) * (-7715)) ^ 702209444;
            i6 = -1820297258;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39105(ActivityC16608 activityC16608, String str) {
        int iM39111 = 0;
        int i = 1235120497;
        int i2 = C3432.f10845;
        int i3 = C4263.f13799;
        int iM2566 = C0630.m2566("ܶۖ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-8719)) ^ 32648413;
        int i5 = -1437597292;
        while (true) {
            i = ((((i ^ i2) * 171) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1906892335:
                case -649961322:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C2105.m6981("᩵ۨ") + i3) * (-125);
                        i4 = ((iM2566 ^ i2) * (-519)) ^ 1914357164;
                        i5 = 328798210;
                    } else {
                        iM2566 = (C0630.m2566("֨᩻") + i3) * 27;
                        i4 = ((iM2566 ^ i2) * 24973) ^ (-1993133882);
                        i5 = 931025301;
                    }
                    break;
                case -1643327780:
                case 1458859105:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ۡۧ")) * 33;
                        i4 = ((iM2566 ^ i3) * 27757) ^ (-207268072);
                        i5 = 898728694;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۢ֨")) * 31;
                        i4 = ((iM2566 ^ i2) * 2095) ^ (-1725916650);
                        i5 = 1304953481;
                    }
                    break;
                case -1536413978:
                case -1283097532:
                    if (C2520.m8026()) {
                        iM2566 = (C2105.m6981("ۚ۠") ^ i3) * 83;
                        i4 = ((iM2566 ^ i2) * 7909) ^ (-1804226357);
                        i5 = 1496536031;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܶ᩵")) * 89;
                        i4 = ((iM2566 ^ i2) * (-12681)) ^ (-328556462);
                        i5 = 314508555;
                    }
                    break;
                case -1296829972:
                case -1144398409:
                    iM39111 = activityC16608.m39111(str);
                    if (iM39111 != -1) {
                        iM2566 = C0630.m2566("ۙܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 18755) ^ (-438492587);
                        i5 = 1641979008;
                    } else {
                        iM2566 = C2105.m6981("᩺ۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4613) ^ (-1768068985);
                        i5 = -589399673;
                    }
                    break;
                case -682772858:
                case 331730914:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = (i2 - C2105.m6981("ۡۧ")) * 33;
                        i4 = ((iM2566 ^ i3) * 27757) ^ (-207268072);
                        i5 = 898728694;
                    } else {
                        iM2566 = C0630.m2566("᩺֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21813) ^ (-733114215);
                        i5 = -1879348808;
                    }
                    break;
                case -674164117:
                case 449213591:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C2105.m6981("᩵ۨ") + i3) * (-125);
                        i4 = ((iM2566 ^ i2) * (-519)) ^ 1914357164;
                        i5 = 328798210;
                    } else {
                        iM2566 = C0630.m2566("ۤۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 9917) ^ 1927764027;
                        i5 = -732611745;
                    }
                    break;
                case -72510547:
                case 815500613:
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C2105.m6981("ᩳۧ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * (-8431)) ^ (-1336190399);
                        i5 = -91331363;
                    } else {
                        iM2566 = (C2105.m6981("ۘ֫") ^ i2) * 123;
                        i4 = ((iM2566 ^ i3) * 26397) ^ 2055837514;
                        i5 = -644313585;
                    }
                    break;
                case 552288471:
                case 554459210:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (i2 - C2105.m6981("ۡۧ")) * 33;
                        i4 = ((iM2566 ^ i3) * 27757) ^ (-207268072);
                        i5 = 898728694;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۠ۤ")) * (-61);
                        i4 = ((iM2566 ^ i3) * (-11719)) ^ 197047616;
                        i5 = -912295026;
                    }
                    break;
                case 652609721:
                case 942972148:
                    C0237.m1481();
                    C2958.m9034();
                    iM2566 = (C2105.m6981("ۚ۠") ^ i3) * 83;
                    i4 = ((iM2566 ^ i2) * 7909) ^ (-1804226357);
                    i5 = 1496536031;
                    break;
                case 685923278:
                case 2129993523:
                    C2126.m7040();
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C2105.m6981("ۚ۠") ^ i3) * 83;
                        i4 = ((iM2566 ^ i2) * 7909) ^ (-1804226357);
                        i5 = 1496536031;
                    } else {
                        iM2566 = (C0630.m2566("ۚ᩹") ^ i3) * 115;
                        i4 = ((iM2566 ^ i2) * 327) ^ 495568564;
                        i5 = -437381068;
                    }
                    break;
                case 755112989:
                case 988547297:
                    if (C21923.f70183 != 0) {
                        iM2566 = (i2 - C2105.m6981("ۡۧ")) * 33;
                        i4 = ((iM2566 ^ i3) * 27757) ^ (-207268072);
                        i5 = 898728694;
                    } else {
                        iM2566 = C2105.m6981("ۜᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 9751) ^ (-1344169479);
                        i5 = 80169850;
                    }
                    break;
                case 787617232:
                case 1774786821:
                    break;
                case 791188448:
                case 1631697920:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C2105.m6981("ۚ۠") ^ i3) * 83;
                        i4 = ((iM2566 ^ i2) * 7909) ^ (-1804226357);
                        i5 = 1496536031;
                    } else {
                        iM2566 = C2105.m6981("ܳ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-15435)) ^ 1922067213;
                        i5 = 162618388;
                    }
                    break;
                case 1038979570:
                case 1394504537:
                    if (C3663.f11553) {
                        iM2566 = (C2105.m6981("᩵ۨ") + i3) * (-125);
                        i4 = ((iM2566 ^ i2) * (-519)) ^ 1914357164;
                        i5 = 328798210;
                    } else {
                        iM2566 = (C2105.m6981("᩵ܿ") + i2) * (-101);
                        i4 = ((iM2566 ^ i3) * (-17431)) ^ 1063586652;
                        i5 = 702396032;
                    }
                    break;
                case 1040504937:
                case 1434611246:
                    activityC16608.f51012.remove(iM39111);
                    iM2566 = C2105.m6981("᩺ۤ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 4613) ^ (-1768068985);
                    i5 = -589399673;
                    break;
                case 1094180670:
                case 1615055809:
                    if (C3537.f11231 < 0) {
                        iM2566 = (i2 - C2105.m6981("ۡۧ")) * 33;
                        i4 = ((iM2566 ^ i3) * 27757) ^ (-207268072);
                        i5 = 898728694;
                    } else {
                        iM2566 = (C2105.m6981("ۚ۠") ^ i3) * 83;
                        i4 = ((iM2566 ^ i2) * 7909) ^ (-1804226357);
                        i5 = 1496536031;
                    }
                    break;
                case 1571662222:
                case 1645403572:
                    C0483.m2121();
                    if (C1773.f6144 > 0) {
                        iM2566 = (C2105.m6981("ᩳۧ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * (-8431)) ^ (-1336190399);
                        i5 = -91331363;
                    } else {
                        iM2566 = (C2105.m6981("ۚ۠") ^ i3) * 83;
                        i4 = ((iM2566 ^ i2) * 7909) ^ (-1804226357);
                        i5 = 1496536031;
                    }
                    break;
                default:
                    C2272.m7503();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39106(ActivityC16608 activityC16608, String str, int i) {
        int iM39111 = 0;
        int i2 = 1106032992;
        int i3 = C7811.f24123;
        int i4 = C3537.f11231;
        int iM6981 = C2105.m6981("ܰۡ") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-5689)) ^ (-1351575818);
        int i6 = -1748726826;
        while (true) {
            i2 = ((((i2 ^ i3) * (-19331)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -1667492186:
                case -1422227447:
                    if (AbstractC2021.f6743 > 0) {
                        iM6981 = C0630.m2566("ܺ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * 29427) ^ 1205814381;
                        i6 = 232353605;
                    } else {
                        iM6981 = C2105.m6981("ܶ᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22217)) ^ (-955919262);
                        i6 = 2110051356;
                    }
                    break;
                case -1615550698:
                case 1230757120:
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("ۛᩳ") + i3) * (-119);
                        i5 = ((iM6981 ^ i4) * 23563) ^ (-1807503267);
                        i6 = 2071871391;
                    } else {
                        iM6981 = C2105.m6981("ܺۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-2073)) ^ (-1759474838);
                        i6 = -1527400946;
                    }
                    break;
                case -1563101341:
                case -13938315:
                    iM39111 = activityC16608.m39111(str);
                    if (iM39111 != -1) {
                        iM6981 = C2105.m6981("ۤ᩷") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-19725)) ^ (-1175220911);
                        i6 = 540165873;
                    } else {
                        iM6981 = C0630.m2566("᩻ܶ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-18467)) ^ 1459821259;
                        i6 = -468345061;
                    }
                    break;
                case -1541881803:
                case -1401085355:
                    C0382.m1848();
                    break;
                case -1395583233:
                case 1182622253:
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("᩹᩷") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-20031)) ^ (-1352029700);
                        i6 = 762289407;
                    } else {
                        iM6981 = C0630.m2566("ۢۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-7417)) ^ 1654286329;
                        i6 = -424994313;
                    }
                    break;
                case -1229200038:
                case 474953147:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (i3 - C0630.m2566("᩹ۡ")) * 55;
                        i5 = ((iM6981 ^ i4) * (-10973)) ^ 1324789554;
                        i6 = 2061304297;
                    } else {
                        iM6981 = C2105.m6981("۟۠") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-30311)) ^ (-836813542);
                        i6 = 1322995667;
                    }
                    break;
                case -1202411121:
                case 1508121645:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (i3 - C0630.m2566("᩹ۡ")) * 55;
                        i5 = ((iM6981 ^ i4) * (-10973)) ^ 1324789554;
                        i6 = 2061304297;
                    } else {
                        iM6981 = (C0630.m2566("᩷᩺") + i3) * 37;
                        i5 = ((iM6981 ^ i4) * 15567) ^ 743133719;
                        i6 = 608276856;
                    }
                    break;
                case -1036570254:
                case 1441162823:
                    break;
                case -847251688:
                case 352687529:
                    if (C2272.f7362) {
                        iM6981 = (C0630.m2566("ۛᩳ") + i3) * (-119);
                        i5 = ((iM6981 ^ i4) * 23563) ^ (-1807503267);
                        i6 = 2071871391;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۬ܶ")) * (-73);
                        i5 = ((iM6981 ^ i4) * 29001) ^ (-482614607);
                        i6 = -1366983533;
                    }
                    break;
                case -735267070:
                case 1415341061:
                    if (C1916.f6442) {
                        iM6981 = (C0630.m2566("ۤ֡") + i4) * 63;
                        i5 = ((iM6981 ^ i3) * 18165) ^ (-1564416137);
                        i6 = -2131701886;
                    } else {
                        iM6981 = C0630.m2566("ܺ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * 29427) ^ 1205814381;
                        i6 = 232353605;
                    }
                    break;
                case -597653855:
                case 1625962101:
                    C21923.m49329();
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("ۛᩳ") + i3) * (-119);
                        i5 = ((iM6981 ^ i4) * 23563) ^ (-1807503267);
                        i6 = 2071871391;
                    } else {
                        iM6981 = C2105.m6981("ܶ᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22217)) ^ (-955919262);
                        i6 = 2110051356;
                    }
                    break;
                case -365014894:
                case 1604044222:
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("ܶ᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22217)) ^ (-955919262);
                        i6 = 2110051356;
                    } else {
                        iM6981 = (C2105.m6981("ܺ۟") + i4) * 115;
                        i5 = ((iM6981 ^ i3) * (-30997)) ^ 1655352712;
                        i6 = 2144592669;
                    }
                    break;
                case -334265912:
                case 758930848:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("ܶ᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22217)) ^ (-955919262);
                        i6 = 2110051356;
                    } else {
                        iM6981 = C0630.m2566("ۨܳ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 28249) ^ 1617883985;
                        i6 = 93677059;
                    }
                    break;
                case -242500952:
                case 1583490179:
                    ((C19099) C3019.m9263(activityC16608.f51012, iM39111)).m44014(i);
                    iM6981 = C0630.m2566("᩻ܶ") ^ i3;
                    i5 = ((iM6981 ^ i4) * (-18467)) ^ 1459821259;
                    i6 = -468345061;
                    break;
                case 519163306:
                case 869992744:
                    C1420.m4913();
                    C7811.m20844();
                    iM6981 = C2105.m6981("ܶ᩹") ^ i4;
                    i5 = ((iM6981 ^ i3) * (-22217)) ^ (-955919262);
                    i6 = 2110051356;
                    break;
                case 1087740384:
                case 1799566075:
                    if (!C1504.f5354) {
                        iM6981 = (C0630.m2566("ۛᩳ") + i3) * (-119);
                        i5 = ((iM6981 ^ i4) * 23563) ^ (-1807503267);
                        i6 = 2071871391;
                    } else {
                        iM6981 = C0630.m2566("᩹᩷") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-20031)) ^ (-1352029700);
                        i6 = 762289407;
                    }
                    break;
                case 1465581704:
                case 1868166146:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("ܶ᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22217)) ^ (-955919262);
                        i6 = 2110051356;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۡܰ")) * (-117);
                        i5 = ((iM6981 ^ i3) * (-25581)) ^ 1953474120;
                        i6 = 2134260932;
                    }
                    break;
                default:
                    if (C3683.f11629 >= 0) {
                        iM6981 = C2105.m6981("ܶ᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22217)) ^ (-955919262);
                        i6 = 2110051356;
                    } else {
                        iM6981 = (C2105.m6981("ᩳܳ") ^ i4) * 75;
                        i5 = ((iM6981 ^ i3) * 29005) ^ 1201645273;
                        i6 = -1682936676;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m39110(ActivityC16608 activityC16608) {
        int iM2566;
        int i;
        int i2 = -1855321267;
        int i3 = C1420.f5096;
        int i4 = C3432.f10845;
        int iM2567 = C0630.m2566("֫֨") ^ i3;
        int i5 = ((iM2567 ^ i4) * Scalar448.TARGET_LENGTH) ^ (-2144258659);
        int i6 = 2138684809;
        while (true) {
            int i7 = iM2567 ^ i6;
            RunnableC6772 runnableC6772 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-6433)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2100190620:
                    case -896683681:
                        C3683.m11222();
                        if (C11340.f33930 >= 0) {
                            iM2567 = (C2105.m6981("ۖ᩺") + i3) * (-115);
                            i5 = ((iM2567 ^ i4) * (-3397)) ^ (-286173888);
                            i6 = 2128648419;
                        } else {
                            iM2567 = C2105.m6981("ᩳ۫") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-20747)) ^ 730625182;
                            i6 = -844882417;
                        }
                        break;
                    case -1897572840:
                    case -1507668895:
                        runnableC6772.run();
                        break;
                    case -1544351528:
                    case -1281574740:
                        C3432.m10477();
                        iM2567 = (C0630.m2566("ܶۢ") + i4) * 93;
                        i5 = ((iM2567 ^ i3) * 31181) ^ 1053958281;
                        i6 = -1903944280;
                        break;
                    case -1300040446:
                    case 1018417984:
                        if (C1420.f5096 <= 0) {
                            iM2567 = C2105.m6981("ᩳ۫") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-20747)) ^ 730625182;
                            i6 = -844882417;
                        } else {
                            if (C3683.f11629 < 0) {
                                if (C3683.f11629 < 0) {
                                    if (C4263.f13799 > 0) {
                                        if (C2958.f9394 >= 0 || C2105.m6982() != 0) {
                                            iM2567 = C2105.m6981("᩹ۧ") ^ i3;
                                            i5 = ((iM2567 ^ i4) * 3981) ^ (-428367618);
                                            i6 = -262842186;
                                        } else if (C1420.f5096 > 0) {
                                            int i8 = 3;
                                            if (C0422.f1886 > 0) {
                                                runnableC6772 = new RunnableC6772(i8, activityC16608);
                                                if (!C1711.f5919) {
                                                    iM2566 = C0630.m2566("۫֨") ^ i3;
                                                    i5 = ((iM2566 ^ i4) * (-2655)) ^ 865202972;
                                                    i = 677443504;
                                                    i7 = iM2566 ^ i;
                                                    break;
                                                }
                                            }
                                        } else {
                                            iM2567 = (C0630.m2566("ܶۢ") + i4) * 93;
                                            i5 = ((iM2567 ^ i3) * 31181) ^ 1053958281;
                                            i6 = -1903944280;
                                        }
                                    }
                                }
                                iM2567 = (C2105.m6981("ۖ᩺") + i3) * (-115);
                                i5 = ((iM2567 ^ i4) * (-3397)) ^ (-286173888);
                                i6 = 2128648419;
                            }
                            iM2567 = C0630.m2566("ܰܿ") ^ i3;
                            i5 = ((iM2567 ^ i4) * (-13057)) ^ (-218635402);
                            i6 = -1991799612;
                        }
                        break;
                    case -396973323:
                    case 1178390380:
                        C2272.m7503();
                        C3432.m10477();
                        break;
                    case -337226396:
                    case 1806364729:
                        activityC16608.f51014.stopScroll();
                        if (!C1005.f3721) {
                            iM2567 = C2105.m6981("ᩳ۫") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-20747)) ^ 730625182;
                            i6 = -844882417;
                        } else {
                            iM2566 = C2105.m6981("֨᩸") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-3669)) ^ 171089895;
                            i = -1035049216;
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case -174793349:
                    case 1441612459:
                        if (C21923.f70183 == 0) {
                            iM2567 = C2105.m6981("ᩳ۫") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-20747)) ^ 730625182;
                            i6 = -844882417;
                        } else {
                            iM2567 = (C0630.m2566("ܶۢ") + i4) * 93;
                            i5 = ((iM2567 ^ i3) * 31181) ^ 1053958281;
                            i6 = -1903944280;
                        }
                        break;
                    case 1331165846:
                    case 1883573283:
                        activityC16608.f51014.post(runnableC6772);
                        break;
                    case 1866486485:
                    case 2025029631:
                        if (!C1504.f5354) {
                            iM2567 = C2105.m6981("᩹ۧ") ^ i3;
                            i5 = ((iM2567 ^ i4) * 3981) ^ (-428367618);
                            i6 = -262842186;
                        } else {
                            iM2567 = (C0630.m2566("ܶۢ") + i4) * 93;
                            i5 = ((iM2567 ^ i3) * 31181) ^ 1053958281;
                            i6 = -1903944280;
                        }
                        break;
                    default:
                        if (activityC16608.f51014.isComputingLayout()) {
                            iM2566 = C0630.m2566("ܺۤ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 25579) ^ (-1599486905);
                            i = 865022301;
                        } else {
                            iM2566 = (C0630.m2566("۬ۛ") + i4) * (-85);
                            i5 = ((iM2566 ^ i3) * 28909) ^ 105190380;
                            i = 1360094149;
                        }
                        i7 = iM2566 ^ i;
                        break;
                }
                return;
            }
        }
    }
}
