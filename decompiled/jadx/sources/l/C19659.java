package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵ᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C19659 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۧ۠֫, reason: not valid java name and contains not printable characters */
    private static final short[] f63473;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final PackageManager f63474;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63475;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC2040 f63476;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19697 f63477;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f63478;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f63479;

    static {
        ApplicationC12518.m30701(143);
        f63473 = new short[]{4332, -15769, -15767, -15769, -15761, -15746, -15763, -15775, -15773, -15840, -15761, -15776, -15766, -15748, -15775, -15769, -15766, -15840, -15746, -15765, -15748, -15773, -15769, -15747, -15747, -15769, -15775, -15776, -15840, -15799, -15797, -15782, -15791, -15801, -15808, -15779, -15782, -15793, -15806, -15806, -15797, -15798, -15791, -15793, -15778, -15778, -15779, -16833, 21001, 22331, 23052, 17350, -18438, -29328, 23081, -23680, 20562, -25641, -19299, -22492, 19750, 24458};
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public native void mo1007(Exception exc);

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ViewOnClickListenerC2040 viewOnClickListenerC2040 = null;
        C3430 c3430 = null;
        C12346 c12346 = null;
        boolean z = false;
        C3430 c3431 = null;
        C12346 c12347 = null;
        C19697 c19697 = null;
        int i = 1128880764;
        int i2 = C1128.f4106;
        int i3 = C3432.f10845;
        int iM6981 = C2105.m6981("ܺ֨") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-665)) ^ 1750268122;
        int i5 = -516923952;
        while (true) {
            i = ((((i ^ i2) * (-3105)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1979097687:
                case 1251968308:
                    C1773.m5908();
                    C4075.m12263();
                    iM6981 = C2105.m6981("ۚ᩹") ^ i2;
                    i4 = ((iM6981 ^ i3) * 23237) ^ (-1615602942);
                    i5 = 1183767115;
                    break;
                case -1968612981:
                case 1899212482:
                    C0422.m1963();
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("۠֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12909)) ^ (-1206981579);
                        i5 = -1549234835;
                    } else {
                        iM6981 = C0630.m2566("ᩴۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27113)) ^ 1993860537;
                        i5 = -628930523;
                    }
                    break;
                case -1839433636:
                case 1936084431:
                    C1047.m3593(c19697);
                    iM6981 = (i3 - C2105.m6981("ܿۗ")) * (-15);
                    i4 = ((iM6981 ^ i2) * (-19447)) ^ 1412258030;
                    i5 = 1703063312;
                    break;
                case -1713527339:
                case 1339174717:
                    c12347.m29958(z);
                    c19697 = this.f63477;
                    if (c19697 != null) {
                        iM6981 = (C2105.m6981("ܰۤ") ^ i2) * (-23);
                        i4 = ((iM6981 ^ i3) * 9651) ^ 192733199;
                        i5 = -1370235264;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܿۗ")) * (-15);
                        i4 = ((iM6981 ^ i2) * (-19447)) ^ 1412258030;
                        i5 = 1703063312;
                    }
                    break;
                case -1577676478:
                case 381422724:
                    C3245.m9925();
                    if (C3245.f10203 > 0) {
                        iM6981 = C0630.m2566("ᩴۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27113)) ^ 1993860537;
                        i5 = -628930523;
                    } else {
                        iM6981 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    }
                    break;
                case -1446595520:
                case -1116016787:
                    c12346.m29958(z);
                    c3431 = viewOnClickListenerC2040.f6815;
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("۠֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12909)) ^ (-1206981579);
                        i5 = -1549234835;
                    } else {
                        iM6981 = C2105.m6981("֫ۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9177)) ^ 618121685;
                        i5 = 1859616075;
                    }
                    break;
                case -1351041042:
                case 1411703638:
                    viewOnClickListenerC2040 = this.f63476;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("ᩴۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27113)) ^ 1993860537;
                        i5 = -628930523;
                    } else {
                        iM6981 = C0630.m2566("᩹۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6707)) ^ 296470079;
                        i5 = 1333348386;
                    }
                    break;
                case -1111899240:
                case -137677995:
                    c12346 = c3430.f10840;
                    z = false;
                    if (C22628.m50615() != 0) {
                        iM6981 = (C0630.m2566("ᩴᩴ") ^ i2) * 27;
                        i4 = ((iM6981 ^ i3) * (-14513)) ^ 1211073049;
                        i5 = -1753803686;
                    } else {
                        iM6981 = C0630.m2566("᩸ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7605) ^ (-1353722883);
                        i5 = -1241656363;
                    }
                    break;
                case -1053731722:
                case 106862496:
                    viewOnClickListenerC2040.f6812 = false;
                    viewOnClickListenerC2040.m6697();
                    break;
                case -1039165244:
                case 1902592445:
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("۠֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12909)) ^ (-1206981579);
                        i5 = -1549234835;
                    } else {
                        iM6981 = C2105.m6981("֨ۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8543)) ^ 901675409;
                        i5 = 1018322267;
                    }
                    break;
                case -876439082:
                case -693534783:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    } else {
                        iM6981 = (C0630.m2566("ܺ᩺") + i3) * (-67);
                        i4 = ((iM6981 ^ i2) * (-15921)) ^ 881680800;
                        i5 = -1301339065;
                    }
                    break;
                case -771459835:
                case 1529694724:
                    C1005.m3501();
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    } else {
                        iM6981 = C2105.m6981("ۚ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * 23237) ^ (-1615602942);
                        i5 = 1183767115;
                    }
                    break;
                case -607940369:
                case 2131287886:
                    c12347 = c3431.f10840;
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    } else {
                        iM6981 = (C2105.m6981("ܺ᩹") + i2) * 115;
                        i4 = ((iM6981 ^ i3) * (-19395)) ^ (-1569050575);
                        i5 = -1676530984;
                    }
                    break;
                case -96224849:
                case 688238927:
                    c3430 = viewOnClickListenerC2040.f6822;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    } else {
                        iM6981 = (C0630.m2566("ۢ֨") + i3) * (-115);
                        i4 = ((iM6981 ^ i2) * 8173) ^ (-866108789);
                        i5 = 1353947651;
                    }
                    break;
                case 347773011:
                case 684084225:
                    if (C1005.f3721) {
                        iM6981 = (C0630.m2566("᩸۟") + i2) * (-49);
                        i4 = ((iM6981 ^ i3) * (-11267)) ^ 2053353468;
                        i5 = 796616124;
                    } else {
                        iM6981 = (C0630.m2566("ᩴᩴ") ^ i2) * 27;
                        i4 = ((iM6981 ^ i3) * (-14513)) ^ 1211073049;
                        i5 = -1753803686;
                    }
                    break;
                case 360014349:
                case 1207858296:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C0630.m2566("ᩴᩴ") ^ i2) * 27;
                        i4 = ((iM6981 ^ i3) * (-14513)) ^ 1211073049;
                        i5 = -1753803686;
                    } else {
                        iM6981 = C0630.m2566("۟᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15613) ^ 2120584807;
                        i5 = -1582420990;
                    }
                    break;
                case 1309291356:
                case 1857730597:
                    C0382.m1848();
                    break;
                default:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27133) ^ 1582890872;
                        i5 = -7666443;
                    } else {
                        iM6981 = C0630.m2566("ۡۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27781) ^ 1863337679;
                        i5 = -1018805754;
                    }
                    break;
            }
            return;
        }
    }

    public C19659(ViewOnClickListenerC2040 viewOnClickListenerC2040, int i) {
        int i2 = 1346903155;
        int i3 = C1294.f4556;
        int i4 = C3245.f10203;
        this.f63476 = viewOnClickListenerC2040;
        this.f63475 = i;
        int iM2566 = (C0630.m2566("֫۬") + i4) * (-41);
        int i5 = ((iM2566 ^ i3) * (-6327)) ^ (-1537630671);
        int i6 = -857165150;
        while (true) {
            i2 = ((((i2 ^ i3) * 14179) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -1829848862:
                case -405774423:
                    this.f63478 = true;
                    return;
                case -1560995358:
                case 1273170394:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("᩻ᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-27137)) ^ (-834329129);
                        i6 = 1904937407;
                    } else {
                        iM2566 = C2105.m6981("֡ۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-20505)) ^ 1216891373;
                        i6 = 1549669579;
                    }
                    break;
                case -1452577329:
                case -1350261140:
                    if (C0630.f2410 > 0) {
                        iM2566 = (i3 - C2105.m6981("᩺۠")) * 75;
                        i5 = ((iM2566 ^ i4) * (-17179)) ^ 2021259703;
                        i6 = -151203876;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۛ") ^ i4) * 93;
                        i5 = ((iM2566 ^ i3) * (-11791)) ^ (-1823879764);
                        i6 = -710305797;
                    }
                    break;
                case -1335481557:
                case 159558823:
                    C0382.m1848();
                    if (!C0798.f2919) {
                        iM2566 = C2105.m6981("᩻ᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-27137)) ^ (-834329129);
                        i6 = 1904937407;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۛ") ^ i4) * 93;
                        i5 = ((iM2566 ^ i3) * (-11791)) ^ (-1823879764);
                        i6 = -710305797;
                    }
                    break;
                case -974030340:
                case 1406949896:
                    C3245.m9925();
                    iM2566 = C2105.m6981("᩻ᩳ") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-27137)) ^ (-834329129);
                    i6 = 1904937407;
                    break;
                case -609093363:
                case 1142909351:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("ᩴۛ") ^ i4) * 93;
                        i5 = ((iM2566 ^ i3) * (-11791)) ^ (-1823879764);
                        i6 = -710305797;
                    } else {
                        iM2566 = C2105.m6981("ۜܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 21441) ^ 1595772772;
                        i6 = 1055048053;
                    }
                    break;
                case -561975092:
                case -350362114:
                    C0630.m2564();
                    throw new RuntimeException();
                case -212461690:
                case 2024593160:
                    if (C2272.f7362) {
                        iM2566 = C0630.m2566("᩵ܶ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 9481) ^ 1699384414;
                        i6 = 1461635939;
                    } else {
                        iM2566 = (C0630.m2566("ܽܰ") ^ i4) * (-119);
                        i5 = ((iM2566 ^ i3) * 29593) ^ (-858757901);
                        i6 = 1804171953;
                    }
                    break;
                case -132823511:
                case 210281029:
                    C0798.m2998();
                    if (RunnableC1937.f6483 < 0) {
                        iM2566 = C2105.m6981("᩸ۗ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-13391)) ^ 11094015;
                        i6 = -1912683173;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩺۠")) * 75;
                        i5 = ((iM2566 ^ i4) * (-17179)) ^ 2021259703;
                        i6 = -151203876;
                    }
                    break;
                case -106663078:
                case 1489400574:
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("᩵ܶ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 9481) ^ 1699384414;
                        i6 = 1461635939;
                    } else {
                        iM2566 = C0630.m2566("۠ܿ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-237)) ^ 230920407;
                        i6 = -1333784151;
                    }
                    break;
                case 356429114:
                case 479937226:
                    if (C2520.m8026()) {
                        iM2566 = C2105.m6981("᩸ۗ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-13391)) ^ 11094015;
                        i6 = -1912683173;
                    } else {
                        iM2566 = C0630.m2566("ۡۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 15681) ^ 195782691;
                        i6 = 234714065;
                    }
                    break;
                case 478115614:
                case 529038301:
                    if (RunnableC1108.f4040) {
                        iM2566 = (C2105.m6981("ۤ۫") ^ i4) * (-67);
                        i5 = ((iM2566 ^ i3) * 11209) ^ 548305074;
                        i6 = -1104323372;
                    } else {
                        iM2566 = C2105.m6981("᩸ۗ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-13391)) ^ 11094015;
                        i6 = -1912683173;
                    }
                    break;
                case 584008652:
                case 1037840499:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("᩻ᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-27137)) ^ (-834329129);
                        i6 = 1904937407;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩵ܳ")) * (-117);
                        i5 = ((iM2566 ^ i4) * (-2015)) ^ (-1619422980);
                        i6 = 767831626;
                    }
                    break;
                case 750236363:
                case 1867424034:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("ᩴۛ") ^ i4) * 93;
                        i5 = ((iM2566 ^ i3) * (-11791)) ^ (-1823879764);
                        i6 = -710305797;
                    } else {
                        iM2566 = C0630.m2566("᩻ܳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-31023)) ^ (-580047372);
                        i6 = -1916483073;
                    }
                    break;
                case 800771589:
                case 1409211390:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("᩻ᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-27137)) ^ (-834329129);
                        i6 = 1904937407;
                    } else {
                        iM2566 = (C0630.m2566("ۡ֫") + i4) * (-63);
                        i5 = ((iM2566 ^ i3) * 5729) ^ 1681960445;
                        i6 = -617927636;
                    }
                    break;
                default:
                    this.f63474 = viewOnClickListenerC2040.getPackageManager();
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C0630.m2566("ᩴۛ") ^ i4) * 93;
                        i5 = ((iM2566 ^ i3) * (-11791)) ^ (-1823879764);
                        i6 = -710305797;
                    } else {
                        iM2566 = C0630.m2566("ۧ᩻") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-25141)) ^ 704291700;
                        i6 = 248388311;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        ViewOnClickListenerC2040 viewOnClickListenerC2040 = null;
        C3430 c3430 = null;
        C12346 c12346 = null;
        boolean z = false;
        C3430 c3431 = null;
        int i = -191841447;
        int i2 = C0483.f2088;
        int i3 = C3911.f12484;
        int iM2566 = (i2 - C0630.m2566("ۢۜ")) * 11;
        int i4 = ((iM2566 ^ i3) * (-2203)) ^ 161909860;
        int i5 = -1180053335;
        while (true) {
            i = ((((i ^ i3) * 11531) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1628312107:
                case -943184226:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("ۘ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30207)) ^ 1702325422;
                        i5 = -805774693;
                    } else {
                        iM2566 = C0630.m2566("ۡ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31799) ^ (-200070023);
                        i5 = -256602211;
                    }
                    break;
                case -1463095532:
                case 1669013735:
                    c12346.m29958(z);
                    c3431 = viewOnClickListenerC2040.f6815;
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("ۨۖ") + i3) * 123;
                        i4 = ((iM2566 ^ i2) * (-24185)) ^ (-1533925665);
                        i5 = 642371781;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۤۛ")) * (-53);
                        i4 = ((iM2566 ^ i3) * 23347) ^ (-1249269857);
                        i5 = -1187611829;
                    }
                    break;
                case -1391293537:
                case 1355220837:
                    c3430 = viewOnClickListenerC2040.f6822;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("ۘ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30207)) ^ 1702325422;
                        i5 = -805774693;
                    } else {
                        iM2566 = C2105.m6981("᩹ۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 16879) ^ (-1727381681);
                        i5 = -1230583862;
                    }
                    break;
                case -1025460891:
                case -1007486794:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C0630.m2566("ۨ᩻") + i3) * (-95);
                        i4 = ((iM2566 ^ i2) * (-31739)) ^ (-730184737);
                        i5 = -1783154135;
                    } else {
                        iM2566 = (C2105.m6981("ۚۜ") ^ i2) * 79;
                        i4 = ((iM2566 ^ i3) * 9301) ^ 1981857513;
                        i5 = 1158249178;
                    }
                    break;
                case -993241906:
                case 723330592:
                    C1504.m5179();
                    iM2566 = C2105.m6981("ۘ֨") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-30207)) ^ 1702325422;
                    i5 = -805774693;
                    break;
                case -991122047:
                case 1511660041:
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C0630.m2566("ۨۖ") + i3) * 123;
                        i4 = ((iM2566 ^ i2) * (-24185)) ^ (-1533925665);
                        i5 = 642371781;
                    } else {
                        iM2566 = C2105.m6981("ܰܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-23205)) ^ 1935272318;
                        i5 = -1400628428;
                    }
                    break;
                case -909860172:
                case 1628991093:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۘ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30207)) ^ 1702325422;
                        i5 = -805774693;
                    } else {
                        iM2566 = C2105.m6981("ۧܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 8911) ^ (-1508026660);
                        i5 = -838935283;
                    }
                    break;
                case -408768657:
                case 1825421771:
                    if (C1294.m4372() <= 0) {
                        iM2566 = (C0630.m2566("ۨ᩻") + i3) * (-95);
                        i4 = ((iM2566 ^ i2) * (-31739)) ^ (-730184737);
                        i5 = -1783154135;
                    } else {
                        iM2566 = (C2105.m6981("۟᩵") + i2) * (-49);
                        i4 = ((iM2566 ^ i3) * 25837) ^ (-413064887);
                        i5 = -1997666638;
                    }
                    break;
                case -569194:
                case 171096442:
                    if (C1773.m5908() <= 0) {
                        iM2566 = (C0630.m2566("ۨ᩻") + i3) * (-95);
                        i4 = ((iM2566 ^ i2) * (-31739)) ^ (-730184737);
                        i5 = -1783154135;
                    } else {
                        iM2566 = (C2105.m6981("ܰۛ") ^ i2) * 81;
                        i4 = ((iM2566 ^ i3) * (-8465)) ^ 232049673;
                        i5 = -896737459;
                    }
                    break;
                case 282809672:
                case 517168160:
                    C0237.m1481();
                    break;
                case 317048219:
                case 1940368183:
                    C1916.m6308();
                    if (AbstractC2021.f6743 > 0) {
                        iM2566 = (C0630.m2566("ۨۖ") + i3) * 123;
                        i4 = ((iM2566 ^ i2) * (-24185)) ^ (-1533925665);
                        i5 = 642371781;
                    } else {
                        iM2566 = C2105.m6981("ۘ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30207)) ^ 1702325422;
                        i5 = -805774693;
                    }
                    break;
                case 328886804:
                case 1127138420:
                    if (C0382.f1805) {
                        iM2566 = (i3 - C0630.m2566("ۢ᩹")) * 13;
                        i4 = ((iM2566 ^ i2) * (-16813)) ^ 2042863379;
                        i5 = -1286703012;
                    } else {
                        iM2566 = (C0630.m2566("ۨ᩻") + i3) * (-95);
                        i4 = ((iM2566 ^ i2) * (-31739)) ^ (-730184737);
                        i5 = -1783154135;
                    }
                    break;
                case 374818352:
                case 1476328491:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C0630.m2566("ۨۖ") + i3) * 123;
                        i4 = ((iM2566 ^ i2) * (-24185)) ^ (-1533925665);
                        i5 = 642371781;
                    } else {
                        iM2566 = C0630.m2566("ᩳۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-21705)) ^ (-1047131186);
                        i5 = -860223805;
                    }
                    break;
                case 802351882:
                case 881604000:
                    viewOnClickListenerC2040 = this.f63476;
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C0630.m2566("ۨۖ") + i3) * 123;
                        i4 = ((iM2566 ^ i2) * (-24185)) ^ (-1533925665);
                        i5 = 642371781;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֡ۤ")) * 87;
                        i4 = ((iM2566 ^ i2) * 28507) ^ 681413579;
                        i5 = -1856576751;
                    }
                    break;
                case 1254624744:
                case 1346820702:
                    c12346 = c3430.f10840;
                    z = true;
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("ۨ᩻") + i3) * (-95);
                        i4 = ((iM2566 ^ i2) * (-31739)) ^ (-730184737);
                        i5 = -1783154135;
                    } else {
                        iM2566 = C2105.m6981("۬ܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12841) ^ 711051371;
                        i5 = -2053579972;
                    }
                    break;
                default:
                    c3431.f10840.m29958(z);
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
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        int iM6981;
        int i;
        PackageManager packageManager = null;
        int i2 = 0;
        List<PackageInfo> installedPackages = null;
        Iterator itM6374 = null;
        C15134 c15134 = null;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        int i3 = -982612344;
        int i4 = AbstractC2021.f6743;
        int i5 = ServiceConnectionC3453.f10921;
        int iM6982 = C2105.m6981("᩷ۡ") ^ i5;
        int i6 = ((iM6982 ^ i4) * 10363) ^ (-540749999);
        int i7 = 609028986;
        while (true) {
            int i8 = iM6982 ^ i7;
            ArrayList arrayList = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-10361)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1971888082:
                    case 1349023002:
                        RunnableC3474.m10618(c15134);
                        if (C1128.f4106 <= 0) {
                            iM6981 = C2105.m6981("ܶ᩵") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-24823)) ^ (-507624454);
                            i = 1751842751;
                        } else {
                            iM6981 = (C2105.m6981("᩹ۨ") ^ i4) * (-95);
                            i6 = ((iM6981 ^ i5) * (-11417)) ^ (-857094978);
                            i = 1101189900;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1958653090:
                    case -139300833:
                        if (C0483.m2123(itM6374)) {
                            iM6981 = (C2105.m6981("۠ܿ") + i4) * 69;
                            i6 = ((iM6981 ^ i5) * 28041) ^ 2004540980;
                            i = -59810536;
                        } else {
                            iM6981 = (C0630.m2566("ۙۗ") + i4) * (-49);
                            i6 = ((iM6981 ^ i5) * 27883) ^ (-1789468544);
                            i = 1868605628;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1767572352:
                    case -1063389350:
                        this.f63477 = C3468.m10610(C9255.m23770());
                        break;
                    case -1604628750:
                    case -719033684:
                        packageInfo = (PackageInfo) C2272.m7513(itM6374);
                        applicationInfo = packageInfo.applicationInfo;
                        if (applicationInfo != null) {
                            iM6981 = (C0630.m2566("ᩴܶ") ^ i5) * (-45);
                            i6 = ((iM6981 ^ i4) * 14807) ^ (-1895362302);
                            i = 95547039;
                        } else {
                            iM6981 = C0630.m2566("۫۟") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-16399)) ^ (-697676170);
                            i = 457529403;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1436994074:
                    case 1120271909:
                        ServiceConnectionC3453.m10564();
                        if (C3245.f10203 <= 0) {
                            iM6981 = C2105.m6981("ܶ᩵") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-24823)) ^ (-507624454);
                            i = 1751842751;
                        } else {
                            iM6981 = C0630.m2566("ۜ۟") ^ i5;
                            i6 = ((iM6981 ^ i4) * 26795) ^ (-1851361128);
                            i = -394814850;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1042496171:
                    case 1052805571:
                        C2958.m9034();
                        iM6981 = C0630.m2566("ܿۗ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 14683) ^ 1241873454;
                        i = -320112714;
                        i8 = iM6981 ^ i;
                        break;
                    case -927349440:
                    case 1391686130:
                        packageManager = this.f63474;
                        if (C0050.f910 >= 0) {
                            iM6981 = C2105.m6981("ܶ᩵") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-24823)) ^ (-507624454);
                            i = 1751842751;
                        } else {
                            iM6981 = C2105.m6981("ۚۗ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-16487)) ^ 1174014194;
                            i = 1829077913;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -441075253:
                    case 1001379623:
                        if (C2520.m8026()) {
                            iM6981 = C0630.m2566("ۜ۟") ^ i5;
                            i6 = ((iM6981 ^ i4) * 26795) ^ (-1851361128);
                            i = -394814850;
                        } else {
                            iM6981 = C0630.m2566("ܰ᩹") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-29803)) ^ (-212664078);
                            i = -1281219172;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -414572452:
                    case 1727603023:
                        if (C3245.f10203 <= 0) {
                            iM6981 = C0630.m2566("ܿۗ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 14683) ^ 1241873454;
                            i = -320112714;
                        } else {
                            iM6981 = (i5 - C2105.m6981("ۧ۬")) * (-73);
                            i6 = ((iM6981 ^ i4) * (-16287)) ^ (-1413232419);
                            i = 793771640;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -240442384:
                    case 1307223907:
                        i2 = 0;
                        if (C5695.f17556 >= 0) {
                            iM6981 = C0630.m2566("ܿۗ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 14683) ^ 1241873454;
                            i = -320112714;
                        } else {
                            iM6981 = (C0630.m2566("֫ᩳ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i6 = ((iM6981 ^ i5) * (-27111)) ^ (-1518430187);
                            i = -1929592165;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 1861054:
                    case 1564732153:
                        C11340.m28031();
                        C2105.m6982();
                        break;
                    case 75543693:
                    case 319199685:
                        C4117.m12364();
                        if (AbstractC2021.f6743 > 0) {
                            iM6981 = C0630.m2566("ܿۗ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 14683) ^ 1241873454;
                            i = -320112714;
                        } else {
                            iM6981 = C2105.m6981("ܶ᩵") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-24823)) ^ (-507624454);
                            i = 1751842751;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 77748648:
                    case 1564880809:
                        if (applicationInfo.sourceDir != null) {
                            iM6981 = (i4 - C0630.m2566("ۙۖ")) * (-71);
                            i6 = ((iM6981 ^ i5) * 25959) ^ 1271738241;
                            i = -2017377252;
                        } else {
                            iM6981 = C0630.m2566("۫۟") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-16399)) ^ (-697676170);
                            i = 457529403;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 85157416:
                    case 1217349923:
                        int iM7032 = C2126.m7032(installedPackages);
                        if (!C0382.f1805) {
                        }
                        arrayList = new ArrayList(iM7032);
                        if (C0630.f2410 <= 0) {
                            iM6981 = C0630.m2566("ܿۗ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 14683) ^ 1241873454;
                            i = -320112714;
                        } else {
                            iM6981 = (C2105.m6981("ᩴ᩻") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((iM6981 ^ i5) * (-26737)) ^ (-1390935890);
                            i = 643761439;
                        }
                        i8 = iM6981 ^ i;
                        break;
                        break;
                    case 105922451:
                    case 2021768742:
                        c15134 = (C15134) C22518.m50492();
                        if (C4117.f13076 <= 0) {
                            iM6981 = C0630.m2566("ܿۗ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 14683) ^ 1241873454;
                            i = -320112714;
                        } else {
                            iM6981 = (i5 - C0630.m2566("ۜ۫")) * 71;
                            i6 = ((iM6981 ^ i4) * (-21079)) ^ 538085808;
                            i = 855592265;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 390037525:
                    case 1599416741:
                        if (C5695.f17556 >= 0) {
                            iM6981 = (i5 - C2105.m6981("ۧ۬")) * (-73);
                            i6 = ((iM6981 ^ i4) * (-16287)) ^ (-1413232419);
                            i = 793771640;
                        } else {
                            iM6981 = C2105.m6981("ᩴᩳ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 12407) ^ (-135976569);
                            i = -1591862164;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 414655422:
                    case 1413181926:
                        installedPackages = packageManager.getInstalledPackages(i2);
                        C9255.m23767();
                        if (C21923.f70183 == 0) {
                            iM6981 = (C2105.m6981("᩺ۢ") + i5) * (-15);
                            i6 = ((iM6981 ^ i4) * (-18831)) ^ 1288037088;
                            i = 1439127227;
                            i8 = iM6981 ^ i;
                        }
                        break;
                    case 1691002753:
                    case 1898951594:
                        ArrayList arrayList2 = this.f63479;
                        if (RunnableC0588.f2309 >= 0) {
                            iM6981 = (i5 - C2105.m6981("ۧ۬")) * (-73);
                            i6 = ((iM6981 ^ i4) * (-16287)) ^ (-1413232419);
                            i = 793771640;
                        } else {
                            C1916.m6307(arrayList2, new C4841(packageInfo));
                            iM6981 = C0630.m2566("۫۟") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-16399)) ^ (-697676170);
                            i = 457529403;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    default:
                        this.f63479 = arrayList;
                        itM6374 = RunnableC1937.m6374(installedPackages);
                        iM6981 = C0630.m2566("۫۟") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-16399)) ^ (-697676170);
                        i = 457529403;
                        i8 = iM6981 ^ i;
                        break;
                }
                return;
            }
            iM6982 = C0630.m2566("ۚۖ") ^ i4;
            i6 = ((iM6982 ^ i5) * 10219) ^ (-701951210);
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
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int iM2568;
        int i4;
        int i5;
        ?? r6;
        int iM6981;
        int i6;
        int i7;
        ?? r7;
        C19119 c19119;
        C19119 c191110;
        int i8;
        final C19659 c19659 = this;
        int i9 = C2167.f7158;
        int i10 = C4117.f13076;
        int iM2569 = C0630.m2566("᩸᩸") ^ i9;
        int i11 = ((iM2569 ^ i10) * (-7441)) ^ (-121749478);
        C19119 c19119M10472 = null;
        C19119 c19119M10473 = null;
        DialogInterfaceOnClickListenerC18953 dialogInterfaceOnClickListenerC18953 = null;
        String strM6573 = null;
        String strM3502 = null;
        int i12 = iM2569 ^ (-157777168);
        ViewOnClickListenerC2040 viewOnClickListenerC2040 = null;
        int i13 = 0;
        boolean z = false;
        int iM25610 = 0;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = -215442019;
        DialogInterface.OnClickListener onClickListener = null;
        String strM2575 = null;
        int iM6982 = 0;
        C19258 c19258M5912 = null;
        String strM7159 = null;
        InterfaceC12344 interfaceC12344 = null;
        ExecutorService executorService = null;
        C20364 c20364 = null;
        String str = null;
        ?? r8 = 0;
        while (true) {
            i16 = i12 ^ (i11 & (((i16 ^ i10) * 28219) >> 31));
            switch (i16) {
                case -2120700344:
                case -1090225748:
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    viewOnClickListenerC2040 = c19659.f63476;
                    c19119M10472 = viewOnClickListenerC2040.f6822.m10472(c19659.f63479);
                    c19119M10473 = viewOnClickListenerC2040.f6815.m10472(c19659.f63479);
                    if (C3245.f10203 <= 0) {
                        iM2566 = C2105.m6981("֨ۤ") ^ i9;
                        i = ((iM2566 ^ i10) * 10641) ^ (-108541020);
                        i2 = -289755804;
                    } else {
                        iM2566 = C2105.m6981("ܰ᩹") ^ i10;
                        i = ((iM2566 ^ i9) * 3963) ^ 772550440;
                        i2 = 1688410101;
                    }
                    i8 = iM2566 ^ i2;
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    i12 = i8;
                    i11 = i;
                    break;
                case -2091938178:
                case 1198166651:
                    i13 = 128;
                    iM2568 = (i10 - C2105.m6981("᩶ۖ")) * 83;
                    i4 = ((iM2568 ^ i9) * 22523) ^ 1871800437;
                    i5 = -1547151731;
                    r7 = r8;
                    int i17 = iM2568 ^ i5;
                    c19119M10472 = c19119M10472;
                    c19119M10473 = c19119M10473;
                    strM7159 = strM7159;
                    i12 = i17;
                    i11 = i4;
                    r8 = r7;
                    c19258M5912 = c19258M5912;
                    break;
                case -1894658821:
                case 1793011195:
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    if (viewOnClickListenerC2040.f6822.f10837.f65737.size() > r8) {
                        strM7159 = strM7159;
                        iM6981 = C2105.m6981("᩶᩺") ^ i9;
                        i6 = ((iM6981 ^ i10) * 19747) ^ 896104428;
                        i7 = -1731041595;
                        i12 = iM6981 ^ i7;
                        i11 = i6;
                        r8 = r8;
                        c19258M5912 = c19258M5912;
                    } else {
                        iM2566 = (i9 - C0630.m2566("ۚ᩸")) * (-113);
                        i = ((iM2566 ^ i10) * 10875) ^ 1693812996;
                        i2 = 679744649;
                        i8 = iM2566 ^ i2;
                        strM7159 = strM7159;
                        c19258M5912 = c19258M5912;
                        i12 = i8;
                        i11 = i;
                    }
                    break;
                case -1797680951:
                case -518655597:
                    i13 = 49678;
                    iM2568 = (i10 - C2105.m6981("᩶ۖ")) * 83;
                    i4 = ((iM2568 ^ i9) * 22523) ^ 1871800437;
                    i5 = -1547151731;
                    r7 = r8;
                    int i18 = iM2568 ^ i5;
                    c19119M10472 = c19119M10472;
                    c19119M10473 = c19119M10473;
                    strM7159 = strM7159;
                    i12 = i18;
                    i11 = i4;
                    r8 = r7;
                    c19258M5912 = c19258M5912;
                    break;
                case -1616018430:
                case -1024300193:
                    strM7159 = strM7159;
                    C2520.m8029(c19258M5912, C2105.m6981(strM2575) ^ 2099429992, null);
                    if (C2167.f7158 < 0) {
                        iM2567 = (C0630.m2566("ܺܰ") + i10) * q.h;
                        i = ((iM2567 ^ i9) * 22677) ^ 1778130044;
                        i3 = 339652213;
                        i8 = iM2567 ^ i3;
                        strM7159 = strM7159;
                        i12 = i8;
                        i11 = i;
                    }
                    c19258M5912 = c19258M5912;
                    iM2566 = (C2105.m6981("ۜۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM2566 ^ i9) * (-16615)) ^ (-445579542);
                    i2 = 1127579538;
                    i8 = iM2566 ^ i2;
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    i12 = i8;
                    i11 = i;
                    break;
                case -1446247814:
                case 326480782:
                    if (C1128.f4106 > 0) {
                        strM7159 = strM7159;
                        c19258M5912 = c19258M5912;
                        c19119M10472 = c19119M10472;
                        c19119M10473 = c19119M10473;
                        r6 = r8;
                        iM2568 = C2105.m6981("۫᩷") ^ i9;
                        i4 = ((iM2568 ^ i10) * 3725) ^ 288021816;
                        i5 = -1385480026;
                        r7 = r6;
                        int i19 = iM2568 ^ i5;
                        c19119M10472 = c19119M10472;
                        c19119M10473 = c19119M10473;
                        strM7159 = strM7159;
                        i12 = i19;
                        i11 = i4;
                        r8 = r7;
                        c19258M5912 = c19258M5912;
                    } else {
                        strM7159 = strM7159;
                        c19119 = c19119M10472;
                        c191110 = c19119M10473;
                        int iM25611 = (C0630.m2566("۠᩵") + i10) * (-49);
                        c19119M10472 = c19119;
                        c19119M10473 = c191110;
                        strM7159 = strM7159;
                        i12 = iM25611 ^ (-2045420647);
                        i11 = ((iM25611 ^ i9) * 24103) ^ (-935814965);
                        c19659 = this;
                    }
                    break;
                case -1324332755:
                case 2000744107:
                    strM7159 = strM7159;
                    if (viewOnClickListenerC2040.f6810) {
                        iM2567 = (C0630.m2566("᩶ܿ") ^ i9) * (-125);
                        i = ((iM2567 ^ i10) * (-9589)) ^ 1462109674;
                        i3 = 702659554;
                    } else {
                        iM2567 = (i10 - C2105.m6981("֫ܽ")) * 59;
                        i = ((iM2567 ^ i9) * 16099) ^ (-1100509107);
                        i3 = -931629847;
                    }
                    i8 = iM2567 ^ i3;
                    strM7159 = strM7159;
                    i12 = i8;
                    i11 = i;
                    break;
                case -1293370416:
                case 967935921:
                    Context applicationContext = viewOnClickListenerC2040.getApplicationContext();
                    c19258M5912 = c19258M5912;
                    strM7159 = C2167.m7159(f63473, 6, 41, i13);
                    if (C0881.m3229(applicationContext, strM7159) != 0) {
                        iM6981 = C2105.m6981("֫ۨ") ^ i9;
                        i6 = ((iM6981 ^ i10) * (-22815)) ^ (-615430374);
                        i7 = 1749447574;
                    } else {
                        iM6981 = C2105.m6981("᩶᩺") ^ i9;
                        i6 = ((iM6981 ^ i10) * 19747) ^ 896104428;
                        i7 = -1731041595;
                    }
                    i12 = iM6981 ^ i7;
                    i11 = i6;
                    r8 = r8;
                    c19258M5912 = c19258M5912;
                    break;
                case -1273420321:
                case 1102389804:
                    C5695.m16017(c19258M5912, C0630.m2566(strM3502) ^ 2125627235, dialogInterfaceOnClickListenerC18953);
                    C3683.m11213(c19258M5912);
                    c19258M5912 = c19258M5912;
                    iM6981 = C2105.m6981("᩶᩺") ^ i9;
                    i6 = ((iM6981 ^ i10) * 19747) ^ 896104428;
                    i7 = -1731041595;
                    i12 = iM6981 ^ i7;
                    i11 = i6;
                    r8 = r8;
                    c19258M5912 = c19258M5912;
                    break;
                case -1247251634:
                case -672352069:
                    strM7159 = strM7159;
                    C1294.m4380(c19258M5912, iM6982 ^ 2117022031, onClickListener);
                    strM2575 = C0630.m2575(f63473, 56, 3, i13);
                    if (!C1005.f3721) {
                        c19258M5912 = c19258M5912;
                        c19119M10472 = c19119M10472;
                        c19119M10473 = c19119M10473;
                        r6 = r8;
                        iM2568 = C2105.m6981("۫᩷") ^ i9;
                        i4 = ((iM2568 ^ i10) * 3725) ^ 288021816;
                        i5 = -1385480026;
                        r7 = r6;
                        int i110 = iM2568 ^ i5;
                        c19119M10472 = c19119M10472;
                        c19119M10473 = c19119M10473;
                        strM7159 = strM7159;
                        i12 = i110;
                        i11 = i4;
                        r8 = r7;
                        c19258M5912 = c19258M5912;
                    } else {
                        iM2567 = C0630.m2566("᩸ۗ") ^ i9;
                        i = ((iM2567 ^ i10) * 477) ^ (-882992645);
                        i3 = 463985702;
                        i8 = iM2567 ^ i3;
                        strM7159 = strM7159;
                        i12 = i8;
                        i11 = i;
                    }
                    break;
                case -1128529571:
                case 1950170220:
                    C3537.m10746();
                    if (!C1711.f5919) {
                        strM7159 = strM7159;
                        c19119 = c19119M10472;
                        c191110 = c19119M10473;
                        int iM25612 = (C0630.m2566("۠᩵") + i10) * (-49);
                        c19119M10472 = c19119;
                        c19119M10473 = c191110;
                        strM7159 = strM7159;
                        i12 = iM25612 ^ (-2045420647);
                        i11 = ((iM25612 ^ i9) * 24103) ^ (-935814965);
                        c19659 = this;
                    } else {
                        strM7159 = strM7159;
                        c19258M5912 = c19258M5912;
                        iM2566 = C2105.m6981("֨ۤ") ^ i9;
                        i = ((iM2566 ^ i10) * 10641) ^ (-108541020);
                        i2 = -289755804;
                        i8 = iM2566 ^ i2;
                        strM7159 = strM7159;
                        c19258M5912 = c19258M5912;
                        i12 = i8;
                        i11 = i;
                    }
                    break;
                case -1111415028:
                case 1682395865:
                    strM7159 = strM7159;
                    C7106.m19114(c19258M5912, C2105.m6981(strM6573) ^ 2102970073);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۘᩴ᩷
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i20) {
                            C19659 c196510 = null;
                            int i21 = -1076034565;
                            int i22 = C4616.f14690;
                            int i23 = ViewOnClickListenerC1958.f6529;
                            int iM6983 = (C2105.m6981("۬᩶") + i22) * 99;
                            int i24 = ((iM6983 ^ i23) * 17663) ^ 886046277;
                            int i25 = -956848787;
                            while (true) {
                                i21 = ((((i21 ^ i23) * 6645) >> 31) & i24) ^ (iM6983 ^ i25);
                                switch (i21) {
                                    case -2035653643:
                                    case 2088015222:
                                        C0483.m2121();
                                        break;
                                    case -1985885255:
                                    case -565190395:
                                        RunnableC3474.m10630();
                                        if (C7106.f21815 == 0) {
                                            iM6983 = C2105.m6981("ۖۚ") ^ i22;
                                            i24 = ((iM6983 ^ i23) * 8445) ^ 284789788;
                                            i25 = 178503027;
                                        } else {
                                            iM6983 = C0630.m2566("ܳ۫") ^ i22;
                                            i24 = ((iM6983 ^ i23) * (-20047)) ^ (-641190212);
                                            i25 = -1609475283;
                                        }
                                        break;
                                    case -1853927350:
                                    case 743179186:
                                        C0422.m1963();
                                        if (RunnableC1937.m6387() != 0) {
                                            iM6983 = (i23 - C0630.m2566("ܺᩴ")) * 123;
                                            i24 = ((iM6983 ^ i22) * 2255) ^ (-1735292003);
                                            i25 = -1293390646;
                                        } else {
                                            iM6983 = C2105.m6981("ۖۚ") ^ i22;
                                            i24 = ((iM6983 ^ i23) * 8445) ^ 284789788;
                                            i25 = 178503027;
                                        }
                                        break;
                                    case -1674706129:
                                    case 1297198949:
                                        if (C2167.f7158 >= 0) {
                                            iM6983 = (i23 - C0630.m2566("ܺᩴ")) * 123;
                                            i24 = ((iM6983 ^ i22) * 2255) ^ (-1735292003);
                                            i25 = -1293390646;
                                        } else {
                                            iM6983 = C2105.m6981("ܰۤ") ^ i23;
                                            i24 = ((iM6983 ^ i22) * (-29401)) ^ (-11949558);
                                            i25 = -2064416841;
                                        }
                                        break;
                                    case -1660223257:
                                    case -811684331:
                                        if (C3683.f11629 >= 0) {
                                            iM6983 = C0630.m2566("ܳ۫") ^ i22;
                                            i24 = ((iM6983 ^ i23) * (-20047)) ^ (-641190212);
                                            i25 = -1609475283;
                                        } else {
                                            iM6983 = C0630.m2566("ۤ᩷") ^ i23;
                                            i24 = ((iM6983 ^ i22) * 29875) ^ 297682806;
                                            i25 = 1246877043;
                                        }
                                        break;
                                    case -1172011677:
                                    case 1757202720:
                                        c196510 = this.f13106;
                                        if (C2520.f8000 >= 0) {
                                            iM6983 = C0630.m2566("᩹֫") ^ i22;
                                            i24 = ((iM6983 ^ i23) * 10847) ^ (-1123328829);
                                            i25 = 183822112;
                                        } else {
                                            iM6983 = (C0630.m2566("֫ۘ") + i22) * (-51);
                                            i24 = ((iM6983 ^ i23) * 23931) ^ (-1436452609);
                                            i25 = 467812850;
                                        }
                                        break;
                                    case -903037429:
                                    case -791658956:
                                        if (C4117.f13076 <= 0) {
                                            iM6983 = C2105.m6981("ۖۚ") ^ i22;
                                            i24 = ((iM6983 ^ i23) * 8445) ^ 284789788;
                                            i25 = 178503027;
                                        } else {
                                            iM6983 = (C2105.m6981("ۡᩴ") + i23) * 71;
                                            i24 = ((iM6983 ^ i22) * 12037) ^ (-1882321411);
                                            i25 = 1050266822;
                                        }
                                        break;
                                    case -329753633:
                                    case -145061726:
                                        C3537.m10746();
                                        C3019.m9255();
                                        iM6983 = C0630.m2566("ܳ۫") ^ i22;
                                        i24 = ((iM6983 ^ i23) * (-20047)) ^ (-641190212);
                                        i25 = -1609475283;
                                        break;
                                    case 52860086:
                                    case 1787652440:
                                        if (C7106.f21815 != 0) {
                                            iM6983 = C0630.m2566("ܳ۫") ^ i22;
                                            i24 = ((iM6983 ^ i23) * (-20047)) ^ (-641190212);
                                            i25 = -1609475283;
                                        } else {
                                            iM6983 = (i23 - C0630.m2566("֡۟")) * 29;
                                            i24 = ((iM6983 ^ i22) * (-7869)) ^ (-564866299);
                                            i25 = -2104637778;
                                        }
                                        break;
                                    case 91801659:
                                    case 2001346561:
                                        if (C21923.f70183 != 0) {
                                            iM6983 = C2105.m6981("֡᩵") ^ i23;
                                            i24 = ((iM6983 ^ i22) * (-49)) ^ 197606928;
                                            i25 = -1199884516;
                                        } else {
                                            iM6983 = C0630.m2566("ۨ۟") ^ i23;
                                            i24 = ((iM6983 ^ i22) * 13153) ^ (-350788350);
                                            i25 = 494613148;
                                        }
                                        break;
                                    case 295833057:
                                    case 1039400563:
                                        if (C0050.m940() <= 0) {
                                            iM6983 = C2105.m6981("֡᩵") ^ i23;
                                            i24 = ((iM6983 ^ i22) * (-49)) ^ 197606928;
                                            i25 = -1199884516;
                                        } else {
                                            iM6983 = C2105.m6981("ۢۛ") ^ i22;
                                            i24 = ((iM6983 ^ i23) * (-32493)) ^ (-1811840584);
                                            i25 = -1146093026;
                                        }
                                        break;
                                    case 473612366:
                                    case 1401684059:
                                        ViewOnClickListenerC2040 viewOnClickListenerC2041 = c196510.f63476;
                                        viewOnClickListenerC2041.f6811 = true;
                                        C22474.m50422(viewOnClickListenerC2041, viewOnClickListenerC2041.getPackageName());
                                        break;
                                    case 510820695:
                                    case 810855245:
                                        if (C0630.f2410 <= 0) {
                                            iM6983 = C0630.m2566("᩹֫") ^ i22;
                                            i24 = ((iM6983 ^ i23) * 10847) ^ (-1123328829);
                                            i25 = 183822112;
                                        } else {
                                            iM6983 = (i22 - C0630.m2566("֨ܺ")) * (-45);
                                            i24 = ((iM6983 ^ i23) * (-29225)) ^ (-1169517963);
                                            i25 = 843021148;
                                        }
                                        break;
                                    case 1088124069:
                                    case 1566349083:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM6983 = C0630.m2566("ܳ۫") ^ i22;
                                            i24 = ((iM6983 ^ i23) * (-20047)) ^ (-641190212);
                                            i25 = -1609475283;
                                        } else {
                                            iM6983 = (C0630.m2566("ܿۤ") + i22) * 49;
                                            i24 = ((iM6983 ^ i23) * (-15499)) ^ 422176160;
                                            i25 = 661675088;
                                        }
                                        break;
                                    case 1230522972:
                                    case 1990707550:
                                        if (C4616.f14690 <= 0) {
                                            iM6983 = C2105.m6981("ۖۚ") ^ i22;
                                            i24 = ((iM6983 ^ i23) * 8445) ^ 284789788;
                                            i25 = 178503027;
                                        } else {
                                            iM6983 = C0630.m2566("ۗۤ") ^ i22;
                                            i24 = ((iM6983 ^ i23) * (-16003)) ^ 2023236876;
                                            i25 = 2078774070;
                                        }
                                        break;
                                    default:
                                        if (C7811.f24123 >= 0) {
                                            iM6983 = C2105.m6981("֡᩵") ^ i23;
                                            i24 = ((iM6983 ^ i22) * (-49)) ^ 197606928;
                                            i25 = -1199884516;
                                        } else {
                                            iM6983 = C0630.m2566("ܳ۫") ^ i22;
                                            i24 = ((iM6983 ^ i23) * (-20047)) ^ (-641190212);
                                            i25 = -1609475283;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    iM2567 = (C2105.m6981("ܽ᩺") ^ i10) * 43;
                    i = ((iM2567 ^ i9) * (-1557)) ^ 724946019;
                    i3 = -1815609718;
                    i8 = iM2567 ^ i3;
                    strM7159 = strM7159;
                    i12 = i8;
                    i11 = i;
                    break;
                case -936112546:
                case 2093768320:
                    strM7159 = strM7159;
                    c19258M5912 = C1773.m5912(viewOnClickListenerC2040);
                    iM25610 = C0630.m2566(C0798.m3005(f63473, 47, 3, i13));
                    i14 = 2130064265;
                    if (AbstractC2021.f6743 > 0) {
                        iM2567 = (C2105.m6981("۟۫") + i10) * 57;
                        i = ((iM2567 ^ i9) * (-2281)) ^ 1727962505;
                        i3 = 214447566;
                        i8 = iM2567 ^ i3;
                        strM7159 = strM7159;
                        i12 = i8;
                        i11 = i;
                    } else {
                        c19119 = c19119M10472;
                        c191110 = c19119M10473;
                        int iM25613 = (C0630.m2566("۠᩵") + i10) * (-49);
                        c19119M10472 = c19119;
                        c19119M10473 = c191110;
                        strM7159 = strM7159;
                        i12 = iM25613 ^ (-2045420647);
                        i11 = ((iM25613 ^ i9) * 24103) ^ (-935814965);
                        c19659 = this;
                    }
                    break;
                case -926616465:
                case 705785931:
                    C19039.m43890(viewOnClickListenerC2040, new String[]{strM7159}, 23680);
                    break;
                case -751408090:
                case 73506150:
                    C0714.m2805();
                    if (C7811.f24123 < 0) {
                        strM7159 = strM7159;
                        c19258M5912 = c19258M5912;
                        iM2566 = (C2105.m6981("ۜۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i9) * (-16615)) ^ (-445579542);
                        i2 = 1127579538;
                        i8 = iM2566 ^ i2;
                        strM7159 = strM7159;
                        c19258M5912 = c19258M5912;
                        i12 = i8;
                        i11 = i;
                    } else {
                        strM7159 = strM7159;
                        c19258M5912 = c19258M5912;
                        c19119M10472 = c19119M10472;
                        c19119M10473 = c19119M10473;
                        r6 = r8;
                        iM2568 = C2105.m6981("۫᩷") ^ i9;
                        i4 = ((iM2568 ^ i10) * 3725) ^ 288021816;
                        i5 = -1385480026;
                        r7 = r6;
                        int i111 = iM2568 ^ i5;
                        c19119M10472 = c19119M10472;
                        c19119M10473 = c19119M10473;
                        strM7159 = strM7159;
                        i12 = i111;
                        i11 = i4;
                        r8 = r7;
                        c19258M5912 = c19258M5912;
                    }
                    break;
                case -603848284:
                case 1099408423:
                    break;
                case -479894889:
                case 1643491135:
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    C0630.m2560(executorService, new RunnableC2415(1, c19659));
                    final int i20 = c19659.f63475;
                    C1005.m3499(new Thread(new Runnable(c19659) { // from class: l.ܺᩴ᩷

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C19659 f49694;

                        {
                            int i21 = 1973461816;
                            int i22 = C5695.f17556;
                            int i23 = C3245.f10203;
                            int iM25614 = C0630.m2566("ۨ᩹") ^ i22;
                            int i24 = ((iM25614 ^ i23) * 30879) ^ (-1102132638);
                            int i25 = -617102331;
                            while (true) {
                                i21 = ((((i21 ^ i23) * 21095) >> 31) & i24) ^ (iM25614 ^ i25);
                                switch (i21) {
                                    case -2094189802:
                                    case -1621134186:
                                        C1711.m5736();
                                        if (RunnableC0588.m2441() >= 0) {
                                            iM25614 = C0630.m2566("ۤۤ") ^ i23;
                                            i24 = ((iM25614 ^ i22) * 25231) ^ (-1858392120);
                                            i25 = 1930074191;
                                        } else {
                                            iM25614 = (C2105.m6981("᩷ۡ") + i22) * 15;
                                            i24 = ((iM25614 ^ i23) * (-24451)) ^ (-1491784593);
                                            i25 = -854594041;
                                        }
                                        break;
                                    case -1846958462:
                                    case 675629455:
                                        if (C3019.m9255() <= 0) {
                                            iM25614 = (C0630.m2566("᩺᩺") ^ i23) * 95;
                                            i24 = ((iM25614 ^ i22) * (-32753)) ^ (-464381783);
                                            i25 = -52087864;
                                        } else {
                                            iM25614 = (i23 - C0630.m2566("۫᩸")) * 97;
                                            i24 = ((iM25614 ^ i22) * (-23151)) ^ (-738019945);
                                            i25 = 689867260;
                                        }
                                        break;
                                    case -1731113537:
                                    case -272960877:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM25614 = C0630.m2566("ۤۤ") ^ i23;
                                            i24 = ((iM25614 ^ i22) * 25231) ^ (-1858392120);
                                            i25 = 1930074191;
                                        } else {
                                            iM25614 = (i22 - C2105.m6981("ۢ᩻")) * 5;
                                            i24 = ((iM25614 ^ i23) * (-30227)) ^ (-1885291300);
                                            i25 = 2016090168;
                                        }
                                        break;
                                    case -1418588246:
                                    case 301173267:
                                        if (!C2520.m8026()) {
                                            iM25614 = (C2105.m6981("᩷ۡ") + i22) * 15;
                                            i24 = ((iM25614 ^ i23) * (-24451)) ^ (-1491784593);
                                            i25 = -854594041;
                                        } else {
                                            iM25614 = (C0630.m2566("᩺᩺") ^ i23) * 95;
                                            i24 = ((iM25614 ^ i22) * (-32753)) ^ (-464381783);
                                            i25 = -52087864;
                                        }
                                        break;
                                    case -1230766632:
                                    case 933995536:
                                        C2272.m7503();
                                        C0798.m2998();
                                        throw new RuntimeException();
                                    case -1121679611:
                                    case -752445200:
                                        if (C0964.f3626 != 0) {
                                            iM25614 = (C2105.m6981("᩷ۡ") + i22) * 15;
                                            i24 = ((iM25614 ^ i23) * (-24451)) ^ (-1491784593);
                                            i25 = -854594041;
                                        } else {
                                            iM25614 = C2105.m6981("ܿܽ") ^ i22;
                                            i24 = ((iM25614 ^ i23) * (-3887)) ^ (-325150276);
                                            i25 = -982348282;
                                        }
                                        break;
                                    case -1056336434:
                                    case 69761230:
                                        if (C1504.m5179()) {
                                            iM25614 = (i23 - C0630.m2566("֡ۙ")) * 97;
                                            i24 = ((iM25614 ^ i22) * 22931) ^ (-483516951);
                                            i25 = -1755020113;
                                        } else {
                                            iM25614 = (C0630.m2566("᩺᩺") ^ i23) * 95;
                                            i24 = ((iM25614 ^ i22) * (-32753)) ^ (-464381783);
                                            i25 = -52087864;
                                        }
                                        break;
                                    case -635049394:
                                    case 456252756:
                                        if (C3537.f11231 >= 0) {
                                            iM25614 = C0630.m2566("ۤۤ") ^ i23;
                                            i24 = ((iM25614 ^ i22) * 25231) ^ (-1858392120);
                                            i25 = 1930074191;
                                        } else {
                                            iM25614 = (i23 - C0630.m2566("᩺ۛ")) * 37;
                                            i24 = ((iM25614 ^ i22) * 28119) ^ 1554016684;
                                            i25 = -1648012404;
                                        }
                                        break;
                                    case 212086936:
                                    case 580852477:
                                        if (C1047.f3863 >= 0) {
                                            iM25614 = (i22 - C2105.m6981("ܽ᩸")) * (-73);
                                            i24 = ((iM25614 ^ i23) * 955) ^ (-445087356);
                                            i25 = -992986318;
                                        } else {
                                            iM25614 = C0630.m2566("᩻֡") ^ i23;
                                            i24 = ((iM25614 ^ i22) * (-16217)) ^ (-287201999);
                                            i25 = 915922362;
                                        }
                                        break;
                                    case 280255690:
                                    case 351125332:
                                        return;
                                    case 429304499:
                                    case 905974979:
                                        this.f49694 = c19659;
                                        if (C3019.f9544 >= 0) {
                                            iM25614 = (C0630.m2566("᩺᩺") ^ i23) * 95;
                                            i24 = ((iM25614 ^ i22) * (-32753)) ^ (-464381783);
                                            i25 = -52087864;
                                        } else {
                                            iM25614 = (i23 - C2105.m6981("᩷᩹")) * (-119);
                                            i24 = ((iM25614 ^ i22) * 30451) ^ 66952806;
                                            i25 = 671550022;
                                        }
                                        break;
                                    case 625489896:
                                    case 1628718502:
                                        if (C3663.f11553) {
                                            iM25614 = C0630.m2566("ۤۤ") ^ i23;
                                            i24 = ((iM25614 ^ i22) * 25231) ^ (-1858392120);
                                            i25 = 1930074191;
                                        } else {
                                            iM25614 = (C0630.m2566("᩷᩺") + i22) * 19;
                                            i24 = ((iM25614 ^ i23) * 9641) ^ (-878971626);
                                            i25 = 1516229760;
                                        }
                                        break;
                                    case 646036583:
                                    case 1408753020:
                                        if (C0630.f2410 <= 0) {
                                            iM25614 = C0630.m2566("ܶ۠") ^ i22;
                                            i24 = ((iM25614 ^ i23) * 22229) ^ 1595657984;
                                            i25 = -54244306;
                                        } else {
                                            iM25614 = C2105.m6981("ۗۧ") ^ i22;
                                            i24 = ((iM25614 ^ i23) * 803) ^ 133487875;
                                            i25 = -931148465;
                                        }
                                        break;
                                    case 666310622:
                                    case 1366498471:
                                        C1420.m4913();
                                        if (!C0798.f2919) {
                                            iM25614 = (C0630.m2566("᩺᩺") ^ i23) * 95;
                                            i24 = ((iM25614 ^ i22) * (-32753)) ^ (-464381783);
                                            i25 = -52087864;
                                        } else {
                                            iM25614 = C0630.m2566("ܶ۠") ^ i22;
                                            i24 = ((iM25614 ^ i23) * 22229) ^ 1595657984;
                                            i25 = -54244306;
                                        }
                                        break;
                                    case 1725397839:
                                    case 1739991727:
                                        if (C0422.f1886 <= 0) {
                                            iM25614 = C0630.m2566("ۤۤ") ^ i23;
                                            i24 = ((iM25614 ^ i22) * 25231) ^ (-1858392120);
                                            i25 = 1930074191;
                                        } else {
                                            iM25614 = C2105.m6981("᩵ۗ") ^ i22;
                                            i24 = ((iM25614 ^ i23) * 405) ^ (-620726812);
                                            i25 = -810876504;
                                        }
                                        break;
                                    default:
                                        ServiceConnectionC3453.m10564();
                                        iM25614 = (C0630.m2566("᩺᩺") ^ i23) * 95;
                                        i24 = ((iM25614 ^ i22) * (-32753)) ^ (-464381783);
                                        i25 = -52087864;
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            int i21 = 0;
                            C19659 c196510 = null;
                            ViewOnClickListenerC2040 viewOnClickListenerC2041 = null;
                            long j = 0;
                            int i22 = 1754216266;
                            int i23 = C3245.f10203;
                            int i24 = RunnableC3474.f10992;
                            int iM25614 = C0630.m2566("ۖۛ") ^ i24;
                            int i25 = ((iM25614 ^ i23) * 10425) ^ 1416575593;
                            int i26 = 1299423927;
                            while (true) {
                                i22 = ((((i22 ^ i23) * 2589) >> 31) & i25) ^ (iM25614 ^ i26);
                                switch (i22) {
                                    case -2006954759:
                                    case -400203274:
                                        if (C3746.f11829 <= 0) {
                                            iM25614 = C0630.m2566("᩷ܶ") ^ i23;
                                            i25 = ((iM25614 ^ i24) * (-30257)) ^ (-35624324);
                                            i26 = 892729430;
                                        } else {
                                            iM25614 = (C0630.m2566("۟ۨ") + i23) * 101;
                                            i25 = ((iM25614 ^ i24) * (-8205)) ^ (-442894862);
                                            i26 = -992942381;
                                        }
                                        break;
                                    case -1973496549:
                                    case 391093153:
                                        if (!C0798.f2919) {
                                            iM25614 = C2105.m6981("ܽܽ") ^ i24;
                                            i25 = ((iM25614 ^ i23) * 11601) ^ 659771476;
                                            i26 = 1127040210;
                                        } else {
                                            iM25614 = (C0630.m2566("ܿ᩷") + i24) * 123;
                                            i25 = ((iM25614 ^ i23) * 827) ^ (-1164585362);
                                            i26 = 225773473;
                                        }
                                        break;
                                    case -1922534871:
                                    case -228744165:
                                        C2520.m8026();
                                        if (C3537.f11231 < 0) {
                                            iM25614 = (C0630.m2566("ܿ᩷") + i24) * 123;
                                            i25 = ((iM25614 ^ i23) * 827) ^ (-1164585362);
                                            i26 = 225773473;
                                        } else {
                                            iM25614 = C2105.m6981("ۚᩳ") ^ i23;
                                            i25 = ((iM25614 ^ i24) * 19101) ^ 331553899;
                                            i26 = 304988664;
                                        }
                                        break;
                                    case -1911647779:
                                    case 20738310:
                                        if (C3911.f12484 >= 0) {
                                            iM25614 = C2105.m6981("ܽܽ") ^ i24;
                                            i25 = ((iM25614 ^ i23) * 11601) ^ 659771476;
                                            i26 = 1127040210;
                                        } else {
                                            iM25614 = C0630.m2566("ܿۛ") ^ i23;
                                            i25 = ((iM25614 ^ i24) * (-2413)) ^ 1604664358;
                                            i26 = -1859316652;
                                        }
                                        break;
                                    case -1757366995:
                                    case 2105012898:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM25614 = (i24 - C2105.m6981("ۨ᩸")) * (-73);
                                            i25 = ((iM25614 ^ i23) * 19963) ^ (-405854765);
                                            i26 = -1725464430;
                                        } else {
                                            iM25614 = C2105.m6981("ۜۨ") ^ i24;
                                            i25 = ((iM25614 ^ i23) * (-10821)) ^ (-29965988);
                                            i26 = -376808744;
                                        }
                                        break;
                                    case -1589995338:
                                    case 748271071:
                                        i21 = i20;
                                        if (C2272.m7503()) {
                                            iM25614 = C0630.m2566("᩷ܶ") ^ i23;
                                            i25 = ((iM25614 ^ i24) * (-30257)) ^ (-35624324);
                                            i26 = 892729430;
                                        } else {
                                            iM25614 = (C2105.m6981("ۘ᩸") + i23) * 15;
                                            i25 = ((iM25614 ^ i24) * 23183) ^ (-234491020);
                                            i26 = -1838506923;
                                        }
                                        break;
                                    case -1551673953:
                                    case -1010750116:
                                        try {
                                            SystemClock.sleep(j);
                                            ViewOnClickListenerC2040.m6658(viewOnClickListenerC2041, viewOnClickListenerC2041.f6822.f10837.f65737, viewOnClickListenerC2041.f6822.f10842, viewOnClickListenerC2041.f6816, i21);
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        iM25614 = C0630.m2566("᩵ᩴ") ^ i24;
                                        i25 = ((iM25614 ^ i23) * 13607) ^ (-1093746320);
                                        i26 = -1426160103;
                                        break;
                                    case -1483768601:
                                    case -262288771:
                                        if (C1504.m5179()) {
                                            iM25614 = C0630.m2566("ܶ֫") ^ i23;
                                            i25 = ((iM25614 ^ i24) * o.a.a) ^ 698626240;
                                            i26 = 1639133067;
                                        } else {
                                            iM25614 = (C0630.m2566("ܿ᩷") + i24) * 123;
                                            i25 = ((iM25614 ^ i23) * 827) ^ (-1164585362);
                                            i26 = 225773473;
                                        }
                                        break;
                                    case -1315579021:
                                    case -1176641865:
                                        if (C4075.f12947 >= 0) {
                                            iM25614 = (C0630.m2566("ܿ᩷") + i24) * 123;
                                            i25 = ((iM25614 ^ i23) * 827) ^ (-1164585362);
                                            i26 = 225773473;
                                        } else {
                                            iM25614 = C0630.m2566("᩹֫") ^ i24;
                                            i25 = ((iM25614 ^ i23) * (-761)) ^ 1899282107;
                                            i26 = -966358248;
                                        }
                                        break;
                                    case -1307021598:
                                    case 671199915:
                                        if (C7106.f21815 != 0) {
                                            iM25614 = C0630.m2566("ܿۛ") ^ i23;
                                            i25 = ((iM25614 ^ i24) * (-2413)) ^ 1604664358;
                                            i26 = -1859316652;
                                        } else {
                                            iM25614 = C2105.m6981("ۛ۟") ^ i24;
                                            i25 = ((iM25614 ^ i23) * (-27189)) ^ 498956667;
                                            i26 = -1273777362;
                                        }
                                        break;
                                    case -1286296768:
                                    case -404868771:
                                        C1504.m5179();
                                        break;
                                    case -887683797:
                                    case 1034078445:
                                        break;
                                    case -877211081:
                                    case -705059353:
                                        if (C3683.f11629 >= 0) {
                                            iM25614 = C2105.m6981("ܽܽ") ^ i24;
                                            i25 = ((iM25614 ^ i23) * 11601) ^ 659771476;
                                            i26 = 1127040210;
                                        } else {
                                            iM25614 = C2105.m6981("ܶ۬") ^ i23;
                                            i25 = ((iM25614 ^ i24) * (-26925)) ^ (-1394066611);
                                            i26 = -1813224083;
                                        }
                                        break;
                                    case -647387883:
                                    case 454291850:
                                        if (C3537.m10746() <= 0) {
                                            iM25614 = C0630.m2566("ܿۛ") ^ i23;
                                            i25 = ((iM25614 ^ i24) * (-2413)) ^ 1604664358;
                                            i26 = -1859316652;
                                        } else {
                                            iM25614 = (C2105.m6981("ܰܶ") + i23) * 31;
                                            i25 = ((iM25614 ^ i24) * (-12787)) ^ (-1510914886);
                                            i26 = 80494073;
                                        }
                                        break;
                                    case -407986164:
                                    case 1532512784:
                                        viewOnClickListenerC2041 = c196510.f63476;
                                        j = 100;
                                        iM25614 = C0630.m2566("ۗۗ") ^ i23;
                                        i25 = ((iM25614 ^ i24) * (-32133)) ^ (-1768904700);
                                        i26 = -507990060;
                                        break;
                                    case 281858790:
                                    case 1137349334:
                                        c196510 = this.f49694;
                                        if (C2958.f9394 >= 0) {
                                            iM25614 = (i24 - C2105.m6981("ۨ᩸")) * (-73);
                                            i25 = ((iM25614 ^ i23) * 19963) ^ (-405854765);
                                            i26 = -1725464430;
                                        } else {
                                            iM25614 = C2105.m6981("᩺᩵") ^ i24;
                                            i25 = ((iM25614 ^ i23) * (-2375)) ^ (-1747533934);
                                            i26 = 984729734;
                                        }
                                        break;
                                    case 326948188:
                                    case 1592149286:
                                        if (C0237.f1507 != 0) {
                                            iM25614 = C0630.m2566("᩷ܶ") ^ i23;
                                            i25 = ((iM25614 ^ i24) * (-30257)) ^ (-35624324);
                                            i26 = 892729430;
                                        } else {
                                            iM25614 = (C2105.m6981("ۤ᩹") ^ i24) * (-61);
                                            i25 = ((iM25614 ^ i23) * (-27903)) ^ 559515615;
                                            i26 = -1338197342;
                                        }
                                        break;
                                    case 583495391:
                                    case 1230425214:
                                        C3537.m10746();
                                        C0714.m2805();
                                        iM25614 = C0630.m2566("ܿۛ") ^ i23;
                                        i25 = ((iM25614 ^ i24) * (-2413)) ^ 1604664358;
                                        i26 = -1859316652;
                                        break;
                                    default:
                                        if (C3746.f11829 <= 0) {
                                            iM25614 = C0630.m2566("᩷ܶ") ^ i23;
                                            i25 = ((iM25614 ^ i24) * (-30257)) ^ (-35624324);
                                            i26 = 892729430;
                                        } else {
                                            iM25614 = C2105.m6981("ܽܽ") ^ i24;
                                            i25 = ((iM25614 ^ i23) * 11601) ^ 659771476;
                                            i26 = 1127040210;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    }));
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("ۜۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i9) * (-16615)) ^ (-445579542);
                        i2 = 1127579538;
                    } else {
                        C1005.m3499(new Thread(new Runnable(c19659) { // from class: l.ۖᩴ᩷

                            /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ C19659 f8497;

                            {
                                int i21 = -1930030891;
                                int i22 = C3911.f12484;
                                int i23 = C3432.f10845;
                                int iM25614 = (i23 - C0630.m2566("᩷֨")) * 115;
                                int i24 = ((iM25614 ^ i22) * 28119) ^ (-1882479446);
                                int i25 = -72271284;
                                while (true) {
                                    i21 = ((((i21 ^ i22) * (-8461)) >> 31) & i24) ^ (iM25614 ^ i25);
                                    switch (i21) {
                                        case -2046133446:
                                        case -603112574:
                                            if (C0964.f3626 != 0) {
                                                iM25614 = C0630.m2566("۠ۙ") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 18935) ^ 1733191853;
                                                i25 = -324001778;
                                            } else {
                                                iM25614 = (i23 - C2105.m6981("ۚ۠")) * 79;
                                                i24 = ((iM25614 ^ i22) * 17433) ^ 1403012645;
                                                i25 = 1603560463;
                                            }
                                            break;
                                        case -1952443323:
                                        case -658911761:
                                            if (C3019.m9255() <= 0) {
                                                iM25614 = C0630.m2566("۠ۙ") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 18935) ^ 1733191853;
                                                i25 = -324001778;
                                            } else {
                                                iM25614 = C2105.m6981("ۤۚ") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 16011) ^ (-2103312768);
                                                i25 = 979955451;
                                            }
                                            break;
                                        case -1887671899:
                                        case -1655100772:
                                            return;
                                        case -1840902751:
                                        case 715734504:
                                            C2520.m8026();
                                            if (C0964.f3626 != 0) {
                                                iM25614 = (C0630.m2566("ۜᩳ") + i22) * 89;
                                                i24 = ((iM25614 ^ i23) * 10975) ^ (-857539338);
                                                i25 = -1906146645;
                                            } else {
                                                iM25614 = C2105.m6981("ۘ۠") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            }
                                            break;
                                        case -1733716437:
                                        case -1331100445:
                                            if (C1128.f4106 <= 0) {
                                                iM25614 = (C0630.m2566("ۜᩳ") + i22) * 89;
                                                i24 = ((iM25614 ^ i23) * 10975) ^ (-857539338);
                                                i25 = -1906146645;
                                            } else {
                                                iM25614 = C2105.m6981("ᩳ᩹") ^ i22;
                                                i24 = ((iM25614 ^ i23) * (-8411)) ^ (-39063137);
                                                i25 = 1625953097;
                                            }
                                            break;
                                        case -1667955858:
                                        case 1503961311:
                                            if (RunnableC3474.f10992 <= 0) {
                                                iM25614 = C2105.m6981("᩶᩷") ^ i22;
                                                i24 = ((iM25614 ^ i23) * 27775) ^ 136213349;
                                                i25 = 704101235;
                                            } else {
                                                iM25614 = C2105.m6981("ۘ۠") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            }
                                            break;
                                        case -1559459113:
                                        case -1161459584:
                                            C5695.m16023();
                                            throw new RuntimeException();
                                        case -1392449767:
                                        case 1214251379:
                                            this.f8497 = c19659;
                                            if (C11340.f33930 >= 0) {
                                                iM25614 = C2105.m6981("ۘ۠") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            } else {
                                                iM25614 = C0630.m2566("ܳ۟") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 19779) ^ 2092326472;
                                                i25 = 1487478258;
                                            }
                                            break;
                                        case -1097854287:
                                        case -634120153:
                                            if (C3911.f12484 >= 0) {
                                                iM25614 = (C0630.m2566("ۜᩳ") + i22) * 89;
                                                i24 = ((iM25614 ^ i23) * 10975) ^ (-857539338);
                                                i25 = -1906146645;
                                            } else {
                                                iM25614 = C2105.m6981("ܿ᩸") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 18485) ^ 306496027;
                                                i25 = -1590046468;
                                            }
                                            break;
                                        case -886448409:
                                        case -29951475:
                                            C3683.m11222();
                                            C1128.m3851();
                                            iM25614 = C2105.m6981("ۘ۠") ^ i23;
                                            i24 = ((iM25614 ^ i22) * 10883) ^ (-2127053496);
                                            i25 = 265357472;
                                            break;
                                        case -820522073:
                                        case 1797110470:
                                            C2958.m9034();
                                            if (C0422.f1886 > 0) {
                                                iM25614 = C2105.m6981("ܳ۠") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 26261) ^ 1042105017;
                                                i25 = -1614970675;
                                            } else {
                                                iM25614 = C2105.m6981("ۘ۠") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            }
                                            break;
                                        case -393748792:
                                        case -58659562:
                                            if (C3245.f10203 <= 0) {
                                                iM25614 = C2105.m6981("᩶᩷") ^ i22;
                                                i24 = ((iM25614 ^ i23) * 27775) ^ 136213349;
                                                i25 = 704101235;
                                            } else {
                                                iM25614 = (C0630.m2566("۬᩵") + i22) * 83;
                                                i24 = ((iM25614 ^ i23) * (-25113)) ^ (-2029264266);
                                                i25 = 1130031249;
                                            }
                                            break;
                                        case -330671541:
                                        case 1107038457:
                                            if (AbstractC2021.m6574()) {
                                                iM25614 = C2105.m6981("ۘ۠") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            } else {
                                                iM25614 = C0630.m2566("᩵᩷") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 27675) ^ (-191908325);
                                                i25 = 1569770306;
                                            }
                                            break;
                                        case -107915358:
                                        case 338522317:
                                            if (C3432.f10845 >= 0) {
                                                iM25614 = (C0630.m2566("ۜᩳ") + i22) * 89;
                                                i24 = ((iM25614 ^ i23) * 10975) ^ (-857539338);
                                                i25 = -1906146645;
                                            } else {
                                                iM25614 = C0630.m2566("۫᩵") ^ i22;
                                                i24 = ((iM25614 ^ i23) * 15419) ^ 1038983290;
                                                i25 = -876640510;
                                            }
                                            break;
                                        case 761025021:
                                        case 1342039306:
                                            if (C1773.f6144 <= 0) {
                                                iM25614 = C2105.m6981("ۘ۠") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 10883) ^ (-2127053496);
                                                i25 = 265357472;
                                            } else {
                                                iM25614 = C2105.m6981("ܶۖ") ^ i22;
                                                i24 = ((iM25614 ^ i23) * 11505) ^ (-908794073);
                                                i25 = 1046089114;
                                            }
                                            break;
                                        default:
                                            if (C3911.m11924() <= 0) {
                                                iM25614 = C2105.m6981("ܳ۠") ^ i23;
                                                i24 = ((iM25614 ^ i22) * 26261) ^ 1042105017;
                                                i25 = -1614970675;
                                            } else {
                                                iM25614 = (i22 - C2105.m6981("ᩳܿ")) * (-87);
                                                i24 = ((iM25614 ^ i23) * 32001) ^ (-1238610869);
                                                i25 = 1705865370;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                int i21 = 0;
                                C19659 c196510 = null;
                                ViewOnClickListenerC2040 viewOnClickListenerC2041 = null;
                                long j = 0;
                                int i22 = 334257038;
                                int i23 = C1047.f3863;
                                int i24 = C4616.f14690;
                                int iM25614 = C0630.m2566("᩶ۢ") ^ i24;
                                int i25 = ((iM25614 ^ i23) * (-3613)) ^ (-2116912882);
                                int i26 = -1734320456;
                                while (true) {
                                    i22 = ((((i22 ^ i23) * 21995) >> 31) & i25) ^ (iM25614 ^ i26);
                                    switch (i22) {
                                        case -2066693415:
                                        case -88001046:
                                            if (C5695.f17556 >= 0) {
                                                iM25614 = C0630.m2566("᩵۬") ^ i24;
                                                i25 = ((iM25614 ^ i23) * 11281) ^ (-685272828);
                                                i26 = 1434710948;
                                            } else {
                                                iM25614 = (i24 - C0630.m2566("۬ᩳ")) * (-55);
                                                i25 = ((iM25614 ^ i23) * 699) ^ (-581574039);
                                                i26 = -1613319083;
                                            }
                                            break;
                                        case -1870568338:
                                        case 1979953773:
                                            if (C2958.f9394 >= 0) {
                                                iM25614 = (i23 - C0630.m2566("ᩴۜ")) * (-7);
                                                i25 = ((iM25614 ^ i24) * 29887) ^ (-1060850901);
                                                i26 = -294540467;
                                            } else {
                                                iM25614 = C0630.m2566("ܰ᩵") ^ i24;
                                                i25 = ((iM25614 ^ i23) * (-19923)) ^ 1906900526;
                                                i26 = -488113307;
                                            }
                                            break;
                                        case -1740635197:
                                        case 1940971917:
                                            if (C4263.f13799 <= 0) {
                                                iM25614 = C0630.m2566("᩵۬") ^ i24;
                                                i25 = ((iM25614 ^ i23) * 11281) ^ (-685272828);
                                                i26 = 1434710948;
                                            } else {
                                                iM25614 = C0630.m2566("ܶ᩹") ^ i23;
                                                i25 = ((iM25614 ^ i24) * 30409) ^ (-1990923593);
                                                i26 = -378580544;
                                            }
                                            break;
                                        case -1491987838:
                                        case -287100673:
                                            if (RunnableC0588.f2309 >= 0) {
                                                iM25614 = (C2105.m6981("ܽ֫") + i23) * (-117);
                                                i25 = ((iM25614 ^ i24) * 12243) ^ (-1157189508);
                                                i26 = -1529021304;
                                            } else {
                                                iM25614 = (C2105.m6981("ۚ᩹") ^ i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i25 = ((iM25614 ^ i23) * 25715) ^ (-849755767);
                                                i26 = 1712750190;
                                            }
                                            break;
                                        case -1429790025:
                                        case 255572573:
                                            if (C3537.f11231 >= 0) {
                                                iM25614 = (i24 - C0630.m2566("ܿۘ")) * (-51);
                                                i25 = ((iM25614 ^ i23) * 6895) ^ 391644108;
                                                i26 = 287945740;
                                            } else {
                                                iM25614 = C2105.m6981("۟۟") ^ i24;
                                                i25 = ((iM25614 ^ i23) * 28549) ^ 580791971;
                                                i26 = -1090844957;
                                            }
                                            break;
                                        case -1111681855:
                                        case 1948565987:
                                            try {
                                                SystemClock.sleep(j);
                                                ViewOnClickListenerC2040.m6658(viewOnClickListenerC2041, viewOnClickListenerC2041.f6815.f10837.f65737, viewOnClickListenerC2041.f6815.f10842, viewOnClickListenerC2041.f6816, i21);
                                                break;
                                            } catch (Exception unused) {
                                            }
                                            iM25614 = C0630.m2566("᩻ܶ") ^ i24;
                                            i25 = ((iM25614 ^ i23) * (-8347)) ^ 65311975;
                                            i26 = -1728531105;
                                            break;
                                        case -1105675436:
                                        case -1055553355:
                                            i21 = i20;
                                            if (C2105.m6982() != 0) {
                                                iM25614 = (i23 - C0630.m2566("ᩴۜ")) * (-7);
                                                i25 = ((iM25614 ^ i24) * 29887) ^ (-1060850901);
                                                i26 = -294540467;
                                            } else {
                                                iM25614 = C0630.m2566("᩹ۡ") ^ i23;
                                                i25 = ((iM25614 ^ i24) * (-2591)) ^ 1281442818;
                                                i26 = 502946447;
                                            }
                                            break;
                                        case -1103079548:
                                        case 1486468185:
                                            break;
                                        case -1000547104:
                                        case 157096370:
                                            if (C2520.m8026()) {
                                                iM25614 = (C2105.m6981("ܽ֫") + i23) * (-117);
                                                i25 = ((iM25614 ^ i24) * 12243) ^ (-1157189508);
                                                i26 = -1529021304;
                                            } else {
                                                iM25614 = (C2105.m6981("ۚۤ") ^ i23) * (-83);
                                                i25 = ((iM25614 ^ i24) * (-14385)) ^ 1665114676;
                                                i26 = -2032277467;
                                            }
                                            break;
                                        case -973096423:
                                        case -696610552:
                                            viewOnClickListenerC2041 = c196510.f63476;
                                            j = 100;
                                            iM25614 = C2105.m6981("֨ۡ") ^ i23;
                                            i25 = ((iM25614 ^ i24) * 16601) ^ (-1114502606);
                                            i26 = -111381837;
                                            break;
                                        case -809509580:
                                        case -297281512:
                                            ServiceConnectionC3453.m10564();
                                            if (C3245.f10203 <= 0) {
                                                iM25614 = (i24 - C0630.m2566("ܿۘ")) * (-51);
                                                i25 = ((iM25614 ^ i23) * 6895) ^ 391644108;
                                                i26 = 287945740;
                                            } else {
                                                iM25614 = C2105.m6981("ܳ֡") ^ i23;
                                                i25 = ((iM25614 ^ i24) * 6719) ^ 1349334259;
                                                i26 = -128393662;
                                            }
                                            break;
                                        case -758751675:
                                        case 838883604:
                                            if (C1128.f4106 <= 0) {
                                                iM25614 = (i23 - C0630.m2566("ᩴۜ")) * (-7);
                                                i25 = ((iM25614 ^ i24) * 29887) ^ (-1060850901);
                                                i26 = -294540467;
                                            } else {
                                                iM25614 = (C0630.m2566("ܰ᩸") + i23) * 11;
                                                i25 = ((iM25614 ^ i24) * 23981) ^ 1494587285;
                                                i26 = -1091185876;
                                            }
                                            break;
                                        case -594313778:
                                        case -211771883:
                                            if (C4263.m12819() >= 0) {
                                                iM25614 = C0630.m2566("᩵۬") ^ i24;
                                                i25 = ((iM25614 ^ i23) * 11281) ^ (-685272828);
                                                i26 = 1434710948;
                                            } else {
                                                iM25614 = C2105.m6981("ܳ֡") ^ i23;
                                                i25 = ((iM25614 ^ i24) * 6719) ^ 1349334259;
                                                i26 = -128393662;
                                            }
                                            break;
                                        case -453305593:
                                        case 1028759724:
                                            if (C7811.f24123 >= 0) {
                                                iM25614 = (i23 - C0630.m2566("ᩴۜ")) * (-7);
                                                i25 = ((iM25614 ^ i24) * 29887) ^ (-1060850901);
                                                i26 = -294540467;
                                            } else {
                                                iM25614 = (i24 - C0630.m2566("ܿۘ")) * (-51);
                                                i25 = ((iM25614 ^ i23) * 6895) ^ 391644108;
                                                i26 = 287945740;
                                            }
                                            break;
                                        case 252185455:
                                        case 867776728:
                                            c196510 = this.f8497;
                                            if (C4159.m12565() >= 0) {
                                                iM25614 = (C2105.m6981("ܽܺ") ^ i24) * 39;
                                                i25 = ((iM25614 ^ i23) * 4611) ^ (-1018726547);
                                                i26 = 41854508;
                                            } else {
                                                iM25614 = (C0630.m2566("۬ۜ") + i24) * 33;
                                                i25 = ((iM25614 ^ i23) * 8547) ^ 752302970;
                                                i26 = 674157368;
                                            }
                                            break;
                                        case 350255669:
                                        case 1508444375:
                                            if (C3537.f11231 < 0) {
                                                iM25614 = (C2105.m6981("ܽ֫") + i23) * (-117);
                                                i25 = ((iM25614 ^ i24) * 12243) ^ (-1157189508);
                                                i26 = -1529021304;
                                            } else {
                                                iM25614 = C2105.m6981("ܳ֡") ^ i23;
                                                i25 = ((iM25614 ^ i24) * 6719) ^ 1349334259;
                                                i26 = -128393662;
                                            }
                                            break;
                                        case 553291367:
                                        case 1679273642:
                                            if (RunnableC0588.m2441() >= 0) {
                                                iM25614 = C0630.m2566("᩵۬") ^ i24;
                                                i25 = ((iM25614 ^ i23) * 11281) ^ (-685272828);
                                                i26 = 1434710948;
                                            } else {
                                                iM25614 = (i23 - C2105.m6981("ۜۚ")) * (-59);
                                                i25 = ((iM25614 ^ i24) * 23607) ^ (-1535986874);
                                                i26 = 1786863032;
                                            }
                                            break;
                                        case 712184809:
                                        case 1933252211:
                                            C0630.m2564();
                                            iM25614 = C2105.m6981("ܳ֡") ^ i23;
                                            i25 = ((iM25614 ^ i24) * 6719) ^ 1349334259;
                                            i26 = -128393662;
                                            break;
                                        default:
                                            C0422.m1963();
                                            C0483.m2121();
                                            break;
                                    }
                                    return;
                                }
                            }
                        }));
                        interfaceC12344 = ApplicationC20075.f65008;
                        iM2566 = C2105.m6981("ۘ֫") ^ i10;
                        i = ((iM2566 ^ i9) * 17929) ^ (-231987654);
                        i2 = 965611373;
                    }
                    i8 = iM2566 ^ i2;
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    i12 = i8;
                    i11 = i;
                    break;
                case -449916643:
                case 1109211000:
                    RunnableC1937.m6387();
                    break;
                case -342567329:
                case 1362676:
                    strM7159 = strM7159;
                    iM6982 = C2105.m6981(C7811.m20837(f63473, 53, 3, i13));
                    if (C3663.f11553) {
                        iM2567 = (i9 - C0630.m2566("۫ܳ")) * (-15);
                        i = ((iM2567 ^ i10) * (-15191)) ^ 572355809;
                        i3 = 1201363960;
                    } else {
                        iM2567 = (C2105.m6981("ܳܽ") + i9) * (-93);
                        i = ((iM2567 ^ i10) * 3441) ^ (-1387934766);
                        i3 = -589833973;
                    }
                    i8 = iM2567 ^ i3;
                    strM7159 = strM7159;
                    i12 = i8;
                    i11 = i;
                    break;
                case 66271000:
                case 522133244:
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    c19119M10472 = c19119M10472;
                    c19119M10473 = c19119M10473;
                    int i21 = (s * s) + 304781764;
                    if ((i21 + i21) - (i15 * i15) >= 0) {
                        iM2568 = (i10 - C0630.m2566("ܰۗ")) * 87;
                        i4 = ((iM2568 ^ i9) * (-31809)) ^ (-246489600);
                        i5 = -353627191;
                        r7 = r8;
                    } else {
                        iM2568 = (C0630.m2566("֡ۧ") ^ i9) * (-111);
                        i4 = ((iM2568 ^ i10) * 28113) ^ 944923282;
                        i5 = -2064138437;
                        r7 = r8;
                    }
                    int i112 = iM2568 ^ i5;
                    c19119M10472 = c19119M10472;
                    c19119M10473 = c19119M10473;
                    strM7159 = strM7159;
                    i12 = i112;
                    i11 = i4;
                    r8 = r7;
                    c19258M5912 = c19258M5912;
                    break;
                case 92447412:
                case 1323148249:
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    c19119M10472 = c19119M10472;
                    c19119M10473 = c19119M10473;
                    ViewOnClickListenerC2040.m6657(viewOnClickListenerC2040, ViewOnClickListenerC2040.m6646(viewOnClickListenerC2040, c19119M10472, c19119M10473, str, c20364.f65738));
                    executorService = C1802.f6208;
                    r6 = r8;
                    if (C0382.m1848()) {
                        iM2568 = C2105.m6981("۫᩷") ^ i9;
                        i4 = ((iM2568 ^ i10) * 3725) ^ 288021816;
                        i5 = -1385480026;
                        r7 = r6;
                    } else {
                        iM2568 = C2105.m6981("ۗ᩻") ^ i10;
                        i4 = ((iM2568 ^ i9) * 30155) ^ (-2103232161);
                        i5 = -1247013196;
                        r7 = r8;
                    }
                    int i113 = iM2568 ^ i5;
                    c19119M10472 = c19119M10472;
                    c19119M10473 = c19119M10473;
                    strM7159 = strM7159;
                    i12 = i113;
                    i11 = i4;
                    r8 = r7;
                    c19258M5912 = c19258M5912;
                    break;
                case 386494627:
                case 801980886:
                    strM7159 = strM7159;
                    C19258 c19258 = c19258M5912;
                    c19119 = c19119M10472;
                    c191110 = c19119M10473;
                    short s2 = f63473[0];
                    int i22 = s2 + 17458;
                    if (C0630.f2410 <= 0) {
                        s = s2;
                        i15 = i22;
                        c19258M5912 = c19258;
                        int iM25614 = (C0630.m2566("۠᩵") + i10) * (-49);
                        c19119M10472 = c19119;
                        c19119M10473 = c191110;
                        strM7159 = strM7159;
                        i12 = iM25614 ^ (-2045420647);
                        i11 = ((iM25614 ^ i9) * 24103) ^ (-935814965);
                    } else {
                        int iM6983 = C2105.m6981("ۙᩳ") ^ i9;
                        s = s2;
                        i11 = ((iM6983 ^ i10) * (-5267)) ^ 458486779;
                        c19119M10472 = c19119;
                        c19119M10473 = c191110;
                        i15 = i22;
                        strM7159 = strM7159;
                        c19258M5912 = c19258;
                        i12 = iM6983 ^ (-968262560);
                    }
                    c19659 = this;
                    break;
                case 572907457:
                case 1866943513:
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    if (!C4263.m12818(interfaceC12344, RunnableC0588.m2436(f63473, 1, 5, i13), z)) {
                        iM2566 = C0630.m2566("ܿۖ") ^ i10;
                        i = ((iM2566 ^ i9) * (-4737)) ^ (-2069027318);
                        i2 = 1008095275;
                        i8 = iM2566 ^ i2;
                        strM7159 = strM7159;
                        c19258M5912 = c19258M5912;
                        i12 = i8;
                        i11 = i;
                    } else {
                        strM7159 = strM7159;
                        iM6981 = C2105.m6981("᩶᩺") ^ i9;
                        i6 = ((iM6981 ^ i10) * 19747) ^ 896104428;
                        i7 = -1731041595;
                        i12 = iM6981 ^ i7;
                        i11 = i6;
                        r8 = r8;
                        c19258M5912 = c19258M5912;
                    }
                    break;
                case 608373975:
                case 938252158:
                    C1711.m5736();
                    strM7159 = strM7159;
                    c19119 = c19119M10472;
                    c191110 = c19119M10473;
                    int iM25615 = (C0630.m2566("۠᩵") + i10) * (-49);
                    c19119M10472 = c19119;
                    c19119M10473 = c191110;
                    strM7159 = strM7159;
                    i12 = iM25615 ^ (-2045420647);
                    i11 = ((iM25615 ^ i9) * 24103) ^ (-935814965);
                    c19659 = this;
                    break;
                case 685851111:
                case 1608274805:
                    strM7159 = strM7159;
                    C3432.m10490(c19258M5912, iM25610 ^ i14);
                    strM6573 = AbstractC2021.m6573(f63473, 50, 3, i13);
                    if (C0050.f910 < 0) {
                        iM2567 = C2105.m6981("۟ۘ") ^ i9;
                        i = ((iM2567 ^ i10) * (-7351)) ^ 63497165;
                        i3 = -1122958042;
                        i8 = iM2567 ^ i3;
                        strM7159 = strM7159;
                        i12 = i8;
                        i11 = i;
                    }
                    c19258M5912 = c19258M5912;
                    iM2566 = (C2105.m6981("ۜۛ") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM2566 ^ i9) * (-16615)) ^ (-445579542);
                    i2 = 1127579538;
                    i8 = iM2566 ^ i2;
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    i12 = i8;
                    i11 = i;
                    break;
                case 845837339:
                case 2088941099:
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    c19119M10472 = c19119M10472;
                    c19119M10473 = c19119M10473;
                    z = false;
                    c19659.f63478 = false;
                    ViewOnClickListenerC2040.m6659(viewOnClickListenerC2040, c19659.f63477, c19119M10472, c19119M10473);
                    r6 = 1;
                    r7 = 1;
                    if (C5695.f17556 >= 0) {
                        iM2568 = C2105.m6981("۫᩷") ^ i9;
                        i4 = ((iM2568 ^ i10) * 3725) ^ 288021816;
                        i5 = -1385480026;
                        r7 = r6;
                    } else {
                        iM2568 = C0630.m2566("ܽܳ") ^ i9;
                        i4 = ((iM2568 ^ i10) * 2091) ^ 1558373100;
                        i5 = 2078400741;
                    }
                    int i114 = iM2568 ^ i5;
                    c19119M10472 = c19119M10472;
                    c19119M10473 = c19119M10473;
                    strM7159 = strM7159;
                    i12 = i114;
                    i11 = i4;
                    r8 = r7;
                    c19258M5912 = c19258M5912;
                    break;
                case 1401720475:
                case 1960822428:
                    dialogInterfaceOnClickListenerC18953 = new DialogInterfaceOnClickListenerC18953();
                    strM7159 = strM7159;
                    strM3502 = C1005.m3502(f63473, 59, 3, i13);
                    iM2567 = (i10 - C2105.m6981("ۡ֨")) * 63;
                    i = ((iM2567 ^ i9) * (-32621)) ^ 300951905;
                    i3 = -276949601;
                    i8 = iM2567 ^ i3;
                    strM7159 = strM7159;
                    i12 = i8;
                    i11 = i;
                    break;
                default:
                    strM7159 = strM7159;
                    c19258M5912 = c19258M5912;
                    c19119M10472 = c19119M10472;
                    c19119M10473 = c19119M10473;
                    c19659.f63478 = r8;
                    str = viewOnClickListenerC2040.f6822.f10837.f65738;
                    c20364 = viewOnClickListenerC2040.f6815.f10837;
                    iM2568 = C2105.m6981("᩺ܺ") ^ i9;
                    i4 = ((iM2568 ^ i10) * (-13065)) ^ (-1672098022);
                    i5 = -589884782;
                    r7 = r8;
                    int i115 = iM2568 ^ i5;
                    c19119M10472 = c19119M10472;
                    c19119M10473 = c19119M10473;
                    strM7159 = strM7159;
                    i12 = i115;
                    i11 = i4;
                    r8 = r7;
                    c19258M5912 = c19258M5912;
                    break;
            }
            return;
        }
    }
}
