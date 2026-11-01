package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: GA31 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6850 {

    /* JADX INFO: renamed from: ֫ */
    public static List f17788;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f17789;

    /* JADX INFO: renamed from: ܽ */
    public static boolean f17790;

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m15691(List list) {
        f17788 = list;
        boolean z = !C0877.m55704(list);
        if (f17789 != z) {
            f17789 = z;
            C1036.m56259(new RunnableC17345(1));
        }
    }

    static {
        int iM55680;
        int i;
        C7350 c7350 = null;
        int i2 = -254369594;
        int i3 = C1017.f81942;
        int i4 = C1964.f83032;
        int iM55681 = (i4 - C0873.m55680("ᩴ֡")) * 39;
        int i5 = ((iM55681 ^ i3) * (-17575)) ^ 954048523;
        int i6 = -1577817378;
        while (true) {
            int i7 = iM55681 ^ i6;
            C22944 c22944 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-9699)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2072460250:
                    case -319541576:
                        c7350.m4063((InterfaceC3326) c22944);
                        if (C1071.f81975 <= 0) {
                            iM55680 = (C0946.m55979("ۖ᩶") ^ i3) * (-21);
                            i5 = ((iM55680 ^ i4) * 28221) ^ (-664028566);
                            i = 1345062842;
                        } else {
                            iM55680 = C0873.m55680("ܳۚ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 6951) ^ (-927175905);
                            i = 1029496095;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1979818841:
                    case -1679002316:
                        if (!C0890.m55740()) {
                            iM55681 = C0873.m55680("᩺᩹") ^ i3;
                            i5 = ((iM55681 ^ i4) * (-25977)) ^ 20941410;
                            i6 = 1806853352;
                        } else {
                            iM55681 = (C0873.m55680("ۘ᩵") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM55681 ^ i4) * (-18751)) ^ 1382261218;
                            i6 = -436145274;
                        }
                        break;
                    case -1796462108:
                    case -1382357985:
                        if (C0927.m55866()) {
                            iM55680 = C0873.m55680("᩺ۗ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 17689) ^ (-1163374957);
                            i = -932283132;
                        } else {
                            iM55680 = (i3 - C0946.m55979("ۨܶ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM55680 ^ i4) * (-17447)) ^ 195098653;
                            i = -442406760;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1436568894:
                    case -355015444:
                        C1024.m56209();
                        iM55681 = C0873.m55680("᩺᩹") ^ i3;
                        i5 = ((iM55681 ^ i4) * (-25977)) ^ 20941410;
                        i6 = 1806853352;
                        break;
                    case -978363004:
                    case 1761803710:
                        c7350 = C9269.f25170;
                        if (RunnableC0871.f81839 < 0) {
                            if (C0930.f81879 > 0) {
                                if (C1044.m56286() > 0 && AbstractC0942.f81890 > 0) {
                                    if (C0946.f81894 != 0) {
                                        iM55681 = C0873.m55680("᩺᩹") ^ i3;
                                        i5 = ((iM55681 ^ i4) * (-25977)) ^ 20941410;
                                        i6 = 1806853352;
                                        break;
                                    } else if (C0861.f81831) {
                                        c22944 = new C22944();
                                        if (ViewOnClickListenerC0939.f81888 > 0) {
                                            iM55680 = (C0946.m55979("᩵֡") ^ i4) * 123;
                                            i5 = ((iM55680 ^ i3) * (-22137)) ^ 42886919;
                                            i = 1724293043;
                                            i7 = iM55680 ^ i;
                                            break;
                                        }
                                    }
                                }
                                iM55681 = (C0873.m55680("᩹ᩳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                i5 = ((iM55681 ^ i3) * 28539) ^ 1035113113;
                                i6 = 1838355539;
                                break;
                            }
                            iM55681 = (C0873.m55680("ۘ᩵") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM55681 ^ i4) * (-18751)) ^ 1382261218;
                            i6 = -436145274;
                        } else {
                            iM55681 = C0873.m55680("ۜ᩸") ^ i4;
                            i5 = ((iM55681 ^ i3) * (-30271)) ^ 1766030805;
                            i6 = 1666648575;
                        }
                        break;
                    case -667445344:
                    case 1454694400:
                        C0898.m55800();
                        if (C0898.m55800() > 0) {
                            iM55681 = (C0873.m55680("᩹ᩳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i5 = ((iM55681 ^ i3) * 28539) ^ 1035113113;
                            i6 = 1838355539;
                        } else {
                            iM55681 = C0873.m55680("᩺᩹") ^ i3;
                            i5 = ((iM55681 ^ i4) * (-25977)) ^ 20941410;
                            i6 = 1806853352;
                        }
                        break;
                    case -481879239:
                    case 1314234759:
                        if (!C0892.f81851) {
                            iM55681 = (C0873.m55680("᩹ᩳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i5 = ((iM55681 ^ i3) * 28539) ^ 1035113113;
                            i6 = 1838355539;
                        } else {
                            iM55681 = C0873.m55680("ۜ᩸") ^ i4;
                            i5 = ((iM55681 ^ i3) * (-30271)) ^ 1766030805;
                            i6 = 1666648575;
                        }
                        break;
                    case -320522414:
                    case 1149842639:
                        C14976.m34310(new C21603());
                        return;
                    case -41009030:
                    case 299818237:
                        ExecutorService executorService = C4081.f8987;
                        if (C1046.m56302() == 0) {
                            int i8 = 1;
                            if (C1124.m56367() < 0) {
                                C0946.m55973(executorService, new RunnableC10641(i8));
                                iM55680 = (i3 - C0946.m55979("ۨܶ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i5 = ((iM55680 ^ i4) * (-17447)) ^ 195098653;
                                i = -442406760;
                                i7 = iM55680 ^ i;
                            } else {
                                iM55681 = (C0873.m55680("᩹ᩳ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                i5 = ((iM55681 ^ i3) * 28539) ^ 1035113113;
                                i6 = 1838355539;
                            }
                        } else {
                            iM55681 = C0873.m55680("᩺᩹") ^ i3;
                            i5 = ((iM55681 ^ i4) * (-25977)) ^ 20941410;
                            i6 = 1806853352;
                        }
                        break;
                    default:
                        C0992.m56107();
                        throw new RuntimeException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15690() throws Throwable {
        boolean z = false;
        Throwable th = null;
        int i = -1899901256;
        int i2 = C1012.f81938;
        int i3 = C1017.f81942;
        int iM55680 = (C0873.m55680("ۚۜ") ^ i2) * 21;
        int i4 = ((iM55680 ^ i3) * 31255) ^ 1535699824;
        int i5 = -1584315820;
        while (true) {
            i = ((((i ^ i3) * (-8779)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2095591026:
                case -1918616086:
                    C0894.m55769();
                    ViewOnClickListenerC0939.m55941();
                    iM55680 = C0873.m55680("ۢᩳ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-27841)) ^ (-274228326);
                    i5 = -1138278777;
                    break;
                case -2092917410:
                case 1775309097:
                    try {
                        m15691(C3085.m5220());
                        iM55680 = (i2 - C0946.m55979("ܰ֫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55680 ^ i3) * 787) ^ 998995695;
                        i5 = -2120908468;
                    } catch (Exception unused) {
                        iM55680 = (C0946.m55979("ܶܶ") + i2) * 53;
                        i4 = ((iM55680 ^ i3) * 27391) ^ 894698353;
                        i5 = -598361087;
                    } catch (Throwable th2) {
                        th = th2;
                        iM55680 = (C0873.m55680("ܺ۠") ^ i3) * (-13);
                        i4 = ((iM55680 ^ i2) * 30289) ^ (-421647327);
                        i5 = -508172075;
                    }
                    break;
                case -1957731637:
                case 2004571845:
                    if (C1048.f81963) {
                        iM55680 = C0873.m55680("᩹ᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4969)) ^ (-959360189);
                        i5 = 1884704337;
                    } else {
                        iM55680 = C0873.m55680("ۢᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    }
                    break;
                case -1951532230:
                case -1052690412:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("ۧ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15715)) ^ 830920090;
                        i5 = -465151163;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܽ᩶")) * (-3);
                        i4 = ((iM55680 ^ i2) * (-14583)) ^ 997502345;
                        i5 = -295355485;
                    }
                    break;
                case -1890761974:
                case 187858191:
                    return;
                case -1745538768:
                case -1347368037:
                    C0894.m55769();
                    if (C0845.f81821 < 0) {
                        iM55680 = C0873.m55680("ۧ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15715)) ^ 830920090;
                        i5 = -465151163;
                    } else {
                        iM55680 = C0873.m55680("ۢᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    }
                    break;
                case -1590486775:
                case 1522136774:
                    f17790 = z;
                    return;
                case -1292793228:
                case 46163307:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("ۧ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15715)) ^ 830920090;
                        i5 = -465151163;
                    } else {
                        iM55680 = (C0873.m55680("֡۠") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55680 ^ i2) * 12151) ^ 1617249513;
                        i5 = 277496676;
                    }
                    break;
                case -1204093551:
                case 766331292:
                    f17790 = z;
                    throw th;
                case -1044424453:
                case 396793481:
                    f17790 = z;
                    return;
                case -985572766:
                case -883494274:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0873.m55680("ۢᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ᩴ᩸")) * (-83);
                        i4 = ((iM55680 ^ i2) * 10627) ^ 355407303;
                        i5 = -347858811;
                    }
                    break;
                case -715557274:
                case -413660800:
                    if (C0854.f81826 != 0) {
                        iM55680 = (C0946.m55979("᩸֡") + i3) * (-71);
                        i4 = ((iM55680 ^ i2) * 17971) ^ (-1114955955);
                        i5 = 1474275221;
                    } else {
                        iM55680 = C0873.m55680("ۢᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    }
                    break;
                case -697297859:
                case 1364384905:
                    if (C1194.f82045 == 0) {
                        iM55680 = (C0946.m55979("ۖᩳ") + i3) * (-17);
                        i4 = ((iM55680 ^ i2) * (-7961)) ^ 593889985;
                        i5 = -939578225;
                    } else {
                        iM55680 = C0873.m55680("ۢᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    }
                    break;
                case -380149685:
                case 824131902:
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("ۖᩳ") + i3) * (-17);
                        i4 = ((iM55680 ^ i2) * (-7961)) ^ 593889985;
                        i5 = -939578225;
                    } else {
                        iM55680 = (C0946.m55979("ۙᩳ") ^ i2) * (-39);
                        i4 = ((iM55680 ^ i3) * (-7459)) ^ 1935595639;
                        i5 = 1796748201;
                    }
                    break;
                case -311154134:
                case 1689448462:
                    if (C0955.f81898) {
                        iM55680 = C0946.m55979("᩷ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8497) ^ (-115997070);
                        i5 = 585257299;
                    } else {
                        iM55680 = C0946.m55979("ܿۗ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-19951)) ^ (-1649239350);
                        i5 = -603056545;
                    }
                    break;
                case -258912093:
                case 1758770834:
                    f17790 = true;
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("ۢᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27841)) ^ (-274228326);
                        i5 = -1138278777;
                    } else {
                        iM55680 = (C0946.m55979("ۨ᩺") + i2) * (-47);
                        i4 = ((iM55680 ^ i3) * (-20117)) ^ 637292443;
                        i5 = -1308151475;
                    }
                    break;
                case 154372734:
                case 696790249:
                    C0917.m55854();
                    return;
                case 230161773:
                case 1407558173:
                    z = false;
                    iM55680 = (C0946.m55979("ܿ᩻") + i3) * 99;
                    i4 = ((iM55680 ^ i2) * 975) ^ 231666609;
                    i5 = -1716502228;
                    break;
                case 377900604:
                case 1930439063:
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("۟֡") + i3) * 23;
                        i4 = ((iM55680 ^ i2) * 20109) ^ 1645078933;
                        i5 = -134859056;
                    } else {
                        iM55680 = (C0946.m55979("᩸֡") + i3) * (-71);
                        i4 = ((iM55680 ^ i2) * 17971) ^ (-1114955955);
                        i5 = 1474275221;
                    }
                    break;
                case 541428196:
                case 1068583709:
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0946.m55979("ۖᩳ") + i3) * (-17);
                        i4 = ((iM55680 ^ i2) * (-7961)) ^ 593889985;
                        i5 = -939578225;
                    } else {
                        iM55680 = (C0946.m55979("᩺ܺ") + i2) * 23;
                        i4 = ((iM55680 ^ i3) * 17357) ^ 453009956;
                        i5 = 845529693;
                    }
                    break;
                case 809646473:
                case 1134665971:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0946.m55979("᩸֡") + i3) * (-71);
                        i4 = ((iM55680 ^ i2) * 17971) ^ (-1114955955);
                        i5 = 1474275221;
                    } else {
                        iM55680 = C0946.m55979("᩻ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 15113) ^ (-137946141);
                        i5 = 1052416981;
                    }
                    break;
                default:
                    if (f17790) {
                        iM55680 = (C0873.m55680("ۖܰ") ^ i2) * (-83);
                        i4 = ((iM55680 ^ i3) * (-4041)) ^ (-1008902523);
                        i5 = 1097339589;
                    } else {
                        iM55680 = C0873.m55680("ۢ֫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17381)) ^ 491029880;
                        i5 = -1184013871;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m15692() {
        return f17789;
    }
}
