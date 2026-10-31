package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: GA31 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4715 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List f14957;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f14958;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f14959;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m13815(List list) {
        f14957 = list;
        boolean z = !C0714.m2813(list);
        if (f14958 != z) {
            f14958 = z;
            C3911.m11926(new RunnableC15758(1));
        }
    }

    static {
        int iM2566;
        int i;
        C5242 c5242 = null;
        int i2 = -254369594;
        int i3 = C3537.f11231;
        int i4 = C22628.f73083;
        int iM2567 = (i4 - C0630.m2566("ᩴ֡")) * 39;
        int i5 = ((iM2567 ^ i3) * (-17575)) ^ 954048523;
        int i6 = -1577817378;
        while (true) {
            int i7 = iM2567 ^ i6;
            C21649 c21649 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-9699)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2072460250:
                    case -319541576:
                        c5242.m1665((InterfaceC1008) c21649);
                        if (C4616.f14690 <= 0) {
                            iM2566 = (C2105.m6981("ۖ᩶") ^ i3) * (-21);
                            i5 = ((iM2566 ^ i4) * 28221) ^ (-664028566);
                            i = 1345062842;
                        } else {
                            iM2566 = C0630.m2566("ܳۚ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 6951) ^ (-927175905);
                            i = 1029496095;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1979818841:
                    case -1679002316:
                        if (!C0964.m3413()) {
                            iM2567 = C0630.m2566("᩺᩹") ^ i3;
                            i5 = ((iM2567 ^ i4) * (-25977)) ^ 20941410;
                            i6 = 1806853352;
                        } else {
                            iM2567 = (C0630.m2566("ۘ᩵") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM2567 ^ i4) * (-18751)) ^ 1382261218;
                            i6 = -436145274;
                        }
                        break;
                    case -1796462108:
                    case -1382357985:
                        if (C1711.m5729()) {
                            iM2566 = C0630.m2566("᩺ۗ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 17689) ^ (-1163374957);
                            i = -932283132;
                        } else {
                            iM2566 = (i3 - C2105.m6981("ۨܶ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM2566 ^ i4) * (-17447)) ^ 195098653;
                            i = -442406760;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1436568894:
                    case -355015444:
                        C3663.m11168();
                        iM2567 = C0630.m2566("᩺᩹") ^ i3;
                        i5 = ((iM2567 ^ i4) * (-25977)) ^ 20941410;
                        i6 = 1806853352;
                        break;
                    case -978363004:
                    case 1761803710:
                        c5242 = C7261.f22281;
                        if (RunnableC0588.f2309 < 0) {
                            if (C1773.f6144 > 0) {
                                if (C4075.m12263() > 0 && AbstractC2021.f6743 > 0) {
                                    if (C2105.f7037 != 0) {
                                        iM2567 = C0630.m2566("᩺᩹") ^ i3;
                                        i5 = ((iM2567 ^ i4) * (-25977)) ^ 20941410;
                                        i6 = 1806853352;
                                        break;
                                    } else if (C0382.f1805) {
                                        c21649 = new C21649();
                                        if (ViewOnClickListenerC1958.f6529 > 0) {
                                            iM2566 = (C2105.m6981("᩵֡") ^ i4) * 123;
                                            i5 = ((iM2566 ^ i3) * (-22137)) ^ 42886919;
                                            i = 1724293043;
                                            i7 = iM2566 ^ i;
                                            break;
                                        }
                                    }
                                }
                                iM2567 = (C0630.m2566("᩹ᩳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                i5 = ((iM2567 ^ i3) * 28539) ^ 1035113113;
                                i6 = 1838355539;
                                break;
                            }
                            iM2567 = (C0630.m2566("ۘ᩵") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM2567 ^ i4) * (-18751)) ^ 1382261218;
                            i6 = -436145274;
                        } else {
                            iM2567 = C0630.m2566("ۜ᩸") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-30271)) ^ 1766030805;
                            i6 = 1666648575;
                        }
                        break;
                    case -667445344:
                    case 1454694400:
                        C1128.m3851();
                        if (C1128.m3851() > 0) {
                            iM2567 = (C0630.m2566("᩹ᩳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i5 = ((iM2567 ^ i3) * 28539) ^ 1035113113;
                            i6 = 1838355539;
                        } else {
                            iM2567 = C0630.m2566("᩺᩹") ^ i3;
                            i5 = ((iM2567 ^ i4) * (-25977)) ^ 20941410;
                            i6 = 1806853352;
                        }
                        break;
                    case -481879239:
                    case 1314234759:
                        if (!C1005.f3721) {
                            iM2567 = (C0630.m2566("᩹ᩳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i5 = ((iM2567 ^ i3) * 28539) ^ 1035113113;
                            i6 = 1838355539;
                        } else {
                            iM2567 = C0630.m2566("ۜ᩸") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-30271)) ^ 1766030805;
                            i6 = 1666648575;
                        }
                        break;
                    case -320522414:
                    case 1149842639:
                        C13265.m32211(new C20238());
                        return;
                    case -41009030:
                    case 299818237:
                        ExecutorService executorService = C1802.f6208;
                        if (C4117.m12364() == 0) {
                            int i8 = 1;
                            if (C5695.m16023() < 0) {
                                C2105.m6975(executorService, new RunnableC8704(i8));
                                iM2566 = (i3 - C2105.m6981("ۨܶ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i5 = ((iM2566 ^ i4) * (-17447)) ^ 195098653;
                                i = -442406760;
                                i7 = iM2566 ^ i;
                            } else {
                                iM2567 = (C0630.m2566("᩹ᩳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                i5 = ((iM2567 ^ i3) * 28539) ^ 1035113113;
                                i6 = 1838355539;
                            }
                        } else {
                            iM2567 = C0630.m2566("᩺᩹") ^ i3;
                            i5 = ((iM2567 ^ i4) * (-25977)) ^ 20941410;
                            i6 = 1806853352;
                        }
                        break;
                    default:
                        C3019.m9255();
                        throw new RuntimeException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13814() throws Throwable {
        boolean z = false;
        Throwable th = null;
        int i = -1899901256;
        int i2 = C3432.f10845;
        int i3 = C3537.f11231;
        int iM2566 = (C0630.m2566("ۚۜ") ^ i2) * 21;
        int i4 = ((iM2566 ^ i3) * 31255) ^ 1535699824;
        int i5 = -1584315820;
        while (true) {
            i = ((((i ^ i3) * (-8779)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2095591026:
                case -1918616086:
                    C1047.m3599();
                    ViewOnClickListenerC1958.m6429();
                    iM2566 = C0630.m2566("ۢᩳ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-27841)) ^ (-274228326);
                    i5 = -1138278777;
                    break;
                case -2092917410:
                case 1775309097:
                    try {
                        m13815(C0753.m2891());
                        iM2566 = (i2 - C2105.m6981("ܰ֫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2566 ^ i3) * 787) ^ 998995695;
                        i5 = -2120908468;
                    } catch (Exception unused) {
                        iM2566 = (C2105.m6981("ܶܶ") + i2) * 53;
                        i4 = ((iM2566 ^ i3) * 27391) ^ 894698353;
                        i5 = -598361087;
                    } catch (Throwable th2) {
                        th = th2;
                        iM2566 = (C0630.m2566("ܺ۠") ^ i3) * (-13);
                        i4 = ((iM2566 ^ i2) * 30289) ^ (-421647327);
                        i5 = -508172075;
                    }
                    break;
                case -1957731637:
                case 2004571845:
                    if (C4159.f13567) {
                        iM2566 = C0630.m2566("᩹ᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4969)) ^ (-959360189);
                        i5 = 1884704337;
                    } else {
                        iM2566 = C0630.m2566("ۢᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    }
                    break;
                case -1951532230:
                case -1052690412:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ۧ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15715)) ^ 830920090;
                        i5 = -465151163;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܽ᩶")) * (-3);
                        i4 = ((iM2566 ^ i2) * (-14583)) ^ 997502345;
                        i5 = -295355485;
                    }
                    break;
                case -1890761974:
                case 187858191:
                    return;
                case -1745538768:
                case -1347368037:
                    C1047.m3599();
                    if (C0050.f910 < 0) {
                        iM2566 = C0630.m2566("ۧ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15715)) ^ 830920090;
                        i5 = -465151163;
                    } else {
                        iM2566 = C0630.m2566("ۢᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    }
                    break;
                case -1590486775:
                case 1522136774:
                    f14959 = z;
                    return;
                case -1292793228:
                case 46163307:
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ۧ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15715)) ^ 830920090;
                        i5 = -465151163;
                    } else {
                        iM2566 = (C0630.m2566("֡۠") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2566 ^ i2) * 12151) ^ 1617249513;
                        i5 = 277496676;
                    }
                    break;
                case -1204093551:
                case 766331292:
                    f14959 = z;
                    throw th;
                case -1044424453:
                case 396793481:
                    f14959 = z;
                    return;
                case -985572766:
                case -883494274:
                    if (C7106.f21815 != 0) {
                        iM2566 = C0630.m2566("ۢᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ᩴ᩸")) * (-83);
                        i4 = ((iM2566 ^ i2) * 10627) ^ 355407303;
                        i5 = -347858811;
                    }
                    break;
                case -715557274:
                case -413660800:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C2105.m6981("᩸֡") + i3) * (-71);
                        i4 = ((iM2566 ^ i2) * 17971) ^ (-1114955955);
                        i5 = 1474275221;
                    } else {
                        iM2566 = C0630.m2566("ۢᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    }
                    break;
                case -697297859:
                case 1364384905:
                    if (C7106.f21815 == 0) {
                        iM2566 = (C2105.m6981("ۖᩳ") + i3) * (-17);
                        i4 = ((iM2566 ^ i2) * (-7961)) ^ 593889985;
                        i5 = -939578225;
                    } else {
                        iM2566 = C0630.m2566("ۢᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    }
                    break;
                case -380149685:
                case 824131902:
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("ۖᩳ") + i3) * (-17);
                        i4 = ((iM2566 ^ i2) * (-7961)) ^ 593889985;
                        i5 = -939578225;
                    } else {
                        iM2566 = (C2105.m6981("ۙᩳ") ^ i2) * (-39);
                        i4 = ((iM2566 ^ i3) * (-7459)) ^ 1935595639;
                        i5 = 1796748201;
                    }
                    break;
                case -311154134:
                case 1689448462:
                    if (C2272.f7362) {
                        iM2566 = C2105.m6981("᩷ۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8497) ^ (-115997070);
                        i5 = 585257299;
                    } else {
                        iM2566 = C2105.m6981("ܿۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-19951)) ^ (-1649239350);
                        i5 = -603056545;
                    }
                    break;
                case -258912093:
                case 1758770834:
                    f14959 = true;
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("ۢᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    } else {
                        iM2566 = (C2105.m6981("ۨ᩺") + i2) * (-47);
                        i4 = ((iM2566 ^ i3) * (-20117)) ^ 637292443;
                        i5 = -1308151475;
                    }
                    break;
                case 154372734:
                case 696790249:
                    C1504.m5179();
                    return;
                case 230161773:
                case 1407558173:
                    z = false;
                    iM2566 = (C2105.m6981("ܿ᩻") + i3) * 99;
                    i4 = ((iM2566 ^ i2) * 975) ^ 231666609;
                    i5 = -1716502228;
                    break;
                case 377900604:
                case 1930439063:
                    if (RunnableC1108.f4040) {
                        iM2566 = (C0630.m2566("۟֡") + i3) * 23;
                        i4 = ((iM2566 ^ i2) * 20109) ^ 1645078933;
                        i5 = -134859056;
                    } else {
                        iM2566 = (C2105.m6981("᩸֡") + i3) * (-71);
                        i4 = ((iM2566 ^ i2) * 17971) ^ (-1114955955);
                        i5 = 1474275221;
                    }
                    break;
                case 541428196:
                case 1068583709:
                    if (C0483.f2088 >= 0) {
                        iM2566 = (C2105.m6981("ۖᩳ") + i3) * (-17);
                        i4 = ((iM2566 ^ i2) * (-7961)) ^ 593889985;
                        i5 = -939578225;
                    } else {
                        iM2566 = (C2105.m6981("᩺ܺ") + i2) * 23;
                        i4 = ((iM2566 ^ i3) * 17357) ^ 453009956;
                        i5 = 845529693;
                    }
                    break;
                case 809646473:
                case 1134665971:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("᩸֡") + i3) * (-71);
                        i4 = ((iM2566 ^ i2) * 17971) ^ (-1114955955);
                        i5 = 1474275221;
                    } else {
                        iM2566 = C2105.m6981("᩻ۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 15113) ^ (-137946141);
                        i5 = 1052416981;
                    }
                    break;
                default:
                    if (f14959) {
                        iM2566 = (C0630.m2566("ۖܰ") ^ i2) * (-83);
                        i4 = ((iM2566 ^ i3) * (-4041)) ^ (-1008902523);
                        i5 = 1097339589;
                    } else {
                        iM2566 = C0630.m2566("ۢ֫") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-17381)) ^ 491029880;
                        i5 = -1184013871;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13816() {
        return f14958;
    }
}
