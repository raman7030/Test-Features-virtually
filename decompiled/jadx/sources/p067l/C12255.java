package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 4651 */
/* JADX INFO: loaded from: classes3.dex */
public class C12255 extends C1732 {

    /* JADX INFO: renamed from: ۙ */
    public Paint f34261;

    /* JADX INFO: renamed from: ᩶ */
    public int f34262;

    /* JADX INFO: renamed from: ᩸ */
    public C13596 f34263;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f34264;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12255(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        int i = 1610616547;
        int i2 = ServiceConnectionC1013.f81940;
        int i3 = C1071.f81975;
        int iM55979 = C0946.m55979("۫۠") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-1263)) ^ 833077556;
        int i5 = 1363356303;
        while (true) {
            i = (iM55979 ^ i5) ^ (i4 & (((i ^ i2) * (-26905)) >> 31));
            switch (i) {
                case -1940198600:
                case 182896863:
                    ServiceConnectionC1013.m56157();
                    if (!C0890.m55740()) {
                        iM55979 = (C0946.m55979("֫᩸") + i3) * (-9);
                        i4 = ((iM55979 ^ i2) * 13623) ^ (-742670858);
                        i5 = 745308425;
                    } else {
                        iM55979 = C0873.m55680("ܳᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31233)) ^ (-505371448);
                        i5 = -228003097;
                    }
                    break;
                case -1892512094:
                case 318574425:
                    C0989.m56095();
                    C0894.m55769();
                    throw new RuntimeException();
                case -1659259697:
                case -191316218:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("ۖۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25937)) ^ 256991950;
                        i5 = 999358798;
                    } else {
                        iM55979 = C0946.m55979("᩻᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-32443)) ^ 1754788683;
                        i5 = -1331711655;
                    }
                    break;
                case -1580129905:
                case 1386537537:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (i2 - C0873.m55680("ᩴۙ")) * 27;
                        i4 = ((iM55979 ^ i3) * (-23825)) ^ 1436352175;
                        i5 = 1047061057;
                    } else {
                        iM55979 = C0946.m55979("ۢ۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27819) ^ 2019624720;
                        i5 = 1910901931;
                    }
                    break;
                case -1474952165:
                case 2012752154:
                    z = false;
                    if (C1036.m56257() <= 0) {
                        iM55979 = C0946.m55979("ۖۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25937)) ^ 256991950;
                        i5 = 999358798;
                    } else {
                        iM55979 = C0946.m55979("ܳۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 27805) ^ (-1538089789);
                        i5 = -140828204;
                    }
                    break;
                case -1398512991:
                case -724314746:
                    C1048.m56305();
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (i2 - C0873.m55680("ᩴۙ")) * 27;
                        i4 = ((iM55979 ^ i3) * (-23825)) ^ 1436352175;
                        i5 = 1047061057;
                    } else {
                        iM55979 = (C0946.m55979("֫᩸") + i3) * (-9);
                        i4 = ((iM55979 ^ i2) * 13623) ^ (-742670858);
                        i5 = 745308425;
                    }
                    break;
                case -1340117972:
                case 489293128:
                    if (C1046.f81962 > 0) {
                        iM55979 = C0946.m55979("ᩳ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29535)) ^ (-506838247);
                        i5 = -435026911;
                    } else {
                        iM55979 = (C0946.m55979("֫᩸") + i3) * (-9);
                        i4 = ((iM55979 ^ i2) * 13623) ^ (-742670858);
                        i5 = 745308425;
                    }
                    break;
                case -1254447519:
                case 1465716258:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ۛ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14067)) ^ (-1197672540);
                        i5 = -865647163;
                    } else {
                        iM55979 = C0946.m55979("ᩳ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29535)) ^ (-506838247);
                        i5 = -435026911;
                    }
                    break;
                case -1046270060:
                case -981893996:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("ܳᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31233)) ^ (-505371448);
                        i5 = -228003097;
                    } else {
                        iM55979 = (C0946.m55979("ۤ᩷") ^ i2) * (-107);
                        i4 = ((iM55979 ^ i3) * (-7441)) ^ (-122485121);
                        i5 = 1427217936;
                    }
                    break;
                case -925014089:
                case 460075692:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("ᩳ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29535)) ^ (-506838247);
                        i5 = -435026911;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۠ܶ")) * 109;
                        i4 = ((iM55979 ^ i2) * 11597) ^ (-519945553);
                        i5 = -1356588597;
                    }
                    break;
                case -812682419:
                case 2060312792:
                    if (C0912.m55833()) {
                        iM55979 = C0946.m55979("ۖۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25937)) ^ 256991950;
                        i5 = 999358798;
                    } else {
                        iM55979 = C0873.m55680("ۛۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7415) ^ (-216908178);
                        i5 = -1146965650;
                    }
                    break;
                case -763093271:
                case 512364780:
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("ۖۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25937)) ^ 256991950;
                        i5 = 999358798;
                    } else {
                        iM55979 = C0873.m55680("ܰܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-629)) ^ (-175101259);
                        i5 = -417851557;
                    }
                    break;
                case 278791186:
                case 1550519113:
                    if (RunnableC1014.m56177()) {
                        iM55979 = C0873.m55680("ܽ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31345) ^ (-1061796508);
                        i5 = 1083464517;
                    } else {
                        iM55979 = C0946.m55979("ۖۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25937)) ^ 256991950;
                        i5 = 999358798;
                    }
                    break;
                case 546332233:
                case 1603148081:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("ᩳ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29535)) ^ (-506838247);
                        i5 = -435026911;
                    } else {
                        iM55979 = C0873.m55680("۬ۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10077)) ^ 2100558036;
                        i5 = 595090246;
                    }
                    break;
                case 1093622049:
                case 1714388824:
                    this.f34264 = z;
                    return;
                default:
                    ViewOnClickListenerC0939.m55941();
                    iM55979 = (C0946.m55979("֫᩸") + i3) * (-9);
                    i4 = ((iM55979 ^ i2) * 13623) ^ (-742670858);
                    i5 = 745308425;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28261(C13596 c13596) {
        int i = -2122421883;
        int i2 = RunnableC0938.f81886;
        int i3 = C0906.f81862;
        int iM55979 = C0946.m55979("ܺᩴ") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-30451)) ^ (-1979924237);
        int i5 = 700508053;
        while (true) {
            i = ((((i ^ i2) * 9081) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2081623700:
                case 1599587973:
                    RunnableC0938.m55938();
                    C0992.m56107();
                    break;
                case -2033669180:
                case -1084474616:
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("۠᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * 753) ^ (-1510122577);
                        i5 = 1746335538;
                    } else {
                        iM55979 = (C0946.m55979("۟᩷") + i3) * 29;
                        i4 = ((iM55979 ^ i2) * 26577) ^ (-586449366);
                        i5 = -1848251565;
                    }
                    break;
                case -2011677054:
                case 1940381983:
                    if (C0917.m55854()) {
                        iM55979 = C0946.m55979("ۖ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 3007) ^ 1682469481;
                        i5 = 1785241245;
                    } else {
                        iM55979 = (C0873.m55680("ۗ۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * (-28891)) ^ 255095892;
                        i5 = -1991599593;
                    }
                    break;
                case -1850752415:
                case -299310434:
                    C0992.m56107();
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("᩺ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29603) ^ (-1617294744);
                        i5 = 1455889608;
                    } else {
                        iM55979 = (C0873.m55680("ۗ۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * (-28891)) ^ 255095892;
                        i5 = -1991599593;
                    }
                    break;
                case -1279500960:
                case -983502212:
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0946.m55979("ۨ۠") ^ i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 14051) ^ (-1522698085);
                        i5 = -1968633475;
                    } else {
                        iM55979 = C0873.m55680("ܿ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6829) ^ (-533541884);
                        i5 = -25213259;
                    }
                    break;
                case -1085292655:
                case -838755733:
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0873.m55680("ۗ۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * (-28891)) ^ 255095892;
                        i5 = -1991599593;
                    } else {
                        iM55979 = C0873.m55680("᩹ܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-24181)) ^ 182093545;
                        i5 = 435739253;
                    }
                    break;
                case -880950045:
                case 1170352164:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("ۨ۠") ^ i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 14051) ^ (-1522698085);
                        i5 = -1968633475;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۡܶ")) * (-119);
                        i4 = ((iM55979 ^ i3) * 13313) ^ 293256082;
                        i5 = 372214926;
                    }
                    break;
                case -791924967:
                case 360907687:
                    if (C1017.m56187() <= 0) {
                        iM55979 = (C0946.m55979("ۨ۠") ^ i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 14051) ^ (-1522698085);
                        i5 = -1968633475;
                    } else {
                        iM55979 = C0873.m55680("᩹ۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2299) ^ (-2129464208);
                        i5 = 783244228;
                    }
                    break;
                case -781938210:
                case 531289452:
                    if (C1024.f81946) {
                        iM55979 = C0946.m55979("۠᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * 753) ^ (-1510122577);
                        i5 = 1746335538;
                    } else {
                        iM55979 = C0873.m55680("ۤܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32665)) ^ 1710339581;
                        i5 = -1739420742;
                    }
                    break;
                case -348632173:
                case 475539825:
                    setImageDrawable(c13596.m30927());
                    break;
                case -104033981:
                case 224162984:
                    C0930.m55885();
                    C1964.m56597();
                    iM55979 = (C0873.m55680("ۗ۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM55979 ^ i3) * (-28891)) ^ 255095892;
                    i5 = -1991599593;
                    break;
                case -101333118:
                case 1322152390:
                    C0912.m55833();
                    if (C1036.f81953 < 0) {
                        iM55979 = (C0946.m55979("ۨ۠") ^ i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 14051) ^ (-1522698085);
                        i5 = -1968633475;
                    } else {
                        iM55979 = C0946.m55979("᩶ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31391)) ^ 895052448;
                        i5 = 1092819467;
                    }
                    break;
                case -33096038:
                case 1872526878:
                    this.f34263 = c13596;
                    if (C0861.f81831) {
                        iM55979 = (C0946.m55979("ۚ۬") ^ i3) * 89;
                        i4 = ((iM55979 ^ i2) * 8959) ^ 1812603431;
                        i5 = -977918368;
                    } else {
                        iM55979 = C0946.m55979("۠᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * 753) ^ (-1510122577);
                        i5 = 1746335538;
                    }
                    break;
                case 658603357:
                case 928702792:
                    if (RunnableC0897.f81856) {
                        iM55979 = (i3 - C0946.m55979("ۢ᩶")) * 73;
                        i4 = ((iM55979 ^ i2) * (-30315)) ^ 1691163639;
                        i5 = 972792278;
                    } else {
                        iM55979 = C0946.m55979("۠᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * 753) ^ (-1510122577);
                        i5 = 1746335538;
                    }
                    break;
                case 961950035:
                case 1593018679:
                    if (C0898.m55800() <= 0) {
                        iM55979 = (C0873.m55680("ۗ۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55979 ^ i3) * (-28891)) ^ 255095892;
                        i5 = -1991599593;
                    } else {
                        iM55979 = C0946.m55979("ۘ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 21659) ^ (-1580169968);
                        i5 = 1082627571;
                    }
                    break;
                default:
                    if (!C0861.m55626()) {
                        iM55979 = C0946.m55979("᩶ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31391)) ^ 895052448;
                        i5 = 1092819467;
                    } else {
                        iM55979 = C0946.m55979("᩺ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29603) ^ (-1617294744);
                        i5 = 1455889608;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12255(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        int i2 = -1220593740;
        int i3 = RunnableC0871.f81839;
        int i4 = C1046.f81962;
        int iM55680 = C0873.m55680("ۤۚ") ^ i4;
        int i5 = ((iM55680 ^ i3) * 2337) ^ 1046595650;
        int i6 = 1118408401;
        while (true) {
            i2 = (iM55680 ^ i6) ^ (i5 & (((i2 ^ i3) * 29305) >> 31));
            switch (i2) {
                case -1956977176:
                case 689912635:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (i3 - C0873.m55680("ܽܶ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55680 ^ i4) * (-13213)) ^ 970107907;
                        i6 = -985633768;
                    } else {
                        iM55680 = (C0946.m55979("֨ᩳ") + i3) * (-35);
                        i5 = ((iM55680 ^ i4) * (-9685)) ^ 2056734874;
                        i6 = 1512834994;
                    }
                    break;
                case -1742105149:
                case -303109462:
                    if (C1012.f81938 < 0) {
                        iM55680 = (C0873.m55680("֫ܳ") + i4) * (-11);
                        i5 = ((iM55680 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    } else {
                        iM55680 = C0873.m55680("ۙۘ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-8803)) ^ (-613990088);
                        i6 = 597134900;
                    }
                    break;
                case -1720324404:
                case 959670354:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0946.m55979("֨ܶ") ^ i4) * 89;
                        i5 = ((iM55680 ^ i3) * 6415) ^ (-224010502);
                        i6 = -762974790;
                    } else {
                        iM55680 = (C0873.m55680("ᩴᩴ") ^ i4) * (-17);
                        i5 = ((iM55680 ^ i3) * (-30151)) ^ 1895855390;
                        i6 = 1108512362;
                    }
                    break;
                case -1712833675:
                case 1137104122:
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ۤ֫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 3863) ^ 822701500;
                        i6 = -483632359;
                    } else {
                        iM55680 = (C0946.m55979("ۨ֫") ^ i4) * (-111);
                        i5 = ((iM55680 ^ i3) * 15627) ^ (-448658928);
                        i6 = -1286451442;
                    }
                    break;
                case -1707958285:
                case -109725701:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0946.m55979("ۨ֫") ^ i4) * (-111);
                        i5 = ((iM55680 ^ i3) * 15627) ^ (-448658928);
                        i6 = -1286451442;
                    } else {
                        iM55680 = (C0873.m55680("֫ܳ") + i4) * (-11);
                        i5 = ((iM55680 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    }
                    break;
                case -1470336032:
                case -1022755235:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = (C0946.m55979("֨ܶ") ^ i4) * 89;
                        i5 = ((iM55680 ^ i3) * 6415) ^ (-224010502);
                        i6 = -762974790;
                    } else {
                        iM55680 = (C0873.m55680("۫᩸") ^ i4) * 73;
                        i5 = ((iM55680 ^ i3) * 10361) ^ (-1379065342);
                        i6 = -55993376;
                    }
                    break;
                case -1300426048:
                case 1720126979:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0946.m55979("֨ܶ") ^ i4) * 89;
                        i5 = ((iM55680 ^ i3) * 6415) ^ (-224010502);
                        i6 = -762974790;
                    } else {
                        iM55680 = C0873.m55680("ܰ۫") ^ i4;
                        i5 = ((iM55680 ^ i3) * 23465) ^ (-1273480342);
                        i6 = 1821221286;
                    }
                    break;
                case -1228080198:
                case 381068718:
                    RunnableC1014.m56177();
                    throw new RuntimeException();
                case -1167283580:
                case 1126859943:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (i3 - C0873.m55680("ܽܶ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM55680 ^ i4) * (-13213)) ^ 970107907;
                        i6 = -985633768;
                    } else {
                        iM55680 = (C0873.m55680("֫ܳ") + i4) * (-11);
                        i5 = ((iM55680 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    }
                    break;
                case -623675476:
                case -583630209:
                    if (C0917.f81868) {
                        iM55680 = (C0873.m55680("֫ܳ") + i4) * (-11);
                        i5 = ((iM55680 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    } else {
                        iM55680 = C0873.m55680("ᩳ֫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 3985) ^ (-1624810738);
                        i6 = -1597264283;
                    }
                    break;
                case -580147116:
                case 2060943345:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("ۨ֫") ^ i4) * (-111);
                        i5 = ((iM55680 ^ i3) * 15627) ^ (-448658928);
                        i6 = -1286451442;
                    } else {
                        iM55680 = C0873.m55680("ᩴܽ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 15263) ^ (-996632164);
                        i6 = 730191398;
                    }
                    break;
                case -564930366:
                case 1834217237:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0946.m55979("֨ܶ") ^ i4) * 89;
                        i5 = ((iM55680 ^ i3) * 6415) ^ (-224010502);
                        i6 = -762974790;
                    } else {
                        iM55680 = C0946.m55979("ᩳۛ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-31875)) ^ 146732307;
                        i6 = -1946410480;
                    }
                    break;
                case 111091090:
                case 1062895606:
                    C1124.m56367();
                    C0894.m55769();
                    iM55680 = (C0873.m55680("֫ܳ") + i4) * (-11);
                    i5 = ((iM55680 ^ i3) * (-15019)) ^ (-753639024);
                    i6 = -209549983;
                    break;
                case 341886976:
                case 1410226044:
                    z = false;
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0873.m55680("֫ܳ") + i4) * (-11);
                        i5 = ((iM55680 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    } else {
                        iM55680 = (C0873.m55680("ۚۢ") ^ i4) * 89;
                        i5 = ((iM55680 ^ i3) * (-26927)) ^ (-101435413);
                        i6 = -1599272449;
                    }
                    break;
                case 843739899:
                case 977591994:
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0873.m55680("֫ܳ") + i4) * (-11);
                        i5 = ((iM55680 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    } else {
                        iM55680 = (C0946.m55979("ۙۧ") ^ i3) * 3;
                        i5 = ((iM55680 ^ i4) * (-30485)) ^ 2054277595;
                        i6 = 329430337;
                    }
                    break;
                default:
                    this.f34264 = z;
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m28263() {
        setImageDrawable(this.f34263.m30927());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c2 A[PHI: r0
      0x00c2: PHI (r0v5 int) = (r0v4 int), (r0v2 int), (r0v2 int) binds: [B:34:0x00c0, B:30:0x009f, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x016e A[PHI: r7
      0x016e: PHI (r7v8 android.graphics.Paint) = 
      (r7v4 android.graphics.Paint)
      (r7v7 android.graphics.Paint)
      (r7v4 android.graphics.Paint)
      (r7v4 android.graphics.Paint)
     binds: [B:52:0x016c, B:26:0x0083, B:16:0x0055, B:13:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e5  */
    /* JADX INFO: renamed from: ֫ */
    public final void m28262(boolean z) {
        int iM55680;
        int i;
        int iM55821 = 0;
        int i2 = 176707628;
        int i3 = RunnableC0871.f81839;
        int i4 = C1071.f81975;
        int iM55979 = (C0946.m55979("۬᩵") ^ i4) * (-119);
        int i5 = ((iM55979 ^ i3) * 20429) ^ 1382509645;
        int i6 = -1634046117;
        while (true) {
            int i7 = iM55979 ^ i6;
            Paint paint = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-20495)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2004722911:
                    case 1617340106:
                        if (C1048.f81963) {
                            iM55680 = (C0873.m55680("ۘۡ") + i3) * 31;
                            i5 = ((iM55680 ^ i4) * (-15163)) ^ (-1239945508);
                            i = -982251453;
                        } else {
                            iM55680 = C0873.m55680("᩸ۖ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 31869) ^ 1582222763;
                            i = 929718090;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1917180978:
                    case 356019708:
                        paint.setStyle(Paint.Style.FILL);
                        iM55680 = (i3 - C0873.m55680("᩵ۡ")) * 57;
                        i5 = ((iM55680 ^ i4) * (-5601)) ^ (-1903425765);
                        i = 218789578;
                        i7 = iM55680 ^ i;
                        break;
                    case -1410338158:
                    case 299023060:
                        if (C0882.m55710() == 0) {
                            iM55680 = (C0946.m55979("ۛܿ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i5 = ((iM55680 ^ i4) * 1275) ^ 1215089637;
                            i = -166693973;
                        } else {
                            iM55680 = (C0946.m55979("᩸ۙ") + i4) * (-75);
                            i5 = ((iM55680 ^ i3) * (-5731)) ^ (-2125870925);
                            i = 1868931416;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -1404518420:
                    case -915998451:
                        C1404.m56468();
                        C1003.m56123();
                        iM55680 = (C0946.m55979("ۛܿ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM55680 ^ i4) * 1275) ^ 1215089637;
                        i = -166693973;
                        i7 = iM55680 ^ i;
                        break;
                    case -988478647:
                    case -620110509:
                        if (!AbstractC0942.m55971()) {
                            paint = new Paint(1);
                            this.f34261 = paint;
                            if (C0912.m55833()) {
                                iM55680 = (C0946.m55979("᩸ۙ") + i4) * (-75);
                                i5 = ((iM55680 ^ i3) * (-5731)) ^ (-2125870925);
                                i = 1868931416;
                            } else {
                                iM55680 = C0873.m55680("ܰܺ") ^ i3;
                                i5 = ((iM55680 ^ i4) * 4339) ^ 242342637;
                                i = 339819115;
                            }
                            i7 = iM55680 ^ i;
                        }
                        break;
                    case -819746689:
                    case 1625977867:
                        if (C1124.f82007 >= 0) {
                            iM55680 = C0873.m55680("᩸ۖ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 31869) ^ 1582222763;
                            i = 929718090;
                        } else {
                            iM55680 = C0873.m55680("᩻ۧ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-24739)) ^ 332641332;
                            i = 1483838330;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -724673445:
                    case 1742869186:
                        if (C1046.f81962 <= 0) {
                            iM55680 = C0873.m55680("᩸ۖ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 31869) ^ 1582222763;
                            i = 929718090;
                        } else {
                            iM55680 = C0873.m55680("ۙۗ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-8717)) ^ 1115038817;
                            i = -2087394398;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -549172968:
                    case 2061263735:
                        if (this.f34262 == 0) {
                            iM55680 = C0873.m55680("۬۫") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-19257)) ^ 1954770743;
                            i = 1032232646;
                        } else {
                            iM55680 = (i3 - C0873.m55680("᩵ۡ")) * 57;
                            i5 = ((iM55680 ^ i4) * (-5601)) ^ (-1903425765);
                            i = 218789578;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case -261511887:
                    case 443533075:
                        if (C0912.f81867 > 0) {
                            iM55680 = (C0946.m55979("۫۟") ^ i4) * (-107);
                            i5 = ((iM55680 ^ i3) * (-9123)) ^ (-1994571213);
                            i = -76258313;
                            i7 = iM55680 ^ i;
                        }
                        break;
                    case 244100712:
                    case 715889276:
                        C0882.m55710();
                        C0947.m55997();
                        break;
                    case 252822078:
                    case 457022841:
                        iM55821 = C0906.m55821(2.5f);
                        if (C0967.f81910 >= 0) {
                            iM55680 = (C0873.m55680("ܿ᩵") + i3) * (-93);
                            i5 = ((iM55680 ^ i4) * 29993) ^ 438028358;
                            i = 371408961;
                        } else {
                            iM55680 = C0873.m55680("ۢۙ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 27397) ^ (-1992822302);
                            i = -1198287702;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 299856207:
                    case 1164557953:
                        C0873.m55688(this);
                        break;
                    case 423339566:
                    case 1194090863:
                        if (C0917.f81868) {
                            iM55680 = (C0946.m55979("᩸ۙ") + i4) * (-75);
                            i5 = ((iM55680 ^ i3) * (-5731)) ^ (-2125870925);
                            i = 1868931416;
                        } else {
                            iM55680 = C0873.m55680("᩸ۖ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 31869) ^ 1582222763;
                            i = 929718090;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 560510770:
                    case 1316486248:
                        this.f34262 = iM55821;
                        if (C0992.f81922 >= 0) {
                            iM55680 = (C0873.m55680("ܿ᩵") + i3) * (-93);
                            i5 = ((iM55680 ^ i4) * 29993) ^ 438028358;
                            i = 371408961;
                        } else {
                            iM55680 = (C0873.m55680("۠ۡ") ^ i4) * (-121);
                            i5 = ((iM55680 ^ i3) * (-11211)) ^ (-792790894);
                            i = 1955508622;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 660255980:
                    case 821000240:
                        if (C1404.m56468()) {
                            iM55680 = C0873.m55680("᩸ۖ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 31869) ^ 1582222763;
                            i = 929718090;
                        } else {
                            iM55680 = (C0873.m55680("ܿ᩵") + i3) * (-93);
                            i5 = ((iM55680 ^ i4) * 29993) ^ 438028358;
                            i = 371408961;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 1431906374:
                    case 1582063122:
                        if (C1048.f81963) {
                            iM55680 = (i3 - C0946.m55979("ۢܺ")) * (-7);
                            i5 = ((iM55680 ^ i4) * (-24343)) ^ 459975214;
                            i = 518804996;
                        } else {
                            iM55680 = (C0946.m55979("᩸ۙ") + i4) * (-75);
                            i5 = ((iM55680 ^ i3) * (-5731)) ^ (-2125870925);
                            i = 1868931416;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    case 1666328693:
                    case 2127132278:
                        if (C0989.m56095() <= 0) {
                            iM55680 = (C0946.m55979("ۛܿ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i5 = ((iM55680 ^ i4) * 1275) ^ 1215089637;
                            i = -166693973;
                        } else {
                            iM55680 = C0873.m55680("ᩴۡ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-17201)) ^ (-656293814);
                            i = 1944177771;
                        }
                        i7 = iM55680 ^ i;
                        break;
                    default:
                        this.f34264 = z;
                        if (z) {
                            iM55680 = (C0873.m55680("ܰۢ") ^ i4) * (-57);
                            i5 = ((iM55680 ^ i3) * 9831) ^ (-1645520936);
                            i = 445882601;
                        } else {
                            iM55680 = (i3 - C0873.m55680("᩵ۡ")) * 57;
                            i5 = ((iM55680 ^ i4) * (-5601)) ^ (-1903425765);
                            i = 218789578;
                        }
                        i7 = iM55680 ^ i;
                        break;
                }
                return;
            }
            iM55979 = (i3 - C0946.m55979("ۛ۬")) * 19;
            i5 = ((iM55979 ^ i4) * 7973) ^ (-665774626);
            i6 = 1257833590;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0156 A[PHI: r6 r7 r10 r11 r16 r17
      0x0156: PHI (r6v4 float) = (r6v3 float), (r6v2 float), (r6v2 float) binds: [B:40:0x0154, B:28:0x00e1, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r7v4 android.graphics.Paint) = (r7v3 android.graphics.Paint), (r7v2 android.graphics.Paint), (r7v2 android.graphics.Paint) binds: [B:40:0x0154, B:28:0x00e1, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r10v4 float) = (r10v2 float), (r10v3 float), (r10v2 float) binds: [B:40:0x0154, B:28:0x00e1, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r11v4 android.graphics.Paint) = (r11v2 android.graphics.Paint), (r11v3 android.graphics.Paint), (r11v2 android.graphics.Paint) binds: [B:40:0x0154, B:28:0x00e1, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r16v18 int) = (r16v7 int), (r16v11 int), (r16v21 int) binds: [B:40:0x0154, B:28:0x00e1, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r17v18 android.graphics.Paint) = (r17v7 android.graphics.Paint), (r17v11 android.graphics.Paint), (r17v21 android.graphics.Paint) binds: [B:40:0x0154, B:28:0x00e1, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b6 A[PHI: r4 r5 r16 r17
      0x01b6: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:48:0x01b4, B:44:0x0190, B:10:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:48:0x01b4, B:44:0x0190, B:10:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r16v19 int) = (r16v5 int), (r16v6 int), (r16v20 int) binds: [B:48:0x01b4, B:44:0x0190, B:10:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r17v19 android.graphics.Paint) = (r17v5 android.graphics.Paint), (r17v6 android.graphics.Paint), (r17v20 android.graphics.Paint) binds: [B:48:0x01b4, B:44:0x0190, B:10:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0294 A[PHI: r12 r16 r17
      0x0294: PHI (r12v4 float) = (r12v2 float), (r12v3 float), (r12v2 float) binds: [B:64:0x0292, B:24:0x00bb, B:14:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r16v16 int) = (r16v2 int), (r16v12 int), (r16v17 int) binds: [B:64:0x0292, B:24:0x00bb, B:14:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r17v16 android.graphics.Paint) = (r17v2 android.graphics.Paint), (r17v12 android.graphics.Paint), (r17v17 android.graphics.Paint) binds: [B:64:0x0292, B:24:0x00bb, B:14:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        if (p067l.C0927.f81875 != false) goto L14;
     */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        int iM55979;
        int i2;
        int i3;
        Paint paint2;
        int iM559710;
        Paint paint3;
        int i4;
        int i5;
        int i6 = RunnableC0871.f81839;
        int i7 = C1025.f81947;
        int iM559711 = (C0946.m55979("ۙᩴ") ^ i6) * 49;
        int i8 = ((iM559711 ^ i7) * (-28943)) ^ (-1185857574);
        Paint paint4 = null;
        Paint paint5 = null;
        int i9 = iM559711 ^ (-724246982);
        Paint paint6 = null;
        int i10 = 0;
        int iM55594 = 0;
        int i11 = 0;
        float f = 0.0f;
        float strokeWidth = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float strokeWidth2 = 0.0f;
        int i12 = 238654881;
        while (true) {
            int i13 = i9 ^ (i8 & (((i12 ^ i7) * (-15229)) >> 31));
            switch (i13) {
                case -2040176685:
                case -555501647:
                    paint = paint6;
                    i = i13;
                    f = i11;
                    paint4 = this.f34261;
                    if (C0861.m55626()) {
                        iM55979 = C0946.m55979("ۚ֨") ^ i7;
                        i2 = ((iM55979 ^ i6) * 4711) ^ (-195061468);
                        i3 = 176943955;
                    } else {
                        iM55979 = (C0946.m55979("ܺ֫") ^ i6) * 127;
                        i2 = ((iM55979 ^ i7) * 25409) ^ 105152140;
                        i3 = -2018761423;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -1820476845:
                case -1520280480:
                    C1025.m56230();
                    if (C1229.f82066 < 0) {
                        paint = paint6;
                        i = i13;
                        iM55979 = C0946.m55979("᩷ۤ") ^ i6;
                        i2 = ((iM55979 ^ i7) * 16625) ^ 79479365;
                        i3 = -1175487471;
                        paint6 = paint;
                        i5 = i;
                        i9 = iM55979 ^ i3;
                        i8 = i2;
                        i12 = i5;
                    }
                    paint = paint6;
                    i = i13;
                    iM55979 = (i7 - C0946.m55979("᩹᩷")) * (-53);
                    i2 = ((iM55979 ^ i6) * (-14251)) ^ (-526034259);
                    i3 = -170925445;
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -1789142690:
                case 719360545:
                    C0937.m55918();
                    C1229.m56410();
                    break;
                case -1632239702:
                case -174461204:
                    paint = paint6;
                    i = i13;
                    strokeWidth2 = paint5.getStrokeWidth() + f3;
                    if (C1044.m56286() <= 0) {
                        iM55979 = (i7 - C0946.m55979("᩹᩷")) * (-53);
                        i2 = ((iM55979 ^ i6) * (-14251)) ^ (-526034259);
                        i3 = -170925445;
                    } else {
                        iM55979 = C0946.m55979("ۨ۠") ^ i7;
                        i2 = ((iM55979 ^ i6) * 23425) ^ 173912584;
                        i3 = 65038122;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -1378182418:
                case 363376029:
                    paint = paint6;
                    i = i13;
                    if (C1929.f83011 != 0) {
                        iM55979 = (i7 - C0946.m55979("᩹᩷")) * (-53);
                        i2 = ((iM55979 ^ i6) * (-14251)) ^ (-526034259);
                        i3 = -170925445;
                    } else {
                        iM55979 = (C0946.m55979("ۙ֡") + i7) * 87;
                        i2 = ((iM55979 ^ i6) * (-10865)) ^ 141000102;
                        i3 = 1229116991;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -831392527:
                case 885355637:
                    paint = paint6;
                    i = i13;
                    iM55594 = C0854.m55594(this);
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("᩸ᩴ") ^ i6;
                        i2 = ((iM55979 ^ i7) * 7991) ^ (-1021846303);
                        i3 = 176491264;
                    } else {
                        iM55979 = (i7 - C0946.m55979("ۘ۬")) * 55;
                        i2 = ((iM55979 ^ i6) * 20771) ^ (-1702450624);
                        i3 = -1729593869;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -551664896:
                case -32708432:
                    C0947.m55997();
                    break;
                case -530425106:
                case 1227295459:
                    C1044.m56286();
                    if (C1044.m56286() > 0) {
                        paint = paint6;
                        i = i13;
                        iM55979 = C0946.m55979("ۚ֨") ^ i7;
                        i2 = ((iM55979 ^ i6) * 4711) ^ (-195061468);
                        i3 = 176943955;
                        paint6 = paint;
                        i5 = i;
                        i9 = iM55979 ^ i3;
                        i8 = i2;
                        i12 = i5;
                    }
                    paint = paint6;
                    i = i13;
                    iM55979 = C0873.m55680("᩸ᩴ") ^ i6;
                    i2 = ((iM55979 ^ i7) * 7991) ^ (-1021846303);
                    i3 = 176491264;
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -465710637:
                case 290581136:
                    paint = paint6;
                    i = i13;
                    strokeWidth = paint4.getStrokeWidth();
                    if (C1024.f81946) {
                        iM55979 = C0946.m55979("᩷ۤ") ^ i6;
                        i2 = ((iM55979 ^ i7) * 16625) ^ 79479365;
                        i3 = -1175487471;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ܺܺ")) * 57;
                        i2 = ((iM55979 ^ i7) * (-29823)) ^ (-1576934342);
                        i3 = 9077229;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -437609987:
                case 1468837546:
                    paint2 = paint6;
                    i = i13;
                    paint2.setColor(i10);
                    if (C1404.f82149 < 0) {
                        paint = paint2;
                        iM55979 = C0873.m55680("ۡۜ") ^ i6;
                        i2 = ((iM55979 ^ i7) * (-25085)) ^ (-2090592881);
                        i3 = -1388423231;
                        paint6 = paint;
                        i5 = i;
                        i9 = iM55979 ^ i3;
                        i8 = i2;
                        i12 = i5;
                    }
                    iM559710 = C0946.m55979("ܿۙ") ^ i7;
                    paint3 = paint2;
                    i8 = ((iM559710 ^ i6) * (-7555)) ^ 2110050389;
                    i4 = -1113576332;
                    paint6 = paint3;
                    i5 = i;
                    i9 = iM559710 ^ i4;
                    i12 = i5;
                    break;
                case -243467863:
                case 538425587:
                    C0946.m55980();
                    C1046.m56302();
                    paint = paint6;
                    i = i13;
                    iM55979 = (i7 - C0946.m55979("᩹᩷")) * (-53);
                    i2 = ((iM55979 ^ i6) * (-14251)) ^ (-526034259);
                    i3 = -170925445;
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -171201842:
                case 1464620438:
                    paint = paint6;
                    i = i13;
                    f3 = this.f34262;
                    paint5 = this.f34261;
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("ۚ֨") ^ i7;
                        i2 = ((iM55979 ^ i6) * 4711) ^ (-195061468);
                        i3 = 176943955;
                    } else {
                        iM55979 = C0873.m55680("᩺᩺") ^ i6;
                        i2 = ((iM55979 ^ i7) * 26947) ^ (-2036828992);
                        i3 = 122507077;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -144213441:
                case 1841075597:
                    i = i13;
                    paint = paint6;
                    canvas.drawCircle(f2, strokeWidth2, this.f34262, this.f34261);
                    iM55979 = C0873.m55680("ۜܿ") ^ i6;
                    i2 = ((iM55979 ^ i7) * 19183) ^ 1819452788;
                    i3 = -923066725;
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -115276612:
                case 269739372:
                    paint = paint6;
                    i = i13;
                    i11 = iM55594 - this.f34262;
                    if (C0946.m55980() != 0) {
                        iM55979 = C0873.m55680("᩸ᩴ") ^ i6;
                        i2 = ((iM55979 ^ i7) * 7991) ^ (-1021846303);
                        i3 = 176491264;
                    } else {
                        iM55979 = C0946.m55979("ᩳܳ") ^ i7;
                        i2 = ((iM55979 ^ i6) * (-20649)) ^ 1576024620;
                        i3 = 711413116;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case 39397690:
                case 1214443866:
                    paint = paint6;
                    i = i13;
                    f2 = f - strokeWidth;
                    if (C0877.f81843 < 0) {
                        iM55979 = C0873.m55680("ܺ۫") ^ i7;
                        i2 = ((iM55979 ^ i6) * 32301) ^ 320720431;
                        i3 = -1546947958;
                        paint6 = paint;
                        i5 = i;
                        i9 = iM55979 ^ i3;
                        i8 = i2;
                        i12 = i5;
                    } else {
                        paint2 = paint;
                        iM559710 = C0946.m55979("ܿۙ") ^ i7;
                        paint3 = paint2;
                        i8 = ((iM559710 ^ i6) * (-7555)) ^ 2110050389;
                        i4 = -1113576332;
                        paint6 = paint3;
                        i5 = i;
                        i9 = iM559710 ^ i4;
                        i12 = i5;
                    }
                    break;
                case 1358969559:
                case 1820882156:
                    break;
                case 1395532636:
                case 2043125006:
                    paint = paint6;
                    i = i13;
                    super.onDraw(canvas);
                    if (this.f34264) {
                        iM55979 = (C0946.m55979("᩸᩻") + i7) * 61;
                        i2 = ((iM55979 ^ i6) * (-5649)) ^ (-623627492);
                        i3 = -1127543455;
                    } else {
                        iM55979 = C0873.m55680("ۜܿ") ^ i6;
                        i2 = ((iM55979 ^ i7) * 19183) ^ 1819452788;
                        i3 = -923066725;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM55979 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                default:
                    i = i13;
                    Paint paint7 = this.f34261;
                    i10 = C23223.f73004;
                    if (RunnableC1014.f81941 > 0) {
                        iM559710 = (C0873.m55680("᩸ܿ") + i6) * (-83);
                        paint3 = paint7;
                        i8 = ((iM559710 ^ i7) * (-29169)) ^ (-324136310);
                        i4 = -137027261;
                        paint6 = paint3;
                        i5 = i;
                        i9 = iM559710 ^ i4;
                        i12 = i5;
                    } else {
                        paint = paint7;
                        iM55979 = C0946.m55979("᩷ۤ") ^ i6;
                        i2 = ((iM55979 ^ i7) * 16625) ^ 79479365;
                        i3 = -1175487471;
                        paint6 = paint;
                        i5 = i;
                        i9 = iM55979 ^ i3;
                        i8 = i2;
                        i12 = i5;
                    }
                    break;
            }
            return;
        }
    }
}
