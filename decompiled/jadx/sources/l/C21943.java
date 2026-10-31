package l;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.᩹֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I141 */
/* JADX INFO: loaded from: classes.dex */
public final class C21943 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static int f70255 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int f70256 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int f70257 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static boolean f70258 = true;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int f70259 = 0;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static int f70260 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static int f70261 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean f70262 = false;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static int f70263 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f70264 = 0;

    /* JADX INFO: renamed from: ۙ֨ܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f70265 = {1782, -14366, -14346, -14345, -14356, -14372, -14352, -14348, -14358, -14345, -14368, -14357, -14372, -14345, -14357, -14362, -14354, -14362, -14372, -14348, -14358, -14345, -14357, -14372, -14352, -14342, -14352, -14345, -14362, -14354, -14345, -14357, -14362, -14354, -14362, -14372, -14361, -14366, -14351, -14360, 4173, -24866, -24886, -24885, -24880, -24864, -24884, -24888, -24874, -24885, -24868, -24873, -24864, -24885, -24873, -24870, -24878, -24870, -24864, -24888, -24874, -24885, -24873, -24864, -24884, -24890, -24884, -24885, -24870, -24878, -24885, -24873, -24870, -24878, -24870, -24864, -24869, -24866, -24883, -24876, 6475, 10012, 9992, 9993, 10002, 10018, 9998, 9994, 10004, 9993, 10014, 10005, 10018, 9993, 10005, 10008, 10000, 10008, 10018, 9994, 10004, 9993, 10005, 10018, 9998, 9988, 9998, 9993, 10008, 10000, 9993, 10005, 10008, 10000, 10008, 10018, 10009, 10012, 9999, 10006};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int f70266 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static int f70267 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static ColorStateList f70268 = null;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static int f70269 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static boolean f70270 = false;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static int f70271 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int f70272 = 0;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static ColorStateList f70273 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static int f70274 = 0;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static ColorStateList f70275 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f70276 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int f70277 = 0;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static boolean f70278 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f70279;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int f70280;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static int f70281;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int f70282;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f70283;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static int f70284;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static int f70285;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int f70286;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static int f70287;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f70288;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static RunnableC18664 f70289;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f70290;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static int f70291;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int f70292;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static int f70293;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int f70294;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static int f70295;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static int f70296;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f70297;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ColorStateList f70298;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static int f70299;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int f70300;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f70301;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int f70302;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int f70303;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static int f70304;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49429(Configuration configuration) {
        int i = 0;
        int i2 = 0;
        int i3 = -1991567965;
        int i4 = C5695.f17556;
        int i5 = C2520.f8000;
        int iM2566 = (i4 - C0630.m2566("۬᩵")) * 67;
        int i6 = ((iM2566 ^ i5) * (-6737)) ^ 1818980387;
        int i7 = 1680731695;
        while (true) {
            i3 = ((((i3 ^ i5) * (-17721)) >> 31) & i6) ^ (iM2566 ^ i7);
            switch (i3) {
                case -2105035005:
                case -1100189265:
                    RunnableC1108.m3790();
                    if (C0050.m940() > 0) {
                        iM2566 = (i4 - C2105.m6981("ۗܺ")) * (-105);
                        i6 = ((iM2566 ^ i5) * (-13235)) ^ (-1043873273);
                        i7 = -1917405121;
                    } else {
                        iM2566 = C0630.m2566("ۡۤ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 25655) ^ (-1650224147);
                        i7 = 132212412;
                    }
                    break;
                case -1981364897:
                case -1847985194:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C2105.m6981("᩻᩷") ^ i5) * 119;
                        i6 = ((iM2566 ^ i4) * 25537) ^ 1396433351;
                        i7 = -1390494991;
                    } else {
                        iM2566 = C0630.m2566("ۛ֡") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-20979)) ^ 1065036919;
                        i7 = 1014120829;
                    }
                    break;
                case -1816814785:
                case -1567966325:
                    if (C1047.m3599() >= 0) {
                        iM2566 = (i4 - C2105.m6981("ۗܺ")) * (-105);
                        i6 = ((iM2566 ^ i5) * (-13235)) ^ (-1043873273);
                        i7 = -1917405121;
                    } else {
                        iM2566 = C2105.m6981("ܽܰ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-24165)) ^ (-2016570971);
                        i7 = 2067424734;
                    }
                    break;
                case -1777491430:
                case -1719414897:
                    i2 = 48;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C2105.m6981("᩻᩷") ^ i5) * 119;
                        i6 = ((iM2566 ^ i4) * 25537) ^ 1396433351;
                        i7 = -1390494991;
                    } else {
                        iM2566 = C2105.m6981("᩸ۤ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 13479) ^ 702939523;
                        i7 = -1949688523;
                    }
                    break;
                case -1652044675:
                case 1948008186:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ۡۤ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 25655) ^ (-1650224147);
                        i7 = 132212412;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۬") ^ i5;
                        i6 = ((iM2566 ^ i4) * 23403) ^ 10786089;
                        i7 = -1353642149;
                    }
                    break;
                case -1489860434:
                case 391390026:
                    return false;
                case -1228145850:
                case 743927877:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (i4 - C2105.m6981("ۗܺ")) * (-105);
                        i6 = ((iM2566 ^ i5) * (-13235)) ^ (-1043873273);
                        i7 = -1917405121;
                    } else {
                        iM2566 = (C2105.m6981("ۤܳ") + i4) * (-73);
                        i6 = ((iM2566 ^ i5) * (-2641)) ^ (-1458788699);
                        i7 = -963699625;
                    }
                    break;
                case -1003307346:
                case -950116528:
                    if (C1773.m5908() <= 0) {
                        iM2566 = (C0630.m2566("᩹᩶") + i5) * (-21);
                        i6 = ((iM2566 ^ i4) * (-661)) ^ 848697355;
                        i7 = 2113356041;
                    } else {
                        iM2566 = (C0630.m2566("ܺۡ") ^ i5) * 29;
                        i6 = ((iM2566 ^ i4) * 12127) ^ (-1156748476);
                        i7 = 1930686924;
                    }
                    break;
                case -973907454:
                case 155956310:
                    return true;
                case -783959284:
                case -514382182:
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("᩻᩷") ^ i5) * 119;
                        i6 = ((iM2566 ^ i4) * 25537) ^ 1396433351;
                        i7 = -1390494991;
                    } else {
                        iM2566 = C2105.m6981("ۗ᩹") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-23161)) ^ (-682331399);
                        i7 = 711561605;
                    }
                    break;
                case -577185788:
                case 1896058693:
                    i = configuration.uiMode;
                    if (C1294.m4372() <= 0) {
                        iM2566 = C0630.m2566("ۡۤ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 25655) ^ (-1650224147);
                        i7 = 132212412;
                    } else {
                        iM2566 = C2105.m6981("֫֡") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-14039)) ^ 1578116254;
                        i7 = -1477243577;
                    }
                    break;
                case -155102542:
                case 1521722653:
                    C3911.m11924();
                    C0798.m2998();
                    return false;
                case 7204365:
                case 2061997799:
                    if ((i & i2) == 32) {
                        iM2566 = C2105.m6981("ܺ۬") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-3085)) ^ 694951831;
                        i7 = 683973799;
                    } else {
                        iM2566 = C2105.m6981("ܰܰ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 5873) ^ (-2084382409);
                        i7 = 748070650;
                    }
                    break;
                case 333945505:
                case 1203863113:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C0630.m2566("ۡۤ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 25655) ^ (-1650224147);
                        i7 = 132212412;
                    } else {
                        iM2566 = C2105.m6981("ᩳۘ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 15695) ^ 335675318;
                        i7 = 902529854;
                    }
                    break;
                case 512901288:
                case 1637141975:
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C0630.m2566("᩹᩶") + i5) * (-21);
                        i6 = ((iM2566 ^ i4) * (-661)) ^ 848697355;
                        i7 = 2113356041;
                    } else {
                        iM2566 = (C2105.m6981("ۛ֨") ^ i5) * (-11);
                        i6 = ((iM2566 ^ i4) * (-2235)) ^ 840899851;
                        i7 = 1981149586;
                    }
                    break;
                case 620166647:
                case 2111115063:
                    if (C3683.m11222()) {
                        iM2566 = (C2105.m6981("᩻᩷") ^ i5) * 119;
                        i6 = ((iM2566 ^ i4) * 25537) ^ 1396433351;
                        i7 = -1390494991;
                    } else {
                        iM2566 = (C2105.m6981("᩸ۜ") ^ i4) * 55;
                        i6 = ((iM2566 ^ i5) * (-20451)) ^ (-553334718);
                        i7 = -1750787550;
                    }
                    break;
                case 710350668:
                case 957027059:
                    if (C2105.f7037 == 0) {
                        iM2566 = C0630.m2566("ۡۤ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 25655) ^ (-1650224147);
                        i7 = 132212412;
                    } else {
                        iM2566 = (C0630.m2566("᩹᩶") + i5) * (-21);
                        i6 = ((iM2566 ^ i4) * (-661)) ^ 848697355;
                        i7 = 2113356041;
                    }
                    break;
                default:
                    C0422.m1963();
                    RunnableC1937.m6387();
                    iM2566 = (C0630.m2566("᩹᩶") + i5) * (-21);
                    i6 = ((iM2566 ^ i4) * (-661)) ^ 848697355;
                    i7 = 2113356041;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m49425(Object obj, Object obj2) {
        int i = 20131934;
        int i2 = C22628.f73083;
        int i3 = C0714.f2697;
        int iM2566 = (i3 - C0630.m2566("ܽۜ")) * 43;
        int i4 = ((iM2566 ^ i2) * (-6585)) ^ 1913356511;
        int i5 = -618945429;
        while (true) {
            i = ((((i ^ i2) * 59) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2128413146:
                case -275448348:
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        iM2566 = (C0630.m2566("᩹᩵") + i2) * (-9);
                        i4 = ((iM2566 ^ i3) * 19337) ^ (-871902044);
                        i5 = 1220009216;
                    } else {
                        iM2566 = (C0630.m2566("ۧۖ") + i3) * (-113);
                        i4 = ((iM2566 ^ i2) * 14389) ^ (-1084750762);
                        i5 = -676804576;
                    }
                    break;
                case -2120091295:
                case -528193512:
                    if (f70258) {
                        iM2566 = C2105.m6981("۠۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12211) ^ 1891733754;
                        i5 = -795485376;
                    } else {
                        iM2566 = C0630.m2566("ۛ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4841) ^ (-1538512008);
                        i5 = 1600945635;
                    }
                    break;
                case -2065266950:
                case -278532453:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("ۧۖ") + i3) * (-113);
                        i4 = ((iM2566 ^ i2) * 14389) ^ (-1084750762);
                        i5 = -676804576;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩷ۡ")) * 13;
                        i4 = ((iM2566 ^ i3) * 27583) ^ 1565409994;
                        i5 = 1770340804;
                    }
                    break;
                case -2055622623:
                case 1010380577:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C2105.m6981("ܺۚ") ^ i3) * (-45);
                        i4 = ((iM2566 ^ i2) * (-32261)) ^ 827933390;
                        i5 = 2060614049;
                    } else {
                        iM2566 = (i2 - C0630.m2566("۠۬")) * (-27);
                        i4 = ((iM2566 ^ i3) * (-13609)) ^ 1390810090;
                        i5 = -345890133;
                    }
                    break;
                case -1990997789:
                case -707258623:
                    if (C1504.f5354) {
                        iM2566 = (C2105.m6981("ܺۚ") ^ i3) * (-45);
                        i4 = ((iM2566 ^ i2) * (-32261)) ^ 827933390;
                        i5 = 2060614049;
                    } else {
                        iM2566 = (C0630.m2566("ۙۧ") ^ i3) * 15;
                        i4 = ((iM2566 ^ i2) * (-27483)) ^ (-902623373);
                        i5 = -438965849;
                    }
                    break;
                case -1939979733:
                case -1681264687:
                    if (C7811.m20844() != 0) {
                        iM2566 = (C2105.m6981("ܺۚ") ^ i3) * (-45);
                        i4 = ((iM2566 ^ i2) * (-32261)) ^ 827933390;
                        i5 = 2060614049;
                    } else {
                        iM2566 = C0630.m2566("ۡܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32073) ^ (-1084042603);
                        i5 = 1858842231;
                    }
                    break;
                case -1674523379:
                case 1583790494:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("ۧۖ") + i3) * (-113);
                        i4 = ((iM2566 ^ i2) * 14389) ^ (-1084750762);
                        i5 = -676804576;
                    } else {
                        iM2566 = (C0630.m2566("ۚ۬") + i2) * (-41);
                        i4 = ((iM2566 ^ i3) * Scalar25519.L4) ^ 890998616;
                        i5 = -985060782;
                    }
                    break;
                case -1169729032:
                case -646967664:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ܰۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24007) ^ 1732376483;
                        i5 = 1033178478;
                    } else {
                        iM2566 = (C0630.m2566("᩸᩷") + i3) * 11;
                        i4 = ((iM2566 ^ i2) * 7071) ^ 1373083880;
                        i5 = -219190609;
                    }
                    break;
                case -1153503850:
                case 1437923181:
                    if (C11340.m28031()) {
                        iM2566 = (i3 - C2105.m6981("᩸᩻")) * 49;
                        i4 = ((iM2566 ^ i2) * 28751) ^ (-433219036);
                        i5 = -1599008009;
                    } else {
                        iM2566 = C0630.m2566("ܰۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24007) ^ 1732376483;
                        i5 = 1033178478;
                    }
                    break;
                case -841468647:
                case 1381050121:
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C0630.m2566("ۧۖ") + i3) * (-113);
                        i4 = ((iM2566 ^ i2) * 14389) ^ (-1084750762);
                        i5 = -676804576;
                    } else {
                        iM2566 = C0630.m2566("ܰۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24007) ^ 1732376483;
                        i5 = 1033178478;
                    }
                    break;
                case -787170817:
                case -255681692:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("᩹᩵") + i2) * (-9);
                        i4 = ((iM2566 ^ i3) * 19337) ^ (-871902044);
                        i5 = 1220009216;
                    } else {
                        iM2566 = (C0630.m2566("۟ۜ") ^ i2) * 67;
                        i4 = ((iM2566 ^ i3) * (-6803)) ^ 1123873326;
                        i5 = -146882583;
                    }
                    break;
                case -717392858:
                case 142011940:
                    C0630.m2564();
                    C1773.m5908();
                    iM2566 = C0630.m2566("ۤۗ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 2647) ^ 64337234;
                    i5 = -78177911;
                    break;
                case -551412163:
                case 1591352669:
                    return obj;
                case -524220826:
                case -308520749:
                    if (C2520.m8026()) {
                        iM2566 = (C0630.m2566("᩹᩵") + i2) * (-9);
                        i4 = ((iM2566 ^ i3) * 19337) ^ (-871902044);
                        i5 = 1220009216;
                    } else {
                        iM2566 = C2105.m6981("ۖۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 19579) ^ (-1739067714);
                        i5 = 1616325455;
                    }
                    break;
                case -235431074:
                case 1964564455:
                    C0483.m2121();
                    return null;
                case -186889279:
                case -115553804:
                    C0714.m2805();
                    if (!C4159.f13567) {
                        iM2566 = C0630.m2566("ۤۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 2647) ^ 64337234;
                        i5 = -78177911;
                    } else {
                        iM2566 = C0630.m2566("ܰۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24007) ^ 1732376483;
                        i5 = 1033178478;
                    }
                    break;
                case 948577326:
                case 1787797617:
                    return obj2;
                default:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("ۤۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 2647) ^ 64337234;
                        i5 = -78177911;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۢ۟")) * (-125);
                        i4 = ((iM2566 ^ i2) * (-5029)) ^ (-1316597174);
                        i5 = 1929990852;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m49423(float f, float f2) {
        int i = -604610710;
        int i2 = C3537.f11231;
        int i3 = C0422.f1886;
        int iM6981 = C2105.m6981("ᩴ۠") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-683)) ^ (-2064153984);
        int i5 = 1887805599;
        while (true) {
            i = ((((i ^ i3) * 3637) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2095555508:
                case -540515738:
                    RunnableC1108.m3790();
                    C7106.m19120();
                    iM6981 = C0630.m2566("۠ۤ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 343) ^ (-361735229);
                    i5 = 1934630233;
                    break;
                case -1992225818:
                case -399046971:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C2105.m6981("ܶܿ") ^ i2) * (-15);
                        i4 = ((iM6981 ^ i3) * 29707) ^ 123151640;
                        i5 = 397878631;
                    } else {
                        iM6981 = C2105.m6981("ۡᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7415) ^ (-373881091);
                        i5 = 295008494;
                    }
                    break;
                case -1776670461:
                case 1906212642:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (i3 - C2105.m6981("۫۫")) * (-53);
                        i4 = ((iM6981 ^ i2) * (-16909)) ^ 453036533;
                        i5 = 2059581692;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22959) ^ 952638393;
                        i5 = 242327098;
                    }
                    break;
                case -1706779798:
                case 1416876737:
                    return f2;
                case -1607972539:
                case 1321385843:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C2105.m6981("ᩳۢ") + i3) * (-75);
                        i4 = ((iM6981 ^ i2) * 1119) ^ (-1315162297);
                        i5 = -1010869454;
                    } else {
                        iM6981 = (C2105.m6981("֡۫") ^ i3) * (-103);
                        i4 = ((iM6981 ^ i2) * 21035) ^ (-1058754154);
                        i5 = 1002217708;
                    }
                    break;
                case -1589668295:
                case -966586422:
                    if (C0382.f1805) {
                        iM6981 = (C0630.m2566("᩸ܿ") + i3) * 69;
                        i4 = ((iM6981 ^ i2) * 4359) ^ (-2008032691);
                        i5 = 1350511917;
                    } else {
                        iM6981 = C0630.m2566("۠ۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 343) ^ (-361735229);
                        i5 = 1934630233;
                    }
                    break;
                case -1582536908:
                case -502106966:
                    C1294.m4372();
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("ۤ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22959) ^ 952638393;
                        i5 = 242327098;
                    } else {
                        iM6981 = C0630.m2566("۠ۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 343) ^ (-361735229);
                        i5 = 1934630233;
                    }
                    break;
                case -1380299433:
                case 318818609:
                    C4159.m12565();
                    if (!C2167.m7155()) {
                        iM6981 = (C2105.m6981("ܶܿ") ^ i2) * (-15);
                        i4 = ((iM6981 ^ i3) * 29707) ^ 123151640;
                        i5 = 397878631;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22959) ^ 952638393;
                        i5 = 242327098;
                    }
                    break;
                case -1261586776:
                case -973921865:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C2105.m6981("ᩳۢ") + i3) * (-75);
                        i4 = ((iM6981 ^ i2) * 1119) ^ (-1315162297);
                        i5 = -1010869454;
                    } else {
                        iM6981 = C2105.m6981("ᩴ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5993) ^ (-1189783934);
                        i5 = 1630828959;
                    }
                    break;
                case -1070818538:
                case 1640960468:
                    if (C0964.f3626 != 0) {
                        iM6981 = (i3 - C2105.m6981("۫۫")) * (-53);
                        i4 = ((iM6981 ^ i2) * (-16909)) ^ 453036533;
                        i5 = 2059581692;
                    } else {
                        iM6981 = C0630.m2566("ۨ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12529) ^ 745387739;
                        i5 = -1515034791;
                    }
                    break;
                case -1028425185:
                case 1697290394:
                    if (C1294.f4556 >= 0) {
                        iM6981 = C2105.m6981("ۤ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22959) ^ 952638393;
                        i5 = 242327098;
                    } else {
                        iM6981 = C0630.m2566("ۢܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6907)) ^ 1211851791;
                        i5 = 1702127225;
                    }
                    break;
                case 123701098:
                case 1825051707:
                    if (f70258) {
                        iM6981 = (C0630.m2566("֫᩶") + i3) * (-59);
                        i4 = ((iM6981 ^ i2) * (-18663)) ^ 816424097;
                        i5 = 2031211469;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۘܰ")) * (-57);
                        i4 = ((iM6981 ^ i3) * 19249) ^ 458517060;
                        i5 = 428787935;
                    }
                    break;
                case 617692135:
                case 2044461875:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("ۤ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22959) ^ 952638393;
                        i5 = 242327098;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۢܶ")) * 21;
                        i4 = ((iM6981 ^ i3) * 27289) ^ (-1764504332);
                        i5 = 1550675430;
                    }
                    break;
                case 948512017:
                case 1794913046:
                    return f;
                case 1013483334:
                case 1807450716:
                    C3746.m11369();
                    C1773.m5908();
                    return 0.0f;
                case 1388151843:
                case 1946917790:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i3 - C2105.m6981("۫۫")) * (-53);
                        i4 = ((iM6981 ^ i2) * (-16909)) ^ 453036533;
                        i5 = 2059581692;
                    } else {
                        iM6981 = C0630.m2566("ᩳۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11211) ^ 751392432;
                        i5 = 2044244034;
                    }
                    break;
                case 1752597512:
                case 2084066859:
                    if (C3663.f11553) {
                        iM6981 = (C2105.m6981("ᩳۢ") + i3) * (-75);
                        i4 = ((iM6981 ^ i2) * 1119) ^ (-1315162297);
                        i5 = -1010869454;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩺ۢ")) * 39;
                        i4 = ((iM6981 ^ i2) * (-11677)) ^ 1255165822;
                        i5 = -1483666764;
                    }
                    break;
                default:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("ۤ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22959) ^ 952638393;
                        i5 = 242327098;
                    } else {
                        iM6981 = C0630.m2566("۬ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1933) ^ (-896328415);
                        i5 = -1619300799;
                    }
                    break;
            }
        }
    }

    static {
        int i = 0;
        ColorStateList colorStateListValueOf = null;
        int i2 = -709464373;
        int i3 = C4117.f13076;
        int i4 = C4075.f12947;
        int iM2566 = (C0630.m2566("۫ܰ") ^ i3) * (-11);
        int i5 = ((iM2566 ^ i4) * 17681) ^ (-661915943);
        int i6 = 689191842;
        while (true) {
            i2 = ((((i2 ^ i4) * 595) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2089829331:
                case -1226765724:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("᩸ۢ") + i4) * 89;
                        i5 = ((iM2566 ^ i3) * 4611) ^ (-615549542);
                        i6 = 1204955308;
                    } else {
                        iM2566 = C0630.m2566("ۙ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-10457)) ^ 1333168818;
                        i6 = 224949337;
                    }
                    break;
                case -1982225923:
                case 1093527377:
                    if (C2958.m9034() <= 0) {
                        iM2566 = C2105.m6981("ۙۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7295) ^ 1592718696;
                        i6 = -534230045;
                    } else {
                        iM2566 = C2105.m6981("۫ۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 2449) ^ 2122836832;
                        i6 = 716644436;
                    }
                    break;
                case -1972480409:
                case 100771960:
                    C3683.m11222();
                    C7811.m20844();
                    iM2566 = C0630.m2566("ۙ᩸") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-10457)) ^ 1333168818;
                    i6 = 224949337;
                    break;
                case -1821000687:
                case -669825279:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C0630.m2566("ۙ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-10457)) ^ 1333168818;
                        i6 = 224949337;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܶܽ")) * (-97);
                        i5 = ((iM2566 ^ i3) * (-32349)) ^ 1469982666;
                        i6 = 1465342112;
                    }
                    break;
                case -1670343212:
                case -1265989515:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("ܶܿ") ^ i3) * (-43);
                        i5 = ((iM2566 ^ i4) * (-19611)) ^ (-732404754);
                        i6 = 200454474;
                    } else {
                        iM2566 = (C0630.m2566("᩵۫") + i4) * (-121);
                        i5 = ((iM2566 ^ i3) * (-5343)) ^ (-779152791);
                        i6 = -901757741;
                    }
                    break;
                case -1548089067:
                case 1095136567:
                    f70298 = ColorStateList.valueOf(i);
                    return;
                case -1524596377:
                case 1536346556:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C2105.m6981("ۙۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7295) ^ 1592718696;
                        i6 = -534230045;
                    } else {
                        iM2566 = C2105.m6981("ᩴ᩵") ^ i3;
                        i5 = ((iM2566 ^ i4) * 15395) ^ (-72683243);
                        i6 = 545416201;
                    }
                    break;
                case -1475769187:
                case 42137135:
                    f70268 = colorStateListValueOf;
                    if (C0382.f1805) {
                        iM2566 = C2105.m6981("ۖ֡") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-7061)) ^ (-454457378);
                        i6 = 395261467;
                    } else {
                        iM2566 = C2105.m6981("ۙۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7295) ^ 1592718696;
                        i6 = -534230045;
                    }
                    break;
                case -1327381659:
                case 633954692:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C2105.m6981("ۙۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7295) ^ 1592718696;
                        i6 = -534230045;
                    } else {
                        iM2566 = C2105.m6981("ᩳܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 1135) ^ 962510314;
                        i6 = -741678268;
                    }
                    break;
                case -794054717:
                case 1817037128:
                    i = 0;
                    colorStateListValueOf = ColorStateList.valueOf(0);
                    if (C2126.f7087) {
                        iM2566 = (C0630.m2566("ܶܿ") ^ i3) * (-43);
                        i5 = ((iM2566 ^ i4) * (-19611)) ^ (-732404754);
                        i6 = 200454474;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۜۙ")) * (-39);
                        i5 = ((iM2566 ^ i4) * (-11381)) ^ 273643895;
                        i6 = 1528460622;
                    }
                    break;
                case 364370048:
                case 1984475183:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C0630.m2566("᩸ۢ") + i4) * 89;
                        i5 = ((iM2566 ^ i3) * 4611) ^ (-615549542);
                        i6 = 1204955308;
                    } else {
                        iM2566 = C0630.m2566("᩻ۛ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-3265)) ^ 1800197221;
                        i6 = 48271311;
                    }
                    break;
                case 617495355:
                case 790295390:
                    C1294.m4372();
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C0630.m2566("ܶܿ") ^ i3) * (-43);
                        i5 = ((iM2566 ^ i4) * (-19611)) ^ (-732404754);
                        i6 = 200454474;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۛ") + i4) * (-91);
                        i5 = ((iM2566 ^ i3) * 4239) ^ 1274598848;
                        i6 = 202701681;
                    }
                    break;
                case 878496820:
                case 1742383308:
                    if (C0050.m940() > 0) {
                        iM2566 = (C2105.m6981("᩵ۛ") + i4) * (-91);
                        i5 = ((iM2566 ^ i3) * 4239) ^ 1274598848;
                        i6 = 202701681;
                    } else {
                        iM2566 = C0630.m2566("ۙ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-10457)) ^ 1333168818;
                        i6 = 224949337;
                    }
                    break;
                case 923993628:
                case 2088658877:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = C2105.m6981("ۙۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7295) ^ 1592718696;
                        i6 = -534230045;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۧᩳ")) * (-47);
                        i5 = ((iM2566 ^ i3) * 18009) ^ (-1132837966);
                        i6 = 1200758345;
                    }
                    break;
                case 1537278017:
                case 1658210995:
                    C3746.m11369();
                    throw new RuntimeException();
                default:
                    if (C3019.f9544 >= 0) {
                        iM2566 = C2105.m6981("ۙۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7295) ^ 1592718696;
                        i6 = -534230045;
                    } else {
                        iM2566 = C2105.m6981("۠ۘ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 28693) ^ 240996355;
                        i6 = -1898314146;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49424(int i, int i2) {
        int i3 = 615770493;
        int i4 = C1128.f4106;
        int i5 = C1773.f6144;
        int iM6981 = C2105.m6981("ۛ᩺") ^ i4;
        int i6 = ((iM6981 ^ i5) * (-24277)) ^ (-1750601624);
        int i7 = 1256168892;
        while (true) {
            i3 = ((((i3 ^ i5) * (-6899)) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -1978162156:
                case 367575459:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("ۚܺ") + i5) * (-125);
                        i6 = ((iM6981 ^ i4) * 25335) ^ 1043616422;
                        i7 = 116524281;
                    } else {
                        iM6981 = (i5 - C2105.m6981("۟᩸")) * 99;
                        i6 = ((iM6981 ^ i4) * 32289) ^ (-551707148);
                        i7 = 111821999;
                    }
                    break;
                case -1938696446:
                case -1596613640:
                    return i;
                case -1932002150:
                case 598180604:
                    return i2;
                case -1858136005:
                case 736749883:
                    C2126.m7040();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6981 = C0630.m2566("֨᩸") ^ i5;
                        i6 = ((iM6981 ^ i4) * 27631) ^ 709999122;
                        i7 = 1518632128;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۡ֡")) * 119;
                        i6 = ((iM6981 ^ i5) * (-24105)) ^ (-571839592);
                        i7 = -1438571762;
                    }
                    break;
                case -1844717626:
                case 1949947110:
                    C1504.m5179();
                    if (C0050.f910 < 0) {
                        iM6981 = (i4 - C2105.m6981("ۡ֡")) * 119;
                        i6 = ((iM6981 ^ i5) * (-24105)) ^ (-571839592);
                        i7 = -1438571762;
                    } else {
                        iM6981 = C2105.m6981("ܶ֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-5895)) ^ 1965231247;
                        i7 = -65793397;
                    }
                    break;
                case -1249226297:
                case 810827938:
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("֨᩸") ^ i5;
                        i6 = ((iM6981 ^ i4) * 27631) ^ 709999122;
                        i7 = 1518632128;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۘ۟")) * (-115);
                        i6 = ((iM6981 ^ i4) * 22137) ^ (-1356144794);
                        i7 = 2051916800;
                    }
                    break;
                case -1214026617:
                case 1350211262:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ۡ֡")) * 119;
                        i6 = ((iM6981 ^ i5) * (-24105)) ^ (-571839592);
                        i7 = -1438571762;
                    } else {
                        iM6981 = C0630.m2566("ܽۜ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-25939)) ^ (-252828335);
                        i7 = 140688776;
                    }
                    break;
                case -1005134456:
                case 1113289867:
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C2105.m6981("ۚܺ") + i5) * (-125);
                        i6 = ((iM6981 ^ i4) * 25335) ^ 1043616422;
                        i7 = 116524281;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܳ᩺")) * (-55);
                        i6 = ((iM6981 ^ i5) * 31083) ^ 1344787754;
                        i7 = -62547940;
                    }
                    break;
                case -760637880:
                case 1848506228:
                    C21923.m49329();
                    C4075.m12263();
                    return 0;
                case -678269195:
                case 592407338:
                    if (C3537.f11231 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۡ֡")) * 119;
                        i6 = ((iM6981 ^ i5) * (-24105)) ^ (-571839592);
                        i7 = -1438571762;
                    } else {
                        iM6981 = C0630.m2566("֡ۢ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 26169) ^ (-87178350);
                        i7 = 895229541;
                    }
                    break;
                case 340394744:
                case 1953441907:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۡ֡")) * 119;
                        i6 = ((iM6981 ^ i5) * (-24105)) ^ (-571839592);
                        i7 = -1438571762;
                    } else {
                        iM6981 = (C2105.m6981("ۨۗ") ^ i4) * (-65);
                        i6 = ((iM6981 ^ i5) * (-24889)) ^ (-1756737862);
                        i7 = -454819783;
                    }
                    break;
                case 444541680:
                case 997559101:
                    C0382.m1848();
                    C0050.m940();
                    iM6981 = C2105.m6981("ܶ֫") ^ i5;
                    i6 = ((iM6981 ^ i4) * (-5895)) ^ 1965231247;
                    i7 = -65793397;
                    break;
                case 467782386:
                case 1815864135:
                    if (C0382.m1848()) {
                        iM6981 = C2105.m6981("ܶ֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-5895)) ^ 1965231247;
                        i7 = -65793397;
                    } else {
                        iM6981 = C0630.m2566("ܺܶ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 31261) ^ 1042317407;
                        i7 = -1123110605;
                    }
                    break;
                case 555522134:
                case 2063771299:
                    if (C1005.m3501()) {
                        iM6981 = (i4 - C2105.m6981("ۜܺ")) * 75;
                        i6 = ((iM6981 ^ i5) * 17693) ^ (-175188945);
                        i7 = -193300070;
                    } else {
                        iM6981 = C2105.m6981("ۡ᩵") ^ i4;
                        i6 = ((iM6981 ^ i5) * 18745) ^ (-905095049);
                        i7 = 871457601;
                    }
                    break;
                case 652163905:
                case 1027922365:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C2105.m6981("ۚܺ") + i5) * (-125);
                        i6 = ((iM6981 ^ i4) * 25335) ^ 1043616422;
                        i7 = 116524281;
                    } else {
                        iM6981 = C0630.m2566("۫ۛ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-12905)) ^ 1286561559;
                        i7 = 1001543989;
                    }
                    break;
                case 859210669:
                case 1949269848:
                    if (f70258) {
                        iM6981 = C2105.m6981("۫۟") ^ i4;
                        i6 = ((iM6981 ^ i5) * 2633) ^ 191683008;
                        i7 = -1471069852;
                    } else {
                        iM6981 = C0630.m2566("ۧܳ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 11069) ^ 1633543980;
                        i7 = 219823654;
                    }
                    break;
                case 1316631020:
                case 1589181654:
                    C0798.m2998();
                    if (C4263.f13799 > 0) {
                        iM6981 = C2105.m6981("ۡ᩵") ^ i4;
                        i6 = ((iM6981 ^ i5) * 18745) ^ (-905095049);
                        i7 = 871457601;
                    } else {
                        iM6981 = C2105.m6981("ܶ֫") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-5895)) ^ 1965231247;
                        i7 = -65793397;
                    }
                    break;
                default:
                    if (C1294.m4372() <= 0) {
                        iM6981 = C0630.m2566("֨᩸") ^ i5;
                        i6 = ((iM6981 ^ i4) * 27631) ^ 709999122;
                        i7 = 1518632128;
                    } else {
                        iM6981 = (C2105.m6981("ۨۛ") ^ i5) * 23;
                        i6 = ((iM6981 ^ i4) * 24725) ^ 1313719022;
                        i7 = -2069325836;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0154 A[PHI: r9
      0x0154: PHI (r9v4 l.ᩴۡ᩷) = (r9v2 l.ᩴۡ᩷), (r9v3 l.ᩴۡ᩷), (r9v2 l.ᩴۡ᩷) binds: [B:38:0x013a, B:25:0x00bf, B:22:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02de A[PHI: r16 r21 r22 r26
      0x02de: PHI (r16v3 int) = (r16v2 int), (r16v4 int) binds: [B:75:0x02dc, B:71:0x02bb] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r21v4 int) = (r21v3 int), (r21v2 int) binds: [B:75:0x02dc, B:71:0x02bb] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r22v3 int) = (r22v2 int), (r22v4 int) binds: [B:75:0x02dc, B:71:0x02bb] A[DONT_GENERATE, DONT_INLINE]
      0x02de: PHI (r26v7 short[]) = (r26v6 short[]), (r26v8 short[]) binds: [B:75:0x02dc, B:71:0x02bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x031a A[PHI: r1 r13 r19 r27
      0x031a: PHI (r1v3 android.content.SharedPreferences) = 
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v6 android.content.SharedPreferences)
     binds: [B:80:0x0318, B:9:0x007c, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x031a: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v6 int) binds: [B:80:0x0318, B:9:0x007c, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x031a: PHI (r19v5 short) = (r19v3 short), (r19v2 short), (r19v2 short) binds: [B:80:0x0318, B:9:0x007c, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x031a: PHI (r27v33 short[]) = (r27v13 short[]), (r27v3 short[]), (r27v36 short[]) binds: [B:80:0x0318, B:9:0x007c, B:6:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0086, code lost:
    
        if (l.RunnableC1937.m6387() == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        if (l.C2126.f7087 != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m49426() {
        short[] sArr;
        short[] sArr2;
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        boolean zM12818;
        ?? r8;
        ?? r9;
        int i4 = C5695.f17556;
        int i5 = C11340.f33930;
        int iM2568 = (C0630.m2566("᩻۟") + i4) * (-83);
        int i6 = ((iM2568 ^ i5) * 20897) ^ (-1785943696);
        String strM50602 = null;
        String strM3841 = null;
        InterfaceC13049 interfaceC13049M6438 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i7 = iM2568 ^ 480619869;
        SharedPreferences sharedPreferences = null;
        boolean z = false;
        boolean zM8023 = false;
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1750443227;
        short[] sArr5 = null;
        RunnableC18664 runnableC18664 = null;
        ?? r10 = 0;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i5) * 14707) >> 31));
            switch (i15) {
                case -2143881956:
                case -1553757069:
                    C0630.m2564();
                    break;
                case -2103797262:
                case 933905647:
                    i8 = 51075;
                    int iM6981 = C2105.m6981("ᩳۖ") ^ i4;
                    i6 = ((iM6981 ^ i5) * (-23615)) ^ 661119505;
                    sArr3 = sArr3;
                    i7 = iM6981 ^ (-864753311);
                    break;
                case -2050738807:
                case -1515613743:
                    f70258 = z2;
                    interfaceC13049M6438 = ViewOnClickListenerC1958.m6438(C4925.f15527);
                    if (C3432.f10845 < 0) {
                        iM2567 = (C0630.m2566("᩺᩷") + i5) * (-83);
                        i = ((iM2567 ^ i4) * 13521) ^ (-1032153400);
                        i3 = -127884369;
                        r9 = r10;
                        i7 = iM2567 ^ i3;
                        r10 = r9;
                        i6 = i;
                    }
                    sArr2 = sArr3;
                    iM2566 = (C0630.m2566("ܿ۠") ^ i5) * (-71);
                    i = ((iM2566 ^ i4) * (-19431)) ^ 340188541;
                    i2 = -440600194;
                    int i16 = iM2566 ^ i2;
                    sArr3 = sArr2;
                    i7 = i16;
                    r10 = r10;
                    i6 = i;
                    break;
                case -1839392887:
                case -1103812362:
                    sArr2 = sArr3;
                    i14 = s2 * 2;
                    i12 = 1;
                    if (C2167.f7158 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ܳ᩸")) * 119;
                        i = ((iM2566 ^ i5) * 28557) ^ 1389976597;
                        i2 = -1361064847;
                    } else {
                        iM2566 = C0630.m2566("ۚۧ") ^ i5;
                        i = ((iM2566 ^ i4) * 18441) ^ (-692097740);
                        i2 = 1683630588;
                    }
                    int i17 = iM2566 ^ i2;
                    sArr3 = sArr2;
                    i7 = i17;
                    r10 = r10;
                    i6 = i;
                    break;
                case -1747407633:
                case -1158434744:
                    strM3841 = C1128.m3841(sArr4, i11, 10, i8);
                    if (zM8023) {
                        iM2567 = C2105.m6981("ᩳ᩻") ^ i5;
                        i = ((iM2567 ^ i4) * 14249) ^ (-231304492);
                        i3 = 2023099256;
                        r9 = r10;
                    } else {
                        iM2567 = C2105.m6981("ܺۨ") ^ i4;
                        i = ((iM2567 ^ i5) * 27751) ^ (-933681128);
                        i3 = -1382306145;
                        r9 = r10;
                    }
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
                case -1491195840:
                case -353095473:
                    C2958.m9034();
                    if (C2105.m6982() == 0) {
                        iM2567 = C0630.m2566("֡۟") ^ i5;
                        i = ((iM2567 ^ i4) * (-29421)) ^ (-982314112);
                        i3 = 2001280529;
                        r9 = r10;
                    } else {
                        iM2567 = C0630.m2566("ܿ᩷") ^ i5;
                        i = ((iM2567 ^ i4) * (-10979)) ^ (-85021906);
                        i3 = -1283370989;
                        r9 = r10;
                    }
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
                case -1396743636:
                case 1747199747:
                    zM12818 = f70278;
                    z2 = zM12818;
                    iM2567 = C0630.m2566("ᩳ֫") ^ i4;
                    i = ((iM2567 ^ i5) * (-15023)) ^ (-6372784);
                    i3 = 99234646;
                    r9 = r10;
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
                case -1390211544:
                case 677441074:
                    AbstractC13246.m32143(r10);
                    runnableC18664 = f70289;
                    if (runnableC18664 != null) {
                        iM2567 = C2105.m6981("ܳ֫") ^ i4;
                        i = ((iM2567 ^ i5) * (-13945)) ^ (-2068312616);
                        i3 = -164329220;
                        r9 = r10;
                    } else {
                        iM2567 = (i5 - C0630.m2566("۟۟")) * (-109);
                        i = ((iM2567 ^ i4) * 8269) ^ 2053085863;
                        i3 = 1502767650;
                        r9 = r10;
                    }
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
                case -1367927152:
                case -853396118:
                    C7106.m19107(C4616.m13549(interfaceC13049M6438, strM3841, f70258));
                    if (z2) {
                        iM2567 = (C0630.m2566("ۨ᩹") ^ i5) * (-69);
                        i = ((iM2567 ^ i4) * 9211) ^ 1057138096;
                        i3 = 606242629;
                        r9 = r10;
                    } else {
                        r8 = z;
                        iM2567 = C0630.m2566("֡۬") ^ i4;
                        i = ((iM2567 ^ i5) * (-2937)) ^ 1058225690;
                        i3 = 1075092244;
                        r9 = r8;
                    }
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
                case -1334782579:
                case 20501999:
                    sArr2 = sArr3;
                    if ((i14 + i12) - i13 > 0) {
                        iM2566 = (i5 - C2105.m6981("ۤۙ")) * (-93);
                        i = ((iM2566 ^ i4) * 16515) ^ (-1478674037);
                        i2 = 276362019;
                    } else {
                        iM2566 = C0630.m2566("᩻۬") ^ i4;
                        i = ((iM2566 ^ i5) * 13977) ^ 919689783;
                        i2 = -627155095;
                    }
                    int i18 = iM2566 ^ i2;
                    sArr3 = sArr2;
                    i7 = i18;
                    r10 = r10;
                    i6 = i;
                    break;
                case -1294554429:
                case -46270231:
                    sArr = sArr3;
                    strM50602 = C22628.m50602(sArr, i10, i9, i8);
                    if (C1294.f4556 >= 0) {
                        z = true;
                        sArr2 = sArr;
                        iM2566 = C2105.m6981("᩵᩶") ^ i4;
                        i = ((iM2566 ^ i5) * 10577) ^ 115629166;
                        i2 = -997658864;
                        int i19 = iM2566 ^ i2;
                        sArr3 = sArr2;
                        i7 = i19;
                        r10 = r10;
                        i6 = i;
                    } else {
                        int iM2569 = C0630.m2566("ۘ᩺") ^ i5;
                        sArr3 = sArr;
                        i6 = ((iM2569 ^ i4) * (-24011)) ^ 225585816;
                        i7 = iM2569 ^ 891535072;
                        z = true;
                    }
                    break;
                case -1232630795:
                case 1492714497:
                    sArr2 = sArr3;
                    int i20 = s2 + s;
                    i13 = i20 * i20;
                    if (C2167.f7158 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ܳ᩸")) * 119;
                        i = ((iM2566 ^ i5) * 28557) ^ 1389976597;
                        i2 = -1361064847;
                    } else {
                        iM2566 = (C2105.m6981("ܳ֨") ^ i5) * (-67);
                        i = ((iM2566 ^ i4) * 8081) ^ 7891213;
                        i2 = -359420532;
                    }
                    int i110 = iM2566 ^ i2;
                    sArr3 = sArr2;
                    i7 = i110;
                    r10 = r10;
                    i6 = i;
                    break;
                case -1178409674:
                case -201817098:
                    break;
                case -1104117148:
                case -845647125:
                    C3911.m11924();
                    iM2567 = C0630.m2566("֡۟") ^ i5;
                    i = ((iM2567 ^ i4) * (-29421)) ^ (-982314112);
                    i3 = 2001280529;
                    r9 = r10;
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
                case -1019318430:
                case 700219878:
                    break;
                case -814281492:
                case 602748628:
                    sArr = sArr3;
                    if (C0630.m2564()) {
                        i9 = 29;
                        sArr2 = sArr;
                        iM2566 = C2105.m6981("᩵᩶") ^ i4;
                        i = ((iM2566 ^ i5) * 10577) ^ 115629166;
                        i2 = -997658864;
                        int i111 = iM2566 ^ i2;
                        sArr3 = sArr2;
                        i7 = i111;
                        r10 = r10;
                        i6 = i;
                    } else {
                        int iM25610 = C0630.m2566("ۧܶ") ^ i4;
                        sArr3 = sArr;
                        i7 = iM25610 ^ 269092241;
                        i6 = ((iM25610 ^ i5) * 12429) ^ 1102488926;
                        i9 = 29;
                    }
                    break;
                case -794278480:
                case 419757988:
                    sArr2 = sArr3;
                    s2 = sArr5[c];
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("᩵᩶") ^ i4;
                        i = ((iM2566 ^ i5) * 10577) ^ 115629166;
                        i2 = -997658864;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۜ") ^ i5) * 49;
                        i = ((iM2566 ^ i4) * 26349) ^ (-1872367051);
                        i2 = -255262986;
                    }
                    int i112 = iM2566 ^ i2;
                    sArr3 = sArr2;
                    i7 = i112;
                    r10 = r10;
                    i6 = i;
                    break;
                case -519473282:
                case 992134523:
                    zM8023 = C2520.m8023(sharedPreferences, strM50602, z);
                    sArr4 = f70265;
                    i11 = 30;
                    if (C2167.f7158 < 0) {
                        iM2567 = C0630.m2566("ۚ۫") ^ i4;
                        i = ((iM2567 ^ i5) * (-19729)) ^ 351138433;
                        i3 = 2062505961;
                        r9 = r10;
                        i7 = iM2567 ^ i3;
                        r10 = r9;
                        i6 = i;
                    }
                    sArr2 = sArr3;
                    iM2566 = C2105.m6981("᩵᩶") ^ i4;
                    i = ((iM2566 ^ i5) * 10577) ^ 115629166;
                    i2 = -997658864;
                    int i113 = iM2566 ^ i2;
                    sArr3 = sArr2;
                    i7 = i113;
                    r10 = r10;
                    i6 = i;
                    break;
                case -388093287:
                case 223281450:
                    if (z2 != f70258) {
                        iM2567 = (C0630.m2566("ܰۜ") + i4) * 29;
                        i = ((iM2567 ^ i5) * (-28441)) ^ 408325077;
                        i3 = 1520212958;
                        r9 = r10;
                    } else {
                        iM2567 = (i5 - C0630.m2566("۟۟")) * (-109);
                        i = ((iM2567 ^ i4) * 8269) ^ 2053085863;
                        i3 = 1502767650;
                        r9 = r10;
                    }
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
                case -214395036:
                case 1796643261:
                    sArr2 = sArr3;
                    s = 1;
                    if (!C1504.m5179()) {
                        sArr3 = sArr2;
                        iM2567 = C0630.m2566("ܿ᩷") ^ i5;
                        i = ((iM2567 ^ i4) * (-10979)) ^ (-85021906);
                        i3 = -1283370989;
                        r9 = r10;
                        i7 = iM2567 ^ i3;
                        r10 = r9;
                        i6 = i;
                    } else {
                        iM2566 = (C0630.m2566("۟ۤ") ^ i4) * 87;
                        i = ((iM2566 ^ i5) * 26457) ^ 769371398;
                        i2 = 679543435;
                        int i114 = iM2566 ^ i2;
                        sArr3 = sArr2;
                        i7 = i114;
                        r10 = r10;
                        i6 = i;
                    }
                    break;
                case -205820130:
                case 1739295799:
                    C1711.m5736();
                    break;
                case -195995366:
                case 1244910962:
                    r8 = 2;
                    iM2567 = C0630.m2566("֡۬") ^ i4;
                    i = ((iM2567 ^ i5) * (-2937)) ^ 1058225690;
                    i3 = 1075092244;
                    r9 = r8;
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
                case -58251626:
                case 2081705403:
                    i8 = 62267;
                    int iM6982 = C2105.m6981("ᩳۖ") ^ i4;
                    i6 = ((iM6982 ^ i5) * (-23615)) ^ 661119505;
                    sArr3 = sArr3;
                    i7 = iM6982 ^ (-864753311);
                    break;
                case 179408482:
                case 1467506673:
                    sArr2 = sArr3;
                    sArr5 = f70265;
                    c = 0;
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("ܿ۠") ^ i5) * (-71);
                        i = ((iM2566 ^ i4) * (-19431)) ^ 340188541;
                        i2 = -440600194;
                    } else {
                        iM2566 = C0630.m2566("᩺᩻") ^ i4;
                        i = ((iM2566 ^ i5) * (-27985)) ^ (-1055001950);
                        i2 = 1033644710;
                    }
                    int i115 = iM2566 ^ i2;
                    sArr3 = sArr2;
                    i7 = i115;
                    r10 = r10;
                    i6 = i;
                    break;
                case 453201011:
                case 762109902:
                    runnableC18664.run();
                    iM2567 = (i5 - C0630.m2566("۟۟")) * (-109);
                    i = ((iM2567 ^ i4) * 8269) ^ 2053085863;
                    i3 = 1502767650;
                    r9 = r10;
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
                case 517773501:
                case 1085040678:
                    zM12818 = C4263.m12818(C4925.f15527, strM3841, false);
                    z2 = zM12818;
                    iM2567 = C0630.m2566("ᩳ֫") ^ i4;
                    i = ((iM2567 ^ i5) * (-15023)) ^ (-6372784);
                    i3 = 99234646;
                    r9 = r10;
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
                default:
                    sharedPreferences = C4925.f15523;
                    sArr3 = f70265;
                    i10 = 1;
                    if (C21923.f70183 != 0) {
                        iM2567 = C0630.m2566("ܿ᩷") ^ i5;
                        i = ((iM2567 ^ i4) * (-10979)) ^ (-85021906);
                        i3 = -1283370989;
                        r9 = r10;
                    } else {
                        iM2567 = C2105.m6981("ۧۜ") ^ i5;
                        i = ((iM2567 ^ i4) * 17877) ^ 2122854702;
                        i3 = -137900739;
                        r9 = r10;
                    }
                    i7 = iM2567 ^ i3;
                    r10 = r9;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49428(RunnableC18664 runnableC18664) {
        f70289 = runnableC18664;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49432(Configuration configuration, int i) {
        int iM6981;
        int i2;
        boolean zM49429 = false;
        boolean z = false;
        boolean z2 = false;
        boolean zM494210 = false;
        int i3 = -2114962298;
        int i4 = C1773.f6144;
        int i5 = C0630.f2410;
        int iM2566 = C0630.m2566("᩻ۚ") ^ i4;
        int i6 = ((iM2566 ^ i5) * 31913) ^ 1694414822;
        int i7 = 675451552;
        while (true) {
            int i8 = iM2566 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * 14889) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2090840317:
                    case 868317553:
                        zM49429 = m49429(configuration);
                        if (C1294.m4372() > 0) {
                            iM2566 = (i5 - C0630.m2566("ۜۨ")) * 23;
                            i6 = ((iM2566 ^ i4) * 13769) ^ 1102010600;
                            i7 = 480003380;
                            break;
                        }
                        iM2566 = C2105.m6981("᩺ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 22225) ^ (-1460000525);
                        i7 = -626562194;
                        break;
                    case -1856679335:
                    case 1369728339:
                        if (!C0382.f1805) {
                            iM2566 = C0630.m2566("֨ۨ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-29731)) ^ 375278165;
                            i7 = 328099335;
                            break;
                        }
                        iM2566 = C2105.m6981("᩹ܿ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-18727)) ^ 1969759461;
                        i7 = -1331894854;
                        break;
                    case -1836692644:
                    case 1283627061:
                        RunnableC1937.m6387();
                        C3019.m9255();
                        iM2566 = C0630.m2566("᩸᩶") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-14897)) ^ 1715751786;
                        i7 = -392336574;
                        break;
                    case -1789854340:
                    case 667749786:
                        if (i == z2) {
                            iM2566 = C2105.m6981("۬ۛ") ^ i4;
                            i6 = ((iM2566 ^ i5) * 8737) ^ (-24357591);
                            i7 = 320770833;
                            break;
                        }
                        iM2566 = (C2105.m6981("ۚۖ") + i5) * (-127);
                        i6 = ((iM2566 ^ i4) * (-9191)) ^ (-297147505);
                        i7 = -1473637767;
                        break;
                    case -1727734917:
                    case -1474540319:
                        if (C0237.f1507 == 0) {
                            iM2566 = C0630.m2566("ܶ۬") ^ i5;
                            i6 = ((iM2566 ^ i4) * 10503) ^ (-1831558048);
                            i7 = 185887843;
                            break;
                        }
                        iM2566 = C0630.m2566("᩸᩶") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-14897)) ^ 1715751786;
                        i7 = -392336574;
                        break;
                        break;
                    case -1641889878:
                    case -884587863:
                        if (C4075.m12263() > 0) {
                            iM2566 = C0630.m2566("᩵ᩴ") ^ i5;
                            i6 = ((iM2566 ^ i4) * 11077) ^ (-1622626580);
                            i7 = 241915065;
                            break;
                        }
                        iM2566 = (C0630.m2566("ܺ᩷") + i5) * (-7);
                        i6 = ((iM2566 ^ i4) * 26801) ^ 2035626276;
                        i7 = 396677367;
                        break;
                    case -1510931326:
                    case -1305556230:
                        RunnableC0588.m2441();
                        return false;
                    case -1468263871:
                    case 937522632:
                        zM494210 = f70258;
                        iM2566 = (C2105.m6981("ᩳۘ") + i5) * (-31);
                        i6 = ((iM2566 ^ i4) * (-11767)) ^ 1101077018;
                        i7 = -1087474251;
                        break;
                    case -1444504581:
                    case -624944352:
                        if (i == 2) {
                            iM2566 = C0630.m2566("ܶۧ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-9425)) ^ (-928532782);
                            i7 = 1403295763;
                            break;
                        }
                        iM2566 = C0630.m2566("ۢۙ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 13991) ^ 461649816;
                        i7 = 425510921;
                        break;
                    case -1157587682:
                    case 102799681:
                        if (zM49429 != zM494210) {
                            iM2566 = C2105.m6981("᩸ۙ") ^ i4;
                            i6 = ((iM2566 ^ i5) * 6761) ^ (-1762249965);
                            i7 = 1659944374;
                            break;
                        }
                        iM2566 = C0630.m2566("ܰۗ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 671) ^ 2125312631;
                        i7 = 303585196;
                        break;
                    case -1027139445:
                    case 1280239393:
                        return z;
                    case -903613756:
                    case 1623067738:
                        if (i == -1) {
                            iM2566 = C2105.m6981("ܽ᩷") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-11021)) ^ (-168232722);
                            i7 = -475039316;
                            break;
                        }
                        iM2566 = C2105.m6981("ۜܰ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 15439) ^ 1119697210;
                        i7 = 2105358600;
                        break;
                    case -854400384:
                    case -534162704:
                        zM494210 = m49429(configuration);
                        iM2566 = (C2105.m6981("ᩳۘ") + i5) * (-31);
                        i6 = ((iM2566 ^ i4) * (-11767)) ^ 1101077018;
                        i7 = -1087474251;
                        break;
                        break;
                    case -624143288:
                    case -347176601:
                        if (C0483.f2088 < 0) {
                            iM2566 = C0630.m2566("ۗۢ") ^ i4;
                            i6 = ((iM2566 ^ i5) * 9587) ^ 1043766395;
                            i7 = -2036205572;
                            break;
                        }
                        iM2566 = C2105.m6981("᩺ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 22225) ^ (-1460000525);
                        i7 = -626562194;
                        break;
                        break;
                    case -546654744:
                    case 117229801:
                        if (C7811.f24123 < 0) {
                            iM2566 = C2105.m6981("ᩴۖ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-16289)) ^ 2056413531;
                            i7 = -1006307714;
                            break;
                        }
                        iM2566 = C2105.m6981("᩺ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 22225) ^ (-1460000525);
                        i7 = -626562194;
                        break;
                        break;
                    case -356864662:
                    case -196565409:
                        if (C3245.f10203 > 0) {
                            iM2566 = (C0630.m2566("ۖ۬") ^ i5) * (-93);
                            i6 = ((iM2566 ^ i4) * (-2827)) ^ (-316286842);
                            i7 = 214350763;
                            break;
                        }
                        iM2566 = C0630.m2566("֨ۨ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-29731)) ^ 375278165;
                        i7 = 328099335;
                        break;
                        break;
                    case -336789719:
                    case 2098798484:
                        zM494210 = true;
                        iM2566 = (C2105.m6981("ᩳۘ") + i5) * (-31);
                        i6 = ((iM2566 ^ i4) * (-11767)) ^ 1101077018;
                        i7 = -1087474251;
                        break;
                        break;
                    case -331954565:
                    case -199675590:
                        if (!C0382.f1805) {
                            iM2566 = C0630.m2566("ۢ᩸") ^ i5;
                            i6 = ((iM2566 ^ i4) * 2573) ^ (-708824941);
                            i7 = 900150679;
                            break;
                        }
                        iM2566 = C0630.m2566("᩸᩶") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-14897)) ^ 1715751786;
                        i7 = -392336574;
                        break;
                        break;
                    case -260069113:
                    case 1188386089:
                        zM494210 = f70258;
                        iM2566 = (C2105.m6981("ᩳۘ") + i5) * (-31);
                        i6 = ((iM2566 ^ i4) * (-11767)) ^ 1101077018;
                        i7 = -1087474251;
                        break;
                        break;
                    case 20590875:
                    case 1259407459:
                        if (RunnableC0588.f2309 < 0) {
                            iM2566 = (C2105.m6981("ۤۤ") + i5) * 77;
                            i6 = ((iM2566 ^ i4) * (-30705)) ^ (-1864943746);
                            i7 = 72631116;
                            break;
                        }
                        iM2566 = C0630.m2566("᩸᩶") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-14897)) ^ 1715751786;
                        i7 = -392336574;
                        break;
                        break;
                    case 95580852:
                    case 1127090626:
                        if (!C3683.m11222()) {
                            iM2566 = C2105.m6981("ۨۧ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-669)) ^ (-2001915230);
                            i7 = -193861311;
                            break;
                        }
                        iM2566 = (C0630.m2566("ܺ᩷") + i5) * (-7);
                        i6 = ((iM2566 ^ i4) * 26801) ^ 2035626276;
                        i7 = 396677367;
                        break;
                        break;
                    case 164751911:
                    case 1423504736:
                        if (!C1005.f3721) {
                            iM2566 = C0630.m2566("ۢ᩸") ^ i5;
                            i6 = ((iM2566 ^ i4) * 2573) ^ (-708824941);
                            i7 = 900150679;
                            break;
                            break;
                        }
                        iM2566 = (i4 - C0630.m2566("᩵᩶")) * (-65);
                        i6 = ((iM2566 ^ i5) * 13083) ^ (-656992819);
                        i7 = -1583261592;
                        break;
                    case 246214186:
                    case 961380482:
                        if (i != -100) {
                            iM6981 = C0630.m2566("᩺֡") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-14315)) ^ (-415747267);
                            i2 = -1869600795;
                        } else {
                            iM6981 = C2105.m6981("ۨܺ") ^ i4;
                            i6 = ((iM6981 ^ i5) * 28889) ^ (-2058090820);
                            i2 = -557705821;
                        }
                        i8 = iM6981 ^ i2;
                        z = false;
                        z2 = true;
                        break;
                    case 252284116:
                    case 1026798001:
                        ServiceConnectionC3453.m10564();
                        if (RunnableC1937.f6483 < 0) {
                            iM2566 = (C0630.m2566("ܺ᩷") + i5) * (-7);
                            i6 = ((iM2566 ^ i4) * 26801) ^ 2035626276;
                            i7 = 396677367;
                            break;
                            break;
                        }
                        iM2566 = C0630.m2566("᩸᩶") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-14897)) ^ 1715751786;
                        i7 = -392336574;
                        break;
                        break;
                    case 422469235:
                    case 1218993485:
                        return z2;
                    case 1034104712:
                    case 2046039838:
                        zM494210 = false;
                        iM2566 = (C2105.m6981("ᩳۘ") + i5) * (-31);
                        i6 = ((iM2566 ^ i4) * (-11767)) ^ 1101077018;
                        i7 = -1087474251;
                        break;
                        break;
                    default:
                        C2126.m7040();
                        if (ServiceConnectionC3453.f10921 < 0) {
                            iM2566 = C0630.m2566("֨ۨ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-29731)) ^ 375278165;
                            i7 = 328099335;
                            break;
                            break;
                        }
                        iM2566 = C0630.m2566("᩸᩶") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-14897)) ^ 1715751786;
                        i7 = -392336574;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49430(Configuration configuration) {
        f70278 = m49429(configuration);
        m49426();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0102 A[PHI: r3 r4 r7
      0x0102: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:34:0x0100, B:15:0x006e, B:13:0x006a, B:10:0x0061, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r4v3 l.۫ۤۡ) = (r4v2 l.۫ۤۡ), (r4v1 l.۫ۤۡ), (r4v1 l.۫ۤۡ), (r4v1 l.۫ۤۡ), (r4v1 l.۫ۤۡ) binds: [B:34:0x0100, B:15:0x006e, B:13:0x006a, B:10:0x0061, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:34:0x0100, B:15:0x006e, B:13:0x006a, B:10:0x0061, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0258 A[PHI: r2 r8 r12 r13
      0x0258: PHI (r2v4 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v3 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
     binds: [B:65:0x0256, B:51:0x01b9, B:43:0x0177, B:30:0x00de, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:65:0x0256, B:51:0x01b9, B:43:0x0177, B:30:0x00de, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:65:0x0256, B:51:0x01b9, B:43:0x0177, B:30:0x00de, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r13v3 short) = (r13v2 short), (r13v1 short), (r13v1 short), (r13v1 short), (r13v1 short) binds: [B:65:0x0256, B:51:0x01b9, B:43:0x0177, B:30:0x00de, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x028f A[PHI: r11 r23 r24
      0x028f: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:69:0x028d, B:55:0x01e3, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x028f: PHI (r23v3 boolean) = (r23v1 boolean), (r23v2 boolean), (r23v1 boolean) binds: [B:69:0x028d, B:55:0x01e3, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x028f: PHI (r24v5 int) = (r24v4 int), (r24v3 int), (r24v3 int) binds: [B:69:0x028d, B:55:0x01e3, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02c4 A[PHI: r1 r9 r15
      0x02c4: PHI (r1v2 android.content.SharedPreferences) = (r1v1 android.content.SharedPreferences), (r1v3 android.content.SharedPreferences) binds: [B:73:0x02c2, B:47:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r9v3 short) = (r9v2 short), (r9v1 short) binds: [B:73:0x02c2, B:47:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r15v2 short[]) = (r15v1 short[]), (r15v3 short[]) binds: [B:73:0x02c2, B:47:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02f8 A[PHI: r17 r18
      0x02f8: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]) binds: [B:77:0x02f6, B:13:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r18v4 char) = (r18v3 char), (r18v2 char) binds: [B:77:0x02f6, B:13:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m49433() {
        int iM2566;
        int i;
        int i2;
        boolean zM12818;
        SharedPreferences sharedPreferences = null;
        String strM12355 = null;
        InterfaceC12344 interfaceC12344 = null;
        boolean z = false;
        int i3 = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = -225066067;
        int i8 = ViewOnClickListenerC1958.f6529;
        int i9 = C0422.f1886;
        int iM2567 = C0630.m2566("֫ۗ") ^ i8;
        int i10 = ((iM2567 ^ i9) * (-23037)) ^ 276178799;
        int i11 = iM2567 ^ 1480587304;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        boolean zM49429 = false;
        int i15 = 0;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i9) * 21067) >> 31));
            switch (i7) {
                case -2077715480:
                case 2034162571:
                    if (C3746.f11829 > 0) {
                        iM2566 = C2105.m6981("ᩳ۬") ^ i8;
                        i = ((iM2566 ^ i9) * (-26659)) ^ 219284557;
                        i2 = -1146961716;
                    } else {
                        iM2566 = (C0630.m2566("ۗۖ") + i8) * 63;
                        i = ((iM2566 ^ i9) * (-17927)) ^ 115001180;
                        i2 = 1285889479;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1879402096:
                case 839949656:
                    i3 = 2;
                    iM2566 = (i9 - C2105.m6981("ܿۤ")) * (-29);
                    i = ((iM2566 ^ i8) * (-975)) ^ 172340037;
                    i2 = -1977923746;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1639293762:
                case 993709919:
                    f70258 = z;
                    if (z) {
                        iM2566 = C2105.m6981("᩻ܽ") ^ i8;
                        i = ((iM2566 ^ i9) * 29871) ^ 1668666980;
                        i2 = 1714423117;
                    } else {
                        i3 = i14;
                        iM2566 = (i9 - C2105.m6981("ܿۤ")) * (-29);
                        i = ((iM2566 ^ i8) * (-975)) ^ 172340037;
                        i2 = -1977923746;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1631538258:
                case 1357203585:
                    C4616.m13552();
                    if (C0798.f2919) {
                        iM2566 = (C0630.m2566("۟ۨ") + i9) * 25;
                        i = ((iM2566 ^ i8) * 11067) ^ 1437539880;
                        i2 = 2139017915;
                    } else {
                        iM2566 = C2105.m6981("ᩳ۬") ^ i8;
                        i = ((iM2566 ^ i9) * (-26659)) ^ 219284557;
                        i2 = -1146961716;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1616501969:
                case -955299977:
                    s = sArr2[c];
                    if (C3432.m10477() <= 0) {
                        iM2566 = (C2105.m6981("֫۬") ^ i8) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i9) * 3565) ^ (-236982180);
                        i2 = -1558011439;
                    } else {
                        iM2566 = C0630.m2566("ۜܿ") ^ i8;
                        i = ((iM2566 ^ i9) * (-8581)) ^ (-1094280722);
                        i2 = 1325026959;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1486297686:
                case 1427859900:
                    AbstractC13246.m32143(i3);
                    break;
                case -1107788185:
                case 1293782633:
                    zM12818 = C4263.m12818(interfaceC12344, C0422.m1955(sArr3, i12, i13, i6), false);
                    z = zM12818;
                    iM2566 = (i8 - C0630.m2566("ۛܺ")) * 7;
                    i = ((iM2566 ^ i9) * (-21929)) ^ (-735966930);
                    i2 = 2009707543;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1061069239:
                case 1912910541:
                    f70278 = zM49429;
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i9 - C2105.m6981("ᩴ۫")) * 53;
                        i = ((iM2566 ^ i8) * (-573)) ^ (-604263424);
                        i2 = 2028790419;
                    } else {
                        iM2566 = C2105.m6981("ۚۗ") ^ i9;
                        i = ((iM2566 ^ i8) * (-3433)) ^ (-1002248298);
                        i2 = -794150080;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -935222404:
                case 1523684503:
                    sharedPreferences = C4925.f15523;
                    sArr = f70265;
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C2105.m6981("֫۬") ^ i8) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i9) * 3565) ^ (-236982180);
                        i2 = -1558011439;
                    } else {
                        iM2566 = (C2105.m6981("ᩳܳ") ^ i8) * (-13);
                        i = ((iM2566 ^ i9) * (-17075)) ^ (-1979573296);
                        i2 = -1588769254;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -763698055:
                case 1142121865:
                    zM12818 = f70278;
                    z = zM12818;
                    iM2566 = (i8 - C0630.m2566("ۛܺ")) * 7;
                    i = ((iM2566 ^ i9) * (-21929)) ^ (-735966930);
                    i2 = 2009707543;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -727614817:
                case -601323470:
                    if (C5695.m16032(sharedPreferences, strM12355, true)) {
                        int iM6981 = (i9 - C2105.m6981("ۖܰ")) * (-75);
                        i10 = ((iM6981 ^ i8) * 10255) ^ (-2144097492);
                        i11 = iM6981 ^ (-146740518);
                    } else {
                        int iM6982 = (C2105.m6981("֨ܶ") + i8) * 65;
                        i11 = iM6982 ^ (-1593705010);
                        i10 = ((iM6982 ^ i9) * (-15753)) ^ (-1279956248);
                    }
                    i14 = 1;
                    break;
                case -670256790:
                case 2107605843:
                    if (i5 - (s * s2) >= 0) {
                        iM2566 = C2105.m6981("֫ᩴ") ^ i9;
                        i = ((iM2566 ^ i8) * 14951) ^ (-1092609236);
                        i2 = 1062168161;
                    } else {
                        iM2566 = (i8 - C2105.m6981("᩷ܰ")) * 27;
                        i = ((iM2566 ^ i9) * (-20125)) ^ 1624872444;
                        i2 = -1016820214;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -398501662:
                case 450441563:
                    i15 = s * s;
                    i4 = 360240400;
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("ۗۖ") + i8) * 63;
                        i = ((iM2566 ^ i9) * (-17927)) ^ 115001180;
                        i2 = 1285889479;
                    } else {
                        iM2566 = C2105.m6981("᩵ܿ") ^ i8;
                        i = ((iM2566 ^ i9) * (-6831)) ^ 835831147;
                        i2 = -1133493651;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -397353680:
                case 365043015:
                    i5 = i15 + i4;
                    s2 = 37960;
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i9 - C2105.m6981("ᩴ۫")) * 53;
                        i = ((iM2566 ^ i8) * (-573)) ^ (-604263424);
                        i2 = 2028790419;
                    } else {
                        iM2566 = C2105.m6981("ܰܿ") ^ i9;
                        i = ((iM2566 ^ i8) * (-26475)) ^ (-897926124);
                        i2 = 1702110813;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -276668894:
                case 1332202044:
                    ViewOnClickListenerC1958.m6429();
                    break;
                case -208310915:
                case 470779552:
                    i6 = 54940;
                    iM2566 = C0630.m2566("ܰ᩻") ^ i8;
                    i = ((iM2566 ^ i9) * 2873) ^ (-376981152);
                    i2 = 1468371444;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -128033875:
                case 344982754:
                    C3683.m11222();
                    if (C2105.m6982() == 0) {
                        iM2566 = C2105.m6981("ᩳ۬") ^ i8;
                        i = ((iM2566 ^ i9) * (-26659)) ^ 219284557;
                        i2 = -1146961716;
                    } else {
                        iM2566 = (i9 - C2105.m6981("ᩴ۫")) * 53;
                        i = ((iM2566 ^ i8) * (-573)) ^ (-604263424);
                        i2 = 2028790419;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -63245877:
                case 1329486335:
                    interfaceC12344 = C4925.f15527;
                    sArr3 = f70265;
                    i12 = 70;
                    if (C2272.f7362) {
                        iM2566 = C2105.m6981("ᩳ۬") ^ i8;
                        i = ((iM2566 ^ i9) * (-26659)) ^ 219284557;
                        i2 = -1146961716;
                    } else {
                        iM2566 = (C0630.m2566("ۤ᩶") ^ i9) * 55;
                        i = ((iM2566 ^ i8) * 14419) ^ (-2097846634);
                        i2 = 790111429;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 60290523:
                case 454731215:
                    strM12355 = C4117.m12355(sArr, 41, 29, i6);
                    if (C1711.f5919) {
                        iM2566 = (i9 - C2105.m6981("ᩴ۫")) * 53;
                        i = ((iM2566 ^ i8) * (-573)) ^ (-604263424);
                        i2 = 2028790419;
                    } else {
                        iM2566 = (C0630.m2566("᩵᩵") + i9) * 73;
                        i = ((iM2566 ^ i8) * 4121) ^ 1161606403;
                        i2 = -1070657829;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 61262984:
                case 1543462205:
                    zM49429 = m49429(C4925.m14338().getConfiguration());
                    if (C3663.m11168() >= 0) {
                        iM2566 = (C0630.m2566("ۗۖ") + i8) * 63;
                        i = ((iM2566 ^ i9) * (-17927)) ^ 115001180;
                        i2 = 1285889479;
                    } else {
                        iM2566 = (C2105.m6981("ᩳᩳ") + i9) * 55;
                        i = ((iM2566 ^ i8) * (-20833)) ^ 1171153060;
                        i2 = -1686084194;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 203221651:
                case 1710709970:
                    sArr2 = f70265;
                    c = '(';
                    if (C4159.f13567) {
                        iM2566 = C0630.m2566("ۘܿ") ^ i9;
                        i = ((iM2566 ^ i8) * 30149) ^ (-1056044275);
                        i2 = -2024948919;
                    } else {
                        iM2566 = (C0630.m2566("۟ۨ") + i9) * 25;
                        i = ((iM2566 ^ i8) * 11067) ^ 1437539880;
                        i2 = 2139017915;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 275895905:
                case 1737371094:
                    ServiceConnectionC3453.m10564();
                    ViewOnClickListenerC1958.m6429();
                    iM2566 = C2105.m6981("ᩳ۬") ^ i8;
                    i = ((iM2566 ^ i9) * (-26659)) ^ 219284557;
                    i2 = -1146961716;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 325654848:
                case 1975213520:
                    i13 = 10;
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("֡۬") ^ i8;
                        i = ((iM2566 ^ i9) * (-3543)) ^ (-1485706517);
                        i2 = 423534389;
                    } else {
                        iM2566 = (i9 - C2105.m6981("ᩴ۫")) * 53;
                        i = ((iM2566 ^ i8) * (-573)) ^ (-604263424);
                        i2 = 2028790419;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                default:
                    i6 = 40639;
                    iM2566 = C0630.m2566("ܰ᩻") ^ i8;
                    i = ((iM2566 ^ i9) * 2873) ^ (-376981152);
                    i2 = 1468371444;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49431() {
        return f70258;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49427(Configuration configuration, int i) {
        boolean zM49429 = false;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1659265238;
        int i7 = C4075.f12947;
        int i8 = C4616.f14690;
        int iM2566 = (C0630.m2566("ۤۤ") + i8) * (-65);
        int i9 = ((iM2566 ^ i7) * 28451) ^ 1328569002;
        int i10 = -1561396704;
        while (true) {
            i6 = ((((i6 ^ i7) * 5263) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -2087645702:
                case 1020862322:
                    zM49429 = false;
                    iM2566 = C2105.m6981("᩺ۗ") ^ i8;
                    i9 = ((iM2566 ^ i7) * 6103) ^ (-674439571);
                    i10 = 1482578200;
                    break;
                case -2040273193:
                case -1766460952:
                    zM49429 = m49429(configuration);
                    iM2566 = C2105.m6981("᩺ۗ") ^ i8;
                    i9 = ((iM2566 ^ i7) * 6103) ^ (-674439571);
                    i10 = 1482578200;
                    break;
                case -1996845344:
                case 1518005762:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C0630.m2566("᩶ܿ") + i8) * (-41);
                        i9 = ((iM2566 ^ i7) * 12823) ^ (-286049185);
                        i10 = 2059000723;
                    } else {
                        iM2566 = (i7 - C2105.m6981("۟ۢ")) * 63;
                        i9 = ((iM2566 ^ i8) * (-29599)) ^ 449490604;
                        i10 = 925296646;
                    }
                    break;
                case -1973405920:
                case 151889200:
                    i2 = configuration.uiMode;
                    i3 = -49;
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("ۧۨ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-28671)) ^ 934776178;
                        i10 = -630687212;
                    } else {
                        iM2566 = (C2105.m6981("ܺۜ") ^ i7) * (-97);
                        i9 = ((iM2566 ^ i8) * 31959) ^ 22313859;
                        i10 = -1704670419;
                    }
                    break;
                case -1932409457:
                case 2002150392:
                    C0483.m2121();
                    if (C3537.m10746() > 0) {
                        iM2566 = (C0630.m2566("᩶ܿ") + i8) * (-41);
                        i9 = ((iM2566 ^ i7) * 12823) ^ (-286049185);
                        i10 = 2059000723;
                    } else {
                        iM2566 = C0630.m2566("ۧۨ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-28671)) ^ 934776178;
                        i10 = -630687212;
                    }
                    break;
                case -1771802256:
                case 674831679:
                    if (i != -1) {
                        iM2566 = (C0630.m2566("ۖᩳ") + i7) * 97;
                        i9 = ((iM2566 ^ i8) * 3451) ^ (-1500870038);
                        i10 = -232044726;
                    } else {
                        iM2566 = C0630.m2566("ۖۘ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-30949)) ^ (-1751624511);
                        i10 = 518929138;
                    }
                    break;
                case -1572661315:
                case 280705081:
                    zM49429 = f70258;
                    iM2566 = C2105.m6981("᩺ۗ") ^ i8;
                    i9 = ((iM2566 ^ i7) * 6103) ^ (-674439571);
                    i10 = 1482578200;
                    break;
                case -1377294300:
                case -654998990:
                    if (i != 2) {
                        iM2566 = C2105.m6981("ۜ᩹") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-28323)) ^ (-16737738);
                        i10 = 1378899361;
                    } else {
                        zM49429 = z;
                        iM2566 = C2105.m6981("᩺ۗ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 6103) ^ (-674439571);
                        i10 = 1482578200;
                    }
                    break;
                case -1310912036:
                case -594668270:
                    C2272.m7503();
                    C1128.m3851();
                    iM2566 = C0630.m2566("ۧۨ") ^ i8;
                    i9 = ((iM2566 ^ i7) * (-28671)) ^ 934776178;
                    i10 = -630687212;
                    break;
                case -1189761203:
                case 1441804362:
                    if (RunnableC1108.m3790()) {
                        iM2566 = C0630.m2566("ۧۨ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-28671)) ^ 934776178;
                        i10 = -630687212;
                    } else {
                        iM2566 = C0630.m2566("ܶۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 6297) ^ 1007001660;
                        i10 = -1049059604;
                    }
                    break;
                case -1014241984:
                case -143622054:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("᩵ۖ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-7887)) ^ 1413312032;
                        i10 = 1453902972;
                    } else {
                        iM2566 = C2105.m6981("ۛۧ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-22135)) ^ (-1412420061);
                        i10 = 299444523;
                    }
                    break;
                case -987882850:
                case 454160799:
                    i5 = 16;
                    iM2566 = (C2105.m6981("᩻ܰ") ^ i8) * (-33);
                    i9 = ((iM2566 ^ i7) * (-11751)) ^ (-1840698613);
                    i10 = -2008353365;
                    break;
                case -892481926:
                case 2100304843:
                    if (C4117.f13076 > 0) {
                        iM2566 = (C0630.m2566("ۛᩴ") + i7) * (-21);
                        i9 = ((iM2566 ^ i8) * (-31149)) ^ 1618812086;
                        i10 = -1490711261;
                    } else {
                        iM2566 = C0630.m2566("ۧۨ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-28671)) ^ 934776178;
                        i10 = -630687212;
                    }
                    break;
                case -817653717:
                case 590420706:
                    i4 = i2 & i3;
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("᩵ۖ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-7887)) ^ 1413312032;
                        i10 = 1453902972;
                    } else {
                        iM2566 = C2105.m6981("ܽۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 23527) ^ (-1202124758);
                        i10 = -1803055457;
                    }
                    break;
                case -744106503:
                case -149126410:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("֫֨") ^ i7;
                        i9 = ((iM2566 ^ i8) * 24627) ^ (-1284510194);
                        i10 = 1117154047;
                    } else {
                        iM2566 = C0630.m2566("᩻ۛ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 29773) ^ 1092605726;
                        i10 = -904713196;
                    }
                    break;
                case -630477980:
                case 2095204227:
                    zM49429 = f70258;
                    iM2566 = C2105.m6981("᩺ۗ") ^ i8;
                    i9 = ((iM2566 ^ i7) * 6103) ^ (-674439571);
                    i10 = 1482578200;
                    break;
                case -422160918:
                case 1112213004:
                    if (C7811.m20844() != 0) {
                        iM2566 = (C0630.m2566("᩶ܿ") + i8) * (-41);
                        i9 = ((iM2566 ^ i7) * 12823) ^ (-286049185);
                        i10 = 2059000723;
                    } else {
                        iM2566 = C2105.m6981("۟۟") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-8709)) ^ (-452181615);
                        i10 = -465327291;
                    }
                    break;
                case -406608312:
                case 1545235816:
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C0630.m2566("ۛᩴ") + i7) * (-21);
                        i9 = ((iM2566 ^ i8) * (-31149)) ^ 1618812086;
                        i10 = -1490711261;
                    } else {
                        iM2566 = C2105.m6981("ۙۗ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-22311)) ^ 297254425;
                        i10 = -777550040;
                    }
                    break;
                case -230325072:
                case 929180807:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("ۛᩴ") + i7) * (-21);
                        i9 = ((iM2566 ^ i8) * (-31149)) ^ 1618812086;
                        i10 = -1490711261;
                    } else {
                        iM2566 = (C2105.m6981("᩷ۚ") ^ i7) * 19;
                        i9 = ((iM2566 ^ i8) * 8229) ^ 1183504086;
                        i10 = 1345562690;
                    }
                    break;
                case -180343653:
                case 2129050693:
                    if (zM49429) {
                        iM2566 = C2105.m6981("ܶ᩺") ^ i7;
                        i9 = ((iM2566 ^ i8) * 3947) ^ 1255499411;
                        i10 = -512094827;
                    } else {
                        iM2566 = (C0630.m2566("ۖ۠") ^ i8) * 47;
                        i9 = ((iM2566 ^ i7) * (-29445)) ^ 1516483259;
                        i10 = 121916489;
                    }
                    break;
                case -79694252:
                case 1880107453:
                    if (C4616.f14690 > 0) {
                        iM2566 = C2105.m6981("֫֨") ^ i7;
                        i9 = ((iM2566 ^ i8) * 24627) ^ (-1284510194);
                        i10 = 1117154047;
                    } else {
                        iM2566 = (C0630.m2566("᩶ܿ") + i8) * (-41);
                        i9 = ((iM2566 ^ i7) * 12823) ^ (-286049185);
                        i10 = 2059000723;
                    }
                    break;
                case -53249995:
                case 1833424574:
                    C2272.m7503();
                    break;
                case 421942894:
                case 1763829321:
                    i5 = 32;
                    iM2566 = (C2105.m6981("᩻ܰ") ^ i8) * (-33);
                    i9 = ((iM2566 ^ i7) * (-11751)) ^ (-1840698613);
                    i10 = -2008353365;
                    break;
                case 902400880:
                case 1320714691:
                    if (i != -100) {
                        iM2566 = (i8 - C0630.m2566("ۧ֫")) * 41;
                        i9 = ((iM2566 ^ i7) * 24777) ^ 1054945931;
                        i10 = 466248259;
                    } else {
                        iM2566 = (i7 - C2105.m6981("᩻ܿ")) * (-53);
                        i9 = ((iM2566 ^ i8) * (-1173)) ^ 1154519888;
                        i10 = -714344059;
                    }
                    break;
                case 1163304034:
                case 1492603743:
                    z = true;
                    if (i != 1) {
                        iM2566 = (C2105.m6981("ۗᩳ") + i7) * 69;
                        i9 = ((iM2566 ^ i8) * 22651) ^ (-1653472742);
                        i10 = 406426774;
                    } else {
                        iM2566 = (C0630.m2566("᩻ۤ") ^ i8) * 123;
                        i9 = ((iM2566 ^ i7) * 28803) ^ (-2036762711);
                        i10 = 424085161;
                    }
                    break;
                case 1539475396:
                case 1813537149:
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("᩵ۖ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-7887)) ^ 1413312032;
                        i10 = 1453902972;
                    } else {
                        iM2566 = (C2105.m6981("᩺۬") + i8) * 55;
                        i9 = ((iM2566 ^ i7) * 16311) ^ (-795951952);
                        i10 = -1535234524;
                    }
                    break;
                default:
                    configuration.uiMode = i5 | i4;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0245 A[PHI: r5 r10 r11 r13 r14 r25
      0x0245: PHI (r5v3 l.۬ۤۡ) = (r5v2 l.۬ۤۡ), (r5v4 l.۬ۤۡ) binds: [B:61:0x0243, B:40:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:61:0x0243, B:40:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]) binds: [B:61:0x0243, B:40:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r13v3 short[]) = (r13v2 short[]), (r13v4 short[]) binds: [B:61:0x0243, B:40:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:61:0x0243, B:40:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r25v19 android.content.SharedPreferences) = (r25v16 android.content.SharedPreferences), (r25v3 android.content.SharedPreferences) binds: [B:61:0x0243, B:40:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x035d A[PHI: r4 r6 r7 r17 r18 r24
      0x035d: PHI (r4v6 l.۫ۤۡ) = (r4v2 l.۫ۤۡ), (r4v5 l.۫ۤۡ), (r4v2 l.۫ۤۡ) binds: [B:77:0x0313, B:10:0x0075, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r6v6 java.lang.String) = (r6v2 java.lang.String), (r6v5 java.lang.String), (r6v2 java.lang.String) binds: [B:77:0x0313, B:10:0x0075, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r7v6 boolean) = (r7v2 boolean), (r7v5 boolean), (r7v2 boolean) binds: [B:77:0x0313, B:10:0x0075, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r17v3 short) = (r17v2 short), (r17v2 short), (r17v6 short) binds: [B:77:0x0313, B:10:0x0075, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:77:0x0313, B:10:0x0075, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x035d: PHI (r24v39 android.content.SharedPreferences) = 
      (r24v3 android.content.SharedPreferences)
      (r24v38 android.content.SharedPreferences)
      (r24v43 android.content.SharedPreferences)
     binds: [B:77:0x0313, B:10:0x0075, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        if (l.C0798.m2998() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0073, code lost:
    
        if (l.ViewOnClickListenerC1958.f6529 <= 0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m49434() {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        SharedPreferences sharedPreferences;
        int i4 = C1773.f6144;
        int i5 = C3683.f11629;
        int iM2568 = C0630.m2566("ܺ֫") ^ i5;
        int i6 = ((iM2568 ^ i4) * (-5509)) ^ (-1989177911);
        String strM50602 = null;
        String strM2436 = null;
        RunnableC18664 runnableC18664 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM2568 ^ 1407419946;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -1075931488;
        SharedPreferences sharedPreferences2 = null;
        InterfaceC13049 interfaceC13049M6438 = null;
        InterfaceC12344 interfaceC12344 = null;
        int i17 = 0;
        while (true) {
            i16 = i7 ^ (i6 & (((i16 ^ i4) * (-28461)) >> 31));
            switch (i16) {
                case -2124119502:
                case -1568432806:
                    break;
                case -2025072634:
                case -430581528:
                    C1916.m6302(C7811.m20835(interfaceC13049M6438, strM2436, z));
                    if (f70258) {
                        iM2567 = C0630.m2566("᩶ۨ") ^ i5;
                        i = ((iM2567 ^ i4) * (-9781)) ^ (-1510859123);
                        i3 = 645132113;
                    } else {
                        i8 = i17;
                        iM2567 = C0630.m2566("ܰ۠") ^ i5;
                        i = ((iM2567 ^ i4) * 18219) ^ (-1630270287);
                        i3 = -4651715;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case -1958352611:
                case -871041352:
                    sharedPreferences2 = sharedPreferences2;
                    i10 = 29;
                    if (C0630.m2564()) {
                        iM2566 = C0630.m2566("ᩳ֨") ^ i4;
                        i = ((iM2566 ^ i5) * (-27973)) ^ (-961617725);
                        i2 = 777554190;
                    } else {
                        iM2566 = (C0630.m2566("ᩴ۫") + i5) * 49;
                        i = ((iM2566 ^ i4) * (-627)) ^ (-1095536428);
                        i2 = -2116787403;
                    }
                    int i18 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i18;
                    i6 = i;
                    break;
                case -1878311724:
                case 2113172639:
                    sharedPreferences2 = C4925.f15523;
                    sArr = f70265;
                    i9 = 81;
                    if (C1294.f4556 >= 0) {
                        iM2567 = C2105.m6981("ᩳܰ") ^ i5;
                        i = ((iM2567 ^ i4) * 191) ^ (-20142127);
                        i3 = 298885523;
                    } else {
                        iM2567 = (i4 - C0630.m2566("ۢ۫")) * (-31);
                        i = ((iM2567 ^ i5) * (-1333)) ^ (-2041056507);
                        i3 = -1690360139;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case -1790944942:
                case -964719417:
                    C1773.m5908();
                    C2520.m8026();
                    break;
                case -1778942884:
                case -817616083:
                    C5695.m16023();
                    sharedPreferences2 = sharedPreferences2;
                    iM2566 = C2105.m6981("ۗܶ") ^ i5;
                    i = ((iM2566 ^ i4) * (-1327)) ^ (-1713084943);
                    i2 = 1640448896;
                    int i19 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i19;
                    i6 = i;
                    break;
                case -1324587661:
                case -1311239045:
                    f70258 = (f70258 ? 1 : 0) ^ i17;
                    if (C0237.m1481() < 0) {
                        iM2567 = C2105.m6981("᩺᩸") ^ i4;
                        i = ((iM2567 ^ i5) * 13085) ^ 680909380;
                        i3 = 366830006;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    sharedPreferences2 = sharedPreferences2;
                    iM2566 = C0630.m2566("ᩳ֨") ^ i4;
                    i = ((iM2566 ^ i5) * (-27973)) ^ (-961617725);
                    i2 = 777554190;
                    int i110 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i110;
                    i6 = i;
                    break;
                case -1082295832:
                case 1812592369:
                    sharedPreferences2 = sharedPreferences2;
                    s = 1;
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("ᩳᩳ") ^ i4;
                        i = ((iM2566 ^ i5) * 55) ^ (-1195283684);
                        i2 = -503708485;
                    } else {
                        iM2566 = C0630.m2566("ܶۧ") ^ i4;
                        i = ((iM2566 ^ i5) * 9541) ^ 550554037;
                        i2 = 1171689255;
                    }
                    int i111 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i111;
                    i6 = i;
                    break;
                case -1078134197:
                case 1196371132:
                    i12 = 33647;
                    iM2566 = C2105.m6981("ۚۖ") ^ i5;
                    i = ((iM2566 ^ i4) * (-8229)) ^ (-875029738);
                    i2 = 1686906373;
                    int i112 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i112;
                    i6 = i;
                    break;
                case -882747960:
                case -447456413:
                    C22628.m50615();
                    break;
                case -875303794:
                case -467334567:
                    runnableC18664.run();
                    iM2567 = (C0630.m2566("ܿܳ") ^ i4) * 79;
                    i = ((iM2567 ^ i5) * 18985) ^ 499981795;
                    i3 = -317135284;
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case -809431061:
                case 1246194101:
                    i12 = 10109;
                    iM2566 = C2105.m6981("ۚۖ") ^ i5;
                    i = ((iM2566 ^ i4) * (-8229)) ^ (-875029738);
                    i2 = 1686906373;
                    int i113 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i113;
                    i6 = i;
                    break;
                case -796435223:
                case -304824188:
                    sharedPreferences2 = sharedPreferences2;
                    i14 = s2 * 2;
                    i15 = 1;
                    if (C0630.m2564()) {
                        iM2566 = (C0630.m2566("ۘ᩷") ^ i5) * (-67);
                        i = ((iM2566 ^ i4) * 13419) ^ (-798482423);
                        i2 = 540866115;
                    } else {
                        iM2566 = C2105.m6981("ܺᩴ") ^ i5;
                        i = ((iM2566 ^ i4) * 15871) ^ 1087892976;
                        i2 = -530883713;
                    }
                    int i114 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i114;
                    i6 = i;
                    break;
                case -755559026:
                case 839893376:
                    i8 = 2;
                    iM2567 = C0630.m2566("ܰ۠") ^ i5;
                    i = ((iM2567 ^ i4) * 18219) ^ (-1630270287);
                    i3 = -4651715;
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case -321637380:
                case 480270511:
                    C4925.f15523.edit().putBoolean(strM50602, false).apply();
                    sharedPreferences = sharedPreferences2;
                    int iM2569 = (i4 - C0630.m2566("ܽۖ")) * 81;
                    SharedPreferences sharedPreferences3 = sharedPreferences;
                    i6 = ((iM2569 ^ i5) * 1001) ^ 355450920;
                    sharedPreferences2 = sharedPreferences3;
                    i7 = iM2569 ^ 2024714430;
                    break;
                case -241766033:
                case 1330513041:
                    strM50602 = C22628.m50602(sArr, i9, i10, i12);
                    sharedPreferences = sharedPreferences2;
                    if (C5695.m16032(sharedPreferences, strM50602, true)) {
                        int iM6981 = C2105.m6981("ۚᩴ") ^ i4;
                        sharedPreferences2 = sharedPreferences;
                        i7 = iM6981 ^ 840816515;
                        i6 = ((iM6981 ^ i5) * (-25859)) ^ (-2142599698);
                        i17 = 1;
                    } else {
                        i17 = 1;
                        int iM25610 = (i4 - C0630.m2566("ܽۖ")) * 81;
                        SharedPreferences sharedPreferences4 = sharedPreferences;
                        i6 = ((iM25610 ^ i5) * 1001) ^ 355450920;
                        sharedPreferences2 = sharedPreferences4;
                        i7 = iM25610 ^ 2024714430;
                    }
                    break;
                case -135294538:
                case 1359729360:
                    strM2436 = RunnableC0588.m2436(sArr2, i11, 10, i12);
                    z = f70258;
                    if (!C1420.m4913()) {
                        iM2567 = (i5 - C2105.m6981("ܿۖ")) * 89;
                        i = ((iM2567 ^ i4) * (-25487)) ^ 174660382;
                        i3 = -457954322;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    sharedPreferences2 = sharedPreferences2;
                    iM2566 = C2105.m6981("ۗܶ") ^ i5;
                    i = ((iM2566 ^ i4) * (-1327)) ^ (-1713084943);
                    i2 = 1640448896;
                    int i115 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i115;
                    i6 = i;
                    break;
                case 15126893:
                case 1850742548:
                    if (C4616.m13552() == 0) {
                        sharedPreferences2 = sharedPreferences2;
                        iM2566 = (C0630.m2566("ۘ᩷") ^ i5) * (-67);
                        i = ((iM2566 ^ i4) * 13419) ^ (-798482423);
                        i2 = 540866115;
                        int i116 = iM2566 ^ i2;
                        sharedPreferences2 = sharedPreferences2;
                        i7 = i116;
                        i6 = i;
                    }
                    sharedPreferences2 = sharedPreferences2;
                    iM2566 = C2105.m6981("ᩳᩳ") ^ i4;
                    i = ((iM2566 ^ i5) * 55) ^ (-1195283684);
                    i2 = -503708485;
                    int i117 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i117;
                    i6 = i;
                    break;
                case 188621152:
                case 1156975976:
                    AbstractC13246.m32143(i8);
                    runnableC18664 = f70289;
                    if (runnableC18664 != null) {
                        iM2567 = (C2105.m6981("ۨ۫") + i4) * 115;
                        i = ((iM2567 ^ i5) * (-20123)) ^ 45413785;
                        i3 = 458441602;
                    } else {
                        iM2567 = (C0630.m2566("ܿܳ") ^ i4) * 79;
                        i = ((iM2567 ^ i5) * 18985) ^ 499981795;
                        i3 = -317135284;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case 329428615:
                case 349987048:
                    sharedPreferences2 = sharedPreferences2;
                    if (i13 - (i14 + i15) >= 0) {
                        iM2566 = (C2105.m6981("ܿܺ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2566 ^ i5) * 25189) ^ 1566370426;
                        i2 = -473085614;
                    } else {
                        iM2566 = C2105.m6981("۟᩻") ^ i5;
                        i = ((iM2566 ^ i4) * 30925) ^ (-317060212);
                        i2 = 1262212314;
                    }
                    int i118 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i118;
                    i6 = i;
                    break;
                case 547513193:
                case 1712211092:
                    break;
                case 880067154:
                case 1313881210:
                    interfaceC13049M6438 = ViewOnClickListenerC1958.m6438(interfaceC12344);
                    sArr2 = f70265;
                    i11 = UMErrorCode.E_UM_BE_JSON_FAILED;
                    if (C0422.f1886 <= 0) {
                        iM2567 = C2105.m6981("ᩳܰ") ^ i5;
                        i = ((iM2567 ^ i4) * 191) ^ (-20142127);
                        i3 = 298885523;
                    } else {
                        iM2567 = (i4 - C2105.m6981("᩸ܺ")) * (-37);
                        i = ((iM2567 ^ i5) * (-29227)) ^ 205565891;
                        i3 = -923276342;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case 996364158:
                case 1354949387:
                    interfaceC12344 = C4925.f15527;
                    if (RunnableC0588.m2441() < 0) {
                        iM2567 = C0630.m2566("ܶ᩵") ^ i5;
                        i = ((iM2567 ^ i4) * 15483) ^ (-46244188);
                        i3 = -1057752512;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    sharedPreferences2 = sharedPreferences2;
                    iM2566 = C2105.m6981("ۗܶ") ^ i5;
                    i = ((iM2566 ^ i4) * (-1327)) ^ (-1713084943);
                    i2 = 1640448896;
                    int i119 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i119;
                    i6 = i;
                    break;
                case 1802176672:
                case 1985580423:
                    sharedPreferences2 = sharedPreferences2;
                    int i20 = s2 + s;
                    i13 = i20 * i20;
                    if (AbstractC2021.m6574()) {
                        iM2566 = C2105.m6981("ۗܶ") ^ i5;
                        i = ((iM2566 ^ i4) * (-1327)) ^ (-1713084943);
                        i2 = 1640448896;
                    } else {
                        iM2566 = C0630.m2566("ۢۚ") ^ i4;
                        i = ((iM2566 ^ i5) * (-13223)) ^ (-1068658618);
                        i2 = -29695705;
                    }
                    int i1110 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i1110;
                    i6 = i;
                    break;
                default:
                    sharedPreferences2 = sharedPreferences2;
                    s2 = f70265[80];
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("ۗܶ") ^ i5;
                        i = ((iM2566 ^ i4) * (-1327)) ^ (-1713084943);
                        i2 = 1640448896;
                    } else {
                        iM2566 = C2105.m6981("۫ܽ") ^ i5;
                        i = ((iM2566 ^ i4) * (-2473)) ^ 864851318;
                        i2 = 1274701239;
                    }
                    int i1111 = iM2566 ^ i2;
                    sharedPreferences2 = sharedPreferences2;
                    i7 = i1111;
                    i6 = i;
                    break;
            }
            return;
        }
    }
}
