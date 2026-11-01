package p067l;

import android.R;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.preference.PluginPreference;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10874 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܳۢۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f82094 = {6951, -754, -7024, 931, 6862, -3019, 3708, 10087, 32611, 32620, 32614, 32624, 32621, 32619, 32614, 32556, 32619, 32620, 32630, 32615, 32620, 32630, 32556, 32611, 32609, 32630, 32619, 32621, 32620, 32556, 32596, 32587, 32583, 32597, 1083, -23535, -23510, -23517, -23504, -23513, -23514, -23454, -23502, -23504, -23513, -23516, -23513, -23504, -23513, -23508, -23519, -23513, -23454, -23511, -23513, -23493, -23432, -23454};

    /* JADX INFO: renamed from: ۗ */
    public TextView f30127;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ ActivityC20262 f30128;

    /* JADX INFO: renamed from: ᩶ */
    public C0990 f30129;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC9791 f30130;

    /* JADX INFO: renamed from: ᩹ */
    public TextView f30131;

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ void m25044(ViewOnClickListenerC10874 viewOnClickListenerC10874, C19456 c19456, AbstractC9791 abstractC9791, String str) {
        int i = -2023817484;
        int i2 = AbstractC0942.f81890;
        int i3 = C1053.f81965;
        int iM55979 = C0946.m55979("ܺۜ") ^ i3;
        int i4 = ((iM55979 ^ i2) * 12461) ^ 395755306;
        int i5 = 1648389956;
        while (true) {
            i = ((((i ^ i2) * (-131)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2117244616:
                case 973520992:
                    C1012.m56134();
                    if (C0882.m55710() != 0) {
                        iM55979 = (C0946.m55979("ۜۗ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * (-31175)) ^ (-1554193633);
                        i5 = -1054473756;
                    } else {
                        iM55979 = C0946.m55979("֨ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2751) ^ 1483888746;
                        i5 = -196439716;
                    }
                    break;
                case -2052851104:
                case -1428115214:
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("ۜۗ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * (-31175)) ^ (-1554193633);
                        i5 = -1054473756;
                    } else {
                        iM55979 = (C0873.m55680("ܽ᩹") + i3) * 7;
                        i4 = ((iM55979 ^ i2) * 2115) ^ 1604710816;
                        i5 = 852439359;
                    }
                    break;
                case -2001818464:
                case -1562334995:
                    RunnableC0871.m55672();
                    C0854.m55595();
                    iM55979 = C0873.m55680("ۡ᩶") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-13169)) ^ 327453674;
                    i5 = 286694447;
                    break;
                case -1651536068:
                case 1120448531:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("֨ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2751) ^ 1483888746;
                        i5 = -196439716;
                    } else {
                        iM55979 = (C0946.m55979("۫ۚ") ^ i2) * (-23);
                        i4 = ((iM55979 ^ i3) * 30497) ^ 363942461;
                        i5 = 697718404;
                    }
                    break;
                case -1360898158:
                case -510884394:
                    if (C0912.m55833()) {
                        iM55979 = C0946.m55979("᩺֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4751)) ^ (-473116944);
                        i5 = 403654430;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ᩳۡ")) * 5;
                        i4 = ((iM55979 ^ i2) * 8447) ^ 45503281;
                        i5 = 1342691344;
                    }
                    break;
                case -1078000098:
                case 1548012835:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("ۜۗ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * (-31175)) ^ (-1554193633);
                        i5 = -1054473756;
                    } else {
                        iM55979 = (C0873.m55680("ܰ֡") + i2) * (-89);
                        i4 = ((iM55979 ^ i3) * 27453) ^ (-1656676066);
                        i5 = 316979661;
                    }
                    break;
                case -864024095:
                case 649070859:
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0873.m55680("ۡ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-13169)) ^ 327453674;
                        i5 = 286694447;
                    } else {
                        iM55979 = (C0946.m55979("ᩴ᩷") + i3) * 11;
                        i4 = ((iM55979 ^ i2) * (-20483)) ^ 1501487965;
                        i5 = -577393819;
                    }
                    break;
                case -763570806:
                case 1353520326:
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("᩺֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4751)) ^ (-473116944);
                        i5 = 403654430;
                    } else {
                        iM55979 = C0873.m55680("ۖ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2567) ^ 2061138485;
                        i5 = -62200389;
                    }
                    break;
                case -559075834:
                case 1319564026:
                    if (C1194.m56396() > 0) {
                        iM55979 = C0946.m55979("֨ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2751) ^ 1483888746;
                        i5 = -196439716;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۧ۬")) * (-95);
                        i4 = ((iM55979 ^ i2) * 2161) ^ (-826774536);
                        i5 = 332651035;
                    }
                    break;
                case -552135588:
                case 1438351314:
                    if (C1048.f81963) {
                        iM55979 = C0946.m55979("۫ۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-21357)) ^ 1054693362;
                        i5 = 295170600;
                    } else {
                        iM55979 = C0946.m55979("֨ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2751) ^ 1483888746;
                        i5 = -196439716;
                    }
                    break;
                case -402894879:
                case 557013233:
                    viewOnClickListenerC10874.m25045(c19456, abstractC9791, str);
                    break;
                case -372472701:
                case 634062416:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("᩺֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4751)) ^ (-473116944);
                        i5 = 403654430;
                    } else {
                        iM55979 = (C0873.m55680("᩺۟") ^ i2) * (-91);
                        i4 = ((iM55979 ^ i3) * 15019) ^ 1286716770;
                        i5 = 278900367;
                    }
                    break;
                case 522508584:
                case 1522489361:
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("᩺֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4751)) ^ (-473116944);
                        i5 = 403654430;
                    } else {
                        iM55979 = (C0873.m55680("ᩴۛ") + i2) * (-85);
                        i4 = ((iM55979 ^ i3) * 5493) ^ 871617626;
                        i5 = -1767269028;
                    }
                    break;
                case 1307370323:
                case 1526650044:
                    C1194.m56396();
                    if (!C0861.f81831) {
                        iM55979 = C0946.m55979("֨ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2751) ^ 1483888746;
                        i5 = -196439716;
                    } else {
                        iM55979 = C0873.m55680("ۡ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-13169)) ^ 327453674;
                        i5 = 286694447;
                    }
                    break;
                case 1308442353:
                case 1444716686:
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("᩺֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4751)) ^ (-473116944);
                        i5 = 403654430;
                    } else {
                        iM55979 = (C0873.m55680("ۧۖ") + i3) * (-49);
                        i4 = ((iM55979 ^ i2) * (-6297)) ^ (-980092902);
                        i5 = -1432563841;
                    }
                    break;
                default:
                    C1929.m56553();
                    C1048.m56305();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC10874(ActivityC20262 activityC20262, View view) {
        super(view);
        View viewM56465 = null;
        TextView textView = null;
        View viewM56466 = null;
        int i = 0;
        String strM56077 = null;
        int iM55979 = 0;
        short[] sArr = null;
        int i2 = 0;
        int i3 = 395349164;
        int i4 = C0845.f81821;
        int i5 = C1028.f81950;
        short s = f82094[0];
        int i6 = ((s * s) + 245016409) - (s * 31306) < 0 ? 16449 : 34648;
        this.f30128 = activityC20262;
        int iM55680 = C0873.m55680("֡᩺") ^ i4;
        int i7 = ((iM55680 ^ i5) * 13727) ^ 1724324388;
        int i8 = -1766387827;
        while (true) {
            i3 = ((((i3 ^ i5) * (-12937)) >> 31) & i7) ^ (iM55680 ^ i8);
            switch (i3) {
                case -1928684110:
                case 2071388633:
                    C0892.m55749();
                    C0912.m55833();
                    throw new RuntimeException();
                case -1704836906:
                case -1073164822:
                    iM55979 = C0946.m55979(strM56077);
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0946.m55979("᩷ᩴ") ^ i4;
                        i7 = ((iM55680 ^ i5) * (-12853)) ^ (-970021030);
                        i8 = -2016366001;
                    } else {
                        iM55680 = C0873.m55680("ۜ᩵") ^ i4;
                        i7 = ((iM55680 ^ i5) * 5125) ^ 1448161853;
                        i8 = 120318156;
                    }
                    break;
                case -1393642257:
                case 1647309345:
                    this.f30131 = (TextView) viewM56466;
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("ۤᩴ") ^ i5;
                        i7 = ((iM55680 ^ i4) * (-7317)) ^ 1879690381;
                        i8 = 747064292;
                    } else {
                        iM55680 = C0873.m55680("ܺ֨") ^ i4;
                        i7 = ((iM55680 ^ i5) * (-22069)) ^ (-1380326286);
                        i8 = 1217388616;
                    }
                    break;
                case -1344075425:
                case -234542435:
                    this.f30129 = (C0990) C0892.m55755(view, i);
                    C0947.m55996(view, this);
                    return;
                case -1315020307:
                case -1105646165:
                    viewM56466 = C1404.m56465(view, R.id.summary);
                    if (C0854.f81826 != 0) {
                        iM55680 = (i4 - C0873.m55680("ۙۜ")) * 35;
                        i7 = ((iM55680 ^ i5) * 24043) ^ (-1146795909);
                        i8 = -47147505;
                    } else {
                        iM55680 = C0873.m55680("ۖܺ") ^ i4;
                        i7 = ((iM55680 ^ i5) * 23085) ^ 1019270284;
                        i8 = -1635109810;
                    }
                    break;
                case -1288864750:
                case 1779620415:
                    viewM56465 = C1404.m56465(view, R.id.title);
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("᩶ۛ") ^ i5;
                        i7 = ((iM55680 ^ i4) * (-12281)) ^ (-2103716142);
                        i8 = 1300899421;
                    } else {
                        iM55680 = C0946.m55979("᩷ᩴ") ^ i4;
                        i7 = ((iM55680 ^ i5) * (-12853)) ^ (-970021030);
                        i8 = -2016366001;
                    }
                    break;
                case -1272309587:
                case 949775583:
                    sArr = f82094;
                    if (C1053.f81965 <= 0) {
                        iM55680 = (i4 - C0873.m55680("ۙۜ")) * 35;
                        i7 = ((iM55680 ^ i5) * 24043) ^ (-1146795909);
                        i8 = -47147505;
                    } else {
                        iM55680 = C0873.m55680("᩵᩺") ^ i5;
                        i7 = ((iM55680 ^ i4) * 11735) ^ (-417990669);
                        i8 = 2118821105;
                    }
                    break;
                case -1039400685:
                case 1672012926:
                    strM56077 = C0967.m56077(sArr, i2, 3, i6);
                    if (C0906.m55809() <= 0) {
                        iM55680 = C0946.m55979("ۤᩴ") ^ i5;
                        i7 = ((iM55680 ^ i4) * (-7317)) ^ 1879690381;
                        i8 = 747064292;
                    } else {
                        iM55680 = C0873.m55680("۟᩸") ^ i5;
                        i7 = ((iM55680 ^ i4) * (-27735)) ^ (-1163705901);
                        i8 = -1496225162;
                    }
                    break;
                case -781801485:
                case -376248486:
                    C0937.m55918();
                    iM55680 = C0946.m55979("᩷ᩴ") ^ i4;
                    i7 = ((iM55680 ^ i5) * (-12853)) ^ (-970021030);
                    i8 = -2016366001;
                    break;
                case -419041153:
                case 412132017:
                    i2 = 1;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("ۤᩴ") ^ i5;
                        i7 = ((iM55680 ^ i4) * (-7317)) ^ 1879690381;
                        i8 = 747064292;
                    } else {
                        iM55680 = C0873.m55680("᩸۠") ^ i4;
                        i7 = ((iM55680 ^ i5) * (-32157)) ^ (-1486452737);
                        i8 = 1051338544;
                    }
                    break;
                case -100895204:
                case 2073796911:
                    this.f30127 = textView;
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0873.m55680("ܽᩳ") ^ i5) * 5;
                        i7 = ((iM55680 ^ i4) * (-12529)) ^ (-2015749891);
                        i8 = -811391013;
                    } else {
                        iM55680 = (C0873.m55680("ܶۧ") + i5) * 11;
                        i7 = ((iM55680 ^ i4) * 5451) ^ (-1374842699);
                        i8 = -620861089;
                    }
                    break;
                case -74573154:
                case 1859836208:
                    i = 2128466576 ^ iM55979;
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0946.m55979("᩷ᩴ") ^ i4;
                        i7 = ((iM55680 ^ i5) * (-12853)) ^ (-970021030);
                        i8 = -2016366001;
                    } else {
                        iM55680 = (C0873.m55680("۟ᩴ") ^ i5) * (-33);
                        i7 = ((iM55680 ^ i4) * (-19509)) ^ 957012747;
                        i8 = 303197999;
                    }
                    break;
                case -49645950:
                case 726685085:
                    textView = (TextView) viewM56465;
                    if (C0882.f81846) {
                        iM55680 = (C0873.m55680("ܽᩳ") ^ i5) * 5;
                        i7 = ((iM55680 ^ i4) * (-12529)) ^ (-2015749891);
                        i8 = -811391013;
                    } else {
                        iM55680 = C0873.m55680("۠۫") ^ i4;
                        i7 = ((iM55680 ^ i5) * 3347) ^ 1214009100;
                        i8 = -2025955217;
                    }
                    break;
                case 441634579:
                case 2001050999:
                    ViewOnClickListenerC0939.m55941();
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0946.m55979("᩷ᩴ") ^ i4;
                        i7 = ((iM55680 ^ i5) * (-12853)) ^ (-970021030);
                        i8 = -2016366001;
                    } else {
                        iM55680 = (C0946.m55979("᩸ܺ") + i5) * 59;
                        i7 = ((iM55680 ^ i4) * 29157) ^ (-1579306521);
                        i8 = 1706309006;
                    }
                    break;
                case 1225129974:
                case 1247736593:
                    C0967.m56074();
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("ܽᩳ") ^ i5) * 5;
                        i7 = ((iM55680 ^ i4) * (-12529)) ^ (-2015749891);
                        i8 = -811391013;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۙۜ")) * 35;
                        i7 = ((iM55680 ^ i5) * 24043) ^ (-1146795909);
                        i8 = -47147505;
                    }
                    break;
                default:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (i4 - C0873.m55680("ۙۜ")) * 35;
                        i7 = ((iM55680 ^ i5) * 24043) ^ (-1146795909);
                        i8 = -47147505;
                    } else {
                        iM55680 = C0946.m55979("᩷ᩴ") ^ i4;
                        i7 = ((iM55680 ^ i5) * (-12853)) ^ (-970021030);
                        i8 = -2016366001;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m25043(ViewOnClickListenerC10874 viewOnClickListenerC10874, List list, String str, C3954 c3954, C19456 c19456, DialogInterface dialogInterface, int i) {
        C12672 c12672 = null;
        String str2 = null;
        CharSequence charSequence = null;
        int i2 = 2123344464;
        int i3 = C1036.f81953;
        int i4 = C0930.f81879;
        int iM55979 = (C0946.m55979("᩹ۨ") + i3) * (-37);
        int i5 = ((iM55979 ^ i4) * 13421) ^ (-1380906697);
        int i6 = 1702993146;
        while (true) {
            i2 = ((((i2 ^ i4) * (-20395)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -1981722557:
                case -742011007:
                    if (C0917.m55854()) {
                        iM55979 = (i4 - C0873.m55680("ۢᩴ")) * 109;
                        i5 = ((iM55979 ^ i3) * 27779) ^ 535548178;
                        i6 = 43429468;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۙ᩸")) * 29;
                        i5 = ((iM55979 ^ i4) * (-21281)) ^ (-1123256588);
                        i6 = -815198529;
                    }
                    break;
                case -1810950683:
                case -19237983:
                    break;
                case -1452115718:
                case 130346552:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("ۛۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30237) ^ 1316119404;
                        i6 = -1237015016;
                    } else {
                        iM55979 = C0873.m55680("᩵ۨ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 12437) ^ 1794603249;
                        i6 = 278215286;
                    }
                    break;
                case -1382065796:
                case 549367920:
                    C0894.m55771(viewOnClickListenerC10874.f30131, charSequence);
                    viewOnClickListenerC10874.m25045(c19456, viewOnClickListenerC10874.f30130, str2);
                    iM55979 = (i3 - C0873.m55680("ۜۖ")) * 67;
                    i5 = ((iM55979 ^ i4) * 14227) ^ 970811233;
                    i6 = -1813777104;
                    break;
                case -1348743785:
                case -902426516:
                    ServiceConnectionC1013.m56157();
                    C0949.m56012();
                    break;
                case -1332206497:
                case 711838334:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("ۛۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30237) ^ 1316119404;
                        i6 = -1237015016;
                    } else {
                        iM55979 = C0946.m55979("ۛ᩻") ^ i3;
                        i5 = ((iM55979 ^ i4) * 14945) ^ 1984421366;
                        i6 = -391380755;
                    }
                    break;
                case -1082695025:
                case 1189060109:
                    if (C0861.m55626()) {
                        iM55979 = C0946.m55979("۠ܶ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 23693) ^ (-895959317);
                        i6 = 2050434158;
                    } else {
                        iM55979 = C0873.m55680("ܽ۬") ^ i3;
                        i5 = ((iM55979 ^ i4) * 16137) ^ 404729176;
                        i6 = -1052022910;
                    }
                    break;
                case -1039996524:
                case 1418369486:
                    C0882.m55710();
                    if (C1024.m56209() >= 0) {
                        iM55979 = (i4 - C0946.m55979("֫۟")) * 123;
                        i5 = ((iM55979 ^ i3) * 9619) ^ 595887075;
                        i6 = -1309107813;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۨᩴ")) * 83;
                        i5 = ((iM55979 ^ i4) * 28593) ^ (-202292106);
                        i6 = 1959565052;
                    }
                    break;
                case -986546250:
                case 104335283:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۨᩴ")) * 83;
                        i5 = ((iM55979 ^ i4) * 28593) ^ (-202292106);
                        i6 = 1959565052;
                    } else {
                        iM55979 = (C0873.m55680("ܺۡ") + i3) * 69;
                        i5 = ((iM55979 ^ i4) * 32585) ^ 565568680;
                        i6 = -390942611;
                    }
                    break;
                case -983645811:
                case -272135977:
                    C1048.m56305();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (i3 - C0946.m55979("ۙ᩸")) * 29;
                        i5 = ((iM55979 ^ i4) * (-21281)) ^ (-1123256588);
                        i6 = -815198529;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۨᩴ")) * 83;
                        i5 = ((iM55979 ^ i4) * 28593) ^ (-202292106);
                        i6 = 1959565052;
                    }
                    break;
                case -777990598:
                case 1174706874:
                    viewOnClickListenerC10874.f30128.f62626.edit().putString(c3954.f27036, str2).apply();
                    CharSequence charSequence2 = c12672.f35567;
                    if (charSequence2 == null) {
                        iM55979 = C0946.m55979("ᩳܳ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 23219) ^ 1291432187;
                        i6 = -1009415186;
                    } else {
                        charSequence = charSequence2;
                        iM55979 = (C0946.m55979("᩸ۤ") + i3) * (-109);
                        i5 = ((iM55979 ^ i4) * (-30521)) ^ 772213775;
                        i6 = 41362799;
                    }
                    break;
                case -458606840:
                case 745516121:
                    if (C1048.f81963) {
                        iM55979 = (C0873.m55680("ܰۜ") ^ i3) * (-83);
                        i5 = ((iM55979 ^ i4) * (-26101)) ^ 364761267;
                        i6 = -1923746817;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۙ᩸")) * 29;
                        i5 = ((iM55979 ^ i4) * (-21281)) ^ (-1123256588);
                        i6 = -815198529;
                    }
                    break;
                case -389461503:
                case 904062285:
                    AbstractC0942.m55971();
                    if (C0845.f81821 < 0) {
                        iM55979 = C0873.m55680("ۛۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30237) ^ 1316119404;
                        i6 = -1237015016;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۨᩴ")) * 83;
                        i5 = ((iM55979 ^ i4) * 28593) ^ (-202292106);
                        i6 = 1959565052;
                    }
                    break;
                case -311701192:
                case 1453894554:
                    charSequence = c3954.f27037;
                    iM55979 = (C0946.m55979("᩸ۤ") + i3) * (-109);
                    i5 = ((iM55979 ^ i4) * (-30521)) ^ 772213775;
                    i6 = 41362799;
                    break;
                case 49328647:
                case 423134434:
                    if (C0866.m55645()) {
                        iM55979 = C0873.m55680("ۡ֨") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-4145)) ^ 652631069;
                        i6 = 80769391;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۙ᩸")) * 29;
                        i5 = ((iM55979 ^ i4) * (-21281)) ^ (-1123256588);
                        i6 = -815198529;
                    }
                    break;
                case 240110072:
                case 640251917:
                    if (C1194.f82045 != 0) {
                        iM55979 = (i4 - C0946.m55979("֫۟")) * 123;
                        i5 = ((iM55979 ^ i3) * 9619) ^ 595887075;
                        i6 = -1309107813;
                    } else {
                        iM55979 = C0873.m55680("ܳᩴ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 7869) ^ (-241775048);
                        i6 = -1848968488;
                    }
                    break;
                case 665364184:
                case 1802170764:
                    dialogInterface.dismiss();
                    c12672 = (C12672) C1964.m56587(list, i);
                    str2 = c12672.f35568;
                    if (C21274.m48064(str, str2)) {
                        iM55979 = (i3 - C0873.m55680("ۜۖ")) * 67;
                        i5 = ((iM55979 ^ i4) * 14227) ^ 970811233;
                        i6 = -1813777104;
                    } else {
                        iM55979 = C0873.m55680("ۛ᩸") ^ i4;
                        i5 = ((iM55979 ^ i3) * 20699) ^ 1785747498;
                        i6 = -14859983;
                    }
                    break;
                case 1043030163:
                case 1896525778:
                    if (C1044.f81959 >= 0) {
                        iM55979 = (i4 - C0946.m55979("֫۟")) * 123;
                        i5 = ((iM55979 ^ i3) * 9619) ^ 595887075;
                        i6 = -1309107813;
                    } else {
                        iM55979 = C0946.m55979("ܽ᩷") ^ i4;
                        i5 = ((iM55979 ^ i3) * 10547) ^ 751169818;
                        i6 = 1095394823;
                    }
                    break;
                case 1411374954:
                case 1878523179:
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("۠ܶ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 23693) ^ (-895959317);
                        i6 = 2050434158;
                    } else {
                        iM55979 = (C0946.m55979("ۙᩴ") + i3) * 11;
                        i5 = ((iM55979 ^ i4) * 23983) ^ 774188031;
                        i6 = -381921545;
                    }
                    break;
                default:
                    C1929.m56553();
                    iM55979 = (i3 - C0946.m55979("ۨᩴ")) * 83;
                    i5 = ((iM55979 ^ i4) * 28593) ^ (-202292106);
                    i6 = 1959565052;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x09d7 A[PHI: r2 r4 r5 r9 r14 r24 r26 r27 r31 r32 r34 r35 r37 r38 r43 r45
      0x09d7: PHI (r2v31 l.᩺᩻᩷) = (r2v27 l.᩺᩻᩷), (r2v33 l.᩺᩻᩷) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r4v23 java.lang.CharSequence) = (r4v19 java.lang.CharSequence), (r4v25 java.lang.CharSequence) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r5v17 int) = (r5v13 int), (r5v19 int) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r9v19 java.lang.String) = (r9v15 java.lang.String), (r9v21 java.lang.String) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r14v16 java.lang.String) = (r14v12 java.lang.String), (r14v18 java.lang.String) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r24v16 bin.mt.plugin.api.PluginContext) = (r24v12 bin.mt.plugin.api.PluginContext), (r24v18 bin.mt.plugin.api.PluginContext) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r26v19 l.ܽۜ᩷) = (r26v15 l.ܽۜ᩷), (r26v21 l.ܽۜ᩷) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r27v17 l.֫ۜ᩷) = (r27v13 l.֫ۜ᩷), (r27v19 l.֫ۜ᩷) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r31v19 java.lang.Exception) = (r31v15 java.lang.Exception), (r31v21 java.lang.Exception) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r32v14 java.lang.String) = (r32v10 java.lang.String), (r32v16 java.lang.String) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r34v15 java.lang.StringBuilder) = (r34v11 java.lang.StringBuilder), (r34v17 java.lang.StringBuilder) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r35v14 java.lang.StringBuilder) = (r35v10 java.lang.StringBuilder), (r35v16 java.lang.StringBuilder) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r37v19 java.lang.String) = (r37v15 java.lang.String), (r37v21 java.lang.String) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r38v17 bin.mt.plugin.api.PluginContext) = (r38v13 bin.mt.plugin.api.PluginContext), (r38v19 bin.mt.plugin.api.PluginContext) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r43v12 bin.mt.plugin.api.PluginContext) = (r43v8 bin.mt.plugin.api.PluginContext), (r43v14 bin.mt.plugin.api.PluginContext) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x09d7: PHI (r45v12 java.lang.CharSequence) = (r45v8 java.lang.CharSequence), (r45v14 java.lang.CharSequence) binds: [B:167:0x09bf, B:151:0x0831] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final void m25046(AbstractC9791 abstractC9791) {
        CharSequence charSequence;
        String str;
        PluginContext pluginContext;
        String str2;
        int i;
        PluginContext pluginContext2;
        Exception exc;
        StringBuilder sb;
        C18035 c18035;
        int i2;
        PluginContext pluginContext3;
        C3954 c3954;
        CharSequence charSequence2;
        C24543 c24543;
        String str3;
        int i3;
        int i4;
        CharSequence charSequence3;
        String str4;
        String str5;
        int i5;
        PluginContext pluginContext4;
        boolean z;
        Exception exc2;
        C0990 c0990;
        C18035 c18036;
        PluginContext pluginContext5;
        C3954 c3955;
        CharSequence charSequence4;
        C24543 c24544;
        String str6;
        int iM55979;
        int i6;
        int i7;
        C3954 c3956;
        String str7;
        CharSequence charSequence5;
        String str8;
        Exception exc3;
        C18035 c18037;
        CharSequence charSequence6;
        int iM55680;
        int i8;
        int i9;
        CharSequence charSequence7;
        String str9;
        String str10;
        PluginContext pluginContext6;
        Exception exc4;
        StringBuilder sb2;
        C24543 c24545;
        String str11;
        StringBuilder sb3;
        int i10;
        PluginContext pluginContext7;
        int iM55681;
        C18035 c18038;
        int i11;
        int i12;
        PluginContext pluginContext8;
        CharSequence charSequence8;
        PluginContext pluginContext9;
        C24543 c24546;
        String str12;
        StringBuilder sb4;
        Exception exc5;
        C18035 c18039;
        StringBuilder sb5;
        PluginContext pluginContext10;
        CharSequence charSequence9;
        int iM559710;
        int i13;
        int i14;
        CharSequence charSequence10;
        String str13;
        String str14;
        int i15;
        PluginContext pluginContext11;
        int i16;
        Exception exc6;
        short s;
        C18035 c180310;
        C24543 c24547;
        String str15;
        boolean z2;
        int iM55682;
        int i17;
        int i18;
        CharSequence charSequence11;
        String str16;
        String str17;
        int i19;
        PluginContext pluginContext12;
        int i20;
        Exception exc7;
        C18035 c180311;
        String str18;
        int iM55683;
        int i21;
        int i22;
        int iM55684;
        int i23;
        int i24;
        PluginContext pluginContext13;
        C24543 c24548;
        String str19;
        StringBuilder sb6;
        String str20;
        StringBuilder sb7;
        PluginContext pluginContext14;
        CharSequence charSequence12;
        int iM55685;
        int i25;
        int i26;
        String str21;
        int iM55686;
        int i27;
        int i28;
        CharSequence charSequence13;
        String strM55754 = null;
        String strM56466 = null;
        CharSequence charSequence14 = null;
        Iterator itM56292 = null;
        CharSequence charSequence15 = null;
        short[] sArr = null;
        char c = 0;
        short s2 = 0;
        int i29 = 1792383980;
        int i30 = C1964.f83032;
        int i31 = C1025.f81947;
        int iM55687 = C0873.m55680("ۖ᩸") ^ i31;
        int i32 = ((iM55687 ^ i30) * 25499) ^ (-287437157);
        int i33 = iM55687 ^ 256453516;
        C24543 c24549 = null;
        C3954 c3957 = null;
        String str22 = null;
        PluginContext pluginContext15 = null;
        String str23 = null;
        CharSequence charSequence16 = null;
        C0990 c0991 = null;
        short s3 = 0;
        int i34 = 0;
        CharSequence charSequence17 = null;
        StringBuilder sb8 = null;
        PluginContext pluginContext16 = null;
        StringBuilder sb9 = null;
        String str24 = null;
        C12672 c12672 = null;
        int i35 = 0;
        String str25 = null;
        CharSequence charSequence18 = null;
        Exception exc8 = null;
        PluginContext pluginContext17 = null;
        Exception exc9 = null;
        boolean z3 = false;
        View view = null;
        int[] iArr = null;
        String str26 = null;
        StringBuilder sb10 = null;
        TextView textView = null;
        CharSequence charSequence19 = null;
        Exception exc10 = null;
        boolean zM56071 = false;
        int i36 = 0;
        TextView textView2 = null;
        C18035 c180312 = null;
        int i37 = 0;
        ActivityC20262 activityC20262 = null;
        CharSequence charSequence20 = null;
        while (true) {
            i29 = i33 ^ (i32 & (((i29 ^ i30) * 31165) >> 31));
            switch (i29) {
                case -2129824333:
                case -1397725441:
                    try {
                        str21 = c3957.f8617;
                        str25 = str25;
                        pluginContext10 = pluginContext16;
                        str2 = str24;
                        sb = sb9;
                        int iM55688 = C0873.m55680("۬ܺ") ^ i30;
                        str7 = str21;
                        i32 = ((iM55688 ^ i31) * 21753) ^ (-29886657);
                        i33 = iM55688 ^ 79887713;
                        exc10 = exc10;
                        str22 = str7;
                        c24549 = c24549;
                        pluginContext15 = pluginContext15;
                        str25 = str25;
                        String str27 = str2;
                        pluginContext16 = pluginContext10;
                        sb10 = sb10;
                        sb9 = sb;
                        str24 = str27;
                    } catch (Exception e) {
                        exc10 = e;
                        charSequence5 = charSequence16;
                        str8 = str26;
                        pluginContext = pluginContext16;
                        str2 = str24;
                        str25 = str25;
                        pluginContext15 = pluginContext15;
                        exc3 = exc8;
                        sb = sb9;
                        c24549 = c24549;
                        str7 = str22;
                        sb10 = sb10;
                        c18037 = c180312;
                        i2 = i36;
                        pluginContext5 = pluginContext17;
                        c3956 = c3957;
                        charSequence6 = charSequence19;
                        iM55680 = C0946.m55979("֫ۤ") ^ i31;
                        i8 = ((iM55680 ^ i30) * 21851) ^ (-1501411913);
                        i9 = 770639270;
                        i33 = iM55680 ^ i9;
                        charSequence19 = charSequence6;
                        i32 = i8;
                        c180312 = c18037;
                        c3957 = c3956;
                        exc8 = exc3;
                        str22 = str7;
                        c24549 = c24549;
                        str26 = str8;
                        pluginContext17 = pluginContext5;
                        pluginContext15 = pluginContext15;
                        charSequence16 = charSequence5;
                        i36 = i2;
                        str25 = str25;
                        sb10 = sb10;
                        sb9 = sb;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                    }
                    break;
                case -2065846686:
                case -867590764:
                    charSequence7 = charSequence16;
                    str9 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str10 = str25;
                    pluginContext6 = pluginContext15;
                    exc4 = exc8;
                    sb2 = sb9;
                    c24545 = c24549;
                    str11 = str22;
                    sb3 = sb10;
                    i10 = i36;
                    pluginContext7 = pluginContext17;
                    iM55681 = C0873.m55680("ܽ۟") ^ i30;
                    c18038 = (C18035) abstractC9791;
                    i11 = ((iM55681 ^ i31) * 615) ^ (-1576856203);
                    i12 = 217488749;
                    i33 = iM55681 ^ i12;
                    i32 = i11;
                    pluginContext17 = pluginContext7;
                    c180312 = c18038;
                    exc8 = exc4;
                    str22 = str11;
                    c24549 = c24545;
                    i36 = i10;
                    str26 = str9;
                    sb10 = sb3;
                    sb9 = sb2;
                    pluginContext15 = pluginContext6;
                    charSequence16 = charSequence7;
                    str25 = str10;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -2061552461:
                case -92283141:
                    C0912.m55833();
                    C0873.m55678();
                    charSequence3 = charSequence16;
                    str4 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str5 = str25;
                    i5 = i34;
                    pluginContext4 = pluginContext15;
                    z = z3;
                    exc2 = exc8;
                    sb = sb9;
                    c0990 = c0991;
                    sb10 = sb10;
                    c18036 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3955 = c3957;
                    charSequence4 = charSequence19;
                    c24544 = c24549;
                    str6 = str22;
                    iM55979 = (i30 - C0946.m55979("ۡۛ")) * (-115);
                    i6 = ((iM55979 ^ i31) * 4591) ^ 1930433084;
                    i7 = 578103365;
                    c180312 = c18036;
                    exc8 = exc2;
                    str22 = str6;
                    i34 = i5;
                    i33 = iM55979 ^ i7;
                    i32 = i6;
                    str26 = str4;
                    c0991 = c0990;
                    c24549 = c24544;
                    charSequence16 = charSequence3;
                    z3 = z;
                    charSequence19 = charSequence4;
                    c3957 = c3955;
                    pluginContext15 = pluginContext4;
                    str25 = str5;
                    pluginContext17 = pluginContext5;
                    i36 = i2;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -1848127779:
                case 37800374:
                    itM56292 = C1046.m56292(c3957.f8618);
                    iM559710 = C0873.m55680("ۙᩴ") ^ i31;
                    i13 = ((iM559710 ^ i30) * 11757) ^ 1762725137;
                    i14 = 870217667;
                    i33 = iM559710 ^ i14;
                    i32 = i13;
                    break;
                case -1799425414:
                case -1554853495:
                    C0912.m55825(sb10, str23);
                    pluginContext15.log(C0863.m55639(sb10), exc9);
                    zM56071 = c180312.f53851;
                    charSequence12 = charSequence16;
                    pluginContext14 = pluginContext16;
                    str20 = str24;
                    str25 = str25;
                    pluginContext13 = pluginContext15;
                    sb7 = sb9;
                    c24548 = c24549;
                    str19 = str22;
                    sb6 = sb10;
                    iM55685 = C0873.m55680("ᩴ۫") ^ i30;
                    i25 = ((iM55685 ^ i31) * (-17227)) ^ (-1850517942);
                    i26 = -251038469;
                    i33 = iM55685 ^ i26;
                    i32 = i25;
                    sb10 = sb6;
                    sb9 = sb7;
                    str22 = str19;
                    charSequence16 = charSequence12;
                    c24549 = c24548;
                    str24 = str20;
                    pluginContext15 = pluginContext13;
                    pluginContext16 = pluginContext14;
                    str25 = str25;
                    break;
                case -1749541463:
                case -282735918:
                    charSequence3 = charSequence16;
                    str4 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str5 = str25;
                    i5 = i34;
                    pluginContext4 = pluginContext15;
                    z = z3;
                    exc2 = exc8;
                    sb = sb9;
                    sb10 = sb10;
                    c18036 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3955 = c3957;
                    charSequence4 = charSequence19;
                    c24544 = c24549;
                    str6 = str22;
                    C1964.m56595(c0991, z);
                    iArr = C18920.f56451;
                    if (C1024.m56209() >= 0) {
                        iM55979 = (C0873.m55680("۠ᩴ") + i31) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        c0990 = c0991;
                        i6 = ((iM55979 ^ i30) * 24363) ^ (-1692636781);
                        i7 = 993365723;
                    } else {
                        c0990 = c0991;
                        iM55979 = (C0873.m55680("֡ۘ") ^ i31) * (-41);
                        i6 = ((iM55979 ^ i30) * (-19503)) ^ 565986169;
                        i7 = -114221953;
                    }
                    c180312 = c18036;
                    exc8 = exc2;
                    str22 = str6;
                    i34 = i5;
                    i33 = iM55979 ^ i7;
                    i32 = i6;
                    str26 = str4;
                    c0991 = c0990;
                    c24549 = c24544;
                    charSequence16 = charSequence3;
                    z3 = z;
                    charSequence19 = charSequence4;
                    c3957 = c3955;
                    pluginContext15 = pluginContext4;
                    str25 = str5;
                    pluginContext17 = pluginContext5;
                    i36 = i2;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -1727806694:
                case 1650186507:
                    charSequence13 = c180312.f53852;
                    charSequence15 = charSequence13;
                    iM559710 = C0873.m55680("ᩳᩳ") ^ i30;
                    i13 = ((iM559710 ^ i31) * (-23301)) ^ 1094528777;
                    i14 = -415830184;
                    i33 = iM559710 ^ i14;
                    i32 = i13;
                    break;
                case -1697072657:
                case 91514490:
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    c24549 = c24549;
                    str7 = str22;
                    Exception exc11 = exc10;
                    StringBuilder sb11 = sb9;
                    sb10 = sb10;
                    pluginContext10 = pluginContext16;
                    str2 = str24;
                    sb = sb11;
                    if (strM55754 != null) {
                        exc10 = exc11;
                        charSequence9 = strM55754;
                        charSequence17 = charSequence9;
                        pluginContext = pluginContext10;
                        charSequence5 = charSequence16;
                        i2 = i36;
                        pluginContext5 = pluginContext17;
                        str8 = str26;
                        c3956 = c3957;
                        charSequence6 = charSequence19;
                        exc3 = exc8;
                        c18037 = c180312;
                        iM55680 = C0873.m55680("᩶ۤ") ^ i31;
                        i8 = ((iM55680 ^ i30) * (-9413)) ^ (-1500276379);
                        i9 = 820941687;
                        i33 = iM55680 ^ i9;
                        charSequence19 = charSequence6;
                        i32 = i8;
                        c180312 = c18037;
                        c3957 = c3956;
                        exc8 = exc3;
                        str22 = str7;
                        c24549 = c24549;
                        str26 = str8;
                        pluginContext17 = pluginContext5;
                        pluginContext15 = pluginContext15;
                        charSequence16 = charSequence5;
                        i36 = i2;
                        str25 = str25;
                        sb10 = sb10;
                        sb9 = sb;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                    } else {
                        int iM559711 = (i31 - C0946.m55979("ܺ᩺")) * (-69);
                        exc10 = exc11;
                        i33 = iM559711 ^ (-1046667423);
                        i32 = ((iM559711 ^ i30) * 16165) ^ (-192522048);
                        str22 = str7;
                        c24549 = c24549;
                        pluginContext15 = pluginContext15;
                        str25 = str25;
                        String str28 = str2;
                        pluginContext16 = pluginContext10;
                        sb10 = sb10;
                        sb9 = sb;
                        str24 = str28;
                    }
                    break;
                case -1586825634:
                case -236424816:
                    str7 = str22;
                    charSequence5 = charSequence16;
                    str8 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    exc3 = exc8;
                    sb = sb9;
                    sb10 = sb10;
                    c18037 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3956 = c3957;
                    charSequence6 = charSequence19;
                    C24543 c245410 = (C24543) abstractC9791;
                    RunnableC0938.m55928(textView2, c245410.f27035);
                    if (c245410.f77736) {
                        int iM559712 = (i31 - C0946.m55979("ۨ֡")) * (-17);
                        int i38 = ((iM559712 ^ i30) * 11975) ^ 1037283707;
                        i33 = iM559712 ^ 2117694899;
                        charSequence19 = charSequence6;
                        c3957 = c3956;
                        str22 = str7;
                        pluginContext15 = pluginContext15;
                        c24549 = c245410;
                        i32 = i38;
                        str25 = str25;
                        pluginContext17 = pluginContext5;
                        c180312 = c18037;
                        exc8 = exc3;
                        i36 = i2;
                        str26 = str8;
                        sb10 = sb10;
                        sb9 = sb;
                        charSequence16 = charSequence5;
                    } else {
                        c24549 = c245410;
                        charSequence17 = charSequence6;
                        iM55680 = C0873.m55680("᩶ۤ") ^ i31;
                        i8 = ((iM55680 ^ i30) * (-9413)) ^ (-1500276379);
                        i9 = 820941687;
                        i33 = iM55680 ^ i9;
                        charSequence19 = charSequence6;
                        i32 = i8;
                        c180312 = c18037;
                        c3957 = c3956;
                        exc8 = exc3;
                        str22 = str7;
                        c24549 = c24549;
                        str26 = str8;
                        pluginContext17 = pluginContext5;
                        pluginContext15 = pluginContext15;
                        charSequence16 = charSequence5;
                        i36 = i2;
                        str25 = str25;
                        sb10 = sb10;
                        sb9 = sb;
                    }
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -1512304718:
                case 453507414:
                    charSequence5 = charSequence16;
                    str8 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    exc3 = exc8;
                    sb = sb9;
                    c24549 = c24549;
                    str7 = str22;
                    sb10 = sb10;
                    c18037 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3956 = c3957;
                    charSequence6 = charSequence19;
                    if (C1044.m56273(charSequence17) == 0) {
                        iM55680 = (i31 - C0873.m55680("ۚ۠")) * 93;
                        i8 = ((iM55680 ^ i30) * 8589) ^ (-420734162);
                        i9 = -1633997835;
                    } else {
                        charSequence18 = charSequence17;
                        iM55680 = (C0873.m55680("ۛۤ") + i31) * 79;
                        i8 = ((iM55680 ^ i30) * (-11241)) ^ (-727886056);
                        i9 = -2086036371;
                    }
                    i33 = iM55680 ^ i9;
                    charSequence19 = charSequence6;
                    i32 = i8;
                    c180312 = c18037;
                    c3957 = c3956;
                    exc8 = exc3;
                    str22 = str7;
                    c24549 = c24549;
                    str26 = str8;
                    pluginContext17 = pluginContext5;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence5;
                    i36 = i2;
                    str25 = str25;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -1400439200:
                case -950918278:
                    charSequence5 = charSequence16;
                    str8 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    sb = sb9;
                    c24549 = c24549;
                    str7 = str22;
                    sb10 = sb10;
                    StringBuilder sb12 = sb8;
                    C0912.m55825(sb12, str8);
                    String strM55639 = C0863.m55639(sb12);
                    Exception exc12 = exc8;
                    c18037 = c180312;
                    PluginContext pluginContext18 = pluginContext17;
                    pluginContext18.log(strM55639, exc12);
                    charSequence17 = c24549.f77733;
                    c3956 = c3957;
                    exc3 = exc12;
                    charSequence6 = charSequence19;
                    i2 = i36;
                    pluginContext5 = pluginContext18;
                    iM55680 = C0873.m55680("᩶ۤ") ^ i31;
                    i8 = ((iM55680 ^ i30) * (-9413)) ^ (-1500276379);
                    i9 = 820941687;
                    i33 = iM55680 ^ i9;
                    charSequence19 = charSequence6;
                    i32 = i8;
                    c180312 = c18037;
                    c3957 = c3956;
                    exc8 = exc3;
                    str22 = str7;
                    c24549 = c24549;
                    str26 = str8;
                    pluginContext17 = pluginContext5;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence5;
                    i36 = i2;
                    str25 = str25;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -1348286351:
                case -679143140:
                    RunnableC0938.m55928(textView2, c180312.f27035);
                    C0894.m55771(textView, charSequence20);
                    C0890.m55728(c0991, zM56071);
                    charSequence7 = charSequence16;
                    str9 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str10 = str25;
                    pluginContext6 = pluginContext15;
                    exc4 = exc8;
                    sb2 = sb9;
                    c24545 = c24549;
                    str11 = str22;
                    sb3 = sb10;
                    c18038 = c180312;
                    i10 = i36;
                    pluginContext8 = pluginContext17;
                    iM55681 = (C0946.m55979("᩻ᩳ") + i31) * (-63);
                    pluginContext7 = pluginContext8;
                    i11 = ((iM55681 ^ i30) * (-23321)) ^ (-1102113722);
                    i12 = 865890135;
                    i33 = iM55681 ^ i12;
                    i32 = i11;
                    pluginContext17 = pluginContext7;
                    c180312 = c18038;
                    exc8 = exc4;
                    str22 = str11;
                    c24549 = c24545;
                    i36 = i10;
                    str26 = str9;
                    sb10 = sb3;
                    sb9 = sb2;
                    pluginContext15 = pluginContext6;
                    charSequence16 = charSequence7;
                    str25 = str10;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -1333480396:
                case 765801937:
                    charSequence = charSequence16;
                    str = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str25 = str25;
                    i = i34;
                    pluginContext2 = pluginContext15;
                    exc = exc8;
                    sb = sb9;
                    sb10 = sb10;
                    c18035 = c180312;
                    i2 = i36;
                    pluginContext3 = pluginContext17;
                    c3954 = c3957;
                    charSequence2 = charSequence19;
                    c24543 = c24549;
                    str3 = str22;
                    c0991 = this.f30129;
                    i3 = i37;
                    C1028.m56238(c0991, i3);
                    boolean z4 = abstractC9791.f27033;
                    View view2 = this.itemView;
                    if (!C0937.f81884) {
                        view = view2;
                        i4 = i2;
                        z3 = z4;
                        int iM559713 = C0946.m55979("ۤ۠") ^ i31;
                        int i39 = i4;
                        i32 = ((iM559713 ^ i30) * 11089) ^ (-969075621);
                        c180312 = c18035;
                        exc8 = exc;
                        str22 = str3;
                        i34 = i;
                        i33 = iM559713 ^ (-505560537);
                        str26 = str;
                        c24549 = c24543;
                        sb10 = sb10;
                        sb9 = sb;
                        charSequence16 = charSequence;
                        charSequence19 = charSequence2;
                        c3957 = c3954;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                        pluginContext17 = pluginContext3;
                        i36 = i39;
                        i37 = i3;
                        pluginContext15 = pluginContext2;
                        str25 = str25;
                    } else {
                        int iM559714 = C0946.m55979("ܶۨ") ^ i31;
                        i32 = ((iM559714 ^ i30) * 13675) ^ 1380576803;
                        c180312 = c18035;
                        exc8 = exc;
                        str22 = str3;
                        i34 = i;
                        str26 = str;
                        i33 = iM559714 ^ 955730966;
                        view = view2;
                        c24549 = c24543;
                        charSequence16 = charSequence;
                        charSequence19 = charSequence2;
                        z3 = z4;
                        c3957 = c3954;
                        i37 = i3;
                        pluginContext17 = pluginContext3;
                        pluginContext15 = pluginContext2;
                        i36 = i2;
                        str25 = str25;
                        sb10 = sb10;
                        sb9 = sb;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                    }
                    break;
                case -1270271528:
                case 1268441438:
                    charSequence5 = charSequence16;
                    str8 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    exc3 = exc8;
                    sb = sb9;
                    c24549 = c24549;
                    str7 = str22;
                    sb10 = sb10;
                    c18037 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3956 = c3957;
                    charSequence6 = charSequence19;
                    charSequence18 = c24549.f27037;
                    iM55680 = (C0873.m55680("ۛۤ") + i31) * 79;
                    i8 = ((iM55680 ^ i30) * (-11241)) ^ (-727886056);
                    i9 = -2086036371;
                    i33 = iM55680 ^ i9;
                    charSequence19 = charSequence6;
                    i32 = i8;
                    c180312 = c18037;
                    c3957 = c3956;
                    exc8 = exc3;
                    str22 = str7;
                    c24549 = c24549;
                    str26 = str8;
                    pluginContext17 = pluginContext5;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence5;
                    i36 = i2;
                    str25 = str25;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -1262618168:
                case -586410666:
                    charSequence10 = charSequence16;
                    str13 = str26;
                    pluginContext16 = pluginContext16;
                    str24 = str24;
                    str14 = str25;
                    i15 = i34;
                    pluginContext11 = pluginContext15;
                    i16 = i37;
                    exc6 = exc8;
                    sb9 = sb9;
                    sb10 = sb10;
                    c180310 = c180312;
                    i36 = i36;
                    pluginContext17 = pluginContext17;
                    c3957 = c3957;
                    charSequence19 = charSequence19;
                    c24547 = c24549;
                    str15 = str22;
                    short s4 = s3;
                    boolean z5 = z3;
                    c0991 = c0991;
                    view = view;
                    z2 = z5;
                    int i40 = s4 + 11745;
                    if ((s4 * s2) - (i40 * i40) > 0) {
                        iM55682 = C0946.m55979("ۙ᩷") ^ i30;
                        s = s4;
                        i17 = ((iM55682 ^ i31) * (-261)) ^ (-326550994);
                        i18 = 286356173;
                    } else {
                        s = s4;
                        iM55682 = (C0946.m55979("᩺֫") + i31) * (-105);
                        i17 = ((iM55682 ^ i30) * (-13075)) ^ 450646861;
                        i18 = -75173781;
                    }
                    s3 = s;
                    c180312 = c180310;
                    exc8 = exc6;
                    i34 = i15;
                    i33 = iM55682 ^ i18;
                    i32 = i17;
                    i37 = i16;
                    str26 = str13;
                    str22 = str15;
                    pluginContext15 = pluginContext11;
                    charSequence16 = charSequence10;
                    str25 = str14;
                    c24549 = c24547;
                    charSequence19 = charSequence19;
                    c3957 = c3957;
                    pluginContext17 = pluginContext17;
                    i36 = i36;
                    sb10 = sb10;
                    sb9 = sb9;
                    str24 = str24;
                    pluginContext16 = pluginContext16;
                    boolean z6 = z2;
                    view = view;
                    c0991 = c0991;
                    z3 = z6;
                    break;
                case -1218747256:
                case -280526754:
                    StringBuilder sb13 = sb9;
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    String str29 = str24;
                    C1003.m56121(sb13, str29);
                    String strM55591 = C0845.m55591(sb13);
                    sb = sb13;
                    exc10 = exc10;
                    PluginContext pluginContext19 = pluginContext16;
                    str2 = str29;
                    pluginContext10 = pluginContext19;
                    pluginContext10.log(strM55591, exc10);
                    str21 = c3957.f8617;
                    int iM55689 = C0873.m55680("۬ܺ") ^ i30;
                    str7 = str21;
                    i32 = ((iM55689 ^ i31) * 21753) ^ (-29886657);
                    i33 = iM55689 ^ 79887713;
                    exc10 = exc10;
                    str22 = str7;
                    c24549 = c24549;
                    pluginContext15 = pluginContext15;
                    str25 = str25;
                    String str210 = str2;
                    pluginContext16 = pluginContext10;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str210;
                    break;
                case -1203257034:
                case -993724661:
                    if (C0992.f81922 < 0) {
                        iM559710 = C0873.m55680("ܽܰ") ^ i31;
                        i13 = ((iM559710 ^ i30) * 19973) ^ 1452574050;
                        i14 = -778095401;
                        i33 = iM559710 ^ i14;
                        i32 = i13;
                    } else {
                        charSequence10 = charSequence16;
                        str13 = str26;
                        pluginContext16 = pluginContext16;
                        str24 = str24;
                        str14 = str25;
                        i15 = i34;
                        pluginContext11 = pluginContext15;
                        i16 = i37;
                        exc6 = exc8;
                        sb9 = sb9;
                        s = s3;
                        sb10 = sb10;
                        c180310 = c180312;
                        i36 = i36;
                        pluginContext17 = pluginContext17;
                        c3957 = c3957;
                        charSequence19 = charSequence19;
                        c24547 = c24549;
                        str15 = str22;
                        boolean z7 = z3;
                        c0991 = c0991;
                        view = view;
                        z2 = z7;
                        iM55682 = C0946.m55979("ۢ᩵") ^ i31;
                        i17 = ((iM55682 ^ i30) * (-24349)) ^ (-1814523549);
                        i18 = -173679334;
                        s3 = s;
                        c180312 = c180310;
                        exc8 = exc6;
                        i34 = i15;
                        i33 = iM55682 ^ i18;
                        i32 = i17;
                        i37 = i16;
                        str26 = str13;
                        str22 = str15;
                        pluginContext15 = pluginContext11;
                        charSequence16 = charSequence10;
                        str25 = str14;
                        c24549 = c24547;
                        charSequence19 = charSequence19;
                        c3957 = c3957;
                        pluginContext17 = pluginContext17;
                        i36 = i36;
                        sb10 = sb10;
                        sb9 = sb9;
                        str24 = str24;
                        pluginContext16 = pluginContext16;
                        boolean z8 = z2;
                        view = view;
                        c0991 = c0991;
                        z3 = z8;
                    }
                    break;
                case -1120681153:
                case 1841064461:
                    charSequence5 = charSequence16;
                    str8 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    exc3 = exc8;
                    sb = sb9;
                    c24549 = c24549;
                    str7 = str22;
                    sb10 = sb10;
                    c18037 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3956 = c3957;
                    charSequence6 = charSequence19;
                    try {
                        strM55754 = C0892.m55754(activityC20262.f62626, c24549.f27036, charSequence6);
                        iM55680 = C0873.m55680("᩷ۘ") ^ i30;
                        i8 = ((iM55680 ^ i31) * 14201) ^ 1593304514;
                        i9 = 815029208;
                        i33 = iM55680 ^ i9;
                        charSequence19 = charSequence6;
                        i32 = i8;
                        c180312 = c18037;
                        c3957 = c3956;
                        exc8 = exc3;
                        str22 = str7;
                        c24549 = c24549;
                        str26 = str8;
                        pluginContext17 = pluginContext5;
                        pluginContext15 = pluginContext15;
                        charSequence16 = charSequence5;
                        i36 = i2;
                        str25 = str25;
                    } catch (Exception e2) {
                        e = e2;
                        int iM559715 = (i30 - C0946.m55979("ۛۚ")) * (-81);
                        Exception exc13 = e;
                        i32 = ((iM559715 ^ i31) * 26795) ^ (-1625711926);
                        i33 = iM559715 ^ (-1320619764);
                        str26 = str8;
                        c180312 = c18037;
                        str22 = str7;
                        charSequence16 = charSequence5;
                        c24549 = c24549;
                        exc8 = exc13;
                        pluginContext15 = pluginContext15;
                        charSequence19 = charSequence6;
                        str25 = str25;
                        c3957 = c3956;
                        pluginContext17 = pluginContext5;
                        i36 = i2;
                    }
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -1117700900:
                case 652777917:
                    CharSequence charSequence21 = charSequence16;
                    String str30 = str26;
                    PluginContext pluginContext20 = pluginContext16;
                    String str31 = str24;
                    String str32 = str25;
                    Exception exc14 = exc8;
                    StringBuilder sb14 = sb9;
                    C18035 c180313 = c180312;
                    int iM559716 = (C0946.m55979("۫ۧ") + i30) * 87;
                    i32 = ((iM559716 ^ i31) * (-17229)) ^ (-384077233);
                    i33 = iM559716 ^ (-1604059602);
                    pluginContext17 = pluginContext17;
                    c180312 = c180313;
                    exc8 = exc14;
                    str22 = str22;
                    c24549 = c24549;
                    i36 = i36;
                    str26 = str30;
                    sb10 = sb10;
                    sb9 = sb14;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence21;
                    str25 = str32;
                    str24 = str31;
                    pluginContext16 = pluginContext20;
                    charSequence19 = charSequence19;
                    c3957 = (C3954) abstractC9791;
                    break;
                case -1104541142:
                case 824992050:
                    if (!C0949.m56012()) {
                        charSequence11 = charSequence16;
                        str16 = str26;
                        pluginContext16 = pluginContext16;
                        str24 = str24;
                        str17 = str25;
                        i19 = i34;
                        pluginContext12 = pluginContext15;
                        i20 = i37;
                        exc7 = exc8;
                        sb9 = sb9;
                        sb10 = sb10;
                        c180311 = c180312;
                        i36 = i36;
                        pluginContext17 = pluginContext17;
                        c3957 = c3957;
                        charSequence19 = charSequence19;
                        c24547 = c24549;
                        str18 = str22;
                        boolean z9 = z3;
                        c0991 = c0991;
                        view = view;
                        z2 = z9;
                        iM55683 = C0873.m55680("ܽۘ") ^ i30;
                        i21 = ((iM55683 ^ i31) * (-32211)) ^ 1470787449;
                        i22 = 743796944;
                        int i41 = iM55683 ^ i22;
                        i37 = i20;
                        c180312 = c180311;
                        exc8 = exc7;
                        pluginContext15 = pluginContext12;
                        i34 = i19;
                        i33 = i41;
                        i32 = i21;
                        str26 = str16;
                        str25 = str17;
                        str22 = str18;
                        charSequence16 = charSequence11;
                        c24549 = c24547;
                        charSequence19 = charSequence19;
                        c3957 = c3957;
                        pluginContext17 = pluginContext17;
                        i36 = i36;
                        sb10 = sb10;
                        sb9 = sb9;
                        str24 = str24;
                        pluginContext16 = pluginContext16;
                        boolean z10 = z2;
                        view = view;
                        c0991 = c0991;
                        z3 = z10;
                    } else {
                        charSequence = charSequence16;
                        i4 = i36;
                        pluginContext3 = pluginContext17;
                        str = str26;
                        pluginContext = pluginContext16;
                        str2 = str24;
                        str25 = str25;
                        i = i34;
                        pluginContext2 = pluginContext15;
                        c3954 = c3957;
                        i3 = i37;
                        charSequence2 = charSequence19;
                        exc = exc8;
                        sb = sb9;
                        c24543 = c24549;
                        str3 = str22;
                        sb10 = sb10;
                        c18035 = c180312;
                        int iM559717 = C0946.m55979("ۤ۠") ^ i31;
                        int i310 = i4;
                        i32 = ((iM559717 ^ i30) * 11089) ^ (-969075621);
                        c180312 = c18035;
                        exc8 = exc;
                        str22 = str3;
                        i34 = i;
                        i33 = iM559717 ^ (-505560537);
                        str26 = str;
                        c24549 = c24543;
                        sb10 = sb10;
                        sb9 = sb;
                        charSequence16 = charSequence;
                        charSequence19 = charSequence2;
                        c3957 = c3954;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                        pluginContext17 = pluginContext3;
                        i36 = i310;
                        i37 = i3;
                        pluginContext15 = pluginContext2;
                        str25 = str25;
                    }
                    break;
                case -1048371610:
                case 1973060303:
                    PluginContext pluginContext21 = activityC20262.f62621;
                    str25 = str25;
                    sb10 = new StringBuilder(str25);
                    str23 = c180312.f27036;
                    if (C1044.f81959 < 0) {
                        iM55686 = (C0873.m55680("᩸ۗ") + i31) * 79;
                        pluginContext2 = pluginContext21;
                        i27 = ((iM55686 ^ i30) * 2385) ^ 1111116084;
                        i28 = -497362930;
                        i33 = iM55686 ^ i28;
                        i32 = i27;
                        pluginContext15 = pluginContext2;
                        str25 = str25;
                    } else {
                        pluginContext15 = pluginContext21;
                        sb10 = sb10;
                        i36 = i36;
                        pluginContext17 = pluginContext17;
                        c3957 = c3957;
                        charSequence19 = charSequence19;
                        c24549 = c24549;
                        str22 = str22;
                        iM55684 = C0946.m55979("᩻ܶ") ^ i30;
                        z2 = z3;
                        i23 = ((iM55684 ^ i31) * (-11565)) ^ 1045803566;
                        i24 = 2021047076;
                        c180312 = c180312;
                        exc8 = exc8;
                        str22 = str22;
                        i34 = i34;
                        i33 = iM55684 ^ i24;
                        i32 = i23;
                        str26 = str26;
                        c24549 = c24549;
                        pluginContext15 = pluginContext15;
                        charSequence16 = charSequence16;
                        charSequence19 = charSequence19;
                        str25 = str25;
                        c3957 = c3957;
                        pluginContext17 = pluginContext17;
                        i36 = i36;
                        sb10 = sb10;
                        sb9 = sb9;
                        str24 = str24;
                        pluginContext16 = pluginContext16;
                        boolean z11 = z2;
                        view = view;
                        c0991 = c0991;
                        z3 = z11;
                    }
                    break;
                case -1032455296:
                case 1079164685:
                    CharSequence charSequence22 = c12672.f35567;
                    if (charSequence22 != null) {
                        charSequence16 = charSequence22;
                        str25 = str25;
                        pluginContext2 = pluginContext15;
                    } else {
                        str25 = str25;
                        pluginContext2 = pluginContext15;
                        charSequence16 = charSequence14;
                    }
                    iM55686 = C0946.m55979("֡᩵") ^ i30;
                    i27 = ((iM55686 ^ i31) * (-1655)) ^ (-1066471807);
                    i28 = 528818988;
                    i33 = iM55686 ^ i28;
                    i32 = i27;
                    pluginContext15 = pluginContext2;
                    str25 = str25;
                    break;
                case -1008553855:
                case 1276950772:
                    charSequence20 = c180312.f27037;
                    iM559710 = (i31 - C0946.m55979("ۙܳ")) * (-83);
                    i13 = ((iM559710 ^ i30) * 22241) ^ 739434169;
                    i14 = 400654534;
                    i33 = iM559710 ^ i14;
                    i32 = i13;
                    break;
                case -999659084:
                case -377517135:
                    charSequence5 = charSequence16;
                    str8 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    exc3 = exc8;
                    sb = sb9;
                    c24549 = c24549;
                    str7 = str22;
                    sb10 = sb10;
                    c18037 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3956 = c3957;
                    charSequence6 = charSequence19;
                    if (charSequence17 != null) {
                        iM55680 = C0873.m55680("ܳۛ") ^ i31;
                        i8 = ((iM55680 ^ i30) * 22337) ^ (-1619092894);
                        i9 = -276767053;
                    } else {
                        iM55680 = (i31 - C0873.m55680("ۚ۠")) * 93;
                        i8 = ((iM55680 ^ i30) * 8589) ^ (-420734162);
                        i9 = -1633997835;
                    }
                    i33 = iM55680 ^ i9;
                    charSequence19 = charSequence6;
                    i32 = i8;
                    c180312 = c18037;
                    c3957 = c3956;
                    exc8 = exc3;
                    str22 = str7;
                    c24549 = c24549;
                    str26 = str8;
                    pluginContext17 = pluginContext5;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence5;
                    i36 = i2;
                    str25 = str25;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -991344401:
                case 1246393256:
                    if (zM56071) {
                        iM559710 = (C0873.m55680("᩷ۤ") + i30) * 45;
                        i13 = ((iM559710 ^ i31) * 19037) ^ (-445806568);
                        i14 = -528850582;
                    } else {
                        iM559710 = C0946.m55979("ۤ᩻") ^ i30;
                        i13 = ((iM559710 ^ i31) * 29125) ^ (-1247219736);
                        i14 = -6051161;
                    }
                    i33 = iM559710 ^ i14;
                    i32 = i13;
                    break;
                case -960900356:
                case -70384637:
                    charSequence10 = charSequence16;
                    str13 = str26;
                    pluginContext16 = pluginContext16;
                    str24 = str24;
                    str14 = str25;
                    i15 = i34;
                    pluginContext11 = pluginContext15;
                    i16 = i37;
                    exc6 = exc8;
                    sb9 = sb9;
                    s = s3;
                    sb10 = sb10;
                    c180310 = c180312;
                    i36 = i36;
                    pluginContext17 = pluginContext17;
                    c3957 = c3957;
                    charSequence19 = charSequence19;
                    c24547 = c24549;
                    str15 = str22;
                    boolean z12 = z3;
                    c0991 = c0991;
                    view = view;
                    z2 = z12;
                    sArr = f82094;
                    c = '\"';
                    if (C1044.m56286() <= 0) {
                        iM55682 = C0946.m55979("ۢ᩵") ^ i31;
                        i17 = ((iM55682 ^ i30) * (-24349)) ^ (-1814523549);
                        i18 = -173679334;
                    } else {
                        iM55682 = (C0873.m55680("ۨۡ") ^ i30) * 47;
                        i17 = ((iM55682 ^ i31) * (-20233)) ^ (-1924892487);
                        i18 = -1059724906;
                    }
                    s3 = s;
                    c180312 = c180310;
                    exc8 = exc6;
                    i34 = i15;
                    i33 = iM55682 ^ i18;
                    i32 = i17;
                    i37 = i16;
                    str26 = str13;
                    str22 = str15;
                    pluginContext15 = pluginContext11;
                    charSequence16 = charSequence10;
                    str25 = str14;
                    c24549 = c24547;
                    charSequence19 = charSequence19;
                    c3957 = c3957;
                    pluginContext17 = pluginContext17;
                    i36 = i36;
                    sb10 = sb10;
                    sb9 = sb9;
                    str24 = str24;
                    pluginContext16 = pluginContext16;
                    boolean z13 = z2;
                    view = view;
                    c0991 = c0991;
                    z3 = z13;
                    break;
                case -950445931:
                case 189216789:
                    if (!C0930.m55886(itM56292)) {
                        str25 = str25;
                        pluginContext2 = pluginContext15;
                        charSequence16 = charSequence14;
                        iM55686 = C0946.m55979("֡᩵") ^ i30;
                        i27 = ((iM55686 ^ i31) * (-1655)) ^ (-1066471807);
                        i28 = 528818988;
                        i33 = iM55686 ^ i28;
                        i32 = i27;
                        pluginContext15 = pluginContext2;
                        str25 = str25;
                    } else {
                        iM559710 = (C0873.m55680("᩶ܽ") + i31) * 99;
                        i13 = ((iM559710 ^ i30) * 16287) ^ 926702377;
                        i14 = -595991364;
                        i33 = iM559710 ^ i14;
                        i32 = i13;
                    }
                    break;
                case -901751725:
                case 1905843334:
                    charSequence13 = c180312.f53853;
                    charSequence15 = charSequence13;
                    iM559710 = C0873.m55680("ᩳᩳ") ^ i30;
                    i13 = ((iM559710 ^ i31) * (-23301)) ^ 1094528777;
                    i14 = -415830184;
                    i33 = iM559710 ^ i14;
                    i32 = i13;
                    break;
                case -900390979:
                case 1301709276:
                    if (C0949.f81897 < 0) {
                        charSequence10 = charSequence16;
                        str13 = str26;
                        pluginContext16 = pluginContext16;
                        str24 = str24;
                        str14 = str25;
                        i15 = i34;
                        pluginContext11 = pluginContext15;
                        i16 = i37;
                        exc6 = exc8;
                        sb9 = sb9;
                        s = s3;
                        sb10 = sb10;
                        c180310 = c180312;
                        i36 = i36;
                        pluginContext17 = pluginContext17;
                        c3957 = c3957;
                        charSequence19 = charSequence19;
                        c24547 = c24549;
                        str15 = str22;
                        boolean z14 = z3;
                        c0991 = c0991;
                        view = view;
                        z2 = z14;
                        iM55682 = C0946.m55979("ۢ᩵") ^ i31;
                        i17 = ((iM55682 ^ i30) * (-24349)) ^ (-1814523549);
                        i18 = -173679334;
                        s3 = s;
                        c180312 = c180310;
                        exc8 = exc6;
                        i34 = i15;
                        i33 = iM55682 ^ i18;
                        i32 = i17;
                        i37 = i16;
                        str26 = str13;
                        str22 = str15;
                        pluginContext15 = pluginContext11;
                        charSequence16 = charSequence10;
                        str25 = str14;
                        c24549 = c24547;
                        charSequence19 = charSequence19;
                        c3957 = c3957;
                        pluginContext17 = pluginContext17;
                        i36 = i36;
                        sb10 = sb10;
                        sb9 = sb9;
                        str24 = str24;
                        pluginContext16 = pluginContext16;
                        boolean z15 = z2;
                        view = view;
                        c0991 = c0991;
                        z3 = z15;
                    } else {
                        charSequence3 = charSequence16;
                        str4 = str26;
                        pluginContext = pluginContext16;
                        str2 = str24;
                        str5 = str25;
                        i5 = i34;
                        pluginContext4 = pluginContext15;
                        z = z3;
                        exc2 = exc8;
                        sb = sb9;
                        c0990 = c0991;
                        sb10 = sb10;
                        c18036 = c180312;
                        i2 = i36;
                        pluginContext5 = pluginContext17;
                        c3955 = c3957;
                        charSequence4 = charSequence19;
                        c24544 = c24549;
                        str6 = str22;
                        iM55979 = (i30 - C0946.m55979("ۡۛ")) * (-115);
                        i6 = ((iM55979 ^ i31) * 4591) ^ 1930433084;
                        i7 = 578103365;
                        c180312 = c18036;
                        exc8 = exc2;
                        str22 = str6;
                        i34 = i5;
                        i33 = iM55979 ^ i7;
                        i32 = i6;
                        str26 = str4;
                        c0991 = c0990;
                        c24549 = c24544;
                        charSequence16 = charSequence3;
                        z3 = z;
                        charSequence19 = charSequence4;
                        c3957 = c3955;
                        pluginContext15 = pluginContext4;
                        str25 = str5;
                        pluginContext17 = pluginContext5;
                        i36 = i2;
                        sb10 = sb10;
                        sb9 = sb;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                    }
                    break;
                case -882649302:
                case -742319937:
                    if (C0877.f81843 < 0) {
                        iM559710 = C0873.m55680("ܽܰ") ^ i31;
                        i13 = ((iM559710 ^ i30) * 19973) ^ 1452574050;
                        i14 = -778095401;
                    } else {
                        iM559710 = (C0946.m55979("᩺֨") ^ i30) * (-115);
                        i13 = ((iM559710 ^ i31) * (-16453)) ^ (-1935713647);
                        i14 = 1946357151;
                    }
                    i33 = iM559710 ^ i14;
                    i32 = i13;
                    break;
                case -865047671:
                case 301019006:
                    charSequence16 = charSequence16;
                    str26 = str26;
                    pluginContext16 = pluginContext16;
                    str24 = str24;
                    str25 = str25;
                    i34 = i34;
                    pluginContext15 = pluginContext15;
                    z3 = z3;
                    exc8 = exc8;
                    sb9 = sb9;
                    c0991 = c0991;
                    sb10 = sb10;
                    c180312 = c180312;
                    view = view;
                    i36 = i36;
                    pluginContext17 = pluginContext17;
                    c3957 = c3957;
                    charSequence19 = charSequence19;
                    c24549 = c24549;
                    str22 = str22;
                    C1929.m56554(view, z3);
                    textView2 = this.f30127;
                    if (C1071.f81975 <= 0) {
                        iM55684 = C0946.m55979("᩻ܶ") ^ i30;
                        z2 = z3;
                        i23 = ((iM55684 ^ i31) * (-11565)) ^ 1045803566;
                        i24 = 2021047076;
                    } else {
                        z2 = z3;
                        iM55684 = C0946.m55979("۫֡") ^ i30;
                        i23 = ((iM55684 ^ i31) * 8457) ^ (-918404133);
                        i24 = 1457085101;
                    }
                    c180312 = c180312;
                    exc8 = exc8;
                    str22 = str22;
                    i34 = i34;
                    i33 = iM55684 ^ i24;
                    i32 = i23;
                    str26 = str26;
                    c24549 = c24549;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence16;
                    charSequence19 = charSequence19;
                    str25 = str25;
                    c3957 = c3957;
                    pluginContext17 = pluginContext17;
                    i36 = i36;
                    sb10 = sb10;
                    sb9 = sb9;
                    str24 = str24;
                    pluginContext16 = pluginContext16;
                    boolean z16 = z2;
                    view = view;
                    c0991 = c0991;
                    z3 = z16;
                    break;
                case -844619423:
                case 1111018032:
                    charSequence8 = charSequence16;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str10 = str25;
                    pluginContext9 = pluginContext15;
                    StringBuilder sb15 = sb9;
                    c24546 = c24549;
                    str12 = str22;
                    sb4 = sb10;
                    exc5 = exc8;
                    c18039 = c180312;
                    pluginContext17 = activityC20262.f62621;
                    StringBuilder sb16 = new StringBuilder(str10);
                    String str33 = c24546.f27036;
                    if (C0894.f81854 < 0) {
                        int iM556810 = (C0873.m55680("ۛۗ") + i31) * 61;
                        sb8 = sb16;
                        i32 = ((iM556810 ^ i30) * 17913) ^ 2010374476;
                        i33 = iM556810 ^ (-2082514657);
                        str26 = str33;
                        c180312 = c18039;
                        str22 = str12;
                        charSequence16 = charSequence8;
                        c24549 = c24546;
                        exc8 = exc5;
                        sb10 = sb4;
                        sb9 = sb15;
                        pluginContext15 = pluginContext9;
                        str25 = str10;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                    } else {
                        sb8 = sb16;
                        str26 = str33;
                        sb5 = sb15;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                        int iM559718 = (C0946.m55979("ۗ᩷") + i30) * (-109);
                        int i42 = ((iM559718 ^ i31) * (-13391)) ^ 1160085484;
                        i33 = iM559718 ^ (-1277522189);
                        c180312 = c18039;
                        str22 = str12;
                        c24549 = c24546;
                        exc8 = exc5;
                        sb10 = sb4;
                        pluginContext15 = pluginContext9;
                        sb9 = sb5;
                        i32 = i42;
                        str25 = str10;
                        charSequence16 = charSequence8;
                    }
                    break;
                case -838737686:
                case -327743782:
                    charSequence11 = charSequence16;
                    str16 = str26;
                    pluginContext16 = pluginContext16;
                    str24 = str24;
                    str17 = str25;
                    i19 = i34;
                    pluginContext12 = pluginContext15;
                    i20 = i37;
                    exc7 = exc8;
                    sb9 = sb9;
                    sb10 = sb10;
                    c180311 = c180312;
                    i36 = i36;
                    pluginContext17 = pluginContext17;
                    c3957 = c3957;
                    charSequence19 = charSequence19;
                    c24547 = c24549;
                    str18 = str22;
                    boolean z17 = z3;
                    c0991 = c0991;
                    view = view;
                    z2 = z17;
                    this.f30130 = abstractC9791;
                    if (abstractC9791.mo7887() != EnumC15825.f45808) {
                        iM55683 = C0873.m55680("ۨۘ") ^ i30;
                        i21 = ((iM55683 ^ i31) * 8715) ^ (-1897723562);
                        i22 = 1535540377;
                    } else {
                        iM55683 = C0946.m55979("ۗ᩵") ^ i30;
                        i21 = ((iM55683 ^ i31) * (-165)) ^ (-887207095);
                        i22 = -547159157;
                    }
                    int i43 = iM55683 ^ i22;
                    i37 = i20;
                    c180312 = c180311;
                    exc8 = exc7;
                    pluginContext15 = pluginContext12;
                    i34 = i19;
                    i33 = i43;
                    i32 = i21;
                    str26 = str16;
                    str25 = str17;
                    str22 = str18;
                    charSequence16 = charSequence11;
                    c24549 = c24547;
                    charSequence19 = charSequence19;
                    c3957 = c3957;
                    pluginContext17 = pluginContext17;
                    i36 = i36;
                    sb10 = sb10;
                    sb9 = sb9;
                    str24 = str24;
                    pluginContext16 = pluginContext16;
                    boolean z18 = z2;
                    view = view;
                    c0991 = c0991;
                    z3 = z18;
                    break;
                case -816613931:
                case 796873289:
                    charSequence = charSequence16;
                    pluginContext3 = pluginContext17;
                    str = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    c24543 = c24549;
                    str25 = str25;
                    i = i34;
                    str3 = str22;
                    pluginContext2 = pluginContext15;
                    c3954 = c3957;
                    exc = exc8;
                    sb = sb9;
                    sb10 = sb10;
                    c18035 = c180312;
                    i4 = iArr[C1024.m56207(abstractC9791.mo7887())];
                    i35 = 1;
                    if (C0912.f81867 > 0) {
                        int iM556811 = C0873.m55680("ۧᩳ") ^ i30;
                        int i44 = ((iM556811 ^ i31) * 5083) ^ 51617103;
                        c180312 = c18035;
                        exc8 = exc;
                        str22 = str3;
                        i34 = i;
                        i33 = iM556811 ^ 566642805;
                        str26 = str;
                        c24549 = c24543;
                        c3957 = c3954;
                        charSequence16 = charSequence;
                        charSequence19 = null;
                        pluginContext17 = pluginContext3;
                        pluginContext15 = pluginContext2;
                        i36 = i4;
                        i32 = i44;
                        str25 = str25;
                        sb10 = sb10;
                        sb9 = sb;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                    } else {
                        charSequence2 = null;
                        i3 = i37;
                        int iM559719 = C0946.m55979("ۤ۠") ^ i31;
                        int i311 = i4;
                        i32 = ((iM559719 ^ i30) * 11089) ^ (-969075621);
                        c180312 = c18035;
                        exc8 = exc;
                        str22 = str3;
                        i34 = i;
                        i33 = iM559719 ^ (-505560537);
                        str26 = str;
                        c24549 = c24543;
                        sb10 = sb10;
                        sb9 = sb;
                        charSequence16 = charSequence;
                        charSequence19 = charSequence2;
                        c3957 = c3954;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                        pluginContext17 = pluginContext3;
                        i36 = i311;
                        i37 = i3;
                        pluginContext15 = pluginContext2;
                        str25 = str25;
                    }
                    break;
                case -768663809:
                case 358277046:
                    C1048.m56305();
                    if (C0898.m55800() > 0) {
                        str25 = str25;
                        pluginContext15 = pluginContext15;
                        sb10 = sb10;
                        i36 = i36;
                        pluginContext17 = pluginContext17;
                        c3957 = c3957;
                        charSequence19 = charSequence19;
                        c24549 = c24549;
                        str22 = str22;
                        iM55684 = C0946.m55979("᩻ܶ") ^ i30;
                        z2 = z3;
                        i23 = ((iM55684 ^ i31) * (-11565)) ^ 1045803566;
                        i24 = 2021047076;
                        c180312 = c180312;
                        exc8 = exc8;
                        str22 = str22;
                        i34 = i34;
                        i33 = iM55684 ^ i24;
                        i32 = i23;
                        str26 = str26;
                        c24549 = c24549;
                        pluginContext15 = pluginContext15;
                        charSequence16 = charSequence16;
                        charSequence19 = charSequence19;
                        str25 = str25;
                        c3957 = c3957;
                        pluginContext17 = pluginContext17;
                        i36 = i36;
                        sb10 = sb10;
                        sb9 = sb9;
                        str24 = str24;
                        pluginContext16 = pluginContext16;
                        boolean z19 = z2;
                        view = view;
                        c0991 = c0991;
                        z3 = z19;
                    }
                    charSequence10 = charSequence16;
                    str13 = str26;
                    pluginContext16 = pluginContext16;
                    str24 = str24;
                    str14 = str25;
                    i15 = i34;
                    pluginContext11 = pluginContext15;
                    i16 = i37;
                    exc6 = exc8;
                    sb9 = sb9;
                    s = s3;
                    sb10 = sb10;
                    c180310 = c180312;
                    i36 = i36;
                    pluginContext17 = pluginContext17;
                    c3957 = c3957;
                    charSequence19 = charSequence19;
                    c24547 = c24549;
                    str15 = str22;
                    boolean z110 = z3;
                    c0991 = c0991;
                    view = view;
                    z2 = z110;
                    iM55682 = C0946.m55979("ۢ᩵") ^ i31;
                    i17 = ((iM55682 ^ i30) * (-24349)) ^ (-1814523549);
                    i18 = -173679334;
                    s3 = s;
                    c180312 = c180310;
                    exc8 = exc6;
                    i34 = i15;
                    i33 = iM55682 ^ i18;
                    i32 = i17;
                    i37 = i16;
                    str26 = str13;
                    str22 = str15;
                    pluginContext15 = pluginContext11;
                    charSequence16 = charSequence10;
                    str25 = str14;
                    c24549 = c24547;
                    charSequence19 = charSequence19;
                    c3957 = c3957;
                    pluginContext17 = pluginContext17;
                    i36 = i36;
                    sb10 = sb10;
                    sb9 = sb9;
                    str24 = str24;
                    pluginContext16 = pluginContext16;
                    boolean z111 = z2;
                    view = view;
                    c0991 = c0991;
                    z3 = z111;
                    break;
                case -757684261:
                case -120865272:
                    if (charSequence15 == null) {
                        iM559710 = C0946.m55979("֡۫") ^ i30;
                        i13 = ((iM559710 ^ i31) * 19343) ^ (-77514327);
                        i14 = -167705848;
                    } else {
                        charSequence20 = charSequence15;
                        iM559710 = (i31 - C0946.m55979("ۙܳ")) * (-83);
                        i13 = ((iM559710 ^ i30) * 22241) ^ 739434169;
                        i14 = 400654534;
                    }
                    i33 = iM559710 ^ i14;
                    i32 = i13;
                    break;
                case -743324128:
                case -512417983:
                    charSequence5 = charSequence16;
                    str8 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    exc3 = exc8;
                    sb = sb9;
                    c24549 = c24549;
                    str7 = str22;
                    sb10 = sb10;
                    c18037 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3956 = c3957;
                    charSequence6 = charSequence19;
                    if (i2 != 3) {
                        iM55680 = (C0873.m55680("ۧۘ") + i30) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM55680 ^ i31) * (-1513)) ^ 420792753;
                        i9 = 1805768914;
                    } else {
                        iM55680 = (i31 - C0946.m55979("֡۟")) * (-15);
                        i8 = ((iM55680 ^ i30) * (-30093)) ^ 1404255554;
                        i9 = 1616895499;
                    }
                    i33 = iM55680 ^ i9;
                    charSequence19 = charSequence6;
                    i32 = i8;
                    c180312 = c18037;
                    c3957 = c3956;
                    exc8 = exc3;
                    str22 = str7;
                    c24549 = c24549;
                    str26 = str8;
                    pluginContext17 = pluginContext5;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence5;
                    i36 = i2;
                    str25 = str25;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -701423362:
                case 1445964498:
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    c24549 = c24549;
                    try {
                        charSequence9 = c24549.f77733;
                        str7 = str22;
                        StringBuilder sb17 = sb9;
                        sb10 = sb10;
                        pluginContext10 = pluginContext16;
                        str2 = str24;
                        sb = sb17;
                        charSequence17 = charSequence9;
                        pluginContext = pluginContext10;
                        charSequence5 = charSequence16;
                        i2 = i36;
                        pluginContext5 = pluginContext17;
                        str8 = str26;
                        c3956 = c3957;
                        charSequence6 = charSequence19;
                        exc3 = exc8;
                        c18037 = c180312;
                        iM55680 = C0873.m55680("᩶ۤ") ^ i31;
                        i8 = ((iM55680 ^ i30) * (-9413)) ^ (-1500276379);
                        i9 = 820941687;
                        i33 = iM55680 ^ i9;
                        charSequence19 = charSequence6;
                        i32 = i8;
                        c180312 = c18037;
                        c3957 = c3956;
                        exc8 = exc3;
                        str22 = str7;
                        c24549 = c24549;
                        str26 = str8;
                        pluginContext17 = pluginContext5;
                        pluginContext15 = pluginContext15;
                        charSequence16 = charSequence5;
                        i36 = i2;
                        str25 = str25;
                    } catch (Exception e3) {
                        e = e3;
                        str7 = str22;
                        c18037 = c180312;
                        charSequence5 = charSequence16;
                        str8 = str26;
                        pluginContext = pluginContext16;
                        str2 = str24;
                        sb = sb9;
                        sb10 = sb10;
                        i2 = i36;
                        pluginContext5 = pluginContext17;
                        c3956 = c3957;
                        charSequence6 = charSequence19;
                        int iM5597110 = (i30 - C0946.m55979("ۛۚ")) * (-81);
                        Exception exc15 = e;
                        i32 = ((iM5597110 ^ i31) * 26795) ^ (-1625711926);
                        i33 = iM5597110 ^ (-1320619764);
                        str26 = str8;
                        c180312 = c18037;
                        str22 = str7;
                        charSequence16 = charSequence5;
                        c24549 = c24549;
                        exc8 = exc15;
                        pluginContext15 = pluginContext15;
                        charSequence19 = charSequence6;
                        str25 = str25;
                        c3957 = c3956;
                        pluginContext17 = pluginContext5;
                        i36 = i2;
                    }
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -647466286:
                case 1736553672:
                    sb4 = sb10;
                    str10 = str25;
                    pluginContext9 = pluginContext15;
                    c24546 = c24549;
                    str12 = str22;
                    Exception exc16 = exc10;
                    pluginContext16 = activityC20262.f62621;
                    sb5 = new StringBuilder(str10);
                    String str34 = c3957.f27036;
                    if (C1025.f81947 >= 0) {
                        exc10 = exc16;
                        str24 = str34;
                        charSequence8 = charSequence16;
                        exc5 = exc8;
                        c18039 = c180312;
                        int iM5597111 = (C0946.m55979("ۗ᩷") + i30) * (-109);
                        int i45 = ((iM5597111 ^ i31) * (-13391)) ^ 1160085484;
                        i33 = iM5597111 ^ (-1277522189);
                        c180312 = c18039;
                        str22 = str12;
                        c24549 = c24546;
                        exc8 = exc5;
                        sb10 = sb4;
                        pluginContext15 = pluginContext9;
                        sb9 = sb5;
                        i32 = i45;
                        str25 = str10;
                        charSequence16 = charSequence8;
                    } else {
                        int iM559720 = C0946.m55979("ܰ۠") ^ i30;
                        i32 = ((iM559720 ^ i31) * (-12699)) ^ (-442205152);
                        i33 = iM559720 ^ (-626760947);
                        exc10 = exc16;
                        str22 = str12;
                        c24549 = c24546;
                        pluginContext15 = pluginContext9;
                        str25 = str10;
                        str24 = str34;
                        sb10 = sb4;
                        sb9 = sb5;
                    }
                    break;
                case -497373358:
                case 378432158:
                    break;
                case -384569360:
                case 243481060:
                    C0898.m55800();
                    C0930.m55885();
                    break;
                case -360649962:
                case 2079320719:
                    z2 = z3;
                    i37 = 0;
                    iM55684 = (C0873.m55680("ۘ۫") ^ i31) * 23;
                    i23 = ((iM55684 ^ i30) * (-31797)) ^ (-1365522882);
                    i24 = -712615677;
                    c180312 = c180312;
                    exc8 = exc8;
                    str22 = str22;
                    i34 = i34;
                    i33 = iM55684 ^ i24;
                    i32 = i23;
                    str26 = str26;
                    c24549 = c24549;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence16;
                    charSequence19 = charSequence19;
                    str25 = str25;
                    c3957 = c3957;
                    pluginContext17 = pluginContext17;
                    i36 = i36;
                    sb10 = sb10;
                    sb9 = sb9;
                    str24 = str24;
                    pluginContext16 = pluginContext16;
                    boolean z112 = z2;
                    view = view;
                    c0991 = c0991;
                    z3 = z112;
                    break;
                case -359694488:
                case 1304029024:
                    c12672 = (C12672) RunnableC0897.m55785(itM56292);
                    if (ViewOnClickListenerC0939.m55949(str22, c12672.f35568)) {
                        iM559710 = (C0946.m55979("֫ۜ") + i31) * (-101);
                        i13 = ((iM559710 ^ i30) * 20927) ^ 21611418;
                        i14 = -965031609;
                    } else {
                        iM559710 = C0873.m55680("ۙᩴ") ^ i31;
                        i13 = ((iM559710 ^ i30) * 11757) ^ 1762725137;
                        i14 = 870217667;
                    }
                    i33 = iM559710 ^ i14;
                    i32 = i13;
                    break;
                case -303958802:
                case 1419135640:
                    charSequence7 = charSequence16;
                    str9 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str10 = str25;
                    pluginContext6 = pluginContext15;
                    exc4 = exc8;
                    sb2 = sb9;
                    c24545 = c24549;
                    str11 = str22;
                    sb3 = sb10;
                    c18038 = c180312;
                    pluginContext8 = pluginContext17;
                    i10 = i36;
                    if (i10 != 4) {
                        iM55681 = (C0946.m55979("᩻ᩳ") + i31) * (-63);
                        pluginContext7 = pluginContext8;
                        i11 = ((iM55681 ^ i30) * (-23321)) ^ (-1102113722);
                        i12 = 865890135;
                    } else {
                        pluginContext7 = pluginContext8;
                        iM55681 = (i30 - C0873.m55680("᩵ܳ")) * 93;
                        i11 = ((iM55681 ^ i31) * 3281) ^ 174660544;
                        i12 = -620455931;
                    }
                    i33 = iM55681 ^ i12;
                    i32 = i11;
                    pluginContext17 = pluginContext7;
                    c180312 = c18038;
                    exc8 = exc4;
                    str22 = str11;
                    c24549 = c24545;
                    i36 = i10;
                    str26 = str9;
                    sb10 = sb3;
                    sb9 = sb2;
                    pluginContext15 = pluginContext6;
                    charSequence16 = charSequence7;
                    str25 = str10;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -267292857:
                case 925770052:
                    charSequence5 = charSequence16;
                    str8 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    exc3 = exc8;
                    sb = sb9;
                    c24549 = c24549;
                    str7 = str22;
                    sb10 = sb10;
                    c18037 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    try {
                        SharedPreferences sharedPreferences = activityC20262.f62626;
                        String str35 = c3957.f27036;
                        c3956 = c3957;
                        charSequence6 = charSequence19;
                        try {
                            strM56466 = C1404.m56466(sharedPreferences, str35, charSequence6);
                            iM55680 = (i31 - C0946.m55979("۫ۖ")) * (-37);
                            i8 = ((iM55680 ^ i30) * 4235) ^ 1843223222;
                            i9 = 1381188189;
                        } catch (Exception e4) {
                            e = e4;
                            exc10 = e;
                            iM55680 = C0946.m55979("֫ۤ") ^ i31;
                            i8 = ((iM55680 ^ i30) * 21851) ^ (-1501411913);
                            i9 = 770639270;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        c3956 = c3957;
                        charSequence6 = charSequence19;
                    }
                    i33 = iM55680 ^ i9;
                    charSequence19 = charSequence6;
                    i32 = i8;
                    c180312 = c18037;
                    c3957 = c3956;
                    exc8 = exc3;
                    str22 = str7;
                    c24549 = c24549;
                    str26 = str8;
                    pluginContext17 = pluginContext5;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence5;
                    i36 = i2;
                    str25 = str25;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -176090649:
                case 978271376:
                    charSequence7 = charSequence16;
                    str9 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str10 = str25;
                    pluginContext6 = pluginContext15;
                    exc4 = exc8;
                    sb2 = sb9;
                    c24545 = c24549;
                    str11 = str22;
                    sb3 = sb10;
                    c18038 = c180312;
                    pluginContext8 = pluginContext17;
                    C0894.m55771(textView, charSequence18);
                    i10 = i36;
                    iM55681 = (C0946.m55979("᩻ᩳ") + i31) * (-63);
                    pluginContext7 = pluginContext8;
                    i11 = ((iM55681 ^ i30) * (-23321)) ^ (-1102113722);
                    i12 = 865890135;
                    i33 = iM55681 ^ i12;
                    i32 = i11;
                    pluginContext17 = pluginContext7;
                    c180312 = c18038;
                    exc8 = exc4;
                    str22 = str11;
                    c24549 = c24545;
                    i36 = i10;
                    str26 = str9;
                    sb10 = sb3;
                    sb9 = sb2;
                    pluginContext15 = pluginContext6;
                    charSequence16 = charSequence7;
                    str25 = str10;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -136215197:
                case 338018042:
                    PluginContext pluginContext22 = pluginContext15;
                    CharSequence charSequence23 = charSequence16;
                    String str36 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    C24543 c245411 = c24549;
                    String str37 = str22;
                    Exception exc17 = exc8;
                    sb = sb9;
                    sb10 = sb10;
                    C18035 c180314 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3956 = c3957;
                    CharSequence charSequence24 = charSequence19;
                    int i46 = i34;
                    String strM56029 = C0955.m56029(f82094, 35, 23, i46);
                    ActivityC20262 activityC20263 = this.f30128;
                    int i47 = i35;
                    if (i2 != i47) {
                        int iM559721 = (i30 - C0946.m55979("۟֫")) * 81;
                        i32 = ((iM559721 ^ i31) * 3207) ^ 269376056;
                        c180312 = c180314;
                        exc8 = exc17;
                        str22 = str37;
                        i34 = i46;
                        str26 = str36;
                        i33 = iM559721 ^ 1904374264;
                        c24549 = c245411;
                        charSequence16 = charSequence23;
                        i35 = i47;
                        charSequence19 = charSequence24;
                        c3957 = c3956;
                        pluginContext15 = pluginContext22;
                        str25 = strM56029;
                        activityC20262 = activityC20263;
                    } else {
                        int iM556812 = (C0873.m55680("᩹᩵") ^ i31) * (-43);
                        i35 = i47;
                        c180312 = c180314;
                        exc8 = exc17;
                        str22 = str37;
                        i34 = i46;
                        i33 = iM556812 ^ 1288768475;
                        i32 = ((iM556812 ^ i30) * (-24875)) ^ (-1588684784);
                        str26 = str36;
                        c24549 = c245411;
                        pluginContext15 = pluginContext22;
                        str25 = strM56029;
                        charSequence16 = charSequence23;
                        charSequence19 = charSequence24;
                        activityC20262 = activityC20263;
                        c3957 = c3956;
                    }
                    pluginContext17 = pluginContext5;
                    i36 = i2;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case -123507424:
                case 431395080:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM559710 = (i31 - C0946.m55979("֫᩺")) * 95;
                        i13 = ((iM559710 ^ i30) * 793) ^ (-256374991);
                        i14 = 1147810169;
                        i33 = iM559710 ^ i14;
                        i32 = i13;
                    } else {
                        charSequence3 = charSequence16;
                        str4 = str26;
                        pluginContext = pluginContext16;
                        str2 = str24;
                        str5 = str25;
                        i5 = i34;
                        pluginContext4 = pluginContext15;
                        z = z3;
                        exc2 = exc8;
                        sb = sb9;
                        c0990 = c0991;
                        sb10 = sb10;
                        c18036 = c180312;
                        i2 = i36;
                        pluginContext5 = pluginContext17;
                        c3955 = c3957;
                        charSequence4 = charSequence19;
                        c24544 = c24549;
                        str6 = str22;
                        iM55979 = (i30 - C0946.m55979("ۡۛ")) * (-115);
                        i6 = ((iM55979 ^ i31) * 4591) ^ 1930433084;
                        i7 = 578103365;
                        c180312 = c18036;
                        exc8 = exc2;
                        str22 = str6;
                        i34 = i5;
                        i33 = iM55979 ^ i7;
                        i32 = i6;
                        str26 = str4;
                        c0991 = c0990;
                        c24549 = c24544;
                        charSequence16 = charSequence3;
                        z3 = z;
                        charSequence19 = charSequence4;
                        c3957 = c3955;
                        pluginContext15 = pluginContext4;
                        str25 = str5;
                        pluginContext17 = pluginContext5;
                        i36 = i2;
                        sb10 = sb10;
                        sb9 = sb;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                    }
                    break;
                case -86788405:
                case 593828346:
                    str25 = str25;
                    if (strM56466 != null) {
                        str21 = strM56466;
                        pluginContext10 = pluginContext16;
                        str2 = str24;
                        sb = sb9;
                        int iM556813 = C0873.m55680("۬ܺ") ^ i30;
                        str7 = str21;
                        i32 = ((iM556813 ^ i31) * 21753) ^ (-29886657);
                        i33 = iM556813 ^ 79887713;
                        exc10 = exc10;
                        str22 = str7;
                        c24549 = c24549;
                        pluginContext15 = pluginContext15;
                        str25 = str25;
                        String str211 = str2;
                        pluginContext16 = pluginContext10;
                        sb10 = sb10;
                        sb9 = sb;
                        str24 = str211;
                    } else {
                        iM55686 = (i31 - C0873.m55680("ۤۜ")) * (-105);
                        pluginContext2 = pluginContext15;
                        i27 = ((iM55686 ^ i30) * (-9403)) ^ 1657898540;
                        i28 = 404456956;
                        i33 = iM55686 ^ i28;
                        i32 = i27;
                        pluginContext15 = pluginContext2;
                        str25 = str25;
                    }
                    break;
                case 19067684:
                case 2122791344:
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        charSequence11 = charSequence16;
                        str16 = str26;
                        pluginContext16 = pluginContext16;
                        str24 = str24;
                        str17 = str25;
                        i19 = i34;
                        pluginContext12 = pluginContext15;
                        i20 = i37;
                        exc7 = exc8;
                        sb9 = sb9;
                        sb10 = sb10;
                        c180311 = c180312;
                        i36 = i36;
                        pluginContext17 = pluginContext17;
                        c3957 = c3957;
                        charSequence19 = charSequence19;
                        c24547 = c24549;
                        str18 = str22;
                        boolean z20 = z3;
                        c0991 = c0991;
                        view = view;
                        z2 = z20;
                        iM55683 = C0873.m55680("ܽۘ") ^ i30;
                        i21 = ((iM55683 ^ i31) * (-32211)) ^ 1470787449;
                        i22 = 743796944;
                        int i48 = iM55683 ^ i22;
                        i37 = i20;
                        c180312 = c180311;
                        exc8 = exc7;
                        pluginContext15 = pluginContext12;
                        i34 = i19;
                        i33 = i48;
                        i32 = i21;
                        str26 = str16;
                        str25 = str17;
                        str22 = str18;
                        charSequence16 = charSequence11;
                        c24549 = c24547;
                        charSequence19 = charSequence19;
                        c3957 = c3957;
                        pluginContext17 = pluginContext17;
                        i36 = i36;
                        sb10 = sb10;
                        sb9 = sb9;
                        str24 = str24;
                        pluginContext16 = pluginContext16;
                        boolean z113 = z2;
                        view = view;
                        c0991 = c0991;
                        z3 = z113;
                    } else {
                        charSequence3 = charSequence16;
                        str4 = str26;
                        pluginContext = pluginContext16;
                        str2 = str24;
                        str5 = str25;
                        i5 = i34;
                        pluginContext4 = pluginContext15;
                        z = z3;
                        exc2 = exc8;
                        sb = sb9;
                        c0990 = c0991;
                        sb10 = sb10;
                        c18036 = c180312;
                        i2 = i36;
                        pluginContext5 = pluginContext17;
                        c3955 = c3957;
                        charSequence4 = charSequence19;
                        c24544 = c24549;
                        str6 = str22;
                        iM55979 = (i30 - C0946.m55979("ۡۛ")) * (-115);
                        i6 = ((iM55979 ^ i31) * 4591) ^ 1930433084;
                        i7 = 578103365;
                        c180312 = c18036;
                        exc8 = exc2;
                        str22 = str6;
                        i34 = i5;
                        i33 = iM55979 ^ i7;
                        i32 = i6;
                        str26 = str4;
                        c0991 = c0990;
                        c24549 = c24544;
                        charSequence16 = charSequence3;
                        z3 = z;
                        charSequence19 = charSequence4;
                        c3957 = c3955;
                        pluginContext15 = pluginContext4;
                        str25 = str5;
                        pluginContext17 = pluginContext5;
                        i36 = i2;
                        sb10 = sb10;
                        sb9 = sb;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                    }
                    break;
                case 211812141:
                case 957709516:
                    str25 = str25;
                    pluginContext13 = pluginContext15;
                    c24548 = c24549;
                    str19 = str22;
                    StringBuilder sb18 = sb9;
                    sb6 = sb10;
                    PluginContext pluginContext23 = pluginContext16;
                    str20 = str24;
                    sb7 = sb18;
                    try {
                        pluginContext14 = pluginContext23;
                        try {
                            charSequence12 = charSequence16;
                            try {
                                zM56071 = C0967.m56071(activityC20262.f62626, c180312.f27036, c180312.f53851);
                                iM55685 = C0873.m55680("ᩴ۫") ^ i30;
                                i25 = ((iM55685 ^ i31) * (-17227)) ^ (-1850517942);
                                i26 = -251038469;
                            } catch (Exception e6) {
                                e = e6;
                                exc9 = e;
                                iM55685 = C0873.m55680("ۛܶ") ^ i30;
                                i25 = ((iM55685 ^ i31) * 20741) ^ (-1072674784);
                                i26 = -194985154;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            charSequence12 = charSequence16;
                            exc9 = e;
                            iM55685 = C0873.m55680("ۛܶ") ^ i30;
                            i25 = ((iM55685 ^ i31) * 20741) ^ (-1072674784);
                            i26 = -194985154;
                            i33 = iM55685 ^ i26;
                            i32 = i25;
                            sb10 = sb6;
                            sb9 = sb7;
                            str22 = str19;
                            charSequence16 = charSequence12;
                            c24549 = c24548;
                            str24 = str20;
                            pluginContext15 = pluginContext13;
                            pluginContext16 = pluginContext14;
                            str25 = str25;
                            break;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        pluginContext14 = pluginContext23;
                    }
                    i33 = iM55685 ^ i26;
                    i32 = i25;
                    sb10 = sb6;
                    sb9 = sb7;
                    str22 = str19;
                    charSequence16 = charSequence12;
                    c24549 = c24548;
                    str24 = str20;
                    pluginContext15 = pluginContext13;
                    pluginContext16 = pluginContext14;
                    str25 = str25;
                    break;
                case 479911726:
                case 619879056:
                    z2 = z3;
                    i34 = 60774;
                    int iM559722 = C0946.m55979("ܳܶ") ^ i31;
                    i33 = iM559722 ^ 981911396;
                    i32 = ((iM559722 ^ i30) * (-20145)) ^ (-438088813);
                    i37 = i37;
                    c180312 = c180312;
                    exc8 = exc8;
                    str22 = str22;
                    pluginContext15 = pluginContext15;
                    str26 = str26;
                    str25 = str25;
                    c24549 = c24549;
                    charSequence16 = charSequence16;
                    charSequence19 = charSequence19;
                    c3957 = c3957;
                    pluginContext17 = pluginContext17;
                    i36 = i36;
                    sb10 = sb10;
                    sb9 = sb9;
                    str24 = str24;
                    pluginContext16 = pluginContext16;
                    boolean z114 = z2;
                    view = view;
                    c0991 = c0991;
                    z3 = z114;
                    break;
                case 511428699:
                case 1664778328:
                    charSequence3 = charSequence16;
                    str4 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str5 = str25;
                    i5 = i34;
                    pluginContext4 = pluginContext15;
                    z = z3;
                    exc2 = exc8;
                    sb = sb9;
                    c0990 = c0991;
                    sb10 = sb10;
                    c18036 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3955 = c3957;
                    charSequence4 = charSequence19;
                    c24544 = c24549;
                    str6 = str22;
                    textView2.setEnabled(z);
                    textView = this.f30131;
                    textView.setEnabled(z);
                    if (C0845.f81821 >= 0) {
                        iM55979 = (i30 - C0946.m55979("ۡۛ")) * (-115);
                        i6 = ((iM55979 ^ i31) * 4591) ^ 1930433084;
                        i7 = 578103365;
                    } else {
                        iM55979 = (i30 - C0946.m55979("᩸۟")) * (-57);
                        i6 = ((iM55979 ^ i31) * 15211) ^ 362761016;
                        i7 = -1768706867;
                    }
                    c180312 = c18036;
                    exc8 = exc2;
                    str22 = str6;
                    i34 = i5;
                    i33 = iM55979 ^ i7;
                    i32 = i6;
                    str26 = str4;
                    c0991 = c0990;
                    c24549 = c24544;
                    charSequence16 = charSequence3;
                    z3 = z;
                    charSequence19 = charSequence4;
                    c3957 = c3955;
                    pluginContext15 = pluginContext4;
                    str25 = str5;
                    pluginContext17 = pluginContext5;
                    i36 = i2;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case 604040016:
                case 1226835348:
                    charSequence11 = charSequence16;
                    str16 = str26;
                    pluginContext16 = pluginContext16;
                    str24 = str24;
                    str17 = str25;
                    i19 = i34;
                    pluginContext12 = pluginContext15;
                    i20 = i37;
                    exc7 = exc8;
                    sb9 = sb9;
                    sb10 = sb10;
                    c180311 = c180312;
                    i36 = i36;
                    pluginContext17 = pluginContext17;
                    c3957 = c3957;
                    charSequence19 = charSequence19;
                    c24547 = c24549;
                    str18 = str22;
                    boolean z21 = z3;
                    c0991 = c0991;
                    view = view;
                    z2 = z21;
                    s3 = sArr[c];
                    s2 = 46980;
                    if (C0845.f81821 >= 0) {
                        iM55683 = C0873.m55680("ܽۘ") ^ i30;
                        i21 = ((iM55683 ^ i31) * (-32211)) ^ 1470787449;
                        i22 = 743796944;
                    } else {
                        iM55683 = C0873.m55680("ܳ᩶") ^ i31;
                        i21 = ((iM55683 ^ i30) * 30669) ^ 534345495;
                        i22 = 1077592454;
                    }
                    int i49 = iM55683 ^ i22;
                    i37 = i20;
                    c180312 = c180311;
                    exc8 = exc7;
                    pluginContext15 = pluginContext12;
                    i34 = i19;
                    i33 = i49;
                    i32 = i21;
                    str26 = str16;
                    str25 = str17;
                    str22 = str18;
                    charSequence16 = charSequence11;
                    c24549 = c24547;
                    charSequence19 = charSequence19;
                    c3957 = c3957;
                    pluginContext17 = pluginContext17;
                    i36 = i36;
                    sb10 = sb10;
                    sb9 = sb9;
                    str24 = str24;
                    pluginContext16 = pluginContext16;
                    boolean z115 = z2;
                    view = view;
                    c0991 = c0991;
                    z3 = z115;
                    break;
                case 622334633:
                case 996732634:
                    if (!C0949.m56012()) {
                        charSequence8 = charSequence16;
                        sb5 = sb9;
                        str10 = str25;
                        pluginContext9 = pluginContext15;
                        sb4 = sb10;
                        exc5 = exc8;
                        c24546 = c24549;
                        str12 = str22;
                        c18039 = c180312;
                        int iM5597112 = (C0946.m55979("ۗ᩷") + i30) * (-109);
                        int i410 = ((iM5597112 ^ i31) * (-13391)) ^ 1160085484;
                        i33 = iM5597112 ^ (-1277522189);
                        c180312 = c18039;
                        str22 = str12;
                        c24549 = c24546;
                        exc8 = exc5;
                        sb10 = sb4;
                        pluginContext15 = pluginContext9;
                        sb9 = sb5;
                        i32 = i410;
                        str25 = str10;
                        charSequence16 = charSequence8;
                    } else {
                        charSequence = charSequence16;
                        i4 = i36;
                        pluginContext3 = pluginContext17;
                        str = str26;
                        pluginContext = pluginContext16;
                        str2 = str24;
                        str25 = str25;
                        i = i34;
                        pluginContext2 = pluginContext15;
                        c3954 = c3957;
                        i3 = i37;
                        charSequence2 = charSequence19;
                        exc = exc8;
                        sb = sb9;
                        c24543 = c24549;
                        str3 = str22;
                        sb10 = sb10;
                        c18035 = c180312;
                        int iM5597113 = C0946.m55979("ۤ۠") ^ i31;
                        int i312 = i4;
                        i32 = ((iM5597113 ^ i30) * 11089) ^ (-969075621);
                        c180312 = c18035;
                        exc8 = exc;
                        str22 = str3;
                        i34 = i;
                        i33 = iM5597113 ^ (-505560537);
                        str26 = str;
                        c24549 = c24543;
                        sb10 = sb10;
                        sb9 = sb;
                        charSequence16 = charSequence;
                        charSequence19 = charSequence2;
                        c3957 = c3954;
                        str24 = str2;
                        pluginContext16 = pluginContext;
                        pluginContext17 = pluginContext3;
                        i36 = i312;
                        i37 = i3;
                        pluginContext15 = pluginContext2;
                        str25 = str25;
                    }
                    break;
                case 824256076:
                case 1010030003:
                    str25 = str25;
                    pluginContext2 = pluginContext15;
                    CharSequence charSequence25 = c3957.f27037;
                    if (str22 != null) {
                        int iM556814 = (i31 - C0873.m55680("ܺ᩸")) * (-61);
                        charSequence14 = charSequence25;
                        i32 = ((iM556814 ^ i30) * 25917) ^ (-1766563);
                        i33 = iM556814 ^ (-1180519621);
                    } else {
                        charSequence14 = charSequence25;
                        charSequence16 = charSequence14;
                        iM55686 = C0946.m55979("֡᩵") ^ i30;
                        i27 = ((iM55686 ^ i31) * (-1655)) ^ (-1066471807);
                        i28 = 528818988;
                        i33 = iM55686 ^ i28;
                        i32 = i27;
                    }
                    pluginContext15 = pluginContext2;
                    str25 = str25;
                    break;
                case 825269224:
                case 1229485908:
                    C19377 c19377 = (C19377) abstractC9791;
                    C0894.m55771(textView2, c19377.f27035);
                    C0894.m55771(textView, c19377.f27037);
                    break;
                case 1110291041:
                case 2098039967:
                    charSequence5 = charSequence16;
                    str8 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str25 = str25;
                    pluginContext15 = pluginContext15;
                    exc3 = exc8;
                    sb = sb9;
                    c24549 = c24549;
                    str7 = str22;
                    sb10 = sb10;
                    c18037 = c180312;
                    i2 = i36;
                    pluginContext5 = pluginContext17;
                    c3956 = c3957;
                    charSequence6 = charSequence19;
                    if (i2 != 2) {
                        iM55680 = (C0946.m55979("ۙᩳ") + i30) * 3;
                        i8 = ((iM55680 ^ i31) * 28575) ^ 974393447;
                        i9 = 1914316535;
                    } else {
                        iM55680 = (C0873.m55680("ۤܿ") ^ i30) * (-97);
                        i8 = ((iM55680 ^ i31) * 3233) ^ 83861796;
                        i9 = -1304245899;
                    }
                    i33 = iM55680 ^ i9;
                    charSequence19 = charSequence6;
                    i32 = i8;
                    c180312 = c18037;
                    c3957 = c3956;
                    exc8 = exc3;
                    str22 = str7;
                    c24549 = c24549;
                    str26 = str8;
                    pluginContext17 = pluginContext5;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence5;
                    i36 = i2;
                    str25 = str25;
                    sb10 = sb10;
                    sb9 = sb;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
                case 1232768281:
                case 1251422057:
                    z2 = z3;
                    i34 = 42050;
                    int iM559723 = C0946.m55979("ܳܶ") ^ i31;
                    i33 = iM559723 ^ 981911396;
                    i32 = ((iM559723 ^ i30) * (-20145)) ^ (-438088813);
                    i37 = i37;
                    c180312 = c180312;
                    exc8 = exc8;
                    str22 = str22;
                    pluginContext15 = pluginContext15;
                    str26 = str26;
                    str25 = str25;
                    c24549 = c24549;
                    charSequence16 = charSequence16;
                    charSequence19 = charSequence19;
                    c3957 = c3957;
                    pluginContext17 = pluginContext17;
                    i36 = i36;
                    sb10 = sb10;
                    sb9 = sb9;
                    str24 = str24;
                    pluginContext16 = pluginContext16;
                    boolean z116 = z2;
                    view = view;
                    c0991 = c0991;
                    z3 = z116;
                    break;
                case 1852155530:
                case 2072133686:
                    z2 = z3;
                    i37 = 8;
                    iM55684 = (C0873.m55680("ۘ۫") ^ i31) * 23;
                    i23 = ((iM55684 ^ i30) * (-31797)) ^ (-1365522882);
                    i24 = -712615677;
                    c180312 = c180312;
                    exc8 = exc8;
                    str22 = str22;
                    i34 = i34;
                    i33 = iM55684 ^ i24;
                    i32 = i23;
                    str26 = str26;
                    c24549 = c24549;
                    pluginContext15 = pluginContext15;
                    charSequence16 = charSequence16;
                    charSequence19 = charSequence19;
                    str25 = str25;
                    c3957 = c3957;
                    pluginContext17 = pluginContext17;
                    i36 = i36;
                    sb10 = sb10;
                    sb9 = sb9;
                    str24 = str24;
                    pluginContext16 = pluginContext16;
                    boolean z117 = z2;
                    view = view;
                    c0991 = c0991;
                    z3 = z117;
                    break;
                default:
                    RunnableC0938.m55928(textView2, c3957.f27035);
                    C0894.m55771(textView, charSequence16);
                    charSequence7 = charSequence16;
                    str9 = str26;
                    pluginContext = pluginContext16;
                    str2 = str24;
                    str10 = str25;
                    pluginContext6 = pluginContext15;
                    exc4 = exc8;
                    sb2 = sb9;
                    c24545 = c24549;
                    str11 = str22;
                    sb3 = sb10;
                    c18038 = c180312;
                    i10 = i36;
                    pluginContext8 = pluginContext17;
                    iM55681 = (C0946.m55979("᩻ᩳ") + i31) * (-63);
                    pluginContext7 = pluginContext8;
                    i11 = ((iM55681 ^ i30) * (-23321)) ^ (-1102113722);
                    i12 = 865890135;
                    i33 = iM55681 ^ i12;
                    i32 = i11;
                    pluginContext17 = pluginContext7;
                    c180312 = c18038;
                    exc8 = exc4;
                    str22 = str11;
                    c24549 = c24545;
                    i36 = i10;
                    str26 = str9;
                    sb10 = sb3;
                    sb9 = sb2;
                    pluginContext15 = pluginContext6;
                    charSequence16 = charSequence7;
                    str25 = str10;
                    str24 = str2;
                    pluginContext16 = pluginContext;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25045(C19456 c19456, AbstractC9791 abstractC9791, Object obj) {
        ActivityC20262 activityC20262 = null;
        Object obj2 = null;
        Throwable th = null;
        int i = -730565550;
        int i2 = C1229.f82066;
        int i3 = C1025.f81947;
        int iM55680 = (C0873.m55680("ܰۜ") + i3) * (-23);
        int i4 = ((iM55680 ^ i2) * (-1093)) ^ (-525074996);
        int i5 = -780203678;
        while (true) {
            i = ((((i ^ i2) * 31027) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2117442962:
                case 1053759080:
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ۡ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23151)) ^ (-338243002);
                        i5 = 1424212537;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۖ᩷")) * 61;
                        i4 = ((iM55680 ^ i2) * (-30245)) ^ 2009348864;
                        i5 = 417985423;
                    }
                    break;
                case -1983208522:
                case 1592568757:
                    if (obj2 == null) {
                        iM55680 = C0946.m55979("۟۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 10511) ^ (-1987627696);
                        i5 = -1734509692;
                    } else {
                        iM55680 = (C0873.m55680("ܳ᩷") ^ i3) * 75;
                        i4 = ((iM55680 ^ i2) * (-11615)) ^ (-1087563815);
                        i5 = 1868373672;
                    }
                    break;
                case -1949440115:
                case -691537885:
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        iM55680 = C0946.m55979("ۘۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 22607) ^ (-1229051702);
                        i5 = -2128556473;
                    }
                    break;
                case -1847996879:
                case -813873042:
                    if (C1024.f81946) {
                        iM55680 = (i3 - C0873.m55680("ۖ᩷")) * 61;
                        i4 = ((iM55680 ^ i2) * (-30245)) ^ 2009348864;
                        i5 = 417985423;
                    } else {
                        iM55680 = (C0873.m55680("᩶᩻") + i2) * (-67);
                        i4 = ((iM55680 ^ i3) * 27555) ^ (-1959631865);
                        i5 = -1314251140;
                    }
                    break;
                case -1774286298:
                case -425255131:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0873.m55680("ۢ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 493) ^ (-726029373);
                        i5 = 1717720190;
                    } else {
                        iM55680 = (C0873.m55680("۟ۡ") + i3) * 13;
                        i4 = ((iM55680 ^ i2) * (-21835)) ^ 1762638589;
                        i5 = 1172439905;
                    }
                    break;
                case -1603998610:
                case -202421704:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        iM55680 = C0946.m55979("۬ۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3821) ^ (-998013750);
                        i5 = 1833767108;
                    }
                    break;
                case -1494459779:
                case -1113802082:
                    break;
                case -1408818506:
                case -859806773:
                    activityC20262.f62623.f22676.onChange(c19456, (PluginPreference.PreferenceItem) abstractC9791.f27034, obj);
                    iM55680 = C0946.m55979("᩵ۢ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 21285) ^ (-1593788224);
                    i5 = 1382588573;
                    break;
                case -1263287145:
                case 1510812325:
                    activityC20262.f62621.log(th);
                    ServiceConnectionC1013.m56155(activityC20262, th, null);
                    iM55680 = C0873.m55680("᩺ۡ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-4741)) ^ 149957692;
                    i5 = -1163827701;
                    break;
                case -1214217720:
                case -230665757:
                    activityC20262 = this.f30128;
                    if (activityC20262.f62623.f22676 != null) {
                        iM55680 = (i3 - C0946.m55979("ۘ᩷")) * 73;
                        i4 = ((iM55680 ^ i2) * (-2553)) ^ 1322479555;
                        i5 = -325216746;
                    } else {
                        iM55680 = C0873.m55680("᩺ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4741)) ^ 149957692;
                        i5 = -1163827701;
                    }
                    break;
                case -1114709784:
                case 189962475:
                    break;
                case -1024918197:
                case 1542889220:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        iM55680 = C0946.m55979("᩻᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * 4287) ^ 1210547604;
                        i5 = 539640873;
                    }
                    break;
                case -991431744:
                case -678277881:
                    C0927.m55873();
                    break;
                case -974935665:
                case -591591192:
                    C1048.m56305();
                    if (C0890.f81849 != 0) {
                        iM55680 = (i3 - C0873.m55680("ۖ᩷")) * 61;
                        i4 = ((iM55680 ^ i2) * (-30245)) ^ 2009348864;
                        i5 = 417985423;
                    } else {
                        iM55680 = C0873.m55680("ۢ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 493) ^ (-726029373);
                        i5 = 1717720190;
                    }
                    break;
                case -757396853:
                case 789709026:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0946.m55979("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        iM55680 = C0873.m55680("ۛۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30653)) ^ (-58338352);
                        i5 = -618473025;
                    }
                    break;
                case -592126304:
                case -395475052:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        iM55680 = C0946.m55979("ܺۘ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 16677) ^ 118581844;
                        i5 = -1717640118;
                    }
                    break;
                case -571407050:
                case 412724060:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (C0873.m55680("ۖ۠") + i3) * 115;
                        i4 = ((iM55680 ^ i2) * 18379) ^ (-824881824);
                        i5 = -409898915;
                    } else {
                        iM55680 = (C0873.m55680("ᩴ᩻") + i3) * 9;
                        i4 = ((iM55680 ^ i2) * 17491) ^ 926792194;
                        i5 = 1789117943;
                    }
                    break;
                case -467449833:
                case 695035170:
                    try {
                        abstractC9791.f27034 = new C4839(activityC20262, abstractC9791);
                        iM55680 = (C0873.m55680("ܳ᩷") ^ i3) * 75;
                        i4 = ((iM55680 ^ i2) * (-11615)) ^ (-1087563815);
                        i5 = 1868373672;
                    } catch (Throwable th2) {
                        th = th2;
                        iM55680 = (i3 - C0946.m55979("ܿ᩺")) * (-123);
                        i4 = ((iM55680 ^ i2) * 13537) ^ 1263050639;
                        i5 = -650947649;
                    }
                    break;
                case 271296844:
                case 956041101:
                    C0892.m55749();
                    if (C1025.f81947 >= 0) {
                        iM55680 = (i3 - C0873.m55680("ۖ᩷")) * 61;
                        i4 = ((iM55680 ^ i2) * (-30245)) ^ 2009348864;
                        i5 = 417985423;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۛܿ")) * (-59);
                        i4 = ((iM55680 ^ i3) * 17471) ^ (-1116561080);
                        i5 = -1536244038;
                    }
                    break;
                case 282822633:
                case 1830404985:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("ۜۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        iM55680 = C0873.m55680("ۘܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 7803) ^ (-1447470222);
                        i5 = -1452690055;
                    }
                    break;
                case 582085884:
                case 818991116:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0873.m55680("ۢ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 493) ^ (-726029373);
                        i5 = 1717720190;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۚ") ^ i3) * 65;
                        i4 = ((iM55680 ^ i2) * (-15735)) ^ 426172836;
                        i5 = -211506227;
                    }
                    break;
                case 794320292:
                case 1458558760:
                    obj2 = abstractC9791.f27034;
                    iM55680 = (C0946.m55979("ۧܿ") ^ i2) * 11;
                    i4 = ((iM55680 ^ i3) * (-18945)) ^ 1076054891;
                    i5 = 748400323;
                    break;
                case 799320163:
                case 1507584117:
                    if (C1024.m56209() >= 0) {
                        iM55680 = (i3 - C0873.m55680("ۖ᩷")) * 61;
                        i4 = ((iM55680 ^ i2) * (-30245)) ^ 2009348864;
                        i5 = 417985423;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۜۤ")) * 43;
                        i4 = ((iM55680 ^ i2) * (-8333)) ^ (-143076);
                        i5 = 793637807;
                    }
                    break;
                case 1556716499:
                case 1644243402:
                    C0882.m55710();
                    C0927.m55873();
                    iM55680 = C0873.m55680("ۢ۠") ^ i2;
                    i4 = ((iM55680 ^ i3) * 493) ^ (-726029373);
                    i5 = 1717720190;
                    break;
                case 1792198548:
                case 1798165654:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("ۖ۠") + i3) * 115;
                        i4 = ((iM55680 ^ i2) * 18379) ^ (-824881824);
                        i5 = -409898915;
                    } else {
                        iM55680 = C0946.m55979("ᩳ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9363)) ^ 1550299425;
                        i5 = 913049194;
                    }
                    break;
                default:
                    if (!C0866.m55645()) {
                        iM55680 = C0873.m55680("ۢ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 493) ^ (-726029373);
                        i5 = 1717720190;
                    } else {
                        iM55680 = C0946.m55979("۬ۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3821) ^ (-998013750);
                        i5 = 1833767108;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 67641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r63) {
        /*
            Method dump skipped, instruction units count: 6764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.ViewOnClickListenerC10874.onClick(android.view.View):void");
    }
}
