package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩻֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4EL */
/* JADX INFO: loaded from: classes.dex */
public final class C23343 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74998 = 0;

    /* JADX INFO: renamed from: ۢܽܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f74999 = {8385, -11118, -11113, -11091, -11039, -11082, -11123, -11039, -11114, -11012, -11039, -11019, -11117, -11038, -11120, -11039, -11119, -11033, -11124, -11113, -11091, -11039, -11082, -11123, -11039, -11114, -11012, -11039, -11019, -11117, -11038, -11120, -11039, -11119, -11033, -11120, -11038, -11113, -11091, -11039, -11082, -11123, -11039, -11114, -11119, -11081, -11010, -11040, -11014, -11087, -11032, -11118, -11011, -11113, -11009, -11039, -11019, -11119, -11120, -11096, -11081, -11019, -11087, -11032};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f75000;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f75001;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m51757(String str) {
        int iM6981;
        int i;
        int i2 = 0;
        char c = 0;
        boolean z = false;
        char[] charArray = null;
        int length = 0;
        int i3 = 0;
        int i4 = 1319084641;
        int i5 = C7811.f24123;
        int i6 = C3911.f12484;
        int iM2566 = (C0630.m2566("۠ۜ") + i5) * (-43);
        int i7 = ((iM2566 ^ i6) * 15153) ^ (-1680016293);
        int i8 = 1041792727;
        while (true) {
            int i9 = iM2566 ^ i8;
            while (true) {
                i4 = ((((i4 ^ i6) * (-26133)) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -1924072445:
                    case 1449127009:
                        if (C0422.f1886 > 0) {
                            iM2566 = (i6 - C0630.m2566("ۚܺ")) * (-93);
                            i7 = ((iM2566 ^ i5) * 15811) ^ 644772659;
                            i8 = -1060007028;
                            break;
                        }
                        iM2566 = (i5 - C2105.m6981("᩹᩹")) * 85;
                        i7 = ((iM2566 ^ i6) * (-4599)) ^ 591771507;
                        i8 = -1483417940;
                        break;
                    case -1914238299:
                    case -541656609:
                        C4075.m12263();
                        return false;
                    case -1879757061:
                    case -1739182052:
                        charArray = str.toCharArray();
                        length = charArray.length;
                        i3 = 0;
                        iM2566 = C0630.m2566("ᩳ۠") ^ i5;
                        i7 = ((iM2566 ^ i6) * 19443) ^ (-1714900899);
                        i8 = 415342567;
                        break;
                    case -1679576281:
                    case 1116496842:
                        if (C0630.f2410 <= 0) {
                            iM2566 = (i5 - C2105.m6981("᩹᩹")) * 85;
                            i7 = ((iM2566 ^ i6) * (-4599)) ^ 591771507;
                            i8 = -1483417940;
                            break;
                            break;
                        }
                        iM2566 = C0630.m2566("ܿ۠") ^ i6;
                        i7 = ((iM2566 ^ i5) * 27987) ^ 1936643241;
                        i8 = -2113015369;
                        break;
                    case -1679522170:
                    case -1175379932:
                        if (C3019.f9544 < 0) {
                            iM2566 = C0630.m2566("ܶۨ") ^ i5;
                            i7 = ((iM2566 ^ i6) * (-24383)) ^ 1483066690;
                            i8 = -407908524;
                            break;
                        }
                        iM2566 = C0630.m2566("ܿ۠") ^ i6;
                        i7 = ((iM2566 ^ i5) * 27987) ^ 1936643241;
                        i8 = -2113015369;
                        break;
                        break;
                    case -1656312702:
                    case -365041063:
                        if (RunnableC1937.f6483 < 0) {
                            iM2566 = (C2105.m6981("ۘۖ") ^ i6) * 75;
                            i7 = ((iM2566 ^ i5) * (-15487)) ^ 468397699;
                            i8 = -1451089229;
                            break;
                        }
                        iM2566 = C0630.m2566("ܿ۠") ^ i6;
                        i7 = ((iM2566 ^ i5) * 27987) ^ 1936643241;
                        i8 = -2113015369;
                        break;
                        break;
                    case -1635850063:
                    case 468320707:
                        if (!C0382.f1805) {
                            iM2566 = (C0630.m2566("ۚ۠") ^ i6) * (-121);
                            i7 = ((iM2566 ^ i5) * (-1795)) ^ (-930738537);
                            i8 = -1666113521;
                            break;
                        }
                        iM2566 = C2105.m6981("ۤ֨") ^ i6;
                        i7 = ((iM2566 ^ i5) * 1821) ^ (-2059556418);
                        i8 = -1444160008;
                        break;
                    case -1550070027:
                    case -1204875421:
                        if (m51754(i2, c, str)) {
                            iM6981 = C2105.m6981("ܰᩴ") ^ i6;
                            i7 = ((iM6981 ^ i5) * (-77)) ^ (-656262779);
                            i = 1763111338;
                        } else {
                            iM6981 = C2105.m6981("ۢ֡") ^ i5;
                            i7 = ((iM6981 ^ i6) * (-15849)) ^ (-473373242);
                            i = -1658186622;
                        }
                        i9 = iM6981 ^ i;
                        z = false;
                        break;
                    case -1547559220:
                    case 1065990010:
                        if (!C1005.f3721) {
                            iM2566 = (C0630.m2566("᩸ۜ") ^ i5) * (-25);
                            i7 = ((iM2566 ^ i6) * (-29539)) ^ 756188909;
                            i8 = -1991658868;
                            break;
                        }
                        iM2566 = C2105.m6981("ۨ۬") ^ i5;
                        i7 = ((iM2566 ^ i6) * 2173) ^ (-1681066356);
                        i8 = -1441130112;
                        break;
                    case -1539639587:
                    case -1456316307:
                        if (i3 >= length) {
                            iM2566 = (C2105.m6981("۠ۗ") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i7 = ((iM2566 ^ i5) * (-28559)) ^ (-1911802180);
                            i8 = 1763285073;
                            break;
                        }
                        iM2566 = (i6 - C2105.m6981("᩻ۖ")) * (-35);
                        i7 = ((iM2566 ^ i5) * (-21827)) ^ 1349291771;
                        i8 = -751356783;
                        break;
                    case -1451197079:
                    case 1325932713:
                        if (C1773.f6144 > 0) {
                            iM2566 = (C0630.m2566("ܰ᩶") + i5) * 69;
                            i7 = ((iM2566 ^ i6) * 26389) ^ 1236552063;
                            i8 = 471184984;
                            break;
                        }
                        iM2566 = (i5 - C2105.m6981("᩹᩹")) * 85;
                        i7 = ((iM2566 ^ i6) * (-4599)) ^ 591771507;
                        i8 = -1483417940;
                        break;
                        break;
                    case -1281220059:
                    case -303124882:
                        return z;
                    case -1270027169:
                    case -536706246:
                        C2958.m9034();
                        if (C7106.f21815 == 0) {
                            iM2566 = C0630.m2566("ܿ۠") ^ i6;
                            i7 = ((iM2566 ^ i5) * 27987) ^ 1936643241;
                            i8 = -2113015369;
                            break;
                            break;
                        }
                        iM2566 = C2105.m6981("ᩳ֡") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-4541)) ^ (-934003474);
                        i8 = 1008006764;
                        break;
                    case -1135230685:
                    case -649946823:
                        if (charArray[i3] != c) {
                            iM2566 = (i5 - C2105.m6981("ᩳۢ")) * 15;
                            i7 = ((iM2566 ^ i6) * (-9963)) ^ 452640500;
                            i8 = 1587425734;
                            break;
                        }
                        iM2566 = (C0630.m2566("ܶۙ") + i6) * (-103);
                        i7 = ((iM2566 ^ i5) * 11987) ^ (-201117082);
                        i8 = -1449338467;
                        break;
                    case -551853837:
                    case 1815590760:
                        if (!RunnableC3474.m10630()) {
                            iM2566 = (C0630.m2566("᩸ۜ") ^ i5) * (-25);
                            i7 = ((iM2566 ^ i6) * (-29539)) ^ 756188909;
                            i8 = -1991658868;
                            break;
                            break;
                        }
                        iM2566 = (C0630.m2566("ۗ᩵") + i6) * (-59);
                        i7 = ((iM2566 ^ i5) * (-13199)) ^ 1252488302;
                        i8 = -152636059;
                        break;
                    case -546755468:
                    case 375757849:
                        if (!C2272.f7362) {
                            iM2566 = C0630.m2566("ܿ۠") ^ i6;
                            i7 = ((iM2566 ^ i5) * 27987) ^ 1936643241;
                            i8 = -2113015369;
                            break;
                            break;
                        }
                        iM2566 = (C0630.m2566("ۚ۠") ^ i6) * (-121);
                        i7 = ((iM2566 ^ i5) * (-1795)) ^ (-930738537);
                        i8 = -1666113521;
                        break;
                        break;
                    case -537335232:
                    case 697639816:
                        if (C0050.f910 < 0) {
                            iM2566 = (C0630.m2566("ۗ᩺") + i6) * 9;
                            i7 = ((iM2566 ^ i5) * 2785) ^ 279964573;
                            i8 = -2048901154;
                            break;
                        }
                        iM2566 = C0630.m2566("ܿ۠") ^ i6;
                        i7 = ((iM2566 ^ i5) * 27987) ^ 1936643241;
                        i8 = -2113015369;
                        break;
                        break;
                    case -439310729:
                    case 752487226:
                        return z;
                    case -397245145:
                    case 839536186:
                        return true;
                    case 577869672:
                    case 1270908601:
                        i2 = 7;
                        if (C3746.f11829 > 0) {
                            iM2566 = (i5 - C0630.m2566("֡֫")) * (-121);
                            i7 = ((iM2566 ^ i6) * (-22393)) ^ (-728972454);
                            i8 = -871183677;
                            break;
                        }
                        iM2566 = C0630.m2566("ܿ۠") ^ i6;
                        i7 = ((iM2566 ^ i5) * 27987) ^ 1936643241;
                        i8 = -2113015369;
                        break;
                        break;
                    case 846539982:
                    case 958725211:
                        i3++;
                        iM2566 = C0630.m2566("ᩳ۠") ^ i5;
                        i7 = ((iM2566 ^ i6) * 19443) ^ (-1714900899);
                        i8 = 415342567;
                        break;
                        break;
                    case 1136165859:
                    case 1693331491:
                        ViewOnClickListenerC1958.m6429();
                        C1504.m5179();
                        iM2566 = C2105.m6981("ᩳ֡") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-4541)) ^ (-934003474);
                        i8 = 1008006764;
                        break;
                        break;
                    default:
                        c = ' ';
                        if (!C3663.f11553) {
                            iM2566 = (C0630.m2566("ۡۖ") ^ i5) * (-89);
                            i7 = ((iM2566 ^ i6) * 26677) ^ (-1648921679);
                            i8 = -2145583989;
                            break;
                        }
                        iM2566 = (C0630.m2566("᩸ۜ") ^ i5) * (-25);
                        i7 = ((iM2566 ^ i6) * (-29539)) ^ 756188909;
                        i8 = -1991658868;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m51759(String str) {
        int iM2566;
        int i;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        char[] charArray = null;
        int length = 0;
        int i4 = 0;
        char c = 0;
        int i5 = -522604676;
        int i6 = C2520.f8000;
        int i7 = C3911.f12484;
        int iM6981 = (C2105.m6981("ܿ۫") + i7) * (-71);
        int i8 = ((iM6981 ^ i6) * 21441) ^ (-719913044);
        int i9 = -1601682640;
        while (true) {
            int i10 = iM6981 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i6) * 25495) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2145190248:
                    case -116054305:
                        if (c == '_') {
                            iM6981 = C0630.m2566("ۜᩳ") ^ i6;
                            i8 = ((iM6981 ^ i7) * 5213) ^ 167149844;
                            i9 = -1171841993;
                            break;
                        }
                        iM6981 = (i6 - C2105.m6981("۠ᩳ")) * 31;
                        i8 = ((iM6981 ^ i7) * 28787) ^ 1185599796;
                        i9 = 402801849;
                        break;
                    case -2076605447:
                    case 757353512:
                        if (c <= '9') {
                            iM6981 = C0630.m2566("ۜᩳ") ^ i6;
                            i8 = ((iM6981 ^ i7) * 5213) ^ 167149844;
                            i9 = -1171841993;
                            break;
                            break;
                        }
                        iM6981 = (C2105.m6981("ܳ᩵") + i7) * (-67);
                        i8 = ((iM6981 ^ i6) * (-16299)) ^ (-997725828);
                        i9 = 1801360836;
                        break;
                    case -2034480635:
                    case 1026277427:
                        if (C3537.f11231 < 0) {
                            iM6981 = C2105.m6981("ᩳۙ") ^ i7;
                            i8 = ((iM6981 ^ i6) * (-20309)) ^ 924551092;
                            i9 = -552917331;
                            break;
                        }
                        iM6981 = (C2105.m6981("ۜۜ") ^ i6) * (-3);
                        i8 = ((iM6981 ^ i7) * (-8423)) ^ 1932353068;
                        i9 = 390236691;
                        break;
                    case -2019058825:
                    case 231147410:
                        if (c < 'A') {
                            iM6981 = C0630.m2566("۫֫") ^ i7;
                            i8 = ((iM6981 ^ i6) * 17223) ^ 68960138;
                            i9 = 998738045;
                            break;
                        }
                        iM6981 = (C0630.m2566("᩶ᩳ") + i7) * (-97);
                        i8 = ((iM6981 ^ i6) * 13317) ^ 520895723;
                        i9 = 997225260;
                        break;
                    case -1858470565:
                    case -938432453:
                        if (RunnableC3474.f10992 > 0) {
                            iM6981 = (C0630.m2566("ۖ᩻") + i6) * 75;
                            i8 = ((iM6981 ^ i7) * 23423) ^ 2095332585;
                            i9 = -1700642642;
                            break;
                        }
                        iM6981 = C2105.m6981("ۛ᩺") ^ i7;
                        i8 = ((iM6981 ^ i6) * 17513) ^ (-955198281);
                        i9 = -605197113;
                        break;
                    case -1800048836:
                    case -437194102:
                        if (C4263.f13799 <= 0) {
                            iM6981 = C2105.m6981("ۛ᩺") ^ i7;
                            i8 = ((iM6981 ^ i6) * 17513) ^ (-955198281);
                            i9 = -605197113;
                            break;
                            break;
                        }
                        iM6981 = C2105.m6981("۬ܰ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-29417)) ^ (-542945641);
                        i9 = 947159951;
                        break;
                    case -1732148119:
                    case 691796289:
                        charArray = str.toCharArray();
                        length = charArray.length;
                        i4 = 0;
                        iM6981 = C2105.m6981("ۘ᩻") ^ i7;
                        i8 = ((iM6981 ^ i6) * 2819) ^ 1238901267;
                        i9 = -1961018;
                        break;
                    case -1710745876:
                    case -254444570:
                        return z;
                    case -1506000649:
                    case 442254367:
                        if (C22628.f73083 > 0) {
                            iM6981 = C2105.m6981("ܺ᩵") ^ i6;
                            i8 = ((iM6981 ^ i7) * (-30997)) ^ 1532443867;
                            i9 = -98796517;
                            break;
                        }
                        iM6981 = (i6 - C2105.m6981("᩶֡")) * (-89);
                        i8 = ((iM6981 ^ i7) * 2795) ^ 641569784;
                        i9 = -1859809291;
                        break;
                    case -1176645822:
                    case -1105527157:
                        if (c <= 'Z') {
                            iM6981 = C0630.m2566("ۜᩳ") ^ i6;
                            i8 = ((iM6981 ^ i7) * 5213) ^ 167149844;
                            i9 = -1171841993;
                            break;
                            break;
                        }
                        iM6981 = C0630.m2566("۫֫") ^ i7;
                        i8 = ((iM6981 ^ i6) * 17223) ^ 68960138;
                        i9 = 998738045;
                        break;
                        break;
                    case -1139162366:
                    case 1449443081:
                        if (c <= 'z') {
                            iM6981 = C0630.m2566("ۜᩳ") ^ i6;
                            i8 = ((iM6981 ^ i7) * 5213) ^ 167149844;
                            i9 = -1171841993;
                            break;
                            break;
                        }
                        iM6981 = (C2105.m6981("ۨۨ") + i7) * (-103);
                        i8 = ((iM6981 ^ i6) * (-30185)) ^ (-1731563622);
                        i9 = -1645913606;
                        break;
                    case -1045187576:
                    case 1447590761:
                        i2 = 4;
                        if (C4117.m12364() == 0) {
                            iM6981 = C2105.m6981("ᩴܶ") ^ i7;
                            i8 = ((iM6981 ^ i6) * (-22647)) ^ (-1248910419);
                            i9 = -1783427202;
                            break;
                        }
                        iM6981 = (i6 - C2105.m6981("᩶֡")) * (-89);
                        i8 = ((iM6981 ^ i7) * 2795) ^ 641569784;
                        i9 = -1859809291;
                        break;
                        break;
                    case -988516841:
                    case -986181198:
                        return z;
                    case -960719044:
                    case 1324035548:
                        c = charArray[i4];
                        if (c < 'a') {
                            iM6981 = (C2105.m6981("ۨۨ") + i7) * (-103);
                            i8 = ((iM6981 ^ i6) * (-30185)) ^ (-1731563622);
                            i9 = -1645913606;
                            break;
                            break;
                        }
                        iM6981 = C0630.m2566("ۖܽ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-749)) ^ (-1395279719);
                        i9 = 935186545;
                        break;
                    case -914959045:
                    case 1951687816:
                        if (C2167.f7158 < 0) {
                            iM6981 = C2105.m6981("ᩳ֨") ^ i7;
                            i8 = ((iM6981 ^ i6) * 8359) ^ 1965885508;
                            i9 = 19943641;
                            break;
                        }
                        iM6981 = C2105.m6981("ۚ۬") ^ i6;
                        i8 = ((iM6981 ^ i7) * 17979) ^ (-883605780);
                        i9 = -1257195762;
                        break;
                    case -847789645:
                    case -699573519:
                        if (m51754(i2, i3, str)) {
                            iM2566 = (i7 - C0630.m2566("ܰۘ")) * 17;
                            i8 = ((iM2566 ^ i6) * (-15875)) ^ (-1264148755);
                            i = 2084421244;
                        } else {
                            iM2566 = C2105.m6981("ۧܶ") ^ i6;
                            i8 = ((iM2566 ^ i7) * 8275) ^ 1420759823;
                            i = 1318847689;
                        }
                        i10 = iM2566 ^ i;
                        z = false;
                        break;
                    case -730540230:
                    case -560498594:
                        C3683.m11222();
                        return false;
                    case -580619704:
                    case 697701925:
                        if (c < '0') {
                            iM6981 = (C2105.m6981("ܳ᩵") + i7) * (-67);
                            i8 = ((iM6981 ^ i6) * (-16299)) ^ (-997725828);
                            i9 = 1801360836;
                            break;
                            break;
                        }
                        iM6981 = C2105.m6981("ۚۡ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 901) ^ 847270351;
                        i9 = 261984490;
                        break;
                    case -461242575:
                    case 1112088995:
                        C4075.m12263();
                        if (!C1504.f5354) {
                            iM6981 = C2105.m6981("ۚ۬") ^ i6;
                            i8 = ((iM6981 ^ i7) * 17979) ^ (-883605780);
                            i9 = -1257195762;
                            break;
                            break;
                        }
                        iM6981 = C2105.m6981("۬ܰ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-29417)) ^ (-542945641);
                        i9 = 947159951;
                        break;
                        break;
                    case -405778599:
                    case 1881017425:
                        i3 = 24;
                        if (!C0964.m3413()) {
                            iM6981 = (C2105.m6981("ۜۜ") ^ i6) * (-3);
                            i8 = ((iM6981 ^ i7) * (-8423)) ^ 1932353068;
                            i9 = 390236691;
                            break;
                            break;
                        }
                        iM6981 = C2105.m6981("ۤۙ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 6683) ^ (-626980802);
                        i9 = 1575571152;
                        break;
                    case 67584453:
                    case 419552112:
                        if (i4 >= length) {
                            iM6981 = (C0630.m2566("ܽۤ") + i6) * 109;
                            i8 = ((iM6981 ^ i7) * 24181) ^ (-511433904);
                            i9 = 124371217;
                            break;
                        }
                        iM6981 = C2105.m6981("۠֨") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-12615)) ^ (-1738174495);
                        i9 = 1293452704;
                        break;
                    case 110333534:
                    case 830684020:
                        i4++;
                        iM6981 = C2105.m6981("ۘ᩻") ^ i7;
                        i8 = ((iM6981 ^ i6) * 2819) ^ 1238901267;
                        i9 = -1961018;
                        break;
                        break;
                    case 288123795:
                    case 1199930906:
                        if (!C1916.f6442) {
                            iM6981 = C2105.m6981("۠ۡ") ^ i7;
                            i8 = ((iM6981 ^ i6) * (-4529)) ^ 185599272;
                            i9 = 1088404195;
                            break;
                        }
                        iM6981 = C0630.m2566("ۢܰ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 26585) ^ 534908695;
                        i9 = 787698336;
                        break;
                    case 585370247:
                    case 847700026:
                        if (!C1504.m5179()) {
                            iM6981 = C2105.m6981("ۚ۬") ^ i6;
                            i8 = ((iM6981 ^ i7) * 17979) ^ (-883605780);
                            i9 = -1257195762;
                            break;
                            break;
                        }
                        iM6981 = C0630.m2566("ۨۙ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 12685) ^ 1803358406;
                        i9 = 1616883937;
                        break;
                    case 971717246:
                    case 1954511847:
                        if (!C2272.f7362) {
                            iM6981 = (C2105.m6981("ᩴ۬") + i6) * 45;
                            i8 = ((iM6981 ^ i7) * (-5839)) ^ 213524810;
                            i9 = 1174290791;
                            break;
                        }
                        iM6981 = (C2105.m6981("ۜۜ") ^ i6) * (-3);
                        i8 = ((iM6981 ^ i7) * (-8423)) ^ 1932353068;
                        i9 = 390236691;
                        break;
                        break;
                    case 1024369709:
                    case 1414509940:
                        C0798.m2998();
                        if (C0050.m940() <= 0) {
                            iM6981 = C0630.m2566("ۗۡ") ^ i7;
                            i8 = ((iM6981 ^ i6) * 163) ^ 849237619;
                            i9 = -1532306084;
                            break;
                        }
                        iM6981 = C2105.m6981("ۚ۬") ^ i6;
                        i8 = ((iM6981 ^ i7) * 17979) ^ (-883605780);
                        i9 = -1257195762;
                        break;
                        break;
                    case 1052025864:
                    case 1376647045:
                        C21923.m49329();
                        C3663.m11168();
                        iM6981 = C2105.m6981("۬ܰ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-29417)) ^ (-542945641);
                        i9 = 947159951;
                        break;
                        break;
                    case 1246842519:
                    case 1949138834:
                        if (C1128.f4106 <= 0) {
                            iM6981 = C2105.m6981("۠ۡ") ^ i7;
                            i8 = ((iM6981 ^ i6) * (-4529)) ^ 185599272;
                            i9 = 1088404195;
                            break;
                            break;
                        }
                        iM6981 = (i6 - C2105.m6981("᩶֡")) * (-89);
                        i8 = ((iM6981 ^ i7) * 2795) ^ 641569784;
                        i9 = -1859809291;
                        break;
                        break;
                    case 1417941678:
                    case 1932445853:
                        if (C4263.m12819() < 0) {
                            iM6981 = C2105.m6981("֨֡") ^ i6;
                            i8 = ((iM6981 ^ i7) * (-22915)) ^ 1435529573;
                            i9 = -1188914025;
                            break;
                        }
                        iM6981 = C2105.m6981("ܺ᩵") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-30997)) ^ 1532443867;
                        i9 = -98796517;
                        break;
                        break;
                    case 1517592529:
                    case 1907904052:
                        if (!C2126.f7087) {
                            iM6981 = C0630.m2566("ۗۡ") ^ i7;
                            i8 = ((iM6981 ^ i6) * 163) ^ 849237619;
                            i9 = -1532306084;
                            break;
                            break;
                        }
                        iM6981 = (i6 - C2105.m6981("᩶֡")) * (-89);
                        i8 = ((iM6981 ^ i7) * 2795) ^ 641569784;
                        i9 = -1859809291;
                        break;
                        break;
                    case 1898415692:
                    case 1927415278:
                        return true;
                    default:
                        if (C4075.f12947 < 0) {
                            iM6981 = C2105.m6981("᩺ۨ") ^ i6;
                            i8 = ((iM6981 ^ i7) * 7215) ^ (-1046446232);
                            i9 = -870150688;
                            break;
                        }
                        iM6981 = C0630.m2566("ۗۡ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 163) ^ 849237619;
                        i9 = -1532306084;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x017a A[PHI: r9 r10 r11 r17 r18 r20 r21
      0x017a: PHI (r9v2 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v3 short[]) binds: [B:42:0x0178, B:31:0x0122, B:29:0x011f, B:18:0x00bb, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v7 int) binds: [B:42:0x0178, B:31:0x0122, B:29:0x011f, B:18:0x00bb, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:42:0x0178, B:31:0x0122, B:29:0x011f, B:18:0x00bb, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r17v30 int) = (r17v10 int), (r17v15 int), (r17v17 int), (r17v23 int), (r17v32 int) binds: [B:42:0x0178, B:31:0x0122, B:29:0x011f, B:18:0x00bb, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r18v3 short[]) = (r18v1 short[]), (r18v1 short[]), (r18v1 short[]), (r18v2 short[]), (r18v1 short[]) binds: [B:42:0x0178, B:31:0x0122, B:29:0x011f, B:18:0x00bb, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r20v3 java.lang.String) = 
      (r20v2 java.lang.String)
      (r20v1 java.lang.String)
      (r20v1 java.lang.String)
      (r20v1 java.lang.String)
      (r20v1 java.lang.String)
     binds: [B:42:0x0178, B:31:0x0122, B:29:0x011f, B:18:0x00bb, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r21v3 char) = (r21v1 char), (r21v1 char), (r21v1 char), (r21v2 char), (r21v1 char) binds: [B:42:0x0178, B:31:0x0122, B:29:0x011f, B:18:0x00bb, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01e3 A[PHI: r1 r2 r3 r4 r7 r17
      0x01e3: PHI (r1v2 short) = (r1v1 short), (r1v1 short), (r1v1 short), (r1v1 short), (r1v3 short) binds: [B:54:0x01e1, B:51:0x01d8, B:38:0x0156, B:34:0x0134, B:25:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r2v3 short) = (r2v1 short), (r2v1 short), (r2v1 short), (r2v2 short), (r2v1 short) binds: [B:54:0x01e1, B:51:0x01d8, B:38:0x0156, B:34:0x0134, B:25:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r3v3 int) = (r3v1 int), (r3v1 int), (r3v2 int), (r3v1 int), (r3v1 int) binds: [B:54:0x01e1, B:51:0x01d8, B:38:0x0156, B:34:0x0134, B:25:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:54:0x01e1, B:51:0x01d8, B:38:0x0156, B:34:0x0134, B:25:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:54:0x01e1, B:51:0x01d8, B:38:0x0156, B:34:0x0134, B:25:0x0102] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r17v18 int) = (r17v7 int), (r17v8 int), (r17v11 int), (r17v12 int), (r17v19 int) binds: [B:54:0x01e1, B:51:0x01d8, B:38:0x0156, B:34:0x0134, B:25:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0249 A[PHI: r17
      0x0249: PHI (r17v16 int) = (r17v5 int), (r17v8 int), (r17v17 int) binds: [B:62:0x0247, B:51:0x01d8, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x025f A[PHI: r5 r6 r17
      0x025f: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:62:0x0247, B:21:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r6v2 short) = (r6v1 short), (r6v3 short) binds: [B:62:0x0247, B:21:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r17v20 int) = (r17v5 int), (r17v21 int) binds: [B:62:0x0247, B:21:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM6981;
        int i;
        int i2;
        int i3;
        int i4;
        short[] sArr;
        int iM2566;
        int i5;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -2117930552;
        int i15 = RunnableC0588.f2309;
        int i16 = RunnableC1937.f6483;
        int iM2567 = C0630.m2566("ۘܽ") ^ i15;
        int i17 = ((iM2567 ^ i16) * (-14517)) ^ (-697566606);
        int i18 = iM2567 ^ (-940913126);
        String strM5726 = null;
        char c = 0;
        short[] sArr3 = null;
        int i19 = 0;
        short[] sArr4 = null;
        while (true) {
            int i20 = i18 ^ (i17 & (((i14 ^ i16) * (-18909)) >> 31));
            switch (i20) {
                case -2045545253:
                case 1050178120:
                    f75000 = Pattern.compile(C0382.m1840(sArr3, i13, i19, i10));
                    return;
                case -1784691273:
                case 2120932170:
                    i20 = i20;
                    if (C3019.m9255() > 0) {
                        iM6981 = (C2105.m6981("ۜۗ") ^ i15) * 119;
                        i = ((iM6981 ^ i16) * (-24465)) ^ 1621931711;
                        i2 = 2080203315;
                    } else {
                        iM6981 = (C2105.m6981("֨ܶ") ^ i16) * (-101);
                        i = ((iM6981 ^ i15) * (-14169)) ^ 259507532;
                        i2 = -1740265028;
                    }
                    int i21 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i21;
                    break;
                case -1496089657:
                case 402821878:
                    i20 = i20;
                    if ((i9 * i9) - i8 >= 0) {
                        iM6981 = C0630.m2566("۠֡") ^ i15;
                        i = ((iM6981 ^ i16) * (-18093)) ^ 470195241;
                        i2 = -394321806;
                    } else {
                        iM6981 = C2105.m6981("ܳܿ") ^ i16;
                        i = ((iM6981 ^ i15) * (-8937)) ^ (-196701141);
                        i2 = 1103093168;
                    }
                    int i22 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i22;
                    break;
                case -1427350189:
                case -540133437:
                    i20 = i20;
                    i9 = s + s3;
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C0630.m2566("ۛܽ") ^ i15;
                        i = ((iM6981 ^ i16) * 22835) ^ (-1482645288);
                        i2 = 207938010;
                    } else {
                        iM6981 = (C2105.m6981("۬۬") ^ i15) * (-39);
                        i = ((iM6981 ^ i16) * 24993) ^ 1649498156;
                        i2 = -1832953823;
                    }
                    int i23 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i23;
                    break;
                case -1342471154:
                case 202844461:
                    i20 = i20;
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("ۜۗ") ^ i15) * 119;
                        i = ((iM6981 ^ i16) * (-24465)) ^ 1621931711;
                        i2 = 2080203315;
                    } else {
                        iM6981 = C0630.m2566("ۛܽ") ^ i15;
                        i = ((iM6981 ^ i16) * 22835) ^ (-1482645288);
                        i2 = 207938010;
                    }
                    int i24 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i24;
                    break;
                case -1049684685:
                case 1348815590:
                    C1916.m6308();
                    C3746.m11369();
                    throw new RuntimeException();
                case -799218442:
                case 1930588978:
                    i3 = 43396;
                    int iM2568 = C0630.m2566("۠᩵") ^ i16;
                    i = ((iM2568 ^ i15) * (-95)) ^ (-875737498);
                    i2 = -112723043;
                    i4 = iM2568;
                    i10 = i3;
                    iM6981 = i4;
                    int i25 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i25;
                    break;
                case -782368181:
                case -554042272:
                    i20 = i20;
                    strM5726 = C1711.m5726(sArr2, i11, i12, i10);
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("᩶᩻") ^ i16;
                        i = ((iM6981 ^ i15) * (-26143)) ^ 1945339655;
                        i2 = -490089158;
                    } else {
                        iM6981 = (i16 - C2105.m6981("ܶۨ")) * (-33);
                        i = ((iM6981 ^ i15) * (-5271)) ^ (-731591318);
                        i2 = -254614149;
                    }
                    int i26 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i26;
                    break;
                case -776633011:
                case -156452272:
                    i20 = i20;
                    i6 = s * s2;
                    i7 = 1;
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C0630.m2566("ۛܽ") ^ i15;
                        i = ((iM6981 ^ i16) * 22835) ^ (-1482645288);
                        i2 = 207938010;
                    } else {
                        iM6981 = C0630.m2566("ۘ֨") ^ i16;
                        i = ((iM6981 ^ i15) * 24329) ^ (-1118427590);
                        i2 = -457694045;
                    }
                    int i27 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i27;
                    break;
                case -647803491:
                case 1647972357:
                    i20 = i20;
                    s2 = 2;
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("ۛܽ") ^ i15;
                        i = ((iM6981 ^ i16) * 22835) ^ (-1482645288);
                        i2 = 207938010;
                    } else {
                        iM6981 = (C0630.m2566("ۚܰ") + i15) * 95;
                        i = ((iM6981 ^ i16) * 4689) ^ 205800476;
                        i2 = -178201642;
                    }
                    int i28 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i28;
                    break;
                case -550317767:
                case 1904477468:
                    i3 = 54476;
                    int iM2569 = C0630.m2566("۠᩵") ^ i16;
                    i = ((iM2569 ^ i15) * (-95)) ^ (-875737498);
                    i2 = -112723043;
                    i4 = iM2569;
                    i10 = i3;
                    iM6981 = i4;
                    int i29 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i29;
                    break;
                case -398230337:
                case 1458011386:
                    i20 = i20;
                    C1420.m4913();
                    iM6981 = (i16 - C2105.m6981("ܶۨ")) * (-33);
                    i = ((iM6981 ^ i15) * (-5271)) ^ (-731591318);
                    i2 = -254614149;
                    int i210 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i210;
                    break;
                case -385680400:
                case 1803483561:
                    i20 = i20;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6981 = (i16 - C2105.m6981("ܶۨ")) * (-33);
                        i = ((iM6981 ^ i15) * (-5271)) ^ (-731591318);
                        i2 = -254614149;
                    } else {
                        iM6981 = (C2105.m6981("ۜۗ") ^ i15) * 119;
                        i = ((iM6981 ^ i16) * (-24465)) ^ 1621931711;
                        i2 = 2080203315;
                    }
                    int i211 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i211;
                    break;
                case -214225121:
                case 825644501:
                    i20 = i20;
                    s = sArr4[c];
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("ۛܽ") ^ i15;
                        i = ((iM6981 ^ i16) * 22835) ^ (-1482645288);
                        i2 = 207938010;
                    } else {
                        iM6981 = C0630.m2566("֡᩵") ^ i15;
                        i = ((iM6981 ^ i16) * (-25969)) ^ 571837575;
                        i2 = -71227554;
                    }
                    int i212 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i212;
                    break;
                case 1164593822:
                case 1968906841:
                    i20 = i20;
                    i8 = i6 + i7;
                    s3 = 1;
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C2105.m6981("֨ܶ") ^ i16) * (-101);
                        i = ((iM6981 ^ i15) * (-14169)) ^ 259507532;
                        i2 = -1740265028;
                    } else {
                        iM6981 = (C0630.m2566("ۗۘ") ^ i16) * (-119);
                        i = ((iM6981 ^ i15) * (-10819)) ^ (-715203764);
                        i2 = -256476832;
                    }
                    int i213 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i213;
                    break;
                case 1195833858:
                case 1578232528:
                    sArr4 = f74999;
                    c = 0;
                    if (C0422.f1886 <= 0) {
                        i20 = i20;
                        iM6981 = (i16 - C2105.m6981("ܶۨ")) * (-33);
                        i = ((iM6981 ^ i15) * (-5271)) ^ (-731591318);
                        i2 = -254614149;
                    } else {
                        iM6981 = (i16 - C2105.m6981("ۚۤ")) * (-53);
                        i20 = i20;
                        i = ((iM6981 ^ i15) * (-20637)) ^ 1450440455;
                        i2 = -46766219;
                    }
                    int i214 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i214;
                    break;
                case 1203317218:
                case 1839835763:
                    short[] sArr5 = f74999;
                    i13 = 51;
                    if (C4616.f14690 <= 0) {
                        sArr = sArr5;
                        i20 = i20;
                        i19 = 13;
                        iM2566 = C0630.m2566("֡֫") ^ i16;
                        sArr3 = sArr;
                        i5 = ((iM2566 ^ i15) * 8333) ^ 737372480;
                        i2 = -1644936659;
                        i4 = iM2566;
                        i = i5;
                        iM6981 = i4;
                    } else {
                        int iM6982 = C2105.m6981("ۙܺ") ^ i15;
                        i2 = 535318773;
                        sArr3 = sArr5;
                        i19 = 13;
                        i = ((iM6982 ^ i16) * 17713) ^ (-251979433);
                        iM6981 = iM6982;
                        i20 = i20;
                    }
                    int i215 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i215;
                    break;
                case 1570942036:
                case 1755630370:
                    sArr2 = f74999;
                    i12 = 50;
                    if (C4263.f13799 <= 0) {
                        i20 = i20;
                        i11 = 1;
                        iM6981 = (i16 - C2105.m6981("ܶۨ")) * (-33);
                        i = ((iM6981 ^ i15) * (-5271)) ^ (-731591318);
                        i2 = -254614149;
                    } else {
                        iM6981 = (i15 - C0630.m2566("ۗ۬")) * 119;
                        i2 = 1296559638;
                        i20 = i20;
                        i = ((iM6981 ^ i16) * 16803) ^ 1568269247;
                        i11 = 1;
                    }
                    int i216 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i216;
                    break;
                default:
                    i20 = i20;
                    sArr = sArr3;
                    f75001 = Pattern.compile(strM5726);
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("֡֫") ^ i16;
                        sArr3 = sArr;
                        i5 = ((iM2566 ^ i15) * 8333) ^ 737372480;
                        i2 = -1644936659;
                    } else {
                        iM2566 = (C2105.m6981("᩶۟") + i15) * (-111);
                        sArr3 = sArr;
                        i5 = ((iM2566 ^ i16) * (-18387)) ^ (-80598885);
                        i2 = 1476187691;
                    }
                    i4 = iM2566;
                    i = i5;
                    iM6981 = i4;
                    int i217 = i20;
                    i18 = iM6981 ^ i2;
                    i17 = i;
                    i14 = i217;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51755(String str) {
        int i = 0;
        int i2 = -158941534;
        int i3 = C4263.f13799;
        int i4 = C1773.f6144;
        int iM2566 = C0630.m2566("ۛۢ") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-4079)) ^ (-1266134745);
        int i6 = -415528021;
        while (true) {
            i2 = ((((i2 ^ i3) * (-5311)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2000153964:
                case -594324497:
                    if (m51754(i, 32, str)) {
                        iM2566 = (C0630.m2566("֫۟") ^ i3) * (-9);
                        i5 = ((iM2566 ^ i4) * (-23355)) ^ (-443888684);
                        i6 = -1187588756;
                    } else {
                        iM2566 = (C2105.m6981("ܶ᩷") ^ i4) * 119;
                        i5 = ((iM2566 ^ i3) * 19035) ^ (-1881869366);
                        i6 = 638812098;
                    }
                    break;
                case -1866720714:
                case 1602836828:
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ᩳۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-13433)) ^ 389785100;
                        i6 = 912371803;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۛ֨")) * 51;
                        i5 = ((iM2566 ^ i4) * 15609) ^ (-1541944592);
                        i6 = 1517754077;
                    }
                    break;
                case -1853311224:
                case -16041082:
                    return f75001.matcher(str).matches();
                case -1705858797:
                case 877112028:
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("ۨ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * 26181) ^ 2026175096;
                        i6 = 1912500909;
                    } else {
                        iM2566 = (C2105.m6981("ܺۚ") ^ i3) * (-15);
                        i5 = ((iM2566 ^ i4) * 11637) ^ 1435162132;
                        i6 = 1256612458;
                    }
                    break;
                case -1674575853:
                case 1703090010:
                    return false;
                case -1536577246:
                case 829714912:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i4 - C2105.m6981("۠᩺")) * (-23);
                        i5 = ((iM2566 ^ i3) * (-9651)) ^ (-1694192649);
                        i6 = -714237401;
                    } else {
                        iM2566 = C2105.m6981("ۡۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-7043)) ^ (-1491373175);
                        i6 = 1121426440;
                    }
                    break;
                case -1241549323:
                case 1220808007:
                    C7811.m20844();
                    if (!C1916.f6442) {
                        iM2566 = (i4 - C2105.m6981("۠᩺")) * (-23);
                        i5 = ((iM2566 ^ i3) * (-9651)) ^ (-1694192649);
                        i6 = -714237401;
                    } else {
                        iM2566 = (C0630.m2566("ۖۜ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM2566 ^ i4) * (-30425)) ^ (-1289412886);
                        i6 = -1891959713;
                    }
                    break;
                case -1196736035:
                case 1818894813:
                    if (C1504.f5354) {
                        iM2566 = (i4 - C2105.m6981("ۜۗ")) * (-23);
                        i5 = ((iM2566 ^ i3) * (-10853)) ^ 518698027;
                        i6 = 2029035270;
                    } else {
                        iM2566 = C2105.m6981("ۢۗ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12003)) ^ 1922671538;
                        i6 = 669007150;
                    }
                    break;
                case -1072442850:
                case 331139123:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("ۨ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * 26181) ^ 2026175096;
                        i6 = 1912500909;
                    } else {
                        iM2566 = C2105.m6981("ۚۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-27399)) ^ 765342743;
                        i6 = 108724955;
                    }
                    break;
                case -1010183863:
                case -188690129:
                    if (C4159.f13567) {
                        iM2566 = (C0630.m2566("֡֫") + i3) * 95;
                        i5 = ((iM2566 ^ i4) * (-30295)) ^ 528334115;
                        i6 = -423742470;
                    } else {
                        iM2566 = C2105.m6981("ۨ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * 26181) ^ 2026175096;
                        i6 = 1912500909;
                    }
                    break;
                case -913952454:
                case -760127660:
                    i = 6;
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ܶۢ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-22283)) ^ (-354794704);
                        i6 = 1899290310;
                    } else {
                        iM2566 = C0630.m2566("ᩳۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-13433)) ^ 389785100;
                        i6 = 912371803;
                    }
                    break;
                case -73003800:
                case 410788763:
                    RunnableC0588.m2441();
                    return false;
                case -25258364:
                case 684111975:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ᩳۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-13433)) ^ 389785100;
                        i6 = 912371803;
                    } else {
                        iM2566 = C0630.m2566("۠ۗ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 8143) ^ (-375347094);
                        i6 = 1637261956;
                    }
                    break;
                case 37659579:
                case 1590599213:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (i4 - C2105.m6981("ۜۗ")) * (-23);
                        i5 = ((iM2566 ^ i3) * (-10853)) ^ 518698027;
                        i6 = 2029035270;
                    } else {
                        iM2566 = (i4 - C2105.m6981("۠᩺")) * (-23);
                        i5 = ((iM2566 ^ i3) * (-9651)) ^ (-1694192649);
                        i6 = -714237401;
                    }
                    break;
                case 321097835:
                case 1168288533:
                    if (!C1504.m5179()) {
                        iM2566 = (i4 - C2105.m6981("۠᩺")) * (-23);
                        i5 = ((iM2566 ^ i3) * (-9651)) ^ (-1694192649);
                        i6 = -714237401;
                    } else {
                        iM2566 = C0630.m2566("ᩳۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-13433)) ^ 389785100;
                        i6 = 912371803;
                    }
                    break;
                case 819312417:
                case 1917840243:
                    RunnableC1108.m3790();
                    iM2566 = (i4 - C2105.m6981("۠᩺")) * (-23);
                    i5 = ((iM2566 ^ i3) * (-9651)) ^ (-1694192649);
                    i6 = -714237401;
                    break;
                case 1152353603:
                case 1683184952:
                    if (C1916.f6442) {
                        iM2566 = (i4 - C2105.m6981("ᩳ᩹")) * 87;
                        i5 = ((iM2566 ^ i3) * 13107) ^ (-1992157330);
                        i6 = 368866527;
                    } else {
                        iM2566 = C2105.m6981("ۨ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * 26181) ^ 2026175096;
                        i6 = 1912500909;
                    }
                    break;
                default:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("ۖۜ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM2566 ^ i4) * (-30425)) ^ (-1289412886);
                        i6 = -1891959713;
                    } else {
                        iM2566 = (C2105.m6981("ۤۧ") ^ i4) * (-69);
                        i5 = ((iM2566 ^ i3) * 25501) ^ 1040694584;
                        i6 = 42512975;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m51756(String str) {
        return m51754(1, 24, str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m51758(String str) {
        int i = 0;
        int i2 = 238361375;
        int i3 = C4616.f14690;
        int i4 = C3432.f10845;
        int iM6981 = C2105.m6981("ۖܽ") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-8779)) ^ 1120359725;
        int i6 = -1533261931;
        while (true) {
            i2 = ((((i2 ^ i3) * 26675) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -1946917806:
                case 107397334:
                    if (m51754(i, 24, str)) {
                        iM6981 = C0630.m2566("ۢ᩶") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-10079)) ^ 1938021820;
                        i6 = -2031731844;
                    } else {
                        iM6981 = C0630.m2566("᩷ܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-7185)) ^ (-1991744392);
                        i6 = -990525562;
                    }
                    break;
                case -1675353292:
                case -145385297:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ۨ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30341) ^ (-893064163);
                        i6 = -201150833;
                    } else {
                        iM6981 = C2105.m6981("ۨۙ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-22905)) ^ 439209467;
                        i6 = 1538642893;
                    }
                    break;
                case -1668950439:
                case -750984128:
                    if (C4117.f13076 <= 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ۨ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30341) ^ (-893064163);
                        i6 = -201150833;
                    } else {
                        iM6981 = (C0630.m2566("ۖܰ") ^ i4) * (-117);
                        i5 = ((iM6981 ^ i3) * 5433) ^ 1523373595;
                        i6 = -1721803599;
                    }
                    break;
                case -1604961135:
                case -1307611569:
                    if (RunnableC1108.f4040) {
                        iM6981 = (i4 - C2105.m6981("۠۠")) * 15;
                        i5 = ((iM6981 ^ i3) * (-19143)) ^ 279686085;
                        i6 = 1954425941;
                    } else {
                        iM6981 = C0630.m2566("۬ۘ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22537)) ^ (-1437163730);
                        i6 = 1951656842;
                    }
                    break;
                case -1115303974:
                case 1040998719:
                    if (!C4159.f13567) {
                        iM6981 = C0630.m2566("ᩳۢ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-7601)) ^ 345299160;
                        i6 = -1724681716;
                    } else {
                        iM6981 = C2105.m6981("ۙ᩻") ^ i3;
                        i5 = ((iM6981 ^ i4) * 3831) ^ (-1363060703);
                        i6 = -644521304;
                    }
                    break;
                case -1052283442:
                case -478580292:
                    if (!C0964.m3413()) {
                        iM6981 = (i3 - C0630.m2566("᩸ۨ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30341) ^ (-893064163);
                        i6 = -201150833;
                    } else {
                        iM6981 = C0630.m2566("ᩳۢ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-7601)) ^ 345299160;
                        i6 = -1724681716;
                    }
                    break;
                case -645371887:
                case 691504528:
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("᩻ۢ") ^ i3) * 13;
                        i5 = ((iM6981 ^ i4) * 59) ^ (-1291557088);
                        i6 = -1402534;
                    } else {
                        iM6981 = (C2105.m6981("ܰ۬") + i3) * (-73);
                        i5 = ((iM6981 ^ i4) * 9433) ^ 1103534651;
                        i6 = -4301671;
                    }
                    break;
                case -498261286:
                case 666365166:
                    return false;
                case -396730611:
                case 1027861008:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ۨ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30341) ^ (-893064163);
                        i6 = -201150833;
                    } else {
                        iM6981 = (C0630.m2566("ۜ֨") ^ i3) * (-43);
                        i5 = ((iM6981 ^ i4) * (-24523)) ^ (-880801307);
                        i6 = 1470216684;
                    }
                    break;
                case -366221408:
                case 143210497:
                    if (!C11340.m28031()) {
                        iM6981 = C0630.m2566("۬ۘ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22537)) ^ (-1437163730);
                        i6 = 1951656842;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩸ۨ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30341) ^ (-893064163);
                        i6 = -201150833;
                    }
                    break;
                case -89389438:
                case 2034889429:
                    if (C11340.f33930 >= 0) {
                        iM6981 = C0630.m2566("۬ۘ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22537)) ^ (-1437163730);
                        i6 = 1951656842;
                    } else {
                        iM6981 = (C2105.m6981("۬ۤ") + i4) * 33;
                        i5 = ((iM6981 ^ i3) * (-4703)) ^ (-292268549);
                        i6 = -879202412;
                    }
                    break;
                case -13741398:
                case 1207155469:
                    C0714.m2805();
                    C3663.m11168();
                    return false;
                case 194356285:
                case 195194794:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C2105.m6981("᩻ۢ") ^ i3) * 13;
                        i5 = ((iM6981 ^ i4) * 59) ^ (-1291557088);
                        i6 = -1402534;
                    } else {
                        iM6981 = C0630.m2566("ۨۗ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-6759)) ^ 1224400043;
                        i6 = 1054925717;
                    }
                    break;
                case 294176666:
                case 575154668:
                    i = 4;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("۬ۘ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22537)) ^ (-1437163730);
                        i6 = 1951656842;
                    } else {
                        iM6981 = (C0630.m2566("۫ۢ") + i3) * 55;
                        i5 = ((iM6981 ^ i4) * 29387) ^ (-282965180);
                        i6 = -1474269581;
                    }
                    break;
                case 740561899:
                case 1800970298:
                    C3245.m9925();
                    iM6981 = C2105.m6981("ۙ᩻") ^ i3;
                    i5 = ((iM6981 ^ i4) * 3831) ^ (-1363060703);
                    i6 = -644521304;
                    break;
                case 871534464:
                case 952712576:
                    return f75000.matcher(str).matches();
                case 1527131688:
                case 2098123260:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ۨ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i4) * 30341) ^ (-893064163);
                        i6 = -201150833;
                    } else {
                        iM6981 = (C2105.m6981("ᩴᩳ") ^ i4) * (-15);
                        i5 = ((iM6981 ^ i3) * (-1637)) ^ 1258681220;
                        i6 = -1332126809;
                    }
                    break;
                default:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("ۙ᩻") ^ i3;
                        i5 = ((iM6981 ^ i4) * 3831) ^ (-1363060703);
                        i6 = -644521304;
                    } else {
                        iM6981 = (C0630.m2566("᩷֫") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM6981 ^ i4) * 26793) ^ (-280611982);
                        i6 = 123287211;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51754(int i, int i2, String str) {
        int iM3007 = 0;
        int i3 = -968805232;
        int i4 = C0630.f2410;
        int i5 = C3683.f11629;
        int iM2566 = C0630.m2566("ۡܰ") ^ i5;
        int i6 = ((iM2566 ^ i4) * (-28525)) ^ 2012235894;
        int i7 = -1965397581;
        while (true) {
            i3 = ((((i3 ^ i4) * 6741) >> 31) & i6) ^ (iM2566 ^ i7);
            switch (i3) {
                case -2105228714:
                case -748987184:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("ᩴۧ") ^ i4) * (-75);
                        i6 = ((iM2566 ^ i5) * 32289) ^ (-829145880);
                        i7 = -992843766;
                    } else {
                        iM2566 = C0630.m2566("᩷ܽ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-10419)) ^ (-74510006);
                        i7 = 1799270704;
                    }
                    break;
                case -2065235753:
                case 1954169529:
                    if (!C2272.f7362) {
                        iM2566 = C0630.m2566("᩻ۢ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 20943) ^ 734992681;
                        i7 = 478168605;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ܽۙ")) * 95;
                        i6 = ((iM2566 ^ i4) * 14015) ^ 1033810397;
                        i7 = 875829833;
                    }
                    break;
                case -2042127669:
                case 2120053809:
                    if (C2272.f7362) {
                        iM2566 = C2105.m6981("᩹۬") ^ i4;
                        i6 = ((iM2566 ^ i5) * 3503) ^ (-1254263585);
                        i7 = 136750929;
                    } else {
                        iM2566 = C2105.m6981("ۙ᩸") ^ i4;
                        i6 = ((iM2566 ^ i5) * 2095) ^ (-337412822);
                        i7 = -1981063895;
                    }
                    break;
                case -2014962276:
                case 1910761962:
                    if (str == null) {
                        iM2566 = (i5 - C0630.m2566("᩵ۢ")) * (-43);
                        i6 = ((iM2566 ^ i4) * 28135) ^ (-1666949255);
                        i7 = 2120693619;
                    } else {
                        iM2566 = C2105.m6981("ۛۘ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 9343) ^ (-411439731);
                        i7 = 1395345601;
                    }
                    break;
                case -1975566874:
                case -203585556:
                    C3911.m11924();
                    return false;
                case -1974545649:
                case -1660586615:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C0630.m2566("᩻ۢ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 20943) ^ 734992681;
                        i7 = 478168605;
                    } else {
                        iM2566 = (C0630.m2566("ۡ᩺") ^ i5) * 63;
                        i6 = ((iM2566 ^ i4) * (-15071)) ^ (-859956734);
                        i7 = 770964605;
                    }
                    break;
                case -1853387889:
                case -1451095053:
                    RunnableC3474.m10630();
                    iM2566 = (i5 - C2105.m6981("ܽۙ")) * 95;
                    i6 = ((iM2566 ^ i4) * 14015) ^ 1033810397;
                    i7 = 875829833;
                    break;
                case -1814401261:
                case 186990880:
                    return false;
                case -1615180933:
                case 1786668504:
                    if (C2520.m8026()) {
                        iM2566 = (i5 - C2105.m6981("ܽۙ")) * 95;
                        i6 = ((iM2566 ^ i4) * 14015) ^ 1033810397;
                        i7 = 875829833;
                    } else {
                        iM2566 = (C2105.m6981("۬ۖ") ^ i4) * 35;
                        i6 = ((iM2566 ^ i5) * 29885) ^ (-503640189);
                        i7 = -82597491;
                    }
                    break;
                case -1579251705:
                case 2027004959:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("᩹۬") ^ i4;
                        i6 = ((iM2566 ^ i5) * 3503) ^ (-1254263585);
                        i7 = 136750929;
                    } else {
                        iM2566 = C2105.m6981("۠ۗ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 19537) ^ 1250821738;
                        i7 = 1935738758;
                    }
                    break;
                case -1564799907:
                case 161184986:
                    iM3007 = C0798.m3007(str);
                    if (i <= iM3007) {
                        iM2566 = C0630.m2566("ۡᩴ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 11875) ^ (-1078426395);
                        i7 = -748224710;
                    } else {
                        iM2566 = (i5 - C0630.m2566("᩵ۢ")) * (-43);
                        i6 = ((iM2566 ^ i4) * 28135) ^ (-1666949255);
                        i7 = 2120693619;
                    }
                    break;
                case -1262595734:
                case -857594427:
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("᩹۬") ^ i4;
                        i6 = ((iM2566 ^ i5) * 3503) ^ (-1254263585);
                        i7 = 136750929;
                    } else {
                        iM2566 = C0630.m2566("᩸ܺ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-13797)) ^ 1151081103;
                        i7 = 2034305983;
                    }
                    break;
                case -692758023:
                case 12032721:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C2105.m6981("ᩴۧ") ^ i4) * (-75);
                        i6 = ((iM2566 ^ i5) * 32289) ^ (-829145880);
                        i7 = -992843766;
                    } else {
                        iM2566 = C0630.m2566("ۗ᩵") ^ i4;
                        i6 = ((iM2566 ^ i5) * 165) ^ (-1546665317);
                        i7 = -2060451632;
                    }
                    break;
                case -545259032:
                case 899713594:
                    if (C3663.m11168() >= 0) {
                        iM2566 = (i5 - C2105.m6981("᩻᩵")) * 11;
                        i6 = ((iM2566 ^ i4) * (-20061)) ^ (-2138006325);
                        i7 = -171266328;
                    } else {
                        iM2566 = (C2105.m6981("۬ۘ") ^ i5) * 69;
                        i6 = ((iM2566 ^ i4) * 4549) ^ 1171684442;
                        i7 = -1597091447;
                    }
                    break;
                case -65492535:
                case 669110628:
                    if (iM3007 <= i2) {
                        iM2566 = C0630.m2566("ܳۙ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-10471)) ^ 1782331650;
                        i7 = 442833445;
                    } else {
                        iM2566 = (i5 - C0630.m2566("᩵ۢ")) * (-43);
                        i6 = ((iM2566 ^ i4) * 28135) ^ (-1666949255);
                        i7 = 2120693619;
                    }
                    break;
                case 758947801:
                case 1218772812:
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("ᩴۧ") ^ i4) * (-75);
                        i6 = ((iM2566 ^ i5) * 32289) ^ (-829145880);
                        i7 = -992843766;
                    } else {
                        iM2566 = C2105.m6981("ۖۗ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-10071)) ^ 1021558101;
                        i7 = 1077496390;
                    }
                    break;
                case 991491553:
                case 1177784988:
                    if (C2105.f7037 == 0) {
                        iM2566 = (C2105.m6981("ᩴۧ") ^ i4) * (-75);
                        i6 = ((iM2566 ^ i5) * 32289) ^ (-829145880);
                        i7 = -992843766;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ܽۙ")) * 95;
                        i6 = ((iM2566 ^ i4) * 14015) ^ 1033810397;
                        i7 = 875829833;
                    }
                    break;
                case 1051183490:
                case 1087705957:
                    return true;
                case 1385526148:
                case 1560698387:
                    if (C4616.f14690 > 0) {
                        iM2566 = (i5 - C2105.m6981("᩻᩵")) * 11;
                        i6 = ((iM2566 ^ i4) * (-20061)) ^ (-2138006325);
                        i7 = -171266328;
                    } else {
                        iM2566 = C0630.m2566("᩻ۢ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 20943) ^ 734992681;
                        i7 = 478168605;
                    }
                    break;
                default:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i5 - C2105.m6981("ܽۙ")) * 95;
                        i6 = ((iM2566 ^ i4) * 14015) ^ 1033810397;
                        i7 = 875829833;
                    } else {
                        iM2566 = C2105.m6981("֨۬") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-25903)) ^ (-847540985);
                        i7 = 576847133;
                    }
                    break;
            }
        }
    }
}
