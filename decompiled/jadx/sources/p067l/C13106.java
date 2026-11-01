package p067l;

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
public final class C13106 {
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0138  */
    /* JADX WARN: Code duplicated, block: B:53:0x0165  */
    /* JADX INFO: renamed from: ֫ */
    public static void m30005(ApplicationC21448 applicationC21448) {
        int iM55979;
        int i;
        String str = null;
        int i2 = 206310588;
        int i3 = C1071.f81975;
        int i4 = C0873.f81841;
        int iM559710 = C0946.m55979("֡ۙ") ^ i3;
        int i5 = ((iM559710 ^ i4) * (-13277)) ^ 1457241672;
        int i6 = -1926524567;
        while (true) {
            int i7 = iM559710 ^ i6;
            RunnableC20107 runnableC20107 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-4219)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1954607485:
                    case 995104267:
                        if (C1028.f81950 <= 0) {
                            iM55979 = C0946.m55979("֡ۚ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 28151) ^ 267220865;
                            i = -1163894383;
                        } else {
                            iM55979 = (C0946.m55979("ܶۜ") + i3) * 81;
                            i5 = ((iM55979 ^ i4) * 6157) ^ (-418862357);
                            i = -1792057859;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1723524957:
                    case -217188828:
                        if (C0992.m56107() > 0) {
                            runnableC20107 = new RunnableC20107(3);
                            if (C1071.f81975 > 0) {
                                iM55979 = C0873.m55680("ܳᩳ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 30609) ^ (-359802209);
                                i = 1981386622;
                                i7 = iM55979 ^ i;
                            }
                        }
                        break;
                    case -1473511411:
                    case 1867615686:
                        if (C0937.f81884) {
                            iM55979 = (C0946.m55979("᩷ۙ") + i4) * (-101);
                            i5 = ((iM55979 ^ i3) * (-11965)) ^ 2085786872;
                            i = 451494818;
                        } else {
                            iM55979 = C0873.m55680("۟ܿ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-20267)) ^ 2122291274;
                            i = 2119713098;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -1416561935:
                    case 1675450083:
                        C11419.m26419();
                        if (!C0873.m55678()) {
                            iM55979 = C0946.m55979("ۜ᩷") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-20343)) ^ 484838029;
                            i = -774959394;
                            i7 = iM55979 ^ i;
                        }
                        break;
                    case -1135890363:
                    case 1178284518:
                        if (C0854.f81826 != 0) {
                            iM55979 = C0873.m55680("۟ܿ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-20267)) ^ 2122291274;
                            i = 2119713098;
                        } else {
                            iM55979 = C0946.m55979("᩺ۜ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-12781)) ^ 1709192551;
                            i = -1902844561;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -847958111:
                    case 1767945638:
                        str = null;
                        if (C0845.m55584() > 0) {
                            iM55979 = C0873.m55680("۬ᩳ") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-12735)) ^ 339436556;
                            i = -1783245342;
                            i7 = iM55979 ^ i;
                        }
                        break;
                    case -821703773:
                    case -396623506:
                        C11419.m26408((ContextWrapper) applicationC21448, str);
                        C11419.m26407((ContextWrapper) applicationC21448);
                        break;
                    case -731694344:
                    case 1585742624:
                        C1017.m56187();
                        if (C0894.f81854 < 0) {
                            iM55979 = C0873.m55680("۟ܿ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-20267)) ^ 2122291274;
                            i = 2119713098;
                        } else {
                            iM55979 = C0873.m55680("۠᩻") ^ i4;
                            i5 = ((iM55979 ^ i3) * 24107) ^ (-256664156);
                            i = 2090952820;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -728417029:
                    case 1866641232:
                        if (C1229.m56410() != 0) {
                            iM55979 = C0873.m55680("֡ܶ") ^ i3;
                            i5 = ((iM55979 ^ i4) * 19701) ^ (-1465708265);
                            i = -220704371;
                        } else {
                            iM55979 = (i4 - C0946.m55979("ۡ᩻")) * 49;
                            i5 = ((iM55979 ^ i3) * 29391) ^ (-643081449);
                            i = 496293930;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -620477208:
                    case 1227588040:
                        if (C0877.m55696()) {
                            iM55979 = C0946.m55979("֡ۚ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 28151) ^ 267220865;
                            i = -1163894383;
                        } else {
                            iM55979 = C0873.m55680("֡ܶ") ^ i3;
                            i5 = ((iM55979 ^ i4) * 19701) ^ (-1465708265);
                            i = -220704371;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -535807090:
                    case 2035116582:
                        if (C0854.f81826 != 0) {
                            iM55979 = C0873.m55680("۠᩻") ^ i4;
                            i5 = ((iM55979 ^ i3) * 24107) ^ (-256664156);
                            i = 2090952820;
                        } else {
                            iM55979 = C0873.m55680("֡ܶ") ^ i3;
                            i5 = ((iM55979 ^ i4) * 19701) ^ (-1465708265);
                            i = -220704371;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 738360314:
                    case 981901002:
                        C23223.m51770();
                        if (C1964.f83032 <= 0) {
                            iM55979 = C0873.m55680("۠᩻") ^ i4;
                            i5 = ((iM55979 ^ i3) * 24107) ^ (-256664156);
                            i = 2090952820;
                        } else {
                            iM55979 = C0946.m55979("۟ۘ") ^ i3;
                            i5 = ((iM55979 ^ i4) * 22019) ^ 513230746;
                            i = -709430467;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 749312408:
                    case 2056406145:
                        C23223.m51765(runnableC20107);
                        m30007(applicationC21448);
                        if (C0992.f81922 >= 0) {
                            iM55979 = C0873.m55680("֡ܶ") ^ i3;
                            i5 = ((iM55979 ^ i4) * 19701) ^ (-1465708265);
                            i = -220704371;
                        } else {
                            iM55979 = (i3 - C0946.m55979("ܶ۟")) * (-85);
                            i5 = ((iM55979 ^ i4) * (-22119)) ^ (-594438300);
                            i = 1250639547;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 1491289034:
                    case 1560423998:
                        C0967.m56074();
                        C0992.m56107();
                        break;
                    default:
                        C1044.m56286();
                        C0861.m55626();
                        iM55979 = C0873.m55680("۟ܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-20267)) ^ 2122291274;
                        i = 2119713098;
                        i7 = iM55979 ^ i;
                        break;
                }
                return;
            }
            iM559710 = (C0873.m55680("ܳ᩹") + i3) * (-23);
            i5 = ((iM559710 ^ i4) * (-15335)) ^ 806093360;
            i6 = 1577896510;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Context m30002(Context context, int i, boolean z) {
        Context contextM26413 = null;
        Context contextCreateConfigurationContext = null;
        int i2 = 2067100024;
        int i3 = C1046.f81962;
        int i4 = C1012.f81938;
        int iM55680 = C0873.m55680("ۚۘ") ^ i3;
        int i5 = ((iM55680 ^ i4) * 27019) ^ 1116417972;
        int i6 = -327175214;
        while (true) {
            i2 = ((((i2 ^ i4) * 22477) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2146381640:
                case 988076322:
                    if (C0882.m55710() != 0) {
                        iM55680 = C0946.m55979("᩷ۛ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-20139)) ^ (-474306496);
                        i6 = 942560793;
                    } else {
                        iM55680 = (C0946.m55979("֫᩵") ^ i3) * (-27);
                        i5 = ((iM55680 ^ i4) * 29089) ^ (-690658004);
                        i6 = -2140241076;
                    }
                    break;
                case -2125507184:
                case -2102178072:
                    if (C1024.m56209() >= 0) {
                        iM55680 = C0946.m55979("᩷ۛ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-20139)) ^ (-474306496);
                        i6 = 942560793;
                    } else {
                        iM55680 = C0946.m55979("۬֨") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-1425)) ^ (-1316393058);
                        i6 = -1831294449;
                    }
                    break;
                case -2119064829:
                case -708327887:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0946.m55979("ۗ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * 17895) ^ (-1959207252);
                        i6 = 1777965089;
                    } else {
                        iM55680 = C0873.m55680("ᩴۖ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-19977)) ^ 648030033;
                        i6 = -1520817546;
                    }
                    break;
                case -1971502973:
                case -402218556:
                    AbstractC0942.m55971();
                    return null;
                case -1965731670:
                case 1106101684:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("ۨܳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-22961)) ^ 803926502;
                        i6 = 889476827;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۙܺ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM55680 ^ i3) * 25959) ^ 377082777;
                        i6 = -1006700015;
                    }
                    break;
                case -1858221340:
                case -1162415541:
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ۘᩳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 9539) ^ (-825797874);
                        i6 = 1624470402;
                    } else {
                        iM55680 = C0946.m55979("ۗ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * 17895) ^ (-1959207252);
                        i6 = 1777965089;
                    }
                    break;
                case -1576619499:
                case 1071382794:
                    SharedPreferences sharedPreferences = C7050.f18355;
                    if (C23223.m51769(contextM26413.getResources().getConfiguration(), i)) {
                        iM55680 = (i4 - C0873.m55680("ᩴ᩷")) * 63;
                        i5 = ((iM55680 ^ i3) * 3181) ^ 1755921961;
                        i6 = -1890204544;
                    } else {
                        iM55680 = C0946.m55979("ܳۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 19) ^ (-1044259338);
                        i6 = 1128827552;
                    }
                    break;
                case -1005458284:
                case -340447849:
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("ۨܳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-22961)) ^ 803926502;
                        i6 = 889476827;
                    } else {
                        iM55680 = C0946.m55979("ۛ۫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 21611) ^ 918530698;
                        i6 = 1918024396;
                    }
                    break;
                case -868632407:
                case 1466897423:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("ۗ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * 17895) ^ (-1959207252);
                        i6 = 1777965089;
                    } else {
                        iM55680 = C0873.m55680("ܽᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 21431) ^ (-1038005226);
                        i6 = 874731749;
                    }
                    break;
                case -823623704:
                case 1487536749:
                    C1229.m56410();
                    iM55680 = C0946.m55979("ۗۤ") ^ i4;
                    i5 = ((iM55680 ^ i3) * (-7491)) ^ 863787549;
                    i6 = 1063895366;
                    break;
                case -664689404:
                case 614202139:
                    if (RunnableC0897.m55784()) {
                        iM55680 = C0946.m55979("ۨܳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-22961)) ^ 803926502;
                        i6 = 889476827;
                    } else {
                        iM55680 = (i4 - C0873.m55680("۠ۙ")) * (-73);
                        i5 = ((iM55680 ^ i3) * (-28337)) ^ (-1008612220);
                        i6 = -1857486032;
                    }
                    break;
                case -641900983:
                case -208631245:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("ۗۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-7491)) ^ 863787549;
                        i6 = 1063895366;
                    } else {
                        iM55680 = C0946.m55979("ۛܰ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-12951)) ^ (-1571903788);
                        i6 = -602140232;
                    }
                    break;
                case -588436106:
                case 1834222154:
                    if (!C0892.f81851) {
                        iM55680 = C0946.m55979("ۨܳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-22961)) ^ 803926502;
                        i6 = 889476827;
                    } else {
                        iM55680 = C0946.m55979("ۗۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-7491)) ^ 863787549;
                        i6 = 1063895366;
                    }
                    break;
                case -223604290:
                case 6805531:
                    return contextM26413;
                case 360838675:
                case 1026153316:
                    Configuration configuration = contextM26413.getResources().getConfiguration();
                    if (C1046.f81962 > 0) {
                        Configuration configuration2 = new Configuration(configuration);
                        C23223.m51764(configuration2, i);
                        contextCreateConfigurationContext = contextM26413.createConfigurationContext(configuration2);
                        iM55680 = C0873.m55680("᩻ܶ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-16213)) ^ 775385964;
                        i6 = -760697386;
                    } else {
                        iM55680 = C0946.m55979("ۗ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * 17895) ^ (-1959207252);
                        i6 = 1777965089;
                    }
                    break;
                case 1034433309:
                case 1659517076:
                    contextM26413 = C11419.m26413(context);
                    if (z) {
                        iM55680 = C0946.m55979("᩷ܰ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-17689)) ^ 712661670;
                        i6 = -1902363779;
                    } else {
                        contextCreateConfigurationContext = contextM26413;
                        iM55680 = C0873.m55680("᩻ܶ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-16213)) ^ 775385964;
                        i6 = -760697386;
                    }
                    break;
                case 1057413205:
                case 1740622565:
                    return contextCreateConfigurationContext;
                case 1425735645:
                case 1860499450:
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0946.m55979("֫᩵") ^ i3) * (-27);
                        i5 = ((iM55680 ^ i4) * 29089) ^ (-690658004);
                        i6 = -2140241076;
                    } else {
                        iM55680 = C0946.m55979("ۗۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-7491)) ^ 863787549;
                        i6 = 1063895366;
                    }
                    break;
                case 1556172771:
                case 1826136284:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0946.m55979("ۨܳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-22961)) ^ 803926502;
                        i6 = 889476827;
                    } else {
                        iM55680 = C0946.m55979("ۗ֡") ^ i4;
                        i5 = ((iM55680 ^ i3) * 9237) ^ (-881576847);
                        i6 = 878434066;
                    }
                    break;
                default:
                    int i7 = C23223.f73006;
                    if (C7050.f18355 != null) {
                        iM55680 = (i4 - C0946.m55979("֫᩺")) * (-75);
                        i5 = ((iM55680 ^ i3) * (-12223)) ^ 245242677;
                        i6 = 1363293464;
                    } else {
                        contextCreateConfigurationContext = contextM26413;
                        iM55680 = C0873.m55680("᩻ܶ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-16213)) ^ 775385964;
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
    /* JADX INFO: renamed from: ۧ */
    public static void m30007(Context context) {
        int iM55680;
        int i;
        Resources resources = null;
        Configuration configuration = null;
        int i2 = 0;
        Resources resourcesM16235 = null;
        Resources resources2 = null;
        boolean zM51769 = false;
        int i3 = 460906105;
        int i4 = ViewOnClickListenerC0939.f81888;
        int i5 = C1124.f82007;
        int iM55681 = C0873.m55680("᩸ۡ") ^ i4;
        int i6 = ((iM55681 ^ i5) * (-32155)) ^ (-2124926586);
        int i7 = 230142654;
        while (true) {
            int i8 = iM55681 ^ i7;
            Configuration configuration2 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 5059) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2031683699:
                    case -2024826930:
                        Configuration configuration3 = resources.getConfiguration();
                        if (C1017.m56187() > 0) {
                            configuration2 = new Configuration(configuration3);
                            if (C1229.m56410() != 0) {
                                iM55680 = (i4 - C0946.m55979("֫ᩴ")) * 99;
                                i6 = ((iM55680 ^ i5) * 26735) ^ (-1494695471);
                                i = -1722595594;
                            } else {
                                iM55680 = C0946.m55979("᩹ۚ") ^ i4;
                                i6 = ((iM55680 ^ i5) * 27953) ^ 1134301761;
                                i = 1993002174;
                            }
                            i8 = iM55680 ^ i;
                        }
                        break;
                    case -2009883598:
                    case 1606538644:
                        if (C1929.f83011 == 0) {
                            iM55680 = C0873.m55680("֫ۧ") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-5053)) ^ (-926024855);
                            i = -1834706494;
                        } else {
                            iM55680 = C0873.m55680("֫ۤ") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-10041)) ^ 1312286475;
                            i = -1407387603;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -2003681255:
                    case 1415264440:
                        i2 = -100;
                        if (C23223.m51769(configuration, -100)) {
                            iM55680 = (C0873.m55680("ۢ֨") ^ i5) * (-53);
                            i6 = ((iM55680 ^ i4) * (-3063)) ^ (-1182101702);
                            i = -1756674063;
                        } else {
                            iM55680 = C0873.m55680("᩸ܶ") ^ i5;
                            i6 = ((iM55680 ^ i4) * 10793) ^ (-1948170547);
                            i = 1808985188;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1983624376:
                    case 1150097697:
                        C1046.m56302();
                        iM55680 = (C0946.m55979("ۖۢ") ^ i4) * (-31);
                        i6 = ((iM55680 ^ i5) * (-6715)) ^ 1567746571;
                        i = -1401061540;
                        i8 = iM55680 ^ i;
                        break;
                    case -1902580501:
                    case 1503079904:
                        int i9 = C23223.f73006;
                        if (C0989.m56095() <= 0) {
                            iM55680 = C0873.m55680("֫ۧ") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-5053)) ^ (-926024855);
                            i = -1834706494;
                        } else {
                            iM55680 = (i4 - C0873.m55680("۟ᩴ")) * (-127);
                            i6 = ((iM55680 ^ i5) * 21095) ^ 1507719327;
                            i = 1414267749;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1835138660:
                    case -1683762919:
                        if (C1046.m56302() != 0) {
                            iM55680 = (i4 - C0946.m55979("ۖۖ")) * 81;
                            i6 = ((iM55680 ^ i5) * (-26259)) ^ 1891456406;
                            i = 389161621;
                        } else {
                            iM55680 = (C0873.m55680("ܰ֡") ^ i5) * (-75);
                            i6 = ((iM55680 ^ i4) * 7309) ^ (-810221482);
                            i = -578224474;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1651656567:
                    case 1696775987:
                        if (C7050.f18355 != null) {
                            iM55680 = C0873.m55680("۬ܰ") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-8139)) ^ 1111529372;
                            i = 278268959;
                        } else {
                            iM55680 = (C0873.m55680("ܽᩴ") + i4) * (-59);
                            i6 = ((iM55680 ^ i5) * (-3989)) ^ (-342021984);
                            i = -1945500956;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1614215306:
                    case 1020502557:
                        try {
                            Configuration configuration4 = new Configuration(resourcesM16235.getConfiguration());
                            C23223.m51764(configuration4, i2);
                            resourcesM16235.updateConfiguration(configuration4, resourcesM16235.getDisplayMetrics());
                            break;
                        } catch (Throwable unused) {
                        }
                        iM55680 = (C0873.m55680("ܽᩴ") + i4) * (-59);
                        i6 = ((iM55680 ^ i5) * (-3989)) ^ (-342021984);
                        i = -1945500956;
                        i8 = iM55680 ^ i;
                        break;
                    case -1583667774:
                    case 1457790242:
                        if (resourcesM16235 != resources2) {
                            iM55680 = C0946.m55979("ۜ᩷") ^ i5;
                            i6 = ((iM55680 ^ i4) * 19841) ^ (-1581028813);
                            i = -1687052135;
                        } else {
                            iM55680 = (C0873.m55680("ܽᩴ") + i4) * (-59);
                            i6 = ((iM55680 ^ i5) * (-3989)) ^ (-342021984);
                            i = -1945500956;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1340399075:
                    case 1984327637:
                        zM51769 = C23223.m51769(resourcesM16235.getConfiguration(), i2);
                        iM55680 = (i4 - C0873.m55680("᩹ۧ")) * (-69);
                        i6 = ((iM55680 ^ i5) * (-1825)) ^ (-1010827607);
                        i = 470779048;
                        i8 = iM55680 ^ i;
                        break;
                    case -1320019664:
                    case 1674502343:
                        C0882.m55710();
                        break;
                    case -1227115875:
                    case 1626986587:
                        configuration = resources.getConfiguration();
                        if (C1017.m56187() <= 0) {
                            iM55680 = C0873.m55680("ۖ᩻") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-9081)) ^ (-717978182);
                            i = -1237832196;
                        } else {
                            iM55680 = C0873.m55680("᩵ۡ") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-18101)) ^ 2132236293;
                            i = -592257246;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1180680601:
                    case 1093365475:
                        if (C1053.f81965 > 0) {
                            iM55680 = (i5 - C0873.m55680("֫ۖ")) * (-103);
                            i6 = ((iM55680 ^ i4) * (-12095)) ^ 1720913273;
                            i = 1640543786;
                        } else {
                            iM55680 = (C0873.m55680("ܳۡ") ^ i4) * 119;
                            i6 = ((iM55680 ^ i5) * 22885) ^ 815381520;
                            i = 1765807704;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1081061765:
                    case 1562474104:
                        if (C1044.f81959 >= 0) {
                            iM55680 = (i4 - C0946.m55979("֫ᩴ")) * 99;
                            i6 = ((iM55680 ^ i5) * 26735) ^ (-1494695471);
                            i = -1722595594;
                        } else {
                            iM55680 = C0873.m55680("᩶۬") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-19875)) ^ (-100972156);
                            i = 822222898;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -964195479:
                    case -771237900:
                        if (C1053.m56327() >= 0) {
                            iM55680 = (C0946.m55979("ۖۢ") ^ i4) * (-31);
                            i6 = ((iM55680 ^ i5) * (-6715)) ^ 1567746571;
                            i = -1401061540;
                        } else {
                            iM55680 = C0873.m55680("ۖ᩻") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-9081)) ^ (-717978182);
                            i = -1237832196;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -864721618:
                    case 1330400987:
                        if (zM51769) {
                            iM55680 = (C0873.m55680("ܽᩴ") + i4) * (-59);
                            i6 = ((iM55680 ^ i5) * (-3989)) ^ (-342021984);
                            i = -1945500956;
                        } else {
                            iM55680 = (C0946.m55979("ܽܺ") + i5) * (-91);
                            i6 = ((iM55680 ^ i4) * (-1883)) ^ 1224277876;
                            i = 853289778;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -787390086:
                    case -595065038:
                        if (C0882.f81846) {
                            iM55680 = (i4 - C0946.m55979("֫ᩴ")) * 99;
                            i6 = ((iM55680 ^ i5) * 26735) ^ (-1494695471);
                            i = -1722595594;
                        } else {
                            iM55680 = C0873.m55680("᩷ۤ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 7303) ^ (-631245107);
                            i = -1421196249;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -347552168:
                    case 585782024:
                        C23223.m51764(configuration2, i2);
                        resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
                        iM55680 = (C0873.m55680("ۢ֨") ^ i5) * (-53);
                        i6 = ((iM55680 ^ i4) * (-3063)) ^ (-1182101702);
                        i = -1756674063;
                        i8 = iM55680 ^ i;
                        break;
                    case -340224999:
                    case 394614050:
                        break;
                    case -309030197:
                    case 377770151:
                        if (C1194.f82045 != 0) {
                            iM55680 = (C0873.m55680("᩶ܳ") + i5) * 31;
                            i6 = ((iM55680 ^ i4) * 28727) ^ (-359409443);
                            i = -1643026072;
                        } else {
                            iM55680 = (C0873.m55680("᩻᩷") + i5) * (-19);
                            i6 = ((iM55680 ^ i4) * 15717) ^ 20775368;
                            i = -1205751163;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -288106298:
                    case 394726052:
                        if (C0854.f81826 == 0) {
                            iM55680 = C0873.m55680("ۖ᩻") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-9081)) ^ (-717978182);
                            i = -1237832196;
                        } else {
                            iM55680 = C0873.m55680("֫ۧ") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-5053)) ^ (-926024855);
                            i = -1834706494;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -39718516:
                    case 2044946660:
                        SharedPreferences sharedPreferences = C7050.f18355;
                        resources = context.getResources();
                        if (C1124.f82007 >= 0) {
                            iM55680 = (C0873.m55680("᩶ܳ") + i5) * 31;
                            i6 = ((iM55680 ^ i4) * 28727) ^ (-359409443);
                            i = -1643026072;
                        } else {
                            iM55680 = (C0946.m55979("ᩳ᩺") ^ i5) * (-63);
                            i6 = ((iM55680 ^ i4) * (-14507)) ^ 859102101;
                            i = 381898925;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -24175105:
                    case 1965284903:
                        if (C1124.f82007 >= 0) {
                        }
                        iM55680 = (i5 - C0873.m55680("֫ۖ")) * (-103);
                        i6 = ((iM55680 ^ i4) * (-12095)) ^ 1720913273;
                        i = 1640543786;
                        i8 = iM55680 ^ i;
                        break;
                    case -9774243:
                    case 291213611:
                        if (C0894.f81854 >= 0) {
                            iM55680 = (C0946.m55979("ۖۢ") ^ i4) * (-31);
                            i6 = ((iM55680 ^ i5) * (-6715)) ^ 1567746571;
                            i = -1401061540;
                        } else {
                            iM55680 = C0873.m55680("ۛۤ") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-18111)) ^ 1592619724;
                            i = 2141846178;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case 271127964:
                    case 1118071614:
                        C0937.m55918();
                        if (C0930.f81879 > 0) {
                            iM55680 = (i5 - C0873.m55680("֫ۖ")) * (-103);
                            i6 = ((iM55680 ^ i4) * (-12095)) ^ 1720913273;
                            i = 1640543786;
                        } else {
                            iM55680 = (C0873.m55680("᩶ܳ") + i5) * 31;
                            i6 = ((iM55680 ^ i4) * 28727) ^ (-359409443);
                            i = -1643026072;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case 620534940:
                    case 1948499914:
                        resourcesM16235 = C7050.m16235();
                        resources2 = context.getResources();
                        iM55680 = (C0946.m55979("᩻ܰ") ^ i4) * 69;
                        i6 = ((iM55680 ^ i5) * (-19095)) ^ 1779639717;
                        i = 223487208;
                        i8 = iM55680 ^ i;
                        break;
                    case 887116503:
                    case 1527768014:
                        C0882.m55710();
                        if (C0992.f81922 < 0) {
                        }
                        iM55680 = (C0946.m55979("ۖۢ") ^ i4) * (-31);
                        i6 = ((iM55680 ^ i5) * (-6715)) ^ 1567746571;
                        i = -1401061540;
                        i8 = iM55680 ^ i;
                        break;
                    default:
                        if (C1044.f81959 < 0) {
                            iM55680 = (C0946.m55979("ۖۢ") ^ i4) * (-31);
                            i6 = ((iM55680 ^ i5) * (-6715)) ^ 1567746571;
                            i = -1401061540;
                        } else {
                            iM55680 = (i4 - C0946.m55979("ۖۖ")) * 81;
                            i6 = ((iM55680 ^ i5) * (-26259)) ^ 1891456406;
                            i = 389161621;
                        }
                        i8 = iM55680 ^ i;
                        break;
                }
                return;
            }
            iM55681 = (C0946.m55979("᩺ۜ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
            i6 = ((iM55681 ^ i5) * 27841) ^ (-58091379);
            i7 = -1510226693;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30003(Activity activity, int i, boolean z) {
        int i2 = 732374125;
        int i3 = C0992.f81922;
        int i4 = C1046.f81962;
        int iM55979 = C0946.m55979("ۤܽ") ^ i4;
        int i5 = ((iM55979 ^ i3) * 22025) ^ (-1424423478);
        int i6 = 1771098440;
        while (true) {
            i2 = ((((i2 ^ i3) * 20349) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2146585791:
                case 1808208466:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0946.m55979("ܺ֡") + i4) * 73;
                        i5 = ((iM55979 ^ i3) * (-32525)) ^ 1859437711;
                        i6 = 1414936380;
                    } else {
                        iM55979 = (i4 - C0946.m55979("᩹֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM55979 ^ i3) * 14611) ^ 1523838475;
                        i6 = 1605586329;
                    }
                    break;
                case -1902543361:
                case -390961412:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0946.m55979("ܺ֡") + i4) * 73;
                        i5 = ((iM55979 ^ i3) * (-32525)) ^ 1859437711;
                        i6 = 1414936380;
                    } else {
                        iM55979 = C0946.m55979("ۚ᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-20637)) ^ (-895072269);
                        i6 = 1137235428;
                    }
                    break;
                case -1663315211:
                case 1010704384:
                    if (C23223.m51769(activity.getResources().getConfiguration(), i)) {
                        iM55979 = (C0946.m55979("ۗۖ") + i3) * (-117);
                        i5 = ((iM55979 ^ i4) * 19325) ^ (-359492479);
                        i6 = 118680338;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * 9833) ^ 477729324;
                        i6 = 120899311;
                    }
                    break;
                case -1631115441:
                case 352428440:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("ۚۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    } else {
                        iM55979 = C0873.m55680("ܳܰ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 6253) ^ (-1154011581);
                        i6 = 135263326;
                    }
                    break;
                case -1399677999:
                case -236976771:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("ܿۨ") ^ i4) * 27;
                        i5 = ((iM55979 ^ i3) * (-8485)) ^ 363560890;
                        i6 = 1489616591;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۘ֨")) * 81;
                        i5 = ((iM55979 ^ i4) * 4747) ^ (-1804690370);
                        i6 = 486821586;
                    }
                    break;
                case -816639253:
                case -373577779:
                    ViewOnClickListenerC0939.m55941();
                    if (!C0873.m55678()) {
                        iM55979 = (C0946.m55979("۫᩹") ^ i3) * 39;
                        i5 = ((iM55979 ^ i4) * (-10979)) ^ 1890034246;
                        i6 = -334155275;
                    } else {
                        iM55979 = C0873.m55680("ۚۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    }
                    break;
                case -611912463:
                case 1713733613:
                    if (activity.isDestroyed()) {
                        iM55979 = (C0946.m55979("ۗۖ") + i3) * (-117);
                        i5 = ((iM55979 ^ i4) * 19325) ^ (-359492479);
                        i6 = 118680338;
                    } else {
                        iM55979 = C0946.m55979("֫۬") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-26395)) ^ (-2116716549);
                        i6 = -778100911;
                    }
                    break;
                case -573558765:
                case 916215719:
                    SharedPreferences sharedPreferences = C7050.f18355;
                    if (C0989.m56094(activity)) {
                        iM55979 = (C0946.m55979("ۗۖ") + i3) * (-117);
                        i5 = ((iM55979 ^ i4) * 19325) ^ (-359492479);
                        i6 = 118680338;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩶ܿ")) * 31;
                        i5 = ((iM55979 ^ i3) * (-3429)) ^ 574234554;
                        i6 = 1501786195;
                    }
                    break;
                case -544456089:
                case 1305830432:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("ۚۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    } else {
                        iM55979 = (C0946.m55979("ܺ֡") + i4) * 73;
                        i5 = ((iM55979 ^ i3) * (-32525)) ^ 1859437711;
                        i6 = 1414936380;
                    }
                    break;
                case -426224377:
                case -337075966:
                    C0917.m55854();
                    C1964.m56597();
                    break;
                case -149338382:
                case 36019320:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0946.m55979("۫᩹") ^ i3) * 39;
                        i5 = ((iM55979 ^ i4) * (-10979)) ^ 1890034246;
                        i6 = -334155275;
                    } else {
                        iM55979 = C0946.m55979("۫ۜ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 789) ^ (-1480188354);
                        i6 = 588134169;
                    }
                    break;
                case -139825978:
                case 1586483883:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0946.m55979("۫᩹") ^ i3) * 39;
                        i5 = ((iM55979 ^ i4) * (-10979)) ^ 1890034246;
                        i6 = -334155275;
                    } else {
                        iM55979 = (C0946.m55979("֡ۢ") + i3) * (-101);
                        i5 = ((iM55979 ^ i4) * (-1715)) ^ (-1929810121);
                        i6 = 1556433342;
                    }
                    break;
                case -29204671:
                case 2139720981:
                    if (!C0927.f81875) {
                        iM55979 = C0873.m55680("ۚۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    } else {
                        iM55979 = C0873.m55680("ۡ᩸") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-26861)) ^ (-372346);
                        i6 = -1717934085;
                    }
                    break;
                case 163017022:
                case 1647856821:
                    if (C0898.m55800() <= 0) {
                        iM55979 = C0873.m55680("ۚۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    } else {
                        iM55979 = C0873.m55680("᩹ۜ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-21229)) ^ (-1048712529);
                        i6 = -2040160223;
                    }
                    break;
                case 655823308:
                case 1626129560:
                    RunnableC0871.m55672();
                    C0894.m55769();
                    iM55979 = (C0946.m55979("ܺ֡") + i4) * 73;
                    i5 = ((iM55979 ^ i3) * (-32525)) ^ 1859437711;
                    i6 = 1414936380;
                    break;
                case 660725068:
                case 1674905207:
                    break;
                case 742613186:
                case 948651380:
                    int i7 = C23223.f73006;
                    if (C7050.f18355 != null) {
                        iM55979 = C0946.m55979("ᩳۙ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 1061) ^ 678371905;
                        i6 = -616635247;
                    } else {
                        iM55979 = (C0946.m55979("ۗۖ") + i3) * (-117);
                        i5 = ((iM55979 ^ i4) * 19325) ^ (-359492479);
                        i6 = 118680338;
                    }
                    break;
                case 852751602:
                case 1192775553:
                    if (z) {
                        iM55979 = (C0946.m55979("۬ᩳ") + i4) * (-7);
                        i5 = ((iM55979 ^ i3) * 19275) ^ (-392190228);
                        i6 = -1728222390;
                    } else {
                        iM55979 = (C0946.m55979("ۗۖ") + i3) * (-117);
                        i5 = ((iM55979 ^ i4) * 19325) ^ (-359492479);
                        i6 = 118680338;
                    }
                    break;
                case 1040658051:
                case 1375581009:
                    activity.recreate();
                    iM55979 = (C0946.m55979("ۗۖ") + i3) * (-117);
                    i5 = ((iM55979 ^ i4) * 19325) ^ (-359492479);
                    i6 = 118680338;
                    break;
                case 1062836022:
                case 1479044354:
                    if (C0930.m55885() <= 0) {
                        iM55979 = C0873.m55680("ۚۚ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30913) ^ 540177411;
                        i6 = -894024836;
                    } else {
                        iM55979 = C0946.m55979("ۗܽ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-12653)) ^ (-1892535890);
                        i6 = 138842954;
                    }
                    break;
                case 1208194735:
                case 1976004847:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0946.m55979("ܿۨ") ^ i4) * 27;
                        i5 = ((iM55979 ^ i3) * (-8485)) ^ 363560890;
                        i6 = 1489616591;
                    } else {
                        iM55979 = (C0873.m55680("ۡ᩷") + i3) * 13;
                        i5 = ((iM55979 ^ i4) * 20077) ^ 227108246;
                        i6 = -101561454;
                    }
                    break;
                default:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("ۡ᩸") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-26861)) ^ (-372346);
                        i6 = -1717934085;
                    } else {
                        iM55979 = C0873.m55680("ۗ᩷") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-6773)) ^ (-229722095);
                        i6 = -94638090;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m30006(Activity activity, int i, boolean z) {
        int i2 = -550196532;
        int i3 = C1046.f81962;
        int i4 = C0949.f81897;
        int iM55680 = (C0873.m55680("ۙܶ") + i3) * 51;
        int i5 = ((iM55680 ^ i4) * (-8481)) ^ (-1813095300);
        int i6 = -411119794;
        while (true) {
            i2 = ((((i2 ^ i4) * 2923) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -1917777997:
                case 1279819558:
                    if (C0894.m55769() >= 0) {
                        iM55680 = (i3 - C0873.m55680("ۧ۠")) * (-25);
                        i5 = ((iM55680 ^ i4) * 29483) ^ 669805125;
                        i6 = -571416384;
                    } else {
                        iM55680 = C0946.m55979("֡ۗ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 26245) ^ 1629863980;
                        i6 = 1660067987;
                    }
                    break;
                case -1775037016:
                case -1389672862:
                    if (C0937.f81884) {
                        iM55680 = (C0873.m55680("᩹֫") + i4) * 59;
                        i5 = ((iM55680 ^ i3) * (-5461)) ^ (-25618056);
                        i6 = 2031997183;
                    } else {
                        iM55680 = (C0946.m55979("ܳۛ") + i4) * (-39);
                        i5 = ((iM55680 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    }
                    break;
                case -1691867637:
                case 1512470311:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0946.m55979("ܳۛ") + i4) * (-39);
                        i5 = ((iM55680 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    } else {
                        iM55680 = (C0873.m55680("ۖ᩹") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM55680 ^ i3) * (-8143)) ^ 580613545;
                        i6 = -1395959411;
                    }
                    break;
                case -1528770851:
                case 104634034:
                    C1048.m56305();
                    iM55680 = (C0873.m55680("ܿ۫") ^ i4) * 31;
                    i5 = ((iM55680 ^ i3) * 31339) ^ 2124109537;
                    i6 = -2071851623;
                    break;
                case -1516073579:
                case -705362929:
                    C1036.m56257();
                    C0861.m55626();
                    break;
                case -1378869160:
                case 379417627:
                    if (!C0861.f81831) {
                        iM55680 = (i3 - C0873.m55680("ۧ۠")) * (-25);
                        i5 = ((iM55680 ^ i4) * 29483) ^ 669805125;
                        i6 = -571416384;
                    } else {
                        iM55680 = (C0873.m55680("ܿ۫") ^ i4) * 31;
                        i5 = ((iM55680 ^ i3) * 31339) ^ 2124109537;
                        i6 = -2071851623;
                    }
                    break;
                case -1297490764:
                case 494861517:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0946.m55979("ܳۛ") + i4) * (-39);
                        i5 = ((iM55680 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    } else {
                        iM55680 = C0873.m55680("֫۬") ^ i3;
                        i5 = ((iM55680 ^ i4) * 18945) ^ (-1872079685);
                        i6 = 849290194;
                    }
                    break;
                case -1146840605:
                case -474574468:
                    if (C0955.f81898) {
                        iM55680 = (C0946.m55979("ܳۛ") + i4) * (-39);
                        i5 = ((iM55680 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    } else {
                        iM55680 = C0873.m55680("֫ۛ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-29889)) ^ (-1523659261);
                        i6 = -840889796;
                    }
                    break;
                case -1087733148:
                case -610034420:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (i3 - C0873.m55680("ۧ۠")) * (-25);
                        i5 = ((iM55680 ^ i4) * 29483) ^ 669805125;
                        i6 = -571416384;
                    } else {
                        iM55680 = (C0946.m55979("ܳۨ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55680 ^ i3) * 3601) ^ (-1024624910);
                        i6 = 963215077;
                    }
                    break;
                case -1035618006:
                case 1856859479:
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("᩷ܽ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-3633)) ^ 1518297574;
                        i6 = -232099876;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ܰܰ")) * 87;
                        i5 = ((iM55680 ^ i4) * 25677) ^ 76437011;
                        i6 = -1516832307;
                    }
                    break;
                case -17907082:
                case 1657919822:
                    C11419.m26407((ContextWrapper) activity);
                    m30003(activity, i, z);
                    break;
                case 216672416:
                case 1296190242:
                    if (C1003.m56123() != 0) {
                        iM55680 = C0946.m55979("᩷ܽ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-3633)) ^ 1518297574;
                        i6 = -232099876;
                    } else {
                        iM55680 = (C0873.m55680("ܿ۫") ^ i4) * 31;
                        i5 = ((iM55680 ^ i3) * 31339) ^ 2124109537;
                        i6 = -2071851623;
                    }
                    break;
                case 378778444:
                case 767624547:
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("ܽۛ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-13557)) ^ (-1247835018);
                        i6 = 1954958144;
                    } else {
                        iM55680 = (C0873.m55680("ܶܽ") + i3) * (-15);
                        i5 = ((iM55680 ^ i4) * 28811) ^ (-1990351360);
                        i6 = 348956920;
                    }
                    break;
                case 723048075:
                case 1536529954:
                    C1044.m56286();
                    if (!C0892.m55749()) {
                        iM55680 = C0946.m55979("᩷ܽ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-3633)) ^ 1518297574;
                        i6 = -232099876;
                    } else {
                        iM55680 = (C0946.m55979("ܳۛ") + i4) * (-39);
                        i5 = ((iM55680 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    }
                    break;
                case 1205123919:
                case 1683361748:
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0873.m55680("ܿ۫") ^ i4) * 31;
                        i5 = ((iM55680 ^ i3) * 31339) ^ 2124109537;
                        i6 = -2071851623;
                    } else {
                        iM55680 = C0873.m55680("ۘᩳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 30829) ^ (-493769849);
                        i6 = -1793188453;
                    }
                    break;
                default:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0946.m55979("ܳۛ") + i4) * (-39);
                        i5 = ((iM55680 ^ i3) * (-3897)) ^ (-2128685395);
                        i6 = -280513954;
                    } else {
                        iM55680 = C0946.m55979("ۡ۫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 21183) ^ (-118105108);
                        i6 = -463431111;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m30008(Activity activity, int i, boolean z) {
        int i2 = 434920996;
        int i3 = RunnableC0938.f81886;
        int i4 = C1017.f81942;
        int iM55680 = (C0873.m55680("֨ۜ") + i4) * (-53);
        int i5 = ((iM55680 ^ i3) * 32241) ^ (-466912710);
        int i6 = -544389522;
        while (true) {
            i2 = ((((i2 ^ i3) * (-27815)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2121345677:
                case 1939661390:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("۫᩹") ^ i3;
                        i5 = ((iM55680 ^ i4) * 10751) ^ (-721599357);
                        i6 = -1768037603;
                    } else {
                        iM55680 = (C0946.m55979("ܺᩳ") ^ i4) * 63;
                        i5 = ((iM55680 ^ i3) * 26079) ^ 1597961522;
                        i6 = 1805629172;
                    }
                    break;
                case -2104330040:
                case 507653759:
                    C0898.m55800();
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("۫᩹") ^ i3;
                        i5 = ((iM55680 ^ i4) * 10751) ^ (-721599357);
                        i6 = -1768037603;
                    } else {
                        iM55680 = (C0873.m55680("ܶ᩶") ^ i4) * (-73);
                        i5 = ((iM55680 ^ i3) * (-14073)) ^ 696656308;
                        i6 = 698095323;
                    }
                    break;
                case -2075271630:
                case -144957319:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("᩶᩹") + i4) * (-109);
                        i5 = ((iM55680 ^ i3) * (-11639)) ^ (-69260942);
                        i6 = -1399909112;
                    } else {
                        iM55680 = C0946.m55979("ۛܿ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 2131) ^ (-1589974592);
                        i6 = -516359488;
                    }
                    break;
                case -2025026073:
                case -523362219:
                    C0989.m56095();
                    C0949.m56012();
                    break;
                case -1936465736:
                case -1278478087:
                    if (C1048.m56305() >= 0) {
                        iM55680 = (C0873.m55680("ܶ᩶") ^ i4) * (-73);
                        i5 = ((iM55680 ^ i3) * (-14073)) ^ 696656308;
                        i6 = 698095323;
                    } else {
                        iM55680 = C0946.m55979("ܳۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-27061)) ^ 1294648950;
                        i6 = 2050961570;
                    }
                    break;
                case -1417225479:
                case 1726005908:
                    if (C0890.f81849 != 0) {
                        iM55680 = C0946.m55979("۫᩹") ^ i3;
                        i5 = ((iM55680 ^ i4) * 10751) ^ (-721599357);
                        i6 = -1768037603;
                    } else {
                        iM55680 = (C0946.m55979("᩻ۡ") ^ i4) * 87;
                        i5 = ((iM55680 ^ i3) * (-561)) ^ 1940020627;
                        i6 = -1198838680;
                    }
                    break;
                case -1309590885:
                case 1514622811:
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("ܳۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-4619)) ^ (-2082528842);
                        i6 = 1898781035;
                    } else {
                        iM55680 = C0946.m55979("ۨۨ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 23487) ^ (-195105123);
                        i6 = -494935964;
                    }
                    break;
                case -1283812649:
                case -1281140598:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (i4 - C0946.m55979("ܿ֫")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55680 ^ i3) * (-12621)) ^ (-1013904093);
                        i6 = 430568218;
                    } else {
                        iM55680 = (C0873.m55680("֡ۜ") + i3) * (-57);
                        i5 = ((iM55680 ^ i4) * (-16993)) ^ 1182485684;
                        i6 = 2071337175;
                    }
                    break;
                case -1138352867:
                case 409260605:
                    C0892.m55749();
                    C1028.m56247();
                    iM55680 = C0946.m55979("ܳۧ") ^ i3;
                    i5 = ((iM55680 ^ i4) * (-4619)) ^ (-2082528842);
                    i6 = 1898781035;
                    break;
                case -916285679:
                case 156485490:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0873.m55680("ܶ᩶") ^ i4) * (-73);
                        i5 = ((iM55680 ^ i3) * (-14073)) ^ 696656308;
                        i6 = 698095323;
                    } else {
                        iM55680 = C0946.m55979("ܺ֨") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-4451)) ^ (-187738730);
                        i6 = -1946245441;
                    }
                    break;
                case -321338931:
                case -20722436:
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("۫ܶ") ^ i3) * 23;
                        i5 = ((iM55680 ^ i4) * 11835) ^ (-1839247476);
                        i6 = -771248506;
                    } else {
                        iM55680 = C0946.m55979("ܳۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-4619)) ^ (-2082528842);
                        i6 = 1898781035;
                    }
                    break;
                case -143553992:
                case 1688666243:
                    if (!C0927.f81875) {
                        iM55680 = (C0946.m55979("᩶᩹") + i4) * (-109);
                        i5 = ((iM55680 ^ i3) * (-11639)) ^ (-69260942);
                        i6 = -1399909112;
                    } else {
                        iM55680 = C0946.m55979("ܳۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-4619)) ^ (-2082528842);
                        i6 = 1898781035;
                    }
                    break;
                case 125750489:
                case 1526243368:
                    if (C1036.f81953 < 0) {
                        iM55680 = (C0873.m55680("ܶ᩶") ^ i4) * (-73);
                        i5 = ((iM55680 ^ i3) * (-14073)) ^ 696656308;
                        i6 = 698095323;
                    } else {
                        iM55680 = C0946.m55979("ܳۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-4619)) ^ (-2082528842);
                        i6 = 1898781035;
                    }
                    break;
                case 558178174:
                case 1258814852:
                    if (C1048.f81963) {
                        iM55680 = C0873.m55680("ܺۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 12093) ^ (-636841366);
                        i6 = 573096244;
                    } else {
                        iM55680 = (C0873.m55680("ܶ᩶") ^ i4) * (-73);
                        i5 = ((iM55680 ^ i3) * (-14073)) ^ 696656308;
                        i6 = 698095323;
                    }
                    break;
                case 1893465646:
                case 2090138306:
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0946.m55979("᩶᩹") + i4) * (-109);
                        i5 = ((iM55680 ^ i3) * (-11639)) ^ (-69260942);
                        i6 = -1399909112;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ܶܽ")) * 81;
                        i5 = ((iM55680 ^ i3) * 18751) ^ 2098954170;
                        i6 = -398898012;
                    }
                    break;
                default:
                    C11419.m26407((ContextWrapper) activity);
                    m30003(activity, i, z);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30004(Context context) {
        m30007(context);
        ServiceC20700.m46776();
    }
}
