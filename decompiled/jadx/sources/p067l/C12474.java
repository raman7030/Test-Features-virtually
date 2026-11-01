package p067l;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import bin.p000mt.plugin.api.LocalString;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.util.ThreadUtil;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R3YJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12474 implements PluginContext {

    /* JADX INFO: renamed from: ۡ᩵ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f82134 = {9479, 17105, 17118, 17115, 17090, 17104, 17117, 17107, 17088, 17110, 6275, 6814, 6786, 6811, 6793, 6791, 6784, 6823, 6794, 6814, 6786, 6811, 6793, 6791, 6784, 6846, 6812, 6795, 6792, 6795, 6812, 6795, 6784, 6797, 6795, 399, 16738, 16766, 16766, 16762, 16688, 16677, 16677, 16738, 16766, 16766, 16762, 16761, 16688, 16677, 16677, 2403, 13449, 8883, 9233, 9229, 9233, 9237, 9229, 9234, 9235, 9111, 22233, 22270, 22264, 22243, 22244, 22253, 9248, -15960, -15985, -15991, -15982, -15979, -15972, -15909, -15979, -15980, -15985, -15909, -15971, -15980, -15986, -15979, -15969, -15935, -15909, 2380, -17338, -17333, -17340, -17331, -17319, -17314, -17320, -17341, -17340, -17331, -17319, 1795, 2078, -16312, 185, 13810, 8230, 3479, 8258, 7939, -12992, -6432, 3432, 16042, 16056, 16056, 16046, 16063, 16056, 16100};

    /* JADX INFO: renamed from: ֫ */
    public final C1012 f34918;

    /* JADX INFO: renamed from: ۖ */
    public final int f34919;

    /* JADX INFO: renamed from: ۘ */
    public volatile SharedPreferences f34920;

    /* JADX INFO: renamed from: ۜ */
    public final String f34921;

    /* JADX INFO: renamed from: ۡ */
    public InterfaceC3756 f34922;

    /* JADX INFO: renamed from: ۢ */
    public final C13303 f34923;

    /* JADX INFO: renamed from: ۧ */
    public ClipboardManager f34924;

    /* JADX INFO: renamed from: ܳ */
    public final C13303 f34925;

    /* JADX INFO: renamed from: ܺ */
    public final C15646 f34926;

    /* JADX INFO: renamed from: ܽ */
    public C21862 f34927;

    /* JADX INFO: renamed from: ܿ */
    public final C1012 f34928;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 f34929;

    /* JADX INFO: renamed from: ᩴ */
    public final int f34930;

    /* JADX INFO: renamed from: ᩵ */
    public final String f34931;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC14485 f34932;

    /* JADX INFO: renamed from: ᩻ */
    public final String f34933;

    @Override // bin.p000mt.plugin.api.PluginContext
    public final int getHostVersionCode() {
        return 26101061;
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getHostVersionName() {
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
        int i7 = -1820633420;
        int i8 = C0866.f81837;
        int i9 = RunnableC0938.f81886;
        int iM55979 = C0946.m55979("᩷ܰ") ^ i9;
        int i10 = ((iM55979 ^ i8) * (-6923)) ^ (-555424111);
        int i11 = -1071229787;
        while (true) {
            i7 = ((((i7 ^ i8) * (-10893)) >> 31) & i10) ^ (iM55979 ^ i11);
            switch (i7) {
                case -2069120883:
                case -1096130499:
                    i5 = 9251;
                    iM55979 = (i9 - C0946.m55979("ܿۙ")) * (-31);
                    i10 = ((iM55979 ^ i8) * (-4547)) ^ (-107149094);
                    i11 = 1538723387;
                    break;
                case -1851879261:
                case 235404384:
                    i5 = 30944;
                    iM55979 = (i9 - C0946.m55979("ܿۙ")) * (-31);
                    i10 = ((iM55979 ^ i8) * (-4547)) ^ (-107149094);
                    i11 = 1538723387;
                    break;
                case -1746844008:
                case 1928619833:
                    int i12 = i3 + i4;
                    if (i2 - (i12 + i12) > 0) {
                        iM55979 = (C0946.m55979("۟ᩴ") ^ i8) * 23;
                        i10 = ((iM55979 ^ i9) * (-28603)) ^ 695833011;
                        i11 = 36853242;
                    } else {
                        iM55979 = C0946.m55979("᩵ᩳ") ^ i8;
                        i10 = ((iM55979 ^ i9) * 29387) ^ (-1641085779);
                        i11 = 1636464800;
                    }
                    break;
                case -1708150859:
                case 2094243067:
                    s = sArr[c];
                    if (RunnableC0897.f81856) {
                        iM55979 = (i8 - C0873.m55680("᩵ۨ")) * (-31);
                        i10 = ((iM55979 ^ i9) * 1127) ^ (-275885219);
                        i11 = 1606440253;
                    } else {
                        iM55979 = C0873.m55680("ܿ۬") ^ i8;
                        i10 = ((iM55979 ^ i9) * 527) ^ 47996797;
                        i11 = -1578822408;
                    }
                    break;
                case -1553151614:
                case 2064280954:
                    i4 = 213685924;
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0873.m55680("᩸ܳ") + i9) * 37;
                        i10 = ((iM55979 ^ i8) * 22325) ^ (-1081865802);
                        i11 = 677404674;
                    } else {
                        iM55979 = C0873.m55680("᩸ۨ") ^ i9;
                        i10 = ((iM55979 ^ i8) * 377) ^ 455378096;
                        i11 = 100770498;
                    }
                    break;
                case -1529026099:
                case 1090661926:
                    i = s + 14618;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0873.m55680("ܿ۬") ^ i8;
                        i10 = ((iM55979 ^ i9) * 527) ^ 47996797;
                        i11 = -1578822408;
                    } else {
                        iM55979 = (C0873.m55680("ۚܳ") + i8) * (-103);
                        i10 = ((iM55979 ^ i9) * 2341) ^ (-1977285229);
                        i11 = -703408930;
                    }
                    break;
                case -1451188523:
                case -930346899:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0873.m55680("᩸ܳ") + i9) * 37;
                        i10 = ((iM55979 ^ i8) * 22325) ^ (-1081865802);
                        i11 = 677404674;
                    } else {
                        iM55979 = (i9 - C0873.m55680("᩺᩺")) * (-89);
                        i10 = ((iM55979 ^ i8) * 25083) ^ 792275449;
                        i11 = -1668925607;
                    }
                    break;
                case -1380778894:
                case 1227193157:
                    C0890.m55740();
                    ServiceConnectionC1013.m56157();
                    iM55979 = (C0946.m55979("ۡܰ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i10 = ((iM55979 ^ i8) * (-12877)) ^ (-2046175052);
                    i11 = 606691120;
                    break;
                case -1306834698:
                case 238227339:
                    sArr2 = f82134;
                    i6 = 54;
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0873.m55680("ܿ۬") ^ i8;
                        i10 = ((iM55979 ^ i9) * 527) ^ 47996797;
                        i11 = -1578822408;
                    } else {
                        iM55979 = C0946.m55979("۬ܿ") ^ i8;
                        i10 = ((iM55979 ^ i9) * 3053) ^ (-1428163273);
                        i11 = 1010209503;
                    }
                    break;
                case -795063969:
                case -295510302:
                    i2 = i * i;
                    i3 = s * s;
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0946.m55979("ᩳۙ") ^ i9;
                        i10 = ((iM55979 ^ i8) * 5463) ^ 1126781819;
                        i11 = -336505271;
                    } else {
                        iM55979 = C0873.m55680("ۛ᩹") ^ i9;
                        i10 = ((iM55979 ^ i8) * 1611) ^ 1286328581;
                        i11 = -353805138;
                    }
                    break;
                case -731135745:
                case -645207871:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("ۡܰ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((iM55979 ^ i8) * (-12877)) ^ (-2046175052);
                        i11 = 606691120;
                    } else {
                        iM55979 = C0946.m55979("ۨ᩸") ^ i8;
                        i10 = ((iM55979 ^ i9) * 7865) ^ 1837750460;
                        i11 = 2115098080;
                    }
                    break;
                case -629612849:
                case 1040614171:
                    if (C0898.f81858 > 0) {
                        iM55979 = C0873.m55680("ᩳۨ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-3039)) ^ 509469771;
                        i11 = 1922207908;
                    } else {
                        iM55979 = (C0946.m55979("ۡܰ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((iM55979 ^ i8) * (-12877)) ^ (-2046175052);
                        i11 = 606691120;
                    }
                    break;
                case -485156593:
                case 1652524362:
                    return C0992.m56102(sArr2, i6, 7, i5);
                case -366771073:
                case 1867009731:
                    c = '5';
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("ܿ۬") ^ i8;
                        i10 = ((iM55979 ^ i9) * 527) ^ 47996797;
                        i11 = -1578822408;
                    } else {
                        iM55979 = (C0946.m55979("ܽܿ") ^ i9) * (-73);
                        i10 = ((iM55979 ^ i8) * (-22537)) ^ (-1311607389);
                        i11 = -65319283;
                    }
                    break;
                case -344186393:
                case 2047980453:
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("᩸ܳ") + i9) * 37;
                        i10 = ((iM55979 ^ i8) * 22325) ^ (-1081865802);
                        i11 = 677404674;
                    } else {
                        iM55979 = (C0946.m55979("ۡܰ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((iM55979 ^ i8) * (-12877)) ^ (-2046175052);
                        i11 = 606691120;
                    }
                    break;
                case 1092431429:
                case 1178657651:
                    C1048.m56305();
                    C1028.m56247();
                    return null;
                case 1371975702:
                case 1989973239:
                    sArr = f82134;
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("ᩳۨ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-3039)) ^ 509469771;
                        i11 = 1922207908;
                    } else {
                        iM55979 = (C0873.m55680("ܳۖ") + i8) * 59;
                        i10 = ((iM55979 ^ i9) * 23955) ^ (-711157280);
                        i11 = -1512710897;
                    }
                    break;
                case 1647917463:
                case 2126947702:
                    C0890.m55740();
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("ᩳۙ") ^ i9;
                        i10 = ((iM55979 ^ i8) * 5463) ^ 1126781819;
                        i11 = -336505271;
                    } else {
                        iM55979 = C0873.m55680("ᩳۨ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-3039)) ^ 509469771;
                        i11 = 1922207908;
                    }
                    break;
                default:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0946.m55979("ۡܰ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((iM55979 ^ i8) * (-12877)) ^ (-2046175052);
                        i11 = 606691120;
                    } else {
                        iM55979 = C0946.m55979("ۢܿ") ^ i9;
                        i10 = ((iM55979 ^ i8) * (-10473)) ^ (-1058663024);
                        i11 = 2076215240;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m28710(String str, Object... objArr) {
        Resources resourcesM16235 = null;
        Configuration configuration = null;
        Locale locale = null;
        int i = 183097102;
        int i2 = C0989.f81920;
        int i3 = ViewOnClickListenerC0939.f81888;
        int iM55979 = C0946.m55979("᩻۟") ^ i3;
        int i4 = ((iM55979 ^ i2) * 14681) ^ 1496377170;
        int i5 = 908510975;
        while (true) {
            i = ((((i ^ i2) * 11381) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2018772000:
                case -1782820070:
                    C0845.m55584();
                    if (C1124.m56367() < 0) {
                        iM55979 = (i2 - C0873.m55680("ۛ֡")) * (-113);
                        i4 = ((iM55979 ^ i3) * 17795) ^ 792474018;
                        i5 = 226281335;
                    } else {
                        iM55979 = (C0873.m55680("ۨ᩷") + i3) * (-107);
                        i4 = ((iM55979 ^ i2) * 2605) ^ 1385804985;
                        i5 = 18358658;
                    }
                    break;
                case -1800309499:
                case -1307570686:
                    if (C0989.m56095() <= 0) {
                        iM55979 = (i2 - C0873.m55680("ۛ֡")) * (-113);
                        i4 = ((iM55979 ^ i3) * 17795) ^ 792474018;
                        i5 = 226281335;
                    } else {
                        iM55979 = (C0946.m55979("ۜ᩷") + i3) * 37;
                        i4 = ((iM55979 ^ i2) * 95) ^ 346144148;
                        i5 = -1260150525;
                    }
                    break;
                case -1649742887:
                case 1122097886:
                    if (C1964.m56597() != 0) {
                        iM55979 = (C0946.m55979("۠ܰ") ^ i2) * 97;
                        i4 = ((iM55979 ^ i3) * 27795) ^ 1082073899;
                        i5 = -1256427226;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ᩻") ^ i3) * (-41);
                        i4 = ((iM55979 ^ i2) * (-5403)) ^ 1687102172;
                        i5 = 1145141611;
                    }
                    break;
                case -1316028287:
                case -978469205:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("ܺܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1349)) ^ (-2138599846);
                        i5 = -1046540179;
                    } else {
                        iM55979 = (C0873.m55680("ۨ᩷") + i3) * (-107);
                        i4 = ((iM55979 ^ i2) * 2605) ^ 1385804985;
                        i5 = 18358658;
                    }
                    break;
                case -1255553685:
                case 701954664:
                    if (C1024.f81946) {
                        iM55979 = C0946.m55979("ܺܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1349)) ^ (-2138599846);
                        i5 = -1046540179;
                    } else {
                        iM55979 = (C0946.m55979("ۨ᩺") ^ i3) * (-53);
                        i4 = ((iM55979 ^ i2) * 7189) ^ 205425380;
                        i5 = 904343633;
                    }
                    break;
                case -1023733854:
                case -290049688:
                    if (C0989.m56095() <= 0) {
                        iM55979 = (i2 - C0873.m55680("ۛ֡")) * (-113);
                        i4 = ((iM55979 ^ i3) * 17795) ^ 792474018;
                        i5 = 226281335;
                    } else {
                        iM55979 = (C0946.m55979("ۚۡ") ^ i2) * (-71);
                        i4 = ((iM55979 ^ i3) * 22211) ^ 2114881142;
                        i5 = 709330232;
                    }
                    break;
                case -964621976:
                case 684729010:
                    C0854.m55595();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0946.m55979("۠ܰ") ^ i2) * 97;
                        i4 = ((iM55979 ^ i3) * 27795) ^ 1082073899;
                        i5 = -1256427226;
                    } else {
                        iM55979 = (C0873.m55680("ۨ᩷") + i3) * (-107);
                        i4 = ((iM55979 ^ i2) * 2605) ^ 1385804985;
                        i5 = 18358658;
                    }
                    break;
                case -710020932:
                case 1228268208:
                    C0898.m55800();
                    return null;
                case -627530602:
                case -249431594:
                    return String.format(locale, str, objArr);
                case -338405127:
                case 2117229795:
                    if (C0917.f81868) {
                        iM55979 = (C0946.m55979("۠ܰ") ^ i2) * 97;
                        i4 = ((iM55979 ^ i3) * 27795) ^ 1082073899;
                        i5 = -1256427226;
                    } else {
                        iM55979 = C0946.m55979("۫֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14845)) ^ (-1567449977);
                        i5 = 1194461365;
                    }
                    break;
                case 420529274:
                case 851480435:
                    configuration = resourcesM16235.getConfiguration();
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("ۙۚ") + i2) * (-127);
                        i4 = ((iM55979 ^ i3) * (-30481)) ^ 777883307;
                        i5 = -758654663;
                    } else {
                        iM55979 = C0873.m55680("ܽᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 20469) ^ (-516715201);
                        i5 = -723682936;
                    }
                    break;
                case 570382793:
                case 1318648344:
                    Locale localeM13897 = C1877.m50008(configuration).m13897(0);
                    if (localeM13897 == null) {
                        iM55979 = (i2 - C0946.m55979("ۧܰ")) * 59;
                        i4 = ((iM55979 ^ i3) * 9589) ^ 764657875;
                        i5 = 1005659606;
                    } else {
                        locale = localeM13897;
                        iM55979 = C0946.m55979("֫۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9025)) ^ (-879471732);
                        i5 = -1526535307;
                    }
                    break;
                case 652256142:
                case 1160007052:
                    locale = Locale.getDefault();
                    iM55979 = C0946.m55979("֫۟") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-9025)) ^ (-879471732);
                    i5 = -1526535307;
                    break;
                case 1074519450:
                case 1644583180:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("۠ܰ") ^ i2) * 97;
                        i4 = ((iM55979 ^ i3) * 27795) ^ 1082073899;
                        i5 = -1256427226;
                    } else {
                        iM55979 = (C0873.m55680("֫֨") + i3) * 109;
                        i4 = ((iM55979 ^ i2) * 24999) ^ (-1658281260);
                        i5 = -1574139746;
                    }
                    break;
                case 1240319067:
                case 1520674518:
                    resourcesM16235 = C7050.m16235();
                    if (C0861.f81831) {
                        iM55979 = (C0873.m55680("֫ۚ") + i3) * 33;
                        i4 = ((iM55979 ^ i2) * (-31815)) ^ (-181146816);
                        i5 = -361808651;
                    } else {
                        iM55979 = C0946.m55979("ܺܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1349)) ^ (-2138599846);
                        i5 = -1046540179;
                    }
                    break;
                case 1358809771:
                case 1901505690:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (i2 - C0873.m55680("ۛ֡")) * (-113);
                        i4 = ((iM55979 ^ i3) * 17795) ^ 792474018;
                        i5 = 226281335;
                    } else {
                        iM55979 = C0946.m55979("۠ۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26855)) ^ (-1735234616);
                        i5 = 519462508;
                    }
                    break;
                case 1425596481:
                case 2137431962:
                    C0937.m55918();
                    C0898.m55800();
                    iM55979 = (C0873.m55680("ۨ᩷") + i3) * (-107);
                    i4 = ((iM55979 ^ i2) * 2605) ^ 1385804985;
                    i5 = 18358658;
                    break;
                default:
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0946.m55979("ۙۚ") + i2) * (-127);
                        i4 = ((iM55979 ^ i3) * (-30481)) ^ 777883307;
                        i5 = -758654663;
                    } else {
                        iM55979 = C0873.m55680("ۤ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30045) ^ 757339481;
                        i5 = -1127234168;
                    }
                    break;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final InputStream getAssetsAsStream(String str) {
        Object obj = null;
        C18249 c18249 = null;
        C9612 c9612M41514 = null;
        int i = -1952146833;
        int i2 = C0992.f81922;
        int i3 = C1036.f81953;
        int iM55680 = (C0873.m55680("ۙܽ") ^ i3) * 65;
        int i4 = ((iM55680 ^ i2) * 13997) ^ (-376239665);
        int i5 = -72505815;
        while (true) {
            i = ((((i ^ i2) * (-11893)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1971045874:
                case 1522080611:
                    return this.f34932.getAssetsAsStream(str);
                case -1675758522:
                case 1393145439:
                    ServiceConnectionC1013.m56157();
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("ܽᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29899)) ^ 1592167445;
                        i5 = 1256257038;
                    } else {
                        iM55680 = C0873.m55680("ۜ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 7165) ^ (-1493444600);
                        i5 = 1089377258;
                    }
                    break;
                case -1488878296:
                case -93561422:
                    C1024.m56209();
                    C1229.m56410();
                    iM55680 = C0873.m55680("ۜ֡") ^ i2;
                    i4 = ((iM55680 ^ i3) * 7165) ^ (-1493444600);
                    i5 = 1089377258;
                    break;
                case -1333107643:
                case 360860985:
                    this.f34932 = c9612M41514;
                    if (C0863.f81833 > 0) {
                        this.f34922 = new C15155(this);
                        iM55680 = (C0873.m55680("ۗۨ") ^ i3) * 115;
                        i4 = ((iM55680 ^ i2) * (-6599)) ^ (-1442536239);
                        i5 = 854499426;
                    } else {
                        iM55680 = C0873.m55680("ܽᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29899)) ^ 1592167445;
                        i5 = 1256257038;
                    }
                    break;
                case -1222766246:
                case -607450152:
                    if (this.f34932 != null) {
                        iM55680 = (C0873.m55680("ۗۨ") ^ i3) * 115;
                        i4 = ((iM55680 ^ i2) * (-6599)) ^ (-1442536239);
                        i5 = 854499426;
                    } else {
                        iM55680 = (C0873.m55680("᩵᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i3) * 1079) ^ (-139057798);
                        i5 = -1099086060;
                    }
                    break;
                case -1180377672:
                case 556264109:
                    if (C1929.m56553()) {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25935)) ^ 1247770053;
                        i5 = -932205702;
                    } else {
                        iM55680 = (C0873.m55680("ܰۖ") ^ i3) * 57;
                        i4 = ((iM55680 ^ i2) * (-11889)) ^ 593928479;
                        i5 = 298764564;
                    }
                    break;
                case -638576006:
                case 1682884600:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25935)) ^ 1247770053;
                        i5 = -932205702;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۤ᩹")) * (-79);
                        i4 = ((iM55680 ^ i3) * (-31821)) ^ (-1075446769);
                        i5 = 315906259;
                    }
                    break;
                case -518124261:
                case 573291857:
                    obj = this.f34923.f37359;
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0873.m55680("᩹ۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 27953) ^ 1975071017;
                        i5 = -1260681265;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩺ܰ")) * (-49);
                        i4 = ((iM55680 ^ i2) * 24397) ^ 2029211280;
                        i5 = -21316940;
                    }
                    break;
                case 384957874:
                case 1140555917:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25935)) ^ 1247770053;
                        i5 = -932205702;
                    } else {
                        iM55680 = (i2 - C0946.m55979("۫ۨ")) * (-85);
                        i4 = ((iM55680 ^ i3) * (-31369)) ^ 335278936;
                        i5 = 1672455854;
                    }
                    break;
                case 634312947:
                case 894477802:
                    C0898.m55800();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55680 = C0873.m55680("᩹ۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 27953) ^ 1975071017;
                        i5 = -1260681265;
                    } else {
                        iM55680 = C0873.m55680("ܽᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29899)) ^ 1592167445;
                        i5 = 1256257038;
                    }
                    break;
                case 832473765:
                case 1264493464:
                    c18249 = (C18249) obj;
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("۟ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12651) ^ (-1545224315);
                        i5 = -1242936197;
                    } else {
                        iM55680 = C0873.m55680("ܿܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17527)) ^ 1601910052;
                        i5 = -605811834;
                    }
                    break;
                case 877691542:
                case 1379637927:
                    C1929.m56553();
                    if (C0845.m55584() <= 0) {
                        iM55680 = C0946.m55979("۟ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12651) ^ (-1545224315);
                        i5 = -1242936197;
                    } else {
                        iM55680 = C0873.m55680("ܽᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29899)) ^ 1592167445;
                        i5 = 1256257038;
                    }
                    break;
                case 910517677:
                case 1103209383:
                    c9612M41514 = C18249.m41514(c18249);
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25935)) ^ 1247770053;
                        i5 = -932205702;
                    } else {
                        iM55680 = C0873.m55680("ۛۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28139)) ^ (-79491029);
                        i5 = 1449761038;
                    }
                    break;
                case 1069525232:
                case 1343403811:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25935)) ^ 1247770053;
                        i5 = -932205702;
                    } else {
                        iM55680 = C0873.m55680("ۘۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3415)) ^ (-1720649920);
                        i5 = -1369779585;
                    }
                    break;
                case 1140175573:
                case 2037930959:
                    if (C0955.m56025()) {
                        iM55680 = C0873.m55680("᩹ۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 27953) ^ 1975071017;
                        i5 = -1260681265;
                    } else {
                        iM55680 = (C0873.m55680("ᩳۧ") + i3) * (-11);
                        i4 = ((iM55680 ^ i2) * (-29615)) ^ 372384718;
                        i5 = 732331277;
                    }
                    break;
                case 1396892027:
                case 2047415711:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("۟ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12651) ^ (-1545224315);
                        i5 = -1242936197;
                    } else {
                        iM55680 = C0873.m55680("֡ܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23533) ^ (-2025586258);
                        i5 = 1026070644;
                    }
                    break;
                default:
                    C0861.m55626();
                    return null;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final LocalString getFileLocalString(File file, String str) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int iM55680;
        int i4;
        int i5;
        C21862 c21862;
        int i6;
        int iM559711;
        int i7;
        int i8;
        int i9 = C1124.f82007;
        int i10 = C1028.f81950;
        int iM559712 = C0946.m55979("᩸ܺ") ^ i9;
        int i11 = ((iM559712 ^ i10) * 9201) ^ 988069772;
        short[] sArr = null;
        int i12 = iM559712 ^ 433093156;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = -854502937;
        C21862 c21863 = null;
        C21862 c21864 = null;
        Reference reference = null;
        C1012 c1012 = null;
        while (true) {
            int i17 = i12 ^ (i11 & (((i16 ^ i10) * (-17227)) >> 31));
            switch (i17) {
                case -2129668997:
                case -405666539:
                    i13 = i13;
                    i14 = i14;
                    i17 = i17;
                    sArr = f82134;
                    if (C1017.f81942 >= 0) {
                        iM559711 = C0946.m55979("۬ۢ") ^ i9;
                        i7 = ((iM559711 ^ i10) * 30767) ^ 10560482;
                        i8 = -39427819;
                    } else {
                        iM559711 = (C0946.m55979("ۧۡ") + i9) * 23;
                        i7 = ((iM559711 ^ i10) * 31761) ^ (-606423786);
                        i8 = 979156901;
                    }
                    int i18 = iM559711 ^ i8;
                    i16 = i17;
                    i14 = i14;
                    i12 = i18;
                    i11 = i7;
                    i13 = i13;
                    break;
                case -2043182806:
                case 277978164:
                    C0894.m55769();
                    sArr = sArr;
                    i13 = i13;
                    i14 = i14;
                    i17 = i17;
                    iM55979 = (C0946.m55979("ۢ۫") + i10) * 25;
                    i = ((iM55979 ^ i9) * 21009) ^ (-204236567);
                    i2 = -187935935;
                    i6 = iM55979 ^ i2;
                    i16 = i17;
                    i13 = i13;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case -2016157841:
                case -8261057:
                    C1964.m56597();
                    return null;
                case -1674068317:
                case 1282167378:
                    sArr = sArr;
                    i13 = i13;
                    i14 = i14;
                    i17 = i17;
                    c21862 = (C21862) reference.get();
                    c21864 = c21862;
                    iM55979 = (C0873.m55680("֫ۤ") + i9) * 127;
                    i = ((iM55979 ^ i10) * (-23015)) ^ (-713240776);
                    i2 = -1902623682;
                    i6 = iM55979 ^ i2;
                    i16 = i17;
                    i13 = i13;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case -1548801485:
                case 987621861:
                    sArr = sArr;
                    i13 = i13;
                    i17 = i17;
                    int i19 = i13 + 96687889;
                    i14 = i19 + i19;
                    if (C0882.f81846) {
                        iM55680 = C0946.m55979("۫᩷") ^ i9;
                        i4 = ((iM55680 ^ i10) * (-31447)) ^ (-1822072356);
                        i5 = -1967008256;
                    } else {
                        iM55680 = C0873.m55680("ܺۛ") ^ i9;
                        i4 = ((iM55680 ^ i10) * 25531) ^ 1432216009;
                        i5 = 821294649;
                    }
                    int i20 = iM55680 ^ i5;
                    i14 = i14;
                    i11 = i4;
                    i16 = i17;
                    i13 = i13;
                    i12 = i20;
                    sArr = sArr;
                    break;
                case -1377730266:
                case 554238957:
                    AbstractC0942.m55971();
                    if (C0854.f81826 == 0) {
                        sArr = sArr;
                        i17 = i17;
                        iM55680 = C0946.m55979("۫᩷") ^ i9;
                        i4 = ((iM55680 ^ i10) * (-31447)) ^ (-1822072356);
                        i5 = -1967008256;
                        int i21 = iM55680 ^ i5;
                        i14 = i14;
                        i11 = i4;
                        i16 = i17;
                        i13 = i13;
                        i12 = i21;
                        sArr = sArr;
                    }
                    sArr = sArr;
                    i13 = i13;
                    i14 = i14;
                    i17 = i17;
                    iM55979 = (C0946.m55979("ۢ۫") + i10) * 25;
                    i = ((iM55979 ^ i9) * 21009) ^ (-204236567);
                    i2 = -187935935;
                    i6 = iM55979 ^ i2;
                    i16 = i17;
                    i13 = i13;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case -1341703853:
                case 973229869:
                    i17 = i17;
                    StringBuilder sb = new StringBuilder();
                    if (C0912.f81867 <= 0) {
                        sArr = sArr;
                        i14 = i14;
                    } else {
                        sArr = sArr;
                        C1003.m56121(sb, file.getPath());
                        if (AbstractC0942.f81890 <= 0) {
                            iM55680 = C0946.m55979("۫᩷") ^ i9;
                            i4 = ((iM55680 ^ i10) * (-31447)) ^ (-1822072356);
                            i5 = -1967008256;
                            int i22 = iM55680 ^ i5;
                            i14 = i14;
                            i11 = i4;
                            i16 = i17;
                            i13 = i13;
                            i12 = i22;
                            sArr = sArr;
                        } else {
                            i13 = i13;
                            i14 = i14;
                            String strM56325 = C1053.m56325(f82134, 52, 1, i15);
                            if (!C0947.f81895) {
                                C0912.m55825(sb, strM56325);
                                C0912.m55825(sb, str);
                                String strM55639 = C0863.m55639(sb);
                                if (C1964.f83032 > 0) {
                                    C10462 c10462 = new C10462(file);
                                    if (C1071.f81975 <= 0) {
                                        iM55979 = (C0946.m55979("ۢ۫") + i10) * 25;
                                        i = ((iM55979 ^ i9) * 21009) ^ (-204236567);
                                        i2 = -187935935;
                                    } else {
                                        C21862 c21865 = new C21862(this, str, strM55639, c10462);
                                        c1012.put(str, new SoftReference(c21865));
                                        c21863 = c21865;
                                        iM55979 = C0873.m55680("ܶ۟") ^ i10;
                                        i = ((iM55979 ^ i9) * 12209) ^ 1356737952;
                                        i2 = 2117125811;
                                    }
                                    i6 = iM55979 ^ i2;
                                    i16 = i17;
                                    i13 = i13;
                                    i14 = i14;
                                    i12 = i6;
                                    i11 = i;
                                    sArr = sArr;
                                }
                            }
                            i13 = i13;
                        }
                    }
                    iM559710 = C0873.m55680("ܳ᩶") ^ i9;
                    i = ((iM559710 ^ i10) * (-2345)) ^ 973918377;
                    i3 = 443237040;
                    i6 = iM559710 ^ i3;
                    i16 = i17;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case -1004683276:
                case 417949759:
                    return c21863;
                case -732472960:
                case 994274549:
                    sArr = sArr;
                    i13 = i13;
                    i14 = i14;
                    i17 = i17;
                    c1012 = this.f34928;
                    c21862 = null;
                    reference = (Reference) c1012.getOrDefault(str, null);
                    if (reference != null) {
                        iM55979 = (C0946.m55979("ۙۙ") + i10) * (-111);
                        i = ((iM55979 ^ i9) * (-11485)) ^ 1449653815;
                        i2 = 721826695;
                    } else {
                        c21864 = c21862;
                        iM55979 = (C0873.m55680("֫ۤ") + i9) * 127;
                        i = ((iM55979 ^ i10) * (-23015)) ^ (-713240776);
                        i2 = -1902623682;
                    }
                    i6 = iM55979 ^ i2;
                    i16 = i17;
                    i13 = i13;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case -574345073:
                case -254419225:
                    sArr = sArr;
                    i13 = i13;
                    i14 = i14;
                    i17 = i17;
                    s2 = 9833;
                    if (C1194.f82045 == 0) {
                        iM55979 = (C0873.m55680("ᩳۡ") ^ i10) * 119;
                        i = ((iM55979 ^ i9) * 29379) ^ (-1643099645);
                        i2 = -352499856;
                        i6 = iM55979 ^ i2;
                        i16 = i17;
                        i13 = i13;
                        i14 = i14;
                        i12 = i6;
                        i11 = i;
                        sArr = sArr;
                    } else {
                        sArr = sArr;
                        iM559711 = C0946.m55979("۬ۢ") ^ i9;
                        i7 = ((iM559711 ^ i10) * 30767) ^ 10560482;
                        i8 = -39427819;
                        int i110 = iM559711 ^ i8;
                        i16 = i17;
                        i14 = i14;
                        i12 = i110;
                        i11 = i7;
                        i13 = i13;
                    }
                    break;
                case -489487795:
                case -186359375:
                    sArr = sArr;
                    i13 = i13;
                    i14 = i14;
                    i17 = i17;
                    if (C0927.f81875) {
                        iM55979 = (C0946.m55979("ܳܶ") ^ i10) * 57;
                        i = ((iM55979 ^ i9) * (-31419)) ^ 1128549390;
                        i2 = 1268144880;
                    } else {
                        iM55979 = C0946.m55979("ۡ᩺") ^ i10;
                        i = ((iM55979 ^ i9) * (-28885)) ^ 1370030775;
                        i2 = -2129943991;
                    }
                    i6 = iM55979 ^ i2;
                    i16 = i17;
                    i13 = i13;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case -144925884:
                case -18784086:
                    if (!C0892.f81851) {
                        sArr = sArr;
                        i13 = i13;
                        i14 = i14;
                        i17 = i17;
                        iM55979 = (C0946.m55979("ܳܶ") ^ i10) * 57;
                        i = ((iM55979 ^ i9) * (-31419)) ^ 1128549390;
                        i2 = 1268144880;
                        i6 = iM55979 ^ i2;
                        i16 = i17;
                        i13 = i13;
                        i14 = i14;
                        i12 = i6;
                        i11 = i;
                        sArr = sArr;
                    }
                    sArr = sArr;
                    i13 = i13;
                    i14 = i14;
                    i17 = i17;
                    iM55979 = (C0946.m55979("ۢ۫") + i10) * 25;
                    i = ((iM55979 ^ i9) * 21009) ^ (-204236567);
                    i2 = -187935935;
                    i6 = iM55979 ^ i2;
                    i16 = i17;
                    i13 = i13;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case -133065488:
                case 628512397:
                    sArr = sArr;
                    i13 = i13;
                    i14 = i14;
                    i17 = i17;
                    int i23 = s + s2;
                    if ((i23 * i23) - i14 <= 0) {
                        iM55979 = C0873.m55680("ۜܺ") ^ i9;
                        i = ((iM55979 ^ i10) * 11629) ^ (-1565758026);
                        i2 = -709691627;
                    } else {
                        iM55979 = C0946.m55979("᩸۠") ^ i10;
                        i = ((iM55979 ^ i9) * 18749) ^ (-1680335852);
                        i2 = -1669562016;
                    }
                    i6 = iM55979 ^ i2;
                    i16 = i17;
                    i13 = i13;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case 157785339:
                case 539747630:
                    sArr = sArr;
                    i13 = i13;
                    i14 = i14;
                    i17 = i17;
                    if (c21864 == null) {
                        iM55979 = (C0873.m55680("۟᩷") + i9) * (-41);
                        i = ((iM55979 ^ i10) * (-22547)) ^ 1206900978;
                        i2 = -1308471670;
                    } else {
                        c21863 = c21864;
                        iM55979 = C0873.m55680("ܶ۟") ^ i10;
                        i = ((iM55979 ^ i9) * 12209) ^ 1356737952;
                        i2 = 2117125811;
                    }
                    i6 = iM55979 ^ i2;
                    i16 = i17;
                    i13 = i13;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case 268763606:
                case 948243612:
                    i15 = 13478;
                    iM55979 = (C0946.m55979("۬ۛ") + i9) * (-67);
                    i = ((iM55979 ^ i10) * (-18379)) ^ 2140530290;
                    i2 = -786695717;
                    i6 = iM55979 ^ i2;
                    i16 = i17;
                    i13 = i13;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case 355521142:
                case 1784348866:
                    sArr = sArr;
                    i14 = i14;
                    i17 = i17;
                    s = sArr[51];
                    i13 = s * s;
                    if (C0912.m55833()) {
                        iM559710 = C0873.m55680("ܳ᩶") ^ i9;
                        i = ((iM559710 ^ i10) * (-2345)) ^ 973918377;
                        i3 = 443237040;
                    } else {
                        iM559710 = C0946.m55979("۫ܳ") ^ i10;
                        i = ((iM559710 ^ i9) * 1563) ^ (-1021741464);
                        i3 = 1543797928;
                    }
                    i6 = iM559710 ^ i3;
                    i16 = i17;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
                case 848452201:
                case 1744176827:
                    C0912.m55833();
                    if (C0912.f81867 <= 0) {
                        i13 = i13;
                        i14 = i14;
                        i17 = i17;
                        iM559711 = C0946.m55979("۬ۢ") ^ i9;
                        i7 = ((iM559711 ^ i10) * 30767) ^ 10560482;
                        i8 = -39427819;
                        int i111 = iM559711 ^ i8;
                        i16 = i17;
                        i14 = i14;
                        i12 = i111;
                        i11 = i7;
                        i13 = i13;
                    } else {
                        sArr = sArr;
                        i13 = i13;
                        i14 = i14;
                        i17 = i17;
                        iM55979 = (C0946.m55979("ۢ۫") + i10) * 25;
                        i = ((iM55979 ^ i9) * 21009) ^ (-204236567);
                        i2 = -187935935;
                        i6 = iM55979 ^ i2;
                        i16 = i17;
                        i13 = i13;
                        i14 = i14;
                        i12 = i6;
                        i11 = i;
                        sArr = sArr;
                    }
                    break;
                default:
                    i15 = 51433;
                    iM55979 = (C0946.m55979("۬ۛ") + i9) * (-67);
                    i = ((iM55979 ^ i10) * (-18379)) ^ 2140530290;
                    i2 = -786695717;
                    i6 = iM55979 ^ i2;
                    i16 = i17;
                    i13 = i13;
                    i14 = i14;
                    i12 = i6;
                    i11 = i;
                    sArr = sArr;
                    break;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getPluginName() {
        String str = null;
        String strM55876 = null;
        int i = -2060614343;
        int i2 = C1025.f81947;
        int i3 = ViewOnClickListenerC0939.f81888;
        int iM55979 = (C0946.m55979("ۖۖ") + i3) * (-109);
        int i4 = ((iM55979 ^ i2) * (-28167)) ^ 1555682729;
        int i5 = -1251390447;
        while (true) {
            i = ((((i ^ i2) * (-5739)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2088211344:
                case -629185909:
                    if (C0927.m55870(str, 0) == '{') {
                        iM55979 = (C0873.m55680("᩻ۜ") ^ i2) * 45;
                        i4 = ((iM55979 ^ i3) * 20327) ^ 381395894;
                        i5 = 1312526152;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩳ۠")) * (-95);
                        i4 = ((iM55979 ^ i3) * (-13241)) ^ 1891787530;
                        i5 = -703898796;
                    }
                    break;
                case -1972665166:
                case 1599517909:
                    if (C1003.m56123() != 0) {
                        iM55979 = C0873.m55680("֫֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3279) ^ 846328705;
                        i5 = 1519662810;
                    } else {
                        iM55979 = (C0946.m55979("ۨ᩷") ^ i2) * 115;
                        i4 = ((iM55979 ^ i3) * (-17873)) ^ (-672107042);
                        i5 = 96100978;
                    }
                    break;
                case -1957671046:
                case -1437591820:
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("ᩳۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-24693)) ^ (-1383218036);
                        i5 = 1630253742;
                    } else {
                        iM55979 = (C0946.m55979("ܶ۟") ^ i3) * 99;
                        i4 = ((iM55979 ^ i2) * (-22543)) ^ 715742474;
                        i5 = -1290860892;
                    }
                    break;
                case -1801459907:
                case 1235601519:
                    if (C0854.m55595() >= 0) {
                        iM55979 = C0873.m55680("֫֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3279) ^ 846328705;
                        i5 = 1519662810;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۬᩶")) * 29;
                        i4 = ((iM55979 ^ i2) * (-12531)) ^ 2098049283;
                        i5 = -658966324;
                    }
                    break;
                case -1797619596:
                case -9932769:
                    return str;
                case -1783674478:
                case -134225177:
                    C1124.m56367();
                    if (C0890.f81849 == 0) {
                        iM55979 = C0946.m55979("ۙ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29099) ^ (-1892028487);
                        i5 = -236790983;
                    } else {
                        iM55979 = C0873.m55680("֫֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3279) ^ 846328705;
                        i5 = 1519662810;
                    }
                    break;
                case -1726169916:
                case -979370475:
                    str = this.f34921;
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("ۙ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29099) ^ (-1892028487);
                        i5 = -236790983;
                    } else {
                        iM55979 = C0873.m55680("ۖ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18835) ^ 2031554364;
                        i5 = -237566340;
                    }
                    break;
                case -1677868890:
                case -252731104:
                    if (C0890.m55740()) {
                        iM55979 = C0873.m55680("ܿۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 31929) ^ 2130533413;
                        i5 = 1108560076;
                    } else {
                        iM55979 = C0946.m55979("ۙ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29099) ^ (-1892028487);
                        i5 = -236790983;
                    }
                    break;
                case -1624334114:
                case 1384954637:
                    return strM55876;
                case -1546254304:
                case 999937374:
                    if (C1048.f81963) {
                        iM55979 = (C0946.m55979("ۛܰ") ^ i2) * (-59);
                        i4 = ((iM55979 ^ i3) * (-219)) ^ (-191083739);
                        i5 = 244120396;
                    } else {
                        iM55979 = (C0873.m55680("ۤ۫") ^ i3) * 19;
                        i4 = ((iM55979 ^ i2) * (-29675)) ^ 2090707383;
                        i5 = -199874556;
                    }
                    break;
                case -1514040909:
                case -980817209:
                    C0906.m55809();
                    if (C0989.f81920 < 0) {
                        iM55979 = (C0873.m55680("ۤ۫") ^ i3) * 19;
                        i4 = ((iM55979 ^ i2) * (-29675)) ^ 2090707383;
                        i5 = -199874556;
                    } else {
                        iM55979 = C0946.m55979("ۧ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17161) ^ (-25020752);
                        i5 = -469794575;
                    }
                    break;
                case -1510716369:
                case -155832567:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ۙ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29099) ^ (-1892028487);
                        i5 = -236790983;
                    } else {
                        iM55979 = C0873.m55680("ۢۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15485) ^ (-691704526);
                        i5 = 1612249834;
                    }
                    break;
                case -1374469526:
                case 57163970:
                    C1036.m56257();
                    return null;
                case -1251707148:
                case 1480086191:
                    if (C0892.m55748(1, str) == '}') {
                        iM55979 = C0873.m55680("᩹ܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 16685) ^ 1774686172;
                        i5 = 1646836625;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩳ۠")) * (-95);
                        i4 = ((iM55979 ^ i3) * (-13241)) ^ 1891787530;
                        i5 = -703898796;
                    }
                    break;
                case -1231786407:
                case 239201646:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("ۤ۫") ^ i3) * 19;
                        i4 = ((iM55979 ^ i2) * (-29675)) ^ 2090707383;
                        i5 = -199874556;
                    } else {
                        iM55979 = C0946.m55979("ۗܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23403) ^ (-2024573162);
                        i5 = -879884489;
                    }
                    break;
                case -893919980:
                case -214581150:
                    if (C1025.f81947 < 0) {
                        iM55979 = C0946.m55979("ۧ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17161) ^ (-25020752);
                        i5 = -469794575;
                    } else {
                        iM55979 = C0873.m55680("֫֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3279) ^ 846328705;
                        i5 = 1519662810;
                    }
                    break;
                case -587117196:
                case 318971733:
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("֫֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3279) ^ 846328705;
                        i5 = 1519662810;
                    } else {
                        iM55979 = C0946.m55979("֡ۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8067) ^ 1116730802;
                        i5 = -807480841;
                    }
                    break;
                case -574408269:
                case 984460542:
                    if (C0882.m55719(str) >= 3) {
                        iM55979 = C0873.m55680("᩹ۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 3799) ^ 1246748279;
                        i5 = -1906311886;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩳ۠")) * (-95);
                        i4 = ((iM55979 ^ i3) * (-13241)) ^ 1891787530;
                        i5 = -703898796;
                    }
                    break;
                case -476616944:
                case 906503232:
                    strM55876 = C0927.m55876(this, str);
                    if (strM55876 != null) {
                        iM55979 = C0873.m55680("ܰۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26019) ^ (-489905881);
                        i5 = -888282801;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩳ۠")) * (-95);
                        i4 = ((iM55979 ^ i3) * (-13241)) ^ 1891787530;
                        i5 = -703898796;
                    }
                    break;
                case 393779896:
                case 710869094:
                    C0912.m55833();
                    iM55979 = C0873.m55680("֫֨") ^ i2;
                    i4 = ((iM55979 ^ i3) * 3279) ^ 846328705;
                    i5 = 1519662810;
                    break;
                default:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0873.m55680("ۤ۫") ^ i3) * 19;
                        i4 = ((iM55979 ^ i2) * (-29675)) ^ 2090707383;
                        i5 = -199874556;
                    } else {
                        iM55979 = C0873.m55680("ۚ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26343)) ^ (-22344469);
                        i5 = -820064588;
                    }
                    break;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final void openLogViewer() {
        int i = -1492590780;
        int i2 = C1053.f81965;
        int i3 = C0949.f81897;
        int iM55680 = C0873.m55680("۠ᩴ") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-2341)) ^ (-1963514394);
        int i5 = 464328195;
        while (true) {
            i = ((((i ^ i3) * (-12229)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2109331971:
                case -1429184574:
                    C1012.m56134();
                    break;
                case -974833433:
                case 804376767:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("ܺܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5991) ^ 1666934666;
                        i5 = 69663257;
                    } else if (!C1025.m56230() && C1229.f82066 < 0) {
                        if (C1025.f81947 < 0) {
                            if (C1036.f81953 >= 0 || C0992.f81922 >= 0) {
                                iM55680 = C0946.m55979("ۜۨ") ^ i3;
                                i4 = ((iM55680 ^ i2) * 21105) ^ (-693042851);
                                i5 = 1938163816;
                            } else if (!C0955.f81898) {
                                if (C1124.m56367() >= 0) {
                                    iM55680 = C0946.m55979("֨ܿ") ^ i2;
                                    i4 = ((iM55680 ^ i3) * (-31781)) ^ (-902683581);
                                    i5 = 139259254;
                                } else if (C0898.m55800() > 0) {
                                    int i6 = 1;
                                    if (!C0955.f81898) {
                                        ThreadUtil.runOnUiThread(new RunnableC11074(this.f34933, i6));
                                    }
                                }
                                break;
                            }
                        }
                        iM55680 = (C0873.m55680("᩵ۚ") ^ i2) * 45;
                        i4 = ((iM55680 ^ i3) * (-26429)) ^ 1286495202;
                        i5 = 2124938286;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۧ᩷")) * (-51);
                        i4 = ((iM55680 ^ i2) * (-13707)) ^ 1872936601;
                        i5 = 1332894677;
                    }
                    break;
                case -475272568:
                case 1242680775:
                    if (!C0892.m55749()) {
                        iM55680 = C0946.m55979("ۜۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 21105) ^ (-693042851);
                        i5 = 1938163816;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۧ᩷")) * (-51);
                        i4 = ((iM55680 ^ i2) * (-13707)) ^ 1872936601;
                        i5 = 1332894677;
                    }
                    break;
                case 405959577:
                case 813315085:
                    if (C1964.m56597() == 0) {
                        iM55680 = C0946.m55979("֨ܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31781)) ^ (-902683581);
                        i5 = 139259254;
                    } else {
                        iM55680 = C0946.m55979("ۜۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 21105) ^ (-693042851);
                        i5 = 1938163816;
                    }
                    break;
                case 707745897:
                case 1007710921:
                    C1229.m56410();
                    iM55680 = C0946.m55979("ۜۨ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 21105) ^ (-693042851);
                    i5 = 1938163816;
                    break;
                default:
                    if (!C1048.f81963) {
                        iM55680 = C0946.m55979("ܺܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5991) ^ 1666934666;
                        i5 = 69663257;
                    } else {
                        iM55680 = C0946.m55979("֨ܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31781)) ^ (-902683581);
                        i5 = 139259254;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (p067l.C1036.f81953 < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12474(String str, String str2, int i, int i2, String str3, AbstractC17043 abstractC17043, C15646 c15646, C13303 c13303, C13303 c13304) {
        C1012 c1012;
        int iM55979;
        int i3;
        int i4;
        int iM55680;
        int i5;
        int i6;
        int iM55681;
        int i7;
        int i8;
        int iM559710;
        int i9;
        int i10;
        C12474 c12474 = this;
        C1012 c1013 = null;
        C1012 c1014 = null;
        int i11 = -1026838438;
        int i12 = C0877.f81843;
        int i13 = C0989.f81920;
        int iM55682 = C0873.m55680("ۙ᩷") ^ i12;
        int i14 = ((iM55682 ^ i13) * (-3165)) ^ (-1218500338);
        int i15 = iM55682 ^ 1924169455;
        while (true) {
            i11 = ((((i11 ^ i13) * 26121) >> 31) & i14) ^ i15;
            switch (i11) {
                case -1974452898:
                case -1889645724:
                    C0967.m56074();
                    c1012 = c1014;
                    iM55681 = (C0946.m55979("ۤ۠") + i12) * (-111);
                    i7 = ((iM55681 ^ i13) * 1693) ^ 1479497980;
                    i8 = -1887639317;
                    i15 = iM55681 ^ i8;
                    i14 = i7;
                    c1014 = c1012;
                    c12474 = this;
                    break;
                case -1701559077:
                case 980555825:
                    c1012 = c1014;
                    if (C1046.f81962 > 0) {
                        iM55681 = C0873.m55680("ۤۡ") ^ i12;
                        i7 = ((iM55681 ^ i13) * (-20703)) ^ (-151283174);
                        i8 = -1074623118;
                        i15 = iM55681 ^ i8;
                        i14 = i7;
                        c1014 = c1012;
                        c12474 = this;
                    } else {
                        c1014 = c1012;
                        int iM55683 = (i12 - C0873.m55680("᩹ᩴ")) * (-97);
                        i14 = ((iM55683 ^ i13) * (-13041)) ^ 1230219380;
                        i15 = iM55683 ^ 1961806080;
                        c12474 = this;
                    }
                    break;
                case -1690472289:
                case -1532821928:
                    c12474.f34929 = abstractC17043;
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0873.m55680("֨֫") + i13) * 69;
                        c1012 = c1014;
                        i5 = ((iM55680 ^ i12) * 19657) ^ 96653789;
                        i6 = 2091336617;
                        i14 = i5;
                        i15 = iM55680 ^ i6;
                        c1014 = c1012;
                    } else {
                        int iM55684 = (i13 - C0873.m55680("ܶܶ")) * 97;
                        i15 = iM55684 ^ (-1389435606);
                        i14 = ((iM55684 ^ i12) * 855) ^ (-286701448);
                    }
                    break;
                case -1516223009:
                case 834489106:
                    c1012 = c1014;
                    c12474.f34918 = c1013;
                    if (!C0947.f81895) {
                        iM55979 = C0946.m55979("ۢ֨") ^ i13;
                        i3 = ((iM55979 ^ i12) * (-28711)) ^ (-180164832);
                        i4 = -2107743837;
                        i15 = iM55979 ^ i4;
                        i14 = i3;
                        c1014 = c1012;
                    } else {
                        iM55681 = (C0946.m55979("ۤ۠") + i12) * (-111);
                        i7 = ((iM55681 ^ i13) * 1693) ^ 1479497980;
                        i8 = -1887639317;
                        i15 = iM55681 ^ i8;
                        i14 = i7;
                        c1014 = c1012;
                        c12474 = this;
                    }
                    break;
                case -1336869222:
                case -176514865:
                    C0866.m55645();
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("֨֫") + i13) * 69;
                        c1012 = c1014;
                        i5 = ((iM55680 ^ i12) * 19657) ^ 96653789;
                        i6 = 2091336617;
                        i14 = i5;
                        i15 = iM55680 ^ i6;
                        c1014 = c1012;
                    } else {
                        c1012 = c1014;
                        iM55681 = (C0873.m55680("֡ܶ") + i13) * (-79);
                        i7 = ((iM55681 ^ i12) * (-17697)) ^ (-537444235);
                        i8 = -715639832;
                        i15 = iM55681 ^ i8;
                        i14 = i7;
                        c1014 = c1012;
                        c12474 = this;
                    }
                    break;
                case -1062111766:
                case 1903915219:
                    c12474.f34919 = i;
                    c12474.f34930 = i2;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("֨֫") + i13) * 69;
                        c1012 = c1014;
                        i5 = ((iM55680 ^ i12) * 19657) ^ 96653789;
                        i6 = 2091336617;
                        i14 = i5;
                        i15 = iM55680 ^ i6;
                        c1014 = c1012;
                    } else {
                        int iM559711 = (i12 - C0946.m55979("ۤᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i15 = iM559711 ^ 648815173;
                        i14 = ((iM559711 ^ i13) * (-22019)) ^ 1256385911;
                    }
                    break;
                case -1003947198:
                case 194477240:
                    ViewOnClickListenerC0939.m55941();
                    throw new RuntimeException();
                case -837249415:
                case 789912099:
                    c12474.f34931 = str3;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        c1012 = c1014;
                        iM55681 = (C0873.m55680("֡ܶ") + i13) * (-79);
                        i7 = ((iM55681 ^ i12) * (-17697)) ^ (-537444235);
                        i8 = -715639832;
                        i15 = iM55681 ^ i8;
                        i14 = i7;
                        c1014 = c1012;
                        c12474 = this;
                    } else {
                        int iM55685 = (C0873.m55680("ۘ֨") ^ i12) * 11;
                        i15 = iM55685 ^ (-1177577577);
                        i14 = ((iM55685 ^ i13) * 10343) ^ (-745970001);
                    }
                    break;
                case -317174731:
                case 1259693519:
                    c12474.f34921 = str2;
                    if (C0898.f81858 <= 0) {
                        iM559710 = (C0946.m55979("ܰ۠") + i12) * 99;
                        i9 = ((iM559710 ^ i13) * 4149) ^ 465780549;
                        i10 = -40536952;
                    } else {
                        iM559710 = (C0946.m55979("ܽ֡") + i13) * (-43);
                        i9 = ((iM559710 ^ i12) * (-12057)) ^ (-509458145);
                        i10 = 307220509;
                    }
                    i15 = iM559710 ^ i10;
                    i14 = i9;
                    break;
                case -194180418:
                case 2004639794:
                    c1014 = new C1012();
                    if (C1964.f83032 > 0) {
                        iM55680 = C0873.m55680("ܶ᩺") ^ i12;
                        c1012 = c1014;
                        i5 = ((iM55680 ^ i13) * (-26915)) ^ 1615859675;
                        i6 = -362640082;
                        i14 = i5;
                        i15 = iM55680 ^ i6;
                        c1014 = c1012;
                    } else {
                        int iM55686 = (i12 - C0873.m55680("᩹ᩴ")) * (-97);
                        i14 = ((iM55686 ^ i13) * (-13041)) ^ 1230219380;
                        i15 = iM55686 ^ 1961806080;
                        c12474 = this;
                    }
                    break;
                case -50361780:
                case 1082877022:
                    c1012 = c1014;
                    c1013 = new C1012();
                    if (C1046.f81962 <= 0) {
                        iM55681 = (C0946.m55979("ۤ۠") + i12) * (-111);
                        i7 = ((iM55681 ^ i13) * 1693) ^ 1479497980;
                        i8 = -1887639317;
                    } else {
                        iM55681 = C0873.m55680("ۙ᩵") ^ i13;
                        i7 = ((iM55681 ^ i12) * 27751) ^ (-860097086);
                        i8 = -903183438;
                    }
                    i15 = iM55681 ^ i8;
                    i14 = i7;
                    c1014 = c1012;
                    c12474 = this;
                    break;
                case 6225187:
                case 1291026781:
                    c12474.f34926 = c15646;
                    c12474.f34923 = c13303;
                    c12474.f34925 = c13304;
                    return;
                case 1057535897:
                case 1272913377:
                    c1012 = c1014;
                    if (C1024.f81946) {
                        iM55681 = (C0873.m55680("֡ܶ") + i13) * (-79);
                        i7 = ((iM55681 ^ i12) * (-17697)) ^ (-537444235);
                        i8 = -715639832;
                    } else {
                        iM55681 = (i12 - C0873.m55680("ᩴܺ")) * 43;
                        i7 = ((iM55681 ^ i13) * 4495) ^ (-60792836);
                        i8 = 2083138246;
                    }
                    i15 = iM55681 ^ i8;
                    i14 = i7;
                    c1014 = c1012;
                    c12474 = this;
                    break;
                case 1467064954:
                case 1680698679:
                    c12474.f34928 = c1014;
                    c12474.f34933 = str;
                    if (C1036.m56257() > 0) {
                        c1012 = c1014;
                        iM55979 = (C0873.m55680("֨֨") ^ i13) * 115;
                        i3 = ((iM55979 ^ i12) * 2745) ^ (-969383054);
                        i4 = 1433224474;
                        i15 = iM55979 ^ i4;
                        i14 = i3;
                        c1014 = c1012;
                    }
                    iM55680 = (C0873.m55680("֨֫") + i13) * 69;
                    c1012 = c1014;
                    i5 = ((iM55680 ^ i12) * 19657) ^ 96653789;
                    i6 = 2091336617;
                    i14 = i5;
                    i15 = iM55680 ^ i6;
                    c1014 = c1012;
                    break;
                case 1848833835:
                case 2021287969:
                    if (C1044.f81959 >= 0) {
                        int iM55687 = (i12 - C0873.m55680("᩹ᩴ")) * (-97);
                        i14 = ((iM55687 ^ i13) * (-13041)) ^ 1230219380;
                        i15 = iM55687 ^ 1961806080;
                        c12474 = this;
                    }
                    c1012 = c1014;
                    iM55681 = (C0946.m55979("ۤ۠") + i12) * (-111);
                    i7 = ((iM55681 ^ i13) * 1693) ^ 1479497980;
                    i8 = -1887639317;
                    i15 = iM55681 ^ i8;
                    i14 = i7;
                    c1014 = c1012;
                    c12474 = this;
                    break;
                default:
                    break;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final void openBrowser(String str) {
        int i = 498155499;
        int i2 = C1964.f83032;
        int i3 = C1017.f81942;
        int iM55680 = (C0873.m55680("ܶ᩺") + i3) * (-109);
        int i4 = ((iM55680 ^ i2) * 29805) ^ (-1526340462);
        int i5 = -2016014253;
        while (true) {
            i = ((((i ^ i2) * (-8527)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1828693904:
                case 1780407897:
                    C0955.m56025();
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ۖ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30185)) ^ (-1036340175);
                        i5 = 1716271431;
                    } else {
                        iM55680 = C0873.m55680("ۡ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 13625) ^ (-312577293);
                        i5 = 1192693667;
                    }
                    break;
                case -1785405947:
                case -202287354:
                    if (C1053.f81965 > 0) {
                        iM55680 = (C0873.m55680("᩹֡") + i2) * 7;
                        i4 = ((iM55680 ^ i3) * (-927)) ^ (-1668094533);
                        i5 = -1515720901;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30185)) ^ (-1036340175);
                        i5 = 1716271431;
                    }
                    break;
                case -1145929175:
                case 1125311517:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("ۖ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30185)) ^ (-1036340175);
                        i5 = 1716271431;
                    } else {
                        iM55680 = (C0946.m55979("ۢ֨") + i3) * 101;
                        i4 = ((iM55680 ^ i2) * 14477) ^ (-2077618593);
                        i5 = -1269688291;
                    }
                    break;
                case -1041756370:
                case -429311746:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0873.m55680("᩹֡") + i2) * 7;
                        i4 = ((iM55680 ^ i3) * (-927)) ^ (-1668094533);
                        i5 = -1515720901;
                    } else {
                        iM55680 = C0873.m55680("ᩴᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14295)) ^ (-1222945065);
                        i5 = 1260222155;
                    }
                    break;
                case -1025810746:
                case 2130525783:
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("ۡ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 13625) ^ (-312577293);
                        i5 = 1192693667;
                    } else {
                        iM55680 = C0946.m55979("᩸ᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20715) ^ (-1180413240);
                        i5 = 260615548;
                    }
                    break;
                case -938563905:
                case 1197043999:
                    if (C0861.f81831) {
                        iM55680 = C0873.m55680("ۨܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2655) ^ 1839514613;
                        i5 = 936438246;
                    } else {
                        iM55680 = C0873.m55680("ۡ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 13625) ^ (-312577293);
                        i5 = 1192693667;
                    }
                    break;
                case -588503274:
                case 2022968746:
                    if (C0989.f81920 < 0) {
                        iM55680 = C0873.m55680("ۧۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 14033) ^ 1849872816;
                        i5 = -1146679565;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30185)) ^ (-1036340175);
                        i5 = 1716271431;
                    }
                    break;
                case -567087158:
                case -455411963:
                    if (C1124.m56367() < 0) {
                        ThreadUtil.runOnUiThread(new RunnableC11745(this, str, 2));
                    } else {
                        iM55680 = (C0946.m55979("ܿۨ") + i3) * (-83);
                        i4 = ((iM55680 ^ i2) * 25553) ^ 1256449975;
                        i5 = -213604975;
                    }
                    break;
                case -337929235:
                case 1834587544:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0873.m55680("᩹֡") + i2) * 7;
                        i4 = ((iM55680 ^ i3) * (-927)) ^ (-1668094533);
                        i5 = -1515720901;
                    } else {
                        iM55680 = (C0946.m55979("ۢ۫") ^ i2) * 41;
                        i4 = ((iM55680 ^ i3) * 24229) ^ 1029722884;
                        i5 = 449611539;
                    }
                    break;
                case -147855490:
                case 874332313:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0873.m55680("᩹֡") + i2) * 7;
                        i4 = ((iM55680 ^ i3) * (-927)) ^ (-1668094533);
                        i5 = -1515720901;
                    } else {
                        iM55680 = (C0873.m55680("ۨ᩶") ^ i3) * (-71);
                        i4 = ((iM55680 ^ i2) * (-3879)) ^ (-1189534899);
                        i5 = -989034019;
                    }
                    break;
                case 168450701:
                case 1664978821:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0873.m55680("ۡ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 13625) ^ (-312577293);
                        i5 = 1192693667;
                    } else {
                        iM55680 = C0946.m55979("ۢᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 5197) ^ (-1390762688);
                        i5 = 2130193109;
                    }
                    break;
                case 253966348:
                case 1404031429:
                    C0930.m55885();
                    iM55680 = C0873.m55680("ۡ᩵") ^ i2;
                    i4 = ((iM55680 ^ i3) * 13625) ^ (-312577293);
                    i5 = 1192693667;
                    break;
                case 275147897:
                case 533887003:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("ۧۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 14033) ^ 1849872816;
                        i5 = -1146679565;
                    } else {
                        iM55680 = C0873.m55680("֨ۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30303)) ^ (-370845504);
                        i5 = 1488594247;
                    }
                    break;
                case 906399858:
                case 1928652532:
                    C1071.m56343();
                    break;
                default:
                    if (C1929.m56553()) {
                        iM55680 = C0873.m55680("ۧۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 14033) ^ 1849872816;
                        i5 = -1146679565;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۤܶ")) * (-119);
                        i4 = ((iM55680 ^ i3) * 13013) ^ 1503626927;
                        i5 = 1003541670;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final File getFilesDir() {
        AbstractC17043 abstractC17043 = null;
        int i = -288285060;
        int i2 = RunnableC0871.f81839;
        int i3 = C1003.f81929;
        int iM55680 = C0873.m55680("֫۟") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-10783)) ^ 1930284686;
        int i5 = -1048725330;
        while (true) {
            i = ((((i ^ i3) * (-31959)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1911594890:
                case 426141721:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0873.m55680("ᩴ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12435) ^ 1201313352;
                        i5 = -1159960755;
                    } else {
                        iM55680 = (C0873.m55680("֡۟") ^ i2) * (-99);
                        i4 = ((iM55680 ^ i3) * 26609) ^ 187464275;
                        i5 = 175544280;
                    }
                    break;
                case -1909693563:
                case -138233377:
                    if (C0912.m55837(abstractC17043)) {
                        iM55680 = (C0873.m55680("֫ᩳ") ^ i2) * (-79);
                        i4 = ((iM55680 ^ i3) * 19955) ^ (-805562732);
                        i5 = -631866155;
                    } else {
                        iM55680 = C0873.m55680("᩶᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31935) ^ 2023429839;
                        i5 = 1047804843;
                    }
                    break;
                case -1650668211:
                case 589603157:
                    if (!C0937.f81884) {
                        iM55680 = C0873.m55680("ܺ᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-453)) ^ 1572655058;
                        i5 = 2043397153;
                    } else {
                        iM55680 = C0946.m55979("ۜܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6895)) ^ (-943826379);
                        i5 = -184050490;
                    }
                    break;
                case -1590950014:
                case 21264091:
                    return new File(C0989.m56086(abstractC17043));
                case -1571114660:
                case -53266680:
                    if (C0927.m55873() <= 0) {
                        iM55680 = C0946.m55979("ۜܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6895)) ^ (-943826379);
                        i5 = -184050490;
                    } else {
                        iM55680 = C0946.m55979("ܽۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4497) ^ 814565989;
                        i5 = 422312466;
                    }
                    break;
                case -1508871405:
                case 2040828693:
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("᩶۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-21679)) ^ (-543255266);
                        i5 = -186242789;
                    } else {
                        iM55680 = C0873.m55680("ۤܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17637) ^ 988772995;
                        i5 = 1000444479;
                    }
                    break;
                case -1280914711:
                case 804037619:
                    if (C0892.f81851) {
                        iM55680 = C0946.m55979("۠֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-22429)) ^ 1058223051;
                        i5 = 991947450;
                    } else {
                        iM55680 = C0873.m55680("ܺ᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-453)) ^ 1572655058;
                        i5 = 2043397153;
                    }
                    break;
                case -1235289929:
                case 470691074:
                    abstractC17043.mo25497();
                    iM55680 = (C0873.m55680("֫ᩳ") ^ i2) * (-79);
                    i4 = ((iM55680 ^ i3) * 19955) ^ (-805562732);
                    i5 = -631866155;
                    break;
                case -1012210933:
                case 1151355954:
                    if (C1046.m56302() != 0) {
                        iM55680 = C0873.m55680("ܺ᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-453)) ^ 1572655058;
                        i5 = 2043397153;
                    } else {
                        iM55680 = C0873.m55680("۬᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 2391) ^ (-770515535);
                        i5 = -1239962282;
                    }
                    break;
                case -791620584:
                case 995247409:
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("۠ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-109)) ^ (-814780455);
                        i5 = 1277597623;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۨ۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i2) * (-14979)) ^ (-1689523241);
                        i5 = -71898622;
                    }
                    break;
                case -728572754:
                case -656640506:
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0946.m55979("᩶۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-21679)) ^ (-543255266);
                        i5 = -186242789;
                    } else {
                        iM55680 = C0946.m55979("᩷۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16583)) ^ (-1359653235);
                        i5 = 1849326904;
                    }
                    break;
                case -538740760:
                case 1485238677:
                    abstractC17043 = this.f34929;
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0873.m55680("۠ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-109)) ^ (-814780455);
                        i5 = 1277597623;
                    } else {
                        iM55680 = C0873.m55680("ܳ᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * 5699) ^ (-785653407);
                        i5 = -1001449579;
                    }
                    break;
                case -432621989:
                case 1881562713:
                    if (C1024.f81946) {
                        iM55680 = C0873.m55680("ܺ᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-453)) ^ 1572655058;
                        i5 = 2043397153;
                    } else {
                        iM55680 = (C0946.m55979("᩵ۤ") ^ i2) * 11;
                        i4 = ((iM55680 ^ i3) * (-20257)) ^ 995018965;
                        i5 = -1191688516;
                    }
                    break;
                case -127431299:
                case 1830743454:
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0873.m55680("۠ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-109)) ^ (-814780455);
                        i5 = 1277597623;
                    } else {
                        iM55680 = C0873.m55680("ܺ᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-453)) ^ 1572655058;
                        i5 = 2043397153;
                    }
                    break;
                case 467066571:
                case 1828501693:
                    C0947.m55997();
                    iM55680 = C0873.m55680("ܺ᩺") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-453)) ^ 1572655058;
                    i5 = 2043397153;
                    break;
                case 625488988:
                case 754413809:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("ᩴ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12435) ^ 1201313352;
                        i5 = -1159960755;
                    } else {
                        iM55680 = (C0946.m55979("ۙۢ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i2) * 7455) ^ (-1061660367);
                        i5 = 478174300;
                    }
                    break;
                case 878598214:
                case 1538418377:
                    RunnableC0871.m55672();
                    return null;
                default:
                    RunnableC1014.m56177();
                    if (C1124.f82007 < 0) {
                        iM55680 = C0873.m55680("ᩴ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12435) ^ 1201313352;
                        i5 = -1159960755;
                    } else {
                        iM55680 = C0946.m55979("ۜܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6895)) ^ (-943826379);
                        i5 = -184050490;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x034d  */
    /* JADX WARN: Code duplicated, block: B:111:0x03b5 A[PHI: r11
      0x03b5: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v1 java.lang.String), (r11v3 java.lang.String) binds: [B:110:0x03b3, B:92:0x02f6, B:11:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8 A[PHI: r12 r14 r15
      0x01b8: PHI (r12v3 java.lang.Object) = 
      (r12v2 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
     binds: [B:59:0x01a0, B:52:0x0160, B:46:0x0134, B:43:0x0116, B:40:0x00fa, B:38:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r14v4 java.lang.String) = 
      (r14v1 java.lang.String)
      (r14v3 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
     binds: [B:59:0x01a0, B:52:0x0160, B:46:0x0134, B:43:0x0116, B:40:0x00fa, B:38:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r15v3 java.lang.String) = 
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v2 java.lang.String)
      (r15v1 java.lang.String)
     binds: [B:59:0x01a0, B:52:0x0160, B:46:0x0134, B:43:0x0116, B:40:0x00fa, B:38:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x02ac A[PHI: r1 r5 r6 r7 r8 r9
      0x02ac: PHI (r1v71 java.lang.CharSequence) = (r1v13 java.lang.CharSequence), (r1v15 java.lang.CharSequence), (r1v72 java.lang.CharSequence) binds: [B:83:0x0294, B:78:0x0258, B:71:0x0219] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r5v4 char) = (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:83:0x0294, B:78:0x0258, B:71:0x0219] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r6v4 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:83:0x0294, B:78:0x0258, B:71:0x0219] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r7v4 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:83:0x0294, B:78:0x0258, B:71:0x0219] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:83:0x0294, B:78:0x0258, B:71:0x0219] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r9v5 java.lang.String) = (r9v1 java.lang.String), (r9v3 java.lang.String), (r9v1 java.lang.String) binds: [B:83:0x0294, B:78:0x0258, B:71:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        if (p067l.C0989.f81920 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (p067l.C0955.m56025() == false) goto L10;
     */
    @Override // bin.p000mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showToastL(CharSequence charSequence, Object... objArr) {
        int iM55680;
        int i;
        CharSequence charSequence2;
        int iM55979;
        int i2;
        C12474 c12474 = this;
        char c = 0;
        char c2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        int i6 = 0;
        String strM28710 = null;
        Object obj = null;
        CharSequence charSequence3 = null;
        String str2 = null;
        String strM55876 = null;
        int i7 = -483835859;
        int i8 = C1028.f81950;
        int i9 = C1964.f83032;
        int iM559710 = (i9 - C0946.m55979("ۜܳ")) * (-101);
        int i10 = ((iM559710 ^ i8) * (-6117)) ^ (-1213493242);
        int i11 = iM559710 ^ 2024867342;
        boolean z = false;
        while (true) {
            i7 = i11 ^ ((((i7 ^ i8) * 29285) >> 31) & i10);
            switch (i7) {
                case -2145027366:
                case 486336122:
                    C0946.m55980();
                    C1048.m56305();
                    break;
                case -2013352278:
                case 456283087:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0946.m55979("ۧۘ") ^ i8) * 39;
                        i10 = ((iM55680 ^ i9) * (-4795)) ^ (-1616931152);
                        i = -926101103;
                    } else {
                        iM55680 = (C0946.m55979("ۙۙ") + i9) * (-67);
                        i10 = ((iM55680 ^ i8) * (-31905)) ^ 1470297399;
                        i = -818907828;
                    }
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case -1922134851:
                case 517200081:
                    if (C0892.m55748(i4, str) != c) {
                        charSequence2 = charSequence;
                        charSequence3 = charSequence2;
                        iM55680 = C0946.m55979("᩵۠") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-5287)) ^ (-961226947);
                        i = -1000398478;
                        i11 = iM55680 ^ i;
                        c12474 = this;
                    } else {
                        iM55979 = C0873.m55680("᩸᩸") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-25125)) ^ 633132791;
                        i2 = 1654725718;
                        i11 = iM55979 ^ i2;
                    }
                    break;
                case -1921311840:
                case -1724030964:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (i9 - C0946.m55979("ۜᩴ")) * (-87);
                        i10 = ((iM55680 ^ i8) * 17811) ^ 625155236;
                        i = 1664544628;
                    } else {
                        iM55680 = C0946.m55979("ۜ۠") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-31875)) ^ 1765184972;
                        i = -1232200429;
                    }
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case -1843556982:
                case 1391479854:
                    charSequence2 = charSequence;
                    str = (String) charSequence2;
                    if (C0882.m55719(str) >= i3) {
                        int iM55681 = C0873.m55680("ۢ᩺") ^ i9;
                        i11 = iM55681 ^ 877967316;
                        i10 = ((iM55681 ^ i8) * 25769) ^ (-838808481);
                    } else {
                        charSequence3 = charSequence2;
                        iM55680 = C0946.m55979("᩵۠") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-5287)) ^ (-961226947);
                        i = -1000398478;
                        i11 = iM55680 ^ i;
                    }
                    c12474 = this;
                    break;
                case -1828705129:
                case 2018060929:
                    str2 = (String) obj;
                    if (C0927.m55878(str2) >= i3) {
                        iM55979 = (i8 - C0873.m55680("ۧ᩻")) * 81;
                        i10 = ((iM55979 ^ i9) * 12357) ^ (-1078023583);
                        i2 = 1089323992;
                    } else {
                        iM55979 = C0946.m55979("۟ܶ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-4213)) ^ 1799168381;
                        i2 = 1388086382;
                    }
                    i11 = iM55979 ^ i2;
                    break;
                case -1739690845:
                case -1257221431:
                    ThreadUtil.runOnUiThread(new RunnableC10203(i5, strM28710));
                    break;
                case -1718508399:
                case 1148208984:
                    C0912.m55833();
                    if (C1012.f81938 < 0) {
                        iM55979 = (C0946.m55979("᩻ۘ") ^ i9) * (-103);
                        i10 = ((iM55979 ^ i8) * 6597) ^ (-1969484301);
                        i2 = 2101722882;
                        i11 = iM55979 ^ i2;
                    } else {
                        iM55680 = C0873.m55680("᩻ܺ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 30457) ^ 491399867;
                        i = 1982843995;
                        i11 = iM55680 ^ i;
                        c12474 = this;
                    }
                    break;
                case -1700215996:
                case -1290972751:
                    strM55876 = C0927.m55876(c12474, str2);
                    if (strM55876 != null) {
                        iM55979 = C0873.m55680("ܰۤ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-20411)) ^ (-613771902);
                        i2 = -560563620;
                    } else {
                        iM55979 = C0946.m55979("۟ܶ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-4213)) ^ 1799168381;
                        i2 = 1388086382;
                    }
                    i11 = iM55979 ^ i2;
                    break;
                case -1619816140:
                case -88681367:
                    if (i6 < objArr.length) {
                        iM55979 = (C0946.m55979("۫᩹") ^ i8) * 115;
                        i10 = ((iM55979 ^ i9) * (-8257)) ^ (-2116265014);
                        i2 = -665226142;
                    } else {
                        iM55979 = C0946.m55979("۫᩵") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-7975)) ^ 205594865;
                        i2 = -1963098349;
                    }
                    i11 = iM55979 ^ i2;
                    break;
                case -1609524284:
                case -87196358:
                    C0955.m56025();
                    break;
                case -1568320868:
                case 1550722340:
                    i6 = 0;
                    iM55680 = C0946.m55979("ۨۨ") ^ i9;
                    i10 = ((iM55680 ^ i8) * 23011) ^ 1338519823;
                    i = -1433384233;
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case -1532360622:
                case -895600615:
                    if (C0927.m55870(str2, i5) == c2) {
                        iM55979 = (i9 - C0946.m55979("᩻۫")) * (-11);
                        i10 = ((iM55979 ^ i8) * (-22875)) ^ (-1847502587);
                        i2 = -1124077367;
                    } else {
                        iM55979 = C0946.m55979("۟ܶ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-4213)) ^ 1799168381;
                        i2 = 1388086382;
                    }
                    i11 = iM55979 ^ i2;
                    break;
                case -1396690968:
                case 797110316:
                    RunnableC0897.m55784();
                    if (C0989.f81920 < 0) {
                        iM55979 = C0873.m55680("᩵֨") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-21815)) ^ 1392537283;
                        i2 = -1676211188;
                        i11 = iM55979 ^ i2;
                    } else {
                        iM55680 = C0873.m55680("᩻ܺ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 30457) ^ 491399867;
                        i = 1982843995;
                        i11 = iM55680 ^ i;
                        c12474 = this;
                    }
                    break;
                case -1308910140:
                case -799568270:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ۧۘ") ^ i8) * 39;
                        i10 = ((iM55680 ^ i9) * (-4795)) ^ (-1616931152);
                        i = -926101103;
                    } else {
                        iM55680 = C0873.m55680("ܿܰ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 17191) ^ (-1286850969);
                        i = -2118812381;
                    }
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case -1231795449:
                case 121138080:
                    C1024.m56209();
                    if (RunnableC0938.f81886 < 0) {
                        iM55680 = (C0946.m55979("ۧۘ") ^ i8) * 39;
                        i10 = ((iM55680 ^ i9) * (-4795)) ^ (-1616931152);
                        i = -926101103;
                        i11 = iM55680 ^ i;
                        c12474 = this;
                    }
                    iM55680 = (i9 - C0946.m55979("ۜᩴ")) * (-87);
                    i10 = ((iM55680 ^ i8) * 17811) ^ 625155236;
                    i = 1664544628;
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case -1202727155:
                case 2047730805:
                    objArr[i6] = strM55876;
                    iM55979 = C0946.m55979("۟ܶ") ^ i8;
                    i10 = ((iM55979 ^ i9) * (-4213)) ^ 1799168381;
                    i2 = 1388086382;
                    i11 = iM55979 ^ i2;
                    break;
                case -1102474815:
                case -752941705:
                    C0946.m55980();
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("᩻ܺ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 30457) ^ 491399867;
                        i = 1982843995;
                        i11 = iM55680 ^ i;
                        c12474 = this;
                    } else {
                        iM55979 = C0873.m55680("ۨܿ") ^ i9;
                        i10 = ((iM55979 ^ i8) * (-7233)) ^ (-354803505);
                        i2 = 689913294;
                        i11 = iM55979 ^ i2;
                    }
                    break;
                case -1071551535:
                case 329103078:
                    if (C0892.m55748(i4, str2) == c) {
                        iM55979 = (C0873.m55680("ܳۘ") + i9) * 123;
                        i10 = ((iM55979 ^ i8) * (-13077)) ^ 668887018;
                        i2 = 1469022921;
                    } else {
                        iM55979 = C0946.m55979("۟ܶ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-4213)) ^ 1799168381;
                        i2 = 1388086382;
                    }
                    i11 = iM55979 ^ i2;
                    break;
                case -982252982:
                case 101936823:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("᩻ܺ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 30457) ^ 491399867;
                        i = 1982843995;
                    } else {
                        iM55680 = C0873.m55680("ܳ᩷") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-20705)) ^ 483198971;
                        i = 2112610958;
                    }
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case -787773128:
                case 1339412715:
                    boolean z2 = charSequence instanceof String;
                    if (C0845.m55584() <= 0) {
                        z = z2;
                        c = '}';
                        iM55680 = C0873.m55680("ܳ᩸") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-8463)) ^ 1419693325;
                        i = 1207403070;
                        i11 = iM55680 ^ i;
                    } else {
                        int iM55682 = C0873.m55680("᩹ۚ") ^ i9;
                        z = z2;
                        i11 = iM55682 ^ (-890136161);
                        i10 = ((iM55682 ^ i8) * (-22817)) ^ (-624609690);
                        c = '}';
                    }
                    c12474 = this;
                    break;
                case -729042463:
                case -333134052:
                    strM28710 = m28710(C0863.m55639(charSequence3), objArr);
                    C21862 c21862 = C16907.f50058;
                    if (C0992.f81922 < 0) {
                        iM55979 = C0873.m55680("᩷֫") ^ i9;
                        i10 = ((iM55979 ^ i8) * (-22835)) ^ 1601019904;
                        i2 = -1381085100;
                        i11 = iM55979 ^ i2;
                    } else {
                        iM55680 = C0873.m55680("ܿ֨") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-16855)) ^ (-2069056000);
                        i = -2089309267;
                        i11 = iM55680 ^ i;
                        c12474 = this;
                    }
                    break;
                case -412298729:
                case 1547944113:
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0873.m55680("ܿ֨") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-16855)) ^ (-2069056000);
                        i = -2089309267;
                    } else {
                        iM55680 = (C0873.m55680("֨ۙ") ^ i9) * (-3);
                        i10 = ((iM55680 ^ i8) * 26849) ^ (-1586682020);
                        i = -1889573710;
                    }
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case -342566765:
                case -223604169:
                    obj = objArr[i6];
                    if (obj instanceof String) {
                        iM55979 = C0946.m55979("۬᩸") ^ i9;
                        i10 = ((iM55979 ^ i8) * (-11487)) ^ (-1917527972);
                        i2 = -1495016584;
                    } else {
                        iM55979 = C0946.m55979("۟ܶ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-4213)) ^ 1799168381;
                        i2 = 1388086382;
                    }
                    i11 = iM55979 ^ i2;
                    break;
                case -234830650:
                case 1676231293:
                    RunnableC0897.m55784();
                    if (!C0892.f81851) {
                        iM55979 = (C0873.m55680("ۤۙ") + i8) * (-29);
                        i10 = ((iM55979 ^ i9) * 16253) ^ (-926416592);
                        i2 = 490308502;
                        i11 = iM55979 ^ i2;
                    } else {
                        iM55680 = C0873.m55680("᩻ܺ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 30457) ^ 491399867;
                        i = 1982843995;
                        i11 = iM55680 ^ i;
                        c12474 = this;
                    }
                    break;
                case -128728064:
                case 556675966:
                    break;
                case -15620867:
                case 1852798978:
                    charSequence2 = charSequence;
                    c2 = '{';
                    i3 = 3;
                    i4 = 1;
                    i5 = 0;
                    if (z) {
                        iM55680 = C0873.m55680("۫ۜ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 18391) ^ (-438100299);
                        i = -188475330;
                    } else {
                        charSequence3 = charSequence2;
                        iM55680 = C0946.m55979("᩵۠") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-5287)) ^ (-961226947);
                        i = -1000398478;
                    }
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case 28794607:
                case 391643454:
                    if (C0927.m55870(str, i5) != c2) {
                        charSequence2 = charSequence;
                        charSequence3 = charSequence2;
                        iM55680 = C0946.m55979("᩵۠") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-5287)) ^ (-961226947);
                        i = -1000398478;
                        i11 = iM55680 ^ i;
                        c12474 = this;
                    } else {
                        iM55979 = (C0873.m55680("ۛۖ") ^ i9) * (-125);
                        i10 = ((iM55979 ^ i8) * 28013) ^ (-1179867867);
                        i2 = -1318099463;
                        i11 = iM55979 ^ i2;
                    }
                    break;
                case 75176883:
                case 127484774:
                    String strM55877 = C0927.m55876(c12474, str);
                    if (strM55877 != null) {
                        charSequence3 = strM55877;
                    } else {
                        charSequence2 = charSequence;
                        charSequence3 = charSequence2;
                    }
                    iM55680 = C0946.m55979("᩵۠") ^ i8;
                    i10 = ((iM55680 ^ i9) * (-5287)) ^ (-961226947);
                    i = -1000398478;
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case 284539041:
                case 1623724619:
                    C1012.m56134();
                    iM55979 = C0873.m55680("ۨܿ") ^ i9;
                    i10 = ((iM55979 ^ i8) * (-7233)) ^ (-354803505);
                    i2 = 689913294;
                    i11 = iM55979 ^ i2;
                    break;
                case 306196058:
                case 879038652:
                    i6++;
                    iM55680 = C0946.m55979("ۨۨ") ^ i9;
                    i10 = ((iM55680 ^ i8) * 23011) ^ 1338519823;
                    i = -1433384233;
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case 400696578:
                case 479311929:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("ܳ᩸") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-8463)) ^ 1419693325;
                        i = 1207403070;
                    } else {
                        iM55680 = C0873.m55680("ۗܿ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 23909) ^ 262002498;
                        i = 744482895;
                    }
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                case 711699579:
                case 1904855970:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0873.m55680("ܿ֨") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-16855)) ^ (-2069056000);
                        i = -2089309267;
                    } else {
                        iM55680 = (C0873.m55680("ܳܳ") ^ i9) * (-69);
                        i10 = ((iM55680 ^ i8) * (-29227)) ^ 1472811231;
                        i = 1853249971;
                    }
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
                default:
                    if (C0937.f81884) {
                        iM55680 = (C0873.m55680("᩹ۧ") ^ i9) * (-99);
                        i10 = ((iM55680 ^ i8) * 9761) ^ 1644912144;
                        i = -1489820295;
                    } else {
                        iM55680 = (i9 - C0946.m55979("ۜᩴ")) * (-87);
                        i10 = ((iM55680 ^ i8) * 17811) ^ 625155236;
                        i = 1664544628;
                    }
                    i11 = iM55680 ^ i;
                    c12474 = this;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x038d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0183 A[PHI: r12 r14 r15
      0x0183: PHI (r12v3 java.lang.Object) = 
      (r12v2 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
      (r12v1 java.lang.Object)
     binds: [B:57:0x0169, B:50:0x0127, B:44:0x00fb, B:41:0x00df, B:38:0x00c3, B:36:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r14v4 java.lang.String) = 
      (r14v1 java.lang.String)
      (r14v3 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
     binds: [B:57:0x0169, B:50:0x0127, B:44:0x00fb, B:41:0x00df, B:38:0x00c3, B:36:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r15v3 java.lang.String) = 
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v1 java.lang.String)
      (r15v2 java.lang.String)
      (r15v1 java.lang.String)
     binds: [B:57:0x0169, B:50:0x0127, B:44:0x00fb, B:41:0x00df, B:38:0x00c3, B:36:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0274 A[PHI: r1 r5 r6 r7 r8 r9
      0x0274: PHI (r1v74 java.lang.CharSequence) = (r1v14 java.lang.CharSequence), (r1v16 java.lang.CharSequence), (r1v75 java.lang.CharSequence) binds: [B:79:0x025a, B:74:0x021c, B:67:0x01db] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r5v4 char) = (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:79:0x025a, B:74:0x021c, B:67:0x01db] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r6v4 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:79:0x025a, B:74:0x021c, B:67:0x01db] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r7v4 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:79:0x025a, B:74:0x021c, B:67:0x01db] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:79:0x025a, B:74:0x021c, B:67:0x01db] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r9v5 java.lang.String) = (r9v1 java.lang.String), (r9v3 java.lang.String), (r9v1 java.lang.String) binds: [B:79:0x025a, B:74:0x021c, B:67:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (p067l.C0930.f81879 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (p067l.C0892.f81851 != false) goto L9;
     */
    @Override // bin.p000mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showToast(CharSequence charSequence, Object... objArr) {
        int iM55979;
        int i;
        int iM559710;
        int i2;
        int i3;
        CharSequence charSequence2;
        int iM559711;
        int i4;
        C12474 c12474 = this;
        char c = 0;
        char c2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        String str = null;
        int i8 = 0;
        String strM28710 = null;
        Object obj = null;
        CharSequence charSequence3 = null;
        String str2 = null;
        String strM55876 = null;
        int i9 = 2062899485;
        int i10 = RunnableC1014.f81941;
        int i11 = C0912.f81867;
        int iM559712 = (i11 - C0946.m55979("᩸ۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i12 = ((iM559712 ^ i10) * 17389) ^ 106779430;
        int i13 = iM559712 ^ (-367665629);
        boolean z = false;
        while (true) {
            i9 = i13 ^ ((((i9 ^ i10) * 30647) >> 31) & i12);
            switch (i9) {
                case -2119384323:
                case 1510421970:
                    C1124.m56367();
                    if (C1071.f81975 > 0) {
                        iM55979 = (C0873.m55680("ܰܽ") + i10) * (-9);
                        i12 = ((iM55979 ^ i11) * 6447) ^ 208732979;
                        i = 1651258880;
                        i13 = iM55979 ^ i;
                        c12474 = this;
                    }
                    iM55979 = (i11 - C0873.m55680("᩵᩷")) * 81;
                    i12 = ((iM55979 ^ i10) * (-20217)) ^ 784792900;
                    i = 1562716306;
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case -2091855357:
                case -1945651868:
                    if (C0927.m55870(str, i7) != c2) {
                        charSequence2 = charSequence;
                        charSequence3 = charSequence2;
                        iM55979 = C0946.m55979("ۤۛ") ^ i11;
                        i12 = ((iM55979 ^ i10) * 17521) ^ (-792509616);
                        i = -783634153;
                        i13 = iM55979 ^ i;
                        c12474 = this;
                    } else {
                        iM559711 = (C0873.m55680("֫᩵") ^ i10) * (-23);
                        i12 = ((iM559711 ^ i11) * 20655) ^ 1635301177;
                        i4 = 1538781202;
                        i13 = iM559711 ^ i4;
                    }
                    break;
                case -2072645174:
                case -1837058316:
                    i8 = 0;
                    iM55979 = (i11 - C0946.m55979("֡ᩳ")) * (-29);
                    i12 = ((iM55979 ^ i10) * (-9319)) ^ 565565942;
                    i = 1359603367;
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case -2047268856:
                case 1580650137:
                    str2 = (String) obj;
                    if (C0882.m55719(str2) >= i5) {
                        iM559711 = (C0873.m55680("ܰ۬") + i11) * 69;
                        i12 = ((iM559711 ^ i10) * 32095) ^ (-739590160);
                        i4 = -1818079251;
                    } else {
                        iM559711 = C0873.m55680("ۤۨ") ^ i11;
                        i12 = ((iM559711 ^ i10) * 8907) ^ 368095222;
                        i4 = -139701610;
                    }
                    i13 = iM559711 ^ i4;
                    break;
                case -1921852247:
                case 689010258:
                    if (C0955.m56025()) {
                        iM55979 = C0946.m55979("ܶܳ") ^ i11;
                        i12 = ((iM55979 ^ i10) * 23441) ^ (-2024220338);
                        i = 2061576710;
                    } else {
                        iM55979 = C0873.m55680("ۧ۫") ^ i11;
                        i12 = ((iM55979 ^ i10) * (-2207)) ^ 1079598721;
                        i = 272287968;
                    }
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case -1870351826:
                case 783654452:
                    objArr[i8] = strM55876;
                    iM559711 = C0873.m55680("ۤۨ") ^ i11;
                    i12 = ((iM559711 ^ i10) * 8907) ^ 368095222;
                    i4 = -139701610;
                    i13 = iM559711 ^ i4;
                    break;
                case -1437730115:
                case 682413143:
                    charSequence2 = charSequence;
                    str = (String) charSequence2;
                    if (C0882.m55719(str) >= i5) {
                        int iM55680 = C0873.m55680("᩶᩵") ^ i11;
                        i13 = iM55680 ^ (-808574897);
                        i12 = ((iM55680 ^ i10) * 23733) ^ (-644163111);
                    } else {
                        charSequence3 = charSequence2;
                        iM55979 = C0946.m55979("ۤۛ") ^ i11;
                        i12 = ((iM55979 ^ i10) * 17521) ^ (-792509616);
                        i = -783634153;
                        i13 = iM55979 ^ i;
                    }
                    c12474 = this;
                    break;
                case -1269503835:
                case 959125295:
                    if (!C0873.m55678()) {
                        iM559711 = (i11 - C0946.m55979("᩶ܶ")) * (-91);
                        i12 = ((iM559711 ^ i10) * 3675) ^ 226785013;
                        i4 = -777790862;
                        i13 = iM559711 ^ i4;
                    } else {
                        iM55979 = (i11 - C0873.m55680("ۘۙ")) * 83;
                        i12 = ((iM55979 ^ i10) * 19101) ^ (-1475857573);
                        i = -1602676101;
                        i13 = iM55979 ^ i;
                        c12474 = this;
                    }
                    break;
                case -1268361850:
                case -881121361:
                    i8++;
                    iM55979 = (i11 - C0946.m55979("֡ᩳ")) * (-29);
                    i12 = ((iM55979 ^ i10) * (-9319)) ^ 565565942;
                    i = 1359603367;
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case -1052982163:
                case 1703490523:
                    strM28710 = m28710(C0863.m55639(charSequence3), objArr);
                    C21862 c21862 = C16907.f50058;
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM559711 = C0946.m55979("ۙۜ") ^ i11;
                        i12 = ((iM559711 ^ i10) * (-20615)) ^ 1742947509;
                        i4 = -1196424307;
                        i13 = iM559711 ^ i4;
                    } else {
                        iM55979 = C0946.m55979("ܶۗ") ^ i10;
                        i12 = ((iM55979 ^ i11) * 1329) ^ (-1171708438);
                        i = 1038666858;
                        i13 = iM55979 ^ i;
                        c12474 = this;
                    }
                    break;
                case -980407160:
                case -897326413:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (i11 - C0873.m55680("ۘۙ")) * 83;
                        i12 = ((iM55979 ^ i10) * 19101) ^ (-1475857573);
                        i = -1602676101;
                    } else {
                        iM55979 = C0946.m55979("ۘ۫") ^ i10;
                        i12 = ((iM55979 ^ i11) * 32249) ^ (-1837718239);
                        i = 1224433900;
                    }
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case -954966095:
                case 1749983949:
                    if (C1404.m56458(i6, str) != c) {
                        charSequence2 = charSequence;
                        charSequence3 = charSequence2;
                        iM55979 = C0946.m55979("ۤۛ") ^ i11;
                        i12 = ((iM55979 ^ i10) * 17521) ^ (-792509616);
                        i = -783634153;
                        i13 = iM55979 ^ i;
                        c12474 = this;
                    } else {
                        iM559711 = (i11 - C0946.m55979("ܰ᩻")) * 37;
                        i12 = ((iM559711 ^ i10) * 5) ^ (-846305372);
                        i4 = 591624191;
                        i13 = iM559711 ^ i4;
                    }
                    break;
                case -892044652:
                case 1543694246:
                    C0930.m55885();
                    if (!C0882.f81846) {
                        iM55979 = C0946.m55979("ܶܳ") ^ i11;
                        i12 = ((iM55979 ^ i10) * 23441) ^ (-2024220338);
                        i = 2061576710;
                        i13 = iM55979 ^ i;
                        c12474 = this;
                    } else {
                        iM559711 = (i11 - C0946.m55979("᩶ܶ")) * (-91);
                        i12 = ((iM559711 ^ i10) * 3675) ^ 226785013;
                        i4 = -777790862;
                        i13 = iM559711 ^ i4;
                    }
                    break;
                case -723351124:
                case 1408290704:
                    if (C1404.m56468()) {
                        iM55979 = (C0873.m55680("۬۠") + i11) * (-93);
                        i12 = ((iM55979 ^ i10) * (-255)) ^ 381929750;
                        i = 228170280;
                    } else {
                        iM55979 = (i10 - C0946.m55979("ۙᩴ")) * 39;
                        i12 = ((iM55979 ^ i11) * 3403) ^ 1784281254;
                        i = -351388909;
                    }
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case -699837059:
                case 1197752878:
                    if (C0882.m55712(str2, i7) == c2) {
                        iM559711 = (C0946.m55979("֫۬") + i10) * 31;
                        i12 = ((iM559711 ^ i11) * 18707) ^ 1475583216;
                        i4 = -91387108;
                    } else {
                        iM559711 = C0873.m55680("ۤۨ") ^ i11;
                        i12 = ((iM559711 ^ i10) * 8907) ^ 368095222;
                        i4 = -139701610;
                    }
                    i13 = iM559711 ^ i4;
                    break;
                case -652821496:
                case 2102564935:
                    if (C1036.f81953 >= 0) {
                        iM559711 = (i11 - C0946.m55979("᩶ܶ")) * (-91);
                        i12 = ((iM559711 ^ i10) * 3675) ^ 226785013;
                        i4 = -777790862;
                        i13 = iM559711 ^ i4;
                    } else {
                        iM55979 = (i11 - C0873.m55680("᩵᩷")) * 81;
                        i12 = ((iM55979 ^ i10) * (-20217)) ^ 784792900;
                        i = 1562716306;
                        i13 = iM55979 ^ i;
                        c12474 = this;
                    }
                    break;
                case -481335506:
                case -51123160:
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0946.m55979("ᩴ᩶") ^ i10;
                        i12 = ((iM55979 ^ i11) * (-32029)) ^ 2079295390;
                        i = -1191231705;
                    } else {
                        iM55979 = C0946.m55979("᩶ۤ") ^ i11;
                        i12 = ((iM55979 ^ i10) * 3551) ^ (-2055275058);
                        i = 815372986;
                    }
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case -321218442:
                case 32976187:
                    C0947.m55997();
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ᩴ᩶") ^ i10;
                        i12 = ((iM55979 ^ i11) * (-32029)) ^ 2079295390;
                        i = -1191231705;
                        i13 = iM55979 ^ i;
                        c12474 = this;
                    }
                    iM55979 = (i11 - C0873.m55680("᩵᩷")) * 81;
                    i12 = ((iM55979 ^ i10) * (-20217)) ^ 784792900;
                    i = 1562716306;
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case -277953678:
                case 1174796662:
                    String strM55877 = C0927.m55876(c12474, str);
                    if (strM55877 != null) {
                        charSequence3 = strM55877;
                    } else {
                        charSequence2 = charSequence;
                        charSequence3 = charSequence2;
                    }
                    iM55979 = C0946.m55979("ۤۛ") ^ i11;
                    i12 = ((iM55979 ^ i10) * 17521) ^ (-792509616);
                    i = -783634153;
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case -35375455:
                case 1104265578:
                    boolean z2 = charSequence instanceof String;
                    if (C0927.f81875) {
                        iM559710 = C0873.m55680("ۚ᩹") ^ i10;
                        i2 = ((iM559710 ^ i11) * 10797) ^ 390988335;
                        i3 = 1195459419;
                    } else {
                        iM559710 = (C0946.m55979("ܽۗ") + i10) * (-13);
                        i2 = ((iM559710 ^ i11) * (-15807)) ^ (-70525871);
                        i3 = 663849818;
                    }
                    int i14 = iM559710 ^ i3;
                    z = z2;
                    i13 = i14;
                    i12 = i2;
                    c = '}';
                    c12474 = this;
                    break;
                case 28233165:
                case 1839150021:
                    C0873.m55678();
                    C0906.m55809();
                    break;
                case 51512577:
                case 232468836:
                    if (i8 < objArr.length) {
                        iM559711 = (i10 - C0873.m55680("ۤۖ")) * (-125);
                        i12 = ((iM559711 ^ i11) * (-23929)) ^ (-1439358412);
                        i4 = 2146700686;
                    } else {
                        iM559711 = (C0946.m55979("۬ܽ") ^ i10) * (-107);
                        i12 = ((iM559711 ^ i11) * 24195) ^ (-294964066);
                        i4 = -770189247;
                    }
                    i13 = iM559711 ^ i4;
                    break;
                case 76943538:
                case 902335829:
                    strM55876 = C0927.m55876(c12474, str2);
                    if (strM55876 != null) {
                        iM559711 = C0946.m55979("ܳ֫") ^ i10;
                        i12 = ((iM559711 ^ i11) * 14285) ^ (-694027977);
                        i4 = 1331672897;
                    } else {
                        iM559711 = C0873.m55680("ۤۨ") ^ i11;
                        i12 = ((iM559711 ^ i10) * 8907) ^ 368095222;
                        i4 = -139701610;
                    }
                    i13 = iM559711 ^ i4;
                    break;
                case 315814382:
                case 1098419539:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (i11 - C0873.m55680("᩵᩷")) * 81;
                        i12 = ((iM55979 ^ i10) * (-20217)) ^ 784792900;
                        i = 1562716306;
                    } else {
                        iM55979 = C0873.m55680("᩸ۢ") ^ i10;
                        i12 = ((iM55979 ^ i11) * (-10385)) ^ 636327366;
                        i = -1419111308;
                    }
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case 342811999:
                case 546724639:
                    charSequence2 = charSequence;
                    c2 = '{';
                    i5 = 3;
                    i6 = 1;
                    i7 = 0;
                    if (z) {
                        iM55979 = (C0873.m55680("ܽ۠") + i10) * (-49);
                        i12 = ((iM55979 ^ i11) * 16733) ^ (-1870777826);
                        i = 1766756935;
                    } else {
                        charSequence3 = charSequence2;
                        iM55979 = C0946.m55979("ۤۛ") ^ i11;
                        i12 = ((iM55979 ^ i10) * 17521) ^ (-792509616);
                        i = -783634153;
                    }
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case 395576343:
                case 1126830261:
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0946.m55979("ܶۗ") ^ i10;
                        i12 = ((iM55979 ^ i11) * 1329) ^ (-1171708438);
                        i = 1038666858;
                    } else {
                        iM55979 = C0873.m55680("ܳ۬") ^ i11;
                        i12 = ((iM55979 ^ i10) * 22381) ^ (-368352995);
                        i = 45265118;
                    }
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case 554208878:
                case 1652962188:
                    if (C1404.m56458(i6, str2) == c) {
                        iM559711 = C0873.m55680("ۚۛ") ^ i11;
                        i12 = ((iM559711 ^ i10) * 28207) ^ 1829885167;
                        i4 = 1197215847;
                    } else {
                        iM559711 = C0873.m55680("ۤۨ") ^ i11;
                        i12 = ((iM559711 ^ i10) * 8907) ^ 368095222;
                        i4 = -139701610;
                    }
                    i13 = iM559711 ^ i4;
                    break;
                case 648765481:
                case 1497636456:
                    C1025.m56230();
                    break;
                case 788967424:
                case 1760734973:
                    C0937.m55918();
                    C0930.m55885();
                    iM55979 = (i10 - C0946.m55979("ۙᩴ")) * 39;
                    i12 = ((iM55979 ^ i11) * 3403) ^ 1784281254;
                    i = -351388909;
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case 824681864:
                case 1328626623:
                    obj = objArr[i8];
                    if (obj instanceof String) {
                        iM559711 = (i10 - C0946.m55979("ܺۚ")) * 61;
                        i12 = ((iM559711 ^ i11) * 23613) ^ (-460166712);
                        i4 = -784148783;
                    } else {
                        iM559711 = C0873.m55680("ۤۨ") ^ i11;
                        i12 = ((iM559711 ^ i10) * 8907) ^ 368095222;
                        i4 = -139701610;
                    }
                    i13 = iM559711 ^ i4;
                    break;
                case 967426710:
                case 2058910352:
                    C1124.m56367();
                    break;
                case 1399083568:
                case 1840696211:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (i11 - C0873.m55680("᩵᩷")) * 81;
                        i12 = ((iM55979 ^ i10) * (-20217)) ^ 784792900;
                        i = 1562716306;
                    } else {
                        iM55979 = C0946.m55979("۠ۨ") ^ i10;
                        i12 = ((iM55979 ^ i11) * (-23309)) ^ 541304648;
                        i = 540790991;
                    }
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                case 1934653952:
                case 1942025671:
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0873.m55680("ܰܽ") + i10) * (-9);
                        i12 = ((iM55979 ^ i11) * 6447) ^ 208732979;
                        i = 1651258880;
                    } else {
                        iM55979 = (i10 - C0873.m55680("֨ۧ")) * 49;
                        i12 = ((iM55979 ^ i11) * (-7259)) ^ 1723695328;
                        i = -1436911591;
                    }
                    i13 = iM55979 ^ i;
                    c12474 = this;
                    break;
                default:
                    ThreadUtil.runOnUiThread(new RunnableC3497(i7, strM28710));
                    break;
            }
            return;
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getPluginId() {
        return this.f34933;
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final int getPluginSdkVersion() {
        return this.f34919;
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final int getPluginVersionCode() {
        return this.f34930;
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final void log(String str, Throwable th) {
        int i = 86378675;
        int i2 = C0906.f81862;
        int i3 = C1036.f81953;
        int iM55979 = C0946.m55979("᩹ᩳ") ^ i2;
        int i4 = ((iM55979 ^ i3) * 3001) ^ (-1704702946);
        int i5 = -1057598261;
        while (true) {
            i = ((((i ^ i3) * 28251) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2125640491:
                case -1017004912:
                    C0866.m55645();
                    if (C1017.f81942 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩶ۨ")) * (-9);
                        i4 = ((iM55979 ^ i2) * 12903) ^ (-112467202);
                        i5 = -755162673;
                    } else {
                        iM55979 = (C0946.m55979("ᩴᩴ") ^ i2) * (-13);
                        i4 = ((iM55979 ^ i3) * 30013) ^ 2144881624;
                        i5 = -235648418;
                    }
                    break;
                case -1622790944:
                case 1878896122:
                    if (C1929.f83011 != 0) {
                        iM55979 = (i2 - C0946.m55979("ۛ۟")) * (-53);
                        i4 = ((iM55979 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        iM55979 = C0873.m55680("᩹ۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 29409) ^ (-1028684251);
                        i5 = -148260547;
                    }
                    break;
                case -1501645943:
                case 1346172537:
                    C16907.m38472(this.f34933, str, th);
                    break;
                case -1228811972:
                case -806012908:
                    C1036.m56257();
                    break;
                case -1187208319:
                case 646491229:
                    if (C1025.f81947 >= 0) {
                        iM55979 = (i2 - C0946.m55979("ۛ۟")) * (-53);
                        i4 = ((iM55979 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        iM55979 = (C0946.m55979("᩺۬") + i3) * (-121);
                        i4 = ((iM55979 ^ i2) * (-20361)) ^ 598760888;
                        i5 = 866523084;
                    }
                    break;
                case -875658460:
                case 1820284555:
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0946.m55979("ܽ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-21617)) ^ 1659623991;
                        i5 = 689371470;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۡܰ")) * 53;
                        i4 = ((iM55979 ^ i2) * 1601) ^ (-296486736);
                        i5 = 635533961;
                    }
                    break;
                case -781056794:
                case -132405295:
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("ܰۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 22535) ^ 60699352;
                        i5 = -1226885686;
                    } else {
                        iM55979 = C0946.m55979("ۚ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-661)) ^ 1625139954;
                        i5 = 629306462;
                    }
                    break;
                case -382188073:
                case 1174870482:
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("ܽ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-21617)) ^ 1659623991;
                        i5 = 689371470;
                    } else {
                        iM55979 = (C0946.m55979("ܿܿ") + i2) * 91;
                        i4 = ((iM55979 ^ i3) * (-14925)) ^ 1951626290;
                        i5 = 1018815157;
                    }
                    break;
                case -309324529:
                case 251373539:
                    if (C1929.f83011 != 0) {
                        iM55979 = (i2 - C0946.m55979("ۛ۟")) * (-53);
                        i4 = ((iM55979 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        iM55979 = C0946.m55979("ܽ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-21617)) ^ 1659623991;
                        i5 = 689371470;
                    }
                    break;
                case -289546435:
                case 577131987:
                    if (C1194.f82045 != 0) {
                        iM55979 = (i3 - C0873.m55680("᩶ۨ")) * (-9);
                        i4 = ((iM55979 ^ i2) * 12903) ^ (-112467202);
                        i5 = -755162673;
                    } else {
                        iM55979 = (C0946.m55979("֫ۘ") + i2) * 89;
                        i4 = ((iM55979 ^ i3) * (-13419)) ^ (-617035066);
                        i5 = 576547881;
                    }
                    break;
                case 80924508:
                case 1323103834:
                    if (C0890.f81849 != 0) {
                        iM55979 = (i2 - C0946.m55979("ۛ۟")) * (-53);
                        i4 = ((iM55979 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        iM55979 = (C0946.m55979("᩺ۚ") ^ i2) * 73;
                        i4 = ((iM55979 ^ i3) * (-23003)) ^ (-2049230322);
                        i5 = -324955598;
                    }
                    break;
                case 116051601:
                case 436483281:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩶ۨ")) * (-9);
                        i4 = ((iM55979 ^ i2) * 12903) ^ (-112467202);
                        i5 = -755162673;
                    } else {
                        iM55979 = C0873.m55680("ۢۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-11855)) ^ 742845058;
                        i5 = 1124615985;
                    }
                    break;
                case 189580397:
                case 1478636649:
                    if (C1071.m56343() != 0) {
                        iM55979 = (i2 - C0946.m55979("ۛ۟")) * (-53);
                        i4 = ((iM55979 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۨ۫")) * 43;
                        i4 = ((iM55979 ^ i2) * 1917) ^ 995710294;
                        i5 = 63751458;
                    }
                    break;
                case 192496918:
                case 2083405438:
                    C0927.m55873();
                    iM55979 = C0946.m55979("ܽ۬") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-21617)) ^ 1659623991;
                    i5 = 689371470;
                    break;
                case 354565046:
                case 819830730:
                    if (!C0892.f81851) {
                        iM55979 = C0946.m55979("ܽ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-21617)) ^ 1659623991;
                        i5 = 689371470;
                    } else {
                        iM55979 = (C0946.m55979("ᩴᩴ") ^ i2) * (-13);
                        i4 = ((iM55979 ^ i3) * 30013) ^ 2144881624;
                        i5 = -235648418;
                    }
                    break;
                default:
                    if (C1964.m56597() != 0) {
                        iM55979 = (i2 - C0946.m55979("ۛ۟")) * (-53);
                        i4 = ((iM55979 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۚܳ")) * (-19);
                        i4 = ((iM55979 ^ i3) * (-8639)) ^ 681827619;
                        i5 = -1151966037;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getPluginVersionName() {
        return this.f34931;
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getHostPackageName() {
        return C7050.m16234();
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final SharedPreferences getPreferences() {
        if (this.f34920 == null) {
            synchronized (this) {
                if (this.f34920 == null) {
                    this.f34920 = C14976.m34319((String) this.f34926.f44764);
                }
            }
        }
        return this.f34920;
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getLanguage() {
        return C16907.m38477();
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getCountry() {
        return C16907.m38474();
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getLanguageCountry() {
        return C16907.m38480();
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final void openBuiltinBrowser(final String str, final boolean z) {
        int i = -362065349;
        int i2 = C1124.f82007;
        int i3 = C0967.f81910;
        int iM55680 = (C0873.m55680("ۖ᩶") ^ i2) * (-75);
        int i4 = ((iM55680 ^ i3) * (-5123)) ^ (-120889032);
        int i5 = 937620797;
        while (true) {
            i = ((((i ^ i3) * 5841) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2024928375:
                case 535913632:
                    if (C1048.f81963) {
                        iM55680 = (C0946.m55979("ᩳܽ") ^ i2) * (-115);
                        i4 = ((iM55680 ^ i3) * (-26209)) ^ (-2000107893);
                        i5 = 1030236587;
                    } else {
                        iM55680 = C0946.m55979("ۜܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5731)) ^ 2057995378;
                        i5 = -349046245;
                    }
                    break;
                case -1926307060:
                case -1741685860:
                    if (C0866.m55645()) {
                        iM55680 = C0873.m55680("ۙܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11167)) ^ (-764161718);
                        i5 = -492727206;
                    } else {
                        iM55680 = C0946.m55979("ۜܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5731)) ^ 2057995378;
                        i5 = -349046245;
                    }
                    break;
                case -1791146433:
                case 341518055:
                    ThreadUtil.runOnUiThread(new Runnable(this) { // from class: l.ۗ᩻᩷

                        /* JADX INFO: renamed from: ۨۜܰ, reason: not valid java name and contains not printable characters */
                        private static final short[] f81943 = {8291, 7048, 7055, 7057, 7054, 7061, 7058, 7050, 7081, 7060, 7049, 7057, 7064};

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C12474 f14150;

                        {
                            int i6 = 1104182106;
                            int i7 = C0949.f81897;
                            int i8 = C0992.f81922;
                            int iM55681 = (i8 - C0873.m55680("ᩴ۠")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            int i9 = ((iM55681 ^ i7) * 28693) ^ 395621988;
                            int i10 = 1666212870;
                            while (true) {
                                i6 = ((((i6 ^ i7) * 6491) >> 31) & i9) ^ (iM55681 ^ i10);
                                switch (i6) {
                                    case -1909593957:
                                    case -669608308:
                                        C1024.m56209();
                                        if (RunnableC0871.m55672() >= 0) {
                                            iM55681 = C0946.m55979("᩹ܰ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        } else {
                                            iM55681 = (i8 - C0873.m55680("۟ᩴ")) * (-23);
                                            i9 = ((iM55681 ^ i7) * (-13839)) ^ 544683059;
                                            i10 = -1617504010;
                                        }
                                        break;
                                    case -1700403551:
                                    case 501677279:
                                        return;
                                    case -1637610635:
                                    case -999316553:
                                        if (C0949.f81897 >= 0) {
                                            iM55681 = (i8 - C0873.m55680("۟ᩴ")) * (-23);
                                            i9 = ((iM55681 ^ i7) * (-13839)) ^ 544683059;
                                            i10 = -1617504010;
                                        } else {
                                            iM55681 = (C0873.m55680("ۧ֫") ^ i8) * (-33);
                                            i9 = ((iM55681 ^ i7) * 31791) ^ (-652250266);
                                            i10 = 1508968753;
                                        }
                                        break;
                                    case -1590856564:
                                    case 999811997:
                                        if (C1028.m56247() >= 0) {
                                            iM55681 = (C0946.m55979("ۧܶ") + i8) * 21;
                                            i9 = ((iM55681 ^ i7) * (-24317)) ^ 2009831908;
                                            i10 = 1728112698;
                                        } else {
                                            iM55681 = (C0946.m55979("ۤۚ") + i7) * 83;
                                            i9 = ((iM55681 ^ i8) * (-19621)) ^ 2072789114;
                                            i10 = 1146496471;
                                        }
                                        break;
                                    case -1491315362:
                                    case -37970439:
                                        C1124.m56367();
                                        iM55681 = (i8 - C0873.m55680("۟ᩴ")) * (-23);
                                        i9 = ((iM55681 ^ i7) * (-13839)) ^ 544683059;
                                        i10 = -1617504010;
                                        break;
                                    case -1116377868:
                                    case -105189777:
                                        if (C1046.f81962 <= 0) {
                                            iM55681 = (C0873.m55680("۟֫") ^ i8) * (-63);
                                            i9 = ((iM55681 ^ i7) * (-29453)) ^ 1856079321;
                                            i10 = 190944455;
                                        } else {
                                            iM55681 = C0873.m55680("ۙۗ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * (-14205)) ^ (-73076146);
                                            i10 = -2119293270;
                                        }
                                        break;
                                    case -771986452:
                                    case 536238141:
                                        if (C1071.m56343() != 0) {
                                            iM55681 = C0946.m55979("᩹ܰ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        } else {
                                            iM55681 = (C0946.m55979("ۖܽ") ^ i7) * 41;
                                            i9 = ((iM55681 ^ i8) * 29549) ^ (-2143220528);
                                            i10 = 1022929566;
                                        }
                                        break;
                                    case -444084299:
                                    case 855691075:
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM55681 = C0946.m55979("᩹ܰ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        } else {
                                            iM55681 = C0946.m55979("᩹ᩳ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * (-27641)) ^ (-1391081403);
                                            i10 = -229335337;
                                        }
                                        break;
                                    case -232045129:
                                    case 159583234:
                                        if (C1024.f81946) {
                                            iM55681 = (C0946.m55979("ۧܶ") + i8) * 21;
                                            i9 = ((iM55681 ^ i7) * (-24317)) ^ 2009831908;
                                            i10 = 1728112698;
                                        } else {
                                            iM55681 = C0873.m55680("۬۬") ^ i8;
                                            i9 = ((iM55681 ^ i7) * (-9003)) ^ 1929733397;
                                            i10 = 337361439;
                                        }
                                        break;
                                    case -99977006:
                                    case 770641260:
                                        this.f14150 = this;
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55681 = (C0946.m55979("ۧܶ") + i8) * 21;
                                            i9 = ((iM55681 ^ i7) * (-24317)) ^ 2009831908;
                                            i10 = 1728112698;
                                        } else {
                                            iM55681 = C0946.m55979("۫ۚ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * (-9491)) ^ (-1510584140);
                                            i10 = 1284251699;
                                        }
                                        break;
                                    case 79760325:
                                    case 726972379:
                                        if (RunnableC0871.m55672() >= 0) {
                                            iM55681 = (C0873.m55680("۟֫") ^ i8) * (-63);
                                            i9 = ((iM55681 ^ i7) * (-29453)) ^ 1856079321;
                                            i10 = 190944455;
                                        } else {
                                            iM55681 = C0946.m55979("᩹ܰ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        }
                                        break;
                                    case 130378269:
                                    case 405316525:
                                        if (C1024.m56209() >= 0) {
                                            iM55681 = (C0946.m55979("ۧܶ") + i8) * 21;
                                            i9 = ((iM55681 ^ i7) * (-24317)) ^ 2009831908;
                                            i10 = 1728112698;
                                        } else {
                                            iM55681 = C0946.m55979("ۨۖ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 2059) ^ (-2110583018);
                                            i10 = 1140045417;
                                        }
                                        break;
                                    case 368149939:
                                    case 956614149:
                                        C1012.m56134();
                                        C0927.m55873();
                                        throw new RuntimeException();
                                    case 424844721:
                                    case 1929297490:
                                        C0882.m55710();
                                        if (C0927.f81875) {
                                            iM55681 = (C0873.m55680("۟֫") ^ i8) * (-63);
                                            i9 = ((iM55681 ^ i7) * (-29453)) ^ 1856079321;
                                            i10 = 190944455;
                                        } else {
                                            iM55681 = (C0946.m55979("᩶ܺ") ^ i7) * 57;
                                            i9 = ((iM55681 ^ i8) * (-25607)) ^ (-305825844);
                                            i10 = 1329681609;
                                        }
                                        break;
                                    case 1091438767:
                                    case 2027273474:
                                        if (C1028.f81950 <= 0) {
                                            iM55681 = C0946.m55979("᩹ܰ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        } else {
                                            iM55681 = (C0873.m55680("ܽܰ") + i7) * (-19);
                                            i9 = ((iM55681 ^ i8) * 15655) ^ 218756177;
                                            i10 = 1088840240;
                                        }
                                        break;
                                    default:
                                        if (C0992.f81922 >= 0) {
                                            iM55681 = C0946.m55979("᩹ܰ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        } else {
                                            iM55681 = C0873.m55680("ܶۖ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * (-4879)) ^ 1179161595;
                                            i10 = -1787506030;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
                        /* JADX WARN: Code duplicated, block: B:81:0x02b8 A[PHI: r8 r16 r17
                          0x02b8: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:70:0x022f, B:6:0x003e, B:23:0x007d] A[DONT_GENERATE, DONT_INLINE]
                          0x02b8: PHI (r16v29 'th' java.lang.Throwable) = (r16v8 'th' java.lang.Throwable), (r16v19 'th' java.lang.Throwable), (r16v30 'th' java.lang.Throwable) binds: [B:70:0x022f, B:6:0x003e, B:23:0x007d] A[DONT_GENERATE, DONT_INLINE]
                          0x02b8: PHI (r17v26 int) = (r17v6 int), (r17v17 int), (r17v27 int) binds: [B:70:0x022f, B:6:0x003e, B:23:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
                        
                            if (p067l.ViewOnClickListenerC0939.f81888 <= 0) goto L37;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            int iM55979;
                            int i6;
                            int iM559710;
                            int i7;
                            short[] sArr = null;
                            char c = 0;
                            short s = 0;
                            int i8 = 0;
                            int i9 = 0;
                            short s2 = 0;
                            int i10 = 0;
                            int i11 = 1652090969;
                            int i12 = AbstractC0942.f81890;
                            int i13 = RunnableC0938.f81886;
                            int iM55681 = (i13 - C0873.m55680("᩺᩺")) * 15;
                            int i14 = ((iM55681 ^ i12) * (-103)) ^ 769707839;
                            int i15 = iM55681 ^ 391623835;
                            String str2 = null;
                            Throwable th = null;
                            boolean z2 = false;
                            while (true) {
                                i11 = ((((i11 ^ i12) * (-11713)) >> 31) & i14) ^ i15;
                                switch (i11) {
                                    case -2145812858:
                                    case 1468871629:
                                        C1024.m56209();
                                        if (C0877.f81843 < 0) {
                                            th = th;
                                            i11 = i11;
                                            iM55979 = (C0873.m55680("ᩴۗ") ^ i13) * 21;
                                            i14 = ((iM55979 ^ i12) * (-24677)) ^ (-163804268);
                                            i6 = -1046239731;
                                            i15 = iM55979 ^ i6;
                                            th = th;
                                            i11 = i11;
                                        } else {
                                            iM559710 = (i13 - C0946.m55979("ۤ᩹")) * 59;
                                            i14 = ((iM559710 ^ i12) * 28991) ^ (-1380085640);
                                            i7 = 1473288328;
                                            i15 = iM559710 ^ i7;
                                        }
                                        break;
                                    case -2021798630:
                                    case -1142741682:
                                        if (ViewOnClickListenerC0939.f81888 > 0) {
                                            th = th;
                                            i11 = i11;
                                            iM55979 = (i12 - C0946.m55979("ۖܰ")) * (-61);
                                            i14 = ((iM55979 ^ i13) * 21681) ^ 1276345536;
                                            i6 = -989814632;
                                            i15 = iM55979 ^ i6;
                                            th = th;
                                            i11 = i11;
                                        } else {
                                            iM559710 = (i13 - C0946.m55979("ۤ᩹")) * 59;
                                            i14 = ((iM559710 ^ i12) * 28991) ^ (-1380085640);
                                            i7 = 1473288328;
                                            i15 = iM559710 ^ i7;
                                        }
                                        break;
                                    case -1938226293:
                                    case -929201825:
                                        if (C0930.f81879 > 0) {
                                            iM559710 = (C0873.m55680("᩷ۨ") ^ i12) * 45;
                                            i14 = ((iM559710 ^ i13) * (-29583)) ^ 1911683046;
                                            i7 = 388620417;
                                            i15 = iM559710 ^ i7;
                                        } else {
                                            th = th;
                                            i11 = i11;
                                            iM55979 = C0873.m55680("֡᩶") ^ i13;
                                            i14 = ((iM55979 ^ i12) * (-23095)) ^ (-1342575753);
                                            i6 = 87132474;
                                            i15 = iM55979 ^ i6;
                                            th = th;
                                            i11 = i11;
                                        }
                                        break;
                                    case -1798136091:
                                    case 1957992878:
                                        C0892.m55749();
                                        RunnableC0897.m55784();
                                        th = th;
                                        i11 = i11;
                                        iM55979 = (C0873.m55680("֨۬") + i12) * (-89);
                                        i14 = ((iM55979 ^ i13) * (-21919)) ^ (-1376031505);
                                        i6 = 111759362;
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case -1780821356:
                                    case 496911941:
                                        try {
                                            Application applicationM55620 = C0861.m55620();
                                            th = th;
                                            int i16 = ActivityC12554.f35272;
                                            Intent intent = new Intent(applicationM55620, (Class<?>) ActivityC12554.class);
                                            i11 = i11;
                                            try {
                                                C0917.m55843(intent, C0845.m55592(f81943, 1, 3, i10), C12474.m28713(str2));
                                                intent.putExtra(C0890.m55726(f81943, 4, 9, i10), z2);
                                                C0927.m55875(intent, 268435456);
                                                C1929.m56568(C1012.m56136(), intent);
                                                iM55979 = (i13 - C0946.m55979("֨ۘ")) * 77;
                                                i14 = ((iM55979 ^ i12) * 4389) ^ 843760934;
                                                i6 = -375886045;
                                                i15 = iM55979 ^ i6;
                                                th = th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                int iM559711 = (i12 - C0946.m55979("ᩴ֡")) * 127;
                                                i14 = (-1157650467) ^ ((iM559711 ^ i13) * (-22223));
                                                i15 = 71521616 ^ iM559711;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            i11 = i11;
                                        }
                                        i11 = i11;
                                        break;
                                    case -1709835260:
                                    case -730600757:
                                        th = th;
                                        i11 = i11;
                                        if (C1964.f83032 <= 0) {
                                            iM55979 = C0873.m55680("֫ܽ") ^ i12;
                                            i14 = ((iM55979 ^ i13) * 22279) ^ 1205498934;
                                            i6 = -692893705;
                                        } else {
                                            iM55979 = (C0873.m55680("ۜ֡") + i13) * 19;
                                            i14 = ((iM55979 ^ i12) * 30033) ^ (-573604419);
                                            i6 = 1797938764;
                                        }
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case -1686119891:
                                    case -1547143489:
                                        th = th;
                                        i11 = i11;
                                        sArr = f81943;
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55979 = (C0873.m55680("ᩴۗ") ^ i13) * 21;
                                            i14 = ((iM55979 ^ i12) * (-24677)) ^ (-163804268);
                                            i6 = -1046239731;
                                        } else {
                                            iM55979 = (i12 - C0946.m55979("ᩳܶ")) * 45;
                                            i14 = ((iM55979 ^ i13) * (-22201)) ^ (-1987762426);
                                            i6 = -841954994;
                                        }
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case -1668242845:
                                    case 1281830690:
                                        if (C1017.f81942 < 0) {
                                            iM559710 = (C0873.m55680("᩷ۨ") ^ i12) * 45;
                                            i14 = ((iM559710 ^ i13) * (-29583)) ^ 1911683046;
                                            i7 = 388620417;
                                        } else {
                                            iM559710 = (i13 - C0946.m55979("ۤ᩹")) * 59;
                                            i14 = ((iM559710 ^ i12) * 28991) ^ (-1380085640);
                                            i7 = 1473288328;
                                        }
                                        i15 = iM559710 ^ i7;
                                        break;
                                    case -1577660176:
                                    case 182406214:
                                        th = th;
                                        i11 = i11;
                                        s = sArr[c];
                                        i8 = s * s;
                                        if (C1048.f81963) {
                                            iM55979 = (i12 - C0946.m55979("ۧ᩻")) * (-101);
                                            i14 = ((iM55979 ^ i13) * (-30305)) ^ 735844729;
                                            i6 = -343053276;
                                        } else {
                                            iM55979 = C0873.m55680("۫ᩴ") ^ i13;
                                            i14 = ((iM55979 ^ i12) * 9543) ^ 1243355004;
                                            i6 = -934928577;
                                        }
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case -1361572441:
                                    case 367035052:
                                        i10 = 21065;
                                        iM55979 = C0946.m55979("ܰᩴ") ^ i12;
                                        i14 = ((iM55979 ^ i13) * (-11963)) ^ 1264760624;
                                        i6 = 722885928;
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case -1199826702:
                                    case 23841522:
                                        th = th;
                                        i11 = i11;
                                        if ((s * s2) - i9 <= 0) {
                                            iM55979 = (i13 - C0873.m55680("᩵ۨ")) * (-13);
                                            i14 = ((iM55979 ^ i12) * 12661) ^ 418172510;
                                            i6 = -448229097;
                                        } else {
                                            iM55979 = (i13 - C0873.m55680("ܽۘ")) * (-115);
                                            i14 = ((iM55979 ^ i12) * (-11299)) ^ 1600177323;
                                            i6 = -640511484;
                                        }
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case -1194091151:
                                    case 611516114:
                                        th = th;
                                        i11 = i11;
                                        if (C0854.f81826 != 0) {
                                            iM55979 = C0873.m55680("֡᩶") ^ i13;
                                            i14 = ((iM55979 ^ i12) * (-23095)) ^ (-1342575753);
                                            i6 = 87132474;
                                        } else {
                                            iM55979 = C0873.m55680("۬᩵") ^ i12;
                                            i14 = ((iM55979 ^ i13) * (-22217)) ^ (-479296168);
                                            i6 = -1366940896;
                                        }
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case -974415570:
                                    case 919699312:
                                        C1048.m56305();
                                        if (C1071.m56343() != 0) {
                                            th = th;
                                            i11 = i11;
                                            iM55979 = (i13 - C0946.m55979("ۡۘ")) * (-35);
                                            i14 = ((iM55979 ^ i12) * (-20769)) ^ 684960712;
                                            i6 = -1970579075;
                                            i15 = iM55979 ^ i6;
                                            th = th;
                                            i11 = i11;
                                        } else {
                                            iM559710 = (i13 - C0946.m55979("ۤ᩹")) * 59;
                                            i14 = ((iM559710 ^ i12) * 28991) ^ (-1380085640);
                                            i7 = 1473288328;
                                            i15 = iM559710 ^ i7;
                                        }
                                        break;
                                    case -839666583:
                                    case 614028081:
                                        th = th;
                                        i11 = i11;
                                        i9 = i8 + 13388281;
                                        if (C1124.f82007 >= 0) {
                                            iM55979 = (i13 - C0946.m55979("ۡۘ")) * (-35);
                                            i14 = ((iM55979 ^ i12) * (-20769)) ^ 684960712;
                                            i6 = -1970579075;
                                        } else {
                                            iM55979 = C0873.m55680("ܶ᩶") ^ i13;
                                            i14 = ((iM55979 ^ i12) * (-16437)) ^ (-1230663172);
                                            i6 = 2045058334;
                                        }
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case -656544301:
                                    case 943369767:
                                        ViewOnClickListenerC0939.m55941();
                                        break;
                                    case -562606681:
                                    case -113196934:
                                        this.f14150.log(th);
                                        if (C0854.f81826 != 0) {
                                            iM559710 = (i13 - C0946.m55979("ۤ᩹")) * 59;
                                            i14 = ((iM559710 ^ i12) * 28991) ^ (-1380085640);
                                            i7 = 1473288328;
                                        } else {
                                            iM559710 = C0946.m55979("ۢ֨") ^ i12;
                                            i14 = ((iM559710 ^ i13) * (-27715)) ^ 198019356;
                                            i7 = 1972268764;
                                        }
                                        i15 = iM559710 ^ i7;
                                        break;
                                    case -402245580:
                                    case 230081227:
                                        th = th;
                                        i11 = i11;
                                        s2 = 7318;
                                        if (C1028.f81950 <= 0) {
                                            iM55979 = (i12 - C0873.m55680("֡۠")) * (-63);
                                            i14 = ((iM55979 ^ i13) * 16651) ^ (-486822048);
                                            i6 = -66722741;
                                        } else {
                                            iM55979 = (C0946.m55979("ۢۢ") + i12) * 9;
                                            i14 = ((iM55979 ^ i13) * 16143) ^ 403076383;
                                            i6 = 225248041;
                                        }
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case -155640402:
                                    case 494642606:
                                        th = th;
                                        i11 = i11;
                                        if (C0894.f81854 >= 0) {
                                            iM55979 = (i12 - C0946.m55979("ۖܰ")) * (-61);
                                            i14 = ((iM55979 ^ i13) * 21681) ^ 1276345536;
                                            i6 = -989814632;
                                        } else {
                                            iM55979 = (i13 - C0873.m55680("ܳܰ")) * (-121);
                                            i14 = ((iM55979 ^ i12) * (-21455)) ^ (-768953385);
                                            i6 = -540308016;
                                        }
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case -130339210:
                                    case 589576793:
                                        C22682.m50800(C0863.m55639(th));
                                        break;
                                    case -97675712:
                                    case 1503998204:
                                        C0955.m56025();
                                        if (!C0892.f81851) {
                                            th = th;
                                            i11 = i11;
                                            iM55979 = (i12 - C0873.m55680("֡۠")) * (-63);
                                            i14 = ((iM55979 ^ i13) * 16651) ^ (-486822048);
                                            i6 = -66722741;
                                            i15 = iM55979 ^ i6;
                                            th = th;
                                            i11 = i11;
                                        } else {
                                            iM559710 = (i13 - C0946.m55979("ۤ᩹")) * 59;
                                            i14 = ((iM559710 ^ i12) * 28991) ^ (-1380085640);
                                            i7 = 1473288328;
                                            i15 = iM559710 ^ i7;
                                        }
                                        break;
                                    case 108451134:
                                    case 2109484015:
                                        th = th;
                                        i11 = i11;
                                        str2 = str;
                                        z2 = z;
                                        iM55979 = C0946.m55979("۠ۘ") ^ i13;
                                        i14 = ((iM55979 ^ i12) * 18579) ^ (-1775414446);
                                        i6 = 70899270;
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case 147536913:
                                    case 340090786:
                                        break;
                                    case 418304252:
                                    case 1357225648:
                                        th = th;
                                        i11 = i11;
                                        c = 0;
                                        if (C1012.m56134() <= 0) {
                                            iM55979 = (C0873.m55680("֨۬") + i12) * (-89);
                                            i14 = ((iM55979 ^ i13) * (-21919)) ^ (-1376031505);
                                            i6 = 111759362;
                                        } else {
                                            iM55979 = C0946.m55979("ۜ᩸") ^ i13;
                                            i14 = ((iM55979 ^ i12) * 14391) ^ 1508793173;
                                            i6 = 806740166;
                                        }
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case 754788459:
                                    case 1988273229:
                                        break;
                                    case 785035925:
                                    case 1345762671:
                                        C1124.m56367();
                                        if (C0947.f81895) {
                                            th = th;
                                            i11 = i11;
                                            iM55979 = C0873.m55680("֫ܽ") ^ i12;
                                            i14 = ((iM55979 ^ i13) * 22279) ^ 1205498934;
                                            i6 = -692893705;
                                            i15 = iM55979 ^ i6;
                                            th = th;
                                            i11 = i11;
                                        }
                                        th = th;
                                        i11 = i11;
                                        iM55979 = C0873.m55680("֡᩶") ^ i13;
                                        i14 = ((iM55979 ^ i12) * (-23095)) ^ (-1342575753);
                                        i6 = 87132474;
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    case 1864659922:
                                    case 1927232450:
                                        i10 = 7165;
                                        iM55979 = C0946.m55979("ܰᩴ") ^ i12;
                                        i14 = ((iM55979 ^ i13) * (-11963)) ^ 1264760624;
                                        i6 = 722885928;
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                    default:
                                        th = th;
                                        i11 = i11;
                                        if (C1929.f83011 != 0) {
                                            iM55979 = (i13 - C0946.m55979("ۡۘ")) * (-35);
                                            i14 = ((iM55979 ^ i12) * (-20769)) ^ 684960712;
                                            i6 = -1970579075;
                                        } else {
                                            iM55979 = (i12 - C0946.m55979("֡᩷")) * 55;
                                            i14 = ((iM55979 ^ i13) * 4127) ^ (-1021195533);
                                            i6 = -2036893513;
                                        }
                                        i15 = iM55979 ^ i6;
                                        th = th;
                                        i11 = i11;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -1764777985:
                case -192549981:
                    if (C1003.m56123() != 0) {
                        iM55680 = C0946.m55979("᩸ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-13595)) ^ 413776702;
                        i5 = 1348478748;
                    } else {
                        iM55680 = (C0873.m55680("᩸ܰ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i2) * (-14717)) ^ (-1173457106);
                        i5 = 685322629;
                    }
                    break;
                case -1759761490:
                case -1118552946:
                    C0955.m56025();
                    iM55680 = C0873.m55680("ۨ᩷") ^ i3;
                    i4 = ((iM55680 ^ i2) * 10799) ^ (-1705796459);
                    i5 = 865975112;
                    break;
                case -1624776308:
                case -242985243:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("ۢܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30169)) ^ 2061718891;
                        i5 = -1368527736;
                    } else {
                        iM55680 = (C0873.m55680("۟ܳ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i3) * (-10127)) ^ 1757429939;
                        i5 = -222719973;
                    }
                    break;
                case -1264394818:
                case 1620437420:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("ۢܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30169)) ^ 2061718891;
                        i5 = -1368527736;
                    } else {
                        iM55680 = C0946.m55979("᩸ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-13595)) ^ 413776702;
                        i5 = 1348478748;
                    }
                    break;
                case -1220255522:
                case -534144195:
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("ۜܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5731)) ^ 2057995378;
                        i5 = -349046245;
                    } else {
                        iM55680 = (C0873.m55680("ۜ᩺") + i3) * (-69);
                        i4 = ((iM55680 ^ i2) * 10621) ^ (-785975673);
                        i5 = -1242685984;
                    }
                    break;
                case -1204190317:
                case -714971470:
                    C1194.m56396();
                    C1229.m56410();
                    break;
                case -774146058:
                case 1865455977:
                    if (RunnableC0897.m55784()) {
                        iM55680 = C0946.m55979("ۨܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 10855) ^ 1164217847;
                        i5 = -1757875967;
                    } else {
                        iM55680 = C0873.m55680("ۗᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 2655) ^ 1337340954;
                        i5 = 2013956117;
                    }
                    break;
                case -373582938:
                case 1402131052:
                    if (C1048.f81963) {
                        iM55680 = C0946.m55979("ۗۘ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6287) ^ 1882101372;
                        i5 = -225203136;
                    } else {
                        iM55680 = C0946.m55979("᩸ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-13595)) ^ 413776702;
                        i5 = 1348478748;
                    }
                    break;
                case -6935519:
                case 1129975883:
                    C0845.m55584();
                    if (C0949.f81897 < 0) {
                        iM55680 = C0946.m55979("᩸ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-13595)) ^ 413776702;
                        i5 = 1348478748;
                    } else {
                        iM55680 = C0873.m55680("ۨ᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * 10799) ^ (-1705796459);
                        i5 = 865975112;
                    }
                    break;
                case 530863862:
                case 2004114612:
                    if (C0906.m55809() <= 0) {
                        iM55680 = C0873.m55680("ۨ᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * 10799) ^ (-1705796459);
                        i5 = 865975112;
                    } else {
                        iM55680 = (C0946.m55979("ۗ᩸") ^ i3) * 63;
                        i4 = ((iM55680 ^ i2) * 25889) ^ 935696085;
                        i5 = -1394485106;
                    }
                    break;
                case 731636455:
                case 1761970036:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0946.m55979("᩸ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-13595)) ^ 413776702;
                        i5 = 1348478748;
                    } else {
                        iM55680 = (C0873.m55680("᩵᩶") ^ i2) * 13;
                        i4 = ((iM55680 ^ i3) * 22593) ^ (-2024207485);
                        i5 = 341362398;
                    }
                    break;
                case 1291816818:
                case 1883350890:
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("ۨ᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * 10799) ^ (-1705796459);
                        i5 = 865975112;
                    } else {
                        iM55680 = C0873.m55680("ܰۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23119) ^ 946114346;
                        i5 = 2132919902;
                    }
                    break;
                default:
                    C0912.m55833();
                    if (C1003.f81929 > 0) {
                        iM55680 = C0946.m55979("ۜܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5731)) ^ 2057995378;
                        i5 = -349046245;
                    } else {
                        iM55680 = C0946.m55979("ۢܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30169)) ^ 2061718891;
                        i5 = -1368527736;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final void log(Throwable th) {
        String str = null;
        int i = 1623954857;
        int i2 = C1071.f81975;
        int i3 = RunnableC0938.f81886;
        int iM55979 = C0946.m55979("֨ܽ") ^ i3;
        int i4 = ((iM55979 ^ i2) * 1761) ^ (-413634979);
        int i5 = -145714530;
        while (true) {
            i = ((((i ^ i2) * 4941) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2087287227:
                case 863273268:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ۚۖ") ^ i2) * (-95);
                        i4 = ((iM55979 ^ i3) * (-31239)) ^ (-2116604401);
                        i5 = -1356130498;
                    } else {
                        iM55979 = C0873.m55680("ܿۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15433) ^ 1976688205;
                        i5 = 303183951;
                    }
                    break;
                case -1705096933:
                case -119625815:
                    C1025.m56230();
                    if (C0866.f81837 < 0) {
                        iM55979 = C0946.m55979("ۢ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 18853) ^ (-2050344692);
                        i5 = 287339523;
                    } else {
                        iM55979 = (C0946.m55979("ۙۚ") ^ i3) * (-89);
                        i4 = ((iM55979 ^ i2) * 16649) ^ 1127626302;
                        i5 = 1685953518;
                    }
                    break;
                case -1326771710:
                case 1156821942:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ᩴᩴ")) * (-45);
                        i4 = ((iM55979 ^ i2) * (-29645)) ^ (-1827256774);
                        i5 = -2050065069;
                    } else {
                        iM55979 = (C0946.m55979("ۗ֨") + i2) * (-125);
                        i4 = ((iM55979 ^ i3) * (-16053)) ^ 201698945;
                        i5 = 816074963;
                    }
                    break;
                case -1275603519:
                case -271357337:
                    str = this.f34933;
                    if (C1964.m56597() != 0) {
                        iM55979 = C0873.m55680("ܽ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2591) ^ (-820609253);
                        i5 = 196963564;
                    } else {
                        iM55979 = (C0873.m55680("᩻᩻") ^ i2) * (-79);
                        i4 = ((iM55979 ^ i3) * 15249) ^ 2027690519;
                        i5 = 986793531;
                    }
                    break;
                case -1196567069:
                case 1723071265:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0946.m55979("ۙۚ") ^ i3) * (-89);
                        i4 = ((iM55979 ^ i2) * 16649) ^ 1127626302;
                        i5 = 1685953518;
                    } else {
                        iM55979 = (C0946.m55979("ᩳۢ") + i3) * 41;
                        i4 = ((iM55979 ^ i2) * 14093) ^ (-1939241843);
                        i5 = 258295568;
                    }
                    break;
                case -866541630:
                case 118341584:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("ܽ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2591) ^ (-820609253);
                        i5 = 196963564;
                    } else {
                        iM55979 = (C0946.m55979("᩸᩵") + i3) * (-111);
                        i4 = ((iM55979 ^ i2) * 25267) ^ 1044964083;
                        i5 = 255142102;
                    }
                    break;
                case -674391026:
                case -29690178:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0946.m55979("ۙۚ") ^ i3) * (-89);
                        i4 = ((iM55979 ^ i2) * 16649) ^ 1127626302;
                        i5 = 1685953518;
                    } else {
                        iM55979 = C0873.m55680("᩸᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 23233) ^ (-448395356);
                        i5 = -1523706246;
                    }
                    break;
                case -565645491:
                case 1631523149:
                    C0946.m55980();
                    if (!C1048.f81963) {
                        iM55979 = (C0946.m55979("ۙۚ") ^ i3) * (-89);
                        i4 = ((iM55979 ^ i2) * 16649) ^ 1127626302;
                        i5 = 1685953518;
                    } else {
                        iM55979 = (C0873.m55680("ۚۖ") ^ i2) * (-95);
                        i4 = ((iM55979 ^ i3) * (-31239)) ^ (-2116604401);
                        i5 = -1356130498;
                    }
                    break;
                case -421652013:
                case -4450061:
                    if (C0937.m55918() >= 0) {
                        iM55979 = C0946.m55979("ۢ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 18853) ^ (-2050344692);
                        i5 = 287339523;
                    } else {
                        iM55979 = (C0873.m55680("ۛܺ") + i3) * (-81);
                        i4 = ((iM55979 ^ i2) * 10475) ^ 1428736089;
                        i5 = -1840025615;
                    }
                    break;
                case -223043928:
                case 745407427:
                    C0877.m55696();
                    iM55979 = (C0873.m55680("ۚۖ") ^ i2) * (-95);
                    i4 = ((iM55979 ^ i3) * (-31239)) ^ (-2116604401);
                    i5 = -1356130498;
                    break;
                case 55213521:
                case 1365667825:
                    if (C0937.m55918() >= 0) {
                        iM55979 = (i3 - C0946.m55979("ᩴᩴ")) * (-45);
                        i4 = ((iM55979 ^ i2) * (-29645)) ^ (-1827256774);
                        i5 = -2050065069;
                    } else {
                        iM55979 = C0946.m55979("ۢܳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30037)) ^ (-1691927031);
                        i5 = -1067115646;
                    }
                    break;
                case 263442498:
                case 1919789035:
                    C1024.m56209();
                    break;
                case 628989952:
                case 1111869554:
                    if (C0861.m55626()) {
                        iM55979 = C0873.m55680("ܽ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2591) ^ (-820609253);
                        i5 = 196963564;
                    } else {
                        iM55979 = (C0873.m55680("᩸ۚ") ^ i3) * 47;
                        i4 = ((iM55979 ^ i2) * 21099) ^ 1558035992;
                        i5 = 528774454;
                    }
                    break;
                case 836240737:
                case 932935422:
                    C0877.m55696();
                    if (!C1929.m56553()) {
                        iM55979 = (C0946.m55979("ۙۚ") ^ i3) * (-89);
                        i4 = ((iM55979 ^ i2) * 16649) ^ 1127626302;
                        i5 = 1685953518;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ᩴᩴ")) * (-45);
                        i4 = ((iM55979 ^ i2) * (-29645)) ^ (-1827256774);
                        i5 = -2050065069;
                    }
                    break;
                case 883491079:
                case 1595963064:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0873.m55680("ۚۖ") ^ i2) * (-95);
                        i4 = ((iM55979 ^ i3) * (-31239)) ^ (-2116604401);
                        i5 = -1356130498;
                    } else {
                        iM55979 = (C0946.m55979("ۗ۬") ^ i3) * 53;
                        i4 = ((iM55979 ^ i2) * (-17677)) ^ (-1388517373);
                        i5 = 856525051;
                    }
                    break;
                default:
                    C16907.m38472(str, null, th);
                    break;
            }
            return;
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final void showToastL(CharSequence charSequence) {
        int i = 0;
        CharSequence charSequenceM55876 = null;
        String str = null;
        int i2 = 713282332;
        int i3 = C0912.f81867;
        int i4 = C1071.f81975;
        int iM55680 = (C0873.m55680("֡ܳ") + i4) * 53;
        int i5 = ((iM55680 ^ i3) * (-19125)) ^ (-838623513);
        int i6 = -404628664;
        while (true) {
            int i7 = iM55680 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 19645) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1986532002:
                    case 856564092:
                        if (C0927.f81875) {
                            iM55680 = C0873.m55680("ᩳܿ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-4459)) ^ 638683785;
                            i6 = -1571072633;
                        } else {
                            iM55680 = C0873.m55680("᩺ܳ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-20909)) ^ (-1392305181);
                            i6 = -453901310;
                        }
                        break;
                    case -1906542744:
                    case 2068337838:
                        C1053.m56327();
                        break;
                    case -1725211862:
                    case -410378278:
                        C1404.m56468();
                        iM55680 = C0946.m55979("֡֨") ^ i3;
                        i5 = ((iM55680 ^ i4) * 1323) ^ (-1216074089);
                        i6 = 948058909;
                        break;
                    case -1607376744:
                    case -422611816:
                        if (RunnableC0871.m55672() >= 0) {
                            iM55680 = C0946.m55979("᩶ᩳ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-2179)) ^ (-92103883);
                            i6 = -1053651033;
                        } else {
                            iM55680 = (C0873.m55680("ۜۘ") ^ i3) * 73;
                            i5 = ((iM55680 ^ i4) * (-19539)) ^ (-12027507);
                            i6 = 1641735779;
                        }
                        break;
                    case -1553835127:
                    case 608036856:
                        if (C1071.f81975 <= 0) {
                            iM55680 = C0873.m55680("ᩳܿ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-4459)) ^ 638683785;
                            i6 = -1571072633;
                        } else {
                            iM55680 = C0873.m55680("ܽۛ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-32665)) ^ 1250000579;
                            i6 = -876275942;
                        }
                        break;
                    case -1505248018:
                    case 1619133937:
                        if (C1003.f81929 <= 0) {
                            iM55680 = C0873.m55680("ᩳܿ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-4459)) ^ 638683785;
                            i6 = -1571072633;
                        } else {
                            iM55680 = C0873.m55680("ܿۜ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 7815) ^ (-55772834);
                            i6 = 234991111;
                        }
                        break;
                    case -1420079138:
                    case -1135546776:
                        if (C0892.m55748(1, str) == '}') {
                            iM55680 = (C0946.m55979("᩻ۧ") ^ i4) * 67;
                            i5 = ((iM55680 ^ i3) * 3405) ^ 154536493;
                            i6 = 568887008;
                        } else {
                            charSequenceM55876 = charSequence;
                            iM55680 = C0946.m55979("ᩴ֨") ^ i4;
                            i5 = ((iM55680 ^ i3) * 6209) ^ 1430562868;
                            i6 = -805750619;
                        }
                        break;
                    case -1035280069:
                    case 616501967:
                        if (C0863.m55643()) {
                            iM55680 = (i3 - C0946.m55979("ۨ۠")) * 69;
                            i5 = ((iM55680 ^ i4) * 15781) ^ 1468001379;
                            i6 = 636724733;
                        } else {
                            iM55680 = C0946.m55979("֡֨") ^ i3;
                            i5 = ((iM55680 ^ i4) * 1323) ^ (-1216074089);
                            i6 = 948058909;
                        }
                        break;
                    case -1029782623:
                    case 1007066452:
                        if (C1024.m56209() >= 0) {
                            iM55680 = C0873.m55680("ܽۛ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-32665)) ^ 1250000579;
                            i6 = -876275942;
                        } else {
                            iM55680 = (i3 - C0873.m55680("᩺֨")) * (-105);
                            i5 = ((iM55680 ^ i4) * 26659) ^ (-1662948627);
                            i6 = 2082722991;
                        }
                        break;
                    case -996486034:
                    case -510479041:
                        C0989.m56095();
                        if (!C0892.f81851) {
                            iM55680 = C0946.m55979("᩶ᩳ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-2179)) ^ (-92103883);
                            i6 = -1053651033;
                        } else {
                            iM55680 = C0873.m55680("ܽۛ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-32665)) ^ 1250000579;
                            i6 = -876275942;
                        }
                        break;
                    case -958420202:
                    case 1329411013:
                        if (C0917.m55854()) {
                            iM55680 = C0873.m55680("ܳܺ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 23847) ^ (-1710403873);
                            i6 = 1047482183;
                        } else {
                            iM55680 = C0873.m55680("ۧ֡") ^ i4;
                            i5 = ((iM55680 ^ i3) * 30661) ^ 2020444919;
                            i6 = 42394274;
                        }
                        break;
                    case -877460731:
                    case -381558831:
                        C21862 c21862 = C16907.f50058;
                        if (C0912.f81867 > 0) {
                            ThreadUtil.runOnUiThread(new RunnableC10203(i, charSequenceM55876));
                        }
                        iM55680 = C0873.m55680("ۧ֡") ^ i4;
                        i5 = ((iM55680 ^ i3) * 30661) ^ 2020444919;
                        i6 = 42394274;
                        break;
                    case -829580018:
                    case 893428811:
                        if (C1964.m56597() != 0) {
                            iM55680 = C0873.m55680("ܽۛ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-32665)) ^ 1250000579;
                            i6 = -876275942;
                        } else {
                            iM55680 = C0946.m55979("ۘܶ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 1435) ^ 1541405947;
                            i6 = 448633034;
                        }
                        break;
                    case -487890734:
                    case 1926296623:
                        if (C0937.f81884) {
                            iM55680 = (C0946.m55979("ܽܽ") ^ i3) * (-65);
                            i5 = ((iM55680 ^ i4) * 10655) ^ (-2106308778);
                            i6 = 1076976530;
                        } else {
                            iM55680 = C0946.m55979("᩶ᩳ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-2179)) ^ (-92103883);
                            i6 = -1053651033;
                        }
                        break;
                    case -310497564:
                    case 2019707009:
                        if (C0863.f81833 > 0) {
                            iM55680 = C0946.m55979("᩶ᩳ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-2179)) ^ (-92103883);
                            i6 = -1053651033;
                        } else {
                            iM55680 = C0946.m55979("֡֨") ^ i3;
                            i5 = ((iM55680 ^ i4) * 1323) ^ (-1216074089);
                            i6 = 948058909;
                        }
                        break;
                    case -62781671:
                    case 59471044:
                        charSequenceM55876 = C0927.m55876(this, str);
                        if (charSequenceM55876 == null) {
                            charSequenceM55876 = charSequence;
                        }
                        iM55680 = C0946.m55979("ᩴ֨") ^ i4;
                        i5 = ((iM55680 ^ i3) * 6209) ^ 1430562868;
                        i6 = -805750619;
                        break;
                    case 60391291:
                    case 683317178:
                        if (C1046.f81962 <= 0) {
                            iM55680 = C0873.m55680("ᩳܿ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-4459)) ^ 638683785;
                            i6 = -1571072633;
                        } else {
                            iM55680 = (C0873.m55680("ۛ᩷") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i5 = ((iM55680 ^ i3) * 13635) ^ (-734005968);
                            i6 = 1810650140;
                        }
                        break;
                    case 877338542:
                    case 2107994804:
                        if (!(charSequence instanceof String)) {
                            i = 0;
                            charSequenceM55876 = charSequence;
                            iM55680 = C0946.m55979("ᩴ֨") ^ i4;
                            i5 = ((iM55680 ^ i3) * 6209) ^ 1430562868;
                            i6 = -805750619;
                        } else {
                            int iM55681 = (i4 - C0873.m55680("᩻۫")) * 63;
                            i5 = ((iM55681 ^ i3) * 3205) ^ (-518302658);
                            i7 = iM55681 ^ (-1949307272);
                            i = 0;
                        }
                        break;
                    case 1076985781:
                    case 1373545259:
                        if (C0882.m55712(str, i) == '{') {
                            iM55680 = (C0873.m55680("۬֫") + i3) * (-43);
                            i5 = ((iM55680 ^ i4) * (-14139)) ^ 1069668477;
                            i6 = 546894311;
                        } else {
                            charSequenceM55876 = charSequence;
                            iM55680 = C0946.m55979("ᩴ֨") ^ i4;
                            i5 = ((iM55680 ^ i3) * 6209) ^ 1430562868;
                            i6 = -805750619;
                        }
                        break;
                    default:
                        str = (String) charSequence;
                        if (C0927.m55878(str) >= 3) {
                            iM55680 = (C0873.m55680("ܽ۟") + i3) * (-9);
                            i5 = ((iM55680 ^ i4) * (-30789)) ^ (-13952704);
                            i6 = -572040753;
                        } else {
                            charSequenceM55876 = charSequence;
                            iM55680 = C0946.m55979("ᩴ֨") ^ i4;
                            i5 = ((iM55680 ^ i3) * 6209) ^ 1430562868;
                            i6 = -805750619;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0292 A[PHI: r3 r10 r11 r18 r20 r21
      0x0292: PHI (r3v3 l.۟ܿ᩷) = (r3v1 l.۟ܿ᩷), (r3v2 l.۟ܿ᩷), (r3v1 l.۟ܿ᩷), (r3v1 l.۟ܿ᩷) binds: [B:68:0x0290, B:48:0x0188, B:32:0x00de, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r10v3 short) = (r10v2 short), (r10v1 short), (r10v1 short), (r10v1 short) binds: [B:68:0x0290, B:48:0x0188, B:32:0x00de, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:68:0x0290, B:48:0x0188, B:32:0x00de, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r18v23 int) = (r18v7 int), (r18v14 int), (r18v24 int), (r18v24 int) binds: [B:68:0x0290, B:48:0x0188, B:32:0x00de, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r20v19 short[]) = (r20v3 short[]), (r20v10 short[]), (r20v20 short[]), (r20v20 short[]) binds: [B:68:0x0290, B:48:0x0188, B:32:0x00de, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r21v16 char) = (r21v0 char), (r21v7 char), (r21v18 char), (r21v19 char) binds: [B:68:0x0290, B:48:0x0188, B:32:0x00de, B:27:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final C21862 m28714(String str) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        C21862 c21862;
        int i4;
        char c;
        int i5;
        int iM559710;
        int i6;
        int i7;
        C9612 c9612M41514 = null;
        C1012 c1012 = null;
        Reference reference = null;
        C21862 c21863 = null;
        C21862 c21864 = null;
        short[] sArr = null;
        char c2 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = -454452988;
        int i12 = C0845.f81821;
        int i13 = C0906.f81862;
        int iM55681 = (i13 - C0873.m55680("᩸ܺ")) * (-65);
        int i14 = ((iM55681 ^ i12) * (-12751)) ^ (-1264433072);
        int i15 = iM55681 ^ 1023657831;
        C18249 c18249 = null;
        while (true) {
            int i16 = i15 ^ (i14 & (((i11 ^ i12) * (-18771)) >> 31));
            switch (i16) {
                case -2129543556:
                case 1931890084:
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    if (this.f34932 != null) {
                        iM55979 = C0873.m55680("֡ۜ") ^ i12;
                        i = ((iM55979 ^ i13) * 12659) ^ (-480391961);
                        i3 = 578179564;
                    } else {
                        iM55979 = (i13 - C0946.m55979("۠ܳ")) * 47;
                        i = ((iM55979 ^ i12) * (-5351)) ^ (-1352632059);
                        i3 = -1270821982;
                    }
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -2099948547:
                case -1931323249:
                    C0947.m55997();
                    C1048.m56305();
                    c = c2;
                    i5 = i16;
                    iM559710 = C0946.m55979("۫᩻") ^ i12;
                    i6 = ((iM559710 ^ i13) * 28169) ^ (-651616169);
                    i7 = 1302383468;
                    int i17 = iM559710 ^ i7;
                    i11 = i5;
                    i15 = i17;
                    i14 = i6;
                    c2 = c;
                    break;
                case -2080118118:
                case -556533252:
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    c1012 = this.f34918;
                    c21862 = null;
                    reference = (Reference) c1012.getOrDefault(str, null);
                    if (reference != null) {
                        iM55979 = C0946.m55979("ۗܺ") ^ i13;
                        i = ((iM55979 ^ i12) * 16987) ^ 964284430;
                        i3 = 1300515264;
                    } else {
                        c21863 = c21862;
                        iM55979 = (C0946.m55979("ۧۖ") ^ i13) * (-95);
                        i = ((iM55979 ^ i12) * (-9945)) ^ (-1555922685);
                        i3 = 1293090788;
                    }
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -1775225590:
                case 241298980:
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    c18249 = (C18249) this.f34923.f37359;
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = C0946.m55979("֨᩶") ^ i12;
                        i = ((iM55979 ^ i13) * 16689) ^ 67705404;
                        i3 = 1883737098;
                    } else {
                        iM55979 = (i12 - C0946.m55979("ۢۛ")) * (-31);
                        i = ((iM55979 ^ i13) * 30123) ^ 1284568080;
                        i3 = 1721438994;
                    }
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -1431851421:
                case 1303162381:
                    C1028.m56247();
                    if (C0992.f81922 >= 0) {
                        sArr = sArr;
                        i16 = i16;
                        iM55680 = (i13 - C0873.m55680("ۢ۫")) * (-13);
                        i = ((iM55680 ^ i12) * (-11403)) ^ 303462588;
                        i2 = 2108507239;
                        i4 = iM55680 ^ i2;
                        i11 = i16;
                        i15 = i4;
                        i14 = i;
                        sArr = sArr;
                    }
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    iM55979 = C0946.m55979("֨᩶") ^ i12;
                    i = ((iM55979 ^ i13) * 16689) ^ 67705404;
                    i3 = 1883737098;
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -1427107571:
                case 955225567:
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    this.f34932 = c9612M41514;
                    this.f34922 = new C15155(this);
                    iM55979 = C0873.m55680("֡ۜ") ^ i12;
                    i = ((iM55979 ^ i13) * 12659) ^ (-480391961);
                    i3 = 578179564;
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -1398795095:
                case 446455801:
                    i10 = 31480;
                    iM55979 = (i12 - C0946.m55979("ۚܽ")) * (-85);
                    i = ((iM55979 ^ i13) * (-8587)) ^ 873576567;
                    i3 = -1670935228;
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -1367730473:
                case -494132056:
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    c21862 = (C21862) reference.get();
                    c21863 = c21862;
                    iM55979 = (C0946.m55979("ۧۖ") ^ i13) * (-95);
                    i = ((iM55979 ^ i12) * (-9945)) ^ (-1555922685);
                    i3 = 1293090788;
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -1325062441:
                case 106700432:
                    C0927.m55873();
                    return null;
                case -1298650064:
                case -993933508:
                    c = c2;
                    i5 = i16;
                    sArr = f82134;
                    if (C1036.f81953 >= 0) {
                        iM559710 = C0946.m55979("۫᩻") ^ i12;
                        i6 = ((iM559710 ^ i13) * 28169) ^ (-651616169);
                        i7 = 1302383468;
                    } else {
                        iM559710 = C0946.m55979("۠᩵") ^ i13;
                        i6 = ((iM559710 ^ i12) * (-27405)) ^ 558498143;
                        i7 = -466848855;
                    }
                    int i18 = iM559710 ^ i7;
                    i11 = i5;
                    i15 = i18;
                    i14 = i6;
                    c2 = c;
                    break;
                case -1240580628:
                case 1630841825:
                    if (RunnableC0938.f81886 >= 0) {
                        sArr = sArr;
                        c2 = c2;
                        i16 = i16;
                        iM55979 = C0946.m55979("֨᩶") ^ i12;
                        i = ((iM55979 ^ i13) * 16689) ^ 67705404;
                        i3 = 1883737098;
                        i4 = iM55979 ^ i3;
                        i11 = i16;
                        c2 = c2;
                        i15 = i4;
                        i14 = i;
                        sArr = sArr;
                    } else {
                        c = c2;
                        i5 = i16;
                        iM559710 = C0946.m55979("۫᩻") ^ i12;
                        i6 = ((iM559710 ^ i13) * 28169) ^ (-651616169);
                        i7 = 1302383468;
                        int i19 = iM559710 ^ i7;
                        i11 = i5;
                        i15 = i19;
                        i14 = i6;
                        c2 = c;
                    }
                    break;
                case -1234483352:
                case 1407880589:
                    if (C0861.f81831) {
                        sArr = sArr;
                        i16 = i16;
                        iM55680 = (i12 - C0946.m55979("ۗۧ")) * 41;
                        i = ((iM55680 ^ i13) * 29839) ^ (-948367194);
                        i2 = -588706064;
                        i4 = iM55680 ^ i2;
                        i11 = i16;
                        i15 = i4;
                        i14 = i;
                        sArr = sArr;
                    }
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    iM55979 = C0946.m55979("֨᩶") ^ i12;
                    i = ((iM55979 ^ i13) * 16689) ^ 67705404;
                    i3 = 1883737098;
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -1001692301:
                case -352217505:
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    i9 = i8 + 106998336;
                    s2 = 20688;
                    if (C1044.m56286() > 0) {
                        iM55979 = (i13 - C0873.m55680("᩹᩶")) * (-7);
                        i = ((iM55979 ^ i12) * (-23411)) ^ (-1878245027);
                        i3 = -409102180;
                        i4 = iM55979 ^ i3;
                        i11 = i16;
                        c2 = c2;
                        i15 = i4;
                        i14 = i;
                        sArr = sArr;
                    }
                    c2 = c2;
                    iM55680 = (i13 - C0873.m55680("ۢ۫")) * (-13);
                    i = ((iM55680 ^ i12) * (-11403)) ^ 303462588;
                    i2 = 2108507239;
                    i4 = iM55680 ^ i2;
                    i11 = i16;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -745290856:
                case -709492754:
                    i10 = 16075;
                    iM55979 = (i12 - C0946.m55979("ۚܽ")) * (-85);
                    i = ((iM55979 ^ i13) * (-8587)) ^ 873576567;
                    i3 = -1670935228;
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -130089558:
                case 1190308480:
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    if (c21863 == null) {
                        iM55979 = C0946.m55979("ۢܿ") ^ i13;
                        i = ((iM55979 ^ i12) * 23355) ^ (-1207940417);
                        i3 = -786797378;
                    } else {
                        c21864 = c21863;
                        iM55979 = (C0946.m55979("᩷ۜ") ^ i12) * (-105);
                        i = ((iM55979 ^ i13) * (-16303)) ^ (-1715520005);
                        i3 = 1181988028;
                    }
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case -32719300:
                case 430559486:
                    return c21864;
                case 243731904:
                case 772887171:
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    c9612M41514 = C18249.m41514(c18249);
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0873.m55680("ܶ۟") + i13) * 55;
                        i = ((iM55979 ^ i12) * 2215) ^ (-1342027532);
                        i3 = 763094180;
                    } else {
                        iM55979 = C0946.m55979("ܶܳ") ^ i13;
                        i = ((iM55979 ^ i12) * (-6027)) ^ 1828215507;
                        i3 = -1746418359;
                    }
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case 884202232:
                case 2115110408:
                    i16 = i16;
                    short[] sArr2 = f82134;
                    sArr = sArr;
                    if (C1124.f82007 < 0) {
                        if (C0877.m55696()) {
                            c2 = c2;
                            String strM48631 = C21466.m48631(C0930.m55893(sArr2, UMErrorCode.E_UM_BE_CREATE_FAILED, 7, i10), str);
                            if (RunnableC1014.f81941 > 0) {
                                C21862 c21865 = new C21862(this, str, strM48631, this.f34922);
                                if (C0892.f81851) {
                                    c1012.put(str, new SoftReference(c21865));
                                    c21864 = c21865;
                                    iM55979 = (C0946.m55979("᩷ۜ") ^ i12) * (-105);
                                    i = ((iM55979 ^ i13) * (-16303)) ^ (-1715520005);
                                    i3 = 1181988028;
                                }
                                i4 = iM55979 ^ i3;
                                i11 = i16;
                                c2 = c2;
                                i15 = i4;
                                i14 = i;
                                sArr = sArr;
                            }
                            c2 = c2;
                            iM55680 = (i13 - C0873.m55680("ۢ۫")) * (-13);
                            i = ((iM55680 ^ i12) * (-11403)) ^ 303462588;
                            i2 = 2108507239;
                        } else {
                            c2 = c2;
                        }
                        iM55979 = (C0873.m55680("ܶ۟") + i13) * 55;
                        i = ((iM55979 ^ i12) * 2215) ^ (-1342027532);
                        i3 = 763094180;
                        i4 = iM55979 ^ i3;
                        i11 = i16;
                        c2 = c2;
                        i15 = i4;
                        i14 = i;
                        sArr = sArr;
                    } else {
                        iM55680 = (i12 - C0946.m55979("ۗۧ")) * 41;
                        i = ((iM55680 ^ i13) * 29839) ^ (-948367194);
                        i2 = -588706064;
                    }
                    i4 = iM55680 ^ i2;
                    i11 = i16;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case 1041183687:
                case 1260661271:
                    sArr = sArr;
                    i16 = i16;
                    c2 = 'n';
                    if (C1012.f81938 >= 0) {
                        iM55680 = (i13 - C0873.m55680("ۢ۫")) * (-13);
                        i = ((iM55680 ^ i12) * (-11403)) ^ 303462588;
                        i2 = 2108507239;
                    } else {
                        iM55680 = C0873.m55680("ۚܳ") ^ i12;
                        i = ((iM55680 ^ i13) * 22199) ^ 630385055;
                        i2 = -1891019984;
                    }
                    i4 = iM55680 ^ i2;
                    i11 = i16;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                case 1116806018:
                case 1944884706:
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    s = sArr[c2];
                    i8 = s * s;
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("ܶ۟") + i13) * 55;
                        i = ((iM55979 ^ i12) * 2215) ^ (-1342027532);
                        i3 = 763094180;
                    } else {
                        iM55979 = (C0946.m55979("ۛܰ") + i12) * (-127);
                        i = ((iM55979 ^ i13) * (-1253)) ^ (-1521485915);
                        i3 = 1118367583;
                    }
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
                default:
                    sArr = sArr;
                    c2 = c2;
                    i16 = i16;
                    if (i9 - (s * s2) < 0) {
                        iM55979 = C0946.m55979("᩵ܰ") ^ i13;
                        i = ((iM55979 ^ i12) * (-17021)) ^ (-1800923551);
                        i3 = 61577689;
                    } else {
                        iM55979 = (C0946.m55979("ۧ֡") + i12) * 59;
                        i = ((iM55979 ^ i13) * (-20189)) ^ (-295733710);
                        i3 = -269114583;
                    }
                    i4 = iM55979 ^ i3;
                    i11 = i16;
                    c2 = c2;
                    i15 = i4;
                    i14 = i;
                    sArr = sArr;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01f8 A[PHI: r1 r6 r7 r8
      0x01f8: PHI (r1v4 short[]) = (r1v3 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:64:0x01f6, B:50:0x0156, B:46:0x0133, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:64:0x01f6, B:50:0x0156, B:46:0x0133, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:64:0x01f6, B:50:0x0156, B:46:0x0133, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:64:0x01f6, B:50:0x0156, B:46:0x0133, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x022a A[PHI: r3 r4
      0x022a: PHI (r3v4 short) = (r3v2 short), (r3v3 short), (r3v2 short) binds: [B:68:0x0228, B:58:0x01ab, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short) binds: [B:68:0x0228, B:58:0x01ab, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getString(String str) {
        int iM55979;
        int i;
        int i2;
        String strM55711 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1245490675;
        int i9 = ServiceConnectionC1013.f81940;
        int i10 = AbstractC0942.f81890;
        int iM55680 = (C0873.m55680("᩹ܳ") + i10) * (-61);
        int i11 = ((iM55680 ^ i9) * 5467) ^ (-129560818);
        int i12 = -672952757;
        while (true) {
            int i13 = iM55680 ^ i12;
            while (true) {
                i8 = ((((i8 ^ i9) * (-13219)) >> 31) & i11) ^ i13;
                switch (i8) {
                    case -2047904795:
                    case 1775168146:
                        strM55711 = C0882.m55711(this, str);
                        if (strM55711 != null) {
                            iM55979 = (i9 - C0946.m55979("ۘܰ")) * 63;
                            i = ((iM55979 ^ i10) * 12177) ^ 950280401;
                            i2 = 1032759529;
                        } else {
                            iM55979 = (C0873.m55680("ܳᩴ") ^ i10) * 17;
                            i = ((iM55979 ^ i9) * (-31319)) ^ (-2077378464);
                            i2 = 1562366946;
                        }
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case -2027445470:
                    case -1989439898:
                        if (!C0947.f81895) {
                        }
                        iM55979 = (C0946.m55979("۠᩷") ^ i9) * 73;
                        i = ((iM55979 ^ i10) * 3991) ^ 1976990003;
                        i2 = -364225567;
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case -1982287059:
                    case 1216177081:
                        i7 = 38568;
                        iM55979 = C0873.m55680("֫֨") ^ i10;
                        i = ((iM55979 ^ i9) * 1695) ^ 520325221;
                        i2 = -750433989;
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case -1888156516:
                    case 1762859215:
                        if (C0906.m55809() <= 0) {
                            iM55979 = C0946.m55979("᩷֡") ^ i10;
                            i = ((iM55979 ^ i9) * 12643) ^ (-917316297);
                            i2 = -1307893138;
                        } else {
                            iM55979 = C0946.m55979("ܶ᩵") ^ i10;
                            i = ((iM55979 ^ i9) * (-5845)) ^ 430257431;
                            i2 = -1936846963;
                        }
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case -1871206787:
                    case 1151561709:
                        C1036.m56257();
                        if (C0917.m55854()) {
                            iM55979 = C0946.m55979("᩷֡") ^ i10;
                            i = ((iM55979 ^ i9) * 12643) ^ (-917316297);
                            i2 = -1307893138;
                            i13 = iM55979 ^ i2;
                            i11 = i;
                        }
                        iM55979 = (C0946.m55979("۠᩷") ^ i9) * 73;
                        i = ((iM55979 ^ i10) * 3991) ^ 1976990003;
                        i2 = -364225567;
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case -1672606816:
                    case 1386177474:
                        short[] sArr2 = f82134;
                        if (!C0892.f81851 || !C0863.m55643() || !C0861.f81831) {
                            break;
                        }
                        throw new IllegalArgumentException(C0989.m56096(C1071.m56336(sArr2, 69, 18, i7), str));
                    case -1487385842:
                    case 1407823351:
                        s = sArr[c];
                        s2 = 9751;
                        if (C1044.f81959 >= 0) {
                            iM55979 = C0946.m55979("᩷֡") ^ i10;
                            i = ((iM55979 ^ i9) * 12643) ^ (-917316297);
                            i2 = -1307893138;
                        } else {
                            iM55979 = C0946.m55979("֡᩵") ^ i10;
                            i = ((iM55979 ^ i9) * 27571) ^ 475911356;
                            i2 = 271440693;
                        }
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case -1444143654:
                    case 1356956804:
                        i6 = 95082001;
                        if (C1229.f82066 >= 0) {
                            iM55979 = (C0946.m55979("۠᩷") ^ i9) * 73;
                            i = ((iM55979 ^ i10) * 3991) ^ 1976990003;
                            i2 = -364225567;
                        } else {
                            iM55979 = C0873.m55680("᩺ۛ") ^ i10;
                            i = ((iM55979 ^ i9) * (-23059)) ^ 1637406782;
                            i2 = 789997287;
                        }
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case -1378864944:
                    case -1235767813:
                        i7 = 49659;
                        iM55979 = C0873.m55680("֫֨") ^ i10;
                        i = ((iM55979 ^ i9) * 1695) ^ 520325221;
                        i2 = -750433989;
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case -635143695:
                    case 628073442:
                        sArr = f82134;
                        if (C1964.f83032 <= 0) {
                            iM55979 = (C0946.m55979("۠᩷") ^ i9) * 73;
                            i = ((iM55979 ^ i10) * 3991) ^ 1976990003;
                            i2 = -364225567;
                        } else {
                            iM55979 = C0946.m55979("ۖۢ") ^ i9;
                            i = ((iM55979 ^ i10) * (-18379)) ^ (-1552980805);
                            i2 = 1067714417;
                        }
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case -459106329:
                    case 823296923:
                        if (C0927.m55873() > 0) {
                            iM55979 = C0946.m55979("ۚۨ") ^ i9;
                            i = ((iM55979 ^ i10) * (-12763)) ^ (-1413653739);
                            i2 = 1704763480;
                            i13 = iM55979 ^ i2;
                            i11 = i;
                        }
                        break;
                    case 11606612:
                    case 1987174945:
                        i4 = i3 * i3;
                        i5 = s * s;
                        if (C1012.m56134() <= 0) {
                            iM55979 = (C0946.m55979("۠᩷") ^ i9) * 73;
                            i = ((iM55979 ^ i10) * 3991) ^ 1976990003;
                            i2 = -364225567;
                        } else {
                            iM55979 = C0946.m55979("ۘܺ") ^ i9;
                            i = ((iM55979 ^ i10) * 25765) ^ 1215848235;
                            i2 = -1139365226;
                        }
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case 21227083:
                    case 1833026305:
                        return strM55711;
                    case 235953993:
                    case 2017259582:
                        RunnableC0871.m55672();
                        return null;
                    case 271407121:
                    case 2042614469:
                        int i14 = i5 + i6;
                        if (i4 - (i14 + i14) > 0) {
                            iM55979 = (C0946.m55979("֫۫") ^ i9) * (-11);
                            i = ((iM55979 ^ i10) * 20091) ^ 948388661;
                            i2 = -1726122583;
                        } else {
                            iM55979 = C0873.m55680("ܳ۬") ^ i9;
                            i = ((iM55979 ^ i10) * (-21179)) ^ (-86183879);
                            i2 = 1093084089;
                        }
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case 573976347:
                    case 1183292482:
                        i3 = s + s2;
                        if (C1929.f83011 != 0) {
                            iM55979 = C0946.m55979("۟ᩴ") ^ i10;
                            i = ((iM55979 ^ i9) * (-5079)) ^ 1570419686;
                            i2 = -958544245;
                        } else {
                            iM55979 = (C0873.m55680("۫᩸") ^ i10) * 39;
                            i = ((iM55979 ^ i9) * (-18731)) ^ 723260527;
                            i2 = 860386198;
                        }
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    case 764073732:
                    case 1462671845:
                        C0845.m55584();
                        RunnableC0897.m55784();
                        iM55979 = (C0946.m55979("۠᩷") ^ i9) * 73;
                        i = ((iM55979 ^ i10) * 3991) ^ 1976990003;
                        i2 = -364225567;
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                    default:
                        c = 'D';
                        if (C0917.f81868) {
                            iM55979 = C0946.m55979("ۚۨ") ^ i9;
                            i = ((iM55979 ^ i10) * (-12763)) ^ (-1413653739);
                            i2 = 1704763480;
                        } else {
                            iM55979 = (i9 - C0946.m55979("ۡۧ")) * C0254q.f1218h;
                            i = ((iM55979 ^ i10) * (-4615)) ^ 741747040;
                            i2 = -414255915;
                        }
                        i13 = iM55979 ^ i2;
                        i11 = i;
                        break;
                }
            }
            iM55680 = C0873.m55680("ܽܰ") ^ i10;
            i11 = ((iM55680 ^ i9) * 32119) ^ 771246401;
            i12 = 2065743636;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x053b A[PHI: r2 r10 r18 r19 r29
      0x053b: PHI (r2v53 int) = (r2v8 int), (r2v12 int), (r2v57 int) binds: [B:128:0x0539, B:112:0x046a, B:25:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x053b: PHI (r10v23 int) = (r10v6 int), (r10v10 int), (r10v26 int) binds: [B:128:0x0539, B:112:0x046a, B:25:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x053b: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:128:0x0539, B:112:0x046a, B:25:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x053b: PHI (r19v4 short) = (r19v2 short), (r19v3 short), (r19v2 short) binds: [B:128:0x0539, B:112:0x046a, B:25:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x053b: PHI (r29v21 int) = (r29v3 int), (r29v7 int), (r29v24 int) binds: [B:128:0x0539, B:112:0x046a, B:25:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    /* JADX WARN: Code duplicated, block: B:69:0x0260 A[PHI: r3 r6 r8 r11 r15
      0x0260: PHI (r3v86 int) = (r3v42 int), (r3v85 int), (r3v2 int) binds: [B:61:0x020f, B:68:0x025e, B:27:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:61:0x020f, B:68:0x025e, B:27:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r8v23 java.lang.String) = (r8v8 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:61:0x020f, B:68:0x025e, B:27:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r11v7 l.ܽܳ᩷) = (r11v4 l.ܽܳ᩷), (r11v2 l.ܽܳ᩷), (r11v2 l.ܽܳ᩷) binds: [B:61:0x020f, B:68:0x025e, B:27:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:61:0x020f, B:68:0x025e, B:27:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x030a A[PHI: r28
      0x030a: PHI (r28v5 java.lang.String) = (r28v4 java.lang.String), (r28v3 java.lang.String) binds: [B:82:0x02f1, B:65:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getStringNullable(String str) {
        String str2;
        int iM55979;
        int i;
        int i2;
        int i3;
        int iM55680;
        int i4;
        int iM559710;
        int i5;
        int i6;
        int iM55681;
        int i7;
        int i8;
        int iM55682;
        int i9;
        int i10;
        C21862 c21862M28714;
        this = this;
        int i11 = RunnableC1014.f81941;
        int i12 = C0866.f81837;
        int iM55683 = (C0873.m55680("᩺ᩳ") ^ i12) * (-9);
        int i13 = ((iM55683 ^ i11) * (-16079)) ^ 1128918622;
        String strM38720 = null;
        String orDefault = null;
        short[] sArr = null;
        int i14 = iM55683 ^ (-1058446675);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        int i18 = 0;
        int i19 = 0;
        short s2 = 0;
        char c = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1364713587;
        String strM55622 = null;
        short[] sArr2 = null;
        String strM56454 = null;
        String orDefault2 = null;
        String str3 = null;
        C21862 c21862 = null;
        int i23 = 0;
        C18249 c18249 = null;
        while (true) {
            i22 = i14 ^ (i13 & (((i22 ^ i11) * (-31087)) >> 31));
            switch (i22) {
                case -2138308378:
                case 142392216:
                    c21862M28714 = this.f34927;
                    if (c21862M28714 != null) {
                        c21862 = c21862M28714;
                        iM559710 = C0946.m55979("ۨᩴ") ^ i12;
                        i5 = ((iM559710 ^ i11) * (-15095)) ^ (-1202731618);
                        i6 = -1812448435;
                    } else {
                        iM559710 = (i12 - C0946.m55979("ۗ۫")) * (-69);
                        i5 = ((iM559710 ^ i11) * (-19559)) ^ (-85567579);
                        i6 = 1617430681;
                    }
                    i14 = iM559710 ^ i6;
                    i13 = i5;
                    break;
                case -1990641322:
                case -585722701:
                    i15 = i15;
                    i20 = i20;
                    i21 = i21;
                    c = 'W';
                    if (C0890.f81849 != 0) {
                        iM55979 = C0873.m55680("᩶ۤ") ^ i12;
                        i = ((iM55979 ^ i11) * 6147) ^ 1020158797;
                        i2 = -551843164;
                    } else {
                        iM55979 = C0946.m55979("ۡۘ") ^ i12;
                        i = ((iM55979 ^ i11) * 14303) ^ (-572655718);
                        i2 = 811746125;
                    }
                    i14 = iM55979 ^ i2;
                    i20 = i20;
                    i13 = i;
                    i21 = i21;
                    i15 = i15;
                    break;
                case -1988780231:
                case 425902910:
                    i17 = 27713;
                    iM55979 = C0873.m55680("ܳ᩺") ^ i12;
                    i = ((iM55979 ^ i11) * (-26259)) ^ 814498095;
                    i2 = 1808890909;
                    i14 = iM55979 ^ i2;
                    i20 = i20;
                    i13 = i;
                    i21 = i21;
                    i15 = i15;
                    break;
                case -1897821030:
                case 47963360:
                    C1194.m56396();
                    if (AbstractC0942.f81890 > 0) {
                        i15 = i15;
                        i20 = i20;
                        i21 = i21;
                        iM55979 = C0946.m55979("۟ۜ") ^ i11;
                        i = ((iM55979 ^ i12) * 15319) ^ (-1258334366);
                        i2 = -1412553403;
                        i14 = iM55979 ^ i2;
                        i20 = i20;
                        i13 = i;
                        i21 = i21;
                        i15 = i15;
                    } else {
                        iM559710 = C0873.m55680("ۜۗ") ^ i12;
                        i5 = ((iM559710 ^ i11) * (-10587)) ^ (-860983417);
                        i6 = 1212988820;
                        i14 = iM559710 ^ i6;
                        i13 = i5;
                    }
                    break;
                case -1795161905:
                case -452469878:
                    return ((C21862) C16907.m38479()).getOrDefault(strM55622, str3);
                case -1783087762:
                case -415859109:
                    i15 = i15;
                    i20 = i20;
                    i21 = i21;
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ܺܿ") ^ i12;
                        i = ((iM55979 ^ i11) * 25401) ^ (-1638765761);
                        i2 = -771338672;
                    } else {
                        iM55979 = (C0946.m55979("᩺ܿ") ^ i12) * 5;
                        i = ((iM55979 ^ i11) * 18831) ^ (-1984871227);
                        i2 = 1848974083;
                    }
                    i14 = iM55979 ^ i2;
                    i20 = i20;
                    i13 = i;
                    i21 = i21;
                    i15 = i15;
                    break;
                case -1779728888:
                case 1413463273:
                    return orDefault;
                case -1754320660:
                case -1462597598:
                    RunnableC0871.m55672();
                    return null;
                case -1739690880:
                case 1049983145:
                    return C16907.f50057.getOrDefault(strM38720, str3);
                case -1566489729:
                case -925824692:
                    c21862M28714 = this.m28714(c18249.m41548());
                    this.f34927 = c21862M28714;
                    c21862 = c21862M28714;
                    iM559710 = C0946.m55979("ۨᩴ") ^ i12;
                    i5 = ((iM559710 ^ i11) * (-15095)) ^ (-1202731618);
                    i6 = -1812448435;
                    i14 = iM559710 ^ i6;
                    i13 = i5;
                    break;
                case -1390253656:
                case 972116970:
                    C0917.m55854();
                    if (C0877.m55696()) {
                        iM559710 = C0873.m55680("ۜۗ") ^ i12;
                        i5 = ((iM559710 ^ i11) * (-10587)) ^ (-860983417);
                        i6 = 1212988820;
                    } else {
                        iM559710 = (C0946.m55979("᩹ܿ") + i12) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM559710 ^ i11) * (-29833)) ^ (-59940367);
                        i6 = -1878179646;
                    }
                    i14 = iM559710 ^ i6;
                    i13 = i5;
                    break;
                case -1322021821:
                case -1259154503:
                    i15 = i15;
                    i21 = i21;
                    i20 = 0;
                    i16 = 1;
                    if (C0882.m55719(str) >= 3) {
                        iM55680 = C0873.m55680("ۡ۠") ^ i11;
                        i13 = ((iM55680 ^ i12) * (-11949)) ^ (-562066886);
                        i4 = 1823013436;
                    } else {
                        i3 = 0;
                        strM38720 = str;
                        i20 = i3;
                        iM55680 = (C0873.m55680("ۗۘ") ^ i12) * 31;
                        i13 = ((iM55680 ^ i11) * (-11685)) ^ (-1508197509);
                        i4 = -61636928;
                    }
                    i14 = iM55680 ^ i4;
                    i21 = i21;
                    i15 = i15;
                    break;
                case -1284731120:
                case -105262299:
                    orDefault = this.m28714(strM56454).getOrDefault(strM55622, str3);
                    if (orDefault == null) {
                        iM559710 = (i12 - C0946.m55979("ܳܺ")) * 123;
                        i5 = ((iM559710 ^ i11) * (-14489)) ^ (-345859899);
                        i6 = -907660422;
                    } else {
                        iM559710 = (C0946.m55979("ۧۜ") ^ i11) * (-39);
                        i5 = ((iM559710 ^ i12) * 26519) ^ (-681350740);
                        i6 = -2135152464;
                    }
                    i14 = iM559710 ^ i6;
                    i13 = i5;
                    break;
                case -1283314444:
                case -204898921:
                    C0873.m55678();
                    if (RunnableC1014.f81941 <= 0) {
                        i15 = i15;
                        i20 = i20;
                        i21 = i21;
                        iM55979 = C0873.m55680("᩶ۤ") ^ i12;
                        i = ((iM55979 ^ i11) * 6147) ^ 1020158797;
                        i2 = -551843164;
                        i14 = iM55979 ^ i2;
                        i20 = i20;
                        i13 = i;
                        i21 = i21;
                        i15 = i15;
                    } else {
                        iM559710 = C0873.m55680("ۜۗ") ^ i12;
                        i5 = ((iM559710 ^ i11) * (-10587)) ^ (-860983417);
                        i6 = 1212988820;
                        i14 = iM559710 ^ i6;
                        i13 = i5;
                    }
                    break;
                case -1254267060:
                case 1434146800:
                    if (C1404.m56458(i16, str) != '}') {
                        i15 = i15;
                        i3 = i20;
                        i21 = i21;
                        strM38720 = str;
                        i20 = i3;
                        iM55680 = (C0873.m55680("ۗۘ") ^ i12) * 31;
                        i13 = ((iM55680 ^ i11) * (-11685)) ^ (-1508197509);
                        i4 = -61636928;
                        i14 = iM55680 ^ i4;
                        i21 = i21;
                        i15 = i15;
                    } else {
                        iM559710 = C0946.m55979("ۙܳ") ^ i11;
                        i5 = ((iM559710 ^ i12) * (-7621)) ^ 1162986995;
                        i6 = 964159853;
                        i14 = iM559710 ^ i6;
                        i13 = i5;
                    }
                    break;
                case -1143153556:
                case 1437017681:
                    i15 = i15;
                    str2 = strM56454;
                    c18249 = (C18249) this.f34925.f37359;
                    if (C0949.f81897 < 0) {
                        iM55681 = (C0873.m55680("۫֨") + i12) * (-23);
                        i7 = ((iM55681 ^ i11) * 14453) ^ (-901171134);
                        i8 = 1360936031;
                        int i24 = iM55681 ^ i8;
                        strM56454 = str2;
                        i14 = i24;
                        i13 = i7;
                        i15 = i15;
                    } else {
                        strM56454 = str2;
                        i15 = i15;
                        iM559710 = (C0946.m55979("᩵ܽ") ^ i11) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM559710 ^ i12) * 23137) ^ (-572312144);
                        i6 = 822887571;
                        i14 = iM559710 ^ i6;
                        i13 = i5;
                    }
                    break;
                case -1107839378:
                case 1289461186:
                    i15 = i15;
                    str2 = strM56454;
                    orDefault2 = c21862.getOrDefault(strM38720, str3);
                    if (orDefault2 == null) {
                        iM55681 = C0946.m55979("ܳ۬") ^ i12;
                        i7 = ((iM55681 ^ i11) * (-23965)) ^ 1504836879;
                        i8 = -1590852154;
                    } else {
                        iM55681 = C0946.m55979("ۘۢ") ^ i11;
                        i7 = ((iM55681 ^ i12) * (-16273)) ^ 1388685474;
                        i8 = 1370994133;
                    }
                    int i25 = iM55681 ^ i8;
                    strM56454 = str2;
                    i14 = i25;
                    i13 = i7;
                    i15 = i15;
                    break;
                case -1052221828:
                case -899073281:
                    i20 = i20;
                    i21 = i21;
                    strM56454 = C1404.m56454(strM38720, i20, i21);
                    strM55622 = C0861.m55622(strM38720, i21 + i16);
                    if (C0992.f81922 < 0) {
                        iM55979 = (i11 - C0946.m55979("᩵۠")) * 39;
                        i15 = i15;
                        i = ((iM55979 ^ i12) * (-17439)) ^ (-1302287560);
                        i2 = 335447435;
                        i14 = iM55979 ^ i2;
                        i20 = i20;
                        i13 = i;
                        i21 = i21;
                        i15 = i15;
                    } else {
                        int iM559711 = C0946.m55979("ܰۛ") ^ i11;
                        int i26 = ((iM559711 ^ i12) * (-4957)) ^ 681698157;
                        i14 = iM559711 ^ (-859291218);
                        i20 = i20;
                        i21 = i21;
                        i13 = i26;
                        this = this;
                    }
                    break;
                case -903597259:
                case -503003710:
                    C0917.m55854();
                    C0949.m56012();
                    iM559710 = C0873.m55680("ۜۗ") ^ i12;
                    i5 = ((iM559710 ^ i11) * (-10587)) ^ (-860983417);
                    i6 = 1212988820;
                    i14 = iM559710 ^ i6;
                    i13 = i5;
                    break;
                case -800401576:
                case 850302304:
                    C1194.m56396();
                    if (!RunnableC1014.m56177()) {
                        str2 = strM56454;
                        int iM55684 = (i11 - C0873.m55680("ۜۛ")) * 127;
                        String str4 = str2;
                        i14 = iM55684 ^ 1623611717;
                        i13 = ((iM55684 ^ i12) * 14065) ^ 1448836514;
                        strM56454 = str4;
                    } else {
                        i20 = i20;
                        i21 = i21;
                        int iM559712 = C0946.m55979("ܰۛ") ^ i11;
                        int i27 = ((iM559712 ^ i12) * (-4957)) ^ 681698157;
                        i14 = iM559712 ^ (-859291218);
                        i20 = i20;
                        i21 = i21;
                        i13 = i27;
                        this = this;
                    }
                    break;
                case -741668091:
                case 300847349:
                    i17 = 48170;
                    iM55979 = C0873.m55680("ܳ᩺") ^ i12;
                    i = ((iM55979 ^ i11) * (-26259)) ^ 814498095;
                    i2 = 1808890909;
                    i14 = iM55979 ^ i2;
                    i20 = i20;
                    i13 = i;
                    i21 = i21;
                    i15 = i15;
                    break;
                case -663333156:
                case -614067533:
                    i15 = i15;
                    i20 = i20;
                    i21 = i21;
                    i19 = i18 + 148571721;
                    s2 = 24378;
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0946.m55979("᩺ܿ") ^ i12) * 5;
                        i = ((iM55979 ^ i11) * 18831) ^ (-1984871227);
                        i2 = 1848974083;
                    } else {
                        iM55979 = (i11 - C0873.m55680("ۘ᩸")) * 19;
                        i = ((iM55979 ^ i12) * 15785) ^ (-881248592);
                        i2 = -1216338505;
                    }
                    i14 = iM55979 ^ i2;
                    i20 = i20;
                    i13 = i;
                    i21 = i21;
                    i15 = i15;
                    break;
                case -363285979:
                case 899090717:
                    if (C0890.f81849 != 0) {
                        iM559710 = C0873.m55680("ۜۗ") ^ i12;
                        i5 = ((iM559710 ^ i11) * (-10587)) ^ (-860983417);
                        i6 = 1212988820;
                    } else {
                        iM559710 = (C0946.m55979("᩵ܽ") ^ i11) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM559710 ^ i12) * 23137) ^ (-572312144);
                        i6 = 822887571;
                    }
                    i14 = iM559710 ^ i6;
                    i13 = i5;
                    break;
                case -327310570:
                case 2114860508:
                    i15 = i15;
                    str2 = strM56454;
                    if (C16907.f50057 == null) {
                        iM55681 = (i12 - C0946.m55979("ۘ֡")) * 69;
                        i7 = ((iM55681 ^ i11) * (-17121)) ^ 1537162417;
                        i8 = 406354964;
                    } else {
                        iM55681 = (C0946.m55979("ܽۤ") ^ i11) * 91;
                        i7 = ((iM55681 ^ i12) * 23641) ^ 1695624844;
                        i8 = 1450388910;
                    }
                    int i28 = iM55681 ^ i8;
                    strM56454 = str2;
                    i14 = i28;
                    i13 = i7;
                    i15 = i15;
                    break;
                case -280901287:
                case 1562511332:
                    i15 = i15;
                    i20 = i20;
                    i21 = i21;
                    s = sArr2[c];
                    i18 = s * s;
                    if (C0866.f81837 >= 0) {
                        iM55979 = (i11 - C0946.m55979("֡᩻")) * (-109);
                        i = ((iM55979 ^ i12) * 13445) ^ 1942585290;
                        i2 = 2113235625;
                    } else {
                        iM55979 = C0873.m55680("֡ᩳ") ^ i11;
                        i = ((iM55979 ^ i12) * 2431) ^ (-1159802165);
                        i2 = -1180937341;
                    }
                    i14 = iM55979 ^ i2;
                    i20 = i20;
                    i13 = i;
                    i21 = i21;
                    i15 = i15;
                    break;
                case -203708352:
                case 1469105892:
                    i15 = i15;
                    i20 = i20;
                    i21 = i21;
                    if (i19 - (s * s2) < 0) {
                        iM55979 = C0873.m55680("ۛۗ") ^ i11;
                        i = ((iM55979 ^ i12) * (-6601)) ^ 481494009;
                        i2 = 2022233551;
                    } else {
                        iM55979 = (C0946.m55979("ۚܶ") + i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i11) * 23055) ^ 1111619814;
                        i2 = -1412399326;
                    }
                    i14 = iM55979 ^ i2;
                    i20 = i20;
                    i13 = i;
                    i21 = i21;
                    i15 = i15;
                    break;
                case -178510470:
                case 220593942:
                    i15 = i15;
                    i20 = i20;
                    i21 = i21;
                    sArr2 = f82134;
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("۟ۜ") ^ i11;
                        i = ((iM55979 ^ i12) * 15319) ^ (-1258334366);
                        i2 = -1412553403;
                    } else {
                        iM55979 = (C0873.m55680("᩵֨") ^ i11) * (-5);
                        i = ((iM55979 ^ i12) * (-30861)) ^ (-2141260690);
                        i2 = -1623785252;
                    }
                    i14 = iM55979 ^ i2;
                    i20 = i20;
                    i13 = i;
                    i21 = i21;
                    i15 = i15;
                    break;
                case -115510882:
                case 1955489924:
                    int i29 = i15;
                    int i30 = i20;
                    int iM56300 = C1046.m56300(strM38720, 58);
                    str3 = null;
                    if (iM56300 == -1) {
                        iM55682 = C0946.m55979("ۤۤ") ^ i11;
                        i9 = ((iM55682 ^ i12) * 20369) ^ (-1542965136);
                        i10 = -513404469;
                    } else {
                        iM55682 = C0873.m55680("ۗۜ") ^ i12;
                        i9 = ((iM55682 ^ i11) * 3551) ^ 1652673494;
                        i10 = 510382746;
                    }
                    i14 = iM55682 ^ i10;
                    i21 = iM56300;
                    i20 = i30;
                    i13 = i9;
                    i15 = i29;
                    this = this;
                    break;
                case -91937963:
                case 689922555:
                    if (C0906.m55806(strM56454, C1964.m56584(sArr, i15, i23, i17))) {
                        iM559710 = (C0873.m55680("ۡ֡") + i11) * 35;
                        i5 = ((iM559710 ^ i12) * 26693) ^ (-1589372911);
                        i6 = -2042638131;
                    } else {
                        iM559710 = (C0946.m55979("ۧۜ") ^ i11) * (-39);
                        i5 = ((iM559710 ^ i12) * 26519) ^ (-681350740);
                        i6 = -2135152464;
                    }
                    i14 = iM559710 ^ i6;
                    i13 = i5;
                    break;
                case -59921266:
                case 1356686468:
                    sArr = f82134;
                    i15 = 88;
                    i23 = 4;
                    if (C1024.m56209() >= 0) {
                        iM559710 = (C0946.m55979("᩵ܽ") ^ i11) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM559710 ^ i12) * 23137) ^ (-572312144);
                        i6 = 822887571;
                    } else {
                        iM559710 = (C0873.m55680("ۜ᩻") + i11) * 81;
                        i5 = ((iM559710 ^ i12) * (-31611)) ^ 662690533;
                        i6 = -762716809;
                    }
                    i14 = iM559710 ^ i6;
                    i13 = i5;
                    break;
                case 3925897:
                case 127821124:
                    if (C0930.m55885() <= 0) {
                        i15 = i15;
                        i20 = i20;
                        i21 = i21;
                        iM55979 = (C0946.m55979("᩺ܿ") ^ i12) * 5;
                        i = ((iM55979 ^ i11) * 18831) ^ (-1984871227);
                        i2 = 1848974083;
                        i14 = iM55979 ^ i2;
                        i20 = i20;
                        i13 = i;
                        i21 = i21;
                        i15 = i15;
                    }
                    i15 = i15;
                    i20 = i20;
                    i21 = i21;
                    iM55979 = C0946.m55979("۟ۜ") ^ i11;
                    i = ((iM55979 ^ i12) * 15319) ^ (-1258334366);
                    i2 = -1412553403;
                    i14 = iM55979 ^ i2;
                    i20 = i20;
                    i13 = i;
                    i21 = i21;
                    i15 = i15;
                    break;
                case 193072332:
                case 811443058:
                    return orDefault2;
                case 269166363:
                case 930771206:
                    if (C1017.f81942 < 0) {
                        str2 = strM56454;
                        int iM55685 = (i11 - C0873.m55680("ۜۛ")) * 127;
                        String str5 = str2;
                        i14 = iM55685 ^ 1623611717;
                        i13 = ((iM55685 ^ i12) * 14065) ^ 1448836514;
                        strM56454 = str5;
                    } else {
                        i15 = i15;
                        i20 = i20;
                        i21 = i21;
                        iM55979 = C0873.m55680("᩶ۤ") ^ i12;
                        i = ((iM55979 ^ i11) * 6147) ^ 1020158797;
                        i2 = -551843164;
                        i14 = iM55979 ^ i2;
                        i20 = i20;
                        i13 = i;
                        i21 = i21;
                        i15 = i15;
                    }
                    break;
                case 1014171574:
                case 2080581078:
                    short[] sArr3 = f82134;
                    str2 = strM56454;
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        i15 = i15;
                        i20 = i20;
                        i21 = i21;
                        strM56454 = str2;
                        iM55979 = C0873.m55680("᩶ۤ") ^ i12;
                        i = ((iM55979 ^ i11) * 6147) ^ 1020158797;
                        i2 = -551843164;
                        i14 = iM55979 ^ i2;
                        i20 = i20;
                        i13 = i;
                        i21 = i21;
                        i15 = i15;
                    } else if (!C0927.f81875) {
                        i15 = i15;
                        C16907.f50057 = new C21862(C1053.m56325(sArr3, 92, 7, i17));
                        iM55681 = (C0946.m55979("ܽۤ") ^ i11) * 91;
                        i7 = ((iM55681 ^ i12) * 23641) ^ 1695624844;
                        i8 = 1450388910;
                        int i210 = iM55681 ^ i8;
                        strM56454 = str2;
                        i14 = i210;
                        i13 = i7;
                        i15 = i15;
                    } else {
                        int iM55686 = (i11 - C0873.m55680("ۜۛ")) * 127;
                        String str6 = str2;
                        i14 = iM55686 ^ 1623611717;
                        i13 = ((iM55686 ^ i12) * 14065) ^ 1448836514;
                        strM56454 = str6;
                    }
                    break;
                case 1486749626:
                case 2131042965:
                    i15 = i15;
                    strM38720 = C17073.m38720(i16, i16, str);
                    i21 = i21;
                    iM55680 = (C0873.m55680("ۗۘ") ^ i12) * 31;
                    i13 = ((iM55680 ^ i11) * (-11685)) ^ (-1508197509);
                    i4 = -61636928;
                    i14 = iM55680 ^ i4;
                    i21 = i21;
                    i15 = i15;
                    break;
                default:
                    i15 = i15;
                    i20 = i20;
                    i21 = i21;
                    if (C0927.m55870(str, i20) != '{') {
                        i3 = i20;
                        strM38720 = str;
                        i20 = i3;
                        iM55680 = (C0873.m55680("ۗۘ") ^ i12) * 31;
                        i13 = ((iM55680 ^ i11) * (-11685)) ^ (-1508197509);
                        i4 = -61636928;
                        i14 = iM55680 ^ i4;
                        i21 = i21;
                        i15 = i15;
                    } else {
                        iM55979 = C0946.m55979("ۛܰ") ^ i12;
                        i = ((iM55979 ^ i11) * (-8061)) ^ (-1732354707);
                        i2 = 1780411130;
                        i14 = iM55979 ^ i2;
                        i20 = i20;
                        i13 = i;
                        i21 = i21;
                        i15 = i15;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x014f A[PHI: r1 r11 r12 r13 r14
      0x014f: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:43:0x014d, B:39:0x012c, B:29:0x00ce, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:43:0x014d, B:39:0x012c, B:29:0x00ce, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:43:0x014d, B:39:0x012c, B:29:0x00ce, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:43:0x014d, B:39:0x012c, B:29:0x00ce, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:43:0x014d, B:39:0x012c, B:29:0x00ce, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0249 A[PHI: r5 r15
      0x0249: PHI (r5v3 char) = (r5v2 char), (r5v2 char), (r5v4 char) binds: [B:25:0x00ac, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:25:0x00ac, B:9:0x0059, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x027e  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b0 A[PHI: r8 r9 r20
      0x02b0: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:72:0x02ae, B:58:0x01f9, B:54:0x01d7, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:72:0x02ae, B:58:0x01f9, B:54:0x01d7, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:72:0x02ae, B:58:0x01f9, B:54:0x01d7, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public static String m28713(String str) {
        int iM55680;
        int i;
        int i2;
        int i3 = C0906.f81862;
        int i4 = C0877.f81843;
        int iM55979 = C0946.m55979("ܽۖ") ^ i3;
        int i5 = ((iM55979 ^ i4) * (-16229)) ^ 851393605;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM55979 ^ (-1806526456);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -333029729;
        String strM56289 = null;
        String strM56584 = null;
        String strM55929 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 27675) >> 31));
            switch (i12) {
                case -2122586913:
                case -1752258232:
                    strM56289 = C1046.m56289(strM56584, str);
                    iM55680 = (C0873.m55680("ܰ֫") + i3) * (-71);
                    i = ((iM55680 ^ i4) * (-19459)) ^ 228940205;
                    i2 = -1828591533;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1900653727:
                case -620874504:
                    C0912.m55833();
                    if (C1404.f82149 < 0) {
                        iM55680 = (i3 - C0946.m55979("ۜܳ")) * 59;
                        i = ((iM55680 ^ i4) * (-22371)) ^ (-61503017);
                        i2 = 1184315813;
                    } else {
                        iM55680 = (C0873.m55680("ۢᩴ") + i4) * (-59);
                        i = ((iM55680 ^ i3) * 17043) ^ 796190583;
                        i2 = -184978267;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1817788034:
                case -99806179:
                    i8 = 44077;
                    iM55680 = C0946.m55979("֨ۛ") ^ i3;
                    i = ((iM55680 ^ i4) * 20761) ^ (-1792581362);
                    i2 = -1630754582;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1759257859:
                case 398869001:
                    sArr3 = f82134;
                    i10 = 43;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0946.m55979("᩹ۤ") ^ i4) * 39;
                        i = ((iM55680 ^ i3) * (-15693)) ^ (-171408445);
                        i2 = 2123135968;
                    } else {
                        iM55680 = (C0873.m55680("ܽ᩸") ^ i3) * (-95);
                        i = ((iM55680 ^ i4) * (-29487)) ^ 123682266;
                        i2 = -527736645;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1666563689:
                case 1936213823:
                    s3 = 11888;
                    if (C1124.f82007 >= 0) {
                        iM55680 = (i3 - C0946.m55979("֫ۢ")) * (-5);
                        i = ((iM55680 ^ i4) * 13737) ^ 592446035;
                        i2 = -61027247;
                    } else {
                        iM55680 = C0873.m55680("ܶۘ") ^ i3;
                        i = ((iM55680 ^ i4) * 22451) ^ (-1392780916);
                        i2 = -1164374137;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1637629513:
                case 1753534029:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (i3 - C0946.m55979("ۜܳ")) * 59;
                        i = ((iM55680 ^ i4) * (-22371)) ^ (-61503017);
                        i2 = 1184315813;
                    } else {
                        iM55680 = (C0946.m55979("᩹ۤ") ^ i4) * 39;
                        i = ((iM55680 ^ i3) * (-15693)) ^ (-171408445);
                        i2 = 2123135968;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1561641350:
                case -753572294:
                    C0947.m55997();
                    C1071.m56343();
                    iM55680 = (i3 - C0946.m55979("ۜܳ")) * 59;
                    i = ((iM55680 ^ i4) * (-22371)) ^ (-61503017);
                    i2 = 1184315813;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1445799750:
                case 1568373058:
                    i8 = 16650;
                    iM55680 = C0946.m55979("֨ۛ") ^ i3;
                    i = ((iM55680 ^ i4) * 20761) ^ (-1792581362);
                    i2 = -1630754582;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1281667173:
                case 460205837:
                    strM56584 = C1964.m56584(sArr2, i9, 7, i8);
                    if (C1229.m56404(strM55929, strM56584)) {
                        strM56289 = str;
                        iM55680 = (C0873.m55680("ܰ֫") + i3) * (-71);
                        i = ((iM55680 ^ i4) * (-19459)) ^ 228940205;
                        i2 = -1828591533;
                    } else {
                        iM55680 = (C0873.m55680("۟᩹") + i4) * (-83);
                        i = ((iM55680 ^ i3) * (-6497)) ^ 2142394644;
                        i2 = 1261387510;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1213318826:
                case 1232554959:
                    if (C1229.m56404(strM55929, C0992.m56102(sArr3, i10, i11, i8))) {
                        strM56289 = str;
                        iM55680 = (C0873.m55680("ܰ֫") + i3) * (-71);
                        i = ((iM55680 ^ i4) * (-19459)) ^ 228940205;
                        i2 = -1828591533;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM55681 = (C0873.m55680("᩶۫") ^ i3) * (-27);
                        i5 = ((iM55681 ^ i4) * (-27253)) ^ (-1325781074);
                        i6 = iM55681 ^ 146012425;
                    }
                    break;
                case -1076162113:
                case -24588891:
                    i9 = 36;
                    if (C0947.f81895) {
                        iM55680 = (C0946.m55979("᩹ۤ") ^ i4) * 39;
                        i = ((iM55680 ^ i3) * (-15693)) ^ (-171408445);
                        i2 = 2123135968;
                    } else {
                        iM55680 = C0946.m55979("ۛ֨") ^ i4;
                        i = ((iM55680 ^ i3) * (-7367)) ^ (-126001771);
                        i2 = -1792938179;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1017609863:
                case -948649650:
                    if (C0861.f81831) {
                        iM55680 = (i3 - C0946.m55979("֫ۢ")) * (-5);
                        i = ((iM55680 ^ i4) * 13737) ^ 592446035;
                        i2 = -61027247;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۜܳ")) * 59;
                        i = ((iM55680 ^ i4) * (-22371)) ^ (-61503017);
                        i2 = 1184315813;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -965672194:
                case 361848782:
                    if ((s * s3) - i7 > 0) {
                        iM55680 = (C0946.m55979("ܿ᩷") + i3) * 39;
                        i = ((iM55680 ^ i4) * 27869) ^ (-1058634517);
                        i2 = 1349981480;
                    } else {
                        iM55680 = (i4 - C0946.m55979("᩻ۨ")) * 19;
                        i = ((iM55680 ^ i3) * (-5265)) ^ (-928633075);
                        i2 = 645113674;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -598971171:
                case -10675479:
                    s = sArr[c];
                    s2 = 2972;
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("֡ۨ") ^ i4;
                        i = ((iM55680 ^ i3) * (-9889)) ^ (-791713386);
                        i2 = 16383003;
                    } else {
                        iM55680 = C0873.m55680("᩺᩺") ^ i3;
                        i = ((iM55680 ^ i4) * 8657) ^ 1041183619;
                        i2 = -1403209904;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -413666395:
                case 1339137079:
                    return strM56289;
                case -346025397:
                case 2006018796:
                    i11 = 8;
                    if (C0877.m55696()) {
                        iM55680 = (i4 - C0946.m55979("ۜۢ")) * (-103);
                        i = ((iM55680 ^ i3) * (-2735)) ^ 2049422285;
                        i2 = -135030032;
                    } else {
                        iM55680 = (C0873.m55680("ۢᩴ") + i4) * (-59);
                        i = ((iM55680 ^ i3) * 17043) ^ 796190583;
                        i2 = -184978267;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -309146566:
                case 548335923:
                    if (C0877.m55696()) {
                        iM55680 = C0946.m55979("᩶ۜ") ^ i3;
                        i = ((iM55680 ^ i4) * 31707) ^ 1578071095;
                        i2 = -765012571;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۜܳ")) * 59;
                        i = ((iM55680 ^ i4) * (-22371)) ^ (-61503017);
                        i2 = 1184315813;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 56053307:
                case 936875246:
                    int i13 = s + s2;
                    i7 = i13 * i13;
                    if (C0863.m55643()) {
                        iM55680 = (i4 - C0946.m55979("᩵ܿ")) * 79;
                        i = ((iM55680 ^ i3) * (-16707)) ^ 422294;
                        i2 = 1975777450;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֫ۢ")) * (-5);
                        i = ((iM55680 ^ i4) * 13737) ^ 592446035;
                        i2 = -61027247;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 274229497:
                case 1086468083:
                    C0992.m56107();
                    C0898.m55800();
                    return null;
                case 466540161:
                case 834971890:
                    strM55929 = RunnableC0938.m55929(str);
                    sArr2 = f82134;
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0946.m55979("᩹ۤ") ^ i4) * 39;
                        i = ((iM55680 ^ i3) * (-15693)) ^ (-171408445);
                        i2 = 2123135968;
                    } else {
                        iM55680 = C0946.m55979("᩷ۢ") ^ i4;
                        i = ((iM55680 ^ i3) * (-16807)) ^ (-1600541585);
                        i2 = 831992041;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 995805466:
                case 1518552906:
                    sArr = f82134;
                    if (C0882.f81846) {
                        iM55680 = (i3 - C0946.m55979("֫ۢ")) * (-5);
                        i = ((iM55680 ^ i4) * 13737) ^ 592446035;
                        i2 = -61027247;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩺ܽ")) * 97;
                        i = ((iM55680 ^ i3) * 12249) ^ 22661440;
                        i2 = 120450016;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = '#';
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0873.m55680("ۢᩴ") + i4) * (-59);
                        i = ((iM55680 ^ i3) * 17043) ^ 796190583;
                        i2 = -184978267;
                    } else {
                        iM55680 = (C0873.m55680("ᩴ᩶") + i4) * 97;
                        i = ((iM55680 ^ i3) * 17535) ^ (-63688232);
                        i2 = 308592342;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0252 A[PHI: r8 r9 r16 r17
      0x0252: PHI (r8v6 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v2 short[]), (r8v1 short[]) binds: [B:63:0x0250, B:59:0x022d, B:29:0x00c5, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r9v10 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:63:0x0250, B:59:0x022d, B:29:0x00c5, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r16v25 int) = (r16v14 int), (r16v15 int), (r16v20 int), (r16v26 int) binds: [B:63:0x0250, B:59:0x022d, B:29:0x00c5, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r17v30 int) = (r17v17 int), (r17v18 int), (r17v23 int), (r17v31 int) binds: [B:63:0x0250, B:59:0x022d, B:29:0x00c5, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0288 A[PHI: r0 r2 r16 r17
      0x0288: PHI (r0v6 short[]) = (r0v2 short[]), (r0v1 short[]), (r0v1 short[]) binds: [B:67:0x0286, B:50:0x01d2, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r2v3 short) = (r2v1 short), (r2v2 short), (r2v1 short) binds: [B:67:0x0286, B:50:0x01d2, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r16v23 int) = (r16v13 int), (r16v16 int), (r16v27 int) binds: [B:67:0x0286, B:50:0x01d2, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r17v27 int) = (r17v16 int), (r17v19 int), (r17v32 int) binds: [B:67:0x0286, B:50:0x01d2, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (p067l.C0946.f81894 == 0) goto L14;
     */
    @Override // bin.p000mt.plugin.api.PluginContext
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalString getLocalString() {
        int i;
        int i2;
        int iM55979;
        int i3;
        int iM559710;
        int i4;
        int i5;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1637140701;
        int i14 = C1044.f81959;
        int i15 = RunnableC0938.f81886;
        int iM55680 = C0873.m55680("۠ۙ") ^ i14;
        int i16 = ((iM55680 ^ i15) * 17253) ^ 254791520;
        int i17 = iM55680 ^ 816568944;
        while (true) {
            i13 = ((((i13 ^ i15) * 28931) >> 31) & i16) ^ i17;
            switch (i13) {
                case -2016466752:
                case 1756296278:
                    if (C1053.f81965 > 0) {
                        i = i6;
                        i2 = i7;
                        iM55979 = C0873.m55680("ۚۚ") ^ i14;
                        i16 = (-1295705832) ^ ((iM55979 ^ i15) * 6863);
                        i3 = 709786952;
                        i17 = iM55979 ^ i3;
                        i7 = i2;
                        i6 = i;
                    }
                    i = i6;
                    i2 = i7;
                    iM55979 = (C0946.m55979("ᩴۗ") + i14) * 27;
                    i16 = (-22864822) ^ ((iM55979 ^ i15) * (-19145));
                    i3 = -825447490;
                    i17 = iM55979 ^ i3;
                    i7 = i2;
                    i6 = i;
                    break;
                case -1882261083:
                case 1742291998:
                    i = i6;
                    i2 = i7;
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0946.m55979("ᩴۗ") + i14) * 27;
                        i16 = (-22864822) ^ ((iM55979 ^ i15) * (-19145));
                        i3 = -825447490;
                    } else {
                        iM55979 = (i14 - C0873.m55680("ܰۖ")) * (-67);
                        i16 = (-724836551) ^ ((iM55979 ^ i15) * 24681);
                        i3 = 47381057;
                    }
                    i17 = iM55979 ^ i3;
                    i7 = i2;
                    i6 = i;
                    break;
                case -1638673832:
                case -1625253296:
                    sArr2 = f82134;
                    if (C1017.f81942 >= 0) {
                        i = i6;
                        i2 = i7;
                        i11 = 62;
                        iM55979 = (C0946.m55979("ᩴۗ") + i14) * 27;
                        i16 = (-22864822) ^ ((iM55979 ^ i15) * (-19145));
                        i3 = -825447490;
                        i17 = iM55979 ^ i3;
                        i7 = i2;
                        i6 = i;
                    } else {
                        int iM559711 = C0946.m55979("ܿۖ") ^ i15;
                        i17 = iM559711 ^ 1883321647;
                        i16 = ((iM559711 ^ i14) * 5013) ^ 1922269834;
                        i11 = 62;
                    }
                    break;
                case -1575634992:
                case 1859989542:
                    break;
                case -1380253317:
                case -900422:
                    i = i6;
                    i2 = i7;
                    if (C0873.m55678()) {
                        iM55979 = (C0946.m55979("ᩴۗ") + i14) * 27;
                        i16 = (-22864822) ^ ((iM55979 ^ i15) * (-19145));
                        i3 = -825447490;
                    } else {
                        iM55979 = (C0873.m55680("۠ۧ") ^ i15) * 23;
                        i16 = (-1895462556) ^ ((iM55979 ^ i14) * 11333);
                        i3 = 2092698901;
                    }
                    i17 = iM55979 ^ i3;
                    i7 = i2;
                    i6 = i;
                    break;
                case -1354843129:
                case 261269208:
                    C0866.m55645();
                    if (!C0947.m55997()) {
                        i2 = i7;
                        iM559710 = C0946.m55979("ܶ۬") ^ i15;
                        i16 = ((iM559710 ^ i14) * 31985) ^ 1607691837;
                        i4 = -394794677;
                        i17 = iM559710 ^ i4;
                        i7 = i2;
                    } else {
                        int iM559712 = C0946.m55979("ۖ᩺") ^ i15;
                        i = i6;
                        i17 = iM559712 ^ (-1654023881);
                        i16 = ((iM559712 ^ i14) * 24345) ^ (-2062231931);
                        i6 = i;
                    }
                    break;
                case -1235101744:
                case -991400444:
                    i2 = i7;
                    i6 = s + 8597;
                    if (C0955.f81898) {
                        iM559710 = C0873.m55680("ۖ᩹") ^ i15;
                        i16 = ((iM559710 ^ i14) * 3913) ^ (-267905841);
                        i4 = 371988873;
                    } else {
                        iM559710 = (C0946.m55979("ܽ᩻") ^ i14) * 109;
                        i16 = ((iM559710 ^ i15) * (-7815)) ^ (-2034710544);
                        i4 = 1117310566;
                    }
                    i17 = iM559710 ^ i4;
                    i7 = i2;
                    break;
                case -1215745108:
                case 187598628:
                    i5 = 54154;
                    int iM559713 = C0946.m55979("ܳۧ") ^ i14;
                    int i18 = i5;
                    i17 = iM559713 ^ 393964956;
                    i16 = ((iM559713 ^ i15) * (-26819)) ^ (-1721229114);
                    i10 = i18;
                    break;
                case -1192226735:
                case -453119642:
                    i = i6;
                    i2 = i7;
                    sArr = f82134;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("ۚۚ") ^ i14;
                        i16 = (-1295705832) ^ ((iM55979 ^ i15) * 6863);
                        i3 = 709786952;
                    } else {
                        iM55979 = C0946.m55979("۫۫") ^ i14;
                        i16 = 1097280087 ^ ((iM55979 ^ i15) * 5107);
                        i3 = 635489731;
                    }
                    i17 = iM55979 ^ i3;
                    i7 = i2;
                    i6 = i;
                    break;
                case -724252204:
                case 1648636076:
                    return m28714(C0955.m56029(sArr2, i11, i12, i10));
                case -509473422:
                case 812942993:
                    if (RunnableC1014.f81941 <= 0) {
                        i2 = i7;
                        i12 = 6;
                        iM559710 = C0873.m55680("ۖ᩹") ^ i15;
                        i16 = ((iM559710 ^ i14) * 3913) ^ (-267905841);
                        i4 = 371988873;
                        i17 = iM559710 ^ i4;
                        i7 = i2;
                    } else {
                        int iM559714 = (C0946.m55979("᩵ۡ") ^ i14) * (-49);
                        i17 = iM559714 ^ (-2057568832);
                        i16 = ((iM559714 ^ i15) * (-1697)) ^ (-174447486);
                        i12 = 6;
                    }
                    break;
                case 23762979:
                case 830875052:
                    i = i6;
                    i2 = i7;
                    s = sArr[c];
                    if (C1003.m56123() != 0) {
                        iM55979 = C0873.m55680("ۚۚ") ^ i14;
                        i16 = (-1295705832) ^ ((iM55979 ^ i15) * 6863);
                        i3 = 709786952;
                    } else {
                        iM55979 = (i15 - C0946.m55979("ܳۚ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i16 = (-413239707) ^ ((iM55979 ^ i14) * (-20875));
                        i3 = 1991922449;
                    }
                    i17 = iM55979 ^ i3;
                    i7 = i2;
                    i6 = i;
                    break;
                case 67284050:
                case 1387566251:
                    i = i6;
                    i2 = i7;
                    c = C0184a.f880h;
                    if (C0912.f81867 > 0) {
                        iM55979 = (C0946.m55979("֡֫") ^ i15) * 59;
                        i16 = (-67972745) ^ ((iM55979 ^ i14) * (-2099));
                        i3 = -1643957981;
                        i17 = iM55979 ^ i3;
                        i7 = i2;
                        i6 = i;
                    } else {
                        i6 = i;
                        iM559710 = C0873.m55680("ۖ᩹") ^ i15;
                        i16 = ((iM559710 ^ i14) * 3913) ^ (-267905841);
                        i4 = 371988873;
                        i17 = iM559710 ^ i4;
                        i7 = i2;
                    }
                    break;
                case 210413689:
                case 1586275930:
                    C0992.m56107();
                    i2 = i7;
                    iM559710 = C0946.m55979("ܶ۬") ^ i15;
                    i16 = ((iM559710 ^ i14) * 31985) ^ 1607691837;
                    i4 = -394794677;
                    i17 = iM559710 ^ i4;
                    i7 = i2;
                    break;
                case 372891161:
                case 1322927979:
                    i5 = 22154;
                    int iM559715 = C0946.m55979("ܳۧ") ^ i14;
                    int i19 = i5;
                    i17 = iM559715 ^ 393964956;
                    i16 = ((iM559715 ^ i15) * (-26819)) ^ (-1721229114);
                    i10 = i19;
                    break;
                case 1304158184:
                case 2065225628:
                    i7 = i6 * i6;
                    i8 = s * s;
                    if (C0906.m55809() <= 0) {
                        int iM559716 = C0946.m55979("ۖ᩺") ^ i15;
                        i = i6;
                        i17 = iM559716 ^ (-1654023881);
                        i16 = ((iM559716 ^ i14) * 24345) ^ (-2062231931);
                    } else {
                        i = i6;
                        int iM559717 = (C0946.m55979("ۨۘ") ^ i14) * (-97);
                        i16 = ((iM559717 ^ i15) * 20399) ^ 129375588;
                        i17 = iM559717 ^ 676851392;
                    }
                    i6 = i;
                    break;
                case 1337567854:
                case 2039795735:
                    C0882.m55710();
                    return null;
                case 1393772306:
                case 2103487768:
                    i2 = i7;
                    i9 = 73908409;
                    if (C1024.f81946) {
                        iM559710 = C0946.m55979("ܶ۬") ^ i15;
                        i16 = ((iM559710 ^ i14) * 31985) ^ 1607691837;
                        i4 = -394794677;
                    } else {
                        iM559710 = C0873.m55680("֫۫") ^ i15;
                        i16 = ((iM559710 ^ i14) * (-12261)) ^ (-1119726877);
                        i4 = 247874941;
                    }
                    i17 = iM559710 ^ i4;
                    i7 = i2;
                    break;
                default:
                    int i20 = i8 + i9;
                    if (i7 - (i20 + i20) > 0) {
                        int iM55681 = (C0873.m55680("ۙܽ") ^ i15) * (-109);
                        i2 = i7;
                        i17 = iM55681 ^ 1440625222;
                        i16 = ((iM55681 ^ i14) * (-20021)) ^ (-499720914);
                    } else {
                        i2 = i7;
                        iM559710 = (C0873.m55680("۬ܰ") ^ i14) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i16 = ((iM559710 ^ i15) * 27237) ^ 323278324;
                        i4 = 167009853;
                        i17 = iM559710 ^ i4;
                    }
                    i7 = i2;
                    break;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final String getString(String str, Object... objArr) {
        int i = 1022982979;
        int i2 = C1046.f81962;
        int i3 = C1036.f81953;
        int iM55680 = (C0873.m55680("ܶ۠") + i3) * (-13);
        int i4 = ((iM55680 ^ i2) * 23655) ^ (-1710862932);
        int i5 = -358263863;
        while (true) {
            i = ((((i ^ i2) * 8167) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2081298518:
                case 1716770813:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0946.m55979("᩵ۧ") + i2) * (-79);
                        i4 = ((iM55680 ^ i3) * 22491) ^ 833040133;
                        i5 = -1539612812;
                    } else {
                        iM55680 = C0946.m55979("ᩴ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * 24207) ^ (-216415151);
                        i5 = 737536657;
                    }
                    break;
                case -2060281181:
                case -1555866311:
                    if (C1012.f81938 < 0) {
                        iM55680 = C0873.m55680("᩻۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-2595)) ^ 1100574598;
                        i5 = -872335623;
                    } else {
                        iM55680 = (C0946.m55979("᩵ۧ") + i2) * (-79);
                        i4 = ((iM55680 ^ i3) * 22491) ^ 833040133;
                        i5 = -1539612812;
                    }
                    break;
                case -1829677923:
                case -1299414772:
                    C1404.m56468();
                    return null;
                case -1672390410:
                case 967606296:
                    C0894.m55769();
                    if (!C0882.f81846) {
                        iM55680 = (C0946.m55979("᩸۫") + i3) * (-37);
                        i4 = ((iM55680 ^ i2) * 22205) ^ 973680678;
                        i5 = -228839179;
                    } else {
                        iM55680 = C0873.m55680("᩻۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-2595)) ^ 1100574598;
                        i5 = -872335623;
                    }
                    break;
                case -1516958484:
                case 1254548080:
                    if (RunnableC1014.m56177()) {
                        iM55680 = C0946.m55979("ܺ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3123) ^ 13912791;
                        i5 = 526728717;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩹") + i2) * 75;
                        i4 = ((iM55680 ^ i3) * 24111) ^ (-1229515876);
                        i5 = -850715658;
                    }
                    break;
                case -1395782076:
                case 131693070:
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("᩵ۧ") + i2) * (-79);
                        i4 = ((iM55680 ^ i3) * 22491) ^ 833040133;
                        i5 = -1539612812;
                    } else {
                        iM55680 = (C0946.m55979("ܰۚ") ^ i3) * (-103);
                        i4 = ((iM55680 ^ i2) * 21793) ^ 1639668252;
                        i5 = -1077333301;
                    }
                    break;
                case -890599448:
                case 973222639:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("᩻۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-2595)) ^ 1100574598;
                        i5 = -872335623;
                    } else {
                        iM55680 = C0946.m55979("ܳۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 11483) ^ 510783918;
                        i5 = 815442771;
                    }
                    break;
                case -854228474:
                case -262689145:
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("᩻۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-2595)) ^ 1100574598;
                        i5 = -872335623;
                    } else {
                        iM55680 = (C0873.m55680("ᩴۖ") + i3) * (-111);
                        i4 = ((iM55680 ^ i2) * (-6057)) ^ (-30785182);
                        i5 = -708864533;
                    }
                    break;
                case 63975243:
                case 1229296058:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0946.m55979("᩵ۧ") + i2) * (-79);
                        i4 = ((iM55680 ^ i3) * 22491) ^ 833040133;
                        i5 = -1539612812;
                    } else {
                        iM55680 = C0873.m55680("ۡܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1161) ^ 14267193;
                        i5 = 738819457;
                    }
                    break;
                case 545233520:
                case 719399720:
                    C0873.m55678();
                    C1053.m56327();
                    iM55680 = (C0946.m55979("᩵ۧ") + i2) * (-79);
                    i4 = ((iM55680 ^ i3) * 22491) ^ 833040133;
                    i5 = -1539612812;
                    break;
                case 933519628:
                case 1889753006:
                    if (C0947.m55997()) {
                        iM55680 = (C0946.m55979("᩸۫") + i3) * (-37);
                        i4 = ((iM55680 ^ i2) * 22205) ^ 973680678;
                        i5 = -228839179;
                    } else {
                        iM55680 = C0946.m55979("ᩳۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3735)) ^ (-1127619039);
                        i5 = 55635195;
                    }
                    break;
                case 997555447:
                case 1436175507:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0946.m55979("ᩳ᩹") + i2) * 75;
                        i4 = ((iM55680 ^ i3) * 24111) ^ (-1229515876);
                        i5 = -850715658;
                    } else {
                        iM55680 = (C0873.m55680("ۘᩴ") + i2) * (-61);
                        i4 = ((iM55680 ^ i3) * (-1153)) ^ 1057160777;
                        i5 = 769844158;
                    }
                    break;
                case 1236025947:
                case 1574115285:
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0946.m55979("ᩳ᩹") + i2) * 75;
                        i4 = ((iM55680 ^ i3) * 24111) ^ (-1229515876);
                        i5 = -850715658;
                    } else {
                        iM55680 = (i2 - C0873.m55680("۬ۖ")) * (-79);
                        i4 = ((iM55680 ^ i3) * (-7741)) ^ (-1382340519);
                        i5 = 1004385638;
                    }
                    break;
                case 1391450029:
                case 1982089416:
                    RunnableC0938.m55938();
                    if (C0898.m55800() <= 0) {
                        iM55680 = (C0946.m55979("ᩳ᩹") + i2) * 75;
                        i4 = ((iM55680 ^ i3) * 24111) ^ (-1229515876);
                        i5 = -850715658;
                    } else {
                        iM55680 = (C0946.m55979("᩵ۧ") + i2) * (-79);
                        i4 = ((iM55680 ^ i3) * 22491) ^ 833040133;
                        i5 = -1539612812;
                    }
                    break;
                case 1558954522:
                case 2086643895:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("ܶ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14711) ^ (-199534225);
                        i5 = 1868954826;
                    } else {
                        iM55680 = C0873.m55680("ܺ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11867)) ^ (-1268015786);
                        i5 = -755098365;
                    }
                    break;
                default:
                    return m28710(getString(str), objArr);
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final List getStringList(String... strArr) {
        getStringArray(strArr);
        return Arrays.asList(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x037a A[PHI: r6 r16 r18
      0x037a: PHI (r6v4 char) = (r6v2 char), (r6v3 char), (r6v2 char) binds: [B:101:0x0378, B:87:0x02fd, B:35:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x037a: PHI (r16v28 int) = (r16v4 int), (r16v5 int), (r16v30 int) binds: [B:101:0x0378, B:87:0x02fd, B:35:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x037a: PHI (r18v27 short[]) = (r18v2 short[]), (r18v3 short[]), (r18v30 short[]) binds: [B:101:0x0378, B:87:0x02fd, B:35:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x03c8 A[PHI: r16 r18
      0x03c8: PHI (r16v40 int) = (r16v2 int), (r16v3 int), (r16v37 int), (r16v44 int) binds: [B:109:0x03c6, B:105:0x03aa, B:13:0x007c, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x03c8: PHI (r18v39 short[]) = (r18v0 short[]), (r18v1 short[]), (r18v37 short[]), (r18v41 short[]) binds: [B:109:0x03c6, B:105:0x03aa, B:13:0x007c, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8 A[PHI: r16
      0x00b8: PHI (r16v25 int) = (r16v24 int), (r16v26 int) binds: [B:29:0x00b5, B:26:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0348 A[PHI: r5 r16
      0x0348: PHI (r5v75 short[]) = (r5v61 short[]), (r5v2 short[]), (r5v65 short[]), (r5v2 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:91:0x031b, B:26:0x00ae, B:97:0x0346, B:129:0x0348, B:128:0x0348, B:127:0x0348] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r16v36 int) = (r16v22 int), (r16v26 int), (r16v27 int), (r16v33 int), (r16v35 int), (r16v37 int) binds: [B:91:0x031b, B:26:0x00ae, B:97:0x0346, B:129:0x0348, B:128:0x0348, B:127:0x0348] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m28712(C12474 c12474, Class cls) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5 = RunnableC1014.f81941;
        int i6 = C1071.f81975;
        int iM559710 = (C0946.m55979("۫᩷") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i7 = ((iM559710 ^ i5) * (-2991)) ^ (-1195514386);
        short[] sArr = null;
        int i8 = iM559710 ^ (-613758476);
        Intent intent = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 2086442144;
        Throwable th = null;
        Application applicationM55620 = null;
        while (true) {
            int i14 = i8 ^ (i7 & (((i13 ^ i5) * 12057) >> 31));
            switch (i14) {
                case -2021867023:
                case -428921074:
                    C0866.m55645();
                    if (C1012.m56134() <= 0) {
                        iM55680 = C0873.m55680("۠ܶ") ^ i5;
                        i14 = i14;
                        i3 = ((iM55680 ^ i6) * (-24509)) ^ 420949693;
                        i4 = 1580936642;
                        int i15 = i14;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        i13 = i15;
                    } else {
                        sArr = sArr;
                        i14 = i14;
                        iM55979 = (i5 - C0946.m55979("ۢۘ")) * (-15);
                        i = ((iM55979 ^ i6) * 355) ^ 340984845;
                        i2 = 935423251;
                        int i16 = iM55979 ^ i2;
                        i13 = i14;
                        i8 = i16;
                        i7 = i;
                        sArr = sArr;
                    }
                    break;
                case -1950773138:
                case 830044481:
                    break;
                case -1904080373:
                case 1616880201:
                    i14 = i14;
                    sArr = f82134;
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("ۤᩴ") ^ i6;
                        i3 = ((iM55680 ^ i5) * 30615) ^ (-586659974);
                        i4 = 532887119;
                    } else {
                        iM55680 = (C0873.m55680("ۙۢ") ^ i5) * (-11);
                        i3 = ((iM55680 ^ i6) * (-5123)) ^ 1663017560;
                        i4 = -1327542254;
                    }
                    int i17 = i14;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i13 = i17;
                    break;
                case -1829217590:
                case -1084960171:
                    sArr = sArr;
                    i14 = i14;
                    s = sArr[c];
                    i9 = s * s;
                    if (C0873.f81841 <= 0) {
                        iM55979 = (i6 - C0873.m55680("᩶ܽ")) * (-61);
                        i = ((iM55979 ^ i5) * (-30797)) ^ (-399555384);
                        i2 = -592144692;
                    } else {
                        iM55979 = (i5 - C0946.m55979("۫᩹")) * 67;
                        i = ((iM55979 ^ i6) * 259) ^ (-1959304538);
                        i2 = 1804761816;
                    }
                    int i18 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i18;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1686976293:
                case 628673581:
                    i14 = i14;
                    C0873.m55678();
                    C1028.m56247();
                    iM55680 = (C0946.m55979("۟֡") + i6) * (-85);
                    i3 = ((iM55680 ^ i5) * 27243) ^ (-578242646);
                    i4 = 266905888;
                    int i19 = i14;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i13 = i19;
                    break;
                case -1624281511:
                case -78563107:
                    sArr = sArr;
                    i14 = i14;
                    s2 = 5279;
                    if (C0877.m55696()) {
                        iM55979 = C0946.m55979("ۤ᩻") ^ i6;
                        i = ((iM55979 ^ i5) * 11631) ^ 209794350;
                        i2 = 681687353;
                    } else {
                        iM55979 = C0946.m55979("᩷۠") ^ i6;
                        i = ((iM55979 ^ i5) * (-23323)) ^ 265136425;
                        i2 = 1675527196;
                    }
                    int i110 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i110;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1591524798:
                case -963459141:
                    sArr = sArr;
                    i14 = i14;
                    C0927.m55875(intent, 268435456);
                    C1964.m56599(applicationM55620, intent);
                    iM55979 = C0946.m55979("ۧ۠") ^ i5;
                    i = ((iM55979 ^ i6) * (-26713)) ^ 1122845507;
                    i2 = 1351837749;
                    int i111 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i111;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1503473207:
                case -1212392192:
                    sArr = sArr;
                    i14 = i14;
                    int i20 = i9 + i10;
                    i11 = i20 + i20;
                    if (C0992.m56107() <= 0) {
                        iM55979 = (C0946.m55979("᩺ۘ") + i5) * 61;
                        i = ((iM55979 ^ i6) * (-23357)) ^ (-1146612156);
                        i2 = 989336140;
                    } else {
                        iM55979 = (i5 - C0946.m55979("۫ܳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55979 ^ i6) * (-28151)) ^ 1628379161;
                        i2 = -1485988756;
                    }
                    int i112 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i112;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1428288376:
                case 619932597:
                    sArr = sArr;
                    i14 = i14;
                    if (C0930.f81879 <= 0) {
                        iM55979 = (i5 - C0946.m55979("ۢۘ")) * (-15);
                        i = ((iM55979 ^ i6) * 355) ^ 340984845;
                        i2 = 935423251;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩵") ^ i6;
                        i = ((iM55979 ^ i5) * (-23163)) ^ 1587168533;
                        i2 = 1569233119;
                    }
                    int i113 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i113;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -1419386054:
                case -462978910:
                    sArr = sArr;
                    i14 = i14;
                    if (!C0927.f81875) {
                        iM55979 = (C0946.m55979("ۧۧ") + i5) * (-3);
                        i = ((iM55979 ^ i6) * (-1647)) ^ (-1232056853);
                        i2 = 1421806162;
                        int i114 = iM55979 ^ i2;
                        i13 = i14;
                        i8 = i114;
                        i7 = i;
                        sArr = sArr;
                    } else {
                        sArr = sArr;
                        iM55680 = C0873.m55680("ۤᩴ") ^ i6;
                        i3 = ((iM55680 ^ i5) * 30615) ^ (-586659974);
                        i4 = 532887119;
                        int i115 = i14;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        i13 = i115;
                    }
                    break;
                case -1108687953:
                case -290675884:
                    i14 = i14;
                    C0845.m55584();
                    if (C1046.f81962 <= 0) {
                        sArr = sArr;
                        iM55979 = (C0946.m55979("᩷۬") + i5) * 109;
                        i = ((iM55979 ^ i6) * 29489) ^ (-1270167284);
                        i2 = -1759438345;
                        int i116 = iM55979 ^ i2;
                        i13 = i14;
                        i8 = i116;
                        i7 = i;
                        sArr = sArr;
                    } else {
                        iM55680 = (C0946.m55979("۟֡") + i6) * (-85);
                        i3 = ((iM55680 ^ i5) * 27243) ^ (-578242646);
                        i4 = 266905888;
                        int i117 = i14;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        i13 = i117;
                    }
                    break;
                case -964946338:
                case 964171935:
                    i14 = i14;
                    if (C0946.f81894 == 0) {
                        iM55680 = (C0946.m55979("۟֡") + i6) * (-85);
                        i3 = ((iM55680 ^ i5) * 27243) ^ (-578242646);
                        i4 = 266905888;
                    } else {
                        iM55680 = (i5 - C0946.m55979("ۜᩳ")) * 55;
                        i3 = ((iM55680 ^ i6) * (-29583)) ^ (-56683871);
                        i4 = -409833106;
                    }
                    int i118 = i14;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i13 = i118;
                    break;
                case -878264539:
                case 1650021172:
                    sArr = sArr;
                    i14 = i14;
                    i10 = 27867841;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("ܽۘ") ^ i6;
                        i = ((iM55979 ^ i5) * (-13009)) ^ (-1521658059);
                        i2 = -1059842315;
                    } else {
                        iM55979 = C0946.m55979("᩶ۜ") ^ i6;
                        i = ((iM55979 ^ i5) * (-21375)) ^ (-353157886);
                        i2 = -1861961498;
                    }
                    int i119 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i119;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -848101289:
                case 2066983174:
                    sArr = sArr;
                    i14 = i14;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("᩷۬") + i5) * 109;
                        i = ((iM55979 ^ i6) * 29489) ^ (-1270167284);
                        i2 = -1759438345;
                    } else {
                        iM55979 = (C0946.m55979("ᩳ֨") + i6) * 3;
                        i = ((iM55979 ^ i5) * (-5239)) ^ 1298464122;
                        i2 = -547836987;
                    }
                    int i1110 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i1110;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -762819090:
                case 1795528261:
                    sArr = sArr;
                    i14 = i14;
                    applicationM55620 = C0861.m55620();
                    try {
                        intent = new Intent(applicationM55620, (Class<?>) C8450.f22671);
                        C0917.m55843(intent, C0917.m55852(f82134, 11, 8, i12), c12474.f34933);
                        iM55979 = (C0873.m55680("ۨۢ") + i5) * (-61);
                        i = ((iM55979 ^ i6) * (-14283)) ^ 2045292881;
                        i2 = -270093681;
                    } catch (Throwable th2) {
                        th = th2;
                        intent = null;
                        iM55979 = (C0946.m55979("֡ۘ") ^ i5) * 37;
                        i = ((iM55979 ^ i6) * (-26597)) ^ 435181973;
                        i2 = 859513316;
                    }
                    int i1111 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i1111;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -629862667:
                case 1070677049:
                    i14 = i14;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        sArr = sArr;
                        iM55979 = (i5 - C0946.m55979("ۢۘ")) * (-15);
                        i = ((iM55979 ^ i6) * 355) ^ 340984845;
                        i2 = 935423251;
                        int i1112 = iM55979 ^ i2;
                        i13 = i14;
                        i8 = i1112;
                        i7 = i;
                        sArr = sArr;
                    } else {
                        iM55680 = C0873.m55680("ۤᩴ") ^ i6;
                        i3 = ((iM55680 ^ i5) * 30615) ^ (-586659974);
                        i4 = 532887119;
                        int i1113 = i14;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        i13 = i1113;
                    }
                    break;
                case -530146998:
                case 1866474643:
                    i14 = i14;
                    if (C1012.f81938 >= 0) {
                        sArr = sArr;
                        iM55979 = (i6 - C0873.m55680("᩶ܽ")) * (-61);
                        i = ((iM55979 ^ i5) * (-30797)) ^ (-399555384);
                        i2 = -592144692;
                        int i1114 = iM55979 ^ i2;
                        i13 = i14;
                        i8 = i1114;
                        i7 = i;
                        sArr = sArr;
                    } else {
                        iM55680 = C0873.m55680("ۤᩴ") ^ i6;
                        i3 = ((iM55680 ^ i5) * 30615) ^ (-586659974);
                        i4 = 532887119;
                        int i1115 = i14;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        i13 = i1115;
                    }
                    break;
                case -354292398:
                case 931576692:
                    i14 = i14;
                    try {
                        sArr = sArr;
                        try {
                            C0917.m55843(intent, ServiceConnectionC1013.m56161(f82134, 19, 16, i12), cls.getName());
                            iM55979 = (C0873.m55680("ۜܶ") ^ i6) * (-3);
                            i = ((iM55979 ^ i5) * (-8597)) ^ 1790371852;
                            i2 = 1297889033;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            iM55979 = (C0946.m55979("֡ۘ") ^ i5) * 37;
                            i = ((iM55979 ^ i6) * (-26597)) ^ 435181973;
                            i2 = 859513316;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        sArr = sArr;
                    }
                    int i1116 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i1116;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -343931632:
                case -204661529:
                    sArr = sArr;
                    i14 = i14;
                    if (C0946.f81894 != 0) {
                        iM55979 = (i5 - C0946.m55979("ۢۘ")) * (-15);
                        i = ((iM55979 ^ i6) * 355) ^ 340984845;
                        i2 = 935423251;
                    } else {
                        iM55979 = (C0946.m55979("ۖ۟") + i5) * (-97);
                        i = ((iM55979 ^ i6) * 19139) ^ 1769179939;
                        i2 = 1332422594;
                    }
                    int i1117 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i1117;
                    i7 = i;
                    sArr = sArr;
                    break;
                case -43863435:
                case 750705494:
                    C0845.m55584();
                    break;
                case 66674461:
                case 448105895:
                    i14 = i14;
                    if (C1028.m56247() >= 0) {
                        iM55680 = (i5 - C0946.m55979("ۜᩳ")) * 55;
                        i3 = ((iM55680 ^ i6) * (-29583)) ^ (-56683871);
                        i4 = -409833106;
                    } else {
                        iM55680 = C0873.m55680("ۤᩴ") ^ i6;
                        i3 = ((iM55680 ^ i5) * 30615) ^ (-586659974);
                        i4 = 532887119;
                    }
                    int i1118 = i14;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    i13 = i1118;
                    break;
                case 184899973:
                case 366501318:
                    c12474.log(th);
                    C1025.m56228(C0863.m55639(th));
                    break;
                case 213594248:
                case 1164337557:
                    i14 = i14;
                    C0898.m55800();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        sArr = sArr;
                        iM55979 = (C0946.m55979("᩺ۘ") + i5) * 61;
                        i = ((iM55979 ^ i6) * (-23357)) ^ (-1146612156);
                        i2 = 989336140;
                        int i1119 = iM55979 ^ i2;
                        i13 = i14;
                        i8 = i1119;
                        i7 = i;
                        sArr = sArr;
                    } else {
                        iM55680 = C0873.m55680("ۤᩴ") ^ i6;
                        i3 = ((iM55680 ^ i5) * 30615) ^ (-586659974);
                        i4 = 532887119;
                        int i11110 = i14;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        i13 = i11110;
                    }
                    break;
                case 236623854:
                case 1407562022:
                    sArr = sArr;
                    i14 = i14;
                    int i21 = s + s2;
                    if ((i21 * i21) - i11 > 0) {
                        iM55979 = C0946.m55979("ܰ᩺") ^ i5;
                        i = ((iM55979 ^ i6) * 24719) ^ 800026688;
                        i2 = 651473820;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ۤܰ")) * 39;
                        i = ((iM55979 ^ i5) * (-14403)) ^ 1660908787;
                        i2 = -1909552456;
                    }
                    int i11111 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i11111;
                    i7 = i;
                    sArr = sArr;
                    break;
                case 1038167276:
                case 1955313428:
                    i14 = i14;
                    C0890.m55740();
                    if (RunnableC0938.f81886 >= 0) {
                        sArr = sArr;
                        iM55979 = C0946.m55979("᩷۠") ^ i6;
                        i = ((iM55979 ^ i5) * (-23323)) ^ 265136425;
                        i2 = 1675527196;
                        int i11112 = iM55979 ^ i2;
                        i13 = i14;
                        i8 = i11112;
                        i7 = i;
                        sArr = sArr;
                    }
                    sArr = sArr;
                    iM55979 = (i6 - C0873.m55680("᩶ܽ")) * (-61);
                    i = ((iM55979 ^ i5) * (-30797)) ^ (-399555384);
                    i2 = -592144692;
                    int i11113 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i11113;
                    i7 = i;
                    sArr = sArr;
                    break;
                case 1161749690:
                case 1987286866:
                    sArr = sArr;
                    i14 = i14;
                    if (cls != null) {
                        iM55979 = C0873.m55680("ۨۖ") ^ i6;
                        i = ((iM55979 ^ i5) * 2089) ^ 670107101;
                        i2 = 289257818;
                    } else {
                        iM55979 = (C0873.m55680("ۜܶ") ^ i6) * (-3);
                        i = ((iM55979 ^ i5) * (-8597)) ^ 1790371852;
                        i2 = 1297889033;
                    }
                    int i11114 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i11114;
                    i7 = i;
                    sArr = sArr;
                    break;
                case 1437094234:
                case 1750320788:
                    i12 = 6894;
                    iM55979 = C0946.m55979("ᩴ֡") ^ i6;
                    i = ((iM55979 ^ i5) * 41) ^ (-710605973);
                    i2 = 1304260904;
                    int i11115 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i11115;
                    i7 = i;
                    sArr = sArr;
                    break;
                case 2049857606:
                case 2070550106:
                    sArr = sArr;
                    i14 = i14;
                    c = '\n';
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0946.m55979("᩷۬") + i5) * 109;
                        i = ((iM55979 ^ i6) * 29489) ^ (-1270167284);
                        i2 = -1759438345;
                    } else {
                        iM55979 = C0873.m55680("ۜۢ") ^ i6;
                        i = ((iM55979 ^ i5) * 1549) ^ (-1536148112);
                        i2 = -1712335085;
                    }
                    int i11116 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i11116;
                    i7 = i;
                    sArr = sArr;
                    break;
                default:
                    i12 = 11045;
                    iM55979 = C0946.m55979("ᩴ֡") ^ i6;
                    i = ((iM55979 ^ i5) * 41) ^ (-710605973);
                    i2 = 1304260904;
                    int i11117 = iM55979 ^ i2;
                    i13 = i14;
                    i8 = i11117;
                    i7 = i;
                    sArr = sArr;
                    break;
            }
            return;
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final String[] getStringArray(String... strArr) {
        int i = 0;
        String string = null;
        int i2 = -1752797703;
        int i3 = C0906.f81862;
        int i4 = RunnableC1014.f81941;
        int iM55680 = (C0873.m55680("ۡܽ") ^ i4) * (-73);
        int i5 = ((iM55680 ^ i3) * (-23451)) ^ 1184348460;
        int i6 = 1737919262;
        while (true) {
            i2 = ((((i2 ^ i3) * 20067) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2015161333:
                case -844737807:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0873.m55680("᩶۬") ^ i4) * 127;
                        i5 = ((iM55680 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    } else {
                        iM55680 = C0946.m55979("ۘ᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-23187)) ^ 1509916678;
                        i6 = 1023127962;
                    }
                    break;
                case -1994692741:
                case -1863646255:
                    RunnableC0897.m55784();
                    C0930.m55885();
                    iM55680 = C0946.m55979("۬ۗ") ^ i3;
                    i5 = ((iM55680 ^ i4) * 13645) ^ 318494317;
                    i6 = -1273145012;
                    break;
                case -1977813315:
                case 1310127483:
                    C0912.m55833();
                    if (AbstractC0942.m55971()) {
                        iM55680 = C0946.m55979("֨ᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 15343) ^ 1588235851;
                        i6 = 932573308;
                    } else {
                        iM55680 = (C0873.m55680("᩶۬") ^ i4) * 127;
                        i5 = ((iM55680 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    }
                    break;
                case -1872360390:
                case 1610363977:
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0873.m55680("᩶۬") ^ i4) * 127;
                        i5 = ((iM55680 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۨ᩺")) * (-59);
                        i5 = ((iM55680 ^ i4) * (-29267)) ^ (-1461745535);
                        i6 = 1650866702;
                    }
                    break;
                case -1812731630:
                case 1098461397:
                    if (C0947.f81895) {
                        iM55680 = C0946.m55979("۬ۗ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 13645) ^ 318494317;
                        i6 = -1273145012;
                    } else {
                        iM55680 = (C0873.m55680("᩺ۗ") ^ i4) * 45;
                        i5 = ((iM55680 ^ i3) * 187) ^ 1140402929;
                        i6 = -1761755974;
                    }
                    break;
                case -1734504548:
                case -1567935180:
                    C1036.m56257();
                    if (C0949.f81897 < 0) {
                        iM55680 = (C0873.m55680("᩶۬") ^ i4) * 127;
                        i5 = ((iM55680 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    } else {
                        iM55680 = C0946.m55979("۬ۗ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 13645) ^ 318494317;
                        i6 = -1273145012;
                    }
                    break;
                case -1667344671:
                case 1074041364:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (C0873.m55680("᩶۬") ^ i4) * 127;
                        i5 = ((iM55680 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    } else {
                        iM55680 = C0946.m55979("ܺᩳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-21599)) ^ 684731948;
                        i6 = -242467858;
                    }
                    break;
                case -1596065078:
                case 63128130:
                    i = 0;
                    iM55680 = (C0946.m55979("᩵֨") ^ i4) * (-69);
                    i5 = ((iM55680 ^ i3) * (-19205)) ^ 1647120876;
                    i6 = 1992619722;
                    break;
                case -985326342:
                case -295832556:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("۬ۗ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 13645) ^ 318494317;
                        i6 = -1273145012;
                    } else {
                        iM55680 = (C0946.m55979("۟ᩴ") + i3) * 69;
                        i5 = ((iM55680 ^ i4) * (-23107)) ^ 552241379;
                        i6 = -1434800085;
                    }
                    break;
                case -883732557:
                case 1544353250:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("᩷᩹") ^ i4;
                        i5 = ((iM55680 ^ i3) * 23661) ^ (-1055283118);
                        i6 = -336235022;
                    } else {
                        iM55680 = C0946.m55979("᩸ܿ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 2999) ^ (-1142992487);
                        i6 = -1884028290;
                    }
                    break;
                case -683366487:
                case 1943429241:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0873.m55680("ܺۢ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-29249)) ^ (-228843867);
                        i6 = -738826260;
                    } else {
                        iM55680 = C0946.m55979("ۙۚ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-22751)) ^ 1120028831;
                        i6 = -276311965;
                    }
                    break;
                case -485403791:
                case 1083161961:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = (C0873.m55680("᩶۬") ^ i4) * 127;
                        i5 = ((iM55680 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    } else {
                        iM55680 = (C0873.m55680("ۖ۬") ^ i4) * (-101);
                        i5 = ((iM55680 ^ i3) * 20365) ^ (-295028257);
                        i6 = 513814125;
                    }
                    break;
                case -315233088:
                case 1588135287:
                    if (i < strArr.length) {
                        iM55680 = C0873.m55680("۠ܳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 7961) ^ (-1922773537);
                        i6 = -1044727651;
                    } else {
                        iM55680 = C0946.m55979("ܳۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-1415)) ^ 2133859667;
                        i6 = 1506601578;
                    }
                    break;
                case -257957292:
                case -154879409:
                    return strArr;
                case -208861114:
                case 981062844:
                    i++;
                    iM55680 = (C0946.m55979("᩵֨") ^ i4) * (-69);
                    i5 = ((iM55680 ^ i3) * (-19205)) ^ 1647120876;
                    i6 = 1992619722;
                    break;
                case 16327320:
                case 2097035055:
                    if (C1048.m56305() < 0) {
                        iM55680 = C0873.m55680("᩷᩹") ^ i4;
                        i5 = ((iM55680 ^ i3) * 23661) ^ (-1055283118);
                        i6 = -336235022;
                    } else {
                        iM55680 = C0946.m55979("۬ۗ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 13645) ^ 318494317;
                        i6 = -1273145012;
                    }
                    break;
                case 353194431:
                case 1753901325:
                    strArr[i] = string;
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("ܺۢ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-29249)) ^ (-228843867);
                        i6 = -738826260;
                    } else {
                        iM55680 = C0946.m55979("᩻ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-6521)) ^ (-239701295);
                        i6 = -1838875056;
                    }
                    break;
                case 454373900:
                case 794141224:
                    C1044.m56286();
                    C0863.m55643();
                    return null;
                default:
                    string = getString(strArr[i]);
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("۬ۗ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 13645) ^ 318494317;
                        i6 = -1273145012;
                    } else {
                        iM55680 = (C0946.m55979("᩺᩺") + i4) * (-13);
                        i5 = ((iM55680 ^ i3) * 16183) ^ (-689380618);
                        i6 = 333829704;
                    }
                    break;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final void openPreference(Class cls) {
        int i = 1740011989;
        int i2 = C1071.f81975;
        int i3 = C0906.f81862;
        int iM55979 = C0946.m55979("ۜۘ") ^ i2;
        int i4 = ((iM55979 ^ i3) * 7689) ^ 1880551829;
        int i5 = -1686561742;
        while (true) {
            i = ((((i ^ i3) * 3687) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2053264539:
                case 1293525623:
                    if (C0949.m56012()) {
                        iM55979 = (C0946.m55979("᩵۟") + i2) * (-57);
                        i4 = ((iM55979 ^ i3) * 10187) ^ (-1155881866);
                        i5 = -139060621;
                    } else {
                        iM55979 = (C0873.m55680("۫ۡ") ^ i3) * 45;
                        i4 = ((iM55979 ^ i2) * 3451) ^ 43143362;
                        i5 = 370296299;
                    }
                    break;
                case -2019391828:
                case -1463461771:
                    C1024.m56209();
                    ViewOnClickListenerC0939.m55941();
                    iM55979 = C0873.m55680("֨ܶ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 11041) ^ (-1042927205);
                    i5 = 679403213;
                    break;
                case -1966916694:
                case 2002880672:
                    if (C0898.m55800() <= 0) {
                        iM55979 = (C0946.m55979("᩵۟") + i2) * (-57);
                        i4 = ((iM55979 ^ i3) * 10187) ^ (-1155881866);
                        i5 = -139060621;
                    } else {
                        iM55979 = C0873.m55680("֨ܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11041) ^ (-1042927205);
                        i5 = 679403213;
                    }
                    break;
                case -1711273444:
                case 484769271:
                    if (C1003.m56123() != 0) {
                        iM55979 = C0873.m55680("֨ܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11041) ^ (-1042927205);
                        i5 = 679403213;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ܿ᩺")) * 15;
                        i4 = ((iM55979 ^ i3) * 12101) ^ 295635858;
                        i5 = 166393052;
                    }
                    break;
                case -1570479756:
                case 705562933:
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0873.m55680("۫ۖ") ^ i2) * 37;
                        i4 = ((iM55979 ^ i3) * (-21359)) ^ 619869341;
                        i5 = 1236346877;
                    } else {
                        iM55979 = C0873.m55680("ۜ᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8955)) ^ (-649463602);
                        i5 = 634086046;
                    }
                    break;
                case -1111352946:
                case 730458708:
                    if (C0947.m55997()) {
                        iM55979 = C0946.m55979("ᩳۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-10705)) ^ (-790527112);
                        i5 = -945523817;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܺܺ")) * 29;
                        i4 = ((iM55979 ^ i2) * (-8165)) ^ (-1423240971);
                        i5 = 103416828;
                    }
                    break;
                case -793336598:
                case 1432462987:
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0946.m55979("֨ۙ") + i2) * 45;
                        i4 = ((iM55979 ^ i3) * 22469) ^ 1599637752;
                        i5 = -1587037843;
                    } else {
                        iM55979 = C0946.m55979("ۡۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 16905) ^ 2067522281;
                        i5 = -299323223;
                    }
                    break;
                case -764894958:
                case 305213363:
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("ᩳۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-10705)) ^ (-790527112);
                        i5 = -945523817;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۘۘ")) * (-93);
                        i4 = ((iM55979 ^ i3) * (-11985)) ^ 724836836;
                        i5 = -1006523787;
                    }
                    break;
                case -733288557:
                case -708283549:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0946.m55979("᩵۟") + i2) * (-57);
                        i4 = ((iM55979 ^ i3) * 10187) ^ (-1155881866);
                        i5 = -139060621;
                    } else {
                        iM55979 = (C0946.m55979("᩵֡") + i2) * 67;
                        i4 = ((iM55979 ^ i3) * 27965) ^ (-1602967005);
                        i5 = 2102571850;
                    }
                    break;
                case -725318946:
                case 1498537966:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("᩵۟") + i2) * (-57);
                        i4 = ((iM55979 ^ i3) * 10187) ^ (-1155881866);
                        i5 = -139060621;
                    } else {
                        iM55979 = (C0873.m55680("ۘ᩸") ^ i3) * 61;
                        i4 = ((iM55979 ^ i2) * 18595) ^ (-1918694122);
                        i5 = 788337411;
                    }
                    break;
                case -390958330:
                case 1849792304:
                    C0917.m55854();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("ᩳۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-10705)) ^ (-790527112);
                        i5 = -945523817;
                    } else {
                        iM55979 = (C0946.m55979("᩵۟") + i2) * (-57);
                        i4 = ((iM55979 ^ i3) * 10187) ^ (-1155881866);
                        i5 = -139060621;
                    }
                    break;
                case -200332990:
                case 1855469918:
                    if (C1964.f83032 > 0) {
                        ThreadUtil.runOnUiThread(new RunnableC11064(1, this, cls));
                    }
                    iM55979 = (C0946.m55979("֨ۙ") + i2) * 45;
                    i4 = ((iM55979 ^ i3) * 22469) ^ 1599637752;
                    i5 = -1587037843;
                    break;
                case 247838339:
                case 966337821:
                    C1017.m56187();
                    C0917.m55854();
                    break;
                case 300015760:
                case 1092672151:
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0873.m55680("֨ܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11041) ^ (-1042927205);
                        i5 = 679403213;
                    } else {
                        iM55979 = C0873.m55680("ۗۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17493)) ^ 379254300;
                        i5 = 1527203202;
                    }
                    break;
                default:
                    C1964.m56597();
                    if (!C0892.f81851) {
                        iM55979 = C0873.m55680("֨ܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11041) ^ (-1042927205);
                        i5 = 679403213;
                    } else {
                        iM55979 = C0873.m55680("ۜ᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8955)) ^ (-649463602);
                        i5 = 634086046;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    @Deprecated
    public final LocalString getAssetLocalString(String str) {
        return m28714(str);
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final LocalString getLanguageNameLocalString() {
        return C16907.m38479();
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final boolean hasClipboardText() {
        boolean zHasPrimaryClip = false;
        int i = 956613648;
        int i2 = C1964.f83032;
        int i3 = RunnableC0938.f81886;
        int iM55979 = (C0946.m55979("ᩳۚ") + i3) * (-107);
        int i4 = ((iM55979 ^ i2) * (-2739)) ^ 1843072789;
        int i5 = -1241225721;
        while (true) {
            i = ((((i ^ i2) * (-1029)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1865944168:
                case 2102184976:
                    if (C0917.f81868) {
                        iM55979 = (C0946.m55979("ۘۖ") ^ i3) * 69;
                        i4 = ((iM55979 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        iM55979 = (C0946.m55979("ܽۚ") ^ i2) * (-75);
                        i4 = ((iM55979 ^ i3) * (-30887)) ^ (-1947025622);
                        i5 = 1462436978;
                    }
                    break;
                case -1780156846:
                case -1217047114:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0946.m55979("۬֫") + i2) * (-115);
                        i4 = ((iM55979 ^ i3) * (-6559)) ^ 1698144381;
                        i5 = -1607110508;
                    } else {
                        iM55979 = C0873.m55680("᩶֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19221)) ^ (-1226218177);
                        i5 = -1763942196;
                    }
                    break;
                case -1629181330:
                case -978539412:
                    if (C1194.m56396() <= 0) {
                        iM55979 = C0873.m55680("᩶֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19221)) ^ (-1226218177);
                        i5 = -1763942196;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩷᩶")) * 37;
                        i4 = ((iM55979 ^ i3) * (-19551)) ^ 444975094;
                        i5 = 1502767884;
                    }
                    break;
                case -1556324390:
                case 2099789297:
                    C0890.m55740();
                    C1028.m56247();
                    iM55979 = (i3 - C0873.m55680("֫᩹")) * (-81);
                    i4 = ((iM55979 ^ i2) * (-10323)) ^ 1819663457;
                    i5 = 96683521;
                    break;
                case -1455100352:
                case -750682377:
                    return zHasPrimaryClip;
                case -1317787371:
                case 1670404371:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0946.m55979("۬֫") + i2) * (-115);
                        i4 = ((iM55979 ^ i3) * (-6559)) ^ 1698144381;
                        i5 = -1607110508;
                    } else {
                        iM55979 = C0946.m55979("ۗ᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 31845) ^ 861472258;
                        i5 = -610785195;
                    }
                    break;
                case -1301524926:
                case 879535289:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("۟ۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6751)) ^ (-2127025709);
                        i5 = -840752713;
                    } else {
                        iM55979 = C0873.m55680("ۨܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 253) ^ (-2013812770);
                        i5 = 481379885;
                    }
                    break;
                case -1250220044:
                case -952296598:
                    try {
                        zHasPrimaryClip = m28709().hasPrimaryClip();
                        iM55979 = C0946.m55979("ۗۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5)) ^ (-1308991356);
                        i5 = -425549068;
                    } catch (Throwable unused) {
                        iM55979 = C0946.m55979("۠ᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 1019) ^ (-1620759899);
                        i5 = -49808347;
                    }
                    break;
                case -1163806867:
                case 693280156:
                    if (C1124.m56367() < 0) {
                        iM55979 = (C0946.m55979("ۘۖ") ^ i3) * 69;
                        i4 = ((iM55979 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        iM55979 = (C0946.m55979("۬֫") + i2) * (-115);
                        i4 = ((iM55979 ^ i3) * (-6559)) ^ 1698144381;
                        i5 = -1607110508;
                    }
                    break;
                case -1022513455:
                case -787725578:
                    if (C1003.m56123() != 0) {
                        iM55979 = (C0946.m55979("ۘۖ") ^ i3) * 69;
                        i4 = ((iM55979 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        iM55979 = (C0946.m55979("᩹ۖ") + i2) * (-85);
                        i4 = ((iM55979 ^ i3) * (-31951)) ^ 100588;
                        i5 = 2031857459;
                    }
                    break;
                case -839804477:
                case 1788184366:
                    ServiceConnectionC1013.m56157();
                    if (!C0882.f81846) {
                        iM55979 = C0873.m55680("᩶֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19221)) ^ (-1226218177);
                        i5 = -1763942196;
                    } else {
                        iM55979 = (i3 - C0873.m55680("֫᩹")) * (-81);
                        i4 = ((iM55979 ^ i2) * (-10323)) ^ 1819663457;
                        i5 = 96683521;
                    }
                    break;
                case -756737467:
                case 491341311:
                    C0949.m56012();
                    return false;
                case -665518158:
                case 150038308:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0946.m55979("ۘۖ") ^ i3) * 69;
                        i4 = ((iM55979 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        iM55979 = (C0946.m55979("۠ۖ") ^ i3) * 101;
                        i4 = ((iM55979 ^ i2) * (-21985)) ^ (-743431274);
                        i5 = 1302152221;
                    }
                    break;
                case -293879753:
                case 335440221:
                    if (C0863.m55643()) {
                        iM55979 = C0946.m55979("ۛۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-19847)) ^ (-244170434);
                        i5 = 613950391;
                    } else {
                        iM55979 = C0873.m55680("ۨܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 253) ^ (-2013812770);
                        i5 = 481379885;
                    }
                    break;
                case -134153085:
                case 1525743502:
                    if (C0917.f81868) {
                        iM55979 = (C0946.m55979("ۘۖ") ^ i3) * 69;
                        i4 = ((iM55979 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        iM55979 = (C0946.m55979("ۛܶ") ^ i3) * 73;
                        i4 = ((iM55979 ^ i2) * (-7287)) ^ 993266123;
                        i5 = -595607924;
                    }
                    break;
                case 228363924:
                case 1170469845:
                    if (C0946.m55980() != 0) {
                        iM55979 = (C0946.m55979("ۘۖ") ^ i3) * 69;
                        i4 = ((iM55979 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        iM55979 = C0873.m55680("᩷ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21675) ^ (-1884928634);
                        i5 = 251940353;
                    }
                    break;
                case 1062845959:
                case 1826933916:
                    return false;
                default:
                    if (C0949.m56012()) {
                        iM55979 = (i3 - C0873.m55680("֫᩹")) * (-81);
                        i4 = ((iM55979 ^ i2) * (-10323)) ^ 1819663457;
                        i5 = 96683521;
                    } else {
                        iM55979 = C0946.m55979("ۘۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27547)) ^ 1644422360;
                        i5 = -1726848271;
                    }
                    break;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final CharSequence getClipboardText() {
        CharSequence text = null;
        Object th = null;
        CharSequence charSequence = null;
        int i = -1562654887;
        int i2 = ViewOnClickListenerC0939.f81888;
        int i3 = C0894.f81854;
        int iM55979 = C0946.m55979("ۛܰ") ^ i2;
        int i4 = ((iM55979 ^ i3) * 24803) ^ 67064881;
        int i5 = 313785721;
        while (true) {
            i = ((((i ^ i3) * 17143) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2109104887:
                case 728857871:
                    charSequence = "";
                    iM55979 = C0873.m55680("ᩴۚ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-2853)) ^ (-1565677798);
                    i5 = 1373379821;
                    break;
                case -2061655317:
                case -626773391:
                    C0992.m56107();
                    if (!RunnableC0897.f81856) {
                        iM55979 = (C0946.m55979("֨ܰ") ^ i3) * (-7);
                        i4 = ((iM55979 ^ i2) * 31987) ^ 2144889177;
                        i5 = 710388796;
                    } else {
                        iM55979 = (C0873.m55680("ۧܺ") ^ i3) * 127;
                        i4 = ((iM55979 ^ i2) * (-30967)) ^ 2094902212;
                        i5 = 1934148575;
                    }
                    break;
                case -1947046024:
                case 368107394:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("۫ᩴ") + i2) * (-13);
                        i4 = ((iM55979 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        iM55979 = (C0873.m55680("᩶ۙ") ^ i2) * (-39);
                        i4 = ((iM55979 ^ i3) * 8625) ^ (-269186704);
                        i5 = 513369947;
                    }
                    break;
                case -1687760236:
                case -141170104:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (C0873.m55680("۫ᩴ") + i2) * (-13);
                        i4 = ((iM55979 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ܿ֫")) * (-91);
                        i4 = ((iM55979 ^ i3) * (-26535)) ^ (-461255224);
                        i5 = -311890819;
                    }
                    break;
                case -1681350621:
                case 429460419:
                    if (text == null) {
                        iM55979 = C0946.m55979("ۡ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12423)) ^ (-348822884);
                        i5 = 254900180;
                    } else {
                        charSequence = text;
                        iM55979 = C0873.m55680("ᩴۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2853)) ^ (-1565677798);
                        i5 = 1373379821;
                    }
                    break;
                case -1656034873:
                case 1494319902:
                    C1071.m56343();
                    C1048.m56305();
                    iM55979 = (C0946.m55979("֨ܰ") ^ i3) * (-7);
                    i4 = ((iM55979 ^ i2) * 31987) ^ 2144889177;
                    i5 = 710388796;
                    break;
                case -1628067423:
                case 1693761492:
                    try {
                        text = m28709().getText();
                        iM55979 = C0873.m55680("ܰ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9277)) ^ (-561406351);
                        i5 = 380656655;
                    } catch (Throwable th2) {
                        th = th2;
                        iM55979 = C0873.m55680("᩶ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3593) ^ (-1343331710);
                        i5 = 835870873;
                    }
                    break;
                case -1482295289:
                case 2059039866:
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("ۛ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22089) ^ 1670466539;
                        i5 = -915823860;
                    } else {
                        iM55979 = C0946.m55979("۠᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19839)) ^ 721481020;
                        i5 = 1104385069;
                    }
                    break;
                case -1419962529:
                case 268927573:
                    if (C1046.m56302() != 0) {
                        iM55979 = C0946.m55979("ۛ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22089) ^ 1670466539;
                        i5 = -915823860;
                    } else {
                        iM55979 = C0873.m55680("ۡۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 22375) ^ 1351847048;
                        i5 = -1998389726;
                    }
                    break;
                case -1362767708:
                case 1572575097:
                    if (C0906.f81862 < 0) {
                        iM55979 = C0946.m55979("ۛ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22089) ^ 1670466539;
                        i5 = -915823860;
                    } else {
                        iM55979 = (C0946.m55979("֨ܰ") ^ i3) * (-7);
                        i4 = ((iM55979 ^ i2) * 31987) ^ 2144889177;
                        i5 = 710388796;
                    }
                    break;
                case -633870250:
                case 199538917:
                    C0930.m55885();
                    C1036.m56257();
                    return null;
                case -562370387:
                case 93988717:
                    if (C1017.m56187() <= 0) {
                        iM55979 = (C0873.m55680("۫ᩴ") + i2) * (-13);
                        i4 = ((iM55979 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩹ᩴ")) * (-53);
                        i4 = ((iM55979 ^ i3) * 29367) ^ (-1381823876);
                        i5 = -1675082072;
                    }
                    break;
                case -454175588:
                case 2053408911:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("᩵ۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 29103) ^ (-784127543);
                        i5 = 2251004;
                    } else {
                        iM55979 = C0946.m55979("ܺۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15795)) ^ (-1088950447);
                        i5 = -891884676;
                    }
                    break;
                case 100434492:
                case 1624355662:
                    return charSequence;
                case 157689756:
                case 592840091:
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0946.m55979("ۛ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22089) ^ 1670466539;
                        i5 = -915823860;
                    } else {
                        iM55979 = C0946.m55979("۠۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * 2115) ^ (-768272129);
                        i5 = 371067906;
                    }
                    break;
                case 211329618:
                case 832480431:
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0873.m55680("۫ᩴ") + i2) * (-13);
                        i4 = ((iM55979 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        iM55979 = (C0873.m55680("᩷᩶") ^ i3) * 79;
                        i4 = ((iM55979 ^ i2) * (-17641)) ^ 1785726353;
                        i5 = 38881909;
                    }
                    break;
                case 720293970:
                case 1409468356:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("۫ᩴ") + i2) * (-13);
                        i4 = ((iM55979 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        iM55979 = C0946.m55979("ۛ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22089) ^ 1670466539;
                        i5 = -915823860;
                    }
                    break;
                case 1183875835:
                case 1331284139:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("ۧܺ") ^ i3) * 127;
                        i4 = ((iM55979 ^ i2) * (-30967)) ^ 2094902212;
                        i5 = 1934148575;
                    } else {
                        iM55979 = C0946.m55979("ᩳ۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21927) ^ (-378569193);
                        i5 = -138327093;
                    }
                    break;
                case 1260531818:
                case 1710393875:
                    return C0863.m55639(th);
                default:
                    if (C1017.m56187() <= 0) {
                        iM55979 = (C0873.m55680("۫ᩴ") + i2) * (-13);
                        i4 = ((iM55979 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        iM55979 = C0873.m55680("ۨܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25543)) ^ 913265909;
                        i5 = 1771375805;
                    }
                    break;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final void cancelToast() {
        int i = -16549692;
        int i2 = C0992.f81922;
        int i3 = C0967.f81910;
        int iM55979 = (i2 - C0946.m55979("᩸ܿ")) * (-115);
        int i4 = ((iM55979 ^ i3) * 16401) ^ (-693337626);
        int i5 = -1702946567;
        while (true) {
            i = ((((i ^ i3) * 27103) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1963415327:
                case 439251376:
                    if (RunnableC0871.m55672() < 0) {
                        iM55979 = (C0946.m55979("᩶ۜ") ^ i2) * (-71);
                        i4 = ((iM55979 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    } else {
                        iM55979 = (C0946.m55979("۠ۗ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * (-20217)) ^ 1348314306;
                        i5 = 527272625;
                    }
                    break;
                case -1640876356:
                case 1272954696:
                    if (C0906.m55809() <= 0) {
                        iM55979 = (C0873.m55680("۟ܿ") + i2) * (-49);
                        i4 = ((iM55979 ^ i3) * 11097) ^ 1586312043;
                        i5 = 1956098348;
                    } else {
                        iM55979 = C0946.m55979("ۜۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1411)) ^ (-1948314520);
                        i5 = -136672546;
                    }
                    break;
                case -1358745454:
                case 303302503:
                    if (C1404.f82149 < 0) {
                        ThreadUtil.runOnUiThread(new RunnableC20107(1));
                    }
                    iM55979 = (C0873.m55680("۟ܿ") + i2) * (-49);
                    i4 = ((iM55979 ^ i3) * 11097) ^ 1586312043;
                    i5 = 1956098348;
                    break;
                case -1246977165:
                case -142753284:
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0946.m55979("᩷ۛ") ^ i3) * (-109);
                        i4 = ((iM55979 ^ i2) * 12177) ^ (-1472617419);
                        i5 = -1270662126;
                    } else {
                        iM55979 = (C0946.m55979("۠ۗ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * (-20217)) ^ 1348314306;
                        i5 = 527272625;
                    }
                    break;
                case -662763090:
                case 262125223:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0946.m55979("᩶ۜ") ^ i2) * (-71);
                        i4 = ((iM55979 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    } else {
                        iM55979 = C0873.m55680("᩸ۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-20253)) ^ 1096621765;
                        i5 = -604423851;
                    }
                    break;
                case -610403476:
                case -190292645:
                    C21862 c21862 = C16907.f50058;
                    if (C0892.f81851) {
                        iM55979 = C0873.m55680("᩻᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9527)) ^ (-650451906);
                        i5 = -103249211;
                    } else {
                        iM55979 = (C0946.m55979("᩶ۜ") ^ i2) * (-71);
                        i4 = ((iM55979 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    }
                    break;
                case -147707633:
                case 1339050473:
                    C0930.m55885();
                    iM55979 = (C0946.m55979("۠ۗ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM55979 ^ i3) * (-20217)) ^ 1348314306;
                    i5 = 527272625;
                    break;
                case -104285889:
                case 343559279:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (C0946.m55979("᩶ۜ") ^ i2) * (-71);
                        i4 = ((iM55979 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    } else {
                        iM55979 = C0873.m55680("۫ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31239)) ^ 895247118;
                        i5 = -140131039;
                    }
                    break;
                case 61897136:
                case 1980918780:
                    if (C1194.f82045 != 0) {
                        iM55979 = (C0946.m55979("᩷ۛ") ^ i3) * (-109);
                        i4 = ((iM55979 ^ i2) * 12177) ^ (-1472617419);
                        i5 = -1270662126;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۖۡ")) * 43;
                        i4 = ((iM55979 ^ i2) * 21053) ^ 2041361682;
                        i5 = 1721557348;
                    }
                    break;
                case 106555150:
                case 911969226:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = (C0873.m55680("۟ܿ") + i2) * (-49);
                        i4 = ((iM55979 ^ i3) * 11097) ^ 1586312043;
                        i5 = 1956098348;
                    } else {
                        iM55979 = C0873.m55680("֡᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18997)) ^ 847994940;
                        i5 = -2011924208;
                    }
                    break;
                case 332266967:
                case 1027522082:
                    C0946.m55980();
                    if (!RunnableC0897.m55784()) {
                        iM55979 = (C0946.m55979("᩶ۜ") ^ i2) * (-71);
                        i4 = ((iM55979 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    } else {
                        iM55979 = (C0873.m55680("֫ۗ") ^ i3) * (-119);
                        i4 = ((iM55979 ^ i2) * 23435) ^ 1416915241;
                        i5 = 212301864;
                    }
                    break;
                case 850492101:
                case 1773560909:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("᩶ۜ") ^ i2) * (-71);
                        i4 = ((iM55979 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    } else {
                        iM55979 = (C0873.m55680("۬۠") ^ i2) * 79;
                        i4 = ((iM55979 ^ i3) * (-25359)) ^ (-1144854175);
                        i5 = -1934222062;
                    }
                    break;
                case 1260942241:
                case 1760968974:
                    C0906.m55809();
                    C0898.m55800();
                    break;
                case 1488892438:
                case 2088671490:
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0946.m55979("ۤۚ") + i3) * 3;
                        i4 = ((iM55979 ^ i2) * 7661) ^ (-65229666);
                        i5 = -1874750309;
                    } else {
                        iM55979 = (C0873.m55680("֫ۗ") ^ i3) * (-119);
                        i4 = ((iM55979 ^ i2) * 23435) ^ 1416915241;
                        i5 = 212301864;
                    }
                    break;
                default:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = (C0873.m55680("۟ܿ") + i2) * (-49);
                        i4 = ((iM55979 ^ i3) * 11097) ^ 1586312043;
                        i5 = 1956098348;
                    } else {
                        iM55979 = C0946.m55979("۬ۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12735) ^ (-455365168);
                        i5 = -1501631552;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0194 A[PHI: r4 r5 r7 r11
      0x0194: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:52:0x0192, B:44:0x014e, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:52:0x0192, B:44:0x014e, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short) binds: [B:52:0x0192, B:44:0x014e, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:52:0x0192, B:44:0x014e, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c5 A[PHI: r3 r16
      0x01c5: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:56:0x01c3, B:19:0x006d, B:14:0x004d, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r16v3 java.lang.String) = (r16v1 java.lang.String), (r16v2 java.lang.String), (r16v1 java.lang.String), (r16v1 java.lang.String) binds: [B:56:0x01c3, B:19:0x006d, B:14:0x004d, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01f7 A[PHI: r9 r10
      0x01f7: PHI (r9v3 short[]) = (r9v1 short[]), (r9v2 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:60:0x01f5, B:27:0x00ab, B:12:0x0049, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:60:0x01f5, B:27:0x00ab, B:12:0x0049, B:9:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0228  */
    /* JADX WARN: Code duplicated, block: B:69:0x025a A[PHI: r2 r6
      0x025a: PHI (r2v4 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:68:0x0258, B:48:0x016f, B:12:0x0049, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r6v4 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:68:0x0258, B:48:0x016f, B:12:0x0049, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    private ClipboardManager m28709() {
        int iM55979;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1948146645;
        int i9 = C1036.f81953;
        int i10 = AbstractC0942.f81890;
        int iM55680 = C0873.m55680("֫᩶") ^ i9;
        int i11 = ((iM55680 ^ i10) * (-23015)) ^ (-609332901);
        int i12 = iM55680 ^ 184867966;
        String strM56403 = null;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * 23423) >> 31));
            switch (i8) {
                case -1955052323:
                case 442977595:
                    RunnableC0897.m55784();
                    C0892.m55749();
                    iM55979 = (C0873.m55680("۫ܳ") ^ i9) * (-5);
                    i = ((iM55979 ^ i10) * 20591) ^ (-590413098);
                    i2 = 143359808;
                    int i13 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i13;
                    break;
                case -1934133856:
                case -1587599873:
                    sArr2 = f82134;
                    i6 = 1;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("ۛܰ") ^ i9) * (-21);
                        i = ((iM55979 ^ i10) * (-1989)) ^ (-1201522271);
                        i2 = 1252810089;
                    } else {
                        iM55979 = C0946.m55979("ۙۚ") ^ i10;
                        i = ((iM55979 ^ i9) * (-28341)) ^ (-1531559957);
                        i2 = -21127659;
                    }
                    int i14 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i14;
                    break;
                case -1867500229:
                case -664638058:
                    i4 = i3 + 38576521;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ᩴۧ") ^ i10;
                        i = ((iM55979 ^ i9) * (-2183)) ^ 621679707;
                        i2 = 1288632395;
                    } else {
                        iM55979 = (C0873.m55680("ۘۧ") ^ i9) * 47;
                        i = ((iM55979 ^ i10) * (-4679)) ^ (-1388691009);
                        i2 = -1147517315;
                    }
                    int i15 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i15;
                    break;
                case -1521540744:
                case 652135018:
                    c = 0;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0873.m55680("۫ܳ") ^ i9) * (-5);
                        i = ((iM55979 ^ i10) * 20591) ^ (-590413098);
                        i2 = 143359808;
                    } else {
                        iM55979 = (C0873.m55680("ۙۢ") ^ i9) * 45;
                        i = ((iM55979 ^ i10) * 1751) ^ (-432979594);
                        i2 = 1540173420;
                    }
                    int i16 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i16;
                    break;
                case -1474835785:
                case -1067010111:
                    i7 = 9;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ܽۨ") ^ i10;
                        i = ((iM55979 ^ i9) * (-4991)) ^ (-2054803465);
                        i2 = -2003903586;
                    } else {
                        iM55979 = C0946.m55979("᩷۫") ^ i9;
                        i = ((iM55979 ^ i10) * (-22149)) ^ 1686903681;
                        i2 = -360696285;
                    }
                    int i17 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i17;
                    break;
                case -877299899:
                case -207499068:
                    i5 = 17074;
                    iM55979 = C0873.m55680("᩵᩸") ^ i9;
                    i = ((iM55979 ^ i10) * (-31143)) ^ 1059908919;
                    i2 = -1869787782;
                    int i18 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i18;
                    break;
                case -841044512:
                case 442406415:
                    s = sArr[c];
                    i3 = s * s;
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0946.m55979("ܽۨ") ^ i10;
                        i = ((iM55979 ^ i9) * (-4991)) ^ (-2054803465);
                        i2 = -2003903586;
                    } else {
                        iM55979 = (C0873.m55680("ۛ۫") + i10) * (-67);
                        i = ((iM55979 ^ i9) * 18145) ^ 1090874527;
                        i2 = -1047316644;
                    }
                    int i19 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i19;
                    break;
                case -666816069:
                case 1553218265:
                    s2 = 12422;
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ܽۨ") ^ i10;
                        i = ((iM55979 ^ i9) * (-4991)) ^ (-2054803465);
                        i2 = -2003903586;
                    } else {
                        iM55979 = (C0946.m55979("᩺ۖ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55979 ^ i9) * (-16223)) ^ (-1855662073);
                        i2 = -645232371;
                    }
                    int i110 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i110;
                    break;
                case -568020138:
                case 1097197052:
                    AbstractC0942.m55971();
                    if (C0992.f81922 < 0) {
                        iM55979 = (C0873.m55680("ۛܰ") ^ i9) * (-21);
                        i = ((iM55979 ^ i10) * (-1989)) ^ (-1201522271);
                        i2 = 1252810089;
                    } else {
                        iM55979 = (C0873.m55680("᩶ܿ") + i9) * 119;
                        i = ((iM55979 ^ i10) * (-12235)) ^ (-399312174);
                        i2 = -1596459415;
                    }
                    int i111 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i111;
                    break;
                case -560277610:
                case 1986864588:
                    if (this.f34924 == null) {
                        iM55979 = C0873.m55680("ۗܰ") ^ i10;
                        i = ((iM55979 ^ i9) * (-32027)) ^ (-1498864428);
                        i2 = -635625190;
                    } else {
                        iM55979 = (C0873.m55680("᩸ᩳ") + i9) * 19;
                        i = ((iM55979 ^ i10) * (-4573)) ^ (-1993009693);
                        i2 = 1377971929;
                    }
                    int i112 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i112;
                    break;
                case -555627194:
                case -407906906:
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0873.m55680("᩶ܿ") + i9) * 119;
                        i = ((iM55979 ^ i10) * (-12235)) ^ (-399312174);
                        i2 = -1596459415;
                    } else {
                        iM55979 = (C0873.m55680("ۙۜ") ^ i10) * 43;
                        i = ((iM55979 ^ i9) * (-16499)) ^ 60041295;
                        i2 = -1267790861;
                    }
                    int i113 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i113;
                    break;
                case -477658481:
                case 527123174:
                    i5 = 51763;
                    iM55979 = C0873.m55680("᩵᩸") ^ i9;
                    i = ((iM55979 ^ i10) * (-31143)) ^ 1059908919;
                    i2 = -1869787782;
                    int i114 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i114;
                    break;
                case -303615936:
                case 1548954222:
                    sArr = f82134;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ᩴۧ") ^ i10;
                        i = ((iM55979 ^ i9) * (-2183)) ^ 621679707;
                        i2 = 1288632395;
                    } else {
                        iM55979 = C0946.m55979("ۙܰ") ^ i9;
                        i = ((iM55979 ^ i10) * 27825) ^ (-428785295);
                        i2 = 939667492;
                    }
                    int i115 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i115;
                    break;
                case -171928037:
                case 883363884:
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("ᩴۧ") ^ i10;
                        i = ((iM55979 ^ i9) * (-2183)) ^ 621679707;
                        i2 = 1288632395;
                    } else {
                        iM55979 = (C0873.m55680("ۛܰ") ^ i9) * (-21);
                        i = ((iM55979 ^ i10) * (-1989)) ^ (-1201522271);
                        i2 = 1252810089;
                    }
                    int i116 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i116;
                    break;
                case 130937204:
                case 292374687:
                    if (i4 - (s * s2) < 0) {
                        iM55979 = (i10 - C0873.m55680("۬ۢ")) * (-79);
                        i = ((iM55979 ^ i9) * (-7081)) ^ 1253329841;
                        i2 = -1574596750;
                    } else {
                        iM55979 = C0946.m55979("ܿۤ") ^ i9;
                        i = ((iM55979 ^ i10) * (-27949)) ^ (-187987928);
                        i2 = 356651348;
                    }
                    int i117 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i117;
                    break;
                case 202857736:
                case 661629941:
                    this.f34924 = (ClipboardManager) C7050.m16223(strM56403);
                    iM55979 = (C0873.m55680("᩸ᩳ") + i9) * 19;
                    i = ((iM55979 ^ i10) * (-4573)) ^ (-1993009693);
                    i2 = 1377971929;
                    int i118 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i118;
                    break;
                case 207629154:
                case 857253333:
                    strM56403 = C1229.m56403(sArr2, i6, i7, i5);
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("۫ܳ") ^ i9) * (-5);
                        i = ((iM55979 ^ i10) * 20591) ^ (-590413098);
                        i2 = 143359808;
                    } else {
                        iM55979 = (i10 - C0946.m55979("᩻ܿ")) * (-73);
                        i = ((iM55979 ^ i9) * 15317) ^ (-174897583);
                        i2 = 1831244316;
                    }
                    int i119 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i119;
                    break;
                case 989019411:
                case 1942566061:
                    if (C0917.f81868) {
                        iM55979 = (C0873.m55680("ۛܰ") ^ i9) * (-21);
                        i = ((iM55979 ^ i10) * (-1989)) ^ (-1201522271);
                        i2 = 1252810089;
                    } else {
                        iM55979 = (C0873.m55680("᩸ۖ") ^ i10) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i9) * (-20755)) ^ (-1470849648);
                        i2 = 506483253;
                    }
                    int i1110 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i1110;
                    break;
                case 1251185779:
                case 1899536105:
                    return this.f34924;
                case 1876211373:
                case 1963420175:
                    C0947.m55997();
                    C0898.m55800();
                    return null;
                default:
                    C0930.m55885();
                    if (C0955.f81898) {
                        iM55979 = (C0873.m55680("۫ܳ") ^ i9) * (-5);
                        i = ((iM55979 ^ i10) * 20591) ^ (-590413098);
                        i2 = 143359808;
                    } else {
                        iM55979 = C0946.m55979("ᩴۧ") ^ i10;
                        i = ((iM55979 ^ i9) * (-2183)) ^ 621679707;
                        i2 = 1288632395;
                    }
                    int i1111 = i;
                    i12 = iM55979 ^ i2;
                    i11 = i1111;
                    break;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final void showToast(CharSequence charSequence) {
        int i = 0;
        CharSequence charSequenceM55711 = null;
        String str = null;
        int i2 = -674929707;
        int i3 = C1404.f82149;
        int i4 = C1044.f81959;
        int iM55680 = (C0873.m55680("᩷᩹") ^ i3) * (-47);
        int i5 = ((iM55680 ^ i4) * 10197) ^ 2093632384;
        int i6 = -1529160171;
        while (true) {
            int i7 = iM55680 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 22923) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2081405387:
                    case -456129815:
                        if (C1036.m56257() <= 0) {
                            iM55680 = (i4 - C0946.m55979("ۜܰ")) * 29;
                            i5 = ((iM55680 ^ i3) * 31017) ^ (-1470850838);
                            i6 = 903969892;
                        } else {
                            iM55680 = C0873.m55680("ۨ᩻") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-31931)) ^ 163074922;
                            i6 = -1679819144;
                        }
                        break;
                    case -1978395040:
                    case 1089290522:
                        charSequenceM55711 = C0882.m55711(this, str);
                        if (charSequenceM55711 == null) {
                            charSequenceM55711 = charSequence;
                        }
                        iM55680 = C0873.m55680("ܰᩴ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-18737)) ^ 1575350999;
                        i6 = 2075799755;
                        break;
                    case -1740992761:
                    case -1718749735:
                        if (RunnableC0871.f81839 >= 0) {
                            iM55680 = (i4 - C0946.m55979("ۜܰ")) * 29;
                            i5 = ((iM55680 ^ i3) * 31017) ^ (-1470850838);
                            i6 = 903969892;
                        } else {
                            iM55680 = C0946.m55979("ۗᩳ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-17997)) ^ 1262633787;
                            i6 = 1689480161;
                        }
                        break;
                    case -1558388113:
                    case 1282214287:
                        str = (String) charSequence;
                        if (C0882.m55719(str) >= 3) {
                            iM55680 = (C0946.m55979("ۛ֫") ^ i3) * 89;
                            i5 = ((iM55680 ^ i4) * (-13797)) ^ 73328758;
                            i6 = -1512049239;
                        } else {
                            charSequenceM55711 = charSequence;
                            iM55680 = C0873.m55680("ܰᩴ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-18737)) ^ 1575350999;
                            i6 = 2075799755;
                        }
                        break;
                    case -1463857621:
                    case 1505303541:
                        if (C1048.f81963) {
                            iM55680 = C0946.m55979("ܺۧ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 20491) ^ (-1685140208);
                            i6 = -2083058889;
                        } else {
                            iM55680 = (C0946.m55979("ۖۢ") + i3) * (-117);
                            i5 = ((iM55680 ^ i4) * 19403) ^ 731910740;
                            i6 = 177382582;
                        }
                        break;
                    case -1315701425:
                    case 1731071109:
                        if (C0882.m55712(str, i) == '{') {
                            iM55680 = (C0946.m55979("ۖ᩸") ^ i3) * 17;
                            i5 = ((iM55680 ^ i4) * (-2537)) ^ 761408193;
                            i6 = 399357615;
                        } else {
                            charSequenceM55711 = charSequence;
                            iM55680 = C0873.m55680("ܰᩴ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-18737)) ^ 1575350999;
                            i6 = 2075799755;
                        }
                        break;
                    case -1301718993:
                    case 2069691472:
                        C0937.m55918();
                        C0866.m55645();
                        break;
                    case -1222468298:
                    case -320302011:
                        if (ViewOnClickListenerC0939.m55941() >= 0) {
                            iM55680 = C0946.m55979("ۖ᩺") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-10829)) ^ (-907197189);
                            i6 = -1075396469;
                        } else {
                            iM55680 = C0873.m55680("ۙ᩷") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-31283)) ^ 1498511463;
                            i6 = -1632458617;
                        }
                        break;
                    case -780974844:
                    case 1757379536:
                        if (C0967.f81910 >= 0) {
                            iM55680 = C0946.m55979("ۖ᩺") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-10829)) ^ (-907197189);
                            i6 = -1075396469;
                        } else {
                            iM55680 = (C0873.m55680("ᩴۚ") ^ i3) * 35;
                            i5 = ((iM55680 ^ i4) * (-11435)) ^ 772839058;
                            i6 = -447801817;
                        }
                        break;
                    case -629944718:
                    case 1205428752:
                        C0906.m55809();
                        if (!C0892.f81851) {
                            iM55680 = C0946.m55979("ۖ᩺") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-10829)) ^ (-907197189);
                            i6 = -1075396469;
                        } else {
                            iM55680 = (C0873.m55680("᩹ۘ") + i3) * (-71);
                            i5 = ((iM55680 ^ i4) * (-19995)) ^ (-721816840);
                            i6 = -1795111412;
                        }
                        break;
                    case -268510726:
                    case 18540945:
                        if (C0892.m55748(1, str) == '}') {
                            iM55680 = C0873.m55680("ᩳܶ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-32407)) ^ (-1626817819);
                            i6 = 38550683;
                        } else {
                            charSequenceM55711 = charSequence;
                            iM55680 = C0873.m55680("ܰᩴ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-18737)) ^ 1575350999;
                            i6 = 2075799755;
                        }
                        break;
                    case -203302825:
                    case 1946585312:
                        C21862 c21862 = C16907.f50058;
                        if (C0877.m55696()) {
                            ThreadUtil.runOnUiThread(new RunnableC3497(i, charSequenceM55711));
                        }
                        iM55680 = (C0946.m55979("ۖۢ") + i3) * (-117);
                        i5 = ((iM55680 ^ i4) * 19403) ^ 731910740;
                        i6 = 177382582;
                        break;
                    case 46839534:
                    case 1291903546:
                        C1036.m56257();
                        if (ViewOnClickListenerC0939.f81888 > 0) {
                            iM55680 = C0946.m55979("ۖ᩺") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-10829)) ^ (-907197189);
                            i6 = -1075396469;
                        } else {
                            iM55680 = C0873.m55680("ۙܽ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-1285)) ^ (-1518124831);
                            i6 = -865700866;
                        }
                        break;
                    case 186999838:
                    case 1962734169:
                        if (!(charSequence instanceof String)) {
                            i = 0;
                            charSequenceM55711 = charSequence;
                            iM55680 = C0873.m55680("ܰᩴ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-18737)) ^ 1575350999;
                            i6 = 2075799755;
                        } else {
                            int iM55681 = (i4 - C0873.m55680("ۢ֡")) * 67;
                            i5 = ((iM55681 ^ i3) * 20157) ^ 527280827;
                            i7 = iM55681 ^ 209762468;
                            i = 0;
                        }
                        break;
                    case 303710177:
                    case 1445816568:
                        if (C0947.f81895) {
                            iM55680 = (C0946.m55979("ۖۢ") + i3) * (-117);
                            i5 = ((iM55680 ^ i4) * 19403) ^ 731910740;
                            i6 = 177382582;
                        } else {
                            iM55680 = (C0946.m55979("ᩴܶ") ^ i4) * (-53);
                            i5 = ((iM55680 ^ i3) * 17409) ^ 298725366;
                            i6 = 348941082;
                        }
                        break;
                    case 327425843:
                    case 1191063370:
                        if (C0890.f81849 != 0) {
                            iM55680 = (C0946.m55979("ۖۢ") + i3) * (-117);
                            i5 = ((iM55680 ^ i4) * 19403) ^ 731910740;
                            i6 = 177382582;
                        } else {
                            iM55680 = (C0946.m55979("ۙۖ") + i3) * (-77);
                            i5 = ((iM55680 ^ i4) * (-10407)) ^ 1753066412;
                            i6 = 607465253;
                        }
                        break;
                    case 935149367:
                    case 2053937740:
                        C0877.m55696();
                        C1028.m56247();
                        iM55680 = (C0873.m55680("᩹ۘ") + i3) * (-71);
                        i5 = ((iM55680 ^ i4) * (-19995)) ^ (-721816840);
                        i6 = -1795111412;
                        break;
                    case 1167443861:
                    case 1476250342:
                        if (AbstractC0942.f81890 <= 0) {
                            iM55680 = (C0873.m55680("᩹ۘ") + i3) * (-71);
                            i5 = ((iM55680 ^ i4) * (-19995)) ^ (-721816840);
                            i6 = -1795111412;
                        } else {
                            iM55680 = (C0946.m55979("ܺܰ") + i4) * 89;
                            i5 = ((iM55680 ^ i3) * 16505) ^ (-360745460);
                            i6 = -3990823;
                        }
                        break;
                    case 1207835504:
                    case 1251500293:
                        if (C0937.f81884) {
                            iM55680 = (C0946.m55979("۫ۧ") ^ i3) * (-15);
                            i5 = ((iM55680 ^ i4) * 30821) ^ 1314821761;
                            i6 = -950649704;
                        } else {
                            iM55680 = (C0946.m55979("ۖۢ") + i3) * (-117);
                            i5 = ((iM55680 ^ i4) * 19403) ^ 731910740;
                            i6 = 177382582;
                        }
                        break;
                    default:
                        if (C0890.f81849 != 0) {
                            iM55680 = (i4 - C0946.m55979("ۜܰ")) * 29;
                            i5 = ((iM55680 ^ i3) * 31017) ^ (-1470850838);
                            i6 = 903969892;
                        } else {
                            iM55680 = C0946.m55979("ۖ᩺") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-10829)) ^ (-907197189);
                            i6 = -1075396469;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01e3 A[PHI: r6 r9 r10 r16
      0x01e3: PHI (r6v6 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:41:0x0108, B:33:0x00cb, B:61:0x01e1, B:96:0x01e3] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r9v59 short[]) = (r9v35 short[]), (r9v1 short[]), (r9v48 short[]), (r9v1 short[]) binds: [B:41:0x0108, B:33:0x00cb, B:61:0x01e1, B:96:0x01e3] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r10v5 int) = (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:41:0x0108, B:33:0x00cb, B:61:0x01e1, B:96:0x01e3] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r16v5 int) = (r16v1 int), (r16v2 int), (r16v1 int), (r16v1 int) binds: [B:41:0x0108, B:33:0x00cb, B:61:0x01e1, B:96:0x01e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x026e A[PHI: r2 r7 r11 r17
      0x026e: PHI (r2v4 char) = (r2v2 char), (r2v1 char), (r2v1 char) binds: [B:73:0x026c, B:56:0x01bf, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r7v4 short) = (r7v1 short), (r7v2 short), (r7v1 short) binds: [B:73:0x026c, B:56:0x01bf, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r11v4 int) = (r11v1 int), (r11v1 int), (r11v5 int) binds: [B:73:0x026c, B:56:0x01bf, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r17v32 short[]) = (r17v4 short[]), (r17v8 short[]), (r17v33 short[]) binds: [B:73:0x026c, B:56:0x01bf, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02a3 A[PHI: r1 r5 r17
      0x02a3: PHI (r1v3 short[]) = (r1v2 short[]), (r1v1 short[]) binds: [B:77:0x02a1, B:65:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:77:0x02a1, B:65:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r17v6 short[]) = (r17v3 short[]), (r17v7 short[]) binds: [B:77:0x02a1, B:65:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if (p067l.C1046.f81962 <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (p067l.C1071.f81975 <= 0) goto L17;
     */
    @Override // bin.p000mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean setClipboardText(CharSequence charSequence) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -983909683;
        int i12 = C1044.f81959;
        int i13 = C0894.f81854;
        int iM559710 = C0946.m55979("᩻ۚ") ^ i13;
        int i14 = ((iM559710 ^ i12) * 21749) ^ 585910577;
        int i15 = iM559710 ^ 1127033968;
        int iM559711 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * (-15397)) >> 31));
            switch (i11) {
                case -2134774331:
                case 1623694367:
                    break;
                case -2065657343:
                case 751097495:
                    break;
                case -2035894575:
                case -702949397:
                    sArr2 = sArr2;
                    sArr = f82134;
                    if (C0949.m56012()) {
                        iM55680 = C0873.m55680("᩻᩶") ^ i13;
                        i = ((iM55680 ^ i12) * 21681) ^ (-55307782);
                        i2 = -1821375085;
                    } else {
                        iM55680 = C0873.m55680("֡ۡ") ^ i13;
                        i = ((iM55680 ^ i12) * 18683) ^ (-1354802376);
                        i2 = 304257363;
                    }
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
                case -2004009082:
                case 859974891:
                    sArr2 = sArr2;
                    i6 = 220136569;
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0873.m55680("᩻᩶") ^ i13;
                        i = ((iM55680 ^ i12) * 21681) ^ (-55307782);
                        i2 = -1821375085;
                    } else {
                        iM55680 = (C0873.m55680("ۧ۠") ^ i12) * 39;
                        i = ((iM55680 ^ i13) * 32189) ^ (-827245114);
                        i2 = 343084512;
                    }
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
                case -1937259403:
                case -1604612066:
                    C0937.m55918();
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("۟۠") ^ i13) * C0254q.f1218h;
                        i3 = ((iM55979 ^ i12) * 5505) ^ 1182691434;
                        i4 = -1799010899;
                    } else {
                        iM55979 = C0946.m55979("ۚܶ") ^ i12;
                        i3 = ((iM55979 ^ i13) * 25811) ^ 1973962959;
                        i4 = -1959496481;
                    }
                    int i16 = i3;
                    i15 = iM55979 ^ i4;
                    i14 = i16;
                    break;
                case -1685586959:
                case -833219930:
                    sArr2 = sArr2;
                    if (C0955.m56025()) {
                        iM55680 = C0946.m55979("᩻ۢ") ^ i13;
                        i = ((iM55680 ^ i12) * 15473) ^ (-1318930728);
                        i2 = -1360284099;
                    } else {
                        iM55680 = C0873.m55680("᩻۬") ^ i12;
                        i = ((iM55680 ^ i13) * 2359) ^ 1798040730;
                        i2 = 1581383138;
                    }
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
                case -1640495256:
                case 206851443:
                    C0967.m56074();
                    C1044.m56286();
                    return false;
                case -1621481126:
                case 1058479497:
                    sArr2 = sArr2;
                    c = 'c';
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0946.m55979("ᩴᩳ") + i12) * (-63);
                        i = ((iM55680 ^ i13) * 6439) ^ (-1779844828);
                        i2 = 1543674880;
                    } else {
                        iM55680 = (C0946.m55979("᩸ܺ") + i13) * 75;
                        i = ((iM55680 ^ i12) * 28231) ^ (-1023483247);
                        i2 = -1502500029;
                    }
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
                case -1434600146:
                case -621441303:
                    try {
                        sArr2 = sArr2;
                        try {
                            m28709().setPrimaryClip(ClipData.newPlainText(null, charSequence));
                            C1024.m56202(C0873.m55680(C0854.m55597(f82134, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 3, i8)) ^ 2124442268);
                            iM55680 = (i12 - C0946.m55979("ۘ᩶")) * 77;
                            i = ((iM55680 ^ i13) * 3475) ^ (-2128068587);
                            i2 = 229637976;
                        } catch (Throwable unused) {
                            iM55680 = (C0946.m55979("ۢۛ") ^ i12) * 71;
                            i = ((iM55680 ^ i13) * 20879) ^ (-863749099);
                            i2 = -2100473650;
                        }
                    } catch (Throwable unused2) {
                        sArr2 = sArr2;
                    }
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
                case -885585263:
                case 504057761:
                    C0894.m55769();
                    if (!C0947.m55997()) {
                        iM55979 = C0946.m55979("ۗ۫") ^ i12;
                        i3 = ((iM55979 ^ i13) * (-15811)) ^ (-1588648934);
                        i4 = 671111986;
                        int i17 = i3;
                        i15 = iM55979 ^ i4;
                        i14 = i17;
                    } else {
                        sArr2 = sArr2;
                        iM55680 = (C0946.m55979("ᩴᩳ") + i12) * (-63);
                        i = ((iM55680 ^ i13) * 6439) ^ (-1779844828);
                        i2 = 1543674880;
                        i15 = i2 ^ iM55680;
                        i14 = i;
                        sArr2 = sArr2;
                    }
                    break;
                case -779143481:
                case 53485207:
                    sArr2 = sArr2;
                    int i18 = i5 + i6;
                    i7 = i18 + i18;
                    if (!C1024.f81946) {
                        iM55680 = (i13 - C0873.m55680("ۘܽ")) * (-117);
                        i = ((iM55680 ^ i12) * (-12969)) ^ (-950588072);
                        i2 = 2714093;
                        i15 = i2 ^ iM55680;
                        i14 = i;
                        sArr2 = sArr2;
                    } else {
                        sArr2 = sArr2;
                        iM55979 = C0946.m55979("ۗ۫") ^ i12;
                        i3 = ((iM55979 ^ i13) * (-15811)) ^ (-1588648934);
                        i4 = 671111986;
                        int i19 = i3;
                        i15 = iM55979 ^ i4;
                        i14 = i19;
                    }
                    break;
                case -714228518:
                case 586282060:
                    sArr2 = sArr2;
                    s = sArr[c];
                    i5 = s * s;
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0946.m55979("۟۟") ^ i13) * 77;
                        i = ((iM55680 ^ i12) * 8435) ^ (-1834037012);
                        i2 = -2129747386;
                    } else {
                        iM55680 = (C0873.m55680("ܺ֨") ^ i12) * (-5);
                        i = ((iM55680 ^ i13) * (-13981)) ^ (-693671716);
                        i2 = 1702237529;
                    }
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
                case -535981765:
                case 1516399674:
                    C1024.m56202(iM559711 ^ 2119549998);
                    return false;
                case 57654939:
                case 1337368643:
                    if (C0989.f81920 < 0) {
                        iM55979 = (C0946.m55979("۟۠") ^ i13) * C0254q.f1218h;
                        i3 = ((iM55979 ^ i12) * 5505) ^ 1182691434;
                        i4 = -1799010899;
                        int i110 = i3;
                        i15 = iM55979 ^ i4;
                        i14 = i110;
                    } else {
                        sArr2 = sArr2;
                        iM55680 = (C0946.m55979("۟۟") ^ i13) * 77;
                        i = ((iM55680 ^ i12) * 8435) ^ (-1834037012);
                        i2 = -2129747386;
                        i15 = i2 ^ iM55680;
                        i14 = i;
                        sArr2 = sArr2;
                    }
                    break;
                case 246638378:
                case 1348186814:
                    return true;
                case 262479765:
                case 707995319:
                    i10 = 3;
                    if (C0930.f81879 > 0) {
                        iM55979 = (C0946.m55979("ܽۚ") + i13) * (-25);
                        i3 = ((iM55979 ^ i12) * (-31583)) ^ 781676935;
                        i4 = 1867021720;
                        int i111 = i3;
                        i15 = iM55979 ^ i4;
                        i14 = i111;
                    } else {
                        sArr2 = sArr2;
                        iM55680 = (C0946.m55979("ᩴᩳ") + i12) * (-63);
                        i = ((iM55680 ^ i13) * 6439) ^ (-1779844828);
                        i2 = 1543674880;
                        i15 = i2 ^ iM55680;
                        i14 = i;
                        sArr2 = sArr2;
                    }
                    break;
                case 536590447:
                case 1145978470:
                    i8 = 26593;
                    iM55680 = (C0946.m55979("۫ᩳ") + i13) * (-125);
                    i = ((iM55680 ^ i12) * 32505) ^ (-1750003564);
                    i2 = 1100089181;
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
                case 581551697:
                case 915105588:
                    i8 = 23134;
                    iM55680 = (C0946.m55979("۫ᩳ") + i13) * (-125);
                    i = ((iM55680 ^ i12) * 32505) ^ (-1750003564);
                    i2 = 1100089181;
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
                case 596674707:
                case 1554425181:
                    C0967.m56074();
                    sArr2 = sArr2;
                    iM55680 = (C0946.m55979("۟۟") ^ i13) * 77;
                    i = ((iM55680 ^ i12) * 8435) ^ (-1834037012);
                    i2 = -2129747386;
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
                case 1081646674:
                case 1867344519:
                    iM559711 = C0946.m55979(C0992.m56102(sArr2, i9, i10, i8));
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("ۗ۫") ^ i12;
                        i3 = ((iM55979 ^ i13) * (-15811)) ^ (-1588648934);
                        i4 = 671111986;
                    } else {
                        iM55979 = (C0946.m55979("ᩴۢ") + i12) * (-123);
                        i3 = ((iM55979 ^ i13) * (-30643)) ^ (-117372662);
                        i4 = -1698918939;
                    }
                    int i112 = i3;
                    i15 = iM55979 ^ i4;
                    i14 = i112;
                    break;
                case 1404783017:
                case 2113760366:
                    sArr2 = f82134;
                    i9 = 100;
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ۗ۫") ^ i12;
                        i3 = ((iM55979 ^ i13) * (-15811)) ^ (-1588648934);
                        i4 = 671111986;
                    } else {
                        iM55979 = (C0946.m55979("֫ۧ") ^ i13) * 81;
                        i3 = ((iM55979 ^ i12) * (-7365)) ^ 214130253;
                        i4 = -862589168;
                    }
                    int i113 = i3;
                    i15 = iM55979 ^ i4;
                    i14 = i113;
                    break;
                case 1486923201:
                case 1787189621:
                    sArr2 = sArr2;
                    s2 = 14837;
                    if (C1071.m56343() != 0) {
                        iM55680 = (C0946.m55979("ᩴᩳ") + i12) * (-63);
                        i = ((iM55680 ^ i13) * 6439) ^ (-1779844828);
                        i2 = 1543674880;
                    } else {
                        iM55680 = C0946.m55979("ۤ᩺") ^ i12;
                        i = ((iM55680 ^ i13) * 30333) ^ 954374644;
                        i2 = -761154982;
                    }
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
                default:
                    sArr2 = sArr2;
                    int i20 = s + s2;
                    if (i7 - (i20 * i20) < 0) {
                        iM55680 = (C0873.m55680("᩶ܺ") + i12) * (-79);
                        i = ((iM55680 ^ i13) * 12149) ^ 1066063344;
                        i2 = -182609677;
                    } else {
                        iM55680 = (i13 - C0873.m55680("᩵ۚ")) * 57;
                        i = ((iM55680 ^ i12) * 1585) ^ 1616992185;
                        i2 = 1233811312;
                    }
                    i15 = i2 ^ iM55680;
                    i14 = i;
                    sArr2 = sArr2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03c5 A[PHI: r12 r13 r14 r16 r18 r19
      0x03c5: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:106:0x03c3, B:98:0x0368, B:80:0x028c] A[DONT_GENERATE, DONT_INLINE]
      0x03c5: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:106:0x03c3, B:98:0x0368, B:80:0x028c] A[DONT_GENERATE, DONT_INLINE]
      0x03c5: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:106:0x03c3, B:98:0x0368, B:80:0x028c] A[DONT_GENERATE, DONT_INLINE]
      0x03c5: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:106:0x03c3, B:98:0x0368, B:80:0x028c] A[DONT_GENERATE, DONT_INLINE]
      0x03c5: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:106:0x03c3, B:98:0x0368, B:80:0x028c] A[DONT_GENERATE, DONT_INLINE]
      0x03c5: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short) binds: [B:106:0x03c3, B:98:0x0368, B:80:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x0482 A[PHI: r17
      0x0482: PHI (r17v4 short[]) = (r17v2 short[]), (r17v3 short[]), (r17v2 short[]) binds: [B:122:0x0480, B:110:0x03f9, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x024b A[PHI: r3
      0x024b: PHI (r3v4 boolean) = (r3v3 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:72:0x0234, B:66:0x01fd, B:57:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        if (p067l.C0892.f81851 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        if (p067l.C1124.f82007 >= 0) goto L39;
     */
    @Override // bin.p000mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean setClipboardText(CharSequence charSequence, String str) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        String str2 = str;
        int i4 = C0967.f81910;
        int i5 = C1124.f82007;
        int iM55681 = (C0873.m55680("᩹ۢ") + i5) * C0254q.f1218h;
        int i6 = ((iM55681 ^ i4) * (-25929)) ^ (-125711485);
        String str3 = null;
        short[] sArr = null;
        int i7 = iM55681 ^ (-1117264545);
        boolean z = false;
        boolean z2 = false;
        boolean zM55923 = false;
        int iM55878 = 0;
        char cM55870 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = -883927841;
        int i14 = 0;
        short[] sArr2 = null;
        String strM56403 = null;
        String strM55876 = null;
        char cM55871 = 0;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i4) * (-1809)) >> 31));
            switch (i13) {
                case -2131369734:
                case -17621513:
                    iM55878 = C0927.m55878(str);
                    iM55979 = C0873.m55680("᩹᩺") ^ i5;
                    i = ((iM55979 ^ i4) * 24699) ^ (-1979032663);
                    i3 = 1699642601;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -2110802031:
                case -2100468836:
                    z = false;
                    iM55680 = (C0873.m55680("ܽۘ") + i4) * (-101);
                    i = ((iM55680 ^ i5) * 18379) ^ (-953277465);
                    i2 = -301455237;
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case -2074262176:
                case -2005265505:
                    if (iM55878 >= 3) {
                        iM55979 = (C0946.m55979("ܿۤ") + i5) * (-95);
                        i = ((iM55979 ^ i4) * (-32097)) ^ (-1172575012);
                        i3 = -357009553;
                    } else {
                        str3 = str2;
                        iM55979 = C0946.m55979("ۤۧ") ^ i4;
                        i = ((iM55979 ^ i5) * 9585) ^ (-729372581);
                        i3 = 1970603160;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -2045350162:
                case -519719299:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("ۛۘ") ^ i4;
                        i = ((iM55680 ^ i5) * (-18211)) ^ (-1670543813);
                        i2 = 1737551778;
                    } else {
                        iM55680 = (C0873.m55680("ܽ۬") + i5) * 47;
                        i = ((iM55680 ^ i4) * 12745) ^ (-98062114);
                        i2 = 1734225056;
                    }
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case -2006809264:
                case 1225063919:
                    if (cM55870 == '{') {
                        iM55979 = (C0946.m55979("ܶۗ") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i5) * (-20641)) ^ (-302340514);
                        i3 = 1421573195;
                    } else {
                        str3 = str2;
                        iM55979 = C0946.m55979("ۤۧ") ^ i4;
                        i = ((iM55979 ^ i5) * 9585) ^ (-729372581);
                        i3 = 1970603160;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -1987560606:
                case 548141031:
                    try {
                        strM55876 = C0927.m55876(this, str2);
                        int iM559710 = C0946.m55979("ۜܳ") ^ i4;
                        i6 = ((iM559710 ^ i5) * 31335) ^ (-1235206137);
                        i7 = iM559710 ^ 581653530;
                    } catch (Throwable unused) {
                        iM55680 = (i4 - C0946.m55979("֫ܺ")) * (-77);
                        i = ((iM55680 ^ i5) * 12983) ^ (-1498187444);
                        i2 = -2111823042;
                        i7 = iM55680 ^ i2;
                        str2 = str;
                        i6 = i;
                    }
                    break;
                case -1931458677:
                case 527657414:
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0873.m55680("۠ۖ") + i4) * (-125);
                        i = ((iM55979 ^ i5) * 1089) ^ (-900038144);
                        i3 = 582118689;
                    } else {
                        iM55979 = (C0873.m55680("۟᩷") + i5) * 69;
                        i = ((iM55979 ^ i4) * (-7365)) ^ 341976400;
                        i3 = -1031685793;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -1809507474:
                case 388789519:
                    i11 = 218211984;
                    if (C0882.m55710() != 0) {
                        iM55680 = C0946.m55979("ᩳۨ") ^ i5;
                        i = ((iM55680 ^ i4) * (-519)) ^ 1837151987;
                        i2 = -1712206839;
                    } else {
                        iM55680 = C0946.m55979("֫᩺") ^ i4;
                        i = ((iM55680 ^ i5) * 2227) ^ 1833186419;
                        i2 = -189917898;
                    }
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case -1757811890:
                case -531303483:
                    int i15 = s + s2;
                    i12 = i15 * i15;
                    i14 = s * s;
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("֫֨") ^ i4;
                        i = ((iM55680 ^ i5) * 21881) ^ (-1862205029);
                        i2 = -1853432397;
                    } else {
                        iM55680 = C0946.m55979("֡۠") ^ i5;
                        i = ((iM55680 ^ i4) * 31977) ^ 1045554909;
                        i2 = -98836473;
                    }
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case -1639035483:
                case -75710016:
                    if (cM55871 == '}') {
                        iM55979 = (C0946.m55979("۬֨") ^ i5) * (-59);
                        i = ((iM55979 ^ i4) * 2841) ^ 1201932494;
                        i3 = -577705931;
                    } else {
                        str3 = str2;
                        iM55979 = C0946.m55979("ۤۧ") ^ i4;
                        i = ((iM55979 ^ i5) * 9585) ^ (-729372581);
                        i3 = 1970603160;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -1480125292:
                case -19853233:
                    RunnableC0871.m55671(str3);
                    iM55979 = (C0873.m55680("ۡ᩸") ^ i5) * (-101);
                    i = ((iM55979 ^ i4) * 30279) ^ 858483553;
                    i3 = 1202034175;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -1458616423:
                case 1954801106:
                    if (strM55876 != null) {
                        str3 = strM55876;
                    } else {
                        str3 = str2;
                    }
                    iM55979 = C0946.m55979("ۤۧ") ^ i4;
                    i = ((iM55979 ^ i5) * 9585) ^ (-729372581);
                    i3 = 1970603160;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -1139359137:
                case -510626882:
                    if (zM55923) {
                        iM55979 = (C0873.m55680("ۡ᩸") ^ i5) * (-101);
                        i = ((iM55979 ^ i4) * 30279) ^ 858483553;
                        i3 = 1202034175;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۛ֡")) * (-97);
                        i = ((iM55979 ^ i5) * 20533) ^ (-2021399100);
                        i3 = -401482395;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -1121177247:
                case 849214356:
                    C0861.m55626();
                    C0917.m55854();
                    iM55979 = (C0873.m55680("۠ۖ") + i4) * (-125);
                    i = ((iM55979 ^ i5) * 1089) ^ (-900038144);
                    i3 = 582118689;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -855332287:
                case 111254656:
                    C0917.m55842(C0873.m55680(strM56403) ^ 2097738550);
                    return z;
                case -746109340:
                case 1876291632:
                    break;
                case -729234636:
                case 1956722959:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("ۤ᩸") ^ i5) * 109;
                        i = ((iM55680 ^ i4) * 69) ^ (-1525849156);
                        i2 = 1480603324;
                    } else {
                        iM55680 = C0946.m55979("۫۫") ^ i5;
                        i = ((iM55680 ^ i4) * 4999) ^ 1924667002;
                        i2 = -1173791874;
                    }
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case -602740745:
                case 1566518829:
                    C0917.m55854();
                    if (C1012.f81938 < 0) {
                        iM55680 = C0873.m55680("ܺ֫") ^ i5;
                        i = ((iM55680 ^ i4) * (-24513)) ^ (-1969311613);
                        i2 = -230380512;
                        i7 = iM55680 ^ i2;
                        str2 = str;
                        i6 = i;
                    }
                    iM55979 = (C0873.m55680("۟᩷") + i5) * 69;
                    i = ((iM55979 ^ i4) * (-7365)) ^ 341976400;
                    i3 = -1031685793;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case -494602673:
                case 438476986:
                    break;
                case -462443297:
                case 162108654:
                    try {
                        m28709().setPrimaryClip(ClipData.newPlainText(null, charSequence));
                        iM55680 = C0946.m55979("ۢۢ") ^ i5;
                        i = ((iM55680 ^ i4) * 32527) ^ 1163546875;
                        i2 = -668285166;
                    } catch (Throwable unused2) {
                        iM55680 = (i4 - C0946.m55979("֫ܺ")) * (-77);
                        i = ((iM55680 ^ i5) * 12983) ^ (-1498187444);
                        i2 = -2111823042;
                    }
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case -367572006:
                case -15293926:
                    sArr2 = f82134;
                    if (C0898.m55800() <= 0) {
                        iM55680 = (C0873.m55680("ۤ᩸") ^ i5) * 109;
                        i = ((iM55680 ^ i4) * 69) ^ (-1525849156);
                        i2 = 1480603324;
                    } else {
                        iM55680 = (i5 - C0946.m55979("ۨۗ")) * (-19);
                        i = ((iM55680 ^ i4) * 30983) ^ 1049459779;
                        i2 = 1122823173;
                    }
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case -332071765:
                case 1459196598:
                    if (C0912.f81867 > 0) {
                        iM55680 = (C0873.m55680("ۤ᩸") ^ i5) * 109;
                        i = ((iM55680 ^ i4) * 69) ^ (-1525849156);
                        i2 = 1480603324;
                        i7 = iM55680 ^ i2;
                        str2 = str;
                        i6 = i;
                    }
                    iM55680 = C0946.m55979("ܺܰ") ^ i4;
                    i = ((iM55680 ^ i5) * 1637) ^ 1798173747;
                    i2 = -688193201;
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case -315941548:
                case 888818386:
                    i8 = 37738;
                    iM55680 = (C0946.m55979("۬᩺") + i5) * (-83);
                    i = ((iM55680 ^ i4) * 6047) ^ 1930496006;
                    i2 = -1809891363;
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case -223565057:
                case 397919542:
                    C0854.m55595();
                    return false;
                case 153219166:
                case 1959122571:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("ۛۘ") ^ i4;
                        i = ((iM55680 ^ i5) * (-18211)) ^ (-1670543813);
                        i2 = 1737551778;
                        i7 = iM55680 ^ i2;
                        str2 = str;
                        i6 = i;
                    }
                    iM55680 = C0873.m55680("֫֨") ^ i4;
                    i = ((iM55680 ^ i5) * 21881) ^ (-1862205029);
                    i2 = -1853432397;
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case 191074887:
                case 808665204:
                    i8 = 56223;
                    iM55680 = (C0946.m55979("۬᩺") + i5) * (-83);
                    i = ((iM55680 ^ i4) * 6047) ^ 1930496006;
                    i2 = -1809891363;
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case 304407831:
                case 820772999:
                    zM55923 = C0937.m55923(str);
                    iM55979 = (C0946.m55979("᩻᩸") + i5) * 71;
                    i = ((iM55979 ^ i4) * 14591) ^ (-2026081111);
                    i3 = 715426130;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case 311255603:
                case 1415108887:
                    cM55870 = C0927.m55870(str2, z ? 1 : 0);
                    iM55979 = C0873.m55680("ܽ۠") ^ i4;
                    i = ((iM55979 ^ i5) * (-30995)) ^ 562489087;
                    i3 = 63351367;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case 533464085:
                case 2105993121:
                    sArr = f82134;
                    i9 = IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i10 = 3;
                    if (C1229.f82066 < 0) {
                        iM55979 = C0946.m55979("֨ۨ") ^ i5;
                        i = ((iM55979 ^ i4) * 6811) ^ (-1246809442);
                        i3 = -268414242;
                        i7 = iM55979 ^ i3;
                        i6 = i;
                    } else {
                        iM55680 = C0946.m55979("ᩳۨ") ^ i5;
                        i = ((iM55680 ^ i4) * (-519)) ^ 1837151987;
                        i2 = -1712206839;
                        i7 = iM55680 ^ i2;
                        str2 = str;
                        i6 = i;
                    }
                    break;
                case 554774534:
                case 1463723593:
                    if (RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("ۨ֫") ^ i4;
                        i = ((iM55680 ^ i5) * 18339) ^ 1141369811;
                        i2 = 1788978666;
                    } else {
                        iM55680 = C0946.m55979("ܺܰ") ^ i4;
                        i = ((iM55680 ^ i5) * 1637) ^ 1798173747;
                        i2 = -688193201;
                    }
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case 638849869:
                case 956879562:
                    s = sArr2[106];
                    s2 = 14772;
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ᩳۨ") ^ i5;
                        i = ((iM55680 ^ i4) * (-519)) ^ 1837151987;
                        i2 = -1712206839;
                    } else {
                        iM55680 = C0873.m55680("ܶۤ") ^ i4;
                        i = ((iM55680 ^ i5) * (-30971)) ^ 140565418;
                        i2 = 1810947583;
                    }
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case 793434375:
                case 878681818:
                    if (C0947.f81895) {
                        iM55979 = (i5 - C0873.m55680("֫᩸")) * 29;
                        i = ((iM55979 ^ i4) * (-30457)) ^ (-637852082);
                        i3 = 211846310;
                        i7 = iM55979 ^ i3;
                        i6 = i;
                    }
                    iM55680 = C0873.m55680("֫֨") ^ i4;
                    i = ((iM55680 ^ i5) * 21881) ^ (-1862205029);
                    i2 = -1853432397;
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case 794782047:
                case 1744643474:
                    return z2;
                case 891108101:
                case 2043291411:
                    z2 = true;
                    z2 = true;
                    if (str2 != null) {
                        iM55979 = C0946.m55979("ۢܳ") ^ i4;
                        i = ((iM55979 ^ i5) * (-23505)) ^ (-857027746);
                        i3 = -1719602734;
                    } else {
                        iM55979 = (C0873.m55680("ۡ᩸") ^ i5) * (-101);
                        i = ((iM55979 ^ i4) * 30279) ^ 858483553;
                        i3 = 1202034175;
                    }
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case 1136420858:
                case 2131367757:
                    int i16 = i14 + i11;
                    if ((i16 + i16) - i12 >= 0) {
                        iM55680 = C0946.m55979("᩶᩻") ^ i5;
                        i = ((iM55680 ^ i4) * (-3323)) ^ 1904895064;
                        i2 = -640801728;
                    } else {
                        iM55680 = C0946.m55979("۟ۗ") ^ i4;
                        i = ((iM55680 ^ i5) * 14713) ^ 2035259312;
                        i2 = -2134408757;
                    }
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case 1411558214:
                case 1852988798:
                    cM55871 = C0927.m55870(str2, C0927.m55878(str) - (z2 ? 1 : 0));
                    iM55979 = (i5 - C0946.m55979("۫ܳ")) * (-115);
                    i = ((iM55979 ^ i4) * 23903) ^ (-2070028276);
                    i3 = -1948464477;
                    i7 = iM55979 ^ i3;
                    i6 = i;
                    break;
                case 1485019707:
                case 1867568472:
                    C0877.m55696();
                    if (C1929.f83011 != 0) {
                        iM55979 = C0946.m55979("ܺ᩻") ^ i4;
                        i = ((iM55979 ^ i5) * (-6075)) ^ (-1057846569);
                        i3 = -1074025457;
                        i7 = iM55979 ^ i3;
                        i6 = i;
                    }
                    iM55680 = C0873.m55680("֫֨") ^ i4;
                    i = ((iM55680 ^ i5) * 21881) ^ (-1862205029);
                    i2 = -1853432397;
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                case 1746483519:
                case 2035239824:
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("ܺ֫") ^ i5;
                        i = ((iM55680 ^ i4) * (-24513)) ^ (-1969311613);
                        i2 = -230380512;
                    } else {
                        iM55680 = (C0873.m55680("ܿ֡") + i4) * (-99);
                        i = ((iM55680 ^ i5) * 15135) ^ 448329292;
                        i2 = 711309514;
                    }
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
                default:
                    strM56403 = C1229.m56403(sArr, i9, i10, i8);
                    if (C0854.m55595() < 0) {
                        iM55979 = C0873.m55680("᩶ۖ") ^ i4;
                        i = ((iM55979 ^ i5) * 10335) ^ 2065622844;
                        i3 = 1185110325;
                        i7 = iM55979 ^ i3;
                        i6 = i;
                    }
                    iM55680 = C0946.m55979("ܺܰ") ^ i4;
                    i = ((iM55680 ^ i5) * 1637) ^ 1798173747;
                    i2 = -688193201;
                    i7 = iM55680 ^ i2;
                    str2 = str;
                    i6 = i;
                    break;
            }
        }
    }

    @Override // bin.p000mt.plugin.api.PluginContext
    public final void log(String str) {
        String str2 = this.f34933;
        C21862 c21862 = C16907.f50058;
        synchronized (C16907.class) {
            C16907.m38471(str2, str);
        }
    }
}
