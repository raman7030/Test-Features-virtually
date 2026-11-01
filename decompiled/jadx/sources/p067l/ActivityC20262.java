package p067l;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import bin.p000mt.plugin.api.LocalString;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.preference.PluginPreference;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC20262 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۖۧ */
    public static final /* synthetic */ int f62617 = 0;

    /* JADX INFO: renamed from: ۧ۠۟, reason: not valid java name and contains not printable characters */
    private static final short[] f82319 = {8336, 11529, 11566, 11571, 11572, 11553, 11566, 11555, 11557, 11616, 11565, 11553, 11561, 11566, 11616, 11568, 11570, 11557, 11558, 11557, 11570, 11557, 11566, 11555, 11557, 11616, 11558, 11553, 11561, 11564, 11557, 11556, -21889, -18393, 30110, 7521, -1835, -3774, 14174, 3925, 15114, 14882, 13047, -1771, -8115, 26184, 26196, 26189, 26207, 26193, 26198, 26225, 26204, 26216, 26196, 26189, 26207, 26193, 26198, 26136, 26198, 26199, 26188, 26136, 26206, 26199, 26189, 26198, 26204, 26114, 26136, 26184, 26196, 26189, 26207, 26193, 26198, 26216, 26186, 26205, 26206, 26205, 26186, 26205, 26198, 26203, 26205, 26234, 26189, 26193, 26196, 26204, 26136, 26184, 26186, 26205, 26206, 26205, 26186, 26205, 26198, 26203, 26205, 26136, 26206, 26201, 26193, 26196, 26205, 26204};

    /* JADX INFO: renamed from: ۜۧ */
    public ArrayList f62618;

    /* JADX INFO: renamed from: ۡۧ */
    public C4694 f62619;

    /* JADX INFO: renamed from: ۢۧ */
    public C6180 f62620;

    /* JADX INFO: renamed from: ܳۧ */
    public PluginContext f62621;

    /* JADX INFO: renamed from: ܺۧ */
    public ArrayList f62622;

    /* JADX INFO: renamed from: ܿۧ */
    public C8450 f62623;

    /* JADX INFO: renamed from: ᩳۧ */
    public C16237 f62624;

    /* JADX INFO: renamed from: ᩷ۧ */
    public PluginPreference f62625;

    /* JADX INFO: renamed from: ᩻ۧ */
    public SharedPreferences f62626;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static CharSequence m45754(ActivityC20262 activityC20262, CharSequence charSequence) {
        LocalString localString = null;
        PluginContext pluginContext = null;
        String str = null;
        int iM55878 = 0;
        String strM55711 = null;
        int i = 1119614420;
        int i2 = RunnableC1014.f81941;
        int i3 = C0866.f81837;
        int iM55680 = C0873.m55680("᩶᩻") ^ i2;
        int i4 = ((iM55680 ^ i3) * 32119) ^ (-1729760530);
        int i5 = 1497610144;
        while (true) {
            i = ((((i ^ i3) * 1787) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2122734307:
                case -1035506137:
                    return charSequence;
                case -2106940489:
                case 954883516:
                    if (C0927.m55870(str, 0) == '{') {
                        iM55680 = (C0946.m55979("֨ۚ") + i2) * 83;
                        i4 = ((iM55680 ^ i3) * 26335) ^ 862484179;
                        i5 = -1000418823;
                    } else {
                        iM55680 = C0873.m55680("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                case -1785814111:
                case -1397965708:
                    if (iM55878 >= 3) {
                        iM55680 = C0946.m55979("ܺۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10599)) ^ 1298046173;
                        i5 = -478115598;
                    } else {
                        iM55680 = C0873.m55680("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                case -1776887747:
                case 449947225:
                    str = (String) charSequence;
                    iM55878 = C0927.m55878(str);
                    if (C1028.m56247() >= 0) {
                        iM55680 = (i3 - C0946.m55979("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    } else {
                        iM55680 = (C0946.m55979("᩸ܿ") ^ i2) * 79;
                        i4 = ((iM55680 ^ i3) * 12601) ^ 98534690;
                        i5 = 1523321524;
                    }
                    break;
                case -1721340661:
                case -347066013:
                    strM55711 = C0882.m55711(pluginContext, str);
                    if (strM55711 != null) {
                        iM55680 = (C0873.m55680("᩹ܰ") ^ i2) * (-31);
                        i4 = ((iM55680 ^ i3) * 2459) ^ (-1108853491);
                        i5 = -228253929;
                    } else {
                        iM55680 = C0873.m55680("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                case -1683416330:
                case -293325655:
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("ۢᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20735) ^ 86429731;
                        i5 = -832194302;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۚ᩺")) * (-75);
                        i4 = ((iM55680 ^ i2) * (-805)) ^ (-2146134260);
                        i5 = -2061085346;
                    }
                    break;
                case -1522283411:
                case 1845428226:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (i3 - C0946.m55979("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    } else {
                        iM55680 = C0946.m55979("ܺۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 19445) ^ (-755282085);
                        i5 = 771640894;
                    }
                    break;
                case -1487659921:
                case 1196737640:
                    return null;
                case -1463090439:
                case -1008118972:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("۫ܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 16375) ^ 1800534393;
                        i5 = -1944112950;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܽܳ")) * 31;
                        i4 = ((iM55680 ^ i2) * (-14413)) ^ 2041862808;
                        i5 = -357179729;
                    }
                    break;
                case -1431620617:
                case 1226622435:
                    RunnableC0871.m55672();
                    if (!C0892.m55749()) {
                        iM55680 = C0946.m55979("ۢᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20735) ^ 86429731;
                        i5 = -832194302;
                    } else {
                        iM55680 = C0873.m55680("ۖܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4357)) ^ 1810792366;
                        i5 = 365757988;
                    }
                    break;
                case -1404261202:
                case 1920265996:
                    localString = activityC20262.f62623.f22675;
                    if (localString != null) {
                        iM55680 = C0873.m55680("ܶ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31033)) ^ 1406420856;
                        i5 = -2028916141;
                    } else {
                        iM55680 = C0946.m55979("᩻۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 18335) ^ (-365803610);
                        i5 = -1485848370;
                    }
                    break;
                case -1307442037:
                case 634232289:
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("ۨۘ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14435) ^ (-1057867180);
                        i5 = -2115360437;
                    } else {
                        iM55680 = C0946.m55979("ܺۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8087) ^ 1616032063;
                        i5 = 457473957;
                    }
                    break;
                case -1204654962:
                case 2082878144:
                    return C21862.m49304(localString, (String) charSequence);
                case -1095763876:
                case -220332326:
                    if (C0890.f81849 != 0) {
                        iM55680 = (i3 - C0946.m55979("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    } else {
                        iM55680 = (C0946.m55979("ܶ۬") + i3) * 99;
                        i4 = ((iM55680 ^ i2) * (-13447)) ^ 1089956008;
                        i5 = -1396149308;
                    }
                    break;
                case -811692674:
                case -274824804:
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0873.m55680("ۖܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4357)) ^ 1810792366;
                        i5 = 365757988;
                    } else {
                        iM55680 = (C0946.m55979("᩵᩻") + i2) * 51;
                        i4 = ((iM55680 ^ i3) * (-1423)) ^ 342555829;
                        i5 = 1827377184;
                    }
                    break;
                case -691128275:
                case 2092010403:
                    return strM55711;
                case -536856554:
                case -276747496:
                    C1071.m56343();
                    if (C1404.m56468()) {
                        iM55680 = C0946.m55979("ܳۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 3823) ^ (-1051948596);
                        i5 = 1971880946;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    }
                    break;
                case -419751220:
                case -43757840:
                    if (charSequence instanceof String) {
                        iM55680 = C0873.m55680("ۙ۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * 6113) ^ 129743539;
                        i5 = 1729225150;
                    } else {
                        iM55680 = C0873.m55680("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                case -406122225:
                case 1075818641:
                    if (C1046.f81962 <= 0) {
                        iM55680 = (i3 - C0946.m55979("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    } else {
                        iM55680 = C0946.m55979("ܳ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1983) ^ (-1309411043);
                        i5 = -1576830425;
                    }
                    break;
                case -344823182:
                case 289800400:
                    C1229.m56410();
                    C1404.m56468();
                    return null;
                case -302702398:
                case 449548326:
                    C0946.m55980();
                    if (!C0947.m55997()) {
                        iM55680 = (i3 - C0946.m55979("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    } else {
                        iM55680 = C0946.m55979("ۢᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20735) ^ 86429731;
                        i5 = -832194302;
                    }
                    break;
                case -168190129:
                case 2058245353:
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("ۖܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4357)) ^ 1810792366;
                        i5 = 365757988;
                    } else {
                        iM55680 = C0873.m55680("ۗۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3533)) ^ 1544386117;
                        i5 = 1263186121;
                    }
                    break;
                case -150921155:
                case 1948717225:
                    C0937.m55918();
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0946.m55979("۫ܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 16375) ^ 1800534393;
                        i5 = -1944112950;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֨ۤ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * (-23585)) ^ (-190872160);
                        i5 = 1564511174;
                    }
                    break;
                case 439465371:
                case 950678728:
                    if (charSequence == null) {
                        iM55680 = (C0873.m55680("ۛ۫") + i2) * 87;
                        i4 = ((iM55680 ^ i3) * 9865) ^ (-1184171617);
                        i5 = -532519756;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩶ۛ")) * (-25);
                        i4 = ((iM55680 ^ i2) * (-9541)) ^ (-1629455129);
                        i5 = -1718498052;
                    }
                    break;
                case 539665883:
                case 2018487560:
                    pluginContext = activityC20262.f62621;
                    if (charSequence instanceof String) {
                        iM55680 = C0873.m55680("۠ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20921)) ^ (-65420357);
                        i5 = -973984675;
                    } else {
                        iM55680 = C0873.m55680("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                case 715171712:
                case 1982342267:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("ۨۘ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14435) ^ (-1057867180);
                        i5 = -2115360437;
                    } else {
                        iM55680 = C0946.m55979("ۡ᩵") ^ i3;
                        i4 = ((iM55680 ^ i2) * 19655) ^ 607315939;
                        i5 = 1252858390;
                    }
                    break;
                case 1564051093:
                case 2063929524:
                    if (C1404.m56458(1, str) == '}') {
                        iM55680 = C0946.m55979("۠ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15129) ^ 2101359773;
                        i5 = 879986931;
                    } else {
                        iM55680 = C0873.m55680("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18697) ^ 1538284650;
                        i5 = -1548912396;
                    }
                    break;
                default:
                    C0873.m55678();
                    iM55680 = C0946.m55979("ۢᩳ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 20735) ^ 86429731;
                    i5 = -832194302;
                    break;
            }
        }
    }

    public ActivityC20262() {
        m12278();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ */
    public void m45770() {
        int iM55979;
        int i;
        Iterator itM56090 = null;
        AbstractC9791 abstractC9791 = null;
        int i2 = -1201258016;
        int i3 = C1003.f81929;
        int i4 = C0866.f81837;
        int iM55680 = (i3 - C0873.m55680("ۘۜ")) * 109;
        int i5 = ((iM55680 ^ i4) * 26949) ^ 1931344410;
        int i6 = -1198075775;
        while (true) {
            int i7 = iM55680 ^ i6;
            ArrayList arrayList = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-7343)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1855020184:
                    case -542308984:
                        C1194.m56393(this.f62622, abstractC9791);
                        iM55979 = (i4 - C0946.m55979("ۨۖ")) * 17;
                        i5 = ((iM55979 ^ i3) * (-14795)) ^ 119701746;
                        i = 539836009;
                        i7 = iM55979 ^ i;
                        break;
                    case -1382694017:
                    case -985442073:
                        C0917.m55854();
                        break;
                    case -1333690189:
                    case 128812127:
                        C0898.m55800();
                        iM55680 = C0873.m55680("ܽ۠") ^ i3;
                        i5 = ((iM55680 ^ i4) * 28475) ^ (-1478848608);
                        i6 = -1880327084;
                        break;
                    case -735678674:
                    case 728073716:
                        this.f62622 = arrayList;
                        itM56090 = C0989.m56090(this.f62618);
                        iM55979 = (i4 - C0946.m55979("ۨۖ")) * 17;
                        i5 = ((iM55979 ^ i3) * (-14795)) ^ 119701746;
                        i = 539836009;
                        i7 = iM55979 ^ i;
                        break;
                    case -466063380:
                    case 406475561:
                        C1044.m56286();
                        if (C1053.f81965 > 0) {
                            iM55680 = C0946.m55979("ۖۙ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 14447) ^ (-532505589);
                            i6 = -25783531;
                        } else {
                            iM55680 = C0873.m55680("ۜۢ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-23775)) ^ 533888609;
                            i6 = -1829239971;
                        }
                        break;
                    case -249374885:
                    case -216180250:
                        abstractC9791 = (AbstractC9791) RunnableC0897.m55785(itM56090);
                        if (abstractC9791.f27039) {
                            iM55979 = C0873.m55680("ۖܿ") ^ i4;
                            i5 = ((iM55979 ^ i3) * (-18335)) ^ 1035180258;
                            i = 1313680962;
                        } else {
                            iM55979 = (i4 - C0946.m55979("ۨۖ")) * 17;
                            i5 = ((iM55979 ^ i3) * (-14795)) ^ 119701746;
                            i = 539836009;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -244894708:
                    case 1330429519:
                        if (C0866.m55647(itM56090)) {
                            iM55979 = C0946.m55979("ܶܳ") ^ i4;
                            i5 = ((iM55979 ^ i3) * 29235) ^ (-151773153);
                            i = 771844069;
                        } else {
                            iM55979 = C0946.m55979("۟᩵") ^ i3;
                            i5 = ((iM55979 ^ i4) * 30401) ^ (-1545212418);
                            i = -119011318;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case 319987992:
                    case 1396893699:
                        if (C0906.f81862 < 0) {
                            iM55680 = C0873.m55680("ܽᩴ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-7591)) ^ (-1745669735);
                            i6 = -954597379;
                        } else {
                            iM55680 = C0873.m55680("ܽ۠") ^ i3;
                            i5 = ((iM55680 ^ i4) * 28475) ^ (-1478848608);
                            i6 = -1880327084;
                        }
                        break;
                    case 366719765:
                    case 1835608508:
                        if (C1046.f81962 <= 0) {
                            iM55680 = C0946.m55979("ۖۙ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 14447) ^ (-532505589);
                            i6 = -25783531;
                        } else {
                            if (C1929.f83011 == 0) {
                                if (C0967.f81910 >= 0) {
                                    iM55680 = C0873.m55680("ۜۢ") ^ i3;
                                    i5 = ((iM55680 ^ i4) * (-23775)) ^ 533888609;
                                    i6 = -1829239971;
                                } else {
                                    if (C0989.f81920 < 0 && C1229.f82066 < 0) {
                                        if (RunnableC0938.f81886 < 0 && C1053.m56327() < 0) {
                                            if (C0992.f81922 < 0 && C1053.f81965 > 0) {
                                                arrayList = new ArrayList();
                                                if (C1028.f81950 > 0) {
                                                    iM55979 = (C0946.m55979("ۘ᩷") ^ i3) * (-67);
                                                    i5 = ((iM55979 ^ i4) * (-30415)) ^ (-697472766);
                                                    i = 771977845;
                                                    i7 = iM55979 ^ i;
                                                    break;
                                                }
                                            } else {
                                                iM55680 = C0873.m55680("ܽ۠") ^ i3;
                                                i5 = ((iM55680 ^ i4) * 28475) ^ (-1478848608);
                                                i6 = -1880327084;
                                            }
                                        }
                                    }
                                    iM55680 = C0873.m55680("ۗۘ") ^ i3;
                                    i5 = ((iM55680 ^ i4) * 13053) ^ 1612138873;
                                    i6 = 1899719306;
                                }
                            }
                            iM55680 = C0873.m55680("ܽᩴ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-7591)) ^ (-1745669735);
                            i6 = -954597379;
                        }
                        break;
                    case 559226837:
                    case 2045867782:
                        C1964.m56597();
                        if (C0877.f81843 >= 0) {
                            iM55680 = C0873.m55680("ۜۢ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-23775)) ^ 533888609;
                            i6 = -1829239971;
                        } else {
                            iM55680 = C0873.m55680("ܽ۠") ^ i3;
                            i5 = ((iM55680 ^ i4) * 28475) ^ (-1478848608);
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
    /* JADX INFO: renamed from: ۨ */
    private void m45763() {
        int iM55979;
        int i;
        int iM55680;
        int i2;
        int i3 = 728366078;
        int i4 = C1964.f83032;
        int i5 = C0906.f81862;
        int iM559710 = (i4 - C0946.m55979("ܿۛ")) * 109;
        int i6 = ((iM559710 ^ i5) * (-20315)) ^ 1782537477;
        int i7 = iM559710 ^ 1608783419;
        C8450 c8450 = null;
        PluginPreference pluginPreference = null;
        Throwable th = null;
        PluginPreference.OnPreferenceScreenCreatedListener onPreferenceScreenCreatedListener = null;
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        ArrayList arrayListM19673 = null;
        C8450 c8451 = null;
        PluginContext pluginContext = null;
        while (true) {
            i3 = ((((i3 ^ i5) * (-445)) >> 31) & i6) ^ i7;
            switch (i3) {
                case -1936420928:
                case 1866557784:
                    this.f62618 = arrayListM19673;
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (C0946.m55979("᩹ۜ") ^ i5) * (-117);
                        i6 = ((iM55979 ^ i4) * (-12697)) ^ 399535314;
                        i = 151267892;
                    } else {
                        iM55979 = C0946.m55979("ۡۖ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 18523) ^ 1613669434;
                        i = 973812779;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1681940505:
                case -146020323:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("ᩳۘ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-27505)) ^ (-1179540357);
                        i2 = 1008577470;
                        i7 = iM55680 ^ i2;
                        c8450 = null;
                    } else {
                        iM55979 = C0873.m55680("ᩴۤ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 3829) ^ (-731304031);
                        i = 1974018302;
                        i7 = iM55979 ^ i;
                    }
                    break;
                case -1597946960:
                case 697593335:
                    arrayListM19673 = c8451.m19673();
                    if (C1012.m56134() <= 0) {
                        iM55979 = (C0946.m55979("ᩳۚ") ^ i4) * 85;
                        i6 = ((iM55979 ^ i5) * 9167) ^ 700763788;
                        i = 731937525;
                    } else {
                        iM55979 = (C0873.m55680("ۘۧ") ^ i5) * (-121);
                        i6 = ((iM55979 ^ i4) * (-13737)) ^ 1860427537;
                        i = 709165220;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1365030688:
                case 338310997:
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0873.m55680("᩶ۛ") + i5) * (-37);
                        i6 = ((iM55680 ^ i4) * 7627) ^ 337942891;
                        i2 = 1141765997;
                        i7 = iM55680 ^ i2;
                        c8450 = null;
                    } else if (C1012.f81938 < 0) {
                        PluginContext pluginContext2 = this.f62621;
                        if (C1071.f81975 > 0) {
                            c8450 = new C8450(pluginContext2);
                            if (C0854.m55595() >= 0) {
                                iM55979 = (C0946.m55979("᩹ۜ") ^ i5) * (-117);
                                i6 = ((iM55979 ^ i4) * (-12697)) ^ 399535314;
                                i = 151267892;
                            } else {
                                iM55979 = (i5 - C0873.m55680("᩹ۤ")) * (-5);
                                i6 = ((iM55979 ^ i4) * 16583) ^ 505367797;
                                i = -1579817510;
                            }
                            i7 = iM55979 ^ i;
                        } else {
                            iM55680 = C0946.m55979("ᩳۘ") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-27505)) ^ (-1179540357);
                            i2 = 1008577470;
                            i7 = iM55680 ^ i2;
                            c8450 = null;
                        }
                    } else {
                        iM55680 = (C0873.m55680("᩻ۢ") + i4) * 25;
                        i6 = ((iM55680 ^ i5) * (-2903)) ^ 858771872;
                        i2 = 769384572;
                        i7 = iM55680 ^ i2;
                        c8450 = null;
                    }
                    break;
                case -1201858756:
                case 173161900:
                    charSequence = this.f62623.f22674;
                    if (charSequence != null) {
                        iM55979 = C0946.m55979("۬᩵") ^ i5;
                        i6 = ((iM55979 ^ i4) * 15107) ^ 549969148;
                        i = 1830475722;
                    } else {
                        iM55979 = C0873.m55680("ܽܳ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 28191) ^ (-837690165);
                        i = 1366730203;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1064595837:
                case 1894144895:
                    pluginPreference.onBuild(pluginContext, c8450);
                    c8451 = this.f62623;
                    if (C1053.m56327() >= 0) {
                        iM55979 = C0873.m55680("ᩴۤ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 3829) ^ (-731304031);
                        i = 1974018302;
                    } else {
                        iM55979 = C0946.m55979("᩷ܶ") ^ i5;
                        i6 = ((iM55979 ^ i4) * (-30939)) ^ (-258659628);
                        i = -2036342717;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -1060219088:
                case -1053326193:
                    break;
                case -1038970648:
                case -365163433:
                    C1964.m56588(this.f13392, charSequence);
                    iM55979 = C0873.m55680("ܽܳ") ^ i4;
                    i6 = ((iM55979 ^ i5) * 28191) ^ (-837690165);
                    i = 1366730203;
                    i7 = iM55979 ^ i;
                    break;
                case -925659903:
                case 1354531804:
                    if (C0937.f81884) {
                        iM55979 = C0873.m55680("ᩴۤ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 3829) ^ (-731304031);
                        i = 1974018302;
                    } else {
                        iM55979 = C0873.m55680("ܶܰ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 16321) ^ 260206469;
                        i = 1519964493;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -652510202:
                case 1283721882:
                    ServiceConnectionC1013.m56155(this, th, null);
                    iM55979 = (C0873.m55680("ۤ᩵") + i5) * (-123);
                    i6 = ((iM55979 ^ i4) * (-30723)) ^ (-326179800);
                    i = 347602857;
                    i7 = iM55979 ^ i;
                    break;
                case -219488635:
                case 2088286782:
                    break;
                case -199889383:
                case 1209659261:
                    this.f62621.log(th);
                    if (C0882.f81846) {
                        iM55979 = (C0946.m55979("᩹ۜ") ^ i5) * (-117);
                        i6 = ((iM55979 ^ i4) * (-12697)) ^ 399535314;
                        i = 151267892;
                    } else {
                        iM55979 = C0873.m55680("ܿۖ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 19009) ^ (-931066909);
                        i = 1980968282;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case -175078948:
                case 1335941035:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0946.m55979("ᩳۘ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-27505)) ^ (-1179540357);
                        i2 = 1008577470;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۛ") + i5) * (-37);
                        i6 = ((iM55680 ^ i4) * 7627) ^ 337942891;
                        i2 = 1141765997;
                    }
                    i7 = iM55680 ^ i2;
                    c8450 = null;
                    break;
                case -172080135:
                case 1084114790:
                    setTitle(charSequence2);
                    iM55979 = C0873.m55680("᩷ۜ") ^ i5;
                    i6 = ((iM55979 ^ i4) * 23423) ^ 821523299;
                    i = 391551570;
                    i7 = iM55979 ^ i;
                    break;
                case -155424756:
                case 1982458563:
                    if (C0946.m55980() == 0) {
                        iM55979 = (C0946.m55979("ᩳۚ") ^ i4) * 85;
                        i6 = ((iM55979 ^ i5) * 9167) ^ 700763788;
                        i = 731937525;
                        i7 = iM55979 ^ i;
                    } else {
                        iM55680 = C0946.m55979("ᩳۘ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-27505)) ^ (-1179540357);
                        i2 = 1008577470;
                        i7 = iM55680 ^ i2;
                        c8450 = null;
                    }
                    break;
                case -71905377:
                case 1856463590:
                    if (C1046.f81962 > 0) {
                        iM55979 = (C0946.m55979("᩹ۜ") ^ i5) * (-117);
                        i6 = ((iM55979 ^ i4) * (-12697)) ^ 399535314;
                        i = 151267892;
                        i7 = iM55979 ^ i;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۛ") + i5) * (-37);
                        i6 = ((iM55680 ^ i4) * 7627) ^ 337942891;
                        i2 = 1141765997;
                        i7 = iM55680 ^ i2;
                        c8450 = null;
                    }
                    break;
                case -27675004:
                case 897987688:
                    pluginContext = this.f62621;
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = C0946.m55979("ۨ᩷") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-27639)) ^ (-2092262525);
                        i = -177702673;
                        i7 = iM55979 ^ i;
                    } else {
                        iM55680 = (C0873.m55680("᩻ۢ") + i4) * 25;
                        i6 = ((iM55680 ^ i5) * (-2903)) ^ 858771872;
                        i2 = 769384572;
                        i7 = iM55680 ^ i2;
                        c8450 = null;
                    }
                    break;
                case 266923741:
                case 663457896:
                    m45770();
                    charSequence2 = this.f62623.f22678;
                    if (charSequence2 != null) {
                        iM55979 = C0946.m55979("ۙ᩻") ^ i4;
                        i6 = ((iM55979 ^ i5) * 407) ^ (-116226695);
                        i = 1971171143;
                    } else {
                        iM55979 = C0873.m55680("᩷ۜ") ^ i5;
                        i6 = ((iM55979 ^ i4) * 23423) ^ 821523299;
                        i = 391551570;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case 425120789:
                case 1672345172:
                    try {
                        onPreferenceScreenCreatedListener.onPreferenceScreenCreated(new C19456(this.f62621, this), this.f62620);
                        iM55979 = (C0946.m55979("ۜۖ") + i5) * 75;
                        i6 = ((iM55979 ^ i4) * (-1829)) ^ 964242243;
                        i = -2029781913;
                    } catch (Throwable th2) {
                        th = th2;
                        iM55979 = (i4 - C0873.m55680("ۛۙ")) * (-95);
                        i6 = ((iM55979 ^ i5) * 4721) ^ 522074314;
                        i = -184272964;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case 892436282:
                case 952448410:
                    this.f62623 = c8450;
                    pluginPreference = this.f62625;
                    if (C1024.m56209() >= 0) {
                        iM55979 = C0873.m55680("ᩴۤ") ^ i4;
                        i6 = ((iM55979 ^ i5) * 3829) ^ (-731304031);
                        i = 1974018302;
                    } else {
                        iM55979 = (C0946.m55979("᩺᩷") ^ i4) * 77;
                        i6 = ((iM55979 ^ i5) * (-2073)) ^ 390751543;
                        i = 32506798;
                    }
                    i7 = iM55979 ^ i;
                    break;
                case 1078533357:
                case 1815831764:
                    RunnableC0897.m55784();
                    C0845.m55584();
                    break;
                case 1217224711:
                case 1687504046:
                    onPreferenceScreenCreatedListener = this.f62623.f22677;
                    if (onPreferenceScreenCreatedListener != null) {
                        iM55979 = C0873.m55680("ۢۨ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-30421)) ^ (-319939685);
                        i = 750063280;
                    } else {
                        iM55979 = (C0873.m55680("ۤ᩵") + i5) * (-123);
                        i6 = ((iM55979 ^ i4) * (-30723)) ^ (-326179800);
                        i = 347602857;
                    }
                    i7 = iM55979 ^ i;
                    break;
                default:
                    C0989.m56095();
                    iM55979 = C0873.m55680("ᩴۤ") ^ i4;
                    i6 = ((iM55979 ^ i5) * 3829) ^ (-731304031);
                    i = 1974018302;
                    i7 = iM55979 ^ i;
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
    /* JADX INFO: renamed from: ֫ */
    public void m45756(p067l.C18249 r20, bin.p000mt.plugin.api.preference.PluginPreference r21) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.ActivityC20262.m45756(l.ܽܳ᩷, bin.mt.plugin.api.preference.PluginPreference):void");
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m45769(ActivityC20262 activityC20262) {
        activityC20262.m45763();
        C0906.m55813(activityC20262.f62624);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x02fd A[PHI: r6 r25 r27
      0x02fd: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v2 java.lang.String) binds: [B:77:0x02e7, B:72:0x02a1] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r25v29 int) = (r25v27 int), (r25v30 int) binds: [B:77:0x02e7, B:72:0x02a1] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r27v21 java.lang.Throwable) = (r27v19 java.lang.Throwable), (r27v22 java.lang.Throwable) binds: [B:77:0x02e7, B:72:0x02a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010a, code lost:
    
        if (p067l.C0989.f81920 >= 0) goto L31;
     */
    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        short[] sArr;
        int i8;
        int i9;
        int i10;
        int iM55979;
        int i11;
        int i12;
        int iM55682;
        int i13;
        C18249 c18249M34318;
        ActivityC20262 activityC20262 = this;
        int i14 = C1071.f81975;
        int i15 = C1964.f83032;
        int iM559710 = C0946.m55979("᩺᩶") ^ i14;
        int i16 = ((iM559710 ^ i15) * 22237) ^ 1326448665;
        String strM55967 = null;
        C12474 c12474 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i17 = iM559710 ^ (-206615163);
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        short s2 = 0;
        int iM55683 = 0;
        int i20 = 0;
        int iM55684 = 0;
        int i21 = 1078303086;
        int i22 = 0;
        Intent intentM56311 = null;
        Throwable th = null;
        C1326 c1326 = null;
        C18249 c18249 = null;
        boolean z = false;
        C1326 c1327 = null;
        int i23 = 0;
        while (true) {
            i21 = i17 ^ (i16 & (((i21 ^ i15) * (-31555)) >> 31));
            switch (i21) {
                case -1940360829:
                case -467160280:
                    C0877.m55696();
                    break;
                case -1867593296:
                case -114797019:
                    RunnableC0938.m55938();
                    if (!RunnableC1014.m56177()) {
                        iM55680 = (C0873.m55680("ܽ᩸") ^ i15) * 95;
                        i = ((iM55680 ^ i14) * (-10949)) ^ 302500800;
                        i2 = -2056235564;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                    } else {
                        i23 = i23;
                        th = th;
                        sArr2 = sArr2;
                        iM55684 = iM55684;
                        i20 = i20;
                        i22 = i22;
                        iM55681 = (i14 - C0873.m55680("᩷ۘ")) * (-105);
                        i3 = ((iM55681 ^ i15) * 23871) ^ (-959187430);
                        i4 = 1022570755;
                        int i24 = iM55681 ^ i4;
                        iM55684 = iM55684;
                        i22 = i22;
                        i20 = i20;
                        i23 = i23;
                        th = th;
                        i17 = i24;
                        i16 = i3;
                        sArr2 = sArr2;
                        activityC20262 = this;
                    }
                    break;
                case -1762155224:
                case -1487993945:
                    i23 = i23;
                    th = th;
                    if (C0937.m55923(strM55967)) {
                        iM55682 = C0946.m55979("ۚۢ") ^ i15;
                        i8 = ((iM55682 ^ i14) * 15539) ^ 1322576989;
                        i13 = -1041069111;
                    } else {
                        iM55682 = C0946.m55979("֡۫") ^ i14;
                        i8 = ((iM55682 ^ i15) * (-1657)) ^ (-1057998050);
                        i13 = -196848459;
                    }
                    i9 = iM55682 ^ i13;
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
                    c18249M34318 = null;
                    c18249 = c18249M34318;
                    iM55682 = (C0946.m55979("ۜ᩹") ^ i14) * (-121);
                    i8 = ((iM55682 ^ i15) * 32151) ^ (-1731771209);
                    i13 = -1837614082;
                    i9 = iM55682 ^ i13;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -1573703908:
                case -162842795:
                    if (C1053.f81965 > 0) {
                        iM55680 = C0873.m55680("ۤܿ") ^ i14;
                        i = ((iM55680 ^ i15) * (-29927)) ^ (-427060202);
                        i2 = 1431200072;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                    } else {
                        iM55682 = C0946.m55979("ۜܽ") ^ i14;
                        i8 = ((iM55682 ^ i15) * 32165) ^ 435152033;
                        i13 = -1427934046;
                        i9 = iM55682 ^ i13;
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
                    if (c18249 == null) {
                        iM55682 = (C0946.m55979("ۧۧ") ^ i15) * (-27);
                        i8 = ((iM55682 ^ i14) * (-1387)) ^ (-627484782);
                        i13 = -1207884696;
                    } else {
                        iM55682 = (C0873.m55680("ۙ᩶") + i15) * 37;
                        i8 = ((iM55682 ^ i14) * 287) ^ (-1563229099);
                        i13 = -1723932699;
                    }
                    i9 = iM55682 ^ i13;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -1541620344:
                case 454511925:
                    c12474 = (C12474) c18249.m41540();
                    sArr4 = f82319;
                    i23 = 87;
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("ۤܿ") ^ i14;
                        i = ((iM55680 ^ i15) * (-29927)) ^ (-427060202);
                        i2 = 1431200072;
                    } else {
                        iM55680 = C0946.m55979("᩶᩺") ^ i14;
                        i = ((iM55680 ^ i15) * (-2657)) ^ (-83006124);
                        i2 = 1701637837;
                    }
                    i17 = iM55680 ^ i2;
                    i16 = i;
                    break;
                case -1363157020:
                case 1137999561:
                    c12474.log(C1048.m56318(sArr4, i23, 23, i19), th);
                    activityC20262.m12260(th, z);
                    break;
                case -1319237968:
                case 1355571141:
                    i23 = i23;
                    th = th;
                    if (c18249.m41559()) {
                        iM55682 = (C0946.m55979("۠ۙ") ^ i15) * (-29);
                        i8 = ((iM55682 ^ i14) * 23133) ^ 1417327455;
                        i13 = -1823749056;
                    } else {
                        iM55682 = C0946.m55979("۠ۨ") ^ i14;
                        i8 = ((iM55682 ^ i15) * (-14189)) ^ (-789336560);
                        i13 = 366744671;
                    }
                    i9 = iM55682 ^ i13;
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -1174714355:
                case 1648814088:
                    C1046.m56302();
                    if (C1003.m56123() != 0) {
                        iM55680 = C0873.m55680("ۤۢ") ^ i15;
                        i = ((iM55680 ^ i14) * (-21569)) ^ 1631615018;
                        i2 = -1747913343;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                    } else {
                        i23 = i23;
                        th = th;
                        i5 = i20;
                        iM55684 = iM55684;
                        i22 = i22;
                        int iM559711 = C0946.m55979("ܿܿ") ^ i15;
                        iM55684 = iM55684;
                        i22 = i22;
                        th = th;
                        i20 = i5;
                        i16 = ((iM559711 ^ i14) * 31077) ^ 1047711098;
                        i23 = i23;
                        i17 = iM559711 ^ (-859064538);
                        activityC20262 = this;
                    }
                    break;
                case -1092977053:
                case -652201891:
                    i23 = i23;
                    th = th;
                    int i25 = iM55684;
                    C1053.m56321(activityC20262, i25);
                    sArr3 = f82319;
                    i22 = 42;
                    i18 = 3;
                    if (C0906.m55809() <= 0) {
                        iM55684 = i25;
                        i7 = i20;
                        sArr = sArr2;
                        int iM55685 = (C0873.m55680("ᩳ۠") + i15) * (-29);
                        i8 = ((iM55685 ^ i14) * (-20983)) ^ 360750178;
                        i9 = iM55685 ^ (-213476138);
                        i20 = i7;
                        sArr2 = sArr;
                    } else {
                        int iM55686 = C0873.m55680("۟֡") ^ i15;
                        i8 = ((iM55686 ^ i14) * 23471) ^ (-1788672221);
                        i9 = iM55686 ^ (-951772653);
                        iM55684 = i25;
                    }
                    th = th;
                    i6 = i23;
                    i17 = i9;
                    i16 = i8;
                    i23 = i6;
                    break;
                case -928541050:
                case 1862284990:
                    C0892.m55749();
                    if (C1012.m56134() <= 0) {
                        iM55682 = C0946.m55979("ۜܽ") ^ i14;
                        i8 = ((iM55682 ^ i15) * 32165) ^ 435152033;
                        i13 = -1427934046;
                        i9 = iM55682 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    } else {
                        iM55680 = (C0873.m55680("ܽ᩸") ^ i15) * 95;
                        i = ((iM55680 ^ i14) * (-10949)) ^ 302500800;
                        i2 = -2056235564;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                    }
                    break;
                case -896806924:
                case 397153222:
                    ServiceConnectionC1013.m56157();
                    if (C1048.m56305() < 0) {
                        i23 = i23;
                        th = th;
                        i10 = i22;
                        iM55979 = C0873.m55680("᩵۫") ^ i14;
                        i11 = ((iM55979 ^ i15) * (-21173)) ^ (-1070292972);
                        i12 = 870209899;
                        i22 = i10;
                        i23 = i23;
                        i17 = iM55979 ^ i12;
                        i16 = i11;
                        th = th;
                    } else {
                        iM55682 = C0946.m55979("ۜܽ") ^ i14;
                        i8 = ((iM55682 ^ i15) * 32165) ^ 435152033;
                        i13 = -1427934046;
                        i9 = iM55682 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    }
                    break;
                case -755024097:
                case -626284930:
                    c18249M34318 = C14976.m34318(strM55967);
                    c18249 = c18249M34318;
                    iM55682 = (C0946.m55979("ۜ᩹") ^ i14) * (-121);
                    i8 = ((iM55682 ^ i15) * 32151) ^ (-1731771209);
                    i13 = -1837614082;
                    i9 = iM55682 ^ i13;
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
                    iM55684 = C0873.m55680(C0967.m56077(sArr, i7, 3, i19)) ^ 2122673692;
                    if (C0947.m55997()) {
                        i22 = i26;
                        int iM55687 = (C0873.m55680("ᩳ۠") + i15) * (-29);
                        i8 = ((iM55687 ^ i14) * (-20983)) ^ 360750178;
                        i9 = iM55687 ^ (-213476138);
                        i20 = i7;
                        sArr2 = sArr;
                    } else {
                        int iM55688 = (C0873.m55680("᩹ۡ") ^ i14) * 37;
                        i8 = ((iM55688 ^ i15) * (-15937)) ^ 1090421643;
                        i9 = iM55688 ^ 1100550965;
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
                    iM55684 = iM55684;
                    i20 = i20;
                    i22 = i22;
                    s = f82319[35];
                    s2 = 27470;
                    if (C0992.f81922 < 0) {
                        iM55681 = C0873.m55680("ۘۤ") ^ i14;
                        i3 = ((iM55681 ^ i15) * 13067) ^ 277175578;
                        i4 = 71272431;
                        int i27 = iM55681 ^ i4;
                        iM55684 = iM55684;
                        i22 = i22;
                        i20 = i20;
                        i23 = i23;
                        th = th;
                        i17 = i27;
                        i16 = i3;
                        sArr2 = sArr2;
                        activityC20262 = this;
                    } else {
                        i5 = i20;
                        sArr2 = sArr2;
                        int iM559712 = C0946.m55979("ܿܿ") ^ i15;
                        iM55684 = iM55684;
                        i22 = i22;
                        th = th;
                        i20 = i5;
                        i16 = ((iM559712 ^ i14) * 31077) ^ 1047711098;
                        i23 = i23;
                        i17 = iM559712 ^ (-859064538);
                        activityC20262 = this;
                    }
                    break;
                case -586232926:
                case 1172045394:
                    i23 = i23;
                    th = th;
                    activityC20262.f13392 = c1327;
                    RunnableC0897.m55774(activityC20262, c1327);
                    C0866.m55649(this);
                    c1326 = activityC20262.f13392;
                    if (C0989.m56095() > 0) {
                        iM55682 = C0873.m55680("ܰۢ") ^ i14;
                        i8 = ((iM55682 ^ i15) * 4525) ^ (-1697332428);
                        i13 = 1626606412;
                        i9 = iM55682 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    }
                    i7 = i20;
                    sArr = sArr2;
                    int iM55689 = (C0873.m55680("ᩳ۠") + i15) * (-29);
                    i8 = ((iM55689 ^ i14) * (-20983)) ^ 360750178;
                    i9 = iM55689 ^ (-213476138);
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
                    c1327 = (C1326) C0890.m55736(activityC20262, C0873.m55680(C0894.m55773(sArr3, i10, i18, i19)) ^ 2119708621);
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("᩵۫") ^ i14;
                        i11 = ((iM55979 ^ i15) * (-21173)) ^ (-1070292972);
                        i12 = 870209899;
                    } else {
                        iM55979 = C0946.m55979("ᩴ᩵") ^ i15;
                        i11 = ((iM55979 ^ i14) * (-29237)) ^ (-1407149690);
                        i12 = -387021888;
                    }
                    i22 = i10;
                    i23 = i23;
                    i17 = iM55979 ^ i12;
                    i16 = i11;
                    th = th;
                    break;
                case -406358722:
                case -216354418:
                    i23 = i23;
                    th = th;
                    int i28 = i20;
                    sArr2 = sArr2;
                    iM55684 = iM55684;
                    i22 = i22;
                    super.onCreate(bundle);
                    i20 = i28;
                    iM55683 = C0873.m55680(C0949.m56016(f82319, 36, 3, i19));
                    if (C0989.f81920 >= 0) {
                        iM55681 = (i14 - C0873.m55680("᩷ۘ")) * (-105);
                        i3 = ((iM55681 ^ i15) * 23871) ^ (-959187430);
                        i4 = 1022570755;
                    } else {
                        iM55681 = (C0873.m55680("۟ۚ") + i15) * 17;
                        i3 = ((iM55681 ^ i14) * 25313) ^ (-815443206);
                        i4 = -1959721056;
                    }
                    int i29 = iM55681 ^ i4;
                    iM55684 = iM55684;
                    i22 = i22;
                    i20 = i20;
                    i23 = i23;
                    th = th;
                    i17 = i29;
                    i16 = i3;
                    sArr2 = sArr2;
                    activityC20262 = this;
                    break;
                case -386325049:
                case 203686862:
                    String strM56233 = C1025.m56233(f82319, 53, 18, i19);
                    if (C1053.m56327() < 0) {
                        StringBuilder sb = new StringBuilder(strM56233);
                        C0912.m55825(sb, strM55967);
                        activityC20262.m12257(C0863.m55639(sb), z);
                    }
                    iM55682 = C0946.m55979("ۜܽ") ^ i14;
                    i8 = ((iM55682 ^ i15) * 32165) ^ 435152033;
                    i13 = -1427934046;
                    i9 = iM55682 ^ i13;
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
                    strM55967 = AbstractC0942.m55967(intentM56311, C0912.m55822(f82319, 45, 8, i19));
                    if (strM55967 != null) {
                        iM55682 = C0873.m55680("ܽܿ") ^ i15;
                        i8 = ((iM55682 ^ i14) * (-32351)) ^ 1397118894;
                        i13 = -1558952855;
                    } else {
                        iM55682 = C0946.m55979("ۚۢ") ^ i15;
                        i8 = ((iM55682 ^ i14) * 15539) ^ 1322576989;
                        i13 = -1041069111;
                    }
                    i9 = iM55682 ^ i13;
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
                            PluginPreference pluginPreferenceM41552 = c18249.m41552(RunnableC1014.m56175(C1048.m56311(this), C0930.m55893(f82319, 71, 16, i19)));
                            activityC20262.f62621 = c18249.m41540();
                            activityC20262.m45756(c18249, pluginPreferenceM41552);
                            iM55682 = C0873.m55680("ܰۡ") ^ i15;
                            i8 = ((iM55682 ^ i14) * (-1141)) ^ (-1200069808);
                            i13 = -1356766538;
                            i9 = iM55682 ^ i13;
                            th = th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            int iM556810 = C0873.m55680("ܿۛ") ^ i14;
                            i8 = ((iM556810 ^ i15) * 22273) ^ (-1343588126);
                            i9 = iM556810 ^ (-2102950860);
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
                    iM55684 = iM55684;
                    i22 = i22;
                    C1053.m56321(activityC20262, iM55683 ^ 2104115348);
                    sArr2 = f82319;
                    i5 = 39;
                    if (C0890.f81849 == 0) {
                        int iM556811 = (C0873.m55680("ۢۙ") ^ i14) * (-73);
                        iM55684 = iM55684;
                        i16 = ((iM556811 ^ i15) * 6447) ^ (-1266191447);
                        i22 = i22;
                        th = th;
                        i20 = 39;
                        i6 = i23;
                        i17 = iM556811 ^ 544731718;
                        i23 = i6;
                    } else {
                        int iM559713 = C0946.m55979("ܿܿ") ^ i15;
                        iM55684 = iM55684;
                        i22 = i22;
                        th = th;
                        i20 = i5;
                        i16 = ((iM559713 ^ i14) * 31077) ^ 1047711098;
                        i23 = i23;
                        i17 = iM559713 ^ (-859064538);
                        activityC20262 = this;
                    }
                    break;
                case 359054525:
                case 873692462:
                    C0927.m55873();
                    if (C1929.m56553()) {
                        iM55680 = (i14 - C0873.m55680("ۜ۟")) * (-101);
                        i = ((iM55680 ^ i15) * 19871) ^ (-805960335);
                        i2 = 30208226;
                    } else {
                        iM55680 = C0946.m55979("ᩳ᩻") ^ i15;
                        i = ((iM55680 ^ i14) * (-27823)) ^ (-2024063357);
                        i2 = 1524661813;
                    }
                    i17 = iM55680 ^ i2;
                    i16 = i;
                    break;
                case 453692676:
                case 2062208284:
                    C0967.m56074();
                    C1025.m56230();
                    break;
                case 579109411:
                case 1869307708:
                    i23 = i23;
                    th = th;
                    sArr2 = sArr2;
                    iM55684 = iM55684;
                    i20 = i20;
                    i22 = i22;
                    if (((s * s) + 188650225) - (s * s2) < 0) {
                        iM55681 = (C0946.m55979("᩺۠") + i15) * (-91);
                        i3 = ((iM55681 ^ i14) * (-3299)) ^ 836338136;
                        i4 = -430284207;
                    } else {
                        iM55681 = (C0946.m55979("֡᩷") + i15) * (-97);
                        i3 = ((iM55681 ^ i14) * 27937) ^ 1023596362;
                        i4 = 1780204778;
                    }
                    int i210 = iM55681 ^ i4;
                    iM55684 = iM55684;
                    i22 = i22;
                    i20 = i20;
                    i23 = i23;
                    th = th;
                    i17 = i210;
                    i16 = i3;
                    sArr2 = sArr2;
                    activityC20262 = this;
                    break;
                case 582468074:
                case 651368838:
                    C1964.m56597();
                    iM55680 = (C0873.m55680("ܽ᩸") ^ i15) * 95;
                    i = ((iM55680 ^ i14) * (-10949)) ^ 302500800;
                    i2 = -2056235564;
                    i17 = iM55680 ^ i2;
                    i16 = i;
                    break;
                case 830225180:
                case 1582533437:
                    i19 = 27023;
                    iM55681 = C0873.m55680("ۢ᩺") ^ i14;
                    i3 = ((iM55681 ^ i15) * (-4495)) ^ 1121766267;
                    i4 = -1048820698;
                    int i211 = iM55681 ^ i4;
                    iM55684 = iM55684;
                    i22 = i22;
                    i20 = i20;
                    i23 = i23;
                    th = th;
                    i17 = i211;
                    i16 = i3;
                    sArr2 = sArr2;
                    activityC20262 = this;
                    break;
                case 841206007:
                case 1179594814:
                    i23 = i23;
                    th = th;
                    AbstractC0942.m55956(c1326, new ViewOnClickListenerC17163(4, activityC20262));
                    intentM56311 = C1048.m56311(this);
                    if (C1017.f81942 < 0) {
                        iM55682 = (C0873.m55680("ܺᩳ") + i14) * (-59);
                        i8 = ((iM55682 ^ i15) * (-30301)) ^ (-628138223);
                        i13 = -399183026;
                        i9 = iM55682 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    } else {
                        i10 = i22;
                        iM55979 = C0873.m55680("᩵۫") ^ i14;
                        i11 = ((iM55979 ^ i15) * (-21173)) ^ (-1070292972);
                        i12 = 870209899;
                        i22 = i10;
                        i23 = i23;
                        i17 = iM55979 ^ i12;
                        i16 = i11;
                        th = th;
                    }
                    break;
                case 862394007:
                case 959726646:
                    C0890.m55729(new C19591(activityC20262, c18249));
                    break;
                case 1009636221:
                case 1945461587:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("ᩳ᩻") ^ i15;
                        i = ((iM55680 ^ i14) * (-27823)) ^ (-2024063357);
                        i2 = 1524661813;
                        i17 = iM55680 ^ i2;
                        i16 = i;
                    } else {
                        iM55682 = C0946.m55979("ۜܽ") ^ i14;
                        i8 = ((iM55682 ^ i15) * 32165) ^ 435152033;
                        i13 = -1427934046;
                        i9 = iM55682 ^ i13;
                        th = th;
                        i6 = i23;
                        i17 = i9;
                        i16 = i8;
                        i23 = i6;
                    }
                    break;
                default:
                    i19 = 26168;
                    iM55681 = C0873.m55680("ۢ᩺") ^ i14;
                    i3 = ((iM55681 ^ i15) * (-4495)) ^ 1121766267;
                    i4 = -1048820698;
                    int i212 = iM55681 ^ i4;
                    iM55684 = iM55684;
                    i22 = i22;
                    i20 = i20;
                    i23 = i23;
                    th = th;
                    i17 = i212;
                    i16 = i3;
                    sArr2 = sArr2;
                    activityC20262 = this;
                    break;
            }
            return;
        }
    }
}
