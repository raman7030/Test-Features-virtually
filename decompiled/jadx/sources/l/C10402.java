package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 4651 */
/* JADX INFO: loaded from: classes3.dex */
public class C10402 extends C17939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Paint f31296;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31297;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C11813 f31298;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f31299;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10402(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        int i = 1610616547;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C4616.f14690;
        int iM6981 = C2105.m6981("۫۠") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-1263)) ^ 833077556;
        int i5 = 1363356303;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i2) * (-26905)) >> 31));
            switch (i) {
                case -1940198600:
                case 182896863:
                    ServiceConnectionC3453.m10564();
                    if (!C0964.m3413()) {
                        iM6981 = (C2105.m6981("֫᩸") + i3) * (-9);
                        i4 = ((iM6981 ^ i2) * 13623) ^ (-742670858);
                        i5 = 745308425;
                    } else {
                        iM6981 = C0630.m2566("ܳᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31233)) ^ (-505371448);
                        i5 = -228003097;
                    }
                    break;
                case -1892512094:
                case 318574425:
                    C2958.m9034();
                    C1047.m3599();
                    throw new RuntimeException();
                case -1659259697:
                case -191316218:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C2105.m6981("ۖۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25937)) ^ 256991950;
                        i5 = 999358798;
                    } else {
                        iM6981 = C2105.m6981("᩻᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-32443)) ^ 1754788683;
                        i5 = -1331711655;
                    }
                    break;
                case -1580129905:
                case 1386537537:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (i2 - C0630.m2566("ᩴۙ")) * 27;
                        i4 = ((iM6981 ^ i3) * (-23825)) ^ 1436352175;
                        i5 = 1047061057;
                    } else {
                        iM6981 = C2105.m6981("ۢ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27819) ^ 2019624720;
                        i5 = 1910901931;
                    }
                    break;
                case -1474952165:
                case 2012752154:
                    z = false;
                    if (C3911.m11924() <= 0) {
                        iM6981 = C2105.m6981("ۖۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25937)) ^ 256991950;
                        i5 = 999358798;
                    } else {
                        iM6981 = C2105.m6981("ܳۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27805) ^ (-1538089789);
                        i5 = -140828204;
                    }
                    break;
                case -1398512991:
                case -724314746:
                    C4159.m12565();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (i2 - C0630.m2566("ᩴۙ")) * 27;
                        i4 = ((iM6981 ^ i3) * (-23825)) ^ 1436352175;
                        i5 = 1047061057;
                    } else {
                        iM6981 = (C2105.m6981("֫᩸") + i3) * (-9);
                        i4 = ((iM6981 ^ i2) * 13623) ^ (-742670858);
                        i5 = 745308425;
                    }
                    break;
                case -1340117972:
                case 489293128:
                    if (C4117.f13076 > 0) {
                        iM6981 = C2105.m6981("ᩳ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29535)) ^ (-506838247);
                        i5 = -435026911;
                    } else {
                        iM6981 = (C2105.m6981("֫᩸") + i3) * (-9);
                        i4 = ((iM6981 ^ i2) * 13623) ^ (-742670858);
                        i5 = 745308425;
                    }
                    break;
                case -1254447519:
                case 1465716258:
                    if (C1916.f6442) {
                        iM6981 = C2105.m6981("ۛ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14067)) ^ (-1197672540);
                        i5 = -865647163;
                    } else {
                        iM6981 = C2105.m6981("ᩳ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29535)) ^ (-506838247);
                        i5 = -435026911;
                    }
                    break;
                case -1046270060:
                case -981893996:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("ܳᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31233)) ^ (-505371448);
                        i5 = -228003097;
                    } else {
                        iM6981 = (C2105.m6981("ۤ᩷") ^ i2) * (-107);
                        i4 = ((iM6981 ^ i3) * (-7441)) ^ (-122485121);
                        i5 = 1427217936;
                    }
                    break;
                case -925014089:
                case 460075692:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("ᩳ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29535)) ^ (-506838247);
                        i5 = -435026911;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۠ܶ")) * 109;
                        i4 = ((iM6981 ^ i2) * 11597) ^ (-519945553);
                        i5 = -1356588597;
                    }
                    break;
                case -812682419:
                case 2060312792:
                    if (C1420.m4913()) {
                        iM6981 = C2105.m6981("ۖۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25937)) ^ 256991950;
                        i5 = 999358798;
                    } else {
                        iM6981 = C0630.m2566("ۛۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 7415) ^ (-216908178);
                        i5 = -1146965650;
                    }
                    break;
                case -763093271:
                case 512364780:
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("ۖۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25937)) ^ 256991950;
                        i5 = 999358798;
                    } else {
                        iM6981 = C0630.m2566("ܰܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-629)) ^ (-175101259);
                        i5 = -417851557;
                    }
                    break;
                case 278791186:
                case 1550519113:
                    if (RunnableC3474.m10630()) {
                        iM6981 = C0630.m2566("ܽ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31345) ^ (-1061796508);
                        i5 = 1083464517;
                    } else {
                        iM6981 = C2105.m6981("ۖۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25937)) ^ 256991950;
                        i5 = 999358798;
                    }
                    break;
                case 546332233:
                case 1603148081:
                    if (C0483.f2088 >= 0) {
                        iM6981 = C2105.m6981("ᩳ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29535)) ^ (-506838247);
                        i5 = -435026911;
                    } else {
                        iM6981 = C0630.m2566("۬ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10077)) ^ 2100558036;
                        i5 = 595090246;
                    }
                    break;
                case 1093622049:
                case 1714388824:
                    this.f31299 = z;
                    return;
                default:
                    ViewOnClickListenerC1958.m6429();
                    iM6981 = (C2105.m6981("֫᩸") + i3) * (-9);
                    i4 = ((iM6981 ^ i2) * 13623) ^ (-742670858);
                    i5 = 745308425;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26232(C11813 c11813) {
        int i = -2122421883;
        int i2 = RunnableC1937.f6483;
        int i3 = C1294.f4556;
        int iM6981 = C2105.m6981("ܺᩴ") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-30451)) ^ (-1979924237);
        int i5 = 700508053;
        while (true) {
            i = ((((i ^ i2) * 9081) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2081623700:
                case 1599587973:
                    RunnableC1937.m6387();
                    C3019.m9255();
                    break;
                case -2033669180:
                case -1084474616:
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("۠᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 753) ^ (-1510122577);
                        i5 = 1746335538;
                    } else {
                        iM6981 = (C2105.m6981("۟᩷") + i3) * 29;
                        i4 = ((iM6981 ^ i2) * 26577) ^ (-586449366);
                        i5 = -1848251565;
                    }
                    break;
                case -2011677054:
                case 1940381983:
                    if (C1504.m5179()) {
                        iM6981 = C2105.m6981("ۖ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3007) ^ 1682469481;
                        i5 = 1785241245;
                    } else {
                        iM6981 = (C0630.m2566("ۗ۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * (-28891)) ^ 255095892;
                        i5 = -1991599593;
                    }
                    break;
                case -1850752415:
                case -299310434:
                    C3019.m9255();
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("᩺ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29603) ^ (-1617294744);
                        i5 = 1455889608;
                    } else {
                        iM6981 = (C0630.m2566("ۗ۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * (-28891)) ^ 255095892;
                        i5 = -1991599593;
                    }
                    break;
                case -1279500960:
                case -983502212:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("ۨ۠") ^ i2) * (-123);
                        i4 = ((iM6981 ^ i3) * 14051) ^ (-1522698085);
                        i5 = -1968633475;
                    } else {
                        iM6981 = C0630.m2566("ܿ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 6829) ^ (-533541884);
                        i5 = -25213259;
                    }
                    break;
                case -1085292655:
                case -838755733:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C0630.m2566("ۗ۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * (-28891)) ^ 255095892;
                        i5 = -1991599593;
                    } else {
                        iM6981 = C0630.m2566("᩹ܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-24181)) ^ 182093545;
                        i5 = 435739253;
                    }
                    break;
                case -880950045:
                case 1170352164:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C2105.m6981("ۨ۠") ^ i2) * (-123);
                        i4 = ((iM6981 ^ i3) * 14051) ^ (-1522698085);
                        i5 = -1968633475;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۡܶ")) * (-119);
                        i4 = ((iM6981 ^ i3) * 13313) ^ 293256082;
                        i5 = 372214926;
                    }
                    break;
                case -791924967:
                case 360907687:
                    if (C3537.m10746() <= 0) {
                        iM6981 = (C2105.m6981("ۨ۠") ^ i2) * (-123);
                        i4 = ((iM6981 ^ i3) * 14051) ^ (-1522698085);
                        i5 = -1968633475;
                    } else {
                        iM6981 = C0630.m2566("᩹ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2299) ^ (-2129464208);
                        i5 = 783244228;
                    }
                    break;
                case -781938210:
                case 531289452:
                    if (C3663.f11553) {
                        iM6981 = C2105.m6981("۠᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 753) ^ (-1510122577);
                        i5 = 1746335538;
                    } else {
                        iM6981 = C0630.m2566("ۤܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32665)) ^ 1710339581;
                        i5 = -1739420742;
                    }
                    break;
                case -348632173:
                case 475539825:
                    setImageDrawable(c11813.m28878());
                    break;
                case -104033981:
                case 224162984:
                    C1773.m5908();
                    C22628.m50615();
                    iM6981 = (C0630.m2566("ۗ۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM6981 ^ i3) * (-28891)) ^ 255095892;
                    i5 = -1991599593;
                    break;
                case -101333118:
                case 1322152390:
                    C1420.m4913();
                    if (C3911.f12484 < 0) {
                        iM6981 = (C2105.m6981("ۨ۠") ^ i2) * (-123);
                        i4 = ((iM6981 ^ i3) * 14051) ^ (-1522698085);
                        i5 = -1968633475;
                    } else {
                        iM6981 = C2105.m6981("᩶ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31391)) ^ 895052448;
                        i5 = 1092819467;
                    }
                    break;
                case -33096038:
                case 1872526878:
                    this.f31298 = c11813;
                    if (C0382.f1805) {
                        iM6981 = (C2105.m6981("ۚ۬") ^ i3) * 89;
                        i4 = ((iM6981 ^ i2) * 8959) ^ 1812603431;
                        i5 = -977918368;
                    } else {
                        iM6981 = C2105.m6981("۠᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 753) ^ (-1510122577);
                        i5 = 1746335538;
                    }
                    break;
                case 658603357:
                case 928702792:
                    if (RunnableC1108.f4040) {
                        iM6981 = (i3 - C2105.m6981("ۢ᩶")) * 73;
                        i4 = ((iM6981 ^ i2) * (-30315)) ^ 1691163639;
                        i5 = 972792278;
                    } else {
                        iM6981 = C2105.m6981("۠᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 753) ^ (-1510122577);
                        i5 = 1746335538;
                    }
                    break;
                case 961950035:
                case 1593018679:
                    if (C1128.m3851() <= 0) {
                        iM6981 = (C0630.m2566("ۗ۟") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * (-28891)) ^ 255095892;
                        i5 = -1991599593;
                    } else {
                        iM6981 = C2105.m6981("ۘ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21659) ^ (-1580169968);
                        i5 = 1082627571;
                    }
                    break;
                default:
                    if (!C0382.m1848()) {
                        iM6981 = C2105.m6981("᩶ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31391)) ^ 895052448;
                        i5 = 1092819467;
                    } else {
                        iM6981 = C2105.m6981("᩺ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29603) ^ (-1617294744);
                        i5 = 1455889608;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10402(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        int i2 = -1220593740;
        int i3 = RunnableC0588.f2309;
        int i4 = C4117.f13076;
        int iM2566 = C0630.m2566("ۤۚ") ^ i4;
        int i5 = ((iM2566 ^ i3) * 2337) ^ 1046595650;
        int i6 = 1118408401;
        while (true) {
            i2 = (iM2566 ^ i6) ^ (i5 & (((i2 ^ i3) * 29305) >> 31));
            switch (i2) {
                case -1956977176:
                case 689912635:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ܽܶ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM2566 ^ i4) * (-13213)) ^ 970107907;
                        i6 = -985633768;
                    } else {
                        iM2566 = (C2105.m6981("֨ᩳ") + i3) * (-35);
                        i5 = ((iM2566 ^ i4) * (-9685)) ^ 2056734874;
                        i6 = 1512834994;
                    }
                    break;
                case -1742105149:
                case -303109462:
                    if (C3432.f10845 < 0) {
                        iM2566 = (C0630.m2566("֫ܳ") + i4) * (-11);
                        i5 = ((iM2566 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    } else {
                        iM2566 = C0630.m2566("ۙۘ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-8803)) ^ (-613990088);
                        i6 = 597134900;
                    }
                    break;
                case -1720324404:
                case 959670354:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C2105.m6981("֨ܶ") ^ i4) * 89;
                        i5 = ((iM2566 ^ i3) * 6415) ^ (-224010502);
                        i6 = -762974790;
                    } else {
                        iM2566 = (C0630.m2566("ᩴᩴ") ^ i4) * (-17);
                        i5 = ((iM2566 ^ i3) * (-30151)) ^ 1895855390;
                        i6 = 1108512362;
                    }
                    break;
                case -1712833675:
                case 1137104122:
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("ۤ֫") ^ i3;
                        i5 = ((iM2566 ^ i4) * 3863) ^ 822701500;
                        i6 = -483632359;
                    } else {
                        iM2566 = (C2105.m6981("ۨ֫") ^ i4) * (-111);
                        i5 = ((iM2566 ^ i3) * 15627) ^ (-448658928);
                        i6 = -1286451442;
                    }
                    break;
                case -1707958285:
                case -109725701:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("ۨ֫") ^ i4) * (-111);
                        i5 = ((iM2566 ^ i3) * 15627) ^ (-448658928);
                        i6 = -1286451442;
                    } else {
                        iM2566 = (C0630.m2566("֫ܳ") + i4) * (-11);
                        i5 = ((iM2566 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    }
                    break;
                case -1470336032:
                case -1022755235:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = (C2105.m6981("֨ܶ") ^ i4) * 89;
                        i5 = ((iM2566 ^ i3) * 6415) ^ (-224010502);
                        i6 = -762974790;
                    } else {
                        iM2566 = (C0630.m2566("۫᩸") ^ i4) * 73;
                        i5 = ((iM2566 ^ i3) * 10361) ^ (-1379065342);
                        i6 = -55993376;
                    }
                    break;
                case -1300426048:
                case 1720126979:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C2105.m6981("֨ܶ") ^ i4) * 89;
                        i5 = ((iM2566 ^ i3) * 6415) ^ (-224010502);
                        i6 = -762974790;
                    } else {
                        iM2566 = C0630.m2566("ܰ۫") ^ i4;
                        i5 = ((iM2566 ^ i3) * 23465) ^ (-1273480342);
                        i6 = 1821221286;
                    }
                    break;
                case -1228080198:
                case 381068718:
                    RunnableC3474.m10630();
                    throw new RuntimeException();
                case -1167283580:
                case 1126859943:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ܽܶ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM2566 ^ i4) * (-13213)) ^ 970107907;
                        i6 = -985633768;
                    } else {
                        iM2566 = (C0630.m2566("֫ܳ") + i4) * (-11);
                        i5 = ((iM2566 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    }
                    break;
                case -623675476:
                case -583630209:
                    if (C1504.f5354) {
                        iM2566 = (C0630.m2566("֫ܳ") + i4) * (-11);
                        i5 = ((iM2566 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    } else {
                        iM2566 = C0630.m2566("ᩳ֫") ^ i3;
                        i5 = ((iM2566 ^ i4) * 3985) ^ (-1624810738);
                        i6 = -1597264283;
                    }
                    break;
                case -580147116:
                case 2060943345:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C2105.m6981("ۨ֫") ^ i4) * (-111);
                        i5 = ((iM2566 ^ i3) * 15627) ^ (-448658928);
                        i6 = -1286451442;
                    } else {
                        iM2566 = C0630.m2566("ᩴܽ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 15263) ^ (-996632164);
                        i6 = 730191398;
                    }
                    break;
                case -564930366:
                case 1834217237:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("֨ܶ") ^ i4) * 89;
                        i5 = ((iM2566 ^ i3) * 6415) ^ (-224010502);
                        i6 = -762974790;
                    } else {
                        iM2566 = C2105.m6981("ᩳۛ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-31875)) ^ 146732307;
                        i6 = -1946410480;
                    }
                    break;
                case 111091090:
                case 1062895606:
                    C5695.m16023();
                    C1047.m3599();
                    iM2566 = (C0630.m2566("֫ܳ") + i4) * (-11);
                    i5 = ((iM2566 ^ i3) * (-15019)) ^ (-753639024);
                    i6 = -209549983;
                    break;
                case 341886976:
                case 1410226044:
                    z = false;
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C0630.m2566("֫ܳ") + i4) * (-11);
                        i5 = ((iM2566 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    } else {
                        iM2566 = (C0630.m2566("ۚۢ") ^ i4) * 89;
                        i5 = ((iM2566 ^ i3) * (-26927)) ^ (-101435413);
                        i6 = -1599272449;
                    }
                    break;
                case 843739899:
                case 977591994:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C0630.m2566("֫ܳ") + i4) * (-11);
                        i5 = ((iM2566 ^ i3) * (-15019)) ^ (-753639024);
                        i6 = -209549983;
                    } else {
                        iM2566 = (C2105.m6981("ۙۧ") ^ i3) * 3;
                        i5 = ((iM2566 ^ i4) * (-30485)) ^ 2054277595;
                        i6 = 329430337;
                    }
                    break;
                default:
                    this.f31299 = z;
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m26234() {
        setImageDrawable(this.f31298.m28878());
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26233(boolean z) {
        int iM2566;
        int i;
        int iM4384 = 0;
        int i2 = 176707628;
        int i3 = RunnableC0588.f2309;
        int i4 = C4616.f14690;
        int iM6981 = (C2105.m6981("۬᩵") ^ i4) * (-119);
        int i5 = ((iM6981 ^ i3) * 20429) ^ 1382509645;
        int i6 = -1634046117;
        while (true) {
            int i7 = iM6981 ^ i6;
            Paint paint = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-20495)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2004722911:
                    case 1617340106:
                        if (C4159.f13567) {
                            iM2566 = (C0630.m2566("ۘۡ") + i3) * 31;
                            i5 = ((iM2566 ^ i4) * (-15163)) ^ (-1239945508);
                            i = -982251453;
                        } else {
                            iM2566 = C0630.m2566("᩸ۖ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 31869) ^ 1582222763;
                            i = 929718090;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1917180978:
                    case 356019708:
                        paint.setStyle(Paint.Style.FILL);
                        iM2566 = (i3 - C0630.m2566("᩵ۡ")) * 57;
                        i5 = ((iM2566 ^ i4) * (-5601)) ^ (-1903425765);
                        i = 218789578;
                        i7 = iM2566 ^ i;
                        break;
                    case -1410338158:
                    case 299023060:
                        if (C0798.m2998() == 0) {
                            iM2566 = (C2105.m6981("ۛܿ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i5 = ((iM2566 ^ i4) * 1275) ^ 1215089637;
                            i = -166693973;
                        } else {
                            iM2566 = (C2105.m6981("᩸ۙ") + i4) * (-75);
                            i5 = ((iM2566 ^ i3) * (-5731)) ^ (-2125870925);
                            i = 1868931416;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1404518420:
                    case -915998451:
                        C11340.m28031();
                        C3245.m9925();
                        iM2566 = (C2105.m6981("ۛܿ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM2566 ^ i4) * 1275) ^ 1215089637;
                        i = -166693973;
                        i7 = iM2566 ^ i;
                        break;
                    case -988478647:
                    case -620110509:
                        if (!AbstractC2021.m6574()) {
                            paint = new Paint(1);
                            this.f31296 = paint;
                            if (C1420.m4913()) {
                                iM2566 = (C2105.m6981("᩸ۙ") + i4) * (-75);
                                i5 = ((iM2566 ^ i3) * (-5731)) ^ (-2125870925);
                                i = 1868931416;
                            } else {
                                iM2566 = C0630.m2566("ܰܺ") ^ i3;
                                i5 = ((iM2566 ^ i4) * 4339) ^ 242342637;
                                i = 339819115;
                            }
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case -819746689:
                    case 1625977867:
                        if (C5695.f17556 >= 0) {
                            iM2566 = C0630.m2566("᩸ۖ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 31869) ^ 1582222763;
                            i = 929718090;
                        } else {
                            iM2566 = C0630.m2566("᩻ۧ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-24739)) ^ 332641332;
                            i = 1483838330;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -724673445:
                    case 1742869186:
                        if (C4117.f13076 <= 0) {
                            iM2566 = C0630.m2566("᩸ۖ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 31869) ^ 1582222763;
                            i = 929718090;
                        } else {
                            iM2566 = C0630.m2566("ۙۗ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-8717)) ^ 1115038817;
                            i = -2087394398;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -549172968:
                    case 2061263735:
                        if (this.f31297 == 0) {
                            iM2566 = C0630.m2566("۬۫") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-19257)) ^ 1954770743;
                            i = 1032232646;
                        } else {
                            iM2566 = (i3 - C0630.m2566("᩵ۡ")) * 57;
                            i5 = ((iM2566 ^ i4) * (-5601)) ^ (-1903425765);
                            i = 218789578;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -261511887:
                    case 443533075:
                        if (C1420.f5096 > 0) {
                            iM2566 = (C2105.m6981("۫۟") ^ i4) * (-107);
                            i5 = ((iM2566 ^ i3) * (-9123)) ^ (-1994571213);
                            i = -76258313;
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case 244100712:
                    case 715889276:
                        C0798.m2998();
                        C2126.m7040();
                        break;
                    case 252822078:
                    case 457022841:
                        iM4384 = C1294.m4384(2.5f);
                        if (C2520.f8000 >= 0) {
                            iM2566 = (C0630.m2566("ܿ᩵") + i3) * (-93);
                            i5 = ((iM2566 ^ i4) * 29993) ^ 438028358;
                            i = 371408961;
                        } else {
                            iM2566 = C0630.m2566("ۢۙ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 27397) ^ (-1992822302);
                            i = -1198287702;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 299856207:
                    case 1164557953:
                        C0630.m2574(this);
                        break;
                    case 423339566:
                    case 1194090863:
                        if (C1504.f5354) {
                            iM2566 = (C2105.m6981("᩸ۙ") + i4) * (-75);
                            i5 = ((iM2566 ^ i3) * (-5731)) ^ (-2125870925);
                            i = 1868931416;
                        } else {
                            iM2566 = C0630.m2566("᩸ۖ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 31869) ^ 1582222763;
                            i = 929718090;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 560510770:
                    case 1316486248:
                        this.f31297 = iM4384;
                        if (C3019.f9544 >= 0) {
                            iM2566 = (C0630.m2566("ܿ᩵") + i3) * (-93);
                            i5 = ((iM2566 ^ i4) * 29993) ^ 438028358;
                            i = 371408961;
                        } else {
                            iM2566 = (C0630.m2566("۠ۡ") ^ i4) * (-121);
                            i5 = ((iM2566 ^ i3) * (-11211)) ^ (-792790894);
                            i = 1955508622;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 660255980:
                    case 821000240:
                        if (C11340.m28031()) {
                            iM2566 = C0630.m2566("᩸ۖ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 31869) ^ 1582222763;
                            i = 929718090;
                        } else {
                            iM2566 = (C0630.m2566("ܿ᩵") + i3) * (-93);
                            i5 = ((iM2566 ^ i4) * 29993) ^ 438028358;
                            i = 371408961;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 1431906374:
                    case 1582063122:
                        if (C4159.f13567) {
                            iM2566 = (i3 - C2105.m6981("ۢܺ")) * (-7);
                            i5 = ((iM2566 ^ i4) * (-24343)) ^ 459975214;
                            i = 518804996;
                        } else {
                            iM2566 = (C2105.m6981("᩸ۙ") + i4) * (-75);
                            i5 = ((iM2566 ^ i3) * (-5731)) ^ (-2125870925);
                            i = 1868931416;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 1666328693:
                    case 2127132278:
                        if (C2958.m9034() <= 0) {
                            iM2566 = (C2105.m6981("ۛܿ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i5 = ((iM2566 ^ i4) * 1275) ^ 1215089637;
                            i = -166693973;
                        } else {
                            iM2566 = C0630.m2566("ᩴۡ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-17201)) ^ (-656293814);
                            i = 1944177771;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    default:
                        this.f31299 = z;
                        if (z) {
                            iM2566 = (C0630.m2566("ܰۢ") ^ i4) * (-57);
                            i5 = ((iM2566 ^ i3) * 9831) ^ (-1645520936);
                            i = 445882601;
                        } else {
                            iM2566 = (i3 - C0630.m2566("᩵ۡ")) * 57;
                            i5 = ((iM2566 ^ i4) * (-5601)) ^ (-1903425765);
                            i = 218789578;
                        }
                        i7 = iM2566 ^ i;
                        break;
                }
                return;
            }
            iM6981 = (i3 - C2105.m6981("ۛ۬")) * 19;
            i5 = ((iM6981 ^ i4) * 7973) ^ (-665774626);
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
    
        if (l.C1711.f5919 != false) goto L14;
     */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        int iM6981;
        int i2;
        int i3;
        Paint paint2;
        int iM6982;
        Paint paint3;
        int i4;
        int i5;
        int i6 = RunnableC0588.f2309;
        int i7 = C3683.f11629;
        int iM6983 = (C2105.m6981("ۙᩴ") ^ i6) * 49;
        int i8 = ((iM6983 ^ i7) * (-28943)) ^ (-1185857574);
        Paint paint4 = null;
        Paint paint5 = null;
        int i9 = iM6983 ^ (-724246982);
        Paint paint6 = null;
        int i10 = 0;
        int iM1480 = 0;
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
                    paint4 = this.f31296;
                    if (C0382.m1848()) {
                        iM6981 = C2105.m6981("ۚ֨") ^ i7;
                        i2 = ((iM6981 ^ i6) * 4711) ^ (-195061468);
                        i3 = 176943955;
                    } else {
                        iM6981 = (C2105.m6981("ܺ֫") ^ i6) * 127;
                        i2 = ((iM6981 ^ i7) * 25409) ^ 105152140;
                        i3 = -2018761423;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -1820476845:
                case -1520280480:
                    C3683.m11222();
                    if (C7811.f24123 < 0) {
                        paint = paint6;
                        i = i13;
                        iM6981 = C2105.m6981("᩷ۤ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 16625) ^ 79479365;
                        i3 = -1175487471;
                        paint6 = paint;
                        i5 = i;
                        i9 = iM6981 ^ i3;
                        i8 = i2;
                        i12 = i5;
                    }
                    paint = paint6;
                    i = i13;
                    iM6981 = (i7 - C2105.m6981("᩹᩷")) * (-53);
                    i2 = ((iM6981 ^ i6) * (-14251)) ^ (-526034259);
                    i3 = -170925445;
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -1789142690:
                case 719360545:
                    C1916.m6308();
                    C7811.m20844();
                    break;
                case -1632239702:
                case -174461204:
                    paint = paint6;
                    i = i13;
                    strokeWidth2 = paint5.getStrokeWidth() + f3;
                    if (C4075.m12263() <= 0) {
                        iM6981 = (i7 - C2105.m6981("᩹᩷")) * (-53);
                        i2 = ((iM6981 ^ i6) * (-14251)) ^ (-526034259);
                        i3 = -170925445;
                    } else {
                        iM6981 = C2105.m6981("ۨ۠") ^ i7;
                        i2 = ((iM6981 ^ i6) * 23425) ^ 173912584;
                        i3 = 65038122;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -1378182418:
                case 363376029:
                    paint = paint6;
                    i = i13;
                    if (C21923.f70183 != 0) {
                        iM6981 = (i7 - C2105.m6981("᩹᩷")) * (-53);
                        i2 = ((iM6981 ^ i6) * (-14251)) ^ (-526034259);
                        i3 = -170925445;
                    } else {
                        iM6981 = (C2105.m6981("ۙ֡") + i7) * 87;
                        i2 = ((iM6981 ^ i6) * (-10865)) ^ 141000102;
                        i3 = 1229116991;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -831392527:
                case 885355637:
                    paint = paint6;
                    i = i13;
                    iM1480 = C0237.m1480(this);
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("᩸ᩴ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 7991) ^ (-1021846303);
                        i3 = 176491264;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ۘ۬")) * 55;
                        i2 = ((iM6981 ^ i6) * 20771) ^ (-1702450624);
                        i3 = -1729593869;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -551664896:
                case -32708432:
                    C2126.m7040();
                    break;
                case -530425106:
                case 1227295459:
                    C4075.m12263();
                    if (C4075.m12263() > 0) {
                        paint = paint6;
                        i = i13;
                        iM6981 = C2105.m6981("ۚ֨") ^ i7;
                        i2 = ((iM6981 ^ i6) * 4711) ^ (-195061468);
                        i3 = 176943955;
                        paint6 = paint;
                        i5 = i;
                        i9 = iM6981 ^ i3;
                        i8 = i2;
                        i12 = i5;
                    }
                    paint = paint6;
                    i = i13;
                    iM6981 = C0630.m2566("᩸ᩴ") ^ i6;
                    i2 = ((iM6981 ^ i7) * 7991) ^ (-1021846303);
                    i3 = 176491264;
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -465710637:
                case 290581136:
                    paint = paint6;
                    i = i13;
                    strokeWidth = paint4.getStrokeWidth();
                    if (C3663.f11553) {
                        iM6981 = C2105.m6981("᩷ۤ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 16625) ^ 79479365;
                        i3 = -1175487471;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ܺܺ")) * 57;
                        i2 = ((iM6981 ^ i7) * (-29823)) ^ (-1576934342);
                        i3 = 9077229;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -437609987:
                case 1468837546:
                    paint2 = paint6;
                    i = i13;
                    paint2.setColor(i10);
                    if (C11340.f33930 < 0) {
                        paint = paint2;
                        iM6981 = C0630.m2566("ۡۜ") ^ i6;
                        i2 = ((iM6981 ^ i7) * (-25085)) ^ (-2090592881);
                        i3 = -1388423231;
                        paint6 = paint;
                        i5 = i;
                        i9 = iM6981 ^ i3;
                        i8 = i2;
                        i12 = i5;
                    }
                    iM6982 = C2105.m6981("ܿۙ") ^ i7;
                    paint3 = paint2;
                    i8 = ((iM6982 ^ i6) * (-7555)) ^ 2110050389;
                    i4 = -1113576332;
                    paint6 = paint3;
                    i5 = i;
                    i9 = iM6982 ^ i4;
                    i12 = i5;
                    break;
                case -243467863:
                case 538425587:
                    C2105.m6982();
                    C4117.m12364();
                    paint = paint6;
                    i = i13;
                    iM6981 = (i7 - C2105.m6981("᩹᩷")) * (-53);
                    i2 = ((iM6981 ^ i6) * (-14251)) ^ (-526034259);
                    i3 = -170925445;
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -171201842:
                case 1464620438:
                    paint = paint6;
                    i = i13;
                    f3 = this.f31297;
                    paint5 = this.f31296;
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("ۚ֨") ^ i7;
                        i2 = ((iM6981 ^ i6) * 4711) ^ (-195061468);
                        i3 = 176943955;
                    } else {
                        iM6981 = C0630.m2566("᩺᩺") ^ i6;
                        i2 = ((iM6981 ^ i7) * 26947) ^ (-2036828992);
                        i3 = 122507077;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -144213441:
                case 1841075597:
                    i = i13;
                    paint = paint6;
                    canvas.drawCircle(f2, strokeWidth2, this.f31297, this.f31296);
                    iM6981 = C0630.m2566("ۜܿ") ^ i6;
                    i2 = ((iM6981 ^ i7) * 19183) ^ 1819452788;
                    i3 = -923066725;
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case -115276612:
                case 269739372:
                    paint = paint6;
                    i = i13;
                    i11 = iM1480 - this.f31297;
                    if (C2105.m6982() != 0) {
                        iM6981 = C0630.m2566("᩸ᩴ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 7991) ^ (-1021846303);
                        i3 = 176491264;
                    } else {
                        iM6981 = C2105.m6981("ᩳܳ") ^ i7;
                        i2 = ((iM6981 ^ i6) * (-20649)) ^ 1576024620;
                        i3 = 711413116;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                case 39397690:
                case 1214443866:
                    paint = paint6;
                    i = i13;
                    f2 = f - strokeWidth;
                    if (C0714.f2697 < 0) {
                        iM6981 = C0630.m2566("ܺ۫") ^ i7;
                        i2 = ((iM6981 ^ i6) * 32301) ^ 320720431;
                        i3 = -1546947958;
                        paint6 = paint;
                        i5 = i;
                        i9 = iM6981 ^ i3;
                        i8 = i2;
                        i12 = i5;
                    } else {
                        paint2 = paint;
                        iM6982 = C2105.m6981("ܿۙ") ^ i7;
                        paint3 = paint2;
                        i8 = ((iM6982 ^ i6) * (-7555)) ^ 2110050389;
                        i4 = -1113576332;
                        paint6 = paint3;
                        i5 = i;
                        i9 = iM6982 ^ i4;
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
                    if (this.f31299) {
                        iM6981 = (C2105.m6981("᩸᩻") + i7) * 61;
                        i2 = ((iM6981 ^ i6) * (-5649)) ^ (-623627492);
                        i3 = -1127543455;
                    } else {
                        iM6981 = C0630.m2566("ۜܿ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 19183) ^ 1819452788;
                        i3 = -923066725;
                    }
                    paint6 = paint;
                    i5 = i;
                    i9 = iM6981 ^ i3;
                    i8 = i2;
                    i12 = i5;
                    break;
                default:
                    i = i13;
                    Paint paint7 = this.f31296;
                    i10 = C21943.f70293;
                    if (RunnableC3474.f10992 > 0) {
                        iM6982 = (C0630.m2566("᩸ܿ") + i6) * (-83);
                        paint3 = paint7;
                        i8 = ((iM6982 ^ i7) * (-29169)) ^ (-324136310);
                        i4 = -137027261;
                        paint6 = paint3;
                        i5 = i;
                        i9 = iM6982 ^ i4;
                        i12 = i5;
                    } else {
                        paint = paint7;
                        iM6981 = C2105.m6981("᩷ۤ") ^ i6;
                        i2 = ((iM6981 ^ i7) * 16625) ^ 79479365;
                        i3 = -1175487471;
                        paint6 = paint;
                        i5 = i;
                        i9 = iM6981 ^ i3;
                        i8 = i2;
                        i12 = i5;
                    }
                    break;
            }
            return;
        }
    }
}
