package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵ᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C21053 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۧ۠֫, reason: not valid java name and contains not printable characters */
    private static final short[] f82956;

    /* JADX INFO: renamed from: ۜ */
    public final PackageManager f66096;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ int f66097;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ViewOnClickListenerC4308 f66098;

    /* JADX INFO: renamed from: ܳ */
    public C21089 f66099;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f66100;

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f66101;

    static {
        ApplicationC14266.m56479(143);
        f82956 = new short[]{4332, -15769, -15767, -15769, -15761, -15746, -15763, -15775, -15773, -15840, -15761, -15776, -15766, -15748, -15775, -15769, -15766, -15840, -15746, -15765, -15748, -15773, -15769, -15747, -15747, -15769, -15775, -15776, -15840, -15799, -15797, -15782, -15791, -15801, -15808, -15779, -15782, -15793, -15806, -15806, -15797, -15798, -15791, -15793, -15778, -15778, -15779, -16833, 21001, 22331, 23052, 17350, -18438, -29328, 23081, -23680, 20562, -25641, -19299, -22492, 19750, 24458};
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public native void mo3403(Exception exc);

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ViewOnClickListenerC4308 viewOnClickListenerC4308 = null;
        C5629 c5629 = null;
        C14102 c14102 = null;
        boolean z = false;
        C5629 c56210 = null;
        C14102 c14103 = null;
        C21089 c21089 = null;
        int i = 1128880764;
        int i2 = C0898.f81858;
        int i3 = C1012.f81938;
        int iM55979 = C0946.m55979("ܺ֨") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-665)) ^ 1750268122;
        int i5 = -516923952;
        while (true) {
            i = ((((i ^ i2) * (-3105)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1979097687:
                case 1251968308:
                    C0930.m55885();
                    C1044.m56286();
                    iM55979 = C0946.m55979("ۚ᩹") ^ i2;
                    i4 = ((iM55979 ^ i3) * 23237) ^ (-1615602942);
                    i5 = 1183767115;
                    break;
                case -1968612981:
                case 1899212482:
                    C0863.m55643();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("۠֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12909)) ^ (-1206981579);
                        i5 = -1549234835;
                    } else {
                        iM55979 = C0873.m55680("ᩴۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27113)) ^ 1993860537;
                        i5 = -628930523;
                    }
                    break;
                case -1839433636:
                case 1936084431:
                    C0894.m55763(c21089);
                    iM55979 = (i3 - C0946.m55979("ܿۗ")) * (-15);
                    i4 = ((iM55979 ^ i2) * (-19447)) ^ 1412258030;
                    i5 = 1703063312;
                    break;
                case -1713527339:
                case 1339174717:
                    c14103.m32018(z);
                    c21089 = this.f66099;
                    if (c21089 != null) {
                        iM55979 = (C0946.m55979("ܰۤ") ^ i2) * (-23);
                        i4 = ((iM55979 ^ i3) * 9651) ^ 192733199;
                        i5 = -1370235264;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܿۗ")) * (-15);
                        i4 = ((iM55979 ^ i2) * (-19447)) ^ 1412258030;
                        i5 = 1703063312;
                    }
                    break;
                case -1577676478:
                case 381422724:
                    C1003.m56123();
                    if (C1003.f81929 > 0) {
                        iM55979 = C0873.m55680("ᩴۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27113)) ^ 1993860537;
                        i5 = -628930523;
                    } else {
                        iM55979 = C0946.m55979("ۗ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    }
                    break;
                case -1446595520:
                case -1116016787:
                    c14102.m32018(z);
                    c56210 = viewOnClickListenerC4308.f9598;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("۠֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12909)) ^ (-1206981579);
                        i5 = -1549234835;
                    } else {
                        iM55979 = C0946.m55979("֫ۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9177)) ^ 618121685;
                        i5 = 1859616075;
                    }
                    break;
                case -1351041042:
                case 1411703638:
                    viewOnClickListenerC4308 = this.f66098;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("ᩴۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27113)) ^ 1993860537;
                        i5 = -628930523;
                    } else {
                        iM55979 = C0873.m55680("᩹۫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6707)) ^ 296470079;
                        i5 = 1333348386;
                    }
                    break;
                case -1111899240:
                case -137677995:
                    c14102 = c5629.f13644;
                    z = false;
                    if (C1964.m56597() != 0) {
                        iM55979 = (C0873.m55680("ᩴᩴ") ^ i2) * 27;
                        i4 = ((iM55979 ^ i3) * (-14513)) ^ 1211073049;
                        i5 = -1753803686;
                    } else {
                        iM55979 = C0873.m55680("᩸ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 7605) ^ (-1353722883);
                        i5 = -1241656363;
                    }
                    break;
                case -1053731722:
                case 106862496:
                    viewOnClickListenerC4308.f9595 = false;
                    viewOnClickListenerC4308.m8823();
                    break;
                case -1039165244:
                case 1902592445:
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("۠֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12909)) ^ (-1206981579);
                        i5 = -1549234835;
                    } else {
                        iM55979 = C0946.m55979("֨ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8543)) ^ 901675409;
                        i5 = 1018322267;
                    }
                    break;
                case -876439082:
                case -693534783:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0946.m55979("ۗ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    } else {
                        iM55979 = (C0873.m55680("ܺ᩺") + i3) * (-67);
                        i4 = ((iM55979 ^ i2) * (-15921)) ^ 881680800;
                        i5 = -1301339065;
                    }
                    break;
                case -771459835:
                case 1529694724:
                    C0892.m55749();
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("ۗ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    } else {
                        iM55979 = C0946.m55979("ۚ᩹") ^ i2;
                        i4 = ((iM55979 ^ i3) * 23237) ^ (-1615602942);
                        i5 = 1183767115;
                    }
                    break;
                case -607940369:
                case 2131287886:
                    c14103 = c56210.f13644;
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("ۗ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    } else {
                        iM55979 = (C0946.m55979("ܺ᩹") + i2) * 115;
                        i4 = ((iM55979 ^ i3) * (-19395)) ^ (-1569050575);
                        i5 = -1676530984;
                    }
                    break;
                case -96224849:
                case 688238927:
                    c5629 = viewOnClickListenerC4308.f9605;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ۗ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    } else {
                        iM55979 = (C0873.m55680("ۢ֨") + i3) * (-115);
                        i4 = ((iM55979 ^ i2) * 8173) ^ (-866108789);
                        i5 = 1353947651;
                    }
                    break;
                case 347773011:
                case 684084225:
                    if (C0892.f81851) {
                        iM55979 = (C0873.m55680("᩸۟") + i2) * (-49);
                        i4 = ((iM55979 ^ i3) * (-11267)) ^ 2053353468;
                        i5 = 796616124;
                    } else {
                        iM55979 = (C0873.m55680("ᩴᩴ") ^ i2) * 27;
                        i4 = ((iM55979 ^ i3) * (-14513)) ^ 1211073049;
                        i5 = -1753803686;
                    }
                    break;
                case 360014349:
                case 1207858296:
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0873.m55680("ᩴᩴ") ^ i2) * 27;
                        i4 = ((iM55979 ^ i3) * (-14513)) ^ 1211073049;
                        i5 = -1753803686;
                    } else {
                        iM55979 = C0873.m55680("۟᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15613) ^ 2120584807;
                        i5 = -1582420990;
                    }
                    break;
                case 1309291356:
                case 1857730597:
                    C0861.m55626();
                    break;
                default:
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("ۗ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    } else {
                        iM55979 = C0873.m55680("ۡۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 27781) ^ 1863337679;
                        i5 = -1018805754;
                    }
                    break;
            }
            return;
        }
    }

    public C21053(ViewOnClickListenerC4308 viewOnClickListenerC4308, int i) {
        int i2 = 1346903155;
        int i3 = C0906.f81862;
        int i4 = C1003.f81929;
        this.f66098 = viewOnClickListenerC4308;
        this.f66097 = i;
        int iM55680 = (C0873.m55680("֫۬") + i4) * (-41);
        int i5 = ((iM55680 ^ i3) * (-6327)) ^ (-1537630671);
        int i6 = -857165150;
        while (true) {
            i2 = ((((i2 ^ i3) * 14179) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -1829848862:
                case -405774423:
                    this.f66100 = true;
                    return;
                case -1560995358:
                case 1273170394:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("᩻ᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-27137)) ^ (-834329129);
                        i6 = 1904937407;
                    } else {
                        iM55680 = C0946.m55979("֡ۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-20505)) ^ 1216891373;
                        i6 = 1549669579;
                    }
                    break;
                case -1452577329:
                case -1350261140:
                    if (C0873.f81841 > 0) {
                        iM55680 = (i3 - C0946.m55979("᩺۠")) * 75;
                        i5 = ((iM55680 ^ i4) * (-17179)) ^ 2021259703;
                        i6 = -151203876;
                    } else {
                        iM55680 = (C0873.m55680("ᩴۛ") ^ i4) * 93;
                        i5 = ((iM55680 ^ i3) * (-11791)) ^ (-1823879764);
                        i6 = -710305797;
                    }
                    break;
                case -1335481557:
                case 159558823:
                    C0861.m55626();
                    if (!C0882.f81846) {
                        iM55680 = C0946.m55979("᩻ᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-27137)) ^ (-834329129);
                        i6 = 1904937407;
                    } else {
                        iM55680 = (C0873.m55680("ᩴۛ") ^ i4) * 93;
                        i5 = ((iM55680 ^ i3) * (-11791)) ^ (-1823879764);
                        i6 = -710305797;
                    }
                    break;
                case -974030340:
                case 1406949896:
                    C1003.m56123();
                    iM55680 = C0946.m55979("᩻ᩳ") ^ i3;
                    i5 = ((iM55680 ^ i4) * (-27137)) ^ (-834329129);
                    i6 = 1904937407;
                    break;
                case -609093363:
                case 1142909351:
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0873.m55680("ᩴۛ") ^ i4) * 93;
                        i5 = ((iM55680 ^ i3) * (-11791)) ^ (-1823879764);
                        i6 = -710305797;
                    } else {
                        iM55680 = C0946.m55979("ۜܳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 21441) ^ 1595772772;
                        i6 = 1055048053;
                    }
                    break;
                case -561975092:
                case -350362114:
                    C0873.m55678();
                    throw new RuntimeException();
                case -212461690:
                case 2024593160:
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("᩵ܶ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 9481) ^ 1699384414;
                        i6 = 1461635939;
                    } else {
                        iM55680 = (C0873.m55680("ܽܰ") ^ i4) * (-119);
                        i5 = ((iM55680 ^ i3) * 29593) ^ (-858757901);
                        i6 = 1804171953;
                    }
                    break;
                case -132823511:
                case 210281029:
                    C0882.m55710();
                    if (RunnableC0938.f81886 < 0) {
                        iM55680 = C0946.m55979("᩸ۗ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-13391)) ^ 11094015;
                        i6 = -1912683173;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩺۠")) * 75;
                        i5 = ((iM55680 ^ i4) * (-17179)) ^ 2021259703;
                        i6 = -151203876;
                    }
                    break;
                case -106663078:
                case 1489400574:
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("᩵ܶ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 9481) ^ 1699384414;
                        i6 = 1461635939;
                    } else {
                        iM55680 = C0873.m55680("۠ܿ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-237)) ^ 230920407;
                        i6 = -1333784151;
                    }
                    break;
                case 356429114:
                case 479937226:
                    if (C0967.m56074()) {
                        iM55680 = C0946.m55979("᩸ۗ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-13391)) ^ 11094015;
                        i6 = -1912683173;
                    } else {
                        iM55680 = C0873.m55680("ۡۙ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 15681) ^ 195782691;
                        i6 = 234714065;
                    }
                    break;
                case 478115614:
                case 529038301:
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0946.m55979("ۤ۫") ^ i4) * (-67);
                        i5 = ((iM55680 ^ i3) * 11209) ^ 548305074;
                        i6 = -1104323372;
                    } else {
                        iM55680 = C0946.m55979("᩸ۗ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-13391)) ^ 11094015;
                        i6 = -1912683173;
                    }
                    break;
                case 584008652:
                case 1037840499:
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0946.m55979("᩻ᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-27137)) ^ (-834329129);
                        i6 = 1904937407;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩵ܳ")) * (-117);
                        i5 = ((iM55680 ^ i4) * (-2015)) ^ (-1619422980);
                        i6 = 767831626;
                    }
                    break;
                case 750236363:
                case 1867424034:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("ᩴۛ") ^ i4) * 93;
                        i5 = ((iM55680 ^ i3) * (-11791)) ^ (-1823879764);
                        i6 = -710305797;
                    } else {
                        iM55680 = C0873.m55680("᩻ܳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-31023)) ^ (-580047372);
                        i6 = -1916483073;
                    }
                    break;
                case 800771589:
                case 1409211390:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("᩻ᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-27137)) ^ (-834329129);
                        i6 = 1904937407;
                    } else {
                        iM55680 = (C0873.m55680("ۡ֫") + i4) * (-63);
                        i5 = ((iM55680 ^ i3) * 5729) ^ 1681960445;
                        i6 = -617927636;
                    }
                    break;
                default:
                    this.f66096 = viewOnClickListenerC4308.getPackageManager();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0873.m55680("ᩴۛ") ^ i4) * 93;
                        i5 = ((iM55680 ^ i3) * (-11791)) ^ (-1823879764);
                        i6 = -710305797;
                    } else {
                        iM55680 = C0873.m55680("ۧ᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-25141)) ^ 704291700;
                        i6 = 248388311;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ViewOnClickListenerC4308 viewOnClickListenerC4308 = null;
        C5629 c5629 = null;
        C14102 c14102 = null;
        boolean z = false;
        C5629 c56210 = null;
        int i = -191841447;
        int i2 = C0866.f81837;
        int i3 = C1036.f81953;
        int iM55680 = (i2 - C0873.m55680("ۢۜ")) * 11;
        int i4 = ((iM55680 ^ i3) * (-2203)) ^ 161909860;
        int i5 = -1180053335;
        while (true) {
            i = ((((i ^ i3) * 11531) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1628312107:
                case -943184226:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("ۘ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30207)) ^ 1702325422;
                        i5 = -805774693;
                    } else {
                        iM55680 = C0873.m55680("ۡ᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31799) ^ (-200070023);
                        i5 = -256602211;
                    }
                    break;
                case -1463095532:
                case 1669013735:
                    c14102.m32018(z);
                    c56210 = viewOnClickListenerC4308.f9598;
                    if (C0854.f81826 != 0) {
                        iM55680 = (C0873.m55680("ۨۖ") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * (-24185)) ^ (-1533925665);
                        i5 = 642371781;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۤۛ")) * (-53);
                        i4 = ((iM55680 ^ i3) * 23347) ^ (-1249269857);
                        i5 = -1187611829;
                    }
                    break;
                case -1391293537:
                case 1355220837:
                    c5629 = viewOnClickListenerC4308.f9605;
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("ۘ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30207)) ^ 1702325422;
                        i5 = -805774693;
                    } else {
                        iM55680 = C0946.m55979("᩹ۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 16879) ^ (-1727381681);
                        i5 = -1230583862;
                    }
                    break;
                case -1025460891:
                case -1007486794:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0873.m55680("ۨ᩻") + i3) * (-95);
                        i4 = ((iM55680 ^ i2) * (-31739)) ^ (-730184737);
                        i5 = -1783154135;
                    } else {
                        iM55680 = (C0946.m55979("ۚۜ") ^ i2) * 79;
                        i4 = ((iM55680 ^ i3) * 9301) ^ 1981857513;
                        i5 = 1158249178;
                    }
                    break;
                case -993241906:
                case 723330592:
                    C0917.m55854();
                    iM55680 = C0946.m55979("ۘ֨") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-30207)) ^ 1702325422;
                    i5 = -805774693;
                    break;
                case -991122047:
                case 1511660041:
                    if (C1048.m56305() >= 0) {
                        iM55680 = (C0873.m55680("ۨۖ") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * (-24185)) ^ (-1533925665);
                        i5 = 642371781;
                    } else {
                        iM55680 = C0946.m55979("ܰܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-23205)) ^ 1935272318;
                        i5 = -1400628428;
                    }
                    break;
                case -909860172:
                case 1628991093:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("ۘ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30207)) ^ 1702325422;
                        i5 = -805774693;
                    } else {
                        iM55680 = C0946.m55979("ۧܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 8911) ^ (-1508026660);
                        i5 = -838935283;
                    }
                    break;
                case -408768657:
                case 1825421771:
                    if (C0906.m55809() <= 0) {
                        iM55680 = (C0873.m55680("ۨ᩻") + i3) * (-95);
                        i4 = ((iM55680 ^ i2) * (-31739)) ^ (-730184737);
                        i5 = -1783154135;
                    } else {
                        iM55680 = (C0946.m55979("۟᩵") + i2) * (-49);
                        i4 = ((iM55680 ^ i3) * 25837) ^ (-413064887);
                        i5 = -1997666638;
                    }
                    break;
                case -569194:
                case 171096442:
                    if (C0930.m55885() <= 0) {
                        iM55680 = (C0873.m55680("ۨ᩻") + i3) * (-95);
                        i4 = ((iM55680 ^ i2) * (-31739)) ^ (-730184737);
                        i5 = -1783154135;
                    } else {
                        iM55680 = (C0946.m55979("ܰۛ") ^ i2) * 81;
                        i4 = ((iM55680 ^ i3) * (-8465)) ^ 232049673;
                        i5 = -896737459;
                    }
                    break;
                case 282809672:
                case 517168160:
                    C0854.m55595();
                    break;
                case 317048219:
                case 1940368183:
                    C0937.m55918();
                    if (AbstractC0942.f81890 > 0) {
                        iM55680 = (C0873.m55680("ۨۖ") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * (-24185)) ^ (-1533925665);
                        i5 = 642371781;
                    } else {
                        iM55680 = C0946.m55979("ۘ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30207)) ^ 1702325422;
                        i5 = -805774693;
                    }
                    break;
                case 328886804:
                case 1127138420:
                    if (C0861.f81831) {
                        iM55680 = (i3 - C0873.m55680("ۢ᩹")) * 13;
                        i4 = ((iM55680 ^ i2) * (-16813)) ^ 2042863379;
                        i5 = -1286703012;
                    } else {
                        iM55680 = (C0873.m55680("ۨ᩻") + i3) * (-95);
                        i4 = ((iM55680 ^ i2) * (-31739)) ^ (-730184737);
                        i5 = -1783154135;
                    }
                    break;
                case 374818352:
                case 1476328491:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("ۨۖ") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * (-24185)) ^ (-1533925665);
                        i5 = 642371781;
                    } else {
                        iM55680 = C0873.m55680("ᩳۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-21705)) ^ (-1047131186);
                        i5 = -860223805;
                    }
                    break;
                case 802351882:
                case 881604000:
                    viewOnClickListenerC4308 = this.f66098;
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0873.m55680("ۨۖ") + i3) * 123;
                        i4 = ((iM55680 ^ i2) * (-24185)) ^ (-1533925665);
                        i5 = 642371781;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֡ۤ")) * 87;
                        i4 = ((iM55680 ^ i2) * 28507) ^ 681413579;
                        i5 = -1856576751;
                    }
                    break;
                case 1254624744:
                case 1346820702:
                    c14102 = c5629.f13644;
                    z = true;
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("ۨ᩻") + i3) * (-95);
                        i4 = ((iM55680 ^ i2) * (-31739)) ^ (-730184737);
                        i5 = -1783154135;
                    } else {
                        iM55680 = C0946.m55979("۬ܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12841) ^ 711051371;
                        i5 = -2053579972;
                    }
                    break;
                default:
                    c56210.f13644.m32018(z);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0125 A[PHI: r4 r6 r7
      0x0125: PHI (r4v4 java.util.Iterator) = (r4v2 java.util.Iterator), (r4v2 java.util.Iterator), (r4v2 java.util.Iterator), (r4v5 java.util.Iterator) binds: [B:27:0x008e, B:24:0x006d, B:22:0x0063, B:6:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r6v6 android.content.pm.PackageInfo) = 
      (r6v4 android.content.pm.PackageInfo)
      (r6v2 android.content.pm.PackageInfo)
      (r6v2 android.content.pm.PackageInfo)
      (r6v2 android.content.pm.PackageInfo)
     binds: [B:27:0x008e, B:24:0x006d, B:22:0x0063, B:6:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r7v5 android.content.pm.ApplicationInfo) = 
      (r7v3 android.content.pm.ApplicationInfo)
      (r7v2 android.content.pm.ApplicationInfo)
      (r7v2 android.content.pm.ApplicationInfo)
      (r7v2 android.content.pm.ApplicationInfo)
     binds: [B:27:0x008e, B:24:0x006d, B:22:0x0063, B:6:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x019c A[PHI: r1 r5 r13
      0x019c: PHI (r1v4 int) = (r1v3 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int) binds: [B:56:0x019a, B:48:0x0149, B:36:0x00d8, B:16:0x004d, B:14:0x0049, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r5v5 l.ܶۡ᩷) = (r5v2 l.ܶۡ᩷), (r5v2 l.ܶۡ᩷), (r5v4 l.ܶۡ᩷), (r5v2 l.ܶۡ᩷), (r5v2 l.ܶۡ᩷), (r5v2 l.ܶۡ᩷) binds: [B:56:0x019a, B:48:0x0149, B:36:0x00d8, B:16:0x004d, B:14:0x0049, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x019c: PHI (r13v8 java.util.ArrayList) = 
      (r13v4 java.util.ArrayList)
      (r13v7 java.util.ArrayList)
      (r13v4 java.util.ArrayList)
      (r13v4 java.util.ArrayList)
      (r13v4 java.util.ArrayList)
      (r13v4 java.util.ArrayList)
     binds: [B:56:0x019a, B:48:0x0149, B:36:0x00d8, B:16:0x004d, B:14:0x0049, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0225 A[PHI: r0
      0x0225: PHI (r0v6 android.content.pm.PackageManager) = 
      (r0v5 android.content.pm.PackageManager)
      (r0v2 android.content.pm.PackageManager)
      (r0v2 android.content.pm.PackageManager)
      (r0v2 android.content.pm.PackageManager)
     binds: [B:68:0x0223, B:32:0x00b6, B:14:0x0049, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        int iM55979;
        int i;
        PackageManager packageManager = null;
        int i2 = 0;
        List<PackageInfo> installedPackages = null;
        Iterator itM55925 = null;
        C16752 c16752 = null;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        int i3 = -982612344;
        int i4 = AbstractC0942.f81890;
        int i5 = ServiceConnectionC1013.f81940;
        int iM559710 = C0946.m55979("᩷ۡ") ^ i5;
        int i6 = ((iM559710 ^ i4) * 10363) ^ (-540749999);
        int i7 = 609028986;
        while (true) {
            int i8 = iM559710 ^ i7;
            ArrayList arrayList = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-10361)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1971888082:
                    case 1349023002:
                        RunnableC1014.m56165(c16752);
                        if (C0898.f81858 <= 0) {
                            iM55979 = C0946.m55979("ܶ᩵") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-24823)) ^ (-507624454);
                            i = 1751842751;
                        } else {
                            iM55979 = (C0946.m55979("᩹ۨ") ^ i4) * (-95);
                            i6 = ((iM55979 ^ i5) * (-11417)) ^ (-857094978);
                            i = 1101189900;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1958653090:
                    case -139300833:
                        if (C0866.m55647(itM55925)) {
                            iM55979 = (C0946.m55979("۠ܿ") + i4) * 69;
                            i6 = ((iM55979 ^ i5) * 28041) ^ 2004540980;
                            i = -59810536;
                        } else {
                            iM55979 = (C0873.m55680("ۙۗ") + i4) * (-49);
                            i6 = ((iM55979 ^ i5) * 27883) ^ (-1789468544);
                            i = 1868605628;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1767572352:
                    case -1063389350:
                        this.f66099 = C5665.m12618(C11164.m25771());
                        break;
                    case -1604628750:
                    case -719033684:
                        packageInfo = (PackageInfo) C0955.m56035(itM55925);
                        applicationInfo = packageInfo.applicationInfo;
                        if (applicationInfo != null) {
                            iM55979 = (C0873.m55680("ᩴܶ") ^ i5) * (-45);
                            i6 = ((iM55979 ^ i4) * 14807) ^ (-1895362302);
                            i = 95547039;
                        } else {
                            iM55979 = C0873.m55680("۫۟") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-16399)) ^ (-697676170);
                            i = 457529403;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1436994074:
                    case 1120271909:
                        ServiceConnectionC1013.m56157();
                        if (C1003.f81929 <= 0) {
                            iM55979 = C0946.m55979("ܶ᩵") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-24823)) ^ (-507624454);
                            i = 1751842751;
                        } else {
                            iM55979 = C0873.m55680("ۜ۟") ^ i5;
                            i6 = ((iM55979 ^ i4) * 26795) ^ (-1851361128);
                            i = -394814850;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1042496171:
                    case 1052805571:
                        C0989.m56095();
                        iM55979 = C0873.m55680("ܿۗ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 14683) ^ 1241873454;
                        i = -320112714;
                        i8 = iM55979 ^ i;
                        break;
                    case -927349440:
                    case 1391686130:
                        packageManager = this.f66096;
                        if (C0845.f81821 >= 0) {
                            iM55979 = C0946.m55979("ܶ᩵") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-24823)) ^ (-507624454);
                            i = 1751842751;
                        } else {
                            iM55979 = C0946.m55979("ۚۗ") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-16487)) ^ 1174014194;
                            i = 1829077913;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -441075253:
                    case 1001379623:
                        if (C0967.m56074()) {
                            iM55979 = C0873.m55680("ۜ۟") ^ i5;
                            i6 = ((iM55979 ^ i4) * 26795) ^ (-1851361128);
                            i = -394814850;
                        } else {
                            iM55979 = C0873.m55680("ܰ᩹") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-29803)) ^ (-212664078);
                            i = -1281219172;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -414572452:
                    case 1727603023:
                        if (C1003.f81929 <= 0) {
                            iM55979 = C0873.m55680("ܿۗ") ^ i5;
                            i6 = ((iM55979 ^ i4) * 14683) ^ 1241873454;
                            i = -320112714;
                        } else {
                            iM55979 = (i5 - C0946.m55979("ۧ۬")) * (-73);
                            i6 = ((iM55979 ^ i4) * (-16287)) ^ (-1413232419);
                            i = 793771640;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -240442384:
                    case 1307223907:
                        i2 = 0;
                        if (C1124.f82007 >= 0) {
                            iM55979 = C0873.m55680("ܿۗ") ^ i5;
                            i6 = ((iM55979 ^ i4) * 14683) ^ 1241873454;
                            i = -320112714;
                        } else {
                            iM55979 = (C0873.m55680("֫ᩳ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i6 = ((iM55979 ^ i5) * (-27111)) ^ (-1518430187);
                            i = -1929592165;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case 1861054:
                    case 1564732153:
                        C1404.m56468();
                        C0946.m55980();
                        break;
                    case 75543693:
                    case 319199685:
                        C1046.m56302();
                        if (AbstractC0942.f81890 > 0) {
                            iM55979 = C0873.m55680("ܿۗ") ^ i5;
                            i6 = ((iM55979 ^ i4) * 14683) ^ 1241873454;
                            i = -320112714;
                        } else {
                            iM55979 = C0946.m55979("ܶ᩵") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-24823)) ^ (-507624454);
                            i = 1751842751;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case 77748648:
                    case 1564880809:
                        if (applicationInfo.sourceDir != null) {
                            iM55979 = (i4 - C0873.m55680("ۙۖ")) * (-71);
                            i6 = ((iM55979 ^ i5) * 25959) ^ 1271738241;
                            i = -2017377252;
                        } else {
                            iM55979 = C0873.m55680("۫۟") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-16399)) ^ (-697676170);
                            i = 457529403;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case 85157416:
                    case 1217349923:
                        int iM55989 = C0947.m55989(installedPackages);
                        if (!C0861.f81831) {
                        }
                        arrayList = new ArrayList(iM55989);
                        if (C0873.f81841 <= 0) {
                            iM55979 = C0873.m55680("ܿۗ") ^ i5;
                            i6 = ((iM55979 ^ i4) * 14683) ^ 1241873454;
                            i = -320112714;
                        } else {
                            iM55979 = (C0946.m55979("ᩴ᩻") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((iM55979 ^ i5) * (-26737)) ^ (-1390935890);
                            i = 643761439;
                        }
                        i8 = iM55979 ^ i;
                        break;
                        break;
                    case 105922451:
                    case 2021768742:
                        c16752 = (C16752) C23770.m52834();
                        if (C1046.f81962 <= 0) {
                            iM55979 = C0873.m55680("ܿۗ") ^ i5;
                            i6 = ((iM55979 ^ i4) * 14683) ^ 1241873454;
                            i = -320112714;
                        } else {
                            iM55979 = (i5 - C0873.m55680("ۜ۫")) * 71;
                            i6 = ((iM55979 ^ i4) * (-21079)) ^ 538085808;
                            i = 855592265;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case 390037525:
                    case 1599416741:
                        if (C1124.f82007 >= 0) {
                            iM55979 = (i5 - C0946.m55979("ۧ۬")) * (-73);
                            i6 = ((iM55979 ^ i4) * (-16287)) ^ (-1413232419);
                            i = 793771640;
                        } else {
                            iM55979 = C0946.m55979("ᩴᩳ") ^ i5;
                            i6 = ((iM55979 ^ i4) * 12407) ^ (-135976569);
                            i = -1591862164;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case 414655422:
                    case 1413181926:
                        installedPackages = packageManager.getInstalledPackages(i2);
                        C11164.m25768();
                        if (C1929.f83011 == 0) {
                            iM55979 = (C0946.m55979("᩺ۢ") + i5) * (-15);
                            i6 = ((iM55979 ^ i4) * (-18831)) ^ 1288037088;
                            i = 1439127227;
                            i8 = iM55979 ^ i;
                        }
                        break;
                    case 1691002753:
                    case 1898951594:
                        ArrayList arrayList2 = this.f66101;
                        if (RunnableC0871.f81839 >= 0) {
                            iM55979 = (i5 - C0946.m55979("ۧ۬")) * (-73);
                            i6 = ((iM55979 ^ i4) * (-16287)) ^ (-1413232419);
                            i = 793771640;
                        } else {
                            C0937.m55917(arrayList2, new C6970(packageInfo));
                            iM55979 = C0873.m55680("۫۟") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-16399)) ^ (-697676170);
                            i = 457529403;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    default:
                        this.f66101 = arrayList;
                        itM55925 = RunnableC0938.m55925(installedPackages);
                        iM55979 = C0873.m55680("۫۟") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-16399)) ^ (-697676170);
                        i = 457529403;
                        i8 = iM55979 ^ i;
                        break;
                }
                return;
            }
            iM559710 = C0873.m55680("ۚۖ") ^ i4;
            i6 = ((iM559710 ^ i5) * 10219) ^ (-701951210);
            i7 = 810776048;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x03a2 A[PHI: r4 r5 r6 r9 r11 r19 r27 r29
      0x03a2: PHI (r4v30 l.᩵֡ᩴ) = (r4v19 l.᩵֡ᩴ), (r4v20 l.᩵֡ᩴ), (r4v31 l.᩵֡ᩴ) binds: [B:76:0x03a0, B:71:0x035e, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x03a2: PHI (r5v4 boolean) = (r5v3 boolean), (r5v2 boolean), (r5v2 boolean) binds: [B:76:0x03a0, B:71:0x035e, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x03a2: PHI (r6v4 ??) = (r6v3 ??), (r6v17 ??), (r6v18 ??) binds: [B:76:0x03a0, B:71:0x035e, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x03a2: PHI (r9v4 java.util.concurrent.ExecutorService) = 
      (r9v2 java.util.concurrent.ExecutorService)
      (r9v3 java.util.concurrent.ExecutorService)
      (r9v2 java.util.concurrent.ExecutorService)
     binds: [B:76:0x03a0, B:71:0x035e, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x03a2: PHI (r11v22 l.᩵֡ᩴ) = (r11v16 l.᩵֡ᩴ), (r11v17 l.᩵֡ᩴ), (r11v23 l.᩵֡ᩴ) binds: [B:76:0x03a0, B:71:0x035e, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x03a2: PHI (r19v4 java.lang.String) = (r19v2 java.lang.String), (r19v2 java.lang.String), (r19v5 java.lang.String) binds: [B:76:0x03a0, B:71:0x035e, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x03a2: PHI (r27v14 java.lang.String) = (r27v11 java.lang.String), (r27v12 java.lang.String), (r27v15 java.lang.String) binds: [B:76:0x03a0, B:71:0x035e, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x03a2: PHI (r29v13 l.᩵ۚۢ) = (r29v7 l.᩵ۚۢ), (r29v8 l.᩵ۚۢ), (r29v14 l.᩵ۚۢ) binds: [B:76:0x03a0, B:71:0x035e, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int iM55682;
        int i4;
        int i5;
        ?? r6;
        int iM55979;
        int i6;
        int i7;
        ?? r7;
        C20539 c20539;
        C20539 c205310;
        int i8;
        final C21053 c21053 = this;
        int i9 = C0949.f81897;
        int i10 = C1046.f81962;
        int iM55683 = C0873.m55680("᩸᩸") ^ i9;
        int i11 = ((iM55683 ^ i10) * (-7441)) ^ (-121749478);
        C20539 c20539M12511 = null;
        C20539 c20539M12512 = null;
        DialogInterfaceOnClickListenerC20382 dialogInterfaceOnClickListenerC20382 = null;
        String strM55970 = null;
        String strM55750 = null;
        int i12 = iM55683 ^ (-157777168);
        ViewOnClickListenerC4308 viewOnClickListenerC4308 = null;
        int i13 = 0;
        boolean z = false;
        int iM55684 = 0;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = -215442019;
        DialogInterface.OnClickListener onClickListener = null;
        String strM55689 = null;
        int iM559710 = 0;
        C20671 c20671M55888 = null;
        String strM56016 = null;
        InterfaceC14100 interfaceC14100 = null;
        ExecutorService executorService = null;
        C21723 c21723 = null;
        String str = null;
        ?? r8 = 0;
        while (true) {
            i16 = i12 ^ (i11 & (((i16 ^ i10) * 28219) >> 31));
            switch (i16) {
                case -2120700344:
                case -1090225748:
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    viewOnClickListenerC4308 = c21053.f66098;
                    c20539M12511 = viewOnClickListenerC4308.f9605.m12511(c21053.f66101);
                    c20539M12512 = viewOnClickListenerC4308.f9598.m12511(c21053.f66101);
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0946.m55979("֨ۤ") ^ i9;
                        i = ((iM55680 ^ i10) * 10641) ^ (-108541020);
                        i2 = -289755804;
                    } else {
                        iM55680 = C0946.m55979("ܰ᩹") ^ i10;
                        i = ((iM55680 ^ i9) * 3963) ^ 772550440;
                        i2 = 1688410101;
                    }
                    i8 = iM55680 ^ i2;
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    i12 = i8;
                    i11 = i;
                    break;
                case -2091938178:
                case 1198166651:
                    i13 = 128;
                    iM55682 = (i10 - C0946.m55979("᩶ۖ")) * 83;
                    i4 = ((iM55682 ^ i9) * 22523) ^ 1871800437;
                    i5 = -1547151731;
                    r7 = r8;
                    int i17 = iM55682 ^ i5;
                    c20539M12511 = c20539M12511;
                    c20539M12512 = c20539M12512;
                    strM56016 = strM56016;
                    i12 = i17;
                    i11 = i4;
                    r8 = r7;
                    c20671M55888 = c20671M55888;
                    break;
                case -1894658821:
                case 1793011195:
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    if (viewOnClickListenerC4308.f9605.f13641.f68413.size() > r8) {
                        strM56016 = strM56016;
                        iM55979 = C0946.m55979("᩶᩺") ^ i9;
                        i6 = ((iM55979 ^ i10) * 19747) ^ 896104428;
                        i7 = -1731041595;
                        i12 = iM55979 ^ i7;
                        i11 = i6;
                        r8 = r8;
                        c20671M55888 = c20671M55888;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ۚ᩸")) * (-113);
                        i = ((iM55680 ^ i10) * 10875) ^ 1693812996;
                        i2 = 679744649;
                        i8 = iM55680 ^ i2;
                        strM56016 = strM56016;
                        c20671M55888 = c20671M55888;
                        i12 = i8;
                        i11 = i;
                    }
                    break;
                case -1797680951:
                case -518655597:
                    i13 = 49678;
                    iM55682 = (i10 - C0946.m55979("᩶ۖ")) * 83;
                    i4 = ((iM55682 ^ i9) * 22523) ^ 1871800437;
                    i5 = -1547151731;
                    r7 = r8;
                    int i18 = iM55682 ^ i5;
                    c20539M12511 = c20539M12511;
                    c20539M12512 = c20539M12512;
                    strM56016 = strM56016;
                    i12 = i18;
                    i11 = i4;
                    r8 = r7;
                    c20671M55888 = c20671M55888;
                    break;
                case -1616018430:
                case -1024300193:
                    strM56016 = strM56016;
                    C0967.m56076(c20671M55888, C0946.m55979(strM55689) ^ 2099429992, null);
                    if (C0949.f81897 < 0) {
                        iM55681 = (C0873.m55680("ܺܰ") + i10) * C0254q.f1218h;
                        i = ((iM55681 ^ i9) * 22677) ^ 1778130044;
                        i3 = 339652213;
                        i8 = iM55681 ^ i3;
                        strM56016 = strM56016;
                        i12 = i8;
                        i11 = i;
                    }
                    c20671M55888 = c20671M55888;
                    iM55680 = (C0946.m55979("ۜۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM55680 ^ i9) * (-16615)) ^ (-445579542);
                    i2 = 1127579538;
                    i8 = iM55680 ^ i2;
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    i12 = i8;
                    i11 = i;
                    break;
                case -1446247814:
                case 326480782:
                    if (C0898.f81858 > 0) {
                        strM56016 = strM56016;
                        c20671M55888 = c20671M55888;
                        c20539M12511 = c20539M12511;
                        c20539M12512 = c20539M12512;
                        r6 = r8;
                        iM55682 = C0946.m55979("۫᩷") ^ i9;
                        i4 = ((iM55682 ^ i10) * 3725) ^ 288021816;
                        i5 = -1385480026;
                        r7 = r6;
                        int i19 = iM55682 ^ i5;
                        c20539M12511 = c20539M12511;
                        c20539M12512 = c20539M12512;
                        strM56016 = strM56016;
                        i12 = i19;
                        i11 = i4;
                        r8 = r7;
                        c20671M55888 = c20671M55888;
                    } else {
                        strM56016 = strM56016;
                        c20539 = c20539M12511;
                        c205310 = c20539M12512;
                        int iM55685 = (C0873.m55680("۠᩵") + i10) * (-49);
                        c20539M12511 = c20539;
                        c20539M12512 = c205310;
                        strM56016 = strM56016;
                        i12 = iM55685 ^ (-2045420647);
                        i11 = ((iM55685 ^ i9) * 24103) ^ (-935814965);
                        c21053 = this;
                    }
                    break;
                case -1324332755:
                case 2000744107:
                    strM56016 = strM56016;
                    if (viewOnClickListenerC4308.f9593) {
                        iM55681 = (C0873.m55680("᩶ܿ") ^ i9) * (-125);
                        i = ((iM55681 ^ i10) * (-9589)) ^ 1462109674;
                        i3 = 702659554;
                    } else {
                        iM55681 = (i10 - C0946.m55979("֫ܽ")) * 59;
                        i = ((iM55681 ^ i9) * 16099) ^ (-1100509107);
                        i3 = -931629847;
                    }
                    i8 = iM55681 ^ i3;
                    strM56016 = strM56016;
                    i12 = i8;
                    i11 = i;
                    break;
                case -1293370416:
                case 967935921:
                    Context applicationContext = viewOnClickListenerC4308.getApplicationContext();
                    c20671M55888 = c20671M55888;
                    strM56016 = C0949.m56016(f82956, 6, 41, i13);
                    if (C0886.m5543(applicationContext, strM56016) != 0) {
                        iM55979 = C0946.m55979("֫ۨ") ^ i9;
                        i6 = ((iM55979 ^ i10) * (-22815)) ^ (-615430374);
                        i7 = 1749447574;
                    } else {
                        iM55979 = C0946.m55979("᩶᩺") ^ i9;
                        i6 = ((iM55979 ^ i10) * 19747) ^ 896104428;
                        i7 = -1731041595;
                    }
                    i12 = iM55979 ^ i7;
                    i11 = i6;
                    r8 = r8;
                    c20671M55888 = c20671M55888;
                    break;
                case -1273420321:
                case 1102389804:
                    C1124.m56363(c20671M55888, C0873.m55680(strM55750) ^ 2125627235, dialogInterfaceOnClickListenerC20382);
                    C1025.m56221(c20671M55888);
                    c20671M55888 = c20671M55888;
                    iM55979 = C0946.m55979("᩶᩺") ^ i9;
                    i6 = ((iM55979 ^ i10) * 19747) ^ 896104428;
                    i7 = -1731041595;
                    i12 = iM55979 ^ i7;
                    i11 = i6;
                    r8 = r8;
                    c20671M55888 = c20671M55888;
                    break;
                case -1247251634:
                case -672352069:
                    strM56016 = strM56016;
                    C0906.m55817(c20671M55888, iM559710 ^ 2117022031, onClickListener);
                    strM55689 = C0873.m55689(f82956, 56, 3, i13);
                    if (!C0892.f81851) {
                        c20671M55888 = c20671M55888;
                        c20539M12511 = c20539M12511;
                        c20539M12512 = c20539M12512;
                        r6 = r8;
                        iM55682 = C0946.m55979("۫᩷") ^ i9;
                        i4 = ((iM55682 ^ i10) * 3725) ^ 288021816;
                        i5 = -1385480026;
                        r7 = r6;
                        int i110 = iM55682 ^ i5;
                        c20539M12511 = c20539M12511;
                        c20539M12512 = c20539M12512;
                        strM56016 = strM56016;
                        i12 = i110;
                        i11 = i4;
                        r8 = r7;
                        c20671M55888 = c20671M55888;
                    } else {
                        iM55681 = C0873.m55680("᩸ۗ") ^ i9;
                        i = ((iM55681 ^ i10) * 477) ^ (-882992645);
                        i3 = 463985702;
                        i8 = iM55681 ^ i3;
                        strM56016 = strM56016;
                        i12 = i8;
                        i11 = i;
                    }
                    break;
                case -1128529571:
                case 1950170220:
                    C1017.m56187();
                    if (!C0927.f81875) {
                        strM56016 = strM56016;
                        c20539 = c20539M12511;
                        c205310 = c20539M12512;
                        int iM55686 = (C0873.m55680("۠᩵") + i10) * (-49);
                        c20539M12511 = c20539;
                        c20539M12512 = c205310;
                        strM56016 = strM56016;
                        i12 = iM55686 ^ (-2045420647);
                        i11 = ((iM55686 ^ i9) * 24103) ^ (-935814965);
                        c21053 = this;
                    } else {
                        strM56016 = strM56016;
                        c20671M55888 = c20671M55888;
                        iM55680 = C0946.m55979("֨ۤ") ^ i9;
                        i = ((iM55680 ^ i10) * 10641) ^ (-108541020);
                        i2 = -289755804;
                        i8 = iM55680 ^ i2;
                        strM56016 = strM56016;
                        c20671M55888 = c20671M55888;
                        i12 = i8;
                        i11 = i;
                    }
                    break;
                case -1111415028:
                case 1682395865:
                    strM56016 = strM56016;
                    C1194.m56390(c20671M55888, C0946.m55979(strM55970) ^ 2102970073);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۘᩴ᩷
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i20) {
                            C21053 c21054 = null;
                            int i21 = -1076034565;
                            int i22 = C1071.f81975;
                            int i23 = ViewOnClickListenerC0939.f81888;
                            int iM559711 = (C0946.m55979("۬᩶") + i22) * 99;
                            int i24 = ((iM559711 ^ i23) * 17663) ^ 886046277;
                            int i25 = -956848787;
                            while (true) {
                                i21 = ((((i21 ^ i23) * 6645) >> 31) & i24) ^ (iM559711 ^ i25);
                                switch (i21) {
                                    case -2035653643:
                                    case 2088015222:
                                        C0866.m55645();
                                        break;
                                    case -1985885255:
                                    case -565190395:
                                        RunnableC1014.m56177();
                                        if (C1194.f82045 == 0) {
                                            iM559711 = C0946.m55979("ۖۚ") ^ i22;
                                            i24 = ((iM559711 ^ i23) * 8445) ^ 284789788;
                                            i25 = 178503027;
                                        } else {
                                            iM559711 = C0873.m55680("ܳ۫") ^ i22;
                                            i24 = ((iM559711 ^ i23) * (-20047)) ^ (-641190212);
                                            i25 = -1609475283;
                                        }
                                        break;
                                    case -1853927350:
                                    case 743179186:
                                        C0863.m55643();
                                        if (RunnableC0938.m55938() != 0) {
                                            iM559711 = (i23 - C0873.m55680("ܺᩴ")) * 123;
                                            i24 = ((iM559711 ^ i22) * 2255) ^ (-1735292003);
                                            i25 = -1293390646;
                                        } else {
                                            iM559711 = C0946.m55979("ۖۚ") ^ i22;
                                            i24 = ((iM559711 ^ i23) * 8445) ^ 284789788;
                                            i25 = 178503027;
                                        }
                                        break;
                                    case -1674706129:
                                    case 1297198949:
                                        if (C0949.f81897 >= 0) {
                                            iM559711 = (i23 - C0873.m55680("ܺᩴ")) * 123;
                                            i24 = ((iM559711 ^ i22) * 2255) ^ (-1735292003);
                                            i25 = -1293390646;
                                        } else {
                                            iM559711 = C0946.m55979("ܰۤ") ^ i23;
                                            i24 = ((iM559711 ^ i22) * (-29401)) ^ (-11949558);
                                            i25 = -2064416841;
                                        }
                                        break;
                                    case -1660223257:
                                    case -811684331:
                                        if (C1025.f81947 >= 0) {
                                            iM559711 = C0873.m55680("ܳ۫") ^ i22;
                                            i24 = ((iM559711 ^ i23) * (-20047)) ^ (-641190212);
                                            i25 = -1609475283;
                                        } else {
                                            iM559711 = C0873.m55680("ۤ᩷") ^ i23;
                                            i24 = ((iM559711 ^ i22) * 29875) ^ 297682806;
                                            i25 = 1246877043;
                                        }
                                        break;
                                    case -1172011677:
                                    case 1757202720:
                                        c21054 = this.f15920;
                                        if (C0967.f81910 >= 0) {
                                            iM559711 = C0873.m55680("᩹֫") ^ i22;
                                            i24 = ((iM559711 ^ i23) * 10847) ^ (-1123328829);
                                            i25 = 183822112;
                                        } else {
                                            iM559711 = (C0873.m55680("֫ۘ") + i22) * (-51);
                                            i24 = ((iM559711 ^ i23) * 23931) ^ (-1436452609);
                                            i25 = 467812850;
                                        }
                                        break;
                                    case -903037429:
                                    case -791658956:
                                        if (C1046.f81962 <= 0) {
                                            iM559711 = C0946.m55979("ۖۚ") ^ i22;
                                            i24 = ((iM559711 ^ i23) * 8445) ^ 284789788;
                                            i25 = 178503027;
                                        } else {
                                            iM559711 = (C0946.m55979("ۡᩴ") + i23) * 71;
                                            i24 = ((iM559711 ^ i22) * 12037) ^ (-1882321411);
                                            i25 = 1050266822;
                                        }
                                        break;
                                    case -329753633:
                                    case -145061726:
                                        C1017.m56187();
                                        C0992.m56107();
                                        iM559711 = C0873.m55680("ܳ۫") ^ i22;
                                        i24 = ((iM559711 ^ i23) * (-20047)) ^ (-641190212);
                                        i25 = -1609475283;
                                        break;
                                    case 52860086:
                                    case 1787652440:
                                        if (C1194.f82045 != 0) {
                                            iM559711 = C0873.m55680("ܳ۫") ^ i22;
                                            i24 = ((iM559711 ^ i23) * (-20047)) ^ (-641190212);
                                            i25 = -1609475283;
                                        } else {
                                            iM559711 = (i23 - C0873.m55680("֡۟")) * 29;
                                            i24 = ((iM559711 ^ i22) * (-7869)) ^ (-564866299);
                                            i25 = -2104637778;
                                        }
                                        break;
                                    case 91801659:
                                    case 2001346561:
                                        if (C1929.f83011 != 0) {
                                            iM559711 = C0946.m55979("֡᩵") ^ i23;
                                            i24 = ((iM559711 ^ i22) * (-49)) ^ 197606928;
                                            i25 = -1199884516;
                                        } else {
                                            iM559711 = C0873.m55680("ۨ۟") ^ i23;
                                            i24 = ((iM559711 ^ i22) * 13153) ^ (-350788350);
                                            i25 = 494613148;
                                        }
                                        break;
                                    case 295833057:
                                    case 1039400563:
                                        if (C0845.m55584() <= 0) {
                                            iM559711 = C0946.m55979("֡᩵") ^ i23;
                                            i24 = ((iM559711 ^ i22) * (-49)) ^ 197606928;
                                            i25 = -1199884516;
                                        } else {
                                            iM559711 = C0946.m55979("ۢۛ") ^ i22;
                                            i24 = ((iM559711 ^ i23) * (-32493)) ^ (-1811840584);
                                            i25 = -1146093026;
                                        }
                                        break;
                                    case 473612366:
                                    case 1401684059:
                                        ViewOnClickListenerC4308 viewOnClickListenerC4309 = c21054.f66098;
                                        viewOnClickListenerC4309.f9594 = true;
                                        C23728.m52763(viewOnClickListenerC4309, viewOnClickListenerC4309.getPackageName());
                                        break;
                                    case 510820695:
                                    case 810855245:
                                        if (C0873.f81841 <= 0) {
                                            iM559711 = C0873.m55680("᩹֫") ^ i22;
                                            i24 = ((iM559711 ^ i23) * 10847) ^ (-1123328829);
                                            i25 = 183822112;
                                        } else {
                                            iM559711 = (i22 - C0873.m55680("֨ܺ")) * (-45);
                                            i24 = ((iM559711 ^ i23) * (-29225)) ^ (-1169517963);
                                            i25 = 843021148;
                                        }
                                        break;
                                    case 1088124069:
                                    case 1566349083:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559711 = C0873.m55680("ܳ۫") ^ i22;
                                            i24 = ((iM559711 ^ i23) * (-20047)) ^ (-641190212);
                                            i25 = -1609475283;
                                        } else {
                                            iM559711 = (C0873.m55680("ܿۤ") + i22) * 49;
                                            i24 = ((iM559711 ^ i23) * (-15499)) ^ 422176160;
                                            i25 = 661675088;
                                        }
                                        break;
                                    case 1230522972:
                                    case 1990707550:
                                        if (C1071.f81975 <= 0) {
                                            iM559711 = C0946.m55979("ۖۚ") ^ i22;
                                            i24 = ((iM559711 ^ i23) * 8445) ^ 284789788;
                                            i25 = 178503027;
                                        } else {
                                            iM559711 = C0873.m55680("ۗۤ") ^ i22;
                                            i24 = ((iM559711 ^ i23) * (-16003)) ^ 2023236876;
                                            i25 = 2078774070;
                                        }
                                        break;
                                    default:
                                        if (C1229.f82066 >= 0) {
                                            iM559711 = C0946.m55979("֡᩵") ^ i23;
                                            i24 = ((iM559711 ^ i22) * (-49)) ^ 197606928;
                                            i25 = -1199884516;
                                        } else {
                                            iM559711 = C0873.m55680("ܳ۫") ^ i22;
                                            i24 = ((iM559711 ^ i23) * (-20047)) ^ (-641190212);
                                            i25 = -1609475283;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    iM55681 = (C0946.m55979("ܽ᩺") ^ i10) * 43;
                    i = ((iM55681 ^ i9) * (-1557)) ^ 724946019;
                    i3 = -1815609718;
                    i8 = iM55681 ^ i3;
                    strM56016 = strM56016;
                    i12 = i8;
                    i11 = i;
                    break;
                case -936112546:
                case 2093768320:
                    strM56016 = strM56016;
                    c20671M55888 = C0930.m55888(viewOnClickListenerC4308);
                    iM55684 = C0873.m55680(C0882.m55717(f82956, 47, 3, i13));
                    i14 = 2130064265;
                    if (AbstractC0942.f81890 > 0) {
                        iM55681 = (C0946.m55979("۟۫") + i10) * 57;
                        i = ((iM55681 ^ i9) * (-2281)) ^ 1727962505;
                        i3 = 214447566;
                        i8 = iM55681 ^ i3;
                        strM56016 = strM56016;
                        i12 = i8;
                        i11 = i;
                    } else {
                        c20539 = c20539M12511;
                        c205310 = c20539M12512;
                        int iM55687 = (C0873.m55680("۠᩵") + i10) * (-49);
                        c20539M12511 = c20539;
                        c20539M12512 = c205310;
                        strM56016 = strM56016;
                        i12 = iM55687 ^ (-2045420647);
                        i11 = ((iM55687 ^ i9) * 24103) ^ (-935814965);
                        c21053 = this;
                    }
                    break;
                case -926616465:
                case 705785931:
                    C1786.m46159(viewOnClickListenerC4308, new String[]{strM56016}, 23680);
                    break;
                case -751408090:
                case 73506150:
                    C0877.m55696();
                    if (C1229.f82066 < 0) {
                        strM56016 = strM56016;
                        c20671M55888 = c20671M55888;
                        iM55680 = (C0946.m55979("ۜۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i9) * (-16615)) ^ (-445579542);
                        i2 = 1127579538;
                        i8 = iM55680 ^ i2;
                        strM56016 = strM56016;
                        c20671M55888 = c20671M55888;
                        i12 = i8;
                        i11 = i;
                    } else {
                        strM56016 = strM56016;
                        c20671M55888 = c20671M55888;
                        c20539M12511 = c20539M12511;
                        c20539M12512 = c20539M12512;
                        r6 = r8;
                        iM55682 = C0946.m55979("۫᩷") ^ i9;
                        i4 = ((iM55682 ^ i10) * 3725) ^ 288021816;
                        i5 = -1385480026;
                        r7 = r6;
                        int i111 = iM55682 ^ i5;
                        c20539M12511 = c20539M12511;
                        c20539M12512 = c20539M12512;
                        strM56016 = strM56016;
                        i12 = i111;
                        i11 = i4;
                        r8 = r7;
                        c20671M55888 = c20671M55888;
                    }
                    break;
                case -603848284:
                case 1099408423:
                    break;
                case -479894889:
                case 1643491135:
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    C0873.m55676(executorService, new RunnableC4664(1, c21053));
                    final int i20 = c21053.f66097;
                    C0892.m55747(new Thread(new Runnable(c21053) { // from class: l.ܺᩴ᩷

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C21053 f52860;

                        {
                            int i21 = 1973461816;
                            int i22 = C1124.f82007;
                            int i23 = C1003.f81929;
                            int iM55688 = C0873.m55680("ۨ᩹") ^ i22;
                            int i24 = ((iM55688 ^ i23) * 30879) ^ (-1102132638);
                            int i25 = -617102331;
                            while (true) {
                                i21 = ((((i21 ^ i23) * 21095) >> 31) & i24) ^ (iM55688 ^ i25);
                                switch (i21) {
                                    case -2094189802:
                                    case -1621134186:
                                        C0927.m55873();
                                        if (RunnableC0871.m55672() >= 0) {
                                            iM55688 = C0873.m55680("ۤۤ") ^ i23;
                                            i24 = ((iM55688 ^ i22) * 25231) ^ (-1858392120);
                                            i25 = 1930074191;
                                        } else {
                                            iM55688 = (C0946.m55979("᩷ۡ") + i22) * 15;
                                            i24 = ((iM55688 ^ i23) * (-24451)) ^ (-1491784593);
                                            i25 = -854594041;
                                        }
                                        break;
                                    case -1846958462:
                                    case 675629455:
                                        if (C0992.m56107() <= 0) {
                                            iM55688 = (C0873.m55680("᩺᩺") ^ i23) * 95;
                                            i24 = ((iM55688 ^ i22) * (-32753)) ^ (-464381783);
                                            i25 = -52087864;
                                        } else {
                                            iM55688 = (i23 - C0873.m55680("۫᩸")) * 97;
                                            i24 = ((iM55688 ^ i22) * (-23151)) ^ (-738019945);
                                            i25 = 689867260;
                                        }
                                        break;
                                    case -1731113537:
                                    case -272960877:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM55688 = C0873.m55680("ۤۤ") ^ i23;
                                            i24 = ((iM55688 ^ i22) * 25231) ^ (-1858392120);
                                            i25 = 1930074191;
                                        } else {
                                            iM55688 = (i22 - C0946.m55979("ۢ᩻")) * 5;
                                            i24 = ((iM55688 ^ i23) * (-30227)) ^ (-1885291300);
                                            i25 = 2016090168;
                                        }
                                        break;
                                    case -1418588246:
                                    case 301173267:
                                        if (!C0967.m56074()) {
                                            iM55688 = (C0946.m55979("᩷ۡ") + i22) * 15;
                                            i24 = ((iM55688 ^ i23) * (-24451)) ^ (-1491784593);
                                            i25 = -854594041;
                                        } else {
                                            iM55688 = (C0873.m55680("᩺᩺") ^ i23) * 95;
                                            i24 = ((iM55688 ^ i22) * (-32753)) ^ (-464381783);
                                            i25 = -52087864;
                                        }
                                        break;
                                    case -1230766632:
                                    case 933995536:
                                        C0955.m56025();
                                        C0882.m55710();
                                        throw new RuntimeException();
                                    case -1121679611:
                                    case -752445200:
                                        if (C0890.f81849 != 0) {
                                            iM55688 = (C0946.m55979("᩷ۡ") + i22) * 15;
                                            i24 = ((iM55688 ^ i23) * (-24451)) ^ (-1491784593);
                                            i25 = -854594041;
                                        } else {
                                            iM55688 = C0946.m55979("ܿܽ") ^ i22;
                                            i24 = ((iM55688 ^ i23) * (-3887)) ^ (-325150276);
                                            i25 = -982348282;
                                        }
                                        break;
                                    case -1056336434:
                                    case 69761230:
                                        if (C0917.m55854()) {
                                            iM55688 = (i23 - C0873.m55680("֡ۙ")) * 97;
                                            i24 = ((iM55688 ^ i22) * 22931) ^ (-483516951);
                                            i25 = -1755020113;
                                        } else {
                                            iM55688 = (C0873.m55680("᩺᩺") ^ i23) * 95;
                                            i24 = ((iM55688 ^ i22) * (-32753)) ^ (-464381783);
                                            i25 = -52087864;
                                        }
                                        break;
                                    case -635049394:
                                    case 456252756:
                                        if (C1017.f81942 >= 0) {
                                            iM55688 = C0873.m55680("ۤۤ") ^ i23;
                                            i24 = ((iM55688 ^ i22) * 25231) ^ (-1858392120);
                                            i25 = 1930074191;
                                        } else {
                                            iM55688 = (i23 - C0873.m55680("᩺ۛ")) * 37;
                                            i24 = ((iM55688 ^ i22) * 28119) ^ 1554016684;
                                            i25 = -1648012404;
                                        }
                                        break;
                                    case 212086936:
                                    case 580852477:
                                        if (C0894.f81854 >= 0) {
                                            iM55688 = (i22 - C0946.m55979("ܽ᩸")) * (-73);
                                            i24 = ((iM55688 ^ i23) * 955) ^ (-445087356);
                                            i25 = -992986318;
                                        } else {
                                            iM55688 = C0873.m55680("᩻֡") ^ i23;
                                            i24 = ((iM55688 ^ i22) * (-16217)) ^ (-287201999);
                                            i25 = 915922362;
                                        }
                                        break;
                                    case 280255690:
                                    case 351125332:
                                        return;
                                    case 429304499:
                                    case 905974979:
                                        this.f52860 = c21053;
                                        if (C0992.f81922 >= 0) {
                                            iM55688 = (C0873.m55680("᩺᩺") ^ i23) * 95;
                                            i24 = ((iM55688 ^ i22) * (-32753)) ^ (-464381783);
                                            i25 = -52087864;
                                        } else {
                                            iM55688 = (i23 - C0946.m55979("᩷᩹")) * (-119);
                                            i24 = ((iM55688 ^ i22) * 30451) ^ 66952806;
                                            i25 = 671550022;
                                        }
                                        break;
                                    case 625489896:
                                    case 1628718502:
                                        if (C1024.f81946) {
                                            iM55688 = C0873.m55680("ۤۤ") ^ i23;
                                            i24 = ((iM55688 ^ i22) * 25231) ^ (-1858392120);
                                            i25 = 1930074191;
                                        } else {
                                            iM55688 = (C0873.m55680("᩷᩺") + i22) * 19;
                                            i24 = ((iM55688 ^ i23) * 9641) ^ (-878971626);
                                            i25 = 1516229760;
                                        }
                                        break;
                                    case 646036583:
                                    case 1408753020:
                                        if (C0873.f81841 <= 0) {
                                            iM55688 = C0873.m55680("ܶ۠") ^ i22;
                                            i24 = ((iM55688 ^ i23) * 22229) ^ 1595657984;
                                            i25 = -54244306;
                                        } else {
                                            iM55688 = C0946.m55979("ۗۧ") ^ i22;
                                            i24 = ((iM55688 ^ i23) * 803) ^ 133487875;
                                            i25 = -931148465;
                                        }
                                        break;
                                    case 666310622:
                                    case 1366498471:
                                        C0912.m55833();
                                        if (!C0882.f81846) {
                                            iM55688 = (C0873.m55680("᩺᩺") ^ i23) * 95;
                                            i24 = ((iM55688 ^ i22) * (-32753)) ^ (-464381783);
                                            i25 = -52087864;
                                        } else {
                                            iM55688 = C0873.m55680("ܶ۠") ^ i22;
                                            i24 = ((iM55688 ^ i23) * 22229) ^ 1595657984;
                                            i25 = -54244306;
                                        }
                                        break;
                                    case 1725397839:
                                    case 1739991727:
                                        if (C0863.f81833 <= 0) {
                                            iM55688 = C0873.m55680("ۤۤ") ^ i23;
                                            i24 = ((iM55688 ^ i22) * 25231) ^ (-1858392120);
                                            i25 = 1930074191;
                                        } else {
                                            iM55688 = C0946.m55979("᩵ۗ") ^ i22;
                                            i24 = ((iM55688 ^ i23) * 405) ^ (-620726812);
                                            i25 = -810876504;
                                        }
                                        break;
                                    default:
                                        ServiceConnectionC1013.m56157();
                                        iM55688 = (C0873.m55680("᩺᩺") ^ i23) * 95;
                                        i24 = ((iM55688 ^ i22) * (-32753)) ^ (-464381783);
                                        i25 = -52087864;
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            int i21 = 0;
                            C21053 c21054 = null;
                            ViewOnClickListenerC4308 viewOnClickListenerC4309 = null;
                            long j = 0;
                            int i22 = 1754216266;
                            int i23 = C1003.f81929;
                            int i24 = RunnableC1014.f81941;
                            int iM55688 = C0873.m55680("ۖۛ") ^ i24;
                            int i25 = ((iM55688 ^ i23) * 10425) ^ 1416575593;
                            int i26 = 1299423927;
                            while (true) {
                                i22 = ((((i22 ^ i23) * 2589) >> 31) & i25) ^ (iM55688 ^ i26);
                                switch (i22) {
                                    case -2006954759:
                                    case -400203274:
                                        if (C1028.f81950 <= 0) {
                                            iM55688 = C0873.m55680("᩷ܶ") ^ i23;
                                            i25 = ((iM55688 ^ i24) * (-30257)) ^ (-35624324);
                                            i26 = 892729430;
                                        } else {
                                            iM55688 = (C0873.m55680("۟ۨ") + i23) * 101;
                                            i25 = ((iM55688 ^ i24) * (-8205)) ^ (-442894862);
                                            i26 = -992942381;
                                        }
                                        break;
                                    case -1973496549:
                                    case 391093153:
                                        if (!C0882.f81846) {
                                            iM55688 = C0946.m55979("ܽܽ") ^ i24;
                                            i25 = ((iM55688 ^ i23) * 11601) ^ 659771476;
                                            i26 = 1127040210;
                                        } else {
                                            iM55688 = (C0873.m55680("ܿ᩷") + i24) * 123;
                                            i25 = ((iM55688 ^ i23) * 827) ^ (-1164585362);
                                            i26 = 225773473;
                                        }
                                        break;
                                    case -1922534871:
                                    case -228744165:
                                        C0967.m56074();
                                        if (C1017.f81942 < 0) {
                                            iM55688 = (C0873.m55680("ܿ᩷") + i24) * 123;
                                            i25 = ((iM55688 ^ i23) * 827) ^ (-1164585362);
                                            i26 = 225773473;
                                        } else {
                                            iM55688 = C0946.m55979("ۚᩳ") ^ i23;
                                            i25 = ((iM55688 ^ i24) * 19101) ^ 331553899;
                                            i26 = 304988664;
                                        }
                                        break;
                                    case -1911647779:
                                    case 20738310:
                                        if (C1036.f81953 >= 0) {
                                            iM55688 = C0946.m55979("ܽܽ") ^ i24;
                                            i25 = ((iM55688 ^ i23) * 11601) ^ 659771476;
                                            i26 = 1127040210;
                                        } else {
                                            iM55688 = C0873.m55680("ܿۛ") ^ i23;
                                            i25 = ((iM55688 ^ i24) * (-2413)) ^ 1604664358;
                                            i26 = -1859316652;
                                        }
                                        break;
                                    case -1757366995:
                                    case 2105012898:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55688 = (i24 - C0946.m55979("ۨ᩸")) * (-73);
                                            i25 = ((iM55688 ^ i23) * 19963) ^ (-405854765);
                                            i26 = -1725464430;
                                        } else {
                                            iM55688 = C0946.m55979("ۜۨ") ^ i24;
                                            i25 = ((iM55688 ^ i23) * (-10821)) ^ (-29965988);
                                            i26 = -376808744;
                                        }
                                        break;
                                    case -1589995338:
                                    case 748271071:
                                        i21 = i20;
                                        if (C0955.m56025()) {
                                            iM55688 = C0873.m55680("᩷ܶ") ^ i23;
                                            i25 = ((iM55688 ^ i24) * (-30257)) ^ (-35624324);
                                            i26 = 892729430;
                                        } else {
                                            iM55688 = (C0946.m55979("ۘ᩸") + i23) * 15;
                                            i25 = ((iM55688 ^ i24) * 23183) ^ (-234491020);
                                            i26 = -1838506923;
                                        }
                                        break;
                                    case -1551673953:
                                    case -1010750116:
                                        try {
                                            SystemClock.sleep(j);
                                            ViewOnClickListenerC4308.m8784(viewOnClickListenerC4309, viewOnClickListenerC4309.f9605.f13641.f68413, viewOnClickListenerC4309.f9605.f13646, viewOnClickListenerC4309.f9599, i21);
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        iM55688 = C0873.m55680("᩵ᩴ") ^ i24;
                                        i25 = ((iM55688 ^ i23) * 13607) ^ (-1093746320);
                                        i26 = -1426160103;
                                        break;
                                    case -1483768601:
                                    case -262288771:
                                        if (C0917.m55854()) {
                                            iM55688 = C0873.m55680("ܶ֫") ^ i23;
                                            i25 = ((iM55688 ^ i24) * C0719o.a.f2895a) ^ 698626240;
                                            i26 = 1639133067;
                                        } else {
                                            iM55688 = (C0873.m55680("ܿ᩷") + i24) * 123;
                                            i25 = ((iM55688 ^ i23) * 827) ^ (-1164585362);
                                            i26 = 225773473;
                                        }
                                        break;
                                    case -1315579021:
                                    case -1176641865:
                                        if (C1044.f81959 >= 0) {
                                            iM55688 = (C0873.m55680("ܿ᩷") + i24) * 123;
                                            i25 = ((iM55688 ^ i23) * 827) ^ (-1164585362);
                                            i26 = 225773473;
                                        } else {
                                            iM55688 = C0873.m55680("᩹֫") ^ i24;
                                            i25 = ((iM55688 ^ i23) * (-761)) ^ 1899282107;
                                            i26 = -966358248;
                                        }
                                        break;
                                    case -1307021598:
                                    case 671199915:
                                        if (C1194.f82045 != 0) {
                                            iM55688 = C0873.m55680("ܿۛ") ^ i23;
                                            i25 = ((iM55688 ^ i24) * (-2413)) ^ 1604664358;
                                            i26 = -1859316652;
                                        } else {
                                            iM55688 = C0946.m55979("ۛ۟") ^ i24;
                                            i25 = ((iM55688 ^ i23) * (-27189)) ^ 498956667;
                                            i26 = -1273777362;
                                        }
                                        break;
                                    case -1286296768:
                                    case -404868771:
                                        C0917.m55854();
                                        break;
                                    case -887683797:
                                    case 1034078445:
                                        break;
                                    case -877211081:
                                    case -705059353:
                                        if (C1025.f81947 >= 0) {
                                            iM55688 = C0946.m55979("ܽܽ") ^ i24;
                                            i25 = ((iM55688 ^ i23) * 11601) ^ 659771476;
                                            i26 = 1127040210;
                                        } else {
                                            iM55688 = C0946.m55979("ܶ۬") ^ i23;
                                            i25 = ((iM55688 ^ i24) * (-26925)) ^ (-1394066611);
                                            i26 = -1813224083;
                                        }
                                        break;
                                    case -647387883:
                                    case 454291850:
                                        if (C1017.m56187() <= 0) {
                                            iM55688 = C0873.m55680("ܿۛ") ^ i23;
                                            i25 = ((iM55688 ^ i24) * (-2413)) ^ 1604664358;
                                            i26 = -1859316652;
                                        } else {
                                            iM55688 = (C0946.m55979("ܰܶ") + i23) * 31;
                                            i25 = ((iM55688 ^ i24) * (-12787)) ^ (-1510914886);
                                            i26 = 80494073;
                                        }
                                        break;
                                    case -407986164:
                                    case 1532512784:
                                        viewOnClickListenerC4309 = c21054.f66098;
                                        j = 100;
                                        iM55688 = C0873.m55680("ۗۗ") ^ i23;
                                        i25 = ((iM55688 ^ i24) * (-32133)) ^ (-1768904700);
                                        i26 = -507990060;
                                        break;
                                    case 281858790:
                                    case 1137349334:
                                        c21054 = this.f52860;
                                        if (C0989.f81920 >= 0) {
                                            iM55688 = (i24 - C0946.m55979("ۨ᩸")) * (-73);
                                            i25 = ((iM55688 ^ i23) * 19963) ^ (-405854765);
                                            i26 = -1725464430;
                                        } else {
                                            iM55688 = C0946.m55979("᩺᩵") ^ i24;
                                            i25 = ((iM55688 ^ i23) * (-2375)) ^ (-1747533934);
                                            i26 = 984729734;
                                        }
                                        break;
                                    case 326948188:
                                    case 1592149286:
                                        if (C0854.f81826 != 0) {
                                            iM55688 = C0873.m55680("᩷ܶ") ^ i23;
                                            i25 = ((iM55688 ^ i24) * (-30257)) ^ (-35624324);
                                            i26 = 892729430;
                                        } else {
                                            iM55688 = (C0946.m55979("ۤ᩹") ^ i24) * (-61);
                                            i25 = ((iM55688 ^ i23) * (-27903)) ^ 559515615;
                                            i26 = -1338197342;
                                        }
                                        break;
                                    case 583495391:
                                    case 1230425214:
                                        C1017.m56187();
                                        C0877.m55696();
                                        iM55688 = C0873.m55680("ܿۛ") ^ i23;
                                        i25 = ((iM55688 ^ i24) * (-2413)) ^ 1604664358;
                                        i26 = -1859316652;
                                        break;
                                    default:
                                        if (C1028.f81950 <= 0) {
                                            iM55688 = C0873.m55680("᩷ܶ") ^ i23;
                                            i25 = ((iM55688 ^ i24) * (-30257)) ^ (-35624324);
                                            i26 = 892729430;
                                        } else {
                                            iM55688 = C0946.m55979("ܽܽ") ^ i24;
                                            i25 = ((iM55688 ^ i23) * 11601) ^ 659771476;
                                            i26 = 1127040210;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    }));
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("ۜۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i9) * (-16615)) ^ (-445579542);
                        i2 = 1127579538;
                    } else {
                        C0892.m55747(new Thread(new Runnable(c21053) { // from class: l.ۖᩴ᩷

                            /* JADX INFO: renamed from: ᩸ */
                            public final /* synthetic */ C21053 f11292;

                            {
                                int i21 = -1930030891;
                                int i22 = C1036.f81953;
                                int i23 = C1012.f81938;
                                int iM55688 = (i23 - C0873.m55680("᩷֨")) * 115;
                                int i24 = ((iM55688 ^ i22) * 28119) ^ (-1882479446);
                                int i25 = -72271284;
                                while (true) {
                                    i21 = ((((i21 ^ i22) * (-8461)) >> 31) & i24) ^ (iM55688 ^ i25);
                                    switch (i21) {
                                        case -2046133446:
                                        case -603112574:
                                            if (C0890.f81849 != 0) {
                                                iM55688 = C0873.m55680("۠ۙ") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 18935) ^ 1733191853;
                                                i25 = -324001778;
                                            } else {
                                                iM55688 = (i23 - C0946.m55979("ۚ۠")) * 79;
                                                i24 = ((iM55688 ^ i22) * 17433) ^ 1403012645;
                                                i25 = 1603560463;
                                            }
                                            break;
                                        case -1952443323:
                                        case -658911761:
                                            if (C0992.m56107() <= 0) {
                                                iM55688 = C0873.m55680("۠ۙ") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 18935) ^ 1733191853;
                                                i25 = -324001778;
                                            } else {
                                                iM55688 = C0946.m55979("ۤۚ") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 16011) ^ (-2103312768);
                                                i25 = 979955451;
                                            }
                                            break;
                                        case -1887671899:
                                        case -1655100772:
                                            return;
                                        case -1840902751:
                                        case 715734504:
                                            C0967.m56074();
                                            if (C0890.f81849 != 0) {
                                                iM55688 = (C0873.m55680("ۜᩳ") + i22) * 89;
                                                i24 = ((iM55688 ^ i23) * 10975) ^ (-857539338);
                                                i25 = -1906146645;
                                            } else {
                                                iM55688 = C0946.m55979("ۘ۠") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            }
                                            break;
                                        case -1733716437:
                                        case -1331100445:
                                            if (C0898.f81858 <= 0) {
                                                iM55688 = (C0873.m55680("ۜᩳ") + i22) * 89;
                                                i24 = ((iM55688 ^ i23) * 10975) ^ (-857539338);
                                                i25 = -1906146645;
                                            } else {
                                                iM55688 = C0946.m55979("ᩳ᩹") ^ i22;
                                                i24 = ((iM55688 ^ i23) * (-8411)) ^ (-39063137);
                                                i25 = 1625953097;
                                            }
                                            break;
                                        case -1667955858:
                                        case 1503961311:
                                            if (RunnableC1014.f81941 <= 0) {
                                                iM55688 = C0946.m55979("᩶᩷") ^ i22;
                                                i24 = ((iM55688 ^ i23) * 27775) ^ 136213349;
                                                i25 = 704101235;
                                            } else {
                                                iM55688 = C0946.m55979("ۘ۠") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            }
                                            break;
                                        case -1559459113:
                                        case -1161459584:
                                            C1124.m56367();
                                            throw new RuntimeException();
                                        case -1392449767:
                                        case 1214251379:
                                            this.f11292 = c21053;
                                            if (C1404.f82149 >= 0) {
                                                iM55688 = C0946.m55979("ۘ۠") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            } else {
                                                iM55688 = C0873.m55680("ܳ۟") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 19779) ^ 2092326472;
                                                i25 = 1487478258;
                                            }
                                            break;
                                        case -1097854287:
                                        case -634120153:
                                            if (C1036.f81953 >= 0) {
                                                iM55688 = (C0873.m55680("ۜᩳ") + i22) * 89;
                                                i24 = ((iM55688 ^ i23) * 10975) ^ (-857539338);
                                                i25 = -1906146645;
                                            } else {
                                                iM55688 = C0946.m55979("ܿ᩸") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 18485) ^ 306496027;
                                                i25 = -1590046468;
                                            }
                                            break;
                                        case -886448409:
                                        case -29951475:
                                            C1025.m56230();
                                            C0898.m55800();
                                            iM55688 = C0946.m55979("ۘ۠") ^ i23;
                                            i24 = ((iM55688 ^ i22) * 10883) ^ (-2127053496);
                                            i25 = 265357472;
                                            break;
                                        case -820522073:
                                        case 1797110470:
                                            C0989.m56095();
                                            if (C0863.f81833 > 0) {
                                                iM55688 = C0946.m55979("ܳ۠") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 26261) ^ 1042105017;
                                                i25 = -1614970675;
                                            } else {
                                                iM55688 = C0946.m55979("ۘ۠") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            }
                                            break;
                                        case -393748792:
                                        case -58659562:
                                            if (C1003.f81929 <= 0) {
                                                iM55688 = C0946.m55979("᩶᩷") ^ i22;
                                                i24 = ((iM55688 ^ i23) * 27775) ^ 136213349;
                                                i25 = 704101235;
                                            } else {
                                                iM55688 = (C0873.m55680("۬᩵") + i22) * 83;
                                                i24 = ((iM55688 ^ i23) * (-25113)) ^ (-2029264266);
                                                i25 = 1130031249;
                                            }
                                            break;
                                        case -330671541:
                                        case 1107038457:
                                            if (AbstractC0942.m55971()) {
                                                iM55688 = C0946.m55979("ۘ۠") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            } else {
                                                iM55688 = C0873.m55680("᩵᩷") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 27675) ^ (-191908325);
                                                i25 = 1569770306;
                                            }
                                            break;
                                        case -107915358:
                                        case 338522317:
                                            if (C1012.f81938 >= 0) {
                                                iM55688 = (C0873.m55680("ۜᩳ") + i22) * 89;
                                                i24 = ((iM55688 ^ i23) * 10975) ^ (-857539338);
                                                i25 = -1906146645;
                                            } else {
                                                iM55688 = C0873.m55680("۫᩵") ^ i22;
                                                i24 = ((iM55688 ^ i23) * 15419) ^ 1038983290;
                                                i25 = -876640510;
                                            }
                                            break;
                                        case 761025021:
                                        case 1342039306:
                                            if (C0930.f81879 <= 0) {
                                                iM55688 = C0946.m55979("ۘ۠") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            } else {
                                                iM55688 = C0946.m55979("ܶۖ") ^ i22;
                                                i24 = ((iM55688 ^ i23) * 11505) ^ (-908794073);
                                                i25 = 1046089114;
                                            }
                                            break;
                                        default:
                                            if (C1036.m56257() <= 0) {
                                                iM55688 = C0946.m55979("ܳ۠") ^ i23;
                                                i24 = ((iM55688 ^ i22) * 26261) ^ 1042105017;
                                                i25 = -1614970675;
                                            } else {
                                                iM55688 = (i22 - C0946.m55979("ᩳܿ")) * (-87);
                                                i24 = ((iM55688 ^ i23) * 32001) ^ (-1238610869);
                                                i25 = 1705865370;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                int i21 = 0;
                                C21053 c21054 = null;
                                ViewOnClickListenerC4308 viewOnClickListenerC4309 = null;
                                long j = 0;
                                int i22 = 334257038;
                                int i23 = C0894.f81854;
                                int i24 = C1071.f81975;
                                int iM55688 = C0873.m55680("᩶ۢ") ^ i24;
                                int i25 = ((iM55688 ^ i23) * (-3613)) ^ (-2116912882);
                                int i26 = -1734320456;
                                while (true) {
                                    i22 = ((((i22 ^ i23) * 21995) >> 31) & i25) ^ (iM55688 ^ i26);
                                    switch (i22) {
                                        case -2066693415:
                                        case -88001046:
                                            if (C1124.f82007 >= 0) {
                                                iM55688 = C0873.m55680("᩵۬") ^ i24;
                                                i25 = ((iM55688 ^ i23) * 11281) ^ (-685272828);
                                                i26 = 1434710948;
                                            } else {
                                                iM55688 = (i24 - C0873.m55680("۬ᩳ")) * (-55);
                                                i25 = ((iM55688 ^ i23) * 699) ^ (-581574039);
                                                i26 = -1613319083;
                                            }
                                            break;
                                        case -1870568338:
                                        case 1979953773:
                                            if (C0989.f81920 >= 0) {
                                                iM55688 = (i23 - C0873.m55680("ᩴۜ")) * (-7);
                                                i25 = ((iM55688 ^ i24) * 29887) ^ (-1060850901);
                                                i26 = -294540467;
                                            } else {
                                                iM55688 = C0873.m55680("ܰ᩵") ^ i24;
                                                i25 = ((iM55688 ^ i23) * (-19923)) ^ 1906900526;
                                                i26 = -488113307;
                                            }
                                            break;
                                        case -1740635197:
                                        case 1940971917:
                                            if (C1053.f81965 <= 0) {
                                                iM55688 = C0873.m55680("᩵۬") ^ i24;
                                                i25 = ((iM55688 ^ i23) * 11281) ^ (-685272828);
                                                i26 = 1434710948;
                                            } else {
                                                iM55688 = C0873.m55680("ܶ᩹") ^ i23;
                                                i25 = ((iM55688 ^ i24) * 30409) ^ (-1990923593);
                                                i26 = -378580544;
                                            }
                                            break;
                                        case -1491987838:
                                        case -287100673:
                                            if (RunnableC0871.f81839 >= 0) {
                                                iM55688 = (C0946.m55979("ܽ֫") + i23) * (-117);
                                                i25 = ((iM55688 ^ i24) * 12243) ^ (-1157189508);
                                                i26 = -1529021304;
                                            } else {
                                                iM55688 = (C0946.m55979("ۚ᩹") ^ i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i25 = ((iM55688 ^ i23) * 25715) ^ (-849755767);
                                                i26 = 1712750190;
                                            }
                                            break;
                                        case -1429790025:
                                        case 255572573:
                                            if (C1017.f81942 >= 0) {
                                                iM55688 = (i24 - C0873.m55680("ܿۘ")) * (-51);
                                                i25 = ((iM55688 ^ i23) * 6895) ^ 391644108;
                                                i26 = 287945740;
                                            } else {
                                                iM55688 = C0946.m55979("۟۟") ^ i24;
                                                i25 = ((iM55688 ^ i23) * 28549) ^ 580791971;
                                                i26 = -1090844957;
                                            }
                                            break;
                                        case -1111681855:
                                        case 1948565987:
                                            try {
                                                SystemClock.sleep(j);
                                                ViewOnClickListenerC4308.m8784(viewOnClickListenerC4309, viewOnClickListenerC4309.f9598.f13641.f68413, viewOnClickListenerC4309.f9598.f13646, viewOnClickListenerC4309.f9599, i21);
                                                break;
                                            } catch (Exception unused) {
                                            }
                                            iM55688 = C0873.m55680("᩻ܶ") ^ i24;
                                            i25 = ((iM55688 ^ i23) * (-8347)) ^ 65311975;
                                            i26 = -1728531105;
                                            break;
                                        case -1105675436:
                                        case -1055553355:
                                            i21 = i20;
                                            if (C0946.m55980() != 0) {
                                                iM55688 = (i23 - C0873.m55680("ᩴۜ")) * (-7);
                                                i25 = ((iM55688 ^ i24) * 29887) ^ (-1060850901);
                                                i26 = -294540467;
                                            } else {
                                                iM55688 = C0873.m55680("᩹ۡ") ^ i23;
                                                i25 = ((iM55688 ^ i24) * (-2591)) ^ 1281442818;
                                                i26 = 502946447;
                                            }
                                            break;
                                        case -1103079548:
                                        case 1486468185:
                                            break;
                                        case -1000547104:
                                        case 157096370:
                                            if (C0967.m56074()) {
                                                iM55688 = (C0946.m55979("ܽ֫") + i23) * (-117);
                                                i25 = ((iM55688 ^ i24) * 12243) ^ (-1157189508);
                                                i26 = -1529021304;
                                            } else {
                                                iM55688 = (C0946.m55979("ۚۤ") ^ i23) * (-83);
                                                i25 = ((iM55688 ^ i24) * (-14385)) ^ 1665114676;
                                                i26 = -2032277467;
                                            }
                                            break;
                                        case -973096423:
                                        case -696610552:
                                            viewOnClickListenerC4309 = c21054.f66098;
                                            j = 100;
                                            iM55688 = C0946.m55979("֨ۡ") ^ i23;
                                            i25 = ((iM55688 ^ i24) * 16601) ^ (-1114502606);
                                            i26 = -111381837;
                                            break;
                                        case -809509580:
                                        case -297281512:
                                            ServiceConnectionC1013.m56157();
                                            if (C1003.f81929 <= 0) {
                                                iM55688 = (i24 - C0873.m55680("ܿۘ")) * (-51);
                                                i25 = ((iM55688 ^ i23) * 6895) ^ 391644108;
                                                i26 = 287945740;
                                            } else {
                                                iM55688 = C0946.m55979("ܳ֡") ^ i23;
                                                i25 = ((iM55688 ^ i24) * 6719) ^ 1349334259;
                                                i26 = -128393662;
                                            }
                                            break;
                                        case -758751675:
                                        case 838883604:
                                            if (C0898.f81858 <= 0) {
                                                iM55688 = (i23 - C0873.m55680("ᩴۜ")) * (-7);
                                                i25 = ((iM55688 ^ i24) * 29887) ^ (-1060850901);
                                                i26 = -294540467;
                                            } else {
                                                iM55688 = (C0873.m55680("ܰ᩸") + i23) * 11;
                                                i25 = ((iM55688 ^ i24) * 23981) ^ 1494587285;
                                                i26 = -1091185876;
                                            }
                                            break;
                                        case -594313778:
                                        case -211771883:
                                            if (C1053.m56327() >= 0) {
                                                iM55688 = C0873.m55680("᩵۬") ^ i24;
                                                i25 = ((iM55688 ^ i23) * 11281) ^ (-685272828);
                                                i26 = 1434710948;
                                            } else {
                                                iM55688 = C0946.m55979("ܳ֡") ^ i23;
                                                i25 = ((iM55688 ^ i24) * 6719) ^ 1349334259;
                                                i26 = -128393662;
                                            }
                                            break;
                                        case -453305593:
                                        case 1028759724:
                                            if (C1229.f82066 >= 0) {
                                                iM55688 = (i23 - C0873.m55680("ᩴۜ")) * (-7);
                                                i25 = ((iM55688 ^ i24) * 29887) ^ (-1060850901);
                                                i26 = -294540467;
                                            } else {
                                                iM55688 = (i24 - C0873.m55680("ܿۘ")) * (-51);
                                                i25 = ((iM55688 ^ i23) * 6895) ^ 391644108;
                                                i26 = 287945740;
                                            }
                                            break;
                                        case 252185455:
                                        case 867776728:
                                            c21054 = this.f11292;
                                            if (C1048.m56305() >= 0) {
                                                iM55688 = (C0946.m55979("ܽܺ") ^ i24) * 39;
                                                i25 = ((iM55688 ^ i23) * 4611) ^ (-1018726547);
                                                i26 = 41854508;
                                            } else {
                                                iM55688 = (C0873.m55680("۬ۜ") + i24) * 33;
                                                i25 = ((iM55688 ^ i23) * 8547) ^ 752302970;
                                                i26 = 674157368;
                                            }
                                            break;
                                        case 350255669:
                                        case 1508444375:
                                            if (C1017.f81942 < 0) {
                                                iM55688 = (C0946.m55979("ܽ֫") + i23) * (-117);
                                                i25 = ((iM55688 ^ i24) * 12243) ^ (-1157189508);
                                                i26 = -1529021304;
                                            } else {
                                                iM55688 = C0946.m55979("ܳ֡") ^ i23;
                                                i25 = ((iM55688 ^ i24) * 6719) ^ 1349334259;
                                                i26 = -128393662;
                                            }
                                            break;
                                        case 553291367:
                                        case 1679273642:
                                            if (RunnableC0871.m55672() >= 0) {
                                                iM55688 = C0873.m55680("᩵۬") ^ i24;
                                                i25 = ((iM55688 ^ i23) * 11281) ^ (-685272828);
                                                i26 = 1434710948;
                                            } else {
                                                iM55688 = (i23 - C0946.m55979("ۜۚ")) * (-59);
                                                i25 = ((iM55688 ^ i24) * 23607) ^ (-1535986874);
                                                i26 = 1786863032;
                                            }
                                            break;
                                        case 712184809:
                                        case 1933252211:
                                            C0873.m55678();
                                            iM55688 = C0946.m55979("ܳ֡") ^ i23;
                                            i25 = ((iM55688 ^ i24) * 6719) ^ 1349334259;
                                            i26 = -128393662;
                                            break;
                                        default:
                                            C0863.m55643();
                                            C0866.m55645();
                                            break;
                                    }
                                    return;
                                }
                            }
                        }));
                        interfaceC14100 = ApplicationC21448.f67649;
                        iM55680 = C0946.m55979("ۘ֫") ^ i10;
                        i = ((iM55680 ^ i9) * 17929) ^ (-231987654);
                        i2 = 965611373;
                    }
                    i8 = iM55680 ^ i2;
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    i12 = i8;
                    i11 = i;
                    break;
                case -449916643:
                case 1109211000:
                    RunnableC0938.m55938();
                    break;
                case -342567329:
                case 1362676:
                    strM56016 = strM56016;
                    iM559710 = C0946.m55979(C1229.m56403(f82956, 53, 3, i13));
                    if (C1024.f81946) {
                        iM55681 = (i9 - C0873.m55680("۫ܳ")) * (-15);
                        i = ((iM55681 ^ i10) * (-15191)) ^ 572355809;
                        i3 = 1201363960;
                    } else {
                        iM55681 = (C0946.m55979("ܳܽ") + i9) * (-93);
                        i = ((iM55681 ^ i10) * 3441) ^ (-1387934766);
                        i3 = -589833973;
                    }
                    i8 = iM55681 ^ i3;
                    strM56016 = strM56016;
                    i12 = i8;
                    i11 = i;
                    break;
                case 66271000:
                case 522133244:
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    c20539M12511 = c20539M12511;
                    c20539M12512 = c20539M12512;
                    int i21 = (s * s) + 304781764;
                    if ((i21 + i21) - (i15 * i15) >= 0) {
                        iM55682 = (i10 - C0873.m55680("ܰۗ")) * 87;
                        i4 = ((iM55682 ^ i9) * (-31809)) ^ (-246489600);
                        i5 = -353627191;
                        r7 = r8;
                    } else {
                        iM55682 = (C0873.m55680("֡ۧ") ^ i9) * (-111);
                        i4 = ((iM55682 ^ i10) * 28113) ^ 944923282;
                        i5 = -2064138437;
                        r7 = r8;
                    }
                    int i112 = iM55682 ^ i5;
                    c20539M12511 = c20539M12511;
                    c20539M12512 = c20539M12512;
                    strM56016 = strM56016;
                    i12 = i112;
                    i11 = i4;
                    r8 = r7;
                    c20671M55888 = c20671M55888;
                    break;
                case 92447412:
                case 1323148249:
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    c20539M12511 = c20539M12511;
                    c20539M12512 = c20539M12512;
                    ViewOnClickListenerC4308.m8783(viewOnClickListenerC4308, ViewOnClickListenerC4308.m8772(viewOnClickListenerC4308, c20539M12511, c20539M12512, str, c21723.f68414));
                    executorService = C4081.f8987;
                    r6 = r8;
                    if (C0861.m55626()) {
                        iM55682 = C0946.m55979("۫᩷") ^ i9;
                        i4 = ((iM55682 ^ i10) * 3725) ^ 288021816;
                        i5 = -1385480026;
                        r7 = r6;
                    } else {
                        iM55682 = C0946.m55979("ۗ᩻") ^ i10;
                        i4 = ((iM55682 ^ i9) * 30155) ^ (-2103232161);
                        i5 = -1247013196;
                        r7 = r8;
                    }
                    int i113 = iM55682 ^ i5;
                    c20539M12511 = c20539M12511;
                    c20539M12512 = c20539M12512;
                    strM56016 = strM56016;
                    i12 = i113;
                    i11 = i4;
                    r8 = r7;
                    c20671M55888 = c20671M55888;
                    break;
                case 386494627:
                case 801980886:
                    strM56016 = strM56016;
                    C20671 c20671 = c20671M55888;
                    c20539 = c20539M12511;
                    c205310 = c20539M12512;
                    short s2 = f82956[0];
                    int i22 = s2 + 17458;
                    if (C0873.f81841 <= 0) {
                        s = s2;
                        i15 = i22;
                        c20671M55888 = c20671;
                        int iM55688 = (C0873.m55680("۠᩵") + i10) * (-49);
                        c20539M12511 = c20539;
                        c20539M12512 = c205310;
                        strM56016 = strM56016;
                        i12 = iM55688 ^ (-2045420647);
                        i11 = ((iM55688 ^ i9) * 24103) ^ (-935814965);
                    } else {
                        int iM559711 = C0946.m55979("ۙᩳ") ^ i9;
                        s = s2;
                        i11 = ((iM559711 ^ i10) * (-5267)) ^ 458486779;
                        c20539M12511 = c20539;
                        c20539M12512 = c205310;
                        i15 = i22;
                        strM56016 = strM56016;
                        c20671M55888 = c20671;
                        i12 = iM559711 ^ (-968262560);
                    }
                    c21053 = this;
                    break;
                case 572907457:
                case 1866943513:
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    if (!C1053.m56326(interfaceC14100, RunnableC0871.m55667(f82956, 1, 5, i13), z)) {
                        iM55680 = C0873.m55680("ܿۖ") ^ i10;
                        i = ((iM55680 ^ i9) * (-4737)) ^ (-2069027318);
                        i2 = 1008095275;
                        i8 = iM55680 ^ i2;
                        strM56016 = strM56016;
                        c20671M55888 = c20671M55888;
                        i12 = i8;
                        i11 = i;
                    } else {
                        strM56016 = strM56016;
                        iM55979 = C0946.m55979("᩶᩺") ^ i9;
                        i6 = ((iM55979 ^ i10) * 19747) ^ 896104428;
                        i7 = -1731041595;
                        i12 = iM55979 ^ i7;
                        i11 = i6;
                        r8 = r8;
                        c20671M55888 = c20671M55888;
                    }
                    break;
                case 608373975:
                case 938252158:
                    C0927.m55873();
                    strM56016 = strM56016;
                    c20539 = c20539M12511;
                    c205310 = c20539M12512;
                    int iM55689 = (C0873.m55680("۠᩵") + i10) * (-49);
                    c20539M12511 = c20539;
                    c20539M12512 = c205310;
                    strM56016 = strM56016;
                    i12 = iM55689 ^ (-2045420647);
                    i11 = ((iM55689 ^ i9) * 24103) ^ (-935814965);
                    c21053 = this;
                    break;
                case 685851111:
                case 1608274805:
                    strM56016 = strM56016;
                    C1012.m56146(c20671M55888, iM55684 ^ i14);
                    strM55970 = AbstractC0942.m55970(f82956, 50, 3, i13);
                    if (C0845.f81821 < 0) {
                        iM55681 = C0946.m55979("۟ۘ") ^ i9;
                        i = ((iM55681 ^ i10) * (-7351)) ^ 63497165;
                        i3 = -1122958042;
                        i8 = iM55681 ^ i3;
                        strM56016 = strM56016;
                        i12 = i8;
                        i11 = i;
                    }
                    c20671M55888 = c20671M55888;
                    iM55680 = (C0946.m55979("ۜۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM55680 ^ i9) * (-16615)) ^ (-445579542);
                    i2 = 1127579538;
                    i8 = iM55680 ^ i2;
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    i12 = i8;
                    i11 = i;
                    break;
                case 845837339:
                case 2088941099:
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    c20539M12511 = c20539M12511;
                    c20539M12512 = c20539M12512;
                    z = false;
                    c21053.f66100 = false;
                    ViewOnClickListenerC4308.m8785(viewOnClickListenerC4308, c21053.f66099, c20539M12511, c20539M12512);
                    r6 = 1;
                    r7 = 1;
                    if (C1124.f82007 >= 0) {
                        iM55682 = C0946.m55979("۫᩷") ^ i9;
                        i4 = ((iM55682 ^ i10) * 3725) ^ 288021816;
                        i5 = -1385480026;
                        r7 = r6;
                    } else {
                        iM55682 = C0873.m55680("ܽܳ") ^ i9;
                        i4 = ((iM55682 ^ i10) * 2091) ^ 1558373100;
                        i5 = 2078400741;
                    }
                    int i114 = iM55682 ^ i5;
                    c20539M12511 = c20539M12511;
                    c20539M12512 = c20539M12512;
                    strM56016 = strM56016;
                    i12 = i114;
                    i11 = i4;
                    r8 = r7;
                    c20671M55888 = c20671M55888;
                    break;
                case 1401720475:
                case 1960822428:
                    dialogInterfaceOnClickListenerC20382 = new DialogInterfaceOnClickListenerC20382();
                    strM56016 = strM56016;
                    strM55750 = C0892.m55750(f82956, 59, 3, i13);
                    iM55681 = (i10 - C0946.m55979("ۡ֨")) * 63;
                    i = ((iM55681 ^ i9) * (-32621)) ^ 300951905;
                    i3 = -276949601;
                    i8 = iM55681 ^ i3;
                    strM56016 = strM56016;
                    i12 = i8;
                    i11 = i;
                    break;
                default:
                    strM56016 = strM56016;
                    c20671M55888 = c20671M55888;
                    c20539M12511 = c20539M12511;
                    c20539M12512 = c20539M12512;
                    c21053.f66100 = r8;
                    str = viewOnClickListenerC4308.f9605.f13641.f68414;
                    c21723 = viewOnClickListenerC4308.f9598.f13641;
                    iM55682 = C0946.m55979("᩺ܺ") ^ i9;
                    i4 = ((iM55682 ^ i10) * (-13065)) ^ (-1672098022);
                    i5 = -589884782;
                    r7 = r8;
                    int i115 = iM55682 ^ i5;
                    c20539M12511 = c20539M12511;
                    c20539M12512 = c20539M12512;
                    strM56016 = strM56016;
                    i12 = i115;
                    i11 = i4;
                    r8 = r7;
                    c20671M55888 = c20671M55888;
                    break;
            }
            return;
        }
    }
}
