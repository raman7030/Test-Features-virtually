package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7FD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11297 {
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0138  */
    /* JADX WARN: Code duplicated, block: B:53:0x0165  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27944(ApplicationC20075 applicationC20075) {
        int iM6981;
        int i;
        String str = null;
        int i2 = 206310588;
        int i3 = C4616.f14690;
        int i4 = C0630.f2410;
        int iM6982 = C2105.m6981("֡ۙ") ^ i3;
        int i5 = ((iM6982 ^ i4) * (-13277)) ^ 1457241672;
        int i6 = -1926524567;
        while (true) {
            int i7 = iM6982 ^ i6;
            RunnableC18664 runnableC18664 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-4219)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1954607485:
                    case 995104267:
                        if (C3746.f11829 <= 0) {
                            iM6981 = C2105.m6981("֡ۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 28151) ^ 267220865;
                            i = -1163894383;
                        } else {
                            iM6981 = (C2105.m6981("ܶۜ") + i3) * 81;
                            i5 = ((iM6981 ^ i4) * 6157) ^ (-418862357);
                            i = -1792057859;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1723524957:
                    case -217188828:
                        if (C3019.m9255() > 0) {
                            runnableC18664 = new RunnableC18664(3);
                            if (C4616.f14690 > 0) {
                                iM6981 = C0630.m2566("ܳᩳ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 30609) ^ (-359802209);
                                i = 1981386622;
                                i7 = iM6981 ^ i;
                            }
                        }
                        break;
                    case -1473511411:
                    case 1867615686:
                        if (C1916.f6442) {
                            iM6981 = (C2105.m6981("᩷ۙ") + i4) * (-101);
                            i5 = ((iM6981 ^ i3) * (-11965)) ^ 2085786872;
                            i = 451494818;
                        } else {
                            iM6981 = C0630.m2566("۟ܿ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-20267)) ^ 2122291274;
                            i = 2119713098;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1416561935:
                    case 1675450083:
                        C9523.m24409();
                        if (!C0630.m2564()) {
                            iM6981 = C2105.m6981("ۜ᩷") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-20343)) ^ 484838029;
                            i = -774959394;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -1135890363:
                    case 1178284518:
                        if (C0237.f1507 != 0) {
                            iM6981 = C0630.m2566("۟ܿ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-20267)) ^ 2122291274;
                            i = 2119713098;
                        } else {
                            iM6981 = C2105.m6981("᩺ۜ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-12781)) ^ 1709192551;
                            i = -1902844561;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -847958111:
                    case 1767945638:
                        str = null;
                        if (C0050.m940() > 0) {
                            iM6981 = C0630.m2566("۬ᩳ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-12735)) ^ 339436556;
                            i = -1783245342;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -821703773:
                    case -396623506:
                        C9523.m24398((ContextWrapper) applicationC20075, str);
                        C9523.m24397((ContextWrapper) applicationC20075);
                        break;
                    case -731694344:
                    case 1585742624:
                        C3537.m10746();
                        if (C1047.f3863 < 0) {
                            iM6981 = C0630.m2566("۟ܿ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-20267)) ^ 2122291274;
                            i = 2119713098;
                        } else {
                            iM6981 = C0630.m2566("۠᩻") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24107) ^ (-256664156);
                            i = 2090952820;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -728417029:
                    case 1866641232:
                        if (C7811.m20844() != 0) {
                            iM6981 = C0630.m2566("֡ܶ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 19701) ^ (-1465708265);
                            i = -220704371;
                        } else {
                            iM6981 = (i4 - C2105.m6981("ۡ᩻")) * 49;
                            i5 = ((iM6981 ^ i3) * 29391) ^ (-643081449);
                            i = 496293930;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -620477208:
                    case 1227588040:
                        if (C0714.m2805()) {
                            iM6981 = C2105.m6981("֡ۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 28151) ^ 267220865;
                            i = -1163894383;
                        } else {
                            iM6981 = C0630.m2566("֡ܶ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 19701) ^ (-1465708265);
                            i = -220704371;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -535807090:
                    case 2035116582:
                        if (C0237.f1507 != 0) {
                            iM6981 = C0630.m2566("۠᩻") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24107) ^ (-256664156);
                            i = 2090952820;
                        } else {
                            iM6981 = C0630.m2566("֡ܶ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 19701) ^ (-1465708265);
                            i = -220704371;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 738360314:
                    case 981901002:
                        C21943.m49433();
                        if (C22628.f73083 <= 0) {
                            iM6981 = C0630.m2566("۠᩻") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24107) ^ (-256664156);
                            i = 2090952820;
                        } else {
                            iM6981 = C2105.m6981("۟ۘ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 22019) ^ 513230746;
                            i = -709430467;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 749312408:
                    case 2056406145:
                        C21943.m49428(runnableC18664);
                        m27946(applicationC20075);
                        if (C3019.f9544 >= 0) {
                            iM6981 = C0630.m2566("֡ܶ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 19701) ^ (-1465708265);
                            i = -220704371;
                        } else {
                            iM6981 = (i3 - C2105.m6981("ܶ۟")) * (-85);
                            i5 = ((iM6981 ^ i4) * (-22119)) ^ (-594438300);
                            i = 1250639547;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 1491289034:
                    case 1560423998:
                        C2520.m8026();
                        C3019.m9255();
                        break;
                    default:
                        C4075.m12263();
                        C0382.m1848();
                        iM6981 = C0630.m2566("۟ܿ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-20267)) ^ 2122291274;
                        i = 2119713098;
                        i7 = iM6981 ^ i;
                        break;
                }
                return;
            }
            iM6982 = (C0630.m2566("ܳ᩹") + i3) * (-23);
            i5 = ((iM6982 ^ i4) * (-15335)) ^ 806093360;
            i6 = 1577896510;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Context m27941(Context context, int i, boolean z) {
        Context contextM24403 = null;
        Context contextCreateConfigurationContext = null;
        int i2 = 2067100024;
        int i3 = C4117.f13076;
        int i4 = C3432.f10845;
        int iM2566 = C0630.m2566("ۚۘ") ^ i3;
        int i5 = ((iM2566 ^ i4) * 27019) ^ 1116417972;
        int i6 = -327175214;
        while (true) {
            i2 = ((((i2 ^ i4) * 22477) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2146381640:
                case 988076322:
                    if (C0798.m2998() != 0) {
                        iM2566 = C2105.m6981("᩷ۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-20139)) ^ (-474306496);
                        i6 = 942560793;
                    } else {
                        iM2566 = (C2105.m6981("֫᩵") ^ i3) * (-27);
                        i5 = ((iM2566 ^ i4) * 29089) ^ (-690658004);
                        i6 = -2140241076;
                    }
                    break;
                case -2125507184:
                case -2102178072:
                    if (C3663.m11168() >= 0) {
                        iM2566 = C2105.m6981("᩷ۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-20139)) ^ (-474306496);
                        i6 = 942560793;
                    } else {
                        iM2566 = C2105.m6981("۬֨") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-1425)) ^ (-1316393058);
                        i6 = -1831294449;
                    }
                    break;
                case -2119064829:
                case -708327887:
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("ۗ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * 17895) ^ (-1959207252);
                        i6 = 1777965089;
                    } else {
                        iM2566 = C0630.m2566("ᩴۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-19977)) ^ 648030033;
                        i6 = -1520817546;
                    }
                    break;
                case -1971502973:
                case -402218556:
                    AbstractC2021.m6574();
                    return null;
                case -1965731670:
                case 1106101684:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C2105.m6981("ۨܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-22961)) ^ 803926502;
                        i6 = 889476827;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۙܺ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM2566 ^ i3) * 25959) ^ 377082777;
                        i6 = -1006700015;
                    }
                    break;
                case -1858221340:
                case -1162415541:
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("ۘᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 9539) ^ (-825797874);
                        i6 = 1624470402;
                    } else {
                        iM2566 = C2105.m6981("ۗ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * 17895) ^ (-1959207252);
                        i6 = 1777965089;
                    }
                    break;
                case -1576619499:
                case 1071382794:
                    SharedPreferences sharedPreferences = C4925.f15523;
                    if (C21943.m49432(contextM24403.getResources().getConfiguration(), i)) {
                        iM2566 = (i4 - C0630.m2566("ᩴ᩷")) * 63;
                        i5 = ((iM2566 ^ i3) * 3181) ^ 1755921961;
                        i6 = -1890204544;
                    } else {
                        iM2566 = C2105.m6981("ܳۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 19) ^ (-1044259338);
                        i6 = 1128827552;
                    }
                    break;
                case -1005458284:
                case -340447849:
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("ۨܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-22961)) ^ 803926502;
                        i6 = 889476827;
                    } else {
                        iM2566 = C2105.m6981("ۛ۫") ^ i3;
                        i5 = ((iM2566 ^ i4) * 21611) ^ 918530698;
                        i6 = 1918024396;
                    }
                    break;
                case -868632407:
                case 1466897423:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("ۗ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * 17895) ^ (-1959207252);
                        i6 = 1777965089;
                    } else {
                        iM2566 = C0630.m2566("ܽᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 21431) ^ (-1038005226);
                        i6 = 874731749;
                    }
                    break;
                case -823623704:
                case 1487536749:
                    C7811.m20844();
                    iM2566 = C2105.m6981("ۗۤ") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-7491)) ^ 863787549;
                    i6 = 1063895366;
                    break;
                case -664689404:
                case 614202139:
                    if (RunnableC1108.m3790()) {
                        iM2566 = C2105.m6981("ۨܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-22961)) ^ 803926502;
                        i6 = 889476827;
                    } else {
                        iM2566 = (i4 - C0630.m2566("۠ۙ")) * (-73);
                        i5 = ((iM2566 ^ i3) * (-28337)) ^ (-1008612220);
                        i6 = -1857486032;
                    }
                    break;
                case -641900983:
                case -208631245:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C2105.m6981("ۗۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-7491)) ^ 863787549;
                        i6 = 1063895366;
                    } else {
                        iM2566 = C2105.m6981("ۛܰ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12951)) ^ (-1571903788);
                        i6 = -602140232;
                    }
                    break;
                case -588436106:
                case 1834222154:
                    if (!C1005.f3721) {
                        iM2566 = C2105.m6981("ۨܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-22961)) ^ 803926502;
                        i6 = 889476827;
                    } else {
                        iM2566 = C2105.m6981("ۗۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-7491)) ^ 863787549;
                        i6 = 1063895366;
                    }
                    break;
                case -223604290:
                case 6805531:
                    return contextM24403;
                case 360838675:
                case 1026153316:
                    Configuration configuration = contextM24403.getResources().getConfiguration();
                    if (C4117.f13076 > 0) {
                        Configuration configuration2 = new Configuration(configuration);
                        C21943.m49427(configuration2, i);
                        contextCreateConfigurationContext = contextM24403.createConfigurationContext(configuration2);
                        iM2566 = C0630.m2566("᩻ܶ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-16213)) ^ 775385964;
                        i6 = -760697386;
                    } else {
                        iM2566 = C2105.m6981("ۗ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * 17895) ^ (-1959207252);
                        i6 = 1777965089;
                    }
                    break;
                case 1034433309:
                case 1659517076:
                    contextM24403 = C9523.m24403(context);
                    if (z) {
                        iM2566 = C2105.m6981("᩷ܰ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-17689)) ^ 712661670;
                        i6 = -1902363779;
                    } else {
                        contextCreateConfigurationContext = contextM24403;
                        iM2566 = C0630.m2566("᩻ܶ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-16213)) ^ 775385964;
                        i6 = -760697386;
                    }
                    break;
                case 1057413205:
                case 1740622565:
                    return contextCreateConfigurationContext;
                case 1425735645:
                case 1860499450:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C2105.m6981("֫᩵") ^ i3) * (-27);
                        i5 = ((iM2566 ^ i4) * 29089) ^ (-690658004);
                        i6 = -2140241076;
                    } else {
                        iM2566 = C2105.m6981("ۗۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-7491)) ^ 863787549;
                        i6 = 1063895366;
                    }
                    break;
                case 1556172771:
                case 1826136284:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C2105.m6981("ۨܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-22961)) ^ 803926502;
                        i6 = 889476827;
                    } else {
                        iM2566 = C2105.m6981("ۗ֡") ^ i4;
                        i5 = ((iM2566 ^ i3) * 9237) ^ (-881576847);
                        i6 = 878434066;
                    }
                    break;
                default:
                    int i7 = C21943.f70295;
                    if (C4925.f15523 != null) {
                        iM2566 = (i4 - C2105.m6981("֫᩺")) * (-75);
                        i5 = ((iM2566 ^ i3) * (-12223)) ^ 245242677;
                        i6 = 1363293464;
                    } else {
                        contextCreateConfigurationContext = contextM24403;
                        iM2566 = C0630.m2566("᩻ܶ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-16213)) ^ 775385964;
                        i6 = -760697386;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b6 A[PHI: r1
      0x01b6: PHI (r1v4 android.content.res.Configuration) = 
      (r1v3 android.content.res.Configuration)
      (r1v2 android.content.res.Configuration)
      (r1v2 android.content.res.Configuration)
     binds: [B:60:0x01b4, B:28:0x0096, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0219  */
    /* JADX WARN: Code duplicated, block: B:78:0x024f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0280  */
    /* JADX WARN: Code duplicated, block: B:86:0x02ae A[PHI: r12
      0x02ae: PHI (r12v5 android.content.res.Configuration) = 
      (r12v4 android.content.res.Configuration)
      (r12v4 android.content.res.Configuration)
      (r12v6 android.content.res.Configuration)
     binds: [B:85:0x02ac, B:73:0x0231, B:52:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x02db A[PHI: r0
      0x02db: PHI (r0v5 android.content.res.Resources) = (r0v2 android.content.res.Resources), (r0v4 android.content.res.Resources), (r0v2 android.content.res.Resources) binds: [B:89:0x02d9, B:64:0x01e6, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x030d  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27946(Context context) {
        int iM2566;
        int i;
        Resources resources = null;
        Configuration configuration = null;
        int i2 = 0;
        Resources resourcesM14338 = null;
        Resources resources2 = null;
        boolean zM49432 = false;
        int i3 = 460906105;
        int i4 = ViewOnClickListenerC1958.f6529;
        int i5 = C5695.f17556;
        int iM2567 = C0630.m2566("᩸ۡ") ^ i4;
        int i6 = ((iM2567 ^ i5) * (-32155)) ^ (-2124926586);
        int i7 = 230142654;
        while (true) {
            int i8 = iM2567 ^ i7;
            Configuration configuration2 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 5059) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2031683699:
                    case -2024826930:
                        Configuration configuration3 = resources.getConfiguration();
                        if (C3537.m10746() > 0) {
                            configuration2 = new Configuration(configuration3);
                            if (C7811.m20844() != 0) {
                                iM2566 = (i4 - C2105.m6981("֫ᩴ")) * 99;
                                i6 = ((iM2566 ^ i5) * 26735) ^ (-1494695471);
                                i = -1722595594;
                            } else {
                                iM2566 = C2105.m6981("᩹ۚ") ^ i4;
                                i6 = ((iM2566 ^ i5) * 27953) ^ 1134301761;
                                i = 1993002174;
                            }
                            i8 = iM2566 ^ i;
                        }
                        break;
                    case -2009883598:
                    case 1606538644:
                        if (C21923.f70183 == 0) {
                            iM2566 = C0630.m2566("֫ۧ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-5053)) ^ (-926024855);
                            i = -1834706494;
                        } else {
                            iM2566 = C0630.m2566("֫ۤ") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-10041)) ^ 1312286475;
                            i = -1407387603;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -2003681255:
                    case 1415264440:
                        i2 = -100;
                        if (C21943.m49432(configuration, -100)) {
                            iM2566 = (C0630.m2566("ۢ֨") ^ i5) * (-53);
                            i6 = ((iM2566 ^ i4) * (-3063)) ^ (-1182101702);
                            i = -1756674063;
                        } else {
                            iM2566 = C0630.m2566("᩸ܶ") ^ i5;
                            i6 = ((iM2566 ^ i4) * 10793) ^ (-1948170547);
                            i = 1808985188;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1983624376:
                    case 1150097697:
                        C4117.m12364();
                        iM2566 = (C2105.m6981("ۖۢ") ^ i4) * (-31);
                        i6 = ((iM2566 ^ i5) * (-6715)) ^ 1567746571;
                        i = -1401061540;
                        i8 = iM2566 ^ i;
                        break;
                    case -1902580501:
                    case 1503079904:
                        int i9 = C21943.f70295;
                        if (C2958.m9034() <= 0) {
                            iM2566 = C0630.m2566("֫ۧ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-5053)) ^ (-926024855);
                            i = -1834706494;
                        } else {
                            iM2566 = (i4 - C0630.m2566("۟ᩴ")) * (-127);
                            i6 = ((iM2566 ^ i5) * 21095) ^ 1507719327;
                            i = 1414267749;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1835138660:
                    case -1683762919:
                        if (C4117.m12364() != 0) {
                            iM2566 = (i4 - C2105.m6981("ۖۖ")) * 81;
                            i6 = ((iM2566 ^ i5) * (-26259)) ^ 1891456406;
                            i = 389161621;
                        } else {
                            iM2566 = (C0630.m2566("ܰ֡") ^ i5) * (-75);
                            i6 = ((iM2566 ^ i4) * 7309) ^ (-810221482);
                            i = -578224474;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1651656567:
                    case 1696775987:
                        if (C4925.f15523 != null) {
                            iM2566 = C0630.m2566("۬ܰ") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-8139)) ^ 1111529372;
                            i = 278268959;
                        } else {
                            iM2566 = (C0630.m2566("ܽᩴ") + i4) * (-59);
                            i6 = ((iM2566 ^ i5) * (-3989)) ^ (-342021984);
                            i = -1945500956;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1614215306:
                    case 1020502557:
                        try {
                            Configuration configuration4 = new Configuration(resourcesM14338.getConfiguration());
                            C21943.m49427(configuration4, i2);
                            resourcesM14338.updateConfiguration(configuration4, resourcesM14338.getDisplayMetrics());
                            break;
                        } catch (Throwable unused) {
                        }
                        iM2566 = (C0630.m2566("ܽᩴ") + i4) * (-59);
                        i6 = ((iM2566 ^ i5) * (-3989)) ^ (-342021984);
                        i = -1945500956;
                        i8 = iM2566 ^ i;
                        break;
                    case -1583667774:
                    case 1457790242:
                        if (resourcesM14338 != resources2) {
                            iM2566 = C2105.m6981("ۜ᩷") ^ i5;
                            i6 = ((iM2566 ^ i4) * 19841) ^ (-1581028813);
                            i = -1687052135;
                        } else {
                            iM2566 = (C0630.m2566("ܽᩴ") + i4) * (-59);
                            i6 = ((iM2566 ^ i5) * (-3989)) ^ (-342021984);
                            i = -1945500956;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1340399075:
                    case 1984327637:
                        zM49432 = C21943.m49432(resourcesM14338.getConfiguration(), i2);
                        iM2566 = (i4 - C0630.m2566("᩹ۧ")) * (-69);
                        i6 = ((iM2566 ^ i5) * (-1825)) ^ (-1010827607);
                        i = 470779048;
                        i8 = iM2566 ^ i;
                        break;
                    case -1320019664:
                    case 1674502343:
                        C0798.m2998();
                        break;
                    case -1227115875:
                    case 1626986587:
                        configuration = resources.getConfiguration();
                        if (C3537.m10746() <= 0) {
                            iM2566 = C0630.m2566("ۖ᩻") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-9081)) ^ (-717978182);
                            i = -1237832196;
                        } else {
                            iM2566 = C0630.m2566("᩵ۡ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-18101)) ^ 2132236293;
                            i = -592257246;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1180680601:
                    case 1093365475:
                        if (C4263.f13799 > 0) {
                            iM2566 = (i5 - C0630.m2566("֫ۖ")) * (-103);
                            i6 = ((iM2566 ^ i4) * (-12095)) ^ 1720913273;
                            i = 1640543786;
                        } else {
                            iM2566 = (C0630.m2566("ܳۡ") ^ i4) * 119;
                            i6 = ((iM2566 ^ i5) * 22885) ^ 815381520;
                            i = 1765807704;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -1081061765:
                    case 1562474104:
                        if (C4075.f12947 >= 0) {
                            iM2566 = (i4 - C2105.m6981("֫ᩴ")) * 99;
                            i6 = ((iM2566 ^ i5) * 26735) ^ (-1494695471);
                            i = -1722595594;
                        } else {
                            iM2566 = C0630.m2566("᩶۬") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-19875)) ^ (-100972156);
                            i = 822222898;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -964195479:
                    case -771237900:
                        if (C4263.m12819() >= 0) {
                            iM2566 = (C2105.m6981("ۖۢ") ^ i4) * (-31);
                            i6 = ((iM2566 ^ i5) * (-6715)) ^ 1567746571;
                            i = -1401061540;
                        } else {
                            iM2566 = C0630.m2566("ۖ᩻") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-9081)) ^ (-717978182);
                            i = -1237832196;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -864721618:
                    case 1330400987:
                        if (zM49432) {
                            iM2566 = (C0630.m2566("ܽᩴ") + i4) * (-59);
                            i6 = ((iM2566 ^ i5) * (-3989)) ^ (-342021984);
                            i = -1945500956;
                        } else {
                            iM2566 = (C2105.m6981("ܽܺ") + i5) * (-91);
                            i6 = ((iM2566 ^ i4) * (-1883)) ^ 1224277876;
                            i = 853289778;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -787390086:
                    case -595065038:
                        if (C0798.f2919) {
                            iM2566 = (i4 - C2105.m6981("֫ᩴ")) * 99;
                            i6 = ((iM2566 ^ i5) * 26735) ^ (-1494695471);
                            i = -1722595594;
                        } else {
                            iM2566 = C0630.m2566("᩷ۤ") ^ i4;
                            i6 = ((iM2566 ^ i5) * 7303) ^ (-631245107);
                            i = -1421196249;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -347552168:
                    case 585782024:
                        C21943.m49427(configuration2, i2);
                        resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
                        iM2566 = (C0630.m2566("ۢ֨") ^ i5) * (-53);
                        i6 = ((iM2566 ^ i4) * (-3063)) ^ (-1182101702);
                        i = -1756674063;
                        i8 = iM2566 ^ i;
                        break;
                    case -340224999:
                    case 394614050:
                        break;
                    case -309030197:
                    case 377770151:
                        if (C7106.f21815 != 0) {
                            iM2566 = (C0630.m2566("᩶ܳ") + i5) * 31;
                            i6 = ((iM2566 ^ i4) * 28727) ^ (-359409443);
                            i = -1643026072;
                        } else {
                            iM2566 = (C0630.m2566("᩻᩷") + i5) * (-19);
                            i6 = ((iM2566 ^ i4) * 15717) ^ 20775368;
                            i = -1205751163;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -288106298:
                    case 394726052:
                        if (C0237.f1507 == 0) {
                            iM2566 = C0630.m2566("ۖ᩻") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-9081)) ^ (-717978182);
                            i = -1237832196;
                        } else {
                            iM2566 = C0630.m2566("֫ۧ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-5053)) ^ (-926024855);
                            i = -1834706494;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -39718516:
                    case 2044946660:
                        SharedPreferences sharedPreferences = C4925.f15523;
                        resources = context.getResources();
                        if (C5695.f17556 >= 0) {
                            iM2566 = (C0630.m2566("᩶ܳ") + i5) * 31;
                            i6 = ((iM2566 ^ i4) * 28727) ^ (-359409443);
                            i = -1643026072;
                        } else {
                            iM2566 = (C2105.m6981("ᩳ᩺") ^ i5) * (-63);
                            i6 = ((iM2566 ^ i4) * (-14507)) ^ 859102101;
                            i = 381898925;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case -24175105:
                    case 1965284903:
                        if (C5695.f17556 >= 0) {
                        }
                        iM2566 = (i5 - C0630.m2566("֫ۖ")) * (-103);
                        i6 = ((iM2566 ^ i4) * (-12095)) ^ 1720913273;
                        i = 1640543786;
                        i8 = iM2566 ^ i;
                        break;
                    case -9774243:
                    case 291213611:
                        if (C1047.f3863 >= 0) {
                            iM2566 = (C2105.m6981("ۖۢ") ^ i4) * (-31);
                            i6 = ((iM2566 ^ i5) * (-6715)) ^ 1567746571;
                            i = -1401061540;
                        } else {
                            iM2566 = C0630.m2566("ۛۤ") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-18111)) ^ 1592619724;
                            i = 2141846178;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case 271127964:
                    case 1118071614:
                        C1916.m6308();
                        if (C1773.f6144 > 0) {
                            iM2566 = (i5 - C0630.m2566("֫ۖ")) * (-103);
                            i6 = ((iM2566 ^ i4) * (-12095)) ^ 1720913273;
                            i = 1640543786;
                        } else {
                            iM2566 = (C0630.m2566("᩶ܳ") + i5) * 31;
                            i6 = ((iM2566 ^ i4) * 28727) ^ (-359409443);
                            i = -1643026072;
                        }
                        i8 = iM2566 ^ i;
                        break;
                    case 620534940:
                    case 1948499914:
                        resourcesM14338 = C4925.m14338();
                        resources2 = context.getResources();
                        iM2566 = (C2105.m6981("᩻ܰ") ^ i4) * 69;
                        i6 = ((iM2566 ^ i5) * (-19095)) ^ 1779639717;
                        i = 223487208;
                        i8 = iM2566 ^ i;
                        break;
                    case 887116503:
                    case 1527768014:
                        C0798.m2998();
                        if (C3019.f9544 < 0) {
                        }
                        iM2566 = (C2105.m6981("ۖۢ") ^ i4) * (-31);
                        i6 = ((iM2566 ^ i5) * (-6715)) ^ 1567746571;
                        i = -1401061540;
                        i8 = iM2566 ^ i;
                        break;
                    default:
                        if (C4075.f12947 < 0) {
                            iM2566 = (C2105.m6981("ۖۢ") ^ i4) * (-31);
                            i6 = ((iM2566 ^ i5) * (-6715)) ^ 1567746571;
                            i = -1401061540;
                        } else {
                            iM2566 = (i4 - C2105.m6981("ۖۖ")) * 81;
                            i6 = ((iM2566 ^ i5) * (-26259)) ^ 1891456406;
                            i = 389161621;
                        }
                        i8 = iM2566 ^ i;
                        break;
                }
                return;
            }
            iM2567 = (C2105.m6981("᩺ۜ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
            i6 = ((iM2567 ^ i5) * 27841) ^ (-58091379);
            i7 = -1510226693;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27942(Activity activity, int i, boolean z) {
        int i2 = 732374125;
        int i3 = C3019.f9544;
        int i4 = C4117.f13076;
        int iM6981 = C2105.m6981("ۤܽ") ^ i4;
        int i5 = ((iM6981 ^ i3) * 22025) ^ (-1424423478);
        int i6 = 1771098440;
        while (true) {
            i2 = ((((i2 ^ i3) * 20349) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2146585791:
                case 1808208466:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C2105.m6981("ܺ֡") + i4) * 73;
                        i5 = ((iM6981 ^ i3) * (-32525)) ^ 1859437711;
                        i6 = 1414936380;
                    } else {
                        iM6981 = (i4 - C2105.m6981("᩹֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM6981 ^ i3) * 14611) ^ 1523838475;
                        i6 = 1605586329;
                    }
                    break;
                case -1902543361:
                case -390961412:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C2105.m6981("ܺ֡") + i4) * 73;
                        i5 = ((iM6981 ^ i3) * (-32525)) ^ 1859437711;
                        i6 = 1414936380;
                    } else {
                        iM6981 = C2105.m6981("ۚ᩵") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-20637)) ^ (-895072269);
                        i6 = 1137235428;
                    }
                    break;
                case -1663315211:
                case 1010704384:
                    if (C21943.m49432(activity.getResources().getConfiguration(), i)) {
                        iM6981 = (C2105.m6981("ۗۖ") + i3) * (-117);
                        i5 = ((iM6981 ^ i4) * 19325) ^ (-359492479);
                        i6 = 118680338;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩵") ^ i4;
                        i5 = ((iM6981 ^ i3) * 9833) ^ 477729324;
                        i6 = 120899311;
                    }
                    break;
                case -1631115441:
                case 352428440:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("ۚۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    } else {
                        iM6981 = C0630.m2566("ܳܰ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 6253) ^ (-1154011581);
                        i6 = 135263326;
                    }
                    break;
                case -1399677999:
                case -236976771:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C2105.m6981("ܿۨ") ^ i4) * 27;
                        i5 = ((iM6981 ^ i3) * (-8485)) ^ 363560890;
                        i6 = 1489616591;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۘ֨")) * 81;
                        i5 = ((iM6981 ^ i4) * 4747) ^ (-1804690370);
                        i6 = 486821586;
                    }
                    break;
                case -816639253:
                case -373577779:
                    ViewOnClickListenerC1958.m6429();
                    if (!C0630.m2564()) {
                        iM6981 = (C2105.m6981("۫᩹") ^ i3) * 39;
                        i5 = ((iM6981 ^ i4) * (-10979)) ^ 1890034246;
                        i6 = -334155275;
                    } else {
                        iM6981 = C0630.m2566("ۚۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    }
                    break;
                case -611912463:
                case 1713733613:
                    if (activity.isDestroyed()) {
                        iM6981 = (C2105.m6981("ۗۖ") + i3) * (-117);
                        i5 = ((iM6981 ^ i4) * 19325) ^ (-359492479);
                        i6 = 118680338;
                    } else {
                        iM6981 = C2105.m6981("֫۬") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-26395)) ^ (-2116716549);
                        i6 = -778100911;
                    }
                    break;
                case -573558765:
                case 916215719:
                    SharedPreferences sharedPreferences = C4925.f15523;
                    if (C2958.m9033(activity)) {
                        iM6981 = (C2105.m6981("ۗۖ") + i3) * (-117);
                        i5 = ((iM6981 ^ i4) * 19325) ^ (-359492479);
                        i6 = 118680338;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩶ܿ")) * 31;
                        i5 = ((iM6981 ^ i3) * (-3429)) ^ 574234554;
                        i6 = 1501786195;
                    }
                    break;
                case -544456089:
                case 1305830432:
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("ۚۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    } else {
                        iM6981 = (C2105.m6981("ܺ֡") + i4) * 73;
                        i5 = ((iM6981 ^ i3) * (-32525)) ^ 1859437711;
                        i6 = 1414936380;
                    }
                    break;
                case -426224377:
                case -337075966:
                    C1504.m5179();
                    C22628.m50615();
                    break;
                case -149338382:
                case 36019320:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C2105.m6981("۫᩹") ^ i3) * 39;
                        i5 = ((iM6981 ^ i4) * (-10979)) ^ 1890034246;
                        i6 = -334155275;
                    } else {
                        iM6981 = C2105.m6981("۫ۜ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 789) ^ (-1480188354);
                        i6 = 588134169;
                    }
                    break;
                case -139825978:
                case 1586483883:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C2105.m6981("۫᩹") ^ i3) * 39;
                        i5 = ((iM6981 ^ i4) * (-10979)) ^ 1890034246;
                        i6 = -334155275;
                    } else {
                        iM6981 = (C2105.m6981("֡ۢ") + i3) * (-101);
                        i5 = ((iM6981 ^ i4) * (-1715)) ^ (-1929810121);
                        i6 = 1556433342;
                    }
                    break;
                case -29204671:
                case 2139720981:
                    if (!C1711.f5919) {
                        iM6981 = C0630.m2566("ۚۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    } else {
                        iM6981 = C0630.m2566("ۡ᩸") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-26861)) ^ (-372346);
                        i6 = -1717934085;
                    }
                    break;
                case 163017022:
                case 1647856821:
                    if (C1128.m3851() <= 0) {
                        iM6981 = C0630.m2566("ۚۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    } else {
                        iM6981 = C0630.m2566("᩹ۜ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-21229)) ^ (-1048712529);
                        i6 = -2040160223;
                    }
                    break;
                case 655823308:
                case 1626129560:
                    RunnableC0588.m2441();
                    C1047.m3599();
                    iM6981 = (C2105.m6981("ܺ֡") + i4) * 73;
                    i5 = ((iM6981 ^ i3) * (-32525)) ^ 1859437711;
                    i6 = 1414936380;
                    break;
                case 660725068:
                case 1674905207:
                    break;
                case 742613186:
                case 948651380:
                    int i7 = C21943.f70295;
                    if (C4925.f15523 != null) {
                        iM6981 = C2105.m6981("ᩳۙ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 1061) ^ 678371905;
                        i6 = -616635247;
                    } else {
                        iM6981 = (C2105.m6981("ۗۖ") + i3) * (-117);
                        i5 = ((iM6981 ^ i4) * 19325) ^ (-359492479);
                        i6 = 118680338;
                    }
                    break;
                case 852751602:
                case 1192775553:
                    if (z) {
                        iM6981 = (C2105.m6981("۬ᩳ") + i4) * (-7);
                        i5 = ((iM6981 ^ i3) * 19275) ^ (-392190228);
                        i6 = -1728222390;
                    } else {
                        iM6981 = (C2105.m6981("ۗۖ") + i3) * (-117);
                        i5 = ((iM6981 ^ i4) * 19325) ^ (-359492479);
                        i6 = 118680338;
                    }
                    break;
                case 1040658051:
                case 1375581009:
                    activity.recreate();
                    iM6981 = (C2105.m6981("ۗۖ") + i3) * (-117);
                    i5 = ((iM6981 ^ i4) * 19325) ^ (-359492479);
                    i6 = 118680338;
                    break;
                case 1062836022:
                case 1479044354:
                    if (C1773.m5908() <= 0) {
                        iM6981 = C0630.m2566("ۚۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    } else {
                        iM6981 = C2105.m6981("ۗܽ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-12653)) ^ (-1892535890);
                        i6 = 138842954;
                    }
                    break;
                case 1208194735:
                case 1976004847:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C2105.m6981("ܿۨ") ^ i4) * 27;
                        i5 = ((iM6981 ^ i3) * (-8485)) ^ 363560890;
                        i6 = 1489616591;
                    } else {
                        iM6981 = (C0630.m2566("ۡ᩷") + i3) * 13;
                        i5 = ((iM6981 ^ i4) * 20077) ^ 227108246;
                        i6 = -101561454;
                    }
                    break;
                default:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ۡ᩸") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-26861)) ^ (-372346);
                        i6 = -1717934085;
                    } else {
                        iM6981 = C0630.m2566("ۗ᩷") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-6773)) ^ (-229722095);
                        i6 = -94638090;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27945(Activity activity, int i, boolean z) {
        int i2 = -550196532;
        int i3 = C4117.f13076;
        int i4 = C2167.f7158;
        int iM2566 = (C0630.m2566("ۙܶ") + i3) * 51;
        int i5 = ((iM2566 ^ i4) * (-8481)) ^ (-1813095300);
        int i6 = -411119794;
        while (true) {
            i2 = ((((i2 ^ i4) * 2923) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -1917777997:
                case 1279819558:
                    if (C1047.m3599() >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۧ۠")) * (-25);
                        i5 = ((iM2566 ^ i4) * 29483) ^ 669805125;
                        i6 = -571416384;
                    } else {
                        iM2566 = C2105.m6981("֡ۗ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 26245) ^ 1629863980;
                        i6 = 1660067987;
                    }
                    break;
                case -1775037016:
                case -1389672862:
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("᩹֫") + i4) * 59;
                        i5 = ((iM2566 ^ i3) * (-5461)) ^ (-25618056);
                        i6 = 2031997183;
                    } else {
                        iM2566 = (C2105.m6981("ܳۛ") + i4) * (-39);
                        i5 = ((iM2566 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    }
                    break;
                case -1691867637:
                case 1512470311:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C2105.m6981("ܳۛ") + i4) * (-39);
                        i5 = ((iM2566 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    } else {
                        iM2566 = (C0630.m2566("ۖ᩹") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM2566 ^ i3) * (-8143)) ^ 580613545;
                        i6 = -1395959411;
                    }
                    break;
                case -1528770851:
                case 104634034:
                    C4159.m12565();
                    iM2566 = (C0630.m2566("ܿ۫") ^ i4) * 31;
                    i5 = ((iM2566 ^ i3) * 31339) ^ 2124109537;
                    i6 = -2071851623;
                    break;
                case -1516073579:
                case -705362929:
                    C3911.m11924();
                    C0382.m1848();
                    break;
                case -1378869160:
                case 379417627:
                    if (!C0382.f1805) {
                        iM2566 = (i3 - C0630.m2566("ۧ۠")) * (-25);
                        i5 = ((iM2566 ^ i4) * 29483) ^ 669805125;
                        i6 = -571416384;
                    } else {
                        iM2566 = (C0630.m2566("ܿ۫") ^ i4) * 31;
                        i5 = ((iM2566 ^ i3) * 31339) ^ 2124109537;
                        i6 = -2071851623;
                    }
                    break;
                case -1297490764:
                case 494861517:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("ܳۛ") + i4) * (-39);
                        i5 = ((iM2566 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    } else {
                        iM2566 = C0630.m2566("֫۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * 18945) ^ (-1872079685);
                        i6 = 849290194;
                    }
                    break;
                case -1146840605:
                case -474574468:
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("ܳۛ") + i4) * (-39);
                        i5 = ((iM2566 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    } else {
                        iM2566 = C0630.m2566("֫ۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-29889)) ^ (-1523659261);
                        i6 = -840889796;
                    }
                    break;
                case -1087733148:
                case -610034420:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i3 - C0630.m2566("ۧ۠")) * (-25);
                        i5 = ((iM2566 ^ i4) * 29483) ^ 669805125;
                        i6 = -571416384;
                    } else {
                        iM2566 = (C2105.m6981("ܳۨ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM2566 ^ i3) * 3601) ^ (-1024624910);
                        i6 = 963215077;
                    }
                    break;
                case -1035618006:
                case 1856859479:
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("᩷ܽ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-3633)) ^ 1518297574;
                        i6 = -232099876;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܰܰ")) * 87;
                        i5 = ((iM2566 ^ i4) * 25677) ^ 76437011;
                        i6 = -1516832307;
                    }
                    break;
                case -17907082:
                case 1657919822:
                    C9523.m24397((ContextWrapper) activity);
                    m27942(activity, i, z);
                    break;
                case 216672416:
                case 1296190242:
                    if (C3245.m9925() != 0) {
                        iM2566 = C2105.m6981("᩷ܽ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-3633)) ^ 1518297574;
                        i6 = -232099876;
                    } else {
                        iM2566 = (C0630.m2566("ܿ۫") ^ i4) * 31;
                        i5 = ((iM2566 ^ i3) * 31339) ^ 2124109537;
                        i6 = -2071851623;
                    }
                    break;
                case 378778444:
                case 767624547:
                    if (C2272.f7362) {
                        iM2566 = C0630.m2566("ܽۛ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-13557)) ^ (-1247835018);
                        i6 = 1954958144;
                    } else {
                        iM2566 = (C0630.m2566("ܶܽ") + i3) * (-15);
                        i5 = ((iM2566 ^ i4) * 28811) ^ (-1990351360);
                        i6 = 348956920;
                    }
                    break;
                case 723048075:
                case 1536529954:
                    C4075.m12263();
                    if (!C1005.m3501()) {
                        iM2566 = C2105.m6981("᩷ܽ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-3633)) ^ 1518297574;
                        i6 = -232099876;
                    } else {
                        iM2566 = (C2105.m6981("ܳۛ") + i4) * (-39);
                        i5 = ((iM2566 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    }
                    break;
                case 1205123919:
                case 1683361748:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C0630.m2566("ܿ۫") ^ i4) * 31;
                        i5 = ((iM2566 ^ i3) * 31339) ^ 2124109537;
                        i6 = -2071851623;
                    } else {
                        iM2566 = C0630.m2566("ۘᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 30829) ^ (-493769849);
                        i6 = -1793188453;
                    }
                    break;
                default:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C2105.m6981("ܳۛ") + i4) * (-39);
                        i5 = ((iM2566 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    } else {
                        iM2566 = C2105.m6981("ۡ۫") ^ i3;
                        i5 = ((iM2566 ^ i4) * 21183) ^ (-118105108);
                        i6 = -463431111;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27947(Activity activity, int i, boolean z) {
        int i2 = 434920996;
        int i3 = RunnableC1937.f6483;
        int i4 = C3537.f11231;
        int iM2566 = (C0630.m2566("֨ۜ") + i4) * (-53);
        int i5 = ((iM2566 ^ i3) * 32241) ^ (-466912710);
        int i6 = -544389522;
        while (true) {
            i2 = ((((i2 ^ i3) * (-27815)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2121345677:
                case 1939661390:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("۫᩹") ^ i3;
                        i5 = ((iM2566 ^ i4) * 10751) ^ (-721599357);
                        i6 = -1768037603;
                    } else {
                        iM2566 = (C2105.m6981("ܺᩳ") ^ i4) * 63;
                        i5 = ((iM2566 ^ i3) * 26079) ^ 1597961522;
                        i6 = 1805629172;
                    }
                    break;
                case -2104330040:
                case 507653759:
                    C1128.m3851();
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("۫᩹") ^ i3;
                        i5 = ((iM2566 ^ i4) * 10751) ^ (-721599357);
                        i6 = -1768037603;
                    } else {
                        iM2566 = (C0630.m2566("ܶ᩶") ^ i4) * (-73);
                        i5 = ((iM2566 ^ i3) * (-14073)) ^ 696656308;
                        i6 = 698095323;
                    }
                    break;
                case -2075271630:
                case -144957319:
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("᩶᩹") + i4) * (-109);
                        i5 = ((iM2566 ^ i3) * (-11639)) ^ (-69260942);
                        i6 = -1399909112;
                    } else {
                        iM2566 = C2105.m6981("ۛܿ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 2131) ^ (-1589974592);
                        i6 = -516359488;
                    }
                    break;
                case -2025026073:
                case -523362219:
                    C2958.m9034();
                    C2167.m7155();
                    break;
                case -1936465736:
                case -1278478087:
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C0630.m2566("ܶ᩶") ^ i4) * (-73);
                        i5 = ((iM2566 ^ i3) * (-14073)) ^ 696656308;
                        i6 = 698095323;
                    } else {
                        iM2566 = C2105.m6981("ܳۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-27061)) ^ 1294648950;
                        i6 = 2050961570;
                    }
                    break;
                case -1417225479:
                case 1726005908:
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("۫᩹") ^ i3;
                        i5 = ((iM2566 ^ i4) * 10751) ^ (-721599357);
                        i6 = -1768037603;
                    } else {
                        iM2566 = (C2105.m6981("᩻ۡ") ^ i4) * 87;
                        i5 = ((iM2566 ^ i3) * (-561)) ^ 1940020627;
                        i6 = -1198838680;
                    }
                    break;
                case -1309590885:
                case 1514622811:
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("ܳۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-4619)) ^ (-2082528842);
                        i6 = 1898781035;
                    } else {
                        iM2566 = C2105.m6981("ۨۨ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 23487) ^ (-195105123);
                        i6 = -494935964;
                    }
                    break;
                case -1283812649:
                case -1281140598:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (i4 - C2105.m6981("ܿ֫")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM2566 ^ i3) * (-12621)) ^ (-1013904093);
                        i6 = 430568218;
                    } else {
                        iM2566 = (C0630.m2566("֡ۜ") + i3) * (-57);
                        i5 = ((iM2566 ^ i4) * (-16993)) ^ 1182485684;
                        i6 = 2071337175;
                    }
                    break;
                case -1138352867:
                case 409260605:
                    C1005.m3501();
                    C3746.m11369();
                    iM2566 = C2105.m6981("ܳۧ") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-4619)) ^ (-2082528842);
                    i6 = 1898781035;
                    break;
                case -916285679:
                case 156485490:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C0630.m2566("ܶ᩶") ^ i4) * (-73);
                        i5 = ((iM2566 ^ i3) * (-14073)) ^ 696656308;
                        i6 = 698095323;
                    } else {
                        iM2566 = C2105.m6981("ܺ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-4451)) ^ (-187738730);
                        i6 = -1946245441;
                    }
                    break;
                case -321338931:
                case -20722436:
                    if (RunnableC1108.f4040) {
                        iM2566 = (C0630.m2566("۫ܶ") ^ i3) * 23;
                        i5 = ((iM2566 ^ i4) * 11835) ^ (-1839247476);
                        i6 = -771248506;
                    } else {
                        iM2566 = C2105.m6981("ܳۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-4619)) ^ (-2082528842);
                        i6 = 1898781035;
                    }
                    break;
                case -143553992:
                case 1688666243:
                    if (!C1711.f5919) {
                        iM2566 = (C2105.m6981("᩶᩹") + i4) * (-109);
                        i5 = ((iM2566 ^ i3) * (-11639)) ^ (-69260942);
                        i6 = -1399909112;
                    } else {
                        iM2566 = C2105.m6981("ܳۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-4619)) ^ (-2082528842);
                        i6 = 1898781035;
                    }
                    break;
                case 125750489:
                case 1526243368:
                    if (C3911.f12484 < 0) {
                        iM2566 = (C0630.m2566("ܶ᩶") ^ i4) * (-73);
                        i5 = ((iM2566 ^ i3) * (-14073)) ^ 696656308;
                        i6 = 698095323;
                    } else {
                        iM2566 = C2105.m6981("ܳۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-4619)) ^ (-2082528842);
                        i6 = 1898781035;
                    }
                    break;
                case 558178174:
                case 1258814852:
                    if (C4159.f13567) {
                        iM2566 = C0630.m2566("ܺۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 12093) ^ (-636841366);
                        i6 = 573096244;
                    } else {
                        iM2566 = (C0630.m2566("ܶ᩶") ^ i4) * (-73);
                        i5 = ((iM2566 ^ i3) * (-14073)) ^ 696656308;
                        i6 = 698095323;
                    }
                    break;
                case 1893465646:
                case 2090138306:
                    if (C2105.f7037 != 0) {
                        iM2566 = (C2105.m6981("᩶᩹") + i4) * (-109);
                        i5 = ((iM2566 ^ i3) * (-11639)) ^ (-69260942);
                        i6 = -1399909112;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܶܽ")) * 81;
                        i5 = ((iM2566 ^ i3) * 18751) ^ 2098954170;
                        i6 = -398898012;
                    }
                    break;
                default:
                    C9523.m24397((ContextWrapper) activity);
                    m27942(activity, i, z);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27943(Context context) {
        m27946(context);
        ServiceC19288.m44482();
    }
}
