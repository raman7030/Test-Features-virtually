package l;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC18827 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59388 = 0;

    /* JADX INFO: renamed from: ۧ۠۟, reason: not valid java name and contains not printable characters */
    private static final short[] f59389 = {8336, 11529, 11566, 11571, 11572, 11553, 11566, 11555, 11557, 11616, 11565, 11553, 11561, 11566, 11616, 11568, 11570, 11557, 11558, 11557, 11570, 11557, 11566, 11555, 11557, 11616, 11558, 11553, 11561, 11564, 11557, 11556, -21889, -18393, 30110, 7521, -1835, -3774, 14174, 3925, 15114, 14882, 13047, -1771, -8115, 26184, 26196, 26189, 26207, 26193, 26198, 26225, 26204, 26216, 26196, 26189, 26207, 26193, 26198, 26136, 26198, 26199, 26188, 26136, 26206, 26199, 26189, 26198, 26204, 26114, 26136, 26184, 26196, 26189, 26207, 26193, 26198, 26216, 26186, 26205, 26206, 26205, 26186, 26205, 26198, 26203, 26205, 26234, 26189, 26193, 26196, 26204, 26136, 26184, 26186, 26205, 26206, 26205, 26186, 26205, 26198, 26203, 26205, 26136, 26206, 26201, 26193, 26196, 26205, 26204};

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59390;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public C2447 f59391;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C4010 f59392;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public PluginContext f59393;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f59394;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C6398 f59395;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C14592 f59396;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public PluginPreference f59397;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public SharedPreferences f59398;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m43488(ActivityC18827 activityC18827, CharSequence charSequence) {
        LocalString localString = null;
        PluginContext pluginContext = null;
        String str = null;
        int iM5741 = 0;
        String strM2999 = null;
        int i = 1119614420;
        int i2 = RunnableC3474.f10992;
        int i3 = C0483.f2088;
        int iM2566 = C0630.m2566("᩶᩻") ^ i2;
        int i4 = ((iM2566 ^ i3) * 32119) ^ (-1729760530);
        int i5 = 1497610144;
        while (true) {
            i = ((((i ^ i3) * 1787) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2122734307:
                case -1035506137:
                    return charSequence;
                case -2106940489:
                case 954883516:
                    if (C1711.m5733(str, 0) == '{') {
                        iM2566 = (C2105.m6981("֨ۚ") + i2) * 83;
                        i4 = ((iM2566 ^ i3) * 26335) ^ 862484179;
                        i5 = -1000418823;
                    } else {
                        iM2566 = C0630.m2566("ۜۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                case -1785814111:
                case -1397965708:
                    if (iM5741 >= 3) {
                        iM2566 = C2105.m6981("ܺۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-10599)) ^ 1298046173;
                        i5 = -478115598;
                    } else {
                        iM2566 = C0630.m2566("ۜۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                case -1776887747:
                case 449947225:
                    str = (String) charSequence;
                    iM5741 = C1711.m5741(str);
                    if (C3746.m11369() >= 0) {
                        iM2566 = (i3 - C2105.m6981("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    } else {
                        iM2566 = (C2105.m6981("᩸ܿ") ^ i2) * 79;
                        i4 = ((iM2566 ^ i3) * 12601) ^ 98534690;
                        i5 = 1523321524;
                    }
                    break;
                case -1721340661:
                case -347066013:
                    strM2999 = C0798.m2999(pluginContext, str);
                    if (strM2999 != null) {
                        iM2566 = (C0630.m2566("᩹ܰ") ^ i2) * (-31);
                        i4 = ((iM2566 ^ i3) * 2459) ^ (-1108853491);
                        i5 = -228253929;
                    } else {
                        iM2566 = C0630.m2566("ۜۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                case -1683416330:
                case -293325655:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("ۢᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20735) ^ 86429731;
                        i5 = -832194302;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۚ᩺")) * (-75);
                        i4 = ((iM2566 ^ i2) * (-805)) ^ (-2146134260);
                        i5 = -2061085346;
                    }
                    break;
                case -1522283411:
                case 1845428226:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (i3 - C2105.m6981("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    } else {
                        iM2566 = C2105.m6981("ܺۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 19445) ^ (-755282085);
                        i5 = 771640894;
                    }
                    break;
                case -1487659921:
                case 1196737640:
                    return null;
                case -1463090439:
                case -1008118972:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("۫ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 16375) ^ 1800534393;
                        i5 = -1944112950;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܽܳ")) * 31;
                        i4 = ((iM2566 ^ i2) * (-14413)) ^ 2041862808;
                        i5 = -357179729;
                    }
                    break;
                case -1431620617:
                case 1226622435:
                    RunnableC0588.m2441();
                    if (!C1005.m3501()) {
                        iM2566 = C2105.m6981("ۢᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20735) ^ 86429731;
                        i5 = -832194302;
                    } else {
                        iM2566 = C0630.m2566("ۖܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4357)) ^ 1810792366;
                        i5 = 365757988;
                    }
                    break;
                case -1404261202:
                case 1920265996:
                    localString = activityC18827.f59395.f19803;
                    if (localString != null) {
                        iM2566 = C0630.m2566("ܶ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31033)) ^ 1406420856;
                        i5 = -2028916141;
                    } else {
                        iM2566 = C2105.m6981("᩻۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 18335) ^ (-365803610);
                        i5 = -1485848370;
                    }
                    break;
                case -1307442037:
                case 634232289:
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("ۨۘ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14435) ^ (-1057867180);
                        i5 = -2115360437;
                    } else {
                        iM2566 = C2105.m6981("ܺۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8087) ^ 1616032063;
                        i5 = 457473957;
                    }
                    break;
                case -1204654962:
                case 2082878144:
                    return C20510.m46981(localString, (String) charSequence);
                case -1095763876:
                case -220332326:
                    if (C0964.f3626 != 0) {
                        iM2566 = (i3 - C2105.m6981("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    } else {
                        iM2566 = (C2105.m6981("ܶ۬") + i3) * 99;
                        i4 = ((iM2566 ^ i2) * (-13447)) ^ 1089956008;
                        i5 = -1396149308;
                    }
                    break;
                case -811692674:
                case -274824804:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("ۖܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4357)) ^ 1810792366;
                        i5 = 365757988;
                    } else {
                        iM2566 = (C2105.m6981("᩵᩻") + i2) * 51;
                        i4 = ((iM2566 ^ i3) * (-1423)) ^ 342555829;
                        i5 = 1827377184;
                    }
                    break;
                case -691128275:
                case 2092010403:
                    return strM2999;
                case -536856554:
                case -276747496:
                    C4616.m13552();
                    if (C11340.m28031()) {
                        iM2566 = C2105.m6981("ܳۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 3823) ^ (-1051948596);
                        i5 = 1971880946;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    }
                    break;
                case -419751220:
                case -43757840:
                    if (charSequence instanceof String) {
                        iM2566 = C0630.m2566("ۙ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6113) ^ 129743539;
                        i5 = 1729225150;
                    } else {
                        iM2566 = C0630.m2566("ۜۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                case -406122225:
                case 1075818641:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i3 - C2105.m6981("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    } else {
                        iM2566 = C2105.m6981("ܳ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1983) ^ (-1309411043);
                        i5 = -1576830425;
                    }
                    break;
                case -344823182:
                case 289800400:
                    C7811.m20844();
                    C11340.m28031();
                    return null;
                case -302702398:
                case 449548326:
                    C2105.m6982();
                    if (!C2126.m7040()) {
                        iM2566 = (i3 - C2105.m6981("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    } else {
                        iM2566 = C2105.m6981("ۢᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20735) ^ 86429731;
                        i5 = -832194302;
                    }
                    break;
                case -168190129:
                case 2058245353:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C0630.m2566("ۖܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4357)) ^ 1810792366;
                        i5 = 365757988;
                    } else {
                        iM2566 = C0630.m2566("ۗۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3533)) ^ 1544386117;
                        i5 = 1263186121;
                    }
                    break;
                case -150921155:
                case 1948717225:
                    C1916.m6308();
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("۫ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 16375) ^ 1800534393;
                        i5 = -1944112950;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    }
                    break;
                case 439465371:
                case 950678728:
                    if (charSequence == null) {
                        iM2566 = (C0630.m2566("ۛ۫") + i2) * 87;
                        i4 = ((iM2566 ^ i3) * 9865) ^ (-1184171617);
                        i5 = -532519756;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩶ۛ")) * (-25);
                        i4 = ((iM2566 ^ i2) * (-9541)) ^ (-1629455129);
                        i5 = -1718498052;
                    }
                    break;
                case 539665883:
                case 2018487560:
                    pluginContext = activityC18827.f59393;
                    if (charSequence instanceof String) {
                        iM2566 = C0630.m2566("۠ۧ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20921)) ^ (-65420357);
                        i5 = -973984675;
                    } else {
                        iM2566 = C0630.m2566("ۜۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                case 715171712:
                case 1982342267:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("ۨۘ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14435) ^ (-1057867180);
                        i5 = -2115360437;
                    } else {
                        iM2566 = C2105.m6981("ۡ᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 19655) ^ 607315939;
                        i5 = 1252858390;
                    }
                    break;
                case 1564051093:
                case 2063929524:
                    if (C11340.m28021(1, str) == '}') {
                        iM2566 = C2105.m6981("۠ᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15129) ^ 2101359773;
                        i5 = 879986931;
                    } else {
                        iM2566 = C0630.m2566("ۜۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                default:
                    C0630.m2564();
                    iM2566 = C2105.m6981("ۢᩳ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 20735) ^ 86429731;
                    i5 = -832194302;
                    break;
            }
        }
    }

    public ActivityC18827() {
        m10242();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m43504() {
        int iM6981;
        int i;
        Iterator itM9029 = null;
        AbstractC7809 abstractC7809 = null;
        int i2 = -1201258016;
        int i3 = C3245.f10203;
        int i4 = C0483.f2088;
        int iM2566 = (i3 - C0630.m2566("ۘۜ")) * 109;
        int i5 = ((iM2566 ^ i4) * 26949) ^ 1931344410;
        int i6 = -1198075775;
        while (true) {
            int i7 = iM2566 ^ i6;
            ArrayList arrayList = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-7343)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1855020184:
                    case -542308984:
                        C7106.m19117(this.f59394, abstractC7809);
                        iM6981 = (i4 - C2105.m6981("ۨۖ")) * 17;
                        i5 = ((iM6981 ^ i3) * (-14795)) ^ 119701746;
                        i = 539836009;
                        i7 = iM6981 ^ i;
                        break;
                    case -1382694017:
                    case -985442073:
                        C1504.m5179();
                        break;
                    case -1333690189:
                    case 128812127:
                        C1128.m3851();
                        iM2566 = C0630.m2566("ܽ۠") ^ i3;
                        i5 = ((iM2566 ^ i4) * 28475) ^ (-1478848608);
                        i6 = -1880327084;
                        break;
                    case -735678674:
                    case 728073716:
                        this.f59394 = arrayList;
                        itM9029 = C2958.m9029(this.f59390);
                        iM6981 = (i4 - C2105.m6981("ۨۖ")) * 17;
                        i5 = ((iM6981 ^ i3) * (-14795)) ^ 119701746;
                        i = 539836009;
                        i7 = iM6981 ^ i;
                        break;
                    case -466063380:
                    case 406475561:
                        C4075.m12263();
                        if (C4263.f13799 > 0) {
                            iM2566 = C2105.m6981("ۖۙ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 14447) ^ (-532505589);
                            i6 = -25783531;
                        } else {
                            iM2566 = C0630.m2566("ۜۢ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-23775)) ^ 533888609;
                            i6 = -1829239971;
                        }
                        break;
                    case -249374885:
                    case -216180250:
                        abstractC7809 = (AbstractC7809) RunnableC1108.m3791(itM9029);
                        if (abstractC7809.f24122) {
                            iM6981 = C0630.m2566("ۖܿ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-18335)) ^ 1035180258;
                            i = 1313680962;
                        } else {
                            iM6981 = (i4 - C2105.m6981("ۨۖ")) * 17;
                            i5 = ((iM6981 ^ i3) * (-14795)) ^ 119701746;
                            i = 539836009;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -244894708:
                    case 1330429519:
                        if (C0483.m2123(itM9029)) {
                            iM6981 = C2105.m6981("ܶܳ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 29235) ^ (-151773153);
                            i = 771844069;
                        } else {
                            iM6981 = C2105.m6981("۟᩵") ^ i3;
                            i5 = ((iM6981 ^ i4) * 30401) ^ (-1545212418);
                            i = -119011318;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 319987992:
                    case 1396893699:
                        if (C1294.f4556 < 0) {
                            iM2566 = C0630.m2566("ܽᩴ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-7591)) ^ (-1745669735);
                            i6 = -954597379;
                        } else {
                            iM2566 = C0630.m2566("ܽ۠") ^ i3;
                            i5 = ((iM2566 ^ i4) * 28475) ^ (-1478848608);
                            i6 = -1880327084;
                        }
                        break;
                    case 366719765:
                    case 1835608508:
                        if (C4117.f13076 <= 0) {
                            iM2566 = C2105.m6981("ۖۙ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 14447) ^ (-532505589);
                            i6 = -25783531;
                        } else {
                            if (C21923.f70183 == 0) {
                                if (C2520.f8000 >= 0) {
                                    iM2566 = C0630.m2566("ۜۢ") ^ i3;
                                    i5 = ((iM2566 ^ i4) * (-23775)) ^ 533888609;
                                    i6 = -1829239971;
                                } else {
                                    if (C2958.f9394 < 0 && C7811.f24123 < 0) {
                                        if (RunnableC1937.f6483 < 0 && C4263.m12819() < 0) {
                                            if (C3019.f9544 < 0 && C4263.f13799 > 0) {
                                                arrayList = new ArrayList();
                                                if (C3746.f11829 > 0) {
                                                    iM6981 = (C2105.m6981("ۘ᩷") ^ i3) * (-67);
                                                    i5 = ((iM6981 ^ i4) * (-30415)) ^ (-697472766);
                                                    i = 771977845;
                                                    i7 = iM6981 ^ i;
                                                    break;
                                                }
                                            } else {
                                                iM2566 = C0630.m2566("ܽ۠") ^ i3;
                                                i5 = ((iM2566 ^ i4) * 28475) ^ (-1478848608);
                                                i6 = -1880327084;
                                            }
                                        }
                                    }
                                    iM2566 = C0630.m2566("ۗۘ") ^ i3;
                                    i5 = ((iM2566 ^ i4) * 13053) ^ 1612138873;
                                    i6 = 1899719306;
                                }
                            }
                            iM2566 = C0630.m2566("ܽᩴ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-7591)) ^ (-1745669735);
                            i6 = -954597379;
                        }
                        break;
                    case 559226837:
                    case 2045867782:
                        C22628.m50615();
                        if (C0714.f2697 >= 0) {
                            iM2566 = C0630.m2566("ۜۢ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-23775)) ^ 533888609;
                            i6 = -1829239971;
                        } else {
                            iM2566 = C0630.m2566("ܽ۠") ^ i3;
                            i5 = ((iM2566 ^ i4) * 28475) ^ (-1478848608);
                            i6 = -1880327084;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x021f A[PHI: r3 r5
      0x021f: PHI (r3v4 bin.mt.plugin.api.preference.PluginPreference) = 
      (r3v3 bin.mt.plugin.api.preference.PluginPreference)
      (r3v2 bin.mt.plugin.api.preference.PluginPreference)
      (r3v2 bin.mt.plugin.api.preference.PluginPreference)
      (r3v2 bin.mt.plugin.api.preference.PluginPreference)
      (r3v2 bin.mt.plugin.api.preference.PluginPreference)
     binds: [B:65:0x021d, B:57:0x01e1, B:13:0x0053, B:5:0x003e, B:112:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r5v4 l.ۛ᩻᩷) = (r5v2 l.ۛ᩻᩷), (r5v3 l.ۛ᩻᩷), (r5v2 l.ۛ᩻᩷), (r5v2 l.ۛ᩻᩷), (r5v2 l.ۛ᩻᩷) binds: [B:65:0x021d, B:57:0x01e1, B:13:0x0053, B:5:0x003e, B:112:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02a4 A[PHI: r15
      0x02a4: PHI (r15v10 l.ۛ᩻᩷) = (r15v3 l.ۛ᩻᩷), (r15v3 l.ۛ᩻᩷), (r15v4 l.ۛ᩻᩷), (r15v3 l.ۛ᩻᩷) binds: [B:49:0x0187, B:26:0x008c, B:79:0x02a2, B:109:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m43497() {
        int iM6981;
        int i;
        int iM2566;
        int i2;
        int i3 = 728366078;
        int i4 = C22628.f73083;
        int i5 = C1294.f4556;
        int iM6982 = (i4 - C2105.m6981("ܿۛ")) * 109;
        int i6 = ((iM6982 ^ i5) * (-20315)) ^ 1782537477;
        int i7 = iM6982 ^ 1608783419;
        C6398 c6398 = null;
        PluginPreference pluginPreference = null;
        Throwable th = null;
        PluginPreference.OnPreferenceScreenCreatedListener onPreferenceScreenCreatedListener = null;
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        ArrayList arrayListM17726 = null;
        C6398 c6399 = null;
        PluginContext pluginContext = null;
        while (true) {
            i3 = ((((i3 ^ i5) * (-445)) >> 31) & i6) ^ i7;
            switch (i3) {
                case -1936420928:
                case 1866557784:
                    this.f59390 = arrayListM17726;
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (C2105.m6981("᩹ۜ") ^ i5) * (-117);
                        i6 = ((iM6981 ^ i4) * (-12697)) ^ 399535314;
                        i = 151267892;
                    } else {
                        iM6981 = C2105.m6981("ۡۖ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 18523) ^ 1613669434;
                        i = 973812779;
                    }
                    i7 = iM6981 ^ i;
                    break;
                case -1681940505:
                case -146020323:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("ᩳۘ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-27505)) ^ (-1179540357);
                        i2 = 1008577470;
                        i7 = iM2566 ^ i2;
                        c6398 = null;
                    } else {
                        iM6981 = C0630.m2566("ᩴۤ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 3829) ^ (-731304031);
                        i = 1974018302;
                        i7 = iM6981 ^ i;
                    }
                    break;
                case -1597946960:
                case 697593335:
                    arrayListM17726 = c6399.m17726();
                    if (C3432.m10477() <= 0) {
                        iM6981 = (C2105.m6981("ᩳۚ") ^ i4) * 85;
                        i6 = ((iM6981 ^ i5) * 9167) ^ 700763788;
                        i = 731937525;
                    } else {
                        iM6981 = (C0630.m2566("ۘۧ") ^ i5) * (-121);
                        i6 = ((iM6981 ^ i4) * (-13737)) ^ 1860427537;
                        i = 709165220;
                    }
                    i7 = iM6981 ^ i;
                    break;
                case -1365030688:
                case 338310997:
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C0630.m2566("᩶ۛ") + i5) * (-37);
                        i6 = ((iM2566 ^ i4) * 7627) ^ 337942891;
                        i2 = 1141765997;
                        i7 = iM2566 ^ i2;
                        c6398 = null;
                    } else if (C3432.f10845 < 0) {
                        PluginContext pluginContext2 = this.f59393;
                        if (C4616.f14690 > 0) {
                            c6398 = new C6398(pluginContext2);
                            if (C0237.m1481() >= 0) {
                                iM6981 = (C2105.m6981("᩹ۜ") ^ i5) * (-117);
                                i6 = ((iM6981 ^ i4) * (-12697)) ^ 399535314;
                                i = 151267892;
                            } else {
                                iM6981 = (i5 - C0630.m2566("᩹ۤ")) * (-5);
                                i6 = ((iM6981 ^ i4) * 16583) ^ 505367797;
                                i = -1579817510;
                            }
                            i7 = iM6981 ^ i;
                        } else {
                            iM2566 = C2105.m6981("ᩳۘ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-27505)) ^ (-1179540357);
                            i2 = 1008577470;
                            i7 = iM2566 ^ i2;
                            c6398 = null;
                        }
                    } else {
                        iM2566 = (C0630.m2566("᩻ۢ") + i4) * 25;
                        i6 = ((iM2566 ^ i5) * (-2903)) ^ 858771872;
                        i2 = 769384572;
                        i7 = iM2566 ^ i2;
                        c6398 = null;
                    }
                    break;
                case -1201858756:
                case 173161900:
                    charSequence = this.f59395.f19802;
                    if (charSequence != null) {
                        iM6981 = C2105.m6981("۬᩵") ^ i5;
                        i6 = ((iM6981 ^ i4) * 15107) ^ 549969148;
                        i = 1830475722;
                    } else {
                        iM6981 = C0630.m2566("ܽܳ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 28191) ^ (-837690165);
                        i = 1366730203;
                    }
                    i7 = iM6981 ^ i;
                    break;
                case -1064595837:
                case 1894144895:
                    pluginPreference.onBuild(pluginContext, c6398);
                    c6399 = this.f59395;
                    if (C4263.m12819() >= 0) {
                        iM6981 = C0630.m2566("ᩴۤ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 3829) ^ (-731304031);
                        i = 1974018302;
                    } else {
                        iM6981 = C2105.m6981("᩷ܶ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-30939)) ^ (-258659628);
                        i = -2036342717;
                    }
                    i7 = iM6981 ^ i;
                    break;
                case -1060219088:
                case -1053326193:
                    break;
                case -1038970648:
                case -365163433:
                    C22628.m50606(this.f10584, charSequence);
                    iM6981 = C0630.m2566("ܽܳ") ^ i4;
                    i6 = ((iM6981 ^ i5) * 28191) ^ (-837690165);
                    i = 1366730203;
                    i7 = iM6981 ^ i;
                    break;
                case -925659903:
                case 1354531804:
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("ᩴۤ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 3829) ^ (-731304031);
                        i = 1974018302;
                    } else {
                        iM6981 = C0630.m2566("ܶܰ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 16321) ^ 260206469;
                        i = 1519964493;
                    }
                    i7 = iM6981 ^ i;
                    break;
                case -652510202:
                case 1283721882:
                    ServiceConnectionC3453.m10561(this, th, null);
                    iM6981 = (C0630.m2566("ۤ᩵") + i5) * (-123);
                    i6 = ((iM6981 ^ i4) * (-30723)) ^ (-326179800);
                    i = 347602857;
                    i7 = iM6981 ^ i;
                    break;
                case -219488635:
                case 2088286782:
                    break;
                case -199889383:
                case 1209659261:
                    this.f59393.log(th);
                    if (C0798.f2919) {
                        iM6981 = (C2105.m6981("᩹ۜ") ^ i5) * (-117);
                        i6 = ((iM6981 ^ i4) * (-12697)) ^ 399535314;
                        i = 151267892;
                    } else {
                        iM6981 = C0630.m2566("ܿۖ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 19009) ^ (-931066909);
                        i = 1980968282;
                    }
                    i7 = iM6981 ^ i;
                    break;
                case -175078948:
                case 1335941035:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C2105.m6981("ᩳۘ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-27505)) ^ (-1179540357);
                        i2 = 1008577470;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۛ") + i5) * (-37);
                        i6 = ((iM2566 ^ i4) * 7627) ^ 337942891;
                        i2 = 1141765997;
                    }
                    i7 = iM2566 ^ i2;
                    c6398 = null;
                    break;
                case -172080135:
                case 1084114790:
                    setTitle(charSequence2);
                    iM6981 = C0630.m2566("᩷ۜ") ^ i5;
                    i6 = ((iM6981 ^ i4) * 23423) ^ 821523299;
                    i = 391551570;
                    i7 = iM6981 ^ i;
                    break;
                case -155424756:
                case 1982458563:
                    if (C2105.m6982() == 0) {
                        iM6981 = (C2105.m6981("ᩳۚ") ^ i4) * 85;
                        i6 = ((iM6981 ^ i5) * 9167) ^ 700763788;
                        i = 731937525;
                        i7 = iM6981 ^ i;
                    } else {
                        iM2566 = C2105.m6981("ᩳۘ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-27505)) ^ (-1179540357);
                        i2 = 1008577470;
                        i7 = iM2566 ^ i2;
                        c6398 = null;
                    }
                    break;
                case -71905377:
                case 1856463590:
                    if (C4117.f13076 > 0) {
                        iM6981 = (C2105.m6981("᩹ۜ") ^ i5) * (-117);
                        i6 = ((iM6981 ^ i4) * (-12697)) ^ 399535314;
                        i = 151267892;
                        i7 = iM6981 ^ i;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۛ") + i5) * (-37);
                        i6 = ((iM2566 ^ i4) * 7627) ^ 337942891;
                        i2 = 1141765997;
                        i7 = iM2566 ^ i2;
                        c6398 = null;
                    }
                    break;
                case -27675004:
                case 897987688:
                    pluginContext = this.f59393;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6981 = C2105.m6981("ۨ᩷") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-27639)) ^ (-2092262525);
                        i = -177702673;
                        i7 = iM6981 ^ i;
                    } else {
                        iM2566 = (C0630.m2566("᩻ۢ") + i4) * 25;
                        i6 = ((iM2566 ^ i5) * (-2903)) ^ 858771872;
                        i2 = 769384572;
                        i7 = iM2566 ^ i2;
                        c6398 = null;
                    }
                    break;
                case 266923741:
                case 663457896:
                    m43504();
                    charSequence2 = this.f59395.f19806;
                    if (charSequence2 != null) {
                        iM6981 = C2105.m6981("ۙ᩻") ^ i4;
                        i6 = ((iM6981 ^ i5) * 407) ^ (-116226695);
                        i = 1971171143;
                    } else {
                        iM6981 = C0630.m2566("᩷ۜ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 23423) ^ 821523299;
                        i = 391551570;
                    }
                    i7 = iM6981 ^ i;
                    break;
                case 425120789:
                case 1672345172:
                    try {
                        onPreferenceScreenCreatedListener.onPreferenceScreenCreated(new C17979(this.f59393, this), this.f59392);
                        iM6981 = (C2105.m6981("ۜۖ") + i5) * 75;
                        i6 = ((iM6981 ^ i4) * (-1829)) ^ 964242243;
                        i = -2029781913;
                    } catch (Throwable th2) {
                        th = th2;
                        iM6981 = (i4 - C0630.m2566("ۛۙ")) * (-95);
                        i6 = ((iM6981 ^ i5) * 4721) ^ 522074314;
                        i = -184272964;
                    }
                    i7 = iM6981 ^ i;
                    break;
                case 892436282:
                case 952448410:
                    this.f59395 = c6398;
                    pluginPreference = this.f59397;
                    if (C3663.m11168() >= 0) {
                        iM6981 = C0630.m2566("ᩴۤ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 3829) ^ (-731304031);
                        i = 1974018302;
                    } else {
                        iM6981 = (C2105.m6981("᩺᩷") ^ i4) * 77;
                        i6 = ((iM6981 ^ i5) * (-2073)) ^ 390751543;
                        i = 32506798;
                    }
                    i7 = iM6981 ^ i;
                    break;
                case 1078533357:
                case 1815831764:
                    RunnableC1108.m3790();
                    C0050.m940();
                    break;
                case 1217224711:
                case 1687504046:
                    onPreferenceScreenCreatedListener = this.f59395.f19805;
                    if (onPreferenceScreenCreatedListener != null) {
                        iM6981 = C0630.m2566("ۢۨ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-30421)) ^ (-319939685);
                        i = 750063280;
                    } else {
                        iM6981 = (C0630.m2566("ۤ᩵") + i5) * (-123);
                        i6 = ((iM6981 ^ i4) * (-30723)) ^ (-326179800);
                        i = 347602857;
                    }
                    i7 = iM6981 ^ i;
                    break;
                default:
                    C2958.m9034();
                    iM6981 = C0630.m2566("ᩴۤ") ^ i4;
                    i6 = ((iM6981 ^ i5) * 3829) ^ (-731304031);
                    i = 1974018302;
                    i7 = iM6981 ^ i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m43490(l.C16709 r20, bin.mt.plugin.api.preference.PluginPreference r21) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC18827.m43490(l.ܽܳ᩷, bin.mt.plugin.api.preference.PluginPreference):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m43503(ActivityC18827 activityC18827) {
        activityC18827.m43497();
        C1294.m4376(activityC18827.f59396);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x02fd A[PHI: r6 r25 r27
      0x02fd: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v2 java.lang.String) binds: [B:77:0x02e7, B:72:0x02a1] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r25v29 int) = (r25v27 int), (r25v30 int) binds: [B:77:0x02e7, B:72:0x02a1] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r27v21 java.lang.Throwable) = (r27v19 java.lang.Throwable), (r27v22 java.lang.Throwable) binds: [B:77:0x02e7, B:72:0x02a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010a, code lost:
    
        if (l.C2958.f9394 >= 0) goto L31;
     */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        short[] sArr;
        int i8;
        int i9;
        int i10;
        int iM6981;
        int i11;
        int i12;
        int iM2568;
        int i13;
        C16709 c16709M32219;
        ActivityC18827 activityC18827 = this;
        int i14 = C4616.f14690;
        int i15 = C22628.f73083;
        int iM6982 = C2105.m6981("᩺᩶") ^ i14;
        int i16 = ((iM6982 ^ i15) * 22237) ^ 1326448665;
        String strM6570 = null;
        C10632 c10632 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i17 = iM6982 ^ (-206615163);
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        short s2 = 0;
        int iM2569 = 0;
        int i20 = 0;
        int iM25610 = 0;
        int i21 = 1078303086;
        int i22 = 0;
        Intent intentM12571 = null;
        Throwable th = null;
        C9762 c9762 = null;
        C16709 c16709 = null;
        boolean z = false;
        C9762 c9763 = null;
        int i23 = 0;
        while (true) {
            i21 = i17 ^ (i16 & (((i21 ^ i15) * (-31555)) >> 31));
            switch (i21) {
                case -1940360829:
                case -467160280:
                    C0714.m2805();
                    break;
                case -1867593296:
                case -114797019:
                    RunnableC1937.m6387();
                    if (!RunnableC3474.m10630()) {
                        iM2566 = (C0630.m2566("ܽ᩸") ^ i15) * 95;
                        i = ((iM2566 ^ i14) * (-10949)) ^ 302500800;
                        i2 = -2056235564;
                        i17 = iM2566 ^ i2;
                        i16 = i;
                    } else {
                        i23 = i23;
                        th = th;
                        sArr2 = sArr2;
                        iM25610 = iM25610;
                        i20 = i20;
                        i22 = i22;
                        iM2567 = (i14 - C0630.m2566("᩷ۘ")) * (-105);
                        i3 = ((iM2567 ^ i15) * 23871) ^ (-959187430);
                        i4 = 1022570755;
                        int i24 = iM2567 ^ i4;
                        iM25610 = iM25610;
                        i22 = i22;
                        i20 = i20;
                        i23 = i23;
                        th = th;
                        i17 = i24;
                        i16 = i3;
                        sArr2 = sArr2;
                        activityC18827 = this;
                    }
                    break;
                case -1762155224:
                case -1487993945:
                    i23 = i23;
                    th = th;
                    if (C1916.m6313(strM6570)) {
                        iM2568 = C2105.m6981("ۚۢ") ^ i15;
                        i8 = ((iM2568 ^ i14) * 15539) ^ 1322576989;
                        i13 = -1041069111;
                    } else {
                        iM2568 = C2105.m6981("֡۫") ^ i14;
                        i8 = ((iM2568 ^ i15) * (-1657)) ^ (-1057998050);
                        i13 = -196848459;
                    }
                    i9 = iM2568 ^ i13;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -1698528796:
                case -451971342:
                    break;
                case -1651323410:
                case -200190366:
                    c16709M32219 = null;
                    c16709 = c16709M32219;
                    iM2568 = (C2105.m6981("ۜ᩹") ^ i14) * (-121);
                    i8 = ((iM2568 ^ i15) * 32151) ^ (-1731771209);
                    i13 = -1837614082;
                    i9 = iM2568 ^ i13;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -1573703908:
                case -162842795:
                    if (C4263.f13799 > 0) {
                        iM2566 = C0630.m2566("ۤܿ") ^ i14;
                        i = ((iM2566 ^ i15) * (-29927)) ^ (-427060202);
                        i2 = 1431200072;
                        i17 = iM2566 ^ i2;
                        i16 = i;
                    } else {
                        iM2568 = C2105.m6981("ۜܽ") ^ i14;
                        i8 = ((iM2568 ^ i15) * 32165) ^ 435152033;
                        i13 = -1427934046;
                        i9 = iM2568 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    }
                    break;
                case -1571271526:
                case 603805045:
                    i23 = i23;
                    th = th;
                    z = true;
                    if (c16709 == null) {
                        iM2568 = (C2105.m6981("ۧۧ") ^ i15) * (-27);
                        i8 = ((iM2568 ^ i14) * (-1387)) ^ (-627484782);
                        i13 = -1207884696;
                    } else {
                        iM2568 = (C0630.m2566("ۙ᩶") + i15) * 37;
                        i8 = ((iM2568 ^ i14) * 287) ^ (-1563229099);
                        i13 = -1723932699;
                    }
                    i9 = iM2568 ^ i13;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -1541620344:
                case 454511925:
                    c10632 = (C10632) c16709.m39304();
                    sArr4 = f59389;
                    i23 = 87;
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("ۤܿ") ^ i14;
                        i = ((iM2566 ^ i15) * (-29927)) ^ (-427060202);
                        i2 = 1431200072;
                    } else {
                        iM2566 = C2105.m6981("᩶᩺") ^ i14;
                        i = ((iM2566 ^ i15) * (-2657)) ^ (-83006124);
                        i2 = 1701637837;
                    }
                    i17 = iM2566 ^ i2;
                    i16 = i;
                    break;
                case -1363157020:
                case 1137999561:
                    c10632.log(C4159.m12578(sArr4, i23, 23, i19), th);
                    activityC18827.m10224(th, z);
                    break;
                case -1319237968:
                case 1355571141:
                    i23 = i23;
                    th = th;
                    if (c16709.m39323()) {
                        iM2568 = (C2105.m6981("۠ۙ") ^ i15) * (-29);
                        i8 = ((iM2568 ^ i14) * 23133) ^ 1417327455;
                        i13 = -1823749056;
                    } else {
                        iM2568 = C2105.m6981("۠ۨ") ^ i14;
                        i8 = ((iM2568 ^ i15) * (-14189)) ^ (-789336560);
                        i13 = 366744671;
                    }
                    i9 = iM2568 ^ i13;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -1174714355:
                case 1648814088:
                    C4117.m12364();
                    if (C3245.m9925() != 0) {
                        iM2566 = C0630.m2566("ۤۢ") ^ i15;
                        i = ((iM2566 ^ i14) * (-21569)) ^ 1631615018;
                        i2 = -1747913343;
                        i17 = iM2566 ^ i2;
                        i16 = i;
                    } else {
                        i23 = i23;
                        th = th;
                        i5 = i20;
                        iM25610 = iM25610;
                        i22 = i22;
                        int iM6983 = C2105.m6981("ܿܿ") ^ i15;
                        iM25610 = iM25610;
                        i22 = i22;
                        th = th;
                        i20 = i5;
                        i16 = ((iM6983 ^ i14) * 31077) ^ 1047711098;
                        i23 = i23;
                        i17 = iM6983 ^ (-859064538);
                        activityC18827 = this;
                    }
                    break;
                case -1092977053:
                case -652201891:
                    i23 = i23;
                    th = th;
                    int i25 = iM25610;
                    C4263.m12813(activityC18827, i25);
                    sArr3 = f59389;
                    i22 = 42;
                    i18 = 3;
                    if (C1294.m4372() <= 0) {
                        iM25610 = i25;
                        i7 = i20;
                        sArr = sArr2;
                        int iM25611 = (C0630.m2566("ᩳ۠") + i15) * (-29);
                        i8 = ((iM25611 ^ i14) * (-20983)) ^ 360750178;
                        i9 = iM25611 ^ (-213476138);
                        i20 = i7;
                        sArr2 = sArr;
                    } else {
                        int iM25612 = C0630.m2566("۟֡") ^ i15;
                        i8 = ((iM25612 ^ i14) * 23471) ^ (-1788672221);
                        i9 = iM25612 ^ (-951772653);
                        iM25610 = i25;
                    }
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -928541050:
                case 1862284990:
                    C1005.m3501();
                    if (C3432.m10477() <= 0) {
                        iM2568 = C2105.m6981("ۜܽ") ^ i14;
                        i8 = ((iM2568 ^ i15) * 32165) ^ 435152033;
                        i13 = -1427934046;
                        i9 = iM2568 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    } else {
                        iM2566 = (C0630.m2566("ܽ᩸") ^ i15) * 95;
                        i = ((iM2566 ^ i14) * (-10949)) ^ 302500800;
                        i2 = -2056235564;
                        i17 = iM2566 ^ i2;
                        i16 = i;
                    }
                    break;
                case -896806924:
                case 397153222:
                    ServiceConnectionC3453.m10564();
                    if (C4159.m12565() < 0) {
                        i23 = i23;
                        th = th;
                        i10 = i22;
                        iM6981 = C0630.m2566("᩵۫") ^ i14;
                        i11 = ((iM6981 ^ i15) * (-21173)) ^ (-1070292972);
                        i12 = 870209899;
                        i22 = i10;
                        i23 = i23;
                        i17 = iM6981 ^ i12;
                        i16 = i11;
                        th = th;
                    } else {
                        iM2568 = C2105.m6981("ۜܽ") ^ i14;
                        i8 = ((iM2568 ^ i15) * 32165) ^ 435152033;
                        i13 = -1427934046;
                        i9 = iM2568 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    }
                    break;
                case -755024097:
                case -626284930:
                    c16709M32219 = C13265.m32219(strM6570);
                    c16709 = c16709M32219;
                    iM2568 = (C2105.m6981("ۜ᩹") ^ i14) * (-121);
                    i8 = ((iM2568 ^ i15) * 32151) ^ (-1731771209);
                    i13 = -1837614082;
                    i9 = iM2568 ^ i13;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -723790377:
                case 1469571984:
                    i23 = i23;
                    th = th;
                    int i26 = i22;
                    i7 = i20;
                    sArr = sArr2;
                    iM25610 = C0630.m2566(C2520.m8030(sArr, i7, 3, i19)) ^ 2122673692;
                    if (C2126.m7040()) {
                        i22 = i26;
                        int iM25613 = (C0630.m2566("ᩳ۠") + i15) * (-29);
                        i8 = ((iM25613 ^ i14) * (-20983)) ^ 360750178;
                        i9 = iM25613 ^ (-213476138);
                        i20 = i7;
                        sArr2 = sArr;
                    } else {
                        int iM25614 = (C0630.m2566("᩹ۡ") ^ i14) * 37;
                        i8 = ((iM25614 ^ i15) * (-15937)) ^ 1090421643;
                        i9 = iM25614 ^ 1100550965;
                        sArr2 = sArr;
                        i22 = i26;
                        i20 = i7;
                    }
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -719856519:
                case -523107421:
                    i23 = i23;
                    th = th;
                    sArr2 = sArr2;
                    iM25610 = iM25610;
                    i20 = i20;
                    i22 = i22;
                    s = f59389[35];
                    s2 = 27470;
                    if (C3019.f9544 < 0) {
                        iM2567 = C0630.m2566("ۘۤ") ^ i14;
                        i3 = ((iM2567 ^ i15) * 13067) ^ 277175578;
                        i4 = 71272431;
                        int i27 = iM2567 ^ i4;
                        iM25610 = iM25610;
                        i22 = i22;
                        i20 = i20;
                        i23 = i23;
                        th = th;
                        i17 = i27;
                        i16 = i3;
                        sArr2 = sArr2;
                        activityC18827 = this;
                    } else {
                        i5 = i20;
                        sArr2 = sArr2;
                        int iM6984 = C2105.m6981("ܿܿ") ^ i15;
                        iM25610 = iM25610;
                        i22 = i22;
                        th = th;
                        i20 = i5;
                        i16 = ((iM6984 ^ i14) * 31077) ^ 1047711098;
                        i23 = i23;
                        i17 = iM6984 ^ (-859064538);
                        activityC18827 = this;
                    }
                    break;
                case -586232926:
                case 1172045394:
                    i23 = i23;
                    th = th;
                    activityC18827.f10584 = c9763;
                    RunnableC1108.m3780(activityC18827, c9763);
                    C0483.m2125(this);
                    c9762 = activityC18827.f10584;
                    if (C2958.m9034() > 0) {
                        iM2568 = C0630.m2566("ܰۢ") ^ i14;
                        i8 = ((iM2568 ^ i15) * 4525) ^ (-1697332428);
                        i13 = 1626606412;
                        i9 = iM2568 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    }
                    i7 = i20;
                    sArr = sArr2;
                    int iM25615 = (C0630.m2566("ᩳ۠") + i15) * (-29);
                    i8 = ((iM25615 ^ i14) * (-20983)) ^ 360750178;
                    i9 = iM25615 ^ (-213476138);
                    i20 = i7;
                    sArr2 = sArr;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -439857058:
                case -223951278:
                    i23 = i23;
                    th = th;
                    i10 = i22;
                    c9763 = (C9762) C0964.m3409(activityC18827, C0630.m2566(C1047.m3603(sArr3, i10, i18, i19)) ^ 2119708621);
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("᩵۫") ^ i14;
                        i11 = ((iM6981 ^ i15) * (-21173)) ^ (-1070292972);
                        i12 = 870209899;
                    } else {
                        iM6981 = C2105.m6981("ᩴ᩵") ^ i15;
                        i11 = ((iM6981 ^ i14) * (-29237)) ^ (-1407149690);
                        i12 = -387021888;
                    }
                    i22 = i10;
                    i23 = i23;
                    i17 = iM6981 ^ i12;
                    i16 = i11;
                    th = th;
                    break;
                case -406358722:
                case -216354418:
                    i23 = i23;
                    th = th;
                    int i28 = i20;
                    sArr2 = sArr2;
                    iM25610 = iM25610;
                    i22 = i22;
                    super.onCreate(bundle);
                    i20 = i28;
                    iM2569 = C0630.m2566(C2167.m7159(f59389, 36, 3, i19));
                    if (C2958.f9394 >= 0) {
                        iM2567 = (i14 - C0630.m2566("᩷ۘ")) * (-105);
                        i3 = ((iM2567 ^ i15) * 23871) ^ (-959187430);
                        i4 = 1022570755;
                    } else {
                        iM2567 = (C0630.m2566("۟ۚ") + i15) * 17;
                        i3 = ((iM2567 ^ i14) * 25313) ^ (-815443206);
                        i4 = -1959721056;
                    }
                    int i29 = iM2567 ^ i4;
                    iM25610 = iM25610;
                    i22 = i22;
                    i20 = i20;
                    i23 = i23;
                    th = th;
                    i17 = i29;
                    i16 = i3;
                    sArr2 = sArr2;
                    activityC18827 = this;
                    break;
                case -386325049:
                case 203686862:
                    String strM11225 = C3683.m11225(f59389, 53, 18, i19);
                    if (C4263.m12819() < 0) {
                        StringBuilder sb = new StringBuilder(strM11225);
                        C1420.m4905(sb, strM6570);
                        activityC18827.m10221(C0422.m1959(sb), z);
                    }
                    iM2568 = C2105.m6981("ۜܽ") ^ i14;
                    i8 = ((iM2568 ^ i15) * 32165) ^ 435152033;
                    i13 = -1427934046;
                    i9 = iM2568 ^ i13;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -95609709:
                case 368374776:
                    i23 = i23;
                    th = th;
                    strM6570 = AbstractC2021.m6570(intentM12571, C1420.m4902(f59389, 45, 8, i19));
                    if (strM6570 != null) {
                        iM2568 = C0630.m2566("ܽܿ") ^ i15;
                        i8 = ((iM2568 ^ i14) * (-32351)) ^ 1397118894;
                        i13 = -1558952855;
                    } else {
                        iM2568 = C2105.m6981("ۚۢ") ^ i15;
                        i8 = ((iM2568 ^ i14) * 15539) ^ 1322576989;
                        i13 = -1041069111;
                    }
                    i9 = iM2568 ^ i13;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case 29455303:
                case 1986279502:
                    try {
                        i23 = i23;
                        th = th;
                        try {
                            PluginPreference pluginPreferenceM39316 = c16709.m39316(RunnableC3474.m10628(C4159.m12571(this), C1773.m5917(f59389, 71, 16, i19)));
                            activityC18827.f59393 = c16709.m39304();
                            activityC18827.m43490(c16709, pluginPreferenceM39316);
                            iM2568 = C0630.m2566("ܰۡ") ^ i15;
                            i8 = ((iM2568 ^ i14) * (-1141)) ^ (-1200069808);
                            i13 = -1356766538;
                            i9 = iM2568 ^ i13;
                            th = th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            int iM25616 = C0630.m2566("ܿۛ") ^ i14;
                            i8 = ((iM25616 ^ i15) * 22273) ^ (-1343588126);
                            i9 = iM25616 ^ (-2102950860);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i23 = i23;
                    }
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case 176309594:
                case 521341246:
                    i23 = i23;
                    th = th;
                    iM25610 = iM25610;
                    i22 = i22;
                    C4263.m12813(activityC18827, iM2569 ^ 2104115348);
                    sArr2 = f59389;
                    i5 = 39;
                    if (C0964.f3626 == 0) {
                        int iM25617 = (C0630.m2566("ۢۙ") ^ i14) * (-73);
                        iM25610 = iM25610;
                        i16 = ((iM25617 ^ i15) * 6447) ^ (-1266191447);
                        i22 = i22;
                        th = th;
                        i20 = 39;
                        i6 = i23;
                        i17 = iM25617 ^ 544731718;
                        i23 = i6;
                    } else {
                        int iM6985 = C2105.m6981("ܿܿ") ^ i15;
                        iM25610 = iM25610;
                        i22 = i22;
                        th = th;
                        i20 = i5;
                        i16 = ((iM6985 ^ i14) * 31077) ^ 1047711098;
                        i23 = i23;
                        i17 = iM6985 ^ (-859064538);
                        activityC18827 = this;
                    }
                    break;
                case 359054525:
                case 873692462:
                    C1711.m5736();
                    if (C21923.m49329()) {
                        iM2566 = (i14 - C0630.m2566("ۜ۟")) * (-101);
                        i = ((iM2566 ^ i15) * 19871) ^ (-805960335);
                        i2 = 30208226;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩻") ^ i15;
                        i = ((iM2566 ^ i14) * (-27823)) ^ (-2024063357);
                        i2 = 1524661813;
                    }
                    i17 = iM2566 ^ i2;
                    i16 = i;
                    break;
                case 453692676:
                case 2062208284:
                    C2520.m8026();
                    C3683.m11222();
                    break;
                case 579109411:
                case 1869307708:
                    i23 = i23;
                    th = th;
                    sArr2 = sArr2;
                    iM25610 = iM25610;
                    i20 = i20;
                    i22 = i22;
                    if (((s * s) + 188650225) - (s * s2) < 0) {
                        iM2567 = (C2105.m6981("᩺۠") + i15) * (-91);
                        i3 = ((iM2567 ^ i14) * (-3299)) ^ 836338136;
                        i4 = -430284207;
                    } else {
                        iM2567 = (C2105.m6981("֡᩷") + i15) * (-97);
                        i3 = ((iM2567 ^ i14) * 27937) ^ 1023596362;
                        i4 = 1780204778;
                    }
                    int i210 = iM2567 ^ i4;
                    iM25610 = iM25610;
                    i22 = i22;
                    i20 = i20;
                    i23 = i23;
                    th = th;
                    i17 = i210;
                    i16 = i3;
                    sArr2 = sArr2;
                    activityC18827 = this;
                    break;
                case 582468074:
                case 651368838:
                    C22628.m50615();
                    iM2566 = (C0630.m2566("ܽ᩸") ^ i15) * 95;
                    i = ((iM2566 ^ i14) * (-10949)) ^ 302500800;
                    i2 = -2056235564;
                    i17 = iM2566 ^ i2;
                    i16 = i;
                    break;
                case 830225180:
                case 1582533437:
                    i19 = 27023;
                    iM2567 = C0630.m2566("ۢ᩺") ^ i14;
                    i3 = ((iM2567 ^ i15) * (-4495)) ^ 1121766267;
                    i4 = -1048820698;
                    int i211 = iM2567 ^ i4;
                    iM25610 = iM25610;
                    i22 = i22;
                    i20 = i20;
                    i23 = i23;
                    th = th;
                    i17 = i211;
                    i16 = i3;
                    sArr2 = sArr2;
                    activityC18827 = this;
                    break;
                case 841206007:
                case 1179594814:
                    i23 = i23;
                    th = th;
                    AbstractC2021.m6559(c9762, new ViewOnClickListenerC15566(4, activityC18827));
                    intentM12571 = C4159.m12571(this);
                    if (C3537.f11231 < 0) {
                        iM2568 = (C0630.m2566("ܺᩳ") + i14) * (-59);
                        i8 = ((iM2568 ^ i15) * (-30301)) ^ (-628138223);
                        i13 = -399183026;
                        i9 = iM2568 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    } else {
                        i10 = i22;
                        iM6981 = C0630.m2566("᩵۫") ^ i14;
                        i11 = ((iM6981 ^ i15) * (-21173)) ^ (-1070292972);
                        i12 = 870209899;
                        i22 = i10;
                        i23 = i23;
                        i17 = iM6981 ^ i12;
                        i16 = i11;
                        th = th;
                    }
                    break;
                case 862394007:
                case 959726646:
                    C0964.m3402(new C18121(activityC18827, c16709));
                    break;
                case 1009636221:
                case 1945461587:
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("ᩳ᩻") ^ i15;
                        i = ((iM2566 ^ i14) * (-27823)) ^ (-2024063357);
                        i2 = 1524661813;
                        i17 = iM2566 ^ i2;
                        i16 = i;
                    } else {
                        iM2568 = C2105.m6981("ۜܽ") ^ i14;
                        i8 = ((iM2568 ^ i15) * 32165) ^ 435152033;
                        i13 = -1427934046;
                        i9 = iM2568 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    }
                    break;
                default:
                    i19 = 26168;
                    iM2567 = C0630.m2566("ۢ᩺") ^ i14;
                    i3 = ((iM2567 ^ i15) * (-4495)) ^ 1121766267;
                    i4 = -1048820698;
                    int i212 = iM2567 ^ i4;
                    iM25610 = iM25610;
                    i22 = i22;
                    i20 = i20;
                    i23 = i23;
                    th = th;
                    i17 = i212;
                    i16 = i3;
                    sArr2 = sArr2;
                    activityC18827 = this;
                    break;
            }
            return;
        }
    }
}
